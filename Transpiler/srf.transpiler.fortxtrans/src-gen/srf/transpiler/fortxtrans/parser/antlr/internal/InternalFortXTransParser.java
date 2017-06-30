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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOTS", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'component'", "'end'", "'api'", "'import'", "'export'", "'{'", "','", "'}'", "'.'", "'except'", "'as'", "'('", "')'", "'private'", "'test'", "'atomic'", "'io'", "':'", "'='", "'+'", "'-'", "'/'", "'*'", "':='", "'return'", "'while'", "'for'", "'if'", "'then'", "'elif'", "'else'", "'<-'", "'seq'", "'also'", "'at'", "'do'", "'_'", "'var'"
    };
    public static final int T__50=50;
    public static final int RULE_DOTS=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
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

                if ( (LA4_0==RULE_ID||LA4_0==24||(LA4_0>=26 && LA4_0<=29)||(LA4_0>=49 && LA4_0<=50)) ) {
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
    // InternalFortXTrans.g:759:1: ruleQualifiedName returns [EObject current=null] : ( ( ( (lv_s_0_0= ruleSimpleName ) ) ( (lv_dots_1_0= RULE_DOTS ) )? ) | ( ( (lv_s_2_0= ruleSimpleName ) ) (otherlv_3= '.' ( (lv_s_4_0= ruleSimpleName ) ) )+ ( (lv_dots_5_0= RULE_DOTS ) )? ) ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token lv_dots_1_0=null;
        Token otherlv_3=null;
        Token lv_dots_5_0=null;
        EObject lv_s_0_0 = null;

        EObject lv_s_2_0 = null;

        EObject lv_s_4_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:765:2: ( ( ( ( (lv_s_0_0= ruleSimpleName ) ) ( (lv_dots_1_0= RULE_DOTS ) )? ) | ( ( (lv_s_2_0= ruleSimpleName ) ) (otherlv_3= '.' ( (lv_s_4_0= ruleSimpleName ) ) )+ ( (lv_dots_5_0= RULE_DOTS ) )? ) ) )
            // InternalFortXTrans.g:766:2: ( ( ( (lv_s_0_0= ruleSimpleName ) ) ( (lv_dots_1_0= RULE_DOTS ) )? ) | ( ( (lv_s_2_0= ruleSimpleName ) ) (otherlv_3= '.' ( (lv_s_4_0= ruleSimpleName ) ) )+ ( (lv_dots_5_0= RULE_DOTS ) )? ) )
            {
            // InternalFortXTrans.g:766:2: ( ( ( (lv_s_0_0= ruleSimpleName ) ) ( (lv_dots_1_0= RULE_DOTS ) )? ) | ( ( (lv_s_2_0= ruleSimpleName ) ) (otherlv_3= '.' ( (lv_s_4_0= ruleSimpleName ) ) )+ ( (lv_dots_5_0= RULE_DOTS ) )? ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==EOF||(LA17_1>=RULE_ID && LA17_1<=RULE_STRING)||LA17_1==14||(LA17_1>=16 && LA17_1<=17)||(LA17_1>=19 && LA17_1<=20)||(LA17_1>=23 && LA17_1<=29)||(LA17_1>=32 && LA17_1<=43)||(LA17_1>=46 && LA17_1<=50)) ) {
                    alt17=1;
                }
                else if ( (LA17_1==21) ) {
                    int LA17_3 = input.LA(3);

                    if ( (LA17_3==RULE_ID) ) {
                        alt17=2;
                    }
                    else if ( (LA17_3==18) ) {
                        alt17=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalFortXTrans.g:767:3: ( ( (lv_s_0_0= ruleSimpleName ) ) ( (lv_dots_1_0= RULE_DOTS ) )? )
                    {
                    // InternalFortXTrans.g:767:3: ( ( (lv_s_0_0= ruleSimpleName ) ) ( (lv_dots_1_0= RULE_DOTS ) )? )
                    // InternalFortXTrans.g:768:4: ( (lv_s_0_0= ruleSimpleName ) ) ( (lv_dots_1_0= RULE_DOTS ) )?
                    {
                    // InternalFortXTrans.g:768:4: ( (lv_s_0_0= ruleSimpleName ) )
                    // InternalFortXTrans.g:769:5: (lv_s_0_0= ruleSimpleName )
                    {
                    // InternalFortXTrans.g:769:5: (lv_s_0_0= ruleSimpleName )
                    // InternalFortXTrans.g:770:6: lv_s_0_0= ruleSimpleName
                    {

                    						newCompositeNode(grammarAccess.getQualifiedNameAccess().getSSimpleNameParserRuleCall_0_0_0());
                    					
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

                    // InternalFortXTrans.g:787:4: ( (lv_dots_1_0= RULE_DOTS ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_DOTS) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalFortXTrans.g:788:5: (lv_dots_1_0= RULE_DOTS )
                            {
                            // InternalFortXTrans.g:788:5: (lv_dots_1_0= RULE_DOTS )
                            // InternalFortXTrans.g:789:6: lv_dots_1_0= RULE_DOTS
                            {
                            lv_dots_1_0=(Token)match(input,RULE_DOTS,FOLLOW_2); 

                            						newLeafNode(lv_dots_1_0, grammarAccess.getQualifiedNameAccess().getDotsDOTSTerminalRuleCall_0_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getQualifiedNameRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"dots",
                            							lv_dots_1_0,
                            							"srf.transpiler.fortxtrans.FortXTrans.DOTS");
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:807:3: ( ( (lv_s_2_0= ruleSimpleName ) ) (otherlv_3= '.' ( (lv_s_4_0= ruleSimpleName ) ) )+ ( (lv_dots_5_0= RULE_DOTS ) )? )
                    {
                    // InternalFortXTrans.g:807:3: ( ( (lv_s_2_0= ruleSimpleName ) ) (otherlv_3= '.' ( (lv_s_4_0= ruleSimpleName ) ) )+ ( (lv_dots_5_0= RULE_DOTS ) )? )
                    // InternalFortXTrans.g:808:4: ( (lv_s_2_0= ruleSimpleName ) ) (otherlv_3= '.' ( (lv_s_4_0= ruleSimpleName ) ) )+ ( (lv_dots_5_0= RULE_DOTS ) )?
                    {
                    // InternalFortXTrans.g:808:4: ( (lv_s_2_0= ruleSimpleName ) )
                    // InternalFortXTrans.g:809:5: (lv_s_2_0= ruleSimpleName )
                    {
                    // InternalFortXTrans.g:809:5: (lv_s_2_0= ruleSimpleName )
                    // InternalFortXTrans.g:810:6: lv_s_2_0= ruleSimpleName
                    {

                    						newCompositeNode(grammarAccess.getQualifiedNameAccess().getSSimpleNameParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_12);
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

                    // InternalFortXTrans.g:827:4: (otherlv_3= '.' ( (lv_s_4_0= ruleSimpleName ) ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==21) ) {
                            int LA15_2 = input.LA(2);

                            if ( (LA15_2==RULE_ID) ) {
                                alt15=1;
                            }


                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalFortXTrans.g:828:5: otherlv_3= '.' ( (lv_s_4_0= ruleSimpleName ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_1_0());
                    	    				
                    	    // InternalFortXTrans.g:832:5: ( (lv_s_4_0= ruleSimpleName ) )
                    	    // InternalFortXTrans.g:833:6: (lv_s_4_0= ruleSimpleName )
                    	    {
                    	    // InternalFortXTrans.g:833:6: (lv_s_4_0= ruleSimpleName )
                    	    // InternalFortXTrans.g:834:7: lv_s_4_0= ruleSimpleName
                    	    {

                    	    							newCompositeNode(grammarAccess.getQualifiedNameAccess().getSSimpleNameParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_s_4_0=ruleSimpleName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getQualifiedNameRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"s",
                    	    								lv_s_4_0,
                    	    								"srf.transpiler.fortxtrans.FortXTrans.SimpleName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    // InternalFortXTrans.g:852:4: ( (lv_dots_5_0= RULE_DOTS ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_DOTS) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalFortXTrans.g:853:5: (lv_dots_5_0= RULE_DOTS )
                            {
                            // InternalFortXTrans.g:853:5: (lv_dots_5_0= RULE_DOTS )
                            // InternalFortXTrans.g:854:6: lv_dots_5_0= RULE_DOTS
                            {
                            lv_dots_5_0=(Token)match(input,RULE_DOTS,FOLLOW_2); 

                            						newLeafNode(lv_dots_5_0, grammarAccess.getQualifiedNameAccess().getDotsDOTSTerminalRuleCall_1_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getQualifiedNameRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"dots",
                            							lv_dots_5_0,
                            							"srf.transpiler.fortxtrans.FortXTrans.DOTS");
                            					

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualified"
    // InternalFortXTrans.g:875:1: entryRuleQualified returns [EObject current=null] : iv_ruleQualified= ruleQualified EOF ;
    public final EObject entryRuleQualified() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualified = null;


        try {
            // InternalFortXTrans.g:875:50: (iv_ruleQualified= ruleQualified EOF )
            // InternalFortXTrans.g:876:2: iv_ruleQualified= ruleQualified EOF
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
    // InternalFortXTrans.g:882:1: ruleQualified returns [EObject current=null] : ( ( (lv_q_0_0= ruleQualifiedName ) ) | ( (lv_qlist_1_0= ruleQualifiedNameTuple ) ) ) ;
    public final EObject ruleQualified() throws RecognitionException {
        EObject current = null;

        EObject lv_q_0_0 = null;

        EObject lv_qlist_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:888:2: ( ( ( (lv_q_0_0= ruleQualifiedName ) ) | ( (lv_qlist_1_0= ruleQualifiedNameTuple ) ) ) )
            // InternalFortXTrans.g:889:2: ( ( (lv_q_0_0= ruleQualifiedName ) ) | ( (lv_qlist_1_0= ruleQualifiedNameTuple ) ) )
            {
            // InternalFortXTrans.g:889:2: ( ( (lv_q_0_0= ruleQualifiedName ) ) | ( (lv_qlist_1_0= ruleQualifiedNameTuple ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==24) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalFortXTrans.g:890:3: ( (lv_q_0_0= ruleQualifiedName ) )
                    {
                    // InternalFortXTrans.g:890:3: ( (lv_q_0_0= ruleQualifiedName ) )
                    // InternalFortXTrans.g:891:4: (lv_q_0_0= ruleQualifiedName )
                    {
                    // InternalFortXTrans.g:891:4: (lv_q_0_0= ruleQualifiedName )
                    // InternalFortXTrans.g:892:5: lv_q_0_0= ruleQualifiedName
                    {

                    					newCompositeNode(grammarAccess.getQualifiedAccess().getQQualifiedNameParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_q_0_0=ruleQualifiedName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQualifiedRule());
                    					}
                    					set(
                    						current,
                    						"q",
                    						lv_q_0_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.QualifiedName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:910:3: ( (lv_qlist_1_0= ruleQualifiedNameTuple ) )
                    {
                    // InternalFortXTrans.g:910:3: ( (lv_qlist_1_0= ruleQualifiedNameTuple ) )
                    // InternalFortXTrans.g:911:4: (lv_qlist_1_0= ruleQualifiedNameTuple )
                    {
                    // InternalFortXTrans.g:911:4: (lv_qlist_1_0= ruleQualifiedNameTuple )
                    // InternalFortXTrans.g:912:5: lv_qlist_1_0= ruleQualifiedNameTuple
                    {

                    					newCompositeNode(grammarAccess.getQualifiedAccess().getQlistQualifiedNameTupleParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_qlist_1_0=ruleQualifiedNameTuple();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQualifiedRule());
                    					}
                    					set(
                    						current,
                    						"qlist",
                    						lv_qlist_1_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.QualifiedNameTuple");
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
    // $ANTLR end "ruleQualified"


    // $ANTLR start "entryRuleQualifiedNameTuple"
    // InternalFortXTrans.g:933:1: entryRuleQualifiedNameTuple returns [EObject current=null] : iv_ruleQualifiedNameTuple= ruleQualifiedNameTuple EOF ;
    public final EObject entryRuleQualifiedNameTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedNameTuple = null;


        try {
            // InternalFortXTrans.g:933:59: (iv_ruleQualifiedNameTuple= ruleQualifiedNameTuple EOF )
            // InternalFortXTrans.g:934:2: iv_ruleQualifiedNameTuple= ruleQualifiedNameTuple EOF
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
    // InternalFortXTrans.g:940:1: ruleQualifiedNameTuple returns [EObject current=null] : (otherlv_0= '(' ( (lv_qlist_1_0= ruleQualifiedName ) ) (otherlv_2= ',' ( (lv_qlist_3_0= ruleQualifiedName ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleQualifiedNameTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_qlist_1_0 = null;

        EObject lv_qlist_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:946:2: ( (otherlv_0= '(' ( (lv_qlist_1_0= ruleQualifiedName ) ) (otherlv_2= ',' ( (lv_qlist_3_0= ruleQualifiedName ) ) )* otherlv_4= ')' ) )
            // InternalFortXTrans.g:947:2: (otherlv_0= '(' ( (lv_qlist_1_0= ruleQualifiedName ) ) (otherlv_2= ',' ( (lv_qlist_3_0= ruleQualifiedName ) ) )* otherlv_4= ')' )
            {
            // InternalFortXTrans.g:947:2: (otherlv_0= '(' ( (lv_qlist_1_0= ruleQualifiedName ) ) (otherlv_2= ',' ( (lv_qlist_3_0= ruleQualifiedName ) ) )* otherlv_4= ')' )
            // InternalFortXTrans.g:948:3: otherlv_0= '(' ( (lv_qlist_1_0= ruleQualifiedName ) ) (otherlv_2= ',' ( (lv_qlist_3_0= ruleQualifiedName ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQualifiedNameTupleAccess().getLeftParenthesisKeyword_0());
            		
            // InternalFortXTrans.g:952:3: ( (lv_qlist_1_0= ruleQualifiedName ) )
            // InternalFortXTrans.g:953:4: (lv_qlist_1_0= ruleQualifiedName )
            {
            // InternalFortXTrans.g:953:4: (lv_qlist_1_0= ruleQualifiedName )
            // InternalFortXTrans.g:954:5: lv_qlist_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getQualifiedNameTupleAccess().getQlistQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_qlist_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualifiedNameTupleRule());
            					}
            					add(
            						current,
            						"qlist",
            						lv_qlist_1_0,
            						"srf.transpiler.fortxtrans.FortXTrans.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFortXTrans.g:971:3: (otherlv_2= ',' ( (lv_qlist_3_0= ruleQualifiedName ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==19) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalFortXTrans.g:972:4: otherlv_2= ',' ( (lv_qlist_3_0= ruleQualifiedName ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getQualifiedNameTupleAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalFortXTrans.g:976:4: ( (lv_qlist_3_0= ruleQualifiedName ) )
            	    // InternalFortXTrans.g:977:5: (lv_qlist_3_0= ruleQualifiedName )
            	    {
            	    // InternalFortXTrans.g:977:5: (lv_qlist_3_0= ruleQualifiedName )
            	    // InternalFortXTrans.g:978:6: lv_qlist_3_0= ruleQualifiedName
            	    {

            	    						newCompositeNode(grammarAccess.getQualifiedNameTupleAccess().getQlistQualifiedNameParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_qlist_3_0=ruleQualifiedName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQualifiedNameTupleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"qlist",
            	    							lv_qlist_3_0,
            	    							"srf.transpiler.fortxtrans.FortXTrans.QualifiedName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getQualifiedNameTupleAccess().getRightParenthesisKeyword_3());
            		

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
    // InternalFortXTrans.g:1004:1: entryRuleSimpleNames returns [EObject current=null] : iv_ruleSimpleNames= ruleSimpleNames EOF ;
    public final EObject entryRuleSimpleNames() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleNames = null;


        try {
            // InternalFortXTrans.g:1004:52: (iv_ruleSimpleNames= ruleSimpleNames EOF )
            // InternalFortXTrans.g:1005:2: iv_ruleSimpleNames= ruleSimpleNames EOF
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
    // InternalFortXTrans.g:1011:1: ruleSimpleNames returns [EObject current=null] : ( ( (lv_nameList_0_0= ruleSimpleName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleSimpleName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )* otherlv_5= '}' ) ) ;
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
            // InternalFortXTrans.g:1017:2: ( ( ( (lv_nameList_0_0= ruleSimpleName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleSimpleName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )* otherlv_5= '}' ) ) )
            // InternalFortXTrans.g:1018:2: ( ( (lv_nameList_0_0= ruleSimpleName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleSimpleName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )* otherlv_5= '}' ) )
            {
            // InternalFortXTrans.g:1018:2: ( ( (lv_nameList_0_0= ruleSimpleName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleSimpleName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )* otherlv_5= '}' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==18) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalFortXTrans.g:1019:3: ( (lv_nameList_0_0= ruleSimpleName ) )
                    {
                    // InternalFortXTrans.g:1019:3: ( (lv_nameList_0_0= ruleSimpleName ) )
                    // InternalFortXTrans.g:1020:4: (lv_nameList_0_0= ruleSimpleName )
                    {
                    // InternalFortXTrans.g:1020:4: (lv_nameList_0_0= ruleSimpleName )
                    // InternalFortXTrans.g:1021:5: lv_nameList_0_0= ruleSimpleName
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
                    // InternalFortXTrans.g:1039:3: ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleSimpleName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )* otherlv_5= '}' )
                    {
                    // InternalFortXTrans.g:1039:3: ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleSimpleName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )* otherlv_5= '}' )
                    // InternalFortXTrans.g:1040:4: ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleSimpleName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )* otherlv_5= '}'
                    {
                    // InternalFortXTrans.g:1040:4: ( (lv_brack_1_0= '{' ) )
                    // InternalFortXTrans.g:1041:5: (lv_brack_1_0= '{' )
                    {
                    // InternalFortXTrans.g:1041:5: (lv_brack_1_0= '{' )
                    // InternalFortXTrans.g:1042:6: lv_brack_1_0= '{'
                    {
                    lv_brack_1_0=(Token)match(input,18,FOLLOW_3); 

                    						newLeafNode(lv_brack_1_0, grammarAccess.getSimpleNamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleNamesRule());
                    						}
                    						setWithLastConsumed(current, "brack", lv_brack_1_0, "{");
                    					

                    }


                    }

                    // InternalFortXTrans.g:1054:4: ( (lv_nameList_2_0= ruleSimpleName ) )
                    // InternalFortXTrans.g:1055:5: (lv_nameList_2_0= ruleSimpleName )
                    {
                    // InternalFortXTrans.g:1055:5: (lv_nameList_2_0= ruleSimpleName )
                    // InternalFortXTrans.g:1056:6: lv_nameList_2_0= ruleSimpleName
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

                    // InternalFortXTrans.g:1073:4: (otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==19) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalFortXTrans.g:1074:5: otherlv_3= ',' ( (lv_nameList_4_0= ruleSimpleName ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSimpleNamesAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalFortXTrans.g:1078:5: ( (lv_nameList_4_0= ruleSimpleName ) )
                    	    // InternalFortXTrans.g:1079:6: (lv_nameList_4_0= ruleSimpleName )
                    	    {
                    	    // InternalFortXTrans.g:1079:6: (lv_nameList_4_0= ruleSimpleName )
                    	    // InternalFortXTrans.g:1080:7: lv_nameList_4_0= ruleSimpleName
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
    // InternalFortXTrans.g:1107:1: entryRuleSimpleName returns [EObject current=null] : iv_ruleSimpleName= ruleSimpleName EOF ;
    public final EObject entryRuleSimpleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleName = null;


        try {
            // InternalFortXTrans.g:1107:51: (iv_ruleSimpleName= ruleSimpleName EOF )
            // InternalFortXTrans.g:1108:2: iv_ruleSimpleName= ruleSimpleName EOF
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
    // InternalFortXTrans.g:1114:1: ruleSimpleName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSimpleName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalFortXTrans.g:1120:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalFortXTrans.g:1121:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalFortXTrans.g:1121:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalFortXTrans.g:1122:3: (lv_name_0_0= RULE_ID )
            {
            // InternalFortXTrans.g:1122:3: (lv_name_0_0= RULE_ID )
            // InternalFortXTrans.g:1123:4: lv_name_0_0= RULE_ID
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
    // InternalFortXTrans.g:1142:1: entryRuleAliasedSimpleName returns [EObject current=null] : iv_ruleAliasedSimpleName= ruleAliasedSimpleName EOF ;
    public final EObject entryRuleAliasedSimpleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasedSimpleName = null;


        try {
            // InternalFortXTrans.g:1142:58: (iv_ruleAliasedSimpleName= ruleAliasedSimpleName EOF )
            // InternalFortXTrans.g:1143:2: iv_ruleAliasedSimpleName= ruleAliasedSimpleName EOF
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
    // InternalFortXTrans.g:1149:1: ruleAliasedSimpleName returns [EObject current=null] : ( ( (lv_orig_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleAliasedSimpleName() throws RecognitionException {
        EObject current = null;

        Token lv_orig_0_0=null;
        Token otherlv_1=null;
        Token lv_asName_2_0=null;


        	enterRule();

        try {
            // InternalFortXTrans.g:1155:2: ( ( ( (lv_orig_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? ) )
            // InternalFortXTrans.g:1156:2: ( ( (lv_orig_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? )
            {
            // InternalFortXTrans.g:1156:2: ( ( (lv_orig_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? )
            // InternalFortXTrans.g:1157:3: ( (lv_orig_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )?
            {
            // InternalFortXTrans.g:1157:3: ( (lv_orig_0_0= RULE_ID ) )
            // InternalFortXTrans.g:1158:4: (lv_orig_0_0= RULE_ID )
            {
            // InternalFortXTrans.g:1158:4: (lv_orig_0_0= RULE_ID )
            // InternalFortXTrans.g:1159:5: lv_orig_0_0= RULE_ID
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

            // InternalFortXTrans.g:1175:3: (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalFortXTrans.g:1176:4: otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getAliasedSimpleNameAccess().getAsKeyword_1_0());
                    			
                    // InternalFortXTrans.g:1180:4: ( (lv_asName_2_0= RULE_ID ) )
                    // InternalFortXTrans.g:1181:5: (lv_asName_2_0= RULE_ID )
                    {
                    // InternalFortXTrans.g:1181:5: (lv_asName_2_0= RULE_ID )
                    // InternalFortXTrans.g:1182:6: lv_asName_2_0= RULE_ID
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
    // InternalFortXTrans.g:1203:1: entryRuleAliasedAPINames returns [EObject current=null] : iv_ruleAliasedAPINames= ruleAliasedAPINames EOF ;
    public final EObject entryRuleAliasedAPINames() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasedAPINames = null;


        try {
            // InternalFortXTrans.g:1203:56: (iv_ruleAliasedAPINames= ruleAliasedAPINames EOF )
            // InternalFortXTrans.g:1204:2: iv_ruleAliasedAPINames= ruleAliasedAPINames EOF
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
    // InternalFortXTrans.g:1210:1: ruleAliasedAPINames returns [EObject current=null] : ( ( (lv_nameList_0_0= ruleAliasedAPIName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleAliasedAPIName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )* otherlv_5= '}' ) ) ;
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
            // InternalFortXTrans.g:1216:2: ( ( ( (lv_nameList_0_0= ruleAliasedAPIName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleAliasedAPIName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )* otherlv_5= '}' ) ) )
            // InternalFortXTrans.g:1217:2: ( ( (lv_nameList_0_0= ruleAliasedAPIName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleAliasedAPIName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )* otherlv_5= '}' ) )
            {
            // InternalFortXTrans.g:1217:2: ( ( (lv_nameList_0_0= ruleAliasedAPIName ) ) | ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleAliasedAPIName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )* otherlv_5= '}' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==18) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalFortXTrans.g:1218:3: ( (lv_nameList_0_0= ruleAliasedAPIName ) )
                    {
                    // InternalFortXTrans.g:1218:3: ( (lv_nameList_0_0= ruleAliasedAPIName ) )
                    // InternalFortXTrans.g:1219:4: (lv_nameList_0_0= ruleAliasedAPIName )
                    {
                    // InternalFortXTrans.g:1219:4: (lv_nameList_0_0= ruleAliasedAPIName )
                    // InternalFortXTrans.g:1220:5: lv_nameList_0_0= ruleAliasedAPIName
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
                    // InternalFortXTrans.g:1238:3: ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleAliasedAPIName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )* otherlv_5= '}' )
                    {
                    // InternalFortXTrans.g:1238:3: ( ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleAliasedAPIName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )* otherlv_5= '}' )
                    // InternalFortXTrans.g:1239:4: ( (lv_brack_1_0= '{' ) ) ( (lv_nameList_2_0= ruleAliasedAPIName ) ) (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )* otherlv_5= '}'
                    {
                    // InternalFortXTrans.g:1239:4: ( (lv_brack_1_0= '{' ) )
                    // InternalFortXTrans.g:1240:5: (lv_brack_1_0= '{' )
                    {
                    // InternalFortXTrans.g:1240:5: (lv_brack_1_0= '{' )
                    // InternalFortXTrans.g:1241:6: lv_brack_1_0= '{'
                    {
                    lv_brack_1_0=(Token)match(input,18,FOLLOW_3); 

                    						newLeafNode(lv_brack_1_0, grammarAccess.getAliasedAPINamesAccess().getBrackLeftCurlyBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAliasedAPINamesRule());
                    						}
                    						setWithLastConsumed(current, "brack", lv_brack_1_0, "{");
                    					

                    }


                    }

                    // InternalFortXTrans.g:1253:4: ( (lv_nameList_2_0= ruleAliasedAPIName ) )
                    // InternalFortXTrans.g:1254:5: (lv_nameList_2_0= ruleAliasedAPIName )
                    {
                    // InternalFortXTrans.g:1254:5: (lv_nameList_2_0= ruleAliasedAPIName )
                    // InternalFortXTrans.g:1255:6: lv_nameList_2_0= ruleAliasedAPIName
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

                    // InternalFortXTrans.g:1272:4: (otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==19) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalFortXTrans.g:1273:5: otherlv_3= ',' ( (lv_nameList_4_0= ruleAliasedAPIName ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getAliasedAPINamesAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalFortXTrans.g:1277:5: ( (lv_nameList_4_0= ruleAliasedAPIName ) )
                    	    // InternalFortXTrans.g:1278:6: (lv_nameList_4_0= ruleAliasedAPIName )
                    	    {
                    	    // InternalFortXTrans.g:1278:6: (lv_nameList_4_0= ruleAliasedAPIName )
                    	    // InternalFortXTrans.g:1279:7: lv_nameList_4_0= ruleAliasedAPIName
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
    // InternalFortXTrans.g:1306:1: entryRuleAliasedAPIName returns [EObject current=null] : iv_ruleAliasedAPIName= ruleAliasedAPIName EOF ;
    public final EObject entryRuleAliasedAPIName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasedAPIName = null;


        try {
            // InternalFortXTrans.g:1306:55: (iv_ruleAliasedAPIName= ruleAliasedAPIName EOF )
            // InternalFortXTrans.g:1307:2: iv_ruleAliasedAPIName= ruleAliasedAPIName EOF
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
    // InternalFortXTrans.g:1313:1: ruleAliasedAPIName returns [EObject current=null] : ( ( (lv_orig_0_0= ruleQualifiedName ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleAliasedAPIName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_asName_2_0=null;
        EObject lv_orig_0_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1319:2: ( ( ( (lv_orig_0_0= ruleQualifiedName ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? ) )
            // InternalFortXTrans.g:1320:2: ( ( (lv_orig_0_0= ruleQualifiedName ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? )
            {
            // InternalFortXTrans.g:1320:2: ( ( (lv_orig_0_0= ruleQualifiedName ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )? )
            // InternalFortXTrans.g:1321:3: ( (lv_orig_0_0= ruleQualifiedName ) ) (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )?
            {
            // InternalFortXTrans.g:1321:3: ( (lv_orig_0_0= ruleQualifiedName ) )
            // InternalFortXTrans.g:1322:4: (lv_orig_0_0= ruleQualifiedName )
            {
            // InternalFortXTrans.g:1322:4: (lv_orig_0_0= ruleQualifiedName )
            // InternalFortXTrans.g:1323:5: lv_orig_0_0= ruleQualifiedName
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

            // InternalFortXTrans.g:1340:3: (otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalFortXTrans.g:1341:4: otherlv_1= 'as' ( (lv_asName_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getAliasedAPINameAccess().getAsKeyword_1_0());
                    			
                    // InternalFortXTrans.g:1345:4: ( (lv_asName_2_0= RULE_ID ) )
                    // InternalFortXTrans.g:1346:5: (lv_asName_2_0= RULE_ID )
                    {
                    // InternalFortXTrans.g:1346:5: (lv_asName_2_0= RULE_ID )
                    // InternalFortXTrans.g:1347:6: lv_asName_2_0= RULE_ID
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
    // InternalFortXTrans.g:1368:1: entryRuleDecls returns [EObject current=null] : iv_ruleDecls= ruleDecls EOF ;
    public final EObject entryRuleDecls() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecls = null;


        try {
            // InternalFortXTrans.g:1368:46: (iv_ruleDecls= ruleDecls EOF )
            // InternalFortXTrans.g:1369:2: iv_ruleDecls= ruleDecls EOF
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
    // InternalFortXTrans.g:1375:1: ruleDecls returns [EObject current=null] : ( (lv_decls_0_0= ruleDecl ) )+ ;
    public final EObject ruleDecls() throws RecognitionException {
        EObject current = null;

        EObject lv_decls_0_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1381:2: ( ( (lv_decls_0_0= ruleDecl ) )+ )
            // InternalFortXTrans.g:1382:2: ( (lv_decls_0_0= ruleDecl ) )+
            {
            // InternalFortXTrans.g:1382:2: ( (lv_decls_0_0= ruleDecl ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // InternalFortXTrans.g:1383:3: (lv_decls_0_0= ruleDecl )
            	    {
            	    // InternalFortXTrans.g:1383:3: (lv_decls_0_0= ruleDecl )
            	    // InternalFortXTrans.g:1384:4: lv_decls_0_0= ruleDecl
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
    // InternalFortXTrans.g:1404:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // InternalFortXTrans.g:1404:45: (iv_ruleDecl= ruleDecl EOF )
            // InternalFortXTrans.g:1405:2: iv_ruleDecl= ruleDecl EOF
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
    // InternalFortXTrans.g:1411:1: ruleDecl returns [EObject current=null] : ( ( (lv_function_0_0= ruleFnDecl ) ) | ( (lv_field_1_0= ruleFieldDecl ) ) ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_function_0_0 = null;

        EObject lv_field_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1417:2: ( ( ( (lv_function_0_0= ruleFnDecl ) ) | ( (lv_field_1_0= ruleFieldDecl ) ) ) )
            // InternalFortXTrans.g:1418:2: ( ( (lv_function_0_0= ruleFnDecl ) ) | ( (lv_field_1_0= ruleFieldDecl ) ) )
            {
            // InternalFortXTrans.g:1418:2: ( ( (lv_function_0_0= ruleFnDecl ) ) | ( (lv_field_1_0= ruleFieldDecl ) ) )
            int alt27=2;
            switch ( input.LA(1) ) {
            case 26:
                {
                switch ( input.LA(2) ) {
                case 24:
                case 49:
                case 50:
                    {
                    alt27=2;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA27_3 = input.LA(3);

                    if ( ((LA27_3>=30 && LA27_3<=31)) ) {
                        alt27=2;
                    }
                    else if ( (LA27_3==RULE_ID||LA27_3==24||LA27_3==49) ) {
                        alt27=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 26:
                case 27:
                case 28:
                case 29:
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
            case 27:
            case 28:
            case 29:
                {
                alt27=1;
                }
                break;
            case RULE_ID:
                {
                int LA27_3 = input.LA(2);

                if ( ((LA27_3>=30 && LA27_3<=31)) ) {
                    alt27=2;
                }
                else if ( (LA27_3==RULE_ID||LA27_3==24||LA27_3==49) ) {
                    alt27=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 3, input);

                    throw nvae;
                }
                }
                break;
            case 24:
            case 49:
            case 50:
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
                    // InternalFortXTrans.g:1419:3: ( (lv_function_0_0= ruleFnDecl ) )
                    {
                    // InternalFortXTrans.g:1419:3: ( (lv_function_0_0= ruleFnDecl ) )
                    // InternalFortXTrans.g:1420:4: (lv_function_0_0= ruleFnDecl )
                    {
                    // InternalFortXTrans.g:1420:4: (lv_function_0_0= ruleFnDecl )
                    // InternalFortXTrans.g:1421:5: lv_function_0_0= ruleFnDecl
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
                    // InternalFortXTrans.g:1439:3: ( (lv_field_1_0= ruleFieldDecl ) )
                    {
                    // InternalFortXTrans.g:1439:3: ( (lv_field_1_0= ruleFieldDecl ) )
                    // InternalFortXTrans.g:1440:4: (lv_field_1_0= ruleFieldDecl )
                    {
                    // InternalFortXTrans.g:1440:4: (lv_field_1_0= ruleFieldDecl )
                    // InternalFortXTrans.g:1441:5: lv_field_1_0= ruleFieldDecl
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
    // InternalFortXTrans.g:1462:1: entryRuleFnMods returns [EObject current=null] : iv_ruleFnMods= ruleFnMods EOF ;
    public final EObject entryRuleFnMods() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFnMods = null;


        try {
            // InternalFortXTrans.g:1462:47: (iv_ruleFnMods= ruleFnMods EOF )
            // InternalFortXTrans.g:1463:2: iv_ruleFnMods= ruleFnMods EOF
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
    // InternalFortXTrans.g:1469:1: ruleFnMods returns [EObject current=null] : ( (lv_mods_0_0= ruleFnMod ) )+ ;
    public final EObject ruleFnMods() throws RecognitionException {
        EObject current = null;

        EObject lv_mods_0_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1475:2: ( ( (lv_mods_0_0= ruleFnMod ) )+ )
            // InternalFortXTrans.g:1476:2: ( (lv_mods_0_0= ruleFnMod ) )+
            {
            // InternalFortXTrans.g:1476:2: ( (lv_mods_0_0= ruleFnMod ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=26 && LA28_0<=29)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalFortXTrans.g:1477:3: (lv_mods_0_0= ruleFnMod )
            	    {
            	    // InternalFortXTrans.g:1477:3: (lv_mods_0_0= ruleFnMod )
            	    // InternalFortXTrans.g:1478:4: lv_mods_0_0= ruleFnMod
            	    {

            	    				newCompositeNode(grammarAccess.getFnModsAccess().getModsFnModParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_21);
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
    // InternalFortXTrans.g:1498:1: entryRuleFnMod returns [EObject current=null] : iv_ruleFnMod= ruleFnMod EOF ;
    public final EObject entryRuleFnMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFnMod = null;


        try {
            // InternalFortXTrans.g:1498:46: (iv_ruleFnMod= ruleFnMod EOF )
            // InternalFortXTrans.g:1499:2: iv_ruleFnMod= ruleFnMod EOF
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
    // InternalFortXTrans.g:1505:1: ruleFnMod returns [EObject current=null] : ( ( (lv_modtype_0_0= 'private' ) ) | ( (lv_modtype_1_0= 'test' ) ) | ( (lv_modtype_2_0= 'atomic' ) ) | ( (lv_modtype_3_0= 'io' ) ) ) ;
    public final EObject ruleFnMod() throws RecognitionException {
        EObject current = null;

        Token lv_modtype_0_0=null;
        Token lv_modtype_1_0=null;
        Token lv_modtype_2_0=null;
        Token lv_modtype_3_0=null;


        	enterRule();

        try {
            // InternalFortXTrans.g:1511:2: ( ( ( (lv_modtype_0_0= 'private' ) ) | ( (lv_modtype_1_0= 'test' ) ) | ( (lv_modtype_2_0= 'atomic' ) ) | ( (lv_modtype_3_0= 'io' ) ) ) )
            // InternalFortXTrans.g:1512:2: ( ( (lv_modtype_0_0= 'private' ) ) | ( (lv_modtype_1_0= 'test' ) ) | ( (lv_modtype_2_0= 'atomic' ) ) | ( (lv_modtype_3_0= 'io' ) ) )
            {
            // InternalFortXTrans.g:1512:2: ( ( (lv_modtype_0_0= 'private' ) ) | ( (lv_modtype_1_0= 'test' ) ) | ( (lv_modtype_2_0= 'atomic' ) ) | ( (lv_modtype_3_0= 'io' ) ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt29=1;
                }
                break;
            case 27:
                {
                alt29=2;
                }
                break;
            case 28:
                {
                alt29=3;
                }
                break;
            case 29:
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
                    // InternalFortXTrans.g:1513:3: ( (lv_modtype_0_0= 'private' ) )
                    {
                    // InternalFortXTrans.g:1513:3: ( (lv_modtype_0_0= 'private' ) )
                    // InternalFortXTrans.g:1514:4: (lv_modtype_0_0= 'private' )
                    {
                    // InternalFortXTrans.g:1514:4: (lv_modtype_0_0= 'private' )
                    // InternalFortXTrans.g:1515:5: lv_modtype_0_0= 'private'
                    {
                    lv_modtype_0_0=(Token)match(input,26,FOLLOW_2); 

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
                    // InternalFortXTrans.g:1528:3: ( (lv_modtype_1_0= 'test' ) )
                    {
                    // InternalFortXTrans.g:1528:3: ( (lv_modtype_1_0= 'test' ) )
                    // InternalFortXTrans.g:1529:4: (lv_modtype_1_0= 'test' )
                    {
                    // InternalFortXTrans.g:1529:4: (lv_modtype_1_0= 'test' )
                    // InternalFortXTrans.g:1530:5: lv_modtype_1_0= 'test'
                    {
                    lv_modtype_1_0=(Token)match(input,27,FOLLOW_2); 

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
                    // InternalFortXTrans.g:1543:3: ( (lv_modtype_2_0= 'atomic' ) )
                    {
                    // InternalFortXTrans.g:1543:3: ( (lv_modtype_2_0= 'atomic' ) )
                    // InternalFortXTrans.g:1544:4: (lv_modtype_2_0= 'atomic' )
                    {
                    // InternalFortXTrans.g:1544:4: (lv_modtype_2_0= 'atomic' )
                    // InternalFortXTrans.g:1545:5: lv_modtype_2_0= 'atomic'
                    {
                    lv_modtype_2_0=(Token)match(input,28,FOLLOW_2); 

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
                    // InternalFortXTrans.g:1558:3: ( (lv_modtype_3_0= 'io' ) )
                    {
                    // InternalFortXTrans.g:1558:3: ( (lv_modtype_3_0= 'io' ) )
                    // InternalFortXTrans.g:1559:4: (lv_modtype_3_0= 'io' )
                    {
                    // InternalFortXTrans.g:1559:4: (lv_modtype_3_0= 'io' )
                    // InternalFortXTrans.g:1560:5: lv_modtype_3_0= 'io'
                    {
                    lv_modtype_3_0=(Token)match(input,29,FOLLOW_2); 

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
    // InternalFortXTrans.g:1576:1: entryRuleValParam returns [EObject current=null] : iv_ruleValParam= ruleValParam EOF ;
    public final EObject entryRuleValParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValParam = null;


        try {
            // InternalFortXTrans.g:1576:49: (iv_ruleValParam= ruleValParam EOF )
            // InternalFortXTrans.g:1577:2: iv_ruleValParam= ruleValParam EOF
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
    // InternalFortXTrans.g:1583:1: ruleValParam returns [EObject current=null] : ( ( (lv_params_0_0= ruleParam ) ) | ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' ) ) ;
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
            // InternalFortXTrans.g:1589:2: ( ( ( (lv_params_0_0= ruleParam ) ) | ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' ) ) )
            // InternalFortXTrans.g:1590:2: ( ( (lv_params_0_0= ruleParam ) ) | ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' ) )
            {
            // InternalFortXTrans.g:1590:2: ( ( (lv_params_0_0= ruleParam ) ) | ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID||LA32_0==49) ) {
                alt32=1;
            }
            else if ( (LA32_0==24) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalFortXTrans.g:1591:3: ( (lv_params_0_0= ruleParam ) )
                    {
                    // InternalFortXTrans.g:1591:3: ( (lv_params_0_0= ruleParam ) )
                    // InternalFortXTrans.g:1592:4: (lv_params_0_0= ruleParam )
                    {
                    // InternalFortXTrans.g:1592:4: (lv_params_0_0= ruleParam )
                    // InternalFortXTrans.g:1593:5: lv_params_0_0= ruleParam
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
                    // InternalFortXTrans.g:1611:3: ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' )
                    {
                    // InternalFortXTrans.g:1611:3: ( ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' )
                    // InternalFortXTrans.g:1612:4: ( (lv_brack_1_0= '(' ) ) ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')'
                    {
                    // InternalFortXTrans.g:1612:4: ( (lv_brack_1_0= '(' ) )
                    // InternalFortXTrans.g:1613:5: (lv_brack_1_0= '(' )
                    {
                    // InternalFortXTrans.g:1613:5: (lv_brack_1_0= '(' )
                    // InternalFortXTrans.g:1614:6: lv_brack_1_0= '('
                    {
                    lv_brack_1_0=(Token)match(input,24,FOLLOW_22); 

                    						newLeafNode(lv_brack_1_0, grammarAccess.getValParamAccess().getBrackLeftParenthesisKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValParamRule());
                    						}
                    						setWithLastConsumed(current, "brack", lv_brack_1_0, "(");
                    					

                    }


                    }

                    // InternalFortXTrans.g:1626:4: ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_ID||LA31_0==49) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalFortXTrans.g:1627:5: ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )*
                            {
                            // InternalFortXTrans.g:1627:5: ( (lv_params_2_0= ruleParam ) )
                            // InternalFortXTrans.g:1628:6: (lv_params_2_0= ruleParam )
                            {
                            // InternalFortXTrans.g:1628:6: (lv_params_2_0= ruleParam )
                            // InternalFortXTrans.g:1629:7: lv_params_2_0= ruleParam
                            {

                            							newCompositeNode(grammarAccess.getValParamAccess().getParamsParamParserRuleCall_1_1_0_0());
                            						
                            pushFollow(FOLLOW_19);
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

                            // InternalFortXTrans.g:1646:5: (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==19) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // InternalFortXTrans.g:1647:6: otherlv_3= ',' ( (lv_params_4_0= ruleParam ) )
                            	    {
                            	    otherlv_3=(Token)match(input,19,FOLLOW_23); 

                            	    						newLeafNode(otherlv_3, grammarAccess.getValParamAccess().getCommaKeyword_1_1_1_0());
                            	    					
                            	    // InternalFortXTrans.g:1651:6: ( (lv_params_4_0= ruleParam ) )
                            	    // InternalFortXTrans.g:1652:7: (lv_params_4_0= ruleParam )
                            	    {
                            	    // InternalFortXTrans.g:1652:7: (lv_params_4_0= ruleParam )
                            	    // InternalFortXTrans.g:1653:8: lv_params_4_0= ruleParam
                            	    {

                            	    								newCompositeNode(grammarAccess.getValParamAccess().getParamsParamParserRuleCall_1_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_19);
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
    // InternalFortXTrans.g:1681:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalFortXTrans.g:1681:46: (iv_ruleParam= ruleParam EOF )
            // InternalFortXTrans.g:1682:2: iv_ruleParam= ruleParam EOF
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
    // InternalFortXTrans.g:1688:1: ruleParam returns [EObject current=null] : ( ( (lv_bId_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        EObject lv_bId_0_0 = null;

        EObject lv_istype_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1694:2: ( ( ( (lv_bId_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) ) ) )
            // InternalFortXTrans.g:1695:2: ( ( (lv_bId_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) ) )
            {
            // InternalFortXTrans.g:1695:2: ( ( (lv_bId_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) ) )
            // InternalFortXTrans.g:1696:3: ( (lv_bId_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) )
            {
            // InternalFortXTrans.g:1696:3: ( (lv_bId_0_0= ruleBindId ) )
            // InternalFortXTrans.g:1697:4: (lv_bId_0_0= ruleBindId )
            {
            // InternalFortXTrans.g:1697:4: (lv_bId_0_0= ruleBindId )
            // InternalFortXTrans.g:1698:5: lv_bId_0_0= ruleBindId
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

            // InternalFortXTrans.g:1715:3: ( (lv_istype_1_0= ruleIsType ) )
            // InternalFortXTrans.g:1716:4: (lv_istype_1_0= ruleIsType )
            {
            // InternalFortXTrans.g:1716:4: (lv_istype_1_0= ruleIsType )
            // InternalFortXTrans.g:1717:5: lv_istype_1_0= ruleIsType
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
    // InternalFortXTrans.g:1738:1: entryRuleRetType returns [EObject current=null] : iv_ruleRetType= ruleRetType EOF ;
    public final EObject entryRuleRetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetType = null;


        try {
            // InternalFortXTrans.g:1738:48: (iv_ruleRetType= ruleRetType EOF )
            // InternalFortXTrans.g:1739:2: iv_ruleRetType= ruleRetType EOF
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
    // InternalFortXTrans.g:1745:1: ruleRetType returns [EObject current=null] : ( (otherlv_0= ':' ( (lv_empty_1_0= '(' ) ) otherlv_2= ')' ) | (otherlv_3= ':' ( (lv_type_4_0= ruleSimpleName ) ) ) ) ;
    public final EObject ruleRetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_empty_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1751:2: ( ( (otherlv_0= ':' ( (lv_empty_1_0= '(' ) ) otherlv_2= ')' ) | (otherlv_3= ':' ( (lv_type_4_0= ruleSimpleName ) ) ) ) )
            // InternalFortXTrans.g:1752:2: ( (otherlv_0= ':' ( (lv_empty_1_0= '(' ) ) otherlv_2= ')' ) | (otherlv_3= ':' ( (lv_type_4_0= ruleSimpleName ) ) ) )
            {
            // InternalFortXTrans.g:1752:2: ( (otherlv_0= ':' ( (lv_empty_1_0= '(' ) ) otherlv_2= ')' ) | (otherlv_3= ':' ( (lv_type_4_0= ruleSimpleName ) ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==30) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==24) ) {
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
                    // InternalFortXTrans.g:1753:3: (otherlv_0= ':' ( (lv_empty_1_0= '(' ) ) otherlv_2= ')' )
                    {
                    // InternalFortXTrans.g:1753:3: (otherlv_0= ':' ( (lv_empty_1_0= '(' ) ) otherlv_2= ')' )
                    // InternalFortXTrans.g:1754:4: otherlv_0= ':' ( (lv_empty_1_0= '(' ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_25); 

                    				newLeafNode(otherlv_0, grammarAccess.getRetTypeAccess().getColonKeyword_0_0());
                    			
                    // InternalFortXTrans.g:1758:4: ( (lv_empty_1_0= '(' ) )
                    // InternalFortXTrans.g:1759:5: (lv_empty_1_0= '(' )
                    {
                    // InternalFortXTrans.g:1759:5: (lv_empty_1_0= '(' )
                    // InternalFortXTrans.g:1760:6: lv_empty_1_0= '('
                    {
                    lv_empty_1_0=(Token)match(input,24,FOLLOW_26); 

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
                    // InternalFortXTrans.g:1778:3: (otherlv_3= ':' ( (lv_type_4_0= ruleSimpleName ) ) )
                    {
                    // InternalFortXTrans.g:1778:3: (otherlv_3= ':' ( (lv_type_4_0= ruleSimpleName ) ) )
                    // InternalFortXTrans.g:1779:4: otherlv_3= ':' ( (lv_type_4_0= ruleSimpleName ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRetTypeAccess().getColonKeyword_1_0());
                    			
                    // InternalFortXTrans.g:1783:4: ( (lv_type_4_0= ruleSimpleName ) )
                    // InternalFortXTrans.g:1784:5: (lv_type_4_0= ruleSimpleName )
                    {
                    // InternalFortXTrans.g:1784:5: (lv_type_4_0= ruleSimpleName )
                    // InternalFortXTrans.g:1785:6: lv_type_4_0= ruleSimpleName
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
    // InternalFortXTrans.g:1807:1: entryRuleTupleType returns [EObject current=null] : iv_ruleTupleType= ruleTupleType EOF ;
    public final EObject entryRuleTupleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleType = null;


        try {
            // InternalFortXTrans.g:1807:50: (iv_ruleTupleType= ruleTupleType EOF )
            // InternalFortXTrans.g:1808:2: iv_ruleTupleType= ruleTupleType EOF
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
    // InternalFortXTrans.g:1814:1: ruleTupleType returns [EObject current=null] : (otherlv_0= '(' ( (lv_types_1_0= ruleSimpleName ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSimpleName ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleTupleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:1820:2: ( (otherlv_0= '(' ( (lv_types_1_0= ruleSimpleName ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSimpleName ) ) )* otherlv_4= ')' ) )
            // InternalFortXTrans.g:1821:2: (otherlv_0= '(' ( (lv_types_1_0= ruleSimpleName ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSimpleName ) ) )* otherlv_4= ')' )
            {
            // InternalFortXTrans.g:1821:2: (otherlv_0= '(' ( (lv_types_1_0= ruleSimpleName ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSimpleName ) ) )* otherlv_4= ')' )
            // InternalFortXTrans.g:1822:3: otherlv_0= '(' ( (lv_types_1_0= ruleSimpleName ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSimpleName ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTupleTypeAccess().getLeftParenthesisKeyword_0());
            		
            // InternalFortXTrans.g:1826:3: ( (lv_types_1_0= ruleSimpleName ) )
            // InternalFortXTrans.g:1827:4: (lv_types_1_0= ruleSimpleName )
            {
            // InternalFortXTrans.g:1827:4: (lv_types_1_0= ruleSimpleName )
            // InternalFortXTrans.g:1828:5: lv_types_1_0= ruleSimpleName
            {

            					newCompositeNode(grammarAccess.getTupleTypeAccess().getTypesSimpleNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalFortXTrans.g:1845:3: (otherlv_2= ',' ( (lv_types_3_0= ruleSimpleName ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==19) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalFortXTrans.g:1846:4: otherlv_2= ',' ( (lv_types_3_0= ruleSimpleName ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTupleTypeAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalFortXTrans.g:1850:4: ( (lv_types_3_0= ruleSimpleName ) )
            	    // InternalFortXTrans.g:1851:5: (lv_types_3_0= ruleSimpleName )
            	    {
            	    // InternalFortXTrans.g:1851:5: (lv_types_3_0= ruleSimpleName )
            	    // InternalFortXTrans.g:1852:6: lv_types_3_0= ruleSimpleName
            	    {

            	    						newCompositeNode(grammarAccess.getTupleTypeAccess().getTypesSimpleNameParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
            	    break loop34;
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


    // $ANTLR start "entryRuleFnDecl"
    // InternalFortXTrans.g:1878:1: entryRuleFnDecl returns [EObject current=null] : iv_ruleFnDecl= ruleFnDecl EOF ;
    public final EObject entryRuleFnDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFnDecl = null;


        try {
            // InternalFortXTrans.g:1878:47: (iv_ruleFnDecl= ruleFnDecl EOF )
            // InternalFortXTrans.g:1879:2: iv_ruleFnDecl= ruleFnDecl EOF
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
    // InternalFortXTrans.g:1885:1: ruleFnDecl returns [EObject current=null] : ( ( (lv_mods_0_0= ruleFnMods ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleValParam ) ) ( (lv_retVal_3_0= ruleRetType ) )? ( ( (lv_body_4_0= '=' ) ) ( (lv_fnItself_5_0= ruleStmnts ) ) )? ) ;
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
            // InternalFortXTrans.g:1891:2: ( ( ( (lv_mods_0_0= ruleFnMods ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleValParam ) ) ( (lv_retVal_3_0= ruleRetType ) )? ( ( (lv_body_4_0= '=' ) ) ( (lv_fnItself_5_0= ruleStmnts ) ) )? ) )
            // InternalFortXTrans.g:1892:2: ( ( (lv_mods_0_0= ruleFnMods ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleValParam ) ) ( (lv_retVal_3_0= ruleRetType ) )? ( ( (lv_body_4_0= '=' ) ) ( (lv_fnItself_5_0= ruleStmnts ) ) )? )
            {
            // InternalFortXTrans.g:1892:2: ( ( (lv_mods_0_0= ruleFnMods ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleValParam ) ) ( (lv_retVal_3_0= ruleRetType ) )? ( ( (lv_body_4_0= '=' ) ) ( (lv_fnItself_5_0= ruleStmnts ) ) )? )
            // InternalFortXTrans.g:1893:3: ( (lv_mods_0_0= ruleFnMods ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleValParam ) ) ( (lv_retVal_3_0= ruleRetType ) )? ( ( (lv_body_4_0= '=' ) ) ( (lv_fnItself_5_0= ruleStmnts ) ) )?
            {
            // InternalFortXTrans.g:1893:3: ( (lv_mods_0_0= ruleFnMods ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=26 && LA35_0<=29)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalFortXTrans.g:1894:4: (lv_mods_0_0= ruleFnMods )
                    {
                    // InternalFortXTrans.g:1894:4: (lv_mods_0_0= ruleFnMods )
                    // InternalFortXTrans.g:1895:5: lv_mods_0_0= ruleFnMods
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

            // InternalFortXTrans.g:1912:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFortXTrans.g:1913:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFortXTrans.g:1913:4: (lv_name_1_0= RULE_ID )
            // InternalFortXTrans.g:1914:5: lv_name_1_0= RULE_ID
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

            // InternalFortXTrans.g:1930:3: ( (lv_params_2_0= ruleValParam ) )
            // InternalFortXTrans.g:1931:4: (lv_params_2_0= ruleValParam )
            {
            // InternalFortXTrans.g:1931:4: (lv_params_2_0= ruleValParam )
            // InternalFortXTrans.g:1932:5: lv_params_2_0= ruleValParam
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

            // InternalFortXTrans.g:1949:3: ( (lv_retVal_3_0= ruleRetType ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==30) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalFortXTrans.g:1950:4: (lv_retVal_3_0= ruleRetType )
                    {
                    // InternalFortXTrans.g:1950:4: (lv_retVal_3_0= ruleRetType )
                    // InternalFortXTrans.g:1951:5: lv_retVal_3_0= ruleRetType
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

            // InternalFortXTrans.g:1968:3: ( ( (lv_body_4_0= '=' ) ) ( (lv_fnItself_5_0= ruleStmnts ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalFortXTrans.g:1969:4: ( (lv_body_4_0= '=' ) ) ( (lv_fnItself_5_0= ruleStmnts ) )
                    {
                    // InternalFortXTrans.g:1969:4: ( (lv_body_4_0= '=' ) )
                    // InternalFortXTrans.g:1970:5: (lv_body_4_0= '=' )
                    {
                    // InternalFortXTrans.g:1970:5: (lv_body_4_0= '=' )
                    // InternalFortXTrans.g:1971:6: lv_body_4_0= '='
                    {
                    lv_body_4_0=(Token)match(input,31,FOLLOW_30); 

                    						newLeafNode(lv_body_4_0, grammarAccess.getFnDeclAccess().getBodyEqualsSignKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFnDeclRule());
                    						}
                    						setWithLastConsumed(current, "body", true, "=");
                    					

                    }


                    }

                    // InternalFortXTrans.g:1983:4: ( (lv_fnItself_5_0= ruleStmnts ) )
                    // InternalFortXTrans.g:1984:5: (lv_fnItself_5_0= ruleStmnts )
                    {
                    // InternalFortXTrans.g:1984:5: (lv_fnItself_5_0= ruleStmnts )
                    // InternalFortXTrans.g:1985:6: lv_fnItself_5_0= ruleStmnts
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
    // InternalFortXTrans.g:2007:1: entryRuleStmnts returns [EObject current=null] : iv_ruleStmnts= ruleStmnts EOF ;
    public final EObject entryRuleStmnts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmnts = null;


        try {
            // InternalFortXTrans.g:2007:47: (iv_ruleStmnts= ruleStmnts EOF )
            // InternalFortXTrans.g:2008:2: iv_ruleStmnts= ruleStmnts EOF
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
    // InternalFortXTrans.g:2014:1: ruleStmnts returns [EObject current=null] : ( ( (lv_front_0_0= ruleStmnt ) ) | ( (lv_locVar_1_0= ruleLocalVarDecl ) ) | ( (lv_exp_2_0= ruleExpr ) ) ) ;
    public final EObject ruleStmnts() throws RecognitionException {
        EObject current = null;

        EObject lv_front_0_0 = null;

        EObject lv_locVar_1_0 = null;

        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2020:2: ( ( ( (lv_front_0_0= ruleStmnt ) ) | ( (lv_locVar_1_0= ruleLocalVarDecl ) ) | ( (lv_exp_2_0= ruleExpr ) ) ) )
            // InternalFortXTrans.g:2021:2: ( ( (lv_front_0_0= ruleStmnt ) ) | ( (lv_locVar_1_0= ruleLocalVarDecl ) ) | ( (lv_exp_2_0= ruleExpr ) ) )
            {
            // InternalFortXTrans.g:2021:2: ( ( (lv_front_0_0= ruleStmnt ) ) | ( (lv_locVar_1_0= ruleLocalVarDecl ) ) | ( (lv_exp_2_0= ruleExpr ) ) )
            int alt38=3;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // InternalFortXTrans.g:2022:3: ( (lv_front_0_0= ruleStmnt ) )
                    {
                    // InternalFortXTrans.g:2022:3: ( (lv_front_0_0= ruleStmnt ) )
                    // InternalFortXTrans.g:2023:4: (lv_front_0_0= ruleStmnt )
                    {
                    // InternalFortXTrans.g:2023:4: (lv_front_0_0= ruleStmnt )
                    // InternalFortXTrans.g:2024:5: lv_front_0_0= ruleStmnt
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
                    // InternalFortXTrans.g:2042:3: ( (lv_locVar_1_0= ruleLocalVarDecl ) )
                    {
                    // InternalFortXTrans.g:2042:3: ( (lv_locVar_1_0= ruleLocalVarDecl ) )
                    // InternalFortXTrans.g:2043:4: (lv_locVar_1_0= ruleLocalVarDecl )
                    {
                    // InternalFortXTrans.g:2043:4: (lv_locVar_1_0= ruleLocalVarDecl )
                    // InternalFortXTrans.g:2044:5: lv_locVar_1_0= ruleLocalVarDecl
                    {

                    					newCompositeNode(grammarAccess.getStmntsAccess().getLocVarLocalVarDeclParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_locVar_1_0=ruleLocalVarDecl();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStmntsRule());
                    					}
                    					set(
                    						current,
                    						"locVar",
                    						lv_locVar_1_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.LocalVarDecl");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:2062:3: ( (lv_exp_2_0= ruleExpr ) )
                    {
                    // InternalFortXTrans.g:2062:3: ( (lv_exp_2_0= ruleExpr ) )
                    // InternalFortXTrans.g:2063:4: (lv_exp_2_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:2063:4: (lv_exp_2_0= ruleExpr )
                    // InternalFortXTrans.g:2064:5: lv_exp_2_0= ruleExpr
                    {

                    					newCompositeNode(grammarAccess.getStmntsAccess().getExpExprParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_exp_2_0=ruleExpr();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStmntsRule());
                    					}
                    					set(
                    						current,
                    						"exp",
                    						lv_exp_2_0,
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
    // InternalFortXTrans.g:2085:1: entryRuleStmnt returns [EObject current=null] : iv_ruleStmnt= ruleStmnt EOF ;
    public final EObject entryRuleStmnt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmnt = null;


        try {
            // InternalFortXTrans.g:2085:46: (iv_ruleStmnt= ruleStmnt EOF )
            // InternalFortXTrans.g:2086:2: iv_ruleStmnt= ruleStmnt EOF
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
    // InternalFortXTrans.g:2092:1: ruleStmnt returns [EObject current=null] : ( ( (lv_delim_0_0= ruleDelimitedExpr ) ) | ( ( (lv_brack_1_0= '(' ) ) ( (lv_delimList_2_0= ruleDelimitedExprList ) ) otherlv_3= ')' ) ) ;
    public final EObject ruleStmnt() throws RecognitionException {
        EObject current = null;

        Token lv_brack_1_0=null;
        Token otherlv_3=null;
        EObject lv_delim_0_0 = null;

        EObject lv_delimList_2_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2098:2: ( ( ( (lv_delim_0_0= ruleDelimitedExpr ) ) | ( ( (lv_brack_1_0= '(' ) ) ( (lv_delimList_2_0= ruleDelimitedExprList ) ) otherlv_3= ')' ) ) )
            // InternalFortXTrans.g:2099:2: ( ( (lv_delim_0_0= ruleDelimitedExpr ) ) | ( ( (lv_brack_1_0= '(' ) ) ( (lv_delimList_2_0= ruleDelimitedExprList ) ) otherlv_3= ')' ) )
            {
            // InternalFortXTrans.g:2099:2: ( ( (lv_delim_0_0= ruleDelimitedExpr ) ) | ( ( (lv_brack_1_0= '(' ) ) ( (lv_delimList_2_0= ruleDelimitedExprList ) ) otherlv_3= ')' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==28||(LA39_0>=37 && LA39_0<=40)||(LA39_0>=47 && LA39_0<=48)) ) {
                alt39=1;
            }
            else if ( (LA39_0==24) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalFortXTrans.g:2100:3: ( (lv_delim_0_0= ruleDelimitedExpr ) )
                    {
                    // InternalFortXTrans.g:2100:3: ( (lv_delim_0_0= ruleDelimitedExpr ) )
                    // InternalFortXTrans.g:2101:4: (lv_delim_0_0= ruleDelimitedExpr )
                    {
                    // InternalFortXTrans.g:2101:4: (lv_delim_0_0= ruleDelimitedExpr )
                    // InternalFortXTrans.g:2102:5: lv_delim_0_0= ruleDelimitedExpr
                    {

                    					newCompositeNode(grammarAccess.getStmntAccess().getDelimDelimitedExprParserRuleCall_0_0());
                    				
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
                    break;
                case 2 :
                    // InternalFortXTrans.g:2120:3: ( ( (lv_brack_1_0= '(' ) ) ( (lv_delimList_2_0= ruleDelimitedExprList ) ) otherlv_3= ')' )
                    {
                    // InternalFortXTrans.g:2120:3: ( ( (lv_brack_1_0= '(' ) ) ( (lv_delimList_2_0= ruleDelimitedExprList ) ) otherlv_3= ')' )
                    // InternalFortXTrans.g:2121:4: ( (lv_brack_1_0= '(' ) ) ( (lv_delimList_2_0= ruleDelimitedExprList ) ) otherlv_3= ')'
                    {
                    // InternalFortXTrans.g:2121:4: ( (lv_brack_1_0= '(' ) )
                    // InternalFortXTrans.g:2122:5: (lv_brack_1_0= '(' )
                    {
                    // InternalFortXTrans.g:2122:5: (lv_brack_1_0= '(' )
                    // InternalFortXTrans.g:2123:6: lv_brack_1_0= '('
                    {
                    lv_brack_1_0=(Token)match(input,24,FOLLOW_31); 

                    						newLeafNode(lv_brack_1_0, grammarAccess.getStmntAccess().getBrackLeftParenthesisKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStmntRule());
                    						}
                    						setWithLastConsumed(current, "brack", lv_brack_1_0, "(");
                    					

                    }


                    }

                    // InternalFortXTrans.g:2135:4: ( (lv_delimList_2_0= ruleDelimitedExprList ) )
                    // InternalFortXTrans.g:2136:5: (lv_delimList_2_0= ruleDelimitedExprList )
                    {
                    // InternalFortXTrans.g:2136:5: (lv_delimList_2_0= ruleDelimitedExprList )
                    // InternalFortXTrans.g:2137:6: lv_delimList_2_0= ruleDelimitedExprList
                    {

                    						newCompositeNode(grammarAccess.getStmntAccess().getDelimListDelimitedExprListParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_delimList_2_0=ruleDelimitedExprList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStmntRule());
                    						}
                    						set(
                    							current,
                    							"delimList",
                    							lv_delimList_2_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.DelimitedExprList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getStmntAccess().getRightParenthesisKeyword_1_2());
                    			

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
    // $ANTLR end "ruleStmnt"


    // $ANTLR start "entryRuleDelimitedExprList"
    // InternalFortXTrans.g:2163:1: entryRuleDelimitedExprList returns [EObject current=null] : iv_ruleDelimitedExprList= ruleDelimitedExprList EOF ;
    public final EObject entryRuleDelimitedExprList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelimitedExprList = null;


        try {
            // InternalFortXTrans.g:2163:58: (iv_ruleDelimitedExprList= ruleDelimitedExprList EOF )
            // InternalFortXTrans.g:2164:2: iv_ruleDelimitedExprList= ruleDelimitedExprList EOF
            {
             newCompositeNode(grammarAccess.getDelimitedExprListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelimitedExprList=ruleDelimitedExprList();

            state._fsp--;

             current =iv_ruleDelimitedExprList; 
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
    // $ANTLR end "entryRuleDelimitedExprList"


    // $ANTLR start "ruleDelimitedExprList"
    // InternalFortXTrans.g:2170:1: ruleDelimitedExprList returns [EObject current=null] : ( ( (lv_delim_0_0= ruleDelimitedExpr ) ) (otherlv_1= ',' ( (lv_delim_2_0= ruleDelimitedExpr ) ) )+ ) ;
    public final EObject ruleDelimitedExprList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_delim_0_0 = null;

        EObject lv_delim_2_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2176:2: ( ( ( (lv_delim_0_0= ruleDelimitedExpr ) ) (otherlv_1= ',' ( (lv_delim_2_0= ruleDelimitedExpr ) ) )+ ) )
            // InternalFortXTrans.g:2177:2: ( ( (lv_delim_0_0= ruleDelimitedExpr ) ) (otherlv_1= ',' ( (lv_delim_2_0= ruleDelimitedExpr ) ) )+ )
            {
            // InternalFortXTrans.g:2177:2: ( ( (lv_delim_0_0= ruleDelimitedExpr ) ) (otherlv_1= ',' ( (lv_delim_2_0= ruleDelimitedExpr ) ) )+ )
            // InternalFortXTrans.g:2178:3: ( (lv_delim_0_0= ruleDelimitedExpr ) ) (otherlv_1= ',' ( (lv_delim_2_0= ruleDelimitedExpr ) ) )+
            {
            // InternalFortXTrans.g:2178:3: ( (lv_delim_0_0= ruleDelimitedExpr ) )
            // InternalFortXTrans.g:2179:4: (lv_delim_0_0= ruleDelimitedExpr )
            {
            // InternalFortXTrans.g:2179:4: (lv_delim_0_0= ruleDelimitedExpr )
            // InternalFortXTrans.g:2180:5: lv_delim_0_0= ruleDelimitedExpr
            {

            					newCompositeNode(grammarAccess.getDelimitedExprListAccess().getDelimDelimitedExprParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_delim_0_0=ruleDelimitedExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDelimitedExprListRule());
            					}
            					add(
            						current,
            						"delim",
            						lv_delim_0_0,
            						"srf.transpiler.fortxtrans.FortXTrans.DelimitedExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFortXTrans.g:2197:3: (otherlv_1= ',' ( (lv_delim_2_0= ruleDelimitedExpr ) ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==19) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalFortXTrans.g:2198:4: otherlv_1= ',' ( (lv_delim_2_0= ruleDelimitedExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_31); 

            	    				newLeafNode(otherlv_1, grammarAccess.getDelimitedExprListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalFortXTrans.g:2202:4: ( (lv_delim_2_0= ruleDelimitedExpr ) )
            	    // InternalFortXTrans.g:2203:5: (lv_delim_2_0= ruleDelimitedExpr )
            	    {
            	    // InternalFortXTrans.g:2203:5: (lv_delim_2_0= ruleDelimitedExpr )
            	    // InternalFortXTrans.g:2204:6: lv_delim_2_0= ruleDelimitedExpr
            	    {

            	    						newCompositeNode(grammarAccess.getDelimitedExprListAccess().getDelimDelimitedExprParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_delim_2_0=ruleDelimitedExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDelimitedExprListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"delim",
            	    							lv_delim_2_0,
            	    							"srf.transpiler.fortxtrans.FortXTrans.DelimitedExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
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
    // $ANTLR end "ruleDelimitedExprList"


    // $ANTLR start "entryRuleExpr"
    // InternalFortXTrans.g:2226:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalFortXTrans.g:2226:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalFortXTrans.g:2227:2: iv_ruleExpr= ruleExpr EOF
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
    // InternalFortXTrans.g:2233:1: ruleExpr returns [EObject current=null] : ( ( (lv_front_0_0= ruleExprFront ) ) ( (lv_tail_1_0= ruleExprTail ) )* ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_front_0_0 = null;

        EObject lv_tail_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2239:2: ( ( ( (lv_front_0_0= ruleExprFront ) ) ( (lv_tail_1_0= ruleExprTail ) )* ) )
            // InternalFortXTrans.g:2240:2: ( ( (lv_front_0_0= ruleExprFront ) ) ( (lv_tail_1_0= ruleExprTail ) )* )
            {
            // InternalFortXTrans.g:2240:2: ( ( (lv_front_0_0= ruleExprFront ) ) ( (lv_tail_1_0= ruleExprTail ) )* )
            // InternalFortXTrans.g:2241:3: ( (lv_front_0_0= ruleExprFront ) ) ( (lv_tail_1_0= ruleExprTail ) )*
            {
            // InternalFortXTrans.g:2241:3: ( (lv_front_0_0= ruleExprFront ) )
            // InternalFortXTrans.g:2242:4: (lv_front_0_0= ruleExprFront )
            {
            // InternalFortXTrans.g:2242:4: (lv_front_0_0= ruleExprFront )
            // InternalFortXTrans.g:2243:5: lv_front_0_0= ruleExprFront
            {

            					newCompositeNode(grammarAccess.getExprAccess().getFrontExprFrontParserRuleCall_0_0());
            				
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

            // InternalFortXTrans.g:2260:3: ( (lv_tail_1_0= ruleExprTail ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==23) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalFortXTrans.g:2261:4: (lv_tail_1_0= ruleExprTail )
            	    {
            	    // InternalFortXTrans.g:2261:4: (lv_tail_1_0= ruleExprTail )
            	    // InternalFortXTrans.g:2262:5: lv_tail_1_0= ruleExprTail
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
            	    break loop41;
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
    // InternalFortXTrans.g:2283:1: entryRuleExprFront returns [EObject current=null] : iv_ruleExprFront= ruleExprFront EOF ;
    public final EObject entryRuleExprFront() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprFront = null;


        try {
            // InternalFortXTrans.g:2283:50: (iv_ruleExprFront= ruleExprFront EOF )
            // InternalFortXTrans.g:2284:2: iv_ruleExprFront= ruleExprFront EOF
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
    // InternalFortXTrans.g:2290:1: ruleExprFront returns [EObject current=null] : ( (lv_add_0_0= ruleCommaExpr ) ) ;
    public final EObject ruleExprFront() throws RecognitionException {
        EObject current = null;

        EObject lv_add_0_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2296:2: ( ( (lv_add_0_0= ruleCommaExpr ) ) )
            // InternalFortXTrans.g:2297:2: ( (lv_add_0_0= ruleCommaExpr ) )
            {
            // InternalFortXTrans.g:2297:2: ( (lv_add_0_0= ruleCommaExpr ) )
            // InternalFortXTrans.g:2298:3: (lv_add_0_0= ruleCommaExpr )
            {
            // InternalFortXTrans.g:2298:3: (lv_add_0_0= ruleCommaExpr )
            // InternalFortXTrans.g:2299:4: lv_add_0_0= ruleCommaExpr
            {

            				newCompositeNode(grammarAccess.getExprFrontAccess().getAddCommaExprParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_add_0_0=ruleCommaExpr();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getExprFrontRule());
            				}
            				set(
            					current,
            					"add",
            					lv_add_0_0,
            					"srf.transpiler.fortxtrans.FortXTrans.CommaExpr");
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
    // $ANTLR end "ruleExprFront"


    // $ANTLR start "entryRuleCommaExpr"
    // InternalFortXTrans.g:2319:1: entryRuleCommaExpr returns [EObject current=null] : iv_ruleCommaExpr= ruleCommaExpr EOF ;
    public final EObject entryRuleCommaExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommaExpr = null;


        try {
            // InternalFortXTrans.g:2319:50: (iv_ruleCommaExpr= ruleCommaExpr EOF )
            // InternalFortXTrans.g:2320:2: iv_ruleCommaExpr= ruleCommaExpr EOF
            {
             newCompositeNode(grammarAccess.getCommaExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommaExpr=ruleCommaExpr();

            state._fsp--;

             current =iv_ruleCommaExpr; 
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
    // $ANTLR end "entryRuleCommaExpr"


    // $ANTLR start "ruleCommaExpr"
    // InternalFortXTrans.g:2326:1: ruleCommaExpr returns [EObject current=null] : (this_AddExpr_0= ruleAddExpr ( () otherlv_2= ',' ( (lv_right_3_0= ruleAddExpr ) ) )* ) ;
    public final EObject ruleCommaExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AddExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2332:2: ( (this_AddExpr_0= ruleAddExpr ( () otherlv_2= ',' ( (lv_right_3_0= ruleAddExpr ) ) )* ) )
            // InternalFortXTrans.g:2333:2: (this_AddExpr_0= ruleAddExpr ( () otherlv_2= ',' ( (lv_right_3_0= ruleAddExpr ) ) )* )
            {
            // InternalFortXTrans.g:2333:2: (this_AddExpr_0= ruleAddExpr ( () otherlv_2= ',' ( (lv_right_3_0= ruleAddExpr ) ) )* )
            // InternalFortXTrans.g:2334:3: this_AddExpr_0= ruleAddExpr ( () otherlv_2= ',' ( (lv_right_3_0= ruleAddExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getCommaExprAccess().getAddExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_AddExpr_0=ruleAddExpr();

            state._fsp--;


            			current = this_AddExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFortXTrans.g:2342:3: ( () otherlv_2= ',' ( (lv_right_3_0= ruleAddExpr ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==19) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalFortXTrans.g:2343:4: () otherlv_2= ',' ( (lv_right_3_0= ruleAddExpr ) )
            	    {
            	    // InternalFortXTrans.g:2343:4: ()
            	    // InternalFortXTrans.g:2344:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCommaExprAccess().getCommaExprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_30); 

            	    				newLeafNode(otherlv_2, grammarAccess.getCommaExprAccess().getCommaKeyword_1_1());
            	    			
            	    // InternalFortXTrans.g:2354:4: ( (lv_right_3_0= ruleAddExpr ) )
            	    // InternalFortXTrans.g:2355:5: (lv_right_3_0= ruleAddExpr )
            	    {
            	    // InternalFortXTrans.g:2355:5: (lv_right_3_0= ruleAddExpr )
            	    // InternalFortXTrans.g:2356:6: lv_right_3_0= ruleAddExpr
            	    {

            	    						newCompositeNode(grammarAccess.getCommaExprAccess().getRightAddExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_right_3_0=ruleAddExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCommaExprRule());
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
    // $ANTLR end "ruleCommaExpr"


    // $ANTLR start "entryRuleAddExpr"
    // InternalFortXTrans.g:2378:1: entryRuleAddExpr returns [EObject current=null] : iv_ruleAddExpr= ruleAddExpr EOF ;
    public final EObject entryRuleAddExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpr = null;


        try {
            // InternalFortXTrans.g:2378:48: (iv_ruleAddExpr= ruleAddExpr EOF )
            // InternalFortXTrans.g:2379:2: iv_ruleAddExpr= ruleAddExpr EOF
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
    // InternalFortXTrans.g:2385:1: ruleAddExpr returns [EObject current=null] : (this_SubExpr_0= ruleSubExpr ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubExpr ) ) )* ) ;
    public final EObject ruleAddExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SubExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2391:2: ( (this_SubExpr_0= ruleSubExpr ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubExpr ) ) )* ) )
            // InternalFortXTrans.g:2392:2: (this_SubExpr_0= ruleSubExpr ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubExpr ) ) )* )
            {
            // InternalFortXTrans.g:2392:2: (this_SubExpr_0= ruleSubExpr ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubExpr ) ) )* )
            // InternalFortXTrans.g:2393:3: this_SubExpr_0= ruleSubExpr ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getAddExprAccess().getSubExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_SubExpr_0=ruleSubExpr();

            state._fsp--;


            			current = this_SubExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFortXTrans.g:2401:3: ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubExpr ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==32) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalFortXTrans.g:2402:4: () otherlv_2= '+' ( (lv_right_3_0= ruleSubExpr ) )
            	    {
            	    // InternalFortXTrans.g:2402:4: ()
            	    // InternalFortXTrans.g:2403:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAddExprAccess().getAddExprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_30); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAddExprAccess().getPlusSignKeyword_1_1());
            	    			
            	    // InternalFortXTrans.g:2413:4: ( (lv_right_3_0= ruleSubExpr ) )
            	    // InternalFortXTrans.g:2414:5: (lv_right_3_0= ruleSubExpr )
            	    {
            	    // InternalFortXTrans.g:2414:5: (lv_right_3_0= ruleSubExpr )
            	    // InternalFortXTrans.g:2415:6: lv_right_3_0= ruleSubExpr
            	    {

            	    						newCompositeNode(grammarAccess.getAddExprAccess().getRightSubExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
            	    break loop43;
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
    // InternalFortXTrans.g:2437:1: entryRuleSubExpr returns [EObject current=null] : iv_ruleSubExpr= ruleSubExpr EOF ;
    public final EObject entryRuleSubExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpr = null;


        try {
            // InternalFortXTrans.g:2437:48: (iv_ruleSubExpr= ruleSubExpr EOF )
            // InternalFortXTrans.g:2438:2: iv_ruleSubExpr= ruleSubExpr EOF
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
    // InternalFortXTrans.g:2444:1: ruleSubExpr returns [EObject current=null] : (this_DivExpr_0= ruleDivExpr ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivExpr ) ) )* ) ;
    public final EObject ruleSubExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_DivExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2450:2: ( (this_DivExpr_0= ruleDivExpr ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivExpr ) ) )* ) )
            // InternalFortXTrans.g:2451:2: (this_DivExpr_0= ruleDivExpr ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivExpr ) ) )* )
            {
            // InternalFortXTrans.g:2451:2: (this_DivExpr_0= ruleDivExpr ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivExpr ) ) )* )
            // InternalFortXTrans.g:2452:3: this_DivExpr_0= ruleDivExpr ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getSubExprAccess().getDivExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_DivExpr_0=ruleDivExpr();

            state._fsp--;


            			current = this_DivExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFortXTrans.g:2460:3: ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivExpr ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==33) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalFortXTrans.g:2461:4: () otherlv_2= '-' ( (lv_right_3_0= ruleDivExpr ) )
            	    {
            	    // InternalFortXTrans.g:2461:4: ()
            	    // InternalFortXTrans.g:2462:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSubExprAccess().getSubExprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_30); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSubExprAccess().getHyphenMinusKeyword_1_1());
            	    			
            	    // InternalFortXTrans.g:2472:4: ( (lv_right_3_0= ruleDivExpr ) )
            	    // InternalFortXTrans.g:2473:5: (lv_right_3_0= ruleDivExpr )
            	    {
            	    // InternalFortXTrans.g:2473:5: (lv_right_3_0= ruleDivExpr )
            	    // InternalFortXTrans.g:2474:6: lv_right_3_0= ruleDivExpr
            	    {

            	    						newCompositeNode(grammarAccess.getSubExprAccess().getRightDivExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
    // $ANTLR end "ruleSubExpr"


    // $ANTLR start "entryRuleDivExpr"
    // InternalFortXTrans.g:2496:1: entryRuleDivExpr returns [EObject current=null] : iv_ruleDivExpr= ruleDivExpr EOF ;
    public final EObject entryRuleDivExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpr = null;


        try {
            // InternalFortXTrans.g:2496:48: (iv_ruleDivExpr= ruleDivExpr EOF )
            // InternalFortXTrans.g:2497:2: iv_ruleDivExpr= ruleDivExpr EOF
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
    // InternalFortXTrans.g:2503:1: ruleDivExpr returns [EObject current=null] : (this_MultExpr_0= ruleMultExpr ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultExpr ) ) )* ) ;
    public final EObject ruleDivExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_MultExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2509:2: ( (this_MultExpr_0= ruleMultExpr ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultExpr ) ) )* ) )
            // InternalFortXTrans.g:2510:2: (this_MultExpr_0= ruleMultExpr ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultExpr ) ) )* )
            {
            // InternalFortXTrans.g:2510:2: (this_MultExpr_0= ruleMultExpr ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultExpr ) ) )* )
            // InternalFortXTrans.g:2511:3: this_MultExpr_0= ruleMultExpr ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getDivExprAccess().getMultExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_MultExpr_0=ruleMultExpr();

            state._fsp--;


            			current = this_MultExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFortXTrans.g:2519:3: ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultExpr ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==34) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalFortXTrans.g:2520:4: () otherlv_2= '/' ( (lv_right_3_0= ruleMultExpr ) )
            	    {
            	    // InternalFortXTrans.g:2520:4: ()
            	    // InternalFortXTrans.g:2521:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDivExprAccess().getDivExprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_30); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDivExprAccess().getSolidusKeyword_1_1());
            	    			
            	    // InternalFortXTrans.g:2531:4: ( (lv_right_3_0= ruleMultExpr ) )
            	    // InternalFortXTrans.g:2532:5: (lv_right_3_0= ruleMultExpr )
            	    {
            	    // InternalFortXTrans.g:2532:5: (lv_right_3_0= ruleMultExpr )
            	    // InternalFortXTrans.g:2533:6: lv_right_3_0= ruleMultExpr
            	    {

            	    						newCompositeNode(grammarAccess.getDivExprAccess().getRightMultExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_36);
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
    // $ANTLR end "ruleDivExpr"


    // $ANTLR start "entryRuleMultExpr"
    // InternalFortXTrans.g:2555:1: entryRuleMultExpr returns [EObject current=null] : iv_ruleMultExpr= ruleMultExpr EOF ;
    public final EObject entryRuleMultExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpr = null;


        try {
            // InternalFortXTrans.g:2555:49: (iv_ruleMultExpr= ruleMultExpr EOF )
            // InternalFortXTrans.g:2556:2: iv_ruleMultExpr= ruleMultExpr EOF
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
    // InternalFortXTrans.g:2562:1: ruleMultExpr returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2568:2: ( (this_Primary_0= rulePrimary ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalFortXTrans.g:2569:2: (this_Primary_0= rulePrimary ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalFortXTrans.g:2569:2: (this_Primary_0= rulePrimary ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalFortXTrans.g:2570:3: this_Primary_0= rulePrimary ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultExprAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFortXTrans.g:2578:3: ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==35) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalFortXTrans.g:2579:4: () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalFortXTrans.g:2579:4: ()
            	    // InternalFortXTrans.g:2580:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultExprAccess().getMultExprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,35,FOLLOW_30); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMultExprAccess().getAsteriskKeyword_1_1());
            	    			
            	    // InternalFortXTrans.g:2590:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalFortXTrans.g:2591:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalFortXTrans.g:2591:5: (lv_right_3_0= rulePrimary )
            	    // InternalFortXTrans.g:2592:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultExprAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultExprRule());
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
    // $ANTLR end "ruleMultExpr"


    // $ANTLR start "entryRulePrimary"
    // InternalFortXTrans.g:2614:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalFortXTrans.g:2614:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalFortXTrans.g:2615:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalFortXTrans.g:2621:1: rulePrimary returns [EObject current=null] : ( (this_Qualified_0= ruleQualified ( () otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) ) )? ( () otherlv_5= '(' ( (lv_fargs_6_0= ruleExpr ) ) otherlv_7= ')' )? ) | this_LiteralTuple_8= ruleLiteralTuple | (otherlv_9= '(' ( (lv_exp_10_0= ruleExpr ) ) otherlv_11= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_Qualified_0 = null;

        EObject lv_exp_3_0 = null;

        EObject lv_fargs_6_0 = null;

        EObject this_LiteralTuple_8 = null;

        EObject lv_exp_10_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2627:2: ( ( (this_Qualified_0= ruleQualified ( () otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) ) )? ( () otherlv_5= '(' ( (lv_fargs_6_0= ruleExpr ) ) otherlv_7= ')' )? ) | this_LiteralTuple_8= ruleLiteralTuple | (otherlv_9= '(' ( (lv_exp_10_0= ruleExpr ) ) otherlv_11= ')' ) ) )
            // InternalFortXTrans.g:2628:2: ( (this_Qualified_0= ruleQualified ( () otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) ) )? ( () otherlv_5= '(' ( (lv_fargs_6_0= ruleExpr ) ) otherlv_7= ')' )? ) | this_LiteralTuple_8= ruleLiteralTuple | (otherlv_9= '(' ( (lv_exp_10_0= ruleExpr ) ) otherlv_11= ')' ) )
            {
            // InternalFortXTrans.g:2628:2: ( (this_Qualified_0= ruleQualified ( () otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) ) )? ( () otherlv_5= '(' ( (lv_fargs_6_0= ruleExpr ) ) otherlv_7= ')' )? ) | this_LiteralTuple_8= ruleLiteralTuple | (otherlv_9= '(' ( (lv_exp_10_0= ruleExpr ) ) otherlv_11= ')' ) )
            int alt49=3;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // InternalFortXTrans.g:2629:3: (this_Qualified_0= ruleQualified ( () otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) ) )? ( () otherlv_5= '(' ( (lv_fargs_6_0= ruleExpr ) ) otherlv_7= ')' )? )
                    {
                    // InternalFortXTrans.g:2629:3: (this_Qualified_0= ruleQualified ( () otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) ) )? ( () otherlv_5= '(' ( (lv_fargs_6_0= ruleExpr ) ) otherlv_7= ')' )? )
                    // InternalFortXTrans.g:2630:4: this_Qualified_0= ruleQualified ( () otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) ) )? ( () otherlv_5= '(' ( (lv_fargs_6_0= ruleExpr ) ) otherlv_7= ')' )?
                    {

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getQualifiedParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_38);
                    this_Qualified_0=ruleQualified();

                    state._fsp--;


                    				current = this_Qualified_0;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalFortXTrans.g:2638:4: ( () otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==36) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalFortXTrans.g:2639:5: () otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) )
                            {
                            // InternalFortXTrans.g:2639:5: ()
                            // InternalFortXTrans.g:2640:6: 
                            {

                            						current = forceCreateModelElementAndSet(
                            							grammarAccess.getPrimaryAccess().getPrimaryLeftAction_0_1_0(),
                            							current);
                            					

                            }

                            otherlv_2=(Token)match(input,36,FOLLOW_30); 

                            					newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getColonEqualsSignKeyword_0_1_1());
                            				
                            // InternalFortXTrans.g:2650:5: ( (lv_exp_3_0= ruleExpr ) )
                            // InternalFortXTrans.g:2651:6: (lv_exp_3_0= ruleExpr )
                            {
                            // InternalFortXTrans.g:2651:6: (lv_exp_3_0= ruleExpr )
                            // InternalFortXTrans.g:2652:7: lv_exp_3_0= ruleExpr
                            {

                            							newCompositeNode(grammarAccess.getPrimaryAccess().getExpExprParserRuleCall_0_1_2_0());
                            						
                            pushFollow(FOLLOW_39);
                            lv_exp_3_0=ruleExpr();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPrimaryRule());
                            							}
                            							set(
                            								current,
                            								"exp",
                            								lv_exp_3_0,
                            								"srf.transpiler.fortxtrans.FortXTrans.Expr");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:2670:4: ( () otherlv_5= '(' ( (lv_fargs_6_0= ruleExpr ) ) otherlv_7= ')' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==24) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalFortXTrans.g:2671:5: () otherlv_5= '(' ( (lv_fargs_6_0= ruleExpr ) ) otherlv_7= ')'
                            {
                            // InternalFortXTrans.g:2671:5: ()
                            // InternalFortXTrans.g:2672:6: 
                            {

                            						current = forceCreateModelElementAndSet(
                            							grammarAccess.getPrimaryAccess().getPrimaryFnameAction_0_2_0(),
                            							current);
                            					

                            }

                            otherlv_5=(Token)match(input,24,FOLLOW_30); 

                            					newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_2_1());
                            				
                            // InternalFortXTrans.g:2682:5: ( (lv_fargs_6_0= ruleExpr ) )
                            // InternalFortXTrans.g:2683:6: (lv_fargs_6_0= ruleExpr )
                            {
                            // InternalFortXTrans.g:2683:6: (lv_fargs_6_0= ruleExpr )
                            // InternalFortXTrans.g:2684:7: lv_fargs_6_0= ruleExpr
                            {

                            							newCompositeNode(grammarAccess.getPrimaryAccess().getFargsExprParserRuleCall_0_2_2_0());
                            						
                            pushFollow(FOLLOW_26);
                            lv_fargs_6_0=ruleExpr();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPrimaryRule());
                            							}
                            							set(
                            								current,
                            								"fargs",
                            								lv_fargs_6_0,
                            								"srf.transpiler.fortxtrans.FortXTrans.Expr");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_7=(Token)match(input,25,FOLLOW_2); 

                            					newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2_3());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:2708:3: this_LiteralTuple_8= ruleLiteralTuple
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLiteralTupleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralTuple_8=ruleLiteralTuple();

                    state._fsp--;


                    			current = this_LiteralTuple_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:2717:3: (otherlv_9= '(' ( (lv_exp_10_0= ruleExpr ) ) otherlv_11= ')' )
                    {
                    // InternalFortXTrans.g:2717:3: (otherlv_9= '(' ( (lv_exp_10_0= ruleExpr ) ) otherlv_11= ')' )
                    // InternalFortXTrans.g:2718:4: otherlv_9= '(' ( (lv_exp_10_0= ruleExpr ) ) otherlv_11= ')'
                    {
                    otherlv_9=(Token)match(input,24,FOLLOW_30); 

                    				newLeafNode(otherlv_9, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalFortXTrans.g:2722:4: ( (lv_exp_10_0= ruleExpr ) )
                    // InternalFortXTrans.g:2723:5: (lv_exp_10_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:2723:5: (lv_exp_10_0= ruleExpr )
                    // InternalFortXTrans.g:2724:6: lv_exp_10_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpExprParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_exp_10_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_10_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2());
                    			

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


    // $ANTLR start "entryRuleExprTail"
    // InternalFortXTrans.g:2750:1: entryRuleExprTail returns [EObject current=null] : iv_ruleExprTail= ruleExprTail EOF ;
    public final EObject entryRuleExprTail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprTail = null;


        try {
            // InternalFortXTrans.g:2750:49: (iv_ruleExprTail= ruleExprTail EOF )
            // InternalFortXTrans.g:2751:2: iv_ruleExprTail= ruleExprTail EOF
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
    // InternalFortXTrans.g:2757:1: ruleExprTail returns [EObject current=null] : (otherlv_0= 'as' ( (lv_type_1_0= ruleSimpleName ) ) ) ;
    public final EObject ruleExprTail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:2763:2: ( (otherlv_0= 'as' ( (lv_type_1_0= ruleSimpleName ) ) ) )
            // InternalFortXTrans.g:2764:2: (otherlv_0= 'as' ( (lv_type_1_0= ruleSimpleName ) ) )
            {
            // InternalFortXTrans.g:2764:2: (otherlv_0= 'as' ( (lv_type_1_0= ruleSimpleName ) ) )
            // InternalFortXTrans.g:2765:3: otherlv_0= 'as' ( (lv_type_1_0= ruleSimpleName ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExprTailAccess().getAsKeyword_0());
            		
            // InternalFortXTrans.g:2769:3: ( (lv_type_1_0= ruleSimpleName ) )
            // InternalFortXTrans.g:2770:4: (lv_type_1_0= ruleSimpleName )
            {
            // InternalFortXTrans.g:2770:4: (lv_type_1_0= ruleSimpleName )
            // InternalFortXTrans.g:2771:5: lv_type_1_0= ruleSimpleName
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
    // InternalFortXTrans.g:2792:1: entryRuleDelimitedExpr returns [EObject current=null] : iv_ruleDelimitedExpr= ruleDelimitedExpr EOF ;
    public final EObject entryRuleDelimitedExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelimitedExpr = null;


        try {
            // InternalFortXTrans.g:2792:54: (iv_ruleDelimitedExpr= ruleDelimitedExpr EOF )
            // InternalFortXTrans.g:2793:2: iv_ruleDelimitedExpr= ruleDelimitedExpr EOF
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
    // InternalFortXTrans.g:2799:1: ruleDelimitedExpr returns [EObject current=null] : ( ( (lv_dod_0_0= ruleDo ) ) | ( ( (lv_ret_1_0= 'return' ) ) ( (lv_block_2_0= ruleBlockElem ) ) ) | ( ( (lv_awhile_3_0= 'while' ) ) ( (lv_expr_4_0= ruleExpr ) ) ( (lv_whiledod_5_0= ruleDo ) ) ) | ( ( (lv_afor_6_0= 'for' ) ) ( (lv_gen_7_0= ruleGenerators ) ) ( (lv_dofront_8_0= ruleDoFront ) ) otherlv_9= 'end' ) | ( ( (lv_anif_10_0= 'if' ) ) ( (lv_cond_11_0= ruleExpr ) ) otherlv_12= 'then' ( (lv_blocks_13_0= ruleBlockElems ) ) ( (lv_elifs_14_0= ruleElifs ) )? ( (lv_els_15_0= ruleElse ) )? otherlv_16= 'end' ) ) ;
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
            // InternalFortXTrans.g:2805:2: ( ( ( (lv_dod_0_0= ruleDo ) ) | ( ( (lv_ret_1_0= 'return' ) ) ( (lv_block_2_0= ruleBlockElem ) ) ) | ( ( (lv_awhile_3_0= 'while' ) ) ( (lv_expr_4_0= ruleExpr ) ) ( (lv_whiledod_5_0= ruleDo ) ) ) | ( ( (lv_afor_6_0= 'for' ) ) ( (lv_gen_7_0= ruleGenerators ) ) ( (lv_dofront_8_0= ruleDoFront ) ) otherlv_9= 'end' ) | ( ( (lv_anif_10_0= 'if' ) ) ( (lv_cond_11_0= ruleExpr ) ) otherlv_12= 'then' ( (lv_blocks_13_0= ruleBlockElems ) ) ( (lv_elifs_14_0= ruleElifs ) )? ( (lv_els_15_0= ruleElse ) )? otherlv_16= 'end' ) ) )
            // InternalFortXTrans.g:2806:2: ( ( (lv_dod_0_0= ruleDo ) ) | ( ( (lv_ret_1_0= 'return' ) ) ( (lv_block_2_0= ruleBlockElem ) ) ) | ( ( (lv_awhile_3_0= 'while' ) ) ( (lv_expr_4_0= ruleExpr ) ) ( (lv_whiledod_5_0= ruleDo ) ) ) | ( ( (lv_afor_6_0= 'for' ) ) ( (lv_gen_7_0= ruleGenerators ) ) ( (lv_dofront_8_0= ruleDoFront ) ) otherlv_9= 'end' ) | ( ( (lv_anif_10_0= 'if' ) ) ( (lv_cond_11_0= ruleExpr ) ) otherlv_12= 'then' ( (lv_blocks_13_0= ruleBlockElems ) ) ( (lv_elifs_14_0= ruleElifs ) )? ( (lv_els_15_0= ruleElse ) )? otherlv_16= 'end' ) )
            {
            // InternalFortXTrans.g:2806:2: ( ( (lv_dod_0_0= ruleDo ) ) | ( ( (lv_ret_1_0= 'return' ) ) ( (lv_block_2_0= ruleBlockElem ) ) ) | ( ( (lv_awhile_3_0= 'while' ) ) ( (lv_expr_4_0= ruleExpr ) ) ( (lv_whiledod_5_0= ruleDo ) ) ) | ( ( (lv_afor_6_0= 'for' ) ) ( (lv_gen_7_0= ruleGenerators ) ) ( (lv_dofront_8_0= ruleDoFront ) ) otherlv_9= 'end' ) | ( ( (lv_anif_10_0= 'if' ) ) ( (lv_cond_11_0= ruleExpr ) ) otherlv_12= 'then' ( (lv_blocks_13_0= ruleBlockElems ) ) ( (lv_elifs_14_0= ruleElifs ) )? ( (lv_els_15_0= ruleElse ) )? otherlv_16= 'end' ) )
            int alt52=5;
            switch ( input.LA(1) ) {
            case 28:
            case 47:
            case 48:
                {
                alt52=1;
                }
                break;
            case 37:
                {
                alt52=2;
                }
                break;
            case 38:
                {
                alt52=3;
                }
                break;
            case 39:
                {
                alt52=4;
                }
                break;
            case 40:
                {
                alt52=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalFortXTrans.g:2807:3: ( (lv_dod_0_0= ruleDo ) )
                    {
                    // InternalFortXTrans.g:2807:3: ( (lv_dod_0_0= ruleDo ) )
                    // InternalFortXTrans.g:2808:4: (lv_dod_0_0= ruleDo )
                    {
                    // InternalFortXTrans.g:2808:4: (lv_dod_0_0= ruleDo )
                    // InternalFortXTrans.g:2809:5: lv_dod_0_0= ruleDo
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
                    // InternalFortXTrans.g:2827:3: ( ( (lv_ret_1_0= 'return' ) ) ( (lv_block_2_0= ruleBlockElem ) ) )
                    {
                    // InternalFortXTrans.g:2827:3: ( ( (lv_ret_1_0= 'return' ) ) ( (lv_block_2_0= ruleBlockElem ) ) )
                    // InternalFortXTrans.g:2828:4: ( (lv_ret_1_0= 'return' ) ) ( (lv_block_2_0= ruleBlockElem ) )
                    {
                    // InternalFortXTrans.g:2828:4: ( (lv_ret_1_0= 'return' ) )
                    // InternalFortXTrans.g:2829:5: (lv_ret_1_0= 'return' )
                    {
                    // InternalFortXTrans.g:2829:5: (lv_ret_1_0= 'return' )
                    // InternalFortXTrans.g:2830:6: lv_ret_1_0= 'return'
                    {
                    lv_ret_1_0=(Token)match(input,37,FOLLOW_30); 

                    						newLeafNode(lv_ret_1_0, grammarAccess.getDelimitedExprAccess().getRetReturnKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelimitedExprRule());
                    						}
                    						setWithLastConsumed(current, "ret", lv_ret_1_0, "return");
                    					

                    }


                    }

                    // InternalFortXTrans.g:2842:4: ( (lv_block_2_0= ruleBlockElem ) )
                    // InternalFortXTrans.g:2843:5: (lv_block_2_0= ruleBlockElem )
                    {
                    // InternalFortXTrans.g:2843:5: (lv_block_2_0= ruleBlockElem )
                    // InternalFortXTrans.g:2844:6: lv_block_2_0= ruleBlockElem
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getBlockBlockElemParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_block_2_0=ruleBlockElem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDelimitedExprRule());
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
                    break;
                case 3 :
                    // InternalFortXTrans.g:2863:3: ( ( (lv_awhile_3_0= 'while' ) ) ( (lv_expr_4_0= ruleExpr ) ) ( (lv_whiledod_5_0= ruleDo ) ) )
                    {
                    // InternalFortXTrans.g:2863:3: ( ( (lv_awhile_3_0= 'while' ) ) ( (lv_expr_4_0= ruleExpr ) ) ( (lv_whiledod_5_0= ruleDo ) ) )
                    // InternalFortXTrans.g:2864:4: ( (lv_awhile_3_0= 'while' ) ) ( (lv_expr_4_0= ruleExpr ) ) ( (lv_whiledod_5_0= ruleDo ) )
                    {
                    // InternalFortXTrans.g:2864:4: ( (lv_awhile_3_0= 'while' ) )
                    // InternalFortXTrans.g:2865:5: (lv_awhile_3_0= 'while' )
                    {
                    // InternalFortXTrans.g:2865:5: (lv_awhile_3_0= 'while' )
                    // InternalFortXTrans.g:2866:6: lv_awhile_3_0= 'while'
                    {
                    lv_awhile_3_0=(Token)match(input,38,FOLLOW_30); 

                    						newLeafNode(lv_awhile_3_0, grammarAccess.getDelimitedExprAccess().getAwhileWhileKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelimitedExprRule());
                    						}
                    						setWithLastConsumed(current, "awhile", lv_awhile_3_0, "while");
                    					

                    }


                    }

                    // InternalFortXTrans.g:2878:4: ( (lv_expr_4_0= ruleExpr ) )
                    // InternalFortXTrans.g:2879:5: (lv_expr_4_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:2879:5: (lv_expr_4_0= ruleExpr )
                    // InternalFortXTrans.g:2880:6: lv_expr_4_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getExprExprParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_40);
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

                    // InternalFortXTrans.g:2897:4: ( (lv_whiledod_5_0= ruleDo ) )
                    // InternalFortXTrans.g:2898:5: (lv_whiledod_5_0= ruleDo )
                    {
                    // InternalFortXTrans.g:2898:5: (lv_whiledod_5_0= ruleDo )
                    // InternalFortXTrans.g:2899:6: lv_whiledod_5_0= ruleDo
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
                    // InternalFortXTrans.g:2918:3: ( ( (lv_afor_6_0= 'for' ) ) ( (lv_gen_7_0= ruleGenerators ) ) ( (lv_dofront_8_0= ruleDoFront ) ) otherlv_9= 'end' )
                    {
                    // InternalFortXTrans.g:2918:3: ( ( (lv_afor_6_0= 'for' ) ) ( (lv_gen_7_0= ruleGenerators ) ) ( (lv_dofront_8_0= ruleDoFront ) ) otherlv_9= 'end' )
                    // InternalFortXTrans.g:2919:4: ( (lv_afor_6_0= 'for' ) ) ( (lv_gen_7_0= ruleGenerators ) ) ( (lv_dofront_8_0= ruleDoFront ) ) otherlv_9= 'end'
                    {
                    // InternalFortXTrans.g:2919:4: ( (lv_afor_6_0= 'for' ) )
                    // InternalFortXTrans.g:2920:5: (lv_afor_6_0= 'for' )
                    {
                    // InternalFortXTrans.g:2920:5: (lv_afor_6_0= 'for' )
                    // InternalFortXTrans.g:2921:6: lv_afor_6_0= 'for'
                    {
                    lv_afor_6_0=(Token)match(input,39,FOLLOW_41); 

                    						newLeafNode(lv_afor_6_0, grammarAccess.getDelimitedExprAccess().getAforForKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelimitedExprRule());
                    						}
                    						setWithLastConsumed(current, "afor", lv_afor_6_0, "for");
                    					

                    }


                    }

                    // InternalFortXTrans.g:2933:4: ( (lv_gen_7_0= ruleGenerators ) )
                    // InternalFortXTrans.g:2934:5: (lv_gen_7_0= ruleGenerators )
                    {
                    // InternalFortXTrans.g:2934:5: (lv_gen_7_0= ruleGenerators )
                    // InternalFortXTrans.g:2935:6: lv_gen_7_0= ruleGenerators
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getGenGeneratorsParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_40);
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

                    // InternalFortXTrans.g:2952:4: ( (lv_dofront_8_0= ruleDoFront ) )
                    // InternalFortXTrans.g:2953:5: (lv_dofront_8_0= ruleDoFront )
                    {
                    // InternalFortXTrans.g:2953:5: (lv_dofront_8_0= ruleDoFront )
                    // InternalFortXTrans.g:2954:6: lv_dofront_8_0= ruleDoFront
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getDofrontDoFrontParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_42);
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
                    // InternalFortXTrans.g:2977:3: ( ( (lv_anif_10_0= 'if' ) ) ( (lv_cond_11_0= ruleExpr ) ) otherlv_12= 'then' ( (lv_blocks_13_0= ruleBlockElems ) ) ( (lv_elifs_14_0= ruleElifs ) )? ( (lv_els_15_0= ruleElse ) )? otherlv_16= 'end' )
                    {
                    // InternalFortXTrans.g:2977:3: ( ( (lv_anif_10_0= 'if' ) ) ( (lv_cond_11_0= ruleExpr ) ) otherlv_12= 'then' ( (lv_blocks_13_0= ruleBlockElems ) ) ( (lv_elifs_14_0= ruleElifs ) )? ( (lv_els_15_0= ruleElse ) )? otherlv_16= 'end' )
                    // InternalFortXTrans.g:2978:4: ( (lv_anif_10_0= 'if' ) ) ( (lv_cond_11_0= ruleExpr ) ) otherlv_12= 'then' ( (lv_blocks_13_0= ruleBlockElems ) ) ( (lv_elifs_14_0= ruleElifs ) )? ( (lv_els_15_0= ruleElse ) )? otherlv_16= 'end'
                    {
                    // InternalFortXTrans.g:2978:4: ( (lv_anif_10_0= 'if' ) )
                    // InternalFortXTrans.g:2979:5: (lv_anif_10_0= 'if' )
                    {
                    // InternalFortXTrans.g:2979:5: (lv_anif_10_0= 'if' )
                    // InternalFortXTrans.g:2980:6: lv_anif_10_0= 'if'
                    {
                    lv_anif_10_0=(Token)match(input,40,FOLLOW_30); 

                    						newLeafNode(lv_anif_10_0, grammarAccess.getDelimitedExprAccess().getAnifIfKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelimitedExprRule());
                    						}
                    						setWithLastConsumed(current, "anif", lv_anif_10_0, "if");
                    					

                    }


                    }

                    // InternalFortXTrans.g:2992:4: ( (lv_cond_11_0= ruleExpr ) )
                    // InternalFortXTrans.g:2993:5: (lv_cond_11_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:2993:5: (lv_cond_11_0= ruleExpr )
                    // InternalFortXTrans.g:2994:6: lv_cond_11_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getCondExprParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_43);
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

                    otherlv_12=(Token)match(input,41,FOLLOW_30); 

                    				newLeafNode(otherlv_12, grammarAccess.getDelimitedExprAccess().getThenKeyword_4_2());
                    			
                    // InternalFortXTrans.g:3015:4: ( (lv_blocks_13_0= ruleBlockElems ) )
                    // InternalFortXTrans.g:3016:5: (lv_blocks_13_0= ruleBlockElems )
                    {
                    // InternalFortXTrans.g:3016:5: (lv_blocks_13_0= ruleBlockElems )
                    // InternalFortXTrans.g:3017:6: lv_blocks_13_0= ruleBlockElems
                    {

                    						newCompositeNode(grammarAccess.getDelimitedExprAccess().getBlocksBlockElemsParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_44);
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

                    // InternalFortXTrans.g:3034:4: ( (lv_elifs_14_0= ruleElifs ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==42) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalFortXTrans.g:3035:5: (lv_elifs_14_0= ruleElifs )
                            {
                            // InternalFortXTrans.g:3035:5: (lv_elifs_14_0= ruleElifs )
                            // InternalFortXTrans.g:3036:6: lv_elifs_14_0= ruleElifs
                            {

                            						newCompositeNode(grammarAccess.getDelimitedExprAccess().getElifsElifsParserRuleCall_4_4_0());
                            					
                            pushFollow(FOLLOW_45);
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

                    // InternalFortXTrans.g:3053:4: ( (lv_els_15_0= ruleElse ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==43) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalFortXTrans.g:3054:5: (lv_els_15_0= ruleElse )
                            {
                            // InternalFortXTrans.g:3054:5: (lv_els_15_0= ruleElse )
                            // InternalFortXTrans.g:3055:6: lv_els_15_0= ruleElse
                            {

                            						newCompositeNode(grammarAccess.getDelimitedExprAccess().getElsElseParserRuleCall_4_5_0());
                            					
                            pushFollow(FOLLOW_42);
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
    // InternalFortXTrans.g:3081:1: entryRuleElifs returns [EObject current=null] : iv_ruleElifs= ruleElifs EOF ;
    public final EObject entryRuleElifs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElifs = null;


        try {
            // InternalFortXTrans.g:3081:46: (iv_ruleElifs= ruleElifs EOF )
            // InternalFortXTrans.g:3082:2: iv_ruleElifs= ruleElifs EOF
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
    // InternalFortXTrans.g:3088:1: ruleElifs returns [EObject current=null] : ( ( (lv_e_0_0= ruleElif ) ) ( (lv_e_1_0= ruleElif ) )* ) ;
    public final EObject ruleElifs() throws RecognitionException {
        EObject current = null;

        EObject lv_e_0_0 = null;

        EObject lv_e_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3094:2: ( ( ( (lv_e_0_0= ruleElif ) ) ( (lv_e_1_0= ruleElif ) )* ) )
            // InternalFortXTrans.g:3095:2: ( ( (lv_e_0_0= ruleElif ) ) ( (lv_e_1_0= ruleElif ) )* )
            {
            // InternalFortXTrans.g:3095:2: ( ( (lv_e_0_0= ruleElif ) ) ( (lv_e_1_0= ruleElif ) )* )
            // InternalFortXTrans.g:3096:3: ( (lv_e_0_0= ruleElif ) ) ( (lv_e_1_0= ruleElif ) )*
            {
            // InternalFortXTrans.g:3096:3: ( (lv_e_0_0= ruleElif ) )
            // InternalFortXTrans.g:3097:4: (lv_e_0_0= ruleElif )
            {
            // InternalFortXTrans.g:3097:4: (lv_e_0_0= ruleElif )
            // InternalFortXTrans.g:3098:5: lv_e_0_0= ruleElif
            {

            					newCompositeNode(grammarAccess.getElifsAccess().getEElifParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_46);
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

            // InternalFortXTrans.g:3115:3: ( (lv_e_1_0= ruleElif ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==42) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalFortXTrans.g:3116:4: (lv_e_1_0= ruleElif )
            	    {
            	    // InternalFortXTrans.g:3116:4: (lv_e_1_0= ruleElif )
            	    // InternalFortXTrans.g:3117:5: lv_e_1_0= ruleElif
            	    {

            	    					newCompositeNode(grammarAccess.getElifsAccess().getEElifParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_46);
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
            	    break loop53;
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
    // InternalFortXTrans.g:3138:1: entryRuleElif returns [EObject current=null] : iv_ruleElif= ruleElif EOF ;
    public final EObject entryRuleElif() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElif = null;


        try {
            // InternalFortXTrans.g:3138:45: (iv_ruleElif= ruleElif EOF )
            // InternalFortXTrans.g:3139:2: iv_ruleElif= ruleElif EOF
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
    // InternalFortXTrans.g:3145:1: ruleElif returns [EObject current=null] : (otherlv_0= 'elif' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_block_3_0= ruleBlockElems ) ) ) ;
    public final EObject ruleElif() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;

        EObject lv_block_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3151:2: ( (otherlv_0= 'elif' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_block_3_0= ruleBlockElems ) ) ) )
            // InternalFortXTrans.g:3152:2: (otherlv_0= 'elif' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_block_3_0= ruleBlockElems ) ) )
            {
            // InternalFortXTrans.g:3152:2: (otherlv_0= 'elif' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_block_3_0= ruleBlockElems ) ) )
            // InternalFortXTrans.g:3153:3: otherlv_0= 'elif' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_block_3_0= ruleBlockElems ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getElifAccess().getElifKeyword_0());
            		
            // InternalFortXTrans.g:3157:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalFortXTrans.g:3158:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalFortXTrans.g:3158:4: (lv_expr_1_0= ruleExpr )
            // InternalFortXTrans.g:3159:5: lv_expr_1_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getElifAccess().getExprExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_43);
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

            otherlv_2=(Token)match(input,41,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getElifAccess().getThenKeyword_2());
            		
            // InternalFortXTrans.g:3180:3: ( (lv_block_3_0= ruleBlockElems ) )
            // InternalFortXTrans.g:3181:4: (lv_block_3_0= ruleBlockElems )
            {
            // InternalFortXTrans.g:3181:4: (lv_block_3_0= ruleBlockElems )
            // InternalFortXTrans.g:3182:5: lv_block_3_0= ruleBlockElems
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
    // InternalFortXTrans.g:3203:1: entryRuleElse returns [EObject current=null] : iv_ruleElse= ruleElse EOF ;
    public final EObject entryRuleElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElse = null;


        try {
            // InternalFortXTrans.g:3203:45: (iv_ruleElse= ruleElse EOF )
            // InternalFortXTrans.g:3204:2: iv_ruleElse= ruleElse EOF
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
    // InternalFortXTrans.g:3210:1: ruleElse returns [EObject current=null] : (otherlv_0= 'else' ( (lv_block_1_0= ruleBlockElems ) ) ) ;
    public final EObject ruleElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3216:2: ( (otherlv_0= 'else' ( (lv_block_1_0= ruleBlockElems ) ) ) )
            // InternalFortXTrans.g:3217:2: (otherlv_0= 'else' ( (lv_block_1_0= ruleBlockElems ) ) )
            {
            // InternalFortXTrans.g:3217:2: (otherlv_0= 'else' ( (lv_block_1_0= ruleBlockElems ) ) )
            // InternalFortXTrans.g:3218:3: otherlv_0= 'else' ( (lv_block_1_0= ruleBlockElems ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getElseAccess().getElseKeyword_0());
            		
            // InternalFortXTrans.g:3222:3: ( (lv_block_1_0= ruleBlockElems ) )
            // InternalFortXTrans.g:3223:4: (lv_block_1_0= ruleBlockElems )
            {
            // InternalFortXTrans.g:3223:4: (lv_block_1_0= ruleBlockElems )
            // InternalFortXTrans.g:3224:5: lv_block_1_0= ruleBlockElems
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
    // InternalFortXTrans.g:3245:1: entryRuleGenerators returns [EObject current=null] : iv_ruleGenerators= ruleGenerators EOF ;
    public final EObject entryRuleGenerators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerators = null;


        try {
            // InternalFortXTrans.g:3245:51: (iv_ruleGenerators= ruleGenerators EOF )
            // InternalFortXTrans.g:3246:2: iv_ruleGenerators= ruleGenerators EOF
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
    // InternalFortXTrans.g:3252:1: ruleGenerators returns [EObject current=null] : ( ( (lv_binding_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_clause_2_0= ruleGenClause ) ) )* ) ;
    public final EObject ruleGenerators() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_binding_0_0 = null;

        EObject lv_clause_2_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3258:2: ( ( ( (lv_binding_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_clause_2_0= ruleGenClause ) ) )* ) )
            // InternalFortXTrans.g:3259:2: ( ( (lv_binding_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_clause_2_0= ruleGenClause ) ) )* )
            {
            // InternalFortXTrans.g:3259:2: ( ( (lv_binding_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_clause_2_0= ruleGenClause ) ) )* )
            // InternalFortXTrans.g:3260:3: ( (lv_binding_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_clause_2_0= ruleGenClause ) ) )*
            {
            // InternalFortXTrans.g:3260:3: ( (lv_binding_0_0= ruleBinding ) )
            // InternalFortXTrans.g:3261:4: (lv_binding_0_0= ruleBinding )
            {
            // InternalFortXTrans.g:3261:4: (lv_binding_0_0= ruleBinding )
            // InternalFortXTrans.g:3262:5: lv_binding_0_0= ruleBinding
            {

            					newCompositeNode(grammarAccess.getGeneratorsAccess().getBindingBindingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalFortXTrans.g:3279:3: (otherlv_1= ',' ( (lv_clause_2_0= ruleGenClause ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==19) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalFortXTrans.g:3280:4: otherlv_1= ',' ( (lv_clause_2_0= ruleGenClause ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_30); 

            	    				newLeafNode(otherlv_1, grammarAccess.getGeneratorsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalFortXTrans.g:3284:4: ( (lv_clause_2_0= ruleGenClause ) )
            	    // InternalFortXTrans.g:3285:5: (lv_clause_2_0= ruleGenClause )
            	    {
            	    // InternalFortXTrans.g:3285:5: (lv_clause_2_0= ruleGenClause )
            	    // InternalFortXTrans.g:3286:6: lv_clause_2_0= ruleGenClause
            	    {

            	    						newCompositeNode(grammarAccess.getGeneratorsAccess().getClauseGenClauseParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
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
            	    break loop54;
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
    // InternalFortXTrans.g:3308:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalFortXTrans.g:3308:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalFortXTrans.g:3309:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalFortXTrans.g:3315:1: ruleBinding returns [EObject current=null] : ( ( ( (lv_idtup_0_0= ruleIdOrTuple ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleExpr ) ) ) | ( ( (lv_idtup_3_0= ruleIdOrTuple ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_expr_7_0= ruleExpr ) ) otherlv_8= ')' ) ) ;
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
            // InternalFortXTrans.g:3321:2: ( ( ( ( (lv_idtup_0_0= ruleIdOrTuple ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleExpr ) ) ) | ( ( (lv_idtup_3_0= ruleIdOrTuple ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_expr_7_0= ruleExpr ) ) otherlv_8= ')' ) ) )
            // InternalFortXTrans.g:3322:2: ( ( ( (lv_idtup_0_0= ruleIdOrTuple ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleExpr ) ) ) | ( ( (lv_idtup_3_0= ruleIdOrTuple ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_expr_7_0= ruleExpr ) ) otherlv_8= ')' ) )
            {
            // InternalFortXTrans.g:3322:2: ( ( ( (lv_idtup_0_0= ruleIdOrTuple ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleExpr ) ) ) | ( ( (lv_idtup_3_0= ruleIdOrTuple ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_expr_7_0= ruleExpr ) ) otherlv_8= ')' ) )
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // InternalFortXTrans.g:3323:3: ( ( (lv_idtup_0_0= ruleIdOrTuple ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleExpr ) ) )
                    {
                    // InternalFortXTrans.g:3323:3: ( ( (lv_idtup_0_0= ruleIdOrTuple ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleExpr ) ) )
                    // InternalFortXTrans.g:3324:4: ( (lv_idtup_0_0= ruleIdOrTuple ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleExpr ) )
                    {
                    // InternalFortXTrans.g:3324:4: ( (lv_idtup_0_0= ruleIdOrTuple ) )
                    // InternalFortXTrans.g:3325:5: (lv_idtup_0_0= ruleIdOrTuple )
                    {
                    // InternalFortXTrans.g:3325:5: (lv_idtup_0_0= ruleIdOrTuple )
                    // InternalFortXTrans.g:3326:6: lv_idtup_0_0= ruleIdOrTuple
                    {

                    						newCompositeNode(grammarAccess.getBindingAccess().getIdtupIdOrTupleParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_47);
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

                    otherlv_1=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getLessThanSignHyphenMinusKeyword_0_1());
                    			
                    // InternalFortXTrans.g:3347:4: ( (lv_expr_2_0= ruleExpr ) )
                    // InternalFortXTrans.g:3348:5: (lv_expr_2_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:3348:5: (lv_expr_2_0= ruleExpr )
                    // InternalFortXTrans.g:3349:6: lv_expr_2_0= ruleExpr
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
                    // InternalFortXTrans.g:3368:3: ( ( (lv_idtup_3_0= ruleIdOrTuple ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_expr_7_0= ruleExpr ) ) otherlv_8= ')' )
                    {
                    // InternalFortXTrans.g:3368:3: ( ( (lv_idtup_3_0= ruleIdOrTuple ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_expr_7_0= ruleExpr ) ) otherlv_8= ')' )
                    // InternalFortXTrans.g:3369:4: ( (lv_idtup_3_0= ruleIdOrTuple ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_expr_7_0= ruleExpr ) ) otherlv_8= ')'
                    {
                    // InternalFortXTrans.g:3369:4: ( (lv_idtup_3_0= ruleIdOrTuple ) )
                    // InternalFortXTrans.g:3370:5: (lv_idtup_3_0= ruleIdOrTuple )
                    {
                    // InternalFortXTrans.g:3370:5: (lv_idtup_3_0= ruleIdOrTuple )
                    // InternalFortXTrans.g:3371:6: lv_idtup_3_0= ruleIdOrTuple
                    {

                    						newCompositeNode(grammarAccess.getBindingAccess().getIdtupIdOrTupleParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_47);
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

                    otherlv_4=(Token)match(input,44,FOLLOW_48); 

                    				newLeafNode(otherlv_4, grammarAccess.getBindingAccess().getLessThanSignHyphenMinusKeyword_1_1());
                    			
                    // InternalFortXTrans.g:3392:4: ( (lv_seq_5_0= 'seq' ) )
                    // InternalFortXTrans.g:3393:5: (lv_seq_5_0= 'seq' )
                    {
                    // InternalFortXTrans.g:3393:5: (lv_seq_5_0= 'seq' )
                    // InternalFortXTrans.g:3394:6: lv_seq_5_0= 'seq'
                    {
                    lv_seq_5_0=(Token)match(input,45,FOLLOW_25); 

                    						newLeafNode(lv_seq_5_0, grammarAccess.getBindingAccess().getSeqSeqKeyword_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBindingRule());
                    						}
                    						setWithLastConsumed(current, "seq", lv_seq_5_0, "seq");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getBindingAccess().getLeftParenthesisKeyword_1_3());
                    			
                    // InternalFortXTrans.g:3410:4: ( (lv_expr_7_0= ruleExpr ) )
                    // InternalFortXTrans.g:3411:5: (lv_expr_7_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:3411:5: (lv_expr_7_0= ruleExpr )
                    // InternalFortXTrans.g:3412:6: lv_expr_7_0= ruleExpr
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


    // $ANTLR start "entryRuleGenClause"
    // InternalFortXTrans.g:3438:1: entryRuleGenClause returns [EObject current=null] : iv_ruleGenClause= ruleGenClause EOF ;
    public final EObject entryRuleGenClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenClause = null;


        try {
            // InternalFortXTrans.g:3438:50: (iv_ruleGenClause= ruleGenClause EOF )
            // InternalFortXTrans.g:3439:2: iv_ruleGenClause= ruleGenClause EOF
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
    // InternalFortXTrans.g:3445:1: ruleGenClause returns [EObject current=null] : ( ( (lv_binding_0_0= ruleBinding ) ) | ( (lv_expr_1_0= ruleExpr ) ) ) ;
    public final EObject ruleGenClause() throws RecognitionException {
        EObject current = null;

        EObject lv_binding_0_0 = null;

        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3451:2: ( ( ( (lv_binding_0_0= ruleBinding ) ) | ( (lv_expr_1_0= ruleExpr ) ) ) )
            // InternalFortXTrans.g:3452:2: ( ( (lv_binding_0_0= ruleBinding ) ) | ( (lv_expr_1_0= ruleExpr ) ) )
            {
            // InternalFortXTrans.g:3452:2: ( ( (lv_binding_0_0= ruleBinding ) ) | ( (lv_expr_1_0= ruleExpr ) ) )
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // InternalFortXTrans.g:3453:3: ( (lv_binding_0_0= ruleBinding ) )
                    {
                    // InternalFortXTrans.g:3453:3: ( (lv_binding_0_0= ruleBinding ) )
                    // InternalFortXTrans.g:3454:4: (lv_binding_0_0= ruleBinding )
                    {
                    // InternalFortXTrans.g:3454:4: (lv_binding_0_0= ruleBinding )
                    // InternalFortXTrans.g:3455:5: lv_binding_0_0= ruleBinding
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
                    // InternalFortXTrans.g:3473:3: ( (lv_expr_1_0= ruleExpr ) )
                    {
                    // InternalFortXTrans.g:3473:3: ( (lv_expr_1_0= ruleExpr ) )
                    // InternalFortXTrans.g:3474:4: (lv_expr_1_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:3474:4: (lv_expr_1_0= ruleExpr )
                    // InternalFortXTrans.g:3475:5: lv_expr_1_0= ruleExpr
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
    // InternalFortXTrans.g:3496:1: entryRuleBlockElems returns [EObject current=null] : iv_ruleBlockElems= ruleBlockElems EOF ;
    public final EObject entryRuleBlockElems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockElems = null;


        try {
            // InternalFortXTrans.g:3496:51: (iv_ruleBlockElems= ruleBlockElems EOF )
            // InternalFortXTrans.g:3497:2: iv_ruleBlockElems= ruleBlockElems EOF
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
    // InternalFortXTrans.g:3503:1: ruleBlockElems returns [EObject current=null] : ( ( (lv_block_0_0= ruleBlockElem ) ) ( (lv_block_1_0= ruleBlockElem ) )* ) ;
    public final EObject ruleBlockElems() throws RecognitionException {
        EObject current = null;

        EObject lv_block_0_0 = null;

        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3509:2: ( ( ( (lv_block_0_0= ruleBlockElem ) ) ( (lv_block_1_0= ruleBlockElem ) )* ) )
            // InternalFortXTrans.g:3510:2: ( ( (lv_block_0_0= ruleBlockElem ) ) ( (lv_block_1_0= ruleBlockElem ) )* )
            {
            // InternalFortXTrans.g:3510:2: ( ( (lv_block_0_0= ruleBlockElem ) ) ( (lv_block_1_0= ruleBlockElem ) )* )
            // InternalFortXTrans.g:3511:3: ( (lv_block_0_0= ruleBlockElem ) ) ( (lv_block_1_0= ruleBlockElem ) )*
            {
            // InternalFortXTrans.g:3511:3: ( (lv_block_0_0= ruleBlockElem ) )
            // InternalFortXTrans.g:3512:4: (lv_block_0_0= ruleBlockElem )
            {
            // InternalFortXTrans.g:3512:4: (lv_block_0_0= ruleBlockElem )
            // InternalFortXTrans.g:3513:5: lv_block_0_0= ruleBlockElem
            {

            					newCompositeNode(grammarAccess.getBlockElemsAccess().getBlockBlockElemParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_49);
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

            // InternalFortXTrans.g:3530:3: ( (lv_block_1_0= ruleBlockElem ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID||(LA57_0>=RULE_INT && LA57_0<=RULE_STRING)||LA57_0==24||LA57_0==28||(LA57_0>=37 && LA57_0<=40)||(LA57_0>=47 && LA57_0<=50)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalFortXTrans.g:3531:4: (lv_block_1_0= ruleBlockElem )
            	    {
            	    // InternalFortXTrans.g:3531:4: (lv_block_1_0= ruleBlockElem )
            	    // InternalFortXTrans.g:3532:5: lv_block_1_0= ruleBlockElem
            	    {

            	    					newCompositeNode(grammarAccess.getBlockElemsAccess().getBlockBlockElemParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_49);
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
            	    break loop57;
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
    // InternalFortXTrans.g:3553:1: entryRuleBlockElem returns [EObject current=null] : iv_ruleBlockElem= ruleBlockElem EOF ;
    public final EObject entryRuleBlockElem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockElem = null;


        try {
            // InternalFortXTrans.g:3553:50: (iv_ruleBlockElem= ruleBlockElem EOF )
            // InternalFortXTrans.g:3554:2: iv_ruleBlockElem= ruleBlockElem EOF
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
    // InternalFortXTrans.g:3560:1: ruleBlockElem returns [EObject current=null] : ( (lv_st_0_0= ruleStmnts ) ) ;
    public final EObject ruleBlockElem() throws RecognitionException {
        EObject current = null;

        EObject lv_st_0_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3566:2: ( ( (lv_st_0_0= ruleStmnts ) ) )
            // InternalFortXTrans.g:3567:2: ( (lv_st_0_0= ruleStmnts ) )
            {
            // InternalFortXTrans.g:3567:2: ( (lv_st_0_0= ruleStmnts ) )
            // InternalFortXTrans.g:3568:3: (lv_st_0_0= ruleStmnts )
            {
            // InternalFortXTrans.g:3568:3: (lv_st_0_0= ruleStmnts )
            // InternalFortXTrans.g:3569:4: lv_st_0_0= ruleStmnts
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
    // InternalFortXTrans.g:3589:1: entryRuleDo returns [EObject current=null] : iv_ruleDo= ruleDo EOF ;
    public final EObject entryRuleDo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDo = null;


        try {
            // InternalFortXTrans.g:3589:43: (iv_ruleDo= ruleDo EOF )
            // InternalFortXTrans.g:3590:2: iv_ruleDo= ruleDo EOF
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
    // InternalFortXTrans.g:3596:1: ruleDo returns [EObject current=null] : ( ( (lv_dofs_0_0= ruleDoFront ) ) (otherlv_1= 'also' ( (lv_dofs_2_0= ruleDoFront ) ) )* otherlv_3= 'end' ) ;
    public final EObject ruleDo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_dofs_0_0 = null;

        EObject lv_dofs_2_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3602:2: ( ( ( (lv_dofs_0_0= ruleDoFront ) ) (otherlv_1= 'also' ( (lv_dofs_2_0= ruleDoFront ) ) )* otherlv_3= 'end' ) )
            // InternalFortXTrans.g:3603:2: ( ( (lv_dofs_0_0= ruleDoFront ) ) (otherlv_1= 'also' ( (lv_dofs_2_0= ruleDoFront ) ) )* otherlv_3= 'end' )
            {
            // InternalFortXTrans.g:3603:2: ( ( (lv_dofs_0_0= ruleDoFront ) ) (otherlv_1= 'also' ( (lv_dofs_2_0= ruleDoFront ) ) )* otherlv_3= 'end' )
            // InternalFortXTrans.g:3604:3: ( (lv_dofs_0_0= ruleDoFront ) ) (otherlv_1= 'also' ( (lv_dofs_2_0= ruleDoFront ) ) )* otherlv_3= 'end'
            {
            // InternalFortXTrans.g:3604:3: ( (lv_dofs_0_0= ruleDoFront ) )
            // InternalFortXTrans.g:3605:4: (lv_dofs_0_0= ruleDoFront )
            {
            // InternalFortXTrans.g:3605:4: (lv_dofs_0_0= ruleDoFront )
            // InternalFortXTrans.g:3606:5: lv_dofs_0_0= ruleDoFront
            {

            					newCompositeNode(grammarAccess.getDoAccess().getDofsDoFrontParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_50);
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

            // InternalFortXTrans.g:3623:3: (otherlv_1= 'also' ( (lv_dofs_2_0= ruleDoFront ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==46) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalFortXTrans.g:3624:4: otherlv_1= 'also' ( (lv_dofs_2_0= ruleDoFront ) )
            	    {
            	    otherlv_1=(Token)match(input,46,FOLLOW_40); 

            	    				newLeafNode(otherlv_1, grammarAccess.getDoAccess().getAlsoKeyword_1_0());
            	    			
            	    // InternalFortXTrans.g:3628:4: ( (lv_dofs_2_0= ruleDoFront ) )
            	    // InternalFortXTrans.g:3629:5: (lv_dofs_2_0= ruleDoFront )
            	    {
            	    // InternalFortXTrans.g:3629:5: (lv_dofs_2_0= ruleDoFront )
            	    // InternalFortXTrans.g:3630:6: lv_dofs_2_0= ruleDoFront
            	    {

            	    						newCompositeNode(grammarAccess.getDoAccess().getDofsDoFrontParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_50);
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
            	    break loop58;
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
    // InternalFortXTrans.g:3656:1: entryRuleDoFront returns [EObject current=null] : iv_ruleDoFront= ruleDoFront EOF ;
    public final EObject entryRuleDoFront() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoFront = null;


        try {
            // InternalFortXTrans.g:3656:48: (iv_ruleDoFront= ruleDoFront EOF )
            // InternalFortXTrans.g:3657:2: iv_ruleDoFront= ruleDoFront EOF
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
    // InternalFortXTrans.g:3663:1: ruleDoFront returns [EObject current=null] : ( ( ( (lv_at_0_0= 'at' ) ) ( (lv_exp_1_0= ruleExpr ) ) )? ( (lv_atom_2_0= 'atomic' ) )? otherlv_3= 'do' ( (lv_block_4_0= ruleBlockElems ) ) ) ;
    public final EObject ruleDoFront() throws RecognitionException {
        EObject current = null;

        Token lv_at_0_0=null;
        Token lv_atom_2_0=null;
        Token otherlv_3=null;
        EObject lv_exp_1_0 = null;

        EObject lv_block_4_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3669:2: ( ( ( ( (lv_at_0_0= 'at' ) ) ( (lv_exp_1_0= ruleExpr ) ) )? ( (lv_atom_2_0= 'atomic' ) )? otherlv_3= 'do' ( (lv_block_4_0= ruleBlockElems ) ) ) )
            // InternalFortXTrans.g:3670:2: ( ( ( (lv_at_0_0= 'at' ) ) ( (lv_exp_1_0= ruleExpr ) ) )? ( (lv_atom_2_0= 'atomic' ) )? otherlv_3= 'do' ( (lv_block_4_0= ruleBlockElems ) ) )
            {
            // InternalFortXTrans.g:3670:2: ( ( ( (lv_at_0_0= 'at' ) ) ( (lv_exp_1_0= ruleExpr ) ) )? ( (lv_atom_2_0= 'atomic' ) )? otherlv_3= 'do' ( (lv_block_4_0= ruleBlockElems ) ) )
            // InternalFortXTrans.g:3671:3: ( ( (lv_at_0_0= 'at' ) ) ( (lv_exp_1_0= ruleExpr ) ) )? ( (lv_atom_2_0= 'atomic' ) )? otherlv_3= 'do' ( (lv_block_4_0= ruleBlockElems ) )
            {
            // InternalFortXTrans.g:3671:3: ( ( (lv_at_0_0= 'at' ) ) ( (lv_exp_1_0= ruleExpr ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==47) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalFortXTrans.g:3672:4: ( (lv_at_0_0= 'at' ) ) ( (lv_exp_1_0= ruleExpr ) )
                    {
                    // InternalFortXTrans.g:3672:4: ( (lv_at_0_0= 'at' ) )
                    // InternalFortXTrans.g:3673:5: (lv_at_0_0= 'at' )
                    {
                    // InternalFortXTrans.g:3673:5: (lv_at_0_0= 'at' )
                    // InternalFortXTrans.g:3674:6: lv_at_0_0= 'at'
                    {
                    lv_at_0_0=(Token)match(input,47,FOLLOW_30); 

                    						newLeafNode(lv_at_0_0, grammarAccess.getDoFrontAccess().getAtAtKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDoFrontRule());
                    						}
                    						setWithLastConsumed(current, "at", true, "at");
                    					

                    }


                    }

                    // InternalFortXTrans.g:3686:4: ( (lv_exp_1_0= ruleExpr ) )
                    // InternalFortXTrans.g:3687:5: (lv_exp_1_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:3687:5: (lv_exp_1_0= ruleExpr )
                    // InternalFortXTrans.g:3688:6: lv_exp_1_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getDoFrontAccess().getExpExprParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_51);
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

            // InternalFortXTrans.g:3706:3: ( (lv_atom_2_0= 'atomic' ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==28) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalFortXTrans.g:3707:4: (lv_atom_2_0= 'atomic' )
                    {
                    // InternalFortXTrans.g:3707:4: (lv_atom_2_0= 'atomic' )
                    // InternalFortXTrans.g:3708:5: lv_atom_2_0= 'atomic'
                    {
                    lv_atom_2_0=(Token)match(input,28,FOLLOW_52); 

                    					newLeafNode(lv_atom_2_0, grammarAccess.getDoFrontAccess().getAtomAtomicKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDoFrontRule());
                    					}
                    					setWithLastConsumed(current, "atom", true, "atomic");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,48,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getDoFrontAccess().getDoKeyword_2());
            		
            // InternalFortXTrans.g:3724:3: ( (lv_block_4_0= ruleBlockElems ) )
            // InternalFortXTrans.g:3725:4: (lv_block_4_0= ruleBlockElems )
            {
            // InternalFortXTrans.g:3725:4: (lv_block_4_0= ruleBlockElems )
            // InternalFortXTrans.g:3726:5: lv_block_4_0= ruleBlockElems
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
    // InternalFortXTrans.g:3747:1: entryRuleIdOrTuple returns [EObject current=null] : iv_ruleIdOrTuple= ruleIdOrTuple EOF ;
    public final EObject entryRuleIdOrTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdOrTuple = null;


        try {
            // InternalFortXTrans.g:3747:50: (iv_ruleIdOrTuple= ruleIdOrTuple EOF )
            // InternalFortXTrans.g:3748:2: iv_ruleIdOrTuple= ruleIdOrTuple EOF
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
    // InternalFortXTrans.g:3754:1: ruleIdOrTuple returns [EObject current=null] : ( ( (lv_bid_0_0= ruleBindId ) ) | (otherlv_1= '(' ( (lv_bid_2_0= ruleBindId ) ) (otherlv_3= ',' ( (lv_bid_4_0= ruleBindId ) ) )* otherlv_5= ')' ) ) ;
    public final EObject ruleIdOrTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_bid_0_0 = null;

        EObject lv_bid_2_0 = null;

        EObject lv_bid_4_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3760:2: ( ( ( (lv_bid_0_0= ruleBindId ) ) | (otherlv_1= '(' ( (lv_bid_2_0= ruleBindId ) ) (otherlv_3= ',' ( (lv_bid_4_0= ruleBindId ) ) )* otherlv_5= ')' ) ) )
            // InternalFortXTrans.g:3761:2: ( ( (lv_bid_0_0= ruleBindId ) ) | (otherlv_1= '(' ( (lv_bid_2_0= ruleBindId ) ) (otherlv_3= ',' ( (lv_bid_4_0= ruleBindId ) ) )* otherlv_5= ')' ) )
            {
            // InternalFortXTrans.g:3761:2: ( ( (lv_bid_0_0= ruleBindId ) ) | (otherlv_1= '(' ( (lv_bid_2_0= ruleBindId ) ) (otherlv_3= ',' ( (lv_bid_4_0= ruleBindId ) ) )* otherlv_5= ')' ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID||LA62_0==49) ) {
                alt62=1;
            }
            else if ( (LA62_0==24) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalFortXTrans.g:3762:3: ( (lv_bid_0_0= ruleBindId ) )
                    {
                    // InternalFortXTrans.g:3762:3: ( (lv_bid_0_0= ruleBindId ) )
                    // InternalFortXTrans.g:3763:4: (lv_bid_0_0= ruleBindId )
                    {
                    // InternalFortXTrans.g:3763:4: (lv_bid_0_0= ruleBindId )
                    // InternalFortXTrans.g:3764:5: lv_bid_0_0= ruleBindId
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
                    // InternalFortXTrans.g:3782:3: (otherlv_1= '(' ( (lv_bid_2_0= ruleBindId ) ) (otherlv_3= ',' ( (lv_bid_4_0= ruleBindId ) ) )* otherlv_5= ')' )
                    {
                    // InternalFortXTrans.g:3782:3: (otherlv_1= '(' ( (lv_bid_2_0= ruleBindId ) ) (otherlv_3= ',' ( (lv_bid_4_0= ruleBindId ) ) )* otherlv_5= ')' )
                    // InternalFortXTrans.g:3783:4: otherlv_1= '(' ( (lv_bid_2_0= ruleBindId ) ) (otherlv_3= ',' ( (lv_bid_4_0= ruleBindId ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getIdOrTupleAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalFortXTrans.g:3787:4: ( (lv_bid_2_0= ruleBindId ) )
                    // InternalFortXTrans.g:3788:5: (lv_bid_2_0= ruleBindId )
                    {
                    // InternalFortXTrans.g:3788:5: (lv_bid_2_0= ruleBindId )
                    // InternalFortXTrans.g:3789:6: lv_bid_2_0= ruleBindId
                    {

                    						newCompositeNode(grammarAccess.getIdOrTupleAccess().getBidBindIdParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    // InternalFortXTrans.g:3806:4: (otherlv_3= ',' ( (lv_bid_4_0= ruleBindId ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==19) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalFortXTrans.g:3807:5: otherlv_3= ',' ( (lv_bid_4_0= ruleBindId ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_23); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getIdOrTupleAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalFortXTrans.g:3811:5: ( (lv_bid_4_0= ruleBindId ) )
                    	    // InternalFortXTrans.g:3812:6: (lv_bid_4_0= ruleBindId )
                    	    {
                    	    // InternalFortXTrans.g:3812:6: (lv_bid_4_0= ruleBindId )
                    	    // InternalFortXTrans.g:3813:7: lv_bid_4_0= ruleBindId
                    	    {

                    	    							newCompositeNode(grammarAccess.getIdOrTupleAccess().getBidBindIdParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,25,FOLLOW_2); 

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
    // InternalFortXTrans.g:3840:1: entryRuleBindId returns [EObject current=null] : iv_ruleBindId= ruleBindId EOF ;
    public final EObject entryRuleBindId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindId = null;


        try {
            // InternalFortXTrans.g:3840:47: (iv_ruleBindId= ruleBindId EOF )
            // InternalFortXTrans.g:3841:2: iv_ruleBindId= ruleBindId EOF
            {
             newCompositeNode(grammarAccess.getBindIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBindId=ruleBindId();

            state._fsp--;

             current =iv_ruleBindId; 
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
    // InternalFortXTrans.g:3847:1: ruleBindId returns [EObject current=null] : ( ( (lv_s_0_0= ruleSimpleName ) ) | ( (lv_undsc_1_0= '_' ) ) ) ;
    public final EObject ruleBindId() throws RecognitionException {
        EObject current = null;

        Token lv_undsc_1_0=null;
        EObject lv_s_0_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3853:2: ( ( ( (lv_s_0_0= ruleSimpleName ) ) | ( (lv_undsc_1_0= '_' ) ) ) )
            // InternalFortXTrans.g:3854:2: ( ( (lv_s_0_0= ruleSimpleName ) ) | ( (lv_undsc_1_0= '_' ) ) )
            {
            // InternalFortXTrans.g:3854:2: ( ( (lv_s_0_0= ruleSimpleName ) ) | ( (lv_undsc_1_0= '_' ) ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID) ) {
                alt63=1;
            }
            else if ( (LA63_0==49) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalFortXTrans.g:3855:3: ( (lv_s_0_0= ruleSimpleName ) )
                    {
                    // InternalFortXTrans.g:3855:3: ( (lv_s_0_0= ruleSimpleName ) )
                    // InternalFortXTrans.g:3856:4: (lv_s_0_0= ruleSimpleName )
                    {
                    // InternalFortXTrans.g:3856:4: (lv_s_0_0= ruleSimpleName )
                    // InternalFortXTrans.g:3857:5: lv_s_0_0= ruleSimpleName
                    {

                    					newCompositeNode(grammarAccess.getBindIdAccess().getSSimpleNameParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_s_0_0=ruleSimpleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBindIdRule());
                    					}
                    					set(
                    						current,
                    						"s",
                    						lv_s_0_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.SimpleName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:3875:3: ( (lv_undsc_1_0= '_' ) )
                    {
                    // InternalFortXTrans.g:3875:3: ( (lv_undsc_1_0= '_' ) )
                    // InternalFortXTrans.g:3876:4: (lv_undsc_1_0= '_' )
                    {
                    // InternalFortXTrans.g:3876:4: (lv_undsc_1_0= '_' )
                    // InternalFortXTrans.g:3877:5: lv_undsc_1_0= '_'
                    {
                    lv_undsc_1_0=(Token)match(input,49,FOLLOW_2); 

                    					newLeafNode(lv_undsc_1_0, grammarAccess.getBindIdAccess().getUndsc_Keyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBindIdRule());
                    					}
                    					setWithLastConsumed(current, "undsc", lv_undsc_1_0, "_");
                    				

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
    // $ANTLR end "ruleBindId"


    // $ANTLR start "entryRuleIsType"
    // InternalFortXTrans.g:3893:1: entryRuleIsType returns [EObject current=null] : iv_ruleIsType= ruleIsType EOF ;
    public final EObject entryRuleIsType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsType = null;


        try {
            // InternalFortXTrans.g:3893:47: (iv_ruleIsType= ruleIsType EOF )
            // InternalFortXTrans.g:3894:2: iv_ruleIsType= ruleIsType EOF
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
    // InternalFortXTrans.g:3900:1: ruleIsType returns [EObject current=null] : (otherlv_0= ':' ( (lv_type_1_0= ruleSimpleName ) ) ) ;
    public final EObject ruleIsType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:3906:2: ( (otherlv_0= ':' ( (lv_type_1_0= ruleSimpleName ) ) ) )
            // InternalFortXTrans.g:3907:2: (otherlv_0= ':' ( (lv_type_1_0= ruleSimpleName ) ) )
            {
            // InternalFortXTrans.g:3907:2: (otherlv_0= ':' ( (lv_type_1_0= ruleSimpleName ) ) )
            // InternalFortXTrans.g:3908:3: otherlv_0= ':' ( (lv_type_1_0= ruleSimpleName ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIsTypeAccess().getColonKeyword_0());
            		
            // InternalFortXTrans.g:3912:3: ( (lv_type_1_0= ruleSimpleName ) )
            // InternalFortXTrans.g:3913:4: (lv_type_1_0= ruleSimpleName )
            {
            // InternalFortXTrans.g:3913:4: (lv_type_1_0= ruleSimpleName )
            // InternalFortXTrans.g:3914:5: lv_type_1_0= ruleSimpleName
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
    // InternalFortXTrans.g:3935:1: entryRuleFieldDecl returns [EObject current=null] : iv_ruleFieldDecl= ruleFieldDecl EOF ;
    public final EObject entryRuleFieldDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDecl = null;


        try {
            // InternalFortXTrans.g:3935:50: (iv_ruleFieldDecl= ruleFieldDecl EOF )
            // InternalFortXTrans.g:3936:2: iv_ruleFieldDecl= ruleFieldDecl EOF
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
    // InternalFortXTrans.g:3942:1: ruleFieldDecl returns [EObject current=null] : ( ( ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) ( (lv_init_3_0= ruleInitVal ) ) ) | ( ( (lv_pri_4_0= 'private' ) )? ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) ) ) | ( ( (lv_pri_8_0= 'private' ) )? ( (lv_mut_9_0= 'var' ) )? ( (lv_idtup_10_0= ruleIdOrTuple ) ) otherlv_11= ':' ( (lv_type_12_0= ruleSimpleName ) ) this_DOTS_13= RULE_DOTS ( (lv_init_14_0= ruleInitVal ) ) ) | ( ( (lv_pri_15_0= 'private' ) )? ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( (lv_init_20_0= ruleInitVal ) ) ) ) ;
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
            // InternalFortXTrans.g:3948:2: ( ( ( ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) ( (lv_init_3_0= ruleInitVal ) ) ) | ( ( (lv_pri_4_0= 'private' ) )? ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) ) ) | ( ( (lv_pri_8_0= 'private' ) )? ( (lv_mut_9_0= 'var' ) )? ( (lv_idtup_10_0= ruleIdOrTuple ) ) otherlv_11= ':' ( (lv_type_12_0= ruleSimpleName ) ) this_DOTS_13= RULE_DOTS ( (lv_init_14_0= ruleInitVal ) ) ) | ( ( (lv_pri_15_0= 'private' ) )? ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( (lv_init_20_0= ruleInitVal ) ) ) ) )
            // InternalFortXTrans.g:3949:2: ( ( ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) ( (lv_init_3_0= ruleInitVal ) ) ) | ( ( (lv_pri_4_0= 'private' ) )? ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) ) ) | ( ( (lv_pri_8_0= 'private' ) )? ( (lv_mut_9_0= 'var' ) )? ( (lv_idtup_10_0= ruleIdOrTuple ) ) otherlv_11= ':' ( (lv_type_12_0= ruleSimpleName ) ) this_DOTS_13= RULE_DOTS ( (lv_init_14_0= ruleInitVal ) ) ) | ( ( (lv_pri_15_0= 'private' ) )? ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( (lv_init_20_0= ruleInitVal ) ) ) )
            {
            // InternalFortXTrans.g:3949:2: ( ( ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) ( (lv_init_3_0= ruleInitVal ) ) ) | ( ( (lv_pri_4_0= 'private' ) )? ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) ) ) | ( ( (lv_pri_8_0= 'private' ) )? ( (lv_mut_9_0= 'var' ) )? ( (lv_idtup_10_0= ruleIdOrTuple ) ) otherlv_11= ':' ( (lv_type_12_0= ruleSimpleName ) ) this_DOTS_13= RULE_DOTS ( (lv_init_14_0= ruleInitVal ) ) ) | ( ( (lv_pri_15_0= 'private' ) )? ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( (lv_init_20_0= ruleInitVal ) ) ) )
            int alt71=4;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // InternalFortXTrans.g:3950:3: ( ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) ( (lv_init_3_0= ruleInitVal ) ) )
                    {
                    // InternalFortXTrans.g:3950:3: ( ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) ( (lv_init_3_0= ruleInitVal ) ) )
                    // InternalFortXTrans.g:3951:4: ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) ( (lv_init_3_0= ruleInitVal ) )
                    {
                    // InternalFortXTrans.g:3951:4: ( (lv_pri_0_0= 'private' ) )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==26) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalFortXTrans.g:3952:5: (lv_pri_0_0= 'private' )
                            {
                            // InternalFortXTrans.g:3952:5: (lv_pri_0_0= 'private' )
                            // InternalFortXTrans.g:3953:6: lv_pri_0_0= 'private'
                            {
                            lv_pri_0_0=(Token)match(input,26,FOLLOW_53); 

                            						newLeafNode(lv_pri_0_0, grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFieldDeclRule());
                            						}
                            						setWithLastConsumed(current, "pri", lv_pri_0_0, "private");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:3965:4: ( (lv_mut_1_0= 'var' ) )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==50) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalFortXTrans.g:3966:5: (lv_mut_1_0= 'var' )
                            {
                            // InternalFortXTrans.g:3966:5: (lv_mut_1_0= 'var' )
                            // InternalFortXTrans.g:3967:6: lv_mut_1_0= 'var'
                            {
                            lv_mut_1_0=(Token)match(input,50,FOLLOW_53); 

                            						newLeafNode(lv_mut_1_0, grammarAccess.getFieldDeclAccess().getMutVarKeyword_0_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFieldDeclRule());
                            						}
                            						setWithLastConsumed(current, "mut", lv_mut_1_0, "var");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:3979:4: ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) )
                    // InternalFortXTrans.g:3980:5: (lv_vars_2_0= ruleNoNewlineVarWTypes )
                    {
                    // InternalFortXTrans.g:3980:5: (lv_vars_2_0= ruleNoNewlineVarWTypes )
                    // InternalFortXTrans.g:3981:6: lv_vars_2_0= ruleNoNewlineVarWTypes
                    {

                    						newCompositeNode(grammarAccess.getFieldDeclAccess().getVarsNoNewlineVarWTypesParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_54);
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

                    // InternalFortXTrans.g:3998:4: ( (lv_init_3_0= ruleInitVal ) )
                    // InternalFortXTrans.g:3999:5: (lv_init_3_0= ruleInitVal )
                    {
                    // InternalFortXTrans.g:3999:5: (lv_init_3_0= ruleInitVal )
                    // InternalFortXTrans.g:4000:6: lv_init_3_0= ruleInitVal
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
                    // InternalFortXTrans.g:4019:3: ( ( (lv_pri_4_0= 'private' ) )? ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) ) )
                    {
                    // InternalFortXTrans.g:4019:3: ( ( (lv_pri_4_0= 'private' ) )? ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) ) )
                    // InternalFortXTrans.g:4020:4: ( (lv_pri_4_0= 'private' ) )? ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) )
                    {
                    // InternalFortXTrans.g:4020:4: ( (lv_pri_4_0= 'private' ) )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==26) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalFortXTrans.g:4021:5: (lv_pri_4_0= 'private' )
                            {
                            // InternalFortXTrans.g:4021:5: (lv_pri_4_0= 'private' )
                            // InternalFortXTrans.g:4022:6: lv_pri_4_0= 'private'
                            {
                            lv_pri_4_0=(Token)match(input,26,FOLLOW_41); 

                            						newLeafNode(lv_pri_4_0, grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFieldDeclRule());
                            						}
                            						setWithLastConsumed(current, "pri", lv_pri_4_0, "private");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:4034:4: ( (lv_idtup_5_0= ruleIdOrTuple ) )
                    // InternalFortXTrans.g:4035:5: (lv_idtup_5_0= ruleIdOrTuple )
                    {
                    // InternalFortXTrans.g:4035:5: (lv_idtup_5_0= ruleIdOrTuple )
                    // InternalFortXTrans.g:4036:6: lv_idtup_5_0= ruleIdOrTuple
                    {

                    						newCompositeNode(grammarAccess.getFieldDeclAccess().getIdtupIdOrTupleParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_55);
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

                    otherlv_6=(Token)match(input,31,FOLLOW_56); 

                    				newLeafNode(otherlv_6, grammarAccess.getFieldDeclAccess().getEqualsSignKeyword_1_2());
                    			
                    // InternalFortXTrans.g:4057:4: ( (lv_litTup_7_0= ruleLiteralTuple ) )
                    // InternalFortXTrans.g:4058:5: (lv_litTup_7_0= ruleLiteralTuple )
                    {
                    // InternalFortXTrans.g:4058:5: (lv_litTup_7_0= ruleLiteralTuple )
                    // InternalFortXTrans.g:4059:6: lv_litTup_7_0= ruleLiteralTuple
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
                    // InternalFortXTrans.g:4078:3: ( ( (lv_pri_8_0= 'private' ) )? ( (lv_mut_9_0= 'var' ) )? ( (lv_idtup_10_0= ruleIdOrTuple ) ) otherlv_11= ':' ( (lv_type_12_0= ruleSimpleName ) ) this_DOTS_13= RULE_DOTS ( (lv_init_14_0= ruleInitVal ) ) )
                    {
                    // InternalFortXTrans.g:4078:3: ( ( (lv_pri_8_0= 'private' ) )? ( (lv_mut_9_0= 'var' ) )? ( (lv_idtup_10_0= ruleIdOrTuple ) ) otherlv_11= ':' ( (lv_type_12_0= ruleSimpleName ) ) this_DOTS_13= RULE_DOTS ( (lv_init_14_0= ruleInitVal ) ) )
                    // InternalFortXTrans.g:4079:4: ( (lv_pri_8_0= 'private' ) )? ( (lv_mut_9_0= 'var' ) )? ( (lv_idtup_10_0= ruleIdOrTuple ) ) otherlv_11= ':' ( (lv_type_12_0= ruleSimpleName ) ) this_DOTS_13= RULE_DOTS ( (lv_init_14_0= ruleInitVal ) )
                    {
                    // InternalFortXTrans.g:4079:4: ( (lv_pri_8_0= 'private' ) )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==26) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalFortXTrans.g:4080:5: (lv_pri_8_0= 'private' )
                            {
                            // InternalFortXTrans.g:4080:5: (lv_pri_8_0= 'private' )
                            // InternalFortXTrans.g:4081:6: lv_pri_8_0= 'private'
                            {
                            lv_pri_8_0=(Token)match(input,26,FOLLOW_53); 

                            						newLeafNode(lv_pri_8_0, grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_2_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFieldDeclRule());
                            						}
                            						setWithLastConsumed(current, "pri", lv_pri_8_0, "private");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:4093:4: ( (lv_mut_9_0= 'var' ) )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==50) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalFortXTrans.g:4094:5: (lv_mut_9_0= 'var' )
                            {
                            // InternalFortXTrans.g:4094:5: (lv_mut_9_0= 'var' )
                            // InternalFortXTrans.g:4095:6: lv_mut_9_0= 'var'
                            {
                            lv_mut_9_0=(Token)match(input,50,FOLLOW_41); 

                            						newLeafNode(lv_mut_9_0, grammarAccess.getFieldDeclAccess().getMutVarKeyword_2_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFieldDeclRule());
                            						}
                            						setWithLastConsumed(current, "mut", lv_mut_9_0, "var");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:4107:4: ( (lv_idtup_10_0= ruleIdOrTuple ) )
                    // InternalFortXTrans.g:4108:5: (lv_idtup_10_0= ruleIdOrTuple )
                    {
                    // InternalFortXTrans.g:4108:5: (lv_idtup_10_0= ruleIdOrTuple )
                    // InternalFortXTrans.g:4109:6: lv_idtup_10_0= ruleIdOrTuple
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

                    otherlv_11=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getFieldDeclAccess().getColonKeyword_2_3());
                    			
                    // InternalFortXTrans.g:4130:4: ( (lv_type_12_0= ruleSimpleName ) )
                    // InternalFortXTrans.g:4131:5: (lv_type_12_0= ruleSimpleName )
                    {
                    // InternalFortXTrans.g:4131:5: (lv_type_12_0= ruleSimpleName )
                    // InternalFortXTrans.g:4132:6: lv_type_12_0= ruleSimpleName
                    {

                    						newCompositeNode(grammarAccess.getFieldDeclAccess().getTypeSimpleNameParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_type_12_0=ruleSimpleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldDeclRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_12_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.SimpleName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_DOTS_13=(Token)match(input,RULE_DOTS,FOLLOW_54); 

                    				newLeafNode(this_DOTS_13, grammarAccess.getFieldDeclAccess().getDOTSTerminalRuleCall_2_5());
                    			
                    // InternalFortXTrans.g:4153:4: ( (lv_init_14_0= ruleInitVal ) )
                    // InternalFortXTrans.g:4154:5: (lv_init_14_0= ruleInitVal )
                    {
                    // InternalFortXTrans.g:4154:5: (lv_init_14_0= ruleInitVal )
                    // InternalFortXTrans.g:4155:6: lv_init_14_0= ruleInitVal
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
                    // InternalFortXTrans.g:4174:3: ( ( (lv_pri_15_0= 'private' ) )? ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( (lv_init_20_0= ruleInitVal ) ) )
                    {
                    // InternalFortXTrans.g:4174:3: ( ( (lv_pri_15_0= 'private' ) )? ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( (lv_init_20_0= ruleInitVal ) ) )
                    // InternalFortXTrans.g:4175:4: ( (lv_pri_15_0= 'private' ) )? ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( (lv_init_20_0= ruleInitVal ) )
                    {
                    // InternalFortXTrans.g:4175:4: ( (lv_pri_15_0= 'private' ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==26) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalFortXTrans.g:4176:5: (lv_pri_15_0= 'private' )
                            {
                            // InternalFortXTrans.g:4176:5: (lv_pri_15_0= 'private' )
                            // InternalFortXTrans.g:4177:6: lv_pri_15_0= 'private'
                            {
                            lv_pri_15_0=(Token)match(input,26,FOLLOW_53); 

                            						newLeafNode(lv_pri_15_0, grammarAccess.getFieldDeclAccess().getPriPrivateKeyword_3_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFieldDeclRule());
                            						}
                            						setWithLastConsumed(current, "pri", lv_pri_15_0, "private");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:4189:4: ( (lv_mut_16_0= 'var' ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==50) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalFortXTrans.g:4190:5: (lv_mut_16_0= 'var' )
                            {
                            // InternalFortXTrans.g:4190:5: (lv_mut_16_0= 'var' )
                            // InternalFortXTrans.g:4191:6: lv_mut_16_0= 'var'
                            {
                            lv_mut_16_0=(Token)match(input,50,FOLLOW_41); 

                            						newLeafNode(lv_mut_16_0, grammarAccess.getFieldDeclAccess().getMutVarKeyword_3_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFieldDeclRule());
                            						}
                            						setWithLastConsumed(current, "mut", lv_mut_16_0, "var");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:4203:4: ( (lv_idtup_17_0= ruleIdOrTuple ) )
                    // InternalFortXTrans.g:4204:5: (lv_idtup_17_0= ruleIdOrTuple )
                    {
                    // InternalFortXTrans.g:4204:5: (lv_idtup_17_0= ruleIdOrTuple )
                    // InternalFortXTrans.g:4205:6: lv_idtup_17_0= ruleIdOrTuple
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

                    otherlv_18=(Token)match(input,30,FOLLOW_25); 

                    				newLeafNode(otherlv_18, grammarAccess.getFieldDeclAccess().getColonKeyword_3_3());
                    			
                    // InternalFortXTrans.g:4226:4: ( (lv_tuptype_19_0= ruleTupleType ) )
                    // InternalFortXTrans.g:4227:5: (lv_tuptype_19_0= ruleTupleType )
                    {
                    // InternalFortXTrans.g:4227:5: (lv_tuptype_19_0= ruleTupleType )
                    // InternalFortXTrans.g:4228:6: lv_tuptype_19_0= ruleTupleType
                    {

                    						newCompositeNode(grammarAccess.getFieldDeclAccess().getTuptypeTupleTypeParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_54);
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

                    // InternalFortXTrans.g:4245:4: ( (lv_init_20_0= ruleInitVal ) )
                    // InternalFortXTrans.g:4246:5: (lv_init_20_0= ruleInitVal )
                    {
                    // InternalFortXTrans.g:4246:5: (lv_init_20_0= ruleInitVal )
                    // InternalFortXTrans.g:4247:6: lv_init_20_0= ruleInitVal
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
    // InternalFortXTrans.g:4269:1: entryRuleNoNewlineVarWTypes returns [EObject current=null] : iv_ruleNoNewlineVarWTypes= ruleNoNewlineVarWTypes EOF ;
    public final EObject entryRuleNoNewlineVarWTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoNewlineVarWTypes = null;


        try {
            // InternalFortXTrans.g:4269:59: (iv_ruleNoNewlineVarWTypes= ruleNoNewlineVarWTypes EOF )
            // InternalFortXTrans.g:4270:2: iv_ruleNoNewlineVarWTypes= ruleNoNewlineVarWTypes EOF
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
    // InternalFortXTrans.g:4276:1: ruleNoNewlineVarWTypes returns [EObject current=null] : ( ( (lv_single_0_0= ruleNoNewlineVarWType ) ) | (otherlv_1= '(' ( (lv_multiple_2_0= ruleNoNewlineVarWType ) ) (otherlv_3= ',' ( (lv_multiple_4_0= ruleNoNewlineVarWType ) ) )+ otherlv_5= ')' ) ) ;
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
            // InternalFortXTrans.g:4282:2: ( ( ( (lv_single_0_0= ruleNoNewlineVarWType ) ) | (otherlv_1= '(' ( (lv_multiple_2_0= ruleNoNewlineVarWType ) ) (otherlv_3= ',' ( (lv_multiple_4_0= ruleNoNewlineVarWType ) ) )+ otherlv_5= ')' ) ) )
            // InternalFortXTrans.g:4283:2: ( ( (lv_single_0_0= ruleNoNewlineVarWType ) ) | (otherlv_1= '(' ( (lv_multiple_2_0= ruleNoNewlineVarWType ) ) (otherlv_3= ',' ( (lv_multiple_4_0= ruleNoNewlineVarWType ) ) )+ otherlv_5= ')' ) )
            {
            // InternalFortXTrans.g:4283:2: ( ( (lv_single_0_0= ruleNoNewlineVarWType ) ) | (otherlv_1= '(' ( (lv_multiple_2_0= ruleNoNewlineVarWType ) ) (otherlv_3= ',' ( (lv_multiple_4_0= ruleNoNewlineVarWType ) ) )+ otherlv_5= ')' ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ID||LA73_0==49) ) {
                alt73=1;
            }
            else if ( (LA73_0==24) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalFortXTrans.g:4284:3: ( (lv_single_0_0= ruleNoNewlineVarWType ) )
                    {
                    // InternalFortXTrans.g:4284:3: ( (lv_single_0_0= ruleNoNewlineVarWType ) )
                    // InternalFortXTrans.g:4285:4: (lv_single_0_0= ruleNoNewlineVarWType )
                    {
                    // InternalFortXTrans.g:4285:4: (lv_single_0_0= ruleNoNewlineVarWType )
                    // InternalFortXTrans.g:4286:5: lv_single_0_0= ruleNoNewlineVarWType
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
                    // InternalFortXTrans.g:4304:3: (otherlv_1= '(' ( (lv_multiple_2_0= ruleNoNewlineVarWType ) ) (otherlv_3= ',' ( (lv_multiple_4_0= ruleNoNewlineVarWType ) ) )+ otherlv_5= ')' )
                    {
                    // InternalFortXTrans.g:4304:3: (otherlv_1= '(' ( (lv_multiple_2_0= ruleNoNewlineVarWType ) ) (otherlv_3= ',' ( (lv_multiple_4_0= ruleNoNewlineVarWType ) ) )+ otherlv_5= ')' )
                    // InternalFortXTrans.g:4305:4: otherlv_1= '(' ( (lv_multiple_2_0= ruleNoNewlineVarWType ) ) (otherlv_3= ',' ( (lv_multiple_4_0= ruleNoNewlineVarWType ) ) )+ otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getNoNewlineVarWTypesAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalFortXTrans.g:4309:4: ( (lv_multiple_2_0= ruleNoNewlineVarWType ) )
                    // InternalFortXTrans.g:4310:5: (lv_multiple_2_0= ruleNoNewlineVarWType )
                    {
                    // InternalFortXTrans.g:4310:5: (lv_multiple_2_0= ruleNoNewlineVarWType )
                    // InternalFortXTrans.g:4311:6: lv_multiple_2_0= ruleNoNewlineVarWType
                    {

                    						newCompositeNode(grammarAccess.getNoNewlineVarWTypesAccess().getMultipleNoNewlineVarWTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_32);
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

                    // InternalFortXTrans.g:4328:4: (otherlv_3= ',' ( (lv_multiple_4_0= ruleNoNewlineVarWType ) ) )+
                    int cnt72=0;
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==19) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalFortXTrans.g:4329:5: otherlv_3= ',' ( (lv_multiple_4_0= ruleNoNewlineVarWType ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_23); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getNoNewlineVarWTypesAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalFortXTrans.g:4333:5: ( (lv_multiple_4_0= ruleNoNewlineVarWType ) )
                    	    // InternalFortXTrans.g:4334:6: (lv_multiple_4_0= ruleNoNewlineVarWType )
                    	    {
                    	    // InternalFortXTrans.g:4334:6: (lv_multiple_4_0= ruleNoNewlineVarWType )
                    	    // InternalFortXTrans.g:4335:7: lv_multiple_4_0= ruleNoNewlineVarWType
                    	    {

                    	    							newCompositeNode(grammarAccess.getNoNewlineVarWTypesAccess().getMultipleNoNewlineVarWTypeParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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
                    	    if ( cnt72 >= 1 ) break loop72;
                                EarlyExitException eee =
                                    new EarlyExitException(72, input);
                                throw eee;
                        }
                        cnt72++;
                    } while (true);

                    otherlv_5=(Token)match(input,25,FOLLOW_2); 

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
    // InternalFortXTrans.g:4362:1: entryRuleNoNewlineVarWType returns [EObject current=null] : iv_ruleNoNewlineVarWType= ruleNoNewlineVarWType EOF ;
    public final EObject entryRuleNoNewlineVarWType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoNewlineVarWType = null;


        try {
            // InternalFortXTrans.g:4362:58: (iv_ruleNoNewlineVarWType= ruleNoNewlineVarWType EOF )
            // InternalFortXTrans.g:4363:2: iv_ruleNoNewlineVarWType= ruleNoNewlineVarWType EOF
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
    // InternalFortXTrans.g:4369:1: ruleNoNewlineVarWType returns [EObject current=null] : ( ( (lv_bid_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) ) ) ;
    public final EObject ruleNoNewlineVarWType() throws RecognitionException {
        EObject current = null;

        EObject lv_bid_0_0 = null;

        EObject lv_istype_1_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:4375:2: ( ( ( (lv_bid_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) ) ) )
            // InternalFortXTrans.g:4376:2: ( ( (lv_bid_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) ) )
            {
            // InternalFortXTrans.g:4376:2: ( ( (lv_bid_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) ) )
            // InternalFortXTrans.g:4377:3: ( (lv_bid_0_0= ruleBindId ) ) ( (lv_istype_1_0= ruleIsType ) )
            {
            // InternalFortXTrans.g:4377:3: ( (lv_bid_0_0= ruleBindId ) )
            // InternalFortXTrans.g:4378:4: (lv_bid_0_0= ruleBindId )
            {
            // InternalFortXTrans.g:4378:4: (lv_bid_0_0= ruleBindId )
            // InternalFortXTrans.g:4379:5: lv_bid_0_0= ruleBindId
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

            // InternalFortXTrans.g:4396:3: ( (lv_istype_1_0= ruleIsType ) )
            // InternalFortXTrans.g:4397:4: (lv_istype_1_0= ruleIsType )
            {
            // InternalFortXTrans.g:4397:4: (lv_istype_1_0= ruleIsType )
            // InternalFortXTrans.g:4398:5: lv_istype_1_0= ruleIsType
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
    // InternalFortXTrans.g:4419:1: entryRuleInitVal returns [EObject current=null] : iv_ruleInitVal= ruleInitVal EOF ;
    public final EObject entryRuleInitVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitVal = null;


        try {
            // InternalFortXTrans.g:4419:48: (iv_ruleInitVal= ruleInitVal EOF )
            // InternalFortXTrans.g:4420:2: iv_ruleInitVal= ruleInitVal EOF
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
    // InternalFortXTrans.g:4426:1: ruleInitVal returns [EObject current=null] : ( ( ( (lv_mut_0_0= ':=' ) ) ( (lv_lit_1_0= ruleLiteralTuple ) ) ) | ( ( (lv_immut_2_0= '=' ) ) ( (lv_lit_3_0= ruleLiteralTuple ) ) ) ) ;
    public final EObject ruleInitVal() throws RecognitionException {
        EObject current = null;

        Token lv_mut_0_0=null;
        Token lv_immut_2_0=null;
        EObject lv_lit_1_0 = null;

        EObject lv_lit_3_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:4432:2: ( ( ( ( (lv_mut_0_0= ':=' ) ) ( (lv_lit_1_0= ruleLiteralTuple ) ) ) | ( ( (lv_immut_2_0= '=' ) ) ( (lv_lit_3_0= ruleLiteralTuple ) ) ) ) )
            // InternalFortXTrans.g:4433:2: ( ( ( (lv_mut_0_0= ':=' ) ) ( (lv_lit_1_0= ruleLiteralTuple ) ) ) | ( ( (lv_immut_2_0= '=' ) ) ( (lv_lit_3_0= ruleLiteralTuple ) ) ) )
            {
            // InternalFortXTrans.g:4433:2: ( ( ( (lv_mut_0_0= ':=' ) ) ( (lv_lit_1_0= ruleLiteralTuple ) ) ) | ( ( (lv_immut_2_0= '=' ) ) ( (lv_lit_3_0= ruleLiteralTuple ) ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==36) ) {
                alt74=1;
            }
            else if ( (LA74_0==31) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalFortXTrans.g:4434:3: ( ( (lv_mut_0_0= ':=' ) ) ( (lv_lit_1_0= ruleLiteralTuple ) ) )
                    {
                    // InternalFortXTrans.g:4434:3: ( ( (lv_mut_0_0= ':=' ) ) ( (lv_lit_1_0= ruleLiteralTuple ) ) )
                    // InternalFortXTrans.g:4435:4: ( (lv_mut_0_0= ':=' ) ) ( (lv_lit_1_0= ruleLiteralTuple ) )
                    {
                    // InternalFortXTrans.g:4435:4: ( (lv_mut_0_0= ':=' ) )
                    // InternalFortXTrans.g:4436:5: (lv_mut_0_0= ':=' )
                    {
                    // InternalFortXTrans.g:4436:5: (lv_mut_0_0= ':=' )
                    // InternalFortXTrans.g:4437:6: lv_mut_0_0= ':='
                    {
                    lv_mut_0_0=(Token)match(input,36,FOLLOW_56); 

                    						newLeafNode(lv_mut_0_0, grammarAccess.getInitValAccess().getMutColonEqualsSignKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInitValRule());
                    						}
                    						setWithLastConsumed(current, "mut", lv_mut_0_0, ":=");
                    					

                    }


                    }

                    // InternalFortXTrans.g:4449:4: ( (lv_lit_1_0= ruleLiteralTuple ) )
                    // InternalFortXTrans.g:4450:5: (lv_lit_1_0= ruleLiteralTuple )
                    {
                    // InternalFortXTrans.g:4450:5: (lv_lit_1_0= ruleLiteralTuple )
                    // InternalFortXTrans.g:4451:6: lv_lit_1_0= ruleLiteralTuple
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
                    // InternalFortXTrans.g:4470:3: ( ( (lv_immut_2_0= '=' ) ) ( (lv_lit_3_0= ruleLiteralTuple ) ) )
                    {
                    // InternalFortXTrans.g:4470:3: ( ( (lv_immut_2_0= '=' ) ) ( (lv_lit_3_0= ruleLiteralTuple ) ) )
                    // InternalFortXTrans.g:4471:4: ( (lv_immut_2_0= '=' ) ) ( (lv_lit_3_0= ruleLiteralTuple ) )
                    {
                    // InternalFortXTrans.g:4471:4: ( (lv_immut_2_0= '=' ) )
                    // InternalFortXTrans.g:4472:5: (lv_immut_2_0= '=' )
                    {
                    // InternalFortXTrans.g:4472:5: (lv_immut_2_0= '=' )
                    // InternalFortXTrans.g:4473:6: lv_immut_2_0= '='
                    {
                    lv_immut_2_0=(Token)match(input,31,FOLLOW_56); 

                    						newLeafNode(lv_immut_2_0, grammarAccess.getInitValAccess().getImmutEqualsSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInitValRule());
                    						}
                    						setWithLastConsumed(current, "immut", lv_immut_2_0, "=");
                    					

                    }


                    }

                    // InternalFortXTrans.g:4485:4: ( (lv_lit_3_0= ruleLiteralTuple ) )
                    // InternalFortXTrans.g:4486:5: (lv_lit_3_0= ruleLiteralTuple )
                    {
                    // InternalFortXTrans.g:4486:5: (lv_lit_3_0= ruleLiteralTuple )
                    // InternalFortXTrans.g:4487:6: lv_lit_3_0= ruleLiteralTuple
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
    // InternalFortXTrans.g:4509:1: entryRuleLiteralTuple returns [EObject current=null] : iv_ruleLiteralTuple= ruleLiteralTuple EOF ;
    public final EObject entryRuleLiteralTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralTuple = null;


        try {
            // InternalFortXTrans.g:4509:53: (iv_ruleLiteralTuple= ruleLiteralTuple EOF )
            // InternalFortXTrans.g:4510:2: iv_ruleLiteralTuple= ruleLiteralTuple EOF
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
    // InternalFortXTrans.g:4516:1: ruleLiteralTuple returns [EObject current=null] : ( ( (lv_lit_0_0= ruleLiteralTup ) ) | ( (lv_qname_1_0= ruleQualifiedName ) ) | ( (lv_qlist_2_0= ruleQualifiedNameTuple ) ) ) ;
    public final EObject ruleLiteralTuple() throws RecognitionException {
        EObject current = null;

        EObject lv_lit_0_0 = null;

        EObject lv_qname_1_0 = null;

        EObject lv_qlist_2_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:4522:2: ( ( ( (lv_lit_0_0= ruleLiteralTup ) ) | ( (lv_qname_1_0= ruleQualifiedName ) ) | ( (lv_qlist_2_0= ruleQualifiedNameTuple ) ) ) )
            // InternalFortXTrans.g:4523:2: ( ( (lv_lit_0_0= ruleLiteralTup ) ) | ( (lv_qname_1_0= ruleQualifiedName ) ) | ( (lv_qlist_2_0= ruleQualifiedNameTuple ) ) )
            {
            // InternalFortXTrans.g:4523:2: ( ( (lv_lit_0_0= ruleLiteralTup ) ) | ( (lv_qname_1_0= ruleQualifiedName ) ) | ( (lv_qlist_2_0= ruleQualifiedNameTuple ) ) )
            int alt75=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_STRING:
                {
                alt75=1;
                }
                break;
            case 24:
                {
                int LA75_2 = input.LA(2);

                if ( (LA75_2==RULE_ID) ) {
                    alt75=3;
                }
                else if ( ((LA75_2>=RULE_INT && LA75_2<=RULE_STRING)) ) {
                    alt75=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt75=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalFortXTrans.g:4524:3: ( (lv_lit_0_0= ruleLiteralTup ) )
                    {
                    // InternalFortXTrans.g:4524:3: ( (lv_lit_0_0= ruleLiteralTup ) )
                    // InternalFortXTrans.g:4525:4: (lv_lit_0_0= ruleLiteralTup )
                    {
                    // InternalFortXTrans.g:4525:4: (lv_lit_0_0= ruleLiteralTup )
                    // InternalFortXTrans.g:4526:5: lv_lit_0_0= ruleLiteralTup
                    {

                    					newCompositeNode(grammarAccess.getLiteralTupleAccess().getLitLiteralTupParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_lit_0_0=ruleLiteralTup();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLiteralTupleRule());
                    					}
                    					set(
                    						current,
                    						"lit",
                    						lv_lit_0_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.LiteralTup");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:4544:3: ( (lv_qname_1_0= ruleQualifiedName ) )
                    {
                    // InternalFortXTrans.g:4544:3: ( (lv_qname_1_0= ruleQualifiedName ) )
                    // InternalFortXTrans.g:4545:4: (lv_qname_1_0= ruleQualifiedName )
                    {
                    // InternalFortXTrans.g:4545:4: (lv_qname_1_0= ruleQualifiedName )
                    // InternalFortXTrans.g:4546:5: lv_qname_1_0= ruleQualifiedName
                    {

                    					newCompositeNode(grammarAccess.getLiteralTupleAccess().getQnameQualifiedNameParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_qname_1_0=ruleQualifiedName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLiteralTupleRule());
                    					}
                    					set(
                    						current,
                    						"qname",
                    						lv_qname_1_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.QualifiedName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:4564:3: ( (lv_qlist_2_0= ruleQualifiedNameTuple ) )
                    {
                    // InternalFortXTrans.g:4564:3: ( (lv_qlist_2_0= ruleQualifiedNameTuple ) )
                    // InternalFortXTrans.g:4565:4: (lv_qlist_2_0= ruleQualifiedNameTuple )
                    {
                    // InternalFortXTrans.g:4565:4: (lv_qlist_2_0= ruleQualifiedNameTuple )
                    // InternalFortXTrans.g:4566:5: lv_qlist_2_0= ruleQualifiedNameTuple
                    {

                    					newCompositeNode(grammarAccess.getLiteralTupleAccess().getQlistQualifiedNameTupleParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_qlist_2_0=ruleQualifiedNameTuple();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLiteralTupleRule());
                    					}
                    					set(
                    						current,
                    						"qlist",
                    						lv_qlist_2_0,
                    						"srf.transpiler.fortxtrans.FortXTrans.QualifiedNameTuple");
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
    // $ANTLR end "ruleLiteralTuple"


    // $ANTLR start "entryRuleLiteralTup"
    // InternalFortXTrans.g:4587:1: entryRuleLiteralTup returns [EObject current=null] : iv_ruleLiteralTup= ruleLiteralTup EOF ;
    public final EObject entryRuleLiteralTup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralTup = null;


        try {
            // InternalFortXTrans.g:4587:51: (iv_ruleLiteralTup= ruleLiteralTup EOF )
            // InternalFortXTrans.g:4588:2: iv_ruleLiteralTup= ruleLiteralTup EOF
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
    // InternalFortXTrans.g:4594:1: ruleLiteralTup returns [EObject current=null] : ( ( (lv_lit_0_0= ruleLiteral ) ) | (otherlv_1= '(' ( (lv_lits_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_lits_4_0= ruleLiteral ) ) )+ otherlv_5= ')' ) ) ;
    public final EObject ruleLiteralTup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lit_0_0 = null;

        EObject lv_lits_2_0 = null;

        EObject lv_lits_4_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:4600:2: ( ( ( (lv_lit_0_0= ruleLiteral ) ) | (otherlv_1= '(' ( (lv_lits_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_lits_4_0= ruleLiteral ) ) )+ otherlv_5= ')' ) ) )
            // InternalFortXTrans.g:4601:2: ( ( (lv_lit_0_0= ruleLiteral ) ) | (otherlv_1= '(' ( (lv_lits_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_lits_4_0= ruleLiteral ) ) )+ otherlv_5= ')' ) )
            {
            // InternalFortXTrans.g:4601:2: ( ( (lv_lit_0_0= ruleLiteral ) ) | (otherlv_1= '(' ( (lv_lits_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_lits_4_0= ruleLiteral ) ) )+ otherlv_5= ')' ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=RULE_INT && LA77_0<=RULE_STRING)) ) {
                alt77=1;
            }
            else if ( (LA77_0==24) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalFortXTrans.g:4602:3: ( (lv_lit_0_0= ruleLiteral ) )
                    {
                    // InternalFortXTrans.g:4602:3: ( (lv_lit_0_0= ruleLiteral ) )
                    // InternalFortXTrans.g:4603:4: (lv_lit_0_0= ruleLiteral )
                    {
                    // InternalFortXTrans.g:4603:4: (lv_lit_0_0= ruleLiteral )
                    // InternalFortXTrans.g:4604:5: lv_lit_0_0= ruleLiteral
                    {

                    					newCompositeNode(grammarAccess.getLiteralTupAccess().getLitLiteralParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_lit_0_0=ruleLiteral();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLiteralTupRule());
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
                    // InternalFortXTrans.g:4622:3: (otherlv_1= '(' ( (lv_lits_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_lits_4_0= ruleLiteral ) ) )+ otherlv_5= ')' )
                    {
                    // InternalFortXTrans.g:4622:3: (otherlv_1= '(' ( (lv_lits_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_lits_4_0= ruleLiteral ) ) )+ otherlv_5= ')' )
                    // InternalFortXTrans.g:4623:4: otherlv_1= '(' ( (lv_lits_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_lits_4_0= ruleLiteral ) ) )+ otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_57); 

                    				newLeafNode(otherlv_1, grammarAccess.getLiteralTupAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalFortXTrans.g:4627:4: ( (lv_lits_2_0= ruleLiteral ) )
                    // InternalFortXTrans.g:4628:5: (lv_lits_2_0= ruleLiteral )
                    {
                    // InternalFortXTrans.g:4628:5: (lv_lits_2_0= ruleLiteral )
                    // InternalFortXTrans.g:4629:6: lv_lits_2_0= ruleLiteral
                    {

                    						newCompositeNode(grammarAccess.getLiteralTupAccess().getLitsLiteralParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_lits_2_0=ruleLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLiteralTupRule());
                    						}
                    						add(
                    							current,
                    							"lits",
                    							lv_lits_2_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.Literal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFortXTrans.g:4646:4: (otherlv_3= ',' ( (lv_lits_4_0= ruleLiteral ) ) )+
                    int cnt76=0;
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==19) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalFortXTrans.g:4647:5: otherlv_3= ',' ( (lv_lits_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_57); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getLiteralTupAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalFortXTrans.g:4651:5: ( (lv_lits_4_0= ruleLiteral ) )
                    	    // InternalFortXTrans.g:4652:6: (lv_lits_4_0= ruleLiteral )
                    	    {
                    	    // InternalFortXTrans.g:4652:6: (lv_lits_4_0= ruleLiteral )
                    	    // InternalFortXTrans.g:4653:7: lv_lits_4_0= ruleLiteral
                    	    {

                    	    							newCompositeNode(grammarAccess.getLiteralTupAccess().getLitsLiteralParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_lits_4_0=ruleLiteral();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLiteralTupRule());
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
                    	    if ( cnt76 >= 1 ) break loop76;
                                EarlyExitException eee =
                                    new EarlyExitException(76, input);
                                throw eee;
                        }
                        cnt76++;
                    } while (true);

                    otherlv_5=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getLiteralTupAccess().getRightParenthesisKeyword_1_3());
                    			

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


    // $ANTLR start "entryRuleLiteral"
    // InternalFortXTrans.g:4680:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalFortXTrans.g:4680:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalFortXTrans.g:4681:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalFortXTrans.g:4687:1: ruleLiteral returns [EObject current=null] : ( ( (lv_intg_0_0= RULE_INT ) ) | ( (lv_flot_1_0= RULE_FLOAT ) ) | ( (lv_str_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_intg_0_0=null;
        Token lv_flot_1_0=null;
        Token lv_str_2_0=null;


        	enterRule();

        try {
            // InternalFortXTrans.g:4693:2: ( ( ( (lv_intg_0_0= RULE_INT ) ) | ( (lv_flot_1_0= RULE_FLOAT ) ) | ( (lv_str_2_0= RULE_STRING ) ) ) )
            // InternalFortXTrans.g:4694:2: ( ( (lv_intg_0_0= RULE_INT ) ) | ( (lv_flot_1_0= RULE_FLOAT ) ) | ( (lv_str_2_0= RULE_STRING ) ) )
            {
            // InternalFortXTrans.g:4694:2: ( ( (lv_intg_0_0= RULE_INT ) ) | ( (lv_flot_1_0= RULE_FLOAT ) ) | ( (lv_str_2_0= RULE_STRING ) ) )
            int alt78=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt78=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt78=2;
                }
                break;
            case RULE_STRING:
                {
                alt78=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalFortXTrans.g:4695:3: ( (lv_intg_0_0= RULE_INT ) )
                    {
                    // InternalFortXTrans.g:4695:3: ( (lv_intg_0_0= RULE_INT ) )
                    // InternalFortXTrans.g:4696:4: (lv_intg_0_0= RULE_INT )
                    {
                    // InternalFortXTrans.g:4696:4: (lv_intg_0_0= RULE_INT )
                    // InternalFortXTrans.g:4697:5: lv_intg_0_0= RULE_INT
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
                    // InternalFortXTrans.g:4714:3: ( (lv_flot_1_0= RULE_FLOAT ) )
                    {
                    // InternalFortXTrans.g:4714:3: ( (lv_flot_1_0= RULE_FLOAT ) )
                    // InternalFortXTrans.g:4715:4: (lv_flot_1_0= RULE_FLOAT )
                    {
                    // InternalFortXTrans.g:4715:4: (lv_flot_1_0= RULE_FLOAT )
                    // InternalFortXTrans.g:4716:5: lv_flot_1_0= RULE_FLOAT
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
                    // InternalFortXTrans.g:4733:3: ( (lv_str_2_0= RULE_STRING ) )
                    {
                    // InternalFortXTrans.g:4733:3: ( (lv_str_2_0= RULE_STRING ) )
                    // InternalFortXTrans.g:4734:4: (lv_str_2_0= RULE_STRING )
                    {
                    // InternalFortXTrans.g:4734:4: (lv_str_2_0= RULE_STRING )
                    // InternalFortXTrans.g:4735:5: lv_str_2_0= RULE_STRING
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
    // InternalFortXTrans.g:4755:1: entryRuleLocalVarDecl returns [EObject current=null] : iv_ruleLocalVarDecl= ruleLocalVarDecl EOF ;
    public final EObject entryRuleLocalVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVarDecl = null;


        try {
            // InternalFortXTrans.g:4755:53: (iv_ruleLocalVarDecl= ruleLocalVarDecl EOF )
            // InternalFortXTrans.g:4756:2: iv_ruleLocalVarDecl= ruleLocalVarDecl EOF
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
    // InternalFortXTrans.g:4762:1: ruleLocalVarDecl returns [EObject current=null] : ( ( ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) otherlv_2= '=' ( (lv_init_3_0= ruleExpr ) ) ) | ( ( (lv_idtup_4_0= ruleIdOrTuple ) ) otherlv_5= '=' ( (lv_litTup_6_0= ruleLiteralTuple ) ) ) | ( ( (lv_mut_7_0= 'var' ) )? ( (lv_idtup_8_0= ruleIdOrTuple ) ) otherlv_9= ':' ( (lv_type_10_0= ruleSimpleName ) ) this_DOTS_11= RULE_DOTS otherlv_12= '=' ( (lv_init_13_0= ruleExpr ) ) ) | ( ( (lv_mut_14_0= 'var' ) )? ( (lv_idtup_15_0= ruleIdOrTuple ) ) otherlv_16= ':' ( (lv_tuptype_17_0= ruleTupleType ) ) otherlv_18= '=' ( (lv_init_19_0= ruleExpr ) ) ) ) ;
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

        EObject lv_litTup_6_0 = null;

        EObject lv_idtup_8_0 = null;

        EObject lv_type_10_0 = null;

        EObject lv_init_13_0 = null;

        EObject lv_idtup_15_0 = null;

        EObject lv_tuptype_17_0 = null;

        EObject lv_init_19_0 = null;



        	enterRule();

        try {
            // InternalFortXTrans.g:4768:2: ( ( ( ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) otherlv_2= '=' ( (lv_init_3_0= ruleExpr ) ) ) | ( ( (lv_idtup_4_0= ruleIdOrTuple ) ) otherlv_5= '=' ( (lv_litTup_6_0= ruleLiteralTuple ) ) ) | ( ( (lv_mut_7_0= 'var' ) )? ( (lv_idtup_8_0= ruleIdOrTuple ) ) otherlv_9= ':' ( (lv_type_10_0= ruleSimpleName ) ) this_DOTS_11= RULE_DOTS otherlv_12= '=' ( (lv_init_13_0= ruleExpr ) ) ) | ( ( (lv_mut_14_0= 'var' ) )? ( (lv_idtup_15_0= ruleIdOrTuple ) ) otherlv_16= ':' ( (lv_tuptype_17_0= ruleTupleType ) ) otherlv_18= '=' ( (lv_init_19_0= ruleExpr ) ) ) ) )
            // InternalFortXTrans.g:4769:2: ( ( ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) otherlv_2= '=' ( (lv_init_3_0= ruleExpr ) ) ) | ( ( (lv_idtup_4_0= ruleIdOrTuple ) ) otherlv_5= '=' ( (lv_litTup_6_0= ruleLiteralTuple ) ) ) | ( ( (lv_mut_7_0= 'var' ) )? ( (lv_idtup_8_0= ruleIdOrTuple ) ) otherlv_9= ':' ( (lv_type_10_0= ruleSimpleName ) ) this_DOTS_11= RULE_DOTS otherlv_12= '=' ( (lv_init_13_0= ruleExpr ) ) ) | ( ( (lv_mut_14_0= 'var' ) )? ( (lv_idtup_15_0= ruleIdOrTuple ) ) otherlv_16= ':' ( (lv_tuptype_17_0= ruleTupleType ) ) otherlv_18= '=' ( (lv_init_19_0= ruleExpr ) ) ) )
            {
            // InternalFortXTrans.g:4769:2: ( ( ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) otherlv_2= '=' ( (lv_init_3_0= ruleExpr ) ) ) | ( ( (lv_idtup_4_0= ruleIdOrTuple ) ) otherlv_5= '=' ( (lv_litTup_6_0= ruleLiteralTuple ) ) ) | ( ( (lv_mut_7_0= 'var' ) )? ( (lv_idtup_8_0= ruleIdOrTuple ) ) otherlv_9= ':' ( (lv_type_10_0= ruleSimpleName ) ) this_DOTS_11= RULE_DOTS otherlv_12= '=' ( (lv_init_13_0= ruleExpr ) ) ) | ( ( (lv_mut_14_0= 'var' ) )? ( (lv_idtup_15_0= ruleIdOrTuple ) ) otherlv_16= ':' ( (lv_tuptype_17_0= ruleTupleType ) ) otherlv_18= '=' ( (lv_init_19_0= ruleExpr ) ) ) )
            int alt82=4;
            alt82 = dfa82.predict(input);
            switch (alt82) {
                case 1 :
                    // InternalFortXTrans.g:4770:3: ( ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) otherlv_2= '=' ( (lv_init_3_0= ruleExpr ) ) )
                    {
                    // InternalFortXTrans.g:4770:3: ( ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) otherlv_2= '=' ( (lv_init_3_0= ruleExpr ) ) )
                    // InternalFortXTrans.g:4771:4: ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) otherlv_2= '=' ( (lv_init_3_0= ruleExpr ) )
                    {
                    // InternalFortXTrans.g:4771:4: ( (lv_mut_0_0= 'var' ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==50) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalFortXTrans.g:4772:5: (lv_mut_0_0= 'var' )
                            {
                            // InternalFortXTrans.g:4772:5: (lv_mut_0_0= 'var' )
                            // InternalFortXTrans.g:4773:6: lv_mut_0_0= 'var'
                            {
                            lv_mut_0_0=(Token)match(input,50,FOLLOW_53); 

                            						newLeafNode(lv_mut_0_0, grammarAccess.getLocalVarDeclAccess().getMutVarKeyword_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getLocalVarDeclRule());
                            						}
                            						setWithLastConsumed(current, "mut", lv_mut_0_0, "var");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:4785:4: ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) )
                    // InternalFortXTrans.g:4786:5: (lv_vars_1_0= ruleNoNewlineVarWTypes )
                    {
                    // InternalFortXTrans.g:4786:5: (lv_vars_1_0= ruleNoNewlineVarWTypes )
                    // InternalFortXTrans.g:4787:6: lv_vars_1_0= ruleNoNewlineVarWTypes
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getVarsNoNewlineVarWTypesParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_55);
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

                    otherlv_2=(Token)match(input,31,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getLocalVarDeclAccess().getEqualsSignKeyword_0_2());
                    			
                    // InternalFortXTrans.g:4808:4: ( (lv_init_3_0= ruleExpr ) )
                    // InternalFortXTrans.g:4809:5: (lv_init_3_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:4809:5: (lv_init_3_0= ruleExpr )
                    // InternalFortXTrans.g:4810:6: lv_init_3_0= ruleExpr
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
                    // InternalFortXTrans.g:4829:3: ( ( (lv_idtup_4_0= ruleIdOrTuple ) ) otherlv_5= '=' ( (lv_litTup_6_0= ruleLiteralTuple ) ) )
                    {
                    // InternalFortXTrans.g:4829:3: ( ( (lv_idtup_4_0= ruleIdOrTuple ) ) otherlv_5= '=' ( (lv_litTup_6_0= ruleLiteralTuple ) ) )
                    // InternalFortXTrans.g:4830:4: ( (lv_idtup_4_0= ruleIdOrTuple ) ) otherlv_5= '=' ( (lv_litTup_6_0= ruleLiteralTuple ) )
                    {
                    // InternalFortXTrans.g:4830:4: ( (lv_idtup_4_0= ruleIdOrTuple ) )
                    // InternalFortXTrans.g:4831:5: (lv_idtup_4_0= ruleIdOrTuple )
                    {
                    // InternalFortXTrans.g:4831:5: (lv_idtup_4_0= ruleIdOrTuple )
                    // InternalFortXTrans.g:4832:6: lv_idtup_4_0= ruleIdOrTuple
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getIdtupIdOrTupleParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_55);
                    lv_idtup_4_0=ruleIdOrTuple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"idtup",
                    							lv_idtup_4_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.IdOrTuple");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,31,FOLLOW_56); 

                    				newLeafNode(otherlv_5, grammarAccess.getLocalVarDeclAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalFortXTrans.g:4853:4: ( (lv_litTup_6_0= ruleLiteralTuple ) )
                    // InternalFortXTrans.g:4854:5: (lv_litTup_6_0= ruleLiteralTuple )
                    {
                    // InternalFortXTrans.g:4854:5: (lv_litTup_6_0= ruleLiteralTuple )
                    // InternalFortXTrans.g:4855:6: lv_litTup_6_0= ruleLiteralTuple
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getLitTupLiteralTupleParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_litTup_6_0=ruleLiteralTuple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"litTup",
                    							lv_litTup_6_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.LiteralTuple");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:4874:3: ( ( (lv_mut_7_0= 'var' ) )? ( (lv_idtup_8_0= ruleIdOrTuple ) ) otherlv_9= ':' ( (lv_type_10_0= ruleSimpleName ) ) this_DOTS_11= RULE_DOTS otherlv_12= '=' ( (lv_init_13_0= ruleExpr ) ) )
                    {
                    // InternalFortXTrans.g:4874:3: ( ( (lv_mut_7_0= 'var' ) )? ( (lv_idtup_8_0= ruleIdOrTuple ) ) otherlv_9= ':' ( (lv_type_10_0= ruleSimpleName ) ) this_DOTS_11= RULE_DOTS otherlv_12= '=' ( (lv_init_13_0= ruleExpr ) ) )
                    // InternalFortXTrans.g:4875:4: ( (lv_mut_7_0= 'var' ) )? ( (lv_idtup_8_0= ruleIdOrTuple ) ) otherlv_9= ':' ( (lv_type_10_0= ruleSimpleName ) ) this_DOTS_11= RULE_DOTS otherlv_12= '=' ( (lv_init_13_0= ruleExpr ) )
                    {
                    // InternalFortXTrans.g:4875:4: ( (lv_mut_7_0= 'var' ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==50) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalFortXTrans.g:4876:5: (lv_mut_7_0= 'var' )
                            {
                            // InternalFortXTrans.g:4876:5: (lv_mut_7_0= 'var' )
                            // InternalFortXTrans.g:4877:6: lv_mut_7_0= 'var'
                            {
                            lv_mut_7_0=(Token)match(input,50,FOLLOW_41); 

                            						newLeafNode(lv_mut_7_0, grammarAccess.getLocalVarDeclAccess().getMutVarKeyword_2_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getLocalVarDeclRule());
                            						}
                            						setWithLastConsumed(current, "mut", lv_mut_7_0, "var");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:4889:4: ( (lv_idtup_8_0= ruleIdOrTuple ) )
                    // InternalFortXTrans.g:4890:5: (lv_idtup_8_0= ruleIdOrTuple )
                    {
                    // InternalFortXTrans.g:4890:5: (lv_idtup_8_0= ruleIdOrTuple )
                    // InternalFortXTrans.g:4891:6: lv_idtup_8_0= ruleIdOrTuple
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getIdtupIdOrTupleParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_idtup_8_0=ruleIdOrTuple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"idtup",
                    							lv_idtup_8_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.IdOrTuple");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getLocalVarDeclAccess().getColonKeyword_2_2());
                    			
                    // InternalFortXTrans.g:4912:4: ( (lv_type_10_0= ruleSimpleName ) )
                    // InternalFortXTrans.g:4913:5: (lv_type_10_0= ruleSimpleName )
                    {
                    // InternalFortXTrans.g:4913:5: (lv_type_10_0= ruleSimpleName )
                    // InternalFortXTrans.g:4914:6: lv_type_10_0= ruleSimpleName
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

                    this_DOTS_11=(Token)match(input,RULE_DOTS,FOLLOW_55); 

                    				newLeafNode(this_DOTS_11, grammarAccess.getLocalVarDeclAccess().getDOTSTerminalRuleCall_2_4());
                    			
                    otherlv_12=(Token)match(input,31,FOLLOW_30); 

                    				newLeafNode(otherlv_12, grammarAccess.getLocalVarDeclAccess().getEqualsSignKeyword_2_5());
                    			
                    // InternalFortXTrans.g:4939:4: ( (lv_init_13_0= ruleExpr ) )
                    // InternalFortXTrans.g:4940:5: (lv_init_13_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:4940:5: (lv_init_13_0= ruleExpr )
                    // InternalFortXTrans.g:4941:6: lv_init_13_0= ruleExpr
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
                    // InternalFortXTrans.g:4960:3: ( ( (lv_mut_14_0= 'var' ) )? ( (lv_idtup_15_0= ruleIdOrTuple ) ) otherlv_16= ':' ( (lv_tuptype_17_0= ruleTupleType ) ) otherlv_18= '=' ( (lv_init_19_0= ruleExpr ) ) )
                    {
                    // InternalFortXTrans.g:4960:3: ( ( (lv_mut_14_0= 'var' ) )? ( (lv_idtup_15_0= ruleIdOrTuple ) ) otherlv_16= ':' ( (lv_tuptype_17_0= ruleTupleType ) ) otherlv_18= '=' ( (lv_init_19_0= ruleExpr ) ) )
                    // InternalFortXTrans.g:4961:4: ( (lv_mut_14_0= 'var' ) )? ( (lv_idtup_15_0= ruleIdOrTuple ) ) otherlv_16= ':' ( (lv_tuptype_17_0= ruleTupleType ) ) otherlv_18= '=' ( (lv_init_19_0= ruleExpr ) )
                    {
                    // InternalFortXTrans.g:4961:4: ( (lv_mut_14_0= 'var' ) )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==50) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalFortXTrans.g:4962:5: (lv_mut_14_0= 'var' )
                            {
                            // InternalFortXTrans.g:4962:5: (lv_mut_14_0= 'var' )
                            // InternalFortXTrans.g:4963:6: lv_mut_14_0= 'var'
                            {
                            lv_mut_14_0=(Token)match(input,50,FOLLOW_41); 

                            						newLeafNode(lv_mut_14_0, grammarAccess.getLocalVarDeclAccess().getMutVarKeyword_3_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getLocalVarDeclRule());
                            						}
                            						setWithLastConsumed(current, "mut", lv_mut_14_0, "var");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFortXTrans.g:4975:4: ( (lv_idtup_15_0= ruleIdOrTuple ) )
                    // InternalFortXTrans.g:4976:5: (lv_idtup_15_0= ruleIdOrTuple )
                    {
                    // InternalFortXTrans.g:4976:5: (lv_idtup_15_0= ruleIdOrTuple )
                    // InternalFortXTrans.g:4977:6: lv_idtup_15_0= ruleIdOrTuple
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getIdtupIdOrTupleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_idtup_15_0=ruleIdOrTuple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"idtup",
                    							lv_idtup_15_0,
                    							"srf.transpiler.fortxtrans.FortXTrans.IdOrTuple");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,30,FOLLOW_25); 

                    				newLeafNode(otherlv_16, grammarAccess.getLocalVarDeclAccess().getColonKeyword_3_2());
                    			
                    // InternalFortXTrans.g:4998:4: ( (lv_tuptype_17_0= ruleTupleType ) )
                    // InternalFortXTrans.g:4999:5: (lv_tuptype_17_0= ruleTupleType )
                    {
                    // InternalFortXTrans.g:4999:5: (lv_tuptype_17_0= ruleTupleType )
                    // InternalFortXTrans.g:5000:6: lv_tuptype_17_0= ruleTupleType
                    {

                    						newCompositeNode(grammarAccess.getLocalVarDeclAccess().getTuptypeTupleTypeParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_55);
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

                    otherlv_18=(Token)match(input,31,FOLLOW_30); 

                    				newLeafNode(otherlv_18, grammarAccess.getLocalVarDeclAccess().getEqualsSignKeyword_3_4());
                    			
                    // InternalFortXTrans.g:5021:4: ( (lv_init_19_0= ruleExpr ) )
                    // InternalFortXTrans.g:5022:5: (lv_init_19_0= ruleExpr )
                    {
                    // InternalFortXTrans.g:5022:5: (lv_init_19_0= ruleExpr )
                    // InternalFortXTrans.g:5023:6: lv_init_19_0= ruleExpr
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
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA82 dfa82 = new DFA82(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\uffff\2\4\3\uffff\1\4\1\uffff\1\4\2\uffff";
    static final String dfa_3s = "\1\4\1\5\1\16\1\4\1\uffff\1\22\1\5\1\4\1\16\2\uffff";
    static final String dfa_4s = "\1\4\2\27\1\22\1\uffff\1\22\1\27\1\5\1\27\2\uffff";
    static final String dfa_5s = "\4\uffff\1\3\4\uffff\1\1\1\2";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2\10\uffff\1\4\1\uffff\2\4\3\uffff\1\3\1\uffff\1\4",
            "\1\4\1\uffff\2\4\3\uffff\1\5\1\uffff\1\4",
            "\1\6\15\uffff\1\7",
            "",
            "\1\7",
            "\1\10\10\uffff\1\4\1\uffff\2\4\3\uffff\1\3\1\uffff\1\4",
            "\1\12\1\11",
            "\1\4\1\uffff\2\4\3\uffff\1\5\1\uffff\1\4",
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
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\1\1\11\uffff";
    static final String dfa_10s = "\1\4\11\uffff";
    static final String dfa_11s = "\1\62\11\uffff";
    static final String dfa_12s = "\1\uffff\1\2\10\1";
    static final String dfa_13s = "\12\uffff}>";
    static final String[] dfa_14s = {
            "\1\6\11\uffff\1\1\11\uffff\1\11\1\uffff\1\2\1\3\1\4\1\5\23\uffff\1\10\1\7",
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()+ loopback of 1382:2: ( (lv_decls_0_0= ruleDecl ) )+";
        }
    }
    static final String dfa_15s = "\4\uffff\1\5\3\uffff\1\5\1\uffff";
    static final String dfa_16s = "\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff\1\5\2\4\1\5";
    static final String dfa_17s = "\1\62\1\uffff\1\61\1\uffff\1\62\1\uffff\1\44\1\61\1\62\1\44";
    static final String dfa_18s = "\1\uffff\1\1\1\uffff\1\2\1\uffff\1\3\4\uffff";
    static final String[] dfa_19s = {
            "\1\4\1\uffff\3\5\17\uffff\1\2\3\uffff\1\1\10\uffff\4\1\6\uffff\2\1\2\3",
            "",
            "\1\6\1\uffff\3\5\17\uffff\1\5\3\uffff\1\1\10\uffff\4\1\6\uffff\2\1\1\3",
            "",
            "\5\5\5\uffff\1\5\4\uffff\1\5\1\uffff\1\5\1\uffff\7\5\2\3\11\5\1\uffff\2\5\2\uffff\5\5",
            "",
            "\1\5\15\uffff\1\7\1\uffff\1\5\1\uffff\2\5\1\10\4\uffff\1\3\1\uffff\5\5",
            "\1\11\1\uffff\3\5\17\uffff\1\5\30\uffff\1\3",
            "\1\5\1\uffff\3\5\5\uffff\1\5\4\uffff\1\5\3\uffff\7\5\2\3\11\5\1\uffff\2\5\2\uffff\5\5",
            "\1\5\15\uffff\1\7\1\uffff\1\5\1\uffff\2\5\1\10\6\uffff\5\5"
    };
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_8;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_13;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "2021:2: ( ( (lv_front_0_0= ruleStmnt ) ) | ( (lv_locVar_1_0= ruleLocalVarDecl ) ) | ( (lv_exp_2_0= ruleExpr ) ) )";
        }
    }
    static final String dfa_20s = "\31\uffff";
    static final String dfa_21s = "\1\4\1\uffff\1\4\1\uffff\1\5\1\uffff\4\23\1\4\1\uffff\2\4\2\5\3\23\1\4\2\23\1\uffff\1\5\1\23";
    static final String dfa_22s = "\1\30\1\uffff\1\30\1\uffff\1\44\1\uffff\3\43\1\44\1\30\1\uffff\1\4\1\30\2\44\3\43\1\4\2\44\1\uffff\2\44";
    static final String dfa_23s = "\1\uffff\1\1\1\uffff\1\2\1\uffff\1\3\5\uffff\1\1\12\uffff\1\2\2\uffff";
    static final String dfa_24s = "\31\uffff}>";
    static final String[] dfa_25s = {
            "\1\1\1\uffff\3\3\17\uffff\1\2",
            "",
            "\1\4\1\uffff\1\6\1\7\1\10\17\uffff\1\5",
            "",
            "\1\11\15\uffff\1\12\1\uffff\1\14\1\uffff\2\5\1\13\6\uffff\5\5",
            "",
            "\1\15\3\uffff\1\5\1\uffff\1\5\6\uffff\4\5",
            "\1\15\3\uffff\1\5\1\uffff\1\5\6\uffff\4\5",
            "\1\15\3\uffff\1\5\1\uffff\1\5\6\uffff\4\5",
            "\1\12\3\uffff\2\5\1\13\6\uffff\5\5",
            "\1\16\1\uffff\3\5\17\uffff\1\5",
            "",
            "\1\17",
            "\1\5\1\uffff\1\20\1\21\1\22\17\uffff\1\5",
            "\1\24\15\uffff\1\12\1\uffff\1\23\1\uffff\2\5\1\13\6\uffff\5\5",
            "\1\25\15\uffff\1\12\1\uffff\1\14\1\uffff\2\5\1\13\6\uffff\5\5",
            "\1\15\3\uffff\1\5\1\uffff\1\26\6\uffff\4\5",
            "\1\15\3\uffff\1\5\1\uffff\1\26\6\uffff\4\5",
            "\1\15\3\uffff\1\5\1\uffff\1\26\6\uffff\4\5",
            "\1\27",
            "\1\12\3\uffff\2\5\1\13\6\uffff\5\5",
            "\1\12\3\uffff\2\5\1\13\6\uffff\5\5",
            "",
            "\1\30\15\uffff\1\12\1\uffff\1\23\1\uffff\2\5\1\13\6\uffff\5\5",
            "\1\12\3\uffff\2\5\1\13\6\uffff\5\5"
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "2628:2: ( (this_Qualified_0= ruleQualified ( () otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) ) )? ( () otherlv_5= '(' ( (lv_fargs_6_0= ruleExpr ) ) otherlv_7= ')' )? ) | this_LiteralTuple_8= ruleLiteralTuple | (otherlv_9= '(' ( (lv_exp_10_0= ruleExpr ) ) otherlv_11= ')' ) )";
        }
    }
    static final String dfa_26s = "\15\uffff";
    static final String dfa_27s = "\1\4\2\54\2\4\2\23\2\uffff\1\4\1\54\2\23";
    static final String dfa_28s = "\1\61\2\54\1\61\1\55\2\31\2\uffff\1\61\1\54\2\31";
    static final String dfa_29s = "\7\uffff\1\2\1\1\4\uffff";
    static final String dfa_30s = "\15\uffff}>";
    static final String[] dfa_31s = {
            "\1\1\23\uffff\1\3\30\uffff\1\2",
            "\1\4",
            "\1\4",
            "\1\5\54\uffff\1\6",
            "\1\10\1\uffff\3\10\17\uffff\1\10\24\uffff\1\7",
            "\1\11\5\uffff\1\12",
            "\1\11\5\uffff\1\12",
            "",
            "",
            "\1\13\54\uffff\1\14",
            "\1\4",
            "\1\11\5\uffff\1\12",
            "\1\11\5\uffff\1\12"
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_26;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "3322:2: ( ( ( (lv_idtup_0_0= ruleIdOrTuple ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleExpr ) ) ) | ( ( (lv_idtup_3_0= ruleIdOrTuple ) ) otherlv_4= '<-' ( (lv_seq_5_0= 'seq' ) ) otherlv_6= '(' ( (lv_expr_7_0= ruleExpr ) ) otherlv_8= ')' ) )";
        }
    }
    static final String dfa_32s = "\11\uffff";
    static final String dfa_33s = "\1\uffff\1\4\5\uffff\1\4\1\uffff";
    static final String dfa_34s = "\1\4\1\5\1\uffff\1\4\1\uffff\1\5\1\4\1\23\1\5";
    static final String dfa_35s = "\1\61\1\60\1\uffff\1\61\1\uffff\1\44\1\61\1\60\1\44";
    static final String dfa_36s = "\2\uffff\1\1\1\uffff\1\2\4\uffff";
    static final String dfa_37s = "\11\uffff}>";
    static final String[] dfa_38s = {
            "\1\1\1\uffff\3\4\17\uffff\1\3\30\uffff\1\2",
            "\1\4\15\uffff\1\4\1\uffff\1\4\1\uffff\2\4\3\uffff\1\4\3\uffff\5\4\7\uffff\1\2\2\uffff\2\4",
            "",
            "\1\5\1\uffff\3\4\17\uffff\1\4\30\uffff\1\2",
            "",
            "\1\4\15\uffff\1\6\1\uffff\1\4\1\uffff\2\4\1\7\6\uffff\5\4",
            "\1\10\1\uffff\3\4\17\uffff\1\4\30\uffff\1\2",
            "\1\4\3\uffff\2\4\3\uffff\1\4\3\uffff\5\4\7\uffff\1\2\2\uffff\2\4",
            "\1\4\15\uffff\1\6\1\uffff\1\4\1\uffff\2\4\1\7\6\uffff\5\4"
    };

    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_32;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "3452:2: ( ( (lv_binding_0_0= ruleBinding ) ) | ( (lv_expr_1_0= ruleExpr ) ) )";
        }
    }
    static final String dfa_39s = "\34\uffff";
    static final String dfa_40s = "\3\4\2\36\1\4\2\36\2\4\1\uffff\4\23\1\uffff\1\5\1\4\1\36\1\uffff\1\4\1\36\1\uffff\2\23\1\4\2\23";
    static final String dfa_41s = "\2\62\1\61\2\37\1\61\2\36\1\61\1\30\1\uffff\4\36\1\uffff\1\44\1\61\1\37\1\uffff\1\61\1\36\1\uffff\2\31\1\30\2\31";
    static final String dfa_42s = "\12\uffff\1\2\4\uffff\1\4\3\uffff\1\1\2\uffff\1\3\5\uffff";
    static final String dfa_43s = "\34\uffff}>";
    static final String[] dfa_44s = {
            "\1\3\23\uffff\1\5\1\uffff\1\1\26\uffff\1\4\1\2",
            "\1\3\23\uffff\1\5\30\uffff\1\4\1\2",
            "\1\6\23\uffff\1\10\30\uffff\1\7",
            "\1\11\1\12",
            "\1\11\1\12",
            "\1\13\54\uffff\1\14",
            "\1\11",
            "\1\11",
            "\1\15\54\uffff\1\16",
            "\1\20\23\uffff\1\17",
            "",
            "\1\21\5\uffff\1\22\4\uffff\1\23",
            "\1\21\5\uffff\1\22\4\uffff\1\23",
            "\1\24\5\uffff\1\25\4\uffff\1\23",
            "\1\24\5\uffff\1\25\4\uffff\1\23",
            "",
            "\1\26\31\uffff\1\23\4\uffff\1\23",
            "\1\27\54\uffff\1\30",
            "\1\31\1\12",
            "",
            "\1\32\54\uffff\1\33",
            "\1\31",
            "",
            "\1\21\5\uffff\1\22",
            "\1\21\5\uffff\1\22",
            "\1\26\23\uffff\1\17",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25"
    };

    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[][] dfa_44 = unpackEncodedStringArray(dfa_44s);

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = dfa_39;
            this.eof = dfa_39;
            this.min = dfa_40;
            this.max = dfa_41;
            this.accept = dfa_42;
            this.special = dfa_43;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "3949:2: ( ( ( (lv_pri_0_0= 'private' ) )? ( (lv_mut_1_0= 'var' ) )? ( (lv_vars_2_0= ruleNoNewlineVarWTypes ) ) ( (lv_init_3_0= ruleInitVal ) ) ) | ( ( (lv_pri_4_0= 'private' ) )? ( (lv_idtup_5_0= ruleIdOrTuple ) ) otherlv_6= '=' ( (lv_litTup_7_0= ruleLiteralTuple ) ) ) | ( ( (lv_pri_8_0= 'private' ) )? ( (lv_mut_9_0= 'var' ) )? ( (lv_idtup_10_0= ruleIdOrTuple ) ) otherlv_11= ':' ( (lv_type_12_0= ruleSimpleName ) ) this_DOTS_13= RULE_DOTS ( (lv_init_14_0= ruleInitVal ) ) ) | ( ( (lv_pri_15_0= 'private' ) )? ( (lv_mut_16_0= 'var' ) )? ( (lv_idtup_17_0= ruleIdOrTuple ) ) otherlv_18= ':' ( (lv_tuptype_19_0= ruleTupleType ) ) ( (lv_init_20_0= ruleInitVal ) ) ) )";
        }
    }
    static final String dfa_45s = "\33\uffff";
    static final String dfa_46s = "\2\4\2\36\1\4\2\36\2\4\1\uffff\4\23\1\5\2\uffff\1\4\1\36\1\4\1\36\1\uffff\2\23\1\4\2\23";
    static final String dfa_47s = "\1\62\1\61\2\37\1\61\2\36\1\61\1\30\1\uffff\4\36\1\37\2\uffff\1\61\1\37\1\61\1\36\1\uffff\2\31\1\30\2\31";
    static final String dfa_48s = "\11\uffff\1\2\5\uffff\1\4\1\1\4\uffff\1\3\5\uffff";
    static final String dfa_49s = "\33\uffff}>";
    static final String[] dfa_50s = {
            "\1\2\23\uffff\1\4\30\uffff\1\3\1\1",
            "\1\5\23\uffff\1\7\30\uffff\1\6",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\12\54\uffff\1\13",
            "\1\10",
            "\1\10",
            "\1\14\54\uffff\1\15",
            "\1\16\23\uffff\1\17",
            "",
            "\1\21\5\uffff\1\22\4\uffff\1\20",
            "\1\21\5\uffff\1\22\4\uffff\1\20",
            "\1\23\5\uffff\1\24\4\uffff\1\20",
            "\1\23\5\uffff\1\24\4\uffff\1\20",
            "\1\25\31\uffff\1\20",
            "",
            "",
            "\1\26\54\uffff\1\27",
            "\1\30\1\11",
            "\1\31\54\uffff\1\32",
            "\1\30",
            "",
            "\1\21\5\uffff\1\22",
            "\1\21\5\uffff\1\22",
            "\1\25\23\uffff\1\17",
            "\1\23\5\uffff\1\24",
            "\1\23\5\uffff\1\24"
    };

    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[][] dfa_50 = unpackEncodedStringArray(dfa_50s);

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = dfa_45;
            this.eof = dfa_45;
            this.min = dfa_46;
            this.max = dfa_47;
            this.accept = dfa_48;
            this.special = dfa_49;
            this.transition = dfa_50;
        }
        public String getDescription() {
            return "4769:2: ( ( ( (lv_mut_0_0= 'var' ) )? ( (lv_vars_1_0= ruleNoNewlineVarWTypes ) ) otherlv_2= '=' ( (lv_init_3_0= ruleExpr ) ) ) | ( ( (lv_idtup_4_0= ruleIdOrTuple ) ) otherlv_5= '=' ( (lv_litTup_6_0= ruleLiteralTuple ) ) ) | ( ( (lv_mut_7_0= 'var' ) )? ( (lv_idtup_8_0= ruleIdOrTuple ) ) otherlv_9= ':' ( (lv_type_10_0= ruleSimpleName ) ) this_DOTS_11= RULE_DOTS otherlv_12= '=' ( (lv_init_13_0= ruleExpr ) ) ) | ( ( (lv_mut_14_0= 'var' ) )? ( (lv_idtup_15_0= ruleIdOrTuple ) ) otherlv_16= ':' ( (lv_tuptype_17_0= ruleTupleType ) ) otherlv_18= '=' ( (lv_init_19_0= ruleExpr ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000600003D034010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000600003D004010L});
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
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200022L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000600003D000012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0002000002000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000001000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000781E0150001D0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000181E010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001001000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001800010000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000005000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000C0000004000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000781E0150001D2L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000400000004000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0006000005000010L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000001080000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x00000000010001D0L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x00000000000001C0L});

}