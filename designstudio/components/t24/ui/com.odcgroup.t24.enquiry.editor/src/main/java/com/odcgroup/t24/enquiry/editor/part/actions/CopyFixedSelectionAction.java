package com.odcgroup.t24.enquiry.editor.part.actions;

import java.util.List;

import org.eclipse.gef.ui.actions.Clipboard;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

import com.odcgroup.t24.enquiry.editor.part.FixedSelectionEditPart;

/**
 * TODO: Document me!
 * 
 * @author mumesh
 * 
 */
public class CopyFixedSelectionAction extends SelectionAction {

	public static final String ACTION_ID = "COPY_PREDEFINED_SELECTION";

	/**
	 * @param part
	 */
	public CopyFixedSelectionAction(IWorkbenchPart part) {
		super(part);
		setId(ACTION_ID);
		setText("Copy Predefined Selection");
		setDescription("Copy");
		setToolTipText("Copy");

	}

	@Override
	protected boolean calculateEnabled() {
		ISelection s = getSelection();
		if (s != null && s instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) s;
			if (ss.size() > 0) {
				Object obj = ss.getFirstElement();
				if (obj instanceof FixedSelectionEditPart) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Runs the action.
	 */
	public void run() {
		List<?> selection = getSelectedObjects();
		if (selection != null && selection.size() > 0) {
			for (int i = 0; i < selection.size(); i++) {
				if (selection.get(i) instanceof FixedSelectionEditPart) {
					Clipboard.getDefault().setContents(selection);
					return;
				}
			}
		}
	}

}
