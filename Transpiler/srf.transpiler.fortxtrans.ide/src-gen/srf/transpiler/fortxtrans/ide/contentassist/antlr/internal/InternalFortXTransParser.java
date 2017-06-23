package srf.transpiler.fortxtrans.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import srf.transpiler.fortxtrans.services.FortXTransGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFortXTransParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'api'", "'end'", "'component'", "'}'", "','", "'.'", "'{'", "'...'", "'as'", "'import'", "'export'", "'except'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFortXTransParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFortXTransParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFortXTransParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFortXTrans.g"; }


    	private FortXTransGrammarAccess grammarAccess;

    	public void setGrammarAccess(FortXTransGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalFortXTrans.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalFortXTrans.g:54:1: ( ruleModel EOF )
            // InternalFortXTrans.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalFortXTrans.g:62:1: ruleModel : ( ( rule__Model__Alternatives ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:66:2: ( ( ( rule__Model__Alternatives ) ) )
            // InternalFortXTrans.g:67:2: ( ( rule__Model__Alternatives ) )
            {
            // InternalFortXTrans.g:67:2: ( ( rule__Model__Alternatives ) )
            // InternalFortXTrans.g:68:3: ( rule__Model__Alternatives )
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalFortXTrans.g:69:3: ( rule__Model__Alternatives )
            // InternalFortXTrans.g:69:4: rule__Model__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Model__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAPI"
    // InternalFortXTrans.g:78:1: entryRuleAPI : ruleAPI EOF ;
    public final void entryRuleAPI() throws RecognitionException {
        try {
            // InternalFortXTrans.g:79:1: ( ruleAPI EOF )
            // InternalFortXTrans.g:80:1: ruleAPI EOF
            {
             before(grammarAccess.getAPIRule()); 
            pushFollow(FOLLOW_1);
            ruleAPI();

            state._fsp--;

             after(grammarAccess.getAPIRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAPI"


    // $ANTLR start "ruleAPI"
    // InternalFortXTrans.g:87:1: ruleAPI : ( ( rule__API__Group__0 ) ) ;
    public final void ruleAPI() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:91:2: ( ( ( rule__API__Group__0 ) ) )
            // InternalFortXTrans.g:92:2: ( ( rule__API__Group__0 ) )
            {
            // InternalFortXTrans.g:92:2: ( ( rule__API__Group__0 ) )
            // InternalFortXTrans.g:93:3: ( rule__API__Group__0 )
            {
             before(grammarAccess.getAPIAccess().getGroup()); 
            // InternalFortXTrans.g:94:3: ( rule__API__Group__0 )
            // InternalFortXTrans.g:94:4: rule__API__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__API__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAPIAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAPI"


    // $ANTLR start "entryRuleComponent"
    // InternalFortXTrans.g:103:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalFortXTrans.g:104:1: ( ruleComponent EOF )
            // InternalFortXTrans.g:105:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalFortXTrans.g:112:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:116:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalFortXTrans.g:117:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalFortXTrans.g:117:2: ( ( rule__Component__Group__0 ) )
            // InternalFortXTrans.g:118:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalFortXTrans.g:119:3: ( rule__Component__Group__0 )
            // InternalFortXTrans.g:119:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleImport"
    // InternalFortXTrans.g:128:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalFortXTrans.g:129:1: ( ruleImport EOF )
            // InternalFortXTrans.g:130:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalFortXTrans.g:137:1: ruleImport : ( ( rule__Import__Alternatives ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:141:2: ( ( ( rule__Import__Alternatives ) ) )
            // InternalFortXTrans.g:142:2: ( ( rule__Import__Alternatives ) )
            {
            // InternalFortXTrans.g:142:2: ( ( rule__Import__Alternatives ) )
            // InternalFortXTrans.g:143:3: ( rule__Import__Alternatives )
            {
             before(grammarAccess.getImportAccess().getAlternatives()); 
            // InternalFortXTrans.g:144:3: ( rule__Import__Alternatives )
            // InternalFortXTrans.g:144:4: rule__Import__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Import__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleExport"
    // InternalFortXTrans.g:153:1: entryRuleExport : ruleExport EOF ;
    public final void entryRuleExport() throws RecognitionException {
        try {
            // InternalFortXTrans.g:154:1: ( ruleExport EOF )
            // InternalFortXTrans.g:155:1: ruleExport EOF
            {
             before(grammarAccess.getExportRule()); 
            pushFollow(FOLLOW_1);
            ruleExport();

            state._fsp--;

             after(grammarAccess.getExportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExport"


    // $ANTLR start "ruleExport"
    // InternalFortXTrans.g:162:1: ruleExport : ( ( rule__Export__Alternatives ) ) ;
    public final void ruleExport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:166:2: ( ( ( rule__Export__Alternatives ) ) )
            // InternalFortXTrans.g:167:2: ( ( rule__Export__Alternatives ) )
            {
            // InternalFortXTrans.g:167:2: ( ( rule__Export__Alternatives ) )
            // InternalFortXTrans.g:168:3: ( rule__Export__Alternatives )
            {
             before(grammarAccess.getExportAccess().getAlternatives()); 
            // InternalFortXTrans.g:169:3: ( rule__Export__Alternatives )
            // InternalFortXTrans.g:169:4: rule__Export__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Export__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExportAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExport"


    // $ANTLR start "entryRuleImportedNames"
    // InternalFortXTrans.g:178:1: entryRuleImportedNames : ruleImportedNames EOF ;
    public final void entryRuleImportedNames() throws RecognitionException {
        try {
            // InternalFortXTrans.g:179:1: ( ruleImportedNames EOF )
            // InternalFortXTrans.g:180:1: ruleImportedNames EOF
            {
             before(grammarAccess.getImportedNamesRule()); 
            pushFollow(FOLLOW_1);
            ruleImportedNames();

            state._fsp--;

             after(grammarAccess.getImportedNamesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportedNames"


    // $ANTLR start "ruleImportedNames"
    // InternalFortXTrans.g:187:1: ruleImportedNames : ( ( rule__ImportedNames__Alternatives ) ) ;
    public final void ruleImportedNames() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:191:2: ( ( ( rule__ImportedNames__Alternatives ) ) )
            // InternalFortXTrans.g:192:2: ( ( rule__ImportedNames__Alternatives ) )
            {
            // InternalFortXTrans.g:192:2: ( ( rule__ImportedNames__Alternatives ) )
            // InternalFortXTrans.g:193:3: ( rule__ImportedNames__Alternatives )
            {
             before(grammarAccess.getImportedNamesAccess().getAlternatives()); 
            // InternalFortXTrans.g:194:3: ( rule__ImportedNames__Alternatives )
            // InternalFortXTrans.g:194:4: rule__ImportedNames__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ImportedNames__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getImportedNamesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportedNames"


    // $ANTLR start "entryRuleAPIName"
    // InternalFortXTrans.g:203:1: entryRuleAPIName : ruleAPIName EOF ;
    public final void entryRuleAPIName() throws RecognitionException {
        try {
            // InternalFortXTrans.g:204:1: ( ruleAPIName EOF )
            // InternalFortXTrans.g:205:1: ruleAPIName EOF
            {
             before(grammarAccess.getAPINameRule()); 
            pushFollow(FOLLOW_1);
            ruleAPIName();

            state._fsp--;

             after(grammarAccess.getAPINameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAPIName"


    // $ANTLR start "ruleAPIName"
    // InternalFortXTrans.g:212:1: ruleAPIName : ( ( rule__APIName__Alternatives ) ) ;
    public final void ruleAPIName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:216:2: ( ( ( rule__APIName__Alternatives ) ) )
            // InternalFortXTrans.g:217:2: ( ( rule__APIName__Alternatives ) )
            {
            // InternalFortXTrans.g:217:2: ( ( rule__APIName__Alternatives ) )
            // InternalFortXTrans.g:218:3: ( rule__APIName__Alternatives )
            {
             before(grammarAccess.getAPINameAccess().getAlternatives()); 
            // InternalFortXTrans.g:219:3: ( rule__APIName__Alternatives )
            // InternalFortXTrans.g:219:4: rule__APIName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__APIName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAPINameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAPIName"


    // $ANTLR start "entryRuleSimpleNames"
    // InternalFortXTrans.g:228:1: entryRuleSimpleNames : ruleSimpleNames EOF ;
    public final void entryRuleSimpleNames() throws RecognitionException {
        try {
            // InternalFortXTrans.g:229:1: ( ruleSimpleNames EOF )
            // InternalFortXTrans.g:230:1: ruleSimpleNames EOF
            {
             before(grammarAccess.getSimpleNamesRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleNames();

            state._fsp--;

             after(grammarAccess.getSimpleNamesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleNames"


    // $ANTLR start "ruleSimpleNames"
    // InternalFortXTrans.g:237:1: ruleSimpleNames : ( ( rule__SimpleNames__Alternatives ) ) ;
    public final void ruleSimpleNames() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:241:2: ( ( ( rule__SimpleNames__Alternatives ) ) )
            // InternalFortXTrans.g:242:2: ( ( rule__SimpleNames__Alternatives ) )
            {
            // InternalFortXTrans.g:242:2: ( ( rule__SimpleNames__Alternatives ) )
            // InternalFortXTrans.g:243:3: ( rule__SimpleNames__Alternatives )
            {
             before(grammarAccess.getSimpleNamesAccess().getAlternatives()); 
            // InternalFortXTrans.g:244:3: ( rule__SimpleNames__Alternatives )
            // InternalFortXTrans.g:244:4: rule__SimpleNames__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SimpleNames__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleNamesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleNames"


    // $ANTLR start "entryRuleSimpleName"
    // InternalFortXTrans.g:253:1: entryRuleSimpleName : ruleSimpleName EOF ;
    public final void entryRuleSimpleName() throws RecognitionException {
        try {
            // InternalFortXTrans.g:254:1: ( ruleSimpleName EOF )
            // InternalFortXTrans.g:255:1: ruleSimpleName EOF
            {
             before(grammarAccess.getSimpleNameRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleName();

            state._fsp--;

             after(grammarAccess.getSimpleNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleName"


    // $ANTLR start "ruleSimpleName"
    // InternalFortXTrans.g:262:1: ruleSimpleName : ( ( rule__SimpleName__NameAssignment ) ) ;
    public final void ruleSimpleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:266:2: ( ( ( rule__SimpleName__NameAssignment ) ) )
            // InternalFortXTrans.g:267:2: ( ( rule__SimpleName__NameAssignment ) )
            {
            // InternalFortXTrans.g:267:2: ( ( rule__SimpleName__NameAssignment ) )
            // InternalFortXTrans.g:268:3: ( rule__SimpleName__NameAssignment )
            {
             before(grammarAccess.getSimpleNameAccess().getNameAssignment()); 
            // InternalFortXTrans.g:269:3: ( rule__SimpleName__NameAssignment )
            // InternalFortXTrans.g:269:4: rule__SimpleName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SimpleName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSimpleNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleName"


    // $ANTLR start "entryRuleAliasedSimpleName"
    // InternalFortXTrans.g:278:1: entryRuleAliasedSimpleName : ruleAliasedSimpleName EOF ;
    public final void entryRuleAliasedSimpleName() throws RecognitionException {
        try {
            // InternalFortXTrans.g:279:1: ( ruleAliasedSimpleName EOF )
            // InternalFortXTrans.g:280:1: ruleAliasedSimpleName EOF
            {
             before(grammarAccess.getAliasedSimpleNameRule()); 
            pushFollow(FOLLOW_1);
            ruleAliasedSimpleName();

            state._fsp--;

             after(grammarAccess.getAliasedSimpleNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAliasedSimpleName"


    // $ANTLR start "ruleAliasedSimpleName"
    // InternalFortXTrans.g:287:1: ruleAliasedSimpleName : ( ( rule__AliasedSimpleName__Group__0 ) ) ;
    public final void ruleAliasedSimpleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:291:2: ( ( ( rule__AliasedSimpleName__Group__0 ) ) )
            // InternalFortXTrans.g:292:2: ( ( rule__AliasedSimpleName__Group__0 ) )
            {
            // InternalFortXTrans.g:292:2: ( ( rule__AliasedSimpleName__Group__0 ) )
            // InternalFortXTrans.g:293:3: ( rule__AliasedSimpleName__Group__0 )
            {
             before(grammarAccess.getAliasedSimpleNameAccess().getGroup()); 
            // InternalFortXTrans.g:294:3: ( rule__AliasedSimpleName__Group__0 )
            // InternalFortXTrans.g:294:4: rule__AliasedSimpleName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AliasedSimpleName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAliasedSimpleNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAliasedSimpleName"


    // $ANTLR start "entryRuleAliasedAPINames"
    // InternalFortXTrans.g:303:1: entryRuleAliasedAPINames : ruleAliasedAPINames EOF ;
    public final void entryRuleAliasedAPINames() throws RecognitionException {
        try {
            // InternalFortXTrans.g:304:1: ( ruleAliasedAPINames EOF )
            // InternalFortXTrans.g:305:1: ruleAliasedAPINames EOF
            {
             before(grammarAccess.getAliasedAPINamesRule()); 
            pushFollow(FOLLOW_1);
            ruleAliasedAPINames();

            state._fsp--;

             after(grammarAccess.getAliasedAPINamesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAliasedAPINames"


    // $ANTLR start "ruleAliasedAPINames"
    // InternalFortXTrans.g:312:1: ruleAliasedAPINames : ( ( rule__AliasedAPINames__Alternatives ) ) ;
    public final void ruleAliasedAPINames() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:316:2: ( ( ( rule__AliasedAPINames__Alternatives ) ) )
            // InternalFortXTrans.g:317:2: ( ( rule__AliasedAPINames__Alternatives ) )
            {
            // InternalFortXTrans.g:317:2: ( ( rule__AliasedAPINames__Alternatives ) )
            // InternalFortXTrans.g:318:3: ( rule__AliasedAPINames__Alternatives )
            {
             before(grammarAccess.getAliasedAPINamesAccess().getAlternatives()); 
            // InternalFortXTrans.g:319:3: ( rule__AliasedAPINames__Alternatives )
            // InternalFortXTrans.g:319:4: rule__AliasedAPINames__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AliasedAPINames__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAliasedAPINamesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAliasedAPINames"


    // $ANTLR start "entryRuleAliasedAPIName"
    // InternalFortXTrans.g:328:1: entryRuleAliasedAPIName : ruleAliasedAPIName EOF ;
    public final void entryRuleAliasedAPIName() throws RecognitionException {
        try {
            // InternalFortXTrans.g:329:1: ( ruleAliasedAPIName EOF )
            // InternalFortXTrans.g:330:1: ruleAliasedAPIName EOF
            {
             before(grammarAccess.getAliasedAPINameRule()); 
            pushFollow(FOLLOW_1);
            ruleAliasedAPIName();

            state._fsp--;

             after(grammarAccess.getAliasedAPINameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAliasedAPIName"


    // $ANTLR start "ruleAliasedAPIName"
    // InternalFortXTrans.g:337:1: ruleAliasedAPIName : ( ( rule__AliasedAPIName__Group__0 ) ) ;
    public final void ruleAliasedAPIName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:341:2: ( ( ( rule__AliasedAPIName__Group__0 ) ) )
            // InternalFortXTrans.g:342:2: ( ( rule__AliasedAPIName__Group__0 ) )
            {
            // InternalFortXTrans.g:342:2: ( ( rule__AliasedAPIName__Group__0 ) )
            // InternalFortXTrans.g:343:3: ( rule__AliasedAPIName__Group__0 )
            {
             before(grammarAccess.getAliasedAPINameAccess().getGroup()); 
            // InternalFortXTrans.g:344:3: ( rule__AliasedAPIName__Group__0 )
            // InternalFortXTrans.g:344:4: rule__AliasedAPIName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AliasedAPIName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAliasedAPINameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAliasedAPIName"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalFortXTrans.g:352:1: rule__Model__Alternatives : ( ( ruleComponent ) | ( ruleAPI ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:356:1: ( ( ruleComponent ) | ( ruleAPI ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==11) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalFortXTrans.g:357:2: ( ruleComponent )
                    {
                    // InternalFortXTrans.g:357:2: ( ruleComponent )
                    // InternalFortXTrans.g:358:3: ruleComponent
                    {
                     before(grammarAccess.getModelAccess().getComponentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComponent();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getComponentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:363:2: ( ruleAPI )
                    {
                    // InternalFortXTrans.g:363:2: ( ruleAPI )
                    // InternalFortXTrans.g:364:3: ruleAPI
                    {
                     before(grammarAccess.getModelAccess().getAPIParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAPI();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getAPIParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__Import__Alternatives"
    // InternalFortXTrans.g:373:1: rule__Import__Alternatives : ( ( ( rule__Import__Group_0__0 ) ) | ( ( rule__Import__Group_1__0 ) ) );
    public final void rule__Import__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:377:1: ( ( ( rule__Import__Group_0__0 ) ) | ( ( rule__Import__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    alt2=1;
                }
                else if ( (LA2_1==11) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFortXTrans.g:378:2: ( ( rule__Import__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:378:2: ( ( rule__Import__Group_0__0 ) )
                    // InternalFortXTrans.g:379:3: ( rule__Import__Group_0__0 )
                    {
                     before(grammarAccess.getImportAccess().getGroup_0()); 
                    // InternalFortXTrans.g:380:3: ( rule__Import__Group_0__0 )
                    // InternalFortXTrans.g:380:4: rule__Import__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Import__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:384:2: ( ( rule__Import__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:384:2: ( ( rule__Import__Group_1__0 ) )
                    // InternalFortXTrans.g:385:3: ( rule__Import__Group_1__0 )
                    {
                     before(grammarAccess.getImportAccess().getGroup_1()); 
                    // InternalFortXTrans.g:386:3: ( rule__Import__Group_1__0 )
                    // InternalFortXTrans.g:386:4: rule__Import__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Import__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Alternatives"


    // $ANTLR start "rule__Export__Alternatives"
    // InternalFortXTrans.g:394:1: rule__Export__Alternatives : ( ( ( rule__Export__Group_0__0 ) ) | ( ( rule__Export__Group_1__0 ) ) );
    public final void rule__Export__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:398:1: ( ( ( rule__Export__Group_0__0 ) ) | ( ( rule__Export__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    alt3=1;
                }
                else if ( (LA3_1==17) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFortXTrans.g:399:2: ( ( rule__Export__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:399:2: ( ( rule__Export__Group_0__0 ) )
                    // InternalFortXTrans.g:400:3: ( rule__Export__Group_0__0 )
                    {
                     before(grammarAccess.getExportAccess().getGroup_0()); 
                    // InternalFortXTrans.g:401:3: ( rule__Export__Group_0__0 )
                    // InternalFortXTrans.g:401:4: rule__Export__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Export__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExportAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:405:2: ( ( rule__Export__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:405:2: ( ( rule__Export__Group_1__0 ) )
                    // InternalFortXTrans.g:406:3: ( rule__Export__Group_1__0 )
                    {
                     before(grammarAccess.getExportAccess().getGroup_1()); 
                    // InternalFortXTrans.g:407:3: ( rule__Export__Group_1__0 )
                    // InternalFortXTrans.g:407:4: rule__Export__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Export__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExportAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Alternatives"


    // $ANTLR start "rule__ImportedNames__Alternatives"
    // InternalFortXTrans.g:415:1: rule__ImportedNames__Alternatives : ( ( ( rule__ImportedNames__Group_0__0 ) ) | ( ( rule__ImportedNames__Group_1__0 ) ) | ( ( rule__ImportedNames__Group_2__0 ) ) );
    public final void rule__ImportedNames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:419:1: ( ( ( rule__ImportedNames__Group_0__0 ) ) | ( ( rule__ImportedNames__Group_1__0 ) ) | ( ( rule__ImportedNames__Group_2__0 ) ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalFortXTrans.g:420:2: ( ( rule__ImportedNames__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:420:2: ( ( rule__ImportedNames__Group_0__0 ) )
                    // InternalFortXTrans.g:421:3: ( rule__ImportedNames__Group_0__0 )
                    {
                     before(grammarAccess.getImportedNamesAccess().getGroup_0()); 
                    // InternalFortXTrans.g:422:3: ( rule__ImportedNames__Group_0__0 )
                    // InternalFortXTrans.g:422:4: rule__ImportedNames__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImportedNames__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportedNamesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:426:2: ( ( rule__ImportedNames__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:426:2: ( ( rule__ImportedNames__Group_1__0 ) )
                    // InternalFortXTrans.g:427:3: ( rule__ImportedNames__Group_1__0 )
                    {
                     before(grammarAccess.getImportedNamesAccess().getGroup_1()); 
                    // InternalFortXTrans.g:428:3: ( rule__ImportedNames__Group_1__0 )
                    // InternalFortXTrans.g:428:4: rule__ImportedNames__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImportedNames__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportedNamesAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:432:2: ( ( rule__ImportedNames__Group_2__0 ) )
                    {
                    // InternalFortXTrans.g:432:2: ( ( rule__ImportedNames__Group_2__0 ) )
                    // InternalFortXTrans.g:433:3: ( rule__ImportedNames__Group_2__0 )
                    {
                     before(grammarAccess.getImportedNamesAccess().getGroup_2()); 
                    // InternalFortXTrans.g:434:3: ( rule__ImportedNames__Group_2__0 )
                    // InternalFortXTrans.g:434:4: rule__ImportedNames__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImportedNames__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportedNamesAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Alternatives"


    // $ANTLR start "rule__APIName__Alternatives"
    // InternalFortXTrans.g:442:1: rule__APIName__Alternatives : ( ( ( rule__APIName__Group_0__0 ) ) | ( ( rule__APIName__Group_1__0 ) ) | ( ( rule__APIName__Group_2__0 ) ) );
    public final void rule__APIName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:446:1: ( ( ( rule__APIName__Group_0__0 ) ) | ( ( rule__APIName__Group_1__0 ) ) | ( ( rule__APIName__Group_2__0 ) ) )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalFortXTrans.g:447:2: ( ( rule__APIName__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:447:2: ( ( rule__APIName__Group_0__0 ) )
                    // InternalFortXTrans.g:448:3: ( rule__APIName__Group_0__0 )
                    {
                     before(grammarAccess.getAPINameAccess().getGroup_0()); 
                    // InternalFortXTrans.g:449:3: ( rule__APIName__Group_0__0 )
                    // InternalFortXTrans.g:449:4: rule__APIName__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__APIName__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAPINameAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:453:2: ( ( rule__APIName__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:453:2: ( ( rule__APIName__Group_1__0 ) )
                    // InternalFortXTrans.g:454:3: ( rule__APIName__Group_1__0 )
                    {
                     before(grammarAccess.getAPINameAccess().getGroup_1()); 
                    // InternalFortXTrans.g:455:3: ( rule__APIName__Group_1__0 )
                    // InternalFortXTrans.g:455:4: rule__APIName__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__APIName__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAPINameAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:459:2: ( ( rule__APIName__Group_2__0 ) )
                    {
                    // InternalFortXTrans.g:459:2: ( ( rule__APIName__Group_2__0 ) )
                    // InternalFortXTrans.g:460:3: ( rule__APIName__Group_2__0 )
                    {
                     before(grammarAccess.getAPINameAccess().getGroup_2()); 
                    // InternalFortXTrans.g:461:3: ( rule__APIName__Group_2__0 )
                    // InternalFortXTrans.g:461:4: rule__APIName__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__APIName__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAPINameAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Alternatives"


    // $ANTLR start "rule__SimpleNames__Alternatives"
    // InternalFortXTrans.g:469:1: rule__SimpleNames__Alternatives : ( ( ( rule__SimpleNames__NameListAssignment_0 ) ) | ( ( rule__SimpleNames__Group_1__0 ) ) );
    public final void rule__SimpleNames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:473:1: ( ( ( rule__SimpleNames__NameListAssignment_0 ) ) | ( ( rule__SimpleNames__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalFortXTrans.g:474:2: ( ( rule__SimpleNames__NameListAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:474:2: ( ( rule__SimpleNames__NameListAssignment_0 ) )
                    // InternalFortXTrans.g:475:3: ( rule__SimpleNames__NameListAssignment_0 )
                    {
                     before(grammarAccess.getSimpleNamesAccess().getNameListAssignment_0()); 
                    // InternalFortXTrans.g:476:3: ( rule__SimpleNames__NameListAssignment_0 )
                    // InternalFortXTrans.g:476:4: rule__SimpleNames__NameListAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleNames__NameListAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleNamesAccess().getNameListAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:480:2: ( ( rule__SimpleNames__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:480:2: ( ( rule__SimpleNames__Group_1__0 ) )
                    // InternalFortXTrans.g:481:3: ( rule__SimpleNames__Group_1__0 )
                    {
                     before(grammarAccess.getSimpleNamesAccess().getGroup_1()); 
                    // InternalFortXTrans.g:482:3: ( rule__SimpleNames__Group_1__0 )
                    // InternalFortXTrans.g:482:4: rule__SimpleNames__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleNames__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleNamesAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleNames__Alternatives"


    // $ANTLR start "rule__AliasedAPINames__Alternatives"
    // InternalFortXTrans.g:490:1: rule__AliasedAPINames__Alternatives : ( ( ( rule__AliasedAPINames__NameListAssignment_0 ) ) | ( ( rule__AliasedAPINames__Group_1__0 ) ) );
    public final void rule__AliasedAPINames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:494:1: ( ( ( rule__AliasedAPINames__NameListAssignment_0 ) ) | ( ( rule__AliasedAPINames__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFortXTrans.g:495:2: ( ( rule__AliasedAPINames__NameListAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:495:2: ( ( rule__AliasedAPINames__NameListAssignment_0 ) )
                    // InternalFortXTrans.g:496:3: ( rule__AliasedAPINames__NameListAssignment_0 )
                    {
                     before(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_0()); 
                    // InternalFortXTrans.g:497:3: ( rule__AliasedAPINames__NameListAssignment_0 )
                    // InternalFortXTrans.g:497:4: rule__AliasedAPINames__NameListAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AliasedAPINames__NameListAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:501:2: ( ( rule__AliasedAPINames__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:501:2: ( ( rule__AliasedAPINames__Group_1__0 ) )
                    // InternalFortXTrans.g:502:3: ( rule__AliasedAPINames__Group_1__0 )
                    {
                     before(grammarAccess.getAliasedAPINamesAccess().getGroup_1()); 
                    // InternalFortXTrans.g:503:3: ( rule__AliasedAPINames__Group_1__0 )
                    // InternalFortXTrans.g:503:4: rule__AliasedAPINames__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AliasedAPINames__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAliasedAPINamesAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPINames__Alternatives"


    // $ANTLR start "rule__API__Group__0"
    // InternalFortXTrans.g:511:1: rule__API__Group__0 : rule__API__Group__0__Impl rule__API__Group__1 ;
    public final void rule__API__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:515:1: ( rule__API__Group__0__Impl rule__API__Group__1 )
            // InternalFortXTrans.g:516:2: rule__API__Group__0__Impl rule__API__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__API__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__API__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__API__Group__0"


    // $ANTLR start "rule__API__Group__0__Impl"
    // InternalFortXTrans.g:523:1: rule__API__Group__0__Impl : ( 'api' ) ;
    public final void rule__API__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:527:1: ( ( 'api' ) )
            // InternalFortXTrans.g:528:1: ( 'api' )
            {
            // InternalFortXTrans.g:528:1: ( 'api' )
            // InternalFortXTrans.g:529:2: 'api'
            {
             before(grammarAccess.getAPIAccess().getApiKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAPIAccess().getApiKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__API__Group__0__Impl"


    // $ANTLR start "rule__API__Group__1"
    // InternalFortXTrans.g:538:1: rule__API__Group__1 : rule__API__Group__1__Impl rule__API__Group__2 ;
    public final void rule__API__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:542:1: ( rule__API__Group__1__Impl rule__API__Group__2 )
            // InternalFortXTrans.g:543:2: rule__API__Group__1__Impl rule__API__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__API__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__API__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__API__Group__1"


    // $ANTLR start "rule__API__Group__1__Impl"
    // InternalFortXTrans.g:550:1: rule__API__Group__1__Impl : ( ( rule__API__NameAssignment_1 ) ) ;
    public final void rule__API__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:554:1: ( ( ( rule__API__NameAssignment_1 ) ) )
            // InternalFortXTrans.g:555:1: ( ( rule__API__NameAssignment_1 ) )
            {
            // InternalFortXTrans.g:555:1: ( ( rule__API__NameAssignment_1 ) )
            // InternalFortXTrans.g:556:2: ( rule__API__NameAssignment_1 )
            {
             before(grammarAccess.getAPIAccess().getNameAssignment_1()); 
            // InternalFortXTrans.g:557:2: ( rule__API__NameAssignment_1 )
            // InternalFortXTrans.g:557:3: rule__API__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__API__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAPIAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__API__Group__1__Impl"


    // $ANTLR start "rule__API__Group__2"
    // InternalFortXTrans.g:565:1: rule__API__Group__2 : rule__API__Group__2__Impl rule__API__Group__3 ;
    public final void rule__API__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:569:1: ( rule__API__Group__2__Impl rule__API__Group__3 )
            // InternalFortXTrans.g:570:2: rule__API__Group__2__Impl rule__API__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__API__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__API__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__API__Group__2"


    // $ANTLR start "rule__API__Group__2__Impl"
    // InternalFortXTrans.g:577:1: rule__API__Group__2__Impl : ( ( rule__API__ImportsAssignment_2 )* ) ;
    public final void rule__API__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:581:1: ( ( ( rule__API__ImportsAssignment_2 )* ) )
            // InternalFortXTrans.g:582:1: ( ( rule__API__ImportsAssignment_2 )* )
            {
            // InternalFortXTrans.g:582:1: ( ( rule__API__ImportsAssignment_2 )* )
            // InternalFortXTrans.g:583:2: ( rule__API__ImportsAssignment_2 )*
            {
             before(grammarAccess.getAPIAccess().getImportsAssignment_2()); 
            // InternalFortXTrans.g:584:2: ( rule__API__ImportsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFortXTrans.g:584:3: rule__API__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__API__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getAPIAccess().getImportsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__API__Group__2__Impl"


    // $ANTLR start "rule__API__Group__3"
    // InternalFortXTrans.g:592:1: rule__API__Group__3 : rule__API__Group__3__Impl ;
    public final void rule__API__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:596:1: ( rule__API__Group__3__Impl )
            // InternalFortXTrans.g:597:2: rule__API__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__API__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__API__Group__3"


    // $ANTLR start "rule__API__Group__3__Impl"
    // InternalFortXTrans.g:603:1: rule__API__Group__3__Impl : ( 'end' ) ;
    public final void rule__API__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:607:1: ( ( 'end' ) )
            // InternalFortXTrans.g:608:1: ( 'end' )
            {
            // InternalFortXTrans.g:608:1: ( 'end' )
            // InternalFortXTrans.g:609:2: 'end'
            {
             before(grammarAccess.getAPIAccess().getEndKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAPIAccess().getEndKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__API__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalFortXTrans.g:619:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:623:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalFortXTrans.g:624:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalFortXTrans.g:631:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:635:1: ( ( 'component' ) )
            // InternalFortXTrans.g:636:1: ( 'component' )
            {
            // InternalFortXTrans.g:636:1: ( 'component' )
            // InternalFortXTrans.g:637:2: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalFortXTrans.g:646:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:650:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalFortXTrans.g:651:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalFortXTrans.g:658:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:662:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalFortXTrans.g:663:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalFortXTrans.g:663:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalFortXTrans.g:664:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalFortXTrans.g:665:2: ( rule__Component__NameAssignment_1 )
            // InternalFortXTrans.g:665:3: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalFortXTrans.g:673:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:677:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalFortXTrans.g:678:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalFortXTrans.g:685:1: rule__Component__Group__2__Impl : ( ( rule__Component__ImportsAssignment_2 )* ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:689:1: ( ( ( rule__Component__ImportsAssignment_2 )* ) )
            // InternalFortXTrans.g:690:1: ( ( rule__Component__ImportsAssignment_2 )* )
            {
            // InternalFortXTrans.g:690:1: ( ( rule__Component__ImportsAssignment_2 )* )
            // InternalFortXTrans.g:691:2: ( rule__Component__ImportsAssignment_2 )*
            {
             before(grammarAccess.getComponentAccess().getImportsAssignment_2()); 
            // InternalFortXTrans.g:692:2: ( rule__Component__ImportsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFortXTrans.g:692:3: rule__Component__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Component__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getImportsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalFortXTrans.g:700:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:704:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalFortXTrans.g:705:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalFortXTrans.g:712:1: rule__Component__Group__3__Impl : ( ( rule__Component__ExportsAssignment_3 )* ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:716:1: ( ( ( rule__Component__ExportsAssignment_3 )* ) )
            // InternalFortXTrans.g:717:1: ( ( rule__Component__ExportsAssignment_3 )* )
            {
            // InternalFortXTrans.g:717:1: ( ( rule__Component__ExportsAssignment_3 )* )
            // InternalFortXTrans.g:718:2: ( rule__Component__ExportsAssignment_3 )*
            {
             before(grammarAccess.getComponentAccess().getExportsAssignment_3()); 
            // InternalFortXTrans.g:719:2: ( rule__Component__ExportsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFortXTrans.g:719:3: rule__Component__ExportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Component__ExportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getExportsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // InternalFortXTrans.g:727:1: rule__Component__Group__4 : rule__Component__Group__4__Impl ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:731:1: ( rule__Component__Group__4__Impl )
            // InternalFortXTrans.g:732:2: rule__Component__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // InternalFortXTrans.g:738:1: rule__Component__Group__4__Impl : ( 'end' ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:742:1: ( ( 'end' ) )
            // InternalFortXTrans.g:743:1: ( 'end' )
            {
            // InternalFortXTrans.g:743:1: ( 'end' )
            // InternalFortXTrans.g:744:2: 'end'
            {
             before(grammarAccess.getComponentAccess().getEndKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getEndKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Import__Group_0__0"
    // InternalFortXTrans.g:754:1: rule__Import__Group_0__0 : rule__Import__Group_0__0__Impl rule__Import__Group_0__1 ;
    public final void rule__Import__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:758:1: ( rule__Import__Group_0__0__Impl rule__Import__Group_0__1 )
            // InternalFortXTrans.g:759:2: rule__Import__Group_0__0__Impl rule__Import__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Import__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_0__0"


    // $ANTLR start "rule__Import__Group_0__0__Impl"
    // InternalFortXTrans.g:766:1: rule__Import__Group_0__0__Impl : ( ( rule__Import__ImpsAssignment_0_0 ) ) ;
    public final void rule__Import__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:770:1: ( ( ( rule__Import__ImpsAssignment_0_0 ) ) )
            // InternalFortXTrans.g:771:1: ( ( rule__Import__ImpsAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:771:1: ( ( rule__Import__ImpsAssignment_0_0 ) )
            // InternalFortXTrans.g:772:2: ( rule__Import__ImpsAssignment_0_0 )
            {
             before(grammarAccess.getImportAccess().getImpsAssignment_0_0()); 
            // InternalFortXTrans.g:773:2: ( rule__Import__ImpsAssignment_0_0 )
            // InternalFortXTrans.g:773:3: rule__Import__ImpsAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImpsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImpsAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_0__0__Impl"


    // $ANTLR start "rule__Import__Group_0__1"
    // InternalFortXTrans.g:781:1: rule__Import__Group_0__1 : rule__Import__Group_0__1__Impl ;
    public final void rule__Import__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:785:1: ( rule__Import__Group_0__1__Impl )
            // InternalFortXTrans.g:786:2: rule__Import__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_0__1"


    // $ANTLR start "rule__Import__Group_0__1__Impl"
    // InternalFortXTrans.g:792:1: rule__Import__Group_0__1__Impl : ( ( rule__Import__ImportedNamesAssignment_0_1 ) ) ;
    public final void rule__Import__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:796:1: ( ( ( rule__Import__ImportedNamesAssignment_0_1 ) ) )
            // InternalFortXTrans.g:797:1: ( ( rule__Import__ImportedNamesAssignment_0_1 ) )
            {
            // InternalFortXTrans.g:797:1: ( ( rule__Import__ImportedNamesAssignment_0_1 ) )
            // InternalFortXTrans.g:798:2: ( rule__Import__ImportedNamesAssignment_0_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamesAssignment_0_1()); 
            // InternalFortXTrans.g:799:2: ( rule__Import__ImportedNamesAssignment_0_1 )
            // InternalFortXTrans.g:799:3: rule__Import__ImportedNamesAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamesAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamesAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_0__1__Impl"


    // $ANTLR start "rule__Import__Group_1__0"
    // InternalFortXTrans.g:808:1: rule__Import__Group_1__0 : rule__Import__Group_1__0__Impl rule__Import__Group_1__1 ;
    public final void rule__Import__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:812:1: ( rule__Import__Group_1__0__Impl rule__Import__Group_1__1 )
            // InternalFortXTrans.g:813:2: rule__Import__Group_1__0__Impl rule__Import__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Import__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1__0"


    // $ANTLR start "rule__Import__Group_1__0__Impl"
    // InternalFortXTrans.g:820:1: rule__Import__Group_1__0__Impl : ( ( rule__Import__ImpsAssignment_1_0 ) ) ;
    public final void rule__Import__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:824:1: ( ( ( rule__Import__ImpsAssignment_1_0 ) ) )
            // InternalFortXTrans.g:825:1: ( ( rule__Import__ImpsAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:825:1: ( ( rule__Import__ImpsAssignment_1_0 ) )
            // InternalFortXTrans.g:826:2: ( rule__Import__ImpsAssignment_1_0 )
            {
             before(grammarAccess.getImportAccess().getImpsAssignment_1_0()); 
            // InternalFortXTrans.g:827:2: ( rule__Import__ImpsAssignment_1_0 )
            // InternalFortXTrans.g:827:3: rule__Import__ImpsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImpsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImpsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1__0__Impl"


    // $ANTLR start "rule__Import__Group_1__1"
    // InternalFortXTrans.g:835:1: rule__Import__Group_1__1 : rule__Import__Group_1__1__Impl rule__Import__Group_1__2 ;
    public final void rule__Import__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:839:1: ( rule__Import__Group_1__1__Impl rule__Import__Group_1__2 )
            // InternalFortXTrans.g:840:2: rule__Import__Group_1__1__Impl rule__Import__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Import__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1__1"


    // $ANTLR start "rule__Import__Group_1__1__Impl"
    // InternalFortXTrans.g:847:1: rule__Import__Group_1__1__Impl : ( ( rule__Import__ApiAssignment_1_1 ) ) ;
    public final void rule__Import__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:851:1: ( ( ( rule__Import__ApiAssignment_1_1 ) ) )
            // InternalFortXTrans.g:852:1: ( ( rule__Import__ApiAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:852:1: ( ( rule__Import__ApiAssignment_1_1 ) )
            // InternalFortXTrans.g:853:2: ( rule__Import__ApiAssignment_1_1 )
            {
             before(grammarAccess.getImportAccess().getApiAssignment_1_1()); 
            // InternalFortXTrans.g:854:2: ( rule__Import__ApiAssignment_1_1 )
            // InternalFortXTrans.g:854:3: rule__Import__ApiAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ApiAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getApiAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1__1__Impl"


    // $ANTLR start "rule__Import__Group_1__2"
    // InternalFortXTrans.g:862:1: rule__Import__Group_1__2 : rule__Import__Group_1__2__Impl ;
    public final void rule__Import__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:866:1: ( rule__Import__Group_1__2__Impl )
            // InternalFortXTrans.g:867:2: rule__Import__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1__2"


    // $ANTLR start "rule__Import__Group_1__2__Impl"
    // InternalFortXTrans.g:873:1: rule__Import__Group_1__2__Impl : ( ( rule__Import__AliasedimportedNamesAssignment_1_2 ) ) ;
    public final void rule__Import__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:877:1: ( ( ( rule__Import__AliasedimportedNamesAssignment_1_2 ) ) )
            // InternalFortXTrans.g:878:1: ( ( rule__Import__AliasedimportedNamesAssignment_1_2 ) )
            {
            // InternalFortXTrans.g:878:1: ( ( rule__Import__AliasedimportedNamesAssignment_1_2 ) )
            // InternalFortXTrans.g:879:2: ( rule__Import__AliasedimportedNamesAssignment_1_2 )
            {
             before(grammarAccess.getImportAccess().getAliasedimportedNamesAssignment_1_2()); 
            // InternalFortXTrans.g:880:2: ( rule__Import__AliasedimportedNamesAssignment_1_2 )
            // InternalFortXTrans.g:880:3: rule__Import__AliasedimportedNamesAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Import__AliasedimportedNamesAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getAliasedimportedNamesAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1__2__Impl"


    // $ANTLR start "rule__Export__Group_0__0"
    // InternalFortXTrans.g:889:1: rule__Export__Group_0__0 : rule__Export__Group_0__0__Impl rule__Export__Group_0__1 ;
    public final void rule__Export__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:893:1: ( rule__Export__Group_0__0__Impl rule__Export__Group_0__1 )
            // InternalFortXTrans.g:894:2: rule__Export__Group_0__0__Impl rule__Export__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Export__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Export__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group_0__0"


    // $ANTLR start "rule__Export__Group_0__0__Impl"
    // InternalFortXTrans.g:901:1: rule__Export__Group_0__0__Impl : ( ( rule__Export__ExpAssignment_0_0 ) ) ;
    public final void rule__Export__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:905:1: ( ( ( rule__Export__ExpAssignment_0_0 ) ) )
            // InternalFortXTrans.g:906:1: ( ( rule__Export__ExpAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:906:1: ( ( rule__Export__ExpAssignment_0_0 ) )
            // InternalFortXTrans.g:907:2: ( rule__Export__ExpAssignment_0_0 )
            {
             before(grammarAccess.getExportAccess().getExpAssignment_0_0()); 
            // InternalFortXTrans.g:908:2: ( rule__Export__ExpAssignment_0_0 )
            // InternalFortXTrans.g:908:3: rule__Export__ExpAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Export__ExpAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getExportAccess().getExpAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group_0__0__Impl"


    // $ANTLR start "rule__Export__Group_0__1"
    // InternalFortXTrans.g:916:1: rule__Export__Group_0__1 : rule__Export__Group_0__1__Impl ;
    public final void rule__Export__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:920:1: ( rule__Export__Group_0__1__Impl )
            // InternalFortXTrans.g:921:2: rule__Export__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Export__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group_0__1"


    // $ANTLR start "rule__Export__Group_0__1__Impl"
    // InternalFortXTrans.g:927:1: rule__Export__Group_0__1__Impl : ( ( rule__Export__ExportedNameAssignment_0_1 ) ) ;
    public final void rule__Export__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:931:1: ( ( ( rule__Export__ExportedNameAssignment_0_1 ) ) )
            // InternalFortXTrans.g:932:1: ( ( rule__Export__ExportedNameAssignment_0_1 ) )
            {
            // InternalFortXTrans.g:932:1: ( ( rule__Export__ExportedNameAssignment_0_1 ) )
            // InternalFortXTrans.g:933:2: ( rule__Export__ExportedNameAssignment_0_1 )
            {
             before(grammarAccess.getExportAccess().getExportedNameAssignment_0_1()); 
            // InternalFortXTrans.g:934:2: ( rule__Export__ExportedNameAssignment_0_1 )
            // InternalFortXTrans.g:934:3: rule__Export__ExportedNameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Export__ExportedNameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getExportAccess().getExportedNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group_0__1__Impl"


    // $ANTLR start "rule__Export__Group_1__0"
    // InternalFortXTrans.g:943:1: rule__Export__Group_1__0 : rule__Export__Group_1__0__Impl rule__Export__Group_1__1 ;
    public final void rule__Export__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:947:1: ( rule__Export__Group_1__0__Impl rule__Export__Group_1__1 )
            // InternalFortXTrans.g:948:2: rule__Export__Group_1__0__Impl rule__Export__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Export__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Export__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group_1__0"


    // $ANTLR start "rule__Export__Group_1__0__Impl"
    // InternalFortXTrans.g:955:1: rule__Export__Group_1__0__Impl : ( ( rule__Export__ExpAssignment_1_0 ) ) ;
    public final void rule__Export__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:959:1: ( ( ( rule__Export__ExpAssignment_1_0 ) ) )
            // InternalFortXTrans.g:960:1: ( ( rule__Export__ExpAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:960:1: ( ( rule__Export__ExpAssignment_1_0 ) )
            // InternalFortXTrans.g:961:2: ( rule__Export__ExpAssignment_1_0 )
            {
             before(grammarAccess.getExportAccess().getExpAssignment_1_0()); 
            // InternalFortXTrans.g:962:2: ( rule__Export__ExpAssignment_1_0 )
            // InternalFortXTrans.g:962:3: rule__Export__ExpAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Export__ExpAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExportAccess().getExpAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group_1__0__Impl"


    // $ANTLR start "rule__Export__Group_1__1"
    // InternalFortXTrans.g:970:1: rule__Export__Group_1__1 : rule__Export__Group_1__1__Impl rule__Export__Group_1__2 ;
    public final void rule__Export__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:974:1: ( rule__Export__Group_1__1__Impl rule__Export__Group_1__2 )
            // InternalFortXTrans.g:975:2: rule__Export__Group_1__1__Impl rule__Export__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Export__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Export__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group_1__1"


    // $ANTLR start "rule__Export__Group_1__1__Impl"
    // InternalFortXTrans.g:982:1: rule__Export__Group_1__1__Impl : ( ( rule__Export__BrackAssignment_1_1 ) ) ;
    public final void rule__Export__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:986:1: ( ( ( rule__Export__BrackAssignment_1_1 ) ) )
            // InternalFortXTrans.g:987:1: ( ( rule__Export__BrackAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:987:1: ( ( rule__Export__BrackAssignment_1_1 ) )
            // InternalFortXTrans.g:988:2: ( rule__Export__BrackAssignment_1_1 )
            {
             before(grammarAccess.getExportAccess().getBrackAssignment_1_1()); 
            // InternalFortXTrans.g:989:2: ( rule__Export__BrackAssignment_1_1 )
            // InternalFortXTrans.g:989:3: rule__Export__BrackAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Export__BrackAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExportAccess().getBrackAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group_1__1__Impl"


    // $ANTLR start "rule__Export__Group_1__2"
    // InternalFortXTrans.g:997:1: rule__Export__Group_1__2 : rule__Export__Group_1__2__Impl rule__Export__Group_1__3 ;
    public final void rule__Export__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1001:1: ( rule__Export__Group_1__2__Impl rule__Export__Group_1__3 )
            // InternalFortXTrans.g:1002:2: rule__Export__Group_1__2__Impl rule__Export__Group_1__3
            {
            pushFollow(FOLLOW_11);
            rule__Export__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Export__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group_1__2"


    // $ANTLR start "rule__Export__Group_1__2__Impl"
    // InternalFortXTrans.g:1009:1: rule__Export__Group_1__2__Impl : ( ( rule__Export__ExportedNameAssignment_1_2 ) ) ;
    public final void rule__Export__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1013:1: ( ( ( rule__Export__ExportedNameAssignment_1_2 ) ) )
            // InternalFortXTrans.g:1014:1: ( ( rule__Export__ExportedNameAssignment_1_2 ) )
            {
            // InternalFortXTrans.g:1014:1: ( ( rule__Export__ExportedNameAssignment_1_2 ) )
            // InternalFortXTrans.g:1015:2: ( rule__Export__ExportedNameAssignment_1_2 )
            {
             before(grammarAccess.getExportAccess().getExportedNameAssignment_1_2()); 
            // InternalFortXTrans.g:1016:2: ( rule__Export__ExportedNameAssignment_1_2 )
            // InternalFortXTrans.g:1016:3: rule__Export__ExportedNameAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Export__ExportedNameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExportAccess().getExportedNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group_1__2__Impl"


    // $ANTLR start "rule__Export__Group_1__3"
    // InternalFortXTrans.g:1024:1: rule__Export__Group_1__3 : rule__Export__Group_1__3__Impl rule__Export__Group_1__4 ;
    public final void rule__Export__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1028:1: ( rule__Export__Group_1__3__Impl rule__Export__Group_1__4 )
            // InternalFortXTrans.g:1029:2: rule__Export__Group_1__3__Impl rule__Export__Group_1__4
            {
            pushFollow(FOLLOW_11);
            rule__Export__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Export__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group_1__3"


    // $ANTLR start "rule__Export__Group_1__3__Impl"
    // InternalFortXTrans.g:1036:1: rule__Export__Group_1__3__Impl : ( ( rule__Export__Group_1_3__0 )* ) ;
    public final void rule__Export__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1040:1: ( ( ( rule__Export__Group_1_3__0 )* ) )
            // InternalFortXTrans.g:1041:1: ( ( rule__Export__Group_1_3__0 )* )
            {
            // InternalFortXTrans.g:1041:1: ( ( rule__Export__Group_1_3__0 )* )
            // InternalFortXTrans.g:1042:2: ( rule__Export__Group_1_3__0 )*
            {
             before(grammarAccess.getExportAccess().getGroup_1_3()); 
            // InternalFortXTrans.g:1043:2: ( rule__Export__Group_1_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFortXTrans.g:1043:3: rule__Export__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Export__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getExportAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group_1__3__Impl"


    // $ANTLR start "rule__Export__Group_1__4"
    // InternalFortXTrans.g:1051:1: rule__Export__Group_1__4 : rule__Export__Group_1__4__Impl ;
    public final void rule__Export__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1055:1: ( rule__Export__Group_1__4__Impl )
            // InternalFortXTrans.g:1056:2: rule__Export__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Export__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group_1__4"


    // $ANTLR start "rule__Export__Group_1__4__Impl"
    // InternalFortXTrans.g:1062:1: rule__Export__Group_1__4__Impl : ( '}' ) ;
    public final void rule__Export__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1066:1: ( ( '}' ) )
            // InternalFortXTrans.g:1067:1: ( '}' )
            {
            // InternalFortXTrans.g:1067:1: ( '}' )
            // InternalFortXTrans.g:1068:2: '}'
            {
             before(grammarAccess.getExportAccess().getRightCurlyBracketKeyword_1_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExportAccess().getRightCurlyBracketKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group_1__4__Impl"


    // $ANTLR start "rule__Export__Group_1_3__0"
    // InternalFortXTrans.g:1078:1: rule__Export__Group_1_3__0 : rule__Export__Group_1_3__0__Impl rule__Export__Group_1_3__1 ;
    public final void rule__Export__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1082:1: ( rule__Export__Group_1_3__0__Impl rule__Export__Group_1_3__1 )
            // InternalFortXTrans.g:1083:2: rule__Export__Group_1_3__0__Impl rule__Export__Group_1_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Export__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Export__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group_1_3__0"


    // $ANTLR start "rule__Export__Group_1_3__0__Impl"
    // InternalFortXTrans.g:1090:1: rule__Export__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__Export__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1094:1: ( ( ',' ) )
            // InternalFortXTrans.g:1095:1: ( ',' )
            {
            // InternalFortXTrans.g:1095:1: ( ',' )
            // InternalFortXTrans.g:1096:2: ','
            {
             before(grammarAccess.getExportAccess().getCommaKeyword_1_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExportAccess().getCommaKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group_1_3__0__Impl"


    // $ANTLR start "rule__Export__Group_1_3__1"
    // InternalFortXTrans.g:1105:1: rule__Export__Group_1_3__1 : rule__Export__Group_1_3__1__Impl ;
    public final void rule__Export__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1109:1: ( rule__Export__Group_1_3__1__Impl )
            // InternalFortXTrans.g:1110:2: rule__Export__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Export__Group_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group_1_3__1"


    // $ANTLR start "rule__Export__Group_1_3__1__Impl"
    // InternalFortXTrans.g:1116:1: rule__Export__Group_1_3__1__Impl : ( ( rule__Export__ExportedNameAssignment_1_3_1 ) ) ;
    public final void rule__Export__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1120:1: ( ( ( rule__Export__ExportedNameAssignment_1_3_1 ) ) )
            // InternalFortXTrans.g:1121:1: ( ( rule__Export__ExportedNameAssignment_1_3_1 ) )
            {
            // InternalFortXTrans.g:1121:1: ( ( rule__Export__ExportedNameAssignment_1_3_1 ) )
            // InternalFortXTrans.g:1122:2: ( rule__Export__ExportedNameAssignment_1_3_1 )
            {
             before(grammarAccess.getExportAccess().getExportedNameAssignment_1_3_1()); 
            // InternalFortXTrans.g:1123:2: ( rule__Export__ExportedNameAssignment_1_3_1 )
            // InternalFortXTrans.g:1123:3: rule__Export__ExportedNameAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Export__ExportedNameAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExportAccess().getExportedNameAssignment_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group_1_3__1__Impl"


    // $ANTLR start "rule__ImportedNames__Group_0__0"
    // InternalFortXTrans.g:1132:1: rule__ImportedNames__Group_0__0 : rule__ImportedNames__Group_0__0__Impl rule__ImportedNames__Group_0__1 ;
    public final void rule__ImportedNames__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1136:1: ( rule__ImportedNames__Group_0__0__Impl rule__ImportedNames__Group_0__1 )
            // InternalFortXTrans.g:1137:2: rule__ImportedNames__Group_0__0__Impl rule__ImportedNames__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__ImportedNames__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_0__0"


    // $ANTLR start "rule__ImportedNames__Group_0__0__Impl"
    // InternalFortXTrans.g:1144:1: rule__ImportedNames__Group_0__0__Impl : ( ( rule__ImportedNames__ImpnameAssignment_0_0 ) ) ;
    public final void rule__ImportedNames__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1148:1: ( ( ( rule__ImportedNames__ImpnameAssignment_0_0 ) ) )
            // InternalFortXTrans.g:1149:1: ( ( rule__ImportedNames__ImpnameAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:1149:1: ( ( rule__ImportedNames__ImpnameAssignment_0_0 ) )
            // InternalFortXTrans.g:1150:2: ( rule__ImportedNames__ImpnameAssignment_0_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getImpnameAssignment_0_0()); 
            // InternalFortXTrans.g:1151:2: ( rule__ImportedNames__ImpnameAssignment_0_0 )
            // InternalFortXTrans.g:1151:3: rule__ImportedNames__ImpnameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ImportedNames__ImpnameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getImportedNamesAccess().getImpnameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_0__0__Impl"


    // $ANTLR start "rule__ImportedNames__Group_0__1"
    // InternalFortXTrans.g:1159:1: rule__ImportedNames__Group_0__1 : rule__ImportedNames__Group_0__1__Impl rule__ImportedNames__Group_0__2 ;
    public final void rule__ImportedNames__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1163:1: ( rule__ImportedNames__Group_0__1__Impl rule__ImportedNames__Group_0__2 )
            // InternalFortXTrans.g:1164:2: rule__ImportedNames__Group_0__1__Impl rule__ImportedNames__Group_0__2
            {
            pushFollow(FOLLOW_10);
            rule__ImportedNames__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_0__1"


    // $ANTLR start "rule__ImportedNames__Group_0__1__Impl"
    // InternalFortXTrans.g:1171:1: rule__ImportedNames__Group_0__1__Impl : ( '.' ) ;
    public final void rule__ImportedNames__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1175:1: ( ( '.' ) )
            // InternalFortXTrans.g:1176:1: ( '.' )
            {
            // InternalFortXTrans.g:1176:1: ( '.' )
            // InternalFortXTrans.g:1177:2: '.'
            {
             before(grammarAccess.getImportedNamesAccess().getFullStopKeyword_0_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getImportedNamesAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_0__1__Impl"


    // $ANTLR start "rule__ImportedNames__Group_0__2"
    // InternalFortXTrans.g:1186:1: rule__ImportedNames__Group_0__2 : rule__ImportedNames__Group_0__2__Impl rule__ImportedNames__Group_0__3 ;
    public final void rule__ImportedNames__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1190:1: ( rule__ImportedNames__Group_0__2__Impl rule__ImportedNames__Group_0__3 )
            // InternalFortXTrans.g:1191:2: rule__ImportedNames__Group_0__2__Impl rule__ImportedNames__Group_0__3
            {
            pushFollow(FOLLOW_14);
            rule__ImportedNames__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_0__2"


    // $ANTLR start "rule__ImportedNames__Group_0__2__Impl"
    // InternalFortXTrans.g:1198:1: rule__ImportedNames__Group_0__2__Impl : ( '{' ) ;
    public final void rule__ImportedNames__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1202:1: ( ( '{' ) )
            // InternalFortXTrans.g:1203:1: ( '{' )
            {
            // InternalFortXTrans.g:1203:1: ( '{' )
            // InternalFortXTrans.g:1204:2: '{'
            {
             before(grammarAccess.getImportedNamesAccess().getLeftCurlyBracketKeyword_0_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getImportedNamesAccess().getLeftCurlyBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_0__2__Impl"


    // $ANTLR start "rule__ImportedNames__Group_0__3"
    // InternalFortXTrans.g:1213:1: rule__ImportedNames__Group_0__3 : rule__ImportedNames__Group_0__3__Impl rule__ImportedNames__Group_0__4 ;
    public final void rule__ImportedNames__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1217:1: ( rule__ImportedNames__Group_0__3__Impl rule__ImportedNames__Group_0__4 )
            // InternalFortXTrans.g:1218:2: rule__ImportedNames__Group_0__3__Impl rule__ImportedNames__Group_0__4
            {
            pushFollow(FOLLOW_15);
            rule__ImportedNames__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_0__3"


    // $ANTLR start "rule__ImportedNames__Group_0__3__Impl"
    // InternalFortXTrans.g:1225:1: rule__ImportedNames__Group_0__3__Impl : ( '...' ) ;
    public final void rule__ImportedNames__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1229:1: ( ( '...' ) )
            // InternalFortXTrans.g:1230:1: ( '...' )
            {
            // InternalFortXTrans.g:1230:1: ( '...' )
            // InternalFortXTrans.g:1231:2: '...'
            {
             before(grammarAccess.getImportedNamesAccess().getFullStopFullStopFullStopKeyword_0_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getImportedNamesAccess().getFullStopFullStopFullStopKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_0__3__Impl"


    // $ANTLR start "rule__ImportedNames__Group_0__4"
    // InternalFortXTrans.g:1240:1: rule__ImportedNames__Group_0__4 : rule__ImportedNames__Group_0__4__Impl rule__ImportedNames__Group_0__5 ;
    public final void rule__ImportedNames__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1244:1: ( rule__ImportedNames__Group_0__4__Impl rule__ImportedNames__Group_0__5 )
            // InternalFortXTrans.g:1245:2: rule__ImportedNames__Group_0__4__Impl rule__ImportedNames__Group_0__5
            {
            pushFollow(FOLLOW_16);
            rule__ImportedNames__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_0__4"


    // $ANTLR start "rule__ImportedNames__Group_0__4__Impl"
    // InternalFortXTrans.g:1252:1: rule__ImportedNames__Group_0__4__Impl : ( '}' ) ;
    public final void rule__ImportedNames__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1256:1: ( ( '}' ) )
            // InternalFortXTrans.g:1257:1: ( '}' )
            {
            // InternalFortXTrans.g:1257:1: ( '}' )
            // InternalFortXTrans.g:1258:2: '}'
            {
             before(grammarAccess.getImportedNamesAccess().getRightCurlyBracketKeyword_0_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getImportedNamesAccess().getRightCurlyBracketKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_0__4__Impl"


    // $ANTLR start "rule__ImportedNames__Group_0__5"
    // InternalFortXTrans.g:1267:1: rule__ImportedNames__Group_0__5 : rule__ImportedNames__Group_0__5__Impl ;
    public final void rule__ImportedNames__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1271:1: ( rule__ImportedNames__Group_0__5__Impl )
            // InternalFortXTrans.g:1272:2: rule__ImportedNames__Group_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_0__5"


    // $ANTLR start "rule__ImportedNames__Group_0__5__Impl"
    // InternalFortXTrans.g:1278:1: rule__ImportedNames__Group_0__5__Impl : ( ( rule__ImportedNames__Group_0_5__0 )? ) ;
    public final void rule__ImportedNames__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1282:1: ( ( ( rule__ImportedNames__Group_0_5__0 )? ) )
            // InternalFortXTrans.g:1283:1: ( ( rule__ImportedNames__Group_0_5__0 )? )
            {
            // InternalFortXTrans.g:1283:1: ( ( rule__ImportedNames__Group_0_5__0 )? )
            // InternalFortXTrans.g:1284:2: ( rule__ImportedNames__Group_0_5__0 )?
            {
             before(grammarAccess.getImportedNamesAccess().getGroup_0_5()); 
            // InternalFortXTrans.g:1285:2: ( rule__ImportedNames__Group_0_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFortXTrans.g:1285:3: rule__ImportedNames__Group_0_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImportedNames__Group_0_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImportedNamesAccess().getGroup_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_0__5__Impl"


    // $ANTLR start "rule__ImportedNames__Group_0_5__0"
    // InternalFortXTrans.g:1294:1: rule__ImportedNames__Group_0_5__0 : rule__ImportedNames__Group_0_5__0__Impl rule__ImportedNames__Group_0_5__1 ;
    public final void rule__ImportedNames__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1298:1: ( rule__ImportedNames__Group_0_5__0__Impl rule__ImportedNames__Group_0_5__1 )
            // InternalFortXTrans.g:1299:2: rule__ImportedNames__Group_0_5__0__Impl rule__ImportedNames__Group_0_5__1
            {
            pushFollow(FOLLOW_9);
            rule__ImportedNames__Group_0_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_0_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_0_5__0"


    // $ANTLR start "rule__ImportedNames__Group_0_5__0__Impl"
    // InternalFortXTrans.g:1306:1: rule__ImportedNames__Group_0_5__0__Impl : ( ( rule__ImportedNames__ExceptAssignment_0_5_0 ) ) ;
    public final void rule__ImportedNames__Group_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1310:1: ( ( ( rule__ImportedNames__ExceptAssignment_0_5_0 ) ) )
            // InternalFortXTrans.g:1311:1: ( ( rule__ImportedNames__ExceptAssignment_0_5_0 ) )
            {
            // InternalFortXTrans.g:1311:1: ( ( rule__ImportedNames__ExceptAssignment_0_5_0 ) )
            // InternalFortXTrans.g:1312:2: ( rule__ImportedNames__ExceptAssignment_0_5_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getExceptAssignment_0_5_0()); 
            // InternalFortXTrans.g:1313:2: ( rule__ImportedNames__ExceptAssignment_0_5_0 )
            // InternalFortXTrans.g:1313:3: rule__ImportedNames__ExceptAssignment_0_5_0
            {
            pushFollow(FOLLOW_2);
            rule__ImportedNames__ExceptAssignment_0_5_0();

            state._fsp--;


            }

             after(grammarAccess.getImportedNamesAccess().getExceptAssignment_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_0_5__0__Impl"


    // $ANTLR start "rule__ImportedNames__Group_0_5__1"
    // InternalFortXTrans.g:1321:1: rule__ImportedNames__Group_0_5__1 : rule__ImportedNames__Group_0_5__1__Impl ;
    public final void rule__ImportedNames__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1325:1: ( rule__ImportedNames__Group_0_5__1__Impl )
            // InternalFortXTrans.g:1326:2: rule__ImportedNames__Group_0_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_0_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_0_5__1"


    // $ANTLR start "rule__ImportedNames__Group_0_5__1__Impl"
    // InternalFortXTrans.g:1332:1: rule__ImportedNames__Group_0_5__1__Impl : ( ( rule__ImportedNames__SimpAssignment_0_5_1 ) ) ;
    public final void rule__ImportedNames__Group_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1336:1: ( ( ( rule__ImportedNames__SimpAssignment_0_5_1 ) ) )
            // InternalFortXTrans.g:1337:1: ( ( rule__ImportedNames__SimpAssignment_0_5_1 ) )
            {
            // InternalFortXTrans.g:1337:1: ( ( rule__ImportedNames__SimpAssignment_0_5_1 ) )
            // InternalFortXTrans.g:1338:2: ( rule__ImportedNames__SimpAssignment_0_5_1 )
            {
             before(grammarAccess.getImportedNamesAccess().getSimpAssignment_0_5_1()); 
            // InternalFortXTrans.g:1339:2: ( rule__ImportedNames__SimpAssignment_0_5_1 )
            // InternalFortXTrans.g:1339:3: rule__ImportedNames__SimpAssignment_0_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ImportedNames__SimpAssignment_0_5_1();

            state._fsp--;


            }

             after(grammarAccess.getImportedNamesAccess().getSimpAssignment_0_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_0_5__1__Impl"


    // $ANTLR start "rule__ImportedNames__Group_1__0"
    // InternalFortXTrans.g:1348:1: rule__ImportedNames__Group_1__0 : rule__ImportedNames__Group_1__0__Impl rule__ImportedNames__Group_1__1 ;
    public final void rule__ImportedNames__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1352:1: ( rule__ImportedNames__Group_1__0__Impl rule__ImportedNames__Group_1__1 )
            // InternalFortXTrans.g:1353:2: rule__ImportedNames__Group_1__0__Impl rule__ImportedNames__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__ImportedNames__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_1__0"


    // $ANTLR start "rule__ImportedNames__Group_1__0__Impl"
    // InternalFortXTrans.g:1360:1: rule__ImportedNames__Group_1__0__Impl : ( ( rule__ImportedNames__ImpnameAssignment_1_0 ) ) ;
    public final void rule__ImportedNames__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1364:1: ( ( ( rule__ImportedNames__ImpnameAssignment_1_0 ) ) )
            // InternalFortXTrans.g:1365:1: ( ( rule__ImportedNames__ImpnameAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:1365:1: ( ( rule__ImportedNames__ImpnameAssignment_1_0 ) )
            // InternalFortXTrans.g:1366:2: ( rule__ImportedNames__ImpnameAssignment_1_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getImpnameAssignment_1_0()); 
            // InternalFortXTrans.g:1367:2: ( rule__ImportedNames__ImpnameAssignment_1_0 )
            // InternalFortXTrans.g:1367:3: rule__ImportedNames__ImpnameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ImportedNames__ImpnameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getImportedNamesAccess().getImpnameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_1__0__Impl"


    // $ANTLR start "rule__ImportedNames__Group_1__1"
    // InternalFortXTrans.g:1375:1: rule__ImportedNames__Group_1__1 : rule__ImportedNames__Group_1__1__Impl rule__ImportedNames__Group_1__2 ;
    public final void rule__ImportedNames__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1379:1: ( rule__ImportedNames__Group_1__1__Impl rule__ImportedNames__Group_1__2 )
            // InternalFortXTrans.g:1380:2: rule__ImportedNames__Group_1__1__Impl rule__ImportedNames__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__ImportedNames__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_1__1"


    // $ANTLR start "rule__ImportedNames__Group_1__1__Impl"
    // InternalFortXTrans.g:1387:1: rule__ImportedNames__Group_1__1__Impl : ( '.' ) ;
    public final void rule__ImportedNames__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1391:1: ( ( '.' ) )
            // InternalFortXTrans.g:1392:1: ( '.' )
            {
            // InternalFortXTrans.g:1392:1: ( '.' )
            // InternalFortXTrans.g:1393:2: '.'
            {
             before(grammarAccess.getImportedNamesAccess().getFullStopKeyword_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getImportedNamesAccess().getFullStopKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_1__1__Impl"


    // $ANTLR start "rule__ImportedNames__Group_1__2"
    // InternalFortXTrans.g:1402:1: rule__ImportedNames__Group_1__2 : rule__ImportedNames__Group_1__2__Impl rule__ImportedNames__Group_1__3 ;
    public final void rule__ImportedNames__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1406:1: ( rule__ImportedNames__Group_1__2__Impl rule__ImportedNames__Group_1__3 )
            // InternalFortXTrans.g:1407:2: rule__ImportedNames__Group_1__2__Impl rule__ImportedNames__Group_1__3
            {
            pushFollow(FOLLOW_3);
            rule__ImportedNames__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_1__2"


    // $ANTLR start "rule__ImportedNames__Group_1__2__Impl"
    // InternalFortXTrans.g:1414:1: rule__ImportedNames__Group_1__2__Impl : ( '{' ) ;
    public final void rule__ImportedNames__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1418:1: ( ( '{' ) )
            // InternalFortXTrans.g:1419:1: ( '{' )
            {
            // InternalFortXTrans.g:1419:1: ( '{' )
            // InternalFortXTrans.g:1420:2: '{'
            {
             before(grammarAccess.getImportedNamesAccess().getLeftCurlyBracketKeyword_1_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getImportedNamesAccess().getLeftCurlyBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_1__2__Impl"


    // $ANTLR start "rule__ImportedNames__Group_1__3"
    // InternalFortXTrans.g:1429:1: rule__ImportedNames__Group_1__3 : rule__ImportedNames__Group_1__3__Impl rule__ImportedNames__Group_1__4 ;
    public final void rule__ImportedNames__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1433:1: ( rule__ImportedNames__Group_1__3__Impl rule__ImportedNames__Group_1__4 )
            // InternalFortXTrans.g:1434:2: rule__ImportedNames__Group_1__3__Impl rule__ImportedNames__Group_1__4
            {
            pushFollow(FOLLOW_11);
            rule__ImportedNames__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_1__3"


    // $ANTLR start "rule__ImportedNames__Group_1__3__Impl"
    // InternalFortXTrans.g:1441:1: rule__ImportedNames__Group_1__3__Impl : ( ( rule__ImportedNames__SimpListAssignment_1_3 ) ) ;
    public final void rule__ImportedNames__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1445:1: ( ( ( rule__ImportedNames__SimpListAssignment_1_3 ) ) )
            // InternalFortXTrans.g:1446:1: ( ( rule__ImportedNames__SimpListAssignment_1_3 ) )
            {
            // InternalFortXTrans.g:1446:1: ( ( rule__ImportedNames__SimpListAssignment_1_3 ) )
            // InternalFortXTrans.g:1447:2: ( rule__ImportedNames__SimpListAssignment_1_3 )
            {
             before(grammarAccess.getImportedNamesAccess().getSimpListAssignment_1_3()); 
            // InternalFortXTrans.g:1448:2: ( rule__ImportedNames__SimpListAssignment_1_3 )
            // InternalFortXTrans.g:1448:3: rule__ImportedNames__SimpListAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__ImportedNames__SimpListAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getImportedNamesAccess().getSimpListAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_1__3__Impl"


    // $ANTLR start "rule__ImportedNames__Group_1__4"
    // InternalFortXTrans.g:1456:1: rule__ImportedNames__Group_1__4 : rule__ImportedNames__Group_1__4__Impl rule__ImportedNames__Group_1__5 ;
    public final void rule__ImportedNames__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1460:1: ( rule__ImportedNames__Group_1__4__Impl rule__ImportedNames__Group_1__5 )
            // InternalFortXTrans.g:1461:2: rule__ImportedNames__Group_1__4__Impl rule__ImportedNames__Group_1__5
            {
            pushFollow(FOLLOW_11);
            rule__ImportedNames__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_1__4"


    // $ANTLR start "rule__ImportedNames__Group_1__4__Impl"
    // InternalFortXTrans.g:1468:1: rule__ImportedNames__Group_1__4__Impl : ( ( rule__ImportedNames__Group_1_4__0 )* ) ;
    public final void rule__ImportedNames__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1472:1: ( ( ( rule__ImportedNames__Group_1_4__0 )* ) )
            // InternalFortXTrans.g:1473:1: ( ( rule__ImportedNames__Group_1_4__0 )* )
            {
            // InternalFortXTrans.g:1473:1: ( ( rule__ImportedNames__Group_1_4__0 )* )
            // InternalFortXTrans.g:1474:2: ( rule__ImportedNames__Group_1_4__0 )*
            {
             before(grammarAccess.getImportedNamesAccess().getGroup_1_4()); 
            // InternalFortXTrans.g:1475:2: ( rule__ImportedNames__Group_1_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==RULE_ID) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalFortXTrans.g:1475:3: rule__ImportedNames__Group_1_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ImportedNames__Group_1_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getImportedNamesAccess().getGroup_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_1__4__Impl"


    // $ANTLR start "rule__ImportedNames__Group_1__5"
    // InternalFortXTrans.g:1483:1: rule__ImportedNames__Group_1__5 : rule__ImportedNames__Group_1__5__Impl rule__ImportedNames__Group_1__6 ;
    public final void rule__ImportedNames__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1487:1: ( rule__ImportedNames__Group_1__5__Impl rule__ImportedNames__Group_1__6 )
            // InternalFortXTrans.g:1488:2: rule__ImportedNames__Group_1__5__Impl rule__ImportedNames__Group_1__6
            {
            pushFollow(FOLLOW_11);
            rule__ImportedNames__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_1__5"


    // $ANTLR start "rule__ImportedNames__Group_1__5__Impl"
    // InternalFortXTrans.g:1495:1: rule__ImportedNames__Group_1__5__Impl : ( ( rule__ImportedNames__Group_1_5__0 )? ) ;
    public final void rule__ImportedNames__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1499:1: ( ( ( rule__ImportedNames__Group_1_5__0 )? ) )
            // InternalFortXTrans.g:1500:1: ( ( rule__ImportedNames__Group_1_5__0 )? )
            {
            // InternalFortXTrans.g:1500:1: ( ( rule__ImportedNames__Group_1_5__0 )? )
            // InternalFortXTrans.g:1501:2: ( rule__ImportedNames__Group_1_5__0 )?
            {
             before(grammarAccess.getImportedNamesAccess().getGroup_1_5()); 
            // InternalFortXTrans.g:1502:2: ( rule__ImportedNames__Group_1_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFortXTrans.g:1502:3: rule__ImportedNames__Group_1_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImportedNames__Group_1_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImportedNamesAccess().getGroup_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_1__5__Impl"


    // $ANTLR start "rule__ImportedNames__Group_1__6"
    // InternalFortXTrans.g:1510:1: rule__ImportedNames__Group_1__6 : rule__ImportedNames__Group_1__6__Impl ;
    public final void rule__ImportedNames__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1514:1: ( rule__ImportedNames__Group_1__6__Impl )
            // InternalFortXTrans.g:1515:2: rule__ImportedNames__Group_1__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_1__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_1__6"


    // $ANTLR start "rule__ImportedNames__Group_1__6__Impl"
    // InternalFortXTrans.g:1521:1: rule__ImportedNames__Group_1__6__Impl : ( '}' ) ;
    public final void rule__ImportedNames__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1525:1: ( ( '}' ) )
            // InternalFortXTrans.g:1526:1: ( '}' )
            {
            // InternalFortXTrans.g:1526:1: ( '}' )
            // InternalFortXTrans.g:1527:2: '}'
            {
             before(grammarAccess.getImportedNamesAccess().getRightCurlyBracketKeyword_1_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getImportedNamesAccess().getRightCurlyBracketKeyword_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_1__6__Impl"


    // $ANTLR start "rule__ImportedNames__Group_1_4__0"
    // InternalFortXTrans.g:1537:1: rule__ImportedNames__Group_1_4__0 : rule__ImportedNames__Group_1_4__0__Impl rule__ImportedNames__Group_1_4__1 ;
    public final void rule__ImportedNames__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1541:1: ( rule__ImportedNames__Group_1_4__0__Impl rule__ImportedNames__Group_1_4__1 )
            // InternalFortXTrans.g:1542:2: rule__ImportedNames__Group_1_4__0__Impl rule__ImportedNames__Group_1_4__1
            {
            pushFollow(FOLLOW_3);
            rule__ImportedNames__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_1_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_1_4__0"


    // $ANTLR start "rule__ImportedNames__Group_1_4__0__Impl"
    // InternalFortXTrans.g:1549:1: rule__ImportedNames__Group_1_4__0__Impl : ( ',' ) ;
    public final void rule__ImportedNames__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1553:1: ( ( ',' ) )
            // InternalFortXTrans.g:1554:1: ( ',' )
            {
            // InternalFortXTrans.g:1554:1: ( ',' )
            // InternalFortXTrans.g:1555:2: ','
            {
             before(grammarAccess.getImportedNamesAccess().getCommaKeyword_1_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getImportedNamesAccess().getCommaKeyword_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_1_4__0__Impl"


    // $ANTLR start "rule__ImportedNames__Group_1_4__1"
    // InternalFortXTrans.g:1564:1: rule__ImportedNames__Group_1_4__1 : rule__ImportedNames__Group_1_4__1__Impl ;
    public final void rule__ImportedNames__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1568:1: ( rule__ImportedNames__Group_1_4__1__Impl )
            // InternalFortXTrans.g:1569:2: rule__ImportedNames__Group_1_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_1_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_1_4__1"


    // $ANTLR start "rule__ImportedNames__Group_1_4__1__Impl"
    // InternalFortXTrans.g:1575:1: rule__ImportedNames__Group_1_4__1__Impl : ( ( rule__ImportedNames__SimpListAssignment_1_4_1 ) ) ;
    public final void rule__ImportedNames__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1579:1: ( ( ( rule__ImportedNames__SimpListAssignment_1_4_1 ) ) )
            // InternalFortXTrans.g:1580:1: ( ( rule__ImportedNames__SimpListAssignment_1_4_1 ) )
            {
            // InternalFortXTrans.g:1580:1: ( ( rule__ImportedNames__SimpListAssignment_1_4_1 ) )
            // InternalFortXTrans.g:1581:2: ( rule__ImportedNames__SimpListAssignment_1_4_1 )
            {
             before(grammarAccess.getImportedNamesAccess().getSimpListAssignment_1_4_1()); 
            // InternalFortXTrans.g:1582:2: ( rule__ImportedNames__SimpListAssignment_1_4_1 )
            // InternalFortXTrans.g:1582:3: rule__ImportedNames__SimpListAssignment_1_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ImportedNames__SimpListAssignment_1_4_1();

            state._fsp--;


            }

             after(grammarAccess.getImportedNamesAccess().getSimpListAssignment_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_1_4__1__Impl"


    // $ANTLR start "rule__ImportedNames__Group_1_5__0"
    // InternalFortXTrans.g:1591:1: rule__ImportedNames__Group_1_5__0 : rule__ImportedNames__Group_1_5__0__Impl rule__ImportedNames__Group_1_5__1 ;
    public final void rule__ImportedNames__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1595:1: ( rule__ImportedNames__Group_1_5__0__Impl rule__ImportedNames__Group_1_5__1 )
            // InternalFortXTrans.g:1596:2: rule__ImportedNames__Group_1_5__0__Impl rule__ImportedNames__Group_1_5__1
            {
            pushFollow(FOLLOW_14);
            rule__ImportedNames__Group_1_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_1_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_1_5__0"


    // $ANTLR start "rule__ImportedNames__Group_1_5__0__Impl"
    // InternalFortXTrans.g:1603:1: rule__ImportedNames__Group_1_5__0__Impl : ( ( rule__ImportedNames__CommaAssignment_1_5_0 ) ) ;
    public final void rule__ImportedNames__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1607:1: ( ( ( rule__ImportedNames__CommaAssignment_1_5_0 ) ) )
            // InternalFortXTrans.g:1608:1: ( ( rule__ImportedNames__CommaAssignment_1_5_0 ) )
            {
            // InternalFortXTrans.g:1608:1: ( ( rule__ImportedNames__CommaAssignment_1_5_0 ) )
            // InternalFortXTrans.g:1609:2: ( rule__ImportedNames__CommaAssignment_1_5_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getCommaAssignment_1_5_0()); 
            // InternalFortXTrans.g:1610:2: ( rule__ImportedNames__CommaAssignment_1_5_0 )
            // InternalFortXTrans.g:1610:3: rule__ImportedNames__CommaAssignment_1_5_0
            {
            pushFollow(FOLLOW_2);
            rule__ImportedNames__CommaAssignment_1_5_0();

            state._fsp--;


            }

             after(grammarAccess.getImportedNamesAccess().getCommaAssignment_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_1_5__0__Impl"


    // $ANTLR start "rule__ImportedNames__Group_1_5__1"
    // InternalFortXTrans.g:1618:1: rule__ImportedNames__Group_1_5__1 : rule__ImportedNames__Group_1_5__1__Impl ;
    public final void rule__ImportedNames__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1622:1: ( rule__ImportedNames__Group_1_5__1__Impl )
            // InternalFortXTrans.g:1623:2: rule__ImportedNames__Group_1_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_1_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_1_5__1"


    // $ANTLR start "rule__ImportedNames__Group_1_5__1__Impl"
    // InternalFortXTrans.g:1629:1: rule__ImportedNames__Group_1_5__1__Impl : ( ( rule__ImportedNames__DotsAssignment_1_5_1 ) ) ;
    public final void rule__ImportedNames__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1633:1: ( ( ( rule__ImportedNames__DotsAssignment_1_5_1 ) ) )
            // InternalFortXTrans.g:1634:1: ( ( rule__ImportedNames__DotsAssignment_1_5_1 ) )
            {
            // InternalFortXTrans.g:1634:1: ( ( rule__ImportedNames__DotsAssignment_1_5_1 ) )
            // InternalFortXTrans.g:1635:2: ( rule__ImportedNames__DotsAssignment_1_5_1 )
            {
             before(grammarAccess.getImportedNamesAccess().getDotsAssignment_1_5_1()); 
            // InternalFortXTrans.g:1636:2: ( rule__ImportedNames__DotsAssignment_1_5_1 )
            // InternalFortXTrans.g:1636:3: rule__ImportedNames__DotsAssignment_1_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ImportedNames__DotsAssignment_1_5_1();

            state._fsp--;


            }

             after(grammarAccess.getImportedNamesAccess().getDotsAssignment_1_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_1_5__1__Impl"


    // $ANTLR start "rule__ImportedNames__Group_2__0"
    // InternalFortXTrans.g:1645:1: rule__ImportedNames__Group_2__0 : rule__ImportedNames__Group_2__0__Impl rule__ImportedNames__Group_2__1 ;
    public final void rule__ImportedNames__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1649:1: ( rule__ImportedNames__Group_2__0__Impl rule__ImportedNames__Group_2__1 )
            // InternalFortXTrans.g:1650:2: rule__ImportedNames__Group_2__0__Impl rule__ImportedNames__Group_2__1
            {
            pushFollow(FOLLOW_17);
            rule__ImportedNames__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_2__0"


    // $ANTLR start "rule__ImportedNames__Group_2__0__Impl"
    // InternalFortXTrans.g:1657:1: rule__ImportedNames__Group_2__0__Impl : ( ( rule__ImportedNames__ImpnameAssignment_2_0 ) ) ;
    public final void rule__ImportedNames__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1661:1: ( ( ( rule__ImportedNames__ImpnameAssignment_2_0 ) ) )
            // InternalFortXTrans.g:1662:1: ( ( rule__ImportedNames__ImpnameAssignment_2_0 ) )
            {
            // InternalFortXTrans.g:1662:1: ( ( rule__ImportedNames__ImpnameAssignment_2_0 ) )
            // InternalFortXTrans.g:1663:2: ( rule__ImportedNames__ImpnameAssignment_2_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getImpnameAssignment_2_0()); 
            // InternalFortXTrans.g:1664:2: ( rule__ImportedNames__ImpnameAssignment_2_0 )
            // InternalFortXTrans.g:1664:3: rule__ImportedNames__ImpnameAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ImportedNames__ImpnameAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getImportedNamesAccess().getImpnameAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_2__0__Impl"


    // $ANTLR start "rule__ImportedNames__Group_2__1"
    // InternalFortXTrans.g:1672:1: rule__ImportedNames__Group_2__1 : rule__ImportedNames__Group_2__1__Impl ;
    public final void rule__ImportedNames__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1676:1: ( rule__ImportedNames__Group_2__1__Impl )
            // InternalFortXTrans.g:1677:2: rule__ImportedNames__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_2__1"


    // $ANTLR start "rule__ImportedNames__Group_2__1__Impl"
    // InternalFortXTrans.g:1683:1: rule__ImportedNames__Group_2__1__Impl : ( ( rule__ImportedNames__Group_2_1__0 )? ) ;
    public final void rule__ImportedNames__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1687:1: ( ( ( rule__ImportedNames__Group_2_1__0 )? ) )
            // InternalFortXTrans.g:1688:1: ( ( rule__ImportedNames__Group_2_1__0 )? )
            {
            // InternalFortXTrans.g:1688:1: ( ( rule__ImportedNames__Group_2_1__0 )? )
            // InternalFortXTrans.g:1689:2: ( rule__ImportedNames__Group_2_1__0 )?
            {
             before(grammarAccess.getImportedNamesAccess().getGroup_2_1()); 
            // InternalFortXTrans.g:1690:2: ( rule__ImportedNames__Group_2_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFortXTrans.g:1690:3: rule__ImportedNames__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImportedNames__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImportedNamesAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_2__1__Impl"


    // $ANTLR start "rule__ImportedNames__Group_2_1__0"
    // InternalFortXTrans.g:1699:1: rule__ImportedNames__Group_2_1__0 : rule__ImportedNames__Group_2_1__0__Impl rule__ImportedNames__Group_2_1__1 ;
    public final void rule__ImportedNames__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1703:1: ( rule__ImportedNames__Group_2_1__0__Impl rule__ImportedNames__Group_2_1__1 )
            // InternalFortXTrans.g:1704:2: rule__ImportedNames__Group_2_1__0__Impl rule__ImportedNames__Group_2_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ImportedNames__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_2_1__0"


    // $ANTLR start "rule__ImportedNames__Group_2_1__0__Impl"
    // InternalFortXTrans.g:1711:1: rule__ImportedNames__Group_2_1__0__Impl : ( 'as' ) ;
    public final void rule__ImportedNames__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1715:1: ( ( 'as' ) )
            // InternalFortXTrans.g:1716:1: ( 'as' )
            {
            // InternalFortXTrans.g:1716:1: ( 'as' )
            // InternalFortXTrans.g:1717:2: 'as'
            {
             before(grammarAccess.getImportedNamesAccess().getAsKeyword_2_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getImportedNamesAccess().getAsKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_2_1__0__Impl"


    // $ANTLR start "rule__ImportedNames__Group_2_1__1"
    // InternalFortXTrans.g:1726:1: rule__ImportedNames__Group_2_1__1 : rule__ImportedNames__Group_2_1__1__Impl ;
    public final void rule__ImportedNames__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1730:1: ( rule__ImportedNames__Group_2_1__1__Impl )
            // InternalFortXTrans.g:1731:2: rule__ImportedNames__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportedNames__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_2_1__1"


    // $ANTLR start "rule__ImportedNames__Group_2_1__1__Impl"
    // InternalFortXTrans.g:1737:1: rule__ImportedNames__Group_2_1__1__Impl : ( ( rule__ImportedNames__AsnameAssignment_2_1_1 ) ) ;
    public final void rule__ImportedNames__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1741:1: ( ( ( rule__ImportedNames__AsnameAssignment_2_1_1 ) ) )
            // InternalFortXTrans.g:1742:1: ( ( rule__ImportedNames__AsnameAssignment_2_1_1 ) )
            {
            // InternalFortXTrans.g:1742:1: ( ( rule__ImportedNames__AsnameAssignment_2_1_1 ) )
            // InternalFortXTrans.g:1743:2: ( rule__ImportedNames__AsnameAssignment_2_1_1 )
            {
             before(grammarAccess.getImportedNamesAccess().getAsnameAssignment_2_1_1()); 
            // InternalFortXTrans.g:1744:2: ( rule__ImportedNames__AsnameAssignment_2_1_1 )
            // InternalFortXTrans.g:1744:3: rule__ImportedNames__AsnameAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ImportedNames__AsnameAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getImportedNamesAccess().getAsnameAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__Group_2_1__1__Impl"


    // $ANTLR start "rule__APIName__Group_0__0"
    // InternalFortXTrans.g:1753:1: rule__APIName__Group_0__0 : rule__APIName__Group_0__0__Impl rule__APIName__Group_0__1 ;
    public final void rule__APIName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1757:1: ( rule__APIName__Group_0__0__Impl rule__APIName__Group_0__1 )
            // InternalFortXTrans.g:1758:2: rule__APIName__Group_0__0__Impl rule__APIName__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__APIName__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__APIName__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Group_0__0"


    // $ANTLR start "rule__APIName__Group_0__0__Impl"
    // InternalFortXTrans.g:1765:1: rule__APIName__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1769:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:1770:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:1770:1: ( RULE_ID )
            // InternalFortXTrans.g:1771:2: RULE_ID
            {
             before(grammarAccess.getAPINameAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAPINameAccess().getIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Group_0__0__Impl"


    // $ANTLR start "rule__APIName__Group_0__1"
    // InternalFortXTrans.g:1780:1: rule__APIName__Group_0__1 : rule__APIName__Group_0__1__Impl ;
    public final void rule__APIName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1784:1: ( rule__APIName__Group_0__1__Impl )
            // InternalFortXTrans.g:1785:2: rule__APIName__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__APIName__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Group_0__1"


    // $ANTLR start "rule__APIName__Group_0__1__Impl"
    // InternalFortXTrans.g:1791:1: rule__APIName__Group_0__1__Impl : ( '...' ) ;
    public final void rule__APIName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1795:1: ( ( '...' ) )
            // InternalFortXTrans.g:1796:1: ( '...' )
            {
            // InternalFortXTrans.g:1796:1: ( '...' )
            // InternalFortXTrans.g:1797:2: '...'
            {
             before(grammarAccess.getAPINameAccess().getFullStopFullStopFullStopKeyword_0_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAPINameAccess().getFullStopFullStopFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Group_0__1__Impl"


    // $ANTLR start "rule__APIName__Group_1__0"
    // InternalFortXTrans.g:1807:1: rule__APIName__Group_1__0 : rule__APIName__Group_1__0__Impl rule__APIName__Group_1__1 ;
    public final void rule__APIName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1811:1: ( rule__APIName__Group_1__0__Impl rule__APIName__Group_1__1 )
            // InternalFortXTrans.g:1812:2: rule__APIName__Group_1__0__Impl rule__APIName__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__APIName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__APIName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Group_1__0"


    // $ANTLR start "rule__APIName__Group_1__0__Impl"
    // InternalFortXTrans.g:1819:1: rule__APIName__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1823:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:1824:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:1824:1: ( RULE_ID )
            // InternalFortXTrans.g:1825:2: RULE_ID
            {
             before(grammarAccess.getAPINameAccess().getIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAPINameAccess().getIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Group_1__0__Impl"


    // $ANTLR start "rule__APIName__Group_1__1"
    // InternalFortXTrans.g:1834:1: rule__APIName__Group_1__1 : rule__APIName__Group_1__1__Impl rule__APIName__Group_1__2 ;
    public final void rule__APIName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1838:1: ( rule__APIName__Group_1__1__Impl rule__APIName__Group_1__2 )
            // InternalFortXTrans.g:1839:2: rule__APIName__Group_1__1__Impl rule__APIName__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__APIName__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__APIName__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Group_1__1"


    // $ANTLR start "rule__APIName__Group_1__1__Impl"
    // InternalFortXTrans.g:1846:1: rule__APIName__Group_1__1__Impl : ( ( rule__APIName__Group_1_1__0 )* ) ;
    public final void rule__APIName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1850:1: ( ( ( rule__APIName__Group_1_1__0 )* ) )
            // InternalFortXTrans.g:1851:1: ( ( rule__APIName__Group_1_1__0 )* )
            {
            // InternalFortXTrans.g:1851:1: ( ( rule__APIName__Group_1_1__0 )* )
            // InternalFortXTrans.g:1852:2: ( rule__APIName__Group_1_1__0 )*
            {
             before(grammarAccess.getAPINameAccess().getGroup_1_1()); 
            // InternalFortXTrans.g:1853:2: ( rule__APIName__Group_1_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFortXTrans.g:1853:3: rule__APIName__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__APIName__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getAPINameAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Group_1__1__Impl"


    // $ANTLR start "rule__APIName__Group_1__2"
    // InternalFortXTrans.g:1861:1: rule__APIName__Group_1__2 : rule__APIName__Group_1__2__Impl ;
    public final void rule__APIName__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1865:1: ( rule__APIName__Group_1__2__Impl )
            // InternalFortXTrans.g:1866:2: rule__APIName__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__APIName__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Group_1__2"


    // $ANTLR start "rule__APIName__Group_1__2__Impl"
    // InternalFortXTrans.g:1872:1: rule__APIName__Group_1__2__Impl : ( '...' ) ;
    public final void rule__APIName__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1876:1: ( ( '...' ) )
            // InternalFortXTrans.g:1877:1: ( '...' )
            {
            // InternalFortXTrans.g:1877:1: ( '...' )
            // InternalFortXTrans.g:1878:2: '...'
            {
             before(grammarAccess.getAPINameAccess().getFullStopFullStopFullStopKeyword_1_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAPINameAccess().getFullStopFullStopFullStopKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Group_1__2__Impl"


    // $ANTLR start "rule__APIName__Group_1_1__0"
    // InternalFortXTrans.g:1888:1: rule__APIName__Group_1_1__0 : rule__APIName__Group_1_1__0__Impl rule__APIName__Group_1_1__1 ;
    public final void rule__APIName__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1892:1: ( rule__APIName__Group_1_1__0__Impl rule__APIName__Group_1_1__1 )
            // InternalFortXTrans.g:1893:2: rule__APIName__Group_1_1__0__Impl rule__APIName__Group_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__APIName__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__APIName__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Group_1_1__0"


    // $ANTLR start "rule__APIName__Group_1_1__0__Impl"
    // InternalFortXTrans.g:1900:1: rule__APIName__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__APIName__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1904:1: ( ( '.' ) )
            // InternalFortXTrans.g:1905:1: ( '.' )
            {
            // InternalFortXTrans.g:1905:1: ( '.' )
            // InternalFortXTrans.g:1906:2: '.'
            {
             before(grammarAccess.getAPINameAccess().getFullStopKeyword_1_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAPINameAccess().getFullStopKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Group_1_1__0__Impl"


    // $ANTLR start "rule__APIName__Group_1_1__1"
    // InternalFortXTrans.g:1915:1: rule__APIName__Group_1_1__1 : rule__APIName__Group_1_1__1__Impl ;
    public final void rule__APIName__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1919:1: ( rule__APIName__Group_1_1__1__Impl )
            // InternalFortXTrans.g:1920:2: rule__APIName__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__APIName__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Group_1_1__1"


    // $ANTLR start "rule__APIName__Group_1_1__1__Impl"
    // InternalFortXTrans.g:1926:1: rule__APIName__Group_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1930:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:1931:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:1931:1: ( RULE_ID )
            // InternalFortXTrans.g:1932:2: RULE_ID
            {
             before(grammarAccess.getAPINameAccess().getIDTerminalRuleCall_1_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAPINameAccess().getIDTerminalRuleCall_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Group_1_1__1__Impl"


    // $ANTLR start "rule__APIName__Group_2__0"
    // InternalFortXTrans.g:1942:1: rule__APIName__Group_2__0 : rule__APIName__Group_2__0__Impl rule__APIName__Group_2__1 ;
    public final void rule__APIName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1946:1: ( rule__APIName__Group_2__0__Impl rule__APIName__Group_2__1 )
            // InternalFortXTrans.g:1947:2: rule__APIName__Group_2__0__Impl rule__APIName__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__APIName__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__APIName__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Group_2__0"


    // $ANTLR start "rule__APIName__Group_2__0__Impl"
    // InternalFortXTrans.g:1954:1: rule__APIName__Group_2__0__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1958:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:1959:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:1959:1: ( RULE_ID )
            // InternalFortXTrans.g:1960:2: RULE_ID
            {
             before(grammarAccess.getAPINameAccess().getIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAPINameAccess().getIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Group_2__0__Impl"


    // $ANTLR start "rule__APIName__Group_2__1"
    // InternalFortXTrans.g:1969:1: rule__APIName__Group_2__1 : rule__APIName__Group_2__1__Impl ;
    public final void rule__APIName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1973:1: ( rule__APIName__Group_2__1__Impl )
            // InternalFortXTrans.g:1974:2: rule__APIName__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__APIName__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Group_2__1"


    // $ANTLR start "rule__APIName__Group_2__1__Impl"
    // InternalFortXTrans.g:1980:1: rule__APIName__Group_2__1__Impl : ( ( rule__APIName__Group_2_1__0 )* ) ;
    public final void rule__APIName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1984:1: ( ( ( rule__APIName__Group_2_1__0 )* ) )
            // InternalFortXTrans.g:1985:1: ( ( rule__APIName__Group_2_1__0 )* )
            {
            // InternalFortXTrans.g:1985:1: ( ( rule__APIName__Group_2_1__0 )* )
            // InternalFortXTrans.g:1986:2: ( rule__APIName__Group_2_1__0 )*
            {
             before(grammarAccess.getAPINameAccess().getGroup_2_1()); 
            // InternalFortXTrans.g:1987:2: ( rule__APIName__Group_2_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==RULE_ID) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalFortXTrans.g:1987:3: rule__APIName__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__APIName__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getAPINameAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Group_2__1__Impl"


    // $ANTLR start "rule__APIName__Group_2_1__0"
    // InternalFortXTrans.g:1996:1: rule__APIName__Group_2_1__0 : rule__APIName__Group_2_1__0__Impl rule__APIName__Group_2_1__1 ;
    public final void rule__APIName__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2000:1: ( rule__APIName__Group_2_1__0__Impl rule__APIName__Group_2_1__1 )
            // InternalFortXTrans.g:2001:2: rule__APIName__Group_2_1__0__Impl rule__APIName__Group_2_1__1
            {
            pushFollow(FOLLOW_3);
            rule__APIName__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__APIName__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Group_2_1__0"


    // $ANTLR start "rule__APIName__Group_2_1__0__Impl"
    // InternalFortXTrans.g:2008:1: rule__APIName__Group_2_1__0__Impl : ( '.' ) ;
    public final void rule__APIName__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2012:1: ( ( '.' ) )
            // InternalFortXTrans.g:2013:1: ( '.' )
            {
            // InternalFortXTrans.g:2013:1: ( '.' )
            // InternalFortXTrans.g:2014:2: '.'
            {
             before(grammarAccess.getAPINameAccess().getFullStopKeyword_2_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAPINameAccess().getFullStopKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Group_2_1__0__Impl"


    // $ANTLR start "rule__APIName__Group_2_1__1"
    // InternalFortXTrans.g:2023:1: rule__APIName__Group_2_1__1 : rule__APIName__Group_2_1__1__Impl ;
    public final void rule__APIName__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2027:1: ( rule__APIName__Group_2_1__1__Impl )
            // InternalFortXTrans.g:2028:2: rule__APIName__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__APIName__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Group_2_1__1"


    // $ANTLR start "rule__APIName__Group_2_1__1__Impl"
    // InternalFortXTrans.g:2034:1: rule__APIName__Group_2_1__1__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2038:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:2039:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:2039:1: ( RULE_ID )
            // InternalFortXTrans.g:2040:2: RULE_ID
            {
             before(grammarAccess.getAPINameAccess().getIDTerminalRuleCall_2_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAPINameAccess().getIDTerminalRuleCall_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__Group_2_1__1__Impl"


    // $ANTLR start "rule__SimpleNames__Group_1__0"
    // InternalFortXTrans.g:2050:1: rule__SimpleNames__Group_1__0 : rule__SimpleNames__Group_1__0__Impl rule__SimpleNames__Group_1__1 ;
    public final void rule__SimpleNames__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2054:1: ( rule__SimpleNames__Group_1__0__Impl rule__SimpleNames__Group_1__1 )
            // InternalFortXTrans.g:2055:2: rule__SimpleNames__Group_1__0__Impl rule__SimpleNames__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__SimpleNames__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleNames__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleNames__Group_1__0"


    // $ANTLR start "rule__SimpleNames__Group_1__0__Impl"
    // InternalFortXTrans.g:2062:1: rule__SimpleNames__Group_1__0__Impl : ( ( rule__SimpleNames__BrackAssignment_1_0 ) ) ;
    public final void rule__SimpleNames__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2066:1: ( ( ( rule__SimpleNames__BrackAssignment_1_0 ) ) )
            // InternalFortXTrans.g:2067:1: ( ( rule__SimpleNames__BrackAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:2067:1: ( ( rule__SimpleNames__BrackAssignment_1_0 ) )
            // InternalFortXTrans.g:2068:2: ( rule__SimpleNames__BrackAssignment_1_0 )
            {
             before(grammarAccess.getSimpleNamesAccess().getBrackAssignment_1_0()); 
            // InternalFortXTrans.g:2069:2: ( rule__SimpleNames__BrackAssignment_1_0 )
            // InternalFortXTrans.g:2069:3: rule__SimpleNames__BrackAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleNames__BrackAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleNamesAccess().getBrackAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleNames__Group_1__0__Impl"


    // $ANTLR start "rule__SimpleNames__Group_1__1"
    // InternalFortXTrans.g:2077:1: rule__SimpleNames__Group_1__1 : rule__SimpleNames__Group_1__1__Impl rule__SimpleNames__Group_1__2 ;
    public final void rule__SimpleNames__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2081:1: ( rule__SimpleNames__Group_1__1__Impl rule__SimpleNames__Group_1__2 )
            // InternalFortXTrans.g:2082:2: rule__SimpleNames__Group_1__1__Impl rule__SimpleNames__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__SimpleNames__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleNames__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleNames__Group_1__1"


    // $ANTLR start "rule__SimpleNames__Group_1__1__Impl"
    // InternalFortXTrans.g:2089:1: rule__SimpleNames__Group_1__1__Impl : ( ( rule__SimpleNames__NameListAssignment_1_1 ) ) ;
    public final void rule__SimpleNames__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2093:1: ( ( ( rule__SimpleNames__NameListAssignment_1_1 ) ) )
            // InternalFortXTrans.g:2094:1: ( ( rule__SimpleNames__NameListAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:2094:1: ( ( rule__SimpleNames__NameListAssignment_1_1 ) )
            // InternalFortXTrans.g:2095:2: ( rule__SimpleNames__NameListAssignment_1_1 )
            {
             before(grammarAccess.getSimpleNamesAccess().getNameListAssignment_1_1()); 
            // InternalFortXTrans.g:2096:2: ( rule__SimpleNames__NameListAssignment_1_1 )
            // InternalFortXTrans.g:2096:3: rule__SimpleNames__NameListAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleNames__NameListAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleNamesAccess().getNameListAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleNames__Group_1__1__Impl"


    // $ANTLR start "rule__SimpleNames__Group_1__2"
    // InternalFortXTrans.g:2104:1: rule__SimpleNames__Group_1__2 : rule__SimpleNames__Group_1__2__Impl rule__SimpleNames__Group_1__3 ;
    public final void rule__SimpleNames__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2108:1: ( rule__SimpleNames__Group_1__2__Impl rule__SimpleNames__Group_1__3 )
            // InternalFortXTrans.g:2109:2: rule__SimpleNames__Group_1__2__Impl rule__SimpleNames__Group_1__3
            {
            pushFollow(FOLLOW_11);
            rule__SimpleNames__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleNames__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleNames__Group_1__2"


    // $ANTLR start "rule__SimpleNames__Group_1__2__Impl"
    // InternalFortXTrans.g:2116:1: rule__SimpleNames__Group_1__2__Impl : ( ( rule__SimpleNames__Group_1_2__0 )* ) ;
    public final void rule__SimpleNames__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2120:1: ( ( ( rule__SimpleNames__Group_1_2__0 )* ) )
            // InternalFortXTrans.g:2121:1: ( ( rule__SimpleNames__Group_1_2__0 )* )
            {
            // InternalFortXTrans.g:2121:1: ( ( rule__SimpleNames__Group_1_2__0 )* )
            // InternalFortXTrans.g:2122:2: ( rule__SimpleNames__Group_1_2__0 )*
            {
             before(grammarAccess.getSimpleNamesAccess().getGroup_1_2()); 
            // InternalFortXTrans.g:2123:2: ( rule__SimpleNames__Group_1_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==15) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalFortXTrans.g:2123:3: rule__SimpleNames__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__SimpleNames__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSimpleNamesAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleNames__Group_1__2__Impl"


    // $ANTLR start "rule__SimpleNames__Group_1__3"
    // InternalFortXTrans.g:2131:1: rule__SimpleNames__Group_1__3 : rule__SimpleNames__Group_1__3__Impl ;
    public final void rule__SimpleNames__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2135:1: ( rule__SimpleNames__Group_1__3__Impl )
            // InternalFortXTrans.g:2136:2: rule__SimpleNames__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleNames__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleNames__Group_1__3"


    // $ANTLR start "rule__SimpleNames__Group_1__3__Impl"
    // InternalFortXTrans.g:2142:1: rule__SimpleNames__Group_1__3__Impl : ( '}' ) ;
    public final void rule__SimpleNames__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2146:1: ( ( '}' ) )
            // InternalFortXTrans.g:2147:1: ( '}' )
            {
            // InternalFortXTrans.g:2147:1: ( '}' )
            // InternalFortXTrans.g:2148:2: '}'
            {
             before(grammarAccess.getSimpleNamesAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSimpleNamesAccess().getRightCurlyBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleNames__Group_1__3__Impl"


    // $ANTLR start "rule__SimpleNames__Group_1_2__0"
    // InternalFortXTrans.g:2158:1: rule__SimpleNames__Group_1_2__0 : rule__SimpleNames__Group_1_2__0__Impl rule__SimpleNames__Group_1_2__1 ;
    public final void rule__SimpleNames__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2162:1: ( rule__SimpleNames__Group_1_2__0__Impl rule__SimpleNames__Group_1_2__1 )
            // InternalFortXTrans.g:2163:2: rule__SimpleNames__Group_1_2__0__Impl rule__SimpleNames__Group_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__SimpleNames__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleNames__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleNames__Group_1_2__0"


    // $ANTLR start "rule__SimpleNames__Group_1_2__0__Impl"
    // InternalFortXTrans.g:2170:1: rule__SimpleNames__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__SimpleNames__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2174:1: ( ( ',' ) )
            // InternalFortXTrans.g:2175:1: ( ',' )
            {
            // InternalFortXTrans.g:2175:1: ( ',' )
            // InternalFortXTrans.g:2176:2: ','
            {
             before(grammarAccess.getSimpleNamesAccess().getCommaKeyword_1_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSimpleNamesAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleNames__Group_1_2__0__Impl"


    // $ANTLR start "rule__SimpleNames__Group_1_2__1"
    // InternalFortXTrans.g:2185:1: rule__SimpleNames__Group_1_2__1 : rule__SimpleNames__Group_1_2__1__Impl ;
    public final void rule__SimpleNames__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2189:1: ( rule__SimpleNames__Group_1_2__1__Impl )
            // InternalFortXTrans.g:2190:2: rule__SimpleNames__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleNames__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleNames__Group_1_2__1"


    // $ANTLR start "rule__SimpleNames__Group_1_2__1__Impl"
    // InternalFortXTrans.g:2196:1: rule__SimpleNames__Group_1_2__1__Impl : ( ( rule__SimpleNames__NameListAssignment_1_2_1 ) ) ;
    public final void rule__SimpleNames__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2200:1: ( ( ( rule__SimpleNames__NameListAssignment_1_2_1 ) ) )
            // InternalFortXTrans.g:2201:1: ( ( rule__SimpleNames__NameListAssignment_1_2_1 ) )
            {
            // InternalFortXTrans.g:2201:1: ( ( rule__SimpleNames__NameListAssignment_1_2_1 ) )
            // InternalFortXTrans.g:2202:2: ( rule__SimpleNames__NameListAssignment_1_2_1 )
            {
             before(grammarAccess.getSimpleNamesAccess().getNameListAssignment_1_2_1()); 
            // InternalFortXTrans.g:2203:2: ( rule__SimpleNames__NameListAssignment_1_2_1 )
            // InternalFortXTrans.g:2203:3: rule__SimpleNames__NameListAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleNames__NameListAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleNamesAccess().getNameListAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleNames__Group_1_2__1__Impl"


    // $ANTLR start "rule__AliasedSimpleName__Group__0"
    // InternalFortXTrans.g:2212:1: rule__AliasedSimpleName__Group__0 : rule__AliasedSimpleName__Group__0__Impl rule__AliasedSimpleName__Group__1 ;
    public final void rule__AliasedSimpleName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2216:1: ( rule__AliasedSimpleName__Group__0__Impl rule__AliasedSimpleName__Group__1 )
            // InternalFortXTrans.g:2217:2: rule__AliasedSimpleName__Group__0__Impl rule__AliasedSimpleName__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__AliasedSimpleName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasedSimpleName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedSimpleName__Group__0"


    // $ANTLR start "rule__AliasedSimpleName__Group__0__Impl"
    // InternalFortXTrans.g:2224:1: rule__AliasedSimpleName__Group__0__Impl : ( ( rule__AliasedSimpleName__OrigAssignment_0 ) ) ;
    public final void rule__AliasedSimpleName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2228:1: ( ( ( rule__AliasedSimpleName__OrigAssignment_0 ) ) )
            // InternalFortXTrans.g:2229:1: ( ( rule__AliasedSimpleName__OrigAssignment_0 ) )
            {
            // InternalFortXTrans.g:2229:1: ( ( rule__AliasedSimpleName__OrigAssignment_0 ) )
            // InternalFortXTrans.g:2230:2: ( rule__AliasedSimpleName__OrigAssignment_0 )
            {
             before(grammarAccess.getAliasedSimpleNameAccess().getOrigAssignment_0()); 
            // InternalFortXTrans.g:2231:2: ( rule__AliasedSimpleName__OrigAssignment_0 )
            // InternalFortXTrans.g:2231:3: rule__AliasedSimpleName__OrigAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AliasedSimpleName__OrigAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAliasedSimpleNameAccess().getOrigAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedSimpleName__Group__0__Impl"


    // $ANTLR start "rule__AliasedSimpleName__Group__1"
    // InternalFortXTrans.g:2239:1: rule__AliasedSimpleName__Group__1 : rule__AliasedSimpleName__Group__1__Impl ;
    public final void rule__AliasedSimpleName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2243:1: ( rule__AliasedSimpleName__Group__1__Impl )
            // InternalFortXTrans.g:2244:2: rule__AliasedSimpleName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AliasedSimpleName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedSimpleName__Group__1"


    // $ANTLR start "rule__AliasedSimpleName__Group__1__Impl"
    // InternalFortXTrans.g:2250:1: rule__AliasedSimpleName__Group__1__Impl : ( ( rule__AliasedSimpleName__Group_1__0 )? ) ;
    public final void rule__AliasedSimpleName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2254:1: ( ( ( rule__AliasedSimpleName__Group_1__0 )? ) )
            // InternalFortXTrans.g:2255:1: ( ( rule__AliasedSimpleName__Group_1__0 )? )
            {
            // InternalFortXTrans.g:2255:1: ( ( rule__AliasedSimpleName__Group_1__0 )? )
            // InternalFortXTrans.g:2256:2: ( rule__AliasedSimpleName__Group_1__0 )?
            {
             before(grammarAccess.getAliasedSimpleNameAccess().getGroup_1()); 
            // InternalFortXTrans.g:2257:2: ( rule__AliasedSimpleName__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalFortXTrans.g:2257:3: rule__AliasedSimpleName__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AliasedSimpleName__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAliasedSimpleNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedSimpleName__Group__1__Impl"


    // $ANTLR start "rule__AliasedSimpleName__Group_1__0"
    // InternalFortXTrans.g:2266:1: rule__AliasedSimpleName__Group_1__0 : rule__AliasedSimpleName__Group_1__0__Impl rule__AliasedSimpleName__Group_1__1 ;
    public final void rule__AliasedSimpleName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2270:1: ( rule__AliasedSimpleName__Group_1__0__Impl rule__AliasedSimpleName__Group_1__1 )
            // InternalFortXTrans.g:2271:2: rule__AliasedSimpleName__Group_1__0__Impl rule__AliasedSimpleName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__AliasedSimpleName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasedSimpleName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedSimpleName__Group_1__0"


    // $ANTLR start "rule__AliasedSimpleName__Group_1__0__Impl"
    // InternalFortXTrans.g:2278:1: rule__AliasedSimpleName__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__AliasedSimpleName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2282:1: ( ( 'as' ) )
            // InternalFortXTrans.g:2283:1: ( 'as' )
            {
            // InternalFortXTrans.g:2283:1: ( 'as' )
            // InternalFortXTrans.g:2284:2: 'as'
            {
             before(grammarAccess.getAliasedSimpleNameAccess().getAsKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAliasedSimpleNameAccess().getAsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedSimpleName__Group_1__0__Impl"


    // $ANTLR start "rule__AliasedSimpleName__Group_1__1"
    // InternalFortXTrans.g:2293:1: rule__AliasedSimpleName__Group_1__1 : rule__AliasedSimpleName__Group_1__1__Impl ;
    public final void rule__AliasedSimpleName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2297:1: ( rule__AliasedSimpleName__Group_1__1__Impl )
            // InternalFortXTrans.g:2298:2: rule__AliasedSimpleName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AliasedSimpleName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedSimpleName__Group_1__1"


    // $ANTLR start "rule__AliasedSimpleName__Group_1__1__Impl"
    // InternalFortXTrans.g:2304:1: rule__AliasedSimpleName__Group_1__1__Impl : ( ( rule__AliasedSimpleName__AsNameAssignment_1_1 ) ) ;
    public final void rule__AliasedSimpleName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2308:1: ( ( ( rule__AliasedSimpleName__AsNameAssignment_1_1 ) ) )
            // InternalFortXTrans.g:2309:1: ( ( rule__AliasedSimpleName__AsNameAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:2309:1: ( ( rule__AliasedSimpleName__AsNameAssignment_1_1 ) )
            // InternalFortXTrans.g:2310:2: ( rule__AliasedSimpleName__AsNameAssignment_1_1 )
            {
             before(grammarAccess.getAliasedSimpleNameAccess().getAsNameAssignment_1_1()); 
            // InternalFortXTrans.g:2311:2: ( rule__AliasedSimpleName__AsNameAssignment_1_1 )
            // InternalFortXTrans.g:2311:3: rule__AliasedSimpleName__AsNameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AliasedSimpleName__AsNameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAliasedSimpleNameAccess().getAsNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedSimpleName__Group_1__1__Impl"


    // $ANTLR start "rule__AliasedAPINames__Group_1__0"
    // InternalFortXTrans.g:2320:1: rule__AliasedAPINames__Group_1__0 : rule__AliasedAPINames__Group_1__0__Impl rule__AliasedAPINames__Group_1__1 ;
    public final void rule__AliasedAPINames__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2324:1: ( rule__AliasedAPINames__Group_1__0__Impl rule__AliasedAPINames__Group_1__1 )
            // InternalFortXTrans.g:2325:2: rule__AliasedAPINames__Group_1__0__Impl rule__AliasedAPINames__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__AliasedAPINames__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasedAPINames__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPINames__Group_1__0"


    // $ANTLR start "rule__AliasedAPINames__Group_1__0__Impl"
    // InternalFortXTrans.g:2332:1: rule__AliasedAPINames__Group_1__0__Impl : ( ( rule__AliasedAPINames__BrackAssignment_1_0 ) ) ;
    public final void rule__AliasedAPINames__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2336:1: ( ( ( rule__AliasedAPINames__BrackAssignment_1_0 ) ) )
            // InternalFortXTrans.g:2337:1: ( ( rule__AliasedAPINames__BrackAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:2337:1: ( ( rule__AliasedAPINames__BrackAssignment_1_0 ) )
            // InternalFortXTrans.g:2338:2: ( rule__AliasedAPINames__BrackAssignment_1_0 )
            {
             before(grammarAccess.getAliasedAPINamesAccess().getBrackAssignment_1_0()); 
            // InternalFortXTrans.g:2339:2: ( rule__AliasedAPINames__BrackAssignment_1_0 )
            // InternalFortXTrans.g:2339:3: rule__AliasedAPINames__BrackAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AliasedAPINames__BrackAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAliasedAPINamesAccess().getBrackAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPINames__Group_1__0__Impl"


    // $ANTLR start "rule__AliasedAPINames__Group_1__1"
    // InternalFortXTrans.g:2347:1: rule__AliasedAPINames__Group_1__1 : rule__AliasedAPINames__Group_1__1__Impl rule__AliasedAPINames__Group_1__2 ;
    public final void rule__AliasedAPINames__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2351:1: ( rule__AliasedAPINames__Group_1__1__Impl rule__AliasedAPINames__Group_1__2 )
            // InternalFortXTrans.g:2352:2: rule__AliasedAPINames__Group_1__1__Impl rule__AliasedAPINames__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__AliasedAPINames__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasedAPINames__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPINames__Group_1__1"


    // $ANTLR start "rule__AliasedAPINames__Group_1__1__Impl"
    // InternalFortXTrans.g:2359:1: rule__AliasedAPINames__Group_1__1__Impl : ( ( rule__AliasedAPINames__NameListAssignment_1_1 ) ) ;
    public final void rule__AliasedAPINames__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2363:1: ( ( ( rule__AliasedAPINames__NameListAssignment_1_1 ) ) )
            // InternalFortXTrans.g:2364:1: ( ( rule__AliasedAPINames__NameListAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:2364:1: ( ( rule__AliasedAPINames__NameListAssignment_1_1 ) )
            // InternalFortXTrans.g:2365:2: ( rule__AliasedAPINames__NameListAssignment_1_1 )
            {
             before(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_1_1()); 
            // InternalFortXTrans.g:2366:2: ( rule__AliasedAPINames__NameListAssignment_1_1 )
            // InternalFortXTrans.g:2366:3: rule__AliasedAPINames__NameListAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AliasedAPINames__NameListAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPINames__Group_1__1__Impl"


    // $ANTLR start "rule__AliasedAPINames__Group_1__2"
    // InternalFortXTrans.g:2374:1: rule__AliasedAPINames__Group_1__2 : rule__AliasedAPINames__Group_1__2__Impl rule__AliasedAPINames__Group_1__3 ;
    public final void rule__AliasedAPINames__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2378:1: ( rule__AliasedAPINames__Group_1__2__Impl rule__AliasedAPINames__Group_1__3 )
            // InternalFortXTrans.g:2379:2: rule__AliasedAPINames__Group_1__2__Impl rule__AliasedAPINames__Group_1__3
            {
            pushFollow(FOLLOW_11);
            rule__AliasedAPINames__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasedAPINames__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPINames__Group_1__2"


    // $ANTLR start "rule__AliasedAPINames__Group_1__2__Impl"
    // InternalFortXTrans.g:2386:1: rule__AliasedAPINames__Group_1__2__Impl : ( ( rule__AliasedAPINames__Group_1_2__0 )* ) ;
    public final void rule__AliasedAPINames__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2390:1: ( ( ( rule__AliasedAPINames__Group_1_2__0 )* ) )
            // InternalFortXTrans.g:2391:1: ( ( rule__AliasedAPINames__Group_1_2__0 )* )
            {
            // InternalFortXTrans.g:2391:1: ( ( rule__AliasedAPINames__Group_1_2__0 )* )
            // InternalFortXTrans.g:2392:2: ( rule__AliasedAPINames__Group_1_2__0 )*
            {
             before(grammarAccess.getAliasedAPINamesAccess().getGroup_1_2()); 
            // InternalFortXTrans.g:2393:2: ( rule__AliasedAPINames__Group_1_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==15) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalFortXTrans.g:2393:3: rule__AliasedAPINames__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__AliasedAPINames__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getAliasedAPINamesAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPINames__Group_1__2__Impl"


    // $ANTLR start "rule__AliasedAPINames__Group_1__3"
    // InternalFortXTrans.g:2401:1: rule__AliasedAPINames__Group_1__3 : rule__AliasedAPINames__Group_1__3__Impl ;
    public final void rule__AliasedAPINames__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2405:1: ( rule__AliasedAPINames__Group_1__3__Impl )
            // InternalFortXTrans.g:2406:2: rule__AliasedAPINames__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AliasedAPINames__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPINames__Group_1__3"


    // $ANTLR start "rule__AliasedAPINames__Group_1__3__Impl"
    // InternalFortXTrans.g:2412:1: rule__AliasedAPINames__Group_1__3__Impl : ( '}' ) ;
    public final void rule__AliasedAPINames__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2416:1: ( ( '}' ) )
            // InternalFortXTrans.g:2417:1: ( '}' )
            {
            // InternalFortXTrans.g:2417:1: ( '}' )
            // InternalFortXTrans.g:2418:2: '}'
            {
             before(grammarAccess.getAliasedAPINamesAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAliasedAPINamesAccess().getRightCurlyBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPINames__Group_1__3__Impl"


    // $ANTLR start "rule__AliasedAPINames__Group_1_2__0"
    // InternalFortXTrans.g:2428:1: rule__AliasedAPINames__Group_1_2__0 : rule__AliasedAPINames__Group_1_2__0__Impl rule__AliasedAPINames__Group_1_2__1 ;
    public final void rule__AliasedAPINames__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2432:1: ( rule__AliasedAPINames__Group_1_2__0__Impl rule__AliasedAPINames__Group_1_2__1 )
            // InternalFortXTrans.g:2433:2: rule__AliasedAPINames__Group_1_2__0__Impl rule__AliasedAPINames__Group_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__AliasedAPINames__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasedAPINames__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPINames__Group_1_2__0"


    // $ANTLR start "rule__AliasedAPINames__Group_1_2__0__Impl"
    // InternalFortXTrans.g:2440:1: rule__AliasedAPINames__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__AliasedAPINames__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2444:1: ( ( ',' ) )
            // InternalFortXTrans.g:2445:1: ( ',' )
            {
            // InternalFortXTrans.g:2445:1: ( ',' )
            // InternalFortXTrans.g:2446:2: ','
            {
             before(grammarAccess.getAliasedAPINamesAccess().getCommaKeyword_1_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAliasedAPINamesAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPINames__Group_1_2__0__Impl"


    // $ANTLR start "rule__AliasedAPINames__Group_1_2__1"
    // InternalFortXTrans.g:2455:1: rule__AliasedAPINames__Group_1_2__1 : rule__AliasedAPINames__Group_1_2__1__Impl ;
    public final void rule__AliasedAPINames__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2459:1: ( rule__AliasedAPINames__Group_1_2__1__Impl )
            // InternalFortXTrans.g:2460:2: rule__AliasedAPINames__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AliasedAPINames__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPINames__Group_1_2__1"


    // $ANTLR start "rule__AliasedAPINames__Group_1_2__1__Impl"
    // InternalFortXTrans.g:2466:1: rule__AliasedAPINames__Group_1_2__1__Impl : ( ( rule__AliasedAPINames__NameListAssignment_1_2_1 ) ) ;
    public final void rule__AliasedAPINames__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2470:1: ( ( ( rule__AliasedAPINames__NameListAssignment_1_2_1 ) ) )
            // InternalFortXTrans.g:2471:1: ( ( rule__AliasedAPINames__NameListAssignment_1_2_1 ) )
            {
            // InternalFortXTrans.g:2471:1: ( ( rule__AliasedAPINames__NameListAssignment_1_2_1 ) )
            // InternalFortXTrans.g:2472:2: ( rule__AliasedAPINames__NameListAssignment_1_2_1 )
            {
             before(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_1_2_1()); 
            // InternalFortXTrans.g:2473:2: ( rule__AliasedAPINames__NameListAssignment_1_2_1 )
            // InternalFortXTrans.g:2473:3: rule__AliasedAPINames__NameListAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AliasedAPINames__NameListAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPINames__Group_1_2__1__Impl"


    // $ANTLR start "rule__AliasedAPIName__Group__0"
    // InternalFortXTrans.g:2482:1: rule__AliasedAPIName__Group__0 : rule__AliasedAPIName__Group__0__Impl rule__AliasedAPIName__Group__1 ;
    public final void rule__AliasedAPIName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2486:1: ( rule__AliasedAPIName__Group__0__Impl rule__AliasedAPIName__Group__1 )
            // InternalFortXTrans.g:2487:2: rule__AliasedAPIName__Group__0__Impl rule__AliasedAPIName__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__AliasedAPIName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasedAPIName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPIName__Group__0"


    // $ANTLR start "rule__AliasedAPIName__Group__0__Impl"
    // InternalFortXTrans.g:2494:1: rule__AliasedAPIName__Group__0__Impl : ( ( rule__AliasedAPIName__OrigAssignment_0 ) ) ;
    public final void rule__AliasedAPIName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2498:1: ( ( ( rule__AliasedAPIName__OrigAssignment_0 ) ) )
            // InternalFortXTrans.g:2499:1: ( ( rule__AliasedAPIName__OrigAssignment_0 ) )
            {
            // InternalFortXTrans.g:2499:1: ( ( rule__AliasedAPIName__OrigAssignment_0 ) )
            // InternalFortXTrans.g:2500:2: ( rule__AliasedAPIName__OrigAssignment_0 )
            {
             before(grammarAccess.getAliasedAPINameAccess().getOrigAssignment_0()); 
            // InternalFortXTrans.g:2501:2: ( rule__AliasedAPIName__OrigAssignment_0 )
            // InternalFortXTrans.g:2501:3: rule__AliasedAPIName__OrigAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AliasedAPIName__OrigAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAliasedAPINameAccess().getOrigAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPIName__Group__0__Impl"


    // $ANTLR start "rule__AliasedAPIName__Group__1"
    // InternalFortXTrans.g:2509:1: rule__AliasedAPIName__Group__1 : rule__AliasedAPIName__Group__1__Impl ;
    public final void rule__AliasedAPIName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2513:1: ( rule__AliasedAPIName__Group__1__Impl )
            // InternalFortXTrans.g:2514:2: rule__AliasedAPIName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AliasedAPIName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPIName__Group__1"


    // $ANTLR start "rule__AliasedAPIName__Group__1__Impl"
    // InternalFortXTrans.g:2520:1: rule__AliasedAPIName__Group__1__Impl : ( ( rule__AliasedAPIName__Group_1__0 )? ) ;
    public final void rule__AliasedAPIName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2524:1: ( ( ( rule__AliasedAPIName__Group_1__0 )? ) )
            // InternalFortXTrans.g:2525:1: ( ( rule__AliasedAPIName__Group_1__0 )? )
            {
            // InternalFortXTrans.g:2525:1: ( ( rule__AliasedAPIName__Group_1__0 )? )
            // InternalFortXTrans.g:2526:2: ( rule__AliasedAPIName__Group_1__0 )?
            {
             before(grammarAccess.getAliasedAPINameAccess().getGroup_1()); 
            // InternalFortXTrans.g:2527:2: ( rule__AliasedAPIName__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==19) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalFortXTrans.g:2527:3: rule__AliasedAPIName__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AliasedAPIName__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAliasedAPINameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPIName__Group__1__Impl"


    // $ANTLR start "rule__AliasedAPIName__Group_1__0"
    // InternalFortXTrans.g:2536:1: rule__AliasedAPIName__Group_1__0 : rule__AliasedAPIName__Group_1__0__Impl rule__AliasedAPIName__Group_1__1 ;
    public final void rule__AliasedAPIName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2540:1: ( rule__AliasedAPIName__Group_1__0__Impl rule__AliasedAPIName__Group_1__1 )
            // InternalFortXTrans.g:2541:2: rule__AliasedAPIName__Group_1__0__Impl rule__AliasedAPIName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__AliasedAPIName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasedAPIName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPIName__Group_1__0"


    // $ANTLR start "rule__AliasedAPIName__Group_1__0__Impl"
    // InternalFortXTrans.g:2548:1: rule__AliasedAPIName__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__AliasedAPIName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2552:1: ( ( 'as' ) )
            // InternalFortXTrans.g:2553:1: ( 'as' )
            {
            // InternalFortXTrans.g:2553:1: ( 'as' )
            // InternalFortXTrans.g:2554:2: 'as'
            {
             before(grammarAccess.getAliasedAPINameAccess().getAsKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAliasedAPINameAccess().getAsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPIName__Group_1__0__Impl"


    // $ANTLR start "rule__AliasedAPIName__Group_1__1"
    // InternalFortXTrans.g:2563:1: rule__AliasedAPIName__Group_1__1 : rule__AliasedAPIName__Group_1__1__Impl ;
    public final void rule__AliasedAPIName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2567:1: ( rule__AliasedAPIName__Group_1__1__Impl )
            // InternalFortXTrans.g:2568:2: rule__AliasedAPIName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AliasedAPIName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPIName__Group_1__1"


    // $ANTLR start "rule__AliasedAPIName__Group_1__1__Impl"
    // InternalFortXTrans.g:2574:1: rule__AliasedAPIName__Group_1__1__Impl : ( ( rule__AliasedAPIName__AsNameAssignment_1_1 ) ) ;
    public final void rule__AliasedAPIName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2578:1: ( ( ( rule__AliasedAPIName__AsNameAssignment_1_1 ) ) )
            // InternalFortXTrans.g:2579:1: ( ( rule__AliasedAPIName__AsNameAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:2579:1: ( ( rule__AliasedAPIName__AsNameAssignment_1_1 ) )
            // InternalFortXTrans.g:2580:2: ( rule__AliasedAPIName__AsNameAssignment_1_1 )
            {
             before(grammarAccess.getAliasedAPINameAccess().getAsNameAssignment_1_1()); 
            // InternalFortXTrans.g:2581:2: ( rule__AliasedAPIName__AsNameAssignment_1_1 )
            // InternalFortXTrans.g:2581:3: rule__AliasedAPIName__AsNameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AliasedAPIName__AsNameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAliasedAPINameAccess().getAsNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPIName__Group_1__1__Impl"


    // $ANTLR start "rule__API__NameAssignment_1"
    // InternalFortXTrans.g:2590:1: rule__API__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__API__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2594:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:2595:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:2595:2: ( RULE_ID )
            // InternalFortXTrans.g:2596:3: RULE_ID
            {
             before(grammarAccess.getAPIAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAPIAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__API__NameAssignment_1"


    // $ANTLR start "rule__API__ImportsAssignment_2"
    // InternalFortXTrans.g:2605:1: rule__API__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__API__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2609:1: ( ( ruleImport ) )
            // InternalFortXTrans.g:2610:2: ( ruleImport )
            {
            // InternalFortXTrans.g:2610:2: ( ruleImport )
            // InternalFortXTrans.g:2611:3: ruleImport
            {
             before(grammarAccess.getAPIAccess().getImportsImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getAPIAccess().getImportsImportParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__API__ImportsAssignment_2"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalFortXTrans.g:2620:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2624:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:2625:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:2625:2: ( RULE_ID )
            // InternalFortXTrans.g:2626:3: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Component__ImportsAssignment_2"
    // InternalFortXTrans.g:2635:1: rule__Component__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Component__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2639:1: ( ( ruleImport ) )
            // InternalFortXTrans.g:2640:2: ( ruleImport )
            {
            // InternalFortXTrans.g:2640:2: ( ruleImport )
            // InternalFortXTrans.g:2641:3: ruleImport
            {
             before(grammarAccess.getComponentAccess().getImportsImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getImportsImportParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ImportsAssignment_2"


    // $ANTLR start "rule__Component__ExportsAssignment_3"
    // InternalFortXTrans.g:2650:1: rule__Component__ExportsAssignment_3 : ( ruleExport ) ;
    public final void rule__Component__ExportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2654:1: ( ( ruleExport ) )
            // InternalFortXTrans.g:2655:2: ( ruleExport )
            {
            // InternalFortXTrans.g:2655:2: ( ruleExport )
            // InternalFortXTrans.g:2656:3: ruleExport
            {
             before(grammarAccess.getComponentAccess().getExportsExportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExport();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getExportsExportParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ExportsAssignment_3"


    // $ANTLR start "rule__Import__ImpsAssignment_0_0"
    // InternalFortXTrans.g:2665:1: rule__Import__ImpsAssignment_0_0 : ( ( 'import' ) ) ;
    public final void rule__Import__ImpsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2669:1: ( ( ( 'import' ) ) )
            // InternalFortXTrans.g:2670:2: ( ( 'import' ) )
            {
            // InternalFortXTrans.g:2670:2: ( ( 'import' ) )
            // InternalFortXTrans.g:2671:3: ( 'import' )
            {
             before(grammarAccess.getImportAccess().getImpsImportKeyword_0_0_0()); 
            // InternalFortXTrans.g:2672:3: ( 'import' )
            // InternalFortXTrans.g:2673:4: 'import'
            {
             before(grammarAccess.getImportAccess().getImpsImportKeyword_0_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImpsImportKeyword_0_0_0()); 

            }

             after(grammarAccess.getImportAccess().getImpsImportKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImpsAssignment_0_0"


    // $ANTLR start "rule__Import__ImportedNamesAssignment_0_1"
    // InternalFortXTrans.g:2684:1: rule__Import__ImportedNamesAssignment_0_1 : ( ruleImportedNames ) ;
    public final void rule__Import__ImportedNamesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2688:1: ( ( ruleImportedNames ) )
            // InternalFortXTrans.g:2689:2: ( ruleImportedNames )
            {
            // InternalFortXTrans.g:2689:2: ( ruleImportedNames )
            // InternalFortXTrans.g:2690:3: ruleImportedNames
            {
             before(grammarAccess.getImportAccess().getImportedNamesImportedNamesParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImportedNames();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamesImportedNamesParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamesAssignment_0_1"


    // $ANTLR start "rule__Import__ImpsAssignment_1_0"
    // InternalFortXTrans.g:2699:1: rule__Import__ImpsAssignment_1_0 : ( ( 'import' ) ) ;
    public final void rule__Import__ImpsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2703:1: ( ( ( 'import' ) ) )
            // InternalFortXTrans.g:2704:2: ( ( 'import' ) )
            {
            // InternalFortXTrans.g:2704:2: ( ( 'import' ) )
            // InternalFortXTrans.g:2705:3: ( 'import' )
            {
             before(grammarAccess.getImportAccess().getImpsImportKeyword_1_0_0()); 
            // InternalFortXTrans.g:2706:3: ( 'import' )
            // InternalFortXTrans.g:2707:4: 'import'
            {
             before(grammarAccess.getImportAccess().getImpsImportKeyword_1_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImpsImportKeyword_1_0_0()); 

            }

             after(grammarAccess.getImportAccess().getImpsImportKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImpsAssignment_1_0"


    // $ANTLR start "rule__Import__ApiAssignment_1_1"
    // InternalFortXTrans.g:2718:1: rule__Import__ApiAssignment_1_1 : ( ( 'api' ) ) ;
    public final void rule__Import__ApiAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2722:1: ( ( ( 'api' ) ) )
            // InternalFortXTrans.g:2723:2: ( ( 'api' ) )
            {
            // InternalFortXTrans.g:2723:2: ( ( 'api' ) )
            // InternalFortXTrans.g:2724:3: ( 'api' )
            {
             before(grammarAccess.getImportAccess().getApiApiKeyword_1_1_0()); 
            // InternalFortXTrans.g:2725:3: ( 'api' )
            // InternalFortXTrans.g:2726:4: 'api'
            {
             before(grammarAccess.getImportAccess().getApiApiKeyword_1_1_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getApiApiKeyword_1_1_0()); 

            }

             after(grammarAccess.getImportAccess().getApiApiKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ApiAssignment_1_1"


    // $ANTLR start "rule__Import__AliasedimportedNamesAssignment_1_2"
    // InternalFortXTrans.g:2737:1: rule__Import__AliasedimportedNamesAssignment_1_2 : ( ruleAliasedAPINames ) ;
    public final void rule__Import__AliasedimportedNamesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2741:1: ( ( ruleAliasedAPINames ) )
            // InternalFortXTrans.g:2742:2: ( ruleAliasedAPINames )
            {
            // InternalFortXTrans.g:2742:2: ( ruleAliasedAPINames )
            // InternalFortXTrans.g:2743:3: ruleAliasedAPINames
            {
             before(grammarAccess.getImportAccess().getAliasedimportedNamesAliasedAPINamesParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAliasedAPINames();

            state._fsp--;

             after(grammarAccess.getImportAccess().getAliasedimportedNamesAliasedAPINamesParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__AliasedimportedNamesAssignment_1_2"


    // $ANTLR start "rule__Export__ExpAssignment_0_0"
    // InternalFortXTrans.g:2752:1: rule__Export__ExpAssignment_0_0 : ( ( 'export' ) ) ;
    public final void rule__Export__ExpAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2756:1: ( ( ( 'export' ) ) )
            // InternalFortXTrans.g:2757:2: ( ( 'export' ) )
            {
            // InternalFortXTrans.g:2757:2: ( ( 'export' ) )
            // InternalFortXTrans.g:2758:3: ( 'export' )
            {
             before(grammarAccess.getExportAccess().getExpExportKeyword_0_0_0()); 
            // InternalFortXTrans.g:2759:3: ( 'export' )
            // InternalFortXTrans.g:2760:4: 'export'
            {
             before(grammarAccess.getExportAccess().getExpExportKeyword_0_0_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExportAccess().getExpExportKeyword_0_0_0()); 

            }

             after(grammarAccess.getExportAccess().getExpExportKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__ExpAssignment_0_0"


    // $ANTLR start "rule__Export__ExportedNameAssignment_0_1"
    // InternalFortXTrans.g:2771:1: rule__Export__ExportedNameAssignment_0_1 : ( ruleAPIName ) ;
    public final void rule__Export__ExportedNameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2775:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:2776:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:2776:2: ( ruleAPIName )
            // InternalFortXTrans.g:2777:3: ruleAPIName
            {
             before(grammarAccess.getExportAccess().getExportedNameAPINameParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAPIName();

            state._fsp--;

             after(grammarAccess.getExportAccess().getExportedNameAPINameParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__ExportedNameAssignment_0_1"


    // $ANTLR start "rule__Export__ExpAssignment_1_0"
    // InternalFortXTrans.g:2786:1: rule__Export__ExpAssignment_1_0 : ( ( 'export' ) ) ;
    public final void rule__Export__ExpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2790:1: ( ( ( 'export' ) ) )
            // InternalFortXTrans.g:2791:2: ( ( 'export' ) )
            {
            // InternalFortXTrans.g:2791:2: ( ( 'export' ) )
            // InternalFortXTrans.g:2792:3: ( 'export' )
            {
             before(grammarAccess.getExportAccess().getExpExportKeyword_1_0_0()); 
            // InternalFortXTrans.g:2793:3: ( 'export' )
            // InternalFortXTrans.g:2794:4: 'export'
            {
             before(grammarAccess.getExportAccess().getExpExportKeyword_1_0_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExportAccess().getExpExportKeyword_1_0_0()); 

            }

             after(grammarAccess.getExportAccess().getExpExportKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__ExpAssignment_1_0"


    // $ANTLR start "rule__Export__BrackAssignment_1_1"
    // InternalFortXTrans.g:2805:1: rule__Export__BrackAssignment_1_1 : ( ( '{' ) ) ;
    public final void rule__Export__BrackAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2809:1: ( ( ( '{' ) ) )
            // InternalFortXTrans.g:2810:2: ( ( '{' ) )
            {
            // InternalFortXTrans.g:2810:2: ( ( '{' ) )
            // InternalFortXTrans.g:2811:3: ( '{' )
            {
             before(grammarAccess.getExportAccess().getBrackLeftCurlyBracketKeyword_1_1_0()); 
            // InternalFortXTrans.g:2812:3: ( '{' )
            // InternalFortXTrans.g:2813:4: '{'
            {
             before(grammarAccess.getExportAccess().getBrackLeftCurlyBracketKeyword_1_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExportAccess().getBrackLeftCurlyBracketKeyword_1_1_0()); 

            }

             after(grammarAccess.getExportAccess().getBrackLeftCurlyBracketKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__BrackAssignment_1_1"


    // $ANTLR start "rule__Export__ExportedNameAssignment_1_2"
    // InternalFortXTrans.g:2824:1: rule__Export__ExportedNameAssignment_1_2 : ( ruleAPIName ) ;
    public final void rule__Export__ExportedNameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2828:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:2829:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:2829:2: ( ruleAPIName )
            // InternalFortXTrans.g:2830:3: ruleAPIName
            {
             before(grammarAccess.getExportAccess().getExportedNameAPINameParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAPIName();

            state._fsp--;

             after(grammarAccess.getExportAccess().getExportedNameAPINameParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__ExportedNameAssignment_1_2"


    // $ANTLR start "rule__Export__ExportedNameAssignment_1_3_1"
    // InternalFortXTrans.g:2839:1: rule__Export__ExportedNameAssignment_1_3_1 : ( ruleAPIName ) ;
    public final void rule__Export__ExportedNameAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2843:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:2844:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:2844:2: ( ruleAPIName )
            // InternalFortXTrans.g:2845:3: ruleAPIName
            {
             before(grammarAccess.getExportAccess().getExportedNameAPINameParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAPIName();

            state._fsp--;

             after(grammarAccess.getExportAccess().getExportedNameAPINameParserRuleCall_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__ExportedNameAssignment_1_3_1"


    // $ANTLR start "rule__ImportedNames__ImpnameAssignment_0_0"
    // InternalFortXTrans.g:2854:1: rule__ImportedNames__ImpnameAssignment_0_0 : ( ruleAPIName ) ;
    public final void rule__ImportedNames__ImpnameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2858:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:2859:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:2859:2: ( ruleAPIName )
            // InternalFortXTrans.g:2860:3: ruleAPIName
            {
             before(grammarAccess.getImportedNamesAccess().getImpnameAPINameParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAPIName();

            state._fsp--;

             after(grammarAccess.getImportedNamesAccess().getImpnameAPINameParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__ImpnameAssignment_0_0"


    // $ANTLR start "rule__ImportedNames__ExceptAssignment_0_5_0"
    // InternalFortXTrans.g:2869:1: rule__ImportedNames__ExceptAssignment_0_5_0 : ( ( 'except' ) ) ;
    public final void rule__ImportedNames__ExceptAssignment_0_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2873:1: ( ( ( 'except' ) ) )
            // InternalFortXTrans.g:2874:2: ( ( 'except' ) )
            {
            // InternalFortXTrans.g:2874:2: ( ( 'except' ) )
            // InternalFortXTrans.g:2875:3: ( 'except' )
            {
             before(grammarAccess.getImportedNamesAccess().getExceptExceptKeyword_0_5_0_0()); 
            // InternalFortXTrans.g:2876:3: ( 'except' )
            // InternalFortXTrans.g:2877:4: 'except'
            {
             before(grammarAccess.getImportedNamesAccess().getExceptExceptKeyword_0_5_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getImportedNamesAccess().getExceptExceptKeyword_0_5_0_0()); 

            }

             after(grammarAccess.getImportedNamesAccess().getExceptExceptKeyword_0_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__ExceptAssignment_0_5_0"


    // $ANTLR start "rule__ImportedNames__SimpAssignment_0_5_1"
    // InternalFortXTrans.g:2888:1: rule__ImportedNames__SimpAssignment_0_5_1 : ( ruleSimpleNames ) ;
    public final void rule__ImportedNames__SimpAssignment_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2892:1: ( ( ruleSimpleNames ) )
            // InternalFortXTrans.g:2893:2: ( ruleSimpleNames )
            {
            // InternalFortXTrans.g:2893:2: ( ruleSimpleNames )
            // InternalFortXTrans.g:2894:3: ruleSimpleNames
            {
             before(grammarAccess.getImportedNamesAccess().getSimpSimpleNamesParserRuleCall_0_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleNames();

            state._fsp--;

             after(grammarAccess.getImportedNamesAccess().getSimpSimpleNamesParserRuleCall_0_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__SimpAssignment_0_5_1"


    // $ANTLR start "rule__ImportedNames__ImpnameAssignment_1_0"
    // InternalFortXTrans.g:2903:1: rule__ImportedNames__ImpnameAssignment_1_0 : ( ruleAPIName ) ;
    public final void rule__ImportedNames__ImpnameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2907:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:2908:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:2908:2: ( ruleAPIName )
            // InternalFortXTrans.g:2909:3: ruleAPIName
            {
             before(grammarAccess.getImportedNamesAccess().getImpnameAPINameParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAPIName();

            state._fsp--;

             after(grammarAccess.getImportedNamesAccess().getImpnameAPINameParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__ImpnameAssignment_1_0"


    // $ANTLR start "rule__ImportedNames__SimpListAssignment_1_3"
    // InternalFortXTrans.g:2918:1: rule__ImportedNames__SimpListAssignment_1_3 : ( ruleAliasedSimpleName ) ;
    public final void rule__ImportedNames__SimpListAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2922:1: ( ( ruleAliasedSimpleName ) )
            // InternalFortXTrans.g:2923:2: ( ruleAliasedSimpleName )
            {
            // InternalFortXTrans.g:2923:2: ( ruleAliasedSimpleName )
            // InternalFortXTrans.g:2924:3: ruleAliasedSimpleName
            {
             before(grammarAccess.getImportedNamesAccess().getSimpListAliasedSimpleNameParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAliasedSimpleName();

            state._fsp--;

             after(grammarAccess.getImportedNamesAccess().getSimpListAliasedSimpleNameParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__SimpListAssignment_1_3"


    // $ANTLR start "rule__ImportedNames__SimpListAssignment_1_4_1"
    // InternalFortXTrans.g:2933:1: rule__ImportedNames__SimpListAssignment_1_4_1 : ( ruleAliasedSimpleName ) ;
    public final void rule__ImportedNames__SimpListAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2937:1: ( ( ruleAliasedSimpleName ) )
            // InternalFortXTrans.g:2938:2: ( ruleAliasedSimpleName )
            {
            // InternalFortXTrans.g:2938:2: ( ruleAliasedSimpleName )
            // InternalFortXTrans.g:2939:3: ruleAliasedSimpleName
            {
             before(grammarAccess.getImportedNamesAccess().getSimpListAliasedSimpleNameParserRuleCall_1_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAliasedSimpleName();

            state._fsp--;

             after(grammarAccess.getImportedNamesAccess().getSimpListAliasedSimpleNameParserRuleCall_1_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__SimpListAssignment_1_4_1"


    // $ANTLR start "rule__ImportedNames__CommaAssignment_1_5_0"
    // InternalFortXTrans.g:2948:1: rule__ImportedNames__CommaAssignment_1_5_0 : ( ( ',' ) ) ;
    public final void rule__ImportedNames__CommaAssignment_1_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2952:1: ( ( ( ',' ) ) )
            // InternalFortXTrans.g:2953:2: ( ( ',' ) )
            {
            // InternalFortXTrans.g:2953:2: ( ( ',' ) )
            // InternalFortXTrans.g:2954:3: ( ',' )
            {
             before(grammarAccess.getImportedNamesAccess().getCommaCommaKeyword_1_5_0_0()); 
            // InternalFortXTrans.g:2955:3: ( ',' )
            // InternalFortXTrans.g:2956:4: ','
            {
             before(grammarAccess.getImportedNamesAccess().getCommaCommaKeyword_1_5_0_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getImportedNamesAccess().getCommaCommaKeyword_1_5_0_0()); 

            }

             after(grammarAccess.getImportedNamesAccess().getCommaCommaKeyword_1_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__CommaAssignment_1_5_0"


    // $ANTLR start "rule__ImportedNames__DotsAssignment_1_5_1"
    // InternalFortXTrans.g:2967:1: rule__ImportedNames__DotsAssignment_1_5_1 : ( ( '...' ) ) ;
    public final void rule__ImportedNames__DotsAssignment_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2971:1: ( ( ( '...' ) ) )
            // InternalFortXTrans.g:2972:2: ( ( '...' ) )
            {
            // InternalFortXTrans.g:2972:2: ( ( '...' ) )
            // InternalFortXTrans.g:2973:3: ( '...' )
            {
             before(grammarAccess.getImportedNamesAccess().getDotsFullStopFullStopFullStopKeyword_1_5_1_0()); 
            // InternalFortXTrans.g:2974:3: ( '...' )
            // InternalFortXTrans.g:2975:4: '...'
            {
             before(grammarAccess.getImportedNamesAccess().getDotsFullStopFullStopFullStopKeyword_1_5_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getImportedNamesAccess().getDotsFullStopFullStopFullStopKeyword_1_5_1_0()); 

            }

             after(grammarAccess.getImportedNamesAccess().getDotsFullStopFullStopFullStopKeyword_1_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__DotsAssignment_1_5_1"


    // $ANTLR start "rule__ImportedNames__ImpnameAssignment_2_0"
    // InternalFortXTrans.g:2986:1: rule__ImportedNames__ImpnameAssignment_2_0 : ( ruleAPIName ) ;
    public final void rule__ImportedNames__ImpnameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2990:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:2991:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:2991:2: ( ruleAPIName )
            // InternalFortXTrans.g:2992:3: ruleAPIName
            {
             before(grammarAccess.getImportedNamesAccess().getImpnameAPINameParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAPIName();

            state._fsp--;

             after(grammarAccess.getImportedNamesAccess().getImpnameAPINameParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__ImpnameAssignment_2_0"


    // $ANTLR start "rule__ImportedNames__AsnameAssignment_2_1_1"
    // InternalFortXTrans.g:3001:1: rule__ImportedNames__AsnameAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__ImportedNames__AsnameAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3005:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3006:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:3006:2: ( RULE_ID )
            // InternalFortXTrans.g:3007:3: RULE_ID
            {
             before(grammarAccess.getImportedNamesAccess().getAsnameIDTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getImportedNamesAccess().getAsnameIDTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedNames__AsnameAssignment_2_1_1"


    // $ANTLR start "rule__SimpleNames__NameListAssignment_0"
    // InternalFortXTrans.g:3016:1: rule__SimpleNames__NameListAssignment_0 : ( ruleSimpleName ) ;
    public final void rule__SimpleNames__NameListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3020:1: ( ( ruleSimpleName ) )
            // InternalFortXTrans.g:3021:2: ( ruleSimpleName )
            {
            // InternalFortXTrans.g:3021:2: ( ruleSimpleName )
            // InternalFortXTrans.g:3022:3: ruleSimpleName
            {
             before(grammarAccess.getSimpleNamesAccess().getNameListSimpleNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleName();

            state._fsp--;

             after(grammarAccess.getSimpleNamesAccess().getNameListSimpleNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleNames__NameListAssignment_0"


    // $ANTLR start "rule__SimpleNames__BrackAssignment_1_0"
    // InternalFortXTrans.g:3031:1: rule__SimpleNames__BrackAssignment_1_0 : ( ( '{' ) ) ;
    public final void rule__SimpleNames__BrackAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3035:1: ( ( ( '{' ) ) )
            // InternalFortXTrans.g:3036:2: ( ( '{' ) )
            {
            // InternalFortXTrans.g:3036:2: ( ( '{' ) )
            // InternalFortXTrans.g:3037:3: ( '{' )
            {
             before(grammarAccess.getSimpleNamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0()); 
            // InternalFortXTrans.g:3038:3: ( '{' )
            // InternalFortXTrans.g:3039:4: '{'
            {
             before(grammarAccess.getSimpleNamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSimpleNamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0()); 

            }

             after(grammarAccess.getSimpleNamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleNames__BrackAssignment_1_0"


    // $ANTLR start "rule__SimpleNames__NameListAssignment_1_1"
    // InternalFortXTrans.g:3050:1: rule__SimpleNames__NameListAssignment_1_1 : ( ruleSimpleName ) ;
    public final void rule__SimpleNames__NameListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3054:1: ( ( ruleSimpleName ) )
            // InternalFortXTrans.g:3055:2: ( ruleSimpleName )
            {
            // InternalFortXTrans.g:3055:2: ( ruleSimpleName )
            // InternalFortXTrans.g:3056:3: ruleSimpleName
            {
             before(grammarAccess.getSimpleNamesAccess().getNameListSimpleNameParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleName();

            state._fsp--;

             after(grammarAccess.getSimpleNamesAccess().getNameListSimpleNameParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleNames__NameListAssignment_1_1"


    // $ANTLR start "rule__SimpleNames__NameListAssignment_1_2_1"
    // InternalFortXTrans.g:3065:1: rule__SimpleNames__NameListAssignment_1_2_1 : ( ruleSimpleName ) ;
    public final void rule__SimpleNames__NameListAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3069:1: ( ( ruleSimpleName ) )
            // InternalFortXTrans.g:3070:2: ( ruleSimpleName )
            {
            // InternalFortXTrans.g:3070:2: ( ruleSimpleName )
            // InternalFortXTrans.g:3071:3: ruleSimpleName
            {
             before(grammarAccess.getSimpleNamesAccess().getNameListSimpleNameParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleName();

            state._fsp--;

             after(grammarAccess.getSimpleNamesAccess().getNameListSimpleNameParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleNames__NameListAssignment_1_2_1"


    // $ANTLR start "rule__SimpleName__NameAssignment"
    // InternalFortXTrans.g:3080:1: rule__SimpleName__NameAssignment : ( RULE_ID ) ;
    public final void rule__SimpleName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3084:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3085:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:3085:2: ( RULE_ID )
            // InternalFortXTrans.g:3086:3: RULE_ID
            {
             before(grammarAccess.getSimpleNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimpleNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleName__NameAssignment"


    // $ANTLR start "rule__AliasedSimpleName__OrigAssignment_0"
    // InternalFortXTrans.g:3095:1: rule__AliasedSimpleName__OrigAssignment_0 : ( RULE_ID ) ;
    public final void rule__AliasedSimpleName__OrigAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3099:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3100:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:3100:2: ( RULE_ID )
            // InternalFortXTrans.g:3101:3: RULE_ID
            {
             before(grammarAccess.getAliasedSimpleNameAccess().getOrigIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAliasedSimpleNameAccess().getOrigIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedSimpleName__OrigAssignment_0"


    // $ANTLR start "rule__AliasedSimpleName__AsNameAssignment_1_1"
    // InternalFortXTrans.g:3110:1: rule__AliasedSimpleName__AsNameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__AliasedSimpleName__AsNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3114:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3115:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:3115:2: ( RULE_ID )
            // InternalFortXTrans.g:3116:3: RULE_ID
            {
             before(grammarAccess.getAliasedSimpleNameAccess().getAsNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAliasedSimpleNameAccess().getAsNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedSimpleName__AsNameAssignment_1_1"


    // $ANTLR start "rule__AliasedAPINames__NameListAssignment_0"
    // InternalFortXTrans.g:3125:1: rule__AliasedAPINames__NameListAssignment_0 : ( ruleAliasedAPIName ) ;
    public final void rule__AliasedAPINames__NameListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3129:1: ( ( ruleAliasedAPIName ) )
            // InternalFortXTrans.g:3130:2: ( ruleAliasedAPIName )
            {
            // InternalFortXTrans.g:3130:2: ( ruleAliasedAPIName )
            // InternalFortXTrans.g:3131:3: ruleAliasedAPIName
            {
             before(grammarAccess.getAliasedAPINamesAccess().getNameListAliasedAPINameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAliasedAPIName();

            state._fsp--;

             after(grammarAccess.getAliasedAPINamesAccess().getNameListAliasedAPINameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPINames__NameListAssignment_0"


    // $ANTLR start "rule__AliasedAPINames__BrackAssignment_1_0"
    // InternalFortXTrans.g:3140:1: rule__AliasedAPINames__BrackAssignment_1_0 : ( ( '{' ) ) ;
    public final void rule__AliasedAPINames__BrackAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3144:1: ( ( ( '{' ) ) )
            // InternalFortXTrans.g:3145:2: ( ( '{' ) )
            {
            // InternalFortXTrans.g:3145:2: ( ( '{' ) )
            // InternalFortXTrans.g:3146:3: ( '{' )
            {
             before(grammarAccess.getAliasedAPINamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0()); 
            // InternalFortXTrans.g:3147:3: ( '{' )
            // InternalFortXTrans.g:3148:4: '{'
            {
             before(grammarAccess.getAliasedAPINamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAliasedAPINamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0()); 

            }

             after(grammarAccess.getAliasedAPINamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPINames__BrackAssignment_1_0"


    // $ANTLR start "rule__AliasedAPINames__NameListAssignment_1_1"
    // InternalFortXTrans.g:3159:1: rule__AliasedAPINames__NameListAssignment_1_1 : ( ruleAliasedAPIName ) ;
    public final void rule__AliasedAPINames__NameListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3163:1: ( ( ruleAliasedAPIName ) )
            // InternalFortXTrans.g:3164:2: ( ruleAliasedAPIName )
            {
            // InternalFortXTrans.g:3164:2: ( ruleAliasedAPIName )
            // InternalFortXTrans.g:3165:3: ruleAliasedAPIName
            {
             before(grammarAccess.getAliasedAPINamesAccess().getNameListAliasedAPINameParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAliasedAPIName();

            state._fsp--;

             after(grammarAccess.getAliasedAPINamesAccess().getNameListAliasedAPINameParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPINames__NameListAssignment_1_1"


    // $ANTLR start "rule__AliasedAPINames__NameListAssignment_1_2_1"
    // InternalFortXTrans.g:3174:1: rule__AliasedAPINames__NameListAssignment_1_2_1 : ( ruleAliasedAPIName ) ;
    public final void rule__AliasedAPINames__NameListAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3178:1: ( ( ruleAliasedAPIName ) )
            // InternalFortXTrans.g:3179:2: ( ruleAliasedAPIName )
            {
            // InternalFortXTrans.g:3179:2: ( ruleAliasedAPIName )
            // InternalFortXTrans.g:3180:3: ruleAliasedAPIName
            {
             before(grammarAccess.getAliasedAPINamesAccess().getNameListAliasedAPINameParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAliasedAPIName();

            state._fsp--;

             after(grammarAccess.getAliasedAPINamesAccess().getNameListAliasedAPINameParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPINames__NameListAssignment_1_2_1"


    // $ANTLR start "rule__AliasedAPIName__OrigAssignment_0"
    // InternalFortXTrans.g:3189:1: rule__AliasedAPIName__OrigAssignment_0 : ( ruleAPIName ) ;
    public final void rule__AliasedAPIName__OrigAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3193:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:3194:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:3194:2: ( ruleAPIName )
            // InternalFortXTrans.g:3195:3: ruleAPIName
            {
             before(grammarAccess.getAliasedAPINameAccess().getOrigAPINameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAPIName();

            state._fsp--;

             after(grammarAccess.getAliasedAPINameAccess().getOrigAPINameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPIName__OrigAssignment_0"


    // $ANTLR start "rule__AliasedAPIName__AsNameAssignment_1_1"
    // InternalFortXTrans.g:3204:1: rule__AliasedAPIName__AsNameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__AliasedAPIName__AsNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3208:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3209:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:3209:2: ( RULE_ID )
            // InternalFortXTrans.g:3210:3: RULE_ID
            {
             before(grammarAccess.getAliasedAPINameAccess().getAsNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAliasedAPINameAccess().getAsNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasedAPIName__AsNameAssignment_1_1"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\uffff\1\4\1\uffff\1\4\2\uffff\1\4\3\uffff\1\4";
    static final String dfa_3s = "\1\4\1\14\1\4\1\14\1\uffff\1\4\1\14\1\21\2\uffff\1\14";
    static final String dfa_4s = "\1\4\1\25\1\21\1\25\1\uffff\1\22\1\25\1\21\2\uffff\1\25";
    static final String dfa_5s = "\4\uffff\1\3\3\uffff\1\1\1\2\1\uffff";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\4\3\uffff\1\2\1\uffff\1\3\3\4",
            "\1\6\14\uffff\1\5",
            "\1\4\3\uffff\1\7\2\uffff\3\4",
            "",
            "\1\11\15\uffff\1\10",
            "\1\4\3\uffff\1\2\1\uffff\1\12\3\4",
            "\1\5",
            "",
            "",
            "\1\4\3\uffff\1\7\2\uffff\3\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "415:1: rule__ImportedNames__Alternatives : ( ( ( rule__ImportedNames__Group_0__0 ) ) | ( ( rule__ImportedNames__Group_1__0 ) ) | ( ( rule__ImportedNames__Group_2__0 ) ) );";
        }
    }
    static final String dfa_8s = "\7\uffff";
    static final String dfa_9s = "\1\uffff\1\4\3\uffff\1\4\1\uffff";
    static final String dfa_10s = "\1\4\1\14\1\uffff\1\4\1\uffff\1\14\1\uffff";
    static final String dfa_11s = "\1\4\1\25\1\uffff\1\21\1\uffff\1\25\1\uffff";
    static final String dfa_12s = "\2\uffff\1\1\1\uffff\1\3\1\uffff\1\2";
    static final String dfa_13s = "\7\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\4\1\uffff\2\4\1\3\1\uffff\1\2\3\4",
            "",
            "\1\5\14\uffff\1\4",
            "",
            "\1\4\1\uffff\2\4\1\3\1\uffff\1\6\3\4",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "442:1: rule__APIName__Alternatives : ( ( ( rule__APIName__Group_0__0 ) ) | ( ( rule__APIName__Group_1__0 ) ) | ( ( rule__APIName__Group_2__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000301000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000010002L});

}