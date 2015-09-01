package com.odcgroup.workbench.ui.navigator.pageflow;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;

import com.odcgroup.pageflow.model.provider.PageflowItemProviderAdapterFactory;

/**
 * Provides the shared adapter factory for the content and label provider
 */
public final class PageflowAdapterFactoryProvider {

	private static ComposedAdapterFactory adapterFactory;

	public final static List<AdapterFactory> createFactoryList() {
		List<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		// this is my provider generated in the .Edit plugin for me. Replace
		// with yours.
		factories.add(new PageflowItemProviderAdapterFactory());
		// these are EMF generic providers
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());
		// ... add other provider adapter factories for your model as needed
		// if you don't know what to add, look at the creation of the adapter
		// factory
		// in your generated editor
		return factories;
	}

	public final static ComposedAdapterFactory getAdapterFactory() {
		if (adapterFactory == null)
			adapterFactory = new ComposedAdapterFactory(createFactoryList());
		return adapterFactory;
	}

}
