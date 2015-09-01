package com.odcgroup.page.ui.command.table;

import com.odcgroup.page.model.widgets.table.ITableGroup;

/**
 * This command moves a column to the right in the table.
 * 
 * @author atr
 * @since DS 1.40.0
 */
public class TableMoveGroupUpCommand extends AbstractTableGroupCommand {

	/*
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		getTableGroupingColumn().moveGroupUp(getGroupIndex());
	}

	/*
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		getTableGroupingColumn().moveGroupDown(getGroupIndex() + 1);
	}

	/**
	 * @param column
	 */
	public TableMoveGroupUpCommand(ITableGroup group) {
		super(group);
	}

}
