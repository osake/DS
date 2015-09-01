/*
* generated by Xtext
*/
package com.odcgroup.iris.rim.generation.tests;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.junit4.GlobalRegistries;
import org.eclipse.xtext.junit4.GlobalRegistries.GlobalStateMemento;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.eclipse.xtext.junit4.IRegistryConfigurator;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.odcgroup.domain.DomainStandaloneSetup;
import com.odcgroup.t24.enquiry.EnquiryStandaloneSetup;
import com.odcgroup.t24.version.VersionDSLStandaloneSetup;
import com.odcgroup.workbench.generation.cartridge.ng.di.GenerationRuntimeModule;
import com.temenos.interaction.rimdsl.RIMDslStandaloneSetup;

public class IRISInjectorProvider implements IInjectorProvider, IRegistryConfigurator {
	
    protected GlobalStateMemento stateBeforeInjectorCreation;
	protected GlobalStateMemento stateAfterInjectorCreation;
	protected Injector injector;

	static {
		GlobalRegistries.initializeDefaults();
	}

	public Injector getInjector()
	{
		if (injector == null) {
			stateBeforeInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
			injector = Guice.createInjector(new GenerationRuntimeModuleTest());
			RIMDslStandaloneSetup.doSetup();
			DomainStandaloneSetup.doSetup();
			EnquiryStandaloneSetup.doSetup();
			VersionDSLStandaloneSetup.doSetup();
			stateAfterInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
		}
		return injector;
	}
	
	public void restoreRegistry() {
		stateBeforeInjectorCreation.restoreGlobalState();
	}

	public void setupRegistry() {
		getInjector();
		stateAfterInjectorCreation.restoreGlobalState();
	}
	
	class GenerationRuntimeModuleTest extends GenerationRuntimeModule {
		protected void configure() {
			super.configure();
			// need this otherwise some class cannot be properly instantiated by Guice.
			bind(ResourceSet.class).to(XtextResourceSet.class);
		}
	}

}
