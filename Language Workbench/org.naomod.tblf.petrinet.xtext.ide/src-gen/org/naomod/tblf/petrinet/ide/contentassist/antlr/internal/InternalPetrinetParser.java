package org.naomod.tblf.petrinet.ide.contentassist.antlr.internal;

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
import org.naomod.tblf.petrinet.services.PetrinetGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPetrinetParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Net'", "'{'", "'first'", "'}'", "'name'", "'places'", "','", "'transitions'", "'Place'", "'tokens'", "'to'", "'Transition'", "'output'", "'('", "')'", "'input'", "'-'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPetrinetParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPetrinetParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPetrinetParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPetrinet.g"; }


    	private PetrinetGrammarAccess grammarAccess;

    	public void setGrammarAccess(PetrinetGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleNet"
    // InternalPetrinet.g:53:1: entryRuleNet : ruleNet EOF ;
    public final void entryRuleNet() throws RecognitionException {
        try {
            // InternalPetrinet.g:54:1: ( ruleNet EOF )
            // InternalPetrinet.g:55:1: ruleNet EOF
            {
             before(grammarAccess.getNetRule()); 
            pushFollow(FOLLOW_1);
            ruleNet();

            state._fsp--;

             after(grammarAccess.getNetRule()); 
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
    // $ANTLR end "entryRuleNet"


    // $ANTLR start "ruleNet"
    // InternalPetrinet.g:62:1: ruleNet : ( ( rule__Net__Group__0 ) ) ;
    public final void ruleNet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:66:2: ( ( ( rule__Net__Group__0 ) ) )
            // InternalPetrinet.g:67:2: ( ( rule__Net__Group__0 ) )
            {
            // InternalPetrinet.g:67:2: ( ( rule__Net__Group__0 ) )
            // InternalPetrinet.g:68:3: ( rule__Net__Group__0 )
            {
             before(grammarAccess.getNetAccess().getGroup()); 
            // InternalPetrinet.g:69:3: ( rule__Net__Group__0 )
            // InternalPetrinet.g:69:4: rule__Net__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Net__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNetAccess().getGroup()); 

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
    // $ANTLR end "ruleNet"


    // $ANTLR start "entryRulePlace"
    // InternalPetrinet.g:78:1: entryRulePlace : rulePlace EOF ;
    public final void entryRulePlace() throws RecognitionException {
        try {
            // InternalPetrinet.g:79:1: ( rulePlace EOF )
            // InternalPetrinet.g:80:1: rulePlace EOF
            {
             before(grammarAccess.getPlaceRule()); 
            pushFollow(FOLLOW_1);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getPlaceRule()); 
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
    // $ANTLR end "entryRulePlace"


    // $ANTLR start "rulePlace"
    // InternalPetrinet.g:87:1: rulePlace : ( ( rule__Place__Group__0 ) ) ;
    public final void rulePlace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:91:2: ( ( ( rule__Place__Group__0 ) ) )
            // InternalPetrinet.g:92:2: ( ( rule__Place__Group__0 ) )
            {
            // InternalPetrinet.g:92:2: ( ( rule__Place__Group__0 ) )
            // InternalPetrinet.g:93:3: ( rule__Place__Group__0 )
            {
             before(grammarAccess.getPlaceAccess().getGroup()); 
            // InternalPetrinet.g:94:3: ( rule__Place__Group__0 )
            // InternalPetrinet.g:94:4: rule__Place__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getGroup()); 

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
    // $ANTLR end "rulePlace"


    // $ANTLR start "entryRuleTransition"
    // InternalPetrinet.g:103:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalPetrinet.g:104:1: ( ruleTransition EOF )
            // InternalPetrinet.g:105:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalPetrinet.g:112:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:116:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalPetrinet.g:117:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalPetrinet.g:117:2: ( ( rule__Transition__Group__0 ) )
            // InternalPetrinet.g:118:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalPetrinet.g:119:3: ( rule__Transition__Group__0 )
            // InternalPetrinet.g:119:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEInt"
    // InternalPetrinet.g:128:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalPetrinet.g:129:1: ( ruleEInt EOF )
            // InternalPetrinet.g:130:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalPetrinet.g:137:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:141:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalPetrinet.g:142:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalPetrinet.g:142:2: ( ( rule__EInt__Group__0 ) )
            // InternalPetrinet.g:143:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalPetrinet.g:144:3: ( rule__EInt__Group__0 )
            // InternalPetrinet.g:144:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__Net__Group__0"
    // InternalPetrinet.g:152:1: rule__Net__Group__0 : rule__Net__Group__0__Impl rule__Net__Group__1 ;
    public final void rule__Net__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:156:1: ( rule__Net__Group__0__Impl rule__Net__Group__1 )
            // InternalPetrinet.g:157:2: rule__Net__Group__0__Impl rule__Net__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Net__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group__1();

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
    // $ANTLR end "rule__Net__Group__0"


    // $ANTLR start "rule__Net__Group__0__Impl"
    // InternalPetrinet.g:164:1: rule__Net__Group__0__Impl : ( () ) ;
    public final void rule__Net__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:168:1: ( ( () ) )
            // InternalPetrinet.g:169:1: ( () )
            {
            // InternalPetrinet.g:169:1: ( () )
            // InternalPetrinet.g:170:2: ()
            {
             before(grammarAccess.getNetAccess().getNetAction_0()); 
            // InternalPetrinet.g:171:2: ()
            // InternalPetrinet.g:171:3: 
            {
            }

             after(grammarAccess.getNetAccess().getNetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group__0__Impl"


    // $ANTLR start "rule__Net__Group__1"
    // InternalPetrinet.g:179:1: rule__Net__Group__1 : rule__Net__Group__1__Impl rule__Net__Group__2 ;
    public final void rule__Net__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:183:1: ( rule__Net__Group__1__Impl rule__Net__Group__2 )
            // InternalPetrinet.g:184:2: rule__Net__Group__1__Impl rule__Net__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Net__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group__2();

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
    // $ANTLR end "rule__Net__Group__1"


    // $ANTLR start "rule__Net__Group__1__Impl"
    // InternalPetrinet.g:191:1: rule__Net__Group__1__Impl : ( 'Net' ) ;
    public final void rule__Net__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:195:1: ( ( 'Net' ) )
            // InternalPetrinet.g:196:1: ( 'Net' )
            {
            // InternalPetrinet.g:196:1: ( 'Net' )
            // InternalPetrinet.g:197:2: 'Net'
            {
             before(grammarAccess.getNetAccess().getNetKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getNetAccess().getNetKeyword_1()); 

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
    // $ANTLR end "rule__Net__Group__1__Impl"


    // $ANTLR start "rule__Net__Group__2"
    // InternalPetrinet.g:206:1: rule__Net__Group__2 : rule__Net__Group__2__Impl rule__Net__Group__3 ;
    public final void rule__Net__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:210:1: ( rule__Net__Group__2__Impl rule__Net__Group__3 )
            // InternalPetrinet.g:211:2: rule__Net__Group__2__Impl rule__Net__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Net__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group__3();

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
    // $ANTLR end "rule__Net__Group__2"


    // $ANTLR start "rule__Net__Group__2__Impl"
    // InternalPetrinet.g:218:1: rule__Net__Group__2__Impl : ( '{' ) ;
    public final void rule__Net__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:222:1: ( ( '{' ) )
            // InternalPetrinet.g:223:1: ( '{' )
            {
            // InternalPetrinet.g:223:1: ( '{' )
            // InternalPetrinet.g:224:2: '{'
            {
             before(grammarAccess.getNetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNetAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Net__Group__2__Impl"


    // $ANTLR start "rule__Net__Group__3"
    // InternalPetrinet.g:233:1: rule__Net__Group__3 : rule__Net__Group__3__Impl rule__Net__Group__4 ;
    public final void rule__Net__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:237:1: ( rule__Net__Group__3__Impl rule__Net__Group__4 )
            // InternalPetrinet.g:238:2: rule__Net__Group__3__Impl rule__Net__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Net__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group__4();

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
    // $ANTLR end "rule__Net__Group__3"


    // $ANTLR start "rule__Net__Group__3__Impl"
    // InternalPetrinet.g:245:1: rule__Net__Group__3__Impl : ( ( rule__Net__Group_3__0 )? ) ;
    public final void rule__Net__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:249:1: ( ( ( rule__Net__Group_3__0 )? ) )
            // InternalPetrinet.g:250:1: ( ( rule__Net__Group_3__0 )? )
            {
            // InternalPetrinet.g:250:1: ( ( rule__Net__Group_3__0 )? )
            // InternalPetrinet.g:251:2: ( rule__Net__Group_3__0 )?
            {
             before(grammarAccess.getNetAccess().getGroup_3()); 
            // InternalPetrinet.g:252:2: ( rule__Net__Group_3__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPetrinet.g:252:3: rule__Net__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Net__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNetAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Net__Group__3__Impl"


    // $ANTLR start "rule__Net__Group__4"
    // InternalPetrinet.g:260:1: rule__Net__Group__4 : rule__Net__Group__4__Impl rule__Net__Group__5 ;
    public final void rule__Net__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:264:1: ( rule__Net__Group__4__Impl rule__Net__Group__5 )
            // InternalPetrinet.g:265:2: rule__Net__Group__4__Impl rule__Net__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Net__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group__5();

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
    // $ANTLR end "rule__Net__Group__4"


    // $ANTLR start "rule__Net__Group__4__Impl"
    // InternalPetrinet.g:272:1: rule__Net__Group__4__Impl : ( ( rule__Net__Group_4__0 )? ) ;
    public final void rule__Net__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:276:1: ( ( ( rule__Net__Group_4__0 )? ) )
            // InternalPetrinet.g:277:1: ( ( rule__Net__Group_4__0 )? )
            {
            // InternalPetrinet.g:277:1: ( ( rule__Net__Group_4__0 )? )
            // InternalPetrinet.g:278:2: ( rule__Net__Group_4__0 )?
            {
             before(grammarAccess.getNetAccess().getGroup_4()); 
            // InternalPetrinet.g:279:2: ( rule__Net__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPetrinet.g:279:3: rule__Net__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Net__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNetAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Net__Group__4__Impl"


    // $ANTLR start "rule__Net__Group__5"
    // InternalPetrinet.g:287:1: rule__Net__Group__5 : rule__Net__Group__5__Impl rule__Net__Group__6 ;
    public final void rule__Net__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:291:1: ( rule__Net__Group__5__Impl rule__Net__Group__6 )
            // InternalPetrinet.g:292:2: rule__Net__Group__5__Impl rule__Net__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Net__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group__6();

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
    // $ANTLR end "rule__Net__Group__5"


    // $ANTLR start "rule__Net__Group__5__Impl"
    // InternalPetrinet.g:299:1: rule__Net__Group__5__Impl : ( ( rule__Net__Group_5__0 )? ) ;
    public final void rule__Net__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:303:1: ( ( ( rule__Net__Group_5__0 )? ) )
            // InternalPetrinet.g:304:1: ( ( rule__Net__Group_5__0 )? )
            {
            // InternalPetrinet.g:304:1: ( ( rule__Net__Group_5__0 )? )
            // InternalPetrinet.g:305:2: ( rule__Net__Group_5__0 )?
            {
             before(grammarAccess.getNetAccess().getGroup_5()); 
            // InternalPetrinet.g:306:2: ( rule__Net__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPetrinet.g:306:3: rule__Net__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Net__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNetAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Net__Group__5__Impl"


    // $ANTLR start "rule__Net__Group__6"
    // InternalPetrinet.g:314:1: rule__Net__Group__6 : rule__Net__Group__6__Impl rule__Net__Group__7 ;
    public final void rule__Net__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:318:1: ( rule__Net__Group__6__Impl rule__Net__Group__7 )
            // InternalPetrinet.g:319:2: rule__Net__Group__6__Impl rule__Net__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Net__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group__7();

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
    // $ANTLR end "rule__Net__Group__6"


    // $ANTLR start "rule__Net__Group__6__Impl"
    // InternalPetrinet.g:326:1: rule__Net__Group__6__Impl : ( 'first' ) ;
    public final void rule__Net__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:330:1: ( ( 'first' ) )
            // InternalPetrinet.g:331:1: ( 'first' )
            {
            // InternalPetrinet.g:331:1: ( 'first' )
            // InternalPetrinet.g:332:2: 'first'
            {
             before(grammarAccess.getNetAccess().getFirstKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNetAccess().getFirstKeyword_6()); 

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
    // $ANTLR end "rule__Net__Group__6__Impl"


    // $ANTLR start "rule__Net__Group__7"
    // InternalPetrinet.g:341:1: rule__Net__Group__7 : rule__Net__Group__7__Impl rule__Net__Group__8 ;
    public final void rule__Net__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:345:1: ( rule__Net__Group__7__Impl rule__Net__Group__8 )
            // InternalPetrinet.g:346:2: rule__Net__Group__7__Impl rule__Net__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Net__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group__8();

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
    // $ANTLR end "rule__Net__Group__7"


    // $ANTLR start "rule__Net__Group__7__Impl"
    // InternalPetrinet.g:353:1: rule__Net__Group__7__Impl : ( ( rule__Net__FirstAssignment_7 ) ) ;
    public final void rule__Net__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:357:1: ( ( ( rule__Net__FirstAssignment_7 ) ) )
            // InternalPetrinet.g:358:1: ( ( rule__Net__FirstAssignment_7 ) )
            {
            // InternalPetrinet.g:358:1: ( ( rule__Net__FirstAssignment_7 ) )
            // InternalPetrinet.g:359:2: ( rule__Net__FirstAssignment_7 )
            {
             before(grammarAccess.getNetAccess().getFirstAssignment_7()); 
            // InternalPetrinet.g:360:2: ( rule__Net__FirstAssignment_7 )
            // InternalPetrinet.g:360:3: rule__Net__FirstAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Net__FirstAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getNetAccess().getFirstAssignment_7()); 

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
    // $ANTLR end "rule__Net__Group__7__Impl"


    // $ANTLR start "rule__Net__Group__8"
    // InternalPetrinet.g:368:1: rule__Net__Group__8 : rule__Net__Group__8__Impl ;
    public final void rule__Net__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:372:1: ( rule__Net__Group__8__Impl )
            // InternalPetrinet.g:373:2: rule__Net__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Net__Group__8__Impl();

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
    // $ANTLR end "rule__Net__Group__8"


    // $ANTLR start "rule__Net__Group__8__Impl"
    // InternalPetrinet.g:379:1: rule__Net__Group__8__Impl : ( '}' ) ;
    public final void rule__Net__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:383:1: ( ( '}' ) )
            // InternalPetrinet.g:384:1: ( '}' )
            {
            // InternalPetrinet.g:384:1: ( '}' )
            // InternalPetrinet.g:385:2: '}'
            {
             before(grammarAccess.getNetAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNetAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Net__Group__8__Impl"


    // $ANTLR start "rule__Net__Group_3__0"
    // InternalPetrinet.g:395:1: rule__Net__Group_3__0 : rule__Net__Group_3__0__Impl rule__Net__Group_3__1 ;
    public final void rule__Net__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:399:1: ( rule__Net__Group_3__0__Impl rule__Net__Group_3__1 )
            // InternalPetrinet.g:400:2: rule__Net__Group_3__0__Impl rule__Net__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Net__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group_3__1();

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
    // $ANTLR end "rule__Net__Group_3__0"


    // $ANTLR start "rule__Net__Group_3__0__Impl"
    // InternalPetrinet.g:407:1: rule__Net__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__Net__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:411:1: ( ( 'name' ) )
            // InternalPetrinet.g:412:1: ( 'name' )
            {
            // InternalPetrinet.g:412:1: ( 'name' )
            // InternalPetrinet.g:413:2: 'name'
            {
             before(grammarAccess.getNetAccess().getNameKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNetAccess().getNameKeyword_3_0()); 

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
    // $ANTLR end "rule__Net__Group_3__0__Impl"


    // $ANTLR start "rule__Net__Group_3__1"
    // InternalPetrinet.g:422:1: rule__Net__Group_3__1 : rule__Net__Group_3__1__Impl ;
    public final void rule__Net__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:426:1: ( rule__Net__Group_3__1__Impl )
            // InternalPetrinet.g:427:2: rule__Net__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Net__Group_3__1__Impl();

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
    // $ANTLR end "rule__Net__Group_3__1"


    // $ANTLR start "rule__Net__Group_3__1__Impl"
    // InternalPetrinet.g:433:1: rule__Net__Group_3__1__Impl : ( ( rule__Net__NameAssignment_3_1 ) ) ;
    public final void rule__Net__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:437:1: ( ( ( rule__Net__NameAssignment_3_1 ) ) )
            // InternalPetrinet.g:438:1: ( ( rule__Net__NameAssignment_3_1 ) )
            {
            // InternalPetrinet.g:438:1: ( ( rule__Net__NameAssignment_3_1 ) )
            // InternalPetrinet.g:439:2: ( rule__Net__NameAssignment_3_1 )
            {
             before(grammarAccess.getNetAccess().getNameAssignment_3_1()); 
            // InternalPetrinet.g:440:2: ( rule__Net__NameAssignment_3_1 )
            // InternalPetrinet.g:440:3: rule__Net__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Net__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNetAccess().getNameAssignment_3_1()); 

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
    // $ANTLR end "rule__Net__Group_3__1__Impl"


    // $ANTLR start "rule__Net__Group_4__0"
    // InternalPetrinet.g:449:1: rule__Net__Group_4__0 : rule__Net__Group_4__0__Impl rule__Net__Group_4__1 ;
    public final void rule__Net__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:453:1: ( rule__Net__Group_4__0__Impl rule__Net__Group_4__1 )
            // InternalPetrinet.g:454:2: rule__Net__Group_4__0__Impl rule__Net__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Net__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group_4__1();

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
    // $ANTLR end "rule__Net__Group_4__0"


    // $ANTLR start "rule__Net__Group_4__0__Impl"
    // InternalPetrinet.g:461:1: rule__Net__Group_4__0__Impl : ( 'places' ) ;
    public final void rule__Net__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:465:1: ( ( 'places' ) )
            // InternalPetrinet.g:466:1: ( 'places' )
            {
            // InternalPetrinet.g:466:1: ( 'places' )
            // InternalPetrinet.g:467:2: 'places'
            {
             before(grammarAccess.getNetAccess().getPlacesKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNetAccess().getPlacesKeyword_4_0()); 

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
    // $ANTLR end "rule__Net__Group_4__0__Impl"


    // $ANTLR start "rule__Net__Group_4__1"
    // InternalPetrinet.g:476:1: rule__Net__Group_4__1 : rule__Net__Group_4__1__Impl rule__Net__Group_4__2 ;
    public final void rule__Net__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:480:1: ( rule__Net__Group_4__1__Impl rule__Net__Group_4__2 )
            // InternalPetrinet.g:481:2: rule__Net__Group_4__1__Impl rule__Net__Group_4__2
            {
            pushFollow(FOLLOW_8);
            rule__Net__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group_4__2();

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
    // $ANTLR end "rule__Net__Group_4__1"


    // $ANTLR start "rule__Net__Group_4__1__Impl"
    // InternalPetrinet.g:488:1: rule__Net__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Net__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:492:1: ( ( '{' ) )
            // InternalPetrinet.g:493:1: ( '{' )
            {
            // InternalPetrinet.g:493:1: ( '{' )
            // InternalPetrinet.g:494:2: '{'
            {
             before(grammarAccess.getNetAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNetAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Net__Group_4__1__Impl"


    // $ANTLR start "rule__Net__Group_4__2"
    // InternalPetrinet.g:503:1: rule__Net__Group_4__2 : rule__Net__Group_4__2__Impl rule__Net__Group_4__3 ;
    public final void rule__Net__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:507:1: ( rule__Net__Group_4__2__Impl rule__Net__Group_4__3 )
            // InternalPetrinet.g:508:2: rule__Net__Group_4__2__Impl rule__Net__Group_4__3
            {
            pushFollow(FOLLOW_9);
            rule__Net__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group_4__3();

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
    // $ANTLR end "rule__Net__Group_4__2"


    // $ANTLR start "rule__Net__Group_4__2__Impl"
    // InternalPetrinet.g:515:1: rule__Net__Group_4__2__Impl : ( ( rule__Net__PlacesAssignment_4_2 ) ) ;
    public final void rule__Net__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:519:1: ( ( ( rule__Net__PlacesAssignment_4_2 ) ) )
            // InternalPetrinet.g:520:1: ( ( rule__Net__PlacesAssignment_4_2 ) )
            {
            // InternalPetrinet.g:520:1: ( ( rule__Net__PlacesAssignment_4_2 ) )
            // InternalPetrinet.g:521:2: ( rule__Net__PlacesAssignment_4_2 )
            {
             before(grammarAccess.getNetAccess().getPlacesAssignment_4_2()); 
            // InternalPetrinet.g:522:2: ( rule__Net__PlacesAssignment_4_2 )
            // InternalPetrinet.g:522:3: rule__Net__PlacesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Net__PlacesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getNetAccess().getPlacesAssignment_4_2()); 

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
    // $ANTLR end "rule__Net__Group_4__2__Impl"


    // $ANTLR start "rule__Net__Group_4__3"
    // InternalPetrinet.g:530:1: rule__Net__Group_4__3 : rule__Net__Group_4__3__Impl rule__Net__Group_4__4 ;
    public final void rule__Net__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:534:1: ( rule__Net__Group_4__3__Impl rule__Net__Group_4__4 )
            // InternalPetrinet.g:535:2: rule__Net__Group_4__3__Impl rule__Net__Group_4__4
            {
            pushFollow(FOLLOW_9);
            rule__Net__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group_4__4();

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
    // $ANTLR end "rule__Net__Group_4__3"


    // $ANTLR start "rule__Net__Group_4__3__Impl"
    // InternalPetrinet.g:542:1: rule__Net__Group_4__3__Impl : ( ( rule__Net__Group_4_3__0 )* ) ;
    public final void rule__Net__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:546:1: ( ( ( rule__Net__Group_4_3__0 )* ) )
            // InternalPetrinet.g:547:1: ( ( rule__Net__Group_4_3__0 )* )
            {
            // InternalPetrinet.g:547:1: ( ( rule__Net__Group_4_3__0 )* )
            // InternalPetrinet.g:548:2: ( rule__Net__Group_4_3__0 )*
            {
             before(grammarAccess.getNetAccess().getGroup_4_3()); 
            // InternalPetrinet.g:549:2: ( rule__Net__Group_4_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPetrinet.g:549:3: rule__Net__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Net__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getNetAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Net__Group_4__3__Impl"


    // $ANTLR start "rule__Net__Group_4__4"
    // InternalPetrinet.g:557:1: rule__Net__Group_4__4 : rule__Net__Group_4__4__Impl ;
    public final void rule__Net__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:561:1: ( rule__Net__Group_4__4__Impl )
            // InternalPetrinet.g:562:2: rule__Net__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Net__Group_4__4__Impl();

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
    // $ANTLR end "rule__Net__Group_4__4"


    // $ANTLR start "rule__Net__Group_4__4__Impl"
    // InternalPetrinet.g:568:1: rule__Net__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Net__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:572:1: ( ( '}' ) )
            // InternalPetrinet.g:573:1: ( '}' )
            {
            // InternalPetrinet.g:573:1: ( '}' )
            // InternalPetrinet.g:574:2: '}'
            {
             before(grammarAccess.getNetAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNetAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Net__Group_4__4__Impl"


    // $ANTLR start "rule__Net__Group_4_3__0"
    // InternalPetrinet.g:584:1: rule__Net__Group_4_3__0 : rule__Net__Group_4_3__0__Impl rule__Net__Group_4_3__1 ;
    public final void rule__Net__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:588:1: ( rule__Net__Group_4_3__0__Impl rule__Net__Group_4_3__1 )
            // InternalPetrinet.g:589:2: rule__Net__Group_4_3__0__Impl rule__Net__Group_4_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Net__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group_4_3__1();

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
    // $ANTLR end "rule__Net__Group_4_3__0"


    // $ANTLR start "rule__Net__Group_4_3__0__Impl"
    // InternalPetrinet.g:596:1: rule__Net__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Net__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:600:1: ( ( ',' ) )
            // InternalPetrinet.g:601:1: ( ',' )
            {
            // InternalPetrinet.g:601:1: ( ',' )
            // InternalPetrinet.g:602:2: ','
            {
             before(grammarAccess.getNetAccess().getCommaKeyword_4_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNetAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Net__Group_4_3__0__Impl"


    // $ANTLR start "rule__Net__Group_4_3__1"
    // InternalPetrinet.g:611:1: rule__Net__Group_4_3__1 : rule__Net__Group_4_3__1__Impl ;
    public final void rule__Net__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:615:1: ( rule__Net__Group_4_3__1__Impl )
            // InternalPetrinet.g:616:2: rule__Net__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Net__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Net__Group_4_3__1"


    // $ANTLR start "rule__Net__Group_4_3__1__Impl"
    // InternalPetrinet.g:622:1: rule__Net__Group_4_3__1__Impl : ( ( rule__Net__PlacesAssignment_4_3_1 ) ) ;
    public final void rule__Net__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:626:1: ( ( ( rule__Net__PlacesAssignment_4_3_1 ) ) )
            // InternalPetrinet.g:627:1: ( ( rule__Net__PlacesAssignment_4_3_1 ) )
            {
            // InternalPetrinet.g:627:1: ( ( rule__Net__PlacesAssignment_4_3_1 ) )
            // InternalPetrinet.g:628:2: ( rule__Net__PlacesAssignment_4_3_1 )
            {
             before(grammarAccess.getNetAccess().getPlacesAssignment_4_3_1()); 
            // InternalPetrinet.g:629:2: ( rule__Net__PlacesAssignment_4_3_1 )
            // InternalPetrinet.g:629:3: rule__Net__PlacesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Net__PlacesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNetAccess().getPlacesAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Net__Group_4_3__1__Impl"


    // $ANTLR start "rule__Net__Group_5__0"
    // InternalPetrinet.g:638:1: rule__Net__Group_5__0 : rule__Net__Group_5__0__Impl rule__Net__Group_5__1 ;
    public final void rule__Net__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:642:1: ( rule__Net__Group_5__0__Impl rule__Net__Group_5__1 )
            // InternalPetrinet.g:643:2: rule__Net__Group_5__0__Impl rule__Net__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Net__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group_5__1();

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
    // $ANTLR end "rule__Net__Group_5__0"


    // $ANTLR start "rule__Net__Group_5__0__Impl"
    // InternalPetrinet.g:650:1: rule__Net__Group_5__0__Impl : ( 'transitions' ) ;
    public final void rule__Net__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:654:1: ( ( 'transitions' ) )
            // InternalPetrinet.g:655:1: ( 'transitions' )
            {
            // InternalPetrinet.g:655:1: ( 'transitions' )
            // InternalPetrinet.g:656:2: 'transitions'
            {
             before(grammarAccess.getNetAccess().getTransitionsKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNetAccess().getTransitionsKeyword_5_0()); 

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
    // $ANTLR end "rule__Net__Group_5__0__Impl"


    // $ANTLR start "rule__Net__Group_5__1"
    // InternalPetrinet.g:665:1: rule__Net__Group_5__1 : rule__Net__Group_5__1__Impl rule__Net__Group_5__2 ;
    public final void rule__Net__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:669:1: ( rule__Net__Group_5__1__Impl rule__Net__Group_5__2 )
            // InternalPetrinet.g:670:2: rule__Net__Group_5__1__Impl rule__Net__Group_5__2
            {
            pushFollow(FOLLOW_11);
            rule__Net__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group_5__2();

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
    // $ANTLR end "rule__Net__Group_5__1"


    // $ANTLR start "rule__Net__Group_5__1__Impl"
    // InternalPetrinet.g:677:1: rule__Net__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Net__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:681:1: ( ( '{' ) )
            // InternalPetrinet.g:682:1: ( '{' )
            {
            // InternalPetrinet.g:682:1: ( '{' )
            // InternalPetrinet.g:683:2: '{'
            {
             before(grammarAccess.getNetAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNetAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Net__Group_5__1__Impl"


    // $ANTLR start "rule__Net__Group_5__2"
    // InternalPetrinet.g:692:1: rule__Net__Group_5__2 : rule__Net__Group_5__2__Impl rule__Net__Group_5__3 ;
    public final void rule__Net__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:696:1: ( rule__Net__Group_5__2__Impl rule__Net__Group_5__3 )
            // InternalPetrinet.g:697:2: rule__Net__Group_5__2__Impl rule__Net__Group_5__3
            {
            pushFollow(FOLLOW_9);
            rule__Net__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group_5__3();

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
    // $ANTLR end "rule__Net__Group_5__2"


    // $ANTLR start "rule__Net__Group_5__2__Impl"
    // InternalPetrinet.g:704:1: rule__Net__Group_5__2__Impl : ( ( rule__Net__TransitionsAssignment_5_2 ) ) ;
    public final void rule__Net__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:708:1: ( ( ( rule__Net__TransitionsAssignment_5_2 ) ) )
            // InternalPetrinet.g:709:1: ( ( rule__Net__TransitionsAssignment_5_2 ) )
            {
            // InternalPetrinet.g:709:1: ( ( rule__Net__TransitionsAssignment_5_2 ) )
            // InternalPetrinet.g:710:2: ( rule__Net__TransitionsAssignment_5_2 )
            {
             before(grammarAccess.getNetAccess().getTransitionsAssignment_5_2()); 
            // InternalPetrinet.g:711:2: ( rule__Net__TransitionsAssignment_5_2 )
            // InternalPetrinet.g:711:3: rule__Net__TransitionsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Net__TransitionsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getNetAccess().getTransitionsAssignment_5_2()); 

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
    // $ANTLR end "rule__Net__Group_5__2__Impl"


    // $ANTLR start "rule__Net__Group_5__3"
    // InternalPetrinet.g:719:1: rule__Net__Group_5__3 : rule__Net__Group_5__3__Impl rule__Net__Group_5__4 ;
    public final void rule__Net__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:723:1: ( rule__Net__Group_5__3__Impl rule__Net__Group_5__4 )
            // InternalPetrinet.g:724:2: rule__Net__Group_5__3__Impl rule__Net__Group_5__4
            {
            pushFollow(FOLLOW_9);
            rule__Net__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group_5__4();

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
    // $ANTLR end "rule__Net__Group_5__3"


    // $ANTLR start "rule__Net__Group_5__3__Impl"
    // InternalPetrinet.g:731:1: rule__Net__Group_5__3__Impl : ( ( rule__Net__Group_5_3__0 )* ) ;
    public final void rule__Net__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:735:1: ( ( ( rule__Net__Group_5_3__0 )* ) )
            // InternalPetrinet.g:736:1: ( ( rule__Net__Group_5_3__0 )* )
            {
            // InternalPetrinet.g:736:1: ( ( rule__Net__Group_5_3__0 )* )
            // InternalPetrinet.g:737:2: ( rule__Net__Group_5_3__0 )*
            {
             before(grammarAccess.getNetAccess().getGroup_5_3()); 
            // InternalPetrinet.g:738:2: ( rule__Net__Group_5_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPetrinet.g:738:3: rule__Net__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Net__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getNetAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Net__Group_5__3__Impl"


    // $ANTLR start "rule__Net__Group_5__4"
    // InternalPetrinet.g:746:1: rule__Net__Group_5__4 : rule__Net__Group_5__4__Impl ;
    public final void rule__Net__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:750:1: ( rule__Net__Group_5__4__Impl )
            // InternalPetrinet.g:751:2: rule__Net__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Net__Group_5__4__Impl();

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
    // $ANTLR end "rule__Net__Group_5__4"


    // $ANTLR start "rule__Net__Group_5__4__Impl"
    // InternalPetrinet.g:757:1: rule__Net__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Net__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:761:1: ( ( '}' ) )
            // InternalPetrinet.g:762:1: ( '}' )
            {
            // InternalPetrinet.g:762:1: ( '}' )
            // InternalPetrinet.g:763:2: '}'
            {
             before(grammarAccess.getNetAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNetAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__Net__Group_5__4__Impl"


    // $ANTLR start "rule__Net__Group_5_3__0"
    // InternalPetrinet.g:773:1: rule__Net__Group_5_3__0 : rule__Net__Group_5_3__0__Impl rule__Net__Group_5_3__1 ;
    public final void rule__Net__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:777:1: ( rule__Net__Group_5_3__0__Impl rule__Net__Group_5_3__1 )
            // InternalPetrinet.g:778:2: rule__Net__Group_5_3__0__Impl rule__Net__Group_5_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Net__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group_5_3__1();

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
    // $ANTLR end "rule__Net__Group_5_3__0"


    // $ANTLR start "rule__Net__Group_5_3__0__Impl"
    // InternalPetrinet.g:785:1: rule__Net__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Net__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:789:1: ( ( ',' ) )
            // InternalPetrinet.g:790:1: ( ',' )
            {
            // InternalPetrinet.g:790:1: ( ',' )
            // InternalPetrinet.g:791:2: ','
            {
             before(grammarAccess.getNetAccess().getCommaKeyword_5_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNetAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Net__Group_5_3__0__Impl"


    // $ANTLR start "rule__Net__Group_5_3__1"
    // InternalPetrinet.g:800:1: rule__Net__Group_5_3__1 : rule__Net__Group_5_3__1__Impl ;
    public final void rule__Net__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:804:1: ( rule__Net__Group_5_3__1__Impl )
            // InternalPetrinet.g:805:2: rule__Net__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Net__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Net__Group_5_3__1"


    // $ANTLR start "rule__Net__Group_5_3__1__Impl"
    // InternalPetrinet.g:811:1: rule__Net__Group_5_3__1__Impl : ( ( rule__Net__TransitionsAssignment_5_3_1 ) ) ;
    public final void rule__Net__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:815:1: ( ( ( rule__Net__TransitionsAssignment_5_3_1 ) ) )
            // InternalPetrinet.g:816:1: ( ( rule__Net__TransitionsAssignment_5_3_1 ) )
            {
            // InternalPetrinet.g:816:1: ( ( rule__Net__TransitionsAssignment_5_3_1 ) )
            // InternalPetrinet.g:817:2: ( rule__Net__TransitionsAssignment_5_3_1 )
            {
             before(grammarAccess.getNetAccess().getTransitionsAssignment_5_3_1()); 
            // InternalPetrinet.g:818:2: ( rule__Net__TransitionsAssignment_5_3_1 )
            // InternalPetrinet.g:818:3: rule__Net__TransitionsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Net__TransitionsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNetAccess().getTransitionsAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Net__Group_5_3__1__Impl"


    // $ANTLR start "rule__Place__Group__0"
    // InternalPetrinet.g:827:1: rule__Place__Group__0 : rule__Place__Group__0__Impl rule__Place__Group__1 ;
    public final void rule__Place__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:831:1: ( rule__Place__Group__0__Impl rule__Place__Group__1 )
            // InternalPetrinet.g:832:2: rule__Place__Group__0__Impl rule__Place__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Place__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__1();

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
    // $ANTLR end "rule__Place__Group__0"


    // $ANTLR start "rule__Place__Group__0__Impl"
    // InternalPetrinet.g:839:1: rule__Place__Group__0__Impl : ( () ) ;
    public final void rule__Place__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:843:1: ( ( () ) )
            // InternalPetrinet.g:844:1: ( () )
            {
            // InternalPetrinet.g:844:1: ( () )
            // InternalPetrinet.g:845:2: ()
            {
             before(grammarAccess.getPlaceAccess().getPlaceAction_0()); 
            // InternalPetrinet.g:846:2: ()
            // InternalPetrinet.g:846:3: 
            {
            }

             after(grammarAccess.getPlaceAccess().getPlaceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__0__Impl"


    // $ANTLR start "rule__Place__Group__1"
    // InternalPetrinet.g:854:1: rule__Place__Group__1 : rule__Place__Group__1__Impl rule__Place__Group__2 ;
    public final void rule__Place__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:858:1: ( rule__Place__Group__1__Impl rule__Place__Group__2 )
            // InternalPetrinet.g:859:2: rule__Place__Group__1__Impl rule__Place__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Place__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__2();

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
    // $ANTLR end "rule__Place__Group__1"


    // $ANTLR start "rule__Place__Group__1__Impl"
    // InternalPetrinet.g:866:1: rule__Place__Group__1__Impl : ( 'Place' ) ;
    public final void rule__Place__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:870:1: ( ( 'Place' ) )
            // InternalPetrinet.g:871:1: ( 'Place' )
            {
            // InternalPetrinet.g:871:1: ( 'Place' )
            // InternalPetrinet.g:872:2: 'Place'
            {
             before(grammarAccess.getPlaceAccess().getPlaceKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getPlaceKeyword_1()); 

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
    // $ANTLR end "rule__Place__Group__1__Impl"


    // $ANTLR start "rule__Place__Group__2"
    // InternalPetrinet.g:881:1: rule__Place__Group__2 : rule__Place__Group__2__Impl rule__Place__Group__3 ;
    public final void rule__Place__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:885:1: ( rule__Place__Group__2__Impl rule__Place__Group__3 )
            // InternalPetrinet.g:886:2: rule__Place__Group__2__Impl rule__Place__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Place__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__3();

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
    // $ANTLR end "rule__Place__Group__2"


    // $ANTLR start "rule__Place__Group__2__Impl"
    // InternalPetrinet.g:893:1: rule__Place__Group__2__Impl : ( '{' ) ;
    public final void rule__Place__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:897:1: ( ( '{' ) )
            // InternalPetrinet.g:898:1: ( '{' )
            {
            // InternalPetrinet.g:898:1: ( '{' )
            // InternalPetrinet.g:899:2: '{'
            {
             before(grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Place__Group__2__Impl"


    // $ANTLR start "rule__Place__Group__3"
    // InternalPetrinet.g:908:1: rule__Place__Group__3 : rule__Place__Group__3__Impl rule__Place__Group__4 ;
    public final void rule__Place__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:912:1: ( rule__Place__Group__3__Impl rule__Place__Group__4 )
            // InternalPetrinet.g:913:2: rule__Place__Group__3__Impl rule__Place__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Place__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__4();

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
    // $ANTLR end "rule__Place__Group__3"


    // $ANTLR start "rule__Place__Group__3__Impl"
    // InternalPetrinet.g:920:1: rule__Place__Group__3__Impl : ( ( rule__Place__Group_3__0 )? ) ;
    public final void rule__Place__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:924:1: ( ( ( rule__Place__Group_3__0 )? ) )
            // InternalPetrinet.g:925:1: ( ( rule__Place__Group_3__0 )? )
            {
            // InternalPetrinet.g:925:1: ( ( rule__Place__Group_3__0 )? )
            // InternalPetrinet.g:926:2: ( rule__Place__Group_3__0 )?
            {
             before(grammarAccess.getPlaceAccess().getGroup_3()); 
            // InternalPetrinet.g:927:2: ( rule__Place__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPetrinet.g:927:3: rule__Place__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Place__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlaceAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Place__Group__3__Impl"


    // $ANTLR start "rule__Place__Group__4"
    // InternalPetrinet.g:935:1: rule__Place__Group__4 : rule__Place__Group__4__Impl rule__Place__Group__5 ;
    public final void rule__Place__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:939:1: ( rule__Place__Group__4__Impl rule__Place__Group__5 )
            // InternalPetrinet.g:940:2: rule__Place__Group__4__Impl rule__Place__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Place__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__5();

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
    // $ANTLR end "rule__Place__Group__4"


    // $ANTLR start "rule__Place__Group__4__Impl"
    // InternalPetrinet.g:947:1: rule__Place__Group__4__Impl : ( ( rule__Place__Group_4__0 )? ) ;
    public final void rule__Place__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:951:1: ( ( ( rule__Place__Group_4__0 )? ) )
            // InternalPetrinet.g:952:1: ( ( rule__Place__Group_4__0 )? )
            {
            // InternalPetrinet.g:952:1: ( ( rule__Place__Group_4__0 )? )
            // InternalPetrinet.g:953:2: ( rule__Place__Group_4__0 )?
            {
             before(grammarAccess.getPlaceAccess().getGroup_4()); 
            // InternalPetrinet.g:954:2: ( rule__Place__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPetrinet.g:954:3: rule__Place__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Place__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlaceAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Place__Group__4__Impl"


    // $ANTLR start "rule__Place__Group__5"
    // InternalPetrinet.g:962:1: rule__Place__Group__5 : rule__Place__Group__5__Impl rule__Place__Group__6 ;
    public final void rule__Place__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:966:1: ( rule__Place__Group__5__Impl rule__Place__Group__6 )
            // InternalPetrinet.g:967:2: rule__Place__Group__5__Impl rule__Place__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Place__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__6();

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
    // $ANTLR end "rule__Place__Group__5"


    // $ANTLR start "rule__Place__Group__5__Impl"
    // InternalPetrinet.g:974:1: rule__Place__Group__5__Impl : ( ( rule__Place__Group_5__0 )? ) ;
    public final void rule__Place__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:978:1: ( ( ( rule__Place__Group_5__0 )? ) )
            // InternalPetrinet.g:979:1: ( ( rule__Place__Group_5__0 )? )
            {
            // InternalPetrinet.g:979:1: ( ( rule__Place__Group_5__0 )? )
            // InternalPetrinet.g:980:2: ( rule__Place__Group_5__0 )?
            {
             before(grammarAccess.getPlaceAccess().getGroup_5()); 
            // InternalPetrinet.g:981:2: ( rule__Place__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPetrinet.g:981:3: rule__Place__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Place__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlaceAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Place__Group__5__Impl"


    // $ANTLR start "rule__Place__Group__6"
    // InternalPetrinet.g:989:1: rule__Place__Group__6 : rule__Place__Group__6__Impl ;
    public final void rule__Place__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:993:1: ( rule__Place__Group__6__Impl )
            // InternalPetrinet.g:994:2: rule__Place__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group__6__Impl();

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
    // $ANTLR end "rule__Place__Group__6"


    // $ANTLR start "rule__Place__Group__6__Impl"
    // InternalPetrinet.g:1000:1: rule__Place__Group__6__Impl : ( '}' ) ;
    public final void rule__Place__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1004:1: ( ( '}' ) )
            // InternalPetrinet.g:1005:1: ( '}' )
            {
            // InternalPetrinet.g:1005:1: ( '}' )
            // InternalPetrinet.g:1006:2: '}'
            {
             before(grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Place__Group__6__Impl"


    // $ANTLR start "rule__Place__Group_3__0"
    // InternalPetrinet.g:1016:1: rule__Place__Group_3__0 : rule__Place__Group_3__0__Impl rule__Place__Group_3__1 ;
    public final void rule__Place__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1020:1: ( rule__Place__Group_3__0__Impl rule__Place__Group_3__1 )
            // InternalPetrinet.g:1021:2: rule__Place__Group_3__0__Impl rule__Place__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Place__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_3__1();

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
    // $ANTLR end "rule__Place__Group_3__0"


    // $ANTLR start "rule__Place__Group_3__0__Impl"
    // InternalPetrinet.g:1028:1: rule__Place__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__Place__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1032:1: ( ( 'name' ) )
            // InternalPetrinet.g:1033:1: ( 'name' )
            {
            // InternalPetrinet.g:1033:1: ( 'name' )
            // InternalPetrinet.g:1034:2: 'name'
            {
             before(grammarAccess.getPlaceAccess().getNameKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getNameKeyword_3_0()); 

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
    // $ANTLR end "rule__Place__Group_3__0__Impl"


    // $ANTLR start "rule__Place__Group_3__1"
    // InternalPetrinet.g:1043:1: rule__Place__Group_3__1 : rule__Place__Group_3__1__Impl ;
    public final void rule__Place__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1047:1: ( rule__Place__Group_3__1__Impl )
            // InternalPetrinet.g:1048:2: rule__Place__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group_3__1__Impl();

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
    // $ANTLR end "rule__Place__Group_3__1"


    // $ANTLR start "rule__Place__Group_3__1__Impl"
    // InternalPetrinet.g:1054:1: rule__Place__Group_3__1__Impl : ( ( rule__Place__NameAssignment_3_1 ) ) ;
    public final void rule__Place__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1058:1: ( ( ( rule__Place__NameAssignment_3_1 ) ) )
            // InternalPetrinet.g:1059:1: ( ( rule__Place__NameAssignment_3_1 ) )
            {
            // InternalPetrinet.g:1059:1: ( ( rule__Place__NameAssignment_3_1 ) )
            // InternalPetrinet.g:1060:2: ( rule__Place__NameAssignment_3_1 )
            {
             before(grammarAccess.getPlaceAccess().getNameAssignment_3_1()); 
            // InternalPetrinet.g:1061:2: ( rule__Place__NameAssignment_3_1 )
            // InternalPetrinet.g:1061:3: rule__Place__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Place__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getNameAssignment_3_1()); 

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
    // $ANTLR end "rule__Place__Group_3__1__Impl"


    // $ANTLR start "rule__Place__Group_4__0"
    // InternalPetrinet.g:1070:1: rule__Place__Group_4__0 : rule__Place__Group_4__0__Impl rule__Place__Group_4__1 ;
    public final void rule__Place__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1074:1: ( rule__Place__Group_4__0__Impl rule__Place__Group_4__1 )
            // InternalPetrinet.g:1075:2: rule__Place__Group_4__0__Impl rule__Place__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Place__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_4__1();

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
    // $ANTLR end "rule__Place__Group_4__0"


    // $ANTLR start "rule__Place__Group_4__0__Impl"
    // InternalPetrinet.g:1082:1: rule__Place__Group_4__0__Impl : ( 'tokens' ) ;
    public final void rule__Place__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1086:1: ( ( 'tokens' ) )
            // InternalPetrinet.g:1087:1: ( 'tokens' )
            {
            // InternalPetrinet.g:1087:1: ( 'tokens' )
            // InternalPetrinet.g:1088:2: 'tokens'
            {
             before(grammarAccess.getPlaceAccess().getTokensKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getTokensKeyword_4_0()); 

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
    // $ANTLR end "rule__Place__Group_4__0__Impl"


    // $ANTLR start "rule__Place__Group_4__1"
    // InternalPetrinet.g:1097:1: rule__Place__Group_4__1 : rule__Place__Group_4__1__Impl ;
    public final void rule__Place__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1101:1: ( rule__Place__Group_4__1__Impl )
            // InternalPetrinet.g:1102:2: rule__Place__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group_4__1__Impl();

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
    // $ANTLR end "rule__Place__Group_4__1"


    // $ANTLR start "rule__Place__Group_4__1__Impl"
    // InternalPetrinet.g:1108:1: rule__Place__Group_4__1__Impl : ( ( rule__Place__TokensAssignment_4_1 ) ) ;
    public final void rule__Place__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1112:1: ( ( ( rule__Place__TokensAssignment_4_1 ) ) )
            // InternalPetrinet.g:1113:1: ( ( rule__Place__TokensAssignment_4_1 ) )
            {
            // InternalPetrinet.g:1113:1: ( ( rule__Place__TokensAssignment_4_1 ) )
            // InternalPetrinet.g:1114:2: ( rule__Place__TokensAssignment_4_1 )
            {
             before(grammarAccess.getPlaceAccess().getTokensAssignment_4_1()); 
            // InternalPetrinet.g:1115:2: ( rule__Place__TokensAssignment_4_1 )
            // InternalPetrinet.g:1115:3: rule__Place__TokensAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Place__TokensAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getTokensAssignment_4_1()); 

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
    // $ANTLR end "rule__Place__Group_4__1__Impl"


    // $ANTLR start "rule__Place__Group_5__0"
    // InternalPetrinet.g:1124:1: rule__Place__Group_5__0 : rule__Place__Group_5__0__Impl rule__Place__Group_5__1 ;
    public final void rule__Place__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1128:1: ( rule__Place__Group_5__0__Impl rule__Place__Group_5__1 )
            // InternalPetrinet.g:1129:2: rule__Place__Group_5__0__Impl rule__Place__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Place__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_5__1();

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
    // $ANTLR end "rule__Place__Group_5__0"


    // $ANTLR start "rule__Place__Group_5__0__Impl"
    // InternalPetrinet.g:1136:1: rule__Place__Group_5__0__Impl : ( 'to' ) ;
    public final void rule__Place__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1140:1: ( ( 'to' ) )
            // InternalPetrinet.g:1141:1: ( 'to' )
            {
            // InternalPetrinet.g:1141:1: ( 'to' )
            // InternalPetrinet.g:1142:2: 'to'
            {
             before(grammarAccess.getPlaceAccess().getToKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getToKeyword_5_0()); 

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
    // $ANTLR end "rule__Place__Group_5__0__Impl"


    // $ANTLR start "rule__Place__Group_5__1"
    // InternalPetrinet.g:1151:1: rule__Place__Group_5__1 : rule__Place__Group_5__1__Impl ;
    public final void rule__Place__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1155:1: ( rule__Place__Group_5__1__Impl )
            // InternalPetrinet.g:1156:2: rule__Place__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group_5__1__Impl();

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
    // $ANTLR end "rule__Place__Group_5__1"


    // $ANTLR start "rule__Place__Group_5__1__Impl"
    // InternalPetrinet.g:1162:1: rule__Place__Group_5__1__Impl : ( ( rule__Place__ToAssignment_5_1 ) ) ;
    public final void rule__Place__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1166:1: ( ( ( rule__Place__ToAssignment_5_1 ) ) )
            // InternalPetrinet.g:1167:1: ( ( rule__Place__ToAssignment_5_1 ) )
            {
            // InternalPetrinet.g:1167:1: ( ( rule__Place__ToAssignment_5_1 ) )
            // InternalPetrinet.g:1168:2: ( rule__Place__ToAssignment_5_1 )
            {
             before(grammarAccess.getPlaceAccess().getToAssignment_5_1()); 
            // InternalPetrinet.g:1169:2: ( rule__Place__ToAssignment_5_1 )
            // InternalPetrinet.g:1169:3: rule__Place__ToAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Place__ToAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getToAssignment_5_1()); 

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
    // $ANTLR end "rule__Place__Group_5__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalPetrinet.g:1178:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1182:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalPetrinet.g:1183:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

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
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalPetrinet.g:1190:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1194:1: ( ( () ) )
            // InternalPetrinet.g:1195:1: ( () )
            {
            // InternalPetrinet.g:1195:1: ( () )
            // InternalPetrinet.g:1196:2: ()
            {
             before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            // InternalPetrinet.g:1197:2: ()
            // InternalPetrinet.g:1197:3: 
            {
            }

             after(grammarAccess.getTransitionAccess().getTransitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalPetrinet.g:1205:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1209:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalPetrinet.g:1210:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

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
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalPetrinet.g:1217:1: rule__Transition__Group__1__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1221:1: ( ( 'Transition' ) )
            // InternalPetrinet.g:1222:1: ( 'Transition' )
            {
            // InternalPetrinet.g:1222:1: ( 'Transition' )
            // InternalPetrinet.g:1223:2: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_1()); 

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
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalPetrinet.g:1232:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1236:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalPetrinet.g:1237:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

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
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalPetrinet.g:1244:1: rule__Transition__Group__2__Impl : ( '{' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1248:1: ( ( '{' ) )
            // InternalPetrinet.g:1249:1: ( '{' )
            {
            // InternalPetrinet.g:1249:1: ( '{' )
            // InternalPetrinet.g:1250:2: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalPetrinet.g:1259:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1263:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalPetrinet.g:1264:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

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
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalPetrinet.g:1271:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Group_3__0 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1275:1: ( ( ( rule__Transition__Group_3__0 )? ) )
            // InternalPetrinet.g:1276:1: ( ( rule__Transition__Group_3__0 )? )
            {
            // InternalPetrinet.g:1276:1: ( ( rule__Transition__Group_3__0 )? )
            // InternalPetrinet.g:1277:2: ( rule__Transition__Group_3__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3()); 
            // InternalPetrinet.g:1278:2: ( rule__Transition__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPetrinet.g:1278:3: rule__Transition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalPetrinet.g:1286:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1290:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalPetrinet.g:1291:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__5();

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
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalPetrinet.g:1298:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )? ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1302:1: ( ( ( rule__Transition__Group_4__0 )? ) )
            // InternalPetrinet.g:1303:1: ( ( rule__Transition__Group_4__0 )? )
            {
            // InternalPetrinet.g:1303:1: ( ( rule__Transition__Group_4__0 )? )
            // InternalPetrinet.g:1304:2: ( rule__Transition__Group_4__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_4()); 
            // InternalPetrinet.g:1305:2: ( rule__Transition__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPetrinet.g:1305:3: rule__Transition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // InternalPetrinet.g:1313:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1317:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // InternalPetrinet.g:1318:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Transition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__6();

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
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // InternalPetrinet.g:1325:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__Group_5__0 )? ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1329:1: ( ( ( rule__Transition__Group_5__0 )? ) )
            // InternalPetrinet.g:1330:1: ( ( rule__Transition__Group_5__0 )? )
            {
            // InternalPetrinet.g:1330:1: ( ( rule__Transition__Group_5__0 )? )
            // InternalPetrinet.g:1331:2: ( rule__Transition__Group_5__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_5()); 
            // InternalPetrinet.g:1332:2: ( rule__Transition__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPetrinet.g:1332:3: rule__Transition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group__6"
    // InternalPetrinet.g:1340:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1344:1: ( rule__Transition__Group__6__Impl )
            // InternalPetrinet.g:1345:2: rule__Transition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__6__Impl();

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
    // $ANTLR end "rule__Transition__Group__6"


    // $ANTLR start "rule__Transition__Group__6__Impl"
    // InternalPetrinet.g:1351:1: rule__Transition__Group__6__Impl : ( '}' ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1355:1: ( ( '}' ) )
            // InternalPetrinet.g:1356:1: ( '}' )
            {
            // InternalPetrinet.g:1356:1: ( '}' )
            // InternalPetrinet.g:1357:2: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Transition__Group__6__Impl"


    // $ANTLR start "rule__Transition__Group_3__0"
    // InternalPetrinet.g:1367:1: rule__Transition__Group_3__0 : rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 ;
    public final void rule__Transition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1371:1: ( rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 )
            // InternalPetrinet.g:1372:2: rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Transition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_3__1();

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
    // $ANTLR end "rule__Transition__Group_3__0"


    // $ANTLR start "rule__Transition__Group_3__0__Impl"
    // InternalPetrinet.g:1379:1: rule__Transition__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__Transition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1383:1: ( ( 'name' ) )
            // InternalPetrinet.g:1384:1: ( 'name' )
            {
            // InternalPetrinet.g:1384:1: ( 'name' )
            // InternalPetrinet.g:1385:2: 'name'
            {
             before(grammarAccess.getTransitionAccess().getNameKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getNameKeyword_3_0()); 

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
    // $ANTLR end "rule__Transition__Group_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_3__1"
    // InternalPetrinet.g:1394:1: rule__Transition__Group_3__1 : rule__Transition__Group_3__1__Impl ;
    public final void rule__Transition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1398:1: ( rule__Transition__Group_3__1__Impl )
            // InternalPetrinet.g:1399:2: rule__Transition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_3__1__Impl();

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
    // $ANTLR end "rule__Transition__Group_3__1"


    // $ANTLR start "rule__Transition__Group_3__1__Impl"
    // InternalPetrinet.g:1405:1: rule__Transition__Group_3__1__Impl : ( ( rule__Transition__NameAssignment_3_1 ) ) ;
    public final void rule__Transition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1409:1: ( ( ( rule__Transition__NameAssignment_3_1 ) ) )
            // InternalPetrinet.g:1410:1: ( ( rule__Transition__NameAssignment_3_1 ) )
            {
            // InternalPetrinet.g:1410:1: ( ( rule__Transition__NameAssignment_3_1 ) )
            // InternalPetrinet.g:1411:2: ( rule__Transition__NameAssignment_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_3_1()); 
            // InternalPetrinet.g:1412:2: ( rule__Transition__NameAssignment_3_1 )
            // InternalPetrinet.g:1412:3: rule__Transition__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNameAssignment_3_1()); 

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
    // $ANTLR end "rule__Transition__Group_3__1__Impl"


    // $ANTLR start "rule__Transition__Group_4__0"
    // InternalPetrinet.g:1421:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1425:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // InternalPetrinet.g:1426:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Transition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__1();

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
    // $ANTLR end "rule__Transition__Group_4__0"


    // $ANTLR start "rule__Transition__Group_4__0__Impl"
    // InternalPetrinet.g:1433:1: rule__Transition__Group_4__0__Impl : ( 'output' ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1437:1: ( ( 'output' ) )
            // InternalPetrinet.g:1438:1: ( 'output' )
            {
            // InternalPetrinet.g:1438:1: ( 'output' )
            // InternalPetrinet.g:1439:2: 'output'
            {
             before(grammarAccess.getTransitionAccess().getOutputKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getOutputKeyword_4_0()); 

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
    // $ANTLR end "rule__Transition__Group_4__0__Impl"


    // $ANTLR start "rule__Transition__Group_4__1"
    // InternalPetrinet.g:1448:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1452:1: ( rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 )
            // InternalPetrinet.g:1453:2: rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2
            {
            pushFollow(FOLLOW_6);
            rule__Transition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__2();

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
    // $ANTLR end "rule__Transition__Group_4__1"


    // $ANTLR start "rule__Transition__Group_4__1__Impl"
    // InternalPetrinet.g:1460:1: rule__Transition__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1464:1: ( ( '(' ) )
            // InternalPetrinet.g:1465:1: ( '(' )
            {
            // InternalPetrinet.g:1465:1: ( '(' )
            // InternalPetrinet.g:1466:2: '('
            {
             before(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4_1()); 

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
    // $ANTLR end "rule__Transition__Group_4__1__Impl"


    // $ANTLR start "rule__Transition__Group_4__2"
    // InternalPetrinet.g:1475:1: rule__Transition__Group_4__2 : rule__Transition__Group_4__2__Impl rule__Transition__Group_4__3 ;
    public final void rule__Transition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1479:1: ( rule__Transition__Group_4__2__Impl rule__Transition__Group_4__3 )
            // InternalPetrinet.g:1480:2: rule__Transition__Group_4__2__Impl rule__Transition__Group_4__3
            {
            pushFollow(FOLLOW_16);
            rule__Transition__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__3();

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
    // $ANTLR end "rule__Transition__Group_4__2"


    // $ANTLR start "rule__Transition__Group_4__2__Impl"
    // InternalPetrinet.g:1487:1: rule__Transition__Group_4__2__Impl : ( ( rule__Transition__OutputAssignment_4_2 ) ) ;
    public final void rule__Transition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1491:1: ( ( ( rule__Transition__OutputAssignment_4_2 ) ) )
            // InternalPetrinet.g:1492:1: ( ( rule__Transition__OutputAssignment_4_2 ) )
            {
            // InternalPetrinet.g:1492:1: ( ( rule__Transition__OutputAssignment_4_2 ) )
            // InternalPetrinet.g:1493:2: ( rule__Transition__OutputAssignment_4_2 )
            {
             before(grammarAccess.getTransitionAccess().getOutputAssignment_4_2()); 
            // InternalPetrinet.g:1494:2: ( rule__Transition__OutputAssignment_4_2 )
            // InternalPetrinet.g:1494:3: rule__Transition__OutputAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__OutputAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getOutputAssignment_4_2()); 

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
    // $ANTLR end "rule__Transition__Group_4__2__Impl"


    // $ANTLR start "rule__Transition__Group_4__3"
    // InternalPetrinet.g:1502:1: rule__Transition__Group_4__3 : rule__Transition__Group_4__3__Impl rule__Transition__Group_4__4 ;
    public final void rule__Transition__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1506:1: ( rule__Transition__Group_4__3__Impl rule__Transition__Group_4__4 )
            // InternalPetrinet.g:1507:2: rule__Transition__Group_4__3__Impl rule__Transition__Group_4__4
            {
            pushFollow(FOLLOW_16);
            rule__Transition__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__4();

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
    // $ANTLR end "rule__Transition__Group_4__3"


    // $ANTLR start "rule__Transition__Group_4__3__Impl"
    // InternalPetrinet.g:1514:1: rule__Transition__Group_4__3__Impl : ( ( rule__Transition__Group_4_3__0 )* ) ;
    public final void rule__Transition__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1518:1: ( ( ( rule__Transition__Group_4_3__0 )* ) )
            // InternalPetrinet.g:1519:1: ( ( rule__Transition__Group_4_3__0 )* )
            {
            // InternalPetrinet.g:1519:1: ( ( rule__Transition__Group_4_3__0 )* )
            // InternalPetrinet.g:1520:2: ( rule__Transition__Group_4_3__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_4_3()); 
            // InternalPetrinet.g:1521:2: ( rule__Transition__Group_4_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPetrinet.g:1521:3: rule__Transition__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Transition__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Transition__Group_4__3__Impl"


    // $ANTLR start "rule__Transition__Group_4__4"
    // InternalPetrinet.g:1529:1: rule__Transition__Group_4__4 : rule__Transition__Group_4__4__Impl ;
    public final void rule__Transition__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1533:1: ( rule__Transition__Group_4__4__Impl )
            // InternalPetrinet.g:1534:2: rule__Transition__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__4__Impl();

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
    // $ANTLR end "rule__Transition__Group_4__4"


    // $ANTLR start "rule__Transition__Group_4__4__Impl"
    // InternalPetrinet.g:1540:1: rule__Transition__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Transition__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1544:1: ( ( ')' ) )
            // InternalPetrinet.g:1545:1: ( ')' )
            {
            // InternalPetrinet.g:1545:1: ( ')' )
            // InternalPetrinet.g:1546:2: ')'
            {
             before(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_4_4()); 

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
    // $ANTLR end "rule__Transition__Group_4__4__Impl"


    // $ANTLR start "rule__Transition__Group_4_3__0"
    // InternalPetrinet.g:1556:1: rule__Transition__Group_4_3__0 : rule__Transition__Group_4_3__0__Impl rule__Transition__Group_4_3__1 ;
    public final void rule__Transition__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1560:1: ( rule__Transition__Group_4_3__0__Impl rule__Transition__Group_4_3__1 )
            // InternalPetrinet.g:1561:2: rule__Transition__Group_4_3__0__Impl rule__Transition__Group_4_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Transition__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_4_3__1();

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
    // $ANTLR end "rule__Transition__Group_4_3__0"


    // $ANTLR start "rule__Transition__Group_4_3__0__Impl"
    // InternalPetrinet.g:1568:1: rule__Transition__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1572:1: ( ( ',' ) )
            // InternalPetrinet.g:1573:1: ( ',' )
            {
            // InternalPetrinet.g:1573:1: ( ',' )
            // InternalPetrinet.g:1574:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_4_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Transition__Group_4_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_4_3__1"
    // InternalPetrinet.g:1583:1: rule__Transition__Group_4_3__1 : rule__Transition__Group_4_3__1__Impl ;
    public final void rule__Transition__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1587:1: ( rule__Transition__Group_4_3__1__Impl )
            // InternalPetrinet.g:1588:2: rule__Transition__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Transition__Group_4_3__1"


    // $ANTLR start "rule__Transition__Group_4_3__1__Impl"
    // InternalPetrinet.g:1594:1: rule__Transition__Group_4_3__1__Impl : ( ( rule__Transition__OutputAssignment_4_3_1 ) ) ;
    public final void rule__Transition__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1598:1: ( ( ( rule__Transition__OutputAssignment_4_3_1 ) ) )
            // InternalPetrinet.g:1599:1: ( ( rule__Transition__OutputAssignment_4_3_1 ) )
            {
            // InternalPetrinet.g:1599:1: ( ( rule__Transition__OutputAssignment_4_3_1 ) )
            // InternalPetrinet.g:1600:2: ( rule__Transition__OutputAssignment_4_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getOutputAssignment_4_3_1()); 
            // InternalPetrinet.g:1601:2: ( rule__Transition__OutputAssignment_4_3_1 )
            // InternalPetrinet.g:1601:3: rule__Transition__OutputAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__OutputAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getOutputAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Transition__Group_4_3__1__Impl"


    // $ANTLR start "rule__Transition__Group_5__0"
    // InternalPetrinet.g:1610:1: rule__Transition__Group_5__0 : rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 ;
    public final void rule__Transition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1614:1: ( rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 )
            // InternalPetrinet.g:1615:2: rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1
            {
            pushFollow(FOLLOW_15);
            rule__Transition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_5__1();

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
    // $ANTLR end "rule__Transition__Group_5__0"


    // $ANTLR start "rule__Transition__Group_5__0__Impl"
    // InternalPetrinet.g:1622:1: rule__Transition__Group_5__0__Impl : ( 'input' ) ;
    public final void rule__Transition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1626:1: ( ( 'input' ) )
            // InternalPetrinet.g:1627:1: ( 'input' )
            {
            // InternalPetrinet.g:1627:1: ( 'input' )
            // InternalPetrinet.g:1628:2: 'input'
            {
             before(grammarAccess.getTransitionAccess().getInputKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getInputKeyword_5_0()); 

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
    // $ANTLR end "rule__Transition__Group_5__0__Impl"


    // $ANTLR start "rule__Transition__Group_5__1"
    // InternalPetrinet.g:1637:1: rule__Transition__Group_5__1 : rule__Transition__Group_5__1__Impl rule__Transition__Group_5__2 ;
    public final void rule__Transition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1641:1: ( rule__Transition__Group_5__1__Impl rule__Transition__Group_5__2 )
            // InternalPetrinet.g:1642:2: rule__Transition__Group_5__1__Impl rule__Transition__Group_5__2
            {
            pushFollow(FOLLOW_6);
            rule__Transition__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_5__2();

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
    // $ANTLR end "rule__Transition__Group_5__1"


    // $ANTLR start "rule__Transition__Group_5__1__Impl"
    // InternalPetrinet.g:1649:1: rule__Transition__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Transition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1653:1: ( ( '(' ) )
            // InternalPetrinet.g:1654:1: ( '(' )
            {
            // InternalPetrinet.g:1654:1: ( '(' )
            // InternalPetrinet.g:1655:2: '('
            {
             before(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_5_1()); 

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
    // $ANTLR end "rule__Transition__Group_5__1__Impl"


    // $ANTLR start "rule__Transition__Group_5__2"
    // InternalPetrinet.g:1664:1: rule__Transition__Group_5__2 : rule__Transition__Group_5__2__Impl rule__Transition__Group_5__3 ;
    public final void rule__Transition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1668:1: ( rule__Transition__Group_5__2__Impl rule__Transition__Group_5__3 )
            // InternalPetrinet.g:1669:2: rule__Transition__Group_5__2__Impl rule__Transition__Group_5__3
            {
            pushFollow(FOLLOW_16);
            rule__Transition__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_5__3();

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
    // $ANTLR end "rule__Transition__Group_5__2"


    // $ANTLR start "rule__Transition__Group_5__2__Impl"
    // InternalPetrinet.g:1676:1: rule__Transition__Group_5__2__Impl : ( ( rule__Transition__InputAssignment_5_2 ) ) ;
    public final void rule__Transition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1680:1: ( ( ( rule__Transition__InputAssignment_5_2 ) ) )
            // InternalPetrinet.g:1681:1: ( ( rule__Transition__InputAssignment_5_2 ) )
            {
            // InternalPetrinet.g:1681:1: ( ( rule__Transition__InputAssignment_5_2 ) )
            // InternalPetrinet.g:1682:2: ( rule__Transition__InputAssignment_5_2 )
            {
             before(grammarAccess.getTransitionAccess().getInputAssignment_5_2()); 
            // InternalPetrinet.g:1683:2: ( rule__Transition__InputAssignment_5_2 )
            // InternalPetrinet.g:1683:3: rule__Transition__InputAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__InputAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getInputAssignment_5_2()); 

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
    // $ANTLR end "rule__Transition__Group_5__2__Impl"


    // $ANTLR start "rule__Transition__Group_5__3"
    // InternalPetrinet.g:1691:1: rule__Transition__Group_5__3 : rule__Transition__Group_5__3__Impl rule__Transition__Group_5__4 ;
    public final void rule__Transition__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1695:1: ( rule__Transition__Group_5__3__Impl rule__Transition__Group_5__4 )
            // InternalPetrinet.g:1696:2: rule__Transition__Group_5__3__Impl rule__Transition__Group_5__4
            {
            pushFollow(FOLLOW_16);
            rule__Transition__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_5__4();

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
    // $ANTLR end "rule__Transition__Group_5__3"


    // $ANTLR start "rule__Transition__Group_5__3__Impl"
    // InternalPetrinet.g:1703:1: rule__Transition__Group_5__3__Impl : ( ( rule__Transition__Group_5_3__0 )* ) ;
    public final void rule__Transition__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1707:1: ( ( ( rule__Transition__Group_5_3__0 )* ) )
            // InternalPetrinet.g:1708:1: ( ( rule__Transition__Group_5_3__0 )* )
            {
            // InternalPetrinet.g:1708:1: ( ( rule__Transition__Group_5_3__0 )* )
            // InternalPetrinet.g:1709:2: ( rule__Transition__Group_5_3__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_5_3()); 
            // InternalPetrinet.g:1710:2: ( rule__Transition__Group_5_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPetrinet.g:1710:3: rule__Transition__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Transition__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Transition__Group_5__3__Impl"


    // $ANTLR start "rule__Transition__Group_5__4"
    // InternalPetrinet.g:1718:1: rule__Transition__Group_5__4 : rule__Transition__Group_5__4__Impl ;
    public final void rule__Transition__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1722:1: ( rule__Transition__Group_5__4__Impl )
            // InternalPetrinet.g:1723:2: rule__Transition__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_5__4__Impl();

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
    // $ANTLR end "rule__Transition__Group_5__4"


    // $ANTLR start "rule__Transition__Group_5__4__Impl"
    // InternalPetrinet.g:1729:1: rule__Transition__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Transition__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1733:1: ( ( ')' ) )
            // InternalPetrinet.g:1734:1: ( ')' )
            {
            // InternalPetrinet.g:1734:1: ( ')' )
            // InternalPetrinet.g:1735:2: ')'
            {
             before(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_5_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_5_4()); 

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
    // $ANTLR end "rule__Transition__Group_5__4__Impl"


    // $ANTLR start "rule__Transition__Group_5_3__0"
    // InternalPetrinet.g:1745:1: rule__Transition__Group_5_3__0 : rule__Transition__Group_5_3__0__Impl rule__Transition__Group_5_3__1 ;
    public final void rule__Transition__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1749:1: ( rule__Transition__Group_5_3__0__Impl rule__Transition__Group_5_3__1 )
            // InternalPetrinet.g:1750:2: rule__Transition__Group_5_3__0__Impl rule__Transition__Group_5_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Transition__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_5_3__1();

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
    // $ANTLR end "rule__Transition__Group_5_3__0"


    // $ANTLR start "rule__Transition__Group_5_3__0__Impl"
    // InternalPetrinet.g:1757:1: rule__Transition__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1761:1: ( ( ',' ) )
            // InternalPetrinet.g:1762:1: ( ',' )
            {
            // InternalPetrinet.g:1762:1: ( ',' )
            // InternalPetrinet.g:1763:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_5_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Transition__Group_5_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_5_3__1"
    // InternalPetrinet.g:1772:1: rule__Transition__Group_5_3__1 : rule__Transition__Group_5_3__1__Impl ;
    public final void rule__Transition__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1776:1: ( rule__Transition__Group_5_3__1__Impl )
            // InternalPetrinet.g:1777:2: rule__Transition__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Transition__Group_5_3__1"


    // $ANTLR start "rule__Transition__Group_5_3__1__Impl"
    // InternalPetrinet.g:1783:1: rule__Transition__Group_5_3__1__Impl : ( ( rule__Transition__InputAssignment_5_3_1 ) ) ;
    public final void rule__Transition__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1787:1: ( ( ( rule__Transition__InputAssignment_5_3_1 ) ) )
            // InternalPetrinet.g:1788:1: ( ( rule__Transition__InputAssignment_5_3_1 ) )
            {
            // InternalPetrinet.g:1788:1: ( ( rule__Transition__InputAssignment_5_3_1 ) )
            // InternalPetrinet.g:1789:2: ( rule__Transition__InputAssignment_5_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getInputAssignment_5_3_1()); 
            // InternalPetrinet.g:1790:2: ( rule__Transition__InputAssignment_5_3_1 )
            // InternalPetrinet.g:1790:3: rule__Transition__InputAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__InputAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getInputAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Transition__Group_5_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalPetrinet.g:1799:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1803:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalPetrinet.g:1804:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalPetrinet.g:1811:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1815:1: ( ( ( '-' )? ) )
            // InternalPetrinet.g:1816:1: ( ( '-' )? )
            {
            // InternalPetrinet.g:1816:1: ( ( '-' )? )
            // InternalPetrinet.g:1817:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalPetrinet.g:1818:2: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPetrinet.g:1818:3: '-'
                    {
                    match(input,27,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalPetrinet.g:1826:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1830:1: ( rule__EInt__Group__1__Impl )
            // InternalPetrinet.g:1831:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalPetrinet.g:1837:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1841:1: ( ( RULE_INT ) )
            // InternalPetrinet.g:1842:1: ( RULE_INT )
            {
            // InternalPetrinet.g:1842:1: ( RULE_INT )
            // InternalPetrinet.g:1843:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Net__NameAssignment_3_1"
    // InternalPetrinet.g:1853:1: rule__Net__NameAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Net__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1857:1: ( ( RULE_ID ) )
            // InternalPetrinet.g:1858:2: ( RULE_ID )
            {
            // InternalPetrinet.g:1858:2: ( RULE_ID )
            // InternalPetrinet.g:1859:3: RULE_ID
            {
             before(grammarAccess.getNetAccess().getNameIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNetAccess().getNameIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Net__NameAssignment_3_1"


    // $ANTLR start "rule__Net__PlacesAssignment_4_2"
    // InternalPetrinet.g:1868:1: rule__Net__PlacesAssignment_4_2 : ( rulePlace ) ;
    public final void rule__Net__PlacesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1872:1: ( ( rulePlace ) )
            // InternalPetrinet.g:1873:2: ( rulePlace )
            {
            // InternalPetrinet.g:1873:2: ( rulePlace )
            // InternalPetrinet.g:1874:3: rulePlace
            {
             before(grammarAccess.getNetAccess().getPlacesPlaceParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getNetAccess().getPlacesPlaceParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Net__PlacesAssignment_4_2"


    // $ANTLR start "rule__Net__PlacesAssignment_4_3_1"
    // InternalPetrinet.g:1883:1: rule__Net__PlacesAssignment_4_3_1 : ( rulePlace ) ;
    public final void rule__Net__PlacesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1887:1: ( ( rulePlace ) )
            // InternalPetrinet.g:1888:2: ( rulePlace )
            {
            // InternalPetrinet.g:1888:2: ( rulePlace )
            // InternalPetrinet.g:1889:3: rulePlace
            {
             before(grammarAccess.getNetAccess().getPlacesPlaceParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getNetAccess().getPlacesPlaceParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Net__PlacesAssignment_4_3_1"


    // $ANTLR start "rule__Net__TransitionsAssignment_5_2"
    // InternalPetrinet.g:1898:1: rule__Net__TransitionsAssignment_5_2 : ( ruleTransition ) ;
    public final void rule__Net__TransitionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1902:1: ( ( ruleTransition ) )
            // InternalPetrinet.g:1903:2: ( ruleTransition )
            {
            // InternalPetrinet.g:1903:2: ( ruleTransition )
            // InternalPetrinet.g:1904:3: ruleTransition
            {
             before(grammarAccess.getNetAccess().getTransitionsTransitionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getNetAccess().getTransitionsTransitionParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Net__TransitionsAssignment_5_2"


    // $ANTLR start "rule__Net__TransitionsAssignment_5_3_1"
    // InternalPetrinet.g:1913:1: rule__Net__TransitionsAssignment_5_3_1 : ( ruleTransition ) ;
    public final void rule__Net__TransitionsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1917:1: ( ( ruleTransition ) )
            // InternalPetrinet.g:1918:2: ( ruleTransition )
            {
            // InternalPetrinet.g:1918:2: ( ruleTransition )
            // InternalPetrinet.g:1919:3: ruleTransition
            {
             before(grammarAccess.getNetAccess().getTransitionsTransitionParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getNetAccess().getTransitionsTransitionParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Net__TransitionsAssignment_5_3_1"


    // $ANTLR start "rule__Net__FirstAssignment_7"
    // InternalPetrinet.g:1928:1: rule__Net__FirstAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Net__FirstAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1932:1: ( ( ( RULE_ID ) ) )
            // InternalPetrinet.g:1933:2: ( ( RULE_ID ) )
            {
            // InternalPetrinet.g:1933:2: ( ( RULE_ID ) )
            // InternalPetrinet.g:1934:3: ( RULE_ID )
            {
             before(grammarAccess.getNetAccess().getFirstPlaceCrossReference_7_0()); 
            // InternalPetrinet.g:1935:3: ( RULE_ID )
            // InternalPetrinet.g:1936:4: RULE_ID
            {
             before(grammarAccess.getNetAccess().getFirstPlaceIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNetAccess().getFirstPlaceIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getNetAccess().getFirstPlaceCrossReference_7_0()); 

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
    // $ANTLR end "rule__Net__FirstAssignment_7"


    // $ANTLR start "rule__Place__NameAssignment_3_1"
    // InternalPetrinet.g:1947:1: rule__Place__NameAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Place__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1951:1: ( ( RULE_ID ) )
            // InternalPetrinet.g:1952:2: ( RULE_ID )
            {
            // InternalPetrinet.g:1952:2: ( RULE_ID )
            // InternalPetrinet.g:1953:3: RULE_ID
            {
             before(grammarAccess.getPlaceAccess().getNameIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getNameIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Place__NameAssignment_3_1"


    // $ANTLR start "rule__Place__TokensAssignment_4_1"
    // InternalPetrinet.g:1962:1: rule__Place__TokensAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Place__TokensAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1966:1: ( ( ruleEInt ) )
            // InternalPetrinet.g:1967:2: ( ruleEInt )
            {
            // InternalPetrinet.g:1967:2: ( ruleEInt )
            // InternalPetrinet.g:1968:3: ruleEInt
            {
             before(grammarAccess.getPlaceAccess().getTokensEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPlaceAccess().getTokensEIntParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Place__TokensAssignment_4_1"


    // $ANTLR start "rule__Place__ToAssignment_5_1"
    // InternalPetrinet.g:1977:1: rule__Place__ToAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Place__ToAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1981:1: ( ( ( RULE_ID ) ) )
            // InternalPetrinet.g:1982:2: ( ( RULE_ID ) )
            {
            // InternalPetrinet.g:1982:2: ( ( RULE_ID ) )
            // InternalPetrinet.g:1983:3: ( RULE_ID )
            {
             before(grammarAccess.getPlaceAccess().getToTransitionCrossReference_5_1_0()); 
            // InternalPetrinet.g:1984:3: ( RULE_ID )
            // InternalPetrinet.g:1985:4: RULE_ID
            {
             before(grammarAccess.getPlaceAccess().getToTransitionIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getToTransitionIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getPlaceAccess().getToTransitionCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Place__ToAssignment_5_1"


    // $ANTLR start "rule__Transition__NameAssignment_3_1"
    // InternalPetrinet.g:1996:1: rule__Transition__NameAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Transition__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2000:1: ( ( RULE_ID ) )
            // InternalPetrinet.g:2001:2: ( RULE_ID )
            {
            // InternalPetrinet.g:2001:2: ( RULE_ID )
            // InternalPetrinet.g:2002:3: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Transition__NameAssignment_3_1"


    // $ANTLR start "rule__Transition__OutputAssignment_4_2"
    // InternalPetrinet.g:2011:1: rule__Transition__OutputAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__OutputAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2015:1: ( ( ( RULE_ID ) ) )
            // InternalPetrinet.g:2016:2: ( ( RULE_ID ) )
            {
            // InternalPetrinet.g:2016:2: ( ( RULE_ID ) )
            // InternalPetrinet.g:2017:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getOutputPlaceCrossReference_4_2_0()); 
            // InternalPetrinet.g:2018:3: ( RULE_ID )
            // InternalPetrinet.g:2019:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getOutputPlaceIDTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getOutputPlaceIDTerminalRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getOutputPlaceCrossReference_4_2_0()); 

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
    // $ANTLR end "rule__Transition__OutputAssignment_4_2"


    // $ANTLR start "rule__Transition__OutputAssignment_4_3_1"
    // InternalPetrinet.g:2030:1: rule__Transition__OutputAssignment_4_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__OutputAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2034:1: ( ( ( RULE_ID ) ) )
            // InternalPetrinet.g:2035:2: ( ( RULE_ID ) )
            {
            // InternalPetrinet.g:2035:2: ( ( RULE_ID ) )
            // InternalPetrinet.g:2036:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getOutputPlaceCrossReference_4_3_1_0()); 
            // InternalPetrinet.g:2037:3: ( RULE_ID )
            // InternalPetrinet.g:2038:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getOutputPlaceIDTerminalRuleCall_4_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getOutputPlaceIDTerminalRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getOutputPlaceCrossReference_4_3_1_0()); 

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
    // $ANTLR end "rule__Transition__OutputAssignment_4_3_1"


    // $ANTLR start "rule__Transition__InputAssignment_5_2"
    // InternalPetrinet.g:2049:1: rule__Transition__InputAssignment_5_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__InputAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2053:1: ( ( ( RULE_ID ) ) )
            // InternalPetrinet.g:2054:2: ( ( RULE_ID ) )
            {
            // InternalPetrinet.g:2054:2: ( ( RULE_ID ) )
            // InternalPetrinet.g:2055:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getInputPlaceCrossReference_5_2_0()); 
            // InternalPetrinet.g:2056:3: ( RULE_ID )
            // InternalPetrinet.g:2057:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getInputPlaceIDTerminalRuleCall_5_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getInputPlaceIDTerminalRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getInputPlaceCrossReference_5_2_0()); 

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
    // $ANTLR end "rule__Transition__InputAssignment_5_2"


    // $ANTLR start "rule__Transition__InputAssignment_5_3_1"
    // InternalPetrinet.g:2068:1: rule__Transition__InputAssignment_5_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__InputAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2072:1: ( ( ( RULE_ID ) ) )
            // InternalPetrinet.g:2073:2: ( ( RULE_ID ) )
            {
            // InternalPetrinet.g:2073:2: ( ( RULE_ID ) )
            // InternalPetrinet.g:2074:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getInputPlaceCrossReference_5_3_1_0()); 
            // InternalPetrinet.g:2075:3: ( RULE_ID )
            // InternalPetrinet.g:2076:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getInputPlaceIDTerminalRuleCall_5_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getInputPlaceIDTerminalRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getInputPlaceCrossReference_5_3_1_0()); 

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
    // $ANTLR end "rule__Transition__InputAssignment_5_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000005A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000030C000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000480C000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002020000L});

}