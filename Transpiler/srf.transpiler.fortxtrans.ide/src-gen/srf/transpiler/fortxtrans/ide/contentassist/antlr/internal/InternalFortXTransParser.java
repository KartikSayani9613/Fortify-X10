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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOTS", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SD", "RULE_GREATERS", "RULE_LESSES", "RULE_BARS", "RULE_SLASHES", "RULE_LEFT_ENCLOSER", "RULE_RIGHT_ENCLOSER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'_'", "'component'", "'end'", "'api'", "'}'", "','", "'.'", "'{'", "'as'", "')'", "':'", "'('", "'then'", "'elif'", "'else'", "'<-'", "'also'", "'do'", "'='", "'import'", "'export'", "'except'", "'private'", "'test'", "'atomic'", "'io'", "'while'", "'for'", "'if'", "'seq'", "'at'", "'var'", "':='"
    };
    public static final int RULE_BARS=13;
    public static final int T__50=50;
    public static final int RULE_DOTS=5;
    public static final int RULE_LESSES=12;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_ID=4;
    public static final int RULE_GREATERS=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int RULE_LEFT_ENCLOSER=15;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_SLASHES=14;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_RIGHT_ENCLOSER=16;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=17;
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
    public static final int RULE_WS=18;
    public static final int RULE_ANY_OTHER=19;
    public static final int RULE_SD=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=7;
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
    // InternalFortXTrans.g:419:1: ruleDecl : ( ( rule__Decl__Alternatives ) ) ;
    public final void ruleDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:423:2: ( ( ( rule__Decl__Alternatives ) ) )
            // InternalFortXTrans.g:424:2: ( ( rule__Decl__Alternatives ) )
            {
            // InternalFortXTrans.g:424:2: ( ( rule__Decl__Alternatives ) )
            // InternalFortXTrans.g:425:3: ( rule__Decl__Alternatives )
            {
             before(grammarAccess.getDeclAccess().getAlternatives()); 
            // InternalFortXTrans.g:426:3: ( rule__Decl__Alternatives )
            // InternalFortXTrans.g:426:4: rule__Decl__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Decl__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclAccess().getAlternatives()); 

            }


            }

        }
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

                if ( ((LA2_0>=42 && LA2_0<=45)) ) {
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


    // $ANTLR start "entryRuleTupleType"
    // InternalFortXTrans.g:567:1: entryRuleTupleType : ruleTupleType EOF ;
    public final void entryRuleTupleType() throws RecognitionException {
        try {
            // InternalFortXTrans.g:568:1: ( ruleTupleType EOF )
            // InternalFortXTrans.g:569:1: ruleTupleType EOF
            {
             before(grammarAccess.getTupleTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleTupleType();

            state._fsp--;

             after(grammarAccess.getTupleTypeRule()); 
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
    // $ANTLR end "entryRuleTupleType"


    // $ANTLR start "ruleTupleType"
    // InternalFortXTrans.g:576:1: ruleTupleType : ( ( rule__TupleType__Group__0 ) ) ;
    public final void ruleTupleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:580:2: ( ( ( rule__TupleType__Group__0 ) ) )
            // InternalFortXTrans.g:581:2: ( ( rule__TupleType__Group__0 ) )
            {
            // InternalFortXTrans.g:581:2: ( ( rule__TupleType__Group__0 ) )
            // InternalFortXTrans.g:582:3: ( rule__TupleType__Group__0 )
            {
             before(grammarAccess.getTupleTypeAccess().getGroup()); 
            // InternalFortXTrans.g:583:3: ( rule__TupleType__Group__0 )
            // InternalFortXTrans.g:583:4: rule__TupleType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TupleType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTupleTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTupleType"


    // $ANTLR start "entryRuleType"
    // InternalFortXTrans.g:592:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalFortXTrans.g:593:1: ( ruleType EOF )
            // InternalFortXTrans.g:594:1: ruleType EOF
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
    // InternalFortXTrans.g:601:1: ruleType : ( ( rule__Type__TnameAssignment ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:605:2: ( ( ( rule__Type__TnameAssignment ) ) )
            // InternalFortXTrans.g:606:2: ( ( rule__Type__TnameAssignment ) )
            {
            // InternalFortXTrans.g:606:2: ( ( rule__Type__TnameAssignment ) )
            // InternalFortXTrans.g:607:3: ( rule__Type__TnameAssignment )
            {
             before(grammarAccess.getTypeAccess().getTnameAssignment()); 
            // InternalFortXTrans.g:608:3: ( rule__Type__TnameAssignment )
            // InternalFortXTrans.g:608:4: rule__Type__TnameAssignment
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
    // InternalFortXTrans.g:617:1: entryRuleFnDecl : ruleFnDecl EOF ;
    public final void entryRuleFnDecl() throws RecognitionException {
        try {
            // InternalFortXTrans.g:618:1: ( ruleFnDecl EOF )
            // InternalFortXTrans.g:619:1: ruleFnDecl EOF
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
    // InternalFortXTrans.g:626:1: ruleFnDecl : ( ( rule__FnDecl__Group__0 ) ) ;
    public final void ruleFnDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:630:2: ( ( ( rule__FnDecl__Group__0 ) ) )
            // InternalFortXTrans.g:631:2: ( ( rule__FnDecl__Group__0 ) )
            {
            // InternalFortXTrans.g:631:2: ( ( rule__FnDecl__Group__0 ) )
            // InternalFortXTrans.g:632:3: ( rule__FnDecl__Group__0 )
            {
             before(grammarAccess.getFnDeclAccess().getGroup()); 
            // InternalFortXTrans.g:633:3: ( rule__FnDecl__Group__0 )
            // InternalFortXTrans.g:633:4: rule__FnDecl__Group__0
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


    // $ANTLR start "entryRuleFieldDecl"
    // InternalFortXTrans.g:1092:1: entryRuleFieldDecl : ruleFieldDecl EOF ;
    public final void entryRuleFieldDecl() throws RecognitionException {
        try {
            // InternalFortXTrans.g:1093:1: ( ruleFieldDecl EOF )
            // InternalFortXTrans.g:1094:1: ruleFieldDecl EOF
            {
             before(grammarAccess.getFieldDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldDecl();

            state._fsp--;

             after(grammarAccess.getFieldDeclRule()); 
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
    // $ANTLR end "entryRuleFieldDecl"


    // $ANTLR start "ruleFieldDecl"
    // InternalFortXTrans.g:1101:1: ruleFieldDecl : ( ( rule__FieldDecl__Alternatives ) ) ;
    public final void ruleFieldDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1105:2: ( ( ( rule__FieldDecl__Alternatives ) ) )
            // InternalFortXTrans.g:1106:2: ( ( rule__FieldDecl__Alternatives ) )
            {
            // InternalFortXTrans.g:1106:2: ( ( rule__FieldDecl__Alternatives ) )
            // InternalFortXTrans.g:1107:3: ( rule__FieldDecl__Alternatives )
            {
             before(grammarAccess.getFieldDeclAccess().getAlternatives()); 
            // InternalFortXTrans.g:1108:3: ( rule__FieldDecl__Alternatives )
            // InternalFortXTrans.g:1108:4: rule__FieldDecl__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FieldDecl__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldDeclAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldDecl"


    // $ANTLR start "entryRuleNoNewlineVarWTypes"
    // InternalFortXTrans.g:1117:1: entryRuleNoNewlineVarWTypes : ruleNoNewlineVarWTypes EOF ;
    public final void entryRuleNoNewlineVarWTypes() throws RecognitionException {
        try {
            // InternalFortXTrans.g:1118:1: ( ruleNoNewlineVarWTypes EOF )
            // InternalFortXTrans.g:1119:1: ruleNoNewlineVarWTypes EOF
            {
             before(grammarAccess.getNoNewlineVarWTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleNoNewlineVarWTypes();

            state._fsp--;

             after(grammarAccess.getNoNewlineVarWTypesRule()); 
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
    // $ANTLR end "entryRuleNoNewlineVarWTypes"


    // $ANTLR start "ruleNoNewlineVarWTypes"
    // InternalFortXTrans.g:1126:1: ruleNoNewlineVarWTypes : ( ( rule__NoNewlineVarWTypes__Alternatives ) ) ;
    public final void ruleNoNewlineVarWTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1130:2: ( ( ( rule__NoNewlineVarWTypes__Alternatives ) ) )
            // InternalFortXTrans.g:1131:2: ( ( rule__NoNewlineVarWTypes__Alternatives ) )
            {
            // InternalFortXTrans.g:1131:2: ( ( rule__NoNewlineVarWTypes__Alternatives ) )
            // InternalFortXTrans.g:1132:3: ( rule__NoNewlineVarWTypes__Alternatives )
            {
             before(grammarAccess.getNoNewlineVarWTypesAccess().getAlternatives()); 
            // InternalFortXTrans.g:1133:3: ( rule__NoNewlineVarWTypes__Alternatives )
            // InternalFortXTrans.g:1133:4: rule__NoNewlineVarWTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NoNewlineVarWTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoNewlineVarWTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoNewlineVarWTypes"


    // $ANTLR start "entryRuleNoNewlineVarWType"
    // InternalFortXTrans.g:1142:1: entryRuleNoNewlineVarWType : ruleNoNewlineVarWType EOF ;
    public final void entryRuleNoNewlineVarWType() throws RecognitionException {
        try {
            // InternalFortXTrans.g:1143:1: ( ruleNoNewlineVarWType EOF )
            // InternalFortXTrans.g:1144:1: ruleNoNewlineVarWType EOF
            {
             before(grammarAccess.getNoNewlineVarWTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleNoNewlineVarWType();

            state._fsp--;

             after(grammarAccess.getNoNewlineVarWTypeRule()); 
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
    // $ANTLR end "entryRuleNoNewlineVarWType"


    // $ANTLR start "ruleNoNewlineVarWType"
    // InternalFortXTrans.g:1151:1: ruleNoNewlineVarWType : ( ( rule__NoNewlineVarWType__Group__0 ) ) ;
    public final void ruleNoNewlineVarWType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1155:2: ( ( ( rule__NoNewlineVarWType__Group__0 ) ) )
            // InternalFortXTrans.g:1156:2: ( ( rule__NoNewlineVarWType__Group__0 ) )
            {
            // InternalFortXTrans.g:1156:2: ( ( rule__NoNewlineVarWType__Group__0 ) )
            // InternalFortXTrans.g:1157:3: ( rule__NoNewlineVarWType__Group__0 )
            {
             before(grammarAccess.getNoNewlineVarWTypeAccess().getGroup()); 
            // InternalFortXTrans.g:1158:3: ( rule__NoNewlineVarWType__Group__0 )
            // InternalFortXTrans.g:1158:4: rule__NoNewlineVarWType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NoNewlineVarWType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoNewlineVarWTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoNewlineVarWType"


    // $ANTLR start "entryRuleInitVal"
    // InternalFortXTrans.g:1167:1: entryRuleInitVal : ruleInitVal EOF ;
    public final void entryRuleInitVal() throws RecognitionException {
        try {
            // InternalFortXTrans.g:1168:1: ( ruleInitVal EOF )
            // InternalFortXTrans.g:1169:1: ruleInitVal EOF
            {
             before(grammarAccess.getInitValRule()); 
            pushFollow(FOLLOW_1);
            ruleInitVal();

            state._fsp--;

             after(grammarAccess.getInitValRule()); 
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
    // $ANTLR end "entryRuleInitVal"


    // $ANTLR start "ruleInitVal"
    // InternalFortXTrans.g:1176:1: ruleInitVal : ( ( rule__InitVal__Alternatives ) ) ;
    public final void ruleInitVal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1180:2: ( ( ( rule__InitVal__Alternatives ) ) )
            // InternalFortXTrans.g:1181:2: ( ( rule__InitVal__Alternatives ) )
            {
            // InternalFortXTrans.g:1181:2: ( ( rule__InitVal__Alternatives ) )
            // InternalFortXTrans.g:1182:3: ( rule__InitVal__Alternatives )
            {
             before(grammarAccess.getInitValAccess().getAlternatives()); 
            // InternalFortXTrans.g:1183:3: ( rule__InitVal__Alternatives )
            // InternalFortXTrans.g:1183:4: rule__InitVal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InitVal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInitValAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitVal"


    // $ANTLR start "entryRuleLiteralTuple"
    // InternalFortXTrans.g:1192:1: entryRuleLiteralTuple : ruleLiteralTuple EOF ;
    public final void entryRuleLiteralTuple() throws RecognitionException {
        try {
            // InternalFortXTrans.g:1193:1: ( ruleLiteralTuple EOF )
            // InternalFortXTrans.g:1194:1: ruleLiteralTuple EOF
            {
             before(grammarAccess.getLiteralTupleRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralTuple();

            state._fsp--;

             after(grammarAccess.getLiteralTupleRule()); 
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
    // $ANTLR end "entryRuleLiteralTuple"


    // $ANTLR start "ruleLiteralTuple"
    // InternalFortXTrans.g:1201:1: ruleLiteralTuple : ( ( rule__LiteralTuple__Alternatives ) ) ;
    public final void ruleLiteralTuple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1205:2: ( ( ( rule__LiteralTuple__Alternatives ) ) )
            // InternalFortXTrans.g:1206:2: ( ( rule__LiteralTuple__Alternatives ) )
            {
            // InternalFortXTrans.g:1206:2: ( ( rule__LiteralTuple__Alternatives ) )
            // InternalFortXTrans.g:1207:3: ( rule__LiteralTuple__Alternatives )
            {
             before(grammarAccess.getLiteralTupleAccess().getAlternatives()); 
            // InternalFortXTrans.g:1208:3: ( rule__LiteralTuple__Alternatives )
            // InternalFortXTrans.g:1208:4: rule__LiteralTuple__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LiteralTuple__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralTupleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralTuple"


    // $ANTLR start "entryRuleLiteral"
    // InternalFortXTrans.g:1217:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalFortXTrans.g:1218:1: ( ruleLiteral EOF )
            // InternalFortXTrans.g:1219:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalFortXTrans.g:1226:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1230:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalFortXTrans.g:1231:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalFortXTrans.g:1231:2: ( ( rule__Literal__Alternatives ) )
            // InternalFortXTrans.g:1232:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalFortXTrans.g:1233:3: ( rule__Literal__Alternatives )
            // InternalFortXTrans.g:1233:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalFortXTrans.g:1241:1: rule__Model__Alternatives : ( ( ruleComponent ) | ( ruleAPI ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1245:1: ( ( ruleComponent ) | ( ruleAPI ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFortXTrans.g:1246:2: ( ruleComponent )
                    {
                    // InternalFortXTrans.g:1246:2: ( ruleComponent )
                    // InternalFortXTrans.g:1247:3: ruleComponent
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
                    // InternalFortXTrans.g:1252:2: ( ruleAPI )
                    {
                    // InternalFortXTrans.g:1252:2: ( ruleAPI )
                    // InternalFortXTrans.g:1253:3: ruleAPI
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
    // InternalFortXTrans.g:1262:1: rule__Import__Alternatives : ( ( ( rule__Import__Group_0__0 ) ) | ( ( rule__Import__Group_1__0 ) ) );
    public final void rule__Import__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1266:1: ( ( ( rule__Import__Group_0__0 ) ) | ( ( rule__Import__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==39) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    alt4=1;
                }
                else if ( (LA4_1==23) ) {
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
                    // InternalFortXTrans.g:1267:2: ( ( rule__Import__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1267:2: ( ( rule__Import__Group_0__0 ) )
                    // InternalFortXTrans.g:1268:3: ( rule__Import__Group_0__0 )
                    {
                     before(grammarAccess.getImportAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1269:3: ( rule__Import__Group_0__0 )
                    // InternalFortXTrans.g:1269:4: rule__Import__Group_0__0
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
                    // InternalFortXTrans.g:1273:2: ( ( rule__Import__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1273:2: ( ( rule__Import__Group_1__0 ) )
                    // InternalFortXTrans.g:1274:3: ( rule__Import__Group_1__0 )
                    {
                     before(grammarAccess.getImportAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1275:3: ( rule__Import__Group_1__0 )
                    // InternalFortXTrans.g:1275:4: rule__Import__Group_1__0
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
    // InternalFortXTrans.g:1283:1: rule__Export__Alternatives : ( ( ( rule__Export__Group_0__0 ) ) | ( ( rule__Export__Group_1__0 ) ) );
    public final void rule__Export__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1287:1: ( ( ( rule__Export__Group_0__0 ) ) | ( ( rule__Export__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==40) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    alt5=1;
                }
                else if ( (LA5_1==27) ) {
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
                    // InternalFortXTrans.g:1288:2: ( ( rule__Export__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1288:2: ( ( rule__Export__Group_0__0 ) )
                    // InternalFortXTrans.g:1289:3: ( rule__Export__Group_0__0 )
                    {
                     before(grammarAccess.getExportAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1290:3: ( rule__Export__Group_0__0 )
                    // InternalFortXTrans.g:1290:4: rule__Export__Group_0__0
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
                    // InternalFortXTrans.g:1294:2: ( ( rule__Export__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1294:2: ( ( rule__Export__Group_1__0 ) )
                    // InternalFortXTrans.g:1295:3: ( rule__Export__Group_1__0 )
                    {
                     before(grammarAccess.getExportAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1296:3: ( rule__Export__Group_1__0 )
                    // InternalFortXTrans.g:1296:4: rule__Export__Group_1__0
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
    // InternalFortXTrans.g:1304:1: rule__ImportedNames__Alternatives : ( ( ( rule__ImportedNames__Group_0__0 ) ) | ( ( rule__ImportedNames__Group_1__0 ) ) | ( ( rule__ImportedNames__Group_2__0 ) ) );
    public final void rule__ImportedNames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1308:1: ( ( ( rule__ImportedNames__Group_0__0 ) ) | ( ( rule__ImportedNames__Group_1__0 ) ) | ( ( rule__ImportedNames__Group_2__0 ) ) )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalFortXTrans.g:1309:2: ( ( rule__ImportedNames__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1309:2: ( ( rule__ImportedNames__Group_0__0 ) )
                    // InternalFortXTrans.g:1310:3: ( rule__ImportedNames__Group_0__0 )
                    {
                     before(grammarAccess.getImportedNamesAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1311:3: ( rule__ImportedNames__Group_0__0 )
                    // InternalFortXTrans.g:1311:4: rule__ImportedNames__Group_0__0
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
                    // InternalFortXTrans.g:1315:2: ( ( rule__ImportedNames__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1315:2: ( ( rule__ImportedNames__Group_1__0 ) )
                    // InternalFortXTrans.g:1316:3: ( rule__ImportedNames__Group_1__0 )
                    {
                     before(grammarAccess.getImportedNamesAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1317:3: ( rule__ImportedNames__Group_1__0 )
                    // InternalFortXTrans.g:1317:4: rule__ImportedNames__Group_1__0
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
                    // InternalFortXTrans.g:1321:2: ( ( rule__ImportedNames__Group_2__0 ) )
                    {
                    // InternalFortXTrans.g:1321:2: ( ( rule__ImportedNames__Group_2__0 ) )
                    // InternalFortXTrans.g:1322:3: ( rule__ImportedNames__Group_2__0 )
                    {
                     before(grammarAccess.getImportedNamesAccess().getGroup_2()); 
                    // InternalFortXTrans.g:1323:3: ( rule__ImportedNames__Group_2__0 )
                    // InternalFortXTrans.g:1323:4: rule__ImportedNames__Group_2__0
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
    // InternalFortXTrans.g:1331:1: rule__QualifiedName__Alternatives : ( ( ( rule__QualifiedName__Group_0__0 ) ) | ( ( rule__QualifiedName__Group_1__0 ) ) | ( ( rule__QualifiedName__Group_2__0 ) ) );
    public final void rule__QualifiedName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1335:1: ( ( ( rule__QualifiedName__Group_0__0 ) ) | ( ( rule__QualifiedName__Group_1__0 ) ) | ( ( rule__QualifiedName__Group_2__0 ) ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalFortXTrans.g:1336:2: ( ( rule__QualifiedName__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1336:2: ( ( rule__QualifiedName__Group_0__0 ) )
                    // InternalFortXTrans.g:1337:3: ( rule__QualifiedName__Group_0__0 )
                    {
                     before(grammarAccess.getQualifiedNameAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1338:3: ( rule__QualifiedName__Group_0__0 )
                    // InternalFortXTrans.g:1338:4: rule__QualifiedName__Group_0__0
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
                    // InternalFortXTrans.g:1342:2: ( ( rule__QualifiedName__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1342:2: ( ( rule__QualifiedName__Group_1__0 ) )
                    // InternalFortXTrans.g:1343:3: ( rule__QualifiedName__Group_1__0 )
                    {
                     before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1344:3: ( rule__QualifiedName__Group_1__0 )
                    // InternalFortXTrans.g:1344:4: rule__QualifiedName__Group_1__0
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
                    // InternalFortXTrans.g:1348:2: ( ( rule__QualifiedName__Group_2__0 ) )
                    {
                    // InternalFortXTrans.g:1348:2: ( ( rule__QualifiedName__Group_2__0 ) )
                    // InternalFortXTrans.g:1349:3: ( rule__QualifiedName__Group_2__0 )
                    {
                     before(grammarAccess.getQualifiedNameAccess().getGroup_2()); 
                    // InternalFortXTrans.g:1350:3: ( rule__QualifiedName__Group_2__0 )
                    // InternalFortXTrans.g:1350:4: rule__QualifiedName__Group_2__0
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
    // InternalFortXTrans.g:1358:1: rule__APIName__Alternatives : ( ( ( rule__APIName__Group_0__0 ) ) | ( ( rule__APIName__Group_1__0 ) ) | ( ( rule__APIName__Group_2__0 ) ) );
    public final void rule__APIName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1362:1: ( ( ( rule__APIName__Group_0__0 ) ) | ( ( rule__APIName__Group_1__0 ) ) | ( ( rule__APIName__Group_2__0 ) ) )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalFortXTrans.g:1363:2: ( ( rule__APIName__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1363:2: ( ( rule__APIName__Group_0__0 ) )
                    // InternalFortXTrans.g:1364:3: ( rule__APIName__Group_0__0 )
                    {
                     before(grammarAccess.getAPINameAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1365:3: ( rule__APIName__Group_0__0 )
                    // InternalFortXTrans.g:1365:4: rule__APIName__Group_0__0
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
                    // InternalFortXTrans.g:1369:2: ( ( rule__APIName__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1369:2: ( ( rule__APIName__Group_1__0 ) )
                    // InternalFortXTrans.g:1370:3: ( rule__APIName__Group_1__0 )
                    {
                     before(grammarAccess.getAPINameAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1371:3: ( rule__APIName__Group_1__0 )
                    // InternalFortXTrans.g:1371:4: rule__APIName__Group_1__0
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
                    // InternalFortXTrans.g:1375:2: ( ( rule__APIName__Group_2__0 ) )
                    {
                    // InternalFortXTrans.g:1375:2: ( ( rule__APIName__Group_2__0 ) )
                    // InternalFortXTrans.g:1376:3: ( rule__APIName__Group_2__0 )
                    {
                     before(grammarAccess.getAPINameAccess().getGroup_2()); 
                    // InternalFortXTrans.g:1377:3: ( rule__APIName__Group_2__0 )
                    // InternalFortXTrans.g:1377:4: rule__APIName__Group_2__0
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
    // InternalFortXTrans.g:1385:1: rule__SimpleNames__Alternatives : ( ( ( rule__SimpleNames__NameListAssignment_0 ) ) | ( ( rule__SimpleNames__Group_1__0 ) ) );
    public final void rule__SimpleNames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1389:1: ( ( ( rule__SimpleNames__NameListAssignment_0 ) ) | ( ( rule__SimpleNames__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==27) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalFortXTrans.g:1390:2: ( ( rule__SimpleNames__NameListAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1390:2: ( ( rule__SimpleNames__NameListAssignment_0 ) )
                    // InternalFortXTrans.g:1391:3: ( rule__SimpleNames__NameListAssignment_0 )
                    {
                     before(grammarAccess.getSimpleNamesAccess().getNameListAssignment_0()); 
                    // InternalFortXTrans.g:1392:3: ( rule__SimpleNames__NameListAssignment_0 )
                    // InternalFortXTrans.g:1392:4: rule__SimpleNames__NameListAssignment_0
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
                    // InternalFortXTrans.g:1396:2: ( ( rule__SimpleNames__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1396:2: ( ( rule__SimpleNames__Group_1__0 ) )
                    // InternalFortXTrans.g:1397:3: ( rule__SimpleNames__Group_1__0 )
                    {
                     before(grammarAccess.getSimpleNamesAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1398:3: ( rule__SimpleNames__Group_1__0 )
                    // InternalFortXTrans.g:1398:4: rule__SimpleNames__Group_1__0
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
    // InternalFortXTrans.g:1406:1: rule__AliasedAPINames__Alternatives : ( ( ( rule__AliasedAPINames__NameListAssignment_0 ) ) | ( ( rule__AliasedAPINames__Group_1__0 ) ) );
    public final void rule__AliasedAPINames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1410:1: ( ( ( rule__AliasedAPINames__NameListAssignment_0 ) ) | ( ( rule__AliasedAPINames__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==27) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalFortXTrans.g:1411:2: ( ( rule__AliasedAPINames__NameListAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1411:2: ( ( rule__AliasedAPINames__NameListAssignment_0 ) )
                    // InternalFortXTrans.g:1412:3: ( rule__AliasedAPINames__NameListAssignment_0 )
                    {
                     before(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_0()); 
                    // InternalFortXTrans.g:1413:3: ( rule__AliasedAPINames__NameListAssignment_0 )
                    // InternalFortXTrans.g:1413:4: rule__AliasedAPINames__NameListAssignment_0
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
                    // InternalFortXTrans.g:1417:2: ( ( rule__AliasedAPINames__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1417:2: ( ( rule__AliasedAPINames__Group_1__0 ) )
                    // InternalFortXTrans.g:1418:3: ( rule__AliasedAPINames__Group_1__0 )
                    {
                     before(grammarAccess.getAliasedAPINamesAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1419:3: ( rule__AliasedAPINames__Group_1__0 )
                    // InternalFortXTrans.g:1419:4: rule__AliasedAPINames__Group_1__0
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


    // $ANTLR start "rule__Decl__Alternatives"
    // InternalFortXTrans.g:1427:1: rule__Decl__Alternatives : ( ( ( rule__Decl__FunctionAssignment_0 ) ) | ( ( rule__Decl__FieldAssignment_1 ) ) );
    public final void rule__Decl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1431:1: ( ( ( rule__Decl__FunctionAssignment_0 ) ) | ( ( rule__Decl__FieldAssignment_1 ) ) )
            int alt11=2;
            switch ( input.LA(1) ) {
            case 42:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3==30||LA11_3==38) ) {
                        alt11=2;
                    }
                    else if ( (LA11_3==RULE_ID||LA11_3==20||LA11_3==31) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 20:
                case 31:
                case 51:
                    {
                    alt11=2;
                    }
                    break;
                case 42:
                case 43:
                case 44:
                case 45:
                    {
                    alt11=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

                }
                break;
            case 43:
            case 44:
            case 45:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==30||LA11_3==38) ) {
                    alt11=2;
                }
                else if ( (LA11_3==RULE_ID||LA11_3==20||LA11_3==31) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case 20:
            case 31:
            case 51:
                {
                alt11=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalFortXTrans.g:1432:2: ( ( rule__Decl__FunctionAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1432:2: ( ( rule__Decl__FunctionAssignment_0 ) )
                    // InternalFortXTrans.g:1433:3: ( rule__Decl__FunctionAssignment_0 )
                    {
                     before(grammarAccess.getDeclAccess().getFunctionAssignment_0()); 
                    // InternalFortXTrans.g:1434:3: ( rule__Decl__FunctionAssignment_0 )
                    // InternalFortXTrans.g:1434:4: rule__Decl__FunctionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Decl__FunctionAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclAccess().getFunctionAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1438:2: ( ( rule__Decl__FieldAssignment_1 ) )
                    {
                    // InternalFortXTrans.g:1438:2: ( ( rule__Decl__FieldAssignment_1 ) )
                    // InternalFortXTrans.g:1439:3: ( rule__Decl__FieldAssignment_1 )
                    {
                     before(grammarAccess.getDeclAccess().getFieldAssignment_1()); 
                    // InternalFortXTrans.g:1440:3: ( rule__Decl__FieldAssignment_1 )
                    // InternalFortXTrans.g:1440:4: rule__Decl__FieldAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Decl__FieldAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclAccess().getFieldAssignment_1()); 

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
    // $ANTLR end "rule__Decl__Alternatives"


    // $ANTLR start "rule__FnMod__Alternatives"
    // InternalFortXTrans.g:1448:1: rule__FnMod__Alternatives : ( ( ( rule__FnMod__ModtypeAssignment_0 ) ) | ( ( rule__FnMod__ModtypeAssignment_1 ) ) | ( ( rule__FnMod__ModtypeAssignment_2 ) ) | ( ( rule__FnMod__ModtypeAssignment_3 ) ) );
    public final void rule__FnMod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1452:1: ( ( ( rule__FnMod__ModtypeAssignment_0 ) ) | ( ( rule__FnMod__ModtypeAssignment_1 ) ) | ( ( rule__FnMod__ModtypeAssignment_2 ) ) | ( ( rule__FnMod__ModtypeAssignment_3 ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt12=1;
                }
                break;
            case 43:
                {
                alt12=2;
                }
                break;
            case 44:
                {
                alt12=3;
                }
                break;
            case 45:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalFortXTrans.g:1453:2: ( ( rule__FnMod__ModtypeAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1453:2: ( ( rule__FnMod__ModtypeAssignment_0 ) )
                    // InternalFortXTrans.g:1454:3: ( rule__FnMod__ModtypeAssignment_0 )
                    {
                     before(grammarAccess.getFnModAccess().getModtypeAssignment_0()); 
                    // InternalFortXTrans.g:1455:3: ( rule__FnMod__ModtypeAssignment_0 )
                    // InternalFortXTrans.g:1455:4: rule__FnMod__ModtypeAssignment_0
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
                    // InternalFortXTrans.g:1459:2: ( ( rule__FnMod__ModtypeAssignment_1 ) )
                    {
                    // InternalFortXTrans.g:1459:2: ( ( rule__FnMod__ModtypeAssignment_1 ) )
                    // InternalFortXTrans.g:1460:3: ( rule__FnMod__ModtypeAssignment_1 )
                    {
                     before(grammarAccess.getFnModAccess().getModtypeAssignment_1()); 
                    // InternalFortXTrans.g:1461:3: ( rule__FnMod__ModtypeAssignment_1 )
                    // InternalFortXTrans.g:1461:4: rule__FnMod__ModtypeAssignment_1
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
                    // InternalFortXTrans.g:1465:2: ( ( rule__FnMod__ModtypeAssignment_2 ) )
                    {
                    // InternalFortXTrans.g:1465:2: ( ( rule__FnMod__ModtypeAssignment_2 ) )
                    // InternalFortXTrans.g:1466:3: ( rule__FnMod__ModtypeAssignment_2 )
                    {
                     before(grammarAccess.getFnModAccess().getModtypeAssignment_2()); 
                    // InternalFortXTrans.g:1467:3: ( rule__FnMod__ModtypeAssignment_2 )
                    // InternalFortXTrans.g:1467:4: rule__FnMod__ModtypeAssignment_2
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
                    // InternalFortXTrans.g:1471:2: ( ( rule__FnMod__ModtypeAssignment_3 ) )
                    {
                    // InternalFortXTrans.g:1471:2: ( ( rule__FnMod__ModtypeAssignment_3 ) )
                    // InternalFortXTrans.g:1472:3: ( rule__FnMod__ModtypeAssignment_3 )
                    {
                     before(grammarAccess.getFnModAccess().getModtypeAssignment_3()); 
                    // InternalFortXTrans.g:1473:3: ( rule__FnMod__ModtypeAssignment_3 )
                    // InternalFortXTrans.g:1473:4: rule__FnMod__ModtypeAssignment_3
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
    // InternalFortXTrans.g:1481:1: rule__ValParam__Alternatives : ( ( ( rule__ValParam__ParamsAssignment_0 ) ) | ( ( rule__ValParam__Group_1__0 ) ) );
    public final void rule__ValParam__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1485:1: ( ( ( rule__ValParam__ParamsAssignment_0 ) ) | ( ( rule__ValParam__Group_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||LA13_0==20) ) {
                alt13=1;
            }
            else if ( (LA13_0==31) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalFortXTrans.g:1486:2: ( ( rule__ValParam__ParamsAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1486:2: ( ( rule__ValParam__ParamsAssignment_0 ) )
                    // InternalFortXTrans.g:1487:3: ( rule__ValParam__ParamsAssignment_0 )
                    {
                     before(grammarAccess.getValParamAccess().getParamsAssignment_0()); 
                    // InternalFortXTrans.g:1488:3: ( rule__ValParam__ParamsAssignment_0 )
                    // InternalFortXTrans.g:1488:4: rule__ValParam__ParamsAssignment_0
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
                    // InternalFortXTrans.g:1492:2: ( ( rule__ValParam__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1492:2: ( ( rule__ValParam__Group_1__0 ) )
                    // InternalFortXTrans.g:1493:3: ( rule__ValParam__Group_1__0 )
                    {
                     before(grammarAccess.getValParamAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1494:3: ( rule__ValParam__Group_1__0 )
                    // InternalFortXTrans.g:1494:4: rule__ValParam__Group_1__0
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
    // InternalFortXTrans.g:1502:1: rule__RetType__Alternatives : ( ( ( rule__RetType__Group_0__0 ) ) | ( ( rule__RetType__Group_1__0 ) ) );
    public final void rule__RetType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1506:1: ( ( ( rule__RetType__Group_0__0 ) ) | ( ( rule__RetType__Group_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_ID) ) {
                    alt14=2;
                }
                else if ( (LA14_1==31) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalFortXTrans.g:1507:2: ( ( rule__RetType__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1507:2: ( ( rule__RetType__Group_0__0 ) )
                    // InternalFortXTrans.g:1508:3: ( rule__RetType__Group_0__0 )
                    {
                     before(grammarAccess.getRetTypeAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1509:3: ( rule__RetType__Group_0__0 )
                    // InternalFortXTrans.g:1509:4: rule__RetType__Group_0__0
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
                    // InternalFortXTrans.g:1513:2: ( ( rule__RetType__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1513:2: ( ( rule__RetType__Group_1__0 ) )
                    // InternalFortXTrans.g:1514:3: ( rule__RetType__Group_1__0 )
                    {
                     before(grammarAccess.getRetTypeAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1515:3: ( rule__RetType__Group_1__0 )
                    // InternalFortXTrans.g:1515:4: rule__RetType__Group_1__0
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
    // InternalFortXTrans.g:1523:1: rule__ExprFront__Alternatives : ( ( ( rule__ExprFront__DelimAssignment_0 ) ) | ( ( rule__ExprFront__IdAssignment_1 ) ) );
    public final void rule__ExprFront__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1527:1: ( ( ( rule__ExprFront__DelimAssignment_0 ) ) | ( ( rule__ExprFront__IdAssignment_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31||LA15_0==37||LA15_0==44||(LA15_0>=46 && LA15_0<=48)||LA15_0==50) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalFortXTrans.g:1528:2: ( ( rule__ExprFront__DelimAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1528:2: ( ( rule__ExprFront__DelimAssignment_0 ) )
                    // InternalFortXTrans.g:1529:3: ( rule__ExprFront__DelimAssignment_0 )
                    {
                     before(grammarAccess.getExprFrontAccess().getDelimAssignment_0()); 
                    // InternalFortXTrans.g:1530:3: ( rule__ExprFront__DelimAssignment_0 )
                    // InternalFortXTrans.g:1530:4: rule__ExprFront__DelimAssignment_0
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
                    // InternalFortXTrans.g:1534:2: ( ( rule__ExprFront__IdAssignment_1 ) )
                    {
                    // InternalFortXTrans.g:1534:2: ( ( rule__ExprFront__IdAssignment_1 ) )
                    // InternalFortXTrans.g:1535:3: ( rule__ExprFront__IdAssignment_1 )
                    {
                     before(grammarAccess.getExprFrontAccess().getIdAssignment_1()); 
                    // InternalFortXTrans.g:1536:3: ( rule__ExprFront__IdAssignment_1 )
                    // InternalFortXTrans.g:1536:4: rule__ExprFront__IdAssignment_1
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
    // InternalFortXTrans.g:1544:1: rule__DelimitedExpr__Alternatives : ( ( ( rule__DelimitedExpr__DodAssignment_0 ) ) | ( ( rule__DelimitedExpr__Group_1__0 ) ) | ( ( rule__DelimitedExpr__Group_2__0 ) ) | ( ( rule__DelimitedExpr__Group_3__0 ) ) | ( ( rule__DelimitedExpr__ParAssignment_4 ) ) );
    public final void rule__DelimitedExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1548:1: ( ( ( rule__DelimitedExpr__DodAssignment_0 ) ) | ( ( rule__DelimitedExpr__Group_1__0 ) ) | ( ( rule__DelimitedExpr__Group_2__0 ) ) | ( ( rule__DelimitedExpr__Group_3__0 ) ) | ( ( rule__DelimitedExpr__ParAssignment_4 ) ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 37:
            case 44:
            case 50:
                {
                alt16=1;
                }
                break;
            case 46:
                {
                alt16=2;
                }
                break;
            case 47:
                {
                alt16=3;
                }
                break;
            case 48:
                {
                alt16=4;
                }
                break;
            case 31:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalFortXTrans.g:1549:2: ( ( rule__DelimitedExpr__DodAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1549:2: ( ( rule__DelimitedExpr__DodAssignment_0 ) )
                    // InternalFortXTrans.g:1550:3: ( rule__DelimitedExpr__DodAssignment_0 )
                    {
                     before(grammarAccess.getDelimitedExprAccess().getDodAssignment_0()); 
                    // InternalFortXTrans.g:1551:3: ( rule__DelimitedExpr__DodAssignment_0 )
                    // InternalFortXTrans.g:1551:4: rule__DelimitedExpr__DodAssignment_0
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
                    // InternalFortXTrans.g:1555:2: ( ( rule__DelimitedExpr__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1555:2: ( ( rule__DelimitedExpr__Group_1__0 ) )
                    // InternalFortXTrans.g:1556:3: ( rule__DelimitedExpr__Group_1__0 )
                    {
                     before(grammarAccess.getDelimitedExprAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1557:3: ( rule__DelimitedExpr__Group_1__0 )
                    // InternalFortXTrans.g:1557:4: rule__DelimitedExpr__Group_1__0
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
                    // InternalFortXTrans.g:1561:2: ( ( rule__DelimitedExpr__Group_2__0 ) )
                    {
                    // InternalFortXTrans.g:1561:2: ( ( rule__DelimitedExpr__Group_2__0 ) )
                    // InternalFortXTrans.g:1562:3: ( rule__DelimitedExpr__Group_2__0 )
                    {
                     before(grammarAccess.getDelimitedExprAccess().getGroup_2()); 
                    // InternalFortXTrans.g:1563:3: ( rule__DelimitedExpr__Group_2__0 )
                    // InternalFortXTrans.g:1563:4: rule__DelimitedExpr__Group_2__0
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
                    // InternalFortXTrans.g:1567:2: ( ( rule__DelimitedExpr__Group_3__0 ) )
                    {
                    // InternalFortXTrans.g:1567:2: ( ( rule__DelimitedExpr__Group_3__0 ) )
                    // InternalFortXTrans.g:1568:3: ( rule__DelimitedExpr__Group_3__0 )
                    {
                     before(grammarAccess.getDelimitedExprAccess().getGroup_3()); 
                    // InternalFortXTrans.g:1569:3: ( rule__DelimitedExpr__Group_3__0 )
                    // InternalFortXTrans.g:1569:4: rule__DelimitedExpr__Group_3__0
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
                    // InternalFortXTrans.g:1573:2: ( ( rule__DelimitedExpr__ParAssignment_4 ) )
                    {
                    // InternalFortXTrans.g:1573:2: ( ( rule__DelimitedExpr__ParAssignment_4 ) )
                    // InternalFortXTrans.g:1574:3: ( rule__DelimitedExpr__ParAssignment_4 )
                    {
                     before(grammarAccess.getDelimitedExprAccess().getParAssignment_4()); 
                    // InternalFortXTrans.g:1575:3: ( rule__DelimitedExpr__ParAssignment_4 )
                    // InternalFortXTrans.g:1575:4: rule__DelimitedExpr__ParAssignment_4
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
    // InternalFortXTrans.g:1583:1: rule__Binding__Alternatives : ( ( ( rule__Binding__Group_0__0 ) ) | ( ( rule__Binding__Group_1__0 ) ) );
    public final void rule__Binding__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1587:1: ( ( ( rule__Binding__Group_0__0 ) ) | ( ( rule__Binding__Group_1__0 ) ) )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalFortXTrans.g:1588:2: ( ( rule__Binding__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1588:2: ( ( rule__Binding__Group_0__0 ) )
                    // InternalFortXTrans.g:1589:3: ( rule__Binding__Group_0__0 )
                    {
                     before(grammarAccess.getBindingAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1590:3: ( rule__Binding__Group_0__0 )
                    // InternalFortXTrans.g:1590:4: rule__Binding__Group_0__0
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
                    // InternalFortXTrans.g:1594:2: ( ( rule__Binding__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1594:2: ( ( rule__Binding__Group_1__0 ) )
                    // InternalFortXTrans.g:1595:3: ( rule__Binding__Group_1__0 )
                    {
                     before(grammarAccess.getBindingAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1596:3: ( rule__Binding__Group_1__0 )
                    // InternalFortXTrans.g:1596:4: rule__Binding__Group_1__0
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
    // InternalFortXTrans.g:1604:1: rule__GenClause__Alternatives : ( ( ( rule__GenClause__BindingAssignment_0 ) ) | ( ( rule__GenClause__ExprAssignment_1 ) ) );
    public final void rule__GenClause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1608:1: ( ( ( rule__GenClause__BindingAssignment_0 ) ) | ( ( rule__GenClause__ExprAssignment_1 ) ) )
            int alt18=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==35) ) {
                    alt18=1;
                }
                else if ( (LA18_1==EOF||LA18_1==RULE_DOTS||(LA18_1>=25 && LA18_1<=26)||LA18_1==28||LA18_1==37||LA18_1==44||LA18_1==50) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt18=1;
                }
                break;
            case 31:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    switch ( input.LA(3) ) {
                    case 25:
                        {
                        alt18=1;
                        }
                        break;
                    case 29:
                        {
                        int LA18_6 = input.LA(4);

                        if ( (LA18_6==35) ) {
                            alt18=1;
                        }
                        else if ( (LA18_6==EOF||LA18_6==25||LA18_6==28||LA18_6==37||LA18_6==44||LA18_6==50) ) {
                            alt18=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_DOTS:
                    case 26:
                    case 28:
                        {
                        alt18=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 5, input);

                        throw nvae;
                    }

                    }
                    break;
                case 20:
                    {
                    alt18=1;
                    }
                    break;
                case 31:
                case 37:
                case 44:
                case 46:
                case 47:
                case 48:
                case 50:
                    {
                    alt18=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 3, input);

                    throw nvae;
                }

                }
                break;
            case 37:
            case 44:
            case 46:
            case 47:
            case 48:
            case 50:
                {
                alt18=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalFortXTrans.g:1609:2: ( ( rule__GenClause__BindingAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1609:2: ( ( rule__GenClause__BindingAssignment_0 ) )
                    // InternalFortXTrans.g:1610:3: ( rule__GenClause__BindingAssignment_0 )
                    {
                     before(grammarAccess.getGenClauseAccess().getBindingAssignment_0()); 
                    // InternalFortXTrans.g:1611:3: ( rule__GenClause__BindingAssignment_0 )
                    // InternalFortXTrans.g:1611:4: rule__GenClause__BindingAssignment_0
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
                    // InternalFortXTrans.g:1615:2: ( ( rule__GenClause__ExprAssignment_1 ) )
                    {
                    // InternalFortXTrans.g:1615:2: ( ( rule__GenClause__ExprAssignment_1 ) )
                    // InternalFortXTrans.g:1616:3: ( rule__GenClause__ExprAssignment_1 )
                    {
                     before(grammarAccess.getGenClauseAccess().getExprAssignment_1()); 
                    // InternalFortXTrans.g:1617:3: ( rule__GenClause__ExprAssignment_1 )
                    // InternalFortXTrans.g:1617:4: rule__GenClause__ExprAssignment_1
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
    // InternalFortXTrans.g:1625:1: rule__IdOrTuple__Alternatives : ( ( ( rule__IdOrTuple__BidAssignment_0 ) ) | ( ( rule__IdOrTuple__Group_1__0 ) ) );
    public final void rule__IdOrTuple__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1629:1: ( ( ( rule__IdOrTuple__BidAssignment_0 ) ) | ( ( rule__IdOrTuple__Group_1__0 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||LA19_0==20) ) {
                alt19=1;
            }
            else if ( (LA19_0==31) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalFortXTrans.g:1630:2: ( ( rule__IdOrTuple__BidAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1630:2: ( ( rule__IdOrTuple__BidAssignment_0 ) )
                    // InternalFortXTrans.g:1631:3: ( rule__IdOrTuple__BidAssignment_0 )
                    {
                     before(grammarAccess.getIdOrTupleAccess().getBidAssignment_0()); 
                    // InternalFortXTrans.g:1632:3: ( rule__IdOrTuple__BidAssignment_0 )
                    // InternalFortXTrans.g:1632:4: rule__IdOrTuple__BidAssignment_0
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
                    // InternalFortXTrans.g:1636:2: ( ( rule__IdOrTuple__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1636:2: ( ( rule__IdOrTuple__Group_1__0 ) )
                    // InternalFortXTrans.g:1637:3: ( rule__IdOrTuple__Group_1__0 )
                    {
                     before(grammarAccess.getIdOrTupleAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1638:3: ( rule__IdOrTuple__Group_1__0 )
                    // InternalFortXTrans.g:1638:4: rule__IdOrTuple__Group_1__0
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
    // InternalFortXTrans.g:1646:1: rule__BindId__Alternatives : ( ( RULE_ID ) | ( '_' ) );
    public final void rule__BindId__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1650:1: ( ( RULE_ID ) | ( '_' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==20) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalFortXTrans.g:1651:2: ( RULE_ID )
                    {
                    // InternalFortXTrans.g:1651:2: ( RULE_ID )
                    // InternalFortXTrans.g:1652:3: RULE_ID
                    {
                     before(grammarAccess.getBindIdAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getBindIdAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1657:2: ( '_' )
                    {
                    // InternalFortXTrans.g:1657:2: ( '_' )
                    // InternalFortXTrans.g:1658:3: '_'
                    {
                     before(grammarAccess.getBindIdAccess().get_Keyword_1()); 
                    match(input,20,FOLLOW_2); 
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


    // $ANTLR start "rule__FieldDecl__Alternatives"
    // InternalFortXTrans.g:1667:1: rule__FieldDecl__Alternatives : ( ( ( rule__FieldDecl__Group_0__0 ) ) | ( ( rule__FieldDecl__Group_1__0 ) ) | ( ( rule__FieldDecl__Group_2__0 ) ) | ( ( rule__FieldDecl__Group_3__0 ) ) );
    public final void rule__FieldDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1671:1: ( ( ( rule__FieldDecl__Group_0__0 ) ) | ( ( rule__FieldDecl__Group_1__0 ) ) | ( ( rule__FieldDecl__Group_2__0 ) ) | ( ( rule__FieldDecl__Group_3__0 ) ) )
            int alt21=4;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalFortXTrans.g:1672:2: ( ( rule__FieldDecl__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1672:2: ( ( rule__FieldDecl__Group_0__0 ) )
                    // InternalFortXTrans.g:1673:3: ( rule__FieldDecl__Group_0__0 )
                    {
                     before(grammarAccess.getFieldDeclAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1674:3: ( rule__FieldDecl__Group_0__0 )
                    // InternalFortXTrans.g:1674:4: rule__FieldDecl__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDecl__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldDeclAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1678:2: ( ( rule__FieldDecl__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1678:2: ( ( rule__FieldDecl__Group_1__0 ) )
                    // InternalFortXTrans.g:1679:3: ( rule__FieldDecl__Group_1__0 )
                    {
                     before(grammarAccess.getFieldDeclAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1680:3: ( rule__FieldDecl__Group_1__0 )
                    // InternalFortXTrans.g:1680:4: rule__FieldDecl__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDecl__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldDeclAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:1684:2: ( ( rule__FieldDecl__Group_2__0 ) )
                    {
                    // InternalFortXTrans.g:1684:2: ( ( rule__FieldDecl__Group_2__0 ) )
                    // InternalFortXTrans.g:1685:3: ( rule__FieldDecl__Group_2__0 )
                    {
                     before(grammarAccess.getFieldDeclAccess().getGroup_2()); 
                    // InternalFortXTrans.g:1686:3: ( rule__FieldDecl__Group_2__0 )
                    // InternalFortXTrans.g:1686:4: rule__FieldDecl__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDecl__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldDeclAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFortXTrans.g:1690:2: ( ( rule__FieldDecl__Group_3__0 ) )
                    {
                    // InternalFortXTrans.g:1690:2: ( ( rule__FieldDecl__Group_3__0 ) )
                    // InternalFortXTrans.g:1691:3: ( rule__FieldDecl__Group_3__0 )
                    {
                     before(grammarAccess.getFieldDeclAccess().getGroup_3()); 
                    // InternalFortXTrans.g:1692:3: ( rule__FieldDecl__Group_3__0 )
                    // InternalFortXTrans.g:1692:4: rule__FieldDecl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDecl__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldDeclAccess().getGroup_3()); 

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
    // $ANTLR end "rule__FieldDecl__Alternatives"


    // $ANTLR start "rule__NoNewlineVarWTypes__Alternatives"
    // InternalFortXTrans.g:1700:1: rule__NoNewlineVarWTypes__Alternatives : ( ( ( rule__NoNewlineVarWTypes__SingleAssignment_0 ) ) | ( ( rule__NoNewlineVarWTypes__Group_1__0 ) ) );
    public final void rule__NoNewlineVarWTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1704:1: ( ( ( rule__NoNewlineVarWTypes__SingleAssignment_0 ) ) | ( ( rule__NoNewlineVarWTypes__Group_1__0 ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||LA22_0==20) ) {
                alt22=1;
            }
            else if ( (LA22_0==31) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalFortXTrans.g:1705:2: ( ( rule__NoNewlineVarWTypes__SingleAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1705:2: ( ( rule__NoNewlineVarWTypes__SingleAssignment_0 ) )
                    // InternalFortXTrans.g:1706:3: ( rule__NoNewlineVarWTypes__SingleAssignment_0 )
                    {
                     before(grammarAccess.getNoNewlineVarWTypesAccess().getSingleAssignment_0()); 
                    // InternalFortXTrans.g:1707:3: ( rule__NoNewlineVarWTypes__SingleAssignment_0 )
                    // InternalFortXTrans.g:1707:4: rule__NoNewlineVarWTypes__SingleAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NoNewlineVarWTypes__SingleAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNoNewlineVarWTypesAccess().getSingleAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1711:2: ( ( rule__NoNewlineVarWTypes__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1711:2: ( ( rule__NoNewlineVarWTypes__Group_1__0 ) )
                    // InternalFortXTrans.g:1712:3: ( rule__NoNewlineVarWTypes__Group_1__0 )
                    {
                     before(grammarAccess.getNoNewlineVarWTypesAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1713:3: ( rule__NoNewlineVarWTypes__Group_1__0 )
                    // InternalFortXTrans.g:1713:4: rule__NoNewlineVarWTypes__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NoNewlineVarWTypes__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNoNewlineVarWTypesAccess().getGroup_1()); 

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
    // $ANTLR end "rule__NoNewlineVarWTypes__Alternatives"


    // $ANTLR start "rule__InitVal__Alternatives"
    // InternalFortXTrans.g:1721:1: rule__InitVal__Alternatives : ( ( ( rule__InitVal__Group_0__0 ) ) | ( ( rule__InitVal__Group_1__0 ) ) );
    public final void rule__InitVal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1725:1: ( ( ( rule__InitVal__Group_0__0 ) ) | ( ( rule__InitVal__Group_1__0 ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==52) ) {
                alt23=1;
            }
            else if ( (LA23_0==38) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalFortXTrans.g:1726:2: ( ( rule__InitVal__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1726:2: ( ( rule__InitVal__Group_0__0 ) )
                    // InternalFortXTrans.g:1727:3: ( rule__InitVal__Group_0__0 )
                    {
                     before(grammarAccess.getInitValAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1728:3: ( rule__InitVal__Group_0__0 )
                    // InternalFortXTrans.g:1728:4: rule__InitVal__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InitVal__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInitValAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1732:2: ( ( rule__InitVal__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1732:2: ( ( rule__InitVal__Group_1__0 ) )
                    // InternalFortXTrans.g:1733:3: ( rule__InitVal__Group_1__0 )
                    {
                     before(grammarAccess.getInitValAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1734:3: ( rule__InitVal__Group_1__0 )
                    // InternalFortXTrans.g:1734:4: rule__InitVal__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InitVal__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInitValAccess().getGroup_1()); 

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
    // $ANTLR end "rule__InitVal__Alternatives"


    // $ANTLR start "rule__LiteralTuple__Alternatives"
    // InternalFortXTrans.g:1742:1: rule__LiteralTuple__Alternatives : ( ( ( rule__LiteralTuple__LitAssignment_0 ) ) | ( ( rule__LiteralTuple__Group_1__0 ) ) );
    public final void rule__LiteralTuple__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1746:1: ( ( ( rule__LiteralTuple__LitAssignment_0 ) ) | ( ( rule__LiteralTuple__Group_1__0 ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_INT && LA24_0<=RULE_STRING)) ) {
                alt24=1;
            }
            else if ( (LA24_0==31) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalFortXTrans.g:1747:2: ( ( rule__LiteralTuple__LitAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1747:2: ( ( rule__LiteralTuple__LitAssignment_0 ) )
                    // InternalFortXTrans.g:1748:3: ( rule__LiteralTuple__LitAssignment_0 )
                    {
                     before(grammarAccess.getLiteralTupleAccess().getLitAssignment_0()); 
                    // InternalFortXTrans.g:1749:3: ( rule__LiteralTuple__LitAssignment_0 )
                    // InternalFortXTrans.g:1749:4: rule__LiteralTuple__LitAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LiteralTuple__LitAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralTupleAccess().getLitAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1753:2: ( ( rule__LiteralTuple__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1753:2: ( ( rule__LiteralTuple__Group_1__0 ) )
                    // InternalFortXTrans.g:1754:3: ( rule__LiteralTuple__Group_1__0 )
                    {
                     before(grammarAccess.getLiteralTupleAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1755:3: ( rule__LiteralTuple__Group_1__0 )
                    // InternalFortXTrans.g:1755:4: rule__LiteralTuple__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LiteralTuple__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralTupleAccess().getGroup_1()); 

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
    // $ANTLR end "rule__LiteralTuple__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalFortXTrans.g:1763:1: rule__Literal__Alternatives : ( ( ( rule__Literal__IntgAssignment_0 ) ) | ( ( rule__Literal__FlotAssignment_1 ) ) | ( ( rule__Literal__StrAssignment_2 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1767:1: ( ( ( rule__Literal__IntgAssignment_0 ) ) | ( ( rule__Literal__FlotAssignment_1 ) ) | ( ( rule__Literal__StrAssignment_2 ) ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt25=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt25=2;
                }
                break;
            case RULE_STRING:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalFortXTrans.g:1768:2: ( ( rule__Literal__IntgAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1768:2: ( ( rule__Literal__IntgAssignment_0 ) )
                    // InternalFortXTrans.g:1769:3: ( rule__Literal__IntgAssignment_0 )
                    {
                     before(grammarAccess.getLiteralAccess().getIntgAssignment_0()); 
                    // InternalFortXTrans.g:1770:3: ( rule__Literal__IntgAssignment_0 )
                    // InternalFortXTrans.g:1770:4: rule__Literal__IntgAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__IntgAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getIntgAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1774:2: ( ( rule__Literal__FlotAssignment_1 ) )
                    {
                    // InternalFortXTrans.g:1774:2: ( ( rule__Literal__FlotAssignment_1 ) )
                    // InternalFortXTrans.g:1775:3: ( rule__Literal__FlotAssignment_1 )
                    {
                     before(grammarAccess.getLiteralAccess().getFlotAssignment_1()); 
                    // InternalFortXTrans.g:1776:3: ( rule__Literal__FlotAssignment_1 )
                    // InternalFortXTrans.g:1776:4: rule__Literal__FlotAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__FlotAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getFlotAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:1780:2: ( ( rule__Literal__StrAssignment_2 ) )
                    {
                    // InternalFortXTrans.g:1780:2: ( ( rule__Literal__StrAssignment_2 ) )
                    // InternalFortXTrans.g:1781:3: ( rule__Literal__StrAssignment_2 )
                    {
                     before(grammarAccess.getLiteralAccess().getStrAssignment_2()); 
                    // InternalFortXTrans.g:1782:3: ( rule__Literal__StrAssignment_2 )
                    // InternalFortXTrans.g:1782:4: rule__Literal__StrAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__StrAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getStrAssignment_2()); 

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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__Component__Group__0"
    // InternalFortXTrans.g:1790:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1794:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalFortXTrans.g:1795:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalFortXTrans.g:1802:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1806:1: ( ( 'component' ) )
            // InternalFortXTrans.g:1807:1: ( 'component' )
            {
            // InternalFortXTrans.g:1807:1: ( 'component' )
            // InternalFortXTrans.g:1808:2: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalFortXTrans.g:1817:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1821:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalFortXTrans.g:1822:2: rule__Component__Group__1__Impl rule__Component__Group__2
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
    // InternalFortXTrans.g:1829:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1833:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalFortXTrans.g:1834:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalFortXTrans.g:1834:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalFortXTrans.g:1835:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalFortXTrans.g:1836:2: ( rule__Component__NameAssignment_1 )
            // InternalFortXTrans.g:1836:3: rule__Component__NameAssignment_1
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
    // InternalFortXTrans.g:1844:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1848:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalFortXTrans.g:1849:2: rule__Component__Group__2__Impl rule__Component__Group__3
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
    // InternalFortXTrans.g:1856:1: rule__Component__Group__2__Impl : ( ( rule__Component__ImportsAssignment_2 )* ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1860:1: ( ( ( rule__Component__ImportsAssignment_2 )* ) )
            // InternalFortXTrans.g:1861:1: ( ( rule__Component__ImportsAssignment_2 )* )
            {
            // InternalFortXTrans.g:1861:1: ( ( rule__Component__ImportsAssignment_2 )* )
            // InternalFortXTrans.g:1862:2: ( rule__Component__ImportsAssignment_2 )*
            {
             before(grammarAccess.getComponentAccess().getImportsAssignment_2()); 
            // InternalFortXTrans.g:1863:2: ( rule__Component__ImportsAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==39) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalFortXTrans.g:1863:3: rule__Component__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Component__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalFortXTrans.g:1871:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1875:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalFortXTrans.g:1876:2: rule__Component__Group__3__Impl rule__Component__Group__4
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
    // InternalFortXTrans.g:1883:1: rule__Component__Group__3__Impl : ( ( ( rule__Component__ExportsAssignment_3 ) ) ( ( rule__Component__ExportsAssignment_3 )* ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1887:1: ( ( ( ( rule__Component__ExportsAssignment_3 ) ) ( ( rule__Component__ExportsAssignment_3 )* ) ) )
            // InternalFortXTrans.g:1888:1: ( ( ( rule__Component__ExportsAssignment_3 ) ) ( ( rule__Component__ExportsAssignment_3 )* ) )
            {
            // InternalFortXTrans.g:1888:1: ( ( ( rule__Component__ExportsAssignment_3 ) ) ( ( rule__Component__ExportsAssignment_3 )* ) )
            // InternalFortXTrans.g:1889:2: ( ( rule__Component__ExportsAssignment_3 ) ) ( ( rule__Component__ExportsAssignment_3 )* )
            {
            // InternalFortXTrans.g:1889:2: ( ( rule__Component__ExportsAssignment_3 ) )
            // InternalFortXTrans.g:1890:3: ( rule__Component__ExportsAssignment_3 )
            {
             before(grammarAccess.getComponentAccess().getExportsAssignment_3()); 
            // InternalFortXTrans.g:1891:3: ( rule__Component__ExportsAssignment_3 )
            // InternalFortXTrans.g:1891:4: rule__Component__ExportsAssignment_3
            {
            pushFollow(FOLLOW_9);
            rule__Component__ExportsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getExportsAssignment_3()); 

            }

            // InternalFortXTrans.g:1894:2: ( ( rule__Component__ExportsAssignment_3 )* )
            // InternalFortXTrans.g:1895:3: ( rule__Component__ExportsAssignment_3 )*
            {
             before(grammarAccess.getComponentAccess().getExportsAssignment_3()); 
            // InternalFortXTrans.g:1896:3: ( rule__Component__ExportsAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==40) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalFortXTrans.g:1896:4: rule__Component__ExportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Component__ExportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalFortXTrans.g:1905:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1909:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalFortXTrans.g:1910:2: rule__Component__Group__4__Impl rule__Component__Group__5
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
    // InternalFortXTrans.g:1917:1: rule__Component__Group__4__Impl : ( ( rule__Component__DeclsAssignment_4 )* ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1921:1: ( ( ( rule__Component__DeclsAssignment_4 )* ) )
            // InternalFortXTrans.g:1922:1: ( ( rule__Component__DeclsAssignment_4 )* )
            {
            // InternalFortXTrans.g:1922:1: ( ( rule__Component__DeclsAssignment_4 )* )
            // InternalFortXTrans.g:1923:2: ( rule__Component__DeclsAssignment_4 )*
            {
             before(grammarAccess.getComponentAccess().getDeclsAssignment_4()); 
            // InternalFortXTrans.g:1924:2: ( rule__Component__DeclsAssignment_4 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||LA28_0==20||LA28_0==31||(LA28_0>=42 && LA28_0<=45)||LA28_0==51) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalFortXTrans.g:1924:3: rule__Component__DeclsAssignment_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Component__DeclsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalFortXTrans.g:1932:1: rule__Component__Group__5 : rule__Component__Group__5__Impl ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1936:1: ( rule__Component__Group__5__Impl )
            // InternalFortXTrans.g:1937:2: rule__Component__Group__5__Impl
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
    // InternalFortXTrans.g:1943:1: rule__Component__Group__5__Impl : ( 'end' ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1947:1: ( ( 'end' ) )
            // InternalFortXTrans.g:1948:1: ( 'end' )
            {
            // InternalFortXTrans.g:1948:1: ( 'end' )
            // InternalFortXTrans.g:1949:2: 'end'
            {
             before(grammarAccess.getComponentAccess().getEndKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalFortXTrans.g:1959:1: rule__API__Group__0 : rule__API__Group__0__Impl rule__API__Group__1 ;
    public final void rule__API__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1963:1: ( rule__API__Group__0__Impl rule__API__Group__1 )
            // InternalFortXTrans.g:1964:2: rule__API__Group__0__Impl rule__API__Group__1
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
    // InternalFortXTrans.g:1971:1: rule__API__Group__0__Impl : ( 'api' ) ;
    public final void rule__API__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1975:1: ( ( 'api' ) )
            // InternalFortXTrans.g:1976:1: ( 'api' )
            {
            // InternalFortXTrans.g:1976:1: ( 'api' )
            // InternalFortXTrans.g:1977:2: 'api'
            {
             before(grammarAccess.getAPIAccess().getApiKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalFortXTrans.g:1986:1: rule__API__Group__1 : rule__API__Group__1__Impl rule__API__Group__2 ;
    public final void rule__API__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1990:1: ( rule__API__Group__1__Impl rule__API__Group__2 )
            // InternalFortXTrans.g:1991:2: rule__API__Group__1__Impl rule__API__Group__2
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
    // InternalFortXTrans.g:1998:1: rule__API__Group__1__Impl : ( ( rule__API__NameAssignment_1 ) ) ;
    public final void rule__API__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2002:1: ( ( ( rule__API__NameAssignment_1 ) ) )
            // InternalFortXTrans.g:2003:1: ( ( rule__API__NameAssignment_1 ) )
            {
            // InternalFortXTrans.g:2003:1: ( ( rule__API__NameAssignment_1 ) )
            // InternalFortXTrans.g:2004:2: ( rule__API__NameAssignment_1 )
            {
             before(grammarAccess.getAPIAccess().getNameAssignment_1()); 
            // InternalFortXTrans.g:2005:2: ( rule__API__NameAssignment_1 )
            // InternalFortXTrans.g:2005:3: rule__API__NameAssignment_1
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
    // InternalFortXTrans.g:2013:1: rule__API__Group__2 : rule__API__Group__2__Impl rule__API__Group__3 ;
    public final void rule__API__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2017:1: ( rule__API__Group__2__Impl rule__API__Group__3 )
            // InternalFortXTrans.g:2018:2: rule__API__Group__2__Impl rule__API__Group__3
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
    // InternalFortXTrans.g:2025:1: rule__API__Group__2__Impl : ( ( rule__API__ImportsAssignment_2 )* ) ;
    public final void rule__API__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2029:1: ( ( ( rule__API__ImportsAssignment_2 )* ) )
            // InternalFortXTrans.g:2030:1: ( ( rule__API__ImportsAssignment_2 )* )
            {
            // InternalFortXTrans.g:2030:1: ( ( rule__API__ImportsAssignment_2 )* )
            // InternalFortXTrans.g:2031:2: ( rule__API__ImportsAssignment_2 )*
            {
             before(grammarAccess.getAPIAccess().getImportsAssignment_2()); 
            // InternalFortXTrans.g:2032:2: ( rule__API__ImportsAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==39) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalFortXTrans.g:2032:3: rule__API__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__API__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalFortXTrans.g:2040:1: rule__API__Group__3 : rule__API__Group__3__Impl ;
    public final void rule__API__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2044:1: ( rule__API__Group__3__Impl )
            // InternalFortXTrans.g:2045:2: rule__API__Group__3__Impl
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
    // InternalFortXTrans.g:2051:1: rule__API__Group__3__Impl : ( 'end' ) ;
    public final void rule__API__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2055:1: ( ( 'end' ) )
            // InternalFortXTrans.g:2056:1: ( 'end' )
            {
            // InternalFortXTrans.g:2056:1: ( 'end' )
            // InternalFortXTrans.g:2057:2: 'end'
            {
             before(grammarAccess.getAPIAccess().getEndKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalFortXTrans.g:2067:1: rule__Import__Group_0__0 : rule__Import__Group_0__0__Impl rule__Import__Group_0__1 ;
    public final void rule__Import__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2071:1: ( rule__Import__Group_0__0__Impl rule__Import__Group_0__1 )
            // InternalFortXTrans.g:2072:2: rule__Import__Group_0__0__Impl rule__Import__Group_0__1
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
    // InternalFortXTrans.g:2079:1: rule__Import__Group_0__0__Impl : ( ( rule__Import__ImpsAssignment_0_0 ) ) ;
    public final void rule__Import__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2083:1: ( ( ( rule__Import__ImpsAssignment_0_0 ) ) )
            // InternalFortXTrans.g:2084:1: ( ( rule__Import__ImpsAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:2084:1: ( ( rule__Import__ImpsAssignment_0_0 ) )
            // InternalFortXTrans.g:2085:2: ( rule__Import__ImpsAssignment_0_0 )
            {
             before(grammarAccess.getImportAccess().getImpsAssignment_0_0()); 
            // InternalFortXTrans.g:2086:2: ( rule__Import__ImpsAssignment_0_0 )
            // InternalFortXTrans.g:2086:3: rule__Import__ImpsAssignment_0_0
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
    // InternalFortXTrans.g:2094:1: rule__Import__Group_0__1 : rule__Import__Group_0__1__Impl ;
    public final void rule__Import__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2098:1: ( rule__Import__Group_0__1__Impl )
            // InternalFortXTrans.g:2099:2: rule__Import__Group_0__1__Impl
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
    // InternalFortXTrans.g:2105:1: rule__Import__Group_0__1__Impl : ( ( rule__Import__ImportedNamesAssignment_0_1 ) ) ;
    public final void rule__Import__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2109:1: ( ( ( rule__Import__ImportedNamesAssignment_0_1 ) ) )
            // InternalFortXTrans.g:2110:1: ( ( rule__Import__ImportedNamesAssignment_0_1 ) )
            {
            // InternalFortXTrans.g:2110:1: ( ( rule__Import__ImportedNamesAssignment_0_1 ) )
            // InternalFortXTrans.g:2111:2: ( rule__Import__ImportedNamesAssignment_0_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamesAssignment_0_1()); 
            // InternalFortXTrans.g:2112:2: ( rule__Import__ImportedNamesAssignment_0_1 )
            // InternalFortXTrans.g:2112:3: rule__Import__ImportedNamesAssignment_0_1
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
    // InternalFortXTrans.g:2121:1: rule__Import__Group_1__0 : rule__Import__Group_1__0__Impl rule__Import__Group_1__1 ;
    public final void rule__Import__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2125:1: ( rule__Import__Group_1__0__Impl rule__Import__Group_1__1 )
            // InternalFortXTrans.g:2126:2: rule__Import__Group_1__0__Impl rule__Import__Group_1__1
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
    // InternalFortXTrans.g:2133:1: rule__Import__Group_1__0__Impl : ( ( rule__Import__ImpsAssignment_1_0 ) ) ;
    public final void rule__Import__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2137:1: ( ( ( rule__Import__ImpsAssignment_1_0 ) ) )
            // InternalFortXTrans.g:2138:1: ( ( rule__Import__ImpsAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:2138:1: ( ( rule__Import__ImpsAssignment_1_0 ) )
            // InternalFortXTrans.g:2139:2: ( rule__Import__ImpsAssignment_1_0 )
            {
             before(grammarAccess.getImportAccess().getImpsAssignment_1_0()); 
            // InternalFortXTrans.g:2140:2: ( rule__Import__ImpsAssignment_1_0 )
            // InternalFortXTrans.g:2140:3: rule__Import__ImpsAssignment_1_0
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
    // InternalFortXTrans.g:2148:1: rule__Import__Group_1__1 : rule__Import__Group_1__1__Impl rule__Import__Group_1__2 ;
    public final void rule__Import__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2152:1: ( rule__Import__Group_1__1__Impl rule__Import__Group_1__2 )
            // InternalFortXTrans.g:2153:2: rule__Import__Group_1__1__Impl rule__Import__Group_1__2
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
    // InternalFortXTrans.g:2160:1: rule__Import__Group_1__1__Impl : ( ( rule__Import__ApiAssignment_1_1 ) ) ;
    public final void rule__Import__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2164:1: ( ( ( rule__Import__ApiAssignment_1_1 ) ) )
            // InternalFortXTrans.g:2165:1: ( ( rule__Import__ApiAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:2165:1: ( ( rule__Import__ApiAssignment_1_1 ) )
            // InternalFortXTrans.g:2166:2: ( rule__Import__ApiAssignment_1_1 )
            {
             before(grammarAccess.getImportAccess().getApiAssignment_1_1()); 
            // InternalFortXTrans.g:2167:2: ( rule__Import__ApiAssignment_1_1 )
            // InternalFortXTrans.g:2167:3: rule__Import__ApiAssignment_1_1
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
    // InternalFortXTrans.g:2175:1: rule__Import__Group_1__2 : rule__Import__Group_1__2__Impl ;
    public final void rule__Import__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2179:1: ( rule__Import__Group_1__2__Impl )
            // InternalFortXTrans.g:2180:2: rule__Import__Group_1__2__Impl
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
    // InternalFortXTrans.g:2186:1: rule__Import__Group_1__2__Impl : ( ( rule__Import__AliasedimportedNamesAssignment_1_2 ) ) ;
    public final void rule__Import__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2190:1: ( ( ( rule__Import__AliasedimportedNamesAssignment_1_2 ) ) )
            // InternalFortXTrans.g:2191:1: ( ( rule__Import__AliasedimportedNamesAssignment_1_2 ) )
            {
            // InternalFortXTrans.g:2191:1: ( ( rule__Import__AliasedimportedNamesAssignment_1_2 ) )
            // InternalFortXTrans.g:2192:2: ( rule__Import__AliasedimportedNamesAssignment_1_2 )
            {
             before(grammarAccess.getImportAccess().getAliasedimportedNamesAssignment_1_2()); 
            // InternalFortXTrans.g:2193:2: ( rule__Import__AliasedimportedNamesAssignment_1_2 )
            // InternalFortXTrans.g:2193:3: rule__Import__AliasedimportedNamesAssignment_1_2
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
    // InternalFortXTrans.g:2202:1: rule__Export__Group_0__0 : rule__Export__Group_0__0__Impl rule__Export__Group_0__1 ;
    public final void rule__Export__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2206:1: ( rule__Export__Group_0__0__Impl rule__Export__Group_0__1 )
            // InternalFortXTrans.g:2207:2: rule__Export__Group_0__0__Impl rule__Export__Group_0__1
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
    // InternalFortXTrans.g:2214:1: rule__Export__Group_0__0__Impl : ( ( rule__Export__ExpAssignment_0_0 ) ) ;
    public final void rule__Export__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2218:1: ( ( ( rule__Export__ExpAssignment_0_0 ) ) )
            // InternalFortXTrans.g:2219:1: ( ( rule__Export__ExpAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:2219:1: ( ( rule__Export__ExpAssignment_0_0 ) )
            // InternalFortXTrans.g:2220:2: ( rule__Export__ExpAssignment_0_0 )
            {
             before(grammarAccess.getExportAccess().getExpAssignment_0_0()); 
            // InternalFortXTrans.g:2221:2: ( rule__Export__ExpAssignment_0_0 )
            // InternalFortXTrans.g:2221:3: rule__Export__ExpAssignment_0_0
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
    // InternalFortXTrans.g:2229:1: rule__Export__Group_0__1 : rule__Export__Group_0__1__Impl ;
    public final void rule__Export__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2233:1: ( rule__Export__Group_0__1__Impl )
            // InternalFortXTrans.g:2234:2: rule__Export__Group_0__1__Impl
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
    // InternalFortXTrans.g:2240:1: rule__Export__Group_0__1__Impl : ( ( rule__Export__ExportedNameAssignment_0_1 ) ) ;
    public final void rule__Export__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2244:1: ( ( ( rule__Export__ExportedNameAssignment_0_1 ) ) )
            // InternalFortXTrans.g:2245:1: ( ( rule__Export__ExportedNameAssignment_0_1 ) )
            {
            // InternalFortXTrans.g:2245:1: ( ( rule__Export__ExportedNameAssignment_0_1 ) )
            // InternalFortXTrans.g:2246:2: ( rule__Export__ExportedNameAssignment_0_1 )
            {
             before(grammarAccess.getExportAccess().getExportedNameAssignment_0_1()); 
            // InternalFortXTrans.g:2247:2: ( rule__Export__ExportedNameAssignment_0_1 )
            // InternalFortXTrans.g:2247:3: rule__Export__ExportedNameAssignment_0_1
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
    // InternalFortXTrans.g:2256:1: rule__Export__Group_1__0 : rule__Export__Group_1__0__Impl rule__Export__Group_1__1 ;
    public final void rule__Export__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2260:1: ( rule__Export__Group_1__0__Impl rule__Export__Group_1__1 )
            // InternalFortXTrans.g:2261:2: rule__Export__Group_1__0__Impl rule__Export__Group_1__1
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
    // InternalFortXTrans.g:2268:1: rule__Export__Group_1__0__Impl : ( ( rule__Export__ExpAssignment_1_0 ) ) ;
    public final void rule__Export__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2272:1: ( ( ( rule__Export__ExpAssignment_1_0 ) ) )
            // InternalFortXTrans.g:2273:1: ( ( rule__Export__ExpAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:2273:1: ( ( rule__Export__ExpAssignment_1_0 ) )
            // InternalFortXTrans.g:2274:2: ( rule__Export__ExpAssignment_1_0 )
            {
             before(grammarAccess.getExportAccess().getExpAssignment_1_0()); 
            // InternalFortXTrans.g:2275:2: ( rule__Export__ExpAssignment_1_0 )
            // InternalFortXTrans.g:2275:3: rule__Export__ExpAssignment_1_0
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
    // InternalFortXTrans.g:2283:1: rule__Export__Group_1__1 : rule__Export__Group_1__1__Impl rule__Export__Group_1__2 ;
    public final void rule__Export__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2287:1: ( rule__Export__Group_1__1__Impl rule__Export__Group_1__2 )
            // InternalFortXTrans.g:2288:2: rule__Export__Group_1__1__Impl rule__Export__Group_1__2
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
    // InternalFortXTrans.g:2295:1: rule__Export__Group_1__1__Impl : ( ( rule__Export__BrackAssignment_1_1 ) ) ;
    public final void rule__Export__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2299:1: ( ( ( rule__Export__BrackAssignment_1_1 ) ) )
            // InternalFortXTrans.g:2300:1: ( ( rule__Export__BrackAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:2300:1: ( ( rule__Export__BrackAssignment_1_1 ) )
            // InternalFortXTrans.g:2301:2: ( rule__Export__BrackAssignment_1_1 )
            {
             before(grammarAccess.getExportAccess().getBrackAssignment_1_1()); 
            // InternalFortXTrans.g:2302:2: ( rule__Export__BrackAssignment_1_1 )
            // InternalFortXTrans.g:2302:3: rule__Export__BrackAssignment_1_1
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
    // InternalFortXTrans.g:2310:1: rule__Export__Group_1__2 : rule__Export__Group_1__2__Impl rule__Export__Group_1__3 ;
    public final void rule__Export__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2314:1: ( rule__Export__Group_1__2__Impl rule__Export__Group_1__3 )
            // InternalFortXTrans.g:2315:2: rule__Export__Group_1__2__Impl rule__Export__Group_1__3
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
    // InternalFortXTrans.g:2322:1: rule__Export__Group_1__2__Impl : ( ( rule__Export__ExportedNameAssignment_1_2 ) ) ;
    public final void rule__Export__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2326:1: ( ( ( rule__Export__ExportedNameAssignment_1_2 ) ) )
            // InternalFortXTrans.g:2327:1: ( ( rule__Export__ExportedNameAssignment_1_2 ) )
            {
            // InternalFortXTrans.g:2327:1: ( ( rule__Export__ExportedNameAssignment_1_2 ) )
            // InternalFortXTrans.g:2328:2: ( rule__Export__ExportedNameAssignment_1_2 )
            {
             before(grammarAccess.getExportAccess().getExportedNameAssignment_1_2()); 
            // InternalFortXTrans.g:2329:2: ( rule__Export__ExportedNameAssignment_1_2 )
            // InternalFortXTrans.g:2329:3: rule__Export__ExportedNameAssignment_1_2
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
    // InternalFortXTrans.g:2337:1: rule__Export__Group_1__3 : rule__Export__Group_1__3__Impl rule__Export__Group_1__4 ;
    public final void rule__Export__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2341:1: ( rule__Export__Group_1__3__Impl rule__Export__Group_1__4 )
            // InternalFortXTrans.g:2342:2: rule__Export__Group_1__3__Impl rule__Export__Group_1__4
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
    // InternalFortXTrans.g:2349:1: rule__Export__Group_1__3__Impl : ( ( rule__Export__Group_1_3__0 )* ) ;
    public final void rule__Export__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2353:1: ( ( ( rule__Export__Group_1_3__0 )* ) )
            // InternalFortXTrans.g:2354:1: ( ( rule__Export__Group_1_3__0 )* )
            {
            // InternalFortXTrans.g:2354:1: ( ( rule__Export__Group_1_3__0 )* )
            // InternalFortXTrans.g:2355:2: ( rule__Export__Group_1_3__0 )*
            {
             before(grammarAccess.getExportAccess().getGroup_1_3()); 
            // InternalFortXTrans.g:2356:2: ( rule__Export__Group_1_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==25) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalFortXTrans.g:2356:3: rule__Export__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Export__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalFortXTrans.g:2364:1: rule__Export__Group_1__4 : rule__Export__Group_1__4__Impl ;
    public final void rule__Export__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2368:1: ( rule__Export__Group_1__4__Impl )
            // InternalFortXTrans.g:2369:2: rule__Export__Group_1__4__Impl
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
    // InternalFortXTrans.g:2375:1: rule__Export__Group_1__4__Impl : ( '}' ) ;
    public final void rule__Export__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2379:1: ( ( '}' ) )
            // InternalFortXTrans.g:2380:1: ( '}' )
            {
            // InternalFortXTrans.g:2380:1: ( '}' )
            // InternalFortXTrans.g:2381:2: '}'
            {
             before(grammarAccess.getExportAccess().getRightCurlyBracketKeyword_1_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalFortXTrans.g:2391:1: rule__Export__Group_1_3__0 : rule__Export__Group_1_3__0__Impl rule__Export__Group_1_3__1 ;
    public final void rule__Export__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2395:1: ( rule__Export__Group_1_3__0__Impl rule__Export__Group_1_3__1 )
            // InternalFortXTrans.g:2396:2: rule__Export__Group_1_3__0__Impl rule__Export__Group_1_3__1
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
    // InternalFortXTrans.g:2403:1: rule__Export__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__Export__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2407:1: ( ( ',' ) )
            // InternalFortXTrans.g:2408:1: ( ',' )
            {
            // InternalFortXTrans.g:2408:1: ( ',' )
            // InternalFortXTrans.g:2409:2: ','
            {
             before(grammarAccess.getExportAccess().getCommaKeyword_1_3_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalFortXTrans.g:2418:1: rule__Export__Group_1_3__1 : rule__Export__Group_1_3__1__Impl ;
    public final void rule__Export__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2422:1: ( rule__Export__Group_1_3__1__Impl )
            // InternalFortXTrans.g:2423:2: rule__Export__Group_1_3__1__Impl
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
    // InternalFortXTrans.g:2429:1: rule__Export__Group_1_3__1__Impl : ( ( rule__Export__ExportedNameAssignment_1_3_1 ) ) ;
    public final void rule__Export__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2433:1: ( ( ( rule__Export__ExportedNameAssignment_1_3_1 ) ) )
            // InternalFortXTrans.g:2434:1: ( ( rule__Export__ExportedNameAssignment_1_3_1 ) )
            {
            // InternalFortXTrans.g:2434:1: ( ( rule__Export__ExportedNameAssignment_1_3_1 ) )
            // InternalFortXTrans.g:2435:2: ( rule__Export__ExportedNameAssignment_1_3_1 )
            {
             before(grammarAccess.getExportAccess().getExportedNameAssignment_1_3_1()); 
            // InternalFortXTrans.g:2436:2: ( rule__Export__ExportedNameAssignment_1_3_1 )
            // InternalFortXTrans.g:2436:3: rule__Export__ExportedNameAssignment_1_3_1
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
    // InternalFortXTrans.g:2445:1: rule__ImportedNames__Group_0__0 : rule__ImportedNames__Group_0__0__Impl rule__ImportedNames__Group_0__1 ;
    public final void rule__ImportedNames__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2449:1: ( rule__ImportedNames__Group_0__0__Impl rule__ImportedNames__Group_0__1 )
            // InternalFortXTrans.g:2450:2: rule__ImportedNames__Group_0__0__Impl rule__ImportedNames__Group_0__1
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
    // InternalFortXTrans.g:2457:1: rule__ImportedNames__Group_0__0__Impl : ( ( rule__ImportedNames__ImpnameAssignment_0_0 ) ) ;
    public final void rule__ImportedNames__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2461:1: ( ( ( rule__ImportedNames__ImpnameAssignment_0_0 ) ) )
            // InternalFortXTrans.g:2462:1: ( ( rule__ImportedNames__ImpnameAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:2462:1: ( ( rule__ImportedNames__ImpnameAssignment_0_0 ) )
            // InternalFortXTrans.g:2463:2: ( rule__ImportedNames__ImpnameAssignment_0_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getImpnameAssignment_0_0()); 
            // InternalFortXTrans.g:2464:2: ( rule__ImportedNames__ImpnameAssignment_0_0 )
            // InternalFortXTrans.g:2464:3: rule__ImportedNames__ImpnameAssignment_0_0
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
    // InternalFortXTrans.g:2472:1: rule__ImportedNames__Group_0__1 : rule__ImportedNames__Group_0__1__Impl rule__ImportedNames__Group_0__2 ;
    public final void rule__ImportedNames__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2476:1: ( rule__ImportedNames__Group_0__1__Impl rule__ImportedNames__Group_0__2 )
            // InternalFortXTrans.g:2477:2: rule__ImportedNames__Group_0__1__Impl rule__ImportedNames__Group_0__2
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
    // InternalFortXTrans.g:2484:1: rule__ImportedNames__Group_0__1__Impl : ( '.' ) ;
    public final void rule__ImportedNames__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2488:1: ( ( '.' ) )
            // InternalFortXTrans.g:2489:1: ( '.' )
            {
            // InternalFortXTrans.g:2489:1: ( '.' )
            // InternalFortXTrans.g:2490:2: '.'
            {
             before(grammarAccess.getImportedNamesAccess().getFullStopKeyword_0_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFortXTrans.g:2499:1: rule__ImportedNames__Group_0__2 : rule__ImportedNames__Group_0__2__Impl rule__ImportedNames__Group_0__3 ;
    public final void rule__ImportedNames__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2503:1: ( rule__ImportedNames__Group_0__2__Impl rule__ImportedNames__Group_0__3 )
            // InternalFortXTrans.g:2504:2: rule__ImportedNames__Group_0__2__Impl rule__ImportedNames__Group_0__3
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
    // InternalFortXTrans.g:2511:1: rule__ImportedNames__Group_0__2__Impl : ( '{' ) ;
    public final void rule__ImportedNames__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2515:1: ( ( '{' ) )
            // InternalFortXTrans.g:2516:1: ( '{' )
            {
            // InternalFortXTrans.g:2516:1: ( '{' )
            // InternalFortXTrans.g:2517:2: '{'
            {
             before(grammarAccess.getImportedNamesAccess().getLeftCurlyBracketKeyword_0_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalFortXTrans.g:2526:1: rule__ImportedNames__Group_0__3 : rule__ImportedNames__Group_0__3__Impl rule__ImportedNames__Group_0__4 ;
    public final void rule__ImportedNames__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2530:1: ( rule__ImportedNames__Group_0__3__Impl rule__ImportedNames__Group_0__4 )
            // InternalFortXTrans.g:2531:2: rule__ImportedNames__Group_0__3__Impl rule__ImportedNames__Group_0__4
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
    // InternalFortXTrans.g:2538:1: rule__ImportedNames__Group_0__3__Impl : ( RULE_DOTS ) ;
    public final void rule__ImportedNames__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2542:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:2543:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:2543:1: ( RULE_DOTS )
            // InternalFortXTrans.g:2544:2: RULE_DOTS
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
    // InternalFortXTrans.g:2553:1: rule__ImportedNames__Group_0__4 : rule__ImportedNames__Group_0__4__Impl rule__ImportedNames__Group_0__5 ;
    public final void rule__ImportedNames__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2557:1: ( rule__ImportedNames__Group_0__4__Impl rule__ImportedNames__Group_0__5 )
            // InternalFortXTrans.g:2558:2: rule__ImportedNames__Group_0__4__Impl rule__ImportedNames__Group_0__5
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
    // InternalFortXTrans.g:2565:1: rule__ImportedNames__Group_0__4__Impl : ( '}' ) ;
    public final void rule__ImportedNames__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2569:1: ( ( '}' ) )
            // InternalFortXTrans.g:2570:1: ( '}' )
            {
            // InternalFortXTrans.g:2570:1: ( '}' )
            // InternalFortXTrans.g:2571:2: '}'
            {
             before(grammarAccess.getImportedNamesAccess().getRightCurlyBracketKeyword_0_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalFortXTrans.g:2580:1: rule__ImportedNames__Group_0__5 : rule__ImportedNames__Group_0__5__Impl ;
    public final void rule__ImportedNames__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2584:1: ( rule__ImportedNames__Group_0__5__Impl )
            // InternalFortXTrans.g:2585:2: rule__ImportedNames__Group_0__5__Impl
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
    // InternalFortXTrans.g:2591:1: rule__ImportedNames__Group_0__5__Impl : ( ( rule__ImportedNames__Group_0_5__0 )? ) ;
    public final void rule__ImportedNames__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2595:1: ( ( ( rule__ImportedNames__Group_0_5__0 )? ) )
            // InternalFortXTrans.g:2596:1: ( ( rule__ImportedNames__Group_0_5__0 )? )
            {
            // InternalFortXTrans.g:2596:1: ( ( rule__ImportedNames__Group_0_5__0 )? )
            // InternalFortXTrans.g:2597:2: ( rule__ImportedNames__Group_0_5__0 )?
            {
             before(grammarAccess.getImportedNamesAccess().getGroup_0_5()); 
            // InternalFortXTrans.g:2598:2: ( rule__ImportedNames__Group_0_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalFortXTrans.g:2598:3: rule__ImportedNames__Group_0_5__0
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
    // InternalFortXTrans.g:2607:1: rule__ImportedNames__Group_0_5__0 : rule__ImportedNames__Group_0_5__0__Impl rule__ImportedNames__Group_0_5__1 ;
    public final void rule__ImportedNames__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2611:1: ( rule__ImportedNames__Group_0_5__0__Impl rule__ImportedNames__Group_0_5__1 )
            // InternalFortXTrans.g:2612:2: rule__ImportedNames__Group_0_5__0__Impl rule__ImportedNames__Group_0_5__1
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
    // InternalFortXTrans.g:2619:1: rule__ImportedNames__Group_0_5__0__Impl : ( ( rule__ImportedNames__ExceptAssignment_0_5_0 ) ) ;
    public final void rule__ImportedNames__Group_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2623:1: ( ( ( rule__ImportedNames__ExceptAssignment_0_5_0 ) ) )
            // InternalFortXTrans.g:2624:1: ( ( rule__ImportedNames__ExceptAssignment_0_5_0 ) )
            {
            // InternalFortXTrans.g:2624:1: ( ( rule__ImportedNames__ExceptAssignment_0_5_0 ) )
            // InternalFortXTrans.g:2625:2: ( rule__ImportedNames__ExceptAssignment_0_5_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getExceptAssignment_0_5_0()); 
            // InternalFortXTrans.g:2626:2: ( rule__ImportedNames__ExceptAssignment_0_5_0 )
            // InternalFortXTrans.g:2626:3: rule__ImportedNames__ExceptAssignment_0_5_0
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
    // InternalFortXTrans.g:2634:1: rule__ImportedNames__Group_0_5__1 : rule__ImportedNames__Group_0_5__1__Impl ;
    public final void rule__ImportedNames__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2638:1: ( rule__ImportedNames__Group_0_5__1__Impl )
            // InternalFortXTrans.g:2639:2: rule__ImportedNames__Group_0_5__1__Impl
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
    // InternalFortXTrans.g:2645:1: rule__ImportedNames__Group_0_5__1__Impl : ( ( rule__ImportedNames__SimpAssignment_0_5_1 ) ) ;
    public final void rule__ImportedNames__Group_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2649:1: ( ( ( rule__ImportedNames__SimpAssignment_0_5_1 ) ) )
            // InternalFortXTrans.g:2650:1: ( ( rule__ImportedNames__SimpAssignment_0_5_1 ) )
            {
            // InternalFortXTrans.g:2650:1: ( ( rule__ImportedNames__SimpAssignment_0_5_1 ) )
            // InternalFortXTrans.g:2651:2: ( rule__ImportedNames__SimpAssignment_0_5_1 )
            {
             before(grammarAccess.getImportedNamesAccess().getSimpAssignment_0_5_1()); 
            // InternalFortXTrans.g:2652:2: ( rule__ImportedNames__SimpAssignment_0_5_1 )
            // InternalFortXTrans.g:2652:3: rule__ImportedNames__SimpAssignment_0_5_1
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
    // InternalFortXTrans.g:2661:1: rule__ImportedNames__Group_1__0 : rule__ImportedNames__Group_1__0__Impl rule__ImportedNames__Group_1__1 ;
    public final void rule__ImportedNames__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2665:1: ( rule__ImportedNames__Group_1__0__Impl rule__ImportedNames__Group_1__1 )
            // InternalFortXTrans.g:2666:2: rule__ImportedNames__Group_1__0__Impl rule__ImportedNames__Group_1__1
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
    // InternalFortXTrans.g:2673:1: rule__ImportedNames__Group_1__0__Impl : ( ( rule__ImportedNames__ImpnameAssignment_1_0 ) ) ;
    public final void rule__ImportedNames__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2677:1: ( ( ( rule__ImportedNames__ImpnameAssignment_1_0 ) ) )
            // InternalFortXTrans.g:2678:1: ( ( rule__ImportedNames__ImpnameAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:2678:1: ( ( rule__ImportedNames__ImpnameAssignment_1_0 ) )
            // InternalFortXTrans.g:2679:2: ( rule__ImportedNames__ImpnameAssignment_1_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getImpnameAssignment_1_0()); 
            // InternalFortXTrans.g:2680:2: ( rule__ImportedNames__ImpnameAssignment_1_0 )
            // InternalFortXTrans.g:2680:3: rule__ImportedNames__ImpnameAssignment_1_0
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
    // InternalFortXTrans.g:2688:1: rule__ImportedNames__Group_1__1 : rule__ImportedNames__Group_1__1__Impl rule__ImportedNames__Group_1__2 ;
    public final void rule__ImportedNames__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2692:1: ( rule__ImportedNames__Group_1__1__Impl rule__ImportedNames__Group_1__2 )
            // InternalFortXTrans.g:2693:2: rule__ImportedNames__Group_1__1__Impl rule__ImportedNames__Group_1__2
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
    // InternalFortXTrans.g:2700:1: rule__ImportedNames__Group_1__1__Impl : ( '.' ) ;
    public final void rule__ImportedNames__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2704:1: ( ( '.' ) )
            // InternalFortXTrans.g:2705:1: ( '.' )
            {
            // InternalFortXTrans.g:2705:1: ( '.' )
            // InternalFortXTrans.g:2706:2: '.'
            {
             before(grammarAccess.getImportedNamesAccess().getFullStopKeyword_1_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFortXTrans.g:2715:1: rule__ImportedNames__Group_1__2 : rule__ImportedNames__Group_1__2__Impl rule__ImportedNames__Group_1__3 ;
    public final void rule__ImportedNames__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2719:1: ( rule__ImportedNames__Group_1__2__Impl rule__ImportedNames__Group_1__3 )
            // InternalFortXTrans.g:2720:2: rule__ImportedNames__Group_1__2__Impl rule__ImportedNames__Group_1__3
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
    // InternalFortXTrans.g:2727:1: rule__ImportedNames__Group_1__2__Impl : ( '{' ) ;
    public final void rule__ImportedNames__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2731:1: ( ( '{' ) )
            // InternalFortXTrans.g:2732:1: ( '{' )
            {
            // InternalFortXTrans.g:2732:1: ( '{' )
            // InternalFortXTrans.g:2733:2: '{'
            {
             before(grammarAccess.getImportedNamesAccess().getLeftCurlyBracketKeyword_1_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalFortXTrans.g:2742:1: rule__ImportedNames__Group_1__3 : rule__ImportedNames__Group_1__3__Impl rule__ImportedNames__Group_1__4 ;
    public final void rule__ImportedNames__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2746:1: ( rule__ImportedNames__Group_1__3__Impl rule__ImportedNames__Group_1__4 )
            // InternalFortXTrans.g:2747:2: rule__ImportedNames__Group_1__3__Impl rule__ImportedNames__Group_1__4
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
    // InternalFortXTrans.g:2754:1: rule__ImportedNames__Group_1__3__Impl : ( ( rule__ImportedNames__SimpListAssignment_1_3 ) ) ;
    public final void rule__ImportedNames__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2758:1: ( ( ( rule__ImportedNames__SimpListAssignment_1_3 ) ) )
            // InternalFortXTrans.g:2759:1: ( ( rule__ImportedNames__SimpListAssignment_1_3 ) )
            {
            // InternalFortXTrans.g:2759:1: ( ( rule__ImportedNames__SimpListAssignment_1_3 ) )
            // InternalFortXTrans.g:2760:2: ( rule__ImportedNames__SimpListAssignment_1_3 )
            {
             before(grammarAccess.getImportedNamesAccess().getSimpListAssignment_1_3()); 
            // InternalFortXTrans.g:2761:2: ( rule__ImportedNames__SimpListAssignment_1_3 )
            // InternalFortXTrans.g:2761:3: rule__ImportedNames__SimpListAssignment_1_3
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
    // InternalFortXTrans.g:2769:1: rule__ImportedNames__Group_1__4 : rule__ImportedNames__Group_1__4__Impl rule__ImportedNames__Group_1__5 ;
    public final void rule__ImportedNames__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2773:1: ( rule__ImportedNames__Group_1__4__Impl rule__ImportedNames__Group_1__5 )
            // InternalFortXTrans.g:2774:2: rule__ImportedNames__Group_1__4__Impl rule__ImportedNames__Group_1__5
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
    // InternalFortXTrans.g:2781:1: rule__ImportedNames__Group_1__4__Impl : ( ( rule__ImportedNames__Group_1_4__0 )* ) ;
    public final void rule__ImportedNames__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2785:1: ( ( ( rule__ImportedNames__Group_1_4__0 )* ) )
            // InternalFortXTrans.g:2786:1: ( ( rule__ImportedNames__Group_1_4__0 )* )
            {
            // InternalFortXTrans.g:2786:1: ( ( rule__ImportedNames__Group_1_4__0 )* )
            // InternalFortXTrans.g:2787:2: ( rule__ImportedNames__Group_1_4__0 )*
            {
             before(grammarAccess.getImportedNamesAccess().getGroup_1_4()); 
            // InternalFortXTrans.g:2788:2: ( rule__ImportedNames__Group_1_4__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==25) ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==RULE_ID) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // InternalFortXTrans.g:2788:3: rule__ImportedNames__Group_1_4__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ImportedNames__Group_1_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalFortXTrans.g:2796:1: rule__ImportedNames__Group_1__5 : rule__ImportedNames__Group_1__5__Impl rule__ImportedNames__Group_1__6 ;
    public final void rule__ImportedNames__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2800:1: ( rule__ImportedNames__Group_1__5__Impl rule__ImportedNames__Group_1__6 )
            // InternalFortXTrans.g:2801:2: rule__ImportedNames__Group_1__5__Impl rule__ImportedNames__Group_1__6
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
    // InternalFortXTrans.g:2808:1: rule__ImportedNames__Group_1__5__Impl : ( ( rule__ImportedNames__Group_1_5__0 )? ) ;
    public final void rule__ImportedNames__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2812:1: ( ( ( rule__ImportedNames__Group_1_5__0 )? ) )
            // InternalFortXTrans.g:2813:1: ( ( rule__ImportedNames__Group_1_5__0 )? )
            {
            // InternalFortXTrans.g:2813:1: ( ( rule__ImportedNames__Group_1_5__0 )? )
            // InternalFortXTrans.g:2814:2: ( rule__ImportedNames__Group_1_5__0 )?
            {
             before(grammarAccess.getImportedNamesAccess().getGroup_1_5()); 
            // InternalFortXTrans.g:2815:2: ( rule__ImportedNames__Group_1_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==25) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalFortXTrans.g:2815:3: rule__ImportedNames__Group_1_5__0
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
    // InternalFortXTrans.g:2823:1: rule__ImportedNames__Group_1__6 : rule__ImportedNames__Group_1__6__Impl ;
    public final void rule__ImportedNames__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2827:1: ( rule__ImportedNames__Group_1__6__Impl )
            // InternalFortXTrans.g:2828:2: rule__ImportedNames__Group_1__6__Impl
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
    // InternalFortXTrans.g:2834:1: rule__ImportedNames__Group_1__6__Impl : ( '}' ) ;
    public final void rule__ImportedNames__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2838:1: ( ( '}' ) )
            // InternalFortXTrans.g:2839:1: ( '}' )
            {
            // InternalFortXTrans.g:2839:1: ( '}' )
            // InternalFortXTrans.g:2840:2: '}'
            {
             before(grammarAccess.getImportedNamesAccess().getRightCurlyBracketKeyword_1_6()); 
            match(input,24,FOLLOW_2); 
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
    // InternalFortXTrans.g:2850:1: rule__ImportedNames__Group_1_4__0 : rule__ImportedNames__Group_1_4__0__Impl rule__ImportedNames__Group_1_4__1 ;
    public final void rule__ImportedNames__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2854:1: ( rule__ImportedNames__Group_1_4__0__Impl rule__ImportedNames__Group_1_4__1 )
            // InternalFortXTrans.g:2855:2: rule__ImportedNames__Group_1_4__0__Impl rule__ImportedNames__Group_1_4__1
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
    // InternalFortXTrans.g:2862:1: rule__ImportedNames__Group_1_4__0__Impl : ( ',' ) ;
    public final void rule__ImportedNames__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2866:1: ( ( ',' ) )
            // InternalFortXTrans.g:2867:1: ( ',' )
            {
            // InternalFortXTrans.g:2867:1: ( ',' )
            // InternalFortXTrans.g:2868:2: ','
            {
             before(grammarAccess.getImportedNamesAccess().getCommaKeyword_1_4_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalFortXTrans.g:2877:1: rule__ImportedNames__Group_1_4__1 : rule__ImportedNames__Group_1_4__1__Impl ;
    public final void rule__ImportedNames__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2881:1: ( rule__ImportedNames__Group_1_4__1__Impl )
            // InternalFortXTrans.g:2882:2: rule__ImportedNames__Group_1_4__1__Impl
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
    // InternalFortXTrans.g:2888:1: rule__ImportedNames__Group_1_4__1__Impl : ( ( rule__ImportedNames__SimpListAssignment_1_4_1 ) ) ;
    public final void rule__ImportedNames__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2892:1: ( ( ( rule__ImportedNames__SimpListAssignment_1_4_1 ) ) )
            // InternalFortXTrans.g:2893:1: ( ( rule__ImportedNames__SimpListAssignment_1_4_1 ) )
            {
            // InternalFortXTrans.g:2893:1: ( ( rule__ImportedNames__SimpListAssignment_1_4_1 ) )
            // InternalFortXTrans.g:2894:2: ( rule__ImportedNames__SimpListAssignment_1_4_1 )
            {
             before(grammarAccess.getImportedNamesAccess().getSimpListAssignment_1_4_1()); 
            // InternalFortXTrans.g:2895:2: ( rule__ImportedNames__SimpListAssignment_1_4_1 )
            // InternalFortXTrans.g:2895:3: rule__ImportedNames__SimpListAssignment_1_4_1
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
    // InternalFortXTrans.g:2904:1: rule__ImportedNames__Group_1_5__0 : rule__ImportedNames__Group_1_5__0__Impl rule__ImportedNames__Group_1_5__1 ;
    public final void rule__ImportedNames__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2908:1: ( rule__ImportedNames__Group_1_5__0__Impl rule__ImportedNames__Group_1_5__1 )
            // InternalFortXTrans.g:2909:2: rule__ImportedNames__Group_1_5__0__Impl rule__ImportedNames__Group_1_5__1
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
    // InternalFortXTrans.g:2916:1: rule__ImportedNames__Group_1_5__0__Impl : ( ( rule__ImportedNames__CommaAssignment_1_5_0 ) ) ;
    public final void rule__ImportedNames__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2920:1: ( ( ( rule__ImportedNames__CommaAssignment_1_5_0 ) ) )
            // InternalFortXTrans.g:2921:1: ( ( rule__ImportedNames__CommaAssignment_1_5_0 ) )
            {
            // InternalFortXTrans.g:2921:1: ( ( rule__ImportedNames__CommaAssignment_1_5_0 ) )
            // InternalFortXTrans.g:2922:2: ( rule__ImportedNames__CommaAssignment_1_5_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getCommaAssignment_1_5_0()); 
            // InternalFortXTrans.g:2923:2: ( rule__ImportedNames__CommaAssignment_1_5_0 )
            // InternalFortXTrans.g:2923:3: rule__ImportedNames__CommaAssignment_1_5_0
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
    // InternalFortXTrans.g:2931:1: rule__ImportedNames__Group_1_5__1 : rule__ImportedNames__Group_1_5__1__Impl ;
    public final void rule__ImportedNames__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2935:1: ( rule__ImportedNames__Group_1_5__1__Impl )
            // InternalFortXTrans.g:2936:2: rule__ImportedNames__Group_1_5__1__Impl
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
    // InternalFortXTrans.g:2942:1: rule__ImportedNames__Group_1_5__1__Impl : ( ( rule__ImportedNames__DotsAssignment_1_5_1 ) ) ;
    public final void rule__ImportedNames__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2946:1: ( ( ( rule__ImportedNames__DotsAssignment_1_5_1 ) ) )
            // InternalFortXTrans.g:2947:1: ( ( rule__ImportedNames__DotsAssignment_1_5_1 ) )
            {
            // InternalFortXTrans.g:2947:1: ( ( rule__ImportedNames__DotsAssignment_1_5_1 ) )
            // InternalFortXTrans.g:2948:2: ( rule__ImportedNames__DotsAssignment_1_5_1 )
            {
             before(grammarAccess.getImportedNamesAccess().getDotsAssignment_1_5_1()); 
            // InternalFortXTrans.g:2949:2: ( rule__ImportedNames__DotsAssignment_1_5_1 )
            // InternalFortXTrans.g:2949:3: rule__ImportedNames__DotsAssignment_1_5_1
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
    // InternalFortXTrans.g:2958:1: rule__ImportedNames__Group_2__0 : rule__ImportedNames__Group_2__0__Impl rule__ImportedNames__Group_2__1 ;
    public final void rule__ImportedNames__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2962:1: ( rule__ImportedNames__Group_2__0__Impl rule__ImportedNames__Group_2__1 )
            // InternalFortXTrans.g:2963:2: rule__ImportedNames__Group_2__0__Impl rule__ImportedNames__Group_2__1
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
    // InternalFortXTrans.g:2970:1: rule__ImportedNames__Group_2__0__Impl : ( ( rule__ImportedNames__ImpnameAssignment_2_0 ) ) ;
    public final void rule__ImportedNames__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2974:1: ( ( ( rule__ImportedNames__ImpnameAssignment_2_0 ) ) )
            // InternalFortXTrans.g:2975:1: ( ( rule__ImportedNames__ImpnameAssignment_2_0 ) )
            {
            // InternalFortXTrans.g:2975:1: ( ( rule__ImportedNames__ImpnameAssignment_2_0 ) )
            // InternalFortXTrans.g:2976:2: ( rule__ImportedNames__ImpnameAssignment_2_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getImpnameAssignment_2_0()); 
            // InternalFortXTrans.g:2977:2: ( rule__ImportedNames__ImpnameAssignment_2_0 )
            // InternalFortXTrans.g:2977:3: rule__ImportedNames__ImpnameAssignment_2_0
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
    // InternalFortXTrans.g:2985:1: rule__ImportedNames__Group_2__1 : rule__ImportedNames__Group_2__1__Impl ;
    public final void rule__ImportedNames__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2989:1: ( rule__ImportedNames__Group_2__1__Impl )
            // InternalFortXTrans.g:2990:2: rule__ImportedNames__Group_2__1__Impl
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
    // InternalFortXTrans.g:2996:1: rule__ImportedNames__Group_2__1__Impl : ( ( rule__ImportedNames__Group_2_1__0 )? ) ;
    public final void rule__ImportedNames__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3000:1: ( ( ( rule__ImportedNames__Group_2_1__0 )? ) )
            // InternalFortXTrans.g:3001:1: ( ( rule__ImportedNames__Group_2_1__0 )? )
            {
            // InternalFortXTrans.g:3001:1: ( ( rule__ImportedNames__Group_2_1__0 )? )
            // InternalFortXTrans.g:3002:2: ( rule__ImportedNames__Group_2_1__0 )?
            {
             before(grammarAccess.getImportedNamesAccess().getGroup_2_1()); 
            // InternalFortXTrans.g:3003:2: ( rule__ImportedNames__Group_2_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==28) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalFortXTrans.g:3003:3: rule__ImportedNames__Group_2_1__0
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
    // InternalFortXTrans.g:3012:1: rule__ImportedNames__Group_2_1__0 : rule__ImportedNames__Group_2_1__0__Impl rule__ImportedNames__Group_2_1__1 ;
    public final void rule__ImportedNames__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3016:1: ( rule__ImportedNames__Group_2_1__0__Impl rule__ImportedNames__Group_2_1__1 )
            // InternalFortXTrans.g:3017:2: rule__ImportedNames__Group_2_1__0__Impl rule__ImportedNames__Group_2_1__1
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
    // InternalFortXTrans.g:3024:1: rule__ImportedNames__Group_2_1__0__Impl : ( 'as' ) ;
    public final void rule__ImportedNames__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3028:1: ( ( 'as' ) )
            // InternalFortXTrans.g:3029:1: ( 'as' )
            {
            // InternalFortXTrans.g:3029:1: ( 'as' )
            // InternalFortXTrans.g:3030:2: 'as'
            {
             before(grammarAccess.getImportedNamesAccess().getAsKeyword_2_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalFortXTrans.g:3039:1: rule__ImportedNames__Group_2_1__1 : rule__ImportedNames__Group_2_1__1__Impl ;
    public final void rule__ImportedNames__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3043:1: ( rule__ImportedNames__Group_2_1__1__Impl )
            // InternalFortXTrans.g:3044:2: rule__ImportedNames__Group_2_1__1__Impl
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
    // InternalFortXTrans.g:3050:1: rule__ImportedNames__Group_2_1__1__Impl : ( ( rule__ImportedNames__AsnameAssignment_2_1_1 ) ) ;
    public final void rule__ImportedNames__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3054:1: ( ( ( rule__ImportedNames__AsnameAssignment_2_1_1 ) ) )
            // InternalFortXTrans.g:3055:1: ( ( rule__ImportedNames__AsnameAssignment_2_1_1 ) )
            {
            // InternalFortXTrans.g:3055:1: ( ( rule__ImportedNames__AsnameAssignment_2_1_1 ) )
            // InternalFortXTrans.g:3056:2: ( rule__ImportedNames__AsnameAssignment_2_1_1 )
            {
             before(grammarAccess.getImportedNamesAccess().getAsnameAssignment_2_1_1()); 
            // InternalFortXTrans.g:3057:2: ( rule__ImportedNames__AsnameAssignment_2_1_1 )
            // InternalFortXTrans.g:3057:3: rule__ImportedNames__AsnameAssignment_2_1_1
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
    // InternalFortXTrans.g:3066:1: rule__QualifiedName__Group_0__0 : rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1 ;
    public final void rule__QualifiedName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3070:1: ( rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1 )
            // InternalFortXTrans.g:3071:2: rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1
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
    // InternalFortXTrans.g:3078:1: rule__QualifiedName__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3082:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3083:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3083:1: ( RULE_ID )
            // InternalFortXTrans.g:3084:2: RULE_ID
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
    // InternalFortXTrans.g:3093:1: rule__QualifiedName__Group_0__1 : rule__QualifiedName__Group_0__1__Impl ;
    public final void rule__QualifiedName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3097:1: ( rule__QualifiedName__Group_0__1__Impl )
            // InternalFortXTrans.g:3098:2: rule__QualifiedName__Group_0__1__Impl
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
    // InternalFortXTrans.g:3104:1: rule__QualifiedName__Group_0__1__Impl : ( RULE_DOTS ) ;
    public final void rule__QualifiedName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3108:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:3109:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:3109:1: ( RULE_DOTS )
            // InternalFortXTrans.g:3110:2: RULE_DOTS
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
    // InternalFortXTrans.g:3120:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3124:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalFortXTrans.g:3125:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalFortXTrans.g:3132:1: rule__QualifiedName__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3136:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3137:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3137:1: ( RULE_ID )
            // InternalFortXTrans.g:3138:2: RULE_ID
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
    // InternalFortXTrans.g:3147:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl rule__QualifiedName__Group_1__2 ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3151:1: ( rule__QualifiedName__Group_1__1__Impl rule__QualifiedName__Group_1__2 )
            // InternalFortXTrans.g:3152:2: rule__QualifiedName__Group_1__1__Impl rule__QualifiedName__Group_1__2
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
    // InternalFortXTrans.g:3159:1: rule__QualifiedName__Group_1__1__Impl : ( ( rule__QualifiedName__Group_1_1__0 )* ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3163:1: ( ( ( rule__QualifiedName__Group_1_1__0 )* ) )
            // InternalFortXTrans.g:3164:1: ( ( rule__QualifiedName__Group_1_1__0 )* )
            {
            // InternalFortXTrans.g:3164:1: ( ( rule__QualifiedName__Group_1_1__0 )* )
            // InternalFortXTrans.g:3165:2: ( rule__QualifiedName__Group_1_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1_1()); 
            // InternalFortXTrans.g:3166:2: ( rule__QualifiedName__Group_1_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==26) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalFortXTrans.g:3166:3: rule__QualifiedName__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__QualifiedName__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalFortXTrans.g:3174:1: rule__QualifiedName__Group_1__2 : rule__QualifiedName__Group_1__2__Impl ;
    public final void rule__QualifiedName__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3178:1: ( rule__QualifiedName__Group_1__2__Impl )
            // InternalFortXTrans.g:3179:2: rule__QualifiedName__Group_1__2__Impl
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
    // InternalFortXTrans.g:3185:1: rule__QualifiedName__Group_1__2__Impl : ( RULE_DOTS ) ;
    public final void rule__QualifiedName__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3189:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:3190:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:3190:1: ( RULE_DOTS )
            // InternalFortXTrans.g:3191:2: RULE_DOTS
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
    // InternalFortXTrans.g:3201:1: rule__QualifiedName__Group_1_1__0 : rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1 ;
    public final void rule__QualifiedName__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3205:1: ( rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1 )
            // InternalFortXTrans.g:3206:2: rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1
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
    // InternalFortXTrans.g:3213:1: rule__QualifiedName__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3217:1: ( ( '.' ) )
            // InternalFortXTrans.g:3218:1: ( '.' )
            {
            // InternalFortXTrans.g:3218:1: ( '.' )
            // InternalFortXTrans.g:3219:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFortXTrans.g:3228:1: rule__QualifiedName__Group_1_1__1 : rule__QualifiedName__Group_1_1__1__Impl ;
    public final void rule__QualifiedName__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3232:1: ( rule__QualifiedName__Group_1_1__1__Impl )
            // InternalFortXTrans.g:3233:2: rule__QualifiedName__Group_1_1__1__Impl
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
    // InternalFortXTrans.g:3239:1: rule__QualifiedName__Group_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3243:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3244:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3244:1: ( RULE_ID )
            // InternalFortXTrans.g:3245:2: RULE_ID
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
    // InternalFortXTrans.g:3255:1: rule__QualifiedName__Group_2__0 : rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1 ;
    public final void rule__QualifiedName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3259:1: ( rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1 )
            // InternalFortXTrans.g:3260:2: rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1
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
    // InternalFortXTrans.g:3267:1: rule__QualifiedName__Group_2__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3271:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3272:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3272:1: ( RULE_ID )
            // InternalFortXTrans.g:3273:2: RULE_ID
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
    // InternalFortXTrans.g:3282:1: rule__QualifiedName__Group_2__1 : rule__QualifiedName__Group_2__1__Impl ;
    public final void rule__QualifiedName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3286:1: ( rule__QualifiedName__Group_2__1__Impl )
            // InternalFortXTrans.g:3287:2: rule__QualifiedName__Group_2__1__Impl
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
    // InternalFortXTrans.g:3293:1: rule__QualifiedName__Group_2__1__Impl : ( ( rule__QualifiedName__Group_2_1__0 )* ) ;
    public final void rule__QualifiedName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3297:1: ( ( ( rule__QualifiedName__Group_2_1__0 )* ) )
            // InternalFortXTrans.g:3298:1: ( ( rule__QualifiedName__Group_2_1__0 )* )
            {
            // InternalFortXTrans.g:3298:1: ( ( rule__QualifiedName__Group_2_1__0 )* )
            // InternalFortXTrans.g:3299:2: ( rule__QualifiedName__Group_2_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_2_1()); 
            // InternalFortXTrans.g:3300:2: ( rule__QualifiedName__Group_2_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==26) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalFortXTrans.g:3300:3: rule__QualifiedName__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__QualifiedName__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalFortXTrans.g:3309:1: rule__QualifiedName__Group_2_1__0 : rule__QualifiedName__Group_2_1__0__Impl rule__QualifiedName__Group_2_1__1 ;
    public final void rule__QualifiedName__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3313:1: ( rule__QualifiedName__Group_2_1__0__Impl rule__QualifiedName__Group_2_1__1 )
            // InternalFortXTrans.g:3314:2: rule__QualifiedName__Group_2_1__0__Impl rule__QualifiedName__Group_2_1__1
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
    // InternalFortXTrans.g:3321:1: rule__QualifiedName__Group_2_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3325:1: ( ( '.' ) )
            // InternalFortXTrans.g:3326:1: ( '.' )
            {
            // InternalFortXTrans.g:3326:1: ( '.' )
            // InternalFortXTrans.g:3327:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_2_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFortXTrans.g:3336:1: rule__QualifiedName__Group_2_1__1 : rule__QualifiedName__Group_2_1__1__Impl ;
    public final void rule__QualifiedName__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3340:1: ( rule__QualifiedName__Group_2_1__1__Impl )
            // InternalFortXTrans.g:3341:2: rule__QualifiedName__Group_2_1__1__Impl
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
    // InternalFortXTrans.g:3347:1: rule__QualifiedName__Group_2_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3351:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3352:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3352:1: ( RULE_ID )
            // InternalFortXTrans.g:3353:2: RULE_ID
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
    // InternalFortXTrans.g:3363:1: rule__APIName__Group_0__0 : rule__APIName__Group_0__0__Impl rule__APIName__Group_0__1 ;
    public final void rule__APIName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3367:1: ( rule__APIName__Group_0__0__Impl rule__APIName__Group_0__1 )
            // InternalFortXTrans.g:3368:2: rule__APIName__Group_0__0__Impl rule__APIName__Group_0__1
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
    // InternalFortXTrans.g:3375:1: rule__APIName__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3379:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3380:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3380:1: ( RULE_ID )
            // InternalFortXTrans.g:3381:2: RULE_ID
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
    // InternalFortXTrans.g:3390:1: rule__APIName__Group_0__1 : rule__APIName__Group_0__1__Impl ;
    public final void rule__APIName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3394:1: ( rule__APIName__Group_0__1__Impl )
            // InternalFortXTrans.g:3395:2: rule__APIName__Group_0__1__Impl
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
    // InternalFortXTrans.g:3401:1: rule__APIName__Group_0__1__Impl : ( RULE_DOTS ) ;
    public final void rule__APIName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3405:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:3406:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:3406:1: ( RULE_DOTS )
            // InternalFortXTrans.g:3407:2: RULE_DOTS
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
    // InternalFortXTrans.g:3417:1: rule__APIName__Group_1__0 : rule__APIName__Group_1__0__Impl rule__APIName__Group_1__1 ;
    public final void rule__APIName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3421:1: ( rule__APIName__Group_1__0__Impl rule__APIName__Group_1__1 )
            // InternalFortXTrans.g:3422:2: rule__APIName__Group_1__0__Impl rule__APIName__Group_1__1
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
    // InternalFortXTrans.g:3429:1: rule__APIName__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3433:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3434:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3434:1: ( RULE_ID )
            // InternalFortXTrans.g:3435:2: RULE_ID
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
    // InternalFortXTrans.g:3444:1: rule__APIName__Group_1__1 : rule__APIName__Group_1__1__Impl rule__APIName__Group_1__2 ;
    public final void rule__APIName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3448:1: ( rule__APIName__Group_1__1__Impl rule__APIName__Group_1__2 )
            // InternalFortXTrans.g:3449:2: rule__APIName__Group_1__1__Impl rule__APIName__Group_1__2
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
    // InternalFortXTrans.g:3456:1: rule__APIName__Group_1__1__Impl : ( ( rule__APIName__Group_1_1__0 )* ) ;
    public final void rule__APIName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3460:1: ( ( ( rule__APIName__Group_1_1__0 )* ) )
            // InternalFortXTrans.g:3461:1: ( ( rule__APIName__Group_1_1__0 )* )
            {
            // InternalFortXTrans.g:3461:1: ( ( rule__APIName__Group_1_1__0 )* )
            // InternalFortXTrans.g:3462:2: ( rule__APIName__Group_1_1__0 )*
            {
             before(grammarAccess.getAPINameAccess().getGroup_1_1()); 
            // InternalFortXTrans.g:3463:2: ( rule__APIName__Group_1_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==26) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalFortXTrans.g:3463:3: rule__APIName__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__APIName__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalFortXTrans.g:3471:1: rule__APIName__Group_1__2 : rule__APIName__Group_1__2__Impl ;
    public final void rule__APIName__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3475:1: ( rule__APIName__Group_1__2__Impl )
            // InternalFortXTrans.g:3476:2: rule__APIName__Group_1__2__Impl
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
    // InternalFortXTrans.g:3482:1: rule__APIName__Group_1__2__Impl : ( RULE_DOTS ) ;
    public final void rule__APIName__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3486:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:3487:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:3487:1: ( RULE_DOTS )
            // InternalFortXTrans.g:3488:2: RULE_DOTS
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
    // InternalFortXTrans.g:3498:1: rule__APIName__Group_1_1__0 : rule__APIName__Group_1_1__0__Impl rule__APIName__Group_1_1__1 ;
    public final void rule__APIName__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3502:1: ( rule__APIName__Group_1_1__0__Impl rule__APIName__Group_1_1__1 )
            // InternalFortXTrans.g:3503:2: rule__APIName__Group_1_1__0__Impl rule__APIName__Group_1_1__1
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
    // InternalFortXTrans.g:3510:1: rule__APIName__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__APIName__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3514:1: ( ( '.' ) )
            // InternalFortXTrans.g:3515:1: ( '.' )
            {
            // InternalFortXTrans.g:3515:1: ( '.' )
            // InternalFortXTrans.g:3516:2: '.'
            {
             before(grammarAccess.getAPINameAccess().getFullStopKeyword_1_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFortXTrans.g:3525:1: rule__APIName__Group_1_1__1 : rule__APIName__Group_1_1__1__Impl ;
    public final void rule__APIName__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3529:1: ( rule__APIName__Group_1_1__1__Impl )
            // InternalFortXTrans.g:3530:2: rule__APIName__Group_1_1__1__Impl
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
    // InternalFortXTrans.g:3536:1: rule__APIName__Group_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3540:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3541:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3541:1: ( RULE_ID )
            // InternalFortXTrans.g:3542:2: RULE_ID
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
    // InternalFortXTrans.g:3552:1: rule__APIName__Group_2__0 : rule__APIName__Group_2__0__Impl rule__APIName__Group_2__1 ;
    public final void rule__APIName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3556:1: ( rule__APIName__Group_2__0__Impl rule__APIName__Group_2__1 )
            // InternalFortXTrans.g:3557:2: rule__APIName__Group_2__0__Impl rule__APIName__Group_2__1
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
    // InternalFortXTrans.g:3564:1: rule__APIName__Group_2__0__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3568:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3569:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3569:1: ( RULE_ID )
            // InternalFortXTrans.g:3570:2: RULE_ID
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
    // InternalFortXTrans.g:3579:1: rule__APIName__Group_2__1 : rule__APIName__Group_2__1__Impl ;
    public final void rule__APIName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3583:1: ( rule__APIName__Group_2__1__Impl )
            // InternalFortXTrans.g:3584:2: rule__APIName__Group_2__1__Impl
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
    // InternalFortXTrans.g:3590:1: rule__APIName__Group_2__1__Impl : ( ( rule__APIName__Group_2_1__0 )* ) ;
    public final void rule__APIName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3594:1: ( ( ( rule__APIName__Group_2_1__0 )* ) )
            // InternalFortXTrans.g:3595:1: ( ( rule__APIName__Group_2_1__0 )* )
            {
            // InternalFortXTrans.g:3595:1: ( ( rule__APIName__Group_2_1__0 )* )
            // InternalFortXTrans.g:3596:2: ( rule__APIName__Group_2_1__0 )*
            {
             before(grammarAccess.getAPINameAccess().getGroup_2_1()); 
            // InternalFortXTrans.g:3597:2: ( rule__APIName__Group_2_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==26) ) {
                    int LA38_2 = input.LA(2);

                    if ( (LA38_2==RULE_ID) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // InternalFortXTrans.g:3597:3: rule__APIName__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__APIName__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalFortXTrans.g:3606:1: rule__APIName__Group_2_1__0 : rule__APIName__Group_2_1__0__Impl rule__APIName__Group_2_1__1 ;
    public final void rule__APIName__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3610:1: ( rule__APIName__Group_2_1__0__Impl rule__APIName__Group_2_1__1 )
            // InternalFortXTrans.g:3611:2: rule__APIName__Group_2_1__0__Impl rule__APIName__Group_2_1__1
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
    // InternalFortXTrans.g:3618:1: rule__APIName__Group_2_1__0__Impl : ( '.' ) ;
    public final void rule__APIName__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3622:1: ( ( '.' ) )
            // InternalFortXTrans.g:3623:1: ( '.' )
            {
            // InternalFortXTrans.g:3623:1: ( '.' )
            // InternalFortXTrans.g:3624:2: '.'
            {
             before(grammarAccess.getAPINameAccess().getFullStopKeyword_2_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFortXTrans.g:3633:1: rule__APIName__Group_2_1__1 : rule__APIName__Group_2_1__1__Impl ;
    public final void rule__APIName__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3637:1: ( rule__APIName__Group_2_1__1__Impl )
            // InternalFortXTrans.g:3638:2: rule__APIName__Group_2_1__1__Impl
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
    // InternalFortXTrans.g:3644:1: rule__APIName__Group_2_1__1__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3648:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3649:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3649:1: ( RULE_ID )
            // InternalFortXTrans.g:3650:2: RULE_ID
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
    // InternalFortXTrans.g:3660:1: rule__SimpleNames__Group_1__0 : rule__SimpleNames__Group_1__0__Impl rule__SimpleNames__Group_1__1 ;
    public final void rule__SimpleNames__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3664:1: ( rule__SimpleNames__Group_1__0__Impl rule__SimpleNames__Group_1__1 )
            // InternalFortXTrans.g:3665:2: rule__SimpleNames__Group_1__0__Impl rule__SimpleNames__Group_1__1
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
    // InternalFortXTrans.g:3672:1: rule__SimpleNames__Group_1__0__Impl : ( ( rule__SimpleNames__BrackAssignment_1_0 ) ) ;
    public final void rule__SimpleNames__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3676:1: ( ( ( rule__SimpleNames__BrackAssignment_1_0 ) ) )
            // InternalFortXTrans.g:3677:1: ( ( rule__SimpleNames__BrackAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:3677:1: ( ( rule__SimpleNames__BrackAssignment_1_0 ) )
            // InternalFortXTrans.g:3678:2: ( rule__SimpleNames__BrackAssignment_1_0 )
            {
             before(grammarAccess.getSimpleNamesAccess().getBrackAssignment_1_0()); 
            // InternalFortXTrans.g:3679:2: ( rule__SimpleNames__BrackAssignment_1_0 )
            // InternalFortXTrans.g:3679:3: rule__SimpleNames__BrackAssignment_1_0
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
    // InternalFortXTrans.g:3687:1: rule__SimpleNames__Group_1__1 : rule__SimpleNames__Group_1__1__Impl rule__SimpleNames__Group_1__2 ;
    public final void rule__SimpleNames__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3691:1: ( rule__SimpleNames__Group_1__1__Impl rule__SimpleNames__Group_1__2 )
            // InternalFortXTrans.g:3692:2: rule__SimpleNames__Group_1__1__Impl rule__SimpleNames__Group_1__2
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
    // InternalFortXTrans.g:3699:1: rule__SimpleNames__Group_1__1__Impl : ( ( rule__SimpleNames__NameListAssignment_1_1 ) ) ;
    public final void rule__SimpleNames__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3703:1: ( ( ( rule__SimpleNames__NameListAssignment_1_1 ) ) )
            // InternalFortXTrans.g:3704:1: ( ( rule__SimpleNames__NameListAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:3704:1: ( ( rule__SimpleNames__NameListAssignment_1_1 ) )
            // InternalFortXTrans.g:3705:2: ( rule__SimpleNames__NameListAssignment_1_1 )
            {
             before(grammarAccess.getSimpleNamesAccess().getNameListAssignment_1_1()); 
            // InternalFortXTrans.g:3706:2: ( rule__SimpleNames__NameListAssignment_1_1 )
            // InternalFortXTrans.g:3706:3: rule__SimpleNames__NameListAssignment_1_1
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
    // InternalFortXTrans.g:3714:1: rule__SimpleNames__Group_1__2 : rule__SimpleNames__Group_1__2__Impl rule__SimpleNames__Group_1__3 ;
    public final void rule__SimpleNames__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3718:1: ( rule__SimpleNames__Group_1__2__Impl rule__SimpleNames__Group_1__3 )
            // InternalFortXTrans.g:3719:2: rule__SimpleNames__Group_1__2__Impl rule__SimpleNames__Group_1__3
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
    // InternalFortXTrans.g:3726:1: rule__SimpleNames__Group_1__2__Impl : ( ( rule__SimpleNames__Group_1_2__0 )* ) ;
    public final void rule__SimpleNames__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3730:1: ( ( ( rule__SimpleNames__Group_1_2__0 )* ) )
            // InternalFortXTrans.g:3731:1: ( ( rule__SimpleNames__Group_1_2__0 )* )
            {
            // InternalFortXTrans.g:3731:1: ( ( rule__SimpleNames__Group_1_2__0 )* )
            // InternalFortXTrans.g:3732:2: ( rule__SimpleNames__Group_1_2__0 )*
            {
             before(grammarAccess.getSimpleNamesAccess().getGroup_1_2()); 
            // InternalFortXTrans.g:3733:2: ( rule__SimpleNames__Group_1_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==25) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalFortXTrans.g:3733:3: rule__SimpleNames__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__SimpleNames__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalFortXTrans.g:3741:1: rule__SimpleNames__Group_1__3 : rule__SimpleNames__Group_1__3__Impl ;
    public final void rule__SimpleNames__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3745:1: ( rule__SimpleNames__Group_1__3__Impl )
            // InternalFortXTrans.g:3746:2: rule__SimpleNames__Group_1__3__Impl
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
    // InternalFortXTrans.g:3752:1: rule__SimpleNames__Group_1__3__Impl : ( '}' ) ;
    public final void rule__SimpleNames__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3756:1: ( ( '}' ) )
            // InternalFortXTrans.g:3757:1: ( '}' )
            {
            // InternalFortXTrans.g:3757:1: ( '}' )
            // InternalFortXTrans.g:3758:2: '}'
            {
             before(grammarAccess.getSimpleNamesAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalFortXTrans.g:3768:1: rule__SimpleNames__Group_1_2__0 : rule__SimpleNames__Group_1_2__0__Impl rule__SimpleNames__Group_1_2__1 ;
    public final void rule__SimpleNames__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3772:1: ( rule__SimpleNames__Group_1_2__0__Impl rule__SimpleNames__Group_1_2__1 )
            // InternalFortXTrans.g:3773:2: rule__SimpleNames__Group_1_2__0__Impl rule__SimpleNames__Group_1_2__1
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
    // InternalFortXTrans.g:3780:1: rule__SimpleNames__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__SimpleNames__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3784:1: ( ( ',' ) )
            // InternalFortXTrans.g:3785:1: ( ',' )
            {
            // InternalFortXTrans.g:3785:1: ( ',' )
            // InternalFortXTrans.g:3786:2: ','
            {
             before(grammarAccess.getSimpleNamesAccess().getCommaKeyword_1_2_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalFortXTrans.g:3795:1: rule__SimpleNames__Group_1_2__1 : rule__SimpleNames__Group_1_2__1__Impl ;
    public final void rule__SimpleNames__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3799:1: ( rule__SimpleNames__Group_1_2__1__Impl )
            // InternalFortXTrans.g:3800:2: rule__SimpleNames__Group_1_2__1__Impl
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
    // InternalFortXTrans.g:3806:1: rule__SimpleNames__Group_1_2__1__Impl : ( ( rule__SimpleNames__NameListAssignment_1_2_1 ) ) ;
    public final void rule__SimpleNames__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3810:1: ( ( ( rule__SimpleNames__NameListAssignment_1_2_1 ) ) )
            // InternalFortXTrans.g:3811:1: ( ( rule__SimpleNames__NameListAssignment_1_2_1 ) )
            {
            // InternalFortXTrans.g:3811:1: ( ( rule__SimpleNames__NameListAssignment_1_2_1 ) )
            // InternalFortXTrans.g:3812:2: ( rule__SimpleNames__NameListAssignment_1_2_1 )
            {
             before(grammarAccess.getSimpleNamesAccess().getNameListAssignment_1_2_1()); 
            // InternalFortXTrans.g:3813:2: ( rule__SimpleNames__NameListAssignment_1_2_1 )
            // InternalFortXTrans.g:3813:3: rule__SimpleNames__NameListAssignment_1_2_1
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
    // InternalFortXTrans.g:3822:1: rule__AliasedSimpleName__Group__0 : rule__AliasedSimpleName__Group__0__Impl rule__AliasedSimpleName__Group__1 ;
    public final void rule__AliasedSimpleName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3826:1: ( rule__AliasedSimpleName__Group__0__Impl rule__AliasedSimpleName__Group__1 )
            // InternalFortXTrans.g:3827:2: rule__AliasedSimpleName__Group__0__Impl rule__AliasedSimpleName__Group__1
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
    // InternalFortXTrans.g:3834:1: rule__AliasedSimpleName__Group__0__Impl : ( ( rule__AliasedSimpleName__OrigAssignment_0 ) ) ;
    public final void rule__AliasedSimpleName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3838:1: ( ( ( rule__AliasedSimpleName__OrigAssignment_0 ) ) )
            // InternalFortXTrans.g:3839:1: ( ( rule__AliasedSimpleName__OrigAssignment_0 ) )
            {
            // InternalFortXTrans.g:3839:1: ( ( rule__AliasedSimpleName__OrigAssignment_0 ) )
            // InternalFortXTrans.g:3840:2: ( rule__AliasedSimpleName__OrigAssignment_0 )
            {
             before(grammarAccess.getAliasedSimpleNameAccess().getOrigAssignment_0()); 
            // InternalFortXTrans.g:3841:2: ( rule__AliasedSimpleName__OrigAssignment_0 )
            // InternalFortXTrans.g:3841:3: rule__AliasedSimpleName__OrigAssignment_0
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
    // InternalFortXTrans.g:3849:1: rule__AliasedSimpleName__Group__1 : rule__AliasedSimpleName__Group__1__Impl ;
    public final void rule__AliasedSimpleName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3853:1: ( rule__AliasedSimpleName__Group__1__Impl )
            // InternalFortXTrans.g:3854:2: rule__AliasedSimpleName__Group__1__Impl
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
    // InternalFortXTrans.g:3860:1: rule__AliasedSimpleName__Group__1__Impl : ( ( rule__AliasedSimpleName__Group_1__0 )? ) ;
    public final void rule__AliasedSimpleName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3864:1: ( ( ( rule__AliasedSimpleName__Group_1__0 )? ) )
            // InternalFortXTrans.g:3865:1: ( ( rule__AliasedSimpleName__Group_1__0 )? )
            {
            // InternalFortXTrans.g:3865:1: ( ( rule__AliasedSimpleName__Group_1__0 )? )
            // InternalFortXTrans.g:3866:2: ( rule__AliasedSimpleName__Group_1__0 )?
            {
             before(grammarAccess.getAliasedSimpleNameAccess().getGroup_1()); 
            // InternalFortXTrans.g:3867:2: ( rule__AliasedSimpleName__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==28) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalFortXTrans.g:3867:3: rule__AliasedSimpleName__Group_1__0
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
    // InternalFortXTrans.g:3876:1: rule__AliasedSimpleName__Group_1__0 : rule__AliasedSimpleName__Group_1__0__Impl rule__AliasedSimpleName__Group_1__1 ;
    public final void rule__AliasedSimpleName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3880:1: ( rule__AliasedSimpleName__Group_1__0__Impl rule__AliasedSimpleName__Group_1__1 )
            // InternalFortXTrans.g:3881:2: rule__AliasedSimpleName__Group_1__0__Impl rule__AliasedSimpleName__Group_1__1
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
    // InternalFortXTrans.g:3888:1: rule__AliasedSimpleName__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__AliasedSimpleName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3892:1: ( ( 'as' ) )
            // InternalFortXTrans.g:3893:1: ( 'as' )
            {
            // InternalFortXTrans.g:3893:1: ( 'as' )
            // InternalFortXTrans.g:3894:2: 'as'
            {
             before(grammarAccess.getAliasedSimpleNameAccess().getAsKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalFortXTrans.g:3903:1: rule__AliasedSimpleName__Group_1__1 : rule__AliasedSimpleName__Group_1__1__Impl ;
    public final void rule__AliasedSimpleName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3907:1: ( rule__AliasedSimpleName__Group_1__1__Impl )
            // InternalFortXTrans.g:3908:2: rule__AliasedSimpleName__Group_1__1__Impl
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
    // InternalFortXTrans.g:3914:1: rule__AliasedSimpleName__Group_1__1__Impl : ( ( rule__AliasedSimpleName__AsNameAssignment_1_1 ) ) ;
    public final void rule__AliasedSimpleName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3918:1: ( ( ( rule__AliasedSimpleName__AsNameAssignment_1_1 ) ) )
            // InternalFortXTrans.g:3919:1: ( ( rule__AliasedSimpleName__AsNameAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:3919:1: ( ( rule__AliasedSimpleName__AsNameAssignment_1_1 ) )
            // InternalFortXTrans.g:3920:2: ( rule__AliasedSimpleName__AsNameAssignment_1_1 )
            {
             before(grammarAccess.getAliasedSimpleNameAccess().getAsNameAssignment_1_1()); 
            // InternalFortXTrans.g:3921:2: ( rule__AliasedSimpleName__AsNameAssignment_1_1 )
            // InternalFortXTrans.g:3921:3: rule__AliasedSimpleName__AsNameAssignment_1_1
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
    // InternalFortXTrans.g:3930:1: rule__AliasedAPINames__Group_1__0 : rule__AliasedAPINames__Group_1__0__Impl rule__AliasedAPINames__Group_1__1 ;
    public final void rule__AliasedAPINames__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3934:1: ( rule__AliasedAPINames__Group_1__0__Impl rule__AliasedAPINames__Group_1__1 )
            // InternalFortXTrans.g:3935:2: rule__AliasedAPINames__Group_1__0__Impl rule__AliasedAPINames__Group_1__1
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
    // InternalFortXTrans.g:3942:1: rule__AliasedAPINames__Group_1__0__Impl : ( ( rule__AliasedAPINames__BrackAssignment_1_0 ) ) ;
    public final void rule__AliasedAPINames__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3946:1: ( ( ( rule__AliasedAPINames__BrackAssignment_1_0 ) ) )
            // InternalFortXTrans.g:3947:1: ( ( rule__AliasedAPINames__BrackAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:3947:1: ( ( rule__AliasedAPINames__BrackAssignment_1_0 ) )
            // InternalFortXTrans.g:3948:2: ( rule__AliasedAPINames__BrackAssignment_1_0 )
            {
             before(grammarAccess.getAliasedAPINamesAccess().getBrackAssignment_1_0()); 
            // InternalFortXTrans.g:3949:2: ( rule__AliasedAPINames__BrackAssignment_1_0 )
            // InternalFortXTrans.g:3949:3: rule__AliasedAPINames__BrackAssignment_1_0
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
    // InternalFortXTrans.g:3957:1: rule__AliasedAPINames__Group_1__1 : rule__AliasedAPINames__Group_1__1__Impl rule__AliasedAPINames__Group_1__2 ;
    public final void rule__AliasedAPINames__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3961:1: ( rule__AliasedAPINames__Group_1__1__Impl rule__AliasedAPINames__Group_1__2 )
            // InternalFortXTrans.g:3962:2: rule__AliasedAPINames__Group_1__1__Impl rule__AliasedAPINames__Group_1__2
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
    // InternalFortXTrans.g:3969:1: rule__AliasedAPINames__Group_1__1__Impl : ( ( rule__AliasedAPINames__NameListAssignment_1_1 ) ) ;
    public final void rule__AliasedAPINames__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3973:1: ( ( ( rule__AliasedAPINames__NameListAssignment_1_1 ) ) )
            // InternalFortXTrans.g:3974:1: ( ( rule__AliasedAPINames__NameListAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:3974:1: ( ( rule__AliasedAPINames__NameListAssignment_1_1 ) )
            // InternalFortXTrans.g:3975:2: ( rule__AliasedAPINames__NameListAssignment_1_1 )
            {
             before(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_1_1()); 
            // InternalFortXTrans.g:3976:2: ( rule__AliasedAPINames__NameListAssignment_1_1 )
            // InternalFortXTrans.g:3976:3: rule__AliasedAPINames__NameListAssignment_1_1
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
    // InternalFortXTrans.g:3984:1: rule__AliasedAPINames__Group_1__2 : rule__AliasedAPINames__Group_1__2__Impl rule__AliasedAPINames__Group_1__3 ;
    public final void rule__AliasedAPINames__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3988:1: ( rule__AliasedAPINames__Group_1__2__Impl rule__AliasedAPINames__Group_1__3 )
            // InternalFortXTrans.g:3989:2: rule__AliasedAPINames__Group_1__2__Impl rule__AliasedAPINames__Group_1__3
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
    // InternalFortXTrans.g:3996:1: rule__AliasedAPINames__Group_1__2__Impl : ( ( rule__AliasedAPINames__Group_1_2__0 )* ) ;
    public final void rule__AliasedAPINames__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4000:1: ( ( ( rule__AliasedAPINames__Group_1_2__0 )* ) )
            // InternalFortXTrans.g:4001:1: ( ( rule__AliasedAPINames__Group_1_2__0 )* )
            {
            // InternalFortXTrans.g:4001:1: ( ( rule__AliasedAPINames__Group_1_2__0 )* )
            // InternalFortXTrans.g:4002:2: ( rule__AliasedAPINames__Group_1_2__0 )*
            {
             before(grammarAccess.getAliasedAPINamesAccess().getGroup_1_2()); 
            // InternalFortXTrans.g:4003:2: ( rule__AliasedAPINames__Group_1_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==25) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalFortXTrans.g:4003:3: rule__AliasedAPINames__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__AliasedAPINames__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalFortXTrans.g:4011:1: rule__AliasedAPINames__Group_1__3 : rule__AliasedAPINames__Group_1__3__Impl ;
    public final void rule__AliasedAPINames__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4015:1: ( rule__AliasedAPINames__Group_1__3__Impl )
            // InternalFortXTrans.g:4016:2: rule__AliasedAPINames__Group_1__3__Impl
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
    // InternalFortXTrans.g:4022:1: rule__AliasedAPINames__Group_1__3__Impl : ( '}' ) ;
    public final void rule__AliasedAPINames__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4026:1: ( ( '}' ) )
            // InternalFortXTrans.g:4027:1: ( '}' )
            {
            // InternalFortXTrans.g:4027:1: ( '}' )
            // InternalFortXTrans.g:4028:2: '}'
            {
             before(grammarAccess.getAliasedAPINamesAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalFortXTrans.g:4038:1: rule__AliasedAPINames__Group_1_2__0 : rule__AliasedAPINames__Group_1_2__0__Impl rule__AliasedAPINames__Group_1_2__1 ;
    public final void rule__AliasedAPINames__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4042:1: ( rule__AliasedAPINames__Group_1_2__0__Impl rule__AliasedAPINames__Group_1_2__1 )
            // InternalFortXTrans.g:4043:2: rule__AliasedAPINames__Group_1_2__0__Impl rule__AliasedAPINames__Group_1_2__1
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
    // InternalFortXTrans.g:4050:1: rule__AliasedAPINames__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__AliasedAPINames__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4054:1: ( ( ',' ) )
            // InternalFortXTrans.g:4055:1: ( ',' )
            {
            // InternalFortXTrans.g:4055:1: ( ',' )
            // InternalFortXTrans.g:4056:2: ','
            {
             before(grammarAccess.getAliasedAPINamesAccess().getCommaKeyword_1_2_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalFortXTrans.g:4065:1: rule__AliasedAPINames__Group_1_2__1 : rule__AliasedAPINames__Group_1_2__1__Impl ;
    public final void rule__AliasedAPINames__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4069:1: ( rule__AliasedAPINames__Group_1_2__1__Impl )
            // InternalFortXTrans.g:4070:2: rule__AliasedAPINames__Group_1_2__1__Impl
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
    // InternalFortXTrans.g:4076:1: rule__AliasedAPINames__Group_1_2__1__Impl : ( ( rule__AliasedAPINames__NameListAssignment_1_2_1 ) ) ;
    public final void rule__AliasedAPINames__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4080:1: ( ( ( rule__AliasedAPINames__NameListAssignment_1_2_1 ) ) )
            // InternalFortXTrans.g:4081:1: ( ( rule__AliasedAPINames__NameListAssignment_1_2_1 ) )
            {
            // InternalFortXTrans.g:4081:1: ( ( rule__AliasedAPINames__NameListAssignment_1_2_1 ) )
            // InternalFortXTrans.g:4082:2: ( rule__AliasedAPINames__NameListAssignment_1_2_1 )
            {
             before(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_1_2_1()); 
            // InternalFortXTrans.g:4083:2: ( rule__AliasedAPINames__NameListAssignment_1_2_1 )
            // InternalFortXTrans.g:4083:3: rule__AliasedAPINames__NameListAssignment_1_2_1
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
    // InternalFortXTrans.g:4092:1: rule__AliasedAPIName__Group__0 : rule__AliasedAPIName__Group__0__Impl rule__AliasedAPIName__Group__1 ;
    public final void rule__AliasedAPIName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4096:1: ( rule__AliasedAPIName__Group__0__Impl rule__AliasedAPIName__Group__1 )
            // InternalFortXTrans.g:4097:2: rule__AliasedAPIName__Group__0__Impl rule__AliasedAPIName__Group__1
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
    // InternalFortXTrans.g:4104:1: rule__AliasedAPIName__Group__0__Impl : ( ( rule__AliasedAPIName__OrigAssignment_0 ) ) ;
    public final void rule__AliasedAPIName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4108:1: ( ( ( rule__AliasedAPIName__OrigAssignment_0 ) ) )
            // InternalFortXTrans.g:4109:1: ( ( rule__AliasedAPIName__OrigAssignment_0 ) )
            {
            // InternalFortXTrans.g:4109:1: ( ( rule__AliasedAPIName__OrigAssignment_0 ) )
            // InternalFortXTrans.g:4110:2: ( rule__AliasedAPIName__OrigAssignment_0 )
            {
             before(grammarAccess.getAliasedAPINameAccess().getOrigAssignment_0()); 
            // InternalFortXTrans.g:4111:2: ( rule__AliasedAPIName__OrigAssignment_0 )
            // InternalFortXTrans.g:4111:3: rule__AliasedAPIName__OrigAssignment_0
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
    // InternalFortXTrans.g:4119:1: rule__AliasedAPIName__Group__1 : rule__AliasedAPIName__Group__1__Impl ;
    public final void rule__AliasedAPIName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4123:1: ( rule__AliasedAPIName__Group__1__Impl )
            // InternalFortXTrans.g:4124:2: rule__AliasedAPIName__Group__1__Impl
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
    // InternalFortXTrans.g:4130:1: rule__AliasedAPIName__Group__1__Impl : ( ( rule__AliasedAPIName__Group_1__0 )? ) ;
    public final void rule__AliasedAPIName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4134:1: ( ( ( rule__AliasedAPIName__Group_1__0 )? ) )
            // InternalFortXTrans.g:4135:1: ( ( rule__AliasedAPIName__Group_1__0 )? )
            {
            // InternalFortXTrans.g:4135:1: ( ( rule__AliasedAPIName__Group_1__0 )? )
            // InternalFortXTrans.g:4136:2: ( rule__AliasedAPIName__Group_1__0 )?
            {
             before(grammarAccess.getAliasedAPINameAccess().getGroup_1()); 
            // InternalFortXTrans.g:4137:2: ( rule__AliasedAPIName__Group_1__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==28) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalFortXTrans.g:4137:3: rule__AliasedAPIName__Group_1__0
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
    // InternalFortXTrans.g:4146:1: rule__AliasedAPIName__Group_1__0 : rule__AliasedAPIName__Group_1__0__Impl rule__AliasedAPIName__Group_1__1 ;
    public final void rule__AliasedAPIName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4150:1: ( rule__AliasedAPIName__Group_1__0__Impl rule__AliasedAPIName__Group_1__1 )
            // InternalFortXTrans.g:4151:2: rule__AliasedAPIName__Group_1__0__Impl rule__AliasedAPIName__Group_1__1
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
    // InternalFortXTrans.g:4158:1: rule__AliasedAPIName__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__AliasedAPIName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4162:1: ( ( 'as' ) )
            // InternalFortXTrans.g:4163:1: ( 'as' )
            {
            // InternalFortXTrans.g:4163:1: ( 'as' )
            // InternalFortXTrans.g:4164:2: 'as'
            {
             before(grammarAccess.getAliasedAPINameAccess().getAsKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalFortXTrans.g:4173:1: rule__AliasedAPIName__Group_1__1 : rule__AliasedAPIName__Group_1__1__Impl ;
    public final void rule__AliasedAPIName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4177:1: ( rule__AliasedAPIName__Group_1__1__Impl )
            // InternalFortXTrans.g:4178:2: rule__AliasedAPIName__Group_1__1__Impl
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
    // InternalFortXTrans.g:4184:1: rule__AliasedAPIName__Group_1__1__Impl : ( ( rule__AliasedAPIName__AsNameAssignment_1_1 ) ) ;
    public final void rule__AliasedAPIName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4188:1: ( ( ( rule__AliasedAPIName__AsNameAssignment_1_1 ) ) )
            // InternalFortXTrans.g:4189:1: ( ( rule__AliasedAPIName__AsNameAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:4189:1: ( ( rule__AliasedAPIName__AsNameAssignment_1_1 ) )
            // InternalFortXTrans.g:4190:2: ( rule__AliasedAPIName__AsNameAssignment_1_1 )
            {
             before(grammarAccess.getAliasedAPINameAccess().getAsNameAssignment_1_1()); 
            // InternalFortXTrans.g:4191:2: ( rule__AliasedAPIName__AsNameAssignment_1_1 )
            // InternalFortXTrans.g:4191:3: rule__AliasedAPIName__AsNameAssignment_1_1
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
    // InternalFortXTrans.g:4200:1: rule__ValParam__Group_1__0 : rule__ValParam__Group_1__0__Impl rule__ValParam__Group_1__1 ;
    public final void rule__ValParam__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4204:1: ( rule__ValParam__Group_1__0__Impl rule__ValParam__Group_1__1 )
            // InternalFortXTrans.g:4205:2: rule__ValParam__Group_1__0__Impl rule__ValParam__Group_1__1
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
    // InternalFortXTrans.g:4212:1: rule__ValParam__Group_1__0__Impl : ( ( rule__ValParam__BrackAssignment_1_0 ) ) ;
    public final void rule__ValParam__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4216:1: ( ( ( rule__ValParam__BrackAssignment_1_0 ) ) )
            // InternalFortXTrans.g:4217:1: ( ( rule__ValParam__BrackAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:4217:1: ( ( rule__ValParam__BrackAssignment_1_0 ) )
            // InternalFortXTrans.g:4218:2: ( rule__ValParam__BrackAssignment_1_0 )
            {
             before(grammarAccess.getValParamAccess().getBrackAssignment_1_0()); 
            // InternalFortXTrans.g:4219:2: ( rule__ValParam__BrackAssignment_1_0 )
            // InternalFortXTrans.g:4219:3: rule__ValParam__BrackAssignment_1_0
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
    // InternalFortXTrans.g:4227:1: rule__ValParam__Group_1__1 : rule__ValParam__Group_1__1__Impl rule__ValParam__Group_1__2 ;
    public final void rule__ValParam__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4231:1: ( rule__ValParam__Group_1__1__Impl rule__ValParam__Group_1__2 )
            // InternalFortXTrans.g:4232:2: rule__ValParam__Group_1__1__Impl rule__ValParam__Group_1__2
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
    // InternalFortXTrans.g:4239:1: rule__ValParam__Group_1__1__Impl : ( ( rule__ValParam__Group_1_1__0 )? ) ;
    public final void rule__ValParam__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4243:1: ( ( ( rule__ValParam__Group_1_1__0 )? ) )
            // InternalFortXTrans.g:4244:1: ( ( rule__ValParam__Group_1_1__0 )? )
            {
            // InternalFortXTrans.g:4244:1: ( ( rule__ValParam__Group_1_1__0 )? )
            // InternalFortXTrans.g:4245:2: ( rule__ValParam__Group_1_1__0 )?
            {
             before(grammarAccess.getValParamAccess().getGroup_1_1()); 
            // InternalFortXTrans.g:4246:2: ( rule__ValParam__Group_1_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID||LA43_0==20) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalFortXTrans.g:4246:3: rule__ValParam__Group_1_1__0
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
    // InternalFortXTrans.g:4254:1: rule__ValParam__Group_1__2 : rule__ValParam__Group_1__2__Impl ;
    public final void rule__ValParam__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4258:1: ( rule__ValParam__Group_1__2__Impl )
            // InternalFortXTrans.g:4259:2: rule__ValParam__Group_1__2__Impl
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
    // InternalFortXTrans.g:4265:1: rule__ValParam__Group_1__2__Impl : ( ')' ) ;
    public final void rule__ValParam__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4269:1: ( ( ')' ) )
            // InternalFortXTrans.g:4270:1: ( ')' )
            {
            // InternalFortXTrans.g:4270:1: ( ')' )
            // InternalFortXTrans.g:4271:2: ')'
            {
             before(grammarAccess.getValParamAccess().getRightParenthesisKeyword_1_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalFortXTrans.g:4281:1: rule__ValParam__Group_1_1__0 : rule__ValParam__Group_1_1__0__Impl rule__ValParam__Group_1_1__1 ;
    public final void rule__ValParam__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4285:1: ( rule__ValParam__Group_1_1__0__Impl rule__ValParam__Group_1_1__1 )
            // InternalFortXTrans.g:4286:2: rule__ValParam__Group_1_1__0__Impl rule__ValParam__Group_1_1__1
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
    // InternalFortXTrans.g:4293:1: rule__ValParam__Group_1_1__0__Impl : ( ( rule__ValParam__ParamsAssignment_1_1_0 ) ) ;
    public final void rule__ValParam__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4297:1: ( ( ( rule__ValParam__ParamsAssignment_1_1_0 ) ) )
            // InternalFortXTrans.g:4298:1: ( ( rule__ValParam__ParamsAssignment_1_1_0 ) )
            {
            // InternalFortXTrans.g:4298:1: ( ( rule__ValParam__ParamsAssignment_1_1_0 ) )
            // InternalFortXTrans.g:4299:2: ( rule__ValParam__ParamsAssignment_1_1_0 )
            {
             before(grammarAccess.getValParamAccess().getParamsAssignment_1_1_0()); 
            // InternalFortXTrans.g:4300:2: ( rule__ValParam__ParamsAssignment_1_1_0 )
            // InternalFortXTrans.g:4300:3: rule__ValParam__ParamsAssignment_1_1_0
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
    // InternalFortXTrans.g:4308:1: rule__ValParam__Group_1_1__1 : rule__ValParam__Group_1_1__1__Impl ;
    public final void rule__ValParam__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4312:1: ( rule__ValParam__Group_1_1__1__Impl )
            // InternalFortXTrans.g:4313:2: rule__ValParam__Group_1_1__1__Impl
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
    // InternalFortXTrans.g:4319:1: rule__ValParam__Group_1_1__1__Impl : ( ( rule__ValParam__Group_1_1_1__0 )* ) ;
    public final void rule__ValParam__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4323:1: ( ( ( rule__ValParam__Group_1_1_1__0 )* ) )
            // InternalFortXTrans.g:4324:1: ( ( rule__ValParam__Group_1_1_1__0 )* )
            {
            // InternalFortXTrans.g:4324:1: ( ( rule__ValParam__Group_1_1_1__0 )* )
            // InternalFortXTrans.g:4325:2: ( rule__ValParam__Group_1_1_1__0 )*
            {
             before(grammarAccess.getValParamAccess().getGroup_1_1_1()); 
            // InternalFortXTrans.g:4326:2: ( rule__ValParam__Group_1_1_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==25) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalFortXTrans.g:4326:3: rule__ValParam__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ValParam__Group_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalFortXTrans.g:4335:1: rule__ValParam__Group_1_1_1__0 : rule__ValParam__Group_1_1_1__0__Impl rule__ValParam__Group_1_1_1__1 ;
    public final void rule__ValParam__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4339:1: ( rule__ValParam__Group_1_1_1__0__Impl rule__ValParam__Group_1_1_1__1 )
            // InternalFortXTrans.g:4340:2: rule__ValParam__Group_1_1_1__0__Impl rule__ValParam__Group_1_1_1__1
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
    // InternalFortXTrans.g:4347:1: rule__ValParam__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__ValParam__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4351:1: ( ( ',' ) )
            // InternalFortXTrans.g:4352:1: ( ',' )
            {
            // InternalFortXTrans.g:4352:1: ( ',' )
            // InternalFortXTrans.g:4353:2: ','
            {
             before(grammarAccess.getValParamAccess().getCommaKeyword_1_1_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalFortXTrans.g:4362:1: rule__ValParam__Group_1_1_1__1 : rule__ValParam__Group_1_1_1__1__Impl ;
    public final void rule__ValParam__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4366:1: ( rule__ValParam__Group_1_1_1__1__Impl )
            // InternalFortXTrans.g:4367:2: rule__ValParam__Group_1_1_1__1__Impl
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
    // InternalFortXTrans.g:4373:1: rule__ValParam__Group_1_1_1__1__Impl : ( ( rule__ValParam__ParamsAssignment_1_1_1_1 ) ) ;
    public final void rule__ValParam__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4377:1: ( ( ( rule__ValParam__ParamsAssignment_1_1_1_1 ) ) )
            // InternalFortXTrans.g:4378:1: ( ( rule__ValParam__ParamsAssignment_1_1_1_1 ) )
            {
            // InternalFortXTrans.g:4378:1: ( ( rule__ValParam__ParamsAssignment_1_1_1_1 ) )
            // InternalFortXTrans.g:4379:2: ( rule__ValParam__ParamsAssignment_1_1_1_1 )
            {
             before(grammarAccess.getValParamAccess().getParamsAssignment_1_1_1_1()); 
            // InternalFortXTrans.g:4380:2: ( rule__ValParam__ParamsAssignment_1_1_1_1 )
            // InternalFortXTrans.g:4380:3: rule__ValParam__ParamsAssignment_1_1_1_1
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
    // InternalFortXTrans.g:4389:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4393:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // InternalFortXTrans.g:4394:2: rule__Param__Group__0__Impl rule__Param__Group__1
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
    // InternalFortXTrans.g:4401:1: rule__Param__Group__0__Impl : ( ( rule__Param__BIdAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4405:1: ( ( ( rule__Param__BIdAssignment_0 ) ) )
            // InternalFortXTrans.g:4406:1: ( ( rule__Param__BIdAssignment_0 ) )
            {
            // InternalFortXTrans.g:4406:1: ( ( rule__Param__BIdAssignment_0 ) )
            // InternalFortXTrans.g:4407:2: ( rule__Param__BIdAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getBIdAssignment_0()); 
            // InternalFortXTrans.g:4408:2: ( rule__Param__BIdAssignment_0 )
            // InternalFortXTrans.g:4408:3: rule__Param__BIdAssignment_0
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
    // InternalFortXTrans.g:4416:1: rule__Param__Group__1 : rule__Param__Group__1__Impl ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4420:1: ( rule__Param__Group__1__Impl )
            // InternalFortXTrans.g:4421:2: rule__Param__Group__1__Impl
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
    // InternalFortXTrans.g:4427:1: rule__Param__Group__1__Impl : ( ( rule__Param__IstypeAssignment_1 ) ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4431:1: ( ( ( rule__Param__IstypeAssignment_1 ) ) )
            // InternalFortXTrans.g:4432:1: ( ( rule__Param__IstypeAssignment_1 ) )
            {
            // InternalFortXTrans.g:4432:1: ( ( rule__Param__IstypeAssignment_1 ) )
            // InternalFortXTrans.g:4433:2: ( rule__Param__IstypeAssignment_1 )
            {
             before(grammarAccess.getParamAccess().getIstypeAssignment_1()); 
            // InternalFortXTrans.g:4434:2: ( rule__Param__IstypeAssignment_1 )
            // InternalFortXTrans.g:4434:3: rule__Param__IstypeAssignment_1
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
    // InternalFortXTrans.g:4443:1: rule__RetType__Group_0__0 : rule__RetType__Group_0__0__Impl rule__RetType__Group_0__1 ;
    public final void rule__RetType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4447:1: ( rule__RetType__Group_0__0__Impl rule__RetType__Group_0__1 )
            // InternalFortXTrans.g:4448:2: rule__RetType__Group_0__0__Impl rule__RetType__Group_0__1
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
    // InternalFortXTrans.g:4455:1: rule__RetType__Group_0__0__Impl : ( ':' ) ;
    public final void rule__RetType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4459:1: ( ( ':' ) )
            // InternalFortXTrans.g:4460:1: ( ':' )
            {
            // InternalFortXTrans.g:4460:1: ( ':' )
            // InternalFortXTrans.g:4461:2: ':'
            {
             before(grammarAccess.getRetTypeAccess().getColonKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalFortXTrans.g:4470:1: rule__RetType__Group_0__1 : rule__RetType__Group_0__1__Impl rule__RetType__Group_0__2 ;
    public final void rule__RetType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4474:1: ( rule__RetType__Group_0__1__Impl rule__RetType__Group_0__2 )
            // InternalFortXTrans.g:4475:2: rule__RetType__Group_0__1__Impl rule__RetType__Group_0__2
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
    // InternalFortXTrans.g:4482:1: rule__RetType__Group_0__1__Impl : ( ( rule__RetType__EmptyAssignment_0_1 ) ) ;
    public final void rule__RetType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4486:1: ( ( ( rule__RetType__EmptyAssignment_0_1 ) ) )
            // InternalFortXTrans.g:4487:1: ( ( rule__RetType__EmptyAssignment_0_1 ) )
            {
            // InternalFortXTrans.g:4487:1: ( ( rule__RetType__EmptyAssignment_0_1 ) )
            // InternalFortXTrans.g:4488:2: ( rule__RetType__EmptyAssignment_0_1 )
            {
             before(grammarAccess.getRetTypeAccess().getEmptyAssignment_0_1()); 
            // InternalFortXTrans.g:4489:2: ( rule__RetType__EmptyAssignment_0_1 )
            // InternalFortXTrans.g:4489:3: rule__RetType__EmptyAssignment_0_1
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
    // InternalFortXTrans.g:4497:1: rule__RetType__Group_0__2 : rule__RetType__Group_0__2__Impl ;
    public final void rule__RetType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4501:1: ( rule__RetType__Group_0__2__Impl )
            // InternalFortXTrans.g:4502:2: rule__RetType__Group_0__2__Impl
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
    // InternalFortXTrans.g:4508:1: rule__RetType__Group_0__2__Impl : ( ')' ) ;
    public final void rule__RetType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4512:1: ( ( ')' ) )
            // InternalFortXTrans.g:4513:1: ( ')' )
            {
            // InternalFortXTrans.g:4513:1: ( ')' )
            // InternalFortXTrans.g:4514:2: ')'
            {
             before(grammarAccess.getRetTypeAccess().getRightParenthesisKeyword_0_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalFortXTrans.g:4524:1: rule__RetType__Group_1__0 : rule__RetType__Group_1__0__Impl rule__RetType__Group_1__1 ;
    public final void rule__RetType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4528:1: ( rule__RetType__Group_1__0__Impl rule__RetType__Group_1__1 )
            // InternalFortXTrans.g:4529:2: rule__RetType__Group_1__0__Impl rule__RetType__Group_1__1
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
    // InternalFortXTrans.g:4536:1: rule__RetType__Group_1__0__Impl : ( ':' ) ;
    public final void rule__RetType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4540:1: ( ( ':' ) )
            // InternalFortXTrans.g:4541:1: ( ':' )
            {
            // InternalFortXTrans.g:4541:1: ( ':' )
            // InternalFortXTrans.g:4542:2: ':'
            {
             before(grammarAccess.getRetTypeAccess().getColonKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalFortXTrans.g:4551:1: rule__RetType__Group_1__1 : rule__RetType__Group_1__1__Impl ;
    public final void rule__RetType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4555:1: ( rule__RetType__Group_1__1__Impl )
            // InternalFortXTrans.g:4556:2: rule__RetType__Group_1__1__Impl
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
    // InternalFortXTrans.g:4562:1: rule__RetType__Group_1__1__Impl : ( ( rule__RetType__TypeAssignment_1_1 ) ) ;
    public final void rule__RetType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4566:1: ( ( ( rule__RetType__TypeAssignment_1_1 ) ) )
            // InternalFortXTrans.g:4567:1: ( ( rule__RetType__TypeAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:4567:1: ( ( rule__RetType__TypeAssignment_1_1 ) )
            // InternalFortXTrans.g:4568:2: ( rule__RetType__TypeAssignment_1_1 )
            {
             before(grammarAccess.getRetTypeAccess().getTypeAssignment_1_1()); 
            // InternalFortXTrans.g:4569:2: ( rule__RetType__TypeAssignment_1_1 )
            // InternalFortXTrans.g:4569:3: rule__RetType__TypeAssignment_1_1
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


    // $ANTLR start "rule__TupleType__Group__0"
    // InternalFortXTrans.g:4578:1: rule__TupleType__Group__0 : rule__TupleType__Group__0__Impl rule__TupleType__Group__1 ;
    public final void rule__TupleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4582:1: ( rule__TupleType__Group__0__Impl rule__TupleType__Group__1 )
            // InternalFortXTrans.g:4583:2: rule__TupleType__Group__0__Impl rule__TupleType__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__TupleType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TupleType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleType__Group__0"


    // $ANTLR start "rule__TupleType__Group__0__Impl"
    // InternalFortXTrans.g:4590:1: rule__TupleType__Group__0__Impl : ( '(' ) ;
    public final void rule__TupleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4594:1: ( ( '(' ) )
            // InternalFortXTrans.g:4595:1: ( '(' )
            {
            // InternalFortXTrans.g:4595:1: ( '(' )
            // InternalFortXTrans.g:4596:2: '('
            {
             before(grammarAccess.getTupleTypeAccess().getLeftParenthesisKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTupleTypeAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleType__Group__0__Impl"


    // $ANTLR start "rule__TupleType__Group__1"
    // InternalFortXTrans.g:4605:1: rule__TupleType__Group__1 : rule__TupleType__Group__1__Impl rule__TupleType__Group__2 ;
    public final void rule__TupleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4609:1: ( rule__TupleType__Group__1__Impl rule__TupleType__Group__2 )
            // InternalFortXTrans.g:4610:2: rule__TupleType__Group__1__Impl rule__TupleType__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__TupleType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TupleType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleType__Group__1"


    // $ANTLR start "rule__TupleType__Group__1__Impl"
    // InternalFortXTrans.g:4617:1: rule__TupleType__Group__1__Impl : ( ( rule__TupleType__TypesAssignment_1 ) ) ;
    public final void rule__TupleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4621:1: ( ( ( rule__TupleType__TypesAssignment_1 ) ) )
            // InternalFortXTrans.g:4622:1: ( ( rule__TupleType__TypesAssignment_1 ) )
            {
            // InternalFortXTrans.g:4622:1: ( ( rule__TupleType__TypesAssignment_1 ) )
            // InternalFortXTrans.g:4623:2: ( rule__TupleType__TypesAssignment_1 )
            {
             before(grammarAccess.getTupleTypeAccess().getTypesAssignment_1()); 
            // InternalFortXTrans.g:4624:2: ( rule__TupleType__TypesAssignment_1 )
            // InternalFortXTrans.g:4624:3: rule__TupleType__TypesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TupleType__TypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTupleTypeAccess().getTypesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleType__Group__1__Impl"


    // $ANTLR start "rule__TupleType__Group__2"
    // InternalFortXTrans.g:4632:1: rule__TupleType__Group__2 : rule__TupleType__Group__2__Impl rule__TupleType__Group__3 ;
    public final void rule__TupleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4636:1: ( rule__TupleType__Group__2__Impl rule__TupleType__Group__3 )
            // InternalFortXTrans.g:4637:2: rule__TupleType__Group__2__Impl rule__TupleType__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__TupleType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TupleType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleType__Group__2"


    // $ANTLR start "rule__TupleType__Group__2__Impl"
    // InternalFortXTrans.g:4644:1: rule__TupleType__Group__2__Impl : ( ( rule__TupleType__Group_2__0 )* ) ;
    public final void rule__TupleType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4648:1: ( ( ( rule__TupleType__Group_2__0 )* ) )
            // InternalFortXTrans.g:4649:1: ( ( rule__TupleType__Group_2__0 )* )
            {
            // InternalFortXTrans.g:4649:1: ( ( rule__TupleType__Group_2__0 )* )
            // InternalFortXTrans.g:4650:2: ( rule__TupleType__Group_2__0 )*
            {
             before(grammarAccess.getTupleTypeAccess().getGroup_2()); 
            // InternalFortXTrans.g:4651:2: ( rule__TupleType__Group_2__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==25) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalFortXTrans.g:4651:3: rule__TupleType__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__TupleType__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getTupleTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleType__Group__2__Impl"


    // $ANTLR start "rule__TupleType__Group__3"
    // InternalFortXTrans.g:4659:1: rule__TupleType__Group__3 : rule__TupleType__Group__3__Impl ;
    public final void rule__TupleType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4663:1: ( rule__TupleType__Group__3__Impl )
            // InternalFortXTrans.g:4664:2: rule__TupleType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TupleType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleType__Group__3"


    // $ANTLR start "rule__TupleType__Group__3__Impl"
    // InternalFortXTrans.g:4670:1: rule__TupleType__Group__3__Impl : ( ')' ) ;
    public final void rule__TupleType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4674:1: ( ( ')' ) )
            // InternalFortXTrans.g:4675:1: ( ')' )
            {
            // InternalFortXTrans.g:4675:1: ( ')' )
            // InternalFortXTrans.g:4676:2: ')'
            {
             before(grammarAccess.getTupleTypeAccess().getRightParenthesisKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTupleTypeAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleType__Group__3__Impl"


    // $ANTLR start "rule__TupleType__Group_2__0"
    // InternalFortXTrans.g:4686:1: rule__TupleType__Group_2__0 : rule__TupleType__Group_2__0__Impl rule__TupleType__Group_2__1 ;
    public final void rule__TupleType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4690:1: ( rule__TupleType__Group_2__0__Impl rule__TupleType__Group_2__1 )
            // InternalFortXTrans.g:4691:2: rule__TupleType__Group_2__0__Impl rule__TupleType__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__TupleType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TupleType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleType__Group_2__0"


    // $ANTLR start "rule__TupleType__Group_2__0__Impl"
    // InternalFortXTrans.g:4698:1: rule__TupleType__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TupleType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4702:1: ( ( ',' ) )
            // InternalFortXTrans.g:4703:1: ( ',' )
            {
            // InternalFortXTrans.g:4703:1: ( ',' )
            // InternalFortXTrans.g:4704:2: ','
            {
             before(grammarAccess.getTupleTypeAccess().getCommaKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTupleTypeAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleType__Group_2__0__Impl"


    // $ANTLR start "rule__TupleType__Group_2__1"
    // InternalFortXTrans.g:4713:1: rule__TupleType__Group_2__1 : rule__TupleType__Group_2__1__Impl ;
    public final void rule__TupleType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4717:1: ( rule__TupleType__Group_2__1__Impl )
            // InternalFortXTrans.g:4718:2: rule__TupleType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TupleType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleType__Group_2__1"


    // $ANTLR start "rule__TupleType__Group_2__1__Impl"
    // InternalFortXTrans.g:4724:1: rule__TupleType__Group_2__1__Impl : ( ( rule__TupleType__TypesAssignment_2_1 ) ) ;
    public final void rule__TupleType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4728:1: ( ( ( rule__TupleType__TypesAssignment_2_1 ) ) )
            // InternalFortXTrans.g:4729:1: ( ( rule__TupleType__TypesAssignment_2_1 ) )
            {
            // InternalFortXTrans.g:4729:1: ( ( rule__TupleType__TypesAssignment_2_1 ) )
            // InternalFortXTrans.g:4730:2: ( rule__TupleType__TypesAssignment_2_1 )
            {
             before(grammarAccess.getTupleTypeAccess().getTypesAssignment_2_1()); 
            // InternalFortXTrans.g:4731:2: ( rule__TupleType__TypesAssignment_2_1 )
            // InternalFortXTrans.g:4731:3: rule__TupleType__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TupleType__TypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTupleTypeAccess().getTypesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleType__Group_2__1__Impl"


    // $ANTLR start "rule__FnDecl__Group__0"
    // InternalFortXTrans.g:4740:1: rule__FnDecl__Group__0 : rule__FnDecl__Group__0__Impl rule__FnDecl__Group__1 ;
    public final void rule__FnDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4744:1: ( rule__FnDecl__Group__0__Impl rule__FnDecl__Group__1 )
            // InternalFortXTrans.g:4745:2: rule__FnDecl__Group__0__Impl rule__FnDecl__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalFortXTrans.g:4752:1: rule__FnDecl__Group__0__Impl : ( ( rule__FnDecl__ModsAssignment_0 )? ) ;
    public final void rule__FnDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4756:1: ( ( ( rule__FnDecl__ModsAssignment_0 )? ) )
            // InternalFortXTrans.g:4757:1: ( ( rule__FnDecl__ModsAssignment_0 )? )
            {
            // InternalFortXTrans.g:4757:1: ( ( rule__FnDecl__ModsAssignment_0 )? )
            // InternalFortXTrans.g:4758:2: ( rule__FnDecl__ModsAssignment_0 )?
            {
             before(grammarAccess.getFnDeclAccess().getModsAssignment_0()); 
            // InternalFortXTrans.g:4759:2: ( rule__FnDecl__ModsAssignment_0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=42 && LA46_0<=45)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalFortXTrans.g:4759:3: rule__FnDecl__ModsAssignment_0
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
    // InternalFortXTrans.g:4767:1: rule__FnDecl__Group__1 : rule__FnDecl__Group__1__Impl rule__FnDecl__Group__2 ;
    public final void rule__FnDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4771:1: ( rule__FnDecl__Group__1__Impl rule__FnDecl__Group__2 )
            // InternalFortXTrans.g:4772:2: rule__FnDecl__Group__1__Impl rule__FnDecl__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalFortXTrans.g:4779:1: rule__FnDecl__Group__1__Impl : ( ( rule__FnDecl__NameAssignment_1 ) ) ;
    public final void rule__FnDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4783:1: ( ( ( rule__FnDecl__NameAssignment_1 ) ) )
            // InternalFortXTrans.g:4784:1: ( ( rule__FnDecl__NameAssignment_1 ) )
            {
            // InternalFortXTrans.g:4784:1: ( ( rule__FnDecl__NameAssignment_1 ) )
            // InternalFortXTrans.g:4785:2: ( rule__FnDecl__NameAssignment_1 )
            {
             before(grammarAccess.getFnDeclAccess().getNameAssignment_1()); 
            // InternalFortXTrans.g:4786:2: ( rule__FnDecl__NameAssignment_1 )
            // InternalFortXTrans.g:4786:3: rule__FnDecl__NameAssignment_1
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
    // InternalFortXTrans.g:4794:1: rule__FnDecl__Group__2 : rule__FnDecl__Group__2__Impl rule__FnDecl__Group__3 ;
    public final void rule__FnDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4798:1: ( rule__FnDecl__Group__2__Impl rule__FnDecl__Group__3 )
            // InternalFortXTrans.g:4799:2: rule__FnDecl__Group__2__Impl rule__FnDecl__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalFortXTrans.g:4806:1: rule__FnDecl__Group__2__Impl : ( ( rule__FnDecl__ParamsAssignment_2 ) ) ;
    public final void rule__FnDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4810:1: ( ( ( rule__FnDecl__ParamsAssignment_2 ) ) )
            // InternalFortXTrans.g:4811:1: ( ( rule__FnDecl__ParamsAssignment_2 ) )
            {
            // InternalFortXTrans.g:4811:1: ( ( rule__FnDecl__ParamsAssignment_2 ) )
            // InternalFortXTrans.g:4812:2: ( rule__FnDecl__ParamsAssignment_2 )
            {
             before(grammarAccess.getFnDeclAccess().getParamsAssignment_2()); 
            // InternalFortXTrans.g:4813:2: ( rule__FnDecl__ParamsAssignment_2 )
            // InternalFortXTrans.g:4813:3: rule__FnDecl__ParamsAssignment_2
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
    // InternalFortXTrans.g:4821:1: rule__FnDecl__Group__3 : rule__FnDecl__Group__3__Impl rule__FnDecl__Group__4 ;
    public final void rule__FnDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4825:1: ( rule__FnDecl__Group__3__Impl rule__FnDecl__Group__4 )
            // InternalFortXTrans.g:4826:2: rule__FnDecl__Group__3__Impl rule__FnDecl__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalFortXTrans.g:4833:1: rule__FnDecl__Group__3__Impl : ( ( rule__FnDecl__RetValAssignment_3 )? ) ;
    public final void rule__FnDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4837:1: ( ( ( rule__FnDecl__RetValAssignment_3 )? ) )
            // InternalFortXTrans.g:4838:1: ( ( rule__FnDecl__RetValAssignment_3 )? )
            {
            // InternalFortXTrans.g:4838:1: ( ( rule__FnDecl__RetValAssignment_3 )? )
            // InternalFortXTrans.g:4839:2: ( rule__FnDecl__RetValAssignment_3 )?
            {
             before(grammarAccess.getFnDeclAccess().getRetValAssignment_3()); 
            // InternalFortXTrans.g:4840:2: ( rule__FnDecl__RetValAssignment_3 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==30) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalFortXTrans.g:4840:3: rule__FnDecl__RetValAssignment_3
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
    // InternalFortXTrans.g:4848:1: rule__FnDecl__Group__4 : rule__FnDecl__Group__4__Impl ;
    public final void rule__FnDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4852:1: ( rule__FnDecl__Group__4__Impl )
            // InternalFortXTrans.g:4853:2: rule__FnDecl__Group__4__Impl
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
    // InternalFortXTrans.g:4859:1: rule__FnDecl__Group__4__Impl : ( ( rule__FnDecl__Group_4__0 )? ) ;
    public final void rule__FnDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4863:1: ( ( ( rule__FnDecl__Group_4__0 )? ) )
            // InternalFortXTrans.g:4864:1: ( ( rule__FnDecl__Group_4__0 )? )
            {
            // InternalFortXTrans.g:4864:1: ( ( rule__FnDecl__Group_4__0 )? )
            // InternalFortXTrans.g:4865:2: ( rule__FnDecl__Group_4__0 )?
            {
             before(grammarAccess.getFnDeclAccess().getGroup_4()); 
            // InternalFortXTrans.g:4866:2: ( rule__FnDecl__Group_4__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==38) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalFortXTrans.g:4866:3: rule__FnDecl__Group_4__0
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
    // InternalFortXTrans.g:4875:1: rule__FnDecl__Group_4__0 : rule__FnDecl__Group_4__0__Impl rule__FnDecl__Group_4__1 ;
    public final void rule__FnDecl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4879:1: ( rule__FnDecl__Group_4__0__Impl rule__FnDecl__Group_4__1 )
            // InternalFortXTrans.g:4880:2: rule__FnDecl__Group_4__0__Impl rule__FnDecl__Group_4__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalFortXTrans.g:4887:1: rule__FnDecl__Group_4__0__Impl : ( ( rule__FnDecl__BodyAssignment_4_0 ) ) ;
    public final void rule__FnDecl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4891:1: ( ( ( rule__FnDecl__BodyAssignment_4_0 ) ) )
            // InternalFortXTrans.g:4892:1: ( ( rule__FnDecl__BodyAssignment_4_0 ) )
            {
            // InternalFortXTrans.g:4892:1: ( ( rule__FnDecl__BodyAssignment_4_0 ) )
            // InternalFortXTrans.g:4893:2: ( rule__FnDecl__BodyAssignment_4_0 )
            {
             before(grammarAccess.getFnDeclAccess().getBodyAssignment_4_0()); 
            // InternalFortXTrans.g:4894:2: ( rule__FnDecl__BodyAssignment_4_0 )
            // InternalFortXTrans.g:4894:3: rule__FnDecl__BodyAssignment_4_0
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
    // InternalFortXTrans.g:4902:1: rule__FnDecl__Group_4__1 : rule__FnDecl__Group_4__1__Impl ;
    public final void rule__FnDecl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4906:1: ( rule__FnDecl__Group_4__1__Impl )
            // InternalFortXTrans.g:4907:2: rule__FnDecl__Group_4__1__Impl
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
    // InternalFortXTrans.g:4913:1: rule__FnDecl__Group_4__1__Impl : ( ( rule__FnDecl__FnItselfAssignment_4_1 ) ) ;
    public final void rule__FnDecl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4917:1: ( ( ( rule__FnDecl__FnItselfAssignment_4_1 ) ) )
            // InternalFortXTrans.g:4918:1: ( ( rule__FnDecl__FnItselfAssignment_4_1 ) )
            {
            // InternalFortXTrans.g:4918:1: ( ( rule__FnDecl__FnItselfAssignment_4_1 ) )
            // InternalFortXTrans.g:4919:2: ( rule__FnDecl__FnItselfAssignment_4_1 )
            {
             before(grammarAccess.getFnDeclAccess().getFnItselfAssignment_4_1()); 
            // InternalFortXTrans.g:4920:2: ( rule__FnDecl__FnItselfAssignment_4_1 )
            // InternalFortXTrans.g:4920:3: rule__FnDecl__FnItselfAssignment_4_1
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
    // InternalFortXTrans.g:4929:1: rule__Expr__Group__0 : rule__Expr__Group__0__Impl rule__Expr__Group__1 ;
    public final void rule__Expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4933:1: ( rule__Expr__Group__0__Impl rule__Expr__Group__1 )
            // InternalFortXTrans.g:4934:2: rule__Expr__Group__0__Impl rule__Expr__Group__1
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
    // InternalFortXTrans.g:4941:1: rule__Expr__Group__0__Impl : ( ( rule__Expr__FrontAssignment_0 ) ) ;
    public final void rule__Expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4945:1: ( ( ( rule__Expr__FrontAssignment_0 ) ) )
            // InternalFortXTrans.g:4946:1: ( ( rule__Expr__FrontAssignment_0 ) )
            {
            // InternalFortXTrans.g:4946:1: ( ( rule__Expr__FrontAssignment_0 ) )
            // InternalFortXTrans.g:4947:2: ( rule__Expr__FrontAssignment_0 )
            {
             before(grammarAccess.getExprAccess().getFrontAssignment_0()); 
            // InternalFortXTrans.g:4948:2: ( rule__Expr__FrontAssignment_0 )
            // InternalFortXTrans.g:4948:3: rule__Expr__FrontAssignment_0
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
    // InternalFortXTrans.g:4956:1: rule__Expr__Group__1 : rule__Expr__Group__1__Impl ;
    public final void rule__Expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4960:1: ( rule__Expr__Group__1__Impl )
            // InternalFortXTrans.g:4961:2: rule__Expr__Group__1__Impl
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
    // InternalFortXTrans.g:4967:1: rule__Expr__Group__1__Impl : ( ( rule__Expr__TailsAssignment_1 )* ) ;
    public final void rule__Expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4971:1: ( ( ( rule__Expr__TailsAssignment_1 )* ) )
            // InternalFortXTrans.g:4972:1: ( ( rule__Expr__TailsAssignment_1 )* )
            {
            // InternalFortXTrans.g:4972:1: ( ( rule__Expr__TailsAssignment_1 )* )
            // InternalFortXTrans.g:4973:2: ( rule__Expr__TailsAssignment_1 )*
            {
             before(grammarAccess.getExprAccess().getTailsAssignment_1()); 
            // InternalFortXTrans.g:4974:2: ( rule__Expr__TailsAssignment_1 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==28) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalFortXTrans.g:4974:3: rule__Expr__TailsAssignment_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Expr__TailsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalFortXTrans.g:4983:1: rule__ExprTail__Group__0 : rule__ExprTail__Group__0__Impl rule__ExprTail__Group__1 ;
    public final void rule__ExprTail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4987:1: ( rule__ExprTail__Group__0__Impl rule__ExprTail__Group__1 )
            // InternalFortXTrans.g:4988:2: rule__ExprTail__Group__0__Impl rule__ExprTail__Group__1
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
    // InternalFortXTrans.g:4995:1: rule__ExprTail__Group__0__Impl : ( 'as' ) ;
    public final void rule__ExprTail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4999:1: ( ( 'as' ) )
            // InternalFortXTrans.g:5000:1: ( 'as' )
            {
            // InternalFortXTrans.g:5000:1: ( 'as' )
            // InternalFortXTrans.g:5001:2: 'as'
            {
             before(grammarAccess.getExprTailAccess().getAsKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalFortXTrans.g:5010:1: rule__ExprTail__Group__1 : rule__ExprTail__Group__1__Impl ;
    public final void rule__ExprTail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5014:1: ( rule__ExprTail__Group__1__Impl )
            // InternalFortXTrans.g:5015:2: rule__ExprTail__Group__1__Impl
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
    // InternalFortXTrans.g:5021:1: rule__ExprTail__Group__1__Impl : ( ( rule__ExprTail__TypeAssignment_1 ) ) ;
    public final void rule__ExprTail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5025:1: ( ( ( rule__ExprTail__TypeAssignment_1 ) ) )
            // InternalFortXTrans.g:5026:1: ( ( rule__ExprTail__TypeAssignment_1 ) )
            {
            // InternalFortXTrans.g:5026:1: ( ( rule__ExprTail__TypeAssignment_1 ) )
            // InternalFortXTrans.g:5027:2: ( rule__ExprTail__TypeAssignment_1 )
            {
             before(grammarAccess.getExprTailAccess().getTypeAssignment_1()); 
            // InternalFortXTrans.g:5028:2: ( rule__ExprTail__TypeAssignment_1 )
            // InternalFortXTrans.g:5028:3: rule__ExprTail__TypeAssignment_1
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
    // InternalFortXTrans.g:5037:1: rule__DelimitedExpr__Group_1__0 : rule__DelimitedExpr__Group_1__0__Impl rule__DelimitedExpr__Group_1__1 ;
    public final void rule__DelimitedExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5041:1: ( rule__DelimitedExpr__Group_1__0__Impl rule__DelimitedExpr__Group_1__1 )
            // InternalFortXTrans.g:5042:2: rule__DelimitedExpr__Group_1__0__Impl rule__DelimitedExpr__Group_1__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalFortXTrans.g:5049:1: rule__DelimitedExpr__Group_1__0__Impl : ( ( rule__DelimitedExpr__AwhileAssignment_1_0 ) ) ;
    public final void rule__DelimitedExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5053:1: ( ( ( rule__DelimitedExpr__AwhileAssignment_1_0 ) ) )
            // InternalFortXTrans.g:5054:1: ( ( rule__DelimitedExpr__AwhileAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:5054:1: ( ( rule__DelimitedExpr__AwhileAssignment_1_0 ) )
            // InternalFortXTrans.g:5055:2: ( rule__DelimitedExpr__AwhileAssignment_1_0 )
            {
             before(grammarAccess.getDelimitedExprAccess().getAwhileAssignment_1_0()); 
            // InternalFortXTrans.g:5056:2: ( rule__DelimitedExpr__AwhileAssignment_1_0 )
            // InternalFortXTrans.g:5056:3: rule__DelimitedExpr__AwhileAssignment_1_0
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
    // InternalFortXTrans.g:5064:1: rule__DelimitedExpr__Group_1__1 : rule__DelimitedExpr__Group_1__1__Impl rule__DelimitedExpr__Group_1__2 ;
    public final void rule__DelimitedExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5068:1: ( rule__DelimitedExpr__Group_1__1__Impl rule__DelimitedExpr__Group_1__2 )
            // InternalFortXTrans.g:5069:2: rule__DelimitedExpr__Group_1__1__Impl rule__DelimitedExpr__Group_1__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalFortXTrans.g:5076:1: rule__DelimitedExpr__Group_1__1__Impl : ( ( rule__DelimitedExpr__ExprAssignment_1_1 ) ) ;
    public final void rule__DelimitedExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5080:1: ( ( ( rule__DelimitedExpr__ExprAssignment_1_1 ) ) )
            // InternalFortXTrans.g:5081:1: ( ( rule__DelimitedExpr__ExprAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:5081:1: ( ( rule__DelimitedExpr__ExprAssignment_1_1 ) )
            // InternalFortXTrans.g:5082:2: ( rule__DelimitedExpr__ExprAssignment_1_1 )
            {
             before(grammarAccess.getDelimitedExprAccess().getExprAssignment_1_1()); 
            // InternalFortXTrans.g:5083:2: ( rule__DelimitedExpr__ExprAssignment_1_1 )
            // InternalFortXTrans.g:5083:3: rule__DelimitedExpr__ExprAssignment_1_1
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
    // InternalFortXTrans.g:5091:1: rule__DelimitedExpr__Group_1__2 : rule__DelimitedExpr__Group_1__2__Impl ;
    public final void rule__DelimitedExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5095:1: ( rule__DelimitedExpr__Group_1__2__Impl )
            // InternalFortXTrans.g:5096:2: rule__DelimitedExpr__Group_1__2__Impl
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
    // InternalFortXTrans.g:5102:1: rule__DelimitedExpr__Group_1__2__Impl : ( ( rule__DelimitedExpr__WhiledodAssignment_1_2 ) ) ;
    public final void rule__DelimitedExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5106:1: ( ( ( rule__DelimitedExpr__WhiledodAssignment_1_2 ) ) )
            // InternalFortXTrans.g:5107:1: ( ( rule__DelimitedExpr__WhiledodAssignment_1_2 ) )
            {
            // InternalFortXTrans.g:5107:1: ( ( rule__DelimitedExpr__WhiledodAssignment_1_2 ) )
            // InternalFortXTrans.g:5108:2: ( rule__DelimitedExpr__WhiledodAssignment_1_2 )
            {
             before(grammarAccess.getDelimitedExprAccess().getWhiledodAssignment_1_2()); 
            // InternalFortXTrans.g:5109:2: ( rule__DelimitedExpr__WhiledodAssignment_1_2 )
            // InternalFortXTrans.g:5109:3: rule__DelimitedExpr__WhiledodAssignment_1_2
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
    // InternalFortXTrans.g:5118:1: rule__DelimitedExpr__Group_2__0 : rule__DelimitedExpr__Group_2__0__Impl rule__DelimitedExpr__Group_2__1 ;
    public final void rule__DelimitedExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5122:1: ( rule__DelimitedExpr__Group_2__0__Impl rule__DelimitedExpr__Group_2__1 )
            // InternalFortXTrans.g:5123:2: rule__DelimitedExpr__Group_2__0__Impl rule__DelimitedExpr__Group_2__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalFortXTrans.g:5130:1: rule__DelimitedExpr__Group_2__0__Impl : ( ( rule__DelimitedExpr__AforAssignment_2_0 ) ) ;
    public final void rule__DelimitedExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5134:1: ( ( ( rule__DelimitedExpr__AforAssignment_2_0 ) ) )
            // InternalFortXTrans.g:5135:1: ( ( rule__DelimitedExpr__AforAssignment_2_0 ) )
            {
            // InternalFortXTrans.g:5135:1: ( ( rule__DelimitedExpr__AforAssignment_2_0 ) )
            // InternalFortXTrans.g:5136:2: ( rule__DelimitedExpr__AforAssignment_2_0 )
            {
             before(grammarAccess.getDelimitedExprAccess().getAforAssignment_2_0()); 
            // InternalFortXTrans.g:5137:2: ( rule__DelimitedExpr__AforAssignment_2_0 )
            // InternalFortXTrans.g:5137:3: rule__DelimitedExpr__AforAssignment_2_0
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
    // InternalFortXTrans.g:5145:1: rule__DelimitedExpr__Group_2__1 : rule__DelimitedExpr__Group_2__1__Impl rule__DelimitedExpr__Group_2__2 ;
    public final void rule__DelimitedExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5149:1: ( rule__DelimitedExpr__Group_2__1__Impl rule__DelimitedExpr__Group_2__2 )
            // InternalFortXTrans.g:5150:2: rule__DelimitedExpr__Group_2__1__Impl rule__DelimitedExpr__Group_2__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalFortXTrans.g:5157:1: rule__DelimitedExpr__Group_2__1__Impl : ( ( rule__DelimitedExpr__GenAssignment_2_1 ) ) ;
    public final void rule__DelimitedExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5161:1: ( ( ( rule__DelimitedExpr__GenAssignment_2_1 ) ) )
            // InternalFortXTrans.g:5162:1: ( ( rule__DelimitedExpr__GenAssignment_2_1 ) )
            {
            // InternalFortXTrans.g:5162:1: ( ( rule__DelimitedExpr__GenAssignment_2_1 ) )
            // InternalFortXTrans.g:5163:2: ( rule__DelimitedExpr__GenAssignment_2_1 )
            {
             before(grammarAccess.getDelimitedExprAccess().getGenAssignment_2_1()); 
            // InternalFortXTrans.g:5164:2: ( rule__DelimitedExpr__GenAssignment_2_1 )
            // InternalFortXTrans.g:5164:3: rule__DelimitedExpr__GenAssignment_2_1
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
    // InternalFortXTrans.g:5172:1: rule__DelimitedExpr__Group_2__2 : rule__DelimitedExpr__Group_2__2__Impl rule__DelimitedExpr__Group_2__3 ;
    public final void rule__DelimitedExpr__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5176:1: ( rule__DelimitedExpr__Group_2__2__Impl rule__DelimitedExpr__Group_2__3 )
            // InternalFortXTrans.g:5177:2: rule__DelimitedExpr__Group_2__2__Impl rule__DelimitedExpr__Group_2__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalFortXTrans.g:5184:1: rule__DelimitedExpr__Group_2__2__Impl : ( ( rule__DelimitedExpr__DofrontAssignment_2_2 ) ) ;
    public final void rule__DelimitedExpr__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5188:1: ( ( ( rule__DelimitedExpr__DofrontAssignment_2_2 ) ) )
            // InternalFortXTrans.g:5189:1: ( ( rule__DelimitedExpr__DofrontAssignment_2_2 ) )
            {
            // InternalFortXTrans.g:5189:1: ( ( rule__DelimitedExpr__DofrontAssignment_2_2 ) )
            // InternalFortXTrans.g:5190:2: ( rule__DelimitedExpr__DofrontAssignment_2_2 )
            {
             before(grammarAccess.getDelimitedExprAccess().getDofrontAssignment_2_2()); 
            // InternalFortXTrans.g:5191:2: ( rule__DelimitedExpr__DofrontAssignment_2_2 )
            // InternalFortXTrans.g:5191:3: rule__DelimitedExpr__DofrontAssignment_2_2
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
    // InternalFortXTrans.g:5199:1: rule__DelimitedExpr__Group_2__3 : rule__DelimitedExpr__Group_2__3__Impl ;
    public final void rule__DelimitedExpr__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5203:1: ( rule__DelimitedExpr__Group_2__3__Impl )
            // InternalFortXTrans.g:5204:2: rule__DelimitedExpr__Group_2__3__Impl
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
    // InternalFortXTrans.g:5210:1: rule__DelimitedExpr__Group_2__3__Impl : ( 'end' ) ;
    public final void rule__DelimitedExpr__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5214:1: ( ( 'end' ) )
            // InternalFortXTrans.g:5215:1: ( 'end' )
            {
            // InternalFortXTrans.g:5215:1: ( 'end' )
            // InternalFortXTrans.g:5216:2: 'end'
            {
             before(grammarAccess.getDelimitedExprAccess().getEndKeyword_2_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalFortXTrans.g:5226:1: rule__DelimitedExpr__Group_3__0 : rule__DelimitedExpr__Group_3__0__Impl rule__DelimitedExpr__Group_3__1 ;
    public final void rule__DelimitedExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5230:1: ( rule__DelimitedExpr__Group_3__0__Impl rule__DelimitedExpr__Group_3__1 )
            // InternalFortXTrans.g:5231:2: rule__DelimitedExpr__Group_3__0__Impl rule__DelimitedExpr__Group_3__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalFortXTrans.g:5238:1: rule__DelimitedExpr__Group_3__0__Impl : ( ( rule__DelimitedExpr__AnifAssignment_3_0 ) ) ;
    public final void rule__DelimitedExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5242:1: ( ( ( rule__DelimitedExpr__AnifAssignment_3_0 ) ) )
            // InternalFortXTrans.g:5243:1: ( ( rule__DelimitedExpr__AnifAssignment_3_0 ) )
            {
            // InternalFortXTrans.g:5243:1: ( ( rule__DelimitedExpr__AnifAssignment_3_0 ) )
            // InternalFortXTrans.g:5244:2: ( rule__DelimitedExpr__AnifAssignment_3_0 )
            {
             before(grammarAccess.getDelimitedExprAccess().getAnifAssignment_3_0()); 
            // InternalFortXTrans.g:5245:2: ( rule__DelimitedExpr__AnifAssignment_3_0 )
            // InternalFortXTrans.g:5245:3: rule__DelimitedExpr__AnifAssignment_3_0
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
    // InternalFortXTrans.g:5253:1: rule__DelimitedExpr__Group_3__1 : rule__DelimitedExpr__Group_3__1__Impl rule__DelimitedExpr__Group_3__2 ;
    public final void rule__DelimitedExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5257:1: ( rule__DelimitedExpr__Group_3__1__Impl rule__DelimitedExpr__Group_3__2 )
            // InternalFortXTrans.g:5258:2: rule__DelimitedExpr__Group_3__1__Impl rule__DelimitedExpr__Group_3__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalFortXTrans.g:5265:1: rule__DelimitedExpr__Group_3__1__Impl : ( ( rule__DelimitedExpr__CondAssignment_3_1 ) ) ;
    public final void rule__DelimitedExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5269:1: ( ( ( rule__DelimitedExpr__CondAssignment_3_1 ) ) )
            // InternalFortXTrans.g:5270:1: ( ( rule__DelimitedExpr__CondAssignment_3_1 ) )
            {
            // InternalFortXTrans.g:5270:1: ( ( rule__DelimitedExpr__CondAssignment_3_1 ) )
            // InternalFortXTrans.g:5271:2: ( rule__DelimitedExpr__CondAssignment_3_1 )
            {
             before(grammarAccess.getDelimitedExprAccess().getCondAssignment_3_1()); 
            // InternalFortXTrans.g:5272:2: ( rule__DelimitedExpr__CondAssignment_3_1 )
            // InternalFortXTrans.g:5272:3: rule__DelimitedExpr__CondAssignment_3_1
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
    // InternalFortXTrans.g:5280:1: rule__DelimitedExpr__Group_3__2 : rule__DelimitedExpr__Group_3__2__Impl rule__DelimitedExpr__Group_3__3 ;
    public final void rule__DelimitedExpr__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5284:1: ( rule__DelimitedExpr__Group_3__2__Impl rule__DelimitedExpr__Group_3__3 )
            // InternalFortXTrans.g:5285:2: rule__DelimitedExpr__Group_3__2__Impl rule__DelimitedExpr__Group_3__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalFortXTrans.g:5292:1: rule__DelimitedExpr__Group_3__2__Impl : ( 'then' ) ;
    public final void rule__DelimitedExpr__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5296:1: ( ( 'then' ) )
            // InternalFortXTrans.g:5297:1: ( 'then' )
            {
            // InternalFortXTrans.g:5297:1: ( 'then' )
            // InternalFortXTrans.g:5298:2: 'then'
            {
             before(grammarAccess.getDelimitedExprAccess().getThenKeyword_3_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalFortXTrans.g:5307:1: rule__DelimitedExpr__Group_3__3 : rule__DelimitedExpr__Group_3__3__Impl rule__DelimitedExpr__Group_3__4 ;
    public final void rule__DelimitedExpr__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5311:1: ( rule__DelimitedExpr__Group_3__3__Impl rule__DelimitedExpr__Group_3__4 )
            // InternalFortXTrans.g:5312:2: rule__DelimitedExpr__Group_3__3__Impl rule__DelimitedExpr__Group_3__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalFortXTrans.g:5319:1: rule__DelimitedExpr__Group_3__3__Impl : ( ( rule__DelimitedExpr__BlockAssignment_3_3 ) ) ;
    public final void rule__DelimitedExpr__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5323:1: ( ( ( rule__DelimitedExpr__BlockAssignment_3_3 ) ) )
            // InternalFortXTrans.g:5324:1: ( ( rule__DelimitedExpr__BlockAssignment_3_3 ) )
            {
            // InternalFortXTrans.g:5324:1: ( ( rule__DelimitedExpr__BlockAssignment_3_3 ) )
            // InternalFortXTrans.g:5325:2: ( rule__DelimitedExpr__BlockAssignment_3_3 )
            {
             before(grammarAccess.getDelimitedExprAccess().getBlockAssignment_3_3()); 
            // InternalFortXTrans.g:5326:2: ( rule__DelimitedExpr__BlockAssignment_3_3 )
            // InternalFortXTrans.g:5326:3: rule__DelimitedExpr__BlockAssignment_3_3
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
    // InternalFortXTrans.g:5334:1: rule__DelimitedExpr__Group_3__4 : rule__DelimitedExpr__Group_3__4__Impl rule__DelimitedExpr__Group_3__5 ;
    public final void rule__DelimitedExpr__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5338:1: ( rule__DelimitedExpr__Group_3__4__Impl rule__DelimitedExpr__Group_3__5 )
            // InternalFortXTrans.g:5339:2: rule__DelimitedExpr__Group_3__4__Impl rule__DelimitedExpr__Group_3__5
            {
            pushFollow(FOLLOW_39);
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
    // InternalFortXTrans.g:5346:1: rule__DelimitedExpr__Group_3__4__Impl : ( ( rule__DelimitedExpr__ElifsAssignment_3_4 )? ) ;
    public final void rule__DelimitedExpr__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5350:1: ( ( ( rule__DelimitedExpr__ElifsAssignment_3_4 )? ) )
            // InternalFortXTrans.g:5351:1: ( ( rule__DelimitedExpr__ElifsAssignment_3_4 )? )
            {
            // InternalFortXTrans.g:5351:1: ( ( rule__DelimitedExpr__ElifsAssignment_3_4 )? )
            // InternalFortXTrans.g:5352:2: ( rule__DelimitedExpr__ElifsAssignment_3_4 )?
            {
             before(grammarAccess.getDelimitedExprAccess().getElifsAssignment_3_4()); 
            // InternalFortXTrans.g:5353:2: ( rule__DelimitedExpr__ElifsAssignment_3_4 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==33) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalFortXTrans.g:5353:3: rule__DelimitedExpr__ElifsAssignment_3_4
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
    // InternalFortXTrans.g:5361:1: rule__DelimitedExpr__Group_3__5 : rule__DelimitedExpr__Group_3__5__Impl rule__DelimitedExpr__Group_3__6 ;
    public final void rule__DelimitedExpr__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5365:1: ( rule__DelimitedExpr__Group_3__5__Impl rule__DelimitedExpr__Group_3__6 )
            // InternalFortXTrans.g:5366:2: rule__DelimitedExpr__Group_3__5__Impl rule__DelimitedExpr__Group_3__6
            {
            pushFollow(FOLLOW_39);
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
    // InternalFortXTrans.g:5373:1: rule__DelimitedExpr__Group_3__5__Impl : ( ( rule__DelimitedExpr__ElsAssignment_3_5 )? ) ;
    public final void rule__DelimitedExpr__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5377:1: ( ( ( rule__DelimitedExpr__ElsAssignment_3_5 )? ) )
            // InternalFortXTrans.g:5378:1: ( ( rule__DelimitedExpr__ElsAssignment_3_5 )? )
            {
            // InternalFortXTrans.g:5378:1: ( ( rule__DelimitedExpr__ElsAssignment_3_5 )? )
            // InternalFortXTrans.g:5379:2: ( rule__DelimitedExpr__ElsAssignment_3_5 )?
            {
             before(grammarAccess.getDelimitedExprAccess().getElsAssignment_3_5()); 
            // InternalFortXTrans.g:5380:2: ( rule__DelimitedExpr__ElsAssignment_3_5 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==34) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalFortXTrans.g:5380:3: rule__DelimitedExpr__ElsAssignment_3_5
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
    // InternalFortXTrans.g:5388:1: rule__DelimitedExpr__Group_3__6 : rule__DelimitedExpr__Group_3__6__Impl ;
    public final void rule__DelimitedExpr__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5392:1: ( rule__DelimitedExpr__Group_3__6__Impl )
            // InternalFortXTrans.g:5393:2: rule__DelimitedExpr__Group_3__6__Impl
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
    // InternalFortXTrans.g:5399:1: rule__DelimitedExpr__Group_3__6__Impl : ( 'end' ) ;
    public final void rule__DelimitedExpr__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5403:1: ( ( 'end' ) )
            // InternalFortXTrans.g:5404:1: ( 'end' )
            {
            // InternalFortXTrans.g:5404:1: ( 'end' )
            // InternalFortXTrans.g:5405:2: 'end'
            {
             before(grammarAccess.getDelimitedExprAccess().getEndKeyword_3_6()); 
            match(input,22,FOLLOW_2); 
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
    // InternalFortXTrans.g:5415:1: rule__Elifs__Group__0 : rule__Elifs__Group__0__Impl rule__Elifs__Group__1 ;
    public final void rule__Elifs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5419:1: ( rule__Elifs__Group__0__Impl rule__Elifs__Group__1 )
            // InternalFortXTrans.g:5420:2: rule__Elifs__Group__0__Impl rule__Elifs__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalFortXTrans.g:5427:1: rule__Elifs__Group__0__Impl : ( ( rule__Elifs__EAssignment_0 ) ) ;
    public final void rule__Elifs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5431:1: ( ( ( rule__Elifs__EAssignment_0 ) ) )
            // InternalFortXTrans.g:5432:1: ( ( rule__Elifs__EAssignment_0 ) )
            {
            // InternalFortXTrans.g:5432:1: ( ( rule__Elifs__EAssignment_0 ) )
            // InternalFortXTrans.g:5433:2: ( rule__Elifs__EAssignment_0 )
            {
             before(grammarAccess.getElifsAccess().getEAssignment_0()); 
            // InternalFortXTrans.g:5434:2: ( rule__Elifs__EAssignment_0 )
            // InternalFortXTrans.g:5434:3: rule__Elifs__EAssignment_0
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
    // InternalFortXTrans.g:5442:1: rule__Elifs__Group__1 : rule__Elifs__Group__1__Impl ;
    public final void rule__Elifs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5446:1: ( rule__Elifs__Group__1__Impl )
            // InternalFortXTrans.g:5447:2: rule__Elifs__Group__1__Impl
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
    // InternalFortXTrans.g:5453:1: rule__Elifs__Group__1__Impl : ( ( rule__Elifs__EAssignment_1 )* ) ;
    public final void rule__Elifs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5457:1: ( ( ( rule__Elifs__EAssignment_1 )* ) )
            // InternalFortXTrans.g:5458:1: ( ( rule__Elifs__EAssignment_1 )* )
            {
            // InternalFortXTrans.g:5458:1: ( ( rule__Elifs__EAssignment_1 )* )
            // InternalFortXTrans.g:5459:2: ( rule__Elifs__EAssignment_1 )*
            {
             before(grammarAccess.getElifsAccess().getEAssignment_1()); 
            // InternalFortXTrans.g:5460:2: ( rule__Elifs__EAssignment_1 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==33) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalFortXTrans.g:5460:3: rule__Elifs__EAssignment_1
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__Elifs__EAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalFortXTrans.g:5469:1: rule__Elif__Group__0 : rule__Elif__Group__0__Impl rule__Elif__Group__1 ;
    public final void rule__Elif__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5473:1: ( rule__Elif__Group__0__Impl rule__Elif__Group__1 )
            // InternalFortXTrans.g:5474:2: rule__Elif__Group__0__Impl rule__Elif__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalFortXTrans.g:5481:1: rule__Elif__Group__0__Impl : ( 'elif' ) ;
    public final void rule__Elif__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5485:1: ( ( 'elif' ) )
            // InternalFortXTrans.g:5486:1: ( 'elif' )
            {
            // InternalFortXTrans.g:5486:1: ( 'elif' )
            // InternalFortXTrans.g:5487:2: 'elif'
            {
             before(grammarAccess.getElifAccess().getElifKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalFortXTrans.g:5496:1: rule__Elif__Group__1 : rule__Elif__Group__1__Impl rule__Elif__Group__2 ;
    public final void rule__Elif__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5500:1: ( rule__Elif__Group__1__Impl rule__Elif__Group__2 )
            // InternalFortXTrans.g:5501:2: rule__Elif__Group__1__Impl rule__Elif__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalFortXTrans.g:5508:1: rule__Elif__Group__1__Impl : ( ( rule__Elif__ExprAssignment_1 ) ) ;
    public final void rule__Elif__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5512:1: ( ( ( rule__Elif__ExprAssignment_1 ) ) )
            // InternalFortXTrans.g:5513:1: ( ( rule__Elif__ExprAssignment_1 ) )
            {
            // InternalFortXTrans.g:5513:1: ( ( rule__Elif__ExprAssignment_1 ) )
            // InternalFortXTrans.g:5514:2: ( rule__Elif__ExprAssignment_1 )
            {
             before(grammarAccess.getElifAccess().getExprAssignment_1()); 
            // InternalFortXTrans.g:5515:2: ( rule__Elif__ExprAssignment_1 )
            // InternalFortXTrans.g:5515:3: rule__Elif__ExprAssignment_1
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
    // InternalFortXTrans.g:5523:1: rule__Elif__Group__2 : rule__Elif__Group__2__Impl rule__Elif__Group__3 ;
    public final void rule__Elif__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5527:1: ( rule__Elif__Group__2__Impl rule__Elif__Group__3 )
            // InternalFortXTrans.g:5528:2: rule__Elif__Group__2__Impl rule__Elif__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalFortXTrans.g:5535:1: rule__Elif__Group__2__Impl : ( 'then' ) ;
    public final void rule__Elif__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5539:1: ( ( 'then' ) )
            // InternalFortXTrans.g:5540:1: ( 'then' )
            {
            // InternalFortXTrans.g:5540:1: ( 'then' )
            // InternalFortXTrans.g:5541:2: 'then'
            {
             before(grammarAccess.getElifAccess().getThenKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalFortXTrans.g:5550:1: rule__Elif__Group__3 : rule__Elif__Group__3__Impl ;
    public final void rule__Elif__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5554:1: ( rule__Elif__Group__3__Impl )
            // InternalFortXTrans.g:5555:2: rule__Elif__Group__3__Impl
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
    // InternalFortXTrans.g:5561:1: rule__Elif__Group__3__Impl : ( ( rule__Elif__BlockAssignment_3 ) ) ;
    public final void rule__Elif__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5565:1: ( ( ( rule__Elif__BlockAssignment_3 ) ) )
            // InternalFortXTrans.g:5566:1: ( ( rule__Elif__BlockAssignment_3 ) )
            {
            // InternalFortXTrans.g:5566:1: ( ( rule__Elif__BlockAssignment_3 ) )
            // InternalFortXTrans.g:5567:2: ( rule__Elif__BlockAssignment_3 )
            {
             before(grammarAccess.getElifAccess().getBlockAssignment_3()); 
            // InternalFortXTrans.g:5568:2: ( rule__Elif__BlockAssignment_3 )
            // InternalFortXTrans.g:5568:3: rule__Elif__BlockAssignment_3
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
    // InternalFortXTrans.g:5577:1: rule__Else__Group__0 : rule__Else__Group__0__Impl rule__Else__Group__1 ;
    public final void rule__Else__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5581:1: ( rule__Else__Group__0__Impl rule__Else__Group__1 )
            // InternalFortXTrans.g:5582:2: rule__Else__Group__0__Impl rule__Else__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalFortXTrans.g:5589:1: rule__Else__Group__0__Impl : ( 'else' ) ;
    public final void rule__Else__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5593:1: ( ( 'else' ) )
            // InternalFortXTrans.g:5594:1: ( 'else' )
            {
            // InternalFortXTrans.g:5594:1: ( 'else' )
            // InternalFortXTrans.g:5595:2: 'else'
            {
             before(grammarAccess.getElseAccess().getElseKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalFortXTrans.g:5604:1: rule__Else__Group__1 : rule__Else__Group__1__Impl ;
    public final void rule__Else__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5608:1: ( rule__Else__Group__1__Impl )
            // InternalFortXTrans.g:5609:2: rule__Else__Group__1__Impl
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
    // InternalFortXTrans.g:5615:1: rule__Else__Group__1__Impl : ( ( rule__Else__BlockAssignment_1 ) ) ;
    public final void rule__Else__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5619:1: ( ( ( rule__Else__BlockAssignment_1 ) ) )
            // InternalFortXTrans.g:5620:1: ( ( rule__Else__BlockAssignment_1 ) )
            {
            // InternalFortXTrans.g:5620:1: ( ( rule__Else__BlockAssignment_1 ) )
            // InternalFortXTrans.g:5621:2: ( rule__Else__BlockAssignment_1 )
            {
             before(grammarAccess.getElseAccess().getBlockAssignment_1()); 
            // InternalFortXTrans.g:5622:2: ( rule__Else__BlockAssignment_1 )
            // InternalFortXTrans.g:5622:3: rule__Else__BlockAssignment_1
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
    // InternalFortXTrans.g:5631:1: rule__Generators__Group__0 : rule__Generators__Group__0__Impl rule__Generators__Group__1 ;
    public final void rule__Generators__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5635:1: ( rule__Generators__Group__0__Impl rule__Generators__Group__1 )
            // InternalFortXTrans.g:5636:2: rule__Generators__Group__0__Impl rule__Generators__Group__1
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
    // InternalFortXTrans.g:5643:1: rule__Generators__Group__0__Impl : ( ( rule__Generators__BindingAssignment_0 ) ) ;
    public final void rule__Generators__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5647:1: ( ( ( rule__Generators__BindingAssignment_0 ) ) )
            // InternalFortXTrans.g:5648:1: ( ( rule__Generators__BindingAssignment_0 ) )
            {
            // InternalFortXTrans.g:5648:1: ( ( rule__Generators__BindingAssignment_0 ) )
            // InternalFortXTrans.g:5649:2: ( rule__Generators__BindingAssignment_0 )
            {
             before(grammarAccess.getGeneratorsAccess().getBindingAssignment_0()); 
            // InternalFortXTrans.g:5650:2: ( rule__Generators__BindingAssignment_0 )
            // InternalFortXTrans.g:5650:3: rule__Generators__BindingAssignment_0
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
    // InternalFortXTrans.g:5658:1: rule__Generators__Group__1 : rule__Generators__Group__1__Impl ;
    public final void rule__Generators__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5662:1: ( rule__Generators__Group__1__Impl )
            // InternalFortXTrans.g:5663:2: rule__Generators__Group__1__Impl
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
    // InternalFortXTrans.g:5669:1: rule__Generators__Group__1__Impl : ( ( rule__Generators__Group_1__0 )* ) ;
    public final void rule__Generators__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5673:1: ( ( ( rule__Generators__Group_1__0 )* ) )
            // InternalFortXTrans.g:5674:1: ( ( rule__Generators__Group_1__0 )* )
            {
            // InternalFortXTrans.g:5674:1: ( ( rule__Generators__Group_1__0 )* )
            // InternalFortXTrans.g:5675:2: ( rule__Generators__Group_1__0 )*
            {
             before(grammarAccess.getGeneratorsAccess().getGroup_1()); 
            // InternalFortXTrans.g:5676:2: ( rule__Generators__Group_1__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==25) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalFortXTrans.g:5676:3: rule__Generators__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Generators__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalFortXTrans.g:5685:1: rule__Generators__Group_1__0 : rule__Generators__Group_1__0__Impl rule__Generators__Group_1__1 ;
    public final void rule__Generators__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5689:1: ( rule__Generators__Group_1__0__Impl rule__Generators__Group_1__1 )
            // InternalFortXTrans.g:5690:2: rule__Generators__Group_1__0__Impl rule__Generators__Group_1__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalFortXTrans.g:5697:1: rule__Generators__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Generators__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5701:1: ( ( ',' ) )
            // InternalFortXTrans.g:5702:1: ( ',' )
            {
            // InternalFortXTrans.g:5702:1: ( ',' )
            // InternalFortXTrans.g:5703:2: ','
            {
             before(grammarAccess.getGeneratorsAccess().getCommaKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalFortXTrans.g:5712:1: rule__Generators__Group_1__1 : rule__Generators__Group_1__1__Impl ;
    public final void rule__Generators__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5716:1: ( rule__Generators__Group_1__1__Impl )
            // InternalFortXTrans.g:5717:2: rule__Generators__Group_1__1__Impl
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
    // InternalFortXTrans.g:5723:1: rule__Generators__Group_1__1__Impl : ( ( rule__Generators__ClauseAssignment_1_1 ) ) ;
    public final void rule__Generators__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5727:1: ( ( ( rule__Generators__ClauseAssignment_1_1 ) ) )
            // InternalFortXTrans.g:5728:1: ( ( rule__Generators__ClauseAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:5728:1: ( ( rule__Generators__ClauseAssignment_1_1 ) )
            // InternalFortXTrans.g:5729:2: ( rule__Generators__ClauseAssignment_1_1 )
            {
             before(grammarAccess.getGeneratorsAccess().getClauseAssignment_1_1()); 
            // InternalFortXTrans.g:5730:2: ( rule__Generators__ClauseAssignment_1_1 )
            // InternalFortXTrans.g:5730:3: rule__Generators__ClauseAssignment_1_1
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
    // InternalFortXTrans.g:5739:1: rule__Binding__Group_0__0 : rule__Binding__Group_0__0__Impl rule__Binding__Group_0__1 ;
    public final void rule__Binding__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5743:1: ( rule__Binding__Group_0__0__Impl rule__Binding__Group_0__1 )
            // InternalFortXTrans.g:5744:2: rule__Binding__Group_0__0__Impl rule__Binding__Group_0__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalFortXTrans.g:5751:1: rule__Binding__Group_0__0__Impl : ( ( rule__Binding__IdtupAssignment_0_0 ) ) ;
    public final void rule__Binding__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5755:1: ( ( ( rule__Binding__IdtupAssignment_0_0 ) ) )
            // InternalFortXTrans.g:5756:1: ( ( rule__Binding__IdtupAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:5756:1: ( ( rule__Binding__IdtupAssignment_0_0 ) )
            // InternalFortXTrans.g:5757:2: ( rule__Binding__IdtupAssignment_0_0 )
            {
             before(grammarAccess.getBindingAccess().getIdtupAssignment_0_0()); 
            // InternalFortXTrans.g:5758:2: ( rule__Binding__IdtupAssignment_0_0 )
            // InternalFortXTrans.g:5758:3: rule__Binding__IdtupAssignment_0_0
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
    // InternalFortXTrans.g:5766:1: rule__Binding__Group_0__1 : rule__Binding__Group_0__1__Impl rule__Binding__Group_0__2 ;
    public final void rule__Binding__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5770:1: ( rule__Binding__Group_0__1__Impl rule__Binding__Group_0__2 )
            // InternalFortXTrans.g:5771:2: rule__Binding__Group_0__1__Impl rule__Binding__Group_0__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalFortXTrans.g:5778:1: rule__Binding__Group_0__1__Impl : ( '<-' ) ;
    public final void rule__Binding__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5782:1: ( ( '<-' ) )
            // InternalFortXTrans.g:5783:1: ( '<-' )
            {
            // InternalFortXTrans.g:5783:1: ( '<-' )
            // InternalFortXTrans.g:5784:2: '<-'
            {
             before(grammarAccess.getBindingAccess().getLessThanSignHyphenMinusKeyword_0_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalFortXTrans.g:5793:1: rule__Binding__Group_0__2 : rule__Binding__Group_0__2__Impl ;
    public final void rule__Binding__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5797:1: ( rule__Binding__Group_0__2__Impl )
            // InternalFortXTrans.g:5798:2: rule__Binding__Group_0__2__Impl
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
    // InternalFortXTrans.g:5804:1: rule__Binding__Group_0__2__Impl : ( ( rule__Binding__ExprAssignment_0_2 ) ) ;
    public final void rule__Binding__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5808:1: ( ( ( rule__Binding__ExprAssignment_0_2 ) ) )
            // InternalFortXTrans.g:5809:1: ( ( rule__Binding__ExprAssignment_0_2 ) )
            {
            // InternalFortXTrans.g:5809:1: ( ( rule__Binding__ExprAssignment_0_2 ) )
            // InternalFortXTrans.g:5810:2: ( rule__Binding__ExprAssignment_0_2 )
            {
             before(grammarAccess.getBindingAccess().getExprAssignment_0_2()); 
            // InternalFortXTrans.g:5811:2: ( rule__Binding__ExprAssignment_0_2 )
            // InternalFortXTrans.g:5811:3: rule__Binding__ExprAssignment_0_2
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
    // InternalFortXTrans.g:5820:1: rule__Binding__Group_1__0 : rule__Binding__Group_1__0__Impl rule__Binding__Group_1__1 ;
    public final void rule__Binding__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5824:1: ( rule__Binding__Group_1__0__Impl rule__Binding__Group_1__1 )
            // InternalFortXTrans.g:5825:2: rule__Binding__Group_1__0__Impl rule__Binding__Group_1__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalFortXTrans.g:5832:1: rule__Binding__Group_1__0__Impl : ( ( rule__Binding__IdtupAssignment_1_0 ) ) ;
    public final void rule__Binding__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5836:1: ( ( ( rule__Binding__IdtupAssignment_1_0 ) ) )
            // InternalFortXTrans.g:5837:1: ( ( rule__Binding__IdtupAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:5837:1: ( ( rule__Binding__IdtupAssignment_1_0 ) )
            // InternalFortXTrans.g:5838:2: ( rule__Binding__IdtupAssignment_1_0 )
            {
             before(grammarAccess.getBindingAccess().getIdtupAssignment_1_0()); 
            // InternalFortXTrans.g:5839:2: ( rule__Binding__IdtupAssignment_1_0 )
            // InternalFortXTrans.g:5839:3: rule__Binding__IdtupAssignment_1_0
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
    // InternalFortXTrans.g:5847:1: rule__Binding__Group_1__1 : rule__Binding__Group_1__1__Impl rule__Binding__Group_1__2 ;
    public final void rule__Binding__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5851:1: ( rule__Binding__Group_1__1__Impl rule__Binding__Group_1__2 )
            // InternalFortXTrans.g:5852:2: rule__Binding__Group_1__1__Impl rule__Binding__Group_1__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalFortXTrans.g:5859:1: rule__Binding__Group_1__1__Impl : ( '<-' ) ;
    public final void rule__Binding__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5863:1: ( ( '<-' ) )
            // InternalFortXTrans.g:5864:1: ( '<-' )
            {
            // InternalFortXTrans.g:5864:1: ( '<-' )
            // InternalFortXTrans.g:5865:2: '<-'
            {
             before(grammarAccess.getBindingAccess().getLessThanSignHyphenMinusKeyword_1_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalFortXTrans.g:5874:1: rule__Binding__Group_1__2 : rule__Binding__Group_1__2__Impl rule__Binding__Group_1__3 ;
    public final void rule__Binding__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5878:1: ( rule__Binding__Group_1__2__Impl rule__Binding__Group_1__3 )
            // InternalFortXTrans.g:5879:2: rule__Binding__Group_1__2__Impl rule__Binding__Group_1__3
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
    // InternalFortXTrans.g:5886:1: rule__Binding__Group_1__2__Impl : ( ( rule__Binding__SeqAssignment_1_2 ) ) ;
    public final void rule__Binding__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5890:1: ( ( ( rule__Binding__SeqAssignment_1_2 ) ) )
            // InternalFortXTrans.g:5891:1: ( ( rule__Binding__SeqAssignment_1_2 ) )
            {
            // InternalFortXTrans.g:5891:1: ( ( rule__Binding__SeqAssignment_1_2 ) )
            // InternalFortXTrans.g:5892:2: ( rule__Binding__SeqAssignment_1_2 )
            {
             before(grammarAccess.getBindingAccess().getSeqAssignment_1_2()); 
            // InternalFortXTrans.g:5893:2: ( rule__Binding__SeqAssignment_1_2 )
            // InternalFortXTrans.g:5893:3: rule__Binding__SeqAssignment_1_2
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
    // InternalFortXTrans.g:5901:1: rule__Binding__Group_1__3 : rule__Binding__Group_1__3__Impl rule__Binding__Group_1__4 ;
    public final void rule__Binding__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5905:1: ( rule__Binding__Group_1__3__Impl rule__Binding__Group_1__4 )
            // InternalFortXTrans.g:5906:2: rule__Binding__Group_1__3__Impl rule__Binding__Group_1__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalFortXTrans.g:5913:1: rule__Binding__Group_1__3__Impl : ( '(' ) ;
    public final void rule__Binding__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5917:1: ( ( '(' ) )
            // InternalFortXTrans.g:5918:1: ( '(' )
            {
            // InternalFortXTrans.g:5918:1: ( '(' )
            // InternalFortXTrans.g:5919:2: '('
            {
             before(grammarAccess.getBindingAccess().getLeftParenthesisKeyword_1_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalFortXTrans.g:5928:1: rule__Binding__Group_1__4 : rule__Binding__Group_1__4__Impl rule__Binding__Group_1__5 ;
    public final void rule__Binding__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5932:1: ( rule__Binding__Group_1__4__Impl rule__Binding__Group_1__5 )
            // InternalFortXTrans.g:5933:2: rule__Binding__Group_1__4__Impl rule__Binding__Group_1__5
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
    // InternalFortXTrans.g:5940:1: rule__Binding__Group_1__4__Impl : ( ( rule__Binding__ExprAssignment_1_4 ) ) ;
    public final void rule__Binding__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5944:1: ( ( ( rule__Binding__ExprAssignment_1_4 ) ) )
            // InternalFortXTrans.g:5945:1: ( ( rule__Binding__ExprAssignment_1_4 ) )
            {
            // InternalFortXTrans.g:5945:1: ( ( rule__Binding__ExprAssignment_1_4 ) )
            // InternalFortXTrans.g:5946:2: ( rule__Binding__ExprAssignment_1_4 )
            {
             before(grammarAccess.getBindingAccess().getExprAssignment_1_4()); 
            // InternalFortXTrans.g:5947:2: ( rule__Binding__ExprAssignment_1_4 )
            // InternalFortXTrans.g:5947:3: rule__Binding__ExprAssignment_1_4
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
    // InternalFortXTrans.g:5955:1: rule__Binding__Group_1__5 : rule__Binding__Group_1__5__Impl ;
    public final void rule__Binding__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5959:1: ( rule__Binding__Group_1__5__Impl )
            // InternalFortXTrans.g:5960:2: rule__Binding__Group_1__5__Impl
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
    // InternalFortXTrans.g:5966:1: rule__Binding__Group_1__5__Impl : ( ')' ) ;
    public final void rule__Binding__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5970:1: ( ( ')' ) )
            // InternalFortXTrans.g:5971:1: ( ')' )
            {
            // InternalFortXTrans.g:5971:1: ( ')' )
            // InternalFortXTrans.g:5972:2: ')'
            {
             before(grammarAccess.getBindingAccess().getRightParenthesisKeyword_1_5()); 
            match(input,29,FOLLOW_2); 
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
    // InternalFortXTrans.g:5982:1: rule__BlockElems__Group__0 : rule__BlockElems__Group__0__Impl rule__BlockElems__Group__1 ;
    public final void rule__BlockElems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5986:1: ( rule__BlockElems__Group__0__Impl rule__BlockElems__Group__1 )
            // InternalFortXTrans.g:5987:2: rule__BlockElems__Group__0__Impl rule__BlockElems__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalFortXTrans.g:5994:1: rule__BlockElems__Group__0__Impl : ( ( rule__BlockElems__BlockAssignment_0 ) ) ;
    public final void rule__BlockElems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5998:1: ( ( ( rule__BlockElems__BlockAssignment_0 ) ) )
            // InternalFortXTrans.g:5999:1: ( ( rule__BlockElems__BlockAssignment_0 ) )
            {
            // InternalFortXTrans.g:5999:1: ( ( rule__BlockElems__BlockAssignment_0 ) )
            // InternalFortXTrans.g:6000:2: ( rule__BlockElems__BlockAssignment_0 )
            {
             before(grammarAccess.getBlockElemsAccess().getBlockAssignment_0()); 
            // InternalFortXTrans.g:6001:2: ( rule__BlockElems__BlockAssignment_0 )
            // InternalFortXTrans.g:6001:3: rule__BlockElems__BlockAssignment_0
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
    // InternalFortXTrans.g:6009:1: rule__BlockElems__Group__1 : rule__BlockElems__Group__1__Impl ;
    public final void rule__BlockElems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6013:1: ( rule__BlockElems__Group__1__Impl )
            // InternalFortXTrans.g:6014:2: rule__BlockElems__Group__1__Impl
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
    // InternalFortXTrans.g:6020:1: rule__BlockElems__Group__1__Impl : ( ( rule__BlockElems__BlockAssignment_1 )* ) ;
    public final void rule__BlockElems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6024:1: ( ( ( rule__BlockElems__BlockAssignment_1 )* ) )
            // InternalFortXTrans.g:6025:1: ( ( rule__BlockElems__BlockAssignment_1 )* )
            {
            // InternalFortXTrans.g:6025:1: ( ( rule__BlockElems__BlockAssignment_1 )* )
            // InternalFortXTrans.g:6026:2: ( rule__BlockElems__BlockAssignment_1 )*
            {
             before(grammarAccess.getBlockElemsAccess().getBlockAssignment_1()); 
            // InternalFortXTrans.g:6027:2: ( rule__BlockElems__BlockAssignment_1 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_ID||LA54_0==31||LA54_0==37||LA54_0==44||(LA54_0>=46 && LA54_0<=48)||LA54_0==50) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalFortXTrans.g:6027:3: rule__BlockElems__BlockAssignment_1
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__BlockElems__BlockAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalFortXTrans.g:6036:1: rule__Paranthesized__Group__0 : rule__Paranthesized__Group__0__Impl rule__Paranthesized__Group__1 ;
    public final void rule__Paranthesized__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6040:1: ( rule__Paranthesized__Group__0__Impl rule__Paranthesized__Group__1 )
            // InternalFortXTrans.g:6041:2: rule__Paranthesized__Group__0__Impl rule__Paranthesized__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalFortXTrans.g:6048:1: rule__Paranthesized__Group__0__Impl : ( '(' ) ;
    public final void rule__Paranthesized__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6052:1: ( ( '(' ) )
            // InternalFortXTrans.g:6053:1: ( '(' )
            {
            // InternalFortXTrans.g:6053:1: ( '(' )
            // InternalFortXTrans.g:6054:2: '('
            {
             before(grammarAccess.getParanthesizedAccess().getLeftParenthesisKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalFortXTrans.g:6063:1: rule__Paranthesized__Group__1 : rule__Paranthesized__Group__1__Impl rule__Paranthesized__Group__2 ;
    public final void rule__Paranthesized__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6067:1: ( rule__Paranthesized__Group__1__Impl rule__Paranthesized__Group__2 )
            // InternalFortXTrans.g:6068:2: rule__Paranthesized__Group__1__Impl rule__Paranthesized__Group__2
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
    // InternalFortXTrans.g:6075:1: rule__Paranthesized__Group__1__Impl : ( ( rule__Paranthesized__ExprAssignment_1 ) ) ;
    public final void rule__Paranthesized__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6079:1: ( ( ( rule__Paranthesized__ExprAssignment_1 ) ) )
            // InternalFortXTrans.g:6080:1: ( ( rule__Paranthesized__ExprAssignment_1 ) )
            {
            // InternalFortXTrans.g:6080:1: ( ( rule__Paranthesized__ExprAssignment_1 ) )
            // InternalFortXTrans.g:6081:2: ( rule__Paranthesized__ExprAssignment_1 )
            {
             before(grammarAccess.getParanthesizedAccess().getExprAssignment_1()); 
            // InternalFortXTrans.g:6082:2: ( rule__Paranthesized__ExprAssignment_1 )
            // InternalFortXTrans.g:6082:3: rule__Paranthesized__ExprAssignment_1
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
    // InternalFortXTrans.g:6090:1: rule__Paranthesized__Group__2 : rule__Paranthesized__Group__2__Impl ;
    public final void rule__Paranthesized__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6094:1: ( rule__Paranthesized__Group__2__Impl )
            // InternalFortXTrans.g:6095:2: rule__Paranthesized__Group__2__Impl
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
    // InternalFortXTrans.g:6101:1: rule__Paranthesized__Group__2__Impl : ( ')' ) ;
    public final void rule__Paranthesized__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6105:1: ( ( ')' ) )
            // InternalFortXTrans.g:6106:1: ( ')' )
            {
            // InternalFortXTrans.g:6106:1: ( ')' )
            // InternalFortXTrans.g:6107:2: ')'
            {
             before(grammarAccess.getParanthesizedAccess().getRightParenthesisKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalFortXTrans.g:6117:1: rule__Do__Group__0 : rule__Do__Group__0__Impl rule__Do__Group__1 ;
    public final void rule__Do__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6121:1: ( rule__Do__Group__0__Impl rule__Do__Group__1 )
            // InternalFortXTrans.g:6122:2: rule__Do__Group__0__Impl rule__Do__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalFortXTrans.g:6129:1: rule__Do__Group__0__Impl : ( ( rule__Do__DofsAssignment_0 ) ) ;
    public final void rule__Do__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6133:1: ( ( ( rule__Do__DofsAssignment_0 ) ) )
            // InternalFortXTrans.g:6134:1: ( ( rule__Do__DofsAssignment_0 ) )
            {
            // InternalFortXTrans.g:6134:1: ( ( rule__Do__DofsAssignment_0 ) )
            // InternalFortXTrans.g:6135:2: ( rule__Do__DofsAssignment_0 )
            {
             before(grammarAccess.getDoAccess().getDofsAssignment_0()); 
            // InternalFortXTrans.g:6136:2: ( rule__Do__DofsAssignment_0 )
            // InternalFortXTrans.g:6136:3: rule__Do__DofsAssignment_0
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
    // InternalFortXTrans.g:6144:1: rule__Do__Group__1 : rule__Do__Group__1__Impl rule__Do__Group__2 ;
    public final void rule__Do__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6148:1: ( rule__Do__Group__1__Impl rule__Do__Group__2 )
            // InternalFortXTrans.g:6149:2: rule__Do__Group__1__Impl rule__Do__Group__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalFortXTrans.g:6156:1: rule__Do__Group__1__Impl : ( ( rule__Do__Group_1__0 )* ) ;
    public final void rule__Do__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6160:1: ( ( ( rule__Do__Group_1__0 )* ) )
            // InternalFortXTrans.g:6161:1: ( ( rule__Do__Group_1__0 )* )
            {
            // InternalFortXTrans.g:6161:1: ( ( rule__Do__Group_1__0 )* )
            // InternalFortXTrans.g:6162:2: ( rule__Do__Group_1__0 )*
            {
             before(grammarAccess.getDoAccess().getGroup_1()); 
            // InternalFortXTrans.g:6163:2: ( rule__Do__Group_1__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==36) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalFortXTrans.g:6163:3: rule__Do__Group_1__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__Do__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalFortXTrans.g:6171:1: rule__Do__Group__2 : rule__Do__Group__2__Impl ;
    public final void rule__Do__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6175:1: ( rule__Do__Group__2__Impl )
            // InternalFortXTrans.g:6176:2: rule__Do__Group__2__Impl
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
    // InternalFortXTrans.g:6182:1: rule__Do__Group__2__Impl : ( 'end' ) ;
    public final void rule__Do__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6186:1: ( ( 'end' ) )
            // InternalFortXTrans.g:6187:1: ( 'end' )
            {
            // InternalFortXTrans.g:6187:1: ( 'end' )
            // InternalFortXTrans.g:6188:2: 'end'
            {
             before(grammarAccess.getDoAccess().getEndKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalFortXTrans.g:6198:1: rule__Do__Group_1__0 : rule__Do__Group_1__0__Impl rule__Do__Group_1__1 ;
    public final void rule__Do__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6202:1: ( rule__Do__Group_1__0__Impl rule__Do__Group_1__1 )
            // InternalFortXTrans.g:6203:2: rule__Do__Group_1__0__Impl rule__Do__Group_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalFortXTrans.g:6210:1: rule__Do__Group_1__0__Impl : ( 'also' ) ;
    public final void rule__Do__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6214:1: ( ( 'also' ) )
            // InternalFortXTrans.g:6215:1: ( 'also' )
            {
            // InternalFortXTrans.g:6215:1: ( 'also' )
            // InternalFortXTrans.g:6216:2: 'also'
            {
             before(grammarAccess.getDoAccess().getAlsoKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalFortXTrans.g:6225:1: rule__Do__Group_1__1 : rule__Do__Group_1__1__Impl ;
    public final void rule__Do__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6229:1: ( rule__Do__Group_1__1__Impl )
            // InternalFortXTrans.g:6230:2: rule__Do__Group_1__1__Impl
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
    // InternalFortXTrans.g:6236:1: rule__Do__Group_1__1__Impl : ( ( rule__Do__DofsAssignment_1_1 ) ) ;
    public final void rule__Do__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6240:1: ( ( ( rule__Do__DofsAssignment_1_1 ) ) )
            // InternalFortXTrans.g:6241:1: ( ( rule__Do__DofsAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:6241:1: ( ( rule__Do__DofsAssignment_1_1 ) )
            // InternalFortXTrans.g:6242:2: ( rule__Do__DofsAssignment_1_1 )
            {
             before(grammarAccess.getDoAccess().getDofsAssignment_1_1()); 
            // InternalFortXTrans.g:6243:2: ( rule__Do__DofsAssignment_1_1 )
            // InternalFortXTrans.g:6243:3: rule__Do__DofsAssignment_1_1
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
    // InternalFortXTrans.g:6252:1: rule__DoFront__Group__0 : rule__DoFront__Group__0__Impl rule__DoFront__Group__1 ;
    public final void rule__DoFront__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6256:1: ( rule__DoFront__Group__0__Impl rule__DoFront__Group__1 )
            // InternalFortXTrans.g:6257:2: rule__DoFront__Group__0__Impl rule__DoFront__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalFortXTrans.g:6264:1: rule__DoFront__Group__0__Impl : ( ( rule__DoFront__Group_0__0 )? ) ;
    public final void rule__DoFront__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6268:1: ( ( ( rule__DoFront__Group_0__0 )? ) )
            // InternalFortXTrans.g:6269:1: ( ( rule__DoFront__Group_0__0 )? )
            {
            // InternalFortXTrans.g:6269:1: ( ( rule__DoFront__Group_0__0 )? )
            // InternalFortXTrans.g:6270:2: ( rule__DoFront__Group_0__0 )?
            {
             before(grammarAccess.getDoFrontAccess().getGroup_0()); 
            // InternalFortXTrans.g:6271:2: ( rule__DoFront__Group_0__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==50) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalFortXTrans.g:6271:3: rule__DoFront__Group_0__0
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
    // InternalFortXTrans.g:6279:1: rule__DoFront__Group__1 : rule__DoFront__Group__1__Impl rule__DoFront__Group__2 ;
    public final void rule__DoFront__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6283:1: ( rule__DoFront__Group__1__Impl rule__DoFront__Group__2 )
            // InternalFortXTrans.g:6284:2: rule__DoFront__Group__1__Impl rule__DoFront__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalFortXTrans.g:6291:1: rule__DoFront__Group__1__Impl : ( ( rule__DoFront__AtomAssignment_1 )? ) ;
    public final void rule__DoFront__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6295:1: ( ( ( rule__DoFront__AtomAssignment_1 )? ) )
            // InternalFortXTrans.g:6296:1: ( ( rule__DoFront__AtomAssignment_1 )? )
            {
            // InternalFortXTrans.g:6296:1: ( ( rule__DoFront__AtomAssignment_1 )? )
            // InternalFortXTrans.g:6297:2: ( rule__DoFront__AtomAssignment_1 )?
            {
             before(grammarAccess.getDoFrontAccess().getAtomAssignment_1()); 
            // InternalFortXTrans.g:6298:2: ( rule__DoFront__AtomAssignment_1 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==44) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalFortXTrans.g:6298:3: rule__DoFront__AtomAssignment_1
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
    // InternalFortXTrans.g:6306:1: rule__DoFront__Group__2 : rule__DoFront__Group__2__Impl rule__DoFront__Group__3 ;
    public final void rule__DoFront__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6310:1: ( rule__DoFront__Group__2__Impl rule__DoFront__Group__3 )
            // InternalFortXTrans.g:6311:2: rule__DoFront__Group__2__Impl rule__DoFront__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalFortXTrans.g:6318:1: rule__DoFront__Group__2__Impl : ( 'do' ) ;
    public final void rule__DoFront__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6322:1: ( ( 'do' ) )
            // InternalFortXTrans.g:6323:1: ( 'do' )
            {
            // InternalFortXTrans.g:6323:1: ( 'do' )
            // InternalFortXTrans.g:6324:2: 'do'
            {
             before(grammarAccess.getDoFrontAccess().getDoKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalFortXTrans.g:6333:1: rule__DoFront__Group__3 : rule__DoFront__Group__3__Impl ;
    public final void rule__DoFront__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6337:1: ( rule__DoFront__Group__3__Impl )
            // InternalFortXTrans.g:6338:2: rule__DoFront__Group__3__Impl
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
    // InternalFortXTrans.g:6344:1: rule__DoFront__Group__3__Impl : ( ( rule__DoFront__BlockAssignment_3 ) ) ;
    public final void rule__DoFront__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6348:1: ( ( ( rule__DoFront__BlockAssignment_3 ) ) )
            // InternalFortXTrans.g:6349:1: ( ( rule__DoFront__BlockAssignment_3 ) )
            {
            // InternalFortXTrans.g:6349:1: ( ( rule__DoFront__BlockAssignment_3 ) )
            // InternalFortXTrans.g:6350:2: ( rule__DoFront__BlockAssignment_3 )
            {
             before(grammarAccess.getDoFrontAccess().getBlockAssignment_3()); 
            // InternalFortXTrans.g:6351:2: ( rule__DoFront__BlockAssignment_3 )
            // InternalFortXTrans.g:6351:3: rule__DoFront__BlockAssignment_3
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
    // InternalFortXTrans.g:6360:1: rule__DoFront__Group_0__0 : rule__DoFront__Group_0__0__Impl rule__DoFront__Group_0__1 ;
    public final void rule__DoFront__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6364:1: ( rule__DoFront__Group_0__0__Impl rule__DoFront__Group_0__1 )
            // InternalFortXTrans.g:6365:2: rule__DoFront__Group_0__0__Impl rule__DoFront__Group_0__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalFortXTrans.g:6372:1: rule__DoFront__Group_0__0__Impl : ( ( rule__DoFront__AtAssignment_0_0 ) ) ;
    public final void rule__DoFront__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6376:1: ( ( ( rule__DoFront__AtAssignment_0_0 ) ) )
            // InternalFortXTrans.g:6377:1: ( ( rule__DoFront__AtAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:6377:1: ( ( rule__DoFront__AtAssignment_0_0 ) )
            // InternalFortXTrans.g:6378:2: ( rule__DoFront__AtAssignment_0_0 )
            {
             before(grammarAccess.getDoFrontAccess().getAtAssignment_0_0()); 
            // InternalFortXTrans.g:6379:2: ( rule__DoFront__AtAssignment_0_0 )
            // InternalFortXTrans.g:6379:3: rule__DoFront__AtAssignment_0_0
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
    // InternalFortXTrans.g:6387:1: rule__DoFront__Group_0__1 : rule__DoFront__Group_0__1__Impl ;
    public final void rule__DoFront__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6391:1: ( rule__DoFront__Group_0__1__Impl )
            // InternalFortXTrans.g:6392:2: rule__DoFront__Group_0__1__Impl
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
    // InternalFortXTrans.g:6398:1: rule__DoFront__Group_0__1__Impl : ( ( rule__DoFront__ExpAssignment_0_1 ) ) ;
    public final void rule__DoFront__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6402:1: ( ( ( rule__DoFront__ExpAssignment_0_1 ) ) )
            // InternalFortXTrans.g:6403:1: ( ( rule__DoFront__ExpAssignment_0_1 ) )
            {
            // InternalFortXTrans.g:6403:1: ( ( rule__DoFront__ExpAssignment_0_1 ) )
            // InternalFortXTrans.g:6404:2: ( rule__DoFront__ExpAssignment_0_1 )
            {
             before(grammarAccess.getDoFrontAccess().getExpAssignment_0_1()); 
            // InternalFortXTrans.g:6405:2: ( rule__DoFront__ExpAssignment_0_1 )
            // InternalFortXTrans.g:6405:3: rule__DoFront__ExpAssignment_0_1
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
    // InternalFortXTrans.g:6414:1: rule__IdOrTuple__Group_1__0 : rule__IdOrTuple__Group_1__0__Impl rule__IdOrTuple__Group_1__1 ;
    public final void rule__IdOrTuple__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6418:1: ( rule__IdOrTuple__Group_1__0__Impl rule__IdOrTuple__Group_1__1 )
            // InternalFortXTrans.g:6419:2: rule__IdOrTuple__Group_1__0__Impl rule__IdOrTuple__Group_1__1
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
    // InternalFortXTrans.g:6426:1: rule__IdOrTuple__Group_1__0__Impl : ( '(' ) ;
    public final void rule__IdOrTuple__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6430:1: ( ( '(' ) )
            // InternalFortXTrans.g:6431:1: ( '(' )
            {
            // InternalFortXTrans.g:6431:1: ( '(' )
            // InternalFortXTrans.g:6432:2: '('
            {
             before(grammarAccess.getIdOrTupleAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalFortXTrans.g:6441:1: rule__IdOrTuple__Group_1__1 : rule__IdOrTuple__Group_1__1__Impl rule__IdOrTuple__Group_1__2 ;
    public final void rule__IdOrTuple__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6445:1: ( rule__IdOrTuple__Group_1__1__Impl rule__IdOrTuple__Group_1__2 )
            // InternalFortXTrans.g:6446:2: rule__IdOrTuple__Group_1__1__Impl rule__IdOrTuple__Group_1__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalFortXTrans.g:6453:1: rule__IdOrTuple__Group_1__1__Impl : ( ( rule__IdOrTuple__BidAssignment_1_1 ) ) ;
    public final void rule__IdOrTuple__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6457:1: ( ( ( rule__IdOrTuple__BidAssignment_1_1 ) ) )
            // InternalFortXTrans.g:6458:1: ( ( rule__IdOrTuple__BidAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:6458:1: ( ( rule__IdOrTuple__BidAssignment_1_1 ) )
            // InternalFortXTrans.g:6459:2: ( rule__IdOrTuple__BidAssignment_1_1 )
            {
             before(grammarAccess.getIdOrTupleAccess().getBidAssignment_1_1()); 
            // InternalFortXTrans.g:6460:2: ( rule__IdOrTuple__BidAssignment_1_1 )
            // InternalFortXTrans.g:6460:3: rule__IdOrTuple__BidAssignment_1_1
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
    // InternalFortXTrans.g:6468:1: rule__IdOrTuple__Group_1__2 : rule__IdOrTuple__Group_1__2__Impl rule__IdOrTuple__Group_1__3 ;
    public final void rule__IdOrTuple__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6472:1: ( rule__IdOrTuple__Group_1__2__Impl rule__IdOrTuple__Group_1__3 )
            // InternalFortXTrans.g:6473:2: rule__IdOrTuple__Group_1__2__Impl rule__IdOrTuple__Group_1__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalFortXTrans.g:6480:1: rule__IdOrTuple__Group_1__2__Impl : ( ( rule__IdOrTuple__Group_1_2__0 )* ) ;
    public final void rule__IdOrTuple__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6484:1: ( ( ( rule__IdOrTuple__Group_1_2__0 )* ) )
            // InternalFortXTrans.g:6485:1: ( ( rule__IdOrTuple__Group_1_2__0 )* )
            {
            // InternalFortXTrans.g:6485:1: ( ( rule__IdOrTuple__Group_1_2__0 )* )
            // InternalFortXTrans.g:6486:2: ( rule__IdOrTuple__Group_1_2__0 )*
            {
             before(grammarAccess.getIdOrTupleAccess().getGroup_1_2()); 
            // InternalFortXTrans.g:6487:2: ( rule__IdOrTuple__Group_1_2__0 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==25) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalFortXTrans.g:6487:3: rule__IdOrTuple__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__IdOrTuple__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // InternalFortXTrans.g:6495:1: rule__IdOrTuple__Group_1__3 : rule__IdOrTuple__Group_1__3__Impl ;
    public final void rule__IdOrTuple__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6499:1: ( rule__IdOrTuple__Group_1__3__Impl )
            // InternalFortXTrans.g:6500:2: rule__IdOrTuple__Group_1__3__Impl
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
    // InternalFortXTrans.g:6506:1: rule__IdOrTuple__Group_1__3__Impl : ( ')' ) ;
    public final void rule__IdOrTuple__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6510:1: ( ( ')' ) )
            // InternalFortXTrans.g:6511:1: ( ')' )
            {
            // InternalFortXTrans.g:6511:1: ( ')' )
            // InternalFortXTrans.g:6512:2: ')'
            {
             before(grammarAccess.getIdOrTupleAccess().getRightParenthesisKeyword_1_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalFortXTrans.g:6522:1: rule__IdOrTuple__Group_1_2__0 : rule__IdOrTuple__Group_1_2__0__Impl rule__IdOrTuple__Group_1_2__1 ;
    public final void rule__IdOrTuple__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6526:1: ( rule__IdOrTuple__Group_1_2__0__Impl rule__IdOrTuple__Group_1_2__1 )
            // InternalFortXTrans.g:6527:2: rule__IdOrTuple__Group_1_2__0__Impl rule__IdOrTuple__Group_1_2__1
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
    // InternalFortXTrans.g:6534:1: rule__IdOrTuple__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__IdOrTuple__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6538:1: ( ( ',' ) )
            // InternalFortXTrans.g:6539:1: ( ',' )
            {
            // InternalFortXTrans.g:6539:1: ( ',' )
            // InternalFortXTrans.g:6540:2: ','
            {
             before(grammarAccess.getIdOrTupleAccess().getCommaKeyword_1_2_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalFortXTrans.g:6549:1: rule__IdOrTuple__Group_1_2__1 : rule__IdOrTuple__Group_1_2__1__Impl ;
    public final void rule__IdOrTuple__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6553:1: ( rule__IdOrTuple__Group_1_2__1__Impl )
            // InternalFortXTrans.g:6554:2: rule__IdOrTuple__Group_1_2__1__Impl
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
    // InternalFortXTrans.g:6560:1: rule__IdOrTuple__Group_1_2__1__Impl : ( ( rule__IdOrTuple__BidAssignment_1_2_1 ) ) ;
    public final void rule__IdOrTuple__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6564:1: ( ( ( rule__IdOrTuple__BidAssignment_1_2_1 ) ) )
            // InternalFortXTrans.g:6565:1: ( ( rule__IdOrTuple__BidAssignment_1_2_1 ) )
            {
            // InternalFortXTrans.g:6565:1: ( ( rule__IdOrTuple__BidAssignment_1_2_1 ) )
            // InternalFortXTrans.g:6566:2: ( rule__IdOrTuple__BidAssignment_1_2_1 )
            {
             before(grammarAccess.getIdOrTupleAccess().getBidAssignment_1_2_1()); 
            // InternalFortXTrans.g:6567:2: ( rule__IdOrTuple__BidAssignment_1_2_1 )
            // InternalFortXTrans.g:6567:3: rule__IdOrTuple__BidAssignment_1_2_1
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
    // InternalFortXTrans.g:6576:1: rule__IsType__Group__0 : rule__IsType__Group__0__Impl rule__IsType__Group__1 ;
    public final void rule__IsType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6580:1: ( rule__IsType__Group__0__Impl rule__IsType__Group__1 )
            // InternalFortXTrans.g:6581:2: rule__IsType__Group__0__Impl rule__IsType__Group__1
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
    // InternalFortXTrans.g:6588:1: rule__IsType__Group__0__Impl : ( ':' ) ;
    public final void rule__IsType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6592:1: ( ( ':' ) )
            // InternalFortXTrans.g:6593:1: ( ':' )
            {
            // InternalFortXTrans.g:6593:1: ( ':' )
            // InternalFortXTrans.g:6594:2: ':'
            {
             before(grammarAccess.getIsTypeAccess().getColonKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalFortXTrans.g:6603:1: rule__IsType__Group__1 : rule__IsType__Group__1__Impl ;
    public final void rule__IsType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6607:1: ( rule__IsType__Group__1__Impl )
            // InternalFortXTrans.g:6608:2: rule__IsType__Group__1__Impl
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
    // InternalFortXTrans.g:6614:1: rule__IsType__Group__1__Impl : ( ( rule__IsType__TypeAssignment_1 ) ) ;
    public final void rule__IsType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6618:1: ( ( ( rule__IsType__TypeAssignment_1 ) ) )
            // InternalFortXTrans.g:6619:1: ( ( rule__IsType__TypeAssignment_1 ) )
            {
            // InternalFortXTrans.g:6619:1: ( ( rule__IsType__TypeAssignment_1 ) )
            // InternalFortXTrans.g:6620:2: ( rule__IsType__TypeAssignment_1 )
            {
             before(grammarAccess.getIsTypeAccess().getTypeAssignment_1()); 
            // InternalFortXTrans.g:6621:2: ( rule__IsType__TypeAssignment_1 )
            // InternalFortXTrans.g:6621:3: rule__IsType__TypeAssignment_1
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


    // $ANTLR start "rule__FieldDecl__Group_0__0"
    // InternalFortXTrans.g:6630:1: rule__FieldDecl__Group_0__0 : rule__FieldDecl__Group_0__0__Impl rule__FieldDecl__Group_0__1 ;
    public final void rule__FieldDecl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6634:1: ( rule__FieldDecl__Group_0__0__Impl rule__FieldDecl__Group_0__1 )
            // InternalFortXTrans.g:6635:2: rule__FieldDecl__Group_0__0__Impl rule__FieldDecl__Group_0__1
            {
            pushFollow(FOLLOW_48);
            rule__FieldDecl__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_0__0"


    // $ANTLR start "rule__FieldDecl__Group_0__0__Impl"
    // InternalFortXTrans.g:6642:1: rule__FieldDecl__Group_0__0__Impl : ( ( rule__FieldDecl__PriAssignment_0_0 )? ) ;
    public final void rule__FieldDecl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6646:1: ( ( ( rule__FieldDecl__PriAssignment_0_0 )? ) )
            // InternalFortXTrans.g:6647:1: ( ( rule__FieldDecl__PriAssignment_0_0 )? )
            {
            // InternalFortXTrans.g:6647:1: ( ( rule__FieldDecl__PriAssignment_0_0 )? )
            // InternalFortXTrans.g:6648:2: ( rule__FieldDecl__PriAssignment_0_0 )?
            {
             before(grammarAccess.getFieldDeclAccess().getPriAssignment_0_0()); 
            // InternalFortXTrans.g:6649:2: ( rule__FieldDecl__PriAssignment_0_0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==42) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalFortXTrans.g:6649:3: rule__FieldDecl__PriAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDecl__PriAssignment_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldDeclAccess().getPriAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_0__0__Impl"


    // $ANTLR start "rule__FieldDecl__Group_0__1"
    // InternalFortXTrans.g:6657:1: rule__FieldDecl__Group_0__1 : rule__FieldDecl__Group_0__1__Impl rule__FieldDecl__Group_0__2 ;
    public final void rule__FieldDecl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6661:1: ( rule__FieldDecl__Group_0__1__Impl rule__FieldDecl__Group_0__2 )
            // InternalFortXTrans.g:6662:2: rule__FieldDecl__Group_0__1__Impl rule__FieldDecl__Group_0__2
            {
            pushFollow(FOLLOW_48);
            rule__FieldDecl__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_0__1"


    // $ANTLR start "rule__FieldDecl__Group_0__1__Impl"
    // InternalFortXTrans.g:6669:1: rule__FieldDecl__Group_0__1__Impl : ( ( rule__FieldDecl__MutAssignment_0_1 )? ) ;
    public final void rule__FieldDecl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6673:1: ( ( ( rule__FieldDecl__MutAssignment_0_1 )? ) )
            // InternalFortXTrans.g:6674:1: ( ( rule__FieldDecl__MutAssignment_0_1 )? )
            {
            // InternalFortXTrans.g:6674:1: ( ( rule__FieldDecl__MutAssignment_0_1 )? )
            // InternalFortXTrans.g:6675:2: ( rule__FieldDecl__MutAssignment_0_1 )?
            {
             before(grammarAccess.getFieldDeclAccess().getMutAssignment_0_1()); 
            // InternalFortXTrans.g:6676:2: ( rule__FieldDecl__MutAssignment_0_1 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==51) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalFortXTrans.g:6676:3: rule__FieldDecl__MutAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDecl__MutAssignment_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldDeclAccess().getMutAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_0__1__Impl"


    // $ANTLR start "rule__FieldDecl__Group_0__2"
    // InternalFortXTrans.g:6684:1: rule__FieldDecl__Group_0__2 : rule__FieldDecl__Group_0__2__Impl rule__FieldDecl__Group_0__3 ;
    public final void rule__FieldDecl__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6688:1: ( rule__FieldDecl__Group_0__2__Impl rule__FieldDecl__Group_0__3 )
            // InternalFortXTrans.g:6689:2: rule__FieldDecl__Group_0__2__Impl rule__FieldDecl__Group_0__3
            {
            pushFollow(FOLLOW_49);
            rule__FieldDecl__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_0__2"


    // $ANTLR start "rule__FieldDecl__Group_0__2__Impl"
    // InternalFortXTrans.g:6696:1: rule__FieldDecl__Group_0__2__Impl : ( ( rule__FieldDecl__VarsAssignment_0_2 ) ) ;
    public final void rule__FieldDecl__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6700:1: ( ( ( rule__FieldDecl__VarsAssignment_0_2 ) ) )
            // InternalFortXTrans.g:6701:1: ( ( rule__FieldDecl__VarsAssignment_0_2 ) )
            {
            // InternalFortXTrans.g:6701:1: ( ( rule__FieldDecl__VarsAssignment_0_2 ) )
            // InternalFortXTrans.g:6702:2: ( rule__FieldDecl__VarsAssignment_0_2 )
            {
             before(grammarAccess.getFieldDeclAccess().getVarsAssignment_0_2()); 
            // InternalFortXTrans.g:6703:2: ( rule__FieldDecl__VarsAssignment_0_2 )
            // InternalFortXTrans.g:6703:3: rule__FieldDecl__VarsAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__FieldDecl__VarsAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldDeclAccess().getVarsAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_0__2__Impl"


    // $ANTLR start "rule__FieldDecl__Group_0__3"
    // InternalFortXTrans.g:6711:1: rule__FieldDecl__Group_0__3 : rule__FieldDecl__Group_0__3__Impl ;
    public final void rule__FieldDecl__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6715:1: ( rule__FieldDecl__Group_0__3__Impl )
            // InternalFortXTrans.g:6716:2: rule__FieldDecl__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_0__3"


    // $ANTLR start "rule__FieldDecl__Group_0__3__Impl"
    // InternalFortXTrans.g:6722:1: rule__FieldDecl__Group_0__3__Impl : ( ( rule__FieldDecl__InitAssignment_0_3 ) ) ;
    public final void rule__FieldDecl__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6726:1: ( ( ( rule__FieldDecl__InitAssignment_0_3 ) ) )
            // InternalFortXTrans.g:6727:1: ( ( rule__FieldDecl__InitAssignment_0_3 ) )
            {
            // InternalFortXTrans.g:6727:1: ( ( rule__FieldDecl__InitAssignment_0_3 ) )
            // InternalFortXTrans.g:6728:2: ( rule__FieldDecl__InitAssignment_0_3 )
            {
             before(grammarAccess.getFieldDeclAccess().getInitAssignment_0_3()); 
            // InternalFortXTrans.g:6729:2: ( rule__FieldDecl__InitAssignment_0_3 )
            // InternalFortXTrans.g:6729:3: rule__FieldDecl__InitAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__FieldDecl__InitAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldDeclAccess().getInitAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_0__3__Impl"


    // $ANTLR start "rule__FieldDecl__Group_1__0"
    // InternalFortXTrans.g:6738:1: rule__FieldDecl__Group_1__0 : rule__FieldDecl__Group_1__0__Impl rule__FieldDecl__Group_1__1 ;
    public final void rule__FieldDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6742:1: ( rule__FieldDecl__Group_1__0__Impl rule__FieldDecl__Group_1__1 )
            // InternalFortXTrans.g:6743:2: rule__FieldDecl__Group_1__0__Impl rule__FieldDecl__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__FieldDecl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_1__0"


    // $ANTLR start "rule__FieldDecl__Group_1__0__Impl"
    // InternalFortXTrans.g:6750:1: rule__FieldDecl__Group_1__0__Impl : ( ( rule__FieldDecl__PriAssignment_1_0 )? ) ;
    public final void rule__FieldDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6754:1: ( ( ( rule__FieldDecl__PriAssignment_1_0 )? ) )
            // InternalFortXTrans.g:6755:1: ( ( rule__FieldDecl__PriAssignment_1_0 )? )
            {
            // InternalFortXTrans.g:6755:1: ( ( rule__FieldDecl__PriAssignment_1_0 )? )
            // InternalFortXTrans.g:6756:2: ( rule__FieldDecl__PriAssignment_1_0 )?
            {
             before(grammarAccess.getFieldDeclAccess().getPriAssignment_1_0()); 
            // InternalFortXTrans.g:6757:2: ( rule__FieldDecl__PriAssignment_1_0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==42) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalFortXTrans.g:6757:3: rule__FieldDecl__PriAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDecl__PriAssignment_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldDeclAccess().getPriAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_1__0__Impl"


    // $ANTLR start "rule__FieldDecl__Group_1__1"
    // InternalFortXTrans.g:6765:1: rule__FieldDecl__Group_1__1 : rule__FieldDecl__Group_1__1__Impl rule__FieldDecl__Group_1__2 ;
    public final void rule__FieldDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6769:1: ( rule__FieldDecl__Group_1__1__Impl rule__FieldDecl__Group_1__2 )
            // InternalFortXTrans.g:6770:2: rule__FieldDecl__Group_1__1__Impl rule__FieldDecl__Group_1__2
            {
            pushFollow(FOLLOW_50);
            rule__FieldDecl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_1__1"


    // $ANTLR start "rule__FieldDecl__Group_1__1__Impl"
    // InternalFortXTrans.g:6777:1: rule__FieldDecl__Group_1__1__Impl : ( ( rule__FieldDecl__IdtupAssignment_1_1 ) ) ;
    public final void rule__FieldDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6781:1: ( ( ( rule__FieldDecl__IdtupAssignment_1_1 ) ) )
            // InternalFortXTrans.g:6782:1: ( ( rule__FieldDecl__IdtupAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:6782:1: ( ( rule__FieldDecl__IdtupAssignment_1_1 ) )
            // InternalFortXTrans.g:6783:2: ( rule__FieldDecl__IdtupAssignment_1_1 )
            {
             before(grammarAccess.getFieldDeclAccess().getIdtupAssignment_1_1()); 
            // InternalFortXTrans.g:6784:2: ( rule__FieldDecl__IdtupAssignment_1_1 )
            // InternalFortXTrans.g:6784:3: rule__FieldDecl__IdtupAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldDecl__IdtupAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldDeclAccess().getIdtupAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_1__1__Impl"


    // $ANTLR start "rule__FieldDecl__Group_1__2"
    // InternalFortXTrans.g:6792:1: rule__FieldDecl__Group_1__2 : rule__FieldDecl__Group_1__2__Impl rule__FieldDecl__Group_1__3 ;
    public final void rule__FieldDecl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6796:1: ( rule__FieldDecl__Group_1__2__Impl rule__FieldDecl__Group_1__3 )
            // InternalFortXTrans.g:6797:2: rule__FieldDecl__Group_1__2__Impl rule__FieldDecl__Group_1__3
            {
            pushFollow(FOLLOW_51);
            rule__FieldDecl__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_1__2"


    // $ANTLR start "rule__FieldDecl__Group_1__2__Impl"
    // InternalFortXTrans.g:6804:1: rule__FieldDecl__Group_1__2__Impl : ( '=' ) ;
    public final void rule__FieldDecl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6808:1: ( ( '=' ) )
            // InternalFortXTrans.g:6809:1: ( '=' )
            {
            // InternalFortXTrans.g:6809:1: ( '=' )
            // InternalFortXTrans.g:6810:2: '='
            {
             before(grammarAccess.getFieldDeclAccess().getEqualsSignKeyword_1_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFieldDeclAccess().getEqualsSignKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_1__2__Impl"


    // $ANTLR start "rule__FieldDecl__Group_1__3"
    // InternalFortXTrans.g:6819:1: rule__FieldDecl__Group_1__3 : rule__FieldDecl__Group_1__3__Impl ;
    public final void rule__FieldDecl__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6823:1: ( rule__FieldDecl__Group_1__3__Impl )
            // InternalFortXTrans.g:6824:2: rule__FieldDecl__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_1__3"


    // $ANTLR start "rule__FieldDecl__Group_1__3__Impl"
    // InternalFortXTrans.g:6830:1: rule__FieldDecl__Group_1__3__Impl : ( ( rule__FieldDecl__LitTupAssignment_1_3 ) ) ;
    public final void rule__FieldDecl__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6834:1: ( ( ( rule__FieldDecl__LitTupAssignment_1_3 ) ) )
            // InternalFortXTrans.g:6835:1: ( ( rule__FieldDecl__LitTupAssignment_1_3 ) )
            {
            // InternalFortXTrans.g:6835:1: ( ( rule__FieldDecl__LitTupAssignment_1_3 ) )
            // InternalFortXTrans.g:6836:2: ( rule__FieldDecl__LitTupAssignment_1_3 )
            {
             before(grammarAccess.getFieldDeclAccess().getLitTupAssignment_1_3()); 
            // InternalFortXTrans.g:6837:2: ( rule__FieldDecl__LitTupAssignment_1_3 )
            // InternalFortXTrans.g:6837:3: rule__FieldDecl__LitTupAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__FieldDecl__LitTupAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldDeclAccess().getLitTupAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_1__3__Impl"


    // $ANTLR start "rule__FieldDecl__Group_2__0"
    // InternalFortXTrans.g:6846:1: rule__FieldDecl__Group_2__0 : rule__FieldDecl__Group_2__0__Impl rule__FieldDecl__Group_2__1 ;
    public final void rule__FieldDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6850:1: ( rule__FieldDecl__Group_2__0__Impl rule__FieldDecl__Group_2__1 )
            // InternalFortXTrans.g:6851:2: rule__FieldDecl__Group_2__0__Impl rule__FieldDecl__Group_2__1
            {
            pushFollow(FOLLOW_48);
            rule__FieldDecl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_2__0"


    // $ANTLR start "rule__FieldDecl__Group_2__0__Impl"
    // InternalFortXTrans.g:6858:1: rule__FieldDecl__Group_2__0__Impl : ( ( rule__FieldDecl__PriAssignment_2_0 )? ) ;
    public final void rule__FieldDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6862:1: ( ( ( rule__FieldDecl__PriAssignment_2_0 )? ) )
            // InternalFortXTrans.g:6863:1: ( ( rule__FieldDecl__PriAssignment_2_0 )? )
            {
            // InternalFortXTrans.g:6863:1: ( ( rule__FieldDecl__PriAssignment_2_0 )? )
            // InternalFortXTrans.g:6864:2: ( rule__FieldDecl__PriAssignment_2_0 )?
            {
             before(grammarAccess.getFieldDeclAccess().getPriAssignment_2_0()); 
            // InternalFortXTrans.g:6865:2: ( rule__FieldDecl__PriAssignment_2_0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==42) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalFortXTrans.g:6865:3: rule__FieldDecl__PriAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDecl__PriAssignment_2_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldDeclAccess().getPriAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_2__0__Impl"


    // $ANTLR start "rule__FieldDecl__Group_2__1"
    // InternalFortXTrans.g:6873:1: rule__FieldDecl__Group_2__1 : rule__FieldDecl__Group_2__1__Impl rule__FieldDecl__Group_2__2 ;
    public final void rule__FieldDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6877:1: ( rule__FieldDecl__Group_2__1__Impl rule__FieldDecl__Group_2__2 )
            // InternalFortXTrans.g:6878:2: rule__FieldDecl__Group_2__1__Impl rule__FieldDecl__Group_2__2
            {
            pushFollow(FOLLOW_48);
            rule__FieldDecl__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_2__1"


    // $ANTLR start "rule__FieldDecl__Group_2__1__Impl"
    // InternalFortXTrans.g:6885:1: rule__FieldDecl__Group_2__1__Impl : ( ( rule__FieldDecl__MutAssignment_2_1 )? ) ;
    public final void rule__FieldDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6889:1: ( ( ( rule__FieldDecl__MutAssignment_2_1 )? ) )
            // InternalFortXTrans.g:6890:1: ( ( rule__FieldDecl__MutAssignment_2_1 )? )
            {
            // InternalFortXTrans.g:6890:1: ( ( rule__FieldDecl__MutAssignment_2_1 )? )
            // InternalFortXTrans.g:6891:2: ( rule__FieldDecl__MutAssignment_2_1 )?
            {
             before(grammarAccess.getFieldDeclAccess().getMutAssignment_2_1()); 
            // InternalFortXTrans.g:6892:2: ( rule__FieldDecl__MutAssignment_2_1 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==51) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalFortXTrans.g:6892:3: rule__FieldDecl__MutAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDecl__MutAssignment_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldDeclAccess().getMutAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_2__1__Impl"


    // $ANTLR start "rule__FieldDecl__Group_2__2"
    // InternalFortXTrans.g:6900:1: rule__FieldDecl__Group_2__2 : rule__FieldDecl__Group_2__2__Impl rule__FieldDecl__Group_2__3 ;
    public final void rule__FieldDecl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6904:1: ( rule__FieldDecl__Group_2__2__Impl rule__FieldDecl__Group_2__3 )
            // InternalFortXTrans.g:6905:2: rule__FieldDecl__Group_2__2__Impl rule__FieldDecl__Group_2__3
            {
            pushFollow(FOLLOW_26);
            rule__FieldDecl__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_2__2"


    // $ANTLR start "rule__FieldDecl__Group_2__2__Impl"
    // InternalFortXTrans.g:6912:1: rule__FieldDecl__Group_2__2__Impl : ( ( rule__FieldDecl__IdtupAssignment_2_2 ) ) ;
    public final void rule__FieldDecl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6916:1: ( ( ( rule__FieldDecl__IdtupAssignment_2_2 ) ) )
            // InternalFortXTrans.g:6917:1: ( ( rule__FieldDecl__IdtupAssignment_2_2 ) )
            {
            // InternalFortXTrans.g:6917:1: ( ( rule__FieldDecl__IdtupAssignment_2_2 ) )
            // InternalFortXTrans.g:6918:2: ( rule__FieldDecl__IdtupAssignment_2_2 )
            {
             before(grammarAccess.getFieldDeclAccess().getIdtupAssignment_2_2()); 
            // InternalFortXTrans.g:6919:2: ( rule__FieldDecl__IdtupAssignment_2_2 )
            // InternalFortXTrans.g:6919:3: rule__FieldDecl__IdtupAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__FieldDecl__IdtupAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldDeclAccess().getIdtupAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_2__2__Impl"


    // $ANTLR start "rule__FieldDecl__Group_2__3"
    // InternalFortXTrans.g:6927:1: rule__FieldDecl__Group_2__3 : rule__FieldDecl__Group_2__3__Impl rule__FieldDecl__Group_2__4 ;
    public final void rule__FieldDecl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6931:1: ( rule__FieldDecl__Group_2__3__Impl rule__FieldDecl__Group_2__4 )
            // InternalFortXTrans.g:6932:2: rule__FieldDecl__Group_2__3__Impl rule__FieldDecl__Group_2__4
            {
            pushFollow(FOLLOW_5);
            rule__FieldDecl__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_2__3"


    // $ANTLR start "rule__FieldDecl__Group_2__3__Impl"
    // InternalFortXTrans.g:6939:1: rule__FieldDecl__Group_2__3__Impl : ( ':' ) ;
    public final void rule__FieldDecl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6943:1: ( ( ':' ) )
            // InternalFortXTrans.g:6944:1: ( ':' )
            {
            // InternalFortXTrans.g:6944:1: ( ':' )
            // InternalFortXTrans.g:6945:2: ':'
            {
             before(grammarAccess.getFieldDeclAccess().getColonKeyword_2_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFieldDeclAccess().getColonKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_2__3__Impl"


    // $ANTLR start "rule__FieldDecl__Group_2__4"
    // InternalFortXTrans.g:6954:1: rule__FieldDecl__Group_2__4 : rule__FieldDecl__Group_2__4__Impl rule__FieldDecl__Group_2__5 ;
    public final void rule__FieldDecl__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6958:1: ( rule__FieldDecl__Group_2__4__Impl rule__FieldDecl__Group_2__5 )
            // InternalFortXTrans.g:6959:2: rule__FieldDecl__Group_2__4__Impl rule__FieldDecl__Group_2__5
            {
            pushFollow(FOLLOW_17);
            rule__FieldDecl__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_2__4"


    // $ANTLR start "rule__FieldDecl__Group_2__4__Impl"
    // InternalFortXTrans.g:6966:1: rule__FieldDecl__Group_2__4__Impl : ( ( rule__FieldDecl__TypeAssignment_2_4 ) ) ;
    public final void rule__FieldDecl__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6970:1: ( ( ( rule__FieldDecl__TypeAssignment_2_4 ) ) )
            // InternalFortXTrans.g:6971:1: ( ( rule__FieldDecl__TypeAssignment_2_4 ) )
            {
            // InternalFortXTrans.g:6971:1: ( ( rule__FieldDecl__TypeAssignment_2_4 ) )
            // InternalFortXTrans.g:6972:2: ( rule__FieldDecl__TypeAssignment_2_4 )
            {
             before(grammarAccess.getFieldDeclAccess().getTypeAssignment_2_4()); 
            // InternalFortXTrans.g:6973:2: ( rule__FieldDecl__TypeAssignment_2_4 )
            // InternalFortXTrans.g:6973:3: rule__FieldDecl__TypeAssignment_2_4
            {
            pushFollow(FOLLOW_2);
            rule__FieldDecl__TypeAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getFieldDeclAccess().getTypeAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_2__4__Impl"


    // $ANTLR start "rule__FieldDecl__Group_2__5"
    // InternalFortXTrans.g:6981:1: rule__FieldDecl__Group_2__5 : rule__FieldDecl__Group_2__5__Impl rule__FieldDecl__Group_2__6 ;
    public final void rule__FieldDecl__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6985:1: ( rule__FieldDecl__Group_2__5__Impl rule__FieldDecl__Group_2__6 )
            // InternalFortXTrans.g:6986:2: rule__FieldDecl__Group_2__5__Impl rule__FieldDecl__Group_2__6
            {
            pushFollow(FOLLOW_49);
            rule__FieldDecl__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_2__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_2__5"


    // $ANTLR start "rule__FieldDecl__Group_2__5__Impl"
    // InternalFortXTrans.g:6993:1: rule__FieldDecl__Group_2__5__Impl : ( RULE_DOTS ) ;
    public final void rule__FieldDecl__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6997:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:6998:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:6998:1: ( RULE_DOTS )
            // InternalFortXTrans.g:6999:2: RULE_DOTS
            {
             before(grammarAccess.getFieldDeclAccess().getDOTSTerminalRuleCall_2_5()); 
            match(input,RULE_DOTS,FOLLOW_2); 
             after(grammarAccess.getFieldDeclAccess().getDOTSTerminalRuleCall_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_2__5__Impl"


    // $ANTLR start "rule__FieldDecl__Group_2__6"
    // InternalFortXTrans.g:7008:1: rule__FieldDecl__Group_2__6 : rule__FieldDecl__Group_2__6__Impl ;
    public final void rule__FieldDecl__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7012:1: ( rule__FieldDecl__Group_2__6__Impl )
            // InternalFortXTrans.g:7013:2: rule__FieldDecl__Group_2__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_2__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_2__6"


    // $ANTLR start "rule__FieldDecl__Group_2__6__Impl"
    // InternalFortXTrans.g:7019:1: rule__FieldDecl__Group_2__6__Impl : ( ( rule__FieldDecl__InitAssignment_2_6 ) ) ;
    public final void rule__FieldDecl__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7023:1: ( ( ( rule__FieldDecl__InitAssignment_2_6 ) ) )
            // InternalFortXTrans.g:7024:1: ( ( rule__FieldDecl__InitAssignment_2_6 ) )
            {
            // InternalFortXTrans.g:7024:1: ( ( rule__FieldDecl__InitAssignment_2_6 ) )
            // InternalFortXTrans.g:7025:2: ( rule__FieldDecl__InitAssignment_2_6 )
            {
             before(grammarAccess.getFieldDeclAccess().getInitAssignment_2_6()); 
            // InternalFortXTrans.g:7026:2: ( rule__FieldDecl__InitAssignment_2_6 )
            // InternalFortXTrans.g:7026:3: rule__FieldDecl__InitAssignment_2_6
            {
            pushFollow(FOLLOW_2);
            rule__FieldDecl__InitAssignment_2_6();

            state._fsp--;


            }

             after(grammarAccess.getFieldDeclAccess().getInitAssignment_2_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_2__6__Impl"


    // $ANTLR start "rule__FieldDecl__Group_3__0"
    // InternalFortXTrans.g:7035:1: rule__FieldDecl__Group_3__0 : rule__FieldDecl__Group_3__0__Impl rule__FieldDecl__Group_3__1 ;
    public final void rule__FieldDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7039:1: ( rule__FieldDecl__Group_3__0__Impl rule__FieldDecl__Group_3__1 )
            // InternalFortXTrans.g:7040:2: rule__FieldDecl__Group_3__0__Impl rule__FieldDecl__Group_3__1
            {
            pushFollow(FOLLOW_52);
            rule__FieldDecl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_3__0"


    // $ANTLR start "rule__FieldDecl__Group_3__0__Impl"
    // InternalFortXTrans.g:7047:1: rule__FieldDecl__Group_3__0__Impl : ( ( rule__FieldDecl__PriAssignment_3_0 )? ) ;
    public final void rule__FieldDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7051:1: ( ( ( rule__FieldDecl__PriAssignment_3_0 )? ) )
            // InternalFortXTrans.g:7052:1: ( ( rule__FieldDecl__PriAssignment_3_0 )? )
            {
            // InternalFortXTrans.g:7052:1: ( ( rule__FieldDecl__PriAssignment_3_0 )? )
            // InternalFortXTrans.g:7053:2: ( rule__FieldDecl__PriAssignment_3_0 )?
            {
             before(grammarAccess.getFieldDeclAccess().getPriAssignment_3_0()); 
            // InternalFortXTrans.g:7054:2: ( rule__FieldDecl__PriAssignment_3_0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==42) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalFortXTrans.g:7054:3: rule__FieldDecl__PriAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDecl__PriAssignment_3_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldDeclAccess().getPriAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_3__0__Impl"


    // $ANTLR start "rule__FieldDecl__Group_3__1"
    // InternalFortXTrans.g:7062:1: rule__FieldDecl__Group_3__1 : rule__FieldDecl__Group_3__1__Impl rule__FieldDecl__Group_3__2 ;
    public final void rule__FieldDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7066:1: ( rule__FieldDecl__Group_3__1__Impl rule__FieldDecl__Group_3__2 )
            // InternalFortXTrans.g:7067:2: rule__FieldDecl__Group_3__1__Impl rule__FieldDecl__Group_3__2
            {
            pushFollow(FOLLOW_52);
            rule__FieldDecl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_3__1"


    // $ANTLR start "rule__FieldDecl__Group_3__1__Impl"
    // InternalFortXTrans.g:7074:1: rule__FieldDecl__Group_3__1__Impl : ( ( rule__FieldDecl__MutAssignment_3_1 )? ) ;
    public final void rule__FieldDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7078:1: ( ( ( rule__FieldDecl__MutAssignment_3_1 )? ) )
            // InternalFortXTrans.g:7079:1: ( ( rule__FieldDecl__MutAssignment_3_1 )? )
            {
            // InternalFortXTrans.g:7079:1: ( ( rule__FieldDecl__MutAssignment_3_1 )? )
            // InternalFortXTrans.g:7080:2: ( rule__FieldDecl__MutAssignment_3_1 )?
            {
             before(grammarAccess.getFieldDeclAccess().getMutAssignment_3_1()); 
            // InternalFortXTrans.g:7081:2: ( rule__FieldDecl__MutAssignment_3_1 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==51) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalFortXTrans.g:7081:3: rule__FieldDecl__MutAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDecl__MutAssignment_3_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldDeclAccess().getMutAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_3__1__Impl"


    // $ANTLR start "rule__FieldDecl__Group_3__2"
    // InternalFortXTrans.g:7089:1: rule__FieldDecl__Group_3__2 : rule__FieldDecl__Group_3__2__Impl rule__FieldDecl__Group_3__3 ;
    public final void rule__FieldDecl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7093:1: ( rule__FieldDecl__Group_3__2__Impl rule__FieldDecl__Group_3__3 )
            // InternalFortXTrans.g:7094:2: rule__FieldDecl__Group_3__2__Impl rule__FieldDecl__Group_3__3
            {
            pushFollow(FOLLOW_26);
            rule__FieldDecl__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_3__2"


    // $ANTLR start "rule__FieldDecl__Group_3__2__Impl"
    // InternalFortXTrans.g:7101:1: rule__FieldDecl__Group_3__2__Impl : ( ( rule__FieldDecl__IdtupAssignment_3_2 ) ) ;
    public final void rule__FieldDecl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7105:1: ( ( ( rule__FieldDecl__IdtupAssignment_3_2 ) ) )
            // InternalFortXTrans.g:7106:1: ( ( rule__FieldDecl__IdtupAssignment_3_2 ) )
            {
            // InternalFortXTrans.g:7106:1: ( ( rule__FieldDecl__IdtupAssignment_3_2 ) )
            // InternalFortXTrans.g:7107:2: ( rule__FieldDecl__IdtupAssignment_3_2 )
            {
             before(grammarAccess.getFieldDeclAccess().getIdtupAssignment_3_2()); 
            // InternalFortXTrans.g:7108:2: ( rule__FieldDecl__IdtupAssignment_3_2 )
            // InternalFortXTrans.g:7108:3: rule__FieldDecl__IdtupAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__FieldDecl__IdtupAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldDeclAccess().getIdtupAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_3__2__Impl"


    // $ANTLR start "rule__FieldDecl__Group_3__3"
    // InternalFortXTrans.g:7116:1: rule__FieldDecl__Group_3__3 : rule__FieldDecl__Group_3__3__Impl rule__FieldDecl__Group_3__4 ;
    public final void rule__FieldDecl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7120:1: ( rule__FieldDecl__Group_3__3__Impl rule__FieldDecl__Group_3__4 )
            // InternalFortXTrans.g:7121:2: rule__FieldDecl__Group_3__3__Impl rule__FieldDecl__Group_3__4
            {
            pushFollow(FOLLOW_27);
            rule__FieldDecl__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_3__3"


    // $ANTLR start "rule__FieldDecl__Group_3__3__Impl"
    // InternalFortXTrans.g:7128:1: rule__FieldDecl__Group_3__3__Impl : ( ':' ) ;
    public final void rule__FieldDecl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7132:1: ( ( ':' ) )
            // InternalFortXTrans.g:7133:1: ( ':' )
            {
            // InternalFortXTrans.g:7133:1: ( ':' )
            // InternalFortXTrans.g:7134:2: ':'
            {
             before(grammarAccess.getFieldDeclAccess().getColonKeyword_3_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFieldDeclAccess().getColonKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_3__3__Impl"


    // $ANTLR start "rule__FieldDecl__Group_3__4"
    // InternalFortXTrans.g:7143:1: rule__FieldDecl__Group_3__4 : rule__FieldDecl__Group_3__4__Impl rule__FieldDecl__Group_3__5 ;
    public final void rule__FieldDecl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7147:1: ( rule__FieldDecl__Group_3__4__Impl rule__FieldDecl__Group_3__5 )
            // InternalFortXTrans.g:7148:2: rule__FieldDecl__Group_3__4__Impl rule__FieldDecl__Group_3__5
            {
            pushFollow(FOLLOW_49);
            rule__FieldDecl__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_3__4"


    // $ANTLR start "rule__FieldDecl__Group_3__4__Impl"
    // InternalFortXTrans.g:7155:1: rule__FieldDecl__Group_3__4__Impl : ( ( rule__FieldDecl__TuptypeAssignment_3_4 ) ) ;
    public final void rule__FieldDecl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7159:1: ( ( ( rule__FieldDecl__TuptypeAssignment_3_4 ) ) )
            // InternalFortXTrans.g:7160:1: ( ( rule__FieldDecl__TuptypeAssignment_3_4 ) )
            {
            // InternalFortXTrans.g:7160:1: ( ( rule__FieldDecl__TuptypeAssignment_3_4 ) )
            // InternalFortXTrans.g:7161:2: ( rule__FieldDecl__TuptypeAssignment_3_4 )
            {
             before(grammarAccess.getFieldDeclAccess().getTuptypeAssignment_3_4()); 
            // InternalFortXTrans.g:7162:2: ( rule__FieldDecl__TuptypeAssignment_3_4 )
            // InternalFortXTrans.g:7162:3: rule__FieldDecl__TuptypeAssignment_3_4
            {
            pushFollow(FOLLOW_2);
            rule__FieldDecl__TuptypeAssignment_3_4();

            state._fsp--;


            }

             after(grammarAccess.getFieldDeclAccess().getTuptypeAssignment_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_3__4__Impl"


    // $ANTLR start "rule__FieldDecl__Group_3__5"
    // InternalFortXTrans.g:7170:1: rule__FieldDecl__Group_3__5 : rule__FieldDecl__Group_3__5__Impl ;
    public final void rule__FieldDecl__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7174:1: ( rule__FieldDecl__Group_3__5__Impl )
            // InternalFortXTrans.g:7175:2: rule__FieldDecl__Group_3__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_3__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_3__5"


    // $ANTLR start "rule__FieldDecl__Group_3__5__Impl"
    // InternalFortXTrans.g:7181:1: rule__FieldDecl__Group_3__5__Impl : ( ( rule__FieldDecl__InitAssignment_3_5 ) ) ;
    public final void rule__FieldDecl__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7185:1: ( ( ( rule__FieldDecl__InitAssignment_3_5 ) ) )
            // InternalFortXTrans.g:7186:1: ( ( rule__FieldDecl__InitAssignment_3_5 ) )
            {
            // InternalFortXTrans.g:7186:1: ( ( rule__FieldDecl__InitAssignment_3_5 ) )
            // InternalFortXTrans.g:7187:2: ( rule__FieldDecl__InitAssignment_3_5 )
            {
             before(grammarAccess.getFieldDeclAccess().getInitAssignment_3_5()); 
            // InternalFortXTrans.g:7188:2: ( rule__FieldDecl__InitAssignment_3_5 )
            // InternalFortXTrans.g:7188:3: rule__FieldDecl__InitAssignment_3_5
            {
            pushFollow(FOLLOW_2);
            rule__FieldDecl__InitAssignment_3_5();

            state._fsp--;


            }

             after(grammarAccess.getFieldDeclAccess().getInitAssignment_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_3__5__Impl"


    // $ANTLR start "rule__NoNewlineVarWTypes__Group_1__0"
    // InternalFortXTrans.g:7197:1: rule__NoNewlineVarWTypes__Group_1__0 : rule__NoNewlineVarWTypes__Group_1__0__Impl rule__NoNewlineVarWTypes__Group_1__1 ;
    public final void rule__NoNewlineVarWTypes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7201:1: ( rule__NoNewlineVarWTypes__Group_1__0__Impl rule__NoNewlineVarWTypes__Group_1__1 )
            // InternalFortXTrans.g:7202:2: rule__NoNewlineVarWTypes__Group_1__0__Impl rule__NoNewlineVarWTypes__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__NoNewlineVarWTypes__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NoNewlineVarWTypes__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoNewlineVarWTypes__Group_1__0"


    // $ANTLR start "rule__NoNewlineVarWTypes__Group_1__0__Impl"
    // InternalFortXTrans.g:7209:1: rule__NoNewlineVarWTypes__Group_1__0__Impl : ( '(' ) ;
    public final void rule__NoNewlineVarWTypes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7213:1: ( ( '(' ) )
            // InternalFortXTrans.g:7214:1: ( '(' )
            {
            // InternalFortXTrans.g:7214:1: ( '(' )
            // InternalFortXTrans.g:7215:2: '('
            {
             before(grammarAccess.getNoNewlineVarWTypesAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getNoNewlineVarWTypesAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoNewlineVarWTypes__Group_1__0__Impl"


    // $ANTLR start "rule__NoNewlineVarWTypes__Group_1__1"
    // InternalFortXTrans.g:7224:1: rule__NoNewlineVarWTypes__Group_1__1 : rule__NoNewlineVarWTypes__Group_1__1__Impl rule__NoNewlineVarWTypes__Group_1__2 ;
    public final void rule__NoNewlineVarWTypes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7228:1: ( rule__NoNewlineVarWTypes__Group_1__1__Impl rule__NoNewlineVarWTypes__Group_1__2 )
            // InternalFortXTrans.g:7229:2: rule__NoNewlineVarWTypes__Group_1__1__Impl rule__NoNewlineVarWTypes__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__NoNewlineVarWTypes__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NoNewlineVarWTypes__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoNewlineVarWTypes__Group_1__1"


    // $ANTLR start "rule__NoNewlineVarWTypes__Group_1__1__Impl"
    // InternalFortXTrans.g:7236:1: rule__NoNewlineVarWTypes__Group_1__1__Impl : ( ( rule__NoNewlineVarWTypes__MultipleAssignment_1_1 ) ) ;
    public final void rule__NoNewlineVarWTypes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7240:1: ( ( ( rule__NoNewlineVarWTypes__MultipleAssignment_1_1 ) ) )
            // InternalFortXTrans.g:7241:1: ( ( rule__NoNewlineVarWTypes__MultipleAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:7241:1: ( ( rule__NoNewlineVarWTypes__MultipleAssignment_1_1 ) )
            // InternalFortXTrans.g:7242:2: ( rule__NoNewlineVarWTypes__MultipleAssignment_1_1 )
            {
             before(grammarAccess.getNoNewlineVarWTypesAccess().getMultipleAssignment_1_1()); 
            // InternalFortXTrans.g:7243:2: ( rule__NoNewlineVarWTypes__MultipleAssignment_1_1 )
            // InternalFortXTrans.g:7243:3: rule__NoNewlineVarWTypes__MultipleAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NoNewlineVarWTypes__MultipleAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNoNewlineVarWTypesAccess().getMultipleAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoNewlineVarWTypes__Group_1__1__Impl"


    // $ANTLR start "rule__NoNewlineVarWTypes__Group_1__2"
    // InternalFortXTrans.g:7251:1: rule__NoNewlineVarWTypes__Group_1__2 : rule__NoNewlineVarWTypes__Group_1__2__Impl rule__NoNewlineVarWTypes__Group_1__3 ;
    public final void rule__NoNewlineVarWTypes__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7255:1: ( rule__NoNewlineVarWTypes__Group_1__2__Impl rule__NoNewlineVarWTypes__Group_1__3 )
            // InternalFortXTrans.g:7256:2: rule__NoNewlineVarWTypes__Group_1__2__Impl rule__NoNewlineVarWTypes__Group_1__3
            {
            pushFollow(FOLLOW_28);
            rule__NoNewlineVarWTypes__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NoNewlineVarWTypes__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoNewlineVarWTypes__Group_1__2"


    // $ANTLR start "rule__NoNewlineVarWTypes__Group_1__2__Impl"
    // InternalFortXTrans.g:7263:1: rule__NoNewlineVarWTypes__Group_1__2__Impl : ( ( ( rule__NoNewlineVarWTypes__Group_1_2__0 ) ) ( ( rule__NoNewlineVarWTypes__Group_1_2__0 )* ) ) ;
    public final void rule__NoNewlineVarWTypes__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7267:1: ( ( ( ( rule__NoNewlineVarWTypes__Group_1_2__0 ) ) ( ( rule__NoNewlineVarWTypes__Group_1_2__0 )* ) ) )
            // InternalFortXTrans.g:7268:1: ( ( ( rule__NoNewlineVarWTypes__Group_1_2__0 ) ) ( ( rule__NoNewlineVarWTypes__Group_1_2__0 )* ) )
            {
            // InternalFortXTrans.g:7268:1: ( ( ( rule__NoNewlineVarWTypes__Group_1_2__0 ) ) ( ( rule__NoNewlineVarWTypes__Group_1_2__0 )* ) )
            // InternalFortXTrans.g:7269:2: ( ( rule__NoNewlineVarWTypes__Group_1_2__0 ) ) ( ( rule__NoNewlineVarWTypes__Group_1_2__0 )* )
            {
            // InternalFortXTrans.g:7269:2: ( ( rule__NoNewlineVarWTypes__Group_1_2__0 ) )
            // InternalFortXTrans.g:7270:3: ( rule__NoNewlineVarWTypes__Group_1_2__0 )
            {
             before(grammarAccess.getNoNewlineVarWTypesAccess().getGroup_1_2()); 
            // InternalFortXTrans.g:7271:3: ( rule__NoNewlineVarWTypes__Group_1_2__0 )
            // InternalFortXTrans.g:7271:4: rule__NoNewlineVarWTypes__Group_1_2__0
            {
            pushFollow(FOLLOW_15);
            rule__NoNewlineVarWTypes__Group_1_2__0();

            state._fsp--;


            }

             after(grammarAccess.getNoNewlineVarWTypesAccess().getGroup_1_2()); 

            }

            // InternalFortXTrans.g:7274:2: ( ( rule__NoNewlineVarWTypes__Group_1_2__0 )* )
            // InternalFortXTrans.g:7275:3: ( rule__NoNewlineVarWTypes__Group_1_2__0 )*
            {
             before(grammarAccess.getNoNewlineVarWTypesAccess().getGroup_1_2()); 
            // InternalFortXTrans.g:7276:3: ( rule__NoNewlineVarWTypes__Group_1_2__0 )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==25) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalFortXTrans.g:7276:4: rule__NoNewlineVarWTypes__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__NoNewlineVarWTypes__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

             after(grammarAccess.getNoNewlineVarWTypesAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__NoNewlineVarWTypes__Group_1__2__Impl"


    // $ANTLR start "rule__NoNewlineVarWTypes__Group_1__3"
    // InternalFortXTrans.g:7285:1: rule__NoNewlineVarWTypes__Group_1__3 : rule__NoNewlineVarWTypes__Group_1__3__Impl ;
    public final void rule__NoNewlineVarWTypes__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7289:1: ( rule__NoNewlineVarWTypes__Group_1__3__Impl )
            // InternalFortXTrans.g:7290:2: rule__NoNewlineVarWTypes__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NoNewlineVarWTypes__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoNewlineVarWTypes__Group_1__3"


    // $ANTLR start "rule__NoNewlineVarWTypes__Group_1__3__Impl"
    // InternalFortXTrans.g:7296:1: rule__NoNewlineVarWTypes__Group_1__3__Impl : ( ')' ) ;
    public final void rule__NoNewlineVarWTypes__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7300:1: ( ( ')' ) )
            // InternalFortXTrans.g:7301:1: ( ')' )
            {
            // InternalFortXTrans.g:7301:1: ( ')' )
            // InternalFortXTrans.g:7302:2: ')'
            {
             before(grammarAccess.getNoNewlineVarWTypesAccess().getRightParenthesisKeyword_1_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNoNewlineVarWTypesAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoNewlineVarWTypes__Group_1__3__Impl"


    // $ANTLR start "rule__NoNewlineVarWTypes__Group_1_2__0"
    // InternalFortXTrans.g:7312:1: rule__NoNewlineVarWTypes__Group_1_2__0 : rule__NoNewlineVarWTypes__Group_1_2__0__Impl rule__NoNewlineVarWTypes__Group_1_2__1 ;
    public final void rule__NoNewlineVarWTypes__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7316:1: ( rule__NoNewlineVarWTypes__Group_1_2__0__Impl rule__NoNewlineVarWTypes__Group_1_2__1 )
            // InternalFortXTrans.g:7317:2: rule__NoNewlineVarWTypes__Group_1_2__0__Impl rule__NoNewlineVarWTypes__Group_1_2__1
            {
            pushFollow(FOLLOW_25);
            rule__NoNewlineVarWTypes__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NoNewlineVarWTypes__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoNewlineVarWTypes__Group_1_2__0"


    // $ANTLR start "rule__NoNewlineVarWTypes__Group_1_2__0__Impl"
    // InternalFortXTrans.g:7324:1: rule__NoNewlineVarWTypes__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__NoNewlineVarWTypes__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7328:1: ( ( ',' ) )
            // InternalFortXTrans.g:7329:1: ( ',' )
            {
            // InternalFortXTrans.g:7329:1: ( ',' )
            // InternalFortXTrans.g:7330:2: ','
            {
             before(grammarAccess.getNoNewlineVarWTypesAccess().getCommaKeyword_1_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNoNewlineVarWTypesAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoNewlineVarWTypes__Group_1_2__0__Impl"


    // $ANTLR start "rule__NoNewlineVarWTypes__Group_1_2__1"
    // InternalFortXTrans.g:7339:1: rule__NoNewlineVarWTypes__Group_1_2__1 : rule__NoNewlineVarWTypes__Group_1_2__1__Impl ;
    public final void rule__NoNewlineVarWTypes__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7343:1: ( rule__NoNewlineVarWTypes__Group_1_2__1__Impl )
            // InternalFortXTrans.g:7344:2: rule__NoNewlineVarWTypes__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NoNewlineVarWTypes__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoNewlineVarWTypes__Group_1_2__1"


    // $ANTLR start "rule__NoNewlineVarWTypes__Group_1_2__1__Impl"
    // InternalFortXTrans.g:7350:1: rule__NoNewlineVarWTypes__Group_1_2__1__Impl : ( ( rule__NoNewlineVarWTypes__MultipleAssignment_1_2_1 ) ) ;
    public final void rule__NoNewlineVarWTypes__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7354:1: ( ( ( rule__NoNewlineVarWTypes__MultipleAssignment_1_2_1 ) ) )
            // InternalFortXTrans.g:7355:1: ( ( rule__NoNewlineVarWTypes__MultipleAssignment_1_2_1 ) )
            {
            // InternalFortXTrans.g:7355:1: ( ( rule__NoNewlineVarWTypes__MultipleAssignment_1_2_1 ) )
            // InternalFortXTrans.g:7356:2: ( rule__NoNewlineVarWTypes__MultipleAssignment_1_2_1 )
            {
             before(grammarAccess.getNoNewlineVarWTypesAccess().getMultipleAssignment_1_2_1()); 
            // InternalFortXTrans.g:7357:2: ( rule__NoNewlineVarWTypes__MultipleAssignment_1_2_1 )
            // InternalFortXTrans.g:7357:3: rule__NoNewlineVarWTypes__MultipleAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__NoNewlineVarWTypes__MultipleAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNoNewlineVarWTypesAccess().getMultipleAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoNewlineVarWTypes__Group_1_2__1__Impl"


    // $ANTLR start "rule__NoNewlineVarWType__Group__0"
    // InternalFortXTrans.g:7366:1: rule__NoNewlineVarWType__Group__0 : rule__NoNewlineVarWType__Group__0__Impl rule__NoNewlineVarWType__Group__1 ;
    public final void rule__NoNewlineVarWType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7370:1: ( rule__NoNewlineVarWType__Group__0__Impl rule__NoNewlineVarWType__Group__1 )
            // InternalFortXTrans.g:7371:2: rule__NoNewlineVarWType__Group__0__Impl rule__NoNewlineVarWType__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__NoNewlineVarWType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NoNewlineVarWType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoNewlineVarWType__Group__0"


    // $ANTLR start "rule__NoNewlineVarWType__Group__0__Impl"
    // InternalFortXTrans.g:7378:1: rule__NoNewlineVarWType__Group__0__Impl : ( ( rule__NoNewlineVarWType__BidAssignment_0 ) ) ;
    public final void rule__NoNewlineVarWType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7382:1: ( ( ( rule__NoNewlineVarWType__BidAssignment_0 ) ) )
            // InternalFortXTrans.g:7383:1: ( ( rule__NoNewlineVarWType__BidAssignment_0 ) )
            {
            // InternalFortXTrans.g:7383:1: ( ( rule__NoNewlineVarWType__BidAssignment_0 ) )
            // InternalFortXTrans.g:7384:2: ( rule__NoNewlineVarWType__BidAssignment_0 )
            {
             before(grammarAccess.getNoNewlineVarWTypeAccess().getBidAssignment_0()); 
            // InternalFortXTrans.g:7385:2: ( rule__NoNewlineVarWType__BidAssignment_0 )
            // InternalFortXTrans.g:7385:3: rule__NoNewlineVarWType__BidAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NoNewlineVarWType__BidAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNoNewlineVarWTypeAccess().getBidAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoNewlineVarWType__Group__0__Impl"


    // $ANTLR start "rule__NoNewlineVarWType__Group__1"
    // InternalFortXTrans.g:7393:1: rule__NoNewlineVarWType__Group__1 : rule__NoNewlineVarWType__Group__1__Impl ;
    public final void rule__NoNewlineVarWType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7397:1: ( rule__NoNewlineVarWType__Group__1__Impl )
            // InternalFortXTrans.g:7398:2: rule__NoNewlineVarWType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NoNewlineVarWType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoNewlineVarWType__Group__1"


    // $ANTLR start "rule__NoNewlineVarWType__Group__1__Impl"
    // InternalFortXTrans.g:7404:1: rule__NoNewlineVarWType__Group__1__Impl : ( ( rule__NoNewlineVarWType__IstypeAssignment_1 ) ) ;
    public final void rule__NoNewlineVarWType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7408:1: ( ( ( rule__NoNewlineVarWType__IstypeAssignment_1 ) ) )
            // InternalFortXTrans.g:7409:1: ( ( rule__NoNewlineVarWType__IstypeAssignment_1 ) )
            {
            // InternalFortXTrans.g:7409:1: ( ( rule__NoNewlineVarWType__IstypeAssignment_1 ) )
            // InternalFortXTrans.g:7410:2: ( rule__NoNewlineVarWType__IstypeAssignment_1 )
            {
             before(grammarAccess.getNoNewlineVarWTypeAccess().getIstypeAssignment_1()); 
            // InternalFortXTrans.g:7411:2: ( rule__NoNewlineVarWType__IstypeAssignment_1 )
            // InternalFortXTrans.g:7411:3: rule__NoNewlineVarWType__IstypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NoNewlineVarWType__IstypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNoNewlineVarWTypeAccess().getIstypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoNewlineVarWType__Group__1__Impl"


    // $ANTLR start "rule__InitVal__Group_0__0"
    // InternalFortXTrans.g:7420:1: rule__InitVal__Group_0__0 : rule__InitVal__Group_0__0__Impl rule__InitVal__Group_0__1 ;
    public final void rule__InitVal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7424:1: ( rule__InitVal__Group_0__0__Impl rule__InitVal__Group_0__1 )
            // InternalFortXTrans.g:7425:2: rule__InitVal__Group_0__0__Impl rule__InitVal__Group_0__1
            {
            pushFollow(FOLLOW_51);
            rule__InitVal__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitVal__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitVal__Group_0__0"


    // $ANTLR start "rule__InitVal__Group_0__0__Impl"
    // InternalFortXTrans.g:7432:1: rule__InitVal__Group_0__0__Impl : ( ( rule__InitVal__MutAssignment_0_0 ) ) ;
    public final void rule__InitVal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7436:1: ( ( ( rule__InitVal__MutAssignment_0_0 ) ) )
            // InternalFortXTrans.g:7437:1: ( ( rule__InitVal__MutAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:7437:1: ( ( rule__InitVal__MutAssignment_0_0 ) )
            // InternalFortXTrans.g:7438:2: ( rule__InitVal__MutAssignment_0_0 )
            {
             before(grammarAccess.getInitValAccess().getMutAssignment_0_0()); 
            // InternalFortXTrans.g:7439:2: ( rule__InitVal__MutAssignment_0_0 )
            // InternalFortXTrans.g:7439:3: rule__InitVal__MutAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__InitVal__MutAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getInitValAccess().getMutAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitVal__Group_0__0__Impl"


    // $ANTLR start "rule__InitVal__Group_0__1"
    // InternalFortXTrans.g:7447:1: rule__InitVal__Group_0__1 : rule__InitVal__Group_0__1__Impl ;
    public final void rule__InitVal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7451:1: ( rule__InitVal__Group_0__1__Impl )
            // InternalFortXTrans.g:7452:2: rule__InitVal__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitVal__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitVal__Group_0__1"


    // $ANTLR start "rule__InitVal__Group_0__1__Impl"
    // InternalFortXTrans.g:7458:1: rule__InitVal__Group_0__1__Impl : ( ( rule__InitVal__LitAssignment_0_1 ) ) ;
    public final void rule__InitVal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7462:1: ( ( ( rule__InitVal__LitAssignment_0_1 ) ) )
            // InternalFortXTrans.g:7463:1: ( ( rule__InitVal__LitAssignment_0_1 ) )
            {
            // InternalFortXTrans.g:7463:1: ( ( rule__InitVal__LitAssignment_0_1 ) )
            // InternalFortXTrans.g:7464:2: ( rule__InitVal__LitAssignment_0_1 )
            {
             before(grammarAccess.getInitValAccess().getLitAssignment_0_1()); 
            // InternalFortXTrans.g:7465:2: ( rule__InitVal__LitAssignment_0_1 )
            // InternalFortXTrans.g:7465:3: rule__InitVal__LitAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__InitVal__LitAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getInitValAccess().getLitAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitVal__Group_0__1__Impl"


    // $ANTLR start "rule__InitVal__Group_1__0"
    // InternalFortXTrans.g:7474:1: rule__InitVal__Group_1__0 : rule__InitVal__Group_1__0__Impl rule__InitVal__Group_1__1 ;
    public final void rule__InitVal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7478:1: ( rule__InitVal__Group_1__0__Impl rule__InitVal__Group_1__1 )
            // InternalFortXTrans.g:7479:2: rule__InitVal__Group_1__0__Impl rule__InitVal__Group_1__1
            {
            pushFollow(FOLLOW_51);
            rule__InitVal__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitVal__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitVal__Group_1__0"


    // $ANTLR start "rule__InitVal__Group_1__0__Impl"
    // InternalFortXTrans.g:7486:1: rule__InitVal__Group_1__0__Impl : ( ( rule__InitVal__ImmutAssignment_1_0 ) ) ;
    public final void rule__InitVal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7490:1: ( ( ( rule__InitVal__ImmutAssignment_1_0 ) ) )
            // InternalFortXTrans.g:7491:1: ( ( rule__InitVal__ImmutAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:7491:1: ( ( rule__InitVal__ImmutAssignment_1_0 ) )
            // InternalFortXTrans.g:7492:2: ( rule__InitVal__ImmutAssignment_1_0 )
            {
             before(grammarAccess.getInitValAccess().getImmutAssignment_1_0()); 
            // InternalFortXTrans.g:7493:2: ( rule__InitVal__ImmutAssignment_1_0 )
            // InternalFortXTrans.g:7493:3: rule__InitVal__ImmutAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__InitVal__ImmutAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getInitValAccess().getImmutAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitVal__Group_1__0__Impl"


    // $ANTLR start "rule__InitVal__Group_1__1"
    // InternalFortXTrans.g:7501:1: rule__InitVal__Group_1__1 : rule__InitVal__Group_1__1__Impl ;
    public final void rule__InitVal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7505:1: ( rule__InitVal__Group_1__1__Impl )
            // InternalFortXTrans.g:7506:2: rule__InitVal__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitVal__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitVal__Group_1__1"


    // $ANTLR start "rule__InitVal__Group_1__1__Impl"
    // InternalFortXTrans.g:7512:1: rule__InitVal__Group_1__1__Impl : ( ( rule__InitVal__LitAssignment_1_1 ) ) ;
    public final void rule__InitVal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7516:1: ( ( ( rule__InitVal__LitAssignment_1_1 ) ) )
            // InternalFortXTrans.g:7517:1: ( ( rule__InitVal__LitAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:7517:1: ( ( rule__InitVal__LitAssignment_1_1 ) )
            // InternalFortXTrans.g:7518:2: ( rule__InitVal__LitAssignment_1_1 )
            {
             before(grammarAccess.getInitValAccess().getLitAssignment_1_1()); 
            // InternalFortXTrans.g:7519:2: ( rule__InitVal__LitAssignment_1_1 )
            // InternalFortXTrans.g:7519:3: rule__InitVal__LitAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__InitVal__LitAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInitValAccess().getLitAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitVal__Group_1__1__Impl"


    // $ANTLR start "rule__LiteralTuple__Group_1__0"
    // InternalFortXTrans.g:7528:1: rule__LiteralTuple__Group_1__0 : rule__LiteralTuple__Group_1__0__Impl rule__LiteralTuple__Group_1__1 ;
    public final void rule__LiteralTuple__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7532:1: ( rule__LiteralTuple__Group_1__0__Impl rule__LiteralTuple__Group_1__1 )
            // InternalFortXTrans.g:7533:2: rule__LiteralTuple__Group_1__0__Impl rule__LiteralTuple__Group_1__1
            {
            pushFollow(FOLLOW_53);
            rule__LiteralTuple__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiteralTuple__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralTuple__Group_1__0"


    // $ANTLR start "rule__LiteralTuple__Group_1__0__Impl"
    // InternalFortXTrans.g:7540:1: rule__LiteralTuple__Group_1__0__Impl : ( '(' ) ;
    public final void rule__LiteralTuple__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7544:1: ( ( '(' ) )
            // InternalFortXTrans.g:7545:1: ( '(' )
            {
            // InternalFortXTrans.g:7545:1: ( '(' )
            // InternalFortXTrans.g:7546:2: '('
            {
             before(grammarAccess.getLiteralTupleAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLiteralTupleAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralTuple__Group_1__0__Impl"


    // $ANTLR start "rule__LiteralTuple__Group_1__1"
    // InternalFortXTrans.g:7555:1: rule__LiteralTuple__Group_1__1 : rule__LiteralTuple__Group_1__1__Impl rule__LiteralTuple__Group_1__2 ;
    public final void rule__LiteralTuple__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7559:1: ( rule__LiteralTuple__Group_1__1__Impl rule__LiteralTuple__Group_1__2 )
            // InternalFortXTrans.g:7560:2: rule__LiteralTuple__Group_1__1__Impl rule__LiteralTuple__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__LiteralTuple__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiteralTuple__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralTuple__Group_1__1"


    // $ANTLR start "rule__LiteralTuple__Group_1__1__Impl"
    // InternalFortXTrans.g:7567:1: rule__LiteralTuple__Group_1__1__Impl : ( ( rule__LiteralTuple__LitsAssignment_1_1 ) ) ;
    public final void rule__LiteralTuple__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7571:1: ( ( ( rule__LiteralTuple__LitsAssignment_1_1 ) ) )
            // InternalFortXTrans.g:7572:1: ( ( rule__LiteralTuple__LitsAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:7572:1: ( ( rule__LiteralTuple__LitsAssignment_1_1 ) )
            // InternalFortXTrans.g:7573:2: ( rule__LiteralTuple__LitsAssignment_1_1 )
            {
             before(grammarAccess.getLiteralTupleAccess().getLitsAssignment_1_1()); 
            // InternalFortXTrans.g:7574:2: ( rule__LiteralTuple__LitsAssignment_1_1 )
            // InternalFortXTrans.g:7574:3: rule__LiteralTuple__LitsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LiteralTuple__LitsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralTupleAccess().getLitsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralTuple__Group_1__1__Impl"


    // $ANTLR start "rule__LiteralTuple__Group_1__2"
    // InternalFortXTrans.g:7582:1: rule__LiteralTuple__Group_1__2 : rule__LiteralTuple__Group_1__2__Impl rule__LiteralTuple__Group_1__3 ;
    public final void rule__LiteralTuple__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7586:1: ( rule__LiteralTuple__Group_1__2__Impl rule__LiteralTuple__Group_1__3 )
            // InternalFortXTrans.g:7587:2: rule__LiteralTuple__Group_1__2__Impl rule__LiteralTuple__Group_1__3
            {
            pushFollow(FOLLOW_28);
            rule__LiteralTuple__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiteralTuple__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralTuple__Group_1__2"


    // $ANTLR start "rule__LiteralTuple__Group_1__2__Impl"
    // InternalFortXTrans.g:7594:1: rule__LiteralTuple__Group_1__2__Impl : ( ( ( rule__LiteralTuple__Group_1_2__0 ) ) ( ( rule__LiteralTuple__Group_1_2__0 )* ) ) ;
    public final void rule__LiteralTuple__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7598:1: ( ( ( ( rule__LiteralTuple__Group_1_2__0 ) ) ( ( rule__LiteralTuple__Group_1_2__0 )* ) ) )
            // InternalFortXTrans.g:7599:1: ( ( ( rule__LiteralTuple__Group_1_2__0 ) ) ( ( rule__LiteralTuple__Group_1_2__0 )* ) )
            {
            // InternalFortXTrans.g:7599:1: ( ( ( rule__LiteralTuple__Group_1_2__0 ) ) ( ( rule__LiteralTuple__Group_1_2__0 )* ) )
            // InternalFortXTrans.g:7600:2: ( ( rule__LiteralTuple__Group_1_2__0 ) ) ( ( rule__LiteralTuple__Group_1_2__0 )* )
            {
            // InternalFortXTrans.g:7600:2: ( ( rule__LiteralTuple__Group_1_2__0 ) )
            // InternalFortXTrans.g:7601:3: ( rule__LiteralTuple__Group_1_2__0 )
            {
             before(grammarAccess.getLiteralTupleAccess().getGroup_1_2()); 
            // InternalFortXTrans.g:7602:3: ( rule__LiteralTuple__Group_1_2__0 )
            // InternalFortXTrans.g:7602:4: rule__LiteralTuple__Group_1_2__0
            {
            pushFollow(FOLLOW_15);
            rule__LiteralTuple__Group_1_2__0();

            state._fsp--;


            }

             after(grammarAccess.getLiteralTupleAccess().getGroup_1_2()); 

            }

            // InternalFortXTrans.g:7605:2: ( ( rule__LiteralTuple__Group_1_2__0 )* )
            // InternalFortXTrans.g:7606:3: ( rule__LiteralTuple__Group_1_2__0 )*
            {
             before(grammarAccess.getLiteralTupleAccess().getGroup_1_2()); 
            // InternalFortXTrans.g:7607:3: ( rule__LiteralTuple__Group_1_2__0 )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==25) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalFortXTrans.g:7607:4: rule__LiteralTuple__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__LiteralTuple__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

             after(grammarAccess.getLiteralTupleAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__LiteralTuple__Group_1__2__Impl"


    // $ANTLR start "rule__LiteralTuple__Group_1__3"
    // InternalFortXTrans.g:7616:1: rule__LiteralTuple__Group_1__3 : rule__LiteralTuple__Group_1__3__Impl ;
    public final void rule__LiteralTuple__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7620:1: ( rule__LiteralTuple__Group_1__3__Impl )
            // InternalFortXTrans.g:7621:2: rule__LiteralTuple__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LiteralTuple__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralTuple__Group_1__3"


    // $ANTLR start "rule__LiteralTuple__Group_1__3__Impl"
    // InternalFortXTrans.g:7627:1: rule__LiteralTuple__Group_1__3__Impl : ( ')' ) ;
    public final void rule__LiteralTuple__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7631:1: ( ( ')' ) )
            // InternalFortXTrans.g:7632:1: ( ')' )
            {
            // InternalFortXTrans.g:7632:1: ( ')' )
            // InternalFortXTrans.g:7633:2: ')'
            {
             before(grammarAccess.getLiteralTupleAccess().getRightParenthesisKeyword_1_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLiteralTupleAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralTuple__Group_1__3__Impl"


    // $ANTLR start "rule__LiteralTuple__Group_1_2__0"
    // InternalFortXTrans.g:7643:1: rule__LiteralTuple__Group_1_2__0 : rule__LiteralTuple__Group_1_2__0__Impl rule__LiteralTuple__Group_1_2__1 ;
    public final void rule__LiteralTuple__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7647:1: ( rule__LiteralTuple__Group_1_2__0__Impl rule__LiteralTuple__Group_1_2__1 )
            // InternalFortXTrans.g:7648:2: rule__LiteralTuple__Group_1_2__0__Impl rule__LiteralTuple__Group_1_2__1
            {
            pushFollow(FOLLOW_53);
            rule__LiteralTuple__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiteralTuple__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralTuple__Group_1_2__0"


    // $ANTLR start "rule__LiteralTuple__Group_1_2__0__Impl"
    // InternalFortXTrans.g:7655:1: rule__LiteralTuple__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__LiteralTuple__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7659:1: ( ( ',' ) )
            // InternalFortXTrans.g:7660:1: ( ',' )
            {
            // InternalFortXTrans.g:7660:1: ( ',' )
            // InternalFortXTrans.g:7661:2: ','
            {
             before(grammarAccess.getLiteralTupleAccess().getCommaKeyword_1_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLiteralTupleAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralTuple__Group_1_2__0__Impl"


    // $ANTLR start "rule__LiteralTuple__Group_1_2__1"
    // InternalFortXTrans.g:7670:1: rule__LiteralTuple__Group_1_2__1 : rule__LiteralTuple__Group_1_2__1__Impl ;
    public final void rule__LiteralTuple__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7674:1: ( rule__LiteralTuple__Group_1_2__1__Impl )
            // InternalFortXTrans.g:7675:2: rule__LiteralTuple__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LiteralTuple__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralTuple__Group_1_2__1"


    // $ANTLR start "rule__LiteralTuple__Group_1_2__1__Impl"
    // InternalFortXTrans.g:7681:1: rule__LiteralTuple__Group_1_2__1__Impl : ( ( rule__LiteralTuple__LitsAssignment_1_2_1 ) ) ;
    public final void rule__LiteralTuple__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7685:1: ( ( ( rule__LiteralTuple__LitsAssignment_1_2_1 ) ) )
            // InternalFortXTrans.g:7686:1: ( ( rule__LiteralTuple__LitsAssignment_1_2_1 ) )
            {
            // InternalFortXTrans.g:7686:1: ( ( rule__LiteralTuple__LitsAssignment_1_2_1 ) )
            // InternalFortXTrans.g:7687:2: ( rule__LiteralTuple__LitsAssignment_1_2_1 )
            {
             before(grammarAccess.getLiteralTupleAccess().getLitsAssignment_1_2_1()); 
            // InternalFortXTrans.g:7688:2: ( rule__LiteralTuple__LitsAssignment_1_2_1 )
            // InternalFortXTrans.g:7688:3: rule__LiteralTuple__LitsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LiteralTuple__LitsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralTupleAccess().getLitsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralTuple__Group_1_2__1__Impl"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalFortXTrans.g:7697:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7701:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:7702:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:7702:2: ( RULE_ID )
            // InternalFortXTrans.g:7703:3: RULE_ID
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
    // InternalFortXTrans.g:7712:1: rule__Component__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Component__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7716:1: ( ( ruleImport ) )
            // InternalFortXTrans.g:7717:2: ( ruleImport )
            {
            // InternalFortXTrans.g:7717:2: ( ruleImport )
            // InternalFortXTrans.g:7718:3: ruleImport
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
    // InternalFortXTrans.g:7727:1: rule__Component__ExportsAssignment_3 : ( ruleExport ) ;
    public final void rule__Component__ExportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7731:1: ( ( ruleExport ) )
            // InternalFortXTrans.g:7732:2: ( ruleExport )
            {
            // InternalFortXTrans.g:7732:2: ( ruleExport )
            // InternalFortXTrans.g:7733:3: ruleExport
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
    // InternalFortXTrans.g:7742:1: rule__Component__DeclsAssignment_4 : ( ruleDecls ) ;
    public final void rule__Component__DeclsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7746:1: ( ( ruleDecls ) )
            // InternalFortXTrans.g:7747:2: ( ruleDecls )
            {
            // InternalFortXTrans.g:7747:2: ( ruleDecls )
            // InternalFortXTrans.g:7748:3: ruleDecls
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
    // InternalFortXTrans.g:7757:1: rule__API__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__API__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7761:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:7762:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:7762:2: ( RULE_ID )
            // InternalFortXTrans.g:7763:3: RULE_ID
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
    // InternalFortXTrans.g:7772:1: rule__API__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__API__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7776:1: ( ( ruleImport ) )
            // InternalFortXTrans.g:7777:2: ( ruleImport )
            {
            // InternalFortXTrans.g:7777:2: ( ruleImport )
            // InternalFortXTrans.g:7778:3: ruleImport
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
    // InternalFortXTrans.g:7787:1: rule__Import__ImpsAssignment_0_0 : ( ( 'import' ) ) ;
    public final void rule__Import__ImpsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7791:1: ( ( ( 'import' ) ) )
            // InternalFortXTrans.g:7792:2: ( ( 'import' ) )
            {
            // InternalFortXTrans.g:7792:2: ( ( 'import' ) )
            // InternalFortXTrans.g:7793:3: ( 'import' )
            {
             before(grammarAccess.getImportAccess().getImpsImportKeyword_0_0_0()); 
            // InternalFortXTrans.g:7794:3: ( 'import' )
            // InternalFortXTrans.g:7795:4: 'import'
            {
             before(grammarAccess.getImportAccess().getImpsImportKeyword_0_0_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalFortXTrans.g:7806:1: rule__Import__ImportedNamesAssignment_0_1 : ( ruleImportedNames ) ;
    public final void rule__Import__ImportedNamesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7810:1: ( ( ruleImportedNames ) )
            // InternalFortXTrans.g:7811:2: ( ruleImportedNames )
            {
            // InternalFortXTrans.g:7811:2: ( ruleImportedNames )
            // InternalFortXTrans.g:7812:3: ruleImportedNames
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
    // InternalFortXTrans.g:7821:1: rule__Import__ImpsAssignment_1_0 : ( ( 'import' ) ) ;
    public final void rule__Import__ImpsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7825:1: ( ( ( 'import' ) ) )
            // InternalFortXTrans.g:7826:2: ( ( 'import' ) )
            {
            // InternalFortXTrans.g:7826:2: ( ( 'import' ) )
            // InternalFortXTrans.g:7827:3: ( 'import' )
            {
             before(grammarAccess.getImportAccess().getImpsImportKeyword_1_0_0()); 
            // InternalFortXTrans.g:7828:3: ( 'import' )
            // InternalFortXTrans.g:7829:4: 'import'
            {
             before(grammarAccess.getImportAccess().getImpsImportKeyword_1_0_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalFortXTrans.g:7840:1: rule__Import__ApiAssignment_1_1 : ( ( 'api' ) ) ;
    public final void rule__Import__ApiAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7844:1: ( ( ( 'api' ) ) )
            // InternalFortXTrans.g:7845:2: ( ( 'api' ) )
            {
            // InternalFortXTrans.g:7845:2: ( ( 'api' ) )
            // InternalFortXTrans.g:7846:3: ( 'api' )
            {
             before(grammarAccess.getImportAccess().getApiApiKeyword_1_1_0()); 
            // InternalFortXTrans.g:7847:3: ( 'api' )
            // InternalFortXTrans.g:7848:4: 'api'
            {
             before(grammarAccess.getImportAccess().getApiApiKeyword_1_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalFortXTrans.g:7859:1: rule__Import__AliasedimportedNamesAssignment_1_2 : ( ruleAliasedAPINames ) ;
    public final void rule__Import__AliasedimportedNamesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7863:1: ( ( ruleAliasedAPINames ) )
            // InternalFortXTrans.g:7864:2: ( ruleAliasedAPINames )
            {
            // InternalFortXTrans.g:7864:2: ( ruleAliasedAPINames )
            // InternalFortXTrans.g:7865:3: ruleAliasedAPINames
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
    // InternalFortXTrans.g:7874:1: rule__Export__ExpAssignment_0_0 : ( ( 'export' ) ) ;
    public final void rule__Export__ExpAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7878:1: ( ( ( 'export' ) ) )
            // InternalFortXTrans.g:7879:2: ( ( 'export' ) )
            {
            // InternalFortXTrans.g:7879:2: ( ( 'export' ) )
            // InternalFortXTrans.g:7880:3: ( 'export' )
            {
             before(grammarAccess.getExportAccess().getExpExportKeyword_0_0_0()); 
            // InternalFortXTrans.g:7881:3: ( 'export' )
            // InternalFortXTrans.g:7882:4: 'export'
            {
             before(grammarAccess.getExportAccess().getExpExportKeyword_0_0_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalFortXTrans.g:7893:1: rule__Export__ExportedNameAssignment_0_1 : ( ruleAPIName ) ;
    public final void rule__Export__ExportedNameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7897:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:7898:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:7898:2: ( ruleAPIName )
            // InternalFortXTrans.g:7899:3: ruleAPIName
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
    // InternalFortXTrans.g:7908:1: rule__Export__ExpAssignment_1_0 : ( ( 'export' ) ) ;
    public final void rule__Export__ExpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7912:1: ( ( ( 'export' ) ) )
            // InternalFortXTrans.g:7913:2: ( ( 'export' ) )
            {
            // InternalFortXTrans.g:7913:2: ( ( 'export' ) )
            // InternalFortXTrans.g:7914:3: ( 'export' )
            {
             before(grammarAccess.getExportAccess().getExpExportKeyword_1_0_0()); 
            // InternalFortXTrans.g:7915:3: ( 'export' )
            // InternalFortXTrans.g:7916:4: 'export'
            {
             before(grammarAccess.getExportAccess().getExpExportKeyword_1_0_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalFortXTrans.g:7927:1: rule__Export__BrackAssignment_1_1 : ( ( '{' ) ) ;
    public final void rule__Export__BrackAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7931:1: ( ( ( '{' ) ) )
            // InternalFortXTrans.g:7932:2: ( ( '{' ) )
            {
            // InternalFortXTrans.g:7932:2: ( ( '{' ) )
            // InternalFortXTrans.g:7933:3: ( '{' )
            {
             before(grammarAccess.getExportAccess().getBrackLeftCurlyBracketKeyword_1_1_0()); 
            // InternalFortXTrans.g:7934:3: ( '{' )
            // InternalFortXTrans.g:7935:4: '{'
            {
             before(grammarAccess.getExportAccess().getBrackLeftCurlyBracketKeyword_1_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalFortXTrans.g:7946:1: rule__Export__ExportedNameAssignment_1_2 : ( ruleAPIName ) ;
    public final void rule__Export__ExportedNameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7950:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:7951:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:7951:2: ( ruleAPIName )
            // InternalFortXTrans.g:7952:3: ruleAPIName
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
    // InternalFortXTrans.g:7961:1: rule__Export__ExportedNameAssignment_1_3_1 : ( ruleAPIName ) ;
    public final void rule__Export__ExportedNameAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7965:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:7966:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:7966:2: ( ruleAPIName )
            // InternalFortXTrans.g:7967:3: ruleAPIName
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
    // InternalFortXTrans.g:7976:1: rule__ImportedNames__ImpnameAssignment_0_0 : ( ruleAPIName ) ;
    public final void rule__ImportedNames__ImpnameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7980:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:7981:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:7981:2: ( ruleAPIName )
            // InternalFortXTrans.g:7982:3: ruleAPIName
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
    // InternalFortXTrans.g:7991:1: rule__ImportedNames__ExceptAssignment_0_5_0 : ( ( 'except' ) ) ;
    public final void rule__ImportedNames__ExceptAssignment_0_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7995:1: ( ( ( 'except' ) ) )
            // InternalFortXTrans.g:7996:2: ( ( 'except' ) )
            {
            // InternalFortXTrans.g:7996:2: ( ( 'except' ) )
            // InternalFortXTrans.g:7997:3: ( 'except' )
            {
             before(grammarAccess.getImportedNamesAccess().getExceptExceptKeyword_0_5_0_0()); 
            // InternalFortXTrans.g:7998:3: ( 'except' )
            // InternalFortXTrans.g:7999:4: 'except'
            {
             before(grammarAccess.getImportedNamesAccess().getExceptExceptKeyword_0_5_0_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalFortXTrans.g:8010:1: rule__ImportedNames__SimpAssignment_0_5_1 : ( ruleSimpleNames ) ;
    public final void rule__ImportedNames__SimpAssignment_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8014:1: ( ( ruleSimpleNames ) )
            // InternalFortXTrans.g:8015:2: ( ruleSimpleNames )
            {
            // InternalFortXTrans.g:8015:2: ( ruleSimpleNames )
            // InternalFortXTrans.g:8016:3: ruleSimpleNames
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
    // InternalFortXTrans.g:8025:1: rule__ImportedNames__ImpnameAssignment_1_0 : ( ruleAPIName ) ;
    public final void rule__ImportedNames__ImpnameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8029:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:8030:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:8030:2: ( ruleAPIName )
            // InternalFortXTrans.g:8031:3: ruleAPIName
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
    // InternalFortXTrans.g:8040:1: rule__ImportedNames__SimpListAssignment_1_3 : ( ruleAliasedSimpleName ) ;
    public final void rule__ImportedNames__SimpListAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8044:1: ( ( ruleAliasedSimpleName ) )
            // InternalFortXTrans.g:8045:2: ( ruleAliasedSimpleName )
            {
            // InternalFortXTrans.g:8045:2: ( ruleAliasedSimpleName )
            // InternalFortXTrans.g:8046:3: ruleAliasedSimpleName
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
    // InternalFortXTrans.g:8055:1: rule__ImportedNames__SimpListAssignment_1_4_1 : ( ruleAliasedSimpleName ) ;
    public final void rule__ImportedNames__SimpListAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8059:1: ( ( ruleAliasedSimpleName ) )
            // InternalFortXTrans.g:8060:2: ( ruleAliasedSimpleName )
            {
            // InternalFortXTrans.g:8060:2: ( ruleAliasedSimpleName )
            // InternalFortXTrans.g:8061:3: ruleAliasedSimpleName
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
    // InternalFortXTrans.g:8070:1: rule__ImportedNames__CommaAssignment_1_5_0 : ( ( ',' ) ) ;
    public final void rule__ImportedNames__CommaAssignment_1_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8074:1: ( ( ( ',' ) ) )
            // InternalFortXTrans.g:8075:2: ( ( ',' ) )
            {
            // InternalFortXTrans.g:8075:2: ( ( ',' ) )
            // InternalFortXTrans.g:8076:3: ( ',' )
            {
             before(grammarAccess.getImportedNamesAccess().getCommaCommaKeyword_1_5_0_0()); 
            // InternalFortXTrans.g:8077:3: ( ',' )
            // InternalFortXTrans.g:8078:4: ','
            {
             before(grammarAccess.getImportedNamesAccess().getCommaCommaKeyword_1_5_0_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalFortXTrans.g:8089:1: rule__ImportedNames__DotsAssignment_1_5_1 : ( RULE_DOTS ) ;
    public final void rule__ImportedNames__DotsAssignment_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8093:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:8094:2: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:8094:2: ( RULE_DOTS )
            // InternalFortXTrans.g:8095:3: RULE_DOTS
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
    // InternalFortXTrans.g:8104:1: rule__ImportedNames__ImpnameAssignment_2_0 : ( ruleAPIName ) ;
    public final void rule__ImportedNames__ImpnameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8108:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:8109:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:8109:2: ( ruleAPIName )
            // InternalFortXTrans.g:8110:3: ruleAPIName
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
    // InternalFortXTrans.g:8119:1: rule__ImportedNames__AsnameAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__ImportedNames__AsnameAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8123:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:8124:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:8124:2: ( RULE_ID )
            // InternalFortXTrans.g:8125:3: RULE_ID
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
    // InternalFortXTrans.g:8134:1: rule__SimpleNames__NameListAssignment_0 : ( ruleSimpleName ) ;
    public final void rule__SimpleNames__NameListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8138:1: ( ( ruleSimpleName ) )
            // InternalFortXTrans.g:8139:2: ( ruleSimpleName )
            {
            // InternalFortXTrans.g:8139:2: ( ruleSimpleName )
            // InternalFortXTrans.g:8140:3: ruleSimpleName
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
    // InternalFortXTrans.g:8149:1: rule__SimpleNames__BrackAssignment_1_0 : ( ( '{' ) ) ;
    public final void rule__SimpleNames__BrackAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8153:1: ( ( ( '{' ) ) )
            // InternalFortXTrans.g:8154:2: ( ( '{' ) )
            {
            // InternalFortXTrans.g:8154:2: ( ( '{' ) )
            // InternalFortXTrans.g:8155:3: ( '{' )
            {
             before(grammarAccess.getSimpleNamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0()); 
            // InternalFortXTrans.g:8156:3: ( '{' )
            // InternalFortXTrans.g:8157:4: '{'
            {
             before(grammarAccess.getSimpleNamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalFortXTrans.g:8168:1: rule__SimpleNames__NameListAssignment_1_1 : ( ruleSimpleName ) ;
    public final void rule__SimpleNames__NameListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8172:1: ( ( ruleSimpleName ) )
            // InternalFortXTrans.g:8173:2: ( ruleSimpleName )
            {
            // InternalFortXTrans.g:8173:2: ( ruleSimpleName )
            // InternalFortXTrans.g:8174:3: ruleSimpleName
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
    // InternalFortXTrans.g:8183:1: rule__SimpleNames__NameListAssignment_1_2_1 : ( ruleSimpleName ) ;
    public final void rule__SimpleNames__NameListAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8187:1: ( ( ruleSimpleName ) )
            // InternalFortXTrans.g:8188:2: ( ruleSimpleName )
            {
            // InternalFortXTrans.g:8188:2: ( ruleSimpleName )
            // InternalFortXTrans.g:8189:3: ruleSimpleName
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
    // InternalFortXTrans.g:8198:1: rule__SimpleName__NameAssignment : ( RULE_ID ) ;
    public final void rule__SimpleName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8202:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:8203:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:8203:2: ( RULE_ID )
            // InternalFortXTrans.g:8204:3: RULE_ID
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
    // InternalFortXTrans.g:8213:1: rule__AliasedSimpleName__OrigAssignment_0 : ( RULE_ID ) ;
    public final void rule__AliasedSimpleName__OrigAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8217:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:8218:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:8218:2: ( RULE_ID )
            // InternalFortXTrans.g:8219:3: RULE_ID
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
    // InternalFortXTrans.g:8228:1: rule__AliasedSimpleName__AsNameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__AliasedSimpleName__AsNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8232:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:8233:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:8233:2: ( RULE_ID )
            // InternalFortXTrans.g:8234:3: RULE_ID
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
    // InternalFortXTrans.g:8243:1: rule__AliasedAPINames__NameListAssignment_0 : ( ruleAliasedAPIName ) ;
    public final void rule__AliasedAPINames__NameListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8247:1: ( ( ruleAliasedAPIName ) )
            // InternalFortXTrans.g:8248:2: ( ruleAliasedAPIName )
            {
            // InternalFortXTrans.g:8248:2: ( ruleAliasedAPIName )
            // InternalFortXTrans.g:8249:3: ruleAliasedAPIName
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
    // InternalFortXTrans.g:8258:1: rule__AliasedAPINames__BrackAssignment_1_0 : ( ( '{' ) ) ;
    public final void rule__AliasedAPINames__BrackAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8262:1: ( ( ( '{' ) ) )
            // InternalFortXTrans.g:8263:2: ( ( '{' ) )
            {
            // InternalFortXTrans.g:8263:2: ( ( '{' ) )
            // InternalFortXTrans.g:8264:3: ( '{' )
            {
             before(grammarAccess.getAliasedAPINamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0()); 
            // InternalFortXTrans.g:8265:3: ( '{' )
            // InternalFortXTrans.g:8266:4: '{'
            {
             before(grammarAccess.getAliasedAPINamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalFortXTrans.g:8277:1: rule__AliasedAPINames__NameListAssignment_1_1 : ( ruleAliasedAPIName ) ;
    public final void rule__AliasedAPINames__NameListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8281:1: ( ( ruleAliasedAPIName ) )
            // InternalFortXTrans.g:8282:2: ( ruleAliasedAPIName )
            {
            // InternalFortXTrans.g:8282:2: ( ruleAliasedAPIName )
            // InternalFortXTrans.g:8283:3: ruleAliasedAPIName
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
    // InternalFortXTrans.g:8292:1: rule__AliasedAPINames__NameListAssignment_1_2_1 : ( ruleAliasedAPIName ) ;
    public final void rule__AliasedAPINames__NameListAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8296:1: ( ( ruleAliasedAPIName ) )
            // InternalFortXTrans.g:8297:2: ( ruleAliasedAPIName )
            {
            // InternalFortXTrans.g:8297:2: ( ruleAliasedAPIName )
            // InternalFortXTrans.g:8298:3: ruleAliasedAPIName
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
    // InternalFortXTrans.g:8307:1: rule__AliasedAPIName__OrigAssignment_0 : ( ruleAPIName ) ;
    public final void rule__AliasedAPIName__OrigAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8311:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:8312:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:8312:2: ( ruleAPIName )
            // InternalFortXTrans.g:8313:3: ruleAPIName
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
    // InternalFortXTrans.g:8322:1: rule__AliasedAPIName__AsNameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__AliasedAPIName__AsNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8326:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:8327:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:8327:2: ( RULE_ID )
            // InternalFortXTrans.g:8328:3: RULE_ID
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
    // InternalFortXTrans.g:8337:1: rule__Decls__DeclsAssignment : ( ruleDecl ) ;
    public final void rule__Decls__DeclsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8341:1: ( ( ruleDecl ) )
            // InternalFortXTrans.g:8342:2: ( ruleDecl )
            {
            // InternalFortXTrans.g:8342:2: ( ruleDecl )
            // InternalFortXTrans.g:8343:3: ruleDecl
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


    // $ANTLR start "rule__Decl__FunctionAssignment_0"
    // InternalFortXTrans.g:8352:1: rule__Decl__FunctionAssignment_0 : ( ruleFnDecl ) ;
    public final void rule__Decl__FunctionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8356:1: ( ( ruleFnDecl ) )
            // InternalFortXTrans.g:8357:2: ( ruleFnDecl )
            {
            // InternalFortXTrans.g:8357:2: ( ruleFnDecl )
            // InternalFortXTrans.g:8358:3: ruleFnDecl
            {
             before(grammarAccess.getDeclAccess().getFunctionFnDeclParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFnDecl();

            state._fsp--;

             after(grammarAccess.getDeclAccess().getFunctionFnDeclParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__FunctionAssignment_0"


    // $ANTLR start "rule__Decl__FieldAssignment_1"
    // InternalFortXTrans.g:8367:1: rule__Decl__FieldAssignment_1 : ( ruleFieldDecl ) ;
    public final void rule__Decl__FieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8371:1: ( ( ruleFieldDecl ) )
            // InternalFortXTrans.g:8372:2: ( ruleFieldDecl )
            {
            // InternalFortXTrans.g:8372:2: ( ruleFieldDecl )
            // InternalFortXTrans.g:8373:3: ruleFieldDecl
            {
             before(grammarAccess.getDeclAccess().getFieldFieldDeclParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldDecl();

            state._fsp--;

             after(grammarAccess.getDeclAccess().getFieldFieldDeclParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__FieldAssignment_1"


    // $ANTLR start "rule__FnMods__ModsAssignment"
    // InternalFortXTrans.g:8382:1: rule__FnMods__ModsAssignment : ( ruleFnMod ) ;
    public final void rule__FnMods__ModsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8386:1: ( ( ruleFnMod ) )
            // InternalFortXTrans.g:8387:2: ( ruleFnMod )
            {
            // InternalFortXTrans.g:8387:2: ( ruleFnMod )
            // InternalFortXTrans.g:8388:3: ruleFnMod
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
    // InternalFortXTrans.g:8397:1: rule__FnMod__ModtypeAssignment_0 : ( ( 'private' ) ) ;
    public final void rule__FnMod__ModtypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8401:1: ( ( ( 'private' ) ) )
            // InternalFortXTrans.g:8402:2: ( ( 'private' ) )
            {
            // InternalFortXTrans.g:8402:2: ( ( 'private' ) )
            // InternalFortXTrans.g:8403:3: ( 'private' )
            {
             before(grammarAccess.getFnModAccess().getModtypePrivateKeyword_0_0()); 
            // InternalFortXTrans.g:8404:3: ( 'private' )
            // InternalFortXTrans.g:8405:4: 'private'
            {
             before(grammarAccess.getFnModAccess().getModtypePrivateKeyword_0_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalFortXTrans.g:8416:1: rule__FnMod__ModtypeAssignment_1 : ( ( 'test' ) ) ;
    public final void rule__FnMod__ModtypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8420:1: ( ( ( 'test' ) ) )
            // InternalFortXTrans.g:8421:2: ( ( 'test' ) )
            {
            // InternalFortXTrans.g:8421:2: ( ( 'test' ) )
            // InternalFortXTrans.g:8422:3: ( 'test' )
            {
             before(grammarAccess.getFnModAccess().getModtypeTestKeyword_1_0()); 
            // InternalFortXTrans.g:8423:3: ( 'test' )
            // InternalFortXTrans.g:8424:4: 'test'
            {
             before(grammarAccess.getFnModAccess().getModtypeTestKeyword_1_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalFortXTrans.g:8435:1: rule__FnMod__ModtypeAssignment_2 : ( ( 'atomic' ) ) ;
    public final void rule__FnMod__ModtypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8439:1: ( ( ( 'atomic' ) ) )
            // InternalFortXTrans.g:8440:2: ( ( 'atomic' ) )
            {
            // InternalFortXTrans.g:8440:2: ( ( 'atomic' ) )
            // InternalFortXTrans.g:8441:3: ( 'atomic' )
            {
             before(grammarAccess.getFnModAccess().getModtypeAtomicKeyword_2_0()); 
            // InternalFortXTrans.g:8442:3: ( 'atomic' )
            // InternalFortXTrans.g:8443:4: 'atomic'
            {
             before(grammarAccess.getFnModAccess().getModtypeAtomicKeyword_2_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalFortXTrans.g:8454:1: rule__FnMod__ModtypeAssignment_3 : ( ( 'io' ) ) ;
    public final void rule__FnMod__ModtypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8458:1: ( ( ( 'io' ) ) )
            // InternalFortXTrans.g:8459:2: ( ( 'io' ) )
            {
            // InternalFortXTrans.g:8459:2: ( ( 'io' ) )
            // InternalFortXTrans.g:8460:3: ( 'io' )
            {
             before(grammarAccess.getFnModAccess().getModtypeIoKeyword_3_0()); 
            // InternalFortXTrans.g:8461:3: ( 'io' )
            // InternalFortXTrans.g:8462:4: 'io'
            {
             before(grammarAccess.getFnModAccess().getModtypeIoKeyword_3_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalFortXTrans.g:8473:1: rule__ValParam__ParamsAssignment_0 : ( ruleParam ) ;
    public final void rule__ValParam__ParamsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8477:1: ( ( ruleParam ) )
            // InternalFortXTrans.g:8478:2: ( ruleParam )
            {
            // InternalFortXTrans.g:8478:2: ( ruleParam )
            // InternalFortXTrans.g:8479:3: ruleParam
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
    // InternalFortXTrans.g:8488:1: rule__ValParam__BrackAssignment_1_0 : ( ( '(' ) ) ;
    public final void rule__ValParam__BrackAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8492:1: ( ( ( '(' ) ) )
            // InternalFortXTrans.g:8493:2: ( ( '(' ) )
            {
            // InternalFortXTrans.g:8493:2: ( ( '(' ) )
            // InternalFortXTrans.g:8494:3: ( '(' )
            {
             before(grammarAccess.getValParamAccess().getBrackLeftParenthesisKeyword_1_0_0()); 
            // InternalFortXTrans.g:8495:3: ( '(' )
            // InternalFortXTrans.g:8496:4: '('
            {
             before(grammarAccess.getValParamAccess().getBrackLeftParenthesisKeyword_1_0_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalFortXTrans.g:8507:1: rule__ValParam__ParamsAssignment_1_1_0 : ( ruleParam ) ;
    public final void rule__ValParam__ParamsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8511:1: ( ( ruleParam ) )
            // InternalFortXTrans.g:8512:2: ( ruleParam )
            {
            // InternalFortXTrans.g:8512:2: ( ruleParam )
            // InternalFortXTrans.g:8513:3: ruleParam
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
    // InternalFortXTrans.g:8522:1: rule__ValParam__ParamsAssignment_1_1_1_1 : ( ruleParam ) ;
    public final void rule__ValParam__ParamsAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8526:1: ( ( ruleParam ) )
            // InternalFortXTrans.g:8527:2: ( ruleParam )
            {
            // InternalFortXTrans.g:8527:2: ( ruleParam )
            // InternalFortXTrans.g:8528:3: ruleParam
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
    // InternalFortXTrans.g:8537:1: rule__Param__BIdAssignment_0 : ( ruleBindId ) ;
    public final void rule__Param__BIdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8541:1: ( ( ruleBindId ) )
            // InternalFortXTrans.g:8542:2: ( ruleBindId )
            {
            // InternalFortXTrans.g:8542:2: ( ruleBindId )
            // InternalFortXTrans.g:8543:3: ruleBindId
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
    // InternalFortXTrans.g:8552:1: rule__Param__IstypeAssignment_1 : ( ruleIsType ) ;
    public final void rule__Param__IstypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8556:1: ( ( ruleIsType ) )
            // InternalFortXTrans.g:8557:2: ( ruleIsType )
            {
            // InternalFortXTrans.g:8557:2: ( ruleIsType )
            // InternalFortXTrans.g:8558:3: ruleIsType
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
    // InternalFortXTrans.g:8567:1: rule__RetType__EmptyAssignment_0_1 : ( ( '(' ) ) ;
    public final void rule__RetType__EmptyAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8571:1: ( ( ( '(' ) ) )
            // InternalFortXTrans.g:8572:2: ( ( '(' ) )
            {
            // InternalFortXTrans.g:8572:2: ( ( '(' ) )
            // InternalFortXTrans.g:8573:3: ( '(' )
            {
             before(grammarAccess.getRetTypeAccess().getEmptyLeftParenthesisKeyword_0_1_0()); 
            // InternalFortXTrans.g:8574:3: ( '(' )
            // InternalFortXTrans.g:8575:4: '('
            {
             before(grammarAccess.getRetTypeAccess().getEmptyLeftParenthesisKeyword_0_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalFortXTrans.g:8586:1: rule__RetType__TypeAssignment_1_1 : ( ruleType ) ;
    public final void rule__RetType__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8590:1: ( ( ruleType ) )
            // InternalFortXTrans.g:8591:2: ( ruleType )
            {
            // InternalFortXTrans.g:8591:2: ( ruleType )
            // InternalFortXTrans.g:8592:3: ruleType
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


    // $ANTLR start "rule__TupleType__TypesAssignment_1"
    // InternalFortXTrans.g:8601:1: rule__TupleType__TypesAssignment_1 : ( ruleType ) ;
    public final void rule__TupleType__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8605:1: ( ( ruleType ) )
            // InternalFortXTrans.g:8606:2: ( ruleType )
            {
            // InternalFortXTrans.g:8606:2: ( ruleType )
            // InternalFortXTrans.g:8607:3: ruleType
            {
             before(grammarAccess.getTupleTypeAccess().getTypesTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTupleTypeAccess().getTypesTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleType__TypesAssignment_1"


    // $ANTLR start "rule__TupleType__TypesAssignment_2_1"
    // InternalFortXTrans.g:8616:1: rule__TupleType__TypesAssignment_2_1 : ( ruleType ) ;
    public final void rule__TupleType__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8620:1: ( ( ruleType ) )
            // InternalFortXTrans.g:8621:2: ( ruleType )
            {
            // InternalFortXTrans.g:8621:2: ( ruleType )
            // InternalFortXTrans.g:8622:3: ruleType
            {
             before(grammarAccess.getTupleTypeAccess().getTypesTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTupleTypeAccess().getTypesTypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleType__TypesAssignment_2_1"


    // $ANTLR start "rule__Type__TnameAssignment"
    // InternalFortXTrans.g:8631:1: rule__Type__TnameAssignment : ( RULE_ID ) ;
    public final void rule__Type__TnameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8635:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:8636:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:8636:2: ( RULE_ID )
            // InternalFortXTrans.g:8637:3: RULE_ID
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
    // InternalFortXTrans.g:8646:1: rule__FnDecl__ModsAssignment_0 : ( ruleFnMods ) ;
    public final void rule__FnDecl__ModsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8650:1: ( ( ruleFnMods ) )
            // InternalFortXTrans.g:8651:2: ( ruleFnMods )
            {
            // InternalFortXTrans.g:8651:2: ( ruleFnMods )
            // InternalFortXTrans.g:8652:3: ruleFnMods
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
    // InternalFortXTrans.g:8661:1: rule__FnDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FnDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8665:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:8666:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:8666:2: ( RULE_ID )
            // InternalFortXTrans.g:8667:3: RULE_ID
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
    // InternalFortXTrans.g:8676:1: rule__FnDecl__ParamsAssignment_2 : ( ruleValParam ) ;
    public final void rule__FnDecl__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8680:1: ( ( ruleValParam ) )
            // InternalFortXTrans.g:8681:2: ( ruleValParam )
            {
            // InternalFortXTrans.g:8681:2: ( ruleValParam )
            // InternalFortXTrans.g:8682:3: ruleValParam
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
    // InternalFortXTrans.g:8691:1: rule__FnDecl__RetValAssignment_3 : ( ruleRetType ) ;
    public final void rule__FnDecl__RetValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8695:1: ( ( ruleRetType ) )
            // InternalFortXTrans.g:8696:2: ( ruleRetType )
            {
            // InternalFortXTrans.g:8696:2: ( ruleRetType )
            // InternalFortXTrans.g:8697:3: ruleRetType
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
    // InternalFortXTrans.g:8706:1: rule__FnDecl__BodyAssignment_4_0 : ( ( '=' ) ) ;
    public final void rule__FnDecl__BodyAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8710:1: ( ( ( '=' ) ) )
            // InternalFortXTrans.g:8711:2: ( ( '=' ) )
            {
            // InternalFortXTrans.g:8711:2: ( ( '=' ) )
            // InternalFortXTrans.g:8712:3: ( '=' )
            {
             before(grammarAccess.getFnDeclAccess().getBodyEqualsSignKeyword_4_0_0()); 
            // InternalFortXTrans.g:8713:3: ( '=' )
            // InternalFortXTrans.g:8714:4: '='
            {
             before(grammarAccess.getFnDeclAccess().getBodyEqualsSignKeyword_4_0_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalFortXTrans.g:8725:1: rule__FnDecl__FnItselfAssignment_4_1 : ( ruleExpr ) ;
    public final void rule__FnDecl__FnItselfAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8729:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:8730:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:8730:2: ( ruleExpr )
            // InternalFortXTrans.g:8731:3: ruleExpr
            {
             before(grammarAccess.getFnDeclAccess().getFnItselfExprParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getFnDeclAccess().getFnItselfExprParserRuleCall_4_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Expr__FrontAssignment_0"
    // InternalFortXTrans.g:8740:1: rule__Expr__FrontAssignment_0 : ( ruleExprFront ) ;
    public final void rule__Expr__FrontAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8744:1: ( ( ruleExprFront ) )
            // InternalFortXTrans.g:8745:2: ( ruleExprFront )
            {
            // InternalFortXTrans.g:8745:2: ( ruleExprFront )
            // InternalFortXTrans.g:8746:3: ruleExprFront
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
    // InternalFortXTrans.g:8755:1: rule__Expr__TailsAssignment_1 : ( ruleExprTail ) ;
    public final void rule__Expr__TailsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8759:1: ( ( ruleExprTail ) )
            // InternalFortXTrans.g:8760:2: ( ruleExprTail )
            {
            // InternalFortXTrans.g:8760:2: ( ruleExprTail )
            // InternalFortXTrans.g:8761:3: ruleExprTail
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
    // InternalFortXTrans.g:8770:1: rule__ExprFront__DelimAssignment_0 : ( ruleDelimitedExpr ) ;
    public final void rule__ExprFront__DelimAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8774:1: ( ( ruleDelimitedExpr ) )
            // InternalFortXTrans.g:8775:2: ( ruleDelimitedExpr )
            {
            // InternalFortXTrans.g:8775:2: ( ruleDelimitedExpr )
            // InternalFortXTrans.g:8776:3: ruleDelimitedExpr
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
    // InternalFortXTrans.g:8785:1: rule__ExprFront__IdAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ExprFront__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8789:1: ( ( ruleQualifiedName ) )
            // InternalFortXTrans.g:8790:2: ( ruleQualifiedName )
            {
            // InternalFortXTrans.g:8790:2: ( ruleQualifiedName )
            // InternalFortXTrans.g:8791:3: ruleQualifiedName
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
    // InternalFortXTrans.g:8800:1: rule__ExprTail__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__ExprTail__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8804:1: ( ( ruleType ) )
            // InternalFortXTrans.g:8805:2: ( ruleType )
            {
            // InternalFortXTrans.g:8805:2: ( ruleType )
            // InternalFortXTrans.g:8806:3: ruleType
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
    // InternalFortXTrans.g:8815:1: rule__DelimitedExpr__DodAssignment_0 : ( ruleDo ) ;
    public final void rule__DelimitedExpr__DodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8819:1: ( ( ruleDo ) )
            // InternalFortXTrans.g:8820:2: ( ruleDo )
            {
            // InternalFortXTrans.g:8820:2: ( ruleDo )
            // InternalFortXTrans.g:8821:3: ruleDo
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
    // InternalFortXTrans.g:8830:1: rule__DelimitedExpr__AwhileAssignment_1_0 : ( ( 'while' ) ) ;
    public final void rule__DelimitedExpr__AwhileAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8834:1: ( ( ( 'while' ) ) )
            // InternalFortXTrans.g:8835:2: ( ( 'while' ) )
            {
            // InternalFortXTrans.g:8835:2: ( ( 'while' ) )
            // InternalFortXTrans.g:8836:3: ( 'while' )
            {
             before(grammarAccess.getDelimitedExprAccess().getAwhileWhileKeyword_1_0_0()); 
            // InternalFortXTrans.g:8837:3: ( 'while' )
            // InternalFortXTrans.g:8838:4: 'while'
            {
             before(grammarAccess.getDelimitedExprAccess().getAwhileWhileKeyword_1_0_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalFortXTrans.g:8849:1: rule__DelimitedExpr__ExprAssignment_1_1 : ( ruleExpr ) ;
    public final void rule__DelimitedExpr__ExprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8853:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:8854:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:8854:2: ( ruleExpr )
            // InternalFortXTrans.g:8855:3: ruleExpr
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
    // InternalFortXTrans.g:8864:1: rule__DelimitedExpr__WhiledodAssignment_1_2 : ( ruleDo ) ;
    public final void rule__DelimitedExpr__WhiledodAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8868:1: ( ( ruleDo ) )
            // InternalFortXTrans.g:8869:2: ( ruleDo )
            {
            // InternalFortXTrans.g:8869:2: ( ruleDo )
            // InternalFortXTrans.g:8870:3: ruleDo
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
    // InternalFortXTrans.g:8879:1: rule__DelimitedExpr__AforAssignment_2_0 : ( ( 'for' ) ) ;
    public final void rule__DelimitedExpr__AforAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8883:1: ( ( ( 'for' ) ) )
            // InternalFortXTrans.g:8884:2: ( ( 'for' ) )
            {
            // InternalFortXTrans.g:8884:2: ( ( 'for' ) )
            // InternalFortXTrans.g:8885:3: ( 'for' )
            {
             before(grammarAccess.getDelimitedExprAccess().getAforForKeyword_2_0_0()); 
            // InternalFortXTrans.g:8886:3: ( 'for' )
            // InternalFortXTrans.g:8887:4: 'for'
            {
             before(grammarAccess.getDelimitedExprAccess().getAforForKeyword_2_0_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalFortXTrans.g:8898:1: rule__DelimitedExpr__GenAssignment_2_1 : ( ruleGenerators ) ;
    public final void rule__DelimitedExpr__GenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8902:1: ( ( ruleGenerators ) )
            // InternalFortXTrans.g:8903:2: ( ruleGenerators )
            {
            // InternalFortXTrans.g:8903:2: ( ruleGenerators )
            // InternalFortXTrans.g:8904:3: ruleGenerators
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
    // InternalFortXTrans.g:8913:1: rule__DelimitedExpr__DofrontAssignment_2_2 : ( ruleDoFront ) ;
    public final void rule__DelimitedExpr__DofrontAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8917:1: ( ( ruleDoFront ) )
            // InternalFortXTrans.g:8918:2: ( ruleDoFront )
            {
            // InternalFortXTrans.g:8918:2: ( ruleDoFront )
            // InternalFortXTrans.g:8919:3: ruleDoFront
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
    // InternalFortXTrans.g:8928:1: rule__DelimitedExpr__AnifAssignment_3_0 : ( ( 'if' ) ) ;
    public final void rule__DelimitedExpr__AnifAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8932:1: ( ( ( 'if' ) ) )
            // InternalFortXTrans.g:8933:2: ( ( 'if' ) )
            {
            // InternalFortXTrans.g:8933:2: ( ( 'if' ) )
            // InternalFortXTrans.g:8934:3: ( 'if' )
            {
             before(grammarAccess.getDelimitedExprAccess().getAnifIfKeyword_3_0_0()); 
            // InternalFortXTrans.g:8935:3: ( 'if' )
            // InternalFortXTrans.g:8936:4: 'if'
            {
             before(grammarAccess.getDelimitedExprAccess().getAnifIfKeyword_3_0_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalFortXTrans.g:8947:1: rule__DelimitedExpr__CondAssignment_3_1 : ( ruleExpr ) ;
    public final void rule__DelimitedExpr__CondAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8951:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:8952:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:8952:2: ( ruleExpr )
            // InternalFortXTrans.g:8953:3: ruleExpr
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
    // InternalFortXTrans.g:8962:1: rule__DelimitedExpr__BlockAssignment_3_3 : ( ruleBlockElems ) ;
    public final void rule__DelimitedExpr__BlockAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8966:1: ( ( ruleBlockElems ) )
            // InternalFortXTrans.g:8967:2: ( ruleBlockElems )
            {
            // InternalFortXTrans.g:8967:2: ( ruleBlockElems )
            // InternalFortXTrans.g:8968:3: ruleBlockElems
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
    // InternalFortXTrans.g:8977:1: rule__DelimitedExpr__ElifsAssignment_3_4 : ( ruleElifs ) ;
    public final void rule__DelimitedExpr__ElifsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8981:1: ( ( ruleElifs ) )
            // InternalFortXTrans.g:8982:2: ( ruleElifs )
            {
            // InternalFortXTrans.g:8982:2: ( ruleElifs )
            // InternalFortXTrans.g:8983:3: ruleElifs
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
    // InternalFortXTrans.g:8992:1: rule__DelimitedExpr__ElsAssignment_3_5 : ( ruleElse ) ;
    public final void rule__DelimitedExpr__ElsAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8996:1: ( ( ruleElse ) )
            // InternalFortXTrans.g:8997:2: ( ruleElse )
            {
            // InternalFortXTrans.g:8997:2: ( ruleElse )
            // InternalFortXTrans.g:8998:3: ruleElse
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
    // InternalFortXTrans.g:9007:1: rule__DelimitedExpr__ParAssignment_4 : ( ruleParanthesized ) ;
    public final void rule__DelimitedExpr__ParAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9011:1: ( ( ruleParanthesized ) )
            // InternalFortXTrans.g:9012:2: ( ruleParanthesized )
            {
            // InternalFortXTrans.g:9012:2: ( ruleParanthesized )
            // InternalFortXTrans.g:9013:3: ruleParanthesized
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
    // InternalFortXTrans.g:9022:1: rule__Elifs__EAssignment_0 : ( ruleElif ) ;
    public final void rule__Elifs__EAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9026:1: ( ( ruleElif ) )
            // InternalFortXTrans.g:9027:2: ( ruleElif )
            {
            // InternalFortXTrans.g:9027:2: ( ruleElif )
            // InternalFortXTrans.g:9028:3: ruleElif
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
    // InternalFortXTrans.g:9037:1: rule__Elifs__EAssignment_1 : ( ruleElif ) ;
    public final void rule__Elifs__EAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9041:1: ( ( ruleElif ) )
            // InternalFortXTrans.g:9042:2: ( ruleElif )
            {
            // InternalFortXTrans.g:9042:2: ( ruleElif )
            // InternalFortXTrans.g:9043:3: ruleElif
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
    // InternalFortXTrans.g:9052:1: rule__Elif__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__Elif__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9056:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:9057:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:9057:2: ( ruleExpr )
            // InternalFortXTrans.g:9058:3: ruleExpr
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
    // InternalFortXTrans.g:9067:1: rule__Elif__BlockAssignment_3 : ( ruleBlockElems ) ;
    public final void rule__Elif__BlockAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9071:1: ( ( ruleBlockElems ) )
            // InternalFortXTrans.g:9072:2: ( ruleBlockElems )
            {
            // InternalFortXTrans.g:9072:2: ( ruleBlockElems )
            // InternalFortXTrans.g:9073:3: ruleBlockElems
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
    // InternalFortXTrans.g:9082:1: rule__Else__BlockAssignment_1 : ( ruleBlockElems ) ;
    public final void rule__Else__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9086:1: ( ( ruleBlockElems ) )
            // InternalFortXTrans.g:9087:2: ( ruleBlockElems )
            {
            // InternalFortXTrans.g:9087:2: ( ruleBlockElems )
            // InternalFortXTrans.g:9088:3: ruleBlockElems
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
    // InternalFortXTrans.g:9097:1: rule__Generators__BindingAssignment_0 : ( ruleBinding ) ;
    public final void rule__Generators__BindingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9101:1: ( ( ruleBinding ) )
            // InternalFortXTrans.g:9102:2: ( ruleBinding )
            {
            // InternalFortXTrans.g:9102:2: ( ruleBinding )
            // InternalFortXTrans.g:9103:3: ruleBinding
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
    // InternalFortXTrans.g:9112:1: rule__Generators__ClauseAssignment_1_1 : ( ruleGenClause ) ;
    public final void rule__Generators__ClauseAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9116:1: ( ( ruleGenClause ) )
            // InternalFortXTrans.g:9117:2: ( ruleGenClause )
            {
            // InternalFortXTrans.g:9117:2: ( ruleGenClause )
            // InternalFortXTrans.g:9118:3: ruleGenClause
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
    // InternalFortXTrans.g:9127:1: rule__Binding__IdtupAssignment_0_0 : ( ruleIdOrTuple ) ;
    public final void rule__Binding__IdtupAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9131:1: ( ( ruleIdOrTuple ) )
            // InternalFortXTrans.g:9132:2: ( ruleIdOrTuple )
            {
            // InternalFortXTrans.g:9132:2: ( ruleIdOrTuple )
            // InternalFortXTrans.g:9133:3: ruleIdOrTuple
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
    // InternalFortXTrans.g:9142:1: rule__Binding__ExprAssignment_0_2 : ( ruleExpr ) ;
    public final void rule__Binding__ExprAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9146:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:9147:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:9147:2: ( ruleExpr )
            // InternalFortXTrans.g:9148:3: ruleExpr
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
    // InternalFortXTrans.g:9157:1: rule__Binding__IdtupAssignment_1_0 : ( ruleIdOrTuple ) ;
    public final void rule__Binding__IdtupAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9161:1: ( ( ruleIdOrTuple ) )
            // InternalFortXTrans.g:9162:2: ( ruleIdOrTuple )
            {
            // InternalFortXTrans.g:9162:2: ( ruleIdOrTuple )
            // InternalFortXTrans.g:9163:3: ruleIdOrTuple
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
    // InternalFortXTrans.g:9172:1: rule__Binding__SeqAssignment_1_2 : ( ( 'seq' ) ) ;
    public final void rule__Binding__SeqAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9176:1: ( ( ( 'seq' ) ) )
            // InternalFortXTrans.g:9177:2: ( ( 'seq' ) )
            {
            // InternalFortXTrans.g:9177:2: ( ( 'seq' ) )
            // InternalFortXTrans.g:9178:3: ( 'seq' )
            {
             before(grammarAccess.getBindingAccess().getSeqSeqKeyword_1_2_0()); 
            // InternalFortXTrans.g:9179:3: ( 'seq' )
            // InternalFortXTrans.g:9180:4: 'seq'
            {
             before(grammarAccess.getBindingAccess().getSeqSeqKeyword_1_2_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalFortXTrans.g:9191:1: rule__Binding__ExprAssignment_1_4 : ( ruleExpr ) ;
    public final void rule__Binding__ExprAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9195:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:9196:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:9196:2: ( ruleExpr )
            // InternalFortXTrans.g:9197:3: ruleExpr
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
    // InternalFortXTrans.g:9206:1: rule__GenClause__BindingAssignment_0 : ( ruleBinding ) ;
    public final void rule__GenClause__BindingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9210:1: ( ( ruleBinding ) )
            // InternalFortXTrans.g:9211:2: ( ruleBinding )
            {
            // InternalFortXTrans.g:9211:2: ( ruleBinding )
            // InternalFortXTrans.g:9212:3: ruleBinding
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
    // InternalFortXTrans.g:9221:1: rule__GenClause__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__GenClause__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9225:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:9226:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:9226:2: ( ruleExpr )
            // InternalFortXTrans.g:9227:3: ruleExpr
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
    // InternalFortXTrans.g:9236:1: rule__BlockElems__BlockAssignment_0 : ( ruleBlockElem ) ;
    public final void rule__BlockElems__BlockAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9240:1: ( ( ruleBlockElem ) )
            // InternalFortXTrans.g:9241:2: ( ruleBlockElem )
            {
            // InternalFortXTrans.g:9241:2: ( ruleBlockElem )
            // InternalFortXTrans.g:9242:3: ruleBlockElem
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
    // InternalFortXTrans.g:9251:1: rule__BlockElems__BlockAssignment_1 : ( ruleBlockElem ) ;
    public final void rule__BlockElems__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9255:1: ( ( ruleBlockElem ) )
            // InternalFortXTrans.g:9256:2: ( ruleBlockElem )
            {
            // InternalFortXTrans.g:9256:2: ( ruleBlockElem )
            // InternalFortXTrans.g:9257:3: ruleBlockElem
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
    // InternalFortXTrans.g:9266:1: rule__BlockElem__ExpAssignment : ( ruleExpr ) ;
    public final void rule__BlockElem__ExpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9270:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:9271:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:9271:2: ( ruleExpr )
            // InternalFortXTrans.g:9272:3: ruleExpr
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
    // InternalFortXTrans.g:9281:1: rule__Paranthesized__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__Paranthesized__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9285:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:9286:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:9286:2: ( ruleExpr )
            // InternalFortXTrans.g:9287:3: ruleExpr
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
    // InternalFortXTrans.g:9296:1: rule__Do__DofsAssignment_0 : ( ruleDoFront ) ;
    public final void rule__Do__DofsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9300:1: ( ( ruleDoFront ) )
            // InternalFortXTrans.g:9301:2: ( ruleDoFront )
            {
            // InternalFortXTrans.g:9301:2: ( ruleDoFront )
            // InternalFortXTrans.g:9302:3: ruleDoFront
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
    // InternalFortXTrans.g:9311:1: rule__Do__DofsAssignment_1_1 : ( ruleDoFront ) ;
    public final void rule__Do__DofsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9315:1: ( ( ruleDoFront ) )
            // InternalFortXTrans.g:9316:2: ( ruleDoFront )
            {
            // InternalFortXTrans.g:9316:2: ( ruleDoFront )
            // InternalFortXTrans.g:9317:3: ruleDoFront
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
    // InternalFortXTrans.g:9326:1: rule__DoFront__AtAssignment_0_0 : ( ( 'at' ) ) ;
    public final void rule__DoFront__AtAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9330:1: ( ( ( 'at' ) ) )
            // InternalFortXTrans.g:9331:2: ( ( 'at' ) )
            {
            // InternalFortXTrans.g:9331:2: ( ( 'at' ) )
            // InternalFortXTrans.g:9332:3: ( 'at' )
            {
             before(grammarAccess.getDoFrontAccess().getAtAtKeyword_0_0_0()); 
            // InternalFortXTrans.g:9333:3: ( 'at' )
            // InternalFortXTrans.g:9334:4: 'at'
            {
             before(grammarAccess.getDoFrontAccess().getAtAtKeyword_0_0_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalFortXTrans.g:9345:1: rule__DoFront__ExpAssignment_0_1 : ( ruleExpr ) ;
    public final void rule__DoFront__ExpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9349:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:9350:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:9350:2: ( ruleExpr )
            // InternalFortXTrans.g:9351:3: ruleExpr
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
    // InternalFortXTrans.g:9360:1: rule__DoFront__AtomAssignment_1 : ( ( 'atomic' ) ) ;
    public final void rule__DoFront__AtomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9364:1: ( ( ( 'atomic' ) ) )
            // InternalFortXTrans.g:9365:2: ( ( 'atomic' ) )
            {
            // InternalFortXTrans.g:9365:2: ( ( 'atomic' ) )
            // InternalFortXTrans.g:9366:3: ( 'atomic' )
            {
             before(grammarAccess.getDoFrontAccess().getAtomAtomicKeyword_1_0()); 
            // InternalFortXTrans.g:9367:3: ( 'atomic' )
            // InternalFortXTrans.g:9368:4: 'atomic'
            {
             before(grammarAccess.getDoFrontAccess().getAtomAtomicKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalFortXTrans.g:9379:1: rule__DoFront__BlockAssignment_3 : ( ruleBlockElems ) ;
    public final void rule__DoFront__BlockAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9383:1: ( ( ruleBlockElems ) )
            // InternalFortXTrans.g:9384:2: ( ruleBlockElems )
            {
            // InternalFortXTrans.g:9384:2: ( ruleBlockElems )
            // InternalFortXTrans.g:9385:3: ruleBlockElems
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
    // InternalFortXTrans.g:9394:1: rule__IdOrTuple__BidAssignment_0 : ( ruleBindId ) ;
    public final void rule__IdOrTuple__BidAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9398:1: ( ( ruleBindId ) )
            // InternalFortXTrans.g:9399:2: ( ruleBindId )
            {
            // InternalFortXTrans.g:9399:2: ( ruleBindId )
            // InternalFortXTrans.g:9400:3: ruleBindId
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
    // InternalFortXTrans.g:9409:1: rule__IdOrTuple__BidAssignment_1_1 : ( ruleBindId ) ;
    public final void rule__IdOrTuple__BidAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9413:1: ( ( ruleBindId ) )
            // InternalFortXTrans.g:9414:2: ( ruleBindId )
            {
            // InternalFortXTrans.g:9414:2: ( ruleBindId )
            // InternalFortXTrans.g:9415:3: ruleBindId
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
    // InternalFortXTrans.g:9424:1: rule__IdOrTuple__BidAssignment_1_2_1 : ( ruleBindId ) ;
    public final void rule__IdOrTuple__BidAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9428:1: ( ( ruleBindId ) )
            // InternalFortXTrans.g:9429:2: ( ruleBindId )
            {
            // InternalFortXTrans.g:9429:2: ( ruleBindId )
            // InternalFortXTrans.g:9430:3: ruleBindId
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
    // InternalFortXTrans.g:9439:1: rule__IsType__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__IsType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9443:1: ( ( ruleType ) )
            // InternalFortXTrans.g:9444:2: ( ruleType )
            {
            // InternalFortXTrans.g:9444:2: ( ruleType )
            // InternalFortXTrans.g:9445:3: ruleType
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


    // $ANTLR start "rule__FieldDecl__PriAssignment_0_0"
    // InternalFortXTrans.g:9454:1: rule__FieldDecl__PriAssignment_0_0 : ( ( 'private' ) ) ;
    public final void rule__FieldDecl__PriAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9458:1: ( ( ( 'private' ) ) )
            // InternalFortXTrans.g:9459:2: ( ( 'private' ) )
            {
            // InternalFortXTrans.g:9459:2: ( ( 'private' ) )
            // InternalFortXTrans.g:9460:3: ( 'private' )
            {
             before(grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_0_0_0()); 
            // InternalFortXTrans.g:9461:3: ( 'private' )
            // InternalFortXTrans.g:9462:4: 'private'
            {
             before(grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_0_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_0_0_0()); 

            }

             after(grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__PriAssignment_0_0"


    // $ANTLR start "rule__FieldDecl__MutAssignment_0_1"
    // InternalFortXTrans.g:9473:1: rule__FieldDecl__MutAssignment_0_1 : ( ( 'var' ) ) ;
    public final void rule__FieldDecl__MutAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9477:1: ( ( ( 'var' ) ) )
            // InternalFortXTrans.g:9478:2: ( ( 'var' ) )
            {
            // InternalFortXTrans.g:9478:2: ( ( 'var' ) )
            // InternalFortXTrans.g:9479:3: ( 'var' )
            {
             before(grammarAccess.getFieldDeclAccess().getMutVarKeyword_0_1_0()); 
            // InternalFortXTrans.g:9480:3: ( 'var' )
            // InternalFortXTrans.g:9481:4: 'var'
            {
             before(grammarAccess.getFieldDeclAccess().getMutVarKeyword_0_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getFieldDeclAccess().getMutVarKeyword_0_1_0()); 

            }

             after(grammarAccess.getFieldDeclAccess().getMutVarKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__MutAssignment_0_1"


    // $ANTLR start "rule__FieldDecl__VarsAssignment_0_2"
    // InternalFortXTrans.g:9492:1: rule__FieldDecl__VarsAssignment_0_2 : ( ruleNoNewlineVarWTypes ) ;
    public final void rule__FieldDecl__VarsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9496:1: ( ( ruleNoNewlineVarWTypes ) )
            // InternalFortXTrans.g:9497:2: ( ruleNoNewlineVarWTypes )
            {
            // InternalFortXTrans.g:9497:2: ( ruleNoNewlineVarWTypes )
            // InternalFortXTrans.g:9498:3: ruleNoNewlineVarWTypes
            {
             before(grammarAccess.getFieldDeclAccess().getVarsNoNewlineVarWTypesParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNoNewlineVarWTypes();

            state._fsp--;

             after(grammarAccess.getFieldDeclAccess().getVarsNoNewlineVarWTypesParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__VarsAssignment_0_2"


    // $ANTLR start "rule__FieldDecl__InitAssignment_0_3"
    // InternalFortXTrans.g:9507:1: rule__FieldDecl__InitAssignment_0_3 : ( ruleInitVal ) ;
    public final void rule__FieldDecl__InitAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9511:1: ( ( ruleInitVal ) )
            // InternalFortXTrans.g:9512:2: ( ruleInitVal )
            {
            // InternalFortXTrans.g:9512:2: ( ruleInitVal )
            // InternalFortXTrans.g:9513:3: ruleInitVal
            {
             before(grammarAccess.getFieldDeclAccess().getInitInitValParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInitVal();

            state._fsp--;

             after(grammarAccess.getFieldDeclAccess().getInitInitValParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__InitAssignment_0_3"


    // $ANTLR start "rule__FieldDecl__PriAssignment_1_0"
    // InternalFortXTrans.g:9522:1: rule__FieldDecl__PriAssignment_1_0 : ( ( 'private' ) ) ;
    public final void rule__FieldDecl__PriAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9526:1: ( ( ( 'private' ) ) )
            // InternalFortXTrans.g:9527:2: ( ( 'private' ) )
            {
            // InternalFortXTrans.g:9527:2: ( ( 'private' ) )
            // InternalFortXTrans.g:9528:3: ( 'private' )
            {
             before(grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_1_0_0()); 
            // InternalFortXTrans.g:9529:3: ( 'private' )
            // InternalFortXTrans.g:9530:4: 'private'
            {
             before(grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_1_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_1_0_0()); 

            }

             after(grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__PriAssignment_1_0"


    // $ANTLR start "rule__FieldDecl__IdtupAssignment_1_1"
    // InternalFortXTrans.g:9541:1: rule__FieldDecl__IdtupAssignment_1_1 : ( ruleIdOrTuple ) ;
    public final void rule__FieldDecl__IdtupAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9545:1: ( ( ruleIdOrTuple ) )
            // InternalFortXTrans.g:9546:2: ( ruleIdOrTuple )
            {
            // InternalFortXTrans.g:9546:2: ( ruleIdOrTuple )
            // InternalFortXTrans.g:9547:3: ruleIdOrTuple
            {
             before(grammarAccess.getFieldDeclAccess().getIdtupIdOrTupleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIdOrTuple();

            state._fsp--;

             after(grammarAccess.getFieldDeclAccess().getIdtupIdOrTupleParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__IdtupAssignment_1_1"


    // $ANTLR start "rule__FieldDecl__LitTupAssignment_1_3"
    // InternalFortXTrans.g:9556:1: rule__FieldDecl__LitTupAssignment_1_3 : ( ruleLiteralTuple ) ;
    public final void rule__FieldDecl__LitTupAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9560:1: ( ( ruleLiteralTuple ) )
            // InternalFortXTrans.g:9561:2: ( ruleLiteralTuple )
            {
            // InternalFortXTrans.g:9561:2: ( ruleLiteralTuple )
            // InternalFortXTrans.g:9562:3: ruleLiteralTuple
            {
             before(grammarAccess.getFieldDeclAccess().getLitTupLiteralTupleParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteralTuple();

            state._fsp--;

             after(grammarAccess.getFieldDeclAccess().getLitTupLiteralTupleParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__LitTupAssignment_1_3"


    // $ANTLR start "rule__FieldDecl__PriAssignment_2_0"
    // InternalFortXTrans.g:9571:1: rule__FieldDecl__PriAssignment_2_0 : ( ( 'private' ) ) ;
    public final void rule__FieldDecl__PriAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9575:1: ( ( ( 'private' ) ) )
            // InternalFortXTrans.g:9576:2: ( ( 'private' ) )
            {
            // InternalFortXTrans.g:9576:2: ( ( 'private' ) )
            // InternalFortXTrans.g:9577:3: ( 'private' )
            {
             before(grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_2_0_0()); 
            // InternalFortXTrans.g:9578:3: ( 'private' )
            // InternalFortXTrans.g:9579:4: 'private'
            {
             before(grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_2_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_2_0_0()); 

            }

             after(grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__PriAssignment_2_0"


    // $ANTLR start "rule__FieldDecl__MutAssignment_2_1"
    // InternalFortXTrans.g:9590:1: rule__FieldDecl__MutAssignment_2_1 : ( ( 'var' ) ) ;
    public final void rule__FieldDecl__MutAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9594:1: ( ( ( 'var' ) ) )
            // InternalFortXTrans.g:9595:2: ( ( 'var' ) )
            {
            // InternalFortXTrans.g:9595:2: ( ( 'var' ) )
            // InternalFortXTrans.g:9596:3: ( 'var' )
            {
             before(grammarAccess.getFieldDeclAccess().getMutVarKeyword_2_1_0()); 
            // InternalFortXTrans.g:9597:3: ( 'var' )
            // InternalFortXTrans.g:9598:4: 'var'
            {
             before(grammarAccess.getFieldDeclAccess().getMutVarKeyword_2_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getFieldDeclAccess().getMutVarKeyword_2_1_0()); 

            }

             after(grammarAccess.getFieldDeclAccess().getMutVarKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__MutAssignment_2_1"


    // $ANTLR start "rule__FieldDecl__IdtupAssignment_2_2"
    // InternalFortXTrans.g:9609:1: rule__FieldDecl__IdtupAssignment_2_2 : ( ruleIdOrTuple ) ;
    public final void rule__FieldDecl__IdtupAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9613:1: ( ( ruleIdOrTuple ) )
            // InternalFortXTrans.g:9614:2: ( ruleIdOrTuple )
            {
            // InternalFortXTrans.g:9614:2: ( ruleIdOrTuple )
            // InternalFortXTrans.g:9615:3: ruleIdOrTuple
            {
             before(grammarAccess.getFieldDeclAccess().getIdtupIdOrTupleParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIdOrTuple();

            state._fsp--;

             after(grammarAccess.getFieldDeclAccess().getIdtupIdOrTupleParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__IdtupAssignment_2_2"


    // $ANTLR start "rule__FieldDecl__TypeAssignment_2_4"
    // InternalFortXTrans.g:9624:1: rule__FieldDecl__TypeAssignment_2_4 : ( ruleType ) ;
    public final void rule__FieldDecl__TypeAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9628:1: ( ( ruleType ) )
            // InternalFortXTrans.g:9629:2: ( ruleType )
            {
            // InternalFortXTrans.g:9629:2: ( ruleType )
            // InternalFortXTrans.g:9630:3: ruleType
            {
             before(grammarAccess.getFieldDeclAccess().getTypeTypeParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFieldDeclAccess().getTypeTypeParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__TypeAssignment_2_4"


    // $ANTLR start "rule__FieldDecl__InitAssignment_2_6"
    // InternalFortXTrans.g:9639:1: rule__FieldDecl__InitAssignment_2_6 : ( ruleInitVal ) ;
    public final void rule__FieldDecl__InitAssignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9643:1: ( ( ruleInitVal ) )
            // InternalFortXTrans.g:9644:2: ( ruleInitVal )
            {
            // InternalFortXTrans.g:9644:2: ( ruleInitVal )
            // InternalFortXTrans.g:9645:3: ruleInitVal
            {
             before(grammarAccess.getFieldDeclAccess().getInitInitValParserRuleCall_2_6_0()); 
            pushFollow(FOLLOW_2);
            ruleInitVal();

            state._fsp--;

             after(grammarAccess.getFieldDeclAccess().getInitInitValParserRuleCall_2_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__InitAssignment_2_6"


    // $ANTLR start "rule__FieldDecl__PriAssignment_3_0"
    // InternalFortXTrans.g:9654:1: rule__FieldDecl__PriAssignment_3_0 : ( ( 'private' ) ) ;
    public final void rule__FieldDecl__PriAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9658:1: ( ( ( 'private' ) ) )
            // InternalFortXTrans.g:9659:2: ( ( 'private' ) )
            {
            // InternalFortXTrans.g:9659:2: ( ( 'private' ) )
            // InternalFortXTrans.g:9660:3: ( 'private' )
            {
             before(grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_3_0_0()); 
            // InternalFortXTrans.g:9661:3: ( 'private' )
            // InternalFortXTrans.g:9662:4: 'private'
            {
             before(grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_3_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_3_0_0()); 

            }

             after(grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__PriAssignment_3_0"


    // $ANTLR start "rule__FieldDecl__MutAssignment_3_1"
    // InternalFortXTrans.g:9673:1: rule__FieldDecl__MutAssignment_3_1 : ( ( 'var' ) ) ;
    public final void rule__FieldDecl__MutAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9677:1: ( ( ( 'var' ) ) )
            // InternalFortXTrans.g:9678:2: ( ( 'var' ) )
            {
            // InternalFortXTrans.g:9678:2: ( ( 'var' ) )
            // InternalFortXTrans.g:9679:3: ( 'var' )
            {
             before(grammarAccess.getFieldDeclAccess().getMutVarKeyword_3_1_0()); 
            // InternalFortXTrans.g:9680:3: ( 'var' )
            // InternalFortXTrans.g:9681:4: 'var'
            {
             before(grammarAccess.getFieldDeclAccess().getMutVarKeyword_3_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getFieldDeclAccess().getMutVarKeyword_3_1_0()); 

            }

             after(grammarAccess.getFieldDeclAccess().getMutVarKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__MutAssignment_3_1"


    // $ANTLR start "rule__FieldDecl__IdtupAssignment_3_2"
    // InternalFortXTrans.g:9692:1: rule__FieldDecl__IdtupAssignment_3_2 : ( ruleIdOrTuple ) ;
    public final void rule__FieldDecl__IdtupAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9696:1: ( ( ruleIdOrTuple ) )
            // InternalFortXTrans.g:9697:2: ( ruleIdOrTuple )
            {
            // InternalFortXTrans.g:9697:2: ( ruleIdOrTuple )
            // InternalFortXTrans.g:9698:3: ruleIdOrTuple
            {
             before(grammarAccess.getFieldDeclAccess().getIdtupIdOrTupleParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIdOrTuple();

            state._fsp--;

             after(grammarAccess.getFieldDeclAccess().getIdtupIdOrTupleParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__IdtupAssignment_3_2"


    // $ANTLR start "rule__FieldDecl__TuptypeAssignment_3_4"
    // InternalFortXTrans.g:9707:1: rule__FieldDecl__TuptypeAssignment_3_4 : ( ruleTupleType ) ;
    public final void rule__FieldDecl__TuptypeAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9711:1: ( ( ruleTupleType ) )
            // InternalFortXTrans.g:9712:2: ( ruleTupleType )
            {
            // InternalFortXTrans.g:9712:2: ( ruleTupleType )
            // InternalFortXTrans.g:9713:3: ruleTupleType
            {
             before(grammarAccess.getFieldDeclAccess().getTuptypeTupleTypeParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTupleType();

            state._fsp--;

             after(grammarAccess.getFieldDeclAccess().getTuptypeTupleTypeParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__TuptypeAssignment_3_4"


    // $ANTLR start "rule__FieldDecl__InitAssignment_3_5"
    // InternalFortXTrans.g:9722:1: rule__FieldDecl__InitAssignment_3_5 : ( ruleInitVal ) ;
    public final void rule__FieldDecl__InitAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9726:1: ( ( ruleInitVal ) )
            // InternalFortXTrans.g:9727:2: ( ruleInitVal )
            {
            // InternalFortXTrans.g:9727:2: ( ruleInitVal )
            // InternalFortXTrans.g:9728:3: ruleInitVal
            {
             before(grammarAccess.getFieldDeclAccess().getInitInitValParserRuleCall_3_5_0()); 
            pushFollow(FOLLOW_2);
            ruleInitVal();

            state._fsp--;

             after(grammarAccess.getFieldDeclAccess().getInitInitValParserRuleCall_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__InitAssignment_3_5"


    // $ANTLR start "rule__NoNewlineVarWTypes__SingleAssignment_0"
    // InternalFortXTrans.g:9737:1: rule__NoNewlineVarWTypes__SingleAssignment_0 : ( ruleNoNewlineVarWType ) ;
    public final void rule__NoNewlineVarWTypes__SingleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9741:1: ( ( ruleNoNewlineVarWType ) )
            // InternalFortXTrans.g:9742:2: ( ruleNoNewlineVarWType )
            {
            // InternalFortXTrans.g:9742:2: ( ruleNoNewlineVarWType )
            // InternalFortXTrans.g:9743:3: ruleNoNewlineVarWType
            {
             before(grammarAccess.getNoNewlineVarWTypesAccess().getSingleNoNewlineVarWTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNoNewlineVarWType();

            state._fsp--;

             after(grammarAccess.getNoNewlineVarWTypesAccess().getSingleNoNewlineVarWTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoNewlineVarWTypes__SingleAssignment_0"


    // $ANTLR start "rule__NoNewlineVarWTypes__MultipleAssignment_1_1"
    // InternalFortXTrans.g:9752:1: rule__NoNewlineVarWTypes__MultipleAssignment_1_1 : ( ruleNoNewlineVarWType ) ;
    public final void rule__NoNewlineVarWTypes__MultipleAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9756:1: ( ( ruleNoNewlineVarWType ) )
            // InternalFortXTrans.g:9757:2: ( ruleNoNewlineVarWType )
            {
            // InternalFortXTrans.g:9757:2: ( ruleNoNewlineVarWType )
            // InternalFortXTrans.g:9758:3: ruleNoNewlineVarWType
            {
             before(grammarAccess.getNoNewlineVarWTypesAccess().getMultipleNoNewlineVarWTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNoNewlineVarWType();

            state._fsp--;

             after(grammarAccess.getNoNewlineVarWTypesAccess().getMultipleNoNewlineVarWTypeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoNewlineVarWTypes__MultipleAssignment_1_1"


    // $ANTLR start "rule__NoNewlineVarWTypes__MultipleAssignment_1_2_1"
    // InternalFortXTrans.g:9767:1: rule__NoNewlineVarWTypes__MultipleAssignment_1_2_1 : ( ruleNoNewlineVarWType ) ;
    public final void rule__NoNewlineVarWTypes__MultipleAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9771:1: ( ( ruleNoNewlineVarWType ) )
            // InternalFortXTrans.g:9772:2: ( ruleNoNewlineVarWType )
            {
            // InternalFortXTrans.g:9772:2: ( ruleNoNewlineVarWType )
            // InternalFortXTrans.g:9773:3: ruleNoNewlineVarWType
            {
             before(grammarAccess.getNoNewlineVarWTypesAccess().getMultipleNoNewlineVarWTypeParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNoNewlineVarWType();

            state._fsp--;

             after(grammarAccess.getNoNewlineVarWTypesAccess().getMultipleNoNewlineVarWTypeParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoNewlineVarWTypes__MultipleAssignment_1_2_1"


    // $ANTLR start "rule__NoNewlineVarWType__BidAssignment_0"
    // InternalFortXTrans.g:9782:1: rule__NoNewlineVarWType__BidAssignment_0 : ( ruleBindId ) ;
    public final void rule__NoNewlineVarWType__BidAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9786:1: ( ( ruleBindId ) )
            // InternalFortXTrans.g:9787:2: ( ruleBindId )
            {
            // InternalFortXTrans.g:9787:2: ( ruleBindId )
            // InternalFortXTrans.g:9788:3: ruleBindId
            {
             before(grammarAccess.getNoNewlineVarWTypeAccess().getBidBindIdParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBindId();

            state._fsp--;

             after(grammarAccess.getNoNewlineVarWTypeAccess().getBidBindIdParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoNewlineVarWType__BidAssignment_0"


    // $ANTLR start "rule__NoNewlineVarWType__IstypeAssignment_1"
    // InternalFortXTrans.g:9797:1: rule__NoNewlineVarWType__IstypeAssignment_1 : ( ruleIsType ) ;
    public final void rule__NoNewlineVarWType__IstypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9801:1: ( ( ruleIsType ) )
            // InternalFortXTrans.g:9802:2: ( ruleIsType )
            {
            // InternalFortXTrans.g:9802:2: ( ruleIsType )
            // InternalFortXTrans.g:9803:3: ruleIsType
            {
             before(grammarAccess.getNoNewlineVarWTypeAccess().getIstypeIsTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIsType();

            state._fsp--;

             after(grammarAccess.getNoNewlineVarWTypeAccess().getIstypeIsTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoNewlineVarWType__IstypeAssignment_1"


    // $ANTLR start "rule__InitVal__MutAssignment_0_0"
    // InternalFortXTrans.g:9812:1: rule__InitVal__MutAssignment_0_0 : ( ( ':=' ) ) ;
    public final void rule__InitVal__MutAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9816:1: ( ( ( ':=' ) ) )
            // InternalFortXTrans.g:9817:2: ( ( ':=' ) )
            {
            // InternalFortXTrans.g:9817:2: ( ( ':=' ) )
            // InternalFortXTrans.g:9818:3: ( ':=' )
            {
             before(grammarAccess.getInitValAccess().getMutColonEqualsSignKeyword_0_0_0()); 
            // InternalFortXTrans.g:9819:3: ( ':=' )
            // InternalFortXTrans.g:9820:4: ':='
            {
             before(grammarAccess.getInitValAccess().getMutColonEqualsSignKeyword_0_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getInitValAccess().getMutColonEqualsSignKeyword_0_0_0()); 

            }

             after(grammarAccess.getInitValAccess().getMutColonEqualsSignKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitVal__MutAssignment_0_0"


    // $ANTLR start "rule__InitVal__LitAssignment_0_1"
    // InternalFortXTrans.g:9831:1: rule__InitVal__LitAssignment_0_1 : ( ruleLiteralTuple ) ;
    public final void rule__InitVal__LitAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9835:1: ( ( ruleLiteralTuple ) )
            // InternalFortXTrans.g:9836:2: ( ruleLiteralTuple )
            {
            // InternalFortXTrans.g:9836:2: ( ruleLiteralTuple )
            // InternalFortXTrans.g:9837:3: ruleLiteralTuple
            {
             before(grammarAccess.getInitValAccess().getLitLiteralTupleParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteralTuple();

            state._fsp--;

             after(grammarAccess.getInitValAccess().getLitLiteralTupleParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitVal__LitAssignment_0_1"


    // $ANTLR start "rule__InitVal__ImmutAssignment_1_0"
    // InternalFortXTrans.g:9846:1: rule__InitVal__ImmutAssignment_1_0 : ( ( '=' ) ) ;
    public final void rule__InitVal__ImmutAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9850:1: ( ( ( '=' ) ) )
            // InternalFortXTrans.g:9851:2: ( ( '=' ) )
            {
            // InternalFortXTrans.g:9851:2: ( ( '=' ) )
            // InternalFortXTrans.g:9852:3: ( '=' )
            {
             before(grammarAccess.getInitValAccess().getImmutEqualsSignKeyword_1_0_0()); 
            // InternalFortXTrans.g:9853:3: ( '=' )
            // InternalFortXTrans.g:9854:4: '='
            {
             before(grammarAccess.getInitValAccess().getImmutEqualsSignKeyword_1_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getInitValAccess().getImmutEqualsSignKeyword_1_0_0()); 

            }

             after(grammarAccess.getInitValAccess().getImmutEqualsSignKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitVal__ImmutAssignment_1_0"


    // $ANTLR start "rule__InitVal__LitAssignment_1_1"
    // InternalFortXTrans.g:9865:1: rule__InitVal__LitAssignment_1_1 : ( ruleLiteralTuple ) ;
    public final void rule__InitVal__LitAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9869:1: ( ( ruleLiteralTuple ) )
            // InternalFortXTrans.g:9870:2: ( ruleLiteralTuple )
            {
            // InternalFortXTrans.g:9870:2: ( ruleLiteralTuple )
            // InternalFortXTrans.g:9871:3: ruleLiteralTuple
            {
             before(grammarAccess.getInitValAccess().getLitLiteralTupleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteralTuple();

            state._fsp--;

             after(grammarAccess.getInitValAccess().getLitLiteralTupleParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitVal__LitAssignment_1_1"


    // $ANTLR start "rule__LiteralTuple__LitAssignment_0"
    // InternalFortXTrans.g:9880:1: rule__LiteralTuple__LitAssignment_0 : ( ruleLiteral ) ;
    public final void rule__LiteralTuple__LitAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9884:1: ( ( ruleLiteral ) )
            // InternalFortXTrans.g:9885:2: ( ruleLiteral )
            {
            // InternalFortXTrans.g:9885:2: ( ruleLiteral )
            // InternalFortXTrans.g:9886:3: ruleLiteral
            {
             before(grammarAccess.getLiteralTupleAccess().getLitLiteralParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralTupleAccess().getLitLiteralParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralTuple__LitAssignment_0"


    // $ANTLR start "rule__LiteralTuple__LitsAssignment_1_1"
    // InternalFortXTrans.g:9895:1: rule__LiteralTuple__LitsAssignment_1_1 : ( ruleLiteral ) ;
    public final void rule__LiteralTuple__LitsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9899:1: ( ( ruleLiteral ) )
            // InternalFortXTrans.g:9900:2: ( ruleLiteral )
            {
            // InternalFortXTrans.g:9900:2: ( ruleLiteral )
            // InternalFortXTrans.g:9901:3: ruleLiteral
            {
             before(grammarAccess.getLiteralTupleAccess().getLitsLiteralParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralTupleAccess().getLitsLiteralParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralTuple__LitsAssignment_1_1"


    // $ANTLR start "rule__LiteralTuple__LitsAssignment_1_2_1"
    // InternalFortXTrans.g:9910:1: rule__LiteralTuple__LitsAssignment_1_2_1 : ( ruleLiteral ) ;
    public final void rule__LiteralTuple__LitsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9914:1: ( ( ruleLiteral ) )
            // InternalFortXTrans.g:9915:2: ( ruleLiteral )
            {
            // InternalFortXTrans.g:9915:2: ( ruleLiteral )
            // InternalFortXTrans.g:9916:3: ruleLiteral
            {
             before(grammarAccess.getLiteralTupleAccess().getLitsLiteralParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralTupleAccess().getLitsLiteralParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralTuple__LitsAssignment_1_2_1"


    // $ANTLR start "rule__Literal__IntgAssignment_0"
    // InternalFortXTrans.g:9925:1: rule__Literal__IntgAssignment_0 : ( RULE_INT ) ;
    public final void rule__Literal__IntgAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9929:1: ( ( RULE_INT ) )
            // InternalFortXTrans.g:9930:2: ( RULE_INT )
            {
            // InternalFortXTrans.g:9930:2: ( RULE_INT )
            // InternalFortXTrans.g:9931:3: RULE_INT
            {
             before(grammarAccess.getLiteralAccess().getIntgINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLiteralAccess().getIntgINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__IntgAssignment_0"


    // $ANTLR start "rule__Literal__FlotAssignment_1"
    // InternalFortXTrans.g:9940:1: rule__Literal__FlotAssignment_1 : ( RULE_FLOAT ) ;
    public final void rule__Literal__FlotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9944:1: ( ( RULE_FLOAT ) )
            // InternalFortXTrans.g:9945:2: ( RULE_FLOAT )
            {
            // InternalFortXTrans.g:9945:2: ( RULE_FLOAT )
            // InternalFortXTrans.g:9946:3: RULE_FLOAT
            {
             before(grammarAccess.getLiteralAccess().getFlotFLOATTerminalRuleCall_1_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getLiteralAccess().getFlotFLOATTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__FlotAssignment_1"


    // $ANTLR start "rule__Literal__StrAssignment_2"
    // InternalFortXTrans.g:9955:1: rule__Literal__StrAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Literal__StrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9959:1: ( ( RULE_STRING ) )
            // InternalFortXTrans.g:9960:2: ( RULE_STRING )
            {
            // InternalFortXTrans.g:9960:2: ( RULE_STRING )
            // InternalFortXTrans.g:9961:3: RULE_STRING
            {
             before(grammarAccess.getLiteralAccess().getStrSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLiteralAccess().getStrSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__StrAssignment_2"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String dfa_1s = "\u00bb\uffff";
    static final String dfa_2s = "\1\1\u00ba\uffff";
    static final String dfa_3s = "\1\4\1\uffff\6\4\1\36\6\4\2\36\2\4\1\6\2\36\1\4\2\31\1\4\2\36\1\uffff\1\4\1\5\3\uffff\1\6\2\31\1\4\1\36\1\4\1\uffff\1\4\1\31\1\46\2\6\3\31\1\4\1\36\2\31\1\4\2\31\1\4\1\46\2\6\3\uffff\1\6\3\uffff\2\6\2\31\1\5\2\4\1\31\2\6\3\uffff\1\6\3\uffff\1\6\11\31\4\36\3\uffff\1\6\3\uffff\1\6\6\31\3\6\1\uffff\2\4\6\31\2\6\13\31\2\6\6\31\1\6\1\uffff\1\6\1\uffff\1\4\1\46\6\31\1\6\1\uffff\1\6\1\uffff\6\31\2\36\1\6\1\uffff\1\6\1\uffff\6\31\1\4\7\31";
    static final String dfa_4s = "\1\63\1\uffff\1\63\3\55\1\46\1\37\1\46\1\24\4\55\1\37\2\36\1\35\2\37\2\36\1\24\2\36\1\4\2\36\1\uffff\1\4\1\64\3\uffff\1\10\2\36\1\24\1\46\1\4\1\uffff\1\4\1\35\1\64\2\37\3\31\1\24\1\36\2\35\1\37\1\31\1\35\1\4\1\64\2\37\3\uffff\1\10\3\uffff\2\10\2\35\1\5\2\24\1\35\2\37\3\uffff\1\10\3\uffff\1\10\6\31\3\35\4\36\3\uffff\1\10\3\uffff\1\10\6\31\3\10\1\uffff\2\4\6\31\2\10\13\35\2\10\6\35\1\10\1\uffff\1\10\1\uffff\1\24\1\64\6\35\1\10\1\uffff\1\10\1\uffff\6\35\2\36\1\10\1\uffff\1\10\1\uffff\6\35\1\4\7\35";
    static final String dfa_5s = "\1\uffff\1\2\32\uffff\1\1\2\uffff\3\1\6\uffff\1\1\23\uffff\3\1\1\uffff\3\1\12\uffff\3\1\1\uffff\3\1\16\uffff\3\1\1\uffff\3\1\12\uffff\1\1\36\uffff\1\1\1\uffff\1\1\11\uffff\1\1\1\uffff\1\1\11\uffff\1\1\1\uffff\1\1\16\uffff";
    static final String dfa_6s = "\u00bb\uffff}>";
    static final String[] dfa_7s = {
            "\1\6\17\uffff\1\10\1\uffff\1\1\10\uffff\1\11\12\uffff\1\2\1\3\1\4\1\5\5\uffff\1\7",
            "",
            "\1\6\17\uffff\1\10\12\uffff\1\11\12\uffff\1\12\1\13\1\14\1\15\5\uffff\1\7",
            "\1\16\45\uffff\1\12\1\13\1\14\1\15",
            "\1\16\45\uffff\1\12\1\13\1\14\1\15",
            "\1\16\45\uffff\1\12\1\13\1\14\1\15",
            "\1\17\17\uffff\1\20\11\uffff\1\22\1\21\6\uffff\1\23",
            "\1\24\17\uffff\1\25\12\uffff\1\26",
            "\1\22\7\uffff\1\23",
            "\1\27\17\uffff\1\30",
            "\1\16\45\uffff\1\12\1\13\1\14\1\15",
            "\1\16\45\uffff\1\12\1\13\1\14\1\15",
            "\1\16\45\uffff\1\12\1\13\1\14\1\15",
            "\1\16\45\uffff\1\12\1\13\1\14\1\15",
            "\1\17\17\uffff\1\20\12\uffff\1\21",
            "\1\31",
            "\1\31",
            "\1\32\17\uffff\1\33\10\uffff\1\34",
            "\1\36\32\uffff\1\35",
            "\1\37\1\40\1\41\26\uffff\1\42",
            "\1\22",
            "\1\22",
            "\1\43\17\uffff\1\44",
            "\1\45\3\uffff\1\46\1\47",
            "\1\45\3\uffff\1\46\1\47",
            "\1\50",
            "\1\51",
            "\1\51",
            "",
            "\1\52",
            "\1\53\40\uffff\1\55\15\uffff\1\54",
            "",
            "",
            "",
            "\1\56\1\57\1\60",
            "\1\61\3\uffff\1\62\1\47",
            "\1\61\3\uffff\1\62\1\47",
            "\1\63\17\uffff\1\64",
            "\1\65\7\uffff\1\23",
            "\1\66",
            "",
            "\1\67",
            "\1\70\3\uffff\1\71",
            "\1\73\15\uffff\1\72",
            "\1\74\1\75\1\76\26\uffff\1\77",
            "\1\100\1\101\1\102\26\uffff\1\103",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\105\17\uffff\1\106",
            "\1\65",
            "\1\45\3\uffff\1\46",
            "\1\45\3\uffff\1\46",
            "\1\107\32\uffff\1\35",
            "\1\110",
            "\1\111\3\uffff\1\34",
            "\1\112",
            "\1\114\15\uffff\1\113",
            "\1\115\1\116\1\117\26\uffff\1\120",
            "\1\121\1\122\1\123\26\uffff\1\124",
            "",
            "",
            "",
            "\1\125\1\126\1\127",
            "",
            "",
            "",
            "\1\130\1\131\1\132",
            "\1\133\1\134\1\135",
            "\1\61\3\uffff\1\62",
            "\1\61\3\uffff\1\62",
            "\1\53",
            "\1\136\17\uffff\1\137",
            "\1\140\17\uffff\1\141",
            "\1\70\3\uffff\1\71",
            "\1\142\1\143\1\144\26\uffff\1\145",
            "\1\146\1\147\1\150\26\uffff\1\151",
            "",
            "",
            "",
            "\1\152\1\153\1\154",
            "",
            "",
            "",
            "\1\155\1\156\1\157",
            "\1\160",
            "\1\160",
            "\1\160",
            "\1\161",
            "\1\161",
            "\1\161",
            "\1\162\3\uffff\1\163",
            "\1\162\3\uffff\1\163",
            "\1\162\3\uffff\1\163",
            "\1\164",
            "\1\164",
            "\1\165",
            "\1\165",
            "",
            "",
            "",
            "\1\166\1\167\1\170",
            "",
            "",
            "",
            "\1\171\1\172\1\173",
            "\1\174",
            "\1\174",
            "\1\174",
            "\1\175",
            "\1\175",
            "\1\175",
            "\1\176\1\177\1\u0080",
            "\1\u0081\1\u0082\1\u0083",
            "\1\u0084\1\u0085\1\u0086",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u0089",
            "\1\u0089",
            "\1\u008a",
            "\1\u008a",
            "\1\u008a",
            "\1\u008b\1\u008c\1\u008d",
            "\1\u008e\1\u008f\1\u0090",
            "\1\u0091\3\uffff\1\u0092",
            "\1\u0091\3\uffff\1\u0092",
            "\1\u0091\3\uffff\1\u0092",
            "\1\u0093\3\uffff\1\u0094",
            "\1\u0093\3\uffff\1\u0094",
            "\1\u0093\3\uffff\1\u0094",
            "\1\162\3\uffff\1\163",
            "\1\162\3\uffff\1\163",
            "\1\162\3\uffff\1\163",
            "\1\u0095\3\uffff\1\u0096",
            "\1\111\3\uffff\1\34",
            "\1\u0097\1\u0098\1\u0099",
            "\1\u009a\1\u009b\1\u009c",
            "\1\u009d\3\uffff\1\u009e",
            "\1\u009d\3\uffff\1\u009e",
            "\1\u009d\3\uffff\1\u009e",
            "\1\u009f\3\uffff\1\u00a0",
            "\1\u009f\3\uffff\1\u00a0",
            "\1\u009f\3\uffff\1\u00a0",
            "\1\u00a1\1\u00a2\1\u00a3",
            "",
            "\1\u00a4\1\u00a5\1\u00a6",
            "",
            "\1\u00a7\17\uffff\1\u00a8",
            "\1\55\15\uffff\1\54",
            "\1\u00a9\3\uffff\1\u00aa",
            "\1\u00a9\3\uffff\1\u00aa",
            "\1\u00a9\3\uffff\1\u00aa",
            "\1\u00ab\3\uffff\1\u00ac",
            "\1\u00ab\3\uffff\1\u00ac",
            "\1\u00ab\3\uffff\1\u00ac",
            "\1\u00ad\1\u00ae\1\u00af",
            "",
            "\1\u00b0\1\u00b1\1\u00b2",
            "",
            "\1\u0091\3\uffff\1\u0092",
            "\1\u0091\3\uffff\1\u0092",
            "\1\u0091\3\uffff\1\u0092",
            "\1\u0093\3\uffff\1\u0094",
            "\1\u0093\3\uffff\1\u0094",
            "\1\u0093\3\uffff\1\u0094",
            "\1\u00b3",
            "\1\u00b3",
            "\1\u00b4\1\u00b5\1\u00b6",
            "",
            "\1\u00b7\1\u00b8\1\u00b9",
            "",
            "\1\u009d\3\uffff\1\u009e",
            "\1\u009d\3\uffff\1\u009e",
            "\1\u009d\3\uffff\1\u009e",
            "\1\u009f\3\uffff\1\u00a0",
            "\1\u009f\3\uffff\1\u00a0",
            "\1\u009f\3\uffff\1\u00a0",
            "\1\u00ba",
            "\1\u00a9\3\uffff\1\u00aa",
            "\1\u00a9\3\uffff\1\u00aa",
            "\1\u00a9\3\uffff\1\u00aa",
            "\1\u00ab\3\uffff\1\u00ac",
            "\1\u00ab\3\uffff\1\u00ac",
            "\1\u00ab\3\uffff\1\u00ac",
            "\1\u0095\3\uffff\1\u0096"
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
    static final String dfa_9s = "\1\uffff\2\4\3\uffff\1\4\1\uffff\1\4\2\uffff";
    static final String dfa_10s = "\1\4\1\5\1\26\1\4\1\uffff\1\33\1\5\1\4\1\26\2\uffff";
    static final String dfa_11s = "\1\4\2\50\1\33\1\uffff\1\33\1\50\1\5\1\50\2\uffff";
    static final String dfa_12s = "\4\uffff\1\3\4\uffff\1\1\1\2";
    static final String dfa_13s = "\13\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\2\20\uffff\1\4\3\uffff\1\3\1\uffff\1\4\12\uffff\2\4",
            "\1\4\3\uffff\1\5\1\uffff\1\4\12\uffff\2\4",
            "\1\6\26\uffff\1\7",
            "",
            "\1\7",
            "\1\10\20\uffff\1\4\3\uffff\1\3\1\uffff\1\4\12\uffff\2\4",
            "\1\12\1\11",
            "\1\4\3\uffff\1\5\1\uffff\1\4\12\uffff\2\4",
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
            return "1304:1: rule__ImportedNames__Alternatives : ( ( ( rule__ImportedNames__Group_0__0 ) ) | ( ( rule__ImportedNames__Group_1__0 ) ) | ( ( rule__ImportedNames__Group_2__0 ) ) );";
        }
    }
    static final String dfa_15s = "\7\uffff";
    static final String dfa_16s = "\1\uffff\1\4\3\uffff\1\4\1\uffff";
    static final String dfa_17s = "\2\4\1\uffff\1\4\1\uffff\1\4\1\uffff";
    static final String dfa_18s = "\1\4\1\63\1\uffff\1\4\1\uffff\1\63\1\uffff";
    static final String dfa_19s = "\2\uffff\1\1\1\uffff\1\3\1\uffff\1\2";
    static final String dfa_20s = "\7\uffff}>";
    static final String[] dfa_21s = {
            "\1\1",
            "\1\4\1\2\16\uffff\1\4\1\uffff\1\4\2\uffff\1\4\1\3\1\uffff\2\4\1\uffff\4\4\1\uffff\2\4\4\uffff\7\4\1\uffff\2\4",
            "",
            "\1\5",
            "",
            "\1\4\1\6\16\uffff\1\4\1\uffff\1\4\2\uffff\1\4\1\3\1\uffff\2\4\1\uffff\4\4\1\uffff\2\4\4\uffff\7\4\1\uffff\2\4",
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
            return "1331:1: rule__QualifiedName__Alternatives : ( ( ( rule__QualifiedName__Group_0__0 ) ) | ( ( rule__QualifiedName__Group_1__0 ) ) | ( ( rule__QualifiedName__Group_2__0 ) ) );";
        }
    }
    static final String dfa_22s = "\3\4\2\uffff\1\4\1\uffff";
    static final String dfa_23s = "\1\4\1\63\1\33\2\uffff\1\63\1\uffff";
    static final String dfa_24s = "\3\uffff\1\1\1\3\1\uffff\1\2";
    static final String[] dfa_25s = {
            "\1\1",
            "\1\4\1\3\16\uffff\1\4\1\uffff\1\4\1\uffff\2\4\1\2\1\uffff\1\4\2\uffff\1\4\7\uffff\2\4\1\uffff\4\4\5\uffff\1\4",
            "\1\5\26\uffff\1\4",
            "",
            "",
            "\1\4\1\6\16\uffff\1\4\1\uffff\1\4\1\uffff\2\4\1\2\1\uffff\1\4\2\uffff\1\4\7\uffff\2\4\1\uffff\4\4\5\uffff\1\4",
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
            return "1358:1: rule__APIName__Alternatives : ( ( ( rule__APIName__Group_0__0 ) ) | ( ( rule__APIName__Group_1__0 ) ) | ( ( rule__APIName__Group_2__0 ) ) );";
        }
    }
    static final String dfa_26s = "\15\uffff";
    static final String dfa_27s = "\1\4\2\43\2\4\2\31\2\uffff\1\4\1\43\2\31";
    static final String dfa_28s = "\1\37\2\43\1\24\1\62\2\35\2\uffff\1\24\1\43\2\35";
    static final String dfa_29s = "\7\uffff\1\2\1\1\4\uffff";
    static final String dfa_30s = "\15\uffff}>";
    static final String[] dfa_31s = {
            "\1\1\17\uffff\1\2\12\uffff\1\3",
            "\1\4",
            "\1\4",
            "\1\5\17\uffff\1\6",
            "\1\10\32\uffff\1\10\5\uffff\1\10\6\uffff\1\10\1\uffff\3\10\1\7\1\10",
            "\1\11\3\uffff\1\12",
            "\1\11\3\uffff\1\12",
            "",
            "",
            "\1\13\17\uffff\1\14",
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

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_26;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "1583:1: rule__Binding__Alternatives : ( ( ( rule__Binding__Group_0__0 ) ) | ( ( rule__Binding__Group_1__0 ) ) );";
        }
    }
    static final String dfa_32s = "\34\uffff";
    static final String dfa_33s = "\3\4\2\36\1\4\2\36\2\4\1\uffff\4\31\1\5\1\uffff\1\4\1\36\1\uffff\1\4\1\36\1\uffff\2\31\1\4\2\31";
    static final String dfa_34s = "\2\63\1\37\2\46\1\24\2\36\1\24\1\37\1\uffff\4\36\1\64\1\uffff\1\24\1\46\1\uffff\1\24\1\36\1\uffff\2\35\1\37\2\35";
    static final String dfa_35s = "\12\uffff\1\2\5\uffff\1\4\2\uffff\1\1\2\uffff\1\3\5\uffff";
    static final String dfa_36s = "\34\uffff}>";
    static final String[] dfa_37s = {
            "\1\3\17\uffff\1\4\12\uffff\1\5\12\uffff\1\1\10\uffff\1\2",
            "\1\3\17\uffff\1\4\12\uffff\1\5\23\uffff\1\2",
            "\1\6\17\uffff\1\7\12\uffff\1\10",
            "\1\11\7\uffff\1\12",
            "\1\11\7\uffff\1\12",
            "\1\13\17\uffff\1\14",
            "\1\11",
            "\1\11",
            "\1\15\17\uffff\1\16",
            "\1\17\32\uffff\1\20",
            "",
            "\1\21\3\uffff\1\22\1\23",
            "\1\21\3\uffff\1\22\1\23",
            "\1\24\3\uffff\1\25\1\23",
            "\1\24\3\uffff\1\25\1\23",
            "\1\26\40\uffff\1\23\15\uffff\1\23",
            "",
            "\1\27\17\uffff\1\30",
            "\1\31\7\uffff\1\12",
            "",
            "\1\32\17\uffff\1\33",
            "\1\31",
            "",
            "\1\21\3\uffff\1\22",
            "\1\21\3\uffff\1\22",
            "\1\26\32\uffff\1\20",
            "\1\24\3\uffff\1\25",
            "\1\24\3\uffff\1\25"
    };

    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[][] dfa_37 = unpackEncodedStringArray(dfa_37s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_32;
            this.eof = dfa_32;
            this.min = dfa_33;
            this.max = dfa_34;
            this.accept = dfa_35;
            this.special = dfa_36;
            this.transition = dfa_37;
        }
        public String getDescription() {
            return "1667:1: rule__FieldDecl__Alternatives : ( ( ( rule__FieldDecl__Group_0__0 ) ) | ( ( rule__FieldDecl__Group_1__0 ) ) | ( ( rule__FieldDecl__Group_2__0 ) ) | ( ( rule__FieldDecl__Group_3__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00083C0080100012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00003C0000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00083C0080500010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020100010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00003C0000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080100010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004040000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0005D02080000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0004102000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040080100010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000600400000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0005D42080100010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0005D02080000012L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008040080100010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0010004000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00000000800001C0L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00083C0080100010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00000000000001C0L});

}