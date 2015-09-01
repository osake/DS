/*
 * generated by Xtext
 */
package com.odcgroup.service.model;

import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.service.SingletonBinding;

import com.odcgroup.service.model.naming.ServiceQualifiedNameConverter;
import com.odcgroup.service.model.scoping.ServiceGlobalScopeProvider;
import com.odcgroup.workbench.dsl.resources.CommonDSLResourceServiceProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class ComponentRuntimeModule extends com.odcgroup.service.model.AbstractComponentRuntimeModule {
	public Class<? extends IQualifiedNameConverter> bindIQualifiedNameConverter() {
		return ServiceQualifiedNameConverter.class;
	}
	
	@Override
	@SingletonBinding
	public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return ServiceGlobalScopeProvider.class;
	}
	
	public Class<? extends IResourceServiceProvider> bindIResourceServiceProvider() {
		return CommonDSLResourceServiceProvider.class;
	}

}
