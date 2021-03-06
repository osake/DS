/*
 * generated by Xtext
 */
package com.odcgroup.menu.model;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.linking.impl.Linker;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.service.SingletonBinding;
import org.eclipse.xtext.validation.IConcreteSyntaxValidator;

import com.google.inject.Provider;
import com.odcgroup.menu.model.naming.MenuNameProvider;
import com.odcgroup.menu.model.resource.MenuResource;
import com.odcgroup.menu.model.resource.MenuResourceDescriptionStrategy;
import com.odcgroup.menu.model.scoping.MenuGlobalScopeProvider;
import com.odcgroup.workbench.dsl.resources.CommonDSLResourceServiceProvider;
import com.odcgroup.workbench.dsl.resources.DSLEncodingProviderProvider;
import com.odcgroup.workbench.dsl.values.DSLValueConverterService;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class MenuRuntimeModule extends com.odcgroup.menu.model.AbstractMenuRuntimeModule {
	
	@Override
	@SingletonBinding
	public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return MenuGlobalScopeProvider.class;
	}

	@Override
	public Class<? extends ResourceSet> bindResourceSet() {
		return ResourceSetImpl.class;
	}

	@Override
	public Class<? extends XtextResource> bindXtextResource() {
		return MenuResource.class;
	}
	
	@Override
	@SingletonBinding
	public Class<? extends ILinker> bindILinker() {
		return Linker.class;
	}
	
	@Override
	@SingletonBinding
	public Class<? extends IConcreteSyntaxValidator> bindConcreteSyntaxValidator() {
		return super.bindConcreteSyntaxValidator();
	}
	
	@Override
	@SingletonBinding
	public Class<? extends IParser> bindIParser() {
		return super.bindIParser();
	}
	@Override
	public Class<? extends Provider<IEncodingProvider>> provideIEncodingProvider() {
	    return DSLEncodingProviderProvider.class;
	}
	
	@Override
    @SingletonBinding
    public Class<? extends IValueConverterService> bindIValueConverterService() {
          return DSLValueConverterService.class;
    }
	
	public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return MenuResourceDescriptionStrategy.class;
	}
	
	public Class<? extends IResourceServiceProvider> bindIResourceServiceProvider() {
		return CommonDSLResourceServiceProvider.class;
	}
	
    public Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
    	return MenuNameProvider.class;
    }

}
