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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOTS", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SD", "RULE_GREATERS", "RULE_LESSES", "RULE_BARS", "RULE_SLASHES", "RULE_LEFT_ENCLOSER", "RULE_RIGHT_ENCLOSER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'component'", "'end'", "'api'", "'import'", "'export'", "'{'", "','", "'}'", "'.'", "'except'", "'as'", "'private'", "'test'", "'atomic'", "'io'", "'('", "')'", "':'", "'='", "':='", "'return'", "'while'", "'for'", "'if'", "'then'", "'|'", "'elif'", "'else'", "'<-'", "'seq'", "'also'", "'at'", "'do'", "'_'", "'var'"
    };
    public static final int RULE_BARS=13;
    public static final int T__50=50;
    public static final int RULE_DOTS=5;
    public static final int RULE_LESSES=12;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
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
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

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

                if ( (LA2_0==23) ) {
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

                if ( (LA3_0==24) ) {
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

                if ( (LA4_0==RULE_ID||(LA4_0>=31 && LA4_0<=35)||(LA4_0>=53 && LA4_0<=54)) ) {
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

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

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

                if ( (LA5_0==23) ) {
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

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

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

            if ( (LA6_0==23) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    alt6=1;
                }
                else if ( (LA6_1==22) ) {
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
                    lv_imps_0_0=(Token)match(input,23,FOLLOW_3); 

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
                    lv_imps_2_0=(Token)match(input,23,FOLLOW_8); 

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
                    lv_api_3_0=(Token)match(input,22,FOLLOW_9); 

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
    // InternalFortXTrans.g:377:1: ruleExport returns [EObject current=null] : ( ( ( (lv_exp_0_0= 'export' ) ) ( (lv_exportedName_1_0= ruleAPIName ) ) ) | ( ( (lv_exp_2_0= 'export' ) ) ( (lv_brack_3_0= '{' ) ) ( (lv_exportedName_4_0= ruleAPIName ) ) (otherlv_5= ',' ( (lv_exportedName_6_0= ruleAPIName ) ) )* otherlv_7= '}' ) ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token lv_exp_0_0=null;
        Token lv_exp_2_0=null;
        Token lv_brack_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_exportedName_1_0 = null;

        AntlrDatatypeRuleToken lv_exportedName_4_0 = null;

        AntlrDatatypeRuleToken lv_exportedName_6_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:383:2: ( ( ( ( (lv_exp_0_0= 'export' ) ) ( (lv_exportedName_1_0= ruleAPIName ) ) ) | ( ( (lv_exp_2_0= 'export' ) ) ( (lv_brack_3_0= '{' ) ) ( (lv_exportedName_4_0= ruleAPIName ) ) (otherlv_5= ',' ( (lv_exportedName_6_0= ruleAPIName ) ) )* otherlv_7= '}' ) ) )
            // InternalFortXTrans.g:384:2: ( ( ( (lv_exp_0_0= 'export' ) ) ( (lv_exportedName_1_0= ruleAPIName ) ) ) | ( ( (lv_exp_2_0= 'export' ) ) ( (lv_brack_3_0= '{' ) ) ( (lv_exportedName_4_0= ruleAPIName ) ) (otherlv_5= ',' ( (lv_exportedName_6_0= ruleAPIName ) ) )* otherlv_7= '}' ) )
            {
            // InternalFortXTrans.g:384:2: ( ( ( (lv_exp_0_0= 'export' ) ) ( (lv_exportedName_1_0= ruleAPIName ) ) ) | ( ( (lv_exp_2_0= 'export' ) ) ( (lv_brack_3_0= '{' ) ) ( (lv_exportedName_4_0= ruleAPIName ) ) (otherlv_5= ',' ( (lv_exportedName_6_0= ruleAPIName ) ) )* otherlv_7= '}' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    alt8=1;
                }
                else if ( (LA8_1==25) ) {
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
                    // InternalFortXTrans.g:385:3: ( ( (lv_exp_0_0= 'export' ) ) ( (lv_exportedName_1_0= ruleAPIName ) ) )
                    {
                    // InternalFortXTrans.g:385:3: ( ( (lv_exp_0_0= 'export' ) ) ( (lv_exportedName_1_0= ruleAPIName ) ) )
                    // InternalFortXTrans.g:386:4: ( (lv_exp_0_0= 'export' ) ) ( (lv_exportedName_1_0= ruleAPIName ) )
                    {
                    // InternalFortXTrans.g:386:4: ( (lv_exp_0_0= 'export' ) )
                    // InternalFortXTrans.g:387:5: (lv_exp_0_0= 'export' )
                    {
                    // InternalFortXTrans.g:387:5: (lv_exp_0_0= 'export' )
                    // InternalFortXTrans.g:388:6: lv_exp_0_0= 'export'
                    {
                    lv_exp_0_0=(Token)match(input,24,FOLLOW_3); 

                    						newLeafNode(lv_exp_0_0, grammarAccess.getExportAccess().getExpExportKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExportRule());
                    						}
                    						setWithLastConsumed(current, "exp", lv_exp_0_0, "export");
                    					

                    }


                    }

                    // InternalFortXTrans.g:400:4: ( (lv_exportedName_1_0= ruleAPIName ) )
                    // InternalFortXTrans.g:401:5: (lv_exportedName_1_0= ruleAPIName )
                    {
                    // InternalFortXTrans.g:401:5: (lv_exportedName_1_0= ruleAPIName )
                    // InternalFortXTrans.g:402:6: lv_exportedName_1_0= ruleAPIName
                    {

                    						newCompositeNode(grammarAccess.getExportAccess().getExportedNameAPINameParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exportedName_1_0=ruleAPIName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExportRule());
                    						}
                    						add(
                    							current,
                    							"exportedName",
                    							lv_exportedName_1_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.APIName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:421:3: ( ( (lv_exp_2_0= 'export' ) ) ( (lv_brack_3_0= '{' ) ) ( (lv_exportedName_4_0= ruleAPIName ) ) (otherlv_5= ',' ( (lv_exportedName_6_0= ruleAPIName ) ) )* otherlv_7= '}' )
                    {
                    // InternalFortXTrans.g:421:3: ( ( (lv_exp_2_0= 'export' ) ) ( (lv_brack_3_0= '{' ) ) ( (lv_exportedName_4_0= ruleAPIName ) ) (otherlv_5= ',' ( (lv_exportedName_6_0= ruleAPIName ) ) )* otherlv_7= '}' )
                    // InternalFortXTrans.g:422:4: ( (lv_exp_2_0= 'export' ) ) ( (lv_brack_3_0= '{' ) ) ( (lv_exportedName_4_0= ruleAPIName ) ) (otherlv_5= ',' ( (lv_exportedName_6_0= ruleAPIName ) ) )* otherlv_7= '}'
                    {
                    // InternalFortXTrans.g:422:4: ( (lv_exp_2_0= 'export' ) )
                    // InternalFortXTrans.g:423:5: (lv_exp_2_0= 'export' )
                    {
                    // InternalFortXTrans.g:423:5: (lv_exp_2_0= 'export' )
                    // InternalFortXTrans.g:424:6: lv_exp_2_0= 'export'
                    {
                    lv_exp_2_0=(Token)match(input,24,FOLLOW_10); 

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
                    lv_brack_3_0=(Token)match(input,25,FOLLOW_3); 

                    						newLeafNode(lv_brack_3_0, grammarAccess.getExportAccess().getBrackLeftCurlyBracketKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExportRule());
                    						}
                    						setWithLastConsumed(current, "brack", lv_brack_3_0, "{");
                    					

                    }


                    }

                    // InternalFortXTrans.g:450:4: ( (lv_exportedName_4_0= ruleAPIName ) )
                    // InternalFortXTrans.g:451:5: (lv_exportedName_4_0= ruleAPIName )
                    {
                    // InternalFortXTrans.g:451:5: (lv_exportedName_4_0= ruleAPIName )
                    // InternalFortXTrans.g:452:6: lv_exportedName_4_0= ruleAPIName
                    {

                    						newCompositeNode(grammarAccess.getExportAccess().getExportedNameAPINameParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_exportedName_4_0=ruleAPIName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExportRule());
                    						}
                    						add(
                    							current,
                    							"exportedName",
                    							lv_exportedName_4_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.APIName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:469:4: (otherlv_5= ',' ( (lv_exportedName_6_0= ruleAPIName ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==26) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalFortXTrans.g:470:5: otherlv_5= ',' ( (lv_exportedName_6_0= ruleAPIName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,26,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getExportAccess().getCommaKeyword_1_3_0());
                    	    				
                    	    // InternalFortXTrans.g:474:5: ( (lv_exportedName_6_0= ruleAPIName ) )
                    	    // InternalFortXTrans.g:475:6: (lv_exportedName_6_0= ruleAPIName )
                    	    {
                    	    // InternalFortXTrans.g:475:6: (lv_exportedName_6_0= ruleAPIName )
                    	    // InternalFortXTrans.g:476:7: lv_exportedName_6_0= ruleAPIName
                    	    {

                    	    							newCompositeNode(grammarAccess.getExportAccess().getExportedNameAPINameParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_exportedName_6_0=ruleAPIName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExportRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"exportedName",
                    	    								lv_exportedName_6_0,
                    	    								"srf.transpiler.fortxtrans.FortXTrans.APIName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,27,FOLLOW_2); 

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
    // InternalFortXTrans.g:510:1: ruleImportedNames returns [EObject current=null] : ( ( ( (lv_impname_0_0= ruleAPIName ) ) otherlv_1= '.' otherlv_2= '{' this_DOTS_3= RULE_DOTS otherlv_4= '}' ( ( (lv_except_5_0= 'except' ) ) ( (lv_simp_6_0= ruleSimpleNames ) ) )? ) | ( ( (lv_impname_7_0= ruleAPIName ) ) otherlv_8= '.' otherlv_9= '{' ( (lv_simpList_10_0= ruleAliasedSimpleName ) ) (otherlv_11= ',' ( (lv_simpList_12_0= ruleAliasedSimpleName ) ) )* ( ( (lv_comma_13_0= ',' ) ) ( (lv_dots_14_0= RULE_DOTS ) ) )? otherlv_15= '}' ) | ( ( (lv_impname_16_0= ruleAPIName ) ) (otherlv_17= 'as' ( (lv_asname_18_0= RULE_ID ) ) )? ) ) ;
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
        AntlrDatatypeRuleToken lv_impname_0_0 = null;

        EObject lv_simp_6_0 = null;

        AntlrDatatypeRuleToken lv_impname_7_0 = null;

        EObject lv_simpList_10_0 = null;

        EObject lv_simpList_12_0 = null;

        AntlrDatatypeRuleToken lv_impname_16_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:516:2: ( ( ( ( (lv_impname_0_0= ruleAPIName ) ) otherlv_1= '.' otherlv_2= '{' this_DOTS_3= RULE_DOTS otherlv_4= '}' ( ( (lv_except_5_0= 'except' ) ) ( (lv_simp_6_0= ruleSimpleNames ) ) )? ) | ( ( (lv_impname_7_0= ruleAPIName ) ) otherlv_8= '.' otherlv_9= '{' ( (lv_simpList_10_0= ruleAliasedSimpleName ) ) (otherlv_11= ',' ( (lv_simpList_12_0= ruleAliasedSimpleName ) ) )* ( ( (lv_comma_13_0= ',' ) ) ( (lv_dots_14_0= RULE_DOTS ) ) )? otherlv_15= '}' ) | ( ( (lv_impname_16_0= ruleAPIName ) ) (otherlv_17= 'as' ( (lv_asname_18_0= RULE_ID ) ) )? ) ) )
            // InternalFortXTrans.g:517:2: ( ( ( (lv_impname_0_0= ruleAPIName ) ) otherlv_1= '.' otherlv_2= '{' this_DOTS_3= RULE_DOTS otherlv_4= '}' ( ( (lv_except_5_0= 'except' ) ) ( (lv_simp_6_0= ruleSimpleNames ) ) )? ) | ( ( (lv_impname_7_0= ruleAPIName ) ) otherlv_8= '.' otherlv_9= '{' ( (lv_simpList_10_0= ruleAliasedSimpleName ) ) (otherlv_11= ',' ( (lv_simpList_12_0= ruleAliasedSimpleName ) ) )* ( ( (lv_comma_13_0= ',' ) ) ( (lv_dots_14_0= RULE_DOTS ) ) )? otherlv_15= '}' ) | ( ( (lv_impname_16_0= ruleAPIName ) ) (otherlv_17= 'as' ( (lv_asname_18_0= RULE_ID ) ) )? ) )
            {
            // InternalFortXTrans.g:517:2: ( ( ( (lv_impname_0_0= ruleAPIName ) ) otherlv_1= '.' otherlv_2= '{' this_DOTS_3= RULE_DOTS otherlv_4= '}' ( ( (lv_except_5_0= 'except' ) ) ( (lv_simp_6_0= ruleSimpleNames ) ) )? ) | ( ( (lv_impname_7_0= ruleAPIName ) ) otherlv_8= '.' otherlv_9= '{' ( (lv_simpList_10_0= ruleAliasedSimpleName ) ) (otherlv_11= ',' ( (lv_simpList_12_0= ruleAliasedSimpleName ) ) )* ( ( (lv_comma_13_0= ',' ) ) ( (lv_dots_14_0= RULE_DOTS ) ) )? otherlv_15= '}' ) | ( ( (lv_impname_16_0= ruleAPIName ) ) (otherlv_17= 'as' ( (lv_asname_18_0= RULE_ID ) ) )? ) )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalFortXTrans.g:518:3: ( ( (lv_impname_0_0= ruleAPIName ) ) otherlv_1= '.' otherlv_2= '{' this_DOTS_3= RULE_DOTS otherlv_4= '}' ( ( (lv_except_5_0= 'except' ) ) ( (lv_simp_6_0= ruleSimpleNames ) ) )? )
                    {
                    // InternalFortXTrans.g:518:3: ( ( (lv_impname_0_0= ruleAPIName ) ) otherlv_1= '.' otherlv_2= '{' this_DOTS_3= RULE_DOTS otherlv_4= '}' ( ( (lv_except_5_0= 'except' ) ) ( (lv_simp_6_0= ruleSimpleNames ) ) )? )
                    // InternalFortXTrans.g:519:4: ( (lv_impname_0_0= ruleAPIName ) ) otherlv_1= '.' otherlv_2= '{' this_DOTS_3= RULE_DOTS otherlv_4= '}' ( ( (lv_except_5_0= 'except' ) ) ( (lv_simp_6_0= ruleSimpleNames ) ) )?
                    {
                    // InternalFortXTrans.g:519:4: ( (lv_impname_0_0= ruleAPIName ) )
                    // InternalFortXTrans.g:520:5: (lv_impname_0_0= ruleAPIName )
                    {
                    // InternalFortXTrans.g:520:5: (lv_impname_0_0= ruleAPIName )
                    // InternalFortXTrans.g:521:6: lv_impname_0_0= ruleAPIName
                    {

                    						newCompositeNode(grammarAccess.getImportedNamesAccess().getImpnameAPINameParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_impname_0_0=ruleAPIName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImportedNamesRule());
                    						}
                    						set(
                    							current,
                    							"impname",
                    							lv_impname_0_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.APIName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getImportedNamesAccess().getFullStopKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getImportedNamesAccess().getLeftCurlyBracketKeyword_0_2());
                    			
                    this_DOTS_3=(Token)match(input,RULE_DOTS,FOLLOW_14); 

                    				newLeafNode(this_DOTS_3, grammarAccess.getImportedNamesAccess().getDOTSTerminalRuleCall_0_3());
                    			
                    otherlv_4=(Token)match(input,27,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getImportedNamesAccess().getRightCurlyBracketKeyword_0_4());
                    			
                    // InternalFortXTrans.g:554:4: ( ( (lv_except_5_0= 'except' ) ) ( (lv_simp_6_0= ruleSimpleNames ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==29) ) {
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
                            lv_except_5_0=(Token)match(input,29,FOLLOW_9); 

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
                    // InternalFortXTrans.g:591:3: ( ( (lv_impname_7_0= ruleAPIName ) ) otherlv_8= '.' otherlv_9= '{' ( (lv_simpList_10_0= ruleAliasedSimpleName ) ) (otherlv_11= ',' ( (lv_simpList_12_0= ruleAliasedSimpleName ) ) )* ( ( (lv_comma_13_0= ',' ) ) ( (lv_dots_14_0= RULE_DOTS ) ) )? otherlv_15= '}' )
                    {
                    // InternalFortXTrans.g:591:3: ( ( (lv_impname_7_0= ruleAPIName ) ) otherlv_8= '.' otherlv_9= '{' ( (lv_simpList_10_0= ruleAliasedSimpleName ) ) (otherlv_11= ',' ( (lv_simpList_12_0= ruleAliasedSimpleName ) ) )* ( ( (lv_comma_13_0= ',' ) ) ( (lv_dots_14_0= RULE_DOTS ) ) )? otherlv_15= '}' )
                    // InternalFortXTrans.g:592:4: ( (lv_impname_7_0= ruleAPIName ) ) otherlv_8= '.' otherlv_9= '{' ( (lv_simpList_10_0= ruleAliasedSimpleName ) ) (otherlv_11= ',' ( (lv_simpList_12_0= ruleAliasedSimpleName ) ) )* ( ( (lv_comma_13_0= ',' ) ) ( (lv_dots_14_0= RULE_DOTS ) ) )? otherlv_15= '}'
                    {
                    // InternalFortXTrans.g:592:4: ( (lv_impname_7_0= ruleAPIName ) )
                    // InternalFortXTrans.g:593:5: (lv_impname_7_0= ruleAPIName )
                    {
                    // InternalFortXTrans.g:593:5: (lv_impname_7_0= ruleAPIName )
                    // InternalFortXTrans.g:594:6: lv_impname_7_0= ruleAPIName
                    {

                    						newCompositeNode(grammarAccess.getImportedNamesAccess().getImpnameAPINameParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_impname_7_0=ruleAPIName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImportedNamesRule());
                    						}
                    						set(
                    							current,
                    							"impname",
                    							lv_impname_7_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.APIName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getImportedNamesAccess().getFullStopKeyword_1_1());
                    			
                    otherlv_9=(Token)match(input,25,FOLLOW_3); 

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

                        if ( (LA10_0==26) ) {
                            int LA10_1 = input.LA(2);

                            if ( (LA10_1==RULE_ID) ) {
                                alt10=1;
                            }


                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalFortXTrans.g:639:5: otherlv_11= ',' ( (lv_simpList_12_0= ruleAliasedSimpleName ) )
                    	    {
                    	    otherlv_11=(Token)match(input,26,FOLLOW_3); 

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

                    if ( (LA11_0==26) ) {
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
                            lv_comma_13_0=(Token)match(input,26,FOLLOW_13); 

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

                    otherlv_15=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getImportedNamesAccess().getRightCurlyBracketKeyword_1_6());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:703:3: ( ( (lv_impname_16_0= ruleAPIName ) ) (otherlv_17= 'as' ( (lv_asname_18_0= RULE_ID ) ) )? )
                    {
                    // InternalFortXTrans.g:703:3: ( ( (lv_impname_16_0= ruleAPIName ) ) (otherlv_17= 'as' ( (lv_asname_18_0= RULE_ID ) ) )? )
                    // InternalFortXTrans.g:704:4: ( (lv_impname_16_0= ruleAPIName ) ) (otherlv_17= 'as' ( (lv_asname_18_0= RULE_ID ) ) )?
                    {
                    // InternalFortXTrans.g:704:4: ( (lv_impname_16_0= ruleAPIName ) )
                    // InternalFortXTrans.g:705:5: (lv_impname_16_0= ruleAPIName )
                    {
                    // InternalFortXTrans.g:705:5: (lv_impname_16_0= ruleAPIName )
                    // InternalFortXTrans.g:706:6: lv_impname_16_0= ruleAPIName
                    {

                    						newCompositeNode(grammarAccess.getImportedNamesAccess().getImpnameAPINameParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_impname_16_0=ruleAPIName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImportedNamesRule());
                    						}
                    						set(
                    							current,
                    							"impname",
                    							lv_impname_16_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.APIName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:723:4: (otherlv_17= 'as' ( (lv_asname_18_0= RULE_ID ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==30) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalFortXTrans.g:724:5: otherlv_17= 'as' ( (lv_asname_18_0= RULE_ID ) )
                            {
                            otherlv_17=(Token)match(input,30,FOLLOW_3); 

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
    // InternalFortXTrans.g:752:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalFortXTrans.g:752:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalFortXTrans.g:753:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // InternalFortXTrans.g:759:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID this_DOTS_1= RULE_DOTS ) | (this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )* this_DOTS_5= RULE_DOTS ) | (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_DOTS_1=null;
        Token this_ID_2=null;
        Token kw=null;
        Token this_ID_4=null;
        Token this_DOTS_5=null;
        Token this_ID_6=null;
        Token this_ID_8=null;


        	enterRule();

        try {
            // InternalFortXTrans.g:765:2: ( ( (this_ID_0= RULE_ID this_DOTS_1= RULE_DOTS ) | (this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )* this_DOTS_5= RULE_DOTS ) | (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) ) )
            // InternalFortXTrans.g:766:2: ( (this_ID_0= RULE_ID this_DOTS_1= RULE_DOTS ) | (this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )* this_DOTS_5= RULE_DOTS ) | (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) )
            {
            // InternalFortXTrans.g:766:2: ( (this_ID_0= RULE_ID this_DOTS_1= RULE_DOTS ) | (this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )* this_DOTS_5= RULE_DOTS ) | (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) )
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalFortXTrans.g:767:3: (this_ID_0= RULE_ID this_DOTS_1= RULE_DOTS )
                    {
                    // InternalFortXTrans.g:767:3: (this_ID_0= RULE_ID this_DOTS_1= RULE_DOTS )
                    // InternalFortXTrans.g:768:4: this_ID_0= RULE_ID this_DOTS_1= RULE_DOTS
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0());
                    			
                    this_DOTS_1=(Token)match(input,RULE_DOTS,FOLLOW_2); 

                    				current.merge(this_DOTS_1);
                    			

                    				newLeafNode(this_DOTS_1, grammarAccess.getQualifiedNameAccess().getDOTSTerminalRuleCall_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:784:3: (this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )* this_DOTS_5= RULE_DOTS )
                    {
                    // InternalFortXTrans.g:784:3: (this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )* this_DOTS_5= RULE_DOTS )
                    // InternalFortXTrans.g:785:4: this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )* this_DOTS_5= RULE_DOTS
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_17); 

                    				current.merge(this_ID_2);
                    			

                    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_0());
                    			
                    // InternalFortXTrans.g:792:4: (kw= '.' this_ID_4= RULE_ID )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==28) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalFortXTrans.g:793:5: kw= '.' this_ID_4= RULE_ID
                    	    {
                    	    kw=(Token)match(input,28,FOLLOW_3); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_1_0());
                    	    				
                    	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_17); 

                    	    					current.merge(this_ID_4);
                    	    				

                    	    					newLeafNode(this_ID_4, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    this_DOTS_5=(Token)match(input,RULE_DOTS,FOLLOW_2); 

                    				current.merge(this_DOTS_5);
                    			

                    				newLeafNode(this_DOTS_5, grammarAccess.getQualifiedNameAccess().getDOTSTerminalRuleCall_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:815:3: (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* )
                    {
                    // InternalFortXTrans.g:815:3: (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* )
                    // InternalFortXTrans.g:816:4: this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )*
                    {
                    this_ID_6=(Token)match(input,RULE_ID,FOLLOW_18); 

                    				current.merge(this_ID_6);
                    			

                    				newLeafNode(this_ID_6, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_2_0());
                    			
                    // InternalFortXTrans.g:823:4: (kw= '.' this_ID_8= RULE_ID )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==28) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalFortXTrans.g:824:5: kw= '.' this_ID_8= RULE_ID
                    	    {
                    	    kw=(Token)match(input,28,FOLLOW_3); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_2_1_0());
                    	    				
                    	    this_ID_8=(Token)match(input,RULE_ID,FOLLOW_18); 

                    	    					current.merge(this_ID_8);
                    	    				

                    	    					newLeafNode(this_ID_8, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_2_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleAPIName"
    // InternalFortXTrans.g:842:1: entryRuleAPIName returns [String current=null] : iv_ruleAPIName= ruleAPIName EOF ;
    public final String entryRuleAPIName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAPIName = null;


        try {
            // InternalFortXTrans.g:842:47: (iv_ruleAPIName= ruleAPIName EOF )
            // InternalFortXTrans.g:843:2: iv_ruleAPIName= ruleAPIName EOF
            {
             newCompositeNode(grammarAccess.getAPINameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAPIName=ruleAPIName();

            state._fsp--;

             current =iv_ruleAPIName.getText(); 
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
    // $ANTLR end "entryRuleAPIName"


    // $ANTLR start "ruleAPIName"
    // InternalFortXTrans.g:849:1: ruleAPIName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID this_DOTS_1= RULE_DOTS ) | (this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )* this_DOTS_5= RULE_DOTS ) | (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) ) ;
    public final AntlrDatatypeRuleToken ruleAPIName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_DOTS_1=null;
        Token this_ID_2=null;
        Token kw=null;
        Token this_ID_4=null;
        Token this_DOTS_5=null;
        Token this_ID_6=null;
        Token this_ID_8=null;


        	enterRule();

        try {
            // InternalFortXTrans.g:855:2: ( ( (this_ID_0= RULE_ID this_DOTS_1= RULE_DOTS ) | (this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )* this_DOTS_5= RULE_DOTS ) | (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) ) )
            // InternalFortXTrans.g:856:2: ( (this_ID_0= RULE_ID this_DOTS_1= RULE_DOTS ) | (this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )* this_DOTS_5= RULE_DOTS ) | (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) )
            {
            // InternalFortXTrans.g:856:2: ( (this_ID_0= RULE_ID this_DOTS_1= RULE_DOTS ) | (this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )* this_DOTS_5= RULE_DOTS ) | (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) )
            int alt19=3;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalFortXTrans.g:857:3: (this_ID_0= RULE_ID this_DOTS_1= RULE_DOTS )
                    {
                    // InternalFortXTrans.g:857:3: (this_ID_0= RULE_ID this_DOTS_1= RULE_DOTS )
                    // InternalFortXTrans.g:858:4: this_ID_0= RULE_ID this_DOTS_1= RULE_DOTS
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getAPINameAccess().getIDTerminalRuleCall_0_0());
                    			
                    this_DOTS_1=(Token)match(input,RULE_DOTS,FOLLOW_2); 

                    				current.merge(this_DOTS_1);
                    			

                    				newLeafNode(this_DOTS_1, grammarAccess.getAPINameAccess().getDOTSTerminalRuleCall_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:874:3: (this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )* this_DOTS_5= RULE_DOTS )
                    {
                    // InternalFortXTrans.g:874:3: (this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )* this_DOTS_5= RULE_DOTS )
                    // InternalFortXTrans.g:875:4: this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )* this_DOTS_5= RULE_DOTS
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_17); 

                    				current.merge(this_ID_2);
                    			

                    				newLeafNode(this_ID_2, grammarAccess.getAPINameAccess().getIDTerminalRuleCall_1_0());
                    			
                    // InternalFortXTrans.g:882:4: (kw= '.' this_ID_4= RULE_ID )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==28) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalFortXTrans.g:883:5: kw= '.' this_ID_4= RULE_ID
                    	    {
                    	    kw=(Token)match(input,28,FOLLOW_3); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getAPINameAccess().getFullStopKeyword_1_1_0());
                    	    				
                    	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_17); 

                    	    					current.merge(this_ID_4);
                    	    				

                    	    					newLeafNode(this_ID_4, grammarAccess.getAPINameAccess().getIDTerminalRuleCall_1_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    this_DOTS_5=(Token)match(input,RULE_DOTS,FOLLOW_2); 

                    				current.merge(this_DOTS_5);
                    			

                    				newLeafNode(this_DOTS_5, grammarAccess.getAPINameAccess().getDOTSTerminalRuleCall_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:905:3: (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* )
                    {
                    // InternalFortXTrans.g:905:3: (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* )
                    // InternalFortXTrans.g:906:4: this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )*
                    {
                    this_ID_6=(Token)match(input,RULE_ID,FOLLOW_18); 

                    				current.merge(this_ID_6);
                    			

                    				newLeafNode(this_ID_6, grammarAccess.getAPINameAccess().getIDTerminalRuleCall_2_0());
                    			
                    // InternalFortXTrans.g:913:4: (kw= '.' this_ID_8= RULE_ID )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==28) ) {
                            int LA18_2 = input.LA(2);

                            if ( (LA18_2==RULE_ID) ) {
                                alt18=1;
                            }


                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalFortXTrans.g:914:5: kw= '.' this_ID_8= RULE_ID
                    	    {
                    	    kw=(Token)match(input,28,FOLLOW_3); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getAPINameAccess().getFullStopKeyword_2_1_0());
                    	    				
                    	    this_ID_8=(Token)match(input,RULE_ID,FOLLOW_18); 

                    	    					current.merge(this_ID_8);
                    	    				

                    	    					newLeafNode(this_ID_8, grammarAccess.getAPINameAccess().getIDTerminalRuleCall_2_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


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
    // $ANTLR end "ruleAPIName"


    // $ANTLR start "entryRuleSimpleNames"
    // InternalFortXTrans.g:932:1: entryRuleSimpleNames returns [EObject current=null] : iv_ruleSimpleNames= ruleSimpleNames EOF ;
    public final EObject entryRuleSimpleNames() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleNames = null;


        try {
            // InternalFortXTrans.g:932:52: (iv_ruleSimpleNames= ruleSimpleNames EOF )
            // InternalFortXTrans.g:933:2: iv_ruleSimpleNames= ruleSimpleNames EOF
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
    // InternalFortXTrans.g:939:1: ruleSimpleNames returns [EObject current=null] : ( ( (lv_nameList_0_0= ruleSimpleName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleSimpleName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )* otherlv_5= '}' ) ) ;
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
            // InternalFortXTrans.g:945:2: ( ( ( (lv_nameList_0_0= ruleSimpleName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleSimpleName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )* otherlv_5= '}' ) ) )
            // InternalFortXTrans.g:946:2: ( ( (lv_nameList_0_0= ruleSimpleName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleSimpleName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )* otherlv_5= '}' ) )
            {
            // InternalFortXTrans.g:946:2: ( ( (lv_nameList_0_0= ruleSimpleName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleSimpleName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )* otherlv_5= '}' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==25) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalFortXTrans.g:947:3: ( (lv_nameList_0_0= ruleSimpleName ) )
                    {
                    // InternalFortXTrans.g:947:3: ( (lv_nameList_0_0= ruleSimpleName ) )
                    // InternalFortXTrans.g:948:4: (lv_nameList_0_0= ruleSimpleName )
                    {
                    // InternalFortXTrans.g:948:4: (lv_nameList_0_0= ruleSimpleName )
                    // InternalFortXTrans.g:949:5: lv_nameList_0_0= ruleSimpleName
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
                    // InternalFortXTrans.g:967:3: ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleSimpleName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )* otherlv_5= '}' )
                    {
                    // InternalFortXTrans.g:967:3: ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleSimpleName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )* otherlv_5= '}' )
                    // InternalFortXTrans.g:968:4: ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleSimpleName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )* otherlv_5= '}'
                    {
                    // InternalFortXTrans.g:968:4: ( (lv_brack_1_0= '{' ) )
                    // InternalFortXTrans.g:969:5: (lv_brack_1_0= '{' )
                    {
                    // InternalFortXTrans.g:969:5: (lv_brack_1_0= '{' )
                    // InternalFortXTrans.g:970:6: lv_brack_1_0= '{'
                    {
                    lv_brack_1_0=(Token)match(input,25,FOLLOW_3); 

                    						newLeafNode(lv_brack_1_0, grammarAccess.getSimpleNamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleNamesRule());
                    						}
                    						setWithLastConsumed(current, "brack", lv_brack_1_0, "{");
                    					

                    }


                    }

                    // InternalFortXTrans.g:982:4: ( (lv_nameList_2_0= ruleSimpleName ) )
                    // InternalFortXTrans.g:983:5: (lv_nameList_2_0= ruleSimpleName )
                    {
                    // InternalFortXTrans.g:983:5: (lv_nameList_2_0= ruleSimpleName )
                    // InternalFortXTrans.g:984:6: lv_nameList_2_0= ruleSimpleName
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

                    // InternalFortXTrans.g:1001:4: (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==26) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalFortXTrans.g:1002:5: otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSimpleNamesAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalFortXTrans.g:1006:5: ( (lv_nameList_4_0= ruleSimpleName ) )
                    	    // InternalFortXTrans.g:1007:6: (lv_nameList_4_0= ruleSimpleName )
                    	    {
                    	    // InternalFortXTrans.g:1007:6: (lv_nameList_4_0= ruleSimpleName )
                    	    // InternalFortXTrans.g:1008:7: lv_nameList_4_0= ruleSimpleName
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
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_2); 

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
    // InternalFortXTrans.g:1035:1: entryRuleSimpleName returns [EObject current=null] : iv_ruleSimpleName= ruleSimpleName EOF ;
    public final EObject entryRuleSimpleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleName = null;


        try {
            // InternalFortXTrans.g:1035:51: (iv_ruleSimpleName= ruleSimpleName EOF )
            // InternalFortXTrans.g:1036:2: iv_ruleSimpleName= ruleSimpleName EOF
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
    // InternalFortXTrans.g:1042:1: ruleSimpleName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSimpleName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalFortXTrans.g:1048:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalFortXTrans.g:1049:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalFortXTrans.g:1049:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalFortXTrans.g:1050:3: (lv_name_0_0= RULE_ID )
            {
            // InternalFortXTrans.g:1050:3: (lv_name_0_0= RULE_ID )
            // InternalFortXTrans.g:1051:4: lv_name_0_0= RULE_ID
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
    // InternalFortXTrans.g:1070:1: entryRuleAliasedSimpleName returns [EObject current=null] : iv_ruleAliasedSimpleName= ruleAliasedSimpleName EOF ;
    public final EObject entryRuleAliasedSimpleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasedSimpleName = null;


        try {
            // InternalFortXTrans.g:1070:58: (iv_ruleAliasedSimpleName= ruleAliasedSimpleName EOF )
            // InternalFortXTrans.g:1071:2: iv_ruleAliasedSimpleName= ruleAliasedSimpleName EOF
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
    // InternalFortXTrans.g:1077:1: ruleAliasedSimpleName returns [EObject current=null] : ( ( (lv_orig_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleAliasedSimpleName() throws RecognitionException {
        EObject current = null;

        Token lv_orig_0_0=null;
        Token otherlv_1=null;
        Token lv_asName_2_0=null;


        	enterRule();

        try {
            // InternalFortXTrans.g:1083:2: ( ( ( (lv_orig_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? ) )
            // InternalFortXTrans.g:1084:2: ( ( (lv_orig_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? )
            {
            // InternalFortXTrans.g:1084:2: ( ( (lv_orig_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? )
            // InternalFortXTrans.g:1085:3: ( (lv_orig_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )?
            {
            // InternalFortXTrans.g:1085:3: ( (lv_orig_0_0= RULE_ID ) )
            // InternalFortXTrans.g:1086:4: (lv_orig_0_0= RULE_ID )
            {
            // InternalFortXTrans.g:1086:4: (lv_orig_0_0= RULE_ID )
            // InternalFortXTrans.g:1087:5: lv_orig_0_0= RULE_ID
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

            // InternalFortXTrans.g:1103:3: (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalFortXTrans.g:1104:4: otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getAliasedSimpleNameAccess().getAsKeyword_1_0());
                    			
                    // InternalFortXTrans.g:1108:4: ( (lv_asName_2_0= RULE_ID ) )
                    // InternalFortXTrans.g:1109:5: (lv_asName_2_0= RULE_ID )
                    {
                    // InternalFortXTrans.g:1109:5: (lv_asName_2_0= RULE_ID )
                    // InternalFortXTrans.g:1110:6: lv_asName_2_0= RULE_ID
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
    // InternalFortXTrans.g:1131:1: entryRuleAliasedAPINames returns [EObject current=null] : iv_ruleAliasedAPINames= ruleAliasedAPINames EOF ;
    public final EObject entryRuleAliasedAPINames() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasedAPINames = null;


        try {
            // InternalFortXTrans.g:1131:56: (iv_ruleAliasedAPINames= ruleAliasedAPINames EOF )
            // InternalFortXTrans.g:1132:2: iv_ruleAliasedAPINames= ruleAliasedAPINames EOF
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
    // InternalFortXTrans.g:1138:1: ruleAliasedAPINames returns [EObject current=null] : ( ( (lv_nameList_0_0= ruleAliasedAPIName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleAliasedAPIName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )* otherlv_5= '}' ) ) ;
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
            // InternalFortXTrans.g:1144:2: ( ( ( (lv_nameList_0_0= ruleAliasedAPIName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleAliasedAPIName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )* otherlv_5= '}' ) ) )
            // InternalFortXTrans.g:1145:2: ( ( (lv_nameList_0_0= ruleAliasedAPIName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleAliasedAPIName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )* otherlv_5= '}' ) )
            {
            // InternalFortXTrans.g:1145:2: ( ( (lv_nameList_0_0= ruleAliasedAPIName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleAliasedAPIName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )* otherlv_5= '}' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==25) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalFortXTrans.g:1146:3: ( (lv_nameList_0_0= ruleAliasedAPIName ) )
                    {
                    // InternalFortXTrans.g:1146:3: ( (lv_nameList_0_0= ruleAliasedAPIName ) )
                    // InternalFortXTrans.g:1147:4: (lv_nameList_0_0= ruleAliasedAPIName )
                    {
                    // InternalFortXTrans.g:1147:4: (lv_nameList_0_0= ruleAliasedAPIName )
                    // InternalFortXTrans.g:1148:5: lv_nameList_0_0= ruleAliasedAPIName
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
                    // InternalFortXTrans.g:1166:3: ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleAliasedAPIName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )* otherlv_5= '}' )
                    {
                    // InternalFortXTrans.g:1166:3: ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleAliasedAPIName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )* otherlv_5= '}' )
                    // InternalFortXTrans.g:1167:4: ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleAliasedAPIName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )* otherlv_5= '}'
                    {
                    // InternalFortXTrans.g:1167:4: ( (lv_brack_1_0= '{' ) )
                    // InternalFortXTrans.g:1168:5: (lv_brack_1_0= '{' )
                    {
                    // InternalFortXTrans.g:1168:5: (lv_brack_1_0= '{' )
                    // InternalFortXTrans.g:1169:6: lv_brack_1_0= '{'
                    {
                    lv_brack_1_0=(Token)match(input,25,FOLLOW_3); 

                    						newLeafNode(lv_brack_1_0, grammarAccess.getAliasedAPINamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAliasedAPINamesRule());
                    						}
                    						setWithLastConsumed(current, "brack", lv_brack_1_0, "{");
                    					

                    }


                    }

                    // InternalFortXTrans.g:1181:4: ( (lv_nameList_2_0= ruleAliasedAPIName ) )
                    // InternalFortXTrans.g:1182:5: (lv_nameList_2_0= ruleAliasedAPIName )
                    {
                    // InternalFortXTrans.g:1182:5: (lv_nameList_2_0= ruleAliasedAPIName )
                    // InternalFortXTrans.g:1183:6: lv_nameList_2_0= ruleAliasedAPIName
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

                    // InternalFortXTrans.g:1200:4: (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==26) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalFortXTrans.g:1201:5: otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getAliasedAPINamesAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalFortXTrans.g:1205:5: ( (lv_nameList_4_0= ruleAliasedAPIName ) )
                    	    // InternalFortXTrans.g:1206:6: (lv_nameList_4_0= ruleAliasedAPIName )
                    	    {
                    	    // InternalFortXTrans.g:1206:6: (lv_nameList_4_0= ruleAliasedAPIName )
                    	    // InternalFortXTrans.g:1207:7: lv_nameList_4_0= ruleAliasedAPIName
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
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_2); 

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
    // InternalFortXTrans.g:1234:1: entryRuleAliasedAPIName returns [EObject current=null] : iv_ruleAliasedAPIName= ruleAliasedAPIName EOF ;
    public final EObject entryRuleAliasedAPIName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasedAPIName = null;


        try {
            // InternalFortXTrans.g:1234:55: (iv_ruleAliasedAPIName= ruleAliasedAPIName EOF )
            // InternalFortXTrans.g:1235:2: iv_ruleAliasedAPIName= ruleAliasedAPIName EOF
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
    // InternalFortXTrans.g:1241:1: ruleAliasedAPIName returns [EObject current=null] : ( ( (lv_orig_0_0= ruleAPIName ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleAliasedAPIName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_asName_2_0=null;
        AntlrDatatypeRuleToken lv_orig_0_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1247:2: ( ( ( (lv_orig_0_0= ruleAPIName ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? ) )
            // InternalFortXTrans.g:1248:2: ( ( (lv_orig_0_0= ruleAPIName ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? )
            {
            // InternalFortXTrans.g:1248:2: ( ( (lv_orig_0_0= ruleAPIName ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? )
            // InternalFortXTrans.g:1249:3: ( (lv_orig_0_0= ruleAPIName ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )?
            {
            // InternalFortXTrans.g:1249:3: ( (lv_orig_0_0= ruleAPIName ) )
            // InternalFortXTrans.g:1250:4: (lv_orig_0_0= ruleAPIName )
            {
            // InternalFortXTrans.g:1250:4: (lv_orig_0_0= ruleAPIName )
            // InternalFortXTrans.g:1251:5: lv_orig_0_0= ruleAPIName
            {

            					newCompositeNode(grammarAccess.getAliasedAPINameAccess().getOrigAPINameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_orig_0_0=ruleAPIName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAliasedAPINameRule());
            					}
            					set(
            						current,
            						"orig",
            						lv_orig_0_0,
            						"srf.transpiler.fortxtrans.FortXTrans.APIName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFortXTrans.g:1268:3: (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalFortXTrans.g:1269:4: otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getAliasedAPINameAccess().getAsKeyword_1_0());
                    			
                    // InternalFortXTrans.g:1273:4: ( (lv_asName_2_0= RULE_ID ) )
                    // InternalFortXTrans.g:1274:5: (lv_asName_2_0= RULE_ID )
                    {
                    // InternalFortXTrans.g:1274:5: (lv_asName_2_0= RULE_ID )
                    // InternalFortXTrans.g:1275:6: lv_asName_2_0= RULE_ID
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
    // InternalFortXTrans.g:1296:1: entryRuleDecls returns [EObject current=null] : iv_ruleDecls= ruleDecls EOF ;
    public final EObject entryRuleDecls() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecls = null;


        try {
            // InternalFortXTrans.g:1296:46: (iv_ruleDecls= ruleDecls EOF )
            // InternalFortXTrans.g:1297:2: iv_ruleDecls= ruleDecls EOF
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
    // InternalFortXTrans.g:1303:1: ruleDecls returns [EObject current=null] : ( (lv_decls_0_0= ruleDecl ) )+ ;
    public final EObject ruleDecls() throws RecognitionException {
        EObject current = null;

        EObject lv_decls_0_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1309:2: ( ( (lv_decls_0_0= ruleDecl ) )+ )
            // InternalFortXTrans.g:1310:2: ( (lv_decls_0_0= ruleDecl ) )+
            {
            // InternalFortXTrans.g:1310:2: ( (lv_decls_0_0= ruleDecl ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // InternalFortXTrans.g:1311:3: (lv_decls_0_0= ruleDecl )
            	    {
            	    // InternalFortXTrans.g:1311:3: (lv_decls_0_0= ruleDecl )
            	    // InternalFortXTrans.g:1312:4: lv_decls_0_0= ruleDecl
            	    {

            	    				newCompositeNode(grammarAccess.getDeclsAccess().getDeclsDeclParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_19);
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
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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
    // InternalFortXTrans.g:1332:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // InternalFortXTrans.g:1332:45: (iv_ruleDecl= ruleDecl EOF )
            // InternalFortXTrans.g:1333:2: iv_ruleDecl= ruleDecl EOF
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
    // InternalFortXTrans.g:1339:1: ruleDecl returns [EObject current=null] : ( ( (lv_function_0_0= ruleFnDecl ) ) | ( (lv_field_1_0= ruleFieldDecl ) ) ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_function_0_0 = null;

        EObject lv_field_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1345:2: ( ( ( (lv_function_0_0= ruleFnDecl ) ) | ( (lv_field_1_0= ruleFieldDecl ) ) ) )
            // InternalFortXTrans.g:1346:2: ( ( (lv_function_0_0= ruleFnDecl ) ) | ( (lv_field_1_0= ruleFieldDecl ) ) )
            {
            // InternalFortXTrans.g:1346:2: ( ( (lv_function_0_0= ruleFnDecl ) ) | ( (lv_field_1_0= ruleFieldDecl ) ) )
            int alt27=2;
            switch ( input.LA(1) ) {
            case 31:
                {
                switch ( input.LA(2) ) {
                case 35:
                case 53:
                case 54:
                    {
                    alt27=2;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA27_3 = input.LA(3);

                    if ( ((LA27_3>=37 && LA27_3<=38)) ) {
                        alt27=2;
                    }
                    else if ( (LA27_3==RULE_ID||LA27_3==35||LA27_3==53) ) {
                        alt27=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    {
                    alt27=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }

                }
                break;
            case 32:
            case 33:
            case 34:
                {
                alt27=1;
                }
                break;
            case RULE_ID:
                {
                int LA27_3 = input.LA(2);

                if ( ((LA27_3>=37 && LA27_3<=38)) ) {
                    alt27=2;
                }
                else if ( (LA27_3==RULE_ID||LA27_3==35||LA27_3==53) ) {
                    alt27=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 3, input);

                    throw nvae;
                }
                }
                break;
            case 35:
            case 53:
            case 54:
                {
                alt27=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalFortXTrans.g:1347:3: ( (lv_function_0_0= ruleFnDecl ) )
                    {
                    // InternalFortXTrans.g:1347:3: ( (lv_function_0_0= ruleFnDecl ) )
                    // InternalFortXTrans.g:1348:4: (lv_function_0_0= ruleFnDecl )
                    {
                    // InternalFortXTrans.g:1348:4: (lv_function_0_0= ruleFnDecl )
                    // InternalFortXTrans.g:1349:5: lv_function_0_0= ruleFnDecl
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
                    // InternalFortXTrans.g:1367:3: ( (lv_field_1_0= ruleFieldDecl ) )
                    {
                    // InternalFortXTrans.g:1367:3: ( (lv_field_1_0= ruleFieldDecl ) )
                    // InternalFortXTrans.g:1368:4: (lv_field_1_0= ruleFieldDecl )
                    {
                    // InternalFortXTrans.g:1368:4: (lv_field_1_0= ruleFieldDecl )
                    // InternalFortXTrans.g:1369:5: lv_field_1_0= ruleFieldDecl
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


    // $ANTLR start "entryRuleFnMods"
    // InternalFortXTrans.g:1390:1: entryRuleFnMods returns [EObject current=null] : iv_ruleFnMods= ruleFnMods EOF ;
    public final EObject entryRuleFnMods() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFnMods = null;


        try {
            // InternalFortXTrans.g:1390:47: (iv_ruleFnMods= ruleFnMods EOF )
            // InternalFortXTrans.g:1391:2: iv_ruleFnMods= ruleFnMods EOF
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
    // InternalFortXTrans.g:1397:1: ruleFnMods returns [EObject current=null] : ( (lv_mods_0_0= ruleFnMod ) )+ ;
    public final EObject ruleFnMods() throws RecognitionException {
        EObject current = null;

        EObject lv_mods_0_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1403:2: ( ( (lv_mods_0_0= ruleFnMod ) )+ )
            // InternalFortXTrans.g:1404:2: ( (lv_mods_0_0= ruleFnMod ) )+
            {
            // InternalFortXTrans.g:1404:2: ( (lv_mods_0_0= ruleFnMod ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=31 && LA28_0<=34)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalFortXTrans.g:1405:3: (lv_mods_0_0= ruleFnMod )
            	    {
            	    // InternalFortXTrans.g:1405:3: (lv_mods_0_0= ruleFnMod )
            	    // InternalFortXTrans.g:1406:4: lv_mods_0_0= ruleFnMod
            	    {

            	    				newCompositeNode(grammarAccess.getFnModsAccess().getModsFnModParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_20);
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
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
    // InternalFortXTrans.g:1426:1: entryRuleFnMod returns [EObject current=null] : iv_ruleFnMod= ruleFnMod EOF ;
    public final EObject entryRuleFnMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFnMod = null;


        try {
            // InternalFortXTrans.g:1426:46: (iv_ruleFnMod= ruleFnMod EOF )
            // InternalFortXTrans.g:1427:2: iv_ruleFnMod= ruleFnMod EOF
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
    // InternalFortXTrans.g:1433:1: ruleFnMod returns [EObject current=null] : ( ( (lv_modtype_0_0= 'private' ) ) | ( (lv_modtype_1_0= 'test' ) ) | ( (lv_modtype_2_0= 'atomic' ) ) | ( (lv_modtype_3_0= 'io' ) ) ) ;
    public final EObject ruleFnMod() throws RecognitionException {
        EObject current = null;

        Token lv_modtype_0_0=null;
        Token lv_modtype_1_0=null;
        Token lv_modtype_2_0=null;
        Token lv_modtype_3_0=null;


        	enterRule();

        try {
            // InternalFortXTrans.g:1439:2: ( ( ( (lv_modtype_0_0= 'private' ) ) | ( (lv_modtype_1_0= 'test' ) ) | ( (lv_modtype_2_0= 'atomic' ) ) | ( (lv_modtype_3_0= 'io' ) ) ) )
            // InternalFortXTrans.g:1440:2: ( ( (lv_modtype_0_0= 'private' ) ) | ( (lv_modtype_1_0= 'test' ) ) | ( (lv_modtype_2_0= 'atomic' ) ) | ( (lv_modtype_3_0= 'io' ) ) )
            {
            // InternalFortXTrans.g:1440:2: ( ( (lv_modtype_0_0= 'private' ) ) | ( (lv_modtype_1_0= 'test' ) ) | ( (lv_modtype_2_0= 'atomic' ) ) | ( (lv_modtype_3_0= 'io' ) ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt29=1;
                }
                break;
            case 32:
                {
                alt29=2;
                }
                break;
            case 33:
                {
                alt29=3;
                }
                break;
            case 34:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalFortXTrans.g:1441:3: ( (lv_modtype_0_0= 'private' ) )
                    {
                    // InternalFortXTrans.g:1441:3: ( (lv_modtype_0_0= 'private' ) )
                    // InternalFortXTrans.g:1442:4: (lv_modtype_0_0= 'private' )
                    {
                    // InternalFortXTrans.g:1442:4: (lv_modtype_0_0= 'private' )
                    // InternalFortXTrans.g:1443:5: lv_modtype_0_0= 'private'
                    {
                    lv_modtype_0_0=(Token)match(input,31,FOLLOW_2); 

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
                    // InternalFortXTrans.g:1456:3: ( (lv_modtype_1_0= 'test' ) )
                    {
                    // InternalFortXTrans.g:1456:3: ( (lv_modtype_1_0= 'test' ) )
                    // InternalFortXTrans.g:1457:4: (lv_modtype_1_0= 'test' )
                    {
                    // InternalFortXTrans.g:1457:4: (lv_modtype_1_0= 'test' )
                    // InternalFortXTrans.g:1458:5: lv_modtype_1_0= 'test'
                    {
                    lv_modtype_1_0=(Token)match(input,32,FOLLOW_2); 

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
                    // InternalFortXTrans.g:1471:3: ( (lv_modtype_2_0= 'atomic' ) )
                    {
                    // InternalFortXTrans.g:1471:3: ( (lv_modtype_2_0= 'atomic' ) )
                    // InternalFortXTrans.g:1472:4: (lv_modtype_2_0= 'atomic' )
                    {
                    // InternalFortXTrans.g:1472:4: (lv_modtype_2_0= 'atomic' )
                    // InternalFortXTrans.g:1473:5: lv_modtype_2_0= 'atomic'
                    {
                    lv_modtype_2_0=(Token)match(input,33,FOLLOW_2); 

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
                    // InternalFortXTrans.g:1486:3: ( (lv_modtype_3_0= 'io' ) )
                    {
                    // InternalFortXTrans.g:1486:3: ( (lv_modtype_3_0= 'io' ) )
                    // InternalFortXTrans.g:1487:4: (lv_modtype_3_0= 'io' )
                    {
                    // InternalFortXTrans.g:1487:4: (lv_modtype_3_0= 'io' )
                    // InternalFortXTrans.g:1488:5: lv_modtype_3_0= 'io'
                    {
                    lv_modtype_3_0=(Token)match(input,34,FOLLOW_2); 

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


    // $ANTLR start "entryRuleValParam"
    // InternalFortXTrans.g:1504:1: entryRuleValParam returns [EObject current=null] : iv_ruleValParam= ruleValParam EOF ;
    public final EObject entryRuleValParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValParam = null;


        try {
            // InternalFortXTrans.g:1504:49: (iv_ruleValParam= ruleValParam EOF )
            // InternalFortXTrans.g:1505:2: iv_ruleValParam= ruleValParam EOF
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
    // InternalFortXTrans.g:1511:1: ruleValParam returns [EObject current=null] : ( ( (lv_params_0_0= ruleParam ) ) | ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' ) ) ;
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
            // InternalFortXTrans.g:1517:2: ( ( ( (lv_params_0_0= ruleParam ) ) | ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' ) ) )
            // InternalFortXTrans.g:1518:2: ( ( (lv_params_0_0= ruleParam ) ) | ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' ) )
            {
            // InternalFortXTrans.g:1518:2: ( ( (lv_params_0_0= ruleParam ) ) | ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID||LA32_0==53) ) {
                alt32=1;
            }
            else if ( (LA32_0==35) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalFortXTrans.g:1519:3: ( (lv_params_0_0= ruleParam ) )
                    {
                    // InternalFortXTrans.g:1519:3: ( (lv_params_0_0= ruleParam ) )
                    // InternalFortXTrans.g:1520:4: (lv_params_0_0= ruleParam )
                    {
                    // InternalFortXTrans.g:1520:4: (lv_params_0_0= ruleParam )
                    // InternalFortXTrans.g:1521:5: lv_params_0_0= ruleParam
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
                    // InternalFortXTrans.g:1539:3: ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' )
                    {
                    // InternalFortXTrans.g:1539:3: ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' )
                    // InternalFortXTrans.g:1540:4: ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')'
                    {
                    // InternalFortXTrans.g:1540:4: ( (lv_brack_1_0= '(' ) )
                    // InternalFortXTrans.g:1541:5: (lv_brack_1_0= '(' )
                    {
                    // InternalFortXTrans.g:1541:5: (lv_brack_1_0= '(' )
                    // InternalFortXTrans.g:1542:6: lv_brack_1_0= '('
                    {
                    lv_brack_1_0=(Token)match(input,35,FOLLOW_21); 

                    						newLeafNode(lv_brack_1_0, grammarAccess.getValParamAccess().getBrackLeftParenthesisKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValParamRule());
                    						}
                    						setWithLastConsumed(current, "brack", lv_brack_1_0, "(");
                    					

                    }


                    }

                    // InternalFortXTrans.g:1554:4: ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_ID||LA31_0==53) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalFortXTrans.g:1555:5: ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )*
                            {
                            // InternalFortXTrans.g:1555:5: ( (lv_params_2_0= ruleParam ) )
                            // InternalFortXTrans.g:1556:6: (lv_params_2_0= ruleParam )
                            {
                            // InternalFortXTrans.g:1556:6: (lv_params_2_0= ruleParam )
                            // InternalFortXTrans.g:1557:7: lv_params_2_0= ruleParam
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

                            // InternalFortXTrans.g:1574:5: (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==26) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // InternalFortXTrans.g:1575:6: otherlv_3= ',' ( (lv_params_4_0= ruleParam ) )
                            	    {
                            	    otherlv_3=(Token)match(input,26,FOLLOW_23); 

                            	    						newLeafNode(otherlv_3, grammarAccess.getValParamAccess().getCommaKeyword_1_1_1_0());
                            	    					
                            	    // InternalFortXTrans.g:1579:6: ( (lv_params_4_0= ruleParam ) )
                            	    // InternalFortXTrans.g:1580:7: (lv_params_4_0= ruleParam )
                            	    {
                            	    // InternalFortXTrans.g:1580:7: (lv_params_4_0= ruleParam )
                            	    // InternalFortXTrans.g:1581:8: lv_params_4_0= ruleParam
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
                            	    break loop30;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,36,FOLLOW_2); 

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
    // InternalFortXTrans.g:1609:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalFortXTrans.g:1609:46: (iv_ruleParam= ruleParam EOF )
            // InternalFortXTrans.g:1610:2: iv_ruleParam= ruleParam EOF
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
    // InternalFortXTrans.g:1616:1: ruleParam returns [EObject current=null] : ( ( (lv_bId_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_bId_0_0 = null;

        EObject lv_istype_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1622:2: ( ( ( (lv_bId_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) ) ) )
            // InternalFortXTrans.g:1623:2: ( ( (lv_bId_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) ) )
            {
            // InternalFortXTrans.g:1623:2: ( ( (lv_bId_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) ) )
            // InternalFortXTrans.g:1624:3: ( (lv_bId_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) )
            {
            // InternalFortXTrans.g:1624:3: ( (lv_bId_0_0= ruleBindId ) )
            // InternalFortXTrans.g:1625:4: (lv_bId_0_0= ruleBindId )
            {
            // InternalFortXTrans.g:1625:4: (lv_bId_0_0= ruleBindId )
            // InternalFortXTrans.g:1626:5: lv_bId_0_0= ruleBindId
            {

            					newCompositeNode(grammarAccess.getParamAccess().getBIdBindIdParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_bId_0_0=ruleBindId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParamRule());
            					}
            					set(
            						current,
            						"bId",
            						lv_bId_0_0,
            						"srf.transpiler.fortxtrans.FortXTrans.BindId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFortXTrans.g:1643:3: ( (lv_istype_1_0= ruleIsType ) )
            // InternalFortXTrans.g:1644:4: (lv_istype_1_0= ruleIsType )
            {
            // InternalFortXTrans.g:1644:4: (lv_istype_1_0= ruleIsType )
            // InternalFortXTrans.g:1645:5: lv_istype_1_0= ruleIsType
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
    // InternalFortXTrans.g:1666:1: entryRuleRetType returns [EObject current=null] : iv_ruleRetType= ruleRetType EOF ;
    public final EObject entryRuleRetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetType = null;


        try {
            // InternalFortXTrans.g:1666:48: (iv_ruleRetType= ruleRetType EOF )
            // InternalFortXTrans.g:1667:2: iv_ruleRetType= ruleRetType EOF
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
    // InternalFortXTrans.g:1673:1: ruleRetType returns [EObject current=null] : ( (otherlv_0= ':' ( (lv_empty_1_0= '(' ) ) otherlv_2= ')' ) | (otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) ) ;
    public final EObject ruleRetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_empty_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1679:2: ( ( (otherlv_0= ':' ( (lv_empty_1_0= '(' ) ) otherlv_2= ')' ) | (otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) ) )
            // InternalFortXTrans.g:1680:2: ( (otherlv_0= ':' ( (lv_empty_1_0= '(' ) ) otherlv_2= ')' ) | (otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) )
            {
            // InternalFortXTrans.g:1680:2: ( (otherlv_0= ':' ( (lv_empty_1_0= '(' ) ) otherlv_2= ')' ) | (otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==35) ) {
                    alt33=1;
                }
                else if ( (LA33_1==RULE_ID) ) {
                    alt33=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalFortXTrans.g:1681:3: (otherlv_0= ':' ( (lv_empty_1_0= '(' ) ) otherlv_2= ')' )
                    {
                    // InternalFortXTrans.g:1681:3: (otherlv_0= ':' ( (lv_empty_1_0= '(' ) ) otherlv_2= ')' )
                    // InternalFortXTrans.g:1682:4: otherlv_0= ':' ( (lv_empty_1_0= '(' ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_25); 

                    				newLeafNode(otherlv_0, grammarAccess.getRetTypeAccess().getColonKeyword_0_0());
                    			
                    // InternalFortXTrans.g:1686:4: ( (lv_empty_1_0= '(' ) )
                    // InternalFortXTrans.g:1687:5: (lv_empty_1_0= '(' )
                    {
                    // InternalFortXTrans.g:1687:5: (lv_empty_1_0= '(' )
                    // InternalFortXTrans.g:1688:6: lv_empty_1_0= '('
                    {
                    lv_empty_1_0=(Token)match(input,35,FOLLOW_26); 

                    						newLeafNode(lv_empty_1_0, grammarAccess.getRetTypeAccess().getEmptyLeftParenthesisKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRetTypeRule());
                    						}
                    						setWithLastConsumed(current, "empty", lv_empty_1_0, "(");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getRetTypeAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1706:3: (otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )
                    {
                    // InternalFortXTrans.g:1706:3: (otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )
                    // InternalFortXTrans.g:1707:4: otherlv_3= ':' ( (lv_type_4_0= ruleType ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRetTypeAccess().getColonKeyword_1_0());
                    			
                    // InternalFortXTrans.g:1711:4: ( (lv_type_4_0= ruleType ) )
                    // InternalFortXTrans.g:1712:5: (lv_type_4_0= ruleType )
                    {
                    // InternalFortXTrans.g:1712:5: (lv_type_4_0= ruleType )
                    // InternalFortXTrans.g:1713:6: lv_type_4_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getRetTypeAccess().getTypeTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_4_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRetTypeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Type");
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
    // InternalFortXTrans.g:1735:1: entryRuleTupleType returns [EObject current=null] : iv_ruleTupleType= ruleTupleType EOF ;
    public final EObject entryRuleTupleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleType = null;


        try {
            // InternalFortXTrans.g:1735:50: (iv_ruleTupleType= ruleTupleType EOF )
            // InternalFortXTrans.g:1736:2: iv_ruleTupleType= ruleTupleType EOF
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
    // InternalFortXTrans.g:1742:1: ruleTupleType returns [EObject current=null] : (otherlv_0= '(' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleTupleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1748:2: ( (otherlv_0= '(' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* otherlv_4= ')' ) )
            // InternalFortXTrans.g:1749:2: (otherlv_0= '(' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* otherlv_4= ')' )
            {
            // InternalFortXTrans.g:1749:2: (otherlv_0= '(' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* otherlv_4= ')' )
            // InternalFortXTrans.g:1750:3: otherlv_0= '(' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTupleTypeAccess().getLeftParenthesisKeyword_0());
            		
            // InternalFortXTrans.g:1754:3: ( (lv_types_1_0= ruleType ) )
            // InternalFortXTrans.g:1755:4: (lv_types_1_0= ruleType )
            {
            // InternalFortXTrans.g:1755:4: (lv_types_1_0= ruleType )
            // InternalFortXTrans.g:1756:5: lv_types_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getTupleTypeAccess().getTypesTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_types_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTupleTypeRule());
            					}
            					add(
            						current,
            						"types",
            						lv_types_1_0,
            						"srf.transpiler.fortxtrans.FortXTrans.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFortXTrans.g:1773:3: (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==26) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalFortXTrans.g:1774:4: otherlv_2= ',' ( (lv_types_3_0= ruleType ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTupleTypeAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalFortXTrans.g:1778:4: ( (lv_types_3_0= ruleType ) )
            	    // InternalFortXTrans.g:1779:5: (lv_types_3_0= ruleType )
            	    {
            	    // InternalFortXTrans.g:1779:5: (lv_types_3_0= ruleType )
            	    // InternalFortXTrans.g:1780:6: lv_types_3_0= ruleType
            	    {

            	    						newCompositeNode(grammarAccess.getTupleTypeAccess().getTypesTypeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_types_3_0=ruleType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTupleTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_3_0,
            	    							"srf.transpiler.fortxtrans.FortXTrans.Type");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_4=(Token)match(input,36,FOLLOW_2); 

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


    // $ANTLR start "entryRuleType"
    // InternalFortXTrans.g:1806:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalFortXTrans.g:1806:45: (iv_ruleType= ruleType EOF )
            // InternalFortXTrans.g:1807:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalFortXTrans.g:1813:1: ruleType returns [EObject current=null] : ( (lv_tname_0_0= RULE_ID ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_tname_0_0=null;


        	enterRule();

        try {
            // InternalFortXTrans.g:1819:2: ( ( (lv_tname_0_0= RULE_ID ) ) )
            // InternalFortXTrans.g:1820:2: ( (lv_tname_0_0= RULE_ID ) )
            {
            // InternalFortXTrans.g:1820:2: ( (lv_tname_0_0= RULE_ID ) )
            // InternalFortXTrans.g:1821:3: (lv_tname_0_0= RULE_ID )
            {
            // InternalFortXTrans.g:1821:3: (lv_tname_0_0= RULE_ID )
            // InternalFortXTrans.g:1822:4: lv_tname_0_0= RULE_ID
            {
            lv_tname_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_tname_0_0, grammarAccess.getTypeAccess().getTnameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"tname",
            					lv_tname_0_0,
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleFnDecl"
    // InternalFortXTrans.g:1841:1: entryRuleFnDecl returns [EObject current=null] : iv_ruleFnDecl= ruleFnDecl EOF ;
    public final EObject entryRuleFnDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFnDecl = null;


        try {
            // InternalFortXTrans.g:1841:47: (iv_ruleFnDecl= ruleFnDecl EOF )
            // InternalFortXTrans.g:1842:2: iv_ruleFnDecl= ruleFnDecl EOF
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
    // InternalFortXTrans.g:1848:1: ruleFnDecl returns [EObject current=null] : ( ( (lv_mods_0_0= ruleFnMods ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleValParam ) ) ( (lv_retVal_3_0= ruleRetType ) )? ( ( (lv_body_4_0= '=' ) ) ( (lv_fnItself_5_0= ruleExpr ) ) )? ) ;
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
            // InternalFortXTrans.g:1854:2: ( ( ( (lv_mods_0_0= ruleFnMods ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleValParam ) ) ( (lv_retVal_3_0= ruleRetType ) )? ( ( (lv_body_4_0= '=' ) ) ( (lv_fnItself_5_0= ruleExpr ) ) )? ) )
            // InternalFortXTrans.g:1855:2: ( ( (lv_mods_0_0= ruleFnMods ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleValParam ) ) ( (lv_retVal_3_0= ruleRetType ) )? ( ( (lv_body_4_0= '=' ) ) ( (lv_fnItself_5_0= ruleExpr ) ) )? )
            {
            // InternalFortXTrans.g:1855:2: ( ( (lv_mods_0_0= ruleFnMods ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleValParam ) ) ( (lv_retVal_3_0= ruleRetType ) )? ( ( (lv_body_4_0= '=' ) ) ( (lv_fnItself_5_0= ruleExpr ) ) )? )
            // InternalFortXTrans.g:1856:3: ( (lv_mods_0_0= ruleFnMods ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleValParam ) ) ( (lv_retVal_3_0= ruleRetType ) )? ( ( (lv_body_4_0= '=' ) ) ( (lv_fnItself_5_0= ruleExpr ) ) )?
            {
            // InternalFortXTrans.g:1856:3: ( (lv_mods_0_0= ruleFnMods ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=31 && LA35_0<=34)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalFortXTrans.g:1857:4: (lv_mods_0_0= ruleFnMods )
                    {
                    // InternalFortXTrans.g:1857:4: (lv_mods_0_0= ruleFnMods )
                    // InternalFortXTrans.g:1858:5: lv_mods_0_0= ruleFnMods
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

            // InternalFortXTrans.g:1875:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFortXTrans.g:1876:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFortXTrans.g:1876:4: (lv_name_1_0= RULE_ID )
            // InternalFortXTrans.g:1877:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

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

            // InternalFortXTrans.g:1893:3: ( (lv_params_2_0= ruleValParam ) )
            // InternalFortXTrans.g:1894:4: (lv_params_2_0= ruleValParam )
            {
            // InternalFortXTrans.g:1894:4: (lv_params_2_0= ruleValParam )
            // InternalFortXTrans.g:1895:5: lv_params_2_0= ruleValParam
            {

            					newCompositeNode(grammarAccess.getFnDeclAccess().getParamsValParamParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalFortXTrans.g:1912:3: ( (lv_retVal_3_0= ruleRetType ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==37) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalFortXTrans.g:1913:4: (lv_retVal_3_0= ruleRetType )
                    {
                    // InternalFortXTrans.g:1913:4: (lv_retVal_3_0= ruleRetType )
                    // InternalFortXTrans.g:1914:5: lv_retVal_3_0= ruleRetType
                    {

                    					newCompositeNode(grammarAccess.getFnDeclAccess().getRetValRetTypeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_29);
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

            // InternalFortXTrans.g:1931:3: ( ( (lv_body_4_0= '=' ) ) ( (lv_fnItself_5_0= ruleExpr ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==38) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalFortXTrans.g:1932:4: ( (lv_body_4_0= '=' ) ) ( (lv_fnItself_5_0= ruleExpr ) )
                    {
                    // InternalFortXTrans.g:1932:4: ( (lv_body_4_0= '=' ) )
                    // InternalFortXTrans.g:1933:5: (lv_body_4_0= '=' )
                    {
                    // InternalFortXTrans.g:1933:5: (lv_body_4_0= '=' )
                    // InternalFortXTrans.g:1934:6: lv_body_4_0= '='
                    {
                    lv_body_4_0=(Token)match(input,38,FOLLOW_30); 

                    						newLeafNode(lv_body_4_0, grammarAccess.getFnDeclAccess().getBodyEqualsSignKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFnDeclRule());
                    						}
                    						setWithLastConsumed(current, "body", true, "=");
                    					

                    }


                    }

                    // InternalFortXTrans.g:1946:4: ( (lv_fnItself_5_0= ruleExpr ) )
                    // InternalFortXTrans.g:1947:5: (lv_fnItself_5_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:1947:5: (lv_fnItself_5_0= ruleExpr )
                    // InternalFortXTrans.g:1948:6: lv_fnItself_5_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getFnDeclAccess().getFnItselfExprParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_fnItself_5_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFnDeclRule());
                    						}
                    						set(
                    							current,
                    							"fnItself",
                    							lv_fnItself_5_0,
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
    // $ANTLR end "ruleFnDecl"


    // $ANTLR start "entryRuleExpr"
    // InternalFortXTrans.g:1970:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalFortXTrans.g:1970:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalFortXTrans.g:1971:2: iv_ruleExpr= ruleExpr EOF
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
    // InternalFortXTrans.g:1977:1: ruleExpr returns [EObject current=null] : ( ( ( (lv_front_0_0= ruleExprFront ) ) ( (lv_tails_1_0= ruleExprTail ) )* ) | ( (lv_locVar_2_0= ruleLocalVarDecl ) ) | ( (lv_lit_3_0= ruleLiteralTuple ) ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_front_0_0 = null;

        EObject lv_tails_1_0 = null;

        EObject lv_locVar_2_0 = null;

        EObject lv_lit_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1983:2: ( ( ( ( (lv_front_0_0= ruleExprFront ) ) ( (lv_tails_1_0= ruleExprTail ) )* ) | ( (lv_locVar_2_0= ruleLocalVarDecl ) ) | ( (lv_lit_3_0= ruleLiteralTuple ) ) ) )
            // InternalFortXTrans.g:1984:2: ( ( ( (lv_front_0_0= ruleExprFront ) ) ( (lv_tails_1_0= ruleExprTail ) )* ) | ( (lv_locVar_2_0= ruleLocalVarDecl ) ) | ( (lv_lit_3_0= ruleLiteralTuple ) ) )
            {
            // InternalFortXTrans.g:1984:2: ( ( ( (lv_front_0_0= ruleExprFront ) ) ( (lv_tails_1_0= ruleExprTail ) )* ) | ( (lv_locVar_2_0= ruleLocalVarDecl ) ) | ( (lv_lit_3_0= ruleLiteralTuple ) ) )
            int alt39=3;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // InternalFortXTrans.g:1985:3: ( ( (lv_front_0_0= ruleExprFront ) ) ( (lv_tails_1_0= ruleExprTail ) )* )
                    {
                    // InternalFortXTrans.g:1985:3: ( ( (lv_front_0_0= ruleExprFront ) ) ( (lv_tails_1_0= ruleExprTail ) )* )
                    // InternalFortXTrans.g:1986:4: ( (lv_front_0_0= ruleExprFront ) ) ( (lv_tails_1_0= ruleExprTail ) )*
                    {
                    // InternalFortXTrans.g:1986:4: ( (lv_front_0_0= ruleExprFront ) )
                    // InternalFortXTrans.g:1987:5: (lv_front_0_0= ruleExprFront )
                    {
                    // InternalFortXTrans.g:1987:5: (lv_front_0_0= ruleExprFront )
                    // InternalFortXTrans.g:1988:6: lv_front_0_0= ruleExprFront
                    {

                    						newCompositeNode(grammarAccess.getExprAccess().getFrontExprFrontParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_front_0_0=ruleExprFront();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExprRule());
                    						}
                    						set(
                    							current,
                    							"front",
                    							lv_front_0_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.ExprFront");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:2005:4: ( (lv_tails_1_0= ruleExprTail ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==30) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalFortXTrans.g:2006:5: (lv_tails_1_0= ruleExprTail )
                    	    {
                    	    // InternalFortXTrans.g:2006:5: (lv_tails_1_0= ruleExprTail )
                    	    // InternalFortXTrans.g:2007:6: lv_tails_1_0= ruleExprTail
                    	    {

                    	    						newCompositeNode(grammarAccess.getExprAccess().getTailsExprTailParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_tails_1_0=ruleExprTail();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getExprRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"tails",
                    	    							lv_tails_1_0,
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
                    break;
                case 2 :
                    // InternalFortXTrans.g:2026:3: ( (lv_locVar_2_0= ruleLocalVarDecl ) )
                    {
                    // InternalFortXTrans.g:2026:3: ( (lv_locVar_2_0= ruleLocalVarDecl ) )
                    // InternalFortXTrans.g:2027:4: (lv_locVar_2_0= ruleLocalVarDecl )
                    {
                    // InternalFortXTrans.g:2027:4: (lv_locVar_2_0= ruleLocalVarDecl )
                    // InternalFortXTrans.g:2028:5: lv_locVar_2_0= ruleLocalVarDecl
                    {

                    					newCompositeNode(grammarAccess.getExprAccess().getLocVarLocalVarDeclParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_locVar_2_0=ruleLocalVarDecl();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExprRule());
                    					}
                    					set(
                    						current,
                    						"locVar",
                    						lv_locVar_2_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.LocalVarDecl");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:2046:3: ( (lv_lit_3_0= ruleLiteralTuple ) )
                    {
                    // InternalFortXTrans.g:2046:3: ( (lv_lit_3_0= ruleLiteralTuple ) )
                    // InternalFortXTrans.g:2047:4: (lv_lit_3_0= ruleLiteralTuple )
                    {
                    // InternalFortXTrans.g:2047:4: (lv_lit_3_0= ruleLiteralTuple )
                    // InternalFortXTrans.g:2048:5: lv_lit_3_0= ruleLiteralTuple
                    {

                    					newCompositeNode(grammarAccess.getExprAccess().getLitLiteralTupleParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_lit_3_0=ruleLiteralTuple();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExprRule());
                    					}
                    					set(
                    						current,
                    						"lit",
                    						lv_lit_3_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.LiteralTuple");
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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExprFront"
    // InternalFortXTrans.g:2069:1: entryRuleExprFront returns [EObject current=null] : iv_ruleExprFront= ruleExprFront EOF ;
    public final EObject entryRuleExprFront() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprFront = null;


        try {
            // InternalFortXTrans.g:2069:50: (iv_ruleExprFront= ruleExprFront EOF )
            // InternalFortXTrans.g:2070:2: iv_ruleExprFront= ruleExprFront EOF
            {
             newCompositeNode(grammarAccess.getExprFrontRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprFront=ruleExprFront();

            state._fsp--;

             current =iv_ruleExprFront; 
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
    // $ANTLR end "entryRuleExprFront"


    // $ANTLR start "ruleExprFront"
    // InternalFortXTrans.g:2076:1: ruleExprFront returns [EObject current=null] : ( ( (lv_delim_0_0= ruleDelimitedExpr ) ) | ( (lv_id_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleExprFront() throws RecognitionException {
        EObject current = null;

        EObject lv_delim_0_0 = null;

        AntlrDatatypeRuleToken lv_id_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2082:2: ( ( ( (lv_delim_0_0= ruleDelimitedExpr ) ) | ( (lv_id_1_0= ruleQualifiedName ) ) ) )
            // InternalFortXTrans.g:2083:2: ( ( (lv_delim_0_0= ruleDelimitedExpr ) ) | ( (lv_id_1_0= ruleQualifiedName ) ) )
            {
            // InternalFortXTrans.g:2083:2: ( ( (lv_delim_0_0= ruleDelimitedExpr ) ) | ( (lv_id_1_0= ruleQualifiedName ) ) )
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // InternalFortXTrans.g:2084:3: ( (lv_delim_0_0= ruleDelimitedExpr ) )
                    {
                    // InternalFortXTrans.g:2084:3: ( (lv_delim_0_0= ruleDelimitedExpr ) )
                    // InternalFortXTrans.g:2085:4: (lv_delim_0_0= ruleDelimitedExpr )
                    {
                    // InternalFortXTrans.g:2085:4: (lv_delim_0_0= ruleDelimitedExpr )
                    // InternalFortXTrans.g:2086:5: lv_delim_0_0= ruleDelimitedExpr
                    {

                    					newCompositeNode(grammarAccess.getExprFrontAccess().getDelimDelimitedExprParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_delim_0_0=ruleDelimitedExpr();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExprFrontRule());
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
                    break;
                case 2 :
                    // InternalFortXTrans.g:2104:3: ( (lv_id_1_0= ruleQualifiedName ) )
                    {
                    // InternalFortXTrans.g:2104:3: ( (lv_id_1_0= ruleQualifiedName ) )
                    // InternalFortXTrans.g:2105:4: (lv_id_1_0= ruleQualifiedName )
                    {
                    // InternalFortXTrans.g:2105:4: (lv_id_1_0= ruleQualifiedName )
                    // InternalFortXTrans.g:2106:5: lv_id_1_0= ruleQualifiedName
                    {

                    					newCompositeNode(grammarAccess.getExprFrontAccess().getIdQualifiedNameParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_id_1_0=ruleQualifiedName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExprFrontRule());
                    					}
                    					set(
                    						current,
                    						"id",
                    						lv_id_1_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.QualifiedName");
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
    // $ANTLR end "ruleExprFront"


    // $ANTLR start "entryRuleExprTail"
    // InternalFortXTrans.g:2127:1: entryRuleExprTail returns [EObject current=null] : iv_ruleExprTail= ruleExprTail EOF ;
    public final EObject entryRuleExprTail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprTail = null;


        try {
            // InternalFortXTrans.g:2127:49: (iv_ruleExprTail= ruleExprTail EOF )
            // InternalFortXTrans.g:2128:2: iv_ruleExprTail= ruleExprTail EOF
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
    // InternalFortXTrans.g:2134:1: ruleExprTail returns [EObject current=null] : (otherlv_0= 'as' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleExprTail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2140:2: ( (otherlv_0= 'as' ( (lv_type_1_0= ruleType ) ) ) )
            // InternalFortXTrans.g:2141:2: (otherlv_0= 'as' ( (lv_type_1_0= ruleType ) ) )
            {
            // InternalFortXTrans.g:2141:2: (otherlv_0= 'as' ( (lv_type_1_0= ruleType ) ) )
            // InternalFortXTrans.g:2142:3: otherlv_0= 'as' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExprTailAccess().getAsKeyword_0());
            		
            // InternalFortXTrans.g:2146:3: ( (lv_type_1_0= ruleType ) )
            // InternalFortXTrans.g:2147:4: (lv_type_1_0= ruleType )
            {
            // InternalFortXTrans.g:2147:4: (lv_type_1_0= ruleType )
            // InternalFortXTrans.g:2148:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getExprTailAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExprTailRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"srf.transpiler.fortxtrans.FortXTrans.Type");
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
    // InternalFortXTrans.g:2169:1: entryRuleDelimitedExpr returns [EObject current=null] : iv_ruleDelimitedExpr= ruleDelimitedExpr EOF ;
    public final EObject entryRuleDelimitedExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelimitedExpr = null;


        try {
            // InternalFortXTrans.g:2169:54: (iv_ruleDelimitedExpr= ruleDelimitedExpr EOF )
            // InternalFortXTrans.g:2170:2: iv_ruleDelimitedExpr= ruleDelimitedExpr EOF
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
    // InternalFortXTrans.g:2176:1: ruleDelimitedExpr returns [EObject current=null] : ( ( (lv_dod_0_0= ruleDo ) ) | ( ( (lv_lits_1_0= ruleLiteralTuple ) ) ( (lv_eqop_2_0= ':=' ) ) ( (lv_pblock_3_0= ruleParBlockElems ) ) ) | ( ( (lv_ret_4_0= 'return' ) ) ( (lv_block_5_0= ruleBlockElem ) ) ) | ( ( (lv_awhile_6_0= 'while' ) ) ( (lv_expr_7_0= ruleExpr ) ) ( (lv_whiledod_8_0= ruleDo ) ) ) | ( ( (lv_afor_9_0= 'for' ) ) ( (lv_gen_10_0= ruleGenerators ) ) ( (lv_dofront_11_0= ruleDoFront ) ) otherlv_12= 'end' ) | ( ( (lv_anif_13_0= 'if' ) ) ( (lv_cond_14_0= ruleExpr ) ) otherlv_15= 'then' ( (lv_blocks_16_0= ruleBlockElems ) ) ( (lv_elifs_17_0= ruleElifs ) )? ( (lv_els_18_0= ruleElse ) )? otherlv_19= 'end' ) | ( (lv_par_20_0= ruleParanthesized ) ) | (otherlv_21= '|' ( (lv_parblock_22_0= ruleParBlockElems ) ) otherlv_23= '|' ) ) ;
    public final EObject ruleDelimitedExpr() throws RecognitionException {
        EObject current = null;

        Token lv_eqop_2_0=null;
        Token lv_ret_4_0=null;
        Token lv_awhile_6_0=null;
        Token lv_afor_9_0=null;
        Token otherlv_12=null;
        Token lv_anif_13_0=null;
        Token otherlv_15=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        EObject lv_dod_0_0 = null;

        EObject lv_lits_1_0 = null;

        EObject lv_pblock_3_0 = null;

        EObject lv_block_5_0 = null;

        EObject lv_expr_7_0 = null;

        EObject lv_whiledod_8_0 = null;

        EObject lv_gen_10_0 = null;

        EObject lv_dofront_11_0 = null;

        EObject lv_cond_14_0 = null;

        EObject lv_blocks_16_0 = null;

        EObject lv_elifs_17_0 = null;

        EObject lv_els_18_0 = null;

        EObject lv_par_20_0 = null;

        EObject lv_parblock_22_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2182:2: ( ( ( (lv_dod_0_0= ruleDo ) ) | ( ( (lv_lits_1_0= ruleLiteralTuple ) ) ( (lv_eqop_2_0= ':=' ) ) ( (lv_pblock_3_0= ruleParBlockElems ) ) ) | ( ( (lv_ret_4_0= 'return' ) ) ( (lv_block_5_0= ruleBlockElem ) ) ) | ( ( (lv_awhile_6_0= 'while' ) ) ( (lv_expr_7_0= ruleExpr ) ) ( (lv_whiledod_8_0= ruleDo ) ) ) | ( ( (lv_afor_9_0= 'for' ) ) ( (lv_gen_10_0= ruleGenerators ) ) ( (lv_dofront_11_0= ruleDoFront ) ) otherlv_12= 'end' ) | ( ( (lv_anif_13_0= 'if' ) ) ( (lv_cond_14_0= ruleExpr ) ) otherlv_15= 'then' ( (lv_blocks_16_0= ruleBlockElems ) ) ( (lv_elifs_17_0= ruleElifs ) )? ( (lv_els_18_0= ruleElse ) )? otherlv_19= 'end' ) | ( (lv_par_20_0= ruleParanthesized ) ) | (otherlv_21= '|' ( (lv_parblock_22_0= ruleParBlockElems ) ) otherlv_23= '|' ) ) )
            // InternalFortXTrans.g:2183:2: ( ( (lv_dod_0_0= ruleDo ) ) | ( ( (lv_lits_1_0= ruleLiteralTuple ) ) ( (lv_eqop_2_0= ':=' ) ) ( (lv_pblock_3_0= ruleParBlockElems ) ) ) | ( ( (lv_ret_4_0= 'return' ) ) ( (lv_block_5_0= ruleBlockElem ) ) ) | ( ( (lv_awhile_6_0= 'while' ) ) ( (lv_expr_7_0= ruleExpr ) ) ( (lv_whiledod_8_0= ruleDo ) ) ) | ( ( (lv_afor_9_0= 'for' ) ) ( (lv_gen_10_0= ruleGenerators ) ) ( (lv_dofront_11_0= ruleDoFront ) ) otherlv_12= 'end' ) | ( ( (lv_anif_13_0= 'if' ) ) ( (lv_cond_14_0= ruleExpr ) ) otherlv_15= 'then' ( (lv_blocks_16_0= ruleBlockElems ) ) ( (lv_elifs_17_0= ruleElifs ) )? ( (lv_els_18_0= ruleElse ) )? otherlv_19= 'end' ) | ( (lv_par_20_0= ruleParanthesized ) ) | (otherlv_21= '|' ( (lv_parblock_22_0= ruleParBlockElems ) ) otherlv_23= '|' ) )
            {
            // InternalFortXTrans.g:2183:2: ( ( (lv_dod_0_0= ruleDo ) ) | ( ( (lv_lits_1_0= ruleLiteralTuple ) ) ( (lv_eqop_2_0= ':=' ) ) ( (lv_pblock_3_0= ruleParBlockElems ) ) ) | ( ( (lv_ret_4_0= 'return' ) ) ( (lv_block_5_0= ruleBlockElem ) ) ) | ( ( (lv_awhile_6_0= 'while' ) ) ( (lv_expr_7_0= ruleExpr ) ) ( (lv_whiledod_8_0= ruleDo ) ) ) | ( ( (lv_afor_9_0= 'for' ) ) ( (lv_gen_10_0= ruleGenerators ) ) ( (lv_dofront_11_0= ruleDoFront ) ) otherlv_12= 'end' ) | ( ( (lv_anif_13_0= 'if' ) ) ( (lv_cond_14_0= ruleExpr ) ) otherlv_15= 'then' ( (lv_blocks_16_0= ruleBlockElems ) ) ( (lv_elifs_17_0= ruleElifs ) )? ( (lv_els_18_0= ruleElse ) )? otherlv_19= 'end' ) | ( (lv_par_20_0= ruleParanthesized ) ) | (otherlv_21= '|' ( (lv_parblock_22_0= ruleParBlockElems ) ) otherlv_23= '|' ) )
            int alt43=8;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // InternalFortXTrans.g:2184:3: ( (lv_dod_0_0= ruleDo ) )
                    {
                    // InternalFortXTrans.g:2184:3: ( (lv_dod_0_0= ruleDo ) )
                    // InternalFortXTrans.g:2185:4: (lv_dod_0_0= ruleDo )
                    {
                    // InternalFortXTrans.g:2185:4: (lv_dod_0_0= ruleDo )
                    // InternalFortXTrans.g:2186:5: lv_dod_0_0= ruleDo
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
                    // InternalFortXTrans.g:2204:3: ( ( (lv_lits_1_0= ruleLiteralTuple ) ) ( (lv_eqop_2_0= ':=' ) ) ( (lv_pblock_3_0= ruleParBlockElems ) ) )
                    {
                    // InternalFortXTrans.g:2204:3: ( ( (lv_lits_1_0= ruleLiteralTuple ) ) ( (lv_eqop_2_0= ':=' ) ) ( (lv_pblock_3_0= ruleParBlockElems ) ) )
                    // InternalFortXTrans.g:2205:4: ( (lv_lits_1_0= ruleLiteralTuple ) ) ( (lv_eqop_2_0= ':=' ) ) ( (lv_pblock_3_0= ruleParBlockElems ) )
                    {
                    // InternalFortXTrans.g:2205:4: ( (lv_lits_1_0= ruleLiteralTuple ) )
                    // InternalFortXTrans.g:2206:5: (lv_lits_1_0= ruleLiteralTuple )
                    {
                    // InternalFortXTrans.g:2206:5: (lv_lits_1_0= ruleLiteralTuple )
                    // InternalFortXTrans.g:2207:6: lv_lits_1_0= ruleLiteralTuple
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getLitsLiteralTupleParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_lits_1_0=ruleLiteralTuple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                    						}
                    						set(
                    							current,
                    							"lits",
                    							lv_lits_1_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.LiteralTuple");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:2224:4: ( (lv_eqop_2_0= ':=' ) )
                    // InternalFortXTrans.g:2225:5: (lv_eqop_2_0= ':=' )
                    {
                    // InternalFortXTrans.g:2225:5: (lv_eqop_2_0= ':=' )
                    // InternalFortXTrans.g:2226:6: lv_eqop_2_0= ':='
                    {
                    lv_eqop_2_0=(Token)match(input,39,FOLLOW_25); 

                    						newLeafNode(lv_eqop_2_0, grammarAccess.getDelimitedExprAccess().getEqopColonEqualsSignKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelimitedExprRule());
                    						}
                    						setWithLastConsumed(current, "eqop", lv_eqop_2_0, ":=");
                    					

                    }


                    }

                    // InternalFortXTrans.g:2238:4: ( (lv_pblock_3_0= ruleParBlockElems ) )
                    // InternalFortXTrans.g:2239:5: (lv_pblock_3_0= ruleParBlockElems )
                    {
                    // InternalFortXTrans.g:2239:5: (lv_pblock_3_0= ruleParBlockElems )
                    // InternalFortXTrans.g:2240:6: lv_pblock_3_0= ruleParBlockElems
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getPblockParBlockElemsParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_pblock_3_0=ruleParBlockElems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                    						}
                    						set(
                    							current,
                    							"pblock",
                    							lv_pblock_3_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.ParBlockElems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:2259:3: ( ( (lv_ret_4_0= 'return' ) ) ( (lv_block_5_0= ruleBlockElem ) ) )
                    {
                    // InternalFortXTrans.g:2259:3: ( ( (lv_ret_4_0= 'return' ) ) ( (lv_block_5_0= ruleBlockElem ) ) )
                    // InternalFortXTrans.g:2260:4: ( (lv_ret_4_0= 'return' ) ) ( (lv_block_5_0= ruleBlockElem ) )
                    {
                    // InternalFortXTrans.g:2260:4: ( (lv_ret_4_0= 'return' ) )
                    // InternalFortXTrans.g:2261:5: (lv_ret_4_0= 'return' )
                    {
                    // InternalFortXTrans.g:2261:5: (lv_ret_4_0= 'return' )
                    // InternalFortXTrans.g:2262:6: lv_ret_4_0= 'return'
                    {
                    lv_ret_4_0=(Token)match(input,40,FOLLOW_30); 

                    						newLeafNode(lv_ret_4_0, grammarAccess.getDelimitedExprAccess().getRetReturnKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelimitedExprRule());
                    						}
                    						setWithLastConsumed(current, "ret", lv_ret_4_0, "return");
                    					

                    }


                    }

                    // InternalFortXTrans.g:2274:4: ( (lv_block_5_0= ruleBlockElem ) )
                    // InternalFortXTrans.g:2275:5: (lv_block_5_0= ruleBlockElem )
                    {
                    // InternalFortXTrans.g:2275:5: (lv_block_5_0= ruleBlockElem )
                    // InternalFortXTrans.g:2276:6: lv_block_5_0= ruleBlockElem
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getBlockBlockElemParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_block_5_0=ruleBlockElem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                    						}
                    						set(
                    							current,
                    							"block",
                    							lv_block_5_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.BlockElem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFortXTrans.g:2295:3: ( ( (lv_awhile_6_0= 'while' ) ) ( (lv_expr_7_0= ruleExpr ) ) ( (lv_whiledod_8_0= ruleDo ) ) )
                    {
                    // InternalFortXTrans.g:2295:3: ( ( (lv_awhile_6_0= 'while' ) ) ( (lv_expr_7_0= ruleExpr ) ) ( (lv_whiledod_8_0= ruleDo ) ) )
                    // InternalFortXTrans.g:2296:4: ( (lv_awhile_6_0= 'while' ) ) ( (lv_expr_7_0= ruleExpr ) ) ( (lv_whiledod_8_0= ruleDo ) )
                    {
                    // InternalFortXTrans.g:2296:4: ( (lv_awhile_6_0= 'while' ) )
                    // InternalFortXTrans.g:2297:5: (lv_awhile_6_0= 'while' )
                    {
                    // InternalFortXTrans.g:2297:5: (lv_awhile_6_0= 'while' )
                    // InternalFortXTrans.g:2298:6: lv_awhile_6_0= 'while'
                    {
                    lv_awhile_6_0=(Token)match(input,41,FOLLOW_30); 

                    						newLeafNode(lv_awhile_6_0, grammarAccess.getDelimitedExprAccess().getAwhileWhileKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelimitedExprRule());
                    						}
                    						setWithLastConsumed(current, "awhile", lv_awhile_6_0, "while");
                    					

                    }


                    }

                    // InternalFortXTrans.g:2310:4: ( (lv_expr_7_0= ruleExpr ) )
                    // InternalFortXTrans.g:2311:5: (lv_expr_7_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:2311:5: (lv_expr_7_0= ruleExpr )
                    // InternalFortXTrans.g:2312:6: lv_expr_7_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getExprExprParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_expr_7_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_7_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:2329:4: ( (lv_whiledod_8_0= ruleDo ) )
                    // InternalFortXTrans.g:2330:5: (lv_whiledod_8_0= ruleDo )
                    {
                    // InternalFortXTrans.g:2330:5: (lv_whiledod_8_0= ruleDo )
                    // InternalFortXTrans.g:2331:6: lv_whiledod_8_0= ruleDo
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getWhiledodDoParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_whiledod_8_0=ruleDo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                    						}
                    						set(
                    							current,
                    							"whiledod",
                    							lv_whiledod_8_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Do");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalFortXTrans.g:2350:3: ( ( (lv_afor_9_0= 'for' ) ) ( (lv_gen_10_0= ruleGenerators ) ) ( (lv_dofront_11_0= ruleDoFront ) ) otherlv_12= 'end' )
                    {
                    // InternalFortXTrans.g:2350:3: ( ( (lv_afor_9_0= 'for' ) ) ( (lv_gen_10_0= ruleGenerators ) ) ( (lv_dofront_11_0= ruleDoFront ) ) otherlv_12= 'end' )
                    // InternalFortXTrans.g:2351:4: ( (lv_afor_9_0= 'for' ) ) ( (lv_gen_10_0= ruleGenerators ) ) ( (lv_dofront_11_0= ruleDoFront ) ) otherlv_12= 'end'
                    {
                    // InternalFortXTrans.g:2351:4: ( (lv_afor_9_0= 'for' ) )
                    // InternalFortXTrans.g:2352:5: (lv_afor_9_0= 'for' )
                    {
                    // InternalFortXTrans.g:2352:5: (lv_afor_9_0= 'for' )
                    // InternalFortXTrans.g:2353:6: lv_afor_9_0= 'for'
                    {
                    lv_afor_9_0=(Token)match(input,42,FOLLOW_33); 

                    						newLeafNode(lv_afor_9_0, grammarAccess.getDelimitedExprAccess().getAforForKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelimitedExprRule());
                    						}
                    						setWithLastConsumed(current, "afor", lv_afor_9_0, "for");
                    					

                    }


                    }

                    // InternalFortXTrans.g:2365:4: ( (lv_gen_10_0= ruleGenerators ) )
                    // InternalFortXTrans.g:2366:5: (lv_gen_10_0= ruleGenerators )
                    {
                    // InternalFortXTrans.g:2366:5: (lv_gen_10_0= ruleGenerators )
                    // InternalFortXTrans.g:2367:6: lv_gen_10_0= ruleGenerators
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getGenGeneratorsParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_gen_10_0=ruleGenerators();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                    						}
                    						set(
                    							current,
                    							"gen",
                    							lv_gen_10_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Generators");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:2384:4: ( (lv_dofront_11_0= ruleDoFront ) )
                    // InternalFortXTrans.g:2385:5: (lv_dofront_11_0= ruleDoFront )
                    {
                    // InternalFortXTrans.g:2385:5: (lv_dofront_11_0= ruleDoFront )
                    // InternalFortXTrans.g:2386:6: lv_dofront_11_0= ruleDoFront
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getDofrontDoFrontParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_dofront_11_0=ruleDoFront();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                    						}
                    						set(
                    							current,
                    							"dofront",
                    							lv_dofront_11_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.DoFront");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getDelimitedExprAccess().getEndKeyword_4_3());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalFortXTrans.g:2409:3: ( ( (lv_anif_13_0= 'if' ) ) ( (lv_cond_14_0= ruleExpr ) ) otherlv_15= 'then' ( (lv_blocks_16_0= ruleBlockElems ) ) ( (lv_elifs_17_0= ruleElifs ) )? ( (lv_els_18_0= ruleElse ) )? otherlv_19= 'end' )
                    {
                    // InternalFortXTrans.g:2409:3: ( ( (lv_anif_13_0= 'if' ) ) ( (lv_cond_14_0= ruleExpr ) ) otherlv_15= 'then' ( (lv_blocks_16_0= ruleBlockElems ) ) ( (lv_elifs_17_0= ruleElifs ) )? ( (lv_els_18_0= ruleElse ) )? otherlv_19= 'end' )
                    // InternalFortXTrans.g:2410:4: ( (lv_anif_13_0= 'if' ) ) ( (lv_cond_14_0= ruleExpr ) ) otherlv_15= 'then' ( (lv_blocks_16_0= ruleBlockElems ) ) ( (lv_elifs_17_0= ruleElifs ) )? ( (lv_els_18_0= ruleElse ) )? otherlv_19= 'end'
                    {
                    // InternalFortXTrans.g:2410:4: ( (lv_anif_13_0= 'if' ) )
                    // InternalFortXTrans.g:2411:5: (lv_anif_13_0= 'if' )
                    {
                    // InternalFortXTrans.g:2411:5: (lv_anif_13_0= 'if' )
                    // InternalFortXTrans.g:2412:6: lv_anif_13_0= 'if'
                    {
                    lv_anif_13_0=(Token)match(input,43,FOLLOW_30); 

                    						newLeafNode(lv_anif_13_0, grammarAccess.getDelimitedExprAccess().getAnifIfKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelimitedExprRule());
                    						}
                    						setWithLastConsumed(current, "anif", lv_anif_13_0, "if");
                    					

                    }


                    }

                    // InternalFortXTrans.g:2424:4: ( (lv_cond_14_0= ruleExpr ) )
                    // InternalFortXTrans.g:2425:5: (lv_cond_14_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:2425:5: (lv_cond_14_0= ruleExpr )
                    // InternalFortXTrans.g:2426:6: lv_cond_14_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getCondExprParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_cond_14_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                    						}
                    						set(
                    							current,
                    							"cond",
                    							lv_cond_14_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_15, grammarAccess.getDelimitedExprAccess().getThenKeyword_5_2());
                    			
                    // InternalFortXTrans.g:2447:4: ( (lv_blocks_16_0= ruleBlockElems ) )
                    // InternalFortXTrans.g:2448:5: (lv_blocks_16_0= ruleBlockElems )
                    {
                    // InternalFortXTrans.g:2448:5: (lv_blocks_16_0= ruleBlockElems )
                    // InternalFortXTrans.g:2449:6: lv_blocks_16_0= ruleBlockElems
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getBlocksBlockElemsParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_blocks_16_0=ruleBlockElems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                    						}
                    						set(
                    							current,
                    							"blocks",
                    							lv_blocks_16_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.BlockElems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:2466:4: ( (lv_elifs_17_0= ruleElifs ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==46) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalFortXTrans.g:2467:5: (lv_elifs_17_0= ruleElifs )
                            {
                            // InternalFortXTrans.g:2467:5: (lv_elifs_17_0= ruleElifs )
                            // InternalFortXTrans.g:2468:6: lv_elifs_17_0= ruleElifs
                            {

                            						newCompositeNode(grammarAccess.getDelimitedExprAccess().getElifsElifsParserRuleCall_5_4_0());
                            					
                            pushFollow(FOLLOW_37);
                            lv_elifs_17_0=ruleElifs();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                            						}
                            						set(
                            							current,
                            							"elifs",
                            							lv_elifs_17_0,
                            							"srf.transpiler.fortxtrans.FortXTrans.Elifs");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:2485:4: ( (lv_els_18_0= ruleElse ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==47) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalFortXTrans.g:2486:5: (lv_els_18_0= ruleElse )
                            {
                            // InternalFortXTrans.g:2486:5: (lv_els_18_0= ruleElse )
                            // InternalFortXTrans.g:2487:6: lv_els_18_0= ruleElse
                            {

                            						newCompositeNode(grammarAccess.getDelimitedExprAccess().getElsElseParserRuleCall_5_5_0());
                            					
                            pushFollow(FOLLOW_34);
                            lv_els_18_0=ruleElse();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                            						}
                            						set(
                            							current,
                            							"els",
                            							lv_els_18_0,
                            							"srf.transpiler.fortxtrans.FortXTrans.Else");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getDelimitedExprAccess().getEndKeyword_5_6());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalFortXTrans.g:2510:3: ( (lv_par_20_0= ruleParanthesized ) )
                    {
                    // InternalFortXTrans.g:2510:3: ( (lv_par_20_0= ruleParanthesized ) )
                    // InternalFortXTrans.g:2511:4: (lv_par_20_0= ruleParanthesized )
                    {
                    // InternalFortXTrans.g:2511:4: (lv_par_20_0= ruleParanthesized )
                    // InternalFortXTrans.g:2512:5: lv_par_20_0= ruleParanthesized
                    {

                    					newCompositeNode(grammarAccess.getDelimitedExprAccess().getParParanthesizedParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_par_20_0=ruleParanthesized();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                    					}
                    					set(
                    						current,
                    						"par",
                    						lv_par_20_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.Paranthesized");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalFortXTrans.g:2530:3: (otherlv_21= '|' ( (lv_parblock_22_0= ruleParBlockElems ) ) otherlv_23= '|' )
                    {
                    // InternalFortXTrans.g:2530:3: (otherlv_21= '|' ( (lv_parblock_22_0= ruleParBlockElems ) ) otherlv_23= '|' )
                    // InternalFortXTrans.g:2531:4: otherlv_21= '|' ( (lv_parblock_22_0= ruleParBlockElems ) ) otherlv_23= '|'
                    {
                    otherlv_21=(Token)match(input,45,FOLLOW_25); 

                    				newLeafNode(otherlv_21, grammarAccess.getDelimitedExprAccess().getVerticalLineKeyword_7_0());
                    			
                    // InternalFortXTrans.g:2535:4: ( (lv_parblock_22_0= ruleParBlockElems ) )
                    // InternalFortXTrans.g:2536:5: (lv_parblock_22_0= ruleParBlockElems )
                    {
                    // InternalFortXTrans.g:2536:5: (lv_parblock_22_0= ruleParBlockElems )
                    // InternalFortXTrans.g:2537:6: lv_parblock_22_0= ruleParBlockElems
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getParblockParBlockElemsParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_parblock_22_0=ruleParBlockElems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
                    						}
                    						set(
                    							current,
                    							"parblock",
                    							lv_parblock_22_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.ParBlockElems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_23=(Token)match(input,45,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getDelimitedExprAccess().getVerticalLineKeyword_7_2());
                    			

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


    // $ANTLR start "entryRuleParBlockElems"
    // InternalFortXTrans.g:2563:1: entryRuleParBlockElems returns [EObject current=null] : iv_ruleParBlockElems= ruleParBlockElems EOF ;
    public final EObject entryRuleParBlockElems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParBlockElems = null;


        try {
            // InternalFortXTrans.g:2563:54: (iv_ruleParBlockElems= ruleParBlockElems EOF )
            // InternalFortXTrans.g:2564:2: iv_ruleParBlockElems= ruleParBlockElems EOF
            {
             newCompositeNode(grammarAccess.getParBlockElemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParBlockElems=ruleParBlockElems();

            state._fsp--;

             current =iv_ruleParBlockElems; 
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
    // $ANTLR end "entryRuleParBlockElems"


    // $ANTLR start "ruleParBlockElems"
    // InternalFortXTrans.g:2570:1: ruleParBlockElems returns [EObject current=null] : ( ( (lv_brack_0_0= '(' ) ) ( (lv_block_1_0= ruleBlockElem ) ) (otherlv_2= ',' ( (lv_block_3_0= ruleBlockElem ) ) )+ otherlv_4= ')' ) ;
    public final EObject ruleParBlockElems() throws RecognitionException {
        EObject current = null;

        Token lv_brack_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_block_1_0 = null;

        EObject lv_block_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2576:2: ( ( ( (lv_brack_0_0= '(' ) ) ( (lv_block_1_0= ruleBlockElem ) ) (otherlv_2= ',' ( (lv_block_3_0= ruleBlockElem ) ) )+ otherlv_4= ')' ) )
            // InternalFortXTrans.g:2577:2: ( ( (lv_brack_0_0= '(' ) ) ( (lv_block_1_0= ruleBlockElem ) ) (otherlv_2= ',' ( (lv_block_3_0= ruleBlockElem ) ) )+ otherlv_4= ')' )
            {
            // InternalFortXTrans.g:2577:2: ( ( (lv_brack_0_0= '(' ) ) ( (lv_block_1_0= ruleBlockElem ) ) (otherlv_2= ',' ( (lv_block_3_0= ruleBlockElem ) ) )+ otherlv_4= ')' )
            // InternalFortXTrans.g:2578:3: ( (lv_brack_0_0= '(' ) ) ( (lv_block_1_0= ruleBlockElem ) ) (otherlv_2= ',' ( (lv_block_3_0= ruleBlockElem ) ) )+ otherlv_4= ')'
            {
            // InternalFortXTrans.g:2578:3: ( (lv_brack_0_0= '(' ) )
            // InternalFortXTrans.g:2579:4: (lv_brack_0_0= '(' )
            {
            // InternalFortXTrans.g:2579:4: (lv_brack_0_0= '(' )
            // InternalFortXTrans.g:2580:5: lv_brack_0_0= '('
            {
            lv_brack_0_0=(Token)match(input,35,FOLLOW_30); 

            					newLeafNode(lv_brack_0_0, grammarAccess.getParBlockElemsAccess().getBrackLeftParenthesisKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParBlockElemsRule());
            					}
            					setWithLastConsumed(current, "brack", lv_brack_0_0, "(");
            				

            }


            }

            // InternalFortXTrans.g:2592:3: ( (lv_block_1_0= ruleBlockElem ) )
            // InternalFortXTrans.g:2593:4: (lv_block_1_0= ruleBlockElem )
            {
            // InternalFortXTrans.g:2593:4: (lv_block_1_0= ruleBlockElem )
            // InternalFortXTrans.g:2594:5: lv_block_1_0= ruleBlockElem
            {

            					newCompositeNode(grammarAccess.getParBlockElemsAccess().getBlockBlockElemParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_39);
            lv_block_1_0=ruleBlockElem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParBlockElemsRule());
            					}
            					add(
            						current,
            						"block",
            						lv_block_1_0,
            						"srf.transpiler.fortxtrans.FortXTrans.BlockElem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFortXTrans.g:2611:3: (otherlv_2= ',' ( (lv_block_3_0= ruleBlockElem ) ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==26) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalFortXTrans.g:2612:4: otherlv_2= ',' ( (lv_block_3_0= ruleBlockElem ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_30); 

            	    				newLeafNode(otherlv_2, grammarAccess.getParBlockElemsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalFortXTrans.g:2616:4: ( (lv_block_3_0= ruleBlockElem ) )
            	    // InternalFortXTrans.g:2617:5: (lv_block_3_0= ruleBlockElem )
            	    {
            	    // InternalFortXTrans.g:2617:5: (lv_block_3_0= ruleBlockElem )
            	    // InternalFortXTrans.g:2618:6: lv_block_3_0= ruleBlockElem
            	    {

            	    						newCompositeNode(grammarAccess.getParBlockElemsAccess().getBlockBlockElemParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_block_3_0=ruleBlockElem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParBlockElemsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"block",
            	    							lv_block_3_0,
            	    							"srf.transpiler.fortxtrans.FortXTrans.BlockElem");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            otherlv_4=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParBlockElemsAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleParBlockElems"


    // $ANTLR start "entryRuleElifs"
    // InternalFortXTrans.g:2644:1: entryRuleElifs returns [EObject current=null] : iv_ruleElifs= ruleElifs EOF ;
    public final EObject entryRuleElifs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElifs = null;


        try {
            // InternalFortXTrans.g:2644:46: (iv_ruleElifs= ruleElifs EOF )
            // InternalFortXTrans.g:2645:2: iv_ruleElifs= ruleElifs EOF
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
    // InternalFortXTrans.g:2651:1: ruleElifs returns [EObject current=null] : ( ( (lv_e_0_0= ruleElif ) ) ( (lv_e_1_0= ruleElif ) )* ) ;
    public final EObject ruleElifs() throws RecognitionException {
        EObject current = null;

        EObject lv_e_0_0 = null;

        EObject lv_e_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2657:2: ( ( ( (lv_e_0_0= ruleElif ) ) ( (lv_e_1_0= ruleElif ) )* ) )
            // InternalFortXTrans.g:2658:2: ( ( (lv_e_0_0= ruleElif ) ) ( (lv_e_1_0= ruleElif ) )* )
            {
            // InternalFortXTrans.g:2658:2: ( ( (lv_e_0_0= ruleElif ) ) ( (lv_e_1_0= ruleElif ) )* )
            // InternalFortXTrans.g:2659:3: ( (lv_e_0_0= ruleElif ) ) ( (lv_e_1_0= ruleElif ) )*
            {
            // InternalFortXTrans.g:2659:3: ( (lv_e_0_0= ruleElif ) )
            // InternalFortXTrans.g:2660:4: (lv_e_0_0= ruleElif )
            {
            // InternalFortXTrans.g:2660:4: (lv_e_0_0= ruleElif )
            // InternalFortXTrans.g:2661:5: lv_e_0_0= ruleElif
            {

            					newCompositeNode(grammarAccess.getElifsAccess().getEElifParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
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

            // InternalFortXTrans.g:2678:3: ( (lv_e_1_0= ruleElif ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==46) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalFortXTrans.g:2679:4: (lv_e_1_0= ruleElif )
            	    {
            	    // InternalFortXTrans.g:2679:4: (lv_e_1_0= ruleElif )
            	    // InternalFortXTrans.g:2680:5: lv_e_1_0= ruleElif
            	    {

            	    					newCompositeNode(grammarAccess.getElifsAccess().getEElifParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_40);
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
    // $ANTLR end "ruleElifs"


    // $ANTLR start "entryRuleElif"
    // InternalFortXTrans.g:2701:1: entryRuleElif returns [EObject current=null] : iv_ruleElif= ruleElif EOF ;
    public final EObject entryRuleElif() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElif = null;


        try {
            // InternalFortXTrans.g:2701:45: (iv_ruleElif= ruleElif EOF )
            // InternalFortXTrans.g:2702:2: iv_ruleElif= ruleElif EOF
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
    // InternalFortXTrans.g:2708:1: ruleElif returns [EObject current=null] : (otherlv_0= 'elif' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_block_3_0= ruleBlockElems ) ) ) ;
    public final EObject ruleElif() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;

        EObject lv_block_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2714:2: ( (otherlv_0= 'elif' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_block_3_0= ruleBlockElems ) ) ) )
            // InternalFortXTrans.g:2715:2: (otherlv_0= 'elif' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_block_3_0= ruleBlockElems ) ) )
            {
            // InternalFortXTrans.g:2715:2: (otherlv_0= 'elif' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_block_3_0= ruleBlockElems ) ) )
            // InternalFortXTrans.g:2716:3: otherlv_0= 'elif' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_block_3_0= ruleBlockElems ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getElifAccess().getElifKeyword_0());
            		
            // InternalFortXTrans.g:2720:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalFortXTrans.g:2721:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalFortXTrans.g:2721:4: (lv_expr_1_0= ruleExpr )
            // InternalFortXTrans.g:2722:5: lv_expr_1_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getElifAccess().getExprExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
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

            otherlv_2=(Token)match(input,44,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getElifAccess().getThenKeyword_2());
            		
            // InternalFortXTrans.g:2743:3: ( (lv_block_3_0= ruleBlockElems ) )
            // InternalFortXTrans.g:2744:4: (lv_block_3_0= ruleBlockElems )
            {
            // InternalFortXTrans.g:2744:4: (lv_block_3_0= ruleBlockElems )
            // InternalFortXTrans.g:2745:5: lv_block_3_0= ruleBlockElems
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
    // InternalFortXTrans.g:2766:1: entryRuleElse returns [EObject current=null] : iv_ruleElse= ruleElse EOF ;
    public final EObject entryRuleElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElse = null;


        try {
            // InternalFortXTrans.g:2766:45: (iv_ruleElse= ruleElse EOF )
            // InternalFortXTrans.g:2767:2: iv_ruleElse= ruleElse EOF
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
    // InternalFortXTrans.g:2773:1: ruleElse returns [EObject current=null] : (otherlv_0= 'else' ( (lv_block_1_0= ruleBlockElems ) ) ) ;
    public final EObject ruleElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2779:2: ( (otherlv_0= 'else' ( (lv_block_1_0= ruleBlockElems ) ) ) )
            // InternalFortXTrans.g:2780:2: (otherlv_0= 'else' ( (lv_block_1_0= ruleBlockElems ) ) )
            {
            // InternalFortXTrans.g:2780:2: (otherlv_0= 'else' ( (lv_block_1_0= ruleBlockElems ) ) )
            // InternalFortXTrans.g:2781:3: otherlv_0= 'else' ( (lv_block_1_0= ruleBlockElems ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getElseAccess().getElseKeyword_0());
            		
            // InternalFortXTrans.g:2785:3: ( (lv_block_1_0= ruleBlockElems ) )
            // InternalFortXTrans.g:2786:4: (lv_block_1_0= ruleBlockElems )
            {
            // InternalFortXTrans.g:2786:4: (lv_block_1_0= ruleBlockElems )
            // InternalFortXTrans.g:2787:5: lv_block_1_0= ruleBlockElems
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
    // InternalFortXTrans.g:2808:1: entryRuleGenerators returns [EObject current=null] : iv_ruleGenerators= ruleGenerators EOF ;
    public final EObject entryRuleGenerators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerators = null;


        try {
            // InternalFortXTrans.g:2808:51: (iv_ruleGenerators= ruleGenerators EOF )
            // InternalFortXTrans.g:2809:2: iv_ruleGenerators= ruleGenerators EOF
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
    // InternalFortXTrans.g:2815:1: ruleGenerators returns [EObject current=null] : ( ( (lv_binding_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_clause_2_0= ruleGenClause ) ) )* ) ;
    public final EObject ruleGenerators() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_binding_0_0 = null;

        EObject lv_clause_2_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2821:2: ( ( ( (lv_binding_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_clause_2_0= ruleGenClause ) ) )* ) )
            // InternalFortXTrans.g:2822:2: ( ( (lv_binding_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_clause_2_0= ruleGenClause ) ) )* )
            {
            // InternalFortXTrans.g:2822:2: ( ( (lv_binding_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_clause_2_0= ruleGenClause ) ) )* )
            // InternalFortXTrans.g:2823:3: ( (lv_binding_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_clause_2_0= ruleGenClause ) ) )*
            {
            // InternalFortXTrans.g:2823:3: ( (lv_binding_0_0= ruleBinding ) )
            // InternalFortXTrans.g:2824:4: (lv_binding_0_0= ruleBinding )
            {
            // InternalFortXTrans.g:2824:4: (lv_binding_0_0= ruleBinding )
            // InternalFortXTrans.g:2825:5: lv_binding_0_0= ruleBinding
            {

            					newCompositeNode(grammarAccess.getGeneratorsAccess().getBindingBindingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_41);
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

            // InternalFortXTrans.g:2842:3: (otherlv_1= ',' ( (lv_clause_2_0= ruleGenClause ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==26) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalFortXTrans.g:2843:4: otherlv_1= ',' ( (lv_clause_2_0= ruleGenClause ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_30); 

            	    				newLeafNode(otherlv_1, grammarAccess.getGeneratorsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalFortXTrans.g:2847:4: ( (lv_clause_2_0= ruleGenClause ) )
            	    // InternalFortXTrans.g:2848:5: (lv_clause_2_0= ruleGenClause )
            	    {
            	    // InternalFortXTrans.g:2848:5: (lv_clause_2_0= ruleGenClause )
            	    // InternalFortXTrans.g:2849:6: lv_clause_2_0= ruleGenClause
            	    {

            	    						newCompositeNode(grammarAccess.getGeneratorsAccess().getClauseGenClauseParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
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
    // $ANTLR end "ruleGenerators"


    // $ANTLR start "entryRuleBinding"
    // InternalFortXTrans.g:2871:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalFortXTrans.g:2871:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalFortXTrans.g:2872:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalFortXTrans.g:2878:1: ruleBinding returns [EObject current=null] : ( ( ( (lv_idtup_0_0= ruleIdOrTuple ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleExpr ) ) ) | ( ( (lv_idtup_3_0= ruleIdOrTuple ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_expr_7_0= ruleExpr ) ) otherlv_8= ')' ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token lv_seq_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_idtup_0_0 = null;

        EObject lv_expr_2_0 = null;

        EObject lv_idtup_3_0 = null;

        EObject lv_expr_7_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2884:2: ( ( ( ( (lv_idtup_0_0= ruleIdOrTuple ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleExpr ) ) ) | ( ( (lv_idtup_3_0= ruleIdOrTuple ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_expr_7_0= ruleExpr ) ) otherlv_8= ')' ) ) )
            // InternalFortXTrans.g:2885:2: ( ( ( (lv_idtup_0_0= ruleIdOrTuple ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleExpr ) ) ) | ( ( (lv_idtup_3_0= ruleIdOrTuple ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_expr_7_0= ruleExpr ) ) otherlv_8= ')' ) )
            {
            // InternalFortXTrans.g:2885:2: ( ( ( (lv_idtup_0_0= ruleIdOrTuple ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleExpr ) ) ) | ( ( (lv_idtup_3_0= ruleIdOrTuple ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_expr_7_0= ruleExpr ) ) otherlv_8= ')' ) )
            int alt47=2;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // InternalFortXTrans.g:2886:3: ( ( (lv_idtup_0_0= ruleIdOrTuple ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleExpr ) ) )
                    {
                    // InternalFortXTrans.g:2886:3: ( ( (lv_idtup_0_0= ruleIdOrTuple ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleExpr ) ) )
                    // InternalFortXTrans.g:2887:4: ( (lv_idtup_0_0= ruleIdOrTuple ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleExpr ) )
                    {
                    // InternalFortXTrans.g:2887:4: ( (lv_idtup_0_0= ruleIdOrTuple ) )
                    // InternalFortXTrans.g:2888:5: (lv_idtup_0_0= ruleIdOrTuple )
                    {
                    // InternalFortXTrans.g:2888:5: (lv_idtup_0_0= ruleIdOrTuple )
                    // InternalFortXTrans.g:2889:6: lv_idtup_0_0= ruleIdOrTuple
                    {

                    						newCompositeNode(grammarAccess.getBindingAccess().getIdtupIdOrTupleParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_idtup_0_0=ruleIdOrTuple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBindingRule());
                    						}
                    						set(
                    							current,
                    							"idtup",
                    							lv_idtup_0_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.IdOrTuple");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,48,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getLessThanSignHyphenMinusKeyword_0_1());
                    			
                    // InternalFortXTrans.g:2910:4: ( (lv_expr_2_0= ruleExpr ) )
                    // InternalFortXTrans.g:2911:5: (lv_expr_2_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:2911:5: (lv_expr_2_0= ruleExpr )
                    // InternalFortXTrans.g:2912:6: lv_expr_2_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getBindingAccess().getExprExprParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_2_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBindingRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_2_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:2931:3: ( ( (lv_idtup_3_0= ruleIdOrTuple ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_expr_7_0= ruleExpr ) ) otherlv_8= ')' )
                    {
                    // InternalFortXTrans.g:2931:3: ( ( (lv_idtup_3_0= ruleIdOrTuple ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_expr_7_0= ruleExpr ) ) otherlv_8= ')' )
                    // InternalFortXTrans.g:2932:4: ( (lv_idtup_3_0= ruleIdOrTuple ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_expr_7_0= ruleExpr ) ) otherlv_8= ')'
                    {
                    // InternalFortXTrans.g:2932:4: ( (lv_idtup_3_0= ruleIdOrTuple ) )
                    // InternalFortXTrans.g:2933:5: (lv_idtup_3_0= ruleIdOrTuple )
                    {
                    // InternalFortXTrans.g:2933:5: (lv_idtup_3_0= ruleIdOrTuple )
                    // InternalFortXTrans.g:2934:6: lv_idtup_3_0= ruleIdOrTuple
                    {

                    						newCompositeNode(grammarAccess.getBindingAccess().getIdtupIdOrTupleParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_idtup_3_0=ruleIdOrTuple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBindingRule());
                    						}
                    						set(
                    							current,
                    							"idtup",
                    							lv_idtup_3_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.IdOrTuple");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,48,FOLLOW_43); 

                    				newLeafNode(otherlv_4, grammarAccess.getBindingAccess().getLessThanSignHyphenMinusKeyword_1_1());
                    			
                    // InternalFortXTrans.g:2955:4: ( (lv_seq_5_0= 'seq' ) )
                    // InternalFortXTrans.g:2956:5: (lv_seq_5_0= 'seq' )
                    {
                    // InternalFortXTrans.g:2956:5: (lv_seq_5_0= 'seq' )
                    // InternalFortXTrans.g:2957:6: lv_seq_5_0= 'seq'
                    {
                    lv_seq_5_0=(Token)match(input,49,FOLLOW_25); 

                    						newLeafNode(lv_seq_5_0, grammarAccess.getBindingAccess().getSeqSeqKeyword_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBindingRule());
                    						}
                    						setWithLastConsumed(current, "seq", lv_seq_5_0, "seq");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,35,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getBindingAccess().getLeftParenthesisKeyword_1_3());
                    			
                    // InternalFortXTrans.g:2973:4: ( (lv_expr_7_0= ruleExpr ) )
                    // InternalFortXTrans.g:2974:5: (lv_expr_7_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:2974:5: (lv_expr_7_0= ruleExpr )
                    // InternalFortXTrans.g:2975:6: lv_expr_7_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getBindingAccess().getExprExprParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_expr_7_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBindingRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_7_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,36,FOLLOW_2); 

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


    // $ANTLR start "entryRuleGenClause"
    // InternalFortXTrans.g:3001:1: entryRuleGenClause returns [EObject current=null] : iv_ruleGenClause= ruleGenClause EOF ;
    public final EObject entryRuleGenClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenClause = null;


        try {
            // InternalFortXTrans.g:3001:50: (iv_ruleGenClause= ruleGenClause EOF )
            // InternalFortXTrans.g:3002:2: iv_ruleGenClause= ruleGenClause EOF
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
    // InternalFortXTrans.g:3008:1: ruleGenClause returns [EObject current=null] : ( ( (lv_binding_0_0= ruleBinding ) ) | ( (lv_expr_1_0= ruleExpr ) ) ) ;
    public final EObject ruleGenClause() throws RecognitionException {
        EObject current = null;

        EObject lv_binding_0_0 = null;

        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3014:2: ( ( ( (lv_binding_0_0= ruleBinding ) ) | ( (lv_expr_1_0= ruleExpr ) ) ) )
            // InternalFortXTrans.g:3015:2: ( ( (lv_binding_0_0= ruleBinding ) ) | ( (lv_expr_1_0= ruleExpr ) ) )
            {
            // InternalFortXTrans.g:3015:2: ( ( (lv_binding_0_0= ruleBinding ) ) | ( (lv_expr_1_0= ruleExpr ) ) )
            int alt48=2;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // InternalFortXTrans.g:3016:3: ( (lv_binding_0_0= ruleBinding ) )
                    {
                    // InternalFortXTrans.g:3016:3: ( (lv_binding_0_0= ruleBinding ) )
                    // InternalFortXTrans.g:3017:4: (lv_binding_0_0= ruleBinding )
                    {
                    // InternalFortXTrans.g:3017:4: (lv_binding_0_0= ruleBinding )
                    // InternalFortXTrans.g:3018:5: lv_binding_0_0= ruleBinding
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
                    // InternalFortXTrans.g:3036:3: ( (lv_expr_1_0= ruleExpr ) )
                    {
                    // InternalFortXTrans.g:3036:3: ( (lv_expr_1_0= ruleExpr ) )
                    // InternalFortXTrans.g:3037:4: (lv_expr_1_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:3037:4: (lv_expr_1_0= ruleExpr )
                    // InternalFortXTrans.g:3038:5: lv_expr_1_0= ruleExpr
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
    // InternalFortXTrans.g:3059:1: entryRuleBlockElems returns [EObject current=null] : iv_ruleBlockElems= ruleBlockElems EOF ;
    public final EObject entryRuleBlockElems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockElems = null;


        try {
            // InternalFortXTrans.g:3059:51: (iv_ruleBlockElems= ruleBlockElems EOF )
            // InternalFortXTrans.g:3060:2: iv_ruleBlockElems= ruleBlockElems EOF
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
    // InternalFortXTrans.g:3066:1: ruleBlockElems returns [EObject current=null] : ( ( (lv_block_0_0= ruleBlockElem ) ) ( (lv_block_1_0= ruleBlockElem ) )* ) ;
    public final EObject ruleBlockElems() throws RecognitionException {
        EObject current = null;

        EObject lv_block_0_0 = null;

        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3072:2: ( ( ( (lv_block_0_0= ruleBlockElem ) ) ( (lv_block_1_0= ruleBlockElem ) )* ) )
            // InternalFortXTrans.g:3073:2: ( ( (lv_block_0_0= ruleBlockElem ) ) ( (lv_block_1_0= ruleBlockElem ) )* )
            {
            // InternalFortXTrans.g:3073:2: ( ( (lv_block_0_0= ruleBlockElem ) ) ( (lv_block_1_0= ruleBlockElem ) )* )
            // InternalFortXTrans.g:3074:3: ( (lv_block_0_0= ruleBlockElem ) ) ( (lv_block_1_0= ruleBlockElem ) )*
            {
            // InternalFortXTrans.g:3074:3: ( (lv_block_0_0= ruleBlockElem ) )
            // InternalFortXTrans.g:3075:4: (lv_block_0_0= ruleBlockElem )
            {
            // InternalFortXTrans.g:3075:4: (lv_block_0_0= ruleBlockElem )
            // InternalFortXTrans.g:3076:5: lv_block_0_0= ruleBlockElem
            {

            					newCompositeNode(grammarAccess.getBlockElemsAccess().getBlockBlockElemParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_44);
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

            // InternalFortXTrans.g:3093:3: ( (lv_block_1_0= ruleBlockElem ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID||(LA49_0>=RULE_INT && LA49_0<=RULE_STRING)||LA49_0==33||LA49_0==35||(LA49_0>=40 && LA49_0<=43)||LA49_0==45||(LA49_0>=51 && LA49_0<=54)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalFortXTrans.g:3094:4: (lv_block_1_0= ruleBlockElem )
            	    {
            	    // InternalFortXTrans.g:3094:4: (lv_block_1_0= ruleBlockElem )
            	    // InternalFortXTrans.g:3095:5: lv_block_1_0= ruleBlockElem
            	    {

            	    					newCompositeNode(grammarAccess.getBlockElemsAccess().getBlockBlockElemParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_44);
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
    // $ANTLR end "ruleBlockElems"


    // $ANTLR start "entryRuleBlockElem"
    // InternalFortXTrans.g:3116:1: entryRuleBlockElem returns [EObject current=null] : iv_ruleBlockElem= ruleBlockElem EOF ;
    public final EObject entryRuleBlockElem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockElem = null;


        try {
            // InternalFortXTrans.g:3116:50: (iv_ruleBlockElem= ruleBlockElem EOF )
            // InternalFortXTrans.g:3117:2: iv_ruleBlockElem= ruleBlockElem EOF
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
    // InternalFortXTrans.g:3123:1: ruleBlockElem returns [EObject current=null] : ( (lv_exp_0_0= ruleExpr ) ) ;
    public final EObject ruleBlockElem() throws RecognitionException {
        EObject current = null;

        EObject lv_exp_0_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3129:2: ( ( (lv_exp_0_0= ruleExpr ) ) )
            // InternalFortXTrans.g:3130:2: ( (lv_exp_0_0= ruleExpr ) )
            {
            // InternalFortXTrans.g:3130:2: ( (lv_exp_0_0= ruleExpr ) )
            // InternalFortXTrans.g:3131:3: (lv_exp_0_0= ruleExpr )
            {
            // InternalFortXTrans.g:3131:3: (lv_exp_0_0= ruleExpr )
            // InternalFortXTrans.g:3132:4: lv_exp_0_0= ruleExpr
            {

            				newCompositeNode(grammarAccess.getBlockElemAccess().getExpExprParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_exp_0_0=ruleExpr();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBlockElemRule());
            				}
            				set(
            					current,
            					"exp",
            					lv_exp_0_0,
            					"srf.transpiler.fortxtrans.FortXTrans.Expr");
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


    // $ANTLR start "entryRuleParanthesized"
    // InternalFortXTrans.g:3152:1: entryRuleParanthesized returns [EObject current=null] : iv_ruleParanthesized= ruleParanthesized EOF ;
    public final EObject entryRuleParanthesized() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParanthesized = null;


        try {
            // InternalFortXTrans.g:3152:54: (iv_ruleParanthesized= ruleParanthesized EOF )
            // InternalFortXTrans.g:3153:2: iv_ruleParanthesized= ruleParanthesized EOF
            {
             newCompositeNode(grammarAccess.getParanthesizedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParanthesized=ruleParanthesized();

            state._fsp--;

             current =iv_ruleParanthesized; 
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
    // $ANTLR end "entryRuleParanthesized"


    // $ANTLR start "ruleParanthesized"
    // InternalFortXTrans.g:3159:1: ruleParanthesized returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleExpr ) ) otherlv_2= ')' ) ;
    public final EObject ruleParanthesized() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3165:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExpr ) ) otherlv_2= ')' ) )
            // InternalFortXTrans.g:3166:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExpr ) ) otherlv_2= ')' )
            {
            // InternalFortXTrans.g:3166:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExpr ) ) otherlv_2= ')' )
            // InternalFortXTrans.g:3167:3: otherlv_0= '(' ( (lv_exp_1_0= ruleExpr ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getParanthesizedAccess().getLeftParenthesisKeyword_0());
            		
            // InternalFortXTrans.g:3171:3: ( (lv_exp_1_0= ruleExpr ) )
            // InternalFortXTrans.g:3172:4: (lv_exp_1_0= ruleExpr )
            {
            // InternalFortXTrans.g:3172:4: (lv_exp_1_0= ruleExpr )
            // InternalFortXTrans.g:3173:5: lv_exp_1_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getParanthesizedAccess().getExpExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_exp_1_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParanthesizedRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"srf.transpiler.fortxtrans.FortXTrans.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParanthesizedAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleParanthesized"


    // $ANTLR start "entryRuleDo"
    // InternalFortXTrans.g:3198:1: entryRuleDo returns [EObject current=null] : iv_ruleDo= ruleDo EOF ;
    public final EObject entryRuleDo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDo = null;


        try {
            // InternalFortXTrans.g:3198:43: (iv_ruleDo= ruleDo EOF )
            // InternalFortXTrans.g:3199:2: iv_ruleDo= ruleDo EOF
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
    // InternalFortXTrans.g:3205:1: ruleDo returns [EObject current=null] : ( ( (lv_dofs_0_0= ruleDoFront ) ) (otherlv_1= 'also' ( (lv_dofs_2_0= ruleDoFront ) ) )* otherlv_3= 'end' ) ;
    public final EObject ruleDo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_dofs_0_0 = null;

        EObject lv_dofs_2_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3211:2: ( ( ( (lv_dofs_0_0= ruleDoFront ) ) (otherlv_1= 'also' ( (lv_dofs_2_0= ruleDoFront ) ) )* otherlv_3= 'end' ) )
            // InternalFortXTrans.g:3212:2: ( ( (lv_dofs_0_0= ruleDoFront ) ) (otherlv_1= 'also' ( (lv_dofs_2_0= ruleDoFront ) ) )* otherlv_3= 'end' )
            {
            // InternalFortXTrans.g:3212:2: ( ( (lv_dofs_0_0= ruleDoFront ) ) (otherlv_1= 'also' ( (lv_dofs_2_0= ruleDoFront ) ) )* otherlv_3= 'end' )
            // InternalFortXTrans.g:3213:3: ( (lv_dofs_0_0= ruleDoFront ) ) (otherlv_1= 'also' ( (lv_dofs_2_0= ruleDoFront ) ) )* otherlv_3= 'end'
            {
            // InternalFortXTrans.g:3213:3: ( (lv_dofs_0_0= ruleDoFront ) )
            // InternalFortXTrans.g:3214:4: (lv_dofs_0_0= ruleDoFront )
            {
            // InternalFortXTrans.g:3214:4: (lv_dofs_0_0= ruleDoFront )
            // InternalFortXTrans.g:3215:5: lv_dofs_0_0= ruleDoFront
            {

            					newCompositeNode(grammarAccess.getDoAccess().getDofsDoFrontParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_45);
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

            // InternalFortXTrans.g:3232:3: (otherlv_1= 'also' ( (lv_dofs_2_0= ruleDoFront ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==50) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalFortXTrans.g:3233:4: otherlv_1= 'also' ( (lv_dofs_2_0= ruleDoFront ) )
            	    {
            	    otherlv_1=(Token)match(input,50,FOLLOW_32); 

            	    				newLeafNode(otherlv_1, grammarAccess.getDoAccess().getAlsoKeyword_1_0());
            	    			
            	    // InternalFortXTrans.g:3237:4: ( (lv_dofs_2_0= ruleDoFront ) )
            	    // InternalFortXTrans.g:3238:5: (lv_dofs_2_0= ruleDoFront )
            	    {
            	    // InternalFortXTrans.g:3238:5: (lv_dofs_2_0= ruleDoFront )
            	    // InternalFortXTrans.g:3239:6: lv_dofs_2_0= ruleDoFront
            	    {

            	    						newCompositeNode(grammarAccess.getDoAccess().getDofsDoFrontParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_45);
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
            	    break loop50;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

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
    // InternalFortXTrans.g:3265:1: entryRuleDoFront returns [EObject current=null] : iv_ruleDoFront= ruleDoFront EOF ;
    public final EObject entryRuleDoFront() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoFront = null;


        try {
            // InternalFortXTrans.g:3265:48: (iv_ruleDoFront= ruleDoFront EOF )
            // InternalFortXTrans.g:3266:2: iv_ruleDoFront= ruleDoFront EOF
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
    // InternalFortXTrans.g:3272:1: ruleDoFront returns [EObject current=null] : ( ( ( (lv_at_0_0= 'at' ) ) ( (lv_exp_1_0= ruleExpr ) ) )? ( (lv_atom_2_0= 'atomic' ) )? otherlv_3= 'do' ( (lv_block_4_0= ruleBlockElems ) ) ) ;
    public final EObject ruleDoFront() throws RecognitionException {
        EObject current = null;

        Token lv_at_0_0=null;
        Token lv_atom_2_0=null;
        Token otherlv_3=null;
        EObject lv_exp_1_0 = null;

        EObject lv_block_4_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3278:2: ( ( ( ( (lv_at_0_0= 'at' ) ) ( (lv_exp_1_0= ruleExpr ) ) )? ( (lv_atom_2_0= 'atomic' ) )? otherlv_3= 'do' ( (lv_block_4_0= ruleBlockElems ) ) ) )
            // InternalFortXTrans.g:3279:2: ( ( ( (lv_at_0_0= 'at' ) ) ( (lv_exp_1_0= ruleExpr ) ) )? ( (lv_atom_2_0= 'atomic' ) )? otherlv_3= 'do' ( (lv_block_4_0= ruleBlockElems ) ) )
            {
            // InternalFortXTrans.g:3279:2: ( ( ( (lv_at_0_0= 'at' ) ) ( (lv_exp_1_0= ruleExpr ) ) )? ( (lv_atom_2_0= 'atomic' ) )? otherlv_3= 'do' ( (lv_block_4_0= ruleBlockElems ) ) )
            // InternalFortXTrans.g:3280:3: ( ( (lv_at_0_0= 'at' ) ) ( (lv_exp_1_0= ruleExpr ) ) )? ( (lv_atom_2_0= 'atomic' ) )? otherlv_3= 'do' ( (lv_block_4_0= ruleBlockElems ) )
            {
            // InternalFortXTrans.g:3280:3: ( ( (lv_at_0_0= 'at' ) ) ( (lv_exp_1_0= ruleExpr ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==51) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalFortXTrans.g:3281:4: ( (lv_at_0_0= 'at' ) ) ( (lv_exp_1_0= ruleExpr ) )
                    {
                    // InternalFortXTrans.g:3281:4: ( (lv_at_0_0= 'at' ) )
                    // InternalFortXTrans.g:3282:5: (lv_at_0_0= 'at' )
                    {
                    // InternalFortXTrans.g:3282:5: (lv_at_0_0= 'at' )
                    // InternalFortXTrans.g:3283:6: lv_at_0_0= 'at'
                    {
                    lv_at_0_0=(Token)match(input,51,FOLLOW_30); 

                    						newLeafNode(lv_at_0_0, grammarAccess.getDoFrontAccess().getAtAtKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDoFrontRule());
                    						}
                    						setWithLastConsumed(current, "at", true, "at");
                    					

                    }


                    }

                    // InternalFortXTrans.g:3295:4: ( (lv_exp_1_0= ruleExpr ) )
                    // InternalFortXTrans.g:3296:5: (lv_exp_1_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:3296:5: (lv_exp_1_0= ruleExpr )
                    // InternalFortXTrans.g:3297:6: lv_exp_1_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getDoFrontAccess().getExpExprParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_46);
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

            // InternalFortXTrans.g:3315:3: ( (lv_atom_2_0= 'atomic' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==33) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalFortXTrans.g:3316:4: (lv_atom_2_0= 'atomic' )
                    {
                    // InternalFortXTrans.g:3316:4: (lv_atom_2_0= 'atomic' )
                    // InternalFortXTrans.g:3317:5: lv_atom_2_0= 'atomic'
                    {
                    lv_atom_2_0=(Token)match(input,33,FOLLOW_47); 

                    					newLeafNode(lv_atom_2_0, grammarAccess.getDoFrontAccess().getAtomAtomicKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDoFrontRule());
                    					}
                    					setWithLastConsumed(current, "atom", true, "atomic");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,52,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getDoFrontAccess().getDoKeyword_2());
            		
            // InternalFortXTrans.g:3333:3: ( (lv_block_4_0= ruleBlockElems ) )
            // InternalFortXTrans.g:3334:4: (lv_block_4_0= ruleBlockElems )
            {
            // InternalFortXTrans.g:3334:4: (lv_block_4_0= ruleBlockElems )
            // InternalFortXTrans.g:3335:5: lv_block_4_0= ruleBlockElems
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


    // $ANTLR start "entryRuleIdOrTuple"
    // InternalFortXTrans.g:3356:1: entryRuleIdOrTuple returns [EObject current=null] : iv_ruleIdOrTuple= ruleIdOrTuple EOF ;
    public final EObject entryRuleIdOrTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdOrTuple = null;


        try {
            // InternalFortXTrans.g:3356:50: (iv_ruleIdOrTuple= ruleIdOrTuple EOF )
            // InternalFortXTrans.g:3357:2: iv_ruleIdOrTuple= ruleIdOrTuple EOF
            {
             newCompositeNode(grammarAccess.getIdOrTupleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdOrTuple=ruleIdOrTuple();

            state._fsp--;

             current =iv_ruleIdOrTuple; 
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
    // $ANTLR end "entryRuleIdOrTuple"


    // $ANTLR start "ruleIdOrTuple"
    // InternalFortXTrans.g:3363:1: ruleIdOrTuple returns [EObject current=null] : ( ( (lv_bid_0_0= ruleBindId ) ) | (otherlv_1= '(' ( (lv_bid_2_0= ruleBindId ) ) (otherlv_3= ',' ( (lv_bid_4_0= ruleBindId ) ) )* otherlv_5= ')' ) ) ;
    public final EObject ruleIdOrTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_bid_0_0 = null;

        AntlrDatatypeRuleToken lv_bid_2_0 = null;

        AntlrDatatypeRuleToken lv_bid_4_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3369:2: ( ( ( (lv_bid_0_0= ruleBindId ) ) | (otherlv_1= '(' ( (lv_bid_2_0= ruleBindId ) ) (otherlv_3= ',' ( (lv_bid_4_0= ruleBindId ) ) )* otherlv_5= ')' ) ) )
            // InternalFortXTrans.g:3370:2: ( ( (lv_bid_0_0= ruleBindId ) ) | (otherlv_1= '(' ( (lv_bid_2_0= ruleBindId ) ) (otherlv_3= ',' ( (lv_bid_4_0= ruleBindId ) ) )* otherlv_5= ')' ) )
            {
            // InternalFortXTrans.g:3370:2: ( ( (lv_bid_0_0= ruleBindId ) ) | (otherlv_1= '(' ( (lv_bid_2_0= ruleBindId ) ) (otherlv_3= ',' ( (lv_bid_4_0= ruleBindId ) ) )* otherlv_5= ')' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID||LA54_0==53) ) {
                alt54=1;
            }
            else if ( (LA54_0==35) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalFortXTrans.g:3371:3: ( (lv_bid_0_0= ruleBindId ) )
                    {
                    // InternalFortXTrans.g:3371:3: ( (lv_bid_0_0= ruleBindId ) )
                    // InternalFortXTrans.g:3372:4: (lv_bid_0_0= ruleBindId )
                    {
                    // InternalFortXTrans.g:3372:4: (lv_bid_0_0= ruleBindId )
                    // InternalFortXTrans.g:3373:5: lv_bid_0_0= ruleBindId
                    {

                    					newCompositeNode(grammarAccess.getIdOrTupleAccess().getBidBindIdParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_bid_0_0=ruleBindId();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIdOrTupleRule());
                    					}
                    					add(
                    						current,
                    						"bid",
                    						lv_bid_0_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.BindId");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:3391:3: (otherlv_1= '(' ( (lv_bid_2_0= ruleBindId ) ) (otherlv_3= ',' ( (lv_bid_4_0= ruleBindId ) ) )* otherlv_5= ')' )
                    {
                    // InternalFortXTrans.g:3391:3: (otherlv_1= '(' ( (lv_bid_2_0= ruleBindId ) ) (otherlv_3= ',' ( (lv_bid_4_0= ruleBindId ) ) )* otherlv_5= ')' )
                    // InternalFortXTrans.g:3392:4: otherlv_1= '(' ( (lv_bid_2_0= ruleBindId ) ) (otherlv_3= ',' ( (lv_bid_4_0= ruleBindId ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getIdOrTupleAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalFortXTrans.g:3396:4: ( (lv_bid_2_0= ruleBindId ) )
                    // InternalFortXTrans.g:3397:5: (lv_bid_2_0= ruleBindId )
                    {
                    // InternalFortXTrans.g:3397:5: (lv_bid_2_0= ruleBindId )
                    // InternalFortXTrans.g:3398:6: lv_bid_2_0= ruleBindId
                    {

                    						newCompositeNode(grammarAccess.getIdOrTupleAccess().getBidBindIdParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_bid_2_0=ruleBindId();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIdOrTupleRule());
                    						}
                    						add(
                    							current,
                    							"bid",
                    							lv_bid_2_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.BindId");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:3415:4: (otherlv_3= ',' ( (lv_bid_4_0= ruleBindId ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==26) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalFortXTrans.g:3416:5: otherlv_3= ',' ( (lv_bid_4_0= ruleBindId ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_23); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getIdOrTupleAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalFortXTrans.g:3420:5: ( (lv_bid_4_0= ruleBindId ) )
                    	    // InternalFortXTrans.g:3421:6: (lv_bid_4_0= ruleBindId )
                    	    {
                    	    // InternalFortXTrans.g:3421:6: (lv_bid_4_0= ruleBindId )
                    	    // InternalFortXTrans.g:3422:7: lv_bid_4_0= ruleBindId
                    	    {

                    	    							newCompositeNode(grammarAccess.getIdOrTupleAccess().getBidBindIdParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_bid_4_0=ruleBindId();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIdOrTupleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"bid",
                    	    								lv_bid_4_0,
                    	    								"srf.transpiler.fortxtrans.FortXTrans.BindId");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getIdOrTupleAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // $ANTLR end "ruleIdOrTuple"


    // $ANTLR start "entryRuleBindId"
    // InternalFortXTrans.g:3449:1: entryRuleBindId returns [String current=null] : iv_ruleBindId= ruleBindId EOF ;
    public final String entryRuleBindId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBindId = null;


        try {
            // InternalFortXTrans.g:3449:46: (iv_ruleBindId= ruleBindId EOF )
            // InternalFortXTrans.g:3450:2: iv_ruleBindId= ruleBindId EOF
            {
             newCompositeNode(grammarAccess.getBindIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBindId=ruleBindId();

            state._fsp--;

             current =iv_ruleBindId.getText(); 
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
    // $ANTLR end "entryRuleBindId"


    // $ANTLR start "ruleBindId"
    // InternalFortXTrans.g:3456:1: ruleBindId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= '_' ) ;
    public final AntlrDatatypeRuleToken ruleBindId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalFortXTrans.g:3462:2: ( (this_ID_0= RULE_ID | kw= '_' ) )
            // InternalFortXTrans.g:3463:2: (this_ID_0= RULE_ID | kw= '_' )
            {
            // InternalFortXTrans.g:3463:2: (this_ID_0= RULE_ID | kw= '_' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            else if ( (LA55_0==53) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalFortXTrans.g:3464:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getBindIdAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:3472:3: kw= '_'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBindIdAccess().get_Keyword_1());
                    		

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
    // $ANTLR end "ruleBindId"


    // $ANTLR start "entryRuleIsType"
    // InternalFortXTrans.g:3481:1: entryRuleIsType returns [EObject current=null] : iv_ruleIsType= ruleIsType EOF ;
    public final EObject entryRuleIsType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsType = null;


        try {
            // InternalFortXTrans.g:3481:47: (iv_ruleIsType= ruleIsType EOF )
            // InternalFortXTrans.g:3482:2: iv_ruleIsType= ruleIsType EOF
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
    // InternalFortXTrans.g:3488:1: ruleIsType returns [EObject current=null] : (otherlv_0= ':' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleIsType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3494:2: ( (otherlv_0= ':' ( (lv_type_1_0= ruleType ) ) ) )
            // InternalFortXTrans.g:3495:2: (otherlv_0= ':' ( (lv_type_1_0= ruleType ) ) )
            {
            // InternalFortXTrans.g:3495:2: (otherlv_0= ':' ( (lv_type_1_0= ruleType ) ) )
            // InternalFortXTrans.g:3496:3: otherlv_0= ':' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIsTypeAccess().getColonKeyword_0());
            		
            // InternalFortXTrans.g:3500:3: ( (lv_type_1_0= ruleType ) )
            // InternalFortXTrans.g:3501:4: (lv_type_1_0= ruleType )
            {
            // InternalFortXTrans.g:3501:4: (lv_type_1_0= ruleType )
            // InternalFortXTrans.g:3502:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getIsTypeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"srf.transpiler.fortxtrans.FortXTrans.Type");
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
    // InternalFortXTrans.g:3523:1: entryRuleFieldDecl returns [EObject current=null] : iv_ruleFieldDecl= ruleFieldDecl EOF ;
    public final EObject entryRuleFieldDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDecl = null;


        try {
            // InternalFortXTrans.g:3523:50: (iv_ruleFieldDecl= ruleFieldDecl EOF )
            // InternalFortXTrans.g:3524:2: iv_ruleFieldDecl= ruleFieldDecl EOF
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
    // InternalFortXTrans.g:3530:1: ruleFieldDecl returns [EObject current=null] : ( ( ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) ( (lv_init_3_0= ruleInitVal ) ) ) | ( ( (lv_pri_4_0= 'private' ) )? ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) ) ) | ( ( (lv_pri_8_0= 'private' ) )? ( (lv_mut_9_0= 'var' ) )? ( (lv_idtup_10_0= ruleIdOrTuple ) ) otherlv_11= ':' ( (lv_type_12_0= ruleType ) ) this_DOTS_13= RULE_DOTS ( (lv_init_14_0= ruleInitVal ) ) ) | ( ( (lv_pri_15_0= 'private' ) )? ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( (lv_init_20_0= ruleInitVal ) ) ) ) ;
    public final EObject ruleFieldDecl() throws RecognitionException {
        EObject current = null;

        Token lv_pri_0_0=null;
        Token lv_mut_1_0=null;
        Token lv_pri_4_0=null;
        Token otherlv_6=null;
        Token lv_pri_8_0=null;
        Token lv_mut_9_0=null;
        Token otherlv_11=null;
        Token this_DOTS_13=null;
        Token lv_pri_15_0=null;
        Token lv_mut_16_0=null;
        Token otherlv_18=null;
        EObject lv_vars_2_0 = null;

        EObject lv_init_3_0 = null;

        EObject lv_idtup_5_0 = null;

        EObject lv_litTup_7_0 = null;

        EObject lv_idtup_10_0 = null;

        EObject lv_type_12_0 = null;

        EObject lv_init_14_0 = null;

        EObject lv_idtup_17_0 = null;

        EObject lv_tuptype_19_0 = null;

        EObject lv_init_20_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3536:2: ( ( ( ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) ( (lv_init_3_0= ruleInitVal ) ) ) | ( ( (lv_pri_4_0= 'private' ) )? ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) ) ) | ( ( (lv_pri_8_0= 'private' ) )? ( (lv_mut_9_0= 'var' ) )? ( (lv_idtup_10_0= ruleIdOrTuple ) ) otherlv_11= ':' ( (lv_type_12_0= ruleType ) ) this_DOTS_13= RULE_DOTS ( (lv_init_14_0= ruleInitVal ) ) ) | ( ( (lv_pri_15_0= 'private' ) )? ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( (lv_init_20_0= ruleInitVal ) ) ) ) )
            // InternalFortXTrans.g:3537:2: ( ( ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) ( (lv_init_3_0= ruleInitVal ) ) ) | ( ( (lv_pri_4_0= 'private' ) )? ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) ) ) | ( ( (lv_pri_8_0= 'private' ) )? ( (lv_mut_9_0= 'var' ) )? ( (lv_idtup_10_0= ruleIdOrTuple ) ) otherlv_11= ':' ( (lv_type_12_0= ruleType ) ) this_DOTS_13= RULE_DOTS ( (lv_init_14_0= ruleInitVal ) ) ) | ( ( (lv_pri_15_0= 'private' ) )? ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( (lv_init_20_0= ruleInitVal ) ) ) )
            {
            // InternalFortXTrans.g:3537:2: ( ( ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) ( (lv_init_3_0= ruleInitVal ) ) ) | ( ( (lv_pri_4_0= 'private' ) )? ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) ) ) | ( ( (lv_pri_8_0= 'private' ) )? ( (lv_mut_9_0= 'var' ) )? ( (lv_idtup_10_0= ruleIdOrTuple ) ) otherlv_11= ':' ( (lv_type_12_0= ruleType ) ) this_DOTS_13= RULE_DOTS ( (lv_init_14_0= ruleInitVal ) ) ) | ( ( (lv_pri_15_0= 'private' ) )? ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( (lv_init_20_0= ruleInitVal ) ) ) )
            int alt63=4;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // InternalFortXTrans.g:3538:3: ( ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) ( (lv_init_3_0= ruleInitVal ) ) )
                    {
                    // InternalFortXTrans.g:3538:3: ( ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) ( (lv_init_3_0= ruleInitVal ) ) )
                    // InternalFortXTrans.g:3539:4: ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) ( (lv_init_3_0= ruleInitVal ) )
                    {
                    // InternalFortXTrans.g:3539:4: ( (lv_pri_0_0= 'private' ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==31) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalFortXTrans.g:3540:5: (lv_pri_0_0= 'private' )
                            {
                            // InternalFortXTrans.g:3540:5: (lv_pri_0_0= 'private' )
                            // InternalFortXTrans.g:3541:6: lv_pri_0_0= 'private'
                            {
                            lv_pri_0_0=(Token)match(input,31,FOLLOW_48); 

                            						newLeafNode(lv_pri_0_0, grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFieldDeclRule());
                            						}
                            						setWithLastConsumed(current, "pri", lv_pri_0_0, "private");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:3553:4: ( (lv_mut_1_0= 'var' ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==54) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalFortXTrans.g:3554:5: (lv_mut_1_0= 'var' )
                            {
                            // InternalFortXTrans.g:3554:5: (lv_mut_1_0= 'var' )
                            // InternalFortXTrans.g:3555:6: lv_mut_1_0= 'var'
                            {
                            lv_mut_1_0=(Token)match(input,54,FOLLOW_48); 

                            						newLeafNode(lv_mut_1_0, grammarAccess.getFieldDeclAccess().getMutVarKeyword_0_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFieldDeclRule());
                            						}
                            						setWithLastConsumed(current, "mut", lv_mut_1_0, "var");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:3567:4: ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) )
                    // InternalFortXTrans.g:3568:5: (lv_vars_2_0= ruleNoNewlineVarWTypes )
                    {
                    // InternalFortXTrans.g:3568:5: (lv_vars_2_0= ruleNoNewlineVarWTypes )
                    // InternalFortXTrans.g:3569:6: lv_vars_2_0= ruleNoNewlineVarWTypes
                    {

                    						newCompositeNode(grammarAccess.getFieldDeclAccess().getVarsNoNewlineVarWTypesParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_49);
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

                    // InternalFortXTrans.g:3586:4: ( (lv_init_3_0= ruleInitVal ) )
                    // InternalFortXTrans.g:3587:5: (lv_init_3_0= ruleInitVal )
                    {
                    // InternalFortXTrans.g:3587:5: (lv_init_3_0= ruleInitVal )
                    // InternalFortXTrans.g:3588:6: lv_init_3_0= ruleInitVal
                    {

                    						newCompositeNode(grammarAccess.getFieldDeclAccess().getInitInitValParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_init_3_0=ruleInitVal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldDeclRule());
                    						}
                    						set(
                    							current,
                    							"init",
                    							lv_init_3_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.InitVal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:3607:3: ( ( (lv_pri_4_0= 'private' ) )? ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) ) )
                    {
                    // InternalFortXTrans.g:3607:3: ( ( (lv_pri_4_0= 'private' ) )? ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) ) )
                    // InternalFortXTrans.g:3608:4: ( (lv_pri_4_0= 'private' ) )? ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) )
                    {
                    // InternalFortXTrans.g:3608:4: ( (lv_pri_4_0= 'private' ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==31) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalFortXTrans.g:3609:5: (lv_pri_4_0= 'private' )
                            {
                            // InternalFortXTrans.g:3609:5: (lv_pri_4_0= 'private' )
                            // InternalFortXTrans.g:3610:6: lv_pri_4_0= 'private'
                            {
                            lv_pri_4_0=(Token)match(input,31,FOLLOW_33); 

                            						newLeafNode(lv_pri_4_0, grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFieldDeclRule());
                            						}
                            						setWithLastConsumed(current, "pri", lv_pri_4_0, "private");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:3622:4: ( (lv_idtup_5_0= ruleIdOrTuple ) )
                    // InternalFortXTrans.g:3623:5: (lv_idtup_5_0= ruleIdOrTuple )
                    {
                    // InternalFortXTrans.g:3623:5: (lv_idtup_5_0= ruleIdOrTuple )
                    // InternalFortXTrans.g:3624:6: lv_idtup_5_0= ruleIdOrTuple
                    {

                    						newCompositeNode(grammarAccess.getFieldDeclAccess().getIdtupIdOrTupleParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_idtup_5_0=ruleIdOrTuple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldDeclRule());
                    						}
                    						set(
                    							current,
                    							"idtup",
                    							lv_idtup_5_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.IdOrTuple");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,38,FOLLOW_51); 

                    				newLeafNode(otherlv_6, grammarAccess.getFieldDeclAccess().getEqualsSignKeyword_1_2());
                    			
                    // InternalFortXTrans.g:3645:4: ( (lv_litTup_7_0= ruleLiteralTuple ) )
                    // InternalFortXTrans.g:3646:5: (lv_litTup_7_0= ruleLiteralTuple )
                    {
                    // InternalFortXTrans.g:3646:5: (lv_litTup_7_0= ruleLiteralTuple )
                    // InternalFortXTrans.g:3647:6: lv_litTup_7_0= ruleLiteralTuple
                    {

                    						newCompositeNode(grammarAccess.getFieldDeclAccess().getLitTupLiteralTupleParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_litTup_7_0=ruleLiteralTuple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldDeclRule());
                    						}
                    						set(
                    							current,
                    							"litTup",
                    							lv_litTup_7_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.LiteralTuple");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:3666:3: ( ( (lv_pri_8_0= 'private' ) )? ( (lv_mut_9_0= 'var' ) )? ( (lv_idtup_10_0= ruleIdOrTuple ) ) otherlv_11= ':' ( (lv_type_12_0= ruleType ) ) this_DOTS_13= RULE_DOTS ( (lv_init_14_0= ruleInitVal ) ) )
                    {
                    // InternalFortXTrans.g:3666:3: ( ( (lv_pri_8_0= 'private' ) )? ( (lv_mut_9_0= 'var' ) )? ( (lv_idtup_10_0= ruleIdOrTuple ) ) otherlv_11= ':' ( (lv_type_12_0= ruleType ) ) this_DOTS_13= RULE_DOTS ( (lv_init_14_0= ruleInitVal ) ) )
                    // InternalFortXTrans.g:3667:4: ( (lv_pri_8_0= 'private' ) )? ( (lv_mut_9_0= 'var' ) )? ( (lv_idtup_10_0= ruleIdOrTuple ) ) otherlv_11= ':' ( (lv_type_12_0= ruleType ) ) this_DOTS_13= RULE_DOTS ( (lv_init_14_0= ruleInitVal ) )
                    {
                    // InternalFortXTrans.g:3667:4: ( (lv_pri_8_0= 'private' ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==31) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalFortXTrans.g:3668:5: (lv_pri_8_0= 'private' )
                            {
                            // InternalFortXTrans.g:3668:5: (lv_pri_8_0= 'private' )
                            // InternalFortXTrans.g:3669:6: lv_pri_8_0= 'private'
                            {
                            lv_pri_8_0=(Token)match(input,31,FOLLOW_48); 

                            						newLeafNode(lv_pri_8_0, grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_2_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFieldDeclRule());
                            						}
                            						setWithLastConsumed(current, "pri", lv_pri_8_0, "private");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:3681:4: ( (lv_mut_9_0= 'var' ) )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==54) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalFortXTrans.g:3682:5: (lv_mut_9_0= 'var' )
                            {
                            // InternalFortXTrans.g:3682:5: (lv_mut_9_0= 'var' )
                            // InternalFortXTrans.g:3683:6: lv_mut_9_0= 'var'
                            {
                            lv_mut_9_0=(Token)match(input,54,FOLLOW_33); 

                            						newLeafNode(lv_mut_9_0, grammarAccess.getFieldDeclAccess().getMutVarKeyword_2_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFieldDeclRule());
                            						}
                            						setWithLastConsumed(current, "mut", lv_mut_9_0, "var");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:3695:4: ( (lv_idtup_10_0= ruleIdOrTuple ) )
                    // InternalFortXTrans.g:3696:5: (lv_idtup_10_0= ruleIdOrTuple )
                    {
                    // InternalFortXTrans.g:3696:5: (lv_idtup_10_0= ruleIdOrTuple )
                    // InternalFortXTrans.g:3697:6: lv_idtup_10_0= ruleIdOrTuple
                    {

                    						newCompositeNode(grammarAccess.getFieldDeclAccess().getIdtupIdOrTupleParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_idtup_10_0=ruleIdOrTuple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldDeclRule());
                    						}
                    						set(
                    							current,
                    							"idtup",
                    							lv_idtup_10_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.IdOrTuple");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getFieldDeclAccess().getColonKeyword_2_3());
                    			
                    // InternalFortXTrans.g:3718:4: ( (lv_type_12_0= ruleType ) )
                    // InternalFortXTrans.g:3719:5: (lv_type_12_0= ruleType )
                    {
                    // InternalFortXTrans.g:3719:5: (lv_type_12_0= ruleType )
                    // InternalFortXTrans.g:3720:6: lv_type_12_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getFieldDeclAccess().getTypeTypeParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_type_12_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldDeclRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_12_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_DOTS_13=(Token)match(input,RULE_DOTS,FOLLOW_49); 

                    				newLeafNode(this_DOTS_13, grammarAccess.getFieldDeclAccess().getDOTSTerminalRuleCall_2_5());
                    			
                    // InternalFortXTrans.g:3741:4: ( (lv_init_14_0= ruleInitVal ) )
                    // InternalFortXTrans.g:3742:5: (lv_init_14_0= ruleInitVal )
                    {
                    // InternalFortXTrans.g:3742:5: (lv_init_14_0= ruleInitVal )
                    // InternalFortXTrans.g:3743:6: lv_init_14_0= ruleInitVal
                    {

                    						newCompositeNode(grammarAccess.getFieldDeclAccess().getInitInitValParserRuleCall_2_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_init_14_0=ruleInitVal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldDeclRule());
                    						}
                    						set(
                    							current,
                    							"init",
                    							lv_init_14_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.InitVal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFortXTrans.g:3762:3: ( ( (lv_pri_15_0= 'private' ) )? ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( (lv_init_20_0= ruleInitVal ) ) )
                    {
                    // InternalFortXTrans.g:3762:3: ( ( (lv_pri_15_0= 'private' ) )? ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( (lv_init_20_0= ruleInitVal ) ) )
                    // InternalFortXTrans.g:3763:4: ( (lv_pri_15_0= 'private' ) )? ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( (lv_init_20_0= ruleInitVal ) )
                    {
                    // InternalFortXTrans.g:3763:4: ( (lv_pri_15_0= 'private' ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==31) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalFortXTrans.g:3764:5: (lv_pri_15_0= 'private' )
                            {
                            // InternalFortXTrans.g:3764:5: (lv_pri_15_0= 'private' )
                            // InternalFortXTrans.g:3765:6: lv_pri_15_0= 'private'
                            {
                            lv_pri_15_0=(Token)match(input,31,FOLLOW_48); 

                            						newLeafNode(lv_pri_15_0, grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_3_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFieldDeclRule());
                            						}
                            						setWithLastConsumed(current, "pri", lv_pri_15_0, "private");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:3777:4: ( (lv_mut_16_0= 'var' ) )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==54) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalFortXTrans.g:3778:5: (lv_mut_16_0= 'var' )
                            {
                            // InternalFortXTrans.g:3778:5: (lv_mut_16_0= 'var' )
                            // InternalFortXTrans.g:3779:6: lv_mut_16_0= 'var'
                            {
                            lv_mut_16_0=(Token)match(input,54,FOLLOW_33); 

                            						newLeafNode(lv_mut_16_0, grammarAccess.getFieldDeclAccess().getMutVarKeyword_3_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFieldDeclRule());
                            						}
                            						setWithLastConsumed(current, "mut", lv_mut_16_0, "var");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:3791:4: ( (lv_idtup_17_0= ruleIdOrTuple ) )
                    // InternalFortXTrans.g:3792:5: (lv_idtup_17_0= ruleIdOrTuple )
                    {
                    // InternalFortXTrans.g:3792:5: (lv_idtup_17_0= ruleIdOrTuple )
                    // InternalFortXTrans.g:3793:6: lv_idtup_17_0= ruleIdOrTuple
                    {

                    						newCompositeNode(grammarAccess.getFieldDeclAccess().getIdtupIdOrTupleParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_idtup_17_0=ruleIdOrTuple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldDeclRule());
                    						}
                    						set(
                    							current,
                    							"idtup",
                    							lv_idtup_17_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.IdOrTuple");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,37,FOLLOW_25); 

                    				newLeafNode(otherlv_18, grammarAccess.getFieldDeclAccess().getColonKeyword_3_3());
                    			
                    // InternalFortXTrans.g:3814:4: ( (lv_tuptype_19_0= ruleTupleType ) )
                    // InternalFortXTrans.g:3815:5: (lv_tuptype_19_0= ruleTupleType )
                    {
                    // InternalFortXTrans.g:3815:5: (lv_tuptype_19_0= ruleTupleType )
                    // InternalFortXTrans.g:3816:6: lv_tuptype_19_0= ruleTupleType
                    {

                    						newCompositeNode(grammarAccess.getFieldDeclAccess().getTuptypeTupleTypeParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_tuptype_19_0=ruleTupleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldDeclRule());
                    						}
                    						set(
                    							current,
                    							"tuptype",
                    							lv_tuptype_19_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.TupleType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:3833:4: ( (lv_init_20_0= ruleInitVal ) )
                    // InternalFortXTrans.g:3834:5: (lv_init_20_0= ruleInitVal )
                    {
                    // InternalFortXTrans.g:3834:5: (lv_init_20_0= ruleInitVal )
                    // InternalFortXTrans.g:3835:6: lv_init_20_0= ruleInitVal
                    {

                    						newCompositeNode(grammarAccess.getFieldDeclAccess().getInitInitValParserRuleCall_3_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_init_20_0=ruleInitVal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldDeclRule());
                    						}
                    						set(
                    							current,
                    							"init",
                    							lv_init_20_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.InitVal");
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
    // $ANTLR end "ruleFieldDecl"


    // $ANTLR start "entryRuleNoNewlineVarWTypes"
    // InternalFortXTrans.g:3857:1: entryRuleNoNewlineVarWTypes returns [EObject current=null] : iv_ruleNoNewlineVarWTypes= ruleNoNewlineVarWTypes EOF ;
    public final EObject entryRuleNoNewlineVarWTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoNewlineVarWTypes = null;


        try {
            // InternalFortXTrans.g:3857:59: (iv_ruleNoNewlineVarWTypes= ruleNoNewlineVarWTypes EOF )
            // InternalFortXTrans.g:3858:2: iv_ruleNoNewlineVarWTypes= ruleNoNewlineVarWTypes EOF
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
    // InternalFortXTrans.g:3864:1: ruleNoNewlineVarWTypes returns [EObject current=null] : ( ( (lv_single_0_0= ruleNoNewlineVarWType ) ) | (otherlv_1= '(' ( (lv_multiple_2_0= ruleNoNewlineVarWType ) ) (otherlv_3= ',' ( (lv_multiple_4_0= ruleNoNewlineVarWType ) ) )+ otherlv_5= ')' ) ) ;
    public final EObject ruleNoNewlineVarWTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_single_0_0 = null;

        EObject lv_multiple_2_0 = null;

        EObject lv_multiple_4_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3870:2: ( ( ( (lv_single_0_0= ruleNoNewlineVarWType ) ) | (otherlv_1= '(' ( (lv_multiple_2_0= ruleNoNewlineVarWType ) ) (otherlv_3= ',' ( (lv_multiple_4_0= ruleNoNewlineVarWType ) ) )+ otherlv_5= ')' ) ) )
            // InternalFortXTrans.g:3871:2: ( ( (lv_single_0_0= ruleNoNewlineVarWType ) ) | (otherlv_1= '(' ( (lv_multiple_2_0= ruleNoNewlineVarWType ) ) (otherlv_3= ',' ( (lv_multiple_4_0= ruleNoNewlineVarWType ) ) )+ otherlv_5= ')' ) )
            {
            // InternalFortXTrans.g:3871:2: ( ( (lv_single_0_0= ruleNoNewlineVarWType ) ) | (otherlv_1= '(' ( (lv_multiple_2_0= ruleNoNewlineVarWType ) ) (otherlv_3= ',' ( (lv_multiple_4_0= ruleNoNewlineVarWType ) ) )+ otherlv_5= ')' ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID||LA65_0==53) ) {
                alt65=1;
            }
            else if ( (LA65_0==35) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalFortXTrans.g:3872:3: ( (lv_single_0_0= ruleNoNewlineVarWType ) )
                    {
                    // InternalFortXTrans.g:3872:3: ( (lv_single_0_0= ruleNoNewlineVarWType ) )
                    // InternalFortXTrans.g:3873:4: (lv_single_0_0= ruleNoNewlineVarWType )
                    {
                    // InternalFortXTrans.g:3873:4: (lv_single_0_0= ruleNoNewlineVarWType )
                    // InternalFortXTrans.g:3874:5: lv_single_0_0= ruleNoNewlineVarWType
                    {

                    					newCompositeNode(grammarAccess.getNoNewlineVarWTypesAccess().getSingleNoNewlineVarWTypeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
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


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:3892:3: (otherlv_1= '(' ( (lv_multiple_2_0= ruleNoNewlineVarWType ) ) (otherlv_3= ',' ( (lv_multiple_4_0= ruleNoNewlineVarWType ) ) )+ otherlv_5= ')' )
                    {
                    // InternalFortXTrans.g:3892:3: (otherlv_1= '(' ( (lv_multiple_2_0= ruleNoNewlineVarWType ) ) (otherlv_3= ',' ( (lv_multiple_4_0= ruleNoNewlineVarWType ) ) )+ otherlv_5= ')' )
                    // InternalFortXTrans.g:3893:4: otherlv_1= '(' ( (lv_multiple_2_0= ruleNoNewlineVarWType ) ) (otherlv_3= ',' ( (lv_multiple_4_0= ruleNoNewlineVarWType ) ) )+ otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getNoNewlineVarWTypesAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalFortXTrans.g:3897:4: ( (lv_multiple_2_0= ruleNoNewlineVarWType ) )
                    // InternalFortXTrans.g:3898:5: (lv_multiple_2_0= ruleNoNewlineVarWType )
                    {
                    // InternalFortXTrans.g:3898:5: (lv_multiple_2_0= ruleNoNewlineVarWType )
                    // InternalFortXTrans.g:3899:6: lv_multiple_2_0= ruleNoNewlineVarWType
                    {

                    						newCompositeNode(grammarAccess.getNoNewlineVarWTypesAccess().getMultipleNoNewlineVarWTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_multiple_2_0=ruleNoNewlineVarWType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNoNewlineVarWTypesRule());
                    						}
                    						add(
                    							current,
                    							"multiple",
                    							lv_multiple_2_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.NoNewlineVarWType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:3916:4: (otherlv_3= ',' ( (lv_multiple_4_0= ruleNoNewlineVarWType ) ) )+
                    int cnt64=0;
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==26) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalFortXTrans.g:3917:5: otherlv_3= ',' ( (lv_multiple_4_0= ruleNoNewlineVarWType ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_23); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getNoNewlineVarWTypesAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalFortXTrans.g:3921:5: ( (lv_multiple_4_0= ruleNoNewlineVarWType ) )
                    	    // InternalFortXTrans.g:3922:6: (lv_multiple_4_0= ruleNoNewlineVarWType )
                    	    {
                    	    // InternalFortXTrans.g:3922:6: (lv_multiple_4_0= ruleNoNewlineVarWType )
                    	    // InternalFortXTrans.g:3923:7: lv_multiple_4_0= ruleNoNewlineVarWType
                    	    {

                    	    							newCompositeNode(grammarAccess.getNoNewlineVarWTypesAccess().getMultipleNoNewlineVarWTypeParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_multiple_4_0=ruleNoNewlineVarWType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNoNewlineVarWTypesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"multiple",
                    	    								lv_multiple_4_0,
                    	    								"srf.transpiler.fortxtrans.FortXTrans.NoNewlineVarWType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt64 >= 1 ) break loop64;
                                EarlyExitException eee =
                                    new EarlyExitException(64, input);
                                throw eee;
                        }
                        cnt64++;
                    } while (true);

                    otherlv_5=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getNoNewlineVarWTypesAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // InternalFortXTrans.g:3950:1: entryRuleNoNewlineVarWType returns [EObject current=null] : iv_ruleNoNewlineVarWType= ruleNoNewlineVarWType EOF ;
    public final EObject entryRuleNoNewlineVarWType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoNewlineVarWType = null;


        try {
            // InternalFortXTrans.g:3950:58: (iv_ruleNoNewlineVarWType= ruleNoNewlineVarWType EOF )
            // InternalFortXTrans.g:3951:2: iv_ruleNoNewlineVarWType= ruleNoNewlineVarWType EOF
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
    // InternalFortXTrans.g:3957:1: ruleNoNewlineVarWType returns [EObject current=null] : ( ( (lv_bid_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) ) ) ;
    public final EObject ruleNoNewlineVarWType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_bid_0_0 = null;

        EObject lv_istype_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3963:2: ( ( ( (lv_bid_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) ) ) )
            // InternalFortXTrans.g:3964:2: ( ( (lv_bid_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) ) )
            {
            // InternalFortXTrans.g:3964:2: ( ( (lv_bid_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) ) )
            // InternalFortXTrans.g:3965:3: ( (lv_bid_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) )
            {
            // InternalFortXTrans.g:3965:3: ( (lv_bid_0_0= ruleBindId ) )
            // InternalFortXTrans.g:3966:4: (lv_bid_0_0= ruleBindId )
            {
            // InternalFortXTrans.g:3966:4: (lv_bid_0_0= ruleBindId )
            // InternalFortXTrans.g:3967:5: lv_bid_0_0= ruleBindId
            {

            					newCompositeNode(grammarAccess.getNoNewlineVarWTypeAccess().getBidBindIdParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_bid_0_0=ruleBindId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNoNewlineVarWTypeRule());
            					}
            					set(
            						current,
            						"bid",
            						lv_bid_0_0,
            						"srf.transpiler.fortxtrans.FortXTrans.BindId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFortXTrans.g:3984:3: ( (lv_istype_1_0= ruleIsType ) )
            // InternalFortXTrans.g:3985:4: (lv_istype_1_0= ruleIsType )
            {
            // InternalFortXTrans.g:3985:4: (lv_istype_1_0= ruleIsType )
            // InternalFortXTrans.g:3986:5: lv_istype_1_0= ruleIsType
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


    // $ANTLR start "entryRuleInitVal"
    // InternalFortXTrans.g:4007:1: entryRuleInitVal returns [EObject current=null] : iv_ruleInitVal= ruleInitVal EOF ;
    public final EObject entryRuleInitVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitVal = null;


        try {
            // InternalFortXTrans.g:4007:48: (iv_ruleInitVal= ruleInitVal EOF )
            // InternalFortXTrans.g:4008:2: iv_ruleInitVal= ruleInitVal EOF
            {
             newCompositeNode(grammarAccess.getInitValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitVal=ruleInitVal();

            state._fsp--;

             current =iv_ruleInitVal; 
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
    // $ANTLR end "entryRuleInitVal"


    // $ANTLR start "ruleInitVal"
    // InternalFortXTrans.g:4014:1: ruleInitVal returns [EObject current=null] : ( ( ( (lv_mut_0_0= ':=' ) ) ( (lv_lit_1_0= ruleLiteralTuple ) ) ) | ( ( (lv_immut_2_0= '=' ) ) ( (lv_lit_3_0= ruleLiteralTuple ) ) ) ) ;
    public final EObject ruleInitVal() throws RecognitionException {
        EObject current = null;

        Token lv_mut_0_0=null;
        Token lv_immut_2_0=null;
        EObject lv_lit_1_0 = null;

        EObject lv_lit_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:4020:2: ( ( ( ( (lv_mut_0_0= ':=' ) ) ( (lv_lit_1_0= ruleLiteralTuple ) ) ) | ( ( (lv_immut_2_0= '=' ) ) ( (lv_lit_3_0= ruleLiteralTuple ) ) ) ) )
            // InternalFortXTrans.g:4021:2: ( ( ( (lv_mut_0_0= ':=' ) ) ( (lv_lit_1_0= ruleLiteralTuple ) ) ) | ( ( (lv_immut_2_0= '=' ) ) ( (lv_lit_3_0= ruleLiteralTuple ) ) ) )
            {
            // InternalFortXTrans.g:4021:2: ( ( ( (lv_mut_0_0= ':=' ) ) ( (lv_lit_1_0= ruleLiteralTuple ) ) ) | ( ( (lv_immut_2_0= '=' ) ) ( (lv_lit_3_0= ruleLiteralTuple ) ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==39) ) {
                alt66=1;
            }
            else if ( (LA66_0==38) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalFortXTrans.g:4022:3: ( ( (lv_mut_0_0= ':=' ) ) ( (lv_lit_1_0= ruleLiteralTuple ) ) )
                    {
                    // InternalFortXTrans.g:4022:3: ( ( (lv_mut_0_0= ':=' ) ) ( (lv_lit_1_0= ruleLiteralTuple ) ) )
                    // InternalFortXTrans.g:4023:4: ( (lv_mut_0_0= ':=' ) ) ( (lv_lit_1_0= ruleLiteralTuple ) )
                    {
                    // InternalFortXTrans.g:4023:4: ( (lv_mut_0_0= ':=' ) )
                    // InternalFortXTrans.g:4024:5: (lv_mut_0_0= ':=' )
                    {
                    // InternalFortXTrans.g:4024:5: (lv_mut_0_0= ':=' )
                    // InternalFortXTrans.g:4025:6: lv_mut_0_0= ':='
                    {
                    lv_mut_0_0=(Token)match(input,39,FOLLOW_51); 

                    						newLeafNode(lv_mut_0_0, grammarAccess.getInitValAccess().getMutColonEqualsSignKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInitValRule());
                    						}
                    						setWithLastConsumed(current, "mut", lv_mut_0_0, ":=");
                    					

                    }


                    }

                    // InternalFortXTrans.g:4037:4: ( (lv_lit_1_0= ruleLiteralTuple ) )
                    // InternalFortXTrans.g:4038:5: (lv_lit_1_0= ruleLiteralTuple )
                    {
                    // InternalFortXTrans.g:4038:5: (lv_lit_1_0= ruleLiteralTuple )
                    // InternalFortXTrans.g:4039:6: lv_lit_1_0= ruleLiteralTuple
                    {

                    						newCompositeNode(grammarAccess.getInitValAccess().getLitLiteralTupleParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_lit_1_0=ruleLiteralTuple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInitValRule());
                    						}
                    						set(
                    							current,
                    							"lit",
                    							lv_lit_1_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.LiteralTuple");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:4058:3: ( ( (lv_immut_2_0= '=' ) ) ( (lv_lit_3_0= ruleLiteralTuple ) ) )
                    {
                    // InternalFortXTrans.g:4058:3: ( ( (lv_immut_2_0= '=' ) ) ( (lv_lit_3_0= ruleLiteralTuple ) ) )
                    // InternalFortXTrans.g:4059:4: ( (lv_immut_2_0= '=' ) ) ( (lv_lit_3_0= ruleLiteralTuple ) )
                    {
                    // InternalFortXTrans.g:4059:4: ( (lv_immut_2_0= '=' ) )
                    // InternalFortXTrans.g:4060:5: (lv_immut_2_0= '=' )
                    {
                    // InternalFortXTrans.g:4060:5: (lv_immut_2_0= '=' )
                    // InternalFortXTrans.g:4061:6: lv_immut_2_0= '='
                    {
                    lv_immut_2_0=(Token)match(input,38,FOLLOW_51); 

                    						newLeafNode(lv_immut_2_0, grammarAccess.getInitValAccess().getImmutEqualsSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInitValRule());
                    						}
                    						setWithLastConsumed(current, "immut", lv_immut_2_0, "=");
                    					

                    }


                    }

                    // InternalFortXTrans.g:4073:4: ( (lv_lit_3_0= ruleLiteralTuple ) )
                    // InternalFortXTrans.g:4074:5: (lv_lit_3_0= ruleLiteralTuple )
                    {
                    // InternalFortXTrans.g:4074:5: (lv_lit_3_0= ruleLiteralTuple )
                    // InternalFortXTrans.g:4075:6: lv_lit_3_0= ruleLiteralTuple
                    {

                    						newCompositeNode(grammarAccess.getInitValAccess().getLitLiteralTupleParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_lit_3_0=ruleLiteralTuple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInitValRule());
                    						}
                    						set(
                    							current,
                    							"lit",
                    							lv_lit_3_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.LiteralTuple");
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
    // $ANTLR end "ruleInitVal"


    // $ANTLR start "entryRuleLiteralTuple"
    // InternalFortXTrans.g:4097:1: entryRuleLiteralTuple returns [EObject current=null] : iv_ruleLiteralTuple= ruleLiteralTuple EOF ;
    public final EObject entryRuleLiteralTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralTuple = null;


        try {
            // InternalFortXTrans.g:4097:53: (iv_ruleLiteralTuple= ruleLiteralTuple EOF )
            // InternalFortXTrans.g:4098:2: iv_ruleLiteralTuple= ruleLiteralTuple EOF
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
    // InternalFortXTrans.g:4104:1: ruleLiteralTuple returns [EObject current=null] : ( ( (lv_lit_0_0= ruleLiteral ) ) | (otherlv_1= '(' ( (lv_lits_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_lits_4_0= ruleLiteral ) ) )+ otherlv_5= ')' ) ) ;
    public final EObject ruleLiteralTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lit_0_0 = null;

        EObject lv_lits_2_0 = null;

        EObject lv_lits_4_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:4110:2: ( ( ( (lv_lit_0_0= ruleLiteral ) ) | (otherlv_1= '(' ( (lv_lits_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_lits_4_0= ruleLiteral ) ) )+ otherlv_5= ')' ) ) )
            // InternalFortXTrans.g:4111:2: ( ( (lv_lit_0_0= ruleLiteral ) ) | (otherlv_1= '(' ( (lv_lits_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_lits_4_0= ruleLiteral ) ) )+ otherlv_5= ')' ) )
            {
            // InternalFortXTrans.g:4111:2: ( ( (lv_lit_0_0= ruleLiteral ) ) | (otherlv_1= '(' ( (lv_lits_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_lits_4_0= ruleLiteral ) ) )+ otherlv_5= ')' ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID||(LA68_0>=RULE_INT && LA68_0<=RULE_STRING)) ) {
                alt68=1;
            }
            else if ( (LA68_0==35) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalFortXTrans.g:4112:3: ( (lv_lit_0_0= ruleLiteral ) )
                    {
                    // InternalFortXTrans.g:4112:3: ( (lv_lit_0_0= ruleLiteral ) )
                    // InternalFortXTrans.g:4113:4: (lv_lit_0_0= ruleLiteral )
                    {
                    // InternalFortXTrans.g:4113:4: (lv_lit_0_0= ruleLiteral )
                    // InternalFortXTrans.g:4114:5: lv_lit_0_0= ruleLiteral
                    {

                    					newCompositeNode(grammarAccess.getLiteralTupleAccess().getLitLiteralParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_lit_0_0=ruleLiteral();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLiteralTupleRule());
                    					}
                    					set(
                    						current,
                    						"lit",
                    						lv_lit_0_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.Literal");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:4132:3: (otherlv_1= '(' ( (lv_lits_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_lits_4_0= ruleLiteral ) ) )+ otherlv_5= ')' )
                    {
                    // InternalFortXTrans.g:4132:3: (otherlv_1= '(' ( (lv_lits_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_lits_4_0= ruleLiteral ) ) )+ otherlv_5= ')' )
                    // InternalFortXTrans.g:4133:4: otherlv_1= '(' ( (lv_lits_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_lits_4_0= ruleLiteral ) ) )+ otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_52); 

                    				newLeafNode(otherlv_1, grammarAccess.getLiteralTupleAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalFortXTrans.g:4137:4: ( (lv_lits_2_0= ruleLiteral ) )
                    // InternalFortXTrans.g:4138:5: (lv_lits_2_0= ruleLiteral )
                    {
                    // InternalFortXTrans.g:4138:5: (lv_lits_2_0= ruleLiteral )
                    // InternalFortXTrans.g:4139:6: lv_lits_2_0= ruleLiteral
                    {

                    						newCompositeNode(grammarAccess.getLiteralTupleAccess().getLitsLiteralParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_lits_2_0=ruleLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLiteralTupleRule());
                    						}
                    						add(
                    							current,
                    							"lits",
                    							lv_lits_2_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Literal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:4156:4: (otherlv_3= ',' ( (lv_lits_4_0= ruleLiteral ) ) )+
                    int cnt67=0;
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==26) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalFortXTrans.g:4157:5: otherlv_3= ',' ( (lv_lits_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_52); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getLiteralTupleAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalFortXTrans.g:4161:5: ( (lv_lits_4_0= ruleLiteral ) )
                    	    // InternalFortXTrans.g:4162:6: (lv_lits_4_0= ruleLiteral )
                    	    {
                    	    // InternalFortXTrans.g:4162:6: (lv_lits_4_0= ruleLiteral )
                    	    // InternalFortXTrans.g:4163:7: lv_lits_4_0= ruleLiteral
                    	    {

                    	    							newCompositeNode(grammarAccess.getLiteralTupleAccess().getLitsLiteralParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_lits_4_0=ruleLiteral();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLiteralTupleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"lits",
                    	    								lv_lits_4_0,
                    	    								"srf.transpiler.fortxtrans.FortXTrans.Literal");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt67 >= 1 ) break loop67;
                                EarlyExitException eee =
                                    new EarlyExitException(67, input);
                                throw eee;
                        }
                        cnt67++;
                    } while (true);

                    otherlv_5=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getLiteralTupleAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // $ANTLR end "ruleLiteralTuple"


    // $ANTLR start "entryRuleLiteral"
    // InternalFortXTrans.g:4190:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalFortXTrans.g:4190:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalFortXTrans.g:4191:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalFortXTrans.g:4197:1: ruleLiteral returns [EObject current=null] : ( ( (lv_intg_0_0= RULE_INT ) ) | ( (lv_flot_1_0= RULE_FLOAT ) ) | ( (lv_str_2_0= RULE_STRING ) ) | ( (lv_q_3_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_intg_0_0=null;
        Token lv_flot_1_0=null;
        Token lv_str_2_0=null;
        AntlrDatatypeRuleToken lv_q_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:4203:2: ( ( ( (lv_intg_0_0= RULE_INT ) ) | ( (lv_flot_1_0= RULE_FLOAT ) ) | ( (lv_str_2_0= RULE_STRING ) ) | ( (lv_q_3_0= ruleQualifiedName ) ) ) )
            // InternalFortXTrans.g:4204:2: ( ( (lv_intg_0_0= RULE_INT ) ) | ( (lv_flot_1_0= RULE_FLOAT ) ) | ( (lv_str_2_0= RULE_STRING ) ) | ( (lv_q_3_0= ruleQualifiedName ) ) )
            {
            // InternalFortXTrans.g:4204:2: ( ( (lv_intg_0_0= RULE_INT ) ) | ( (lv_flot_1_0= RULE_FLOAT ) ) | ( (lv_str_2_0= RULE_STRING ) ) | ( (lv_q_3_0= ruleQualifiedName ) ) )
            int alt69=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt69=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt69=2;
                }
                break;
            case RULE_STRING:
                {
                alt69=3;
                }
                break;
            case RULE_ID:
                {
                alt69=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalFortXTrans.g:4205:3: ( (lv_intg_0_0= RULE_INT ) )
                    {
                    // InternalFortXTrans.g:4205:3: ( (lv_intg_0_0= RULE_INT ) )
                    // InternalFortXTrans.g:4206:4: (lv_intg_0_0= RULE_INT )
                    {
                    // InternalFortXTrans.g:4206:4: (lv_intg_0_0= RULE_INT )
                    // InternalFortXTrans.g:4207:5: lv_intg_0_0= RULE_INT
                    {
                    lv_intg_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_intg_0_0, grammarAccess.getLiteralAccess().getIntgINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLiteralRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"intg",
                    						lv_intg_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:4224:3: ( (lv_flot_1_0= RULE_FLOAT ) )
                    {
                    // InternalFortXTrans.g:4224:3: ( (lv_flot_1_0= RULE_FLOAT ) )
                    // InternalFortXTrans.g:4225:4: (lv_flot_1_0= RULE_FLOAT )
                    {
                    // InternalFortXTrans.g:4225:4: (lv_flot_1_0= RULE_FLOAT )
                    // InternalFortXTrans.g:4226:5: lv_flot_1_0= RULE_FLOAT
                    {
                    lv_flot_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    					newLeafNode(lv_flot_1_0, grammarAccess.getLiteralAccess().getFlotFLOATTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLiteralRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"flot",
                    						lv_flot_1_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.FLOAT");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:4243:3: ( (lv_str_2_0= RULE_STRING ) )
                    {
                    // InternalFortXTrans.g:4243:3: ( (lv_str_2_0= RULE_STRING ) )
                    // InternalFortXTrans.g:4244:4: (lv_str_2_0= RULE_STRING )
                    {
                    // InternalFortXTrans.g:4244:4: (lv_str_2_0= RULE_STRING )
                    // InternalFortXTrans.g:4245:5: lv_str_2_0= RULE_STRING
                    {
                    lv_str_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_str_2_0, grammarAccess.getLiteralAccess().getStrSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLiteralRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"str",
                    						lv_str_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFortXTrans.g:4262:3: ( (lv_q_3_0= ruleQualifiedName ) )
                    {
                    // InternalFortXTrans.g:4262:3: ( (lv_q_3_0= ruleQualifiedName ) )
                    // InternalFortXTrans.g:4263:4: (lv_q_3_0= ruleQualifiedName )
                    {
                    // InternalFortXTrans.g:4263:4: (lv_q_3_0= ruleQualifiedName )
                    // InternalFortXTrans.g:4264:5: lv_q_3_0= ruleQualifiedName
                    {

                    					newCompositeNode(grammarAccess.getLiteralAccess().getQQualifiedNameParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_q_3_0=ruleQualifiedName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLiteralRule());
                    					}
                    					set(
                    						current,
                    						"q",
                    						lv_q_3_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.QualifiedName");
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleLocalVarDecl"
    // InternalFortXTrans.g:4285:1: entryRuleLocalVarDecl returns [EObject current=null] : iv_ruleLocalVarDecl= ruleLocalVarDecl EOF ;
    public final EObject entryRuleLocalVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVarDecl = null;


        try {
            // InternalFortXTrans.g:4285:53: (iv_ruleLocalVarDecl= ruleLocalVarDecl EOF )
            // InternalFortXTrans.g:4286:2: iv_ruleLocalVarDecl= ruleLocalVarDecl EOF
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
    // InternalFortXTrans.g:4292:1: ruleLocalVarDecl returns [EObject current=null] : ( ( ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) ( ( (lv_muta_2_0= ':=' ) ) | ( (lv_immut_3_0= '=' ) ) ) ( (lv_init_4_0= ruleBlockElem ) ) ) | ( ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) ) ) | ( ( (lv_mut_8_0= 'var' ) )? ( (lv_idtup_9_0= ruleIdOrTuple ) ) otherlv_10= ':' ( (lv_type_11_0= ruleType ) ) this_DOTS_12= RULE_DOTS ( ( (lv_muta_13_0= ':=' ) ) | ( (lv_immut_14_0= '=' ) ) ) ( (lv_init_15_0= ruleBlockElem ) ) ) | ( ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( ( (lv_muta_20_0= ':=' ) ) | ( (lv_immut_21_0= '=' ) ) ) ( (lv_init_22_0= ruleBlockElem ) ) ) ) ;
    public final EObject ruleLocalVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_mut_0_0=null;
        Token lv_muta_2_0=null;
        Token lv_immut_3_0=null;
        Token otherlv_6=null;
        Token lv_mut_8_0=null;
        Token otherlv_10=null;
        Token this_DOTS_12=null;
        Token lv_muta_13_0=null;
        Token lv_immut_14_0=null;
        Token lv_mut_16_0=null;
        Token otherlv_18=null;
        Token lv_muta_20_0=null;
        Token lv_immut_21_0=null;
        EObject lv_vars_1_0 = null;

        EObject lv_init_4_0 = null;

        EObject lv_idtup_5_0 = null;

        EObject lv_litTup_7_0 = null;

        EObject lv_idtup_9_0 = null;

        EObject lv_type_11_0 = null;

        EObject lv_init_15_0 = null;

        EObject lv_idtup_17_0 = null;

        EObject lv_tuptype_19_0 = null;

        EObject lv_init_22_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:4298:2: ( ( ( ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) ( ( (lv_muta_2_0= ':=' ) ) | ( (lv_immut_3_0= '=' ) ) ) ( (lv_init_4_0= ruleBlockElem ) ) ) | ( ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) ) ) | ( ( (lv_mut_8_0= 'var' ) )? ( (lv_idtup_9_0= ruleIdOrTuple ) ) otherlv_10= ':' ( (lv_type_11_0= ruleType ) ) this_DOTS_12= RULE_DOTS ( ( (lv_muta_13_0= ':=' ) ) | ( (lv_immut_14_0= '=' ) ) ) ( (lv_init_15_0= ruleBlockElem ) ) ) | ( ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( ( (lv_muta_20_0= ':=' ) ) | ( (lv_immut_21_0= '=' ) ) ) ( (lv_init_22_0= ruleBlockElem ) ) ) ) )
            // InternalFortXTrans.g:4299:2: ( ( ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) ( ( (lv_muta_2_0= ':=' ) ) | ( (lv_immut_3_0= '=' ) ) ) ( (lv_init_4_0= ruleBlockElem ) ) ) | ( ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) ) ) | ( ( (lv_mut_8_0= 'var' ) )? ( (lv_idtup_9_0= ruleIdOrTuple ) ) otherlv_10= ':' ( (lv_type_11_0= ruleType ) ) this_DOTS_12= RULE_DOTS ( ( (lv_muta_13_0= ':=' ) ) | ( (lv_immut_14_0= '=' ) ) ) ( (lv_init_15_0= ruleBlockElem ) ) ) | ( ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( ( (lv_muta_20_0= ':=' ) ) | ( (lv_immut_21_0= '=' ) ) ) ( (lv_init_22_0= ruleBlockElem ) ) ) )
            {
            // InternalFortXTrans.g:4299:2: ( ( ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) ( ( (lv_muta_2_0= ':=' ) ) | ( (lv_immut_3_0= '=' ) ) ) ( (lv_init_4_0= ruleBlockElem ) ) ) | ( ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) ) ) | ( ( (lv_mut_8_0= 'var' ) )? ( (lv_idtup_9_0= ruleIdOrTuple ) ) otherlv_10= ':' ( (lv_type_11_0= ruleType ) ) this_DOTS_12= RULE_DOTS ( ( (lv_muta_13_0= ':=' ) ) | ( (lv_immut_14_0= '=' ) ) ) ( (lv_init_15_0= ruleBlockElem ) ) ) | ( ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( ( (lv_muta_20_0= ':=' ) ) | ( (lv_immut_21_0= '=' ) ) ) ( (lv_init_22_0= ruleBlockElem ) ) ) )
            int alt76=4;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // InternalFortXTrans.g:4300:3: ( ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) ( ( (lv_muta_2_0= ':=' ) ) | ( (lv_immut_3_0= '=' ) ) ) ( (lv_init_4_0= ruleBlockElem ) ) )
                    {
                    // InternalFortXTrans.g:4300:3: ( ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) ( ( (lv_muta_2_0= ':=' ) ) | ( (lv_immut_3_0= '=' ) ) ) ( (lv_init_4_0= ruleBlockElem ) ) )
                    // InternalFortXTrans.g:4301:4: ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) ( ( (lv_muta_2_0= ':=' ) ) | ( (lv_immut_3_0= '=' ) ) ) ( (lv_init_4_0= ruleBlockElem ) )
                    {
                    // InternalFortXTrans.g:4301:4: ( (lv_mut_0_0= 'var' ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==54) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalFortXTrans.g:4302:5: (lv_mut_0_0= 'var' )
                            {
                            // InternalFortXTrans.g:4302:5: (lv_mut_0_0= 'var' )
                            // InternalFortXTrans.g:4303:6: lv_mut_0_0= 'var'
                            {
                            lv_mut_0_0=(Token)match(input,54,FOLLOW_48); 

                            						newLeafNode(lv_mut_0_0, grammarAccess.getLocalVarDeclAccess().getMutVarKeyword_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getLocalVarDeclRule());
                            						}
                            						setWithLastConsumed(current, "mut", lv_mut_0_0, "var");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:4315:4: ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) )
                    // InternalFortXTrans.g:4316:5: (lv_vars_1_0= ruleNoNewlineVarWTypes )
                    {
                    // InternalFortXTrans.g:4316:5: (lv_vars_1_0= ruleNoNewlineVarWTypes )
                    // InternalFortXTrans.g:4317:6: lv_vars_1_0= ruleNoNewlineVarWTypes
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getVarsNoNewlineVarWTypesParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_49);
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

                    // InternalFortXTrans.g:4334:4: ( ( (lv_muta_2_0= ':=' ) ) | ( (lv_immut_3_0= '=' ) ) )
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==39) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==38) ) {
                        alt71=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalFortXTrans.g:4335:5: ( (lv_muta_2_0= ':=' ) )
                            {
                            // InternalFortXTrans.g:4335:5: ( (lv_muta_2_0= ':=' ) )
                            // InternalFortXTrans.g:4336:6: (lv_muta_2_0= ':=' )
                            {
                            // InternalFortXTrans.g:4336:6: (lv_muta_2_0= ':=' )
                            // InternalFortXTrans.g:4337:7: lv_muta_2_0= ':='
                            {
                            lv_muta_2_0=(Token)match(input,39,FOLLOW_30); 

                            							newLeafNode(lv_muta_2_0, grammarAccess.getLocalVarDeclAccess().getMutaColonEqualsSignKeyword_0_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLocalVarDeclRule());
                            							}
                            							setWithLastConsumed(current, "muta", lv_muta_2_0, ":=");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalFortXTrans.g:4350:5: ( (lv_immut_3_0= '=' ) )
                            {
                            // InternalFortXTrans.g:4350:5: ( (lv_immut_3_0= '=' ) )
                            // InternalFortXTrans.g:4351:6: (lv_immut_3_0= '=' )
                            {
                            // InternalFortXTrans.g:4351:6: (lv_immut_3_0= '=' )
                            // InternalFortXTrans.g:4352:7: lv_immut_3_0= '='
                            {
                            lv_immut_3_0=(Token)match(input,38,FOLLOW_30); 

                            							newLeafNode(lv_immut_3_0, grammarAccess.getLocalVarDeclAccess().getImmutEqualsSignKeyword_0_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLocalVarDeclRule());
                            							}
                            							setWithLastConsumed(current, "immut", lv_immut_3_0, "=");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:4365:4: ( (lv_init_4_0= ruleBlockElem ) )
                    // InternalFortXTrans.g:4366:5: (lv_init_4_0= ruleBlockElem )
                    {
                    // InternalFortXTrans.g:4366:5: (lv_init_4_0= ruleBlockElem )
                    // InternalFortXTrans.g:4367:6: lv_init_4_0= ruleBlockElem
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getInitBlockElemParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_init_4_0=ruleBlockElem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"init",
                    							lv_init_4_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.BlockElem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:4386:3: ( ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) ) )
                    {
                    // InternalFortXTrans.g:4386:3: ( ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) ) )
                    // InternalFortXTrans.g:4387:4: ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) )
                    {
                    // InternalFortXTrans.g:4387:4: ( (lv_idtup_5_0= ruleIdOrTuple ) )
                    // InternalFortXTrans.g:4388:5: (lv_idtup_5_0= ruleIdOrTuple )
                    {
                    // InternalFortXTrans.g:4388:5: (lv_idtup_5_0= ruleIdOrTuple )
                    // InternalFortXTrans.g:4389:6: lv_idtup_5_0= ruleIdOrTuple
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getIdtupIdOrTupleParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_idtup_5_0=ruleIdOrTuple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"idtup",
                    							lv_idtup_5_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.IdOrTuple");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,38,FOLLOW_51); 

                    				newLeafNode(otherlv_6, grammarAccess.getLocalVarDeclAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalFortXTrans.g:4410:4: ( (lv_litTup_7_0= ruleLiteralTuple ) )
                    // InternalFortXTrans.g:4411:5: (lv_litTup_7_0= ruleLiteralTuple )
                    {
                    // InternalFortXTrans.g:4411:5: (lv_litTup_7_0= ruleLiteralTuple )
                    // InternalFortXTrans.g:4412:6: lv_litTup_7_0= ruleLiteralTuple
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getLitTupLiteralTupleParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_litTup_7_0=ruleLiteralTuple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"litTup",
                    							lv_litTup_7_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.LiteralTuple");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:4431:3: ( ( (lv_mut_8_0= 'var' ) )? ( (lv_idtup_9_0= ruleIdOrTuple ) ) otherlv_10= ':' ( (lv_type_11_0= ruleType ) ) this_DOTS_12= RULE_DOTS ( ( (lv_muta_13_0= ':=' ) ) | ( (lv_immut_14_0= '=' ) ) ) ( (lv_init_15_0= ruleBlockElem ) ) )
                    {
                    // InternalFortXTrans.g:4431:3: ( ( (lv_mut_8_0= 'var' ) )? ( (lv_idtup_9_0= ruleIdOrTuple ) ) otherlv_10= ':' ( (lv_type_11_0= ruleType ) ) this_DOTS_12= RULE_DOTS ( ( (lv_muta_13_0= ':=' ) ) | ( (lv_immut_14_0= '=' ) ) ) ( (lv_init_15_0= ruleBlockElem ) ) )
                    // InternalFortXTrans.g:4432:4: ( (lv_mut_8_0= 'var' ) )? ( (lv_idtup_9_0= ruleIdOrTuple ) ) otherlv_10= ':' ( (lv_type_11_0= ruleType ) ) this_DOTS_12= RULE_DOTS ( ( (lv_muta_13_0= ':=' ) ) | ( (lv_immut_14_0= '=' ) ) ) ( (lv_init_15_0= ruleBlockElem ) )
                    {
                    // InternalFortXTrans.g:4432:4: ( (lv_mut_8_0= 'var' ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==54) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalFortXTrans.g:4433:5: (lv_mut_8_0= 'var' )
                            {
                            // InternalFortXTrans.g:4433:5: (lv_mut_8_0= 'var' )
                            // InternalFortXTrans.g:4434:6: lv_mut_8_0= 'var'
                            {
                            lv_mut_8_0=(Token)match(input,54,FOLLOW_33); 

                            						newLeafNode(lv_mut_8_0, grammarAccess.getLocalVarDeclAccess().getMutVarKeyword_2_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getLocalVarDeclRule());
                            						}
                            						setWithLastConsumed(current, "mut", lv_mut_8_0, "var");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:4446:4: ( (lv_idtup_9_0= ruleIdOrTuple ) )
                    // InternalFortXTrans.g:4447:5: (lv_idtup_9_0= ruleIdOrTuple )
                    {
                    // InternalFortXTrans.g:4447:5: (lv_idtup_9_0= ruleIdOrTuple )
                    // InternalFortXTrans.g:4448:6: lv_idtup_9_0= ruleIdOrTuple
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getIdtupIdOrTupleParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_idtup_9_0=ruleIdOrTuple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"idtup",
                    							lv_idtup_9_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.IdOrTuple");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getLocalVarDeclAccess().getColonKeyword_2_2());
                    			
                    // InternalFortXTrans.g:4469:4: ( (lv_type_11_0= ruleType ) )
                    // InternalFortXTrans.g:4470:5: (lv_type_11_0= ruleType )
                    {
                    // InternalFortXTrans.g:4470:5: (lv_type_11_0= ruleType )
                    // InternalFortXTrans.g:4471:6: lv_type_11_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getTypeTypeParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_type_11_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_11_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_DOTS_12=(Token)match(input,RULE_DOTS,FOLLOW_49); 

                    				newLeafNode(this_DOTS_12, grammarAccess.getLocalVarDeclAccess().getDOTSTerminalRuleCall_2_4());
                    			
                    // InternalFortXTrans.g:4492:4: ( ( (lv_muta_13_0= ':=' ) ) | ( (lv_immut_14_0= '=' ) ) )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==39) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==38) ) {
                        alt73=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalFortXTrans.g:4493:5: ( (lv_muta_13_0= ':=' ) )
                            {
                            // InternalFortXTrans.g:4493:5: ( (lv_muta_13_0= ':=' ) )
                            // InternalFortXTrans.g:4494:6: (lv_muta_13_0= ':=' )
                            {
                            // InternalFortXTrans.g:4494:6: (lv_muta_13_0= ':=' )
                            // InternalFortXTrans.g:4495:7: lv_muta_13_0= ':='
                            {
                            lv_muta_13_0=(Token)match(input,39,FOLLOW_30); 

                            							newLeafNode(lv_muta_13_0, grammarAccess.getLocalVarDeclAccess().getMutaColonEqualsSignKeyword_2_5_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLocalVarDeclRule());
                            							}
                            							setWithLastConsumed(current, "muta", lv_muta_13_0, ":=");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalFortXTrans.g:4508:5: ( (lv_immut_14_0= '=' ) )
                            {
                            // InternalFortXTrans.g:4508:5: ( (lv_immut_14_0= '=' ) )
                            // InternalFortXTrans.g:4509:6: (lv_immut_14_0= '=' )
                            {
                            // InternalFortXTrans.g:4509:6: (lv_immut_14_0= '=' )
                            // InternalFortXTrans.g:4510:7: lv_immut_14_0= '='
                            {
                            lv_immut_14_0=(Token)match(input,38,FOLLOW_30); 

                            							newLeafNode(lv_immut_14_0, grammarAccess.getLocalVarDeclAccess().getImmutEqualsSignKeyword_2_5_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLocalVarDeclRule());
                            							}
                            							setWithLastConsumed(current, "immut", lv_immut_14_0, "=");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:4523:4: ( (lv_init_15_0= ruleBlockElem ) )
                    // InternalFortXTrans.g:4524:5: (lv_init_15_0= ruleBlockElem )
                    {
                    // InternalFortXTrans.g:4524:5: (lv_init_15_0= ruleBlockElem )
                    // InternalFortXTrans.g:4525:6: lv_init_15_0= ruleBlockElem
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getInitBlockElemParserRuleCall_2_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_init_15_0=ruleBlockElem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"init",
                    							lv_init_15_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.BlockElem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFortXTrans.g:4544:3: ( ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( ( (lv_muta_20_0= ':=' ) ) | ( (lv_immut_21_0= '=' ) ) ) ( (lv_init_22_0= ruleBlockElem ) ) )
                    {
                    // InternalFortXTrans.g:4544:3: ( ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( ( (lv_muta_20_0= ':=' ) ) | ( (lv_immut_21_0= '=' ) ) ) ( (lv_init_22_0= ruleBlockElem ) ) )
                    // InternalFortXTrans.g:4545:4: ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( ( (lv_muta_20_0= ':=' ) ) | ( (lv_immut_21_0= '=' ) ) ) ( (lv_init_22_0= ruleBlockElem ) )
                    {
                    // InternalFortXTrans.g:4545:4: ( (lv_mut_16_0= 'var' ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==54) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalFortXTrans.g:4546:5: (lv_mut_16_0= 'var' )
                            {
                            // InternalFortXTrans.g:4546:5: (lv_mut_16_0= 'var' )
                            // InternalFortXTrans.g:4547:6: lv_mut_16_0= 'var'
                            {
                            lv_mut_16_0=(Token)match(input,54,FOLLOW_33); 

                            						newLeafNode(lv_mut_16_0, grammarAccess.getLocalVarDeclAccess().getMutVarKeyword_3_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getLocalVarDeclRule());
                            						}
                            						setWithLastConsumed(current, "mut", lv_mut_16_0, "var");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:4559:4: ( (lv_idtup_17_0= ruleIdOrTuple ) )
                    // InternalFortXTrans.g:4560:5: (lv_idtup_17_0= ruleIdOrTuple )
                    {
                    // InternalFortXTrans.g:4560:5: (lv_idtup_17_0= ruleIdOrTuple )
                    // InternalFortXTrans.g:4561:6: lv_idtup_17_0= ruleIdOrTuple
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getIdtupIdOrTupleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_idtup_17_0=ruleIdOrTuple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"idtup",
                    							lv_idtup_17_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.IdOrTuple");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,37,FOLLOW_25); 

                    				newLeafNode(otherlv_18, grammarAccess.getLocalVarDeclAccess().getColonKeyword_3_2());
                    			
                    // InternalFortXTrans.g:4582:4: ( (lv_tuptype_19_0= ruleTupleType ) )
                    // InternalFortXTrans.g:4583:5: (lv_tuptype_19_0= ruleTupleType )
                    {
                    // InternalFortXTrans.g:4583:5: (lv_tuptype_19_0= ruleTupleType )
                    // InternalFortXTrans.g:4584:6: lv_tuptype_19_0= ruleTupleType
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getTuptypeTupleTypeParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_tuptype_19_0=ruleTupleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"tuptype",
                    							lv_tuptype_19_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.TupleType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:4601:4: ( ( (lv_muta_20_0= ':=' ) ) | ( (lv_immut_21_0= '=' ) ) )
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==39) ) {
                        alt75=1;
                    }
                    else if ( (LA75_0==38) ) {
                        alt75=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 0, input);

                        throw nvae;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalFortXTrans.g:4602:5: ( (lv_muta_20_0= ':=' ) )
                            {
                            // InternalFortXTrans.g:4602:5: ( (lv_muta_20_0= ':=' ) )
                            // InternalFortXTrans.g:4603:6: (lv_muta_20_0= ':=' )
                            {
                            // InternalFortXTrans.g:4603:6: (lv_muta_20_0= ':=' )
                            // InternalFortXTrans.g:4604:7: lv_muta_20_0= ':='
                            {
                            lv_muta_20_0=(Token)match(input,39,FOLLOW_30); 

                            							newLeafNode(lv_muta_20_0, grammarAccess.getLocalVarDeclAccess().getMutaColonEqualsSignKeyword_3_4_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLocalVarDeclRule());
                            							}
                            							setWithLastConsumed(current, "muta", lv_muta_20_0, ":=");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalFortXTrans.g:4617:5: ( (lv_immut_21_0= '=' ) )
                            {
                            // InternalFortXTrans.g:4617:5: ( (lv_immut_21_0= '=' ) )
                            // InternalFortXTrans.g:4618:6: (lv_immut_21_0= '=' )
                            {
                            // InternalFortXTrans.g:4618:6: (lv_immut_21_0= '=' )
                            // InternalFortXTrans.g:4619:7: lv_immut_21_0= '='
                            {
                            lv_immut_21_0=(Token)match(input,38,FOLLOW_30); 

                            							newLeafNode(lv_immut_21_0, grammarAccess.getLocalVarDeclAccess().getImmutEqualsSignKeyword_3_4_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLocalVarDeclRule());
                            							}
                            							setWithLastConsumed(current, "immut", lv_immut_21_0, "=");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:4632:4: ( (lv_init_22_0= ruleBlockElem ) )
                    // InternalFortXTrans.g:4633:5: (lv_init_22_0= ruleBlockElem )
                    {
                    // InternalFortXTrans.g:4633:5: (lv_init_22_0= ruleBlockElem )
                    // InternalFortXTrans.g:4634:6: lv_init_22_0= ruleBlockElem
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getInitBlockElemParserRuleCall_3_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_init_22_0=ruleBlockElem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"init",
                    							lv_init_22_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.BlockElem");
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
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA76 dfa76 = new DFA76(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\uffff\1\3\2\uffff\2\3\2\uffff\1\3\2\uffff";
    static final String dfa_3s = "\1\4\1\5\1\4\1\uffff\1\25\1\5\1\4\1\31\1\25\2\uffff";
    static final String dfa_4s = "\1\4\1\36\1\31\1\uffff\2\36\1\5\1\31\1\36\2\uffff";
    static final String dfa_5s = "\3\uffff\1\3\5\uffff\1\1\1\2";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\4\17\uffff\1\3\1\uffff\2\3\3\uffff\1\2\1\uffff\1\3",
            "\1\5\24\uffff\1\6",
            "",
            "\1\3\1\uffff\2\3\3\uffff\1\7\1\uffff\1\3",
            "\1\10\17\uffff\1\3\1\uffff\2\3\3\uffff\1\2\1\uffff\1\3",
            "\1\12\1\11",
            "\1\6",
            "\1\3\1\uffff\2\3\3\uffff\1\7\1\uffff\1\3",
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
            return "517:2: ( ( ( (lv_impname_0_0= ruleAPIName ) ) otherlv_1= '.' otherlv_2= '{' this_DOTS_3= RULE_DOTS otherlv_4= '}' ( ( (lv_except_5_0= 'except' ) ) ( (lv_simp_6_0= ruleSimpleNames ) ) )? ) | ( ( (lv_impname_7_0= ruleAPIName ) ) otherlv_8= '.' otherlv_9= '{' ( (lv_simpList_10_0= ruleAliasedSimpleName ) ) (otherlv_11= ',' ( (lv_simpList_12_0= ruleAliasedSimpleName ) ) )* ( ( (lv_comma_13_0= ',' ) ) ( (lv_dots_14_0= RULE_DOTS ) ) )? otherlv_15= '}' ) | ( ( (lv_impname_16_0= ruleAPIName ) ) (otherlv_17= 'as' ( (lv_asname_18_0= RULE_ID ) ) )? ) )";
        }
    }
    static final String dfa_8s = "\7\uffff";
    static final String dfa_9s = "\1\uffff\1\3\3\uffff\1\3\1\uffff";
    static final String dfa_10s = "\3\4\2\uffff\1\4\1\uffff";
    static final String dfa_11s = "\1\4\1\66\1\4\2\uffff\1\66\1\uffff";
    static final String dfa_12s = "\3\uffff\1\3\1\1\1\uffff\1\2";
    static final String dfa_13s = "\7\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\3\1\4\3\3\14\uffff\1\3\4\uffff\1\3\1\uffff\1\2\1\uffff\7\3\2\uffff\11\3\2\uffff\5\3",
            "\1\5",
            "",
            "",
            "\1\3\1\6\3\3\14\uffff\1\3\4\uffff\1\3\1\uffff\1\2\1\uffff\7\3\2\uffff\11\3\2\uffff\5\3",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "766:2: ( (this_ID_0= RULE_ID this_DOTS_1= RULE_DOTS ) | (this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )* this_DOTS_5= RULE_DOTS ) | (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) )";
        }
    }
    static final String dfa_15s = "\1\uffff\1\4\3\uffff\1\4\1\uffff";
    static final String dfa_16s = "\1\4\1\66\1\31\2\uffff\1\66\1\uffff";
    static final String dfa_17s = "\3\uffff\1\1\1\3\1\uffff\1\2";
    static final String[] dfa_18s = {
            "\1\1",
            "\1\4\1\3\17\uffff\1\4\1\uffff\2\4\1\uffff\2\4\1\2\1\uffff\6\4\21\uffff\2\4",
            "\1\5\24\uffff\1\4",
            "",
            "",
            "\1\4\1\6\17\uffff\1\4\1\uffff\2\4\1\uffff\2\4\1\2\1\uffff\6\4\21\uffff\2\4",
            ""
    };
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_8;
            this.eof = dfa_15;
            this.min = dfa_10;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_13;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "856:2: ( (this_ID_0= RULE_ID this_DOTS_1= RULE_DOTS ) | (this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )* this_DOTS_5= RULE_DOTS ) | (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) )";
        }
    }
    static final String dfa_19s = "\12\uffff";
    static final String dfa_20s = "\1\1\11\uffff";
    static final String dfa_21s = "\1\4\11\uffff";
    static final String dfa_22s = "\1\66\11\uffff";
    static final String dfa_23s = "\1\uffff\1\2\10\1";
    static final String dfa_24s = "\12\uffff}>";
    static final String[] dfa_25s = {
            "\1\6\20\uffff\1\1\11\uffff\1\2\1\3\1\4\1\5\1\11\21\uffff\1\10\1\7",
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

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "()+ loopback of 1310:2: ( (lv_decls_0_0= ruleDecl ) )+";
        }
    }
    static final String dfa_26s = "\42\uffff";
    static final String dfa_27s = "\2\uffff\3\10\1\1\12\uffff\1\1\13\uffff\1\10\2\uffff\1\10\2\uffff";
    static final String dfa_28s = "\1\4\1\uffff\5\4\2\uffff\1\5\5\32\5\4\1\5\3\32\3\5\1\32\2\4\1\32\1\4\1\5\1\32";
    static final String dfa_29s = "\1\66\1\uffff\5\66\2\uffff\1\47\1\46\4\47\1\4\1\66\1\65\1\43\1\10\1\47\4\44\1\47\1\44\1\47\1\66\1\4\1\44\1\66\2\44";
    static final String dfa_30s = "\1\uffff\1\1\5\uffff\1\2\1\3\31\uffff";
    static final String dfa_31s = "\42\uffff}>";
    static final String[] dfa_32s = {
            "\1\5\1\uffff\1\2\1\3\1\4\30\uffff\1\1\1\uffff\1\6\4\uffff\4\1\1\uffff\1\1\5\uffff\2\1\2\7",
            "",
            "\1\10\1\uffff\3\10\14\uffff\1\10\4\uffff\1\10\3\uffff\7\10\2\uffff\1\1\10\10\2\uffff\5\10",
            "\1\10\1\uffff\3\10\14\uffff\1\10\4\uffff\1\10\3\uffff\7\10\2\uffff\1\1\10\10\2\uffff\5\10",
            "\1\10\1\uffff\3\10\14\uffff\1\10\4\uffff\1\10\3\uffff\7\10\2\uffff\1\1\10\10\2\uffff\5\10",
            "\5\1\14\uffff\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\7\1\2\7\11\1\2\uffff\5\1",
            "\1\11\1\uffff\1\13\1\14\1\15\30\uffff\1\1\1\uffff\1\1\4\uffff\4\1\1\uffff\1\1\5\uffff\2\1\1\12\1\1",
            "",
            "",
            "\1\16\24\uffff\1\21\1\uffff\1\17\1\uffff\1\1\5\uffff\1\20\1\22\2\1",
            "\1\7\11\uffff\1\7\1\22\1\1",
            "\1\23\11\uffff\1\1\2\uffff\1\1",
            "\1\23\11\uffff\1\1\2\uffff\1\1",
            "\1\23\11\uffff\1\1\2\uffff\1\1",
            "\1\23\3\uffff\1\1\5\uffff\1\1\2\uffff\1\1",
            "\1\24",
            "\1\1\1\uffff\3\1\14\uffff\1\1\4\uffff\1\1\3\uffff\7\1\2\7\1\uffff\10\1\2\uffff\5\1",
            "\1\30\1\uffff\1\25\1\26\1\27\54\uffff\1\7",
            "\1\31\36\uffff\1\1",
            "\1\32\1\uffff\1\25\1\26\1\27",
            "\1\33\24\uffff\1\23\1\uffff\1\17\1\uffff\1\1\5\uffff\1\1\2\uffff\1\1",
            "\1\23\11\uffff\1\34",
            "\1\23\11\uffff\1\34",
            "\1\23\11\uffff\1\34",
            "\1\36\24\uffff\1\21\1\uffff\1\35\7\uffff\1\37",
            "\1\1\24\uffff\1\7\13\uffff\2\1",
            "\1\36\24\uffff\1\23\1\uffff\1\35\7\uffff\1\34",
            "\1\23\3\uffff\1\1\5\uffff\1\1\2\uffff\1\1",
            "\1\10\1\uffff\3\10\14\uffff\1\10\4\uffff\1\10\3\uffff\7\10\2\uffff\1\1\10\10\2\uffff\5\10",
            "\1\40",
            "\1\23\11\uffff\1\34",
            "\1\10\1\uffff\3\10\14\uffff\1\10\4\uffff\1\10\3\uffff\7\10\2\7\1\1\10\10\2\uffff\5\10",
            "\1\41\24\uffff\1\23\1\uffff\1\35\7\uffff\1\34",
            "\1\23\11\uffff\1\34"
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = dfa_26;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "1984:2: ( ( ( (lv_front_0_0= ruleExprFront ) ) ( (lv_tails_1_0= ruleExprTail ) )* ) | ( (lv_locVar_2_0= ruleLocalVarDecl ) ) | ( (lv_lit_3_0= ruleLiteralTuple ) ) )";
        }
    }
    static final String dfa_33s = "\10\uffff";
    static final String dfa_34s = "\2\uffff\1\4\2\uffff\3\4";
    static final String dfa_35s = "\1\4\1\uffff\2\4\1\uffff\3\4";
    static final String dfa_36s = "\1\64\1\uffff\1\66\1\4\1\uffff\3\66";
    static final String dfa_37s = "\1\uffff\1\1\2\uffff\1\2\3\uffff";
    static final String dfa_38s = "\10\uffff}>";
    static final String[] dfa_39s = {
            "\1\2\1\uffff\3\1\30\uffff\1\1\1\uffff\1\1\4\uffff\4\1\1\uffff\1\1\5\uffff\2\1",
            "",
            "\1\4\1\5\3\4\14\uffff\1\4\4\uffff\1\4\1\uffff\1\3\1\uffff\7\4\2\uffff\1\1\10\4\2\uffff\5\4",
            "\1\6",
            "",
            "\1\4\1\uffff\3\4\14\uffff\1\4\4\uffff\1\4\3\uffff\7\4\2\uffff\1\1\10\4\2\uffff\5\4",
            "\1\4\1\7\3\4\14\uffff\1\4\4\uffff\1\4\1\uffff\1\3\1\uffff\7\4\2\uffff\1\1\10\4\2\uffff\5\4",
            "\1\4\1\uffff\3\4\14\uffff\1\4\4\uffff\1\4\3\uffff\7\4\2\uffff\1\1\10\4\2\uffff\5\4"
    };

    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[][] dfa_39 = unpackEncodedStringArray(dfa_39s);

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_33;
            this.eof = dfa_34;
            this.min = dfa_35;
            this.max = dfa_36;
            this.accept = dfa_37;
            this.special = dfa_38;
            this.transition = dfa_39;
        }
        public String getDescription() {
            return "2083:2: ( ( (lv_delim_0_0= ruleDelimitedExpr ) ) | ( (lv_id_1_0= ruleQualifiedName ) ) )";
        }
    }
    static final String dfa_40s = "\22\uffff";
    static final String dfa_41s = "\1\4\2\uffff\1\4\5\uffff\3\32\1\5\1\uffff\1\32\1\4\1\5\1\32";
    static final String dfa_42s = "\1\64\2\uffff\1\66\5\uffff\4\47\1\uffff\1\47\1\4\2\47";
    static final String dfa_43s = "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\10\4\uffff\1\7\4\uffff";
    static final String dfa_44s = "\22\uffff}>";
    static final String[] dfa_45s = {
            "\1\2\1\uffff\3\2\30\uffff\1\1\1\uffff\1\3\4\uffff\1\4\1\5\1\6\1\7\1\uffff\1\10\5\uffff\2\1",
            "",
            "",
            "\1\14\1\uffff\1\11\1\12\1\13\30\uffff\1\15\1\uffff\1\15\4\uffff\4\15\1\uffff\1\15\5\uffff\4\15",
            "",
            "",
            "",
            "",
            "",
            "\1\2\11\uffff\1\15\2\uffff\1\15",
            "\1\2\11\uffff\1\15\2\uffff\1\15",
            "\1\2\11\uffff\1\15\2\uffff\1\15",
            "\1\16\24\uffff\1\2\1\uffff\1\17\1\uffff\1\15\5\uffff\4\15",
            "",
            "\1\2\3\uffff\1\15\5\uffff\1\15\2\uffff\1\15",
            "\1\20",
            "\1\21\24\uffff\1\2\1\uffff\1\17\1\uffff\1\15\5\uffff\1\15\2\uffff\1\15",
            "\1\2\3\uffff\1\15\5\uffff\1\15\2\uffff\1\15"
    };

    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[][] dfa_45 = unpackEncodedStringArray(dfa_45s);

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = dfa_40;
            this.eof = dfa_40;
            this.min = dfa_41;
            this.max = dfa_42;
            this.accept = dfa_43;
            this.special = dfa_44;
            this.transition = dfa_45;
        }
        public String getDescription() {
            return "2183:2: ( ( (lv_dod_0_0= ruleDo ) ) | ( ( (lv_lits_1_0= ruleLiteralTuple ) ) ( (lv_eqop_2_0= ':=' ) ) ( (lv_pblock_3_0= ruleParBlockElems ) ) ) | ( ( (lv_ret_4_0= 'return' ) ) ( (lv_block_5_0= ruleBlockElem ) ) ) | ( ( (lv_awhile_6_0= 'while' ) ) ( (lv_expr_7_0= ruleExpr ) ) ( (lv_whiledod_8_0= ruleDo ) ) ) | ( ( (lv_afor_9_0= 'for' ) ) ( (lv_gen_10_0= ruleGenerators ) ) ( (lv_dofront_11_0= ruleDoFront ) ) otherlv_12= 'end' ) | ( ( (lv_anif_13_0= 'if' ) ) ( (lv_cond_14_0= ruleExpr ) ) otherlv_15= 'then' ( (lv_blocks_16_0= ruleBlockElems ) ) ( (lv_elifs_17_0= ruleElifs ) )? ( (lv_els_18_0= ruleElse ) )? otherlv_19= 'end' ) | ( (lv_par_20_0= ruleParanthesized ) ) | (otherlv_21= '|' ( (lv_parblock_22_0= ruleParBlockElems ) ) otherlv_23= '|' ) )";
        }
    }
    static final String dfa_46s = "\15\uffff";
    static final String dfa_47s = "\1\4\2\60\2\4\2\32\2\uffff\1\4\1\60\2\32";
    static final String dfa_48s = "\1\65\2\60\1\65\1\66\2\44\2\uffff\1\65\1\60\2\44";
    static final String dfa_49s = "\7\uffff\1\2\1\1\4\uffff";
    static final String dfa_50s = "\15\uffff}>";
    static final String[] dfa_51s = {
            "\1\1\36\uffff\1\3\21\uffff\1\2",
            "\1\4",
            "\1\4",
            "\1\5\60\uffff\1\6",
            "\1\10\1\uffff\3\10\30\uffff\1\10\1\uffff\1\10\4\uffff\4\10\1\uffff\1\10\3\uffff\1\7\1\uffff\4\10",
            "\1\11\11\uffff\1\12",
            "\1\11\11\uffff\1\12",
            "",
            "",
            "\1\13\60\uffff\1\14",
            "\1\4",
            "\1\11\11\uffff\1\12",
            "\1\11\11\uffff\1\12"
    };

    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[][] dfa_51 = unpackEncodedStringArray(dfa_51s);

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_46;
            this.eof = dfa_46;
            this.min = dfa_47;
            this.max = dfa_48;
            this.accept = dfa_49;
            this.special = dfa_50;
            this.transition = dfa_51;
        }
        public String getDescription() {
            return "2885:2: ( ( ( (lv_idtup_0_0= ruleIdOrTuple ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleExpr ) ) ) | ( ( (lv_idtup_3_0= ruleIdOrTuple ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_expr_7_0= ruleExpr ) ) otherlv_8= ')' ) )";
        }
    }
    static final String dfa_52s = "\20\uffff";
    static final String dfa_53s = "\1\uffff\1\4\6\uffff\1\4\6\uffff\1\4";
    static final String dfa_54s = "\1\4\1\5\1\45\1\4\2\uffff\1\5\2\32\2\4\1\45\1\5\3\32";
    static final String dfa_55s = "\1\66\1\64\1\60\1\66\2\uffff\1\47\1\46\1\64\2\65\1\60\3\44\1\64";
    static final String dfa_56s = "\4\uffff\1\2\1\1\12\uffff";
    static final String dfa_57s = "\20\uffff}>";
    static final String[] dfa_58s = {
            "\1\1\1\uffff\3\4\30\uffff\1\4\1\uffff\1\3\4\uffff\4\4\1\uffff\1\4\5\uffff\2\4\1\2\1\4",
            "\1\4\24\uffff\1\4\1\uffff\1\4\1\uffff\1\4\2\uffff\1\4\3\uffff\3\4\10\uffff\1\5\2\uffff\2\4",
            "\2\4\11\uffff\1\5",
            "\1\6\1\uffff\3\4\30\uffff\1\4\1\uffff\1\4\4\uffff\4\4\1\uffff\1\4\5\uffff\2\4\1\7\1\4",
            "",
            "",
            "\1\4\24\uffff\1\11\1\uffff\1\4\1\uffff\1\4\5\uffff\1\10\3\4",
            "\1\12\11\uffff\1\13\2\4",
            "\1\4\3\uffff\1\4\2\uffff\1\4\3\uffff\2\4\11\uffff\1\5\2\uffff\2\4",
            "\1\14\1\uffff\3\4\54\uffff\1\15",
            "\1\16\60\uffff\1\15",
            "\2\4\11\uffff\1\5",
            "\1\4\24\uffff\1\11\1\uffff\1\4\7\uffff\1\17",
            "\1\12\11\uffff\1\13",
            "\1\12\11\uffff\1\13",
            "\1\4\6\uffff\1\4\3\uffff\3\4\10\uffff\1\5\2\uffff\2\4"
    };

    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final char[] dfa_55 = DFA.unpackEncodedStringToUnsignedChars(dfa_55s);
    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final short[][] dfa_58 = unpackEncodedStringArray(dfa_58s);

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = dfa_52;
            this.eof = dfa_53;
            this.min = dfa_54;
            this.max = dfa_55;
            this.accept = dfa_56;
            this.special = dfa_57;
            this.transition = dfa_58;
        }
        public String getDescription() {
            return "3015:2: ( ( (lv_binding_0_0= ruleBinding ) ) | ( (lv_expr_1_0= ruleExpr ) ) )";
        }
    }
    static final String dfa_59s = "\34\uffff";
    static final String dfa_60s = "\3\4\2\45\1\4\2\45\2\4\1\uffff\4\32\1\5\1\uffff\1\4\1\45\1\uffff\1\4\1\45\1\uffff\2\32\1\4\2\32";
    static final String dfa_61s = "\2\66\1\65\2\46\1\65\2\45\1\65\1\43\1\uffff\4\45\1\47\1\uffff\1\65\1\46\1\uffff\1\65\1\45\1\uffff\2\44\1\43\2\44";
    static final String dfa_62s = "\12\uffff\1\2\5\uffff\1\4\2\uffff\1\1\2\uffff\1\3\5\uffff";
    static final String dfa_63s = "\34\uffff}>";
    static final String[] dfa_64s = {
            "\1\3\32\uffff\1\1\3\uffff\1\5\21\uffff\1\4\1\2",
            "\1\3\36\uffff\1\5\21\uffff\1\4\1\2",
            "\1\6\36\uffff\1\10\21\uffff\1\7",
            "\1\11\1\12",
            "\1\11\1\12",
            "\1\13\60\uffff\1\14",
            "\1\11",
            "\1\11",
            "\1\15\60\uffff\1\16",
            "\1\17\36\uffff\1\20",
            "",
            "\1\21\11\uffff\1\22\1\23",
            "\1\21\11\uffff\1\22\1\23",
            "\1\24\11\uffff\1\25\1\23",
            "\1\24\11\uffff\1\25\1\23",
            "\1\26\40\uffff\2\23",
            "",
            "\1\27\60\uffff\1\30",
            "\1\31\1\12",
            "",
            "\1\32\60\uffff\1\33",
            "\1\31",
            "",
            "\1\21\11\uffff\1\22",
            "\1\21\11\uffff\1\22",
            "\1\26\36\uffff\1\20",
            "\1\24\11\uffff\1\25",
            "\1\24\11\uffff\1\25"
    };

    static final short[] dfa_59 = DFA.unpackEncodedString(dfa_59s);
    static final char[] dfa_60 = DFA.unpackEncodedStringToUnsignedChars(dfa_60s);
    static final char[] dfa_61 = DFA.unpackEncodedStringToUnsignedChars(dfa_61s);
    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final short[][] dfa_64 = unpackEncodedStringArray(dfa_64s);

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = dfa_59;
            this.eof = dfa_59;
            this.min = dfa_60;
            this.max = dfa_61;
            this.accept = dfa_62;
            this.special = dfa_63;
            this.transition = dfa_64;
        }
        public String getDescription() {
            return "3537:2: ( ( ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) ( (lv_init_3_0= ruleInitVal ) ) ) | ( ( (lv_pri_4_0= 'private' ) )? ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) ) ) | ( ( (lv_pri_8_0= 'private' ) )? ( (lv_mut_9_0= 'var' ) )? ( (lv_idtup_10_0= ruleIdOrTuple ) ) otherlv_11= ':' ( (lv_type_12_0= ruleType ) ) this_DOTS_13= RULE_DOTS ( (lv_init_14_0= ruleInitVal ) ) ) | ( ( (lv_pri_15_0= 'private' ) )? ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( (lv_init_20_0= ruleInitVal ) ) ) )";
        }
    }
    static final String dfa_65s = "\33\uffff";
    static final String dfa_66s = "\2\4\2\45\1\4\2\45\2\4\1\uffff\4\32\1\uffff\1\5\1\4\1\45\1\uffff\1\4\1\45\1\uffff\2\32\1\4\2\32";
    static final String dfa_67s = "\1\66\1\65\2\46\1\65\2\45\1\65\1\43\1\uffff\4\45\1\uffff\1\47\1\65\1\46\1\uffff\1\65\1\45\1\uffff\2\44\1\43\2\44";
    static final String dfa_68s = "\11\uffff\1\2\4\uffff\1\4\3\uffff\1\1\2\uffff\1\3\5\uffff";
    static final String dfa_69s = "\33\uffff}>";
    static final String[] dfa_70s = {
            "\1\2\36\uffff\1\4\21\uffff\1\3\1\1",
            "\1\5\36\uffff\1\7\21\uffff\1\6",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\12\60\uffff\1\13",
            "\1\10",
            "\1\10",
            "\1\14\60\uffff\1\15",
            "\1\17\36\uffff\1\16",
            "",
            "\1\20\11\uffff\1\21\1\22",
            "\1\20\11\uffff\1\21\1\22",
            "\1\23\11\uffff\1\24\1\22",
            "\1\23\11\uffff\1\24\1\22",
            "",
            "\1\25\40\uffff\2\22",
            "\1\26\60\uffff\1\27",
            "\1\30\1\11",
            "",
            "\1\31\60\uffff\1\32",
            "\1\30",
            "",
            "\1\20\11\uffff\1\21",
            "\1\20\11\uffff\1\21",
            "\1\25\36\uffff\1\16",
            "\1\23\11\uffff\1\24",
            "\1\23\11\uffff\1\24"
    };

    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final char[] dfa_66 = DFA.unpackEncodedStringToUnsignedChars(dfa_66s);
    static final char[] dfa_67 = DFA.unpackEncodedStringToUnsignedChars(dfa_67s);
    static final short[] dfa_68 = DFA.unpackEncodedString(dfa_68s);
    static final short[] dfa_69 = DFA.unpackEncodedString(dfa_69s);
    static final short[][] dfa_70 = unpackEncodedStringArray(dfa_70s);

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = dfa_65;
            this.eof = dfa_65;
            this.min = dfa_66;
            this.max = dfa_67;
            this.accept = dfa_68;
            this.special = dfa_69;
            this.transition = dfa_70;
        }
        public String getDescription() {
            return "4299:2: ( ( ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) ( ( (lv_muta_2_0= ':=' ) ) | ( (lv_immut_3_0= '=' ) ) ) ( (lv_init_4_0= ruleBlockElem ) ) ) | ( ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) ) ) | ( ( (lv_mut_8_0= 'var' ) )? ( (lv_idtup_9_0= ruleIdOrTuple ) ) otherlv_10= ':' ( (lv_type_11_0= ruleType ) ) this_DOTS_12= RULE_DOTS ( ( (lv_muta_13_0= ':=' ) ) | ( (lv_immut_14_0= '=' ) ) ) ( (lv_init_15_0= ruleBlockElem ) ) ) | ( ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( ( (lv_muta_20_0= ':=' ) ) | ( (lv_immut_21_0= '=' ) ) ) ( (lv_init_22_0= ruleBlockElem ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0060000F81A00010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0060000F80200010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0060000F80000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0020001000000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0020000800000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00782F0A800001D0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0018000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020000880000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000C00000200000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000200000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00782F0A800001D2L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0004000000200000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0010000200000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0060000880000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00000008000001D0L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00000000000001D0L});

}