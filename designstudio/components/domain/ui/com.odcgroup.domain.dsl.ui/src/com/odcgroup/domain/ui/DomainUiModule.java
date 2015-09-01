/*
 * generated by Xtext
 */
package com.odcgroup.domain.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.containers.IAllContainersState.Provider;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.outline.actions.IOutlineContribution;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineFilterAndSorter.IComparator;

import com.google.inject.Binder;
import com.google.inject.name.Names;
import com.odcgroup.domain.ui.actions.CollapseAllAction;
import com.odcgroup.domain.ui.actions.ExpandAllAction;
import com.odcgroup.domain.ui.coloring.DomainDSLAntlrTokenToAttributeIdMapper;
import com.odcgroup.domain.ui.coloring.DomainDSLHighlightingConfiguration;
import com.odcgroup.workbench.core.xtext.v26_ds7527.ContainerStateProvider;
import com.odcgroup.workbench.core.xtext.v26_ds7527.LiveShadowedResourceDescriptions;

/**
 * Use this class to register components to be used within the IDE.
 */
public class DomainUiModule extends
		com.odcgroup.domain.ui.AbstractDomainUiModule {
	public DomainUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends XtextEditor> bindEditor() {
		return DomainDSLEditor.class;
	}

	public Class<? extends IFoldingRegionProvider> bindIFoldingStructureProvider() {
		return DomainDSLFoldingRegionProvider.class;
	}
	
	public Class<? extends IComparator> bindOutlineFilterAndSorter$IComparator() {
	        return DomainDSLOutlineNodeComparator.class;
	}
	
	public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return DomainDSLAntlrTokenToAttributeIdMapper.class;
	}
	
	public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return DomainDSLHighlightingConfiguration.class;
	}
	
	public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
		// return your version of the NatureAddingEditorCallback
		return DomainDSLNatureAddingEditorCallback.class;
		}
	
	public Class<? extends IContentOutlinePage> bindIContentOutlinePage() {
		return DomainDSLContentOutlinePage.class;
	}
	
	public void configureExpandAction(Binder binder) {
		  binder.bind(IOutlineContribution.class).annotatedWith(Names.named("expandOutline")).to(ExpandAllAction.class);
		  
	}
	
	public void configureCollapseAction(Binder binder) {
		binder.bind(IOutlineContribution.class).annotatedWith(Names.named("collapseOutline")).to(CollapseAllAction.class);
	}
	
	// DS-7435 (DS-7397) req. for Elang
	@SuppressWarnings("restriction")
	public Class<? extends org.eclipse.xtext.common.types.access.IJvmTypeProvider.Factory> bindIJvmTypeProvider$Factory() {
		return org.eclipse.xtext.common.types.access.jdt.JdtTypeProviderFactory.class; // NOT CachingClasspathTypeProviderFactory
	}
	
	/**
	 * TODO: remove this method after migration to Xtext 2.6 or later
	 * @see http://rd.oams.com/browse/DS-7527
	 */
	@Override
	public Class<? extends Provider> bindIAllContainersState$Provider() {
		return ContainerStateProvider.class;
	}
	
	/**
	 * TODO: remove this method after migration to Xtext 2.6 or later
	 * @see http://rd.oams.com/browse/DS-7527
	 */
	@Override
	public void configureIResourceDescriptionsLiveScope(Binder binder) {
		binder.bind(IResourceDescriptions.class).annotatedWith(Names.named(ResourceDescriptionsProvider.LIVE_SCOPE)).to(LiveShadowedResourceDescriptions.class);
	}
	
	@Override
	public void configureMarkOccurrencesAction(Binder binder) {
	}
	
}
