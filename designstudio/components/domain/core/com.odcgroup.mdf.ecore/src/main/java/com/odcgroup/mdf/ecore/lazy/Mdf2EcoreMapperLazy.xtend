package com.odcgroup.mdf.ecore.lazy

import com.odcgroup.mdf.ecore.MdfAssociationImpl
import com.odcgroup.mdf.ecore.MdfAttributeImpl
import com.odcgroup.mdf.ecore.MdfBusinessTypeImpl
import com.odcgroup.mdf.ecore.MdfClassImpl
import com.odcgroup.mdf.ecore.MdfDatasetDerivedPropertyImpl
import com.odcgroup.mdf.ecore.MdfDatasetImpl
import com.odcgroup.mdf.ecore.MdfDatasetMappedPropertyImpl
import com.odcgroup.mdf.ecore.MdfDatasetPropertyImpl
import com.odcgroup.mdf.ecore.MdfEntityImpl
import com.odcgroup.mdf.ecore.MdfEnumValueImpl
import com.odcgroup.mdf.ecore.MdfEnumerationImpl
import com.odcgroup.mdf.ecore.MdfPrimitiveImpl
import com.odcgroup.mdf.ecore.MdfPropertyImpl
import com.odcgroup.mdf.ecore.MdfReverseAssociationImpl
import com.odcgroup.mdf.ecore.annotation.EcorePlusAspect
import com.odcgroup.mdf.metamodel.MdfAnnotation
import com.odcgroup.mdf.metamodel.MdfAnnotationProperty
import com.odcgroup.mdf.metamodel.MdfContainment
import com.odcgroup.mdf.metamodel.MdfDatasetProperty
import com.odcgroup.mdf.metamodel.MdfDomain
import com.odcgroup.mdf.metamodel.MdfModelElement
import com.odcgroup.mdf.metamodel.MdfMultiplicity
import com.odcgroup.mdf.metamodel.MdfProperty
import com.odcgroup.mdf.metamodel.MdfNameFactory
import java.util.List
import org.apache.commons.lang.StringUtils
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EAnnotation
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.impl.EClassImpl

import com.odcgroup.mdf.ecore.MdfDomainImplimport com.odcgroup.mdf.ecore.PrimitivesDomain

class Mdf2EcoreMapperLazy {

	// TODO This class BADLY suffers from copy/paste-itits from Mdf2EcoreMapper, and would never pass a CPD tests.. if we end up keeping it, it MUST be refactored
	// (But probably we will not keep it, once we get back to working on *.data, but will instead just work with a DerivedStateComputer.) 
	 
	public static val INSTANCE = new Mdf2EcoreMapperLazy()
	
	val MDF_LINK = "mdfLink::"
	
	def create ePkg : EcoreFactory::eINSTANCE.createEPackage create(MdfDomain mdfDomain) {
		ePkg.name = mdfDomain?.name;
		(mdfDomain as MdfDomainImpl)?.eResource?.contents += ePkg;
	}
	
	def create eClass : EcoreFactory::eINSTANCE.createEClass create(MdfClassImpl mdfClass) {
		eClass.name = mdfClass.name
		if(mdfClass.baseClass!=null) {
			eClass.ESuperTypes.add((mdfClass.baseClass as MdfClassImpl).map as EClass)
		}
		eClass.EAnnotations.addAll(mdfClass.elementAnnotations)
		eClass.setDocumentation(mdfClass.documentation)
		mdfClass.parentDomain.create.EClassifiers += eClass;

		for(property : mdfClass.properties) {
			val mdfProperty = (property as MdfPropertyImpl)
			val eFeature = mdfProperty.mapProperty
			eClass.EStructuralFeatures += eFeature
		}
		
		// Hack to see if links works after that
//		mdfClass?.eResource?.contents += eClass;
	}
	
