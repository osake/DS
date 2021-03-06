package com.odcgroup.t24.server.properties.ui;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EventObject;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.ui.MarkerHelper;
import org.eclipse.emf.common.ui.ViewerPane;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.util.EditUIMarkerHelper;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.part.FileEditorInput;

import com.odcgroup.t24.server.properties.server.Server;
import com.odcgroup.t24.server.properties.server.util.ServerAdapterFactory;
import com.odcgroup.t24.server.properties.wizards.ServerPropertiesConnectionTypePage;
import com.odcgroup.workbench.core.IOfsProject;
import com.odcgroup.workbench.core.repository.ModelURIConverter;

/**
 *
 */
public class ServerFormEditor extends FormEditor implements
		IEditingDomainProvider, IViewerProvider, IMenuListener {

	/**
	 * This keeps track of the editing domain that is used to track all changes
	 * to the model.
	 */
	protected AdapterFactoryEditingDomain editingDomain;

	/**
	 * This is the one adapter factory used for providing views of the model.
	 */
	protected ComposedAdapterFactory adapterFactory;

	

	/**
	 * This keeps track of the active viewer pane, in the book.
	 */
	protected ViewerPane currentViewerPane;

	/**
	 * This keeps track of the active content viewer, which is one of the
	 * viewers in the pages.
	 */
	protected Viewer currentViewer;

	/**
	 * This keeps track of the selection of the editor as a whole.
	 */
	protected ISelection editorSelection = StructuredSelection.EMPTY;

	/**
	 * The MarkerHelper is responsible for creating workspace resource markers
	 * presented in Eclipse's Problems View.
	 */
	protected MarkerHelper markerHelper = new EditUIMarkerHelper();
	
	private FormPage formPage = null;

	private URI resourceURI = null;
	
	private Resource resource = null;
	
	private IOfsProject ofsProject = null;
	
	private boolean dirty = false;
	
	private boolean connectionTypeSelected = false;

	/**
	 * This listens for when the outline becomes active
	 */
	protected IPartListener partListener = new IPartListener() {
		public void partActivated(IWorkbenchPart p) {
			if (p == ServerFormEditor.this) {
				handleActivate();
			}
		}

		public void partBroughtToTop(IWorkbenchPart p) {
			// Ignore.
		}

		public void partClosed(IWorkbenchPart p) {
			// Ignore.
		}

		public void partDeactivated(IWorkbenchPart p) {
			// Ignore.
		}

		public void partOpened(IWorkbenchPart p) {
			// Ignore.
		}
	};

	/**
	 * Resources that have been removed since last activation.
	 */
	protected Collection<Resource> removedResources = new ArrayList<Resource>();

	/**
	 * Resources that have been changed since last activation.
	 */
	protected Collection<Resource> changedResources = new ArrayList<Resource>();

	/**
	 * Resources that have been saved.
	 */
	protected Collection<Resource> savedResources = new ArrayList<Resource>();

	/**
	 * Map to store the diagnostic associated with a resource.
	 */
	protected Map<Resource, Diagnostic> resourceToDiagnosticMap = new LinkedHashMap<Resource, Diagnostic>();

	/**
	 * Controls whether the problem indication should be updated.
	 */
	protected boolean updateProblemIndication = true;

	/**
	 * Adapter used to update the problem indication when resources are demanded
	 * loaded.
	 */
	protected EContentAdapter problemIndicationAdapter = new EContentAdapter() {
		@Override
		public void notifyChanged(Notification notification) {
			if (notification.getNotifier() instanceof Resource) {
				switch (notification.getFeatureID(Resource.class)) {
				case Resource.RESOURCE__IS_LOADED:
				case Resource.RESOURCE__ERRORS:
				case Resource.RESOURCE__WARNINGS: {
					Resource resource = (Resource) notification.getNotifier();
					Diagnostic diagnostic = analyzeResourceProblems(resource,
							null);
					if (diagnostic.getSeverity() != Diagnostic.OK) {
						resourceToDiagnosticMap.put(resource, diagnostic);
					} else {
						resourceToDiagnosticMap.remove(resource);
					}

					if (updateProblemIndication) {
						getSite().getShell().getDisplay()
								.asyncExec(new Runnable() {
									public void run() {
										updateProblemIndication();
									}
								});
					}
					break;
				}
				}
			} else {
				super.notifyChanged(notification);
			}
		}

		@Override
		protected void setTarget(Resource target) {
			basicSetTarget(target);
		}

		@Override
		protected void unsetTarget(Resource target) {
			basicUnsetTarget(target);
		}
	};

	/**
	 * This listens for workspace changes.
	 */
	protected IResourceChangeListener resourceChangeListener = new IResourceChangeListener() {
		public void resourceChanged(IResourceChangeEvent event) {
			IResourceDelta delta = event.getDelta();
			try {
				class ResourceDeltaVisitor implements IResourceDeltaVisitor {
					protected ResourceSet resourceSet = editingDomain
							.getResourceSet();
					protected Collection<Resource> changedResources = new ArrayList<Resource>();
					protected Collection<Resource> removedResources = new ArrayList<Resource>();

					public boolean visit(IResourceDelta delta) {
						if (delta.getResource().getType() == IResource.FILE) {
							if (delta.getKind() == IResourceDelta.REMOVED
									|| delta.getKind() == IResourceDelta.CHANGED
									&& delta.getFlags() != IResourceDelta.MARKERS) {
								
								URI uri = ModelURIConverter.createModelURI((IResource)delta.getResource());
								Resource resource = resourceSet.getResource(uri, false);
								if (resource != null) {
									if (delta.getKind() == IResourceDelta.REMOVED) {
										removedResources.add(resource);
									} else if (!savedResources.remove(resource)) {
										changedResources.add(resource);
									}
								}
							}
						}

						return true;
					}

					public Collection<Resource> getChangedResources() {
						return changedResources;
					}

					public Collection<Resource> getRemovedResources() {
						return removedResources;
					}
				}

				final ResourceDeltaVisitor visitor = new ResourceDeltaVisitor();
				delta.accept(visitor);

				if (!visitor.getRemovedResources().isEmpty()) {
					getSite().getShell().getDisplay().asyncExec(new Runnable() {
						public void run() {
							removedResources.addAll(visitor
									.getRemovedResources());
							if (!isDirty()) {
								getSite().getPage().closeEditor(ServerFormEditor.this,
										false);
							}
						}
					});
				}

				if (!visitor.getChangedResources().isEmpty()) {
					getSite().getShell().getDisplay().asyncExec(new Runnable() {
						public void run() {
							changedResources.addAll(visitor
									.getChangedResources());
							if (getSite().getPage().getActiveEditor() == ServerFormEditor.this) {
								handleActivate();
							}
							handleActivate();
						}
					});
				}
			} catch (CoreException exception) {
				//T24ServerPropertiesActivator.getDefault().logError(exception.getLocalizedMessage(), exception);
			}
		}
	};

	/**
	 * Handles activation of the editor or it's associated views.
	 */
	protected void handleActivate() {
		// Recompute the read only state.
		//
		if (editingDomain.getResourceToReadOnlyMap() != null) {
			editingDomain.getResourceToReadOnlyMap().clear();
		}		

		if (!removedResources.isEmpty()) {
			removedResources.clear();
			changedResources.clear();
			savedResources.clear();
		} else if (!changedResources.isEmpty()) {
			changedResources.removeAll(savedResources);
			handleChangedResources();
			changedResources.clear();
			savedResources.clear();
		}
	}	

    protected boolean changeFromOtherTab = false;

	private Server server;

	private int page;

	/**
	 * Handles what to do with changed resources on activation.
	 */
	protected void handleChangedResources() {
		if (!changedResources.isEmpty() && changeFromOtherTab) {
    		updateToResourcechanges();
    		changeFromOtherTab = false;
    		return;
    	}

        if (!changedResources.isEmpty()
                && (!isDirty()) && resource != null) {        	
        	String msg = "The resource \'"+ resource.getURI().toString()+" has been changed " +
	 			"on the file system. Do you want to replace the editor contents with these changes?";
        	if(MessageDialog.openConfirm(getSite().getShell(), "Resource Changed", msg)) { 
        		updateToResourcechanges();
        	}
        }
	}
	

	/**
	 * 
	 */
	private void updateToResourcechanges() {
    	editingDomain.getCommandStack().flush();    	
        updateProblemIndication = false;
        for(Resource resource : changedResources) {
            if (resource.isLoaded()) {
                resource.unload();
                try {
                    resource.load(Collections.EMPTY_MAP);
                    String currentSelected = "Agent_Connection";
					if(currentSelected .equals("Agent_Connection"))
    					((ServerFormPageAgentConnPage)formPage).refreshBindings(server);
    				else{
    					((ServerFormPageWebServicePage)formPage).refreshBindings(server); 
    				}
                } catch (IOException exception) {
                    if (!resourceToDiagnosticMap.containsKey(resource)) {
                        resourceToDiagnosticMap.put(
                                resource,
                                analyzeResourceProblems(resource, exception));
                    }
                }
            }
        }
        updateProblemIndication = true;
        updateProblemIndication();
		
	}


	/**
	 * Updates the problems indication with the information described in the
	 * specified diagnostic
	 */
	protected void updateProblemIndication() {
		//this is to be added for marking any problems.. error handling to be done
	}
	

	/**
	 * Shows a dialog that asks if conflicting changes should be discarded.
	 */
	protected boolean handleDirtyConflict() {
		return MessageDialog.openQuestion(getSite().getShell(),
				getString("_UI_FileConflict_label"),
				getString("_WARN_FileConflict"));
	}

	/**
	 * This creates a model editor.
	 * @param server 
	 */
	public ServerFormEditor(Server server) {
		super();
		initializeEditingDomain();
		this.server = server;
	}

	/**
	 * This sets up the editing domain for the model editor.
	 */
	protected void initializeEditingDomain() {
		// Create an adapter factory that yields item providers.
		//
		adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory
				.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ServerAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		// Create the command stack that will notify this editor as commands are
		// executed.
		//
		BasicCommandStack commandStack = new BasicCommandStack();

		// Add a listener to set the most recent command's affected objects to
		// be the selection of the viewer with focus.
		//
		commandStack.addCommandStackListener(new CommandStackListener() {
			public void commandStackChanged(final EventObject event) {
				getContainer().getDisplay().asyncExec(new Runnable() {
					public void run() {
						firePropertyChange(IEditorPart.PROP_DIRTY);

						// Try to select the affected objects.
						//
						Command mostRecentCommand = ((CommandStack) event
								.getSource()).getMostRecentCommand();
						if (mostRecentCommand != null) {
							setSelectionToViewer(mostRecentCommand
									.getAffectedObjects());
						}
						if (currentViewer != null
								&& !currentViewer.getControl().isDisposed()) {
						}
					}
				});
			}
		});

		// Create the editing domain with a special command stack.
		//
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory,
				commandStack, new HashMap<Resource, Boolean>());
	}

	/**
	 * This sets the selection into whichever viewer is active.
	 */
	public void setSelectionToViewer(Collection<?> collection) {
		final Collection<?> theSelection = collection;
		// Make sure it's okay.
		//
		if (theSelection != null && !theSelection.isEmpty()) {
			Runnable runnable = new Runnable() {
				public void run() {
					// Try to select the items in the current content viewer of
					// the editor.
					//
					if (currentViewer != null) {
						currentViewer.setSelection(new StructuredSelection(theSelection.toArray()), true);
					}
				}
			};
			getSite().getShell().getDisplay().asyncExec(runnable);
		}
	}

	/**
	 * This returns the editing domain as required by the
	 * {@link IEditingDomainProvider} interface. This is important for
	 * implementing the static methods of {@link AdapterFactoryEditingDomain}
	 * and for supporting {@link org.eclipse.emf.edit.ui.action.CommandAction}.
	 */
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	/**
	 */
	public void setCurrentViewerPane(ViewerPane viewerPane) {
		if (currentViewerPane != viewerPane) {
			if (currentViewerPane != null) {
				currentViewerPane.showFocus(false);
			}
			currentViewerPane = viewerPane;
		}
		setCurrentViewer(currentViewerPane.getViewer());
	}

	/**
	 * This makes sure that one content viewer, either for the current page or
	 * the outline view, if it has focus, is the current one.
	 */
	public void setCurrentViewer(Viewer viewer) {
		if (currentViewer != viewer) {
			currentViewer = viewer;
		}
	}

	/**
	 * This returns the viewer as required by the {@link IViewerProvider}
	 * interface.
	 */
	public Viewer getViewer() {
		return currentViewer;
	}

	/**
	 * This is the method called to load a resource into the editing domain's
	 * resource set based on the editor's input.
	 */
	public void createModel() {
		Exception exception = null;
		IEditorInput editorInput = getEditorInput();
		
		
		if (editorInput instanceof IFileEditorInput) {
			IFileEditorInput fileInput = (IFileEditorInput) editorInput;
			IFile file = fileInput.getFile();
				editingDomain.getResourceSet().setURIConverter(editingDomain.getResourceSet().getURIConverter());
				resourceURI = ModelURIConverter.createModelURI((IResource) file);
		} else {
			resourceURI = EditUIUtil.getURI(getEditorInput());
		}
		
		try {
			// Load the resource through the editing domain
			resource = editingDomain.getResourceSet().getResource(resourceURI, true);
		} catch (Exception e) {
			exception = e;
		}

		Diagnostic diagnostic = analyzeResourceProblems(resource, exception);
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			resourceToDiagnosticMap.put(resource, analyzeResourceProblems(resource, exception));
		}
		editingDomain.getResourceSet().eAdapters().add(problemIndicationAdapter);
	}

	/**
	 * Returns a diagnostic describing the errors and warnings listed in the
	 * resource and the specified exception (if any).
	 */
	public Diagnostic analyzeResourceProblems(Resource resource,
			Exception exception) {
		if (resource != null 
				&& (!resource.getErrors().isEmpty()
				    || !resource.getWarnings().isEmpty())) {
			BasicDiagnostic basicDiagnostic = new BasicDiagnostic(
					Diagnostic.ERROR,
					"com.odcgroup.t24.version.editor",
					0,
					getString("_UI_CreateModelError_message", resource.getURI()),
					new Object[] { exception == null ? (Object) resource
							: exception });
			basicDiagnostic.merge(EcoreUtil.computeDiagnostic(resource, true));
			return basicDiagnostic;
		} else if (exception != null) {
			return new BasicDiagnostic(
					Diagnostic.ERROR,
					"org.eclipse.xtext.example.domainmodel.editor",
					0,
					getString("_UI_CreateModelError_message", resource != null ? resource.getURI() : "NO RESOURCE"),
					new Object[] { exception });
		} else {
			return Diagnostic.OK_INSTANCE;
		}
	}

	@Override
	protected void addPages() {
		createPages();
	}

	/**
	 * This is the method used by the framework to install your own controls.
	 */
	@Override
	public void createPages() {
		// Creates the model from the editor input
		//
		createModel();
		//((CTabFolder) getContainer()).

		// Only creates the other pages if there is something that can be edited
		//
		if (!getEditingDomain().getResourceSet().getResources().isEmpty()) {
			// Create a page for the selection tree view.
			//
			// This is the master details page
			{
				if(this.getEditorInput() instanceof FileEditorInput){
					IFile file = ((FileEditorInput) this.getEditorInput()).getFile();
					IPath fullPath = file.getLocation();
					File tempFile = fullPath.toFile();
					if (tempFile.exists()) {
						try {
							FileInputStream fstream = new FileInputStream(
									fullPath.toString());
							DataInputStream in = new DataInputStream(fstream);
							BufferedReader br = new BufferedReader(
									new InputStreamReader(in));
							String strLine = null;
							// Read File Line By Line
							while ((strLine = br.readLine()) != null) {
								if(strLine.startsWith("agent.port") && ServerPropertiesConnectionTypePage.currentSelected == null){
									ServerPropertiesConnectionTypePage.currentSelected = "Agent_Connection";
									formPage = new ServerFormPageAgentConnPage(this, "server.properties", "Form", server);
									break;
								}else if(strLine.startsWith("ws.port") && ServerPropertiesConnectionTypePage.currentSelected == null){
									ServerPropertiesConnectionTypePage.currentSelected = "WebServices";
									formPage = new ServerFormPageWebServicePage(this, "server.properties", "Form", server);
									break;
								}
							}
							in.close();
						} catch (Exception e) {
							MessageDialog.openError(getContainer().getShell(), "Cannot open the server properties file", "Problem with the file. Missing required contents.");
						}
					}
				}
				if (ServerPropertiesConnectionTypePage.currentSelected != null) {
					if (ServerPropertiesConnectionTypePage.currentSelected.equals("Agent_Connection"))
						formPage = new ServerFormPageAgentConnPage(this, "server.properties", "Form", server);
					else {
						formPage = new ServerFormPageWebServicePage(this, "server.properties", "Form", server);
					}
				} else {
					ServerPropertiesConnectionTypePage.currentSelected = "Agent_Connection";
					formPage = new ServerFormPageAgentConnPage(this, "server.properties", "Form", server);
					connectionTypeSelected = true;
				}
				try {
					addPage(formPage);
				} catch (PartInitException e) {
					MessageDialog.openError(getContainer().getShell(), "Error", "Problem with the file. Missing required contents.");
				}
			}

			getSite().getShell().getDisplay().asyncExec(new Runnable() {
				public void run() {
					if (pages != null) {
						setActivePage(0);
					}
				}
			});
		}

		// Ensures that this editor will only display the page's tab
		// area if there are more than one page
		//
		getContainer().addControlListener(new ControlAdapter() {
			boolean guard = false;
			
			@Override
			public void controlResized(ControlEvent event) {
				if (!guard) {
					guard = true;
					hideTabs();
					guard = false;
				}
			}
		});

		getSite().getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				updateProblemIndication();
			}
		});
	}

	/**
	 * If there is just one page in the multi-page editor part, this hides the
	 * single tab at the bottom.
	 */
	protected void hideTabs() {
		if (getPageCount() <= 1) {
			setPageText(0, "");
			if (getContainer() instanceof CTabFolder) {
				((CTabFolder) getContainer()).setTabHeight(1);
				Point point = getContainer().getSize();
				getContainer().setSize(point.x, point.y + 6);
			}
		}
	}

	/**
	 * If there is more than one page in the multi-page editor part, this shows
	 * the tabs at the bottom.
	 */
	protected void showTabs() {
		if (getPageCount() > 1) {
			setPageText(0, getString("_UI_SelectionPage_label"));
			if (getContainer() instanceof CTabFolder) {
				((CTabFolder) getContainer()).setTabHeight(SWT.DEFAULT);
				Point point = getContainer().getSize();
				getContainer().setSize(point.x, point.y - 6);
			}
		}
	}

	/**
	 * This is used to track the active viewer.
	 */
	@Override
	protected void pageChange(int pageIndex) {
		super.pageChange(pageIndex);
	}

	/**
	 * This is how the framework determines which interfaces we implement.
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class key) {
		return super.getAdapter(key);
	}

	/**
	 * This is for implementing {@link IEditorPart} and simply tests the command
	 * stack.
	 */
	@Override
	public boolean isDirty() {
		if (dirty) return true;
		return  ((BasicCommandStack) editingDomain.getCommandStack()).isSaveNeeded();
	}

	/**
	 * This is for implementing {@link IEditorPart} and simply saves the model
	 * file.
	 */
	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		// Save only resources that have actually changed.
		//
		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);

		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				new IWorkspaceRunnable() {
					public void run(IProgressMonitor monitor) throws CoreException {
					try {
							Resource savedResource = (Resource) editingDomain.getResourceSet().getResources().get(0);
							savedResources.add(savedResource);
							savedResource.save(saveOptions);
							dirty = false;
						} catch (Exception exception) {
							exception.printStackTrace();
							//T24ServerPropertiesActivator.getDefault().logError(exception.getLocalizedMessage(), exception);
						} finally {
							monitor.done();
						}
					}
				};
				
				monitor.done();
				
			}
		};

		try {
			
			// This runs the options, and shows progress.
			new ProgressMonitorDialog(getSite().getShell()).run(true, false, op);

			// Refresh the necessary state.
			((BasicCommandStack)editingDomain.getCommandStack()).saveIsDone();
			firePropertyChange(IEditorPart.PROP_DIRTY);

		}
		
		catch (Exception exception) {
			System.out.println(exception);
			//T24ServerPropertiesActivator.getDefault().logError(exception.getLocalizedMessage(), exception);
		}
	}

	/**
	 * This returns whether something has been persisted to the URI of the
	 * specified resource. The implementation uses the URI converter from the
	 * editor's resource set to try to open an input stream.
	 */
	protected boolean isPersisted(Resource resource) {
		boolean result = false;
		try {
			InputStream stream = editingDomain.getResourceSet()
					.getURIConverter().createInputStream(resource.getURI());
			if (stream != null) {
				result = true;
				stream.close();
			}
		} catch (IOException e) {
			// Ignore
		}
		return result;
	}

	/**
	 * This always returns true because it is not currently supported.
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	 * This also changes the editor's input.
	 */
	@Override
	public void doSaveAs() {
		SaveAsDialog saveAsDialog = new SaveAsDialog(getSite().getShell());
		saveAsDialog.open();
		IPath path = saveAsDialog.getResult();
		if (path != null) {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			if (file != null) {
				doSaveAs(URI.createPlatformResourceURI(file.getFullPath()
						.toString(), true), new FileEditorInput(file));
			}
		}
	}

	/**
*/
	protected void doSaveAs(URI uri, IEditorInput editorInput) {
		(editingDomain.getResourceSet().getResources().get(0)).setURI(uri);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
		IProgressMonitor progressMonitor = getActionBars()
				.getStatusLineManager() != null ? getActionBars()
				.getStatusLineManager().getProgressMonitor()
				: new NullProgressMonitor();
		doSave(progressMonitor);
	}

	/**
	 * This is called during startup.
	 */
	@Override
	public void init(IEditorSite site, IEditorInput editorInput) {
		setSite(site);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
		site.getPage().addPartListener(partListener);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(
				resourceChangeListener, IResourceChangeEvent.POST_CHANGE);
	}

	/**
*/
	@Override
	public void setFocus() {
		if (currentViewerPane != null) {
			currentViewerPane.setFocus();
		} else {
			getControl(getActivePage()).setFocus();
			try {
				((FileEditorInput) getEditorInput()).getFile().refreshLocal(
						IWorkspaceRoot.DEPTH_INFINITE, null);
			} catch (CoreException e) {
				//logger
			}
		}
	}

	/**
*/
	public void setStatusLineManager(ISelection selection) {
		IStatusLineManager statusLineManager = getActionBars()
				.getStatusLineManager();

		if (statusLineManager != null) {
			if (selection instanceof IStructuredSelection) {
				Collection<?> collection = ((IStructuredSelection) selection)
						.toList();
				switch (collection.size()) {
				case 0: {
					statusLineManager
							.setMessage(getString("_UI_NoObjectSelected"));
					break;
				}
				case 1: {
					String text = new AdapterFactoryItemDelegator(
							adapterFactory).getText(collection.iterator()
							.next());
					statusLineManager.setMessage(getString(
							"_UI_SingleObjectSelected", text));
					break;
				}
				default: {
					statusLineManager.setMessage(getString(
							"_UI_MultiObjectSelected",
							Integer.toString(collection.size())));
					break;
				}
				}
			} else {
				statusLineManager.setMessage("");
			}
		}
	}

	/**
	 * This looks up a string in the plugin's plugin.properties file.
	 */
	private static String getString(String key) {
		return "Model Changed";
				//T24ServerPropertiesActivator.getDefault().getString(key);
	}

	/**
	 * This looks up a string in plugin.properties, making a substitution.
	 */
	private static String getString(String key, Object s1) {
		return "Model Changed";
				//T24ServerPropertiesActivator.getDefault().getString(key, new Object[] { s1 });
	}

	/**
	 * This implements {@link org.eclipse.jface.action.IMenuListener} to help
	 * fill the context menus with contributions from the Edit menu.
	 */
	public void menuAboutToShow(IMenuManager menuManager) {
		((IMenuListener) getEditorSite().getActionBarContributor()).menuAboutToShow(menuManager);
	}

	/**
*/
	public EditingDomainActionBarContributor getActionBarContributor() {
		return (EditingDomainActionBarContributor) getEditorSite()
				.getActionBarContributor();
	}

	/**
*/
	public IActionBars getActionBars() {
		return getActionBarContributor().getActionBars();
	}

	/**
*/
	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	/**
*/
	@Override
	public void dispose() {
		updateProblemIndication = false;

		ResourcesPlugin.getWorkspace().removeResourceChangeListener(
				resourceChangeListener);

		getSite().getPage().removePartListener(partListener);

		adapterFactory.dispose();	
		super.dispose();
	}
	
	protected int getPageIndex(Server server) {
		return 0;
	}
	
	protected int getPageIndex(Object owner) {
		int pageIndex = -1; // unknown page index
		if (owner instanceof Server) {
			pageIndex = getPageIndex((Server)owner);
		} 
		return pageIndex;
	}
	
	/**
	 * @return
	 */
	public Resource getEditedResource() {
		return this.resource;
	}
	
	/**
	 * @return
	 */
	public IOfsProject getOfsProject() {
		return ofsProject;
	}


	public void refresh() {
		if (!getEditingDomain().getResourceSet().getResources().isEmpty()) {
			// Create a page for the selection tree view.
			//
			// This is the master details page
			{
				
				if (page == 1)
					formPage = new ServerFormPageAgentConnPage(this,
							"server.properties", "Form", server);
				else {
					formPage = new ServerFormPageWebServicePage(this,
							"server.properties", "Form", server);
				}
				try {
					this.removePage(0);
					addPage(0, formPage);
					this.setActivePage(0);
				} catch (PartInitException e) {
					//logger
				}
			}

			getSite().getShell().getDisplay().asyncExec(new Runnable() {
				public void run() {
					setActivePage(0);
				}
			});
		}

	}


	public void setPage(int page) {
		this.page = page;
	}


	/**
	 * @return the connectionTypeSelected
	 */
	public boolean isConnectionTypeSelected() {
		return connectionTypeSelected;
	}

	/**
	 * @param connectionTypeSelected the connectionTypeSelected to set
	 */
	public void setConnectionTypeSelected(boolean connectionTypeSelected) {
		this.connectionTypeSelected = connectionTypeSelected;
	}
}
