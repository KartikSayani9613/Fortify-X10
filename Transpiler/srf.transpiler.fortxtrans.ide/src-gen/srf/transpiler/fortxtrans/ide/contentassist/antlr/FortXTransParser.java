/*
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import srf.transpiler.fortxtrans.ide.contentassist.antlr.internal.InternalFortXTransParser;
import srf.transpiler.fortxtrans.services.FortXTransGrammarAccess;

public class FortXTransParser extends AbstractContentAssistParser {

	@Inject
	private FortXTransGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalFortXTransParser createParser() {
		InternalFortXTransParser result = new InternalFortXTransParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFileAccess().getAlternatives(), "rule__File__Alternatives");
					put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
					put(grammarAccess.getApiAccess().getGroup(), "rule__Api__Group__0");
					put(grammarAccess.getComponentAccess().getNameAssignment_1(), "rule__Component__NameAssignment_1");
					put(grammarAccess.getApiAccess().getNameAssignment_1(), "rule__Api__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public FortXTransGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FortXTransGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