	def create eClass : EcoreFactory::eINSTANCE.createEClass mapInternal(MdfClassImpl mdfClass) {
		var URI mdfURI;
		if (mdfClass.eResource != null && mdfClass.eResource.URI != null) {
			mdfURI = mdfClass.eResource.URI;
		} else if (mdfClass.eIsProxy && mdfClass.eProxyURI != null) {
			mdfURI = mdfClass.eProxyURI;
		} else {
			return;
		}
		var URI mdfLink = mdfURI.appendFragment(MDF_LINK + mdfClass.qualifiedName.toString)
		(eClass as EClassImpl).eSetProxyURI(mdfLink);
	}
	
	def isMdfLink(String uriFragment) {
		if (uriFragment != null) {
			return uriFragment.startsWith(MDF_LINK);
		} else {
			return false;
		}
	}
	
	def getMdfNameOfMdfLink(String uriFragment) {
		if (!isMdfLink(uriFragment))
			throw new RuntimeException("uriFragment is not a MdfLink")
		return MdfNameFactory::createMdfName(StringUtils::removeStart(uriFragment, MDF_LINK))
	}
	
	def dispatch map(MdfClassImpl mdfClass) {
		mapInternal(mdfClass)
	}
	

	def create eClass : EcoreFactory::eINSTANCE.createEClass mapInternal(MdfDatasetImpl mdfDataset) {
		mdfDataset.parentDomain.create.EClassifiers += eClass
		eClass.name = mdfDataset.name
		eClass.EAnnotations.addAll(mdfDataset.elementAnnotations)
		eClass.setDocumentation(mdfDataset.documentation)
		val eClassImpl = eClass as EClassImpl
		eClassImpl.classifierID = EcorePackage::ECLASS
		for(Object property : mdfDataset.properties) {
			eClass.getEStructuralFeatures += (property as MdfDatasetPropertyImpl).mapDatasetProperty		
		}
	}
	
	def dispatch map(MdfDatasetImpl mdfDataset) {
		mapInternal(mdfDataset)
	}
	
	def create eDataType : EcoreFactory::eINSTANCE.createEDataType mapInternal(MdfBusinessTypeImpl mdfBT) {
		mdfBT.parentDomain.create.EClassifiers += eDataType
		eDataType.name = mdfBT.name
		eDataType.EAnnotations.addAll(mdfBT.elementAnnotations)
		val type = mdfBT.getType // NOT just .type (DS-7342)
		if(type != null) {
			val baseType = (type as MdfPrimitiveImpl).map
			eDataType.instanceTypeName = baseType.instanceTypeName 
			val eAnnotation = EcoreFactory::eINSTANCE.createEAnnotation
			eAnnotation.source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData"
			eAnnotation.details.put("baseType", baseType.name)
			eDataType.EAnnotations.add(eAnnotation)
		}
	}
	
	def dispatch map(MdfBusinessTypeImpl mdfBT) {
		mapInternal(mdfBT)
	}
	
	def create eEnum : EcoreFactory::eINSTANCE.createEEnum mapInternal(MdfEnumerationImpl mdfEnum) {
		mdfEnum.parentDomain.create.EClassifiers += eEnum
		eEnum.name = mdfEnum.name
		EcorePlusAspect::EnumBaseType.set(eEnum, (mdfEnum.getType as MdfPrimitiveImpl).map.name) // NOT just .type (DS-7342)
		eEnum.EAnnotations.addAll(mdfEnum.elementAnnotations)
		eEnum.setDocumentation(mdfEnum.documentation)
		var i = 0
		for(literalObj : mdfEnum.values) {
			val literal = (literalObj as MdfEnumValueImpl)
			val eLiteral = literal.mapEnumLiteral(i)
			eEnum.ELiterals += eLiteral
			i = i + 1
		}
	}
	
	def dispatch map(MdfEnumerationImpl mdfEnum) {
		mapInternal(mdfEnum)
	}
	
