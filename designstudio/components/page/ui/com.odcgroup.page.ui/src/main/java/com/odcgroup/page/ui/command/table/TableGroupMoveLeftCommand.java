package com.odcgroup.page.ui.command.table;

import com.odcgroup.page.model.widgets.table.ITableGroup;

/**
 * This command moves a column to the left in the table.
 * 
 * @author atr
 * @since DS 1.40.0
 */
public class TableGroupMoveLeftCommand extends AbstractTableGroupCommand {

	/*
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		int sourceIndex = getTable().getDisplayGroupingColumn().getColumnIndex();
		getTable().moveGroups(sourceIndex, sourceIndex - 1);
	}

	/*
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		int sourceIndex = getTable().getDisplayGroupingColumn().getColumnIndex();
		getTable().moveGroups(sourceIndex, sourceIndex - 1);
	}

	/**
	 * @param column
	 */
	public TableGroupMoveLeftCommand(ITableGroup group) {
		super(group);
	}

}
