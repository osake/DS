package com.odcgroup.page.ui.command.matrix;

import java.util.Collections;
import java.util.List;

import com.odcgroup.page.model.widgets.matrix.IMatrixComputationItem;
import com.odcgroup.page.ui.command.BaseCommand;

/**
 *
 * @author pkk
 *
 */
public class MoveDownMatrixItemCompParamCommand extends BaseCommand {

	private String parameter;
	private IMatrixComputationItem column;

	/**
	 * @param column
	 * @param parameter
	 */
	public MoveDownMatrixItemCompParamCommand(IMatrixComputationItem column, String parameter) {
		this.column = column;
		this.parameter = parameter;
	}

	/**
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		List<String> parameters = column.getComputationParameters();
		int pos = parameters.indexOf(parameter);
		if (pos != -1 && (pos < parameters.size()-1)) {
			Collections.swap(parameters, pos, pos+1);
			column.setComputationParameters(parameters);
		} 
	}

	/**
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		List<String> parameters = column.getComputationParameters();
		int pos = parameters.indexOf(parameter);
		Collections.swap(parameters, pos, pos-1);
		column.setComputationParameters(parameters);
	}



}
