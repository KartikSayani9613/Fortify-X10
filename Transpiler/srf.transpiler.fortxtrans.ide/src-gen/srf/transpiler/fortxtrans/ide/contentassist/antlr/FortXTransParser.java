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
					put(grammarAccess.getModelAccess().getAlternatives(), "rule__Model__Alternatives");
					put(grammarAccess.getImportAccess().getAlternatives(), "rule__Import__Alternatives");
					put(grammarAccess.getExportAccess().getAlternatives(), "rule__Export__Alternatives");
					put(grammarAccess.getImportedNamesAccess().getAlternatives(), "rule__ImportedNames__Alternatives");
					put(grammarAccess.getAPINameAccess().getAlternatives(), "rule__APIName__Alternatives");
					put(grammarAccess.getSimpleNamesAccess().getAlternatives(), "rule__SimpleNames__Alternatives");
					put(grammarAccess.getAliasedAPINamesAccess().getAlternatives(), "rule__AliasedAPINames__Alternatives");
					put(grammarAccess.getAPIAccess().getGroup(), "rule__API__Group__0");
					put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
					put(grammarAccess.getImportAccess().getGroup_0(), "rule__Import__Group_0__0");
					put(grammarAccess.getImportAccess().getGroup_1(), "rule__Import__Group_1__0");
					put(grammarAccess.getExportAccess().getGroup_0(), "rule__Export__Group_0__0");
					put(grammarAccess.getExportAccess().getGroup_1(), "rule__Export__Group_1__0");
					put(grammarAccess.getExportAccess().getGroup_1_3(), "rule__Export__Group_1_3__0");
					put(grammarAccess.getImportedNamesAccess().getGroup_0(), "rule__ImportedNames__Group_0__0");
					put(grammarAccess.getImportedNamesAccess().getGroup_0_5(), "rule__ImportedNames__Group_0_5__0");
					put(grammarAccess.getImportedNamesAccess().getGroup_1(), "rule__ImportedNames__Group_1__0");
					put(grammarAccess.getImportedNamesAccess().getGroup_1_4(), "rule__ImportedNames__Group_1_4__0");
					put(grammarAccess.getImportedNamesAccess().getGroup_1_5(), "rule__ImportedNames__Group_1_5__0");
					put(grammarAccess.getImportedNamesAccess().getGroup_2(), "rule__ImportedNames__Group_2__0");
					put(grammarAccess.getImportedNamesAccess().getGroup_2_1(), "rule__ImportedNames__Group_2_1__0");
					put(grammarAccess.getAPINameAccess().getGroup_0(), "rule__APIName__Group_0__0");
					put(grammarAccess.getAPINameAccess().getGroup_1(), "rule__APIName__Group_1__0");
					put(grammarAccess.getAPINameAccess().getGroup_1_1(), "rule__APIName__Group_1_1__0");
					put(grammarAccess.getAPINameAccess().getGroup_2(), "rule__APIName__Group_2__0");
					put(grammarAccess.getAPINameAccess().getGroup_2_1(), "rule__APIName__Group_2_1__0");
					put(grammarAccess.getSimpleNamesAccess().getGroup_1(), "rule__SimpleNames__Group_1__0");
					put(grammarAccess.getSimpleNamesAccess().getGroup_1_2(), "rule__SimpleNames__Group_1_2__0");
					put(grammarAccess.getAliasedSimpleNameAccess().getGroup(), "rule__AliasedSimpleName__Group__0");
					put(grammarAccess.getAliasedSimpleNameAccess().getGroup_1(), "rule__AliasedSimpleName__Group_1__0");
					put(grammarAccess.getAliasedAPINamesAccess().getGroup_1(), "rule__AliasedAPINames__Group_1__0");
					put(grammarAccess.getAliasedAPINamesAccess().getGroup_1_2(), "rule__AliasedAPINames__Group_1_2__0");
					put(grammarAccess.getAliasedAPINameAccess().getGroup(), "rule__AliasedAPIName__Group__0");
					put(grammarAccess.getAliasedAPINameAccess().getGroup_1(), "rule__AliasedAPIName__Group_1__0");
					put(grammarAccess.getAPIAccess().getNameAssignment_1(), "rule__API__NameAssignment_1");
					put(grammarAccess.getAPIAccess().getImportsAssignment_2(), "rule__API__ImportsAssignment_2");
					put(grammarAccess.getComponentAccess().getNameAssignment_1(), "rule__Component__NameAssignment_1");
					put(grammarAccess.getComponentAccess().getImportsAssignment_2(), "rule__Component__ImportsAssignment_2");
					put(grammarAccess.getComponentAccess().getExportsAssignment_3(), "rule__Component__ExportsAssignment_3");
					put(grammarAccess.getImportAccess().getImpsAssignment_0_0(), "rule__Import__ImpsAssignment_0_0");
					put(grammarAccess.getImportAccess().getImportedNamesAssignment_0_1(), "rule__Import__ImportedNamesAssignment_0_1");
					put(grammarAccess.getImportAccess().getImpsAssignment_1_0(), "rule__Import__ImpsAssignment_1_0");
					put(grammarAccess.getImportAccess().getApiAssignment_1_1(), "rule__Import__ApiAssignment_1_1");
					put(grammarAccess.getImportAccess().getAliasedimportedNamesAssignment_1_2(), "rule__Import__AliasedimportedNamesAssignment_1_2");
					put(grammarAccess.getExportAccess().getExpAssignment_0_0(), "rule__Export__ExpAssignment_0_0");
					put(grammarAccess.getExportAccess().getExportedNameAssignment_0_1(), "rule__Export__ExportedNameAssignment_0_1");
					put(grammarAccess.getExportAccess().getExpAssignment_1_0(), "rule__Export__ExpAssignment_1_0");
					put(grammarAccess.getExportAccess().getBrackAssignment_1_1(), "rule__Export__BrackAssignment_1_1");
					put(grammarAccess.getExportAccess().getExportedNameAssignment_1_2(), "rule__Export__ExportedNameAssignment_1_2");
					put(grammarAccess.getExportAccess().getExportedNameAssignment_1_3_1(), "rule__Export__ExportedNameAssignment_1_3_1");
					put(grammarAccess.getImportedNamesAccess().getImpnameAssignment_0_0(), "rule__ImportedNames__ImpnameAssignment_0_0");
					put(grammarAccess.getImportedNamesAccess().getExceptAssignment_0_5_0(), "rule__ImportedNames__ExceptAssignment_0_5_0");
					put(grammarAccess.getImportedNamesAccess().getSimpAssignment_0_5_1(), "rule__ImportedNames__SimpAssignment_0_5_1");
					put(grammarAccess.getImportedNamesAccess().getImpnameAssignment_1_0(), "rule__ImportedNames__ImpnameAssignment_1_0");
					put(grammarAccess.getImportedNamesAccess().getSimpListAssignment_1_3(), "rule__ImportedNames__SimpListAssignment_1_3");
					put(grammarAccess.getImportedNamesAccess().getSimpListAssignment_1_4_1(), "rule__ImportedNames__SimpListAssignment_1_4_1");
					put(grammarAccess.getImportedNamesAccess().getCommaAssignment_1_5_0(), "rule__ImportedNames__CommaAssignment_1_5_0");
					put(grammarAccess.getImportedNamesAccess().getDotsAssignment_1_5_1(), "rule__ImportedNames__DotsAssignment_1_5_1");
					put(grammarAccess.getImportedNamesAccess().getImpnameAssignment_2_0(), "rule__ImportedNames__ImpnameAssignment_2_0");
					put(grammarAccess.getImportedNamesAccess().getAsnameAssignment_2_1_1(), "rule__ImportedNames__AsnameAssignment_2_1_1");
					put(grammarAccess.getSimpleNamesAccess().getNameListAssignment_0(), "rule__SimpleNames__NameListAssignment_0");
					put(grammarAccess.getSimpleNamesAccess().getBrackAssignment_1_0(), "rule__SimpleNames__BrackAssignment_1_0");
					put(grammarAccess.getSimpleNamesAccess().getNameListAssignment_1_1(), "rule__SimpleNames__NameListAssignment_1_1");
					put(grammarAccess.getSimpleNamesAccess().getNameListAssignment_1_2_1(), "rule__SimpleNames__NameListAssignment_1_2_1");
					put(grammarAccess.getSimpleNameAccess().getNameAssignment(), "rule__SimpleName__NameAssignment");
					put(grammarAccess.getAliasedSimpleNameAccess().getOrigAssignment_0(), "rule__AliasedSimpleName__OrigAssignment_0");
					put(grammarAccess.getAliasedSimpleNameAccess().getAsNameAssignment_1_1(), "rule__AliasedSimpleName__AsNameAssignment_1_1");
					put(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_0(), "rule__AliasedAPINames__NameListAssignment_0");
					put(grammarAccess.getAliasedAPINamesAccess().getBrackAssignment_1_0(), "rule__AliasedAPINames__BrackAssignment_1_0");
					put(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_1_1(), "rule__AliasedAPINames__NameListAssignment_1_1");
					put(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_1_2_1(), "rule__AliasedAPINames__NameListAssignment_1_2_1");
					put(grammarAccess.getAliasedAPINameAccess().getOrigAssignment_0(), "rule__AliasedAPIName__OrigAssignment_0");
					put(grammarAccess.getAliasedAPINameAccess().getAsNameAssignment_1_1(), "rule__AliasedAPIName__AsNameAssignment_1_1");
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
