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

    public InternalFortXTransLexer() {;} 
    public InternalFortXTransLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFortXTransLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalFortXTrans.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:22:7: ( ':' )
            // InternalFortXTrans.g:22:9: ':'
            {
            match(':'); 

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
            // InternalFortXTrans.g:23:7: ( '=' )
            // InternalFortXTrans.g:23:9: '='
            {
            match('='); 

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
            // InternalFortXTrans.g:24:7: ( 'private' )
            // InternalFortXTrans.g:24:9: 'private'
            {
            match("private"); 


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
            // InternalFortXTrans.g:25:7: ( 'test' )
            // InternalFortXTrans.g:25:9: 'test'
            {
            match("test"); 


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
            // InternalFortXTrans.g:26:7: ( 'atomic' )
            // InternalFortXTrans.g:26:9: 'atomic'
            {
            match("atomic"); 


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
            // InternalFortXTrans.g:27:7: ( 'io' )
            // InternalFortXTrans.g:27:9: 'io'
            {
            match("io"); 


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
            // InternalFortXTrans.g:28:7: ( '(' )
            // InternalFortXTrans.g:28:9: '('
            {
            match('('); 

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
            // InternalFortXTrans.g:29:7: ( ')' )
            // InternalFortXTrans.g:29:9: ')'
            {
            match(')'); 

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
            // InternalFortXTrans.g:30:7: ( '_' )
            // InternalFortXTrans.g:30:9: '_'
            {
            match('_'); 

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
            // InternalFortXTrans.g:31:7: ( 'also' )
            // InternalFortXTrans.g:31:9: 'also'
            {
            match("also"); 


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
            // InternalFortXTrans.g:32:7: ( 'do' )
            // InternalFortXTrans.g:32:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:2352:17: ( '(*' ( options {greedy=false; } : . )* '*)' )
            // InternalFortXTrans.g:2352:19: '(*' ( options {greedy=false; } : . )* '*)'
            {
            match("(*"); 

            // InternalFortXTrans.g:2352:24: ( options {greedy=false; } : . )*
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
            	    // InternalFortXTrans.g:2352:52: .
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

    // $ANTLR start "RULE_GREATERS"
    public final void mRULE_GREATERS() throws RecognitionException {
        try {
            // InternalFortXTrans.g:2354:24: ( '>' ( RULE_SD '>' )* )
            // InternalFortXTrans.g:2354:26: '>' ( RULE_SD '>' )*
            {
            match('>'); 
            // InternalFortXTrans.g:2354:30: ( RULE_SD '>' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*'||LA2_0=='.'||LA2_0=='>') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFortXTrans.g:2354:31: RULE_SD '>'
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
            // InternalFortXTrans.g:2356:22: ( '<' ( RULE_SD '<' )* )
            // InternalFortXTrans.g:2356:24: '<' ( RULE_SD '<' )*
            {
            match('<'); 
            // InternalFortXTrans.g:2356:28: ( RULE_SD '<' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*'||LA3_0=='.'||LA3_0=='<') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFortXTrans.g:2356:29: RULE_SD '<'
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
            // InternalFortXTrans.g:2358:20: ( '|' ( RULE_SD '|' )* )
            // InternalFortXTrans.g:2358:22: '|' ( RULE_SD '|' )*
            {
            match('|'); 
            // InternalFortXTrans.g:2358:26: ( RULE_SD '|' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*'||LA4_0=='.'||LA4_0=='|') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFortXTrans.g:2358:27: RULE_SD '|'
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
            // InternalFortXTrans.g:2360:23: ( '/' ( RULE_SD '/' )* )
            // InternalFortXTrans.g:2360:25: '/' ( RULE_SD '/' )*
            {
            match('/'); 
            // InternalFortXTrans.g:2360:29: ( RULE_SD '/' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*'||(LA5_0>='.' && LA5_0<='/')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFortXTrans.g:2360:30: RULE_SD '/'
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
            // InternalFortXTrans.g:2362:18: ( ( '.' | '*' )? )
            // InternalFortXTrans.g:2362:20: ( '.' | '*' )?
            {
            // InternalFortXTrans.g:2362:20: ( '.' | '*' )?
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
            // InternalFortXTrans.g:2364:20: ( ( '(' ( ( '/' )+ | ( '\\\\' )+ ) | '[/\\\\/\\\\/' | '[/\\\\/' | '[' RULE_SD RULE_SLASHES | RULE_LESSES RULE_SD ( RULE_SLASHES | RULE_BARS ) | RULE_BARS RULE_SD RULE_SLASHES | ( '{*' | '[*' ) | ( '((>' | '(<' ) ) )
            // InternalFortXTrans.g:2364:22: ( '(' ( ( '/' )+ | ( '\\\\' )+ ) | '[/\\\\/\\\\/' | '[/\\\\/' | '[' RULE_SD RULE_SLASHES | RULE_LESSES RULE_SD ( RULE_SLASHES | RULE_BARS ) | RULE_BARS RULE_SD RULE_SLASHES | ( '{*' | '[*' ) | ( '((>' | '(<' ) )
            {
            // InternalFortXTrans.g:2364:22: ( '(' ( ( '/' )+ | ( '\\\\' )+ ) | '[/\\\\/\\\\/' | '[/\\\\/' | '[' RULE_SD RULE_SLASHES | RULE_LESSES RULE_SD ( RULE_SLASHES | RULE_BARS ) | RULE_BARS RULE_SD RULE_SLASHES | ( '{*' | '[*' ) | ( '((>' | '(<' ) )
            int alt13=8;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalFortXTrans.g:2364:23: '(' ( ( '/' )+ | ( '\\\\' )+ )
                    {
                    match('('); 
                    // InternalFortXTrans.g:2364:27: ( ( '/' )+ | ( '\\\\' )+ )
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
                            // InternalFortXTrans.g:2364:28: ( '/' )+
                            {
                            // InternalFortXTrans.g:2364:28: ( '/' )+
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
                            	    // InternalFortXTrans.g:2364:28: '/'
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
                            // InternalFortXTrans.g:2364:33: ( '\\\\' )+
                            {
                            // InternalFortXTrans.g:2364:33: ( '\\\\' )+
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
                            	    // InternalFortXTrans.g:2364:33: '\\\\'
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
                    // InternalFortXTrans.g:2364:40: '[/\\\\/\\\\/'
                    {
                    match("[/\\/\\/"); 


                    }
                    break;
                case 3 :
                    // InternalFortXTrans.g:2364:51: '[/\\\\/'
                    {
                    match("[/\\/"); 


                    }
                    break;
                case 4 :
                    // InternalFortXTrans.g:2364:59: '[' RULE_SD RULE_SLASHES
                    {
                    match('['); 
                    mRULE_SD(); 
                    mRULE_SLASHES(); 

                    }
                    break;
                case 5 :
                    // InternalFortXTrans.g:2364:84: RULE_LESSES RULE_SD ( RULE_SLASHES | RULE_BARS )
                    {
                    mRULE_LESSES(); 
                    mRULE_SD(); 
                    // InternalFortXTrans.g:2364:104: ( RULE_SLASHES | RULE_BARS )
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
                            // InternalFortXTrans.g:2364:105: RULE_SLASHES
                            {
                            mRULE_SLASHES(); 

                            }
                            break;
                        case 2 :
                            // InternalFortXTrans.g:2364:118: RULE_BARS
                            {
                            mRULE_BARS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // InternalFortXTrans.g:2364:129: RULE_BARS RULE_SD RULE_SLASHES
                    {
                    mRULE_BARS(); 
                    mRULE_SD(); 
                    mRULE_SLASHES(); 

                    }
                    break;
                case 7 :
                    // InternalFortXTrans.g:2364:160: ( '{*' | '[*' )
                    {
                    // InternalFortXTrans.g:2364:160: ( '{*' | '[*' )
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
                            // InternalFortXTrans.g:2364:161: '{*'
                            {
                            match("{*"); 


                            }
                            break;
                        case 2 :
                            // InternalFortXTrans.g:2364:166: '[*'
                            {
                            match("[*"); 


                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // InternalFortXTrans.g:2364:172: ( '((>' | '(<' )
                    {
                    // InternalFortXTrans.g:2364:172: ( '((>' | '(<' )
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
                            // InternalFortXTrans.g:2364:173: '((>'
                            {
                            match("((>"); 


                            }
                            break;
                        case 2 :
                            // InternalFortXTrans.g:2364:179: '(<'
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
            // InternalFortXTrans.g:2366:21: ( ( ( '/' )+ ')' | ( '\\\\' )+ ')' | RULE_SLASHES RULE_SD ( RULE_GREATERS | RULE_BARS | ( '\\\\' | ']' ) ) | RULE_BARS RULE_SD RULE_GREATERS | ( '*]' | '*}' ) | ']' | ( '>)' | '<))' ) | '/\\\\/\\\\/]' | '/\\\\/]' ) )
            // InternalFortXTrans.g:2366:23: ( ( '/' )+ ')' | ( '\\\\' )+ ')' | RULE_SLASHES RULE_SD ( RULE_GREATERS | RULE_BARS | ( '\\\\' | ']' ) ) | RULE_BARS RULE_SD RULE_GREATERS | ( '*]' | '*}' ) | ']' | ( '>)' | '<))' ) | '/\\\\/\\\\/]' | '/\\\\/]' )
            {
            // InternalFortXTrans.g:2366:23: ( ( '/' )+ ')' | ( '\\\\' )+ ')' | RULE_SLASHES RULE_SD ( RULE_GREATERS | RULE_BARS | ( '\\\\' | ']' ) ) | RULE_BARS RULE_SD RULE_GREATERS | ( '*]' | '*}' ) | ']' | ( '>)' | '<))' ) | '/\\\\/\\\\/]' | '/\\\\/]' )
            int alt19=9;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalFortXTrans.g:2366:24: ( '/' )+ ')'
                    {
                    // InternalFortXTrans.g:2366:24: ( '/' )+
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
                    	    // InternalFortXTrans.g:2366:24: '/'
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
                    // InternalFortXTrans.g:2366:33: ( '\\\\' )+ ')'
                    {
                    // InternalFortXTrans.g:2366:33: ( '\\\\' )+
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
                    	    // InternalFortXTrans.g:2366:33: '\\\\'
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
                    // InternalFortXTrans.g:2366:43: RULE_SLASHES RULE_SD ( RULE_GREATERS | RULE_BARS | ( '\\\\' | ']' ) )
                    {
                    mRULE_SLASHES(); 
                    mRULE_SD(); 
                    // InternalFortXTrans.g:2366:64: ( RULE_GREATERS | RULE_BARS | ( '\\\\' | ']' ) )
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
                            // InternalFortXTrans.g:2366:65: RULE_GREATERS
                            {
                            mRULE_GREATERS(); 

                            }
                            break;
                        case 2 :
                            // InternalFortXTrans.g:2366:79: RULE_BARS
                            {
                            mRULE_BARS(); 

                            }
                            break;
                        case 3 :
                            // InternalFortXTrans.g:2366:89: ( '\\\\' | ']' )
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
                    // InternalFortXTrans.g:2366:101: RULE_BARS RULE_SD RULE_GREATERS
                    {
                    mRULE_BARS(); 
                    mRULE_SD(); 
                    mRULE_GREATERS(); 

                    }
                    break;
                case 5 :
                    // InternalFortXTrans.g:2366:133: ( '*]' | '*}' )
                    {
                    // InternalFortXTrans.g:2366:133: ( '*]' | '*}' )
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
                            // InternalFortXTrans.g:2366:134: '*]'
                            {
                            match("*]"); 


                            }
                            break;
                        case 2 :
                            // InternalFortXTrans.g:2366:139: '*}'
                            {
                            match("*}"); 


                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // InternalFortXTrans.g:2366:145: ']'
                    {
                    match(']'); 

                    }
                    break;
                case 7 :
                    // InternalFortXTrans.g:2366:149: ( '>)' | '<))' )
                    {
                    // InternalFortXTrans.g:2366:149: ( '>)' | '<))' )
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
                            // InternalFortXTrans.g:2366:150: '>)'
                            {
                            match(">)"); 


                            }
                            break;
                        case 2 :
                            // InternalFortXTrans.g:2366:155: '<))'
                            {
                            match("<))"); 


                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // InternalFortXTrans.g:2366:162: '/\\\\/\\\\/]'
                    {
                    match("/\\/\\/]"); 


                    }
                    break;
                case 9 :
                    // InternalFortXTrans.g:2366:173: '/\\\\/]'
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
            // InternalFortXTrans.g:2368:11: ( '...' )
            // InternalFortXTrans.g:2368:13: '...'
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
            // InternalFortXTrans.g:2370:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalFortXTrans.g:2370:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalFortXTrans.g:2370:11: ( '^' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='^') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalFortXTrans.g:2370:11: '^'
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

            // InternalFortXTrans.g:2370:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalFortXTrans.g:2372:10: ( ( '0' .. '9' )+ )
            // InternalFortXTrans.g:2372:12: ( '0' .. '9' )+
            {
            // InternalFortXTrans.g:2372:12: ( '0' .. '9' )+
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
            	    // InternalFortXTrans.g:2372:13: '0' .. '9'
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
            // InternalFortXTrans.g:2374:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalFortXTrans.g:2374:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalFortXTrans.g:2374:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalFortXTrans.g:2374:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalFortXTrans.g:2374:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalFortXTrans.g:2374:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFortXTrans.g:2374:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalFortXTrans.g:2374:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalFortXTrans.g:2374:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalFortXTrans.g:2374:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFortXTrans.g:2374:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalFortXTrans.g:2376:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalFortXTrans.g:2376:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalFortXTrans.g:2376:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='\u0000' && LA26_0<='\t')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='\uFFFF')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalFortXTrans.g:2376:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalFortXTrans.g:2376:40: ( ( '\\r' )? '\\n' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\n'||LA28_0=='\r') ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalFortXTrans.g:2376:41: ( '\\r' )? '\\n'
                    {
                    // InternalFortXTrans.g:2376:41: ( '\\r' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0=='\r') ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalFortXTrans.g:2376:41: '\\r'
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
            // InternalFortXTrans.g:2378:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalFortXTrans.g:2378:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalFortXTrans.g:2378:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalFortXTrans.g:2380:16: ( . )
            // InternalFortXTrans.g:2380:18: .
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
        // InternalFortXTrans.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_ML_COMMENT | RULE_LEFT_ENCLOSER | RULE_RIGHT_ENCLOSER | RULE_DOTS | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt30=32;
        alt30 = dfa30.predict(input);
        switch (alt30) {
            case 1 :
                // InternalFortXTrans.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // InternalFortXTrans.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // InternalFortXTrans.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // InternalFortXTrans.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // InternalFortXTrans.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // InternalFortXTrans.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // InternalFortXTrans.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // InternalFortXTrans.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // InternalFortXTrans.g:1:58: T__27
                {
                mT__27(); 

                }
                break;
            case 10 :
                // InternalFortXTrans.g:1:64: T__28
                {
                mT__28(); 

                }
                break;
            case 11 :
                // InternalFortXTrans.g:1:70: T__29
                {
                mT__29(); 

                }
                break;
            case 12 :
                // InternalFortXTrans.g:1:76: T__30
                {
                mT__30(); 

                }
                break;
            case 13 :
                // InternalFortXTrans.g:1:82: T__31
                {
                mT__31(); 

                }
                break;
            case 14 :
                // InternalFortXTrans.g:1:88: T__32
                {
                mT__32(); 

                }
                break;
            case 15 :
                // InternalFortXTrans.g:1:94: T__33
                {
                mT__33(); 

                }
                break;
            case 16 :
                // InternalFortXTrans.g:1:100: T__34
                {
                mT__34(); 

                }
                break;
            case 17 :
                // InternalFortXTrans.g:1:106: T__35
                {
                mT__35(); 

                }
                break;
            case 18 :
                // InternalFortXTrans.g:1:112: T__36
                {
                mT__36(); 

                }
                break;
            case 19 :
                // InternalFortXTrans.g:1:118: T__37
                {
                mT__37(); 

                }
                break;
            case 20 :
                // InternalFortXTrans.g:1:124: T__38
                {
                mT__38(); 

                }
                break;
            case 21 :
                // InternalFortXTrans.g:1:130: T__39
                {
                mT__39(); 

                }
                break;
            case 22 :
                // InternalFortXTrans.g:1:136: T__40
                {
                mT__40(); 

                }
                break;
            case 23 :
                // InternalFortXTrans.g:1:142: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 24 :
                // InternalFortXTrans.g:1:158: RULE_LEFT_ENCLOSER
                {
                mRULE_LEFT_ENCLOSER(); 

                }
                break;
            case 25 :
                // InternalFortXTrans.g:1:177: RULE_RIGHT_ENCLOSER
                {
                mRULE_RIGHT_ENCLOSER(); 

                }
                break;
            case 26 :
                // InternalFortXTrans.g:1:197: RULE_DOTS
                {
                mRULE_DOTS(); 

                }
                break;
            case 27 :
                // InternalFortXTrans.g:1:207: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 28 :
                // InternalFortXTrans.g:1:215: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 29 :
                // InternalFortXTrans.g:1:224: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 30 :
                // InternalFortXTrans.g:1:236: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 31 :
                // InternalFortXTrans.g:1:252: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 32 :
                // InternalFortXTrans.g:1:260: RULE_ANY_OTHER
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
            return "2364:22: ( '(' ( ( '/' )+ | ( '\\\\' )+ ) | '[/\\\\/\\\\/' | '[/\\\\/' | '[' RULE_SD RULE_SLASHES | RULE_LESSES RULE_SD ( RULE_SLASHES | RULE_BARS ) | RULE_BARS RULE_SD RULE_SLASHES | ( '{*' | '[*' ) | ( '((>' | '(<' ) )";
        }
    }
    static final String DFA19_eotS =
        "\7\uffff\1\10\6\uffff";
    static final String DFA19_eofS =
        "\16\uffff";
    static final String DFA19_minS =
        "\1\52\1\51\5\uffff\1\57\1\uffff\1\51\1\uffff\1\134\2\uffff";
    static final String DFA19_maxS =
        "\2\174\5\uffff\1\57\1\uffff\1\174\1\uffff\1\135\2\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\1\4\1\5\1\6\1\7\1\uffff\1\3\1\uffff\1\1\1\uffff\1\10\1\11";
    static final String DFA19_specialS =
        "\16\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\4\4\uffff\1\1\14\uffff\1\6\1\uffff\1\6\35\uffff\1\2\1\5\36\uffff\1\3",
            "\1\12\1\10\3\uffff\1\10\1\11\16\uffff\1\10\35\uffff\1\7\1\10\36\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\13",
            "",
            "\1\12\1\10\3\uffff\1\10\1\11\16\uffff\1\10\35\uffff\2\10\36\uffff\1\10",
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
            return "2366:23: ( ( '/' )+ ')' | ( '\\\\' )+ ')' | RULE_SLASHES RULE_SD ( RULE_GREATERS | RULE_BARS | ( '\\\\' | ']' ) ) | RULE_BARS RULE_SD RULE_GREATERS | ( '*]' | '*}' ) | ']' | ( '>)' | '<))' ) | '/\\\\/\\\\/]' | '/\\\\/]' )";
        }
    }
    static final String DFA30_eotS =
        "\1\uffff\4\41\1\53\2\uffff\1\57\2\uffff\2\41\1\65\1\uffff\1\67\1\41\6\37\1\uffff\2\37\2\uffff\2\37\2\uffff\1\41\1\uffff\3\41\1\105\3\41\1\111\10\uffff\2\41\4\uffff\1\114\3\uffff\1\115\3\uffff\1\41\1\125\2\41\1\130\1\uffff\3\41\1\uffff\2\41\2\uffff\1\115\3\71\1\115\1\71\1\41\1\uffff\2\41\1\uffff\1\41\1\147\2\41\1\152\2\115\1\71\1\115\1\71\4\41\1\uffff\2\41\1\uffff\1\41\1\162\1\163\1\164\1\165\2\41\4\uffff\1\170\1\41\1\uffff\1\172\1\uffff";
    static final String DFA30_eofS =
        "\173\uffff";
    static final String DFA30_minS =
        "\1\0\1\157\1\156\1\154\1\155\1\52\2\uffff\1\56\2\uffff\1\162\1\145\1\50\1\uffff\1\60\1\157\1\52\1\51\1\52\2\51\1\135\1\uffff\1\51\1\101\2\uffff\2\0\2\uffff\1\155\1\uffff\1\144\1\143\1\151\1\60\1\157\1\163\1\160\1\60\10\uffff\1\151\1\163\4\uffff\1\60\1\uffff\1\57\1\52\1\51\3\uffff\1\160\1\60\1\157\1\145\1\60\1\uffff\1\155\2\157\1\uffff\1\166\1\164\2\uffff\1\57\3\0\1\51\1\0\1\157\1\uffff\1\162\1\160\1\uffff\1\151\1\60\1\162\1\141\1\60\1\52\1\76\1\0\1\174\1\0\1\156\2\164\1\143\1\uffff\2\164\1\uffff\1\145\4\60\1\145\1\156\4\uffff\1\60\1\164\1\uffff\1\60\1\uffff";
    static final String DFA30_maxS =
        "\1\uffff\1\157\1\170\1\164\1\157\1\52\2\uffff\1\56\2\uffff\1\162\1\145\1\134\1\uffff\1\172\1\157\1\57\3\174\1\134\1\175\1\uffff\1\51\1\172\2\uffff\2\uffff\2\uffff\1\155\1\uffff\1\144\1\160\1\151\1\172\1\157\1\163\1\160\1\172\10\uffff\1\151\1\163\4\uffff\1\172\1\uffff\3\174\3\uffff\1\160\1\172\1\157\1\145\1\172\1\uffff\1\155\2\157\1\uffff\1\166\1\164\2\uffff\1\174\3\uffff\1\174\1\uffff\1\157\1\uffff\1\162\1\160\1\uffff\1\151\1\172\1\162\1\141\1\172\1\174\1\76\1\uffff\1\174\1\uffff\1\156\2\164\1\143\1\uffff\2\164\1\uffff\1\145\4\172\1\145\1\156\4\uffff\1\172\1\164\1\uffff\1\172\1\uffff";
    static final String DFA30_acceptS =
        "\6\uffff\1\7\1\10\1\uffff\1\14\1\15\3\uffff\1\23\10\uffff\1\31\2\uffff\1\33\1\34\2\uffff\1\37\1\40\1\uffff\1\33\10\uffff\1\30\1\6\1\7\1\10\1\32\1\11\1\14\1\15\2\uffff\1\27\1\22\1\23\1\24\1\uffff\1\31\3\uffff\1\34\1\35\1\37\5\uffff\1\13\3\uffff\1\21\2\uffff\1\26\1\36\7\uffff\1\2\2\uffff\1\3\16\uffff\1\25\2\uffff\1\17\7\uffff\1\5\1\12\1\20\1\4\2\uffff\1\16\1\uffff\1\1";
    static final String DFA30_specialS =
        "\1\3\33\uffff\1\5\1\0\61\uffff\1\6\1\1\1\10\1\uffff\1\4\14\uffff\1\7\1\uffff\1\2\30\uffff}>";
    static final String[] DFA30_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\34\4\37\1\35\1\15\1\16\1\26\1\37\1\6\1\37\1\10\1\24\12\33\1\11\1\37\1\22\1\12\1\30\2\37\32\32\1\21\1\25\1\27\1\31\1\17\1\37\1\3\1\32\1\1\1\20\1\2\3\32\1\4\6\32\1\13\3\32\1\14\6\32\1\5\1\23\1\7\uff82\37",
            "\1\40",
            "\1\42\11\uffff\1\43",
            "\1\47\3\uffff\1\44\2\uffff\1\45\1\46",
            "\1\50\1\uffff\1\51",
            "\1\52",
            "",
            "",
            "\1\56",
            "",
            "",
            "\1\62",
            "\1\63",
            "\1\52\1\uffff\1\64\4\uffff\1\52\14\uffff\1\52\37\uffff\1\52",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\70",
            "\1\52\3\uffff\2\52",
            "\1\71\1\52\3\uffff\2\52\14\uffff\1\52\77\uffff\1\52",
            "\1\72\3\uffff\1\72\1\52\16\uffff\1\71\75\uffff\1\73",
            "\2\71\3\uffff\1\71\1\74\16\uffff\1\71\35\uffff\2\71\36\uffff\1\71",
            "\1\71\62\uffff\1\71",
            "\1\71\37\uffff\1\71",
            "",
            "\1\71",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\0\76",
            "\0\76",
            "",
            "",
            "\1\100",
            "",
            "\1\101",
            "\1\103\14\uffff\1\102",
            "\1\104",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\106",
            "\1\107",
            "\1\110",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\112",
            "\1\113",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\52\16\uffff\1\71\75\uffff\1\73",
            "\1\72\3\uffff\1\72\1\52\16\uffff\1\71\75\uffff\1\73",
            "\1\123\1\116\3\uffff\1\116\1\122\16\uffff\1\117\35\uffff\2\121\36\uffff\1\120",
            "",
            "",
            "",
            "\1\124",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\126",
            "\1\127",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "\1\134",
            "\1\135",
            "",
            "",
            "\1\136\16\uffff\1\117\35\uffff\2\121\36\uffff\1\120",
            "\52\115\1\137\3\115\1\137\17\115\1\140\uffc1\115",
            "\52\115\1\141\3\115\1\141\115\115\1\142\uff83\115",
            "\0\115",
            "\1\123\1\116\3\uffff\1\116\1\122\16\uffff\1\117\35\uffff\2\121\36\uffff\1\120",
            "\0\115",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "",
            "\1\146",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\150",
            "\1\151",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\116\3\uffff\1\116\1\136\16\uffff\1\117\35\uffff\2\121\36\uffff\1\120",
            "\1\140",
            "\52\115\1\137\3\115\1\137\17\115\1\140\uffc1\115",
            "\1\142",
            "\52\115\1\141\3\115\1\141\115\115\1\142\uff83\115",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "",
            "\1\161",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\166",
            "\1\167",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\171",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
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
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_ML_COMMENT | RULE_LEFT_ENCLOSER | RULE_RIGHT_ENCLOSER | RULE_DOTS | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_29 = input.LA(1);

                        s = -1;
                        if ( ((LA30_29>='\u0000' && LA30_29<='\uFFFF')) ) {s = 62;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_80 = input.LA(1);

                        s = -1;
                        if ( (LA30_80=='*'||LA30_80=='.') ) {s = 97;}

                        else if ( (LA30_80=='|') ) {s = 98;}

                        else if ( ((LA30_80>='\u0000' && LA30_80<=')')||(LA30_80>='+' && LA30_80<='-')||(LA30_80>='/' && LA30_80<='{')||(LA30_80>='}' && LA30_80<='\uFFFF')) ) {s = 77;}

                        else s = 57;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_98 = input.LA(1);

                        s = -1;
                        if ( (LA30_98=='*'||LA30_98=='.') ) {s = 97;}

                        else if ( (LA30_98=='|') ) {s = 98;}

                        else if ( ((LA30_98>='\u0000' && LA30_98<=')')||(LA30_98>='+' && LA30_98<='-')||(LA30_98>='/' && LA30_98<='{')||(LA30_98>='}' && LA30_98<='\uFFFF')) ) {s = 77;}

                        else s = 57;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
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

                        else if ( (LA30_0==':') ) {s = 9;}

                        else if ( (LA30_0=='=') ) {s = 10;}

                        else if ( (LA30_0=='p') ) {s = 11;}

                        else if ( (LA30_0=='t') ) {s = 12;}

                        else if ( (LA30_0=='(') ) {s = 13;}

                        else if ( (LA30_0==')') ) {s = 14;}

                        else if ( (LA30_0=='_') ) {s = 15;}

                        else if ( (LA30_0=='d') ) {s = 16;}

                        else if ( (LA30_0=='[') ) {s = 17;}

                        else if ( (LA30_0=='<') ) {s = 18;}

                        else if ( (LA30_0=='|') ) {s = 19;}

                        else if ( (LA30_0=='/') ) {s = 20;}

                        else if ( (LA30_0=='\\') ) {s = 21;}

                        else if ( (LA30_0=='*') ) {s = 22;}

                        else if ( (LA30_0==']') ) {s = 23;}

                        else if ( (LA30_0=='>') ) {s = 24;}

                        else if ( (LA30_0=='^') ) {s = 25;}

                        else if ( ((LA30_0>='A' && LA30_0<='Z')||LA30_0=='b'||(LA30_0>='f' && LA30_0<='h')||(LA30_0>='j' && LA30_0<='o')||(LA30_0>='q' && LA30_0<='s')||(LA30_0>='u' && LA30_0<='z')) ) {s = 26;}

                        else if ( ((LA30_0>='0' && LA30_0<='9')) ) {s = 27;}

                        else if ( (LA30_0=='\"') ) {s = 28;}

                        else if ( (LA30_0=='\'') ) {s = 29;}

                        else if ( ((LA30_0>='\t' && LA30_0<='\n')||LA30_0=='\r'||LA30_0==' ') ) {s = 30;}

                        else if ( ((LA30_0>='\u0000' && LA30_0<='\b')||(LA30_0>='\u000B' && LA30_0<='\f')||(LA30_0>='\u000E' && LA30_0<='\u001F')||LA30_0=='!'||(LA30_0>='#' && LA30_0<='&')||LA30_0=='+'||LA30_0=='-'||LA30_0==';'||(LA30_0>='?' && LA30_0<='@')||LA30_0=='`'||(LA30_0>='~' && LA30_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA30_83 = input.LA(1);

                        s = -1;
                        if ( ((LA30_83>='\u0000' && LA30_83<='\uFFFF')) ) {s = 77;}

                        else s = 57;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA30_28 = input.LA(1);

                        s = -1;
                        if ( ((LA30_28>='\u0000' && LA30_28<='\uFFFF')) ) {s = 62;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA30_79 = input.LA(1);

                        s = -1;
                        if ( (LA30_79=='*'||LA30_79=='.') ) {s = 95;}

                        else if ( (LA30_79=='>') ) {s = 96;}

                        else if ( ((LA30_79>='\u0000' && LA30_79<=')')||(LA30_79>='+' && LA30_79<='-')||(LA30_79>='/' && LA30_79<='=')||(LA30_79>='?' && LA30_79<='\uFFFF')) ) {s = 77;}

                        else s = 57;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA30_96 = input.LA(1);

                        s = -1;
                        if ( (LA30_96=='*'||LA30_96=='.') ) {s = 95;}

                        else if ( (LA30_96=='>') ) {s = 96;}

                        else if ( ((LA30_96>='\u0000' && LA30_96<=')')||(LA30_96>='+' && LA30_96<='-')||(LA30_96>='/' && LA30_96<='=')||(LA30_96>='?' && LA30_96<='\uFFFF')) ) {s = 77;}

                        else s = 57;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA30_81 = input.LA(1);

                        s = -1;
                        if ( ((LA30_81>='\u0000' && LA30_81<='\uFFFF')) ) {s = 77;}

                        else s = 57;

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