/*
* generated by Xtext
*/
package com.odcgroup.t24.version;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class VersionDSLUiInjectorProvider implements IInjectorProvider {

	public Injector getInjector() {
		return com.odcgroup.t24.version.ui.internal.VersionDSLActivator.getInstance().getInjector("com.odcgroup.t24.version.VersionDSL");
	}

}
