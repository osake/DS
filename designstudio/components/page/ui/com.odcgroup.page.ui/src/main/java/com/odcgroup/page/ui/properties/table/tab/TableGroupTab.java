package com.odcgroup.page.ui.properties.table.tab;

import org.eclipse.swt.custom.CTabFolder;

import com.odcgroup.page.model.widgets.table.ITable;
import com.odcgroup.page.ui.properties.table.controls.ListControl;


/**
 * The class {@code TableGroupTab} shows the grouping columns of the table.
 * 
 * @author pkk
 * @since DS.140.0
 */
public class TableGroupTab extends TransformTableTab {

	/**
	 * @param parent
	 * @param style
	 * @param label
	 * @param sortable
	 */
	public TableGroupTab(CTabFolder parent, int style, String label, boolean sortable) {
		super(parent, style, label, sortable);
		
	}

	/**
	 * (non-Javadoc)
	 * @see com.odcgroup.page.ui.properties.table.tab.TransformTableTab#createTabControl(org.eclipse.swt.custom.CTabFolder, int)
	 */
	@Override
	protected ListControl<?, ITable> createTabControl(CTabFolder parent, int style) {
		return new TableGroupSection(parent, style, isSortable());
	}
	
	@Override
	public void refresh() {
	    // TODO Auto-generated method stub
	    super.refresh();
	    setEnabled(false);
	}
}
