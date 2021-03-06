package com.odcgroup.page.model.util.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.odcgroup.page.metamodel.MetaModel;
import com.odcgroup.page.metamodel.WidgetType;
import com.odcgroup.page.metamodel.util.MetaModelRegistry;
import com.odcgroup.page.model.Widget;
import com.odcgroup.page.model.util.WidgetFactory;

public class ActionIdverifyFormatTest {
	
	private final static String ID_PROPERTY = "id";
	private MetaModel metaModel;
	private WidgetFactory widgetFactory;
	
	@Before
	public void setUp() throws Exception {
		metaModel = MetaModelRegistry.getMetaModel();
		widgetFactory = new WidgetFactory();
	}
	
	@Test
	public void testButtonShouldHaveIdCorrectFormat() throws Exception {
		WidgetType wType = metaModel.findWidgetType("xgui", "Button");
		Widget w = widgetFactory.create(wType);
		String idString = w.getPropertyValue(ID_PROPERTY);
		Assert.assertTrue(idString.matches("btn_[A-Za-z0-9_]*"));
	}
}
