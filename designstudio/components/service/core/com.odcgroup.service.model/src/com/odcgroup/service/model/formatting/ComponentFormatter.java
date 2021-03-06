/*
 * generated by Xtext
 */
package com.odcgroup.service.model.formatting;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;

import com.odcgroup.service.model.services.ComponentGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an
 * example
 */
public class ComponentFormatter extends AbstractDeclarativeFormatter {

	@Override
	protected void configureFormatting(FormattingConfig fConfig) {
		ComponentGrammarAccess gAccess = (ComponentGrammarAccess) getGrammarAccess();
		
		fConfig.setLinewrap().around(gAccess.getDocumentationRule());
		fConfig.setLinewrap().before(gAccess.getComponentAccess().getMetamodelVersionKeyword_3());
		fConfig.setLinewrap(2).after(gAccess.getComponentAccess().getMetamodelVersionKeyword_3());
		fConfig.setNoLinewrap().before(gAccess.getComponentAccess().getMetamodelVersionString_ValueParserRuleCall_4_0());
		fConfig.setLinewrap().before(gAccess.getMethodAnnotationRule());
		fConfig.setLinewrap(2).before(gAccess.getContentRule());
		
		final Set<String> allKeywords = GrammarUtil.getAllKeywords(grammar
				.getGrammar());
		List<Keyword> keywords = grammar.findKeywords(allKeywords.toArray(new String[allKeywords.size()]));
		for (final Keyword keyword : keywords) {
			String name = keyword.getValue();
			if (name.endsWith(")") || name.endsWith("{") || name.endsWith("}")) {
				fConfig.setLinewrap().before(keyword);
			} else if (name.contains("(")) {
				fConfig.setLinewrap().after(keyword);
			} else if (name.contains(",")) {
				fConfig.setNoSpace().before(keyword);
				fConfig.setLinewrap().after(keyword);				
			} 
		}
		
		// Linewrap before all keywords ending with ':'
		Set<String> subKeywords = new HashSet<String>();
		subKeywords.add("jBC:");
		subKeywords.add("t24:");
		subKeywords.add("fields:");
		keywords = gAccess.findKeywords(subKeywords.toArray(new String[subKeywords.size()]));
		for (final Keyword keyword : keywords) {
			fConfig.setLinewrap().before(keyword);
			fConfig.setIndentationIncrement().before(keyword);
			fConfig.setIndentationDecrement().after(keyword);
		}
		
		// Formatting of fields in METHOD operation
		fConfig.setIndentationIncrement().before(gAccess.getArgumentAccess().getInoutAssignment_1());
		fConfig.setIndentationDecrement().after(gAccess.getArgumentAccess().getInoutAssignment_1());
		// DS-6423 fConfig.setNoLinewrap().before(gAccess.getArgumentAccess().getAnnotationsAssignment_6());
		fConfig.setNoSpace().before(gAccess.getMethodAccess().getLeftParenthesisKeyword_5());
		
		// Formatting of fields in TABLE operation
		fConfig.setNoLinewrap().before(gAccess.getTableAccess().getLeftCurlyBracketKeyword_7_1());		
		fConfig.setIndentationIncrement().before(gAccess.getTableAccess().getRightCurlyBracketKeyword_7_3());
		fConfig.setIndentationDecrement().after(gAccess.getTableAccess().getRightCurlyBracketKeyword_7_3());
		
		fConfig.setLinewrap().before(gAccess.getTableAccess().getAttributeAssignment_7_2());
		fConfig.setIndentationIncrement().before(gAccess.getTableAccess().getAttributeAssignment_7_2());
		fConfig.setIndentationIncrement().before(gAccess.getTableAccess().getAttributeAssignment_7_2());
		fConfig.setIndentationDecrement().after(gAccess.getTableAccess().getAttributeAssignment_7_2());
		fConfig.setIndentationDecrement().after(gAccess.getTableAccess().getAttributeAssignment_7_2());
		
		// Formatting of Annotation
		fConfig.setNoSpace().after(gAccess.getMethodAnnotationAccess().getCommercialAtKeyword_0());
		fConfig.setNoSpace().around(gAccess.getMethodAnnotationAccess().getColonKeyword_2());
		fConfig.setNoSpace().before(gAccess.getMethodAnnotationAccess().getNameAssignment_3());
		fConfig.setNoLinewrap().before(gAccess.getMethodAnnotationAccess().getNameAssignment_3());

		// Formatting of Property
		fConfig.setNoSpace().before(gAccess.getPropertyAccess().getArrayLeftParenthesisKeyword_11_0_0());
		fConfig.setNoSpace().after(gAccess.getPropertyAccess().getArrayLeftParenthesisKeyword_11_0_0());
		fConfig.setNoLinewrap().after(gAccess.getPropertyAccess().getArrayLeftParenthesisKeyword_11_0_0());
		fConfig.setNoSpace().after(gAccess.getPropertyAccess().getValueINTTerminalRuleCall_11_1_0());
		fConfig.setNoLinewrap().before(gAccess.getPropertyAccess().getValueINTTerminalRuleCall_11_1_0());
		fConfig.setNoLinewrap().after(gAccess.getPropertyAccess().getValueINTTerminalRuleCall_11_1_0());
	}
}
