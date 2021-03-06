package com.odcgroup.page.ui.util.tests;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.RootEditPart;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.odcgroup.page.metamodel.PropertyTypeConstants;
import com.odcgroup.page.ui.edit.WidgetEditPart;
import com.odcgroup.page.ui.editor.DesignEditor;
import com.odcgroup.page.ui.figure.AbstractWidgetFigure;
import com.odcgroup.page.ui.figure.tab.ITabFigure;
import com.odcgroup.page.ui.figure.tab.TabbedPaneFigure;
import com.odcgroup.page.ui.tests.util.PageUiAssert;

public class DynamicTabCustomEventTest  extends AbstractPageDesignerUnitTest {

	private static final String DOMAIN_MODEL = "domain/ds4021/DS4021.domain";
	private static final String MODULE_MODEL = "module/widget/tabbedpane/DS5529.module";

	@Before
    public void setUp() throws Exception {
    	createModelsProject();
        copyResourceInModelsProject(DOMAIN_MODEL, MODULE_MODEL);
        closeWelcomeScreen(); // Otherwise the editor won't get displayed
    }

	@After
	public void tearDown() throws Exception {
        deleteModelsProjects();
    }

	/**
	 * @throws PartInitException
	 */
	@Test
	public void testDS5529DynamicTabCustoEventValidation() throws PartInitException {
		IFile moduleFile = getProject().getFile(MODULE_MODEL);
		Assert.assertTrue(moduleFile.exists());
		IEditorPart ep = openDefaultEditor(moduleFile);
		PageUiAssert.assertInstanceOfMultiPageEditorPart(ep);
		MultiPageEditorPart mep = (MultiPageEditorPart) ep;
		DesignEditor editor = (DesignEditor) mep.getSelectedPage();
		RootEditPart rep = editor.getViewer().getRootEditPart();
		List<?> list = rep.getChildren();
		if (!list.isEmpty()) {
			WidgetEditPart wep = (WidgetEditPart) list.get(0);
			Assert.assertNotNull("Module WidgetEditPart is not found", wep);
			List<?> children = wep.getChildren();
			Assert.assertFalse("Module Widget has no children", children.isEmpty());
			WidgetEditPart bep = (WidgetEditPart) children.get(0);
			Assert.assertFalse("Box Widget has no children", bep.getChildren().isEmpty());
			WidgetEditPart tpep = (WidgetEditPart) bep.getChildren().get(0);
			IFigure mfig = tpep.getFigure();
			Assert.assertTrue(mfig instanceof TabbedPaneFigure);
			ITabFigure tab = ((TabbedPaneFigure) mfig).getTab(1);
			Assert.assertNotNull(tab);
			((AbstractWidgetFigure)tab).getWidget().setPropertyValue(PropertyTypeConstants.DOCUMENTATION, "xx");
			IWorkbenchPage page = ep.getSite().getPage();
	        page.saveEditor(ep, false);
	        flushEventQueue();
	        
			List<?> exchildren = tpep.getChildren();
			Assert.assertTrue(exchildren.size() == 2);
			WidgetEditPart compItem = (WidgetEditPart) exchildren.get(1);
			rep.getViewer().select(compItem);
		
			
			String expectedErrorMsg = "Property target is already used for the " +
					"dynamic tab event Design Studio generates with the value self. Same value is required";
			IStatus status = validateModel(compItem.getModel());
			Assert.assertTrue(!status.isOK());
			Assert.assertEquals(expectedErrorMsg, status.getMessage());				
		}
	}

}
