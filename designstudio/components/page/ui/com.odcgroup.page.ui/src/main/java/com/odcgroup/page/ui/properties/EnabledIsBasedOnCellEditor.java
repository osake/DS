package com.odcgroup.page.ui.properties;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.odcgroup.mdf.ecore.util.DomainRepository;
import com.odcgroup.mdf.metamodel.MdfName;
import com.odcgroup.mdf.metamodel.MdfNameFactory;
import com.odcgroup.page.domain.filter.DomainFilter;
import com.odcgroup.page.domain.filter.DomainFilterEnum;
import com.odcgroup.page.domain.filter.DomainFilterHelper;
import com.odcgroup.page.metamodel.PropertyTypeConstants;
import com.odcgroup.page.model.Property;
import com.odcgroup.page.model.Widget;
import com.odcgroup.page.model.properties.enabled.EnabledIsBaseOnCondition;
import com.odcgroup.page.ui.util.EclipseUtils;
import com.odcgroup.page.ui.util.EnabledIsBasedOnDialog;

/**
 * Cell editor for Enabled Is Base On property
 * @author yan
 */
public class EnabledIsBasedOnCellEditor extends DialogCellEditor {
	
	/** The Property*/
	private Property property;
	
	/**
	 * Constructor
	 * 
	 * @param parent 
	 * 			The parent component
	 * @param property
	 * 			The selected property
	 */
    public EnabledIsBasedOnCellEditor(Composite parent, Property property) {
        super(parent);
        this.property = property;
    }

    /**
     * Open dialog window
     * 
     * @param cellEditorWindow 
     * 			The cell editor window
     * @return Object
     */
    protected Object openDialogBox(Control cellEditorWindow) {
    	
    	EnabledIsBaseOnCondition result = getInitialCondition();

    	Widget rw = property.getWidget().getRootWidget();
    	Property entity = rw.findProperty(PropertyTypeConstants.DOMAIN_ENTITY);

    	if (entity != null && StringUtils.isNotEmpty(entity.getValue())) {
    	
    		// Domain Repository
    		DomainRepository repository = 
    			DomainRepository.getInstance(EclipseUtils.findCurrentProject());
    		
    		// Domain Filter
         	DomainFilter filter = DomainFilterHelper.createAcceptFilter(
         			DomainFilterEnum.DATASET_PROPERTY_ATTRIBUTE,
         			DomainFilterEnum.DATASET_DERIVED_PROPERTY_ATTRIBUTE
         			);

    		// Domain name
    		MdfName entityName = MdfNameFactory.createMdfName(entity.getValue());  
        	
    		// Dialog
        	EnabledIsBasedOnDialog dialog = new EnabledIsBasedOnDialog(
        			cellEditorWindow.getShell(), 
        			repository,
        			filter,
        			entityName, 
        			result);
        	
        	// Retrieve Result
        	if (Dialog.OK == dialog.open() ) {
        		result = dialog.getResultCondition();
        	} 
        	
    	} else {
    		
    		// We cannot select an attribute if we cannot find the entity
    		MessageDialog.openError(
    				cellEditorWindow.getShell(), 
    				"Enabled is base on Error", "No Domain Entity defined");
    	}
    	
    	return result;
	    
    }

	/**
	 * @return the initial condition build on the enabledIsBasedOn,
	 *         enabledIsBasedOn-simplified, enabledIsBasedOn-advanced 
	 *         properties
	 */
	private EnabledIsBaseOnCondition getInitialCondition() {
		return new EnabledIsBaseOnCondition(property.getWidget());
	}

	/** (non-Javadoc)
	 * @see org.eclipse.jface.viewers.DialogCellEditor#doSetValue(java.lang.Object)
	 */
	@Override
	protected void doSetValue(Object value) {
		if (value instanceof EnabledIsBaseOnCondition) {
			super.doSetValue(value);
		} else {
			// if the value is not an EnabledIsBasedOnCondition, that means we are
			// receiving the displayed value (attrbute name or "advanced"). In this
			// case we build an EnabledIsBasedOnCondition from the properties
			super.doSetValue(getInitialCondition());
		}
	}
}
