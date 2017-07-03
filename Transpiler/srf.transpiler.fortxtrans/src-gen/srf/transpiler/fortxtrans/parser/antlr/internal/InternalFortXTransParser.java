package srf.transpiler.fortxtrans.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import srf.transpiler.fortxtrans.services.FortXTransGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFortXTransParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOTS", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'component'", "'end'", "'api'", "'import'", "'export'", "'{'", "','", "'}'", "'.'", "'except'", "'as'", "'('", "')'", "':'", "'private'", "'test'", "'atomic'", "'io'", "'='", "'|'", "'OR'", "'AND'", "'==='", "'=/='", "'EQ'", "'NE'", "'>='", "'<='", "'>'", "'<'", "'LT'", "'GT'", "'LE'", "'GE'", "'+'", "'-'", "'/'", "'*'", "'^'", "':='", "'['", "'\\\\'", "']'", "'!'", "'return'", "'while'", "'for'", "'if'", "'then'", "'elif'", "'else'", "'<-'", "'seq'", "'#'", "'also'", "'at'", "'do'", "'var'", "'true'", "'false'"
    };
    public static final int T__50=50;
    public static final int RULE_DOTS=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
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

        public InternalFortXTransParser(TokenStream input, FortXTransGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected FortXTransGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalFortXTrans.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalFortXTrans.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalFortXTrans.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalFortXTrans.g:71:1: ruleModel returns [EObject current=null] : (this_Component_0= ruleComponent | this_API_1= ruleAPI ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_Component_0 = null;

        EObject this_API_1 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:77:2: ( (this_Component_0= ruleComponent | this_API_1= ruleAPI ) )
            // InternalFortXTrans.g:78:2: (this_Component_0= ruleComponent | this_API_1= ruleAPI )
            {
            // InternalFortXTrans.g:78:2: (this_Component_0= ruleComponent | this_API_1= ruleAPI )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalFortXTrans.g:79:3: this_Component_0= ruleComponent
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getComponentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Component_0=ruleComponent();

                    state._fsp--;


                    			current = this_Component_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:88:3: this_API_1= ruleAPI
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getAPIParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_API_1=ruleAPI();

                    state._fsp--;


                    			current = this_API_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleComponent"
    // InternalFortXTrans.g:100:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalFortXTrans.g:100:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalFortXTrans.g:101:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalFortXTrans.g:107:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_exports_3_0= ruleExport ) )+ ( (lv_decls_4_0= ruleDecls ) )* otherlv_5= 'end' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_5=null;
        EObject lv_imports_2_0 = null;

        EObject lv_exports_3_0 = null;

        EObject lv_decls_4_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:113:2: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_exports_3_0= ruleExport ) )+ ( (lv_decls_4_0= ruleDecls ) )* otherlv_5= 'end' ) )
            // InternalFortXTrans.g:114:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_exports_3_0= ruleExport ) )+ ( (lv_decls_4_0= ruleDecls ) )* otherlv_5= 'end' )
            {
            // InternalFortXTrans.g:114:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_exports_3_0= ruleExport ) )+ ( (lv_decls_4_0= ruleDecls ) )* otherlv_5= 'end' )
            // InternalFortXTrans.g:115:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_exports_3_0= ruleExport ) )+ ( (lv_decls_4_0= ruleDecls ) )* otherlv_5= 'end'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalFortXTrans.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFortXTrans.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFortXTrans.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalFortXTrans.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalFortXTrans.g:137:3: ( (lv_imports_2_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFortXTrans.g:138:4: (lv_imports_2_0= ruleImport )
            	    {
            	    // InternalFortXTrans.g:138:4: (lv_imports_2_0= ruleImport )
            	    // InternalFortXTrans.g:139:5: lv_imports_2_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getComponentAccess().getImportsImportParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_2_0,
            	    						"srf.transpiler.fortxtrans.FortXTrans.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalFortXTrans.g:156:3: ( (lv_exports_3_0= ruleExport ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFortXTrans.g:157:4: (lv_exports_3_0= ruleExport )
            	    {
            	    // InternalFortXTrans.g:157:4: (lv_exports_3_0= ruleExport )
            	    // InternalFortXTrans.g:158:5: lv_exports_3_0= ruleExport
            	    {

            	    					newCompositeNode(grammarAccess.getComponentAccess().getExportsExportParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_exports_3_0=ruleExport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"exports",
            	    						lv_exports_3_0,
            	    						"srf.transpiler.fortxtrans.FortXTrans.Export");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalFortXTrans.g:175:3: ( (lv_decls_4_0= ruleDecls ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==24||(LA4_0>=27 && LA4_0<=30)||LA4_0==70) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFortXTrans.g:176:4: (lv_decls_4_0= ruleDecls )
            	    {
            	    // InternalFortXTrans.g:176:4: (lv_decls_4_0= ruleDecls )
            	    // InternalFortXTrans.g:177:5: lv_decls_4_0= ruleDecls
            	    {

            	    					newCompositeNode(grammarAccess.getComponentAccess().getDeclsDeclsParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_decls_4_0=ruleDecls();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"decls",
            	    						lv_decls_4_0,
            	    						"srf.transpiler.fortxtrans.FortXTrans.Decls");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getEndKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleAPI"
    // InternalFortXTrans.g:202:1: entryRuleAPI returns [EObject current=null] : iv_ruleAPI= ruleAPI EOF ;
    public final EObject entryRuleAPI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAPI = null;


        try {
            // InternalFortXTrans.g:202:44: (iv_ruleAPI= ruleAPI EOF )
            // InternalFortXTrans.g:203:2: iv_ruleAPI= ruleAPI EOF
            {
             newCompositeNode(grammarAccess.getAPIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAPI=ruleAPI();

            state._fsp--;

             current =iv_ruleAPI; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAPI"


    // $ANTLR start "ruleAPI"
    // InternalFortXTrans.g:209:1: ruleAPI returns [EObject current=null] : (otherlv_0= 'api' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'end' ) ;
    public final EObject ruleAPI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_imports_2_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:215:2: ( (otherlv_0= 'api' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'end' ) )
            // InternalFortXTrans.g:216:2: (otherlv_0= 'api' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'end' )
            {
            // InternalFortXTrans.g:216:2: (otherlv_0= 'api' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'end' )
            // InternalFortXTrans.g:217:3: otherlv_0= 'api' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'end'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAPIAccess().getApiKeyword_0());
            		
            // InternalFortXTrans.g:221:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFortXTrans.g:222:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFortXTrans.g:222:4: (lv_name_1_0= RULE_ID )
            // InternalFortXTrans.g:223:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAPIAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAPIRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalFortXTrans.g:239:3: ( (lv_imports_2_0= ruleImport ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFortXTrans.g:240:4: (lv_imports_2_0= ruleImport )
            	    {
            	    // InternalFortXTrans.g:240:4: (lv_imports_2_0= ruleImport )
            	    // InternalFortXTrans.g:241:5: lv_imports_2_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getAPIAccess().getImportsImportParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAPIRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_2_0,
            	    						"srf.transpiler.fortxtrans.FortXTrans.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAPIAccess().getEndKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAPI"


    // $ANTLR start "entryRuleImport"
    // InternalFortXTrans.g:266:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalFortXTrans.g:266:47: (iv_ruleImport= ruleImport EOF )
            // InternalFortXTrans.g:267:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalFortXTrans.g:273:1: ruleImport returns [EObject current=null] : ( ( ( (lv_imps_0_0= 'import' ) ) ( (lv_importedNames_1_0= ruleImportedNames ) ) ) | ( ( (lv_imps_2_0= 'import' ) ) ( (lv_api_3_0= 'api' ) ) ( (lv_aliasedimportedNames_4_0= ruleAliasedAPINames ) ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_imps_0_0=null;
        Token lv_imps_2_0=null;
        Token lv_api_3_0=null;
        EObject lv_importedNames_1_0 = null;

        EObject lv_aliasedimportedNames_4_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:279:2: ( ( ( ( (lv_imps_0_0= 'import' ) ) ( (lv_importedNames_1_0= ruleImportedNames ) ) ) | ( ( (lv_imps_2_0= 'import' ) ) ( (lv_api_3_0= 'api' ) ) ( (lv_aliasedimportedNames_4_0= ruleAliasedAPINames ) ) ) ) )
            // InternalFortXTrans.g:280:2: ( ( ( (lv_imps_0_0= 'import' ) ) ( (lv_importedNames_1_0= ruleImportedNames ) ) ) | ( ( (lv_imps_2_0= 'import' ) ) ( (lv_api_3_0= 'api' ) ) ( (lv_aliasedimportedNames_4_0= ruleAliasedAPINames ) ) ) )
            {
            // InternalFortXTrans.g:280:2: ( ( ( (lv_imps_0_0= 'import' ) ) ( (lv_importedNames_1_0= ruleImportedNames ) ) ) | ( ( (lv_imps_2_0= 'import' ) ) ( (lv_api_3_0= 'api' ) ) ( (lv_aliasedimportedNames_4_0= ruleAliasedAPINames ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    alt6=1;
                }
                else if ( (LA6_1==15) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalFortXTrans.g:281:3: ( ( (lv_imps_0_0= 'import' ) ) ( (lv_importedNames_1_0= ruleImportedNames ) ) )
                    {
                    // InternalFortXTrans.g:281:3: ( ( (lv_imps_0_0= 'import' ) ) ( (lv_importedNames_1_0= ruleImportedNames ) ) )
                    // InternalFortXTrans.g:282:4: ( (lv_imps_0_0= 'import' ) ) ( (lv_importedNames_1_0= ruleImportedNames ) )
                    {
                    // InternalFortXTrans.g:282:4: ( (lv_imps_0_0= 'import' ) )
                    // InternalFortXTrans.g:283:5: (lv_imps_0_0= 'import' )
                    {
                    // InternalFortXTrans.g:283:5: (lv_imps_0_0= 'import' )
                    // InternalFortXTrans.g:284:6: lv_imps_0_0= 'import'
                    {
                    lv_imps_0_0=(Token)match(input,16,FOLLOW_3); 

                    						newLeafNode(lv_imps_0_0, grammarAccess.getImportAccess().getImpsImportKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImportRule());
                    						}
                    						setWithLastConsumed(current, "imps", lv_imps_0_0, "import");
                    					

                    }


                    }

                    // InternalFortXTrans.g:296:4: ( (lv_importedNames_1_0= ruleImportedNames ) )
                    // InternalFortXTrans.g:297:5: (lv_importedNames_1_0= ruleImportedNames )
                    {
                    // InternalFortXTrans.g:297:5: (lv_importedNames_1_0= ruleImportedNames )
                    // InternalFortXTrans.g:298:6: lv_importedNames_1_0= ruleImportedNames
                    {

                    						newCompositeNode(grammarAccess.getImportAccess().getImportedNamesImportedNamesParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_importedNames_1_0=ruleImportedNames();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImportRule());
                    						}
                    						set(
                    							current,
                    							"importedNames",
                    							lv_importedNames_1_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.ImportedNames");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:317:3: ( ( (lv_imps_2_0= 'import' ) ) ( (lv_api_3_0= 'api' ) ) ( (lv_aliasedimportedNames_4_0= ruleAliasedAPINames ) ) )
                    {
                    // InternalFortXTrans.g:317:3: ( ( (lv_imps_2_0= 'import' ) ) ( (lv_api_3_0= 'api' ) ) ( (lv_aliasedimportedNames_4_0= ruleAliasedAPINames ) ) )
                    // InternalFortXTrans.g:318:4: ( (lv_imps_2_0= 'import' ) ) ( (lv_api_3_0= 'api' ) ) ( (lv_aliasedimportedNames_4_0= ruleAliasedAPINames ) )
                    {
                    // InternalFortXTrans.g:318:4: ( (lv_imps_2_0= 'import' ) )
                    // InternalFortXTrans.g:319:5: (lv_imps_2_0= 'import' )
                    {
                    // InternalFortXTrans.g:319:5: (lv_imps_2_0= 'import' )
                    // InternalFortXTrans.g:320:6: lv_imps_2_0= 'import'
                    {
                    lv_imps_2_0=(Token)match(input,16,FOLLOW_8); 

                    						newLeafNode(lv_imps_2_0, grammarAccess.getImportAccess().getImpsImportKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImportRule());
                    						}
                    						setWithLastConsumed(current, "imps", lv_imps_2_0, "import");
                    					

                    }


                    }

                    // InternalFortXTrans.g:332:4: ( (lv_api_3_0= 'api' ) )
                    // InternalFortXTrans.g:333:5: (lv_api_3_0= 'api' )
                    {
                    // InternalFortXTrans.g:333:5: (lv_api_3_0= 'api' )
                    // InternalFortXTrans.g:334:6: lv_api_3_0= 'api'
                    {
                    lv_api_3_0=(Token)match(input,15,FOLLOW_9); 

                    						newLeafNode(lv_api_3_0, grammarAccess.getImportAccess().getApiApiKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImportRule());
                    						}
                    						setWithLastConsumed(current, "api", lv_api_3_0, "api");
                    					

                    }


                    }

                    // InternalFortXTrans.g:346:4: ( (lv_aliasedimportedNames_4_0= ruleAliasedAPINames ) )
                    // InternalFortXTrans.g:347:5: (lv_aliasedimportedNames_4_0= ruleAliasedAPINames )
                    {
                    // InternalFortXTrans.g:347:5: (lv_aliasedimportedNames_4_0= ruleAliasedAPINames )
                    // InternalFortXTrans.g:348:6: lv_aliasedimportedNames_4_0= ruleAliasedAPINames
                    {

                    						newCompositeNode(grammarAccess.getImportAccess().getAliasedimportedNamesAliasedAPINamesParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_aliasedimportedNames_4_0=ruleAliasedAPINames();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImportRule());
                    						}
                    						set(
                    							current,
                    							"aliasedimportedNames",
                    							lv_aliasedimportedNames_4_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.AliasedAPINames");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleExport"
    // InternalFortXTrans.g:370:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalFortXTrans.g:370:47: (iv_ruleExport= ruleExport EOF )
            // InternalFortXTrans.g:371:2: iv_ruleExport= ruleExport EOF
            {
             newCompositeNode(grammarAccess.getExportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExport=ruleExport();

            state._fsp--;

             current =iv_ruleExport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExport"


    // $ANTLR start "ruleExport"
    // InternalFortXTrans.g:377:1: ruleExport returns [EObject current=null] : ( ( ( (lv_exp_0_0= 'export' ) ) ( (lv_exportedName_1_0= ruleQualifiedName ) ) ) | ( ( (lv_exp_2_0= 'export' ) ) ( (lv_brack_3_0= '{' ) ) ( (lv_exportedName_4_0= ruleQualifiedName ) ) (otherlv_5= ',' ( (lv_exportedName_6_0= ruleQualifiedName ) ) )* otherlv_7= '}' ) ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token lv_exp_0_0=null;
        Token lv_exp_2_0=null;
        Token lv_brack_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_exportedName_1_0 = null;

        EObject lv_exportedName_4_0 = null;

        EObject lv_exportedName_6_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:383:2: ( ( ( ( (lv_exp_0_0= 'export' ) ) ( (lv_exportedName_1_0= ruleQualifiedName ) ) ) | ( ( (lv_exp_2_0= 'export' ) ) ( (lv_brack_3_0= '{' ) ) ( (lv_exportedName_4_0= ruleQualifiedName ) ) (otherlv_5= ',' ( (lv_exportedName_6_0= ruleQualifiedName ) ) )* otherlv_7= '}' ) ) )
            // InternalFortXTrans.g:384:2: ( ( ( (lv_exp_0_0= 'export' ) ) ( (lv_exportedName_1_0= ruleQualifiedName ) ) ) | ( ( (lv_exp_2_0= 'export' ) ) ( (lv_brack_3_0= '{' ) ) ( (lv_exportedName_4_0= ruleQualifiedName ) ) (otherlv_5= ',' ( (lv_exportedName_6_0= ruleQualifiedName ) ) )* otherlv_7= '}' ) )
            {
            // InternalFortXTrans.g:384:2: ( ( ( (lv_exp_0_0= 'export' ) ) ( (lv_exportedName_1_0= ruleQualifiedName ) ) ) | ( ( (lv_exp_2_0= 'export' ) ) ( (lv_brack_3_0= '{' ) ) ( (lv_exportedName_4_0= ruleQualifiedName ) ) (otherlv_5= ',' ( (lv_exportedName_6_0= ruleQualifiedName ) ) )* otherlv_7= '}' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    alt8=1;
                }
                else if ( (LA8_1==18) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFortXTrans.g:385:3: ( ( (lv_exp_0_0= 'export' ) ) ( (lv_exportedName_1_0= ruleQualifiedName ) ) )
                    {
                    // InternalFortXTrans.g:385:3: ( ( (lv_exp_0_0= 'export' ) ) ( (lv_exportedName_1_0= ruleQualifiedName ) ) )
                    // InternalFortXTrans.g:386:4: ( (lv_exp_0_0= 'export' ) ) ( (lv_exportedName_1_0= ruleQualifiedName ) )
                    {
                    // InternalFortXTrans.g:386:4: ( (lv_exp_0_0= 'export' ) )
                    // InternalFortXTrans.g:387:5: (lv_exp_0_0= 'export' )
                    {
                    // InternalFortXTrans.g:387:5: (lv_exp_0_0= 'export' )
                    // InternalFortXTrans.g:388:6: lv_exp_0_0= 'export'
                    {
                    lv_exp_0_0=(Token)match(input,17,FOLLOW_3); 

                    						newLeafNode(lv_exp_0_0, grammarAccess.getExportAccess().getExpExportKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExportRule());
                    						}
                    						setWithLastConsumed(current, "exp", lv_exp_0_0, "export");
                    					

                    }


                    }

                    // InternalFortXTrans.g:400:4: ( (lv_exportedName_1_0= ruleQualifiedName ) )
                    // InternalFortXTrans.g:401:5: (lv_exportedName_1_0= ruleQualifiedName )
                    {
                    // InternalFortXTrans.g:401:5: (lv_exportedName_1_0= ruleQualifiedName )
                    // InternalFortXTrans.g:402:6: lv_exportedName_1_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getExportAccess().getExportedNameQualifiedNameParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exportedName_1_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExportRule());
                    						}
                    						add(
                    							current,
                    							"exportedName",
                    							lv_exportedName_1_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:421:3: ( ( (lv_exp_2_0= 'export' ) ) ( (lv_brack_3_0= '{' ) ) ( (lv_exportedName_4_0= ruleQualifiedName ) ) (otherlv_5= ',' ( (lv_exportedName_6_0= ruleQualifiedName ) ) )* otherlv_7= '}' )
                    {
                    // InternalFortXTrans.g:421:3: ( ( (lv_exp_2_0= 'export' ) ) ( (lv_brack_3_0= '{' ) ) ( (lv_exportedName_4_0= ruleQualifiedName ) ) (otherlv_5= ',' ( (lv_exportedName_6_0= ruleQualifiedName ) ) )* otherlv_7= '}' )
                    // InternalFortXTrans.g:422:4: ( (lv_exp_2_0= 'export' ) ) ( (lv_brack_3_0= '{' ) ) ( (lv_exportedName_4_0= ruleQualifiedName ) ) (otherlv_5= ',' ( (lv_exportedName_6_0= ruleQualifiedName ) ) )* otherlv_7= '}'
                    {
                    // InternalFortXTrans.g:422:4: ( (lv_exp_2_0= 'export' ) )
                    // InternalFortXTrans.g:423:5: (lv_exp_2_0= 'export' )
                    {
                    // InternalFortXTrans.g:423:5: (lv_exp_2_0= 'export' )
                    // InternalFortXTrans.g:424:6: lv_exp_2_0= 'export'
                    {
                    lv_exp_2_0=(Token)match(input,17,FOLLOW_10); 

                    						newLeafNode(lv_exp_2_0, grammarAccess.getExportAccess().getExpExportKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExportRule());
                    						}
                    						setWithLastConsumed(current, "exp", lv_exp_2_0, "export");
                    					

                    }


                    }

                    // InternalFortXTrans.g:436:4: ( (lv_brack_3_0= '{' ) )
                    // InternalFortXTrans.g:437:5: (lv_brack_3_0= '{' )
                    {
                    // InternalFortXTrans.g:437:5: (lv_brack_3_0= '{' )
                    // InternalFortXTrans.g:438:6: lv_brack_3_0= '{'
                    {
                    lv_brack_3_0=(Token)match(input,18,FOLLOW_3); 

                    						newLeafNode(lv_brack_3_0, grammarAccess.getExportAccess().getBrackLeftCurlyBracketKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExportRule());
                    						}
                    						setWithLastConsumed(current, "brack", lv_brack_3_0, "{");
                    					

                    }


                    }

                    // InternalFortXTrans.g:450:4: ( (lv_exportedName_4_0= ruleQualifiedName ) )
                    // InternalFortXTrans.g:451:5: (lv_exportedName_4_0= ruleQualifiedName )
                    {
                    // InternalFortXTrans.g:451:5: (lv_exportedName_4_0= ruleQualifiedName )
                    // InternalFortXTrans.g:452:6: lv_exportedName_4_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getExportAccess().getExportedNameQualifiedNameParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_exportedName_4_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExportRule());
                    						}
                    						add(
                    							current,
                    							"exportedName",
                    							lv_exportedName_4_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:469:4: (otherlv_5= ',' ( (lv_exportedName_6_0= ruleQualifiedName ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==19) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalFortXTrans.g:470:5: otherlv_5= ',' ( (lv_exportedName_6_0= ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getExportAccess().getCommaKeyword_1_3_0());
                    	    				
                    	    // InternalFortXTrans.g:474:5: ( (lv_exportedName_6_0= ruleQualifiedName ) )
                    	    // InternalFortXTrans.g:475:6: (lv_exportedName_6_0= ruleQualifiedName )
                    	    {
                    	    // InternalFortXTrans.g:475:6: (lv_exportedName_6_0= ruleQualifiedName )
                    	    // InternalFortXTrans.g:476:7: lv_exportedName_6_0= ruleQualifiedName
                    	    {

                    	    							newCompositeNode(grammarAccess.getExportAccess().getExportedNameQualifiedNameParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_exportedName_6_0=ruleQualifiedName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExportRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"exportedName",
                    	    								lv_exportedName_6_0,
                    	    								"srf.transpiler.fortxtrans.FortXTrans.QualifiedName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getExportAccess().getRightCurlyBracketKeyword_1_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExport"


    // $ANTLR start "entryRuleImportedNames"
    // InternalFortXTrans.g:503:1: entryRuleImportedNames returns [EObject current=null] : iv_ruleImportedNames= ruleImportedNames EOF ;
    public final EObject entryRuleImportedNames() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportedNames = null;


        try {
            // InternalFortXTrans.g:503:54: (iv_ruleImportedNames= ruleImportedNames EOF )
            // InternalFortXTrans.g:504:2: iv_ruleImportedNames= ruleImportedNames EOF
            {
             newCompositeNode(grammarAccess.getImportedNamesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportedNames=ruleImportedNames();

            state._fsp--;

             current =iv_ruleImportedNames; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportedNames"


    // $ANTLR start "ruleImportedNames"
    // InternalFortXTrans.g:510:1: ruleImportedNames returns [EObject current=null] : ( ( ( (lv_impname_0_0= ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= '{' this_DOTS_3= RULE_DOTS otherlv_4= '}' ( ( (lv_except_5_0= 'except' ) ) ( (lv_simp_6_0= ruleSimpleNames ) ) )? ) | ( ( (lv_impname_7_0= ruleQualifiedName ) ) otherlv_8= '.' otherlv_9= '{' ( (lv_simpList_10_0= ruleAliasedSimpleName ) ) (otherlv_11= ',' ( (lv_simpList_12_0= ruleAliasedSimpleName ) ) )* ( ( (lv_comma_13_0= ',' ) ) ( (lv_dots_14_0= RULE_DOTS ) ) )? otherlv_15= '}' ) | ( ( (lv_impname_16_0= ruleQualifiedName ) ) (otherlv_17= 'as' ( (lv_asname_18_0= RULE_ID ) ) )? ) ) ;
    public final EObject ruleImportedNames() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_DOTS_3=null;
        Token otherlv_4=null;
        Token lv_except_5_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_comma_13_0=null;
        Token lv_dots_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token lv_asname_18_0=null;
        EObject lv_impname_0_0 = null;

        EObject lv_simp_6_0 = null;

        EObject lv_impname_7_0 = null;

        EObject lv_simpList_10_0 = null;

        EObject lv_simpList_12_0 = null;

        EObject lv_impname_16_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:516:2: ( ( ( ( (lv_impname_0_0= ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= '{' this_DOTS_3= RULE_DOTS otherlv_4= '}' ( ( (lv_except_5_0= 'except' ) ) ( (lv_simp_6_0= ruleSimpleNames ) ) )? ) | ( ( (lv_impname_7_0= ruleQualifiedName ) ) otherlv_8= '.' otherlv_9= '{' ( (lv_simpList_10_0= ruleAliasedSimpleName ) ) (otherlv_11= ',' ( (lv_simpList_12_0= ruleAliasedSimpleName ) ) )* ( ( (lv_comma_13_0= ',' ) ) ( (lv_dots_14_0= RULE_DOTS ) ) )? otherlv_15= '}' ) | ( ( (lv_impname_16_0= ruleQualifiedName ) ) (otherlv_17= 'as' ( (lv_asname_18_0= RULE_ID ) ) )? ) ) )
            // InternalFortXTrans.g:517:2: ( ( ( (lv_impname_0_0= ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= '{' this_DOTS_3= RULE_DOTS otherlv_4= '}' ( ( (lv_except_5_0= 'except' ) ) ( (lv_simp_6_0= ruleSimpleNames ) ) )? ) | ( ( (lv_impname_7_0= ruleQualifiedName ) ) otherlv_8= '.' otherlv_9= '{' ( (lv_simpList_10_0= ruleAliasedSimpleName ) ) (otherlv_11= ',' ( (lv_simpList_12_0= ruleAliasedSimpleName ) ) )* ( ( (lv_comma_13_0= ',' ) ) ( (lv_dots_14_0= RULE_DOTS ) ) )? otherlv_15= '}' ) | ( ( (lv_impname_16_0= ruleQualifiedName ) ) (otherlv_17= 'as' ( (lv_asname_18_0= RULE_ID ) ) )? ) )
            {
            // InternalFortXTrans.g:517:2: ( ( ( (lv_impname_0_0= ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= '{' this_DOTS_3= RULE_DOTS otherlv_4= '}' ( ( (lv_except_5_0= 'except' ) ) ( (lv_simp_6_0= ruleSimpleNames ) ) )? ) | ( ( (lv_impname_7_0= ruleQualifiedName ) ) otherlv_8= '.' otherlv_9= '{' ( (lv_simpList_10_0= ruleAliasedSimpleName ) ) (otherlv_11= ',' ( (lv_simpList_12_0= ruleAliasedSimpleName ) ) )* ( ( (lv_comma_13_0= ',' ) ) ( (lv_dots_14_0= RULE_DOTS ) ) )? otherlv_15= '}' ) | ( ( (lv_impname_16_0= ruleQualifiedName ) ) (otherlv_17= 'as' ( (lv_asname_18_0= RULE_ID ) ) )? ) )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalFortXTrans.g:518:3: ( ( (lv_impname_0_0= ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= '{' this_DOTS_3= RULE_DOTS otherlv_4= '}' ( ( (lv_except_5_0= 'except' ) ) ( (lv_simp_6_0= ruleSimpleNames ) ) )? )
                    {
                    // InternalFortXTrans.g:518:3: ( ( (lv_impname_0_0= ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= '{' this_DOTS_3= RULE_DOTS otherlv_4= '}' ( ( (lv_except_5_0= 'except' ) ) ( (lv_simp_6_0= ruleSimpleNames ) ) )? )
                    // InternalFortXTrans.g:519:4: ( (lv_impname_0_0= ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= '{' this_DOTS_3= RULE_DOTS otherlv_4= '}' ( ( (lv_except_5_0= 'except' ) ) ( (lv_simp_6_0= ruleSimpleNames ) ) )?
                    {
                    // InternalFortXTrans.g:519:4: ( (lv_impname_0_0= ruleQualifiedName ) )
                    // InternalFortXTrans.g:520:5: (lv_impname_0_0= ruleQualifiedName )
                    {
                    // InternalFortXTrans.g:520:5: (lv_impname_0_0= ruleQualifiedName )
                    // InternalFortXTrans.g:521:6: lv_impname_0_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getImportedNamesAccess().getImpnameQualifiedNameParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_impname_0_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImportedNamesRule());
                    						}
                    						set(
                    							current,
                    							"impname",
                    							lv_impname_0_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getImportedNamesAccess().getFullStopKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getImportedNamesAccess().getLeftCurlyBracketKeyword_0_2());
                    			
                    this_DOTS_3=(Token)match(input,RULE_DOTS,FOLLOW_14); 

                    				newLeafNode(this_DOTS_3, grammarAccess.getImportedNamesAccess().getDOTSTerminalRuleCall_0_3());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getImportedNamesAccess().getRightCurlyBracketKeyword_0_4());
                    			
                    // InternalFortXTrans.g:554:4: ( ( (lv_except_5_0= 'except' ) ) ( (lv_simp_6_0= ruleSimpleNames ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==22) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalFortXTrans.g:555:5: ( (lv_except_5_0= 'except' ) ) ( (lv_simp_6_0= ruleSimpleNames ) )
                            {
                            // InternalFortXTrans.g:555:5: ( (lv_except_5_0= 'except' ) )
                            // InternalFortXTrans.g:556:6: (lv_except_5_0= 'except' )
                            {
                            // InternalFortXTrans.g:556:6: (lv_except_5_0= 'except' )
                            // InternalFortXTrans.g:557:7: lv_except_5_0= 'except'
                            {
                            lv_except_5_0=(Token)match(input,22,FOLLOW_9); 

                            							newLeafNode(lv_except_5_0, grammarAccess.getImportedNamesAccess().getExceptExceptKeyword_0_5_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getImportedNamesRule());
                            							}
                            							setWithLastConsumed(current, "except", true, "except");
                            						

                            }


                            }

                            // InternalFortXTrans.g:569:5: ( (lv_simp_6_0= ruleSimpleNames ) )
                            // InternalFortXTrans.g:570:6: (lv_simp_6_0= ruleSimpleNames )
                            {
                            // InternalFortXTrans.g:570:6: (lv_simp_6_0= ruleSimpleNames )
                            // InternalFortXTrans.g:571:7: lv_simp_6_0= ruleSimpleNames
                            {

                            							newCompositeNode(grammarAccess.getImportedNamesAccess().getSimpSimpleNamesParserRuleCall_0_5_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_simp_6_0=ruleSimpleNames();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getImportedNamesRule());
                            							}
                            							set(
                            								current,
                            								"simp",
                            								lv_simp_6_0,
                            								"srf.transpiler.fortxtrans.FortXTrans.SimpleNames");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:591:3: ( ( (lv_impname_7_0= ruleQualifiedName ) ) otherlv_8= '.' otherlv_9= '{' ( (lv_simpList_10_0= ruleAliasedSimpleName ) ) (otherlv_11= ',' ( (lv_simpList_12_0= ruleAliasedSimpleName ) ) )* ( ( (lv_comma_13_0= ',' ) ) ( (lv_dots_14_0= RULE_DOTS ) ) )? otherlv_15= '}' )
                    {
                    // InternalFortXTrans.g:591:3: ( ( (lv_impname_7_0= ruleQualifiedName ) ) otherlv_8= '.' otherlv_9= '{' ( (lv_simpList_10_0= ruleAliasedSimpleName ) ) (otherlv_11= ',' ( (lv_simpList_12_0= ruleAliasedSimpleName ) ) )* ( ( (lv_comma_13_0= ',' ) ) ( (lv_dots_14_0= RULE_DOTS ) ) )? otherlv_15= '}' )
                    // InternalFortXTrans.g:592:4: ( (lv_impname_7_0= ruleQualifiedName ) ) otherlv_8= '.' otherlv_9= '{' ( (lv_simpList_10_0= ruleAliasedSimpleName ) ) (otherlv_11= ',' ( (lv_simpList_12_0= ruleAliasedSimpleName ) ) )* ( ( (lv_comma_13_0= ',' ) ) ( (lv_dots_14_0= RULE_DOTS ) ) )? otherlv_15= '}'
                    {
                    // InternalFortXTrans.g:592:4: ( (lv_impname_7_0= ruleQualifiedName ) )
                    // InternalFortXTrans.g:593:5: (lv_impname_7_0= ruleQualifiedName )
                    {
                    // InternalFortXTrans.g:593:5: (lv_impname_7_0= ruleQualifiedName )
                    // InternalFortXTrans.g:594:6: lv_impname_7_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getImportedNamesAccess().getImpnameQualifiedNameParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_impname_7_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImportedNamesRule());
                    						}
                    						set(
                    							current,
                    							"impname",
                    							lv_impname_7_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getImportedNamesAccess().getFullStopKeyword_1_1());
                    			
                    otherlv_9=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getImportedNamesAccess().getLeftCurlyBracketKeyword_1_2());
                    			
                    // InternalFortXTrans.g:619:4: ( (lv_simpList_10_0= ruleAliasedSimpleName ) )
                    // InternalFortXTrans.g:620:5: (lv_simpList_10_0= ruleAliasedSimpleName )
                    {
                    // InternalFortXTrans.g:620:5: (lv_simpList_10_0= ruleAliasedSimpleName )
                    // InternalFortXTrans.g:621:6: lv_simpList_10_0= ruleAliasedSimpleName
                    {

                    						newCompositeNode(grammarAccess.getImportedNamesAccess().getSimpListAliasedSimpleNameParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_simpList_10_0=ruleAliasedSimpleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImportedNamesRule());
                    						}
                    						add(
                    							current,
                    							"simpList",
                    							lv_simpList_10_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.AliasedSimpleName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:638:4: (otherlv_11= ',' ( (lv_simpList_12_0= ruleAliasedSimpleName ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==19) ) {
                            int LA10_1 = input.LA(2);

                            if ( (LA10_1==RULE_ID) ) {
                                alt10=1;
                            }


                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalFortXTrans.g:639:5: otherlv_11= ',' ( (lv_simpList_12_0= ruleAliasedSimpleName ) )
                    	    {
                    	    otherlv_11=(Token)match(input,19,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getImportedNamesAccess().getCommaKeyword_1_4_0());
                    	    				
                    	    // InternalFortXTrans.g:643:5: ( (lv_simpList_12_0= ruleAliasedSimpleName ) )
                    	    // InternalFortXTrans.g:644:6: (lv_simpList_12_0= ruleAliasedSimpleName )
                    	    {
                    	    // InternalFortXTrans.g:644:6: (lv_simpList_12_0= ruleAliasedSimpleName )
                    	    // InternalFortXTrans.g:645:7: lv_simpList_12_0= ruleAliasedSimpleName
                    	    {

                    	    							newCompositeNode(grammarAccess.getImportedNamesAccess().getSimpListAliasedSimpleNameParserRuleCall_1_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_simpList_12_0=ruleAliasedSimpleName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getImportedNamesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"simpList",
                    	    								lv_simpList_12_0,
                    	    								"srf.transpiler.fortxtrans.FortXTrans.AliasedSimpleName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // InternalFortXTrans.g:663:4: ( ( (lv_comma_13_0= ',' ) ) ( (lv_dots_14_0= RULE_DOTS ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==19) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalFortXTrans.g:664:5: ( (lv_comma_13_0= ',' ) ) ( (lv_dots_14_0= RULE_DOTS ) )
                            {
                            // InternalFortXTrans.g:664:5: ( (lv_comma_13_0= ',' ) )
                            // InternalFortXTrans.g:665:6: (lv_comma_13_0= ',' )
                            {
                            // InternalFortXTrans.g:665:6: (lv_comma_13_0= ',' )
                            // InternalFortXTrans.g:666:7: lv_comma_13_0= ','
                            {
                            lv_comma_13_0=(Token)match(input,19,FOLLOW_13); 

                            							newLeafNode(lv_comma_13_0, grammarAccess.getImportedNamesAccess().getCommaCommaKeyword_1_5_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getImportedNamesRule());
                            							}
                            							setWithLastConsumed(current, "comma", true, ",");
                            						

                            }


                            }

                            // InternalFortXTrans.g:678:5: ( (lv_dots_14_0= RULE_DOTS ) )
                            // InternalFortXTrans.g:679:6: (lv_dots_14_0= RULE_DOTS )
                            {
                            // InternalFortXTrans.g:679:6: (lv_dots_14_0= RULE_DOTS )
                            // InternalFortXTrans.g:680:7: lv_dots_14_0= RULE_DOTS
                            {
                            lv_dots_14_0=(Token)match(input,RULE_DOTS,FOLLOW_14); 

                            							newLeafNode(lv_dots_14_0, grammarAccess.getImportedNamesAccess().getDotsDOTSTerminalRuleCall_1_5_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getImportedNamesRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"dots",
                            								true,
                            								"srf.transpiler.fortxtrans.FortXTrans.DOTS");
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getImportedNamesAccess().getRightCurlyBracketKeyword_1_6());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:703:3: ( ( (lv_impname_16_0= ruleQualifiedName ) ) (otherlv_17= 'as' ( (lv_asname_18_0= RULE_ID ) ) )? )
                    {
                    // InternalFortXTrans.g:703:3: ( ( (lv_impname_16_0= ruleQualifiedName ) ) (otherlv_17= 'as' ( (lv_asname_18_0= RULE_ID ) ) )? )
                    // InternalFortXTrans.g:704:4: ( (lv_impname_16_0= ruleQualifiedName ) ) (otherlv_17= 'as' ( (lv_asname_18_0= RULE_ID ) ) )?
                    {
                    // InternalFortXTrans.g:704:4: ( (lv_impname_16_0= ruleQualifiedName ) )
                    // InternalFortXTrans.g:705:5: (lv_impname_16_0= ruleQualifiedName )
                    {
                    // InternalFortXTrans.g:705:5: (lv_impname_16_0= ruleQualifiedName )
                    // InternalFortXTrans.g:706:6: lv_impname_16_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getImportedNamesAccess().getImpnameQualifiedNameParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_impname_16_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImportedNamesRule());
                    						}
                    						set(
                    							current,
                    							"impname",
                    							lv_impname_16_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:723:4: (otherlv_17= 'as' ( (lv_asname_18_0= RULE_ID ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==23) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalFortXTrans.g:724:5: otherlv_17= 'as' ( (lv_asname_18_0= RULE_ID ) )
                            {
                            otherlv_17=(Token)match(input,23,FOLLOW_3); 

                            					newLeafNode(otherlv_17, grammarAccess.getImportedNamesAccess().getAsKeyword_2_1_0());
                            				
                            // InternalFortXTrans.g:728:5: ( (lv_asname_18_0= RULE_ID ) )
                            // InternalFortXTrans.g:729:6: (lv_asname_18_0= RULE_ID )
                            {
                            // InternalFortXTrans.g:729:6: (lv_asname_18_0= RULE_ID )
                            // InternalFortXTrans.g:730:7: lv_asname_18_0= RULE_ID
                            {
                            lv_asname_18_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_asname_18_0, grammarAccess.getImportedNamesAccess().getAsnameIDTerminalRuleCall_2_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getImportedNamesRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"asname",
                            								lv_asname_18_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportedNames"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalFortXTrans.g:752:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // InternalFortXTrans.g:752:54: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalFortXTrans.g:753:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalFortXTrans.g:759:1: ruleQualifiedName returns [EObject current=null] : ( ( (lv_s_0_0= ruleSimpleName ) ) (otherlv_1= '.' ( (lv_s_2_0= ruleSimpleName ) ) )* ( (lv_dots_3_0= RULE_DOTS ) )? ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_dots_3_0=null;
        EObject lv_s_0_0 = null;

        EObject lv_s_2_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:765:2: ( ( ( (lv_s_0_0= ruleSimpleName ) ) (otherlv_1= '.' ( (lv_s_2_0= ruleSimpleName ) ) )* ( (lv_dots_3_0= RULE_DOTS ) )? ) )
            // InternalFortXTrans.g:766:2: ( ( (lv_s_0_0= ruleSimpleName ) ) (otherlv_1= '.' ( (lv_s_2_0= ruleSimpleName ) ) )* ( (lv_dots_3_0= RULE_DOTS ) )? )
            {
            // InternalFortXTrans.g:766:2: ( ( (lv_s_0_0= ruleSimpleName ) ) (otherlv_1= '.' ( (lv_s_2_0= ruleSimpleName ) ) )* ( (lv_dots_3_0= RULE_DOTS ) )? )
            // InternalFortXTrans.g:767:3: ( (lv_s_0_0= ruleSimpleName ) ) (otherlv_1= '.' ( (lv_s_2_0= ruleSimpleName ) ) )* ( (lv_dots_3_0= RULE_DOTS ) )?
            {
            // InternalFortXTrans.g:767:3: ( (lv_s_0_0= ruleSimpleName ) )
            // InternalFortXTrans.g:768:4: (lv_s_0_0= ruleSimpleName )
            {
            // InternalFortXTrans.g:768:4: (lv_s_0_0= ruleSimpleName )
            // InternalFortXTrans.g:769:5: lv_s_0_0= ruleSimpleName
            {

            					newCompositeNode(grammarAccess.getQualifiedNameAccess().getSSimpleNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_s_0_0=ruleSimpleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualifiedNameRule());
            					}
            					add(
            						current,
            						"s",
            						lv_s_0_0,
            						"srf.transpiler.fortxtrans.FortXTrans.SimpleName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFortXTrans.g:786:3: (otherlv_1= '.' ( (lv_s_2_0= ruleSimpleName ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==RULE_ID) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalFortXTrans.g:787:4: otherlv_1= '.' ( (lv_s_2_0= ruleSimpleName ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalFortXTrans.g:791:4: ( (lv_s_2_0= ruleSimpleName ) )
            	    // InternalFortXTrans.g:792:5: (lv_s_2_0= ruleSimpleName )
            	    {
            	    // InternalFortXTrans.g:792:5: (lv_s_2_0= ruleSimpleName )
            	    // InternalFortXTrans.g:793:6: lv_s_2_0= ruleSimpleName
            	    {

            	    						newCompositeNode(grammarAccess.getQualifiedNameAccess().getSSimpleNameParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_s_2_0=ruleSimpleName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQualifiedNameRule());
            	    						}
            	    						add(
            	    							current,
            	    							"s",
            	    							lv_s_2_0,
            	    							"srf.transpiler.fortxtrans.FortXTrans.SimpleName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalFortXTrans.g:811:3: ( (lv_dots_3_0= RULE_DOTS ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_DOTS) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFortXTrans.g:812:4: (lv_dots_3_0= RULE_DOTS )
                    {
                    // InternalFortXTrans.g:812:4: (lv_dots_3_0= RULE_DOTS )
                    // InternalFortXTrans.g:813:5: lv_dots_3_0= RULE_DOTS
                    {
                    lv_dots_3_0=(Token)match(input,RULE_DOTS,FOLLOW_2); 

                    					newLeafNode(lv_dots_3_0, grammarAccess.getQualifiedNameAccess().getDotsDOTSTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQualifiedNameRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"dots",
                    						lv_dots_3_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.DOTS");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualified"
    // InternalFortXTrans.g:833:1: entryRuleQualified returns [EObject current=null] : iv_ruleQualified= ruleQualified EOF ;
    public final EObject entryRuleQualified() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualified = null;


        try {
            // InternalFortXTrans.g:833:50: (iv_ruleQualified= ruleQualified EOF )
            // InternalFortXTrans.g:834:2: iv_ruleQualified= ruleQualified EOF
            {
             newCompositeNode(grammarAccess.getQualifiedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualified=ruleQualified();

            state._fsp--;

             current =iv_ruleQualified; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualified"


    // $ANTLR start "ruleQualified"
    // InternalFortXTrans.g:840:1: ruleQualified returns [EObject current=null] : (this_QualifiedName_0= ruleQualifiedName | (otherlv_1= '(' this_QualifiedNameTuple_2= ruleQualifiedNameTuple otherlv_3= ')' ) ) ;
    public final EObject ruleQualified() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_QualifiedName_0 = null;

        EObject this_QualifiedNameTuple_2 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:846:2: ( (this_QualifiedName_0= ruleQualifiedName | (otherlv_1= '(' this_QualifiedNameTuple_2= ruleQualifiedNameTuple otherlv_3= ')' ) ) )
            // InternalFortXTrans.g:847:2: (this_QualifiedName_0= ruleQualifiedName | (otherlv_1= '(' this_QualifiedNameTuple_2= ruleQualifiedNameTuple otherlv_3= ')' ) )
            {
            // InternalFortXTrans.g:847:2: (this_QualifiedName_0= ruleQualifiedName | (otherlv_1= '(' this_QualifiedNameTuple_2= ruleQualifiedNameTuple otherlv_3= ')' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==24) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalFortXTrans.g:848:3: this_QualifiedName_0= ruleQualifiedName
                    {

                    			newCompositeNode(grammarAccess.getQualifiedAccess().getQualifiedNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_QualifiedName_0=ruleQualifiedName();

                    state._fsp--;


                    			current = this_QualifiedName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:857:3: (otherlv_1= '(' this_QualifiedNameTuple_2= ruleQualifiedNameTuple otherlv_3= ')' )
                    {
                    // InternalFortXTrans.g:857:3: (otherlv_1= '(' this_QualifiedNameTuple_2= ruleQualifiedNameTuple otherlv_3= ')' )
                    // InternalFortXTrans.g:858:4: otherlv_1= '(' this_QualifiedNameTuple_2= ruleQualifiedNameTuple otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getQualifiedAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getQualifiedAccess().getQualifiedNameTupleParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_18);
                    this_QualifiedNameTuple_2=ruleQualifiedNameTuple();

                    state._fsp--;


                    				current = this_QualifiedNameTuple_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getQualifiedAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualified"


    // $ANTLR start "entryRuleQualifiedNameTuple"
    // InternalFortXTrans.g:879:1: entryRuleQualifiedNameTuple returns [EObject current=null] : iv_ruleQualifiedNameTuple= ruleQualifiedNameTuple EOF ;
    public final EObject entryRuleQualifiedNameTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedNameTuple = null;


        try {
            // InternalFortXTrans.g:879:59: (iv_ruleQualifiedNameTuple= ruleQualifiedNameTuple EOF )
            // InternalFortXTrans.g:880:2: iv_ruleQualifiedNameTuple= ruleQualifiedNameTuple EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameTupleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameTuple=ruleQualifiedNameTuple();

            state._fsp--;

             current =iv_ruleQualifiedNameTuple; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameTuple"


    // $ANTLR start "ruleQualifiedNameTuple"
    // InternalFortXTrans.g:886:1: ruleQualifiedNameTuple returns [EObject current=null] : ( ( (lv_qlist_0_0= ruleQualifiedName ) ) (otherlv_1= ',' ( (lv_qlist_2_0= ruleQualifiedName ) ) )* ) ;
    public final EObject ruleQualifiedNameTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_qlist_0_0 = null;

        EObject lv_qlist_2_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:892:2: ( ( ( (lv_qlist_0_0= ruleQualifiedName ) ) (otherlv_1= ',' ( (lv_qlist_2_0= ruleQualifiedName ) ) )* ) )
            // InternalFortXTrans.g:893:2: ( ( (lv_qlist_0_0= ruleQualifiedName ) ) (otherlv_1= ',' ( (lv_qlist_2_0= ruleQualifiedName ) ) )* )
            {
            // InternalFortXTrans.g:893:2: ( ( (lv_qlist_0_0= ruleQualifiedName ) ) (otherlv_1= ',' ( (lv_qlist_2_0= ruleQualifiedName ) ) )* )
            // InternalFortXTrans.g:894:3: ( (lv_qlist_0_0= ruleQualifiedName ) ) (otherlv_1= ',' ( (lv_qlist_2_0= ruleQualifiedName ) ) )*
            {
            // InternalFortXTrans.g:894:3: ( (lv_qlist_0_0= ruleQualifiedName ) )
            // InternalFortXTrans.g:895:4: (lv_qlist_0_0= ruleQualifiedName )
            {
            // InternalFortXTrans.g:895:4: (lv_qlist_0_0= ruleQualifiedName )
            // InternalFortXTrans.g:896:5: lv_qlist_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getQualifiedNameTupleAccess().getQlistQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_qlist_0_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualifiedNameTupleRule());
            					}
            					add(
            						current,
            						"qlist",
            						lv_qlist_0_0,
            						"srf.transpiler.fortxtrans.FortXTrans.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFortXTrans.g:913:3: (otherlv_1= ',' ( (lv_qlist_2_0= ruleQualifiedName ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalFortXTrans.g:914:4: otherlv_1= ',' ( (lv_qlist_2_0= ruleQualifiedName ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getQualifiedNameTupleAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalFortXTrans.g:918:4: ( (lv_qlist_2_0= ruleQualifiedName ) )
            	    // InternalFortXTrans.g:919:5: (lv_qlist_2_0= ruleQualifiedName )
            	    {
            	    // InternalFortXTrans.g:919:5: (lv_qlist_2_0= ruleQualifiedName )
            	    // InternalFortXTrans.g:920:6: lv_qlist_2_0= ruleQualifiedName
            	    {

            	    						newCompositeNode(grammarAccess.getQualifiedNameTupleAccess().getQlistQualifiedNameParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_qlist_2_0=ruleQualifiedName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQualifiedNameTupleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"qlist",
            	    							lv_qlist_2_0,
            	    							"srf.transpiler.fortxtrans.FortXTrans.QualifiedName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameTuple"


    // $ANTLR start "entryRuleSimpleNames"
    // InternalFortXTrans.g:942:1: entryRuleSimpleNames returns [EObject current=null] : iv_ruleSimpleNames= ruleSimpleNames EOF ;
    public final EObject entryRuleSimpleNames() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleNames = null;


        try {
            // InternalFortXTrans.g:942:52: (iv_ruleSimpleNames= ruleSimpleNames EOF )
            // InternalFortXTrans.g:943:2: iv_ruleSimpleNames= ruleSimpleNames EOF
            {
             newCompositeNode(grammarAccess.getSimpleNamesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleNames=ruleSimpleNames();

            state._fsp--;

             current =iv_ruleSimpleNames; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleNames"


    // $ANTLR start "ruleSimpleNames"
    // InternalFortXTrans.g:949:1: ruleSimpleNames returns [EObject current=null] : ( ( (lv_nameList_0_0= ruleSimpleName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleSimpleName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )* otherlv_5= '}' ) ) ;
    public final EObject ruleSimpleNames() throws RecognitionException {
        EObject current = null;

        Token lv_brack_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_nameList_0_0 = null;

        EObject lv_nameList_2_0 = null;

        EObject lv_nameList_4_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:955:2: ( ( ( (lv_nameList_0_0= ruleSimpleName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleSimpleName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )* otherlv_5= '}' ) ) )
            // InternalFortXTrans.g:956:2: ( ( (lv_nameList_0_0= ruleSimpleName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleSimpleName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )* otherlv_5= '}' ) )
            {
            // InternalFortXTrans.g:956:2: ( ( (lv_nameList_0_0= ruleSimpleName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleSimpleName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )* otherlv_5= '}' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==18) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalFortXTrans.g:957:3: ( (lv_nameList_0_0= ruleSimpleName ) )
                    {
                    // InternalFortXTrans.g:957:3: ( (lv_nameList_0_0= ruleSimpleName ) )
                    // InternalFortXTrans.g:958:4: (lv_nameList_0_0= ruleSimpleName )
                    {
                    // InternalFortXTrans.g:958:4: (lv_nameList_0_0= ruleSimpleName )
                    // InternalFortXTrans.g:959:5: lv_nameList_0_0= ruleSimpleName
                    {

                    					newCompositeNode(grammarAccess.getSimpleNamesAccess().getNameListSimpleNameParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_nameList_0_0=ruleSimpleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimpleNamesRule());
                    					}
                    					add(
                    						current,
                    						"nameList",
                    						lv_nameList_0_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.SimpleName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:977:3: ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleSimpleName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )* otherlv_5= '}' )
                    {
                    // InternalFortXTrans.g:977:3: ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleSimpleName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )* otherlv_5= '}' )
                    // InternalFortXTrans.g:978:4: ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleSimpleName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )* otherlv_5= '}'
                    {
                    // InternalFortXTrans.g:978:4: ( (lv_brack_1_0= '{' ) )
                    // InternalFortXTrans.g:979:5: (lv_brack_1_0= '{' )
                    {
                    // InternalFortXTrans.g:979:5: (lv_brack_1_0= '{' )
                    // InternalFortXTrans.g:980:6: lv_brack_1_0= '{'
                    {
                    lv_brack_1_0=(Token)match(input,18,FOLLOW_3); 

                    						newLeafNode(lv_brack_1_0, grammarAccess.getSimpleNamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleNamesRule());
                    						}
                    						setWithLastConsumed(current, "brack", lv_brack_1_0, "{");
                    					

                    }


                    }

                    // InternalFortXTrans.g:992:4: ( (lv_nameList_2_0= ruleSimpleName ) )
                    // InternalFortXTrans.g:993:5: (lv_nameList_2_0= ruleSimpleName )
                    {
                    // InternalFortXTrans.g:993:5: (lv_nameList_2_0= ruleSimpleName )
                    // InternalFortXTrans.g:994:6: lv_nameList_2_0= ruleSimpleName
                    {

                    						newCompositeNode(grammarAccess.getSimpleNamesAccess().getNameListSimpleNameParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_nameList_2_0=ruleSimpleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleNamesRule());
                    						}
                    						add(
                    							current,
                    							"nameList",
                    							lv_nameList_2_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.SimpleName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:1011:4: (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==19) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalFortXTrans.g:1012:5: otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSimpleNamesAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalFortXTrans.g:1016:5: ( (lv_nameList_4_0= ruleSimpleName ) )
                    	    // InternalFortXTrans.g:1017:6: (lv_nameList_4_0= ruleSimpleName )
                    	    {
                    	    // InternalFortXTrans.g:1017:6: (lv_nameList_4_0= ruleSimpleName )
                    	    // InternalFortXTrans.g:1018:7: lv_nameList_4_0= ruleSimpleName
                    	    {

                    	    							newCompositeNode(grammarAccess.getSimpleNamesAccess().getNameListSimpleNameParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_nameList_4_0=ruleSimpleName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSimpleNamesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nameList",
                    	    								lv_nameList_4_0,
                    	    								"srf.transpiler.fortxtrans.FortXTrans.SimpleName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSimpleNamesAccess().getRightCurlyBracketKeyword_1_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleNames"


    // $ANTLR start "entryRuleSimpleName"
    // InternalFortXTrans.g:1045:1: entryRuleSimpleName returns [EObject current=null] : iv_ruleSimpleName= ruleSimpleName EOF ;
    public final EObject entryRuleSimpleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleName = null;


        try {
            // InternalFortXTrans.g:1045:51: (iv_ruleSimpleName= ruleSimpleName EOF )
            // InternalFortXTrans.g:1046:2: iv_ruleSimpleName= ruleSimpleName EOF
            {
             newCompositeNode(grammarAccess.getSimpleNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleName=ruleSimpleName();

            state._fsp--;

             current =iv_ruleSimpleName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleName"


    // $ANTLR start "ruleSimpleName"
    // InternalFortXTrans.g:1052:1: ruleSimpleName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSimpleName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalFortXTrans.g:1058:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalFortXTrans.g:1059:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalFortXTrans.g:1059:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalFortXTrans.g:1060:3: (lv_name_0_0= RULE_ID )
            {
            // InternalFortXTrans.g:1060:3: (lv_name_0_0= RULE_ID )
            // InternalFortXTrans.g:1061:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSimpleNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSimpleNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleName"


    // $ANTLR start "entryRuleAliasedSimpleName"
    // InternalFortXTrans.g:1080:1: entryRuleAliasedSimpleName returns [EObject current=null] : iv_ruleAliasedSimpleName= ruleAliasedSimpleName EOF ;
    public final EObject entryRuleAliasedSimpleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasedSimpleName = null;


        try {
            // InternalFortXTrans.g:1080:58: (iv_ruleAliasedSimpleName= ruleAliasedSimpleName EOF )
            // InternalFortXTrans.g:1081:2: iv_ruleAliasedSimpleName= ruleAliasedSimpleName EOF
            {
             newCompositeNode(grammarAccess.getAliasedSimpleNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAliasedSimpleName=ruleAliasedSimpleName();

            state._fsp--;

             current =iv_ruleAliasedSimpleName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAliasedSimpleName"


    // $ANTLR start "ruleAliasedSimpleName"
    // InternalFortXTrans.g:1087:1: ruleAliasedSimpleName returns [EObject current=null] : ( ( (lv_orig_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleAliasedSimpleName() throws RecognitionException {
        EObject current = null;

        Token lv_orig_0_0=null;
        Token otherlv_1=null;
        Token lv_asName_2_0=null;


        	enterRule();

        try {
            // InternalFortXTrans.g:1093:2: ( ( ( (lv_orig_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? ) )
            // InternalFortXTrans.g:1094:2: ( ( (lv_orig_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? )
            {
            // InternalFortXTrans.g:1094:2: ( ( (lv_orig_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? )
            // InternalFortXTrans.g:1095:3: ( (lv_orig_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )?
            {
            // InternalFortXTrans.g:1095:3: ( (lv_orig_0_0= RULE_ID ) )
            // InternalFortXTrans.g:1096:4: (lv_orig_0_0= RULE_ID )
            {
            // InternalFortXTrans.g:1096:4: (lv_orig_0_0= RULE_ID )
            // InternalFortXTrans.g:1097:5: lv_orig_0_0= RULE_ID
            {
            lv_orig_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_orig_0_0, grammarAccess.getAliasedSimpleNameAccess().getOrigIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAliasedSimpleNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"orig",
            						lv_orig_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalFortXTrans.g:1113:3: (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalFortXTrans.g:1114:4: otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getAliasedSimpleNameAccess().getAsKeyword_1_0());
                    			
                    // InternalFortXTrans.g:1118:4: ( (lv_asName_2_0= RULE_ID ) )
                    // InternalFortXTrans.g:1119:5: (lv_asName_2_0= RULE_ID )
                    {
                    // InternalFortXTrans.g:1119:5: (lv_asName_2_0= RULE_ID )
                    // InternalFortXTrans.g:1120:6: lv_asName_2_0= RULE_ID
                    {
                    lv_asName_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_asName_2_0, grammarAccess.getAliasedSimpleNameAccess().getAsNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAliasedSimpleNameRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"asName",
                    							lv_asName_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAliasedSimpleName"


    // $ANTLR start "entryRuleAliasedAPINames"
    // InternalFortXTrans.g:1141:1: entryRuleAliasedAPINames returns [EObject current=null] : iv_ruleAliasedAPINames= ruleAliasedAPINames EOF ;
    public final EObject entryRuleAliasedAPINames() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasedAPINames = null;


        try {
            // InternalFortXTrans.g:1141:56: (iv_ruleAliasedAPINames= ruleAliasedAPINames EOF )
            // InternalFortXTrans.g:1142:2: iv_ruleAliasedAPINames= ruleAliasedAPINames EOF
            {
             newCompositeNode(grammarAccess.getAliasedAPINamesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAliasedAPINames=ruleAliasedAPINames();

            state._fsp--;

             current =iv_ruleAliasedAPINames; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAliasedAPINames"


    // $ANTLR start "ruleAliasedAPINames"
    // InternalFortXTrans.g:1148:1: ruleAliasedAPINames returns [EObject current=null] : ( ( (lv_nameList_0_0= ruleAliasedAPIName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleAliasedAPIName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )* otherlv_5= '}' ) ) ;
    public final EObject ruleAliasedAPINames() throws RecognitionException {
        EObject current = null;

        Token lv_brack_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_nameList_0_0 = null;

        EObject lv_nameList_2_0 = null;

        EObject lv_nameList_4_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1154:2: ( ( ( (lv_nameList_0_0= ruleAliasedAPIName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleAliasedAPIName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )* otherlv_5= '}' ) ) )
            // InternalFortXTrans.g:1155:2: ( ( (lv_nameList_0_0= ruleAliasedAPIName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleAliasedAPIName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )* otherlv_5= '}' ) )
            {
            // InternalFortXTrans.g:1155:2: ( ( (lv_nameList_0_0= ruleAliasedAPIName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleAliasedAPIName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )* otherlv_5= '}' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            else if ( (LA22_0==18) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalFortXTrans.g:1156:3: ( (lv_nameList_0_0= ruleAliasedAPIName ) )
                    {
                    // InternalFortXTrans.g:1156:3: ( (lv_nameList_0_0= ruleAliasedAPIName ) )
                    // InternalFortXTrans.g:1157:4: (lv_nameList_0_0= ruleAliasedAPIName )
                    {
                    // InternalFortXTrans.g:1157:4: (lv_nameList_0_0= ruleAliasedAPIName )
                    // InternalFortXTrans.g:1158:5: lv_nameList_0_0= ruleAliasedAPIName
                    {

                    					newCompositeNode(grammarAccess.getAliasedAPINamesAccess().getNameListAliasedAPINameParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_nameList_0_0=ruleAliasedAPIName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAliasedAPINamesRule());
                    					}
                    					add(
                    						current,
                    						"nameList",
                    						lv_nameList_0_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.AliasedAPIName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1176:3: ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleAliasedAPIName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )* otherlv_5= '}' )
                    {
                    // InternalFortXTrans.g:1176:3: ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleAliasedAPIName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )* otherlv_5= '}' )
                    // InternalFortXTrans.g:1177:4: ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleAliasedAPIName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )* otherlv_5= '}'
                    {
                    // InternalFortXTrans.g:1177:4: ( (lv_brack_1_0= '{' ) )
                    // InternalFortXTrans.g:1178:5: (lv_brack_1_0= '{' )
                    {
                    // InternalFortXTrans.g:1178:5: (lv_brack_1_0= '{' )
                    // InternalFortXTrans.g:1179:6: lv_brack_1_0= '{'
                    {
                    lv_brack_1_0=(Token)match(input,18,FOLLOW_3); 

                    						newLeafNode(lv_brack_1_0, grammarAccess.getAliasedAPINamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAliasedAPINamesRule());
                    						}
                    						setWithLastConsumed(current, "brack", lv_brack_1_0, "{");
                    					

                    }


                    }

                    // InternalFortXTrans.g:1191:4: ( (lv_nameList_2_0= ruleAliasedAPIName ) )
                    // InternalFortXTrans.g:1192:5: (lv_nameList_2_0= ruleAliasedAPIName )
                    {
                    // InternalFortXTrans.g:1192:5: (lv_nameList_2_0= ruleAliasedAPIName )
                    // InternalFortXTrans.g:1193:6: lv_nameList_2_0= ruleAliasedAPIName
                    {

                    						newCompositeNode(grammarAccess.getAliasedAPINamesAccess().getNameListAliasedAPINameParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_nameList_2_0=ruleAliasedAPIName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAliasedAPINamesRule());
                    						}
                    						add(
                    							current,
                    							"nameList",
                    							lv_nameList_2_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.AliasedAPIName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:1210:4: (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==19) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalFortXTrans.g:1211:5: otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getAliasedAPINamesAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalFortXTrans.g:1215:5: ( (lv_nameList_4_0= ruleAliasedAPIName ) )
                    	    // InternalFortXTrans.g:1216:6: (lv_nameList_4_0= ruleAliasedAPIName )
                    	    {
                    	    // InternalFortXTrans.g:1216:6: (lv_nameList_4_0= ruleAliasedAPIName )
                    	    // InternalFortXTrans.g:1217:7: lv_nameList_4_0= ruleAliasedAPIName
                    	    {

                    	    							newCompositeNode(grammarAccess.getAliasedAPINamesAccess().getNameListAliasedAPINameParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_nameList_4_0=ruleAliasedAPIName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAliasedAPINamesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nameList",
                    	    								lv_nameList_4_0,
                    	    								"srf.transpiler.fortxtrans.FortXTrans.AliasedAPIName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getAliasedAPINamesAccess().getRightCurlyBracketKeyword_1_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAliasedAPINames"


    // $ANTLR start "entryRuleAliasedAPIName"
    // InternalFortXTrans.g:1244:1: entryRuleAliasedAPIName returns [EObject current=null] : iv_ruleAliasedAPIName= ruleAliasedAPIName EOF ;
    public final EObject entryRuleAliasedAPIName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasedAPIName = null;


        try {
            // InternalFortXTrans.g:1244:55: (iv_ruleAliasedAPIName= ruleAliasedAPIName EOF )
            // InternalFortXTrans.g:1245:2: iv_ruleAliasedAPIName= ruleAliasedAPIName EOF
            {
             newCompositeNode(grammarAccess.getAliasedAPINameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAliasedAPIName=ruleAliasedAPIName();

            state._fsp--;

             current =iv_ruleAliasedAPIName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAliasedAPIName"


    // $ANTLR start "ruleAliasedAPIName"
    // InternalFortXTrans.g:1251:1: ruleAliasedAPIName returns [EObject current=null] : ( ( (lv_orig_0_0= ruleQualifiedName ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleAliasedAPIName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_asName_2_0=null;
        EObject lv_orig_0_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1257:2: ( ( ( (lv_orig_0_0= ruleQualifiedName ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? ) )
            // InternalFortXTrans.g:1258:2: ( ( (lv_orig_0_0= ruleQualifiedName ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? )
            {
            // InternalFortXTrans.g:1258:2: ( ( (lv_orig_0_0= ruleQualifiedName ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? )
            // InternalFortXTrans.g:1259:3: ( (lv_orig_0_0= ruleQualifiedName ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )?
            {
            // InternalFortXTrans.g:1259:3: ( (lv_orig_0_0= ruleQualifiedName ) )
            // InternalFortXTrans.g:1260:4: (lv_orig_0_0= ruleQualifiedName )
            {
            // InternalFortXTrans.g:1260:4: (lv_orig_0_0= ruleQualifiedName )
            // InternalFortXTrans.g:1261:5: lv_orig_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getAliasedAPINameAccess().getOrigQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_orig_0_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAliasedAPINameRule());
            					}
            					set(
            						current,
            						"orig",
            						lv_orig_0_0,
            						"srf.transpiler.fortxtrans.FortXTrans.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFortXTrans.g:1278:3: (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalFortXTrans.g:1279:4: otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getAliasedAPINameAccess().getAsKeyword_1_0());
                    			
                    // InternalFortXTrans.g:1283:4: ( (lv_asName_2_0= RULE_ID ) )
                    // InternalFortXTrans.g:1284:5: (lv_asName_2_0= RULE_ID )
                    {
                    // InternalFortXTrans.g:1284:5: (lv_asName_2_0= RULE_ID )
                    // InternalFortXTrans.g:1285:6: lv_asName_2_0= RULE_ID
                    {
                    lv_asName_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_asName_2_0, grammarAccess.getAliasedAPINameAccess().getAsNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAliasedAPINameRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"asName",
                    							lv_asName_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAliasedAPIName"


    // $ANTLR start "entryRuleDecls"
    // InternalFortXTrans.g:1306:1: entryRuleDecls returns [EObject current=null] : iv_ruleDecls= ruleDecls EOF ;
    public final EObject entryRuleDecls() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecls = null;


        try {
            // InternalFortXTrans.g:1306:46: (iv_ruleDecls= ruleDecls EOF )
            // InternalFortXTrans.g:1307:2: iv_ruleDecls= ruleDecls EOF
            {
             newCompositeNode(grammarAccess.getDeclsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecls=ruleDecls();

            state._fsp--;

             current =iv_ruleDecls; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecls"


    // $ANTLR start "ruleDecls"
    // InternalFortXTrans.g:1313:1: ruleDecls returns [EObject current=null] : ( (lv_decls_0_0= ruleDecl ) )+ ;
    public final EObject ruleDecls() throws RecognitionException {
        EObject current = null;

        EObject lv_decls_0_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1319:2: ( ( (lv_decls_0_0= ruleDecl ) )+ )
            // InternalFortXTrans.g:1320:2: ( (lv_decls_0_0= ruleDecl ) )+
            {
            // InternalFortXTrans.g:1320:2: ( (lv_decls_0_0= ruleDecl ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case 27:
                    {
                    alt24=1;
                    }
                    break;
                case 28:
                    {
                    alt24=1;
                    }
                    break;
                case 29:
                    {
                    alt24=1;
                    }
                    break;
                case 30:
                    {
                    alt24=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt24=1;
                    }
                    break;
                case 70:
                    {
                    alt24=1;
                    }
                    break;
                case 24:
                    {
                    alt24=1;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // InternalFortXTrans.g:1321:3: (lv_decls_0_0= ruleDecl )
            	    {
            	    // InternalFortXTrans.g:1321:3: (lv_decls_0_0= ruleDecl )
            	    // InternalFortXTrans.g:1322:4: lv_decls_0_0= ruleDecl
            	    {

            	    				newCompositeNode(grammarAccess.getDeclsAccess().getDeclsDeclParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_20);
            	    lv_decls_0_0=ruleDecl();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDeclsRule());
            	    				}
            	    				add(
            	    					current,
            	    					"decls",
            	    					lv_decls_0_0,
            	    					"srf.transpiler.fortxtrans.FortXTrans.Decl");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecls"


    // $ANTLR start "entryRuleDecl"
    // InternalFortXTrans.g:1342:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // InternalFortXTrans.g:1342:45: (iv_ruleDecl= ruleDecl EOF )
            // InternalFortXTrans.g:1343:2: iv_ruleDecl= ruleDecl EOF
            {
             newCompositeNode(grammarAccess.getDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecl=ruleDecl();

            state._fsp--;

             current =iv_ruleDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecl"


    // $ANTLR start "ruleDecl"
    // InternalFortXTrans.g:1349:1: ruleDecl returns [EObject current=null] : ( ( (lv_function_0_0= ruleFnDecl ) ) | ( (lv_field_1_0= ruleFieldDecl ) ) ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_function_0_0 = null;

        EObject lv_field_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1355:2: ( ( ( (lv_function_0_0= ruleFnDecl ) ) | ( (lv_field_1_0= ruleFieldDecl ) ) ) )
            // InternalFortXTrans.g:1356:2: ( ( (lv_function_0_0= ruleFnDecl ) ) | ( (lv_field_1_0= ruleFieldDecl ) ) )
            {
            // InternalFortXTrans.g:1356:2: ( ( (lv_function_0_0= ruleFnDecl ) ) | ( (lv_field_1_0= ruleFieldDecl ) ) )
            int alt25=2;
            switch ( input.LA(1) ) {
            case 27:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA25_3 = input.LA(3);

                    if ( (LA25_3==RULE_DOTS||LA25_3==21||LA25_3==26||LA25_3==31) ) {
                        alt25=2;
                    }
                    else if ( (LA25_3==RULE_ID||LA25_3==24) ) {
                        alt25=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 24:
                case 70:
                    {
                    alt25=2;
                    }
                    break;
                case 27:
                case 28:
                case 29:
                case 30:
                    {
                    alt25=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }

                }
                break;
            case 28:
            case 29:
            case 30:
                {
                alt25=1;
                }
                break;
            case RULE_ID:
                {
                int LA25_3 = input.LA(2);

                if ( (LA25_3==RULE_DOTS||LA25_3==21||LA25_3==26||LA25_3==31) ) {
                    alt25=2;
                }
                else if ( (LA25_3==RULE_ID||LA25_3==24) ) {
                    alt25=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 3, input);

                    throw nvae;
                }
                }
                break;
            case 24:
            case 70:
                {
                alt25=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalFortXTrans.g:1357:3: ( (lv_function_0_0= ruleFnDecl ) )
                    {
                    // InternalFortXTrans.g:1357:3: ( (lv_function_0_0= ruleFnDecl ) )
                    // InternalFortXTrans.g:1358:4: (lv_function_0_0= ruleFnDecl )
                    {
                    // InternalFortXTrans.g:1358:4: (lv_function_0_0= ruleFnDecl )
                    // InternalFortXTrans.g:1359:5: lv_function_0_0= ruleFnDecl
                    {

                    					newCompositeNode(grammarAccess.getDeclAccess().getFunctionFnDeclParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_function_0_0=ruleFnDecl();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclRule());
                    					}
                    					set(
                    						current,
                    						"function",
                    						lv_function_0_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.FnDecl");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1377:3: ( (lv_field_1_0= ruleFieldDecl ) )
                    {
                    // InternalFortXTrans.g:1377:3: ( (lv_field_1_0= ruleFieldDecl ) )
                    // InternalFortXTrans.g:1378:4: (lv_field_1_0= ruleFieldDecl )
                    {
                    // InternalFortXTrans.g:1378:4: (lv_field_1_0= ruleFieldDecl )
                    // InternalFortXTrans.g:1379:5: lv_field_1_0= ruleFieldDecl
                    {

                    					newCompositeNode(grammarAccess.getDeclAccess().getFieldFieldDeclParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_field_1_0=ruleFieldDecl();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclRule());
                    					}
                    					set(
                    						current,
                    						"field",
                    						lv_field_1_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.FieldDecl");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecl"


    // $ANTLR start "entryRuleValParam"
    // InternalFortXTrans.g:1400:1: entryRuleValParam returns [EObject current=null] : iv_ruleValParam= ruleValParam EOF ;
    public final EObject entryRuleValParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValParam = null;


        try {
            // InternalFortXTrans.g:1400:49: (iv_ruleValParam= ruleValParam EOF )
            // InternalFortXTrans.g:1401:2: iv_ruleValParam= ruleValParam EOF
            {
             newCompositeNode(grammarAccess.getValParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValParam=ruleValParam();

            state._fsp--;

             current =iv_ruleValParam; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValParam"


    // $ANTLR start "ruleValParam"
    // InternalFortXTrans.g:1407:1: ruleValParam returns [EObject current=null] : ( ( (lv_params_0_0= ruleParam ) ) | ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' ) ) ;
    public final EObject ruleValParam() throws RecognitionException {
        EObject current = null;

        Token lv_brack_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_0_0 = null;

        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1413:2: ( ( ( (lv_params_0_0= ruleParam ) ) | ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' ) ) )
            // InternalFortXTrans.g:1414:2: ( ( (lv_params_0_0= ruleParam ) ) | ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' ) )
            {
            // InternalFortXTrans.g:1414:2: ( ( (lv_params_0_0= ruleParam ) ) | ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            else if ( (LA28_0==24) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalFortXTrans.g:1415:3: ( (lv_params_0_0= ruleParam ) )
                    {
                    // InternalFortXTrans.g:1415:3: ( (lv_params_0_0= ruleParam ) )
                    // InternalFortXTrans.g:1416:4: (lv_params_0_0= ruleParam )
                    {
                    // InternalFortXTrans.g:1416:4: (lv_params_0_0= ruleParam )
                    // InternalFortXTrans.g:1417:5: lv_params_0_0= ruleParam
                    {

                    					newCompositeNode(grammarAccess.getValParamAccess().getParamsParamParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_params_0_0=ruleParam();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValParamRule());
                    					}
                    					add(
                    						current,
                    						"params",
                    						lv_params_0_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.Param");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1435:3: ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' )
                    {
                    // InternalFortXTrans.g:1435:3: ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' )
                    // InternalFortXTrans.g:1436:4: ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')'
                    {
                    // InternalFortXTrans.g:1436:4: ( (lv_brack_1_0= '(' ) )
                    // InternalFortXTrans.g:1437:5: (lv_brack_1_0= '(' )
                    {
                    // InternalFortXTrans.g:1437:5: (lv_brack_1_0= '(' )
                    // InternalFortXTrans.g:1438:6: lv_brack_1_0= '('
                    {
                    lv_brack_1_0=(Token)match(input,24,FOLLOW_21); 

                    						newLeafNode(lv_brack_1_0, grammarAccess.getValParamAccess().getBrackLeftParenthesisKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValParamRule());
                    						}
                    						setWithLastConsumed(current, "brack", lv_brack_1_0, "(");
                    					

                    }


                    }

                    // InternalFortXTrans.g:1450:4: ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_ID) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalFortXTrans.g:1451:5: ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )*
                            {
                            // InternalFortXTrans.g:1451:5: ( (lv_params_2_0= ruleParam ) )
                            // InternalFortXTrans.g:1452:6: (lv_params_2_0= ruleParam )
                            {
                            // InternalFortXTrans.g:1452:6: (lv_params_2_0= ruleParam )
                            // InternalFortXTrans.g:1453:7: lv_params_2_0= ruleParam
                            {

                            							newCompositeNode(grammarAccess.getValParamAccess().getParamsParamParserRuleCall_1_1_0_0());
                            						
                            pushFollow(FOLLOW_22);
                            lv_params_2_0=ruleParam();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getValParamRule());
                            							}
                            							add(
                            								current,
                            								"params",
                            								lv_params_2_0,
                            								"srf.transpiler.fortxtrans.FortXTrans.Param");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalFortXTrans.g:1470:5: (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )*
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==19) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // InternalFortXTrans.g:1471:6: otherlv_3= ',' ( (lv_params_4_0= ruleParam ) )
                            	    {
                            	    otherlv_3=(Token)match(input,19,FOLLOW_3); 

                            	    						newLeafNode(otherlv_3, grammarAccess.getValParamAccess().getCommaKeyword_1_1_1_0());
                            	    					
                            	    // InternalFortXTrans.g:1475:6: ( (lv_params_4_0= ruleParam ) )
                            	    // InternalFortXTrans.g:1476:7: (lv_params_4_0= ruleParam )
                            	    {
                            	    // InternalFortXTrans.g:1476:7: (lv_params_4_0= ruleParam )
                            	    // InternalFortXTrans.g:1477:8: lv_params_4_0= ruleParam
                            	    {

                            	    								newCompositeNode(grammarAccess.getValParamAccess().getParamsParamParserRuleCall_1_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_22);
                            	    lv_params_4_0=ruleParam();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getValParamRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"params",
                            	    									lv_params_4_0,
                            	    									"srf.transpiler.fortxtrans.FortXTrans.Param");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop26;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getValParamAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValParam"


    // $ANTLR start "entryRuleParam"
    // InternalFortXTrans.g:1505:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalFortXTrans.g:1505:46: (iv_ruleParam= ruleParam EOF )
            // InternalFortXTrans.g:1506:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalFortXTrans.g:1512:1: ruleParam returns [EObject current=null] : ( ( (lv_parId_0_0= ruleQualifiedName ) ) ( (lv_istype_1_0= ruleIsType ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        EObject lv_parId_0_0 = null;

        EObject lv_istype_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1518:2: ( ( ( (lv_parId_0_0= ruleQualifiedName ) ) ( (lv_istype_1_0= ruleIsType ) ) ) )
            // InternalFortXTrans.g:1519:2: ( ( (lv_parId_0_0= ruleQualifiedName ) ) ( (lv_istype_1_0= ruleIsType ) ) )
            {
            // InternalFortXTrans.g:1519:2: ( ( (lv_parId_0_0= ruleQualifiedName ) ) ( (lv_istype_1_0= ruleIsType ) ) )
            // InternalFortXTrans.g:1520:3: ( (lv_parId_0_0= ruleQualifiedName ) ) ( (lv_istype_1_0= ruleIsType ) )
            {
            // InternalFortXTrans.g:1520:3: ( (lv_parId_0_0= ruleQualifiedName ) )
            // InternalFortXTrans.g:1521:4: (lv_parId_0_0= ruleQualifiedName )
            {
            // InternalFortXTrans.g:1521:4: (lv_parId_0_0= ruleQualifiedName )
            // InternalFortXTrans.g:1522:5: lv_parId_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getParamAccess().getParIdQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_parId_0_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParamRule());
            					}
            					set(
            						current,
            						"parId",
            						lv_parId_0_0,
            						"srf.transpiler.fortxtrans.FortXTrans.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFortXTrans.g:1539:3: ( (lv_istype_1_0= ruleIsType ) )
            // InternalFortXTrans.g:1540:4: (lv_istype_1_0= ruleIsType )
            {
            // InternalFortXTrans.g:1540:4: (lv_istype_1_0= ruleIsType )
            // InternalFortXTrans.g:1541:5: lv_istype_1_0= ruleIsType
            {

            					newCompositeNode(grammarAccess.getParamAccess().getIstypeIsTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_istype_1_0=ruleIsType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParamRule());
            					}
            					set(
            						current,
            						"istype",
            						lv_istype_1_0,
            						"srf.transpiler.fortxtrans.FortXTrans.IsType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleRetType"
    // InternalFortXTrans.g:1562:1: entryRuleRetType returns [EObject current=null] : iv_ruleRetType= ruleRetType EOF ;
    public final EObject entryRuleRetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetType = null;


        try {
            // InternalFortXTrans.g:1562:48: (iv_ruleRetType= ruleRetType EOF )
            // InternalFortXTrans.g:1563:2: iv_ruleRetType= ruleRetType EOF
            {
             newCompositeNode(grammarAccess.getRetTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRetType=ruleRetType();

            state._fsp--;

             current =iv_ruleRetType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRetType"


    // $ANTLR start "ruleRetType"
    // InternalFortXTrans.g:1569:1: ruleRetType returns [EObject current=null] : ( (otherlv_0= ':' ( (lv_empty_1_0= '(' ) ) otherlv_2= ')' ) | (otherlv_3= ':' ( (lv_type_4_0= ruleSimpleName ) ) ) ) ;
    public final EObject ruleRetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_empty_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1575:2: ( ( (otherlv_0= ':' ( (lv_empty_1_0= '(' ) ) otherlv_2= ')' ) | (otherlv_3= ':' ( (lv_type_4_0= ruleSimpleName ) ) ) ) )
            // InternalFortXTrans.g:1576:2: ( (otherlv_0= ':' ( (lv_empty_1_0= '(' ) ) otherlv_2= ')' ) | (otherlv_3= ':' ( (lv_type_4_0= ruleSimpleName ) ) ) )
            {
            // InternalFortXTrans.g:1576:2: ( (otherlv_0= ':' ( (lv_empty_1_0= '(' ) ) otherlv_2= ')' ) | (otherlv_3= ':' ( (lv_type_4_0= ruleSimpleName ) ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==24) ) {
                    alt29=1;
                }
                else if ( (LA29_1==RULE_ID) ) {
                    alt29=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalFortXTrans.g:1577:3: (otherlv_0= ':' ( (lv_empty_1_0= '(' ) ) otherlv_2= ')' )
                    {
                    // InternalFortXTrans.g:1577:3: (otherlv_0= ':' ( (lv_empty_1_0= '(' ) ) otherlv_2= ')' )
                    // InternalFortXTrans.g:1578:4: otherlv_0= ':' ( (lv_empty_1_0= '(' ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_0, grammarAccess.getRetTypeAccess().getColonKeyword_0_0());
                    			
                    // InternalFortXTrans.g:1582:4: ( (lv_empty_1_0= '(' ) )
                    // InternalFortXTrans.g:1583:5: (lv_empty_1_0= '(' )
                    {
                    // InternalFortXTrans.g:1583:5: (lv_empty_1_0= '(' )
                    // InternalFortXTrans.g:1584:6: lv_empty_1_0= '('
                    {
                    lv_empty_1_0=(Token)match(input,24,FOLLOW_18); 

                    						newLeafNode(lv_empty_1_0, grammarAccess.getRetTypeAccess().getEmptyLeftParenthesisKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRetTypeRule());
                    						}
                    						setWithLastConsumed(current, "empty", lv_empty_1_0, "(");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getRetTypeAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1602:3: (otherlv_3= ':' ( (lv_type_4_0= ruleSimpleName ) ) )
                    {
                    // InternalFortXTrans.g:1602:3: (otherlv_3= ':' ( (lv_type_4_0= ruleSimpleName ) ) )
                    // InternalFortXTrans.g:1603:4: otherlv_3= ':' ( (lv_type_4_0= ruleSimpleName ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRetTypeAccess().getColonKeyword_1_0());
                    			
                    // InternalFortXTrans.g:1607:4: ( (lv_type_4_0= ruleSimpleName ) )
                    // InternalFortXTrans.g:1608:5: (lv_type_4_0= ruleSimpleName )
                    {
                    // InternalFortXTrans.g:1608:5: (lv_type_4_0= ruleSimpleName )
                    // InternalFortXTrans.g:1609:6: lv_type_4_0= ruleSimpleName
                    {

                    						newCompositeNode(grammarAccess.getRetTypeAccess().getTypeSimpleNameParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_4_0=ruleSimpleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRetTypeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.SimpleName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRetType"


    // $ANTLR start "entryRuleTupleType"
    // InternalFortXTrans.g:1631:1: entryRuleTupleType returns [EObject current=null] : iv_ruleTupleType= ruleTupleType EOF ;
    public final EObject entryRuleTupleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleType = null;


        try {
            // InternalFortXTrans.g:1631:50: (iv_ruleTupleType= ruleTupleType EOF )
            // InternalFortXTrans.g:1632:2: iv_ruleTupleType= ruleTupleType EOF
            {
             newCompositeNode(grammarAccess.getTupleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTupleType=ruleTupleType();

            state._fsp--;

             current =iv_ruleTupleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleType"


    // $ANTLR start "ruleTupleType"
    // InternalFortXTrans.g:1638:1: ruleTupleType returns [EObject current=null] : (otherlv_0= '(' ( (lv_types_1_0= ruleSimpleName ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSimpleName ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleTupleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1644:2: ( (otherlv_0= '(' ( (lv_types_1_0= ruleSimpleName ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSimpleName ) ) )* otherlv_4= ')' ) )
            // InternalFortXTrans.g:1645:2: (otherlv_0= '(' ( (lv_types_1_0= ruleSimpleName ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSimpleName ) ) )* otherlv_4= ')' )
            {
            // InternalFortXTrans.g:1645:2: (otherlv_0= '(' ( (lv_types_1_0= ruleSimpleName ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSimpleName ) ) )* otherlv_4= ')' )
            // InternalFortXTrans.g:1646:3: otherlv_0= '(' ( (lv_types_1_0= ruleSimpleName ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSimpleName ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTupleTypeAccess().getLeftParenthesisKeyword_0());
            		
            // InternalFortXTrans.g:1650:3: ( (lv_types_1_0= ruleSimpleName ) )
            // InternalFortXTrans.g:1651:4: (lv_types_1_0= ruleSimpleName )
            {
            // InternalFortXTrans.g:1651:4: (lv_types_1_0= ruleSimpleName )
            // InternalFortXTrans.g:1652:5: lv_types_1_0= ruleSimpleName
            {

            					newCompositeNode(grammarAccess.getTupleTypeAccess().getTypesSimpleNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_types_1_0=ruleSimpleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTupleTypeRule());
            					}
            					add(
            						current,
            						"types",
            						lv_types_1_0,
            						"srf.transpiler.fortxtrans.FortXTrans.SimpleName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFortXTrans.g:1669:3: (otherlv_2= ',' ( (lv_types_3_0= ruleSimpleName ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==19) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalFortXTrans.g:1670:4: otherlv_2= ',' ( (lv_types_3_0= ruleSimpleName ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTupleTypeAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalFortXTrans.g:1674:4: ( (lv_types_3_0= ruleSimpleName ) )
            	    // InternalFortXTrans.g:1675:5: (lv_types_3_0= ruleSimpleName )
            	    {
            	    // InternalFortXTrans.g:1675:5: (lv_types_3_0= ruleSimpleName )
            	    // InternalFortXTrans.g:1676:6: lv_types_3_0= ruleSimpleName
            	    {

            	    						newCompositeNode(grammarAccess.getTupleTypeAccess().getTypesSimpleNameParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_types_3_0=ruleSimpleName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTupleTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_3_0,
            	    							"srf.transpiler.fortxtrans.FortXTrans.SimpleName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTupleTypeAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleType"


    // $ANTLR start "entryRuleFnMods"
    // InternalFortXTrans.g:1702:1: entryRuleFnMods returns [EObject current=null] : iv_ruleFnMods= ruleFnMods EOF ;
    public final EObject entryRuleFnMods() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFnMods = null;


        try {
            // InternalFortXTrans.g:1702:47: (iv_ruleFnMods= ruleFnMods EOF )
            // InternalFortXTrans.g:1703:2: iv_ruleFnMods= ruleFnMods EOF
            {
             newCompositeNode(grammarAccess.getFnModsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFnMods=ruleFnMods();

            state._fsp--;

             current =iv_ruleFnMods; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFnMods"


    // $ANTLR start "ruleFnMods"
    // InternalFortXTrans.g:1709:1: ruleFnMods returns [EObject current=null] : ( (lv_mods_0_0= ruleFnMod ) )+ ;
    public final EObject ruleFnMods() throws RecognitionException {
        EObject current = null;

        EObject lv_mods_0_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1715:2: ( ( (lv_mods_0_0= ruleFnMod ) )+ )
            // InternalFortXTrans.g:1716:2: ( (lv_mods_0_0= ruleFnMod ) )+
            {
            // InternalFortXTrans.g:1716:2: ( (lv_mods_0_0= ruleFnMod ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=27 && LA31_0<=30)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalFortXTrans.g:1717:3: (lv_mods_0_0= ruleFnMod )
            	    {
            	    // InternalFortXTrans.g:1717:3: (lv_mods_0_0= ruleFnMod )
            	    // InternalFortXTrans.g:1718:4: lv_mods_0_0= ruleFnMod
            	    {

            	    				newCompositeNode(grammarAccess.getFnModsAccess().getModsFnModParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_25);
            	    lv_mods_0_0=ruleFnMod();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getFnModsRule());
            	    				}
            	    				add(
            	    					current,
            	    					"mods",
            	    					lv_mods_0_0,
            	    					"srf.transpiler.fortxtrans.FortXTrans.FnMod");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFnMods"


    // $ANTLR start "entryRuleFnMod"
    // InternalFortXTrans.g:1738:1: entryRuleFnMod returns [EObject current=null] : iv_ruleFnMod= ruleFnMod EOF ;
    public final EObject entryRuleFnMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFnMod = null;


        try {
            // InternalFortXTrans.g:1738:46: (iv_ruleFnMod= ruleFnMod EOF )
            // InternalFortXTrans.g:1739:2: iv_ruleFnMod= ruleFnMod EOF
            {
             newCompositeNode(grammarAccess.getFnModRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFnMod=ruleFnMod();

            state._fsp--;

             current =iv_ruleFnMod; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFnMod"


    // $ANTLR start "ruleFnMod"
    // InternalFortXTrans.g:1745:1: ruleFnMod returns [EObject current=null] : ( ( (lv_modtype_0_0= 'private' ) ) | ( (lv_modtype_1_0= 'test' ) ) | ( (lv_modtype_2_0= 'atomic' ) ) | ( (lv_modtype_3_0= 'io' ) ) ) ;
    public final EObject ruleFnMod() throws RecognitionException {
        EObject current = null;

        Token lv_modtype_0_0=null;
        Token lv_modtype_1_0=null;
        Token lv_modtype_2_0=null;
        Token lv_modtype_3_0=null;


        	enterRule();

        try {
            // InternalFortXTrans.g:1751:2: ( ( ( (lv_modtype_0_0= 'private' ) ) | ( (lv_modtype_1_0= 'test' ) ) | ( (lv_modtype_2_0= 'atomic' ) ) | ( (lv_modtype_3_0= 'io' ) ) ) )
            // InternalFortXTrans.g:1752:2: ( ( (lv_modtype_0_0= 'private' ) ) | ( (lv_modtype_1_0= 'test' ) ) | ( (lv_modtype_2_0= 'atomic' ) ) | ( (lv_modtype_3_0= 'io' ) ) )
            {
            // InternalFortXTrans.g:1752:2: ( ( (lv_modtype_0_0= 'private' ) ) | ( (lv_modtype_1_0= 'test' ) ) | ( (lv_modtype_2_0= 'atomic' ) ) | ( (lv_modtype_3_0= 'io' ) ) )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt32=1;
                }
                break;
            case 28:
                {
                alt32=2;
                }
                break;
            case 29:
                {
                alt32=3;
                }
                break;
            case 30:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalFortXTrans.g:1753:3: ( (lv_modtype_0_0= 'private' ) )
                    {
                    // InternalFortXTrans.g:1753:3: ( (lv_modtype_0_0= 'private' ) )
                    // InternalFortXTrans.g:1754:4: (lv_modtype_0_0= 'private' )
                    {
                    // InternalFortXTrans.g:1754:4: (lv_modtype_0_0= 'private' )
                    // InternalFortXTrans.g:1755:5: lv_modtype_0_0= 'private'
                    {
                    lv_modtype_0_0=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_modtype_0_0, grammarAccess.getFnModAccess().getModtypePrivateKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFnModRule());
                    					}
                    					setWithLastConsumed(current, "modtype", lv_modtype_0_0, "private");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1768:3: ( (lv_modtype_1_0= 'test' ) )
                    {
                    // InternalFortXTrans.g:1768:3: ( (lv_modtype_1_0= 'test' ) )
                    // InternalFortXTrans.g:1769:4: (lv_modtype_1_0= 'test' )
                    {
                    // InternalFortXTrans.g:1769:4: (lv_modtype_1_0= 'test' )
                    // InternalFortXTrans.g:1770:5: lv_modtype_1_0= 'test'
                    {
                    lv_modtype_1_0=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_modtype_1_0, grammarAccess.getFnModAccess().getModtypeTestKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFnModRule());
                    					}
                    					setWithLastConsumed(current, "modtype", lv_modtype_1_0, "test");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:1783:3: ( (lv_modtype_2_0= 'atomic' ) )
                    {
                    // InternalFortXTrans.g:1783:3: ( (lv_modtype_2_0= 'atomic' ) )
                    // InternalFortXTrans.g:1784:4: (lv_modtype_2_0= 'atomic' )
                    {
                    // InternalFortXTrans.g:1784:4: (lv_modtype_2_0= 'atomic' )
                    // InternalFortXTrans.g:1785:5: lv_modtype_2_0= 'atomic'
                    {
                    lv_modtype_2_0=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_modtype_2_0, grammarAccess.getFnModAccess().getModtypeAtomicKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFnModRule());
                    					}
                    					setWithLastConsumed(current, "modtype", lv_modtype_2_0, "atomic");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFortXTrans.g:1798:3: ( (lv_modtype_3_0= 'io' ) )
                    {
                    // InternalFortXTrans.g:1798:3: ( (lv_modtype_3_0= 'io' ) )
                    // InternalFortXTrans.g:1799:4: (lv_modtype_3_0= 'io' )
                    {
                    // InternalFortXTrans.g:1799:4: (lv_modtype_3_0= 'io' )
                    // InternalFortXTrans.g:1800:5: lv_modtype_3_0= 'io'
                    {
                    lv_modtype_3_0=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_modtype_3_0, grammarAccess.getFnModAccess().getModtypeIoKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFnModRule());
                    					}
                    					setWithLastConsumed(current, "modtype", lv_modtype_3_0, "io");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFnMod"


    // $ANTLR start "entryRuleFnDecl"
    // InternalFortXTrans.g:1816:1: entryRuleFnDecl returns [EObject current=null] : iv_ruleFnDecl= ruleFnDecl EOF ;
    public final EObject entryRuleFnDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFnDecl = null;


        try {
            // InternalFortXTrans.g:1816:47: (iv_ruleFnDecl= ruleFnDecl EOF )
            // InternalFortXTrans.g:1817:2: iv_ruleFnDecl= ruleFnDecl EOF
            {
             newCompositeNode(grammarAccess.getFnDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFnDecl=ruleFnDecl();

            state._fsp--;

             current =iv_ruleFnDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFnDecl"


    // $ANTLR start "ruleFnDecl"
    // InternalFortXTrans.g:1823:1: ruleFnDecl returns [EObject current=null] : ( ( (lv_mods_0_0= ruleFnMods ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleValParam ) ) ( (lv_retVal_3_0= ruleRetType ) )? ( ( (lv_body_4_0= '=' ) ) ( (lv_fnItself_5_0= ruleStmnts ) ) )? ) ;
    public final EObject ruleFnDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_body_4_0=null;
        EObject lv_mods_0_0 = null;

        EObject lv_params_2_0 = null;

        EObject lv_retVal_3_0 = null;

        EObject lv_fnItself_5_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1829:2: ( ( ( (lv_mods_0_0= ruleFnMods ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleValParam ) ) ( (lv_retVal_3_0= ruleRetType ) )? ( ( (lv_body_4_0= '=' ) ) ( (lv_fnItself_5_0= ruleStmnts ) ) )? ) )
            // InternalFortXTrans.g:1830:2: ( ( (lv_mods_0_0= ruleFnMods ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleValParam ) ) ( (lv_retVal_3_0= ruleRetType ) )? ( ( (lv_body_4_0= '=' ) ) ( (lv_fnItself_5_0= ruleStmnts ) ) )? )
            {
            // InternalFortXTrans.g:1830:2: ( ( (lv_mods_0_0= ruleFnMods ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleValParam ) ) ( (lv_retVal_3_0= ruleRetType ) )? ( ( (lv_body_4_0= '=' ) ) ( (lv_fnItself_5_0= ruleStmnts ) ) )? )
            // InternalFortXTrans.g:1831:3: ( (lv_mods_0_0= ruleFnMods ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleValParam ) ) ( (lv_retVal_3_0= ruleRetType ) )? ( ( (lv_body_4_0= '=' ) ) ( (lv_fnItself_5_0= ruleStmnts ) ) )?
            {
            // InternalFortXTrans.g:1831:3: ( (lv_mods_0_0= ruleFnMods ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=27 && LA33_0<=30)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalFortXTrans.g:1832:4: (lv_mods_0_0= ruleFnMods )
                    {
                    // InternalFortXTrans.g:1832:4: (lv_mods_0_0= ruleFnMods )
                    // InternalFortXTrans.g:1833:5: lv_mods_0_0= ruleFnMods
                    {

                    					newCompositeNode(grammarAccess.getFnDeclAccess().getModsFnModsParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_mods_0_0=ruleFnMods();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFnDeclRule());
                    					}
                    					set(
                    						current,
                    						"mods",
                    						lv_mods_0_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.FnMods");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalFortXTrans.g:1850:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFortXTrans.g:1851:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFortXTrans.g:1851:4: (lv_name_1_0= RULE_ID )
            // InternalFortXTrans.g:1852:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFnDeclAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFnDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalFortXTrans.g:1868:3: ( (lv_params_2_0= ruleValParam ) )
            // InternalFortXTrans.g:1869:4: (lv_params_2_0= ruleValParam )
            {
            // InternalFortXTrans.g:1869:4: (lv_params_2_0= ruleValParam )
            // InternalFortXTrans.g:1870:5: lv_params_2_0= ruleValParam
            {

            					newCompositeNode(grammarAccess.getFnDeclAccess().getParamsValParamParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_params_2_0=ruleValParam();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFnDeclRule());
            					}
            					set(
            						current,
            						"params",
            						lv_params_2_0,
            						"srf.transpiler.fortxtrans.FortXTrans.ValParam");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFortXTrans.g:1887:3: ( (lv_retVal_3_0= ruleRetType ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==26) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalFortXTrans.g:1888:4: (lv_retVal_3_0= ruleRetType )
                    {
                    // InternalFortXTrans.g:1888:4: (lv_retVal_3_0= ruleRetType )
                    // InternalFortXTrans.g:1889:5: lv_retVal_3_0= ruleRetType
                    {

                    					newCompositeNode(grammarAccess.getFnDeclAccess().getRetValRetTypeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_28);
                    lv_retVal_3_0=ruleRetType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFnDeclRule());
                    					}
                    					set(
                    						current,
                    						"retVal",
                    						lv_retVal_3_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.RetType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalFortXTrans.g:1906:3: ( ( (lv_body_4_0= '=' ) ) ( (lv_fnItself_5_0= ruleStmnts ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==31) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalFortXTrans.g:1907:4: ( (lv_body_4_0= '=' ) ) ( (lv_fnItself_5_0= ruleStmnts ) )
                    {
                    // InternalFortXTrans.g:1907:4: ( (lv_body_4_0= '=' ) )
                    // InternalFortXTrans.g:1908:5: (lv_body_4_0= '=' )
                    {
                    // InternalFortXTrans.g:1908:5: (lv_body_4_0= '=' )
                    // InternalFortXTrans.g:1909:6: lv_body_4_0= '='
                    {
                    lv_body_4_0=(Token)match(input,31,FOLLOW_29); 

                    						newLeafNode(lv_body_4_0, grammarAccess.getFnDeclAccess().getBodyEqualsSignKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFnDeclRule());
                    						}
                    						setWithLastConsumed(current, "body", true, "=");
                    					

                    }


                    }

                    // InternalFortXTrans.g:1921:4: ( (lv_fnItself_5_0= ruleStmnts ) )
                    // InternalFortXTrans.g:1922:5: (lv_fnItself_5_0= ruleStmnts )
                    {
                    // InternalFortXTrans.g:1922:5: (lv_fnItself_5_0= ruleStmnts )
                    // InternalFortXTrans.g:1923:6: lv_fnItself_5_0= ruleStmnts
                    {

                    						newCompositeNode(grammarAccess.getFnDeclAccess().getFnItselfStmntsParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_fnItself_5_0=ruleStmnts();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFnDeclRule());
                    						}
                    						set(
                    							current,
                    							"fnItself",
                    							lv_fnItself_5_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Stmnts");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFnDecl"


    // $ANTLR start "entryRuleStmnts"
    // InternalFortXTrans.g:1945:1: entryRuleStmnts returns [EObject current=null] : iv_ruleStmnts= ruleStmnts EOF ;
    public final EObject entryRuleStmnts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmnts = null;


        try {
            // InternalFortXTrans.g:1945:47: (iv_ruleStmnts= ruleStmnts EOF )
            // InternalFortXTrans.g:1946:2: iv_ruleStmnts= ruleStmnts EOF
            {
             newCompositeNode(grammarAccess.getStmntsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStmnts=ruleStmnts();

            state._fsp--;

             current =iv_ruleStmnts; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStmnts"


    // $ANTLR start "ruleStmnts"
    // InternalFortXTrans.g:1952:1: ruleStmnts returns [EObject current=null] : ( ( (lv_front_0_0= ruleStmnt ) ) | (otherlv_1= '(' otherlv_2= '|' ( (lv_delims_3_0= ruleStmntList ) ) otherlv_4= '|' otherlv_5= ')' ) | ( (lv_locVar_6_0= ruleLocalVarDecl ) ) | ( (lv_exp_7_0= ruleExpr ) ) ) ;
    public final EObject ruleStmnts() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_front_0_0 = null;

        EObject lv_delims_3_0 = null;

        EObject lv_locVar_6_0 = null;

        EObject lv_exp_7_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1958:2: ( ( ( (lv_front_0_0= ruleStmnt ) ) | (otherlv_1= '(' otherlv_2= '|' ( (lv_delims_3_0= ruleStmntList ) ) otherlv_4= '|' otherlv_5= ')' ) | ( (lv_locVar_6_0= ruleLocalVarDecl ) ) | ( (lv_exp_7_0= ruleExpr ) ) ) )
            // InternalFortXTrans.g:1959:2: ( ( (lv_front_0_0= ruleStmnt ) ) | (otherlv_1= '(' otherlv_2= '|' ( (lv_delims_3_0= ruleStmntList ) ) otherlv_4= '|' otherlv_5= ')' ) | ( (lv_locVar_6_0= ruleLocalVarDecl ) ) | ( (lv_exp_7_0= ruleExpr ) ) )
            {
            // InternalFortXTrans.g:1959:2: ( ( (lv_front_0_0= ruleStmnt ) ) | (otherlv_1= '(' otherlv_2= '|' ( (lv_delims_3_0= ruleStmntList ) ) otherlv_4= '|' otherlv_5= ')' ) | ( (lv_locVar_6_0= ruleLocalVarDecl ) ) | ( (lv_exp_7_0= ruleExpr ) ) )
            int alt36=4;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // InternalFortXTrans.g:1960:3: ( (lv_front_0_0= ruleStmnt ) )
                    {
                    // InternalFortXTrans.g:1960:3: ( (lv_front_0_0= ruleStmnt ) )
                    // InternalFortXTrans.g:1961:4: (lv_front_0_0= ruleStmnt )
                    {
                    // InternalFortXTrans.g:1961:4: (lv_front_0_0= ruleStmnt )
                    // InternalFortXTrans.g:1962:5: lv_front_0_0= ruleStmnt
                    {

                    					newCompositeNode(grammarAccess.getStmntsAccess().getFrontStmntParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_front_0_0=ruleStmnt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStmntsRule());
                    					}
                    					set(
                    						current,
                    						"front",
                    						lv_front_0_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.Stmnt");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1980:3: (otherlv_1= '(' otherlv_2= '|' ( (lv_delims_3_0= ruleStmntList ) ) otherlv_4= '|' otherlv_5= ')' )
                    {
                    // InternalFortXTrans.g:1980:3: (otherlv_1= '(' otherlv_2= '|' ( (lv_delims_3_0= ruleStmntList ) ) otherlv_4= '|' otherlv_5= ')' )
                    // InternalFortXTrans.g:1981:4: otherlv_1= '(' otherlv_2= '|' ( (lv_delims_3_0= ruleStmntList ) ) otherlv_4= '|' otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getStmntsAccess().getLeftParenthesisKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,32,FOLLOW_31); 

                    				newLeafNode(otherlv_2, grammarAccess.getStmntsAccess().getVerticalLineKeyword_1_1());
                    			
                    // InternalFortXTrans.g:1989:4: ( (lv_delims_3_0= ruleStmntList ) )
                    // InternalFortXTrans.g:1990:5: (lv_delims_3_0= ruleStmntList )
                    {
                    // InternalFortXTrans.g:1990:5: (lv_delims_3_0= ruleStmntList )
                    // InternalFortXTrans.g:1991:6: lv_delims_3_0= ruleStmntList
                    {

                    						newCompositeNode(grammarAccess.getStmntsAccess().getDelimsStmntListParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_delims_3_0=ruleStmntList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStmntsRule());
                    						}
                    						set(
                    							current,
                    							"delims",
                    							lv_delims_3_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.StmntList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,32,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getStmntsAccess().getVerticalLineKeyword_1_3());
                    			
                    otherlv_5=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getStmntsAccess().getRightParenthesisKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:2018:3: ( (lv_locVar_6_0= ruleLocalVarDecl ) )
                    {
                    // InternalFortXTrans.g:2018:3: ( (lv_locVar_6_0= ruleLocalVarDecl ) )
                    // InternalFortXTrans.g:2019:4: (lv_locVar_6_0= ruleLocalVarDecl )
                    {
                    // InternalFortXTrans.g:2019:4: (lv_locVar_6_0= ruleLocalVarDecl )
                    // InternalFortXTrans.g:2020:5: lv_locVar_6_0= ruleLocalVarDecl
                    {

                    					newCompositeNode(grammarAccess.getStmntsAccess().getLocVarLocalVarDeclParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_locVar_6_0=ruleLocalVarDecl();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStmntsRule());
                    					}
                    					set(
                    						current,
                    						"locVar",
                    						lv_locVar_6_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.LocalVarDecl");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFortXTrans.g:2038:3: ( (lv_exp_7_0= ruleExpr ) )
                    {
                    // InternalFortXTrans.g:2038:3: ( (lv_exp_7_0= ruleExpr ) )
                    // InternalFortXTrans.g:2039:4: (lv_exp_7_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:2039:4: (lv_exp_7_0= ruleExpr )
                    // InternalFortXTrans.g:2040:5: lv_exp_7_0= ruleExpr
                    {

                    					newCompositeNode(grammarAccess.getStmntsAccess().getExpExprParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_exp_7_0=ruleExpr();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStmntsRule());
                    					}
                    					set(
                    						current,
                    						"exp",
                    						lv_exp_7_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.Expr");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStmnts"


    // $ANTLR start "entryRuleStmnt"
    // InternalFortXTrans.g:2061:1: entryRuleStmnt returns [EObject current=null] : iv_ruleStmnt= ruleStmnt EOF ;
    public final EObject entryRuleStmnt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmnt = null;


        try {
            // InternalFortXTrans.g:2061:46: (iv_ruleStmnt= ruleStmnt EOF )
            // InternalFortXTrans.g:2062:2: iv_ruleStmnt= ruleStmnt EOF
            {
             newCompositeNode(grammarAccess.getStmntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStmnt=ruleStmnt();

            state._fsp--;

             current =iv_ruleStmnt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStmnt"


    // $ANTLR start "ruleStmnt"
    // InternalFortXTrans.g:2068:1: ruleStmnt returns [EObject current=null] : ( (lv_delim_0_0= ruleDelimitedExpr ) ) ;
    public final EObject ruleStmnt() throws RecognitionException {
        EObject current = null;

        EObject lv_delim_0_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2074:2: ( ( (lv_delim_0_0= ruleDelimitedExpr ) ) )
            // InternalFortXTrans.g:2075:2: ( (lv_delim_0_0= ruleDelimitedExpr ) )
            {
            // InternalFortXTrans.g:2075:2: ( (lv_delim_0_0= ruleDelimitedExpr ) )
            // InternalFortXTrans.g:2076:3: (lv_delim_0_0= ruleDelimitedExpr )
            {
            // InternalFortXTrans.g:2076:3: (lv_delim_0_0= ruleDelimitedExpr )
            // InternalFortXTrans.g:2077:4: lv_delim_0_0= ruleDelimitedExpr
            {

            				newCompositeNode(grammarAccess.getStmntAccess().getDelimDelimitedExprParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_delim_0_0=ruleDelimitedExpr();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getStmntRule());
            				}
            				set(
            					current,
            					"delim",
            					lv_delim_0_0,
            					"srf.transpiler.fortxtrans.FortXTrans.DelimitedExpr");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStmnt"


    // $ANTLR start "entryRuleStmntList"
    // InternalFortXTrans.g:2097:1: entryRuleStmntList returns [EObject current=null] : iv_ruleStmntList= ruleStmntList EOF ;
    public final EObject entryRuleStmntList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmntList = null;


        try {
            // InternalFortXTrans.g:2097:50: (iv_ruleStmntList= ruleStmntList EOF )
            // InternalFortXTrans.g:2098:2: iv_ruleStmntList= ruleStmntList EOF
            {
             newCompositeNode(grammarAccess.getStmntListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStmntList=ruleStmntList();

            state._fsp--;

             current =iv_ruleStmntList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStmntList"


    // $ANTLR start "ruleStmntList"
    // InternalFortXTrans.g:2104:1: ruleStmntList returns [EObject current=null] : ( ( (lv_delim_0_0= ruleStmnt ) ) (otherlv_1= ',' ( (lv_delim_2_0= ruleStmnt ) ) )* ) ;
    public final EObject ruleStmntList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_delim_0_0 = null;

        EObject lv_delim_2_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2110:2: ( ( ( (lv_delim_0_0= ruleStmnt ) ) (otherlv_1= ',' ( (lv_delim_2_0= ruleStmnt ) ) )* ) )
            // InternalFortXTrans.g:2111:2: ( ( (lv_delim_0_0= ruleStmnt ) ) (otherlv_1= ',' ( (lv_delim_2_0= ruleStmnt ) ) )* )
            {
            // InternalFortXTrans.g:2111:2: ( ( (lv_delim_0_0= ruleStmnt ) ) (otherlv_1= ',' ( (lv_delim_2_0= ruleStmnt ) ) )* )
            // InternalFortXTrans.g:2112:3: ( (lv_delim_0_0= ruleStmnt ) ) (otherlv_1= ',' ( (lv_delim_2_0= ruleStmnt ) ) )*
            {
            // InternalFortXTrans.g:2112:3: ( (lv_delim_0_0= ruleStmnt ) )
            // InternalFortXTrans.g:2113:4: (lv_delim_0_0= ruleStmnt )
            {
            // InternalFortXTrans.g:2113:4: (lv_delim_0_0= ruleStmnt )
            // InternalFortXTrans.g:2114:5: lv_delim_0_0= ruleStmnt
            {

            					newCompositeNode(grammarAccess.getStmntListAccess().getDelimStmntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_delim_0_0=ruleStmnt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStmntListRule());
            					}
            					add(
            						current,
            						"delim",
            						lv_delim_0_0,
            						"srf.transpiler.fortxtrans.FortXTrans.Stmnt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFortXTrans.g:2131:3: (otherlv_1= ',' ( (lv_delim_2_0= ruleStmnt ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==19) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalFortXTrans.g:2132:4: otherlv_1= ',' ( (lv_delim_2_0= ruleStmnt ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_31); 

            	    				newLeafNode(otherlv_1, grammarAccess.getStmntListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalFortXTrans.g:2136:4: ( (lv_delim_2_0= ruleStmnt ) )
            	    // InternalFortXTrans.g:2137:5: (lv_delim_2_0= ruleStmnt )
            	    {
            	    // InternalFortXTrans.g:2137:5: (lv_delim_2_0= ruleStmnt )
            	    // InternalFortXTrans.g:2138:6: lv_delim_2_0= ruleStmnt
            	    {

            	    						newCompositeNode(grammarAccess.getStmntListAccess().getDelimStmntParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_delim_2_0=ruleStmnt();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStmntListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"delim",
            	    							lv_delim_2_0,
            	    							"srf.transpiler.fortxtrans.FortXTrans.Stmnt");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStmntList"


    // $ANTLR start "entryRuleExpr"
    // InternalFortXTrans.g:2160:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalFortXTrans.g:2160:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalFortXTrans.g:2161:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalFortXTrans.g:2167:1: ruleExpr returns [EObject current=null] : (this_Or_0= ruleOr ( (lv_tail_1_0= ruleExprTail ) )* ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;

        EObject lv_tail_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2173:2: ( (this_Or_0= ruleOr ( (lv_tail_1_0= ruleExprTail ) )* ) )
            // InternalFortXTrans.g:2174:2: (this_Or_0= ruleOr ( (lv_tail_1_0= ruleExprTail ) )* )
            {
            // InternalFortXTrans.g:2174:2: (this_Or_0= ruleOr ( (lv_tail_1_0= ruleExprTail ) )* )
            // InternalFortXTrans.g:2175:3: this_Or_0= ruleOr ( (lv_tail_1_0= ruleExprTail ) )*
            {

            			newCompositeNode(grammarAccess.getExprAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFortXTrans.g:2183:3: ( (lv_tail_1_0= ruleExprTail ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==23) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalFortXTrans.g:2184:4: (lv_tail_1_0= ruleExprTail )
            	    {
            	    // InternalFortXTrans.g:2184:4: (lv_tail_1_0= ruleExprTail )
            	    // InternalFortXTrans.g:2185:5: lv_tail_1_0= ruleExprTail
            	    {

            	    					newCompositeNode(grammarAccess.getExprAccess().getTailExprTailParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_tail_1_0=ruleExprTail();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExprRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tail",
            	    						lv_tail_1_0,
            	    						"srf.transpiler.fortxtrans.FortXTrans.ExprTail");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleOr"
    // InternalFortXTrans.g:2206:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalFortXTrans.g:2206:43: (iv_ruleOr= ruleOr EOF )
            // InternalFortXTrans.g:2207:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalFortXTrans.g:2213:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2219:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalFortXTrans.g:2220:2: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalFortXTrans.g:2220:2: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalFortXTrans.g:2221:3: this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFortXTrans.g:2229:3: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==33) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalFortXTrans.g:2230:4: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalFortXTrans.g:2230:4: ()
            	    // InternalFortXTrans.g:2231:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_29); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getORKeyword_1_1());
            	    			
            	    // InternalFortXTrans.g:2241:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalFortXTrans.g:2242:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalFortXTrans.g:2242:5: (lv_right_3_0= ruleAnd )
            	    // InternalFortXTrans.g:2243:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"srf.transpiler.fortxtrans.FortXTrans.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalFortXTrans.g:2265:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalFortXTrans.g:2265:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalFortXTrans.g:2266:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalFortXTrans.g:2272:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2278:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalFortXTrans.g:2279:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalFortXTrans.g:2279:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalFortXTrans.g:2280:3: this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFortXTrans.g:2288:3: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==34) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalFortXTrans.g:2289:4: () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalFortXTrans.g:2289:4: ()
            	    // InternalFortXTrans.g:2290:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_29); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getANDKeyword_1_1());
            	    			
            	    // InternalFortXTrans.g:2300:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalFortXTrans.g:2301:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalFortXTrans.g:2301:5: (lv_right_3_0= ruleEquality )
            	    // InternalFortXTrans.g:2302:6: lv_right_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"srf.transpiler.fortxtrans.FortXTrans.Equality");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalFortXTrans.g:2324:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalFortXTrans.g:2324:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalFortXTrans.g:2325:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalFortXTrans.g:2331:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '===' | lv_op_2_2= '=/=' | lv_op_2_3= 'EQ' | lv_op_2_4= 'NE' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2337:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '===' | lv_op_2_2= '=/=' | lv_op_2_3= 'EQ' | lv_op_2_4= 'NE' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalFortXTrans.g:2338:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '===' | lv_op_2_2= '=/=' | lv_op_2_3= 'EQ' | lv_op_2_4= 'NE' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalFortXTrans.g:2338:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '===' | lv_op_2_2= '=/=' | lv_op_2_3= 'EQ' | lv_op_2_4= 'NE' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalFortXTrans.g:2339:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '===' | lv_op_2_2= '=/=' | lv_op_2_3= 'EQ' | lv_op_2_4= 'NE' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFortXTrans.g:2347:3: ( () ( ( (lv_op_2_1= '===' | lv_op_2_2= '=/=' | lv_op_2_3= 'EQ' | lv_op_2_4= 'NE' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop42:
            do {
                int alt42=2;
                switch ( input.LA(1) ) {
                case 35:
                    {
                    alt42=1;
                    }
                    break;
                case 36:
                    {
                    alt42=1;
                    }
                    break;
                case 37:
                    {
                    alt42=1;
                    }
                    break;
                case 38:
                    {
                    alt42=1;
                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // InternalFortXTrans.g:2348:4: () ( ( (lv_op_2_1= '===' | lv_op_2_2= '=/=' | lv_op_2_3= 'EQ' | lv_op_2_4= 'NE' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalFortXTrans.g:2348:4: ()
            	    // InternalFortXTrans.g:2349:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFortXTrans.g:2355:4: ( ( (lv_op_2_1= '===' | lv_op_2_2= '=/=' | lv_op_2_3= 'EQ' | lv_op_2_4= 'NE' ) ) )
            	    // InternalFortXTrans.g:2356:5: ( (lv_op_2_1= '===' | lv_op_2_2= '=/=' | lv_op_2_3= 'EQ' | lv_op_2_4= 'NE' ) )
            	    {
            	    // InternalFortXTrans.g:2356:5: ( (lv_op_2_1= '===' | lv_op_2_2= '=/=' | lv_op_2_3= 'EQ' | lv_op_2_4= 'NE' ) )
            	    // InternalFortXTrans.g:2357:6: (lv_op_2_1= '===' | lv_op_2_2= '=/=' | lv_op_2_3= 'EQ' | lv_op_2_4= 'NE' )
            	    {
            	    // InternalFortXTrans.g:2357:6: (lv_op_2_1= '===' | lv_op_2_2= '=/=' | lv_op_2_3= 'EQ' | lv_op_2_4= 'NE' )
            	    int alt41=4;
            	    switch ( input.LA(1) ) {
            	    case 35:
            	        {
            	        alt41=1;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt41=2;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt41=3;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt41=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt41) {
            	        case 1 :
            	            // InternalFortXTrans.g:2358:7: lv_op_2_1= '==='
            	            {
            	            lv_op_2_1=(Token)match(input,35,FOLLOW_29); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalFortXTrans.g:2369:7: lv_op_2_2= '=/='
            	            {
            	            lv_op_2_2=(Token)match(input,36,FOLLOW_29); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpEqualsSignSolidusEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalFortXTrans.g:2380:7: lv_op_2_3= 'EQ'
            	            {
            	            lv_op_2_3=(Token)match(input,37,FOLLOW_29); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getEqualityAccess().getOpEQKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalFortXTrans.g:2391:7: lv_op_2_4= 'NE'
            	            {
            	            lv_op_2_4=(Token)match(input,38,FOLLOW_29); 

            	            							newLeafNode(lv_op_2_4, grammarAccess.getEqualityAccess().getOpNEKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalFortXTrans.g:2404:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalFortXTrans.g:2405:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalFortXTrans.g:2405:5: (lv_right_3_0= ruleComparison )
            	    // InternalFortXTrans.g:2406:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"srf.transpiler.fortxtrans.FortXTrans.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalFortXTrans.g:2428:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalFortXTrans.g:2428:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalFortXTrans.g:2429:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalFortXTrans.g:2435:1: ruleComparison returns [EObject current=null] : (this_AddExpr_0= ruleAddExpr ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'LT' | lv_op_2_6= 'GT' | lv_op_2_7= 'LE' | lv_op_2_8= 'GE' ) ) ) ( (lv_right_3_0= ruleAddExpr ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_2_6=null;
        Token lv_op_2_7=null;
        Token lv_op_2_8=null;
        EObject this_AddExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2441:2: ( (this_AddExpr_0= ruleAddExpr ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'LT' | lv_op_2_6= 'GT' | lv_op_2_7= 'LE' | lv_op_2_8= 'GE' ) ) ) ( (lv_right_3_0= ruleAddExpr ) ) )* ) )
            // InternalFortXTrans.g:2442:2: (this_AddExpr_0= ruleAddExpr ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'LT' | lv_op_2_6= 'GT' | lv_op_2_7= 'LE' | lv_op_2_8= 'GE' ) ) ) ( (lv_right_3_0= ruleAddExpr ) ) )* )
            {
            // InternalFortXTrans.g:2442:2: (this_AddExpr_0= ruleAddExpr ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'LT' | lv_op_2_6= 'GT' | lv_op_2_7= 'LE' | lv_op_2_8= 'GE' ) ) ) ( (lv_right_3_0= ruleAddExpr ) ) )* )
            // InternalFortXTrans.g:2443:3: this_AddExpr_0= ruleAddExpr ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'LT' | lv_op_2_6= 'GT' | lv_op_2_7= 'LE' | lv_op_2_8= 'GE' ) ) ) ( (lv_right_3_0= ruleAddExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getAddExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_AddExpr_0=ruleAddExpr();

            state._fsp--;


            			current = this_AddExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFortXTrans.g:2451:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'LT' | lv_op_2_6= 'GT' | lv_op_2_7= 'LE' | lv_op_2_8= 'GE' ) ) ) ( (lv_right_3_0= ruleAddExpr ) ) )*
            loop44:
            do {
                int alt44=2;
                alt44 = dfa44.predict(input);
                switch (alt44) {
            	case 1 :
            	    // InternalFortXTrans.g:2452:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'LT' | lv_op_2_6= 'GT' | lv_op_2_7= 'LE' | lv_op_2_8= 'GE' ) ) ) ( (lv_right_3_0= ruleAddExpr ) )
            	    {
            	    // InternalFortXTrans.g:2452:4: ()
            	    // InternalFortXTrans.g:2453:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFortXTrans.g:2459:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'LT' | lv_op_2_6= 'GT' | lv_op_2_7= 'LE' | lv_op_2_8= 'GE' ) ) )
            	    // InternalFortXTrans.g:2460:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'LT' | lv_op_2_6= 'GT' | lv_op_2_7= 'LE' | lv_op_2_8= 'GE' ) )
            	    {
            	    // InternalFortXTrans.g:2460:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'LT' | lv_op_2_6= 'GT' | lv_op_2_7= 'LE' | lv_op_2_8= 'GE' ) )
            	    // InternalFortXTrans.g:2461:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'LT' | lv_op_2_6= 'GT' | lv_op_2_7= 'LE' | lv_op_2_8= 'GE' )
            	    {
            	    // InternalFortXTrans.g:2461:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'LT' | lv_op_2_6= 'GT' | lv_op_2_7= 'LE' | lv_op_2_8= 'GE' )
            	    int alt43=8;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	        {
            	        alt43=1;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt43=2;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt43=3;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt43=4;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt43=5;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt43=6;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt43=7;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt43=8;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 43, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt43) {
            	        case 1 :
            	            // InternalFortXTrans.g:2462:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,39,FOLLOW_29); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalFortXTrans.g:2473:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,40,FOLLOW_29); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalFortXTrans.g:2484:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,41,FOLLOW_29); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalFortXTrans.g:2495:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,42,FOLLOW_29); 

            	            							newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            						

            	            }
            	            break;
            	        case 5 :
            	            // InternalFortXTrans.g:2506:7: lv_op_2_5= 'LT'
            	            {
            	            lv_op_2_5=(Token)match(input,43,FOLLOW_29); 

            	            							newLeafNode(lv_op_2_5, grammarAccess.getComparisonAccess().getOpLTKeyword_1_1_0_4());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_5, null);
            	            						

            	            }
            	            break;
            	        case 6 :
            	            // InternalFortXTrans.g:2517:7: lv_op_2_6= 'GT'
            	            {
            	            lv_op_2_6=(Token)match(input,44,FOLLOW_29); 

            	            							newLeafNode(lv_op_2_6, grammarAccess.getComparisonAccess().getOpGTKeyword_1_1_0_5());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_6, null);
            	            						

            	            }
            	            break;
            	        case 7 :
            	            // InternalFortXTrans.g:2528:7: lv_op_2_7= 'LE'
            	            {
            	            lv_op_2_7=(Token)match(input,45,FOLLOW_29); 

            	            							newLeafNode(lv_op_2_7, grammarAccess.getComparisonAccess().getOpLEKeyword_1_1_0_6());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_7, null);
            	            						

            	            }
            	            break;
            	        case 8 :
            	            // InternalFortXTrans.g:2539:7: lv_op_2_8= 'GE'
            	            {
            	            lv_op_2_8=(Token)match(input,46,FOLLOW_29); 

            	            							newLeafNode(lv_op_2_8, grammarAccess.getComparisonAccess().getOpGEKeyword_1_1_0_7());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_8, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalFortXTrans.g:2552:4: ( (lv_right_3_0= ruleAddExpr ) )
            	    // InternalFortXTrans.g:2553:5: (lv_right_3_0= ruleAddExpr )
            	    {
            	    // InternalFortXTrans.g:2553:5: (lv_right_3_0= ruleAddExpr )
            	    // InternalFortXTrans.g:2554:6: lv_right_3_0= ruleAddExpr
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightAddExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_right_3_0=ruleAddExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"srf.transpiler.fortxtrans.FortXTrans.AddExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleAddExpr"
    // InternalFortXTrans.g:2576:1: entryRuleAddExpr returns [EObject current=null] : iv_ruleAddExpr= ruleAddExpr EOF ;
    public final EObject entryRuleAddExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpr = null;


        try {
            // InternalFortXTrans.g:2576:48: (iv_ruleAddExpr= ruleAddExpr EOF )
            // InternalFortXTrans.g:2577:2: iv_ruleAddExpr= ruleAddExpr EOF
            {
             newCompositeNode(grammarAccess.getAddExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddExpr=ruleAddExpr();

            state._fsp--;

             current =iv_ruleAddExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpr"


    // $ANTLR start "ruleAddExpr"
    // InternalFortXTrans.g:2583:1: ruleAddExpr returns [EObject current=null] : (this_SubExpr_0= ruleSubExpr ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubExpr ) ) )* ) ;
    public final EObject ruleAddExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SubExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2589:2: ( (this_SubExpr_0= ruleSubExpr ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubExpr ) ) )* ) )
            // InternalFortXTrans.g:2590:2: (this_SubExpr_0= ruleSubExpr ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubExpr ) ) )* )
            {
            // InternalFortXTrans.g:2590:2: (this_SubExpr_0= ruleSubExpr ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubExpr ) ) )* )
            // InternalFortXTrans.g:2591:3: this_SubExpr_0= ruleSubExpr ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getAddExprAccess().getSubExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_SubExpr_0=ruleSubExpr();

            state._fsp--;


            			current = this_SubExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFortXTrans.g:2599:3: ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubExpr ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==47) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalFortXTrans.g:2600:4: () otherlv_2= '+' ( (lv_right_3_0= ruleSubExpr ) )
            	    {
            	    // InternalFortXTrans.g:2600:4: ()
            	    // InternalFortXTrans.g:2601:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAddExprAccess().getAddExprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,47,FOLLOW_29); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAddExprAccess().getPlusSignKeyword_1_1());
            	    			
            	    // InternalFortXTrans.g:2611:4: ( (lv_right_3_0= ruleSubExpr ) )
            	    // InternalFortXTrans.g:2612:5: (lv_right_3_0= ruleSubExpr )
            	    {
            	    // InternalFortXTrans.g:2612:5: (lv_right_3_0= ruleSubExpr )
            	    // InternalFortXTrans.g:2613:6: lv_right_3_0= ruleSubExpr
            	    {

            	    						newCompositeNode(grammarAccess.getAddExprAccess().getRightSubExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_right_3_0=ruleSubExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"srf.transpiler.fortxtrans.FortXTrans.SubExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddExpr"


    // $ANTLR start "entryRuleSubExpr"
    // InternalFortXTrans.g:2635:1: entryRuleSubExpr returns [EObject current=null] : iv_ruleSubExpr= ruleSubExpr EOF ;
    public final EObject entryRuleSubExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpr = null;


        try {
            // InternalFortXTrans.g:2635:48: (iv_ruleSubExpr= ruleSubExpr EOF )
            // InternalFortXTrans.g:2636:2: iv_ruleSubExpr= ruleSubExpr EOF
            {
             newCompositeNode(grammarAccess.getSubExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubExpr=ruleSubExpr();

            state._fsp--;

             current =iv_ruleSubExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubExpr"


    // $ANTLR start "ruleSubExpr"
    // InternalFortXTrans.g:2642:1: ruleSubExpr returns [EObject current=null] : (this_DivExpr_0= ruleDivExpr ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivExpr ) ) )* ) ;
    public final EObject ruleSubExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_DivExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2648:2: ( (this_DivExpr_0= ruleDivExpr ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivExpr ) ) )* ) )
            // InternalFortXTrans.g:2649:2: (this_DivExpr_0= ruleDivExpr ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivExpr ) ) )* )
            {
            // InternalFortXTrans.g:2649:2: (this_DivExpr_0= ruleDivExpr ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivExpr ) ) )* )
            // InternalFortXTrans.g:2650:3: this_DivExpr_0= ruleDivExpr ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getSubExprAccess().getDivExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_DivExpr_0=ruleDivExpr();

            state._fsp--;


            			current = this_DivExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFortXTrans.g:2658:3: ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivExpr ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==48) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalFortXTrans.g:2659:4: () otherlv_2= '-' ( (lv_right_3_0= ruleDivExpr ) )
            	    {
            	    // InternalFortXTrans.g:2659:4: ()
            	    // InternalFortXTrans.g:2660:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSubExprAccess().getSubExprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,48,FOLLOW_29); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSubExprAccess().getHyphenMinusKeyword_1_1());
            	    			
            	    // InternalFortXTrans.g:2670:4: ( (lv_right_3_0= ruleDivExpr ) )
            	    // InternalFortXTrans.g:2671:5: (lv_right_3_0= ruleDivExpr )
            	    {
            	    // InternalFortXTrans.g:2671:5: (lv_right_3_0= ruleDivExpr )
            	    // InternalFortXTrans.g:2672:6: lv_right_3_0= ruleDivExpr
            	    {

            	    						newCompositeNode(grammarAccess.getSubExprAccess().getRightDivExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_right_3_0=ruleDivExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"srf.transpiler.fortxtrans.FortXTrans.DivExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubExpr"


    // $ANTLR start "entryRuleDivExpr"
    // InternalFortXTrans.g:2694:1: entryRuleDivExpr returns [EObject current=null] : iv_ruleDivExpr= ruleDivExpr EOF ;
    public final EObject entryRuleDivExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpr = null;


        try {
            // InternalFortXTrans.g:2694:48: (iv_ruleDivExpr= ruleDivExpr EOF )
            // InternalFortXTrans.g:2695:2: iv_ruleDivExpr= ruleDivExpr EOF
            {
             newCompositeNode(grammarAccess.getDivExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivExpr=ruleDivExpr();

            state._fsp--;

             current =iv_ruleDivExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivExpr"


    // $ANTLR start "ruleDivExpr"
    // InternalFortXTrans.g:2701:1: ruleDivExpr returns [EObject current=null] : (this_MultExpr_0= ruleMultExpr ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultExpr ) ) )* ) ;
    public final EObject ruleDivExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_MultExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2707:2: ( (this_MultExpr_0= ruleMultExpr ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultExpr ) ) )* ) )
            // InternalFortXTrans.g:2708:2: (this_MultExpr_0= ruleMultExpr ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultExpr ) ) )* )
            {
            // InternalFortXTrans.g:2708:2: (this_MultExpr_0= ruleMultExpr ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultExpr ) ) )* )
            // InternalFortXTrans.g:2709:3: this_MultExpr_0= ruleMultExpr ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getDivExprAccess().getMultExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
            this_MultExpr_0=ruleMultExpr();

            state._fsp--;


            			current = this_MultExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFortXTrans.g:2717:3: ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultExpr ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==49) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalFortXTrans.g:2718:4: () otherlv_2= '/' ( (lv_right_3_0= ruleMultExpr ) )
            	    {
            	    // InternalFortXTrans.g:2718:4: ()
            	    // InternalFortXTrans.g:2719:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDivExprAccess().getDivExprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_29); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDivExprAccess().getSolidusKeyword_1_1());
            	    			
            	    // InternalFortXTrans.g:2729:4: ( (lv_right_3_0= ruleMultExpr ) )
            	    // InternalFortXTrans.g:2730:5: (lv_right_3_0= ruleMultExpr )
            	    {
            	    // InternalFortXTrans.g:2730:5: (lv_right_3_0= ruleMultExpr )
            	    // InternalFortXTrans.g:2731:6: lv_right_3_0= ruleMultExpr
            	    {

            	    						newCompositeNode(grammarAccess.getDivExprAccess().getRightMultExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_right_3_0=ruleMultExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDivExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"srf.transpiler.fortxtrans.FortXTrans.MultExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivExpr"


    // $ANTLR start "entryRuleMultExpr"
    // InternalFortXTrans.g:2753:1: entryRuleMultExpr returns [EObject current=null] : iv_ruleMultExpr= ruleMultExpr EOF ;
    public final EObject entryRuleMultExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpr = null;


        try {
            // InternalFortXTrans.g:2753:49: (iv_ruleMultExpr= ruleMultExpr EOF )
            // InternalFortXTrans.g:2754:2: iv_ruleMultExpr= ruleMultExpr EOF
            {
             newCompositeNode(grammarAccess.getMultExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultExpr=ruleMultExpr();

            state._fsp--;

             current =iv_ruleMultExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultExpr"


    // $ANTLR start "ruleMultExpr"
    // InternalFortXTrans.g:2760:1: ruleMultExpr returns [EObject current=null] : (this_ExponentExpr_0= ruleExponentExpr ( () otherlv_2= '*' ( (lv_right_3_0= ruleExponentExpr ) ) )* ) ;
    public final EObject ruleMultExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ExponentExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2766:2: ( (this_ExponentExpr_0= ruleExponentExpr ( () otherlv_2= '*' ( (lv_right_3_0= ruleExponentExpr ) ) )* ) )
            // InternalFortXTrans.g:2767:2: (this_ExponentExpr_0= ruleExponentExpr ( () otherlv_2= '*' ( (lv_right_3_0= ruleExponentExpr ) ) )* )
            {
            // InternalFortXTrans.g:2767:2: (this_ExponentExpr_0= ruleExponentExpr ( () otherlv_2= '*' ( (lv_right_3_0= ruleExponentExpr ) ) )* )
            // InternalFortXTrans.g:2768:3: this_ExponentExpr_0= ruleExponentExpr ( () otherlv_2= '*' ( (lv_right_3_0= ruleExponentExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultExprAccess().getExponentExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_39);
            this_ExponentExpr_0=ruleExponentExpr();

            state._fsp--;


            			current = this_ExponentExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFortXTrans.g:2776:3: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExponentExpr ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==50) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalFortXTrans.g:2777:4: () otherlv_2= '*' ( (lv_right_3_0= ruleExponentExpr ) )
            	    {
            	    // InternalFortXTrans.g:2777:4: ()
            	    // InternalFortXTrans.g:2778:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultExprAccess().getMultExprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,50,FOLLOW_29); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMultExprAccess().getAsteriskKeyword_1_1());
            	    			
            	    // InternalFortXTrans.g:2788:4: ( (lv_right_3_0= ruleExponentExpr ) )
            	    // InternalFortXTrans.g:2789:5: (lv_right_3_0= ruleExponentExpr )
            	    {
            	    // InternalFortXTrans.g:2789:5: (lv_right_3_0= ruleExponentExpr )
            	    // InternalFortXTrans.g:2790:6: lv_right_3_0= ruleExponentExpr
            	    {

            	    						newCompositeNode(grammarAccess.getMultExprAccess().getRightExponentExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_right_3_0=ruleExponentExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"srf.transpiler.fortxtrans.FortXTrans.ExponentExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultExpr"


    // $ANTLR start "entryRuleExponentExpr"
    // InternalFortXTrans.g:2812:1: entryRuleExponentExpr returns [EObject current=null] : iv_ruleExponentExpr= ruleExponentExpr EOF ;
    public final EObject entryRuleExponentExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentExpr = null;


        try {
            // InternalFortXTrans.g:2812:53: (iv_ruleExponentExpr= ruleExponentExpr EOF )
            // InternalFortXTrans.g:2813:2: iv_ruleExponentExpr= ruleExponentExpr EOF
            {
             newCompositeNode(grammarAccess.getExponentExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExponentExpr=ruleExponentExpr();

            state._fsp--;

             current =iv_ruleExponentExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExponentExpr"


    // $ANTLR start "ruleExponentExpr"
    // InternalFortXTrans.g:2819:1: ruleExponentExpr returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleExponentExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2825:2: ( (this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalFortXTrans.g:2826:2: (this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalFortXTrans.g:2826:2: (this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalFortXTrans.g:2827:3: this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getExponentExprAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFortXTrans.g:2835:3: ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==51) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalFortXTrans.g:2836:4: () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalFortXTrans.g:2836:4: ()
            	    // InternalFortXTrans.g:2837:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExponentExprAccess().getExponentExprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFortXTrans.g:2843:4: ( (lv_op_2_0= '^' ) )
            	    // InternalFortXTrans.g:2844:5: (lv_op_2_0= '^' )
            	    {
            	    // InternalFortXTrans.g:2844:5: (lv_op_2_0= '^' )
            	    // InternalFortXTrans.g:2845:6: lv_op_2_0= '^'
            	    {
            	    lv_op_2_0=(Token)match(input,51,FOLLOW_29); 

            	    						newLeafNode(lv_op_2_0, grammarAccess.getExponentExprAccess().getOpCircumflexAccentKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExponentExprRule());
            	    						}
            	    						setWithLastConsumed(current, "op", lv_op_2_0, "^");
            	    					

            	    }


            	    }

            	    // InternalFortXTrans.g:2857:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalFortXTrans.g:2858:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalFortXTrans.g:2858:5: (lv_right_3_0= rulePrimary )
            	    // InternalFortXTrans.g:2859:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getExponentExprAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_40);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExponentExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"srf.transpiler.fortxtrans.FortXTrans.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExponentExpr"


    // $ANTLR start "entryRulePrimary"
    // InternalFortXTrans.g:2881:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalFortXTrans.g:2881:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalFortXTrans.g:2882:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalFortXTrans.g:2888:1: rulePrimary returns [EObject current=null] : ( (this_LiteralTuple_0= ruleLiteralTuple ( () ( ( (lv_op_2_0= ':=' ) ) ( (lv_right_3_0= ruleExpr ) ) ) )? ( () otherlv_5= '(' ( (lv_right_6_0= ruleExprList ) )? otherlv_7= ')' )? ( () otherlv_9= '[' otherlv_10= '\\\\' ( (lv_type_11_0= ruleSimpleName ) ) otherlv_12= ',' ( (lv_sizes_13_0= ruleExprList ) )? otherlv_14= '\\\\' otherlv_15= ']' otherlv_16= '(' ( (lv_filler_17_0= ruleQualifiedName ) ) otherlv_18= ')' )? ) | ( () otherlv_20= '!' ( (lv_expression_21_0= rulePrimary ) ) ) | ( () otherlv_23= '-' ( (lv_expression_24_0= rulePrimary ) ) ) | ( () otherlv_26= '(' ( (lv_exp_27_0= ruleExprList ) ) otherlv_28= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        EObject this_LiteralTuple_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_type_11_0 = null;

        EObject lv_sizes_13_0 = null;

        EObject lv_filler_17_0 = null;

        EObject lv_expression_21_0 = null;

        EObject lv_expression_24_0 = null;

        EObject lv_exp_27_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2894:2: ( ( (this_LiteralTuple_0= ruleLiteralTuple ( () ( ( (lv_op_2_0= ':=' ) ) ( (lv_right_3_0= ruleExpr ) ) ) )? ( () otherlv_5= '(' ( (lv_right_6_0= ruleExprList ) )? otherlv_7= ')' )? ( () otherlv_9= '[' otherlv_10= '\\\\' ( (lv_type_11_0= ruleSimpleName ) ) otherlv_12= ',' ( (lv_sizes_13_0= ruleExprList ) )? otherlv_14= '\\\\' otherlv_15= ']' otherlv_16= '(' ( (lv_filler_17_0= ruleQualifiedName ) ) otherlv_18= ')' )? ) | ( () otherlv_20= '!' ( (lv_expression_21_0= rulePrimary ) ) ) | ( () otherlv_23= '-' ( (lv_expression_24_0= rulePrimary ) ) ) | ( () otherlv_26= '(' ( (lv_exp_27_0= ruleExprList ) ) otherlv_28= ')' ) ) )
            // InternalFortXTrans.g:2895:2: ( (this_LiteralTuple_0= ruleLiteralTuple ( () ( ( (lv_op_2_0= ':=' ) ) ( (lv_right_3_0= ruleExpr ) ) ) )? ( () otherlv_5= '(' ( (lv_right_6_0= ruleExprList ) )? otherlv_7= ')' )? ( () otherlv_9= '[' otherlv_10= '\\\\' ( (lv_type_11_0= ruleSimpleName ) ) otherlv_12= ',' ( (lv_sizes_13_0= ruleExprList ) )? otherlv_14= '\\\\' otherlv_15= ']' otherlv_16= '(' ( (lv_filler_17_0= ruleQualifiedName ) ) otherlv_18= ')' )? ) | ( () otherlv_20= '!' ( (lv_expression_21_0= rulePrimary ) ) ) | ( () otherlv_23= '-' ( (lv_expression_24_0= rulePrimary ) ) ) | ( () otherlv_26= '(' ( (lv_exp_27_0= ruleExprList ) ) otherlv_28= ')' ) )
            {
            // InternalFortXTrans.g:2895:2: ( (this_LiteralTuple_0= ruleLiteralTuple ( () ( ( (lv_op_2_0= ':=' ) ) ( (lv_right_3_0= ruleExpr ) ) ) )? ( () otherlv_5= '(' ( (lv_right_6_0= ruleExprList ) )? otherlv_7= ')' )? ( () otherlv_9= '[' otherlv_10= '\\\\' ( (lv_type_11_0= ruleSimpleName ) ) otherlv_12= ',' ( (lv_sizes_13_0= ruleExprList ) )? otherlv_14= '\\\\' otherlv_15= ']' otherlv_16= '(' ( (lv_filler_17_0= ruleQualifiedName ) ) otherlv_18= ')' )? ) | ( () otherlv_20= '!' ( (lv_expression_21_0= rulePrimary ) ) ) | ( () otherlv_23= '-' ( (lv_expression_24_0= rulePrimary ) ) ) | ( () otherlv_26= '(' ( (lv_exp_27_0= ruleExprList ) ) otherlv_28= ')' ) )
            int alt55=4;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // InternalFortXTrans.g:2896:3: (this_LiteralTuple_0= ruleLiteralTuple ( () ( ( (lv_op_2_0= ':=' ) ) ( (lv_right_3_0= ruleExpr ) ) ) )? ( () otherlv_5= '(' ( (lv_right_6_0= ruleExprList ) )? otherlv_7= ')' )? ( () otherlv_9= '[' otherlv_10= '\\\\' ( (lv_type_11_0= ruleSimpleName ) ) otherlv_12= ',' ( (lv_sizes_13_0= ruleExprList ) )? otherlv_14= '\\\\' otherlv_15= ']' otherlv_16= '(' ( (lv_filler_17_0= ruleQualifiedName ) ) otherlv_18= ')' )? )
                    {
                    // InternalFortXTrans.g:2896:3: (this_LiteralTuple_0= ruleLiteralTuple ( () ( ( (lv_op_2_0= ':=' ) ) ( (lv_right_3_0= ruleExpr ) ) ) )? ( () otherlv_5= '(' ( (lv_right_6_0= ruleExprList ) )? otherlv_7= ')' )? ( () otherlv_9= '[' otherlv_10= '\\\\' ( (lv_type_11_0= ruleSimpleName ) ) otherlv_12= ',' ( (lv_sizes_13_0= ruleExprList ) )? otherlv_14= '\\\\' otherlv_15= ']' otherlv_16= '(' ( (lv_filler_17_0= ruleQualifiedName ) ) otherlv_18= ')' )? )
                    // InternalFortXTrans.g:2897:4: this_LiteralTuple_0= ruleLiteralTuple ( () ( ( (lv_op_2_0= ':=' ) ) ( (lv_right_3_0= ruleExpr ) ) ) )? ( () otherlv_5= '(' ( (lv_right_6_0= ruleExprList ) )? otherlv_7= ')' )? ( () otherlv_9= '[' otherlv_10= '\\\\' ( (lv_type_11_0= ruleSimpleName ) ) otherlv_12= ',' ( (lv_sizes_13_0= ruleExprList ) )? otherlv_14= '\\\\' otherlv_15= ']' otherlv_16= '(' ( (lv_filler_17_0= ruleQualifiedName ) ) otherlv_18= ')' )?
                    {

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getLiteralTupleParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_41);
                    this_LiteralTuple_0=ruleLiteralTuple();

                    state._fsp--;


                    				current = this_LiteralTuple_0;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalFortXTrans.g:2905:4: ( () ( ( (lv_op_2_0= ':=' ) ) ( (lv_right_3_0= ruleExpr ) ) ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==52) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalFortXTrans.g:2906:5: () ( ( (lv_op_2_0= ':=' ) ) ( (lv_right_3_0= ruleExpr ) ) )
                            {
                            // InternalFortXTrans.g:2906:5: ()
                            // InternalFortXTrans.g:2907:6: 
                            {

                            						current = forceCreateModelElementAndSet(
                            							grammarAccess.getPrimaryAccess().getAssopLeftAction_0_1_0(),
                            							current);
                            					

                            }

                            // InternalFortXTrans.g:2913:5: ( ( (lv_op_2_0= ':=' ) ) ( (lv_right_3_0= ruleExpr ) ) )
                            // InternalFortXTrans.g:2914:6: ( (lv_op_2_0= ':=' ) ) ( (lv_right_3_0= ruleExpr ) )
                            {
                            // InternalFortXTrans.g:2914:6: ( (lv_op_2_0= ':=' ) )
                            // InternalFortXTrans.g:2915:7: (lv_op_2_0= ':=' )
                            {
                            // InternalFortXTrans.g:2915:7: (lv_op_2_0= ':=' )
                            // InternalFortXTrans.g:2916:8: lv_op_2_0= ':='
                            {
                            lv_op_2_0=(Token)match(input,52,FOLLOW_29); 

                            								newLeafNode(lv_op_2_0, grammarAccess.getPrimaryAccess().getOpColonEqualsSignKeyword_0_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getPrimaryRule());
                            								}
                            								setWithLastConsumed(current, "op", lv_op_2_0, ":=");
                            							

                            }


                            }

                            // InternalFortXTrans.g:2928:6: ( (lv_right_3_0= ruleExpr ) )
                            // InternalFortXTrans.g:2929:7: (lv_right_3_0= ruleExpr )
                            {
                            // InternalFortXTrans.g:2929:7: (lv_right_3_0= ruleExpr )
                            // InternalFortXTrans.g:2930:8: lv_right_3_0= ruleExpr
                            {

                            								newCompositeNode(grammarAccess.getPrimaryAccess().getRightExprParserRuleCall_0_1_1_1_0());
                            							
                            pushFollow(FOLLOW_42);
                            lv_right_3_0=ruleExpr();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getPrimaryRule());
                            								}
                            								set(
                            									current,
                            									"right",
                            									lv_right_3_0,
                            									"srf.transpiler.fortxtrans.FortXTrans.Expr");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:2949:4: ( () otherlv_5= '(' ( (lv_right_6_0= ruleExprList ) )? otherlv_7= ')' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==24) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalFortXTrans.g:2950:5: () otherlv_5= '(' ( (lv_right_6_0= ruleExprList ) )? otherlv_7= ')'
                            {
                            // InternalFortXTrans.g:2950:5: ()
                            // InternalFortXTrans.g:2951:6: 
                            {

                            						current = forceCreateModelElementAndSet(
                            							grammarAccess.getPrimaryAccess().getFCallLeftAction_0_2_0(),
                            							current);
                            					

                            }

                            otherlv_5=(Token)match(input,24,FOLLOW_43); 

                            					newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_2_1());
                            				
                            // InternalFortXTrans.g:2961:5: ( (lv_right_6_0= ruleExprList ) )?
                            int alt51=2;
                            int LA51_0 = input.LA(1);

                            if ( (LA51_0==RULE_ID||(LA51_0>=RULE_INT && LA51_0<=RULE_STRING)||LA51_0==24||LA51_0==48||LA51_0==56||(LA51_0>=71 && LA51_0<=72)) ) {
                                alt51=1;
                            }
                            switch (alt51) {
                                case 1 :
                                    // InternalFortXTrans.g:2962:6: (lv_right_6_0= ruleExprList )
                                    {
                                    // InternalFortXTrans.g:2962:6: (lv_right_6_0= ruleExprList )
                                    // InternalFortXTrans.g:2963:7: lv_right_6_0= ruleExprList
                                    {

                                    							newCompositeNode(grammarAccess.getPrimaryAccess().getRightExprListParserRuleCall_0_2_2_0());
                                    						
                                    pushFollow(FOLLOW_18);
                                    lv_right_6_0=ruleExprList();

                                    state._fsp--;


                                    							if (current==null) {
                                    								current = createModelElementForParent(grammarAccess.getPrimaryRule());
                                    							}
                                    							set(
                                    								current,
                                    								"right",
                                    								lv_right_6_0,
                                    								"srf.transpiler.fortxtrans.FortXTrans.ExprList");
                                    							afterParserOrEnumRuleCall();
                                    						

                                    }


                                    }
                                    break;

                            }

                            otherlv_7=(Token)match(input,25,FOLLOW_44); 

                            					newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2_3());
                            				

                            }
                            break;

                    }

                    // InternalFortXTrans.g:2985:4: ( () otherlv_9= '[' otherlv_10= '\\\\' ( (lv_type_11_0= ruleSimpleName ) ) otherlv_12= ',' ( (lv_sizes_13_0= ruleExprList ) )? otherlv_14= '\\\\' otherlv_15= ']' otherlv_16= '(' ( (lv_filler_17_0= ruleQualifiedName ) ) otherlv_18= ')' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==53) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalFortXTrans.g:2986:5: () otherlv_9= '[' otherlv_10= '\\\\' ( (lv_type_11_0= ruleSimpleName ) ) otherlv_12= ',' ( (lv_sizes_13_0= ruleExprList ) )? otherlv_14= '\\\\' otherlv_15= ']' otherlv_16= '(' ( (lv_filler_17_0= ruleQualifiedName ) ) otherlv_18= ')'
                            {
                            // InternalFortXTrans.g:2986:5: ()
                            // InternalFortXTrans.g:2987:6: 
                            {

                            						current = forceCreateModelElementAndSet(
                            							grammarAccess.getPrimaryAccess().getArrayInitLeftAction_0_3_0(),
                            							current);
                            					

                            }

                            otherlv_9=(Token)match(input,53,FOLLOW_45); 

                            					newLeafNode(otherlv_9, grammarAccess.getPrimaryAccess().getLeftSquareBracketKeyword_0_3_1());
                            				
                            otherlv_10=(Token)match(input,54,FOLLOW_3); 

                            					newLeafNode(otherlv_10, grammarAccess.getPrimaryAccess().getBackslashKeyword_0_3_2());
                            				
                            // InternalFortXTrans.g:3001:5: ( (lv_type_11_0= ruleSimpleName ) )
                            // InternalFortXTrans.g:3002:6: (lv_type_11_0= ruleSimpleName )
                            {
                            // InternalFortXTrans.g:3002:6: (lv_type_11_0= ruleSimpleName )
                            // InternalFortXTrans.g:3003:7: lv_type_11_0= ruleSimpleName
                            {

                            							newCompositeNode(grammarAccess.getPrimaryAccess().getTypeSimpleNameParserRuleCall_0_3_3_0());
                            						
                            pushFollow(FOLLOW_46);
                            lv_type_11_0=ruleSimpleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPrimaryRule());
                            							}
                            							set(
                            								current,
                            								"type",
                            								lv_type_11_0,
                            								"srf.transpiler.fortxtrans.FortXTrans.SimpleName");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_12=(Token)match(input,19,FOLLOW_47); 

                            					newLeafNode(otherlv_12, grammarAccess.getPrimaryAccess().getCommaKeyword_0_3_4());
                            				
                            // InternalFortXTrans.g:3024:5: ( (lv_sizes_13_0= ruleExprList ) )?
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==RULE_ID||(LA53_0>=RULE_INT && LA53_0<=RULE_STRING)||LA53_0==24||LA53_0==48||LA53_0==56||(LA53_0>=71 && LA53_0<=72)) ) {
                                alt53=1;
                            }
                            switch (alt53) {
                                case 1 :
                                    // InternalFortXTrans.g:3025:6: (lv_sizes_13_0= ruleExprList )
                                    {
                                    // InternalFortXTrans.g:3025:6: (lv_sizes_13_0= ruleExprList )
                                    // InternalFortXTrans.g:3026:7: lv_sizes_13_0= ruleExprList
                                    {

                                    							newCompositeNode(grammarAccess.getPrimaryAccess().getSizesExprListParserRuleCall_0_3_5_0());
                                    						
                                    pushFollow(FOLLOW_45);
                                    lv_sizes_13_0=ruleExprList();

                                    state._fsp--;


                                    							if (current==null) {
                                    								current = createModelElementForParent(grammarAccess.getPrimaryRule());
                                    							}
                                    							set(
                                    								current,
                                    								"sizes",
                                    								lv_sizes_13_0,
                                    								"srf.transpiler.fortxtrans.FortXTrans.ExprList");
                                    							afterParserOrEnumRuleCall();
                                    						

                                    }


                                    }
                                    break;

                            }

                            otherlv_14=(Token)match(input,54,FOLLOW_48); 

                            					newLeafNode(otherlv_14, grammarAccess.getPrimaryAccess().getBackslashKeyword_0_3_6());
                            				
                            otherlv_15=(Token)match(input,55,FOLLOW_24); 

                            					newLeafNode(otherlv_15, grammarAccess.getPrimaryAccess().getRightSquareBracketKeyword_0_3_7());
                            				
                            otherlv_16=(Token)match(input,24,FOLLOW_3); 

                            					newLeafNode(otherlv_16, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_3_8());
                            				
                            // InternalFortXTrans.g:3055:5: ( (lv_filler_17_0= ruleQualifiedName ) )
                            // InternalFortXTrans.g:3056:6: (lv_filler_17_0= ruleQualifiedName )
                            {
                            // InternalFortXTrans.g:3056:6: (lv_filler_17_0= ruleQualifiedName )
                            // InternalFortXTrans.g:3057:7: lv_filler_17_0= ruleQualifiedName
                            {

                            							newCompositeNode(grammarAccess.getPrimaryAccess().getFillerQualifiedNameParserRuleCall_0_3_9_0());
                            						
                            pushFollow(FOLLOW_18);
                            lv_filler_17_0=ruleQualifiedName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPrimaryRule());
                            							}
                            							set(
                            								current,
                            								"filler",
                            								lv_filler_17_0,
                            								"srf.transpiler.fortxtrans.FortXTrans.QualifiedName");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_18=(Token)match(input,25,FOLLOW_2); 

                            					newLeafNode(otherlv_18, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3_10());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:3081:3: ( () otherlv_20= '!' ( (lv_expression_21_0= rulePrimary ) ) )
                    {
                    // InternalFortXTrans.g:3081:3: ( () otherlv_20= '!' ( (lv_expression_21_0= rulePrimary ) ) )
                    // InternalFortXTrans.g:3082:4: () otherlv_20= '!' ( (lv_expression_21_0= rulePrimary ) )
                    {
                    // InternalFortXTrans.g:3082:4: ()
                    // InternalFortXTrans.g:3083:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_20=(Token)match(input,56,FOLLOW_29); 

                    				newLeafNode(otherlv_20, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalFortXTrans.g:3093:4: ( (lv_expression_21_0= rulePrimary ) )
                    // InternalFortXTrans.g:3094:5: (lv_expression_21_0= rulePrimary )
                    {
                    // InternalFortXTrans.g:3094:5: (lv_expression_21_0= rulePrimary )
                    // InternalFortXTrans.g:3095:6: lv_expression_21_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_21_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_21_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:3114:3: ( () otherlv_23= '-' ( (lv_expression_24_0= rulePrimary ) ) )
                    {
                    // InternalFortXTrans.g:3114:3: ( () otherlv_23= '-' ( (lv_expression_24_0= rulePrimary ) ) )
                    // InternalFortXTrans.g:3115:4: () otherlv_23= '-' ( (lv_expression_24_0= rulePrimary ) )
                    {
                    // InternalFortXTrans.g:3115:4: ()
                    // InternalFortXTrans.g:3116:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNegAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_23=(Token)match(input,48,FOLLOW_29); 

                    				newLeafNode(otherlv_23, grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1());
                    			
                    // InternalFortXTrans.g:3126:4: ( (lv_expression_24_0= rulePrimary ) )
                    // InternalFortXTrans.g:3127:5: (lv_expression_24_0= rulePrimary )
                    {
                    // InternalFortXTrans.g:3127:5: (lv_expression_24_0= rulePrimary )
                    // InternalFortXTrans.g:3128:6: lv_expression_24_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_24_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_24_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFortXTrans.g:3147:3: ( () otherlv_26= '(' ( (lv_exp_27_0= ruleExprList ) ) otherlv_28= ')' )
                    {
                    // InternalFortXTrans.g:3147:3: ( () otherlv_26= '(' ( (lv_exp_27_0= ruleExprList ) ) otherlv_28= ')' )
                    // InternalFortXTrans.g:3148:4: () otherlv_26= '(' ( (lv_exp_27_0= ruleExprList ) ) otherlv_28= ')'
                    {
                    // InternalFortXTrans.g:3148:4: ()
                    // InternalFortXTrans.g:3149:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getParanAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_26=(Token)match(input,24,FOLLOW_29); 

                    				newLeafNode(otherlv_26, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalFortXTrans.g:3159:4: ( (lv_exp_27_0= ruleExprList ) )
                    // InternalFortXTrans.g:3160:5: (lv_exp_27_0= ruleExprList )
                    {
                    // InternalFortXTrans.g:3160:5: (lv_exp_27_0= ruleExprList )
                    // InternalFortXTrans.g:3161:6: lv_exp_27_0= ruleExprList
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpExprListParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_exp_27_0=ruleExprList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_27_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.ExprList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_28=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_28, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleExprList"
    // InternalFortXTrans.g:3187:1: entryRuleExprList returns [EObject current=null] : iv_ruleExprList= ruleExprList EOF ;
    public final EObject entryRuleExprList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprList = null;


        try {
            // InternalFortXTrans.g:3187:49: (iv_ruleExprList= ruleExprList EOF )
            // InternalFortXTrans.g:3188:2: iv_ruleExprList= ruleExprList EOF
            {
             newCompositeNode(grammarAccess.getExprListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprList=ruleExprList();

            state._fsp--;

             current =iv_ruleExprList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprList"


    // $ANTLR start "ruleExprList"
    // InternalFortXTrans.g:3194:1: ruleExprList returns [EObject current=null] : ( ( (lv_exps_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpr ) ) )* ) ;
    public final EObject ruleExprList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exps_0_0 = null;

        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3200:2: ( ( ( (lv_exps_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpr ) ) )* ) )
            // InternalFortXTrans.g:3201:2: ( ( (lv_exps_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpr ) ) )* )
            {
            // InternalFortXTrans.g:3201:2: ( ( (lv_exps_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpr ) ) )* )
            // InternalFortXTrans.g:3202:3: ( (lv_exps_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exp_2_0= ruleExpr ) ) )*
            {
            // InternalFortXTrans.g:3202:3: ( (lv_exps_0_0= ruleExpr ) )
            // InternalFortXTrans.g:3203:4: (lv_exps_0_0= ruleExpr )
            {
            // InternalFortXTrans.g:3203:4: (lv_exps_0_0= ruleExpr )
            // InternalFortXTrans.g:3204:5: lv_exps_0_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getExprListAccess().getExpsExprParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_exps_0_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExprListRule());
            					}
            					set(
            						current,
            						"exps",
            						lv_exps_0_0,
            						"srf.transpiler.fortxtrans.FortXTrans.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFortXTrans.g:3221:3: (otherlv_1= ',' ( (lv_exp_2_0= ruleExpr ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==19) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalFortXTrans.g:3222:4: otherlv_1= ',' ( (lv_exp_2_0= ruleExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_29); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExprListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalFortXTrans.g:3226:4: ( (lv_exp_2_0= ruleExpr ) )
            	    // InternalFortXTrans.g:3227:5: (lv_exp_2_0= ruleExpr )
            	    {
            	    // InternalFortXTrans.g:3227:5: (lv_exp_2_0= ruleExpr )
            	    // InternalFortXTrans.g:3228:6: lv_exp_2_0= ruleExpr
            	    {

            	    						newCompositeNode(grammarAccess.getExprListAccess().getExpExprParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_exp_2_0=ruleExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExprListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exp",
            	    							lv_exp_2_0,
            	    							"srf.transpiler.fortxtrans.FortXTrans.Expr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprList"


    // $ANTLR start "entryRuleExprTail"
    // InternalFortXTrans.g:3250:1: entryRuleExprTail returns [EObject current=null] : iv_ruleExprTail= ruleExprTail EOF ;
    public final EObject entryRuleExprTail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprTail = null;


        try {
            // InternalFortXTrans.g:3250:49: (iv_ruleExprTail= ruleExprTail EOF )
            // InternalFortXTrans.g:3251:2: iv_ruleExprTail= ruleExprTail EOF
            {
             newCompositeNode(grammarAccess.getExprTailRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprTail=ruleExprTail();

            state._fsp--;

             current =iv_ruleExprTail; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprTail"


    // $ANTLR start "ruleExprTail"
    // InternalFortXTrans.g:3257:1: ruleExprTail returns [EObject current=null] : (otherlv_0= 'as' ( (lv_type_1_0= ruleSimpleName ) ) ) ;
    public final EObject ruleExprTail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3263:2: ( (otherlv_0= 'as' ( (lv_type_1_0= ruleSimpleName ) ) ) )
            // InternalFortXTrans.g:3264:2: (otherlv_0= 'as' ( (lv_type_1_0= ruleSimpleName ) ) )
            {
            // InternalFortXTrans.g:3264:2: (otherlv_0= 'as' ( (lv_type_1_0= ruleSimpleName ) ) )
            // InternalFortXTrans.g:3265:3: otherlv_0= 'as' ( (lv_type_1_0= ruleSimpleName ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExprTailAccess().getAsKeyword_0());
            		
            // InternalFortXTrans.g:3269:3: ( (lv_type_1_0= ruleSimpleName ) )
            // InternalFortXTrans.g:3270:4: (lv_type_1_0= ruleSimpleName )
            {
            // InternalFortXTrans.g:3270:4: (lv_type_1_0= ruleSimpleName )
            // InternalFortXTrans.g:3271:5: lv_type_1_0= ruleSimpleName
            {

            					newCompositeNode(grammarAccess.getExprTailAccess().getTypeSimpleNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleSimpleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExprTailRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"srf.transpiler.fortxtrans.FortXTrans.SimpleName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprTail"


    // $ANTLR start "entryRuleDelimitedExpr"
    // InternalFortXTrans.g:3292:1: entryRuleDelimitedExpr returns [EObject current=null] : iv_ruleDelimitedExpr= ruleDelimitedExpr EOF ;
    public final EObject entryRuleDelimitedExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelimitedExpr = null;


        try {
            // InternalFortXTrans.g:3292:54: (iv_ruleDelimitedExpr= ruleDelimitedExpr EOF )
            // InternalFortXTrans.g:3293:2: iv_ruleDelimitedExpr= ruleDelimitedExpr EOF
            {
             newCompositeNode(grammarAccess.getDelimitedExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelimitedExpr=ruleDelimitedExpr();

            state._fsp--;

             current =iv_ruleDelimitedExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelimitedExpr"


    // $ANTLR start "ruleDelimitedExpr"
    // InternalFortXTrans.g:3299:1: ruleDelimitedExpr returns [EObject current=null] : ( ( (lv_dod_0_0= ruleDo ) ) | ( ( (lv_ret_1_0= 'return' ) ) ( (lv_block_2_0= ruleExpr ) ) ) | ( ( (lv_awhile_3_0= 'while' ) ) ( (lv_expr_4_0= ruleExpr ) ) ( (lv_whiledod_5_0= ruleDo ) ) ) | ( ( (lv_afor_6_0= 'for' ) ) ( (lv_gen_7_0= ruleGenerators ) ) ( (lv_dofront_8_0= ruleDoFront ) ) otherlv_9= 'end' ) | ( ( (lv_anif_10_0= 'if' ) ) ( (lv_cond_11_0= ruleExpr ) ) otherlv_12= 'then' ( (lv_blocks_13_0= ruleBlockElems ) ) ( (lv_elifs_14_0= ruleElifs ) )? ( (lv_els_15_0= ruleElse ) )? otherlv_16= 'end' ) ) ;
    public final EObject ruleDelimitedExpr() throws RecognitionException {
        EObject current = null;

        Token lv_ret_1_0=null;
        Token lv_awhile_3_0=null;
        Token lv_afor_6_0=null;
        Token otherlv_9=null;
        Token lv_anif_10_0=null;
        Token otherlv_12=null;
        Token otherlv_16=null;
        EObject lv_dod_0_0 = null;

        EObject lv_block_2_0 = null;

        EObject lv_expr_4_0 = null;

        EObject lv_whiledod_5_0 = null;

        EObject lv_gen_7_0 = null;

        EObject lv_dofront_8_0 = null;

        EObject lv_cond_11_0 = null;

        EObject lv_blocks_13_0 = null;

        EObject lv_elifs_14_0 = null;

        EObject lv_els_15_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3305:2: ( ( ( (lv_dod_0_0= ruleDo ) ) | ( ( (lv_ret_1_0= 'return' ) ) ( (lv_block_2_0= ruleExpr ) ) ) | ( ( (lv_awhile_3_0= 'while' ) ) ( (lv_expr_4_0= ruleExpr ) ) ( (lv_whiledod_5_0= ruleDo ) ) ) | ( ( (lv_afor_6_0= 'for' ) ) ( (lv_gen_7_0= ruleGenerators ) ) ( (lv_dofront_8_0= ruleDoFront ) ) otherlv_9= 'end' ) | ( ( (lv_anif_10_0= 'if' ) ) ( (lv_cond_11_0= ruleExpr ) ) otherlv_12= 'then' ( (lv_blocks_13_0= ruleBlockElems ) ) ( (lv_elifs_14_0= ruleElifs ) )? ( (lv_els_15_0= ruleElse ) )? otherlv_16= 'end' ) ) )
            // InternalFortXTrans.g:3306:2: ( ( (lv_dod_0_0= ruleDo ) ) | ( ( (lv_ret_1_0= 'return' ) ) ( (lv_block_2_0= ruleExpr ) ) ) | ( ( (lv_awhile_3_0= 'while' ) ) ( (lv_expr_4_0= ruleExpr ) ) ( (lv_whiledod_5_0= ruleDo ) ) ) | ( ( (lv_afor_6_0= 'for' ) ) ( (lv_gen_7_0= ruleGenerators ) ) ( (lv_dofront_8_0= ruleDoFront ) ) otherlv_9= 'end' ) | ( ( (lv_anif_10_0= 'if' ) ) ( (lv_cond_11_0= ruleExpr ) ) otherlv_12= 'then' ( (lv_blocks_13_0= ruleBlockElems ) ) ( (lv_elifs_14_0= ruleElifs ) )? ( (lv_els_15_0= ruleElse ) )? otherlv_16= 'end' ) )
            {
            // InternalFortXTrans.g:3306:2: ( ( (lv_dod_0_0= ruleDo ) ) | ( ( (lv_ret_1_0= 'return' ) ) ( (lv_block_2_0= ruleExpr ) ) ) | ( ( (lv_awhile_3_0= 'while' ) ) ( (lv_expr_4_0= ruleExpr ) ) ( (lv_whiledod_5_0= ruleDo ) ) ) | ( ( (lv_afor_6_0= 'for' ) ) ( (lv_gen_7_0= ruleGenerators ) ) ( (lv_dofront_8_0= ruleDoFront ) ) otherlv_9= 'end' ) | ( ( (lv_anif_10_0= 'if' ) ) ( (lv_cond_11_0= ruleExpr ) ) otherlv_12= 'then' ( (lv_blocks_13_0= ruleBlockElems ) ) ( (lv_elifs_14_0= ruleElifs ) )? ( (lv_els_15_0= ruleElse ) )? otherlv_16= 'end' ) )
            int alt59=5;
            switch ( input.LA(1) ) {
            case 29:
            case 68:
            case 69:
                {
                alt59=1;
                }
                break;
            case 57:
                {
                alt59=2;
                }
                break;
            case 58:
                {
                alt59=3;
                }
                break;
            case 59:
                {
                alt59=4;
                }
                break;
            case 60:
                {
                alt59=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalFortXTrans.g:3307:3: ( (lv_dod_0_0= ruleDo ) )
                    {
                    // InternalFortXTrans.g:3307:3: ( (lv_dod_0_0= ruleDo ) )
                    // InternalFortXTrans.g:3308:4: (lv_dod_0_0= ruleDo )
                    {
                    // InternalFortXTrans.g:3308:4: (lv_dod_0_0= ruleDo )
                    // InternalFortXTrans.g:3309:5: lv_dod_0_0= ruleDo
                    {

                    					newCompositeNode(grammarAccess.getDelimitedExprAccess().getDodDoParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_dod_0_0=ruleDo();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                    					}
                    					set(
                    						current,
                    						"dod",
                    						lv_dod_0_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.Do");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:3327:3: ( ( (lv_ret_1_0= 'return' ) ) ( (lv_block_2_0= ruleExpr ) ) )
                    {
                    // InternalFortXTrans.g:3327:3: ( ( (lv_ret_1_0= 'return' ) ) ( (lv_block_2_0= ruleExpr ) ) )
                    // InternalFortXTrans.g:3328:4: ( (lv_ret_1_0= 'return' ) ) ( (lv_block_2_0= ruleExpr ) )
                    {
                    // InternalFortXTrans.g:3328:4: ( (lv_ret_1_0= 'return' ) )
                    // InternalFortXTrans.g:3329:5: (lv_ret_1_0= 'return' )
                    {
                    // InternalFortXTrans.g:3329:5: (lv_ret_1_0= 'return' )
                    // InternalFortXTrans.g:3330:6: lv_ret_1_0= 'return'
                    {
                    lv_ret_1_0=(Token)match(input,57,FOLLOW_29); 

                    						newLeafNode(lv_ret_1_0, grammarAccess.getDelimitedExprAccess().getRetReturnKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelimitedExprRule());
                    						}
                    						setWithLastConsumed(current, "ret", lv_ret_1_0, "return");
                    					

                    }


                    }

                    // InternalFortXTrans.g:3342:4: ( (lv_block_2_0= ruleExpr ) )
                    // InternalFortXTrans.g:3343:5: (lv_block_2_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:3343:5: (lv_block_2_0= ruleExpr )
                    // InternalFortXTrans.g:3344:6: lv_block_2_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getBlockExprParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_block_2_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                    						}
                    						set(
                    							current,
                    							"block",
                    							lv_block_2_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:3363:3: ( ( (lv_awhile_3_0= 'while' ) ) ( (lv_expr_4_0= ruleExpr ) ) ( (lv_whiledod_5_0= ruleDo ) ) )
                    {
                    // InternalFortXTrans.g:3363:3: ( ( (lv_awhile_3_0= 'while' ) ) ( (lv_expr_4_0= ruleExpr ) ) ( (lv_whiledod_5_0= ruleDo ) ) )
                    // InternalFortXTrans.g:3364:4: ( (lv_awhile_3_0= 'while' ) ) ( (lv_expr_4_0= ruleExpr ) ) ( (lv_whiledod_5_0= ruleDo ) )
                    {
                    // InternalFortXTrans.g:3364:4: ( (lv_awhile_3_0= 'while' ) )
                    // InternalFortXTrans.g:3365:5: (lv_awhile_3_0= 'while' )
                    {
                    // InternalFortXTrans.g:3365:5: (lv_awhile_3_0= 'while' )
                    // InternalFortXTrans.g:3366:6: lv_awhile_3_0= 'while'
                    {
                    lv_awhile_3_0=(Token)match(input,58,FOLLOW_29); 

                    						newLeafNode(lv_awhile_3_0, grammarAccess.getDelimitedExprAccess().getAwhileWhileKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelimitedExprRule());
                    						}
                    						setWithLastConsumed(current, "awhile", lv_awhile_3_0, "while");
                    					

                    }


                    }

                    // InternalFortXTrans.g:3378:4: ( (lv_expr_4_0= ruleExpr ) )
                    // InternalFortXTrans.g:3379:5: (lv_expr_4_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:3379:5: (lv_expr_4_0= ruleExpr )
                    // InternalFortXTrans.g:3380:6: lv_expr_4_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getExprExprParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_expr_4_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_4_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:3397:4: ( (lv_whiledod_5_0= ruleDo ) )
                    // InternalFortXTrans.g:3398:5: (lv_whiledod_5_0= ruleDo )
                    {
                    // InternalFortXTrans.g:3398:5: (lv_whiledod_5_0= ruleDo )
                    // InternalFortXTrans.g:3399:6: lv_whiledod_5_0= ruleDo
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getWhiledodDoParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_whiledod_5_0=ruleDo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                    						}
                    						set(
                    							current,
                    							"whiledod",
                    							lv_whiledod_5_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Do");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFortXTrans.g:3418:3: ( ( (lv_afor_6_0= 'for' ) ) ( (lv_gen_7_0= ruleGenerators ) ) ( (lv_dofront_8_0= ruleDoFront ) ) otherlv_9= 'end' )
                    {
                    // InternalFortXTrans.g:3418:3: ( ( (lv_afor_6_0= 'for' ) ) ( (lv_gen_7_0= ruleGenerators ) ) ( (lv_dofront_8_0= ruleDoFront ) ) otherlv_9= 'end' )
                    // InternalFortXTrans.g:3419:4: ( (lv_afor_6_0= 'for' ) ) ( (lv_gen_7_0= ruleGenerators ) ) ( (lv_dofront_8_0= ruleDoFront ) ) otherlv_9= 'end'
                    {
                    // InternalFortXTrans.g:3419:4: ( (lv_afor_6_0= 'for' ) )
                    // InternalFortXTrans.g:3420:5: (lv_afor_6_0= 'for' )
                    {
                    // InternalFortXTrans.g:3420:5: (lv_afor_6_0= 'for' )
                    // InternalFortXTrans.g:3421:6: lv_afor_6_0= 'for'
                    {
                    lv_afor_6_0=(Token)match(input,59,FOLLOW_50); 

                    						newLeafNode(lv_afor_6_0, grammarAccess.getDelimitedExprAccess().getAforForKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelimitedExprRule());
                    						}
                    						setWithLastConsumed(current, "afor", lv_afor_6_0, "for");
                    					

                    }


                    }

                    // InternalFortXTrans.g:3433:4: ( (lv_gen_7_0= ruleGenerators ) )
                    // InternalFortXTrans.g:3434:5: (lv_gen_7_0= ruleGenerators )
                    {
                    // InternalFortXTrans.g:3434:5: (lv_gen_7_0= ruleGenerators )
                    // InternalFortXTrans.g:3435:6: lv_gen_7_0= ruleGenerators
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getGenGeneratorsParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_gen_7_0=ruleGenerators();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                    						}
                    						set(
                    							current,
                    							"gen",
                    							lv_gen_7_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Generators");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:3452:4: ( (lv_dofront_8_0= ruleDoFront ) )
                    // InternalFortXTrans.g:3453:5: (lv_dofront_8_0= ruleDoFront )
                    {
                    // InternalFortXTrans.g:3453:5: (lv_dofront_8_0= ruleDoFront )
                    // InternalFortXTrans.g:3454:6: lv_dofront_8_0= ruleDoFront
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getDofrontDoFrontParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_dofront_8_0=ruleDoFront();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                    						}
                    						set(
                    							current,
                    							"dofront",
                    							lv_dofront_8_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.DoFront");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getDelimitedExprAccess().getEndKeyword_3_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalFortXTrans.g:3477:3: ( ( (lv_anif_10_0= 'if' ) ) ( (lv_cond_11_0= ruleExpr ) ) otherlv_12= 'then' ( (lv_blocks_13_0= ruleBlockElems ) ) ( (lv_elifs_14_0= ruleElifs ) )? ( (lv_els_15_0= ruleElse ) )? otherlv_16= 'end' )
                    {
                    // InternalFortXTrans.g:3477:3: ( ( (lv_anif_10_0= 'if' ) ) ( (lv_cond_11_0= ruleExpr ) ) otherlv_12= 'then' ( (lv_blocks_13_0= ruleBlockElems ) ) ( (lv_elifs_14_0= ruleElifs ) )? ( (lv_els_15_0= ruleElse ) )? otherlv_16= 'end' )
                    // InternalFortXTrans.g:3478:4: ( (lv_anif_10_0= 'if' ) ) ( (lv_cond_11_0= ruleExpr ) ) otherlv_12= 'then' ( (lv_blocks_13_0= ruleBlockElems ) ) ( (lv_elifs_14_0= ruleElifs ) )? ( (lv_els_15_0= ruleElse ) )? otherlv_16= 'end'
                    {
                    // InternalFortXTrans.g:3478:4: ( (lv_anif_10_0= 'if' ) )
                    // InternalFortXTrans.g:3479:5: (lv_anif_10_0= 'if' )
                    {
                    // InternalFortXTrans.g:3479:5: (lv_anif_10_0= 'if' )
                    // InternalFortXTrans.g:3480:6: lv_anif_10_0= 'if'
                    {
                    lv_anif_10_0=(Token)match(input,60,FOLLOW_29); 

                    						newLeafNode(lv_anif_10_0, grammarAccess.getDelimitedExprAccess().getAnifIfKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelimitedExprRule());
                    						}
                    						setWithLastConsumed(current, "anif", lv_anif_10_0, "if");
                    					

                    }


                    }

                    // InternalFortXTrans.g:3492:4: ( (lv_cond_11_0= ruleExpr ) )
                    // InternalFortXTrans.g:3493:5: (lv_cond_11_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:3493:5: (lv_cond_11_0= ruleExpr )
                    // InternalFortXTrans.g:3494:6: lv_cond_11_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getCondExprParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_cond_11_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                    						}
                    						set(
                    							current,
                    							"cond",
                    							lv_cond_11_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,61,FOLLOW_29); 

                    				newLeafNode(otherlv_12, grammarAccess.getDelimitedExprAccess().getThenKeyword_4_2());
                    			
                    // InternalFortXTrans.g:3515:4: ( (lv_blocks_13_0= ruleBlockElems ) )
                    // InternalFortXTrans.g:3516:5: (lv_blocks_13_0= ruleBlockElems )
                    {
                    // InternalFortXTrans.g:3516:5: (lv_blocks_13_0= ruleBlockElems )
                    // InternalFortXTrans.g:3517:6: lv_blocks_13_0= ruleBlockElems
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getBlocksBlockElemsParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_blocks_13_0=ruleBlockElems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                    						}
                    						set(
                    							current,
                    							"blocks",
                    							lv_blocks_13_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.BlockElems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:3534:4: ( (lv_elifs_14_0= ruleElifs ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==62) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalFortXTrans.g:3535:5: (lv_elifs_14_0= ruleElifs )
                            {
                            // InternalFortXTrans.g:3535:5: (lv_elifs_14_0= ruleElifs )
                            // InternalFortXTrans.g:3536:6: lv_elifs_14_0= ruleElifs
                            {

                            						newCompositeNode(grammarAccess.getDelimitedExprAccess().getElifsElifsParserRuleCall_4_4_0());
                            					
                            pushFollow(FOLLOW_54);
                            lv_elifs_14_0=ruleElifs();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                            						}
                            						set(
                            							current,
                            							"elifs",
                            							lv_elifs_14_0,
                            							"srf.transpiler.fortxtrans.FortXTrans.Elifs");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:3553:4: ( (lv_els_15_0= ruleElse ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==63) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalFortXTrans.g:3554:5: (lv_els_15_0= ruleElse )
                            {
                            // InternalFortXTrans.g:3554:5: (lv_els_15_0= ruleElse )
                            // InternalFortXTrans.g:3555:6: lv_els_15_0= ruleElse
                            {

                            						newCompositeNode(grammarAccess.getDelimitedExprAccess().getElsElseParserRuleCall_4_5_0());
                            					
                            pushFollow(FOLLOW_51);
                            lv_els_15_0=ruleElse();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                            						}
                            						set(
                            							current,
                            							"els",
                            							lv_els_15_0,
                            							"srf.transpiler.fortxtrans.FortXTrans.Else");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getDelimitedExprAccess().getEndKeyword_4_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelimitedExpr"


    // $ANTLR start "entryRuleElifs"
    // InternalFortXTrans.g:3581:1: entryRuleElifs returns [EObject current=null] : iv_ruleElifs= ruleElifs EOF ;
    public final EObject entryRuleElifs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElifs = null;


        try {
            // InternalFortXTrans.g:3581:46: (iv_ruleElifs= ruleElifs EOF )
            // InternalFortXTrans.g:3582:2: iv_ruleElifs= ruleElifs EOF
            {
             newCompositeNode(grammarAccess.getElifsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElifs=ruleElifs();

            state._fsp--;

             current =iv_ruleElifs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElifs"


    // $ANTLR start "ruleElifs"
    // InternalFortXTrans.g:3588:1: ruleElifs returns [EObject current=null] : ( ( (lv_e_0_0= ruleElif ) ) ( (lv_e_1_0= ruleElif ) )* ) ;
    public final EObject ruleElifs() throws RecognitionException {
        EObject current = null;

        EObject lv_e_0_0 = null;

        EObject lv_e_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3594:2: ( ( ( (lv_e_0_0= ruleElif ) ) ( (lv_e_1_0= ruleElif ) )* ) )
            // InternalFortXTrans.g:3595:2: ( ( (lv_e_0_0= ruleElif ) ) ( (lv_e_1_0= ruleElif ) )* )
            {
            // InternalFortXTrans.g:3595:2: ( ( (lv_e_0_0= ruleElif ) ) ( (lv_e_1_0= ruleElif ) )* )
            // InternalFortXTrans.g:3596:3: ( (lv_e_0_0= ruleElif ) ) ( (lv_e_1_0= ruleElif ) )*
            {
            // InternalFortXTrans.g:3596:3: ( (lv_e_0_0= ruleElif ) )
            // InternalFortXTrans.g:3597:4: (lv_e_0_0= ruleElif )
            {
            // InternalFortXTrans.g:3597:4: (lv_e_0_0= ruleElif )
            // InternalFortXTrans.g:3598:5: lv_e_0_0= ruleElif
            {

            					newCompositeNode(grammarAccess.getElifsAccess().getEElifParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_55);
            lv_e_0_0=ruleElif();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElifsRule());
            					}
            					add(
            						current,
            						"e",
            						lv_e_0_0,
            						"srf.transpiler.fortxtrans.FortXTrans.Elif");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFortXTrans.g:3615:3: ( (lv_e_1_0= ruleElif ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==62) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalFortXTrans.g:3616:4: (lv_e_1_0= ruleElif )
            	    {
            	    // InternalFortXTrans.g:3616:4: (lv_e_1_0= ruleElif )
            	    // InternalFortXTrans.g:3617:5: lv_e_1_0= ruleElif
            	    {

            	    					newCompositeNode(grammarAccess.getElifsAccess().getEElifParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_55);
            	    lv_e_1_0=ruleElif();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElifsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"e",
            	    						lv_e_1_0,
            	    						"srf.transpiler.fortxtrans.FortXTrans.Elif");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElifs"


    // $ANTLR start "entryRuleElif"
    // InternalFortXTrans.g:3638:1: entryRuleElif returns [EObject current=null] : iv_ruleElif= ruleElif EOF ;
    public final EObject entryRuleElif() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElif = null;


        try {
            // InternalFortXTrans.g:3638:45: (iv_ruleElif= ruleElif EOF )
            // InternalFortXTrans.g:3639:2: iv_ruleElif= ruleElif EOF
            {
             newCompositeNode(grammarAccess.getElifRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElif=ruleElif();

            state._fsp--;

             current =iv_ruleElif; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElif"


    // $ANTLR start "ruleElif"
    // InternalFortXTrans.g:3645:1: ruleElif returns [EObject current=null] : (otherlv_0= 'elif' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_block_3_0= ruleBlockElems ) ) ) ;
    public final EObject ruleElif() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;

        EObject lv_block_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3651:2: ( (otherlv_0= 'elif' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_block_3_0= ruleBlockElems ) ) ) )
            // InternalFortXTrans.g:3652:2: (otherlv_0= 'elif' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_block_3_0= ruleBlockElems ) ) )
            {
            // InternalFortXTrans.g:3652:2: (otherlv_0= 'elif' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_block_3_0= ruleBlockElems ) ) )
            // InternalFortXTrans.g:3653:3: otherlv_0= 'elif' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_block_3_0= ruleBlockElems ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getElifAccess().getElifKeyword_0());
            		
            // InternalFortXTrans.g:3657:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalFortXTrans.g:3658:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalFortXTrans.g:3658:4: (lv_expr_1_0= ruleExpr )
            // InternalFortXTrans.g:3659:5: lv_expr_1_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getElifAccess().getExprExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_52);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElifRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"srf.transpiler.fortxtrans.FortXTrans.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,61,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getElifAccess().getThenKeyword_2());
            		
            // InternalFortXTrans.g:3680:3: ( (lv_block_3_0= ruleBlockElems ) )
            // InternalFortXTrans.g:3681:4: (lv_block_3_0= ruleBlockElems )
            {
            // InternalFortXTrans.g:3681:4: (lv_block_3_0= ruleBlockElems )
            // InternalFortXTrans.g:3682:5: lv_block_3_0= ruleBlockElems
            {

            					newCompositeNode(grammarAccess.getElifAccess().getBlockBlockElemsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_3_0=ruleBlockElems();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElifRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_3_0,
            						"srf.transpiler.fortxtrans.FortXTrans.BlockElems");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElif"


    // $ANTLR start "entryRuleElse"
    // InternalFortXTrans.g:3703:1: entryRuleElse returns [EObject current=null] : iv_ruleElse= ruleElse EOF ;
    public final EObject entryRuleElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElse = null;


        try {
            // InternalFortXTrans.g:3703:45: (iv_ruleElse= ruleElse EOF )
            // InternalFortXTrans.g:3704:2: iv_ruleElse= ruleElse EOF
            {
             newCompositeNode(grammarAccess.getElseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElse=ruleElse();

            state._fsp--;

             current =iv_ruleElse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElse"


    // $ANTLR start "ruleElse"
    // InternalFortXTrans.g:3710:1: ruleElse returns [EObject current=null] : (otherlv_0= 'else' ( (lv_block_1_0= ruleBlockElems ) ) ) ;
    public final EObject ruleElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3716:2: ( (otherlv_0= 'else' ( (lv_block_1_0= ruleBlockElems ) ) ) )
            // InternalFortXTrans.g:3717:2: (otherlv_0= 'else' ( (lv_block_1_0= ruleBlockElems ) ) )
            {
            // InternalFortXTrans.g:3717:2: (otherlv_0= 'else' ( (lv_block_1_0= ruleBlockElems ) ) )
            // InternalFortXTrans.g:3718:3: otherlv_0= 'else' ( (lv_block_1_0= ruleBlockElems ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getElseAccess().getElseKeyword_0());
            		
            // InternalFortXTrans.g:3722:3: ( (lv_block_1_0= ruleBlockElems ) )
            // InternalFortXTrans.g:3723:4: (lv_block_1_0= ruleBlockElems )
            {
            // InternalFortXTrans.g:3723:4: (lv_block_1_0= ruleBlockElems )
            // InternalFortXTrans.g:3724:5: lv_block_1_0= ruleBlockElems
            {

            					newCompositeNode(grammarAccess.getElseAccess().getBlockBlockElemsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_1_0=ruleBlockElems();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElseRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_1_0,
            						"srf.transpiler.fortxtrans.FortXTrans.BlockElems");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElse"


    // $ANTLR start "entryRuleGenerators"
    // InternalFortXTrans.g:3745:1: entryRuleGenerators returns [EObject current=null] : iv_ruleGenerators= ruleGenerators EOF ;
    public final EObject entryRuleGenerators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerators = null;


        try {
            // InternalFortXTrans.g:3745:51: (iv_ruleGenerators= ruleGenerators EOF )
            // InternalFortXTrans.g:3746:2: iv_ruleGenerators= ruleGenerators EOF
            {
             newCompositeNode(grammarAccess.getGeneratorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenerators=ruleGenerators();

            state._fsp--;

             current =iv_ruleGenerators; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenerators"


    // $ANTLR start "ruleGenerators"
    // InternalFortXTrans.g:3752:1: ruleGenerators returns [EObject current=null] : ( ( (lv_binding_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_clause_2_0= ruleGenClause ) ) )* ) ;
    public final EObject ruleGenerators() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_binding_0_0 = null;

        EObject lv_clause_2_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3758:2: ( ( ( (lv_binding_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_clause_2_0= ruleGenClause ) ) )* ) )
            // InternalFortXTrans.g:3759:2: ( ( (lv_binding_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_clause_2_0= ruleGenClause ) ) )* )
            {
            // InternalFortXTrans.g:3759:2: ( ( (lv_binding_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_clause_2_0= ruleGenClause ) ) )* )
            // InternalFortXTrans.g:3760:3: ( (lv_binding_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_clause_2_0= ruleGenClause ) ) )*
            {
            // InternalFortXTrans.g:3760:3: ( (lv_binding_0_0= ruleBinding ) )
            // InternalFortXTrans.g:3761:4: (lv_binding_0_0= ruleBinding )
            {
            // InternalFortXTrans.g:3761:4: (lv_binding_0_0= ruleBinding )
            // InternalFortXTrans.g:3762:5: lv_binding_0_0= ruleBinding
            {

            					newCompositeNode(grammarAccess.getGeneratorsAccess().getBindingBindingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_binding_0_0=ruleBinding();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGeneratorsRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_0_0,
            						"srf.transpiler.fortxtrans.FortXTrans.Binding");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFortXTrans.g:3779:3: (otherlv_1= ',' ( (lv_clause_2_0= ruleGenClause ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==19) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalFortXTrans.g:3780:4: otherlv_1= ',' ( (lv_clause_2_0= ruleGenClause ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_29); 

            	    				newLeafNode(otherlv_1, grammarAccess.getGeneratorsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalFortXTrans.g:3784:4: ( (lv_clause_2_0= ruleGenClause ) )
            	    // InternalFortXTrans.g:3785:5: (lv_clause_2_0= ruleGenClause )
            	    {
            	    // InternalFortXTrans.g:3785:5: (lv_clause_2_0= ruleGenClause )
            	    // InternalFortXTrans.g:3786:6: lv_clause_2_0= ruleGenClause
            	    {

            	    						newCompositeNode(grammarAccess.getGeneratorsAccess().getClauseGenClauseParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_clause_2_0=ruleGenClause();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGeneratorsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"clause",
            	    							lv_clause_2_0,
            	    							"srf.transpiler.fortxtrans.FortXTrans.GenClause");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenerators"


    // $ANTLR start "entryRuleBinding"
    // InternalFortXTrans.g:3808:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalFortXTrans.g:3808:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalFortXTrans.g:3809:2: iv_ruleBinding= ruleBinding EOF
            {
             newCompositeNode(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;

             current =iv_ruleBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalFortXTrans.g:3815:1: ruleBinding returns [EObject current=null] : ( ( ( (lv_idtup_0_0= ruleQualified ) ) otherlv_1= '<-' ( (lv_g_2_0= ruleGenSource ) ) ) | ( ( (lv_idtup_3_0= ruleQualified ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_g_7_0= ruleGenSource ) ) otherlv_8= ')' ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token lv_seq_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_idtup_0_0 = null;

        EObject lv_g_2_0 = null;

        EObject lv_idtup_3_0 = null;

        EObject lv_g_7_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3821:2: ( ( ( ( (lv_idtup_0_0= ruleQualified ) ) otherlv_1= '<-' ( (lv_g_2_0= ruleGenSource ) ) ) | ( ( (lv_idtup_3_0= ruleQualified ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_g_7_0= ruleGenSource ) ) otherlv_8= ')' ) ) )
            // InternalFortXTrans.g:3822:2: ( ( ( (lv_idtup_0_0= ruleQualified ) ) otherlv_1= '<-' ( (lv_g_2_0= ruleGenSource ) ) ) | ( ( (lv_idtup_3_0= ruleQualified ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_g_7_0= ruleGenSource ) ) otherlv_8= ')' ) )
            {
            // InternalFortXTrans.g:3822:2: ( ( ( (lv_idtup_0_0= ruleQualified ) ) otherlv_1= '<-' ( (lv_g_2_0= ruleGenSource ) ) ) | ( ( (lv_idtup_3_0= ruleQualified ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_g_7_0= ruleGenSource ) ) otherlv_8= ')' ) )
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // InternalFortXTrans.g:3823:3: ( ( (lv_idtup_0_0= ruleQualified ) ) otherlv_1= '<-' ( (lv_g_2_0= ruleGenSource ) ) )
                    {
                    // InternalFortXTrans.g:3823:3: ( ( (lv_idtup_0_0= ruleQualified ) ) otherlv_1= '<-' ( (lv_g_2_0= ruleGenSource ) ) )
                    // InternalFortXTrans.g:3824:4: ( (lv_idtup_0_0= ruleQualified ) ) otherlv_1= '<-' ( (lv_g_2_0= ruleGenSource ) )
                    {
                    // InternalFortXTrans.g:3824:4: ( (lv_idtup_0_0= ruleQualified ) )
                    // InternalFortXTrans.g:3825:5: (lv_idtup_0_0= ruleQualified )
                    {
                    // InternalFortXTrans.g:3825:5: (lv_idtup_0_0= ruleQualified )
                    // InternalFortXTrans.g:3826:6: lv_idtup_0_0= ruleQualified
                    {

                    						newCompositeNode(grammarAccess.getBindingAccess().getIdtupQualifiedParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_idtup_0_0=ruleQualified();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBindingRule());
                    						}
                    						set(
                    							current,
                    							"idtup",
                    							lv_idtup_0_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Qualified");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,64,FOLLOW_29); 

                    				newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getLessThanSignHyphenMinusKeyword_0_1());
                    			
                    // InternalFortXTrans.g:3847:4: ( (lv_g_2_0= ruleGenSource ) )
                    // InternalFortXTrans.g:3848:5: (lv_g_2_0= ruleGenSource )
                    {
                    // InternalFortXTrans.g:3848:5: (lv_g_2_0= ruleGenSource )
                    // InternalFortXTrans.g:3849:6: lv_g_2_0= ruleGenSource
                    {

                    						newCompositeNode(grammarAccess.getBindingAccess().getGGenSourceParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_g_2_0=ruleGenSource();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBindingRule());
                    						}
                    						set(
                    							current,
                    							"g",
                    							lv_g_2_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.GenSource");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:3868:3: ( ( (lv_idtup_3_0= ruleQualified ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_g_7_0= ruleGenSource ) ) otherlv_8= ')' )
                    {
                    // InternalFortXTrans.g:3868:3: ( ( (lv_idtup_3_0= ruleQualified ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_g_7_0= ruleGenSource ) ) otherlv_8= ')' )
                    // InternalFortXTrans.g:3869:4: ( (lv_idtup_3_0= ruleQualified ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_g_7_0= ruleGenSource ) ) otherlv_8= ')'
                    {
                    // InternalFortXTrans.g:3869:4: ( (lv_idtup_3_0= ruleQualified ) )
                    // InternalFortXTrans.g:3870:5: (lv_idtup_3_0= ruleQualified )
                    {
                    // InternalFortXTrans.g:3870:5: (lv_idtup_3_0= ruleQualified )
                    // InternalFortXTrans.g:3871:6: lv_idtup_3_0= ruleQualified
                    {

                    						newCompositeNode(grammarAccess.getBindingAccess().getIdtupQualifiedParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_idtup_3_0=ruleQualified();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBindingRule());
                    						}
                    						set(
                    							current,
                    							"idtup",
                    							lv_idtup_3_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Qualified");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,64,FOLLOW_57); 

                    				newLeafNode(otherlv_4, grammarAccess.getBindingAccess().getLessThanSignHyphenMinusKeyword_1_1());
                    			
                    // InternalFortXTrans.g:3892:4: ( (lv_seq_5_0= 'seq' ) )
                    // InternalFortXTrans.g:3893:5: (lv_seq_5_0= 'seq' )
                    {
                    // InternalFortXTrans.g:3893:5: (lv_seq_5_0= 'seq' )
                    // InternalFortXTrans.g:3894:6: lv_seq_5_0= 'seq'
                    {
                    lv_seq_5_0=(Token)match(input,65,FOLLOW_24); 

                    						newLeafNode(lv_seq_5_0, grammarAccess.getBindingAccess().getSeqSeqKeyword_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBindingRule());
                    						}
                    						setWithLastConsumed(current, "seq", lv_seq_5_0, "seq");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_29); 

                    				newLeafNode(otherlv_6, grammarAccess.getBindingAccess().getLeftParenthesisKeyword_1_3());
                    			
                    // InternalFortXTrans.g:3910:4: ( (lv_g_7_0= ruleGenSource ) )
                    // InternalFortXTrans.g:3911:5: (lv_g_7_0= ruleGenSource )
                    {
                    // InternalFortXTrans.g:3911:5: (lv_g_7_0= ruleGenSource )
                    // InternalFortXTrans.g:3912:6: lv_g_7_0= ruleGenSource
                    {

                    						newCompositeNode(grammarAccess.getBindingAccess().getGGenSourceParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_g_7_0=ruleGenSource();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBindingRule());
                    						}
                    						set(
                    							current,
                    							"g",
                    							lv_g_7_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.GenSource");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getBindingAccess().getRightParenthesisKeyword_1_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleGenSource"
    // InternalFortXTrans.g:3938:1: entryRuleGenSource returns [EObject current=null] : iv_ruleGenSource= ruleGenSource EOF ;
    public final EObject entryRuleGenSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenSource = null;


        try {
            // InternalFortXTrans.g:3938:50: (iv_ruleGenSource= ruleGenSource EOF )
            // InternalFortXTrans.g:3939:2: iv_ruleGenSource= ruleGenSource EOF
            {
             newCompositeNode(grammarAccess.getGenSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenSource=ruleGenSource();

            state._fsp--;

             current =iv_ruleGenSource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenSource"


    // $ANTLR start "ruleGenSource"
    // InternalFortXTrans.g:3945:1: ruleGenSource returns [EObject current=null] : (this_Expr_0= ruleExpr ( () otherlv_2= '#' ( (lv_end_3_0= ruleExpr ) ) )? ) ;
    public final EObject ruleGenSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Expr_0 = null;

        EObject lv_end_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3951:2: ( (this_Expr_0= ruleExpr ( () otherlv_2= '#' ( (lv_end_3_0= ruleExpr ) ) )? ) )
            // InternalFortXTrans.g:3952:2: (this_Expr_0= ruleExpr ( () otherlv_2= '#' ( (lv_end_3_0= ruleExpr ) ) )? )
            {
            // InternalFortXTrans.g:3952:2: (this_Expr_0= ruleExpr ( () otherlv_2= '#' ( (lv_end_3_0= ruleExpr ) ) )? )
            // InternalFortXTrans.g:3953:3: this_Expr_0= ruleExpr ( () otherlv_2= '#' ( (lv_end_3_0= ruleExpr ) ) )?
            {

            			newCompositeNode(grammarAccess.getGenSourceAccess().getExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_58);
            this_Expr_0=ruleExpr();

            state._fsp--;


            			current = this_Expr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFortXTrans.g:3961:3: ( () otherlv_2= '#' ( (lv_end_3_0= ruleExpr ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==66) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalFortXTrans.g:3962:4: () otherlv_2= '#' ( (lv_end_3_0= ruleExpr ) )
                    {
                    // InternalFortXTrans.g:3962:4: ()
                    // InternalFortXTrans.g:3963:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getGenSourceAccess().getGenSourceStartAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,66,FOLLOW_29); 

                    				newLeafNode(otherlv_2, grammarAccess.getGenSourceAccess().getNumberSignKeyword_1_1());
                    			
                    // InternalFortXTrans.g:3973:4: ( (lv_end_3_0= ruleExpr ) )
                    // InternalFortXTrans.g:3974:5: (lv_end_3_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:3974:5: (lv_end_3_0= ruleExpr )
                    // InternalFortXTrans.g:3975:6: lv_end_3_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getGenSourceAccess().getEndExprParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_end_3_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGenSourceRule());
                    						}
                    						set(
                    							current,
                    							"end",
                    							lv_end_3_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenSource"


    // $ANTLR start "entryRuleGenClause"
    // InternalFortXTrans.g:3997:1: entryRuleGenClause returns [EObject current=null] : iv_ruleGenClause= ruleGenClause EOF ;
    public final EObject entryRuleGenClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenClause = null;


        try {
            // InternalFortXTrans.g:3997:50: (iv_ruleGenClause= ruleGenClause EOF )
            // InternalFortXTrans.g:3998:2: iv_ruleGenClause= ruleGenClause EOF
            {
             newCompositeNode(grammarAccess.getGenClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenClause=ruleGenClause();

            state._fsp--;

             current =iv_ruleGenClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenClause"


    // $ANTLR start "ruleGenClause"
    // InternalFortXTrans.g:4004:1: ruleGenClause returns [EObject current=null] : ( ( (lv_binding_0_0= ruleBinding ) ) | ( (lv_expr_1_0= ruleExpr ) ) ) ;
    public final EObject ruleGenClause() throws RecognitionException {
        EObject current = null;

        EObject lv_binding_0_0 = null;

        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:4010:2: ( ( ( (lv_binding_0_0= ruleBinding ) ) | ( (lv_expr_1_0= ruleExpr ) ) ) )
            // InternalFortXTrans.g:4011:2: ( ( (lv_binding_0_0= ruleBinding ) ) | ( (lv_expr_1_0= ruleExpr ) ) )
            {
            // InternalFortXTrans.g:4011:2: ( ( (lv_binding_0_0= ruleBinding ) ) | ( (lv_expr_1_0= ruleExpr ) ) )
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // InternalFortXTrans.g:4012:3: ( (lv_binding_0_0= ruleBinding ) )
                    {
                    // InternalFortXTrans.g:4012:3: ( (lv_binding_0_0= ruleBinding ) )
                    // InternalFortXTrans.g:4013:4: (lv_binding_0_0= ruleBinding )
                    {
                    // InternalFortXTrans.g:4013:4: (lv_binding_0_0= ruleBinding )
                    // InternalFortXTrans.g:4014:5: lv_binding_0_0= ruleBinding
                    {

                    					newCompositeNode(grammarAccess.getGenClauseAccess().getBindingBindingParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_binding_0_0=ruleBinding();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGenClauseRule());
                    					}
                    					set(
                    						current,
                    						"binding",
                    						lv_binding_0_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.Binding");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:4032:3: ( (lv_expr_1_0= ruleExpr ) )
                    {
                    // InternalFortXTrans.g:4032:3: ( (lv_expr_1_0= ruleExpr ) )
                    // InternalFortXTrans.g:4033:4: (lv_expr_1_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:4033:4: (lv_expr_1_0= ruleExpr )
                    // InternalFortXTrans.g:4034:5: lv_expr_1_0= ruleExpr
                    {

                    					newCompositeNode(grammarAccess.getGenClauseAccess().getExprExprParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_expr_1_0=ruleExpr();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGenClauseRule());
                    					}
                    					set(
                    						current,
                    						"expr",
                    						lv_expr_1_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.Expr");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenClause"


    // $ANTLR start "entryRuleBlockElems"
    // InternalFortXTrans.g:4055:1: entryRuleBlockElems returns [EObject current=null] : iv_ruleBlockElems= ruleBlockElems EOF ;
    public final EObject entryRuleBlockElems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockElems = null;


        try {
            // InternalFortXTrans.g:4055:51: (iv_ruleBlockElems= ruleBlockElems EOF )
            // InternalFortXTrans.g:4056:2: iv_ruleBlockElems= ruleBlockElems EOF
            {
             newCompositeNode(grammarAccess.getBlockElemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlockElems=ruleBlockElems();

            state._fsp--;

             current =iv_ruleBlockElems; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlockElems"


    // $ANTLR start "ruleBlockElems"
    // InternalFortXTrans.g:4062:1: ruleBlockElems returns [EObject current=null] : ( ( (lv_block_0_0= ruleBlockElem ) ) ( (lv_block_1_0= ruleBlockElem ) )* ) ;
    public final EObject ruleBlockElems() throws RecognitionException {
        EObject current = null;

        EObject lv_block_0_0 = null;

        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:4068:2: ( ( ( (lv_block_0_0= ruleBlockElem ) ) ( (lv_block_1_0= ruleBlockElem ) )* ) )
            // InternalFortXTrans.g:4069:2: ( ( (lv_block_0_0= ruleBlockElem ) ) ( (lv_block_1_0= ruleBlockElem ) )* )
            {
            // InternalFortXTrans.g:4069:2: ( ( (lv_block_0_0= ruleBlockElem ) ) ( (lv_block_1_0= ruleBlockElem ) )* )
            // InternalFortXTrans.g:4070:3: ( (lv_block_0_0= ruleBlockElem ) ) ( (lv_block_1_0= ruleBlockElem ) )*
            {
            // InternalFortXTrans.g:4070:3: ( (lv_block_0_0= ruleBlockElem ) )
            // InternalFortXTrans.g:4071:4: (lv_block_0_0= ruleBlockElem )
            {
            // InternalFortXTrans.g:4071:4: (lv_block_0_0= ruleBlockElem )
            // InternalFortXTrans.g:4072:5: lv_block_0_0= ruleBlockElem
            {

            					newCompositeNode(grammarAccess.getBlockElemsAccess().getBlockBlockElemParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_59);
            lv_block_0_0=ruleBlockElem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockElemsRule());
            					}
            					add(
            						current,
            						"block",
            						lv_block_0_0,
            						"srf.transpiler.fortxtrans.FortXTrans.BlockElem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFortXTrans.g:4089:3: ( (lv_block_1_0= ruleBlockElem ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_ID||(LA65_0>=RULE_INT && LA65_0<=RULE_STRING)||LA65_0==24||LA65_0==29||LA65_0==48||(LA65_0>=56 && LA65_0<=60)||(LA65_0>=68 && LA65_0<=72)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalFortXTrans.g:4090:4: (lv_block_1_0= ruleBlockElem )
            	    {
            	    // InternalFortXTrans.g:4090:4: (lv_block_1_0= ruleBlockElem )
            	    // InternalFortXTrans.g:4091:5: lv_block_1_0= ruleBlockElem
            	    {

            	    					newCompositeNode(grammarAccess.getBlockElemsAccess().getBlockBlockElemParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_59);
            	    lv_block_1_0=ruleBlockElem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBlockElemsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"block",
            	    						lv_block_1_0,
            	    						"srf.transpiler.fortxtrans.FortXTrans.BlockElem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlockElems"


    // $ANTLR start "entryRuleBlockElem"
    // InternalFortXTrans.g:4112:1: entryRuleBlockElem returns [EObject current=null] : iv_ruleBlockElem= ruleBlockElem EOF ;
    public final EObject entryRuleBlockElem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockElem = null;


        try {
            // InternalFortXTrans.g:4112:50: (iv_ruleBlockElem= ruleBlockElem EOF )
            // InternalFortXTrans.g:4113:2: iv_ruleBlockElem= ruleBlockElem EOF
            {
             newCompositeNode(grammarAccess.getBlockElemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlockElem=ruleBlockElem();

            state._fsp--;

             current =iv_ruleBlockElem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlockElem"


    // $ANTLR start "ruleBlockElem"
    // InternalFortXTrans.g:4119:1: ruleBlockElem returns [EObject current=null] : ( (lv_st_0_0= ruleStmnts ) ) ;
    public final EObject ruleBlockElem() throws RecognitionException {
        EObject current = null;

        EObject lv_st_0_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:4125:2: ( ( (lv_st_0_0= ruleStmnts ) ) )
            // InternalFortXTrans.g:4126:2: ( (lv_st_0_0= ruleStmnts ) )
            {
            // InternalFortXTrans.g:4126:2: ( (lv_st_0_0= ruleStmnts ) )
            // InternalFortXTrans.g:4127:3: (lv_st_0_0= ruleStmnts )
            {
            // InternalFortXTrans.g:4127:3: (lv_st_0_0= ruleStmnts )
            // InternalFortXTrans.g:4128:4: lv_st_0_0= ruleStmnts
            {

            				newCompositeNode(grammarAccess.getBlockElemAccess().getStStmntsParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_st_0_0=ruleStmnts();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBlockElemRule());
            				}
            				set(
            					current,
            					"st",
            					lv_st_0_0,
            					"srf.transpiler.fortxtrans.FortXTrans.Stmnts");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlockElem"


    // $ANTLR start "entryRuleDo"
    // InternalFortXTrans.g:4148:1: entryRuleDo returns [EObject current=null] : iv_ruleDo= ruleDo EOF ;
    public final EObject entryRuleDo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDo = null;


        try {
            // InternalFortXTrans.g:4148:43: (iv_ruleDo= ruleDo EOF )
            // InternalFortXTrans.g:4149:2: iv_ruleDo= ruleDo EOF
            {
             newCompositeNode(grammarAccess.getDoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDo=ruleDo();

            state._fsp--;

             current =iv_ruleDo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDo"


    // $ANTLR start "ruleDo"
    // InternalFortXTrans.g:4155:1: ruleDo returns [EObject current=null] : ( ( (lv_dofs_0_0= ruleDoFront ) ) (otherlv_1= 'also' ( (lv_dofs_2_0= ruleDoFront ) ) )* otherlv_3= 'end' ) ;
    public final EObject ruleDo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_dofs_0_0 = null;

        EObject lv_dofs_2_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:4161:2: ( ( ( (lv_dofs_0_0= ruleDoFront ) ) (otherlv_1= 'also' ( (lv_dofs_2_0= ruleDoFront ) ) )* otherlv_3= 'end' ) )
            // InternalFortXTrans.g:4162:2: ( ( (lv_dofs_0_0= ruleDoFront ) ) (otherlv_1= 'also' ( (lv_dofs_2_0= ruleDoFront ) ) )* otherlv_3= 'end' )
            {
            // InternalFortXTrans.g:4162:2: ( ( (lv_dofs_0_0= ruleDoFront ) ) (otherlv_1= 'also' ( (lv_dofs_2_0= ruleDoFront ) ) )* otherlv_3= 'end' )
            // InternalFortXTrans.g:4163:3: ( (lv_dofs_0_0= ruleDoFront ) ) (otherlv_1= 'also' ( (lv_dofs_2_0= ruleDoFront ) ) )* otherlv_3= 'end'
            {
            // InternalFortXTrans.g:4163:3: ( (lv_dofs_0_0= ruleDoFront ) )
            // InternalFortXTrans.g:4164:4: (lv_dofs_0_0= ruleDoFront )
            {
            // InternalFortXTrans.g:4164:4: (lv_dofs_0_0= ruleDoFront )
            // InternalFortXTrans.g:4165:5: lv_dofs_0_0= ruleDoFront
            {

            					newCompositeNode(grammarAccess.getDoAccess().getDofsDoFrontParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_60);
            lv_dofs_0_0=ruleDoFront();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoRule());
            					}
            					add(
            						current,
            						"dofs",
            						lv_dofs_0_0,
            						"srf.transpiler.fortxtrans.FortXTrans.DoFront");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFortXTrans.g:4182:3: (otherlv_1= 'also' ( (lv_dofs_2_0= ruleDoFront ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==67) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalFortXTrans.g:4183:4: otherlv_1= 'also' ( (lv_dofs_2_0= ruleDoFront ) )
            	    {
            	    otherlv_1=(Token)match(input,67,FOLLOW_49); 

            	    				newLeafNode(otherlv_1, grammarAccess.getDoAccess().getAlsoKeyword_1_0());
            	    			
            	    // InternalFortXTrans.g:4187:4: ( (lv_dofs_2_0= ruleDoFront ) )
            	    // InternalFortXTrans.g:4188:5: (lv_dofs_2_0= ruleDoFront )
            	    {
            	    // InternalFortXTrans.g:4188:5: (lv_dofs_2_0= ruleDoFront )
            	    // InternalFortXTrans.g:4189:6: lv_dofs_2_0= ruleDoFront
            	    {

            	    						newCompositeNode(grammarAccess.getDoAccess().getDofsDoFrontParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_60);
            	    lv_dofs_2_0=ruleDoFront();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dofs",
            	    							lv_dofs_2_0,
            	    							"srf.transpiler.fortxtrans.FortXTrans.DoFront");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDoAccess().getEndKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDo"


    // $ANTLR start "entryRuleDoFront"
    // InternalFortXTrans.g:4215:1: entryRuleDoFront returns [EObject current=null] : iv_ruleDoFront= ruleDoFront EOF ;
    public final EObject entryRuleDoFront() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoFront = null;


        try {
            // InternalFortXTrans.g:4215:48: (iv_ruleDoFront= ruleDoFront EOF )
            // InternalFortXTrans.g:4216:2: iv_ruleDoFront= ruleDoFront EOF
            {
             newCompositeNode(grammarAccess.getDoFrontRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoFront=ruleDoFront();

            state._fsp--;

             current =iv_ruleDoFront; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoFront"


    // $ANTLR start "ruleDoFront"
    // InternalFortXTrans.g:4222:1: ruleDoFront returns [EObject current=null] : ( ( ( (lv_at_0_0= 'at' ) ) ( (lv_exp_1_0= ruleExpr ) ) )? ( (lv_atom_2_0= 'atomic' ) )? otherlv_3= 'do' ( (lv_block_4_0= ruleBlockElems ) ) ) ;
    public final EObject ruleDoFront() throws RecognitionException {
        EObject current = null;

        Token lv_at_0_0=null;
        Token lv_atom_2_0=null;
        Token otherlv_3=null;
        EObject lv_exp_1_0 = null;

        EObject lv_block_4_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:4228:2: ( ( ( ( (lv_at_0_0= 'at' ) ) ( (lv_exp_1_0= ruleExpr ) ) )? ( (lv_atom_2_0= 'atomic' ) )? otherlv_3= 'do' ( (lv_block_4_0= ruleBlockElems ) ) ) )
            // InternalFortXTrans.g:4229:2: ( ( ( (lv_at_0_0= 'at' ) ) ( (lv_exp_1_0= ruleExpr ) ) )? ( (lv_atom_2_0= 'atomic' ) )? otherlv_3= 'do' ( (lv_block_4_0= ruleBlockElems ) ) )
            {
            // InternalFortXTrans.g:4229:2: ( ( ( (lv_at_0_0= 'at' ) ) ( (lv_exp_1_0= ruleExpr ) ) )? ( (lv_atom_2_0= 'atomic' ) )? otherlv_3= 'do' ( (lv_block_4_0= ruleBlockElems ) ) )
            // InternalFortXTrans.g:4230:3: ( ( (lv_at_0_0= 'at' ) ) ( (lv_exp_1_0= ruleExpr ) ) )? ( (lv_atom_2_0= 'atomic' ) )? otherlv_3= 'do' ( (lv_block_4_0= ruleBlockElems ) )
            {
            // InternalFortXTrans.g:4230:3: ( ( (lv_at_0_0= 'at' ) ) ( (lv_exp_1_0= ruleExpr ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==68) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalFortXTrans.g:4231:4: ( (lv_at_0_0= 'at' ) ) ( (lv_exp_1_0= ruleExpr ) )
                    {
                    // InternalFortXTrans.g:4231:4: ( (lv_at_0_0= 'at' ) )
                    // InternalFortXTrans.g:4232:5: (lv_at_0_0= 'at' )
                    {
                    // InternalFortXTrans.g:4232:5: (lv_at_0_0= 'at' )
                    // InternalFortXTrans.g:4233:6: lv_at_0_0= 'at'
                    {
                    lv_at_0_0=(Token)match(input,68,FOLLOW_29); 

                    						newLeafNode(lv_at_0_0, grammarAccess.getDoFrontAccess().getAtAtKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDoFrontRule());
                    						}
                    						setWithLastConsumed(current, "at", true, "at");
                    					

                    }


                    }

                    // InternalFortXTrans.g:4245:4: ( (lv_exp_1_0= ruleExpr ) )
                    // InternalFortXTrans.g:4246:5: (lv_exp_1_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:4246:5: (lv_exp_1_0= ruleExpr )
                    // InternalFortXTrans.g:4247:6: lv_exp_1_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getDoFrontAccess().getExpExprParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_exp_1_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDoFrontRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_1_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFortXTrans.g:4265:3: ( (lv_atom_2_0= 'atomic' ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==29) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalFortXTrans.g:4266:4: (lv_atom_2_0= 'atomic' )
                    {
                    // InternalFortXTrans.g:4266:4: (lv_atom_2_0= 'atomic' )
                    // InternalFortXTrans.g:4267:5: lv_atom_2_0= 'atomic'
                    {
                    lv_atom_2_0=(Token)match(input,29,FOLLOW_62); 

                    					newLeafNode(lv_atom_2_0, grammarAccess.getDoFrontAccess().getAtomAtomicKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDoFrontRule());
                    					}
                    					setWithLastConsumed(current, "atom", true, "atomic");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,69,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getDoFrontAccess().getDoKeyword_2());
            		
            // InternalFortXTrans.g:4283:3: ( (lv_block_4_0= ruleBlockElems ) )
            // InternalFortXTrans.g:4284:4: (lv_block_4_0= ruleBlockElems )
            {
            // InternalFortXTrans.g:4284:4: (lv_block_4_0= ruleBlockElems )
            // InternalFortXTrans.g:4285:5: lv_block_4_0= ruleBlockElems
            {

            					newCompositeNode(grammarAccess.getDoFrontAccess().getBlockBlockElemsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_4_0=ruleBlockElems();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoFrontRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_4_0,
            						"srf.transpiler.fortxtrans.FortXTrans.BlockElems");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoFront"


    // $ANTLR start "entryRuleIsType"
    // InternalFortXTrans.g:4306:1: entryRuleIsType returns [EObject current=null] : iv_ruleIsType= ruleIsType EOF ;
    public final EObject entryRuleIsType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsType = null;


        try {
            // InternalFortXTrans.g:4306:47: (iv_ruleIsType= ruleIsType EOF )
            // InternalFortXTrans.g:4307:2: iv_ruleIsType= ruleIsType EOF
            {
             newCompositeNode(grammarAccess.getIsTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsType=ruleIsType();

            state._fsp--;

             current =iv_ruleIsType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIsType"


    // $ANTLR start "ruleIsType"
    // InternalFortXTrans.g:4313:1: ruleIsType returns [EObject current=null] : (otherlv_0= ':' ( (lv_type_1_0= ruleSimpleName ) ) ) ;
    public final EObject ruleIsType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:4319:2: ( (otherlv_0= ':' ( (lv_type_1_0= ruleSimpleName ) ) ) )
            // InternalFortXTrans.g:4320:2: (otherlv_0= ':' ( (lv_type_1_0= ruleSimpleName ) ) )
            {
            // InternalFortXTrans.g:4320:2: (otherlv_0= ':' ( (lv_type_1_0= ruleSimpleName ) ) )
            // InternalFortXTrans.g:4321:3: otherlv_0= ':' ( (lv_type_1_0= ruleSimpleName ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIsTypeAccess().getColonKeyword_0());
            		
            // InternalFortXTrans.g:4325:3: ( (lv_type_1_0= ruleSimpleName ) )
            // InternalFortXTrans.g:4326:4: (lv_type_1_0= ruleSimpleName )
            {
            // InternalFortXTrans.g:4326:4: (lv_type_1_0= ruleSimpleName )
            // InternalFortXTrans.g:4327:5: lv_type_1_0= ruleSimpleName
            {

            					newCompositeNode(grammarAccess.getIsTypeAccess().getTypeSimpleNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleSimpleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"srf.transpiler.fortxtrans.FortXTrans.SimpleName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIsType"


    // $ANTLR start "entryRuleFieldDecl"
    // InternalFortXTrans.g:4348:1: entryRuleFieldDecl returns [EObject current=null] : iv_ruleFieldDecl= ruleFieldDecl EOF ;
    public final EObject entryRuleFieldDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDecl = null;


        try {
            // InternalFortXTrans.g:4348:50: (iv_ruleFieldDecl= ruleFieldDecl EOF )
            // InternalFortXTrans.g:4349:2: iv_ruleFieldDecl= ruleFieldDecl EOF
            {
             newCompositeNode(grammarAccess.getFieldDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldDecl=ruleFieldDecl();

            state._fsp--;

             current =iv_ruleFieldDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldDecl"


    // $ANTLR start "ruleFieldDecl"
    // InternalFortXTrans.g:4355:1: ruleFieldDecl returns [EObject current=null] : ( ( ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpr ) ) )? ) | ( ( (lv_pri_5_0= 'private' ) )? ( (lv_idtup_6_0= ruleQualified ) ) otherlv_7= '=' ( (lv_init_8_0= ruleExpr ) )? ) | ( ( (lv_pri_9_0= 'private' ) )? ( (lv_mut_10_0= 'var' ) )? ( (lv_idtup_11_0= ruleQualified ) ) otherlv_12= ':' ( (lv_type_13_0= ruleSimpleName ) ) this_DOTS_14= RULE_DOTS (otherlv_15= '=' ( (lv_init_16_0= ruleExpr ) ) )? ) | ( ( (lv_pri_17_0= 'private' ) )? ( (lv_mut_18_0= 'var' ) )? ( (lv_idtup_19_0= ruleQualified ) ) otherlv_20= ':' ( (lv_tuptype_21_0= ruleTupleType ) ) (otherlv_22= '=' ( (lv_init_23_0= ruleExpr ) ) )? ) ) ;
    public final EObject ruleFieldDecl() throws RecognitionException {
        EObject current = null;

        Token lv_pri_0_0=null;
        Token lv_mut_1_0=null;
        Token otherlv_3=null;
        Token lv_pri_5_0=null;
        Token otherlv_7=null;
        Token lv_pri_9_0=null;
        Token lv_mut_10_0=null;
        Token otherlv_12=null;
        Token this_DOTS_14=null;
        Token otherlv_15=null;
        Token lv_pri_17_0=null;
        Token lv_mut_18_0=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_vars_2_0 = null;

        EObject lv_init_4_0 = null;

        EObject lv_idtup_6_0 = null;

        EObject lv_init_8_0 = null;

        EObject lv_idtup_11_0 = null;

        EObject lv_type_13_0 = null;

        EObject lv_init_16_0 = null;

        EObject lv_idtup_19_0 = null;

        EObject lv_tuptype_21_0 = null;

        EObject lv_init_23_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:4361:2: ( ( ( ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpr ) ) )? ) | ( ( (lv_pri_5_0= 'private' ) )? ( (lv_idtup_6_0= ruleQualified ) ) otherlv_7= '=' ( (lv_init_8_0= ruleExpr ) )? ) | ( ( (lv_pri_9_0= 'private' ) )? ( (lv_mut_10_0= 'var' ) )? ( (lv_idtup_11_0= ruleQualified ) ) otherlv_12= ':' ( (lv_type_13_0= ruleSimpleName ) ) this_DOTS_14= RULE_DOTS (otherlv_15= '=' ( (lv_init_16_0= ruleExpr ) ) )? ) | ( ( (lv_pri_17_0= 'private' ) )? ( (lv_mut_18_0= 'var' ) )? ( (lv_idtup_19_0= ruleQualified ) ) otherlv_20= ':' ( (lv_tuptype_21_0= ruleTupleType ) ) (otherlv_22= '=' ( (lv_init_23_0= ruleExpr ) ) )? ) ) )
            // InternalFortXTrans.g:4362:2: ( ( ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpr ) ) )? ) | ( ( (lv_pri_5_0= 'private' ) )? ( (lv_idtup_6_0= ruleQualified ) ) otherlv_7= '=' ( (lv_init_8_0= ruleExpr ) )? ) | ( ( (lv_pri_9_0= 'private' ) )? ( (lv_mut_10_0= 'var' ) )? ( (lv_idtup_11_0= ruleQualified ) ) otherlv_12= ':' ( (lv_type_13_0= ruleSimpleName ) ) this_DOTS_14= RULE_DOTS (otherlv_15= '=' ( (lv_init_16_0= ruleExpr ) ) )? ) | ( ( (lv_pri_17_0= 'private' ) )? ( (lv_mut_18_0= 'var' ) )? ( (lv_idtup_19_0= ruleQualified ) ) otherlv_20= ':' ( (lv_tuptype_21_0= ruleTupleType ) ) (otherlv_22= '=' ( (lv_init_23_0= ruleExpr ) ) )? ) )
            {
            // InternalFortXTrans.g:4362:2: ( ( ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpr ) ) )? ) | ( ( (lv_pri_5_0= 'private' ) )? ( (lv_idtup_6_0= ruleQualified ) ) otherlv_7= '=' ( (lv_init_8_0= ruleExpr ) )? ) | ( ( (lv_pri_9_0= 'private' ) )? ( (lv_mut_10_0= 'var' ) )? ( (lv_idtup_11_0= ruleQualified ) ) otherlv_12= ':' ( (lv_type_13_0= ruleSimpleName ) ) this_DOTS_14= RULE_DOTS (otherlv_15= '=' ( (lv_init_16_0= ruleExpr ) ) )? ) | ( ( (lv_pri_17_0= 'private' ) )? ( (lv_mut_18_0= 'var' ) )? ( (lv_idtup_19_0= ruleQualified ) ) otherlv_20= ':' ( (lv_tuptype_21_0= ruleTupleType ) ) (otherlv_22= '=' ( (lv_init_23_0= ruleExpr ) ) )? ) )
            int alt80=4;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // InternalFortXTrans.g:4363:3: ( ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpr ) ) )? )
                    {
                    // InternalFortXTrans.g:4363:3: ( ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpr ) ) )? )
                    // InternalFortXTrans.g:4364:4: ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpr ) ) )?
                    {
                    // InternalFortXTrans.g:4364:4: ( (lv_pri_0_0= 'private' ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==27) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalFortXTrans.g:4365:5: (lv_pri_0_0= 'private' )
                            {
                            // InternalFortXTrans.g:4365:5: (lv_pri_0_0= 'private' )
                            // InternalFortXTrans.g:4366:6: lv_pri_0_0= 'private'
                            {
                            lv_pri_0_0=(Token)match(input,27,FOLLOW_63); 

                            						newLeafNode(lv_pri_0_0, grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFieldDeclRule());
                            						}
                            						setWithLastConsumed(current, "pri", lv_pri_0_0, "private");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:4378:4: ( (lv_mut_1_0= 'var' ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==70) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalFortXTrans.g:4379:5: (lv_mut_1_0= 'var' )
                            {
                            // InternalFortXTrans.g:4379:5: (lv_mut_1_0= 'var' )
                            // InternalFortXTrans.g:4380:6: lv_mut_1_0= 'var'
                            {
                            lv_mut_1_0=(Token)match(input,70,FOLLOW_63); 

                            						newLeafNode(lv_mut_1_0, grammarAccess.getFieldDeclAccess().getMutVarKeyword_0_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFieldDeclRule());
                            						}
                            						setWithLastConsumed(current, "mut", lv_mut_1_0, "var");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:4392:4: ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) )
                    // InternalFortXTrans.g:4393:5: (lv_vars_2_0= ruleNoNewlineVarWTypes )
                    {
                    // InternalFortXTrans.g:4393:5: (lv_vars_2_0= ruleNoNewlineVarWTypes )
                    // InternalFortXTrans.g:4394:6: lv_vars_2_0= ruleNoNewlineVarWTypes
                    {

                    						newCompositeNode(grammarAccess.getFieldDeclAccess().getVarsNoNewlineVarWTypesParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_vars_2_0=ruleNoNewlineVarWTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldDeclRule());
                    						}
                    						set(
                    							current,
                    							"vars",
                    							lv_vars_2_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.NoNewlineVarWTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:4411:4: (otherlv_3= '=' ( (lv_init_4_0= ruleExpr ) ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==31) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalFortXTrans.g:4412:5: otherlv_3= '=' ( (lv_init_4_0= ruleExpr ) )
                            {
                            otherlv_3=(Token)match(input,31,FOLLOW_29); 

                            					newLeafNode(otherlv_3, grammarAccess.getFieldDeclAccess().getEqualsSignKeyword_0_3_0());
                            				
                            // InternalFortXTrans.g:4416:5: ( (lv_init_4_0= ruleExpr ) )
                            // InternalFortXTrans.g:4417:6: (lv_init_4_0= ruleExpr )
                            {
                            // InternalFortXTrans.g:4417:6: (lv_init_4_0= ruleExpr )
                            // InternalFortXTrans.g:4418:7: lv_init_4_0= ruleExpr
                            {

                            							newCompositeNode(grammarAccess.getFieldDeclAccess().getInitExprParserRuleCall_0_3_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_init_4_0=ruleExpr();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFieldDeclRule());
                            							}
                            							set(
                            								current,
                            								"init",
                            								lv_init_4_0,
                            								"srf.transpiler.fortxtrans.FortXTrans.Expr");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:4438:3: ( ( (lv_pri_5_0= 'private' ) )? ( (lv_idtup_6_0= ruleQualified ) ) otherlv_7= '=' ( (lv_init_8_0= ruleExpr ) )? )
                    {
                    // InternalFortXTrans.g:4438:3: ( ( (lv_pri_5_0= 'private' ) )? ( (lv_idtup_6_0= ruleQualified ) ) otherlv_7= '=' ( (lv_init_8_0= ruleExpr ) )? )
                    // InternalFortXTrans.g:4439:4: ( (lv_pri_5_0= 'private' ) )? ( (lv_idtup_6_0= ruleQualified ) ) otherlv_7= '=' ( (lv_init_8_0= ruleExpr ) )?
                    {
                    // InternalFortXTrans.g:4439:4: ( (lv_pri_5_0= 'private' ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==27) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalFortXTrans.g:4440:5: (lv_pri_5_0= 'private' )
                            {
                            // InternalFortXTrans.g:4440:5: (lv_pri_5_0= 'private' )
                            // InternalFortXTrans.g:4441:6: lv_pri_5_0= 'private'
                            {
                            lv_pri_5_0=(Token)match(input,27,FOLLOW_50); 

                            						newLeafNode(lv_pri_5_0, grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFieldDeclRule());
                            						}
                            						setWithLastConsumed(current, "pri", lv_pri_5_0, "private");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:4453:4: ( (lv_idtup_6_0= ruleQualified ) )
                    // InternalFortXTrans.g:4454:5: (lv_idtup_6_0= ruleQualified )
                    {
                    // InternalFortXTrans.g:4454:5: (lv_idtup_6_0= ruleQualified )
                    // InternalFortXTrans.g:4455:6: lv_idtup_6_0= ruleQualified
                    {

                    						newCompositeNode(grammarAccess.getFieldDeclAccess().getIdtupQualifiedParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_idtup_6_0=ruleQualified();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldDeclRule());
                    						}
                    						set(
                    							current,
                    							"idtup",
                    							lv_idtup_6_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Qualified");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,31,FOLLOW_59); 

                    				newLeafNode(otherlv_7, grammarAccess.getFieldDeclAccess().getEqualsSignKeyword_1_2());
                    			
                    // InternalFortXTrans.g:4476:4: ( (lv_init_8_0= ruleExpr ) )?
                    int alt73=2;
                    alt73 = dfa73.predict(input);
                    switch (alt73) {
                        case 1 :
                            // InternalFortXTrans.g:4477:5: (lv_init_8_0= ruleExpr )
                            {
                            // InternalFortXTrans.g:4477:5: (lv_init_8_0= ruleExpr )
                            // InternalFortXTrans.g:4478:6: lv_init_8_0= ruleExpr
                            {

                            						newCompositeNode(grammarAccess.getFieldDeclAccess().getInitExprParserRuleCall_1_3_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_init_8_0=ruleExpr();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getFieldDeclRule());
                            						}
                            						set(
                            							current,
                            							"init",
                            							lv_init_8_0,
                            							"srf.transpiler.fortxtrans.FortXTrans.Expr");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:4497:3: ( ( (lv_pri_9_0= 'private' ) )? ( (lv_mut_10_0= 'var' ) )? ( (lv_idtup_11_0= ruleQualified ) ) otherlv_12= ':' ( (lv_type_13_0= ruleSimpleName ) ) this_DOTS_14= RULE_DOTS (otherlv_15= '=' ( (lv_init_16_0= ruleExpr ) ) )? )
                    {
                    // InternalFortXTrans.g:4497:3: ( ( (lv_pri_9_0= 'private' ) )? ( (lv_mut_10_0= 'var' ) )? ( (lv_idtup_11_0= ruleQualified ) ) otherlv_12= ':' ( (lv_type_13_0= ruleSimpleName ) ) this_DOTS_14= RULE_DOTS (otherlv_15= '=' ( (lv_init_16_0= ruleExpr ) ) )? )
                    // InternalFortXTrans.g:4498:4: ( (lv_pri_9_0= 'private' ) )? ( (lv_mut_10_0= 'var' ) )? ( (lv_idtup_11_0= ruleQualified ) ) otherlv_12= ':' ( (lv_type_13_0= ruleSimpleName ) ) this_DOTS_14= RULE_DOTS (otherlv_15= '=' ( (lv_init_16_0= ruleExpr ) ) )?
                    {
                    // InternalFortXTrans.g:4498:4: ( (lv_pri_9_0= 'private' ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==27) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalFortXTrans.g:4499:5: (lv_pri_9_0= 'private' )
                            {
                            // InternalFortXTrans.g:4499:5: (lv_pri_9_0= 'private' )
                            // InternalFortXTrans.g:4500:6: lv_pri_9_0= 'private'
                            {
                            lv_pri_9_0=(Token)match(input,27,FOLLOW_63); 

                            						newLeafNode(lv_pri_9_0, grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_2_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFieldDeclRule());
                            						}
                            						setWithLastConsumed(current, "pri", lv_pri_9_0, "private");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:4512:4: ( (lv_mut_10_0= 'var' ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==70) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalFortXTrans.g:4513:5: (lv_mut_10_0= 'var' )
                            {
                            // InternalFortXTrans.g:4513:5: (lv_mut_10_0= 'var' )
                            // InternalFortXTrans.g:4514:6: lv_mut_10_0= 'var'
                            {
                            lv_mut_10_0=(Token)match(input,70,FOLLOW_50); 

                            						newLeafNode(lv_mut_10_0, grammarAccess.getFieldDeclAccess().getMutVarKeyword_2_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFieldDeclRule());
                            						}
                            						setWithLastConsumed(current, "mut", lv_mut_10_0, "var");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:4526:4: ( (lv_idtup_11_0= ruleQualified ) )
                    // InternalFortXTrans.g:4527:5: (lv_idtup_11_0= ruleQualified )
                    {
                    // InternalFortXTrans.g:4527:5: (lv_idtup_11_0= ruleQualified )
                    // InternalFortXTrans.g:4528:6: lv_idtup_11_0= ruleQualified
                    {

                    						newCompositeNode(grammarAccess.getFieldDeclAccess().getIdtupQualifiedParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_idtup_11_0=ruleQualified();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldDeclRule());
                    						}
                    						set(
                    							current,
                    							"idtup",
                    							lv_idtup_11_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Qualified");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getFieldDeclAccess().getColonKeyword_2_3());
                    			
                    // InternalFortXTrans.g:4549:4: ( (lv_type_13_0= ruleSimpleName ) )
                    // InternalFortXTrans.g:4550:5: (lv_type_13_0= ruleSimpleName )
                    {
                    // InternalFortXTrans.g:4550:5: (lv_type_13_0= ruleSimpleName )
                    // InternalFortXTrans.g:4551:6: lv_type_13_0= ruleSimpleName
                    {

                    						newCompositeNode(grammarAccess.getFieldDeclAccess().getTypeSimpleNameParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_type_13_0=ruleSimpleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldDeclRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_13_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.SimpleName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_DOTS_14=(Token)match(input,RULE_DOTS,FOLLOW_28); 

                    				newLeafNode(this_DOTS_14, grammarAccess.getFieldDeclAccess().getDOTSTerminalRuleCall_2_5());
                    			
                    // InternalFortXTrans.g:4572:4: (otherlv_15= '=' ( (lv_init_16_0= ruleExpr ) ) )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==31) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // InternalFortXTrans.g:4573:5: otherlv_15= '=' ( (lv_init_16_0= ruleExpr ) )
                            {
                            otherlv_15=(Token)match(input,31,FOLLOW_29); 

                            					newLeafNode(otherlv_15, grammarAccess.getFieldDeclAccess().getEqualsSignKeyword_2_6_0());
                            				
                            // InternalFortXTrans.g:4577:5: ( (lv_init_16_0= ruleExpr ) )
                            // InternalFortXTrans.g:4578:6: (lv_init_16_0= ruleExpr )
                            {
                            // InternalFortXTrans.g:4578:6: (lv_init_16_0= ruleExpr )
                            // InternalFortXTrans.g:4579:7: lv_init_16_0= ruleExpr
                            {

                            							newCompositeNode(grammarAccess.getFieldDeclAccess().getInitExprParserRuleCall_2_6_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_init_16_0=ruleExpr();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFieldDeclRule());
                            							}
                            							set(
                            								current,
                            								"init",
                            								lv_init_16_0,
                            								"srf.transpiler.fortxtrans.FortXTrans.Expr");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFortXTrans.g:4599:3: ( ( (lv_pri_17_0= 'private' ) )? ( (lv_mut_18_0= 'var' ) )? ( (lv_idtup_19_0= ruleQualified ) ) otherlv_20= ':' ( (lv_tuptype_21_0= ruleTupleType ) ) (otherlv_22= '=' ( (lv_init_23_0= ruleExpr ) ) )? )
                    {
                    // InternalFortXTrans.g:4599:3: ( ( (lv_pri_17_0= 'private' ) )? ( (lv_mut_18_0= 'var' ) )? ( (lv_idtup_19_0= ruleQualified ) ) otherlv_20= ':' ( (lv_tuptype_21_0= ruleTupleType ) ) (otherlv_22= '=' ( (lv_init_23_0= ruleExpr ) ) )? )
                    // InternalFortXTrans.g:4600:4: ( (lv_pri_17_0= 'private' ) )? ( (lv_mut_18_0= 'var' ) )? ( (lv_idtup_19_0= ruleQualified ) ) otherlv_20= ':' ( (lv_tuptype_21_0= ruleTupleType ) ) (otherlv_22= '=' ( (lv_init_23_0= ruleExpr ) ) )?
                    {
                    // InternalFortXTrans.g:4600:4: ( (lv_pri_17_0= 'private' ) )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==27) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // InternalFortXTrans.g:4601:5: (lv_pri_17_0= 'private' )
                            {
                            // InternalFortXTrans.g:4601:5: (lv_pri_17_0= 'private' )
                            // InternalFortXTrans.g:4602:6: lv_pri_17_0= 'private'
                            {
                            lv_pri_17_0=(Token)match(input,27,FOLLOW_63); 

                            						newLeafNode(lv_pri_17_0, grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_3_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFieldDeclRule());
                            						}
                            						setWithLastConsumed(current, "pri", lv_pri_17_0, "private");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:4614:4: ( (lv_mut_18_0= 'var' ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==70) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // InternalFortXTrans.g:4615:5: (lv_mut_18_0= 'var' )
                            {
                            // InternalFortXTrans.g:4615:5: (lv_mut_18_0= 'var' )
                            // InternalFortXTrans.g:4616:6: lv_mut_18_0= 'var'
                            {
                            lv_mut_18_0=(Token)match(input,70,FOLLOW_50); 

                            						newLeafNode(lv_mut_18_0, grammarAccess.getFieldDeclAccess().getMutVarKeyword_3_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFieldDeclRule());
                            						}
                            						setWithLastConsumed(current, "mut", lv_mut_18_0, "var");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:4628:4: ( (lv_idtup_19_0= ruleQualified ) )
                    // InternalFortXTrans.g:4629:5: (lv_idtup_19_0= ruleQualified )
                    {
                    // InternalFortXTrans.g:4629:5: (lv_idtup_19_0= ruleQualified )
                    // InternalFortXTrans.g:4630:6: lv_idtup_19_0= ruleQualified
                    {

                    						newCompositeNode(grammarAccess.getFieldDeclAccess().getIdtupQualifiedParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_idtup_19_0=ruleQualified();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldDeclRule());
                    						}
                    						set(
                    							current,
                    							"idtup",
                    							lv_idtup_19_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Qualified");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_20=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_20, grammarAccess.getFieldDeclAccess().getColonKeyword_3_3());
                    			
                    // InternalFortXTrans.g:4651:4: ( (lv_tuptype_21_0= ruleTupleType ) )
                    // InternalFortXTrans.g:4652:5: (lv_tuptype_21_0= ruleTupleType )
                    {
                    // InternalFortXTrans.g:4652:5: (lv_tuptype_21_0= ruleTupleType )
                    // InternalFortXTrans.g:4653:6: lv_tuptype_21_0= ruleTupleType
                    {

                    						newCompositeNode(grammarAccess.getFieldDeclAccess().getTuptypeTupleTypeParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_tuptype_21_0=ruleTupleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldDeclRule());
                    						}
                    						set(
                    							current,
                    							"tuptype",
                    							lv_tuptype_21_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.TupleType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:4670:4: (otherlv_22= '=' ( (lv_init_23_0= ruleExpr ) ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==31) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalFortXTrans.g:4671:5: otherlv_22= '=' ( (lv_init_23_0= ruleExpr ) )
                            {
                            otherlv_22=(Token)match(input,31,FOLLOW_29); 

                            					newLeafNode(otherlv_22, grammarAccess.getFieldDeclAccess().getEqualsSignKeyword_3_5_0());
                            				
                            // InternalFortXTrans.g:4675:5: ( (lv_init_23_0= ruleExpr ) )
                            // InternalFortXTrans.g:4676:6: (lv_init_23_0= ruleExpr )
                            {
                            // InternalFortXTrans.g:4676:6: (lv_init_23_0= ruleExpr )
                            // InternalFortXTrans.g:4677:7: lv_init_23_0= ruleExpr
                            {

                            							newCompositeNode(grammarAccess.getFieldDeclAccess().getInitExprParserRuleCall_3_5_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_init_23_0=ruleExpr();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFieldDeclRule());
                            							}
                            							set(
                            								current,
                            								"init",
                            								lv_init_23_0,
                            								"srf.transpiler.fortxtrans.FortXTrans.Expr");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldDecl"


    // $ANTLR start "entryRuleNoNewlineVarWTypes"
    // InternalFortXTrans.g:4700:1: entryRuleNoNewlineVarWTypes returns [EObject current=null] : iv_ruleNoNewlineVarWTypes= ruleNoNewlineVarWTypes EOF ;
    public final EObject entryRuleNoNewlineVarWTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoNewlineVarWTypes = null;


        try {
            // InternalFortXTrans.g:4700:59: (iv_ruleNoNewlineVarWTypes= ruleNoNewlineVarWTypes EOF )
            // InternalFortXTrans.g:4701:2: iv_ruleNoNewlineVarWTypes= ruleNoNewlineVarWTypes EOF
            {
             newCompositeNode(grammarAccess.getNoNewlineVarWTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoNewlineVarWTypes=ruleNoNewlineVarWTypes();

            state._fsp--;

             current =iv_ruleNoNewlineVarWTypes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoNewlineVarWTypes"


    // $ANTLR start "ruleNoNewlineVarWTypes"
    // InternalFortXTrans.g:4707:1: ruleNoNewlineVarWTypes returns [EObject current=null] : ( ( ( (lv_single_0_0= ruleNoNewlineVarWType ) ) (otherlv_1= '[' ( (lv_arrsize_2_0= ruleExprList ) ) otherlv_3= ']' )? ) | (otherlv_4= '(' ( (lv_multiple_5_0= ruleNoNewlineVarWType ) ) (otherlv_6= ',' ( (lv_multiple_7_0= ruleNoNewlineVarWType ) ) )+ otherlv_8= ')' ) ) ;
    public final EObject ruleNoNewlineVarWTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_single_0_0 = null;

        EObject lv_arrsize_2_0 = null;

        EObject lv_multiple_5_0 = null;

        EObject lv_multiple_7_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:4713:2: ( ( ( ( (lv_single_0_0= ruleNoNewlineVarWType ) ) (otherlv_1= '[' ( (lv_arrsize_2_0= ruleExprList ) ) otherlv_3= ']' )? ) | (otherlv_4= '(' ( (lv_multiple_5_0= ruleNoNewlineVarWType ) ) (otherlv_6= ',' ( (lv_multiple_7_0= ruleNoNewlineVarWType ) ) )+ otherlv_8= ')' ) ) )
            // InternalFortXTrans.g:4714:2: ( ( ( (lv_single_0_0= ruleNoNewlineVarWType ) ) (otherlv_1= '[' ( (lv_arrsize_2_0= ruleExprList ) ) otherlv_3= ']' )? ) | (otherlv_4= '(' ( (lv_multiple_5_0= ruleNoNewlineVarWType ) ) (otherlv_6= ',' ( (lv_multiple_7_0= ruleNoNewlineVarWType ) ) )+ otherlv_8= ')' ) )
            {
            // InternalFortXTrans.g:4714:2: ( ( ( (lv_single_0_0= ruleNoNewlineVarWType ) ) (otherlv_1= '[' ( (lv_arrsize_2_0= ruleExprList ) ) otherlv_3= ']' )? ) | (otherlv_4= '(' ( (lv_multiple_5_0= ruleNoNewlineVarWType ) ) (otherlv_6= ',' ( (lv_multiple_7_0= ruleNoNewlineVarWType ) ) )+ otherlv_8= ')' ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_ID) ) {
                alt83=1;
            }
            else if ( (LA83_0==24) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalFortXTrans.g:4715:3: ( ( (lv_single_0_0= ruleNoNewlineVarWType ) ) (otherlv_1= '[' ( (lv_arrsize_2_0= ruleExprList ) ) otherlv_3= ']' )? )
                    {
                    // InternalFortXTrans.g:4715:3: ( ( (lv_single_0_0= ruleNoNewlineVarWType ) ) (otherlv_1= '[' ( (lv_arrsize_2_0= ruleExprList ) ) otherlv_3= ']' )? )
                    // InternalFortXTrans.g:4716:4: ( (lv_single_0_0= ruleNoNewlineVarWType ) ) (otherlv_1= '[' ( (lv_arrsize_2_0= ruleExprList ) ) otherlv_3= ']' )?
                    {
                    // InternalFortXTrans.g:4716:4: ( (lv_single_0_0= ruleNoNewlineVarWType ) )
                    // InternalFortXTrans.g:4717:5: (lv_single_0_0= ruleNoNewlineVarWType )
                    {
                    // InternalFortXTrans.g:4717:5: (lv_single_0_0= ruleNoNewlineVarWType )
                    // InternalFortXTrans.g:4718:6: lv_single_0_0= ruleNoNewlineVarWType
                    {

                    						newCompositeNode(grammarAccess.getNoNewlineVarWTypesAccess().getSingleNoNewlineVarWTypeParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_single_0_0=ruleNoNewlineVarWType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNoNewlineVarWTypesRule());
                    						}
                    						set(
                    							current,
                    							"single",
                    							lv_single_0_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.NoNewlineVarWType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:4735:4: (otherlv_1= '[' ( (lv_arrsize_2_0= ruleExprList ) ) otherlv_3= ']' )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==53) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalFortXTrans.g:4736:5: otherlv_1= '[' ( (lv_arrsize_2_0= ruleExprList ) ) otherlv_3= ']'
                            {
                            otherlv_1=(Token)match(input,53,FOLLOW_29); 

                            					newLeafNode(otherlv_1, grammarAccess.getNoNewlineVarWTypesAccess().getLeftSquareBracketKeyword_0_1_0());
                            				
                            // InternalFortXTrans.g:4740:5: ( (lv_arrsize_2_0= ruleExprList ) )
                            // InternalFortXTrans.g:4741:6: (lv_arrsize_2_0= ruleExprList )
                            {
                            // InternalFortXTrans.g:4741:6: (lv_arrsize_2_0= ruleExprList )
                            // InternalFortXTrans.g:4742:7: lv_arrsize_2_0= ruleExprList
                            {

                            							newCompositeNode(grammarAccess.getNoNewlineVarWTypesAccess().getArrsizeExprListParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_48);
                            lv_arrsize_2_0=ruleExprList();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNoNewlineVarWTypesRule());
                            							}
                            							set(
                            								current,
                            								"arrsize",
                            								lv_arrsize_2_0,
                            								"srf.transpiler.fortxtrans.FortXTrans.ExprList");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_3=(Token)match(input,55,FOLLOW_2); 

                            					newLeafNode(otherlv_3, grammarAccess.getNoNewlineVarWTypesAccess().getRightSquareBracketKeyword_0_1_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:4766:3: (otherlv_4= '(' ( (lv_multiple_5_0= ruleNoNewlineVarWType ) ) (otherlv_6= ',' ( (lv_multiple_7_0= ruleNoNewlineVarWType ) ) )+ otherlv_8= ')' )
                    {
                    // InternalFortXTrans.g:4766:3: (otherlv_4= '(' ( (lv_multiple_5_0= ruleNoNewlineVarWType ) ) (otherlv_6= ',' ( (lv_multiple_7_0= ruleNoNewlineVarWType ) ) )+ otherlv_8= ')' )
                    // InternalFortXTrans.g:4767:4: otherlv_4= '(' ( (lv_multiple_5_0= ruleNoNewlineVarWType ) ) (otherlv_6= ',' ( (lv_multiple_7_0= ruleNoNewlineVarWType ) ) )+ otherlv_8= ')'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getNoNewlineVarWTypesAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalFortXTrans.g:4771:4: ( (lv_multiple_5_0= ruleNoNewlineVarWType ) )
                    // InternalFortXTrans.g:4772:5: (lv_multiple_5_0= ruleNoNewlineVarWType )
                    {
                    // InternalFortXTrans.g:4772:5: (lv_multiple_5_0= ruleNoNewlineVarWType )
                    // InternalFortXTrans.g:4773:6: lv_multiple_5_0= ruleNoNewlineVarWType
                    {

                    						newCompositeNode(grammarAccess.getNoNewlineVarWTypesAccess().getMultipleNoNewlineVarWTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_multiple_5_0=ruleNoNewlineVarWType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNoNewlineVarWTypesRule());
                    						}
                    						add(
                    							current,
                    							"multiple",
                    							lv_multiple_5_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.NoNewlineVarWType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:4790:4: (otherlv_6= ',' ( (lv_multiple_7_0= ruleNoNewlineVarWType ) ) )+
                    int cnt82=0;
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==19) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // InternalFortXTrans.g:4791:5: otherlv_6= ',' ( (lv_multiple_7_0= ruleNoNewlineVarWType ) )
                    	    {
                    	    otherlv_6=(Token)match(input,19,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getNoNewlineVarWTypesAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalFortXTrans.g:4795:5: ( (lv_multiple_7_0= ruleNoNewlineVarWType ) )
                    	    // InternalFortXTrans.g:4796:6: (lv_multiple_7_0= ruleNoNewlineVarWType )
                    	    {
                    	    // InternalFortXTrans.g:4796:6: (lv_multiple_7_0= ruleNoNewlineVarWType )
                    	    // InternalFortXTrans.g:4797:7: lv_multiple_7_0= ruleNoNewlineVarWType
                    	    {

                    	    							newCompositeNode(grammarAccess.getNoNewlineVarWTypesAccess().getMultipleNoNewlineVarWTypeParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_multiple_7_0=ruleNoNewlineVarWType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNoNewlineVarWTypesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"multiple",
                    	    								lv_multiple_7_0,
                    	    								"srf.transpiler.fortxtrans.FortXTrans.NoNewlineVarWType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt82 >= 1 ) break loop82;
                                EarlyExitException eee =
                                    new EarlyExitException(82, input);
                                throw eee;
                        }
                        cnt82++;
                    } while (true);

                    otherlv_8=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getNoNewlineVarWTypesAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoNewlineVarWTypes"


    // $ANTLR start "entryRuleNoNewlineVarWType"
    // InternalFortXTrans.g:4824:1: entryRuleNoNewlineVarWType returns [EObject current=null] : iv_ruleNoNewlineVarWType= ruleNoNewlineVarWType EOF ;
    public final EObject entryRuleNoNewlineVarWType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoNewlineVarWType = null;


        try {
            // InternalFortXTrans.g:4824:58: (iv_ruleNoNewlineVarWType= ruleNoNewlineVarWType EOF )
            // InternalFortXTrans.g:4825:2: iv_ruleNoNewlineVarWType= ruleNoNewlineVarWType EOF
            {
             newCompositeNode(grammarAccess.getNoNewlineVarWTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoNewlineVarWType=ruleNoNewlineVarWType();

            state._fsp--;

             current =iv_ruleNoNewlineVarWType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoNewlineVarWType"


    // $ANTLR start "ruleNoNewlineVarWType"
    // InternalFortXTrans.g:4831:1: ruleNoNewlineVarWType returns [EObject current=null] : ( ( (lv_bid_0_0= ruleQualifiedName ) ) ( (lv_istype_1_0= ruleIsType ) ) ) ;
    public final EObject ruleNoNewlineVarWType() throws RecognitionException {
        EObject current = null;

        EObject lv_bid_0_0 = null;

        EObject lv_istype_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:4837:2: ( ( ( (lv_bid_0_0= ruleQualifiedName ) ) ( (lv_istype_1_0= ruleIsType ) ) ) )
            // InternalFortXTrans.g:4838:2: ( ( (lv_bid_0_0= ruleQualifiedName ) ) ( (lv_istype_1_0= ruleIsType ) ) )
            {
            // InternalFortXTrans.g:4838:2: ( ( (lv_bid_0_0= ruleQualifiedName ) ) ( (lv_istype_1_0= ruleIsType ) ) )
            // InternalFortXTrans.g:4839:3: ( (lv_bid_0_0= ruleQualifiedName ) ) ( (lv_istype_1_0= ruleIsType ) )
            {
            // InternalFortXTrans.g:4839:3: ( (lv_bid_0_0= ruleQualifiedName ) )
            // InternalFortXTrans.g:4840:4: (lv_bid_0_0= ruleQualifiedName )
            {
            // InternalFortXTrans.g:4840:4: (lv_bid_0_0= ruleQualifiedName )
            // InternalFortXTrans.g:4841:5: lv_bid_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getNoNewlineVarWTypeAccess().getBidQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_bid_0_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNoNewlineVarWTypeRule());
            					}
            					set(
            						current,
            						"bid",
            						lv_bid_0_0,
            						"srf.transpiler.fortxtrans.FortXTrans.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFortXTrans.g:4858:3: ( (lv_istype_1_0= ruleIsType ) )
            // InternalFortXTrans.g:4859:4: (lv_istype_1_0= ruleIsType )
            {
            // InternalFortXTrans.g:4859:4: (lv_istype_1_0= ruleIsType )
            // InternalFortXTrans.g:4860:5: lv_istype_1_0= ruleIsType
            {

            					newCompositeNode(grammarAccess.getNoNewlineVarWTypeAccess().getIstypeIsTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_istype_1_0=ruleIsType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNoNewlineVarWTypeRule());
            					}
            					set(
            						current,
            						"istype",
            						lv_istype_1_0,
            						"srf.transpiler.fortxtrans.FortXTrans.IsType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoNewlineVarWType"


    // $ANTLR start "entryRuleLiteralTuple"
    // InternalFortXTrans.g:4881:1: entryRuleLiteralTuple returns [EObject current=null] : iv_ruleLiteralTuple= ruleLiteralTuple EOF ;
    public final EObject entryRuleLiteralTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralTuple = null;


        try {
            // InternalFortXTrans.g:4881:53: (iv_ruleLiteralTuple= ruleLiteralTuple EOF )
            // InternalFortXTrans.g:4882:2: iv_ruleLiteralTuple= ruleLiteralTuple EOF
            {
             newCompositeNode(grammarAccess.getLiteralTupleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralTuple=ruleLiteralTuple();

            state._fsp--;

             current =iv_ruleLiteralTuple; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralTuple"


    // $ANTLR start "ruleLiteralTuple"
    // InternalFortXTrans.g:4888:1: ruleLiteralTuple returns [EObject current=null] : (this_LiteralTup_0= ruleLiteralTup | this_Qualified_1= ruleQualified ) ;
    public final EObject ruleLiteralTuple() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralTup_0 = null;

        EObject this_Qualified_1 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:4894:2: ( (this_LiteralTup_0= ruleLiteralTup | this_Qualified_1= ruleQualified ) )
            // InternalFortXTrans.g:4895:2: (this_LiteralTup_0= ruleLiteralTup | this_Qualified_1= ruleQualified )
            {
            // InternalFortXTrans.g:4895:2: (this_LiteralTup_0= ruleLiteralTup | this_Qualified_1= ruleQualified )
            int alt84=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_STRING:
            case 71:
            case 72:
                {
                alt84=1;
                }
                break;
            case 24:
                {
                int LA84_2 = input.LA(2);

                if ( (LA84_2==RULE_ID) ) {
                    alt84=2;
                }
                else if ( ((LA84_2>=RULE_INT && LA84_2<=RULE_STRING)||(LA84_2>=71 && LA84_2<=72)) ) {
                    alt84=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt84=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // InternalFortXTrans.g:4896:3: this_LiteralTup_0= ruleLiteralTup
                    {

                    			newCompositeNode(grammarAccess.getLiteralTupleAccess().getLiteralTupParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralTup_0=ruleLiteralTup();

                    state._fsp--;


                    			current = this_LiteralTup_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:4905:3: this_Qualified_1= ruleQualified
                    {

                    			newCompositeNode(grammarAccess.getLiteralTupleAccess().getQualifiedParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Qualified_1=ruleQualified();

                    state._fsp--;


                    			current = this_Qualified_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralTuple"


    // $ANTLR start "entryRuleLiteralTup"
    // InternalFortXTrans.g:4917:1: entryRuleLiteralTup returns [EObject current=null] : iv_ruleLiteralTup= ruleLiteralTup EOF ;
    public final EObject entryRuleLiteralTup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralTup = null;


        try {
            // InternalFortXTrans.g:4917:51: (iv_ruleLiteralTup= ruleLiteralTup EOF )
            // InternalFortXTrans.g:4918:2: iv_ruleLiteralTup= ruleLiteralTup EOF
            {
             newCompositeNode(grammarAccess.getLiteralTupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralTup=ruleLiteralTup();

            state._fsp--;

             current =iv_ruleLiteralTup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralTup"


    // $ANTLR start "ruleLiteralTup"
    // InternalFortXTrans.g:4924:1: ruleLiteralTup returns [EObject current=null] : (this_Literal_0= ruleLiteral | (otherlv_1= '(' this_LiteralList_2= ruleLiteralList otherlv_3= ')' ) ) ;
    public final EObject ruleLiteralTup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Literal_0 = null;

        EObject this_LiteralList_2 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:4930:2: ( (this_Literal_0= ruleLiteral | (otherlv_1= '(' this_LiteralList_2= ruleLiteralList otherlv_3= ')' ) ) )
            // InternalFortXTrans.g:4931:2: (this_Literal_0= ruleLiteral | (otherlv_1= '(' this_LiteralList_2= ruleLiteralList otherlv_3= ')' ) )
            {
            // InternalFortXTrans.g:4931:2: (this_Literal_0= ruleLiteral | (otherlv_1= '(' this_LiteralList_2= ruleLiteralList otherlv_3= ')' ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=RULE_INT && LA85_0<=RULE_STRING)||(LA85_0>=71 && LA85_0<=72)) ) {
                alt85=1;
            }
            else if ( (LA85_0==24) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalFortXTrans.g:4932:3: this_Literal_0= ruleLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralTupAccess().getLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;


                    			current = this_Literal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:4941:3: (otherlv_1= '(' this_LiteralList_2= ruleLiteralList otherlv_3= ')' )
                    {
                    // InternalFortXTrans.g:4941:3: (otherlv_1= '(' this_LiteralList_2= ruleLiteralList otherlv_3= ')' )
                    // InternalFortXTrans.g:4942:4: otherlv_1= '(' this_LiteralList_2= ruleLiteralList otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_65); 

                    				newLeafNode(otherlv_1, grammarAccess.getLiteralTupAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getLiteralTupAccess().getLiteralListParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_18);
                    this_LiteralList_2=ruleLiteralList();

                    state._fsp--;


                    				current = this_LiteralList_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getLiteralTupAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralTup"


    // $ANTLR start "entryRuleLiteralList"
    // InternalFortXTrans.g:4963:1: entryRuleLiteralList returns [EObject current=null] : iv_ruleLiteralList= ruleLiteralList EOF ;
    public final EObject entryRuleLiteralList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralList = null;


        try {
            // InternalFortXTrans.g:4963:52: (iv_ruleLiteralList= ruleLiteralList EOF )
            // InternalFortXTrans.g:4964:2: iv_ruleLiteralList= ruleLiteralList EOF
            {
             newCompositeNode(grammarAccess.getLiteralListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralList=ruleLiteralList();

            state._fsp--;

             current =iv_ruleLiteralList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralList"


    // $ANTLR start "ruleLiteralList"
    // InternalFortXTrans.g:4970:1: ruleLiteralList returns [EObject current=null] : ( ( (lv_lit_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_lit_2_0= ruleLiteral ) ) )* ) ;
    public final EObject ruleLiteralList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lit_0_0 = null;

        EObject lv_lit_2_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:4976:2: ( ( ( (lv_lit_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_lit_2_0= ruleLiteral ) ) )* ) )
            // InternalFortXTrans.g:4977:2: ( ( (lv_lit_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_lit_2_0= ruleLiteral ) ) )* )
            {
            // InternalFortXTrans.g:4977:2: ( ( (lv_lit_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_lit_2_0= ruleLiteral ) ) )* )
            // InternalFortXTrans.g:4978:3: ( (lv_lit_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_lit_2_0= ruleLiteral ) ) )*
            {
            // InternalFortXTrans.g:4978:3: ( (lv_lit_0_0= ruleLiteral ) )
            // InternalFortXTrans.g:4979:4: (lv_lit_0_0= ruleLiteral )
            {
            // InternalFortXTrans.g:4979:4: (lv_lit_0_0= ruleLiteral )
            // InternalFortXTrans.g:4980:5: lv_lit_0_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getLiteralListAccess().getLitLiteralParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_lit_0_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLiteralListRule());
            					}
            					add(
            						current,
            						"lit",
            						lv_lit_0_0,
            						"srf.transpiler.fortxtrans.FortXTrans.Literal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFortXTrans.g:4997:3: (otherlv_1= ',' ( (lv_lit_2_0= ruleLiteral ) ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==19) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalFortXTrans.g:4998:4: otherlv_1= ',' ( (lv_lit_2_0= ruleLiteral ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_65); 

            	    				newLeafNode(otherlv_1, grammarAccess.getLiteralListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalFortXTrans.g:5002:4: ( (lv_lit_2_0= ruleLiteral ) )
            	    // InternalFortXTrans.g:5003:5: (lv_lit_2_0= ruleLiteral )
            	    {
            	    // InternalFortXTrans.g:5003:5: (lv_lit_2_0= ruleLiteral )
            	    // InternalFortXTrans.g:5004:6: lv_lit_2_0= ruleLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getLiteralListAccess().getLitLiteralParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_lit_2_0=ruleLiteral();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLiteralListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"lit",
            	    							lv_lit_2_0,
            	    							"srf.transpiler.fortxtrans.FortXTrans.Literal");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralList"


    // $ANTLR start "entryRuleLiteral"
    // InternalFortXTrans.g:5026:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalFortXTrans.g:5026:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalFortXTrans.g:5027:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalFortXTrans.g:5033:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_7_0= 'true' ) ) | ( (lv_value_8_0= 'false' ) ) ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token lv_value_7_0=null;
        Token lv_value_8_0=null;


        	enterRule();

        try {
            // InternalFortXTrans.g:5039:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_7_0= 'true' ) ) | ( (lv_value_8_0= 'false' ) ) ) ) ) )
            // InternalFortXTrans.g:5040:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_7_0= 'true' ) ) | ( (lv_value_8_0= 'false' ) ) ) ) )
            {
            // InternalFortXTrans.g:5040:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_7_0= 'true' ) ) | ( (lv_value_8_0= 'false' ) ) ) ) )
            int alt88=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt88=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt88=2;
                }
                break;
            case RULE_STRING:
                {
                alt88=3;
                }
                break;
            case 71:
            case 72:
                {
                alt88=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalFortXTrans.g:5041:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalFortXTrans.g:5041:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalFortXTrans.g:5042:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalFortXTrans.g:5042:4: ()
                    // InternalFortXTrans.g:5043:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getIntConstAction_0_0(),
                    						current);
                    				

                    }

                    // InternalFortXTrans.g:5049:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalFortXTrans.g:5050:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalFortXTrans.g:5050:5: (lv_value_1_0= RULE_INT )
                    // InternalFortXTrans.g:5051:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getLiteralAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLiteralRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:5069:3: ( () ( (lv_value_3_0= RULE_FLOAT ) ) )
                    {
                    // InternalFortXTrans.g:5069:3: ( () ( (lv_value_3_0= RULE_FLOAT ) ) )
                    // InternalFortXTrans.g:5070:4: () ( (lv_value_3_0= RULE_FLOAT ) )
                    {
                    // InternalFortXTrans.g:5070:4: ()
                    // InternalFortXTrans.g:5071:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getFloatConstAction_1_0(),
                    						current);
                    				

                    }

                    // InternalFortXTrans.g:5077:4: ( (lv_value_3_0= RULE_FLOAT ) )
                    // InternalFortXTrans.g:5078:5: (lv_value_3_0= RULE_FLOAT )
                    {
                    // InternalFortXTrans.g:5078:5: (lv_value_3_0= RULE_FLOAT )
                    // InternalFortXTrans.g:5079:6: lv_value_3_0= RULE_FLOAT
                    {
                    lv_value_3_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getLiteralAccess().getValueFLOATTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLiteralRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.FLOAT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:5097:3: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    {
                    // InternalFortXTrans.g:5097:3: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    // InternalFortXTrans.g:5098:4: () ( (lv_value_5_0= RULE_STRING ) )
                    {
                    // InternalFortXTrans.g:5098:4: ()
                    // InternalFortXTrans.g:5099:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getStrConstAction_2_0(),
                    						current);
                    				

                    }

                    // InternalFortXTrans.g:5105:4: ( (lv_value_5_0= RULE_STRING ) )
                    // InternalFortXTrans.g:5106:5: (lv_value_5_0= RULE_STRING )
                    {
                    // InternalFortXTrans.g:5106:5: (lv_value_5_0= RULE_STRING )
                    // InternalFortXTrans.g:5107:6: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_5_0, grammarAccess.getLiteralAccess().getValueSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLiteralRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFortXTrans.g:5125:3: ( () ( ( (lv_value_7_0= 'true' ) ) | ( (lv_value_8_0= 'false' ) ) ) )
                    {
                    // InternalFortXTrans.g:5125:3: ( () ( ( (lv_value_7_0= 'true' ) ) | ( (lv_value_8_0= 'false' ) ) ) )
                    // InternalFortXTrans.g:5126:4: () ( ( (lv_value_7_0= 'true' ) ) | ( (lv_value_8_0= 'false' ) ) )
                    {
                    // InternalFortXTrans.g:5126:4: ()
                    // InternalFortXTrans.g:5127:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getBoolConstAction_3_0(),
                    						current);
                    				

                    }

                    // InternalFortXTrans.g:5133:4: ( ( (lv_value_7_0= 'true' ) ) | ( (lv_value_8_0= 'false' ) ) )
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==71) ) {
                        alt87=1;
                    }
                    else if ( (LA87_0==72) ) {
                        alt87=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 0, input);

                        throw nvae;
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalFortXTrans.g:5134:5: ( (lv_value_7_0= 'true' ) )
                            {
                            // InternalFortXTrans.g:5134:5: ( (lv_value_7_0= 'true' ) )
                            // InternalFortXTrans.g:5135:6: (lv_value_7_0= 'true' )
                            {
                            // InternalFortXTrans.g:5135:6: (lv_value_7_0= 'true' )
                            // InternalFortXTrans.g:5136:7: lv_value_7_0= 'true'
                            {
                            lv_value_7_0=(Token)match(input,71,FOLLOW_2); 

                            							newLeafNode(lv_value_7_0, grammarAccess.getLiteralAccess().getValueTrueKeyword_3_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLiteralRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_7_0, "true");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalFortXTrans.g:5149:5: ( (lv_value_8_0= 'false' ) )
                            {
                            // InternalFortXTrans.g:5149:5: ( (lv_value_8_0= 'false' ) )
                            // InternalFortXTrans.g:5150:6: (lv_value_8_0= 'false' )
                            {
                            // InternalFortXTrans.g:5150:6: (lv_value_8_0= 'false' )
                            // InternalFortXTrans.g:5151:7: lv_value_8_0= 'false'
                            {
                            lv_value_8_0=(Token)match(input,72,FOLLOW_2); 

                            							newLeafNode(lv_value_8_0, grammarAccess.getLiteralAccess().getValueFalseKeyword_3_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLiteralRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_8_0, "false");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleLocalVarDecl"
    // InternalFortXTrans.g:5169:1: entryRuleLocalVarDecl returns [EObject current=null] : iv_ruleLocalVarDecl= ruleLocalVarDecl EOF ;
    public final EObject entryRuleLocalVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVarDecl = null;


        try {
            // InternalFortXTrans.g:5169:53: (iv_ruleLocalVarDecl= ruleLocalVarDecl EOF )
            // InternalFortXTrans.g:5170:2: iv_ruleLocalVarDecl= ruleLocalVarDecl EOF
            {
             newCompositeNode(grammarAccess.getLocalVarDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalVarDecl=ruleLocalVarDecl();

            state._fsp--;

             current =iv_ruleLocalVarDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalVarDecl"


    // $ANTLR start "ruleLocalVarDecl"
    // InternalFortXTrans.g:5176:1: ruleLocalVarDecl returns [EObject current=null] : ( ( ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) otherlv_2= '=' ( (lv_init_3_0= ruleExpr ) ) ) | ( ( (lv_idtup_4_0= ruleQualified ) ) otherlv_5= '=' ( (lv_init_6_0= ruleExpr ) ) ) | ( ( (lv_mut_7_0= 'var' ) )? ( (lv_idtup_8_0= ruleQualified ) ) otherlv_9= ':' ( (lv_type_10_0= ruleSimpleName ) ) this_DOTS_11= RULE_DOTS otherlv_12= '=' ( (lv_init_13_0= ruleExpr ) ) ) | ( ( (lv_mut_14_0= 'var' ) )? ( (lv_idtup_15_0= ruleQualified ) ) otherlv_16= ':' ( (lv_tuptype_17_0= ruleTupleType ) ) otherlv_18= '=' ( (lv_init_19_0= ruleExpr ) ) ) ) ;
    public final EObject ruleLocalVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_mut_0_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token lv_mut_7_0=null;
        Token otherlv_9=null;
        Token this_DOTS_11=null;
        Token otherlv_12=null;
        Token lv_mut_14_0=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_vars_1_0 = null;

        EObject lv_init_3_0 = null;

        EObject lv_idtup_4_0 = null;

        EObject lv_init_6_0 = null;

        EObject lv_idtup_8_0 = null;

        EObject lv_type_10_0 = null;

        EObject lv_init_13_0 = null;

        EObject lv_idtup_15_0 = null;

        EObject lv_tuptype_17_0 = null;

        EObject lv_init_19_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:5182:2: ( ( ( ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) otherlv_2= '=' ( (lv_init_3_0= ruleExpr ) ) ) | ( ( (lv_idtup_4_0= ruleQualified ) ) otherlv_5= '=' ( (lv_init_6_0= ruleExpr ) ) ) | ( ( (lv_mut_7_0= 'var' ) )? ( (lv_idtup_8_0= ruleQualified ) ) otherlv_9= ':' ( (lv_type_10_0= ruleSimpleName ) ) this_DOTS_11= RULE_DOTS otherlv_12= '=' ( (lv_init_13_0= ruleExpr ) ) ) | ( ( (lv_mut_14_0= 'var' ) )? ( (lv_idtup_15_0= ruleQualified ) ) otherlv_16= ':' ( (lv_tuptype_17_0= ruleTupleType ) ) otherlv_18= '=' ( (lv_init_19_0= ruleExpr ) ) ) ) )
            // InternalFortXTrans.g:5183:2: ( ( ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) otherlv_2= '=' ( (lv_init_3_0= ruleExpr ) ) ) | ( ( (lv_idtup_4_0= ruleQualified ) ) otherlv_5= '=' ( (lv_init_6_0= ruleExpr ) ) ) | ( ( (lv_mut_7_0= 'var' ) )? ( (lv_idtup_8_0= ruleQualified ) ) otherlv_9= ':' ( (lv_type_10_0= ruleSimpleName ) ) this_DOTS_11= RULE_DOTS otherlv_12= '=' ( (lv_init_13_0= ruleExpr ) ) ) | ( ( (lv_mut_14_0= 'var' ) )? ( (lv_idtup_15_0= ruleQualified ) ) otherlv_16= ':' ( (lv_tuptype_17_0= ruleTupleType ) ) otherlv_18= '=' ( (lv_init_19_0= ruleExpr ) ) ) )
            {
            // InternalFortXTrans.g:5183:2: ( ( ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) otherlv_2= '=' ( (lv_init_3_0= ruleExpr ) ) ) | ( ( (lv_idtup_4_0= ruleQualified ) ) otherlv_5= '=' ( (lv_init_6_0= ruleExpr ) ) ) | ( ( (lv_mut_7_0= 'var' ) )? ( (lv_idtup_8_0= ruleQualified ) ) otherlv_9= ':' ( (lv_type_10_0= ruleSimpleName ) ) this_DOTS_11= RULE_DOTS otherlv_12= '=' ( (lv_init_13_0= ruleExpr ) ) ) | ( ( (lv_mut_14_0= 'var' ) )? ( (lv_idtup_15_0= ruleQualified ) ) otherlv_16= ':' ( (lv_tuptype_17_0= ruleTupleType ) ) otherlv_18= '=' ( (lv_init_19_0= ruleExpr ) ) ) )
            int alt92=4;
            alt92 = dfa92.predict(input);
            switch (alt92) {
                case 1 :
                    // InternalFortXTrans.g:5184:3: ( ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) otherlv_2= '=' ( (lv_init_3_0= ruleExpr ) ) )
                    {
                    // InternalFortXTrans.g:5184:3: ( ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) otherlv_2= '=' ( (lv_init_3_0= ruleExpr ) ) )
                    // InternalFortXTrans.g:5185:4: ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) otherlv_2= '=' ( (lv_init_3_0= ruleExpr ) )
                    {
                    // InternalFortXTrans.g:5185:4: ( (lv_mut_0_0= 'var' ) )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==70) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalFortXTrans.g:5186:5: (lv_mut_0_0= 'var' )
                            {
                            // InternalFortXTrans.g:5186:5: (lv_mut_0_0= 'var' )
                            // InternalFortXTrans.g:5187:6: lv_mut_0_0= 'var'
                            {
                            lv_mut_0_0=(Token)match(input,70,FOLLOW_63); 

                            						newLeafNode(lv_mut_0_0, grammarAccess.getLocalVarDeclAccess().getMutVarKeyword_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getLocalVarDeclRule());
                            						}
                            						setWithLastConsumed(current, "mut", lv_mut_0_0, "var");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:5199:4: ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) )
                    // InternalFortXTrans.g:5200:5: (lv_vars_1_0= ruleNoNewlineVarWTypes )
                    {
                    // InternalFortXTrans.g:5200:5: (lv_vars_1_0= ruleNoNewlineVarWTypes )
                    // InternalFortXTrans.g:5201:6: lv_vars_1_0= ruleNoNewlineVarWTypes
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getVarsNoNewlineVarWTypesParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_vars_1_0=ruleNoNewlineVarWTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"vars",
                    							lv_vars_1_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.NoNewlineVarWTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,31,FOLLOW_29); 

                    				newLeafNode(otherlv_2, grammarAccess.getLocalVarDeclAccess().getEqualsSignKeyword_0_2());
                    			
                    // InternalFortXTrans.g:5222:4: ( (lv_init_3_0= ruleExpr ) )
                    // InternalFortXTrans.g:5223:5: (lv_init_3_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:5223:5: (lv_init_3_0= ruleExpr )
                    // InternalFortXTrans.g:5224:6: lv_init_3_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getInitExprParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_init_3_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"init",
                    							lv_init_3_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:5243:3: ( ( (lv_idtup_4_0= ruleQualified ) ) otherlv_5= '=' ( (lv_init_6_0= ruleExpr ) ) )
                    {
                    // InternalFortXTrans.g:5243:3: ( ( (lv_idtup_4_0= ruleQualified ) ) otherlv_5= '=' ( (lv_init_6_0= ruleExpr ) ) )
                    // InternalFortXTrans.g:5244:4: ( (lv_idtup_4_0= ruleQualified ) ) otherlv_5= '=' ( (lv_init_6_0= ruleExpr ) )
                    {
                    // InternalFortXTrans.g:5244:4: ( (lv_idtup_4_0= ruleQualified ) )
                    // InternalFortXTrans.g:5245:5: (lv_idtup_4_0= ruleQualified )
                    {
                    // InternalFortXTrans.g:5245:5: (lv_idtup_4_0= ruleQualified )
                    // InternalFortXTrans.g:5246:6: lv_idtup_4_0= ruleQualified
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getIdtupQualifiedParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_idtup_4_0=ruleQualified();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"idtup",
                    							lv_idtup_4_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Qualified");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,31,FOLLOW_29); 

                    				newLeafNode(otherlv_5, grammarAccess.getLocalVarDeclAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalFortXTrans.g:5267:4: ( (lv_init_6_0= ruleExpr ) )
                    // InternalFortXTrans.g:5268:5: (lv_init_6_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:5268:5: (lv_init_6_0= ruleExpr )
                    // InternalFortXTrans.g:5269:6: lv_init_6_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getInitExprParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_init_6_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"init",
                    							lv_init_6_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:5288:3: ( ( (lv_mut_7_0= 'var' ) )? ( (lv_idtup_8_0= ruleQualified ) ) otherlv_9= ':' ( (lv_type_10_0= ruleSimpleName ) ) this_DOTS_11= RULE_DOTS otherlv_12= '=' ( (lv_init_13_0= ruleExpr ) ) )
                    {
                    // InternalFortXTrans.g:5288:3: ( ( (lv_mut_7_0= 'var' ) )? ( (lv_idtup_8_0= ruleQualified ) ) otherlv_9= ':' ( (lv_type_10_0= ruleSimpleName ) ) this_DOTS_11= RULE_DOTS otherlv_12= '=' ( (lv_init_13_0= ruleExpr ) ) )
                    // InternalFortXTrans.g:5289:4: ( (lv_mut_7_0= 'var' ) )? ( (lv_idtup_8_0= ruleQualified ) ) otherlv_9= ':' ( (lv_type_10_0= ruleSimpleName ) ) this_DOTS_11= RULE_DOTS otherlv_12= '=' ( (lv_init_13_0= ruleExpr ) )
                    {
                    // InternalFortXTrans.g:5289:4: ( (lv_mut_7_0= 'var' ) )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==70) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // InternalFortXTrans.g:5290:5: (lv_mut_7_0= 'var' )
                            {
                            // InternalFortXTrans.g:5290:5: (lv_mut_7_0= 'var' )
                            // InternalFortXTrans.g:5291:6: lv_mut_7_0= 'var'
                            {
                            lv_mut_7_0=(Token)match(input,70,FOLLOW_50); 

                            						newLeafNode(lv_mut_7_0, grammarAccess.getLocalVarDeclAccess().getMutVarKeyword_2_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getLocalVarDeclRule());
                            						}
                            						setWithLastConsumed(current, "mut", lv_mut_7_0, "var");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:5303:4: ( (lv_idtup_8_0= ruleQualified ) )
                    // InternalFortXTrans.g:5304:5: (lv_idtup_8_0= ruleQualified )
                    {
                    // InternalFortXTrans.g:5304:5: (lv_idtup_8_0= ruleQualified )
                    // InternalFortXTrans.g:5305:6: lv_idtup_8_0= ruleQualified
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getIdtupQualifiedParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_idtup_8_0=ruleQualified();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"idtup",
                    							lv_idtup_8_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Qualified");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getLocalVarDeclAccess().getColonKeyword_2_2());
                    			
                    // InternalFortXTrans.g:5326:4: ( (lv_type_10_0= ruleSimpleName ) )
                    // InternalFortXTrans.g:5327:5: (lv_type_10_0= ruleSimpleName )
                    {
                    // InternalFortXTrans.g:5327:5: (lv_type_10_0= ruleSimpleName )
                    // InternalFortXTrans.g:5328:6: lv_type_10_0= ruleSimpleName
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getTypeSimpleNameParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_type_10_0=ruleSimpleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_10_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.SimpleName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_DOTS_11=(Token)match(input,RULE_DOTS,FOLLOW_64); 

                    				newLeafNode(this_DOTS_11, grammarAccess.getLocalVarDeclAccess().getDOTSTerminalRuleCall_2_4());
                    			
                    otherlv_12=(Token)match(input,31,FOLLOW_29); 

                    				newLeafNode(otherlv_12, grammarAccess.getLocalVarDeclAccess().getEqualsSignKeyword_2_5());
                    			
                    // InternalFortXTrans.g:5353:4: ( (lv_init_13_0= ruleExpr ) )
                    // InternalFortXTrans.g:5354:5: (lv_init_13_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:5354:5: (lv_init_13_0= ruleExpr )
                    // InternalFortXTrans.g:5355:6: lv_init_13_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getInitExprParserRuleCall_2_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_init_13_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"init",
                    							lv_init_13_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFortXTrans.g:5374:3: ( ( (lv_mut_14_0= 'var' ) )? ( (lv_idtup_15_0= ruleQualified ) ) otherlv_16= ':' ( (lv_tuptype_17_0= ruleTupleType ) ) otherlv_18= '=' ( (lv_init_19_0= ruleExpr ) ) )
                    {
                    // InternalFortXTrans.g:5374:3: ( ( (lv_mut_14_0= 'var' ) )? ( (lv_idtup_15_0= ruleQualified ) ) otherlv_16= ':' ( (lv_tuptype_17_0= ruleTupleType ) ) otherlv_18= '=' ( (lv_init_19_0= ruleExpr ) ) )
                    // InternalFortXTrans.g:5375:4: ( (lv_mut_14_0= 'var' ) )? ( (lv_idtup_15_0= ruleQualified ) ) otherlv_16= ':' ( (lv_tuptype_17_0= ruleTupleType ) ) otherlv_18= '=' ( (lv_init_19_0= ruleExpr ) )
                    {
                    // InternalFortXTrans.g:5375:4: ( (lv_mut_14_0= 'var' ) )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==70) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // InternalFortXTrans.g:5376:5: (lv_mut_14_0= 'var' )
                            {
                            // InternalFortXTrans.g:5376:5: (lv_mut_14_0= 'var' )
                            // InternalFortXTrans.g:5377:6: lv_mut_14_0= 'var'
                            {
                            lv_mut_14_0=(Token)match(input,70,FOLLOW_50); 

                            						newLeafNode(lv_mut_14_0, grammarAccess.getLocalVarDeclAccess().getMutVarKeyword_3_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getLocalVarDeclRule());
                            						}
                            						setWithLastConsumed(current, "mut", lv_mut_14_0, "var");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:5389:4: ( (lv_idtup_15_0= ruleQualified ) )
                    // InternalFortXTrans.g:5390:5: (lv_idtup_15_0= ruleQualified )
                    {
                    // InternalFortXTrans.g:5390:5: (lv_idtup_15_0= ruleQualified )
                    // InternalFortXTrans.g:5391:6: lv_idtup_15_0= ruleQualified
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getIdtupQualifiedParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_idtup_15_0=ruleQualified();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"idtup",
                    							lv_idtup_15_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Qualified");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_16, grammarAccess.getLocalVarDeclAccess().getColonKeyword_3_2());
                    			
                    // InternalFortXTrans.g:5412:4: ( (lv_tuptype_17_0= ruleTupleType ) )
                    // InternalFortXTrans.g:5413:5: (lv_tuptype_17_0= ruleTupleType )
                    {
                    // InternalFortXTrans.g:5413:5: (lv_tuptype_17_0= ruleTupleType )
                    // InternalFortXTrans.g:5414:6: lv_tuptype_17_0= ruleTupleType
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getTuptypeTupleTypeParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_tuptype_17_0=ruleTupleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"tuptype",
                    							lv_tuptype_17_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.TupleType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,31,FOLLOW_29); 

                    				newLeafNode(otherlv_18, grammarAccess.getLocalVarDeclAccess().getEqualsSignKeyword_3_4());
                    			
                    // InternalFortXTrans.g:5435:4: ( (lv_init_19_0= ruleExpr ) )
                    // InternalFortXTrans.g:5436:5: (lv_init_19_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:5436:5: (lv_init_19_0= ruleExpr )
                    // InternalFortXTrans.g:5437:6: lv_init_19_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getInitExprParserRuleCall_3_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_init_19_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"init",
                    							lv_init_19_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalVarDecl"

    // Delegated rules


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA92 dfa92 = new DFA92(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\uffff\1\4\1\uffff\1\4\2\uffff\1\4\3\uffff";
    static final String dfa_3s = "\1\4\1\5\1\4\1\16\1\uffff\1\4\1\5\1\22\2\uffff";
    static final String dfa_4s = "\1\4\1\27\1\22\1\27\1\uffff\1\5\1\27\1\22\2\uffff";
    static final String dfa_5s = "\4\uffff\1\3\3\uffff\1\2\1\1";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\3\10\uffff\1\4\1\uffff\2\4\3\uffff\1\2\1\uffff\1\4",
            "\1\6\15\uffff\1\5",
            "\1\4\1\uffff\2\4\3\uffff\1\7\1\uffff\1\4",
            "",
            "\1\10\1\11",
            "\1\3\10\uffff\1\4\1\uffff\2\4\3\uffff\1\2\1\uffff\1\4",
            "\1\5",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "517:2: ( ( ( (lv_impname_0_0= ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= '{' this_DOTS_3= RULE_DOTS otherlv_4= '}' ( ( (lv_except_5_0= 'except' ) ) ( (lv_simp_6_0= ruleSimpleNames ) ) )? ) | ( ( (lv_impname_7_0= ruleQualifiedName ) ) otherlv_8= '.' otherlv_9= '{' ( (lv_simpList_10_0= ruleAliasedSimpleName ) ) (otherlv_11= ',' ( (lv_simpList_12_0= ruleAliasedSimpleName ) ) )* ( ( (lv_comma_13_0= ',' ) ) ( (lv_dots_14_0= RULE_DOTS ) ) )? otherlv_15= '}' ) | ( ( (lv_impname_16_0= ruleQualifiedName ) ) (otherlv_17= 'as' ( (lv_asname_18_0= RULE_ID ) ) )? ) )";
        }
    }
    static final String dfa_8s = "\24\uffff";
    static final String dfa_9s = "\4\uffff\1\5\4\uffff\1\5\3\uffff\2\5\5\uffff";
    static final String dfa_10s = "\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff\1\5\1\uffff\3\4\1\23\3\4\2\5\1\4\1\23\1\5";
    static final String dfa_11s = "\1\110\1\uffff\1\110\1\uffff\1\110\1\uffff\1\65\1\uffff\1\4\1\110\1\4\1\65\3\110\2\65\1\4\2\65";
    static final String dfa_12s = "\1\uffff\1\1\1\uffff\1\3\1\uffff\1\4\1\uffff\1\2\14\uffff";
    static final String dfa_13s = "\24\uffff}>";
    static final String[] dfa_14s = {
            "\1\4\1\uffff\3\5\17\uffff\1\2\4\uffff\1\1\22\uffff\1\5\7\uffff\1\5\4\1\7\uffff\2\1\1\3\2\5",
            "",
            "\1\6\1\uffff\3\5\17\uffff\1\5\7\uffff\1\7\17\uffff\1\5\7\uffff\1\5\16\uffff\2\5",
            "",
            "\1\5\1\11\3\5\5\uffff\1\5\6\uffff\1\10\1\uffff\2\5\1\uffff\1\3\4\5\1\3\1\uffff\25\5\2\uffff\5\5\1\uffff\2\5\3\uffff\6\5",
            "",
            "\1\13\15\uffff\1\14\1\uffff\1\12\1\uffff\2\5\1\15\1\3\6\uffff\25\5",
            "",
            "\1\16",
            "\1\5\1\uffff\3\5\5\uffff\1\5\10\uffff\2\5\1\uffff\1\3\4\5\1\3\1\uffff\25\5\2\uffff\5\5\1\uffff\2\5\3\uffff\6\5",
            "\1\17",
            "\1\14\3\uffff\2\5\1\15\1\3\6\uffff\25\5",
            "\1\20\1\uffff\3\5\17\uffff\1\5\27\uffff\1\5\7\uffff\1\5\16\uffff\2\5",
            "\1\5\1\uffff\3\5\5\uffff\1\5\10\uffff\2\5\1\uffff\1\3\4\5\1\3\1\uffff\25\5\2\uffff\5\5\1\uffff\2\5\3\uffff\6\5",
            "\1\5\1\11\3\5\5\uffff\1\5\6\uffff\1\10\1\uffff\2\5\1\uffff\1\3\4\5\1\3\1\uffff\25\5\2\uffff\5\5\1\uffff\2\5\3\uffff\6\5",
            "\1\13\15\uffff\1\14\1\uffff\1\12\1\uffff\2\5\1\15\1\3\6\uffff\25\5",
            "\1\22\15\uffff\1\14\1\uffff\1\21\1\uffff\2\5\1\15\7\uffff\25\5",
            "\1\23",
            "\1\14\3\uffff\2\5\1\15\7\uffff\25\5",
            "\1\22\15\uffff\1\14\1\uffff\1\21\1\uffff\2\5\1\15\7\uffff\25\5"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1959:2: ( ( (lv_front_0_0= ruleStmnt ) ) | (otherlv_1= '(' otherlv_2= '|' ( (lv_delims_3_0= ruleStmntList ) ) otherlv_4= '|' otherlv_5= ')' ) | ( (lv_locVar_6_0= ruleLocalVarDecl ) ) | ( (lv_exp_7_0= ruleExpr ) ) )";
        }
    }
    static final String dfa_15s = "\1\1\11\uffff";
    static final String dfa_16s = "\1\4\11\uffff";
    static final String dfa_17s = "\1\110\11\uffff";
    static final String dfa_18s = "\1\uffff\1\2\10\1";
    static final String[] dfa_19s = {
            "\1\1\1\uffff\3\1\5\uffff\1\1\4\uffff\1\1\3\uffff\3\1\1\uffff\4\1\1\uffff\7\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\5\1\1\uffff\13\1\2\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_1;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_6;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "()* loopback of 2451:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' | lv_op_2_5= 'LT' | lv_op_2_6= 'GT' | lv_op_2_7= 'LE' | lv_op_2_8= 'GE' ) ) ) ( (lv_right_3_0= ruleAddExpr ) ) )*";
        }
    }
    static final String dfa_20s = "\34\uffff";
    static final String dfa_21s = "\1\4\1\uffff\1\4\2\uffff\5\23\1\uffff\1\5\1\4\1\uffff\1\4\1\23\1\4\1\uffff\5\23\2\5\1\4\1\23\1\5";
    static final String dfa_22s = "\1\110\1\uffff\1\110\2\uffff\5\65\1\uffff\1\65\1\110\1\uffff\1\4\1\65\1\110\1\uffff\7\65\1\4\2\65";
    static final String dfa_23s = "\1\uffff\1\1\1\uffff\1\2\1\3\5\uffff\1\4\2\uffff\1\1\3\uffff\1\1\12\uffff";
    static final String dfa_24s = "\34\uffff}>";
    static final String[] dfa_25s = {
            "\1\1\1\uffff\3\1\17\uffff\1\2\27\uffff\1\4\7\uffff\1\3\16\uffff\2\1",
            "",
            "\1\13\1\uffff\1\5\1\6\1\7\17\uffff\1\12\27\uffff\1\12\7\uffff\1\12\16\uffff\1\10\1\11",
            "",
            "",
            "\1\14\3\uffff\2\12\1\15\7\uffff\25\12",
            "\1\14\3\uffff\2\12\1\15\7\uffff\25\12",
            "\1\14\3\uffff\2\12\1\15\7\uffff\25\12",
            "\1\14\3\uffff\2\12\1\15\7\uffff\25\12",
            "\1\14\3\uffff\2\12\1\15\7\uffff\25\12",
            "",
            "\1\17\15\uffff\1\20\1\uffff\1\16\1\uffff\2\12\1\21\7\uffff\25\12",
            "\1\12\1\uffff\1\22\1\23\1\24\17\uffff\1\12\27\uffff\1\12\7\uffff\1\12\16\uffff\1\25\1\26",
            "",
            "\1\27",
            "\1\20\3\uffff\2\12\1\21\7\uffff\25\12",
            "\1\30\1\uffff\3\12\17\uffff\1\12\27\uffff\1\12\7\uffff\1\12\16\uffff\2\12",
            "",
            "\1\14\3\uffff\2\12\1\15\7\uffff\25\12",
            "\1\14\3\uffff\2\12\1\15\7\uffff\25\12",
            "\1\14\3\uffff\2\12\1\15\7\uffff\25\12",
            "\1\14\3\uffff\2\12\1\15\7\uffff\25\12",
            "\1\14\3\uffff\2\12\1\15\7\uffff\25\12",
            "\1\17\15\uffff\1\20\1\uffff\1\16\1\uffff\2\12\1\21\7\uffff\25\12",
            "\1\32\15\uffff\1\20\1\uffff\1\31\1\uffff\2\12\1\21\7\uffff\25\12",
            "\1\33",
            "\1\20\3\uffff\2\12\1\21\7\uffff\25\12",
            "\1\32\15\uffff\1\20\1\uffff\1\31\1\uffff\2\12\1\21\7\uffff\25\12"
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "2895:2: ( (this_LiteralTuple_0= ruleLiteralTuple ( () ( ( (lv_op_2_0= ':=' ) ) ( (lv_right_3_0= ruleExpr ) ) ) )? ( () otherlv_5= '(' ( (lv_right_6_0= ruleExprList ) )? otherlv_7= ')' )? ( () otherlv_9= '[' otherlv_10= '\\\\' ( (lv_type_11_0= ruleSimpleName ) ) otherlv_12= ',' ( (lv_sizes_13_0= ruleExprList ) )? otherlv_14= '\\\\' otherlv_15= ']' otherlv_16= '(' ( (lv_filler_17_0= ruleQualifiedName ) ) otherlv_18= ')' )? ) | ( () otherlv_20= '!' ( (lv_expression_21_0= rulePrimary ) ) ) | ( () otherlv_23= '-' ( (lv_expression_24_0= rulePrimary ) ) ) | ( () otherlv_26= '(' ( (lv_exp_27_0= ruleExprList ) ) otherlv_28= ')' ) )";
        }
    }
    static final String dfa_26s = "\23\uffff";
    static final String dfa_27s = "\1\4\1\5\2\4\1\100\1\4\2\5\2\uffff\1\4\1\23\1\4\1\100\2\5\1\4\1\23\1\5";
    static final String dfa_28s = "\1\30\1\100\2\4\1\100\1\110\1\31\1\100\2\uffff\1\4\1\31\1\4\1\100\2\31\1\4\2\31";
    static final String dfa_29s = "\10\uffff\1\2\1\1\11\uffff";
    static final String dfa_30s = "\23\uffff}>";
    static final String[] dfa_31s = {
            "\1\1\23\uffff\1\2",
            "\1\4\17\uffff\1\3\52\uffff\1\5",
            "\1\6",
            "\1\7",
            "\1\5",
            "\1\11\1\uffff\3\11\17\uffff\1\11\27\uffff\1\11\7\uffff\1\11\10\uffff\1\10\5\uffff\2\11",
            "\1\13\15\uffff\1\14\1\uffff\1\12\3\uffff\1\15",
            "\1\4\17\uffff\1\3\52\uffff\1\5",
            "",
            "",
            "\1\16",
            "\1\14\5\uffff\1\15",
            "\1\17",
            "\1\5",
            "\1\13\15\uffff\1\14\1\uffff\1\12\3\uffff\1\15",
            "\1\21\15\uffff\1\14\1\uffff\1\20\3\uffff\1\15",
            "\1\22",
            "\1\14\5\uffff\1\15",
            "\1\21\15\uffff\1\14\1\uffff\1\20\3\uffff\1\15"
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = dfa_26;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "3822:2: ( ( ( (lv_idtup_0_0= ruleQualified ) ) otherlv_1= '<-' ( (lv_g_2_0= ruleGenSource ) ) ) | ( ( (lv_idtup_3_0= ruleQualified ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_g_7_0= ruleGenSource ) ) otherlv_8= ')' ) )";
        }
    }
    static final String dfa_32s = "\22\uffff";
    static final String dfa_33s = "\1\uffff\1\3\3\uffff\1\3\2\uffff\1\3\3\uffff\1\3\5\uffff";
    static final String dfa_34s = "\1\4\1\5\1\4\1\uffff\1\4\1\23\1\uffff\2\5\1\4\1\23\1\4\1\23\2\5\1\4\1\23\1\5";
    static final String dfa_35s = "\1\110\1\105\1\110\1\uffff\1\4\1\105\1\uffff\1\65\1\105\1\4\1\65\1\110\1\105\2\65\1\4\2\65";
    static final String dfa_36s = "\3\uffff\1\2\2\uffff\1\1\13\uffff";
    static final String dfa_37s = "\22\uffff}>";
    static final String[] dfa_38s = {
            "\1\1\1\uffff\3\3\17\uffff\1\2\27\uffff\1\3\7\uffff\1\3\16\uffff\2\3",
            "\1\5\15\uffff\1\3\1\uffff\1\4\1\uffff\2\3\4\uffff\1\3\3\uffff\25\3\12\uffff\1\6\3\uffff\2\3",
            "\1\7\1\uffff\3\3\17\uffff\1\3\27\uffff\1\3\7\uffff\1\3\16\uffff\2\3",
            "",
            "\1\10",
            "\1\3\3\uffff\2\3\4\uffff\1\3\3\uffff\25\3\12\uffff\1\6\3\uffff\2\3",
            "",
            "\1\12\15\uffff\1\13\1\uffff\1\11\1\uffff\2\3\1\14\7\uffff\25\3",
            "\1\5\15\uffff\1\3\1\uffff\1\4\1\uffff\2\3\4\uffff\1\3\3\uffff\25\3\12\uffff\1\6\3\uffff\2\3",
            "\1\15",
            "\1\13\3\uffff\2\3\1\14\7\uffff\25\3",
            "\1\16\1\uffff\3\3\17\uffff\1\3\27\uffff\1\3\7\uffff\1\3\16\uffff\2\3",
            "\1\3\3\uffff\2\3\4\uffff\1\3\3\uffff\25\3\12\uffff\1\6\3\uffff\2\3",
            "\1\12\15\uffff\1\13\1\uffff\1\11\1\uffff\2\3\1\14\7\uffff\25\3",
            "\1\20\15\uffff\1\13\1\uffff\1\17\1\uffff\2\3\1\14\7\uffff\25\3",
            "\1\21",
            "\1\13\3\uffff\2\3\1\14\7\uffff\25\3",
            "\1\20\15\uffff\1\13\1\uffff\1\17\1\uffff\2\3\1\14\7\uffff\25\3"
    };

    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = dfa_32;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "4011:2: ( ( (lv_binding_0_0= ruleBinding ) ) | ( (lv_expr_1_0= ruleExpr ) ) )";
        }
    }
    static final String dfa_39s = "\50\uffff";
    static final String dfa_40s = "\20\uffff\1\24\27\uffff";
    static final String dfa_41s = "\3\4\1\5\1\4\1\5\2\4\1\32\1\4\1\uffff\1\5\1\4\1\32\2\5\1\4\1\uffff\1\4\1\23\1\uffff\1\4\1\32\1\5\1\4\1\23\1\4\1\32\1\uffff\2\5\1\4\2\5\1\4\1\23\1\4\1\23\2\5";
    static final String dfa_42s = "\2\106\1\30\1\37\1\4\1\32\2\4\1\37\1\30\1\uffff\1\32\1\4\2\32\1\37\1\106\1\uffff\1\4\1\32\1\uffff\1\4\1\37\1\32\1\4\1\32\1\4\1\32\1\uffff\1\32\1\31\1\30\1\32\1\31\1\4\1\31\1\4\3\31";
    static final String dfa_43s = "\12\uffff\1\2\6\uffff\1\4\2\uffff\1\1\7\uffff\1\3\13\uffff";
    static final String dfa_44s = "\50\uffff}>";
    static final String[] dfa_45s = {
            "\1\3\23\uffff\1\4\2\uffff\1\1\52\uffff\1\2",
            "\1\3\23\uffff\1\4\55\uffff\1\2",
            "\1\5\23\uffff\1\6",
            "\1\10\17\uffff\1\7\4\uffff\1\11\4\uffff\1\12",
            "\1\13",
            "\1\15\17\uffff\1\14\4\uffff\1\11",
            "\1\16",
            "\1\17",
            "\1\11\4\uffff\1\12",
            "\1\20\23\uffff\1\21",
            "",
            "\1\23\15\uffff\1\25\1\uffff\1\22\3\uffff\1\26\1\24",
            "\1\27",
            "\1\11",
            "\1\31\15\uffff\1\32\1\uffff\1\30\3\uffff\1\33\1\24",
            "\1\10\17\uffff\1\7\4\uffff\1\11\4\uffff\1\12",
            "\1\24\1\34\10\uffff\1\24\11\uffff\1\24\2\uffff\5\24\25\uffff\1\24\20\uffff\1\24",
            "",
            "\1\35",
            "\1\25\5\uffff\1\26\1\24",
            "",
            "\1\36",
            "\1\37\4\uffff\1\12",
            "\1\15\17\uffff\1\14\4\uffff\1\11",
            "\1\40",
            "\1\32\5\uffff\1\33\1\24",
            "\1\41",
            "\1\37",
            "",
            "\1\23\15\uffff\1\25\1\uffff\1\22\3\uffff\1\26\1\24",
            "\1\43\15\uffff\1\25\1\uffff\1\42\3\uffff\1\26",
            "\1\34\23\uffff\1\21",
            "\1\31\15\uffff\1\32\1\uffff\1\30\3\uffff\1\33\1\24",
            "\1\45\15\uffff\1\32\1\uffff\1\44\3\uffff\1\33",
            "\1\46",
            "\1\25\5\uffff\1\26",
            "\1\47",
            "\1\32\5\uffff\1\33",
            "\1\43\15\uffff\1\25\1\uffff\1\42\3\uffff\1\26",
            "\1\45\15\uffff\1\32\1\uffff\1\44\3\uffff\1\33"
    };

    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[][] dfa_45 = unpackEncodedStringArray(dfa_45s);

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = dfa_39;
            this.eof = dfa_40;
            this.min = dfa_41;
            this.max = dfa_42;
            this.accept = dfa_43;
            this.special = dfa_44;
            this.transition = dfa_45;
        }
        public String getDescription() {
            return "4362:2: ( ( ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpr ) ) )? ) | ( ( (lv_pri_5_0= 'private' ) )? ( (lv_idtup_6_0= ruleQualified ) ) otherlv_7= '=' ( (lv_init_8_0= ruleExpr ) )? ) | ( ( (lv_pri_9_0= 'private' ) )? ( (lv_mut_10_0= 'var' ) )? ( (lv_idtup_11_0= ruleQualified ) ) otherlv_12= ':' ( (lv_type_13_0= ruleSimpleName ) ) this_DOTS_14= RULE_DOTS (otherlv_15= '=' ( (lv_init_16_0= ruleExpr ) ) )? ) | ( ( (lv_pri_17_0= 'private' ) )? ( (lv_mut_18_0= 'var' ) )? ( (lv_idtup_19_0= ruleQualified ) ) otherlv_20= ':' ( (lv_tuptype_21_0= ruleTupleType ) ) (otherlv_22= '=' ( (lv_init_23_0= ruleExpr ) ) )? ) )";
        }
    }
    static final String dfa_46s = "\1\4\2\uffff\1\1\3\uffff\1\1\5\uffff\2\20\31\uffff";
    static final String dfa_47s = "\1\4\1\uffff\2\4\1\uffff\1\5\5\4\1\23\3\4\1\5\1\uffff\1\4\1\32\1\4\2\5\1\4\1\23\1\4\1\5\1\uffff\1\4\1\23\1\5\1\23\1\5\1\4\1\5\1\4\1\32\1\4\1\5\1\23\1\uffff";
    static final String dfa_48s = "\1\110\1\uffff\1\110\1\106\1\uffff\1\65\1\4\1\106\1\110\1\37\1\4\1\65\1\110\2\106\1\65\1\uffff\1\4\1\37\1\30\2\65\1\4\1\65\1\4\1\37\1\uffff\1\4\2\65\1\31\1\65\1\4\1\32\1\4\1\32\1\4\1\32\1\31\1\uffff";
    static final String dfa_49s = "\1\uffff\1\1\2\uffff\1\2\13\uffff\1\1\11\uffff\1\1\14\uffff\1\1";
    static final String[] dfa_50s = {
            "\1\3\1\uffff\3\1\5\uffff\1\4\11\uffff\1\2\2\uffff\4\4\21\uffff\1\1\7\uffff\1\1\15\uffff\1\4\2\1",
            "",
            "\1\5\1\uffff\3\1\17\uffff\1\1\27\uffff\1\1\7\uffff\1\1\16\uffff\2\1",
            "\1\11\1\7\10\uffff\1\1\6\uffff\1\6\1\uffff\1\1\1\10\1\uffff\1\4\4\1\1\4\1\uffff\25\1\20\uffff\1\1",
            "",
            "\1\13\15\uffff\1\14\1\uffff\1\12\1\uffff\2\1\1\15\1\4\6\uffff\25\1",
            "\1\16",
            "\1\1\11\uffff\1\1\10\uffff\2\1\1\uffff\1\4\4\1\1\4\1\uffff\25\1\20\uffff\1\1",
            "\1\17\1\uffff\3\20\17\uffff\2\20\26\uffff\1\20\7\uffff\1\20\16\uffff\2\20",
            "\1\20\1\22\17\uffff\1\21\2\uffff\1\20\1\uffff\1\23\4\uffff\1\20",
            "\1\24",
            "\1\14\3\uffff\2\20\1\15\1\4\6\uffff\25\20",
            "\1\25\1\uffff\3\20\17\uffff\1\20\27\uffff\1\20\7\uffff\1\20\16\uffff\2\20",
            "\1\20\11\uffff\1\20\10\uffff\2\20\1\uffff\1\4\4\20\1\4\1\uffff\25\20\20\uffff\1\20",
            "\1\20\1\7\10\uffff\1\20\6\uffff\1\6\1\uffff\2\20\1\uffff\1\4\4\20\1\4\1\uffff\25\20\20\uffff\1\20",
            "\1\27\15\uffff\1\20\1\uffff\1\26\1\uffff\3\20\1\30\6\uffff\25\20",
            "",
            "\1\31",
            "\1\23\4\uffff\1\20",
            "\1\32\23\uffff\1\20",
            "\1\13\15\uffff\1\14\1\uffff\1\12\1\uffff\2\32\1\15\1\4\6\uffff\25\32",
            "\1\34\15\uffff\1\14\1\uffff\1\33\1\uffff\2\32\1\15\7\uffff\25\32",
            "\1\35",
            "\1\32\3\uffff\3\32\1\30\6\uffff\25\32",
            "\1\36",
            "\1\22\17\uffff\1\21\4\uffff\1\23\4\uffff\1\32",
            "",
            "\1\37",
            "\1\14\3\uffff\2\32\1\15\7\uffff\25\32",
            "\1\27\15\uffff\1\32\1\uffff\1\26\1\uffff\3\32\1\30\6\uffff\25\32",
            "\1\40\5\uffff\1\4",
            "\1\34\15\uffff\1\14\1\uffff\1\33\1\uffff\2\32\1\15\7\uffff\25\32",
            "\1\41",
            "\1\43\17\uffff\1\42\4\uffff\1\44",
            "\1\45",
            "\1\44",
            "\1\46",
            "\1\43\17\uffff\1\42\4\uffff\1\44",
            "\1\40\5\uffff\1\47",
            ""
    };
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[][] dfa_50 = unpackEncodedStringArray(dfa_50s);

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = dfa_39;
            this.eof = dfa_46;
            this.min = dfa_47;
            this.max = dfa_48;
            this.accept = dfa_49;
            this.special = dfa_44;
            this.transition = dfa_50;
        }
        public String getDescription() {
            return "4476:4: ( (lv_init_8_0= ruleExpr ) )?";
        }
    }
    static final String dfa_51s = "\47\uffff";
    static final String dfa_52s = "\2\4\1\5\1\4\1\5\2\4\1\32\1\uffff\1\4\1\5\1\4\1\32\3\5\1\uffff\1\4\1\23\1\4\1\32\1\uffff\1\5\1\4\1\23\1\4\1\32\1\uffff\2\5\1\4\2\5\1\4\1\23\1\4\1\23\2\5";
    static final String dfa_53s = "\1\106\1\30\1\37\1\4\1\32\2\4\1\37\1\uffff\1\30\1\32\1\4\2\32\1\37\1\65\1\uffff\1\4\1\32\1\4\1\37\1\uffff\1\32\1\4\1\32\1\4\1\32\1\uffff\1\32\1\31\1\30\1\32\1\31\1\4\1\31\1\4\3\31";
    static final String dfa_54s = "\10\uffff\1\2\7\uffff\1\4\4\uffff\1\1\5\uffff\1\3\13\uffff";
    static final String dfa_55s = "\47\uffff}>";
    static final String[] dfa_56s = {
            "\1\2\23\uffff\1\3\55\uffff\1\1",
            "\1\4\23\uffff\1\5",
            "\1\7\17\uffff\1\6\4\uffff\1\11\4\uffff\1\10",
            "\1\12",
            "\1\14\17\uffff\1\13\4\uffff\1\11",
            "\1\15",
            "\1\16",
            "\1\11\4\uffff\1\10",
            "",
            "\1\17\23\uffff\1\20",
            "\1\22\15\uffff\1\23\1\uffff\1\21\3\uffff\1\24\1\25",
            "\1\26",
            "\1\11",
            "\1\30\15\uffff\1\31\1\uffff\1\27\3\uffff\1\32\1\25",
            "\1\7\17\uffff\1\6\4\uffff\1\11\4\uffff\1\10",
            "\1\33\31\uffff\1\25\25\uffff\1\25",
            "",
            "\1\34",
            "\1\23\5\uffff\1\24\1\25",
            "\1\35",
            "\1\36\4\uffff\1\10",
            "",
            "\1\14\17\uffff\1\13\4\uffff\1\11",
            "\1\37",
            "\1\31\5\uffff\1\32\1\25",
            "\1\40",
            "\1\36",
            "",
            "\1\22\15\uffff\1\23\1\uffff\1\21\3\uffff\1\24\1\25",
            "\1\42\15\uffff\1\23\1\uffff\1\41\3\uffff\1\24",
            "\1\33\23\uffff\1\20",
            "\1\30\15\uffff\1\31\1\uffff\1\27\3\uffff\1\32\1\25",
            "\1\44\15\uffff\1\31\1\uffff\1\43\3\uffff\1\32",
            "\1\45",
            "\1\23\5\uffff\1\24",
            "\1\46",
            "\1\31\5\uffff\1\32",
            "\1\42\15\uffff\1\23\1\uffff\1\41\3\uffff\1\24",
            "\1\44\15\uffff\1\31\1\uffff\1\43\3\uffff\1\32"
    };

    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final char[] dfa_52 = DFA.unpackEncodedStringToUnsignedChars(dfa_52s);
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final short[][] dfa_56 = unpackEncodedStringArray(dfa_56s);

    class DFA92 extends DFA {

        public DFA92(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 92;
            this.eot = dfa_51;
            this.eof = dfa_51;
            this.min = dfa_52;
            this.max = dfa_53;
            this.accept = dfa_54;
            this.special = dfa_55;
            this.transition = dfa_56;
        }
        public String getDescription() {
            return "5183:2: ( ( ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) otherlv_2= '=' ( (lv_init_3_0= ruleExpr ) ) ) | ( ( (lv_idtup_4_0= ruleQualified ) ) otherlv_5= '=' ( (lv_init_6_0= ruleExpr ) ) ) | ( ( (lv_mut_7_0= 'var' ) )? ( (lv_idtup_8_0= ruleQualified ) ) otherlv_9= ':' ( (lv_type_10_0= ruleSimpleName ) ) this_DOTS_11= RULE_DOTS otherlv_12= '=' ( (lv_init_13_0= ruleExpr ) ) ) | ( ( (lv_mut_14_0= 'var' ) )? ( (lv_idtup_15_0= ruleQualified ) ) otherlv_16= ':' ( (lv_tuptype_17_0= ruleTupleType ) ) otherlv_18= '=' ( (lv_init_19_0= ruleExpr ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000079034010L,0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000079004010L,0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000079000012L,0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x1F010000290001D0L,0x00000000000001F0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x1E00000020000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00007F8000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0030000001000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020000001000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1F0100002B0001D0L,0x00000000000001F0L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1F410000290001D0L,0x00000000000001F0L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000009000010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0xC000000000004000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x8000000000004000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x1F010000290001D2L,0x00000000000001F0L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000008L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000009000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x00000000000001C0L,0x0000000000000180L});

}