	def dispatch EDataType map(MdfPrimitiveImpl mdfPrimitive) {
		switch(mdfPrimitive) {
			case PrimitivesDomain::STRING      : EcorePackage::eINSTANCE.EString
			case PrimitivesDomain::DECIMAL     : EcorePackage::eINSTANCE.EBigDecimal
			case PrimitivesDomain::BOOLEAN     : EcorePackage::eINSTANCE.EBoolean
			case PrimitivesDomain::BOOLEAN_OBJ : EcorePackage::eINSTANCE.EBooleanObject
			case PrimitivesDomain::FLOAT       : EcorePackage::eINSTANCE.EFloat		
			case PrimitivesDomain::FLOAT_OBJ   : EcorePackage::eINSTANCE.EFloatObject		
			case PrimitivesDomain::DOUBLE      : EcorePackage::eINSTANCE.EDouble		
			case PrimitivesDomain::DOUBLE_OBJ  : EcorePackage::eINSTANCE.EDoubleObject		
			case PrimitivesDomain::INTEGER     : EcorePackage::eINSTANCE.EInt
			case PrimitivesDomain::INTEGER_OBJ : EcorePackage::eINSTANCE.EIntegerObject
			case PrimitivesDomain::SHORT       : EcorePackage::eINSTANCE.EShort
			case PrimitivesDomain::SHORT_OBJ   : EcorePackage::eINSTANCE.EShortObject
			case PrimitivesDomain::LONG        : EcorePackage::eINSTANCE.ELong
			case PrimitivesDomain::LONG_OBJ    : EcorePackage::eINSTANCE.ELongObject
			case PrimitivesDomain::DATE        : EcorePackage::eINSTANCE.EDate
			case PrimitivesDomain::DATE_TIME   : EcorePackage::eINSTANCE.EDate
			case PrimitivesDomain::BYTE	       : EcorePackage::eINSTANCE.EByte
			case PrimitivesDomain::BYTE_OBJ	   : EcorePackage::eINSTANCE.EByteObject
			case PrimitivesDomain::CHAR	       : EcorePackage::eINSTANCE.EChar
			case PrimitivesDomain::CHAR_OBJ    : EcorePackage::eINSTANCE.ECharacterObject
			case PrimitivesDomain::URI         : EcorePackage::eINSTANCE.EString
			default: throw new IllegalArgumentException("Unknown MdfPrimitiveImpl: " + mdfPrimitive.toString)
		}
	}
	
	def dispatch mapProperty(MdfAttributeImpl mdfAttribute) {
		val eAttribute = EcoreFactory::eINSTANCE.createEAttribute();
		eAttribute.setPropertyAttributes(mdfAttribute)
		eAttribute.defaultValue = mdfAttribute.^default
		return eAttribute
	}
	
	def create eReference : EcoreFactory::eINSTANCE.createEReference mapPropertyInternal(MdfAssociationImpl mdfAssociation) {
		eReference.setPropertyAttributes(mdfAssociation)
		eReference.containment = mdfAssociation.containment==MdfContainment::BY_VALUE
	}
	
	def dispatch mapProperty(MdfAssociationImpl mdfAssociation) {
		mapPropertyInternal(mdfAssociation) 
	}

	def create eReference : EcoreFactory::eINSTANCE.createEReference mapPropertyInternal(MdfReverseAssociationImpl mdfrevAssociation) {
		eReference.setPropertyAttributes(mdfrevAssociation)
		val mdfOpposite = (mdfrevAssociation.reversedAssociation as MdfAssociationImpl)
		val opposite = mdfOpposite.mapProperty as EReference
		((mdfOpposite.parentClass as MdfClassImpl).map as EClass).EStructuralFeatures += opposite
		eReference.EOpposite = opposite
		opposite.EOpposite = eReference
	}
	
	def dispatch mapProperty(MdfReverseAssociationImpl mdfrevAssociation) {
		mapPropertyInternal(mdfrevAssociation) 
	}

	def dispatch mapDatasetProperty(MdfDatasetDerivedPropertyImpl mdfDSDerivedProperty) {
		val eAttribute = EcoreFactory::eINSTANCE.createEAttribute();
		eAttribute.setPropertyAttributes(mdfDSDerivedProperty)
		return eAttribute
	}

