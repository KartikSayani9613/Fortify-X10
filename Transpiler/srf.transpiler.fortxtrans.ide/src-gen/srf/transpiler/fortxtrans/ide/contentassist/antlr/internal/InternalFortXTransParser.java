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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'component'", "'api'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int EOF=-1;

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
    // InternalFortXTrans.g:62:1: ruleModel : ( ruleFile ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:66:2: ( ( ruleFile ) )
            // InternalFortXTrans.g:67:2: ( ruleFile )
            {
            // InternalFortXTrans.g:67:2: ( ruleFile )
            // InternalFortXTrans.g:68:3: ruleFile
            {
             before(grammarAccess.getModelAccess().getFileParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFileParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleFile"
    // InternalFortXTrans.g:78:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // InternalFortXTrans.g:79:1: ( ruleFile EOF )
            // InternalFortXTrans.g:80:1: ruleFile EOF
            {
             before(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getFileRule()); 
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
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalFortXTrans.g:87:1: ruleFile : ( ( rule__File__Alternatives ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:91:2: ( ( ( rule__File__Alternatives ) ) )
            // InternalFortXTrans.g:92:2: ( ( rule__File__Alternatives ) )
            {
            // InternalFortXTrans.g:92:2: ( ( rule__File__Alternatives ) )
            // InternalFortXTrans.g:93:3: ( rule__File__Alternatives )
            {
             before(grammarAccess.getFileAccess().getAlternatives()); 
            // InternalFortXTrans.g:94:3: ( rule__File__Alternatives )
            // InternalFortXTrans.g:94:4: rule__File__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__File__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFile"


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


    // $ANTLR start "entryRuleApi"
    // InternalFortXTrans.g:128:1: entryRuleApi : ruleApi EOF ;
    public final void entryRuleApi() throws RecognitionException {
        try {
            // InternalFortXTrans.g:129:1: ( ruleApi EOF )
            // InternalFortXTrans.g:130:1: ruleApi EOF
            {
             before(grammarAccess.getApiRule()); 
            pushFollow(FOLLOW_1);
            ruleApi();

            state._fsp--;

             after(grammarAccess.getApiRule()); 
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
    // $ANTLR end "entryRuleApi"


    // $ANTLR start "ruleApi"
    // InternalFortXTrans.g:137:1: ruleApi : ( ( rule__Api__Group__0 ) ) ;
    public final void ruleApi() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:141:2: ( ( ( rule__Api__Group__0 ) ) )
            // InternalFortXTrans.g:142:2: ( ( rule__Api__Group__0 ) )
            {
            // InternalFortXTrans.g:142:2: ( ( rule__Api__Group__0 ) )
            // InternalFortXTrans.g:143:3: ( rule__Api__Group__0 )
            {
             before(grammarAccess.getApiAccess().getGroup()); 
            // InternalFortXTrans.g:144:3: ( rule__Api__Group__0 )
            // InternalFortXTrans.g:144:4: rule__Api__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Api__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApiAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApi"


    // $ANTLR start "rule__File__Alternatives"
    // InternalFortXTrans.g:152:1: rule__File__Alternatives : ( ( ruleComponent ) | ( ruleApi ) );
    public final void rule__File__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:156:1: ( ( ruleComponent ) | ( ruleApi ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalFortXTrans.g:157:2: ( ruleComponent )
                    {
                    // InternalFortXTrans.g:157:2: ( ruleComponent )
                    // InternalFortXTrans.g:158:3: ruleComponent
                    {
                     before(grammarAccess.getFileAccess().getComponentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComponent();

                    state._fsp--;

                     after(grammarAccess.getFileAccess().getComponentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:163:2: ( ruleApi )
                    {
                    // InternalFortXTrans.g:163:2: ( ruleApi )
                    // InternalFortXTrans.g:164:3: ruleApi
                    {
                     before(grammarAccess.getFileAccess().getApiParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleApi();

                    state._fsp--;

                     after(grammarAccess.getFileAccess().getApiParserRuleCall_1()); 

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
    // $ANTLR end "rule__File__Alternatives"


    // $ANTLR start "rule__Component__Group__0"
    // InternalFortXTrans.g:173:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:177:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalFortXTrans.g:178:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalFortXTrans.g:185:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:189:1: ( ( 'component' ) )
            // InternalFortXTrans.g:190:1: ( 'component' )
            {
            // InternalFortXTrans.g:190:1: ( 'component' )
            // InternalFortXTrans.g:191:2: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalFortXTrans.g:200:1: rule__Component__Group__1 : rule__Component__Group__1__Impl ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:204:1: ( rule__Component__Group__1__Impl )
            // InternalFortXTrans.g:205:2: rule__Component__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalFortXTrans.g:211:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:215:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalFortXTrans.g:216:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalFortXTrans.g:216:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalFortXTrans.g:217:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalFortXTrans.g:218:2: ( rule__Component__NameAssignment_1 )
            // InternalFortXTrans.g:218:3: rule__Component__NameAssignment_1
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


    // $ANTLR start "rule__Api__Group__0"
    // InternalFortXTrans.g:227:1: rule__Api__Group__0 : rule__Api__Group__0__Impl rule__Api__Group__1 ;
    public final void rule__Api__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:231:1: ( rule__Api__Group__0__Impl rule__Api__Group__1 )
            // InternalFortXTrans.g:232:2: rule__Api__Group__0__Impl rule__Api__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Api__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__0"


    // $ANTLR start "rule__Api__Group__0__Impl"
    // InternalFortXTrans.g:239:1: rule__Api__Group__0__Impl : ( 'api' ) ;
    public final void rule__Api__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:243:1: ( ( 'api' ) )
            // InternalFortXTrans.g:244:1: ( 'api' )
            {
            // InternalFortXTrans.g:244:1: ( 'api' )
            // InternalFortXTrans.g:245:2: 'api'
            {
             before(grammarAccess.getApiAccess().getApiKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getApiAccess().getApiKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__0__Impl"


    // $ANTLR start "rule__Api__Group__1"
    // InternalFortXTrans.g:254:1: rule__Api__Group__1 : rule__Api__Group__1__Impl ;
    public final void rule__Api__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:258:1: ( rule__Api__Group__1__Impl )
            // InternalFortXTrans.g:259:2: rule__Api__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Api__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__1"


    // $ANTLR start "rule__Api__Group__1__Impl"
    // InternalFortXTrans.g:265:1: rule__Api__Group__1__Impl : ( ( rule__Api__NameAssignment_1 ) ) ;
    public final void rule__Api__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:269:1: ( ( ( rule__Api__NameAssignment_1 ) ) )
            // InternalFortXTrans.g:270:1: ( ( rule__Api__NameAssignment_1 ) )
            {
            // InternalFortXTrans.g:270:1: ( ( rule__Api__NameAssignment_1 ) )
            // InternalFortXTrans.g:271:2: ( rule__Api__NameAssignment_1 )
            {
             before(grammarAccess.getApiAccess().getNameAssignment_1()); 
            // InternalFortXTrans.g:272:2: ( rule__Api__NameAssignment_1 )
            // InternalFortXTrans.g:272:3: rule__Api__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Api__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApiAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__1__Impl"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalFortXTrans.g:281:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:285:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:286:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:286:2: ( RULE_ID )
            // InternalFortXTrans.g:287:3: RULE_ID
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


    // $ANTLR start "rule__Api__NameAssignment_1"
    // InternalFortXTrans.g:296:1: rule__Api__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Api__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFortXTrans.g:300:1: ( ( RULE_ID ) )
            // InternalFortXTrans.g:301:2: ( RULE_ID )
            {
            // InternalFortXTrans.g:301:2: ( RULE_ID )
            // InternalFortXTrans.g:302:3: RULE_ID
            {
             before(grammarAccess.getApiAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApiAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});

}