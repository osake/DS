/*
* generated by Xtext
*/
package com.odcgroup.domain.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.odcgroup.domain.services.DomainGrammarAccess;

public class DomainParser extends AbstractContentAssistParser {
	
	@Inject
	private DomainGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.odcgroup.domain.ui.contentassist.antlr.internal.InternalDomainParser createParser() {
		com.odcgroup.domain.ui.contentassist.antlr.internal.InternalDomainParser result = new com.odcgroup.domain.ui.contentassist.antlr.internal.InternalDomainParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getMdfPrimitiveAccess().getAlternatives(), "rule__MdfPrimitive__Alternatives");
					put(grammarAccess.getMdfPropertyAccess().getAlternatives(), "rule__MdfProperty__Alternatives");
					put(grammarAccess.getMdfDatasetPropertyAccess().getAlternatives(), "rule__MdfDatasetProperty__Alternatives");
					put(grammarAccess.getMdfEntityAccess().getAlternatives(), "rule__MdfEntity__Alternatives");
					put(grammarAccess.getString_ValueAccess().getAlternatives(), "rule__String_Value__Alternatives");
					put(grammarAccess.getMdfMultiplicityAccess().getAlternatives(), "rule__MdfMultiplicity__Alternatives");
					put(grammarAccess.getMdfContainmentAccess().getAlternatives(), "rule__MdfContainment__Alternatives");
					put(grammarAccess.getMdfDomainAccess().getGroup(), "rule__MdfDomain__Group__0");
					put(grammarAccess.getMdfDomainAccess().getGroup_8(), "rule__MdfDomain__Group_8__0");
					put(grammarAccess.getMdfDomainAccess().getGroup_9(), "rule__MdfDomain__Group_9__0");
					put(grammarAccess.getMdfDomainAccess().getGroup_10(), "rule__MdfDomain__Group_10__0");
					put(grammarAccess.getMdfDomainAccess().getGroup_11(), "rule__MdfDomain__Group_11__0");
					put(grammarAccess.getMdfDomainAccess().getGroup_12(), "rule__MdfDomain__Group_12__0");
					put(grammarAccess.getMdfDeprecationInfoAccess().getGroup(), "rule__MdfDeprecationInfo__Group__0");
					put(grammarAccess.getMdfAnnotationAccess().getGroup(), "rule__MdfAnnotation__Group__0");
					put(grammarAccess.getMdfAnnotationAccess().getGroup_4(), "rule__MdfAnnotation__Group_4__0");
					put(grammarAccess.getMdfAnnotationAccess().getGroup_4_2(), "rule__MdfAnnotation__Group_4_2__0");
					put(grammarAccess.getMdfClassAccess().getGroup(), "rule__MdfClass__Group__0");
					put(grammarAccess.getMdfClassAccess().getGroup_4(), "rule__MdfClass__Group_4__0");
					put(grammarAccess.getMdfClassAccess().getGroup_6(), "rule__MdfClass__Group_6__0");
					put(grammarAccess.getMdfClassAccess().getGroup_7(), "rule__MdfClass__Group_7__0");
					put(grammarAccess.getMdfDatasetAccess().getGroup(), "rule__MdfDataset__Group__0");
					put(grammarAccess.getMdfDatasetAccess().getGroup_2(), "rule__MdfDataset__Group_2__0");
					put(grammarAccess.getMdfDatasetAccess().getGroup_6(), "rule__MdfDataset__Group_6__0");
					put(grammarAccess.getMdfDatasetAccess().getGroup_7(), "rule__MdfDataset__Group_7__0");
					put(grammarAccess.getMdfBusinessTypeAccess().getGroup(), "rule__MdfBusinessType__Group__0");
					put(grammarAccess.getMdfBusinessTypeAccess().getGroup_5(), "rule__MdfBusinessType__Group_5__0");
					put(grammarAccess.getMdfEnumerationAccess().getGroup(), "rule__MdfEnumeration__Group__0");
					put(grammarAccess.getMdfEnumerationAccess().getGroup_6(), "rule__MdfEnumeration__Group_6__0");
					put(grammarAccess.getMdfPrimitive_ImplAccess().getGroup(), "rule__MdfPrimitive_Impl__Group__0");
					put(grammarAccess.getMdfAnnotationPropertyAccess().getGroup(), "rule__MdfAnnotationProperty__Group__0");
					put(grammarAccess.getMdfAnnotationPropertyAccess().getGroup_2(), "rule__MdfAnnotationProperty__Group_2__0");
					put(grammarAccess.getMdfAttributeAccess().getGroup(), "rule__MdfAttribute__Group__0");
					put(grammarAccess.getMdfAttributeAccess().getGroup_8(), "rule__MdfAttribute__Group_8__0");
					put(grammarAccess.getMdfAttributeAccess().getGroup_10(), "rule__MdfAttribute__Group_10__0");
					put(grammarAccess.getMdfAssociationAccess().getGroup(), "rule__MdfAssociation__Group__0");
					put(grammarAccess.getMdfAssociationAccess().getGroup_9(), "rule__MdfAssociation__Group_9__0");
					put(grammarAccess.getMdfAssociationAccess().getGroup_11(), "rule__MdfAssociation__Group_11__0");
					put(grammarAccess.getMdfReverseAssociationAccess().getGroup(), "rule__MdfReverseAssociation__Group__0");
					put(grammarAccess.getMdfReverseAssociationAccess().getGroup_11(), "rule__MdfReverseAssociation__Group_11__0");
					put(grammarAccess.getMdfDatasetDerivedPropertyAccess().getGroup(), "rule__MdfDatasetDerivedProperty__Group__0");
					put(grammarAccess.getMdfDatasetDerivedPropertyAccess().getGroup_4(), "rule__MdfDatasetDerivedProperty__Group_4__0");
					put(grammarAccess.getMdfDatasetDerivedPropertyAccess().getGroup_7(), "rule__MdfDatasetDerivedProperty__Group_7__0");
					put(grammarAccess.getMdfDatasetMappedPropertyAccess().getGroup(), "rule__MdfDatasetMappedProperty__Group__0");
					put(grammarAccess.getMdfDatasetMappedPropertyAccess().getGroup_6(), "rule__MdfDatasetMappedProperty__Group_6__0");
					put(grammarAccess.getMdfDatasetMappedPropertyAccess().getGroup_8(), "rule__MdfDatasetMappedProperty__Group_8__0");
					put(grammarAccess.getMdfEnumValueAccess().getGroup(), "rule__MdfEnumValue__Group__0");
					put(grammarAccess.getMdfEnumValueAccess().getGroup_5(), "rule__MdfEnumValue__Group_5__0");
					put(grammarAccess.getRefAccess().getGroup(), "rule__Ref__Group__0");
					put(grammarAccess.getRefAccess().getGroup_1(), "rule__Ref__Group_1__0");
					put(grammarAccess.getMdfDomainAccess().getDocumentationAssignment_0(), "rule__MdfDomain__DocumentationAssignment_0");
					put(grammarAccess.getMdfDomainAccess().getNameAssignment_2(), "rule__MdfDomain__NameAssignment_2");
					put(grammarAccess.getMdfDomainAccess().getAnnotationsAssignment_3(), "rule__MdfDomain__AnnotationsAssignment_3");
					put(grammarAccess.getMdfDomainAccess().getNamespaceAssignment_5(), "rule__MdfDomain__NamespaceAssignment_5");
					put(grammarAccess.getMdfDomainAccess().getMetamodelVersionAssignment_7(), "rule__MdfDomain__MetamodelVersionAssignment_7");
					put(grammarAccess.getMdfDomainAccess().getClassesAssignment_9_2(), "rule__MdfDomain__ClassesAssignment_9_2");
					put(grammarAccess.getMdfDomainAccess().getDatasetsAssignment_10_2(), "rule__MdfDomain__DatasetsAssignment_10_2");
					put(grammarAccess.getMdfDomainAccess().getBusinessTypesAssignment_11_2(), "rule__MdfDomain__BusinessTypesAssignment_11_2");
					put(grammarAccess.getMdfDomainAccess().getEnumerationsAssignment_12_2(), "rule__MdfDomain__EnumerationsAssignment_12_2");
					put(grammarAccess.getMdfAnnotationAccess().getNamespaceAssignment_1(), "rule__MdfAnnotation__NamespaceAssignment_1");
					put(grammarAccess.getMdfAnnotationAccess().getNameAssignment_3(), "rule__MdfAnnotation__NameAssignment_3");
					put(grammarAccess.getMdfAnnotationAccess().getPropertiesAssignment_4_1(), "rule__MdfAnnotation__PropertiesAssignment_4_1");
					put(grammarAccess.getMdfAnnotationAccess().getPropertiesAssignment_4_2_1(), "rule__MdfAnnotation__PropertiesAssignment_4_2_1");
					put(grammarAccess.getMdfClassAccess().getDocumentationAssignment_0(), "rule__MdfClass__DocumentationAssignment_0");
					put(grammarAccess.getMdfClassAccess().getAbstractAssignment_1(), "rule__MdfClass__AbstractAssignment_1");
					put(grammarAccess.getMdfClassAccess().getNameAssignment_3(), "rule__MdfClass__NameAssignment_3");
					put(grammarAccess.getMdfClassAccess().getBaseClassAssignment_4_1(), "rule__MdfClass__BaseClassAssignment_4_1");
					put(grammarAccess.getMdfClassAccess().getAnnotationsAssignment_5(), "rule__MdfClass__AnnotationsAssignment_5");
					put(grammarAccess.getMdfClassAccess().getPropertiesAssignment_7_1(), "rule__MdfClass__PropertiesAssignment_7_1");
					put(grammarAccess.getMdfDatasetAccess().getDocumentationAssignment_0(), "rule__MdfDataset__DocumentationAssignment_0");
					put(grammarAccess.getMdfDatasetAccess().getNameAssignment_1(), "rule__MdfDataset__NameAssignment_1");
					put(grammarAccess.getMdfDatasetAccess().getBaseClassAssignment_2_1(), "rule__MdfDataset__BaseClassAssignment_2_1");
					put(grammarAccess.getMdfDatasetAccess().getLinkedAssignment_3(), "rule__MdfDataset__LinkedAssignment_3");
					put(grammarAccess.getMdfDatasetAccess().getSyncAssignment_4(), "rule__MdfDataset__SyncAssignment_4");
					put(grammarAccess.getMdfDatasetAccess().getAnnotationsAssignment_5(), "rule__MdfDataset__AnnotationsAssignment_5");
					put(grammarAccess.getMdfDatasetAccess().getPropertiesAssignment_7_1(), "rule__MdfDataset__PropertiesAssignment_7_1");
					put(grammarAccess.getMdfBusinessTypeAccess().getDocumentationAssignment_0(), "rule__MdfBusinessType__DocumentationAssignment_0");
					put(grammarAccess.getMdfBusinessTypeAccess().getNameAssignment_1(), "rule__MdfBusinessType__NameAssignment_1");
					put(grammarAccess.getMdfBusinessTypeAccess().getTypeAssignment_3(), "rule__MdfBusinessType__TypeAssignment_3");
					put(grammarAccess.getMdfBusinessTypeAccess().getAnnotationsAssignment_4(), "rule__MdfBusinessType__AnnotationsAssignment_4");
					put(grammarAccess.getMdfEnumerationAccess().getDocumentationAssignment_0(), "rule__MdfEnumeration__DocumentationAssignment_0");
					put(grammarAccess.getMdfEnumerationAccess().getNameAssignment_1(), "rule__MdfEnumeration__NameAssignment_1");
					put(grammarAccess.getMdfEnumerationAccess().getTypeAssignment_3(), "rule__MdfEnumeration__TypeAssignment_3");
					put(grammarAccess.getMdfEnumerationAccess().getAcceptNullValueAssignment_4(), "rule__MdfEnumeration__AcceptNullValueAssignment_4");
					put(grammarAccess.getMdfEnumerationAccess().getAnnotationsAssignment_5(), "rule__MdfEnumeration__AnnotationsAssignment_5");
					put(grammarAccess.getMdfEnumerationAccess().getValuesAssignment_7(), "rule__MdfEnumeration__ValuesAssignment_7");
					put(grammarAccess.getMdfPrimitive_ImplAccess().getNameAssignment_1(), "rule__MdfPrimitive_Impl__NameAssignment_1");
					put(grammarAccess.getMdfAnnotationPropertyAccess().getCDATAAssignment_0(), "rule__MdfAnnotationProperty__CDATAAssignment_0");
					put(grammarAccess.getMdfAnnotationPropertyAccess().getNameAssignment_1(), "rule__MdfAnnotationProperty__NameAssignment_1");
					put(grammarAccess.getMdfAnnotationPropertyAccess().getValueAssignment_2_1(), "rule__MdfAnnotationProperty__ValueAssignment_2_1");
					put(grammarAccess.getMdfAttributeAccess().getDocumentationAssignment_0(), "rule__MdfAttribute__DocumentationAssignment_0");
					put(grammarAccess.getMdfAttributeAccess().getNameAssignment_1(), "rule__MdfAttribute__NameAssignment_1");
					put(grammarAccess.getMdfAttributeAccess().getTypeAssignment_3(), "rule__MdfAttribute__TypeAssignment_3");
					put(grammarAccess.getMdfAttributeAccess().getMultiplicityAssignment_4(), "rule__MdfAttribute__MultiplicityAssignment_4");
					put(grammarAccess.getMdfAttributeAccess().getBusinessKeyAssignment_5(), "rule__MdfAttribute__BusinessKeyAssignment_5");
					put(grammarAccess.getMdfAttributeAccess().getPrimaryKeyAssignment_6(), "rule__MdfAttribute__PrimaryKeyAssignment_6");
					put(grammarAccess.getMdfAttributeAccess().getRequiredAssignment_7(), "rule__MdfAttribute__RequiredAssignment_7");
					put(grammarAccess.getMdfAttributeAccess().getDefaultAssignment_8_2(), "rule__MdfAttribute__DefaultAssignment_8_2");
					put(grammarAccess.getMdfAttributeAccess().getAnnotationsAssignment_9(), "rule__MdfAttribute__AnnotationsAssignment_9");
					put(grammarAccess.getMdfAssociationAccess().getDocumentationAssignment_0(), "rule__MdfAssociation__DocumentationAssignment_0");
					put(grammarAccess.getMdfAssociationAccess().getNameAssignment_1(), "rule__MdfAssociation__NameAssignment_1");
					put(grammarAccess.getMdfAssociationAccess().getContainmentAssignment_3(), "rule__MdfAssociation__ContainmentAssignment_3");
					put(grammarAccess.getMdfAssociationAccess().getTypeAssignment_4(), "rule__MdfAssociation__TypeAssignment_4");
					put(grammarAccess.getMdfAssociationAccess().getMultiplicityAssignment_5(), "rule__MdfAssociation__MultiplicityAssignment_5");
					put(grammarAccess.getMdfAssociationAccess().getBusinessKeyAssignment_6(), "rule__MdfAssociation__BusinessKeyAssignment_6");
					put(grammarAccess.getMdfAssociationAccess().getPrimaryKeyAssignment_7(), "rule__MdfAssociation__PrimaryKeyAssignment_7");
					put(grammarAccess.getMdfAssociationAccess().getRequiredAssignment_8(), "rule__MdfAssociation__RequiredAssignment_8");
					put(grammarAccess.getMdfAssociationAccess().getReverseAssignment_9_2(), "rule__MdfAssociation__ReverseAssignment_9_2");
					put(grammarAccess.getMdfAssociationAccess().getAnnotationsAssignment_10(), "rule__MdfAssociation__AnnotationsAssignment_10");
					put(grammarAccess.getMdfReverseAssociationAccess().getDocumentationAssignment_0(), "rule__MdfReverseAssociation__DocumentationAssignment_0");
					put(grammarAccess.getMdfReverseAssociationAccess().getNameAssignment_1(), "rule__MdfReverseAssociation__NameAssignment_1");
					put(grammarAccess.getMdfReverseAssociationAccess().getReversedAssociationTypeAssignment_3(), "rule__MdfReverseAssociation__ReversedAssociationTypeAssignment_3");
					put(grammarAccess.getMdfReverseAssociationAccess().getReversedAssociationAssignment_5(), "rule__MdfReverseAssociation__ReversedAssociationAssignment_5");
					put(grammarAccess.getMdfReverseAssociationAccess().getMultiplicityAssignment_6(), "rule__MdfReverseAssociation__MultiplicityAssignment_6");
					put(grammarAccess.getMdfReverseAssociationAccess().getBusinessKeyAssignment_7(), "rule__MdfReverseAssociation__BusinessKeyAssignment_7");
					put(grammarAccess.getMdfReverseAssociationAccess().getPrimaryKeyAssignment_8(), "rule__MdfReverseAssociation__PrimaryKeyAssignment_8");
					put(grammarAccess.getMdfReverseAssociationAccess().getRequiredAssignment_9(), "rule__MdfReverseAssociation__RequiredAssignment_9");
					put(grammarAccess.getMdfReverseAssociationAccess().getAnnotationsAssignment_10(), "rule__MdfReverseAssociation__AnnotationsAssignment_10");
					put(grammarAccess.getMdfDatasetDerivedPropertyAccess().getDocumentationAssignment_0(), "rule__MdfDatasetDerivedProperty__DocumentationAssignment_0");
					put(grammarAccess.getMdfDatasetDerivedPropertyAccess().getNameAssignment_1(), "rule__MdfDatasetDerivedProperty__NameAssignment_1");
					put(grammarAccess.getMdfDatasetDerivedPropertyAccess().getTypeAssignment_3(), "rule__MdfDatasetDerivedProperty__TypeAssignment_3");
					put(grammarAccess.getMdfDatasetDerivedPropertyAccess().getDefaultAssignment_4_2(), "rule__MdfDatasetDerivedProperty__DefaultAssignment_4_2");
					put(grammarAccess.getMdfDatasetDerivedPropertyAccess().getMultiplicityAssignment_5(), "rule__MdfDatasetDerivedProperty__MultiplicityAssignment_5");
					put(grammarAccess.getMdfDatasetDerivedPropertyAccess().getAnnotationsAssignment_6(), "rule__MdfDatasetDerivedProperty__AnnotationsAssignment_6");
					put(grammarAccess.getMdfDatasetMappedPropertyAccess().getDocumentationAssignment_0(), "rule__MdfDatasetMappedProperty__DocumentationAssignment_0");
					put(grammarAccess.getMdfDatasetMappedPropertyAccess().getNameAssignment_1(), "rule__MdfDatasetMappedProperty__NameAssignment_1");
					put(grammarAccess.getMdfDatasetMappedPropertyAccess().getUniqueAssignment_2(), "rule__MdfDatasetMappedProperty__UniqueAssignment_2");
					put(grammarAccess.getMdfDatasetMappedPropertyAccess().getSingleValuedAssignment_3(), "rule__MdfDatasetMappedProperty__SingleValuedAssignment_3");
					put(grammarAccess.getMdfDatasetMappedPropertyAccess().getPathAssignment_5(), "rule__MdfDatasetMappedProperty__PathAssignment_5");
					put(grammarAccess.getMdfDatasetMappedPropertyAccess().getLinkDatasetAssignment_6_1(), "rule__MdfDatasetMappedProperty__LinkDatasetAssignment_6_1");
					put(grammarAccess.getMdfDatasetMappedPropertyAccess().getAnnotationsAssignment_7(), "rule__MdfDatasetMappedProperty__AnnotationsAssignment_7");
					put(grammarAccess.getMdfEnumValueAccess().getDocumentationAssignment_0(), "rule__MdfEnumValue__DocumentationAssignment_0");
					put(grammarAccess.getMdfEnumValueAccess().getNameAssignment_1(), "rule__MdfEnumValue__NameAssignment_1");
					put(grammarAccess.getMdfEnumValueAccess().getValueAssignment_3(), "rule__MdfEnumValue__ValueAssignment_3");
					put(grammarAccess.getMdfEnumValueAccess().getAnnotationsAssignment_4(), "rule__MdfEnumValue__AnnotationsAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.odcgroup.domain.ui.contentassist.antlr.internal.InternalDomainParser typedParser = (com.odcgroup.domain.ui.contentassist.antlr.internal.InternalDomainParser) parser;
			typedParser.entryRuleMdfDomain();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT" };
	}
	
	public DomainGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DomainGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
