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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOTS", "RULE_ML_COMMENT", "RULE_SD", "RULE_GREATERS", "RULE_LESSES", "RULE_BARS", "RULE_SLASHES", "RULE_LEFT_ENCLOSER", "RULE_RIGHT_ENCLOSER", "RULE_INT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'component'", "'end'", "'api'", "'import'", "'export'", "'{'", "','", "'}'", "'.'", "'except'", "'as'", "':'", "'='", "'private'", "'test'", "'atomic'", "'io'", "'('", "')'", "'_'", "'also'", "'do'"
    };
    public static final int RULE_BARS=10;
    public static final int RULE_RIGHT_ENCLOSER=13;
    public static final int RULE_STRING=15;
    public static final int RULE_DOTS=5;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__19=19;
    public static final int RULE_LESSES=9;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=17;
    public static final int RULE_GREATERS=8;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_SD=7;
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
    public static final int T__40=40;
    public static final int RULE_SLASHES=11;
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

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
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
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

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

                if ( (LA2_0==22) ) {
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

                if ( (LA3_0==23) ) {
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

                if ( (LA4_0==RULE_ID||(LA4_0>=32 && LA4_0<=35)) ) {
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

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

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

                if ( (LA5_0==22) ) {
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

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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

            if ( (LA6_0==22) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    alt6=1;
                }
                else if ( (LA6_1==21) ) {
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
                    lv_imps_0_0=(Token)match(input,22,FOLLOW_3); 

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
                    lv_imps_2_0=(Token)match(input,22,FOLLOW_8); 

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
                    lv_api_3_0=(Token)match(input,21,FOLLOW_9); 

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

            if ( (LA8_0==23) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    alt8=1;
                }
                else if ( (LA8_1==24) ) {
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
                    lv_exp_0_0=(Token)match(input,23,FOLLOW_3); 

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
                    lv_exp_2_0=(Token)match(input,23,FOLLOW_10); 

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
                    lv_brack_3_0=(Token)match(input,24,FOLLOW_3); 

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

                        if ( (LA7_0==25) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalFortXTrans.g:470:5: otherlv_5= ',' ( (lv_exportedName_6_0= ruleAPIName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,25,FOLLOW_3); 

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

                    otherlv_7=(Token)match(input,26,FOLLOW_2); 

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

                    otherlv_1=(Token)match(input,27,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getImportedNamesAccess().getFullStopKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getImportedNamesAccess().getLeftCurlyBracketKeyword_0_2());
                    			
                    this_DOTS_3=(Token)match(input,RULE_DOTS,FOLLOW_14); 

                    				newLeafNode(this_DOTS_3, grammarAccess.getImportedNamesAccess().getDOTSTerminalRuleCall_0_3());
                    			
                    otherlv_4=(Token)match(input,26,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getImportedNamesAccess().getRightCurlyBracketKeyword_0_4());
                    			
                    // InternalFortXTrans.g:554:4: ( ( (lv_except_5_0= 'except' ) ) ( (lv_simp_6_0= ruleSimpleNames ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==28) ) {
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
                            lv_except_5_0=(Token)match(input,28,FOLLOW_9); 

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

                    otherlv_8=(Token)match(input,27,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getImportedNamesAccess().getFullStopKeyword_1_1());
                    			
                    otherlv_9=(Token)match(input,24,FOLLOW_3); 

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

                        if ( (LA10_0==25) ) {
                            int LA10_1 = input.LA(2);

                            if ( (LA10_1==RULE_ID) ) {
                                alt10=1;
                            }


                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalFortXTrans.g:639:5: otherlv_11= ',' ( (lv_simpList_12_0= ruleAliasedSimpleName ) )
                    	    {
                    	    otherlv_11=(Token)match(input,25,FOLLOW_3); 

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

                    if ( (LA11_0==25) ) {
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
                            lv_comma_13_0=(Token)match(input,25,FOLLOW_13); 

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

                    otherlv_15=(Token)match(input,26,FOLLOW_2); 

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

                    if ( (LA12_0==29) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalFortXTrans.g:724:5: otherlv_17= 'as' ( (lv_asname_18_0= RULE_ID ) )
                            {
                            otherlv_17=(Token)match(input,29,FOLLOW_3); 

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

                        if ( (LA14_0==27) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalFortXTrans.g:793:5: kw= '.' this_ID_4= RULE_ID
                    	    {
                    	    kw=(Token)match(input,27,FOLLOW_3); 

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

                        if ( (LA15_0==27) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalFortXTrans.g:824:5: kw= '.' this_ID_8= RULE_ID
                    	    {
                    	    kw=(Token)match(input,27,FOLLOW_3); 

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

                        if ( (LA17_0==27) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalFortXTrans.g:883:5: kw= '.' this_ID_4= RULE_ID
                    	    {
                    	    kw=(Token)match(input,27,FOLLOW_3); 

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

                        if ( (LA18_0==27) ) {
                            int LA18_2 = input.LA(2);

                            if ( (LA18_2==RULE_ID) ) {
                                alt18=1;
                            }


                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalFortXTrans.g:914:5: kw= '.' this_ID_8= RULE_ID
                    	    {
                    	    kw=(Token)match(input,27,FOLLOW_3); 

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
            else if ( (LA21_0==24) ) {
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
                    lv_brack_1_0=(Token)match(input,24,FOLLOW_3); 

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

                        if ( (LA20_0==25) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalFortXTrans.g:1002:5: otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_3); 

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

                    otherlv_5=(Token)match(input,26,FOLLOW_2); 

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

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalFortXTrans.g:1104:4: otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_3); 

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
            else if ( (LA24_0==24) ) {
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
                    lv_brack_1_0=(Token)match(input,24,FOLLOW_3); 

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

                        if ( (LA23_0==25) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalFortXTrans.g:1201:5: otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_3); 

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

                    otherlv_5=(Token)match(input,26,FOLLOW_2); 

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

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalFortXTrans.g:1269:4: otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_3); 

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
                switch ( input.LA(1) ) {
                case 34:
                    {
                    alt26=1;
                    }
                    break;
                case 35:
                    {
                    alt26=1;
                    }
                    break;
                case 33:
                    {
                    alt26=1;
                    }
                    break;
                case 32:
                    {
                    alt26=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt26=1;
                    }
                    break;

                }

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
    // InternalFortXTrans.g:1339:1: ruleDecl returns [EObject current=null] : ( (lv_function_0_0= ruleFnDecl ) ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_function_0_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1345:2: ( ( (lv_function_0_0= ruleFnDecl ) ) )
            // InternalFortXTrans.g:1346:2: ( (lv_function_0_0= ruleFnDecl ) )
            {
            // InternalFortXTrans.g:1346:2: ( (lv_function_0_0= ruleFnDecl ) )
            // InternalFortXTrans.g:1347:3: (lv_function_0_0= ruleFnDecl )
            {
            // InternalFortXTrans.g:1347:3: (lv_function_0_0= ruleFnDecl )
            // InternalFortXTrans.g:1348:4: lv_function_0_0= ruleFnDecl
            {

            				newCompositeNode(grammarAccess.getDeclAccess().getFunctionFnDeclParserRuleCall_0());
            			
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


    // $ANTLR start "entryRuleFnDecl"
    // InternalFortXTrans.g:1368:1: entryRuleFnDecl returns [EObject current=null] : iv_ruleFnDecl= ruleFnDecl EOF ;
    public final EObject entryRuleFnDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFnDecl = null;


        try {
            // InternalFortXTrans.g:1368:47: (iv_ruleFnDecl= ruleFnDecl EOF )
            // InternalFortXTrans.g:1369:2: iv_ruleFnDecl= ruleFnDecl EOF
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
    // InternalFortXTrans.g:1375:1: ruleFnDecl returns [EObject current=null] : ( ( (lv_mods_0_0= ruleFnMods ) )? ( (lv_fnName_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleValParam ) ) otherlv_3= ':' ( (lv_return_4_0= ruleRetType ) ) (otherlv_5= '=' ( (lv_fnItself_6_0= ruleExpression ) ) )? ) ;
    public final EObject ruleFnDecl() throws RecognitionException {
        EObject current = null;

        Token lv_fnName_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_mods_0_0 = null;

        EObject lv_params_2_0 = null;

        EObject lv_return_4_0 = null;

        EObject lv_fnItself_6_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1381:2: ( ( ( (lv_mods_0_0= ruleFnMods ) )? ( (lv_fnName_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleValParam ) ) otherlv_3= ':' ( (lv_return_4_0= ruleRetType ) ) (otherlv_5= '=' ( (lv_fnItself_6_0= ruleExpression ) ) )? ) )
            // InternalFortXTrans.g:1382:2: ( ( (lv_mods_0_0= ruleFnMods ) )? ( (lv_fnName_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleValParam ) ) otherlv_3= ':' ( (lv_return_4_0= ruleRetType ) ) (otherlv_5= '=' ( (lv_fnItself_6_0= ruleExpression ) ) )? )
            {
            // InternalFortXTrans.g:1382:2: ( ( (lv_mods_0_0= ruleFnMods ) )? ( (lv_fnName_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleValParam ) ) otherlv_3= ':' ( (lv_return_4_0= ruleRetType ) ) (otherlv_5= '=' ( (lv_fnItself_6_0= ruleExpression ) ) )? )
            // InternalFortXTrans.g:1383:3: ( (lv_mods_0_0= ruleFnMods ) )? ( (lv_fnName_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleValParam ) ) otherlv_3= ':' ( (lv_return_4_0= ruleRetType ) ) (otherlv_5= '=' ( (lv_fnItself_6_0= ruleExpression ) ) )?
            {
            // InternalFortXTrans.g:1383:3: ( (lv_mods_0_0= ruleFnMods ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=32 && LA27_0<=35)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalFortXTrans.g:1384:4: (lv_mods_0_0= ruleFnMods )
                    {
                    // InternalFortXTrans.g:1384:4: (lv_mods_0_0= ruleFnMods )
                    // InternalFortXTrans.g:1385:5: lv_mods_0_0= ruleFnMods
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

            // InternalFortXTrans.g:1402:3: ( (lv_fnName_1_0= RULE_ID ) )
            // InternalFortXTrans.g:1403:4: (lv_fnName_1_0= RULE_ID )
            {
            // InternalFortXTrans.g:1403:4: (lv_fnName_1_0= RULE_ID )
            // InternalFortXTrans.g:1404:5: lv_fnName_1_0= RULE_ID
            {
            lv_fnName_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_fnName_1_0, grammarAccess.getFnDeclAccess().getFnNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFnDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fnName",
            						lv_fnName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalFortXTrans.g:1420:3: ( (lv_params_2_0= ruleValParam ) )
            // InternalFortXTrans.g:1421:4: (lv_params_2_0= ruleValParam )
            {
            // InternalFortXTrans.g:1421:4: (lv_params_2_0= ruleValParam )
            // InternalFortXTrans.g:1422:5: lv_params_2_0= ruleValParam
            {

            					newCompositeNode(grammarAccess.getFnDeclAccess().getParamsValParamParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_3=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getFnDeclAccess().getColonKeyword_3());
            		
            // InternalFortXTrans.g:1443:3: ( (lv_return_4_0= ruleRetType ) )
            // InternalFortXTrans.g:1444:4: (lv_return_4_0= ruleRetType )
            {
            // InternalFortXTrans.g:1444:4: (lv_return_4_0= ruleRetType )
            // InternalFortXTrans.g:1445:5: lv_return_4_0= ruleRetType
            {

            					newCompositeNode(grammarAccess.getFnDeclAccess().getReturnRetTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_return_4_0=ruleRetType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFnDeclRule());
            					}
            					set(
            						current,
            						"return",
            						lv_return_4_0,
            						"srf.transpiler.fortxtrans.FortXTrans.RetType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFortXTrans.g:1462:3: (otherlv_5= '=' ( (lv_fnItself_6_0= ruleExpression ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalFortXTrans.g:1463:4: otherlv_5= '=' ( (lv_fnItself_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_24); 

                    				newLeafNode(otherlv_5, grammarAccess.getFnDeclAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalFortXTrans.g:1467:4: ( (lv_fnItself_6_0= ruleExpression ) )
                    // InternalFortXTrans.g:1468:5: (lv_fnItself_6_0= ruleExpression )
                    {
                    // InternalFortXTrans.g:1468:5: (lv_fnItself_6_0= ruleExpression )
                    // InternalFortXTrans.g:1469:6: lv_fnItself_6_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getFnDeclAccess().getFnItselfExpressionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_fnItself_6_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFnDeclRule());
                    						}
                    						set(
                    							current,
                    							"fnItself",
                    							lv_fnItself_6_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Expression");
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


    // $ANTLR start "entryRuleFnMods"
    // InternalFortXTrans.g:1491:1: entryRuleFnMods returns [EObject current=null] : iv_ruleFnMods= ruleFnMods EOF ;
    public final EObject entryRuleFnMods() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFnMods = null;


        try {
            // InternalFortXTrans.g:1491:47: (iv_ruleFnMods= ruleFnMods EOF )
            // InternalFortXTrans.g:1492:2: iv_ruleFnMods= ruleFnMods EOF
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
    // InternalFortXTrans.g:1498:1: ruleFnMods returns [EObject current=null] : ( (lv_mods_0_0= ruleFnMod ) )+ ;
    public final EObject ruleFnMods() throws RecognitionException {
        EObject current = null;

        EObject lv_mods_0_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1504:2: ( ( (lv_mods_0_0= ruleFnMod ) )+ )
            // InternalFortXTrans.g:1505:2: ( (lv_mods_0_0= ruleFnMod ) )+
            {
            // InternalFortXTrans.g:1505:2: ( (lv_mods_0_0= ruleFnMod ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=32 && LA29_0<=35)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalFortXTrans.g:1506:3: (lv_mods_0_0= ruleFnMod )
            	    {
            	    // InternalFortXTrans.g:1506:3: (lv_mods_0_0= ruleFnMod )
            	    // InternalFortXTrans.g:1507:4: lv_mods_0_0= ruleFnMod
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
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
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
    // InternalFortXTrans.g:1527:1: entryRuleFnMod returns [EObject current=null] : iv_ruleFnMod= ruleFnMod EOF ;
    public final EObject entryRuleFnMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFnMod = null;


        try {
            // InternalFortXTrans.g:1527:46: (iv_ruleFnMod= ruleFnMod EOF )
            // InternalFortXTrans.g:1528:2: iv_ruleFnMod= ruleFnMod EOF
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
    // InternalFortXTrans.g:1534:1: ruleFnMod returns [EObject current=null] : ( ( (lv_absMod_0_0= ruleAbsFnMod ) ) | ( (lv_pri_1_0= 'private' ) ) ) ;
    public final EObject ruleFnMod() throws RecognitionException {
        EObject current = null;

        Token lv_pri_1_0=null;
        EObject lv_absMod_0_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1540:2: ( ( ( (lv_absMod_0_0= ruleAbsFnMod ) ) | ( (lv_pri_1_0= 'private' ) ) ) )
            // InternalFortXTrans.g:1541:2: ( ( (lv_absMod_0_0= ruleAbsFnMod ) ) | ( (lv_pri_1_0= 'private' ) ) )
            {
            // InternalFortXTrans.g:1541:2: ( ( (lv_absMod_0_0= ruleAbsFnMod ) ) | ( (lv_pri_1_0= 'private' ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=33 && LA30_0<=35)) ) {
                alt30=1;
            }
            else if ( (LA30_0==32) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalFortXTrans.g:1542:3: ( (lv_absMod_0_0= ruleAbsFnMod ) )
                    {
                    // InternalFortXTrans.g:1542:3: ( (lv_absMod_0_0= ruleAbsFnMod ) )
                    // InternalFortXTrans.g:1543:4: (lv_absMod_0_0= ruleAbsFnMod )
                    {
                    // InternalFortXTrans.g:1543:4: (lv_absMod_0_0= ruleAbsFnMod )
                    // InternalFortXTrans.g:1544:5: lv_absMod_0_0= ruleAbsFnMod
                    {

                    					newCompositeNode(grammarAccess.getFnModAccess().getAbsModAbsFnModParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_absMod_0_0=ruleAbsFnMod();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFnModRule());
                    					}
                    					set(
                    						current,
                    						"absMod",
                    						lv_absMod_0_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.AbsFnMod");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1562:3: ( (lv_pri_1_0= 'private' ) )
                    {
                    // InternalFortXTrans.g:1562:3: ( (lv_pri_1_0= 'private' ) )
                    // InternalFortXTrans.g:1563:4: (lv_pri_1_0= 'private' )
                    {
                    // InternalFortXTrans.g:1563:4: (lv_pri_1_0= 'private' )
                    // InternalFortXTrans.g:1564:5: lv_pri_1_0= 'private'
                    {
                    lv_pri_1_0=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_pri_1_0, grammarAccess.getFnModAccess().getPriPrivateKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFnModRule());
                    					}
                    					setWithLastConsumed(current, "pri", lv_pri_1_0, "private");
                    				

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


    // $ANTLR start "entryRuleAbsFnMod"
    // InternalFortXTrans.g:1580:1: entryRuleAbsFnMod returns [EObject current=null] : iv_ruleAbsFnMod= ruleAbsFnMod EOF ;
    public final EObject entryRuleAbsFnMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsFnMod = null;


        try {
            // InternalFortXTrans.g:1580:49: (iv_ruleAbsFnMod= ruleAbsFnMod EOF )
            // InternalFortXTrans.g:1581:2: iv_ruleAbsFnMod= ruleAbsFnMod EOF
            {
             newCompositeNode(grammarAccess.getAbsFnModRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbsFnMod=ruleAbsFnMod();

            state._fsp--;

             current =iv_ruleAbsFnMod; 
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
    // $ANTLR end "entryRuleAbsFnMod"


    // $ANTLR start "ruleAbsFnMod"
    // InternalFortXTrans.g:1587:1: ruleAbsFnMod returns [EObject current=null] : ( ( (lv_local_0_0= ruleLocalFnMod ) ) | ( (lv_test_1_0= 'test' ) ) ) ;
    public final EObject ruleAbsFnMod() throws RecognitionException {
        EObject current = null;

        Token lv_test_1_0=null;
        AntlrDatatypeRuleToken lv_local_0_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1593:2: ( ( ( (lv_local_0_0= ruleLocalFnMod ) ) | ( (lv_test_1_0= 'test' ) ) ) )
            // InternalFortXTrans.g:1594:2: ( ( (lv_local_0_0= ruleLocalFnMod ) ) | ( (lv_test_1_0= 'test' ) ) )
            {
            // InternalFortXTrans.g:1594:2: ( ( (lv_local_0_0= ruleLocalFnMod ) ) | ( (lv_test_1_0= 'test' ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=34 && LA31_0<=35)) ) {
                alt31=1;
            }
            else if ( (LA31_0==33) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalFortXTrans.g:1595:3: ( (lv_local_0_0= ruleLocalFnMod ) )
                    {
                    // InternalFortXTrans.g:1595:3: ( (lv_local_0_0= ruleLocalFnMod ) )
                    // InternalFortXTrans.g:1596:4: (lv_local_0_0= ruleLocalFnMod )
                    {
                    // InternalFortXTrans.g:1596:4: (lv_local_0_0= ruleLocalFnMod )
                    // InternalFortXTrans.g:1597:5: lv_local_0_0= ruleLocalFnMod
                    {

                    					newCompositeNode(grammarAccess.getAbsFnModAccess().getLocalLocalFnModParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_local_0_0=ruleLocalFnMod();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAbsFnModRule());
                    					}
                    					set(
                    						current,
                    						"local",
                    						lv_local_0_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.LocalFnMod");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1615:3: ( (lv_test_1_0= 'test' ) )
                    {
                    // InternalFortXTrans.g:1615:3: ( (lv_test_1_0= 'test' ) )
                    // InternalFortXTrans.g:1616:4: (lv_test_1_0= 'test' )
                    {
                    // InternalFortXTrans.g:1616:4: (lv_test_1_0= 'test' )
                    // InternalFortXTrans.g:1617:5: lv_test_1_0= 'test'
                    {
                    lv_test_1_0=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_test_1_0, grammarAccess.getAbsFnModAccess().getTestTestKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAbsFnModRule());
                    					}
                    					setWithLastConsumed(current, "test", lv_test_1_0, "test");
                    				

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
    // $ANTLR end "ruleAbsFnMod"


    // $ANTLR start "entryRuleLocalFnMod"
    // InternalFortXTrans.g:1633:1: entryRuleLocalFnMod returns [String current=null] : iv_ruleLocalFnMod= ruleLocalFnMod EOF ;
    public final String entryRuleLocalFnMod() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLocalFnMod = null;


        try {
            // InternalFortXTrans.g:1633:50: (iv_ruleLocalFnMod= ruleLocalFnMod EOF )
            // InternalFortXTrans.g:1634:2: iv_ruleLocalFnMod= ruleLocalFnMod EOF
            {
             newCompositeNode(grammarAccess.getLocalFnModRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalFnMod=ruleLocalFnMod();

            state._fsp--;

             current =iv_ruleLocalFnMod.getText(); 
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
    // $ANTLR end "entryRuleLocalFnMod"


    // $ANTLR start "ruleLocalFnMod"
    // InternalFortXTrans.g:1640:1: ruleLocalFnMod returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'atomic' | kw= 'io' ) ;
    public final AntlrDatatypeRuleToken ruleLocalFnMod() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalFortXTrans.g:1646:2: ( (kw= 'atomic' | kw= 'io' ) )
            // InternalFortXTrans.g:1647:2: (kw= 'atomic' | kw= 'io' )
            {
            // InternalFortXTrans.g:1647:2: (kw= 'atomic' | kw= 'io' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
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
                    // InternalFortXTrans.g:1648:3: kw= 'atomic'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLocalFnModAccess().getAtomicKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1654:3: kw= 'io'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLocalFnModAccess().getIoKeyword_1());
                    		

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
    // $ANTLR end "ruleLocalFnMod"


    // $ANTLR start "entryRuleValParam"
    // InternalFortXTrans.g:1663:1: entryRuleValParam returns [EObject current=null] : iv_ruleValParam= ruleValParam EOF ;
    public final EObject entryRuleValParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValParam = null;


        try {
            // InternalFortXTrans.g:1663:49: (iv_ruleValParam= ruleValParam EOF )
            // InternalFortXTrans.g:1664:2: iv_ruleValParam= ruleValParam EOF
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
    // InternalFortXTrans.g:1670:1: ruleValParam returns [EObject current=null] : ( ( (lv_bindID_0_0= ruleBindId ) ) | ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' ) ) ;
    public final EObject ruleValParam() throws RecognitionException {
        EObject current = null;

        Token lv_brack_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_bindID_0_0 = null;

        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1676:2: ( ( ( (lv_bindID_0_0= ruleBindId ) ) | ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' ) ) )
            // InternalFortXTrans.g:1677:2: ( ( (lv_bindID_0_0= ruleBindId ) ) | ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' ) )
            {
            // InternalFortXTrans.g:1677:2: ( ( (lv_bindID_0_0= ruleBindId ) ) | ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID||LA35_0==38) ) {
                alt35=1;
            }
            else if ( (LA35_0==36) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalFortXTrans.g:1678:3: ( (lv_bindID_0_0= ruleBindId ) )
                    {
                    // InternalFortXTrans.g:1678:3: ( (lv_bindID_0_0= ruleBindId ) )
                    // InternalFortXTrans.g:1679:4: (lv_bindID_0_0= ruleBindId )
                    {
                    // InternalFortXTrans.g:1679:4: (lv_bindID_0_0= ruleBindId )
                    // InternalFortXTrans.g:1680:5: lv_bindID_0_0= ruleBindId
                    {

                    					newCompositeNode(grammarAccess.getValParamAccess().getBindIDBindIdParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_bindID_0_0=ruleBindId();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValParamRule());
                    					}
                    					set(
                    						current,
                    						"bindID",
                    						lv_bindID_0_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.BindId");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1698:3: ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' )
                    {
                    // InternalFortXTrans.g:1698:3: ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' )
                    // InternalFortXTrans.g:1699:4: ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')'
                    {
                    // InternalFortXTrans.g:1699:4: ( (lv_brack_1_0= '(' ) )
                    // InternalFortXTrans.g:1700:5: (lv_brack_1_0= '(' )
                    {
                    // InternalFortXTrans.g:1700:5: (lv_brack_1_0= '(' )
                    // InternalFortXTrans.g:1701:6: lv_brack_1_0= '('
                    {
                    lv_brack_1_0=(Token)match(input,36,FOLLOW_26); 

                    						newLeafNode(lv_brack_1_0, grammarAccess.getValParamAccess().getBrackLeftParenthesisKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValParamRule());
                    						}
                    						setWithLastConsumed(current, "brack", lv_brack_1_0, "(");
                    					

                    }


                    }

                    // InternalFortXTrans.g:1713:4: ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_ID||LA34_0==38) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalFortXTrans.g:1714:5: ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )*
                            {
                            // InternalFortXTrans.g:1714:5: ( (lv_params_2_0= ruleParam ) )
                            // InternalFortXTrans.g:1715:6: (lv_params_2_0= ruleParam )
                            {
                            // InternalFortXTrans.g:1715:6: (lv_params_2_0= ruleParam )
                            // InternalFortXTrans.g:1716:7: lv_params_2_0= ruleParam
                            {

                            							newCompositeNode(grammarAccess.getValParamAccess().getParamsParamParserRuleCall_1_1_0_0());
                            						
                            pushFollow(FOLLOW_27);
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

                            // InternalFortXTrans.g:1733:5: (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==25) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // InternalFortXTrans.g:1734:6: otherlv_3= ',' ( (lv_params_4_0= ruleParam ) )
                            	    {
                            	    otherlv_3=(Token)match(input,25,FOLLOW_28); 

                            	    						newLeafNode(otherlv_3, grammarAccess.getValParamAccess().getCommaKeyword_1_1_1_0());
                            	    					
                            	    // InternalFortXTrans.g:1738:6: ( (lv_params_4_0= ruleParam ) )
                            	    // InternalFortXTrans.g:1739:7: (lv_params_4_0= ruleParam )
                            	    {
                            	    // InternalFortXTrans.g:1739:7: (lv_params_4_0= ruleParam )
                            	    // InternalFortXTrans.g:1740:8: lv_params_4_0= ruleParam
                            	    {

                            	    								newCompositeNode(grammarAccess.getValParamAccess().getParamsParamParserRuleCall_1_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_27);
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
                            	    break loop33;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,37,FOLLOW_2); 

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
    // InternalFortXTrans.g:1768:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalFortXTrans.g:1768:46: (iv_ruleParam= ruleParam EOF )
            // InternalFortXTrans.g:1769:2: iv_ruleParam= ruleParam EOF
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
    // InternalFortXTrans.g:1775:1: ruleParam returns [EObject current=null] : ( ( (lv_bId_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_bId_0_0 = null;

        EObject lv_istype_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1781:2: ( ( ( (lv_bId_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) ) ) )
            // InternalFortXTrans.g:1782:2: ( ( (lv_bId_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) ) )
            {
            // InternalFortXTrans.g:1782:2: ( ( (lv_bId_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) ) )
            // InternalFortXTrans.g:1783:3: ( (lv_bId_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) )
            {
            // InternalFortXTrans.g:1783:3: ( (lv_bId_0_0= ruleBindId ) )
            // InternalFortXTrans.g:1784:4: (lv_bId_0_0= ruleBindId )
            {
            // InternalFortXTrans.g:1784:4: (lv_bId_0_0= ruleBindId )
            // InternalFortXTrans.g:1785:5: lv_bId_0_0= ruleBindId
            {

            					newCompositeNode(grammarAccess.getParamAccess().getBIdBindIdParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalFortXTrans.g:1802:3: ( (lv_istype_1_0= ruleIsType ) )
            // InternalFortXTrans.g:1803:4: (lv_istype_1_0= ruleIsType )
            {
            // InternalFortXTrans.g:1803:4: (lv_istype_1_0= ruleIsType )
            // InternalFortXTrans.g:1804:5: lv_istype_1_0= ruleIsType
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


    // $ANTLR start "entryRuleBindId"
    // InternalFortXTrans.g:1825:1: entryRuleBindId returns [String current=null] : iv_ruleBindId= ruleBindId EOF ;
    public final String entryRuleBindId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBindId = null;


        try {
            // InternalFortXTrans.g:1825:46: (iv_ruleBindId= ruleBindId EOF )
            // InternalFortXTrans.g:1826:2: iv_ruleBindId= ruleBindId EOF
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
    // InternalFortXTrans.g:1832:1: ruleBindId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= '_' ) ;
    public final AntlrDatatypeRuleToken ruleBindId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalFortXTrans.g:1838:2: ( (this_ID_0= RULE_ID | kw= '_' ) )
            // InternalFortXTrans.g:1839:2: (this_ID_0= RULE_ID | kw= '_' )
            {
            // InternalFortXTrans.g:1839:2: (this_ID_0= RULE_ID | kw= '_' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            else if ( (LA36_0==38) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalFortXTrans.g:1840:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getBindIdAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1848:3: kw= '_'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

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
    // InternalFortXTrans.g:1857:1: entryRuleIsType returns [EObject current=null] : iv_ruleIsType= ruleIsType EOF ;
    public final EObject entryRuleIsType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsType = null;


        try {
            // InternalFortXTrans.g:1857:47: (iv_ruleIsType= ruleIsType EOF )
            // InternalFortXTrans.g:1858:2: iv_ruleIsType= ruleIsType EOF
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
    // InternalFortXTrans.g:1864:1: ruleIsType returns [EObject current=null] : (otherlv_0= ':' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleIsType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1870:2: ( (otherlv_0= ':' ( (lv_type_1_0= ruleType ) ) ) )
            // InternalFortXTrans.g:1871:2: (otherlv_0= ':' ( (lv_type_1_0= ruleType ) ) )
            {
            // InternalFortXTrans.g:1871:2: (otherlv_0= ':' ( (lv_type_1_0= ruleType ) ) )
            // InternalFortXTrans.g:1872:3: otherlv_0= ':' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getIsTypeAccess().getColonKeyword_0());
            		
            // InternalFortXTrans.g:1876:3: ( (lv_type_1_0= ruleType ) )
            // InternalFortXTrans.g:1877:4: (lv_type_1_0= ruleType )
            {
            // InternalFortXTrans.g:1877:4: (lv_type_1_0= ruleType )
            // InternalFortXTrans.g:1878:5: lv_type_1_0= ruleType
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


    // $ANTLR start "entryRuleRetType"
    // InternalFortXTrans.g:1899:1: entryRuleRetType returns [EObject current=null] : iv_ruleRetType= ruleRetType EOF ;
    public final EObject entryRuleRetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetType = null;


        try {
            // InternalFortXTrans.g:1899:48: (iv_ruleRetType= ruleRetType EOF )
            // InternalFortXTrans.g:1900:2: iv_ruleRetType= ruleRetType EOF
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
    // InternalFortXTrans.g:1906:1: ruleRetType returns [EObject current=null] : ( (otherlv_0= '(' otherlv_1= ')' () ) | ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleRetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1912:2: ( ( (otherlv_0= '(' otherlv_1= ')' () ) | ( (lv_type_3_0= ruleType ) ) ) )
            // InternalFortXTrans.g:1913:2: ( (otherlv_0= '(' otherlv_1= ')' () ) | ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalFortXTrans.g:1913:2: ( (otherlv_0= '(' otherlv_1= ')' () ) | ( (lv_type_3_0= ruleType ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==36) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_ID) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalFortXTrans.g:1914:3: (otherlv_0= '(' otherlv_1= ')' () )
                    {
                    // InternalFortXTrans.g:1914:3: (otherlv_0= '(' otherlv_1= ')' () )
                    // InternalFortXTrans.g:1915:4: otherlv_0= '(' otherlv_1= ')' ()
                    {
                    otherlv_0=(Token)match(input,36,FOLLOW_29); 

                    				newLeafNode(otherlv_0, grammarAccess.getRetTypeAccess().getLeftParenthesisKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getRetTypeAccess().getRightParenthesisKeyword_0_1());
                    			
                    // InternalFortXTrans.g:1923:4: ()
                    // InternalFortXTrans.g:1924:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRetTypeAccess().getRetTypeAction_0_2(),
                    						current);
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:1932:3: ( (lv_type_3_0= ruleType ) )
                    {
                    // InternalFortXTrans.g:1932:3: ( (lv_type_3_0= ruleType ) )
                    // InternalFortXTrans.g:1933:4: (lv_type_3_0= ruleType )
                    {
                    // InternalFortXTrans.g:1933:4: (lv_type_3_0= ruleType )
                    // InternalFortXTrans.g:1934:5: lv_type_3_0= ruleType
                    {

                    					newCompositeNode(grammarAccess.getRetTypeAccess().getTypeTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_3_0=ruleType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRetTypeRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_3_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.Type");
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
    // $ANTLR end "ruleRetType"


    // $ANTLR start "entryRuleType"
    // InternalFortXTrans.g:1955:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalFortXTrans.g:1955:45: (iv_ruleType= ruleType EOF )
            // InternalFortXTrans.g:1956:2: iv_ruleType= ruleType EOF
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
    // InternalFortXTrans.g:1962:1: ruleType returns [EObject current=null] : ( (lv_tname_0_0= RULE_ID ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_tname_0_0=null;


        	enterRule();

        try {
            // InternalFortXTrans.g:1968:2: ( ( (lv_tname_0_0= RULE_ID ) ) )
            // InternalFortXTrans.g:1969:2: ( (lv_tname_0_0= RULE_ID ) )
            {
            // InternalFortXTrans.g:1969:2: ( (lv_tname_0_0= RULE_ID ) )
            // InternalFortXTrans.g:1970:3: (lv_tname_0_0= RULE_ID )
            {
            // InternalFortXTrans.g:1970:3: (lv_tname_0_0= RULE_ID )
            // InternalFortXTrans.g:1971:4: lv_tname_0_0= RULE_ID
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


    // $ANTLR start "entryRuleExpression"
    // InternalFortXTrans.g:1990:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalFortXTrans.g:1990:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalFortXTrans.g:1991:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalFortXTrans.g:1997:1: ruleExpression returns [EObject current=null] : ( (lv_exp_0_0= ruleExpr ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_exp_0_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2003:2: ( ( (lv_exp_0_0= ruleExpr ) ) )
            // InternalFortXTrans.g:2004:2: ( (lv_exp_0_0= ruleExpr ) )
            {
            // InternalFortXTrans.g:2004:2: ( (lv_exp_0_0= ruleExpr ) )
            // InternalFortXTrans.g:2005:3: (lv_exp_0_0= ruleExpr )
            {
            // InternalFortXTrans.g:2005:3: (lv_exp_0_0= ruleExpr )
            // InternalFortXTrans.g:2006:4: lv_exp_0_0= ruleExpr
            {

            				newCompositeNode(grammarAccess.getExpressionAccess().getExpExprParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_exp_0_0=ruleExpr();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getExpressionRule());
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpr"
    // InternalFortXTrans.g:2026:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalFortXTrans.g:2026:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalFortXTrans.g:2027:2: iv_ruleExpr= ruleExpr EOF
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
    // InternalFortXTrans.g:2033:1: ruleExpr returns [EObject current=null] : (this_ExprFront_0= ruleExprFront () ( (lv_tails_2_0= ruleExprTail ) )* ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_ExprFront_0 = null;

        EObject lv_tails_2_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2039:2: ( (this_ExprFront_0= ruleExprFront () ( (lv_tails_2_0= ruleExprTail ) )* ) )
            // InternalFortXTrans.g:2040:2: (this_ExprFront_0= ruleExprFront () ( (lv_tails_2_0= ruleExprTail ) )* )
            {
            // InternalFortXTrans.g:2040:2: (this_ExprFront_0= ruleExprFront () ( (lv_tails_2_0= ruleExprTail ) )* )
            // InternalFortXTrans.g:2041:3: this_ExprFront_0= ruleExprFront () ( (lv_tails_2_0= ruleExprTail ) )*
            {

            			newCompositeNode(grammarAccess.getExprAccess().getExprFrontParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_ExprFront_0=ruleExprFront();

            state._fsp--;


            			current = this_ExprFront_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFortXTrans.g:2049:3: ()
            // InternalFortXTrans.g:2050:4: 
            {

            				current = forceCreateModelElementAndSet(
            					grammarAccess.getExprAccess().getExprFrontAction_1(),
            					current);
            			

            }

            // InternalFortXTrans.g:2056:3: ( (lv_tails_2_0= ruleExprTail ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==29) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalFortXTrans.g:2057:4: (lv_tails_2_0= ruleExprTail )
            	    {
            	    // InternalFortXTrans.g:2057:4: (lv_tails_2_0= ruleExprTail )
            	    // InternalFortXTrans.g:2058:5: lv_tails_2_0= ruleExprTail
            	    {

            	    					newCompositeNode(grammarAccess.getExprAccess().getTailsExprTailParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_tails_2_0=ruleExprTail();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExprRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tails",
            	    						lv_tails_2_0,
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


    // $ANTLR start "entryRuleExprFront"
    // InternalFortXTrans.g:2079:1: entryRuleExprFront returns [EObject current=null] : iv_ruleExprFront= ruleExprFront EOF ;
    public final EObject entryRuleExprFront() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprFront = null;


        try {
            // InternalFortXTrans.g:2079:50: (iv_ruleExprFront= ruleExprFront EOF )
            // InternalFortXTrans.g:2080:2: iv_ruleExprFront= ruleExprFront EOF
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
    // InternalFortXTrans.g:2086:1: ruleExprFront returns [EObject current=null] : ( (this_DelimitedExpr_0= ruleDelimitedExpr () ) | ( (lv_id_2_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleExprFront() throws RecognitionException {
        EObject current = null;

        EObject this_DelimitedExpr_0 = null;

        AntlrDatatypeRuleToken lv_id_2_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2092:2: ( ( (this_DelimitedExpr_0= ruleDelimitedExpr () ) | ( (lv_id_2_0= ruleQualifiedName ) ) ) )
            // InternalFortXTrans.g:2093:2: ( (this_DelimitedExpr_0= ruleDelimitedExpr () ) | ( (lv_id_2_0= ruleQualifiedName ) ) )
            {
            // InternalFortXTrans.g:2093:2: ( (this_DelimitedExpr_0= ruleDelimitedExpr () ) | ( (lv_id_2_0= ruleQualifiedName ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==34||LA39_0==36||LA39_0==40) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_ID) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalFortXTrans.g:2094:3: (this_DelimitedExpr_0= ruleDelimitedExpr () )
                    {
                    // InternalFortXTrans.g:2094:3: (this_DelimitedExpr_0= ruleDelimitedExpr () )
                    // InternalFortXTrans.g:2095:4: this_DelimitedExpr_0= ruleDelimitedExpr ()
                    {

                    				newCompositeNode(grammarAccess.getExprFrontAccess().getDelimitedExprParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_DelimitedExpr_0=ruleDelimitedExpr();

                    state._fsp--;


                    				current = this_DelimitedExpr_0;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalFortXTrans.g:2103:4: ()
                    // InternalFortXTrans.g:2104:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getExprFrontAccess().getExprFrontDelimAction_0_1(),
                    						current);
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:2112:3: ( (lv_id_2_0= ruleQualifiedName ) )
                    {
                    // InternalFortXTrans.g:2112:3: ( (lv_id_2_0= ruleQualifiedName ) )
                    // InternalFortXTrans.g:2113:4: (lv_id_2_0= ruleQualifiedName )
                    {
                    // InternalFortXTrans.g:2113:4: (lv_id_2_0= ruleQualifiedName )
                    // InternalFortXTrans.g:2114:5: lv_id_2_0= ruleQualifiedName
                    {

                    					newCompositeNode(grammarAccess.getExprFrontAccess().getIdQualifiedNameParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_id_2_0=ruleQualifiedName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExprFrontRule());
                    					}
                    					set(
                    						current,
                    						"id",
                    						lv_id_2_0,
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
    // InternalFortXTrans.g:2135:1: entryRuleExprTail returns [EObject current=null] : iv_ruleExprTail= ruleExprTail EOF ;
    public final EObject entryRuleExprTail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprTail = null;


        try {
            // InternalFortXTrans.g:2135:49: (iv_ruleExprTail= ruleExprTail EOF )
            // InternalFortXTrans.g:2136:2: iv_ruleExprTail= ruleExprTail EOF
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
    // InternalFortXTrans.g:2142:1: ruleExprTail returns [EObject current=null] : (otherlv_0= 'as' this_Type_1= ruleType ) ;
    public final EObject ruleExprTail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Type_1 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2148:2: ( (otherlv_0= 'as' this_Type_1= ruleType ) )
            // InternalFortXTrans.g:2149:2: (otherlv_0= 'as' this_Type_1= ruleType )
            {
            // InternalFortXTrans.g:2149:2: (otherlv_0= 'as' this_Type_1= ruleType )
            // InternalFortXTrans.g:2150:3: otherlv_0= 'as' this_Type_1= ruleType
            {
            otherlv_0=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getExprTailAccess().getAsKeyword_0());
            		

            			newCompositeNode(grammarAccess.getExprTailAccess().getTypeParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Type_1=ruleType();

            state._fsp--;


            			current = this_Type_1;
            			afterParserOrEnumRuleCall();
            		

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
    // InternalFortXTrans.g:2166:1: entryRuleDelimitedExpr returns [EObject current=null] : iv_ruleDelimitedExpr= ruleDelimitedExpr EOF ;
    public final EObject entryRuleDelimitedExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelimitedExpr = null;


        try {
            // InternalFortXTrans.g:2166:54: (iv_ruleDelimitedExpr= ruleDelimitedExpr EOF )
            // InternalFortXTrans.g:2167:2: iv_ruleDelimitedExpr= ruleDelimitedExpr EOF
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
    // InternalFortXTrans.g:2173:1: ruleDelimitedExpr returns [EObject current=null] : (this_Do_0= ruleDo | (this_Paranthesized_1= ruleParanthesized () ) ) ;
    public final EObject ruleDelimitedExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Do_0 = null;

        EObject this_Paranthesized_1 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2179:2: ( (this_Do_0= ruleDo | (this_Paranthesized_1= ruleParanthesized () ) ) )
            // InternalFortXTrans.g:2180:2: (this_Do_0= ruleDo | (this_Paranthesized_1= ruleParanthesized () ) )
            {
            // InternalFortXTrans.g:2180:2: (this_Do_0= ruleDo | (this_Paranthesized_1= ruleParanthesized () ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==34||LA40_0==40) ) {
                alt40=1;
            }
            else if ( (LA40_0==36) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalFortXTrans.g:2181:3: this_Do_0= ruleDo
                    {

                    			newCompositeNode(grammarAccess.getDelimitedExprAccess().getDoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Do_0=ruleDo();

                    state._fsp--;


                    			current = this_Do_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:2190:3: (this_Paranthesized_1= ruleParanthesized () )
                    {
                    // InternalFortXTrans.g:2190:3: (this_Paranthesized_1= ruleParanthesized () )
                    // InternalFortXTrans.g:2191:4: this_Paranthesized_1= ruleParanthesized ()
                    {

                    				newCompositeNode(grammarAccess.getDelimitedExprAccess().getParanthesizedParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_Paranthesized_1=ruleParanthesized();

                    state._fsp--;


                    				current = this_Paranthesized_1;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalFortXTrans.g:2199:4: ()
                    // InternalFortXTrans.g:2200:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getDelimitedExprAccess().getDelimitedParAction_1_1(),
                    						current);
                    				

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
    // $ANTLR end "ruleDelimitedExpr"


    // $ANTLR start "entryRuleParanthesized"
    // InternalFortXTrans.g:2211:1: entryRuleParanthesized returns [EObject current=null] : iv_ruleParanthesized= ruleParanthesized EOF ;
    public final EObject entryRuleParanthesized() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParanthesized = null;


        try {
            // InternalFortXTrans.g:2211:54: (iv_ruleParanthesized= ruleParanthesized EOF )
            // InternalFortXTrans.g:2212:2: iv_ruleParanthesized= ruleParanthesized EOF
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
    // InternalFortXTrans.g:2218:1: ruleParanthesized returns [EObject current=null] : (otherlv_0= '(' this_Expr_1= ruleExpr () otherlv_3= ')' ) ;
    public final EObject ruleParanthesized() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_Expr_1 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2224:2: ( (otherlv_0= '(' this_Expr_1= ruleExpr () otherlv_3= ')' ) )
            // InternalFortXTrans.g:2225:2: (otherlv_0= '(' this_Expr_1= ruleExpr () otherlv_3= ')' )
            {
            // InternalFortXTrans.g:2225:2: (otherlv_0= '(' this_Expr_1= ruleExpr () otherlv_3= ')' )
            // InternalFortXTrans.g:2226:3: otherlv_0= '(' this_Expr_1= ruleExpr () otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getParanthesizedAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParanthesizedAccess().getExprParserRuleCall_1());
            		
            pushFollow(FOLLOW_29);
            this_Expr_1=ruleExpr();

            state._fsp--;


            			current = this_Expr_1;
            			afterParserOrEnumRuleCall();
            		
            // InternalFortXTrans.g:2238:3: ()
            // InternalFortXTrans.g:2239:4: 
            {

            				current = forceCreateModelElementAndSet(
            					grammarAccess.getParanthesizedAccess().getParanthesizedExprAction_2(),
            					current);
            			

            }

            otherlv_3=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParanthesizedAccess().getRightParenthesisKeyword_3());
            		

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
    // InternalFortXTrans.g:2253:1: entryRuleDo returns [EObject current=null] : iv_ruleDo= ruleDo EOF ;
    public final EObject entryRuleDo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDo = null;


        try {
            // InternalFortXTrans.g:2253:43: (iv_ruleDo= ruleDo EOF )
            // InternalFortXTrans.g:2254:2: iv_ruleDo= ruleDo EOF
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
    // InternalFortXTrans.g:2260:1: ruleDo returns [EObject current=null] : (this_DoFront_0= ruleDoFront () (otherlv_2= 'also' ( (lv_dofs_3_0= ruleDoFront ) ) )* otherlv_4= 'end' ) ;
    public final EObject ruleDo() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_DoFront_0 = null;

        EObject lv_dofs_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2266:2: ( (this_DoFront_0= ruleDoFront () (otherlv_2= 'also' ( (lv_dofs_3_0= ruleDoFront ) ) )* otherlv_4= 'end' ) )
            // InternalFortXTrans.g:2267:2: (this_DoFront_0= ruleDoFront () (otherlv_2= 'also' ( (lv_dofs_3_0= ruleDoFront ) ) )* otherlv_4= 'end' )
            {
            // InternalFortXTrans.g:2267:2: (this_DoFront_0= ruleDoFront () (otherlv_2= 'also' ( (lv_dofs_3_0= ruleDoFront ) ) )* otherlv_4= 'end' )
            // InternalFortXTrans.g:2268:3: this_DoFront_0= ruleDoFront () (otherlv_2= 'also' ( (lv_dofs_3_0= ruleDoFront ) ) )* otherlv_4= 'end'
            {

            			newCompositeNode(grammarAccess.getDoAccess().getDoFrontParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_DoFront_0=ruleDoFront();

            state._fsp--;


            			current = this_DoFront_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFortXTrans.g:2276:3: ()
            // InternalFortXTrans.g:2277:4: 
            {

            				current = forceCreateModelElementAndAdd(
            					grammarAccess.getDoAccess().getDoDofsAction_1(),
            					current);
            			

            }

            // InternalFortXTrans.g:2283:3: (otherlv_2= 'also' ( (lv_dofs_3_0= ruleDoFront ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==39) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalFortXTrans.g:2284:4: otherlv_2= 'also' ( (lv_dofs_3_0= ruleDoFront ) )
            	    {
            	    otherlv_2=(Token)match(input,39,FOLLOW_31); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDoAccess().getAlsoKeyword_2_0());
            	    			
            	    // InternalFortXTrans.g:2288:4: ( (lv_dofs_3_0= ruleDoFront ) )
            	    // InternalFortXTrans.g:2289:5: (lv_dofs_3_0= ruleDoFront )
            	    {
            	    // InternalFortXTrans.g:2289:5: (lv_dofs_3_0= ruleDoFront )
            	    // InternalFortXTrans.g:2290:6: lv_dofs_3_0= ruleDoFront
            	    {

            	    						newCompositeNode(grammarAccess.getDoAccess().getDofsDoFrontParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_dofs_3_0=ruleDoFront();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dofs",
            	    							lv_dofs_3_0,
            	    							"srf.transpiler.fortxtrans.FortXTrans.DoFront");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDoAccess().getEndKeyword_3());
            		

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
    // InternalFortXTrans.g:2316:1: entryRuleDoFront returns [EObject current=null] : iv_ruleDoFront= ruleDoFront EOF ;
    public final EObject entryRuleDoFront() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoFront = null;


        try {
            // InternalFortXTrans.g:2316:48: (iv_ruleDoFront= ruleDoFront EOF )
            // InternalFortXTrans.g:2317:2: iv_ruleDoFront= ruleDoFront EOF
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
    // InternalFortXTrans.g:2323:1: ruleDoFront returns [EObject current=null] : ( ( (lv_atom_0_0= 'atomic' ) )? otherlv_1= 'do' ( (lv_block_2_0= ruleBlockElem ) ) ) ;
    public final EObject ruleDoFront() throws RecognitionException {
        EObject current = null;

        Token lv_atom_0_0=null;
        Token otherlv_1=null;
        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2329:2: ( ( ( (lv_atom_0_0= 'atomic' ) )? otherlv_1= 'do' ( (lv_block_2_0= ruleBlockElem ) ) ) )
            // InternalFortXTrans.g:2330:2: ( ( (lv_atom_0_0= 'atomic' ) )? otherlv_1= 'do' ( (lv_block_2_0= ruleBlockElem ) ) )
            {
            // InternalFortXTrans.g:2330:2: ( ( (lv_atom_0_0= 'atomic' ) )? otherlv_1= 'do' ( (lv_block_2_0= ruleBlockElem ) ) )
            // InternalFortXTrans.g:2331:3: ( (lv_atom_0_0= 'atomic' ) )? otherlv_1= 'do' ( (lv_block_2_0= ruleBlockElem ) )
            {
            // InternalFortXTrans.g:2331:3: ( (lv_atom_0_0= 'atomic' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==34) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalFortXTrans.g:2332:4: (lv_atom_0_0= 'atomic' )
                    {
                    // InternalFortXTrans.g:2332:4: (lv_atom_0_0= 'atomic' )
                    // InternalFortXTrans.g:2333:5: lv_atom_0_0= 'atomic'
                    {
                    lv_atom_0_0=(Token)match(input,34,FOLLOW_32); 

                    					newLeafNode(lv_atom_0_0, grammarAccess.getDoFrontAccess().getAtomAtomicKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDoFrontRule());
                    					}
                    					setWithLastConsumed(current, "atom", lv_atom_0_0, "atomic");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,40,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getDoFrontAccess().getDoKeyword_1());
            		
            // InternalFortXTrans.g:2349:3: ( (lv_block_2_0= ruleBlockElem ) )
            // InternalFortXTrans.g:2350:4: (lv_block_2_0= ruleBlockElem )
            {
            // InternalFortXTrans.g:2350:4: (lv_block_2_0= ruleBlockElem )
            // InternalFortXTrans.g:2351:5: lv_block_2_0= ruleBlockElem
            {

            					newCompositeNode(grammarAccess.getDoFrontAccess().getBlockBlockElemParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_2_0=ruleBlockElem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoFrontRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_2_0,
            						"srf.transpiler.fortxtrans.FortXTrans.BlockElem");
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


    // $ANTLR start "entryRuleBlockElem"
    // InternalFortXTrans.g:2372:1: entryRuleBlockElem returns [EObject current=null] : iv_ruleBlockElem= ruleBlockElem EOF ;
    public final EObject entryRuleBlockElem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockElem = null;


        try {
            // InternalFortXTrans.g:2372:50: (iv_ruleBlockElem= ruleBlockElem EOF )
            // InternalFortXTrans.g:2373:2: iv_ruleBlockElem= ruleBlockElem EOF
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
    // InternalFortXTrans.g:2379:1: ruleBlockElem returns [EObject current=null] : (this_Expr_0= ruleExpr () ) ;
    public final EObject ruleBlockElem() throws RecognitionException {
        EObject current = null;

        EObject this_Expr_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2385:2: ( (this_Expr_0= ruleExpr () ) )
            // InternalFortXTrans.g:2386:2: (this_Expr_0= ruleExpr () )
            {
            // InternalFortXTrans.g:2386:2: (this_Expr_0= ruleExpr () )
            // InternalFortXTrans.g:2387:3: this_Expr_0= ruleExpr ()
            {

            			newCompositeNode(grammarAccess.getBlockElemAccess().getExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_2);
            this_Expr_0=ruleExpr();

            state._fsp--;


            			current = this_Expr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFortXTrans.g:2395:3: ()
            // InternalFortXTrans.g:2396:4: 
            {

            				current = forceCreateModelElementAndSet(
            					grammarAccess.getBlockElemAccess().getBlockELemExprAction_1(),
            					current);
            			

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

    // Delegated rules


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\uffff\1\3\2\uffff\1\3\1\uffff\1\3\3\uffff\1\3";
    static final String dfa_3s = "\1\4\1\5\1\4\1\uffff\1\24\1\4\1\5\1\30\2\uffff\1\24";
    static final String dfa_4s = "\1\4\1\35\1\30\1\uffff\1\35\1\5\1\35\1\30\2\uffff\1\35";
    static final String dfa_5s = "\3\uffff\1\3\4\uffff\1\2\1\1\1\uffff";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\4\16\uffff\1\3\1\uffff\2\3\3\uffff\1\2\1\uffff\1\3",
            "\1\6\23\uffff\1\5",
            "",
            "\1\3\1\uffff\2\3\3\uffff\1\7\1\uffff\1\3",
            "\1\10\1\11",
            "\1\12\16\uffff\1\3\1\uffff\2\3\3\uffff\1\2\1\uffff\1\3",
            "\1\5",
            "",
            "",
            "\1\3\1\uffff\2\3\3\uffff\1\7\1\uffff\1\3"
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
    static final String dfa_9s = "\1\uffff\1\4\3\uffff\1\4\1\uffff";
    static final String dfa_10s = "\2\4\1\uffff\1\4\1\uffff\1\4\1\uffff";
    static final String dfa_11s = "\1\4\1\47\1\uffff\1\4\1\uffff\1\47\1\uffff";
    static final String dfa_12s = "\2\uffff\1\1\1\uffff\1\3\1\uffff\1\2";
    static final String dfa_13s = "\7\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\4\1\2\16\uffff\1\4\6\uffff\1\3\1\uffff\1\4\2\uffff\4\4\1\uffff\1\4\1\uffff\1\4",
            "",
            "\1\5",
            "",
            "\1\4\1\6\16\uffff\1\4\6\uffff\1\3\1\uffff\1\4\2\uffff\4\4\1\uffff\1\4\1\uffff\1\4",
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
    static final String dfa_15s = "\1\uffff\1\3\3\uffff\1\3\1\uffff";
    static final String dfa_16s = "\3\4\2\uffff\1\4\1\uffff";
    static final String dfa_17s = "\1\4\1\43\1\30\2\uffff\1\43\1\uffff";
    static final String dfa_18s = "\3\uffff\1\3\1\1\1\uffff\1\2";
    static final String[] dfa_19s = {
            "\1\1",
            "\1\3\1\4\16\uffff\1\3\1\uffff\2\3\1\uffff\2\3\1\2\1\uffff\1\3\2\uffff\4\3",
            "\1\5\23\uffff\1\3",
            "",
            "",
            "\1\3\1\6\16\uffff\1\3\1\uffff\2\3\1\uffff\2\3\1\2\1\uffff\1\3\2\uffff\4\3",
            ""
    };
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_8;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_13;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "856:2: ( (this_ID_0= RULE_ID this_DOTS_1= RULE_DOTS ) | (this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )* this_DOTS_5= RULE_DOTS ) | (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000F00D00010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000F00100010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000F00000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000005000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000011400000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000006000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});

}