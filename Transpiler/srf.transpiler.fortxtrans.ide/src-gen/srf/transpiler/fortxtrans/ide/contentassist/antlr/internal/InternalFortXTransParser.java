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
    // InternalFortXTrans.g:651:1: ruleExpr : ( ( rule__Expr__Alternatives ) ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:655:2: ( ( ( rule__Expr__Alternatives ) ) )
            // InternalFortXTrans.g:656:2: ( ( rule__Expr__Alternatives ) )
            {
            // InternalFortXTrans.g:656:2: ( ( rule__Expr__Alternatives ) )
            // InternalFortXTrans.g:657:3: ( rule__Expr__Alternatives )
            {
             before(grammarAccess.getExprAccess().getAlternatives()); 
            // InternalFortXTrans.g:658:3: ( rule__Expr__Alternatives )
            // InternalFortXTrans.g:658:4: rule__Expr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleLocalVarDecl"
    // InternalFortXTrans.g:1242:1: entryRuleLocalVarDecl : ruleLocalVarDecl EOF ;
    public final void entryRuleLocalVarDecl() throws RecognitionException {
        try {
            // InternalFortXTrans.g:1243:1: ( ruleLocalVarDecl EOF )
            // InternalFortXTrans.g:1244:1: ruleLocalVarDecl EOF
            {
             before(grammarAccess.getLocalVarDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleLocalVarDecl();

            state._fsp--;

             after(grammarAccess.getLocalVarDeclRule()); 
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
    // $ANTLR end "entryRuleLocalVarDecl"


    // $ANTLR start "ruleLocalVarDecl"
    // InternalFortXTrans.g:1251:1: ruleLocalVarDecl : ( ( rule__LocalVarDecl__Alternatives ) ) ;
    public final void ruleLocalVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1255:2: ( ( ( rule__LocalVarDecl__Alternatives ) ) )
            // InternalFortXTrans.g:1256:2: ( ( rule__LocalVarDecl__Alternatives ) )
            {
            // InternalFortXTrans.g:1256:2: ( ( rule__LocalVarDecl__Alternatives ) )
            // InternalFortXTrans.g:1257:3: ( rule__LocalVarDecl__Alternatives )
            {
             before(grammarAccess.getLocalVarDeclAccess().getAlternatives()); 
            // InternalFortXTrans.g:1258:3: ( rule__LocalVarDecl__Alternatives )
            // InternalFortXTrans.g:1258:4: rule__LocalVarDecl__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLocalVarDeclAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalVarDecl"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalFortXTrans.g:1266:1: rule__Model__Alternatives : ( ( ruleComponent ) | ( ruleAPI ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1270:1: ( ( ruleComponent ) | ( ruleAPI ) )
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
                    // InternalFortXTrans.g:1271:2: ( ruleComponent )
                    {
                    // InternalFortXTrans.g:1271:2: ( ruleComponent )
                    // InternalFortXTrans.g:1272:3: ruleComponent
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
                    // InternalFortXTrans.g:1277:2: ( ruleAPI )
                    {
                    // InternalFortXTrans.g:1277:2: ( ruleAPI )
                    // InternalFortXTrans.g:1278:3: ruleAPI
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
    // InternalFortXTrans.g:1287:1: rule__Import__Alternatives : ( ( ( rule__Import__Group_0__0 ) ) | ( ( rule__Import__Group_1__0 ) ) );
    public final void rule__Import__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1291:1: ( ( ( rule__Import__Group_0__0 ) ) | ( ( rule__Import__Group_1__0 ) ) )
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
                    // InternalFortXTrans.g:1292:2: ( ( rule__Import__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1292:2: ( ( rule__Import__Group_0__0 ) )
                    // InternalFortXTrans.g:1293:3: ( rule__Import__Group_0__0 )
                    {
                     before(grammarAccess.getImportAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1294:3: ( rule__Import__Group_0__0 )
                    // InternalFortXTrans.g:1294:4: rule__Import__Group_0__0
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
                    // InternalFortXTrans.g:1298:2: ( ( rule__Import__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1298:2: ( ( rule__Import__Group_1__0 ) )
                    // InternalFortXTrans.g:1299:3: ( rule__Import__Group_1__0 )
                    {
                     before(grammarAccess.getImportAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1300:3: ( rule__Import__Group_1__0 )
                    // InternalFortXTrans.g:1300:4: rule__Import__Group_1__0
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
    // InternalFortXTrans.g:1308:1: rule__Export__Alternatives : ( ( ( rule__Export__Group_0__0 ) ) | ( ( rule__Export__Group_1__0 ) ) );
    public final void rule__Export__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1312:1: ( ( ( rule__Export__Group_0__0 ) ) | ( ( rule__Export__Group_1__0 ) ) )
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
                    // InternalFortXTrans.g:1313:2: ( ( rule__Export__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1313:2: ( ( rule__Export__Group_0__0 ) )
                    // InternalFortXTrans.g:1314:3: ( rule__Export__Group_0__0 )
                    {
                     before(grammarAccess.getExportAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1315:3: ( rule__Export__Group_0__0 )
                    // InternalFortXTrans.g:1315:4: rule__Export__Group_0__0
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
                    // InternalFortXTrans.g:1319:2: ( ( rule__Export__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1319:2: ( ( rule__Export__Group_1__0 ) )
                    // InternalFortXTrans.g:1320:3: ( rule__Export__Group_1__0 )
                    {
                     before(grammarAccess.getExportAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1321:3: ( rule__Export__Group_1__0 )
                    // InternalFortXTrans.g:1321:4: rule__Export__Group_1__0
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
    // InternalFortXTrans.g:1329:1: rule__ImportedNames__Alternatives : ( ( ( rule__ImportedNames__Group_0__0 ) ) | ( ( rule__ImportedNames__Group_1__0 ) ) | ( ( rule__ImportedNames__Group_2__0 ) ) );
    public final void rule__ImportedNames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1333:1: ( ( ( rule__ImportedNames__Group_0__0 ) ) | ( ( rule__ImportedNames__Group_1__0 ) ) | ( ( rule__ImportedNames__Group_2__0 ) ) )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalFortXTrans.g:1334:2: ( ( rule__ImportedNames__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1334:2: ( ( rule__ImportedNames__Group_0__0 ) )
                    // InternalFortXTrans.g:1335:3: ( rule__ImportedNames__Group_0__0 )
                    {
                     before(grammarAccess.getImportedNamesAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1336:3: ( rule__ImportedNames__Group_0__0 )
                    // InternalFortXTrans.g:1336:4: rule__ImportedNames__Group_0__0
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
                    // InternalFortXTrans.g:1340:2: ( ( rule__ImportedNames__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1340:2: ( ( rule__ImportedNames__Group_1__0 ) )
                    // InternalFortXTrans.g:1341:3: ( rule__ImportedNames__Group_1__0 )
                    {
                     before(grammarAccess.getImportedNamesAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1342:3: ( rule__ImportedNames__Group_1__0 )
                    // InternalFortXTrans.g:1342:4: rule__ImportedNames__Group_1__0
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
                    // InternalFortXTrans.g:1346:2: ( ( rule__ImportedNames__Group_2__0 ) )
                    {
                    // InternalFortXTrans.g:1346:2: ( ( rule__ImportedNames__Group_2__0 ) )
                    // InternalFortXTrans.g:1347:3: ( rule__ImportedNames__Group_2__0 )
                    {
                     before(grammarAccess.getImportedNamesAccess().getGroup_2()); 
                    // InternalFortXTrans.g:1348:3: ( rule__ImportedNames__Group_2__0 )
                    // InternalFortXTrans.g:1348:4: rule__ImportedNames__Group_2__0
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
    // InternalFortXTrans.g:1356:1: rule__QualifiedName__Alternatives : ( ( ( rule__QualifiedName__Group_0__0 ) ) | ( ( rule__QualifiedName__Group_1__0 ) ) | ( ( rule__QualifiedName__Group_2__0 ) ) );
    public final void rule__QualifiedName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1360:1: ( ( ( rule__QualifiedName__Group_0__0 ) ) | ( ( rule__QualifiedName__Group_1__0 ) ) | ( ( rule__QualifiedName__Group_2__0 ) ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalFortXTrans.g:1361:2: ( ( rule__QualifiedName__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1361:2: ( ( rule__QualifiedName__Group_0__0 ) )
                    // InternalFortXTrans.g:1362:3: ( rule__QualifiedName__Group_0__0 )
                    {
                     before(grammarAccess.getQualifiedNameAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1363:3: ( rule__QualifiedName__Group_0__0 )
                    // InternalFortXTrans.g:1363:4: rule__QualifiedName__Group_0__0
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
                    // InternalFortXTrans.g:1367:2: ( ( rule__QualifiedName__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1367:2: ( ( rule__QualifiedName__Group_1__0 ) )
                    // InternalFortXTrans.g:1368:3: ( rule__QualifiedName__Group_1__0 )
                    {
                     before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1369:3: ( rule__QualifiedName__Group_1__0 )
                    // InternalFortXTrans.g:1369:4: rule__QualifiedName__Group_1__0
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
                    // InternalFortXTrans.g:1373:2: ( ( rule__QualifiedName__Group_2__0 ) )
                    {
                    // InternalFortXTrans.g:1373:2: ( ( rule__QualifiedName__Group_2__0 ) )
                    // InternalFortXTrans.g:1374:3: ( rule__QualifiedName__Group_2__0 )
                    {
                     before(grammarAccess.getQualifiedNameAccess().getGroup_2()); 
                    // InternalFortXTrans.g:1375:3: ( rule__QualifiedName__Group_2__0 )
                    // InternalFortXTrans.g:1375:4: rule__QualifiedName__Group_2__0
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
    // InternalFortXTrans.g:1383:1: rule__APIName__Alternatives : ( ( ( rule__APIName__Group_0__0 ) ) | ( ( rule__APIName__Group_1__0 ) ) | ( ( rule__APIName__Group_2__0 ) ) );
    public final void rule__APIName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1387:1: ( ( ( rule__APIName__Group_0__0 ) ) | ( ( rule__APIName__Group_1__0 ) ) | ( ( rule__APIName__Group_2__0 ) ) )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalFortXTrans.g:1388:2: ( ( rule__APIName__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1388:2: ( ( rule__APIName__Group_0__0 ) )
                    // InternalFortXTrans.g:1389:3: ( rule__APIName__Group_0__0 )
                    {
                     before(grammarAccess.getAPINameAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1390:3: ( rule__APIName__Group_0__0 )
                    // InternalFortXTrans.g:1390:4: rule__APIName__Group_0__0
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
                    // InternalFortXTrans.g:1394:2: ( ( rule__APIName__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1394:2: ( ( rule__APIName__Group_1__0 ) )
                    // InternalFortXTrans.g:1395:3: ( rule__APIName__Group_1__0 )
                    {
                     before(grammarAccess.getAPINameAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1396:3: ( rule__APIName__Group_1__0 )
                    // InternalFortXTrans.g:1396:4: rule__APIName__Group_1__0
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
                    // InternalFortXTrans.g:1400:2: ( ( rule__APIName__Group_2__0 ) )
                    {
                    // InternalFortXTrans.g:1400:2: ( ( rule__APIName__Group_2__0 ) )
                    // InternalFortXTrans.g:1401:3: ( rule__APIName__Group_2__0 )
                    {
                     before(grammarAccess.getAPINameAccess().getGroup_2()); 
                    // InternalFortXTrans.g:1402:3: ( rule__APIName__Group_2__0 )
                    // InternalFortXTrans.g:1402:4: rule__APIName__Group_2__0
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
    // InternalFortXTrans.g:1410:1: rule__SimpleNames__Alternatives : ( ( ( rule__SimpleNames__NameListAssignment_0 ) ) | ( ( rule__SimpleNames__Group_1__0 ) ) );
    public final void rule__SimpleNames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1414:1: ( ( ( rule__SimpleNames__NameListAssignment_0 ) ) | ( ( rule__SimpleNames__Group_1__0 ) ) )
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
                    // InternalFortXTrans.g:1415:2: ( ( rule__SimpleNames__NameListAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1415:2: ( ( rule__SimpleNames__NameListAssignment_0 ) )
                    // InternalFortXTrans.g:1416:3: ( rule__SimpleNames__NameListAssignment_0 )
                    {
                     before(grammarAccess.getSimpleNamesAccess().getNameListAssignment_0()); 
                    // InternalFortXTrans.g:1417:3: ( rule__SimpleNames__NameListAssignment_0 )
                    // InternalFortXTrans.g:1417:4: rule__SimpleNames__NameListAssignment_0
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
                    // InternalFortXTrans.g:1421:2: ( ( rule__SimpleNames__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1421:2: ( ( rule__SimpleNames__Group_1__0 ) )
                    // InternalFortXTrans.g:1422:3: ( rule__SimpleNames__Group_1__0 )
                    {
                     before(grammarAccess.getSimpleNamesAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1423:3: ( rule__SimpleNames__Group_1__0 )
                    // InternalFortXTrans.g:1423:4: rule__SimpleNames__Group_1__0
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
    // InternalFortXTrans.g:1431:1: rule__AliasedAPINames__Alternatives : ( ( ( rule__AliasedAPINames__NameListAssignment_0 ) ) | ( ( rule__AliasedAPINames__Group_1__0 ) ) );
    public final void rule__AliasedAPINames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1435:1: ( ( ( rule__AliasedAPINames__NameListAssignment_0 ) ) | ( ( rule__AliasedAPINames__Group_1__0 ) ) )
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
                    // InternalFortXTrans.g:1436:2: ( ( rule__AliasedAPINames__NameListAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1436:2: ( ( rule__AliasedAPINames__NameListAssignment_0 ) )
                    // InternalFortXTrans.g:1437:3: ( rule__AliasedAPINames__NameListAssignment_0 )
                    {
                     before(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_0()); 
                    // InternalFortXTrans.g:1438:3: ( rule__AliasedAPINames__NameListAssignment_0 )
                    // InternalFortXTrans.g:1438:4: rule__AliasedAPINames__NameListAssignment_0
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
                    // InternalFortXTrans.g:1442:2: ( ( rule__AliasedAPINames__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1442:2: ( ( rule__AliasedAPINames__Group_1__0 ) )
                    // InternalFortXTrans.g:1443:3: ( rule__AliasedAPINames__Group_1__0 )
                    {
                     before(grammarAccess.getAliasedAPINamesAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1444:3: ( rule__AliasedAPINames__Group_1__0 )
                    // InternalFortXTrans.g:1444:4: rule__AliasedAPINames__Group_1__0
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
    // InternalFortXTrans.g:1452:1: rule__Decl__Alternatives : ( ( ( rule__Decl__FunctionAssignment_0 ) ) | ( ( rule__Decl__FieldAssignment_1 ) ) );
    public final void rule__Decl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1456:1: ( ( ( rule__Decl__FunctionAssignment_0 ) ) | ( ( rule__Decl__FieldAssignment_1 ) ) )
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
                    // InternalFortXTrans.g:1457:2: ( ( rule__Decl__FunctionAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1457:2: ( ( rule__Decl__FunctionAssignment_0 ) )
                    // InternalFortXTrans.g:1458:3: ( rule__Decl__FunctionAssignment_0 )
                    {
                     before(grammarAccess.getDeclAccess().getFunctionAssignment_0()); 
                    // InternalFortXTrans.g:1459:3: ( rule__Decl__FunctionAssignment_0 )
                    // InternalFortXTrans.g:1459:4: rule__Decl__FunctionAssignment_0
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
                    // InternalFortXTrans.g:1463:2: ( ( rule__Decl__FieldAssignment_1 ) )
                    {
                    // InternalFortXTrans.g:1463:2: ( ( rule__Decl__FieldAssignment_1 ) )
                    // InternalFortXTrans.g:1464:3: ( rule__Decl__FieldAssignment_1 )
                    {
                     before(grammarAccess.getDeclAccess().getFieldAssignment_1()); 
                    // InternalFortXTrans.g:1465:3: ( rule__Decl__FieldAssignment_1 )
                    // InternalFortXTrans.g:1465:4: rule__Decl__FieldAssignment_1
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
    // InternalFortXTrans.g:1473:1: rule__FnMod__Alternatives : ( ( ( rule__FnMod__ModtypeAssignment_0 ) ) | ( ( rule__FnMod__ModtypeAssignment_1 ) ) | ( ( rule__FnMod__ModtypeAssignment_2 ) ) | ( ( rule__FnMod__ModtypeAssignment_3 ) ) );
    public final void rule__FnMod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1477:1: ( ( ( rule__FnMod__ModtypeAssignment_0 ) ) | ( ( rule__FnMod__ModtypeAssignment_1 ) ) | ( ( rule__FnMod__ModtypeAssignment_2 ) ) | ( ( rule__FnMod__ModtypeAssignment_3 ) ) )
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
                    // InternalFortXTrans.g:1478:2: ( ( rule__FnMod__ModtypeAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1478:2: ( ( rule__FnMod__ModtypeAssignment_0 ) )
                    // InternalFortXTrans.g:1479:3: ( rule__FnMod__ModtypeAssignment_0 )
                    {
                     before(grammarAccess.getFnModAccess().getModtypeAssignment_0()); 
                    // InternalFortXTrans.g:1480:3: ( rule__FnMod__ModtypeAssignment_0 )
                    // InternalFortXTrans.g:1480:4: rule__FnMod__ModtypeAssignment_0
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
                    // InternalFortXTrans.g:1484:2: ( ( rule__FnMod__ModtypeAssignment_1 ) )
                    {
                    // InternalFortXTrans.g:1484:2: ( ( rule__FnMod__ModtypeAssignment_1 ) )
                    // InternalFortXTrans.g:1485:3: ( rule__FnMod__ModtypeAssignment_1 )
                    {
                     before(grammarAccess.getFnModAccess().getModtypeAssignment_1()); 
                    // InternalFortXTrans.g:1486:3: ( rule__FnMod__ModtypeAssignment_1 )
                    // InternalFortXTrans.g:1486:4: rule__FnMod__ModtypeAssignment_1
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
                    // InternalFortXTrans.g:1490:2: ( ( rule__FnMod__ModtypeAssignment_2 ) )
                    {
                    // InternalFortXTrans.g:1490:2: ( ( rule__FnMod__ModtypeAssignment_2 ) )
                    // InternalFortXTrans.g:1491:3: ( rule__FnMod__ModtypeAssignment_2 )
                    {
                     before(grammarAccess.getFnModAccess().getModtypeAssignment_2()); 
                    // InternalFortXTrans.g:1492:3: ( rule__FnMod__ModtypeAssignment_2 )
                    // InternalFortXTrans.g:1492:4: rule__FnMod__ModtypeAssignment_2
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
                    // InternalFortXTrans.g:1496:2: ( ( rule__FnMod__ModtypeAssignment_3 ) )
                    {
                    // InternalFortXTrans.g:1496:2: ( ( rule__FnMod__ModtypeAssignment_3 ) )
                    // InternalFortXTrans.g:1497:3: ( rule__FnMod__ModtypeAssignment_3 )
                    {
                     before(grammarAccess.getFnModAccess().getModtypeAssignment_3()); 
                    // InternalFortXTrans.g:1498:3: ( rule__FnMod__ModtypeAssignment_3 )
                    // InternalFortXTrans.g:1498:4: rule__FnMod__ModtypeAssignment_3
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
    // InternalFortXTrans.g:1506:1: rule__ValParam__Alternatives : ( ( ( rule__ValParam__ParamsAssignment_0 ) ) | ( ( rule__ValParam__Group_1__0 ) ) );
    public final void rule__ValParam__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1510:1: ( ( ( rule__ValParam__ParamsAssignment_0 ) ) | ( ( rule__ValParam__Group_1__0 ) ) )
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
                    // InternalFortXTrans.g:1511:2: ( ( rule__ValParam__ParamsAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1511:2: ( ( rule__ValParam__ParamsAssignment_0 ) )
                    // InternalFortXTrans.g:1512:3: ( rule__ValParam__ParamsAssignment_0 )
                    {
                     before(grammarAccess.getValParamAccess().getParamsAssignment_0()); 
                    // InternalFortXTrans.g:1513:3: ( rule__ValParam__ParamsAssignment_0 )
                    // InternalFortXTrans.g:1513:4: rule__ValParam__ParamsAssignment_0
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
                    // InternalFortXTrans.g:1517:2: ( ( rule__ValParam__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1517:2: ( ( rule__ValParam__Group_1__0 ) )
                    // InternalFortXTrans.g:1518:3: ( rule__ValParam__Group_1__0 )
                    {
                     before(grammarAccess.getValParamAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1519:3: ( rule__ValParam__Group_1__0 )
                    // InternalFortXTrans.g:1519:4: rule__ValParam__Group_1__0
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
    // InternalFortXTrans.g:1527:1: rule__RetType__Alternatives : ( ( ( rule__RetType__Group_0__0 ) ) | ( ( rule__RetType__Group_1__0 ) ) );
    public final void rule__RetType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1531:1: ( ( ( rule__RetType__Group_0__0 ) ) | ( ( rule__RetType__Group_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==31) ) {
                    alt14=1;
                }
                else if ( (LA14_1==RULE_ID) ) {
                    alt14=2;
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
                    // InternalFortXTrans.g:1532:2: ( ( rule__RetType__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1532:2: ( ( rule__RetType__Group_0__0 ) )
                    // InternalFortXTrans.g:1533:3: ( rule__RetType__Group_0__0 )
                    {
                     before(grammarAccess.getRetTypeAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1534:3: ( rule__RetType__Group_0__0 )
                    // InternalFortXTrans.g:1534:4: rule__RetType__Group_0__0
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
                    // InternalFortXTrans.g:1538:2: ( ( rule__RetType__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1538:2: ( ( rule__RetType__Group_1__0 ) )
                    // InternalFortXTrans.g:1539:3: ( rule__RetType__Group_1__0 )
                    {
                     before(grammarAccess.getRetTypeAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1540:3: ( rule__RetType__Group_1__0 )
                    // InternalFortXTrans.g:1540:4: rule__RetType__Group_1__0
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


    // $ANTLR start "rule__Expr__Alternatives"
    // InternalFortXTrans.g:1548:1: rule__Expr__Alternatives : ( ( ( rule__Expr__Group_0__0 ) ) | ( ( rule__Expr__LocVarAssignment_1 ) ) );
    public final void rule__Expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1552:1: ( ( ( rule__Expr__Group_0__0 ) ) | ( ( rule__Expr__LocVarAssignment_1 ) ) )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalFortXTrans.g:1553:2: ( ( rule__Expr__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1553:2: ( ( rule__Expr__Group_0__0 ) )
                    // InternalFortXTrans.g:1554:3: ( rule__Expr__Group_0__0 )
                    {
                     before(grammarAccess.getExprAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1555:3: ( rule__Expr__Group_0__0 )
                    // InternalFortXTrans.g:1555:4: rule__Expr__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expr__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1559:2: ( ( rule__Expr__LocVarAssignment_1 ) )
                    {
                    // InternalFortXTrans.g:1559:2: ( ( rule__Expr__LocVarAssignment_1 ) )
                    // InternalFortXTrans.g:1560:3: ( rule__Expr__LocVarAssignment_1 )
                    {
                     before(grammarAccess.getExprAccess().getLocVarAssignment_1()); 
                    // InternalFortXTrans.g:1561:3: ( rule__Expr__LocVarAssignment_1 )
                    // InternalFortXTrans.g:1561:4: rule__Expr__LocVarAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expr__LocVarAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprAccess().getLocVarAssignment_1()); 

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
    // $ANTLR end "rule__Expr__Alternatives"


    // $ANTLR start "rule__ExprFront__Alternatives"
    // InternalFortXTrans.g:1569:1: rule__ExprFront__Alternatives : ( ( ( rule__ExprFront__DelimAssignment_0 ) ) | ( ( rule__ExprFront__IdAssignment_1 ) ) );
    public final void rule__ExprFront__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1573:1: ( ( ( rule__ExprFront__DelimAssignment_0 ) ) | ( ( rule__ExprFront__IdAssignment_1 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31||LA16_0==37||LA16_0==44||(LA16_0>=46 && LA16_0<=48)||LA16_0==50) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalFortXTrans.g:1574:2: ( ( rule__ExprFront__DelimAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1574:2: ( ( rule__ExprFront__DelimAssignment_0 ) )
                    // InternalFortXTrans.g:1575:3: ( rule__ExprFront__DelimAssignment_0 )
                    {
                     before(grammarAccess.getExprFrontAccess().getDelimAssignment_0()); 
                    // InternalFortXTrans.g:1576:3: ( rule__ExprFront__DelimAssignment_0 )
                    // InternalFortXTrans.g:1576:4: rule__ExprFront__DelimAssignment_0
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
                    // InternalFortXTrans.g:1580:2: ( ( rule__ExprFront__IdAssignment_1 ) )
                    {
                    // InternalFortXTrans.g:1580:2: ( ( rule__ExprFront__IdAssignment_1 ) )
                    // InternalFortXTrans.g:1581:3: ( rule__ExprFront__IdAssignment_1 )
                    {
                     before(grammarAccess.getExprFrontAccess().getIdAssignment_1()); 
                    // InternalFortXTrans.g:1582:3: ( rule__ExprFront__IdAssignment_1 )
                    // InternalFortXTrans.g:1582:4: rule__ExprFront__IdAssignment_1
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
    // InternalFortXTrans.g:1590:1: rule__DelimitedExpr__Alternatives : ( ( ( rule__DelimitedExpr__DodAssignment_0 ) ) | ( ( rule__DelimitedExpr__Group_1__0 ) ) | ( ( rule__DelimitedExpr__Group_2__0 ) ) | ( ( rule__DelimitedExpr__Group_3__0 ) ) | ( ( rule__DelimitedExpr__ParAssignment_4 ) ) );
    public final void rule__DelimitedExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1594:1: ( ( ( rule__DelimitedExpr__DodAssignment_0 ) ) | ( ( rule__DelimitedExpr__Group_1__0 ) ) | ( ( rule__DelimitedExpr__Group_2__0 ) ) | ( ( rule__DelimitedExpr__Group_3__0 ) ) | ( ( rule__DelimitedExpr__ParAssignment_4 ) ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 37:
            case 44:
            case 50:
                {
                alt17=1;
                }
                break;
            case 46:
                {
                alt17=2;
                }
                break;
            case 47:
                {
                alt17=3;
                }
                break;
            case 48:
                {
                alt17=4;
                }
                break;
            case 31:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalFortXTrans.g:1595:2: ( ( rule__DelimitedExpr__DodAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1595:2: ( ( rule__DelimitedExpr__DodAssignment_0 ) )
                    // InternalFortXTrans.g:1596:3: ( rule__DelimitedExpr__DodAssignment_0 )
                    {
                     before(grammarAccess.getDelimitedExprAccess().getDodAssignment_0()); 
                    // InternalFortXTrans.g:1597:3: ( rule__DelimitedExpr__DodAssignment_0 )
                    // InternalFortXTrans.g:1597:4: rule__DelimitedExpr__DodAssignment_0
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
                    // InternalFortXTrans.g:1601:2: ( ( rule__DelimitedExpr__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1601:2: ( ( rule__DelimitedExpr__Group_1__0 ) )
                    // InternalFortXTrans.g:1602:3: ( rule__DelimitedExpr__Group_1__0 )
                    {
                     before(grammarAccess.getDelimitedExprAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1603:3: ( rule__DelimitedExpr__Group_1__0 )
                    // InternalFortXTrans.g:1603:4: rule__DelimitedExpr__Group_1__0
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
                    // InternalFortXTrans.g:1607:2: ( ( rule__DelimitedExpr__Group_2__0 ) )
                    {
                    // InternalFortXTrans.g:1607:2: ( ( rule__DelimitedExpr__Group_2__0 ) )
                    // InternalFortXTrans.g:1608:3: ( rule__DelimitedExpr__Group_2__0 )
                    {
                     before(grammarAccess.getDelimitedExprAccess().getGroup_2()); 
                    // InternalFortXTrans.g:1609:3: ( rule__DelimitedExpr__Group_2__0 )
                    // InternalFortXTrans.g:1609:4: rule__DelimitedExpr__Group_2__0
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
                    // InternalFortXTrans.g:1613:2: ( ( rule__DelimitedExpr__Group_3__0 ) )
                    {
                    // InternalFortXTrans.g:1613:2: ( ( rule__DelimitedExpr__Group_3__0 ) )
                    // InternalFortXTrans.g:1614:3: ( rule__DelimitedExpr__Group_3__0 )
                    {
                     before(grammarAccess.getDelimitedExprAccess().getGroup_3()); 
                    // InternalFortXTrans.g:1615:3: ( rule__DelimitedExpr__Group_3__0 )
                    // InternalFortXTrans.g:1615:4: rule__DelimitedExpr__Group_3__0
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
                    // InternalFortXTrans.g:1619:2: ( ( rule__DelimitedExpr__ParAssignment_4 ) )
                    {
                    // InternalFortXTrans.g:1619:2: ( ( rule__DelimitedExpr__ParAssignment_4 ) )
                    // InternalFortXTrans.g:1620:3: ( rule__DelimitedExpr__ParAssignment_4 )
                    {
                     before(grammarAccess.getDelimitedExprAccess().getParAssignment_4()); 
                    // InternalFortXTrans.g:1621:3: ( rule__DelimitedExpr__ParAssignment_4 )
                    // InternalFortXTrans.g:1621:4: rule__DelimitedExpr__ParAssignment_4
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
    // InternalFortXTrans.g:1629:1: rule__Binding__Alternatives : ( ( ( rule__Binding__Group_0__0 ) ) | ( ( rule__Binding__Group_1__0 ) ) );
    public final void rule__Binding__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1633:1: ( ( ( rule__Binding__Group_0__0 ) ) | ( ( rule__Binding__Group_1__0 ) ) )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalFortXTrans.g:1634:2: ( ( rule__Binding__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1634:2: ( ( rule__Binding__Group_0__0 ) )
                    // InternalFortXTrans.g:1635:3: ( rule__Binding__Group_0__0 )
                    {
                     before(grammarAccess.getBindingAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1636:3: ( rule__Binding__Group_0__0 )
                    // InternalFortXTrans.g:1636:4: rule__Binding__Group_0__0
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
                    // InternalFortXTrans.g:1640:2: ( ( rule__Binding__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1640:2: ( ( rule__Binding__Group_1__0 ) )
                    // InternalFortXTrans.g:1641:3: ( rule__Binding__Group_1__0 )
                    {
                     before(grammarAccess.getBindingAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1642:3: ( rule__Binding__Group_1__0 )
                    // InternalFortXTrans.g:1642:4: rule__Binding__Group_1__0
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
    // InternalFortXTrans.g:1650:1: rule__GenClause__Alternatives : ( ( ( rule__GenClause__BindingAssignment_0 ) ) | ( ( rule__GenClause__ExprAssignment_1 ) ) );
    public final void rule__GenClause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1654:1: ( ( ( rule__GenClause__BindingAssignment_0 ) ) | ( ( rule__GenClause__ExprAssignment_1 ) ) )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalFortXTrans.g:1655:2: ( ( rule__GenClause__BindingAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1655:2: ( ( rule__GenClause__BindingAssignment_0 ) )
                    // InternalFortXTrans.g:1656:3: ( rule__GenClause__BindingAssignment_0 )
                    {
                     before(grammarAccess.getGenClauseAccess().getBindingAssignment_0()); 
                    // InternalFortXTrans.g:1657:3: ( rule__GenClause__BindingAssignment_0 )
                    // InternalFortXTrans.g:1657:4: rule__GenClause__BindingAssignment_0
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
                    // InternalFortXTrans.g:1661:2: ( ( rule__GenClause__ExprAssignment_1 ) )
                    {
                    // InternalFortXTrans.g:1661:2: ( ( rule__GenClause__ExprAssignment_1 ) )
                    // InternalFortXTrans.g:1662:3: ( rule__GenClause__ExprAssignment_1 )
                    {
                     before(grammarAccess.getGenClauseAccess().getExprAssignment_1()); 
                    // InternalFortXTrans.g:1663:3: ( rule__GenClause__ExprAssignment_1 )
                    // InternalFortXTrans.g:1663:4: rule__GenClause__ExprAssignment_1
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
    // InternalFortXTrans.g:1671:1: rule__IdOrTuple__Alternatives : ( ( ( rule__IdOrTuple__BidAssignment_0 ) ) | ( ( rule__IdOrTuple__Group_1__0 ) ) );
    public final void rule__IdOrTuple__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1675:1: ( ( ( rule__IdOrTuple__BidAssignment_0 ) ) | ( ( rule__IdOrTuple__Group_1__0 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||LA20_0==20) ) {
                alt20=1;
            }
            else if ( (LA20_0==31) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalFortXTrans.g:1676:2: ( ( rule__IdOrTuple__BidAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1676:2: ( ( rule__IdOrTuple__BidAssignment_0 ) )
                    // InternalFortXTrans.g:1677:3: ( rule__IdOrTuple__BidAssignment_0 )
                    {
                     before(grammarAccess.getIdOrTupleAccess().getBidAssignment_0()); 
                    // InternalFortXTrans.g:1678:3: ( rule__IdOrTuple__BidAssignment_0 )
                    // InternalFortXTrans.g:1678:4: rule__IdOrTuple__BidAssignment_0
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
                    // InternalFortXTrans.g:1682:2: ( ( rule__IdOrTuple__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1682:2: ( ( rule__IdOrTuple__Group_1__0 ) )
                    // InternalFortXTrans.g:1683:3: ( rule__IdOrTuple__Group_1__0 )
                    {
                     before(grammarAccess.getIdOrTupleAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1684:3: ( rule__IdOrTuple__Group_1__0 )
                    // InternalFortXTrans.g:1684:4: rule__IdOrTuple__Group_1__0
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
    // InternalFortXTrans.g:1692:1: rule__BindId__Alternatives : ( ( RULE_ID ) | ( '_' ) );
    public final void rule__BindId__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1696:1: ( ( RULE_ID ) | ( '_' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==20) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalFortXTrans.g:1697:2: ( RULE_ID )
                    {
                    // InternalFortXTrans.g:1697:2: ( RULE_ID )
                    // InternalFortXTrans.g:1698:3: RULE_ID
                    {
                     before(grammarAccess.getBindIdAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getBindIdAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1703:2: ( '_' )
                    {
                    // InternalFortXTrans.g:1703:2: ( '_' )
                    // InternalFortXTrans.g:1704:3: '_'
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
    // InternalFortXTrans.g:1713:1: rule__FieldDecl__Alternatives : ( ( ( rule__FieldDecl__Group_0__0 ) ) | ( ( rule__FieldDecl__Group_1__0 ) ) | ( ( rule__FieldDecl__Group_2__0 ) ) | ( ( rule__FieldDecl__Group_3__0 ) ) );
    public final void rule__FieldDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1717:1: ( ( ( rule__FieldDecl__Group_0__0 ) ) | ( ( rule__FieldDecl__Group_1__0 ) ) | ( ( rule__FieldDecl__Group_2__0 ) ) | ( ( rule__FieldDecl__Group_3__0 ) ) )
            int alt22=4;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalFortXTrans.g:1718:2: ( ( rule__FieldDecl__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1718:2: ( ( rule__FieldDecl__Group_0__0 ) )
                    // InternalFortXTrans.g:1719:3: ( rule__FieldDecl__Group_0__0 )
                    {
                     before(grammarAccess.getFieldDeclAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1720:3: ( rule__FieldDecl__Group_0__0 )
                    // InternalFortXTrans.g:1720:4: rule__FieldDecl__Group_0__0
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
                    // InternalFortXTrans.g:1724:2: ( ( rule__FieldDecl__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1724:2: ( ( rule__FieldDecl__Group_1__0 ) )
                    // InternalFortXTrans.g:1725:3: ( rule__FieldDecl__Group_1__0 )
                    {
                     before(grammarAccess.getFieldDeclAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1726:3: ( rule__FieldDecl__Group_1__0 )
                    // InternalFortXTrans.g:1726:4: rule__FieldDecl__Group_1__0
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
                    // InternalFortXTrans.g:1730:2: ( ( rule__FieldDecl__Group_2__0 ) )
                    {
                    // InternalFortXTrans.g:1730:2: ( ( rule__FieldDecl__Group_2__0 ) )
                    // InternalFortXTrans.g:1731:3: ( rule__FieldDecl__Group_2__0 )
                    {
                     before(grammarAccess.getFieldDeclAccess().getGroup_2()); 
                    // InternalFortXTrans.g:1732:3: ( rule__FieldDecl__Group_2__0 )
                    // InternalFortXTrans.g:1732:4: rule__FieldDecl__Group_2__0
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
                    // InternalFortXTrans.g:1736:2: ( ( rule__FieldDecl__Group_3__0 ) )
                    {
                    // InternalFortXTrans.g:1736:2: ( ( rule__FieldDecl__Group_3__0 ) )
                    // InternalFortXTrans.g:1737:3: ( rule__FieldDecl__Group_3__0 )
                    {
                     before(grammarAccess.getFieldDeclAccess().getGroup_3()); 
                    // InternalFortXTrans.g:1738:3: ( rule__FieldDecl__Group_3__0 )
                    // InternalFortXTrans.g:1738:4: rule__FieldDecl__Group_3__0
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
    // InternalFortXTrans.g:1746:1: rule__NoNewlineVarWTypes__Alternatives : ( ( ( rule__NoNewlineVarWTypes__SingleAssignment_0 ) ) | ( ( rule__NoNewlineVarWTypes__Group_1__0 ) ) );
    public final void rule__NoNewlineVarWTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1750:1: ( ( ( rule__NoNewlineVarWTypes__SingleAssignment_0 ) ) | ( ( rule__NoNewlineVarWTypes__Group_1__0 ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||LA23_0==20) ) {
                alt23=1;
            }
            else if ( (LA23_0==31) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalFortXTrans.g:1751:2: ( ( rule__NoNewlineVarWTypes__SingleAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1751:2: ( ( rule__NoNewlineVarWTypes__SingleAssignment_0 ) )
                    // InternalFortXTrans.g:1752:3: ( rule__NoNewlineVarWTypes__SingleAssignment_0 )
                    {
                     before(grammarAccess.getNoNewlineVarWTypesAccess().getSingleAssignment_0()); 
                    // InternalFortXTrans.g:1753:3: ( rule__NoNewlineVarWTypes__SingleAssignment_0 )
                    // InternalFortXTrans.g:1753:4: rule__NoNewlineVarWTypes__SingleAssignment_0
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
                    // InternalFortXTrans.g:1757:2: ( ( rule__NoNewlineVarWTypes__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1757:2: ( ( rule__NoNewlineVarWTypes__Group_1__0 ) )
                    // InternalFortXTrans.g:1758:3: ( rule__NoNewlineVarWTypes__Group_1__0 )
                    {
                     before(grammarAccess.getNoNewlineVarWTypesAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1759:3: ( rule__NoNewlineVarWTypes__Group_1__0 )
                    // InternalFortXTrans.g:1759:4: rule__NoNewlineVarWTypes__Group_1__0
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
    // InternalFortXTrans.g:1767:1: rule__InitVal__Alternatives : ( ( ( rule__InitVal__Group_0__0 ) ) | ( ( rule__InitVal__Group_1__0 ) ) );
    public final void rule__InitVal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1771:1: ( ( ( rule__InitVal__Group_0__0 ) ) | ( ( rule__InitVal__Group_1__0 ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==52) ) {
                alt24=1;
            }
            else if ( (LA24_0==38) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalFortXTrans.g:1772:2: ( ( rule__InitVal__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1772:2: ( ( rule__InitVal__Group_0__0 ) )
                    // InternalFortXTrans.g:1773:3: ( rule__InitVal__Group_0__0 )
                    {
                     before(grammarAccess.getInitValAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1774:3: ( rule__InitVal__Group_0__0 )
                    // InternalFortXTrans.g:1774:4: rule__InitVal__Group_0__0
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
                    // InternalFortXTrans.g:1778:2: ( ( rule__InitVal__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1778:2: ( ( rule__InitVal__Group_1__0 ) )
                    // InternalFortXTrans.g:1779:3: ( rule__InitVal__Group_1__0 )
                    {
                     before(grammarAccess.getInitValAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1780:3: ( rule__InitVal__Group_1__0 )
                    // InternalFortXTrans.g:1780:4: rule__InitVal__Group_1__0
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
    // InternalFortXTrans.g:1788:1: rule__LiteralTuple__Alternatives : ( ( ( rule__LiteralTuple__LitAssignment_0 ) ) | ( ( rule__LiteralTuple__Group_1__0 ) ) );
    public final void rule__LiteralTuple__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1792:1: ( ( ( rule__LiteralTuple__LitAssignment_0 ) ) | ( ( rule__LiteralTuple__Group_1__0 ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID||(LA25_0>=RULE_INT && LA25_0<=RULE_STRING)) ) {
                alt25=1;
            }
            else if ( (LA25_0==31) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalFortXTrans.g:1793:2: ( ( rule__LiteralTuple__LitAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1793:2: ( ( rule__LiteralTuple__LitAssignment_0 ) )
                    // InternalFortXTrans.g:1794:3: ( rule__LiteralTuple__LitAssignment_0 )
                    {
                     before(grammarAccess.getLiteralTupleAccess().getLitAssignment_0()); 
                    // InternalFortXTrans.g:1795:3: ( rule__LiteralTuple__LitAssignment_0 )
                    // InternalFortXTrans.g:1795:4: rule__LiteralTuple__LitAssignment_0
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
                    // InternalFortXTrans.g:1799:2: ( ( rule__LiteralTuple__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1799:2: ( ( rule__LiteralTuple__Group_1__0 ) )
                    // InternalFortXTrans.g:1800:3: ( rule__LiteralTuple__Group_1__0 )
                    {
                     before(grammarAccess.getLiteralTupleAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1801:3: ( rule__LiteralTuple__Group_1__0 )
                    // InternalFortXTrans.g:1801:4: rule__LiteralTuple__Group_1__0
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
    // InternalFortXTrans.g:1809:1: rule__Literal__Alternatives : ( ( ( rule__Literal__IntgAssignment_0 ) ) | ( ( rule__Literal__FlotAssignment_1 ) ) | ( ( rule__Literal__StrAssignment_2 ) ) | ( ( rule__Literal__QAssignment_3 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1813:1: ( ( ( rule__Literal__IntgAssignment_0 ) ) | ( ( rule__Literal__FlotAssignment_1 ) ) | ( ( rule__Literal__StrAssignment_2 ) ) | ( ( rule__Literal__QAssignment_3 ) ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt26=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt26=2;
                }
                break;
            case RULE_STRING:
                {
                alt26=3;
                }
                break;
            case RULE_ID:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalFortXTrans.g:1814:2: ( ( rule__Literal__IntgAssignment_0 ) )
                    {
                    // InternalFortXTrans.g:1814:2: ( ( rule__Literal__IntgAssignment_0 ) )
                    // InternalFortXTrans.g:1815:3: ( rule__Literal__IntgAssignment_0 )
                    {
                     before(grammarAccess.getLiteralAccess().getIntgAssignment_0()); 
                    // InternalFortXTrans.g:1816:3: ( rule__Literal__IntgAssignment_0 )
                    // InternalFortXTrans.g:1816:4: rule__Literal__IntgAssignment_0
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
                    // InternalFortXTrans.g:1820:2: ( ( rule__Literal__FlotAssignment_1 ) )
                    {
                    // InternalFortXTrans.g:1820:2: ( ( rule__Literal__FlotAssignment_1 ) )
                    // InternalFortXTrans.g:1821:3: ( rule__Literal__FlotAssignment_1 )
                    {
                     before(grammarAccess.getLiteralAccess().getFlotAssignment_1()); 
                    // InternalFortXTrans.g:1822:3: ( rule__Literal__FlotAssignment_1 )
                    // InternalFortXTrans.g:1822:4: rule__Literal__FlotAssignment_1
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
                    // InternalFortXTrans.g:1826:2: ( ( rule__Literal__StrAssignment_2 ) )
                    {
                    // InternalFortXTrans.g:1826:2: ( ( rule__Literal__StrAssignment_2 ) )
                    // InternalFortXTrans.g:1827:3: ( rule__Literal__StrAssignment_2 )
                    {
                     before(grammarAccess.getLiteralAccess().getStrAssignment_2()); 
                    // InternalFortXTrans.g:1828:3: ( rule__Literal__StrAssignment_2 )
                    // InternalFortXTrans.g:1828:4: rule__Literal__StrAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__StrAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getStrAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFortXTrans.g:1832:2: ( ( rule__Literal__QAssignment_3 ) )
                    {
                    // InternalFortXTrans.g:1832:2: ( ( rule__Literal__QAssignment_3 ) )
                    // InternalFortXTrans.g:1833:3: ( rule__Literal__QAssignment_3 )
                    {
                     before(grammarAccess.getLiteralAccess().getQAssignment_3()); 
                    // InternalFortXTrans.g:1834:3: ( rule__Literal__QAssignment_3 )
                    // InternalFortXTrans.g:1834:4: rule__Literal__QAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__QAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getQAssignment_3()); 

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


    // $ANTLR start "rule__LocalVarDecl__Alternatives"
    // InternalFortXTrans.g:1842:1: rule__LocalVarDecl__Alternatives : ( ( ( rule__LocalVarDecl__Group_0__0 ) ) | ( ( rule__LocalVarDecl__Group_1__0 ) ) | ( ( rule__LocalVarDecl__Group_2__0 ) ) | ( ( rule__LocalVarDecl__Group_3__0 ) ) );
    public final void rule__LocalVarDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1846:1: ( ( ( rule__LocalVarDecl__Group_0__0 ) ) | ( ( rule__LocalVarDecl__Group_1__0 ) ) | ( ( rule__LocalVarDecl__Group_2__0 ) ) | ( ( rule__LocalVarDecl__Group_3__0 ) ) )
            int alt27=4;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalFortXTrans.g:1847:2: ( ( rule__LocalVarDecl__Group_0__0 ) )
                    {
                    // InternalFortXTrans.g:1847:2: ( ( rule__LocalVarDecl__Group_0__0 ) )
                    // InternalFortXTrans.g:1848:3: ( rule__LocalVarDecl__Group_0__0 )
                    {
                     before(grammarAccess.getLocalVarDeclAccess().getGroup_0()); 
                    // InternalFortXTrans.g:1849:3: ( rule__LocalVarDecl__Group_0__0 )
                    // InternalFortXTrans.g:1849:4: rule__LocalVarDecl__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocalVarDecl__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLocalVarDeclAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1853:2: ( ( rule__LocalVarDecl__Group_1__0 ) )
                    {
                    // InternalFortXTrans.g:1853:2: ( ( rule__LocalVarDecl__Group_1__0 ) )
                    // InternalFortXTrans.g:1854:3: ( rule__LocalVarDecl__Group_1__0 )
                    {
                     before(grammarAccess.getLocalVarDeclAccess().getGroup_1()); 
                    // InternalFortXTrans.g:1855:3: ( rule__LocalVarDecl__Group_1__0 )
                    // InternalFortXTrans.g:1855:4: rule__LocalVarDecl__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocalVarDecl__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLocalVarDeclAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:1859:2: ( ( rule__LocalVarDecl__Group_2__0 ) )
                    {
                    // InternalFortXTrans.g:1859:2: ( ( rule__LocalVarDecl__Group_2__0 ) )
                    // InternalFortXTrans.g:1860:3: ( rule__LocalVarDecl__Group_2__0 )
                    {
                     before(grammarAccess.getLocalVarDeclAccess().getGroup_2()); 
                    // InternalFortXTrans.g:1861:3: ( rule__LocalVarDecl__Group_2__0 )
                    // InternalFortXTrans.g:1861:4: rule__LocalVarDecl__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocalVarDecl__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLocalVarDeclAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFortXTrans.g:1865:2: ( ( rule__LocalVarDecl__Group_3__0 ) )
                    {
                    // InternalFortXTrans.g:1865:2: ( ( rule__LocalVarDecl__Group_3__0 ) )
                    // InternalFortXTrans.g:1866:3: ( rule__LocalVarDecl__Group_3__0 )
                    {
                     before(grammarAccess.getLocalVarDeclAccess().getGroup_3()); 
                    // InternalFortXTrans.g:1867:3: ( rule__LocalVarDecl__Group_3__0 )
                    // InternalFortXTrans.g:1867:4: rule__LocalVarDecl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocalVarDecl__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLocalVarDeclAccess().getGroup_3()); 

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
    // $ANTLR end "rule__LocalVarDecl__Alternatives"


    // $ANTLR start "rule__Component__Group__0"
    // InternalFortXTrans.g:1875:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1879:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalFortXTrans.g:1880:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalFortXTrans.g:1887:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1891:1: ( ( 'component' ) )
            // InternalFortXTrans.g:1892:1: ( 'component' )
            {
            // InternalFortXTrans.g:1892:1: ( 'component' )
            // InternalFortXTrans.g:1893:2: 'component'
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
    // InternalFortXTrans.g:1902:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1906:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalFortXTrans.g:1907:2: rule__Component__Group__1__Impl rule__Component__Group__2
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
    // InternalFortXTrans.g:1914:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1918:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalFortXTrans.g:1919:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalFortXTrans.g:1919:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalFortXTrans.g:1920:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalFortXTrans.g:1921:2: ( rule__Component__NameAssignment_1 )
            // InternalFortXTrans.g:1921:3: rule__Component__NameAssignment_1
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
    // InternalFortXTrans.g:1929:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1933:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalFortXTrans.g:1934:2: rule__Component__Group__2__Impl rule__Component__Group__3
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
    // InternalFortXTrans.g:1941:1: rule__Component__Group__2__Impl : ( ( rule__Component__ImportsAssignment_2 )* ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1945:1: ( ( ( rule__Component__ImportsAssignment_2 )* ) )
            // InternalFortXTrans.g:1946:1: ( ( rule__Component__ImportsAssignment_2 )* )
            {
            // InternalFortXTrans.g:1946:1: ( ( rule__Component__ImportsAssignment_2 )* )
            // InternalFortXTrans.g:1947:2: ( rule__Component__ImportsAssignment_2 )*
            {
             before(grammarAccess.getComponentAccess().getImportsAssignment_2()); 
            // InternalFortXTrans.g:1948:2: ( rule__Component__ImportsAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==39) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalFortXTrans.g:1948:3: rule__Component__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Component__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalFortXTrans.g:1956:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1960:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalFortXTrans.g:1961:2: rule__Component__Group__3__Impl rule__Component__Group__4
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
    // InternalFortXTrans.g:1968:1: rule__Component__Group__3__Impl : ( ( ( rule__Component__ExportsAssignment_3 ) ) ( ( rule__Component__ExportsAssignment_3 )* ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1972:1: ( ( ( ( rule__Component__ExportsAssignment_3 ) ) ( ( rule__Component__ExportsAssignment_3 )* ) ) )
            // InternalFortXTrans.g:1973:1: ( ( ( rule__Component__ExportsAssignment_3 ) ) ( ( rule__Component__ExportsAssignment_3 )* ) )
            {
            // InternalFortXTrans.g:1973:1: ( ( ( rule__Component__ExportsAssignment_3 ) ) ( ( rule__Component__ExportsAssignment_3 )* ) )
            // InternalFortXTrans.g:1974:2: ( ( rule__Component__ExportsAssignment_3 ) ) ( ( rule__Component__ExportsAssignment_3 )* )
            {
            // InternalFortXTrans.g:1974:2: ( ( rule__Component__ExportsAssignment_3 ) )
            // InternalFortXTrans.g:1975:3: ( rule__Component__ExportsAssignment_3 )
            {
             before(grammarAccess.getComponentAccess().getExportsAssignment_3()); 
            // InternalFortXTrans.g:1976:3: ( rule__Component__ExportsAssignment_3 )
            // InternalFortXTrans.g:1976:4: rule__Component__ExportsAssignment_3
            {
            pushFollow(FOLLOW_9);
            rule__Component__ExportsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getExportsAssignment_3()); 

            }

            // InternalFortXTrans.g:1979:2: ( ( rule__Component__ExportsAssignment_3 )* )
            // InternalFortXTrans.g:1980:3: ( rule__Component__ExportsAssignment_3 )*
            {
             before(grammarAccess.getComponentAccess().getExportsAssignment_3()); 
            // InternalFortXTrans.g:1981:3: ( rule__Component__ExportsAssignment_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==40) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalFortXTrans.g:1981:4: rule__Component__ExportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Component__ExportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalFortXTrans.g:1990:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:1994:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalFortXTrans.g:1995:2: rule__Component__Group__4__Impl rule__Component__Group__5
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
    // InternalFortXTrans.g:2002:1: rule__Component__Group__4__Impl : ( ( rule__Component__DeclsAssignment_4 )* ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2006:1: ( ( ( rule__Component__DeclsAssignment_4 )* ) )
            // InternalFortXTrans.g:2007:1: ( ( rule__Component__DeclsAssignment_4 )* )
            {
            // InternalFortXTrans.g:2007:1: ( ( rule__Component__DeclsAssignment_4 )* )
            // InternalFortXTrans.g:2008:2: ( rule__Component__DeclsAssignment_4 )*
            {
             before(grammarAccess.getComponentAccess().getDeclsAssignment_4()); 
            // InternalFortXTrans.g:2009:2: ( rule__Component__DeclsAssignment_4 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||LA30_0==20||LA30_0==31||(LA30_0>=42 && LA30_0<=45)||LA30_0==51) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalFortXTrans.g:2009:3: rule__Component__DeclsAssignment_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Component__DeclsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalFortXTrans.g:2017:1: rule__Component__Group__5 : rule__Component__Group__5__Impl ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2021:1: ( rule__Component__Group__5__Impl )
            // InternalFortXTrans.g:2022:2: rule__Component__Group__5__Impl
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
    // InternalFortXTrans.g:2028:1: rule__Component__Group__5__Impl : ( 'end' ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2032:1: ( ( 'end' ) )
            // InternalFortXTrans.g:2033:1: ( 'end' )
            {
            // InternalFortXTrans.g:2033:1: ( 'end' )
            // InternalFortXTrans.g:2034:2: 'end'
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
    // InternalFortXTrans.g:2044:1: rule__API__Group__0 : rule__API__Group__0__Impl rule__API__Group__1 ;
    public final void rule__API__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2048:1: ( rule__API__Group__0__Impl rule__API__Group__1 )
            // InternalFortXTrans.g:2049:2: rule__API__Group__0__Impl rule__API__Group__1
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
    // InternalFortXTrans.g:2056:1: rule__API__Group__0__Impl : ( 'api' ) ;
    public final void rule__API__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2060:1: ( ( 'api' ) )
            // InternalFortXTrans.g:2061:1: ( 'api' )
            {
            // InternalFortXTrans.g:2061:1: ( 'api' )
            // InternalFortXTrans.g:2062:2: 'api'
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
    // InternalFortXTrans.g:2071:1: rule__API__Group__1 : rule__API__Group__1__Impl rule__API__Group__2 ;
    public final void rule__API__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2075:1: ( rule__API__Group__1__Impl rule__API__Group__2 )
            // InternalFortXTrans.g:2076:2: rule__API__Group__1__Impl rule__API__Group__2
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
    // InternalFortXTrans.g:2083:1: rule__API__Group__1__Impl : ( ( rule__API__NameAssignment_1 ) ) ;
    public final void rule__API__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2087:1: ( ( ( rule__API__NameAssignment_1 ) ) )
            // InternalFortXTrans.g:2088:1: ( ( rule__API__NameAssignment_1 ) )
            {
            // InternalFortXTrans.g:2088:1: ( ( rule__API__NameAssignment_1 ) )
            // InternalFortXTrans.g:2089:2: ( rule__API__NameAssignment_1 )
            {
             before(grammarAccess.getAPIAccess().getNameAssignment_1()); 
            // InternalFortXTrans.g:2090:2: ( rule__API__NameAssignment_1 )
            // InternalFortXTrans.g:2090:3: rule__API__NameAssignment_1
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
    // InternalFortXTrans.g:2098:1: rule__API__Group__2 : rule__API__Group__2__Impl rule__API__Group__3 ;
    public final void rule__API__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2102:1: ( rule__API__Group__2__Impl rule__API__Group__3 )
            // InternalFortXTrans.g:2103:2: rule__API__Group__2__Impl rule__API__Group__3
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
    // InternalFortXTrans.g:2110:1: rule__API__Group__2__Impl : ( ( rule__API__ImportsAssignment_2 )* ) ;
    public final void rule__API__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2114:1: ( ( ( rule__API__ImportsAssignment_2 )* ) )
            // InternalFortXTrans.g:2115:1: ( ( rule__API__ImportsAssignment_2 )* )
            {
            // InternalFortXTrans.g:2115:1: ( ( rule__API__ImportsAssignment_2 )* )
            // InternalFortXTrans.g:2116:2: ( rule__API__ImportsAssignment_2 )*
            {
             before(grammarAccess.getAPIAccess().getImportsAssignment_2()); 
            // InternalFortXTrans.g:2117:2: ( rule__API__ImportsAssignment_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==39) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalFortXTrans.g:2117:3: rule__API__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__API__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalFortXTrans.g:2125:1: rule__API__Group__3 : rule__API__Group__3__Impl ;
    public final void rule__API__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2129:1: ( rule__API__Group__3__Impl )
            // InternalFortXTrans.g:2130:2: rule__API__Group__3__Impl
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
    // InternalFortXTrans.g:2136:1: rule__API__Group__3__Impl : ( 'end' ) ;
    public final void rule__API__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2140:1: ( ( 'end' ) )
            // InternalFortXTrans.g:2141:1: ( 'end' )
            {
            // InternalFortXTrans.g:2141:1: ( 'end' )
            // InternalFortXTrans.g:2142:2: 'end'
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
    // InternalFortXTrans.g:2152:1: rule__Import__Group_0__0 : rule__Import__Group_0__0__Impl rule__Import__Group_0__1 ;
    public final void rule__Import__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2156:1: ( rule__Import__Group_0__0__Impl rule__Import__Group_0__1 )
            // InternalFortXTrans.g:2157:2: rule__Import__Group_0__0__Impl rule__Import__Group_0__1
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
    // InternalFortXTrans.g:2164:1: rule__Import__Group_0__0__Impl : ( ( rule__Import__ImpsAssignment_0_0 ) ) ;
    public final void rule__Import__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2168:1: ( ( ( rule__Import__ImpsAssignment_0_0 ) ) )
            // InternalFortXTrans.g:2169:1: ( ( rule__Import__ImpsAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:2169:1: ( ( rule__Import__ImpsAssignment_0_0 ) )
            // InternalFortXTrans.g:2170:2: ( rule__Import__ImpsAssignment_0_0 )
            {
             before(grammarAccess.getImportAccess().getImpsAssignment_0_0()); 
            // InternalFortXTrans.g:2171:2: ( rule__Import__ImpsAssignment_0_0 )
            // InternalFortXTrans.g:2171:3: rule__Import__ImpsAssignment_0_0
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
    // InternalFortXTrans.g:2179:1: rule__Import__Group_0__1 : rule__Import__Group_0__1__Impl ;
    public final void rule__Import__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2183:1: ( rule__Import__Group_0__1__Impl )
            // InternalFortXTrans.g:2184:2: rule__Import__Group_0__1__Impl
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
    // InternalFortXTrans.g:2190:1: rule__Import__Group_0__1__Impl : ( ( rule__Import__ImportedNamesAssignment_0_1 ) ) ;
    public final void rule__Import__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2194:1: ( ( ( rule__Import__ImportedNamesAssignment_0_1 ) ) )
            // InternalFortXTrans.g:2195:1: ( ( rule__Import__ImportedNamesAssignment_0_1 ) )
            {
            // InternalFortXTrans.g:2195:1: ( ( rule__Import__ImportedNamesAssignment_0_1 ) )
            // InternalFortXTrans.g:2196:2: ( rule__Import__ImportedNamesAssignment_0_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamesAssignment_0_1()); 
            // InternalFortXTrans.g:2197:2: ( rule__Import__ImportedNamesAssignment_0_1 )
            // InternalFortXTrans.g:2197:3: rule__Import__ImportedNamesAssignment_0_1
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
    // InternalFortXTrans.g:2206:1: rule__Import__Group_1__0 : rule__Import__Group_1__0__Impl rule__Import__Group_1__1 ;
    public final void rule__Import__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2210:1: ( rule__Import__Group_1__0__Impl rule__Import__Group_1__1 )
            // InternalFortXTrans.g:2211:2: rule__Import__Group_1__0__Impl rule__Import__Group_1__1
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
    // InternalFortXTrans.g:2218:1: rule__Import__Group_1__0__Impl : ( ( rule__Import__ImpsAssignment_1_0 ) ) ;
    public final void rule__Import__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2222:1: ( ( ( rule__Import__ImpsAssignment_1_0 ) ) )
            // InternalFortXTrans.g:2223:1: ( ( rule__Import__ImpsAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:2223:1: ( ( rule__Import__ImpsAssignment_1_0 ) )
            // InternalFortXTrans.g:2224:2: ( rule__Import__ImpsAssignment_1_0 )
            {
             before(grammarAccess.getImportAccess().getImpsAssignment_1_0()); 
            // InternalFortXTrans.g:2225:2: ( rule__Import__ImpsAssignment_1_0 )
            // InternalFortXTrans.g:2225:3: rule__Import__ImpsAssignment_1_0
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
    // InternalFortXTrans.g:2233:1: rule__Import__Group_1__1 : rule__Import__Group_1__1__Impl rule__Import__Group_1__2 ;
    public final void rule__Import__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2237:1: ( rule__Import__Group_1__1__Impl rule__Import__Group_1__2 )
            // InternalFortXTrans.g:2238:2: rule__Import__Group_1__1__Impl rule__Import__Group_1__2
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
    // InternalFortXTrans.g:2245:1: rule__Import__Group_1__1__Impl : ( ( rule__Import__ApiAssignment_1_1 ) ) ;
    public final void rule__Import__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2249:1: ( ( ( rule__Import__ApiAssignment_1_1 ) ) )
            // InternalFortXTrans.g:2250:1: ( ( rule__Import__ApiAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:2250:1: ( ( rule__Import__ApiAssignment_1_1 ) )
            // InternalFortXTrans.g:2251:2: ( rule__Import__ApiAssignment_1_1 )
            {
             before(grammarAccess.getImportAccess().getApiAssignment_1_1()); 
            // InternalFortXTrans.g:2252:2: ( rule__Import__ApiAssignment_1_1 )
            // InternalFortXTrans.g:2252:3: rule__Import__ApiAssignment_1_1
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
    // InternalFortXTrans.g:2260:1: rule__Import__Group_1__2 : rule__Import__Group_1__2__Impl ;
    public final void rule__Import__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2264:1: ( rule__Import__Group_1__2__Impl )
            // InternalFortXTrans.g:2265:2: rule__Import__Group_1__2__Impl
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
    // InternalFortXTrans.g:2271:1: rule__Import__Group_1__2__Impl : ( ( rule__Import__AliasedimportedNamesAssignment_1_2 ) ) ;
    public final void rule__Import__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2275:1: ( ( ( rule__Import__AliasedimportedNamesAssignment_1_2 ) ) )
            // InternalFortXTrans.g:2276:1: ( ( rule__Import__AliasedimportedNamesAssignment_1_2 ) )
            {
            // InternalFortXTrans.g:2276:1: ( ( rule__Import__AliasedimportedNamesAssignment_1_2 ) )
            // InternalFortXTrans.g:2277:2: ( rule__Import__AliasedimportedNamesAssignment_1_2 )
            {
             before(grammarAccess.getImportAccess().getAliasedimportedNamesAssignment_1_2()); 
            // InternalFortXTrans.g:2278:2: ( rule__Import__AliasedimportedNamesAssignment_1_2 )
            // InternalFortXTrans.g:2278:3: rule__Import__AliasedimportedNamesAssignment_1_2
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
    // InternalFortXTrans.g:2287:1: rule__Export__Group_0__0 : rule__Export__Group_0__0__Impl rule__Export__Group_0__1 ;
    public final void rule__Export__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2291:1: ( rule__Export__Group_0__0__Impl rule__Export__Group_0__1 )
            // InternalFortXTrans.g:2292:2: rule__Export__Group_0__0__Impl rule__Export__Group_0__1
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
    // InternalFortXTrans.g:2299:1: rule__Export__Group_0__0__Impl : ( ( rule__Export__ExpAssignment_0_0 ) ) ;
    public final void rule__Export__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2303:1: ( ( ( rule__Export__ExpAssignment_0_0 ) ) )
            // InternalFortXTrans.g:2304:1: ( ( rule__Export__ExpAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:2304:1: ( ( rule__Export__ExpAssignment_0_0 ) )
            // InternalFortXTrans.g:2305:2: ( rule__Export__ExpAssignment_0_0 )
            {
             before(grammarAccess.getExportAccess().getExpAssignment_0_0()); 
            // InternalFortXTrans.g:2306:2: ( rule__Export__ExpAssignment_0_0 )
            // InternalFortXTrans.g:2306:3: rule__Export__ExpAssignment_0_0
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
    // InternalFortXTrans.g:2314:1: rule__Export__Group_0__1 : rule__Export__Group_0__1__Impl ;
    public final void rule__Export__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2318:1: ( rule__Export__Group_0__1__Impl )
            // InternalFortXTrans.g:2319:2: rule__Export__Group_0__1__Impl
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
    // InternalFortXTrans.g:2325:1: rule__Export__Group_0__1__Impl : ( ( rule__Export__ExportedNameAssignment_0_1 ) ) ;
    public final void rule__Export__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2329:1: ( ( ( rule__Export__ExportedNameAssignment_0_1 ) ) )
            // InternalFortXTrans.g:2330:1: ( ( rule__Export__ExportedNameAssignment_0_1 ) )
            {
            // InternalFortXTrans.g:2330:1: ( ( rule__Export__ExportedNameAssignment_0_1 ) )
            // InternalFortXTrans.g:2331:2: ( rule__Export__ExportedNameAssignment_0_1 )
            {
             before(grammarAccess.getExportAccess().getExportedNameAssignment_0_1()); 
            // InternalFortXTrans.g:2332:2: ( rule__Export__ExportedNameAssignment_0_1 )
            // InternalFortXTrans.g:2332:3: rule__Export__ExportedNameAssignment_0_1
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
    // InternalFortXTrans.g:2341:1: rule__Export__Group_1__0 : rule__Export__Group_1__0__Impl rule__Export__Group_1__1 ;
    public final void rule__Export__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2345:1: ( rule__Export__Group_1__0__Impl rule__Export__Group_1__1 )
            // InternalFortXTrans.g:2346:2: rule__Export__Group_1__0__Impl rule__Export__Group_1__1
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
    // InternalFortXTrans.g:2353:1: rule__Export__Group_1__0__Impl : ( ( rule__Export__ExpAssignment_1_0 ) ) ;
    public final void rule__Export__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2357:1: ( ( ( rule__Export__ExpAssignment_1_0 ) ) )
            // InternalFortXTrans.g:2358:1: ( ( rule__Export__ExpAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:2358:1: ( ( rule__Export__ExpAssignment_1_0 ) )
            // InternalFortXTrans.g:2359:2: ( rule__Export__ExpAssignment_1_0 )
            {
             before(grammarAccess.getExportAccess().getExpAssignment_1_0()); 
            // InternalFortXTrans.g:2360:2: ( rule__Export__ExpAssignment_1_0 )
            // InternalFortXTrans.g:2360:3: rule__Export__ExpAssignment_1_0
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
    // InternalFortXTrans.g:2368:1: rule__Export__Group_1__1 : rule__Export__Group_1__1__Impl rule__Export__Group_1__2 ;
    public final void rule__Export__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2372:1: ( rule__Export__Group_1__1__Impl rule__Export__Group_1__2 )
            // InternalFortXTrans.g:2373:2: rule__Export__Group_1__1__Impl rule__Export__Group_1__2
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
    // InternalFortXTrans.g:2380:1: rule__Export__Group_1__1__Impl : ( ( rule__Export__BrackAssignment_1_1 ) ) ;
    public final void rule__Export__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2384:1: ( ( ( rule__Export__BrackAssignment_1_1 ) ) )
            // InternalFortXTrans.g:2385:1: ( ( rule__Export__BrackAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:2385:1: ( ( rule__Export__BrackAssignment_1_1 ) )
            // InternalFortXTrans.g:2386:2: ( rule__Export__BrackAssignment_1_1 )
            {
             before(grammarAccess.getExportAccess().getBrackAssignment_1_1()); 
            // InternalFortXTrans.g:2387:2: ( rule__Export__BrackAssignment_1_1 )
            // InternalFortXTrans.g:2387:3: rule__Export__BrackAssignment_1_1
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
    // InternalFortXTrans.g:2395:1: rule__Export__Group_1__2 : rule__Export__Group_1__2__Impl rule__Export__Group_1__3 ;
    public final void rule__Export__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2399:1: ( rule__Export__Group_1__2__Impl rule__Export__Group_1__3 )
            // InternalFortXTrans.g:2400:2: rule__Export__Group_1__2__Impl rule__Export__Group_1__3
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
    // InternalFortXTrans.g:2407:1: rule__Export__Group_1__2__Impl : ( ( rule__Export__ExportedNameAssignment_1_2 ) ) ;
    public final void rule__Export__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2411:1: ( ( ( rule__Export__ExportedNameAssignment_1_2 ) ) )
            // InternalFortXTrans.g:2412:1: ( ( rule__Export__ExportedNameAssignment_1_2 ) )
            {
            // InternalFortXTrans.g:2412:1: ( ( rule__Export__ExportedNameAssignment_1_2 ) )
            // InternalFortXTrans.g:2413:2: ( rule__Export__ExportedNameAssignment_1_2 )
            {
             before(grammarAccess.getExportAccess().getExportedNameAssignment_1_2()); 
            // InternalFortXTrans.g:2414:2: ( rule__Export__ExportedNameAssignment_1_2 )
            // InternalFortXTrans.g:2414:3: rule__Export__ExportedNameAssignment_1_2
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
    // InternalFortXTrans.g:2422:1: rule__Export__Group_1__3 : rule__Export__Group_1__3__Impl rule__Export__Group_1__4 ;
    public final void rule__Export__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2426:1: ( rule__Export__Group_1__3__Impl rule__Export__Group_1__4 )
            // InternalFortXTrans.g:2427:2: rule__Export__Group_1__3__Impl rule__Export__Group_1__4
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
    // InternalFortXTrans.g:2434:1: rule__Export__Group_1__3__Impl : ( ( rule__Export__Group_1_3__0 )* ) ;
    public final void rule__Export__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2438:1: ( ( ( rule__Export__Group_1_3__0 )* ) )
            // InternalFortXTrans.g:2439:1: ( ( rule__Export__Group_1_3__0 )* )
            {
            // InternalFortXTrans.g:2439:1: ( ( rule__Export__Group_1_3__0 )* )
            // InternalFortXTrans.g:2440:2: ( rule__Export__Group_1_3__0 )*
            {
             before(grammarAccess.getExportAccess().getGroup_1_3()); 
            // InternalFortXTrans.g:2441:2: ( rule__Export__Group_1_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==25) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalFortXTrans.g:2441:3: rule__Export__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Export__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalFortXTrans.g:2449:1: rule__Export__Group_1__4 : rule__Export__Group_1__4__Impl ;
    public final void rule__Export__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2453:1: ( rule__Export__Group_1__4__Impl )
            // InternalFortXTrans.g:2454:2: rule__Export__Group_1__4__Impl
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
    // InternalFortXTrans.g:2460:1: rule__Export__Group_1__4__Impl : ( '}' ) ;
    public final void rule__Export__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2464:1: ( ( '}' ) )
            // InternalFortXTrans.g:2465:1: ( '}' )
            {
            // InternalFortXTrans.g:2465:1: ( '}' )
            // InternalFortXTrans.g:2466:2: '}'
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
    // InternalFortXTrans.g:2476:1: rule__Export__Group_1_3__0 : rule__Export__Group_1_3__0__Impl rule__Export__Group_1_3__1 ;
    public final void rule__Export__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2480:1: ( rule__Export__Group_1_3__0__Impl rule__Export__Group_1_3__1 )
            // InternalFortXTrans.g:2481:2: rule__Export__Group_1_3__0__Impl rule__Export__Group_1_3__1
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
    // InternalFortXTrans.g:2488:1: rule__Export__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__Export__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2492:1: ( ( ',' ) )
            // InternalFortXTrans.g:2493:1: ( ',' )
            {
            // InternalFortXTrans.g:2493:1: ( ',' )
            // InternalFortXTrans.g:2494:2: ','
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
    // InternalFortXTrans.g:2503:1: rule__Export__Group_1_3__1 : rule__Export__Group_1_3__1__Impl ;
    public final void rule__Export__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2507:1: ( rule__Export__Group_1_3__1__Impl )
            // InternalFortXTrans.g:2508:2: rule__Export__Group_1_3__1__Impl
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
    // InternalFortXTrans.g:2514:1: rule__Export__Group_1_3__1__Impl : ( ( rule__Export__ExportedNameAssignment_1_3_1 ) ) ;
    public final void rule__Export__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2518:1: ( ( ( rule__Export__ExportedNameAssignment_1_3_1 ) ) )
            // InternalFortXTrans.g:2519:1: ( ( rule__Export__ExportedNameAssignment_1_3_1 ) )
            {
            // InternalFortXTrans.g:2519:1: ( ( rule__Export__ExportedNameAssignment_1_3_1 ) )
            // InternalFortXTrans.g:2520:2: ( rule__Export__ExportedNameAssignment_1_3_1 )
            {
             before(grammarAccess.getExportAccess().getExportedNameAssignment_1_3_1()); 
            // InternalFortXTrans.g:2521:2: ( rule__Export__ExportedNameAssignment_1_3_1 )
            // InternalFortXTrans.g:2521:3: rule__Export__ExportedNameAssignment_1_3_1
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
    // InternalFortXTrans.g:2530:1: rule__ImportedNames__Group_0__0 : rule__ImportedNames__Group_0__0__Impl rule__ImportedNames__Group_0__1 ;
    public final void rule__ImportedNames__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2534:1: ( rule__ImportedNames__Group_0__0__Impl rule__ImportedNames__Group_0__1 )
            // InternalFortXTrans.g:2535:2: rule__ImportedNames__Group_0__0__Impl rule__ImportedNames__Group_0__1
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
    // InternalFortXTrans.g:2542:1: rule__ImportedNames__Group_0__0__Impl : ( ( rule__ImportedNames__ImpnameAssignment_0_0 ) ) ;
    public final void rule__ImportedNames__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2546:1: ( ( ( rule__ImportedNames__ImpnameAssignment_0_0 ) ) )
            // InternalFortXTrans.g:2547:1: ( ( rule__ImportedNames__ImpnameAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:2547:1: ( ( rule__ImportedNames__ImpnameAssignment_0_0 ) )
            // InternalFortXTrans.g:2548:2: ( rule__ImportedNames__ImpnameAssignment_0_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getImpnameAssignment_0_0()); 
            // InternalFortXTrans.g:2549:2: ( rule__ImportedNames__ImpnameAssignment_0_0 )
            // InternalFortXTrans.g:2549:3: rule__ImportedNames__ImpnameAssignment_0_0
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
    // InternalFortXTrans.g:2557:1: rule__ImportedNames__Group_0__1 : rule__ImportedNames__Group_0__1__Impl rule__ImportedNames__Group_0__2 ;
    public final void rule__ImportedNames__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2561:1: ( rule__ImportedNames__Group_0__1__Impl rule__ImportedNames__Group_0__2 )
            // InternalFortXTrans.g:2562:2: rule__ImportedNames__Group_0__1__Impl rule__ImportedNames__Group_0__2
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
    // InternalFortXTrans.g:2569:1: rule__ImportedNames__Group_0__1__Impl : ( '.' ) ;
    public final void rule__ImportedNames__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2573:1: ( ( '.' ) )
            // InternalFortXTrans.g:2574:1: ( '.' )
            {
            // InternalFortXTrans.g:2574:1: ( '.' )
            // InternalFortXTrans.g:2575:2: '.'
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
    // InternalFortXTrans.g:2584:1: rule__ImportedNames__Group_0__2 : rule__ImportedNames__Group_0__2__Impl rule__ImportedNames__Group_0__3 ;
    public final void rule__ImportedNames__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2588:1: ( rule__ImportedNames__Group_0__2__Impl rule__ImportedNames__Group_0__3 )
            // InternalFortXTrans.g:2589:2: rule__ImportedNames__Group_0__2__Impl rule__ImportedNames__Group_0__3
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
    // InternalFortXTrans.g:2596:1: rule__ImportedNames__Group_0__2__Impl : ( '{' ) ;
    public final void rule__ImportedNames__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2600:1: ( ( '{' ) )
            // InternalFortXTrans.g:2601:1: ( '{' )
            {
            // InternalFortXTrans.g:2601:1: ( '{' )
            // InternalFortXTrans.g:2602:2: '{'
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
    // InternalFortXTrans.g:2611:1: rule__ImportedNames__Group_0__3 : rule__ImportedNames__Group_0__3__Impl rule__ImportedNames__Group_0__4 ;
    public final void rule__ImportedNames__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2615:1: ( rule__ImportedNames__Group_0__3__Impl rule__ImportedNames__Group_0__4 )
            // InternalFortXTrans.g:2616:2: rule__ImportedNames__Group_0__3__Impl rule__ImportedNames__Group_0__4
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
    // InternalFortXTrans.g:2623:1: rule__ImportedNames__Group_0__3__Impl : ( RULE_DOTS ) ;
    public final void rule__ImportedNames__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2627:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:2628:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:2628:1: ( RULE_DOTS )
            // InternalFortXTrans.g:2629:2: RULE_DOTS
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
    // InternalFortXTrans.g:2638:1: rule__ImportedNames__Group_0__4 : rule__ImportedNames__Group_0__4__Impl rule__ImportedNames__Group_0__5 ;
    public final void rule__ImportedNames__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2642:1: ( rule__ImportedNames__Group_0__4__Impl rule__ImportedNames__Group_0__5 )
            // InternalFortXTrans.g:2643:2: rule__ImportedNames__Group_0__4__Impl rule__ImportedNames__Group_0__5
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
    // InternalFortXTrans.g:2650:1: rule__ImportedNames__Group_0__4__Impl : ( '}' ) ;
    public final void rule__ImportedNames__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2654:1: ( ( '}' ) )
            // InternalFortXTrans.g:2655:1: ( '}' )
            {
            // InternalFortXTrans.g:2655:1: ( '}' )
            // InternalFortXTrans.g:2656:2: '}'
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
    // InternalFortXTrans.g:2665:1: rule__ImportedNames__Group_0__5 : rule__ImportedNames__Group_0__5__Impl ;
    public final void rule__ImportedNames__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2669:1: ( rule__ImportedNames__Group_0__5__Impl )
            // InternalFortXTrans.g:2670:2: rule__ImportedNames__Group_0__5__Impl
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
    // InternalFortXTrans.g:2676:1: rule__ImportedNames__Group_0__5__Impl : ( ( rule__ImportedNames__Group_0_5__0 )? ) ;
    public final void rule__ImportedNames__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2680:1: ( ( ( rule__ImportedNames__Group_0_5__0 )? ) )
            // InternalFortXTrans.g:2681:1: ( ( rule__ImportedNames__Group_0_5__0 )? )
            {
            // InternalFortXTrans.g:2681:1: ( ( rule__ImportedNames__Group_0_5__0 )? )
            // InternalFortXTrans.g:2682:2: ( rule__ImportedNames__Group_0_5__0 )?
            {
             before(grammarAccess.getImportedNamesAccess().getGroup_0_5()); 
            // InternalFortXTrans.g:2683:2: ( rule__ImportedNames__Group_0_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==41) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalFortXTrans.g:2683:3: rule__ImportedNames__Group_0_5__0
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
    // InternalFortXTrans.g:2692:1: rule__ImportedNames__Group_0_5__0 : rule__ImportedNames__Group_0_5__0__Impl rule__ImportedNames__Group_0_5__1 ;
    public final void rule__ImportedNames__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2696:1: ( rule__ImportedNames__Group_0_5__0__Impl rule__ImportedNames__Group_0_5__1 )
            // InternalFortXTrans.g:2697:2: rule__ImportedNames__Group_0_5__0__Impl rule__ImportedNames__Group_0_5__1
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
    // InternalFortXTrans.g:2704:1: rule__ImportedNames__Group_0_5__0__Impl : ( ( rule__ImportedNames__ExceptAssignment_0_5_0 ) ) ;
    public final void rule__ImportedNames__Group_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2708:1: ( ( ( rule__ImportedNames__ExceptAssignment_0_5_0 ) ) )
            // InternalFortXTrans.g:2709:1: ( ( rule__ImportedNames__ExceptAssignment_0_5_0 ) )
            {
            // InternalFortXTrans.g:2709:1: ( ( rule__ImportedNames__ExceptAssignment_0_5_0 ) )
            // InternalFortXTrans.g:2710:2: ( rule__ImportedNames__ExceptAssignment_0_5_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getExceptAssignment_0_5_0()); 
            // InternalFortXTrans.g:2711:2: ( rule__ImportedNames__ExceptAssignment_0_5_0 )
            // InternalFortXTrans.g:2711:3: rule__ImportedNames__ExceptAssignment_0_5_0
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
    // InternalFortXTrans.g:2719:1: rule__ImportedNames__Group_0_5__1 : rule__ImportedNames__Group_0_5__1__Impl ;
    public final void rule__ImportedNames__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2723:1: ( rule__ImportedNames__Group_0_5__1__Impl )
            // InternalFortXTrans.g:2724:2: rule__ImportedNames__Group_0_5__1__Impl
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
    // InternalFortXTrans.g:2730:1: rule__ImportedNames__Group_0_5__1__Impl : ( ( rule__ImportedNames__SimpAssignment_0_5_1 ) ) ;
    public final void rule__ImportedNames__Group_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2734:1: ( ( ( rule__ImportedNames__SimpAssignment_0_5_1 ) ) )
            // InternalFortXTrans.g:2735:1: ( ( rule__ImportedNames__SimpAssignment_0_5_1 ) )
            {
            // InternalFortXTrans.g:2735:1: ( ( rule__ImportedNames__SimpAssignment_0_5_1 ) )
            // InternalFortXTrans.g:2736:2: ( rule__ImportedNames__SimpAssignment_0_5_1 )
            {
             before(grammarAccess.getImportedNamesAccess().getSimpAssignment_0_5_1()); 
            // InternalFortXTrans.g:2737:2: ( rule__ImportedNames__SimpAssignment_0_5_1 )
            // InternalFortXTrans.g:2737:3: rule__ImportedNames__SimpAssignment_0_5_1
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
    // InternalFortXTrans.g:2746:1: rule__ImportedNames__Group_1__0 : rule__ImportedNames__Group_1__0__Impl rule__ImportedNames__Group_1__1 ;
    public final void rule__ImportedNames__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2750:1: ( rule__ImportedNames__Group_1__0__Impl rule__ImportedNames__Group_1__1 )
            // InternalFortXTrans.g:2751:2: rule__ImportedNames__Group_1__0__Impl rule__ImportedNames__Group_1__1
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
    // InternalFortXTrans.g:2758:1: rule__ImportedNames__Group_1__0__Impl : ( ( rule__ImportedNames__ImpnameAssignment_1_0 ) ) ;
    public final void rule__ImportedNames__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2762:1: ( ( ( rule__ImportedNames__ImpnameAssignment_1_0 ) ) )
            // InternalFortXTrans.g:2763:1: ( ( rule__ImportedNames__ImpnameAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:2763:1: ( ( rule__ImportedNames__ImpnameAssignment_1_0 ) )
            // InternalFortXTrans.g:2764:2: ( rule__ImportedNames__ImpnameAssignment_1_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getImpnameAssignment_1_0()); 
            // InternalFortXTrans.g:2765:2: ( rule__ImportedNames__ImpnameAssignment_1_0 )
            // InternalFortXTrans.g:2765:3: rule__ImportedNames__ImpnameAssignment_1_0
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
    // InternalFortXTrans.g:2773:1: rule__ImportedNames__Group_1__1 : rule__ImportedNames__Group_1__1__Impl rule__ImportedNames__Group_1__2 ;
    public final void rule__ImportedNames__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2777:1: ( rule__ImportedNames__Group_1__1__Impl rule__ImportedNames__Group_1__2 )
            // InternalFortXTrans.g:2778:2: rule__ImportedNames__Group_1__1__Impl rule__ImportedNames__Group_1__2
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
    // InternalFortXTrans.g:2785:1: rule__ImportedNames__Group_1__1__Impl : ( '.' ) ;
    public final void rule__ImportedNames__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2789:1: ( ( '.' ) )
            // InternalFortXTrans.g:2790:1: ( '.' )
            {
            // InternalFortXTrans.g:2790:1: ( '.' )
            // InternalFortXTrans.g:2791:2: '.'
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
    // InternalFortXTrans.g:2800:1: rule__ImportedNames__Group_1__2 : rule__ImportedNames__Group_1__2__Impl rule__ImportedNames__Group_1__3 ;
    public final void rule__ImportedNames__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2804:1: ( rule__ImportedNames__Group_1__2__Impl rule__ImportedNames__Group_1__3 )
            // InternalFortXTrans.g:2805:2: rule__ImportedNames__Group_1__2__Impl rule__ImportedNames__Group_1__3
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
    // InternalFortXTrans.g:2812:1: rule__ImportedNames__Group_1__2__Impl : ( '{' ) ;
    public final void rule__ImportedNames__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2816:1: ( ( '{' ) )
            // InternalFortXTrans.g:2817:1: ( '{' )
            {
            // InternalFortXTrans.g:2817:1: ( '{' )
            // InternalFortXTrans.g:2818:2: '{'
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
    // InternalFortXTrans.g:2827:1: rule__ImportedNames__Group_1__3 : rule__ImportedNames__Group_1__3__Impl rule__ImportedNames__Group_1__4 ;
    public final void rule__ImportedNames__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2831:1: ( rule__ImportedNames__Group_1__3__Impl rule__ImportedNames__Group_1__4 )
            // InternalFortXTrans.g:2832:2: rule__ImportedNames__Group_1__3__Impl rule__ImportedNames__Group_1__4
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
    // InternalFortXTrans.g:2839:1: rule__ImportedNames__Group_1__3__Impl : ( ( rule__ImportedNames__SimpListAssignment_1_3 ) ) ;
    public final void rule__ImportedNames__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2843:1: ( ( ( rule__ImportedNames__SimpListAssignment_1_3 ) ) )
            // InternalFortXTrans.g:2844:1: ( ( rule__ImportedNames__SimpListAssignment_1_3 ) )
            {
            // InternalFortXTrans.g:2844:1: ( ( rule__ImportedNames__SimpListAssignment_1_3 ) )
            // InternalFortXTrans.g:2845:2: ( rule__ImportedNames__SimpListAssignment_1_3 )
            {
             before(grammarAccess.getImportedNamesAccess().getSimpListAssignment_1_3()); 
            // InternalFortXTrans.g:2846:2: ( rule__ImportedNames__SimpListAssignment_1_3 )
            // InternalFortXTrans.g:2846:3: rule__ImportedNames__SimpListAssignment_1_3
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
    // InternalFortXTrans.g:2854:1: rule__ImportedNames__Group_1__4 : rule__ImportedNames__Group_1__4__Impl rule__ImportedNames__Group_1__5 ;
    public final void rule__ImportedNames__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2858:1: ( rule__ImportedNames__Group_1__4__Impl rule__ImportedNames__Group_1__5 )
            // InternalFortXTrans.g:2859:2: rule__ImportedNames__Group_1__4__Impl rule__ImportedNames__Group_1__5
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
    // InternalFortXTrans.g:2866:1: rule__ImportedNames__Group_1__4__Impl : ( ( rule__ImportedNames__Group_1_4__0 )* ) ;
    public final void rule__ImportedNames__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2870:1: ( ( ( rule__ImportedNames__Group_1_4__0 )* ) )
            // InternalFortXTrans.g:2871:1: ( ( rule__ImportedNames__Group_1_4__0 )* )
            {
            // InternalFortXTrans.g:2871:1: ( ( rule__ImportedNames__Group_1_4__0 )* )
            // InternalFortXTrans.g:2872:2: ( rule__ImportedNames__Group_1_4__0 )*
            {
             before(grammarAccess.getImportedNamesAccess().getGroup_1_4()); 
            // InternalFortXTrans.g:2873:2: ( rule__ImportedNames__Group_1_4__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==25) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==RULE_ID) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // InternalFortXTrans.g:2873:3: rule__ImportedNames__Group_1_4__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ImportedNames__Group_1_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalFortXTrans.g:2881:1: rule__ImportedNames__Group_1__5 : rule__ImportedNames__Group_1__5__Impl rule__ImportedNames__Group_1__6 ;
    public final void rule__ImportedNames__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2885:1: ( rule__ImportedNames__Group_1__5__Impl rule__ImportedNames__Group_1__6 )
            // InternalFortXTrans.g:2886:2: rule__ImportedNames__Group_1__5__Impl rule__ImportedNames__Group_1__6
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
    // InternalFortXTrans.g:2893:1: rule__ImportedNames__Group_1__5__Impl : ( ( rule__ImportedNames__Group_1_5__0 )? ) ;
    public final void rule__ImportedNames__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2897:1: ( ( ( rule__ImportedNames__Group_1_5__0 )? ) )
            // InternalFortXTrans.g:2898:1: ( ( rule__ImportedNames__Group_1_5__0 )? )
            {
            // InternalFortXTrans.g:2898:1: ( ( rule__ImportedNames__Group_1_5__0 )? )
            // InternalFortXTrans.g:2899:2: ( rule__ImportedNames__Group_1_5__0 )?
            {
             before(grammarAccess.getImportedNamesAccess().getGroup_1_5()); 
            // InternalFortXTrans.g:2900:2: ( rule__ImportedNames__Group_1_5__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==25) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalFortXTrans.g:2900:3: rule__ImportedNames__Group_1_5__0
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
    // InternalFortXTrans.g:2908:1: rule__ImportedNames__Group_1__6 : rule__ImportedNames__Group_1__6__Impl ;
    public final void rule__ImportedNames__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2912:1: ( rule__ImportedNames__Group_1__6__Impl )
            // InternalFortXTrans.g:2913:2: rule__ImportedNames__Group_1__6__Impl
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
    // InternalFortXTrans.g:2919:1: rule__ImportedNames__Group_1__6__Impl : ( '}' ) ;
    public final void rule__ImportedNames__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2923:1: ( ( '}' ) )
            // InternalFortXTrans.g:2924:1: ( '}' )
            {
            // InternalFortXTrans.g:2924:1: ( '}' )
            // InternalFortXTrans.g:2925:2: '}'
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
    // InternalFortXTrans.g:2935:1: rule__ImportedNames__Group_1_4__0 : rule__ImportedNames__Group_1_4__0__Impl rule__ImportedNames__Group_1_4__1 ;
    public final void rule__ImportedNames__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2939:1: ( rule__ImportedNames__Group_1_4__0__Impl rule__ImportedNames__Group_1_4__1 )
            // InternalFortXTrans.g:2940:2: rule__ImportedNames__Group_1_4__0__Impl rule__ImportedNames__Group_1_4__1
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
    // InternalFortXTrans.g:2947:1: rule__ImportedNames__Group_1_4__0__Impl : ( ',' ) ;
    public final void rule__ImportedNames__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2951:1: ( ( ',' ) )
            // InternalFortXTrans.g:2952:1: ( ',' )
            {
            // InternalFortXTrans.g:2952:1: ( ',' )
            // InternalFortXTrans.g:2953:2: ','
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
    // InternalFortXTrans.g:2962:1: rule__ImportedNames__Group_1_4__1 : rule__ImportedNames__Group_1_4__1__Impl ;
    public final void rule__ImportedNames__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2966:1: ( rule__ImportedNames__Group_1_4__1__Impl )
            // InternalFortXTrans.g:2967:2: rule__ImportedNames__Group_1_4__1__Impl
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
    // InternalFortXTrans.g:2973:1: rule__ImportedNames__Group_1_4__1__Impl : ( ( rule__ImportedNames__SimpListAssignment_1_4_1 ) ) ;
    public final void rule__ImportedNames__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2977:1: ( ( ( rule__ImportedNames__SimpListAssignment_1_4_1 ) ) )
            // InternalFortXTrans.g:2978:1: ( ( rule__ImportedNames__SimpListAssignment_1_4_1 ) )
            {
            // InternalFortXTrans.g:2978:1: ( ( rule__ImportedNames__SimpListAssignment_1_4_1 ) )
            // InternalFortXTrans.g:2979:2: ( rule__ImportedNames__SimpListAssignment_1_4_1 )
            {
             before(grammarAccess.getImportedNamesAccess().getSimpListAssignment_1_4_1()); 
            // InternalFortXTrans.g:2980:2: ( rule__ImportedNames__SimpListAssignment_1_4_1 )
            // InternalFortXTrans.g:2980:3: rule__ImportedNames__SimpListAssignment_1_4_1
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
    // InternalFortXTrans.g:2989:1: rule__ImportedNames__Group_1_5__0 : rule__ImportedNames__Group_1_5__0__Impl rule__ImportedNames__Group_1_5__1 ;
    public final void rule__ImportedNames__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:2993:1: ( rule__ImportedNames__Group_1_5__0__Impl rule__ImportedNames__Group_1_5__1 )
            // InternalFortXTrans.g:2994:2: rule__ImportedNames__Group_1_5__0__Impl rule__ImportedNames__Group_1_5__1
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
    // InternalFortXTrans.g:3001:1: rule__ImportedNames__Group_1_5__0__Impl : ( ( rule__ImportedNames__CommaAssignment_1_5_0 ) ) ;
    public final void rule__ImportedNames__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3005:1: ( ( ( rule__ImportedNames__CommaAssignment_1_5_0 ) ) )
            // InternalFortXTrans.g:3006:1: ( ( rule__ImportedNames__CommaAssignment_1_5_0 ) )
            {
            // InternalFortXTrans.g:3006:1: ( ( rule__ImportedNames__CommaAssignment_1_5_0 ) )
            // InternalFortXTrans.g:3007:2: ( rule__ImportedNames__CommaAssignment_1_5_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getCommaAssignment_1_5_0()); 
            // InternalFortXTrans.g:3008:2: ( rule__ImportedNames__CommaAssignment_1_5_0 )
            // InternalFortXTrans.g:3008:3: rule__ImportedNames__CommaAssignment_1_5_0
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
    // InternalFortXTrans.g:3016:1: rule__ImportedNames__Group_1_5__1 : rule__ImportedNames__Group_1_5__1__Impl ;
    public final void rule__ImportedNames__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3020:1: ( rule__ImportedNames__Group_1_5__1__Impl )
            // InternalFortXTrans.g:3021:2: rule__ImportedNames__Group_1_5__1__Impl
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
    // InternalFortXTrans.g:3027:1: rule__ImportedNames__Group_1_5__1__Impl : ( ( rule__ImportedNames__DotsAssignment_1_5_1 ) ) ;
    public final void rule__ImportedNames__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3031:1: ( ( ( rule__ImportedNames__DotsAssignment_1_5_1 ) ) )
            // InternalFortXTrans.g:3032:1: ( ( rule__ImportedNames__DotsAssignment_1_5_1 ) )
            {
            // InternalFortXTrans.g:3032:1: ( ( rule__ImportedNames__DotsAssignment_1_5_1 ) )
            // InternalFortXTrans.g:3033:2: ( rule__ImportedNames__DotsAssignment_1_5_1 )
            {
             before(grammarAccess.getImportedNamesAccess().getDotsAssignment_1_5_1()); 
            // InternalFortXTrans.g:3034:2: ( rule__ImportedNames__DotsAssignment_1_5_1 )
            // InternalFortXTrans.g:3034:3: rule__ImportedNames__DotsAssignment_1_5_1
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
    // InternalFortXTrans.g:3043:1: rule__ImportedNames__Group_2__0 : rule__ImportedNames__Group_2__0__Impl rule__ImportedNames__Group_2__1 ;
    public final void rule__ImportedNames__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3047:1: ( rule__ImportedNames__Group_2__0__Impl rule__ImportedNames__Group_2__1 )
            // InternalFortXTrans.g:3048:2: rule__ImportedNames__Group_2__0__Impl rule__ImportedNames__Group_2__1
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
    // InternalFortXTrans.g:3055:1: rule__ImportedNames__Group_2__0__Impl : ( ( rule__ImportedNames__ImpnameAssignment_2_0 ) ) ;
    public final void rule__ImportedNames__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3059:1: ( ( ( rule__ImportedNames__ImpnameAssignment_2_0 ) ) )
            // InternalFortXTrans.g:3060:1: ( ( rule__ImportedNames__ImpnameAssignment_2_0 ) )
            {
            // InternalFortXTrans.g:3060:1: ( ( rule__ImportedNames__ImpnameAssignment_2_0 ) )
            // InternalFortXTrans.g:3061:2: ( rule__ImportedNames__ImpnameAssignment_2_0 )
            {
             before(grammarAccess.getImportedNamesAccess().getImpnameAssignment_2_0()); 
            // InternalFortXTrans.g:3062:2: ( rule__ImportedNames__ImpnameAssignment_2_0 )
            // InternalFortXTrans.g:3062:3: rule__ImportedNames__ImpnameAssignment_2_0
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
    // InternalFortXTrans.g:3070:1: rule__ImportedNames__Group_2__1 : rule__ImportedNames__Group_2__1__Impl ;
    public final void rule__ImportedNames__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3074:1: ( rule__ImportedNames__Group_2__1__Impl )
            // InternalFortXTrans.g:3075:2: rule__ImportedNames__Group_2__1__Impl
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
    // InternalFortXTrans.g:3081:1: rule__ImportedNames__Group_2__1__Impl : ( ( rule__ImportedNames__Group_2_1__0 )? ) ;
    public final void rule__ImportedNames__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3085:1: ( ( ( rule__ImportedNames__Group_2_1__0 )? ) )
            // InternalFortXTrans.g:3086:1: ( ( rule__ImportedNames__Group_2_1__0 )? )
            {
            // InternalFortXTrans.g:3086:1: ( ( rule__ImportedNames__Group_2_1__0 )? )
            // InternalFortXTrans.g:3087:2: ( rule__ImportedNames__Group_2_1__0 )?
            {
             before(grammarAccess.getImportedNamesAccess().getGroup_2_1()); 
            // InternalFortXTrans.g:3088:2: ( rule__ImportedNames__Group_2_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==28) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalFortXTrans.g:3088:3: rule__ImportedNames__Group_2_1__0
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
    // InternalFortXTrans.g:3097:1: rule__ImportedNames__Group_2_1__0 : rule__ImportedNames__Group_2_1__0__Impl rule__ImportedNames__Group_2_1__1 ;
    public final void rule__ImportedNames__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3101:1: ( rule__ImportedNames__Group_2_1__0__Impl rule__ImportedNames__Group_2_1__1 )
            // InternalFortXTrans.g:3102:2: rule__ImportedNames__Group_2_1__0__Impl rule__ImportedNames__Group_2_1__1
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
    // InternalFortXTrans.g:3109:1: rule__ImportedNames__Group_2_1__0__Impl : ( 'as' ) ;
    public final void rule__ImportedNames__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3113:1: ( ( 'as' ) )
            // InternalFortXTrans.g:3114:1: ( 'as' )
            {
            // InternalFortXTrans.g:3114:1: ( 'as' )
            // InternalFortXTrans.g:3115:2: 'as'
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
    // InternalFortXTrans.g:3124:1: rule__ImportedNames__Group_2_1__1 : rule__ImportedNames__Group_2_1__1__Impl ;
    public final void rule__ImportedNames__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3128:1: ( rule__ImportedNames__Group_2_1__1__Impl )
            // InternalFortXTrans.g:3129:2: rule__ImportedNames__Group_2_1__1__Impl
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
    // InternalFortXTrans.g:3135:1: rule__ImportedNames__Group_2_1__1__Impl : ( ( rule__ImportedNames__AsnameAssignment_2_1_1 ) ) ;
    public final void rule__ImportedNames__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3139:1: ( ( ( rule__ImportedNames__AsnameAssignment_2_1_1 ) ) )
            // InternalFortXTrans.g:3140:1: ( ( rule__ImportedNames__AsnameAssignment_2_1_1 ) )
            {
            // InternalFortXTrans.g:3140:1: ( ( rule__ImportedNames__AsnameAssignment_2_1_1 ) )
            // InternalFortXTrans.g:3141:2: ( rule__ImportedNames__AsnameAssignment_2_1_1 )
            {
             before(grammarAccess.getImportedNamesAccess().getAsnameAssignment_2_1_1()); 
            // InternalFortXTrans.g:3142:2: ( rule__ImportedNames__AsnameAssignment_2_1_1 )
            // InternalFortXTrans.g:3142:3: rule__ImportedNames__AsnameAssignment_2_1_1
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
    // InternalFortXTrans.g:3151:1: rule__QualifiedName__Group_0__0 : rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1 ;
    public final void rule__QualifiedName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3155:1: ( rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1 )
            // InternalFortXTrans.g:3156:2: rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1
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
    // InternalFortXTrans.g:3163:1: rule__QualifiedName__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3167:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3168:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3168:1: ( RULE_ID )
            // InternalFortXTrans.g:3169:2: RULE_ID
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
    // InternalFortXTrans.g:3178:1: rule__QualifiedName__Group_0__1 : rule__QualifiedName__Group_0__1__Impl ;
    public final void rule__QualifiedName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3182:1: ( rule__QualifiedName__Group_0__1__Impl )
            // InternalFortXTrans.g:3183:2: rule__QualifiedName__Group_0__1__Impl
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
    // InternalFortXTrans.g:3189:1: rule__QualifiedName__Group_0__1__Impl : ( RULE_DOTS ) ;
    public final void rule__QualifiedName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3193:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:3194:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:3194:1: ( RULE_DOTS )
            // InternalFortXTrans.g:3195:2: RULE_DOTS
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
    // InternalFortXTrans.g:3205:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3209:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalFortXTrans.g:3210:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalFortXTrans.g:3217:1: rule__QualifiedName__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3221:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3222:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3222:1: ( RULE_ID )
            // InternalFortXTrans.g:3223:2: RULE_ID
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
    // InternalFortXTrans.g:3232:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl rule__QualifiedName__Group_1__2 ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3236:1: ( rule__QualifiedName__Group_1__1__Impl rule__QualifiedName__Group_1__2 )
            // InternalFortXTrans.g:3237:2: rule__QualifiedName__Group_1__1__Impl rule__QualifiedName__Group_1__2
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
    // InternalFortXTrans.g:3244:1: rule__QualifiedName__Group_1__1__Impl : ( ( rule__QualifiedName__Group_1_1__0 )* ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3248:1: ( ( ( rule__QualifiedName__Group_1_1__0 )* ) )
            // InternalFortXTrans.g:3249:1: ( ( rule__QualifiedName__Group_1_1__0 )* )
            {
            // InternalFortXTrans.g:3249:1: ( ( rule__QualifiedName__Group_1_1__0 )* )
            // InternalFortXTrans.g:3250:2: ( rule__QualifiedName__Group_1_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1_1()); 
            // InternalFortXTrans.g:3251:2: ( rule__QualifiedName__Group_1_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==26) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalFortXTrans.g:3251:3: rule__QualifiedName__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__QualifiedName__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalFortXTrans.g:3259:1: rule__QualifiedName__Group_1__2 : rule__QualifiedName__Group_1__2__Impl ;
    public final void rule__QualifiedName__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3263:1: ( rule__QualifiedName__Group_1__2__Impl )
            // InternalFortXTrans.g:3264:2: rule__QualifiedName__Group_1__2__Impl
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
    // InternalFortXTrans.g:3270:1: rule__QualifiedName__Group_1__2__Impl : ( RULE_DOTS ) ;
    public final void rule__QualifiedName__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3274:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:3275:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:3275:1: ( RULE_DOTS )
            // InternalFortXTrans.g:3276:2: RULE_DOTS
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
    // InternalFortXTrans.g:3286:1: rule__QualifiedName__Group_1_1__0 : rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1 ;
    public final void rule__QualifiedName__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3290:1: ( rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1 )
            // InternalFortXTrans.g:3291:2: rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1
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
    // InternalFortXTrans.g:3298:1: rule__QualifiedName__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3302:1: ( ( '.' ) )
            // InternalFortXTrans.g:3303:1: ( '.' )
            {
            // InternalFortXTrans.g:3303:1: ( '.' )
            // InternalFortXTrans.g:3304:2: '.'
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
    // InternalFortXTrans.g:3313:1: rule__QualifiedName__Group_1_1__1 : rule__QualifiedName__Group_1_1__1__Impl ;
    public final void rule__QualifiedName__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3317:1: ( rule__QualifiedName__Group_1_1__1__Impl )
            // InternalFortXTrans.g:3318:2: rule__QualifiedName__Group_1_1__1__Impl
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
    // InternalFortXTrans.g:3324:1: rule__QualifiedName__Group_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3328:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3329:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3329:1: ( RULE_ID )
            // InternalFortXTrans.g:3330:2: RULE_ID
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
    // InternalFortXTrans.g:3340:1: rule__QualifiedName__Group_2__0 : rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1 ;
    public final void rule__QualifiedName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3344:1: ( rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1 )
            // InternalFortXTrans.g:3345:2: rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1
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
    // InternalFortXTrans.g:3352:1: rule__QualifiedName__Group_2__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3356:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3357:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3357:1: ( RULE_ID )
            // InternalFortXTrans.g:3358:2: RULE_ID
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
    // InternalFortXTrans.g:3367:1: rule__QualifiedName__Group_2__1 : rule__QualifiedName__Group_2__1__Impl ;
    public final void rule__QualifiedName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3371:1: ( rule__QualifiedName__Group_2__1__Impl )
            // InternalFortXTrans.g:3372:2: rule__QualifiedName__Group_2__1__Impl
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
    // InternalFortXTrans.g:3378:1: rule__QualifiedName__Group_2__1__Impl : ( ( rule__QualifiedName__Group_2_1__0 )* ) ;
    public final void rule__QualifiedName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3382:1: ( ( ( rule__QualifiedName__Group_2_1__0 )* ) )
            // InternalFortXTrans.g:3383:1: ( ( rule__QualifiedName__Group_2_1__0 )* )
            {
            // InternalFortXTrans.g:3383:1: ( ( rule__QualifiedName__Group_2_1__0 )* )
            // InternalFortXTrans.g:3384:2: ( rule__QualifiedName__Group_2_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_2_1()); 
            // InternalFortXTrans.g:3385:2: ( rule__QualifiedName__Group_2_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==26) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalFortXTrans.g:3385:3: rule__QualifiedName__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__QualifiedName__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalFortXTrans.g:3394:1: rule__QualifiedName__Group_2_1__0 : rule__QualifiedName__Group_2_1__0__Impl rule__QualifiedName__Group_2_1__1 ;
    public final void rule__QualifiedName__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3398:1: ( rule__QualifiedName__Group_2_1__0__Impl rule__QualifiedName__Group_2_1__1 )
            // InternalFortXTrans.g:3399:2: rule__QualifiedName__Group_2_1__0__Impl rule__QualifiedName__Group_2_1__1
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
    // InternalFortXTrans.g:3406:1: rule__QualifiedName__Group_2_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3410:1: ( ( '.' ) )
            // InternalFortXTrans.g:3411:1: ( '.' )
            {
            // InternalFortXTrans.g:3411:1: ( '.' )
            // InternalFortXTrans.g:3412:2: '.'
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
    // InternalFortXTrans.g:3421:1: rule__QualifiedName__Group_2_1__1 : rule__QualifiedName__Group_2_1__1__Impl ;
    public final void rule__QualifiedName__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3425:1: ( rule__QualifiedName__Group_2_1__1__Impl )
            // InternalFortXTrans.g:3426:2: rule__QualifiedName__Group_2_1__1__Impl
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
    // InternalFortXTrans.g:3432:1: rule__QualifiedName__Group_2_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3436:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3437:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3437:1: ( RULE_ID )
            // InternalFortXTrans.g:3438:2: RULE_ID
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
    // InternalFortXTrans.g:3448:1: rule__APIName__Group_0__0 : rule__APIName__Group_0__0__Impl rule__APIName__Group_0__1 ;
    public final void rule__APIName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3452:1: ( rule__APIName__Group_0__0__Impl rule__APIName__Group_0__1 )
            // InternalFortXTrans.g:3453:2: rule__APIName__Group_0__0__Impl rule__APIName__Group_0__1
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
    // InternalFortXTrans.g:3460:1: rule__APIName__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3464:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3465:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3465:1: ( RULE_ID )
            // InternalFortXTrans.g:3466:2: RULE_ID
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
    // InternalFortXTrans.g:3475:1: rule__APIName__Group_0__1 : rule__APIName__Group_0__1__Impl ;
    public final void rule__APIName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3479:1: ( rule__APIName__Group_0__1__Impl )
            // InternalFortXTrans.g:3480:2: rule__APIName__Group_0__1__Impl
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
    // InternalFortXTrans.g:3486:1: rule__APIName__Group_0__1__Impl : ( RULE_DOTS ) ;
    public final void rule__APIName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3490:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:3491:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:3491:1: ( RULE_DOTS )
            // InternalFortXTrans.g:3492:2: RULE_DOTS
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
    // InternalFortXTrans.g:3502:1: rule__APIName__Group_1__0 : rule__APIName__Group_1__0__Impl rule__APIName__Group_1__1 ;
    public final void rule__APIName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3506:1: ( rule__APIName__Group_1__0__Impl rule__APIName__Group_1__1 )
            // InternalFortXTrans.g:3507:2: rule__APIName__Group_1__0__Impl rule__APIName__Group_1__1
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
    // InternalFortXTrans.g:3514:1: rule__APIName__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3518:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3519:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3519:1: ( RULE_ID )
            // InternalFortXTrans.g:3520:2: RULE_ID
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
    // InternalFortXTrans.g:3529:1: rule__APIName__Group_1__1 : rule__APIName__Group_1__1__Impl rule__APIName__Group_1__2 ;
    public final void rule__APIName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3533:1: ( rule__APIName__Group_1__1__Impl rule__APIName__Group_1__2 )
            // InternalFortXTrans.g:3534:2: rule__APIName__Group_1__1__Impl rule__APIName__Group_1__2
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
    // InternalFortXTrans.g:3541:1: rule__APIName__Group_1__1__Impl : ( ( rule__APIName__Group_1_1__0 )* ) ;
    public final void rule__APIName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3545:1: ( ( ( rule__APIName__Group_1_1__0 )* ) )
            // InternalFortXTrans.g:3546:1: ( ( rule__APIName__Group_1_1__0 )* )
            {
            // InternalFortXTrans.g:3546:1: ( ( rule__APIName__Group_1_1__0 )* )
            // InternalFortXTrans.g:3547:2: ( rule__APIName__Group_1_1__0 )*
            {
             before(grammarAccess.getAPINameAccess().getGroup_1_1()); 
            // InternalFortXTrans.g:3548:2: ( rule__APIName__Group_1_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==26) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalFortXTrans.g:3548:3: rule__APIName__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__APIName__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalFortXTrans.g:3556:1: rule__APIName__Group_1__2 : rule__APIName__Group_1__2__Impl ;
    public final void rule__APIName__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3560:1: ( rule__APIName__Group_1__2__Impl )
            // InternalFortXTrans.g:3561:2: rule__APIName__Group_1__2__Impl
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
    // InternalFortXTrans.g:3567:1: rule__APIName__Group_1__2__Impl : ( RULE_DOTS ) ;
    public final void rule__APIName__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3571:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:3572:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:3572:1: ( RULE_DOTS )
            // InternalFortXTrans.g:3573:2: RULE_DOTS
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
    // InternalFortXTrans.g:3583:1: rule__APIName__Group_1_1__0 : rule__APIName__Group_1_1__0__Impl rule__APIName__Group_1_1__1 ;
    public final void rule__APIName__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3587:1: ( rule__APIName__Group_1_1__0__Impl rule__APIName__Group_1_1__1 )
            // InternalFortXTrans.g:3588:2: rule__APIName__Group_1_1__0__Impl rule__APIName__Group_1_1__1
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
    // InternalFortXTrans.g:3595:1: rule__APIName__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__APIName__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3599:1: ( ( '.' ) )
            // InternalFortXTrans.g:3600:1: ( '.' )
            {
            // InternalFortXTrans.g:3600:1: ( '.' )
            // InternalFortXTrans.g:3601:2: '.'
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
    // InternalFortXTrans.g:3610:1: rule__APIName__Group_1_1__1 : rule__APIName__Group_1_1__1__Impl ;
    public final void rule__APIName__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3614:1: ( rule__APIName__Group_1_1__1__Impl )
            // InternalFortXTrans.g:3615:2: rule__APIName__Group_1_1__1__Impl
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
    // InternalFortXTrans.g:3621:1: rule__APIName__Group_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3625:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3626:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3626:1: ( RULE_ID )
            // InternalFortXTrans.g:3627:2: RULE_ID
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
    // InternalFortXTrans.g:3637:1: rule__APIName__Group_2__0 : rule__APIName__Group_2__0__Impl rule__APIName__Group_2__1 ;
    public final void rule__APIName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3641:1: ( rule__APIName__Group_2__0__Impl rule__APIName__Group_2__1 )
            // InternalFortXTrans.g:3642:2: rule__APIName__Group_2__0__Impl rule__APIName__Group_2__1
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
    // InternalFortXTrans.g:3649:1: rule__APIName__Group_2__0__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3653:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3654:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3654:1: ( RULE_ID )
            // InternalFortXTrans.g:3655:2: RULE_ID
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
    // InternalFortXTrans.g:3664:1: rule__APIName__Group_2__1 : rule__APIName__Group_2__1__Impl ;
    public final void rule__APIName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3668:1: ( rule__APIName__Group_2__1__Impl )
            // InternalFortXTrans.g:3669:2: rule__APIName__Group_2__1__Impl
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
    // InternalFortXTrans.g:3675:1: rule__APIName__Group_2__1__Impl : ( ( rule__APIName__Group_2_1__0 )* ) ;
    public final void rule__APIName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3679:1: ( ( ( rule__APIName__Group_2_1__0 )* ) )
            // InternalFortXTrans.g:3680:1: ( ( rule__APIName__Group_2_1__0 )* )
            {
            // InternalFortXTrans.g:3680:1: ( ( rule__APIName__Group_2_1__0 )* )
            // InternalFortXTrans.g:3681:2: ( rule__APIName__Group_2_1__0 )*
            {
             before(grammarAccess.getAPINameAccess().getGroup_2_1()); 
            // InternalFortXTrans.g:3682:2: ( rule__APIName__Group_2_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==26) ) {
                    int LA40_2 = input.LA(2);

                    if ( (LA40_2==RULE_ID) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // InternalFortXTrans.g:3682:3: rule__APIName__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__APIName__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalFortXTrans.g:3691:1: rule__APIName__Group_2_1__0 : rule__APIName__Group_2_1__0__Impl rule__APIName__Group_2_1__1 ;
    public final void rule__APIName__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3695:1: ( rule__APIName__Group_2_1__0__Impl rule__APIName__Group_2_1__1 )
            // InternalFortXTrans.g:3696:2: rule__APIName__Group_2_1__0__Impl rule__APIName__Group_2_1__1
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
    // InternalFortXTrans.g:3703:1: rule__APIName__Group_2_1__0__Impl : ( '.' ) ;
    public final void rule__APIName__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3707:1: ( ( '.' ) )
            // InternalFortXTrans.g:3708:1: ( '.' )
            {
            // InternalFortXTrans.g:3708:1: ( '.' )
            // InternalFortXTrans.g:3709:2: '.'
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
    // InternalFortXTrans.g:3718:1: rule__APIName__Group_2_1__1 : rule__APIName__Group_2_1__1__Impl ;
    public final void rule__APIName__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3722:1: ( rule__APIName__Group_2_1__1__Impl )
            // InternalFortXTrans.g:3723:2: rule__APIName__Group_2_1__1__Impl
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
    // InternalFortXTrans.g:3729:1: rule__APIName__Group_2_1__1__Impl : ( RULE_ID ) ;
    public final void rule__APIName__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3733:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:3734:1: ( RULE_ID )
            {
            // InternalFortXTrans.g:3734:1: ( RULE_ID )
            // InternalFortXTrans.g:3735:2: RULE_ID
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
    // InternalFortXTrans.g:3745:1: rule__SimpleNames__Group_1__0 : rule__SimpleNames__Group_1__0__Impl rule__SimpleNames__Group_1__1 ;
    public final void rule__SimpleNames__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3749:1: ( rule__SimpleNames__Group_1__0__Impl rule__SimpleNames__Group_1__1 )
            // InternalFortXTrans.g:3750:2: rule__SimpleNames__Group_1__0__Impl rule__SimpleNames__Group_1__1
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
    // InternalFortXTrans.g:3757:1: rule__SimpleNames__Group_1__0__Impl : ( ( rule__SimpleNames__BrackAssignment_1_0 ) ) ;
    public final void rule__SimpleNames__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3761:1: ( ( ( rule__SimpleNames__BrackAssignment_1_0 ) ) )
            // InternalFortXTrans.g:3762:1: ( ( rule__SimpleNames__BrackAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:3762:1: ( ( rule__SimpleNames__BrackAssignment_1_0 ) )
            // InternalFortXTrans.g:3763:2: ( rule__SimpleNames__BrackAssignment_1_0 )
            {
             before(grammarAccess.getSimpleNamesAccess().getBrackAssignment_1_0()); 
            // InternalFortXTrans.g:3764:2: ( rule__SimpleNames__BrackAssignment_1_0 )
            // InternalFortXTrans.g:3764:3: rule__SimpleNames__BrackAssignment_1_0
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
    // InternalFortXTrans.g:3772:1: rule__SimpleNames__Group_1__1 : rule__SimpleNames__Group_1__1__Impl rule__SimpleNames__Group_1__2 ;
    public final void rule__SimpleNames__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3776:1: ( rule__SimpleNames__Group_1__1__Impl rule__SimpleNames__Group_1__2 )
            // InternalFortXTrans.g:3777:2: rule__SimpleNames__Group_1__1__Impl rule__SimpleNames__Group_1__2
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
    // InternalFortXTrans.g:3784:1: rule__SimpleNames__Group_1__1__Impl : ( ( rule__SimpleNames__NameListAssignment_1_1 ) ) ;
    public final void rule__SimpleNames__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3788:1: ( ( ( rule__SimpleNames__NameListAssignment_1_1 ) ) )
            // InternalFortXTrans.g:3789:1: ( ( rule__SimpleNames__NameListAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:3789:1: ( ( rule__SimpleNames__NameListAssignment_1_1 ) )
            // InternalFortXTrans.g:3790:2: ( rule__SimpleNames__NameListAssignment_1_1 )
            {
             before(grammarAccess.getSimpleNamesAccess().getNameListAssignment_1_1()); 
            // InternalFortXTrans.g:3791:2: ( rule__SimpleNames__NameListAssignment_1_1 )
            // InternalFortXTrans.g:3791:3: rule__SimpleNames__NameListAssignment_1_1
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
    // InternalFortXTrans.g:3799:1: rule__SimpleNames__Group_1__2 : rule__SimpleNames__Group_1__2__Impl rule__SimpleNames__Group_1__3 ;
    public final void rule__SimpleNames__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3803:1: ( rule__SimpleNames__Group_1__2__Impl rule__SimpleNames__Group_1__3 )
            // InternalFortXTrans.g:3804:2: rule__SimpleNames__Group_1__2__Impl rule__SimpleNames__Group_1__3
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
    // InternalFortXTrans.g:3811:1: rule__SimpleNames__Group_1__2__Impl : ( ( rule__SimpleNames__Group_1_2__0 )* ) ;
    public final void rule__SimpleNames__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3815:1: ( ( ( rule__SimpleNames__Group_1_2__0 )* ) )
            // InternalFortXTrans.g:3816:1: ( ( rule__SimpleNames__Group_1_2__0 )* )
            {
            // InternalFortXTrans.g:3816:1: ( ( rule__SimpleNames__Group_1_2__0 )* )
            // InternalFortXTrans.g:3817:2: ( rule__SimpleNames__Group_1_2__0 )*
            {
             before(grammarAccess.getSimpleNamesAccess().getGroup_1_2()); 
            // InternalFortXTrans.g:3818:2: ( rule__SimpleNames__Group_1_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==25) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalFortXTrans.g:3818:3: rule__SimpleNames__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__SimpleNames__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalFortXTrans.g:3826:1: rule__SimpleNames__Group_1__3 : rule__SimpleNames__Group_1__3__Impl ;
    public final void rule__SimpleNames__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3830:1: ( rule__SimpleNames__Group_1__3__Impl )
            // InternalFortXTrans.g:3831:2: rule__SimpleNames__Group_1__3__Impl
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
    // InternalFortXTrans.g:3837:1: rule__SimpleNames__Group_1__3__Impl : ( '}' ) ;
    public final void rule__SimpleNames__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3841:1: ( ( '}' ) )
            // InternalFortXTrans.g:3842:1: ( '}' )
            {
            // InternalFortXTrans.g:3842:1: ( '}' )
            // InternalFortXTrans.g:3843:2: '}'
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
    // InternalFortXTrans.g:3853:1: rule__SimpleNames__Group_1_2__0 : rule__SimpleNames__Group_1_2__0__Impl rule__SimpleNames__Group_1_2__1 ;
    public final void rule__SimpleNames__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3857:1: ( rule__SimpleNames__Group_1_2__0__Impl rule__SimpleNames__Group_1_2__1 )
            // InternalFortXTrans.g:3858:2: rule__SimpleNames__Group_1_2__0__Impl rule__SimpleNames__Group_1_2__1
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
    // InternalFortXTrans.g:3865:1: rule__SimpleNames__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__SimpleNames__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3869:1: ( ( ',' ) )
            // InternalFortXTrans.g:3870:1: ( ',' )
            {
            // InternalFortXTrans.g:3870:1: ( ',' )
            // InternalFortXTrans.g:3871:2: ','
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
    // InternalFortXTrans.g:3880:1: rule__SimpleNames__Group_1_2__1 : rule__SimpleNames__Group_1_2__1__Impl ;
    public final void rule__SimpleNames__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3884:1: ( rule__SimpleNames__Group_1_2__1__Impl )
            // InternalFortXTrans.g:3885:2: rule__SimpleNames__Group_1_2__1__Impl
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
    // InternalFortXTrans.g:3891:1: rule__SimpleNames__Group_1_2__1__Impl : ( ( rule__SimpleNames__NameListAssignment_1_2_1 ) ) ;
    public final void rule__SimpleNames__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3895:1: ( ( ( rule__SimpleNames__NameListAssignment_1_2_1 ) ) )
            // InternalFortXTrans.g:3896:1: ( ( rule__SimpleNames__NameListAssignment_1_2_1 ) )
            {
            // InternalFortXTrans.g:3896:1: ( ( rule__SimpleNames__NameListAssignment_1_2_1 ) )
            // InternalFortXTrans.g:3897:2: ( rule__SimpleNames__NameListAssignment_1_2_1 )
            {
             before(grammarAccess.getSimpleNamesAccess().getNameListAssignment_1_2_1()); 
            // InternalFortXTrans.g:3898:2: ( rule__SimpleNames__NameListAssignment_1_2_1 )
            // InternalFortXTrans.g:3898:3: rule__SimpleNames__NameListAssignment_1_2_1
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
    // InternalFortXTrans.g:3907:1: rule__AliasedSimpleName__Group__0 : rule__AliasedSimpleName__Group__0__Impl rule__AliasedSimpleName__Group__1 ;
    public final void rule__AliasedSimpleName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3911:1: ( rule__AliasedSimpleName__Group__0__Impl rule__AliasedSimpleName__Group__1 )
            // InternalFortXTrans.g:3912:2: rule__AliasedSimpleName__Group__0__Impl rule__AliasedSimpleName__Group__1
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
    // InternalFortXTrans.g:3919:1: rule__AliasedSimpleName__Group__0__Impl : ( ( rule__AliasedSimpleName__OrigAssignment_0 ) ) ;
    public final void rule__AliasedSimpleName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3923:1: ( ( ( rule__AliasedSimpleName__OrigAssignment_0 ) ) )
            // InternalFortXTrans.g:3924:1: ( ( rule__AliasedSimpleName__OrigAssignment_0 ) )
            {
            // InternalFortXTrans.g:3924:1: ( ( rule__AliasedSimpleName__OrigAssignment_0 ) )
            // InternalFortXTrans.g:3925:2: ( rule__AliasedSimpleName__OrigAssignment_0 )
            {
             before(grammarAccess.getAliasedSimpleNameAccess().getOrigAssignment_0()); 
            // InternalFortXTrans.g:3926:2: ( rule__AliasedSimpleName__OrigAssignment_0 )
            // InternalFortXTrans.g:3926:3: rule__AliasedSimpleName__OrigAssignment_0
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
    // InternalFortXTrans.g:3934:1: rule__AliasedSimpleName__Group__1 : rule__AliasedSimpleName__Group__1__Impl ;
    public final void rule__AliasedSimpleName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3938:1: ( rule__AliasedSimpleName__Group__1__Impl )
            // InternalFortXTrans.g:3939:2: rule__AliasedSimpleName__Group__1__Impl
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
    // InternalFortXTrans.g:3945:1: rule__AliasedSimpleName__Group__1__Impl : ( ( rule__AliasedSimpleName__Group_1__0 )? ) ;
    public final void rule__AliasedSimpleName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3949:1: ( ( ( rule__AliasedSimpleName__Group_1__0 )? ) )
            // InternalFortXTrans.g:3950:1: ( ( rule__AliasedSimpleName__Group_1__0 )? )
            {
            // InternalFortXTrans.g:3950:1: ( ( rule__AliasedSimpleName__Group_1__0 )? )
            // InternalFortXTrans.g:3951:2: ( rule__AliasedSimpleName__Group_1__0 )?
            {
             before(grammarAccess.getAliasedSimpleNameAccess().getGroup_1()); 
            // InternalFortXTrans.g:3952:2: ( rule__AliasedSimpleName__Group_1__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==28) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalFortXTrans.g:3952:3: rule__AliasedSimpleName__Group_1__0
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
    // InternalFortXTrans.g:3961:1: rule__AliasedSimpleName__Group_1__0 : rule__AliasedSimpleName__Group_1__0__Impl rule__AliasedSimpleName__Group_1__1 ;
    public final void rule__AliasedSimpleName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3965:1: ( rule__AliasedSimpleName__Group_1__0__Impl rule__AliasedSimpleName__Group_1__1 )
            // InternalFortXTrans.g:3966:2: rule__AliasedSimpleName__Group_1__0__Impl rule__AliasedSimpleName__Group_1__1
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
    // InternalFortXTrans.g:3973:1: rule__AliasedSimpleName__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__AliasedSimpleName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3977:1: ( ( 'as' ) )
            // InternalFortXTrans.g:3978:1: ( 'as' )
            {
            // InternalFortXTrans.g:3978:1: ( 'as' )
            // InternalFortXTrans.g:3979:2: 'as'
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
    // InternalFortXTrans.g:3988:1: rule__AliasedSimpleName__Group_1__1 : rule__AliasedSimpleName__Group_1__1__Impl ;
    public final void rule__AliasedSimpleName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:3992:1: ( rule__AliasedSimpleName__Group_1__1__Impl )
            // InternalFortXTrans.g:3993:2: rule__AliasedSimpleName__Group_1__1__Impl
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
    // InternalFortXTrans.g:3999:1: rule__AliasedSimpleName__Group_1__1__Impl : ( ( rule__AliasedSimpleName__AsNameAssignment_1_1 ) ) ;
    public final void rule__AliasedSimpleName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4003:1: ( ( ( rule__AliasedSimpleName__AsNameAssignment_1_1 ) ) )
            // InternalFortXTrans.g:4004:1: ( ( rule__AliasedSimpleName__AsNameAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:4004:1: ( ( rule__AliasedSimpleName__AsNameAssignment_1_1 ) )
            // InternalFortXTrans.g:4005:2: ( rule__AliasedSimpleName__AsNameAssignment_1_1 )
            {
             before(grammarAccess.getAliasedSimpleNameAccess().getAsNameAssignment_1_1()); 
            // InternalFortXTrans.g:4006:2: ( rule__AliasedSimpleName__AsNameAssignment_1_1 )
            // InternalFortXTrans.g:4006:3: rule__AliasedSimpleName__AsNameAssignment_1_1
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
    // InternalFortXTrans.g:4015:1: rule__AliasedAPINames__Group_1__0 : rule__AliasedAPINames__Group_1__0__Impl rule__AliasedAPINames__Group_1__1 ;
    public final void rule__AliasedAPINames__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4019:1: ( rule__AliasedAPINames__Group_1__0__Impl rule__AliasedAPINames__Group_1__1 )
            // InternalFortXTrans.g:4020:2: rule__AliasedAPINames__Group_1__0__Impl rule__AliasedAPINames__Group_1__1
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
    // InternalFortXTrans.g:4027:1: rule__AliasedAPINames__Group_1__0__Impl : ( ( rule__AliasedAPINames__BrackAssignment_1_0 ) ) ;
    public final void rule__AliasedAPINames__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4031:1: ( ( ( rule__AliasedAPINames__BrackAssignment_1_0 ) ) )
            // InternalFortXTrans.g:4032:1: ( ( rule__AliasedAPINames__BrackAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:4032:1: ( ( rule__AliasedAPINames__BrackAssignment_1_0 ) )
            // InternalFortXTrans.g:4033:2: ( rule__AliasedAPINames__BrackAssignment_1_0 )
            {
             before(grammarAccess.getAliasedAPINamesAccess().getBrackAssignment_1_0()); 
            // InternalFortXTrans.g:4034:2: ( rule__AliasedAPINames__BrackAssignment_1_0 )
            // InternalFortXTrans.g:4034:3: rule__AliasedAPINames__BrackAssignment_1_0
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
    // InternalFortXTrans.g:4042:1: rule__AliasedAPINames__Group_1__1 : rule__AliasedAPINames__Group_1__1__Impl rule__AliasedAPINames__Group_1__2 ;
    public final void rule__AliasedAPINames__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4046:1: ( rule__AliasedAPINames__Group_1__1__Impl rule__AliasedAPINames__Group_1__2 )
            // InternalFortXTrans.g:4047:2: rule__AliasedAPINames__Group_1__1__Impl rule__AliasedAPINames__Group_1__2
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
    // InternalFortXTrans.g:4054:1: rule__AliasedAPINames__Group_1__1__Impl : ( ( rule__AliasedAPINames__NameListAssignment_1_1 ) ) ;
    public final void rule__AliasedAPINames__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4058:1: ( ( ( rule__AliasedAPINames__NameListAssignment_1_1 ) ) )
            // InternalFortXTrans.g:4059:1: ( ( rule__AliasedAPINames__NameListAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:4059:1: ( ( rule__AliasedAPINames__NameListAssignment_1_1 ) )
            // InternalFortXTrans.g:4060:2: ( rule__AliasedAPINames__NameListAssignment_1_1 )
            {
             before(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_1_1()); 
            // InternalFortXTrans.g:4061:2: ( rule__AliasedAPINames__NameListAssignment_1_1 )
            // InternalFortXTrans.g:4061:3: rule__AliasedAPINames__NameListAssignment_1_1
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
    // InternalFortXTrans.g:4069:1: rule__AliasedAPINames__Group_1__2 : rule__AliasedAPINames__Group_1__2__Impl rule__AliasedAPINames__Group_1__3 ;
    public final void rule__AliasedAPINames__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4073:1: ( rule__AliasedAPINames__Group_1__2__Impl rule__AliasedAPINames__Group_1__3 )
            // InternalFortXTrans.g:4074:2: rule__AliasedAPINames__Group_1__2__Impl rule__AliasedAPINames__Group_1__3
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
    // InternalFortXTrans.g:4081:1: rule__AliasedAPINames__Group_1__2__Impl : ( ( rule__AliasedAPINames__Group_1_2__0 )* ) ;
    public final void rule__AliasedAPINames__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4085:1: ( ( ( rule__AliasedAPINames__Group_1_2__0 )* ) )
            // InternalFortXTrans.g:4086:1: ( ( rule__AliasedAPINames__Group_1_2__0 )* )
            {
            // InternalFortXTrans.g:4086:1: ( ( rule__AliasedAPINames__Group_1_2__0 )* )
            // InternalFortXTrans.g:4087:2: ( rule__AliasedAPINames__Group_1_2__0 )*
            {
             before(grammarAccess.getAliasedAPINamesAccess().getGroup_1_2()); 
            // InternalFortXTrans.g:4088:2: ( rule__AliasedAPINames__Group_1_2__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==25) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalFortXTrans.g:4088:3: rule__AliasedAPINames__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__AliasedAPINames__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalFortXTrans.g:4096:1: rule__AliasedAPINames__Group_1__3 : rule__AliasedAPINames__Group_1__3__Impl ;
    public final void rule__AliasedAPINames__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4100:1: ( rule__AliasedAPINames__Group_1__3__Impl )
            // InternalFortXTrans.g:4101:2: rule__AliasedAPINames__Group_1__3__Impl
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
    // InternalFortXTrans.g:4107:1: rule__AliasedAPINames__Group_1__3__Impl : ( '}' ) ;
    public final void rule__AliasedAPINames__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4111:1: ( ( '}' ) )
            // InternalFortXTrans.g:4112:1: ( '}' )
            {
            // InternalFortXTrans.g:4112:1: ( '}' )
            // InternalFortXTrans.g:4113:2: '}'
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
    // InternalFortXTrans.g:4123:1: rule__AliasedAPINames__Group_1_2__0 : rule__AliasedAPINames__Group_1_2__0__Impl rule__AliasedAPINames__Group_1_2__1 ;
    public final void rule__AliasedAPINames__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4127:1: ( rule__AliasedAPINames__Group_1_2__0__Impl rule__AliasedAPINames__Group_1_2__1 )
            // InternalFortXTrans.g:4128:2: rule__AliasedAPINames__Group_1_2__0__Impl rule__AliasedAPINames__Group_1_2__1
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
    // InternalFortXTrans.g:4135:1: rule__AliasedAPINames__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__AliasedAPINames__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4139:1: ( ( ',' ) )
            // InternalFortXTrans.g:4140:1: ( ',' )
            {
            // InternalFortXTrans.g:4140:1: ( ',' )
            // InternalFortXTrans.g:4141:2: ','
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
    // InternalFortXTrans.g:4150:1: rule__AliasedAPINames__Group_1_2__1 : rule__AliasedAPINames__Group_1_2__1__Impl ;
    public final void rule__AliasedAPINames__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4154:1: ( rule__AliasedAPINames__Group_1_2__1__Impl )
            // InternalFortXTrans.g:4155:2: rule__AliasedAPINames__Group_1_2__1__Impl
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
    // InternalFortXTrans.g:4161:1: rule__AliasedAPINames__Group_1_2__1__Impl : ( ( rule__AliasedAPINames__NameListAssignment_1_2_1 ) ) ;
    public final void rule__AliasedAPINames__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4165:1: ( ( ( rule__AliasedAPINames__NameListAssignment_1_2_1 ) ) )
            // InternalFortXTrans.g:4166:1: ( ( rule__AliasedAPINames__NameListAssignment_1_2_1 ) )
            {
            // InternalFortXTrans.g:4166:1: ( ( rule__AliasedAPINames__NameListAssignment_1_2_1 ) )
            // InternalFortXTrans.g:4167:2: ( rule__AliasedAPINames__NameListAssignment_1_2_1 )
            {
             before(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_1_2_1()); 
            // InternalFortXTrans.g:4168:2: ( rule__AliasedAPINames__NameListAssignment_1_2_1 )
            // InternalFortXTrans.g:4168:3: rule__AliasedAPINames__NameListAssignment_1_2_1
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
    // InternalFortXTrans.g:4177:1: rule__AliasedAPIName__Group__0 : rule__AliasedAPIName__Group__0__Impl rule__AliasedAPIName__Group__1 ;
    public final void rule__AliasedAPIName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4181:1: ( rule__AliasedAPIName__Group__0__Impl rule__AliasedAPIName__Group__1 )
            // InternalFortXTrans.g:4182:2: rule__AliasedAPIName__Group__0__Impl rule__AliasedAPIName__Group__1
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
    // InternalFortXTrans.g:4189:1: rule__AliasedAPIName__Group__0__Impl : ( ( rule__AliasedAPIName__OrigAssignment_0 ) ) ;
    public final void rule__AliasedAPIName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4193:1: ( ( ( rule__AliasedAPIName__OrigAssignment_0 ) ) )
            // InternalFortXTrans.g:4194:1: ( ( rule__AliasedAPIName__OrigAssignment_0 ) )
            {
            // InternalFortXTrans.g:4194:1: ( ( rule__AliasedAPIName__OrigAssignment_0 ) )
            // InternalFortXTrans.g:4195:2: ( rule__AliasedAPIName__OrigAssignment_0 )
            {
             before(grammarAccess.getAliasedAPINameAccess().getOrigAssignment_0()); 
            // InternalFortXTrans.g:4196:2: ( rule__AliasedAPIName__OrigAssignment_0 )
            // InternalFortXTrans.g:4196:3: rule__AliasedAPIName__OrigAssignment_0
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
    // InternalFortXTrans.g:4204:1: rule__AliasedAPIName__Group__1 : rule__AliasedAPIName__Group__1__Impl ;
    public final void rule__AliasedAPIName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4208:1: ( rule__AliasedAPIName__Group__1__Impl )
            // InternalFortXTrans.g:4209:2: rule__AliasedAPIName__Group__1__Impl
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
    // InternalFortXTrans.g:4215:1: rule__AliasedAPIName__Group__1__Impl : ( ( rule__AliasedAPIName__Group_1__0 )? ) ;
    public final void rule__AliasedAPIName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4219:1: ( ( ( rule__AliasedAPIName__Group_1__0 )? ) )
            // InternalFortXTrans.g:4220:1: ( ( rule__AliasedAPIName__Group_1__0 )? )
            {
            // InternalFortXTrans.g:4220:1: ( ( rule__AliasedAPIName__Group_1__0 )? )
            // InternalFortXTrans.g:4221:2: ( rule__AliasedAPIName__Group_1__0 )?
            {
             before(grammarAccess.getAliasedAPINameAccess().getGroup_1()); 
            // InternalFortXTrans.g:4222:2: ( rule__AliasedAPIName__Group_1__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==28) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalFortXTrans.g:4222:3: rule__AliasedAPIName__Group_1__0
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
    // InternalFortXTrans.g:4231:1: rule__AliasedAPIName__Group_1__0 : rule__AliasedAPIName__Group_1__0__Impl rule__AliasedAPIName__Group_1__1 ;
    public final void rule__AliasedAPIName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4235:1: ( rule__AliasedAPIName__Group_1__0__Impl rule__AliasedAPIName__Group_1__1 )
            // InternalFortXTrans.g:4236:2: rule__AliasedAPIName__Group_1__0__Impl rule__AliasedAPIName__Group_1__1
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
    // InternalFortXTrans.g:4243:1: rule__AliasedAPIName__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__AliasedAPIName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4247:1: ( ( 'as' ) )
            // InternalFortXTrans.g:4248:1: ( 'as' )
            {
            // InternalFortXTrans.g:4248:1: ( 'as' )
            // InternalFortXTrans.g:4249:2: 'as'
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
    // InternalFortXTrans.g:4258:1: rule__AliasedAPIName__Group_1__1 : rule__AliasedAPIName__Group_1__1__Impl ;
    public final void rule__AliasedAPIName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4262:1: ( rule__AliasedAPIName__Group_1__1__Impl )
            // InternalFortXTrans.g:4263:2: rule__AliasedAPIName__Group_1__1__Impl
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
    // InternalFortXTrans.g:4269:1: rule__AliasedAPIName__Group_1__1__Impl : ( ( rule__AliasedAPIName__AsNameAssignment_1_1 ) ) ;
    public final void rule__AliasedAPIName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4273:1: ( ( ( rule__AliasedAPIName__AsNameAssignment_1_1 ) ) )
            // InternalFortXTrans.g:4274:1: ( ( rule__AliasedAPIName__AsNameAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:4274:1: ( ( rule__AliasedAPIName__AsNameAssignment_1_1 ) )
            // InternalFortXTrans.g:4275:2: ( rule__AliasedAPIName__AsNameAssignment_1_1 )
            {
             before(grammarAccess.getAliasedAPINameAccess().getAsNameAssignment_1_1()); 
            // InternalFortXTrans.g:4276:2: ( rule__AliasedAPIName__AsNameAssignment_1_1 )
            // InternalFortXTrans.g:4276:3: rule__AliasedAPIName__AsNameAssignment_1_1
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
    // InternalFortXTrans.g:4285:1: rule__ValParam__Group_1__0 : rule__ValParam__Group_1__0__Impl rule__ValParam__Group_1__1 ;
    public final void rule__ValParam__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4289:1: ( rule__ValParam__Group_1__0__Impl rule__ValParam__Group_1__1 )
            // InternalFortXTrans.g:4290:2: rule__ValParam__Group_1__0__Impl rule__ValParam__Group_1__1
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
    // InternalFortXTrans.g:4297:1: rule__ValParam__Group_1__0__Impl : ( ( rule__ValParam__BrackAssignment_1_0 ) ) ;
    public final void rule__ValParam__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4301:1: ( ( ( rule__ValParam__BrackAssignment_1_0 ) ) )
            // InternalFortXTrans.g:4302:1: ( ( rule__ValParam__BrackAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:4302:1: ( ( rule__ValParam__BrackAssignment_1_0 ) )
            // InternalFortXTrans.g:4303:2: ( rule__ValParam__BrackAssignment_1_0 )
            {
             before(grammarAccess.getValParamAccess().getBrackAssignment_1_0()); 
            // InternalFortXTrans.g:4304:2: ( rule__ValParam__BrackAssignment_1_0 )
            // InternalFortXTrans.g:4304:3: rule__ValParam__BrackAssignment_1_0
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
    // InternalFortXTrans.g:4312:1: rule__ValParam__Group_1__1 : rule__ValParam__Group_1__1__Impl rule__ValParam__Group_1__2 ;
    public final void rule__ValParam__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4316:1: ( rule__ValParam__Group_1__1__Impl rule__ValParam__Group_1__2 )
            // InternalFortXTrans.g:4317:2: rule__ValParam__Group_1__1__Impl rule__ValParam__Group_1__2
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
    // InternalFortXTrans.g:4324:1: rule__ValParam__Group_1__1__Impl : ( ( rule__ValParam__Group_1_1__0 )? ) ;
    public final void rule__ValParam__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4328:1: ( ( ( rule__ValParam__Group_1_1__0 )? ) )
            // InternalFortXTrans.g:4329:1: ( ( rule__ValParam__Group_1_1__0 )? )
            {
            // InternalFortXTrans.g:4329:1: ( ( rule__ValParam__Group_1_1__0 )? )
            // InternalFortXTrans.g:4330:2: ( rule__ValParam__Group_1_1__0 )?
            {
             before(grammarAccess.getValParamAccess().getGroup_1_1()); 
            // InternalFortXTrans.g:4331:2: ( rule__ValParam__Group_1_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==20) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalFortXTrans.g:4331:3: rule__ValParam__Group_1_1__0
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
    // InternalFortXTrans.g:4339:1: rule__ValParam__Group_1__2 : rule__ValParam__Group_1__2__Impl ;
    public final void rule__ValParam__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4343:1: ( rule__ValParam__Group_1__2__Impl )
            // InternalFortXTrans.g:4344:2: rule__ValParam__Group_1__2__Impl
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
    // InternalFortXTrans.g:4350:1: rule__ValParam__Group_1__2__Impl : ( ')' ) ;
    public final void rule__ValParam__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4354:1: ( ( ')' ) )
            // InternalFortXTrans.g:4355:1: ( ')' )
            {
            // InternalFortXTrans.g:4355:1: ( ')' )
            // InternalFortXTrans.g:4356:2: ')'
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
    // InternalFortXTrans.g:4366:1: rule__ValParam__Group_1_1__0 : rule__ValParam__Group_1_1__0__Impl rule__ValParam__Group_1_1__1 ;
    public final void rule__ValParam__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4370:1: ( rule__ValParam__Group_1_1__0__Impl rule__ValParam__Group_1_1__1 )
            // InternalFortXTrans.g:4371:2: rule__ValParam__Group_1_1__0__Impl rule__ValParam__Group_1_1__1
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
    // InternalFortXTrans.g:4378:1: rule__ValParam__Group_1_1__0__Impl : ( ( rule__ValParam__ParamsAssignment_1_1_0 ) ) ;
    public final void rule__ValParam__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4382:1: ( ( ( rule__ValParam__ParamsAssignment_1_1_0 ) ) )
            // InternalFortXTrans.g:4383:1: ( ( rule__ValParam__ParamsAssignment_1_1_0 ) )
            {
            // InternalFortXTrans.g:4383:1: ( ( rule__ValParam__ParamsAssignment_1_1_0 ) )
            // InternalFortXTrans.g:4384:2: ( rule__ValParam__ParamsAssignment_1_1_0 )
            {
             before(grammarAccess.getValParamAccess().getParamsAssignment_1_1_0()); 
            // InternalFortXTrans.g:4385:2: ( rule__ValParam__ParamsAssignment_1_1_0 )
            // InternalFortXTrans.g:4385:3: rule__ValParam__ParamsAssignment_1_1_0
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
    // InternalFortXTrans.g:4393:1: rule__ValParam__Group_1_1__1 : rule__ValParam__Group_1_1__1__Impl ;
    public final void rule__ValParam__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4397:1: ( rule__ValParam__Group_1_1__1__Impl )
            // InternalFortXTrans.g:4398:2: rule__ValParam__Group_1_1__1__Impl
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
    // InternalFortXTrans.g:4404:1: rule__ValParam__Group_1_1__1__Impl : ( ( rule__ValParam__Group_1_1_1__0 )* ) ;
    public final void rule__ValParam__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4408:1: ( ( ( rule__ValParam__Group_1_1_1__0 )* ) )
            // InternalFortXTrans.g:4409:1: ( ( rule__ValParam__Group_1_1_1__0 )* )
            {
            // InternalFortXTrans.g:4409:1: ( ( rule__ValParam__Group_1_1_1__0 )* )
            // InternalFortXTrans.g:4410:2: ( rule__ValParam__Group_1_1_1__0 )*
            {
             before(grammarAccess.getValParamAccess().getGroup_1_1_1()); 
            // InternalFortXTrans.g:4411:2: ( rule__ValParam__Group_1_1_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==25) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalFortXTrans.g:4411:3: rule__ValParam__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ValParam__Group_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalFortXTrans.g:4420:1: rule__ValParam__Group_1_1_1__0 : rule__ValParam__Group_1_1_1__0__Impl rule__ValParam__Group_1_1_1__1 ;
    public final void rule__ValParam__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4424:1: ( rule__ValParam__Group_1_1_1__0__Impl rule__ValParam__Group_1_1_1__1 )
            // InternalFortXTrans.g:4425:2: rule__ValParam__Group_1_1_1__0__Impl rule__ValParam__Group_1_1_1__1
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
    // InternalFortXTrans.g:4432:1: rule__ValParam__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__ValParam__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4436:1: ( ( ',' ) )
            // InternalFortXTrans.g:4437:1: ( ',' )
            {
            // InternalFortXTrans.g:4437:1: ( ',' )
            // InternalFortXTrans.g:4438:2: ','
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
    // InternalFortXTrans.g:4447:1: rule__ValParam__Group_1_1_1__1 : rule__ValParam__Group_1_1_1__1__Impl ;
    public final void rule__ValParam__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4451:1: ( rule__ValParam__Group_1_1_1__1__Impl )
            // InternalFortXTrans.g:4452:2: rule__ValParam__Group_1_1_1__1__Impl
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
    // InternalFortXTrans.g:4458:1: rule__ValParam__Group_1_1_1__1__Impl : ( ( rule__ValParam__ParamsAssignment_1_1_1_1 ) ) ;
    public final void rule__ValParam__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4462:1: ( ( ( rule__ValParam__ParamsAssignment_1_1_1_1 ) ) )
            // InternalFortXTrans.g:4463:1: ( ( rule__ValParam__ParamsAssignment_1_1_1_1 ) )
            {
            // InternalFortXTrans.g:4463:1: ( ( rule__ValParam__ParamsAssignment_1_1_1_1 ) )
            // InternalFortXTrans.g:4464:2: ( rule__ValParam__ParamsAssignment_1_1_1_1 )
            {
             before(grammarAccess.getValParamAccess().getParamsAssignment_1_1_1_1()); 
            // InternalFortXTrans.g:4465:2: ( rule__ValParam__ParamsAssignment_1_1_1_1 )
            // InternalFortXTrans.g:4465:3: rule__ValParam__ParamsAssignment_1_1_1_1
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
    // InternalFortXTrans.g:4474:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4478:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // InternalFortXTrans.g:4479:2: rule__Param__Group__0__Impl rule__Param__Group__1
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
    // InternalFortXTrans.g:4486:1: rule__Param__Group__0__Impl : ( ( rule__Param__BIdAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4490:1: ( ( ( rule__Param__BIdAssignment_0 ) ) )
            // InternalFortXTrans.g:4491:1: ( ( rule__Param__BIdAssignment_0 ) )
            {
            // InternalFortXTrans.g:4491:1: ( ( rule__Param__BIdAssignment_0 ) )
            // InternalFortXTrans.g:4492:2: ( rule__Param__BIdAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getBIdAssignment_0()); 
            // InternalFortXTrans.g:4493:2: ( rule__Param__BIdAssignment_0 )
            // InternalFortXTrans.g:4493:3: rule__Param__BIdAssignment_0
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
    // InternalFortXTrans.g:4501:1: rule__Param__Group__1 : rule__Param__Group__1__Impl ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4505:1: ( rule__Param__Group__1__Impl )
            // InternalFortXTrans.g:4506:2: rule__Param__Group__1__Impl
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
    // InternalFortXTrans.g:4512:1: rule__Param__Group__1__Impl : ( ( rule__Param__IstypeAssignment_1 ) ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4516:1: ( ( ( rule__Param__IstypeAssignment_1 ) ) )
            // InternalFortXTrans.g:4517:1: ( ( rule__Param__IstypeAssignment_1 ) )
            {
            // InternalFortXTrans.g:4517:1: ( ( rule__Param__IstypeAssignment_1 ) )
            // InternalFortXTrans.g:4518:2: ( rule__Param__IstypeAssignment_1 )
            {
             before(grammarAccess.getParamAccess().getIstypeAssignment_1()); 
            // InternalFortXTrans.g:4519:2: ( rule__Param__IstypeAssignment_1 )
            // InternalFortXTrans.g:4519:3: rule__Param__IstypeAssignment_1
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
    // InternalFortXTrans.g:4528:1: rule__RetType__Group_0__0 : rule__RetType__Group_0__0__Impl rule__RetType__Group_0__1 ;
    public final void rule__RetType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4532:1: ( rule__RetType__Group_0__0__Impl rule__RetType__Group_0__1 )
            // InternalFortXTrans.g:4533:2: rule__RetType__Group_0__0__Impl rule__RetType__Group_0__1
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
    // InternalFortXTrans.g:4540:1: rule__RetType__Group_0__0__Impl : ( ':' ) ;
    public final void rule__RetType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4544:1: ( ( ':' ) )
            // InternalFortXTrans.g:4545:1: ( ':' )
            {
            // InternalFortXTrans.g:4545:1: ( ':' )
            // InternalFortXTrans.g:4546:2: ':'
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
    // InternalFortXTrans.g:4555:1: rule__RetType__Group_0__1 : rule__RetType__Group_0__1__Impl rule__RetType__Group_0__2 ;
    public final void rule__RetType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4559:1: ( rule__RetType__Group_0__1__Impl rule__RetType__Group_0__2 )
            // InternalFortXTrans.g:4560:2: rule__RetType__Group_0__1__Impl rule__RetType__Group_0__2
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
    // InternalFortXTrans.g:4567:1: rule__RetType__Group_0__1__Impl : ( ( rule__RetType__EmptyAssignment_0_1 ) ) ;
    public final void rule__RetType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4571:1: ( ( ( rule__RetType__EmptyAssignment_0_1 ) ) )
            // InternalFortXTrans.g:4572:1: ( ( rule__RetType__EmptyAssignment_0_1 ) )
            {
            // InternalFortXTrans.g:4572:1: ( ( rule__RetType__EmptyAssignment_0_1 ) )
            // InternalFortXTrans.g:4573:2: ( rule__RetType__EmptyAssignment_0_1 )
            {
             before(grammarAccess.getRetTypeAccess().getEmptyAssignment_0_1()); 
            // InternalFortXTrans.g:4574:2: ( rule__RetType__EmptyAssignment_0_1 )
            // InternalFortXTrans.g:4574:3: rule__RetType__EmptyAssignment_0_1
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
    // InternalFortXTrans.g:4582:1: rule__RetType__Group_0__2 : rule__RetType__Group_0__2__Impl ;
    public final void rule__RetType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4586:1: ( rule__RetType__Group_0__2__Impl )
            // InternalFortXTrans.g:4587:2: rule__RetType__Group_0__2__Impl
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
    // InternalFortXTrans.g:4593:1: rule__RetType__Group_0__2__Impl : ( ')' ) ;
    public final void rule__RetType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4597:1: ( ( ')' ) )
            // InternalFortXTrans.g:4598:1: ( ')' )
            {
            // InternalFortXTrans.g:4598:1: ( ')' )
            // InternalFortXTrans.g:4599:2: ')'
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
    // InternalFortXTrans.g:4609:1: rule__RetType__Group_1__0 : rule__RetType__Group_1__0__Impl rule__RetType__Group_1__1 ;
    public final void rule__RetType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4613:1: ( rule__RetType__Group_1__0__Impl rule__RetType__Group_1__1 )
            // InternalFortXTrans.g:4614:2: rule__RetType__Group_1__0__Impl rule__RetType__Group_1__1
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
    // InternalFortXTrans.g:4621:1: rule__RetType__Group_1__0__Impl : ( ':' ) ;
    public final void rule__RetType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4625:1: ( ( ':' ) )
            // InternalFortXTrans.g:4626:1: ( ':' )
            {
            // InternalFortXTrans.g:4626:1: ( ':' )
            // InternalFortXTrans.g:4627:2: ':'
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
    // InternalFortXTrans.g:4636:1: rule__RetType__Group_1__1 : rule__RetType__Group_1__1__Impl ;
    public final void rule__RetType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4640:1: ( rule__RetType__Group_1__1__Impl )
            // InternalFortXTrans.g:4641:2: rule__RetType__Group_1__1__Impl
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
    // InternalFortXTrans.g:4647:1: rule__RetType__Group_1__1__Impl : ( ( rule__RetType__TypeAssignment_1_1 ) ) ;
    public final void rule__RetType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4651:1: ( ( ( rule__RetType__TypeAssignment_1_1 ) ) )
            // InternalFortXTrans.g:4652:1: ( ( rule__RetType__TypeAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:4652:1: ( ( rule__RetType__TypeAssignment_1_1 ) )
            // InternalFortXTrans.g:4653:2: ( rule__RetType__TypeAssignment_1_1 )
            {
             before(grammarAccess.getRetTypeAccess().getTypeAssignment_1_1()); 
            // InternalFortXTrans.g:4654:2: ( rule__RetType__TypeAssignment_1_1 )
            // InternalFortXTrans.g:4654:3: rule__RetType__TypeAssignment_1_1
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
    // InternalFortXTrans.g:4663:1: rule__TupleType__Group__0 : rule__TupleType__Group__0__Impl rule__TupleType__Group__1 ;
    public final void rule__TupleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4667:1: ( rule__TupleType__Group__0__Impl rule__TupleType__Group__1 )
            // InternalFortXTrans.g:4668:2: rule__TupleType__Group__0__Impl rule__TupleType__Group__1
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
    // InternalFortXTrans.g:4675:1: rule__TupleType__Group__0__Impl : ( '(' ) ;
    public final void rule__TupleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4679:1: ( ( '(' ) )
            // InternalFortXTrans.g:4680:1: ( '(' )
            {
            // InternalFortXTrans.g:4680:1: ( '(' )
            // InternalFortXTrans.g:4681:2: '('
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
    // InternalFortXTrans.g:4690:1: rule__TupleType__Group__1 : rule__TupleType__Group__1__Impl rule__TupleType__Group__2 ;
    public final void rule__TupleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4694:1: ( rule__TupleType__Group__1__Impl rule__TupleType__Group__2 )
            // InternalFortXTrans.g:4695:2: rule__TupleType__Group__1__Impl rule__TupleType__Group__2
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
    // InternalFortXTrans.g:4702:1: rule__TupleType__Group__1__Impl : ( ( rule__TupleType__TypesAssignment_1 ) ) ;
    public final void rule__TupleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4706:1: ( ( ( rule__TupleType__TypesAssignment_1 ) ) )
            // InternalFortXTrans.g:4707:1: ( ( rule__TupleType__TypesAssignment_1 ) )
            {
            // InternalFortXTrans.g:4707:1: ( ( rule__TupleType__TypesAssignment_1 ) )
            // InternalFortXTrans.g:4708:2: ( rule__TupleType__TypesAssignment_1 )
            {
             before(grammarAccess.getTupleTypeAccess().getTypesAssignment_1()); 
            // InternalFortXTrans.g:4709:2: ( rule__TupleType__TypesAssignment_1 )
            // InternalFortXTrans.g:4709:3: rule__TupleType__TypesAssignment_1
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
    // InternalFortXTrans.g:4717:1: rule__TupleType__Group__2 : rule__TupleType__Group__2__Impl rule__TupleType__Group__3 ;
    public final void rule__TupleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4721:1: ( rule__TupleType__Group__2__Impl rule__TupleType__Group__3 )
            // InternalFortXTrans.g:4722:2: rule__TupleType__Group__2__Impl rule__TupleType__Group__3
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
    // InternalFortXTrans.g:4729:1: rule__TupleType__Group__2__Impl : ( ( rule__TupleType__Group_2__0 )* ) ;
    public final void rule__TupleType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4733:1: ( ( ( rule__TupleType__Group_2__0 )* ) )
            // InternalFortXTrans.g:4734:1: ( ( rule__TupleType__Group_2__0 )* )
            {
            // InternalFortXTrans.g:4734:1: ( ( rule__TupleType__Group_2__0 )* )
            // InternalFortXTrans.g:4735:2: ( rule__TupleType__Group_2__0 )*
            {
             before(grammarAccess.getTupleTypeAccess().getGroup_2()); 
            // InternalFortXTrans.g:4736:2: ( rule__TupleType__Group_2__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==25) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalFortXTrans.g:4736:3: rule__TupleType__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__TupleType__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalFortXTrans.g:4744:1: rule__TupleType__Group__3 : rule__TupleType__Group__3__Impl ;
    public final void rule__TupleType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4748:1: ( rule__TupleType__Group__3__Impl )
            // InternalFortXTrans.g:4749:2: rule__TupleType__Group__3__Impl
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
    // InternalFortXTrans.g:4755:1: rule__TupleType__Group__3__Impl : ( ')' ) ;
    public final void rule__TupleType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4759:1: ( ( ')' ) )
            // InternalFortXTrans.g:4760:1: ( ')' )
            {
            // InternalFortXTrans.g:4760:1: ( ')' )
            // InternalFortXTrans.g:4761:2: ')'
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
    // InternalFortXTrans.g:4771:1: rule__TupleType__Group_2__0 : rule__TupleType__Group_2__0__Impl rule__TupleType__Group_2__1 ;
    public final void rule__TupleType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4775:1: ( rule__TupleType__Group_2__0__Impl rule__TupleType__Group_2__1 )
            // InternalFortXTrans.g:4776:2: rule__TupleType__Group_2__0__Impl rule__TupleType__Group_2__1
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
    // InternalFortXTrans.g:4783:1: rule__TupleType__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TupleType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4787:1: ( ( ',' ) )
            // InternalFortXTrans.g:4788:1: ( ',' )
            {
            // InternalFortXTrans.g:4788:1: ( ',' )
            // InternalFortXTrans.g:4789:2: ','
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
    // InternalFortXTrans.g:4798:1: rule__TupleType__Group_2__1 : rule__TupleType__Group_2__1__Impl ;
    public final void rule__TupleType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4802:1: ( rule__TupleType__Group_2__1__Impl )
            // InternalFortXTrans.g:4803:2: rule__TupleType__Group_2__1__Impl
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
    // InternalFortXTrans.g:4809:1: rule__TupleType__Group_2__1__Impl : ( ( rule__TupleType__TypesAssignment_2_1 ) ) ;
    public final void rule__TupleType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4813:1: ( ( ( rule__TupleType__TypesAssignment_2_1 ) ) )
            // InternalFortXTrans.g:4814:1: ( ( rule__TupleType__TypesAssignment_2_1 ) )
            {
            // InternalFortXTrans.g:4814:1: ( ( rule__TupleType__TypesAssignment_2_1 ) )
            // InternalFortXTrans.g:4815:2: ( rule__TupleType__TypesAssignment_2_1 )
            {
             before(grammarAccess.getTupleTypeAccess().getTypesAssignment_2_1()); 
            // InternalFortXTrans.g:4816:2: ( rule__TupleType__TypesAssignment_2_1 )
            // InternalFortXTrans.g:4816:3: rule__TupleType__TypesAssignment_2_1
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
    // InternalFortXTrans.g:4825:1: rule__FnDecl__Group__0 : rule__FnDecl__Group__0__Impl rule__FnDecl__Group__1 ;
    public final void rule__FnDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4829:1: ( rule__FnDecl__Group__0__Impl rule__FnDecl__Group__1 )
            // InternalFortXTrans.g:4830:2: rule__FnDecl__Group__0__Impl rule__FnDecl__Group__1
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
    // InternalFortXTrans.g:4837:1: rule__FnDecl__Group__0__Impl : ( ( rule__FnDecl__ModsAssignment_0 )? ) ;
    public final void rule__FnDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4841:1: ( ( ( rule__FnDecl__ModsAssignment_0 )? ) )
            // InternalFortXTrans.g:4842:1: ( ( rule__FnDecl__ModsAssignment_0 )? )
            {
            // InternalFortXTrans.g:4842:1: ( ( rule__FnDecl__ModsAssignment_0 )? )
            // InternalFortXTrans.g:4843:2: ( rule__FnDecl__ModsAssignment_0 )?
            {
             before(grammarAccess.getFnDeclAccess().getModsAssignment_0()); 
            // InternalFortXTrans.g:4844:2: ( rule__FnDecl__ModsAssignment_0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=42 && LA48_0<=45)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalFortXTrans.g:4844:3: rule__FnDecl__ModsAssignment_0
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
    // InternalFortXTrans.g:4852:1: rule__FnDecl__Group__1 : rule__FnDecl__Group__1__Impl rule__FnDecl__Group__2 ;
    public final void rule__FnDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4856:1: ( rule__FnDecl__Group__1__Impl rule__FnDecl__Group__2 )
            // InternalFortXTrans.g:4857:2: rule__FnDecl__Group__1__Impl rule__FnDecl__Group__2
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
    // InternalFortXTrans.g:4864:1: rule__FnDecl__Group__1__Impl : ( ( rule__FnDecl__NameAssignment_1 ) ) ;
    public final void rule__FnDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4868:1: ( ( ( rule__FnDecl__NameAssignment_1 ) ) )
            // InternalFortXTrans.g:4869:1: ( ( rule__FnDecl__NameAssignment_1 ) )
            {
            // InternalFortXTrans.g:4869:1: ( ( rule__FnDecl__NameAssignment_1 ) )
            // InternalFortXTrans.g:4870:2: ( rule__FnDecl__NameAssignment_1 )
            {
             before(grammarAccess.getFnDeclAccess().getNameAssignment_1()); 
            // InternalFortXTrans.g:4871:2: ( rule__FnDecl__NameAssignment_1 )
            // InternalFortXTrans.g:4871:3: rule__FnDecl__NameAssignment_1
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
    // InternalFortXTrans.g:4879:1: rule__FnDecl__Group__2 : rule__FnDecl__Group__2__Impl rule__FnDecl__Group__3 ;
    public final void rule__FnDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4883:1: ( rule__FnDecl__Group__2__Impl rule__FnDecl__Group__3 )
            // InternalFortXTrans.g:4884:2: rule__FnDecl__Group__2__Impl rule__FnDecl__Group__3
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
    // InternalFortXTrans.g:4891:1: rule__FnDecl__Group__2__Impl : ( ( rule__FnDecl__ParamsAssignment_2 ) ) ;
    public final void rule__FnDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4895:1: ( ( ( rule__FnDecl__ParamsAssignment_2 ) ) )
            // InternalFortXTrans.g:4896:1: ( ( rule__FnDecl__ParamsAssignment_2 ) )
            {
            // InternalFortXTrans.g:4896:1: ( ( rule__FnDecl__ParamsAssignment_2 ) )
            // InternalFortXTrans.g:4897:2: ( rule__FnDecl__ParamsAssignment_2 )
            {
             before(grammarAccess.getFnDeclAccess().getParamsAssignment_2()); 
            // InternalFortXTrans.g:4898:2: ( rule__FnDecl__ParamsAssignment_2 )
            // InternalFortXTrans.g:4898:3: rule__FnDecl__ParamsAssignment_2
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
    // InternalFortXTrans.g:4906:1: rule__FnDecl__Group__3 : rule__FnDecl__Group__3__Impl rule__FnDecl__Group__4 ;
    public final void rule__FnDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4910:1: ( rule__FnDecl__Group__3__Impl rule__FnDecl__Group__4 )
            // InternalFortXTrans.g:4911:2: rule__FnDecl__Group__3__Impl rule__FnDecl__Group__4
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
    // InternalFortXTrans.g:4918:1: rule__FnDecl__Group__3__Impl : ( ( rule__FnDecl__RetValAssignment_3 )? ) ;
    public final void rule__FnDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4922:1: ( ( ( rule__FnDecl__RetValAssignment_3 )? ) )
            // InternalFortXTrans.g:4923:1: ( ( rule__FnDecl__RetValAssignment_3 )? )
            {
            // InternalFortXTrans.g:4923:1: ( ( rule__FnDecl__RetValAssignment_3 )? )
            // InternalFortXTrans.g:4924:2: ( rule__FnDecl__RetValAssignment_3 )?
            {
             before(grammarAccess.getFnDeclAccess().getRetValAssignment_3()); 
            // InternalFortXTrans.g:4925:2: ( rule__FnDecl__RetValAssignment_3 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==30) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalFortXTrans.g:4925:3: rule__FnDecl__RetValAssignment_3
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
    // InternalFortXTrans.g:4933:1: rule__FnDecl__Group__4 : rule__FnDecl__Group__4__Impl ;
    public final void rule__FnDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4937:1: ( rule__FnDecl__Group__4__Impl )
            // InternalFortXTrans.g:4938:2: rule__FnDecl__Group__4__Impl
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
    // InternalFortXTrans.g:4944:1: rule__FnDecl__Group__4__Impl : ( ( rule__FnDecl__Group_4__0 )? ) ;
    public final void rule__FnDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4948:1: ( ( ( rule__FnDecl__Group_4__0 )? ) )
            // InternalFortXTrans.g:4949:1: ( ( rule__FnDecl__Group_4__0 )? )
            {
            // InternalFortXTrans.g:4949:1: ( ( rule__FnDecl__Group_4__0 )? )
            // InternalFortXTrans.g:4950:2: ( rule__FnDecl__Group_4__0 )?
            {
             before(grammarAccess.getFnDeclAccess().getGroup_4()); 
            // InternalFortXTrans.g:4951:2: ( rule__FnDecl__Group_4__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==38) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalFortXTrans.g:4951:3: rule__FnDecl__Group_4__0
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
    // InternalFortXTrans.g:4960:1: rule__FnDecl__Group_4__0 : rule__FnDecl__Group_4__0__Impl rule__FnDecl__Group_4__1 ;
    public final void rule__FnDecl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4964:1: ( rule__FnDecl__Group_4__0__Impl rule__FnDecl__Group_4__1 )
            // InternalFortXTrans.g:4965:2: rule__FnDecl__Group_4__0__Impl rule__FnDecl__Group_4__1
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
    // InternalFortXTrans.g:4972:1: rule__FnDecl__Group_4__0__Impl : ( ( rule__FnDecl__BodyAssignment_4_0 ) ) ;
    public final void rule__FnDecl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4976:1: ( ( ( rule__FnDecl__BodyAssignment_4_0 ) ) )
            // InternalFortXTrans.g:4977:1: ( ( rule__FnDecl__BodyAssignment_4_0 ) )
            {
            // InternalFortXTrans.g:4977:1: ( ( rule__FnDecl__BodyAssignment_4_0 ) )
            // InternalFortXTrans.g:4978:2: ( rule__FnDecl__BodyAssignment_4_0 )
            {
             before(grammarAccess.getFnDeclAccess().getBodyAssignment_4_0()); 
            // InternalFortXTrans.g:4979:2: ( rule__FnDecl__BodyAssignment_4_0 )
            // InternalFortXTrans.g:4979:3: rule__FnDecl__BodyAssignment_4_0
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
    // InternalFortXTrans.g:4987:1: rule__FnDecl__Group_4__1 : rule__FnDecl__Group_4__1__Impl ;
    public final void rule__FnDecl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:4991:1: ( rule__FnDecl__Group_4__1__Impl )
            // InternalFortXTrans.g:4992:2: rule__FnDecl__Group_4__1__Impl
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
    // InternalFortXTrans.g:4998:1: rule__FnDecl__Group_4__1__Impl : ( ( rule__FnDecl__FnItselfAssignment_4_1 ) ) ;
    public final void rule__FnDecl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5002:1: ( ( ( rule__FnDecl__FnItselfAssignment_4_1 ) ) )
            // InternalFortXTrans.g:5003:1: ( ( rule__FnDecl__FnItselfAssignment_4_1 ) )
            {
            // InternalFortXTrans.g:5003:1: ( ( rule__FnDecl__FnItselfAssignment_4_1 ) )
            // InternalFortXTrans.g:5004:2: ( rule__FnDecl__FnItselfAssignment_4_1 )
            {
             before(grammarAccess.getFnDeclAccess().getFnItselfAssignment_4_1()); 
            // InternalFortXTrans.g:5005:2: ( rule__FnDecl__FnItselfAssignment_4_1 )
            // InternalFortXTrans.g:5005:3: rule__FnDecl__FnItselfAssignment_4_1
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


    // $ANTLR start "rule__Expr__Group_0__0"
    // InternalFortXTrans.g:5014:1: rule__Expr__Group_0__0 : rule__Expr__Group_0__0__Impl rule__Expr__Group_0__1 ;
    public final void rule__Expr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5018:1: ( rule__Expr__Group_0__0__Impl rule__Expr__Group_0__1 )
            // InternalFortXTrans.g:5019:2: rule__Expr__Group_0__0__Impl rule__Expr__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__Expr__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expr__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_0__0"


    // $ANTLR start "rule__Expr__Group_0__0__Impl"
    // InternalFortXTrans.g:5026:1: rule__Expr__Group_0__0__Impl : ( ( rule__Expr__FrontAssignment_0_0 ) ) ;
    public final void rule__Expr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5030:1: ( ( ( rule__Expr__FrontAssignment_0_0 ) ) )
            // InternalFortXTrans.g:5031:1: ( ( rule__Expr__FrontAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:5031:1: ( ( rule__Expr__FrontAssignment_0_0 ) )
            // InternalFortXTrans.g:5032:2: ( rule__Expr__FrontAssignment_0_0 )
            {
             before(grammarAccess.getExprAccess().getFrontAssignment_0_0()); 
            // InternalFortXTrans.g:5033:2: ( rule__Expr__FrontAssignment_0_0 )
            // InternalFortXTrans.g:5033:3: rule__Expr__FrontAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Expr__FrontAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getFrontAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_0__0__Impl"


    // $ANTLR start "rule__Expr__Group_0__1"
    // InternalFortXTrans.g:5041:1: rule__Expr__Group_0__1 : rule__Expr__Group_0__1__Impl ;
    public final void rule__Expr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5045:1: ( rule__Expr__Group_0__1__Impl )
            // InternalFortXTrans.g:5046:2: rule__Expr__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expr__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_0__1"


    // $ANTLR start "rule__Expr__Group_0__1__Impl"
    // InternalFortXTrans.g:5052:1: rule__Expr__Group_0__1__Impl : ( ( rule__Expr__TailsAssignment_0_1 )* ) ;
    public final void rule__Expr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5056:1: ( ( ( rule__Expr__TailsAssignment_0_1 )* ) )
            // InternalFortXTrans.g:5057:1: ( ( rule__Expr__TailsAssignment_0_1 )* )
            {
            // InternalFortXTrans.g:5057:1: ( ( rule__Expr__TailsAssignment_0_1 )* )
            // InternalFortXTrans.g:5058:2: ( rule__Expr__TailsAssignment_0_1 )*
            {
             before(grammarAccess.getExprAccess().getTailsAssignment_0_1()); 
            // InternalFortXTrans.g:5059:2: ( rule__Expr__TailsAssignment_0_1 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==28) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalFortXTrans.g:5059:3: rule__Expr__TailsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Expr__TailsAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getExprAccess().getTailsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_0__1__Impl"


    // $ANTLR start "rule__ExprTail__Group__0"
    // InternalFortXTrans.g:5068:1: rule__ExprTail__Group__0 : rule__ExprTail__Group__0__Impl rule__ExprTail__Group__1 ;
    public final void rule__ExprTail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5072:1: ( rule__ExprTail__Group__0__Impl rule__ExprTail__Group__1 )
            // InternalFortXTrans.g:5073:2: rule__ExprTail__Group__0__Impl rule__ExprTail__Group__1
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
    // InternalFortXTrans.g:5080:1: rule__ExprTail__Group__0__Impl : ( 'as' ) ;
    public final void rule__ExprTail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5084:1: ( ( 'as' ) )
            // InternalFortXTrans.g:5085:1: ( 'as' )
            {
            // InternalFortXTrans.g:5085:1: ( 'as' )
            // InternalFortXTrans.g:5086:2: 'as'
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
    // InternalFortXTrans.g:5095:1: rule__ExprTail__Group__1 : rule__ExprTail__Group__1__Impl ;
    public final void rule__ExprTail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5099:1: ( rule__ExprTail__Group__1__Impl )
            // InternalFortXTrans.g:5100:2: rule__ExprTail__Group__1__Impl
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
    // InternalFortXTrans.g:5106:1: rule__ExprTail__Group__1__Impl : ( ( rule__ExprTail__TypeAssignment_1 ) ) ;
    public final void rule__ExprTail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5110:1: ( ( ( rule__ExprTail__TypeAssignment_1 ) ) )
            // InternalFortXTrans.g:5111:1: ( ( rule__ExprTail__TypeAssignment_1 ) )
            {
            // InternalFortXTrans.g:5111:1: ( ( rule__ExprTail__TypeAssignment_1 ) )
            // InternalFortXTrans.g:5112:2: ( rule__ExprTail__TypeAssignment_1 )
            {
             before(grammarAccess.getExprTailAccess().getTypeAssignment_1()); 
            // InternalFortXTrans.g:5113:2: ( rule__ExprTail__TypeAssignment_1 )
            // InternalFortXTrans.g:5113:3: rule__ExprTail__TypeAssignment_1
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
    // InternalFortXTrans.g:5122:1: rule__DelimitedExpr__Group_1__0 : rule__DelimitedExpr__Group_1__0__Impl rule__DelimitedExpr__Group_1__1 ;
    public final void rule__DelimitedExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5126:1: ( rule__DelimitedExpr__Group_1__0__Impl rule__DelimitedExpr__Group_1__1 )
            // InternalFortXTrans.g:5127:2: rule__DelimitedExpr__Group_1__0__Impl rule__DelimitedExpr__Group_1__1
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
    // InternalFortXTrans.g:5134:1: rule__DelimitedExpr__Group_1__0__Impl : ( ( rule__DelimitedExpr__AwhileAssignment_1_0 ) ) ;
    public final void rule__DelimitedExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5138:1: ( ( ( rule__DelimitedExpr__AwhileAssignment_1_0 ) ) )
            // InternalFortXTrans.g:5139:1: ( ( rule__DelimitedExpr__AwhileAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:5139:1: ( ( rule__DelimitedExpr__AwhileAssignment_1_0 ) )
            // InternalFortXTrans.g:5140:2: ( rule__DelimitedExpr__AwhileAssignment_1_0 )
            {
             before(grammarAccess.getDelimitedExprAccess().getAwhileAssignment_1_0()); 
            // InternalFortXTrans.g:5141:2: ( rule__DelimitedExpr__AwhileAssignment_1_0 )
            // InternalFortXTrans.g:5141:3: rule__DelimitedExpr__AwhileAssignment_1_0
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
    // InternalFortXTrans.g:5149:1: rule__DelimitedExpr__Group_1__1 : rule__DelimitedExpr__Group_1__1__Impl rule__DelimitedExpr__Group_1__2 ;
    public final void rule__DelimitedExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5153:1: ( rule__DelimitedExpr__Group_1__1__Impl rule__DelimitedExpr__Group_1__2 )
            // InternalFortXTrans.g:5154:2: rule__DelimitedExpr__Group_1__1__Impl rule__DelimitedExpr__Group_1__2
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
    // InternalFortXTrans.g:5161:1: rule__DelimitedExpr__Group_1__1__Impl : ( ( rule__DelimitedExpr__ExprAssignment_1_1 ) ) ;
    public final void rule__DelimitedExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5165:1: ( ( ( rule__DelimitedExpr__ExprAssignment_1_1 ) ) )
            // InternalFortXTrans.g:5166:1: ( ( rule__DelimitedExpr__ExprAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:5166:1: ( ( rule__DelimitedExpr__ExprAssignment_1_1 ) )
            // InternalFortXTrans.g:5167:2: ( rule__DelimitedExpr__ExprAssignment_1_1 )
            {
             before(grammarAccess.getDelimitedExprAccess().getExprAssignment_1_1()); 
            // InternalFortXTrans.g:5168:2: ( rule__DelimitedExpr__ExprAssignment_1_1 )
            // InternalFortXTrans.g:5168:3: rule__DelimitedExpr__ExprAssignment_1_1
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
    // InternalFortXTrans.g:5176:1: rule__DelimitedExpr__Group_1__2 : rule__DelimitedExpr__Group_1__2__Impl ;
    public final void rule__DelimitedExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5180:1: ( rule__DelimitedExpr__Group_1__2__Impl )
            // InternalFortXTrans.g:5181:2: rule__DelimitedExpr__Group_1__2__Impl
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
    // InternalFortXTrans.g:5187:1: rule__DelimitedExpr__Group_1__2__Impl : ( ( rule__DelimitedExpr__WhiledodAssignment_1_2 ) ) ;
    public final void rule__DelimitedExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5191:1: ( ( ( rule__DelimitedExpr__WhiledodAssignment_1_2 ) ) )
            // InternalFortXTrans.g:5192:1: ( ( rule__DelimitedExpr__WhiledodAssignment_1_2 ) )
            {
            // InternalFortXTrans.g:5192:1: ( ( rule__DelimitedExpr__WhiledodAssignment_1_2 ) )
            // InternalFortXTrans.g:5193:2: ( rule__DelimitedExpr__WhiledodAssignment_1_2 )
            {
             before(grammarAccess.getDelimitedExprAccess().getWhiledodAssignment_1_2()); 
            // InternalFortXTrans.g:5194:2: ( rule__DelimitedExpr__WhiledodAssignment_1_2 )
            // InternalFortXTrans.g:5194:3: rule__DelimitedExpr__WhiledodAssignment_1_2
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
    // InternalFortXTrans.g:5203:1: rule__DelimitedExpr__Group_2__0 : rule__DelimitedExpr__Group_2__0__Impl rule__DelimitedExpr__Group_2__1 ;
    public final void rule__DelimitedExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5207:1: ( rule__DelimitedExpr__Group_2__0__Impl rule__DelimitedExpr__Group_2__1 )
            // InternalFortXTrans.g:5208:2: rule__DelimitedExpr__Group_2__0__Impl rule__DelimitedExpr__Group_2__1
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
    // InternalFortXTrans.g:5215:1: rule__DelimitedExpr__Group_2__0__Impl : ( ( rule__DelimitedExpr__AforAssignment_2_0 ) ) ;
    public final void rule__DelimitedExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5219:1: ( ( ( rule__DelimitedExpr__AforAssignment_2_0 ) ) )
            // InternalFortXTrans.g:5220:1: ( ( rule__DelimitedExpr__AforAssignment_2_0 ) )
            {
            // InternalFortXTrans.g:5220:1: ( ( rule__DelimitedExpr__AforAssignment_2_0 ) )
            // InternalFortXTrans.g:5221:2: ( rule__DelimitedExpr__AforAssignment_2_0 )
            {
             before(grammarAccess.getDelimitedExprAccess().getAforAssignment_2_0()); 
            // InternalFortXTrans.g:5222:2: ( rule__DelimitedExpr__AforAssignment_2_0 )
            // InternalFortXTrans.g:5222:3: rule__DelimitedExpr__AforAssignment_2_0
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
    // InternalFortXTrans.g:5230:1: rule__DelimitedExpr__Group_2__1 : rule__DelimitedExpr__Group_2__1__Impl rule__DelimitedExpr__Group_2__2 ;
    public final void rule__DelimitedExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5234:1: ( rule__DelimitedExpr__Group_2__1__Impl rule__DelimitedExpr__Group_2__2 )
            // InternalFortXTrans.g:5235:2: rule__DelimitedExpr__Group_2__1__Impl rule__DelimitedExpr__Group_2__2
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
    // InternalFortXTrans.g:5242:1: rule__DelimitedExpr__Group_2__1__Impl : ( ( rule__DelimitedExpr__GenAssignment_2_1 ) ) ;
    public final void rule__DelimitedExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5246:1: ( ( ( rule__DelimitedExpr__GenAssignment_2_1 ) ) )
            // InternalFortXTrans.g:5247:1: ( ( rule__DelimitedExpr__GenAssignment_2_1 ) )
            {
            // InternalFortXTrans.g:5247:1: ( ( rule__DelimitedExpr__GenAssignment_2_1 ) )
            // InternalFortXTrans.g:5248:2: ( rule__DelimitedExpr__GenAssignment_2_1 )
            {
             before(grammarAccess.getDelimitedExprAccess().getGenAssignment_2_1()); 
            // InternalFortXTrans.g:5249:2: ( rule__DelimitedExpr__GenAssignment_2_1 )
            // InternalFortXTrans.g:5249:3: rule__DelimitedExpr__GenAssignment_2_1
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
    // InternalFortXTrans.g:5257:1: rule__DelimitedExpr__Group_2__2 : rule__DelimitedExpr__Group_2__2__Impl rule__DelimitedExpr__Group_2__3 ;
    public final void rule__DelimitedExpr__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5261:1: ( rule__DelimitedExpr__Group_2__2__Impl rule__DelimitedExpr__Group_2__3 )
            // InternalFortXTrans.g:5262:2: rule__DelimitedExpr__Group_2__2__Impl rule__DelimitedExpr__Group_2__3
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
    // InternalFortXTrans.g:5269:1: rule__DelimitedExpr__Group_2__2__Impl : ( ( rule__DelimitedExpr__DofrontAssignment_2_2 ) ) ;
    public final void rule__DelimitedExpr__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5273:1: ( ( ( rule__DelimitedExpr__DofrontAssignment_2_2 ) ) )
            // InternalFortXTrans.g:5274:1: ( ( rule__DelimitedExpr__DofrontAssignment_2_2 ) )
            {
            // InternalFortXTrans.g:5274:1: ( ( rule__DelimitedExpr__DofrontAssignment_2_2 ) )
            // InternalFortXTrans.g:5275:2: ( rule__DelimitedExpr__DofrontAssignment_2_2 )
            {
             before(grammarAccess.getDelimitedExprAccess().getDofrontAssignment_2_2()); 
            // InternalFortXTrans.g:5276:2: ( rule__DelimitedExpr__DofrontAssignment_2_2 )
            // InternalFortXTrans.g:5276:3: rule__DelimitedExpr__DofrontAssignment_2_2
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
    // InternalFortXTrans.g:5284:1: rule__DelimitedExpr__Group_2__3 : rule__DelimitedExpr__Group_2__3__Impl ;
    public final void rule__DelimitedExpr__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5288:1: ( rule__DelimitedExpr__Group_2__3__Impl )
            // InternalFortXTrans.g:5289:2: rule__DelimitedExpr__Group_2__3__Impl
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
    // InternalFortXTrans.g:5295:1: rule__DelimitedExpr__Group_2__3__Impl : ( 'end' ) ;
    public final void rule__DelimitedExpr__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5299:1: ( ( 'end' ) )
            // InternalFortXTrans.g:5300:1: ( 'end' )
            {
            // InternalFortXTrans.g:5300:1: ( 'end' )
            // InternalFortXTrans.g:5301:2: 'end'
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
    // InternalFortXTrans.g:5311:1: rule__DelimitedExpr__Group_3__0 : rule__DelimitedExpr__Group_3__0__Impl rule__DelimitedExpr__Group_3__1 ;
    public final void rule__DelimitedExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5315:1: ( rule__DelimitedExpr__Group_3__0__Impl rule__DelimitedExpr__Group_3__1 )
            // InternalFortXTrans.g:5316:2: rule__DelimitedExpr__Group_3__0__Impl rule__DelimitedExpr__Group_3__1
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
    // InternalFortXTrans.g:5323:1: rule__DelimitedExpr__Group_3__0__Impl : ( ( rule__DelimitedExpr__AnifAssignment_3_0 ) ) ;
    public final void rule__DelimitedExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5327:1: ( ( ( rule__DelimitedExpr__AnifAssignment_3_0 ) ) )
            // InternalFortXTrans.g:5328:1: ( ( rule__DelimitedExpr__AnifAssignment_3_0 ) )
            {
            // InternalFortXTrans.g:5328:1: ( ( rule__DelimitedExpr__AnifAssignment_3_0 ) )
            // InternalFortXTrans.g:5329:2: ( rule__DelimitedExpr__AnifAssignment_3_0 )
            {
             before(grammarAccess.getDelimitedExprAccess().getAnifAssignment_3_0()); 
            // InternalFortXTrans.g:5330:2: ( rule__DelimitedExpr__AnifAssignment_3_0 )
            // InternalFortXTrans.g:5330:3: rule__DelimitedExpr__AnifAssignment_3_0
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
    // InternalFortXTrans.g:5338:1: rule__DelimitedExpr__Group_3__1 : rule__DelimitedExpr__Group_3__1__Impl rule__DelimitedExpr__Group_3__2 ;
    public final void rule__DelimitedExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5342:1: ( rule__DelimitedExpr__Group_3__1__Impl rule__DelimitedExpr__Group_3__2 )
            // InternalFortXTrans.g:5343:2: rule__DelimitedExpr__Group_3__1__Impl rule__DelimitedExpr__Group_3__2
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
    // InternalFortXTrans.g:5350:1: rule__DelimitedExpr__Group_3__1__Impl : ( ( rule__DelimitedExpr__CondAssignment_3_1 ) ) ;
    public final void rule__DelimitedExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5354:1: ( ( ( rule__DelimitedExpr__CondAssignment_3_1 ) ) )
            // InternalFortXTrans.g:5355:1: ( ( rule__DelimitedExpr__CondAssignment_3_1 ) )
            {
            // InternalFortXTrans.g:5355:1: ( ( rule__DelimitedExpr__CondAssignment_3_1 ) )
            // InternalFortXTrans.g:5356:2: ( rule__DelimitedExpr__CondAssignment_3_1 )
            {
             before(grammarAccess.getDelimitedExprAccess().getCondAssignment_3_1()); 
            // InternalFortXTrans.g:5357:2: ( rule__DelimitedExpr__CondAssignment_3_1 )
            // InternalFortXTrans.g:5357:3: rule__DelimitedExpr__CondAssignment_3_1
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
    // InternalFortXTrans.g:5365:1: rule__DelimitedExpr__Group_3__2 : rule__DelimitedExpr__Group_3__2__Impl rule__DelimitedExpr__Group_3__3 ;
    public final void rule__DelimitedExpr__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5369:1: ( rule__DelimitedExpr__Group_3__2__Impl rule__DelimitedExpr__Group_3__3 )
            // InternalFortXTrans.g:5370:2: rule__DelimitedExpr__Group_3__2__Impl rule__DelimitedExpr__Group_3__3
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
    // InternalFortXTrans.g:5377:1: rule__DelimitedExpr__Group_3__2__Impl : ( 'then' ) ;
    public final void rule__DelimitedExpr__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5381:1: ( ( 'then' ) )
            // InternalFortXTrans.g:5382:1: ( 'then' )
            {
            // InternalFortXTrans.g:5382:1: ( 'then' )
            // InternalFortXTrans.g:5383:2: 'then'
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
    // InternalFortXTrans.g:5392:1: rule__DelimitedExpr__Group_3__3 : rule__DelimitedExpr__Group_3__3__Impl rule__DelimitedExpr__Group_3__4 ;
    public final void rule__DelimitedExpr__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5396:1: ( rule__DelimitedExpr__Group_3__3__Impl rule__DelimitedExpr__Group_3__4 )
            // InternalFortXTrans.g:5397:2: rule__DelimitedExpr__Group_3__3__Impl rule__DelimitedExpr__Group_3__4
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
    // InternalFortXTrans.g:5404:1: rule__DelimitedExpr__Group_3__3__Impl : ( ( rule__DelimitedExpr__BlockAssignment_3_3 ) ) ;
    public final void rule__DelimitedExpr__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5408:1: ( ( ( rule__DelimitedExpr__BlockAssignment_3_3 ) ) )
            // InternalFortXTrans.g:5409:1: ( ( rule__DelimitedExpr__BlockAssignment_3_3 ) )
            {
            // InternalFortXTrans.g:5409:1: ( ( rule__DelimitedExpr__BlockAssignment_3_3 ) )
            // InternalFortXTrans.g:5410:2: ( rule__DelimitedExpr__BlockAssignment_3_3 )
            {
             before(grammarAccess.getDelimitedExprAccess().getBlockAssignment_3_3()); 
            // InternalFortXTrans.g:5411:2: ( rule__DelimitedExpr__BlockAssignment_3_3 )
            // InternalFortXTrans.g:5411:3: rule__DelimitedExpr__BlockAssignment_3_3
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
    // InternalFortXTrans.g:5419:1: rule__DelimitedExpr__Group_3__4 : rule__DelimitedExpr__Group_3__4__Impl rule__DelimitedExpr__Group_3__5 ;
    public final void rule__DelimitedExpr__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5423:1: ( rule__DelimitedExpr__Group_3__4__Impl rule__DelimitedExpr__Group_3__5 )
            // InternalFortXTrans.g:5424:2: rule__DelimitedExpr__Group_3__4__Impl rule__DelimitedExpr__Group_3__5
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
    // InternalFortXTrans.g:5431:1: rule__DelimitedExpr__Group_3__4__Impl : ( ( rule__DelimitedExpr__ElifsAssignment_3_4 )? ) ;
    public final void rule__DelimitedExpr__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5435:1: ( ( ( rule__DelimitedExpr__ElifsAssignment_3_4 )? ) )
            // InternalFortXTrans.g:5436:1: ( ( rule__DelimitedExpr__ElifsAssignment_3_4 )? )
            {
            // InternalFortXTrans.g:5436:1: ( ( rule__DelimitedExpr__ElifsAssignment_3_4 )? )
            // InternalFortXTrans.g:5437:2: ( rule__DelimitedExpr__ElifsAssignment_3_4 )?
            {
             before(grammarAccess.getDelimitedExprAccess().getElifsAssignment_3_4()); 
            // InternalFortXTrans.g:5438:2: ( rule__DelimitedExpr__ElifsAssignment_3_4 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==33) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalFortXTrans.g:5438:3: rule__DelimitedExpr__ElifsAssignment_3_4
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
    // InternalFortXTrans.g:5446:1: rule__DelimitedExpr__Group_3__5 : rule__DelimitedExpr__Group_3__5__Impl rule__DelimitedExpr__Group_3__6 ;
    public final void rule__DelimitedExpr__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5450:1: ( rule__DelimitedExpr__Group_3__5__Impl rule__DelimitedExpr__Group_3__6 )
            // InternalFortXTrans.g:5451:2: rule__DelimitedExpr__Group_3__5__Impl rule__DelimitedExpr__Group_3__6
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
    // InternalFortXTrans.g:5458:1: rule__DelimitedExpr__Group_3__5__Impl : ( ( rule__DelimitedExpr__ElsAssignment_3_5 )? ) ;
    public final void rule__DelimitedExpr__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5462:1: ( ( ( rule__DelimitedExpr__ElsAssignment_3_5 )? ) )
            // InternalFortXTrans.g:5463:1: ( ( rule__DelimitedExpr__ElsAssignment_3_5 )? )
            {
            // InternalFortXTrans.g:5463:1: ( ( rule__DelimitedExpr__ElsAssignment_3_5 )? )
            // InternalFortXTrans.g:5464:2: ( rule__DelimitedExpr__ElsAssignment_3_5 )?
            {
             before(grammarAccess.getDelimitedExprAccess().getElsAssignment_3_5()); 
            // InternalFortXTrans.g:5465:2: ( rule__DelimitedExpr__ElsAssignment_3_5 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==34) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalFortXTrans.g:5465:3: rule__DelimitedExpr__ElsAssignment_3_5
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
    // InternalFortXTrans.g:5473:1: rule__DelimitedExpr__Group_3__6 : rule__DelimitedExpr__Group_3__6__Impl ;
    public final void rule__DelimitedExpr__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5477:1: ( rule__DelimitedExpr__Group_3__6__Impl )
            // InternalFortXTrans.g:5478:2: rule__DelimitedExpr__Group_3__6__Impl
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
    // InternalFortXTrans.g:5484:1: rule__DelimitedExpr__Group_3__6__Impl : ( 'end' ) ;
    public final void rule__DelimitedExpr__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5488:1: ( ( 'end' ) )
            // InternalFortXTrans.g:5489:1: ( 'end' )
            {
            // InternalFortXTrans.g:5489:1: ( 'end' )
            // InternalFortXTrans.g:5490:2: 'end'
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
    // InternalFortXTrans.g:5500:1: rule__Elifs__Group__0 : rule__Elifs__Group__0__Impl rule__Elifs__Group__1 ;
    public final void rule__Elifs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5504:1: ( rule__Elifs__Group__0__Impl rule__Elifs__Group__1 )
            // InternalFortXTrans.g:5505:2: rule__Elifs__Group__0__Impl rule__Elifs__Group__1
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
    // InternalFortXTrans.g:5512:1: rule__Elifs__Group__0__Impl : ( ( rule__Elifs__EAssignment_0 ) ) ;
    public final void rule__Elifs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5516:1: ( ( ( rule__Elifs__EAssignment_0 ) ) )
            // InternalFortXTrans.g:5517:1: ( ( rule__Elifs__EAssignment_0 ) )
            {
            // InternalFortXTrans.g:5517:1: ( ( rule__Elifs__EAssignment_0 ) )
            // InternalFortXTrans.g:5518:2: ( rule__Elifs__EAssignment_0 )
            {
             before(grammarAccess.getElifsAccess().getEAssignment_0()); 
            // InternalFortXTrans.g:5519:2: ( rule__Elifs__EAssignment_0 )
            // InternalFortXTrans.g:5519:3: rule__Elifs__EAssignment_0
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
    // InternalFortXTrans.g:5527:1: rule__Elifs__Group__1 : rule__Elifs__Group__1__Impl ;
    public final void rule__Elifs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5531:1: ( rule__Elifs__Group__1__Impl )
            // InternalFortXTrans.g:5532:2: rule__Elifs__Group__1__Impl
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
    // InternalFortXTrans.g:5538:1: rule__Elifs__Group__1__Impl : ( ( rule__Elifs__EAssignment_1 )* ) ;
    public final void rule__Elifs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5542:1: ( ( ( rule__Elifs__EAssignment_1 )* ) )
            // InternalFortXTrans.g:5543:1: ( ( rule__Elifs__EAssignment_1 )* )
            {
            // InternalFortXTrans.g:5543:1: ( ( rule__Elifs__EAssignment_1 )* )
            // InternalFortXTrans.g:5544:2: ( rule__Elifs__EAssignment_1 )*
            {
             before(grammarAccess.getElifsAccess().getEAssignment_1()); 
            // InternalFortXTrans.g:5545:2: ( rule__Elifs__EAssignment_1 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==33) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalFortXTrans.g:5545:3: rule__Elifs__EAssignment_1
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__Elifs__EAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalFortXTrans.g:5554:1: rule__Elif__Group__0 : rule__Elif__Group__0__Impl rule__Elif__Group__1 ;
    public final void rule__Elif__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5558:1: ( rule__Elif__Group__0__Impl rule__Elif__Group__1 )
            // InternalFortXTrans.g:5559:2: rule__Elif__Group__0__Impl rule__Elif__Group__1
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
    // InternalFortXTrans.g:5566:1: rule__Elif__Group__0__Impl : ( 'elif' ) ;
    public final void rule__Elif__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5570:1: ( ( 'elif' ) )
            // InternalFortXTrans.g:5571:1: ( 'elif' )
            {
            // InternalFortXTrans.g:5571:1: ( 'elif' )
            // InternalFortXTrans.g:5572:2: 'elif'
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
    // InternalFortXTrans.g:5581:1: rule__Elif__Group__1 : rule__Elif__Group__1__Impl rule__Elif__Group__2 ;
    public final void rule__Elif__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5585:1: ( rule__Elif__Group__1__Impl rule__Elif__Group__2 )
            // InternalFortXTrans.g:5586:2: rule__Elif__Group__1__Impl rule__Elif__Group__2
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
    // InternalFortXTrans.g:5593:1: rule__Elif__Group__1__Impl : ( ( rule__Elif__ExprAssignment_1 ) ) ;
    public final void rule__Elif__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5597:1: ( ( ( rule__Elif__ExprAssignment_1 ) ) )
            // InternalFortXTrans.g:5598:1: ( ( rule__Elif__ExprAssignment_1 ) )
            {
            // InternalFortXTrans.g:5598:1: ( ( rule__Elif__ExprAssignment_1 ) )
            // InternalFortXTrans.g:5599:2: ( rule__Elif__ExprAssignment_1 )
            {
             before(grammarAccess.getElifAccess().getExprAssignment_1()); 
            // InternalFortXTrans.g:5600:2: ( rule__Elif__ExprAssignment_1 )
            // InternalFortXTrans.g:5600:3: rule__Elif__ExprAssignment_1
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
    // InternalFortXTrans.g:5608:1: rule__Elif__Group__2 : rule__Elif__Group__2__Impl rule__Elif__Group__3 ;
    public final void rule__Elif__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5612:1: ( rule__Elif__Group__2__Impl rule__Elif__Group__3 )
            // InternalFortXTrans.g:5613:2: rule__Elif__Group__2__Impl rule__Elif__Group__3
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
    // InternalFortXTrans.g:5620:1: rule__Elif__Group__2__Impl : ( 'then' ) ;
    public final void rule__Elif__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5624:1: ( ( 'then' ) )
            // InternalFortXTrans.g:5625:1: ( 'then' )
            {
            // InternalFortXTrans.g:5625:1: ( 'then' )
            // InternalFortXTrans.g:5626:2: 'then'
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
    // InternalFortXTrans.g:5635:1: rule__Elif__Group__3 : rule__Elif__Group__3__Impl ;
    public final void rule__Elif__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5639:1: ( rule__Elif__Group__3__Impl )
            // InternalFortXTrans.g:5640:2: rule__Elif__Group__3__Impl
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
    // InternalFortXTrans.g:5646:1: rule__Elif__Group__3__Impl : ( ( rule__Elif__BlockAssignment_3 ) ) ;
    public final void rule__Elif__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5650:1: ( ( ( rule__Elif__BlockAssignment_3 ) ) )
            // InternalFortXTrans.g:5651:1: ( ( rule__Elif__BlockAssignment_3 ) )
            {
            // InternalFortXTrans.g:5651:1: ( ( rule__Elif__BlockAssignment_3 ) )
            // InternalFortXTrans.g:5652:2: ( rule__Elif__BlockAssignment_3 )
            {
             before(grammarAccess.getElifAccess().getBlockAssignment_3()); 
            // InternalFortXTrans.g:5653:2: ( rule__Elif__BlockAssignment_3 )
            // InternalFortXTrans.g:5653:3: rule__Elif__BlockAssignment_3
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
    // InternalFortXTrans.g:5662:1: rule__Else__Group__0 : rule__Else__Group__0__Impl rule__Else__Group__1 ;
    public final void rule__Else__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5666:1: ( rule__Else__Group__0__Impl rule__Else__Group__1 )
            // InternalFortXTrans.g:5667:2: rule__Else__Group__0__Impl rule__Else__Group__1
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
    // InternalFortXTrans.g:5674:1: rule__Else__Group__0__Impl : ( 'else' ) ;
    public final void rule__Else__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5678:1: ( ( 'else' ) )
            // InternalFortXTrans.g:5679:1: ( 'else' )
            {
            // InternalFortXTrans.g:5679:1: ( 'else' )
            // InternalFortXTrans.g:5680:2: 'else'
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
    // InternalFortXTrans.g:5689:1: rule__Else__Group__1 : rule__Else__Group__1__Impl ;
    public final void rule__Else__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5693:1: ( rule__Else__Group__1__Impl )
            // InternalFortXTrans.g:5694:2: rule__Else__Group__1__Impl
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
    // InternalFortXTrans.g:5700:1: rule__Else__Group__1__Impl : ( ( rule__Else__BlockAssignment_1 ) ) ;
    public final void rule__Else__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5704:1: ( ( ( rule__Else__BlockAssignment_1 ) ) )
            // InternalFortXTrans.g:5705:1: ( ( rule__Else__BlockAssignment_1 ) )
            {
            // InternalFortXTrans.g:5705:1: ( ( rule__Else__BlockAssignment_1 ) )
            // InternalFortXTrans.g:5706:2: ( rule__Else__BlockAssignment_1 )
            {
             before(grammarAccess.getElseAccess().getBlockAssignment_1()); 
            // InternalFortXTrans.g:5707:2: ( rule__Else__BlockAssignment_1 )
            // InternalFortXTrans.g:5707:3: rule__Else__BlockAssignment_1
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
    // InternalFortXTrans.g:5716:1: rule__Generators__Group__0 : rule__Generators__Group__0__Impl rule__Generators__Group__1 ;
    public final void rule__Generators__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5720:1: ( rule__Generators__Group__0__Impl rule__Generators__Group__1 )
            // InternalFortXTrans.g:5721:2: rule__Generators__Group__0__Impl rule__Generators__Group__1
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
    // InternalFortXTrans.g:5728:1: rule__Generators__Group__0__Impl : ( ( rule__Generators__BindingAssignment_0 ) ) ;
    public final void rule__Generators__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5732:1: ( ( ( rule__Generators__BindingAssignment_0 ) ) )
            // InternalFortXTrans.g:5733:1: ( ( rule__Generators__BindingAssignment_0 ) )
            {
            // InternalFortXTrans.g:5733:1: ( ( rule__Generators__BindingAssignment_0 ) )
            // InternalFortXTrans.g:5734:2: ( rule__Generators__BindingAssignment_0 )
            {
             before(grammarAccess.getGeneratorsAccess().getBindingAssignment_0()); 
            // InternalFortXTrans.g:5735:2: ( rule__Generators__BindingAssignment_0 )
            // InternalFortXTrans.g:5735:3: rule__Generators__BindingAssignment_0
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
    // InternalFortXTrans.g:5743:1: rule__Generators__Group__1 : rule__Generators__Group__1__Impl ;
    public final void rule__Generators__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5747:1: ( rule__Generators__Group__1__Impl )
            // InternalFortXTrans.g:5748:2: rule__Generators__Group__1__Impl
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
    // InternalFortXTrans.g:5754:1: rule__Generators__Group__1__Impl : ( ( rule__Generators__Group_1__0 )* ) ;
    public final void rule__Generators__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5758:1: ( ( ( rule__Generators__Group_1__0 )* ) )
            // InternalFortXTrans.g:5759:1: ( ( rule__Generators__Group_1__0 )* )
            {
            // InternalFortXTrans.g:5759:1: ( ( rule__Generators__Group_1__0 )* )
            // InternalFortXTrans.g:5760:2: ( rule__Generators__Group_1__0 )*
            {
             before(grammarAccess.getGeneratorsAccess().getGroup_1()); 
            // InternalFortXTrans.g:5761:2: ( rule__Generators__Group_1__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==25) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalFortXTrans.g:5761:3: rule__Generators__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Generators__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalFortXTrans.g:5770:1: rule__Generators__Group_1__0 : rule__Generators__Group_1__0__Impl rule__Generators__Group_1__1 ;
    public final void rule__Generators__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5774:1: ( rule__Generators__Group_1__0__Impl rule__Generators__Group_1__1 )
            // InternalFortXTrans.g:5775:2: rule__Generators__Group_1__0__Impl rule__Generators__Group_1__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalFortXTrans.g:5782:1: rule__Generators__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Generators__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5786:1: ( ( ',' ) )
            // InternalFortXTrans.g:5787:1: ( ',' )
            {
            // InternalFortXTrans.g:5787:1: ( ',' )
            // InternalFortXTrans.g:5788:2: ','
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
    // InternalFortXTrans.g:5797:1: rule__Generators__Group_1__1 : rule__Generators__Group_1__1__Impl ;
    public final void rule__Generators__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5801:1: ( rule__Generators__Group_1__1__Impl )
            // InternalFortXTrans.g:5802:2: rule__Generators__Group_1__1__Impl
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
    // InternalFortXTrans.g:5808:1: rule__Generators__Group_1__1__Impl : ( ( rule__Generators__ClauseAssignment_1_1 ) ) ;
    public final void rule__Generators__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5812:1: ( ( ( rule__Generators__ClauseAssignment_1_1 ) ) )
            // InternalFortXTrans.g:5813:1: ( ( rule__Generators__ClauseAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:5813:1: ( ( rule__Generators__ClauseAssignment_1_1 ) )
            // InternalFortXTrans.g:5814:2: ( rule__Generators__ClauseAssignment_1_1 )
            {
             before(grammarAccess.getGeneratorsAccess().getClauseAssignment_1_1()); 
            // InternalFortXTrans.g:5815:2: ( rule__Generators__ClauseAssignment_1_1 )
            // InternalFortXTrans.g:5815:3: rule__Generators__ClauseAssignment_1_1
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
    // InternalFortXTrans.g:5824:1: rule__Binding__Group_0__0 : rule__Binding__Group_0__0__Impl rule__Binding__Group_0__1 ;
    public final void rule__Binding__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5828:1: ( rule__Binding__Group_0__0__Impl rule__Binding__Group_0__1 )
            // InternalFortXTrans.g:5829:2: rule__Binding__Group_0__0__Impl rule__Binding__Group_0__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalFortXTrans.g:5836:1: rule__Binding__Group_0__0__Impl : ( ( rule__Binding__IdtupAssignment_0_0 ) ) ;
    public final void rule__Binding__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5840:1: ( ( ( rule__Binding__IdtupAssignment_0_0 ) ) )
            // InternalFortXTrans.g:5841:1: ( ( rule__Binding__IdtupAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:5841:1: ( ( rule__Binding__IdtupAssignment_0_0 ) )
            // InternalFortXTrans.g:5842:2: ( rule__Binding__IdtupAssignment_0_0 )
            {
             before(grammarAccess.getBindingAccess().getIdtupAssignment_0_0()); 
            // InternalFortXTrans.g:5843:2: ( rule__Binding__IdtupAssignment_0_0 )
            // InternalFortXTrans.g:5843:3: rule__Binding__IdtupAssignment_0_0
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
    // InternalFortXTrans.g:5851:1: rule__Binding__Group_0__1 : rule__Binding__Group_0__1__Impl rule__Binding__Group_0__2 ;
    public final void rule__Binding__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5855:1: ( rule__Binding__Group_0__1__Impl rule__Binding__Group_0__2 )
            // InternalFortXTrans.g:5856:2: rule__Binding__Group_0__1__Impl rule__Binding__Group_0__2
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
    // InternalFortXTrans.g:5863:1: rule__Binding__Group_0__1__Impl : ( '<-' ) ;
    public final void rule__Binding__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5867:1: ( ( '<-' ) )
            // InternalFortXTrans.g:5868:1: ( '<-' )
            {
            // InternalFortXTrans.g:5868:1: ( '<-' )
            // InternalFortXTrans.g:5869:2: '<-'
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
    // InternalFortXTrans.g:5878:1: rule__Binding__Group_0__2 : rule__Binding__Group_0__2__Impl ;
    public final void rule__Binding__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5882:1: ( rule__Binding__Group_0__2__Impl )
            // InternalFortXTrans.g:5883:2: rule__Binding__Group_0__2__Impl
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
    // InternalFortXTrans.g:5889:1: rule__Binding__Group_0__2__Impl : ( ( rule__Binding__ExprAssignment_0_2 ) ) ;
    public final void rule__Binding__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5893:1: ( ( ( rule__Binding__ExprAssignment_0_2 ) ) )
            // InternalFortXTrans.g:5894:1: ( ( rule__Binding__ExprAssignment_0_2 ) )
            {
            // InternalFortXTrans.g:5894:1: ( ( rule__Binding__ExprAssignment_0_2 ) )
            // InternalFortXTrans.g:5895:2: ( rule__Binding__ExprAssignment_0_2 )
            {
             before(grammarAccess.getBindingAccess().getExprAssignment_0_2()); 
            // InternalFortXTrans.g:5896:2: ( rule__Binding__ExprAssignment_0_2 )
            // InternalFortXTrans.g:5896:3: rule__Binding__ExprAssignment_0_2
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
    // InternalFortXTrans.g:5905:1: rule__Binding__Group_1__0 : rule__Binding__Group_1__0__Impl rule__Binding__Group_1__1 ;
    public final void rule__Binding__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5909:1: ( rule__Binding__Group_1__0__Impl rule__Binding__Group_1__1 )
            // InternalFortXTrans.g:5910:2: rule__Binding__Group_1__0__Impl rule__Binding__Group_1__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalFortXTrans.g:5917:1: rule__Binding__Group_1__0__Impl : ( ( rule__Binding__IdtupAssignment_1_0 ) ) ;
    public final void rule__Binding__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5921:1: ( ( ( rule__Binding__IdtupAssignment_1_0 ) ) )
            // InternalFortXTrans.g:5922:1: ( ( rule__Binding__IdtupAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:5922:1: ( ( rule__Binding__IdtupAssignment_1_0 ) )
            // InternalFortXTrans.g:5923:2: ( rule__Binding__IdtupAssignment_1_0 )
            {
             before(grammarAccess.getBindingAccess().getIdtupAssignment_1_0()); 
            // InternalFortXTrans.g:5924:2: ( rule__Binding__IdtupAssignment_1_0 )
            // InternalFortXTrans.g:5924:3: rule__Binding__IdtupAssignment_1_0
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
    // InternalFortXTrans.g:5932:1: rule__Binding__Group_1__1 : rule__Binding__Group_1__1__Impl rule__Binding__Group_1__2 ;
    public final void rule__Binding__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5936:1: ( rule__Binding__Group_1__1__Impl rule__Binding__Group_1__2 )
            // InternalFortXTrans.g:5937:2: rule__Binding__Group_1__1__Impl rule__Binding__Group_1__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalFortXTrans.g:5944:1: rule__Binding__Group_1__1__Impl : ( '<-' ) ;
    public final void rule__Binding__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5948:1: ( ( '<-' ) )
            // InternalFortXTrans.g:5949:1: ( '<-' )
            {
            // InternalFortXTrans.g:5949:1: ( '<-' )
            // InternalFortXTrans.g:5950:2: '<-'
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
    // InternalFortXTrans.g:5959:1: rule__Binding__Group_1__2 : rule__Binding__Group_1__2__Impl rule__Binding__Group_1__3 ;
    public final void rule__Binding__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5963:1: ( rule__Binding__Group_1__2__Impl rule__Binding__Group_1__3 )
            // InternalFortXTrans.g:5964:2: rule__Binding__Group_1__2__Impl rule__Binding__Group_1__3
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
    // InternalFortXTrans.g:5971:1: rule__Binding__Group_1__2__Impl : ( ( rule__Binding__SeqAssignment_1_2 ) ) ;
    public final void rule__Binding__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5975:1: ( ( ( rule__Binding__SeqAssignment_1_2 ) ) )
            // InternalFortXTrans.g:5976:1: ( ( rule__Binding__SeqAssignment_1_2 ) )
            {
            // InternalFortXTrans.g:5976:1: ( ( rule__Binding__SeqAssignment_1_2 ) )
            // InternalFortXTrans.g:5977:2: ( rule__Binding__SeqAssignment_1_2 )
            {
             before(grammarAccess.getBindingAccess().getSeqAssignment_1_2()); 
            // InternalFortXTrans.g:5978:2: ( rule__Binding__SeqAssignment_1_2 )
            // InternalFortXTrans.g:5978:3: rule__Binding__SeqAssignment_1_2
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
    // InternalFortXTrans.g:5986:1: rule__Binding__Group_1__3 : rule__Binding__Group_1__3__Impl rule__Binding__Group_1__4 ;
    public final void rule__Binding__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:5990:1: ( rule__Binding__Group_1__3__Impl rule__Binding__Group_1__4 )
            // InternalFortXTrans.g:5991:2: rule__Binding__Group_1__3__Impl rule__Binding__Group_1__4
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
    // InternalFortXTrans.g:5998:1: rule__Binding__Group_1__3__Impl : ( '(' ) ;
    public final void rule__Binding__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6002:1: ( ( '(' ) )
            // InternalFortXTrans.g:6003:1: ( '(' )
            {
            // InternalFortXTrans.g:6003:1: ( '(' )
            // InternalFortXTrans.g:6004:2: '('
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
    // InternalFortXTrans.g:6013:1: rule__Binding__Group_1__4 : rule__Binding__Group_1__4__Impl rule__Binding__Group_1__5 ;
    public final void rule__Binding__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6017:1: ( rule__Binding__Group_1__4__Impl rule__Binding__Group_1__5 )
            // InternalFortXTrans.g:6018:2: rule__Binding__Group_1__4__Impl rule__Binding__Group_1__5
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
    // InternalFortXTrans.g:6025:1: rule__Binding__Group_1__4__Impl : ( ( rule__Binding__ExprAssignment_1_4 ) ) ;
    public final void rule__Binding__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6029:1: ( ( ( rule__Binding__ExprAssignment_1_4 ) ) )
            // InternalFortXTrans.g:6030:1: ( ( rule__Binding__ExprAssignment_1_4 ) )
            {
            // InternalFortXTrans.g:6030:1: ( ( rule__Binding__ExprAssignment_1_4 ) )
            // InternalFortXTrans.g:6031:2: ( rule__Binding__ExprAssignment_1_4 )
            {
             before(grammarAccess.getBindingAccess().getExprAssignment_1_4()); 
            // InternalFortXTrans.g:6032:2: ( rule__Binding__ExprAssignment_1_4 )
            // InternalFortXTrans.g:6032:3: rule__Binding__ExprAssignment_1_4
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
    // InternalFortXTrans.g:6040:1: rule__Binding__Group_1__5 : rule__Binding__Group_1__5__Impl ;
    public final void rule__Binding__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6044:1: ( rule__Binding__Group_1__5__Impl )
            // InternalFortXTrans.g:6045:2: rule__Binding__Group_1__5__Impl
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
    // InternalFortXTrans.g:6051:1: rule__Binding__Group_1__5__Impl : ( ')' ) ;
    public final void rule__Binding__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6055:1: ( ( ')' ) )
            // InternalFortXTrans.g:6056:1: ( ')' )
            {
            // InternalFortXTrans.g:6056:1: ( ')' )
            // InternalFortXTrans.g:6057:2: ')'
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
    // InternalFortXTrans.g:6067:1: rule__BlockElems__Group__0 : rule__BlockElems__Group__0__Impl rule__BlockElems__Group__1 ;
    public final void rule__BlockElems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6071:1: ( rule__BlockElems__Group__0__Impl rule__BlockElems__Group__1 )
            // InternalFortXTrans.g:6072:2: rule__BlockElems__Group__0__Impl rule__BlockElems__Group__1
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
    // InternalFortXTrans.g:6079:1: rule__BlockElems__Group__0__Impl : ( ( rule__BlockElems__BlockAssignment_0 ) ) ;
    public final void rule__BlockElems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6083:1: ( ( ( rule__BlockElems__BlockAssignment_0 ) ) )
            // InternalFortXTrans.g:6084:1: ( ( rule__BlockElems__BlockAssignment_0 ) )
            {
            // InternalFortXTrans.g:6084:1: ( ( rule__BlockElems__BlockAssignment_0 ) )
            // InternalFortXTrans.g:6085:2: ( rule__BlockElems__BlockAssignment_0 )
            {
             before(grammarAccess.getBlockElemsAccess().getBlockAssignment_0()); 
            // InternalFortXTrans.g:6086:2: ( rule__BlockElems__BlockAssignment_0 )
            // InternalFortXTrans.g:6086:3: rule__BlockElems__BlockAssignment_0
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
    // InternalFortXTrans.g:6094:1: rule__BlockElems__Group__1 : rule__BlockElems__Group__1__Impl ;
    public final void rule__BlockElems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6098:1: ( rule__BlockElems__Group__1__Impl )
            // InternalFortXTrans.g:6099:2: rule__BlockElems__Group__1__Impl
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
    // InternalFortXTrans.g:6105:1: rule__BlockElems__Group__1__Impl : ( ( rule__BlockElems__BlockAssignment_1 )* ) ;
    public final void rule__BlockElems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6109:1: ( ( ( rule__BlockElems__BlockAssignment_1 )* ) )
            // InternalFortXTrans.g:6110:1: ( ( rule__BlockElems__BlockAssignment_1 )* )
            {
            // InternalFortXTrans.g:6110:1: ( ( rule__BlockElems__BlockAssignment_1 )* )
            // InternalFortXTrans.g:6111:2: ( rule__BlockElems__BlockAssignment_1 )*
            {
             before(grammarAccess.getBlockElemsAccess().getBlockAssignment_1()); 
            // InternalFortXTrans.g:6112:2: ( rule__BlockElems__BlockAssignment_1 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_ID||LA56_0==20||LA56_0==31||LA56_0==37||LA56_0==44||(LA56_0>=46 && LA56_0<=48)||(LA56_0>=50 && LA56_0<=51)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalFortXTrans.g:6112:3: rule__BlockElems__BlockAssignment_1
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__BlockElems__BlockAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // InternalFortXTrans.g:6121:1: rule__Paranthesized__Group__0 : rule__Paranthesized__Group__0__Impl rule__Paranthesized__Group__1 ;
    public final void rule__Paranthesized__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6125:1: ( rule__Paranthesized__Group__0__Impl rule__Paranthesized__Group__1 )
            // InternalFortXTrans.g:6126:2: rule__Paranthesized__Group__0__Impl rule__Paranthesized__Group__1
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
    // InternalFortXTrans.g:6133:1: rule__Paranthesized__Group__0__Impl : ( '(' ) ;
    public final void rule__Paranthesized__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6137:1: ( ( '(' ) )
            // InternalFortXTrans.g:6138:1: ( '(' )
            {
            // InternalFortXTrans.g:6138:1: ( '(' )
            // InternalFortXTrans.g:6139:2: '('
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
    // InternalFortXTrans.g:6148:1: rule__Paranthesized__Group__1 : rule__Paranthesized__Group__1__Impl rule__Paranthesized__Group__2 ;
    public final void rule__Paranthesized__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6152:1: ( rule__Paranthesized__Group__1__Impl rule__Paranthesized__Group__2 )
            // InternalFortXTrans.g:6153:2: rule__Paranthesized__Group__1__Impl rule__Paranthesized__Group__2
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
    // InternalFortXTrans.g:6160:1: rule__Paranthesized__Group__1__Impl : ( ( rule__Paranthesized__ExprAssignment_1 ) ) ;
    public final void rule__Paranthesized__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6164:1: ( ( ( rule__Paranthesized__ExprAssignment_1 ) ) )
            // InternalFortXTrans.g:6165:1: ( ( rule__Paranthesized__ExprAssignment_1 ) )
            {
            // InternalFortXTrans.g:6165:1: ( ( rule__Paranthesized__ExprAssignment_1 ) )
            // InternalFortXTrans.g:6166:2: ( rule__Paranthesized__ExprAssignment_1 )
            {
             before(grammarAccess.getParanthesizedAccess().getExprAssignment_1()); 
            // InternalFortXTrans.g:6167:2: ( rule__Paranthesized__ExprAssignment_1 )
            // InternalFortXTrans.g:6167:3: rule__Paranthesized__ExprAssignment_1
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
    // InternalFortXTrans.g:6175:1: rule__Paranthesized__Group__2 : rule__Paranthesized__Group__2__Impl ;
    public final void rule__Paranthesized__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6179:1: ( rule__Paranthesized__Group__2__Impl )
            // InternalFortXTrans.g:6180:2: rule__Paranthesized__Group__2__Impl
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
    // InternalFortXTrans.g:6186:1: rule__Paranthesized__Group__2__Impl : ( ')' ) ;
    public final void rule__Paranthesized__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6190:1: ( ( ')' ) )
            // InternalFortXTrans.g:6191:1: ( ')' )
            {
            // InternalFortXTrans.g:6191:1: ( ')' )
            // InternalFortXTrans.g:6192:2: ')'
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
    // InternalFortXTrans.g:6202:1: rule__Do__Group__0 : rule__Do__Group__0__Impl rule__Do__Group__1 ;
    public final void rule__Do__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6206:1: ( rule__Do__Group__0__Impl rule__Do__Group__1 )
            // InternalFortXTrans.g:6207:2: rule__Do__Group__0__Impl rule__Do__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalFortXTrans.g:6214:1: rule__Do__Group__0__Impl : ( ( rule__Do__DofsAssignment_0 ) ) ;
    public final void rule__Do__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6218:1: ( ( ( rule__Do__DofsAssignment_0 ) ) )
            // InternalFortXTrans.g:6219:1: ( ( rule__Do__DofsAssignment_0 ) )
            {
            // InternalFortXTrans.g:6219:1: ( ( rule__Do__DofsAssignment_0 ) )
            // InternalFortXTrans.g:6220:2: ( rule__Do__DofsAssignment_0 )
            {
             before(grammarAccess.getDoAccess().getDofsAssignment_0()); 
            // InternalFortXTrans.g:6221:2: ( rule__Do__DofsAssignment_0 )
            // InternalFortXTrans.g:6221:3: rule__Do__DofsAssignment_0
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
    // InternalFortXTrans.g:6229:1: rule__Do__Group__1 : rule__Do__Group__1__Impl rule__Do__Group__2 ;
    public final void rule__Do__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6233:1: ( rule__Do__Group__1__Impl rule__Do__Group__2 )
            // InternalFortXTrans.g:6234:2: rule__Do__Group__1__Impl rule__Do__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalFortXTrans.g:6241:1: rule__Do__Group__1__Impl : ( ( rule__Do__Group_1__0 )* ) ;
    public final void rule__Do__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6245:1: ( ( ( rule__Do__Group_1__0 )* ) )
            // InternalFortXTrans.g:6246:1: ( ( rule__Do__Group_1__0 )* )
            {
            // InternalFortXTrans.g:6246:1: ( ( rule__Do__Group_1__0 )* )
            // InternalFortXTrans.g:6247:2: ( rule__Do__Group_1__0 )*
            {
             before(grammarAccess.getDoAccess().getGroup_1()); 
            // InternalFortXTrans.g:6248:2: ( rule__Do__Group_1__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==36) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalFortXTrans.g:6248:3: rule__Do__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__Do__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalFortXTrans.g:6256:1: rule__Do__Group__2 : rule__Do__Group__2__Impl ;
    public final void rule__Do__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6260:1: ( rule__Do__Group__2__Impl )
            // InternalFortXTrans.g:6261:2: rule__Do__Group__2__Impl
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
    // InternalFortXTrans.g:6267:1: rule__Do__Group__2__Impl : ( 'end' ) ;
    public final void rule__Do__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6271:1: ( ( 'end' ) )
            // InternalFortXTrans.g:6272:1: ( 'end' )
            {
            // InternalFortXTrans.g:6272:1: ( 'end' )
            // InternalFortXTrans.g:6273:2: 'end'
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
    // InternalFortXTrans.g:6283:1: rule__Do__Group_1__0 : rule__Do__Group_1__0__Impl rule__Do__Group_1__1 ;
    public final void rule__Do__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6287:1: ( rule__Do__Group_1__0__Impl rule__Do__Group_1__1 )
            // InternalFortXTrans.g:6288:2: rule__Do__Group_1__0__Impl rule__Do__Group_1__1
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
    // InternalFortXTrans.g:6295:1: rule__Do__Group_1__0__Impl : ( 'also' ) ;
    public final void rule__Do__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6299:1: ( ( 'also' ) )
            // InternalFortXTrans.g:6300:1: ( 'also' )
            {
            // InternalFortXTrans.g:6300:1: ( 'also' )
            // InternalFortXTrans.g:6301:2: 'also'
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
    // InternalFortXTrans.g:6310:1: rule__Do__Group_1__1 : rule__Do__Group_1__1__Impl ;
    public final void rule__Do__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6314:1: ( rule__Do__Group_1__1__Impl )
            // InternalFortXTrans.g:6315:2: rule__Do__Group_1__1__Impl
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
    // InternalFortXTrans.g:6321:1: rule__Do__Group_1__1__Impl : ( ( rule__Do__DofsAssignment_1_1 ) ) ;
    public final void rule__Do__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6325:1: ( ( ( rule__Do__DofsAssignment_1_1 ) ) )
            // InternalFortXTrans.g:6326:1: ( ( rule__Do__DofsAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:6326:1: ( ( rule__Do__DofsAssignment_1_1 ) )
            // InternalFortXTrans.g:6327:2: ( rule__Do__DofsAssignment_1_1 )
            {
             before(grammarAccess.getDoAccess().getDofsAssignment_1_1()); 
            // InternalFortXTrans.g:6328:2: ( rule__Do__DofsAssignment_1_1 )
            // InternalFortXTrans.g:6328:3: rule__Do__DofsAssignment_1_1
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
    // InternalFortXTrans.g:6337:1: rule__DoFront__Group__0 : rule__DoFront__Group__0__Impl rule__DoFront__Group__1 ;
    public final void rule__DoFront__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6341:1: ( rule__DoFront__Group__0__Impl rule__DoFront__Group__1 )
            // InternalFortXTrans.g:6342:2: rule__DoFront__Group__0__Impl rule__DoFront__Group__1
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
    // InternalFortXTrans.g:6349:1: rule__DoFront__Group__0__Impl : ( ( rule__DoFront__Group_0__0 )? ) ;
    public final void rule__DoFront__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6353:1: ( ( ( rule__DoFront__Group_0__0 )? ) )
            // InternalFortXTrans.g:6354:1: ( ( rule__DoFront__Group_0__0 )? )
            {
            // InternalFortXTrans.g:6354:1: ( ( rule__DoFront__Group_0__0 )? )
            // InternalFortXTrans.g:6355:2: ( rule__DoFront__Group_0__0 )?
            {
             before(grammarAccess.getDoFrontAccess().getGroup_0()); 
            // InternalFortXTrans.g:6356:2: ( rule__DoFront__Group_0__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==50) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalFortXTrans.g:6356:3: rule__DoFront__Group_0__0
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
    // InternalFortXTrans.g:6364:1: rule__DoFront__Group__1 : rule__DoFront__Group__1__Impl rule__DoFront__Group__2 ;
    public final void rule__DoFront__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6368:1: ( rule__DoFront__Group__1__Impl rule__DoFront__Group__2 )
            // InternalFortXTrans.g:6369:2: rule__DoFront__Group__1__Impl rule__DoFront__Group__2
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
    // InternalFortXTrans.g:6376:1: rule__DoFront__Group__1__Impl : ( ( rule__DoFront__AtomAssignment_1 )? ) ;
    public final void rule__DoFront__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6380:1: ( ( ( rule__DoFront__AtomAssignment_1 )? ) )
            // InternalFortXTrans.g:6381:1: ( ( rule__DoFront__AtomAssignment_1 )? )
            {
            // InternalFortXTrans.g:6381:1: ( ( rule__DoFront__AtomAssignment_1 )? )
            // InternalFortXTrans.g:6382:2: ( rule__DoFront__AtomAssignment_1 )?
            {
             before(grammarAccess.getDoFrontAccess().getAtomAssignment_1()); 
            // InternalFortXTrans.g:6383:2: ( rule__DoFront__AtomAssignment_1 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==44) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalFortXTrans.g:6383:3: rule__DoFront__AtomAssignment_1
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
    // InternalFortXTrans.g:6391:1: rule__DoFront__Group__2 : rule__DoFront__Group__2__Impl rule__DoFront__Group__3 ;
    public final void rule__DoFront__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6395:1: ( rule__DoFront__Group__2__Impl rule__DoFront__Group__3 )
            // InternalFortXTrans.g:6396:2: rule__DoFront__Group__2__Impl rule__DoFront__Group__3
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
    // InternalFortXTrans.g:6403:1: rule__DoFront__Group__2__Impl : ( 'do' ) ;
    public final void rule__DoFront__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6407:1: ( ( 'do' ) )
            // InternalFortXTrans.g:6408:1: ( 'do' )
            {
            // InternalFortXTrans.g:6408:1: ( 'do' )
            // InternalFortXTrans.g:6409:2: 'do'
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
    // InternalFortXTrans.g:6418:1: rule__DoFront__Group__3 : rule__DoFront__Group__3__Impl ;
    public final void rule__DoFront__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6422:1: ( rule__DoFront__Group__3__Impl )
            // InternalFortXTrans.g:6423:2: rule__DoFront__Group__3__Impl
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
    // InternalFortXTrans.g:6429:1: rule__DoFront__Group__3__Impl : ( ( rule__DoFront__BlockAssignment_3 ) ) ;
    public final void rule__DoFront__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6433:1: ( ( ( rule__DoFront__BlockAssignment_3 ) ) )
            // InternalFortXTrans.g:6434:1: ( ( rule__DoFront__BlockAssignment_3 ) )
            {
            // InternalFortXTrans.g:6434:1: ( ( rule__DoFront__BlockAssignment_3 ) )
            // InternalFortXTrans.g:6435:2: ( rule__DoFront__BlockAssignment_3 )
            {
             before(grammarAccess.getDoFrontAccess().getBlockAssignment_3()); 
            // InternalFortXTrans.g:6436:2: ( rule__DoFront__BlockAssignment_3 )
            // InternalFortXTrans.g:6436:3: rule__DoFront__BlockAssignment_3
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
    // InternalFortXTrans.g:6445:1: rule__DoFront__Group_0__0 : rule__DoFront__Group_0__0__Impl rule__DoFront__Group_0__1 ;
    public final void rule__DoFront__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6449:1: ( rule__DoFront__Group_0__0__Impl rule__DoFront__Group_0__1 )
            // InternalFortXTrans.g:6450:2: rule__DoFront__Group_0__0__Impl rule__DoFront__Group_0__1
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
    // InternalFortXTrans.g:6457:1: rule__DoFront__Group_0__0__Impl : ( ( rule__DoFront__AtAssignment_0_0 ) ) ;
    public final void rule__DoFront__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6461:1: ( ( ( rule__DoFront__AtAssignment_0_0 ) ) )
            // InternalFortXTrans.g:6462:1: ( ( rule__DoFront__AtAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:6462:1: ( ( rule__DoFront__AtAssignment_0_0 ) )
            // InternalFortXTrans.g:6463:2: ( rule__DoFront__AtAssignment_0_0 )
            {
             before(grammarAccess.getDoFrontAccess().getAtAssignment_0_0()); 
            // InternalFortXTrans.g:6464:2: ( rule__DoFront__AtAssignment_0_0 )
            // InternalFortXTrans.g:6464:3: rule__DoFront__AtAssignment_0_0
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
    // InternalFortXTrans.g:6472:1: rule__DoFront__Group_0__1 : rule__DoFront__Group_0__1__Impl ;
    public final void rule__DoFront__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6476:1: ( rule__DoFront__Group_0__1__Impl )
            // InternalFortXTrans.g:6477:2: rule__DoFront__Group_0__1__Impl
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
    // InternalFortXTrans.g:6483:1: rule__DoFront__Group_0__1__Impl : ( ( rule__DoFront__ExpAssignment_0_1 ) ) ;
    public final void rule__DoFront__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6487:1: ( ( ( rule__DoFront__ExpAssignment_0_1 ) ) )
            // InternalFortXTrans.g:6488:1: ( ( rule__DoFront__ExpAssignment_0_1 ) )
            {
            // InternalFortXTrans.g:6488:1: ( ( rule__DoFront__ExpAssignment_0_1 ) )
            // InternalFortXTrans.g:6489:2: ( rule__DoFront__ExpAssignment_0_1 )
            {
             before(grammarAccess.getDoFrontAccess().getExpAssignment_0_1()); 
            // InternalFortXTrans.g:6490:2: ( rule__DoFront__ExpAssignment_0_1 )
            // InternalFortXTrans.g:6490:3: rule__DoFront__ExpAssignment_0_1
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
    // InternalFortXTrans.g:6499:1: rule__IdOrTuple__Group_1__0 : rule__IdOrTuple__Group_1__0__Impl rule__IdOrTuple__Group_1__1 ;
    public final void rule__IdOrTuple__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6503:1: ( rule__IdOrTuple__Group_1__0__Impl rule__IdOrTuple__Group_1__1 )
            // InternalFortXTrans.g:6504:2: rule__IdOrTuple__Group_1__0__Impl rule__IdOrTuple__Group_1__1
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
    // InternalFortXTrans.g:6511:1: rule__IdOrTuple__Group_1__0__Impl : ( '(' ) ;
    public final void rule__IdOrTuple__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6515:1: ( ( '(' ) )
            // InternalFortXTrans.g:6516:1: ( '(' )
            {
            // InternalFortXTrans.g:6516:1: ( '(' )
            // InternalFortXTrans.g:6517:2: '('
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
    // InternalFortXTrans.g:6526:1: rule__IdOrTuple__Group_1__1 : rule__IdOrTuple__Group_1__1__Impl rule__IdOrTuple__Group_1__2 ;
    public final void rule__IdOrTuple__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6530:1: ( rule__IdOrTuple__Group_1__1__Impl rule__IdOrTuple__Group_1__2 )
            // InternalFortXTrans.g:6531:2: rule__IdOrTuple__Group_1__1__Impl rule__IdOrTuple__Group_1__2
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
    // InternalFortXTrans.g:6538:1: rule__IdOrTuple__Group_1__1__Impl : ( ( rule__IdOrTuple__BidAssignment_1_1 ) ) ;
    public final void rule__IdOrTuple__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6542:1: ( ( ( rule__IdOrTuple__BidAssignment_1_1 ) ) )
            // InternalFortXTrans.g:6543:1: ( ( rule__IdOrTuple__BidAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:6543:1: ( ( rule__IdOrTuple__BidAssignment_1_1 ) )
            // InternalFortXTrans.g:6544:2: ( rule__IdOrTuple__BidAssignment_1_1 )
            {
             before(grammarAccess.getIdOrTupleAccess().getBidAssignment_1_1()); 
            // InternalFortXTrans.g:6545:2: ( rule__IdOrTuple__BidAssignment_1_1 )
            // InternalFortXTrans.g:6545:3: rule__IdOrTuple__BidAssignment_1_1
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
    // InternalFortXTrans.g:6553:1: rule__IdOrTuple__Group_1__2 : rule__IdOrTuple__Group_1__2__Impl rule__IdOrTuple__Group_1__3 ;
    public final void rule__IdOrTuple__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6557:1: ( rule__IdOrTuple__Group_1__2__Impl rule__IdOrTuple__Group_1__3 )
            // InternalFortXTrans.g:6558:2: rule__IdOrTuple__Group_1__2__Impl rule__IdOrTuple__Group_1__3
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
    // InternalFortXTrans.g:6565:1: rule__IdOrTuple__Group_1__2__Impl : ( ( rule__IdOrTuple__Group_1_2__0 )* ) ;
    public final void rule__IdOrTuple__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6569:1: ( ( ( rule__IdOrTuple__Group_1_2__0 )* ) )
            // InternalFortXTrans.g:6570:1: ( ( rule__IdOrTuple__Group_1_2__0 )* )
            {
            // InternalFortXTrans.g:6570:1: ( ( rule__IdOrTuple__Group_1_2__0 )* )
            // InternalFortXTrans.g:6571:2: ( rule__IdOrTuple__Group_1_2__0 )*
            {
             before(grammarAccess.getIdOrTupleAccess().getGroup_1_2()); 
            // InternalFortXTrans.g:6572:2: ( rule__IdOrTuple__Group_1_2__0 )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==25) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalFortXTrans.g:6572:3: rule__IdOrTuple__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__IdOrTuple__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop60;
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
    // InternalFortXTrans.g:6580:1: rule__IdOrTuple__Group_1__3 : rule__IdOrTuple__Group_1__3__Impl ;
    public final void rule__IdOrTuple__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6584:1: ( rule__IdOrTuple__Group_1__3__Impl )
            // InternalFortXTrans.g:6585:2: rule__IdOrTuple__Group_1__3__Impl
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
    // InternalFortXTrans.g:6591:1: rule__IdOrTuple__Group_1__3__Impl : ( ')' ) ;
    public final void rule__IdOrTuple__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6595:1: ( ( ')' ) )
            // InternalFortXTrans.g:6596:1: ( ')' )
            {
            // InternalFortXTrans.g:6596:1: ( ')' )
            // InternalFortXTrans.g:6597:2: ')'
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
    // InternalFortXTrans.g:6607:1: rule__IdOrTuple__Group_1_2__0 : rule__IdOrTuple__Group_1_2__0__Impl rule__IdOrTuple__Group_1_2__1 ;
    public final void rule__IdOrTuple__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6611:1: ( rule__IdOrTuple__Group_1_2__0__Impl rule__IdOrTuple__Group_1_2__1 )
            // InternalFortXTrans.g:6612:2: rule__IdOrTuple__Group_1_2__0__Impl rule__IdOrTuple__Group_1_2__1
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
    // InternalFortXTrans.g:6619:1: rule__IdOrTuple__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__IdOrTuple__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6623:1: ( ( ',' ) )
            // InternalFortXTrans.g:6624:1: ( ',' )
            {
            // InternalFortXTrans.g:6624:1: ( ',' )
            // InternalFortXTrans.g:6625:2: ','
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
    // InternalFortXTrans.g:6634:1: rule__IdOrTuple__Group_1_2__1 : rule__IdOrTuple__Group_1_2__1__Impl ;
    public final void rule__IdOrTuple__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6638:1: ( rule__IdOrTuple__Group_1_2__1__Impl )
            // InternalFortXTrans.g:6639:2: rule__IdOrTuple__Group_1_2__1__Impl
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
    // InternalFortXTrans.g:6645:1: rule__IdOrTuple__Group_1_2__1__Impl : ( ( rule__IdOrTuple__BidAssignment_1_2_1 ) ) ;
    public final void rule__IdOrTuple__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6649:1: ( ( ( rule__IdOrTuple__BidAssignment_1_2_1 ) ) )
            // InternalFortXTrans.g:6650:1: ( ( rule__IdOrTuple__BidAssignment_1_2_1 ) )
            {
            // InternalFortXTrans.g:6650:1: ( ( rule__IdOrTuple__BidAssignment_1_2_1 ) )
            // InternalFortXTrans.g:6651:2: ( rule__IdOrTuple__BidAssignment_1_2_1 )
            {
             before(grammarAccess.getIdOrTupleAccess().getBidAssignment_1_2_1()); 
            // InternalFortXTrans.g:6652:2: ( rule__IdOrTuple__BidAssignment_1_2_1 )
            // InternalFortXTrans.g:6652:3: rule__IdOrTuple__BidAssignment_1_2_1
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
    // InternalFortXTrans.g:6661:1: rule__IsType__Group__0 : rule__IsType__Group__0__Impl rule__IsType__Group__1 ;
    public final void rule__IsType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6665:1: ( rule__IsType__Group__0__Impl rule__IsType__Group__1 )
            // InternalFortXTrans.g:6666:2: rule__IsType__Group__0__Impl rule__IsType__Group__1
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
    // InternalFortXTrans.g:6673:1: rule__IsType__Group__0__Impl : ( ':' ) ;
    public final void rule__IsType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6677:1: ( ( ':' ) )
            // InternalFortXTrans.g:6678:1: ( ':' )
            {
            // InternalFortXTrans.g:6678:1: ( ':' )
            // InternalFortXTrans.g:6679:2: ':'
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
    // InternalFortXTrans.g:6688:1: rule__IsType__Group__1 : rule__IsType__Group__1__Impl ;
    public final void rule__IsType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6692:1: ( rule__IsType__Group__1__Impl )
            // InternalFortXTrans.g:6693:2: rule__IsType__Group__1__Impl
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
    // InternalFortXTrans.g:6699:1: rule__IsType__Group__1__Impl : ( ( rule__IsType__TypeAssignment_1 ) ) ;
    public final void rule__IsType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6703:1: ( ( ( rule__IsType__TypeAssignment_1 ) ) )
            // InternalFortXTrans.g:6704:1: ( ( rule__IsType__TypeAssignment_1 ) )
            {
            // InternalFortXTrans.g:6704:1: ( ( rule__IsType__TypeAssignment_1 ) )
            // InternalFortXTrans.g:6705:2: ( rule__IsType__TypeAssignment_1 )
            {
             before(grammarAccess.getIsTypeAccess().getTypeAssignment_1()); 
            // InternalFortXTrans.g:6706:2: ( rule__IsType__TypeAssignment_1 )
            // InternalFortXTrans.g:6706:3: rule__IsType__TypeAssignment_1
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
    // InternalFortXTrans.g:6715:1: rule__FieldDecl__Group_0__0 : rule__FieldDecl__Group_0__0__Impl rule__FieldDecl__Group_0__1 ;
    public final void rule__FieldDecl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6719:1: ( rule__FieldDecl__Group_0__0__Impl rule__FieldDecl__Group_0__1 )
            // InternalFortXTrans.g:6720:2: rule__FieldDecl__Group_0__0__Impl rule__FieldDecl__Group_0__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalFortXTrans.g:6727:1: rule__FieldDecl__Group_0__0__Impl : ( ( rule__FieldDecl__PriAssignment_0_0 )? ) ;
    public final void rule__FieldDecl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6731:1: ( ( ( rule__FieldDecl__PriAssignment_0_0 )? ) )
            // InternalFortXTrans.g:6732:1: ( ( rule__FieldDecl__PriAssignment_0_0 )? )
            {
            // InternalFortXTrans.g:6732:1: ( ( rule__FieldDecl__PriAssignment_0_0 )? )
            // InternalFortXTrans.g:6733:2: ( rule__FieldDecl__PriAssignment_0_0 )?
            {
             before(grammarAccess.getFieldDeclAccess().getPriAssignment_0_0()); 
            // InternalFortXTrans.g:6734:2: ( rule__FieldDecl__PriAssignment_0_0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==42) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalFortXTrans.g:6734:3: rule__FieldDecl__PriAssignment_0_0
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
    // InternalFortXTrans.g:6742:1: rule__FieldDecl__Group_0__1 : rule__FieldDecl__Group_0__1__Impl rule__FieldDecl__Group_0__2 ;
    public final void rule__FieldDecl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6746:1: ( rule__FieldDecl__Group_0__1__Impl rule__FieldDecl__Group_0__2 )
            // InternalFortXTrans.g:6747:2: rule__FieldDecl__Group_0__1__Impl rule__FieldDecl__Group_0__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalFortXTrans.g:6754:1: rule__FieldDecl__Group_0__1__Impl : ( ( rule__FieldDecl__MutAssignment_0_1 )? ) ;
    public final void rule__FieldDecl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6758:1: ( ( ( rule__FieldDecl__MutAssignment_0_1 )? ) )
            // InternalFortXTrans.g:6759:1: ( ( rule__FieldDecl__MutAssignment_0_1 )? )
            {
            // InternalFortXTrans.g:6759:1: ( ( rule__FieldDecl__MutAssignment_0_1 )? )
            // InternalFortXTrans.g:6760:2: ( rule__FieldDecl__MutAssignment_0_1 )?
            {
             before(grammarAccess.getFieldDeclAccess().getMutAssignment_0_1()); 
            // InternalFortXTrans.g:6761:2: ( rule__FieldDecl__MutAssignment_0_1 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==51) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalFortXTrans.g:6761:3: rule__FieldDecl__MutAssignment_0_1
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
    // InternalFortXTrans.g:6769:1: rule__FieldDecl__Group_0__2 : rule__FieldDecl__Group_0__2__Impl rule__FieldDecl__Group_0__3 ;
    public final void rule__FieldDecl__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6773:1: ( rule__FieldDecl__Group_0__2__Impl rule__FieldDecl__Group_0__3 )
            // InternalFortXTrans.g:6774:2: rule__FieldDecl__Group_0__2__Impl rule__FieldDecl__Group_0__3
            {
            pushFollow(FOLLOW_48);
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
    // InternalFortXTrans.g:6781:1: rule__FieldDecl__Group_0__2__Impl : ( ( rule__FieldDecl__VarsAssignment_0_2 ) ) ;
    public final void rule__FieldDecl__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6785:1: ( ( ( rule__FieldDecl__VarsAssignment_0_2 ) ) )
            // InternalFortXTrans.g:6786:1: ( ( rule__FieldDecl__VarsAssignment_0_2 ) )
            {
            // InternalFortXTrans.g:6786:1: ( ( rule__FieldDecl__VarsAssignment_0_2 ) )
            // InternalFortXTrans.g:6787:2: ( rule__FieldDecl__VarsAssignment_0_2 )
            {
             before(grammarAccess.getFieldDeclAccess().getVarsAssignment_0_2()); 
            // InternalFortXTrans.g:6788:2: ( rule__FieldDecl__VarsAssignment_0_2 )
            // InternalFortXTrans.g:6788:3: rule__FieldDecl__VarsAssignment_0_2
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
    // InternalFortXTrans.g:6796:1: rule__FieldDecl__Group_0__3 : rule__FieldDecl__Group_0__3__Impl ;
    public final void rule__FieldDecl__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6800:1: ( rule__FieldDecl__Group_0__3__Impl )
            // InternalFortXTrans.g:6801:2: rule__FieldDecl__Group_0__3__Impl
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
    // InternalFortXTrans.g:6807:1: rule__FieldDecl__Group_0__3__Impl : ( ( rule__FieldDecl__InitAssignment_0_3 ) ) ;
    public final void rule__FieldDecl__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6811:1: ( ( ( rule__FieldDecl__InitAssignment_0_3 ) ) )
            // InternalFortXTrans.g:6812:1: ( ( rule__FieldDecl__InitAssignment_0_3 ) )
            {
            // InternalFortXTrans.g:6812:1: ( ( rule__FieldDecl__InitAssignment_0_3 ) )
            // InternalFortXTrans.g:6813:2: ( rule__FieldDecl__InitAssignment_0_3 )
            {
             before(grammarAccess.getFieldDeclAccess().getInitAssignment_0_3()); 
            // InternalFortXTrans.g:6814:2: ( rule__FieldDecl__InitAssignment_0_3 )
            // InternalFortXTrans.g:6814:3: rule__FieldDecl__InitAssignment_0_3
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
    // InternalFortXTrans.g:6823:1: rule__FieldDecl__Group_1__0 : rule__FieldDecl__Group_1__0__Impl rule__FieldDecl__Group_1__1 ;
    public final void rule__FieldDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6827:1: ( rule__FieldDecl__Group_1__0__Impl rule__FieldDecl__Group_1__1 )
            // InternalFortXTrans.g:6828:2: rule__FieldDecl__Group_1__0__Impl rule__FieldDecl__Group_1__1
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
    // InternalFortXTrans.g:6835:1: rule__FieldDecl__Group_1__0__Impl : ( ( rule__FieldDecl__PriAssignment_1_0 )? ) ;
    public final void rule__FieldDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6839:1: ( ( ( rule__FieldDecl__PriAssignment_1_0 )? ) )
            // InternalFortXTrans.g:6840:1: ( ( rule__FieldDecl__PriAssignment_1_0 )? )
            {
            // InternalFortXTrans.g:6840:1: ( ( rule__FieldDecl__PriAssignment_1_0 )? )
            // InternalFortXTrans.g:6841:2: ( rule__FieldDecl__PriAssignment_1_0 )?
            {
             before(grammarAccess.getFieldDeclAccess().getPriAssignment_1_0()); 
            // InternalFortXTrans.g:6842:2: ( rule__FieldDecl__PriAssignment_1_0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==42) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalFortXTrans.g:6842:3: rule__FieldDecl__PriAssignment_1_0
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
    // InternalFortXTrans.g:6850:1: rule__FieldDecl__Group_1__1 : rule__FieldDecl__Group_1__1__Impl rule__FieldDecl__Group_1__2 ;
    public final void rule__FieldDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6854:1: ( rule__FieldDecl__Group_1__1__Impl rule__FieldDecl__Group_1__2 )
            // InternalFortXTrans.g:6855:2: rule__FieldDecl__Group_1__1__Impl rule__FieldDecl__Group_1__2
            {
            pushFollow(FOLLOW_49);
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
    // InternalFortXTrans.g:6862:1: rule__FieldDecl__Group_1__1__Impl : ( ( rule__FieldDecl__IdtupAssignment_1_1 ) ) ;
    public final void rule__FieldDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6866:1: ( ( ( rule__FieldDecl__IdtupAssignment_1_1 ) ) )
            // InternalFortXTrans.g:6867:1: ( ( rule__FieldDecl__IdtupAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:6867:1: ( ( rule__FieldDecl__IdtupAssignment_1_1 ) )
            // InternalFortXTrans.g:6868:2: ( rule__FieldDecl__IdtupAssignment_1_1 )
            {
             before(grammarAccess.getFieldDeclAccess().getIdtupAssignment_1_1()); 
            // InternalFortXTrans.g:6869:2: ( rule__FieldDecl__IdtupAssignment_1_1 )
            // InternalFortXTrans.g:6869:3: rule__FieldDecl__IdtupAssignment_1_1
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
    // InternalFortXTrans.g:6877:1: rule__FieldDecl__Group_1__2 : rule__FieldDecl__Group_1__2__Impl rule__FieldDecl__Group_1__3 ;
    public final void rule__FieldDecl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6881:1: ( rule__FieldDecl__Group_1__2__Impl rule__FieldDecl__Group_1__3 )
            // InternalFortXTrans.g:6882:2: rule__FieldDecl__Group_1__2__Impl rule__FieldDecl__Group_1__3
            {
            pushFollow(FOLLOW_50);
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
    // InternalFortXTrans.g:6889:1: rule__FieldDecl__Group_1__2__Impl : ( '=' ) ;
    public final void rule__FieldDecl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6893:1: ( ( '=' ) )
            // InternalFortXTrans.g:6894:1: ( '=' )
            {
            // InternalFortXTrans.g:6894:1: ( '=' )
            // InternalFortXTrans.g:6895:2: '='
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
    // InternalFortXTrans.g:6904:1: rule__FieldDecl__Group_1__3 : rule__FieldDecl__Group_1__3__Impl ;
    public final void rule__FieldDecl__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6908:1: ( rule__FieldDecl__Group_1__3__Impl )
            // InternalFortXTrans.g:6909:2: rule__FieldDecl__Group_1__3__Impl
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
    // InternalFortXTrans.g:6915:1: rule__FieldDecl__Group_1__3__Impl : ( ( rule__FieldDecl__LitTupAssignment_1_3 ) ) ;
    public final void rule__FieldDecl__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6919:1: ( ( ( rule__FieldDecl__LitTupAssignment_1_3 ) ) )
            // InternalFortXTrans.g:6920:1: ( ( rule__FieldDecl__LitTupAssignment_1_3 ) )
            {
            // InternalFortXTrans.g:6920:1: ( ( rule__FieldDecl__LitTupAssignment_1_3 ) )
            // InternalFortXTrans.g:6921:2: ( rule__FieldDecl__LitTupAssignment_1_3 )
            {
             before(grammarAccess.getFieldDeclAccess().getLitTupAssignment_1_3()); 
            // InternalFortXTrans.g:6922:2: ( rule__FieldDecl__LitTupAssignment_1_3 )
            // InternalFortXTrans.g:6922:3: rule__FieldDecl__LitTupAssignment_1_3
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
    // InternalFortXTrans.g:6931:1: rule__FieldDecl__Group_2__0 : rule__FieldDecl__Group_2__0__Impl rule__FieldDecl__Group_2__1 ;
    public final void rule__FieldDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6935:1: ( rule__FieldDecl__Group_2__0__Impl rule__FieldDecl__Group_2__1 )
            // InternalFortXTrans.g:6936:2: rule__FieldDecl__Group_2__0__Impl rule__FieldDecl__Group_2__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalFortXTrans.g:6943:1: rule__FieldDecl__Group_2__0__Impl : ( ( rule__FieldDecl__PriAssignment_2_0 )? ) ;
    public final void rule__FieldDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6947:1: ( ( ( rule__FieldDecl__PriAssignment_2_0 )? ) )
            // InternalFortXTrans.g:6948:1: ( ( rule__FieldDecl__PriAssignment_2_0 )? )
            {
            // InternalFortXTrans.g:6948:1: ( ( rule__FieldDecl__PriAssignment_2_0 )? )
            // InternalFortXTrans.g:6949:2: ( rule__FieldDecl__PriAssignment_2_0 )?
            {
             before(grammarAccess.getFieldDeclAccess().getPriAssignment_2_0()); 
            // InternalFortXTrans.g:6950:2: ( rule__FieldDecl__PriAssignment_2_0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==42) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalFortXTrans.g:6950:3: rule__FieldDecl__PriAssignment_2_0
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
    // InternalFortXTrans.g:6958:1: rule__FieldDecl__Group_2__1 : rule__FieldDecl__Group_2__1__Impl rule__FieldDecl__Group_2__2 ;
    public final void rule__FieldDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6962:1: ( rule__FieldDecl__Group_2__1__Impl rule__FieldDecl__Group_2__2 )
            // InternalFortXTrans.g:6963:2: rule__FieldDecl__Group_2__1__Impl rule__FieldDecl__Group_2__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalFortXTrans.g:6970:1: rule__FieldDecl__Group_2__1__Impl : ( ( rule__FieldDecl__MutAssignment_2_1 )? ) ;
    public final void rule__FieldDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6974:1: ( ( ( rule__FieldDecl__MutAssignment_2_1 )? ) )
            // InternalFortXTrans.g:6975:1: ( ( rule__FieldDecl__MutAssignment_2_1 )? )
            {
            // InternalFortXTrans.g:6975:1: ( ( rule__FieldDecl__MutAssignment_2_1 )? )
            // InternalFortXTrans.g:6976:2: ( rule__FieldDecl__MutAssignment_2_1 )?
            {
             before(grammarAccess.getFieldDeclAccess().getMutAssignment_2_1()); 
            // InternalFortXTrans.g:6977:2: ( rule__FieldDecl__MutAssignment_2_1 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==51) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalFortXTrans.g:6977:3: rule__FieldDecl__MutAssignment_2_1
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
    // InternalFortXTrans.g:6985:1: rule__FieldDecl__Group_2__2 : rule__FieldDecl__Group_2__2__Impl rule__FieldDecl__Group_2__3 ;
    public final void rule__FieldDecl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:6989:1: ( rule__FieldDecl__Group_2__2__Impl rule__FieldDecl__Group_2__3 )
            // InternalFortXTrans.g:6990:2: rule__FieldDecl__Group_2__2__Impl rule__FieldDecl__Group_2__3
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
    // InternalFortXTrans.g:6997:1: rule__FieldDecl__Group_2__2__Impl : ( ( rule__FieldDecl__IdtupAssignment_2_2 ) ) ;
    public final void rule__FieldDecl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7001:1: ( ( ( rule__FieldDecl__IdtupAssignment_2_2 ) ) )
            // InternalFortXTrans.g:7002:1: ( ( rule__FieldDecl__IdtupAssignment_2_2 ) )
            {
            // InternalFortXTrans.g:7002:1: ( ( rule__FieldDecl__IdtupAssignment_2_2 ) )
            // InternalFortXTrans.g:7003:2: ( rule__FieldDecl__IdtupAssignment_2_2 )
            {
             before(grammarAccess.getFieldDeclAccess().getIdtupAssignment_2_2()); 
            // InternalFortXTrans.g:7004:2: ( rule__FieldDecl__IdtupAssignment_2_2 )
            // InternalFortXTrans.g:7004:3: rule__FieldDecl__IdtupAssignment_2_2
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
    // InternalFortXTrans.g:7012:1: rule__FieldDecl__Group_2__3 : rule__FieldDecl__Group_2__3__Impl rule__FieldDecl__Group_2__4 ;
    public final void rule__FieldDecl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7016:1: ( rule__FieldDecl__Group_2__3__Impl rule__FieldDecl__Group_2__4 )
            // InternalFortXTrans.g:7017:2: rule__FieldDecl__Group_2__3__Impl rule__FieldDecl__Group_2__4
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
    // InternalFortXTrans.g:7024:1: rule__FieldDecl__Group_2__3__Impl : ( ':' ) ;
    public final void rule__FieldDecl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7028:1: ( ( ':' ) )
            // InternalFortXTrans.g:7029:1: ( ':' )
            {
            // InternalFortXTrans.g:7029:1: ( ':' )
            // InternalFortXTrans.g:7030:2: ':'
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
    // InternalFortXTrans.g:7039:1: rule__FieldDecl__Group_2__4 : rule__FieldDecl__Group_2__4__Impl rule__FieldDecl__Group_2__5 ;
    public final void rule__FieldDecl__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7043:1: ( rule__FieldDecl__Group_2__4__Impl rule__FieldDecl__Group_2__5 )
            // InternalFortXTrans.g:7044:2: rule__FieldDecl__Group_2__4__Impl rule__FieldDecl__Group_2__5
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
    // InternalFortXTrans.g:7051:1: rule__FieldDecl__Group_2__4__Impl : ( ( rule__FieldDecl__TypeAssignment_2_4 ) ) ;
    public final void rule__FieldDecl__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7055:1: ( ( ( rule__FieldDecl__TypeAssignment_2_4 ) ) )
            // InternalFortXTrans.g:7056:1: ( ( rule__FieldDecl__TypeAssignment_2_4 ) )
            {
            // InternalFortXTrans.g:7056:1: ( ( rule__FieldDecl__TypeAssignment_2_4 ) )
            // InternalFortXTrans.g:7057:2: ( rule__FieldDecl__TypeAssignment_2_4 )
            {
             before(grammarAccess.getFieldDeclAccess().getTypeAssignment_2_4()); 
            // InternalFortXTrans.g:7058:2: ( rule__FieldDecl__TypeAssignment_2_4 )
            // InternalFortXTrans.g:7058:3: rule__FieldDecl__TypeAssignment_2_4
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
    // InternalFortXTrans.g:7066:1: rule__FieldDecl__Group_2__5 : rule__FieldDecl__Group_2__5__Impl rule__FieldDecl__Group_2__6 ;
    public final void rule__FieldDecl__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7070:1: ( rule__FieldDecl__Group_2__5__Impl rule__FieldDecl__Group_2__6 )
            // InternalFortXTrans.g:7071:2: rule__FieldDecl__Group_2__5__Impl rule__FieldDecl__Group_2__6
            {
            pushFollow(FOLLOW_48);
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
    // InternalFortXTrans.g:7078:1: rule__FieldDecl__Group_2__5__Impl : ( RULE_DOTS ) ;
    public final void rule__FieldDecl__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7082:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:7083:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:7083:1: ( RULE_DOTS )
            // InternalFortXTrans.g:7084:2: RULE_DOTS
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
    // InternalFortXTrans.g:7093:1: rule__FieldDecl__Group_2__6 : rule__FieldDecl__Group_2__6__Impl ;
    public final void rule__FieldDecl__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7097:1: ( rule__FieldDecl__Group_2__6__Impl )
            // InternalFortXTrans.g:7098:2: rule__FieldDecl__Group_2__6__Impl
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
    // InternalFortXTrans.g:7104:1: rule__FieldDecl__Group_2__6__Impl : ( ( rule__FieldDecl__InitAssignment_2_6 ) ) ;
    public final void rule__FieldDecl__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7108:1: ( ( ( rule__FieldDecl__InitAssignment_2_6 ) ) )
            // InternalFortXTrans.g:7109:1: ( ( rule__FieldDecl__InitAssignment_2_6 ) )
            {
            // InternalFortXTrans.g:7109:1: ( ( rule__FieldDecl__InitAssignment_2_6 ) )
            // InternalFortXTrans.g:7110:2: ( rule__FieldDecl__InitAssignment_2_6 )
            {
             before(grammarAccess.getFieldDeclAccess().getInitAssignment_2_6()); 
            // InternalFortXTrans.g:7111:2: ( rule__FieldDecl__InitAssignment_2_6 )
            // InternalFortXTrans.g:7111:3: rule__FieldDecl__InitAssignment_2_6
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
    // InternalFortXTrans.g:7120:1: rule__FieldDecl__Group_3__0 : rule__FieldDecl__Group_3__0__Impl rule__FieldDecl__Group_3__1 ;
    public final void rule__FieldDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7124:1: ( rule__FieldDecl__Group_3__0__Impl rule__FieldDecl__Group_3__1 )
            // InternalFortXTrans.g:7125:2: rule__FieldDecl__Group_3__0__Impl rule__FieldDecl__Group_3__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalFortXTrans.g:7132:1: rule__FieldDecl__Group_3__0__Impl : ( ( rule__FieldDecl__PriAssignment_3_0 )? ) ;
    public final void rule__FieldDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7136:1: ( ( ( rule__FieldDecl__PriAssignment_3_0 )? ) )
            // InternalFortXTrans.g:7137:1: ( ( rule__FieldDecl__PriAssignment_3_0 )? )
            {
            // InternalFortXTrans.g:7137:1: ( ( rule__FieldDecl__PriAssignment_3_0 )? )
            // InternalFortXTrans.g:7138:2: ( rule__FieldDecl__PriAssignment_3_0 )?
            {
             before(grammarAccess.getFieldDeclAccess().getPriAssignment_3_0()); 
            // InternalFortXTrans.g:7139:2: ( rule__FieldDecl__PriAssignment_3_0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==42) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalFortXTrans.g:7139:3: rule__FieldDecl__PriAssignment_3_0
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
    // InternalFortXTrans.g:7147:1: rule__FieldDecl__Group_3__1 : rule__FieldDecl__Group_3__1__Impl rule__FieldDecl__Group_3__2 ;
    public final void rule__FieldDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7151:1: ( rule__FieldDecl__Group_3__1__Impl rule__FieldDecl__Group_3__2 )
            // InternalFortXTrans.g:7152:2: rule__FieldDecl__Group_3__1__Impl rule__FieldDecl__Group_3__2
            {
            pushFollow(FOLLOW_51);
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
    // InternalFortXTrans.g:7159:1: rule__FieldDecl__Group_3__1__Impl : ( ( rule__FieldDecl__MutAssignment_3_1 )? ) ;
    public final void rule__FieldDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7163:1: ( ( ( rule__FieldDecl__MutAssignment_3_1 )? ) )
            // InternalFortXTrans.g:7164:1: ( ( rule__FieldDecl__MutAssignment_3_1 )? )
            {
            // InternalFortXTrans.g:7164:1: ( ( rule__FieldDecl__MutAssignment_3_1 )? )
            // InternalFortXTrans.g:7165:2: ( rule__FieldDecl__MutAssignment_3_1 )?
            {
             before(grammarAccess.getFieldDeclAccess().getMutAssignment_3_1()); 
            // InternalFortXTrans.g:7166:2: ( rule__FieldDecl__MutAssignment_3_1 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==51) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalFortXTrans.g:7166:3: rule__FieldDecl__MutAssignment_3_1
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
    // InternalFortXTrans.g:7174:1: rule__FieldDecl__Group_3__2 : rule__FieldDecl__Group_3__2__Impl rule__FieldDecl__Group_3__3 ;
    public final void rule__FieldDecl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7178:1: ( rule__FieldDecl__Group_3__2__Impl rule__FieldDecl__Group_3__3 )
            // InternalFortXTrans.g:7179:2: rule__FieldDecl__Group_3__2__Impl rule__FieldDecl__Group_3__3
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
    // InternalFortXTrans.g:7186:1: rule__FieldDecl__Group_3__2__Impl : ( ( rule__FieldDecl__IdtupAssignment_3_2 ) ) ;
    public final void rule__FieldDecl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7190:1: ( ( ( rule__FieldDecl__IdtupAssignment_3_2 ) ) )
            // InternalFortXTrans.g:7191:1: ( ( rule__FieldDecl__IdtupAssignment_3_2 ) )
            {
            // InternalFortXTrans.g:7191:1: ( ( rule__FieldDecl__IdtupAssignment_3_2 ) )
            // InternalFortXTrans.g:7192:2: ( rule__FieldDecl__IdtupAssignment_3_2 )
            {
             before(grammarAccess.getFieldDeclAccess().getIdtupAssignment_3_2()); 
            // InternalFortXTrans.g:7193:2: ( rule__FieldDecl__IdtupAssignment_3_2 )
            // InternalFortXTrans.g:7193:3: rule__FieldDecl__IdtupAssignment_3_2
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
    // InternalFortXTrans.g:7201:1: rule__FieldDecl__Group_3__3 : rule__FieldDecl__Group_3__3__Impl rule__FieldDecl__Group_3__4 ;
    public final void rule__FieldDecl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7205:1: ( rule__FieldDecl__Group_3__3__Impl rule__FieldDecl__Group_3__4 )
            // InternalFortXTrans.g:7206:2: rule__FieldDecl__Group_3__3__Impl rule__FieldDecl__Group_3__4
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
    // InternalFortXTrans.g:7213:1: rule__FieldDecl__Group_3__3__Impl : ( ':' ) ;
    public final void rule__FieldDecl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7217:1: ( ( ':' ) )
            // InternalFortXTrans.g:7218:1: ( ':' )
            {
            // InternalFortXTrans.g:7218:1: ( ':' )
            // InternalFortXTrans.g:7219:2: ':'
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
    // InternalFortXTrans.g:7228:1: rule__FieldDecl__Group_3__4 : rule__FieldDecl__Group_3__4__Impl rule__FieldDecl__Group_3__5 ;
    public final void rule__FieldDecl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7232:1: ( rule__FieldDecl__Group_3__4__Impl rule__FieldDecl__Group_3__5 )
            // InternalFortXTrans.g:7233:2: rule__FieldDecl__Group_3__4__Impl rule__FieldDecl__Group_3__5
            {
            pushFollow(FOLLOW_48);
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
    // InternalFortXTrans.g:7240:1: rule__FieldDecl__Group_3__4__Impl : ( ( rule__FieldDecl__TuptypeAssignment_3_4 ) ) ;
    public final void rule__FieldDecl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7244:1: ( ( ( rule__FieldDecl__TuptypeAssignment_3_4 ) ) )
            // InternalFortXTrans.g:7245:1: ( ( rule__FieldDecl__TuptypeAssignment_3_4 ) )
            {
            // InternalFortXTrans.g:7245:1: ( ( rule__FieldDecl__TuptypeAssignment_3_4 ) )
            // InternalFortXTrans.g:7246:2: ( rule__FieldDecl__TuptypeAssignment_3_4 )
            {
             before(grammarAccess.getFieldDeclAccess().getTuptypeAssignment_3_4()); 
            // InternalFortXTrans.g:7247:2: ( rule__FieldDecl__TuptypeAssignment_3_4 )
            // InternalFortXTrans.g:7247:3: rule__FieldDecl__TuptypeAssignment_3_4
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
    // InternalFortXTrans.g:7255:1: rule__FieldDecl__Group_3__5 : rule__FieldDecl__Group_3__5__Impl ;
    public final void rule__FieldDecl__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7259:1: ( rule__FieldDecl__Group_3__5__Impl )
            // InternalFortXTrans.g:7260:2: rule__FieldDecl__Group_3__5__Impl
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
    // InternalFortXTrans.g:7266:1: rule__FieldDecl__Group_3__5__Impl : ( ( rule__FieldDecl__InitAssignment_3_5 ) ) ;
    public final void rule__FieldDecl__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7270:1: ( ( ( rule__FieldDecl__InitAssignment_3_5 ) ) )
            // InternalFortXTrans.g:7271:1: ( ( rule__FieldDecl__InitAssignment_3_5 ) )
            {
            // InternalFortXTrans.g:7271:1: ( ( rule__FieldDecl__InitAssignment_3_5 ) )
            // InternalFortXTrans.g:7272:2: ( rule__FieldDecl__InitAssignment_3_5 )
            {
             before(grammarAccess.getFieldDeclAccess().getInitAssignment_3_5()); 
            // InternalFortXTrans.g:7273:2: ( rule__FieldDecl__InitAssignment_3_5 )
            // InternalFortXTrans.g:7273:3: rule__FieldDecl__InitAssignment_3_5
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
    // InternalFortXTrans.g:7282:1: rule__NoNewlineVarWTypes__Group_1__0 : rule__NoNewlineVarWTypes__Group_1__0__Impl rule__NoNewlineVarWTypes__Group_1__1 ;
    public final void rule__NoNewlineVarWTypes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7286:1: ( rule__NoNewlineVarWTypes__Group_1__0__Impl rule__NoNewlineVarWTypes__Group_1__1 )
            // InternalFortXTrans.g:7287:2: rule__NoNewlineVarWTypes__Group_1__0__Impl rule__NoNewlineVarWTypes__Group_1__1
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
    // InternalFortXTrans.g:7294:1: rule__NoNewlineVarWTypes__Group_1__0__Impl : ( '(' ) ;
    public final void rule__NoNewlineVarWTypes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7298:1: ( ( '(' ) )
            // InternalFortXTrans.g:7299:1: ( '(' )
            {
            // InternalFortXTrans.g:7299:1: ( '(' )
            // InternalFortXTrans.g:7300:2: '('
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
    // InternalFortXTrans.g:7309:1: rule__NoNewlineVarWTypes__Group_1__1 : rule__NoNewlineVarWTypes__Group_1__1__Impl rule__NoNewlineVarWTypes__Group_1__2 ;
    public final void rule__NoNewlineVarWTypes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7313:1: ( rule__NoNewlineVarWTypes__Group_1__1__Impl rule__NoNewlineVarWTypes__Group_1__2 )
            // InternalFortXTrans.g:7314:2: rule__NoNewlineVarWTypes__Group_1__1__Impl rule__NoNewlineVarWTypes__Group_1__2
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
    // InternalFortXTrans.g:7321:1: rule__NoNewlineVarWTypes__Group_1__1__Impl : ( ( rule__NoNewlineVarWTypes__MultipleAssignment_1_1 ) ) ;
    public final void rule__NoNewlineVarWTypes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7325:1: ( ( ( rule__NoNewlineVarWTypes__MultipleAssignment_1_1 ) ) )
            // InternalFortXTrans.g:7326:1: ( ( rule__NoNewlineVarWTypes__MultipleAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:7326:1: ( ( rule__NoNewlineVarWTypes__MultipleAssignment_1_1 ) )
            // InternalFortXTrans.g:7327:2: ( rule__NoNewlineVarWTypes__MultipleAssignment_1_1 )
            {
             before(grammarAccess.getNoNewlineVarWTypesAccess().getMultipleAssignment_1_1()); 
            // InternalFortXTrans.g:7328:2: ( rule__NoNewlineVarWTypes__MultipleAssignment_1_1 )
            // InternalFortXTrans.g:7328:3: rule__NoNewlineVarWTypes__MultipleAssignment_1_1
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
    // InternalFortXTrans.g:7336:1: rule__NoNewlineVarWTypes__Group_1__2 : rule__NoNewlineVarWTypes__Group_1__2__Impl rule__NoNewlineVarWTypes__Group_1__3 ;
    public final void rule__NoNewlineVarWTypes__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7340:1: ( rule__NoNewlineVarWTypes__Group_1__2__Impl rule__NoNewlineVarWTypes__Group_1__3 )
            // InternalFortXTrans.g:7341:2: rule__NoNewlineVarWTypes__Group_1__2__Impl rule__NoNewlineVarWTypes__Group_1__3
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
    // InternalFortXTrans.g:7348:1: rule__NoNewlineVarWTypes__Group_1__2__Impl : ( ( ( rule__NoNewlineVarWTypes__Group_1_2__0 ) ) ( ( rule__NoNewlineVarWTypes__Group_1_2__0 )* ) ) ;
    public final void rule__NoNewlineVarWTypes__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7352:1: ( ( ( ( rule__NoNewlineVarWTypes__Group_1_2__0 ) ) ( ( rule__NoNewlineVarWTypes__Group_1_2__0 )* ) ) )
            // InternalFortXTrans.g:7353:1: ( ( ( rule__NoNewlineVarWTypes__Group_1_2__0 ) ) ( ( rule__NoNewlineVarWTypes__Group_1_2__0 )* ) )
            {
            // InternalFortXTrans.g:7353:1: ( ( ( rule__NoNewlineVarWTypes__Group_1_2__0 ) ) ( ( rule__NoNewlineVarWTypes__Group_1_2__0 )* ) )
            // InternalFortXTrans.g:7354:2: ( ( rule__NoNewlineVarWTypes__Group_1_2__0 ) ) ( ( rule__NoNewlineVarWTypes__Group_1_2__0 )* )
            {
            // InternalFortXTrans.g:7354:2: ( ( rule__NoNewlineVarWTypes__Group_1_2__0 ) )
            // InternalFortXTrans.g:7355:3: ( rule__NoNewlineVarWTypes__Group_1_2__0 )
            {
             before(grammarAccess.getNoNewlineVarWTypesAccess().getGroup_1_2()); 
            // InternalFortXTrans.g:7356:3: ( rule__NoNewlineVarWTypes__Group_1_2__0 )
            // InternalFortXTrans.g:7356:4: rule__NoNewlineVarWTypes__Group_1_2__0
            {
            pushFollow(FOLLOW_15);
            rule__NoNewlineVarWTypes__Group_1_2__0();

            state._fsp--;


            }

             after(grammarAccess.getNoNewlineVarWTypesAccess().getGroup_1_2()); 

            }

            // InternalFortXTrans.g:7359:2: ( ( rule__NoNewlineVarWTypes__Group_1_2__0 )* )
            // InternalFortXTrans.g:7360:3: ( rule__NoNewlineVarWTypes__Group_1_2__0 )*
            {
             before(grammarAccess.getNoNewlineVarWTypesAccess().getGroup_1_2()); 
            // InternalFortXTrans.g:7361:3: ( rule__NoNewlineVarWTypes__Group_1_2__0 )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==25) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalFortXTrans.g:7361:4: rule__NoNewlineVarWTypes__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__NoNewlineVarWTypes__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop68;
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
    // InternalFortXTrans.g:7370:1: rule__NoNewlineVarWTypes__Group_1__3 : rule__NoNewlineVarWTypes__Group_1__3__Impl ;
    public final void rule__NoNewlineVarWTypes__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7374:1: ( rule__NoNewlineVarWTypes__Group_1__3__Impl )
            // InternalFortXTrans.g:7375:2: rule__NoNewlineVarWTypes__Group_1__3__Impl
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
    // InternalFortXTrans.g:7381:1: rule__NoNewlineVarWTypes__Group_1__3__Impl : ( ')' ) ;
    public final void rule__NoNewlineVarWTypes__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7385:1: ( ( ')' ) )
            // InternalFortXTrans.g:7386:1: ( ')' )
            {
            // InternalFortXTrans.g:7386:1: ( ')' )
            // InternalFortXTrans.g:7387:2: ')'
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
    // InternalFortXTrans.g:7397:1: rule__NoNewlineVarWTypes__Group_1_2__0 : rule__NoNewlineVarWTypes__Group_1_2__0__Impl rule__NoNewlineVarWTypes__Group_1_2__1 ;
    public final void rule__NoNewlineVarWTypes__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7401:1: ( rule__NoNewlineVarWTypes__Group_1_2__0__Impl rule__NoNewlineVarWTypes__Group_1_2__1 )
            // InternalFortXTrans.g:7402:2: rule__NoNewlineVarWTypes__Group_1_2__0__Impl rule__NoNewlineVarWTypes__Group_1_2__1
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
    // InternalFortXTrans.g:7409:1: rule__NoNewlineVarWTypes__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__NoNewlineVarWTypes__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7413:1: ( ( ',' ) )
            // InternalFortXTrans.g:7414:1: ( ',' )
            {
            // InternalFortXTrans.g:7414:1: ( ',' )
            // InternalFortXTrans.g:7415:2: ','
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
    // InternalFortXTrans.g:7424:1: rule__NoNewlineVarWTypes__Group_1_2__1 : rule__NoNewlineVarWTypes__Group_1_2__1__Impl ;
    public final void rule__NoNewlineVarWTypes__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7428:1: ( rule__NoNewlineVarWTypes__Group_1_2__1__Impl )
            // InternalFortXTrans.g:7429:2: rule__NoNewlineVarWTypes__Group_1_2__1__Impl
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
    // InternalFortXTrans.g:7435:1: rule__NoNewlineVarWTypes__Group_1_2__1__Impl : ( ( rule__NoNewlineVarWTypes__MultipleAssignment_1_2_1 ) ) ;
    public final void rule__NoNewlineVarWTypes__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7439:1: ( ( ( rule__NoNewlineVarWTypes__MultipleAssignment_1_2_1 ) ) )
            // InternalFortXTrans.g:7440:1: ( ( rule__NoNewlineVarWTypes__MultipleAssignment_1_2_1 ) )
            {
            // InternalFortXTrans.g:7440:1: ( ( rule__NoNewlineVarWTypes__MultipleAssignment_1_2_1 ) )
            // InternalFortXTrans.g:7441:2: ( rule__NoNewlineVarWTypes__MultipleAssignment_1_2_1 )
            {
             before(grammarAccess.getNoNewlineVarWTypesAccess().getMultipleAssignment_1_2_1()); 
            // InternalFortXTrans.g:7442:2: ( rule__NoNewlineVarWTypes__MultipleAssignment_1_2_1 )
            // InternalFortXTrans.g:7442:3: rule__NoNewlineVarWTypes__MultipleAssignment_1_2_1
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
    // InternalFortXTrans.g:7451:1: rule__NoNewlineVarWType__Group__0 : rule__NoNewlineVarWType__Group__0__Impl rule__NoNewlineVarWType__Group__1 ;
    public final void rule__NoNewlineVarWType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7455:1: ( rule__NoNewlineVarWType__Group__0__Impl rule__NoNewlineVarWType__Group__1 )
            // InternalFortXTrans.g:7456:2: rule__NoNewlineVarWType__Group__0__Impl rule__NoNewlineVarWType__Group__1
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
    // InternalFortXTrans.g:7463:1: rule__NoNewlineVarWType__Group__0__Impl : ( ( rule__NoNewlineVarWType__BidAssignment_0 ) ) ;
    public final void rule__NoNewlineVarWType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7467:1: ( ( ( rule__NoNewlineVarWType__BidAssignment_0 ) ) )
            // InternalFortXTrans.g:7468:1: ( ( rule__NoNewlineVarWType__BidAssignment_0 ) )
            {
            // InternalFortXTrans.g:7468:1: ( ( rule__NoNewlineVarWType__BidAssignment_0 ) )
            // InternalFortXTrans.g:7469:2: ( rule__NoNewlineVarWType__BidAssignment_0 )
            {
             before(grammarAccess.getNoNewlineVarWTypeAccess().getBidAssignment_0()); 
            // InternalFortXTrans.g:7470:2: ( rule__NoNewlineVarWType__BidAssignment_0 )
            // InternalFortXTrans.g:7470:3: rule__NoNewlineVarWType__BidAssignment_0
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
    // InternalFortXTrans.g:7478:1: rule__NoNewlineVarWType__Group__1 : rule__NoNewlineVarWType__Group__1__Impl ;
    public final void rule__NoNewlineVarWType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7482:1: ( rule__NoNewlineVarWType__Group__1__Impl )
            // InternalFortXTrans.g:7483:2: rule__NoNewlineVarWType__Group__1__Impl
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
    // InternalFortXTrans.g:7489:1: rule__NoNewlineVarWType__Group__1__Impl : ( ( rule__NoNewlineVarWType__IstypeAssignment_1 ) ) ;
    public final void rule__NoNewlineVarWType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7493:1: ( ( ( rule__NoNewlineVarWType__IstypeAssignment_1 ) ) )
            // InternalFortXTrans.g:7494:1: ( ( rule__NoNewlineVarWType__IstypeAssignment_1 ) )
            {
            // InternalFortXTrans.g:7494:1: ( ( rule__NoNewlineVarWType__IstypeAssignment_1 ) )
            // InternalFortXTrans.g:7495:2: ( rule__NoNewlineVarWType__IstypeAssignment_1 )
            {
             before(grammarAccess.getNoNewlineVarWTypeAccess().getIstypeAssignment_1()); 
            // InternalFortXTrans.g:7496:2: ( rule__NoNewlineVarWType__IstypeAssignment_1 )
            // InternalFortXTrans.g:7496:3: rule__NoNewlineVarWType__IstypeAssignment_1
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
    // InternalFortXTrans.g:7505:1: rule__InitVal__Group_0__0 : rule__InitVal__Group_0__0__Impl rule__InitVal__Group_0__1 ;
    public final void rule__InitVal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7509:1: ( rule__InitVal__Group_0__0__Impl rule__InitVal__Group_0__1 )
            // InternalFortXTrans.g:7510:2: rule__InitVal__Group_0__0__Impl rule__InitVal__Group_0__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalFortXTrans.g:7517:1: rule__InitVal__Group_0__0__Impl : ( ( rule__InitVal__MutAssignment_0_0 ) ) ;
    public final void rule__InitVal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7521:1: ( ( ( rule__InitVal__MutAssignment_0_0 ) ) )
            // InternalFortXTrans.g:7522:1: ( ( rule__InitVal__MutAssignment_0_0 ) )
            {
            // InternalFortXTrans.g:7522:1: ( ( rule__InitVal__MutAssignment_0_0 ) )
            // InternalFortXTrans.g:7523:2: ( rule__InitVal__MutAssignment_0_0 )
            {
             before(grammarAccess.getInitValAccess().getMutAssignment_0_0()); 
            // InternalFortXTrans.g:7524:2: ( rule__InitVal__MutAssignment_0_0 )
            // InternalFortXTrans.g:7524:3: rule__InitVal__MutAssignment_0_0
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
    // InternalFortXTrans.g:7532:1: rule__InitVal__Group_0__1 : rule__InitVal__Group_0__1__Impl ;
    public final void rule__InitVal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7536:1: ( rule__InitVal__Group_0__1__Impl )
            // InternalFortXTrans.g:7537:2: rule__InitVal__Group_0__1__Impl
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
    // InternalFortXTrans.g:7543:1: rule__InitVal__Group_0__1__Impl : ( ( rule__InitVal__LitAssignment_0_1 ) ) ;
    public final void rule__InitVal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7547:1: ( ( ( rule__InitVal__LitAssignment_0_1 ) ) )
            // InternalFortXTrans.g:7548:1: ( ( rule__InitVal__LitAssignment_0_1 ) )
            {
            // InternalFortXTrans.g:7548:1: ( ( rule__InitVal__LitAssignment_0_1 ) )
            // InternalFortXTrans.g:7549:2: ( rule__InitVal__LitAssignment_0_1 )
            {
             before(grammarAccess.getInitValAccess().getLitAssignment_0_1()); 
            // InternalFortXTrans.g:7550:2: ( rule__InitVal__LitAssignment_0_1 )
            // InternalFortXTrans.g:7550:3: rule__InitVal__LitAssignment_0_1
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
    // InternalFortXTrans.g:7559:1: rule__InitVal__Group_1__0 : rule__InitVal__Group_1__0__Impl rule__InitVal__Group_1__1 ;
    public final void rule__InitVal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7563:1: ( rule__InitVal__Group_1__0__Impl rule__InitVal__Group_1__1 )
            // InternalFortXTrans.g:7564:2: rule__InitVal__Group_1__0__Impl rule__InitVal__Group_1__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalFortXTrans.g:7571:1: rule__InitVal__Group_1__0__Impl : ( ( rule__InitVal__ImmutAssignment_1_0 ) ) ;
    public final void rule__InitVal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7575:1: ( ( ( rule__InitVal__ImmutAssignment_1_0 ) ) )
            // InternalFortXTrans.g:7576:1: ( ( rule__InitVal__ImmutAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:7576:1: ( ( rule__InitVal__ImmutAssignment_1_0 ) )
            // InternalFortXTrans.g:7577:2: ( rule__InitVal__ImmutAssignment_1_0 )
            {
             before(grammarAccess.getInitValAccess().getImmutAssignment_1_0()); 
            // InternalFortXTrans.g:7578:2: ( rule__InitVal__ImmutAssignment_1_0 )
            // InternalFortXTrans.g:7578:3: rule__InitVal__ImmutAssignment_1_0
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
    // InternalFortXTrans.g:7586:1: rule__InitVal__Group_1__1 : rule__InitVal__Group_1__1__Impl ;
    public final void rule__InitVal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7590:1: ( rule__InitVal__Group_1__1__Impl )
            // InternalFortXTrans.g:7591:2: rule__InitVal__Group_1__1__Impl
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
    // InternalFortXTrans.g:7597:1: rule__InitVal__Group_1__1__Impl : ( ( rule__InitVal__LitAssignment_1_1 ) ) ;
    public final void rule__InitVal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7601:1: ( ( ( rule__InitVal__LitAssignment_1_1 ) ) )
            // InternalFortXTrans.g:7602:1: ( ( rule__InitVal__LitAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:7602:1: ( ( rule__InitVal__LitAssignment_1_1 ) )
            // InternalFortXTrans.g:7603:2: ( rule__InitVal__LitAssignment_1_1 )
            {
             before(grammarAccess.getInitValAccess().getLitAssignment_1_1()); 
            // InternalFortXTrans.g:7604:2: ( rule__InitVal__LitAssignment_1_1 )
            // InternalFortXTrans.g:7604:3: rule__InitVal__LitAssignment_1_1
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
    // InternalFortXTrans.g:7613:1: rule__LiteralTuple__Group_1__0 : rule__LiteralTuple__Group_1__0__Impl rule__LiteralTuple__Group_1__1 ;
    public final void rule__LiteralTuple__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7617:1: ( rule__LiteralTuple__Group_1__0__Impl rule__LiteralTuple__Group_1__1 )
            // InternalFortXTrans.g:7618:2: rule__LiteralTuple__Group_1__0__Impl rule__LiteralTuple__Group_1__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalFortXTrans.g:7625:1: rule__LiteralTuple__Group_1__0__Impl : ( '(' ) ;
    public final void rule__LiteralTuple__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7629:1: ( ( '(' ) )
            // InternalFortXTrans.g:7630:1: ( '(' )
            {
            // InternalFortXTrans.g:7630:1: ( '(' )
            // InternalFortXTrans.g:7631:2: '('
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
    // InternalFortXTrans.g:7640:1: rule__LiteralTuple__Group_1__1 : rule__LiteralTuple__Group_1__1__Impl rule__LiteralTuple__Group_1__2 ;
    public final void rule__LiteralTuple__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7644:1: ( rule__LiteralTuple__Group_1__1__Impl rule__LiteralTuple__Group_1__2 )
            // InternalFortXTrans.g:7645:2: rule__LiteralTuple__Group_1__1__Impl rule__LiteralTuple__Group_1__2
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
    // InternalFortXTrans.g:7652:1: rule__LiteralTuple__Group_1__1__Impl : ( ( rule__LiteralTuple__LitsAssignment_1_1 ) ) ;
    public final void rule__LiteralTuple__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7656:1: ( ( ( rule__LiteralTuple__LitsAssignment_1_1 ) ) )
            // InternalFortXTrans.g:7657:1: ( ( rule__LiteralTuple__LitsAssignment_1_1 ) )
            {
            // InternalFortXTrans.g:7657:1: ( ( rule__LiteralTuple__LitsAssignment_1_1 ) )
            // InternalFortXTrans.g:7658:2: ( rule__LiteralTuple__LitsAssignment_1_1 )
            {
             before(grammarAccess.getLiteralTupleAccess().getLitsAssignment_1_1()); 
            // InternalFortXTrans.g:7659:2: ( rule__LiteralTuple__LitsAssignment_1_1 )
            // InternalFortXTrans.g:7659:3: rule__LiteralTuple__LitsAssignment_1_1
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
    // InternalFortXTrans.g:7667:1: rule__LiteralTuple__Group_1__2 : rule__LiteralTuple__Group_1__2__Impl rule__LiteralTuple__Group_1__3 ;
    public final void rule__LiteralTuple__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7671:1: ( rule__LiteralTuple__Group_1__2__Impl rule__LiteralTuple__Group_1__3 )
            // InternalFortXTrans.g:7672:2: rule__LiteralTuple__Group_1__2__Impl rule__LiteralTuple__Group_1__3
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
    // InternalFortXTrans.g:7679:1: rule__LiteralTuple__Group_1__2__Impl : ( ( ( rule__LiteralTuple__Group_1_2__0 ) ) ( ( rule__LiteralTuple__Group_1_2__0 )* ) ) ;
    public final void rule__LiteralTuple__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7683:1: ( ( ( ( rule__LiteralTuple__Group_1_2__0 ) ) ( ( rule__LiteralTuple__Group_1_2__0 )* ) ) )
            // InternalFortXTrans.g:7684:1: ( ( ( rule__LiteralTuple__Group_1_2__0 ) ) ( ( rule__LiteralTuple__Group_1_2__0 )* ) )
            {
            // InternalFortXTrans.g:7684:1: ( ( ( rule__LiteralTuple__Group_1_2__0 ) ) ( ( rule__LiteralTuple__Group_1_2__0 )* ) )
            // InternalFortXTrans.g:7685:2: ( ( rule__LiteralTuple__Group_1_2__0 ) ) ( ( rule__LiteralTuple__Group_1_2__0 )* )
            {
            // InternalFortXTrans.g:7685:2: ( ( rule__LiteralTuple__Group_1_2__0 ) )
            // InternalFortXTrans.g:7686:3: ( rule__LiteralTuple__Group_1_2__0 )
            {
             before(grammarAccess.getLiteralTupleAccess().getGroup_1_2()); 
            // InternalFortXTrans.g:7687:3: ( rule__LiteralTuple__Group_1_2__0 )
            // InternalFortXTrans.g:7687:4: rule__LiteralTuple__Group_1_2__0
            {
            pushFollow(FOLLOW_15);
            rule__LiteralTuple__Group_1_2__0();

            state._fsp--;


            }

             after(grammarAccess.getLiteralTupleAccess().getGroup_1_2()); 

            }

            // InternalFortXTrans.g:7690:2: ( ( rule__LiteralTuple__Group_1_2__0 )* )
            // InternalFortXTrans.g:7691:3: ( rule__LiteralTuple__Group_1_2__0 )*
            {
             before(grammarAccess.getLiteralTupleAccess().getGroup_1_2()); 
            // InternalFortXTrans.g:7692:3: ( rule__LiteralTuple__Group_1_2__0 )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==25) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalFortXTrans.g:7692:4: rule__LiteralTuple__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__LiteralTuple__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop69;
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
    // InternalFortXTrans.g:7701:1: rule__LiteralTuple__Group_1__3 : rule__LiteralTuple__Group_1__3__Impl ;
    public final void rule__LiteralTuple__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7705:1: ( rule__LiteralTuple__Group_1__3__Impl )
            // InternalFortXTrans.g:7706:2: rule__LiteralTuple__Group_1__3__Impl
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
    // InternalFortXTrans.g:7712:1: rule__LiteralTuple__Group_1__3__Impl : ( ')' ) ;
    public final void rule__LiteralTuple__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7716:1: ( ( ')' ) )
            // InternalFortXTrans.g:7717:1: ( ')' )
            {
            // InternalFortXTrans.g:7717:1: ( ')' )
            // InternalFortXTrans.g:7718:2: ')'
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
    // InternalFortXTrans.g:7728:1: rule__LiteralTuple__Group_1_2__0 : rule__LiteralTuple__Group_1_2__0__Impl rule__LiteralTuple__Group_1_2__1 ;
    public final void rule__LiteralTuple__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7732:1: ( rule__LiteralTuple__Group_1_2__0__Impl rule__LiteralTuple__Group_1_2__1 )
            // InternalFortXTrans.g:7733:2: rule__LiteralTuple__Group_1_2__0__Impl rule__LiteralTuple__Group_1_2__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalFortXTrans.g:7740:1: rule__LiteralTuple__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__LiteralTuple__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7744:1: ( ( ',' ) )
            // InternalFortXTrans.g:7745:1: ( ',' )
            {
            // InternalFortXTrans.g:7745:1: ( ',' )
            // InternalFortXTrans.g:7746:2: ','
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
    // InternalFortXTrans.g:7755:1: rule__LiteralTuple__Group_1_2__1 : rule__LiteralTuple__Group_1_2__1__Impl ;
    public final void rule__LiteralTuple__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7759:1: ( rule__LiteralTuple__Group_1_2__1__Impl )
            // InternalFortXTrans.g:7760:2: rule__LiteralTuple__Group_1_2__1__Impl
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
    // InternalFortXTrans.g:7766:1: rule__LiteralTuple__Group_1_2__1__Impl : ( ( rule__LiteralTuple__LitsAssignment_1_2_1 ) ) ;
    public final void rule__LiteralTuple__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7770:1: ( ( ( rule__LiteralTuple__LitsAssignment_1_2_1 ) ) )
            // InternalFortXTrans.g:7771:1: ( ( rule__LiteralTuple__LitsAssignment_1_2_1 ) )
            {
            // InternalFortXTrans.g:7771:1: ( ( rule__LiteralTuple__LitsAssignment_1_2_1 ) )
            // InternalFortXTrans.g:7772:2: ( rule__LiteralTuple__LitsAssignment_1_2_1 )
            {
             before(grammarAccess.getLiteralTupleAccess().getLitsAssignment_1_2_1()); 
            // InternalFortXTrans.g:7773:2: ( rule__LiteralTuple__LitsAssignment_1_2_1 )
            // InternalFortXTrans.g:7773:3: rule__LiteralTuple__LitsAssignment_1_2_1
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


    // $ANTLR start "rule__LocalVarDecl__Group_0__0"
    // InternalFortXTrans.g:7782:1: rule__LocalVarDecl__Group_0__0 : rule__LocalVarDecl__Group_0__0__Impl rule__LocalVarDecl__Group_0__1 ;
    public final void rule__LocalVarDecl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7786:1: ( rule__LocalVarDecl__Group_0__0__Impl rule__LocalVarDecl__Group_0__1 )
            // InternalFortXTrans.g:7787:2: rule__LocalVarDecl__Group_0__0__Impl rule__LocalVarDecl__Group_0__1
            {
            pushFollow(FOLLOW_47);
            rule__LocalVarDecl__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_0__0"


    // $ANTLR start "rule__LocalVarDecl__Group_0__0__Impl"
    // InternalFortXTrans.g:7794:1: rule__LocalVarDecl__Group_0__0__Impl : ( ( rule__LocalVarDecl__MutAssignment_0_0 )? ) ;
    public final void rule__LocalVarDecl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7798:1: ( ( ( rule__LocalVarDecl__MutAssignment_0_0 )? ) )
            // InternalFortXTrans.g:7799:1: ( ( rule__LocalVarDecl__MutAssignment_0_0 )? )
            {
            // InternalFortXTrans.g:7799:1: ( ( rule__LocalVarDecl__MutAssignment_0_0 )? )
            // InternalFortXTrans.g:7800:2: ( rule__LocalVarDecl__MutAssignment_0_0 )?
            {
             before(grammarAccess.getLocalVarDeclAccess().getMutAssignment_0_0()); 
            // InternalFortXTrans.g:7801:2: ( rule__LocalVarDecl__MutAssignment_0_0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==51) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalFortXTrans.g:7801:3: rule__LocalVarDecl__MutAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocalVarDecl__MutAssignment_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLocalVarDeclAccess().getMutAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_0__0__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_0__1"
    // InternalFortXTrans.g:7809:1: rule__LocalVarDecl__Group_0__1 : rule__LocalVarDecl__Group_0__1__Impl rule__LocalVarDecl__Group_0__2 ;
    public final void rule__LocalVarDecl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7813:1: ( rule__LocalVarDecl__Group_0__1__Impl rule__LocalVarDecl__Group_0__2 )
            // InternalFortXTrans.g:7814:2: rule__LocalVarDecl__Group_0__1__Impl rule__LocalVarDecl__Group_0__2
            {
            pushFollow(FOLLOW_48);
            rule__LocalVarDecl__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_0__1"


    // $ANTLR start "rule__LocalVarDecl__Group_0__1__Impl"
    // InternalFortXTrans.g:7821:1: rule__LocalVarDecl__Group_0__1__Impl : ( ( rule__LocalVarDecl__VarsAssignment_0_1 ) ) ;
    public final void rule__LocalVarDecl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7825:1: ( ( ( rule__LocalVarDecl__VarsAssignment_0_1 ) ) )
            // InternalFortXTrans.g:7826:1: ( ( rule__LocalVarDecl__VarsAssignment_0_1 ) )
            {
            // InternalFortXTrans.g:7826:1: ( ( rule__LocalVarDecl__VarsAssignment_0_1 ) )
            // InternalFortXTrans.g:7827:2: ( rule__LocalVarDecl__VarsAssignment_0_1 )
            {
             before(grammarAccess.getLocalVarDeclAccess().getVarsAssignment_0_1()); 
            // InternalFortXTrans.g:7828:2: ( rule__LocalVarDecl__VarsAssignment_0_1 )
            // InternalFortXTrans.g:7828:3: rule__LocalVarDecl__VarsAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__VarsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalVarDeclAccess().getVarsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_0__1__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_0__2"
    // InternalFortXTrans.g:7836:1: rule__LocalVarDecl__Group_0__2 : rule__LocalVarDecl__Group_0__2__Impl ;
    public final void rule__LocalVarDecl__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7840:1: ( rule__LocalVarDecl__Group_0__2__Impl )
            // InternalFortXTrans.g:7841:2: rule__LocalVarDecl__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_0__2"


    // $ANTLR start "rule__LocalVarDecl__Group_0__2__Impl"
    // InternalFortXTrans.g:7847:1: rule__LocalVarDecl__Group_0__2__Impl : ( ( rule__LocalVarDecl__InitAssignment_0_2 ) ) ;
    public final void rule__LocalVarDecl__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7851:1: ( ( ( rule__LocalVarDecl__InitAssignment_0_2 ) ) )
            // InternalFortXTrans.g:7852:1: ( ( rule__LocalVarDecl__InitAssignment_0_2 ) )
            {
            // InternalFortXTrans.g:7852:1: ( ( rule__LocalVarDecl__InitAssignment_0_2 ) )
            // InternalFortXTrans.g:7853:2: ( rule__LocalVarDecl__InitAssignment_0_2 )
            {
             before(grammarAccess.getLocalVarDeclAccess().getInitAssignment_0_2()); 
            // InternalFortXTrans.g:7854:2: ( rule__LocalVarDecl__InitAssignment_0_2 )
            // InternalFortXTrans.g:7854:3: rule__LocalVarDecl__InitAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__InitAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getLocalVarDeclAccess().getInitAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_0__2__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_1__0"
    // InternalFortXTrans.g:7863:1: rule__LocalVarDecl__Group_1__0 : rule__LocalVarDecl__Group_1__0__Impl rule__LocalVarDecl__Group_1__1 ;
    public final void rule__LocalVarDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7867:1: ( rule__LocalVarDecl__Group_1__0__Impl rule__LocalVarDecl__Group_1__1 )
            // InternalFortXTrans.g:7868:2: rule__LocalVarDecl__Group_1__0__Impl rule__LocalVarDecl__Group_1__1
            {
            pushFollow(FOLLOW_49);
            rule__LocalVarDecl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_1__0"


    // $ANTLR start "rule__LocalVarDecl__Group_1__0__Impl"
    // InternalFortXTrans.g:7875:1: rule__LocalVarDecl__Group_1__0__Impl : ( ( rule__LocalVarDecl__IdtupAssignment_1_0 ) ) ;
    public final void rule__LocalVarDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7879:1: ( ( ( rule__LocalVarDecl__IdtupAssignment_1_0 ) ) )
            // InternalFortXTrans.g:7880:1: ( ( rule__LocalVarDecl__IdtupAssignment_1_0 ) )
            {
            // InternalFortXTrans.g:7880:1: ( ( rule__LocalVarDecl__IdtupAssignment_1_0 ) )
            // InternalFortXTrans.g:7881:2: ( rule__LocalVarDecl__IdtupAssignment_1_0 )
            {
             before(grammarAccess.getLocalVarDeclAccess().getIdtupAssignment_1_0()); 
            // InternalFortXTrans.g:7882:2: ( rule__LocalVarDecl__IdtupAssignment_1_0 )
            // InternalFortXTrans.g:7882:3: rule__LocalVarDecl__IdtupAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__IdtupAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getLocalVarDeclAccess().getIdtupAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_1__0__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_1__1"
    // InternalFortXTrans.g:7890:1: rule__LocalVarDecl__Group_1__1 : rule__LocalVarDecl__Group_1__1__Impl rule__LocalVarDecl__Group_1__2 ;
    public final void rule__LocalVarDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7894:1: ( rule__LocalVarDecl__Group_1__1__Impl rule__LocalVarDecl__Group_1__2 )
            // InternalFortXTrans.g:7895:2: rule__LocalVarDecl__Group_1__1__Impl rule__LocalVarDecl__Group_1__2
            {
            pushFollow(FOLLOW_50);
            rule__LocalVarDecl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_1__1"


    // $ANTLR start "rule__LocalVarDecl__Group_1__1__Impl"
    // InternalFortXTrans.g:7902:1: rule__LocalVarDecl__Group_1__1__Impl : ( '=' ) ;
    public final void rule__LocalVarDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7906:1: ( ( '=' ) )
            // InternalFortXTrans.g:7907:1: ( '=' )
            {
            // InternalFortXTrans.g:7907:1: ( '=' )
            // InternalFortXTrans.g:7908:2: '='
            {
             before(grammarAccess.getLocalVarDeclAccess().getEqualsSignKeyword_1_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLocalVarDeclAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_1__1__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_1__2"
    // InternalFortXTrans.g:7917:1: rule__LocalVarDecl__Group_1__2 : rule__LocalVarDecl__Group_1__2__Impl ;
    public final void rule__LocalVarDecl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7921:1: ( rule__LocalVarDecl__Group_1__2__Impl )
            // InternalFortXTrans.g:7922:2: rule__LocalVarDecl__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_1__2"


    // $ANTLR start "rule__LocalVarDecl__Group_1__2__Impl"
    // InternalFortXTrans.g:7928:1: rule__LocalVarDecl__Group_1__2__Impl : ( ( rule__LocalVarDecl__LitTupAssignment_1_2 ) ) ;
    public final void rule__LocalVarDecl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7932:1: ( ( ( rule__LocalVarDecl__LitTupAssignment_1_2 ) ) )
            // InternalFortXTrans.g:7933:1: ( ( rule__LocalVarDecl__LitTupAssignment_1_2 ) )
            {
            // InternalFortXTrans.g:7933:1: ( ( rule__LocalVarDecl__LitTupAssignment_1_2 ) )
            // InternalFortXTrans.g:7934:2: ( rule__LocalVarDecl__LitTupAssignment_1_2 )
            {
             before(grammarAccess.getLocalVarDeclAccess().getLitTupAssignment_1_2()); 
            // InternalFortXTrans.g:7935:2: ( rule__LocalVarDecl__LitTupAssignment_1_2 )
            // InternalFortXTrans.g:7935:3: rule__LocalVarDecl__LitTupAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__LitTupAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLocalVarDeclAccess().getLitTupAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_1__2__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2__0"
    // InternalFortXTrans.g:7944:1: rule__LocalVarDecl__Group_2__0 : rule__LocalVarDecl__Group_2__0__Impl rule__LocalVarDecl__Group_2__1 ;
    public final void rule__LocalVarDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7948:1: ( rule__LocalVarDecl__Group_2__0__Impl rule__LocalVarDecl__Group_2__1 )
            // InternalFortXTrans.g:7949:2: rule__LocalVarDecl__Group_2__0__Impl rule__LocalVarDecl__Group_2__1
            {
            pushFollow(FOLLOW_47);
            rule__LocalVarDecl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2__0"


    // $ANTLR start "rule__LocalVarDecl__Group_2__0__Impl"
    // InternalFortXTrans.g:7956:1: rule__LocalVarDecl__Group_2__0__Impl : ( ( rule__LocalVarDecl__MutAssignment_2_0 )? ) ;
    public final void rule__LocalVarDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7960:1: ( ( ( rule__LocalVarDecl__MutAssignment_2_0 )? ) )
            // InternalFortXTrans.g:7961:1: ( ( rule__LocalVarDecl__MutAssignment_2_0 )? )
            {
            // InternalFortXTrans.g:7961:1: ( ( rule__LocalVarDecl__MutAssignment_2_0 )? )
            // InternalFortXTrans.g:7962:2: ( rule__LocalVarDecl__MutAssignment_2_0 )?
            {
             before(grammarAccess.getLocalVarDeclAccess().getMutAssignment_2_0()); 
            // InternalFortXTrans.g:7963:2: ( rule__LocalVarDecl__MutAssignment_2_0 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==51) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalFortXTrans.g:7963:3: rule__LocalVarDecl__MutAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocalVarDecl__MutAssignment_2_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLocalVarDeclAccess().getMutAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2__0__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2__1"
    // InternalFortXTrans.g:7971:1: rule__LocalVarDecl__Group_2__1 : rule__LocalVarDecl__Group_2__1__Impl rule__LocalVarDecl__Group_2__2 ;
    public final void rule__LocalVarDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7975:1: ( rule__LocalVarDecl__Group_2__1__Impl rule__LocalVarDecl__Group_2__2 )
            // InternalFortXTrans.g:7976:2: rule__LocalVarDecl__Group_2__1__Impl rule__LocalVarDecl__Group_2__2
            {
            pushFollow(FOLLOW_26);
            rule__LocalVarDecl__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2__1"


    // $ANTLR start "rule__LocalVarDecl__Group_2__1__Impl"
    // InternalFortXTrans.g:7983:1: rule__LocalVarDecl__Group_2__1__Impl : ( ( rule__LocalVarDecl__IdtupAssignment_2_1 ) ) ;
    public final void rule__LocalVarDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:7987:1: ( ( ( rule__LocalVarDecl__IdtupAssignment_2_1 ) ) )
            // InternalFortXTrans.g:7988:1: ( ( rule__LocalVarDecl__IdtupAssignment_2_1 ) )
            {
            // InternalFortXTrans.g:7988:1: ( ( rule__LocalVarDecl__IdtupAssignment_2_1 ) )
            // InternalFortXTrans.g:7989:2: ( rule__LocalVarDecl__IdtupAssignment_2_1 )
            {
             before(grammarAccess.getLocalVarDeclAccess().getIdtupAssignment_2_1()); 
            // InternalFortXTrans.g:7990:2: ( rule__LocalVarDecl__IdtupAssignment_2_1 )
            // InternalFortXTrans.g:7990:3: rule__LocalVarDecl__IdtupAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__IdtupAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalVarDeclAccess().getIdtupAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2__1__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2__2"
    // InternalFortXTrans.g:7998:1: rule__LocalVarDecl__Group_2__2 : rule__LocalVarDecl__Group_2__2__Impl rule__LocalVarDecl__Group_2__3 ;
    public final void rule__LocalVarDecl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8002:1: ( rule__LocalVarDecl__Group_2__2__Impl rule__LocalVarDecl__Group_2__3 )
            // InternalFortXTrans.g:8003:2: rule__LocalVarDecl__Group_2__2__Impl rule__LocalVarDecl__Group_2__3
            {
            pushFollow(FOLLOW_5);
            rule__LocalVarDecl__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2__2"


    // $ANTLR start "rule__LocalVarDecl__Group_2__2__Impl"
    // InternalFortXTrans.g:8010:1: rule__LocalVarDecl__Group_2__2__Impl : ( ':' ) ;
    public final void rule__LocalVarDecl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8014:1: ( ( ':' ) )
            // InternalFortXTrans.g:8015:1: ( ':' )
            {
            // InternalFortXTrans.g:8015:1: ( ':' )
            // InternalFortXTrans.g:8016:2: ':'
            {
             before(grammarAccess.getLocalVarDeclAccess().getColonKeyword_2_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLocalVarDeclAccess().getColonKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2__2__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2__3"
    // InternalFortXTrans.g:8025:1: rule__LocalVarDecl__Group_2__3 : rule__LocalVarDecl__Group_2__3__Impl rule__LocalVarDecl__Group_2__4 ;
    public final void rule__LocalVarDecl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8029:1: ( rule__LocalVarDecl__Group_2__3__Impl rule__LocalVarDecl__Group_2__4 )
            // InternalFortXTrans.g:8030:2: rule__LocalVarDecl__Group_2__3__Impl rule__LocalVarDecl__Group_2__4
            {
            pushFollow(FOLLOW_17);
            rule__LocalVarDecl__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2__3"


    // $ANTLR start "rule__LocalVarDecl__Group_2__3__Impl"
    // InternalFortXTrans.g:8037:1: rule__LocalVarDecl__Group_2__3__Impl : ( ( rule__LocalVarDecl__TypeAssignment_2_3 ) ) ;
    public final void rule__LocalVarDecl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8041:1: ( ( ( rule__LocalVarDecl__TypeAssignment_2_3 ) ) )
            // InternalFortXTrans.g:8042:1: ( ( rule__LocalVarDecl__TypeAssignment_2_3 ) )
            {
            // InternalFortXTrans.g:8042:1: ( ( rule__LocalVarDecl__TypeAssignment_2_3 ) )
            // InternalFortXTrans.g:8043:2: ( rule__LocalVarDecl__TypeAssignment_2_3 )
            {
             before(grammarAccess.getLocalVarDeclAccess().getTypeAssignment_2_3()); 
            // InternalFortXTrans.g:8044:2: ( rule__LocalVarDecl__TypeAssignment_2_3 )
            // InternalFortXTrans.g:8044:3: rule__LocalVarDecl__TypeAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__TypeAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getLocalVarDeclAccess().getTypeAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2__3__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2__4"
    // InternalFortXTrans.g:8052:1: rule__LocalVarDecl__Group_2__4 : rule__LocalVarDecl__Group_2__4__Impl rule__LocalVarDecl__Group_2__5 ;
    public final void rule__LocalVarDecl__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8056:1: ( rule__LocalVarDecl__Group_2__4__Impl rule__LocalVarDecl__Group_2__5 )
            // InternalFortXTrans.g:8057:2: rule__LocalVarDecl__Group_2__4__Impl rule__LocalVarDecl__Group_2__5
            {
            pushFollow(FOLLOW_48);
            rule__LocalVarDecl__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2__4"


    // $ANTLR start "rule__LocalVarDecl__Group_2__4__Impl"
    // InternalFortXTrans.g:8064:1: rule__LocalVarDecl__Group_2__4__Impl : ( RULE_DOTS ) ;
    public final void rule__LocalVarDecl__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8068:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:8069:1: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:8069:1: ( RULE_DOTS )
            // InternalFortXTrans.g:8070:2: RULE_DOTS
            {
             before(grammarAccess.getLocalVarDeclAccess().getDOTSTerminalRuleCall_2_4()); 
            match(input,RULE_DOTS,FOLLOW_2); 
             after(grammarAccess.getLocalVarDeclAccess().getDOTSTerminalRuleCall_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2__4__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_2__5"
    // InternalFortXTrans.g:8079:1: rule__LocalVarDecl__Group_2__5 : rule__LocalVarDecl__Group_2__5__Impl ;
    public final void rule__LocalVarDecl__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8083:1: ( rule__LocalVarDecl__Group_2__5__Impl )
            // InternalFortXTrans.g:8084:2: rule__LocalVarDecl__Group_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2__5"


    // $ANTLR start "rule__LocalVarDecl__Group_2__5__Impl"
    // InternalFortXTrans.g:8090:1: rule__LocalVarDecl__Group_2__5__Impl : ( ( rule__LocalVarDecl__InitAssignment_2_5 ) ) ;
    public final void rule__LocalVarDecl__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8094:1: ( ( ( rule__LocalVarDecl__InitAssignment_2_5 ) ) )
            // InternalFortXTrans.g:8095:1: ( ( rule__LocalVarDecl__InitAssignment_2_5 ) )
            {
            // InternalFortXTrans.g:8095:1: ( ( rule__LocalVarDecl__InitAssignment_2_5 ) )
            // InternalFortXTrans.g:8096:2: ( rule__LocalVarDecl__InitAssignment_2_5 )
            {
             before(grammarAccess.getLocalVarDeclAccess().getInitAssignment_2_5()); 
            // InternalFortXTrans.g:8097:2: ( rule__LocalVarDecl__InitAssignment_2_5 )
            // InternalFortXTrans.g:8097:3: rule__LocalVarDecl__InitAssignment_2_5
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__InitAssignment_2_5();

            state._fsp--;


            }

             after(grammarAccess.getLocalVarDeclAccess().getInitAssignment_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_2__5__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_3__0"
    // InternalFortXTrans.g:8106:1: rule__LocalVarDecl__Group_3__0 : rule__LocalVarDecl__Group_3__0__Impl rule__LocalVarDecl__Group_3__1 ;
    public final void rule__LocalVarDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8110:1: ( rule__LocalVarDecl__Group_3__0__Impl rule__LocalVarDecl__Group_3__1 )
            // InternalFortXTrans.g:8111:2: rule__LocalVarDecl__Group_3__0__Impl rule__LocalVarDecl__Group_3__1
            {
            pushFollow(FOLLOW_33);
            rule__LocalVarDecl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_3__0"


    // $ANTLR start "rule__LocalVarDecl__Group_3__0__Impl"
    // InternalFortXTrans.g:8118:1: rule__LocalVarDecl__Group_3__0__Impl : ( ( rule__LocalVarDecl__MutAssignment_3_0 )? ) ;
    public final void rule__LocalVarDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8122:1: ( ( ( rule__LocalVarDecl__MutAssignment_3_0 )? ) )
            // InternalFortXTrans.g:8123:1: ( ( rule__LocalVarDecl__MutAssignment_3_0 )? )
            {
            // InternalFortXTrans.g:8123:1: ( ( rule__LocalVarDecl__MutAssignment_3_0 )? )
            // InternalFortXTrans.g:8124:2: ( rule__LocalVarDecl__MutAssignment_3_0 )?
            {
             before(grammarAccess.getLocalVarDeclAccess().getMutAssignment_3_0()); 
            // InternalFortXTrans.g:8125:2: ( rule__LocalVarDecl__MutAssignment_3_0 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==51) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalFortXTrans.g:8125:3: rule__LocalVarDecl__MutAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocalVarDecl__MutAssignment_3_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLocalVarDeclAccess().getMutAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_3__0__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_3__1"
    // InternalFortXTrans.g:8133:1: rule__LocalVarDecl__Group_3__1 : rule__LocalVarDecl__Group_3__1__Impl rule__LocalVarDecl__Group_3__2 ;
    public final void rule__LocalVarDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8137:1: ( rule__LocalVarDecl__Group_3__1__Impl rule__LocalVarDecl__Group_3__2 )
            // InternalFortXTrans.g:8138:2: rule__LocalVarDecl__Group_3__1__Impl rule__LocalVarDecl__Group_3__2
            {
            pushFollow(FOLLOW_26);
            rule__LocalVarDecl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_3__1"


    // $ANTLR start "rule__LocalVarDecl__Group_3__1__Impl"
    // InternalFortXTrans.g:8145:1: rule__LocalVarDecl__Group_3__1__Impl : ( ( rule__LocalVarDecl__IdtupAssignment_3_1 ) ) ;
    public final void rule__LocalVarDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8149:1: ( ( ( rule__LocalVarDecl__IdtupAssignment_3_1 ) ) )
            // InternalFortXTrans.g:8150:1: ( ( rule__LocalVarDecl__IdtupAssignment_3_1 ) )
            {
            // InternalFortXTrans.g:8150:1: ( ( rule__LocalVarDecl__IdtupAssignment_3_1 ) )
            // InternalFortXTrans.g:8151:2: ( rule__LocalVarDecl__IdtupAssignment_3_1 )
            {
             before(grammarAccess.getLocalVarDeclAccess().getIdtupAssignment_3_1()); 
            // InternalFortXTrans.g:8152:2: ( rule__LocalVarDecl__IdtupAssignment_3_1 )
            // InternalFortXTrans.g:8152:3: rule__LocalVarDecl__IdtupAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__IdtupAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalVarDeclAccess().getIdtupAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_3__1__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_3__2"
    // InternalFortXTrans.g:8160:1: rule__LocalVarDecl__Group_3__2 : rule__LocalVarDecl__Group_3__2__Impl rule__LocalVarDecl__Group_3__3 ;
    public final void rule__LocalVarDecl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8164:1: ( rule__LocalVarDecl__Group_3__2__Impl rule__LocalVarDecl__Group_3__3 )
            // InternalFortXTrans.g:8165:2: rule__LocalVarDecl__Group_3__2__Impl rule__LocalVarDecl__Group_3__3
            {
            pushFollow(FOLLOW_27);
            rule__LocalVarDecl__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_3__2"


    // $ANTLR start "rule__LocalVarDecl__Group_3__2__Impl"
    // InternalFortXTrans.g:8172:1: rule__LocalVarDecl__Group_3__2__Impl : ( ':' ) ;
    public final void rule__LocalVarDecl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8176:1: ( ( ':' ) )
            // InternalFortXTrans.g:8177:1: ( ':' )
            {
            // InternalFortXTrans.g:8177:1: ( ':' )
            // InternalFortXTrans.g:8178:2: ':'
            {
             before(grammarAccess.getLocalVarDeclAccess().getColonKeyword_3_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLocalVarDeclAccess().getColonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_3__2__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_3__3"
    // InternalFortXTrans.g:8187:1: rule__LocalVarDecl__Group_3__3 : rule__LocalVarDecl__Group_3__3__Impl rule__LocalVarDecl__Group_3__4 ;
    public final void rule__LocalVarDecl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8191:1: ( rule__LocalVarDecl__Group_3__3__Impl rule__LocalVarDecl__Group_3__4 )
            // InternalFortXTrans.g:8192:2: rule__LocalVarDecl__Group_3__3__Impl rule__LocalVarDecl__Group_3__4
            {
            pushFollow(FOLLOW_48);
            rule__LocalVarDecl__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_3__3"


    // $ANTLR start "rule__LocalVarDecl__Group_3__3__Impl"
    // InternalFortXTrans.g:8199:1: rule__LocalVarDecl__Group_3__3__Impl : ( ( rule__LocalVarDecl__TuptypeAssignment_3_3 ) ) ;
    public final void rule__LocalVarDecl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8203:1: ( ( ( rule__LocalVarDecl__TuptypeAssignment_3_3 ) ) )
            // InternalFortXTrans.g:8204:1: ( ( rule__LocalVarDecl__TuptypeAssignment_3_3 ) )
            {
            // InternalFortXTrans.g:8204:1: ( ( rule__LocalVarDecl__TuptypeAssignment_3_3 ) )
            // InternalFortXTrans.g:8205:2: ( rule__LocalVarDecl__TuptypeAssignment_3_3 )
            {
             before(grammarAccess.getLocalVarDeclAccess().getTuptypeAssignment_3_3()); 
            // InternalFortXTrans.g:8206:2: ( rule__LocalVarDecl__TuptypeAssignment_3_3 )
            // InternalFortXTrans.g:8206:3: rule__LocalVarDecl__TuptypeAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__TuptypeAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getLocalVarDeclAccess().getTuptypeAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_3__3__Impl"


    // $ANTLR start "rule__LocalVarDecl__Group_3__4"
    // InternalFortXTrans.g:8214:1: rule__LocalVarDecl__Group_3__4 : rule__LocalVarDecl__Group_3__4__Impl ;
    public final void rule__LocalVarDecl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8218:1: ( rule__LocalVarDecl__Group_3__4__Impl )
            // InternalFortXTrans.g:8219:2: rule__LocalVarDecl__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_3__4"


    // $ANTLR start "rule__LocalVarDecl__Group_3__4__Impl"
    // InternalFortXTrans.g:8225:1: rule__LocalVarDecl__Group_3__4__Impl : ( ( rule__LocalVarDecl__InitAssignment_3_4 ) ) ;
    public final void rule__LocalVarDecl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8229:1: ( ( ( rule__LocalVarDecl__InitAssignment_3_4 ) ) )
            // InternalFortXTrans.g:8230:1: ( ( rule__LocalVarDecl__InitAssignment_3_4 ) )
            {
            // InternalFortXTrans.g:8230:1: ( ( rule__LocalVarDecl__InitAssignment_3_4 ) )
            // InternalFortXTrans.g:8231:2: ( rule__LocalVarDecl__InitAssignment_3_4 )
            {
             before(grammarAccess.getLocalVarDeclAccess().getInitAssignment_3_4()); 
            // InternalFortXTrans.g:8232:2: ( rule__LocalVarDecl__InitAssignment_3_4 )
            // InternalFortXTrans.g:8232:3: rule__LocalVarDecl__InitAssignment_3_4
            {
            pushFollow(FOLLOW_2);
            rule__LocalVarDecl__InitAssignment_3_4();

            state._fsp--;


            }

             after(grammarAccess.getLocalVarDeclAccess().getInitAssignment_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__Group_3__4__Impl"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalFortXTrans.g:8241:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8245:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:8246:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:8246:2: ( RULE_ID )
            // InternalFortXTrans.g:8247:3: RULE_ID
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
    // InternalFortXTrans.g:8256:1: rule__Component__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Component__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8260:1: ( ( ruleImport ) )
            // InternalFortXTrans.g:8261:2: ( ruleImport )
            {
            // InternalFortXTrans.g:8261:2: ( ruleImport )
            // InternalFortXTrans.g:8262:3: ruleImport
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
    // InternalFortXTrans.g:8271:1: rule__Component__ExportsAssignment_3 : ( ruleExport ) ;
    public final void rule__Component__ExportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8275:1: ( ( ruleExport ) )
            // InternalFortXTrans.g:8276:2: ( ruleExport )
            {
            // InternalFortXTrans.g:8276:2: ( ruleExport )
            // InternalFortXTrans.g:8277:3: ruleExport
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
    // InternalFortXTrans.g:8286:1: rule__Component__DeclsAssignment_4 : ( ruleDecls ) ;
    public final void rule__Component__DeclsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8290:1: ( ( ruleDecls ) )
            // InternalFortXTrans.g:8291:2: ( ruleDecls )
            {
            // InternalFortXTrans.g:8291:2: ( ruleDecls )
            // InternalFortXTrans.g:8292:3: ruleDecls
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
    // InternalFortXTrans.g:8301:1: rule__API__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__API__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8305:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:8306:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:8306:2: ( RULE_ID )
            // InternalFortXTrans.g:8307:3: RULE_ID
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
    // InternalFortXTrans.g:8316:1: rule__API__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__API__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8320:1: ( ( ruleImport ) )
            // InternalFortXTrans.g:8321:2: ( ruleImport )
            {
            // InternalFortXTrans.g:8321:2: ( ruleImport )
            // InternalFortXTrans.g:8322:3: ruleImport
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
    // InternalFortXTrans.g:8331:1: rule__Import__ImpsAssignment_0_0 : ( ( 'import' ) ) ;
    public final void rule__Import__ImpsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8335:1: ( ( ( 'import' ) ) )
            // InternalFortXTrans.g:8336:2: ( ( 'import' ) )
            {
            // InternalFortXTrans.g:8336:2: ( ( 'import' ) )
            // InternalFortXTrans.g:8337:3: ( 'import' )
            {
             before(grammarAccess.getImportAccess().getImpsImportKeyword_0_0_0()); 
            // InternalFortXTrans.g:8338:3: ( 'import' )
            // InternalFortXTrans.g:8339:4: 'import'
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
    // InternalFortXTrans.g:8350:1: rule__Import__ImportedNamesAssignment_0_1 : ( ruleImportedNames ) ;
    public final void rule__Import__ImportedNamesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8354:1: ( ( ruleImportedNames ) )
            // InternalFortXTrans.g:8355:2: ( ruleImportedNames )
            {
            // InternalFortXTrans.g:8355:2: ( ruleImportedNames )
            // InternalFortXTrans.g:8356:3: ruleImportedNames
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
    // InternalFortXTrans.g:8365:1: rule__Import__ImpsAssignment_1_0 : ( ( 'import' ) ) ;
    public final void rule__Import__ImpsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8369:1: ( ( ( 'import' ) ) )
            // InternalFortXTrans.g:8370:2: ( ( 'import' ) )
            {
            // InternalFortXTrans.g:8370:2: ( ( 'import' ) )
            // InternalFortXTrans.g:8371:3: ( 'import' )
            {
             before(grammarAccess.getImportAccess().getImpsImportKeyword_1_0_0()); 
            // InternalFortXTrans.g:8372:3: ( 'import' )
            // InternalFortXTrans.g:8373:4: 'import'
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
    // InternalFortXTrans.g:8384:1: rule__Import__ApiAssignment_1_1 : ( ( 'api' ) ) ;
    public final void rule__Import__ApiAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8388:1: ( ( ( 'api' ) ) )
            // InternalFortXTrans.g:8389:2: ( ( 'api' ) )
            {
            // InternalFortXTrans.g:8389:2: ( ( 'api' ) )
            // InternalFortXTrans.g:8390:3: ( 'api' )
            {
             before(grammarAccess.getImportAccess().getApiApiKeyword_1_1_0()); 
            // InternalFortXTrans.g:8391:3: ( 'api' )
            // InternalFortXTrans.g:8392:4: 'api'
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
    // InternalFortXTrans.g:8403:1: rule__Import__AliasedimportedNamesAssignment_1_2 : ( ruleAliasedAPINames ) ;
    public final void rule__Import__AliasedimportedNamesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8407:1: ( ( ruleAliasedAPINames ) )
            // InternalFortXTrans.g:8408:2: ( ruleAliasedAPINames )
            {
            // InternalFortXTrans.g:8408:2: ( ruleAliasedAPINames )
            // InternalFortXTrans.g:8409:3: ruleAliasedAPINames
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
    // InternalFortXTrans.g:8418:1: rule__Export__ExpAssignment_0_0 : ( ( 'export' ) ) ;
    public final void rule__Export__ExpAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8422:1: ( ( ( 'export' ) ) )
            // InternalFortXTrans.g:8423:2: ( ( 'export' ) )
            {
            // InternalFortXTrans.g:8423:2: ( ( 'export' ) )
            // InternalFortXTrans.g:8424:3: ( 'export' )
            {
             before(grammarAccess.getExportAccess().getExpExportKeyword_0_0_0()); 
            // InternalFortXTrans.g:8425:3: ( 'export' )
            // InternalFortXTrans.g:8426:4: 'export'
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
    // InternalFortXTrans.g:8437:1: rule__Export__ExportedNameAssignment_0_1 : ( ruleAPIName ) ;
    public final void rule__Export__ExportedNameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8441:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:8442:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:8442:2: ( ruleAPIName )
            // InternalFortXTrans.g:8443:3: ruleAPIName
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
    // InternalFortXTrans.g:8452:1: rule__Export__ExpAssignment_1_0 : ( ( 'export' ) ) ;
    public final void rule__Export__ExpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8456:1: ( ( ( 'export' ) ) )
            // InternalFortXTrans.g:8457:2: ( ( 'export' ) )
            {
            // InternalFortXTrans.g:8457:2: ( ( 'export' ) )
            // InternalFortXTrans.g:8458:3: ( 'export' )
            {
             before(grammarAccess.getExportAccess().getExpExportKeyword_1_0_0()); 
            // InternalFortXTrans.g:8459:3: ( 'export' )
            // InternalFortXTrans.g:8460:4: 'export'
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
    // InternalFortXTrans.g:8471:1: rule__Export__BrackAssignment_1_1 : ( ( '{' ) ) ;
    public final void rule__Export__BrackAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8475:1: ( ( ( '{' ) ) )
            // InternalFortXTrans.g:8476:2: ( ( '{' ) )
            {
            // InternalFortXTrans.g:8476:2: ( ( '{' ) )
            // InternalFortXTrans.g:8477:3: ( '{' )
            {
             before(grammarAccess.getExportAccess().getBrackLeftCurlyBracketKeyword_1_1_0()); 
            // InternalFortXTrans.g:8478:3: ( '{' )
            // InternalFortXTrans.g:8479:4: '{'
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
    // InternalFortXTrans.g:8490:1: rule__Export__ExportedNameAssignment_1_2 : ( ruleAPIName ) ;
    public final void rule__Export__ExportedNameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8494:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:8495:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:8495:2: ( ruleAPIName )
            // InternalFortXTrans.g:8496:3: ruleAPIName
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
    // InternalFortXTrans.g:8505:1: rule__Export__ExportedNameAssignment_1_3_1 : ( ruleAPIName ) ;
    public final void rule__Export__ExportedNameAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8509:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:8510:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:8510:2: ( ruleAPIName )
            // InternalFortXTrans.g:8511:3: ruleAPIName
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
    // InternalFortXTrans.g:8520:1: rule__ImportedNames__ImpnameAssignment_0_0 : ( ruleAPIName ) ;
    public final void rule__ImportedNames__ImpnameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8524:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:8525:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:8525:2: ( ruleAPIName )
            // InternalFortXTrans.g:8526:3: ruleAPIName
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
    // InternalFortXTrans.g:8535:1: rule__ImportedNames__ExceptAssignment_0_5_0 : ( ( 'except' ) ) ;
    public final void rule__ImportedNames__ExceptAssignment_0_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8539:1: ( ( ( 'except' ) ) )
            // InternalFortXTrans.g:8540:2: ( ( 'except' ) )
            {
            // InternalFortXTrans.g:8540:2: ( ( 'except' ) )
            // InternalFortXTrans.g:8541:3: ( 'except' )
            {
             before(grammarAccess.getImportedNamesAccess().getExceptExceptKeyword_0_5_0_0()); 
            // InternalFortXTrans.g:8542:3: ( 'except' )
            // InternalFortXTrans.g:8543:4: 'except'
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
    // InternalFortXTrans.g:8554:1: rule__ImportedNames__SimpAssignment_0_5_1 : ( ruleSimpleNames ) ;
    public final void rule__ImportedNames__SimpAssignment_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8558:1: ( ( ruleSimpleNames ) )
            // InternalFortXTrans.g:8559:2: ( ruleSimpleNames )
            {
            // InternalFortXTrans.g:8559:2: ( ruleSimpleNames )
            // InternalFortXTrans.g:8560:3: ruleSimpleNames
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
    // InternalFortXTrans.g:8569:1: rule__ImportedNames__ImpnameAssignment_1_0 : ( ruleAPIName ) ;
    public final void rule__ImportedNames__ImpnameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8573:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:8574:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:8574:2: ( ruleAPIName )
            // InternalFortXTrans.g:8575:3: ruleAPIName
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
    // InternalFortXTrans.g:8584:1: rule__ImportedNames__SimpListAssignment_1_3 : ( ruleAliasedSimpleName ) ;
    public final void rule__ImportedNames__SimpListAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8588:1: ( ( ruleAliasedSimpleName ) )
            // InternalFortXTrans.g:8589:2: ( ruleAliasedSimpleName )
            {
            // InternalFortXTrans.g:8589:2: ( ruleAliasedSimpleName )
            // InternalFortXTrans.g:8590:3: ruleAliasedSimpleName
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
    // InternalFortXTrans.g:8599:1: rule__ImportedNames__SimpListAssignment_1_4_1 : ( ruleAliasedSimpleName ) ;
    public final void rule__ImportedNames__SimpListAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8603:1: ( ( ruleAliasedSimpleName ) )
            // InternalFortXTrans.g:8604:2: ( ruleAliasedSimpleName )
            {
            // InternalFortXTrans.g:8604:2: ( ruleAliasedSimpleName )
            // InternalFortXTrans.g:8605:3: ruleAliasedSimpleName
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
    // InternalFortXTrans.g:8614:1: rule__ImportedNames__CommaAssignment_1_5_0 : ( ( ',' ) ) ;
    public final void rule__ImportedNames__CommaAssignment_1_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8618:1: ( ( ( ',' ) ) )
            // InternalFortXTrans.g:8619:2: ( ( ',' ) )
            {
            // InternalFortXTrans.g:8619:2: ( ( ',' ) )
            // InternalFortXTrans.g:8620:3: ( ',' )
            {
             before(grammarAccess.getImportedNamesAccess().getCommaCommaKeyword_1_5_0_0()); 
            // InternalFortXTrans.g:8621:3: ( ',' )
            // InternalFortXTrans.g:8622:4: ','
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
    // InternalFortXTrans.g:8633:1: rule__ImportedNames__DotsAssignment_1_5_1 : ( RULE_DOTS ) ;
    public final void rule__ImportedNames__DotsAssignment_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8637:1: ( ( RULE_DOTS ) )
            // InternalFortXTrans.g:8638:2: ( RULE_DOTS )
            {
            // InternalFortXTrans.g:8638:2: ( RULE_DOTS )
            // InternalFortXTrans.g:8639:3: RULE_DOTS
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
    // InternalFortXTrans.g:8648:1: rule__ImportedNames__ImpnameAssignment_2_0 : ( ruleAPIName ) ;
    public final void rule__ImportedNames__ImpnameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8652:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:8653:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:8653:2: ( ruleAPIName )
            // InternalFortXTrans.g:8654:3: ruleAPIName
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
    // InternalFortXTrans.g:8663:1: rule__ImportedNames__AsnameAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__ImportedNames__AsnameAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8667:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:8668:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:8668:2: ( RULE_ID )
            // InternalFortXTrans.g:8669:3: RULE_ID
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
    // InternalFortXTrans.g:8678:1: rule__SimpleNames__NameListAssignment_0 : ( ruleSimpleName ) ;
    public final void rule__SimpleNames__NameListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8682:1: ( ( ruleSimpleName ) )
            // InternalFortXTrans.g:8683:2: ( ruleSimpleName )
            {
            // InternalFortXTrans.g:8683:2: ( ruleSimpleName )
            // InternalFortXTrans.g:8684:3: ruleSimpleName
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
    // InternalFortXTrans.g:8693:1: rule__SimpleNames__BrackAssignment_1_0 : ( ( '{' ) ) ;
    public final void rule__SimpleNames__BrackAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8697:1: ( ( ( '{' ) ) )
            // InternalFortXTrans.g:8698:2: ( ( '{' ) )
            {
            // InternalFortXTrans.g:8698:2: ( ( '{' ) )
            // InternalFortXTrans.g:8699:3: ( '{' )
            {
             before(grammarAccess.getSimpleNamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0()); 
            // InternalFortXTrans.g:8700:3: ( '{' )
            // InternalFortXTrans.g:8701:4: '{'
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
    // InternalFortXTrans.g:8712:1: rule__SimpleNames__NameListAssignment_1_1 : ( ruleSimpleName ) ;
    public final void rule__SimpleNames__NameListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8716:1: ( ( ruleSimpleName ) )
            // InternalFortXTrans.g:8717:2: ( ruleSimpleName )
            {
            // InternalFortXTrans.g:8717:2: ( ruleSimpleName )
            // InternalFortXTrans.g:8718:3: ruleSimpleName
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
    // InternalFortXTrans.g:8727:1: rule__SimpleNames__NameListAssignment_1_2_1 : ( ruleSimpleName ) ;
    public final void rule__SimpleNames__NameListAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8731:1: ( ( ruleSimpleName ) )
            // InternalFortXTrans.g:8732:2: ( ruleSimpleName )
            {
            // InternalFortXTrans.g:8732:2: ( ruleSimpleName )
            // InternalFortXTrans.g:8733:3: ruleSimpleName
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
    // InternalFortXTrans.g:8742:1: rule__SimpleName__NameAssignment : ( RULE_ID ) ;
    public final void rule__SimpleName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8746:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:8747:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:8747:2: ( RULE_ID )
            // InternalFortXTrans.g:8748:3: RULE_ID
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
    // InternalFortXTrans.g:8757:1: rule__AliasedSimpleName__OrigAssignment_0 : ( RULE_ID ) ;
    public final void rule__AliasedSimpleName__OrigAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8761:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:8762:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:8762:2: ( RULE_ID )
            // InternalFortXTrans.g:8763:3: RULE_ID
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
    // InternalFortXTrans.g:8772:1: rule__AliasedSimpleName__AsNameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__AliasedSimpleName__AsNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8776:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:8777:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:8777:2: ( RULE_ID )
            // InternalFortXTrans.g:8778:3: RULE_ID
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
    // InternalFortXTrans.g:8787:1: rule__AliasedAPINames__NameListAssignment_0 : ( ruleAliasedAPIName ) ;
    public final void rule__AliasedAPINames__NameListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8791:1: ( ( ruleAliasedAPIName ) )
            // InternalFortXTrans.g:8792:2: ( ruleAliasedAPIName )
            {
            // InternalFortXTrans.g:8792:2: ( ruleAliasedAPIName )
            // InternalFortXTrans.g:8793:3: ruleAliasedAPIName
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
    // InternalFortXTrans.g:8802:1: rule__AliasedAPINames__BrackAssignment_1_0 : ( ( '{' ) ) ;
    public final void rule__AliasedAPINames__BrackAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8806:1: ( ( ( '{' ) ) )
            // InternalFortXTrans.g:8807:2: ( ( '{' ) )
            {
            // InternalFortXTrans.g:8807:2: ( ( '{' ) )
            // InternalFortXTrans.g:8808:3: ( '{' )
            {
             before(grammarAccess.getAliasedAPINamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0()); 
            // InternalFortXTrans.g:8809:3: ( '{' )
            // InternalFortXTrans.g:8810:4: '{'
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
    // InternalFortXTrans.g:8821:1: rule__AliasedAPINames__NameListAssignment_1_1 : ( ruleAliasedAPIName ) ;
    public final void rule__AliasedAPINames__NameListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8825:1: ( ( ruleAliasedAPIName ) )
            // InternalFortXTrans.g:8826:2: ( ruleAliasedAPIName )
            {
            // InternalFortXTrans.g:8826:2: ( ruleAliasedAPIName )
            // InternalFortXTrans.g:8827:3: ruleAliasedAPIName
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
    // InternalFortXTrans.g:8836:1: rule__AliasedAPINames__NameListAssignment_1_2_1 : ( ruleAliasedAPIName ) ;
    public final void rule__AliasedAPINames__NameListAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8840:1: ( ( ruleAliasedAPIName ) )
            // InternalFortXTrans.g:8841:2: ( ruleAliasedAPIName )
            {
            // InternalFortXTrans.g:8841:2: ( ruleAliasedAPIName )
            // InternalFortXTrans.g:8842:3: ruleAliasedAPIName
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
    // InternalFortXTrans.g:8851:1: rule__AliasedAPIName__OrigAssignment_0 : ( ruleAPIName ) ;
    public final void rule__AliasedAPIName__OrigAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8855:1: ( ( ruleAPIName ) )
            // InternalFortXTrans.g:8856:2: ( ruleAPIName )
            {
            // InternalFortXTrans.g:8856:2: ( ruleAPIName )
            // InternalFortXTrans.g:8857:3: ruleAPIName
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
    // InternalFortXTrans.g:8866:1: rule__AliasedAPIName__AsNameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__AliasedAPIName__AsNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8870:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:8871:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:8871:2: ( RULE_ID )
            // InternalFortXTrans.g:8872:3: RULE_ID
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
    // InternalFortXTrans.g:8881:1: rule__Decls__DeclsAssignment : ( ruleDecl ) ;
    public final void rule__Decls__DeclsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8885:1: ( ( ruleDecl ) )
            // InternalFortXTrans.g:8886:2: ( ruleDecl )
            {
            // InternalFortXTrans.g:8886:2: ( ruleDecl )
            // InternalFortXTrans.g:8887:3: ruleDecl
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
    // InternalFortXTrans.g:8896:1: rule__Decl__FunctionAssignment_0 : ( ruleFnDecl ) ;
    public final void rule__Decl__FunctionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8900:1: ( ( ruleFnDecl ) )
            // InternalFortXTrans.g:8901:2: ( ruleFnDecl )
            {
            // InternalFortXTrans.g:8901:2: ( ruleFnDecl )
            // InternalFortXTrans.g:8902:3: ruleFnDecl
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
    // InternalFortXTrans.g:8911:1: rule__Decl__FieldAssignment_1 : ( ruleFieldDecl ) ;
    public final void rule__Decl__FieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8915:1: ( ( ruleFieldDecl ) )
            // InternalFortXTrans.g:8916:2: ( ruleFieldDecl )
            {
            // InternalFortXTrans.g:8916:2: ( ruleFieldDecl )
            // InternalFortXTrans.g:8917:3: ruleFieldDecl
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
    // InternalFortXTrans.g:8926:1: rule__FnMods__ModsAssignment : ( ruleFnMod ) ;
    public final void rule__FnMods__ModsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8930:1: ( ( ruleFnMod ) )
            // InternalFortXTrans.g:8931:2: ( ruleFnMod )
            {
            // InternalFortXTrans.g:8931:2: ( ruleFnMod )
            // InternalFortXTrans.g:8932:3: ruleFnMod
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
    // InternalFortXTrans.g:8941:1: rule__FnMod__ModtypeAssignment_0 : ( ( 'private' ) ) ;
    public final void rule__FnMod__ModtypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8945:1: ( ( ( 'private' ) ) )
            // InternalFortXTrans.g:8946:2: ( ( 'private' ) )
            {
            // InternalFortXTrans.g:8946:2: ( ( 'private' ) )
            // InternalFortXTrans.g:8947:3: ( 'private' )
            {
             before(grammarAccess.getFnModAccess().getModtypePrivateKeyword_0_0()); 
            // InternalFortXTrans.g:8948:3: ( 'private' )
            // InternalFortXTrans.g:8949:4: 'private'
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
    // InternalFortXTrans.g:8960:1: rule__FnMod__ModtypeAssignment_1 : ( ( 'test' ) ) ;
    public final void rule__FnMod__ModtypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8964:1: ( ( ( 'test' ) ) )
            // InternalFortXTrans.g:8965:2: ( ( 'test' ) )
            {
            // InternalFortXTrans.g:8965:2: ( ( 'test' ) )
            // InternalFortXTrans.g:8966:3: ( 'test' )
            {
             before(grammarAccess.getFnModAccess().getModtypeTestKeyword_1_0()); 
            // InternalFortXTrans.g:8967:3: ( 'test' )
            // InternalFortXTrans.g:8968:4: 'test'
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
    // InternalFortXTrans.g:8979:1: rule__FnMod__ModtypeAssignment_2 : ( ( 'atomic' ) ) ;
    public final void rule__FnMod__ModtypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:8983:1: ( ( ( 'atomic' ) ) )
            // InternalFortXTrans.g:8984:2: ( ( 'atomic' ) )
            {
            // InternalFortXTrans.g:8984:2: ( ( 'atomic' ) )
            // InternalFortXTrans.g:8985:3: ( 'atomic' )
            {
             before(grammarAccess.getFnModAccess().getModtypeAtomicKeyword_2_0()); 
            // InternalFortXTrans.g:8986:3: ( 'atomic' )
            // InternalFortXTrans.g:8987:4: 'atomic'
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
    // InternalFortXTrans.g:8998:1: rule__FnMod__ModtypeAssignment_3 : ( ( 'io' ) ) ;
    public final void rule__FnMod__ModtypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9002:1: ( ( ( 'io' ) ) )
            // InternalFortXTrans.g:9003:2: ( ( 'io' ) )
            {
            // InternalFortXTrans.g:9003:2: ( ( 'io' ) )
            // InternalFortXTrans.g:9004:3: ( 'io' )
            {
             before(grammarAccess.getFnModAccess().getModtypeIoKeyword_3_0()); 
            // InternalFortXTrans.g:9005:3: ( 'io' )
            // InternalFortXTrans.g:9006:4: 'io'
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
    // InternalFortXTrans.g:9017:1: rule__ValParam__ParamsAssignment_0 : ( ruleParam ) ;
    public final void rule__ValParam__ParamsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9021:1: ( ( ruleParam ) )
            // InternalFortXTrans.g:9022:2: ( ruleParam )
            {
            // InternalFortXTrans.g:9022:2: ( ruleParam )
            // InternalFortXTrans.g:9023:3: ruleParam
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
    // InternalFortXTrans.g:9032:1: rule__ValParam__BrackAssignment_1_0 : ( ( '(' ) ) ;
    public final void rule__ValParam__BrackAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9036:1: ( ( ( '(' ) ) )
            // InternalFortXTrans.g:9037:2: ( ( '(' ) )
            {
            // InternalFortXTrans.g:9037:2: ( ( '(' ) )
            // InternalFortXTrans.g:9038:3: ( '(' )
            {
             before(grammarAccess.getValParamAccess().getBrackLeftParenthesisKeyword_1_0_0()); 
            // InternalFortXTrans.g:9039:3: ( '(' )
            // InternalFortXTrans.g:9040:4: '('
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
    // InternalFortXTrans.g:9051:1: rule__ValParam__ParamsAssignment_1_1_0 : ( ruleParam ) ;
    public final void rule__ValParam__ParamsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9055:1: ( ( ruleParam ) )
            // InternalFortXTrans.g:9056:2: ( ruleParam )
            {
            // InternalFortXTrans.g:9056:2: ( ruleParam )
            // InternalFortXTrans.g:9057:3: ruleParam
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
    // InternalFortXTrans.g:9066:1: rule__ValParam__ParamsAssignment_1_1_1_1 : ( ruleParam ) ;
    public final void rule__ValParam__ParamsAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9070:1: ( ( ruleParam ) )
            // InternalFortXTrans.g:9071:2: ( ruleParam )
            {
            // InternalFortXTrans.g:9071:2: ( ruleParam )
            // InternalFortXTrans.g:9072:3: ruleParam
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
    // InternalFortXTrans.g:9081:1: rule__Param__BIdAssignment_0 : ( ruleBindId ) ;
    public final void rule__Param__BIdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9085:1: ( ( ruleBindId ) )
            // InternalFortXTrans.g:9086:2: ( ruleBindId )
            {
            // InternalFortXTrans.g:9086:2: ( ruleBindId )
            // InternalFortXTrans.g:9087:3: ruleBindId
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
    // InternalFortXTrans.g:9096:1: rule__Param__IstypeAssignment_1 : ( ruleIsType ) ;
    public final void rule__Param__IstypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9100:1: ( ( ruleIsType ) )
            // InternalFortXTrans.g:9101:2: ( ruleIsType )
            {
            // InternalFortXTrans.g:9101:2: ( ruleIsType )
            // InternalFortXTrans.g:9102:3: ruleIsType
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
    // InternalFortXTrans.g:9111:1: rule__RetType__EmptyAssignment_0_1 : ( ( '(' ) ) ;
    public final void rule__RetType__EmptyAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9115:1: ( ( ( '(' ) ) )
            // InternalFortXTrans.g:9116:2: ( ( '(' ) )
            {
            // InternalFortXTrans.g:9116:2: ( ( '(' ) )
            // InternalFortXTrans.g:9117:3: ( '(' )
            {
             before(grammarAccess.getRetTypeAccess().getEmptyLeftParenthesisKeyword_0_1_0()); 
            // InternalFortXTrans.g:9118:3: ( '(' )
            // InternalFortXTrans.g:9119:4: '('
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
    // InternalFortXTrans.g:9130:1: rule__RetType__TypeAssignment_1_1 : ( ruleType ) ;
    public final void rule__RetType__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9134:1: ( ( ruleType ) )
            // InternalFortXTrans.g:9135:2: ( ruleType )
            {
            // InternalFortXTrans.g:9135:2: ( ruleType )
            // InternalFortXTrans.g:9136:3: ruleType
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
    // InternalFortXTrans.g:9145:1: rule__TupleType__TypesAssignment_1 : ( ruleType ) ;
    public final void rule__TupleType__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9149:1: ( ( ruleType ) )
            // InternalFortXTrans.g:9150:2: ( ruleType )
            {
            // InternalFortXTrans.g:9150:2: ( ruleType )
            // InternalFortXTrans.g:9151:3: ruleType
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
    // InternalFortXTrans.g:9160:1: rule__TupleType__TypesAssignment_2_1 : ( ruleType ) ;
    public final void rule__TupleType__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9164:1: ( ( ruleType ) )
            // InternalFortXTrans.g:9165:2: ( ruleType )
            {
            // InternalFortXTrans.g:9165:2: ( ruleType )
            // InternalFortXTrans.g:9166:3: ruleType
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
    // InternalFortXTrans.g:9175:1: rule__Type__TnameAssignment : ( RULE_ID ) ;
    public final void rule__Type__TnameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9179:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:9180:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:9180:2: ( RULE_ID )
            // InternalFortXTrans.g:9181:3: RULE_ID
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
    // InternalFortXTrans.g:9190:1: rule__FnDecl__ModsAssignment_0 : ( ruleFnMods ) ;
    public final void rule__FnDecl__ModsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9194:1: ( ( ruleFnMods ) )
            // InternalFortXTrans.g:9195:2: ( ruleFnMods )
            {
            // InternalFortXTrans.g:9195:2: ( ruleFnMods )
            // InternalFortXTrans.g:9196:3: ruleFnMods
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
    // InternalFortXTrans.g:9205:1: rule__FnDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FnDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9209:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:9210:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:9210:2: ( RULE_ID )
            // InternalFortXTrans.g:9211:3: RULE_ID
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
    // InternalFortXTrans.g:9220:1: rule__FnDecl__ParamsAssignment_2 : ( ruleValParam ) ;
    public final void rule__FnDecl__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9224:1: ( ( ruleValParam ) )
            // InternalFortXTrans.g:9225:2: ( ruleValParam )
            {
            // InternalFortXTrans.g:9225:2: ( ruleValParam )
            // InternalFortXTrans.g:9226:3: ruleValParam
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
    // InternalFortXTrans.g:9235:1: rule__FnDecl__RetValAssignment_3 : ( ruleRetType ) ;
    public final void rule__FnDecl__RetValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9239:1: ( ( ruleRetType ) )
            // InternalFortXTrans.g:9240:2: ( ruleRetType )
            {
            // InternalFortXTrans.g:9240:2: ( ruleRetType )
            // InternalFortXTrans.g:9241:3: ruleRetType
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
    // InternalFortXTrans.g:9250:1: rule__FnDecl__BodyAssignment_4_0 : ( ( '=' ) ) ;
    public final void rule__FnDecl__BodyAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9254:1: ( ( ( '=' ) ) )
            // InternalFortXTrans.g:9255:2: ( ( '=' ) )
            {
            // InternalFortXTrans.g:9255:2: ( ( '=' ) )
            // InternalFortXTrans.g:9256:3: ( '=' )
            {
             before(grammarAccess.getFnDeclAccess().getBodyEqualsSignKeyword_4_0_0()); 
            // InternalFortXTrans.g:9257:3: ( '=' )
            // InternalFortXTrans.g:9258:4: '='
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
    // InternalFortXTrans.g:9269:1: rule__FnDecl__FnItselfAssignment_4_1 : ( ruleExpr ) ;
    public final void rule__FnDecl__FnItselfAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9273:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:9274:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:9274:2: ( ruleExpr )
            // InternalFortXTrans.g:9275:3: ruleExpr
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


    // $ANTLR start "rule__Expr__FrontAssignment_0_0"
    // InternalFortXTrans.g:9284:1: rule__Expr__FrontAssignment_0_0 : ( ruleExprFront ) ;
    public final void rule__Expr__FrontAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9288:1: ( ( ruleExprFront ) )
            // InternalFortXTrans.g:9289:2: ( ruleExprFront )
            {
            // InternalFortXTrans.g:9289:2: ( ruleExprFront )
            // InternalFortXTrans.g:9290:3: ruleExprFront
            {
             before(grammarAccess.getExprAccess().getFrontExprFrontParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExprFront();

            state._fsp--;

             after(grammarAccess.getExprAccess().getFrontExprFrontParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__FrontAssignment_0_0"


    // $ANTLR start "rule__Expr__TailsAssignment_0_1"
    // InternalFortXTrans.g:9299:1: rule__Expr__TailsAssignment_0_1 : ( ruleExprTail ) ;
    public final void rule__Expr__TailsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9303:1: ( ( ruleExprTail ) )
            // InternalFortXTrans.g:9304:2: ( ruleExprTail )
            {
            // InternalFortXTrans.g:9304:2: ( ruleExprTail )
            // InternalFortXTrans.g:9305:3: ruleExprTail
            {
             before(grammarAccess.getExprAccess().getTailsExprTailParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExprTail();

            state._fsp--;

             after(grammarAccess.getExprAccess().getTailsExprTailParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__TailsAssignment_0_1"


    // $ANTLR start "rule__Expr__LocVarAssignment_1"
    // InternalFortXTrans.g:9314:1: rule__Expr__LocVarAssignment_1 : ( ruleLocalVarDecl ) ;
    public final void rule__Expr__LocVarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9318:1: ( ( ruleLocalVarDecl ) )
            // InternalFortXTrans.g:9319:2: ( ruleLocalVarDecl )
            {
            // InternalFortXTrans.g:9319:2: ( ruleLocalVarDecl )
            // InternalFortXTrans.g:9320:3: ruleLocalVarDecl
            {
             before(grammarAccess.getExprAccess().getLocVarLocalVarDeclParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLocalVarDecl();

            state._fsp--;

             after(grammarAccess.getExprAccess().getLocVarLocalVarDeclParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__LocVarAssignment_1"


    // $ANTLR start "rule__ExprFront__DelimAssignment_0"
    // InternalFortXTrans.g:9329:1: rule__ExprFront__DelimAssignment_0 : ( ruleDelimitedExpr ) ;
    public final void rule__ExprFront__DelimAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9333:1: ( ( ruleDelimitedExpr ) )
            // InternalFortXTrans.g:9334:2: ( ruleDelimitedExpr )
            {
            // InternalFortXTrans.g:9334:2: ( ruleDelimitedExpr )
            // InternalFortXTrans.g:9335:3: ruleDelimitedExpr
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
    // InternalFortXTrans.g:9344:1: rule__ExprFront__IdAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ExprFront__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9348:1: ( ( ruleQualifiedName ) )
            // InternalFortXTrans.g:9349:2: ( ruleQualifiedName )
            {
            // InternalFortXTrans.g:9349:2: ( ruleQualifiedName )
            // InternalFortXTrans.g:9350:3: ruleQualifiedName
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
    // InternalFortXTrans.g:9359:1: rule__ExprTail__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__ExprTail__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9363:1: ( ( ruleType ) )
            // InternalFortXTrans.g:9364:2: ( ruleType )
            {
            // InternalFortXTrans.g:9364:2: ( ruleType )
            // InternalFortXTrans.g:9365:3: ruleType
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
    // InternalFortXTrans.g:9374:1: rule__DelimitedExpr__DodAssignment_0 : ( ruleDo ) ;
    public final void rule__DelimitedExpr__DodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9378:1: ( ( ruleDo ) )
            // InternalFortXTrans.g:9379:2: ( ruleDo )
            {
            // InternalFortXTrans.g:9379:2: ( ruleDo )
            // InternalFortXTrans.g:9380:3: ruleDo
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
    // InternalFortXTrans.g:9389:1: rule__DelimitedExpr__AwhileAssignment_1_0 : ( ( 'while' ) ) ;
    public final void rule__DelimitedExpr__AwhileAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9393:1: ( ( ( 'while' ) ) )
            // InternalFortXTrans.g:9394:2: ( ( 'while' ) )
            {
            // InternalFortXTrans.g:9394:2: ( ( 'while' ) )
            // InternalFortXTrans.g:9395:3: ( 'while' )
            {
             before(grammarAccess.getDelimitedExprAccess().getAwhileWhileKeyword_1_0_0()); 
            // InternalFortXTrans.g:9396:3: ( 'while' )
            // InternalFortXTrans.g:9397:4: 'while'
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
    // InternalFortXTrans.g:9408:1: rule__DelimitedExpr__ExprAssignment_1_1 : ( ruleExpr ) ;
    public final void rule__DelimitedExpr__ExprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9412:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:9413:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:9413:2: ( ruleExpr )
            // InternalFortXTrans.g:9414:3: ruleExpr
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
    // InternalFortXTrans.g:9423:1: rule__DelimitedExpr__WhiledodAssignment_1_2 : ( ruleDo ) ;
    public final void rule__DelimitedExpr__WhiledodAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9427:1: ( ( ruleDo ) )
            // InternalFortXTrans.g:9428:2: ( ruleDo )
            {
            // InternalFortXTrans.g:9428:2: ( ruleDo )
            // InternalFortXTrans.g:9429:3: ruleDo
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
    // InternalFortXTrans.g:9438:1: rule__DelimitedExpr__AforAssignment_2_0 : ( ( 'for' ) ) ;
    public final void rule__DelimitedExpr__AforAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9442:1: ( ( ( 'for' ) ) )
            // InternalFortXTrans.g:9443:2: ( ( 'for' ) )
            {
            // InternalFortXTrans.g:9443:2: ( ( 'for' ) )
            // InternalFortXTrans.g:9444:3: ( 'for' )
            {
             before(grammarAccess.getDelimitedExprAccess().getAforForKeyword_2_0_0()); 
            // InternalFortXTrans.g:9445:3: ( 'for' )
            // InternalFortXTrans.g:9446:4: 'for'
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
    // InternalFortXTrans.g:9457:1: rule__DelimitedExpr__GenAssignment_2_1 : ( ruleGenerators ) ;
    public final void rule__DelimitedExpr__GenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9461:1: ( ( ruleGenerators ) )
            // InternalFortXTrans.g:9462:2: ( ruleGenerators )
            {
            // InternalFortXTrans.g:9462:2: ( ruleGenerators )
            // InternalFortXTrans.g:9463:3: ruleGenerators
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
    // InternalFortXTrans.g:9472:1: rule__DelimitedExpr__DofrontAssignment_2_2 : ( ruleDoFront ) ;
    public final void rule__DelimitedExpr__DofrontAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9476:1: ( ( ruleDoFront ) )
            // InternalFortXTrans.g:9477:2: ( ruleDoFront )
            {
            // InternalFortXTrans.g:9477:2: ( ruleDoFront )
            // InternalFortXTrans.g:9478:3: ruleDoFront
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
    // InternalFortXTrans.g:9487:1: rule__DelimitedExpr__AnifAssignment_3_0 : ( ( 'if' ) ) ;
    public final void rule__DelimitedExpr__AnifAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9491:1: ( ( ( 'if' ) ) )
            // InternalFortXTrans.g:9492:2: ( ( 'if' ) )
            {
            // InternalFortXTrans.g:9492:2: ( ( 'if' ) )
            // InternalFortXTrans.g:9493:3: ( 'if' )
            {
             before(grammarAccess.getDelimitedExprAccess().getAnifIfKeyword_3_0_0()); 
            // InternalFortXTrans.g:9494:3: ( 'if' )
            // InternalFortXTrans.g:9495:4: 'if'
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
    // InternalFortXTrans.g:9506:1: rule__DelimitedExpr__CondAssignment_3_1 : ( ruleExpr ) ;
    public final void rule__DelimitedExpr__CondAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9510:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:9511:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:9511:2: ( ruleExpr )
            // InternalFortXTrans.g:9512:3: ruleExpr
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
    // InternalFortXTrans.g:9521:1: rule__DelimitedExpr__BlockAssignment_3_3 : ( ruleBlockElems ) ;
    public final void rule__DelimitedExpr__BlockAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9525:1: ( ( ruleBlockElems ) )
            // InternalFortXTrans.g:9526:2: ( ruleBlockElems )
            {
            // InternalFortXTrans.g:9526:2: ( ruleBlockElems )
            // InternalFortXTrans.g:9527:3: ruleBlockElems
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
    // InternalFortXTrans.g:9536:1: rule__DelimitedExpr__ElifsAssignment_3_4 : ( ruleElifs ) ;
    public final void rule__DelimitedExpr__ElifsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9540:1: ( ( ruleElifs ) )
            // InternalFortXTrans.g:9541:2: ( ruleElifs )
            {
            // InternalFortXTrans.g:9541:2: ( ruleElifs )
            // InternalFortXTrans.g:9542:3: ruleElifs
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
    // InternalFortXTrans.g:9551:1: rule__DelimitedExpr__ElsAssignment_3_5 : ( ruleElse ) ;
    public final void rule__DelimitedExpr__ElsAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9555:1: ( ( ruleElse ) )
            // InternalFortXTrans.g:9556:2: ( ruleElse )
            {
            // InternalFortXTrans.g:9556:2: ( ruleElse )
            // InternalFortXTrans.g:9557:3: ruleElse
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
    // InternalFortXTrans.g:9566:1: rule__DelimitedExpr__ParAssignment_4 : ( ruleParanthesized ) ;
    public final void rule__DelimitedExpr__ParAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9570:1: ( ( ruleParanthesized ) )
            // InternalFortXTrans.g:9571:2: ( ruleParanthesized )
            {
            // InternalFortXTrans.g:9571:2: ( ruleParanthesized )
            // InternalFortXTrans.g:9572:3: ruleParanthesized
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
    // InternalFortXTrans.g:9581:1: rule__Elifs__EAssignment_0 : ( ruleElif ) ;
    public final void rule__Elifs__EAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9585:1: ( ( ruleElif ) )
            // InternalFortXTrans.g:9586:2: ( ruleElif )
            {
            // InternalFortXTrans.g:9586:2: ( ruleElif )
            // InternalFortXTrans.g:9587:3: ruleElif
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
    // InternalFortXTrans.g:9596:1: rule__Elifs__EAssignment_1 : ( ruleElif ) ;
    public final void rule__Elifs__EAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9600:1: ( ( ruleElif ) )
            // InternalFortXTrans.g:9601:2: ( ruleElif )
            {
            // InternalFortXTrans.g:9601:2: ( ruleElif )
            // InternalFortXTrans.g:9602:3: ruleElif
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
    // InternalFortXTrans.g:9611:1: rule__Elif__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__Elif__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9615:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:9616:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:9616:2: ( ruleExpr )
            // InternalFortXTrans.g:9617:3: ruleExpr
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
    // InternalFortXTrans.g:9626:1: rule__Elif__BlockAssignment_3 : ( ruleBlockElems ) ;
    public final void rule__Elif__BlockAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9630:1: ( ( ruleBlockElems ) )
            // InternalFortXTrans.g:9631:2: ( ruleBlockElems )
            {
            // InternalFortXTrans.g:9631:2: ( ruleBlockElems )
            // InternalFortXTrans.g:9632:3: ruleBlockElems
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
    // InternalFortXTrans.g:9641:1: rule__Else__BlockAssignment_1 : ( ruleBlockElems ) ;
    public final void rule__Else__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9645:1: ( ( ruleBlockElems ) )
            // InternalFortXTrans.g:9646:2: ( ruleBlockElems )
            {
            // InternalFortXTrans.g:9646:2: ( ruleBlockElems )
            // InternalFortXTrans.g:9647:3: ruleBlockElems
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
    // InternalFortXTrans.g:9656:1: rule__Generators__BindingAssignment_0 : ( ruleBinding ) ;
    public final void rule__Generators__BindingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9660:1: ( ( ruleBinding ) )
            // InternalFortXTrans.g:9661:2: ( ruleBinding )
            {
            // InternalFortXTrans.g:9661:2: ( ruleBinding )
            // InternalFortXTrans.g:9662:3: ruleBinding
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
    // InternalFortXTrans.g:9671:1: rule__Generators__ClauseAssignment_1_1 : ( ruleGenClause ) ;
    public final void rule__Generators__ClauseAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9675:1: ( ( ruleGenClause ) )
            // InternalFortXTrans.g:9676:2: ( ruleGenClause )
            {
            // InternalFortXTrans.g:9676:2: ( ruleGenClause )
            // InternalFortXTrans.g:9677:3: ruleGenClause
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
    // InternalFortXTrans.g:9686:1: rule__Binding__IdtupAssignment_0_0 : ( ruleIdOrTuple ) ;
    public final void rule__Binding__IdtupAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9690:1: ( ( ruleIdOrTuple ) )
            // InternalFortXTrans.g:9691:2: ( ruleIdOrTuple )
            {
            // InternalFortXTrans.g:9691:2: ( ruleIdOrTuple )
            // InternalFortXTrans.g:9692:3: ruleIdOrTuple
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
    // InternalFortXTrans.g:9701:1: rule__Binding__ExprAssignment_0_2 : ( ruleExpr ) ;
    public final void rule__Binding__ExprAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9705:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:9706:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:9706:2: ( ruleExpr )
            // InternalFortXTrans.g:9707:3: ruleExpr
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
    // InternalFortXTrans.g:9716:1: rule__Binding__IdtupAssignment_1_0 : ( ruleIdOrTuple ) ;
    public final void rule__Binding__IdtupAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9720:1: ( ( ruleIdOrTuple ) )
            // InternalFortXTrans.g:9721:2: ( ruleIdOrTuple )
            {
            // InternalFortXTrans.g:9721:2: ( ruleIdOrTuple )
            // InternalFortXTrans.g:9722:3: ruleIdOrTuple
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
    // InternalFortXTrans.g:9731:1: rule__Binding__SeqAssignment_1_2 : ( ( 'seq' ) ) ;
    public final void rule__Binding__SeqAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9735:1: ( ( ( 'seq' ) ) )
            // InternalFortXTrans.g:9736:2: ( ( 'seq' ) )
            {
            // InternalFortXTrans.g:9736:2: ( ( 'seq' ) )
            // InternalFortXTrans.g:9737:3: ( 'seq' )
            {
             before(grammarAccess.getBindingAccess().getSeqSeqKeyword_1_2_0()); 
            // InternalFortXTrans.g:9738:3: ( 'seq' )
            // InternalFortXTrans.g:9739:4: 'seq'
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
    // InternalFortXTrans.g:9750:1: rule__Binding__ExprAssignment_1_4 : ( ruleExpr ) ;
    public final void rule__Binding__ExprAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9754:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:9755:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:9755:2: ( ruleExpr )
            // InternalFortXTrans.g:9756:3: ruleExpr
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
    // InternalFortXTrans.g:9765:1: rule__GenClause__BindingAssignment_0 : ( ruleBinding ) ;
    public final void rule__GenClause__BindingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9769:1: ( ( ruleBinding ) )
            // InternalFortXTrans.g:9770:2: ( ruleBinding )
            {
            // InternalFortXTrans.g:9770:2: ( ruleBinding )
            // InternalFortXTrans.g:9771:3: ruleBinding
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
    // InternalFortXTrans.g:9780:1: rule__GenClause__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__GenClause__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9784:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:9785:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:9785:2: ( ruleExpr )
            // InternalFortXTrans.g:9786:3: ruleExpr
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
    // InternalFortXTrans.g:9795:1: rule__BlockElems__BlockAssignment_0 : ( ruleBlockElem ) ;
    public final void rule__BlockElems__BlockAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9799:1: ( ( ruleBlockElem ) )
            // InternalFortXTrans.g:9800:2: ( ruleBlockElem )
            {
            // InternalFortXTrans.g:9800:2: ( ruleBlockElem )
            // InternalFortXTrans.g:9801:3: ruleBlockElem
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
    // InternalFortXTrans.g:9810:1: rule__BlockElems__BlockAssignment_1 : ( ruleBlockElem ) ;
    public final void rule__BlockElems__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9814:1: ( ( ruleBlockElem ) )
            // InternalFortXTrans.g:9815:2: ( ruleBlockElem )
            {
            // InternalFortXTrans.g:9815:2: ( ruleBlockElem )
            // InternalFortXTrans.g:9816:3: ruleBlockElem
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
    // InternalFortXTrans.g:9825:1: rule__BlockElem__ExpAssignment : ( ruleExpr ) ;
    public final void rule__BlockElem__ExpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9829:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:9830:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:9830:2: ( ruleExpr )
            // InternalFortXTrans.g:9831:3: ruleExpr
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
    // InternalFortXTrans.g:9840:1: rule__Paranthesized__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__Paranthesized__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9844:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:9845:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:9845:2: ( ruleExpr )
            // InternalFortXTrans.g:9846:3: ruleExpr
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
    // InternalFortXTrans.g:9855:1: rule__Do__DofsAssignment_0 : ( ruleDoFront ) ;
    public final void rule__Do__DofsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9859:1: ( ( ruleDoFront ) )
            // InternalFortXTrans.g:9860:2: ( ruleDoFront )
            {
            // InternalFortXTrans.g:9860:2: ( ruleDoFront )
            // InternalFortXTrans.g:9861:3: ruleDoFront
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
    // InternalFortXTrans.g:9870:1: rule__Do__DofsAssignment_1_1 : ( ruleDoFront ) ;
    public final void rule__Do__DofsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9874:1: ( ( ruleDoFront ) )
            // InternalFortXTrans.g:9875:2: ( ruleDoFront )
            {
            // InternalFortXTrans.g:9875:2: ( ruleDoFront )
            // InternalFortXTrans.g:9876:3: ruleDoFront
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
    // InternalFortXTrans.g:9885:1: rule__DoFront__AtAssignment_0_0 : ( ( 'at' ) ) ;
    public final void rule__DoFront__AtAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9889:1: ( ( ( 'at' ) ) )
            // InternalFortXTrans.g:9890:2: ( ( 'at' ) )
            {
            // InternalFortXTrans.g:9890:2: ( ( 'at' ) )
            // InternalFortXTrans.g:9891:3: ( 'at' )
            {
             before(grammarAccess.getDoFrontAccess().getAtAtKeyword_0_0_0()); 
            // InternalFortXTrans.g:9892:3: ( 'at' )
            // InternalFortXTrans.g:9893:4: 'at'
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
    // InternalFortXTrans.g:9904:1: rule__DoFront__ExpAssignment_0_1 : ( ruleExpr ) ;
    public final void rule__DoFront__ExpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9908:1: ( ( ruleExpr ) )
            // InternalFortXTrans.g:9909:2: ( ruleExpr )
            {
            // InternalFortXTrans.g:9909:2: ( ruleExpr )
            // InternalFortXTrans.g:9910:3: ruleExpr
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
    // InternalFortXTrans.g:9919:1: rule__DoFront__AtomAssignment_1 : ( ( 'atomic' ) ) ;
    public final void rule__DoFront__AtomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9923:1: ( ( ( 'atomic' ) ) )
            // InternalFortXTrans.g:9924:2: ( ( 'atomic' ) )
            {
            // InternalFortXTrans.g:9924:2: ( ( 'atomic' ) )
            // InternalFortXTrans.g:9925:3: ( 'atomic' )
            {
             before(grammarAccess.getDoFrontAccess().getAtomAtomicKeyword_1_0()); 
            // InternalFortXTrans.g:9926:3: ( 'atomic' )
            // InternalFortXTrans.g:9927:4: 'atomic'
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
    // InternalFortXTrans.g:9938:1: rule__DoFront__BlockAssignment_3 : ( ruleBlockElems ) ;
    public final void rule__DoFront__BlockAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9942:1: ( ( ruleBlockElems ) )
            // InternalFortXTrans.g:9943:2: ( ruleBlockElems )
            {
            // InternalFortXTrans.g:9943:2: ( ruleBlockElems )
            // InternalFortXTrans.g:9944:3: ruleBlockElems
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
    // InternalFortXTrans.g:9953:1: rule__IdOrTuple__BidAssignment_0 : ( ruleBindId ) ;
    public final void rule__IdOrTuple__BidAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9957:1: ( ( ruleBindId ) )
            // InternalFortXTrans.g:9958:2: ( ruleBindId )
            {
            // InternalFortXTrans.g:9958:2: ( ruleBindId )
            // InternalFortXTrans.g:9959:3: ruleBindId
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
    // InternalFortXTrans.g:9968:1: rule__IdOrTuple__BidAssignment_1_1 : ( ruleBindId ) ;
    public final void rule__IdOrTuple__BidAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9972:1: ( ( ruleBindId ) )
            // InternalFortXTrans.g:9973:2: ( ruleBindId )
            {
            // InternalFortXTrans.g:9973:2: ( ruleBindId )
            // InternalFortXTrans.g:9974:3: ruleBindId
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
    // InternalFortXTrans.g:9983:1: rule__IdOrTuple__BidAssignment_1_2_1 : ( ruleBindId ) ;
    public final void rule__IdOrTuple__BidAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:9987:1: ( ( ruleBindId ) )
            // InternalFortXTrans.g:9988:2: ( ruleBindId )
            {
            // InternalFortXTrans.g:9988:2: ( ruleBindId )
            // InternalFortXTrans.g:9989:3: ruleBindId
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
    // InternalFortXTrans.g:9998:1: rule__IsType__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__IsType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10002:1: ( ( ruleType ) )
            // InternalFortXTrans.g:10003:2: ( ruleType )
            {
            // InternalFortXTrans.g:10003:2: ( ruleType )
            // InternalFortXTrans.g:10004:3: ruleType
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
    // InternalFortXTrans.g:10013:1: rule__FieldDecl__PriAssignment_0_0 : ( ( 'private' ) ) ;
    public final void rule__FieldDecl__PriAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10017:1: ( ( ( 'private' ) ) )
            // InternalFortXTrans.g:10018:2: ( ( 'private' ) )
            {
            // InternalFortXTrans.g:10018:2: ( ( 'private' ) )
            // InternalFortXTrans.g:10019:3: ( 'private' )
            {
             before(grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_0_0_0()); 
            // InternalFortXTrans.g:10020:3: ( 'private' )
            // InternalFortXTrans.g:10021:4: 'private'
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
    // InternalFortXTrans.g:10032:1: rule__FieldDecl__MutAssignment_0_1 : ( ( 'var' ) ) ;
    public final void rule__FieldDecl__MutAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10036:1: ( ( ( 'var' ) ) )
            // InternalFortXTrans.g:10037:2: ( ( 'var' ) )
            {
            // InternalFortXTrans.g:10037:2: ( ( 'var' ) )
            // InternalFortXTrans.g:10038:3: ( 'var' )
            {
             before(grammarAccess.getFieldDeclAccess().getMutVarKeyword_0_1_0()); 
            // InternalFortXTrans.g:10039:3: ( 'var' )
            // InternalFortXTrans.g:10040:4: 'var'
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
    // InternalFortXTrans.g:10051:1: rule__FieldDecl__VarsAssignment_0_2 : ( ruleNoNewlineVarWTypes ) ;
    public final void rule__FieldDecl__VarsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10055:1: ( ( ruleNoNewlineVarWTypes ) )
            // InternalFortXTrans.g:10056:2: ( ruleNoNewlineVarWTypes )
            {
            // InternalFortXTrans.g:10056:2: ( ruleNoNewlineVarWTypes )
            // InternalFortXTrans.g:10057:3: ruleNoNewlineVarWTypes
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
    // InternalFortXTrans.g:10066:1: rule__FieldDecl__InitAssignment_0_3 : ( ruleInitVal ) ;
    public final void rule__FieldDecl__InitAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10070:1: ( ( ruleInitVal ) )
            // InternalFortXTrans.g:10071:2: ( ruleInitVal )
            {
            // InternalFortXTrans.g:10071:2: ( ruleInitVal )
            // InternalFortXTrans.g:10072:3: ruleInitVal
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
    // InternalFortXTrans.g:10081:1: rule__FieldDecl__PriAssignment_1_0 : ( ( 'private' ) ) ;
    public final void rule__FieldDecl__PriAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10085:1: ( ( ( 'private' ) ) )
            // InternalFortXTrans.g:10086:2: ( ( 'private' ) )
            {
            // InternalFortXTrans.g:10086:2: ( ( 'private' ) )
            // InternalFortXTrans.g:10087:3: ( 'private' )
            {
             before(grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_1_0_0()); 
            // InternalFortXTrans.g:10088:3: ( 'private' )
            // InternalFortXTrans.g:10089:4: 'private'
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
    // InternalFortXTrans.g:10100:1: rule__FieldDecl__IdtupAssignment_1_1 : ( ruleIdOrTuple ) ;
    public final void rule__FieldDecl__IdtupAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10104:1: ( ( ruleIdOrTuple ) )
            // InternalFortXTrans.g:10105:2: ( ruleIdOrTuple )
            {
            // InternalFortXTrans.g:10105:2: ( ruleIdOrTuple )
            // InternalFortXTrans.g:10106:3: ruleIdOrTuple
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
    // InternalFortXTrans.g:10115:1: rule__FieldDecl__LitTupAssignment_1_3 : ( ruleLiteralTuple ) ;
    public final void rule__FieldDecl__LitTupAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10119:1: ( ( ruleLiteralTuple ) )
            // InternalFortXTrans.g:10120:2: ( ruleLiteralTuple )
            {
            // InternalFortXTrans.g:10120:2: ( ruleLiteralTuple )
            // InternalFortXTrans.g:10121:3: ruleLiteralTuple
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
    // InternalFortXTrans.g:10130:1: rule__FieldDecl__PriAssignment_2_0 : ( ( 'private' ) ) ;
    public final void rule__FieldDecl__PriAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10134:1: ( ( ( 'private' ) ) )
            // InternalFortXTrans.g:10135:2: ( ( 'private' ) )
            {
            // InternalFortXTrans.g:10135:2: ( ( 'private' ) )
            // InternalFortXTrans.g:10136:3: ( 'private' )
            {
             before(grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_2_0_0()); 
            // InternalFortXTrans.g:10137:3: ( 'private' )
            // InternalFortXTrans.g:10138:4: 'private'
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
    // InternalFortXTrans.g:10149:1: rule__FieldDecl__MutAssignment_2_1 : ( ( 'var' ) ) ;
    public final void rule__FieldDecl__MutAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10153:1: ( ( ( 'var' ) ) )
            // InternalFortXTrans.g:10154:2: ( ( 'var' ) )
            {
            // InternalFortXTrans.g:10154:2: ( ( 'var' ) )
            // InternalFortXTrans.g:10155:3: ( 'var' )
            {
             before(grammarAccess.getFieldDeclAccess().getMutVarKeyword_2_1_0()); 
            // InternalFortXTrans.g:10156:3: ( 'var' )
            // InternalFortXTrans.g:10157:4: 'var'
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
    // InternalFortXTrans.g:10168:1: rule__FieldDecl__IdtupAssignment_2_2 : ( ruleIdOrTuple ) ;
    public final void rule__FieldDecl__IdtupAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10172:1: ( ( ruleIdOrTuple ) )
            // InternalFortXTrans.g:10173:2: ( ruleIdOrTuple )
            {
            // InternalFortXTrans.g:10173:2: ( ruleIdOrTuple )
            // InternalFortXTrans.g:10174:3: ruleIdOrTuple
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
    // InternalFortXTrans.g:10183:1: rule__FieldDecl__TypeAssignment_2_4 : ( ruleType ) ;
    public final void rule__FieldDecl__TypeAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10187:1: ( ( ruleType ) )
            // InternalFortXTrans.g:10188:2: ( ruleType )
            {
            // InternalFortXTrans.g:10188:2: ( ruleType )
            // InternalFortXTrans.g:10189:3: ruleType
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
    // InternalFortXTrans.g:10198:1: rule__FieldDecl__InitAssignment_2_6 : ( ruleInitVal ) ;
    public final void rule__FieldDecl__InitAssignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10202:1: ( ( ruleInitVal ) )
            // InternalFortXTrans.g:10203:2: ( ruleInitVal )
            {
            // InternalFortXTrans.g:10203:2: ( ruleInitVal )
            // InternalFortXTrans.g:10204:3: ruleInitVal
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
    // InternalFortXTrans.g:10213:1: rule__FieldDecl__PriAssignment_3_0 : ( ( 'private' ) ) ;
    public final void rule__FieldDecl__PriAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10217:1: ( ( ( 'private' ) ) )
            // InternalFortXTrans.g:10218:2: ( ( 'private' ) )
            {
            // InternalFortXTrans.g:10218:2: ( ( 'private' ) )
            // InternalFortXTrans.g:10219:3: ( 'private' )
            {
             before(grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_3_0_0()); 
            // InternalFortXTrans.g:10220:3: ( 'private' )
            // InternalFortXTrans.g:10221:4: 'private'
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
    // InternalFortXTrans.g:10232:1: rule__FieldDecl__MutAssignment_3_1 : ( ( 'var' ) ) ;
    public final void rule__FieldDecl__MutAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10236:1: ( ( ( 'var' ) ) )
            // InternalFortXTrans.g:10237:2: ( ( 'var' ) )
            {
            // InternalFortXTrans.g:10237:2: ( ( 'var' ) )
            // InternalFortXTrans.g:10238:3: ( 'var' )
            {
             before(grammarAccess.getFieldDeclAccess().getMutVarKeyword_3_1_0()); 
            // InternalFortXTrans.g:10239:3: ( 'var' )
            // InternalFortXTrans.g:10240:4: 'var'
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
    // InternalFortXTrans.g:10251:1: rule__FieldDecl__IdtupAssignment_3_2 : ( ruleIdOrTuple ) ;
    public final void rule__FieldDecl__IdtupAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10255:1: ( ( ruleIdOrTuple ) )
            // InternalFortXTrans.g:10256:2: ( ruleIdOrTuple )
            {
            // InternalFortXTrans.g:10256:2: ( ruleIdOrTuple )
            // InternalFortXTrans.g:10257:3: ruleIdOrTuple
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
    // InternalFortXTrans.g:10266:1: rule__FieldDecl__TuptypeAssignment_3_4 : ( ruleTupleType ) ;
    public final void rule__FieldDecl__TuptypeAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10270:1: ( ( ruleTupleType ) )
            // InternalFortXTrans.g:10271:2: ( ruleTupleType )
            {
            // InternalFortXTrans.g:10271:2: ( ruleTupleType )
            // InternalFortXTrans.g:10272:3: ruleTupleType
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
    // InternalFortXTrans.g:10281:1: rule__FieldDecl__InitAssignment_3_5 : ( ruleInitVal ) ;
    public final void rule__FieldDecl__InitAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10285:1: ( ( ruleInitVal ) )
            // InternalFortXTrans.g:10286:2: ( ruleInitVal )
            {
            // InternalFortXTrans.g:10286:2: ( ruleInitVal )
            // InternalFortXTrans.g:10287:3: ruleInitVal
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
    // InternalFortXTrans.g:10296:1: rule__NoNewlineVarWTypes__SingleAssignment_0 : ( ruleNoNewlineVarWType ) ;
    public final void rule__NoNewlineVarWTypes__SingleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10300:1: ( ( ruleNoNewlineVarWType ) )
            // InternalFortXTrans.g:10301:2: ( ruleNoNewlineVarWType )
            {
            // InternalFortXTrans.g:10301:2: ( ruleNoNewlineVarWType )
            // InternalFortXTrans.g:10302:3: ruleNoNewlineVarWType
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
    // InternalFortXTrans.g:10311:1: rule__NoNewlineVarWTypes__MultipleAssignment_1_1 : ( ruleNoNewlineVarWType ) ;
    public final void rule__NoNewlineVarWTypes__MultipleAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10315:1: ( ( ruleNoNewlineVarWType ) )
            // InternalFortXTrans.g:10316:2: ( ruleNoNewlineVarWType )
            {
            // InternalFortXTrans.g:10316:2: ( ruleNoNewlineVarWType )
            // InternalFortXTrans.g:10317:3: ruleNoNewlineVarWType
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
    // InternalFortXTrans.g:10326:1: rule__NoNewlineVarWTypes__MultipleAssignment_1_2_1 : ( ruleNoNewlineVarWType ) ;
    public final void rule__NoNewlineVarWTypes__MultipleAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10330:1: ( ( ruleNoNewlineVarWType ) )
            // InternalFortXTrans.g:10331:2: ( ruleNoNewlineVarWType )
            {
            // InternalFortXTrans.g:10331:2: ( ruleNoNewlineVarWType )
            // InternalFortXTrans.g:10332:3: ruleNoNewlineVarWType
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
    // InternalFortXTrans.g:10341:1: rule__NoNewlineVarWType__BidAssignment_0 : ( ruleBindId ) ;
    public final void rule__NoNewlineVarWType__BidAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10345:1: ( ( ruleBindId ) )
            // InternalFortXTrans.g:10346:2: ( ruleBindId )
            {
            // InternalFortXTrans.g:10346:2: ( ruleBindId )
            // InternalFortXTrans.g:10347:3: ruleBindId
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
    // InternalFortXTrans.g:10356:1: rule__NoNewlineVarWType__IstypeAssignment_1 : ( ruleIsType ) ;
    public final void rule__NoNewlineVarWType__IstypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10360:1: ( ( ruleIsType ) )
            // InternalFortXTrans.g:10361:2: ( ruleIsType )
            {
            // InternalFortXTrans.g:10361:2: ( ruleIsType )
            // InternalFortXTrans.g:10362:3: ruleIsType
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
    // InternalFortXTrans.g:10371:1: rule__InitVal__MutAssignment_0_0 : ( ( ':=' ) ) ;
    public final void rule__InitVal__MutAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10375:1: ( ( ( ':=' ) ) )
            // InternalFortXTrans.g:10376:2: ( ( ':=' ) )
            {
            // InternalFortXTrans.g:10376:2: ( ( ':=' ) )
            // InternalFortXTrans.g:10377:3: ( ':=' )
            {
             before(grammarAccess.getInitValAccess().getMutColonEqualsSignKeyword_0_0_0()); 
            // InternalFortXTrans.g:10378:3: ( ':=' )
            // InternalFortXTrans.g:10379:4: ':='
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
    // InternalFortXTrans.g:10390:1: rule__InitVal__LitAssignment_0_1 : ( ruleLiteralTuple ) ;
    public final void rule__InitVal__LitAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10394:1: ( ( ruleLiteralTuple ) )
            // InternalFortXTrans.g:10395:2: ( ruleLiteralTuple )
            {
            // InternalFortXTrans.g:10395:2: ( ruleLiteralTuple )
            // InternalFortXTrans.g:10396:3: ruleLiteralTuple
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
    // InternalFortXTrans.g:10405:1: rule__InitVal__ImmutAssignment_1_0 : ( ( '=' ) ) ;
    public final void rule__InitVal__ImmutAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10409:1: ( ( ( '=' ) ) )
            // InternalFortXTrans.g:10410:2: ( ( '=' ) )
            {
            // InternalFortXTrans.g:10410:2: ( ( '=' ) )
            // InternalFortXTrans.g:10411:3: ( '=' )
            {
             before(grammarAccess.getInitValAccess().getImmutEqualsSignKeyword_1_0_0()); 
            // InternalFortXTrans.g:10412:3: ( '=' )
            // InternalFortXTrans.g:10413:4: '='
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
    // InternalFortXTrans.g:10424:1: rule__InitVal__LitAssignment_1_1 : ( ruleLiteralTuple ) ;
    public final void rule__InitVal__LitAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10428:1: ( ( ruleLiteralTuple ) )
            // InternalFortXTrans.g:10429:2: ( ruleLiteralTuple )
            {
            // InternalFortXTrans.g:10429:2: ( ruleLiteralTuple )
            // InternalFortXTrans.g:10430:3: ruleLiteralTuple
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
    // InternalFortXTrans.g:10439:1: rule__LiteralTuple__LitAssignment_0 : ( ruleLiteral ) ;
    public final void rule__LiteralTuple__LitAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10443:1: ( ( ruleLiteral ) )
            // InternalFortXTrans.g:10444:2: ( ruleLiteral )
            {
            // InternalFortXTrans.g:10444:2: ( ruleLiteral )
            // InternalFortXTrans.g:10445:3: ruleLiteral
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
    // InternalFortXTrans.g:10454:1: rule__LiteralTuple__LitsAssignment_1_1 : ( ruleLiteral ) ;
    public final void rule__LiteralTuple__LitsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10458:1: ( ( ruleLiteral ) )
            // InternalFortXTrans.g:10459:2: ( ruleLiteral )
            {
            // InternalFortXTrans.g:10459:2: ( ruleLiteral )
            // InternalFortXTrans.g:10460:3: ruleLiteral
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
    // InternalFortXTrans.g:10469:1: rule__LiteralTuple__LitsAssignment_1_2_1 : ( ruleLiteral ) ;
    public final void rule__LiteralTuple__LitsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10473:1: ( ( ruleLiteral ) )
            // InternalFortXTrans.g:10474:2: ( ruleLiteral )
            {
            // InternalFortXTrans.g:10474:2: ( ruleLiteral )
            // InternalFortXTrans.g:10475:3: ruleLiteral
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
    // InternalFortXTrans.g:10484:1: rule__Literal__IntgAssignment_0 : ( RULE_INT ) ;
    public final void rule__Literal__IntgAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10488:1: ( ( RULE_INT ) )
            // InternalFortXTrans.g:10489:2: ( RULE_INT )
            {
            // InternalFortXTrans.g:10489:2: ( RULE_INT )
            // InternalFortXTrans.g:10490:3: RULE_INT
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
    // InternalFortXTrans.g:10499:1: rule__Literal__FlotAssignment_1 : ( RULE_FLOAT ) ;
    public final void rule__Literal__FlotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10503:1: ( ( RULE_FLOAT ) )
            // InternalFortXTrans.g:10504:2: ( RULE_FLOAT )
            {
            // InternalFortXTrans.g:10504:2: ( RULE_FLOAT )
            // InternalFortXTrans.g:10505:3: RULE_FLOAT
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
    // InternalFortXTrans.g:10514:1: rule__Literal__StrAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Literal__StrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10518:1: ( ( RULE_STRING ) )
            // InternalFortXTrans.g:10519:2: ( RULE_STRING )
            {
            // InternalFortXTrans.g:10519:2: ( RULE_STRING )
            // InternalFortXTrans.g:10520:3: RULE_STRING
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


    // $ANTLR start "rule__Literal__QAssignment_3"
    // InternalFortXTrans.g:10529:1: rule__Literal__QAssignment_3 : ( ruleQualifiedName ) ;
    public final void rule__Literal__QAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10533:1: ( ( ruleQualifiedName ) )
            // InternalFortXTrans.g:10534:2: ( ruleQualifiedName )
            {
            // InternalFortXTrans.g:10534:2: ( ruleQualifiedName )
            // InternalFortXTrans.g:10535:3: ruleQualifiedName
            {
             before(grammarAccess.getLiteralAccess().getQQualifiedNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getQQualifiedNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__QAssignment_3"


    // $ANTLR start "rule__LocalVarDecl__MutAssignment_0_0"
    // InternalFortXTrans.g:10544:1: rule__LocalVarDecl__MutAssignment_0_0 : ( ( 'var' ) ) ;
    public final void rule__LocalVarDecl__MutAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10548:1: ( ( ( 'var' ) ) )
            // InternalFortXTrans.g:10549:2: ( ( 'var' ) )
            {
            // InternalFortXTrans.g:10549:2: ( ( 'var' ) )
            // InternalFortXTrans.g:10550:3: ( 'var' )
            {
             before(grammarAccess.getLocalVarDeclAccess().getMutVarKeyword_0_0_0()); 
            // InternalFortXTrans.g:10551:3: ( 'var' )
            // InternalFortXTrans.g:10552:4: 'var'
            {
             before(grammarAccess.getLocalVarDeclAccess().getMutVarKeyword_0_0_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLocalVarDeclAccess().getMutVarKeyword_0_0_0()); 

            }

             after(grammarAccess.getLocalVarDeclAccess().getMutVarKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__MutAssignment_0_0"


    // $ANTLR start "rule__LocalVarDecl__VarsAssignment_0_1"
    // InternalFortXTrans.g:10563:1: rule__LocalVarDecl__VarsAssignment_0_1 : ( ruleNoNewlineVarWTypes ) ;
    public final void rule__LocalVarDecl__VarsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10567:1: ( ( ruleNoNewlineVarWTypes ) )
            // InternalFortXTrans.g:10568:2: ( ruleNoNewlineVarWTypes )
            {
            // InternalFortXTrans.g:10568:2: ( ruleNoNewlineVarWTypes )
            // InternalFortXTrans.g:10569:3: ruleNoNewlineVarWTypes
            {
             before(grammarAccess.getLocalVarDeclAccess().getVarsNoNewlineVarWTypesParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNoNewlineVarWTypes();

            state._fsp--;

             after(grammarAccess.getLocalVarDeclAccess().getVarsNoNewlineVarWTypesParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__VarsAssignment_0_1"


    // $ANTLR start "rule__LocalVarDecl__InitAssignment_0_2"
    // InternalFortXTrans.g:10578:1: rule__LocalVarDecl__InitAssignment_0_2 : ( ruleInitVal ) ;
    public final void rule__LocalVarDecl__InitAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10582:1: ( ( ruleInitVal ) )
            // InternalFortXTrans.g:10583:2: ( ruleInitVal )
            {
            // InternalFortXTrans.g:10583:2: ( ruleInitVal )
            // InternalFortXTrans.g:10584:3: ruleInitVal
            {
             before(grammarAccess.getLocalVarDeclAccess().getInitInitValParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInitVal();

            state._fsp--;

             after(grammarAccess.getLocalVarDeclAccess().getInitInitValParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__InitAssignment_0_2"


    // $ANTLR start "rule__LocalVarDecl__IdtupAssignment_1_0"
    // InternalFortXTrans.g:10593:1: rule__LocalVarDecl__IdtupAssignment_1_0 : ( ruleIdOrTuple ) ;
    public final void rule__LocalVarDecl__IdtupAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10597:1: ( ( ruleIdOrTuple ) )
            // InternalFortXTrans.g:10598:2: ( ruleIdOrTuple )
            {
            // InternalFortXTrans.g:10598:2: ( ruleIdOrTuple )
            // InternalFortXTrans.g:10599:3: ruleIdOrTuple
            {
             before(grammarAccess.getLocalVarDeclAccess().getIdtupIdOrTupleParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIdOrTuple();

            state._fsp--;

             after(grammarAccess.getLocalVarDeclAccess().getIdtupIdOrTupleParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__IdtupAssignment_1_0"


    // $ANTLR start "rule__LocalVarDecl__LitTupAssignment_1_2"
    // InternalFortXTrans.g:10608:1: rule__LocalVarDecl__LitTupAssignment_1_2 : ( ruleLiteralTuple ) ;
    public final void rule__LocalVarDecl__LitTupAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10612:1: ( ( ruleLiteralTuple ) )
            // InternalFortXTrans.g:10613:2: ( ruleLiteralTuple )
            {
            // InternalFortXTrans.g:10613:2: ( ruleLiteralTuple )
            // InternalFortXTrans.g:10614:3: ruleLiteralTuple
            {
             before(grammarAccess.getLocalVarDeclAccess().getLitTupLiteralTupleParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteralTuple();

            state._fsp--;

             after(grammarAccess.getLocalVarDeclAccess().getLitTupLiteralTupleParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__LitTupAssignment_1_2"


    // $ANTLR start "rule__LocalVarDecl__MutAssignment_2_0"
    // InternalFortXTrans.g:10623:1: rule__LocalVarDecl__MutAssignment_2_0 : ( ( 'var' ) ) ;
    public final void rule__LocalVarDecl__MutAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10627:1: ( ( ( 'var' ) ) )
            // InternalFortXTrans.g:10628:2: ( ( 'var' ) )
            {
            // InternalFortXTrans.g:10628:2: ( ( 'var' ) )
            // InternalFortXTrans.g:10629:3: ( 'var' )
            {
             before(grammarAccess.getLocalVarDeclAccess().getMutVarKeyword_2_0_0()); 
            // InternalFortXTrans.g:10630:3: ( 'var' )
            // InternalFortXTrans.g:10631:4: 'var'
            {
             before(grammarAccess.getLocalVarDeclAccess().getMutVarKeyword_2_0_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLocalVarDeclAccess().getMutVarKeyword_2_0_0()); 

            }

             after(grammarAccess.getLocalVarDeclAccess().getMutVarKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__MutAssignment_2_0"


    // $ANTLR start "rule__LocalVarDecl__IdtupAssignment_2_1"
    // InternalFortXTrans.g:10642:1: rule__LocalVarDecl__IdtupAssignment_2_1 : ( ruleIdOrTuple ) ;
    public final void rule__LocalVarDecl__IdtupAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10646:1: ( ( ruleIdOrTuple ) )
            // InternalFortXTrans.g:10647:2: ( ruleIdOrTuple )
            {
            // InternalFortXTrans.g:10647:2: ( ruleIdOrTuple )
            // InternalFortXTrans.g:10648:3: ruleIdOrTuple
            {
             before(grammarAccess.getLocalVarDeclAccess().getIdtupIdOrTupleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIdOrTuple();

            state._fsp--;

             after(grammarAccess.getLocalVarDeclAccess().getIdtupIdOrTupleParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__IdtupAssignment_2_1"


    // $ANTLR start "rule__LocalVarDecl__TypeAssignment_2_3"
    // InternalFortXTrans.g:10657:1: rule__LocalVarDecl__TypeAssignment_2_3 : ( ruleType ) ;
    public final void rule__LocalVarDecl__TypeAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10661:1: ( ( ruleType ) )
            // InternalFortXTrans.g:10662:2: ( ruleType )
            {
            // InternalFortXTrans.g:10662:2: ( ruleType )
            // InternalFortXTrans.g:10663:3: ruleType
            {
             before(grammarAccess.getLocalVarDeclAccess().getTypeTypeParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getLocalVarDeclAccess().getTypeTypeParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__TypeAssignment_2_3"


    // $ANTLR start "rule__LocalVarDecl__InitAssignment_2_5"
    // InternalFortXTrans.g:10672:1: rule__LocalVarDecl__InitAssignment_2_5 : ( ruleInitVal ) ;
    public final void rule__LocalVarDecl__InitAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10676:1: ( ( ruleInitVal ) )
            // InternalFortXTrans.g:10677:2: ( ruleInitVal )
            {
            // InternalFortXTrans.g:10677:2: ( ruleInitVal )
            // InternalFortXTrans.g:10678:3: ruleInitVal
            {
             before(grammarAccess.getLocalVarDeclAccess().getInitInitValParserRuleCall_2_5_0()); 
            pushFollow(FOLLOW_2);
            ruleInitVal();

            state._fsp--;

             after(grammarAccess.getLocalVarDeclAccess().getInitInitValParserRuleCall_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__InitAssignment_2_5"


    // $ANTLR start "rule__LocalVarDecl__MutAssignment_3_0"
    // InternalFortXTrans.g:10687:1: rule__LocalVarDecl__MutAssignment_3_0 : ( ( 'var' ) ) ;
    public final void rule__LocalVarDecl__MutAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10691:1: ( ( ( 'var' ) ) )
            // InternalFortXTrans.g:10692:2: ( ( 'var' ) )
            {
            // InternalFortXTrans.g:10692:2: ( ( 'var' ) )
            // InternalFortXTrans.g:10693:3: ( 'var' )
            {
             before(grammarAccess.getLocalVarDeclAccess().getMutVarKeyword_3_0_0()); 
            // InternalFortXTrans.g:10694:3: ( 'var' )
            // InternalFortXTrans.g:10695:4: 'var'
            {
             before(grammarAccess.getLocalVarDeclAccess().getMutVarKeyword_3_0_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLocalVarDeclAccess().getMutVarKeyword_3_0_0()); 

            }

             after(grammarAccess.getLocalVarDeclAccess().getMutVarKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__MutAssignment_3_0"


    // $ANTLR start "rule__LocalVarDecl__IdtupAssignment_3_1"
    // InternalFortXTrans.g:10706:1: rule__LocalVarDecl__IdtupAssignment_3_1 : ( ruleIdOrTuple ) ;
    public final void rule__LocalVarDecl__IdtupAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10710:1: ( ( ruleIdOrTuple ) )
            // InternalFortXTrans.g:10711:2: ( ruleIdOrTuple )
            {
            // InternalFortXTrans.g:10711:2: ( ruleIdOrTuple )
            // InternalFortXTrans.g:10712:3: ruleIdOrTuple
            {
             before(grammarAccess.getLocalVarDeclAccess().getIdtupIdOrTupleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIdOrTuple();

            state._fsp--;

             after(grammarAccess.getLocalVarDeclAccess().getIdtupIdOrTupleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__IdtupAssignment_3_1"


    // $ANTLR start "rule__LocalVarDecl__TuptypeAssignment_3_3"
    // InternalFortXTrans.g:10721:1: rule__LocalVarDecl__TuptypeAssignment_3_3 : ( ruleTupleType ) ;
    public final void rule__LocalVarDecl__TuptypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10725:1: ( ( ruleTupleType ) )
            // InternalFortXTrans.g:10726:2: ( ruleTupleType )
            {
            // InternalFortXTrans.g:10726:2: ( ruleTupleType )
            // InternalFortXTrans.g:10727:3: ruleTupleType
            {
             before(grammarAccess.getLocalVarDeclAccess().getTuptypeTupleTypeParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTupleType();

            state._fsp--;

             after(grammarAccess.getLocalVarDeclAccess().getTuptypeTupleTypeParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__TuptypeAssignment_3_3"


    // $ANTLR start "rule__LocalVarDecl__InitAssignment_3_4"
    // InternalFortXTrans.g:10736:1: rule__LocalVarDecl__InitAssignment_3_4 : ( ruleInitVal ) ;
    public final void rule__LocalVarDecl__InitAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:10740:1: ( ( ruleInitVal ) )
            // InternalFortXTrans.g:10741:2: ( ruleInitVal )
            {
            // InternalFortXTrans.g:10741:2: ( ruleInitVal )
            // InternalFortXTrans.g:10742:3: ruleInitVal
            {
             before(grammarAccess.getLocalVarDeclAccess().getInitInitValParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInitVal();

            state._fsp--;

             after(grammarAccess.getLocalVarDeclAccess().getInitInitValParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVarDecl__InitAssignment_3_4"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String dfa_1s = "\u012b\uffff";
    static final String dfa_2s = "\1\1\u012a\uffff";
    static final String dfa_3s = "\1\4\1\uffff\6\4\1\36\7\4\2\36\2\4\2\36\1\4\2\31\1\5\2\4\2\36\5\uffff\1\4\2\31\1\4\1\36\1\4\1\46\2\4\1\31\1\uffff\1\4\3\31\1\5\1\4\1\36\2\31\1\4\1\31\2\4\4\uffff\1\4\4\uffff\2\4\1\46\1\31\1\4\1\31\1\4\2\31\1\5\1\4\4\uffff\1\4\4\uffff\1\4\3\31\1\5\3\31\1\5\1\31\3\4\3\31\2\5\2\36\3\31\1\5\3\31\1\5\2\4\1\31\1\4\1\31\1\4\4\uffff\1\4\4\uffff\1\4\2\36\1\4\1\uffff\1\31\1\4\1\31\3\4\1\31\2\4\4\31\2\5\3\31\2\5\3\31\1\5\3\31\1\5\1\4\3\31\2\5\4\31\2\5\3\31\2\5\1\4\1\uffff\1\4\2\31\1\4\1\uffff\1\4\2\31\2\4\1\31\1\4\1\31\1\4\1\31\1\4\2\31\1\4\1\46\1\4\1\uffff\1\31\1\4\1\31\1\4\1\uffff\1\31\1\4\4\31\2\5\3\31\2\5\3\31\2\5\3\31\3\5\2\36\3\31\2\5\3\31\2\5\1\4\2\31\1\4\2\31\1\4\1\uffff\1\4\2\31\1\4\1\uffff\1\4\3\31\2\4\2\31\1\4\2\31\2\5\3\31\2\5\3\31\2\5\1\31\2\5\3\31\1\4\1\31\1\4\4\31\2\5\2\31";
    static final String dfa_4s = "\1\63\1\uffff\1\63\3\55\1\46\1\37\1\46\1\24\4\55\2\37\2\36\1\35\1\37\2\36\1\24\2\36\1\64\2\4\2\36\5\uffff\1\10\2\36\1\24\1\46\1\4\1\64\2\37\1\35\1\uffff\1\4\3\31\1\32\1\24\1\36\2\35\1\37\1\31\2\37\4\uffff\1\10\4\uffff\1\10\1\4\1\64\1\35\1\10\1\31\1\4\2\35\1\5\1\24\4\uffff\1\10\4\uffff\1\10\3\31\1\32\3\31\1\32\1\35\2\37\1\24\4\35\1\32\2\36\3\31\1\32\3\31\1\32\1\10\1\4\1\31\1\10\1\31\1\4\4\uffff\1\10\4\uffff\1\10\2\36\1\10\1\uffff\1\35\1\4\1\31\1\4\1\10\1\4\1\31\1\10\1\4\1\31\4\35\1\32\4\35\1\32\3\31\1\32\3\31\1\32\1\4\12\35\1\32\4\35\1\32\1\10\1\uffff\1\4\1\35\1\31\1\10\1\uffff\1\4\1\35\1\31\1\10\1\4\1\31\1\10\1\31\1\4\1\35\1\4\2\35\1\24\1\64\1\10\1\uffff\1\35\1\4\1\31\1\10\1\uffff\1\35\1\4\1\31\16\35\1\32\4\35\1\32\1\35\2\36\12\35\1\4\2\35\1\4\2\35\1\10\1\uffff\1\4\1\35\1\31\1\10\1\uffff\1\4\1\35\1\31\1\35\2\4\2\35\1\4\24\35\1\4\1\35\1\4\10\35";
    static final String dfa_5s = "\1\uffff\1\2\34\uffff\5\1\12\uffff\1\1\15\uffff\4\1\1\uffff\4\1\13\uffff\4\1\1\uffff\4\1\42\uffff\4\1\1\uffff\4\1\4\uffff\1\1\56\uffff\1\1\4\uffff\1\1\20\uffff\1\1\4\uffff\1\1\53\uffff\1\1\4\uffff\1\1\50\uffff";
    static final String dfa_6s = "\u012b\uffff}>";
    static final String[] dfa_7s = {
            "\1\6\17\uffff\1\10\1\uffff\1\1\10\uffff\1\11\12\uffff\1\2\1\3\1\4\1\5\5\uffff\1\7",
            "",
            "\1\6\17\uffff\1\10\12\uffff\1\11\12\uffff\1\12\1\13\1\14\1\15\5\uffff\1\7",
            "\1\16\45\uffff\1\12\1\13\1\14\1\15",
            "\1\16\45\uffff\1\12\1\13\1\14\1\15",
            "\1\16\45\uffff\1\12\1\13\1\14\1\15",
            "\1\20\17\uffff\1\21\11\uffff\1\17\1\22\6\uffff\1\23",
            "\1\24\17\uffff\1\25\12\uffff\1\26",
            "\1\17\7\uffff\1\23",
            "\1\27\17\uffff\1\30",
            "\1\16\45\uffff\1\12\1\13\1\14\1\15",
            "\1\16\45\uffff\1\12\1\13\1\14\1\15",
            "\1\16\45\uffff\1\12\1\13\1\14\1\15",
            "\1\16\45\uffff\1\12\1\13\1\14\1\15",
            "\1\20\17\uffff\1\21\12\uffff\1\22",
            "\1\31\32\uffff\1\32",
            "\1\33",
            "\1\33",
            "\1\34\17\uffff\1\35\10\uffff\1\36",
            "\1\42\1\uffff\1\37\1\40\1\41\26\uffff\1\43",
            "\1\17",
            "\1\17",
            "\1\44\17\uffff\1\45",
            "\1\46\3\uffff\1\47\1\50",
            "\1\46\3\uffff\1\47\1\50",
            "\1\51\40\uffff\1\53\15\uffff\1\52",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\56",
            "",
            "",
            "",
            "",
            "",
            "\1\62\1\uffff\1\57\1\60\1\61",
            "\1\63\3\uffff\1\64\1\50",
            "\1\63\3\uffff\1\64\1\50",
            "\1\65\17\uffff\1\66",
            "\1\67\7\uffff\1\23",
            "\1\70",
            "\1\72\15\uffff\1\71",
            "\1\76\1\uffff\1\73\1\74\1\75\26\uffff\1\77",
            "\1\103\1\uffff\1\100\1\101\1\102\26\uffff\1\104",
            "\1\105\3\uffff\1\106",
            "",
            "\1\107",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\111\23\uffff\1\110\1\112",
            "\1\113\17\uffff\1\114",
            "\1\67",
            "\1\46\3\uffff\1\47",
            "\1\46\3\uffff\1\47",
            "\1\115\32\uffff\1\32",
            "\1\116",
            "\1\122\1\uffff\1\117\1\120\1\121\26\uffff\1\123",
            "\1\127\1\uffff\1\124\1\125\1\126\26\uffff\1\130",
            "",
            "",
            "",
            "",
            "\1\134\1\uffff\1\131\1\132\1\133",
            "",
            "",
            "",
            "",
            "\1\140\1\uffff\1\135\1\136\1\137",
            "\1\141",
            "\1\143\15\uffff\1\142",
            "\1\144\3\uffff\1\36",
            "\1\150\1\uffff\1\145\1\146\1\147",
            "\1\110",
            "\1\151",
            "\1\63\3\uffff\1\64",
            "\1\63\3\uffff\1\64",
            "\1\51",
            "\1\152\17\uffff\1\153",
            "",
            "",
            "",
            "",
            "\1\157\1\uffff\1\154\1\155\1\156",
            "",
            "",
            "",
            "",
            "\1\163\1\uffff\1\160\1\161\1\162",
            "\1\164",
            "\1\164",
            "\1\164",
            "\1\166\23\uffff\1\164\1\165",
            "\1\167",
            "\1\167",
            "\1\167",
            "\1\170\23\uffff\1\167\1\171",
            "\1\105\3\uffff\1\106",
            "\1\175\1\uffff\1\172\1\173\1\174\26\uffff\1\176",
            "\1\u0082\1\uffff\1\177\1\u0080\1\u0081\26\uffff\1\u0083",
            "\1\u0084\17\uffff\1\u0085",
            "\1\u0086\3\uffff\1\u0087",
            "\1\u0086\3\uffff\1\u0087",
            "\1\u0086\3\uffff\1\u0087",
            "\1\u0088\23\uffff\1\u0086\1\u0089\2\uffff\1\u0087",
            "\1\u008a\23\uffff\1\110\1\112",
            "\1\u008b",
            "\1\u008b",
            "\1\u008c",
            "\1\u008c",
            "\1\u008c",
            "\1\u008e\23\uffff\1\u008c\1\u008d",
            "\1\u008f",
            "\1\u008f",
            "\1\u008f",
            "\1\u0091\23\uffff\1\u008f\1\u0090",
            "\1\u0095\1\uffff\1\u0092\1\u0093\1\u0094",
            "\1\u0096",
            "\1\164",
            "\1\u009a\1\uffff\1\u0097\1\u0098\1\u0099",
            "\1\167",
            "\1\u009b",
            "",
            "",
            "",
            "",
            "\1\u009f\1\uffff\1\u009c\1\u009d\1\u009e",
            "",
            "",
            "",
            "",
            "\1\u00a3\1\uffff\1\u00a0\1\u00a1\1\u00a2",
            "\1\u00a4",
            "\1\u00a4",
            "\1\u00a8\1\uffff\1\u00a5\1\u00a6\1\u00a7",
            "",
            "\1\u0086\3\uffff\1\u0087",
            "\1\u00a9",
            "\1\110",
            "\1\u00aa",
            "\1\u00ae\1\uffff\1\u00ab\1\u00ac\1\u00ad",
            "\1\u00af",
            "\1\u008c",
            "\1\u00b3\1\uffff\1\u00b0\1\u00b1\1\u00b2",
            "\1\u00b4",
            "\1\u008f",
            "\1\u00b5\3\uffff\1\u00b6",
            "\1\u00b5\3\uffff\1\u00b6",
            "\1\u00b5\3\uffff\1\u00b6",
            "\1\u00b8\23\uffff\1\u00b5\1\u00b7\2\uffff\1\u00b6",
            "\1\u00b9\23\uffff\1\164\1\165",
            "\1\u00ba\3\uffff\1\u00bb",
            "\1\u00ba\3\uffff\1\u00bb",
            "\1\u00ba\3\uffff\1\u00bb",
            "\1\u00bd\23\uffff\1\u00ba\1\u00bc\2\uffff\1\u00bb",
            "\1\u00be\23\uffff\1\167\1\171",
            "\1\u00bf",
            "\1\u00bf",
            "\1\u00bf",
            "\1\u00c1\23\uffff\1\u00bf\1\u00c0",
            "\1\u00c2",
            "\1\u00c2",
            "\1\u00c2",
            "\1\u00c3\23\uffff\1\u00c2\1\u00c4",
            "\1\u00c5",
            "\1\u0086\3\uffff\1\u0087",
            "\1\u0086\3\uffff\1\u0087",
            "\1\u0086\3\uffff\1\u0087",
            "\1\u00c7\23\uffff\1\u0086\1\u00c6\2\uffff\1\u0087",
            "\1\u00c8\23\uffff\1\u0086\1\u0089\2\uffff\1\u0087",
            "\1\u00c9\3\uffff\1\u00ca",
            "\1\u00cb\3\uffff\1\u00cc",
            "\1\u00cb\3\uffff\1\u00cc",
            "\1\u00cb\3\uffff\1\u00cc",
            "\1\u00cd\23\uffff\1\u00cb\1\u00ce\2\uffff\1\u00cc",
            "\1\u00cf\23\uffff\1\u008c\1\u008d",
            "\1\u00d0\3\uffff\1\u00d1",
            "\1\u00d0\3\uffff\1\u00d1",
            "\1\u00d0\3\uffff\1\u00d1",
            "\1\u00d2\23\uffff\1\u00d0\1\u00d3\2\uffff\1\u00d1",
            "\1\u00d4\23\uffff\1\u008f\1\u0090",
            "\1\u00d8\1\uffff\1\u00d5\1\u00d6\1\u00d7",
            "",
            "\1\u00d9",
            "\1\u00b5\3\uffff\1\u00b6",
            "\1\164",
            "\1\u00dd\1\uffff\1\u00da\1\u00db\1\u00dc",
            "",
            "\1\u00de",
            "\1\u00ba\3\uffff\1\u00bb",
            "\1\167",
            "\1\u00e2\1\uffff\1\u00df\1\u00e0\1\u00e1",
            "\1\u00e3",
            "\1\u00bf",
            "\1\u00e7\1\uffff\1\u00e4\1\u00e5\1\u00e6",
            "\1\u00c2",
            "\1\u00e8",
            "\1\144\3\uffff\1\36",
            "\1\u00e9",
            "\1\u0086\3\uffff\1\u0087",
            "\1\u0086\3\uffff\1\u0087",
            "\1\u00ea\17\uffff\1\u00eb",
            "\1\53\15\uffff\1\52",
            "\1\u00ef\1\uffff\1\u00ec\1\u00ed\1\u00ee",
            "",
            "\1\u00cb\3\uffff\1\u00cc",
            "\1\u00f0",
            "\1\u008c",
            "\1\u00f4\1\uffff\1\u00f1\1\u00f2\1\u00f3",
            "",
            "\1\u00d0\3\uffff\1\u00d1",
            "\1\u00f5",
            "\1\u008f",
            "\1\u00b5\3\uffff\1\u00b6",
            "\1\u00b5\3\uffff\1\u00b6",
            "\1\u00b5\3\uffff\1\u00b6",
            "\1\u00f7\23\uffff\1\u00b5\1\u00f6\2\uffff\1\u00b6",
            "\1\u00f8\23\uffff\1\u00b5\1\u00b7\2\uffff\1\u00b6",
            "\1\u00ba\3\uffff\1\u00bb",
            "\1\u00ba\3\uffff\1\u00bb",
            "\1\u00ba\3\uffff\1\u00bb",
            "\1\u00fa\23\uffff\1\u00ba\1\u00f9\2\uffff\1\u00bb",
            "\1\u00fb\23\uffff\1\u00ba\1\u00bc\2\uffff\1\u00bb",
            "\1\u00fc\3\uffff\1\u00fd",
            "\1\u00fc\3\uffff\1\u00fd",
            "\1\u00fc\3\uffff\1\u00fd",
            "\1\u00ff\23\uffff\1\u00fc\1\u00fe\2\uffff\1\u00fd",
            "\1\u0100\23\uffff\1\u00bf\1\u00c0",
            "\1\u0101\3\uffff\1\u0102",
            "\1\u0101\3\uffff\1\u0102",
            "\1\u0101\3\uffff\1\u0102",
            "\1\u0104\23\uffff\1\u0101\1\u0103\2\uffff\1\u0102",
            "\1\u0105\23\uffff\1\u00c2\1\u00c4",
            "\1\u0106\23\uffff\1\u0086\1\u00c6\2\uffff\1\u0087",
            "\1\u0107",
            "\1\u0107",
            "\1\u00cb\3\uffff\1\u00cc",
            "\1\u00cb\3\uffff\1\u00cc",
            "\1\u00cb\3\uffff\1\u00cc",
            "\1\u0109\23\uffff\1\u00cb\1\u0108\2\uffff\1\u00cc",
            "\1\u010a\23\uffff\1\u00cb\1\u00ce\2\uffff\1\u00cc",
            "\1\u00d0\3\uffff\1\u00d1",
            "\1\u00d0\3\uffff\1\u00d1",
            "\1\u00d0\3\uffff\1\u00d1",
            "\1\u010c\23\uffff\1\u00d0\1\u010b\2\uffff\1\u00d1",
            "\1\u010d\23\uffff\1\u00d0\1\u00d3\2\uffff\1\u00d1",
            "\1\u010e",
            "\1\u00b5\3\uffff\1\u00b6",
            "\1\u00b5\3\uffff\1\u00b6",
            "\1\u010f",
            "\1\u00ba\3\uffff\1\u00bb",
            "\1\u00ba\3\uffff\1\u00bb",
            "\1\u0113\1\uffff\1\u0110\1\u0111\1\u0112",
            "",
            "\1\u0114",
            "\1\u00fc\3\uffff\1\u00fd",
            "\1\u00bf",
            "\1\u0118\1\uffff\1\u0115\1\u0116\1\u0117",
            "",
            "\1\u0119",
            "\1\u0101\3\uffff\1\u0102",
            "\1\u00c2",
            "\1\u0086\3\uffff\1\u0087",
            "\1\u011a",
            "\1\u011b",
            "\1\u00cb\3\uffff\1\u00cc",
            "\1\u00cb\3\uffff\1\u00cc",
            "\1\u011c",
            "\1\u00d0\3\uffff\1\u00d1",
            "\1\u00d0\3\uffff\1\u00d1",
            "\1\u011d\23\uffff\1\u00b5\1\u00f6\2\uffff\1\u00b6",
            "\1\u011e\23\uffff\1\u00ba\1\u00f9\2\uffff\1\u00bb",
            "\1\u00fc\3\uffff\1\u00fd",
            "\1\u00fc\3\uffff\1\u00fd",
            "\1\u00fc\3\uffff\1\u00fd",
            "\1\u011f\23\uffff\1\u00fc\1\u0120\2\uffff\1\u00fd",
            "\1\u0121\23\uffff\1\u00fc\1\u00fe\2\uffff\1\u00fd",
            "\1\u0101\3\uffff\1\u0102",
            "\1\u0101\3\uffff\1\u0102",
            "\1\u0101\3\uffff\1\u0102",
            "\1\u0123\23\uffff\1\u0101\1\u0122\2\uffff\1\u0102",
            "\1\u0124\23\uffff\1\u0101\1\u0103\2\uffff\1\u0102",
            "\1\u00c9\3\uffff\1\u00ca",
            "\1\u0125\23\uffff\1\u00cb\1\u0108\2\uffff\1\u00cc",
            "\1\u0126\23\uffff\1\u00d0\1\u010b\2\uffff\1\u00d1",
            "\1\u00b5\3\uffff\1\u00b6",
            "\1\u00ba\3\uffff\1\u00bb",
            "\1\u00fc\3\uffff\1\u00fd",
            "\1\u0127",
            "\1\u00fc\3\uffff\1\u00fd",
            "\1\u0128",
            "\1\u0101\3\uffff\1\u0102",
            "\1\u0101\3\uffff\1\u0102",
            "\1\u00cb\3\uffff\1\u00cc",
            "\1\u00d0\3\uffff\1\u00d1",
            "\1\u0129\23\uffff\1\u00fc\1\u0120\2\uffff\1\u00fd",
            "\1\u012a\23\uffff\1\u0101\1\u0122\2\uffff\1\u0102",
            "\1\u00fc\3\uffff\1\u00fd",
            "\1\u0101\3\uffff\1\u0102"
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
    static final String dfa_10s = "\1\4\1\5\1\4\1\26\1\uffff\1\5\1\4\1\33\1\26\2\uffff";
    static final String dfa_11s = "\1\4\1\50\1\33\1\50\1\uffff\1\50\1\5\1\33\1\50\2\uffff";
    static final String dfa_12s = "\4\uffff\1\3\4\uffff\1\1\1\2";
    static final String dfa_13s = "\13\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\3\20\uffff\1\4\3\uffff\1\2\1\uffff\1\4\12\uffff\2\4",
            "\1\5\26\uffff\1\6",
            "\1\4\3\uffff\1\7\1\uffff\1\4\12\uffff\2\4",
            "",
            "\1\10\20\uffff\1\4\3\uffff\1\2\1\uffff\1\4\12\uffff\2\4",
            "\1\12\1\11",
            "\1\6",
            "\1\4\3\uffff\1\7\1\uffff\1\4\12\uffff\2\4",
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
            return "1329:1: rule__ImportedNames__Alternatives : ( ( ( rule__ImportedNames__Group_0__0 ) ) | ( ( rule__ImportedNames__Group_1__0 ) ) | ( ( rule__ImportedNames__Group_2__0 ) ) );";
        }
    }
    static final String dfa_15s = "\7\uffff";
    static final String dfa_16s = "\1\uffff\1\4\3\uffff\1\4\1\uffff";
    static final String dfa_17s = "\3\4\2\uffff\1\4\1\uffff";
    static final String dfa_18s = "\1\4\1\63\1\4\2\uffff\1\63\1\uffff";
    static final String dfa_19s = "\3\uffff\1\1\1\3\1\uffff\1\2";
    static final String dfa_20s = "\7\uffff}>";
    static final String[] dfa_21s = {
            "\1\1",
            "\1\4\1\3\16\uffff\1\4\1\uffff\1\4\2\uffff\1\4\1\2\1\uffff\2\4\1\uffff\4\4\1\uffff\2\4\4\uffff\7\4\1\uffff\2\4",
            "\1\5",
            "",
            "",
            "\1\4\1\6\16\uffff\1\4\1\uffff\1\4\2\uffff\1\4\1\2\1\uffff\2\4\1\uffff\4\4\1\uffff\2\4\4\uffff\7\4\1\uffff\2\4",
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
            return "1356:1: rule__QualifiedName__Alternatives : ( ( ( rule__QualifiedName__Group_0__0 ) ) | ( ( rule__QualifiedName__Group_1__0 ) ) | ( ( rule__QualifiedName__Group_2__0 ) ) );";
        }
    }
    static final String dfa_22s = "\2\4\1\uffff\1\4\1\uffff\1\4\1\uffff";
    static final String dfa_23s = "\1\4\1\63\1\uffff\1\33\1\uffff\1\63\1\uffff";
    static final String dfa_24s = "\2\uffff\1\1\1\uffff\1\3\1\uffff\1\2";
    static final String[] dfa_25s = {
            "\1\1",
            "\1\4\1\2\16\uffff\1\4\1\uffff\1\4\1\uffff\2\4\1\3\1\uffff\1\4\2\uffff\1\4\7\uffff\2\4\1\uffff\4\4\5\uffff\1\4",
            "",
            "\1\5\26\uffff\1\4",
            "",
            "\1\4\1\6\16\uffff\1\4\1\uffff\1\4\1\uffff\2\4\1\3\1\uffff\1\4\2\uffff\1\4\7\uffff\2\4\1\uffff\4\4\5\uffff\1\4",
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
            return "1383:1: rule__APIName__Alternatives : ( ( ( rule__APIName__Group_0__0 ) ) | ( ( rule__APIName__Group_1__0 ) ) | ( ( rule__APIName__Group_2__0 ) ) );";
        }
    }
    static final String dfa_26s = "\12\uffff";
    static final String dfa_27s = "\3\uffff\1\1\3\uffff\1\1\2\uffff";
    static final String dfa_28s = "\1\4\1\uffff\2\4\1\uffff\1\5\1\31\2\4\1\5";
    static final String dfa_29s = "\1\63\1\uffff\2\63\1\uffff\2\46\1\63\1\37\1\64";
    static final String dfa_30s = "\1\uffff\1\1\2\uffff\1\2\5\uffff";
    static final String dfa_31s = "\12\uffff}>";
    static final String[] dfa_32s = {
            "\1\3\17\uffff\1\4\12\uffff\1\2\5\uffff\1\1\6\uffff\1\1\1\uffff\3\1\1\uffff\1\1\1\4",
            "",
            "\1\5\17\uffff\1\6\12\uffff\1\1\5\uffff\1\1\6\uffff\1\1\1\uffff\3\1\1\uffff\2\1",
            "\2\1\16\uffff\1\1\1\uffff\1\1\2\uffff\2\1\1\uffff\2\1\1\4\4\1\1\uffff\2\1\1\4\3\uffff\7\1\1\uffff\2\1",
            "",
            "\1\1\23\uffff\1\4\1\1\1\uffff\1\1\1\7\1\10\7\uffff\1\1",
            "\1\4\3\uffff\1\4\1\10\7\uffff\1\1",
            "\1\1\17\uffff\1\1\1\uffff\1\1\2\uffff\1\1\2\uffff\2\1\1\4\4\1\1\uffff\2\1\1\4\3\uffff\7\1\1\uffff\2\1",
            "\1\11\32\uffff\1\1",
            "\1\1\23\uffff\1\4\14\uffff\1\1\15\uffff\1\1"
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_26;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "1548:1: rule__Expr__Alternatives : ( ( ( rule__Expr__Group_0__0 ) ) | ( ( rule__Expr__LocVarAssignment_1 ) ) );";
        }
    }
    static final String dfa_33s = "\15\uffff";
    static final String dfa_34s = "\1\4\2\43\2\4\2\31\2\uffff\1\4\1\43\2\31";
    static final String dfa_35s = "\1\37\2\43\1\24\1\63\2\35\2\uffff\1\24\1\43\2\35";
    static final String dfa_36s = "\7\uffff\1\1\1\2\4\uffff";
    static final String dfa_37s = "\15\uffff}>";
    static final String[] dfa_38s = {
            "\1\1\17\uffff\1\2\12\uffff\1\3",
            "\1\4",
            "\1\4",
            "\1\5\17\uffff\1\6",
            "\1\7\17\uffff\1\7\12\uffff\1\7\5\uffff\1\7\6\uffff\1\7\1\uffff\3\7\1\10\2\7",
            "\1\11\3\uffff\1\12",
            "\1\11\3\uffff\1\12",
            "",
            "",
            "\1\13\17\uffff\1\14",
            "\1\4",
            "\1\11\3\uffff\1\12",
            "\1\11\3\uffff\1\12"
    };

    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_33;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "1629:1: rule__Binding__Alternatives : ( ( ( rule__Binding__Group_0__0 ) ) | ( ( rule__Binding__Group_1__0 ) ) );";
        }
    }
    static final String dfa_39s = "\1\uffff\1\4\7\uffff\1\4\3\uffff";
    static final String dfa_40s = "\1\4\1\5\1\36\1\4\2\uffff\1\5\1\31\1\4\1\31\1\36\2\31";
    static final String dfa_41s = "\1\63\1\62\1\46\1\63\2\uffff\2\46\1\24\1\62\1\46\2\35";
    static final String dfa_42s = "\4\uffff\1\2\1\1\7\uffff";
    static final String[] dfa_43s = {
            "\1\1\17\uffff\1\2\12\uffff\1\3\5\uffff\1\4\6\uffff\1\4\1\uffff\3\4\1\uffff\2\4",
            "\1\4\23\uffff\2\4\1\uffff\1\4\1\uffff\1\4\4\uffff\1\5\1\uffff\2\4\5\uffff\1\4\5\uffff\1\4",
            "\1\4\4\uffff\1\5\2\uffff\1\4",
            "\1\6\17\uffff\1\7\12\uffff\1\4\5\uffff\1\4\6\uffff\1\4\1\uffff\3\4\1\uffff\2\4",
            "",
            "",
            "\1\4\23\uffff\1\10\1\4\1\uffff\1\4\1\11\1\4\7\uffff\1\4",
            "\1\10\3\uffff\1\12\1\4\7\uffff\1\4",
            "\1\13\17\uffff\1\14",
            "\1\4\2\uffff\1\4\1\uffff\1\4\4\uffff\1\5\1\uffff\2\4\5\uffff\1\4\5\uffff\1\4",
            "\1\4\4\uffff\1\5\2\uffff\1\4",
            "\1\10\3\uffff\1\12",
            "\1\10\3\uffff\1\12"
    };
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[][] dfa_43 = unpackEncodedStringArray(dfa_43s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_33;
            this.eof = dfa_39;
            this.min = dfa_40;
            this.max = dfa_41;
            this.accept = dfa_42;
            this.special = dfa_37;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "1650:1: rule__GenClause__Alternatives : ( ( ( rule__GenClause__BindingAssignment_0 ) ) | ( ( rule__GenClause__ExprAssignment_1 ) ) );";
        }
    }
    static final String dfa_44s = "\34\uffff";
    static final String dfa_45s = "\3\4\2\36\1\4\2\36\2\4\1\uffff\4\31\1\5\1\uffff\1\4\1\36\1\uffff\1\4\1\36\1\uffff\2\31\1\4\2\31";
    static final String dfa_46s = "\2\63\1\37\2\46\1\24\2\36\1\24\1\37\1\uffff\4\36\1\64\1\uffff\1\24\1\46\1\uffff\1\24\1\36\1\uffff\2\35\1\37\2\35";
    static final String dfa_47s = "\12\uffff\1\2\5\uffff\1\4\2\uffff\1\1\2\uffff\1\3\5\uffff";
    static final String dfa_48s = "\34\uffff}>";
    static final String[] dfa_49s = {
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

    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[][] dfa_49 = unpackEncodedStringArray(dfa_49s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_44;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "1713:1: rule__FieldDecl__Alternatives : ( ( ( rule__FieldDecl__Group_0__0 ) ) | ( ( rule__FieldDecl__Group_1__0 ) ) | ( ( rule__FieldDecl__Group_2__0 ) ) | ( ( rule__FieldDecl__Group_3__0 ) ) );";
        }
    }
    static final String dfa_50s = "\33\uffff";
    static final String dfa_51s = "\2\4\2\36\1\4\2\36\2\4\1\uffff\4\31\1\5\1\uffff\1\4\1\36\1\uffff\1\4\1\36\1\uffff\2\31\1\4\2\31";
    static final String dfa_52s = "\1\63\1\37\2\46\1\24\2\36\1\24\1\37\1\uffff\4\36\1\64\1\uffff\1\24\1\46\1\uffff\1\24\1\36\1\uffff\2\35\1\37\2\35";
    static final String dfa_53s = "\11\uffff\1\2\5\uffff\1\4\2\uffff\1\1\2\uffff\1\3\5\uffff";
    static final String dfa_54s = "\33\uffff}>";
    static final String[] dfa_55s = {
            "\1\2\17\uffff\1\3\12\uffff\1\4\23\uffff\1\1",
            "\1\5\17\uffff\1\6\12\uffff\1\7",
            "\1\10\7\uffff\1\11",
            "\1\10\7\uffff\1\11",
            "\1\12\17\uffff\1\13",
            "\1\10",
            "\1\10",
            "\1\14\17\uffff\1\15",
            "\1\16\32\uffff\1\17",
            "",
            "\1\20\3\uffff\1\21\1\22",
            "\1\20\3\uffff\1\21\1\22",
            "\1\23\3\uffff\1\24\1\22",
            "\1\23\3\uffff\1\24\1\22",
            "\1\25\40\uffff\1\22\15\uffff\1\22",
            "",
            "\1\26\17\uffff\1\27",
            "\1\30\7\uffff\1\11",
            "",
            "\1\31\17\uffff\1\32",
            "\1\30",
            "",
            "\1\20\3\uffff\1\21",
            "\1\20\3\uffff\1\21",
            "\1\25\32\uffff\1\17",
            "\1\23\3\uffff\1\24",
            "\1\23\3\uffff\1\24"
    };

    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final char[] dfa_51 = DFA.unpackEncodedStringToUnsignedChars(dfa_51s);
    static final char[] dfa_52 = DFA.unpackEncodedStringToUnsignedChars(dfa_52s);
    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final short[][] dfa_55 = unpackEncodedStringArray(dfa_55s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_50;
            this.eof = dfa_50;
            this.min = dfa_51;
            this.max = dfa_52;
            this.accept = dfa_53;
            this.special = dfa_54;
            this.transition = dfa_55;
        }
        public String getDescription() {
            return "1842:1: rule__LocalVarDecl__Alternatives : ( ( ( rule__LocalVarDecl__Group_0__0 ) ) | ( ( rule__LocalVarDecl__Group_1__0 ) ) | ( ( rule__LocalVarDecl__Group_2__0 ) ) | ( ( rule__LocalVarDecl__Group_3__0 ) ) );";
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
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000DD42080100010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0004102000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040080100010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000600400000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000DD42080100012L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0008040080100010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0010004000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0005D020800001D0L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00083C0080100010L});

}