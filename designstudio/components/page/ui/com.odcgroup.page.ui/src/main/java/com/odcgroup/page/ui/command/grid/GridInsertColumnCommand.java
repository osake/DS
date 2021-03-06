package com.odcgroup.page.ui.command.grid;

import com.odcgroup.page.model.widgets.Grid;
import com.odcgroup.page.ui.command.BaseCommand;

/**
 * @author atr
 * @since DS 1.40.0
 */
public class GridInsertColumnCommand extends BaseCommand {
	
	private Grid grid;
	private int columnIndex;

	protected final Grid getGrid() {
		return this.grid;
	}
	
	protected final int getColumnIndex() {
		return this.columnIndex;
	}
	
	/*
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		columnIndex = getGrid().insertColumn();
	}
	
	/*
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		getGrid().removeColumn(getColumnIndex());
	}
	
	/**
	 * @param grid
	 */
	public GridInsertColumnCommand(Grid grid) {
		this.grid = grid;
	}

}
