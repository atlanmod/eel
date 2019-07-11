package fr.tblf.energy.estimation.eel.ide.contentassist.antlr.internal;

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
import fr.tblf.energy.estimation.eel.services.EelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'GLOBAL'", "'LOCAL'", "'Platform'", "'{'", "'}'", "'targets'", "','", "'estimations'", "'target'", "'formula'", "'variables'", "'('", "')'", "'='", "'-'", "'.'", "'class'", "'op'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEel.g"; }


    	private EelGrammarAccess grammarAccess;

    	public void setGrammarAccess(EelGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRulePlatform"
    // InternalEel.g:53:1: entryRulePlatform : rulePlatform EOF ;
    public final void entryRulePlatform() throws RecognitionException {
        try {
            // InternalEel.g:54:1: ( rulePlatform EOF )
            // InternalEel.g:55:1: rulePlatform EOF
            {
             before(grammarAccess.getPlatformRule()); 
            pushFollow(FOLLOW_1);
            rulePlatform();

            state._fsp--;

             after(grammarAccess.getPlatformRule()); 
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
    // $ANTLR end "entryRulePlatform"


    // $ANTLR start "rulePlatform"
    // InternalEel.g:62:1: rulePlatform : ( ( rule__Platform__Group__0 ) ) ;
    public final void rulePlatform() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:66:2: ( ( ( rule__Platform__Group__0 ) ) )
            // InternalEel.g:67:2: ( ( rule__Platform__Group__0 ) )
            {
            // InternalEel.g:67:2: ( ( rule__Platform__Group__0 ) )
            // InternalEel.g:68:3: ( rule__Platform__Group__0 )
            {
             before(grammarAccess.getPlatformAccess().getGroup()); 
            // InternalEel.g:69:3: ( rule__Platform__Group__0 )
            // InternalEel.g:69:4: rule__Platform__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Platform__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlatform"


    // $ANTLR start "entryRuleEString"
    // InternalEel.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalEel.g:79:1: ( ruleEString EOF )
            // InternalEel.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalEel.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalEel.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalEel.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalEel.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalEel.g:94:3: ( rule__EString__Alternatives )
            // InternalEel.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEstimation"
    // InternalEel.g:103:1: entryRuleEstimation : ruleEstimation EOF ;
    public final void entryRuleEstimation() throws RecognitionException {
        try {
            // InternalEel.g:104:1: ( ruleEstimation EOF )
            // InternalEel.g:105:1: ruleEstimation EOF
            {
             before(grammarAccess.getEstimationRule()); 
            pushFollow(FOLLOW_1);
            ruleEstimation();

            state._fsp--;

             after(grammarAccess.getEstimationRule()); 
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
    // $ANTLR end "entryRuleEstimation"


    // $ANTLR start "ruleEstimation"
    // InternalEel.g:112:1: ruleEstimation : ( ( rule__Estimation__Group__0 ) ) ;
    public final void ruleEstimation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:116:2: ( ( ( rule__Estimation__Group__0 ) ) )
            // InternalEel.g:117:2: ( ( rule__Estimation__Group__0 ) )
            {
            // InternalEel.g:117:2: ( ( rule__Estimation__Group__0 ) )
            // InternalEel.g:118:3: ( rule__Estimation__Group__0 )
            {
             before(grammarAccess.getEstimationAccess().getGroup()); 
            // InternalEel.g:119:3: ( rule__Estimation__Group__0 )
            // InternalEel.g:119:4: rule__Estimation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Estimation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEstimationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEstimation"


    // $ANTLR start "entryRuleVariable"
    // InternalEel.g:128:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalEel.g:129:1: ( ruleVariable EOF )
            // InternalEel.g:130:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalEel.g:137:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:141:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalEel.g:142:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalEel.g:142:2: ( ( rule__Variable__Group__0 ) )
            // InternalEel.g:143:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalEel.g:144:3: ( rule__Variable__Group__0 )
            // InternalEel.g:144:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleEDouble"
    // InternalEel.g:153:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalEel.g:154:1: ( ruleEDouble EOF )
            // InternalEel.g:155:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalEel.g:162:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:166:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalEel.g:167:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalEel.g:167:2: ( ( rule__EDouble__Group__0 ) )
            // InternalEel.g:168:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalEel.g:169:3: ( rule__EDouble__Group__0 )
            // InternalEel.g:169:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleMetaClass"
    // InternalEel.g:178:1: entryRuleMetaClass : ruleMetaClass EOF ;
    public final void entryRuleMetaClass() throws RecognitionException {
        try {
            // InternalEel.g:179:1: ( ruleMetaClass EOF )
            // InternalEel.g:180:1: ruleMetaClass EOF
            {
             before(grammarAccess.getMetaClassRule()); 
            pushFollow(FOLLOW_1);
            ruleMetaClass();

            state._fsp--;

             after(grammarAccess.getMetaClassRule()); 
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
    // $ANTLR end "entryRuleMetaClass"


    // $ANTLR start "ruleMetaClass"
    // InternalEel.g:187:1: ruleMetaClass : ( ( rule__MetaClass__Group__0 ) ) ;
    public final void ruleMetaClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:191:2: ( ( ( rule__MetaClass__Group__0 ) ) )
            // InternalEel.g:192:2: ( ( rule__MetaClass__Group__0 ) )
            {
            // InternalEel.g:192:2: ( ( rule__MetaClass__Group__0 ) )
            // InternalEel.g:193:3: ( rule__MetaClass__Group__0 )
            {
             before(grammarAccess.getMetaClassAccess().getGroup()); 
            // InternalEel.g:194:3: ( rule__MetaClass__Group__0 )
            // InternalEel.g:194:4: rule__MetaClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MetaClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetaClass"


    // $ANTLR start "entryRuleOperation"
    // InternalEel.g:203:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalEel.g:204:1: ( ruleOperation EOF )
            // InternalEel.g:205:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalEel.g:212:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:216:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalEel.g:217:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalEel.g:217:2: ( ( rule__Operation__Group__0 ) )
            // InternalEel.g:218:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalEel.g:219:3: ( rule__Operation__Group__0 )
            // InternalEel.g:219:4: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "ruleVisibility"
    // InternalEel.g:228:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:232:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // InternalEel.g:233:2: ( ( rule__Visibility__Alternatives ) )
            {
            // InternalEel.g:233:2: ( ( rule__Visibility__Alternatives ) )
            // InternalEel.g:234:3: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // InternalEel.g:235:3: ( rule__Visibility__Alternatives )
            // InternalEel.g:235:4: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Visibility__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalEel.g:243:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:247:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEel.g:248:2: ( RULE_STRING )
                    {
                    // InternalEel.g:248:2: ( RULE_STRING )
                    // InternalEel.g:249:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:254:2: ( RULE_ID )
                    {
                    // InternalEel.g:254:2: ( RULE_ID )
                    // InternalEel.g:255:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalEel.g:264:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:268:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEel.g:269:2: ( 'E' )
                    {
                    // InternalEel.g:269:2: ( 'E' )
                    // InternalEel.g:270:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:275:2: ( 'e' )
                    {
                    // InternalEel.g:275:2: ( 'e' )
                    // InternalEel.g:276:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__Visibility__Alternatives"
    // InternalEel.g:285:1: rule__Visibility__Alternatives : ( ( ( 'GLOBAL' ) ) | ( ( 'LOCAL' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:289:1: ( ( ( 'GLOBAL' ) ) | ( ( 'LOCAL' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEel.g:290:2: ( ( 'GLOBAL' ) )
                    {
                    // InternalEel.g:290:2: ( ( 'GLOBAL' ) )
                    // InternalEel.g:291:3: ( 'GLOBAL' )
                    {
                     before(grammarAccess.getVisibilityAccess().getGLOBALEnumLiteralDeclaration_0()); 
                    // InternalEel.g:292:3: ( 'GLOBAL' )
                    // InternalEel.g:292:4: 'GLOBAL'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getGLOBALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:296:2: ( ( 'LOCAL' ) )
                    {
                    // InternalEel.g:296:2: ( ( 'LOCAL' ) )
                    // InternalEel.g:297:3: ( 'LOCAL' )
                    {
                     before(grammarAccess.getVisibilityAccess().getLOCALEnumLiteralDeclaration_1()); 
                    // InternalEel.g:298:3: ( 'LOCAL' )
                    // InternalEel.g:298:4: 'LOCAL'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getLOCALEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Visibility__Alternatives"


    // $ANTLR start "rule__Platform__Group__0"
    // InternalEel.g:306:1: rule__Platform__Group__0 : rule__Platform__Group__0__Impl rule__Platform__Group__1 ;
    public final void rule__Platform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:310:1: ( rule__Platform__Group__0__Impl rule__Platform__Group__1 )
            // InternalEel.g:311:2: rule__Platform__Group__0__Impl rule__Platform__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Platform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__1();

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
    // $ANTLR end "rule__Platform__Group__0"


    // $ANTLR start "rule__Platform__Group__0__Impl"
    // InternalEel.g:318:1: rule__Platform__Group__0__Impl : ( () ) ;
    public final void rule__Platform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:322:1: ( ( () ) )
            // InternalEel.g:323:1: ( () )
            {
            // InternalEel.g:323:1: ( () )
            // InternalEel.g:324:2: ()
            {
             before(grammarAccess.getPlatformAccess().getPlatformAction_0()); 
            // InternalEel.g:325:2: ()
            // InternalEel.g:325:3: 
            {
            }

             after(grammarAccess.getPlatformAccess().getPlatformAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__0__Impl"


    // $ANTLR start "rule__Platform__Group__1"
    // InternalEel.g:333:1: rule__Platform__Group__1 : rule__Platform__Group__1__Impl rule__Platform__Group__2 ;
    public final void rule__Platform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:337:1: ( rule__Platform__Group__1__Impl rule__Platform__Group__2 )
            // InternalEel.g:338:2: rule__Platform__Group__1__Impl rule__Platform__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Platform__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__2();

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
    // $ANTLR end "rule__Platform__Group__1"


    // $ANTLR start "rule__Platform__Group__1__Impl"
    // InternalEel.g:345:1: rule__Platform__Group__1__Impl : ( 'Platform' ) ;
    public final void rule__Platform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:349:1: ( ( 'Platform' ) )
            // InternalEel.g:350:1: ( 'Platform' )
            {
            // InternalEel.g:350:1: ( 'Platform' )
            // InternalEel.g:351:2: 'Platform'
            {
             before(grammarAccess.getPlatformAccess().getPlatformKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getPlatformKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__1__Impl"


    // $ANTLR start "rule__Platform__Group__2"
    // InternalEel.g:360:1: rule__Platform__Group__2 : rule__Platform__Group__2__Impl rule__Platform__Group__3 ;
    public final void rule__Platform__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:364:1: ( rule__Platform__Group__2__Impl rule__Platform__Group__3 )
            // InternalEel.g:365:2: rule__Platform__Group__2__Impl rule__Platform__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Platform__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__3();

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
    // $ANTLR end "rule__Platform__Group__2"


    // $ANTLR start "rule__Platform__Group__2__Impl"
    // InternalEel.g:372:1: rule__Platform__Group__2__Impl : ( ( rule__Platform__NameAssignment_2 ) ) ;
    public final void rule__Platform__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:376:1: ( ( ( rule__Platform__NameAssignment_2 ) ) )
            // InternalEel.g:377:1: ( ( rule__Platform__NameAssignment_2 ) )
            {
            // InternalEel.g:377:1: ( ( rule__Platform__NameAssignment_2 ) )
            // InternalEel.g:378:2: ( rule__Platform__NameAssignment_2 )
            {
             before(grammarAccess.getPlatformAccess().getNameAssignment_2()); 
            // InternalEel.g:379:2: ( rule__Platform__NameAssignment_2 )
            // InternalEel.g:379:3: rule__Platform__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Platform__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__2__Impl"


    // $ANTLR start "rule__Platform__Group__3"
    // InternalEel.g:387:1: rule__Platform__Group__3 : rule__Platform__Group__3__Impl rule__Platform__Group__4 ;
    public final void rule__Platform__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:391:1: ( rule__Platform__Group__3__Impl rule__Platform__Group__4 )
            // InternalEel.g:392:2: rule__Platform__Group__3__Impl rule__Platform__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Platform__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__4();

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
    // $ANTLR end "rule__Platform__Group__3"


    // $ANTLR start "rule__Platform__Group__3__Impl"
    // InternalEel.g:399:1: rule__Platform__Group__3__Impl : ( '{' ) ;
    public final void rule__Platform__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:403:1: ( ( '{' ) )
            // InternalEel.g:404:1: ( '{' )
            {
            // InternalEel.g:404:1: ( '{' )
            // InternalEel.g:405:2: '{'
            {
             before(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__3__Impl"


    // $ANTLR start "rule__Platform__Group__4"
    // InternalEel.g:414:1: rule__Platform__Group__4 : rule__Platform__Group__4__Impl rule__Platform__Group__5 ;
    public final void rule__Platform__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:418:1: ( rule__Platform__Group__4__Impl rule__Platform__Group__5 )
            // InternalEel.g:419:2: rule__Platform__Group__4__Impl rule__Platform__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Platform__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__5();

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
    // $ANTLR end "rule__Platform__Group__4"


    // $ANTLR start "rule__Platform__Group__4__Impl"
    // InternalEel.g:426:1: rule__Platform__Group__4__Impl : ( ( rule__Platform__Group_4__0 )? ) ;
    public final void rule__Platform__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:430:1: ( ( ( rule__Platform__Group_4__0 )? ) )
            // InternalEel.g:431:1: ( ( rule__Platform__Group_4__0 )? )
            {
            // InternalEel.g:431:1: ( ( rule__Platform__Group_4__0 )? )
            // InternalEel.g:432:2: ( rule__Platform__Group_4__0 )?
            {
             before(grammarAccess.getPlatformAccess().getGroup_4()); 
            // InternalEel.g:433:2: ( rule__Platform__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEel.g:433:3: rule__Platform__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Platform__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlatformAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__4__Impl"


    // $ANTLR start "rule__Platform__Group__5"
    // InternalEel.g:441:1: rule__Platform__Group__5 : rule__Platform__Group__5__Impl rule__Platform__Group__6 ;
    public final void rule__Platform__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:445:1: ( rule__Platform__Group__5__Impl rule__Platform__Group__6 )
            // InternalEel.g:446:2: rule__Platform__Group__5__Impl rule__Platform__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Platform__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__6();

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
    // $ANTLR end "rule__Platform__Group__5"


    // $ANTLR start "rule__Platform__Group__5__Impl"
    // InternalEel.g:453:1: rule__Platform__Group__5__Impl : ( ( rule__Platform__Group_5__0 )? ) ;
    public final void rule__Platform__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:457:1: ( ( ( rule__Platform__Group_5__0 )? ) )
            // InternalEel.g:458:1: ( ( rule__Platform__Group_5__0 )? )
            {
            // InternalEel.g:458:1: ( ( rule__Platform__Group_5__0 )? )
            // InternalEel.g:459:2: ( rule__Platform__Group_5__0 )?
            {
             before(grammarAccess.getPlatformAccess().getGroup_5()); 
            // InternalEel.g:460:2: ( rule__Platform__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEel.g:460:3: rule__Platform__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Platform__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlatformAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__5__Impl"


    // $ANTLR start "rule__Platform__Group__6"
    // InternalEel.g:468:1: rule__Platform__Group__6 : rule__Platform__Group__6__Impl rule__Platform__Group__7 ;
    public final void rule__Platform__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:472:1: ( rule__Platform__Group__6__Impl rule__Platform__Group__7 )
            // InternalEel.g:473:2: rule__Platform__Group__6__Impl rule__Platform__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Platform__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__7();

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
    // $ANTLR end "rule__Platform__Group__6"


    // $ANTLR start "rule__Platform__Group__6__Impl"
    // InternalEel.g:480:1: rule__Platform__Group__6__Impl : ( ( rule__Platform__Group_6__0 )? ) ;
    public final void rule__Platform__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:484:1: ( ( ( rule__Platform__Group_6__0 )? ) )
            // InternalEel.g:485:1: ( ( rule__Platform__Group_6__0 )? )
            {
            // InternalEel.g:485:1: ( ( rule__Platform__Group_6__0 )? )
            // InternalEel.g:486:2: ( rule__Platform__Group_6__0 )?
            {
             before(grammarAccess.getPlatformAccess().getGroup_6()); 
            // InternalEel.g:487:2: ( rule__Platform__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=13 && LA6_0<=14)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEel.g:487:3: rule__Platform__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Platform__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlatformAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__6__Impl"


    // $ANTLR start "rule__Platform__Group__7"
    // InternalEel.g:495:1: rule__Platform__Group__7 : rule__Platform__Group__7__Impl ;
    public final void rule__Platform__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:499:1: ( rule__Platform__Group__7__Impl )
            // InternalEel.g:500:2: rule__Platform__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Platform__Group__7__Impl();

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
    // $ANTLR end "rule__Platform__Group__7"


    // $ANTLR start "rule__Platform__Group__7__Impl"
    // InternalEel.g:506:1: rule__Platform__Group__7__Impl : ( '}' ) ;
    public final void rule__Platform__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:510:1: ( ( '}' ) )
            // InternalEel.g:511:1: ( '}' )
            {
            // InternalEel.g:511:1: ( '}' )
            // InternalEel.g:512:2: '}'
            {
             before(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__7__Impl"


    // $ANTLR start "rule__Platform__Group_4__0"
    // InternalEel.g:522:1: rule__Platform__Group_4__0 : rule__Platform__Group_4__0__Impl rule__Platform__Group_4__1 ;
    public final void rule__Platform__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:526:1: ( rule__Platform__Group_4__0__Impl rule__Platform__Group_4__1 )
            // InternalEel.g:527:2: rule__Platform__Group_4__0__Impl rule__Platform__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Platform__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_4__1();

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
    // $ANTLR end "rule__Platform__Group_4__0"


    // $ANTLR start "rule__Platform__Group_4__0__Impl"
    // InternalEel.g:534:1: rule__Platform__Group_4__0__Impl : ( 'targets' ) ;
    public final void rule__Platform__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:538:1: ( ( 'targets' ) )
            // InternalEel.g:539:1: ( 'targets' )
            {
            // InternalEel.g:539:1: ( 'targets' )
            // InternalEel.g:540:2: 'targets'
            {
             before(grammarAccess.getPlatformAccess().getTargetsKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getTargetsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_4__0__Impl"


    // $ANTLR start "rule__Platform__Group_4__1"
    // InternalEel.g:549:1: rule__Platform__Group_4__1 : rule__Platform__Group_4__1__Impl rule__Platform__Group_4__2 ;
    public final void rule__Platform__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:553:1: ( rule__Platform__Group_4__1__Impl rule__Platform__Group_4__2 )
            // InternalEel.g:554:2: rule__Platform__Group_4__1__Impl rule__Platform__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Platform__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_4__2();

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
    // $ANTLR end "rule__Platform__Group_4__1"


    // $ANTLR start "rule__Platform__Group_4__1__Impl"
    // InternalEel.g:561:1: rule__Platform__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Platform__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:565:1: ( ( '{' ) )
            // InternalEel.g:566:1: ( '{' )
            {
            // InternalEel.g:566:1: ( '{' )
            // InternalEel.g:567:2: '{'
            {
             before(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_4__1__Impl"


    // $ANTLR start "rule__Platform__Group_4__2"
    // InternalEel.g:576:1: rule__Platform__Group_4__2 : rule__Platform__Group_4__2__Impl rule__Platform__Group_4__3 ;
    public final void rule__Platform__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:580:1: ( rule__Platform__Group_4__2__Impl rule__Platform__Group_4__3 )
            // InternalEel.g:581:2: rule__Platform__Group_4__2__Impl rule__Platform__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Platform__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_4__3();

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
    // $ANTLR end "rule__Platform__Group_4__2"


    // $ANTLR start "rule__Platform__Group_4__2__Impl"
    // InternalEel.g:588:1: rule__Platform__Group_4__2__Impl : ( ( rule__Platform__TargetsAssignment_4_2 ) ) ;
    public final void rule__Platform__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:592:1: ( ( ( rule__Platform__TargetsAssignment_4_2 ) ) )
            // InternalEel.g:593:1: ( ( rule__Platform__TargetsAssignment_4_2 ) )
            {
            // InternalEel.g:593:1: ( ( rule__Platform__TargetsAssignment_4_2 ) )
            // InternalEel.g:594:2: ( rule__Platform__TargetsAssignment_4_2 )
            {
             before(grammarAccess.getPlatformAccess().getTargetsAssignment_4_2()); 
            // InternalEel.g:595:2: ( rule__Platform__TargetsAssignment_4_2 )
            // InternalEel.g:595:3: rule__Platform__TargetsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Platform__TargetsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getTargetsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_4__2__Impl"


    // $ANTLR start "rule__Platform__Group_4__3"
    // InternalEel.g:603:1: rule__Platform__Group_4__3 : rule__Platform__Group_4__3__Impl rule__Platform__Group_4__4 ;
    public final void rule__Platform__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:607:1: ( rule__Platform__Group_4__3__Impl rule__Platform__Group_4__4 )
            // InternalEel.g:608:2: rule__Platform__Group_4__3__Impl rule__Platform__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Platform__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_4__4();

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
    // $ANTLR end "rule__Platform__Group_4__3"


    // $ANTLR start "rule__Platform__Group_4__3__Impl"
    // InternalEel.g:615:1: rule__Platform__Group_4__3__Impl : ( ( rule__Platform__Group_4_3__0 )* ) ;
    public final void rule__Platform__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:619:1: ( ( ( rule__Platform__Group_4_3__0 )* ) )
            // InternalEel.g:620:1: ( ( rule__Platform__Group_4_3__0 )* )
            {
            // InternalEel.g:620:1: ( ( rule__Platform__Group_4_3__0 )* )
            // InternalEel.g:621:2: ( rule__Platform__Group_4_3__0 )*
            {
             before(grammarAccess.getPlatformAccess().getGroup_4_3()); 
            // InternalEel.g:622:2: ( rule__Platform__Group_4_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEel.g:622:3: rule__Platform__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Platform__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPlatformAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_4__3__Impl"


    // $ANTLR start "rule__Platform__Group_4__4"
    // InternalEel.g:630:1: rule__Platform__Group_4__4 : rule__Platform__Group_4__4__Impl ;
    public final void rule__Platform__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:634:1: ( rule__Platform__Group_4__4__Impl )
            // InternalEel.g:635:2: rule__Platform__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Platform__Group_4__4__Impl();

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
    // $ANTLR end "rule__Platform__Group_4__4"


    // $ANTLR start "rule__Platform__Group_4__4__Impl"
    // InternalEel.g:641:1: rule__Platform__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Platform__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:645:1: ( ( '}' ) )
            // InternalEel.g:646:1: ( '}' )
            {
            // InternalEel.g:646:1: ( '}' )
            // InternalEel.g:647:2: '}'
            {
             before(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_4__4__Impl"


    // $ANTLR start "rule__Platform__Group_4_3__0"
    // InternalEel.g:657:1: rule__Platform__Group_4_3__0 : rule__Platform__Group_4_3__0__Impl rule__Platform__Group_4_3__1 ;
    public final void rule__Platform__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:661:1: ( rule__Platform__Group_4_3__0__Impl rule__Platform__Group_4_3__1 )
            // InternalEel.g:662:2: rule__Platform__Group_4_3__0__Impl rule__Platform__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Platform__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_4_3__1();

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
    // $ANTLR end "rule__Platform__Group_4_3__0"


    // $ANTLR start "rule__Platform__Group_4_3__0__Impl"
    // InternalEel.g:669:1: rule__Platform__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Platform__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:673:1: ( ( ',' ) )
            // InternalEel.g:674:1: ( ',' )
            {
            // InternalEel.g:674:1: ( ',' )
            // InternalEel.g:675:2: ','
            {
             before(grammarAccess.getPlatformAccess().getCommaKeyword_4_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_4_3__0__Impl"


    // $ANTLR start "rule__Platform__Group_4_3__1"
    // InternalEel.g:684:1: rule__Platform__Group_4_3__1 : rule__Platform__Group_4_3__1__Impl ;
    public final void rule__Platform__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:688:1: ( rule__Platform__Group_4_3__1__Impl )
            // InternalEel.g:689:2: rule__Platform__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Platform__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Platform__Group_4_3__1"


    // $ANTLR start "rule__Platform__Group_4_3__1__Impl"
    // InternalEel.g:695:1: rule__Platform__Group_4_3__1__Impl : ( ( rule__Platform__TargetsAssignment_4_3_1 ) ) ;
    public final void rule__Platform__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:699:1: ( ( ( rule__Platform__TargetsAssignment_4_3_1 ) ) )
            // InternalEel.g:700:1: ( ( rule__Platform__TargetsAssignment_4_3_1 ) )
            {
            // InternalEel.g:700:1: ( ( rule__Platform__TargetsAssignment_4_3_1 ) )
            // InternalEel.g:701:2: ( rule__Platform__TargetsAssignment_4_3_1 )
            {
             before(grammarAccess.getPlatformAccess().getTargetsAssignment_4_3_1()); 
            // InternalEel.g:702:2: ( rule__Platform__TargetsAssignment_4_3_1 )
            // InternalEel.g:702:3: rule__Platform__TargetsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Platform__TargetsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getTargetsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_4_3__1__Impl"


    // $ANTLR start "rule__Platform__Group_5__0"
    // InternalEel.g:711:1: rule__Platform__Group_5__0 : rule__Platform__Group_5__0__Impl rule__Platform__Group_5__1 ;
    public final void rule__Platform__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:715:1: ( rule__Platform__Group_5__0__Impl rule__Platform__Group_5__1 )
            // InternalEel.g:716:2: rule__Platform__Group_5__0__Impl rule__Platform__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Platform__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_5__1();

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
    // $ANTLR end "rule__Platform__Group_5__0"


    // $ANTLR start "rule__Platform__Group_5__0__Impl"
    // InternalEel.g:723:1: rule__Platform__Group_5__0__Impl : ( 'estimations' ) ;
    public final void rule__Platform__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:727:1: ( ( 'estimations' ) )
            // InternalEel.g:728:1: ( 'estimations' )
            {
            // InternalEel.g:728:1: ( 'estimations' )
            // InternalEel.g:729:2: 'estimations'
            {
             before(grammarAccess.getPlatformAccess().getEstimationsKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getEstimationsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_5__0__Impl"


    // $ANTLR start "rule__Platform__Group_5__1"
    // InternalEel.g:738:1: rule__Platform__Group_5__1 : rule__Platform__Group_5__1__Impl rule__Platform__Group_5__2 ;
    public final void rule__Platform__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:742:1: ( rule__Platform__Group_5__1__Impl rule__Platform__Group_5__2 )
            // InternalEel.g:743:2: rule__Platform__Group_5__1__Impl rule__Platform__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__Platform__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_5__2();

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
    // $ANTLR end "rule__Platform__Group_5__1"


    // $ANTLR start "rule__Platform__Group_5__1__Impl"
    // InternalEel.g:750:1: rule__Platform__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Platform__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:754:1: ( ( '{' ) )
            // InternalEel.g:755:1: ( '{' )
            {
            // InternalEel.g:755:1: ( '{' )
            // InternalEel.g:756:2: '{'
            {
             before(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_5__1__Impl"


    // $ANTLR start "rule__Platform__Group_5__2"
    // InternalEel.g:765:1: rule__Platform__Group_5__2 : rule__Platform__Group_5__2__Impl rule__Platform__Group_5__3 ;
    public final void rule__Platform__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:769:1: ( rule__Platform__Group_5__2__Impl rule__Platform__Group_5__3 )
            // InternalEel.g:770:2: rule__Platform__Group_5__2__Impl rule__Platform__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Platform__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_5__3();

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
    // $ANTLR end "rule__Platform__Group_5__2"


    // $ANTLR start "rule__Platform__Group_5__2__Impl"
    // InternalEel.g:777:1: rule__Platform__Group_5__2__Impl : ( ( rule__Platform__EstimationsAssignment_5_2 ) ) ;
    public final void rule__Platform__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:781:1: ( ( ( rule__Platform__EstimationsAssignment_5_2 ) ) )
            // InternalEel.g:782:1: ( ( rule__Platform__EstimationsAssignment_5_2 ) )
            {
            // InternalEel.g:782:1: ( ( rule__Platform__EstimationsAssignment_5_2 ) )
            // InternalEel.g:783:2: ( rule__Platform__EstimationsAssignment_5_2 )
            {
             before(grammarAccess.getPlatformAccess().getEstimationsAssignment_5_2()); 
            // InternalEel.g:784:2: ( rule__Platform__EstimationsAssignment_5_2 )
            // InternalEel.g:784:3: rule__Platform__EstimationsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Platform__EstimationsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getEstimationsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_5__2__Impl"


    // $ANTLR start "rule__Platform__Group_5__3"
    // InternalEel.g:792:1: rule__Platform__Group_5__3 : rule__Platform__Group_5__3__Impl rule__Platform__Group_5__4 ;
    public final void rule__Platform__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:796:1: ( rule__Platform__Group_5__3__Impl rule__Platform__Group_5__4 )
            // InternalEel.g:797:2: rule__Platform__Group_5__3__Impl rule__Platform__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__Platform__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_5__4();

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
    // $ANTLR end "rule__Platform__Group_5__3"


    // $ANTLR start "rule__Platform__Group_5__3__Impl"
    // InternalEel.g:804:1: rule__Platform__Group_5__3__Impl : ( ( rule__Platform__Group_5_3__0 )* ) ;
    public final void rule__Platform__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:808:1: ( ( ( rule__Platform__Group_5_3__0 )* ) )
            // InternalEel.g:809:1: ( ( rule__Platform__Group_5_3__0 )* )
            {
            // InternalEel.g:809:1: ( ( rule__Platform__Group_5_3__0 )* )
            // InternalEel.g:810:2: ( rule__Platform__Group_5_3__0 )*
            {
             before(grammarAccess.getPlatformAccess().getGroup_5_3()); 
            // InternalEel.g:811:2: ( rule__Platform__Group_5_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEel.g:811:3: rule__Platform__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Platform__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPlatformAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_5__3__Impl"


    // $ANTLR start "rule__Platform__Group_5__4"
    // InternalEel.g:819:1: rule__Platform__Group_5__4 : rule__Platform__Group_5__4__Impl ;
    public final void rule__Platform__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:823:1: ( rule__Platform__Group_5__4__Impl )
            // InternalEel.g:824:2: rule__Platform__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Platform__Group_5__4__Impl();

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
    // $ANTLR end "rule__Platform__Group_5__4"


    // $ANTLR start "rule__Platform__Group_5__4__Impl"
    // InternalEel.g:830:1: rule__Platform__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Platform__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:834:1: ( ( '}' ) )
            // InternalEel.g:835:1: ( '}' )
            {
            // InternalEel.g:835:1: ( '}' )
            // InternalEel.g:836:2: '}'
            {
             before(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_5__4__Impl"


    // $ANTLR start "rule__Platform__Group_5_3__0"
    // InternalEel.g:846:1: rule__Platform__Group_5_3__0 : rule__Platform__Group_5_3__0__Impl rule__Platform__Group_5_3__1 ;
    public final void rule__Platform__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:850:1: ( rule__Platform__Group_5_3__0__Impl rule__Platform__Group_5_3__1 )
            // InternalEel.g:851:2: rule__Platform__Group_5_3__0__Impl rule__Platform__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Platform__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_5_3__1();

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
    // $ANTLR end "rule__Platform__Group_5_3__0"


    // $ANTLR start "rule__Platform__Group_5_3__0__Impl"
    // InternalEel.g:858:1: rule__Platform__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Platform__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:862:1: ( ( ',' ) )
            // InternalEel.g:863:1: ( ',' )
            {
            // InternalEel.g:863:1: ( ',' )
            // InternalEel.g:864:2: ','
            {
             before(grammarAccess.getPlatformAccess().getCommaKeyword_5_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_5_3__0__Impl"


    // $ANTLR start "rule__Platform__Group_5_3__1"
    // InternalEel.g:873:1: rule__Platform__Group_5_3__1 : rule__Platform__Group_5_3__1__Impl ;
    public final void rule__Platform__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:877:1: ( rule__Platform__Group_5_3__1__Impl )
            // InternalEel.g:878:2: rule__Platform__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Platform__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Platform__Group_5_3__1"


    // $ANTLR start "rule__Platform__Group_5_3__1__Impl"
    // InternalEel.g:884:1: rule__Platform__Group_5_3__1__Impl : ( ( rule__Platform__EstimationsAssignment_5_3_1 ) ) ;
    public final void rule__Platform__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:888:1: ( ( ( rule__Platform__EstimationsAssignment_5_3_1 ) ) )
            // InternalEel.g:889:1: ( ( rule__Platform__EstimationsAssignment_5_3_1 ) )
            {
            // InternalEel.g:889:1: ( ( rule__Platform__EstimationsAssignment_5_3_1 ) )
            // InternalEel.g:890:2: ( rule__Platform__EstimationsAssignment_5_3_1 )
            {
             before(grammarAccess.getPlatformAccess().getEstimationsAssignment_5_3_1()); 
            // InternalEel.g:891:2: ( rule__Platform__EstimationsAssignment_5_3_1 )
            // InternalEel.g:891:3: rule__Platform__EstimationsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Platform__EstimationsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getEstimationsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_5_3__1__Impl"


    // $ANTLR start "rule__Platform__Group_6__0"
    // InternalEel.g:900:1: rule__Platform__Group_6__0 : rule__Platform__Group_6__0__Impl rule__Platform__Group_6__1 ;
    public final void rule__Platform__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:904:1: ( rule__Platform__Group_6__0__Impl rule__Platform__Group_6__1 )
            // InternalEel.g:905:2: rule__Platform__Group_6__0__Impl rule__Platform__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__Platform__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_6__1();

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
    // $ANTLR end "rule__Platform__Group_6__0"


    // $ANTLR start "rule__Platform__Group_6__0__Impl"
    // InternalEel.g:912:1: rule__Platform__Group_6__0__Impl : ( ( rule__Platform__VariablesAssignment_6_0 ) ) ;
    public final void rule__Platform__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:916:1: ( ( ( rule__Platform__VariablesAssignment_6_0 ) ) )
            // InternalEel.g:917:1: ( ( rule__Platform__VariablesAssignment_6_0 ) )
            {
            // InternalEel.g:917:1: ( ( rule__Platform__VariablesAssignment_6_0 ) )
            // InternalEel.g:918:2: ( rule__Platform__VariablesAssignment_6_0 )
            {
             before(grammarAccess.getPlatformAccess().getVariablesAssignment_6_0()); 
            // InternalEel.g:919:2: ( rule__Platform__VariablesAssignment_6_0 )
            // InternalEel.g:919:3: rule__Platform__VariablesAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Platform__VariablesAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getVariablesAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_6__0__Impl"


    // $ANTLR start "rule__Platform__Group_6__1"
    // InternalEel.g:927:1: rule__Platform__Group_6__1 : rule__Platform__Group_6__1__Impl ;
    public final void rule__Platform__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:931:1: ( rule__Platform__Group_6__1__Impl )
            // InternalEel.g:932:2: rule__Platform__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Platform__Group_6__1__Impl();

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
    // $ANTLR end "rule__Platform__Group_6__1"


    // $ANTLR start "rule__Platform__Group_6__1__Impl"
    // InternalEel.g:938:1: rule__Platform__Group_6__1__Impl : ( ( rule__Platform__Group_6_1__0 )* ) ;
    public final void rule__Platform__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:942:1: ( ( ( rule__Platform__Group_6_1__0 )* ) )
            // InternalEel.g:943:1: ( ( rule__Platform__Group_6_1__0 )* )
            {
            // InternalEel.g:943:1: ( ( rule__Platform__Group_6_1__0 )* )
            // InternalEel.g:944:2: ( rule__Platform__Group_6_1__0 )*
            {
             before(grammarAccess.getPlatformAccess().getGroup_6_1()); 
            // InternalEel.g:945:2: ( rule__Platform__Group_6_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEel.g:945:3: rule__Platform__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Platform__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPlatformAccess().getGroup_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_6__1__Impl"


    // $ANTLR start "rule__Platform__Group_6_1__0"
    // InternalEel.g:954:1: rule__Platform__Group_6_1__0 : rule__Platform__Group_6_1__0__Impl rule__Platform__Group_6_1__1 ;
    public final void rule__Platform__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:958:1: ( rule__Platform__Group_6_1__0__Impl rule__Platform__Group_6_1__1 )
            // InternalEel.g:959:2: rule__Platform__Group_6_1__0__Impl rule__Platform__Group_6_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Platform__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_6_1__1();

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
    // $ANTLR end "rule__Platform__Group_6_1__0"


    // $ANTLR start "rule__Platform__Group_6_1__0__Impl"
    // InternalEel.g:966:1: rule__Platform__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__Platform__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:970:1: ( ( ',' ) )
            // InternalEel.g:971:1: ( ',' )
            {
            // InternalEel.g:971:1: ( ',' )
            // InternalEel.g:972:2: ','
            {
             before(grammarAccess.getPlatformAccess().getCommaKeyword_6_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getCommaKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_6_1__0__Impl"


    // $ANTLR start "rule__Platform__Group_6_1__1"
    // InternalEel.g:981:1: rule__Platform__Group_6_1__1 : rule__Platform__Group_6_1__1__Impl ;
    public final void rule__Platform__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:985:1: ( rule__Platform__Group_6_1__1__Impl )
            // InternalEel.g:986:2: rule__Platform__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Platform__Group_6_1__1__Impl();

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
    // $ANTLR end "rule__Platform__Group_6_1__1"


    // $ANTLR start "rule__Platform__Group_6_1__1__Impl"
    // InternalEel.g:992:1: rule__Platform__Group_6_1__1__Impl : ( ( rule__Platform__VariablesAssignment_6_1_1 ) ) ;
    public final void rule__Platform__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:996:1: ( ( ( rule__Platform__VariablesAssignment_6_1_1 ) ) )
            // InternalEel.g:997:1: ( ( rule__Platform__VariablesAssignment_6_1_1 ) )
            {
            // InternalEel.g:997:1: ( ( rule__Platform__VariablesAssignment_6_1_1 ) )
            // InternalEel.g:998:2: ( rule__Platform__VariablesAssignment_6_1_1 )
            {
             before(grammarAccess.getPlatformAccess().getVariablesAssignment_6_1_1()); 
            // InternalEel.g:999:2: ( rule__Platform__VariablesAssignment_6_1_1 )
            // InternalEel.g:999:3: rule__Platform__VariablesAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Platform__VariablesAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getVariablesAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_6_1__1__Impl"


    // $ANTLR start "rule__Estimation__Group__0"
    // InternalEel.g:1008:1: rule__Estimation__Group__0 : rule__Estimation__Group__0__Impl rule__Estimation__Group__1 ;
    public final void rule__Estimation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1012:1: ( rule__Estimation__Group__0__Impl rule__Estimation__Group__1 )
            // InternalEel.g:1013:2: rule__Estimation__Group__0__Impl rule__Estimation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Estimation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estimation__Group__1();

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
    // $ANTLR end "rule__Estimation__Group__0"


    // $ANTLR start "rule__Estimation__Group__0__Impl"
    // InternalEel.g:1020:1: rule__Estimation__Group__0__Impl : ( 'target' ) ;
    public final void rule__Estimation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1024:1: ( ( 'target' ) )
            // InternalEel.g:1025:1: ( 'target' )
            {
            // InternalEel.g:1025:1: ( 'target' )
            // InternalEel.g:1026:2: 'target'
            {
             before(grammarAccess.getEstimationAccess().getTargetKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEstimationAccess().getTargetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estimation__Group__0__Impl"


    // $ANTLR start "rule__Estimation__Group__1"
    // InternalEel.g:1035:1: rule__Estimation__Group__1 : rule__Estimation__Group__1__Impl rule__Estimation__Group__2 ;
    public final void rule__Estimation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1039:1: ( rule__Estimation__Group__1__Impl rule__Estimation__Group__2 )
            // InternalEel.g:1040:2: rule__Estimation__Group__1__Impl rule__Estimation__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Estimation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estimation__Group__2();

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
    // $ANTLR end "rule__Estimation__Group__1"


    // $ANTLR start "rule__Estimation__Group__1__Impl"
    // InternalEel.g:1047:1: rule__Estimation__Group__1__Impl : ( ( rule__Estimation__TargetAssignment_1 ) ) ;
    public final void rule__Estimation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1051:1: ( ( ( rule__Estimation__TargetAssignment_1 ) ) )
            // InternalEel.g:1052:1: ( ( rule__Estimation__TargetAssignment_1 ) )
            {
            // InternalEel.g:1052:1: ( ( rule__Estimation__TargetAssignment_1 ) )
            // InternalEel.g:1053:2: ( rule__Estimation__TargetAssignment_1 )
            {
             before(grammarAccess.getEstimationAccess().getTargetAssignment_1()); 
            // InternalEel.g:1054:2: ( rule__Estimation__TargetAssignment_1 )
            // InternalEel.g:1054:3: rule__Estimation__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Estimation__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEstimationAccess().getTargetAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estimation__Group__1__Impl"


    // $ANTLR start "rule__Estimation__Group__2"
    // InternalEel.g:1062:1: rule__Estimation__Group__2 : rule__Estimation__Group__2__Impl rule__Estimation__Group__3 ;
    public final void rule__Estimation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1066:1: ( rule__Estimation__Group__2__Impl rule__Estimation__Group__3 )
            // InternalEel.g:1067:2: rule__Estimation__Group__2__Impl rule__Estimation__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Estimation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estimation__Group__3();

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
    // $ANTLR end "rule__Estimation__Group__2"


    // $ANTLR start "rule__Estimation__Group__2__Impl"
    // InternalEel.g:1074:1: rule__Estimation__Group__2__Impl : ( ( rule__Estimation__Group_2__0 )? ) ;
    public final void rule__Estimation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1078:1: ( ( ( rule__Estimation__Group_2__0 )? ) )
            // InternalEel.g:1079:1: ( ( rule__Estimation__Group_2__0 )? )
            {
            // InternalEel.g:1079:1: ( ( rule__Estimation__Group_2__0 )? )
            // InternalEel.g:1080:2: ( rule__Estimation__Group_2__0 )?
            {
             before(grammarAccess.getEstimationAccess().getGroup_2()); 
            // InternalEel.g:1081:2: ( rule__Estimation__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEel.g:1081:3: rule__Estimation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Estimation__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEstimationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estimation__Group__2__Impl"


    // $ANTLR start "rule__Estimation__Group__3"
    // InternalEel.g:1089:1: rule__Estimation__Group__3 : rule__Estimation__Group__3__Impl rule__Estimation__Group__4 ;
    public final void rule__Estimation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1093:1: ( rule__Estimation__Group__3__Impl rule__Estimation__Group__4 )
            // InternalEel.g:1094:2: rule__Estimation__Group__3__Impl rule__Estimation__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Estimation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estimation__Group__4();

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
    // $ANTLR end "rule__Estimation__Group__3"


    // $ANTLR start "rule__Estimation__Group__3__Impl"
    // InternalEel.g:1101:1: rule__Estimation__Group__3__Impl : ( 'formula' ) ;
    public final void rule__Estimation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1105:1: ( ( 'formula' ) )
            // InternalEel.g:1106:1: ( 'formula' )
            {
            // InternalEel.g:1106:1: ( 'formula' )
            // InternalEel.g:1107:2: 'formula'
            {
             before(grammarAccess.getEstimationAccess().getFormulaKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEstimationAccess().getFormulaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estimation__Group__3__Impl"


    // $ANTLR start "rule__Estimation__Group__4"
    // InternalEel.g:1116:1: rule__Estimation__Group__4 : rule__Estimation__Group__4__Impl ;
    public final void rule__Estimation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1120:1: ( rule__Estimation__Group__4__Impl )
            // InternalEel.g:1121:2: rule__Estimation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Estimation__Group__4__Impl();

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
    // $ANTLR end "rule__Estimation__Group__4"


    // $ANTLR start "rule__Estimation__Group__4__Impl"
    // InternalEel.g:1127:1: rule__Estimation__Group__4__Impl : ( ( rule__Estimation__FormulaAssignment_4 ) ) ;
    public final void rule__Estimation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1131:1: ( ( ( rule__Estimation__FormulaAssignment_4 ) ) )
            // InternalEel.g:1132:1: ( ( rule__Estimation__FormulaAssignment_4 ) )
            {
            // InternalEel.g:1132:1: ( ( rule__Estimation__FormulaAssignment_4 ) )
            // InternalEel.g:1133:2: ( rule__Estimation__FormulaAssignment_4 )
            {
             before(grammarAccess.getEstimationAccess().getFormulaAssignment_4()); 
            // InternalEel.g:1134:2: ( rule__Estimation__FormulaAssignment_4 )
            // InternalEel.g:1134:3: rule__Estimation__FormulaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Estimation__FormulaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEstimationAccess().getFormulaAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estimation__Group__4__Impl"


    // $ANTLR start "rule__Estimation__Group_2__0"
    // InternalEel.g:1143:1: rule__Estimation__Group_2__0 : rule__Estimation__Group_2__0__Impl rule__Estimation__Group_2__1 ;
    public final void rule__Estimation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1147:1: ( rule__Estimation__Group_2__0__Impl rule__Estimation__Group_2__1 )
            // InternalEel.g:1148:2: rule__Estimation__Group_2__0__Impl rule__Estimation__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Estimation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estimation__Group_2__1();

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
    // $ANTLR end "rule__Estimation__Group_2__0"


    // $ANTLR start "rule__Estimation__Group_2__0__Impl"
    // InternalEel.g:1155:1: rule__Estimation__Group_2__0__Impl : ( 'variables' ) ;
    public final void rule__Estimation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1159:1: ( ( 'variables' ) )
            // InternalEel.g:1160:1: ( 'variables' )
            {
            // InternalEel.g:1160:1: ( 'variables' )
            // InternalEel.g:1161:2: 'variables'
            {
             before(grammarAccess.getEstimationAccess().getVariablesKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEstimationAccess().getVariablesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estimation__Group_2__0__Impl"


    // $ANTLR start "rule__Estimation__Group_2__1"
    // InternalEel.g:1170:1: rule__Estimation__Group_2__1 : rule__Estimation__Group_2__1__Impl rule__Estimation__Group_2__2 ;
    public final void rule__Estimation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1174:1: ( rule__Estimation__Group_2__1__Impl rule__Estimation__Group_2__2 )
            // InternalEel.g:1175:2: rule__Estimation__Group_2__1__Impl rule__Estimation__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__Estimation__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estimation__Group_2__2();

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
    // $ANTLR end "rule__Estimation__Group_2__1"


    // $ANTLR start "rule__Estimation__Group_2__1__Impl"
    // InternalEel.g:1182:1: rule__Estimation__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Estimation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1186:1: ( ( '(' ) )
            // InternalEel.g:1187:1: ( '(' )
            {
            // InternalEel.g:1187:1: ( '(' )
            // InternalEel.g:1188:2: '('
            {
             before(grammarAccess.getEstimationAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEstimationAccess().getLeftParenthesisKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estimation__Group_2__1__Impl"


    // $ANTLR start "rule__Estimation__Group_2__2"
    // InternalEel.g:1197:1: rule__Estimation__Group_2__2 : rule__Estimation__Group_2__2__Impl rule__Estimation__Group_2__3 ;
    public final void rule__Estimation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1201:1: ( rule__Estimation__Group_2__2__Impl rule__Estimation__Group_2__3 )
            // InternalEel.g:1202:2: rule__Estimation__Group_2__2__Impl rule__Estimation__Group_2__3
            {
            pushFollow(FOLLOW_15);
            rule__Estimation__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estimation__Group_2__3();

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
    // $ANTLR end "rule__Estimation__Group_2__2"


    // $ANTLR start "rule__Estimation__Group_2__2__Impl"
    // InternalEel.g:1209:1: rule__Estimation__Group_2__2__Impl : ( ( rule__Estimation__VariablesAssignment_2_2 ) ) ;
    public final void rule__Estimation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1213:1: ( ( ( rule__Estimation__VariablesAssignment_2_2 ) ) )
            // InternalEel.g:1214:1: ( ( rule__Estimation__VariablesAssignment_2_2 ) )
            {
            // InternalEel.g:1214:1: ( ( rule__Estimation__VariablesAssignment_2_2 ) )
            // InternalEel.g:1215:2: ( rule__Estimation__VariablesAssignment_2_2 )
            {
             before(grammarAccess.getEstimationAccess().getVariablesAssignment_2_2()); 
            // InternalEel.g:1216:2: ( rule__Estimation__VariablesAssignment_2_2 )
            // InternalEel.g:1216:3: rule__Estimation__VariablesAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Estimation__VariablesAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getEstimationAccess().getVariablesAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estimation__Group_2__2__Impl"


    // $ANTLR start "rule__Estimation__Group_2__3"
    // InternalEel.g:1224:1: rule__Estimation__Group_2__3 : rule__Estimation__Group_2__3__Impl rule__Estimation__Group_2__4 ;
    public final void rule__Estimation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1228:1: ( rule__Estimation__Group_2__3__Impl rule__Estimation__Group_2__4 )
            // InternalEel.g:1229:2: rule__Estimation__Group_2__3__Impl rule__Estimation__Group_2__4
            {
            pushFollow(FOLLOW_15);
            rule__Estimation__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estimation__Group_2__4();

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
    // $ANTLR end "rule__Estimation__Group_2__3"


    // $ANTLR start "rule__Estimation__Group_2__3__Impl"
    // InternalEel.g:1236:1: rule__Estimation__Group_2__3__Impl : ( ( rule__Estimation__Group_2_3__0 )* ) ;
    public final void rule__Estimation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1240:1: ( ( ( rule__Estimation__Group_2_3__0 )* ) )
            // InternalEel.g:1241:1: ( ( rule__Estimation__Group_2_3__0 )* )
            {
            // InternalEel.g:1241:1: ( ( rule__Estimation__Group_2_3__0 )* )
            // InternalEel.g:1242:2: ( rule__Estimation__Group_2_3__0 )*
            {
             before(grammarAccess.getEstimationAccess().getGroup_2_3()); 
            // InternalEel.g:1243:2: ( rule__Estimation__Group_2_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEel.g:1243:3: rule__Estimation__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Estimation__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEstimationAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estimation__Group_2__3__Impl"


    // $ANTLR start "rule__Estimation__Group_2__4"
    // InternalEel.g:1251:1: rule__Estimation__Group_2__4 : rule__Estimation__Group_2__4__Impl ;
    public final void rule__Estimation__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1255:1: ( rule__Estimation__Group_2__4__Impl )
            // InternalEel.g:1256:2: rule__Estimation__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Estimation__Group_2__4__Impl();

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
    // $ANTLR end "rule__Estimation__Group_2__4"


    // $ANTLR start "rule__Estimation__Group_2__4__Impl"
    // InternalEel.g:1262:1: rule__Estimation__Group_2__4__Impl : ( ')' ) ;
    public final void rule__Estimation__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1266:1: ( ( ')' ) )
            // InternalEel.g:1267:1: ( ')' )
            {
            // InternalEel.g:1267:1: ( ')' )
            // InternalEel.g:1268:2: ')'
            {
             before(grammarAccess.getEstimationAccess().getRightParenthesisKeyword_2_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEstimationAccess().getRightParenthesisKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estimation__Group_2__4__Impl"


    // $ANTLR start "rule__Estimation__Group_2_3__0"
    // InternalEel.g:1278:1: rule__Estimation__Group_2_3__0 : rule__Estimation__Group_2_3__0__Impl rule__Estimation__Group_2_3__1 ;
    public final void rule__Estimation__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1282:1: ( rule__Estimation__Group_2_3__0__Impl rule__Estimation__Group_2_3__1 )
            // InternalEel.g:1283:2: rule__Estimation__Group_2_3__0__Impl rule__Estimation__Group_2_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Estimation__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estimation__Group_2_3__1();

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
    // $ANTLR end "rule__Estimation__Group_2_3__0"


    // $ANTLR start "rule__Estimation__Group_2_3__0__Impl"
    // InternalEel.g:1290:1: rule__Estimation__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Estimation__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1294:1: ( ( ',' ) )
            // InternalEel.g:1295:1: ( ',' )
            {
            // InternalEel.g:1295:1: ( ',' )
            // InternalEel.g:1296:2: ','
            {
             before(grammarAccess.getEstimationAccess().getCommaKeyword_2_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEstimationAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estimation__Group_2_3__0__Impl"


    // $ANTLR start "rule__Estimation__Group_2_3__1"
    // InternalEel.g:1305:1: rule__Estimation__Group_2_3__1 : rule__Estimation__Group_2_3__1__Impl ;
    public final void rule__Estimation__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1309:1: ( rule__Estimation__Group_2_3__1__Impl )
            // InternalEel.g:1310:2: rule__Estimation__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Estimation__Group_2_3__1__Impl();

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
    // $ANTLR end "rule__Estimation__Group_2_3__1"


    // $ANTLR start "rule__Estimation__Group_2_3__1__Impl"
    // InternalEel.g:1316:1: rule__Estimation__Group_2_3__1__Impl : ( ( rule__Estimation__VariablesAssignment_2_3_1 ) ) ;
    public final void rule__Estimation__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1320:1: ( ( ( rule__Estimation__VariablesAssignment_2_3_1 ) ) )
            // InternalEel.g:1321:1: ( ( rule__Estimation__VariablesAssignment_2_3_1 ) )
            {
            // InternalEel.g:1321:1: ( ( rule__Estimation__VariablesAssignment_2_3_1 ) )
            // InternalEel.g:1322:2: ( rule__Estimation__VariablesAssignment_2_3_1 )
            {
             before(grammarAccess.getEstimationAccess().getVariablesAssignment_2_3_1()); 
            // InternalEel.g:1323:2: ( rule__Estimation__VariablesAssignment_2_3_1 )
            // InternalEel.g:1323:3: rule__Estimation__VariablesAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Estimation__VariablesAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEstimationAccess().getVariablesAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estimation__Group_2_3__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalEel.g:1332:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1336:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalEel.g:1337:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalEel.g:1344:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__VibilityAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1348:1: ( ( ( rule__Variable__VibilityAssignment_0 ) ) )
            // InternalEel.g:1349:1: ( ( rule__Variable__VibilityAssignment_0 ) )
            {
            // InternalEel.g:1349:1: ( ( rule__Variable__VibilityAssignment_0 ) )
            // InternalEel.g:1350:2: ( rule__Variable__VibilityAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getVibilityAssignment_0()); 
            // InternalEel.g:1351:2: ( rule__Variable__VibilityAssignment_0 )
            // InternalEel.g:1351:3: rule__Variable__VibilityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__VibilityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getVibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalEel.g:1359:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1363:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalEel.g:1364:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalEel.g:1371:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1375:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalEel.g:1376:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalEel.g:1376:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalEel.g:1377:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalEel.g:1378:2: ( rule__Variable__NameAssignment_1 )
            // InternalEel.g:1378:3: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalEel.g:1386:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1390:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalEel.g:1391:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__3();

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
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalEel.g:1398:1: rule__Variable__Group__2__Impl : ( '=' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1402:1: ( ( '=' ) )
            // InternalEel.g:1403:1: ( '=' )
            {
            // InternalEel.g:1403:1: ( '=' )
            // InternalEel.g:1404:2: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // InternalEel.g:1413:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1417:1: ( rule__Variable__Group__3__Impl )
            // InternalEel.g:1418:2: rule__Variable__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__3__Impl();

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
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // InternalEel.g:1424:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__ValueAssignment_3 ) ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1428:1: ( ( ( rule__Variable__ValueAssignment_3 ) ) )
            // InternalEel.g:1429:1: ( ( rule__Variable__ValueAssignment_3 ) )
            {
            // InternalEel.g:1429:1: ( ( rule__Variable__ValueAssignment_3 ) )
            // InternalEel.g:1430:2: ( rule__Variable__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableAccess().getValueAssignment_3()); 
            // InternalEel.g:1431:2: ( rule__Variable__ValueAssignment_3 )
            // InternalEel.g:1431:3: rule__Variable__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalEel.g:1440:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1444:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalEel.g:1445:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

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
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalEel.g:1452:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1456:1: ( ( ( '-' )? ) )
            // InternalEel.g:1457:1: ( ( '-' )? )
            {
            // InternalEel.g:1457:1: ( ( '-' )? )
            // InternalEel.g:1458:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalEel.g:1459:2: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEel.g:1459:3: '-'
                    {
                    match(input,27,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalEel.g:1467:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1471:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalEel.g:1472:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

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
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalEel.g:1479:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1483:1: ( ( ( RULE_INT )? ) )
            // InternalEel.g:1484:1: ( ( RULE_INT )? )
            {
            // InternalEel.g:1484:1: ( ( RULE_INT )? )
            // InternalEel.g:1485:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalEel.g:1486:2: ( RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEel.g:1486:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalEel.g:1494:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1498:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalEel.g:1499:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

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
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalEel.g:1506:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1510:1: ( ( '.' ) )
            // InternalEel.g:1511:1: ( '.' )
            {
            // InternalEel.g:1511:1: ( '.' )
            // InternalEel.g:1512:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalEel.g:1521:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1525:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalEel.g:1526:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

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
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalEel.g:1533:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1537:1: ( ( RULE_INT ) )
            // InternalEel.g:1538:1: ( RULE_INT )
            {
            // InternalEel.g:1538:1: ( RULE_INT )
            // InternalEel.g:1539:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalEel.g:1548:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1552:1: ( rule__EDouble__Group__4__Impl )
            // InternalEel.g:1553:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

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
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalEel.g:1559:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1563:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalEel.g:1564:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalEel.g:1564:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalEel.g:1565:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalEel.g:1566:2: ( rule__EDouble__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=11 && LA14_0<=12)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEel.g:1566:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalEel.g:1575:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1579:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalEel.g:1580:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

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
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalEel.g:1587:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1591:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalEel.g:1592:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalEel.g:1592:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalEel.g:1593:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalEel.g:1594:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalEel.g:1594:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalEel.g:1602:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1606:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalEel.g:1607:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_20);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

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
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalEel.g:1614:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1618:1: ( ( ( '-' )? ) )
            // InternalEel.g:1619:1: ( ( '-' )? )
            {
            // InternalEel.g:1619:1: ( ( '-' )? )
            // InternalEel.g:1620:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalEel.g:1621:2: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEel.g:1621:3: '-'
                    {
                    match(input,27,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalEel.g:1629:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1633:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalEel.g:1634:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

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
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalEel.g:1640:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1644:1: ( ( RULE_INT ) )
            // InternalEel.g:1645:1: ( RULE_INT )
            {
            // InternalEel.g:1645:1: ( RULE_INT )
            // InternalEel.g:1646:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__MetaClass__Group__0"
    // InternalEel.g:1656:1: rule__MetaClass__Group__0 : rule__MetaClass__Group__0__Impl rule__MetaClass__Group__1 ;
    public final void rule__MetaClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1660:1: ( rule__MetaClass__Group__0__Impl rule__MetaClass__Group__1 )
            // InternalEel.g:1661:2: rule__MetaClass__Group__0__Impl rule__MetaClass__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MetaClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaClass__Group__1();

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
    // $ANTLR end "rule__MetaClass__Group__0"


    // $ANTLR start "rule__MetaClass__Group__0__Impl"
    // InternalEel.g:1668:1: rule__MetaClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__MetaClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1672:1: ( ( 'class' ) )
            // InternalEel.g:1673:1: ( 'class' )
            {
            // InternalEel.g:1673:1: ( 'class' )
            // InternalEel.g:1674:2: 'class'
            {
             before(grammarAccess.getMetaClassAccess().getClassKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMetaClassAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__0__Impl"


    // $ANTLR start "rule__MetaClass__Group__1"
    // InternalEel.g:1683:1: rule__MetaClass__Group__1 : rule__MetaClass__Group__1__Impl rule__MetaClass__Group__2 ;
    public final void rule__MetaClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1687:1: ( rule__MetaClass__Group__1__Impl rule__MetaClass__Group__2 )
            // InternalEel.g:1688:2: rule__MetaClass__Group__1__Impl rule__MetaClass__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__MetaClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaClass__Group__2();

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
    // $ANTLR end "rule__MetaClass__Group__1"


    // $ANTLR start "rule__MetaClass__Group__1__Impl"
    // InternalEel.g:1695:1: rule__MetaClass__Group__1__Impl : ( ( rule__MetaClass__NameAssignment_1 ) ) ;
    public final void rule__MetaClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1699:1: ( ( ( rule__MetaClass__NameAssignment_1 ) ) )
            // InternalEel.g:1700:1: ( ( rule__MetaClass__NameAssignment_1 ) )
            {
            // InternalEel.g:1700:1: ( ( rule__MetaClass__NameAssignment_1 ) )
            // InternalEel.g:1701:2: ( rule__MetaClass__NameAssignment_1 )
            {
             before(grammarAccess.getMetaClassAccess().getNameAssignment_1()); 
            // InternalEel.g:1702:2: ( rule__MetaClass__NameAssignment_1 )
            // InternalEel.g:1702:3: rule__MetaClass__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MetaClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__1__Impl"


    // $ANTLR start "rule__MetaClass__Group__2"
    // InternalEel.g:1710:1: rule__MetaClass__Group__2 : rule__MetaClass__Group__2__Impl ;
    public final void rule__MetaClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1714:1: ( rule__MetaClass__Group__2__Impl )
            // InternalEel.g:1715:2: rule__MetaClass__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetaClass__Group__2__Impl();

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
    // $ANTLR end "rule__MetaClass__Group__2"


    // $ANTLR start "rule__MetaClass__Group__2__Impl"
    // InternalEel.g:1721:1: rule__MetaClass__Group__2__Impl : ( ( rule__MetaClass__Group_2__0 )? ) ;
    public final void rule__MetaClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1725:1: ( ( ( rule__MetaClass__Group_2__0 )? ) )
            // InternalEel.g:1726:1: ( ( rule__MetaClass__Group_2__0 )? )
            {
            // InternalEel.g:1726:1: ( ( rule__MetaClass__Group_2__0 )? )
            // InternalEel.g:1727:2: ( rule__MetaClass__Group_2__0 )?
            {
             before(grammarAccess.getMetaClassAccess().getGroup_2()); 
            // InternalEel.g:1728:2: ( rule__MetaClass__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEel.g:1728:3: rule__MetaClass__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MetaClass__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetaClassAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__2__Impl"


    // $ANTLR start "rule__MetaClass__Group_2__0"
    // InternalEel.g:1737:1: rule__MetaClass__Group_2__0 : rule__MetaClass__Group_2__0__Impl rule__MetaClass__Group_2__1 ;
    public final void rule__MetaClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1741:1: ( rule__MetaClass__Group_2__0__Impl rule__MetaClass__Group_2__1 )
            // InternalEel.g:1742:2: rule__MetaClass__Group_2__0__Impl rule__MetaClass__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__MetaClass__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaClass__Group_2__1();

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
    // $ANTLR end "rule__MetaClass__Group_2__0"


    // $ANTLR start "rule__MetaClass__Group_2__0__Impl"
    // InternalEel.g:1749:1: rule__MetaClass__Group_2__0__Impl : ( '(' ) ;
    public final void rule__MetaClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1753:1: ( ( '(' ) )
            // InternalEel.g:1754:1: ( '(' )
            {
            // InternalEel.g:1754:1: ( '(' )
            // InternalEel.g:1755:2: '('
            {
             before(grammarAccess.getMetaClassAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMetaClassAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_2__0__Impl"


    // $ANTLR start "rule__MetaClass__Group_2__1"
    // InternalEel.g:1764:1: rule__MetaClass__Group_2__1 : rule__MetaClass__Group_2__1__Impl rule__MetaClass__Group_2__2 ;
    public final void rule__MetaClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1768:1: ( rule__MetaClass__Group_2__1__Impl rule__MetaClass__Group_2__2 )
            // InternalEel.g:1769:2: rule__MetaClass__Group_2__1__Impl rule__MetaClass__Group_2__2
            {
            pushFollow(FOLLOW_21);
            rule__MetaClass__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaClass__Group_2__2();

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
    // $ANTLR end "rule__MetaClass__Group_2__1"


    // $ANTLR start "rule__MetaClass__Group_2__1__Impl"
    // InternalEel.g:1776:1: rule__MetaClass__Group_2__1__Impl : ( ( rule__MetaClass__Group_2_1__0 )? ) ;
    public final void rule__MetaClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1780:1: ( ( ( rule__MetaClass__Group_2_1__0 )? ) )
            // InternalEel.g:1781:1: ( ( rule__MetaClass__Group_2_1__0 )? )
            {
            // InternalEel.g:1781:1: ( ( rule__MetaClass__Group_2_1__0 )? )
            // InternalEel.g:1782:2: ( rule__MetaClass__Group_2_1__0 )?
            {
             before(grammarAccess.getMetaClassAccess().getGroup_2_1()); 
            // InternalEel.g:1783:2: ( rule__MetaClass__Group_2_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)||LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEel.g:1783:3: rule__MetaClass__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MetaClass__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetaClassAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_2__1__Impl"


    // $ANTLR start "rule__MetaClass__Group_2__2"
    // InternalEel.g:1791:1: rule__MetaClass__Group_2__2 : rule__MetaClass__Group_2__2__Impl ;
    public final void rule__MetaClass__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1795:1: ( rule__MetaClass__Group_2__2__Impl )
            // InternalEel.g:1796:2: rule__MetaClass__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetaClass__Group_2__2__Impl();

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
    // $ANTLR end "rule__MetaClass__Group_2__2"


    // $ANTLR start "rule__MetaClass__Group_2__2__Impl"
    // InternalEel.g:1802:1: rule__MetaClass__Group_2__2__Impl : ( ')' ) ;
    public final void rule__MetaClass__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1806:1: ( ( ')' ) )
            // InternalEel.g:1807:1: ( ')' )
            {
            // InternalEel.g:1807:1: ( ')' )
            // InternalEel.g:1808:2: ')'
            {
             before(grammarAccess.getMetaClassAccess().getRightParenthesisKeyword_2_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMetaClassAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_2__2__Impl"


    // $ANTLR start "rule__MetaClass__Group_2_1__0"
    // InternalEel.g:1818:1: rule__MetaClass__Group_2_1__0 : rule__MetaClass__Group_2_1__0__Impl rule__MetaClass__Group_2_1__1 ;
    public final void rule__MetaClass__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1822:1: ( rule__MetaClass__Group_2_1__0__Impl rule__MetaClass__Group_2_1__1 )
            // InternalEel.g:1823:2: rule__MetaClass__Group_2_1__0__Impl rule__MetaClass__Group_2_1__1
            {
            pushFollow(FOLLOW_11);
            rule__MetaClass__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaClass__Group_2_1__1();

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
    // $ANTLR end "rule__MetaClass__Group_2_1__0"


    // $ANTLR start "rule__MetaClass__Group_2_1__0__Impl"
    // InternalEel.g:1830:1: rule__MetaClass__Group_2_1__0__Impl : ( ( rule__MetaClass__OperationsAssignment_2_1_0 ) ) ;
    public final void rule__MetaClass__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1834:1: ( ( ( rule__MetaClass__OperationsAssignment_2_1_0 ) ) )
            // InternalEel.g:1835:1: ( ( rule__MetaClass__OperationsAssignment_2_1_0 ) )
            {
            // InternalEel.g:1835:1: ( ( rule__MetaClass__OperationsAssignment_2_1_0 ) )
            // InternalEel.g:1836:2: ( rule__MetaClass__OperationsAssignment_2_1_0 )
            {
             before(grammarAccess.getMetaClassAccess().getOperationsAssignment_2_1_0()); 
            // InternalEel.g:1837:2: ( rule__MetaClass__OperationsAssignment_2_1_0 )
            // InternalEel.g:1837:3: rule__MetaClass__OperationsAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MetaClass__OperationsAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMetaClassAccess().getOperationsAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_2_1__0__Impl"


    // $ANTLR start "rule__MetaClass__Group_2_1__1"
    // InternalEel.g:1845:1: rule__MetaClass__Group_2_1__1 : rule__MetaClass__Group_2_1__1__Impl ;
    public final void rule__MetaClass__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1849:1: ( rule__MetaClass__Group_2_1__1__Impl )
            // InternalEel.g:1850:2: rule__MetaClass__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetaClass__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__MetaClass__Group_2_1__1"


    // $ANTLR start "rule__MetaClass__Group_2_1__1__Impl"
    // InternalEel.g:1856:1: rule__MetaClass__Group_2_1__1__Impl : ( ( rule__MetaClass__Group_2_1_1__0 )? ) ;
    public final void rule__MetaClass__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1860:1: ( ( ( rule__MetaClass__Group_2_1_1__0 )? ) )
            // InternalEel.g:1861:1: ( ( rule__MetaClass__Group_2_1_1__0 )? )
            {
            // InternalEel.g:1861:1: ( ( rule__MetaClass__Group_2_1_1__0 )? )
            // InternalEel.g:1862:2: ( rule__MetaClass__Group_2_1_1__0 )?
            {
             before(grammarAccess.getMetaClassAccess().getGroup_2_1_1()); 
            // InternalEel.g:1863:2: ( rule__MetaClass__Group_2_1_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEel.g:1863:3: rule__MetaClass__Group_2_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MetaClass__Group_2_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetaClassAccess().getGroup_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_2_1__1__Impl"


    // $ANTLR start "rule__MetaClass__Group_2_1_1__0"
    // InternalEel.g:1872:1: rule__MetaClass__Group_2_1_1__0 : rule__MetaClass__Group_2_1_1__0__Impl rule__MetaClass__Group_2_1_1__1 ;
    public final void rule__MetaClass__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1876:1: ( rule__MetaClass__Group_2_1_1__0__Impl rule__MetaClass__Group_2_1_1__1 )
            // InternalEel.g:1877:2: rule__MetaClass__Group_2_1_1__0__Impl rule__MetaClass__Group_2_1_1__1
            {
            pushFollow(FOLLOW_22);
            rule__MetaClass__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaClass__Group_2_1_1__1();

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
    // $ANTLR end "rule__MetaClass__Group_2_1_1__0"


    // $ANTLR start "rule__MetaClass__Group_2_1_1__0__Impl"
    // InternalEel.g:1884:1: rule__MetaClass__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__MetaClass__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1888:1: ( ( ',' ) )
            // InternalEel.g:1889:1: ( ',' )
            {
            // InternalEel.g:1889:1: ( ',' )
            // InternalEel.g:1890:2: ','
            {
             before(grammarAccess.getMetaClassAccess().getCommaKeyword_2_1_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMetaClassAccess().getCommaKeyword_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__MetaClass__Group_2_1_1__1"
    // InternalEel.g:1899:1: rule__MetaClass__Group_2_1_1__1 : rule__MetaClass__Group_2_1_1__1__Impl ;
    public final void rule__MetaClass__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1903:1: ( rule__MetaClass__Group_2_1_1__1__Impl )
            // InternalEel.g:1904:2: rule__MetaClass__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetaClass__Group_2_1_1__1__Impl();

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
    // $ANTLR end "rule__MetaClass__Group_2_1_1__1"


    // $ANTLR start "rule__MetaClass__Group_2_1_1__1__Impl"
    // InternalEel.g:1910:1: rule__MetaClass__Group_2_1_1__1__Impl : ( ( rule__MetaClass__OperationsAssignment_2_1_1_1 ) ) ;
    public final void rule__MetaClass__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1914:1: ( ( ( rule__MetaClass__OperationsAssignment_2_1_1_1 ) ) )
            // InternalEel.g:1915:1: ( ( rule__MetaClass__OperationsAssignment_2_1_1_1 ) )
            {
            // InternalEel.g:1915:1: ( ( rule__MetaClass__OperationsAssignment_2_1_1_1 ) )
            // InternalEel.g:1916:2: ( rule__MetaClass__OperationsAssignment_2_1_1_1 )
            {
             before(grammarAccess.getMetaClassAccess().getOperationsAssignment_2_1_1_1()); 
            // InternalEel.g:1917:2: ( rule__MetaClass__OperationsAssignment_2_1_1_1 )
            // InternalEel.g:1917:3: rule__MetaClass__OperationsAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MetaClass__OperationsAssignment_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaClassAccess().getOperationsAssignment_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // InternalEel.g:1926:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1930:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalEel.g:1931:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__1();

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
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // InternalEel.g:1938:1: rule__Operation__Group__0__Impl : ( ( 'op' )? ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1942:1: ( ( ( 'op' )? ) )
            // InternalEel.g:1943:1: ( ( 'op' )? )
            {
            // InternalEel.g:1943:1: ( ( 'op' )? )
            // InternalEel.g:1944:2: ( 'op' )?
            {
             before(grammarAccess.getOperationAccess().getOpKeyword_0()); 
            // InternalEel.g:1945:2: ( 'op' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEel.g:1945:3: 'op'
                    {
                    match(input,30,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getOpKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // InternalEel.g:1953:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1957:1: ( rule__Operation__Group__1__Impl )
            // InternalEel.g:1958:2: rule__Operation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__1__Impl();

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
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // InternalEel.g:1964:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1968:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // InternalEel.g:1969:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // InternalEel.g:1969:1: ( ( rule__Operation__NameAssignment_1 ) )
            // InternalEel.g:1970:2: ( rule__Operation__NameAssignment_1 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            // InternalEel.g:1971:2: ( rule__Operation__NameAssignment_1 )
            // InternalEel.g:1971:3: rule__Operation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Platform__NameAssignment_2"
    // InternalEel.g:1980:1: rule__Platform__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Platform__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1984:1: ( ( ruleEString ) )
            // InternalEel.g:1985:2: ( ruleEString )
            {
            // InternalEel.g:1985:2: ( ruleEString )
            // InternalEel.g:1986:3: ruleEString
            {
             before(grammarAccess.getPlatformAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlatformAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__NameAssignment_2"


    // $ANTLR start "rule__Platform__TargetsAssignment_4_2"
    // InternalEel.g:1995:1: rule__Platform__TargetsAssignment_4_2 : ( ruleMetaClass ) ;
    public final void rule__Platform__TargetsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:1999:1: ( ( ruleMetaClass ) )
            // InternalEel.g:2000:2: ( ruleMetaClass )
            {
            // InternalEel.g:2000:2: ( ruleMetaClass )
            // InternalEel.g:2001:3: ruleMetaClass
            {
             before(grammarAccess.getPlatformAccess().getTargetsMetaClassParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaClass();

            state._fsp--;

             after(grammarAccess.getPlatformAccess().getTargetsMetaClassParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__TargetsAssignment_4_2"


    // $ANTLR start "rule__Platform__TargetsAssignment_4_3_1"
    // InternalEel.g:2010:1: rule__Platform__TargetsAssignment_4_3_1 : ( ruleMetaClass ) ;
    public final void rule__Platform__TargetsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:2014:1: ( ( ruleMetaClass ) )
            // InternalEel.g:2015:2: ( ruleMetaClass )
            {
            // InternalEel.g:2015:2: ( ruleMetaClass )
            // InternalEel.g:2016:3: ruleMetaClass
            {
             before(grammarAccess.getPlatformAccess().getTargetsMetaClassParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaClass();

            state._fsp--;

             after(grammarAccess.getPlatformAccess().getTargetsMetaClassParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__TargetsAssignment_4_3_1"


    // $ANTLR start "rule__Platform__EstimationsAssignment_5_2"
    // InternalEel.g:2025:1: rule__Platform__EstimationsAssignment_5_2 : ( ruleEstimation ) ;
    public final void rule__Platform__EstimationsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:2029:1: ( ( ruleEstimation ) )
            // InternalEel.g:2030:2: ( ruleEstimation )
            {
            // InternalEel.g:2030:2: ( ruleEstimation )
            // InternalEel.g:2031:3: ruleEstimation
            {
             before(grammarAccess.getPlatformAccess().getEstimationsEstimationParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEstimation();

            state._fsp--;

             after(grammarAccess.getPlatformAccess().getEstimationsEstimationParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__EstimationsAssignment_5_2"


    // $ANTLR start "rule__Platform__EstimationsAssignment_5_3_1"
    // InternalEel.g:2040:1: rule__Platform__EstimationsAssignment_5_3_1 : ( ruleEstimation ) ;
    public final void rule__Platform__EstimationsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:2044:1: ( ( ruleEstimation ) )
            // InternalEel.g:2045:2: ( ruleEstimation )
            {
            // InternalEel.g:2045:2: ( ruleEstimation )
            // InternalEel.g:2046:3: ruleEstimation
            {
             before(grammarAccess.getPlatformAccess().getEstimationsEstimationParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEstimation();

            state._fsp--;

             after(grammarAccess.getPlatformAccess().getEstimationsEstimationParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__EstimationsAssignment_5_3_1"


    // $ANTLR start "rule__Platform__VariablesAssignment_6_0"
    // InternalEel.g:2055:1: rule__Platform__VariablesAssignment_6_0 : ( ruleVariable ) ;
    public final void rule__Platform__VariablesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:2059:1: ( ( ruleVariable ) )
            // InternalEel.g:2060:2: ( ruleVariable )
            {
            // InternalEel.g:2060:2: ( ruleVariable )
            // InternalEel.g:2061:3: ruleVariable
            {
             before(grammarAccess.getPlatformAccess().getVariablesVariableParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getPlatformAccess().getVariablesVariableParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__VariablesAssignment_6_0"


    // $ANTLR start "rule__Platform__VariablesAssignment_6_1_1"
    // InternalEel.g:2070:1: rule__Platform__VariablesAssignment_6_1_1 : ( ruleVariable ) ;
    public final void rule__Platform__VariablesAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:2074:1: ( ( ruleVariable ) )
            // InternalEel.g:2075:2: ( ruleVariable )
            {
            // InternalEel.g:2075:2: ( ruleVariable )
            // InternalEel.g:2076:3: ruleVariable
            {
             before(grammarAccess.getPlatformAccess().getVariablesVariableParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getPlatformAccess().getVariablesVariableParserRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__VariablesAssignment_6_1_1"


    // $ANTLR start "rule__Estimation__TargetAssignment_1"
    // InternalEel.g:2085:1: rule__Estimation__TargetAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Estimation__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:2089:1: ( ( ( ruleEString ) ) )
            // InternalEel.g:2090:2: ( ( ruleEString ) )
            {
            // InternalEel.g:2090:2: ( ( ruleEString ) )
            // InternalEel.g:2091:3: ( ruleEString )
            {
             before(grammarAccess.getEstimationAccess().getTargetTargetCrossReference_1_0()); 
            // InternalEel.g:2092:3: ( ruleEString )
            // InternalEel.g:2093:4: ruleEString
            {
             before(grammarAccess.getEstimationAccess().getTargetTargetEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEstimationAccess().getTargetTargetEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEstimationAccess().getTargetTargetCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estimation__TargetAssignment_1"


    // $ANTLR start "rule__Estimation__VariablesAssignment_2_2"
    // InternalEel.g:2104:1: rule__Estimation__VariablesAssignment_2_2 : ( ( ruleEString ) ) ;
    public final void rule__Estimation__VariablesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:2108:1: ( ( ( ruleEString ) ) )
            // InternalEel.g:2109:2: ( ( ruleEString ) )
            {
            // InternalEel.g:2109:2: ( ( ruleEString ) )
            // InternalEel.g:2110:3: ( ruleEString )
            {
             before(grammarAccess.getEstimationAccess().getVariablesVariableCrossReference_2_2_0()); 
            // InternalEel.g:2111:3: ( ruleEString )
            // InternalEel.g:2112:4: ruleEString
            {
             before(grammarAccess.getEstimationAccess().getVariablesVariableEStringParserRuleCall_2_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEstimationAccess().getVariablesVariableEStringParserRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getEstimationAccess().getVariablesVariableCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estimation__VariablesAssignment_2_2"


    // $ANTLR start "rule__Estimation__VariablesAssignment_2_3_1"
    // InternalEel.g:2123:1: rule__Estimation__VariablesAssignment_2_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Estimation__VariablesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:2127:1: ( ( ( ruleEString ) ) )
            // InternalEel.g:2128:2: ( ( ruleEString ) )
            {
            // InternalEel.g:2128:2: ( ( ruleEString ) )
            // InternalEel.g:2129:3: ( ruleEString )
            {
             before(grammarAccess.getEstimationAccess().getVariablesVariableCrossReference_2_3_1_0()); 
            // InternalEel.g:2130:3: ( ruleEString )
            // InternalEel.g:2131:4: ruleEString
            {
             before(grammarAccess.getEstimationAccess().getVariablesVariableEStringParserRuleCall_2_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEstimationAccess().getVariablesVariableEStringParserRuleCall_2_3_1_0_1()); 

            }

             after(grammarAccess.getEstimationAccess().getVariablesVariableCrossReference_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estimation__VariablesAssignment_2_3_1"


    // $ANTLR start "rule__Estimation__FormulaAssignment_4"
    // InternalEel.g:2142:1: rule__Estimation__FormulaAssignment_4 : ( ruleEString ) ;
    public final void rule__Estimation__FormulaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:2146:1: ( ( ruleEString ) )
            // InternalEel.g:2147:2: ( ruleEString )
            {
            // InternalEel.g:2147:2: ( ruleEString )
            // InternalEel.g:2148:3: ruleEString
            {
             before(grammarAccess.getEstimationAccess().getFormulaEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEstimationAccess().getFormulaEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estimation__FormulaAssignment_4"


    // $ANTLR start "rule__Variable__VibilityAssignment_0"
    // InternalEel.g:2157:1: rule__Variable__VibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Variable__VibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:2161:1: ( ( ruleVisibility ) )
            // InternalEel.g:2162:2: ( ruleVisibility )
            {
            // InternalEel.g:2162:2: ( ruleVisibility )
            // InternalEel.g:2163:3: ruleVisibility
            {
             before(grammarAccess.getVariableAccess().getVibilityVisibilityEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getVibilityVisibilityEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__VibilityAssignment_0"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalEel.g:2172:1: rule__Variable__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:2176:1: ( ( ruleEString ) )
            // InternalEel.g:2177:2: ( ruleEString )
            {
            // InternalEel.g:2177:2: ( ruleEString )
            // InternalEel.g:2178:3: ruleEString
            {
             before(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__Variable__ValueAssignment_3"
    // InternalEel.g:2187:1: rule__Variable__ValueAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Variable__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:2191:1: ( ( ruleEDouble ) )
            // InternalEel.g:2192:2: ( ruleEDouble )
            {
            // InternalEel.g:2192:2: ( ruleEDouble )
            // InternalEel.g:2193:3: ruleEDouble
            {
             before(grammarAccess.getVariableAccess().getValueEDoubleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getValueEDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ValueAssignment_3"


    // $ANTLR start "rule__MetaClass__NameAssignment_1"
    // InternalEel.g:2202:1: rule__MetaClass__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MetaClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:2206:1: ( ( ruleEString ) )
            // InternalEel.g:2207:2: ( ruleEString )
            {
            // InternalEel.g:2207:2: ( ruleEString )
            // InternalEel.g:2208:3: ruleEString
            {
             before(grammarAccess.getMetaClassAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMetaClassAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__NameAssignment_1"


    // $ANTLR start "rule__MetaClass__OperationsAssignment_2_1_0"
    // InternalEel.g:2217:1: rule__MetaClass__OperationsAssignment_2_1_0 : ( ruleOperation ) ;
    public final void rule__MetaClass__OperationsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:2221:1: ( ( ruleOperation ) )
            // InternalEel.g:2222:2: ( ruleOperation )
            {
            // InternalEel.g:2222:2: ( ruleOperation )
            // InternalEel.g:2223:3: ruleOperation
            {
             before(grammarAccess.getMetaClassAccess().getOperationsOperationParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getMetaClassAccess().getOperationsOperationParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__OperationsAssignment_2_1_0"


    // $ANTLR start "rule__MetaClass__OperationsAssignment_2_1_1_1"
    // InternalEel.g:2232:1: rule__MetaClass__OperationsAssignment_2_1_1_1 : ( ruleOperation ) ;
    public final void rule__MetaClass__OperationsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:2236:1: ( ( ruleOperation ) )
            // InternalEel.g:2237:2: ( ruleOperation )
            {
            // InternalEel.g:2237:2: ( ruleOperation )
            // InternalEel.g:2238:3: ruleOperation
            {
             before(grammarAccess.getMetaClassAccess().getOperationsOperationParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getMetaClassAccess().getOperationsOperationParserRuleCall_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__OperationsAssignment_2_1_1_1"


    // $ANTLR start "rule__Operation__NameAssignment_1"
    // InternalEel.g:2247:1: rule__Operation__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEel.g:2251:1: ( ( ruleEString ) )
            // InternalEel.g:2252:2: ( ruleEString )
            {
            // InternalEel.g:2252:2: ( ruleEString )
            // InternalEel.g:2253:3: ruleEString
            {
             before(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000166000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000018000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000042000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000030L});

}