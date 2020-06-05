/*
 * generated by Xtext 2.14.0
 */
package org.atlanmod.energy.estimation.dsl.parser.antlr;

import com.google.inject.Inject;
import org.atlanmod.energy.estimation.dsl.parser.antlr.internal.InternalEelParser;
import org.atlanmod.energy.estimation.dsl.services.EelGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class EelParser extends AbstractAntlrParser {

	@Inject
	private EelGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalEelParser createParser(XtextTokenStream stream) {
		return new InternalEelParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Platform";
	}

	public EelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}