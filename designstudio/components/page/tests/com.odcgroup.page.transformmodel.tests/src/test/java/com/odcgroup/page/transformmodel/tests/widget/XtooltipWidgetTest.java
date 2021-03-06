package com.odcgroup.page.transformmodel.tests.widget;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.SAXException;

import com.odcgroup.page.transformmodel.tests.AbstractDSPageTransformationUnitTest;
import com.odcgroup.workbench.core.InvalidMetamodelVersionException;
import com.odcgroup.workbench.core.repository.ModelNotFoundException;

public class XtooltipWidgetTest extends AbstractDSPageTransformationUnitTest {

	@Before
	public void setUp() {
		createModelsProject();
		copyResourceInModelsProject("fragment/widgets/xtooltip/DS4946Xtooltip.fragment");
		
	}
	@After
	public void tearDown() {
		deleteModelsProjects();
	}
	
	@Test
	public void testDS4946XspGenerationForXtooltip() throws ModelNotFoundException, IOException, InvalidMetamodelVersionException, CoreException, SAXException, ParserConfigurationException {
		assertTransformation(
				URI.createURI("resource:///widgets/xtooltip/DS4946Xtooltip.fragment"), 
				readFileFromClasspath("/com/odcgroup/page/transformmodel/tests/widget/DS4946ExpectedResult.xml"));
		
	}
	
	
}
