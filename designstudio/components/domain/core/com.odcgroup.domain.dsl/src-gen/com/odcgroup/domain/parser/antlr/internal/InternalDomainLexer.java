package com.odcgroup.domain.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainLexer extends Lexer {
    public static final int RULE_VALUE=7;
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int RULE_ML_DOC=5;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_URI=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators

    public InternalDomainLexer() {;} 
    public InternalDomainLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDomainLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:11:7: ( 'Domain' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:11:9: 'Domain'
            {
            match("Domain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:12:7: ( 'namespace' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:12:9: 'namespace'
            {
            match("namespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:13:7: ( 'metamodelVersion' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:13:9: 'metamodelVersion'
            {
            match("metamodelVersion"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:14:7: ( 'deprecationInfo' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:14:9: 'deprecationInfo'
            {
            match("deprecationInfo"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:15:7: ( 'Classes' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:15:9: 'Classes'
            {
            match("Classes"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:16:7: ( '{' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:16:9: '{'
            {
            match('{'); 

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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:17:7: ( '}' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:17:9: '}'
            {
            match('}'); 

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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:18:7: ( 'Datasets' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:18:9: 'Datasets'
            {
            match("Datasets"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:19:7: ( 'BusinessTypes' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:19:9: 'BusinessTypes'
            {
            match("BusinessTypes"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:20:7: ( 'Enumerations' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:20:9: 'Enumerations'
            {
            match("Enumerations"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:21:7: ( 'version=' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:21:9: 'version='
            {
            match("version="); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:22:7: ( 'comment=' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:22:9: 'comment='
            {
            match("comment="); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:23:7: ( '@' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:23:9: '@'
            {
            match('@'); 

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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:24:7: ( ':' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:24:9: ':'
            {
            match(':'); 

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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:25:7: ( '(' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:25:9: '('
            {
            match('('); 

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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:26:7: ( ',' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:26:9: ','
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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:27:7: ( ')' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:27:9: ')'
            {
            match(')'); 

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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:28:7: ( 'abstract' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:28:9: 'abstract'
            {
            match("abstract"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:29:7: ( 'secured' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:29:9: 'secured'
            {
            match("secured"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:30:7: ( 'extends' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:30:9: 'extends'
            {
            match("extends"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:31:7: ( 'basedOn' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:31:9: 'basedOn'
            {
            match("basedOn"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:32:7: ( 'default' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:32:9: 'default'
            {
            match("default"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:33:7: ( 'synchronized' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:33:9: 'synchronized'
            {
            match("synchronized"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:34:7: ( 'acceptNullValue' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:34:9: 'acceptNullValue'
            {
            match("acceptNullValue"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:35:7: ( 'cDATA' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:35:9: 'cDATA'
            {
            match("cDATA"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:36:7: ( '=' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:36:9: '='
            {
            match('='); 

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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:37:7: ( 'BK' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:37:9: 'BK'
            {
            match("BK"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:38:7: ( 'PK' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:38:9: 'PK'
            {
            match("PK"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:39:7: ( 'required' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:39:9: 'required'
            {
            match("required"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:40:7: ( '->' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:40:9: '->'
            {
            match("->"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:41:7: ( 'reverse' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:41:9: 'reverse'
            {
            match("reverse"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:42:7: ( '<-' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:42:9: '<-'
            {
            match("<-"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:43:7: ( 'singleValued' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:43:9: 'singleValued'
            {
            match("singleValued"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:44:7: ( '[' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:44:9: '['
            {
            match('['); 

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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:45:7: ( ']' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:45:9: ']'
            {
            match(']'); 

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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:46:7: ( 'notUnique' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:46:9: 'notUnique'
            {
            match("notUnique"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:47:7: ( '*' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:47:9: '*'
            {
            match('*'); 

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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:48:7: ( 'ONE' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:48:9: 'ONE'
            {
            match("ONE"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:49:7: ( 'byReference' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:49:9: 'byReference'
            {
            match("byReference"); 


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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:50:7: ( 'byValue' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:50:9: 'byValue'
            {
            match("byValue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "RULE_ML_DOC"
    public final void mRULE_ML_DOC() throws RecognitionException {
        try {
            int _type = RULE_ML_DOC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2495:13: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2495:15: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2495:20: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2495:48: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_DOC"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2497:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2497:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2497:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2497:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop2;
                }
            } while (true);

            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2497:39: ( ( '\\r' )? '\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2497:40: ( '\\r' )? '\\n'
                    {
                    // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2497:40: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2497:40: '\\r'
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
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2499:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2499:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2499:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2501:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '0' .. '9' )* )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2501:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '0' .. '9' )*
            {
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2501:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2501:11: '^'
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

            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2501:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='-' && LA7_0<='.')||(LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
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

    // $ANTLR start "RULE_VALUE"
    public final void mRULE_VALUE() throws RecognitionException {
        try {
            int _type = RULE_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2503:12: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '&' | '/' | '%' | '.' | '-' | '\\u00E9' | '\\u00E8' | '\\u00E0' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00C4' | '\\u00D6' | '\\u00DC' | '\\u00C9' | '\\u00C8' | '\\u00C0' | '\\u00E7' | '\\u00DF' )+ )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2503:14: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '&' | '/' | '%' | '.' | '-' | '\\u00E9' | '\\u00E8' | '\\u00E0' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00C4' | '\\u00D6' | '\\u00DC' | '\\u00C9' | '\\u00C8' | '\\u00C0' | '\\u00E7' | '\\u00DF' )+
            {
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2503:14: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '&' | '/' | '%' | '.' | '-' | '\\u00E9' | '\\u00E8' | '\\u00E0' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00C4' | '\\u00D6' | '\\u00DC' | '\\u00C9' | '\\u00C8' | '\\u00C0' | '\\u00E7' | '\\u00DF' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='%' && LA8_0<='&')||(LA8_0>='-' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')||LA8_0=='\u00C0'||LA8_0=='\u00C4'||(LA8_0>='\u00C8' && LA8_0<='\u00C9')||LA8_0=='\u00D6'||LA8_0=='\u00DC'||(LA8_0>='\u00DF' && LA8_0<='\u00E0')||LA8_0=='\u00E4'||(LA8_0>='\u00E7' && LA8_0<='\u00E9')||LA8_0=='\u00F6'||LA8_0=='\u00FC') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:
            	    {
            	    if ( (input.LA(1)>='%' && input.LA(1)<='&')||(input.LA(1)>='-' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00C0'||input.LA(1)=='\u00C4'||(input.LA(1)>='\u00C8' && input.LA(1)<='\u00C9')||input.LA(1)=='\u00D6'||input.LA(1)=='\u00DC'||(input.LA(1)>='\u00DF' && input.LA(1)<='\u00E0')||input.LA(1)=='\u00E4'||(input.LA(1)>='\u00E7' && input.LA(1)<='\u00E9')||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VALUE"

    // $ANTLR start "RULE_URI"
    public final void mRULE_URI() throws RecognitionException {
        try {
            int _type = RULE_URI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2505:10: ( ( 'resource:///' | 'platform:/' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '&' | '/' | '%' | '.' | '-' )+ )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2505:12: ( 'resource:///' | 'platform:/' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '&' | '/' | '%' | '.' | '-' )+
            {
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2505:12: ( 'resource:///' | 'platform:/' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='r') ) {
                alt9=1;
            }
            else if ( (LA9_0=='p') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2505:13: 'resource:///'
                    {
                    match("resource:///");


                    }
                    break;
                case 2 :
                    // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2505:28: 'platform:/'
                    {
                    match("platform:/");


                    }
                    break;

            }

            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2505:42: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '&' | '/' | '%' | '.' | '-' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='%' && LA10_0<='&')||(LA10_0>='-' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:
            	    {
            	    if ( (input.LA(1)>='%' && input.LA(1)<='&')||(input.LA(1)>='-' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
		    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_URI"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2507:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2507:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2507:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\\') ) {
                    alt11=1;
                }
                else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2507:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:2507:61: ~ ( ( '\\\\' | '\"' ) )
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
		    break loop11;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    public void mTokens() throws RecognitionException {
        // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_ML_DOC | RULE_SL_COMMENT | RULE_WS | RULE_ID | RULE_VALUE | RULE_URI | RULE_STRING )
        int alt12=47;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:250: RULE_ML_DOC
                {
                mRULE_ML_DOC(); 

                }
                break;
            case 42 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:262: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 43 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:278: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 44 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:286: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 45 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:294: RULE_VALUE
                {
                mRULE_VALUE(); 

                }
                break;
            case 46 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:305: RULE_URI
                {
                mRULE_URI(); 

                }
                break;
            case 47 :
                // ../com.odcgroup.domain.dsl/src-gen/com/odcgroup/domain/parser/antlr/internal/InternalDomain.g:1:314: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\5\41\2\uffff\4\41\5\uffff\4\41\1\uffff\2\41\1\43\4\uffff"+
        "\1\41\1\43\3\uffff\1\41\1\uffff\1\41\1\uffff\11\41\1\113\14\41\1"+
        "\131\1\41\1\uffff\1\41\1\uffff\12\41\1\uffff\15\41\1\uffff\3\41"+
        "\1\170\32\41\1\uffff\15\41\1\u00a0\15\41\1\u00ae\13\41\1\uffff\15"+
        "\41\1\uffff\5\41\1\u00cc\1\u00cd\6\41\1\u00d4\2\41\1\u00d7\1\u00d8"+
        "\1\41\1\u00da\1\41\1\u00dc\2\41\1\u00df\4\41\2\uffff\2\41\2\uffff"+
        "\1\u00e6\1\41\1\uffff\2\41\2\uffff\1\41\1\uffff\1\u00eb\1\uffff"+
        "\2\41\1\uffff\1\u00ed\1\u00ee\4\41\1\uffff\4\41\4\uffff\17\41\1"+
        "\u0106\3\41\1\u010a\1\41\1\u010c\1\u010d\1\uffff\2\41\1\u0110\1"+
        "\uffff\1\41\2\uffff\2\41\1\uffff\2\41\1\u0116\1\u0117\1\u0118\3"+
        "\uffff";
    static final String DFA12_eofS =
        "\u0119\uffff";
    static final String DFA12_minS =
        "\1\11\5\45\2\uffff\4\45\5\uffff\4\45\1\uffff\2\45\1\76\4\uffff"+
        "\1\45\1\52\3\uffff\1\45\1\uffff\1\45\1\uffff\30\45\1\uffff\1\45"+
        "\1\uffff\12\45\1\uffff\15\45\1\uffff\36\45\1\uffff\47\45\1\uffff"+
        "\15\45\1\uffff\35\45\2\uffff\2\45\2\uffff\2\45\1\uffff\2\45\2\uffff"+
        "\1\45\1\uffff\1\45\1\uffff\2\45\1\uffff\6\45\1\uffff\4\45\4\uffff"+
        "\27\45\1\uffff\3\45\1\uffff\1\45\2\uffff\2\45\1\uffff\5\45\3\uffff";
    static final String DFA12_maxS =
        "\6\u00fc\2\uffff\4\u00fc\5\uffff\4\u00fc\1\uffff\2\u00fc\1\76\4"+
        "\uffff\1\u00fc\1\52\3\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\30\u00fc"+
        "\1\uffff\1\u00fc\1\uffff\12\u00fc\1\uffff\15\u00fc\1\uffff\36\u00fc"+
        "\1\uffff\47\u00fc\1\uffff\15\u00fc\1\uffff\35\u00fc\2\uffff\2\u00fc"+
        "\2\uffff\2\u00fc\1\uffff\2\u00fc\2\uffff\1\u00fc\1\uffff\1\u00fc"+
        "\1\uffff\2\u00fc\1\uffff\6\u00fc\1\uffff\4\u00fc\4\uffff\27\u00fc"+
        "\1\uffff\3\u00fc\1\uffff\1\u00fc\2\uffff\2\u00fc\1\uffff\5\u00fc"+
        "\3\uffff";
    static final String DFA12_acceptS =
        "\6\uffff\1\6\1\7\4\uffff\1\15\1\16\1\17\1\20\1\21\4\uffff\1\32"+
        "\3\uffff\1\40\1\42\1\43\1\45\2\uffff\1\52\1\53\1\54\1\uffff\1\55"+
        "\1\uffff\1\57\30\uffff\1\36\1\uffff\1\51\12\uffff\1\33\15\uffff"+
        "\1\34\36\uffff\1\46\47\uffff\1\31\15\uffff\1\1\35\uffff\1\26\1\5"+
        "\2\uffff\1\13\1\14\2\uffff\1\23\2\uffff\1\24\1\25\1\uffff\1\50\1"+
        "\uffff\1\37\2\uffff\1\10\6\uffff\1\22\4\uffff\1\35\1\56\1\2\1\44"+
        "\27\uffff\1\47\3\uffff\1\12\1\uffff\1\27\1\41\2\uffff\1\11\5\uffff"+
        "\1\4\1\30\1\3";
    static final String DFA12_specialS =
        "\u0119\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\40\2\uffff\1\40\22\uffff\1\40\1\uffff\1\45\1\37\1\uffff"+
            "\2\43\1\uffff\1\16\1\20\1\34\1\uffff\1\17\1\30\1\43\1\36\12"+
            "\43\1\15\1\uffff\1\31\1\25\2\uffff\1\14\1\44\1\10\1\5\1\1\1"+
            "\11\11\44\1\35\1\26\12\44\1\32\1\uffff\1\33\1\41\1\44\1\uffff"+
            "\1\21\1\24\1\13\1\4\1\23\7\44\1\3\1\2\1\44\1\42\1\44\1\27\1"+
            "\22\2\44\1\12\4\44\1\6\1\uffff\1\7\102\uffff\1\43\3\uffff\1"+
            "\43\3\uffff\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff"+
            "\1\43\2\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\1\47\15\50\1\46\13\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\1\51\15\50\1\52\13\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\53\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2"+
            "\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\54\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2"+
            "\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\13\50\1\55\16\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\12\50\1\57\17\50\4\uffff"+
            "\1\50\1\uffff\24\50\1\56\5\50\105\uffff\1\43\3\uffff\1\43\3"+
            "\uffff\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff"+
            "\1\43\2\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\15\50\1\60\14\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\61\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2"+
            "\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\3\50\1\63\26\50\4\uffff"+
            "\1\50\1\uffff\16\50\1\62\13\50\105\uffff\1\43\3\uffff\1\43\3"+
            "\uffff\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff"+
            "\1\43\2\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "",
            "",
            "",
            "",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\1\50\1\64\1\65\27\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\66\3\50\1\70\17\50\1\67\1\50\105\uffff\1\43\3"+
            "\uffff\1\43\3\uffff\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff"+
            "\2\43\3\uffff\1\43\2\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\27\50\1\71\2\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2"+
            "\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\1\72\27\50\1\73\1\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\12\50\1\74\17\50\4\uffff"+
            "\1\50\1\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\75\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2"+
            "\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\1\76",
            "",
            "",
            "",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\15\50\1\77\14\50\4\uffff"+
            "\1\50\1\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\1\100",
            "",
            "",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\13\50\1\101\16\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\14\50\1\102\15\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\23\50\1\103\6\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\14\50\1\104\15\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\23\50\1\105\6\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\23\50\1\106\6\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\5\50\1\110\11\50\1\107\12\50\105\uffff\1\43\3\uffff\1"+
            "\43\3\uffff\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff"+
            "\1\43\2\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\1\111\31\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\22\50\1\112\7\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\24\50\1\114\5\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\21\50\1\115\10\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\14\50\1\116\15\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\1\117\31\50\4\uffff"+
            "\1\50\1\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\22\50\1\120\7\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\2\50\1\121\27\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\2\50\1\122\27\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\15\50\1\123\14\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\15\50\1\124\14\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\23\50\1\125\6\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\22\50\1\126\7\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\21\50\1\127\3\50\1\130"+
            "\4\50\4\uffff\1\50\1\uffff\32\50\105\uffff\1\43\3\uffff\1\43"+
            "\3\uffff\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff"+
            "\1\43\2\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\20\50\1\132\1\50\1\134\2\50\1\133\4\50\105\uffff\1\43"+
            "\3\uffff\1\43\3\uffff\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff"+
            "\2\43\3\uffff\1\43\2\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\4\50\1\135\25\50\4\uffff"+
            "\1\50\1\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\1\136\31\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\1\137\31\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\1\140\31\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\141\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\24\50\1\142\5\50\4\uffff"+
            "\1\50\1\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\1\143\31\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\21\50\1\144\10\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\1\145\31\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\22\50\1\146\7\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\10\50\1\147\21\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\14\50\1\150\15\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\22\50\1\151\7\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\14\50\1\152\15\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\23\50\1\153\6\50\4\uffff"+
            "\1\50\1\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\23\50\1\154\6\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\155\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\24\50\1\156\5\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\2\50\1\157\27\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\6\50\1\160\23\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\161\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\162\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\163\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\1\164\31\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\24\50\1\165\5\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\166\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\16\50\1\167\13\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\23\50\1\171\6\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\10\50\1\172\21\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\22\50\1\173\7\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\22\50\1\174\7\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\15\50\1\175\14\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\14\50\1\176\15\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\177\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\24\50\1\u0080\5\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\22\50\1\u0081\7\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\15\50\1\u0082\14\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\u0083\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\10\50\1\u0084\21\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\u0085\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\1\u0086\31\50\4\uffff"+
            "\1\50\1\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\21\50\1\u0087\10\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\17\50\1\u0088\12\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\21\50\1\u0089\10\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\7\50\1\u008a\22\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\13\50\1\u008b\16\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\15\50\1\u008c\14\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\3\50\1\u008d\26\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\5\50\1\u008e\24\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\13\50\1\u008f\16\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\10\50\1\u0090\21\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\21\50\1\u0091\10\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\24\50\1\u0092\5\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\5\50\1\u0093\24\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\15\50\1\u0094\14\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\u0095\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\17\50\1\u0096\12\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\10\50\1\u0097\21\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\16\50\1\u0098\13\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\2\50\1\u0099\27\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\13\50\1\u009a\16\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\u009b\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\u009c\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\21\50\1\u009d\10\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\16\50\1\u009e\13\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\15\50\1\u009f\14\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\1\u00a1\31\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\23\50\1\u00a2\6\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\u00a3\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\21\50\1\u00a4\10\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\u00a5\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\3\50\1\u00a6\26\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\16\50\1\u00a7\13\50"+
            "\4\uffff\1\50\1\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\u00a8\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\24\50\1\u00a9\5\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\21\50\1\u00aa\10\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\22\50\1\u00ab\7\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\21\50\1\u00ac\10\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\16\50\1\u00ad\13\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\23\50\1\u00af\6\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\1\u00b0\31\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\20\50\1\u00b1\11\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\3\50\1\u00b2\26\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\1\u00b3\31\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\23\50\1\u00b4\6\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\22\50\1\u00b5\7\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\22\50\1\u00b6\7\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\1\u00b7\31\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\15\50\1\u00b8\14\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\23\50\1\u00b9\6\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\2\50\1\u00ba\27\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\15\50\1\u00bb\14\50"+
            "\4\uffff\1\50\1\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\3\50\1\u00bc\26\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\16\50\1\u00bd\13\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\25\50\1\u00be\4\50\4"+
            "\uffff\1\50\1\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\22\50\1\u00bf\7\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\15\50\1\u00c0\14\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\21\50\1\u00c1\10\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\u00c2\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\u00c3\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\u00c4\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\2\50\1\u00c5\27\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\21\50\1\u00c6\10\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\22\50\1\u00c7\7\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\2\50\1\u00c8\27\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\24\50\1\u00c9\5\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\u00ca\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\23\50\1\u00cb\6\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\22\50\1\u00ce\7\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\23\50\1\u00cf\6\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\3\uffff\1\u00d0\3\uffff\32\50"+
            "\4\uffff\1\50\1\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\3\uffff\1\u00d1\3\uffff\32\50"+
            "\4\uffff\1\50\1\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\23\50\1\u00d2\6\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\24\50\1\u00d3\5\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\15\50\1\u00d5\14\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\1\u00d6\31\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\u00d9\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\3\50\1\u00db\26\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\u00dd\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\14\50\1\u00de\15\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\u00e0\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\u00e1\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\13\50\1\u00e2\16\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\10\50\1\u00e3\21\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\23\50\1\u00e4\6\50\4"+
            "\uffff\1\50\1\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\10\50\1\u00e5\21\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\13\50\1\u00e7\16\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\10\50\1\u00e8\21\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\13\50\1\u00e9\16\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\15\50\1\u00ea\14\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\1\u00ec\6\uffff\32\50\4\uffff"+
            "\1\50\1\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\1\u00ec\6\uffff\32\50\4\uffff"+
            "\1\50\1\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\25\50\1\u00ef\4\50\4"+
            "\uffff\1\50\1\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\16\50\1\u00f0\13\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\30\50\1\u00f1\1\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\16\50\1\u00f2\13\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\13\50\1\u00f3\16\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\31\50\1\u00f4\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\24\50\1\u00f5\5\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\2\50\1\u00f6\27\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "",
            "",
            "",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\u00f7\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\15\50\1\u00f8\14\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\17\50\1\u00f9\12\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\15\50\1\u00fa\14\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\25\50\1\u00fb\4\50\4"+
            "\uffff\1\50\1\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\u00fc\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\u00fd\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\u00fe\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\21\50\1\u00ff\10\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\10\50\1\u0100\21\50"+
            "\4\uffff\1\50\1\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\u0101\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\22\50\1\u0102\7\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\1\u0103\31\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43"+
            "\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff"+
            "\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\3\50\1\u0104\26\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\3\50\1\u0105\26\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\22\50\1\u0107\7\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\15\50\1\u0108\14\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\22\50\1\u0109\7\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\13\50\1\u010b\16\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\10\50\1\u010e\21\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\5\50\1\u010f\24\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\24\50\1\u0111\5\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\16\50\1\u0112\13\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\16\50\1\u0113\13\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\4\50\1\u0114\25\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\15\50\1\u0115\14\50\105\uffff\1\43\3\uffff\1\43\3\uffff"+
            "\2\43\14\uffff\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2"+
            "\uffff\3\43\14\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "\2\43\6\uffff\2\50\1\43\12\50\7\uffff\32\50\4\uffff\1\50\1"+
            "\uffff\32\50\105\uffff\1\43\3\uffff\1\43\3\uffff\2\43\14\uffff"+
            "\1\43\5\uffff\1\43\2\uffff\2\43\3\uffff\1\43\2\uffff\3\43\14"+
            "\uffff\1\43\5\uffff\1\43",
            "",
            "",
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_ML_DOC | RULE_SL_COMMENT | RULE_WS | RULE_ID | RULE_VALUE | RULE_URI | RULE_STRING );";
        }
    }
 

}