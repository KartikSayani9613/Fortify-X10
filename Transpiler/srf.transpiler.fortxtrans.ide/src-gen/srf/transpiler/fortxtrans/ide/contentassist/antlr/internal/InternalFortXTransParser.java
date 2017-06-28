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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOTS", "RULE_ML_COMMENT", "RULE_SD", "RULE_GREATERS", "RULE_LESSES", "RULE_BARS", "RULE_SLASHES", "RULE_LEFT_ENCLOSER", "RULE_RIGHT_ENCLOSER", "RULE_INT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'_'", "'component'", "'end'", "'api'", "'}'", "','", "'.'", "'{'", "'as'", "')'", "':'", "'then'", "'elif'", "'else'", "'<-'", "'('", "'also'", "'do'", "'import'", "'export'", "'except'", "'private'", "'test'", "'atomic'", "'io'", "'='", "'while'", "'for'", "'if'", "'seq'", "'at'"
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
    public static final int T__49=49;
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
    // InternalFortXTrans.g:851:1: ruleBinding : ( ( rule__Binding__Alternatives ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:855:2: ( ( ( rule__Binding__Alternatives ) ) )
            // InternalFortXTrans.g:856:2: ( ( rule__Binding__Alternatives ) )
            {
            // InternalFortXTrans.g:856:2: ( ( rule__Binding__Alternatives ) )
            // InternalFortXTrans.g:857:3: ( rule__Binding__Alternatives )
            {
             before(grammarAccess.getBindingAccess().getAlternatives()); 
            // InternalFortXTrans.g:858:3: ( rule__Binding__Alternatives )
            // InternalFortXTrans.g:858:4: rule__Binding__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getAlternatives()); 

            }


            }

        }
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

            if ( (LA14_0==34||LA14_0==36||LA14_0==42||(LA14_0>=45 && LA14_0<=47)||LA14_0==49) ) {
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
            case 49:
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


    // $ANTLR start "rule__Binding__Alternatives"
    // InternalFortXTrans.g:1412:1: rule__Binding__Alternatives : ( ( ( rule__Binding__Group_0__0 ) ) | ( ( rule__Binding__Group_1__0 ) ) );
    public final void rule__Binding__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1416:1: ( ( ( rule__Binding__Group_0__0 ) ) | ( ( rule__Binding__Group_1__0 ) ) )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalFortXTrans.g:1417:2: ( ( rule__Binding__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1417:2: ( ( rule__Binding__Group_0__0 ) )
                    // InternalFortXTrans.g:1418:3: ( rule__Binding__Group_0__0 )
                    {
                     before(grammarAccess.getBindingAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1419:3: ( rule__Binding__Group_0__0 )
                    // InternalFortXTrans.g:1419:4: rule__Binding__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Binding__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBindingAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1423:2: ( ( rule__Binding__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1423:2: ( ( rule__Binding__Group_1__0 ) )
                    // InternalFortXTrans.g:1424:3: ( rule__Binding__Group_1__0 )
                    {
                     before(grammarAccess.getBindingAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1425:3: ( rule__Binding__Group_1__0 )
                    // InternalFortXTrans.g:1425:4: rule__Binding__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Binding__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBindingAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Binding__Alternatives"


    // $ANTLR start "rule__GenClause__Alternatives"
    // InternalFortXTrans.g:1433:1: rule__GenClause__Alternatives : ( ( ( rule__GenClause__BindingAssignment_0 ) ) | ( ( rule__GenClause__ExprAssignment_1 ) ) );
    public final void rule__GenClause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1437:1: ( ( ( rule__GenClause__BindingAssignment_0 ) ) | ( ( rule__GenClause__ExprAssignment_1 ) ) )
            int alt17=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==33) ) {
                    alt17=1;
                }
                else if ( (LA17_1==EOF||LA17_1==RULE_DOTS||(LA17_1>=24 && LA17_1<=25)||LA17_1==27||LA17_1==36||LA17_1==42||LA17_1==49) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt17=1;
                }
                break;
            case 34:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_DOTS:
                    case 25:
                    case 27:
                        {
                        alt17=2;
                        }
                        break;
                    case 28:
                        {
                        int LA17_6 = input.LA(4);

                        if ( (LA17_6==33) ) {
                            alt17=1;
                        }
                        else if ( (LA17_6==EOF||LA17_6==24||LA17_6==27||LA17_6==36||LA17_6==42||LA17_6==49) ) {
                            alt17=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 24:
                        {
                        alt17=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 5, input);

                        throw nvae;
                    }

                    }
                    break;
                case 19:
                    {
                    alt17=1;
                    }
                    break;
                case 34:
                case 36:
                case 42:
                case 45:
                case 46:
                case 47:
                case 49:
                    {
                    alt17=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 3, input);

                    throw nvae;
                }

                }
                break;
            case 36:
            case 42:
            case 45:
            case 46:
            case 47:
            case 49:
                {
                alt17=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalFortXTrans.g:1438:2: ( ( rule__GenClause__BindingAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1438:2: ( ( rule__GenClause__BindingAssignment_0 ) )
                    // InternalFortXTrans.g:1439:3: ( rule__GenClause__BindingAssignment_0 )
                    {
                     before(grammarAccess.getGenClauseAccess().getBindingAssignment_0()); 
                    // InternalFortXTrans.g:1440:3: ( rule__GenClause__BindingAssignment_0 )
                    // InternalFortXTrans.g:1440:4: rule__GenClause__BindingAssignment_0
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
                    // InternalFortXTrans.g:1444:2: ( ( rule__GenClause__ExprAssignment_1 ) )
                    {
                    // InternalFortXTrans.g:1444:2: ( ( rule__GenClause__ExprAssignment_1 ) )
                    // InternalFortXTrans.g:1445:3: ( rule__GenClause__ExprAssignment_1 )
                    {
                     before(grammarAccess.getGenClauseAccess().getExprAssignment_1()); 
                    // InternalFortXTrans.g:1446:3: ( rule__GenClause__ExprAssignment_1 )
                    // InternalFortXTrans.g:1446:4: rule__GenClause__ExprAssignment_1
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
    // InternalFortXTrans.g:1454:1: rule__IdOrTuple__Alternatives : ( ( ( rule__IdOrTuple__BidAssignment_0 ) ) | ( ( rule__IdOrTuple__Group_1__0 ) ) );
    public final void rule__IdOrTuple__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1458:1: ( ( ( rule__IdOrTuple__BidAssignment_0 ) ) | ( ( rule__IdOrTuple__Group_1__0 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||LA18_0==19) ) {
                alt18=1;
            }
            else if ( (LA18_0==34) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalFortXTrans.g:1459:2: ( ( rule__IdOrTuple__BidAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1459:2: ( ( rule__IdOrTuple__BidAssignment_0 ) )
                    // InternalFortXTrans.g:1460:3: ( rule__IdOrTuple__BidAssignment_0 )
                    {
                     before(grammarAccess.getIdOrTupleAccess().getBidAssignment_0()); 
                    // InternalFortXTrans.g:1461:3: ( rule__IdOrTuple__BidAssignment_0 )
                    // InternalFortXTrans.g:1461:4: rule__IdOrTuple__BidAssignment_0
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
                    // InternalFortXTrans.g:1465:2: ( ( rule__IdOrTuple__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1465:2: ( ( rule__IdOrTuple__Group_1__0 ) )
                    // InternalFortXTrans.g:1466:3: ( rule__IdOrTuple__Group_1__0 )
                    {
                     before(grammarAccess.getIdOrTupleAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1467:3: ( rule__IdOrTuple__Group_1__0 )
                    // InternalFortXTrans.g:1467:4: rule__IdOrTuple__Group_1__0
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
    // InternalFortXTrans.g:1475:1: rule__BindId__Alternatives : ( ( RULE_ID ) | ( '_' ) );
    public final void rule__BindId__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1479:1: ( ( RULE_ID ) | ( '_' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==19) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalFortXTrans.g:1480:2: ( RULE_ID )
                    {
                    // InternalFortXTrans.g:1480:2: ( RULE_ID )
                    // InternalFortXTrans.g:1481:3: RULE_ID
                    {
                     before(grammarAccess.getBindIdAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getBindIdAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1486:2: ( '_' )
                    {
                    // InternalFortXTrans.g:1486:2: ( '_' )
                    // InternalFortXTrans.g:1487:3: '_'
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
    // InternalFortXTrans.g:1496:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1500:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalFortXTrans.g:1501:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalFortXTrans.g:1508:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1512:1: ( ( 'component' ) )
            // InternalFortXTrans.g:1513:1: ( 'component' )
            {
            // InternalFortXTrans.g:1513:1: ( 'component' )
            // InternalFortXTrans.g:1514:2: 'component'
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
    // InternalFortXTrans.g:1523:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1527:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalFortXTrans.g:1528:2: rule__Component__Group__1__Impl rule__Component__Group__2
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
    // InternalFortXTrans.g:1535:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1539:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalFortXTrans.g:1540:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalFortXTrans.g:1540:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalFortXTrans.g:1541:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalFortXTrans.g:1542:2: ( rule__Component__NameAssignment_1 )
            // InternalFortXTrans.g:1542:3: rule__Component__NameAssignment_1
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
    // InternalFortXTrans.g:1550:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1554:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalFortXTrans.g:1555:2: rule__Component__Group__2__Impl rule__Component__Group__3
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
    // InternalFortXTrans.g:1562:1: rule__Component__Group__2__Impl : ( ( rule__Component__ImportsAssignment_2 )* ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1566:1: ( ( ( rule__Component__ImportsAssignment_2 )* ) )
            // InternalFortXTrans.g:1567:1: ( ( rule__Component__ImportsAssignment_2 )* )
            {
            // InternalFortXTrans.g:1567:1: ( ( rule__Component__ImportsAssignment_2 )* )
            // InternalFortXTrans.g:1568:2: ( rule__Component__ImportsAssignment_2 )*
            {
             before(grammarAccess.getComponentAccess().getImportsAssignment_2()); 
            // InternalFortXTrans.g:1569:2: ( rule__Component__ImportsAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==37) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalFortXTrans.g:1569:3: rule__Component__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Component__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalFortXTrans.g:1577:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1581:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalFortXTrans.g:1582:2: rule__Component__Group__3__Impl rule__Component__Group__4
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
    // InternalFortXTrans.g:1589:1: rule__Component__Group__3__Impl : ( ( ( rule__Component__ExportsAssignment_3 ) ) ( ( rule__Component__ExportsAssignment_3 )* ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1593:1: ( ( ( ( rule__Component__ExportsAssignment_3 ) ) ( ( rule__Component__ExportsAssignment_3 )* ) ) )
            // InternalFortXTrans.g:1594:1: ( ( ( rule__Component__ExportsAssignment_3 ) ) ( ( rule__Component__ExportsAssignment_3 )* ) )
            {
            // InternalFortXTrans.g:1594:1: ( ( ( rule__Component__ExportsAssignment_3 ) ) ( ( rule__Component__ExportsAssignment_3 )* ) )
            // InternalFortXTrans.g:1595:2: ( ( rule__Component__ExportsAssignment_3 ) ) ( ( rule__Component__ExportsAssignment_3 )* )
            {
            // InternalFortXTrans.g:1595:2: ( ( rule__Component__ExportsAssignment_3 ) )
            // InternalFortXTrans.g:1596:3: ( rule__Component__ExportsAssignment_3 )
            {
             before(grammarAccess.getComponentAccess().getExportsAssignment_3()); 
            // InternalFortXTrans.g:1597:3: ( rule__Component__ExportsAssignment_3 )
            // InternalFortXTrans.g:1597:4: rule__Component__ExportsAssignment_3
            {
            pushFollow(FOLLOW_9);
            rule__Component__ExportsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getExportsAssignment_3()); 

            }

            // InternalFortXTrans.g:1600:2: ( ( rule__Component__ExportsAssignment_3 )* )
            // InternalFortXTrans.g:1601:3: ( rule__Component__ExportsAssignment_3 )*
            {
             before(grammarAccess.getComponentAccess().getExportsAssignment_3()); 
            // InternalFortXTrans.g:1602:3: ( rule__Component__ExportsAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==38) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalFortXTrans.g:1602:4: rule__Component__ExportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Component__ExportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalFortXTrans.g:1611:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1615:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalFortXTrans.g:1616:2: rule__Component__Group__4__Impl rule__Component__Group__5
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
    // InternalFortXTrans.g:1623:1: rule__Component__Group__4__Impl : ( ( rule__Component__DeclsAssignment_4 )* ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1627:1: ( ( ( rule__Component__DeclsAssignment_4 )* ) )
            // InternalFortXTrans.g:1628:1: ( ( rule__Component__DeclsAssignment_4 )* )
            {
            // InternalFortXTrans.g:1628:1: ( ( rule__Component__DeclsAssignment_4 )* )
            // InternalFortXTrans.g:1629:2: ( rule__Component__DeclsAssignment_4 )*
            {
             before(grammarAccess.getComponentAccess().getDeclsAssignment_4()); 
            // InternalFortXTrans.g:1630:2: ( rule__Component__DeclsAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||(LA22_0>=40 && LA22_0<=43)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalFortXTrans.g:1630:3: rule__Component__DeclsAssignment_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Component__DeclsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalFortXTrans.g:1638:1: rule__Component__Group__5 : rule__Component__Group__5__Impl ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1642:1: ( rule__Component__Group__5__Impl )
            // InternalFortXTrans.g:1643:2: rule__Component__Group__5__Impl
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
    // InternalFortXTrans.g:1649:1: rule__Component__Group__5__Impl : ( 'end' ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1653:1: ( ( 'end' ) )
            // InternalFortXTrans.g:1654:1: ( 'end' )
            {
            // InternalFortXTrans.g:1654:1: ( 'end' )
            // InternalFortXTrans.g:1655:2: 'end'
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
    // InternalFortXTrans.g:1665:1: rule__API__Group__0 : rule__API__Group__0__Impl rule__API__Group__1 ;
    public final void rule__API__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1669:1: ( rule__API__Group__0__Impl rule__API__Group__1 )
            // InternalFortXTrans.g:1670:2: rule__API__Group__0__Impl rule__API__Group__1
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
    // InternalFortXTrans.g:1677:1: rule__API__Group__0__Impl : ( 'api' ) ;
    public final void rule__API__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1681:1: ( ( 'api' ) )
            // InternalFortXTrans.g:1682:1: ( 'api' )
            {
            // InternalFortXTrans.g:1682:1: ( 'api' )
            // InternalFortXTrans.g:1683:2: 'api'
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
    // InternalFortXTrans.g:1692:1: rule__API__Group__1 : rule__API__Group__1__Impl rule__API__Group__2 ;
    public final void rule__API__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1696:1: ( rule__API__Group__1__Impl rule__API__Group__2 )
            // InternalFortXTrans.g:1697:2: rule__API__Group__1__Impl rule__API__Group__2
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
    // InternalFortXTrans.g:1704:1: rule__API__Group__1__Impl : ( ( rule__API__NameAssignment_1 ) ) ;
    public final void rule__API__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1708:1: ( ( ( rule__API__NameAssignment_1 ) ) )
            // InternalFortXTrans.g:1709:1: ( ( rule__API__NameAssignment_1 ) )
            {
            // InternalFortXTrans.g:1709:1: ( ( rule__API__NameAssignment_1 ) )
            // InternalFortXTrans.g:1710:2: ( rule__API__NameAssignment_1 )
            {
             before(grammarAccess.getAPIAccess().getNameAssignment_1()); 
            // InternalFortXTrans.g:1711:2: ( rule__API__NameAssignment_1 )
            // InternalFortXTrans.g:1711:3: rule__API__NameAssignment_1
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
    // InternalFortXTrans.g:1719:1: rule__API__Group__2 : rule__API__Group__2__Impl rule__API__Group__3 ;
    public final void rule__API__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1723:1: ( rule__API__Group__2__Impl rule__API__Group__3 )
            // InternalFortXTrans.g:1724:2: rule__API__Group__2__Impl rule__API__Group__3
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
    // InternalFortXTrans.g:1731:1: rule__API__Group__2__Impl : ( ( rule__API__ImportsAssignment_2 )* ) ;
    public final void rule__API__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1735:1: ( ( ( rule__API__ImportsAssignment_2 )* ) )
            // InternalFortXTrans.g:1736:1: ( ( rule__API__ImportsAssignment_2 )* )
            {
            // InternalFortXTrans.g:1736:1: ( ( rule__API__ImportsAssignment_2 )* )
            // InternalFortXTrans.g:1737:2: ( rule__API__ImportsAssignment_2 )*
            {
             before(grammarAccess.getAPIAccess().getImportsAssignment_2()); 
            // InternalFortXTrans.g:1738:2: ( rule__API__ImportsAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==37) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalFortXTrans.g:1738:3: rule__API__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__API__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalFortXTrans.g:1746:1: rule__API__Group__3 : rule__API__Group__3__Impl ;
    public final void rule__API__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1750:1: ( rule__API__Group__3__Impl )
            // InternalFortXTrans.g:1751:2: rule__API__Group__3__Impl
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
    // InternalFortXTrans.g:1757:1: rule__API__Group__3__Impl : ( 'end' ) ;
    public final void rule__API__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1761:1: ( ( 'end' ) )
            // InternalFortXTrans.g:1762:1: ( 'end' )
            {
            // InternalFortXTrans.g:1762:1: ( 'end' )
            // InternalFortXTrans.g:1763:2: 'end'
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
    // InternalFortXTrans.g:1773:1: rule__Import__Group_0__0 : rule__Import__Group_0__0__Impl rule__Import__Group_0__1 ;
    public final void rule__Import__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1777:1: ( rule__Import__Group_0__0__Impl rule__Import__Group_0__1 )
            // InternalFortXTrans.g:1778:2: rule__Import__Group_0__0__Impl rule__Import__Group_0__1
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
    // InternalFortXTrans.g:1785:1: rule__Import__Group_0__0__Impl : ( ( rule__Import__ImpsAssignment_0_0 ) ) ;
    public final void rule__Import__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1789:1: ( ( ( rule__Import__ImpsAssignment_0_0 ) ) )
            // InternalFortXTrans.g:1790:1: ( ( rule__Import__ImpsAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:1790:1: ( ( rule__Import__ImpsAssignment_0_0 ) )
            // InternalFortXTrans.g:1791:2: ( rule__Import__ImpsAssignment_0_0 )
            {
             before(grammarAccess.getImportAccess().getImpsAssignment_0_0()); 
            // InternalFortXTrans.g:1792:2: ( rule__Import__ImpsAssignment_0_0 )
            // InternalFortXTrans.g:1792:3: rule__Import__ImpsAssignment_0_0
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
    // InternalFortXTrans.g:1800:1: rule__Import__Group_0__1 : rule__Import__Group_0__1__Impl ;
    public final void rule__Import__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1804:1: ( rule__Import__Group_0__1__Impl )
            // InternalFortXTrans.g:1805:2: rule__Import__Group_0__1__Impl
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
    // InternalFortXTrans.g:1811:1: rule__Import__Group_0__1__Impl : ( ( rule__Import__ImportedNamesAssignment_0_1 ) ) ;
    public final void rule__Import__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1815:1: ( ( ( rule__Import__ImportedNamesAssignment_0_1 ) ) )
            // InternalFortXTrans.g:1816:1: ( ( rule__Import__ImportedNamesAssignment_0_1 ) )
            {
            // InternalFortXTrans.g:1816:1: ( ( rule__Import__ImportedNamesAssignment_0_1 ) )
            // InternalFortXTrans.g:1817:2: ( rule__Import__ImportedNamesAssignment_0_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamesAssignment_0_1()); 
            // InternalFortXTrans.g:1818:2: ( rule__Import__ImportedNamesAssignment_0_1 )
            // InternalFortXTrans.g:1818:3: rule__Import__ImportedNamesAssignment_0_1
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
    // InternalFortXTrans.g:1827:1: rule__Import__Group_1__0 : rule__Import__Group_1__0__Impl rule__Import__Group_1__1 ;
    public final void rule__Import__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1831:1: ( rule__Import__Group_1__0__Impl rule__Import__Group_1__1 )
            // InternalFortXTrans.g:1832:2: rule__Import__Group_1__0__Impl rule__Import__Group_1__1
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
    // InternalFortXTrans.g:1839:1: rule__Import__Group_1__0__Impl : ( ( rule__Import__ImpsAssignment_1_0 ) ) ;
    public final void rule__Import__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1843:1: ( ( ( rule__Import__ImpsAssignment_1_0 ) ) )
            // InternalFortXTrans.g:1844:1: ( ( rule__Import__ImpsAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:1844:1: ( ( rule__Import__ImpsAssignment_1_0 ) )
            // InternalFortXTrans.g:1845:2: ( rule__Import__ImpsAssignment_1_0 )
            {
             before(grammarAccess.getImportAccess().getImpsAssignment_1_0()); 
            // InternalFortXTrans.g:1846:2: ( rule__Import__ImpsAssignment_1_0 )
            // InternalFortXTrans.g:1846:3: rule__Import__ImpsAssignment_1_0
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
    // InternalFortXTrans.g:1854:1: rule__Import__Group_1__1 : rule__Import__Group_1__1__Impl rule__Import__Group_1__2 ;
    public final void rule__Import__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1858:1: ( rule__Import__Group_1__1__Impl rule__Import__Group_1__2 )
            // InternalFortXTrans.g:1859:2: rule__Import__Group_1__1__Impl rule__Import__Group_1__2
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
    // InternalFortXTrans.g:1866:1: rule__Import__Group_1__1__Impl : ( ( rule__Import__ApiAssignment_1_1 ) ) ;
    public final void rule__Import__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1870:1: ( ( ( rule__Import__ApiAssignment_1_1 ) ) )
            // InternalFortXTrans.g:1871:1: ( ( rule__Import__ApiAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:1871:1: ( ( rule__Import__ApiAssignment_1_1 ) )
            // InternalFortXTrans.g:1872:2: ( rule__Import__ApiAssignment_1_1 )
            {
             before(grammarAccess.getImportAccess().getApiAssignment_1_1()); 
            // InternalFortXTrans.g:1873:2: ( rule__Import__ApiAssignment_1_1 )
            // InternalFortXTrans.g:1873:3: rule__Import__ApiAssignment_1_1
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
    // InternalFortXTrans.g:1881:1: rule__Import__Group_1__2 : rule__Import__Group_1__2__Impl ;
    public final void rule__Import__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1885:1: ( rule__Import__Group_1__2__Impl )
            // InternalFortXTrans.g:1886:2: rule__Import__Group_1__2__Impl
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
    // InternalFortXTrans.g:1892:1: rule__Import__Group_1__2__Impl : ( ( rule__Import__AliasedimportedNamesAssignment_1_2 ) ) ;
    public final void rule__Import__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1896:1: ( ( ( rule__Import__AliasedimportedNamesAssignment_1_2 ) ) )
            // InternalFortXTrans.g:1897:1: ( ( rule__Import__AliasedimportedNamesAssignment_1_2 ) )
            {
            // InternalFortXTrans.g:1897:1: ( ( rule__Import__AliasedimportedNamesAssignment_1_2 ) )
            // InternalFortXTrans.g:1898:2: ( rule__Import__AliasedimportedNamesAssignment_1_2 )
            {
             before(grammarAccess.getImportAccess().getAliasedimportedNamesAssignment_1_2()); 
            // InternalFortXTrans.g:1899:2: ( rule__Import__AliasedimportedNamesAssignment_1_2 )
            // InternalFortXTrans.g:1899:3: rule__Import__AliasedimportedNamesAssignment_1_2
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
    // InternalFortXTrans.g:1908:1: rule__Export__Group_0__0 : rule__Export__Group_0__0__Impl rule__Export__Group_0__1 ;
    public final void rule__Export__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1912:1: ( rule__Export__Group_0__0__Impl rule__Export__Group_0__1 )
            // InternalFortXTrans.g:1913:2: rule__Export__Group_0__0__Impl rule__Export__Group_0__1
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
    // InternalFortXTrans.g:1920:1: rule__Export__Group_0__0__Impl : ( ( rule__Export__ExpAssignment_0_0 ) ) ;
    public final void rule__Export__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1924:1: ( ( ( rule__Export__ExpAssignment_0_0 ) ) )
            // InternalFortXTrans.g:1925:1: ( ( rule__Export__ExpAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:1925:1: ( ( rule__Export__ExpAssignment_0_0 ) )
            // InternalFortXTrans.g:1926:2: ( rule__Export__ExpAssignment_0_0 )
            {
             before(grammarAccess.getExportAccess().getExpAssignment_0_0()); 
            // InternalFortXTrans.g:1927:2: ( rule__Export__ExpAssignment_0_0 )
            // InternalFortXTrans.g:1927:3: rule__Export__ExpAssignment_0_0
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
    // InternalFortXTrans.g:1935:1: rule__Export__Group_0__1 : rule__Export__Group_0__1__Impl ;
    public final void rule__Export__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1939:1: ( rule__Export__Group_0__1__Impl )
            // InternalFortXTrans.g:1940:2: rule__Export__Group_0__1__Impl
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
    // InternalFortXTrans.g:1946:1: rule__Export__Group_0__1__Impl : ( ( rule__Export__ExportedNameAssignment_0_1 ) ) ;
    public final void rule__Export__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1950:1: ( ( ( rule__Export__ExportedNameAssignment_0_1 ) ) )
            // InternalFortXTrans.g:1951:1: ( ( rule__Export__ExportedNameAssignment_0_1 ) )
            {
            // InternalFortXTrans.g:1951:1: ( ( rule__Export__ExportedNameAssignment_0_1 ) )
            // InternalFortXTrans.g:1952:2: ( rule__Export__ExportedNameAssignment_0_1 )
            {
             before(grammarAccess.getExportAccess().getExportedNameAssignment_0_1()); 
            // InternalFortXTrans.g:1953:2: ( rule__Export__ExportedNameAssignment_0_1 )
            // InternalFortXTrans.g:1953:3: rule__Export__ExportedNameAssignment_0_1
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
    // InternalFortXTrans.g:1962:1: rule__Export__Group_1__0 : rule__Export__Group_1__0__Impl rule__Export__Group_1__1 ;
    public final void rule__Export__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1966:1: ( rule__Export__Group_1__0__Impl rule__Export__Group_1__1 )
            // InternalFortXTrans.g:1967:2: rule__Export__Group_1__0__Impl rule__Export__Group_1__1
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
    // InternalFortXTrans.g:1974:1: rule__Export__Group_1__0__Impl : ( ( rule__Export__ExpAssignment_1_0 ) ) ;
    public final void rule__Export__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1978:1: ( ( ( rule__Export__ExpAssignment_1_0 ) ) )
            // InternalFortXTrans.g:1979:1: ( ( rule__Export__ExpAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:1979:1: ( ( rule__Export__ExpAssignment_1_0 ) )
            // InternalFortXTrans.g:1980:2: ( rule__Export__ExpAssignment_1_0 )
            {
             before(grammarAccess.getExportAccess().getExpAssignment_1_0()); 
            // InternalFortXTrans.g:1981:2: ( rule__Export__ExpAssignment_1_0 )
            // InternalFortXTrans.g:1981:3: rule__Export__ExpAssignment_1_0
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
    // InternalFortXTrans.g:1989:1: rule__Export__Group_1__1 : rule__Export__Group_1__1__Impl rule__Export__Group_1__2 ;
    public final void rule__Export__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1993:1: ( rule__Export__Group_1__1__Impl rule__Export__Group_1__2 )
            // InternalFortXTrans.g:1994:2: rule__Export__Group_1__1__Impl rule__Export__Group_1__2
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
    // InternalFortXTrans.g:2001:1: rule__Export__Group_1__1__Impl : ( ( rule__Export__BrackAssignment_1_1 ) ) ;
    public final void rule__Export__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2005:1: ( ( ( rule__Export__BrackAssignment_1_1 ) ) )
            // InternalFortXTrans.g:2006:1: ( ( rule__Export__BrackAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:2006:1: ( ( rule__Export__BrackAssignment_1_1 ) )
            // InternalFortXTrans.g:2007:2: ( rule__Export__BrackAssignment_1_1 )
            {
             before(grammarAccess.getExportAccess().getBrackAssignment_1_1()); 
            // InternalFortXTrans.g:2008:2: ( rule__Export__BrackAssignment_1_1 )
            // InternalFortXTrans.g:2008:3: rule__Export__BrackAssignment_1_1
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
    // InternalFortXTrans.g:2016:1: rule__Export__Group_1__2 : rule__Export__Group_1__2__Impl rule__Export__Group_1__3 ;
    public final void rule__Export__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2020:1: ( rule__Export__Group_1__2__Impl rule__Export__Group_1__3 )
            // InternalFortXTrans.g:2021:2: rule__Export__Group_1__2__Impl rule__Export__Group_1__3
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
    // InternalFortXTrans.g:2028:1: rule__Export__Group_1__2__Impl : ( ( rule__Export__ExportedNameAssignment_1_2 ) ) ;
    public final void rule__Export__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2032:1: ( ( ( rule__Export__ExportedNameAssignment_1_2 ) ) )
            // InternalFortXTrans.g:2033:1: ( ( rule__Export__ExportedNameAssignment_1_2 ) )
            {
            // InternalFortXTrans.g:2033:1: ( ( rule__Export__ExportedNameAssignment_1_2 ) )
            // InternalFortXTrans.g:2034:2: ( rule__Export__ExportedNameAssignment_1_2 )
            {
             before(grammarAccess.getExportAccess().getExportedNameAssignment_1_2()); 
            // InternalFortXTrans.g:2035:2: ( rule__Export__ExportedNameAssignment_1_2 )
            // InternalFortXTrans.g:2035:3: rule__Export__ExportedNameAssignment_1_2
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
    // InternalFortXTrans.g:2043:1: rule__Export__Group_1__3 : rule__Export__Group_1__3__Impl rule__Export__Group_1__4 ;
    public final void rule__Export__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2047:1: ( rule__Export__Group_1__3__Impl rule__Export__Group_1__4 )
            // InternalFortXTrans.g:2048:2: rule__Export__Group_1__3__Impl rule__Export__Group_1__4
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
    // InternalFortXTrans.g:2055:1: rule__Export__Group_1__3__Impl : ( ( rule__Export__Group_1_3__0 )* ) ;
    public final void rule__Export__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2059:1: ( ( ( rule__Export__Group_1_3__0 )* ) )
            // InternalFortXTrans.g:2060:1: ( ( rule__Export__Group_1_3__0 )* )
            {
            // InternalFortXTrans.g:2060:1: ( ( rule__Export__Group_1_3__0 )* )
            // InternalFortXTrans.g:2061:2: ( rule__Export__Group_1_3__0 )*
            {
             before(grammarAccess.getExportAccess().getGroup_1_3()); 
            // InternalFortXTrans.g:2062:2: ( rule__Export__Group_1_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==24) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalFortXTrans.g:2062:3: rule__Export__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Export__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalFortXTrans.g:2070:1: rule__Export__Group_1__4 : rule__Export__Group_1__4__Impl ;
    public final void rule__Export__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2074:1: ( rule__Export__Group_1__4__Impl )
            // InternalFortXTrans.g:2075:2: rule__Export__Group_1__4__Impl
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
    // InternalFortXTrans.g:2081:1: rule__Export__Group_1__4__Impl : ( '}' ) ;
    public final void rule__Export__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2085:1: ( ( '}' ) )
            // InternalFortXTrans.g:2086:1: ( '}' )
            {
            // InternalFortXTrans.g:2086:1: ( '}' )
            // InternalFortXTrans.g:2087:2: '}'
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
    // InternalFortXTrans.g:2097:1: rule__Export__Group_1_3__0 : rule__Export__Group_1_3__0__Impl rule__Export__Group_1_3__1 ;
    public final void rule__Export__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2101:1: ( rule__Export__Group_1_3__0__Impl rule__Export__Group_1_3__1 )
            // InternalFortXTrans.g:2102:2: rule__Export__Group_1_3__0__Impl rule__Export__Group_1_3__1
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
    // InternalFortXTrans.g:2109:1: rule__Export__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__Export__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2113:1: ( ( ',' ) )
            // InternalFortXTrans.g:2114:1: ( ',' )
            {
            // InternalFortXTrans.g:2114:1: ( ',' )
            // InternalFortXTrans.g:2115:2: ','
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
    // InternalFortXTrans.g:2124:1: rule__Export__Group_1_3__1 : rule__Export__Group_1_3__1__Impl ;
    public final void rule__Export__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2128:1: ( rule__Export__Group_1_3__1__Impl )
            // InternalFortXTrans.g:2129:2: rule__Export__Group_1_3__1__Impl
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
    // InternalFortXTrans.g:2135:1: rule__Export__Group_1_3__1__Impl : ( ( rule__Export__ExportedNameAssignment_1_3_1 ) ) ;
    public final void rule__Export__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2139:1: ( ( ( rule__Export__ExportedNameAssignment_1_3_1 ) ) )
            // InternalFortXTrans.g:2140:1: ( ( rule__Export__ExportedNameAssignment_1_3_1 ) )
            {
            // InternalFortXTrans.g:2140:1: ( ( rule__Export__ExportedNameAssignment_1_3_1 ) )
            // InternalFortXTrans.g:2141:2: ( rule__Export__ExportedNameAssignment_1_3_1 )
            {
             before(grammarAccess.getExportAccess().getExportedNameAssignment_1_3_1()); 
            // InternalFortXTrans.g:2142:2: ( rule__Export__ExportedNameAssignment_1_3_1 )
            // InternalFortXTrans.g:2142:3: rule__Export__ExportedNameAssignment_1_3_1
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
    // InternalFortXTrans.g:2151:1: rule__ImportedNames__Group_0__0 : rule__ImportedNames__Group_0__0__Impl rule__ImportedNames__Group_0__1 ;
    public final void rule__ImportedNames__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2155:1: ( rule__ImportedNames__Group_0__0__Impl rule__ImportedNames__Group_0__1 )
            // InternalFortXTrans.g:2156:2: rule__ImportedNames__Group_0__0__Impl rule__ImportedNames__Group_0__1
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
    // InternalFortXTrans.g:2163:1: rule__ImportedNames__Group_0__0__Impl : ( ( rule__ImportedNames__ImpnameAssignment_0_0 ) ) ;
    public final void rule__ImportedNames__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2167:1: ( ( ( rule__ImportedNames__ImpnameAssignment_0_0 ) ) )
            // InternalFortXTrans.g:2168:1: ( ( rule__ImportedNames__ImpnameAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:2168:1: ( ( rule__ImportedNames__ImpnameAssignment_0_0 ) )
            // InternalFortXTrans.g:2169:2: ( rule__ImportedNames__ImpnameAssignment_0_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getImpnameAssignment_0_0()); 
            // InternalFortXTrans.g:2170:2: ( rule__ImportedNames__ImpnameAssignment_0_0 )
            // InternalFortXTrans.g:2170:3: rule__ImportedNames__ImpnameAssignment_0_0
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
    // InternalFortXTrans.g:2178:1: rule__ImportedNames__Group_0__1 : rule__ImportedNames__Group_0__1__Impl rule__ImportedNames__Group_0__2 ;
    public final void rule__ImportedNames__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2182:1: ( rule__ImportedNames__Group_0__1__Impl rule__ImportedNames__Group_0__2 )
            // InternalFortXTrans.g:2183:2: rule__ImportedNames__Group_0__1__Impl rule__ImportedNames__Group_0__2
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
    // InternalFortXTrans.g:2190:1: rule__ImportedNames__Group_0__1__Impl : ( '.' ) ;
    public final void rule__ImportedNames__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2194:1: ( ( '.' ) )
            // InternalFortXTrans.g:2195:1: ( '.' )
            {
            // InternalFortXTrans.g:2195:1: ( '.' )
            // InternalFortXTrans.g:2196:2: '.'
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
    // InternalFortXTrans.g:2205:1: rule__ImportedNames__Group_0__2 : rule__ImportedNames__Group_0__2__Impl rule__ImportedNames__Group_0__3 ;
    public final void rule__ImportedNames__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2209:1: ( rule__ImportedNames__Group_0__2__Impl rule__ImportedNames__Group_0__3 )
            // InternalFortXTrans.g:2210:2: rule__ImportedNames__Group_0__2__Impl rule__ImportedNames__Group_0__3
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
    // InternalFortXTrans.g:2217:1: rule__ImportedNames__Group_0__2__Impl : ( '{' ) ;
    public final void rule__ImportedNames__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2221:1: ( ( '{' ) )
            // InternalFortXTrans.g:2222:1: ( '{' )
            {
            // InternalFortXTrans.g:2222:1: ( '{' )
            // InternalFortXTrans.g:2223:2: '{'
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
    // InternalFortXTrans.g:2232:1: rule__ImportedNames__Group_0__3 : rule__ImportedNames__Group_0__3__Impl rule__ImportedNames__Group_0__4 ;
    public final void rule__ImportedNames__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2236:1: ( rule__ImportedNames__Group_0__3__Impl rule__ImportedNames__Group_0__4 )
            // InternalFortXTrans.g:2237:2: rule__ImportedNames__Group_0__3__Impl rule__ImportedNames__Group_0__4
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
    // InternalFortXTrans.g:2244:1: rule__ImportedNames__Group_0__3__Impl : ( RULE_DOTS ) ;
    public final void rule__ImportedNames__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2248:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:2249:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:2249:1: ( RULE_DOTS )
            // InternalFortXTrans.g:2250:2: RULE_DOTS
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
    // InternalFortXTrans.g:2259:1: rule__ImportedNames__Group_0__4 : rule__ImportedNames__Group_0__4__Impl rule__ImportedNames__Group_0__5 ;
    public final void rule__ImportedNames__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2263:1: ( rule__ImportedNames__Group_0__4__Impl rule__ImportedNames__Group_0__5 )
            // InternalFortXTrans.g:2264:2: rule__ImportedNames__Group_0__4__Impl rule__ImportedNames__Group_0__5
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
    // InternalFortXTrans.g:2271:1: rule__ImportedNames__Group_0__4__Impl : ( '}' ) ;
    public final void rule__ImportedNames__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2275:1: ( ( '}' ) )
            // InternalFortXTrans.g:2276:1: ( '}' )
            {
            // InternalFortXTrans.g:2276:1: ( '}' )
            // InternalFortXTrans.g:2277:2: '}'
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
    // InternalFortXTrans.g:2286:1: rule__ImportedNames__Group_0__5 : rule__ImportedNames__Group_0__5__Impl ;
    public final void rule__ImportedNames__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2290:1: ( rule__ImportedNames__Group_0__5__Impl )
            // InternalFortXTrans.g:2291:2: rule__ImportedNames__Group_0__5__Impl
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
    // InternalFortXTrans.g:2297:1: rule__ImportedNames__Group_0__5__Impl : ( ( rule__ImportedNames__Group_0_5__0 )? ) ;
    public final void rule__ImportedNames__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2301:1: ( ( ( rule__ImportedNames__Group_0_5__0 )? ) )
            // InternalFortXTrans.g:2302:1: ( ( rule__ImportedNames__Group_0_5__0 )? )
            {
            // InternalFortXTrans.g:2302:1: ( ( rule__ImportedNames__Group_0_5__0 )? )
            // InternalFortXTrans.g:2303:2: ( rule__ImportedNames__Group_0_5__0 )?
            {
             before(grammarAccess.getImportedNamesAccess().getGroup_0_5()); 
            // InternalFortXTrans.g:2304:2: ( rule__ImportedNames__Group_0_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalFortXTrans.g:2304:3: rule__ImportedNames__Group_0_5__0
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
    // InternalFortXTrans.g:2313:1: rule__ImportedNames__Group_0_5__0 : rule__ImportedNames__Group_0_5__0__Impl rule__ImportedNames__Group_0_5__1 ;
    public final void rule__ImportedNames__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2317:1: ( rule__ImportedNames__Group_0_5__0__Impl rule__ImportedNames__Group_0_5__1 )
            // InternalFortXTrans.g:2318:2: rule__ImportedNames__Group_0_5__0__Impl rule__ImportedNames__Group_0_5__1
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
    // InternalFortXTrans.g:2325:1: rule__ImportedNames__Group_0_5__0__Impl : ( ( rule__ImportedNames__ExceptAssignment_0_5_0 ) ) ;
    public final void rule__ImportedNames__Group_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2329:1: ( ( ( rule__ImportedNames__ExceptAssignment_0_5_0 ) ) )
            // InternalFortXTrans.g:2330:1: ( ( rule__ImportedNames__ExceptAssignment_0_5_0 ) )
            {
            // InternalFortXTrans.g:2330:1: ( ( rule__ImportedNames__ExceptAssignment_0_5_0 ) )
            // InternalFortXTrans.g:2331:2: ( rule__ImportedNames__ExceptAssignment_0_5_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getExceptAssignment_0_5_0()); 
            // InternalFortXTrans.g:2332:2: ( rule__ImportedNames__ExceptAssignment_0_5_0 )
            // InternalFortXTrans.g:2332:3: rule__ImportedNames__ExceptAssignment_0_5_0
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
    // InternalFortXTrans.g:2340:1: rule__ImportedNames__Group_0_5__1 : rule__ImportedNames__Group_0_5__1__Impl ;
    public final void rule__ImportedNames__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2344:1: ( rule__ImportedNames__Group_0_5__1__Impl )
            // InternalFortXTrans.g:2345:2: rule__ImportedNames__Group_0_5__1__Impl
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
    // InternalFortXTrans.g:2351:1: rule__ImportedNames__Group_0_5__1__Impl : ( ( rule__ImportedNames__SimpAssignment_0_5_1 ) ) ;
    public final void rule__ImportedNames__Group_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2355:1: ( ( ( rule__ImportedNames__SimpAssignment_0_5_1 ) ) )
            // InternalFortXTrans.g:2356:1: ( ( rule__ImportedNames__SimpAssignment_0_5_1 ) )
            {
            // InternalFortXTrans.g:2356:1: ( ( rule__ImportedNames__SimpAssignment_0_5_1 ) )
            // InternalFortXTrans.g:2357:2: ( rule__ImportedNames__SimpAssignment_0_5_1 )
            {
             before(grammarAccess.getImportedNamesAccess().getSimpAssignment_0_5_1()); 
            // InternalFortXTrans.g:2358:2: ( rule__ImportedNames__SimpAssignment_0_5_1 )
            // InternalFortXTrans.g:2358:3: rule__ImportedNames__SimpAssignment_0_5_1
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
    // InternalFortXTrans.g:2367:1: rule__ImportedNames__Group_1__0 : rule__ImportedNames__Group_1__0__Impl rule__ImportedNames__Group_1__1 ;
    public final void rule__ImportedNames__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2371:1: ( rule__ImportedNames__Group_1__0__Impl rule__ImportedNames__Group_1__1 )
            // InternalFortXTrans.g:2372:2: rule__ImportedNames__Group_1__0__Impl rule__ImportedNames__Group_1__1
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
    // InternalFortXTrans.g:2379:1: rule__ImportedNames__Group_1__0__Impl : ( ( rule__ImportedNames__ImpnameAssignment_1_0 ) ) ;
    public final void rule__ImportedNames__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2383:1: ( ( ( rule__ImportedNames__ImpnameAssignment_1_0 ) ) )
            // InternalFortXTrans.g:2384:1: ( ( rule__ImportedNames__ImpnameAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:2384:1: ( ( rule__ImportedNames__ImpnameAssignment_1_0 ) )
            // InternalFortXTrans.g:2385:2: ( rule__ImportedNames__ImpnameAssignment_1_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getImpnameAssignment_1_0()); 
            // InternalFortXTrans.g:2386:2: ( rule__ImportedNames__ImpnameAssignment_1_0 )
            // InternalFortXTrans.g:2386:3: rule__ImportedNames__ImpnameAssignment_1_0
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
    // InternalFortXTrans.g:2394:1: rule__ImportedNames__Group_1__1 : rule__ImportedNames__Group_1__1__Impl rule__ImportedNames__Group_1__2 ;
    public final void rule__ImportedNames__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2398:1: ( rule__ImportedNames__Group_1__1__Impl rule__ImportedNames__Group_1__2 )
            // InternalFortXTrans.g:2399:2: rule__ImportedNames__Group_1__1__Impl rule__ImportedNames__Group_1__2
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
    // InternalFortXTrans.g:2406:1: rule__ImportedNames__Group_1__1__Impl : ( '.' ) ;
    public final void rule__ImportedNames__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2410:1: ( ( '.' ) )
            // InternalFortXTrans.g:2411:1: ( '.' )
            {
            // InternalFortXTrans.g:2411:1: ( '.' )
            // InternalFortXTrans.g:2412:2: '.'
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
    // InternalFortXTrans.g:2421:1: rule__ImportedNames__Group_1__2 : rule__ImportedNames__Group_1__2__Impl rule__ImportedNames__Group_1__3 ;
    public final void rule__ImportedNames__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2425:1: ( rule__ImportedNames__Group_1__2__Impl rule__ImportedNames__Group_1__3 )
            // InternalFortXTrans.g:2426:2: rule__ImportedNames__Group_1__2__Impl rule__ImportedNames__Group_1__3
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
    // InternalFortXTrans.g:2433:1: rule__ImportedNames__Group_1__2__Impl : ( '{' ) ;
    public final void rule__ImportedNames__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2437:1: ( ( '{' ) )
            // InternalFortXTrans.g:2438:1: ( '{' )
            {
            // InternalFortXTrans.g:2438:1: ( '{' )
            // InternalFortXTrans.g:2439:2: '{'
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
    // InternalFortXTrans.g:2448:1: rule__ImportedNames__Group_1__3 : rule__ImportedNames__Group_1__3__Impl rule__ImportedNames__Group_1__4 ;
    public final void rule__ImportedNames__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2452:1: ( rule__ImportedNames__Group_1__3__Impl rule__ImportedNames__Group_1__4 )
            // InternalFortXTrans.g:2453:2: rule__ImportedNames__Group_1__3__Impl rule__ImportedNames__Group_1__4
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
    // InternalFortXTrans.g:2460:1: rule__ImportedNames__Group_1__3__Impl : ( ( rule__ImportedNames__SimpListAssignment_1_3 ) ) ;
    public final void rule__ImportedNames__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2464:1: ( ( ( rule__ImportedNames__SimpListAssignment_1_3 ) ) )
            // InternalFortXTrans.g:2465:1: ( ( rule__ImportedNames__SimpListAssignment_1_3 ) )
            {
            // InternalFortXTrans.g:2465:1: ( ( rule__ImportedNames__SimpListAssignment_1_3 ) )
            // InternalFortXTrans.g:2466:2: ( rule__ImportedNames__SimpListAssignment_1_3 )
            {
             before(grammarAccess.getImportedNamesAccess().getSimpListAssignment_1_3()); 
            // InternalFortXTrans.g:2467:2: ( rule__ImportedNames__SimpListAssignment_1_3 )
            // InternalFortXTrans.g:2467:3: rule__ImportedNames__SimpListAssignment_1_3
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
    // InternalFortXTrans.g:2475:1: rule__ImportedNames__Group_1__4 : rule__ImportedNames__Group_1__4__Impl rule__ImportedNames__Group_1__5 ;
    public final void rule__ImportedNames__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2479:1: ( rule__ImportedNames__Group_1__4__Impl rule__ImportedNames__Group_1__5 )
            // InternalFortXTrans.g:2480:2: rule__ImportedNames__Group_1__4__Impl rule__ImportedNames__Group_1__5
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
    // InternalFortXTrans.g:2487:1: rule__ImportedNames__Group_1__4__Impl : ( ( rule__ImportedNames__Group_1_4__0 )* ) ;
    public final void rule__ImportedNames__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2491:1: ( ( ( rule__ImportedNames__Group_1_4__0 )* ) )
            // InternalFortXTrans.g:2492:1: ( ( rule__ImportedNames__Group_1_4__0 )* )
            {
            // InternalFortXTrans.g:2492:1: ( ( rule__ImportedNames__Group_1_4__0 )* )
            // InternalFortXTrans.g:2493:2: ( rule__ImportedNames__Group_1_4__0 )*
            {
             before(grammarAccess.getImportedNamesAccess().getGroup_1_4()); 
            // InternalFortXTrans.g:2494:2: ( rule__ImportedNames__Group_1_4__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==24) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==RULE_ID) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalFortXTrans.g:2494:3: rule__ImportedNames__Group_1_4__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ImportedNames__Group_1_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalFortXTrans.g:2502:1: rule__ImportedNames__Group_1__5 : rule__ImportedNames__Group_1__5__Impl rule__ImportedNames__Group_1__6 ;
    public final void rule__ImportedNames__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2506:1: ( rule__ImportedNames__Group_1__5__Impl rule__ImportedNames__Group_1__6 )
            // InternalFortXTrans.g:2507:2: rule__ImportedNames__Group_1__5__Impl rule__ImportedNames__Group_1__6
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
    // InternalFortXTrans.g:2514:1: rule__ImportedNames__Group_1__5__Impl : ( ( rule__ImportedNames__Group_1_5__0 )? ) ;
    public final void rule__ImportedNames__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2518:1: ( ( ( rule__ImportedNames__Group_1_5__0 )? ) )
            // InternalFortXTrans.g:2519:1: ( ( rule__ImportedNames__Group_1_5__0 )? )
            {
            // InternalFortXTrans.g:2519:1: ( ( rule__ImportedNames__Group_1_5__0 )? )
            // InternalFortXTrans.g:2520:2: ( rule__ImportedNames__Group_1_5__0 )?
            {
             before(grammarAccess.getImportedNamesAccess().getGroup_1_5()); 
            // InternalFortXTrans.g:2521:2: ( rule__ImportedNames__Group_1_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==24) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalFortXTrans.g:2521:3: rule__ImportedNames__Group_1_5__0
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
    // InternalFortXTrans.g:2529:1: rule__ImportedNames__Group_1__6 : rule__ImportedNames__Group_1__6__Impl ;
    public final void rule__ImportedNames__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2533:1: ( rule__ImportedNames__Group_1__6__Impl )
            // InternalFortXTrans.g:2534:2: rule__ImportedNames__Group_1__6__Impl
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
    // InternalFortXTrans.g:2540:1: rule__ImportedNames__Group_1__6__Impl : ( '}' ) ;
    public final void rule__ImportedNames__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2544:1: ( ( '}' ) )
            // InternalFortXTrans.g:2545:1: ( '}' )
            {
            // InternalFortXTrans.g:2545:1: ( '}' )
            // InternalFortXTrans.g:2546:2: '}'
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
    // InternalFortXTrans.g:2556:1: rule__ImportedNames__Group_1_4__0 : rule__ImportedNames__Group_1_4__0__Impl rule__ImportedNames__Group_1_4__1 ;
    public final void rule__ImportedNames__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2560:1: ( rule__ImportedNames__Group_1_4__0__Impl rule__ImportedNames__Group_1_4__1 )
            // InternalFortXTrans.g:2561:2: rule__ImportedNames__Group_1_4__0__Impl rule__ImportedNames__Group_1_4__1
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
    // InternalFortXTrans.g:2568:1: rule__ImportedNames__Group_1_4__0__Impl : ( ',' ) ;
    public final void rule__ImportedNames__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2572:1: ( ( ',' ) )
            // InternalFortXTrans.g:2573:1: ( ',' )
            {
            // InternalFortXTrans.g:2573:1: ( ',' )
            // InternalFortXTrans.g:2574:2: ','
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
    // InternalFortXTrans.g:2583:1: rule__ImportedNames__Group_1_4__1 : rule__ImportedNames__Group_1_4__1__Impl ;
    public final void rule__ImportedNames__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2587:1: ( rule__ImportedNames__Group_1_4__1__Impl )
            // InternalFortXTrans.g:2588:2: rule__ImportedNames__Group_1_4__1__Impl
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
    // InternalFortXTrans.g:2594:1: rule__ImportedNames__Group_1_4__1__Impl : ( ( rule__ImportedNames__SimpListAssignment_1_4_1 ) ) ;
    public final void rule__ImportedNames__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2598:1: ( ( ( rule__ImportedNames__SimpListAssignment_1_4_1 ) ) )
            // InternalFortXTrans.g:2599:1: ( ( rule__ImportedNames__SimpListAssignment_1_4_1 ) )
            {
            // InternalFortXTrans.g:2599:1: ( ( rule__ImportedNames__SimpListAssignment_1_4_1 ) )
            // InternalFortXTrans.g:2600:2: ( rule__ImportedNames__SimpListAssignment_1_4_1 )
            {
             before(grammarAccess.getImportedNamesAccess().getSimpListAssignment_1_4_1()); 
            // InternalFortXTrans.g:2601:2: ( rule__ImportedNames__SimpListAssignment_1_4_1 )
            // InternalFortXTrans.g:2601:3: rule__ImportedNames__SimpListAssignment_1_4_1
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
    // InternalFortXTrans.g:2610:1: rule__ImportedNames__Group_1_5__0 : rule__ImportedNames__Group_1_5__0__Impl rule__ImportedNames__Group_1_5__1 ;
    public final void rule__ImportedNames__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2614:1: ( rule__ImportedNames__Group_1_5__0__Impl rule__ImportedNames__Group_1_5__1 )
            // InternalFortXTrans.g:2615:2: rule__ImportedNames__Group_1_5__0__Impl rule__ImportedNames__Group_1_5__1
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
    // InternalFortXTrans.g:2622:1: rule__ImportedNames__Group_1_5__0__Impl : ( ( rule__ImportedNames__CommaAssignment_1_5_0 ) ) ;
    public final void rule__ImportedNames__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2626:1: ( ( ( rule__ImportedNames__CommaAssignment_1_5_0 ) ) )
            // InternalFortXTrans.g:2627:1: ( ( rule__ImportedNames__CommaAssignment_1_5_0 ) )
            {
            // InternalFortXTrans.g:2627:1: ( ( rule__ImportedNames__CommaAssignment_1_5_0 ) )
            // InternalFortXTrans.g:2628:2: ( rule__ImportedNames__CommaAssignment_1_5_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getCommaAssignment_1_5_0()); 
            // InternalFortXTrans.g:2629:2: ( rule__ImportedNames__CommaAssignment_1_5_0 )
            // InternalFortXTrans.g:2629:3: rule__ImportedNames__CommaAssignment_1_5_0
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
    // InternalFortXTrans.g:2637:1: rule__ImportedNames__Group_1_5__1 : rule__ImportedNames__Group_1_5__1__Impl ;
    public final void rule__ImportedNames__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2641:1: ( rule__ImportedNames__Group_1_5__1__Impl )
            // InternalFortXTrans.g:2642:2: rule__ImportedNames__Group_1_5__1__Impl
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
    // InternalFortXTrans.g:2648:1: rule__ImportedNames__Group_1_5__1__Impl : ( ( rule__ImportedNames__DotsAssignment_1_5_1 ) ) ;
    public final void rule__ImportedNames__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2652:1: ( ( ( rule__ImportedNames__DotsAssignment_1_5_1 ) ) )
            // InternalFortXTrans.g:2653:1: ( ( rule__ImportedNames__DotsAssignment_1_5_1 ) )
            {
            // InternalFortXTrans.g:2653:1: ( ( rule__ImportedNames__DotsAssignment_1_5_1 ) )
            // InternalFortXTrans.g:2654:2: ( rule__ImportedNames__DotsAssignment_1_5_1 )
            {
             before(grammarAccess.getImportedNamesAccess().getDotsAssignment_1_5_1()); 
            // InternalFortXTrans.g:2655:2: ( rule__ImportedNames__DotsAssignment_1_5_1 )
            // InternalFortXTrans.g:2655:3: rule__ImportedNames__DotsAssignment_1_5_1
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
    // InternalFortXTrans.g:2664:1: rule__ImportedNames__Group_2__0 : rule__ImportedNames__Group_2__0__Impl rule__ImportedNames__Group_2__1 ;
    public final void rule__ImportedNames__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2668:1: ( rule__ImportedNames__Group_2__0__Impl rule__ImportedNames__Group_2__1 )
            // InternalFortXTrans.g:2669:2: rule__ImportedNames__Group_2__0__Impl rule__ImportedNames__Group_2__1
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
    // InternalFortXTrans.g:2676:1: rule__ImportedNames__Group_2__0__Impl : ( ( rule__ImportedNames__ImpnameAssignment_2_0 ) ) ;
    public final void rule__ImportedNames__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2680:1: ( ( ( rule__ImportedNames__ImpnameAssignment_2_0 ) ) )
            // InternalFortXTrans.g:2681:1: ( ( rule__ImportedNames__ImpnameAssignment_2_0 ) )
            {
            // InternalFortXTrans.g:2681:1: ( ( rule__ImportedNames__ImpnameAssignment_2_0 ) )
            // InternalFortXTrans.g:2682:2: ( rule__ImportedNames__ImpnameAssignment_2_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getImpnameAssignment_2_0()); 
            // InternalFortXTrans.g:2683:2: ( rule__ImportedNames__ImpnameAssignment_2_0 )
            // InternalFortXTrans.g:2683:3: rule__ImportedNames__ImpnameAssignment_2_0
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
    // InternalFortXTrans.g:2691:1: rule__ImportedNames__Group_2__1 : rule__ImportedNames__Group_2__1__Impl ;
    public final void rule__ImportedNames__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2695:1: ( rule__ImportedNames__Group_2__1__Impl )
            // InternalFortXTrans.g:2696:2: rule__ImportedNames__Group_2__1__Impl
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
    // InternalFortXTrans.g:2702:1: rule__ImportedNames__Group_2__1__Impl : ( ( rule__ImportedNames__Group_2_1__0 )? ) ;
    public final void rule__ImportedNames__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2706:1: ( ( ( rule__ImportedNames__Group_2_1__0 )? ) )
            // InternalFortXTrans.g:2707:1: ( ( rule__ImportedNames__Group_2_1__0 )? )
            {
            // InternalFortXTrans.g:2707:1: ( ( rule__ImportedNames__Group_2_1__0 )? )
            // InternalFortXTrans.g:2708:2: ( rule__ImportedNames__Group_2_1__0 )?
            {
             before(grammarAccess.getImportedNamesAccess().getGroup_2_1()); 
            // InternalFortXTrans.g:2709:2: ( rule__ImportedNames__Group_2_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalFortXTrans.g:2709:3: rule__ImportedNames__Group_2_1__0
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
    // InternalFortXTrans.g:2718:1: rule__ImportedNames__Group_2_1__0 : rule__ImportedNames__Group_2_1__0__Impl rule__ImportedNames__Group_2_1__1 ;
    public final void rule__ImportedNames__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2722:1: ( rule__ImportedNames__Group_2_1__0__Impl rule__ImportedNames__Group_2_1__1 )
            // InternalFortXTrans.g:2723:2: rule__ImportedNames__Group_2_1__0__Impl rule__ImportedNames__Group_2_1__1
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
    // InternalFortXTrans.g:2730:1: rule__ImportedNames__Group_2_1__0__Impl : ( 'as' ) ;
    public final void rule__ImportedNames__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2734:1: ( ( 'as' ) )
            // InternalFortXTrans.g:2735:1: ( 'as' )
            {
            // InternalFortXTrans.g:2735:1: ( 'as' )
            // InternalFortXTrans.g:2736:2: 'as'
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
    // InternalFortXTrans.g:2745:1: rule__ImportedNames__Group_2_1__1 : rule__ImportedNames__Group_2_1__1__Impl ;
    public final void rule__ImportedNames__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2749:1: ( rule__ImportedNames__Group_2_1__1__Impl )
            // InternalFortXTrans.g:2750:2: rule__ImportedNames__Group_2_1__1__Impl
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
    // InternalFortXTrans.g:2756:1: rule__ImportedNames__Group_2_1__1__Impl : ( ( rule__ImportedNames__AsnameAssignment_2_1_1 ) ) ;
    public final void rule__ImportedNames__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2760:1: ( ( ( rule__ImportedNames__AsnameAssignment_2_1_1 ) ) )
            // InternalFortXTrans.g:2761:1: ( ( rule__ImportedNames__AsnameAssignment_2_1_1 ) )
            {
            // InternalFortXTrans.g:2761:1: ( ( rule__ImportedNames__AsnameAssignment_2_1_1 ) )
            // InternalFortXTrans.g:2762:2: ( rule__ImportedNames__AsnameAssignment_2_1_1 )
            {
             before(grammarAccess.getImportedNamesAccess().getAsnameAssignment_2_1_1()); 
            // InternalFortXTrans.g:2763:2: ( rule__ImportedNames__AsnameAssignment_2_1_1 )
            // InternalFortXTrans.g:2763:3: rule__ImportedNames__AsnameAssignment_2_1_1
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
    // InternalFortXTrans.g:2772:1: rule__QualifiedName__Group_0__0 : rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1 ;
    public final void rule__QualifiedName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2776:1: ( rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1 )
            // InternalFortXTrans.g:2777:2: rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1
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
    // InternalFortXTrans.g:2784:1: rule__QualifiedName__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2788:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:2789:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:2789:1: ( RULE_ID )
            // InternalFortXTrans.g:2790:2: RULE_ID
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
    // InternalFortXTrans.g:2799:1: rule__QualifiedName__Group_0__1 : rule__QualifiedName__Group_0__1__Impl ;
    public final void rule__QualifiedName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2803:1: ( rule__QualifiedName__Group_0__1__Impl )
            // InternalFortXTrans.g:2804:2: rule__QualifiedName__Group_0__1__Impl
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
    // InternalFortXTrans.g:2810:1: rule__QualifiedName__Group_0__1__Impl : ( RULE_DOTS ) ;
    public final void rule__QualifiedName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2814:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:2815:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:2815:1: ( RULE_DOTS )
            // InternalFortXTrans.g:2816:2: RULE_DOTS
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
    // InternalFortXTrans.g:2826:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2830:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalFortXTrans.g:2831:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalFortXTrans.g:2838:1: rule__QualifiedName__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2842:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:2843:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:2843:1: ( RULE_ID )
            // InternalFortXTrans.g:2844:2: RULE_ID
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
    // InternalFortXTrans.g:2853:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl rule__QualifiedName__Group_1__2 ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2857:1: ( rule__QualifiedName__Group_1__1__Impl rule__QualifiedName__Group_1__2 )
            // InternalFortXTrans.g:2858:2: rule__QualifiedName__Group_1__1__Impl rule__QualifiedName__Group_1__2
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
    // InternalFortXTrans.g:2865:1: rule__QualifiedName__Group_1__1__Impl : ( ( rule__QualifiedName__Group_1_1__0 )* ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2869:1: ( ( ( rule__QualifiedName__Group_1_1__0 )* ) )
            // InternalFortXTrans.g:2870:1: ( ( rule__QualifiedName__Group_1_1__0 )* )
            {
            // InternalFortXTrans.g:2870:1: ( ( rule__QualifiedName__Group_1_1__0 )* )
            // InternalFortXTrans.g:2871:2: ( rule__QualifiedName__Group_1_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1_1()); 
            // InternalFortXTrans.g:2872:2: ( rule__QualifiedName__Group_1_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==25) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalFortXTrans.g:2872:3: rule__QualifiedName__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__QualifiedName__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalFortXTrans.g:2880:1: rule__QualifiedName__Group_1__2 : rule__QualifiedName__Group_1__2__Impl ;
    public final void rule__QualifiedName__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2884:1: ( rule__QualifiedName__Group_1__2__Impl )
            // InternalFortXTrans.g:2885:2: rule__QualifiedName__Group_1__2__Impl
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
    // InternalFortXTrans.g:2891:1: rule__QualifiedName__Group_1__2__Impl : ( RULE_DOTS ) ;
    public final void rule__QualifiedName__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2895:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:2896:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:2896:1: ( RULE_DOTS )
            // InternalFortXTrans.g:2897:2: RULE_DOTS
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
    // InternalFortXTrans.g:2907:1: rule__QualifiedName__Group_1_1__0 : rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1 ;
    public final void rule__QualifiedName__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2911:1: ( rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1 )
            // InternalFortXTrans.g:2912:2: rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1
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
    // InternalFortXTrans.g:2919:1: rule__QualifiedName__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2923:1: ( ( '.' ) )
            // InternalFortXTrans.g:2924:1: ( '.' )
            {
            // InternalFortXTrans.g:2924:1: ( '.' )
            // InternalFortXTrans.g:2925:2: '.'
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
    // InternalFortXTrans.g:2934:1: rule__QualifiedName__Group_1_1__1 : rule__QualifiedName__Group_1_1__1__Impl ;
    public final void rule__QualifiedName__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2938:1: ( rule__QualifiedName__Group_1_1__1__Impl )
            // InternalFortXTrans.g:2939:2: rule__QualifiedName__Group_1_1__1__Impl
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
    // InternalFortXTrans.g:2945:1: rule__QualifiedName__Group_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2949:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:2950:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:2950:1: ( RULE_ID )
            // InternalFortXTrans.g:2951:2: RULE_ID
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
    // InternalFortXTrans.g:2961:1: rule__QualifiedName__Group_2__0 : rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1 ;
    public final void rule__QualifiedName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2965:1: ( rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1 )
            // InternalFortXTrans.g:2966:2: rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1
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
    // InternalFortXTrans.g:2973:1: rule__QualifiedName__Group_2__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2977:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:2978:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:2978:1: ( RULE_ID )
            // InternalFortXTrans.g:2979:2: RULE_ID
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
    // InternalFortXTrans.g:2988:1: rule__QualifiedName__Group_2__1 : rule__QualifiedName__Group_2__1__Impl ;
    public final void rule__QualifiedName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2992:1: ( rule__QualifiedName__Group_2__1__Impl )
            // InternalFortXTrans.g:2993:2: rule__QualifiedName__Group_2__1__Impl
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
    // InternalFortXTrans.g:2999:1: rule__QualifiedName__Group_2__1__Impl : ( ( rule__QualifiedName__Group_2_1__0 )* ) ;
    public final void rule__QualifiedName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3003:1: ( ( ( rule__QualifiedName__Group_2_1__0 )* ) )
            // InternalFortXTrans.g:3004:1: ( ( rule__QualifiedName__Group_2_1__0 )* )
            {
            // InternalFortXTrans.g:3004:1: ( ( rule__QualifiedName__Group_2_1__0 )* )
            // InternalFortXTrans.g:3005:2: ( rule__QualifiedName__Group_2_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_2_1()); 
            // InternalFortXTrans.g:3006:2: ( rule__QualifiedName__Group_2_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==25) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalFortXTrans.g:3006:3: rule__QualifiedName__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__QualifiedName__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalFortXTrans.g:3015:1: rule__QualifiedName__Group_2_1__0 : rule__QualifiedName__Group_2_1__0__Impl rule__QualifiedName__Group_2_1__1 ;
    public final void rule__QualifiedName__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3019:1: ( rule__QualifiedName__Group_2_1__0__Impl rule__QualifiedName__Group_2_1__1 )
            // InternalFortXTrans.g:3020:2: rule__QualifiedName__Group_2_1__0__Impl rule__QualifiedName__Group_2_1__1
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
    // InternalFortXTrans.g:3027:1: rule__QualifiedName__Group_2_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3031:1: ( ( '.' ) )
            // InternalFortXTrans.g:3032:1: ( '.' )
            {
            // InternalFortXTrans.g:3032:1: ( '.' )
            // InternalFortXTrans.g:3033:2: '.'
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
    // InternalFortXTrans.g:3042:1: rule__QualifiedName__Group_2_1__1 : rule__QualifiedName__Group_2_1__1__Impl ;
    public final void rule__QualifiedName__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3046:1: ( rule__QualifiedName__Group_2_1__1__Impl )
            // InternalFortXTrans.g:3047:2: rule__QualifiedName__Group_2_1__1__Impl
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
    // InternalFortXTrans.g:3053:1: rule__QualifiedName__Group_2_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3057:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3058:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3058:1: ( RULE_ID )
            // InternalFortXTrans.g:3059:2: RULE_ID
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
    // InternalFortXTrans.g:3069:1: rule__APIName__Group_0__0 : rule__APIName__Group_0__0__Impl rule__APIName__Group_0__1 ;
    public final void rule__APIName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3073:1: ( rule__APIName__Group_0__0__Impl rule__APIName__Group_0__1 )
            // InternalFortXTrans.g:3074:2: rule__APIName__Group_0__0__Impl rule__APIName__Group_0__1
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
    // InternalFortXTrans.g:3081:1: rule__APIName__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3085:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3086:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3086:1: ( RULE_ID )
            // InternalFortXTrans.g:3087:2: RULE_ID
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
    // InternalFortXTrans.g:3096:1: rule__APIName__Group_0__1 : rule__APIName__Group_0__1__Impl ;
    public final void rule__APIName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3100:1: ( rule__APIName__Group_0__1__Impl )
            // InternalFortXTrans.g:3101:2: rule__APIName__Group_0__1__Impl
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
    // InternalFortXTrans.g:3107:1: rule__APIName__Group_0__1__Impl : ( RULE_DOTS ) ;
    public final void rule__APIName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3111:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:3112:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:3112:1: ( RULE_DOTS )
            // InternalFortXTrans.g:3113:2: RULE_DOTS
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
    // InternalFortXTrans.g:3123:1: rule__APIName__Group_1__0 : rule__APIName__Group_1__0__Impl rule__APIName__Group_1__1 ;
    public final void rule__APIName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3127:1: ( rule__APIName__Group_1__0__Impl rule__APIName__Group_1__1 )
            // InternalFortXTrans.g:3128:2: rule__APIName__Group_1__0__Impl rule__APIName__Group_1__1
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
    // InternalFortXTrans.g:3135:1: rule__APIName__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3139:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3140:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3140:1: ( RULE_ID )
            // InternalFortXTrans.g:3141:2: RULE_ID
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
    // InternalFortXTrans.g:3150:1: rule__APIName__Group_1__1 : rule__APIName__Group_1__1__Impl rule__APIName__Group_1__2 ;
    public final void rule__APIName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3154:1: ( rule__APIName__Group_1__1__Impl rule__APIName__Group_1__2 )
            // InternalFortXTrans.g:3155:2: rule__APIName__Group_1__1__Impl rule__APIName__Group_1__2
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
    // InternalFortXTrans.g:3162:1: rule__APIName__Group_1__1__Impl : ( ( rule__APIName__Group_1_1__0 )* ) ;
    public final void rule__APIName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3166:1: ( ( ( rule__APIName__Group_1_1__0 )* ) )
            // InternalFortXTrans.g:3167:1: ( ( rule__APIName__Group_1_1__0 )* )
            {
            // InternalFortXTrans.g:3167:1: ( ( rule__APIName__Group_1_1__0 )* )
            // InternalFortXTrans.g:3168:2: ( rule__APIName__Group_1_1__0 )*
            {
             before(grammarAccess.getAPINameAccess().getGroup_1_1()); 
            // InternalFortXTrans.g:3169:2: ( rule__APIName__Group_1_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==25) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalFortXTrans.g:3169:3: rule__APIName__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__APIName__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalFortXTrans.g:3177:1: rule__APIName__Group_1__2 : rule__APIName__Group_1__2__Impl ;
    public final void rule__APIName__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3181:1: ( rule__APIName__Group_1__2__Impl )
            // InternalFortXTrans.g:3182:2: rule__APIName__Group_1__2__Impl
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
    // InternalFortXTrans.g:3188:1: rule__APIName__Group_1__2__Impl : ( RULE_DOTS ) ;
    public final void rule__APIName__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3192:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:3193:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:3193:1: ( RULE_DOTS )
            // InternalFortXTrans.g:3194:2: RULE_DOTS
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
    // InternalFortXTrans.g:3204:1: rule__APIName__Group_1_1__0 : rule__APIName__Group_1_1__0__Impl rule__APIName__Group_1_1__1 ;
    public final void rule__APIName__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3208:1: ( rule__APIName__Group_1_1__0__Impl rule__APIName__Group_1_1__1 )
            // InternalFortXTrans.g:3209:2: rule__APIName__Group_1_1__0__Impl rule__APIName__Group_1_1__1
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
    // InternalFortXTrans.g:3216:1: rule__APIName__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__APIName__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3220:1: ( ( '.' ) )
            // InternalFortXTrans.g:3221:1: ( '.' )
            {
            // InternalFortXTrans.g:3221:1: ( '.' )
            // InternalFortXTrans.g:3222:2: '.'
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
    // InternalFortXTrans.g:3231:1: rule__APIName__Group_1_1__1 : rule__APIName__Group_1_1__1__Impl ;
    public final void rule__APIName__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3235:1: ( rule__APIName__Group_1_1__1__Impl )
            // InternalFortXTrans.g:3236:2: rule__APIName__Group_1_1__1__Impl
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
    // InternalFortXTrans.g:3242:1: rule__APIName__Group_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3246:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3247:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3247:1: ( RULE_ID )
            // InternalFortXTrans.g:3248:2: RULE_ID
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
    // InternalFortXTrans.g:3258:1: rule__APIName__Group_2__0 : rule__APIName__Group_2__0__Impl rule__APIName__Group_2__1 ;
    public final void rule__APIName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3262:1: ( rule__APIName__Group_2__0__Impl rule__APIName__Group_2__1 )
            // InternalFortXTrans.g:3263:2: rule__APIName__Group_2__0__Impl rule__APIName__Group_2__1
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
    // InternalFortXTrans.g:3270:1: rule__APIName__Group_2__0__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3274:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3275:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3275:1: ( RULE_ID )
            // InternalFortXTrans.g:3276:2: RULE_ID
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
    // InternalFortXTrans.g:3285:1: rule__APIName__Group_2__1 : rule__APIName__Group_2__1__Impl ;
    public final void rule__APIName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3289:1: ( rule__APIName__Group_2__1__Impl )
            // InternalFortXTrans.g:3290:2: rule__APIName__Group_2__1__Impl
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
    // InternalFortXTrans.g:3296:1: rule__APIName__Group_2__1__Impl : ( ( rule__APIName__Group_2_1__0 )* ) ;
    public final void rule__APIName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3300:1: ( ( ( rule__APIName__Group_2_1__0 )* ) )
            // InternalFortXTrans.g:3301:1: ( ( rule__APIName__Group_2_1__0 )* )
            {
            // InternalFortXTrans.g:3301:1: ( ( rule__APIName__Group_2_1__0 )* )
            // InternalFortXTrans.g:3302:2: ( rule__APIName__Group_2_1__0 )*
            {
             before(grammarAccess.getAPINameAccess().getGroup_2_1()); 
            // InternalFortXTrans.g:3303:2: ( rule__APIName__Group_2_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==25) ) {
                    int LA32_2 = input.LA(2);

                    if ( (LA32_2==RULE_ID) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // InternalFortXTrans.g:3303:3: rule__APIName__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__APIName__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalFortXTrans.g:3312:1: rule__APIName__Group_2_1__0 : rule__APIName__Group_2_1__0__Impl rule__APIName__Group_2_1__1 ;
    public final void rule__APIName__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3316:1: ( rule__APIName__Group_2_1__0__Impl rule__APIName__Group_2_1__1 )
            // InternalFortXTrans.g:3317:2: rule__APIName__Group_2_1__0__Impl rule__APIName__Group_2_1__1
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
    // InternalFortXTrans.g:3324:1: rule__APIName__Group_2_1__0__Impl : ( '.' ) ;
    public final void rule__APIName__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3328:1: ( ( '.' ) )
            // InternalFortXTrans.g:3329:1: ( '.' )
            {
            // InternalFortXTrans.g:3329:1: ( '.' )
            // InternalFortXTrans.g:3330:2: '.'
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
    // InternalFortXTrans.g:3339:1: rule__APIName__Group_2_1__1 : rule__APIName__Group_2_1__1__Impl ;
    public final void rule__APIName__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3343:1: ( rule__APIName__Group_2_1__1__Impl )
            // InternalFortXTrans.g:3344:2: rule__APIName__Group_2_1__1__Impl
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
    // InternalFortXTrans.g:3350:1: rule__APIName__Group_2_1__1__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3354:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3355:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3355:1: ( RULE_ID )
            // InternalFortXTrans.g:3356:2: RULE_ID
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
    // InternalFortXTrans.g:3366:1: rule__SimpleNames__Group_1__0 : rule__SimpleNames__Group_1__0__Impl rule__SimpleNames__Group_1__1 ;
    public final void rule__SimpleNames__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3370:1: ( rule__SimpleNames__Group_1__0__Impl rule__SimpleNames__Group_1__1 )
            // InternalFortXTrans.g:3371:2: rule__SimpleNames__Group_1__0__Impl rule__SimpleNames__Group_1__1
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
    // InternalFortXTrans.g:3378:1: rule__SimpleNames__Group_1__0__Impl : ( ( rule__SimpleNames__BrackAssignment_1_0 ) ) ;
    public final void rule__SimpleNames__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3382:1: ( ( ( rule__SimpleNames__BrackAssignment_1_0 ) ) )
            // InternalFortXTrans.g:3383:1: ( ( rule__SimpleNames__BrackAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:3383:1: ( ( rule__SimpleNames__BrackAssignment_1_0 ) )
            // InternalFortXTrans.g:3384:2: ( rule__SimpleNames__BrackAssignment_1_0 )
            {
             before(grammarAccess.getSimpleNamesAccess().getBrackAssignment_1_0()); 
            // InternalFortXTrans.g:3385:2: ( rule__SimpleNames__BrackAssignment_1_0 )
            // InternalFortXTrans.g:3385:3: rule__SimpleNames__BrackAssignment_1_0
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
    // InternalFortXTrans.g:3393:1: rule__SimpleNames__Group_1__1 : rule__SimpleNames__Group_1__1__Impl rule__SimpleNames__Group_1__2 ;
    public final void rule__SimpleNames__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3397:1: ( rule__SimpleNames__Group_1__1__Impl rule__SimpleNames__Group_1__2 )
            // InternalFortXTrans.g:3398:2: rule__SimpleNames__Group_1__1__Impl rule__SimpleNames__Group_1__2
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
    // InternalFortXTrans.g:3405:1: rule__SimpleNames__Group_1__1__Impl : ( ( rule__SimpleNames__NameListAssignment_1_1 ) ) ;
    public final void rule__SimpleNames__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3409:1: ( ( ( rule__SimpleNames__NameListAssignment_1_1 ) ) )
            // InternalFortXTrans.g:3410:1: ( ( rule__SimpleNames__NameListAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:3410:1: ( ( rule__SimpleNames__NameListAssignment_1_1 ) )
            // InternalFortXTrans.g:3411:2: ( rule__SimpleNames__NameListAssignment_1_1 )
            {
             before(grammarAccess.getSimpleNamesAccess().getNameListAssignment_1_1()); 
            // InternalFortXTrans.g:3412:2: ( rule__SimpleNames__NameListAssignment_1_1 )
            // InternalFortXTrans.g:3412:3: rule__SimpleNames__NameListAssignment_1_1
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
    // InternalFortXTrans.g:3420:1: rule__SimpleNames__Group_1__2 : rule__SimpleNames__Group_1__2__Impl rule__SimpleNames__Group_1__3 ;
    public final void rule__SimpleNames__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3424:1: ( rule__SimpleNames__Group_1__2__Impl rule__SimpleNames__Group_1__3 )
            // InternalFortXTrans.g:3425:2: rule__SimpleNames__Group_1__2__Impl rule__SimpleNames__Group_1__3
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
    // InternalFortXTrans.g:3432:1: rule__SimpleNames__Group_1__2__Impl : ( ( rule__SimpleNames__Group_1_2__0 )* ) ;
    public final void rule__SimpleNames__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3436:1: ( ( ( rule__SimpleNames__Group_1_2__0 )* ) )
            // InternalFortXTrans.g:3437:1: ( ( rule__SimpleNames__Group_1_2__0 )* )
            {
            // InternalFortXTrans.g:3437:1: ( ( rule__SimpleNames__Group_1_2__0 )* )
            // InternalFortXTrans.g:3438:2: ( rule__SimpleNames__Group_1_2__0 )*
            {
             before(grammarAccess.getSimpleNamesAccess().getGroup_1_2()); 
            // InternalFortXTrans.g:3439:2: ( rule__SimpleNames__Group_1_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==24) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalFortXTrans.g:3439:3: rule__SimpleNames__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__SimpleNames__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalFortXTrans.g:3447:1: rule__SimpleNames__Group_1__3 : rule__SimpleNames__Group_1__3__Impl ;
    public final void rule__SimpleNames__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3451:1: ( rule__SimpleNames__Group_1__3__Impl )
            // InternalFortXTrans.g:3452:2: rule__SimpleNames__Group_1__3__Impl
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
    // InternalFortXTrans.g:3458:1: rule__SimpleNames__Group_1__3__Impl : ( '}' ) ;
    public final void rule__SimpleNames__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3462:1: ( ( '}' ) )
            // InternalFortXTrans.g:3463:1: ( '}' )
            {
            // InternalFortXTrans.g:3463:1: ( '}' )
            // InternalFortXTrans.g:3464:2: '}'
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
    // InternalFortXTrans.g:3474:1: rule__SimpleNames__Group_1_2__0 : rule__SimpleNames__Group_1_2__0__Impl rule__SimpleNames__Group_1_2__1 ;
    public final void rule__SimpleNames__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3478:1: ( rule__SimpleNames__Group_1_2__0__Impl rule__SimpleNames__Group_1_2__1 )
            // InternalFortXTrans.g:3479:2: rule__SimpleNames__Group_1_2__0__Impl rule__SimpleNames__Group_1_2__1
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
    // InternalFortXTrans.g:3486:1: rule__SimpleNames__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__SimpleNames__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3490:1: ( ( ',' ) )
            // InternalFortXTrans.g:3491:1: ( ',' )
            {
            // InternalFortXTrans.g:3491:1: ( ',' )
            // InternalFortXTrans.g:3492:2: ','
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
    // InternalFortXTrans.g:3501:1: rule__SimpleNames__Group_1_2__1 : rule__SimpleNames__Group_1_2__1__Impl ;
    public final void rule__SimpleNames__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3505:1: ( rule__SimpleNames__Group_1_2__1__Impl )
            // InternalFortXTrans.g:3506:2: rule__SimpleNames__Group_1_2__1__Impl
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
    // InternalFortXTrans.g:3512:1: rule__SimpleNames__Group_1_2__1__Impl : ( ( rule__SimpleNames__NameListAssignment_1_2_1 ) ) ;
    public final void rule__SimpleNames__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3516:1: ( ( ( rule__SimpleNames__NameListAssignment_1_2_1 ) ) )
            // InternalFortXTrans.g:3517:1: ( ( rule__SimpleNames__NameListAssignment_1_2_1 ) )
            {
            // InternalFortXTrans.g:3517:1: ( ( rule__SimpleNames__NameListAssignment_1_2_1 ) )
            // InternalFortXTrans.g:3518:2: ( rule__SimpleNames__NameListAssignment_1_2_1 )
            {
             before(grammarAccess.getSimpleNamesAccess().getNameListAssignment_1_2_1()); 
            // InternalFortXTrans.g:3519:2: ( rule__SimpleNames__NameListAssignment_1_2_1 )
            // InternalFortXTrans.g:3519:3: rule__SimpleNames__NameListAssignment_1_2_1
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
    // InternalFortXTrans.g:3528:1: rule__AliasedSimpleName__Group__0 : rule__AliasedSimpleName__Group__0__Impl rule__AliasedSimpleName__Group__1 ;
    public final void rule__AliasedSimpleName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3532:1: ( rule__AliasedSimpleName__Group__0__Impl rule__AliasedSimpleName__Group__1 )
            // InternalFortXTrans.g:3533:2: rule__AliasedSimpleName__Group__0__Impl rule__AliasedSimpleName__Group__1
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
    // InternalFortXTrans.g:3540:1: rule__AliasedSimpleName__Group__0__Impl : ( ( rule__AliasedSimpleName__OrigAssignment_0 ) ) ;
    public final void rule__AliasedSimpleName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3544:1: ( ( ( rule__AliasedSimpleName__OrigAssignment_0 ) ) )
            // InternalFortXTrans.g:3545:1: ( ( rule__AliasedSimpleName__OrigAssignment_0 ) )
            {
            // InternalFortXTrans.g:3545:1: ( ( rule__AliasedSimpleName__OrigAssignment_0 ) )
            // InternalFortXTrans.g:3546:2: ( rule__AliasedSimpleName__OrigAssignment_0 )
            {
             before(grammarAccess.getAliasedSimpleNameAccess().getOrigAssignment_0()); 
            // InternalFortXTrans.g:3547:2: ( rule__AliasedSimpleName__OrigAssignment_0 )
            // InternalFortXTrans.g:3547:3: rule__AliasedSimpleName__OrigAssignment_0
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
    // InternalFortXTrans.g:3555:1: rule__AliasedSimpleName__Group__1 : rule__AliasedSimpleName__Group__1__Impl ;
    public final void rule__AliasedSimpleName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3559:1: ( rule__AliasedSimpleName__Group__1__Impl )
            // InternalFortXTrans.g:3560:2: rule__AliasedSimpleName__Group__1__Impl
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
    // InternalFortXTrans.g:3566:1: rule__AliasedSimpleName__Group__1__Impl : ( ( rule__AliasedSimpleName__Group_1__0 )? ) ;
    public final void rule__AliasedSimpleName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3570:1: ( ( ( rule__AliasedSimpleName__Group_1__0 )? ) )
            // InternalFortXTrans.g:3571:1: ( ( rule__AliasedSimpleName__Group_1__0 )? )
            {
            // InternalFortXTrans.g:3571:1: ( ( rule__AliasedSimpleName__Group_1__0 )? )
            // InternalFortXTrans.g:3572:2: ( rule__AliasedSimpleName__Group_1__0 )?
            {
             before(grammarAccess.getAliasedSimpleNameAccess().getGroup_1()); 
            // InternalFortXTrans.g:3573:2: ( rule__AliasedSimpleName__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==27) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalFortXTrans.g:3573:3: rule__AliasedSimpleName__Group_1__0
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
    // InternalFortXTrans.g:3582:1: rule__AliasedSimpleName__Group_1__0 : rule__AliasedSimpleName__Group_1__0__Impl rule__AliasedSimpleName__Group_1__1 ;
    public final void rule__AliasedSimpleName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3586:1: ( rule__AliasedSimpleName__Group_1__0__Impl rule__AliasedSimpleName__Group_1__1 )
            // InternalFortXTrans.g:3587:2: rule__AliasedSimpleName__Group_1__0__Impl rule__AliasedSimpleName__Group_1__1
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
    // InternalFortXTrans.g:3594:1: rule__AliasedSimpleName__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__AliasedSimpleName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3598:1: ( ( 'as' ) )
            // InternalFortXTrans.g:3599:1: ( 'as' )
            {
            // InternalFortXTrans.g:3599:1: ( 'as' )
            // InternalFortXTrans.g:3600:2: 'as'
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
    // InternalFortXTrans.g:3609:1: rule__AliasedSimpleName__Group_1__1 : rule__AliasedSimpleName__Group_1__1__Impl ;
    public final void rule__AliasedSimpleName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3613:1: ( rule__AliasedSimpleName__Group_1__1__Impl )
            // InternalFortXTrans.g:3614:2: rule__AliasedSimpleName__Group_1__1__Impl
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
    // InternalFortXTrans.g:3620:1: rule__AliasedSimpleName__Group_1__1__Impl : ( ( rule__AliasedSimpleName__AsNameAssignment_1_1 ) ) ;
    public final void rule__AliasedSimpleName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3624:1: ( ( ( rule__AliasedSimpleName__AsNameAssignment_1_1 ) ) )
            // InternalFortXTrans.g:3625:1: ( ( rule__AliasedSimpleName__AsNameAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:3625:1: ( ( rule__AliasedSimpleName__AsNameAssignment_1_1 ) )
            // InternalFortXTrans.g:3626:2: ( rule__AliasedSimpleName__AsNameAssignment_1_1 )
            {
             before(grammarAccess.getAliasedSimpleNameAccess().getAsNameAssignment_1_1()); 
            // InternalFortXTrans.g:3627:2: ( rule__AliasedSimpleName__AsNameAssignment_1_1 )
            // InternalFortXTrans.g:3627:3: rule__AliasedSimpleName__AsNameAssignment_1_1
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
    // InternalFortXTrans.g:3636:1: rule__AliasedAPINames__Group_1__0 : rule__AliasedAPINames__Group_1__0__Impl rule__AliasedAPINames__Group_1__1 ;
    public final void rule__AliasedAPINames__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3640:1: ( rule__AliasedAPINames__Group_1__0__Impl rule__AliasedAPINames__Group_1__1 )
            // InternalFortXTrans.g:3641:2: rule__AliasedAPINames__Group_1__0__Impl rule__AliasedAPINames__Group_1__1
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
    // InternalFortXTrans.g:3648:1: rule__AliasedAPINames__Group_1__0__Impl : ( ( rule__AliasedAPINames__BrackAssignment_1_0 ) ) ;
    public final void rule__AliasedAPINames__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3652:1: ( ( ( rule__AliasedAPINames__BrackAssignment_1_0 ) ) )
            // InternalFortXTrans.g:3653:1: ( ( rule__AliasedAPINames__BrackAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:3653:1: ( ( rule__AliasedAPINames__BrackAssignment_1_0 ) )
            // InternalFortXTrans.g:3654:2: ( rule__AliasedAPINames__BrackAssignment_1_0 )
            {
             before(grammarAccess.getAliasedAPINamesAccess().getBrackAssignment_1_0()); 
            // InternalFortXTrans.g:3655:2: ( rule__AliasedAPINames__BrackAssignment_1_0 )
            // InternalFortXTrans.g:3655:3: rule__AliasedAPINames__BrackAssignment_1_0
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
    // InternalFortXTrans.g:3663:1: rule__AliasedAPINames__Group_1__1 : rule__AliasedAPINames__Group_1__1__Impl rule__AliasedAPINames__Group_1__2 ;
    public final void rule__AliasedAPINames__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3667:1: ( rule__AliasedAPINames__Group_1__1__Impl rule__AliasedAPINames__Group_1__2 )
            // InternalFortXTrans.g:3668:2: rule__AliasedAPINames__Group_1__1__Impl rule__AliasedAPINames__Group_1__2
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
    // InternalFortXTrans.g:3675:1: rule__AliasedAPINames__Group_1__1__Impl : ( ( rule__AliasedAPINames__NameListAssignment_1_1 ) ) ;
    public final void rule__AliasedAPINames__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3679:1: ( ( ( rule__AliasedAPINames__NameListAssignment_1_1 ) ) )
            // InternalFortXTrans.g:3680:1: ( ( rule__AliasedAPINames__NameListAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:3680:1: ( ( rule__AliasedAPINames__NameListAssignment_1_1 ) )
            // InternalFortXTrans.g:3681:2: ( rule__AliasedAPINames__NameListAssignment_1_1 )
            {
             before(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_1_1()); 
            // InternalFortXTrans.g:3682:2: ( rule__AliasedAPINames__NameListAssignment_1_1 )
            // InternalFortXTrans.g:3682:3: rule__AliasedAPINames__NameListAssignment_1_1
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
    // InternalFortXTrans.g:3690:1: rule__AliasedAPINames__Group_1__2 : rule__AliasedAPINames__Group_1__2__Impl rule__AliasedAPINames__Group_1__3 ;
    public final void rule__AliasedAPINames__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3694:1: ( rule__AliasedAPINames__Group_1__2__Impl rule__AliasedAPINames__Group_1__3 )
            // InternalFortXTrans.g:3695:2: rule__AliasedAPINames__Group_1__2__Impl rule__AliasedAPINames__Group_1__3
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
    // InternalFortXTrans.g:3702:1: rule__AliasedAPINames__Group_1__2__Impl : ( ( rule__AliasedAPINames__Group_1_2__0 )* ) ;
    public final void rule__AliasedAPINames__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3706:1: ( ( ( rule__AliasedAPINames__Group_1_2__0 )* ) )
            // InternalFortXTrans.g:3707:1: ( ( rule__AliasedAPINames__Group_1_2__0 )* )
            {
            // InternalFortXTrans.g:3707:1: ( ( rule__AliasedAPINames__Group_1_2__0 )* )
            // InternalFortXTrans.g:3708:2: ( rule__AliasedAPINames__Group_1_2__0 )*
            {
             before(grammarAccess.getAliasedAPINamesAccess().getGroup_1_2()); 
            // InternalFortXTrans.g:3709:2: ( rule__AliasedAPINames__Group_1_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==24) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalFortXTrans.g:3709:3: rule__AliasedAPINames__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__AliasedAPINames__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalFortXTrans.g:3717:1: rule__AliasedAPINames__Group_1__3 : rule__AliasedAPINames__Group_1__3__Impl ;
    public final void rule__AliasedAPINames__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3721:1: ( rule__AliasedAPINames__Group_1__3__Impl )
            // InternalFortXTrans.g:3722:2: rule__AliasedAPINames__Group_1__3__Impl
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
    // InternalFortXTrans.g:3728:1: rule__AliasedAPINames__Group_1__3__Impl : ( '}' ) ;
    public final void rule__AliasedAPINames__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3732:1: ( ( '}' ) )
            // InternalFortXTrans.g:3733:1: ( '}' )
            {
            // InternalFortXTrans.g:3733:1: ( '}' )
            // InternalFortXTrans.g:3734:2: '}'
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
    // InternalFortXTrans.g:3744:1: rule__AliasedAPINames__Group_1_2__0 : rule__AliasedAPINames__Group_1_2__0__Impl rule__AliasedAPINames__Group_1_2__1 ;
    public final void rule__AliasedAPINames__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3748:1: ( rule__AliasedAPINames__Group_1_2__0__Impl rule__AliasedAPINames__Group_1_2__1 )
            // InternalFortXTrans.g:3749:2: rule__AliasedAPINames__Group_1_2__0__Impl rule__AliasedAPINames__Group_1_2__1
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
    // InternalFortXTrans.g:3756:1: rule__AliasedAPINames__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__AliasedAPINames__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3760:1: ( ( ',' ) )
            // InternalFortXTrans.g:3761:1: ( ',' )
            {
            // InternalFortXTrans.g:3761:1: ( ',' )
            // InternalFortXTrans.g:3762:2: ','
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
    // InternalFortXTrans.g:3771:1: rule__AliasedAPINames__Group_1_2__1 : rule__AliasedAPINames__Group_1_2__1__Impl ;
    public final void rule__AliasedAPINames__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3775:1: ( rule__AliasedAPINames__Group_1_2__1__Impl )
            // InternalFortXTrans.g:3776:2: rule__AliasedAPINames__Group_1_2__1__Impl
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
    // InternalFortXTrans.g:3782:1: rule__AliasedAPINames__Group_1_2__1__Impl : ( ( rule__AliasedAPINames__NameListAssignment_1_2_1 ) ) ;
    public final void rule__AliasedAPINames__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3786:1: ( ( ( rule__AliasedAPINames__NameListAssignment_1_2_1 ) ) )
            // InternalFortXTrans.g:3787:1: ( ( rule__AliasedAPINames__NameListAssignment_1_2_1 ) )
            {
            // InternalFortXTrans.g:3787:1: ( ( rule__AliasedAPINames__NameListAssignment_1_2_1 ) )
            // InternalFortXTrans.g:3788:2: ( rule__AliasedAPINames__NameListAssignment_1_2_1 )
            {
             before(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_1_2_1()); 
            // InternalFortXTrans.g:3789:2: ( rule__AliasedAPINames__NameListAssignment_1_2_1 )
            // InternalFortXTrans.g:3789:3: rule__AliasedAPINames__NameListAssignment_1_2_1
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
    // InternalFortXTrans.g:3798:1: rule__AliasedAPIName__Group__0 : rule__AliasedAPIName__Group__0__Impl rule__AliasedAPIName__Group__1 ;
    public final void rule__AliasedAPIName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3802:1: ( rule__AliasedAPIName__Group__0__Impl rule__AliasedAPIName__Group__1 )
            // InternalFortXTrans.g:3803:2: rule__AliasedAPIName__Group__0__Impl rule__AliasedAPIName__Group__1
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
    // InternalFortXTrans.g:3810:1: rule__AliasedAPIName__Group__0__Impl : ( ( rule__AliasedAPIName__OrigAssignment_0 ) ) ;
    public final void rule__AliasedAPIName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3814:1: ( ( ( rule__AliasedAPIName__OrigAssignment_0 ) ) )
            // InternalFortXTrans.g:3815:1: ( ( rule__AliasedAPIName__OrigAssignment_0 ) )
            {
            // InternalFortXTrans.g:3815:1: ( ( rule__AliasedAPIName__OrigAssignment_0 ) )
            // InternalFortXTrans.g:3816:2: ( rule__AliasedAPIName__OrigAssignment_0 )
            {
             before(grammarAccess.getAliasedAPINameAccess().getOrigAssignment_0()); 
            // InternalFortXTrans.g:3817:2: ( rule__AliasedAPIName__OrigAssignment_0 )
            // InternalFortXTrans.g:3817:3: rule__AliasedAPIName__OrigAssignment_0
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
    // InternalFortXTrans.g:3825:1: rule__AliasedAPIName__Group__1 : rule__AliasedAPIName__Group__1__Impl ;
    public final void rule__AliasedAPIName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3829:1: ( rule__AliasedAPIName__Group__1__Impl )
            // InternalFortXTrans.g:3830:2: rule__AliasedAPIName__Group__1__Impl
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
    // InternalFortXTrans.g:3836:1: rule__AliasedAPIName__Group__1__Impl : ( ( rule__AliasedAPIName__Group_1__0 )? ) ;
    public final void rule__AliasedAPIName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3840:1: ( ( ( rule__AliasedAPIName__Group_1__0 )? ) )
            // InternalFortXTrans.g:3841:1: ( ( rule__AliasedAPIName__Group_1__0 )? )
            {
            // InternalFortXTrans.g:3841:1: ( ( rule__AliasedAPIName__Group_1__0 )? )
            // InternalFortXTrans.g:3842:2: ( rule__AliasedAPIName__Group_1__0 )?
            {
             before(grammarAccess.getAliasedAPINameAccess().getGroup_1()); 
            // InternalFortXTrans.g:3843:2: ( rule__AliasedAPIName__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==27) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalFortXTrans.g:3843:3: rule__AliasedAPIName__Group_1__0
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
    // InternalFortXTrans.g:3852:1: rule__AliasedAPIName__Group_1__0 : rule__AliasedAPIName__Group_1__0__Impl rule__AliasedAPIName__Group_1__1 ;
    public final void rule__AliasedAPIName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3856:1: ( rule__AliasedAPIName__Group_1__0__Impl rule__AliasedAPIName__Group_1__1 )
            // InternalFortXTrans.g:3857:2: rule__AliasedAPIName__Group_1__0__Impl rule__AliasedAPIName__Group_1__1
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
    // InternalFortXTrans.g:3864:1: rule__AliasedAPIName__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__AliasedAPIName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3868:1: ( ( 'as' ) )
            // InternalFortXTrans.g:3869:1: ( 'as' )
            {
            // InternalFortXTrans.g:3869:1: ( 'as' )
            // InternalFortXTrans.g:3870:2: 'as'
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
    // InternalFortXTrans.g:3879:1: rule__AliasedAPIName__Group_1__1 : rule__AliasedAPIName__Group_1__1__Impl ;
    public final void rule__AliasedAPIName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3883:1: ( rule__AliasedAPIName__Group_1__1__Impl )
            // InternalFortXTrans.g:3884:2: rule__AliasedAPIName__Group_1__1__Impl
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
    // InternalFortXTrans.g:3890:1: rule__AliasedAPIName__Group_1__1__Impl : ( ( rule__AliasedAPIName__AsNameAssignment_1_1 ) ) ;
    public final void rule__AliasedAPIName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3894:1: ( ( ( rule__AliasedAPIName__AsNameAssignment_1_1 ) ) )
            // InternalFortXTrans.g:3895:1: ( ( rule__AliasedAPIName__AsNameAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:3895:1: ( ( rule__AliasedAPIName__AsNameAssignment_1_1 ) )
            // InternalFortXTrans.g:3896:2: ( rule__AliasedAPIName__AsNameAssignment_1_1 )
            {
             before(grammarAccess.getAliasedAPINameAccess().getAsNameAssignment_1_1()); 
            // InternalFortXTrans.g:3897:2: ( rule__AliasedAPIName__AsNameAssignment_1_1 )
            // InternalFortXTrans.g:3897:3: rule__AliasedAPIName__AsNameAssignment_1_1
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
    // InternalFortXTrans.g:3906:1: rule__ValParam__Group_1__0 : rule__ValParam__Group_1__0__Impl rule__ValParam__Group_1__1 ;
    public final void rule__ValParam__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3910:1: ( rule__ValParam__Group_1__0__Impl rule__ValParam__Group_1__1 )
            // InternalFortXTrans.g:3911:2: rule__ValParam__Group_1__0__Impl rule__ValParam__Group_1__1
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
    // InternalFortXTrans.g:3918:1: rule__ValParam__Group_1__0__Impl : ( ( rule__ValParam__BrackAssignment_1_0 ) ) ;
    public final void rule__ValParam__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3922:1: ( ( ( rule__ValParam__BrackAssignment_1_0 ) ) )
            // InternalFortXTrans.g:3923:1: ( ( rule__ValParam__BrackAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:3923:1: ( ( rule__ValParam__BrackAssignment_1_0 ) )
            // InternalFortXTrans.g:3924:2: ( rule__ValParam__BrackAssignment_1_0 )
            {
             before(grammarAccess.getValParamAccess().getBrackAssignment_1_0()); 
            // InternalFortXTrans.g:3925:2: ( rule__ValParam__BrackAssignment_1_0 )
            // InternalFortXTrans.g:3925:3: rule__ValParam__BrackAssignment_1_0
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
    // InternalFortXTrans.g:3933:1: rule__ValParam__Group_1__1 : rule__ValParam__Group_1__1__Impl rule__ValParam__Group_1__2 ;
    public final void rule__ValParam__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3937:1: ( rule__ValParam__Group_1__1__Impl rule__ValParam__Group_1__2 )
            // InternalFortXTrans.g:3938:2: rule__ValParam__Group_1__1__Impl rule__ValParam__Group_1__2
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
    // InternalFortXTrans.g:3945:1: rule__ValParam__Group_1__1__Impl : ( ( rule__ValParam__Group_1_1__0 )? ) ;
    public final void rule__ValParam__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3949:1: ( ( ( rule__ValParam__Group_1_1__0 )? ) )
            // InternalFortXTrans.g:3950:1: ( ( rule__ValParam__Group_1_1__0 )? )
            {
            // InternalFortXTrans.g:3950:1: ( ( rule__ValParam__Group_1_1__0 )? )
            // InternalFortXTrans.g:3951:2: ( rule__ValParam__Group_1_1__0 )?
            {
             before(grammarAccess.getValParamAccess().getGroup_1_1()); 
            // InternalFortXTrans.g:3952:2: ( rule__ValParam__Group_1_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID||LA37_0==19) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalFortXTrans.g:3952:3: rule__ValParam__Group_1_1__0
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
    // InternalFortXTrans.g:3960:1: rule__ValParam__Group_1__2 : rule__ValParam__Group_1__2__Impl ;
    public final void rule__ValParam__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3964:1: ( rule__ValParam__Group_1__2__Impl )
            // InternalFortXTrans.g:3965:2: rule__ValParam__Group_1__2__Impl
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
    // InternalFortXTrans.g:3971:1: rule__ValParam__Group_1__2__Impl : ( ')' ) ;
    public final void rule__ValParam__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3975:1: ( ( ')' ) )
            // InternalFortXTrans.g:3976:1: ( ')' )
            {
            // InternalFortXTrans.g:3976:1: ( ')' )
            // InternalFortXTrans.g:3977:2: ')'
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
    // InternalFortXTrans.g:3987:1: rule__ValParam__Group_1_1__0 : rule__ValParam__Group_1_1__0__Impl rule__ValParam__Group_1_1__1 ;
    public final void rule__ValParam__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3991:1: ( rule__ValParam__Group_1_1__0__Impl rule__ValParam__Group_1_1__1 )
            // InternalFortXTrans.g:3992:2: rule__ValParam__Group_1_1__0__Impl rule__ValParam__Group_1_1__1
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
    // InternalFortXTrans.g:3999:1: rule__ValParam__Group_1_1__0__Impl : ( ( rule__ValParam__ParamsAssignment_1_1_0 ) ) ;
    public final void rule__ValParam__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4003:1: ( ( ( rule__ValParam__ParamsAssignment_1_1_0 ) ) )
            // InternalFortXTrans.g:4004:1: ( ( rule__ValParam__ParamsAssignment_1_1_0 ) )
            {
            // InternalFortXTrans.g:4004:1: ( ( rule__ValParam__ParamsAssignment_1_1_0 ) )
            // InternalFortXTrans.g:4005:2: ( rule__ValParam__ParamsAssignment_1_1_0 )
            {
             before(grammarAccess.getValParamAccess().getParamsAssignment_1_1_0()); 
            // InternalFortXTrans.g:4006:2: ( rule__ValParam__ParamsAssignment_1_1_0 )
            // InternalFortXTrans.g:4006:3: rule__ValParam__ParamsAssignment_1_1_0
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
    // InternalFortXTrans.g:4014:1: rule__ValParam__Group_1_1__1 : rule__ValParam__Group_1_1__1__Impl ;
    public final void rule__ValParam__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4018:1: ( rule__ValParam__Group_1_1__1__Impl )
            // InternalFortXTrans.g:4019:2: rule__ValParam__Group_1_1__1__Impl
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
    // InternalFortXTrans.g:4025:1: rule__ValParam__Group_1_1__1__Impl : ( ( rule__ValParam__Group_1_1_1__0 )* ) ;
    public final void rule__ValParam__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4029:1: ( ( ( rule__ValParam__Group_1_1_1__0 )* ) )
            // InternalFortXTrans.g:4030:1: ( ( rule__ValParam__Group_1_1_1__0 )* )
            {
            // InternalFortXTrans.g:4030:1: ( ( rule__ValParam__Group_1_1_1__0 )* )
            // InternalFortXTrans.g:4031:2: ( rule__ValParam__Group_1_1_1__0 )*
            {
             before(grammarAccess.getValParamAccess().getGroup_1_1_1()); 
            // InternalFortXTrans.g:4032:2: ( rule__ValParam__Group_1_1_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==24) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalFortXTrans.g:4032:3: rule__ValParam__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ValParam__Group_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalFortXTrans.g:4041:1: rule__ValParam__Group_1_1_1__0 : rule__ValParam__Group_1_1_1__0__Impl rule__ValParam__Group_1_1_1__1 ;
    public final void rule__ValParam__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4045:1: ( rule__ValParam__Group_1_1_1__0__Impl rule__ValParam__Group_1_1_1__1 )
            // InternalFortXTrans.g:4046:2: rule__ValParam__Group_1_1_1__0__Impl rule__ValParam__Group_1_1_1__1
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
    // InternalFortXTrans.g:4053:1: rule__ValParam__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__ValParam__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4057:1: ( ( ',' ) )
            // InternalFortXTrans.g:4058:1: ( ',' )
            {
            // InternalFortXTrans.g:4058:1: ( ',' )
            // InternalFortXTrans.g:4059:2: ','
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
    // InternalFortXTrans.g:4068:1: rule__ValParam__Group_1_1_1__1 : rule__ValParam__Group_1_1_1__1__Impl ;
    public final void rule__ValParam__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4072:1: ( rule__ValParam__Group_1_1_1__1__Impl )
            // InternalFortXTrans.g:4073:2: rule__ValParam__Group_1_1_1__1__Impl
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
    // InternalFortXTrans.g:4079:1: rule__ValParam__Group_1_1_1__1__Impl : ( ( rule__ValParam__ParamsAssignment_1_1_1_1 ) ) ;
    public final void rule__ValParam__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4083:1: ( ( ( rule__ValParam__ParamsAssignment_1_1_1_1 ) ) )
            // InternalFortXTrans.g:4084:1: ( ( rule__ValParam__ParamsAssignment_1_1_1_1 ) )
            {
            // InternalFortXTrans.g:4084:1: ( ( rule__ValParam__ParamsAssignment_1_1_1_1 ) )
            // InternalFortXTrans.g:4085:2: ( rule__ValParam__ParamsAssignment_1_1_1_1 )
            {
             before(grammarAccess.getValParamAccess().getParamsAssignment_1_1_1_1()); 
            // InternalFortXTrans.g:4086:2: ( rule__ValParam__ParamsAssignment_1_1_1_1 )
            // InternalFortXTrans.g:4086:3: rule__ValParam__ParamsAssignment_1_1_1_1
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
    // InternalFortXTrans.g:4095:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4099:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // InternalFortXTrans.g:4100:2: rule__Param__Group__0__Impl rule__Param__Group__1
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
    // InternalFortXTrans.g:4107:1: rule__Param__Group__0__Impl : ( ( rule__Param__BIdAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4111:1: ( ( ( rule__Param__BIdAssignment_0 ) ) )
            // InternalFortXTrans.g:4112:1: ( ( rule__Param__BIdAssignment_0 ) )
            {
            // InternalFortXTrans.g:4112:1: ( ( rule__Param__BIdAssignment_0 ) )
            // InternalFortXTrans.g:4113:2: ( rule__Param__BIdAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getBIdAssignment_0()); 
            // InternalFortXTrans.g:4114:2: ( rule__Param__BIdAssignment_0 )
            // InternalFortXTrans.g:4114:3: rule__Param__BIdAssignment_0
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
    // InternalFortXTrans.g:4122:1: rule__Param__Group__1 : rule__Param__Group__1__Impl ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4126:1: ( rule__Param__Group__1__Impl )
            // InternalFortXTrans.g:4127:2: rule__Param__Group__1__Impl
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
    // InternalFortXTrans.g:4133:1: rule__Param__Group__1__Impl : ( ( rule__Param__IstypeAssignment_1 ) ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4137:1: ( ( ( rule__Param__IstypeAssignment_1 ) ) )
            // InternalFortXTrans.g:4138:1: ( ( rule__Param__IstypeAssignment_1 ) )
            {
            // InternalFortXTrans.g:4138:1: ( ( rule__Param__IstypeAssignment_1 ) )
            // InternalFortXTrans.g:4139:2: ( rule__Param__IstypeAssignment_1 )
            {
             before(grammarAccess.getParamAccess().getIstypeAssignment_1()); 
            // InternalFortXTrans.g:4140:2: ( rule__Param__IstypeAssignment_1 )
            // InternalFortXTrans.g:4140:3: rule__Param__IstypeAssignment_1
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
    // InternalFortXTrans.g:4149:1: rule__RetType__Group_0__0 : rule__RetType__Group_0__0__Impl rule__RetType__Group_0__1 ;
    public final void rule__RetType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4153:1: ( rule__RetType__Group_0__0__Impl rule__RetType__Group_0__1 )
            // InternalFortXTrans.g:4154:2: rule__RetType__Group_0__0__Impl rule__RetType__Group_0__1
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
    // InternalFortXTrans.g:4161:1: rule__RetType__Group_0__0__Impl : ( ':' ) ;
    public final void rule__RetType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4165:1: ( ( ':' ) )
            // InternalFortXTrans.g:4166:1: ( ':' )
            {
            // InternalFortXTrans.g:4166:1: ( ':' )
            // InternalFortXTrans.g:4167:2: ':'
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
    // InternalFortXTrans.g:4176:1: rule__RetType__Group_0__1 : rule__RetType__Group_0__1__Impl rule__RetType__Group_0__2 ;
    public final void rule__RetType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4180:1: ( rule__RetType__Group_0__1__Impl rule__RetType__Group_0__2 )
            // InternalFortXTrans.g:4181:2: rule__RetType__Group_0__1__Impl rule__RetType__Group_0__2
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
    // InternalFortXTrans.g:4188:1: rule__RetType__Group_0__1__Impl : ( ( rule__RetType__EmptyAssignment_0_1 ) ) ;
    public final void rule__RetType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4192:1: ( ( ( rule__RetType__EmptyAssignment_0_1 ) ) )
            // InternalFortXTrans.g:4193:1: ( ( rule__RetType__EmptyAssignment_0_1 ) )
            {
            // InternalFortXTrans.g:4193:1: ( ( rule__RetType__EmptyAssignment_0_1 ) )
            // InternalFortXTrans.g:4194:2: ( rule__RetType__EmptyAssignment_0_1 )
            {
             before(grammarAccess.getRetTypeAccess().getEmptyAssignment_0_1()); 
            // InternalFortXTrans.g:4195:2: ( rule__RetType__EmptyAssignment_0_1 )
            // InternalFortXTrans.g:4195:3: rule__RetType__EmptyAssignment_0_1
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
    // InternalFortXTrans.g:4203:1: rule__RetType__Group_0__2 : rule__RetType__Group_0__2__Impl ;
    public final void rule__RetType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4207:1: ( rule__RetType__Group_0__2__Impl )
            // InternalFortXTrans.g:4208:2: rule__RetType__Group_0__2__Impl
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
    // InternalFortXTrans.g:4214:1: rule__RetType__Group_0__2__Impl : ( ')' ) ;
    public final void rule__RetType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4218:1: ( ( ')' ) )
            // InternalFortXTrans.g:4219:1: ( ')' )
            {
            // InternalFortXTrans.g:4219:1: ( ')' )
            // InternalFortXTrans.g:4220:2: ')'
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
    // InternalFortXTrans.g:4230:1: rule__RetType__Group_1__0 : rule__RetType__Group_1__0__Impl rule__RetType__Group_1__1 ;
    public final void rule__RetType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4234:1: ( rule__RetType__Group_1__0__Impl rule__RetType__Group_1__1 )
            // InternalFortXTrans.g:4235:2: rule__RetType__Group_1__0__Impl rule__RetType__Group_1__1
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
    // InternalFortXTrans.g:4242:1: rule__RetType__Group_1__0__Impl : ( ':' ) ;
    public final void rule__RetType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4246:1: ( ( ':' ) )
            // InternalFortXTrans.g:4247:1: ( ':' )
            {
            // InternalFortXTrans.g:4247:1: ( ':' )
            // InternalFortXTrans.g:4248:2: ':'
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
    // InternalFortXTrans.g:4257:1: rule__RetType__Group_1__1 : rule__RetType__Group_1__1__Impl ;
    public final void rule__RetType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4261:1: ( rule__RetType__Group_1__1__Impl )
            // InternalFortXTrans.g:4262:2: rule__RetType__Group_1__1__Impl
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
    // InternalFortXTrans.g:4268:1: rule__RetType__Group_1__1__Impl : ( ( rule__RetType__TypeAssignment_1_1 ) ) ;
    public final void rule__RetType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4272:1: ( ( ( rule__RetType__TypeAssignment_1_1 ) ) )
            // InternalFortXTrans.g:4273:1: ( ( rule__RetType__TypeAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:4273:1: ( ( rule__RetType__TypeAssignment_1_1 ) )
            // InternalFortXTrans.g:4274:2: ( rule__RetType__TypeAssignment_1_1 )
            {
             before(grammarAccess.getRetTypeAccess().getTypeAssignment_1_1()); 
            // InternalFortXTrans.g:4275:2: ( rule__RetType__TypeAssignment_1_1 )
            // InternalFortXTrans.g:4275:3: rule__RetType__TypeAssignment_1_1
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
    // InternalFortXTrans.g:4284:1: rule__FnDecl__Group__0 : rule__FnDecl__Group__0__Impl rule__FnDecl__Group__1 ;
    public final void rule__FnDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4288:1: ( rule__FnDecl__Group__0__Impl rule__FnDecl__Group__1 )
            // InternalFortXTrans.g:4289:2: rule__FnDecl__Group__0__Impl rule__FnDecl__Group__1
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
    // InternalFortXTrans.g:4296:1: rule__FnDecl__Group__0__Impl : ( ( rule__FnDecl__ModsAssignment_0 )? ) ;
    public final void rule__FnDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4300:1: ( ( ( rule__FnDecl__ModsAssignment_0 )? ) )
            // InternalFortXTrans.g:4301:1: ( ( rule__FnDecl__ModsAssignment_0 )? )
            {
            // InternalFortXTrans.g:4301:1: ( ( rule__FnDecl__ModsAssignment_0 )? )
            // InternalFortXTrans.g:4302:2: ( rule__FnDecl__ModsAssignment_0 )?
            {
             before(grammarAccess.getFnDeclAccess().getModsAssignment_0()); 
            // InternalFortXTrans.g:4303:2: ( rule__FnDecl__ModsAssignment_0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=40 && LA39_0<=43)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalFortXTrans.g:4303:3: rule__FnDecl__ModsAssignment_0
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
    // InternalFortXTrans.g:4311:1: rule__FnDecl__Group__1 : rule__FnDecl__Group__1__Impl rule__FnDecl__Group__2 ;
    public final void rule__FnDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4315:1: ( rule__FnDecl__Group__1__Impl rule__FnDecl__Group__2 )
            // InternalFortXTrans.g:4316:2: rule__FnDecl__Group__1__Impl rule__FnDecl__Group__2
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
    // InternalFortXTrans.g:4323:1: rule__FnDecl__Group__1__Impl : ( ( rule__FnDecl__NameAssignment_1 ) ) ;
    public final void rule__FnDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4327:1: ( ( ( rule__FnDecl__NameAssignment_1 ) ) )
            // InternalFortXTrans.g:4328:1: ( ( rule__FnDecl__NameAssignment_1 ) )
            {
            // InternalFortXTrans.g:4328:1: ( ( rule__FnDecl__NameAssignment_1 ) )
            // InternalFortXTrans.g:4329:2: ( rule__FnDecl__NameAssignment_1 )
            {
             before(grammarAccess.getFnDeclAccess().getNameAssignment_1()); 
            // InternalFortXTrans.g:4330:2: ( rule__FnDecl__NameAssignment_1 )
            // InternalFortXTrans.g:4330:3: rule__FnDecl__NameAssignment_1
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
    // InternalFortXTrans.g:4338:1: rule__FnDecl__Group__2 : rule__FnDecl__Group__2__Impl rule__FnDecl__Group__3 ;
    public final void rule__FnDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4342:1: ( rule__FnDecl__Group__2__Impl rule__FnDecl__Group__3 )
            // InternalFortXTrans.g:4343:2: rule__FnDecl__Group__2__Impl rule__FnDecl__Group__3
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
    // InternalFortXTrans.g:4350:1: rule__FnDecl__Group__2__Impl : ( ( rule__FnDecl__ParamsAssignment_2 ) ) ;
    public final void rule__FnDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4354:1: ( ( ( rule__FnDecl__ParamsAssignment_2 ) ) )
            // InternalFortXTrans.g:4355:1: ( ( rule__FnDecl__ParamsAssignment_2 ) )
            {
            // InternalFortXTrans.g:4355:1: ( ( rule__FnDecl__ParamsAssignment_2 ) )
            // InternalFortXTrans.g:4356:2: ( rule__FnDecl__ParamsAssignment_2 )
            {
             before(grammarAccess.getFnDeclAccess().getParamsAssignment_2()); 
            // InternalFortXTrans.g:4357:2: ( rule__FnDecl__ParamsAssignment_2 )
            // InternalFortXTrans.g:4357:3: rule__FnDecl__ParamsAssignment_2
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
    // InternalFortXTrans.g:4365:1: rule__FnDecl__Group__3 : rule__FnDecl__Group__3__Impl rule__FnDecl__Group__4 ;
    public final void rule__FnDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4369:1: ( rule__FnDecl__Group__3__Impl rule__FnDecl__Group__4 )
            // InternalFortXTrans.g:4370:2: rule__FnDecl__Group__3__Impl rule__FnDecl__Group__4
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
    // InternalFortXTrans.g:4377:1: rule__FnDecl__Group__3__Impl : ( ( rule__FnDecl__RetValAssignment_3 )? ) ;
    public final void rule__FnDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4381:1: ( ( ( rule__FnDecl__RetValAssignment_3 )? ) )
            // InternalFortXTrans.g:4382:1: ( ( rule__FnDecl__RetValAssignment_3 )? )
            {
            // InternalFortXTrans.g:4382:1: ( ( rule__FnDecl__RetValAssignment_3 )? )
            // InternalFortXTrans.g:4383:2: ( rule__FnDecl__RetValAssignment_3 )?
            {
             before(grammarAccess.getFnDeclAccess().getRetValAssignment_3()); 
            // InternalFortXTrans.g:4384:2: ( rule__FnDecl__RetValAssignment_3 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==29) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalFortXTrans.g:4384:3: rule__FnDecl__RetValAssignment_3
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
    // InternalFortXTrans.g:4392:1: rule__FnDecl__Group__4 : rule__FnDecl__Group__4__Impl ;
    public final void rule__FnDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4396:1: ( rule__FnDecl__Group__4__Impl )
            // InternalFortXTrans.g:4397:2: rule__FnDecl__Group__4__Impl
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
    // InternalFortXTrans.g:4403:1: rule__FnDecl__Group__4__Impl : ( ( rule__FnDecl__Group_4__0 )? ) ;
    public final void rule__FnDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4407:1: ( ( ( rule__FnDecl__Group_4__0 )? ) )
            // InternalFortXTrans.g:4408:1: ( ( rule__FnDecl__Group_4__0 )? )
            {
            // InternalFortXTrans.g:4408:1: ( ( rule__FnDecl__Group_4__0 )? )
            // InternalFortXTrans.g:4409:2: ( rule__FnDecl__Group_4__0 )?
            {
             before(grammarAccess.getFnDeclAccess().getGroup_4()); 
            // InternalFortXTrans.g:4410:2: ( rule__FnDecl__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==44) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalFortXTrans.g:4410:3: rule__FnDecl__Group_4__0
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
    // InternalFortXTrans.g:4419:1: rule__FnDecl__Group_4__0 : rule__FnDecl__Group_4__0__Impl rule__FnDecl__Group_4__1 ;
    public final void rule__FnDecl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4423:1: ( rule__FnDecl__Group_4__0__Impl rule__FnDecl__Group_4__1 )
            // InternalFortXTrans.g:4424:2: rule__FnDecl__Group_4__0__Impl rule__FnDecl__Group_4__1
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
    // InternalFortXTrans.g:4431:1: rule__FnDecl__Group_4__0__Impl : ( ( rule__FnDecl__BodyAssignment_4_0 ) ) ;
    public final void rule__FnDecl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4435:1: ( ( ( rule__FnDecl__BodyAssignment_4_0 ) ) )
            // InternalFortXTrans.g:4436:1: ( ( rule__FnDecl__BodyAssignment_4_0 ) )
            {
            // InternalFortXTrans.g:4436:1: ( ( rule__FnDecl__BodyAssignment_4_0 ) )
            // InternalFortXTrans.g:4437:2: ( rule__FnDecl__BodyAssignment_4_0 )
            {
             before(grammarAccess.getFnDeclAccess().getBodyAssignment_4_0()); 
            // InternalFortXTrans.g:4438:2: ( rule__FnDecl__BodyAssignment_4_0 )
            // InternalFortXTrans.g:4438:3: rule__FnDecl__BodyAssignment_4_0
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
    // InternalFortXTrans.g:4446:1: rule__FnDecl__Group_4__1 : rule__FnDecl__Group_4__1__Impl ;
    public final void rule__FnDecl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4450:1: ( rule__FnDecl__Group_4__1__Impl )
            // InternalFortXTrans.g:4451:2: rule__FnDecl__Group_4__1__Impl
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
    // InternalFortXTrans.g:4457:1: rule__FnDecl__Group_4__1__Impl : ( ( rule__FnDecl__FnItselfAssignment_4_1 ) ) ;
    public final void rule__FnDecl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4461:1: ( ( ( rule__FnDecl__FnItselfAssignment_4_1 ) ) )
            // InternalFortXTrans.g:4462:1: ( ( rule__FnDecl__FnItselfAssignment_4_1 ) )
            {
            // InternalFortXTrans.g:4462:1: ( ( rule__FnDecl__FnItselfAssignment_4_1 ) )
            // InternalFortXTrans.g:4463:2: ( rule__FnDecl__FnItselfAssignment_4_1 )
            {
             before(grammarAccess.getFnDeclAccess().getFnItselfAssignment_4_1()); 
            // InternalFortXTrans.g:4464:2: ( rule__FnDecl__FnItselfAssignment_4_1 )
            // InternalFortXTrans.g:4464:3: rule__FnDecl__FnItselfAssignment_4_1
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
    // InternalFortXTrans.g:4473:1: rule__Expr__Group__0 : rule__Expr__Group__0__Impl rule__Expr__Group__1 ;
    public final void rule__Expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4477:1: ( rule__Expr__Group__0__Impl rule__Expr__Group__1 )
            // InternalFortXTrans.g:4478:2: rule__Expr__Group__0__Impl rule__Expr__Group__1
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
    // InternalFortXTrans.g:4485:1: rule__Expr__Group__0__Impl : ( ( rule__Expr__FrontAssignment_0 ) ) ;
    public final void rule__Expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4489:1: ( ( ( rule__Expr__FrontAssignment_0 ) ) )
            // InternalFortXTrans.g:4490:1: ( ( rule__Expr__FrontAssignment_0 ) )
            {
            // InternalFortXTrans.g:4490:1: ( ( rule__Expr__FrontAssignment_0 ) )
            // InternalFortXTrans.g:4491:2: ( rule__Expr__FrontAssignment_0 )
            {
             before(grammarAccess.getExprAccess().getFrontAssignment_0()); 
            // InternalFortXTrans.g:4492:2: ( rule__Expr__FrontAssignment_0 )
            // InternalFortXTrans.g:4492:3: rule__Expr__FrontAssignment_0
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
    // InternalFortXTrans.g:4500:1: rule__Expr__Group__1 : rule__Expr__Group__1__Impl ;
    public final void rule__Expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4504:1: ( rule__Expr__Group__1__Impl )
            // InternalFortXTrans.g:4505:2: rule__Expr__Group__1__Impl
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
    // InternalFortXTrans.g:4511:1: rule__Expr__Group__1__Impl : ( ( rule__Expr__TailsAssignment_1 )* ) ;
    public final void rule__Expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4515:1: ( ( ( rule__Expr__TailsAssignment_1 )* ) )
            // InternalFortXTrans.g:4516:1: ( ( rule__Expr__TailsAssignment_1 )* )
            {
            // InternalFortXTrans.g:4516:1: ( ( rule__Expr__TailsAssignment_1 )* )
            // InternalFortXTrans.g:4517:2: ( rule__Expr__TailsAssignment_1 )*
            {
             before(grammarAccess.getExprAccess().getTailsAssignment_1()); 
            // InternalFortXTrans.g:4518:2: ( rule__Expr__TailsAssignment_1 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==27) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalFortXTrans.g:4518:3: rule__Expr__TailsAssignment_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Expr__TailsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalFortXTrans.g:4527:1: rule__ExprTail__Group__0 : rule__ExprTail__Group__0__Impl rule__ExprTail__Group__1 ;
    public final void rule__ExprTail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4531:1: ( rule__ExprTail__Group__0__Impl rule__ExprTail__Group__1 )
            // InternalFortXTrans.g:4532:2: rule__ExprTail__Group__0__Impl rule__ExprTail__Group__1
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
    // InternalFortXTrans.g:4539:1: rule__ExprTail__Group__0__Impl : ( 'as' ) ;
    public final void rule__ExprTail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4543:1: ( ( 'as' ) )
            // InternalFortXTrans.g:4544:1: ( 'as' )
            {
            // InternalFortXTrans.g:4544:1: ( 'as' )
            // InternalFortXTrans.g:4545:2: 'as'
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
    // InternalFortXTrans.g:4554:1: rule__ExprTail__Group__1 : rule__ExprTail__Group__1__Impl ;
    public final void rule__ExprTail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4558:1: ( rule__ExprTail__Group__1__Impl )
            // InternalFortXTrans.g:4559:2: rule__ExprTail__Group__1__Impl
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
    // InternalFortXTrans.g:4565:1: rule__ExprTail__Group__1__Impl : ( ( rule__ExprTail__TypeAssignment_1 ) ) ;
    public final void rule__ExprTail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4569:1: ( ( ( rule__ExprTail__TypeAssignment_1 ) ) )
            // InternalFortXTrans.g:4570:1: ( ( rule__ExprTail__TypeAssignment_1 ) )
            {
            // InternalFortXTrans.g:4570:1: ( ( rule__ExprTail__TypeAssignment_1 ) )
            // InternalFortXTrans.g:4571:2: ( rule__ExprTail__TypeAssignment_1 )
            {
             before(grammarAccess.getExprTailAccess().getTypeAssignment_1()); 
            // InternalFortXTrans.g:4572:2: ( rule__ExprTail__TypeAssignment_1 )
            // InternalFortXTrans.g:4572:3: rule__ExprTail__TypeAssignment_1
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
    // InternalFortXTrans.g:4581:1: rule__DelimitedExpr__Group_1__0 : rule__DelimitedExpr__Group_1__0__Impl rule__DelimitedExpr__Group_1__1 ;
    public final void rule__DelimitedExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4585:1: ( rule__DelimitedExpr__Group_1__0__Impl rule__DelimitedExpr__Group_1__1 )
            // InternalFortXTrans.g:4586:2: rule__DelimitedExpr__Group_1__0__Impl rule__DelimitedExpr__Group_1__1
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
    // InternalFortXTrans.g:4593:1: rule__DelimitedExpr__Group_1__0__Impl : ( ( rule__DelimitedExpr__AwhileAssignment_1_0 ) ) ;
    public final void rule__DelimitedExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4597:1: ( ( ( rule__DelimitedExpr__AwhileAssignment_1_0 ) ) )
            // InternalFortXTrans.g:4598:1: ( ( rule__DelimitedExpr__AwhileAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:4598:1: ( ( rule__DelimitedExpr__AwhileAssignment_1_0 ) )
            // InternalFortXTrans.g:4599:2: ( rule__DelimitedExpr__AwhileAssignment_1_0 )
            {
             before(grammarAccess.getDelimitedExprAccess().getAwhileAssignment_1_0()); 
            // InternalFortXTrans.g:4600:2: ( rule__DelimitedExpr__AwhileAssignment_1_0 )
            // InternalFortXTrans.g:4600:3: rule__DelimitedExpr__AwhileAssignment_1_0
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
    // InternalFortXTrans.g:4608:1: rule__DelimitedExpr__Group_1__1 : rule__DelimitedExpr__Group_1__1__Impl rule__DelimitedExpr__Group_1__2 ;
    public final void rule__DelimitedExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4612:1: ( rule__DelimitedExpr__Group_1__1__Impl rule__DelimitedExpr__Group_1__2 )
            // InternalFortXTrans.g:4613:2: rule__DelimitedExpr__Group_1__1__Impl rule__DelimitedExpr__Group_1__2
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
    // InternalFortXTrans.g:4620:1: rule__DelimitedExpr__Group_1__1__Impl : ( ( rule__DelimitedExpr__ExprAssignment_1_1 ) ) ;
    public final void rule__DelimitedExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4624:1: ( ( ( rule__DelimitedExpr__ExprAssignment_1_1 ) ) )
            // InternalFortXTrans.g:4625:1: ( ( rule__DelimitedExpr__ExprAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:4625:1: ( ( rule__DelimitedExpr__ExprAssignment_1_1 ) )
            // InternalFortXTrans.g:4626:2: ( rule__DelimitedExpr__ExprAssignment_1_1 )
            {
             before(grammarAccess.getDelimitedExprAccess().getExprAssignment_1_1()); 
            // InternalFortXTrans.g:4627:2: ( rule__DelimitedExpr__ExprAssignment_1_1 )
            // InternalFortXTrans.g:4627:3: rule__DelimitedExpr__ExprAssignment_1_1
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
    // InternalFortXTrans.g:4635:1: rule__DelimitedExpr__Group_1__2 : rule__DelimitedExpr__Group_1__2__Impl ;
    public final void rule__DelimitedExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4639:1: ( rule__DelimitedExpr__Group_1__2__Impl )
            // InternalFortXTrans.g:4640:2: rule__DelimitedExpr__Group_1__2__Impl
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
    // InternalFortXTrans.g:4646:1: rule__DelimitedExpr__Group_1__2__Impl : ( ( rule__DelimitedExpr__WhiledodAssignment_1_2 ) ) ;
    public final void rule__DelimitedExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4650:1: ( ( ( rule__DelimitedExpr__WhiledodAssignment_1_2 ) ) )
            // InternalFortXTrans.g:4651:1: ( ( rule__DelimitedExpr__WhiledodAssignment_1_2 ) )
            {
            // InternalFortXTrans.g:4651:1: ( ( rule__DelimitedExpr__WhiledodAssignment_1_2 ) )
            // InternalFortXTrans.g:4652:2: ( rule__DelimitedExpr__WhiledodAssignment_1_2 )
            {
             before(grammarAccess.getDelimitedExprAccess().getWhiledodAssignment_1_2()); 
            // InternalFortXTrans.g:4653:2: ( rule__DelimitedExpr__WhiledodAssignment_1_2 )
            // InternalFortXTrans.g:4653:3: rule__DelimitedExpr__WhiledodAssignment_1_2
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
    // InternalFortXTrans.g:4662:1: rule__DelimitedExpr__Group_2__0 : rule__DelimitedExpr__Group_2__0__Impl rule__DelimitedExpr__Group_2__1 ;
    public final void rule__DelimitedExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4666:1: ( rule__DelimitedExpr__Group_2__0__Impl rule__DelimitedExpr__Group_2__1 )
            // InternalFortXTrans.g:4667:2: rule__DelimitedExpr__Group_2__0__Impl rule__DelimitedExpr__Group_2__1
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
    // InternalFortXTrans.g:4674:1: rule__DelimitedExpr__Group_2__0__Impl : ( ( rule__DelimitedExpr__AforAssignment_2_0 ) ) ;
    public final void rule__DelimitedExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4678:1: ( ( ( rule__DelimitedExpr__AforAssignment_2_0 ) ) )
            // InternalFortXTrans.g:4679:1: ( ( rule__DelimitedExpr__AforAssignment_2_0 ) )
            {
            // InternalFortXTrans.g:4679:1: ( ( rule__DelimitedExpr__AforAssignment_2_0 ) )
            // InternalFortXTrans.g:4680:2: ( rule__DelimitedExpr__AforAssignment_2_0 )
            {
             before(grammarAccess.getDelimitedExprAccess().getAforAssignment_2_0()); 
            // InternalFortXTrans.g:4681:2: ( rule__DelimitedExpr__AforAssignment_2_0 )
            // InternalFortXTrans.g:4681:3: rule__DelimitedExpr__AforAssignment_2_0
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
    // InternalFortXTrans.g:4689:1: rule__DelimitedExpr__Group_2__1 : rule__DelimitedExpr__Group_2__1__Impl rule__DelimitedExpr__Group_2__2 ;
    public final void rule__DelimitedExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4693:1: ( rule__DelimitedExpr__Group_2__1__Impl rule__DelimitedExpr__Group_2__2 )
            // InternalFortXTrans.g:4694:2: rule__DelimitedExpr__Group_2__1__Impl rule__DelimitedExpr__Group_2__2
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
    // InternalFortXTrans.g:4701:1: rule__DelimitedExpr__Group_2__1__Impl : ( ( rule__DelimitedExpr__GenAssignment_2_1 ) ) ;
    public final void rule__DelimitedExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4705:1: ( ( ( rule__DelimitedExpr__GenAssignment_2_1 ) ) )
            // InternalFortXTrans.g:4706:1: ( ( rule__DelimitedExpr__GenAssignment_2_1 ) )
            {
            // InternalFortXTrans.g:4706:1: ( ( rule__DelimitedExpr__GenAssignment_2_1 ) )
            // InternalFortXTrans.g:4707:2: ( rule__DelimitedExpr__GenAssignment_2_1 )
            {
             before(grammarAccess.getDelimitedExprAccess().getGenAssignment_2_1()); 
            // InternalFortXTrans.g:4708:2: ( rule__DelimitedExpr__GenAssignment_2_1 )
            // InternalFortXTrans.g:4708:3: rule__DelimitedExpr__GenAssignment_2_1
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
    // InternalFortXTrans.g:4716:1: rule__DelimitedExpr__Group_2__2 : rule__DelimitedExpr__Group_2__2__Impl rule__DelimitedExpr__Group_2__3 ;
    public final void rule__DelimitedExpr__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4720:1: ( rule__DelimitedExpr__Group_2__2__Impl rule__DelimitedExpr__Group_2__3 )
            // InternalFortXTrans.g:4721:2: rule__DelimitedExpr__Group_2__2__Impl rule__DelimitedExpr__Group_2__3
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
    // InternalFortXTrans.g:4728:1: rule__DelimitedExpr__Group_2__2__Impl : ( ( rule__DelimitedExpr__DofrontAssignment_2_2 ) ) ;
    public final void rule__DelimitedExpr__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4732:1: ( ( ( rule__DelimitedExpr__DofrontAssignment_2_2 ) ) )
            // InternalFortXTrans.g:4733:1: ( ( rule__DelimitedExpr__DofrontAssignment_2_2 ) )
            {
            // InternalFortXTrans.g:4733:1: ( ( rule__DelimitedExpr__DofrontAssignment_2_2 ) )
            // InternalFortXTrans.g:4734:2: ( rule__DelimitedExpr__DofrontAssignment_2_2 )
            {
             before(grammarAccess.getDelimitedExprAccess().getDofrontAssignment_2_2()); 
            // InternalFortXTrans.g:4735:2: ( rule__DelimitedExpr__DofrontAssignment_2_2 )
            // InternalFortXTrans.g:4735:3: rule__DelimitedExpr__DofrontAssignment_2_2
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
    // InternalFortXTrans.g:4743:1: rule__DelimitedExpr__Group_2__3 : rule__DelimitedExpr__Group_2__3__Impl ;
    public final void rule__DelimitedExpr__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4747:1: ( rule__DelimitedExpr__Group_2__3__Impl )
            // InternalFortXTrans.g:4748:2: rule__DelimitedExpr__Group_2__3__Impl
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
    // InternalFortXTrans.g:4754:1: rule__DelimitedExpr__Group_2__3__Impl : ( 'end' ) ;
    public final void rule__DelimitedExpr__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4758:1: ( ( 'end' ) )
            // InternalFortXTrans.g:4759:1: ( 'end' )
            {
            // InternalFortXTrans.g:4759:1: ( 'end' )
            // InternalFortXTrans.g:4760:2: 'end'
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
    // InternalFortXTrans.g:4770:1: rule__DelimitedExpr__Group_3__0 : rule__DelimitedExpr__Group_3__0__Impl rule__DelimitedExpr__Group_3__1 ;
    public final void rule__DelimitedExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4774:1: ( rule__DelimitedExpr__Group_3__0__Impl rule__DelimitedExpr__Group_3__1 )
            // InternalFortXTrans.g:4775:2: rule__DelimitedExpr__Group_3__0__Impl rule__DelimitedExpr__Group_3__1
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
    // InternalFortXTrans.g:4782:1: rule__DelimitedExpr__Group_3__0__Impl : ( ( rule__DelimitedExpr__AnifAssignment_3_0 ) ) ;
    public final void rule__DelimitedExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4786:1: ( ( ( rule__DelimitedExpr__AnifAssignment_3_0 ) ) )
            // InternalFortXTrans.g:4787:1: ( ( rule__DelimitedExpr__AnifAssignment_3_0 ) )
            {
            // InternalFortXTrans.g:4787:1: ( ( rule__DelimitedExpr__AnifAssignment_3_0 ) )
            // InternalFortXTrans.g:4788:2: ( rule__DelimitedExpr__AnifAssignment_3_0 )
            {
             before(grammarAccess.getDelimitedExprAccess().getAnifAssignment_3_0()); 
            // InternalFortXTrans.g:4789:2: ( rule__DelimitedExpr__AnifAssignment_3_0 )
            // InternalFortXTrans.g:4789:3: rule__DelimitedExpr__AnifAssignment_3_0
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
    // InternalFortXTrans.g:4797:1: rule__DelimitedExpr__Group_3__1 : rule__DelimitedExpr__Group_3__1__Impl rule__DelimitedExpr__Group_3__2 ;
    public final void rule__DelimitedExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4801:1: ( rule__DelimitedExpr__Group_3__1__Impl rule__DelimitedExpr__Group_3__2 )
            // InternalFortXTrans.g:4802:2: rule__DelimitedExpr__Group_3__1__Impl rule__DelimitedExpr__Group_3__2
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
    // InternalFortXTrans.g:4809:1: rule__DelimitedExpr__Group_3__1__Impl : ( ( rule__DelimitedExpr__CondAssignment_3_1 ) ) ;
    public final void rule__DelimitedExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4813:1: ( ( ( rule__DelimitedExpr__CondAssignment_3_1 ) ) )
            // InternalFortXTrans.g:4814:1: ( ( rule__DelimitedExpr__CondAssignment_3_1 ) )
            {
            // InternalFortXTrans.g:4814:1: ( ( rule__DelimitedExpr__CondAssignment_3_1 ) )
            // InternalFortXTrans.g:4815:2: ( rule__DelimitedExpr__CondAssignment_3_1 )
            {
             before(grammarAccess.getDelimitedExprAccess().getCondAssignment_3_1()); 
            // InternalFortXTrans.g:4816:2: ( rule__DelimitedExpr__CondAssignment_3_1 )
            // InternalFortXTrans.g:4816:3: rule__DelimitedExpr__CondAssignment_3_1
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
    // InternalFortXTrans.g:4824:1: rule__DelimitedExpr__Group_3__2 : rule__DelimitedExpr__Group_3__2__Impl rule__DelimitedExpr__Group_3__3 ;
    public final void rule__DelimitedExpr__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4828:1: ( rule__DelimitedExpr__Group_3__2__Impl rule__DelimitedExpr__Group_3__3 )
            // InternalFortXTrans.g:4829:2: rule__DelimitedExpr__Group_3__2__Impl rule__DelimitedExpr__Group_3__3
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
    // InternalFortXTrans.g:4836:1: rule__DelimitedExpr__Group_3__2__Impl : ( 'then' ) ;
    public final void rule__DelimitedExpr__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4840:1: ( ( 'then' ) )
            // InternalFortXTrans.g:4841:1: ( 'then' )
            {
            // InternalFortXTrans.g:4841:1: ( 'then' )
            // InternalFortXTrans.g:4842:2: 'then'
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
    // InternalFortXTrans.g:4851:1: rule__DelimitedExpr__Group_3__3 : rule__DelimitedExpr__Group_3__3__Impl rule__DelimitedExpr__Group_3__4 ;
    public final void rule__DelimitedExpr__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4855:1: ( rule__DelimitedExpr__Group_3__3__Impl rule__DelimitedExpr__Group_3__4 )
            // InternalFortXTrans.g:4856:2: rule__DelimitedExpr__Group_3__3__Impl rule__DelimitedExpr__Group_3__4
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
    // InternalFortXTrans.g:4863:1: rule__DelimitedExpr__Group_3__3__Impl : ( ( rule__DelimitedExpr__BlockAssignment_3_3 ) ) ;
    public final void rule__DelimitedExpr__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4867:1: ( ( ( rule__DelimitedExpr__BlockAssignment_3_3 ) ) )
            // InternalFortXTrans.g:4868:1: ( ( rule__DelimitedExpr__BlockAssignment_3_3 ) )
            {
            // InternalFortXTrans.g:4868:1: ( ( rule__DelimitedExpr__BlockAssignment_3_3 ) )
            // InternalFortXTrans.g:4869:2: ( rule__DelimitedExpr__BlockAssignment_3_3 )
            {
             before(grammarAccess.getDelimitedExprAccess().getBlockAssignment_3_3()); 
            // InternalFortXTrans.g:4870:2: ( rule__DelimitedExpr__BlockAssignment_3_3 )
            // InternalFortXTrans.g:4870:3: rule__DelimitedExpr__BlockAssignment_3_3
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
    // InternalFortXTrans.g:4878:1: rule__DelimitedExpr__Group_3__4 : rule__DelimitedExpr__Group_3__4__Impl rule__DelimitedExpr__Group_3__5 ;
    public final void rule__DelimitedExpr__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4882:1: ( rule__DelimitedExpr__Group_3__4__Impl rule__DelimitedExpr__Group_3__5 )
            // InternalFortXTrans.g:4883:2: rule__DelimitedExpr__Group_3__4__Impl rule__DelimitedExpr__Group_3__5
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
    // InternalFortXTrans.g:4890:1: rule__DelimitedExpr__Group_3__4__Impl : ( ( rule__DelimitedExpr__ElifsAssignment_3_4 )? ) ;
    public final void rule__DelimitedExpr__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4894:1: ( ( ( rule__DelimitedExpr__ElifsAssignment_3_4 )? ) )
            // InternalFortXTrans.g:4895:1: ( ( rule__DelimitedExpr__ElifsAssignment_3_4 )? )
            {
            // InternalFortXTrans.g:4895:1: ( ( rule__DelimitedExpr__ElifsAssignment_3_4 )? )
            // InternalFortXTrans.g:4896:2: ( rule__DelimitedExpr__ElifsAssignment_3_4 )?
            {
             before(grammarAccess.getDelimitedExprAccess().getElifsAssignment_3_4()); 
            // InternalFortXTrans.g:4897:2: ( rule__DelimitedExpr__ElifsAssignment_3_4 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==31) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalFortXTrans.g:4897:3: rule__DelimitedExpr__ElifsAssignment_3_4
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
    // InternalFortXTrans.g:4905:1: rule__DelimitedExpr__Group_3__5 : rule__DelimitedExpr__Group_3__5__Impl rule__DelimitedExpr__Group_3__6 ;
    public final void rule__DelimitedExpr__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4909:1: ( rule__DelimitedExpr__Group_3__5__Impl rule__DelimitedExpr__Group_3__6 )
            // InternalFortXTrans.g:4910:2: rule__DelimitedExpr__Group_3__5__Impl rule__DelimitedExpr__Group_3__6
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
    // InternalFortXTrans.g:4917:1: rule__DelimitedExpr__Group_3__5__Impl : ( ( rule__DelimitedExpr__ElsAssignment_3_5 )? ) ;
    public final void rule__DelimitedExpr__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4921:1: ( ( ( rule__DelimitedExpr__ElsAssignment_3_5 )? ) )
            // InternalFortXTrans.g:4922:1: ( ( rule__DelimitedExpr__ElsAssignment_3_5 )? )
            {
            // InternalFortXTrans.g:4922:1: ( ( rule__DelimitedExpr__ElsAssignment_3_5 )? )
            // InternalFortXTrans.g:4923:2: ( rule__DelimitedExpr__ElsAssignment_3_5 )?
            {
             before(grammarAccess.getDelimitedExprAccess().getElsAssignment_3_5()); 
            // InternalFortXTrans.g:4924:2: ( rule__DelimitedExpr__ElsAssignment_3_5 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==32) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalFortXTrans.g:4924:3: rule__DelimitedExpr__ElsAssignment_3_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__DelimitedExpr__ElsAssignment_3_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDelimitedExprAccess().getElsAssignment_3_5()); 

            }


            }

        }
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
    // InternalFortXTrans.g:4932:1: rule__DelimitedExpr__Group_3__6 : rule__DelimitedExpr__Group_3__6__Impl ;
    public final void rule__DelimitedExpr__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4936:1: ( rule__DelimitedExpr__Group_3__6__Impl )
            // InternalFortXTrans.g:4937:2: rule__DelimitedExpr__Group_3__6__Impl
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
    // InternalFortXTrans.g:4943:1: rule__DelimitedExpr__Group_3__6__Impl : ( 'end' ) ;
    public final void rule__DelimitedExpr__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4947:1: ( ( 'end' ) )
            // InternalFortXTrans.g:4948:1: ( 'end' )
            {
            // InternalFortXTrans.g:4948:1: ( 'end' )
            // InternalFortXTrans.g:4949:2: 'end'
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
    // InternalFortXTrans.g:4959:1: rule__Elifs__Group__0 : rule__Elifs__Group__0__Impl rule__Elifs__Group__1 ;
    public final void rule__Elifs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4963:1: ( rule__Elifs__Group__0__Impl rule__Elifs__Group__1 )
            // InternalFortXTrans.g:4964:2: rule__Elifs__Group__0__Impl rule__Elifs__Group__1
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
    // InternalFortXTrans.g:4971:1: rule__Elifs__Group__0__Impl : ( ( rule__Elifs__EAssignment_0 ) ) ;
    public final void rule__Elifs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4975:1: ( ( ( rule__Elifs__EAssignment_0 ) ) )
            // InternalFortXTrans.g:4976:1: ( ( rule__Elifs__EAssignment_0 ) )
            {
            // InternalFortXTrans.g:4976:1: ( ( rule__Elifs__EAssignment_0 ) )
            // InternalFortXTrans.g:4977:2: ( rule__Elifs__EAssignment_0 )
            {
             before(grammarAccess.getElifsAccess().getEAssignment_0()); 
            // InternalFortXTrans.g:4978:2: ( rule__Elifs__EAssignment_0 )
            // InternalFortXTrans.g:4978:3: rule__Elifs__EAssignment_0
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
    // InternalFortXTrans.g:4986:1: rule__Elifs__Group__1 : rule__Elifs__Group__1__Impl ;
    public final void rule__Elifs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4990:1: ( rule__Elifs__Group__1__Impl )
            // InternalFortXTrans.g:4991:2: rule__Elifs__Group__1__Impl
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
    // InternalFortXTrans.g:4997:1: rule__Elifs__Group__1__Impl : ( ( rule__Elifs__EAssignment_1 )* ) ;
    public final void rule__Elifs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5001:1: ( ( ( rule__Elifs__EAssignment_1 )* ) )
            // InternalFortXTrans.g:5002:1: ( ( rule__Elifs__EAssignment_1 )* )
            {
            // InternalFortXTrans.g:5002:1: ( ( rule__Elifs__EAssignment_1 )* )
            // InternalFortXTrans.g:5003:2: ( rule__Elifs__EAssignment_1 )*
            {
             before(grammarAccess.getElifsAccess().getEAssignment_1()); 
            // InternalFortXTrans.g:5004:2: ( rule__Elifs__EAssignment_1 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==31) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalFortXTrans.g:5004:3: rule__Elifs__EAssignment_1
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Elifs__EAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalFortXTrans.g:5013:1: rule__Elif__Group__0 : rule__Elif__Group__0__Impl rule__Elif__Group__1 ;
    public final void rule__Elif__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5017:1: ( rule__Elif__Group__0__Impl rule__Elif__Group__1 )
            // InternalFortXTrans.g:5018:2: rule__Elif__Group__0__Impl rule__Elif__Group__1
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
    // InternalFortXTrans.g:5025:1: rule__Elif__Group__0__Impl : ( 'elif' ) ;
    public final void rule__Elif__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5029:1: ( ( 'elif' ) )
            // InternalFortXTrans.g:5030:1: ( 'elif' )
            {
            // InternalFortXTrans.g:5030:1: ( 'elif' )
            // InternalFortXTrans.g:5031:2: 'elif'
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
    // InternalFortXTrans.g:5040:1: rule__Elif__Group__1 : rule__Elif__Group__1__Impl rule__Elif__Group__2 ;
    public final void rule__Elif__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5044:1: ( rule__Elif__Group__1__Impl rule__Elif__Group__2 )
            // InternalFortXTrans.g:5045:2: rule__Elif__Group__1__Impl rule__Elif__Group__2
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
    // InternalFortXTrans.g:5052:1: rule__Elif__Group__1__Impl : ( ( rule__Elif__ExprAssignment_1 ) ) ;
    public final void rule__Elif__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5056:1: ( ( ( rule__Elif__ExprAssignment_1 ) ) )
            // InternalFortXTrans.g:5057:1: ( ( rule__Elif__ExprAssignment_1 ) )
            {
            // InternalFortXTrans.g:5057:1: ( ( rule__Elif__ExprAssignment_1 ) )
            // InternalFortXTrans.g:5058:2: ( rule__Elif__ExprAssignment_1 )
            {
             before(grammarAccess.getElifAccess().getExprAssignment_1()); 
            // InternalFortXTrans.g:5059:2: ( rule__Elif__ExprAssignment_1 )
            // InternalFortXTrans.g:5059:3: rule__Elif__ExprAssignment_1
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
    // InternalFortXTrans.g:5067:1: rule__Elif__Group__2 : rule__Elif__Group__2__Impl rule__Elif__Group__3 ;
    public final void rule__Elif__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5071:1: ( rule__Elif__Group__2__Impl rule__Elif__Group__3 )
            // InternalFortXTrans.g:5072:2: rule__Elif__Group__2__Impl rule__Elif__Group__3
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
    // InternalFortXTrans.g:5079:1: rule__Elif__Group__2__Impl : ( 'then' ) ;
    public final void rule__Elif__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5083:1: ( ( 'then' ) )
            // InternalFortXTrans.g:5084:1: ( 'then' )
            {
            // InternalFortXTrans.g:5084:1: ( 'then' )
            // InternalFortXTrans.g:5085:2: 'then'
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
    // InternalFortXTrans.g:5094:1: rule__Elif__Group__3 : rule__Elif__Group__3__Impl ;
    public final void rule__Elif__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5098:1: ( rule__Elif__Group__3__Impl )
            // InternalFortXTrans.g:5099:2: rule__Elif__Group__3__Impl
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
    // InternalFortXTrans.g:5105:1: rule__Elif__Group__3__Impl : ( ( rule__Elif__BlockAssignment_3 ) ) ;
    public final void rule__Elif__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5109:1: ( ( ( rule__Elif__BlockAssignment_3 ) ) )
            // InternalFortXTrans.g:5110:1: ( ( rule__Elif__BlockAssignment_3 ) )
            {
            // InternalFortXTrans.g:5110:1: ( ( rule__Elif__BlockAssignment_3 ) )
            // InternalFortXTrans.g:5111:2: ( rule__Elif__BlockAssignment_3 )
            {
             before(grammarAccess.getElifAccess().getBlockAssignment_3()); 
            // InternalFortXTrans.g:5112:2: ( rule__Elif__BlockAssignment_3 )
            // InternalFortXTrans.g:5112:3: rule__Elif__BlockAssignment_3
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
    // InternalFortXTrans.g:5121:1: rule__Else__Group__0 : rule__Else__Group__0__Impl rule__Else__Group__1 ;
    public final void rule__Else__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5125:1: ( rule__Else__Group__0__Impl rule__Else__Group__1 )
            // InternalFortXTrans.g:5126:2: rule__Else__Group__0__Impl rule__Else__Group__1
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
    // InternalFortXTrans.g:5133:1: rule__Else__Group__0__Impl : ( 'else' ) ;
    public final void rule__Else__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5137:1: ( ( 'else' ) )
            // InternalFortXTrans.g:5138:1: ( 'else' )
            {
            // InternalFortXTrans.g:5138:1: ( 'else' )
            // InternalFortXTrans.g:5139:2: 'else'
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
    // InternalFortXTrans.g:5148:1: rule__Else__Group__1 : rule__Else__Group__1__Impl ;
    public final void rule__Else__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5152:1: ( rule__Else__Group__1__Impl )
            // InternalFortXTrans.g:5153:2: rule__Else__Group__1__Impl
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
    // InternalFortXTrans.g:5159:1: rule__Else__Group__1__Impl : ( ( rule__Else__BlockAssignment_1 ) ) ;
    public final void rule__Else__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5163:1: ( ( ( rule__Else__BlockAssignment_1 ) ) )
            // InternalFortXTrans.g:5164:1: ( ( rule__Else__BlockAssignment_1 ) )
            {
            // InternalFortXTrans.g:5164:1: ( ( rule__Else__BlockAssignment_1 ) )
            // InternalFortXTrans.g:5165:2: ( rule__Else__BlockAssignment_1 )
            {
             before(grammarAccess.getElseAccess().getBlockAssignment_1()); 
            // InternalFortXTrans.g:5166:2: ( rule__Else__BlockAssignment_1 )
            // InternalFortXTrans.g:5166:3: rule__Else__BlockAssignment_1
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
    // InternalFortXTrans.g:5175:1: rule__Generators__Group__0 : rule__Generators__Group__0__Impl rule__Generators__Group__1 ;
    public final void rule__Generators__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5179:1: ( rule__Generators__Group__0__Impl rule__Generators__Group__1 )
            // InternalFortXTrans.g:5180:2: rule__Generators__Group__0__Impl rule__Generators__Group__1
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
    // InternalFortXTrans.g:5187:1: rule__Generators__Group__0__Impl : ( ( rule__Generators__BindingAssignment_0 ) ) ;
    public final void rule__Generators__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5191:1: ( ( ( rule__Generators__BindingAssignment_0 ) ) )
            // InternalFortXTrans.g:5192:1: ( ( rule__Generators__BindingAssignment_0 ) )
            {
            // InternalFortXTrans.g:5192:1: ( ( rule__Generators__BindingAssignment_0 ) )
            // InternalFortXTrans.g:5193:2: ( rule__Generators__BindingAssignment_0 )
            {
             before(grammarAccess.getGeneratorsAccess().getBindingAssignment_0()); 
            // InternalFortXTrans.g:5194:2: ( rule__Generators__BindingAssignment_0 )
            // InternalFortXTrans.g:5194:3: rule__Generators__BindingAssignment_0
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
    // InternalFortXTrans.g:5202:1: rule__Generators__Group__1 : rule__Generators__Group__1__Impl ;
    public final void rule__Generators__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5206:1: ( rule__Generators__Group__1__Impl )
            // InternalFortXTrans.g:5207:2: rule__Generators__Group__1__Impl
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
    // InternalFortXTrans.g:5213:1: rule__Generators__Group__1__Impl : ( ( rule__Generators__Group_1__0 )* ) ;
    public final void rule__Generators__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5217:1: ( ( ( rule__Generators__Group_1__0 )* ) )
            // InternalFortXTrans.g:5218:1: ( ( rule__Generators__Group_1__0 )* )
            {
            // InternalFortXTrans.g:5218:1: ( ( rule__Generators__Group_1__0 )* )
            // InternalFortXTrans.g:5219:2: ( rule__Generators__Group_1__0 )*
            {
             before(grammarAccess.getGeneratorsAccess().getGroup_1()); 
            // InternalFortXTrans.g:5220:2: ( rule__Generators__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==24) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalFortXTrans.g:5220:3: rule__Generators__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Generators__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalFortXTrans.g:5229:1: rule__Generators__Group_1__0 : rule__Generators__Group_1__0__Impl rule__Generators__Group_1__1 ;
    public final void rule__Generators__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5233:1: ( rule__Generators__Group_1__0__Impl rule__Generators__Group_1__1 )
            // InternalFortXTrans.g:5234:2: rule__Generators__Group_1__0__Impl rule__Generators__Group_1__1
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
    // InternalFortXTrans.g:5241:1: rule__Generators__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Generators__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5245:1: ( ( ',' ) )
            // InternalFortXTrans.g:5246:1: ( ',' )
            {
            // InternalFortXTrans.g:5246:1: ( ',' )
            // InternalFortXTrans.g:5247:2: ','
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
    // InternalFortXTrans.g:5256:1: rule__Generators__Group_1__1 : rule__Generators__Group_1__1__Impl ;
    public final void rule__Generators__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5260:1: ( rule__Generators__Group_1__1__Impl )
            // InternalFortXTrans.g:5261:2: rule__Generators__Group_1__1__Impl
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
    // InternalFortXTrans.g:5267:1: rule__Generators__Group_1__1__Impl : ( ( rule__Generators__ClauseAssignment_1_1 ) ) ;
    public final void rule__Generators__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5271:1: ( ( ( rule__Generators__ClauseAssignment_1_1 ) ) )
            // InternalFortXTrans.g:5272:1: ( ( rule__Generators__ClauseAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:5272:1: ( ( rule__Generators__ClauseAssignment_1_1 ) )
            // InternalFortXTrans.g:5273:2: ( rule__Generators__ClauseAssignment_1_1 )
            {
             before(grammarAccess.getGeneratorsAccess().getClauseAssignment_1_1()); 
            // InternalFortXTrans.g:5274:2: ( rule__Generators__ClauseAssignment_1_1 )
            // InternalFortXTrans.g:5274:3: rule__Generators__ClauseAssignment_1_1
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


    // $ANTLR start "rule__Binding__Group_0__0"
    // InternalFortXTrans.g:5283:1: rule__Binding__Group_0__0 : rule__Binding__Group_0__0__Impl rule__Binding__Group_0__1 ;
    public final void rule__Binding__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5287:1: ( rule__Binding__Group_0__0__Impl rule__Binding__Group_0__1 )
            // InternalFortXTrans.g:5288:2: rule__Binding__Group_0__0__Impl rule__Binding__Group_0__1
            {
            pushFollow(FOLLOW_41);
            rule__Binding__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group_0__1();

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
    // $ANTLR end "rule__Binding__Group_0__0"


    // $ANTLR start "rule__Binding__Group_0__0__Impl"
    // InternalFortXTrans.g:5295:1: rule__Binding__Group_0__0__Impl : ( ( rule__Binding__IdtupAssignment_0_0 ) ) ;
    public final void rule__Binding__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5299:1: ( ( ( rule__Binding__IdtupAssignment_0_0 ) ) )
            // InternalFortXTrans.g:5300:1: ( ( rule__Binding__IdtupAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:5300:1: ( ( rule__Binding__IdtupAssignment_0_0 ) )
            // InternalFortXTrans.g:5301:2: ( rule__Binding__IdtupAssignment_0_0 )
            {
             before(grammarAccess.getBindingAccess().getIdtupAssignment_0_0()); 
            // InternalFortXTrans.g:5302:2: ( rule__Binding__IdtupAssignment_0_0 )
            // InternalFortXTrans.g:5302:3: rule__Binding__IdtupAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__IdtupAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getIdtupAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group_0__0__Impl"


    // $ANTLR start "rule__Binding__Group_0__1"
    // InternalFortXTrans.g:5310:1: rule__Binding__Group_0__1 : rule__Binding__Group_0__1__Impl rule__Binding__Group_0__2 ;
    public final void rule__Binding__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5314:1: ( rule__Binding__Group_0__1__Impl rule__Binding__Group_0__2 )
            // InternalFortXTrans.g:5315:2: rule__Binding__Group_0__1__Impl rule__Binding__Group_0__2
            {
            pushFollow(FOLLOW_32);
            rule__Binding__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group_0__2();

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
    // $ANTLR end "rule__Binding__Group_0__1"


    // $ANTLR start "rule__Binding__Group_0__1__Impl"
    // InternalFortXTrans.g:5322:1: rule__Binding__Group_0__1__Impl : ( '<-' ) ;
    public final void rule__Binding__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5326:1: ( ( '<-' ) )
            // InternalFortXTrans.g:5327:1: ( '<-' )
            {
            // InternalFortXTrans.g:5327:1: ( '<-' )
            // InternalFortXTrans.g:5328:2: '<-'
            {
             before(grammarAccess.getBindingAccess().getLessThanSignHyphenMinusKeyword_0_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getLessThanSignHyphenMinusKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group_0__1__Impl"


    // $ANTLR start "rule__Binding__Group_0__2"
    // InternalFortXTrans.g:5337:1: rule__Binding__Group_0__2 : rule__Binding__Group_0__2__Impl ;
    public final void rule__Binding__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5341:1: ( rule__Binding__Group_0__2__Impl )
            // InternalFortXTrans.g:5342:2: rule__Binding__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group_0__2__Impl();

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
    // $ANTLR end "rule__Binding__Group_0__2"


    // $ANTLR start "rule__Binding__Group_0__2__Impl"
    // InternalFortXTrans.g:5348:1: rule__Binding__Group_0__2__Impl : ( ( rule__Binding__ExprAssignment_0_2 ) ) ;
    public final void rule__Binding__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5352:1: ( ( ( rule__Binding__ExprAssignment_0_2 ) ) )
            // InternalFortXTrans.g:5353:1: ( ( rule__Binding__ExprAssignment_0_2 ) )
            {
            // InternalFortXTrans.g:5353:1: ( ( rule__Binding__ExprAssignment_0_2 ) )
            // InternalFortXTrans.g:5354:2: ( rule__Binding__ExprAssignment_0_2 )
            {
             before(grammarAccess.getBindingAccess().getExprAssignment_0_2()); 
            // InternalFortXTrans.g:5355:2: ( rule__Binding__ExprAssignment_0_2 )
            // InternalFortXTrans.g:5355:3: rule__Binding__ExprAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Binding__ExprAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getExprAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group_0__2__Impl"


    // $ANTLR start "rule__Binding__Group_1__0"
    // InternalFortXTrans.g:5364:1: rule__Binding__Group_1__0 : rule__Binding__Group_1__0__Impl rule__Binding__Group_1__1 ;
    public final void rule__Binding__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5368:1: ( rule__Binding__Group_1__0__Impl rule__Binding__Group_1__1 )
            // InternalFortXTrans.g:5369:2: rule__Binding__Group_1__0__Impl rule__Binding__Group_1__1
            {
            pushFollow(FOLLOW_41);
            rule__Binding__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group_1__1();

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
    // $ANTLR end "rule__Binding__Group_1__0"


    // $ANTLR start "rule__Binding__Group_1__0__Impl"
    // InternalFortXTrans.g:5376:1: rule__Binding__Group_1__0__Impl : ( ( rule__Binding__IdtupAssignment_1_0 ) ) ;
    public final void rule__Binding__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5380:1: ( ( ( rule__Binding__IdtupAssignment_1_0 ) ) )
            // InternalFortXTrans.g:5381:1: ( ( rule__Binding__IdtupAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:5381:1: ( ( rule__Binding__IdtupAssignment_1_0 ) )
            // InternalFortXTrans.g:5382:2: ( rule__Binding__IdtupAssignment_1_0 )
            {
             before(grammarAccess.getBindingAccess().getIdtupAssignment_1_0()); 
            // InternalFortXTrans.g:5383:2: ( rule__Binding__IdtupAssignment_1_0 )
            // InternalFortXTrans.g:5383:3: rule__Binding__IdtupAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__IdtupAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getIdtupAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group_1__0__Impl"


    // $ANTLR start "rule__Binding__Group_1__1"
    // InternalFortXTrans.g:5391:1: rule__Binding__Group_1__1 : rule__Binding__Group_1__1__Impl rule__Binding__Group_1__2 ;
    public final void rule__Binding__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5395:1: ( rule__Binding__Group_1__1__Impl rule__Binding__Group_1__2 )
            // InternalFortXTrans.g:5396:2: rule__Binding__Group_1__1__Impl rule__Binding__Group_1__2
            {
            pushFollow(FOLLOW_42);
            rule__Binding__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group_1__2();

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
    // $ANTLR end "rule__Binding__Group_1__1"


    // $ANTLR start "rule__Binding__Group_1__1__Impl"
    // InternalFortXTrans.g:5403:1: rule__Binding__Group_1__1__Impl : ( '<-' ) ;
    public final void rule__Binding__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5407:1: ( ( '<-' ) )
            // InternalFortXTrans.g:5408:1: ( '<-' )
            {
            // InternalFortXTrans.g:5408:1: ( '<-' )
            // InternalFortXTrans.g:5409:2: '<-'
            {
             before(grammarAccess.getBindingAccess().getLessThanSignHyphenMinusKeyword_1_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getLessThanSignHyphenMinusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group_1__1__Impl"


    // $ANTLR start "rule__Binding__Group_1__2"
    // InternalFortXTrans.g:5418:1: rule__Binding__Group_1__2 : rule__Binding__Group_1__2__Impl rule__Binding__Group_1__3 ;
    public final void rule__Binding__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5422:1: ( rule__Binding__Group_1__2__Impl rule__Binding__Group_1__3 )
            // InternalFortXTrans.g:5423:2: rule__Binding__Group_1__2__Impl rule__Binding__Group_1__3
            {
            pushFollow(FOLLOW_27);
            rule__Binding__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group_1__3();

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
    // $ANTLR end "rule__Binding__Group_1__2"


    // $ANTLR start "rule__Binding__Group_1__2__Impl"
    // InternalFortXTrans.g:5430:1: rule__Binding__Group_1__2__Impl : ( ( rule__Binding__SeqAssignment_1_2 ) ) ;
    public final void rule__Binding__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5434:1: ( ( ( rule__Binding__SeqAssignment_1_2 ) ) )
            // InternalFortXTrans.g:5435:1: ( ( rule__Binding__SeqAssignment_1_2 ) )
            {
            // InternalFortXTrans.g:5435:1: ( ( rule__Binding__SeqAssignment_1_2 ) )
            // InternalFortXTrans.g:5436:2: ( rule__Binding__SeqAssignment_1_2 )
            {
             before(grammarAccess.getBindingAccess().getSeqAssignment_1_2()); 
            // InternalFortXTrans.g:5437:2: ( rule__Binding__SeqAssignment_1_2 )
            // InternalFortXTrans.g:5437:3: rule__Binding__SeqAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Binding__SeqAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getSeqAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group_1__2__Impl"


    // $ANTLR start "rule__Binding__Group_1__3"
    // InternalFortXTrans.g:5445:1: rule__Binding__Group_1__3 : rule__Binding__Group_1__3__Impl rule__Binding__Group_1__4 ;
    public final void rule__Binding__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5449:1: ( rule__Binding__Group_1__3__Impl rule__Binding__Group_1__4 )
            // InternalFortXTrans.g:5450:2: rule__Binding__Group_1__3__Impl rule__Binding__Group_1__4
            {
            pushFollow(FOLLOW_32);
            rule__Binding__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group_1__4();

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
    // $ANTLR end "rule__Binding__Group_1__3"


    // $ANTLR start "rule__Binding__Group_1__3__Impl"
    // InternalFortXTrans.g:5457:1: rule__Binding__Group_1__3__Impl : ( '(' ) ;
    public final void rule__Binding__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5461:1: ( ( '(' ) )
            // InternalFortXTrans.g:5462:1: ( '(' )
            {
            // InternalFortXTrans.g:5462:1: ( '(' )
            // InternalFortXTrans.g:5463:2: '('
            {
             before(grammarAccess.getBindingAccess().getLeftParenthesisKeyword_1_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getLeftParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group_1__3__Impl"


    // $ANTLR start "rule__Binding__Group_1__4"
    // InternalFortXTrans.g:5472:1: rule__Binding__Group_1__4 : rule__Binding__Group_1__4__Impl rule__Binding__Group_1__5 ;
    public final void rule__Binding__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5476:1: ( rule__Binding__Group_1__4__Impl rule__Binding__Group_1__5 )
            // InternalFortXTrans.g:5477:2: rule__Binding__Group_1__4__Impl rule__Binding__Group_1__5
            {
            pushFollow(FOLLOW_28);
            rule__Binding__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group_1__5();

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
    // $ANTLR end "rule__Binding__Group_1__4"


    // $ANTLR start "rule__Binding__Group_1__4__Impl"
    // InternalFortXTrans.g:5484:1: rule__Binding__Group_1__4__Impl : ( ( rule__Binding__ExprAssignment_1_4 ) ) ;
    public final void rule__Binding__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5488:1: ( ( ( rule__Binding__ExprAssignment_1_4 ) ) )
            // InternalFortXTrans.g:5489:1: ( ( rule__Binding__ExprAssignment_1_4 ) )
            {
            // InternalFortXTrans.g:5489:1: ( ( rule__Binding__ExprAssignment_1_4 ) )
            // InternalFortXTrans.g:5490:2: ( rule__Binding__ExprAssignment_1_4 )
            {
             before(grammarAccess.getBindingAccess().getExprAssignment_1_4()); 
            // InternalFortXTrans.g:5491:2: ( rule__Binding__ExprAssignment_1_4 )
            // InternalFortXTrans.g:5491:3: rule__Binding__ExprAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Binding__ExprAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getExprAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group_1__4__Impl"


    // $ANTLR start "rule__Binding__Group_1__5"
    // InternalFortXTrans.g:5499:1: rule__Binding__Group_1__5 : rule__Binding__Group_1__5__Impl ;
    public final void rule__Binding__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5503:1: ( rule__Binding__Group_1__5__Impl )
            // InternalFortXTrans.g:5504:2: rule__Binding__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group_1__5__Impl();

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
    // $ANTLR end "rule__Binding__Group_1__5"


    // $ANTLR start "rule__Binding__Group_1__5__Impl"
    // InternalFortXTrans.g:5510:1: rule__Binding__Group_1__5__Impl : ( ')' ) ;
    public final void rule__Binding__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5514:1: ( ( ')' ) )
            // InternalFortXTrans.g:5515:1: ( ')' )
            {
            // InternalFortXTrans.g:5515:1: ( ')' )
            // InternalFortXTrans.g:5516:2: ')'
            {
             before(grammarAccess.getBindingAccess().getRightParenthesisKeyword_1_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getRightParenthesisKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group_1__5__Impl"


    // $ANTLR start "rule__BlockElems__Group__0"
    // InternalFortXTrans.g:5526:1: rule__BlockElems__Group__0 : rule__BlockElems__Group__0__Impl rule__BlockElems__Group__1 ;
    public final void rule__BlockElems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5530:1: ( rule__BlockElems__Group__0__Impl rule__BlockElems__Group__1 )
            // InternalFortXTrans.g:5531:2: rule__BlockElems__Group__0__Impl rule__BlockElems__Group__1
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
    // InternalFortXTrans.g:5538:1: rule__BlockElems__Group__0__Impl : ( ( rule__BlockElems__BlockAssignment_0 ) ) ;
    public final void rule__BlockElems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5542:1: ( ( ( rule__BlockElems__BlockAssignment_0 ) ) )
            // InternalFortXTrans.g:5543:1: ( ( rule__BlockElems__BlockAssignment_0 ) )
            {
            // InternalFortXTrans.g:5543:1: ( ( rule__BlockElems__BlockAssignment_0 ) )
            // InternalFortXTrans.g:5544:2: ( rule__BlockElems__BlockAssignment_0 )
            {
             before(grammarAccess.getBlockElemsAccess().getBlockAssignment_0()); 
            // InternalFortXTrans.g:5545:2: ( rule__BlockElems__BlockAssignment_0 )
            // InternalFortXTrans.g:5545:3: rule__BlockElems__BlockAssignment_0
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
    // InternalFortXTrans.g:5553:1: rule__BlockElems__Group__1 : rule__BlockElems__Group__1__Impl ;
    public final void rule__BlockElems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5557:1: ( rule__BlockElems__Group__1__Impl )
            // InternalFortXTrans.g:5558:2: rule__BlockElems__Group__1__Impl
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
    // InternalFortXTrans.g:5564:1: rule__BlockElems__Group__1__Impl : ( ( rule__BlockElems__BlockAssignment_1 )* ) ;
    public final void rule__BlockElems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5568:1: ( ( ( rule__BlockElems__BlockAssignment_1 )* ) )
            // InternalFortXTrans.g:5569:1: ( ( rule__BlockElems__BlockAssignment_1 )* )
            {
            // InternalFortXTrans.g:5569:1: ( ( rule__BlockElems__BlockAssignment_1 )* )
            // InternalFortXTrans.g:5570:2: ( rule__BlockElems__BlockAssignment_1 )*
            {
             before(grammarAccess.getBlockElemsAccess().getBlockAssignment_1()); 
            // InternalFortXTrans.g:5571:2: ( rule__BlockElems__BlockAssignment_1 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID||LA47_0==34||LA47_0==36||LA47_0==42||(LA47_0>=45 && LA47_0<=47)||LA47_0==49) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalFortXTrans.g:5571:3: rule__BlockElems__BlockAssignment_1
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__BlockElems__BlockAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalFortXTrans.g:5580:1: rule__Paranthesized__Group__0 : rule__Paranthesized__Group__0__Impl rule__Paranthesized__Group__1 ;
    public final void rule__Paranthesized__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5584:1: ( rule__Paranthesized__Group__0__Impl rule__Paranthesized__Group__1 )
            // InternalFortXTrans.g:5585:2: rule__Paranthesized__Group__0__Impl rule__Paranthesized__Group__1
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
    // InternalFortXTrans.g:5592:1: rule__Paranthesized__Group__0__Impl : ( '(' ) ;
    public final void rule__Paranthesized__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5596:1: ( ( '(' ) )
            // InternalFortXTrans.g:5597:1: ( '(' )
            {
            // InternalFortXTrans.g:5597:1: ( '(' )
            // InternalFortXTrans.g:5598:2: '('
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
    // InternalFortXTrans.g:5607:1: rule__Paranthesized__Group__1 : rule__Paranthesized__Group__1__Impl rule__Paranthesized__Group__2 ;
    public final void rule__Paranthesized__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5611:1: ( rule__Paranthesized__Group__1__Impl rule__Paranthesized__Group__2 )
            // InternalFortXTrans.g:5612:2: rule__Paranthesized__Group__1__Impl rule__Paranthesized__Group__2
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
    // InternalFortXTrans.g:5619:1: rule__Paranthesized__Group__1__Impl : ( ( rule__Paranthesized__ExprAssignment_1 ) ) ;
    public final void rule__Paranthesized__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5623:1: ( ( ( rule__Paranthesized__ExprAssignment_1 ) ) )
            // InternalFortXTrans.g:5624:1: ( ( rule__Paranthesized__ExprAssignment_1 ) )
            {
            // InternalFortXTrans.g:5624:1: ( ( rule__Paranthesized__ExprAssignment_1 ) )
            // InternalFortXTrans.g:5625:2: ( rule__Paranthesized__ExprAssignment_1 )
            {
             before(grammarAccess.getParanthesizedAccess().getExprAssignment_1()); 
            // InternalFortXTrans.g:5626:2: ( rule__Paranthesized__ExprAssignment_1 )
            // InternalFortXTrans.g:5626:3: rule__Paranthesized__ExprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Paranthesized__ExprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParanthesizedAccess().getExprAssignment_1()); 

            }


            }

        }
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
    // InternalFortXTrans.g:5634:1: rule__Paranthesized__Group__2 : rule__Paranthesized__Group__2__Impl ;
    public final void rule__Paranthesized__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5638:1: ( rule__Paranthesized__Group__2__Impl )
            // InternalFortXTrans.g:5639:2: rule__Paranthesized__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paranthesized__Group__2__Impl();

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
    // InternalFortXTrans.g:5645:1: rule__Paranthesized__Group__2__Impl : ( ')' ) ;
    public final void rule__Paranthesized__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5649:1: ( ( ')' ) )
            // InternalFortXTrans.g:5650:1: ( ')' )
            {
            // InternalFortXTrans.g:5650:1: ( ')' )
            // InternalFortXTrans.g:5651:2: ')'
            {
             before(grammarAccess.getParanthesizedAccess().getRightParenthesisKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getParanthesizedAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paranthesized__Group__2__Impl"


    // $ANTLR start "rule__Do__Group__0"
    // InternalFortXTrans.g:5661:1: rule__Do__Group__0 : rule__Do__Group__0__Impl rule__Do__Group__1 ;
    public final void rule__Do__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5665:1: ( rule__Do__Group__0__Impl rule__Do__Group__1 )
            // InternalFortXTrans.g:5666:2: rule__Do__Group__0__Impl rule__Do__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalFortXTrans.g:5673:1: rule__Do__Group__0__Impl : ( ( rule__Do__DofsAssignment_0 ) ) ;
    public final void rule__Do__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5677:1: ( ( ( rule__Do__DofsAssignment_0 ) ) )
            // InternalFortXTrans.g:5678:1: ( ( rule__Do__DofsAssignment_0 ) )
            {
            // InternalFortXTrans.g:5678:1: ( ( rule__Do__DofsAssignment_0 ) )
            // InternalFortXTrans.g:5679:2: ( rule__Do__DofsAssignment_0 )
            {
             before(grammarAccess.getDoAccess().getDofsAssignment_0()); 
            // InternalFortXTrans.g:5680:2: ( rule__Do__DofsAssignment_0 )
            // InternalFortXTrans.g:5680:3: rule__Do__DofsAssignment_0
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
    // InternalFortXTrans.g:5688:1: rule__Do__Group__1 : rule__Do__Group__1__Impl rule__Do__Group__2 ;
    public final void rule__Do__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5692:1: ( rule__Do__Group__1__Impl rule__Do__Group__2 )
            // InternalFortXTrans.g:5693:2: rule__Do__Group__1__Impl rule__Do__Group__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalFortXTrans.g:5700:1: rule__Do__Group__1__Impl : ( ( rule__Do__Group_1__0 )* ) ;
    public final void rule__Do__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5704:1: ( ( ( rule__Do__Group_1__0 )* ) )
            // InternalFortXTrans.g:5705:1: ( ( rule__Do__Group_1__0 )* )
            {
            // InternalFortXTrans.g:5705:1: ( ( rule__Do__Group_1__0 )* )
            // InternalFortXTrans.g:5706:2: ( rule__Do__Group_1__0 )*
            {
             before(grammarAccess.getDoAccess().getGroup_1()); 
            // InternalFortXTrans.g:5707:2: ( rule__Do__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==35) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalFortXTrans.g:5707:3: rule__Do__Group_1__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__Do__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalFortXTrans.g:5715:1: rule__Do__Group__2 : rule__Do__Group__2__Impl ;
    public final void rule__Do__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5719:1: ( rule__Do__Group__2__Impl )
            // InternalFortXTrans.g:5720:2: rule__Do__Group__2__Impl
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
    // InternalFortXTrans.g:5726:1: rule__Do__Group__2__Impl : ( 'end' ) ;
    public final void rule__Do__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5730:1: ( ( 'end' ) )
            // InternalFortXTrans.g:5731:1: ( 'end' )
            {
            // InternalFortXTrans.g:5731:1: ( 'end' )
            // InternalFortXTrans.g:5732:2: 'end'
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
    // InternalFortXTrans.g:5742:1: rule__Do__Group_1__0 : rule__Do__Group_1__0__Impl rule__Do__Group_1__1 ;
    public final void rule__Do__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5746:1: ( rule__Do__Group_1__0__Impl rule__Do__Group_1__1 )
            // InternalFortXTrans.g:5747:2: rule__Do__Group_1__0__Impl rule__Do__Group_1__1
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
    // InternalFortXTrans.g:5754:1: rule__Do__Group_1__0__Impl : ( 'also' ) ;
    public final void rule__Do__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5758:1: ( ( 'also' ) )
            // InternalFortXTrans.g:5759:1: ( 'also' )
            {
            // InternalFortXTrans.g:5759:1: ( 'also' )
            // InternalFortXTrans.g:5760:2: 'also'
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
    // InternalFortXTrans.g:5769:1: rule__Do__Group_1__1 : rule__Do__Group_1__1__Impl ;
    public final void rule__Do__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5773:1: ( rule__Do__Group_1__1__Impl )
            // InternalFortXTrans.g:5774:2: rule__Do__Group_1__1__Impl
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
    // InternalFortXTrans.g:5780:1: rule__Do__Group_1__1__Impl : ( ( rule__Do__DofsAssignment_1_1 ) ) ;
    public final void rule__Do__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5784:1: ( ( ( rule__Do__DofsAssignment_1_1 ) ) )
            // InternalFortXTrans.g:5785:1: ( ( rule__Do__DofsAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:5785:1: ( ( rule__Do__DofsAssignment_1_1 ) )
            // InternalFortXTrans.g:5786:2: ( rule__Do__DofsAssignment_1_1 )
            {
             before(grammarAccess.getDoAccess().getDofsAssignment_1_1()); 
            // InternalFortXTrans.g:5787:2: ( rule__Do__DofsAssignment_1_1 )
            // InternalFortXTrans.g:5787:3: rule__Do__DofsAssignment_1_1
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
    // InternalFortXTrans.g:5796:1: rule__DoFront__Group__0 : rule__DoFront__Group__0__Impl rule__DoFront__Group__1 ;
    public final void rule__DoFront__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5800:1: ( rule__DoFront__Group__0__Impl rule__DoFront__Group__1 )
            // InternalFortXTrans.g:5801:2: rule__DoFront__Group__0__Impl rule__DoFront__Group__1
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
    // InternalFortXTrans.g:5808:1: rule__DoFront__Group__0__Impl : ( ( rule__DoFront__Group_0__0 )? ) ;
    public final void rule__DoFront__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5812:1: ( ( ( rule__DoFront__Group_0__0 )? ) )
            // InternalFortXTrans.g:5813:1: ( ( rule__DoFront__Group_0__0 )? )
            {
            // InternalFortXTrans.g:5813:1: ( ( rule__DoFront__Group_0__0 )? )
            // InternalFortXTrans.g:5814:2: ( rule__DoFront__Group_0__0 )?
            {
             before(grammarAccess.getDoFrontAccess().getGroup_0()); 
            // InternalFortXTrans.g:5815:2: ( rule__DoFront__Group_0__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==49) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalFortXTrans.g:5815:3: rule__DoFront__Group_0__0
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
    // InternalFortXTrans.g:5823:1: rule__DoFront__Group__1 : rule__DoFront__Group__1__Impl rule__DoFront__Group__2 ;
    public final void rule__DoFront__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5827:1: ( rule__DoFront__Group__1__Impl rule__DoFront__Group__2 )
            // InternalFortXTrans.g:5828:2: rule__DoFront__Group__1__Impl rule__DoFront__Group__2
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
    // InternalFortXTrans.g:5835:1: rule__DoFront__Group__1__Impl : ( ( rule__DoFront__AtomAssignment_1 )? ) ;
    public final void rule__DoFront__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5839:1: ( ( ( rule__DoFront__AtomAssignment_1 )? ) )
            // InternalFortXTrans.g:5840:1: ( ( rule__DoFront__AtomAssignment_1 )? )
            {
            // InternalFortXTrans.g:5840:1: ( ( rule__DoFront__AtomAssignment_1 )? )
            // InternalFortXTrans.g:5841:2: ( rule__DoFront__AtomAssignment_1 )?
            {
             before(grammarAccess.getDoFrontAccess().getAtomAssignment_1()); 
            // InternalFortXTrans.g:5842:2: ( rule__DoFront__AtomAssignment_1 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==42) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalFortXTrans.g:5842:3: rule__DoFront__AtomAssignment_1
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
    // InternalFortXTrans.g:5850:1: rule__DoFront__Group__2 : rule__DoFront__Group__2__Impl rule__DoFront__Group__3 ;
    public final void rule__DoFront__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5854:1: ( rule__DoFront__Group__2__Impl rule__DoFront__Group__3 )
            // InternalFortXTrans.g:5855:2: rule__DoFront__Group__2__Impl rule__DoFront__Group__3
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
    // InternalFortXTrans.g:5862:1: rule__DoFront__Group__2__Impl : ( 'do' ) ;
    public final void rule__DoFront__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5866:1: ( ( 'do' ) )
            // InternalFortXTrans.g:5867:1: ( 'do' )
            {
            // InternalFortXTrans.g:5867:1: ( 'do' )
            // InternalFortXTrans.g:5868:2: 'do'
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
    // InternalFortXTrans.g:5877:1: rule__DoFront__Group__3 : rule__DoFront__Group__3__Impl ;
    public final void rule__DoFront__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5881:1: ( rule__DoFront__Group__3__Impl )
            // InternalFortXTrans.g:5882:2: rule__DoFront__Group__3__Impl
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
    // InternalFortXTrans.g:5888:1: rule__DoFront__Group__3__Impl : ( ( rule__DoFront__BlockAssignment_3 ) ) ;
    public final void rule__DoFront__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5892:1: ( ( ( rule__DoFront__BlockAssignment_3 ) ) )
            // InternalFortXTrans.g:5893:1: ( ( rule__DoFront__BlockAssignment_3 ) )
            {
            // InternalFortXTrans.g:5893:1: ( ( rule__DoFront__BlockAssignment_3 ) )
            // InternalFortXTrans.g:5894:2: ( rule__DoFront__BlockAssignment_3 )
            {
             before(grammarAccess.getDoFrontAccess().getBlockAssignment_3()); 
            // InternalFortXTrans.g:5895:2: ( rule__DoFront__BlockAssignment_3 )
            // InternalFortXTrans.g:5895:3: rule__DoFront__BlockAssignment_3
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
    // InternalFortXTrans.g:5904:1: rule__DoFront__Group_0__0 : rule__DoFront__Group_0__0__Impl rule__DoFront__Group_0__1 ;
    public final void rule__DoFront__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5908:1: ( rule__DoFront__Group_0__0__Impl rule__DoFront__Group_0__1 )
            // InternalFortXTrans.g:5909:2: rule__DoFront__Group_0__0__Impl rule__DoFront__Group_0__1
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
    // InternalFortXTrans.g:5916:1: rule__DoFront__Group_0__0__Impl : ( ( rule__DoFront__AtAssignment_0_0 ) ) ;
    public final void rule__DoFront__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5920:1: ( ( ( rule__DoFront__AtAssignment_0_0 ) ) )
            // InternalFortXTrans.g:5921:1: ( ( rule__DoFront__AtAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:5921:1: ( ( rule__DoFront__AtAssignment_0_0 ) )
            // InternalFortXTrans.g:5922:2: ( rule__DoFront__AtAssignment_0_0 )
            {
             before(grammarAccess.getDoFrontAccess().getAtAssignment_0_0()); 
            // InternalFortXTrans.g:5923:2: ( rule__DoFront__AtAssignment_0_0 )
            // InternalFortXTrans.g:5923:3: rule__DoFront__AtAssignment_0_0
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
    // InternalFortXTrans.g:5931:1: rule__DoFront__Group_0__1 : rule__DoFront__Group_0__1__Impl ;
    public final void rule__DoFront__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5935:1: ( rule__DoFront__Group_0__1__Impl )
            // InternalFortXTrans.g:5936:2: rule__DoFront__Group_0__1__Impl
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
    // InternalFortXTrans.g:5942:1: rule__DoFront__Group_0__1__Impl : ( ( rule__DoFront__ExpAssignment_0_1 ) ) ;
    public final void rule__DoFront__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5946:1: ( ( ( rule__DoFront__ExpAssignment_0_1 ) ) )
            // InternalFortXTrans.g:5947:1: ( ( rule__DoFront__ExpAssignment_0_1 ) )
            {
            // InternalFortXTrans.g:5947:1: ( ( rule__DoFront__ExpAssignment_0_1 ) )
            // InternalFortXTrans.g:5948:2: ( rule__DoFront__ExpAssignment_0_1 )
            {
             before(grammarAccess.getDoFrontAccess().getExpAssignment_0_1()); 
            // InternalFortXTrans.g:5949:2: ( rule__DoFront__ExpAssignment_0_1 )
            // InternalFortXTrans.g:5949:3: rule__DoFront__ExpAssignment_0_1
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
    // InternalFortXTrans.g:5958:1: rule__IdOrTuple__Group_1__0 : rule__IdOrTuple__Group_1__0__Impl rule__IdOrTuple__Group_1__1 ;
    public final void rule__IdOrTuple__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5962:1: ( rule__IdOrTuple__Group_1__0__Impl rule__IdOrTuple__Group_1__1 )
            // InternalFortXTrans.g:5963:2: rule__IdOrTuple__Group_1__0__Impl rule__IdOrTuple__Group_1__1
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
    // InternalFortXTrans.g:5970:1: rule__IdOrTuple__Group_1__0__Impl : ( '(' ) ;
    public final void rule__IdOrTuple__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5974:1: ( ( '(' ) )
            // InternalFortXTrans.g:5975:1: ( '(' )
            {
            // InternalFortXTrans.g:5975:1: ( '(' )
            // InternalFortXTrans.g:5976:2: '('
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
    // InternalFortXTrans.g:5985:1: rule__IdOrTuple__Group_1__1 : rule__IdOrTuple__Group_1__1__Impl rule__IdOrTuple__Group_1__2 ;
    public final void rule__IdOrTuple__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5989:1: ( rule__IdOrTuple__Group_1__1__Impl rule__IdOrTuple__Group_1__2 )
            // InternalFortXTrans.g:5990:2: rule__IdOrTuple__Group_1__1__Impl rule__IdOrTuple__Group_1__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalFortXTrans.g:5997:1: rule__IdOrTuple__Group_1__1__Impl : ( ( rule__IdOrTuple__BidAssignment_1_1 ) ) ;
    public final void rule__IdOrTuple__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6001:1: ( ( ( rule__IdOrTuple__BidAssignment_1_1 ) ) )
            // InternalFortXTrans.g:6002:1: ( ( rule__IdOrTuple__BidAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:6002:1: ( ( rule__IdOrTuple__BidAssignment_1_1 ) )
            // InternalFortXTrans.g:6003:2: ( rule__IdOrTuple__BidAssignment_1_1 )
            {
             before(grammarAccess.getIdOrTupleAccess().getBidAssignment_1_1()); 
            // InternalFortXTrans.g:6004:2: ( rule__IdOrTuple__BidAssignment_1_1 )
            // InternalFortXTrans.g:6004:3: rule__IdOrTuple__BidAssignment_1_1
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
    // InternalFortXTrans.g:6012:1: rule__IdOrTuple__Group_1__2 : rule__IdOrTuple__Group_1__2__Impl rule__IdOrTuple__Group_1__3 ;
    public final void rule__IdOrTuple__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6016:1: ( rule__IdOrTuple__Group_1__2__Impl rule__IdOrTuple__Group_1__3 )
            // InternalFortXTrans.g:6017:2: rule__IdOrTuple__Group_1__2__Impl rule__IdOrTuple__Group_1__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalFortXTrans.g:6024:1: rule__IdOrTuple__Group_1__2__Impl : ( ( rule__IdOrTuple__Group_1_2__0 )* ) ;
    public final void rule__IdOrTuple__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6028:1: ( ( ( rule__IdOrTuple__Group_1_2__0 )* ) )
            // InternalFortXTrans.g:6029:1: ( ( rule__IdOrTuple__Group_1_2__0 )* )
            {
            // InternalFortXTrans.g:6029:1: ( ( rule__IdOrTuple__Group_1_2__0 )* )
            // InternalFortXTrans.g:6030:2: ( rule__IdOrTuple__Group_1_2__0 )*
            {
             before(grammarAccess.getIdOrTupleAccess().getGroup_1_2()); 
            // InternalFortXTrans.g:6031:2: ( rule__IdOrTuple__Group_1_2__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==24) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalFortXTrans.g:6031:3: rule__IdOrTuple__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__IdOrTuple__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalFortXTrans.g:6039:1: rule__IdOrTuple__Group_1__3 : rule__IdOrTuple__Group_1__3__Impl ;
    public final void rule__IdOrTuple__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6043:1: ( rule__IdOrTuple__Group_1__3__Impl )
            // InternalFortXTrans.g:6044:2: rule__IdOrTuple__Group_1__3__Impl
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
    // InternalFortXTrans.g:6050:1: rule__IdOrTuple__Group_1__3__Impl : ( ')' ) ;
    public final void rule__IdOrTuple__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6054:1: ( ( ')' ) )
            // InternalFortXTrans.g:6055:1: ( ')' )
            {
            // InternalFortXTrans.g:6055:1: ( ')' )
            // InternalFortXTrans.g:6056:2: ')'
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
    // InternalFortXTrans.g:6066:1: rule__IdOrTuple__Group_1_2__0 : rule__IdOrTuple__Group_1_2__0__Impl rule__IdOrTuple__Group_1_2__1 ;
    public final void rule__IdOrTuple__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6070:1: ( rule__IdOrTuple__Group_1_2__0__Impl rule__IdOrTuple__Group_1_2__1 )
            // InternalFortXTrans.g:6071:2: rule__IdOrTuple__Group_1_2__0__Impl rule__IdOrTuple__Group_1_2__1
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
    // InternalFortXTrans.g:6078:1: rule__IdOrTuple__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__IdOrTuple__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6082:1: ( ( ',' ) )
            // InternalFortXTrans.g:6083:1: ( ',' )
            {
            // InternalFortXTrans.g:6083:1: ( ',' )
            // InternalFortXTrans.g:6084:2: ','
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
    // InternalFortXTrans.g:6093:1: rule__IdOrTuple__Group_1_2__1 : rule__IdOrTuple__Group_1_2__1__Impl ;
    public final void rule__IdOrTuple__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6097:1: ( rule__IdOrTuple__Group_1_2__1__Impl )
            // InternalFortXTrans.g:6098:2: rule__IdOrTuple__Group_1_2__1__Impl
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
    // InternalFortXTrans.g:6104:1: rule__IdOrTuple__Group_1_2__1__Impl : ( ( rule__IdOrTuple__BidAssignment_1_2_1 ) ) ;
    public final void rule__IdOrTuple__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6108:1: ( ( ( rule__IdOrTuple__BidAssignment_1_2_1 ) ) )
            // InternalFortXTrans.g:6109:1: ( ( rule__IdOrTuple__BidAssignment_1_2_1 ) )
            {
            // InternalFortXTrans.g:6109:1: ( ( rule__IdOrTuple__BidAssignment_1_2_1 ) )
            // InternalFortXTrans.g:6110:2: ( rule__IdOrTuple__BidAssignment_1_2_1 )
            {
             before(grammarAccess.getIdOrTupleAccess().getBidAssignment_1_2_1()); 
            // InternalFortXTrans.g:6111:2: ( rule__IdOrTuple__BidAssignment_1_2_1 )
            // InternalFortXTrans.g:6111:3: rule__IdOrTuple__BidAssignment_1_2_1
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
    // InternalFortXTrans.g:6120:1: rule__IsType__Group__0 : rule__IsType__Group__0__Impl rule__IsType__Group__1 ;
    public final void rule__IsType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6124:1: ( rule__IsType__Group__0__Impl rule__IsType__Group__1 )
            // InternalFortXTrans.g:6125:2: rule__IsType__Group__0__Impl rule__IsType__Group__1
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
    // InternalFortXTrans.g:6132:1: rule__IsType__Group__0__Impl : ( ':' ) ;
    public final void rule__IsType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6136:1: ( ( ':' ) )
            // InternalFortXTrans.g:6137:1: ( ':' )
            {
            // InternalFortXTrans.g:6137:1: ( ':' )
            // InternalFortXTrans.g:6138:2: ':'
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
    // InternalFortXTrans.g:6147:1: rule__IsType__Group__1 : rule__IsType__Group__1__Impl ;
    public final void rule__IsType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6151:1: ( rule__IsType__Group__1__Impl )
            // InternalFortXTrans.g:6152:2: rule__IsType__Group__1__Impl
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
    // InternalFortXTrans.g:6158:1: rule__IsType__Group__1__Impl : ( ( rule__IsType__TypeAssignment_1 ) ) ;
    public final void rule__IsType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6162:1: ( ( ( rule__IsType__TypeAssignment_1 ) ) )
            // InternalFortXTrans.g:6163:1: ( ( rule__IsType__TypeAssignment_1 ) )
            {
            // InternalFortXTrans.g:6163:1: ( ( rule__IsType__TypeAssignment_1 ) )
            // InternalFortXTrans.g:6164:2: ( rule__IsType__TypeAssignment_1 )
            {
             before(grammarAccess.getIsTypeAccess().getTypeAssignment_1()); 
            // InternalFortXTrans.g:6165:2: ( rule__IsType__TypeAssignment_1 )
            // InternalFortXTrans.g:6165:3: rule__IsType__TypeAssignment_1
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
    // InternalFortXTrans.g:6174:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6178:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:6179:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:6179:2: ( RULE_ID )
            // InternalFortXTrans.g:6180:3: RULE_ID
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
    // InternalFortXTrans.g:6189:1: rule__Component__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Component__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6193:1: ( ( ruleImport ) )
            // InternalFortXTrans.g:6194:2: ( ruleImport )
            {
            // InternalFortXTrans.g:6194:2: ( ruleImport )
            // InternalFortXTrans.g:6195:3: ruleImport
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
    // InternalFortXTrans.g:6204:1: rule__Component__ExportsAssignment_3 : ( ruleExport ) ;
    public final void rule__Component__ExportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6208:1: ( ( ruleExport ) )
            // InternalFortXTrans.g:6209:2: ( ruleExport )
            {
            // InternalFortXTrans.g:6209:2: ( ruleExport )
            // InternalFortXTrans.g:6210:3: ruleExport
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
    // InternalFortXTrans.g:6219:1: rule__Component__DeclsAssignment_4 : ( ruleDecls ) ;
    public final void rule__Component__DeclsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6223:1: ( ( ruleDecls ) )
            // InternalFortXTrans.g:6224:2: ( ruleDecls )
            {
            // InternalFortXTrans.g:6224:2: ( ruleDecls )
            // InternalFortXTrans.g:6225:3: ruleDecls
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
    // InternalFortXTrans.g:6234:1: rule__API__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__API__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6238:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:6239:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:6239:2: ( RULE_ID )
            // InternalFortXTrans.g:6240:3: RULE_ID
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
    // InternalFortXTrans.g:6249:1: rule__API__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__API__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6253:1: ( ( ruleImport ) )
            // InternalFortXTrans.g:6254:2: ( ruleImport )
            {
            // InternalFortXTrans.g:6254:2: ( ruleImport )
            // InternalFortXTrans.g:6255:3: ruleImport
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
    // InternalFortXTrans.g:6264:1: rule__Import__ImpsAssignment_0_0 : ( ( 'import' ) ) ;
    public final void rule__Import__ImpsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6268:1: ( ( ( 'import' ) ) )
            // InternalFortXTrans.g:6269:2: ( ( 'import' ) )
            {
            // InternalFortXTrans.g:6269:2: ( ( 'import' ) )
            // InternalFortXTrans.g:6270:3: ( 'import' )
            {
             before(grammarAccess.getImportAccess().getImpsImportKeyword_0_0_0()); 
            // InternalFortXTrans.g:6271:3: ( 'import' )
            // InternalFortXTrans.g:6272:4: 'import'
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
    // InternalFortXTrans.g:6283:1: rule__Import__ImportedNamesAssignment_0_1 : ( ruleImportedNames ) ;
    public final void rule__Import__ImportedNamesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6287:1: ( ( ruleImportedNames ) )
            // InternalFortXTrans.g:6288:2: ( ruleImportedNames )
            {
            // InternalFortXTrans.g:6288:2: ( ruleImportedNames )
            // InternalFortXTrans.g:6289:3: ruleImportedNames
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
    // InternalFortXTrans.g:6298:1: rule__Import__ImpsAssignment_1_0 : ( ( 'import' ) ) ;
    public final void rule__Import__ImpsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6302:1: ( ( ( 'import' ) ) )
            // InternalFortXTrans.g:6303:2: ( ( 'import' ) )
            {
            // InternalFortXTrans.g:6303:2: ( ( 'import' ) )
            // InternalFortXTrans.g:6304:3: ( 'import' )
            {
             before(grammarAccess.getImportAccess().getImpsImportKeyword_1_0_0()); 
            // InternalFortXTrans.g:6305:3: ( 'import' )
            // InternalFortXTrans.g:6306:4: 'import'
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
    // InternalFortXTrans.g:6317:1: rule__Import__ApiAssignment_1_1 : ( ( 'api' ) ) ;
    public final void rule__Import__ApiAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6321:1: ( ( ( 'api' ) ) )
            // InternalFortXTrans.g:6322:2: ( ( 'api' ) )
            {
            // InternalFortXTrans.g:6322:2: ( ( 'api' ) )
            // InternalFortXTrans.g:6323:3: ( 'api' )
            {
             before(grammarAccess.getImportAccess().getApiApiKeyword_1_1_0()); 
            // InternalFortXTrans.g:6324:3: ( 'api' )
            // InternalFortXTrans.g:6325:4: 'api'
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
    // InternalFortXTrans.g:6336:1: rule__Import__AliasedimportedNamesAssignment_1_2 : ( ruleAliasedAPINames ) ;
    public final void rule__Import__AliasedimportedNamesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6340:1: ( ( ruleAliasedAPINames ) )
            // InternalFortXTrans.g:6341:2: ( ruleAliasedAPINames )
            {
            // InternalFortXTrans.g:6341:2: ( ruleAliasedAPINames )
            // InternalFortXTrans.g:6342:3: ruleAliasedAPINames
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
    // InternalFortXTrans.g:6351:1: rule__Export__ExpAssignment_0_0 : ( ( 'export' ) ) ;
    public final void rule__Export__ExpAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6355:1: ( ( ( 'export' ) ) )
            // InternalFortXTrans.g:6356:2: ( ( 'export' ) )
            {
            // InternalFortXTrans.g:6356:2: ( ( 'export' ) )
            // InternalFortXTrans.g:6357:3: ( 'export' )
            {
             before(grammarAccess.getExportAccess().getExpExportKeyword_0_0_0()); 
            // InternalFortXTrans.g:6358:3: ( 'export' )
            // InternalFortXTrans.g:6359:4: 'export'
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
    // InternalFortXTrans.g:6370:1: rule__Export__ExportedNameAssignment_0_1 : ( ruleAPIName ) ;
    public final void rule__Export__ExportedNameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6374:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:6375:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:6375:2: ( ruleAPIName )
            // InternalFortXTrans.g:6376:3: ruleAPIName
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
    // InternalFortXTrans.g:6385:1: rule__Export__ExpAssignment_1_0 : ( ( 'export' ) ) ;
    public final void rule__Export__ExpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6389:1: ( ( ( 'export' ) ) )
            // InternalFortXTrans.g:6390:2: ( ( 'export' ) )
            {
            // InternalFortXTrans.g:6390:2: ( ( 'export' ) )
            // InternalFortXTrans.g:6391:3: ( 'export' )
            {
             before(grammarAccess.getExportAccess().getExpExportKeyword_1_0_0()); 
            // InternalFortXTrans.g:6392:3: ( 'export' )
            // InternalFortXTrans.g:6393:4: 'export'
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
    // InternalFortXTrans.g:6404:1: rule__Export__BrackAssignment_1_1 : ( ( '{' ) ) ;
    public final void rule__Export__BrackAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6408:1: ( ( ( '{' ) ) )
            // InternalFortXTrans.g:6409:2: ( ( '{' ) )
            {
            // InternalFortXTrans.g:6409:2: ( ( '{' ) )
            // InternalFortXTrans.g:6410:3: ( '{' )
            {
             before(grammarAccess.getExportAccess().getBrackLeftCurlyBracketKeyword_1_1_0()); 
            // InternalFortXTrans.g:6411:3: ( '{' )
            // InternalFortXTrans.g:6412:4: '{'
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
    // InternalFortXTrans.g:6423:1: rule__Export__ExportedNameAssignment_1_2 : ( ruleAPIName ) ;
    public final void rule__Export__ExportedNameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6427:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:6428:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:6428:2: ( ruleAPIName )
            // InternalFortXTrans.g:6429:3: ruleAPIName
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
    // InternalFortXTrans.g:6438:1: rule__Export__ExportedNameAssignment_1_3_1 : ( ruleAPIName ) ;
    public final void rule__Export__ExportedNameAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6442:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:6443:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:6443:2: ( ruleAPIName )
            // InternalFortXTrans.g:6444:3: ruleAPIName
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
    // InternalFortXTrans.g:6453:1: rule__ImportedNames__ImpnameAssignment_0_0 : ( ruleAPIName ) ;
    public final void rule__ImportedNames__ImpnameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6457:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:6458:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:6458:2: ( ruleAPIName )
            // InternalFortXTrans.g:6459:3: ruleAPIName
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
    // InternalFortXTrans.g:6468:1: rule__ImportedNames__ExceptAssignment_0_5_0 : ( ( 'except' ) ) ;
    public final void rule__ImportedNames__ExceptAssignment_0_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6472:1: ( ( ( 'except' ) ) )
            // InternalFortXTrans.g:6473:2: ( ( 'except' ) )
            {
            // InternalFortXTrans.g:6473:2: ( ( 'except' ) )
            // InternalFortXTrans.g:6474:3: ( 'except' )
            {
             before(grammarAccess.getImportedNamesAccess().getExceptExceptKeyword_0_5_0_0()); 
            // InternalFortXTrans.g:6475:3: ( 'except' )
            // InternalFortXTrans.g:6476:4: 'except'
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
    // InternalFortXTrans.g:6487:1: rule__ImportedNames__SimpAssignment_0_5_1 : ( ruleSimpleNames ) ;
    public final void rule__ImportedNames__SimpAssignment_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6491:1: ( ( ruleSimpleNames ) )
            // InternalFortXTrans.g:6492:2: ( ruleSimpleNames )
            {
            // InternalFortXTrans.g:6492:2: ( ruleSimpleNames )
            // InternalFortXTrans.g:6493:3: ruleSimpleNames
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
    // InternalFortXTrans.g:6502:1: rule__ImportedNames__ImpnameAssignment_1_0 : ( ruleAPIName ) ;
    public final void rule__ImportedNames__ImpnameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6506:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:6507:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:6507:2: ( ruleAPIName )
            // InternalFortXTrans.g:6508:3: ruleAPIName
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
    // InternalFortXTrans.g:6517:1: rule__ImportedNames__SimpListAssignment_1_3 : ( ruleAliasedSimpleName ) ;
    public final void rule__ImportedNames__SimpListAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6521:1: ( ( ruleAliasedSimpleName ) )
            // InternalFortXTrans.g:6522:2: ( ruleAliasedSimpleName )
            {
            // InternalFortXTrans.g:6522:2: ( ruleAliasedSimpleName )
            // InternalFortXTrans.g:6523:3: ruleAliasedSimpleName
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
    // InternalFortXTrans.g:6532:1: rule__ImportedNames__SimpListAssignment_1_4_1 : ( ruleAliasedSimpleName ) ;
    public final void rule__ImportedNames__SimpListAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6536:1: ( ( ruleAliasedSimpleName ) )
            // InternalFortXTrans.g:6537:2: ( ruleAliasedSimpleName )
            {
            // InternalFortXTrans.g:6537:2: ( ruleAliasedSimpleName )
            // InternalFortXTrans.g:6538:3: ruleAliasedSimpleName
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
    // InternalFortXTrans.g:6547:1: rule__ImportedNames__CommaAssignment_1_5_0 : ( ( ',' ) ) ;
    public final void rule__ImportedNames__CommaAssignment_1_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6551:1: ( ( ( ',' ) ) )
            // InternalFortXTrans.g:6552:2: ( ( ',' ) )
            {
            // InternalFortXTrans.g:6552:2: ( ( ',' ) )
            // InternalFortXTrans.g:6553:3: ( ',' )
            {
             before(grammarAccess.getImportedNamesAccess().getCommaCommaKeyword_1_5_0_0()); 
            // InternalFortXTrans.g:6554:3: ( ',' )
            // InternalFortXTrans.g:6555:4: ','
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
    // InternalFortXTrans.g:6566:1: rule__ImportedNames__DotsAssignment_1_5_1 : ( RULE_DOTS ) ;
    public final void rule__ImportedNames__DotsAssignment_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6570:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:6571:2: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:6571:2: ( RULE_DOTS )
            // InternalFortXTrans.g:6572:3: RULE_DOTS
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
    // InternalFortXTrans.g:6581:1: rule__ImportedNames__ImpnameAssignment_2_0 : ( ruleAPIName ) ;
    public final void rule__ImportedNames__ImpnameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6585:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:6586:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:6586:2: ( ruleAPIName )
            // InternalFortXTrans.g:6587:3: ruleAPIName
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
    // InternalFortXTrans.g:6596:1: rule__ImportedNames__AsnameAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__ImportedNames__AsnameAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6600:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:6601:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:6601:2: ( RULE_ID )
            // InternalFortXTrans.g:6602:3: RULE_ID
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
    // InternalFortXTrans.g:6611:1: rule__SimpleNames__NameListAssignment_0 : ( ruleSimpleName ) ;
    public final void rule__SimpleNames__NameListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6615:1: ( ( ruleSimpleName ) )
            // InternalFortXTrans.g:6616:2: ( ruleSimpleName )
            {
            // InternalFortXTrans.g:6616:2: ( ruleSimpleName )
            // InternalFortXTrans.g:6617:3: ruleSimpleName
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
    // InternalFortXTrans.g:6626:1: rule__SimpleNames__BrackAssignment_1_0 : ( ( '{' ) ) ;
    public final void rule__SimpleNames__BrackAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6630:1: ( ( ( '{' ) ) )
            // InternalFortXTrans.g:6631:2: ( ( '{' ) )
            {
            // InternalFortXTrans.g:6631:2: ( ( '{' ) )
            // InternalFortXTrans.g:6632:3: ( '{' )
            {
             before(grammarAccess.getSimpleNamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0()); 
            // InternalFortXTrans.g:6633:3: ( '{' )
            // InternalFortXTrans.g:6634:4: '{'
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
    // InternalFortXTrans.g:6645:1: rule__SimpleNames__NameListAssignment_1_1 : ( ruleSimpleName ) ;
    public final void rule__SimpleNames__NameListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6649:1: ( ( ruleSimpleName ) )
            // InternalFortXTrans.g:6650:2: ( ruleSimpleName )
            {
            // InternalFortXTrans.g:6650:2: ( ruleSimpleName )
            // InternalFortXTrans.g:6651:3: ruleSimpleName
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
    // InternalFortXTrans.g:6660:1: rule__SimpleNames__NameListAssignment_1_2_1 : ( ruleSimpleName ) ;
    public final void rule__SimpleNames__NameListAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6664:1: ( ( ruleSimpleName ) )
            // InternalFortXTrans.g:6665:2: ( ruleSimpleName )
            {
            // InternalFortXTrans.g:6665:2: ( ruleSimpleName )
            // InternalFortXTrans.g:6666:3: ruleSimpleName
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
    // InternalFortXTrans.g:6675:1: rule__SimpleName__NameAssignment : ( RULE_ID ) ;
    public final void rule__SimpleName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6679:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:6680:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:6680:2: ( RULE_ID )
            // InternalFortXTrans.g:6681:3: RULE_ID
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
    // InternalFortXTrans.g:6690:1: rule__AliasedSimpleName__OrigAssignment_0 : ( RULE_ID ) ;
    public final void rule__AliasedSimpleName__OrigAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6694:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:6695:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:6695:2: ( RULE_ID )
            // InternalFortXTrans.g:6696:3: RULE_ID
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
    // InternalFortXTrans.g:6705:1: rule__AliasedSimpleName__AsNameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__AliasedSimpleName__AsNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6709:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:6710:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:6710:2: ( RULE_ID )
            // InternalFortXTrans.g:6711:3: RULE_ID
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
    // InternalFortXTrans.g:6720:1: rule__AliasedAPINames__NameListAssignment_0 : ( ruleAliasedAPIName ) ;
    public final void rule__AliasedAPINames__NameListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6724:1: ( ( ruleAliasedAPIName ) )
            // InternalFortXTrans.g:6725:2: ( ruleAliasedAPIName )
            {
            // InternalFortXTrans.g:6725:2: ( ruleAliasedAPIName )
            // InternalFortXTrans.g:6726:3: ruleAliasedAPIName
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
    // InternalFortXTrans.g:6735:1: rule__AliasedAPINames__BrackAssignment_1_0 : ( ( '{' ) ) ;
    public final void rule__AliasedAPINames__BrackAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6739:1: ( ( ( '{' ) ) )
            // InternalFortXTrans.g:6740:2: ( ( '{' ) )
            {
            // InternalFortXTrans.g:6740:2: ( ( '{' ) )
            // InternalFortXTrans.g:6741:3: ( '{' )
            {
             before(grammarAccess.getAliasedAPINamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0()); 
            // InternalFortXTrans.g:6742:3: ( '{' )
            // InternalFortXTrans.g:6743:4: '{'
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
    // InternalFortXTrans.g:6754:1: rule__AliasedAPINames__NameListAssignment_1_1 : ( ruleAliasedAPIName ) ;
    public final void rule__AliasedAPINames__NameListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6758:1: ( ( ruleAliasedAPIName ) )
            // InternalFortXTrans.g:6759:2: ( ruleAliasedAPIName )
            {
            // InternalFortXTrans.g:6759:2: ( ruleAliasedAPIName )
            // InternalFortXTrans.g:6760:3: ruleAliasedAPIName
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
    // InternalFortXTrans.g:6769:1: rule__AliasedAPINames__NameListAssignment_1_2_1 : ( ruleAliasedAPIName ) ;
    public final void rule__AliasedAPINames__NameListAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6773:1: ( ( ruleAliasedAPIName ) )
            // InternalFortXTrans.g:6774:2: ( ruleAliasedAPIName )
            {
            // InternalFortXTrans.g:6774:2: ( ruleAliasedAPIName )
            // InternalFortXTrans.g:6775:3: ruleAliasedAPIName
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
    // InternalFortXTrans.g:6784:1: rule__AliasedAPIName__OrigAssignment_0 : ( ruleAPIName ) ;
    public final void rule__AliasedAPIName__OrigAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6788:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:6789:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:6789:2: ( ruleAPIName )
            // InternalFortXTrans.g:6790:3: ruleAPIName
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
    // InternalFortXTrans.g:6799:1: rule__AliasedAPIName__AsNameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__AliasedAPIName__AsNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6803:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:6804:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:6804:2: ( RULE_ID )
            // InternalFortXTrans.g:6805:3: RULE_ID
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
    // InternalFortXTrans.g:6814:1: rule__Decls__DeclsAssignment : ( ruleDecl ) ;
    public final void rule__Decls__DeclsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6818:1: ( ( ruleDecl ) )
            // InternalFortXTrans.g:6819:2: ( ruleDecl )
            {
            // InternalFortXTrans.g:6819:2: ( ruleDecl )
            // InternalFortXTrans.g:6820:3: ruleDecl
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
    // InternalFortXTrans.g:6829:1: rule__Decl__FunctionAssignment : ( ruleFnDecl ) ;
    public final void rule__Decl__FunctionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6833:1: ( ( ruleFnDecl ) )
            // InternalFortXTrans.g:6834:2: ( ruleFnDecl )
            {
            // InternalFortXTrans.g:6834:2: ( ruleFnDecl )
            // InternalFortXTrans.g:6835:3: ruleFnDecl
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
    // InternalFortXTrans.g:6844:1: rule__FnMods__ModsAssignment : ( ruleFnMod ) ;
    public final void rule__FnMods__ModsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6848:1: ( ( ruleFnMod ) )
            // InternalFortXTrans.g:6849:2: ( ruleFnMod )
            {
            // InternalFortXTrans.g:6849:2: ( ruleFnMod )
            // InternalFortXTrans.g:6850:3: ruleFnMod
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
    // InternalFortXTrans.g:6859:1: rule__FnMod__ModtypeAssignment_0 : ( ( 'private' ) ) ;
    public final void rule__FnMod__ModtypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6863:1: ( ( ( 'private' ) ) )
            // InternalFortXTrans.g:6864:2: ( ( 'private' ) )
            {
            // InternalFortXTrans.g:6864:2: ( ( 'private' ) )
            // InternalFortXTrans.g:6865:3: ( 'private' )
            {
             before(grammarAccess.getFnModAccess().getModtypePrivateKeyword_0_0()); 
            // InternalFortXTrans.g:6866:3: ( 'private' )
            // InternalFortXTrans.g:6867:4: 'private'
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
    // InternalFortXTrans.g:6878:1: rule__FnMod__ModtypeAssignment_1 : ( ( 'test' ) ) ;
    public final void rule__FnMod__ModtypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6882:1: ( ( ( 'test' ) ) )
            // InternalFortXTrans.g:6883:2: ( ( 'test' ) )
            {
            // InternalFortXTrans.g:6883:2: ( ( 'test' ) )
            // InternalFortXTrans.g:6884:3: ( 'test' )
            {
             before(grammarAccess.getFnModAccess().getModtypeTestKeyword_1_0()); 
            // InternalFortXTrans.g:6885:3: ( 'test' )
            // InternalFortXTrans.g:6886:4: 'test'
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
    // InternalFortXTrans.g:6897:1: rule__FnMod__ModtypeAssignment_2 : ( ( 'atomic' ) ) ;
    public final void rule__FnMod__ModtypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6901:1: ( ( ( 'atomic' ) ) )
            // InternalFortXTrans.g:6902:2: ( ( 'atomic' ) )
            {
            // InternalFortXTrans.g:6902:2: ( ( 'atomic' ) )
            // InternalFortXTrans.g:6903:3: ( 'atomic' )
            {
             before(grammarAccess.getFnModAccess().getModtypeAtomicKeyword_2_0()); 
            // InternalFortXTrans.g:6904:3: ( 'atomic' )
            // InternalFortXTrans.g:6905:4: 'atomic'
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
    // InternalFortXTrans.g:6916:1: rule__FnMod__ModtypeAssignment_3 : ( ( 'io' ) ) ;
    public final void rule__FnMod__ModtypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6920:1: ( ( ( 'io' ) ) )
            // InternalFortXTrans.g:6921:2: ( ( 'io' ) )
            {
            // InternalFortXTrans.g:6921:2: ( ( 'io' ) )
            // InternalFortXTrans.g:6922:3: ( 'io' )
            {
             before(grammarAccess.getFnModAccess().getModtypeIoKeyword_3_0()); 
            // InternalFortXTrans.g:6923:3: ( 'io' )
            // InternalFortXTrans.g:6924:4: 'io'
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
    // InternalFortXTrans.g:6935:1: rule__ValParam__ParamsAssignment_0 : ( ruleParam ) ;
    public final void rule__ValParam__ParamsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6939:1: ( ( ruleParam ) )
            // InternalFortXTrans.g:6940:2: ( ruleParam )
            {
            // InternalFortXTrans.g:6940:2: ( ruleParam )
            // InternalFortXTrans.g:6941:3: ruleParam
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
    // InternalFortXTrans.g:6950:1: rule__ValParam__BrackAssignment_1_0 : ( ( '(' ) ) ;
    public final void rule__ValParam__BrackAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6954:1: ( ( ( '(' ) ) )
            // InternalFortXTrans.g:6955:2: ( ( '(' ) )
            {
            // InternalFortXTrans.g:6955:2: ( ( '(' ) )
            // InternalFortXTrans.g:6956:3: ( '(' )
            {
             before(grammarAccess.getValParamAccess().getBrackLeftParenthesisKeyword_1_0_0()); 
            // InternalFortXTrans.g:6957:3: ( '(' )
            // InternalFortXTrans.g:6958:4: '('
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
    // InternalFortXTrans.g:6969:1: rule__ValParam__ParamsAssignment_1_1_0 : ( ruleParam ) ;
    public final void rule__ValParam__ParamsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6973:1: ( ( ruleParam ) )
            // InternalFortXTrans.g:6974:2: ( ruleParam )
            {
            // InternalFortXTrans.g:6974:2: ( ruleParam )
            // InternalFortXTrans.g:6975:3: ruleParam
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
    // InternalFortXTrans.g:6984:1: rule__ValParam__ParamsAssignment_1_1_1_1 : ( ruleParam ) ;
    public final void rule__ValParam__ParamsAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6988:1: ( ( ruleParam ) )
            // InternalFortXTrans.g:6989:2: ( ruleParam )
            {
            // InternalFortXTrans.g:6989:2: ( ruleParam )
            // InternalFortXTrans.g:6990:3: ruleParam
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
    // InternalFortXTrans.g:6999:1: rule__Param__BIdAssignment_0 : ( ruleBindId ) ;
    public final void rule__Param__BIdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7003:1: ( ( ruleBindId ) )
            // InternalFortXTrans.g:7004:2: ( ruleBindId )
            {
            // InternalFortXTrans.g:7004:2: ( ruleBindId )
            // InternalFortXTrans.g:7005:3: ruleBindId
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
    // InternalFortXTrans.g:7014:1: rule__Param__IstypeAssignment_1 : ( ruleIsType ) ;
    public final void rule__Param__IstypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7018:1: ( ( ruleIsType ) )
            // InternalFortXTrans.g:7019:2: ( ruleIsType )
            {
            // InternalFortXTrans.g:7019:2: ( ruleIsType )
            // InternalFortXTrans.g:7020:3: ruleIsType
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
    // InternalFortXTrans.g:7029:1: rule__RetType__EmptyAssignment_0_1 : ( ( '(' ) ) ;
    public final void rule__RetType__EmptyAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7033:1: ( ( ( '(' ) ) )
            // InternalFortXTrans.g:7034:2: ( ( '(' ) )
            {
            // InternalFortXTrans.g:7034:2: ( ( '(' ) )
            // InternalFortXTrans.g:7035:3: ( '(' )
            {
             before(grammarAccess.getRetTypeAccess().getEmptyLeftParenthesisKeyword_0_1_0()); 
            // InternalFortXTrans.g:7036:3: ( '(' )
            // InternalFortXTrans.g:7037:4: '('
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
    // InternalFortXTrans.g:7048:1: rule__RetType__TypeAssignment_1_1 : ( ruleType ) ;
    public final void rule__RetType__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7052:1: ( ( ruleType ) )
            // InternalFortXTrans.g:7053:2: ( ruleType )
            {
            // InternalFortXTrans.g:7053:2: ( ruleType )
            // InternalFortXTrans.g:7054:3: ruleType
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
    // InternalFortXTrans.g:7063:1: rule__Type__TnameAssignment : ( RULE_ID ) ;
    public final void rule__Type__TnameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7067:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:7068:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:7068:2: ( RULE_ID )
            // InternalFortXTrans.g:7069:3: RULE_ID
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
    // InternalFortXTrans.g:7078:1: rule__FnDecl__ModsAssignment_0 : ( ruleFnMods ) ;
    public final void rule__FnDecl__ModsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7082:1: ( ( ruleFnMods ) )
            // InternalFortXTrans.g:7083:2: ( ruleFnMods )
            {
            // InternalFortXTrans.g:7083:2: ( ruleFnMods )
            // InternalFortXTrans.g:7084:3: ruleFnMods
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
    // InternalFortXTrans.g:7093:1: rule__FnDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FnDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7097:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:7098:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:7098:2: ( RULE_ID )
            // InternalFortXTrans.g:7099:3: RULE_ID
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
    // InternalFortXTrans.g:7108:1: rule__FnDecl__ParamsAssignment_2 : ( ruleValParam ) ;
    public final void rule__FnDecl__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7112:1: ( ( ruleValParam ) )
            // InternalFortXTrans.g:7113:2: ( ruleValParam )
            {
            // InternalFortXTrans.g:7113:2: ( ruleValParam )
            // InternalFortXTrans.g:7114:3: ruleValParam
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
    // InternalFortXTrans.g:7123:1: rule__FnDecl__RetValAssignment_3 : ( ruleRetType ) ;
    public final void rule__FnDecl__RetValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7127:1: ( ( ruleRetType ) )
            // InternalFortXTrans.g:7128:2: ( ruleRetType )
            {
            // InternalFortXTrans.g:7128:2: ( ruleRetType )
            // InternalFortXTrans.g:7129:3: ruleRetType
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
    // InternalFortXTrans.g:7138:1: rule__FnDecl__BodyAssignment_4_0 : ( ( '=' ) ) ;
    public final void rule__FnDecl__BodyAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7142:1: ( ( ( '=' ) ) )
            // InternalFortXTrans.g:7143:2: ( ( '=' ) )
            {
            // InternalFortXTrans.g:7143:2: ( ( '=' ) )
            // InternalFortXTrans.g:7144:3: ( '=' )
            {
             before(grammarAccess.getFnDeclAccess().getBodyEqualsSignKeyword_4_0_0()); 
            // InternalFortXTrans.g:7145:3: ( '=' )
            // InternalFortXTrans.g:7146:4: '='
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
    // InternalFortXTrans.g:7157:1: rule__FnDecl__FnItselfAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__FnDecl__FnItselfAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7161:1: ( ( ruleExpression ) )
            // InternalFortXTrans.g:7162:2: ( ruleExpression )
            {
            // InternalFortXTrans.g:7162:2: ( ruleExpression )
            // InternalFortXTrans.g:7163:3: ruleExpression
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
    // InternalFortXTrans.g:7172:1: rule__Expression__ExpAssignment : ( ruleExpr ) ;
    public final void rule__Expression__ExpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7176:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:7177:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:7177:2: ( ruleExpr )
            // InternalFortXTrans.g:7178:3: ruleExpr
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
    // InternalFortXTrans.g:7187:1: rule__Expr__FrontAssignment_0 : ( ruleExprFront ) ;
    public final void rule__Expr__FrontAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7191:1: ( ( ruleExprFront ) )
            // InternalFortXTrans.g:7192:2: ( ruleExprFront )
            {
            // InternalFortXTrans.g:7192:2: ( ruleExprFront )
            // InternalFortXTrans.g:7193:3: ruleExprFront
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
    // InternalFortXTrans.g:7202:1: rule__Expr__TailsAssignment_1 : ( ruleExprTail ) ;
    public final void rule__Expr__TailsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7206:1: ( ( ruleExprTail ) )
            // InternalFortXTrans.g:7207:2: ( ruleExprTail )
            {
            // InternalFortXTrans.g:7207:2: ( ruleExprTail )
            // InternalFortXTrans.g:7208:3: ruleExprTail
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
    // InternalFortXTrans.g:7217:1: rule__ExprFront__DelimAssignment_0 : ( ruleDelimitedExpr ) ;
    public final void rule__ExprFront__DelimAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7221:1: ( ( ruleDelimitedExpr ) )
            // InternalFortXTrans.g:7222:2: ( ruleDelimitedExpr )
            {
            // InternalFortXTrans.g:7222:2: ( ruleDelimitedExpr )
            // InternalFortXTrans.g:7223:3: ruleDelimitedExpr
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
    // InternalFortXTrans.g:7232:1: rule__ExprFront__IdAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ExprFront__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7236:1: ( ( ruleQualifiedName ) )
            // InternalFortXTrans.g:7237:2: ( ruleQualifiedName )
            {
            // InternalFortXTrans.g:7237:2: ( ruleQualifiedName )
            // InternalFortXTrans.g:7238:3: ruleQualifiedName
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
    // InternalFortXTrans.g:7247:1: rule__ExprTail__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__ExprTail__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7251:1: ( ( ruleType ) )
            // InternalFortXTrans.g:7252:2: ( ruleType )
            {
            // InternalFortXTrans.g:7252:2: ( ruleType )
            // InternalFortXTrans.g:7253:3: ruleType
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
    // InternalFortXTrans.g:7262:1: rule__DelimitedExpr__DodAssignment_0 : ( ruleDo ) ;
    public final void rule__DelimitedExpr__DodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7266:1: ( ( ruleDo ) )
            // InternalFortXTrans.g:7267:2: ( ruleDo )
            {
            // InternalFortXTrans.g:7267:2: ( ruleDo )
            // InternalFortXTrans.g:7268:3: ruleDo
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
    // InternalFortXTrans.g:7277:1: rule__DelimitedExpr__AwhileAssignment_1_0 : ( ( 'while' ) ) ;
    public final void rule__DelimitedExpr__AwhileAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7281:1: ( ( ( 'while' ) ) )
            // InternalFortXTrans.g:7282:2: ( ( 'while' ) )
            {
            // InternalFortXTrans.g:7282:2: ( ( 'while' ) )
            // InternalFortXTrans.g:7283:3: ( 'while' )
            {
             before(grammarAccess.getDelimitedExprAccess().getAwhileWhileKeyword_1_0_0()); 
            // InternalFortXTrans.g:7284:3: ( 'while' )
            // InternalFortXTrans.g:7285:4: 'while'
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
    // InternalFortXTrans.g:7296:1: rule__DelimitedExpr__ExprAssignment_1_1 : ( ruleExpr ) ;
    public final void rule__DelimitedExpr__ExprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7300:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:7301:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:7301:2: ( ruleExpr )
            // InternalFortXTrans.g:7302:3: ruleExpr
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
    // InternalFortXTrans.g:7311:1: rule__DelimitedExpr__WhiledodAssignment_1_2 : ( ruleDo ) ;
    public final void rule__DelimitedExpr__WhiledodAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7315:1: ( ( ruleDo ) )
            // InternalFortXTrans.g:7316:2: ( ruleDo )
            {
            // InternalFortXTrans.g:7316:2: ( ruleDo )
            // InternalFortXTrans.g:7317:3: ruleDo
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
    // InternalFortXTrans.g:7326:1: rule__DelimitedExpr__AforAssignment_2_0 : ( ( 'for' ) ) ;
    public final void rule__DelimitedExpr__AforAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7330:1: ( ( ( 'for' ) ) )
            // InternalFortXTrans.g:7331:2: ( ( 'for' ) )
            {
            // InternalFortXTrans.g:7331:2: ( ( 'for' ) )
            // InternalFortXTrans.g:7332:3: ( 'for' )
            {
             before(grammarAccess.getDelimitedExprAccess().getAforForKeyword_2_0_0()); 
            // InternalFortXTrans.g:7333:3: ( 'for' )
            // InternalFortXTrans.g:7334:4: 'for'
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
    // InternalFortXTrans.g:7345:1: rule__DelimitedExpr__GenAssignment_2_1 : ( ruleGenerators ) ;
    public final void rule__DelimitedExpr__GenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7349:1: ( ( ruleGenerators ) )
            // InternalFortXTrans.g:7350:2: ( ruleGenerators )
            {
            // InternalFortXTrans.g:7350:2: ( ruleGenerators )
            // InternalFortXTrans.g:7351:3: ruleGenerators
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
    // InternalFortXTrans.g:7360:1: rule__DelimitedExpr__DofrontAssignment_2_2 : ( ruleDoFront ) ;
    public final void rule__DelimitedExpr__DofrontAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7364:1: ( ( ruleDoFront ) )
            // InternalFortXTrans.g:7365:2: ( ruleDoFront )
            {
            // InternalFortXTrans.g:7365:2: ( ruleDoFront )
            // InternalFortXTrans.g:7366:3: ruleDoFront
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
    // InternalFortXTrans.g:7375:1: rule__DelimitedExpr__AnifAssignment_3_0 : ( ( 'if' ) ) ;
    public final void rule__DelimitedExpr__AnifAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7379:1: ( ( ( 'if' ) ) )
            // InternalFortXTrans.g:7380:2: ( ( 'if' ) )
            {
            // InternalFortXTrans.g:7380:2: ( ( 'if' ) )
            // InternalFortXTrans.g:7381:3: ( 'if' )
            {
             before(grammarAccess.getDelimitedExprAccess().getAnifIfKeyword_3_0_0()); 
            // InternalFortXTrans.g:7382:3: ( 'if' )
            // InternalFortXTrans.g:7383:4: 'if'
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
    // InternalFortXTrans.g:7394:1: rule__DelimitedExpr__CondAssignment_3_1 : ( ruleExpr ) ;
    public final void rule__DelimitedExpr__CondAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7398:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:7399:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:7399:2: ( ruleExpr )
            // InternalFortXTrans.g:7400:3: ruleExpr
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
    // InternalFortXTrans.g:7409:1: rule__DelimitedExpr__BlockAssignment_3_3 : ( ruleBlockElems ) ;
    public final void rule__DelimitedExpr__BlockAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7413:1: ( ( ruleBlockElems ) )
            // InternalFortXTrans.g:7414:2: ( ruleBlockElems )
            {
            // InternalFortXTrans.g:7414:2: ( ruleBlockElems )
            // InternalFortXTrans.g:7415:3: ruleBlockElems
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
    // InternalFortXTrans.g:7424:1: rule__DelimitedExpr__ElifsAssignment_3_4 : ( ruleElifs ) ;
    public final void rule__DelimitedExpr__ElifsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7428:1: ( ( ruleElifs ) )
            // InternalFortXTrans.g:7429:2: ( ruleElifs )
            {
            // InternalFortXTrans.g:7429:2: ( ruleElifs )
            // InternalFortXTrans.g:7430:3: ruleElifs
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


    // $ANTLR start "rule__DelimitedExpr__ElsAssignment_3_5"
    // InternalFortXTrans.g:7439:1: rule__DelimitedExpr__ElsAssignment_3_5 : ( ruleElse ) ;
    public final void rule__DelimitedExpr__ElsAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7443:1: ( ( ruleElse ) )
            // InternalFortXTrans.g:7444:2: ( ruleElse )
            {
            // InternalFortXTrans.g:7444:2: ( ruleElse )
            // InternalFortXTrans.g:7445:3: ruleElse
            {
             before(grammarAccess.getDelimitedExprAccess().getElsElseParserRuleCall_3_5_0()); 
            pushFollow(FOLLOW_2);
            ruleElse();

            state._fsp--;

             after(grammarAccess.getDelimitedExprAccess().getElsElseParserRuleCall_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelimitedExpr__ElsAssignment_3_5"


    // $ANTLR start "rule__DelimitedExpr__ParAssignment_4"
    // InternalFortXTrans.g:7454:1: rule__DelimitedExpr__ParAssignment_4 : ( ruleParanthesized ) ;
    public final void rule__DelimitedExpr__ParAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7458:1: ( ( ruleParanthesized ) )
            // InternalFortXTrans.g:7459:2: ( ruleParanthesized )
            {
            // InternalFortXTrans.g:7459:2: ( ruleParanthesized )
            // InternalFortXTrans.g:7460:3: ruleParanthesized
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
    // InternalFortXTrans.g:7469:1: rule__Elifs__EAssignment_0 : ( ruleElif ) ;
    public final void rule__Elifs__EAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7473:1: ( ( ruleElif ) )
            // InternalFortXTrans.g:7474:2: ( ruleElif )
            {
            // InternalFortXTrans.g:7474:2: ( ruleElif )
            // InternalFortXTrans.g:7475:3: ruleElif
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
    // InternalFortXTrans.g:7484:1: rule__Elifs__EAssignment_1 : ( ruleElif ) ;
    public final void rule__Elifs__EAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7488:1: ( ( ruleElif ) )
            // InternalFortXTrans.g:7489:2: ( ruleElif )
            {
            // InternalFortXTrans.g:7489:2: ( ruleElif )
            // InternalFortXTrans.g:7490:3: ruleElif
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
    // InternalFortXTrans.g:7499:1: rule__Elif__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__Elif__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7503:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:7504:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:7504:2: ( ruleExpr )
            // InternalFortXTrans.g:7505:3: ruleExpr
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
    // InternalFortXTrans.g:7514:1: rule__Elif__BlockAssignment_3 : ( ruleBlockElems ) ;
    public final void rule__Elif__BlockAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7518:1: ( ( ruleBlockElems ) )
            // InternalFortXTrans.g:7519:2: ( ruleBlockElems )
            {
            // InternalFortXTrans.g:7519:2: ( ruleBlockElems )
            // InternalFortXTrans.g:7520:3: ruleBlockElems
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
    // InternalFortXTrans.g:7529:1: rule__Else__BlockAssignment_1 : ( ruleBlockElems ) ;
    public final void rule__Else__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7533:1: ( ( ruleBlockElems ) )
            // InternalFortXTrans.g:7534:2: ( ruleBlockElems )
            {
            // InternalFortXTrans.g:7534:2: ( ruleBlockElems )
            // InternalFortXTrans.g:7535:3: ruleBlockElems
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
    // InternalFortXTrans.g:7544:1: rule__Generators__BindingAssignment_0 : ( ruleBinding ) ;
    public final void rule__Generators__BindingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7548:1: ( ( ruleBinding ) )
            // InternalFortXTrans.g:7549:2: ( ruleBinding )
            {
            // InternalFortXTrans.g:7549:2: ( ruleBinding )
            // InternalFortXTrans.g:7550:3: ruleBinding
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
    // InternalFortXTrans.g:7559:1: rule__Generators__ClauseAssignment_1_1 : ( ruleGenClause ) ;
    public final void rule__Generators__ClauseAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7563:1: ( ( ruleGenClause ) )
            // InternalFortXTrans.g:7564:2: ( ruleGenClause )
            {
            // InternalFortXTrans.g:7564:2: ( ruleGenClause )
            // InternalFortXTrans.g:7565:3: ruleGenClause
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


    // $ANTLR start "rule__Binding__IdtupAssignment_0_0"
    // InternalFortXTrans.g:7574:1: rule__Binding__IdtupAssignment_0_0 : ( ruleIdOrTuple ) ;
    public final void rule__Binding__IdtupAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7578:1: ( ( ruleIdOrTuple ) )
            // InternalFortXTrans.g:7579:2: ( ruleIdOrTuple )
            {
            // InternalFortXTrans.g:7579:2: ( ruleIdOrTuple )
            // InternalFortXTrans.g:7580:3: ruleIdOrTuple
            {
             before(grammarAccess.getBindingAccess().getIdtupIdOrTupleParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIdOrTuple();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getIdtupIdOrTupleParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__IdtupAssignment_0_0"


    // $ANTLR start "rule__Binding__ExprAssignment_0_2"
    // InternalFortXTrans.g:7589:1: rule__Binding__ExprAssignment_0_2 : ( ruleExpr ) ;
    public final void rule__Binding__ExprAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7593:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:7594:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:7594:2: ( ruleExpr )
            // InternalFortXTrans.g:7595:3: ruleExpr
            {
             before(grammarAccess.getBindingAccess().getExprExprParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getExprExprParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__ExprAssignment_0_2"


    // $ANTLR start "rule__Binding__IdtupAssignment_1_0"
    // InternalFortXTrans.g:7604:1: rule__Binding__IdtupAssignment_1_0 : ( ruleIdOrTuple ) ;
    public final void rule__Binding__IdtupAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7608:1: ( ( ruleIdOrTuple ) )
            // InternalFortXTrans.g:7609:2: ( ruleIdOrTuple )
            {
            // InternalFortXTrans.g:7609:2: ( ruleIdOrTuple )
            // InternalFortXTrans.g:7610:3: ruleIdOrTuple
            {
             before(grammarAccess.getBindingAccess().getIdtupIdOrTupleParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIdOrTuple();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getIdtupIdOrTupleParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__IdtupAssignment_1_0"


    // $ANTLR start "rule__Binding__SeqAssignment_1_2"
    // InternalFortXTrans.g:7619:1: rule__Binding__SeqAssignment_1_2 : ( ( 'seq' ) ) ;
    public final void rule__Binding__SeqAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7623:1: ( ( ( 'seq' ) ) )
            // InternalFortXTrans.g:7624:2: ( ( 'seq' ) )
            {
            // InternalFortXTrans.g:7624:2: ( ( 'seq' ) )
            // InternalFortXTrans.g:7625:3: ( 'seq' )
            {
             before(grammarAccess.getBindingAccess().getSeqSeqKeyword_1_2_0()); 
            // InternalFortXTrans.g:7626:3: ( 'seq' )
            // InternalFortXTrans.g:7627:4: 'seq'
            {
             before(grammarAccess.getBindingAccess().getSeqSeqKeyword_1_2_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getSeqSeqKeyword_1_2_0()); 

            }

             after(grammarAccess.getBindingAccess().getSeqSeqKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__SeqAssignment_1_2"


    // $ANTLR start "rule__Binding__ExprAssignment_1_4"
    // InternalFortXTrans.g:7638:1: rule__Binding__ExprAssignment_1_4 : ( ruleExpr ) ;
    public final void rule__Binding__ExprAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7642:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:7643:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:7643:2: ( ruleExpr )
            // InternalFortXTrans.g:7644:3: ruleExpr
            {
             before(grammarAccess.getBindingAccess().getExprExprParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getExprExprParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__ExprAssignment_1_4"


    // $ANTLR start "rule__GenClause__BindingAssignment_0"
    // InternalFortXTrans.g:7653:1: rule__GenClause__BindingAssignment_0 : ( ruleBinding ) ;
    public final void rule__GenClause__BindingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7657:1: ( ( ruleBinding ) )
            // InternalFortXTrans.g:7658:2: ( ruleBinding )
            {
            // InternalFortXTrans.g:7658:2: ( ruleBinding )
            // InternalFortXTrans.g:7659:3: ruleBinding
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
    // InternalFortXTrans.g:7668:1: rule__GenClause__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__GenClause__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7672:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:7673:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:7673:2: ( ruleExpr )
            // InternalFortXTrans.g:7674:3: ruleExpr
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
    // InternalFortXTrans.g:7683:1: rule__BlockElems__BlockAssignment_0 : ( ruleBlockElem ) ;
    public final void rule__BlockElems__BlockAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7687:1: ( ( ruleBlockElem ) )
            // InternalFortXTrans.g:7688:2: ( ruleBlockElem )
            {
            // InternalFortXTrans.g:7688:2: ( ruleBlockElem )
            // InternalFortXTrans.g:7689:3: ruleBlockElem
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
    // InternalFortXTrans.g:7698:1: rule__BlockElems__BlockAssignment_1 : ( ruleBlockElem ) ;
    public final void rule__BlockElems__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7702:1: ( ( ruleBlockElem ) )
            // InternalFortXTrans.g:7703:2: ( ruleBlockElem )
            {
            // InternalFortXTrans.g:7703:2: ( ruleBlockElem )
            // InternalFortXTrans.g:7704:3: ruleBlockElem
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
    // InternalFortXTrans.g:7713:1: rule__BlockElem__ExpAssignment : ( ruleExpr ) ;
    public final void rule__BlockElem__ExpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7717:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:7718:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:7718:2: ( ruleExpr )
            // InternalFortXTrans.g:7719:3: ruleExpr
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


    // $ANTLR start "rule__Paranthesized__ExprAssignment_1"
    // InternalFortXTrans.g:7728:1: rule__Paranthesized__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__Paranthesized__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7732:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:7733:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:7733:2: ( ruleExpr )
            // InternalFortXTrans.g:7734:3: ruleExpr
            {
             before(grammarAccess.getParanthesizedAccess().getExprExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getParanthesizedAccess().getExprExprParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paranthesized__ExprAssignment_1"


    // $ANTLR start "rule__Do__DofsAssignment_0"
    // InternalFortXTrans.g:7743:1: rule__Do__DofsAssignment_0 : ( ruleDoFront ) ;
    public final void rule__Do__DofsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7747:1: ( ( ruleDoFront ) )
            // InternalFortXTrans.g:7748:2: ( ruleDoFront )
            {
            // InternalFortXTrans.g:7748:2: ( ruleDoFront )
            // InternalFortXTrans.g:7749:3: ruleDoFront
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
    // InternalFortXTrans.g:7758:1: rule__Do__DofsAssignment_1_1 : ( ruleDoFront ) ;
    public final void rule__Do__DofsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7762:1: ( ( ruleDoFront ) )
            // InternalFortXTrans.g:7763:2: ( ruleDoFront )
            {
            // InternalFortXTrans.g:7763:2: ( ruleDoFront )
            // InternalFortXTrans.g:7764:3: ruleDoFront
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
    // InternalFortXTrans.g:7773:1: rule__DoFront__AtAssignment_0_0 : ( ( 'at' ) ) ;
    public final void rule__DoFront__AtAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7777:1: ( ( ( 'at' ) ) )
            // InternalFortXTrans.g:7778:2: ( ( 'at' ) )
            {
            // InternalFortXTrans.g:7778:2: ( ( 'at' ) )
            // InternalFortXTrans.g:7779:3: ( 'at' )
            {
             before(grammarAccess.getDoFrontAccess().getAtAtKeyword_0_0_0()); 
            // InternalFortXTrans.g:7780:3: ( 'at' )
            // InternalFortXTrans.g:7781:4: 'at'
            {
             before(grammarAccess.getDoFrontAccess().getAtAtKeyword_0_0_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalFortXTrans.g:7792:1: rule__DoFront__ExpAssignment_0_1 : ( ruleExpr ) ;
    public final void rule__DoFront__ExpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7796:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:7797:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:7797:2: ( ruleExpr )
            // InternalFortXTrans.g:7798:3: ruleExpr
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
    // InternalFortXTrans.g:7807:1: rule__DoFront__AtomAssignment_1 : ( ( 'atomic' ) ) ;
    public final void rule__DoFront__AtomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7811:1: ( ( ( 'atomic' ) ) )
            // InternalFortXTrans.g:7812:2: ( ( 'atomic' ) )
            {
            // InternalFortXTrans.g:7812:2: ( ( 'atomic' ) )
            // InternalFortXTrans.g:7813:3: ( 'atomic' )
            {
             before(grammarAccess.getDoFrontAccess().getAtomAtomicKeyword_1_0()); 
            // InternalFortXTrans.g:7814:3: ( 'atomic' )
            // InternalFortXTrans.g:7815:4: 'atomic'
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
    // InternalFortXTrans.g:7826:1: rule__DoFront__BlockAssignment_3 : ( ruleBlockElems ) ;
    public final void rule__DoFront__BlockAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7830:1: ( ( ruleBlockElems ) )
            // InternalFortXTrans.g:7831:2: ( ruleBlockElems )
            {
            // InternalFortXTrans.g:7831:2: ( ruleBlockElems )
            // InternalFortXTrans.g:7832:3: ruleBlockElems
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
    // InternalFortXTrans.g:7841:1: rule__IdOrTuple__BidAssignment_0 : ( ruleBindId ) ;
    public final void rule__IdOrTuple__BidAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7845:1: ( ( ruleBindId ) )
            // InternalFortXTrans.g:7846:2: ( ruleBindId )
            {
            // InternalFortXTrans.g:7846:2: ( ruleBindId )
            // InternalFortXTrans.g:7847:3: ruleBindId
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
    // InternalFortXTrans.g:7856:1: rule__IdOrTuple__BidAssignment_1_1 : ( ruleBindId ) ;
    public final void rule__IdOrTuple__BidAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7860:1: ( ( ruleBindId ) )
            // InternalFortXTrans.g:7861:2: ( ruleBindId )
            {
            // InternalFortXTrans.g:7861:2: ( ruleBindId )
            // InternalFortXTrans.g:7862:3: ruleBindId
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
    // InternalFortXTrans.g:7871:1: rule__IdOrTuple__BidAssignment_1_2_1 : ( ruleBindId ) ;
    public final void rule__IdOrTuple__BidAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7875:1: ( ( ruleBindId ) )
            // InternalFortXTrans.g:7876:2: ( ruleBindId )
            {
            // InternalFortXTrans.g:7876:2: ( ruleBindId )
            // InternalFortXTrans.g:7877:3: ruleBindId
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
    // InternalFortXTrans.g:7886:1: rule__IsType__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__IsType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7890:1: ( ( ruleType ) )
            // InternalFortXTrans.g:7891:2: ( ruleType )
            {
            // InternalFortXTrans.g:7891:2: ( ruleType )
            // InternalFortXTrans.g:7892:3: ruleType
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
    protected DFA16 dfa16 = new DFA16(this);
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
    static final String dfa_9s = "\1\uffff\1\4\1\uffff\1\4\1\uffff\1\4\2\uffff\1\4\2\uffff";
    static final String dfa_10s = "\1\4\1\5\1\4\1\25\1\uffff\1\5\1\4\1\32\1\25\2\uffff";
    static final String dfa_11s = "\1\4\1\46\1\32\1\46\1\uffff\1\46\1\5\1\32\1\46\2\uffff";
    static final String dfa_12s = "\4\uffff\1\3\4\uffff\1\1\1\2";
    static final String dfa_13s = "\13\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\3\17\uffff\1\4\3\uffff\1\2\1\uffff\1\4\11\uffff\2\4",
            "\1\5\25\uffff\1\6",
            "\1\4\3\uffff\1\7\1\uffff\1\4\11\uffff\2\4",
            "",
            "\1\10\17\uffff\1\4\3\uffff\1\2\1\uffff\1\4\11\uffff\2\4",
            "\1\12\1\11",
            "\1\6",
            "\1\4\3\uffff\1\7\1\uffff\1\4\11\uffff\2\4",
            "",
            ""
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
    static final String dfa_18s = "\1\4\1\61\1\uffff\1\4\1\uffff\1\61\1\uffff";
    static final String dfa_19s = "\2\uffff\1\1\1\uffff\1\3\1\uffff\1\2";
    static final String dfa_20s = "\7\uffff}>";
    static final String[] dfa_21s = {
            "\1\1",
            "\1\4\1\2\17\uffff\1\4\2\uffff\1\4\1\3\1\uffff\2\4\1\uffff\3\4\1\uffff\3\4\3\uffff\4\4\1\uffff\3\4\1\uffff\1\4",
            "",
            "\1\5",
            "",
            "\1\4\1\6\17\uffff\1\4\2\uffff\1\4\1\3\1\uffff\2\4\1\uffff\3\4\1\uffff\3\4\3\uffff\4\4\1\uffff\3\4\1\uffff\1\4",
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
    static final String dfa_26s = "\15\uffff";
    static final String dfa_27s = "\1\4\2\41\2\4\2\30\2\uffff\1\4\1\41\2\30";
    static final String dfa_28s = "\1\42\2\41\1\23\1\61\2\34\2\uffff\1\23\1\41\2\34";
    static final String dfa_29s = "\7\uffff\1\1\1\2\4\uffff";
    static final String dfa_30s = "\15\uffff}>";
    static final String[] dfa_31s = {
            "\1\1\16\uffff\1\2\16\uffff\1\3",
            "\1\4",
            "\1\4",
            "\1\5\16\uffff\1\6",
            "\1\7\35\uffff\1\7\1\uffff\1\7\5\uffff\1\7\2\uffff\3\7\1\10\1\7",
            "\1\11\3\uffff\1\12",
            "\1\11\3\uffff\1\12",
            "",
            "",
            "\1\13\16\uffff\1\14",
            "\1\4",
            "\1\11\3\uffff\1\12",
            "\1\11\3\uffff\1\12"
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_26;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "1412:1: rule__Binding__Alternatives : ( ( ( rule__Binding__Group_0__0 ) ) | ( ( rule__Binding__Group_1__0 ) ) );";
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
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002E41400000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002041000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000180200000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002E41400080010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002E41400000012L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000011000000L});

}