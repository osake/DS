/*
* generated by Xtext
*/
package com.odcgroup.domain.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.odcgroup.domain.services.DomainGrammarAccess;

public class DomainParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private DomainGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
	}
	
	@Override
	protected com.odcgroup.domain.parser.antlr.internal.InternalDomainParser createParser(XtextTokenStream stream) {
		return new com.odcgroup.domain.parser.antlr.internal.InternalDomainParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "MdfDomain";
	}
	
	public DomainGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DomainGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
