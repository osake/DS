package com.odcgroup.pageflow.editor.diagram.custom.dialog;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;

import com.odcgroup.pageflow.editor.diagram.part.Messages;
import com.odcgroup.pageflow.model.Pageflow;
import com.odcgroup.pageflow.model.PageflowModelLookup;
import com.odcgroup.workbench.core.IOfsProject;
import com.odcgroup.workbench.editors.properties.model.IPropertyFeature;
import com.odcgroup.workbench.editors.properties.model.IPropertySelectionDialog;
import com.odcgroup.workbench.ui.navigator.pageflow.PageflowAdapterFactoryProvider;
import com.odcgroup.workbench.ui.repository.ModelSelectionDialog;

/**
 *
 * @author pkk
 *
 */
public class PageflowSelectionDialog extends ModelSelectionDialog implements IPropertySelectionDialog {

	/**
	 * @param parent
	 * @param elementRenderer
	 * @param qualifierRenderer
	 */
	private PageflowSelectionDialog(Shell parent, ILabelProvider elementRenderer, ILabelProvider qualifierRenderer) {
		super(parent, elementRenderer, qualifierRenderer);
	}
	
	
	/**
	 * @param parent
	 * @param ofsProject
	 * @return
	 */
	public static PageflowSelectionDialog createDialog(Shell parent, IOfsProject ofsProject) {
        PageflowModelLookup lookup = new PageflowModelLookup(ofsProject);
		PageflowSelectionDialog dialog = createDialog(parent, lookup.getAllPageflows());
        dialog.setTitle(Messages.PageflowSelectionDialogTitle);
		return dialog;
	}
	
	/**
	 * @param parent
	 * @return
	 */
	public static PageflowSelectionDialog createDialog(Shell parent, List<Pageflow> elements) {
		ComposedAdapterFactory factory = PageflowAdapterFactoryProvider.getAdapterFactory();
		final ILabelProvider elementRenderer = new AdapterFactoryLabelProvider(factory);

        ILabelProvider qualifierRenderer = new LabelProvider() {

            public Image getImage(Object element) {
                EObject eObject = (EObject) element;
                return elementRenderer.getImage(eObject.eResource());
            }

            public String getText(Object element) {
                EObject eObject = (EObject) element;
                return elementRenderer.getText(eObject.eResource());
            }
        };

        PageflowSelectionDialog dialog = new PageflowSelectionDialog(parent, elementRenderer, qualifierRenderer);
        dialog.setElements(elements.toArray(new Pageflow[0]));
        return dialog;
	}


	/* (non-Javadoc)
	 * @see com.odcgroup.workbench.editors.properties.model.IPropertySelectionDialog#getResultByProperty(com.odcgroup.workbench.editors.properties.model.IPropertyFeature)
	 */
	@Override
	public Object getResultByProperty(IPropertyFeature property) {
		return null;
	}


	/* (non-Javadoc)
	 * @see com.odcgroup.workbench.editors.properties.model.IPropertySelectionDialog#getSelection()
	 */
	@Override
	public Object getSelection() {
		return getFirstResult();
	}

}