	def dispatch mapDatasetProperty(MdfDatasetMappedPropertyImpl mdfDSMappedProperty) {
		var EStructuralFeature eProperty = null;
		val mdfType = mdfDSMappedProperty.getType // NOT just .type (DS-7342)
		if(mdfType!=null) {
			val type = (mdfType as MdfEntityImpl).map
			if(type instanceof EDataType) {
				val eAttr = EcoreFactory::eINSTANCE.createEAttribute();
				eAttr.ID = mdfDSMappedProperty.primaryKey
				eAttr.unique = mdfDSMappedProperty.primaryKey
				eAttr.lowerBound = if(mdfDSMappedProperty.required) 1 else 0
				if(mdfDSMappedProperty.businessKey) {
					EcorePlusAspect::BusinessKey.set(eAttr, true)
				}
				eProperty = eAttr
			} else {
				eProperty = EcoreFactory::eINSTANCE.createEReference;
			}
		} else {
			eProperty = EcoreFactory::eINSTANCE.createEAttribute();
		}
		eProperty.setPropertyAttributes(mdfDSMappedProperty)
		eProperty
	}

	def mapEnumLiteral(MdfEnumValueImpl mdfEnumValue, int index) {
		val eEnumLiteral = EcoreFactory::eINSTANCE.createEEnumLiteral()
		eEnumLiteral.name = mdfEnumValue.name
		EcorePlusAspect::EnumLiteralValue.set(eEnumLiteral, mdfEnumValue.value)
		var value = mdfEnumValue.value
		if(value=="true") value = "1"
		if(value=="false") value = "0"
		try {
			eEnumLiteral.value = Integer::parseInt(value)	
		} catch(NumberFormatException nfe) {
			eEnumLiteral.value = index
		}
		eEnumLiteral.setDocumentation(mdfEnumValue.documentation)
		return eEnumLiteral
	}
	
	def setDocumentation(EObject obj, String doc) {
		if (doc != null) {
			val documentationAdapter = new MdfDocumentationAdapter();
			documentationAdapter.setDocumentation(doc);
			obj.eAdapters().add(documentationAdapter);	
		}
	}
	
	def dispatch getPropertyName(MdfProperty property) {
		property.name
	}

	def dispatch getPropertyName(MdfDatasetProperty property) {
		property.name
	}
	
	def dispatch setPropertyAttributes(EStructuralFeature eProperty, MdfProperty mdfProperty) {
		eProperty.name = getPropertyName(mdfProperty)
		// TODO
		eProperty.EType = (mdfProperty.getType as MdfEntityImpl).map // NOT just .type (DS-7342)
		eProperty.EAnnotations.addAll(mdfProperty.elementAnnotations)
		eProperty.setDocumentation(mdfProperty.documentation)
		eProperty.lowerBound = if(mdfProperty.required) 1 else 0
		eProperty.upperBound = if(mdfProperty.multiplicity==MdfMultiplicity::ONE) 1 else -1
		if(mdfProperty.businessKey) {
			EcorePlusAspect::BusinessKey.set(eProperty, true)
		}
		eProperty.unique = mdfProperty.primaryKey
	}

	def dispatch setPropertyAttributes(EStructuralFeature eProperty, MdfDatasetProperty mdfProperty) {
		eProperty.name = getPropertyName(mdfProperty)
		val mdfType = mdfProperty.getType // NOT just .type (DS-7342)
		if(mdfType!=null) {
			eProperty.EType = (mdfType as MdfEntityImpl).map
		}
		eProperty.EAnnotations.addAll(mdfProperty.elementAnnotations)
		eProperty.setDocumentation(mdfProperty.documentation)
		eProperty.upperBound = if(mdfProperty.multiplicity==MdfMultiplicity::ONE) 1 else -1
	}
	
	def getElementAnnotations(MdfModelElement mdfElement) {
		val List<EAnnotation> eAnnotations = newArrayList()
		for(Object obj : mdfElement.annotations) {
			val MdfAnnotation mdfAnnotation = obj as MdfAnnotation
			val eAnnotation = EcoreFactory::eINSTANCE.createEAnnotation()
			eAnnotation.source = mdfAnnotation.name
			for(Object propObj : mdfAnnotation.properties) {
				val property = propObj as MdfAnnotationProperty 
				eAnnotation.details.put(property.name, property.value)
			}
			eAnnotations += eAnnotation
		}
		eAnnotations
	}
}