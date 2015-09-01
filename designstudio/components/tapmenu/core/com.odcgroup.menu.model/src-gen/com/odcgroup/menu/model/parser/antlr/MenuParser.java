/*
* generated by Xtext
*/
package com.odcgroup.menu.model.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.odcgroup.menu.model.services.MenuGrammarAccess;

public class MenuParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private MenuGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected com.odcgroup.menu.model.parser.antlr.internal.InternalMenuParser createParser(XtextTokenStream stream) {
		return new com.odcgroup.menu.model.parser.antlr.internal.InternalMenuParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "MenuRoot";
	}
	
	public MenuGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MenuGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
