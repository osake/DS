package com.odcgroup.workbench.editors.properties.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Shell;


/**
 *
 * @author pkk
 *
 */
public interface IPropertyDefinitionDialogCreator {
	
	public IPropertyDefinitionDialog createDialog(Shell shell, EObject element, EObject parent, boolean update);

}
