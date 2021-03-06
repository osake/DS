package com.odcgroup.page.ui.command.grid;

import com.odcgroup.page.model.widgets.Grid;
import com.odcgroup.page.model.widgets.GridRow;
import com.odcgroup.page.ui.command.BaseCommand;

/**
 * @author atr
 * @since DS 1.40.0
 */
public class GridInsertRowAboveCommand extends BaseCommand {
	
	private Grid grid;
	private int rowIndex;
	
	protected final Grid getGrid() {
		return this.grid;
	}
	
	protected final int getRowIndex() {
		return this.rowIndex;
	}

	/*
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		getGrid().insertRowAbove(getRowIndex());
	}
	
	/*
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		getGrid().removeRow(getRowIndex());
	}
	
	/**
	 * @param grid
	 */
	public GridInsertRowAboveCommand(GridRow row) {
		this.grid = row.getGrid();
		this.rowIndex = row.getIndex();
	}

}
