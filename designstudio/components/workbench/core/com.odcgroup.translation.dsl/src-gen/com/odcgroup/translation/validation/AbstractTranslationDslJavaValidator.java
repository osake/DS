/*
* generated by Xtext
*/
package com.odcgroup.translation.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public class AbstractTranslationDslJavaValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(com.odcgroup.translation.translationDsl.TranslationDslPackage.eINSTANCE);
		return result;
	}

}
