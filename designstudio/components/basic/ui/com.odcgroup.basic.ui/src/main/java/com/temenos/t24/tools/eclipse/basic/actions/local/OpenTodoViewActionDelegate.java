package com.temenos.t24.tools.eclipse.basic.actions.local; 

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;

import com.temenos.t24.tools.eclipse.basic.views.todo.TodoView;

public class OpenTodoViewActionDelegate implements IWorkbenchWindowActionDelegate {

    private IWorkbenchWindow window;
    
    public void dispose() {
    }

    public void init(IWorkbenchWindow window) {
        this.window = window;
    }

    public void run(IAction action) {
        // Get the active page.
        if (window == null)
           return;
        IWorkbenchPage page = window.getActivePage();
        if (page == null)
           return;
     
        // Open and activate the view.
        try {
           page.showView((new TodoView()).getViewID());
        } catch (PartInitException e) {
           e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void selectionChanged(IAction action, ISelection selection) {
    }
}
