package com.odcgroup.page.ui.edit;

import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.tools.DragEditPartsTracker;

import com.odcgroup.page.model.Widget;


/**
 * Drag tracker edit part for the ConditionalBody widget.
 * 
 * @author Gary Hayes
 */
public class ConditionalBodyDragEditPartsTracker extends DragEditPartsTracker {

    /**
     * Constructs a new DragEditPartsTracker with the given source edit part.
     * 
     * @param sourceEditPart the source edit part
     */
    public ConditionalBodyDragEditPartsTracker(EditPart sourceEditPart) {
        super(sourceEditPart);
    }

    /**
     * Performs the appropriate selection action based on the selection state of the source. We select the ColumnHeader
     * edit part from the selected TableHeader edit part if the selection is outside the bounds of the TableHeader then
     * the table edit part is returned.
     */
    protected void performSelection() {
        super.performSelection();

        EditPartViewer viewer = getCurrentViewer();
        List so = viewer.getSelectedEditParts();
        if (so.size() == 0) {
            return;
        }

        WidgetEditPart wep = (WidgetEditPart) so.get(0);
        Widget conditionalBody = wep.getWidget();
        conditionalBody.setSelected(true);
        conditionalBody.setVisible(true);
        Widget condition = conditionalBody.getParent();
        int index = condition.getContents().indexOf(conditionalBody);
        condition.setIndexOfSelectedChild(index);
    }
}