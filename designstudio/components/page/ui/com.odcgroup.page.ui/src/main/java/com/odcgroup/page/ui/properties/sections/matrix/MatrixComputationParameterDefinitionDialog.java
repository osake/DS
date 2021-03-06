package com.odcgroup.page.ui.properties.sections.matrix;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.CommandStack;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import com.odcgroup.page.model.widgets.matrix.IMatrixComputationItem;
import com.odcgroup.page.ui.command.BaseCommand;
import com.odcgroup.page.ui.command.matrix.InsertMatrixItemComputationParameterCommand;
import com.odcgroup.page.ui.command.matrix.UpdateMatrixItemComputationParameterCommand;
import com.odcgroup.page.ui.properties.table.TableDomainObjectUtil;
import com.odcgroup.page.ui.properties.table.controls.ITypeCombo;
import com.odcgroup.page.ui.properties.table.controls.StringValueCombo;
import com.odcgroup.page.ui.properties.table.dialog.TableTransformDialog;

/**
 *
 * @author pkk
 *
 */
public class MatrixComputationParameterDefinitionDialog extends TableTransformDialog {

	/** matrix content cell item */
	private IMatrixComputationItem column;
	
	/** table extra for edit*/
	private String parameterForEdit;

	/** */
	private ITypeCombo<String> columnCombo;

	/**
	 * @param parentShell
	 * @param commandStack
	 * @param column
	 */
	public MatrixComputationParameterDefinitionDialog(Shell parentShell, CommandStack commandStack, IMatrixComputationItem column) {
		super(parentShell, commandStack);
		this.column = column;
	}
	
	/**
	 * @param parentShell
	 * @param commandStack
	 * @param column
	 * @param parameterForEdit
	 */
	public MatrixComputationParameterDefinitionDialog(Shell parentShell, CommandStack commandStack, IMatrixComputationItem column, String parameterForEdit) {
		this(parentShell, commandStack, column);
		this.parameterForEdit = parameterForEdit;
		if (parameterForEdit != null) {
			setEditMode(true);
		}
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.dialogs.Dialog#create()
	 */
	public void create() {
		super.create();
		setTitle("Computation Parameter");
		setMessage("Computation Parameter definitions");
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets.Shell)
	 */
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Computation Parameter");
	}
	

	/**
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.TitleAreaDialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginHeight = 5;
		gridLayout.marginWidth = 5;
		composite.setLayout(gridLayout);

		Composite body = new Group(composite, SWT.SHADOW_ETCHED_IN);
		gridLayout = new GridLayout(2, false);
		body.setLayout(gridLayout);
		body.setLayoutData(new GridData(GridData.FILL_BOTH | GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL));

		new Label(body, SWT.NONE).setText("Parameter");		
		List<String> domainAttributes = TableDomainObjectUtil.getDomainAttributeNames(column.getMatrix());
		columnCombo = new StringValueCombo(body, domainAttributes, getAddedAttributes(column), isEditMode());
		columnCombo.addSelectionListener(this);
		
		if (isEditMode()) {
			columnCombo.select(parameterForEdit);
		} 

		return composite;
	}	
	
	/**
	 * @param column
	 * @return List
	 */
	private List<String> getAddedAttributes(IMatrixComputationItem column) {
		List<String> list = new ArrayList<String>();
		for (String name : column.getComputationParameters()) {
			if (!isEditMode() || (isEditMode() && !parameterForEdit.equals(name))) {		
				list.add(column.getDatasetProperty(name).getName());
			}
		}
		return list;
	}

	/**
	 * (non-Javadoc)
	 * @see com.odcgroup.page.ui.properties.table.dialog.TableTransformDialog#getCommand()
	 */
	@Override
	protected BaseCommand getCommand() {
		BaseCommand cmd = null;
		if (isEditMode()) {	
			String attribute = columnCombo.getSelectedValue();
			cmd = new UpdateMatrixItemComputationParameterCommand(column, parameterForEdit, attribute);
		} else {
			String attribute = columnCombo.getSelectedValue();
			if (attribute == null) {
				return null;
			}
			cmd = new InsertMatrixItemComputationParameterCommand(column, attribute);
		}		
		return cmd;
	}

	/**
	 * (non-Javadoc)
	 * @see com.odcgroup.page.ui.properties.table.dialog.TableTransformDialog#validChanges()
	 */
	@Override
	protected boolean validChanges() {
		if (columnCombo.getSelectedValue()== null) {
			setErrorMessage("Data is not specified");
			return false;
		} 
		setErrorMessage(null);
		return true;
	}

}
