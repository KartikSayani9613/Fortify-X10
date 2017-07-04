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
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
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

    public InternalFortXTransLexer() {;} 
    public InternalFortXTransLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFortXTransLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalFortXTrans.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:22:7: ( '(' )
            // InternalFortXTrans.g:22:9: '('
            {
            match('('); 

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
            // InternalFortXTrans.g:23:7: ( ')' )
            // InternalFortXTrans.g:23:9: ')'
            {
            match(')'); 

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
            // InternalFortXTrans.g:24:7: ( ':' )
            // InternalFortXTrans.g:24:9: ':'
            {
            match(':'); 

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
            // InternalFortXTrans.g:25:7: ( 'private' )
            // InternalFortXTrans.g:25:9: 'private'
            {
            match("private"); 


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
            // InternalFortXTrans.g:26:7: ( 'test' )
            // InternalFortXTrans.g:26:9: 'test'
            {
            match("test"); 


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
            // InternalFortXTrans.g:27:7: ( 'atomic' )
            // InternalFortXTrans.g:27:9: 'atomic'
            {
            match("atomic"); 


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
            // InternalFortXTrans.g:28:7: ( 'io' )
            // InternalFortXTrans.g:28:9: 'io'
            {
            match("io"); 


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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:30:7: ( '|' )
            // InternalFortXTrans.g:30:9: '|'
            {
            match('|'); 

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
            // InternalFortXTrans.g:31:7: ( 'OR' )
            // InternalFortXTrans.g:31:9: 'OR'
            {
            match("OR"); 


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
            // InternalFortXTrans.g:32:7: ( 'AND' )
            // InternalFortXTrans.g:32:9: 'AND'
            {
            match("AND"); 


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
            // InternalFortXTrans.g:33:7: ( '===' )
            // InternalFortXTrans.g:33:9: '==='
            {
            match("==="); 


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
            // InternalFortXTrans.g:34:7: ( '=/=' )
            // InternalFortXTrans.g:34:9: '=/='
            {
            match("=/="); 


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
            // InternalFortXTrans.g:35:7: ( 'EQ' )
            // InternalFortXTrans.g:35:9: 'EQ'
            {
            match("EQ"); 


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
            // InternalFortXTrans.g:36:7: ( 'NE' )
            // InternalFortXTrans.g:36:9: 'NE'
            {
            match("NE"); 


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
            // InternalFortXTrans.g:37:7: ( '>=' )
            // InternalFortXTrans.g:37:9: '>='
            {
            match(">="); 


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
            // InternalFortXTrans.g:38:7: ( '<=' )
            // InternalFortXTrans.g:38:9: '<='
            {
            match("<="); 


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
            // InternalFortXTrans.g:39:7: ( '>' )
            // InternalFortXTrans.g:39:9: '>'
            {
            match('>'); 

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
            // InternalFortXTrans.g:40:7: ( '<' )
            // InternalFortXTrans.g:40:9: '<'
            {
            match('<'); 

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
            // InternalFortXTrans.g:41:7: ( 'LT' )
            // InternalFortXTrans.g:41:9: 'LT'
            {
            match("LT"); 


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
            // InternalFortXTrans.g:42:7: ( 'GT' )
            // InternalFortXTrans.g:42:9: 'GT'
            {
            match("GT"); 


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
            // InternalFortXTrans.g:43:7: ( 'LE' )
            // InternalFortXTrans.g:43:9: 'LE'
            {
            match("LE"); 


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
            // InternalFortXTrans.g:44:7: ( 'GE' )
            // InternalFortXTrans.g:44:9: 'GE'
            {
            match("GE"); 


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
            // InternalFortXTrans.g:45:7: ( '+' )
            // InternalFortXTrans.g:45:9: '+'
            {
            match('+'); 

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
            // InternalFortXTrans.g:46:7: ( '-' )
            // InternalFortXTrans.g:46:9: '-'
            {
            match('-'); 

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
            // InternalFortXTrans.g:47:7: ( '/' )
            // InternalFortXTrans.g:47:9: '/'
            {
            match('/'); 

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
            // InternalFortXTrans.g:48:7: ( '*' )
            // InternalFortXTrans.g:48:9: '*'
            {
            match('*'); 

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
            // InternalFortXTrans.g:49:7: ( '^' )
            // InternalFortXTrans.g:49:9: '^'
            {
            match('^'); 

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
            // InternalFortXTrans.g:50:7: ( ':=' )
            // InternalFortXTrans.g:50:9: ':='
            {
            match(":="); 


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
            // InternalFortXTrans.g:51:7: ( '[\\\\' )
            // InternalFortXTrans.g:51:9: '[\\\\'
            {
            match("[\\"); 


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
            // InternalFortXTrans.g:52:7: ( '\\\\]' )
            // InternalFortXTrans.g:52:9: '\\\\]'
            {
            match("\\]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:53:7: ( 'fn' )
            // InternalFortXTrans.g:53:9: 'fn'
            {
            match("fn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:54:7: ( '=>' )
            // InternalFortXTrans.g:54:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:55:7: ( '[' )
            // InternalFortXTrans.g:55:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:56:7: ( ']' )
            // InternalFortXTrans.g:56:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:57:7: ( '!' )
            // InternalFortXTrans.g:57:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:58:7: ( 'return' )
            // InternalFortXTrans.g:58:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:59:7: ( 'while' )
            // InternalFortXTrans.g:59:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:60:7: ( 'for' )
            // InternalFortXTrans.g:60:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:61:7: ( 'if' )
            // InternalFortXTrans.g:61:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:62:7: ( 'then' )
            // InternalFortXTrans.g:62:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:63:7: ( 'elif' )
            // InternalFortXTrans.g:63:9: 'elif'
            {
            match("elif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:64:7: ( 'else' )
            // InternalFortXTrans.g:64:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:65:7: ( '<-' )
            // InternalFortXTrans.g:65:9: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:66:7: ( 'seq' )
            // InternalFortXTrans.g:66:9: 'seq'
            {
            match("seq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:67:7: ( '#' )
            // InternalFortXTrans.g:67:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:68:7: ( 'also' )
            // InternalFortXTrans.g:68:9: 'also'
            {
            match("also"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:69:7: ( 'at' )
            // InternalFortXTrans.g:69:9: 'at'
            {
            match("at"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:70:7: ( 'do' )
            // InternalFortXTrans.g:70:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:71:7: ( 'var' )
            // InternalFortXTrans.g:71:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:72:7: ( 'true' )
            // InternalFortXTrans.g:72:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:73:7: ( 'false' )
            // InternalFortXTrans.g:73:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:5594:17: ( '(*' ( options {greedy=false; } : . )* '*)' )
            // InternalFortXTrans.g:5594:19: '(*' ( options {greedy=false; } : . )* '*)'
            {
            match("(*"); 

            // InternalFortXTrans.g:5594:24: ( options {greedy=false; } : . )*
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
            	    // InternalFortXTrans.g:5594:52: .
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
            // InternalFortXTrans.g:5596:12: ( RULE_INT '.' RULE_INT )
            // InternalFortXTrans.g:5596:14: RULE_INT '.' RULE_INT
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

    // $ANTLR start "RULE_DOTS"
    public final void mRULE_DOTS() throws RecognitionException {
        try {
            int _type = RULE_DOTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFortXTrans.g:5598:11: ( '...' )
            // InternalFortXTrans.g:5598:13: '...'
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
            // InternalFortXTrans.g:5600:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalFortXTrans.g:5600:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalFortXTrans.g:5600:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFortXTrans.g:5600:11: '^'
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

            // InternalFortXTrans.g:5600:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    break loop3;
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
            // InternalFortXTrans.g:5602:10: ( ( '0' .. '9' )+ )
            // InternalFortXTrans.g:5602:12: ( '0' .. '9' )+
            {
            // InternalFortXTrans.g:5602:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFortXTrans.g:5602:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // InternalFortXTrans.g:5604:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalFortXTrans.g:5604:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalFortXTrans.g:5604:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFortXTrans.g:5604:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalFortXTrans.g:5604:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalFortXTrans.g:5604:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFortXTrans.g:5604:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalFortXTrans.g:5604:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalFortXTrans.g:5604:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalFortXTrans.g:5604:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFortXTrans.g:5604:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // InternalFortXTrans.g:5606:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalFortXTrans.g:5606:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalFortXTrans.g:5606:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFortXTrans.g:5606:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalFortXTrans.g:5606:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFortXTrans.g:5606:41: ( '\\r' )? '\\n'
                    {
                    // InternalFortXTrans.g:5606:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalFortXTrans.g:5606:41: '\\r'
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
            // InternalFortXTrans.g:5608:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalFortXTrans.g:5608:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalFortXTrans.g:5608:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // InternalFortXTrans.g:5610:16: ( . )
            // InternalFortXTrans.g:5610:18: .
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
        // InternalFortXTrans.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | RULE_ML_COMMENT | RULE_FLOAT | RULE_DOTS | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=72;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalFortXTrans.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalFortXTrans.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalFortXTrans.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalFortXTrans.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalFortXTrans.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalFortXTrans.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalFortXTrans.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalFortXTrans.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalFortXTrans.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalFortXTrans.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalFortXTrans.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalFortXTrans.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalFortXTrans.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalFortXTrans.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalFortXTrans.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalFortXTrans.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalFortXTrans.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalFortXTrans.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalFortXTrans.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalFortXTrans.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalFortXTrans.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalFortXTrans.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalFortXTrans.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalFortXTrans.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalFortXTrans.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalFortXTrans.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalFortXTrans.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalFortXTrans.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalFortXTrans.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalFortXTrans.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalFortXTrans.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalFortXTrans.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalFortXTrans.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalFortXTrans.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // InternalFortXTrans.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // InternalFortXTrans.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // InternalFortXTrans.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // InternalFortXTrans.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // InternalFortXTrans.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // InternalFortXTrans.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // InternalFortXTrans.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // InternalFortXTrans.g:1:256: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // InternalFortXTrans.g:1:262: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // InternalFortXTrans.g:1:268: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // InternalFortXTrans.g:1:274: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // InternalFortXTrans.g:1:280: T__58
                {
                mT__58(); 

                }
                break;
            case 47 :
                // InternalFortXTrans.g:1:286: T__59
                {
                mT__59(); 

                }
                break;
            case 48 :
                // InternalFortXTrans.g:1:292: T__60
                {
                mT__60(); 

                }
                break;
            case 49 :
                // InternalFortXTrans.g:1:298: T__61
                {
                mT__61(); 

                }
                break;
            case 50 :
                // InternalFortXTrans.g:1:304: T__62
                {
                mT__62(); 

                }
                break;
            case 51 :
                // InternalFortXTrans.g:1:310: T__63
                {
                mT__63(); 

                }
                break;
            case 52 :
                // InternalFortXTrans.g:1:316: T__64
                {
                mT__64(); 

                }
                break;
            case 53 :
                // InternalFortXTrans.g:1:322: T__65
                {
                mT__65(); 

                }
                break;
            case 54 :
                // InternalFortXTrans.g:1:328: T__66
                {
                mT__66(); 

                }
                break;
            case 55 :
                // InternalFortXTrans.g:1:334: T__67
                {
                mT__67(); 

                }
                break;
            case 56 :
                // InternalFortXTrans.g:1:340: T__68
                {
                mT__68(); 

                }
                break;
            case 57 :
                // InternalFortXTrans.g:1:346: T__69
                {
                mT__69(); 

                }
                break;
            case 58 :
                // InternalFortXTrans.g:1:352: T__70
                {
                mT__70(); 

                }
                break;
            case 59 :
                // InternalFortXTrans.g:1:358: T__71
                {
                mT__71(); 

                }
                break;
            case 60 :
                // InternalFortXTrans.g:1:364: T__72
                {
                mT__72(); 

                }
                break;
            case 61 :
                // InternalFortXTrans.g:1:370: T__73
                {
                mT__73(); 

                }
                break;
            case 62 :
                // InternalFortXTrans.g:1:376: T__74
                {
                mT__74(); 

                }
                break;
            case 63 :
                // InternalFortXTrans.g:1:382: T__75
                {
                mT__75(); 

                }
                break;
            case 64 :
                // InternalFortXTrans.g:1:388: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 65 :
                // InternalFortXTrans.g:1:404: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 66 :
                // InternalFortXTrans.g:1:415: RULE_DOTS
                {
                mRULE_DOTS(); 

                }
                break;
            case 67 :
                // InternalFortXTrans.g:1:425: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 68 :
                // InternalFortXTrans.g:1:433: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 69 :
                // InternalFortXTrans.g:1:442: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 70 :
                // InternalFortXTrans.g:1:454: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 71 :
                // InternalFortXTrans.g:1:470: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 72 :
                // InternalFortXTrans.g:1:478: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\4\57\3\uffff\1\76\1\100\1\uffff\1\103\2\57\1\113\1\uffff\4\57\1\122\1\125\2\57\2\uffff\1\135\1\uffff\1\137\1\141\1\55\1\57\2\uffff\3\57\1\uffff\2\57\1\156\1\uffff\2\55\2\uffff\1\57\1\uffff\4\57\1\172\1\174\2\57\1\177\1\u0080\12\uffff\4\57\5\uffff\1\u0085\1\57\1\u0087\1\u0088\5\uffff\1\u0089\1\u008a\1\u008b\1\u008c\11\uffff\1\u008d\2\57\2\uffff\3\57\1\uffff\1\u0093\1\57\1\uffff\1\156\3\uffff\1\57\1\u0096\4\57\1\u009b\1\uffff\1\57\1\uffff\2\57\2\uffff\4\57\1\uffff\1\u00a3\7\uffff\1\u00a4\3\57\1\u00a8\1\uffff\1\u00a9\1\57\1\uffff\2\57\1\u00ad\1\u00ae\1\uffff\1\57\1\u00b0\2\57\1\u00b3\1\u00b4\1\u00b5\2\uffff\3\57\2\uffff\3\57\2\uffff\1\57\1\uffff\2\57\3\uffff\1\u00bf\1\57\1\u00c1\1\57\1\u00c3\1\u00c4\1\u00c5\1\u00c6\1\57\1\uffff\1\u00c8\1\uffff\1\57\4\uffff\1\u00ca\1\uffff\1\57\1\uffff\1\u00cc\1\uffff";
    static final String DFA12_eofS =
        "\u00cd\uffff";
    static final String DFA12_minS =
        "\1\0\1\157\2\154\1\146\3\uffff\1\56\1\52\1\uffff\1\75\1\162\1\145\1\57\1\uffff\1\122\1\116\1\121\1\105\1\75\1\55\2\105\2\uffff\1\57\1\uffff\1\101\1\134\1\135\1\141\2\uffff\1\145\1\150\1\145\1\uffff\1\157\1\141\1\56\1\uffff\2\0\2\uffff\1\155\1\uffff\1\144\1\143\2\151\2\60\1\163\1\160\2\60\12\uffff\1\151\1\163\1\145\1\165\5\uffff\1\60\1\104\2\60\5\uffff\4\60\11\uffff\1\60\1\162\1\154\2\uffff\1\164\1\151\1\161\1\uffff\1\60\1\162\1\uffff\1\56\3\uffff\1\160\1\60\1\157\1\145\1\146\1\145\1\60\1\uffff\1\155\1\uffff\2\157\2\uffff\1\166\1\164\1\156\1\145\1\uffff\1\60\7\uffff\1\60\1\163\1\165\1\154\1\60\1\uffff\1\60\1\157\1\uffff\1\162\1\160\2\60\1\uffff\1\151\1\60\1\162\1\141\3\60\2\uffff\1\145\1\162\1\145\2\uffff\1\156\2\164\2\uffff\1\143\1\uffff\2\164\3\uffff\1\60\1\156\1\60\1\145\4\60\1\145\1\uffff\1\60\1\uffff\1\156\4\uffff\1\60\1\uffff\1\164\1\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\157\1\170\1\164\1\157\3\uffff\1\56\1\52\1\uffff\1\75\2\162\1\76\1\uffff\1\122\1\116\1\121\1\105\2\75\2\124\2\uffff\1\57\1\uffff\1\172\1\134\1\135\1\157\2\uffff\1\145\1\150\1\145\1\uffff\1\157\1\141\1\71\1\uffff\2\uffff\2\uffff\1\155\1\uffff\1\144\1\160\1\163\1\151\2\172\1\163\1\160\2\172\12\uffff\1\151\1\163\1\145\1\165\5\uffff\1\172\1\104\2\172\5\uffff\4\172\11\uffff\1\172\1\162\1\154\2\uffff\1\164\1\151\1\161\1\uffff\1\172\1\162\1\uffff\1\71\3\uffff\1\160\1\172\1\157\1\145\1\146\1\145\1\172\1\uffff\1\155\1\uffff\2\157\2\uffff\1\166\1\164\1\156\1\145\1\uffff\1\172\7\uffff\1\172\1\163\1\165\1\154\1\172\1\uffff\1\172\1\157\1\uffff\1\162\1\160\2\172\1\uffff\1\151\1\172\1\162\1\141\3\172\2\uffff\1\145\1\162\1\145\2\uffff\1\156\2\164\2\uffff\1\143\1\uffff\2\164\3\uffff\1\172\1\156\1\172\1\145\4\172\1\145\1\uffff\1\172\1\uffff\1\156\4\uffff\1\172\1\uffff\1\164\1\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\5\uffff\1\6\1\7\1\10\2\uffff\1\15\4\uffff\1\24\10\uffff\1\43\1\44\1\uffff\1\46\4\uffff\1\56\1\57\3\uffff\1\71\3\uffff\1\103\2\uffff\1\107\1\110\1\uffff\1\103\12\uffff\1\6\1\7\1\10\1\102\1\11\1\100\1\14\1\15\1\50\1\16\4\uffff\1\27\1\30\1\54\1\23\1\24\4\uffff\1\33\1\35\1\34\1\67\1\36\4\uffff\1\43\1\44\1\106\1\45\1\46\1\47\1\51\1\55\1\52\3\uffff\1\56\1\57\3\uffff\1\71\2\uffff\1\104\1\uffff\1\101\1\105\1\107\7\uffff\1\13\1\uffff\1\73\2\uffff\1\22\1\63\4\uffff\1\25\1\uffff\1\31\1\32\1\37\1\41\1\40\1\42\1\53\5\uffff\1\74\2\uffff\1\2\4\uffff\1\3\7\uffff\1\26\1\62\3\uffff\1\70\1\75\3\uffff\1\65\1\66\1\uffff\1\72\2\uffff\1\20\1\64\1\76\11\uffff\1\77\1\uffff\1\61\1\uffff\1\5\1\12\1\21\1\4\1\uffff\1\60\1\uffff\1\17\1\uffff\1\1";
    static final String DFA12_specialS =
        "\1\1\51\uffff\1\2\1\0\u00a1\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\55\2\54\2\55\1\54\22\55\1\54\1\41\1\52\1\45\3\55\1\53\1\11\1\12\1\33\1\30\1\6\1\31\1\10\1\32\12\50\1\13\1\55\1\25\1\16\1\24\2\55\1\21\3\51\1\22\1\51\1\27\4\51\1\26\1\51\1\23\1\20\13\51\1\35\1\36\1\40\1\34\1\51\1\55\1\3\1\51\1\1\1\46\1\2\1\37\2\51\1\4\6\51\1\14\1\51\1\42\1\44\1\15\1\51\1\47\1\43\3\51\1\5\1\17\1\7\uff82\55",
            "\1\56",
            "\1\62\1\uffff\1\60\11\uffff\1\61",
            "\1\66\3\uffff\1\63\2\uffff\1\64\1\65",
            "\1\71\6\uffff\1\67\1\uffff\1\70",
            "",
            "",
            "",
            "\1\75",
            "\1\77",
            "",
            "\1\102",
            "\1\104",
            "\1\105\2\uffff\1\106\11\uffff\1\107",
            "\1\111\15\uffff\1\110\1\112",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\124\17\uffff\1\123",
            "\1\127\16\uffff\1\126",
            "\1\131\16\uffff\1\130",
            "",
            "",
            "\1\134",
            "",
            "\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\140",
            "\1\142",
            "\1\145\14\uffff\1\143\1\144",
            "",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "\1\154",
            "\1\155",
            "\1\160\1\uffff\12\157",
            "",
            "\0\161",
            "\0\161",
            "",
            "",
            "\1\163",
            "",
            "\1\164",
            "\1\166\14\uffff\1\165",
            "\1\167\11\uffff\1\170",
            "\1\171",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\173\13\57",
            "\1\175",
            "\1\176",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0086",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u008e",
            "\1\u008f",
            "",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0094",
            "",
            "\1\160\1\uffff\12\157",
            "",
            "",
            "",
            "\1\u0095",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u009c",
            "",
            "\1\u009d",
            "\1\u009e",
            "",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00af",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00b1",
            "\1\u00b2",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "",
            "\1\u00bc",
            "",
            "\1\u00bd",
            "\1\u00be",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00c0",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00c2",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00c7",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00c9",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00cb",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | RULE_ML_COMMENT | RULE_FLOAT | RULE_DOTS | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_43 = input.LA(1);

                        s = -1;
                        if ( ((LA12_43>='\u0000' && LA12_43<='\uFFFF')) ) {s = 113;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='c') ) {s = 1;}

                        else if ( (LA12_0=='e') ) {s = 2;}

                        else if ( (LA12_0=='a') ) {s = 3;}

                        else if ( (LA12_0=='i') ) {s = 4;}

                        else if ( (LA12_0=='{') ) {s = 5;}

                        else if ( (LA12_0==',') ) {s = 6;}

                        else if ( (LA12_0=='}') ) {s = 7;}

                        else if ( (LA12_0=='.') ) {s = 8;}

                        else if ( (LA12_0=='(') ) {s = 9;}

                        else if ( (LA12_0==')') ) {s = 10;}

                        else if ( (LA12_0==':') ) {s = 11;}

                        else if ( (LA12_0=='p') ) {s = 12;}

                        else if ( (LA12_0=='t') ) {s = 13;}

                        else if ( (LA12_0=='=') ) {s = 14;}

                        else if ( (LA12_0=='|') ) {s = 15;}

                        else if ( (LA12_0=='O') ) {s = 16;}

                        else if ( (LA12_0=='A') ) {s = 17;}

                        else if ( (LA12_0=='E') ) {s = 18;}

                        else if ( (LA12_0=='N') ) {s = 19;}

                        else if ( (LA12_0=='>') ) {s = 20;}

                        else if ( (LA12_0=='<') ) {s = 21;}

                        else if ( (LA12_0=='L') ) {s = 22;}

                        else if ( (LA12_0=='G') ) {s = 23;}

                        else if ( (LA12_0=='+') ) {s = 24;}

                        else if ( (LA12_0=='-') ) {s = 25;}

                        else if ( (LA12_0=='/') ) {s = 26;}

                        else if ( (LA12_0=='*') ) {s = 27;}

                        else if ( (LA12_0=='^') ) {s = 28;}

                        else if ( (LA12_0=='[') ) {s = 29;}

                        else if ( (LA12_0=='\\') ) {s = 30;}

                        else if ( (LA12_0=='f') ) {s = 31;}

                        else if ( (LA12_0==']') ) {s = 32;}

                        else if ( (LA12_0=='!') ) {s = 33;}

                        else if ( (LA12_0=='r') ) {s = 34;}

                        else if ( (LA12_0=='w') ) {s = 35;}

                        else if ( (LA12_0=='s') ) {s = 36;}

                        else if ( (LA12_0=='#') ) {s = 37;}

                        else if ( (LA12_0=='d') ) {s = 38;}

                        else if ( (LA12_0=='v') ) {s = 39;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 40;}

                        else if ( ((LA12_0>='B' && LA12_0<='D')||LA12_0=='F'||(LA12_0>='H' && LA12_0<='K')||LA12_0=='M'||(LA12_0>='P' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='o')||LA12_0=='q'||LA12_0=='u'||(LA12_0>='x' && LA12_0<='z')) ) {s = 41;}

                        else if ( (LA12_0=='\"') ) {s = 42;}

                        else if ( (LA12_0=='\'') ) {s = 43;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 44;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='$' && LA12_0<='&')||LA12_0==';'||(LA12_0>='?' && LA12_0<='@')||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_42 = input.LA(1);

                        s = -1;
                        if ( ((LA12_42>='\u0000' && LA12_42<='\uFFFF')) ) {s = 113;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}