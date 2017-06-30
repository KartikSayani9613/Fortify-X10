package srf.transpiler.fortxtrans.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFortXTransLexer extends Lexer {
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

    public InternalFortXTransLexer() {;} 
    public InternalFortXTransLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFortXTransLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalFortXTrans.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:11:7: ( 'component' )
            // InternalFortXTrans.g:11:9: 'component'
            {
            match("component"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:12:7: ( 'end' )
            // InternalFortXTrans.g:12:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:13:7: ( 'api' )
            // InternalFortXTrans.g:13:9: 'api'
            {
            match("api"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:14:7: ( 'import' )
            // InternalFortXTrans.g:14:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:15:7: ( 'export' )
            // InternalFortXTrans.g:15:9: 'export'
            {
            match("export"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:16:7: ( '{' )
            // InternalFortXTrans.g:16:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:17:7: ( ',' )
            // InternalFortXTrans.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:18:7: ( '}' )
            // InternalFortXTrans.g:18:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:19:7: ( '.' )
            // InternalFortXTrans.g:19:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:20:7: ( 'except' )
            // InternalFortXTrans.g:20:9: 'except'
            {
            match("except"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:21:7: ( 'as' )
            // InternalFortXTrans.g:21:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:22:7: ( 'private' )
            // InternalFortXTrans.g:22:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:23:7: ( 'test' )
            // InternalFortXTrans.g:23:9: 'test'
            {
            match("test"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:24:7: ( 'atomic' )
            // InternalFortXTrans.g:24:9: 'atomic'
            {
            match("atomic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:25:7: ( 'io' )
            // InternalFortXTrans.g:25:9: 'io'
            {
            match("io"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:26:7: ( '(' )
            // InternalFortXTrans.g:26:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:27:7: ( ')' )
            // InternalFortXTrans.g:27:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:28:7: ( ':' )
            // InternalFortXTrans.g:28:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:29:7: ( '=' )
            // InternalFortXTrans.g:29:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:30:7: ( ':=' )
            // InternalFortXTrans.g:30:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:31:7: ( 'return' )
            // InternalFortXTrans.g:31:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:32:7: ( 'while' )
            // InternalFortXTrans.g:32:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:33:7: ( 'for' )
            // InternalFortXTrans.g:33:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:34:7: ( 'if' )
            // InternalFortXTrans.g:34:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:35:7: ( 'then' )
            // InternalFortXTrans.g:35:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:36:7: ( '|' )
            // InternalFortXTrans.g:36:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:37:7: ( 'elif' )
            // InternalFortXTrans.g:37:9: 'elif'
            {
            match("elif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:38:7: ( 'else' )
            // InternalFortXTrans.g:38:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:39:7: ( '<-' )
            // InternalFortXTrans.g:39:9: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:40:7: ( 'seq' )
            // InternalFortXTrans.g:40:9: 'seq'
            {
            match("seq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:41:7: ( 'also' )
            // InternalFortXTrans.g:41:9: 'also'
            {
            match("also"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:42:7: ( 'at' )
            // InternalFortXTrans.g:42:9: 'at'
            {
            match("at"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:43:7: ( 'do' )
            // InternalFortXTrans.g:43:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:44:7: ( '_' )
            // InternalFortXTrans.g:44:9: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:45:7: ( 'var' )
            // InternalFortXTrans.g:45:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:4655:17: ( '(*' ( options {greedy=false; } : . )* '*)' )
            // InternalFortXTrans.g:4655:19: '(*' ( options {greedy=false; } : . )* '*)'
            {
            match("(*"); 

            // InternalFortXTrans.g:4655:24: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==')') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='(')||(LA1_1>='*' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFortXTrans.g:4655:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:4657:12: ( RULE_INT '.' RULE_INT )
            // InternalFortXTrans.g:4657:14: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_GREATERS"
    public final void mRULE_GREATERS() throws RecognitionException {
        try {
            // InternalFortXTrans.g:4659:24: ( '>' ( RULE_SD '>' )* )
            // InternalFortXTrans.g:4659:26: '>' ( RULE_SD '>' )*
            {
            match('>'); 
            // InternalFortXTrans.g:4659:30: ( RULE_SD '>' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*'||LA2_0=='.'||LA2_0=='>') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFortXTrans.g:4659:31: RULE_SD '>'
            	    {
            	    mRULE_SD(); 
            	    match('>'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_GREATERS"

    // $ANTLR start "RULE_LESSES"
    public final void mRULE_LESSES() throws RecognitionException {
        try {
            // InternalFortXTrans.g:4661:22: ( '<' ( RULE_SD '<' )* )
            // InternalFortXTrans.g:4661:24: '<' ( RULE_SD '<' )*
            {
            match('<'); 
            // InternalFortXTrans.g:4661:28: ( RULE_SD '<' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*'||LA3_0=='.'||LA3_0=='<') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFortXTrans.g:4661:29: RULE_SD '<'
            	    {
            	    mRULE_SD(); 
            	    match('<'); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LESSES"

    // $ANTLR start "RULE_BARS"
    public final void mRULE_BARS() throws RecognitionException {
        try {
            // InternalFortXTrans.g:4663:20: ( '|' ( RULE_SD '|' )* )
            // InternalFortXTrans.g:4663:22: '|' ( RULE_SD '|' )*
            {
            match('|'); 
            // InternalFortXTrans.g:4663:26: ( RULE_SD '|' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*'||LA4_0=='.'||LA4_0=='|') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFortXTrans.g:4663:27: RULE_SD '|'
            	    {
            	    mRULE_SD(); 
            	    match('|'); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BARS"

    // $ANTLR start "RULE_SLASHES"
    public final void mRULE_SLASHES() throws RecognitionException {
        try {
            // InternalFortXTrans.g:4665:23: ( '/' ( RULE_SD '/' )* )
            // InternalFortXTrans.g:4665:25: '/' ( RULE_SD '/' )*
            {
            match('/'); 
            // InternalFortXTrans.g:4665:29: ( RULE_SD '/' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*'||(LA5_0>='.' && LA5_0<='/')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFortXTrans.g:4665:30: RULE_SD '/'
            	    {
            	    mRULE_SD(); 
            	    match('/'); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLASHES"

    // $ANTLR start "RULE_SD"
    public final void mRULE_SD() throws RecognitionException {
        try {
            // InternalFortXTrans.g:4667:18: ( ( '.' | '*' )? )
            // InternalFortXTrans.g:4667:20: ( '.' | '*' )?
            {
            // InternalFortXTrans.g:4667:20: ( '.' | '*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='*'||LA6_0=='.') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFortXTrans.g:
                    {
                    if ( input.LA(1)=='*'||input.LA(1)=='.' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SD"

    // $ANTLR start "RULE_LEFT_ENCLOSER"
    public final void mRULE_LEFT_ENCLOSER() throws RecognitionException {
        try {
            int _type = RULE_LEFT_ENCLOSER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:4669:20: ( ( '(' ( ( '/' )+ | ( '\\\\' )+ ) | '[/\\\\/\\\\/' | '[/\\\\/' | '[' RULE_SD RULE_SLASHES | RULE_LESSES RULE_SD ( RULE_SLASHES | RULE_BARS ) | RULE_BARS RULE_SD RULE_SLASHES | ( '{*' | '[*' ) | ( '((>' | '(<' ) ) )
            // InternalFortXTrans.g:4669:22: ( '(' ( ( '/' )+ | ( '\\\\' )+ ) | '[/\\\\/\\\\/' | '[/\\\\/' | '[' RULE_SD RULE_SLASHES | RULE_LESSES RULE_SD ( RULE_SLASHES | RULE_BARS ) | RULE_BARS RULE_SD RULE_SLASHES | ( '{*' | '[*' ) | ( '((>' | '(<' ) )
            {
            // InternalFortXTrans.g:4669:22: ( '(' ( ( '/' )+ | ( '\\\\' )+ ) | '[/\\\\/\\\\/' | '[/\\\\/' | '[' RULE_SD RULE_SLASHES | RULE_LESSES RULE_SD ( RULE_SLASHES | RULE_BARS ) | RULE_BARS RULE_SD RULE_SLASHES | ( '{*' | '[*' ) | ( '((>' | '(<' ) )
            int alt13=8;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalFortXTrans.g:4669:23: '(' ( ( '/' )+ | ( '\\\\' )+ )
                    {
                    match('('); 
                    // InternalFortXTrans.g:4669:27: ( ( '/' )+ | ( '\\\\' )+ )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='/') ) {
                        alt9=1;
                    }
                    else if ( (LA9_0=='\\') ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalFortXTrans.g:4669:28: ( '/' )+
                            {
                            // InternalFortXTrans.g:4669:28: ( '/' )+
                            int cnt7=0;
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0=='/') ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // InternalFortXTrans.g:4669:28: '/'
                            	    {
                            	    match('/'); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt7 >= 1 ) break loop7;
                                        EarlyExitException eee =
                                            new EarlyExitException(7, input);
                                        throw eee;
                                }
                                cnt7++;
                            } while (true);


                            }
                            break;
                        case 2 :
                            // InternalFortXTrans.g:4669:33: ( '\\\\' )+
                            {
                            // InternalFortXTrans.g:4669:33: ( '\\\\' )+
                            int cnt8=0;
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0=='\\') ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalFortXTrans.g:4669:33: '\\\\'
                            	    {
                            	    match('\\'); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt8 >= 1 ) break loop8;
                                        EarlyExitException eee =
                                            new EarlyExitException(8, input);
                                        throw eee;
                                }
                                cnt8++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:4669:40: '[/\\\\/\\\\/'
                    {
                    match("[/\\/\\/"); 


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:4669:51: '[/\\\\/'
                    {
                    match("[/\\/"); 


                    }
                    break;
                case 4 :
                    // InternalFortXTrans.g:4669:59: '[' RULE_SD RULE_SLASHES
                    {
                    match('['); 
                    mRULE_SD(); 
                    mRULE_SLASHES(); 

                    }
                    break;
                case 5 :
                    // InternalFortXTrans.g:4669:84: RULE_LESSES RULE_SD ( RULE_SLASHES | RULE_BARS )
                    {
                    mRULE_LESSES(); 
                    mRULE_SD(); 
                    // InternalFortXTrans.g:4669:104: ( RULE_SLASHES | RULE_BARS )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='/') ) {
                        alt10=1;
                    }
                    else if ( (LA10_0=='|') ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalFortXTrans.g:4669:105: RULE_SLASHES
                            {
                            mRULE_SLASHES(); 

                            }
                            break;
                        case 2 :
                            // InternalFortXTrans.g:4669:118: RULE_BARS
                            {
                            mRULE_BARS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // InternalFortXTrans.g:4669:129: RULE_BARS RULE_SD RULE_SLASHES
                    {
                    mRULE_BARS(); 
                    mRULE_SD(); 
                    mRULE_SLASHES(); 

                    }
                    break;
                case 7 :
                    // InternalFortXTrans.g:4669:160: ( '{*' | '[*' )
                    {
                    // InternalFortXTrans.g:4669:160: ( '{*' | '[*' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='{') ) {
                        alt11=1;
                    }
                    else if ( (LA11_0=='[') ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalFortXTrans.g:4669:161: '{*'
                            {
                            match("{*"); 


                            }
                            break;
                        case 2 :
                            // InternalFortXTrans.g:4669:166: '[*'
                            {
                            match("[*"); 


                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // InternalFortXTrans.g:4669:172: ( '((>' | '(<' )
                    {
                    // InternalFortXTrans.g:4669:172: ( '((>' | '(<' )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='(') ) {
                        int LA12_1 = input.LA(2);

                        if ( (LA12_1=='(') ) {
                            alt12=1;
                        }
                        else if ( (LA12_1=='<') ) {
                            alt12=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalFortXTrans.g:4669:173: '((>'
                            {
                            match("((>"); 


                            }
                            break;
                        case 2 :
                            // InternalFortXTrans.g:4669:179: '(<'
                            {
                            match("(<"); 


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_ENCLOSER"

    // $ANTLR start "RULE_RIGHT_ENCLOSER"
    public final void mRULE_RIGHT_ENCLOSER() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_ENCLOSER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:4671:21: ( ( ( '/' )+ ')' | ( '\\\\' )+ ')' | RULE_SLASHES RULE_SD ( RULE_GREATERS | RULE_BARS | ( '\\\\' | ']' ) ) | RULE_BARS RULE_SD RULE_GREATERS | ( '*]' | '*}' ) | ']' | ( '>)' | '<))' ) | '/\\\\/\\\\/]' | '/\\\\/]' ) )
            // InternalFortXTrans.g:4671:23: ( ( '/' )+ ')' | ( '\\\\' )+ ')' | RULE_SLASHES RULE_SD ( RULE_GREATERS | RULE_BARS | ( '\\\\' | ']' ) ) | RULE_BARS RULE_SD RULE_GREATERS | ( '*]' | '*}' ) | ']' | ( '>)' | '<))' ) | '/\\\\/\\\\/]' | '/\\\\/]' )
            {
            // InternalFortXTrans.g:4671:23: ( ( '/' )+ ')' | ( '\\\\' )+ ')' | RULE_SLASHES RULE_SD ( RULE_GREATERS | RULE_BARS | ( '\\\\' | ']' ) ) | RULE_BARS RULE_SD RULE_GREATERS | ( '*]' | '*}' ) | ']' | ( '>)' | '<))' ) | '/\\\\/\\\\/]' | '/\\\\/]' )
            int alt19=9;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalFortXTrans.g:4671:24: ( '/' )+ ')'
                    {
                    // InternalFortXTrans.g:4671:24: ( '/' )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='/') ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalFortXTrans.g:4671:24: '/'
                    	    {
                    	    match('/'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    match(')'); 

                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:4671:33: ( '\\\\' )+ ')'
                    {
                    // InternalFortXTrans.g:4671:33: ( '\\\\' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalFortXTrans.g:4671:33: '\\\\'
                    	    {
                    	    match('\\'); 

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

                    match(')'); 

                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:4671:43: RULE_SLASHES RULE_SD ( RULE_GREATERS | RULE_BARS | ( '\\\\' | ']' ) )
                    {
                    mRULE_SLASHES(); 
                    mRULE_SD(); 
                    // InternalFortXTrans.g:4671:64: ( RULE_GREATERS | RULE_BARS | ( '\\\\' | ']' ) )
                    int alt16=3;
                    switch ( input.LA(1) ) {
                    case '>':
                        {
                        alt16=1;
                        }
                        break;
                    case '|':
                        {
                        alt16=2;
                        }
                        break;
                    case '\\':
                    case ']':
                        {
                        alt16=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }

                    switch (alt16) {
                        case 1 :
                            // InternalFortXTrans.g:4671:65: RULE_GREATERS
                            {
                            mRULE_GREATERS(); 

                            }
                            break;
                        case 2 :
                            // InternalFortXTrans.g:4671:79: RULE_BARS
                            {
                            mRULE_BARS(); 

                            }
                            break;
                        case 3 :
                            // InternalFortXTrans.g:4671:89: ( '\\\\' | ']' )
                            {
                            if ( (input.LA(1)>='\\' && input.LA(1)<=']') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // InternalFortXTrans.g:4671:101: RULE_BARS RULE_SD RULE_GREATERS
                    {
                    mRULE_BARS(); 
                    mRULE_SD(); 
                    mRULE_GREATERS(); 

                    }
                    break;
                case 5 :
                    // InternalFortXTrans.g:4671:133: ( '*]' | '*}' )
                    {
                    // InternalFortXTrans.g:4671:133: ( '*]' | '*}' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='*') ) {
                        int LA17_1 = input.LA(2);

                        if ( (LA17_1==']') ) {
                            alt17=1;
                        }
                        else if ( (LA17_1=='}') ) {
                            alt17=2;
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
                            // InternalFortXTrans.g:4671:134: '*]'
                            {
                            match("*]"); 


                            }
                            break;
                        case 2 :
                            // InternalFortXTrans.g:4671:139: '*}'
                            {
                            match("*}"); 


                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // InternalFortXTrans.g:4671:145: ']'
                    {
                    match(']'); 

                    }
                    break;
                case 7 :
                    // InternalFortXTrans.g:4671:149: ( '>)' | '<))' )
                    {
                    // InternalFortXTrans.g:4671:149: ( '>)' | '<))' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='>') ) {
                        alt18=1;
                    }
                    else if ( (LA18_0=='<') ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalFortXTrans.g:4671:150: '>)'
                            {
                            match(">)"); 


                            }
                            break;
                        case 2 :
                            // InternalFortXTrans.g:4671:155: '<))'
                            {
                            match("<))"); 


                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // InternalFortXTrans.g:4671:162: '/\\\\/\\\\/]'
                    {
                    match("/\\/\\/]"); 


                    }
                    break;
                case 9 :
                    // InternalFortXTrans.g:4671:173: '/\\\\/]'
                    {
                    match("/\\/]"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_ENCLOSER"

    // $ANTLR start "RULE_DOTS"
    public final void mRULE_DOTS() throws RecognitionException {
        try {
            int _type = RULE_DOTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:4673:11: ( '...' )
            // InternalFortXTrans.g:4673:13: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOTS"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:4675:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalFortXTrans.g:4675:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalFortXTrans.g:4675:11: ( '^' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='^') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalFortXTrans.g:4675:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalFortXTrans.g:4675:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='0' && LA21_0<='9')||(LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='a' && LA21_0<='z')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalFortXTrans.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:4677:10: ( ( '0' .. '9' )+ )
            // InternalFortXTrans.g:4677:12: ( '0' .. '9' )+
            {
            // InternalFortXTrans.g:4677:12: ( '0' .. '9' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalFortXTrans.g:4677:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:4679:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalFortXTrans.g:4679:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalFortXTrans.g:4679:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\"') ) {
                alt25=1;
            }
            else if ( (LA25_0=='\'') ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalFortXTrans.g:4679:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalFortXTrans.g:4679:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop23:
                    do {
                        int alt23=3;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0=='\\') ) {
                            alt23=1;
                        }
                        else if ( ((LA23_0>='\u0000' && LA23_0<='!')||(LA23_0>='#' && LA23_0<='[')||(LA23_0>=']' && LA23_0<='\uFFFF')) ) {
                            alt23=2;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalFortXTrans.g:4679:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFortXTrans.g:4679:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:4679:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalFortXTrans.g:4679:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop24:
                    do {
                        int alt24=3;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0=='\\') ) {
                            alt24=1;
                        }
                        else if ( ((LA24_0>='\u0000' && LA24_0<='&')||(LA24_0>='(' && LA24_0<='[')||(LA24_0>=']' && LA24_0<='\uFFFF')) ) {
                            alt24=2;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalFortXTrans.g:4679:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFortXTrans.g:4679:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:4681:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalFortXTrans.g:4681:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalFortXTrans.g:4681:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='\u0000' && LA26_0<='\t')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='\uFFFF')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalFortXTrans.g:4681:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalFortXTrans.g:4681:40: ( ( '\\r' )? '\\n' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\n'||LA28_0=='\r') ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalFortXTrans.g:4681:41: ( '\\r' )? '\\n'
                    {
                    // InternalFortXTrans.g:4681:41: ( '\\r' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0=='\r') ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalFortXTrans.g:4681:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:4683:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalFortXTrans.g:4683:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalFortXTrans.g:4683:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>='\t' && LA29_0<='\n')||LA29_0=='\r'||LA29_0==' ') ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalFortXTrans.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:4685:16: ( . )
            // InternalFortXTrans.g:4685:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalFortXTrans.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | RULE_ML_COMMENT | RULE_FLOAT | RULE_LEFT_ENCLOSER | RULE_RIGHT_ENCLOSER | RULE_DOTS | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt30=46;
        alt30 = dfa30.predict(input);
        switch (alt30) {
            case 1 :
                // InternalFortXTrans.g:1:10: T__20
                {
                mT__20(); 

                }
                break;
            case 2 :
                // InternalFortXTrans.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // InternalFortXTrans.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // InternalFortXTrans.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // InternalFortXTrans.g:1:34: T__24
                {
                mT__24(); 

                }
                break;
            case 6 :
                // InternalFortXTrans.g:1:40: T__25
                {
                mT__25(); 

                }
                break;
            case 7 :
                // InternalFortXTrans.g:1:46: T__26
                {
                mT__26(); 

                }
                break;
            case 8 :
                // InternalFortXTrans.g:1:52: T__27
                {
                mT__27(); 

                }
                break;
            case 9 :
                // InternalFortXTrans.g:1:58: T__28
                {
                mT__28(); 

                }
                break;
            case 10 :
                // InternalFortXTrans.g:1:64: T__29
                {
                mT__29(); 

                }
                break;
            case 11 :
                // InternalFortXTrans.g:1:70: T__30
                {
                mT__30(); 

                }
                break;
            case 12 :
                // InternalFortXTrans.g:1:76: T__31
                {
                mT__31(); 

                }
                break;
            case 13 :
                // InternalFortXTrans.g:1:82: T__32
                {
                mT__32(); 

                }
                break;
            case 14 :
                // InternalFortXTrans.g:1:88: T__33
                {
                mT__33(); 

                }
                break;
            case 15 :
                // InternalFortXTrans.g:1:94: T__34
                {
                mT__34(); 

                }
                break;
            case 16 :
                // InternalFortXTrans.g:1:100: T__35
                {
                mT__35(); 

                }
                break;
            case 17 :
                // InternalFortXTrans.g:1:106: T__36
                {
                mT__36(); 

                }
                break;
            case 18 :
                // InternalFortXTrans.g:1:112: T__37
                {
                mT__37(); 

                }
                break;
            case 19 :
                // InternalFortXTrans.g:1:118: T__38
                {
                mT__38(); 

                }
                break;
            case 20 :
                // InternalFortXTrans.g:1:124: T__39
                {
                mT__39(); 

                }
                break;
            case 21 :
                // InternalFortXTrans.g:1:130: T__40
                {
                mT__40(); 

                }
                break;
            case 22 :
                // InternalFortXTrans.g:1:136: T__41
                {
                mT__41(); 

                }
                break;
            case 23 :
                // InternalFortXTrans.g:1:142: T__42
                {
                mT__42(); 

                }
                break;
            case 24 :
                // InternalFortXTrans.g:1:148: T__43
                {
                mT__43(); 

                }
                break;
            case 25 :
                // InternalFortXTrans.g:1:154: T__44
                {
                mT__44(); 

                }
                break;
            case 26 :
                // InternalFortXTrans.g:1:160: T__45
                {
                mT__45(); 

                }
                break;
            case 27 :
                // InternalFortXTrans.g:1:166: T__46
                {
                mT__46(); 

                }
                break;
            case 28 :
                // InternalFortXTrans.g:1:172: T__47
                {
                mT__47(); 

                }
                break;
            case 29 :
                // InternalFortXTrans.g:1:178: T__48
                {
                mT__48(); 

                }
                break;
            case 30 :
                // InternalFortXTrans.g:1:184: T__49
                {
                mT__49(); 

                }
                break;
            case 31 :
                // InternalFortXTrans.g:1:190: T__50
                {
                mT__50(); 

                }
                break;
            case 32 :
                // InternalFortXTrans.g:1:196: T__51
                {
                mT__51(); 

                }
                break;
            case 33 :
                // InternalFortXTrans.g:1:202: T__52
                {
                mT__52(); 

                }
                break;
            case 34 :
                // InternalFortXTrans.g:1:208: T__53
                {
                mT__53(); 

                }
                break;
            case 35 :
                // InternalFortXTrans.g:1:214: T__54
                {
                mT__54(); 

                }
                break;
            case 36 :
                // InternalFortXTrans.g:1:220: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // InternalFortXTrans.g:1:236: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 38 :
                // InternalFortXTrans.g:1:247: RULE_LEFT_ENCLOSER
                {
                mRULE_LEFT_ENCLOSER(); 

                }
                break;
            case 39 :
                // InternalFortXTrans.g:1:266: RULE_RIGHT_ENCLOSER
                {
                mRULE_RIGHT_ENCLOSER(); 

                }
                break;
            case 40 :
                // InternalFortXTrans.g:1:286: RULE_DOTS
                {
                mRULE_DOTS(); 

                }
                break;
            case 41 :
                // InternalFortXTrans.g:1:296: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 42 :
                // InternalFortXTrans.g:1:304: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 43 :
                // InternalFortXTrans.g:1:313: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 44 :
                // InternalFortXTrans.g:1:325: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 45 :
                // InternalFortXTrans.g:1:341: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 46 :
                // InternalFortXTrans.g:1:349: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String DFA13_eotS =
        "\10\uffff\1\12\1\5\2\uffff\1\16\2\uffff";
    static final String DFA13_eofS =
        "\17\uffff";
    static final String DFA13_minS =
        "\2\50\1\52\5\uffff\1\134\1\57\1\uffff\1\57\1\134\2\uffff";
    static final String DFA13_maxS =
        "\1\174\1\134\1\57\5\uffff\1\134\1\57\1\uffff\1\57\1\134\2\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\5\1\6\1\7\1\10\1\1\2\uffff\1\4\2\uffff\1\2\1\3";
    static final String DFA13_specialS =
        "\17\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\23\uffff\1\3\36\uffff\1\2\37\uffff\1\5\1\4",
            "\1\6\6\uffff\1\7\14\uffff\1\6\37\uffff\1\7",
            "\1\11\3\uffff\1\12\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\13",
            "\1\12",
            "",
            "\1\14",
            "\1\15",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "4669:22: ( '(' ( ( '/' )+ | ( '\\\\' )+ ) | '[/\\\\/\\\\/' | '[/\\\\/' | '[' RULE_SD RULE_SLASHES | RULE_LESSES RULE_SD ( RULE_SLASHES | RULE_BARS ) | RULE_BARS RULE_SD RULE_SLASHES | ( '{*' | '[*' ) | ( '((>' | '(<' ) )";
        }
    }
    static final String DFA19_eotS =
        "\7\uffff\1\12\6\uffff";
    static final String DFA19_eofS =
        "\16\uffff";
    static final String DFA19_minS =
        "\1\52\1\51\5\uffff\1\57\1\uffff\1\51\1\uffff\1\134\2\uffff";
    static final String DFA19_maxS =
        "\2\174\5\uffff\1\57\1\uffff\1\174\1\uffff\1\135\2\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\1\4\1\5\1\6\1\7\1\uffff\1\1\1\uffff\1\3\1\uffff\1\10\1\11";
    static final String DFA19_specialS =
        "\16\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\4\4\uffff\1\1\14\uffff\1\6\1\uffff\1\6\35\uffff\1\2\1\5\36\uffff\1\3",
            "\1\10\1\12\3\uffff\1\12\1\11\16\uffff\1\12\35\uffff\1\7\1\12\36\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\13",
            "",
            "\1\10\1\12\3\uffff\1\12\1\11\16\uffff\1\12\35\uffff\2\12\36\uffff\1\12",
            "",
            "\1\14\1\15",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "4671:23: ( ( '/' )+ ')' | ( '\\\\' )+ ')' | RULE_SLASHES RULE_SD ( RULE_GREATERS | RULE_BARS | ( '\\\\' | ']' ) ) | RULE_BARS RULE_SD RULE_GREATERS | ( '*]' | '*}' ) | ']' | ( '>)' | '<))' ) | '/\\\\/\\\\/]' | '/\\\\/]' )";
        }
    }
    static final String DFA30_eotS =
        "\1\uffff\4\46\1\62\2\uffff\1\66\2\46\1\73\1\uffff\1\76\1\uffff\3\46\1\103\1\44\2\46\1\112\1\46\1\114\4\44\1\uffff\2\44\1\uffff\2\44\2\uffff\1\46\1\uffff\4\46\1\131\1\133\2\46\1\136\1\137\6\uffff\3\46\6\uffff\3\46\5\uffff\1\46\1\147\1\uffff\1\46\1\uffff\1\114\1\uffff\1\154\2\uffff\1\46\1\161\4\46\1\166\1\uffff\1\46\1\uffff\2\46\2\uffff\5\46\1\177\1\u0080\1\uffff\1\u0081\1\106\2\154\1\uffff\3\106\1\46\1\uffff\2\46\1\u008a\1\u008b\1\uffff\1\46\1\u008d\2\46\1\u0090\1\u0091\2\46\3\uffff\2\154\1\106\1\154\1\106\3\46\2\uffff\1\46\1\uffff\2\46\2\uffff\1\46\1\u009b\1\46\1\u009d\1\u009e\1\u009f\1\u00a0\1\46\1\u00a2\1\uffff\1\46\4\uffff\1\u00a4\1\uffff\1\46\1\uffff\1\u00a6\1\uffff";
    static final String DFA30_eofS =
        "\u00a7\uffff";
    static final String DFA30_minS =
        "\1\0\1\157\2\154\1\146\1\52\2\uffff\1\56\1\162\1\145\1\50\1\uffff\1\75\1\uffff\1\145\1\150\1\157\1\52\1\51\1\145\1\157\1\60\1\141\1\56\1\52\2\51\1\135\1\uffff\1\51\1\101\1\uffff\2\0\2\uffff\1\155\1\uffff\1\144\1\143\2\151\2\60\1\163\1\160\2\60\6\uffff\1\151\1\163\1\145\6\uffff\1\164\1\151\1\162\1\uffff\1\57\1\52\2\uffff\1\161\1\60\1\uffff\1\162\1\uffff\1\56\1\uffff\1\51\2\uffff\1\160\1\60\1\157\1\145\1\146\1\145\1\60\1\uffff\1\155\1\uffff\2\157\2\uffff\1\166\1\164\1\156\1\165\1\154\2\60\1\uffff\1\60\1\0\1\51\1\57\1\uffff\3\0\1\157\1\uffff\1\162\1\160\2\60\1\uffff\1\151\1\60\1\162\1\141\2\60\1\162\1\145\3\uffff\1\52\1\76\1\0\1\174\1\0\1\156\2\164\2\uffff\1\143\1\uffff\2\164\2\uffff\1\156\1\60\1\145\4\60\1\145\1\60\1\uffff\1\156\4\uffff\1\60\1\uffff\1\164\1\uffff\1\60\1\uffff";
    static final String DFA30_maxS =
        "\1\uffff\1\157\1\170\1\164\1\157\1\52\2\uffff\1\56\1\162\1\150\1\134\1\uffff\1\75\1\uffff\1\145\1\150\1\157\2\174\1\145\1\157\1\172\1\141\1\71\1\57\1\174\1\134\1\175\1\uffff\1\51\1\172\1\uffff\2\uffff\2\uffff\1\155\1\uffff\1\144\1\160\1\163\1\151\2\172\1\163\1\160\2\172\6\uffff\1\151\1\163\1\145\6\uffff\1\164\1\151\1\162\1\uffff\2\174\2\uffff\1\161\1\172\1\uffff\1\162\1\uffff\1\71\1\uffff\1\174\2\uffff\1\160\1\172\1\157\1\145\1\146\1\145\1\172\1\uffff\1\155\1\uffff\2\157\2\uffff\1\166\1\164\1\156\1\165\1\154\2\172\1\uffff\1\172\1\uffff\2\174\1\uffff\3\uffff\1\157\1\uffff\1\162\1\160\2\172\1\uffff\1\151\1\172\1\162\1\141\2\172\1\162\1\145\3\uffff\1\174\1\76\1\uffff\1\174\1\uffff\1\156\2\164\2\uffff\1\143\1\uffff\2\164\2\uffff\1\156\1\172\1\145\4\172\1\145\1\172\1\uffff\1\156\4\uffff\1\172\1\uffff\1\164\1\uffff\1\172\1\uffff";
    static final String DFA30_acceptS =
        "\6\uffff\1\7\1\10\4\uffff\1\21\1\uffff\1\23\16\uffff\1\47\2\uffff\1\51\2\uffff\1\55\1\56\1\uffff\1\51\12\uffff\1\46\1\6\1\7\1\10\1\50\1\11\3\uffff\1\44\1\20\1\21\1\24\1\22\1\23\3\uffff\1\32\2\uffff\1\47\1\35\2\uffff\1\42\1\uffff\1\52\1\uffff\1\45\1\uffff\1\53\1\55\7\uffff\1\13\1\uffff\1\40\2\uffff\1\17\1\30\7\uffff\1\41\4\uffff\1\54\4\uffff\1\2\4\uffff\1\3\10\uffff\1\27\1\36\1\43\10\uffff\1\33\1\34\1\uffff\1\37\2\uffff\1\15\1\31\11\uffff\1\26\1\uffff\1\5\1\12\1\16\1\4\1\uffff\1\25\1\uffff\1\14\1\uffff\1\1";
    static final String DFA30_specialS =
        "\1\5\40\uffff\1\0\1\6\106\uffff\1\1\3\uffff\1\7\1\3\1\2\24\uffff\1\10\1\uffff\1\4\40\uffff}>";
    static final String[] DFA30_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\44\1\41\4\44\1\42\1\13\1\14\1\34\1\44\1\6\1\44\1\10\1\32\12\30\1\15\1\44\1\23\1\16\1\36\2\44\32\40\1\31\1\33\1\35\1\37\1\26\1\44\1\3\1\40\1\1\1\25\1\2\1\21\2\40\1\4\6\40\1\11\1\40\1\17\1\24\1\12\1\40\1\27\1\20\3\40\1\5\1\22\1\7\uff82\44",
            "\1\45",
            "\1\51\1\uffff\1\47\11\uffff\1\50",
            "\1\55\3\uffff\1\52\2\uffff\1\53\1\54",
            "\1\60\6\uffff\1\56\1\uffff\1\57",
            "\1\61",
            "",
            "",
            "\1\65",
            "\1\67",
            "\1\70\2\uffff\1\71",
            "\1\61\1\uffff\1\72\4\uffff\1\61\14\uffff\1\61\37\uffff\1\61",
            "",
            "\1\75",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\104\3\uffff\1\104\1\61\16\uffff\1\106\75\uffff\1\105",
            "\1\106\1\61\2\uffff\1\107\2\61\14\uffff\1\61\77\uffff\1\61",
            "\1\110",
            "\1\111",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\113",
            "\1\116\1\uffff\12\115",
            "\1\61\3\uffff\2\61",
            "\2\106\3\uffff\1\106\1\117\16\uffff\1\106\35\uffff\2\106\36\uffff\1\106",
            "\1\106\62\uffff\1\106",
            "\1\106\37\uffff\1\106",
            "",
            "\1\106",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\0\120",
            "\0\120",
            "",
            "",
            "\1\122",
            "",
            "\1\123",
            "\1\125\14\uffff\1\124",
            "\1\126\11\uffff\1\127",
            "\1\130",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\16\46\1\132\13\46",
            "\1\134",
            "\1\135",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "\1\61\16\uffff\1\106\75\uffff\1\105",
            "\1\104\3\uffff\1\104\1\61\16\uffff\1\106\75\uffff\1\105",
            "",
            "",
            "\1\146",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\150",
            "",
            "\1\116\1\uffff\12\115",
            "",
            "\1\151\1\153\3\uffff\1\153\1\152\16\uffff\1\155\35\uffff\2\157\36\uffff\1\156",
            "",
            "",
            "\1\160",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\167",
            "",
            "\1\170",
            "\1\171",
            "",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\0\154",
            "\1\151\1\153\3\uffff\1\153\1\152\16\uffff\1\155\35\uffff\2\157\36\uffff\1\156",
            "\1\u0082\16\uffff\1\155\35\uffff\2\157\36\uffff\1\156",
            "",
            "\52\154\1\u0083\3\154\1\u0083\17\154\1\u0084\uffc1\154",
            "\52\154\1\u0085\3\154\1\u0085\115\154\1\u0086\uff83\154",
            "\0\154",
            "\1\u0087",
            "",
            "\1\u0088",
            "\1\u0089",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u008c",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u008e",
            "\1\u008f",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0092",
            "\1\u0093",
            "",
            "",
            "",
            "\1\153\3\uffff\1\153\1\u0082\16\uffff\1\155\35\uffff\2\157\36\uffff\1\156",
            "\1\u0084",
            "\52\154\1\u0083\3\154\1\u0083\17\154\1\u0084\uffc1\154",
            "\1\u0086",
            "\52\154\1\u0085\3\154\1\u0085\115\154\1\u0086\uff83\154",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "",
            "\1\u0097",
            "",
            "\1\u0098",
            "\1\u0099",
            "",
            "",
            "\1\u009a",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u009c",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00a1",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00a3",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00a5",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | RULE_ML_COMMENT | RULE_FLOAT | RULE_LEFT_ENCLOSER | RULE_RIGHT_ENCLOSER | RULE_DOTS | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_33 = input.LA(1);

                        s = -1;
                        if ( ((LA30_33>='\u0000' && LA30_33<='\uFFFF')) ) {s = 80;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_105 = input.LA(1);

                        s = -1;
                        if ( ((LA30_105>='\u0000' && LA30_105<='\uFFFF')) ) {s = 108;}

                        else s = 70;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_111 = input.LA(1);

                        s = -1;
                        if ( ((LA30_111>='\u0000' && LA30_111<='\uFFFF')) ) {s = 108;}

                        else s = 70;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA30_110 = input.LA(1);

                        s = -1;
                        if ( ((LA30_110>='\u0000' && LA30_110<=')')||(LA30_110>='+' && LA30_110<='-')||(LA30_110>='/' && LA30_110<='{')||(LA30_110>='}' && LA30_110<='\uFFFF')) ) {s = 108;}

                        else if ( (LA30_110=='*'||LA30_110=='.') ) {s = 133;}

                        else if ( (LA30_110=='|') ) {s = 134;}

                        else s = 70;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA30_134 = input.LA(1);

                        s = -1;
                        if ( ((LA30_134>='\u0000' && LA30_134<=')')||(LA30_134>='+' && LA30_134<='-')||(LA30_134>='/' && LA30_134<='{')||(LA30_134>='}' && LA30_134<='\uFFFF')) ) {s = 108;}

                        else if ( (LA30_134=='*'||LA30_134=='.') ) {s = 133;}

                        else if ( (LA30_134=='|') ) {s = 134;}

                        else s = 70;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA30_0 = input.LA(1);

                        s = -1;
                        if ( (LA30_0=='c') ) {s = 1;}

                        else if ( (LA30_0=='e') ) {s = 2;}

                        else if ( (LA30_0=='a') ) {s = 3;}

                        else if ( (LA30_0=='i') ) {s = 4;}

                        else if ( (LA30_0=='{') ) {s = 5;}

                        else if ( (LA30_0==',') ) {s = 6;}

                        else if ( (LA30_0=='}') ) {s = 7;}

                        else if ( (LA30_0=='.') ) {s = 8;}

                        else if ( (LA30_0=='p') ) {s = 9;}

                        else if ( (LA30_0=='t') ) {s = 10;}

                        else if ( (LA30_0=='(') ) {s = 11;}

                        else if ( (LA30_0==')') ) {s = 12;}

                        else if ( (LA30_0==':') ) {s = 13;}

                        else if ( (LA30_0=='=') ) {s = 14;}

                        else if ( (LA30_0=='r') ) {s = 15;}

                        else if ( (LA30_0=='w') ) {s = 16;}

                        else if ( (LA30_0=='f') ) {s = 17;}

                        else if ( (LA30_0=='|') ) {s = 18;}

                        else if ( (LA30_0=='<') ) {s = 19;}

                        else if ( (LA30_0=='s') ) {s = 20;}

                        else if ( (LA30_0=='d') ) {s = 21;}

                        else if ( (LA30_0=='_') ) {s = 22;}

                        else if ( (LA30_0=='v') ) {s = 23;}

                        else if ( ((LA30_0>='0' && LA30_0<='9')) ) {s = 24;}

                        else if ( (LA30_0=='[') ) {s = 25;}

                        else if ( (LA30_0=='/') ) {s = 26;}

                        else if ( (LA30_0=='\\') ) {s = 27;}

                        else if ( (LA30_0=='*') ) {s = 28;}

                        else if ( (LA30_0==']') ) {s = 29;}

                        else if ( (LA30_0=='>') ) {s = 30;}

                        else if ( (LA30_0=='^') ) {s = 31;}

                        else if ( ((LA30_0>='A' && LA30_0<='Z')||LA30_0=='b'||(LA30_0>='g' && LA30_0<='h')||(LA30_0>='j' && LA30_0<='o')||LA30_0=='q'||LA30_0=='u'||(LA30_0>='x' && LA30_0<='z')) ) {s = 32;}

                        else if ( (LA30_0=='\"') ) {s = 33;}

                        else if ( (LA30_0=='\'') ) {s = 34;}

                        else if ( ((LA30_0>='\t' && LA30_0<='\n')||LA30_0=='\r'||LA30_0==' ') ) {s = 35;}

                        else if ( ((LA30_0>='\u0000' && LA30_0<='\b')||(LA30_0>='\u000B' && LA30_0<='\f')||(LA30_0>='\u000E' && LA30_0<='\u001F')||LA30_0=='!'||(LA30_0>='#' && LA30_0<='&')||LA30_0=='+'||LA30_0=='-'||LA30_0==';'||(LA30_0>='?' && LA30_0<='@')||LA30_0=='`'||(LA30_0>='~' && LA30_0<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA30_34 = input.LA(1);

                        s = -1;
                        if ( ((LA30_34>='\u0000' && LA30_34<='\uFFFF')) ) {s = 80;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA30_109 = input.LA(1);

                        s = -1;
                        if ( ((LA30_109>='\u0000' && LA30_109<=')')||(LA30_109>='+' && LA30_109<='-')||(LA30_109>='/' && LA30_109<='=')||(LA30_109>='?' && LA30_109<='\uFFFF')) ) {s = 108;}

                        else if ( (LA30_109=='*'||LA30_109=='.') ) {s = 131;}

                        else if ( (LA30_109=='>') ) {s = 132;}

                        else s = 70;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA30_132 = input.LA(1);

                        s = -1;
                        if ( (LA30_132=='*'||LA30_132=='.') ) {s = 131;}

                        else if ( (LA30_132=='>') ) {s = 132;}

                        else if ( ((LA30_132>='\u0000' && LA30_132<=')')||(LA30_132>='+' && LA30_132<='-')||(LA30_132>='/' && LA30_132<='=')||(LA30_132>='?' && LA30_132<='\uFFFF')) ) {s = 108;}

                        else s = 70;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}