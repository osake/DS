/*
* generated by Xtext
*/
package com.odcgroup.service.model.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.odcgroup.service.model.services.ComponentGrammarAccess;

public class ComponentParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {

	@Inject
	private ComponentGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
	}

	@Override
	protected com.odcgroup.service.model.parser.antlr.internal.InternalComponentParser createParser(XtextTokenStream stream) {
		return new com.odcgroup.service.model.parser.antlr.internal.InternalComponentParser(stream, getGrammarAccess());
	}

	@Override
	protected String getDefaultRuleName() {
		return "Component";
	}

	public ComponentGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ComponentGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

}