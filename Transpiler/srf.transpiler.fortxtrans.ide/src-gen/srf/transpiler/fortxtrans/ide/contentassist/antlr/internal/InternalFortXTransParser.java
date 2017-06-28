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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOTS", "RULE_ML_COMMENT", "RULE_SD", "RULE_GREATERS", "RULE_LESSES", "RULE_BARS", "RULE_SLASHES", "RULE_LEFT_ENCLOSER", "RULE_RIGHT_ENCLOSER", "RULE_INT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'_'", "'component'", "'end'", "'api'", "'}'", "','", "'.'", "'{'", "'as'", "')'", "':'", "'then'", "'elif'", "'else'", "'<-'", "'('", "'also'", "'do'", "'import'", "'export'", "'except'", "'private'", "'test'", "'atomic'", "'io'", "'='", "'while'", "'for'", "'if'", "'at'"
    };
    public static final int RULE_BARS=10;
    public static final int RULE_DOTS=5;
    public static final int T__19=19;
    public static final int RULE_LESSES=9;
    public static final int RULE_ID=4;
    public static final int RULE_GREATERS=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=14;
    public static final int T__29=29;
    public static final int RULE_LEFT_ENCLOSER=12;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_SLASHES=11;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_RIGHT_ENCLOSER=13;
    public static final int RULE_STRING=15;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=17;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_SD=7;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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


    // $ANTLR start "entryRuleComponent"
    // InternalFortXTrans.g:78:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalFortXTrans.g:79:1: ( ruleComponent EOF )
            // InternalFortXTrans.g:80:1: ruleComponent EOF
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
    // InternalFortXTrans.g:87:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:91:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalFortXTrans.g:92:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalFortXTrans.g:92:2: ( ( rule__Component__Group__0 ) )
            // InternalFortXTrans.g:93:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalFortXTrans.g:94:3: ( rule__Component__Group__0 )
            // InternalFortXTrans.g:94:4: rule__Component__Group__0
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


    // $ANTLR start "entryRuleAPI"
    // InternalFortXTrans.g:103:1: entryRuleAPI : ruleAPI EOF ;
    public final void entryRuleAPI() throws RecognitionException {
        try {
            // InternalFortXTrans.g:104:1: ( ruleAPI EOF )
            // InternalFortXTrans.g:105:1: ruleAPI EOF
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
    // InternalFortXTrans.g:112:1: ruleAPI : ( ( rule__API__Group__0 ) ) ;
    public final void ruleAPI() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:116:2: ( ( ( rule__API__Group__0 ) ) )
            // InternalFortXTrans.g:117:2: ( ( rule__API__Group__0 ) )
            {
            // InternalFortXTrans.g:117:2: ( ( rule__API__Group__0 ) )
            // InternalFortXTrans.g:118:3: ( rule__API__Group__0 )
            {
             before(grammarAccess.getAPIAccess().getGroup()); 
            // InternalFortXTrans.g:119:3: ( rule__API__Group__0 )
            // InternalFortXTrans.g:119:4: rule__API__Group__0
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalFortXTrans.g:203:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalFortXTrans.g:204:1: ( ruleQualifiedName EOF )
            // InternalFortXTrans.g:205:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalFortXTrans.g:212:1: ruleQualifiedName : ( ( rule__QualifiedName__Alternatives ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:216:2: ( ( ( rule__QualifiedName__Alternatives ) ) )
            // InternalFortXTrans.g:217:2: ( ( rule__QualifiedName__Alternatives ) )
            {
            // InternalFortXTrans.g:217:2: ( ( rule__QualifiedName__Alternatives ) )
            // InternalFortXTrans.g:218:3: ( rule__QualifiedName__Alternatives )
            {
             before(grammarAccess.getQualifiedNameAccess().getAlternatives()); 
            // InternalFortXTrans.g:219:3: ( rule__QualifiedName__Alternatives )
            // InternalFortXTrans.g:219:4: rule__QualifiedName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getAlternatives()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleAPIName"
    // InternalFortXTrans.g:228:1: entryRuleAPIName : ruleAPIName EOF ;
    public final void entryRuleAPIName() throws RecognitionException {
        try {
            // InternalFortXTrans.g:229:1: ( ruleAPIName EOF )
            // InternalFortXTrans.g:230:1: ruleAPIName EOF
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
    // InternalFortXTrans.g:237:1: ruleAPIName : ( ( rule__APIName__Alternatives ) ) ;
    public final void ruleAPIName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:241:2: ( ( ( rule__APIName__Alternatives ) ) )
            // InternalFortXTrans.g:242:2: ( ( rule__APIName__Alternatives ) )
            {
            // InternalFortXTrans.g:242:2: ( ( rule__APIName__Alternatives ) )
            // InternalFortXTrans.g:243:3: ( rule__APIName__Alternatives )
            {
             before(grammarAccess.getAPINameAccess().getAlternatives()); 
            // InternalFortXTrans.g:244:3: ( rule__APIName__Alternatives )
            // InternalFortXTrans.g:244:4: rule__APIName__Alternatives
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
    // InternalFortXTrans.g:253:1: entryRuleSimpleNames : ruleSimpleNames EOF ;
    public final void entryRuleSimpleNames() throws RecognitionException {
        try {
            // InternalFortXTrans.g:254:1: ( ruleSimpleNames EOF )
            // InternalFortXTrans.g:255:1: ruleSimpleNames EOF
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
    // InternalFortXTrans.g:262:1: ruleSimpleNames : ( ( rule__SimpleNames__Alternatives ) ) ;
    public final void ruleSimpleNames() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:266:2: ( ( ( rule__SimpleNames__Alternatives ) ) )
            // InternalFortXTrans.g:267:2: ( ( rule__SimpleNames__Alternatives ) )
            {
            // InternalFortXTrans.g:267:2: ( ( rule__SimpleNames__Alternatives ) )
            // InternalFortXTrans.g:268:3: ( rule__SimpleNames__Alternatives )
            {
             before(grammarAccess.getSimpleNamesAccess().getAlternatives()); 
            // InternalFortXTrans.g:269:3: ( rule__SimpleNames__Alternatives )
            // InternalFortXTrans.g:269:4: rule__SimpleNames__Alternatives
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
    // InternalFortXTrans.g:278:1: entryRuleSimpleName : ruleSimpleName EOF ;
    public final void entryRuleSimpleName() throws RecognitionException {
        try {
            // InternalFortXTrans.g:279:1: ( ruleSimpleName EOF )
            // InternalFortXTrans.g:280:1: ruleSimpleName EOF
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
    // InternalFortXTrans.g:287:1: ruleSimpleName : ( ( rule__SimpleName__NameAssignment ) ) ;
    public final void ruleSimpleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:291:2: ( ( ( rule__SimpleName__NameAssignment ) ) )
            // InternalFortXTrans.g:292:2: ( ( rule__SimpleName__NameAssignment ) )
            {
            // InternalFortXTrans.g:292:2: ( ( rule__SimpleName__NameAssignment ) )
            // InternalFortXTrans.g:293:3: ( rule__SimpleName__NameAssignment )
            {
             before(grammarAccess.getSimpleNameAccess().getNameAssignment()); 
            // InternalFortXTrans.g:294:3: ( rule__SimpleName__NameAssignment )
            // InternalFortXTrans.g:294:4: rule__SimpleName__NameAssignment
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
    // InternalFortXTrans.g:303:1: entryRuleAliasedSimpleName : ruleAliasedSimpleName EOF ;
    public final void entryRuleAliasedSimpleName() throws RecognitionException {
        try {
            // InternalFortXTrans.g:304:1: ( ruleAliasedSimpleName EOF )
            // InternalFortXTrans.g:305:1: ruleAliasedSimpleName EOF
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
    // InternalFortXTrans.g:312:1: ruleAliasedSimpleName : ( ( rule__AliasedSimpleName__Group__0 ) ) ;
    public final void ruleAliasedSimpleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:316:2: ( ( ( rule__AliasedSimpleName__Group__0 ) ) )
            // InternalFortXTrans.g:317:2: ( ( rule__AliasedSimpleName__Group__0 ) )
            {
            // InternalFortXTrans.g:317:2: ( ( rule__AliasedSimpleName__Group__0 ) )
            // InternalFortXTrans.g:318:3: ( rule__AliasedSimpleName__Group__0 )
            {
             before(grammarAccess.getAliasedSimpleNameAccess().getGroup()); 
            // InternalFortXTrans.g:319:3: ( rule__AliasedSimpleName__Group__0 )
            // InternalFortXTrans.g:319:4: rule__AliasedSimpleName__Group__0
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
    // InternalFortXTrans.g:328:1: entryRuleAliasedAPINames : ruleAliasedAPINames EOF ;
    public final void entryRuleAliasedAPINames() throws RecognitionException {
        try {
            // InternalFortXTrans.g:329:1: ( ruleAliasedAPINames EOF )
            // InternalFortXTrans.g:330:1: ruleAliasedAPINames EOF
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
    // InternalFortXTrans.g:337:1: ruleAliasedAPINames : ( ( rule__AliasedAPINames__Alternatives ) ) ;
    public final void ruleAliasedAPINames() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:341:2: ( ( ( rule__AliasedAPINames__Alternatives ) ) )
            // InternalFortXTrans.g:342:2: ( ( rule__AliasedAPINames__Alternatives ) )
            {
            // InternalFortXTrans.g:342:2: ( ( rule__AliasedAPINames__Alternatives ) )
            // InternalFortXTrans.g:343:3: ( rule__AliasedAPINames__Alternatives )
            {
             before(grammarAccess.getAliasedAPINamesAccess().getAlternatives()); 
            // InternalFortXTrans.g:344:3: ( rule__AliasedAPINames__Alternatives )
            // InternalFortXTrans.g:344:4: rule__AliasedAPINames__Alternatives
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
    // InternalFortXTrans.g:353:1: entryRuleAliasedAPIName : ruleAliasedAPIName EOF ;
    public final void entryRuleAliasedAPIName() throws RecognitionException {
        try {
            // InternalFortXTrans.g:354:1: ( ruleAliasedAPIName EOF )
            // InternalFortXTrans.g:355:1: ruleAliasedAPIName EOF
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
    // InternalFortXTrans.g:362:1: ruleAliasedAPIName : ( ( rule__AliasedAPIName__Group__0 ) ) ;
    public final void ruleAliasedAPIName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:366:2: ( ( ( rule__AliasedAPIName__Group__0 ) ) )
            // InternalFortXTrans.g:367:2: ( ( rule__AliasedAPIName__Group__0 ) )
            {
            // InternalFortXTrans.g:367:2: ( ( rule__AliasedAPIName__Group__0 ) )
            // InternalFortXTrans.g:368:3: ( rule__AliasedAPIName__Group__0 )
            {
             before(grammarAccess.getAliasedAPINameAccess().getGroup()); 
            // InternalFortXTrans.g:369:3: ( rule__AliasedAPIName__Group__0 )
            // InternalFortXTrans.g:369:4: rule__AliasedAPIName__Group__0
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


    // $ANTLR start "entryRuleDecls"
    // InternalFortXTrans.g:378:1: entryRuleDecls : ruleDecls EOF ;
    public final void entryRuleDecls() throws RecognitionException {
        try {
            // InternalFortXTrans.g:379:1: ( ruleDecls EOF )
            // InternalFortXTrans.g:380:1: ruleDecls EOF
            {
             before(grammarAccess.getDeclsRule()); 
            pushFollow(FOLLOW_1);
            ruleDecls();

            state._fsp--;

             after(grammarAccess.getDeclsRule()); 
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
    // $ANTLR end "entryRuleDecls"


    // $ANTLR start "ruleDecls"
    // InternalFortXTrans.g:387:1: ruleDecls : ( ( ( rule__Decls__DeclsAssignment ) ) ( ( rule__Decls__DeclsAssignment )* ) ) ;
    public final void ruleDecls() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:391:2: ( ( ( ( rule__Decls__DeclsAssignment ) ) ( ( rule__Decls__DeclsAssignment )* ) ) )
            // InternalFortXTrans.g:392:2: ( ( ( rule__Decls__DeclsAssignment ) ) ( ( rule__Decls__DeclsAssignment )* ) )
            {
            // InternalFortXTrans.g:392:2: ( ( ( rule__Decls__DeclsAssignment ) ) ( ( rule__Decls__DeclsAssignment )* ) )
            // InternalFortXTrans.g:393:3: ( ( rule__Decls__DeclsAssignment ) ) ( ( rule__Decls__DeclsAssignment )* )
            {
            // InternalFortXTrans.g:393:3: ( ( rule__Decls__DeclsAssignment ) )
            // InternalFortXTrans.g:394:4: ( rule__Decls__DeclsAssignment )
            {
             before(grammarAccess.getDeclsAccess().getDeclsAssignment()); 
            // InternalFortXTrans.g:395:4: ( rule__Decls__DeclsAssignment )
            // InternalFortXTrans.g:395:5: rule__Decls__DeclsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Decls__DeclsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDeclsAccess().getDeclsAssignment()); 

            }

            // InternalFortXTrans.g:398:3: ( ( rule__Decls__DeclsAssignment )* )
            // InternalFortXTrans.g:399:4: ( rule__Decls__DeclsAssignment )*
            {
             before(grammarAccess.getDeclsAccess().getDeclsAssignment()); 
            // InternalFortXTrans.g:400:4: ( rule__Decls__DeclsAssignment )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalFortXTrans.g:400:5: rule__Decls__DeclsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Decls__DeclsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDeclsAccess().getDeclsAssignment()); 

            }


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
    // $ANTLR end "ruleDecls"


    // $ANTLR start "entryRuleDecl"
    // InternalFortXTrans.g:410:1: entryRuleDecl : ruleDecl EOF ;
    public final void entryRuleDecl() throws RecognitionException {
        try {
            // InternalFortXTrans.g:411:1: ( ruleDecl EOF )
            // InternalFortXTrans.g:412:1: ruleDecl EOF
            {
             before(grammarAccess.getDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleDecl();

            state._fsp--;

             after(grammarAccess.getDeclRule()); 
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
    // $ANTLR end "entryRuleDecl"


    // $ANTLR start "ruleDecl"
    // InternalFortXTrans.g:419:1: ruleDecl : ( ( rule__Decl__FunctionAssignment ) ) ;
    public final void ruleDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:423:2: ( ( ( rule__Decl__FunctionAssignment ) ) )
            // InternalFortXTrans.g:424:2: ( ( rule__Decl__FunctionAssignment ) )
            {
            // InternalFortXTrans.g:424:2: ( ( rule__Decl__FunctionAssignment ) )
            // InternalFortXTrans.g:425:3: ( rule__Decl__FunctionAssignment )
            {
             before(grammarAccess.getDeclAccess().getFunctionAssignment()); 
            // InternalFortXTrans.g:426:3: ( rule__Decl__FunctionAssignment )
            // InternalFortXTrans.g:426:4: rule__Decl__FunctionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Decl__FunctionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDeclAccess().getFunctionAssignment()); 

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
    // $ANTLR end "ruleDecl"


    // $ANTLR start "entryRuleFnMods"
    // InternalFortXTrans.g:435:1: entryRuleFnMods : ruleFnMods EOF ;
    public final void entryRuleFnMods() throws RecognitionException {
        try {
            // InternalFortXTrans.g:436:1: ( ruleFnMods EOF )
            // InternalFortXTrans.g:437:1: ruleFnMods EOF
            {
             before(grammarAccess.getFnModsRule()); 
            pushFollow(FOLLOW_1);
            ruleFnMods();

            state._fsp--;

             after(grammarAccess.getFnModsRule()); 
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
    // $ANTLR end "entryRuleFnMods"


    // $ANTLR start "ruleFnMods"
    // InternalFortXTrans.g:444:1: ruleFnMods : ( ( ( rule__FnMods__ModsAssignment ) ) ( ( rule__FnMods__ModsAssignment )* ) ) ;
    public final void ruleFnMods() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:448:2: ( ( ( ( rule__FnMods__ModsAssignment ) ) ( ( rule__FnMods__ModsAssignment )* ) ) )
            // InternalFortXTrans.g:449:2: ( ( ( rule__FnMods__ModsAssignment ) ) ( ( rule__FnMods__ModsAssignment )* ) )
            {
            // InternalFortXTrans.g:449:2: ( ( ( rule__FnMods__ModsAssignment ) ) ( ( rule__FnMods__ModsAssignment )* ) )
            // InternalFortXTrans.g:450:3: ( ( rule__FnMods__ModsAssignment ) ) ( ( rule__FnMods__ModsAssignment )* )
            {
            // InternalFortXTrans.g:450:3: ( ( rule__FnMods__ModsAssignment ) )
            // InternalFortXTrans.g:451:4: ( rule__FnMods__ModsAssignment )
            {
             before(grammarAccess.getFnModsAccess().getModsAssignment()); 
            // InternalFortXTrans.g:452:4: ( rule__FnMods__ModsAssignment )
            // InternalFortXTrans.g:452:5: rule__FnMods__ModsAssignment
            {
            pushFollow(FOLLOW_4);
            rule__FnMods__ModsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFnModsAccess().getModsAssignment()); 

            }

            // InternalFortXTrans.g:455:3: ( ( rule__FnMods__ModsAssignment )* )
            // InternalFortXTrans.g:456:4: ( rule__FnMods__ModsAssignment )*
            {
             before(grammarAccess.getFnModsAccess().getModsAssignment()); 
            // InternalFortXTrans.g:457:4: ( rule__FnMods__ModsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=40 && LA2_0<=43)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFortXTrans.g:457:5: rule__FnMods__ModsAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__FnMods__ModsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getFnModsAccess().getModsAssignment()); 

            }


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
    // $ANTLR end "ruleFnMods"


    // $ANTLR start "entryRuleFnMod"
    // InternalFortXTrans.g:467:1: entryRuleFnMod : ruleFnMod EOF ;
    public final void entryRuleFnMod() throws RecognitionException {
        try {
            // InternalFortXTrans.g:468:1: ( ruleFnMod EOF )
            // InternalFortXTrans.g:469:1: ruleFnMod EOF
            {
             before(grammarAccess.getFnModRule()); 
            pushFollow(FOLLOW_1);
            ruleFnMod();

            state._fsp--;

             after(grammarAccess.getFnModRule()); 
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
    // $ANTLR end "entryRuleFnMod"


    // $ANTLR start "ruleFnMod"
    // InternalFortXTrans.g:476:1: ruleFnMod : ( ( rule__FnMod__Alternatives ) ) ;
    public final void ruleFnMod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:480:2: ( ( ( rule__FnMod__Alternatives ) ) )
            // InternalFortXTrans.g:481:2: ( ( rule__FnMod__Alternatives ) )
            {
            // InternalFortXTrans.g:481:2: ( ( rule__FnMod__Alternatives ) )
            // InternalFortXTrans.g:482:3: ( rule__FnMod__Alternatives )
            {
             before(grammarAccess.getFnModAccess().getAlternatives()); 
            // InternalFortXTrans.g:483:3: ( rule__FnMod__Alternatives )
            // InternalFortXTrans.g:483:4: rule__FnMod__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FnMod__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFnModAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFnMod"


    // $ANTLR start "entryRuleValParam"
    // InternalFortXTrans.g:492:1: entryRuleValParam : ruleValParam EOF ;
    public final void entryRuleValParam() throws RecognitionException {
        try {
            // InternalFortXTrans.g:493:1: ( ruleValParam EOF )
            // InternalFortXTrans.g:494:1: ruleValParam EOF
            {
             before(grammarAccess.getValParamRule()); 
            pushFollow(FOLLOW_1);
            ruleValParam();

            state._fsp--;

             after(grammarAccess.getValParamRule()); 
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
    // $ANTLR end "entryRuleValParam"


    // $ANTLR start "ruleValParam"
    // InternalFortXTrans.g:501:1: ruleValParam : ( ( rule__ValParam__Alternatives ) ) ;
    public final void ruleValParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:505:2: ( ( ( rule__ValParam__Alternatives ) ) )
            // InternalFortXTrans.g:506:2: ( ( rule__ValParam__Alternatives ) )
            {
            // InternalFortXTrans.g:506:2: ( ( rule__ValParam__Alternatives ) )
            // InternalFortXTrans.g:507:3: ( rule__ValParam__Alternatives )
            {
             before(grammarAccess.getValParamAccess().getAlternatives()); 
            // InternalFortXTrans.g:508:3: ( rule__ValParam__Alternatives )
            // InternalFortXTrans.g:508:4: rule__ValParam__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValParam__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValParamAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValParam"


    // $ANTLR start "entryRuleParam"
    // InternalFortXTrans.g:517:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // InternalFortXTrans.g:518:1: ( ruleParam EOF )
            // InternalFortXTrans.g:519:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamRule()); 
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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalFortXTrans.g:526:1: ruleParam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:530:2: ( ( ( rule__Param__Group__0 ) ) )
            // InternalFortXTrans.g:531:2: ( ( rule__Param__Group__0 ) )
            {
            // InternalFortXTrans.g:531:2: ( ( rule__Param__Group__0 ) )
            // InternalFortXTrans.g:532:3: ( rule__Param__Group__0 )
            {
             before(grammarAccess.getParamAccess().getGroup()); 
            // InternalFortXTrans.g:533:3: ( rule__Param__Group__0 )
            // InternalFortXTrans.g:533:4: rule__Param__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getGroup()); 

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleRetType"
    // InternalFortXTrans.g:542:1: entryRuleRetType : ruleRetType EOF ;
    public final void entryRuleRetType() throws RecognitionException {
        try {
            // InternalFortXTrans.g:543:1: ( ruleRetType EOF )
            // InternalFortXTrans.g:544:1: ruleRetType EOF
            {
             before(grammarAccess.getRetTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleRetType();

            state._fsp--;

             after(grammarAccess.getRetTypeRule()); 
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
    // $ANTLR end "entryRuleRetType"


    // $ANTLR start "ruleRetType"
    // InternalFortXTrans.g:551:1: ruleRetType : ( ( rule__RetType__Alternatives ) ) ;
    public final void ruleRetType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:555:2: ( ( ( rule__RetType__Alternatives ) ) )
            // InternalFortXTrans.g:556:2: ( ( rule__RetType__Alternatives ) )
            {
            // InternalFortXTrans.g:556:2: ( ( rule__RetType__Alternatives ) )
            // InternalFortXTrans.g:557:3: ( rule__RetType__Alternatives )
            {
             before(grammarAccess.getRetTypeAccess().getAlternatives()); 
            // InternalFortXTrans.g:558:3: ( rule__RetType__Alternatives )
            // InternalFortXTrans.g:558:4: rule__RetType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RetType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRetTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRetType"


    // $ANTLR start "entryRuleType"
    // InternalFortXTrans.g:567:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalFortXTrans.g:568:1: ( ruleType EOF )
            // InternalFortXTrans.g:569:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalFortXTrans.g:576:1: ruleType : ( ( rule__Type__TnameAssignment ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:580:2: ( ( ( rule__Type__TnameAssignment ) ) )
            // InternalFortXTrans.g:581:2: ( ( rule__Type__TnameAssignment ) )
            {
            // InternalFortXTrans.g:581:2: ( ( rule__Type__TnameAssignment ) )
            // InternalFortXTrans.g:582:3: ( rule__Type__TnameAssignment )
            {
             before(grammarAccess.getTypeAccess().getTnameAssignment()); 
            // InternalFortXTrans.g:583:3: ( rule__Type__TnameAssignment )
            // InternalFortXTrans.g:583:4: rule__Type__TnameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Type__TnameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTnameAssignment()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleFnDecl"
    // InternalFortXTrans.g:592:1: entryRuleFnDecl : ruleFnDecl EOF ;
    public final void entryRuleFnDecl() throws RecognitionException {
        try {
            // InternalFortXTrans.g:593:1: ( ruleFnDecl EOF )
            // InternalFortXTrans.g:594:1: ruleFnDecl EOF
            {
             before(grammarAccess.getFnDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleFnDecl();

            state._fsp--;

             after(grammarAccess.getFnDeclRule()); 
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
    // $ANTLR end "entryRuleFnDecl"


    // $ANTLR start "ruleFnDecl"
    // InternalFortXTrans.g:601:1: ruleFnDecl : ( ( rule__FnDecl__Group__0 ) ) ;
    public final void ruleFnDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:605:2: ( ( ( rule__FnDecl__Group__0 ) ) )
            // InternalFortXTrans.g:606:2: ( ( rule__FnDecl__Group__0 ) )
            {
            // InternalFortXTrans.g:606:2: ( ( rule__FnDecl__Group__0 ) )
            // InternalFortXTrans.g:607:3: ( rule__FnDecl__Group__0 )
            {
             before(grammarAccess.getFnDeclAccess().getGroup()); 
            // InternalFortXTrans.g:608:3: ( rule__FnDecl__Group__0 )
            // InternalFortXTrans.g:608:4: rule__FnDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FnDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFnDeclAccess().getGroup()); 

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
    // $ANTLR end "ruleFnDecl"


    // $ANTLR start "entryRuleExpression"
    // InternalFortXTrans.g:617:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalFortXTrans.g:618:1: ( ruleExpression EOF )
            // InternalFortXTrans.g:619:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalFortXTrans.g:626:1: ruleExpression : ( ( rule__Expression__ExpAssignment ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:630:2: ( ( ( rule__Expression__ExpAssignment ) ) )
            // InternalFortXTrans.g:631:2: ( ( rule__Expression__ExpAssignment ) )
            {
            // InternalFortXTrans.g:631:2: ( ( rule__Expression__ExpAssignment ) )
            // InternalFortXTrans.g:632:3: ( rule__Expression__ExpAssignment )
            {
             before(grammarAccess.getExpressionAccess().getExpAssignment()); 
            // InternalFortXTrans.g:633:3: ( rule__Expression__ExpAssignment )
            // InternalFortXTrans.g:633:4: rule__Expression__ExpAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ExpAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getExpAssignment()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpr"
    // InternalFortXTrans.g:642:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // InternalFortXTrans.g:643:1: ( ruleExpr EOF )
            // InternalFortXTrans.g:644:1: ruleExpr EOF
            {
             before(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getExprRule()); 
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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalFortXTrans.g:651:1: ruleExpr : ( ( rule__Expr__Group__0 ) ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:655:2: ( ( ( rule__Expr__Group__0 ) ) )
            // InternalFortXTrans.g:656:2: ( ( rule__Expr__Group__0 ) )
            {
            // InternalFortXTrans.g:656:2: ( ( rule__Expr__Group__0 ) )
            // InternalFortXTrans.g:657:3: ( rule__Expr__Group__0 )
            {
             before(grammarAccess.getExprAccess().getGroup()); 
            // InternalFortXTrans.g:658:3: ( rule__Expr__Group__0 )
            // InternalFortXTrans.g:658:4: rule__Expr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getGroup()); 

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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExprFront"
    // InternalFortXTrans.g:667:1: entryRuleExprFront : ruleExprFront EOF ;
    public final void entryRuleExprFront() throws RecognitionException {
        try {
            // InternalFortXTrans.g:668:1: ( ruleExprFront EOF )
            // InternalFortXTrans.g:669:1: ruleExprFront EOF
            {
             before(grammarAccess.getExprFrontRule()); 
            pushFollow(FOLLOW_1);
            ruleExprFront();

            state._fsp--;

             after(grammarAccess.getExprFrontRule()); 
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
    // $ANTLR end "entryRuleExprFront"


    // $ANTLR start "ruleExprFront"
    // InternalFortXTrans.g:676:1: ruleExprFront : ( ( rule__ExprFront__Alternatives ) ) ;
    public final void ruleExprFront() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:680:2: ( ( ( rule__ExprFront__Alternatives ) ) )
            // InternalFortXTrans.g:681:2: ( ( rule__ExprFront__Alternatives ) )
            {
            // InternalFortXTrans.g:681:2: ( ( rule__ExprFront__Alternatives ) )
            // InternalFortXTrans.g:682:3: ( rule__ExprFront__Alternatives )
            {
             before(grammarAccess.getExprFrontAccess().getAlternatives()); 
            // InternalFortXTrans.g:683:3: ( rule__ExprFront__Alternatives )
            // InternalFortXTrans.g:683:4: rule__ExprFront__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExprFront__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExprFrontAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExprFront"


    // $ANTLR start "entryRuleExprTail"
    // InternalFortXTrans.g:692:1: entryRuleExprTail : ruleExprTail EOF ;
    public final void entryRuleExprTail() throws RecognitionException {
        try {
            // InternalFortXTrans.g:693:1: ( ruleExprTail EOF )
            // InternalFortXTrans.g:694:1: ruleExprTail EOF
            {
             before(grammarAccess.getExprTailRule()); 
            pushFollow(FOLLOW_1);
            ruleExprTail();

            state._fsp--;

             after(grammarAccess.getExprTailRule()); 
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
    // $ANTLR end "entryRuleExprTail"


    // $ANTLR start "ruleExprTail"
    // InternalFortXTrans.g:701:1: ruleExprTail : ( ( rule__ExprTail__Group__0 ) ) ;
    public final void ruleExprTail() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:705:2: ( ( ( rule__ExprTail__Group__0 ) ) )
            // InternalFortXTrans.g:706:2: ( ( rule__ExprTail__Group__0 ) )
            {
            // InternalFortXTrans.g:706:2: ( ( rule__ExprTail__Group__0 ) )
            // InternalFortXTrans.g:707:3: ( rule__ExprTail__Group__0 )
            {
             before(grammarAccess.getExprTailAccess().getGroup()); 
            // InternalFortXTrans.g:708:3: ( rule__ExprTail__Group__0 )
            // InternalFortXTrans.g:708:4: rule__ExprTail__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExprTail__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExprTailAccess().getGroup()); 

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
    // $ANTLR end "ruleExprTail"


    // $ANTLR start "entryRuleDelimitedExpr"
    // InternalFortXTrans.g:717:1: entryRuleDelimitedExpr : ruleDelimitedExpr EOF ;
    public final void entryRuleDelimitedExpr() throws RecognitionException {
        try {
            // InternalFortXTrans.g:718:1: ( ruleDelimitedExpr EOF )
            // InternalFortXTrans.g:719:1: ruleDelimitedExpr EOF
            {
             before(grammarAccess.getDelimitedExprRule()); 
            pushFollow(FOLLOW_1);
            ruleDelimitedExpr();

            state._fsp--;

             after(grammarAccess.getDelimitedExprRule()); 
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
    // $ANTLR end "entryRuleDelimitedExpr"


    // $ANTLR start "ruleDelimitedExpr"
    // InternalFortXTrans.g:726:1: ruleDelimitedExpr : ( ( rule__DelimitedExpr__Alternatives ) ) ;
    public final void ruleDelimitedExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:730:2: ( ( ( rule__DelimitedExpr__Alternatives ) ) )
            // InternalFortXTrans.g:731:2: ( ( rule__DelimitedExpr__Alternatives ) )
            {
            // InternalFortXTrans.g:731:2: ( ( rule__DelimitedExpr__Alternatives ) )
            // InternalFortXTrans.g:732:3: ( rule__DelimitedExpr__Alternatives )
            {
             before(grammarAccess.getDelimitedExprAccess().getAlternatives()); 
            // InternalFortXTrans.g:733:3: ( rule__DelimitedExpr__Alternatives )
            // InternalFortXTrans.g:733:4: rule__DelimitedExpr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDelimitedExprAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDelimitedExpr"


    // $ANTLR start "entryRuleElifs"
    // InternalFortXTrans.g:742:1: entryRuleElifs : ruleElifs EOF ;
    public final void entryRuleElifs() throws RecognitionException {
        try {
            // InternalFortXTrans.g:743:1: ( ruleElifs EOF )
            // InternalFortXTrans.g:744:1: ruleElifs EOF
            {
             before(grammarAccess.getElifsRule()); 
            pushFollow(FOLLOW_1);
            ruleElifs();

            state._fsp--;

             after(grammarAccess.getElifsRule()); 
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
    // $ANTLR end "entryRuleElifs"


    // $ANTLR start "ruleElifs"
    // InternalFortXTrans.g:751:1: ruleElifs : ( ( rule__Elifs__Group__0 ) ) ;
    public final void ruleElifs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:755:2: ( ( ( rule__Elifs__Group__0 ) ) )
            // InternalFortXTrans.g:756:2: ( ( rule__Elifs__Group__0 ) )
            {
            // InternalFortXTrans.g:756:2: ( ( rule__Elifs__Group__0 ) )
            // InternalFortXTrans.g:757:3: ( rule__Elifs__Group__0 )
            {
             before(grammarAccess.getElifsAccess().getGroup()); 
            // InternalFortXTrans.g:758:3: ( rule__Elifs__Group__0 )
            // InternalFortXTrans.g:758:4: rule__Elifs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Elifs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElifsAccess().getGroup()); 

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
    // $ANTLR end "ruleElifs"


    // $ANTLR start "entryRuleElif"
    // InternalFortXTrans.g:767:1: entryRuleElif : ruleElif EOF ;
    public final void entryRuleElif() throws RecognitionException {
        try {
            // InternalFortXTrans.g:768:1: ( ruleElif EOF )
            // InternalFortXTrans.g:769:1: ruleElif EOF
            {
             before(grammarAccess.getElifRule()); 
            pushFollow(FOLLOW_1);
            ruleElif();

            state._fsp--;

             after(grammarAccess.getElifRule()); 
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
    // $ANTLR end "entryRuleElif"


    // $ANTLR start "ruleElif"
    // InternalFortXTrans.g:776:1: ruleElif : ( ( rule__Elif__Group__0 ) ) ;
    public final void ruleElif() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:780:2: ( ( ( rule__Elif__Group__0 ) ) )
            // InternalFortXTrans.g:781:2: ( ( rule__Elif__Group__0 ) )
            {
            // InternalFortXTrans.g:781:2: ( ( rule__Elif__Group__0 ) )
            // InternalFortXTrans.g:782:3: ( rule__Elif__Group__0 )
            {
             before(grammarAccess.getElifAccess().getGroup()); 
            // InternalFortXTrans.g:783:3: ( rule__Elif__Group__0 )
            // InternalFortXTrans.g:783:4: rule__Elif__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Elif__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElifAccess().getGroup()); 

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
    // $ANTLR end "ruleElif"


    // $ANTLR start "entryRuleElse"
    // InternalFortXTrans.g:792:1: entryRuleElse : ruleElse EOF ;
    public final void entryRuleElse() throws RecognitionException {
        try {
            // InternalFortXTrans.g:793:1: ( ruleElse EOF )
            // InternalFortXTrans.g:794:1: ruleElse EOF
            {
             before(grammarAccess.getElseRule()); 
            pushFollow(FOLLOW_1);
            ruleElse();

            state._fsp--;

             after(grammarAccess.getElseRule()); 
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
    // $ANTLR end "entryRuleElse"


    // $ANTLR start "ruleElse"
    // InternalFortXTrans.g:801:1: ruleElse : ( ( rule__Else__Group__0 ) ) ;
    public final void ruleElse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:805:2: ( ( ( rule__Else__Group__0 ) ) )
            // InternalFortXTrans.g:806:2: ( ( rule__Else__Group__0 ) )
            {
            // InternalFortXTrans.g:806:2: ( ( rule__Else__Group__0 ) )
            // InternalFortXTrans.g:807:3: ( rule__Else__Group__0 )
            {
             before(grammarAccess.getElseAccess().getGroup()); 
            // InternalFortXTrans.g:808:3: ( rule__Else__Group__0 )
            // InternalFortXTrans.g:808:4: rule__Else__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Else__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElseAccess().getGroup()); 

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
    // $ANTLR end "ruleElse"


    // $ANTLR start "entryRuleGenerators"
    // InternalFortXTrans.g:817:1: entryRuleGenerators : ruleGenerators EOF ;
    public final void entryRuleGenerators() throws RecognitionException {
        try {
            // InternalFortXTrans.g:818:1: ( ruleGenerators EOF )
            // InternalFortXTrans.g:819:1: ruleGenerators EOF
            {
             before(grammarAccess.getGeneratorsRule()); 
            pushFollow(FOLLOW_1);
            ruleGenerators();

            state._fsp--;

             after(grammarAccess.getGeneratorsRule()); 
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
    // $ANTLR end "entryRuleGenerators"


    // $ANTLR start "ruleGenerators"
    // InternalFortXTrans.g:826:1: ruleGenerators : ( ( rule__Generators__Group__0 ) ) ;
    public final void ruleGenerators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:830:2: ( ( ( rule__Generators__Group__0 ) ) )
            // InternalFortXTrans.g:831:2: ( ( rule__Generators__Group__0 ) )
            {
            // InternalFortXTrans.g:831:2: ( ( rule__Generators__Group__0 ) )
            // InternalFortXTrans.g:832:3: ( rule__Generators__Group__0 )
            {
             before(grammarAccess.getGeneratorsAccess().getGroup()); 
            // InternalFortXTrans.g:833:3: ( rule__Generators__Group__0 )
            // InternalFortXTrans.g:833:4: rule__Generators__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Generators__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorsAccess().getGroup()); 

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
    // $ANTLR end "ruleGenerators"


    // $ANTLR start "entryRuleBinding"
    // InternalFortXTrans.g:842:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalFortXTrans.g:843:1: ( ruleBinding EOF )
            // InternalFortXTrans.g:844:1: ruleBinding EOF
            {
             before(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getBindingRule()); 
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
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalFortXTrans.g:851:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:855:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalFortXTrans.g:856:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalFortXTrans.g:856:2: ( ( rule__Binding__Group__0 ) )
            // InternalFortXTrans.g:857:3: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // InternalFortXTrans.g:858:3: ( rule__Binding__Group__0 )
            // InternalFortXTrans.g:858:4: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getGroup()); 

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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleGenClause"
    // InternalFortXTrans.g:867:1: entryRuleGenClause : ruleGenClause EOF ;
    public final void entryRuleGenClause() throws RecognitionException {
        try {
            // InternalFortXTrans.g:868:1: ( ruleGenClause EOF )
            // InternalFortXTrans.g:869:1: ruleGenClause EOF
            {
             before(grammarAccess.getGenClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleGenClause();

            state._fsp--;

             after(grammarAccess.getGenClauseRule()); 
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
    // $ANTLR end "entryRuleGenClause"


    // $ANTLR start "ruleGenClause"
    // InternalFortXTrans.g:876:1: ruleGenClause : ( ( rule__GenClause__Alternatives ) ) ;
    public final void ruleGenClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:880:2: ( ( ( rule__GenClause__Alternatives ) ) )
            // InternalFortXTrans.g:881:2: ( ( rule__GenClause__Alternatives ) )
            {
            // InternalFortXTrans.g:881:2: ( ( rule__GenClause__Alternatives ) )
            // InternalFortXTrans.g:882:3: ( rule__GenClause__Alternatives )
            {
             before(grammarAccess.getGenClauseAccess().getAlternatives()); 
            // InternalFortXTrans.g:883:3: ( rule__GenClause__Alternatives )
            // InternalFortXTrans.g:883:4: rule__GenClause__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GenClause__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGenClauseAccess().getAlternatives()); 

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
    // $ANTLR end "ruleGenClause"


    // $ANTLR start "entryRuleBlockElems"
    // InternalFortXTrans.g:892:1: entryRuleBlockElems : ruleBlockElems EOF ;
    public final void entryRuleBlockElems() throws RecognitionException {
        try {
            // InternalFortXTrans.g:893:1: ( ruleBlockElems EOF )
            // InternalFortXTrans.g:894:1: ruleBlockElems EOF
            {
             before(grammarAccess.getBlockElemsRule()); 
            pushFollow(FOLLOW_1);
            ruleBlockElems();

            state._fsp--;

             after(grammarAccess.getBlockElemsRule()); 
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
    // $ANTLR end "entryRuleBlockElems"


    // $ANTLR start "ruleBlockElems"
    // InternalFortXTrans.g:901:1: ruleBlockElems : ( ( rule__BlockElems__Group__0 ) ) ;
    public final void ruleBlockElems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:905:2: ( ( ( rule__BlockElems__Group__0 ) ) )
            // InternalFortXTrans.g:906:2: ( ( rule__BlockElems__Group__0 ) )
            {
            // InternalFortXTrans.g:906:2: ( ( rule__BlockElems__Group__0 ) )
            // InternalFortXTrans.g:907:3: ( rule__BlockElems__Group__0 )
            {
             before(grammarAccess.getBlockElemsAccess().getGroup()); 
            // InternalFortXTrans.g:908:3: ( rule__BlockElems__Group__0 )
            // InternalFortXTrans.g:908:4: rule__BlockElems__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BlockElems__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockElemsAccess().getGroup()); 

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
    // $ANTLR end "ruleBlockElems"


    // $ANTLR start "entryRuleBlockElem"
    // InternalFortXTrans.g:917:1: entryRuleBlockElem : ruleBlockElem EOF ;
    public final void entryRuleBlockElem() throws RecognitionException {
        try {
            // InternalFortXTrans.g:918:1: ( ruleBlockElem EOF )
            // InternalFortXTrans.g:919:1: ruleBlockElem EOF
            {
             before(grammarAccess.getBlockElemRule()); 
            pushFollow(FOLLOW_1);
            ruleBlockElem();

            state._fsp--;

             after(grammarAccess.getBlockElemRule()); 
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
    // $ANTLR end "entryRuleBlockElem"


    // $ANTLR start "ruleBlockElem"
    // InternalFortXTrans.g:926:1: ruleBlockElem : ( ( rule__BlockElem__ExpAssignment ) ) ;
    public final void ruleBlockElem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:930:2: ( ( ( rule__BlockElem__ExpAssignment ) ) )
            // InternalFortXTrans.g:931:2: ( ( rule__BlockElem__ExpAssignment ) )
            {
            // InternalFortXTrans.g:931:2: ( ( rule__BlockElem__ExpAssignment ) )
            // InternalFortXTrans.g:932:3: ( rule__BlockElem__ExpAssignment )
            {
             before(grammarAccess.getBlockElemAccess().getExpAssignment()); 
            // InternalFortXTrans.g:933:3: ( rule__BlockElem__ExpAssignment )
            // InternalFortXTrans.g:933:4: rule__BlockElem__ExpAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BlockElem__ExpAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBlockElemAccess().getExpAssignment()); 

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
    // $ANTLR end "ruleBlockElem"


    // $ANTLR start "entryRuleParanthesized"
    // InternalFortXTrans.g:942:1: entryRuleParanthesized : ruleParanthesized EOF ;
    public final void entryRuleParanthesized() throws RecognitionException {
        try {
            // InternalFortXTrans.g:943:1: ( ruleParanthesized EOF )
            // InternalFortXTrans.g:944:1: ruleParanthesized EOF
            {
             before(grammarAccess.getParanthesizedRule()); 
            pushFollow(FOLLOW_1);
            ruleParanthesized();

            state._fsp--;

             after(grammarAccess.getParanthesizedRule()); 
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
    // $ANTLR end "entryRuleParanthesized"


    // $ANTLR start "ruleParanthesized"
    // InternalFortXTrans.g:951:1: ruleParanthesized : ( ( rule__Paranthesized__Group__0 ) ) ;
    public final void ruleParanthesized() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:955:2: ( ( ( rule__Paranthesized__Group__0 ) ) )
            // InternalFortXTrans.g:956:2: ( ( rule__Paranthesized__Group__0 ) )
            {
            // InternalFortXTrans.g:956:2: ( ( rule__Paranthesized__Group__0 ) )
            // InternalFortXTrans.g:957:3: ( rule__Paranthesized__Group__0 )
            {
             before(grammarAccess.getParanthesizedAccess().getGroup()); 
            // InternalFortXTrans.g:958:3: ( rule__Paranthesized__Group__0 )
            // InternalFortXTrans.g:958:4: rule__Paranthesized__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Paranthesized__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParanthesizedAccess().getGroup()); 

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
    // $ANTLR end "ruleParanthesized"


    // $ANTLR start "entryRuleDo"
    // InternalFortXTrans.g:967:1: entryRuleDo : ruleDo EOF ;
    public final void entryRuleDo() throws RecognitionException {
        try {
            // InternalFortXTrans.g:968:1: ( ruleDo EOF )
            // InternalFortXTrans.g:969:1: ruleDo EOF
            {
             before(grammarAccess.getDoRule()); 
            pushFollow(FOLLOW_1);
            ruleDo();

            state._fsp--;

             after(grammarAccess.getDoRule()); 
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
    // $ANTLR end "entryRuleDo"


    // $ANTLR start "ruleDo"
    // InternalFortXTrans.g:976:1: ruleDo : ( ( rule__Do__Group__0 ) ) ;
    public final void ruleDo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:980:2: ( ( ( rule__Do__Group__0 ) ) )
            // InternalFortXTrans.g:981:2: ( ( rule__Do__Group__0 ) )
            {
            // InternalFortXTrans.g:981:2: ( ( rule__Do__Group__0 ) )
            // InternalFortXTrans.g:982:3: ( rule__Do__Group__0 )
            {
             before(grammarAccess.getDoAccess().getGroup()); 
            // InternalFortXTrans.g:983:3: ( rule__Do__Group__0 )
            // InternalFortXTrans.g:983:4: rule__Do__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Do__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoAccess().getGroup()); 

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
    // $ANTLR end "ruleDo"


    // $ANTLR start "entryRuleDoFront"
    // InternalFortXTrans.g:992:1: entryRuleDoFront : ruleDoFront EOF ;
    public final void entryRuleDoFront() throws RecognitionException {
        try {
            // InternalFortXTrans.g:993:1: ( ruleDoFront EOF )
            // InternalFortXTrans.g:994:1: ruleDoFront EOF
            {
             before(grammarAccess.getDoFrontRule()); 
            pushFollow(FOLLOW_1);
            ruleDoFront();

            state._fsp--;

             after(grammarAccess.getDoFrontRule()); 
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
    // $ANTLR end "entryRuleDoFront"


    // $ANTLR start "ruleDoFront"
    // InternalFortXTrans.g:1001:1: ruleDoFront : ( ( rule__DoFront__Group__0 ) ) ;
    public final void ruleDoFront() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1005:2: ( ( ( rule__DoFront__Group__0 ) ) )
            // InternalFortXTrans.g:1006:2: ( ( rule__DoFront__Group__0 ) )
            {
            // InternalFortXTrans.g:1006:2: ( ( rule__DoFront__Group__0 ) )
            // InternalFortXTrans.g:1007:3: ( rule__DoFront__Group__0 )
            {
             before(grammarAccess.getDoFrontAccess().getGroup()); 
            // InternalFortXTrans.g:1008:3: ( rule__DoFront__Group__0 )
            // InternalFortXTrans.g:1008:4: rule__DoFront__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DoFront__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoFrontAccess().getGroup()); 

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
    // $ANTLR end "ruleDoFront"


    // $ANTLR start "entryRuleIdOrTuple"
    // InternalFortXTrans.g:1017:1: entryRuleIdOrTuple : ruleIdOrTuple EOF ;
    public final void entryRuleIdOrTuple() throws RecognitionException {
        try {
            // InternalFortXTrans.g:1018:1: ( ruleIdOrTuple EOF )
            // InternalFortXTrans.g:1019:1: ruleIdOrTuple EOF
            {
             before(grammarAccess.getIdOrTupleRule()); 
            pushFollow(FOLLOW_1);
            ruleIdOrTuple();

            state._fsp--;

             after(grammarAccess.getIdOrTupleRule()); 
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
    // $ANTLR end "entryRuleIdOrTuple"


    // $ANTLR start "ruleIdOrTuple"
    // InternalFortXTrans.g:1026:1: ruleIdOrTuple : ( ( rule__IdOrTuple__Alternatives ) ) ;
    public final void ruleIdOrTuple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1030:2: ( ( ( rule__IdOrTuple__Alternatives ) ) )
            // InternalFortXTrans.g:1031:2: ( ( rule__IdOrTuple__Alternatives ) )
            {
            // InternalFortXTrans.g:1031:2: ( ( rule__IdOrTuple__Alternatives ) )
            // InternalFortXTrans.g:1032:3: ( rule__IdOrTuple__Alternatives )
            {
             before(grammarAccess.getIdOrTupleAccess().getAlternatives()); 
            // InternalFortXTrans.g:1033:3: ( rule__IdOrTuple__Alternatives )
            // InternalFortXTrans.g:1033:4: rule__IdOrTuple__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IdOrTuple__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIdOrTupleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleIdOrTuple"


    // $ANTLR start "entryRuleBindId"
    // InternalFortXTrans.g:1042:1: entryRuleBindId : ruleBindId EOF ;
    public final void entryRuleBindId() throws RecognitionException {
        try {
            // InternalFortXTrans.g:1043:1: ( ruleBindId EOF )
            // InternalFortXTrans.g:1044:1: ruleBindId EOF
            {
             before(grammarAccess.getBindIdRule()); 
            pushFollow(FOLLOW_1);
            ruleBindId();

            state._fsp--;

             after(grammarAccess.getBindIdRule()); 
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
    // $ANTLR end "entryRuleBindId"


    // $ANTLR start "ruleBindId"
    // InternalFortXTrans.g:1051:1: ruleBindId : ( ( rule__BindId__Alternatives ) ) ;
    public final void ruleBindId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1055:2: ( ( ( rule__BindId__Alternatives ) ) )
            // InternalFortXTrans.g:1056:2: ( ( rule__BindId__Alternatives ) )
            {
            // InternalFortXTrans.g:1056:2: ( ( rule__BindId__Alternatives ) )
            // InternalFortXTrans.g:1057:3: ( rule__BindId__Alternatives )
            {
             before(grammarAccess.getBindIdAccess().getAlternatives()); 
            // InternalFortXTrans.g:1058:3: ( rule__BindId__Alternatives )
            // InternalFortXTrans.g:1058:4: rule__BindId__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BindId__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBindIdAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBindId"


    // $ANTLR start "entryRuleIsType"
    // InternalFortXTrans.g:1067:1: entryRuleIsType : ruleIsType EOF ;
    public final void entryRuleIsType() throws RecognitionException {
        try {
            // InternalFortXTrans.g:1068:1: ( ruleIsType EOF )
            // InternalFortXTrans.g:1069:1: ruleIsType EOF
            {
             before(grammarAccess.getIsTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleIsType();

            state._fsp--;

             after(grammarAccess.getIsTypeRule()); 
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
    // $ANTLR end "entryRuleIsType"


    // $ANTLR start "ruleIsType"
    // InternalFortXTrans.g:1076:1: ruleIsType : ( ( rule__IsType__Group__0 ) ) ;
    public final void ruleIsType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1080:2: ( ( ( rule__IsType__Group__0 ) ) )
            // InternalFortXTrans.g:1081:2: ( ( rule__IsType__Group__0 ) )
            {
            // InternalFortXTrans.g:1081:2: ( ( rule__IsType__Group__0 ) )
            // InternalFortXTrans.g:1082:3: ( rule__IsType__Group__0 )
            {
             before(grammarAccess.getIsTypeAccess().getGroup()); 
            // InternalFortXTrans.g:1083:3: ( rule__IsType__Group__0 )
            // InternalFortXTrans.g:1083:4: rule__IsType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IsType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIsTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleIsType"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalFortXTrans.g:1091:1: rule__Model__Alternatives : ( ( ruleComponent ) | ( ruleAPI ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1095:1: ( ( ruleComponent ) | ( ruleAPI ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFortXTrans.g:1096:2: ( ruleComponent )
                    {
                    // InternalFortXTrans.g:1096:2: ( ruleComponent )
                    // InternalFortXTrans.g:1097:3: ruleComponent
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
                    // InternalFortXTrans.g:1102:2: ( ruleAPI )
                    {
                    // InternalFortXTrans.g:1102:2: ( ruleAPI )
                    // InternalFortXTrans.g:1103:3: ruleAPI
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
    // InternalFortXTrans.g:1112:1: rule__Import__Alternatives : ( ( ( rule__Import__Group_0__0 ) ) | ( ( rule__Import__Group_1__0 ) ) );
    public final void rule__Import__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1116:1: ( ( ( rule__Import__Group_0__0 ) ) | ( ( rule__Import__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==37) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    alt4=1;
                }
                else if ( (LA4_1==22) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFortXTrans.g:1117:2: ( ( rule__Import__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1117:2: ( ( rule__Import__Group_0__0 ) )
                    // InternalFortXTrans.g:1118:3: ( rule__Import__Group_0__0 )
                    {
                     before(grammarAccess.getImportAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1119:3: ( rule__Import__Group_0__0 )
                    // InternalFortXTrans.g:1119:4: rule__Import__Group_0__0
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
                    // InternalFortXTrans.g:1123:2: ( ( rule__Import__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1123:2: ( ( rule__Import__Group_1__0 ) )
                    // InternalFortXTrans.g:1124:3: ( rule__Import__Group_1__0 )
                    {
                     before(grammarAccess.getImportAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1125:3: ( rule__Import__Group_1__0 )
                    // InternalFortXTrans.g:1125:4: rule__Import__Group_1__0
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
    // InternalFortXTrans.g:1133:1: rule__Export__Alternatives : ( ( ( rule__Export__Group_0__0 ) ) | ( ( rule__Export__Group_1__0 ) ) );
    public final void rule__Export__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1137:1: ( ( ( rule__Export__Group_0__0 ) ) | ( ( rule__Export__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==38) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    alt5=1;
                }
                else if ( (LA5_1==26) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFortXTrans.g:1138:2: ( ( rule__Export__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1138:2: ( ( rule__Export__Group_0__0 ) )
                    // InternalFortXTrans.g:1139:3: ( rule__Export__Group_0__0 )
                    {
                     before(grammarAccess.getExportAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1140:3: ( rule__Export__Group_0__0 )
                    // InternalFortXTrans.g:1140:4: rule__Export__Group_0__0
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
                    // InternalFortXTrans.g:1144:2: ( ( rule__Export__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1144:2: ( ( rule__Export__Group_1__0 ) )
                    // InternalFortXTrans.g:1145:3: ( rule__Export__Group_1__0 )
                    {
                     before(grammarAccess.getExportAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1146:3: ( rule__Export__Group_1__0 )
                    // InternalFortXTrans.g:1146:4: rule__Export__Group_1__0
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
    // InternalFortXTrans.g:1154:1: rule__ImportedNames__Alternatives : ( ( ( rule__ImportedNames__Group_0__0 ) ) | ( ( rule__ImportedNames__Group_1__0 ) ) | ( ( rule__ImportedNames__Group_2__0 ) ) );
    public final void rule__ImportedNames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1158:1: ( ( ( rule__ImportedNames__Group_0__0 ) ) | ( ( rule__ImportedNames__Group_1__0 ) ) | ( ( rule__ImportedNames__Group_2__0 ) ) )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalFortXTrans.g:1159:2: ( ( rule__ImportedNames__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1159:2: ( ( rule__ImportedNames__Group_0__0 ) )
                    // InternalFortXTrans.g:1160:3: ( rule__ImportedNames__Group_0__0 )
                    {
                     before(grammarAccess.getImportedNamesAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1161:3: ( rule__ImportedNames__Group_0__0 )
                    // InternalFortXTrans.g:1161:4: rule__ImportedNames__Group_0__0
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
                    // InternalFortXTrans.g:1165:2: ( ( rule__ImportedNames__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1165:2: ( ( rule__ImportedNames__Group_1__0 ) )
                    // InternalFortXTrans.g:1166:3: ( rule__ImportedNames__Group_1__0 )
                    {
                     before(grammarAccess.getImportedNamesAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1167:3: ( rule__ImportedNames__Group_1__0 )
                    // InternalFortXTrans.g:1167:4: rule__ImportedNames__Group_1__0
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
                    // InternalFortXTrans.g:1171:2: ( ( rule__ImportedNames__Group_2__0 ) )
                    {
                    // InternalFortXTrans.g:1171:2: ( ( rule__ImportedNames__Group_2__0 ) )
                    // InternalFortXTrans.g:1172:3: ( rule__ImportedNames__Group_2__0 )
                    {
                     before(grammarAccess.getImportedNamesAccess().getGroup_2()); 
                    // InternalFortXTrans.g:1173:3: ( rule__ImportedNames__Group_2__0 )
                    // InternalFortXTrans.g:1173:4: rule__ImportedNames__Group_2__0
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


    // $ANTLR start "rule__QualifiedName__Alternatives"
    // InternalFortXTrans.g:1181:1: rule__QualifiedName__Alternatives : ( ( ( rule__QualifiedName__Group_0__0 ) ) | ( ( rule__QualifiedName__Group_1__0 ) ) | ( ( rule__QualifiedName__Group_2__0 ) ) );
    public final void rule__QualifiedName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1185:1: ( ( ( rule__QualifiedName__Group_0__0 ) ) | ( ( rule__QualifiedName__Group_1__0 ) ) | ( ( rule__QualifiedName__Group_2__0 ) ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalFortXTrans.g:1186:2: ( ( rule__QualifiedName__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1186:2: ( ( rule__QualifiedName__Group_0__0 ) )
                    // InternalFortXTrans.g:1187:3: ( rule__QualifiedName__Group_0__0 )
                    {
                     before(grammarAccess.getQualifiedNameAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1188:3: ( rule__QualifiedName__Group_0__0 )
                    // InternalFortXTrans.g:1188:4: rule__QualifiedName__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QualifiedName__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQualifiedNameAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1192:2: ( ( rule__QualifiedName__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1192:2: ( ( rule__QualifiedName__Group_1__0 ) )
                    // InternalFortXTrans.g:1193:3: ( rule__QualifiedName__Group_1__0 )
                    {
                     before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1194:3: ( rule__QualifiedName__Group_1__0 )
                    // InternalFortXTrans.g:1194:4: rule__QualifiedName__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QualifiedName__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:1198:2: ( ( rule__QualifiedName__Group_2__0 ) )
                    {
                    // InternalFortXTrans.g:1198:2: ( ( rule__QualifiedName__Group_2__0 ) )
                    // InternalFortXTrans.g:1199:3: ( rule__QualifiedName__Group_2__0 )
                    {
                     before(grammarAccess.getQualifiedNameAccess().getGroup_2()); 
                    // InternalFortXTrans.g:1200:3: ( rule__QualifiedName__Group_2__0 )
                    // InternalFortXTrans.g:1200:4: rule__QualifiedName__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QualifiedName__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQualifiedNameAccess().getGroup_2()); 

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
    // $ANTLR end "rule__QualifiedName__Alternatives"


    // $ANTLR start "rule__APIName__Alternatives"
    // InternalFortXTrans.g:1208:1: rule__APIName__Alternatives : ( ( ( rule__APIName__Group_0__0 ) ) | ( ( rule__APIName__Group_1__0 ) ) | ( ( rule__APIName__Group_2__0 ) ) );
    public final void rule__APIName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1212:1: ( ( ( rule__APIName__Group_0__0 ) ) | ( ( rule__APIName__Group_1__0 ) ) | ( ( rule__APIName__Group_2__0 ) ) )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalFortXTrans.g:1213:2: ( ( rule__APIName__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1213:2: ( ( rule__APIName__Group_0__0 ) )
                    // InternalFortXTrans.g:1214:3: ( rule__APIName__Group_0__0 )
                    {
                     before(grammarAccess.getAPINameAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1215:3: ( rule__APIName__Group_0__0 )
                    // InternalFortXTrans.g:1215:4: rule__APIName__Group_0__0
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
                    // InternalFortXTrans.g:1219:2: ( ( rule__APIName__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1219:2: ( ( rule__APIName__Group_1__0 ) )
                    // InternalFortXTrans.g:1220:3: ( rule__APIName__Group_1__0 )
                    {
                     before(grammarAccess.getAPINameAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1221:3: ( rule__APIName__Group_1__0 )
                    // InternalFortXTrans.g:1221:4: rule__APIName__Group_1__0
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
                    // InternalFortXTrans.g:1225:2: ( ( rule__APIName__Group_2__0 ) )
                    {
                    // InternalFortXTrans.g:1225:2: ( ( rule__APIName__Group_2__0 ) )
                    // InternalFortXTrans.g:1226:3: ( rule__APIName__Group_2__0 )
                    {
                     before(grammarAccess.getAPINameAccess().getGroup_2()); 
                    // InternalFortXTrans.g:1227:3: ( rule__APIName__Group_2__0 )
                    // InternalFortXTrans.g:1227:4: rule__APIName__Group_2__0
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
    // InternalFortXTrans.g:1235:1: rule__SimpleNames__Alternatives : ( ( ( rule__SimpleNames__NameListAssignment_0 ) ) | ( ( rule__SimpleNames__Group_1__0 ) ) );
    public final void rule__SimpleNames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1239:1: ( ( ( rule__SimpleNames__NameListAssignment_0 ) ) | ( ( rule__SimpleNames__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalFortXTrans.g:1240:2: ( ( rule__SimpleNames__NameListAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1240:2: ( ( rule__SimpleNames__NameListAssignment_0 ) )
                    // InternalFortXTrans.g:1241:3: ( rule__SimpleNames__NameListAssignment_0 )
                    {
                     before(grammarAccess.getSimpleNamesAccess().getNameListAssignment_0()); 
                    // InternalFortXTrans.g:1242:3: ( rule__SimpleNames__NameListAssignment_0 )
                    // InternalFortXTrans.g:1242:4: rule__SimpleNames__NameListAssignment_0
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
                    // InternalFortXTrans.g:1246:2: ( ( rule__SimpleNames__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1246:2: ( ( rule__SimpleNames__Group_1__0 ) )
                    // InternalFortXTrans.g:1247:3: ( rule__SimpleNames__Group_1__0 )
                    {
                     before(grammarAccess.getSimpleNamesAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1248:3: ( rule__SimpleNames__Group_1__0 )
                    // InternalFortXTrans.g:1248:4: rule__SimpleNames__Group_1__0
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
    // InternalFortXTrans.g:1256:1: rule__AliasedAPINames__Alternatives : ( ( ( rule__AliasedAPINames__NameListAssignment_0 ) ) | ( ( rule__AliasedAPINames__Group_1__0 ) ) );
    public final void rule__AliasedAPINames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1260:1: ( ( ( rule__AliasedAPINames__NameListAssignment_0 ) ) | ( ( rule__AliasedAPINames__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalFortXTrans.g:1261:2: ( ( rule__AliasedAPINames__NameListAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1261:2: ( ( rule__AliasedAPINames__NameListAssignment_0 ) )
                    // InternalFortXTrans.g:1262:3: ( rule__AliasedAPINames__NameListAssignment_0 )
                    {
                     before(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_0()); 
                    // InternalFortXTrans.g:1263:3: ( rule__AliasedAPINames__NameListAssignment_0 )
                    // InternalFortXTrans.g:1263:4: rule__AliasedAPINames__NameListAssignment_0
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
                    // InternalFortXTrans.g:1267:2: ( ( rule__AliasedAPINames__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1267:2: ( ( rule__AliasedAPINames__Group_1__0 ) )
                    // InternalFortXTrans.g:1268:3: ( rule__AliasedAPINames__Group_1__0 )
                    {
                     before(grammarAccess.getAliasedAPINamesAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1269:3: ( rule__AliasedAPINames__Group_1__0 )
                    // InternalFortXTrans.g:1269:4: rule__AliasedAPINames__Group_1__0
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


    // $ANTLR start "rule__FnMod__Alternatives"
    // InternalFortXTrans.g:1277:1: rule__FnMod__Alternatives : ( ( ( rule__FnMod__ModtypeAssignment_0 ) ) | ( ( rule__FnMod__ModtypeAssignment_1 ) ) | ( ( rule__FnMod__ModtypeAssignment_2 ) ) | ( ( rule__FnMod__ModtypeAssignment_3 ) ) );
    public final void rule__FnMod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1281:1: ( ( ( rule__FnMod__ModtypeAssignment_0 ) ) | ( ( rule__FnMod__ModtypeAssignment_1 ) ) | ( ( rule__FnMod__ModtypeAssignment_2 ) ) | ( ( rule__FnMod__ModtypeAssignment_3 ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt11=1;
                }
                break;
            case 41:
                {
                alt11=2;
                }
                break;
            case 42:
                {
                alt11=3;
                }
                break;
            case 43:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalFortXTrans.g:1282:2: ( ( rule__FnMod__ModtypeAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1282:2: ( ( rule__FnMod__ModtypeAssignment_0 ) )
                    // InternalFortXTrans.g:1283:3: ( rule__FnMod__ModtypeAssignment_0 )
                    {
                     before(grammarAccess.getFnModAccess().getModtypeAssignment_0()); 
                    // InternalFortXTrans.g:1284:3: ( rule__FnMod__ModtypeAssignment_0 )
                    // InternalFortXTrans.g:1284:4: rule__FnMod__ModtypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FnMod__ModtypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFnModAccess().getModtypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1288:2: ( ( rule__FnMod__ModtypeAssignment_1 ) )
                    {
                    // InternalFortXTrans.g:1288:2: ( ( rule__FnMod__ModtypeAssignment_1 ) )
                    // InternalFortXTrans.g:1289:3: ( rule__FnMod__ModtypeAssignment_1 )
                    {
                     before(grammarAccess.getFnModAccess().getModtypeAssignment_1()); 
                    // InternalFortXTrans.g:1290:3: ( rule__FnMod__ModtypeAssignment_1 )
                    // InternalFortXTrans.g:1290:4: rule__FnMod__ModtypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FnMod__ModtypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFnModAccess().getModtypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:1294:2: ( ( rule__FnMod__ModtypeAssignment_2 ) )
                    {
                    // InternalFortXTrans.g:1294:2: ( ( rule__FnMod__ModtypeAssignment_2 ) )
                    // InternalFortXTrans.g:1295:3: ( rule__FnMod__ModtypeAssignment_2 )
                    {
                     before(grammarAccess.getFnModAccess().getModtypeAssignment_2()); 
                    // InternalFortXTrans.g:1296:3: ( rule__FnMod__ModtypeAssignment_2 )
                    // InternalFortXTrans.g:1296:4: rule__FnMod__ModtypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FnMod__ModtypeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFnModAccess().getModtypeAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFortXTrans.g:1300:2: ( ( rule__FnMod__ModtypeAssignment_3 ) )
                    {
                    // InternalFortXTrans.g:1300:2: ( ( rule__FnMod__ModtypeAssignment_3 ) )
                    // InternalFortXTrans.g:1301:3: ( rule__FnMod__ModtypeAssignment_3 )
                    {
                     before(grammarAccess.getFnModAccess().getModtypeAssignment_3()); 
                    // InternalFortXTrans.g:1302:3: ( rule__FnMod__ModtypeAssignment_3 )
                    // InternalFortXTrans.g:1302:4: rule__FnMod__ModtypeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FnMod__ModtypeAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFnModAccess().getModtypeAssignment_3()); 

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
    // $ANTLR end "rule__FnMod__Alternatives"


    // $ANTLR start "rule__ValParam__Alternatives"
    // InternalFortXTrans.g:1310:1: rule__ValParam__Alternatives : ( ( ( rule__ValParam__ParamsAssignment_0 ) ) | ( ( rule__ValParam__Group_1__0 ) ) );
    public final void rule__ValParam__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1314:1: ( ( ( rule__ValParam__ParamsAssignment_0 ) ) | ( ( rule__ValParam__Group_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||LA12_0==19) ) {
                alt12=1;
            }
            else if ( (LA12_0==34) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalFortXTrans.g:1315:2: ( ( rule__ValParam__ParamsAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1315:2: ( ( rule__ValParam__ParamsAssignment_0 ) )
                    // InternalFortXTrans.g:1316:3: ( rule__ValParam__ParamsAssignment_0 )
                    {
                     before(grammarAccess.getValParamAccess().getParamsAssignment_0()); 
                    // InternalFortXTrans.g:1317:3: ( rule__ValParam__ParamsAssignment_0 )
                    // InternalFortXTrans.g:1317:4: rule__ValParam__ParamsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValParam__ParamsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValParamAccess().getParamsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1321:2: ( ( rule__ValParam__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1321:2: ( ( rule__ValParam__Group_1__0 ) )
                    // InternalFortXTrans.g:1322:3: ( rule__ValParam__Group_1__0 )
                    {
                     before(grammarAccess.getValParamAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1323:3: ( rule__ValParam__Group_1__0 )
                    // InternalFortXTrans.g:1323:4: rule__ValParam__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValParam__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValParamAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ValParam__Alternatives"


    // $ANTLR start "rule__RetType__Alternatives"
    // InternalFortXTrans.g:1331:1: rule__RetType__Alternatives : ( ( ( rule__RetType__Group_0__0 ) ) | ( ( rule__RetType__Group_1__0 ) ) );
    public final void rule__RetType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1335:1: ( ( ( rule__RetType__Group_0__0 ) ) | ( ( rule__RetType__Group_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==34) ) {
                    alt13=1;
                }
                else if ( (LA13_1==RULE_ID) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalFortXTrans.g:1336:2: ( ( rule__RetType__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1336:2: ( ( rule__RetType__Group_0__0 ) )
                    // InternalFortXTrans.g:1337:3: ( rule__RetType__Group_0__0 )
                    {
                     before(grammarAccess.getRetTypeAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1338:3: ( rule__RetType__Group_0__0 )
                    // InternalFortXTrans.g:1338:4: rule__RetType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RetType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRetTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1342:2: ( ( rule__RetType__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1342:2: ( ( rule__RetType__Group_1__0 ) )
                    // InternalFortXTrans.g:1343:3: ( rule__RetType__Group_1__0 )
                    {
                     before(grammarAccess.getRetTypeAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1344:3: ( rule__RetType__Group_1__0 )
                    // InternalFortXTrans.g:1344:4: rule__RetType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RetType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRetTypeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__RetType__Alternatives"


    // $ANTLR start "rule__ExprFront__Alternatives"
    // InternalFortXTrans.g:1352:1: rule__ExprFront__Alternatives : ( ( ( rule__ExprFront__DelimAssignment_0 ) ) | ( ( rule__ExprFront__IdAssignment_1 ) ) );
    public final void rule__ExprFront__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1356:1: ( ( ( rule__ExprFront__DelimAssignment_0 ) ) | ( ( rule__ExprFront__IdAssignment_1 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34||LA14_0==36||LA14_0==42||(LA14_0>=45 && LA14_0<=48)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalFortXTrans.g:1357:2: ( ( rule__ExprFront__DelimAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1357:2: ( ( rule__ExprFront__DelimAssignment_0 ) )
                    // InternalFortXTrans.g:1358:3: ( rule__ExprFront__DelimAssignment_0 )
                    {
                     before(grammarAccess.getExprFrontAccess().getDelimAssignment_0()); 
                    // InternalFortXTrans.g:1359:3: ( rule__ExprFront__DelimAssignment_0 )
                    // InternalFortXTrans.g:1359:4: rule__ExprFront__DelimAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExprFront__DelimAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprFrontAccess().getDelimAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1363:2: ( ( rule__ExprFront__IdAssignment_1 ) )
                    {
                    // InternalFortXTrans.g:1363:2: ( ( rule__ExprFront__IdAssignment_1 ) )
                    // InternalFortXTrans.g:1364:3: ( rule__ExprFront__IdAssignment_1 )
                    {
                     before(grammarAccess.getExprFrontAccess().getIdAssignment_1()); 
                    // InternalFortXTrans.g:1365:3: ( rule__ExprFront__IdAssignment_1 )
                    // InternalFortXTrans.g:1365:4: rule__ExprFront__IdAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExprFront__IdAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprFrontAccess().getIdAssignment_1()); 

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
    // $ANTLR end "rule__ExprFront__Alternatives"


    // $ANTLR start "rule__DelimitedExpr__Alternatives"
    // InternalFortXTrans.g:1373:1: rule__DelimitedExpr__Alternatives : ( ( ( rule__DelimitedExpr__DodAssignment_0 ) ) | ( ( rule__DelimitedExpr__Group_1__0 ) ) | ( ( rule__DelimitedExpr__Group_2__0 ) ) | ( ( rule__DelimitedExpr__Group_3__0 ) ) | ( ( rule__DelimitedExpr__ParAssignment_4 ) ) );
    public final void rule__DelimitedExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1377:1: ( ( ( rule__DelimitedExpr__DodAssignment_0 ) ) | ( ( rule__DelimitedExpr__Group_1__0 ) ) | ( ( rule__DelimitedExpr__Group_2__0 ) ) | ( ( rule__DelimitedExpr__Group_3__0 ) ) | ( ( rule__DelimitedExpr__ParAssignment_4 ) ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 36:
            case 42:
            case 48:
                {
                alt15=1;
                }
                break;
            case 45:
                {
                alt15=2;
                }
                break;
            case 46:
                {
                alt15=3;
                }
                break;
            case 47:
                {
                alt15=4;
                }
                break;
            case 34:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalFortXTrans.g:1378:2: ( ( rule__DelimitedExpr__DodAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1378:2: ( ( rule__DelimitedExpr__DodAssignment_0 ) )
                    // InternalFortXTrans.g:1379:3: ( rule__DelimitedExpr__DodAssignment_0 )
                    {
                     before(grammarAccess.getDelimitedExprAccess().getDodAssignment_0()); 
                    // InternalFortXTrans.g:1380:3: ( rule__DelimitedExpr__DodAssignment_0 )
                    // InternalFortXTrans.g:1380:4: rule__DelimitedExpr__DodAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DelimitedExpr__DodAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDelimitedExprAccess().getDodAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1384:2: ( ( rule__DelimitedExpr__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1384:2: ( ( rule__DelimitedExpr__Group_1__0 ) )
                    // InternalFortXTrans.g:1385:3: ( rule__DelimitedExpr__Group_1__0 )
                    {
                     before(grammarAccess.getDelimitedExprAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1386:3: ( rule__DelimitedExpr__Group_1__0 )
                    // InternalFortXTrans.g:1386:4: rule__DelimitedExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DelimitedExpr__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDelimitedExprAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:1390:2: ( ( rule__DelimitedExpr__Group_2__0 ) )
                    {
                    // InternalFortXTrans.g:1390:2: ( ( rule__DelimitedExpr__Group_2__0 ) )
                    // InternalFortXTrans.g:1391:3: ( rule__DelimitedExpr__Group_2__0 )
                    {
                     before(grammarAccess.getDelimitedExprAccess().getGroup_2()); 
                    // InternalFortXTrans.g:1392:3: ( rule__DelimitedExpr__Group_2__0 )
                    // InternalFortXTrans.g:1392:4: rule__DelimitedExpr__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DelimitedExpr__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDelimitedExprAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFortXTrans.g:1396:2: ( ( rule__DelimitedExpr__Group_3__0 ) )
                    {
                    // InternalFortXTrans.g:1396:2: ( ( rule__DelimitedExpr__Group_3__0 ) )
                    // InternalFortXTrans.g:1397:3: ( rule__DelimitedExpr__Group_3__0 )
                    {
                     before(grammarAccess.getDelimitedExprAccess().getGroup_3()); 
                    // InternalFortXTrans.g:1398:3: ( rule__DelimitedExpr__Group_3__0 )
                    // InternalFortXTrans.g:1398:4: rule__DelimitedExpr__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DelimitedExpr__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDelimitedExprAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalFortXTrans.g:1402:2: ( ( rule__DelimitedExpr__ParAssignment_4 ) )
                    {
                    // InternalFortXTrans.g:1402:2: ( ( rule__DelimitedExpr__ParAssignment_4 ) )
                    // InternalFortXTrans.g:1403:3: ( rule__DelimitedExpr__ParAssignment_4 )
                    {
                     before(grammarAccess.getDelimitedExprAccess().getParAssignment_4()); 
                    // InternalFortXTrans.g:1404:3: ( rule__DelimitedExpr__ParAssignment_4 )
                    // InternalFortXTrans.g:1404:4: rule__DelimitedExpr__ParAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__DelimitedExpr__ParAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getDelimitedExprAccess().getParAssignment_4()); 

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
    // $ANTLR end "rule__DelimitedExpr__Alternatives"


    // $ANTLR start "rule__GenClause__Alternatives"
    // InternalFortXTrans.g:1412:1: rule__GenClause__Alternatives : ( ( ( rule__GenClause__BindingAssignment_0 ) ) | ( ( rule__GenClause__ExprAssignment_1 ) ) );
    public final void rule__GenClause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1416:1: ( ( ( rule__GenClause__BindingAssignment_0 ) ) | ( ( rule__GenClause__ExprAssignment_1 ) ) )
            int alt16=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==33) ) {
                    alt16=1;
                }
                else if ( (LA16_1==EOF||LA16_1==RULE_DOTS||(LA16_1>=24 && LA16_1<=25)||LA16_1==27||LA16_1==36||LA16_1==42||LA16_1==48) ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt16=1;
                }
                break;
            case 34:
                {
                switch ( input.LA(2) ) {
                case 34:
                case 36:
                case 42:
                case 45:
                case 46:
                case 47:
                case 48:
                    {
                    alt16=2;
                    }
                    break;
                case RULE_ID:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_DOTS:
                    case 25:
                    case 27:
                        {
                        alt16=2;
                        }
                        break;
                    case 28:
                        {
                        int LA16_6 = input.LA(4);

                        if ( (LA16_6==33) ) {
                            alt16=1;
                        }
                        else if ( (LA16_6==EOF||LA16_6==24||LA16_6==27||LA16_6==36||LA16_6==42||LA16_6==48) ) {
                            alt16=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 24:
                        {
                        alt16=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 5, input);

                        throw nvae;
                    }

                    }
                    break;
                case 19:
                    {
                    alt16=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 3, input);

                    throw nvae;
                }

                }
                break;
            case 36:
            case 42:
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt16=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalFortXTrans.g:1417:2: ( ( rule__GenClause__BindingAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1417:2: ( ( rule__GenClause__BindingAssignment_0 ) )
                    // InternalFortXTrans.g:1418:3: ( rule__GenClause__BindingAssignment_0 )
                    {
                     before(grammarAccess.getGenClauseAccess().getBindingAssignment_0()); 
                    // InternalFortXTrans.g:1419:3: ( rule__GenClause__BindingAssignment_0 )
                    // InternalFortXTrans.g:1419:4: rule__GenClause__BindingAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenClause__BindingAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenClauseAccess().getBindingAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1423:2: ( ( rule__GenClause__ExprAssignment_1 ) )
                    {
                    // InternalFortXTrans.g:1423:2: ( ( rule__GenClause__ExprAssignment_1 ) )
                    // InternalFortXTrans.g:1424:3: ( rule__GenClause__ExprAssignment_1 )
                    {
                     before(grammarAccess.getGenClauseAccess().getExprAssignment_1()); 
                    // InternalFortXTrans.g:1425:3: ( rule__GenClause__ExprAssignment_1 )
                    // InternalFortXTrans.g:1425:4: rule__GenClause__ExprAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenClause__ExprAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenClauseAccess().getExprAssignment_1()); 

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
    // $ANTLR end "rule__GenClause__Alternatives"


    // $ANTLR start "rule__IdOrTuple__Alternatives"
    // InternalFortXTrans.g:1433:1: rule__IdOrTuple__Alternatives : ( ( ( rule__IdOrTuple__BidAssignment_0 ) ) | ( ( rule__IdOrTuple__Group_1__0 ) ) );
    public final void rule__IdOrTuple__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1437:1: ( ( ( rule__IdOrTuple__BidAssignment_0 ) ) | ( ( rule__IdOrTuple__Group_1__0 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||LA17_0==19) ) {
                alt17=1;
            }
            else if ( (LA17_0==34) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalFortXTrans.g:1438:2: ( ( rule__IdOrTuple__BidAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1438:2: ( ( rule__IdOrTuple__BidAssignment_0 ) )
                    // InternalFortXTrans.g:1439:3: ( rule__IdOrTuple__BidAssignment_0 )
                    {
                     before(grammarAccess.getIdOrTupleAccess().getBidAssignment_0()); 
                    // InternalFortXTrans.g:1440:3: ( rule__IdOrTuple__BidAssignment_0 )
                    // InternalFortXTrans.g:1440:4: rule__IdOrTuple__BidAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IdOrTuple__BidAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIdOrTupleAccess().getBidAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1444:2: ( ( rule__IdOrTuple__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1444:2: ( ( rule__IdOrTuple__Group_1__0 ) )
                    // InternalFortXTrans.g:1445:3: ( rule__IdOrTuple__Group_1__0 )
                    {
                     before(grammarAccess.getIdOrTupleAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1446:3: ( rule__IdOrTuple__Group_1__0 )
                    // InternalFortXTrans.g:1446:4: rule__IdOrTuple__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IdOrTuple__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIdOrTupleAccess().getGroup_1()); 

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
    // $ANTLR end "rule__IdOrTuple__Alternatives"


    // $ANTLR start "rule__BindId__Alternatives"
    // InternalFortXTrans.g:1454:1: rule__BindId__Alternatives : ( ( RULE_ID ) | ( '_' ) );
    public final void rule__BindId__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1458:1: ( ( RULE_ID ) | ( '_' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==19) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalFortXTrans.g:1459:2: ( RULE_ID )
                    {
                    // InternalFortXTrans.g:1459:2: ( RULE_ID )
                    // InternalFortXTrans.g:1460:3: RULE_ID
                    {
                     before(grammarAccess.getBindIdAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getBindIdAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1465:2: ( '_' )
                    {
                    // InternalFortXTrans.g:1465:2: ( '_' )
                    // InternalFortXTrans.g:1466:3: '_'
                    {
                     before(grammarAccess.getBindIdAccess().get_Keyword_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBindIdAccess().get_Keyword_1()); 

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
    // $ANTLR end "rule__BindId__Alternatives"


    // $ANTLR start "rule__Component__Group__0"
    // InternalFortXTrans.g:1475:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1479:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalFortXTrans.g:1480:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalFortXTrans.g:1487:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1491:1: ( ( 'component' ) )
            // InternalFortXTrans.g:1492:1: ( 'component' )
            {
            // InternalFortXTrans.g:1492:1: ( 'component' )
            // InternalFortXTrans.g:1493:2: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalFortXTrans.g:1502:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1506:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalFortXTrans.g:1507:2: rule__Component__Group__1__Impl rule__Component__Group__2
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
    // InternalFortXTrans.g:1514:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1518:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalFortXTrans.g:1519:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalFortXTrans.g:1519:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalFortXTrans.g:1520:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalFortXTrans.g:1521:2: ( rule__Component__NameAssignment_1 )
            // InternalFortXTrans.g:1521:3: rule__Component__NameAssignment_1
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
    // InternalFortXTrans.g:1529:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1533:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalFortXTrans.g:1534:2: rule__Component__Group__2__Impl rule__Component__Group__3
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
    // InternalFortXTrans.g:1541:1: rule__Component__Group__2__Impl : ( ( rule__Component__ImportsAssignment_2 )* ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1545:1: ( ( ( rule__Component__ImportsAssignment_2 )* ) )
            // InternalFortXTrans.g:1546:1: ( ( rule__Component__ImportsAssignment_2 )* )
            {
            // InternalFortXTrans.g:1546:1: ( ( rule__Component__ImportsAssignment_2 )* )
            // InternalFortXTrans.g:1547:2: ( rule__Component__ImportsAssignment_2 )*
            {
             before(grammarAccess.getComponentAccess().getImportsAssignment_2()); 
            // InternalFortXTrans.g:1548:2: ( rule__Component__ImportsAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalFortXTrans.g:1548:3: rule__Component__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Component__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalFortXTrans.g:1556:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1560:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalFortXTrans.g:1561:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalFortXTrans.g:1568:1: rule__Component__Group__3__Impl : ( ( ( rule__Component__ExportsAssignment_3 ) ) ( ( rule__Component__ExportsAssignment_3 )* ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1572:1: ( ( ( ( rule__Component__ExportsAssignment_3 ) ) ( ( rule__Component__ExportsAssignment_3 )* ) ) )
            // InternalFortXTrans.g:1573:1: ( ( ( rule__Component__ExportsAssignment_3 ) ) ( ( rule__Component__ExportsAssignment_3 )* ) )
            {
            // InternalFortXTrans.g:1573:1: ( ( ( rule__Component__ExportsAssignment_3 ) ) ( ( rule__Component__ExportsAssignment_3 )* ) )
            // InternalFortXTrans.g:1574:2: ( ( rule__Component__ExportsAssignment_3 ) ) ( ( rule__Component__ExportsAssignment_3 )* )
            {
            // InternalFortXTrans.g:1574:2: ( ( rule__Component__ExportsAssignment_3 ) )
            // InternalFortXTrans.g:1575:3: ( rule__Component__ExportsAssignment_3 )
            {
             before(grammarAccess.getComponentAccess().getExportsAssignment_3()); 
            // InternalFortXTrans.g:1576:3: ( rule__Component__ExportsAssignment_3 )
            // InternalFortXTrans.g:1576:4: rule__Component__ExportsAssignment_3
            {
            pushFollow(FOLLOW_9);
            rule__Component__ExportsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getExportsAssignment_3()); 

            }

            // InternalFortXTrans.g:1579:2: ( ( rule__Component__ExportsAssignment_3 )* )
            // InternalFortXTrans.g:1580:3: ( rule__Component__ExportsAssignment_3 )*
            {
             before(grammarAccess.getComponentAccess().getExportsAssignment_3()); 
            // InternalFortXTrans.g:1581:3: ( rule__Component__ExportsAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==38) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalFortXTrans.g:1581:4: rule__Component__ExportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Component__ExportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getExportsAssignment_3()); 

            }


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
    // InternalFortXTrans.g:1590:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1594:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalFortXTrans.g:1595:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__5();

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
    // InternalFortXTrans.g:1602:1: rule__Component__Group__4__Impl : ( ( rule__Component__DeclsAssignment_4 )* ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1606:1: ( ( ( rule__Component__DeclsAssignment_4 )* ) )
            // InternalFortXTrans.g:1607:1: ( ( rule__Component__DeclsAssignment_4 )* )
            {
            // InternalFortXTrans.g:1607:1: ( ( rule__Component__DeclsAssignment_4 )* )
            // InternalFortXTrans.g:1608:2: ( rule__Component__DeclsAssignment_4 )*
            {
             before(grammarAccess.getComponentAccess().getDeclsAssignment_4()); 
            // InternalFortXTrans.g:1609:2: ( rule__Component__DeclsAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||(LA21_0>=40 && LA21_0<=43)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalFortXTrans.g:1609:3: rule__Component__DeclsAssignment_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Component__DeclsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getDeclsAssignment_4()); 

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


    // $ANTLR start "rule__Component__Group__5"
    // InternalFortXTrans.g:1617:1: rule__Component__Group__5 : rule__Component__Group__5__Impl ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1621:1: ( rule__Component__Group__5__Impl )
            // InternalFortXTrans.g:1622:2: rule__Component__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__5__Impl();

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
    // $ANTLR end "rule__Component__Group__5"


    // $ANTLR start "rule__Component__Group__5__Impl"
    // InternalFortXTrans.g:1628:1: rule__Component__Group__5__Impl : ( 'end' ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1632:1: ( ( 'end' ) )
            // InternalFortXTrans.g:1633:1: ( 'end' )
            {
            // InternalFortXTrans.g:1633:1: ( 'end' )
            // InternalFortXTrans.g:1634:2: 'end'
            {
             before(grammarAccess.getComponentAccess().getEndKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getEndKeyword_5()); 

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
    // $ANTLR end "rule__Component__Group__5__Impl"


    // $ANTLR start "rule__API__Group__0"
    // InternalFortXTrans.g:1644:1: rule__API__Group__0 : rule__API__Group__0__Impl rule__API__Group__1 ;
    public final void rule__API__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1648:1: ( rule__API__Group__0__Impl rule__API__Group__1 )
            // InternalFortXTrans.g:1649:2: rule__API__Group__0__Impl rule__API__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalFortXTrans.g:1656:1: rule__API__Group__0__Impl : ( 'api' ) ;
    public final void rule__API__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1660:1: ( ( 'api' ) )
            // InternalFortXTrans.g:1661:1: ( 'api' )
            {
            // InternalFortXTrans.g:1661:1: ( 'api' )
            // InternalFortXTrans.g:1662:2: 'api'
            {
             before(grammarAccess.getAPIAccess().getApiKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalFortXTrans.g:1671:1: rule__API__Group__1 : rule__API__Group__1__Impl rule__API__Group__2 ;
    public final void rule__API__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1675:1: ( rule__API__Group__1__Impl rule__API__Group__2 )
            // InternalFortXTrans.g:1676:2: rule__API__Group__1__Impl rule__API__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalFortXTrans.g:1683:1: rule__API__Group__1__Impl : ( ( rule__API__NameAssignment_1 ) ) ;
    public final void rule__API__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1687:1: ( ( ( rule__API__NameAssignment_1 ) ) )
            // InternalFortXTrans.g:1688:1: ( ( rule__API__NameAssignment_1 ) )
            {
            // InternalFortXTrans.g:1688:1: ( ( rule__API__NameAssignment_1 ) )
            // InternalFortXTrans.g:1689:2: ( rule__API__NameAssignment_1 )
            {
             before(grammarAccess.getAPIAccess().getNameAssignment_1()); 
            // InternalFortXTrans.g:1690:2: ( rule__API__NameAssignment_1 )
            // InternalFortXTrans.g:1690:3: rule__API__NameAssignment_1
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
    // InternalFortXTrans.g:1698:1: rule__API__Group__2 : rule__API__Group__2__Impl rule__API__Group__3 ;
    public final void rule__API__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1702:1: ( rule__API__Group__2__Impl rule__API__Group__3 )
            // InternalFortXTrans.g:1703:2: rule__API__Group__2__Impl rule__API__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalFortXTrans.g:1710:1: rule__API__Group__2__Impl : ( ( rule__API__ImportsAssignment_2 )* ) ;
    public final void rule__API__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1714:1: ( ( ( rule__API__ImportsAssignment_2 )* ) )
            // InternalFortXTrans.g:1715:1: ( ( rule__API__ImportsAssignment_2 )* )
            {
            // InternalFortXTrans.g:1715:1: ( ( rule__API__ImportsAssignment_2 )* )
            // InternalFortXTrans.g:1716:2: ( rule__API__ImportsAssignment_2 )*
            {
             before(grammarAccess.getAPIAccess().getImportsAssignment_2()); 
            // InternalFortXTrans.g:1717:2: ( rule__API__ImportsAssignment_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalFortXTrans.g:1717:3: rule__API__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__API__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalFortXTrans.g:1725:1: rule__API__Group__3 : rule__API__Group__3__Impl ;
    public final void rule__API__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1729:1: ( rule__API__Group__3__Impl )
            // InternalFortXTrans.g:1730:2: rule__API__Group__3__Impl
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
    // InternalFortXTrans.g:1736:1: rule__API__Group__3__Impl : ( 'end' ) ;
    public final void rule__API__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1740:1: ( ( 'end' ) )
            // InternalFortXTrans.g:1741:1: ( 'end' )
            {
            // InternalFortXTrans.g:1741:1: ( 'end' )
            // InternalFortXTrans.g:1742:2: 'end'
            {
             before(grammarAccess.getAPIAccess().getEndKeyword_3()); 
            match(input,21,FOLLOW_2); 
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


    // $ANTLR start "rule__Import__Group_0__0"
    // InternalFortXTrans.g:1752:1: rule__Import__Group_0__0 : rule__Import__Group_0__0__Impl rule__Import__Group_0__1 ;
    public final void rule__Import__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1756:1: ( rule__Import__Group_0__0__Impl rule__Import__Group_0__1 )
            // InternalFortXTrans.g:1757:2: rule__Import__Group_0__0__Impl rule__Import__Group_0__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalFortXTrans.g:1764:1: rule__Import__Group_0__0__Impl : ( ( rule__Import__ImpsAssignment_0_0 ) ) ;
    public final void rule__Import__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1768:1: ( ( ( rule__Import__ImpsAssignment_0_0 ) ) )
            // InternalFortXTrans.g:1769:1: ( ( rule__Import__ImpsAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:1769:1: ( ( rule__Import__ImpsAssignment_0_0 ) )
            // InternalFortXTrans.g:1770:2: ( rule__Import__ImpsAssignment_0_0 )
            {
             before(grammarAccess.getImportAccess().getImpsAssignment_0_0()); 
            // InternalFortXTrans.g:1771:2: ( rule__Import__ImpsAssignment_0_0 )
            // InternalFortXTrans.g:1771:3: rule__Import__ImpsAssignment_0_0
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
    // InternalFortXTrans.g:1779:1: rule__Import__Group_0__1 : rule__Import__Group_0__1__Impl ;
    public final void rule__Import__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1783:1: ( rule__Import__Group_0__1__Impl )
            // InternalFortXTrans.g:1784:2: rule__Import__Group_0__1__Impl
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
    // InternalFortXTrans.g:1790:1: rule__Import__Group_0__1__Impl : ( ( rule__Import__ImportedNamesAssignment_0_1 ) ) ;
    public final void rule__Import__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1794:1: ( ( ( rule__Import__ImportedNamesAssignment_0_1 ) ) )
            // InternalFortXTrans.g:1795:1: ( ( rule__Import__ImportedNamesAssignment_0_1 ) )
            {
            // InternalFortXTrans.g:1795:1: ( ( rule__Import__ImportedNamesAssignment_0_1 ) )
            // InternalFortXTrans.g:1796:2: ( rule__Import__ImportedNamesAssignment_0_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamesAssignment_0_1()); 
            // InternalFortXTrans.g:1797:2: ( rule__Import__ImportedNamesAssignment_0_1 )
            // InternalFortXTrans.g:1797:3: rule__Import__ImportedNamesAssignment_0_1
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
    // InternalFortXTrans.g:1806:1: rule__Import__Group_1__0 : rule__Import__Group_1__0__Impl rule__Import__Group_1__1 ;
    public final void rule__Import__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1810:1: ( rule__Import__Group_1__0__Impl rule__Import__Group_1__1 )
            // InternalFortXTrans.g:1811:2: rule__Import__Group_1__0__Impl rule__Import__Group_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalFortXTrans.g:1818:1: rule__Import__Group_1__0__Impl : ( ( rule__Import__ImpsAssignment_1_0 ) ) ;
    public final void rule__Import__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1822:1: ( ( ( rule__Import__ImpsAssignment_1_0 ) ) )
            // InternalFortXTrans.g:1823:1: ( ( rule__Import__ImpsAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:1823:1: ( ( rule__Import__ImpsAssignment_1_0 ) )
            // InternalFortXTrans.g:1824:2: ( rule__Import__ImpsAssignment_1_0 )
            {
             before(grammarAccess.getImportAccess().getImpsAssignment_1_0()); 
            // InternalFortXTrans.g:1825:2: ( rule__Import__ImpsAssignment_1_0 )
            // InternalFortXTrans.g:1825:3: rule__Import__ImpsAssignment_1_0
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
    // InternalFortXTrans.g:1833:1: rule__Import__Group_1__1 : rule__Import__Group_1__1__Impl rule__Import__Group_1__2 ;
    public final void rule__Import__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1837:1: ( rule__Import__Group_1__1__Impl rule__Import__Group_1__2 )
            // InternalFortXTrans.g:1838:2: rule__Import__Group_1__1__Impl rule__Import__Group_1__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalFortXTrans.g:1845:1: rule__Import__Group_1__1__Impl : ( ( rule__Import__ApiAssignment_1_1 ) ) ;
    public final void rule__Import__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1849:1: ( ( ( rule__Import__ApiAssignment_1_1 ) ) )
            // InternalFortXTrans.g:1850:1: ( ( rule__Import__ApiAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:1850:1: ( ( rule__Import__ApiAssignment_1_1 ) )
            // InternalFortXTrans.g:1851:2: ( rule__Import__ApiAssignment_1_1 )
            {
             before(grammarAccess.getImportAccess().getApiAssignment_1_1()); 
            // InternalFortXTrans.g:1852:2: ( rule__Import__ApiAssignment_1_1 )
            // InternalFortXTrans.g:1852:3: rule__Import__ApiAssignment_1_1
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
    // InternalFortXTrans.g:1860:1: rule__Import__Group_1__2 : rule__Import__Group_1__2__Impl ;
    public final void rule__Import__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1864:1: ( rule__Import__Group_1__2__Impl )
            // InternalFortXTrans.g:1865:2: rule__Import__Group_1__2__Impl
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
    // InternalFortXTrans.g:1871:1: rule__Import__Group_1__2__Impl : ( ( rule__Import__AliasedimportedNamesAssignment_1_2 ) ) ;
    public final void rule__Import__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1875:1: ( ( ( rule__Import__AliasedimportedNamesAssignment_1_2 ) ) )
            // InternalFortXTrans.g:1876:1: ( ( rule__Import__AliasedimportedNamesAssignment_1_2 ) )
            {
            // InternalFortXTrans.g:1876:1: ( ( rule__Import__AliasedimportedNamesAssignment_1_2 ) )
            // InternalFortXTrans.g:1877:2: ( rule__Import__AliasedimportedNamesAssignment_1_2 )
            {
             before(grammarAccess.getImportAccess().getAliasedimportedNamesAssignment_1_2()); 
            // InternalFortXTrans.g:1878:2: ( rule__Import__AliasedimportedNamesAssignment_1_2 )
            // InternalFortXTrans.g:1878:3: rule__Import__AliasedimportedNamesAssignment_1_2
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
    // InternalFortXTrans.g:1887:1: rule__Export__Group_0__0 : rule__Export__Group_0__0__Impl rule__Export__Group_0__1 ;
    public final void rule__Export__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1891:1: ( rule__Export__Group_0__0__Impl rule__Export__Group_0__1 )
            // InternalFortXTrans.g:1892:2: rule__Export__Group_0__0__Impl rule__Export__Group_0__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalFortXTrans.g:1899:1: rule__Export__Group_0__0__Impl : ( ( rule__Export__ExpAssignment_0_0 ) ) ;
    public final void rule__Export__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1903:1: ( ( ( rule__Export__ExpAssignment_0_0 ) ) )
            // InternalFortXTrans.g:1904:1: ( ( rule__Export__ExpAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:1904:1: ( ( rule__Export__ExpAssignment_0_0 ) )
            // InternalFortXTrans.g:1905:2: ( rule__Export__ExpAssignment_0_0 )
            {
             before(grammarAccess.getExportAccess().getExpAssignment_0_0()); 
            // InternalFortXTrans.g:1906:2: ( rule__Export__ExpAssignment_0_0 )
            // InternalFortXTrans.g:1906:3: rule__Export__ExpAssignment_0_0
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
    // InternalFortXTrans.g:1914:1: rule__Export__Group_0__1 : rule__Export__Group_0__1__Impl ;
    public final void rule__Export__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1918:1: ( rule__Export__Group_0__1__Impl )
            // InternalFortXTrans.g:1919:2: rule__Export__Group_0__1__Impl
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
    // InternalFortXTrans.g:1925:1: rule__Export__Group_0__1__Impl : ( ( rule__Export__ExportedNameAssignment_0_1 ) ) ;
    public final void rule__Export__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1929:1: ( ( ( rule__Export__ExportedNameAssignment_0_1 ) ) )
            // InternalFortXTrans.g:1930:1: ( ( rule__Export__ExportedNameAssignment_0_1 ) )
            {
            // InternalFortXTrans.g:1930:1: ( ( rule__Export__ExportedNameAssignment_0_1 ) )
            // InternalFortXTrans.g:1931:2: ( rule__Export__ExportedNameAssignment_0_1 )
            {
             before(grammarAccess.getExportAccess().getExportedNameAssignment_0_1()); 
            // InternalFortXTrans.g:1932:2: ( rule__Export__ExportedNameAssignment_0_1 )
            // InternalFortXTrans.g:1932:3: rule__Export__ExportedNameAssignment_0_1
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
    // InternalFortXTrans.g:1941:1: rule__Export__Group_1__0 : rule__Export__Group_1__0__Impl rule__Export__Group_1__1 ;
    public final void rule__Export__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1945:1: ( rule__Export__Group_1__0__Impl rule__Export__Group_1__1 )
            // InternalFortXTrans.g:1946:2: rule__Export__Group_1__0__Impl rule__Export__Group_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalFortXTrans.g:1953:1: rule__Export__Group_1__0__Impl : ( ( rule__Export__ExpAssignment_1_0 ) ) ;
    public final void rule__Export__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1957:1: ( ( ( rule__Export__ExpAssignment_1_0 ) ) )
            // InternalFortXTrans.g:1958:1: ( ( rule__Export__ExpAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:1958:1: ( ( rule__Export__ExpAssignment_1_0 ) )
            // InternalFortXTrans.g:1959:2: ( rule__Export__ExpAssignment_1_0 )
            {
             before(grammarAccess.getExportAccess().getExpAssignment_1_0()); 
            // InternalFortXTrans.g:1960:2: ( rule__Export__ExpAssignment_1_0 )
            // InternalFortXTrans.g:1960:3: rule__Export__ExpAssignment_1_0
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
    // InternalFortXTrans.g:1968:1: rule__Export__Group_1__1 : rule__Export__Group_1__1__Impl rule__Export__Group_1__2 ;
    public final void rule__Export__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1972:1: ( rule__Export__Group_1__1__Impl rule__Export__Group_1__2 )
            // InternalFortXTrans.g:1973:2: rule__Export__Group_1__1__Impl rule__Export__Group_1__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalFortXTrans.g:1980:1: rule__Export__Group_1__1__Impl : ( ( rule__Export__BrackAssignment_1_1 ) ) ;
    public final void rule__Export__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1984:1: ( ( ( rule__Export__BrackAssignment_1_1 ) ) )
            // InternalFortXTrans.g:1985:1: ( ( rule__Export__BrackAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:1985:1: ( ( rule__Export__BrackAssignment_1_1 ) )
            // InternalFortXTrans.g:1986:2: ( rule__Export__BrackAssignment_1_1 )
            {
             before(grammarAccess.getExportAccess().getBrackAssignment_1_1()); 
            // InternalFortXTrans.g:1987:2: ( rule__Export__BrackAssignment_1_1 )
            // InternalFortXTrans.g:1987:3: rule__Export__BrackAssignment_1_1
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
    // InternalFortXTrans.g:1995:1: rule__Export__Group_1__2 : rule__Export__Group_1__2__Impl rule__Export__Group_1__3 ;
    public final void rule__Export__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1999:1: ( rule__Export__Group_1__2__Impl rule__Export__Group_1__3 )
            // InternalFortXTrans.g:2000:2: rule__Export__Group_1__2__Impl rule__Export__Group_1__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalFortXTrans.g:2007:1: rule__Export__Group_1__2__Impl : ( ( rule__Export__ExportedNameAssignment_1_2 ) ) ;
    public final void rule__Export__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2011:1: ( ( ( rule__Export__ExportedNameAssignment_1_2 ) ) )
            // InternalFortXTrans.g:2012:1: ( ( rule__Export__ExportedNameAssignment_1_2 ) )
            {
            // InternalFortXTrans.g:2012:1: ( ( rule__Export__ExportedNameAssignment_1_2 ) )
            // InternalFortXTrans.g:2013:2: ( rule__Export__ExportedNameAssignment_1_2 )
            {
             before(grammarAccess.getExportAccess().getExportedNameAssignment_1_2()); 
            // InternalFortXTrans.g:2014:2: ( rule__Export__ExportedNameAssignment_1_2 )
            // InternalFortXTrans.g:2014:3: rule__Export__ExportedNameAssignment_1_2
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
    // InternalFortXTrans.g:2022:1: rule__Export__Group_1__3 : rule__Export__Group_1__3__Impl rule__Export__Group_1__4 ;
    public final void rule__Export__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2026:1: ( rule__Export__Group_1__3__Impl rule__Export__Group_1__4 )
            // InternalFortXTrans.g:2027:2: rule__Export__Group_1__3__Impl rule__Export__Group_1__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalFortXTrans.g:2034:1: rule__Export__Group_1__3__Impl : ( ( rule__Export__Group_1_3__0 )* ) ;
    public final void rule__Export__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2038:1: ( ( ( rule__Export__Group_1_3__0 )* ) )
            // InternalFortXTrans.g:2039:1: ( ( rule__Export__Group_1_3__0 )* )
            {
            // InternalFortXTrans.g:2039:1: ( ( rule__Export__Group_1_3__0 )* )
            // InternalFortXTrans.g:2040:2: ( rule__Export__Group_1_3__0 )*
            {
             before(grammarAccess.getExportAccess().getGroup_1_3()); 
            // InternalFortXTrans.g:2041:2: ( rule__Export__Group_1_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==24) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalFortXTrans.g:2041:3: rule__Export__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Export__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalFortXTrans.g:2049:1: rule__Export__Group_1__4 : rule__Export__Group_1__4__Impl ;
    public final void rule__Export__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2053:1: ( rule__Export__Group_1__4__Impl )
            // InternalFortXTrans.g:2054:2: rule__Export__Group_1__4__Impl
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
    // InternalFortXTrans.g:2060:1: rule__Export__Group_1__4__Impl : ( '}' ) ;
    public final void rule__Export__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2064:1: ( ( '}' ) )
            // InternalFortXTrans.g:2065:1: ( '}' )
            {
            // InternalFortXTrans.g:2065:1: ( '}' )
            // InternalFortXTrans.g:2066:2: '}'
            {
             before(grammarAccess.getExportAccess().getRightCurlyBracketKeyword_1_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalFortXTrans.g:2076:1: rule__Export__Group_1_3__0 : rule__Export__Group_1_3__0__Impl rule__Export__Group_1_3__1 ;
    public final void rule__Export__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2080:1: ( rule__Export__Group_1_3__0__Impl rule__Export__Group_1_3__1 )
            // InternalFortXTrans.g:2081:2: rule__Export__Group_1_3__0__Impl rule__Export__Group_1_3__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalFortXTrans.g:2088:1: rule__Export__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__Export__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2092:1: ( ( ',' ) )
            // InternalFortXTrans.g:2093:1: ( ',' )
            {
            // InternalFortXTrans.g:2093:1: ( ',' )
            // InternalFortXTrans.g:2094:2: ','
            {
             before(grammarAccess.getExportAccess().getCommaKeyword_1_3_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalFortXTrans.g:2103:1: rule__Export__Group_1_3__1 : rule__Export__Group_1_3__1__Impl ;
    public final void rule__Export__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2107:1: ( rule__Export__Group_1_3__1__Impl )
            // InternalFortXTrans.g:2108:2: rule__Export__Group_1_3__1__Impl
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
    // InternalFortXTrans.g:2114:1: rule__Export__Group_1_3__1__Impl : ( ( rule__Export__ExportedNameAssignment_1_3_1 ) ) ;
    public final void rule__Export__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2118:1: ( ( ( rule__Export__ExportedNameAssignment_1_3_1 ) ) )
            // InternalFortXTrans.g:2119:1: ( ( rule__Export__ExportedNameAssignment_1_3_1 ) )
            {
            // InternalFortXTrans.g:2119:1: ( ( rule__Export__ExportedNameAssignment_1_3_1 ) )
            // InternalFortXTrans.g:2120:2: ( rule__Export__ExportedNameAssignment_1_3_1 )
            {
             before(grammarAccess.getExportAccess().getExportedNameAssignment_1_3_1()); 
            // InternalFortXTrans.g:2121:2: ( rule__Export__ExportedNameAssignment_1_3_1 )
            // InternalFortXTrans.g:2121:3: rule__Export__ExportedNameAssignment_1_3_1
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
    // InternalFortXTrans.g:2130:1: rule__ImportedNames__Group_0__0 : rule__ImportedNames__Group_0__0__Impl rule__ImportedNames__Group_0__1 ;
    public final void rule__ImportedNames__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2134:1: ( rule__ImportedNames__Group_0__0__Impl rule__ImportedNames__Group_0__1 )
            // InternalFortXTrans.g:2135:2: rule__ImportedNames__Group_0__0__Impl rule__ImportedNames__Group_0__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalFortXTrans.g:2142:1: rule__ImportedNames__Group_0__0__Impl : ( ( rule__ImportedNames__ImpnameAssignment_0_0 ) ) ;
    public final void rule__ImportedNames__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2146:1: ( ( ( rule__ImportedNames__ImpnameAssignment_0_0 ) ) )
            // InternalFortXTrans.g:2147:1: ( ( rule__ImportedNames__ImpnameAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:2147:1: ( ( rule__ImportedNames__ImpnameAssignment_0_0 ) )
            // InternalFortXTrans.g:2148:2: ( rule__ImportedNames__ImpnameAssignment_0_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getImpnameAssignment_0_0()); 
            // InternalFortXTrans.g:2149:2: ( rule__ImportedNames__ImpnameAssignment_0_0 )
            // InternalFortXTrans.g:2149:3: rule__ImportedNames__ImpnameAssignment_0_0
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
    // InternalFortXTrans.g:2157:1: rule__ImportedNames__Group_0__1 : rule__ImportedNames__Group_0__1__Impl rule__ImportedNames__Group_0__2 ;
    public final void rule__ImportedNames__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2161:1: ( rule__ImportedNames__Group_0__1__Impl rule__ImportedNames__Group_0__2 )
            // InternalFortXTrans.g:2162:2: rule__ImportedNames__Group_0__1__Impl rule__ImportedNames__Group_0__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalFortXTrans.g:2169:1: rule__ImportedNames__Group_0__1__Impl : ( '.' ) ;
    public final void rule__ImportedNames__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2173:1: ( ( '.' ) )
            // InternalFortXTrans.g:2174:1: ( '.' )
            {
            // InternalFortXTrans.g:2174:1: ( '.' )
            // InternalFortXTrans.g:2175:2: '.'
            {
             before(grammarAccess.getImportedNamesAccess().getFullStopKeyword_0_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalFortXTrans.g:2184:1: rule__ImportedNames__Group_0__2 : rule__ImportedNames__Group_0__2__Impl rule__ImportedNames__Group_0__3 ;
    public final void rule__ImportedNames__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2188:1: ( rule__ImportedNames__Group_0__2__Impl rule__ImportedNames__Group_0__3 )
            // InternalFortXTrans.g:2189:2: rule__ImportedNames__Group_0__2__Impl rule__ImportedNames__Group_0__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalFortXTrans.g:2196:1: rule__ImportedNames__Group_0__2__Impl : ( '{' ) ;
    public final void rule__ImportedNames__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2200:1: ( ( '{' ) )
            // InternalFortXTrans.g:2201:1: ( '{' )
            {
            // InternalFortXTrans.g:2201:1: ( '{' )
            // InternalFortXTrans.g:2202:2: '{'
            {
             before(grammarAccess.getImportedNamesAccess().getLeftCurlyBracketKeyword_0_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFortXTrans.g:2211:1: rule__ImportedNames__Group_0__3 : rule__ImportedNames__Group_0__3__Impl rule__ImportedNames__Group_0__4 ;
    public final void rule__ImportedNames__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2215:1: ( rule__ImportedNames__Group_0__3__Impl rule__ImportedNames__Group_0__4 )
            // InternalFortXTrans.g:2216:2: rule__ImportedNames__Group_0__3__Impl rule__ImportedNames__Group_0__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalFortXTrans.g:2223:1: rule__ImportedNames__Group_0__3__Impl : ( RULE_DOTS ) ;
    public final void rule__ImportedNames__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2227:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:2228:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:2228:1: ( RULE_DOTS )
            // InternalFortXTrans.g:2229:2: RULE_DOTS
            {
             before(grammarAccess.getImportedNamesAccess().getDOTSTerminalRuleCall_0_3()); 
            match(input,RULE_DOTS,FOLLOW_2); 
             after(grammarAccess.getImportedNamesAccess().getDOTSTerminalRuleCall_0_3()); 

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
    // InternalFortXTrans.g:2238:1: rule__ImportedNames__Group_0__4 : rule__ImportedNames__Group_0__4__Impl rule__ImportedNames__Group_0__5 ;
    public final void rule__ImportedNames__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2242:1: ( rule__ImportedNames__Group_0__4__Impl rule__ImportedNames__Group_0__5 )
            // InternalFortXTrans.g:2243:2: rule__ImportedNames__Group_0__4__Impl rule__ImportedNames__Group_0__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalFortXTrans.g:2250:1: rule__ImportedNames__Group_0__4__Impl : ( '}' ) ;
    public final void rule__ImportedNames__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2254:1: ( ( '}' ) )
            // InternalFortXTrans.g:2255:1: ( '}' )
            {
            // InternalFortXTrans.g:2255:1: ( '}' )
            // InternalFortXTrans.g:2256:2: '}'
            {
             before(grammarAccess.getImportedNamesAccess().getRightCurlyBracketKeyword_0_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalFortXTrans.g:2265:1: rule__ImportedNames__Group_0__5 : rule__ImportedNames__Group_0__5__Impl ;
    public final void rule__ImportedNames__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2269:1: ( rule__ImportedNames__Group_0__5__Impl )
            // InternalFortXTrans.g:2270:2: rule__ImportedNames__Group_0__5__Impl
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
    // InternalFortXTrans.g:2276:1: rule__ImportedNames__Group_0__5__Impl : ( ( rule__ImportedNames__Group_0_5__0 )? ) ;
    public final void rule__ImportedNames__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2280:1: ( ( ( rule__ImportedNames__Group_0_5__0 )? ) )
            // InternalFortXTrans.g:2281:1: ( ( rule__ImportedNames__Group_0_5__0 )? )
            {
            // InternalFortXTrans.g:2281:1: ( ( rule__ImportedNames__Group_0_5__0 )? )
            // InternalFortXTrans.g:2282:2: ( rule__ImportedNames__Group_0_5__0 )?
            {
             before(grammarAccess.getImportedNamesAccess().getGroup_0_5()); 
            // InternalFortXTrans.g:2283:2: ( rule__ImportedNames__Group_0_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalFortXTrans.g:2283:3: rule__ImportedNames__Group_0_5__0
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
    // InternalFortXTrans.g:2292:1: rule__ImportedNames__Group_0_5__0 : rule__ImportedNames__Group_0_5__0__Impl rule__ImportedNames__Group_0_5__1 ;
    public final void rule__ImportedNames__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2296:1: ( rule__ImportedNames__Group_0_5__0__Impl rule__ImportedNames__Group_0_5__1 )
            // InternalFortXTrans.g:2297:2: rule__ImportedNames__Group_0_5__0__Impl rule__ImportedNames__Group_0_5__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalFortXTrans.g:2304:1: rule__ImportedNames__Group_0_5__0__Impl : ( ( rule__ImportedNames__ExceptAssignment_0_5_0 ) ) ;
    public final void rule__ImportedNames__Group_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2308:1: ( ( ( rule__ImportedNames__ExceptAssignment_0_5_0 ) ) )
            // InternalFortXTrans.g:2309:1: ( ( rule__ImportedNames__ExceptAssignment_0_5_0 ) )
            {
            // InternalFortXTrans.g:2309:1: ( ( rule__ImportedNames__ExceptAssignment_0_5_0 ) )
            // InternalFortXTrans.g:2310:2: ( rule__ImportedNames__ExceptAssignment_0_5_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getExceptAssignment_0_5_0()); 
            // InternalFortXTrans.g:2311:2: ( rule__ImportedNames__ExceptAssignment_0_5_0 )
            // InternalFortXTrans.g:2311:3: rule__ImportedNames__ExceptAssignment_0_5_0
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
    // InternalFortXTrans.g:2319:1: rule__ImportedNames__Group_0_5__1 : rule__ImportedNames__Group_0_5__1__Impl ;
    public final void rule__ImportedNames__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2323:1: ( rule__ImportedNames__Group_0_5__1__Impl )
            // InternalFortXTrans.g:2324:2: rule__ImportedNames__Group_0_5__1__Impl
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
    // InternalFortXTrans.g:2330:1: rule__ImportedNames__Group_0_5__1__Impl : ( ( rule__ImportedNames__SimpAssignment_0_5_1 ) ) ;
    public final void rule__ImportedNames__Group_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2334:1: ( ( ( rule__ImportedNames__SimpAssignment_0_5_1 ) ) )
            // InternalFortXTrans.g:2335:1: ( ( rule__ImportedNames__SimpAssignment_0_5_1 ) )
            {
            // InternalFortXTrans.g:2335:1: ( ( rule__ImportedNames__SimpAssignment_0_5_1 ) )
            // InternalFortXTrans.g:2336:2: ( rule__ImportedNames__SimpAssignment_0_5_1 )
            {
             before(grammarAccess.getImportedNamesAccess().getSimpAssignment_0_5_1()); 
            // InternalFortXTrans.g:2337:2: ( rule__ImportedNames__SimpAssignment_0_5_1 )
            // InternalFortXTrans.g:2337:3: rule__ImportedNames__SimpAssignment_0_5_1
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
    // InternalFortXTrans.g:2346:1: rule__ImportedNames__Group_1__0 : rule__ImportedNames__Group_1__0__Impl rule__ImportedNames__Group_1__1 ;
    public final void rule__ImportedNames__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2350:1: ( rule__ImportedNames__Group_1__0__Impl rule__ImportedNames__Group_1__1 )
            // InternalFortXTrans.g:2351:2: rule__ImportedNames__Group_1__0__Impl rule__ImportedNames__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalFortXTrans.g:2358:1: rule__ImportedNames__Group_1__0__Impl : ( ( rule__ImportedNames__ImpnameAssignment_1_0 ) ) ;
    public final void rule__ImportedNames__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2362:1: ( ( ( rule__ImportedNames__ImpnameAssignment_1_0 ) ) )
            // InternalFortXTrans.g:2363:1: ( ( rule__ImportedNames__ImpnameAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:2363:1: ( ( rule__ImportedNames__ImpnameAssignment_1_0 ) )
            // InternalFortXTrans.g:2364:2: ( rule__ImportedNames__ImpnameAssignment_1_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getImpnameAssignment_1_0()); 
            // InternalFortXTrans.g:2365:2: ( rule__ImportedNames__ImpnameAssignment_1_0 )
            // InternalFortXTrans.g:2365:3: rule__ImportedNames__ImpnameAssignment_1_0
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
    // InternalFortXTrans.g:2373:1: rule__ImportedNames__Group_1__1 : rule__ImportedNames__Group_1__1__Impl rule__ImportedNames__Group_1__2 ;
    public final void rule__ImportedNames__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2377:1: ( rule__ImportedNames__Group_1__1__Impl rule__ImportedNames__Group_1__2 )
            // InternalFortXTrans.g:2378:2: rule__ImportedNames__Group_1__1__Impl rule__ImportedNames__Group_1__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalFortXTrans.g:2385:1: rule__ImportedNames__Group_1__1__Impl : ( '.' ) ;
    public final void rule__ImportedNames__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2389:1: ( ( '.' ) )
            // InternalFortXTrans.g:2390:1: ( '.' )
            {
            // InternalFortXTrans.g:2390:1: ( '.' )
            // InternalFortXTrans.g:2391:2: '.'
            {
             before(grammarAccess.getImportedNamesAccess().getFullStopKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalFortXTrans.g:2400:1: rule__ImportedNames__Group_1__2 : rule__ImportedNames__Group_1__2__Impl rule__ImportedNames__Group_1__3 ;
    public final void rule__ImportedNames__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2404:1: ( rule__ImportedNames__Group_1__2__Impl rule__ImportedNames__Group_1__3 )
            // InternalFortXTrans.g:2405:2: rule__ImportedNames__Group_1__2__Impl rule__ImportedNames__Group_1__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalFortXTrans.g:2412:1: rule__ImportedNames__Group_1__2__Impl : ( '{' ) ;
    public final void rule__ImportedNames__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2416:1: ( ( '{' ) )
            // InternalFortXTrans.g:2417:1: ( '{' )
            {
            // InternalFortXTrans.g:2417:1: ( '{' )
            // InternalFortXTrans.g:2418:2: '{'
            {
             before(grammarAccess.getImportedNamesAccess().getLeftCurlyBracketKeyword_1_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFortXTrans.g:2427:1: rule__ImportedNames__Group_1__3 : rule__ImportedNames__Group_1__3__Impl rule__ImportedNames__Group_1__4 ;
    public final void rule__ImportedNames__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2431:1: ( rule__ImportedNames__Group_1__3__Impl rule__ImportedNames__Group_1__4 )
            // InternalFortXTrans.g:2432:2: rule__ImportedNames__Group_1__3__Impl rule__ImportedNames__Group_1__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalFortXTrans.g:2439:1: rule__ImportedNames__Group_1__3__Impl : ( ( rule__ImportedNames__SimpListAssignment_1_3 ) ) ;
    public final void rule__ImportedNames__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2443:1: ( ( ( rule__ImportedNames__SimpListAssignment_1_3 ) ) )
            // InternalFortXTrans.g:2444:1: ( ( rule__ImportedNames__SimpListAssignment_1_3 ) )
            {
            // InternalFortXTrans.g:2444:1: ( ( rule__ImportedNames__SimpListAssignment_1_3 ) )
            // InternalFortXTrans.g:2445:2: ( rule__ImportedNames__SimpListAssignment_1_3 )
            {
             before(grammarAccess.getImportedNamesAccess().getSimpListAssignment_1_3()); 
            // InternalFortXTrans.g:2446:2: ( rule__ImportedNames__SimpListAssignment_1_3 )
            // InternalFortXTrans.g:2446:3: rule__ImportedNames__SimpListAssignment_1_3
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
    // InternalFortXTrans.g:2454:1: rule__ImportedNames__Group_1__4 : rule__ImportedNames__Group_1__4__Impl rule__ImportedNames__Group_1__5 ;
    public final void rule__ImportedNames__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2458:1: ( rule__ImportedNames__Group_1__4__Impl rule__ImportedNames__Group_1__5 )
            // InternalFortXTrans.g:2459:2: rule__ImportedNames__Group_1__4__Impl rule__ImportedNames__Group_1__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalFortXTrans.g:2466:1: rule__ImportedNames__Group_1__4__Impl : ( ( rule__ImportedNames__Group_1_4__0 )* ) ;
    public final void rule__ImportedNames__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2470:1: ( ( ( rule__ImportedNames__Group_1_4__0 )* ) )
            // InternalFortXTrans.g:2471:1: ( ( rule__ImportedNames__Group_1_4__0 )* )
            {
            // InternalFortXTrans.g:2471:1: ( ( rule__ImportedNames__Group_1_4__0 )* )
            // InternalFortXTrans.g:2472:2: ( rule__ImportedNames__Group_1_4__0 )*
            {
             before(grammarAccess.getImportedNamesAccess().getGroup_1_4()); 
            // InternalFortXTrans.g:2473:2: ( rule__ImportedNames__Group_1_4__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==24) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==RULE_ID) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalFortXTrans.g:2473:3: rule__ImportedNames__Group_1_4__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ImportedNames__Group_1_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalFortXTrans.g:2481:1: rule__ImportedNames__Group_1__5 : rule__ImportedNames__Group_1__5__Impl rule__ImportedNames__Group_1__6 ;
    public final void rule__ImportedNames__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2485:1: ( rule__ImportedNames__Group_1__5__Impl rule__ImportedNames__Group_1__6 )
            // InternalFortXTrans.g:2486:2: rule__ImportedNames__Group_1__5__Impl rule__ImportedNames__Group_1__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalFortXTrans.g:2493:1: rule__ImportedNames__Group_1__5__Impl : ( ( rule__ImportedNames__Group_1_5__0 )? ) ;
    public final void rule__ImportedNames__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2497:1: ( ( ( rule__ImportedNames__Group_1_5__0 )? ) )
            // InternalFortXTrans.g:2498:1: ( ( rule__ImportedNames__Group_1_5__0 )? )
            {
            // InternalFortXTrans.g:2498:1: ( ( rule__ImportedNames__Group_1_5__0 )? )
            // InternalFortXTrans.g:2499:2: ( rule__ImportedNames__Group_1_5__0 )?
            {
             before(grammarAccess.getImportedNamesAccess().getGroup_1_5()); 
            // InternalFortXTrans.g:2500:2: ( rule__ImportedNames__Group_1_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalFortXTrans.g:2500:3: rule__ImportedNames__Group_1_5__0
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
    // InternalFortXTrans.g:2508:1: rule__ImportedNames__Group_1__6 : rule__ImportedNames__Group_1__6__Impl ;
    public final void rule__ImportedNames__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2512:1: ( rule__ImportedNames__Group_1__6__Impl )
            // InternalFortXTrans.g:2513:2: rule__ImportedNames__Group_1__6__Impl
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
    // InternalFortXTrans.g:2519:1: rule__ImportedNames__Group_1__6__Impl : ( '}' ) ;
    public final void rule__ImportedNames__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2523:1: ( ( '}' ) )
            // InternalFortXTrans.g:2524:1: ( '}' )
            {
            // InternalFortXTrans.g:2524:1: ( '}' )
            // InternalFortXTrans.g:2525:2: '}'
            {
             before(grammarAccess.getImportedNamesAccess().getRightCurlyBracketKeyword_1_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalFortXTrans.g:2535:1: rule__ImportedNames__Group_1_4__0 : rule__ImportedNames__Group_1_4__0__Impl rule__ImportedNames__Group_1_4__1 ;
    public final void rule__ImportedNames__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2539:1: ( rule__ImportedNames__Group_1_4__0__Impl rule__ImportedNames__Group_1_4__1 )
            // InternalFortXTrans.g:2540:2: rule__ImportedNames__Group_1_4__0__Impl rule__ImportedNames__Group_1_4__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalFortXTrans.g:2547:1: rule__ImportedNames__Group_1_4__0__Impl : ( ',' ) ;
    public final void rule__ImportedNames__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2551:1: ( ( ',' ) )
            // InternalFortXTrans.g:2552:1: ( ',' )
            {
            // InternalFortXTrans.g:2552:1: ( ',' )
            // InternalFortXTrans.g:2553:2: ','
            {
             before(grammarAccess.getImportedNamesAccess().getCommaKeyword_1_4_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalFortXTrans.g:2562:1: rule__ImportedNames__Group_1_4__1 : rule__ImportedNames__Group_1_4__1__Impl ;
    public final void rule__ImportedNames__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2566:1: ( rule__ImportedNames__Group_1_4__1__Impl )
            // InternalFortXTrans.g:2567:2: rule__ImportedNames__Group_1_4__1__Impl
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
    // InternalFortXTrans.g:2573:1: rule__ImportedNames__Group_1_4__1__Impl : ( ( rule__ImportedNames__SimpListAssignment_1_4_1 ) ) ;
    public final void rule__ImportedNames__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2577:1: ( ( ( rule__ImportedNames__SimpListAssignment_1_4_1 ) ) )
            // InternalFortXTrans.g:2578:1: ( ( rule__ImportedNames__SimpListAssignment_1_4_1 ) )
            {
            // InternalFortXTrans.g:2578:1: ( ( rule__ImportedNames__SimpListAssignment_1_4_1 ) )
            // InternalFortXTrans.g:2579:2: ( rule__ImportedNames__SimpListAssignment_1_4_1 )
            {
             before(grammarAccess.getImportedNamesAccess().getSimpListAssignment_1_4_1()); 
            // InternalFortXTrans.g:2580:2: ( rule__ImportedNames__SimpListAssignment_1_4_1 )
            // InternalFortXTrans.g:2580:3: rule__ImportedNames__SimpListAssignment_1_4_1
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
    // InternalFortXTrans.g:2589:1: rule__ImportedNames__Group_1_5__0 : rule__ImportedNames__Group_1_5__0__Impl rule__ImportedNames__Group_1_5__1 ;
    public final void rule__ImportedNames__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2593:1: ( rule__ImportedNames__Group_1_5__0__Impl rule__ImportedNames__Group_1_5__1 )
            // InternalFortXTrans.g:2594:2: rule__ImportedNames__Group_1_5__0__Impl rule__ImportedNames__Group_1_5__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalFortXTrans.g:2601:1: rule__ImportedNames__Group_1_5__0__Impl : ( ( rule__ImportedNames__CommaAssignment_1_5_0 ) ) ;
    public final void rule__ImportedNames__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2605:1: ( ( ( rule__ImportedNames__CommaAssignment_1_5_0 ) ) )
            // InternalFortXTrans.g:2606:1: ( ( rule__ImportedNames__CommaAssignment_1_5_0 ) )
            {
            // InternalFortXTrans.g:2606:1: ( ( rule__ImportedNames__CommaAssignment_1_5_0 ) )
            // InternalFortXTrans.g:2607:2: ( rule__ImportedNames__CommaAssignment_1_5_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getCommaAssignment_1_5_0()); 
            // InternalFortXTrans.g:2608:2: ( rule__ImportedNames__CommaAssignment_1_5_0 )
            // InternalFortXTrans.g:2608:3: rule__ImportedNames__CommaAssignment_1_5_0
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
    // InternalFortXTrans.g:2616:1: rule__ImportedNames__Group_1_5__1 : rule__ImportedNames__Group_1_5__1__Impl ;
    public final void rule__ImportedNames__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2620:1: ( rule__ImportedNames__Group_1_5__1__Impl )
            // InternalFortXTrans.g:2621:2: rule__ImportedNames__Group_1_5__1__Impl
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
    // InternalFortXTrans.g:2627:1: rule__ImportedNames__Group_1_5__1__Impl : ( ( rule__ImportedNames__DotsAssignment_1_5_1 ) ) ;
    public final void rule__ImportedNames__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2631:1: ( ( ( rule__ImportedNames__DotsAssignment_1_5_1 ) ) )
            // InternalFortXTrans.g:2632:1: ( ( rule__ImportedNames__DotsAssignment_1_5_1 ) )
            {
            // InternalFortXTrans.g:2632:1: ( ( rule__ImportedNames__DotsAssignment_1_5_1 ) )
            // InternalFortXTrans.g:2633:2: ( rule__ImportedNames__DotsAssignment_1_5_1 )
            {
             before(grammarAccess.getImportedNamesAccess().getDotsAssignment_1_5_1()); 
            // InternalFortXTrans.g:2634:2: ( rule__ImportedNames__DotsAssignment_1_5_1 )
            // InternalFortXTrans.g:2634:3: rule__ImportedNames__DotsAssignment_1_5_1
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
    // InternalFortXTrans.g:2643:1: rule__ImportedNames__Group_2__0 : rule__ImportedNames__Group_2__0__Impl rule__ImportedNames__Group_2__1 ;
    public final void rule__ImportedNames__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2647:1: ( rule__ImportedNames__Group_2__0__Impl rule__ImportedNames__Group_2__1 )
            // InternalFortXTrans.g:2648:2: rule__ImportedNames__Group_2__0__Impl rule__ImportedNames__Group_2__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalFortXTrans.g:2655:1: rule__ImportedNames__Group_2__0__Impl : ( ( rule__ImportedNames__ImpnameAssignment_2_0 ) ) ;
    public final void rule__ImportedNames__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2659:1: ( ( ( rule__ImportedNames__ImpnameAssignment_2_0 ) ) )
            // InternalFortXTrans.g:2660:1: ( ( rule__ImportedNames__ImpnameAssignment_2_0 ) )
            {
            // InternalFortXTrans.g:2660:1: ( ( rule__ImportedNames__ImpnameAssignment_2_0 ) )
            // InternalFortXTrans.g:2661:2: ( rule__ImportedNames__ImpnameAssignment_2_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getImpnameAssignment_2_0()); 
            // InternalFortXTrans.g:2662:2: ( rule__ImportedNames__ImpnameAssignment_2_0 )
            // InternalFortXTrans.g:2662:3: rule__ImportedNames__ImpnameAssignment_2_0
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
    // InternalFortXTrans.g:2670:1: rule__ImportedNames__Group_2__1 : rule__ImportedNames__Group_2__1__Impl ;
    public final void rule__ImportedNames__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2674:1: ( rule__ImportedNames__Group_2__1__Impl )
            // InternalFortXTrans.g:2675:2: rule__ImportedNames__Group_2__1__Impl
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
    // InternalFortXTrans.g:2681:1: rule__ImportedNames__Group_2__1__Impl : ( ( rule__ImportedNames__Group_2_1__0 )? ) ;
    public final void rule__ImportedNames__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2685:1: ( ( ( rule__ImportedNames__Group_2_1__0 )? ) )
            // InternalFortXTrans.g:2686:1: ( ( rule__ImportedNames__Group_2_1__0 )? )
            {
            // InternalFortXTrans.g:2686:1: ( ( rule__ImportedNames__Group_2_1__0 )? )
            // InternalFortXTrans.g:2687:2: ( rule__ImportedNames__Group_2_1__0 )?
            {
             before(grammarAccess.getImportedNamesAccess().getGroup_2_1()); 
            // InternalFortXTrans.g:2688:2: ( rule__ImportedNames__Group_2_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalFortXTrans.g:2688:3: rule__ImportedNames__Group_2_1__0
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
    // InternalFortXTrans.g:2697:1: rule__ImportedNames__Group_2_1__0 : rule__ImportedNames__Group_2_1__0__Impl rule__ImportedNames__Group_2_1__1 ;
    public final void rule__ImportedNames__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2701:1: ( rule__ImportedNames__Group_2_1__0__Impl rule__ImportedNames__Group_2_1__1 )
            // InternalFortXTrans.g:2702:2: rule__ImportedNames__Group_2_1__0__Impl rule__ImportedNames__Group_2_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalFortXTrans.g:2709:1: rule__ImportedNames__Group_2_1__0__Impl : ( 'as' ) ;
    public final void rule__ImportedNames__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2713:1: ( ( 'as' ) )
            // InternalFortXTrans.g:2714:1: ( 'as' )
            {
            // InternalFortXTrans.g:2714:1: ( 'as' )
            // InternalFortXTrans.g:2715:2: 'as'
            {
             before(grammarAccess.getImportedNamesAccess().getAsKeyword_2_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalFortXTrans.g:2724:1: rule__ImportedNames__Group_2_1__1 : rule__ImportedNames__Group_2_1__1__Impl ;
    public final void rule__ImportedNames__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2728:1: ( rule__ImportedNames__Group_2_1__1__Impl )
            // InternalFortXTrans.g:2729:2: rule__ImportedNames__Group_2_1__1__Impl
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
    // InternalFortXTrans.g:2735:1: rule__ImportedNames__Group_2_1__1__Impl : ( ( rule__ImportedNames__AsnameAssignment_2_1_1 ) ) ;
    public final void rule__ImportedNames__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2739:1: ( ( ( rule__ImportedNames__AsnameAssignment_2_1_1 ) ) )
            // InternalFortXTrans.g:2740:1: ( ( rule__ImportedNames__AsnameAssignment_2_1_1 ) )
            {
            // InternalFortXTrans.g:2740:1: ( ( rule__ImportedNames__AsnameAssignment_2_1_1 ) )
            // InternalFortXTrans.g:2741:2: ( rule__ImportedNames__AsnameAssignment_2_1_1 )
            {
             before(grammarAccess.getImportedNamesAccess().getAsnameAssignment_2_1_1()); 
            // InternalFortXTrans.g:2742:2: ( rule__ImportedNames__AsnameAssignment_2_1_1 )
            // InternalFortXTrans.g:2742:3: rule__ImportedNames__AsnameAssignment_2_1_1
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


    // $ANTLR start "rule__QualifiedName__Group_0__0"
    // InternalFortXTrans.g:2751:1: rule__QualifiedName__Group_0__0 : rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1 ;
    public final void rule__QualifiedName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2755:1: ( rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1 )
            // InternalFortXTrans.g:2756:2: rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__QualifiedName__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_0__1();

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
    // $ANTLR end "rule__QualifiedName__Group_0__0"


    // $ANTLR start "rule__QualifiedName__Group_0__0__Impl"
    // InternalFortXTrans.g:2763:1: rule__QualifiedName__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2767:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:2768:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:2768:1: ( RULE_ID )
            // InternalFortXTrans.g:2769:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_0__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_0__1"
    // InternalFortXTrans.g:2778:1: rule__QualifiedName__Group_0__1 : rule__QualifiedName__Group_0__1__Impl ;
    public final void rule__QualifiedName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2782:1: ( rule__QualifiedName__Group_0__1__Impl )
            // InternalFortXTrans.g:2783:2: rule__QualifiedName__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_0__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_0__1"


    // $ANTLR start "rule__QualifiedName__Group_0__1__Impl"
    // InternalFortXTrans.g:2789:1: rule__QualifiedName__Group_0__1__Impl : ( RULE_DOTS ) ;
    public final void rule__QualifiedName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2793:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:2794:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:2794:1: ( RULE_DOTS )
            // InternalFortXTrans.g:2795:2: RULE_DOTS
            {
             before(grammarAccess.getQualifiedNameAccess().getDOTSTerminalRuleCall_0_1()); 
            match(input,RULE_DOTS,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getDOTSTerminalRuleCall_0_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_0__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalFortXTrans.g:2805:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2809:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalFortXTrans.g:2810:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalFortXTrans.g:2817:1: rule__QualifiedName__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2821:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:2822:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:2822:1: ( RULE_ID )
            // InternalFortXTrans.g:2823:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalFortXTrans.g:2832:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl rule__QualifiedName__Group_1__2 ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2836:1: ( rule__QualifiedName__Group_1__1__Impl rule__QualifiedName__Group_1__2 )
            // InternalFortXTrans.g:2837:2: rule__QualifiedName__Group_1__1__Impl rule__QualifiedName__Group_1__2
            {
            pushFollow(FOLLOW_21);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__2();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalFortXTrans.g:2844:1: rule__QualifiedName__Group_1__1__Impl : ( ( rule__QualifiedName__Group_1_1__0 )* ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2848:1: ( ( ( rule__QualifiedName__Group_1_1__0 )* ) )
            // InternalFortXTrans.g:2849:1: ( ( rule__QualifiedName__Group_1_1__0 )* )
            {
            // InternalFortXTrans.g:2849:1: ( ( rule__QualifiedName__Group_1_1__0 )* )
            // InternalFortXTrans.g:2850:2: ( rule__QualifiedName__Group_1_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1_1()); 
            // InternalFortXTrans.g:2851:2: ( rule__QualifiedName__Group_1_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==25) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalFortXTrans.g:2851:3: rule__QualifiedName__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__QualifiedName__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__2"
    // InternalFortXTrans.g:2859:1: rule__QualifiedName__Group_1__2 : rule__QualifiedName__Group_1__2__Impl ;
    public final void rule__QualifiedName__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2863:1: ( rule__QualifiedName__Group_1__2__Impl )
            // InternalFortXTrans.g:2864:2: rule__QualifiedName__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__2__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__2"


    // $ANTLR start "rule__QualifiedName__Group_1__2__Impl"
    // InternalFortXTrans.g:2870:1: rule__QualifiedName__Group_1__2__Impl : ( RULE_DOTS ) ;
    public final void rule__QualifiedName__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2874:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:2875:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:2875:1: ( RULE_DOTS )
            // InternalFortXTrans.g:2876:2: RULE_DOTS
            {
             before(grammarAccess.getQualifiedNameAccess().getDOTSTerminalRuleCall_1_2()); 
            match(input,RULE_DOTS,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getDOTSTerminalRuleCall_1_2()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1_1__0"
    // InternalFortXTrans.g:2886:1: rule__QualifiedName__Group_1_1__0 : rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1 ;
    public final void rule__QualifiedName__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2890:1: ( rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1 )
            // InternalFortXTrans.g:2891:2: rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1_1__0__Impl"
    // InternalFortXTrans.g:2898:1: rule__QualifiedName__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2902:1: ( ( '.' ) )
            // InternalFortXTrans.g:2903:1: ( '.' )
            {
            // InternalFortXTrans.g:2903:1: ( '.' )
            // InternalFortXTrans.g:2904:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1_1__1"
    // InternalFortXTrans.g:2913:1: rule__QualifiedName__Group_1_1__1 : rule__QualifiedName__Group_1_1__1__Impl ;
    public final void rule__QualifiedName__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2917:1: ( rule__QualifiedName__Group_1_1__1__Impl )
            // InternalFortXTrans.g:2918:2: rule__QualifiedName__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1_1__1__Impl"
    // InternalFortXTrans.g:2924:1: rule__QualifiedName__Group_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2928:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:2929:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:2929:1: ( RULE_ID )
            // InternalFortXTrans.g:2930:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1_1__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_2__0"
    // InternalFortXTrans.g:2940:1: rule__QualifiedName__Group_2__0 : rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1 ;
    public final void rule__QualifiedName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2944:1: ( rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1 )
            // InternalFortXTrans.g:2945:2: rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__QualifiedName__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_2__1();

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
    // $ANTLR end "rule__QualifiedName__Group_2__0"


    // $ANTLR start "rule__QualifiedName__Group_2__0__Impl"
    // InternalFortXTrans.g:2952:1: rule__QualifiedName__Group_2__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2956:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:2957:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:2957:1: ( RULE_ID )
            // InternalFortXTrans.g:2958:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_2__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_2__1"
    // InternalFortXTrans.g:2967:1: rule__QualifiedName__Group_2__1 : rule__QualifiedName__Group_2__1__Impl ;
    public final void rule__QualifiedName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2971:1: ( rule__QualifiedName__Group_2__1__Impl )
            // InternalFortXTrans.g:2972:2: rule__QualifiedName__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_2__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_2__1"


    // $ANTLR start "rule__QualifiedName__Group_2__1__Impl"
    // InternalFortXTrans.g:2978:1: rule__QualifiedName__Group_2__1__Impl : ( ( rule__QualifiedName__Group_2_1__0 )* ) ;
    public final void rule__QualifiedName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2982:1: ( ( ( rule__QualifiedName__Group_2_1__0 )* ) )
            // InternalFortXTrans.g:2983:1: ( ( rule__QualifiedName__Group_2_1__0 )* )
            {
            // InternalFortXTrans.g:2983:1: ( ( rule__QualifiedName__Group_2_1__0 )* )
            // InternalFortXTrans.g:2984:2: ( rule__QualifiedName__Group_2_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_2_1()); 
            // InternalFortXTrans.g:2985:2: ( rule__QualifiedName__Group_2_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==25) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalFortXTrans.g:2985:3: rule__QualifiedName__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__QualifiedName__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_2__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_2_1__0"
    // InternalFortXTrans.g:2994:1: rule__QualifiedName__Group_2_1__0 : rule__QualifiedName__Group_2_1__0__Impl rule__QualifiedName__Group_2_1__1 ;
    public final void rule__QualifiedName__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2998:1: ( rule__QualifiedName__Group_2_1__0__Impl rule__QualifiedName__Group_2_1__1 )
            // InternalFortXTrans.g:2999:2: rule__QualifiedName__Group_2_1__0__Impl rule__QualifiedName__Group_2_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_2_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_2_1__0"


    // $ANTLR start "rule__QualifiedName__Group_2_1__0__Impl"
    // InternalFortXTrans.g:3006:1: rule__QualifiedName__Group_2_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3010:1: ( ( '.' ) )
            // InternalFortXTrans.g:3011:1: ( '.' )
            {
            // InternalFortXTrans.g:3011:1: ( '.' )
            // InternalFortXTrans.g:3012:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_2_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_2_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_2_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_2_1__1"
    // InternalFortXTrans.g:3021:1: rule__QualifiedName__Group_2_1__1 : rule__QualifiedName__Group_2_1__1__Impl ;
    public final void rule__QualifiedName__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3025:1: ( rule__QualifiedName__Group_2_1__1__Impl )
            // InternalFortXTrans.g:3026:2: rule__QualifiedName__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_2_1__1"


    // $ANTLR start "rule__QualifiedName__Group_2_1__1__Impl"
    // InternalFortXTrans.g:3032:1: rule__QualifiedName__Group_2_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3036:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3037:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3037:1: ( RULE_ID )
            // InternalFortXTrans.g:3038:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_2_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_2_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_2_1__1__Impl"


    // $ANTLR start "rule__APIName__Group_0__0"
    // InternalFortXTrans.g:3048:1: rule__APIName__Group_0__0 : rule__APIName__Group_0__0__Impl rule__APIName__Group_0__1 ;
    public final void rule__APIName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3052:1: ( rule__APIName__Group_0__0__Impl rule__APIName__Group_0__1 )
            // InternalFortXTrans.g:3053:2: rule__APIName__Group_0__0__Impl rule__APIName__Group_0__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalFortXTrans.g:3060:1: rule__APIName__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3064:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3065:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3065:1: ( RULE_ID )
            // InternalFortXTrans.g:3066:2: RULE_ID
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
    // InternalFortXTrans.g:3075:1: rule__APIName__Group_0__1 : rule__APIName__Group_0__1__Impl ;
    public final void rule__APIName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3079:1: ( rule__APIName__Group_0__1__Impl )
            // InternalFortXTrans.g:3080:2: rule__APIName__Group_0__1__Impl
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
    // InternalFortXTrans.g:3086:1: rule__APIName__Group_0__1__Impl : ( RULE_DOTS ) ;
    public final void rule__APIName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3090:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:3091:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:3091:1: ( RULE_DOTS )
            // InternalFortXTrans.g:3092:2: RULE_DOTS
            {
             before(grammarAccess.getAPINameAccess().getDOTSTerminalRuleCall_0_1()); 
            match(input,RULE_DOTS,FOLLOW_2); 
             after(grammarAccess.getAPINameAccess().getDOTSTerminalRuleCall_0_1()); 

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
    // InternalFortXTrans.g:3102:1: rule__APIName__Group_1__0 : rule__APIName__Group_1__0__Impl rule__APIName__Group_1__1 ;
    public final void rule__APIName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3106:1: ( rule__APIName__Group_1__0__Impl rule__APIName__Group_1__1 )
            // InternalFortXTrans.g:3107:2: rule__APIName__Group_1__0__Impl rule__APIName__Group_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalFortXTrans.g:3114:1: rule__APIName__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3118:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3119:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3119:1: ( RULE_ID )
            // InternalFortXTrans.g:3120:2: RULE_ID
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
    // InternalFortXTrans.g:3129:1: rule__APIName__Group_1__1 : rule__APIName__Group_1__1__Impl rule__APIName__Group_1__2 ;
    public final void rule__APIName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3133:1: ( rule__APIName__Group_1__1__Impl rule__APIName__Group_1__2 )
            // InternalFortXTrans.g:3134:2: rule__APIName__Group_1__1__Impl rule__APIName__Group_1__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalFortXTrans.g:3141:1: rule__APIName__Group_1__1__Impl : ( ( rule__APIName__Group_1_1__0 )* ) ;
    public final void rule__APIName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3145:1: ( ( ( rule__APIName__Group_1_1__0 )* ) )
            // InternalFortXTrans.g:3146:1: ( ( rule__APIName__Group_1_1__0 )* )
            {
            // InternalFortXTrans.g:3146:1: ( ( rule__APIName__Group_1_1__0 )* )
            // InternalFortXTrans.g:3147:2: ( rule__APIName__Group_1_1__0 )*
            {
             before(grammarAccess.getAPINameAccess().getGroup_1_1()); 
            // InternalFortXTrans.g:3148:2: ( rule__APIName__Group_1_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==25) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalFortXTrans.g:3148:3: rule__APIName__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__APIName__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalFortXTrans.g:3156:1: rule__APIName__Group_1__2 : rule__APIName__Group_1__2__Impl ;
    public final void rule__APIName__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3160:1: ( rule__APIName__Group_1__2__Impl )
            // InternalFortXTrans.g:3161:2: rule__APIName__Group_1__2__Impl
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
    // InternalFortXTrans.g:3167:1: rule__APIName__Group_1__2__Impl : ( RULE_DOTS ) ;
    public final void rule__APIName__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3171:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:3172:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:3172:1: ( RULE_DOTS )
            // InternalFortXTrans.g:3173:2: RULE_DOTS
            {
             before(grammarAccess.getAPINameAccess().getDOTSTerminalRuleCall_1_2()); 
            match(input,RULE_DOTS,FOLLOW_2); 
             after(grammarAccess.getAPINameAccess().getDOTSTerminalRuleCall_1_2()); 

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
    // InternalFortXTrans.g:3183:1: rule__APIName__Group_1_1__0 : rule__APIName__Group_1_1__0__Impl rule__APIName__Group_1_1__1 ;
    public final void rule__APIName__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3187:1: ( rule__APIName__Group_1_1__0__Impl rule__APIName__Group_1_1__1 )
            // InternalFortXTrans.g:3188:2: rule__APIName__Group_1_1__0__Impl rule__APIName__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalFortXTrans.g:3195:1: rule__APIName__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__APIName__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3199:1: ( ( '.' ) )
            // InternalFortXTrans.g:3200:1: ( '.' )
            {
            // InternalFortXTrans.g:3200:1: ( '.' )
            // InternalFortXTrans.g:3201:2: '.'
            {
             before(grammarAccess.getAPINameAccess().getFullStopKeyword_1_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalFortXTrans.g:3210:1: rule__APIName__Group_1_1__1 : rule__APIName__Group_1_1__1__Impl ;
    public final void rule__APIName__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3214:1: ( rule__APIName__Group_1_1__1__Impl )
            // InternalFortXTrans.g:3215:2: rule__APIName__Group_1_1__1__Impl
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
    // InternalFortXTrans.g:3221:1: rule__APIName__Group_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3225:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3226:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3226:1: ( RULE_ID )
            // InternalFortXTrans.g:3227:2: RULE_ID
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
    // InternalFortXTrans.g:3237:1: rule__APIName__Group_2__0 : rule__APIName__Group_2__0__Impl rule__APIName__Group_2__1 ;
    public final void rule__APIName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3241:1: ( rule__APIName__Group_2__0__Impl rule__APIName__Group_2__1 )
            // InternalFortXTrans.g:3242:2: rule__APIName__Group_2__0__Impl rule__APIName__Group_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalFortXTrans.g:3249:1: rule__APIName__Group_2__0__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3253:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3254:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3254:1: ( RULE_ID )
            // InternalFortXTrans.g:3255:2: RULE_ID
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
    // InternalFortXTrans.g:3264:1: rule__APIName__Group_2__1 : rule__APIName__Group_2__1__Impl ;
    public final void rule__APIName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3268:1: ( rule__APIName__Group_2__1__Impl )
            // InternalFortXTrans.g:3269:2: rule__APIName__Group_2__1__Impl
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
    // InternalFortXTrans.g:3275:1: rule__APIName__Group_2__1__Impl : ( ( rule__APIName__Group_2_1__0 )* ) ;
    public final void rule__APIName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3279:1: ( ( ( rule__APIName__Group_2_1__0 )* ) )
            // InternalFortXTrans.g:3280:1: ( ( rule__APIName__Group_2_1__0 )* )
            {
            // InternalFortXTrans.g:3280:1: ( ( rule__APIName__Group_2_1__0 )* )
            // InternalFortXTrans.g:3281:2: ( rule__APIName__Group_2_1__0 )*
            {
             before(grammarAccess.getAPINameAccess().getGroup_2_1()); 
            // InternalFortXTrans.g:3282:2: ( rule__APIName__Group_2_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==25) ) {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2==RULE_ID) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalFortXTrans.g:3282:3: rule__APIName__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__APIName__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalFortXTrans.g:3291:1: rule__APIName__Group_2_1__0 : rule__APIName__Group_2_1__0__Impl rule__APIName__Group_2_1__1 ;
    public final void rule__APIName__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3295:1: ( rule__APIName__Group_2_1__0__Impl rule__APIName__Group_2_1__1 )
            // InternalFortXTrans.g:3296:2: rule__APIName__Group_2_1__0__Impl rule__APIName__Group_2_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalFortXTrans.g:3303:1: rule__APIName__Group_2_1__0__Impl : ( '.' ) ;
    public final void rule__APIName__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3307:1: ( ( '.' ) )
            // InternalFortXTrans.g:3308:1: ( '.' )
            {
            // InternalFortXTrans.g:3308:1: ( '.' )
            // InternalFortXTrans.g:3309:2: '.'
            {
             before(grammarAccess.getAPINameAccess().getFullStopKeyword_2_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalFortXTrans.g:3318:1: rule__APIName__Group_2_1__1 : rule__APIName__Group_2_1__1__Impl ;
    public final void rule__APIName__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3322:1: ( rule__APIName__Group_2_1__1__Impl )
            // InternalFortXTrans.g:3323:2: rule__APIName__Group_2_1__1__Impl
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
    // InternalFortXTrans.g:3329:1: rule__APIName__Group_2_1__1__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3333:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3334:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3334:1: ( RULE_ID )
            // InternalFortXTrans.g:3335:2: RULE_ID
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
    // InternalFortXTrans.g:3345:1: rule__SimpleNames__Group_1__0 : rule__SimpleNames__Group_1__0__Impl rule__SimpleNames__Group_1__1 ;
    public final void rule__SimpleNames__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3349:1: ( rule__SimpleNames__Group_1__0__Impl rule__SimpleNames__Group_1__1 )
            // InternalFortXTrans.g:3350:2: rule__SimpleNames__Group_1__0__Impl rule__SimpleNames__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalFortXTrans.g:3357:1: rule__SimpleNames__Group_1__0__Impl : ( ( rule__SimpleNames__BrackAssignment_1_0 ) ) ;
    public final void rule__SimpleNames__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3361:1: ( ( ( rule__SimpleNames__BrackAssignment_1_0 ) ) )
            // InternalFortXTrans.g:3362:1: ( ( rule__SimpleNames__BrackAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:3362:1: ( ( rule__SimpleNames__BrackAssignment_1_0 ) )
            // InternalFortXTrans.g:3363:2: ( rule__SimpleNames__BrackAssignment_1_0 )
            {
             before(grammarAccess.getSimpleNamesAccess().getBrackAssignment_1_0()); 
            // InternalFortXTrans.g:3364:2: ( rule__SimpleNames__BrackAssignment_1_0 )
            // InternalFortXTrans.g:3364:3: rule__SimpleNames__BrackAssignment_1_0
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
    // InternalFortXTrans.g:3372:1: rule__SimpleNames__Group_1__1 : rule__SimpleNames__Group_1__1__Impl rule__SimpleNames__Group_1__2 ;
    public final void rule__SimpleNames__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3376:1: ( rule__SimpleNames__Group_1__1__Impl rule__SimpleNames__Group_1__2 )
            // InternalFortXTrans.g:3377:2: rule__SimpleNames__Group_1__1__Impl rule__SimpleNames__Group_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalFortXTrans.g:3384:1: rule__SimpleNames__Group_1__1__Impl : ( ( rule__SimpleNames__NameListAssignment_1_1 ) ) ;
    public final void rule__SimpleNames__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3388:1: ( ( ( rule__SimpleNames__NameListAssignment_1_1 ) ) )
            // InternalFortXTrans.g:3389:1: ( ( rule__SimpleNames__NameListAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:3389:1: ( ( rule__SimpleNames__NameListAssignment_1_1 ) )
            // InternalFortXTrans.g:3390:2: ( rule__SimpleNames__NameListAssignment_1_1 )
            {
             before(grammarAccess.getSimpleNamesAccess().getNameListAssignment_1_1()); 
            // InternalFortXTrans.g:3391:2: ( rule__SimpleNames__NameListAssignment_1_1 )
            // InternalFortXTrans.g:3391:3: rule__SimpleNames__NameListAssignment_1_1
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
    // InternalFortXTrans.g:3399:1: rule__SimpleNames__Group_1__2 : rule__SimpleNames__Group_1__2__Impl rule__SimpleNames__Group_1__3 ;
    public final void rule__SimpleNames__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3403:1: ( rule__SimpleNames__Group_1__2__Impl rule__SimpleNames__Group_1__3 )
            // InternalFortXTrans.g:3404:2: rule__SimpleNames__Group_1__2__Impl rule__SimpleNames__Group_1__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalFortXTrans.g:3411:1: rule__SimpleNames__Group_1__2__Impl : ( ( rule__SimpleNames__Group_1_2__0 )* ) ;
    public final void rule__SimpleNames__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3415:1: ( ( ( rule__SimpleNames__Group_1_2__0 )* ) )
            // InternalFortXTrans.g:3416:1: ( ( rule__SimpleNames__Group_1_2__0 )* )
            {
            // InternalFortXTrans.g:3416:1: ( ( rule__SimpleNames__Group_1_2__0 )* )
            // InternalFortXTrans.g:3417:2: ( rule__SimpleNames__Group_1_2__0 )*
            {
             before(grammarAccess.getSimpleNamesAccess().getGroup_1_2()); 
            // InternalFortXTrans.g:3418:2: ( rule__SimpleNames__Group_1_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==24) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalFortXTrans.g:3418:3: rule__SimpleNames__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__SimpleNames__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalFortXTrans.g:3426:1: rule__SimpleNames__Group_1__3 : rule__SimpleNames__Group_1__3__Impl ;
    public final void rule__SimpleNames__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3430:1: ( rule__SimpleNames__Group_1__3__Impl )
            // InternalFortXTrans.g:3431:2: rule__SimpleNames__Group_1__3__Impl
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
    // InternalFortXTrans.g:3437:1: rule__SimpleNames__Group_1__3__Impl : ( '}' ) ;
    public final void rule__SimpleNames__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3441:1: ( ( '}' ) )
            // InternalFortXTrans.g:3442:1: ( '}' )
            {
            // InternalFortXTrans.g:3442:1: ( '}' )
            // InternalFortXTrans.g:3443:2: '}'
            {
             before(grammarAccess.getSimpleNamesAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalFortXTrans.g:3453:1: rule__SimpleNames__Group_1_2__0 : rule__SimpleNames__Group_1_2__0__Impl rule__SimpleNames__Group_1_2__1 ;
    public final void rule__SimpleNames__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3457:1: ( rule__SimpleNames__Group_1_2__0__Impl rule__SimpleNames__Group_1_2__1 )
            // InternalFortXTrans.g:3458:2: rule__SimpleNames__Group_1_2__0__Impl rule__SimpleNames__Group_1_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalFortXTrans.g:3465:1: rule__SimpleNames__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__SimpleNames__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3469:1: ( ( ',' ) )
            // InternalFortXTrans.g:3470:1: ( ',' )
            {
            // InternalFortXTrans.g:3470:1: ( ',' )
            // InternalFortXTrans.g:3471:2: ','
            {
             before(grammarAccess.getSimpleNamesAccess().getCommaKeyword_1_2_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalFortXTrans.g:3480:1: rule__SimpleNames__Group_1_2__1 : rule__SimpleNames__Group_1_2__1__Impl ;
    public final void rule__SimpleNames__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3484:1: ( rule__SimpleNames__Group_1_2__1__Impl )
            // InternalFortXTrans.g:3485:2: rule__SimpleNames__Group_1_2__1__Impl
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
    // InternalFortXTrans.g:3491:1: rule__SimpleNames__Group_1_2__1__Impl : ( ( rule__SimpleNames__NameListAssignment_1_2_1 ) ) ;
    public final void rule__SimpleNames__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3495:1: ( ( ( rule__SimpleNames__NameListAssignment_1_2_1 ) ) )
            // InternalFortXTrans.g:3496:1: ( ( rule__SimpleNames__NameListAssignment_1_2_1 ) )
            {
            // InternalFortXTrans.g:3496:1: ( ( rule__SimpleNames__NameListAssignment_1_2_1 ) )
            // InternalFortXTrans.g:3497:2: ( rule__SimpleNames__NameListAssignment_1_2_1 )
            {
             before(grammarAccess.getSimpleNamesAccess().getNameListAssignment_1_2_1()); 
            // InternalFortXTrans.g:3498:2: ( rule__SimpleNames__NameListAssignment_1_2_1 )
            // InternalFortXTrans.g:3498:3: rule__SimpleNames__NameListAssignment_1_2_1
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
    // InternalFortXTrans.g:3507:1: rule__AliasedSimpleName__Group__0 : rule__AliasedSimpleName__Group__0__Impl rule__AliasedSimpleName__Group__1 ;
    public final void rule__AliasedSimpleName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3511:1: ( rule__AliasedSimpleName__Group__0__Impl rule__AliasedSimpleName__Group__1 )
            // InternalFortXTrans.g:3512:2: rule__AliasedSimpleName__Group__0__Impl rule__AliasedSimpleName__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalFortXTrans.g:3519:1: rule__AliasedSimpleName__Group__0__Impl : ( ( rule__AliasedSimpleName__OrigAssignment_0 ) ) ;
    public final void rule__AliasedSimpleName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3523:1: ( ( ( rule__AliasedSimpleName__OrigAssignment_0 ) ) )
            // InternalFortXTrans.g:3524:1: ( ( rule__AliasedSimpleName__OrigAssignment_0 ) )
            {
            // InternalFortXTrans.g:3524:1: ( ( rule__AliasedSimpleName__OrigAssignment_0 ) )
            // InternalFortXTrans.g:3525:2: ( rule__AliasedSimpleName__OrigAssignment_0 )
            {
             before(grammarAccess.getAliasedSimpleNameAccess().getOrigAssignment_0()); 
            // InternalFortXTrans.g:3526:2: ( rule__AliasedSimpleName__OrigAssignment_0 )
            // InternalFortXTrans.g:3526:3: rule__AliasedSimpleName__OrigAssignment_0
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
    // InternalFortXTrans.g:3534:1: rule__AliasedSimpleName__Group__1 : rule__AliasedSimpleName__Group__1__Impl ;
    public final void rule__AliasedSimpleName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3538:1: ( rule__AliasedSimpleName__Group__1__Impl )
            // InternalFortXTrans.g:3539:2: rule__AliasedSimpleName__Group__1__Impl
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
    // InternalFortXTrans.g:3545:1: rule__AliasedSimpleName__Group__1__Impl : ( ( rule__AliasedSimpleName__Group_1__0 )? ) ;
    public final void rule__AliasedSimpleName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3549:1: ( ( ( rule__AliasedSimpleName__Group_1__0 )? ) )
            // InternalFortXTrans.g:3550:1: ( ( rule__AliasedSimpleName__Group_1__0 )? )
            {
            // InternalFortXTrans.g:3550:1: ( ( rule__AliasedSimpleName__Group_1__0 )? )
            // InternalFortXTrans.g:3551:2: ( rule__AliasedSimpleName__Group_1__0 )?
            {
             before(grammarAccess.getAliasedSimpleNameAccess().getGroup_1()); 
            // InternalFortXTrans.g:3552:2: ( rule__AliasedSimpleName__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalFortXTrans.g:3552:3: rule__AliasedSimpleName__Group_1__0
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
    // InternalFortXTrans.g:3561:1: rule__AliasedSimpleName__Group_1__0 : rule__AliasedSimpleName__Group_1__0__Impl rule__AliasedSimpleName__Group_1__1 ;
    public final void rule__AliasedSimpleName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3565:1: ( rule__AliasedSimpleName__Group_1__0__Impl rule__AliasedSimpleName__Group_1__1 )
            // InternalFortXTrans.g:3566:2: rule__AliasedSimpleName__Group_1__0__Impl rule__AliasedSimpleName__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalFortXTrans.g:3573:1: rule__AliasedSimpleName__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__AliasedSimpleName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3577:1: ( ( 'as' ) )
            // InternalFortXTrans.g:3578:1: ( 'as' )
            {
            // InternalFortXTrans.g:3578:1: ( 'as' )
            // InternalFortXTrans.g:3579:2: 'as'
            {
             before(grammarAccess.getAliasedSimpleNameAccess().getAsKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalFortXTrans.g:3588:1: rule__AliasedSimpleName__Group_1__1 : rule__AliasedSimpleName__Group_1__1__Impl ;
    public final void rule__AliasedSimpleName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3592:1: ( rule__AliasedSimpleName__Group_1__1__Impl )
            // InternalFortXTrans.g:3593:2: rule__AliasedSimpleName__Group_1__1__Impl
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
    // InternalFortXTrans.g:3599:1: rule__AliasedSimpleName__Group_1__1__Impl : ( ( rule__AliasedSimpleName__AsNameAssignment_1_1 ) ) ;
    public final void rule__AliasedSimpleName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3603:1: ( ( ( rule__AliasedSimpleName__AsNameAssignment_1_1 ) ) )
            // InternalFortXTrans.g:3604:1: ( ( rule__AliasedSimpleName__AsNameAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:3604:1: ( ( rule__AliasedSimpleName__AsNameAssignment_1_1 ) )
            // InternalFortXTrans.g:3605:2: ( rule__AliasedSimpleName__AsNameAssignment_1_1 )
            {
             before(grammarAccess.getAliasedSimpleNameAccess().getAsNameAssignment_1_1()); 
            // InternalFortXTrans.g:3606:2: ( rule__AliasedSimpleName__AsNameAssignment_1_1 )
            // InternalFortXTrans.g:3606:3: rule__AliasedSimpleName__AsNameAssignment_1_1
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
    // InternalFortXTrans.g:3615:1: rule__AliasedAPINames__Group_1__0 : rule__AliasedAPINames__Group_1__0__Impl rule__AliasedAPINames__Group_1__1 ;
    public final void rule__AliasedAPINames__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3619:1: ( rule__AliasedAPINames__Group_1__0__Impl rule__AliasedAPINames__Group_1__1 )
            // InternalFortXTrans.g:3620:2: rule__AliasedAPINames__Group_1__0__Impl rule__AliasedAPINames__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalFortXTrans.g:3627:1: rule__AliasedAPINames__Group_1__0__Impl : ( ( rule__AliasedAPINames__BrackAssignment_1_0 ) ) ;
    public final void rule__AliasedAPINames__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3631:1: ( ( ( rule__AliasedAPINames__BrackAssignment_1_0 ) ) )
            // InternalFortXTrans.g:3632:1: ( ( rule__AliasedAPINames__BrackAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:3632:1: ( ( rule__AliasedAPINames__BrackAssignment_1_0 ) )
            // InternalFortXTrans.g:3633:2: ( rule__AliasedAPINames__BrackAssignment_1_0 )
            {
             before(grammarAccess.getAliasedAPINamesAccess().getBrackAssignment_1_0()); 
            // InternalFortXTrans.g:3634:2: ( rule__AliasedAPINames__BrackAssignment_1_0 )
            // InternalFortXTrans.g:3634:3: rule__AliasedAPINames__BrackAssignment_1_0
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
    // InternalFortXTrans.g:3642:1: rule__AliasedAPINames__Group_1__1 : rule__AliasedAPINames__Group_1__1__Impl rule__AliasedAPINames__Group_1__2 ;
    public final void rule__AliasedAPINames__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3646:1: ( rule__AliasedAPINames__Group_1__1__Impl rule__AliasedAPINames__Group_1__2 )
            // InternalFortXTrans.g:3647:2: rule__AliasedAPINames__Group_1__1__Impl rule__AliasedAPINames__Group_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalFortXTrans.g:3654:1: rule__AliasedAPINames__Group_1__1__Impl : ( ( rule__AliasedAPINames__NameListAssignment_1_1 ) ) ;
    public final void rule__AliasedAPINames__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3658:1: ( ( ( rule__AliasedAPINames__NameListAssignment_1_1 ) ) )
            // InternalFortXTrans.g:3659:1: ( ( rule__AliasedAPINames__NameListAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:3659:1: ( ( rule__AliasedAPINames__NameListAssignment_1_1 ) )
            // InternalFortXTrans.g:3660:2: ( rule__AliasedAPINames__NameListAssignment_1_1 )
            {
             before(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_1_1()); 
            // InternalFortXTrans.g:3661:2: ( rule__AliasedAPINames__NameListAssignment_1_1 )
            // InternalFortXTrans.g:3661:3: rule__AliasedAPINames__NameListAssignment_1_1
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
    // InternalFortXTrans.g:3669:1: rule__AliasedAPINames__Group_1__2 : rule__AliasedAPINames__Group_1__2__Impl rule__AliasedAPINames__Group_1__3 ;
    public final void rule__AliasedAPINames__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3673:1: ( rule__AliasedAPINames__Group_1__2__Impl rule__AliasedAPINames__Group_1__3 )
            // InternalFortXTrans.g:3674:2: rule__AliasedAPINames__Group_1__2__Impl rule__AliasedAPINames__Group_1__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalFortXTrans.g:3681:1: rule__AliasedAPINames__Group_1__2__Impl : ( ( rule__AliasedAPINames__Group_1_2__0 )* ) ;
    public final void rule__AliasedAPINames__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3685:1: ( ( ( rule__AliasedAPINames__Group_1_2__0 )* ) )
            // InternalFortXTrans.g:3686:1: ( ( rule__AliasedAPINames__Group_1_2__0 )* )
            {
            // InternalFortXTrans.g:3686:1: ( ( rule__AliasedAPINames__Group_1_2__0 )* )
            // InternalFortXTrans.g:3687:2: ( rule__AliasedAPINames__Group_1_2__0 )*
            {
             before(grammarAccess.getAliasedAPINamesAccess().getGroup_1_2()); 
            // InternalFortXTrans.g:3688:2: ( rule__AliasedAPINames__Group_1_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==24) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalFortXTrans.g:3688:3: rule__AliasedAPINames__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__AliasedAPINames__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalFortXTrans.g:3696:1: rule__AliasedAPINames__Group_1__3 : rule__AliasedAPINames__Group_1__3__Impl ;
    public final void rule__AliasedAPINames__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3700:1: ( rule__AliasedAPINames__Group_1__3__Impl )
            // InternalFortXTrans.g:3701:2: rule__AliasedAPINames__Group_1__3__Impl
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
    // InternalFortXTrans.g:3707:1: rule__AliasedAPINames__Group_1__3__Impl : ( '}' ) ;
    public final void rule__AliasedAPINames__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3711:1: ( ( '}' ) )
            // InternalFortXTrans.g:3712:1: ( '}' )
            {
            // InternalFortXTrans.g:3712:1: ( '}' )
            // InternalFortXTrans.g:3713:2: '}'
            {
             before(grammarAccess.getAliasedAPINamesAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalFortXTrans.g:3723:1: rule__AliasedAPINames__Group_1_2__0 : rule__AliasedAPINames__Group_1_2__0__Impl rule__AliasedAPINames__Group_1_2__1 ;
    public final void rule__AliasedAPINames__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3727:1: ( rule__AliasedAPINames__Group_1_2__0__Impl rule__AliasedAPINames__Group_1_2__1 )
            // InternalFortXTrans.g:3728:2: rule__AliasedAPINames__Group_1_2__0__Impl rule__AliasedAPINames__Group_1_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalFortXTrans.g:3735:1: rule__AliasedAPINames__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__AliasedAPINames__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3739:1: ( ( ',' ) )
            // InternalFortXTrans.g:3740:1: ( ',' )
            {
            // InternalFortXTrans.g:3740:1: ( ',' )
            // InternalFortXTrans.g:3741:2: ','
            {
             before(grammarAccess.getAliasedAPINamesAccess().getCommaKeyword_1_2_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalFortXTrans.g:3750:1: rule__AliasedAPINames__Group_1_2__1 : rule__AliasedAPINames__Group_1_2__1__Impl ;
    public final void rule__AliasedAPINames__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3754:1: ( rule__AliasedAPINames__Group_1_2__1__Impl )
            // InternalFortXTrans.g:3755:2: rule__AliasedAPINames__Group_1_2__1__Impl
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
    // InternalFortXTrans.g:3761:1: rule__AliasedAPINames__Group_1_2__1__Impl : ( ( rule__AliasedAPINames__NameListAssignment_1_2_1 ) ) ;
    public final void rule__AliasedAPINames__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3765:1: ( ( ( rule__AliasedAPINames__NameListAssignment_1_2_1 ) ) )
            // InternalFortXTrans.g:3766:1: ( ( rule__AliasedAPINames__NameListAssignment_1_2_1 ) )
            {
            // InternalFortXTrans.g:3766:1: ( ( rule__AliasedAPINames__NameListAssignment_1_2_1 ) )
            // InternalFortXTrans.g:3767:2: ( rule__AliasedAPINames__NameListAssignment_1_2_1 )
            {
             before(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_1_2_1()); 
            // InternalFortXTrans.g:3768:2: ( rule__AliasedAPINames__NameListAssignment_1_2_1 )
            // InternalFortXTrans.g:3768:3: rule__AliasedAPINames__NameListAssignment_1_2_1
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
    // InternalFortXTrans.g:3777:1: rule__AliasedAPIName__Group__0 : rule__AliasedAPIName__Group__0__Impl rule__AliasedAPIName__Group__1 ;
    public final void rule__AliasedAPIName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3781:1: ( rule__AliasedAPIName__Group__0__Impl rule__AliasedAPIName__Group__1 )
            // InternalFortXTrans.g:3782:2: rule__AliasedAPIName__Group__0__Impl rule__AliasedAPIName__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalFortXTrans.g:3789:1: rule__AliasedAPIName__Group__0__Impl : ( ( rule__AliasedAPIName__OrigAssignment_0 ) ) ;
    public final void rule__AliasedAPIName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3793:1: ( ( ( rule__AliasedAPIName__OrigAssignment_0 ) ) )
            // InternalFortXTrans.g:3794:1: ( ( rule__AliasedAPIName__OrigAssignment_0 ) )
            {
            // InternalFortXTrans.g:3794:1: ( ( rule__AliasedAPIName__OrigAssignment_0 ) )
            // InternalFortXTrans.g:3795:2: ( rule__AliasedAPIName__OrigAssignment_0 )
            {
             before(grammarAccess.getAliasedAPINameAccess().getOrigAssignment_0()); 
            // InternalFortXTrans.g:3796:2: ( rule__AliasedAPIName__OrigAssignment_0 )
            // InternalFortXTrans.g:3796:3: rule__AliasedAPIName__OrigAssignment_0
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
    // InternalFortXTrans.g:3804:1: rule__AliasedAPIName__Group__1 : rule__AliasedAPIName__Group__1__Impl ;
    public final void rule__AliasedAPIName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3808:1: ( rule__AliasedAPIName__Group__1__Impl )
            // InternalFortXTrans.g:3809:2: rule__AliasedAPIName__Group__1__Impl
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
    // InternalFortXTrans.g:3815:1: rule__AliasedAPIName__Group__1__Impl : ( ( rule__AliasedAPIName__Group_1__0 )? ) ;
    public final void rule__AliasedAPIName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3819:1: ( ( ( rule__AliasedAPIName__Group_1__0 )? ) )
            // InternalFortXTrans.g:3820:1: ( ( rule__AliasedAPIName__Group_1__0 )? )
            {
            // InternalFortXTrans.g:3820:1: ( ( rule__AliasedAPIName__Group_1__0 )? )
            // InternalFortXTrans.g:3821:2: ( rule__AliasedAPIName__Group_1__0 )?
            {
             before(grammarAccess.getAliasedAPINameAccess().getGroup_1()); 
            // InternalFortXTrans.g:3822:2: ( rule__AliasedAPIName__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==27) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalFortXTrans.g:3822:3: rule__AliasedAPIName__Group_1__0
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
    // InternalFortXTrans.g:3831:1: rule__AliasedAPIName__Group_1__0 : rule__AliasedAPIName__Group_1__0__Impl rule__AliasedAPIName__Group_1__1 ;
    public final void rule__AliasedAPIName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3835:1: ( rule__AliasedAPIName__Group_1__0__Impl rule__AliasedAPIName__Group_1__1 )
            // InternalFortXTrans.g:3836:2: rule__AliasedAPIName__Group_1__0__Impl rule__AliasedAPIName__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalFortXTrans.g:3843:1: rule__AliasedAPIName__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__AliasedAPIName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3847:1: ( ( 'as' ) )
            // InternalFortXTrans.g:3848:1: ( 'as' )
            {
            // InternalFortXTrans.g:3848:1: ( 'as' )
            // InternalFortXTrans.g:3849:2: 'as'
            {
             before(grammarAccess.getAliasedAPINameAccess().getAsKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalFortXTrans.g:3858:1: rule__AliasedAPIName__Group_1__1 : rule__AliasedAPIName__Group_1__1__Impl ;
    public final void rule__AliasedAPIName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3862:1: ( rule__AliasedAPIName__Group_1__1__Impl )
            // InternalFortXTrans.g:3863:2: rule__AliasedAPIName__Group_1__1__Impl
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
    // InternalFortXTrans.g:3869:1: rule__AliasedAPIName__Group_1__1__Impl : ( ( rule__AliasedAPIName__AsNameAssignment_1_1 ) ) ;
    public final void rule__AliasedAPIName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3873:1: ( ( ( rule__AliasedAPIName__AsNameAssignment_1_1 ) ) )
            // InternalFortXTrans.g:3874:1: ( ( rule__AliasedAPIName__AsNameAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:3874:1: ( ( rule__AliasedAPIName__AsNameAssignment_1_1 ) )
            // InternalFortXTrans.g:3875:2: ( rule__AliasedAPIName__AsNameAssignment_1_1 )
            {
             before(grammarAccess.getAliasedAPINameAccess().getAsNameAssignment_1_1()); 
            // InternalFortXTrans.g:3876:2: ( rule__AliasedAPIName__AsNameAssignment_1_1 )
            // InternalFortXTrans.g:3876:3: rule__AliasedAPIName__AsNameAssignment_1_1
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


    // $ANTLR start "rule__ValParam__Group_1__0"
    // InternalFortXTrans.g:3885:1: rule__ValParam__Group_1__0 : rule__ValParam__Group_1__0__Impl rule__ValParam__Group_1__1 ;
    public final void rule__ValParam__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3889:1: ( rule__ValParam__Group_1__0__Impl rule__ValParam__Group_1__1 )
            // InternalFortXTrans.g:3890:2: rule__ValParam__Group_1__0__Impl rule__ValParam__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__ValParam__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValParam__Group_1__1();

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
    // $ANTLR end "rule__ValParam__Group_1__0"


    // $ANTLR start "rule__ValParam__Group_1__0__Impl"
    // InternalFortXTrans.g:3897:1: rule__ValParam__Group_1__0__Impl : ( ( rule__ValParam__BrackAssignment_1_0 ) ) ;
    public final void rule__ValParam__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3901:1: ( ( ( rule__ValParam__BrackAssignment_1_0 ) ) )
            // InternalFortXTrans.g:3902:1: ( ( rule__ValParam__BrackAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:3902:1: ( ( rule__ValParam__BrackAssignment_1_0 ) )
            // InternalFortXTrans.g:3903:2: ( rule__ValParam__BrackAssignment_1_0 )
            {
             before(grammarAccess.getValParamAccess().getBrackAssignment_1_0()); 
            // InternalFortXTrans.g:3904:2: ( rule__ValParam__BrackAssignment_1_0 )
            // InternalFortXTrans.g:3904:3: rule__ValParam__BrackAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ValParam__BrackAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getValParamAccess().getBrackAssignment_1_0()); 

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
    // $ANTLR end "rule__ValParam__Group_1__0__Impl"


    // $ANTLR start "rule__ValParam__Group_1__1"
    // InternalFortXTrans.g:3912:1: rule__ValParam__Group_1__1 : rule__ValParam__Group_1__1__Impl rule__ValParam__Group_1__2 ;
    public final void rule__ValParam__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3916:1: ( rule__ValParam__Group_1__1__Impl rule__ValParam__Group_1__2 )
            // InternalFortXTrans.g:3917:2: rule__ValParam__Group_1__1__Impl rule__ValParam__Group_1__2
            {
            pushFollow(FOLLOW_23);
            rule__ValParam__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValParam__Group_1__2();

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
    // $ANTLR end "rule__ValParam__Group_1__1"


    // $ANTLR start "rule__ValParam__Group_1__1__Impl"
    // InternalFortXTrans.g:3924:1: rule__ValParam__Group_1__1__Impl : ( ( rule__ValParam__Group_1_1__0 )? ) ;
    public final void rule__ValParam__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3928:1: ( ( ( rule__ValParam__Group_1_1__0 )? ) )
            // InternalFortXTrans.g:3929:1: ( ( rule__ValParam__Group_1_1__0 )? )
            {
            // InternalFortXTrans.g:3929:1: ( ( rule__ValParam__Group_1_1__0 )? )
            // InternalFortXTrans.g:3930:2: ( rule__ValParam__Group_1_1__0 )?
            {
             before(grammarAccess.getValParamAccess().getGroup_1_1()); 
            // InternalFortXTrans.g:3931:2: ( rule__ValParam__Group_1_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID||LA36_0==19) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalFortXTrans.g:3931:3: rule__ValParam__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValParam__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValParamAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__ValParam__Group_1__1__Impl"


    // $ANTLR start "rule__ValParam__Group_1__2"
    // InternalFortXTrans.g:3939:1: rule__ValParam__Group_1__2 : rule__ValParam__Group_1__2__Impl ;
    public final void rule__ValParam__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3943:1: ( rule__ValParam__Group_1__2__Impl )
            // InternalFortXTrans.g:3944:2: rule__ValParam__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValParam__Group_1__2__Impl();

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
    // $ANTLR end "rule__ValParam__Group_1__2"


    // $ANTLR start "rule__ValParam__Group_1__2__Impl"
    // InternalFortXTrans.g:3950:1: rule__ValParam__Group_1__2__Impl : ( ')' ) ;
    public final void rule__ValParam__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3954:1: ( ( ')' ) )
            // InternalFortXTrans.g:3955:1: ( ')' )
            {
            // InternalFortXTrans.g:3955:1: ( ')' )
            // InternalFortXTrans.g:3956:2: ')'
            {
             before(grammarAccess.getValParamAccess().getRightParenthesisKeyword_1_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getValParamAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__ValParam__Group_1__2__Impl"


    // $ANTLR start "rule__ValParam__Group_1_1__0"
    // InternalFortXTrans.g:3966:1: rule__ValParam__Group_1_1__0 : rule__ValParam__Group_1_1__0__Impl rule__ValParam__Group_1_1__1 ;
    public final void rule__ValParam__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3970:1: ( rule__ValParam__Group_1_1__0__Impl rule__ValParam__Group_1_1__1 )
            // InternalFortXTrans.g:3971:2: rule__ValParam__Group_1_1__0__Impl rule__ValParam__Group_1_1__1
            {
            pushFollow(FOLLOW_24);
            rule__ValParam__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValParam__Group_1_1__1();

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
    // $ANTLR end "rule__ValParam__Group_1_1__0"


    // $ANTLR start "rule__ValParam__Group_1_1__0__Impl"
    // InternalFortXTrans.g:3978:1: rule__ValParam__Group_1_1__0__Impl : ( ( rule__ValParam__ParamsAssignment_1_1_0 ) ) ;
    public final void rule__ValParam__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3982:1: ( ( ( rule__ValParam__ParamsAssignment_1_1_0 ) ) )
            // InternalFortXTrans.g:3983:1: ( ( rule__ValParam__ParamsAssignment_1_1_0 ) )
            {
            // InternalFortXTrans.g:3983:1: ( ( rule__ValParam__ParamsAssignment_1_1_0 ) )
            // InternalFortXTrans.g:3984:2: ( rule__ValParam__ParamsAssignment_1_1_0 )
            {
             before(grammarAccess.getValParamAccess().getParamsAssignment_1_1_0()); 
            // InternalFortXTrans.g:3985:2: ( rule__ValParam__ParamsAssignment_1_1_0 )
            // InternalFortXTrans.g:3985:3: rule__ValParam__ParamsAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ValParam__ParamsAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getValParamAccess().getParamsAssignment_1_1_0()); 

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
    // $ANTLR end "rule__ValParam__Group_1_1__0__Impl"


    // $ANTLR start "rule__ValParam__Group_1_1__1"
    // InternalFortXTrans.g:3993:1: rule__ValParam__Group_1_1__1 : rule__ValParam__Group_1_1__1__Impl ;
    public final void rule__ValParam__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3997:1: ( rule__ValParam__Group_1_1__1__Impl )
            // InternalFortXTrans.g:3998:2: rule__ValParam__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValParam__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__ValParam__Group_1_1__1"


    // $ANTLR start "rule__ValParam__Group_1_1__1__Impl"
    // InternalFortXTrans.g:4004:1: rule__ValParam__Group_1_1__1__Impl : ( ( rule__ValParam__Group_1_1_1__0 )* ) ;
    public final void rule__ValParam__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4008:1: ( ( ( rule__ValParam__Group_1_1_1__0 )* ) )
            // InternalFortXTrans.g:4009:1: ( ( rule__ValParam__Group_1_1_1__0 )* )
            {
            // InternalFortXTrans.g:4009:1: ( ( rule__ValParam__Group_1_1_1__0 )* )
            // InternalFortXTrans.g:4010:2: ( rule__ValParam__Group_1_1_1__0 )*
            {
             before(grammarAccess.getValParamAccess().getGroup_1_1_1()); 
            // InternalFortXTrans.g:4011:2: ( rule__ValParam__Group_1_1_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==24) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalFortXTrans.g:4011:3: rule__ValParam__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ValParam__Group_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getValParamAccess().getGroup_1_1_1()); 

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
    // $ANTLR end "rule__ValParam__Group_1_1__1__Impl"


    // $ANTLR start "rule__ValParam__Group_1_1_1__0"
    // InternalFortXTrans.g:4020:1: rule__ValParam__Group_1_1_1__0 : rule__ValParam__Group_1_1_1__0__Impl rule__ValParam__Group_1_1_1__1 ;
    public final void rule__ValParam__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4024:1: ( rule__ValParam__Group_1_1_1__0__Impl rule__ValParam__Group_1_1_1__1 )
            // InternalFortXTrans.g:4025:2: rule__ValParam__Group_1_1_1__0__Impl rule__ValParam__Group_1_1_1__1
            {
            pushFollow(FOLLOW_25);
            rule__ValParam__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValParam__Group_1_1_1__1();

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
    // $ANTLR end "rule__ValParam__Group_1_1_1__0"


    // $ANTLR start "rule__ValParam__Group_1_1_1__0__Impl"
    // InternalFortXTrans.g:4032:1: rule__ValParam__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__ValParam__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4036:1: ( ( ',' ) )
            // InternalFortXTrans.g:4037:1: ( ',' )
            {
            // InternalFortXTrans.g:4037:1: ( ',' )
            // InternalFortXTrans.g:4038:2: ','
            {
             before(grammarAccess.getValParamAccess().getCommaKeyword_1_1_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getValParamAccess().getCommaKeyword_1_1_1_0()); 

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
    // $ANTLR end "rule__ValParam__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__ValParam__Group_1_1_1__1"
    // InternalFortXTrans.g:4047:1: rule__ValParam__Group_1_1_1__1 : rule__ValParam__Group_1_1_1__1__Impl ;
    public final void rule__ValParam__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4051:1: ( rule__ValParam__Group_1_1_1__1__Impl )
            // InternalFortXTrans.g:4052:2: rule__ValParam__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValParam__Group_1_1_1__1__Impl();

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
    // $ANTLR end "rule__ValParam__Group_1_1_1__1"


    // $ANTLR start "rule__ValParam__Group_1_1_1__1__Impl"
    // InternalFortXTrans.g:4058:1: rule__ValParam__Group_1_1_1__1__Impl : ( ( rule__ValParam__ParamsAssignment_1_1_1_1 ) ) ;
    public final void rule__ValParam__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4062:1: ( ( ( rule__ValParam__ParamsAssignment_1_1_1_1 ) ) )
            // InternalFortXTrans.g:4063:1: ( ( rule__ValParam__ParamsAssignment_1_1_1_1 ) )
            {
            // InternalFortXTrans.g:4063:1: ( ( rule__ValParam__ParamsAssignment_1_1_1_1 ) )
            // InternalFortXTrans.g:4064:2: ( rule__ValParam__ParamsAssignment_1_1_1_1 )
            {
             before(grammarAccess.getValParamAccess().getParamsAssignment_1_1_1_1()); 
            // InternalFortXTrans.g:4065:2: ( rule__ValParam__ParamsAssignment_1_1_1_1 )
            // InternalFortXTrans.g:4065:3: rule__ValParam__ParamsAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ValParam__ParamsAssignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getValParamAccess().getParamsAssignment_1_1_1_1()); 

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
    // $ANTLR end "rule__ValParam__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__Param__Group__0"
    // InternalFortXTrans.g:4074:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4078:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // InternalFortXTrans.g:4079:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Param__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Param__Group__1();

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
    // $ANTLR end "rule__Param__Group__0"


    // $ANTLR start "rule__Param__Group__0__Impl"
    // InternalFortXTrans.g:4086:1: rule__Param__Group__0__Impl : ( ( rule__Param__BIdAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4090:1: ( ( ( rule__Param__BIdAssignment_0 ) ) )
            // InternalFortXTrans.g:4091:1: ( ( rule__Param__BIdAssignment_0 ) )
            {
            // InternalFortXTrans.g:4091:1: ( ( rule__Param__BIdAssignment_0 ) )
            // InternalFortXTrans.g:4092:2: ( rule__Param__BIdAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getBIdAssignment_0()); 
            // InternalFortXTrans.g:4093:2: ( rule__Param__BIdAssignment_0 )
            // InternalFortXTrans.g:4093:3: rule__Param__BIdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Param__BIdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getBIdAssignment_0()); 

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
    // $ANTLR end "rule__Param__Group__0__Impl"


    // $ANTLR start "rule__Param__Group__1"
    // InternalFortXTrans.g:4101:1: rule__Param__Group__1 : rule__Param__Group__1__Impl ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4105:1: ( rule__Param__Group__1__Impl )
            // InternalFortXTrans.g:4106:2: rule__Param__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__1__Impl();

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
    // $ANTLR end "rule__Param__Group__1"


    // $ANTLR start "rule__Param__Group__1__Impl"
    // InternalFortXTrans.g:4112:1: rule__Param__Group__1__Impl : ( ( rule__Param__IstypeAssignment_1 ) ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4116:1: ( ( ( rule__Param__IstypeAssignment_1 ) ) )
            // InternalFortXTrans.g:4117:1: ( ( rule__Param__IstypeAssignment_1 ) )
            {
            // InternalFortXTrans.g:4117:1: ( ( rule__Param__IstypeAssignment_1 ) )
            // InternalFortXTrans.g:4118:2: ( rule__Param__IstypeAssignment_1 )
            {
             before(grammarAccess.getParamAccess().getIstypeAssignment_1()); 
            // InternalFortXTrans.g:4119:2: ( rule__Param__IstypeAssignment_1 )
            // InternalFortXTrans.g:4119:3: rule__Param__IstypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Param__IstypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getIstypeAssignment_1()); 

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
    // $ANTLR end "rule__Param__Group__1__Impl"


    // $ANTLR start "rule__RetType__Group_0__0"
    // InternalFortXTrans.g:4128:1: rule__RetType__Group_0__0 : rule__RetType__Group_0__0__Impl rule__RetType__Group_0__1 ;
    public final void rule__RetType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4132:1: ( rule__RetType__Group_0__0__Impl rule__RetType__Group_0__1 )
            // InternalFortXTrans.g:4133:2: rule__RetType__Group_0__0__Impl rule__RetType__Group_0__1
            {
            pushFollow(FOLLOW_27);
            rule__RetType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RetType__Group_0__1();

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
    // $ANTLR end "rule__RetType__Group_0__0"


    // $ANTLR start "rule__RetType__Group_0__0__Impl"
    // InternalFortXTrans.g:4140:1: rule__RetType__Group_0__0__Impl : ( ':' ) ;
    public final void rule__RetType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4144:1: ( ( ':' ) )
            // InternalFortXTrans.g:4145:1: ( ':' )
            {
            // InternalFortXTrans.g:4145:1: ( ':' )
            // InternalFortXTrans.g:4146:2: ':'
            {
             before(grammarAccess.getRetTypeAccess().getColonKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRetTypeAccess().getColonKeyword_0_0()); 

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
    // $ANTLR end "rule__RetType__Group_0__0__Impl"


    // $ANTLR start "rule__RetType__Group_0__1"
    // InternalFortXTrans.g:4155:1: rule__RetType__Group_0__1 : rule__RetType__Group_0__1__Impl rule__RetType__Group_0__2 ;
    public final void rule__RetType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4159:1: ( rule__RetType__Group_0__1__Impl rule__RetType__Group_0__2 )
            // InternalFortXTrans.g:4160:2: rule__RetType__Group_0__1__Impl rule__RetType__Group_0__2
            {
            pushFollow(FOLLOW_28);
            rule__RetType__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RetType__Group_0__2();

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
    // $ANTLR end "rule__RetType__Group_0__1"


    // $ANTLR start "rule__RetType__Group_0__1__Impl"
    // InternalFortXTrans.g:4167:1: rule__RetType__Group_0__1__Impl : ( ( rule__RetType__EmptyAssignment_0_1 ) ) ;
    public final void rule__RetType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4171:1: ( ( ( rule__RetType__EmptyAssignment_0_1 ) ) )
            // InternalFortXTrans.g:4172:1: ( ( rule__RetType__EmptyAssignment_0_1 ) )
            {
            // InternalFortXTrans.g:4172:1: ( ( rule__RetType__EmptyAssignment_0_1 ) )
            // InternalFortXTrans.g:4173:2: ( rule__RetType__EmptyAssignment_0_1 )
            {
             before(grammarAccess.getRetTypeAccess().getEmptyAssignment_0_1()); 
            // InternalFortXTrans.g:4174:2: ( rule__RetType__EmptyAssignment_0_1 )
            // InternalFortXTrans.g:4174:3: rule__RetType__EmptyAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__RetType__EmptyAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRetTypeAccess().getEmptyAssignment_0_1()); 

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
    // $ANTLR end "rule__RetType__Group_0__1__Impl"


    // $ANTLR start "rule__RetType__Group_0__2"
    // InternalFortXTrans.g:4182:1: rule__RetType__Group_0__2 : rule__RetType__Group_0__2__Impl ;
    public final void rule__RetType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4186:1: ( rule__RetType__Group_0__2__Impl )
            // InternalFortXTrans.g:4187:2: rule__RetType__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RetType__Group_0__2__Impl();

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
    // $ANTLR end "rule__RetType__Group_0__2"


    // $ANTLR start "rule__RetType__Group_0__2__Impl"
    // InternalFortXTrans.g:4193:1: rule__RetType__Group_0__2__Impl : ( ')' ) ;
    public final void rule__RetType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4197:1: ( ( ')' ) )
            // InternalFortXTrans.g:4198:1: ( ')' )
            {
            // InternalFortXTrans.g:4198:1: ( ')' )
            // InternalFortXTrans.g:4199:2: ')'
            {
             before(grammarAccess.getRetTypeAccess().getRightParenthesisKeyword_0_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRetTypeAccess().getRightParenthesisKeyword_0_2()); 

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
    // $ANTLR end "rule__RetType__Group_0__2__Impl"


    // $ANTLR start "rule__RetType__Group_1__0"
    // InternalFortXTrans.g:4209:1: rule__RetType__Group_1__0 : rule__RetType__Group_1__0__Impl rule__RetType__Group_1__1 ;
    public final void rule__RetType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4213:1: ( rule__RetType__Group_1__0__Impl rule__RetType__Group_1__1 )
            // InternalFortXTrans.g:4214:2: rule__RetType__Group_1__0__Impl rule__RetType__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__RetType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RetType__Group_1__1();

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
    // $ANTLR end "rule__RetType__Group_1__0"


    // $ANTLR start "rule__RetType__Group_1__0__Impl"
    // InternalFortXTrans.g:4221:1: rule__RetType__Group_1__0__Impl : ( ':' ) ;
    public final void rule__RetType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4225:1: ( ( ':' ) )
            // InternalFortXTrans.g:4226:1: ( ':' )
            {
            // InternalFortXTrans.g:4226:1: ( ':' )
            // InternalFortXTrans.g:4227:2: ':'
            {
             before(grammarAccess.getRetTypeAccess().getColonKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRetTypeAccess().getColonKeyword_1_0()); 

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
    // $ANTLR end "rule__RetType__Group_1__0__Impl"


    // $ANTLR start "rule__RetType__Group_1__1"
    // InternalFortXTrans.g:4236:1: rule__RetType__Group_1__1 : rule__RetType__Group_1__1__Impl ;
    public final void rule__RetType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4240:1: ( rule__RetType__Group_1__1__Impl )
            // InternalFortXTrans.g:4241:2: rule__RetType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RetType__Group_1__1__Impl();

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
    // $ANTLR end "rule__RetType__Group_1__1"


    // $ANTLR start "rule__RetType__Group_1__1__Impl"
    // InternalFortXTrans.g:4247:1: rule__RetType__Group_1__1__Impl : ( ( rule__RetType__TypeAssignment_1_1 ) ) ;
    public final void rule__RetType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4251:1: ( ( ( rule__RetType__TypeAssignment_1_1 ) ) )
            // InternalFortXTrans.g:4252:1: ( ( rule__RetType__TypeAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:4252:1: ( ( rule__RetType__TypeAssignment_1_1 ) )
            // InternalFortXTrans.g:4253:2: ( rule__RetType__TypeAssignment_1_1 )
            {
             before(grammarAccess.getRetTypeAccess().getTypeAssignment_1_1()); 
            // InternalFortXTrans.g:4254:2: ( rule__RetType__TypeAssignment_1_1 )
            // InternalFortXTrans.g:4254:3: rule__RetType__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RetType__TypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRetTypeAccess().getTypeAssignment_1_1()); 

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
    // $ANTLR end "rule__RetType__Group_1__1__Impl"


    // $ANTLR start "rule__FnDecl__Group__0"
    // InternalFortXTrans.g:4263:1: rule__FnDecl__Group__0 : rule__FnDecl__Group__0__Impl rule__FnDecl__Group__1 ;
    public final void rule__FnDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4267:1: ( rule__FnDecl__Group__0__Impl rule__FnDecl__Group__1 )
            // InternalFortXTrans.g:4268:2: rule__FnDecl__Group__0__Impl rule__FnDecl__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__FnDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FnDecl__Group__1();

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
    // $ANTLR end "rule__FnDecl__Group__0"


    // $ANTLR start "rule__FnDecl__Group__0__Impl"
    // InternalFortXTrans.g:4275:1: rule__FnDecl__Group__0__Impl : ( ( rule__FnDecl__ModsAssignment_0 )? ) ;
    public final void rule__FnDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4279:1: ( ( ( rule__FnDecl__ModsAssignment_0 )? ) )
            // InternalFortXTrans.g:4280:1: ( ( rule__FnDecl__ModsAssignment_0 )? )
            {
            // InternalFortXTrans.g:4280:1: ( ( rule__FnDecl__ModsAssignment_0 )? )
            // InternalFortXTrans.g:4281:2: ( rule__FnDecl__ModsAssignment_0 )?
            {
             before(grammarAccess.getFnDeclAccess().getModsAssignment_0()); 
            // InternalFortXTrans.g:4282:2: ( rule__FnDecl__ModsAssignment_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=40 && LA38_0<=43)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalFortXTrans.g:4282:3: rule__FnDecl__ModsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FnDecl__ModsAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFnDeclAccess().getModsAssignment_0()); 

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
    // $ANTLR end "rule__FnDecl__Group__0__Impl"


    // $ANTLR start "rule__FnDecl__Group__1"
    // InternalFortXTrans.g:4290:1: rule__FnDecl__Group__1 : rule__FnDecl__Group__1__Impl rule__FnDecl__Group__2 ;
    public final void rule__FnDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4294:1: ( rule__FnDecl__Group__1__Impl rule__FnDecl__Group__2 )
            // InternalFortXTrans.g:4295:2: rule__FnDecl__Group__1__Impl rule__FnDecl__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__FnDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FnDecl__Group__2();

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
    // $ANTLR end "rule__FnDecl__Group__1"


    // $ANTLR start "rule__FnDecl__Group__1__Impl"
    // InternalFortXTrans.g:4302:1: rule__FnDecl__Group__1__Impl : ( ( rule__FnDecl__NameAssignment_1 ) ) ;
    public final void rule__FnDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4306:1: ( ( ( rule__FnDecl__NameAssignment_1 ) ) )
            // InternalFortXTrans.g:4307:1: ( ( rule__FnDecl__NameAssignment_1 ) )
            {
            // InternalFortXTrans.g:4307:1: ( ( rule__FnDecl__NameAssignment_1 ) )
            // InternalFortXTrans.g:4308:2: ( rule__FnDecl__NameAssignment_1 )
            {
             before(grammarAccess.getFnDeclAccess().getNameAssignment_1()); 
            // InternalFortXTrans.g:4309:2: ( rule__FnDecl__NameAssignment_1 )
            // InternalFortXTrans.g:4309:3: rule__FnDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FnDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFnDeclAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__FnDecl__Group__1__Impl"


    // $ANTLR start "rule__FnDecl__Group__2"
    // InternalFortXTrans.g:4317:1: rule__FnDecl__Group__2 : rule__FnDecl__Group__2__Impl rule__FnDecl__Group__3 ;
    public final void rule__FnDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4321:1: ( rule__FnDecl__Group__2__Impl rule__FnDecl__Group__3 )
            // InternalFortXTrans.g:4322:2: rule__FnDecl__Group__2__Impl rule__FnDecl__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__FnDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FnDecl__Group__3();

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
    // $ANTLR end "rule__FnDecl__Group__2"


    // $ANTLR start "rule__FnDecl__Group__2__Impl"
    // InternalFortXTrans.g:4329:1: rule__FnDecl__Group__2__Impl : ( ( rule__FnDecl__ParamsAssignment_2 ) ) ;
    public final void rule__FnDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4333:1: ( ( ( rule__FnDecl__ParamsAssignment_2 ) ) )
            // InternalFortXTrans.g:4334:1: ( ( rule__FnDecl__ParamsAssignment_2 ) )
            {
            // InternalFortXTrans.g:4334:1: ( ( rule__FnDecl__ParamsAssignment_2 ) )
            // InternalFortXTrans.g:4335:2: ( rule__FnDecl__ParamsAssignment_2 )
            {
             before(grammarAccess.getFnDeclAccess().getParamsAssignment_2()); 
            // InternalFortXTrans.g:4336:2: ( rule__FnDecl__ParamsAssignment_2 )
            // InternalFortXTrans.g:4336:3: rule__FnDecl__ParamsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FnDecl__ParamsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFnDeclAccess().getParamsAssignment_2()); 

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
    // $ANTLR end "rule__FnDecl__Group__2__Impl"


    // $ANTLR start "rule__FnDecl__Group__3"
    // InternalFortXTrans.g:4344:1: rule__FnDecl__Group__3 : rule__FnDecl__Group__3__Impl rule__FnDecl__Group__4 ;
    public final void rule__FnDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4348:1: ( rule__FnDecl__Group__3__Impl rule__FnDecl__Group__4 )
            // InternalFortXTrans.g:4349:2: rule__FnDecl__Group__3__Impl rule__FnDecl__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__FnDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FnDecl__Group__4();

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
    // $ANTLR end "rule__FnDecl__Group__3"


    // $ANTLR start "rule__FnDecl__Group__3__Impl"
    // InternalFortXTrans.g:4356:1: rule__FnDecl__Group__3__Impl : ( ( rule__FnDecl__RetValAssignment_3 )? ) ;
    public final void rule__FnDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4360:1: ( ( ( rule__FnDecl__RetValAssignment_3 )? ) )
            // InternalFortXTrans.g:4361:1: ( ( rule__FnDecl__RetValAssignment_3 )? )
            {
            // InternalFortXTrans.g:4361:1: ( ( rule__FnDecl__RetValAssignment_3 )? )
            // InternalFortXTrans.g:4362:2: ( rule__FnDecl__RetValAssignment_3 )?
            {
             before(grammarAccess.getFnDeclAccess().getRetValAssignment_3()); 
            // InternalFortXTrans.g:4363:2: ( rule__FnDecl__RetValAssignment_3 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==29) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalFortXTrans.g:4363:3: rule__FnDecl__RetValAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FnDecl__RetValAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFnDeclAccess().getRetValAssignment_3()); 

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
    // $ANTLR end "rule__FnDecl__Group__3__Impl"


    // $ANTLR start "rule__FnDecl__Group__4"
    // InternalFortXTrans.g:4371:1: rule__FnDecl__Group__4 : rule__FnDecl__Group__4__Impl ;
    public final void rule__FnDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4375:1: ( rule__FnDecl__Group__4__Impl )
            // InternalFortXTrans.g:4376:2: rule__FnDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FnDecl__Group__4__Impl();

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
    // $ANTLR end "rule__FnDecl__Group__4"


    // $ANTLR start "rule__FnDecl__Group__4__Impl"
    // InternalFortXTrans.g:4382:1: rule__FnDecl__Group__4__Impl : ( ( rule__FnDecl__Group_4__0 )? ) ;
    public final void rule__FnDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4386:1: ( ( ( rule__FnDecl__Group_4__0 )? ) )
            // InternalFortXTrans.g:4387:1: ( ( rule__FnDecl__Group_4__0 )? )
            {
            // InternalFortXTrans.g:4387:1: ( ( rule__FnDecl__Group_4__0 )? )
            // InternalFortXTrans.g:4388:2: ( rule__FnDecl__Group_4__0 )?
            {
             before(grammarAccess.getFnDeclAccess().getGroup_4()); 
            // InternalFortXTrans.g:4389:2: ( rule__FnDecl__Group_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==44) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalFortXTrans.g:4389:3: rule__FnDecl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FnDecl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFnDeclAccess().getGroup_4()); 

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
    // $ANTLR end "rule__FnDecl__Group__4__Impl"


    // $ANTLR start "rule__FnDecl__Group_4__0"
    // InternalFortXTrans.g:4398:1: rule__FnDecl__Group_4__0 : rule__FnDecl__Group_4__0__Impl rule__FnDecl__Group_4__1 ;
    public final void rule__FnDecl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4402:1: ( rule__FnDecl__Group_4__0__Impl rule__FnDecl__Group_4__1 )
            // InternalFortXTrans.g:4403:2: rule__FnDecl__Group_4__0__Impl rule__FnDecl__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__FnDecl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FnDecl__Group_4__1();

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
    // $ANTLR end "rule__FnDecl__Group_4__0"


    // $ANTLR start "rule__FnDecl__Group_4__0__Impl"
    // InternalFortXTrans.g:4410:1: rule__FnDecl__Group_4__0__Impl : ( ( rule__FnDecl__BodyAssignment_4_0 ) ) ;
    public final void rule__FnDecl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4414:1: ( ( ( rule__FnDecl__BodyAssignment_4_0 ) ) )
            // InternalFortXTrans.g:4415:1: ( ( rule__FnDecl__BodyAssignment_4_0 ) )
            {
            // InternalFortXTrans.g:4415:1: ( ( rule__FnDecl__BodyAssignment_4_0 ) )
            // InternalFortXTrans.g:4416:2: ( rule__FnDecl__BodyAssignment_4_0 )
            {
             before(grammarAccess.getFnDeclAccess().getBodyAssignment_4_0()); 
            // InternalFortXTrans.g:4417:2: ( rule__FnDecl__BodyAssignment_4_0 )
            // InternalFortXTrans.g:4417:3: rule__FnDecl__BodyAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__FnDecl__BodyAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getFnDeclAccess().getBodyAssignment_4_0()); 

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
    // $ANTLR end "rule__FnDecl__Group_4__0__Impl"


    // $ANTLR start "rule__FnDecl__Group_4__1"
    // InternalFortXTrans.g:4425:1: rule__FnDecl__Group_4__1 : rule__FnDecl__Group_4__1__Impl ;
    public final void rule__FnDecl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4429:1: ( rule__FnDecl__Group_4__1__Impl )
            // InternalFortXTrans.g:4430:2: rule__FnDecl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FnDecl__Group_4__1__Impl();

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
    // $ANTLR end "rule__FnDecl__Group_4__1"


    // $ANTLR start "rule__FnDecl__Group_4__1__Impl"
    // InternalFortXTrans.g:4436:1: rule__FnDecl__Group_4__1__Impl : ( ( rule__FnDecl__FnItselfAssignment_4_1 ) ) ;
    public final void rule__FnDecl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4440:1: ( ( ( rule__FnDecl__FnItselfAssignment_4_1 ) ) )
            // InternalFortXTrans.g:4441:1: ( ( rule__FnDecl__FnItselfAssignment_4_1 ) )
            {
            // InternalFortXTrans.g:4441:1: ( ( rule__FnDecl__FnItselfAssignment_4_1 ) )
            // InternalFortXTrans.g:4442:2: ( rule__FnDecl__FnItselfAssignment_4_1 )
            {
             before(grammarAccess.getFnDeclAccess().getFnItselfAssignment_4_1()); 
            // InternalFortXTrans.g:4443:2: ( rule__FnDecl__FnItselfAssignment_4_1 )
            // InternalFortXTrans.g:4443:3: rule__FnDecl__FnItselfAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__FnDecl__FnItselfAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFnDeclAccess().getFnItselfAssignment_4_1()); 

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
    // $ANTLR end "rule__FnDecl__Group_4__1__Impl"


    // $ANTLR start "rule__Expr__Group__0"
    // InternalFortXTrans.g:4452:1: rule__Expr__Group__0 : rule__Expr__Group__0__Impl rule__Expr__Group__1 ;
    public final void rule__Expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4456:1: ( rule__Expr__Group__0__Impl rule__Expr__Group__1 )
            // InternalFortXTrans.g:4457:2: rule__Expr__Group__0__Impl rule__Expr__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Expr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expr__Group__1();

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
    // $ANTLR end "rule__Expr__Group__0"


    // $ANTLR start "rule__Expr__Group__0__Impl"
    // InternalFortXTrans.g:4464:1: rule__Expr__Group__0__Impl : ( ( rule__Expr__FrontAssignment_0 ) ) ;
    public final void rule__Expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4468:1: ( ( ( rule__Expr__FrontAssignment_0 ) ) )
            // InternalFortXTrans.g:4469:1: ( ( rule__Expr__FrontAssignment_0 ) )
            {
            // InternalFortXTrans.g:4469:1: ( ( rule__Expr__FrontAssignment_0 ) )
            // InternalFortXTrans.g:4470:2: ( rule__Expr__FrontAssignment_0 )
            {
             before(grammarAccess.getExprAccess().getFrontAssignment_0()); 
            // InternalFortXTrans.g:4471:2: ( rule__Expr__FrontAssignment_0 )
            // InternalFortXTrans.g:4471:3: rule__Expr__FrontAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expr__FrontAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getFrontAssignment_0()); 

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
    // $ANTLR end "rule__Expr__Group__0__Impl"


    // $ANTLR start "rule__Expr__Group__1"
    // InternalFortXTrans.g:4479:1: rule__Expr__Group__1 : rule__Expr__Group__1__Impl ;
    public final void rule__Expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4483:1: ( rule__Expr__Group__1__Impl )
            // InternalFortXTrans.g:4484:2: rule__Expr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expr__Group__1__Impl();

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
    // $ANTLR end "rule__Expr__Group__1"


    // $ANTLR start "rule__Expr__Group__1__Impl"
    // InternalFortXTrans.g:4490:1: rule__Expr__Group__1__Impl : ( ( rule__Expr__TailsAssignment_1 )* ) ;
    public final void rule__Expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4494:1: ( ( ( rule__Expr__TailsAssignment_1 )* ) )
            // InternalFortXTrans.g:4495:1: ( ( rule__Expr__TailsAssignment_1 )* )
            {
            // InternalFortXTrans.g:4495:1: ( ( rule__Expr__TailsAssignment_1 )* )
            // InternalFortXTrans.g:4496:2: ( rule__Expr__TailsAssignment_1 )*
            {
             before(grammarAccess.getExprAccess().getTailsAssignment_1()); 
            // InternalFortXTrans.g:4497:2: ( rule__Expr__TailsAssignment_1 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==27) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalFortXTrans.g:4497:3: rule__Expr__TailsAssignment_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Expr__TailsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getExprAccess().getTailsAssignment_1()); 

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
    // $ANTLR end "rule__Expr__Group__1__Impl"


    // $ANTLR start "rule__ExprTail__Group__0"
    // InternalFortXTrans.g:4506:1: rule__ExprTail__Group__0 : rule__ExprTail__Group__0__Impl rule__ExprTail__Group__1 ;
    public final void rule__ExprTail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4510:1: ( rule__ExprTail__Group__0__Impl rule__ExprTail__Group__1 )
            // InternalFortXTrans.g:4511:2: rule__ExprTail__Group__0__Impl rule__ExprTail__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ExprTail__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExprTail__Group__1();

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
    // $ANTLR end "rule__ExprTail__Group__0"


    // $ANTLR start "rule__ExprTail__Group__0__Impl"
    // InternalFortXTrans.g:4518:1: rule__ExprTail__Group__0__Impl : ( 'as' ) ;
    public final void rule__ExprTail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4522:1: ( ( 'as' ) )
            // InternalFortXTrans.g:4523:1: ( 'as' )
            {
            // InternalFortXTrans.g:4523:1: ( 'as' )
            // InternalFortXTrans.g:4524:2: 'as'
            {
             before(grammarAccess.getExprTailAccess().getAsKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getExprTailAccess().getAsKeyword_0()); 

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
    // $ANTLR end "rule__ExprTail__Group__0__Impl"


    // $ANTLR start "rule__ExprTail__Group__1"
    // InternalFortXTrans.g:4533:1: rule__ExprTail__Group__1 : rule__ExprTail__Group__1__Impl ;
    public final void rule__ExprTail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4537:1: ( rule__ExprTail__Group__1__Impl )
            // InternalFortXTrans.g:4538:2: rule__ExprTail__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExprTail__Group__1__Impl();

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
    // $ANTLR end "rule__ExprTail__Group__1"


    // $ANTLR start "rule__ExprTail__Group__1__Impl"
    // InternalFortXTrans.g:4544:1: rule__ExprTail__Group__1__Impl : ( ( rule__ExprTail__TypeAssignment_1 ) ) ;
    public final void rule__ExprTail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4548:1: ( ( ( rule__ExprTail__TypeAssignment_1 ) ) )
            // InternalFortXTrans.g:4549:1: ( ( rule__ExprTail__TypeAssignment_1 ) )
            {
            // InternalFortXTrans.g:4549:1: ( ( rule__ExprTail__TypeAssignment_1 ) )
            // InternalFortXTrans.g:4550:2: ( rule__ExprTail__TypeAssignment_1 )
            {
             before(grammarAccess.getExprTailAccess().getTypeAssignment_1()); 
            // InternalFortXTrans.g:4551:2: ( rule__ExprTail__TypeAssignment_1 )
            // InternalFortXTrans.g:4551:3: rule__ExprTail__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExprTail__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExprTailAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__ExprTail__Group__1__Impl"


    // $ANTLR start "rule__DelimitedExpr__Group_1__0"
    // InternalFortXTrans.g:4560:1: rule__DelimitedExpr__Group_1__0 : rule__DelimitedExpr__Group_1__0__Impl rule__DelimitedExpr__Group_1__1 ;
    public final void rule__DelimitedExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4564:1: ( rule__DelimitedExpr__Group_1__0__Impl rule__DelimitedExpr__Group_1__1 )
            // InternalFortXTrans.g:4565:2: rule__DelimitedExpr__Group_1__0__Impl rule__DelimitedExpr__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__DelimitedExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__Group_1__1();

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
    // $ANTLR end "rule__DelimitedExpr__Group_1__0"


    // $ANTLR start "rule__DelimitedExpr__Group_1__0__Impl"
    // InternalFortXTrans.g:4572:1: rule__DelimitedExpr__Group_1__0__Impl : ( ( rule__DelimitedExpr__AwhileAssignment_1_0 ) ) ;
    public final void rule__DelimitedExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4576:1: ( ( ( rule__DelimitedExpr__AwhileAssignment_1_0 ) ) )
            // InternalFortXTrans.g:4577:1: ( ( rule__DelimitedExpr__AwhileAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:4577:1: ( ( rule__DelimitedExpr__AwhileAssignment_1_0 ) )
            // InternalFortXTrans.g:4578:2: ( rule__DelimitedExpr__AwhileAssignment_1_0 )
            {
             before(grammarAccess.getDelimitedExprAccess().getAwhileAssignment_1_0()); 
            // InternalFortXTrans.g:4579:2: ( rule__DelimitedExpr__AwhileAssignment_1_0 )
            // InternalFortXTrans.g:4579:3: rule__DelimitedExpr__AwhileAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__AwhileAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDelimitedExprAccess().getAwhileAssignment_1_0()); 

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
    // $ANTLR end "rule__DelimitedExpr__Group_1__0__Impl"


    // $ANTLR start "rule__DelimitedExpr__Group_1__1"
    // InternalFortXTrans.g:4587:1: rule__DelimitedExpr__Group_1__1 : rule__DelimitedExpr__Group_1__1__Impl rule__DelimitedExpr__Group_1__2 ;
    public final void rule__DelimitedExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4591:1: ( rule__DelimitedExpr__Group_1__1__Impl rule__DelimitedExpr__Group_1__2 )
            // InternalFortXTrans.g:4592:2: rule__DelimitedExpr__Group_1__1__Impl rule__DelimitedExpr__Group_1__2
            {
            pushFollow(FOLLOW_34);
            rule__DelimitedExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__Group_1__2();

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
    // $ANTLR end "rule__DelimitedExpr__Group_1__1"


    // $ANTLR start "rule__DelimitedExpr__Group_1__1__Impl"
    // InternalFortXTrans.g:4599:1: rule__DelimitedExpr__Group_1__1__Impl : ( ( rule__DelimitedExpr__ExprAssignment_1_1 ) ) ;
    public final void rule__DelimitedExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4603:1: ( ( ( rule__DelimitedExpr__ExprAssignment_1_1 ) ) )
            // InternalFortXTrans.g:4604:1: ( ( rule__DelimitedExpr__ExprAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:4604:1: ( ( rule__DelimitedExpr__ExprAssignment_1_1 ) )
            // InternalFortXTrans.g:4605:2: ( rule__DelimitedExpr__ExprAssignment_1_1 )
            {
             before(grammarAccess.getDelimitedExprAccess().getExprAssignment_1_1()); 
            // InternalFortXTrans.g:4606:2: ( rule__DelimitedExpr__ExprAssignment_1_1 )
            // InternalFortXTrans.g:4606:3: rule__DelimitedExpr__ExprAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__ExprAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDelimitedExprAccess().getExprAssignment_1_1()); 

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
    // $ANTLR end "rule__DelimitedExpr__Group_1__1__Impl"


    // $ANTLR start "rule__DelimitedExpr__Group_1__2"
    // InternalFortXTrans.g:4614:1: rule__DelimitedExpr__Group_1__2 : rule__DelimitedExpr__Group_1__2__Impl ;
    public final void rule__DelimitedExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4618:1: ( rule__DelimitedExpr__Group_1__2__Impl )
            // InternalFortXTrans.g:4619:2: rule__DelimitedExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__Group_1__2__Impl();

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
    // $ANTLR end "rule__DelimitedExpr__Group_1__2"


    // $ANTLR start "rule__DelimitedExpr__Group_1__2__Impl"
    // InternalFortXTrans.g:4625:1: rule__DelimitedExpr__Group_1__2__Impl : ( ( rule__DelimitedExpr__WhiledodAssignment_1_2 ) ) ;
    public final void rule__DelimitedExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4629:1: ( ( ( rule__DelimitedExpr__WhiledodAssignment_1_2 ) ) )
            // InternalFortXTrans.g:4630:1: ( ( rule__DelimitedExpr__WhiledodAssignment_1_2 ) )
            {
            // InternalFortXTrans.g:4630:1: ( ( rule__DelimitedExpr__WhiledodAssignment_1_2 ) )
            // InternalFortXTrans.g:4631:2: ( rule__DelimitedExpr__WhiledodAssignment_1_2 )
            {
             before(grammarAccess.getDelimitedExprAccess().getWhiledodAssignment_1_2()); 
            // InternalFortXTrans.g:4632:2: ( rule__DelimitedExpr__WhiledodAssignment_1_2 )
            // InternalFortXTrans.g:4632:3: rule__DelimitedExpr__WhiledodAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__WhiledodAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDelimitedExprAccess().getWhiledodAssignment_1_2()); 

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
    // $ANTLR end "rule__DelimitedExpr__Group_1__2__Impl"


    // $ANTLR start "rule__DelimitedExpr__Group_2__0"
    // InternalFortXTrans.g:4641:1: rule__DelimitedExpr__Group_2__0 : rule__DelimitedExpr__Group_2__0__Impl rule__DelimitedExpr__Group_2__1 ;
    public final void rule__DelimitedExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4645:1: ( rule__DelimitedExpr__Group_2__0__Impl rule__DelimitedExpr__Group_2__1 )
            // InternalFortXTrans.g:4646:2: rule__DelimitedExpr__Group_2__0__Impl rule__DelimitedExpr__Group_2__1
            {
            pushFollow(FOLLOW_30);
            rule__DelimitedExpr__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__Group_2__1();

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
    // $ANTLR end "rule__DelimitedExpr__Group_2__0"


    // $ANTLR start "rule__DelimitedExpr__Group_2__0__Impl"
    // InternalFortXTrans.g:4653:1: rule__DelimitedExpr__Group_2__0__Impl : ( ( rule__DelimitedExpr__AforAssignment_2_0 ) ) ;
    public final void rule__DelimitedExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4657:1: ( ( ( rule__DelimitedExpr__AforAssignment_2_0 ) ) )
            // InternalFortXTrans.g:4658:1: ( ( rule__DelimitedExpr__AforAssignment_2_0 ) )
            {
            // InternalFortXTrans.g:4658:1: ( ( rule__DelimitedExpr__AforAssignment_2_0 ) )
            // InternalFortXTrans.g:4659:2: ( rule__DelimitedExpr__AforAssignment_2_0 )
            {
             before(grammarAccess.getDelimitedExprAccess().getAforAssignment_2_0()); 
            // InternalFortXTrans.g:4660:2: ( rule__DelimitedExpr__AforAssignment_2_0 )
            // InternalFortXTrans.g:4660:3: rule__DelimitedExpr__AforAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__AforAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDelimitedExprAccess().getAforAssignment_2_0()); 

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
    // $ANTLR end "rule__DelimitedExpr__Group_2__0__Impl"


    // $ANTLR start "rule__DelimitedExpr__Group_2__1"
    // InternalFortXTrans.g:4668:1: rule__DelimitedExpr__Group_2__1 : rule__DelimitedExpr__Group_2__1__Impl rule__DelimitedExpr__Group_2__2 ;
    public final void rule__DelimitedExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4672:1: ( rule__DelimitedExpr__Group_2__1__Impl rule__DelimitedExpr__Group_2__2 )
            // InternalFortXTrans.g:4673:2: rule__DelimitedExpr__Group_2__1__Impl rule__DelimitedExpr__Group_2__2
            {
            pushFollow(FOLLOW_34);
            rule__DelimitedExpr__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__Group_2__2();

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
    // $ANTLR end "rule__DelimitedExpr__Group_2__1"


    // $ANTLR start "rule__DelimitedExpr__Group_2__1__Impl"
    // InternalFortXTrans.g:4680:1: rule__DelimitedExpr__Group_2__1__Impl : ( ( rule__DelimitedExpr__GenAssignment_2_1 ) ) ;
    public final void rule__DelimitedExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4684:1: ( ( ( rule__DelimitedExpr__GenAssignment_2_1 ) ) )
            // InternalFortXTrans.g:4685:1: ( ( rule__DelimitedExpr__GenAssignment_2_1 ) )
            {
            // InternalFortXTrans.g:4685:1: ( ( rule__DelimitedExpr__GenAssignment_2_1 ) )
            // InternalFortXTrans.g:4686:2: ( rule__DelimitedExpr__GenAssignment_2_1 )
            {
             before(grammarAccess.getDelimitedExprAccess().getGenAssignment_2_1()); 
            // InternalFortXTrans.g:4687:2: ( rule__DelimitedExpr__GenAssignment_2_1 )
            // InternalFortXTrans.g:4687:3: rule__DelimitedExpr__GenAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__GenAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDelimitedExprAccess().getGenAssignment_2_1()); 

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
    // $ANTLR end "rule__DelimitedExpr__Group_2__1__Impl"


    // $ANTLR start "rule__DelimitedExpr__Group_2__2"
    // InternalFortXTrans.g:4695:1: rule__DelimitedExpr__Group_2__2 : rule__DelimitedExpr__Group_2__2__Impl rule__DelimitedExpr__Group_2__3 ;
    public final void rule__DelimitedExpr__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4699:1: ( rule__DelimitedExpr__Group_2__2__Impl rule__DelimitedExpr__Group_2__3 )
            // InternalFortXTrans.g:4700:2: rule__DelimitedExpr__Group_2__2__Impl rule__DelimitedExpr__Group_2__3
            {
            pushFollow(FOLLOW_35);
            rule__DelimitedExpr__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__Group_2__3();

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
    // $ANTLR end "rule__DelimitedExpr__Group_2__2"


    // $ANTLR start "rule__DelimitedExpr__Group_2__2__Impl"
    // InternalFortXTrans.g:4707:1: rule__DelimitedExpr__Group_2__2__Impl : ( ( rule__DelimitedExpr__DofrontAssignment_2_2 ) ) ;
    public final void rule__DelimitedExpr__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4711:1: ( ( ( rule__DelimitedExpr__DofrontAssignment_2_2 ) ) )
            // InternalFortXTrans.g:4712:1: ( ( rule__DelimitedExpr__DofrontAssignment_2_2 ) )
            {
            // InternalFortXTrans.g:4712:1: ( ( rule__DelimitedExpr__DofrontAssignment_2_2 ) )
            // InternalFortXTrans.g:4713:2: ( rule__DelimitedExpr__DofrontAssignment_2_2 )
            {
             before(grammarAccess.getDelimitedExprAccess().getDofrontAssignment_2_2()); 
            // InternalFortXTrans.g:4714:2: ( rule__DelimitedExpr__DofrontAssignment_2_2 )
            // InternalFortXTrans.g:4714:3: rule__DelimitedExpr__DofrontAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__DofrontAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getDelimitedExprAccess().getDofrontAssignment_2_2()); 

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
    // $ANTLR end "rule__DelimitedExpr__Group_2__2__Impl"


    // $ANTLR start "rule__DelimitedExpr__Group_2__3"
    // InternalFortXTrans.g:4722:1: rule__DelimitedExpr__Group_2__3 : rule__DelimitedExpr__Group_2__3__Impl ;
    public final void rule__DelimitedExpr__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4726:1: ( rule__DelimitedExpr__Group_2__3__Impl )
            // InternalFortXTrans.g:4727:2: rule__DelimitedExpr__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__Group_2__3__Impl();

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
    // $ANTLR end "rule__DelimitedExpr__Group_2__3"


    // $ANTLR start "rule__DelimitedExpr__Group_2__3__Impl"
    // InternalFortXTrans.g:4733:1: rule__DelimitedExpr__Group_2__3__Impl : ( 'end' ) ;
    public final void rule__DelimitedExpr__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4737:1: ( ( 'end' ) )
            // InternalFortXTrans.g:4738:1: ( 'end' )
            {
            // InternalFortXTrans.g:4738:1: ( 'end' )
            // InternalFortXTrans.g:4739:2: 'end'
            {
             before(grammarAccess.getDelimitedExprAccess().getEndKeyword_2_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDelimitedExprAccess().getEndKeyword_2_3()); 

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
    // $ANTLR end "rule__DelimitedExpr__Group_2__3__Impl"


    // $ANTLR start "rule__DelimitedExpr__Group_3__0"
    // InternalFortXTrans.g:4749:1: rule__DelimitedExpr__Group_3__0 : rule__DelimitedExpr__Group_3__0__Impl rule__DelimitedExpr__Group_3__1 ;
    public final void rule__DelimitedExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4753:1: ( rule__DelimitedExpr__Group_3__0__Impl rule__DelimitedExpr__Group_3__1 )
            // InternalFortXTrans.g:4754:2: rule__DelimitedExpr__Group_3__0__Impl rule__DelimitedExpr__Group_3__1
            {
            pushFollow(FOLLOW_32);
            rule__DelimitedExpr__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__Group_3__1();

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
    // $ANTLR end "rule__DelimitedExpr__Group_3__0"


    // $ANTLR start "rule__DelimitedExpr__Group_3__0__Impl"
    // InternalFortXTrans.g:4761:1: rule__DelimitedExpr__Group_3__0__Impl : ( ( rule__DelimitedExpr__AnifAssignment_3_0 ) ) ;
    public final void rule__DelimitedExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4765:1: ( ( ( rule__DelimitedExpr__AnifAssignment_3_0 ) ) )
            // InternalFortXTrans.g:4766:1: ( ( rule__DelimitedExpr__AnifAssignment_3_0 ) )
            {
            // InternalFortXTrans.g:4766:1: ( ( rule__DelimitedExpr__AnifAssignment_3_0 ) )
            // InternalFortXTrans.g:4767:2: ( rule__DelimitedExpr__AnifAssignment_3_0 )
            {
             before(grammarAccess.getDelimitedExprAccess().getAnifAssignment_3_0()); 
            // InternalFortXTrans.g:4768:2: ( rule__DelimitedExpr__AnifAssignment_3_0 )
            // InternalFortXTrans.g:4768:3: rule__DelimitedExpr__AnifAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__AnifAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getDelimitedExprAccess().getAnifAssignment_3_0()); 

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
    // $ANTLR end "rule__DelimitedExpr__Group_3__0__Impl"


    // $ANTLR start "rule__DelimitedExpr__Group_3__1"
    // InternalFortXTrans.g:4776:1: rule__DelimitedExpr__Group_3__1 : rule__DelimitedExpr__Group_3__1__Impl rule__DelimitedExpr__Group_3__2 ;
    public final void rule__DelimitedExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4780:1: ( rule__DelimitedExpr__Group_3__1__Impl rule__DelimitedExpr__Group_3__2 )
            // InternalFortXTrans.g:4781:2: rule__DelimitedExpr__Group_3__1__Impl rule__DelimitedExpr__Group_3__2
            {
            pushFollow(FOLLOW_36);
            rule__DelimitedExpr__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__Group_3__2();

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
    // $ANTLR end "rule__DelimitedExpr__Group_3__1"


    // $ANTLR start "rule__DelimitedExpr__Group_3__1__Impl"
    // InternalFortXTrans.g:4788:1: rule__DelimitedExpr__Group_3__1__Impl : ( ( rule__DelimitedExpr__CondAssignment_3_1 ) ) ;
    public final void rule__DelimitedExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4792:1: ( ( ( rule__DelimitedExpr__CondAssignment_3_1 ) ) )
            // InternalFortXTrans.g:4793:1: ( ( rule__DelimitedExpr__CondAssignment_3_1 ) )
            {
            // InternalFortXTrans.g:4793:1: ( ( rule__DelimitedExpr__CondAssignment_3_1 ) )
            // InternalFortXTrans.g:4794:2: ( rule__DelimitedExpr__CondAssignment_3_1 )
            {
             before(grammarAccess.getDelimitedExprAccess().getCondAssignment_3_1()); 
            // InternalFortXTrans.g:4795:2: ( rule__DelimitedExpr__CondAssignment_3_1 )
            // InternalFortXTrans.g:4795:3: rule__DelimitedExpr__CondAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__CondAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDelimitedExprAccess().getCondAssignment_3_1()); 

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
    // $ANTLR end "rule__DelimitedExpr__Group_3__1__Impl"


    // $ANTLR start "rule__DelimitedExpr__Group_3__2"
    // InternalFortXTrans.g:4803:1: rule__DelimitedExpr__Group_3__2 : rule__DelimitedExpr__Group_3__2__Impl rule__DelimitedExpr__Group_3__3 ;
    public final void rule__DelimitedExpr__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4807:1: ( rule__DelimitedExpr__Group_3__2__Impl rule__DelimitedExpr__Group_3__3 )
            // InternalFortXTrans.g:4808:2: rule__DelimitedExpr__Group_3__2__Impl rule__DelimitedExpr__Group_3__3
            {
            pushFollow(FOLLOW_32);
            rule__DelimitedExpr__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__Group_3__3();

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
    // $ANTLR end "rule__DelimitedExpr__Group_3__2"


    // $ANTLR start "rule__DelimitedExpr__Group_3__2__Impl"
    // InternalFortXTrans.g:4815:1: rule__DelimitedExpr__Group_3__2__Impl : ( 'then' ) ;
    public final void rule__DelimitedExpr__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4819:1: ( ( 'then' ) )
            // InternalFortXTrans.g:4820:1: ( 'then' )
            {
            // InternalFortXTrans.g:4820:1: ( 'then' )
            // InternalFortXTrans.g:4821:2: 'then'
            {
             before(grammarAccess.getDelimitedExprAccess().getThenKeyword_3_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDelimitedExprAccess().getThenKeyword_3_2()); 

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
    // $ANTLR end "rule__DelimitedExpr__Group_3__2__Impl"


    // $ANTLR start "rule__DelimitedExpr__Group_3__3"
    // InternalFortXTrans.g:4830:1: rule__DelimitedExpr__Group_3__3 : rule__DelimitedExpr__Group_3__3__Impl rule__DelimitedExpr__Group_3__4 ;
    public final void rule__DelimitedExpr__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4834:1: ( rule__DelimitedExpr__Group_3__3__Impl rule__DelimitedExpr__Group_3__4 )
            // InternalFortXTrans.g:4835:2: rule__DelimitedExpr__Group_3__3__Impl rule__DelimitedExpr__Group_3__4
            {
            pushFollow(FOLLOW_37);
            rule__DelimitedExpr__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__Group_3__4();

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
    // $ANTLR end "rule__DelimitedExpr__Group_3__3"


    // $ANTLR start "rule__DelimitedExpr__Group_3__3__Impl"
    // InternalFortXTrans.g:4842:1: rule__DelimitedExpr__Group_3__3__Impl : ( ( rule__DelimitedExpr__BlockAssignment_3_3 ) ) ;
    public final void rule__DelimitedExpr__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4846:1: ( ( ( rule__DelimitedExpr__BlockAssignment_3_3 ) ) )
            // InternalFortXTrans.g:4847:1: ( ( rule__DelimitedExpr__BlockAssignment_3_3 ) )
            {
            // InternalFortXTrans.g:4847:1: ( ( rule__DelimitedExpr__BlockAssignment_3_3 ) )
            // InternalFortXTrans.g:4848:2: ( rule__DelimitedExpr__BlockAssignment_3_3 )
            {
             before(grammarAccess.getDelimitedExprAccess().getBlockAssignment_3_3()); 
            // InternalFortXTrans.g:4849:2: ( rule__DelimitedExpr__BlockAssignment_3_3 )
            // InternalFortXTrans.g:4849:3: rule__DelimitedExpr__BlockAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__BlockAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getDelimitedExprAccess().getBlockAssignment_3_3()); 

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
    // $ANTLR end "rule__DelimitedExpr__Group_3__3__Impl"


    // $ANTLR start "rule__DelimitedExpr__Group_3__4"
    // InternalFortXTrans.g:4857:1: rule__DelimitedExpr__Group_3__4 : rule__DelimitedExpr__Group_3__4__Impl rule__DelimitedExpr__Group_3__5 ;
    public final void rule__DelimitedExpr__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4861:1: ( rule__DelimitedExpr__Group_3__4__Impl rule__DelimitedExpr__Group_3__5 )
            // InternalFortXTrans.g:4862:2: rule__DelimitedExpr__Group_3__4__Impl rule__DelimitedExpr__Group_3__5
            {
            pushFollow(FOLLOW_37);
            rule__DelimitedExpr__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__Group_3__5();

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
    // $ANTLR end "rule__DelimitedExpr__Group_3__4"


    // $ANTLR start "rule__DelimitedExpr__Group_3__4__Impl"
    // InternalFortXTrans.g:4869:1: rule__DelimitedExpr__Group_3__4__Impl : ( ( rule__DelimitedExpr__ElifsAssignment_3_4 )? ) ;
    public final void rule__DelimitedExpr__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4873:1: ( ( ( rule__DelimitedExpr__ElifsAssignment_3_4 )? ) )
            // InternalFortXTrans.g:4874:1: ( ( rule__DelimitedExpr__ElifsAssignment_3_4 )? )
            {
            // InternalFortXTrans.g:4874:1: ( ( rule__DelimitedExpr__ElifsAssignment_3_4 )? )
            // InternalFortXTrans.g:4875:2: ( rule__DelimitedExpr__ElifsAssignment_3_4 )?
            {
             before(grammarAccess.getDelimitedExprAccess().getElifsAssignment_3_4()); 
            // InternalFortXTrans.g:4876:2: ( rule__DelimitedExpr__ElifsAssignment_3_4 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==31) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalFortXTrans.g:4876:3: rule__DelimitedExpr__ElifsAssignment_3_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__DelimitedExpr__ElifsAssignment_3_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDelimitedExprAccess().getElifsAssignment_3_4()); 

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
    // $ANTLR end "rule__DelimitedExpr__Group_3__4__Impl"


    // $ANTLR start "rule__DelimitedExpr__Group_3__5"
    // InternalFortXTrans.g:4884:1: rule__DelimitedExpr__Group_3__5 : rule__DelimitedExpr__Group_3__5__Impl rule__DelimitedExpr__Group_3__6 ;
    public final void rule__DelimitedExpr__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4888:1: ( rule__DelimitedExpr__Group_3__5__Impl rule__DelimitedExpr__Group_3__6 )
            // InternalFortXTrans.g:4889:2: rule__DelimitedExpr__Group_3__5__Impl rule__DelimitedExpr__Group_3__6
            {
            pushFollow(FOLLOW_37);
            rule__DelimitedExpr__Group_3__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__Group_3__6();

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
    // $ANTLR end "rule__DelimitedExpr__Group_3__5"


    // $ANTLR start "rule__DelimitedExpr__Group_3__5__Impl"
    // InternalFortXTrans.g:4896:1: rule__DelimitedExpr__Group_3__5__Impl : ( ( rule__DelimitedExpr__ElseAssignment_3_5 )? ) ;
    public final void rule__DelimitedExpr__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4900:1: ( ( ( rule__DelimitedExpr__ElseAssignment_3_5 )? ) )
            // InternalFortXTrans.g:4901:1: ( ( rule__DelimitedExpr__ElseAssignment_3_5 )? )
            {
            // InternalFortXTrans.g:4901:1: ( ( rule__DelimitedExpr__ElseAssignment_3_5 )? )
            // InternalFortXTrans.g:4902:2: ( rule__DelimitedExpr__ElseAssignment_3_5 )?
            {
             before(grammarAccess.getDelimitedExprAccess().getElseAssignment_3_5()); 
            // InternalFortXTrans.g:4903:2: ( rule__DelimitedExpr__ElseAssignment_3_5 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==32) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalFortXTrans.g:4903:3: rule__DelimitedExpr__ElseAssignment_3_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__DelimitedExpr__ElseAssignment_3_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDelimitedExprAccess().getElseAssignment_3_5()); 

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
    // $ANTLR end "rule__DelimitedExpr__Group_3__5__Impl"


    // $ANTLR start "rule__DelimitedExpr__Group_3__6"
    // InternalFortXTrans.g:4911:1: rule__DelimitedExpr__Group_3__6 : rule__DelimitedExpr__Group_3__6__Impl ;
    public final void rule__DelimitedExpr__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4915:1: ( rule__DelimitedExpr__Group_3__6__Impl )
            // InternalFortXTrans.g:4916:2: rule__DelimitedExpr__Group_3__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelimitedExpr__Group_3__6__Impl();

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
    // $ANTLR end "rule__DelimitedExpr__Group_3__6"


    // $ANTLR start "rule__DelimitedExpr__Group_3__6__Impl"
    // InternalFortXTrans.g:4922:1: rule__DelimitedExpr__Group_3__6__Impl : ( 'end' ) ;
    public final void rule__DelimitedExpr__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4926:1: ( ( 'end' ) )
            // InternalFortXTrans.g:4927:1: ( 'end' )
            {
            // InternalFortXTrans.g:4927:1: ( 'end' )
            // InternalFortXTrans.g:4928:2: 'end'
            {
             before(grammarAccess.getDelimitedExprAccess().getEndKeyword_3_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDelimitedExprAccess().getEndKeyword_3_6()); 

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
    // $ANTLR end "rule__DelimitedExpr__Group_3__6__Impl"


    // $ANTLR start "rule__Elifs__Group__0"
    // InternalFortXTrans.g:4938:1: rule__Elifs__Group__0 : rule__Elifs__Group__0__Impl rule__Elifs__Group__1 ;
    public final void rule__Elifs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4942:1: ( rule__Elifs__Group__0__Impl rule__Elifs__Group__1 )
            // InternalFortXTrans.g:4943:2: rule__Elifs__Group__0__Impl rule__Elifs__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Elifs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Elifs__Group__1();

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
    // $ANTLR end "rule__Elifs__Group__0"


    // $ANTLR start "rule__Elifs__Group__0__Impl"
    // InternalFortXTrans.g:4950:1: rule__Elifs__Group__0__Impl : ( ( rule__Elifs__EAssignment_0 ) ) ;
    public final void rule__Elifs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4954:1: ( ( ( rule__Elifs__EAssignment_0 ) ) )
            // InternalFortXTrans.g:4955:1: ( ( rule__Elifs__EAssignment_0 ) )
            {
            // InternalFortXTrans.g:4955:1: ( ( rule__Elifs__EAssignment_0 ) )
            // InternalFortXTrans.g:4956:2: ( rule__Elifs__EAssignment_0 )
            {
             before(grammarAccess.getElifsAccess().getEAssignment_0()); 
            // InternalFortXTrans.g:4957:2: ( rule__Elifs__EAssignment_0 )
            // InternalFortXTrans.g:4957:3: rule__Elifs__EAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Elifs__EAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getElifsAccess().getEAssignment_0()); 

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
    // $ANTLR end "rule__Elifs__Group__0__Impl"


    // $ANTLR start "rule__Elifs__Group__1"
    // InternalFortXTrans.g:4965:1: rule__Elifs__Group__1 : rule__Elifs__Group__1__Impl ;
    public final void rule__Elifs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4969:1: ( rule__Elifs__Group__1__Impl )
            // InternalFortXTrans.g:4970:2: rule__Elifs__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Elifs__Group__1__Impl();

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
    // $ANTLR end "rule__Elifs__Group__1"


    // $ANTLR start "rule__Elifs__Group__1__Impl"
    // InternalFortXTrans.g:4976:1: rule__Elifs__Group__1__Impl : ( ( rule__Elifs__EAssignment_1 )* ) ;
    public final void rule__Elifs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4980:1: ( ( ( rule__Elifs__EAssignment_1 )* ) )
            // InternalFortXTrans.g:4981:1: ( ( rule__Elifs__EAssignment_1 )* )
            {
            // InternalFortXTrans.g:4981:1: ( ( rule__Elifs__EAssignment_1 )* )
            // InternalFortXTrans.g:4982:2: ( rule__Elifs__EAssignment_1 )*
            {
             before(grammarAccess.getElifsAccess().getEAssignment_1()); 
            // InternalFortXTrans.g:4983:2: ( rule__Elifs__EAssignment_1 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==31) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalFortXTrans.g:4983:3: rule__Elifs__EAssignment_1
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Elifs__EAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getElifsAccess().getEAssignment_1()); 

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
    // $ANTLR end "rule__Elifs__Group__1__Impl"


    // $ANTLR start "rule__Elif__Group__0"
    // InternalFortXTrans.g:4992:1: rule__Elif__Group__0 : rule__Elif__Group__0__Impl rule__Elif__Group__1 ;
    public final void rule__Elif__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4996:1: ( rule__Elif__Group__0__Impl rule__Elif__Group__1 )
            // InternalFortXTrans.g:4997:2: rule__Elif__Group__0__Impl rule__Elif__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Elif__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Elif__Group__1();

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
    // $ANTLR end "rule__Elif__Group__0"


    // $ANTLR start "rule__Elif__Group__0__Impl"
    // InternalFortXTrans.g:5004:1: rule__Elif__Group__0__Impl : ( 'elif' ) ;
    public final void rule__Elif__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5008:1: ( ( 'elif' ) )
            // InternalFortXTrans.g:5009:1: ( 'elif' )
            {
            // InternalFortXTrans.g:5009:1: ( 'elif' )
            // InternalFortXTrans.g:5010:2: 'elif'
            {
             before(grammarAccess.getElifAccess().getElifKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getElifAccess().getElifKeyword_0()); 

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
    // $ANTLR end "rule__Elif__Group__0__Impl"


    // $ANTLR start "rule__Elif__Group__1"
    // InternalFortXTrans.g:5019:1: rule__Elif__Group__1 : rule__Elif__Group__1__Impl rule__Elif__Group__2 ;
    public final void rule__Elif__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5023:1: ( rule__Elif__Group__1__Impl rule__Elif__Group__2 )
            // InternalFortXTrans.g:5024:2: rule__Elif__Group__1__Impl rule__Elif__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Elif__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Elif__Group__2();

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
    // $ANTLR end "rule__Elif__Group__1"


    // $ANTLR start "rule__Elif__Group__1__Impl"
    // InternalFortXTrans.g:5031:1: rule__Elif__Group__1__Impl : ( ( rule__Elif__ExprAssignment_1 ) ) ;
    public final void rule__Elif__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5035:1: ( ( ( rule__Elif__ExprAssignment_1 ) ) )
            // InternalFortXTrans.g:5036:1: ( ( rule__Elif__ExprAssignment_1 ) )
            {
            // InternalFortXTrans.g:5036:1: ( ( rule__Elif__ExprAssignment_1 ) )
            // InternalFortXTrans.g:5037:2: ( rule__Elif__ExprAssignment_1 )
            {
             before(grammarAccess.getElifAccess().getExprAssignment_1()); 
            // InternalFortXTrans.g:5038:2: ( rule__Elif__ExprAssignment_1 )
            // InternalFortXTrans.g:5038:3: rule__Elif__ExprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Elif__ExprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElifAccess().getExprAssignment_1()); 

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
    // $ANTLR end "rule__Elif__Group__1__Impl"


    // $ANTLR start "rule__Elif__Group__2"
    // InternalFortXTrans.g:5046:1: rule__Elif__Group__2 : rule__Elif__Group__2__Impl rule__Elif__Group__3 ;
    public final void rule__Elif__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5050:1: ( rule__Elif__Group__2__Impl rule__Elif__Group__3 )
            // InternalFortXTrans.g:5051:2: rule__Elif__Group__2__Impl rule__Elif__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Elif__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Elif__Group__3();

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
    // $ANTLR end "rule__Elif__Group__2"


    // $ANTLR start "rule__Elif__Group__2__Impl"
    // InternalFortXTrans.g:5058:1: rule__Elif__Group__2__Impl : ( 'then' ) ;
    public final void rule__Elif__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5062:1: ( ( 'then' ) )
            // InternalFortXTrans.g:5063:1: ( 'then' )
            {
            // InternalFortXTrans.g:5063:1: ( 'then' )
            // InternalFortXTrans.g:5064:2: 'then'
            {
             before(grammarAccess.getElifAccess().getThenKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getElifAccess().getThenKeyword_2()); 

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
    // $ANTLR end "rule__Elif__Group__2__Impl"


    // $ANTLR start "rule__Elif__Group__3"
    // InternalFortXTrans.g:5073:1: rule__Elif__Group__3 : rule__Elif__Group__3__Impl ;
    public final void rule__Elif__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5077:1: ( rule__Elif__Group__3__Impl )
            // InternalFortXTrans.g:5078:2: rule__Elif__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Elif__Group__3__Impl();

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
    // $ANTLR end "rule__Elif__Group__3"


    // $ANTLR start "rule__Elif__Group__3__Impl"
    // InternalFortXTrans.g:5084:1: rule__Elif__Group__3__Impl : ( ( rule__Elif__BlockAssignment_3 ) ) ;
    public final void rule__Elif__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5088:1: ( ( ( rule__Elif__BlockAssignment_3 ) ) )
            // InternalFortXTrans.g:5089:1: ( ( rule__Elif__BlockAssignment_3 ) )
            {
            // InternalFortXTrans.g:5089:1: ( ( rule__Elif__BlockAssignment_3 ) )
            // InternalFortXTrans.g:5090:2: ( rule__Elif__BlockAssignment_3 )
            {
             before(grammarAccess.getElifAccess().getBlockAssignment_3()); 
            // InternalFortXTrans.g:5091:2: ( rule__Elif__BlockAssignment_3 )
            // InternalFortXTrans.g:5091:3: rule__Elif__BlockAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Elif__BlockAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getElifAccess().getBlockAssignment_3()); 

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
    // $ANTLR end "rule__Elif__Group__3__Impl"


    // $ANTLR start "rule__Else__Group__0"
    // InternalFortXTrans.g:5100:1: rule__Else__Group__0 : rule__Else__Group__0__Impl rule__Else__Group__1 ;
    public final void rule__Else__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5104:1: ( rule__Else__Group__0__Impl rule__Else__Group__1 )
            // InternalFortXTrans.g:5105:2: rule__Else__Group__0__Impl rule__Else__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Else__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Else__Group__1();

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
    // $ANTLR end "rule__Else__Group__0"


    // $ANTLR start "rule__Else__Group__0__Impl"
    // InternalFortXTrans.g:5112:1: rule__Else__Group__0__Impl : ( 'else' ) ;
    public final void rule__Else__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5116:1: ( ( 'else' ) )
            // InternalFortXTrans.g:5117:1: ( 'else' )
            {
            // InternalFortXTrans.g:5117:1: ( 'else' )
            // InternalFortXTrans.g:5118:2: 'else'
            {
             before(grammarAccess.getElseAccess().getElseKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getElseAccess().getElseKeyword_0()); 

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
    // $ANTLR end "rule__Else__Group__0__Impl"


    // $ANTLR start "rule__Else__Group__1"
    // InternalFortXTrans.g:5127:1: rule__Else__Group__1 : rule__Else__Group__1__Impl ;
    public final void rule__Else__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5131:1: ( rule__Else__Group__1__Impl )
            // InternalFortXTrans.g:5132:2: rule__Else__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Else__Group__1__Impl();

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
    // $ANTLR end "rule__Else__Group__1"


    // $ANTLR start "rule__Else__Group__1__Impl"
    // InternalFortXTrans.g:5138:1: rule__Else__Group__1__Impl : ( ( rule__Else__BlockAssignment_1 ) ) ;
    public final void rule__Else__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5142:1: ( ( ( rule__Else__BlockAssignment_1 ) ) )
            // InternalFortXTrans.g:5143:1: ( ( rule__Else__BlockAssignment_1 ) )
            {
            // InternalFortXTrans.g:5143:1: ( ( rule__Else__BlockAssignment_1 ) )
            // InternalFortXTrans.g:5144:2: ( rule__Else__BlockAssignment_1 )
            {
             before(grammarAccess.getElseAccess().getBlockAssignment_1()); 
            // InternalFortXTrans.g:5145:2: ( rule__Else__BlockAssignment_1 )
            // InternalFortXTrans.g:5145:3: rule__Else__BlockAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Else__BlockAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElseAccess().getBlockAssignment_1()); 

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
    // $ANTLR end "rule__Else__Group__1__Impl"


    // $ANTLR start "rule__Generators__Group__0"
    // InternalFortXTrans.g:5154:1: rule__Generators__Group__0 : rule__Generators__Group__0__Impl rule__Generators__Group__1 ;
    public final void rule__Generators__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5158:1: ( rule__Generators__Group__0__Impl rule__Generators__Group__1 )
            // InternalFortXTrans.g:5159:2: rule__Generators__Group__0__Impl rule__Generators__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Generators__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generators__Group__1();

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
    // $ANTLR end "rule__Generators__Group__0"


    // $ANTLR start "rule__Generators__Group__0__Impl"
    // InternalFortXTrans.g:5166:1: rule__Generators__Group__0__Impl : ( ( rule__Generators__BindingAssignment_0 ) ) ;
    public final void rule__Generators__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5170:1: ( ( ( rule__Generators__BindingAssignment_0 ) ) )
            // InternalFortXTrans.g:5171:1: ( ( rule__Generators__BindingAssignment_0 ) )
            {
            // InternalFortXTrans.g:5171:1: ( ( rule__Generators__BindingAssignment_0 ) )
            // InternalFortXTrans.g:5172:2: ( rule__Generators__BindingAssignment_0 )
            {
             before(grammarAccess.getGeneratorsAccess().getBindingAssignment_0()); 
            // InternalFortXTrans.g:5173:2: ( rule__Generators__BindingAssignment_0 )
            // InternalFortXTrans.g:5173:3: rule__Generators__BindingAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Generators__BindingAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorsAccess().getBindingAssignment_0()); 

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
    // $ANTLR end "rule__Generators__Group__0__Impl"


    // $ANTLR start "rule__Generators__Group__1"
    // InternalFortXTrans.g:5181:1: rule__Generators__Group__1 : rule__Generators__Group__1__Impl ;
    public final void rule__Generators__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5185:1: ( rule__Generators__Group__1__Impl )
            // InternalFortXTrans.g:5186:2: rule__Generators__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Generators__Group__1__Impl();

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
    // $ANTLR end "rule__Generators__Group__1"


    // $ANTLR start "rule__Generators__Group__1__Impl"
    // InternalFortXTrans.g:5192:1: rule__Generators__Group__1__Impl : ( ( rule__Generators__Group_1__0 )* ) ;
    public final void rule__Generators__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5196:1: ( ( ( rule__Generators__Group_1__0 )* ) )
            // InternalFortXTrans.g:5197:1: ( ( rule__Generators__Group_1__0 )* )
            {
            // InternalFortXTrans.g:5197:1: ( ( rule__Generators__Group_1__0 )* )
            // InternalFortXTrans.g:5198:2: ( rule__Generators__Group_1__0 )*
            {
             before(grammarAccess.getGeneratorsAccess().getGroup_1()); 
            // InternalFortXTrans.g:5199:2: ( rule__Generators__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==24) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalFortXTrans.g:5199:3: rule__Generators__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Generators__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getGeneratorsAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Generators__Group__1__Impl"


    // $ANTLR start "rule__Generators__Group_1__0"
    // InternalFortXTrans.g:5208:1: rule__Generators__Group_1__0 : rule__Generators__Group_1__0__Impl rule__Generators__Group_1__1 ;
    public final void rule__Generators__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5212:1: ( rule__Generators__Group_1__0__Impl rule__Generators__Group_1__1 )
            // InternalFortXTrans.g:5213:2: rule__Generators__Group_1__0__Impl rule__Generators__Group_1__1
            {
            pushFollow(FOLLOW_40);
            rule__Generators__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generators__Group_1__1();

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
    // $ANTLR end "rule__Generators__Group_1__0"


    // $ANTLR start "rule__Generators__Group_1__0__Impl"
    // InternalFortXTrans.g:5220:1: rule__Generators__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Generators__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5224:1: ( ( ',' ) )
            // InternalFortXTrans.g:5225:1: ( ',' )
            {
            // InternalFortXTrans.g:5225:1: ( ',' )
            // InternalFortXTrans.g:5226:2: ','
            {
             before(grammarAccess.getGeneratorsAccess().getCommaKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGeneratorsAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Generators__Group_1__0__Impl"


    // $ANTLR start "rule__Generators__Group_1__1"
    // InternalFortXTrans.g:5235:1: rule__Generators__Group_1__1 : rule__Generators__Group_1__1__Impl ;
    public final void rule__Generators__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5239:1: ( rule__Generators__Group_1__1__Impl )
            // InternalFortXTrans.g:5240:2: rule__Generators__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Generators__Group_1__1__Impl();

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
    // $ANTLR end "rule__Generators__Group_1__1"


    // $ANTLR start "rule__Generators__Group_1__1__Impl"
    // InternalFortXTrans.g:5246:1: rule__Generators__Group_1__1__Impl : ( ( rule__Generators__ClauseAssignment_1_1 ) ) ;
    public final void rule__Generators__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5250:1: ( ( ( rule__Generators__ClauseAssignment_1_1 ) ) )
            // InternalFortXTrans.g:5251:1: ( ( rule__Generators__ClauseAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:5251:1: ( ( rule__Generators__ClauseAssignment_1_1 ) )
            // InternalFortXTrans.g:5252:2: ( rule__Generators__ClauseAssignment_1_1 )
            {
             before(grammarAccess.getGeneratorsAccess().getClauseAssignment_1_1()); 
            // InternalFortXTrans.g:5253:2: ( rule__Generators__ClauseAssignment_1_1 )
            // InternalFortXTrans.g:5253:3: rule__Generators__ClauseAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Generators__ClauseAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorsAccess().getClauseAssignment_1_1()); 

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
    // $ANTLR end "rule__Generators__Group_1__1__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalFortXTrans.g:5262:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5266:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalFortXTrans.g:5267:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Binding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__1();

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
    // $ANTLR end "rule__Binding__Group__0"


    // $ANTLR start "rule__Binding__Group__0__Impl"
    // InternalFortXTrans.g:5274:1: rule__Binding__Group__0__Impl : ( ( rule__Binding__IdtupAssignment_0 ) ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5278:1: ( ( ( rule__Binding__IdtupAssignment_0 ) ) )
            // InternalFortXTrans.g:5279:1: ( ( rule__Binding__IdtupAssignment_0 ) )
            {
            // InternalFortXTrans.g:5279:1: ( ( rule__Binding__IdtupAssignment_0 ) )
            // InternalFortXTrans.g:5280:2: ( rule__Binding__IdtupAssignment_0 )
            {
             before(grammarAccess.getBindingAccess().getIdtupAssignment_0()); 
            // InternalFortXTrans.g:5281:2: ( rule__Binding__IdtupAssignment_0 )
            // InternalFortXTrans.g:5281:3: rule__Binding__IdtupAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__IdtupAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getIdtupAssignment_0()); 

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
    // $ANTLR end "rule__Binding__Group__0__Impl"


    // $ANTLR start "rule__Binding__Group__1"
    // InternalFortXTrans.g:5289:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5293:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalFortXTrans.g:5294:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Binding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__2();

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
    // $ANTLR end "rule__Binding__Group__1"


    // $ANTLR start "rule__Binding__Group__1__Impl"
    // InternalFortXTrans.g:5301:1: rule__Binding__Group__1__Impl : ( '<-' ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5305:1: ( ( '<-' ) )
            // InternalFortXTrans.g:5306:1: ( '<-' )
            {
            // InternalFortXTrans.g:5306:1: ( '<-' )
            // InternalFortXTrans.g:5307:2: '<-'
            {
             before(grammarAccess.getBindingAccess().getLessThanSignHyphenMinusKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getLessThanSignHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__Binding__Group__1__Impl"


    // $ANTLR start "rule__Binding__Group__2"
    // InternalFortXTrans.g:5316:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5320:1: ( rule__Binding__Group__2__Impl )
            // InternalFortXTrans.g:5321:2: rule__Binding__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__2__Impl();

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
    // $ANTLR end "rule__Binding__Group__2"


    // $ANTLR start "rule__Binding__Group__2__Impl"
    // InternalFortXTrans.g:5327:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__ExprAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5331:1: ( ( ( rule__Binding__ExprAssignment_2 ) ) )
            // InternalFortXTrans.g:5332:1: ( ( rule__Binding__ExprAssignment_2 ) )
            {
            // InternalFortXTrans.g:5332:1: ( ( rule__Binding__ExprAssignment_2 ) )
            // InternalFortXTrans.g:5333:2: ( rule__Binding__ExprAssignment_2 )
            {
             before(grammarAccess.getBindingAccess().getExprAssignment_2()); 
            // InternalFortXTrans.g:5334:2: ( rule__Binding__ExprAssignment_2 )
            // InternalFortXTrans.g:5334:3: rule__Binding__ExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Binding__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getExprAssignment_2()); 

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
    // $ANTLR end "rule__Binding__Group__2__Impl"


    // $ANTLR start "rule__BlockElems__Group__0"
    // InternalFortXTrans.g:5343:1: rule__BlockElems__Group__0 : rule__BlockElems__Group__0__Impl rule__BlockElems__Group__1 ;
    public final void rule__BlockElems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5347:1: ( rule__BlockElems__Group__0__Impl rule__BlockElems__Group__1 )
            // InternalFortXTrans.g:5348:2: rule__BlockElems__Group__0__Impl rule__BlockElems__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__BlockElems__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockElems__Group__1();

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
    // $ANTLR end "rule__BlockElems__Group__0"


    // $ANTLR start "rule__BlockElems__Group__0__Impl"
    // InternalFortXTrans.g:5355:1: rule__BlockElems__Group__0__Impl : ( ( rule__BlockElems__BlockAssignment_0 ) ) ;
    public final void rule__BlockElems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5359:1: ( ( ( rule__BlockElems__BlockAssignment_0 ) ) )
            // InternalFortXTrans.g:5360:1: ( ( rule__BlockElems__BlockAssignment_0 ) )
            {
            // InternalFortXTrans.g:5360:1: ( ( rule__BlockElems__BlockAssignment_0 ) )
            // InternalFortXTrans.g:5361:2: ( rule__BlockElems__BlockAssignment_0 )
            {
             before(grammarAccess.getBlockElemsAccess().getBlockAssignment_0()); 
            // InternalFortXTrans.g:5362:2: ( rule__BlockElems__BlockAssignment_0 )
            // InternalFortXTrans.g:5362:3: rule__BlockElems__BlockAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BlockElems__BlockAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBlockElemsAccess().getBlockAssignment_0()); 

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
    // $ANTLR end "rule__BlockElems__Group__0__Impl"


    // $ANTLR start "rule__BlockElems__Group__1"
    // InternalFortXTrans.g:5370:1: rule__BlockElems__Group__1 : rule__BlockElems__Group__1__Impl ;
    public final void rule__BlockElems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5374:1: ( rule__BlockElems__Group__1__Impl )
            // InternalFortXTrans.g:5375:2: rule__BlockElems__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockElems__Group__1__Impl();

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
    // $ANTLR end "rule__BlockElems__Group__1"


    // $ANTLR start "rule__BlockElems__Group__1__Impl"
    // InternalFortXTrans.g:5381:1: rule__BlockElems__Group__1__Impl : ( ( rule__BlockElems__BlockAssignment_1 )* ) ;
    public final void rule__BlockElems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5385:1: ( ( ( rule__BlockElems__BlockAssignment_1 )* ) )
            // InternalFortXTrans.g:5386:1: ( ( rule__BlockElems__BlockAssignment_1 )* )
            {
            // InternalFortXTrans.g:5386:1: ( ( rule__BlockElems__BlockAssignment_1 )* )
            // InternalFortXTrans.g:5387:2: ( rule__BlockElems__BlockAssignment_1 )*
            {
             before(grammarAccess.getBlockElemsAccess().getBlockAssignment_1()); 
            // InternalFortXTrans.g:5388:2: ( rule__BlockElems__BlockAssignment_1 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID||LA46_0==34||LA46_0==36||LA46_0==42||(LA46_0>=45 && LA46_0<=48)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalFortXTrans.g:5388:3: rule__BlockElems__BlockAssignment_1
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__BlockElems__BlockAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getBlockElemsAccess().getBlockAssignment_1()); 

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
    // $ANTLR end "rule__BlockElems__Group__1__Impl"


    // $ANTLR start "rule__Paranthesized__Group__0"
    // InternalFortXTrans.g:5397:1: rule__Paranthesized__Group__0 : rule__Paranthesized__Group__0__Impl rule__Paranthesized__Group__1 ;
    public final void rule__Paranthesized__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5401:1: ( rule__Paranthesized__Group__0__Impl rule__Paranthesized__Group__1 )
            // InternalFortXTrans.g:5402:2: rule__Paranthesized__Group__0__Impl rule__Paranthesized__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Paranthesized__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paranthesized__Group__1();

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
    // $ANTLR end "rule__Paranthesized__Group__0"


    // $ANTLR start "rule__Paranthesized__Group__0__Impl"
    // InternalFortXTrans.g:5409:1: rule__Paranthesized__Group__0__Impl : ( '(' ) ;
    public final void rule__Paranthesized__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5413:1: ( ( '(' ) )
            // InternalFortXTrans.g:5414:1: ( '(' )
            {
            // InternalFortXTrans.g:5414:1: ( '(' )
            // InternalFortXTrans.g:5415:2: '('
            {
             before(grammarAccess.getParanthesizedAccess().getLeftParenthesisKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getParanthesizedAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Paranthesized__Group__0__Impl"


    // $ANTLR start "rule__Paranthesized__Group__1"
    // InternalFortXTrans.g:5424:1: rule__Paranthesized__Group__1 : rule__Paranthesized__Group__1__Impl rule__Paranthesized__Group__2 ;
    public final void rule__Paranthesized__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5428:1: ( rule__Paranthesized__Group__1__Impl rule__Paranthesized__Group__2 )
            // InternalFortXTrans.g:5429:2: rule__Paranthesized__Group__1__Impl rule__Paranthesized__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Paranthesized__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paranthesized__Group__2();

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
    // $ANTLR end "rule__Paranthesized__Group__1"


    // $ANTLR start "rule__Paranthesized__Group__1__Impl"
    // InternalFortXTrans.g:5436:1: rule__Paranthesized__Group__1__Impl : ( ruleExpr ) ;
    public final void rule__Paranthesized__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5440:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:5441:1: ( ruleExpr )
            {
            // InternalFortXTrans.g:5441:1: ( ruleExpr )
            // InternalFortXTrans.g:5442:2: ruleExpr
            {
             before(grammarAccess.getParanthesizedAccess().getExprParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getParanthesizedAccess().getExprParserRuleCall_1()); 

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
    // $ANTLR end "rule__Paranthesized__Group__1__Impl"


    // $ANTLR start "rule__Paranthesized__Group__2"
    // InternalFortXTrans.g:5451:1: rule__Paranthesized__Group__2 : rule__Paranthesized__Group__2__Impl rule__Paranthesized__Group__3 ;
    public final void rule__Paranthesized__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5455:1: ( rule__Paranthesized__Group__2__Impl rule__Paranthesized__Group__3 )
            // InternalFortXTrans.g:5456:2: rule__Paranthesized__Group__2__Impl rule__Paranthesized__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Paranthesized__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paranthesized__Group__3();

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
    // $ANTLR end "rule__Paranthesized__Group__2"


    // $ANTLR start "rule__Paranthesized__Group__2__Impl"
    // InternalFortXTrans.g:5463:1: rule__Paranthesized__Group__2__Impl : ( () ) ;
    public final void rule__Paranthesized__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5467:1: ( ( () ) )
            // InternalFortXTrans.g:5468:1: ( () )
            {
            // InternalFortXTrans.g:5468:1: ( () )
            // InternalFortXTrans.g:5469:2: ()
            {
             before(grammarAccess.getParanthesizedAccess().getParanthesizedExprAction_2()); 
            // InternalFortXTrans.g:5470:2: ()
            // InternalFortXTrans.g:5470:3: 
            {
            }

             after(grammarAccess.getParanthesizedAccess().getParanthesizedExprAction_2()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paranthesized__Group__2__Impl"


    // $ANTLR start "rule__Paranthesized__Group__3"
    // InternalFortXTrans.g:5478:1: rule__Paranthesized__Group__3 : rule__Paranthesized__Group__3__Impl ;
    public final void rule__Paranthesized__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5482:1: ( rule__Paranthesized__Group__3__Impl )
            // InternalFortXTrans.g:5483:2: rule__Paranthesized__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paranthesized__Group__3__Impl();

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
    // $ANTLR end "rule__Paranthesized__Group__3"


    // $ANTLR start "rule__Paranthesized__Group__3__Impl"
    // InternalFortXTrans.g:5489:1: rule__Paranthesized__Group__3__Impl : ( ')' ) ;
    public final void rule__Paranthesized__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5493:1: ( ( ')' ) )
            // InternalFortXTrans.g:5494:1: ( ')' )
            {
            // InternalFortXTrans.g:5494:1: ( ')' )
            // InternalFortXTrans.g:5495:2: ')'
            {
             before(grammarAccess.getParanthesizedAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getParanthesizedAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Paranthesized__Group__3__Impl"


    // $ANTLR start "rule__Do__Group__0"
    // InternalFortXTrans.g:5505:1: rule__Do__Group__0 : rule__Do__Group__0__Impl rule__Do__Group__1 ;
    public final void rule__Do__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5509:1: ( rule__Do__Group__0__Impl rule__Do__Group__1 )
            // InternalFortXTrans.g:5510:2: rule__Do__Group__0__Impl rule__Do__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__Do__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Do__Group__1();

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
    // $ANTLR end "rule__Do__Group__0"


    // $ANTLR start "rule__Do__Group__0__Impl"
    // InternalFortXTrans.g:5517:1: rule__Do__Group__0__Impl : ( ( rule__Do__DofsAssignment_0 ) ) ;
    public final void rule__Do__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5521:1: ( ( ( rule__Do__DofsAssignment_0 ) ) )
            // InternalFortXTrans.g:5522:1: ( ( rule__Do__DofsAssignment_0 ) )
            {
            // InternalFortXTrans.g:5522:1: ( ( rule__Do__DofsAssignment_0 ) )
            // InternalFortXTrans.g:5523:2: ( rule__Do__DofsAssignment_0 )
            {
             before(grammarAccess.getDoAccess().getDofsAssignment_0()); 
            // InternalFortXTrans.g:5524:2: ( rule__Do__DofsAssignment_0 )
            // InternalFortXTrans.g:5524:3: rule__Do__DofsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Do__DofsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDoAccess().getDofsAssignment_0()); 

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
    // $ANTLR end "rule__Do__Group__0__Impl"


    // $ANTLR start "rule__Do__Group__1"
    // InternalFortXTrans.g:5532:1: rule__Do__Group__1 : rule__Do__Group__1__Impl rule__Do__Group__2 ;
    public final void rule__Do__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5536:1: ( rule__Do__Group__1__Impl rule__Do__Group__2 )
            // InternalFortXTrans.g:5537:2: rule__Do__Group__1__Impl rule__Do__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__Do__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Do__Group__2();

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
    // $ANTLR end "rule__Do__Group__1"


    // $ANTLR start "rule__Do__Group__1__Impl"
    // InternalFortXTrans.g:5544:1: rule__Do__Group__1__Impl : ( ( rule__Do__Group_1__0 )* ) ;
    public final void rule__Do__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5548:1: ( ( ( rule__Do__Group_1__0 )* ) )
            // InternalFortXTrans.g:5549:1: ( ( rule__Do__Group_1__0 )* )
            {
            // InternalFortXTrans.g:5549:1: ( ( rule__Do__Group_1__0 )* )
            // InternalFortXTrans.g:5550:2: ( rule__Do__Group_1__0 )*
            {
             before(grammarAccess.getDoAccess().getGroup_1()); 
            // InternalFortXTrans.g:5551:2: ( rule__Do__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==35) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalFortXTrans.g:5551:3: rule__Do__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__Do__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getDoAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Do__Group__1__Impl"


    // $ANTLR start "rule__Do__Group__2"
    // InternalFortXTrans.g:5559:1: rule__Do__Group__2 : rule__Do__Group__2__Impl ;
    public final void rule__Do__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5563:1: ( rule__Do__Group__2__Impl )
            // InternalFortXTrans.g:5564:2: rule__Do__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Do__Group__2__Impl();

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
    // $ANTLR end "rule__Do__Group__2"


    // $ANTLR start "rule__Do__Group__2__Impl"
    // InternalFortXTrans.g:5570:1: rule__Do__Group__2__Impl : ( 'end' ) ;
    public final void rule__Do__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5574:1: ( ( 'end' ) )
            // InternalFortXTrans.g:5575:1: ( 'end' )
            {
            // InternalFortXTrans.g:5575:1: ( 'end' )
            // InternalFortXTrans.g:5576:2: 'end'
            {
             before(grammarAccess.getDoAccess().getEndKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDoAccess().getEndKeyword_2()); 

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
    // $ANTLR end "rule__Do__Group__2__Impl"


    // $ANTLR start "rule__Do__Group_1__0"
    // InternalFortXTrans.g:5586:1: rule__Do__Group_1__0 : rule__Do__Group_1__0__Impl rule__Do__Group_1__1 ;
    public final void rule__Do__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5590:1: ( rule__Do__Group_1__0__Impl rule__Do__Group_1__1 )
            // InternalFortXTrans.g:5591:2: rule__Do__Group_1__0__Impl rule__Do__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__Do__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Do__Group_1__1();

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
    // $ANTLR end "rule__Do__Group_1__0"


    // $ANTLR start "rule__Do__Group_1__0__Impl"
    // InternalFortXTrans.g:5598:1: rule__Do__Group_1__0__Impl : ( 'also' ) ;
    public final void rule__Do__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5602:1: ( ( 'also' ) )
            // InternalFortXTrans.g:5603:1: ( 'also' )
            {
            // InternalFortXTrans.g:5603:1: ( 'also' )
            // InternalFortXTrans.g:5604:2: 'also'
            {
             before(grammarAccess.getDoAccess().getAlsoKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDoAccess().getAlsoKeyword_1_0()); 

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
    // $ANTLR end "rule__Do__Group_1__0__Impl"


    // $ANTLR start "rule__Do__Group_1__1"
    // InternalFortXTrans.g:5613:1: rule__Do__Group_1__1 : rule__Do__Group_1__1__Impl ;
    public final void rule__Do__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5617:1: ( rule__Do__Group_1__1__Impl )
            // InternalFortXTrans.g:5618:2: rule__Do__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Do__Group_1__1__Impl();

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
    // $ANTLR end "rule__Do__Group_1__1"


    // $ANTLR start "rule__Do__Group_1__1__Impl"
    // InternalFortXTrans.g:5624:1: rule__Do__Group_1__1__Impl : ( ( rule__Do__DofsAssignment_1_1 ) ) ;
    public final void rule__Do__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5628:1: ( ( ( rule__Do__DofsAssignment_1_1 ) ) )
            // InternalFortXTrans.g:5629:1: ( ( rule__Do__DofsAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:5629:1: ( ( rule__Do__DofsAssignment_1_1 ) )
            // InternalFortXTrans.g:5630:2: ( rule__Do__DofsAssignment_1_1 )
            {
             before(grammarAccess.getDoAccess().getDofsAssignment_1_1()); 
            // InternalFortXTrans.g:5631:2: ( rule__Do__DofsAssignment_1_1 )
            // InternalFortXTrans.g:5631:3: rule__Do__DofsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Do__DofsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDoAccess().getDofsAssignment_1_1()); 

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
    // $ANTLR end "rule__Do__Group_1__1__Impl"


    // $ANTLR start "rule__DoFront__Group__0"
    // InternalFortXTrans.g:5640:1: rule__DoFront__Group__0 : rule__DoFront__Group__0__Impl rule__DoFront__Group__1 ;
    public final void rule__DoFront__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5644:1: ( rule__DoFront__Group__0__Impl rule__DoFront__Group__1 )
            // InternalFortXTrans.g:5645:2: rule__DoFront__Group__0__Impl rule__DoFront__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__DoFront__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoFront__Group__1();

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
    // $ANTLR end "rule__DoFront__Group__0"


    // $ANTLR start "rule__DoFront__Group__0__Impl"
    // InternalFortXTrans.g:5652:1: rule__DoFront__Group__0__Impl : ( ( rule__DoFront__Group_0__0 )? ) ;
    public final void rule__DoFront__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5656:1: ( ( ( rule__DoFront__Group_0__0 )? ) )
            // InternalFortXTrans.g:5657:1: ( ( rule__DoFront__Group_0__0 )? )
            {
            // InternalFortXTrans.g:5657:1: ( ( rule__DoFront__Group_0__0 )? )
            // InternalFortXTrans.g:5658:2: ( rule__DoFront__Group_0__0 )?
            {
             before(grammarAccess.getDoFrontAccess().getGroup_0()); 
            // InternalFortXTrans.g:5659:2: ( rule__DoFront__Group_0__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==48) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalFortXTrans.g:5659:3: rule__DoFront__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoFront__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDoFrontAccess().getGroup_0()); 

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
    // $ANTLR end "rule__DoFront__Group__0__Impl"


    // $ANTLR start "rule__DoFront__Group__1"
    // InternalFortXTrans.g:5667:1: rule__DoFront__Group__1 : rule__DoFront__Group__1__Impl rule__DoFront__Group__2 ;
    public final void rule__DoFront__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5671:1: ( rule__DoFront__Group__1__Impl rule__DoFront__Group__2 )
            // InternalFortXTrans.g:5672:2: rule__DoFront__Group__1__Impl rule__DoFront__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__DoFront__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoFront__Group__2();

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
    // $ANTLR end "rule__DoFront__Group__1"


    // $ANTLR start "rule__DoFront__Group__1__Impl"
    // InternalFortXTrans.g:5679:1: rule__DoFront__Group__1__Impl : ( ( rule__DoFront__AtomAssignment_1 )? ) ;
    public final void rule__DoFront__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5683:1: ( ( ( rule__DoFront__AtomAssignment_1 )? ) )
            // InternalFortXTrans.g:5684:1: ( ( rule__DoFront__AtomAssignment_1 )? )
            {
            // InternalFortXTrans.g:5684:1: ( ( rule__DoFront__AtomAssignment_1 )? )
            // InternalFortXTrans.g:5685:2: ( rule__DoFront__AtomAssignment_1 )?
            {
             before(grammarAccess.getDoFrontAccess().getAtomAssignment_1()); 
            // InternalFortXTrans.g:5686:2: ( rule__DoFront__AtomAssignment_1 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==42) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalFortXTrans.g:5686:3: rule__DoFront__AtomAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoFront__AtomAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDoFrontAccess().getAtomAssignment_1()); 

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
    // $ANTLR end "rule__DoFront__Group__1__Impl"


    // $ANTLR start "rule__DoFront__Group__2"
    // InternalFortXTrans.g:5694:1: rule__DoFront__Group__2 : rule__DoFront__Group__2__Impl rule__DoFront__Group__3 ;
    public final void rule__DoFront__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5698:1: ( rule__DoFront__Group__2__Impl rule__DoFront__Group__3 )
            // InternalFortXTrans.g:5699:2: rule__DoFront__Group__2__Impl rule__DoFront__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__DoFront__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoFront__Group__3();

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
    // $ANTLR end "rule__DoFront__Group__2"


    // $ANTLR start "rule__DoFront__Group__2__Impl"
    // InternalFortXTrans.g:5706:1: rule__DoFront__Group__2__Impl : ( 'do' ) ;
    public final void rule__DoFront__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5710:1: ( ( 'do' ) )
            // InternalFortXTrans.g:5711:1: ( 'do' )
            {
            // InternalFortXTrans.g:5711:1: ( 'do' )
            // InternalFortXTrans.g:5712:2: 'do'
            {
             before(grammarAccess.getDoFrontAccess().getDoKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDoFrontAccess().getDoKeyword_2()); 

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
    // $ANTLR end "rule__DoFront__Group__2__Impl"


    // $ANTLR start "rule__DoFront__Group__3"
    // InternalFortXTrans.g:5721:1: rule__DoFront__Group__3 : rule__DoFront__Group__3__Impl ;
    public final void rule__DoFront__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5725:1: ( rule__DoFront__Group__3__Impl )
            // InternalFortXTrans.g:5726:2: rule__DoFront__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoFront__Group__3__Impl();

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
    // $ANTLR end "rule__DoFront__Group__3"


    // $ANTLR start "rule__DoFront__Group__3__Impl"
    // InternalFortXTrans.g:5732:1: rule__DoFront__Group__3__Impl : ( ( rule__DoFront__BlockAssignment_3 ) ) ;
    public final void rule__DoFront__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5736:1: ( ( ( rule__DoFront__BlockAssignment_3 ) ) )
            // InternalFortXTrans.g:5737:1: ( ( rule__DoFront__BlockAssignment_3 ) )
            {
            // InternalFortXTrans.g:5737:1: ( ( rule__DoFront__BlockAssignment_3 ) )
            // InternalFortXTrans.g:5738:2: ( rule__DoFront__BlockAssignment_3 )
            {
             before(grammarAccess.getDoFrontAccess().getBlockAssignment_3()); 
            // InternalFortXTrans.g:5739:2: ( rule__DoFront__BlockAssignment_3 )
            // InternalFortXTrans.g:5739:3: rule__DoFront__BlockAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DoFront__BlockAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDoFrontAccess().getBlockAssignment_3()); 

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
    // $ANTLR end "rule__DoFront__Group__3__Impl"


    // $ANTLR start "rule__DoFront__Group_0__0"
    // InternalFortXTrans.g:5748:1: rule__DoFront__Group_0__0 : rule__DoFront__Group_0__0__Impl rule__DoFront__Group_0__1 ;
    public final void rule__DoFront__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5752:1: ( rule__DoFront__Group_0__0__Impl rule__DoFront__Group_0__1 )
            // InternalFortXTrans.g:5753:2: rule__DoFront__Group_0__0__Impl rule__DoFront__Group_0__1
            {
            pushFollow(FOLLOW_32);
            rule__DoFront__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoFront__Group_0__1();

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
    // $ANTLR end "rule__DoFront__Group_0__0"


    // $ANTLR start "rule__DoFront__Group_0__0__Impl"
    // InternalFortXTrans.g:5760:1: rule__DoFront__Group_0__0__Impl : ( ( rule__DoFront__AtAssignment_0_0 ) ) ;
    public final void rule__DoFront__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5764:1: ( ( ( rule__DoFront__AtAssignment_0_0 ) ) )
            // InternalFortXTrans.g:5765:1: ( ( rule__DoFront__AtAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:5765:1: ( ( rule__DoFront__AtAssignment_0_0 ) )
            // InternalFortXTrans.g:5766:2: ( rule__DoFront__AtAssignment_0_0 )
            {
             before(grammarAccess.getDoFrontAccess().getAtAssignment_0_0()); 
            // InternalFortXTrans.g:5767:2: ( rule__DoFront__AtAssignment_0_0 )
            // InternalFortXTrans.g:5767:3: rule__DoFront__AtAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__DoFront__AtAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDoFrontAccess().getAtAssignment_0_0()); 

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
    // $ANTLR end "rule__DoFront__Group_0__0__Impl"


    // $ANTLR start "rule__DoFront__Group_0__1"
    // InternalFortXTrans.g:5775:1: rule__DoFront__Group_0__1 : rule__DoFront__Group_0__1__Impl ;
    public final void rule__DoFront__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5779:1: ( rule__DoFront__Group_0__1__Impl )
            // InternalFortXTrans.g:5780:2: rule__DoFront__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoFront__Group_0__1__Impl();

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
    // $ANTLR end "rule__DoFront__Group_0__1"


    // $ANTLR start "rule__DoFront__Group_0__1__Impl"
    // InternalFortXTrans.g:5786:1: rule__DoFront__Group_0__1__Impl : ( ( rule__DoFront__ExpAssignment_0_1 ) ) ;
    public final void rule__DoFront__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5790:1: ( ( ( rule__DoFront__ExpAssignment_0_1 ) ) )
            // InternalFortXTrans.g:5791:1: ( ( rule__DoFront__ExpAssignment_0_1 ) )
            {
            // InternalFortXTrans.g:5791:1: ( ( rule__DoFront__ExpAssignment_0_1 ) )
            // InternalFortXTrans.g:5792:2: ( rule__DoFront__ExpAssignment_0_1 )
            {
             before(grammarAccess.getDoFrontAccess().getExpAssignment_0_1()); 
            // InternalFortXTrans.g:5793:2: ( rule__DoFront__ExpAssignment_0_1 )
            // InternalFortXTrans.g:5793:3: rule__DoFront__ExpAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DoFront__ExpAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDoFrontAccess().getExpAssignment_0_1()); 

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
    // $ANTLR end "rule__DoFront__Group_0__1__Impl"


    // $ANTLR start "rule__IdOrTuple__Group_1__0"
    // InternalFortXTrans.g:5802:1: rule__IdOrTuple__Group_1__0 : rule__IdOrTuple__Group_1__0__Impl rule__IdOrTuple__Group_1__1 ;
    public final void rule__IdOrTuple__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5806:1: ( rule__IdOrTuple__Group_1__0__Impl rule__IdOrTuple__Group_1__1 )
            // InternalFortXTrans.g:5807:2: rule__IdOrTuple__Group_1__0__Impl rule__IdOrTuple__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__IdOrTuple__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IdOrTuple__Group_1__1();

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
    // $ANTLR end "rule__IdOrTuple__Group_1__0"


    // $ANTLR start "rule__IdOrTuple__Group_1__0__Impl"
    // InternalFortXTrans.g:5814:1: rule__IdOrTuple__Group_1__0__Impl : ( '(' ) ;
    public final void rule__IdOrTuple__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5818:1: ( ( '(' ) )
            // InternalFortXTrans.g:5819:1: ( '(' )
            {
            // InternalFortXTrans.g:5819:1: ( '(' )
            // InternalFortXTrans.g:5820:2: '('
            {
             before(grammarAccess.getIdOrTupleAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getIdOrTupleAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__IdOrTuple__Group_1__0__Impl"


    // $ANTLR start "rule__IdOrTuple__Group_1__1"
    // InternalFortXTrans.g:5829:1: rule__IdOrTuple__Group_1__1 : rule__IdOrTuple__Group_1__1__Impl rule__IdOrTuple__Group_1__2 ;
    public final void rule__IdOrTuple__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5833:1: ( rule__IdOrTuple__Group_1__1__Impl rule__IdOrTuple__Group_1__2 )
            // InternalFortXTrans.g:5834:2: rule__IdOrTuple__Group_1__1__Impl rule__IdOrTuple__Group_1__2
            {
            pushFollow(FOLLOW_45);
            rule__IdOrTuple__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IdOrTuple__Group_1__2();

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
    // $ANTLR end "rule__IdOrTuple__Group_1__1"


    // $ANTLR start "rule__IdOrTuple__Group_1__1__Impl"
    // InternalFortXTrans.g:5841:1: rule__IdOrTuple__Group_1__1__Impl : ( ( rule__IdOrTuple__BidAssignment_1_1 ) ) ;
    public final void rule__IdOrTuple__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5845:1: ( ( ( rule__IdOrTuple__BidAssignment_1_1 ) ) )
            // InternalFortXTrans.g:5846:1: ( ( rule__IdOrTuple__BidAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:5846:1: ( ( rule__IdOrTuple__BidAssignment_1_1 ) )
            // InternalFortXTrans.g:5847:2: ( rule__IdOrTuple__BidAssignment_1_1 )
            {
             before(grammarAccess.getIdOrTupleAccess().getBidAssignment_1_1()); 
            // InternalFortXTrans.g:5848:2: ( rule__IdOrTuple__BidAssignment_1_1 )
            // InternalFortXTrans.g:5848:3: rule__IdOrTuple__BidAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__IdOrTuple__BidAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIdOrTupleAccess().getBidAssignment_1_1()); 

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
    // $ANTLR end "rule__IdOrTuple__Group_1__1__Impl"


    // $ANTLR start "rule__IdOrTuple__Group_1__2"
    // InternalFortXTrans.g:5856:1: rule__IdOrTuple__Group_1__2 : rule__IdOrTuple__Group_1__2__Impl rule__IdOrTuple__Group_1__3 ;
    public final void rule__IdOrTuple__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5860:1: ( rule__IdOrTuple__Group_1__2__Impl rule__IdOrTuple__Group_1__3 )
            // InternalFortXTrans.g:5861:2: rule__IdOrTuple__Group_1__2__Impl rule__IdOrTuple__Group_1__3
            {
            pushFollow(FOLLOW_45);
            rule__IdOrTuple__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IdOrTuple__Group_1__3();

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
    // $ANTLR end "rule__IdOrTuple__Group_1__2"


    // $ANTLR start "rule__IdOrTuple__Group_1__2__Impl"
    // InternalFortXTrans.g:5868:1: rule__IdOrTuple__Group_1__2__Impl : ( ( rule__IdOrTuple__Group_1_2__0 )* ) ;
    public final void rule__IdOrTuple__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5872:1: ( ( ( rule__IdOrTuple__Group_1_2__0 )* ) )
            // InternalFortXTrans.g:5873:1: ( ( rule__IdOrTuple__Group_1_2__0 )* )
            {
            // InternalFortXTrans.g:5873:1: ( ( rule__IdOrTuple__Group_1_2__0 )* )
            // InternalFortXTrans.g:5874:2: ( rule__IdOrTuple__Group_1_2__0 )*
            {
             before(grammarAccess.getIdOrTupleAccess().getGroup_1_2()); 
            // InternalFortXTrans.g:5875:2: ( rule__IdOrTuple__Group_1_2__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==24) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalFortXTrans.g:5875:3: rule__IdOrTuple__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__IdOrTuple__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getIdOrTupleAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__IdOrTuple__Group_1__2__Impl"


    // $ANTLR start "rule__IdOrTuple__Group_1__3"
    // InternalFortXTrans.g:5883:1: rule__IdOrTuple__Group_1__3 : rule__IdOrTuple__Group_1__3__Impl ;
    public final void rule__IdOrTuple__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5887:1: ( rule__IdOrTuple__Group_1__3__Impl )
            // InternalFortXTrans.g:5888:2: rule__IdOrTuple__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IdOrTuple__Group_1__3__Impl();

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
    // $ANTLR end "rule__IdOrTuple__Group_1__3"


    // $ANTLR start "rule__IdOrTuple__Group_1__3__Impl"
    // InternalFortXTrans.g:5894:1: rule__IdOrTuple__Group_1__3__Impl : ( ')' ) ;
    public final void rule__IdOrTuple__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5898:1: ( ( ')' ) )
            // InternalFortXTrans.g:5899:1: ( ')' )
            {
            // InternalFortXTrans.g:5899:1: ( ')' )
            // InternalFortXTrans.g:5900:2: ')'
            {
             before(grammarAccess.getIdOrTupleAccess().getRightParenthesisKeyword_1_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getIdOrTupleAccess().getRightParenthesisKeyword_1_3()); 

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
    // $ANTLR end "rule__IdOrTuple__Group_1__3__Impl"


    // $ANTLR start "rule__IdOrTuple__Group_1_2__0"
    // InternalFortXTrans.g:5910:1: rule__IdOrTuple__Group_1_2__0 : rule__IdOrTuple__Group_1_2__0__Impl rule__IdOrTuple__Group_1_2__1 ;
    public final void rule__IdOrTuple__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5914:1: ( rule__IdOrTuple__Group_1_2__0__Impl rule__IdOrTuple__Group_1_2__1 )
            // InternalFortXTrans.g:5915:2: rule__IdOrTuple__Group_1_2__0__Impl rule__IdOrTuple__Group_1_2__1
            {
            pushFollow(FOLLOW_25);
            rule__IdOrTuple__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IdOrTuple__Group_1_2__1();

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
    // $ANTLR end "rule__IdOrTuple__Group_1_2__0"


    // $ANTLR start "rule__IdOrTuple__Group_1_2__0__Impl"
    // InternalFortXTrans.g:5922:1: rule__IdOrTuple__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__IdOrTuple__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5926:1: ( ( ',' ) )
            // InternalFortXTrans.g:5927:1: ( ',' )
            {
            // InternalFortXTrans.g:5927:1: ( ',' )
            // InternalFortXTrans.g:5928:2: ','
            {
             before(grammarAccess.getIdOrTupleAccess().getCommaKeyword_1_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getIdOrTupleAccess().getCommaKeyword_1_2_0()); 

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
    // $ANTLR end "rule__IdOrTuple__Group_1_2__0__Impl"


    // $ANTLR start "rule__IdOrTuple__Group_1_2__1"
    // InternalFortXTrans.g:5937:1: rule__IdOrTuple__Group_1_2__1 : rule__IdOrTuple__Group_1_2__1__Impl ;
    public final void rule__IdOrTuple__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5941:1: ( rule__IdOrTuple__Group_1_2__1__Impl )
            // InternalFortXTrans.g:5942:2: rule__IdOrTuple__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IdOrTuple__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__IdOrTuple__Group_1_2__1"


    // $ANTLR start "rule__IdOrTuple__Group_1_2__1__Impl"
    // InternalFortXTrans.g:5948:1: rule__IdOrTuple__Group_1_2__1__Impl : ( ( rule__IdOrTuple__BidAssignment_1_2_1 ) ) ;
    public final void rule__IdOrTuple__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5952:1: ( ( ( rule__IdOrTuple__BidAssignment_1_2_1 ) ) )
            // InternalFortXTrans.g:5953:1: ( ( rule__IdOrTuple__BidAssignment_1_2_1 ) )
            {
            // InternalFortXTrans.g:5953:1: ( ( rule__IdOrTuple__BidAssignment_1_2_1 ) )
            // InternalFortXTrans.g:5954:2: ( rule__IdOrTuple__BidAssignment_1_2_1 )
            {
             before(grammarAccess.getIdOrTupleAccess().getBidAssignment_1_2_1()); 
            // InternalFortXTrans.g:5955:2: ( rule__IdOrTuple__BidAssignment_1_2_1 )
            // InternalFortXTrans.g:5955:3: rule__IdOrTuple__BidAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__IdOrTuple__BidAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIdOrTupleAccess().getBidAssignment_1_2_1()); 

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
    // $ANTLR end "rule__IdOrTuple__Group_1_2__1__Impl"


    // $ANTLR start "rule__IsType__Group__0"
    // InternalFortXTrans.g:5964:1: rule__IsType__Group__0 : rule__IsType__Group__0__Impl rule__IsType__Group__1 ;
    public final void rule__IsType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5968:1: ( rule__IsType__Group__0__Impl rule__IsType__Group__1 )
            // InternalFortXTrans.g:5969:2: rule__IsType__Group__0__Impl rule__IsType__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__IsType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsType__Group__1();

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
    // $ANTLR end "rule__IsType__Group__0"


    // $ANTLR start "rule__IsType__Group__0__Impl"
    // InternalFortXTrans.g:5976:1: rule__IsType__Group__0__Impl : ( ':' ) ;
    public final void rule__IsType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5980:1: ( ( ':' ) )
            // InternalFortXTrans.g:5981:1: ( ':' )
            {
            // InternalFortXTrans.g:5981:1: ( ':' )
            // InternalFortXTrans.g:5982:2: ':'
            {
             before(grammarAccess.getIsTypeAccess().getColonKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getIsTypeAccess().getColonKeyword_0()); 

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
    // $ANTLR end "rule__IsType__Group__0__Impl"


    // $ANTLR start "rule__IsType__Group__1"
    // InternalFortXTrans.g:5991:1: rule__IsType__Group__1 : rule__IsType__Group__1__Impl ;
    public final void rule__IsType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5995:1: ( rule__IsType__Group__1__Impl )
            // InternalFortXTrans.g:5996:2: rule__IsType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IsType__Group__1__Impl();

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
    // $ANTLR end "rule__IsType__Group__1"


    // $ANTLR start "rule__IsType__Group__1__Impl"
    // InternalFortXTrans.g:6002:1: rule__IsType__Group__1__Impl : ( ( rule__IsType__TypeAssignment_1 ) ) ;
    public final void rule__IsType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6006:1: ( ( ( rule__IsType__TypeAssignment_1 ) ) )
            // InternalFortXTrans.g:6007:1: ( ( rule__IsType__TypeAssignment_1 ) )
            {
            // InternalFortXTrans.g:6007:1: ( ( rule__IsType__TypeAssignment_1 ) )
            // InternalFortXTrans.g:6008:2: ( rule__IsType__TypeAssignment_1 )
            {
             before(grammarAccess.getIsTypeAccess().getTypeAssignment_1()); 
            // InternalFortXTrans.g:6009:2: ( rule__IsType__TypeAssignment_1 )
            // InternalFortXTrans.g:6009:3: rule__IsType__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IsType__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIsTypeAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__IsType__Group__1__Impl"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalFortXTrans.g:6018:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6022:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:6023:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:6023:2: ( RULE_ID )
            // InternalFortXTrans.g:6024:3: RULE_ID
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
    // InternalFortXTrans.g:6033:1: rule__Component__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Component__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6037:1: ( ( ruleImport ) )
            // InternalFortXTrans.g:6038:2: ( ruleImport )
            {
            // InternalFortXTrans.g:6038:2: ( ruleImport )
            // InternalFortXTrans.g:6039:3: ruleImport
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
    // InternalFortXTrans.g:6048:1: rule__Component__ExportsAssignment_3 : ( ruleExport ) ;
    public final void rule__Component__ExportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6052:1: ( ( ruleExport ) )
            // InternalFortXTrans.g:6053:2: ( ruleExport )
            {
            // InternalFortXTrans.g:6053:2: ( ruleExport )
            // InternalFortXTrans.g:6054:3: ruleExport
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


    // $ANTLR start "rule__Component__DeclsAssignment_4"
    // InternalFortXTrans.g:6063:1: rule__Component__DeclsAssignment_4 : ( ruleDecls ) ;
    public final void rule__Component__DeclsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6067:1: ( ( ruleDecls ) )
            // InternalFortXTrans.g:6068:2: ( ruleDecls )
            {
            // InternalFortXTrans.g:6068:2: ( ruleDecls )
            // InternalFortXTrans.g:6069:3: ruleDecls
            {
             before(grammarAccess.getComponentAccess().getDeclsDeclsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDecls();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getDeclsDeclsParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Component__DeclsAssignment_4"


    // $ANTLR start "rule__API__NameAssignment_1"
    // InternalFortXTrans.g:6078:1: rule__API__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__API__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6082:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:6083:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:6083:2: ( RULE_ID )
            // InternalFortXTrans.g:6084:3: RULE_ID
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
    // InternalFortXTrans.g:6093:1: rule__API__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__API__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6097:1: ( ( ruleImport ) )
            // InternalFortXTrans.g:6098:2: ( ruleImport )
            {
            // InternalFortXTrans.g:6098:2: ( ruleImport )
            // InternalFortXTrans.g:6099:3: ruleImport
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


    // $ANTLR start "rule__Import__ImpsAssignment_0_0"
    // InternalFortXTrans.g:6108:1: rule__Import__ImpsAssignment_0_0 : ( ( 'import' ) ) ;
    public final void rule__Import__ImpsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6112:1: ( ( ( 'import' ) ) )
            // InternalFortXTrans.g:6113:2: ( ( 'import' ) )
            {
            // InternalFortXTrans.g:6113:2: ( ( 'import' ) )
            // InternalFortXTrans.g:6114:3: ( 'import' )
            {
             before(grammarAccess.getImportAccess().getImpsImportKeyword_0_0_0()); 
            // InternalFortXTrans.g:6115:3: ( 'import' )
            // InternalFortXTrans.g:6116:4: 'import'
            {
             before(grammarAccess.getImportAccess().getImpsImportKeyword_0_0_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalFortXTrans.g:6127:1: rule__Import__ImportedNamesAssignment_0_1 : ( ruleImportedNames ) ;
    public final void rule__Import__ImportedNamesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6131:1: ( ( ruleImportedNames ) )
            // InternalFortXTrans.g:6132:2: ( ruleImportedNames )
            {
            // InternalFortXTrans.g:6132:2: ( ruleImportedNames )
            // InternalFortXTrans.g:6133:3: ruleImportedNames
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
    // InternalFortXTrans.g:6142:1: rule__Import__ImpsAssignment_1_0 : ( ( 'import' ) ) ;
    public final void rule__Import__ImpsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6146:1: ( ( ( 'import' ) ) )
            // InternalFortXTrans.g:6147:2: ( ( 'import' ) )
            {
            // InternalFortXTrans.g:6147:2: ( ( 'import' ) )
            // InternalFortXTrans.g:6148:3: ( 'import' )
            {
             before(grammarAccess.getImportAccess().getImpsImportKeyword_1_0_0()); 
            // InternalFortXTrans.g:6149:3: ( 'import' )
            // InternalFortXTrans.g:6150:4: 'import'
            {
             before(grammarAccess.getImportAccess().getImpsImportKeyword_1_0_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalFortXTrans.g:6161:1: rule__Import__ApiAssignment_1_1 : ( ( 'api' ) ) ;
    public final void rule__Import__ApiAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6165:1: ( ( ( 'api' ) ) )
            // InternalFortXTrans.g:6166:2: ( ( 'api' ) )
            {
            // InternalFortXTrans.g:6166:2: ( ( 'api' ) )
            // InternalFortXTrans.g:6167:3: ( 'api' )
            {
             before(grammarAccess.getImportAccess().getApiApiKeyword_1_1_0()); 
            // InternalFortXTrans.g:6168:3: ( 'api' )
            // InternalFortXTrans.g:6169:4: 'api'
            {
             before(grammarAccess.getImportAccess().getApiApiKeyword_1_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalFortXTrans.g:6180:1: rule__Import__AliasedimportedNamesAssignment_1_2 : ( ruleAliasedAPINames ) ;
    public final void rule__Import__AliasedimportedNamesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6184:1: ( ( ruleAliasedAPINames ) )
            // InternalFortXTrans.g:6185:2: ( ruleAliasedAPINames )
            {
            // InternalFortXTrans.g:6185:2: ( ruleAliasedAPINames )
            // InternalFortXTrans.g:6186:3: ruleAliasedAPINames
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
    // InternalFortXTrans.g:6195:1: rule__Export__ExpAssignment_0_0 : ( ( 'export' ) ) ;
    public final void rule__Export__ExpAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6199:1: ( ( ( 'export' ) ) )
            // InternalFortXTrans.g:6200:2: ( ( 'export' ) )
            {
            // InternalFortXTrans.g:6200:2: ( ( 'export' ) )
            // InternalFortXTrans.g:6201:3: ( 'export' )
            {
             before(grammarAccess.getExportAccess().getExpExportKeyword_0_0_0()); 
            // InternalFortXTrans.g:6202:3: ( 'export' )
            // InternalFortXTrans.g:6203:4: 'export'
            {
             before(grammarAccess.getExportAccess().getExpExportKeyword_0_0_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalFortXTrans.g:6214:1: rule__Export__ExportedNameAssignment_0_1 : ( ruleAPIName ) ;
    public final void rule__Export__ExportedNameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6218:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:6219:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:6219:2: ( ruleAPIName )
            // InternalFortXTrans.g:6220:3: ruleAPIName
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
    // InternalFortXTrans.g:6229:1: rule__Export__ExpAssignment_1_0 : ( ( 'export' ) ) ;
    public final void rule__Export__ExpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6233:1: ( ( ( 'export' ) ) )
            // InternalFortXTrans.g:6234:2: ( ( 'export' ) )
            {
            // InternalFortXTrans.g:6234:2: ( ( 'export' ) )
            // InternalFortXTrans.g:6235:3: ( 'export' )
            {
             before(grammarAccess.getExportAccess().getExpExportKeyword_1_0_0()); 
            // InternalFortXTrans.g:6236:3: ( 'export' )
            // InternalFortXTrans.g:6237:4: 'export'
            {
             before(grammarAccess.getExportAccess().getExpExportKeyword_1_0_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalFortXTrans.g:6248:1: rule__Export__BrackAssignment_1_1 : ( ( '{' ) ) ;
    public final void rule__Export__BrackAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6252:1: ( ( ( '{' ) ) )
            // InternalFortXTrans.g:6253:2: ( ( '{' ) )
            {
            // InternalFortXTrans.g:6253:2: ( ( '{' ) )
            // InternalFortXTrans.g:6254:3: ( '{' )
            {
             before(grammarAccess.getExportAccess().getBrackLeftCurlyBracketKeyword_1_1_0()); 
            // InternalFortXTrans.g:6255:3: ( '{' )
            // InternalFortXTrans.g:6256:4: '{'
            {
             before(grammarAccess.getExportAccess().getBrackLeftCurlyBracketKeyword_1_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFortXTrans.g:6267:1: rule__Export__ExportedNameAssignment_1_2 : ( ruleAPIName ) ;
    public final void rule__Export__ExportedNameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6271:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:6272:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:6272:2: ( ruleAPIName )
            // InternalFortXTrans.g:6273:3: ruleAPIName
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
    // InternalFortXTrans.g:6282:1: rule__Export__ExportedNameAssignment_1_3_1 : ( ruleAPIName ) ;
    public final void rule__Export__ExportedNameAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6286:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:6287:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:6287:2: ( ruleAPIName )
            // InternalFortXTrans.g:6288:3: ruleAPIName
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
    // InternalFortXTrans.g:6297:1: rule__ImportedNames__ImpnameAssignment_0_0 : ( ruleAPIName ) ;
    public final void rule__ImportedNames__ImpnameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6301:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:6302:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:6302:2: ( ruleAPIName )
            // InternalFortXTrans.g:6303:3: ruleAPIName
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
    // InternalFortXTrans.g:6312:1: rule__ImportedNames__ExceptAssignment_0_5_0 : ( ( 'except' ) ) ;
    public final void rule__ImportedNames__ExceptAssignment_0_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6316:1: ( ( ( 'except' ) ) )
            // InternalFortXTrans.g:6317:2: ( ( 'except' ) )
            {
            // InternalFortXTrans.g:6317:2: ( ( 'except' ) )
            // InternalFortXTrans.g:6318:3: ( 'except' )
            {
             before(grammarAccess.getImportedNamesAccess().getExceptExceptKeyword_0_5_0_0()); 
            // InternalFortXTrans.g:6319:3: ( 'except' )
            // InternalFortXTrans.g:6320:4: 'except'
            {
             before(grammarAccess.getImportedNamesAccess().getExceptExceptKeyword_0_5_0_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalFortXTrans.g:6331:1: rule__ImportedNames__SimpAssignment_0_5_1 : ( ruleSimpleNames ) ;
    public final void rule__ImportedNames__SimpAssignment_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6335:1: ( ( ruleSimpleNames ) )
            // InternalFortXTrans.g:6336:2: ( ruleSimpleNames )
            {
            // InternalFortXTrans.g:6336:2: ( ruleSimpleNames )
            // InternalFortXTrans.g:6337:3: ruleSimpleNames
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
    // InternalFortXTrans.g:6346:1: rule__ImportedNames__ImpnameAssignment_1_0 : ( ruleAPIName ) ;
    public final void rule__ImportedNames__ImpnameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6350:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:6351:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:6351:2: ( ruleAPIName )
            // InternalFortXTrans.g:6352:3: ruleAPIName
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
    // InternalFortXTrans.g:6361:1: rule__ImportedNames__SimpListAssignment_1_3 : ( ruleAliasedSimpleName ) ;
    public final void rule__ImportedNames__SimpListAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6365:1: ( ( ruleAliasedSimpleName ) )
            // InternalFortXTrans.g:6366:2: ( ruleAliasedSimpleName )
            {
            // InternalFortXTrans.g:6366:2: ( ruleAliasedSimpleName )
            // InternalFortXTrans.g:6367:3: ruleAliasedSimpleName
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
    // InternalFortXTrans.g:6376:1: rule__ImportedNames__SimpListAssignment_1_4_1 : ( ruleAliasedSimpleName ) ;
    public final void rule__ImportedNames__SimpListAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6380:1: ( ( ruleAliasedSimpleName ) )
            // InternalFortXTrans.g:6381:2: ( ruleAliasedSimpleName )
            {
            // InternalFortXTrans.g:6381:2: ( ruleAliasedSimpleName )
            // InternalFortXTrans.g:6382:3: ruleAliasedSimpleName
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
    // InternalFortXTrans.g:6391:1: rule__ImportedNames__CommaAssignment_1_5_0 : ( ( ',' ) ) ;
    public final void rule__ImportedNames__CommaAssignment_1_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6395:1: ( ( ( ',' ) ) )
            // InternalFortXTrans.g:6396:2: ( ( ',' ) )
            {
            // InternalFortXTrans.g:6396:2: ( ( ',' ) )
            // InternalFortXTrans.g:6397:3: ( ',' )
            {
             before(grammarAccess.getImportedNamesAccess().getCommaCommaKeyword_1_5_0_0()); 
            // InternalFortXTrans.g:6398:3: ( ',' )
            // InternalFortXTrans.g:6399:4: ','
            {
             before(grammarAccess.getImportedNamesAccess().getCommaCommaKeyword_1_5_0_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalFortXTrans.g:6410:1: rule__ImportedNames__DotsAssignment_1_5_1 : ( RULE_DOTS ) ;
    public final void rule__ImportedNames__DotsAssignment_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6414:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:6415:2: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:6415:2: ( RULE_DOTS )
            // InternalFortXTrans.g:6416:3: RULE_DOTS
            {
             before(grammarAccess.getImportedNamesAccess().getDotsDOTSTerminalRuleCall_1_5_1_0()); 
            match(input,RULE_DOTS,FOLLOW_2); 
             after(grammarAccess.getImportedNamesAccess().getDotsDOTSTerminalRuleCall_1_5_1_0()); 

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
    // InternalFortXTrans.g:6425:1: rule__ImportedNames__ImpnameAssignment_2_0 : ( ruleAPIName ) ;
    public final void rule__ImportedNames__ImpnameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6429:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:6430:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:6430:2: ( ruleAPIName )
            // InternalFortXTrans.g:6431:3: ruleAPIName
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
    // InternalFortXTrans.g:6440:1: rule__ImportedNames__AsnameAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__ImportedNames__AsnameAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6444:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:6445:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:6445:2: ( RULE_ID )
            // InternalFortXTrans.g:6446:3: RULE_ID
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
    // InternalFortXTrans.g:6455:1: rule__SimpleNames__NameListAssignment_0 : ( ruleSimpleName ) ;
    public final void rule__SimpleNames__NameListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6459:1: ( ( ruleSimpleName ) )
            // InternalFortXTrans.g:6460:2: ( ruleSimpleName )
            {
            // InternalFortXTrans.g:6460:2: ( ruleSimpleName )
            // InternalFortXTrans.g:6461:3: ruleSimpleName
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
    // InternalFortXTrans.g:6470:1: rule__SimpleNames__BrackAssignment_1_0 : ( ( '{' ) ) ;
    public final void rule__SimpleNames__BrackAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6474:1: ( ( ( '{' ) ) )
            // InternalFortXTrans.g:6475:2: ( ( '{' ) )
            {
            // InternalFortXTrans.g:6475:2: ( ( '{' ) )
            // InternalFortXTrans.g:6476:3: ( '{' )
            {
             before(grammarAccess.getSimpleNamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0()); 
            // InternalFortXTrans.g:6477:3: ( '{' )
            // InternalFortXTrans.g:6478:4: '{'
            {
             before(grammarAccess.getSimpleNamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFortXTrans.g:6489:1: rule__SimpleNames__NameListAssignment_1_1 : ( ruleSimpleName ) ;
    public final void rule__SimpleNames__NameListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6493:1: ( ( ruleSimpleName ) )
            // InternalFortXTrans.g:6494:2: ( ruleSimpleName )
            {
            // InternalFortXTrans.g:6494:2: ( ruleSimpleName )
            // InternalFortXTrans.g:6495:3: ruleSimpleName
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
    // InternalFortXTrans.g:6504:1: rule__SimpleNames__NameListAssignment_1_2_1 : ( ruleSimpleName ) ;
    public final void rule__SimpleNames__NameListAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6508:1: ( ( ruleSimpleName ) )
            // InternalFortXTrans.g:6509:2: ( ruleSimpleName )
            {
            // InternalFortXTrans.g:6509:2: ( ruleSimpleName )
            // InternalFortXTrans.g:6510:3: ruleSimpleName
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
    // InternalFortXTrans.g:6519:1: rule__SimpleName__NameAssignment : ( RULE_ID ) ;
    public final void rule__SimpleName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6523:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:6524:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:6524:2: ( RULE_ID )
            // InternalFortXTrans.g:6525:3: RULE_ID
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
    // InternalFortXTrans.g:6534:1: rule__AliasedSimpleName__OrigAssignment_0 : ( RULE_ID ) ;
    public final void rule__AliasedSimpleName__OrigAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6538:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:6539:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:6539:2: ( RULE_ID )
            // InternalFortXTrans.g:6540:3: RULE_ID
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
    // InternalFortXTrans.g:6549:1: rule__AliasedSimpleName__AsNameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__AliasedSimpleName__AsNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6553:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:6554:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:6554:2: ( RULE_ID )
            // InternalFortXTrans.g:6555:3: RULE_ID
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
    // InternalFortXTrans.g:6564:1: rule__AliasedAPINames__NameListAssignment_0 : ( ruleAliasedAPIName ) ;
    public final void rule__AliasedAPINames__NameListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6568:1: ( ( ruleAliasedAPIName ) )
            // InternalFortXTrans.g:6569:2: ( ruleAliasedAPIName )
            {
            // InternalFortXTrans.g:6569:2: ( ruleAliasedAPIName )
            // InternalFortXTrans.g:6570:3: ruleAliasedAPIName
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
    // InternalFortXTrans.g:6579:1: rule__AliasedAPINames__BrackAssignment_1_0 : ( ( '{' ) ) ;
    public final void rule__AliasedAPINames__BrackAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6583:1: ( ( ( '{' ) ) )
            // InternalFortXTrans.g:6584:2: ( ( '{' ) )
            {
            // InternalFortXTrans.g:6584:2: ( ( '{' ) )
            // InternalFortXTrans.g:6585:3: ( '{' )
            {
             before(grammarAccess.getAliasedAPINamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0()); 
            // InternalFortXTrans.g:6586:3: ( '{' )
            // InternalFortXTrans.g:6587:4: '{'
            {
             before(grammarAccess.getAliasedAPINamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFortXTrans.g:6598:1: rule__AliasedAPINames__NameListAssignment_1_1 : ( ruleAliasedAPIName ) ;
    public final void rule__AliasedAPINames__NameListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6602:1: ( ( ruleAliasedAPIName ) )
            // InternalFortXTrans.g:6603:2: ( ruleAliasedAPIName )
            {
            // InternalFortXTrans.g:6603:2: ( ruleAliasedAPIName )
            // InternalFortXTrans.g:6604:3: ruleAliasedAPIName
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
    // InternalFortXTrans.g:6613:1: rule__AliasedAPINames__NameListAssignment_1_2_1 : ( ruleAliasedAPIName ) ;
    public final void rule__AliasedAPINames__NameListAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6617:1: ( ( ruleAliasedAPIName ) )
            // InternalFortXTrans.g:6618:2: ( ruleAliasedAPIName )
            {
            // InternalFortXTrans.g:6618:2: ( ruleAliasedAPIName )
            // InternalFortXTrans.g:6619:3: ruleAliasedAPIName
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
    // InternalFortXTrans.g:6628:1: rule__AliasedAPIName__OrigAssignment_0 : ( ruleAPIName ) ;
    public final void rule__AliasedAPIName__OrigAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6632:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:6633:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:6633:2: ( ruleAPIName )
            // InternalFortXTrans.g:6634:3: ruleAPIName
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
    // InternalFortXTrans.g:6643:1: rule__AliasedAPIName__AsNameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__AliasedAPIName__AsNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6647:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:6648:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:6648:2: ( RULE_ID )
            // InternalFortXTrans.g:6649:3: RULE_ID
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


    // $ANTLR start "rule__Decls__DeclsAssignment"
    // InternalFortXTrans.g:6658:1: rule__Decls__DeclsAssignment : ( ruleDecl ) ;
    public final void rule__Decls__DeclsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6662:1: ( ( ruleDecl ) )
            // InternalFortXTrans.g:6663:2: ( ruleDecl )
            {
            // InternalFortXTrans.g:6663:2: ( ruleDecl )
            // InternalFortXTrans.g:6664:3: ruleDecl
            {
             before(grammarAccess.getDeclsAccess().getDeclsDeclParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDecl();

            state._fsp--;

             after(grammarAccess.getDeclsAccess().getDeclsDeclParserRuleCall_0()); 

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
    // $ANTLR end "rule__Decls__DeclsAssignment"


    // $ANTLR start "rule__Decl__FunctionAssignment"
    // InternalFortXTrans.g:6673:1: rule__Decl__FunctionAssignment : ( ruleFnDecl ) ;
    public final void rule__Decl__FunctionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6677:1: ( ( ruleFnDecl ) )
            // InternalFortXTrans.g:6678:2: ( ruleFnDecl )
            {
            // InternalFortXTrans.g:6678:2: ( ruleFnDecl )
            // InternalFortXTrans.g:6679:3: ruleFnDecl
            {
             before(grammarAccess.getDeclAccess().getFunctionFnDeclParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFnDecl();

            state._fsp--;

             after(grammarAccess.getDeclAccess().getFunctionFnDeclParserRuleCall_0()); 

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
    // $ANTLR end "rule__Decl__FunctionAssignment"


    // $ANTLR start "rule__FnMods__ModsAssignment"
    // InternalFortXTrans.g:6688:1: rule__FnMods__ModsAssignment : ( ruleFnMod ) ;
    public final void rule__FnMods__ModsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6692:1: ( ( ruleFnMod ) )
            // InternalFortXTrans.g:6693:2: ( ruleFnMod )
            {
            // InternalFortXTrans.g:6693:2: ( ruleFnMod )
            // InternalFortXTrans.g:6694:3: ruleFnMod
            {
             before(grammarAccess.getFnModsAccess().getModsFnModParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFnMod();

            state._fsp--;

             after(grammarAccess.getFnModsAccess().getModsFnModParserRuleCall_0()); 

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
    // $ANTLR end "rule__FnMods__ModsAssignment"


    // $ANTLR start "rule__FnMod__ModtypeAssignment_0"
    // InternalFortXTrans.g:6703:1: rule__FnMod__ModtypeAssignment_0 : ( ( 'private' ) ) ;
    public final void rule__FnMod__ModtypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6707:1: ( ( ( 'private' ) ) )
            // InternalFortXTrans.g:6708:2: ( ( 'private' ) )
            {
            // InternalFortXTrans.g:6708:2: ( ( 'private' ) )
            // InternalFortXTrans.g:6709:3: ( 'private' )
            {
             before(grammarAccess.getFnModAccess().getModtypePrivateKeyword_0_0()); 
            // InternalFortXTrans.g:6710:3: ( 'private' )
            // InternalFortXTrans.g:6711:4: 'private'
            {
             before(grammarAccess.getFnModAccess().getModtypePrivateKeyword_0_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFnModAccess().getModtypePrivateKeyword_0_0()); 

            }

             after(grammarAccess.getFnModAccess().getModtypePrivateKeyword_0_0()); 

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
    // $ANTLR end "rule__FnMod__ModtypeAssignment_0"


    // $ANTLR start "rule__FnMod__ModtypeAssignment_1"
    // InternalFortXTrans.g:6722:1: rule__FnMod__ModtypeAssignment_1 : ( ( 'test' ) ) ;
    public final void rule__FnMod__ModtypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6726:1: ( ( ( 'test' ) ) )
            // InternalFortXTrans.g:6727:2: ( ( 'test' ) )
            {
            // InternalFortXTrans.g:6727:2: ( ( 'test' ) )
            // InternalFortXTrans.g:6728:3: ( 'test' )
            {
             before(grammarAccess.getFnModAccess().getModtypeTestKeyword_1_0()); 
            // InternalFortXTrans.g:6729:3: ( 'test' )
            // InternalFortXTrans.g:6730:4: 'test'
            {
             before(grammarAccess.getFnModAccess().getModtypeTestKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFnModAccess().getModtypeTestKeyword_1_0()); 

            }

             after(grammarAccess.getFnModAccess().getModtypeTestKeyword_1_0()); 

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
    // $ANTLR end "rule__FnMod__ModtypeAssignment_1"


    // $ANTLR start "rule__FnMod__ModtypeAssignment_2"
    // InternalFortXTrans.g:6741:1: rule__FnMod__ModtypeAssignment_2 : ( ( 'atomic' ) ) ;
    public final void rule__FnMod__ModtypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6745:1: ( ( ( 'atomic' ) ) )
            // InternalFortXTrans.g:6746:2: ( ( 'atomic' ) )
            {
            // InternalFortXTrans.g:6746:2: ( ( 'atomic' ) )
            // InternalFortXTrans.g:6747:3: ( 'atomic' )
            {
             before(grammarAccess.getFnModAccess().getModtypeAtomicKeyword_2_0()); 
            // InternalFortXTrans.g:6748:3: ( 'atomic' )
            // InternalFortXTrans.g:6749:4: 'atomic'
            {
             before(grammarAccess.getFnModAccess().getModtypeAtomicKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFnModAccess().getModtypeAtomicKeyword_2_0()); 

            }

             after(grammarAccess.getFnModAccess().getModtypeAtomicKeyword_2_0()); 

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
    // $ANTLR end "rule__FnMod__ModtypeAssignment_2"


    // $ANTLR start "rule__FnMod__ModtypeAssignment_3"
    // InternalFortXTrans.g:6760:1: rule__FnMod__ModtypeAssignment_3 : ( ( 'io' ) ) ;
    public final void rule__FnMod__ModtypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6764:1: ( ( ( 'io' ) ) )
            // InternalFortXTrans.g:6765:2: ( ( 'io' ) )
            {
            // InternalFortXTrans.g:6765:2: ( ( 'io' ) )
            // InternalFortXTrans.g:6766:3: ( 'io' )
            {
             before(grammarAccess.getFnModAccess().getModtypeIoKeyword_3_0()); 
            // InternalFortXTrans.g:6767:3: ( 'io' )
            // InternalFortXTrans.g:6768:4: 'io'
            {
             before(grammarAccess.getFnModAccess().getModtypeIoKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getFnModAccess().getModtypeIoKeyword_3_0()); 

            }

             after(grammarAccess.getFnModAccess().getModtypeIoKeyword_3_0()); 

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
    // $ANTLR end "rule__FnMod__ModtypeAssignment_3"


    // $ANTLR start "rule__ValParam__ParamsAssignment_0"
    // InternalFortXTrans.g:6779:1: rule__ValParam__ParamsAssignment_0 : ( ruleParam ) ;
    public final void rule__ValParam__ParamsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6783:1: ( ( ruleParam ) )
            // InternalFortXTrans.g:6784:2: ( ruleParam )
            {
            // InternalFortXTrans.g:6784:2: ( ruleParam )
            // InternalFortXTrans.g:6785:3: ruleParam
            {
             before(grammarAccess.getValParamAccess().getParamsParamParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getValParamAccess().getParamsParamParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ValParam__ParamsAssignment_0"


    // $ANTLR start "rule__ValParam__BrackAssignment_1_0"
    // InternalFortXTrans.g:6794:1: rule__ValParam__BrackAssignment_1_0 : ( ( '(' ) ) ;
    public final void rule__ValParam__BrackAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6798:1: ( ( ( '(' ) ) )
            // InternalFortXTrans.g:6799:2: ( ( '(' ) )
            {
            // InternalFortXTrans.g:6799:2: ( ( '(' ) )
            // InternalFortXTrans.g:6800:3: ( '(' )
            {
             before(grammarAccess.getValParamAccess().getBrackLeftParenthesisKeyword_1_0_0()); 
            // InternalFortXTrans.g:6801:3: ( '(' )
            // InternalFortXTrans.g:6802:4: '('
            {
             before(grammarAccess.getValParamAccess().getBrackLeftParenthesisKeyword_1_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getValParamAccess().getBrackLeftParenthesisKeyword_1_0_0()); 

            }

             after(grammarAccess.getValParamAccess().getBrackLeftParenthesisKeyword_1_0_0()); 

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
    // $ANTLR end "rule__ValParam__BrackAssignment_1_0"


    // $ANTLR start "rule__ValParam__ParamsAssignment_1_1_0"
    // InternalFortXTrans.g:6813:1: rule__ValParam__ParamsAssignment_1_1_0 : ( ruleParam ) ;
    public final void rule__ValParam__ParamsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6817:1: ( ( ruleParam ) )
            // InternalFortXTrans.g:6818:2: ( ruleParam )
            {
            // InternalFortXTrans.g:6818:2: ( ruleParam )
            // InternalFortXTrans.g:6819:3: ruleParam
            {
             before(grammarAccess.getValParamAccess().getParamsParamParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getValParamAccess().getParamsParamParserRuleCall_1_1_0_0()); 

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
    // $ANTLR end "rule__ValParam__ParamsAssignment_1_1_0"


    // $ANTLR start "rule__ValParam__ParamsAssignment_1_1_1_1"
    // InternalFortXTrans.g:6828:1: rule__ValParam__ParamsAssignment_1_1_1_1 : ( ruleParam ) ;
    public final void rule__ValParam__ParamsAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6832:1: ( ( ruleParam ) )
            // InternalFortXTrans.g:6833:2: ( ruleParam )
            {
            // InternalFortXTrans.g:6833:2: ( ruleParam )
            // InternalFortXTrans.g:6834:3: ruleParam
            {
             before(grammarAccess.getValParamAccess().getParamsParamParserRuleCall_1_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getValParamAccess().getParamsParamParserRuleCall_1_1_1_1_0()); 

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
    // $ANTLR end "rule__ValParam__ParamsAssignment_1_1_1_1"


    // $ANTLR start "rule__Param__BIdAssignment_0"
    // InternalFortXTrans.g:6843:1: rule__Param__BIdAssignment_0 : ( ruleBindId ) ;
    public final void rule__Param__BIdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6847:1: ( ( ruleBindId ) )
            // InternalFortXTrans.g:6848:2: ( ruleBindId )
            {
            // InternalFortXTrans.g:6848:2: ( ruleBindId )
            // InternalFortXTrans.g:6849:3: ruleBindId
            {
             before(grammarAccess.getParamAccess().getBIdBindIdParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBindId();

            state._fsp--;

             after(grammarAccess.getParamAccess().getBIdBindIdParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Param__BIdAssignment_0"


    // $ANTLR start "rule__Param__IstypeAssignment_1"
    // InternalFortXTrans.g:6858:1: rule__Param__IstypeAssignment_1 : ( ruleIsType ) ;
    public final void rule__Param__IstypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6862:1: ( ( ruleIsType ) )
            // InternalFortXTrans.g:6863:2: ( ruleIsType )
            {
            // InternalFortXTrans.g:6863:2: ( ruleIsType )
            // InternalFortXTrans.g:6864:3: ruleIsType
            {
             before(grammarAccess.getParamAccess().getIstypeIsTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIsType();

            state._fsp--;

             after(grammarAccess.getParamAccess().getIstypeIsTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Param__IstypeAssignment_1"


    // $ANTLR start "rule__RetType__EmptyAssignment_0_1"
    // InternalFortXTrans.g:6873:1: rule__RetType__EmptyAssignment_0_1 : ( ( '(' ) ) ;
    public final void rule__RetType__EmptyAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6877:1: ( ( ( '(' ) ) )
            // InternalFortXTrans.g:6878:2: ( ( '(' ) )
            {
            // InternalFortXTrans.g:6878:2: ( ( '(' ) )
            // InternalFortXTrans.g:6879:3: ( '(' )
            {
             before(grammarAccess.getRetTypeAccess().getEmptyLeftParenthesisKeyword_0_1_0()); 
            // InternalFortXTrans.g:6880:3: ( '(' )
            // InternalFortXTrans.g:6881:4: '('
            {
             before(grammarAccess.getRetTypeAccess().getEmptyLeftParenthesisKeyword_0_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRetTypeAccess().getEmptyLeftParenthesisKeyword_0_1_0()); 

            }

             after(grammarAccess.getRetTypeAccess().getEmptyLeftParenthesisKeyword_0_1_0()); 

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
    // $ANTLR end "rule__RetType__EmptyAssignment_0_1"


    // $ANTLR start "rule__RetType__TypeAssignment_1_1"
    // InternalFortXTrans.g:6892:1: rule__RetType__TypeAssignment_1_1 : ( ruleType ) ;
    public final void rule__RetType__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6896:1: ( ( ruleType ) )
            // InternalFortXTrans.g:6897:2: ( ruleType )
            {
            // InternalFortXTrans.g:6897:2: ( ruleType )
            // InternalFortXTrans.g:6898:3: ruleType
            {
             before(grammarAccess.getRetTypeAccess().getTypeTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getRetTypeAccess().getTypeTypeParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__RetType__TypeAssignment_1_1"


    // $ANTLR start "rule__Type__TnameAssignment"
    // InternalFortXTrans.g:6907:1: rule__Type__TnameAssignment : ( RULE_ID ) ;
    public final void rule__Type__TnameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6911:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:6912:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:6912:2: ( RULE_ID )
            // InternalFortXTrans.g:6913:3: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getTnameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTnameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Type__TnameAssignment"


    // $ANTLR start "rule__FnDecl__ModsAssignment_0"
    // InternalFortXTrans.g:6922:1: rule__FnDecl__ModsAssignment_0 : ( ruleFnMods ) ;
    public final void rule__FnDecl__ModsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6926:1: ( ( ruleFnMods ) )
            // InternalFortXTrans.g:6927:2: ( ruleFnMods )
            {
            // InternalFortXTrans.g:6927:2: ( ruleFnMods )
            // InternalFortXTrans.g:6928:3: ruleFnMods
            {
             before(grammarAccess.getFnDeclAccess().getModsFnModsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFnMods();

            state._fsp--;

             after(grammarAccess.getFnDeclAccess().getModsFnModsParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__FnDecl__ModsAssignment_0"


    // $ANTLR start "rule__FnDecl__NameAssignment_1"
    // InternalFortXTrans.g:6937:1: rule__FnDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FnDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6941:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:6942:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:6942:2: ( RULE_ID )
            // InternalFortXTrans.g:6943:3: RULE_ID
            {
             before(grammarAccess.getFnDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFnDeclAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FnDecl__NameAssignment_1"


    // $ANTLR start "rule__FnDecl__ParamsAssignment_2"
    // InternalFortXTrans.g:6952:1: rule__FnDecl__ParamsAssignment_2 : ( ruleValParam ) ;
    public final void rule__FnDecl__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6956:1: ( ( ruleValParam ) )
            // InternalFortXTrans.g:6957:2: ( ruleValParam )
            {
            // InternalFortXTrans.g:6957:2: ( ruleValParam )
            // InternalFortXTrans.g:6958:3: ruleValParam
            {
             before(grammarAccess.getFnDeclAccess().getParamsValParamParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValParam();

            state._fsp--;

             after(grammarAccess.getFnDeclAccess().getParamsValParamParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FnDecl__ParamsAssignment_2"


    // $ANTLR start "rule__FnDecl__RetValAssignment_3"
    // InternalFortXTrans.g:6967:1: rule__FnDecl__RetValAssignment_3 : ( ruleRetType ) ;
    public final void rule__FnDecl__RetValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6971:1: ( ( ruleRetType ) )
            // InternalFortXTrans.g:6972:2: ( ruleRetType )
            {
            // InternalFortXTrans.g:6972:2: ( ruleRetType )
            // InternalFortXTrans.g:6973:3: ruleRetType
            {
             before(grammarAccess.getFnDeclAccess().getRetValRetTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRetType();

            state._fsp--;

             after(grammarAccess.getFnDeclAccess().getRetValRetTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__FnDecl__RetValAssignment_3"


    // $ANTLR start "rule__FnDecl__BodyAssignment_4_0"
    // InternalFortXTrans.g:6982:1: rule__FnDecl__BodyAssignment_4_0 : ( ( '=' ) ) ;
    public final void rule__FnDecl__BodyAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6986:1: ( ( ( '=' ) ) )
            // InternalFortXTrans.g:6987:2: ( ( '=' ) )
            {
            // InternalFortXTrans.g:6987:2: ( ( '=' ) )
            // InternalFortXTrans.g:6988:3: ( '=' )
            {
             before(grammarAccess.getFnDeclAccess().getBodyEqualsSignKeyword_4_0_0()); 
            // InternalFortXTrans.g:6989:3: ( '=' )
            // InternalFortXTrans.g:6990:4: '='
            {
             before(grammarAccess.getFnDeclAccess().getBodyEqualsSignKeyword_4_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFnDeclAccess().getBodyEqualsSignKeyword_4_0_0()); 

            }

             after(grammarAccess.getFnDeclAccess().getBodyEqualsSignKeyword_4_0_0()); 

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
    // $ANTLR end "rule__FnDecl__BodyAssignment_4_0"


    // $ANTLR start "rule__FnDecl__FnItselfAssignment_4_1"
    // InternalFortXTrans.g:7001:1: rule__FnDecl__FnItselfAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__FnDecl__FnItselfAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7005:1: ( ( ruleExpression ) )
            // InternalFortXTrans.g:7006:2: ( ruleExpression )
            {
            // InternalFortXTrans.g:7006:2: ( ruleExpression )
            // InternalFortXTrans.g:7007:3: ruleExpression
            {
             before(grammarAccess.getFnDeclAccess().getFnItselfExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFnDeclAccess().getFnItselfExpressionParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__FnDecl__FnItselfAssignment_4_1"


    // $ANTLR start "rule__Expression__ExpAssignment"
    // InternalFortXTrans.g:7016:1: rule__Expression__ExpAssignment : ( ruleExpr ) ;
    public final void rule__Expression__ExpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7020:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:7021:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:7021:2: ( ruleExpr )
            // InternalFortXTrans.g:7022:3: ruleExpr
            {
             before(grammarAccess.getExpressionAccess().getExpExprParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpExprParserRuleCall_0()); 

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
    // $ANTLR end "rule__Expression__ExpAssignment"


    // $ANTLR start "rule__Expr__FrontAssignment_0"
    // InternalFortXTrans.g:7031:1: rule__Expr__FrontAssignment_0 : ( ruleExprFront ) ;
    public final void rule__Expr__FrontAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7035:1: ( ( ruleExprFront ) )
            // InternalFortXTrans.g:7036:2: ( ruleExprFront )
            {
            // InternalFortXTrans.g:7036:2: ( ruleExprFront )
            // InternalFortXTrans.g:7037:3: ruleExprFront
            {
             before(grammarAccess.getExprAccess().getFrontExprFrontParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExprFront();

            state._fsp--;

             after(grammarAccess.getExprAccess().getFrontExprFrontParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Expr__FrontAssignment_0"


    // $ANTLR start "rule__Expr__TailsAssignment_1"
    // InternalFortXTrans.g:7046:1: rule__Expr__TailsAssignment_1 : ( ruleExprTail ) ;
    public final void rule__Expr__TailsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7050:1: ( ( ruleExprTail ) )
            // InternalFortXTrans.g:7051:2: ( ruleExprTail )
            {
            // InternalFortXTrans.g:7051:2: ( ruleExprTail )
            // InternalFortXTrans.g:7052:3: ruleExprTail
            {
             before(grammarAccess.getExprAccess().getTailsExprTailParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExprTail();

            state._fsp--;

             after(grammarAccess.getExprAccess().getTailsExprTailParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Expr__TailsAssignment_1"


    // $ANTLR start "rule__ExprFront__DelimAssignment_0"
    // InternalFortXTrans.g:7061:1: rule__ExprFront__DelimAssignment_0 : ( ruleDelimitedExpr ) ;
    public final void rule__ExprFront__DelimAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7065:1: ( ( ruleDelimitedExpr ) )
            // InternalFortXTrans.g:7066:2: ( ruleDelimitedExpr )
            {
            // InternalFortXTrans.g:7066:2: ( ruleDelimitedExpr )
            // InternalFortXTrans.g:7067:3: ruleDelimitedExpr
            {
             before(grammarAccess.getExprFrontAccess().getDelimDelimitedExprParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDelimitedExpr();

            state._fsp--;

             after(grammarAccess.getExprFrontAccess().getDelimDelimitedExprParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ExprFront__DelimAssignment_0"


    // $ANTLR start "rule__ExprFront__IdAssignment_1"
    // InternalFortXTrans.g:7076:1: rule__ExprFront__IdAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ExprFront__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7080:1: ( ( ruleQualifiedName ) )
            // InternalFortXTrans.g:7081:2: ( ruleQualifiedName )
            {
            // InternalFortXTrans.g:7081:2: ( ruleQualifiedName )
            // InternalFortXTrans.g:7082:3: ruleQualifiedName
            {
             before(grammarAccess.getExprFrontAccess().getIdQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getExprFrontAccess().getIdQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExprFront__IdAssignment_1"


    // $ANTLR start "rule__ExprTail__TypeAssignment_1"
    // InternalFortXTrans.g:7091:1: rule__ExprTail__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__ExprTail__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7095:1: ( ( ruleType ) )
            // InternalFortXTrans.g:7096:2: ( ruleType )
            {
            // InternalFortXTrans.g:7096:2: ( ruleType )
            // InternalFortXTrans.g:7097:3: ruleType
            {
             before(grammarAccess.getExprTailAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getExprTailAccess().getTypeTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExprTail__TypeAssignment_1"


    // $ANTLR start "rule__DelimitedExpr__DodAssignment_0"
    // InternalFortXTrans.g:7106:1: rule__DelimitedExpr__DodAssignment_0 : ( ruleDo ) ;
    public final void rule__DelimitedExpr__DodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7110:1: ( ( ruleDo ) )
            // InternalFortXTrans.g:7111:2: ( ruleDo )
            {
            // InternalFortXTrans.g:7111:2: ( ruleDo )
            // InternalFortXTrans.g:7112:3: ruleDo
            {
             before(grammarAccess.getDelimitedExprAccess().getDodDoParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDo();

            state._fsp--;

             after(grammarAccess.getDelimitedExprAccess().getDodDoParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DelimitedExpr__DodAssignment_0"


    // $ANTLR start "rule__DelimitedExpr__AwhileAssignment_1_0"
    // InternalFortXTrans.g:7121:1: rule__DelimitedExpr__AwhileAssignment_1_0 : ( ( 'while' ) ) ;
    public final void rule__DelimitedExpr__AwhileAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7125:1: ( ( ( 'while' ) ) )
            // InternalFortXTrans.g:7126:2: ( ( 'while' ) )
            {
            // InternalFortXTrans.g:7126:2: ( ( 'while' ) )
            // InternalFortXTrans.g:7127:3: ( 'while' )
            {
             before(grammarAccess.getDelimitedExprAccess().getAwhileWhileKeyword_1_0_0()); 
            // InternalFortXTrans.g:7128:3: ( 'while' )
            // InternalFortXTrans.g:7129:4: 'while'
            {
             before(grammarAccess.getDelimitedExprAccess().getAwhileWhileKeyword_1_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getDelimitedExprAccess().getAwhileWhileKeyword_1_0_0()); 

            }

             after(grammarAccess.getDelimitedExprAccess().getAwhileWhileKeyword_1_0_0()); 

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
    // $ANTLR end "rule__DelimitedExpr__AwhileAssignment_1_0"


    // $ANTLR start "rule__DelimitedExpr__ExprAssignment_1_1"
    // InternalFortXTrans.g:7140:1: rule__DelimitedExpr__ExprAssignment_1_1 : ( ruleExpr ) ;
    public final void rule__DelimitedExpr__ExprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7144:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:7145:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:7145:2: ( ruleExpr )
            // InternalFortXTrans.g:7146:3: ruleExpr
            {
             before(grammarAccess.getDelimitedExprAccess().getExprExprParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getDelimitedExprAccess().getExprExprParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__DelimitedExpr__ExprAssignment_1_1"


    // $ANTLR start "rule__DelimitedExpr__WhiledodAssignment_1_2"
    // InternalFortXTrans.g:7155:1: rule__DelimitedExpr__WhiledodAssignment_1_2 : ( ruleDo ) ;
    public final void rule__DelimitedExpr__WhiledodAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7159:1: ( ( ruleDo ) )
            // InternalFortXTrans.g:7160:2: ( ruleDo )
            {
            // InternalFortXTrans.g:7160:2: ( ruleDo )
            // InternalFortXTrans.g:7161:3: ruleDo
            {
             before(grammarAccess.getDelimitedExprAccess().getWhiledodDoParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDo();

            state._fsp--;

             after(grammarAccess.getDelimitedExprAccess().getWhiledodDoParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__DelimitedExpr__WhiledodAssignment_1_2"


    // $ANTLR start "rule__DelimitedExpr__AforAssignment_2_0"
    // InternalFortXTrans.g:7170:1: rule__DelimitedExpr__AforAssignment_2_0 : ( ( 'for' ) ) ;
    public final void rule__DelimitedExpr__AforAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7174:1: ( ( ( 'for' ) ) )
            // InternalFortXTrans.g:7175:2: ( ( 'for' ) )
            {
            // InternalFortXTrans.g:7175:2: ( ( 'for' ) )
            // InternalFortXTrans.g:7176:3: ( 'for' )
            {
             before(grammarAccess.getDelimitedExprAccess().getAforForKeyword_2_0_0()); 
            // InternalFortXTrans.g:7177:3: ( 'for' )
            // InternalFortXTrans.g:7178:4: 'for'
            {
             before(grammarAccess.getDelimitedExprAccess().getAforForKeyword_2_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDelimitedExprAccess().getAforForKeyword_2_0_0()); 

            }

             after(grammarAccess.getDelimitedExprAccess().getAforForKeyword_2_0_0()); 

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
    // $ANTLR end "rule__DelimitedExpr__AforAssignment_2_0"


    // $ANTLR start "rule__DelimitedExpr__GenAssignment_2_1"
    // InternalFortXTrans.g:7189:1: rule__DelimitedExpr__GenAssignment_2_1 : ( ruleGenerators ) ;
    public final void rule__DelimitedExpr__GenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7193:1: ( ( ruleGenerators ) )
            // InternalFortXTrans.g:7194:2: ( ruleGenerators )
            {
            // InternalFortXTrans.g:7194:2: ( ruleGenerators )
            // InternalFortXTrans.g:7195:3: ruleGenerators
            {
             before(grammarAccess.getDelimitedExprAccess().getGenGeneratorsParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGenerators();

            state._fsp--;

             after(grammarAccess.getDelimitedExprAccess().getGenGeneratorsParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__DelimitedExpr__GenAssignment_2_1"


    // $ANTLR start "rule__DelimitedExpr__DofrontAssignment_2_2"
    // InternalFortXTrans.g:7204:1: rule__DelimitedExpr__DofrontAssignment_2_2 : ( ruleDoFront ) ;
    public final void rule__DelimitedExpr__DofrontAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7208:1: ( ( ruleDoFront ) )
            // InternalFortXTrans.g:7209:2: ( ruleDoFront )
            {
            // InternalFortXTrans.g:7209:2: ( ruleDoFront )
            // InternalFortXTrans.g:7210:3: ruleDoFront
            {
             before(grammarAccess.getDelimitedExprAccess().getDofrontDoFrontParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDoFront();

            state._fsp--;

             after(grammarAccess.getDelimitedExprAccess().getDofrontDoFrontParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__DelimitedExpr__DofrontAssignment_2_2"


    // $ANTLR start "rule__DelimitedExpr__AnifAssignment_3_0"
    // InternalFortXTrans.g:7219:1: rule__DelimitedExpr__AnifAssignment_3_0 : ( ( 'if' ) ) ;
    public final void rule__DelimitedExpr__AnifAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7223:1: ( ( ( 'if' ) ) )
            // InternalFortXTrans.g:7224:2: ( ( 'if' ) )
            {
            // InternalFortXTrans.g:7224:2: ( ( 'if' ) )
            // InternalFortXTrans.g:7225:3: ( 'if' )
            {
             before(grammarAccess.getDelimitedExprAccess().getAnifIfKeyword_3_0_0()); 
            // InternalFortXTrans.g:7226:3: ( 'if' )
            // InternalFortXTrans.g:7227:4: 'if'
            {
             before(grammarAccess.getDelimitedExprAccess().getAnifIfKeyword_3_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDelimitedExprAccess().getAnifIfKeyword_3_0_0()); 

            }

             after(grammarAccess.getDelimitedExprAccess().getAnifIfKeyword_3_0_0()); 

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
    // $ANTLR end "rule__DelimitedExpr__AnifAssignment_3_0"


    // $ANTLR start "rule__DelimitedExpr__CondAssignment_3_1"
    // InternalFortXTrans.g:7238:1: rule__DelimitedExpr__CondAssignment_3_1 : ( ruleExpr ) ;
    public final void rule__DelimitedExpr__CondAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7242:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:7243:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:7243:2: ( ruleExpr )
            // InternalFortXTrans.g:7244:3: ruleExpr
            {
             before(grammarAccess.getDelimitedExprAccess().getCondExprParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getDelimitedExprAccess().getCondExprParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__DelimitedExpr__CondAssignment_3_1"


    // $ANTLR start "rule__DelimitedExpr__BlockAssignment_3_3"
    // InternalFortXTrans.g:7253:1: rule__DelimitedExpr__BlockAssignment_3_3 : ( ruleBlockElems ) ;
    public final void rule__DelimitedExpr__BlockAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7257:1: ( ( ruleBlockElems ) )
            // InternalFortXTrans.g:7258:2: ( ruleBlockElems )
            {
            // InternalFortXTrans.g:7258:2: ( ruleBlockElems )
            // InternalFortXTrans.g:7259:3: ruleBlockElems
            {
             before(grammarAccess.getDelimitedExprAccess().getBlockBlockElemsParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBlockElems();

            state._fsp--;

             after(grammarAccess.getDelimitedExprAccess().getBlockBlockElemsParserRuleCall_3_3_0()); 

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
    // $ANTLR end "rule__DelimitedExpr__BlockAssignment_3_3"


    // $ANTLR start "rule__DelimitedExpr__ElifsAssignment_3_4"
    // InternalFortXTrans.g:7268:1: rule__DelimitedExpr__ElifsAssignment_3_4 : ( ruleElifs ) ;
    public final void rule__DelimitedExpr__ElifsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7272:1: ( ( ruleElifs ) )
            // InternalFortXTrans.g:7273:2: ( ruleElifs )
            {
            // InternalFortXTrans.g:7273:2: ( ruleElifs )
            // InternalFortXTrans.g:7274:3: ruleElifs
            {
             before(grammarAccess.getDelimitedExprAccess().getElifsElifsParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleElifs();

            state._fsp--;

             after(grammarAccess.getDelimitedExprAccess().getElifsElifsParserRuleCall_3_4_0()); 

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
    // $ANTLR end "rule__DelimitedExpr__ElifsAssignment_3_4"


    // $ANTLR start "rule__DelimitedExpr__ElseAssignment_3_5"
    // InternalFortXTrans.g:7283:1: rule__DelimitedExpr__ElseAssignment_3_5 : ( ruleElse ) ;
    public final void rule__DelimitedExpr__ElseAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7287:1: ( ( ruleElse ) )
            // InternalFortXTrans.g:7288:2: ( ruleElse )
            {
            // InternalFortXTrans.g:7288:2: ( ruleElse )
            // InternalFortXTrans.g:7289:3: ruleElse
            {
             before(grammarAccess.getDelimitedExprAccess().getElseElseParserRuleCall_3_5_0()); 
            pushFollow(FOLLOW_2);
            ruleElse();

            state._fsp--;

             after(grammarAccess.getDelimitedExprAccess().getElseElseParserRuleCall_3_5_0()); 

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
    // $ANTLR end "rule__DelimitedExpr__ElseAssignment_3_5"


    // $ANTLR start "rule__DelimitedExpr__ParAssignment_4"
    // InternalFortXTrans.g:7298:1: rule__DelimitedExpr__ParAssignment_4 : ( ruleParanthesized ) ;
    public final void rule__DelimitedExpr__ParAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7302:1: ( ( ruleParanthesized ) )
            // InternalFortXTrans.g:7303:2: ( ruleParanthesized )
            {
            // InternalFortXTrans.g:7303:2: ( ruleParanthesized )
            // InternalFortXTrans.g:7304:3: ruleParanthesized
            {
             before(grammarAccess.getDelimitedExprAccess().getParParanthesizedParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleParanthesized();

            state._fsp--;

             after(grammarAccess.getDelimitedExprAccess().getParParanthesizedParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__DelimitedExpr__ParAssignment_4"


    // $ANTLR start "rule__Elifs__EAssignment_0"
    // InternalFortXTrans.g:7313:1: rule__Elifs__EAssignment_0 : ( ruleElif ) ;
    public final void rule__Elifs__EAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7317:1: ( ( ruleElif ) )
            // InternalFortXTrans.g:7318:2: ( ruleElif )
            {
            // InternalFortXTrans.g:7318:2: ( ruleElif )
            // InternalFortXTrans.g:7319:3: ruleElif
            {
             before(grammarAccess.getElifsAccess().getEElifParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElif();

            state._fsp--;

             after(grammarAccess.getElifsAccess().getEElifParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Elifs__EAssignment_0"


    // $ANTLR start "rule__Elifs__EAssignment_1"
    // InternalFortXTrans.g:7328:1: rule__Elifs__EAssignment_1 : ( ruleElif ) ;
    public final void rule__Elifs__EAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7332:1: ( ( ruleElif ) )
            // InternalFortXTrans.g:7333:2: ( ruleElif )
            {
            // InternalFortXTrans.g:7333:2: ( ruleElif )
            // InternalFortXTrans.g:7334:3: ruleElif
            {
             before(grammarAccess.getElifsAccess().getEElifParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElif();

            state._fsp--;

             after(grammarAccess.getElifsAccess().getEElifParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Elifs__EAssignment_1"


    // $ANTLR start "rule__Elif__ExprAssignment_1"
    // InternalFortXTrans.g:7343:1: rule__Elif__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__Elif__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7347:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:7348:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:7348:2: ( ruleExpr )
            // InternalFortXTrans.g:7349:3: ruleExpr
            {
             before(grammarAccess.getElifAccess().getExprExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getElifAccess().getExprExprParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Elif__ExprAssignment_1"


    // $ANTLR start "rule__Elif__BlockAssignment_3"
    // InternalFortXTrans.g:7358:1: rule__Elif__BlockAssignment_3 : ( ruleBlockElems ) ;
    public final void rule__Elif__BlockAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7362:1: ( ( ruleBlockElems ) )
            // InternalFortXTrans.g:7363:2: ( ruleBlockElems )
            {
            // InternalFortXTrans.g:7363:2: ( ruleBlockElems )
            // InternalFortXTrans.g:7364:3: ruleBlockElems
            {
             before(grammarAccess.getElifAccess().getBlockBlockElemsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBlockElems();

            state._fsp--;

             after(grammarAccess.getElifAccess().getBlockBlockElemsParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Elif__BlockAssignment_3"


    // $ANTLR start "rule__Else__BlockAssignment_1"
    // InternalFortXTrans.g:7373:1: rule__Else__BlockAssignment_1 : ( ruleBlockElems ) ;
    public final void rule__Else__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7377:1: ( ( ruleBlockElems ) )
            // InternalFortXTrans.g:7378:2: ( ruleBlockElems )
            {
            // InternalFortXTrans.g:7378:2: ( ruleBlockElems )
            // InternalFortXTrans.g:7379:3: ruleBlockElems
            {
             before(grammarAccess.getElseAccess().getBlockBlockElemsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlockElems();

            state._fsp--;

             after(grammarAccess.getElseAccess().getBlockBlockElemsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Else__BlockAssignment_1"


    // $ANTLR start "rule__Generators__BindingAssignment_0"
    // InternalFortXTrans.g:7388:1: rule__Generators__BindingAssignment_0 : ( ruleBinding ) ;
    public final void rule__Generators__BindingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7392:1: ( ( ruleBinding ) )
            // InternalFortXTrans.g:7393:2: ( ruleBinding )
            {
            // InternalFortXTrans.g:7393:2: ( ruleBinding )
            // InternalFortXTrans.g:7394:3: ruleBinding
            {
             before(grammarAccess.getGeneratorsAccess().getBindingBindingParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getGeneratorsAccess().getBindingBindingParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Generators__BindingAssignment_0"


    // $ANTLR start "rule__Generators__ClauseAssignment_1_1"
    // InternalFortXTrans.g:7403:1: rule__Generators__ClauseAssignment_1_1 : ( ruleGenClause ) ;
    public final void rule__Generators__ClauseAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7407:1: ( ( ruleGenClause ) )
            // InternalFortXTrans.g:7408:2: ( ruleGenClause )
            {
            // InternalFortXTrans.g:7408:2: ( ruleGenClause )
            // InternalFortXTrans.g:7409:3: ruleGenClause
            {
             before(grammarAccess.getGeneratorsAccess().getClauseGenClauseParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGenClause();

            state._fsp--;

             after(grammarAccess.getGeneratorsAccess().getClauseGenClauseParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Generators__ClauseAssignment_1_1"


    // $ANTLR start "rule__Binding__IdtupAssignment_0"
    // InternalFortXTrans.g:7418:1: rule__Binding__IdtupAssignment_0 : ( ruleIdOrTuple ) ;
    public final void rule__Binding__IdtupAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7422:1: ( ( ruleIdOrTuple ) )
            // InternalFortXTrans.g:7423:2: ( ruleIdOrTuple )
            {
            // InternalFortXTrans.g:7423:2: ( ruleIdOrTuple )
            // InternalFortXTrans.g:7424:3: ruleIdOrTuple
            {
             before(grammarAccess.getBindingAccess().getIdtupIdOrTupleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIdOrTuple();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getIdtupIdOrTupleParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Binding__IdtupAssignment_0"


    // $ANTLR start "rule__Binding__ExprAssignment_2"
    // InternalFortXTrans.g:7433:1: rule__Binding__ExprAssignment_2 : ( ruleExpr ) ;
    public final void rule__Binding__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7437:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:7438:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:7438:2: ( ruleExpr )
            // InternalFortXTrans.g:7439:3: ruleExpr
            {
             before(grammarAccess.getBindingAccess().getExprExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getExprExprParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Binding__ExprAssignment_2"


    // $ANTLR start "rule__GenClause__BindingAssignment_0"
    // InternalFortXTrans.g:7448:1: rule__GenClause__BindingAssignment_0 : ( ruleBinding ) ;
    public final void rule__GenClause__BindingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7452:1: ( ( ruleBinding ) )
            // InternalFortXTrans.g:7453:2: ( ruleBinding )
            {
            // InternalFortXTrans.g:7453:2: ( ruleBinding )
            // InternalFortXTrans.g:7454:3: ruleBinding
            {
             before(grammarAccess.getGenClauseAccess().getBindingBindingParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getGenClauseAccess().getBindingBindingParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__GenClause__BindingAssignment_0"


    // $ANTLR start "rule__GenClause__ExprAssignment_1"
    // InternalFortXTrans.g:7463:1: rule__GenClause__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__GenClause__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7467:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:7468:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:7468:2: ( ruleExpr )
            // InternalFortXTrans.g:7469:3: ruleExpr
            {
             before(grammarAccess.getGenClauseAccess().getExprExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getGenClauseAccess().getExprExprParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__GenClause__ExprAssignment_1"


    // $ANTLR start "rule__BlockElems__BlockAssignment_0"
    // InternalFortXTrans.g:7478:1: rule__BlockElems__BlockAssignment_0 : ( ruleBlockElem ) ;
    public final void rule__BlockElems__BlockAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7482:1: ( ( ruleBlockElem ) )
            // InternalFortXTrans.g:7483:2: ( ruleBlockElem )
            {
            // InternalFortXTrans.g:7483:2: ( ruleBlockElem )
            // InternalFortXTrans.g:7484:3: ruleBlockElem
            {
             before(grammarAccess.getBlockElemsAccess().getBlockBlockElemParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBlockElem();

            state._fsp--;

             after(grammarAccess.getBlockElemsAccess().getBlockBlockElemParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__BlockElems__BlockAssignment_0"


    // $ANTLR start "rule__BlockElems__BlockAssignment_1"
    // InternalFortXTrans.g:7493:1: rule__BlockElems__BlockAssignment_1 : ( ruleBlockElem ) ;
    public final void rule__BlockElems__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7497:1: ( ( ruleBlockElem ) )
            // InternalFortXTrans.g:7498:2: ( ruleBlockElem )
            {
            // InternalFortXTrans.g:7498:2: ( ruleBlockElem )
            // InternalFortXTrans.g:7499:3: ruleBlockElem
            {
             before(grammarAccess.getBlockElemsAccess().getBlockBlockElemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlockElem();

            state._fsp--;

             after(grammarAccess.getBlockElemsAccess().getBlockBlockElemParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__BlockElems__BlockAssignment_1"


    // $ANTLR start "rule__BlockElem__ExpAssignment"
    // InternalFortXTrans.g:7508:1: rule__BlockElem__ExpAssignment : ( ruleExpr ) ;
    public final void rule__BlockElem__ExpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7512:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:7513:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:7513:2: ( ruleExpr )
            // InternalFortXTrans.g:7514:3: ruleExpr
            {
             before(grammarAccess.getBlockElemAccess().getExpExprParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getBlockElemAccess().getExpExprParserRuleCall_0()); 

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
    // $ANTLR end "rule__BlockElem__ExpAssignment"


    // $ANTLR start "rule__Do__DofsAssignment_0"
    // InternalFortXTrans.g:7523:1: rule__Do__DofsAssignment_0 : ( ruleDoFront ) ;
    public final void rule__Do__DofsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7527:1: ( ( ruleDoFront ) )
            // InternalFortXTrans.g:7528:2: ( ruleDoFront )
            {
            // InternalFortXTrans.g:7528:2: ( ruleDoFront )
            // InternalFortXTrans.g:7529:3: ruleDoFront
            {
             before(grammarAccess.getDoAccess().getDofsDoFrontParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDoFront();

            state._fsp--;

             after(grammarAccess.getDoAccess().getDofsDoFrontParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Do__DofsAssignment_0"


    // $ANTLR start "rule__Do__DofsAssignment_1_1"
    // InternalFortXTrans.g:7538:1: rule__Do__DofsAssignment_1_1 : ( ruleDoFront ) ;
    public final void rule__Do__DofsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7542:1: ( ( ruleDoFront ) )
            // InternalFortXTrans.g:7543:2: ( ruleDoFront )
            {
            // InternalFortXTrans.g:7543:2: ( ruleDoFront )
            // InternalFortXTrans.g:7544:3: ruleDoFront
            {
             before(grammarAccess.getDoAccess().getDofsDoFrontParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDoFront();

            state._fsp--;

             after(grammarAccess.getDoAccess().getDofsDoFrontParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Do__DofsAssignment_1_1"


    // $ANTLR start "rule__DoFront__AtAssignment_0_0"
    // InternalFortXTrans.g:7553:1: rule__DoFront__AtAssignment_0_0 : ( ( 'at' ) ) ;
    public final void rule__DoFront__AtAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7557:1: ( ( ( 'at' ) ) )
            // InternalFortXTrans.g:7558:2: ( ( 'at' ) )
            {
            // InternalFortXTrans.g:7558:2: ( ( 'at' ) )
            // InternalFortXTrans.g:7559:3: ( 'at' )
            {
             before(grammarAccess.getDoFrontAccess().getAtAtKeyword_0_0_0()); 
            // InternalFortXTrans.g:7560:3: ( 'at' )
            // InternalFortXTrans.g:7561:4: 'at'
            {
             before(grammarAccess.getDoFrontAccess().getAtAtKeyword_0_0_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDoFrontAccess().getAtAtKeyword_0_0_0()); 

            }

             after(grammarAccess.getDoFrontAccess().getAtAtKeyword_0_0_0()); 

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
    // $ANTLR end "rule__DoFront__AtAssignment_0_0"


    // $ANTLR start "rule__DoFront__ExpAssignment_0_1"
    // InternalFortXTrans.g:7572:1: rule__DoFront__ExpAssignment_0_1 : ( ruleExpr ) ;
    public final void rule__DoFront__ExpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7576:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:7577:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:7577:2: ( ruleExpr )
            // InternalFortXTrans.g:7578:3: ruleExpr
            {
             before(grammarAccess.getDoFrontAccess().getExpExprParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getDoFrontAccess().getExpExprParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__DoFront__ExpAssignment_0_1"


    // $ANTLR start "rule__DoFront__AtomAssignment_1"
    // InternalFortXTrans.g:7587:1: rule__DoFront__AtomAssignment_1 : ( ( 'atomic' ) ) ;
    public final void rule__DoFront__AtomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7591:1: ( ( ( 'atomic' ) ) )
            // InternalFortXTrans.g:7592:2: ( ( 'atomic' ) )
            {
            // InternalFortXTrans.g:7592:2: ( ( 'atomic' ) )
            // InternalFortXTrans.g:7593:3: ( 'atomic' )
            {
             before(grammarAccess.getDoFrontAccess().getAtomAtomicKeyword_1_0()); 
            // InternalFortXTrans.g:7594:3: ( 'atomic' )
            // InternalFortXTrans.g:7595:4: 'atomic'
            {
             before(grammarAccess.getDoFrontAccess().getAtomAtomicKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDoFrontAccess().getAtomAtomicKeyword_1_0()); 

            }

             after(grammarAccess.getDoFrontAccess().getAtomAtomicKeyword_1_0()); 

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
    // $ANTLR end "rule__DoFront__AtomAssignment_1"


    // $ANTLR start "rule__DoFront__BlockAssignment_3"
    // InternalFortXTrans.g:7606:1: rule__DoFront__BlockAssignment_3 : ( ruleBlockElems ) ;
    public final void rule__DoFront__BlockAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7610:1: ( ( ruleBlockElems ) )
            // InternalFortXTrans.g:7611:2: ( ruleBlockElems )
            {
            // InternalFortXTrans.g:7611:2: ( ruleBlockElems )
            // InternalFortXTrans.g:7612:3: ruleBlockElems
            {
             before(grammarAccess.getDoFrontAccess().getBlockBlockElemsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBlockElems();

            state._fsp--;

             after(grammarAccess.getDoFrontAccess().getBlockBlockElemsParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__DoFront__BlockAssignment_3"


    // $ANTLR start "rule__IdOrTuple__BidAssignment_0"
    // InternalFortXTrans.g:7621:1: rule__IdOrTuple__BidAssignment_0 : ( ruleBindId ) ;
    public final void rule__IdOrTuple__BidAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7625:1: ( ( ruleBindId ) )
            // InternalFortXTrans.g:7626:2: ( ruleBindId )
            {
            // InternalFortXTrans.g:7626:2: ( ruleBindId )
            // InternalFortXTrans.g:7627:3: ruleBindId
            {
             before(grammarAccess.getIdOrTupleAccess().getBidBindIdParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBindId();

            state._fsp--;

             after(grammarAccess.getIdOrTupleAccess().getBidBindIdParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__IdOrTuple__BidAssignment_0"


    // $ANTLR start "rule__IdOrTuple__BidAssignment_1_1"
    // InternalFortXTrans.g:7636:1: rule__IdOrTuple__BidAssignment_1_1 : ( ruleBindId ) ;
    public final void rule__IdOrTuple__BidAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7640:1: ( ( ruleBindId ) )
            // InternalFortXTrans.g:7641:2: ( ruleBindId )
            {
            // InternalFortXTrans.g:7641:2: ( ruleBindId )
            // InternalFortXTrans.g:7642:3: ruleBindId
            {
             before(grammarAccess.getIdOrTupleAccess().getBidBindIdParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBindId();

            state._fsp--;

             after(grammarAccess.getIdOrTupleAccess().getBidBindIdParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__IdOrTuple__BidAssignment_1_1"


    // $ANTLR start "rule__IdOrTuple__BidAssignment_1_2_1"
    // InternalFortXTrans.g:7651:1: rule__IdOrTuple__BidAssignment_1_2_1 : ( ruleBindId ) ;
    public final void rule__IdOrTuple__BidAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7655:1: ( ( ruleBindId ) )
            // InternalFortXTrans.g:7656:2: ( ruleBindId )
            {
            // InternalFortXTrans.g:7656:2: ( ruleBindId )
            // InternalFortXTrans.g:7657:3: ruleBindId
            {
             before(grammarAccess.getIdOrTupleAccess().getBidBindIdParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBindId();

            state._fsp--;

             after(grammarAccess.getIdOrTupleAccess().getBidBindIdParserRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__IdOrTuple__BidAssignment_1_2_1"


    // $ANTLR start "rule__IsType__TypeAssignment_1"
    // InternalFortXTrans.g:7666:1: rule__IsType__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__IsType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7670:1: ( ( ruleType ) )
            // InternalFortXTrans.g:7671:2: ( ruleType )
            {
            // InternalFortXTrans.g:7671:2: ( ruleType )
            // InternalFortXTrans.g:7672:3: ruleType
            {
             before(grammarAccess.getIsTypeAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getIsTypeAccess().getTypeTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__IsType__TypeAssignment_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\1\31\uffff";
    static final String dfa_3s = "\1\4\1\uffff\11\4\2\35\2\4\2\35\2\uffff\1\4\1\30\1\4\2\35\1\4\1\30";
    static final String dfa_4s = "\1\53\1\uffff\4\53\1\42\4\53\2\35\1\34\1\4\2\35\2\uffff\1\4\1\34\1\23\2\35\1\4\1\34";
    static final String dfa_5s = "\1\uffff\1\2\17\uffff\2\1\7\uffff";
    static final String dfa_6s = "\32\uffff}>";
    static final String[] dfa_7s = {
            "\1\6\20\uffff\1\1\22\uffff\1\2\1\3\1\4\1\5",
            "",
            "\1\6\43\uffff\1\7\1\10\1\11\1\12",
            "\1\6\43\uffff\1\7\1\10\1\11\1\12",
            "\1\6\43\uffff\1\7\1\10\1\11\1\12",
            "\1\6\43\uffff\1\7\1\10\1\11\1\12",
            "\1\13\16\uffff\1\14\16\uffff\1\15",
            "\1\6\43\uffff\1\7\1\10\1\11\1\12",
            "\1\6\43\uffff\1\7\1\10\1\11\1\12",
            "\1\6\43\uffff\1\7\1\10\1\11\1\12",
            "\1\6\43\uffff\1\7\1\10\1\11\1\12",
            "\1\16",
            "\1\16",
            "\1\17\16\uffff\1\20\10\uffff\1\21",
            "\1\22",
            "\1\23",
            "\1\23",
            "",
            "",
            "\1\24",
            "\1\25\3\uffff\1\21",
            "\1\26\16\uffff\1\27",
            "\1\30",
            "\1\30",
            "\1\31",
            "\1\25\3\uffff\1\21"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 400:4: ( rule__Decls__DeclsAssignment )*";
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\1\uffff\1\4\1\uffff\1\4\2\uffff\1\4\3\uffff\1\4";
    static final String dfa_10s = "\1\4\1\5\1\4\1\25\1\uffff\1\4\1\5\1\32\2\uffff\1\25";
    static final String dfa_11s = "\1\4\1\46\1\32\1\46\1\uffff\1\5\1\46\1\32\2\uffff\1\46";
    static final String dfa_12s = "\4\uffff\1\3\3\uffff\1\2\1\1\1\uffff";
    static final String dfa_13s = "\13\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\3\17\uffff\1\4\3\uffff\1\2\1\uffff\1\4\11\uffff\2\4",
            "\1\6\25\uffff\1\5",
            "\1\4\3\uffff\1\7\1\uffff\1\4\11\uffff\2\4",
            "",
            "\1\10\1\11",
            "\1\12\17\uffff\1\4\3\uffff\1\2\1\uffff\1\4\11\uffff\2\4",
            "\1\5",
            "",
            "",
            "\1\4\3\uffff\1\7\1\uffff\1\4\11\uffff\2\4"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1154:1: rule__ImportedNames__Alternatives : ( ( ( rule__ImportedNames__Group_0__0 ) ) | ( ( rule__ImportedNames__Group_1__0 ) ) | ( ( rule__ImportedNames__Group_2__0 ) ) );";
        }
    }
    static final String dfa_15s = "\7\uffff";
    static final String dfa_16s = "\1\uffff\1\4\3\uffff\1\4\1\uffff";
    static final String dfa_17s = "\2\4\1\uffff\1\4\1\uffff\1\4\1\uffff";
    static final String dfa_18s = "\1\4\1\60\1\uffff\1\4\1\uffff\1\60\1\uffff";
    static final String dfa_19s = "\2\uffff\1\1\1\uffff\1\3\1\uffff\1\2";
    static final String dfa_20s = "\7\uffff}>";
    static final String[] dfa_21s = {
            "\1\1",
            "\1\4\1\2\17\uffff\1\4\2\uffff\1\4\1\3\1\uffff\2\4\1\uffff\3\4\1\uffff\3\4\3\uffff\4\4\1\uffff\4\4",
            "",
            "\1\5",
            "",
            "\1\4\1\6\17\uffff\1\4\2\uffff\1\4\1\3\1\uffff\2\4\1\uffff\3\4\1\uffff\3\4\3\uffff\4\4\1\uffff\4\4",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "1181:1: rule__QualifiedName__Alternatives : ( ( ( rule__QualifiedName__Group_0__0 ) ) | ( ( rule__QualifiedName__Group_1__0 ) ) | ( ( rule__QualifiedName__Group_2__0 ) ) );";
        }
    }
    static final String dfa_22s = "\3\4\2\uffff\1\4\1\uffff";
    static final String dfa_23s = "\1\4\1\53\1\32\2\uffff\1\53\1\uffff";
    static final String dfa_24s = "\3\uffff\1\1\1\3\1\uffff\1\2";
    static final String[] dfa_25s = {
            "\1\1",
            "\1\4\1\3\17\uffff\1\4\1\uffff\2\4\1\2\1\uffff\1\4\11\uffff\2\4\1\uffff\4\4",
            "\1\5\25\uffff\1\4",
            "",
            "",
            "\1\4\1\6\17\uffff\1\4\1\uffff\2\4\1\2\1\uffff\1\4\11\uffff\2\4\1\uffff\4\4",
            ""
    };
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_20;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1208:1: rule__APIName__Alternatives : ( ( ( rule__APIName__Group_0__0 ) ) | ( ( rule__APIName__Group_1__0 ) ) | ( ( rule__APIName__Group_2__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000F0000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000F0000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000F0000200010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000002000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010080010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000F0000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400080010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001E41400000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001041000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000180200000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001E41400080010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001E41400000012L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000011000000L});

}