/*
 * generated by Xtext
 */
package com.odcgroup.service.model.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import com.odcgroup.service.model.ui.internal.ComponentActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass.
 */
public class ComponentExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ComponentActivator.getInstance().getBundle();
	}

	@Override
	protected Injector getInjector() {
		return ComponentActivator.getInstance().getInjector(ComponentActivator.COM_ODCGROUP_SERVICE_MODEL_COMPONENT);
	}

}