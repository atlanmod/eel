package org.naomod.tblf.petrinet.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.naomod.tblf.petrinet.services.PetrinetGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPetrinetParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Net'", "'{'", "'name'", "'places'", "','", "'}'", "'transitions'", "'first'", "'Place'", "'tokens'", "'to'", "'Transition'", "'output'", "'('", "')'", "'input'", "'-'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=5;
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

        public InternalPetrinetParser(TokenStream input, PetrinetGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Net";
       	}

       	@Override
       	protected PetrinetGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNet"
    // InternalPetrinet.g:64:1: entryRuleNet returns [EObject current=null] : iv_ruleNet= ruleNet EOF ;
    public final EObject entryRuleNet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNet = null;


        try {
            // InternalPetrinet.g:64:44: (iv_ruleNet= ruleNet EOF )
            // InternalPetrinet.g:65:2: iv_ruleNet= ruleNet EOF
            {
             newCompositeNode(grammarAccess.getNetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNet=ruleNet();

            state._fsp--;

             current =iv_ruleNet; 
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
    // $ANTLR end "entryRuleNet"


    // $ANTLR start "ruleNet"
    // InternalPetrinet.g:71:1: ruleNet returns [EObject current=null] : ( () otherlv_1= 'Net' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) )? (otherlv_5= 'places' otherlv_6= '{' ( (lv_places_7_0= rulePlace ) ) (otherlv_8= ',' ( (lv_places_9_0= rulePlace ) ) )* otherlv_10= '}' )? (otherlv_11= 'transitions' otherlv_12= '{' ( (lv_transitions_13_0= ruleTransition ) ) (otherlv_14= ',' ( (lv_transitions_15_0= ruleTransition ) ) )* otherlv_16= '}' )? otherlv_17= 'first' ( (otherlv_18= RULE_ID ) ) otherlv_19= '}' ) ;
    public final EObject ruleNet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_places_7_0 = null;

        EObject lv_places_9_0 = null;

        EObject lv_transitions_13_0 = null;

        EObject lv_transitions_15_0 = null;



        	enterRule();

        try {
            // InternalPetrinet.g:77:2: ( ( () otherlv_1= 'Net' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) )? (otherlv_5= 'places' otherlv_6= '{' ( (lv_places_7_0= rulePlace ) ) (otherlv_8= ',' ( (lv_places_9_0= rulePlace ) ) )* otherlv_10= '}' )? (otherlv_11= 'transitions' otherlv_12= '{' ( (lv_transitions_13_0= ruleTransition ) ) (otherlv_14= ',' ( (lv_transitions_15_0= ruleTransition ) ) )* otherlv_16= '}' )? otherlv_17= 'first' ( (otherlv_18= RULE_ID ) ) otherlv_19= '}' ) )
            // InternalPetrinet.g:78:2: ( () otherlv_1= 'Net' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) )? (otherlv_5= 'places' otherlv_6= '{' ( (lv_places_7_0= rulePlace ) ) (otherlv_8= ',' ( (lv_places_9_0= rulePlace ) ) )* otherlv_10= '}' )? (otherlv_11= 'transitions' otherlv_12= '{' ( (lv_transitions_13_0= ruleTransition ) ) (otherlv_14= ',' ( (lv_transitions_15_0= ruleTransition ) ) )* otherlv_16= '}' )? otherlv_17= 'first' ( (otherlv_18= RULE_ID ) ) otherlv_19= '}' )
            {
            // InternalPetrinet.g:78:2: ( () otherlv_1= 'Net' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) )? (otherlv_5= 'places' otherlv_6= '{' ( (lv_places_7_0= rulePlace ) ) (otherlv_8= ',' ( (lv_places_9_0= rulePlace ) ) )* otherlv_10= '}' )? (otherlv_11= 'transitions' otherlv_12= '{' ( (lv_transitions_13_0= ruleTransition ) ) (otherlv_14= ',' ( (lv_transitions_15_0= ruleTransition ) ) )* otherlv_16= '}' )? otherlv_17= 'first' ( (otherlv_18= RULE_ID ) ) otherlv_19= '}' )
            // InternalPetrinet.g:79:3: () otherlv_1= 'Net' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) )? (otherlv_5= 'places' otherlv_6= '{' ( (lv_places_7_0= rulePlace ) ) (otherlv_8= ',' ( (lv_places_9_0= rulePlace ) ) )* otherlv_10= '}' )? (otherlv_11= 'transitions' otherlv_12= '{' ( (lv_transitions_13_0= ruleTransition ) ) (otherlv_14= ',' ( (lv_transitions_15_0= ruleTransition ) ) )* otherlv_16= '}' )? otherlv_17= 'first' ( (otherlv_18= RULE_ID ) ) otherlv_19= '}'
            {
            // InternalPetrinet.g:79:3: ()
            // InternalPetrinet.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetAccess().getNetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNetAccess().getNetKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getNetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPetrinet.g:94:3: (otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPetrinet.g:95:4: otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getNetAccess().getNameKeyword_3_0());
                    			
                    // InternalPetrinet.g:99:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalPetrinet.g:100:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalPetrinet.g:100:5: (lv_name_4_0= RULE_ID )
                    // InternalPetrinet.g:101:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getNetAccess().getNameIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNetRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPetrinet.g:118:3: (otherlv_5= 'places' otherlv_6= '{' ( (lv_places_7_0= rulePlace ) ) (otherlv_8= ',' ( (lv_places_9_0= rulePlace ) ) )* otherlv_10= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPetrinet.g:119:4: otherlv_5= 'places' otherlv_6= '{' ( (lv_places_7_0= rulePlace ) ) (otherlv_8= ',' ( (lv_places_9_0= rulePlace ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getNetAccess().getPlacesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getNetAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalPetrinet.g:127:4: ( (lv_places_7_0= rulePlace ) )
                    // InternalPetrinet.g:128:5: (lv_places_7_0= rulePlace )
                    {
                    // InternalPetrinet.g:128:5: (lv_places_7_0= rulePlace )
                    // InternalPetrinet.g:129:6: lv_places_7_0= rulePlace
                    {

                    						newCompositeNode(grammarAccess.getNetAccess().getPlacesPlaceParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_places_7_0=rulePlace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNetRule());
                    						}
                    						add(
                    							current,
                    							"places",
                    							lv_places_7_0,
                    							"org.naomod.tblf.petrinet.Petrinet.Place");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPetrinet.g:146:4: (otherlv_8= ',' ( (lv_places_9_0= rulePlace ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalPetrinet.g:147:5: otherlv_8= ',' ( (lv_places_9_0= rulePlace ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getNetAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalPetrinet.g:151:5: ( (lv_places_9_0= rulePlace ) )
                    	    // InternalPetrinet.g:152:6: (lv_places_9_0= rulePlace )
                    	    {
                    	    // InternalPetrinet.g:152:6: (lv_places_9_0= rulePlace )
                    	    // InternalPetrinet.g:153:7: lv_places_9_0= rulePlace
                    	    {

                    	    							newCompositeNode(grammarAccess.getNetAccess().getPlacesPlaceParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_places_9_0=rulePlace();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"places",
                    	    								lv_places_9_0,
                    	    								"org.naomod.tblf.petrinet.Petrinet.Place");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getNetAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalPetrinet.g:176:3: (otherlv_11= 'transitions' otherlv_12= '{' ( (lv_transitions_13_0= ruleTransition ) ) (otherlv_14= ',' ( (lv_transitions_15_0= ruleTransition ) ) )* otherlv_16= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPetrinet.g:177:4: otherlv_11= 'transitions' otherlv_12= '{' ( (lv_transitions_13_0= ruleTransition ) ) (otherlv_14= ',' ( (lv_transitions_15_0= ruleTransition ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getNetAccess().getTransitionsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getNetAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalPetrinet.g:185:4: ( (lv_transitions_13_0= ruleTransition ) )
                    // InternalPetrinet.g:186:5: (lv_transitions_13_0= ruleTransition )
                    {
                    // InternalPetrinet.g:186:5: (lv_transitions_13_0= ruleTransition )
                    // InternalPetrinet.g:187:6: lv_transitions_13_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getNetAccess().getTransitionsTransitionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_transitions_13_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNetRule());
                    						}
                    						add(
                    							current,
                    							"transitions",
                    							lv_transitions_13_0,
                    							"org.naomod.tblf.petrinet.Petrinet.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPetrinet.g:204:4: (otherlv_14= ',' ( (lv_transitions_15_0= ruleTransition ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalPetrinet.g:205:5: otherlv_14= ',' ( (lv_transitions_15_0= ruleTransition ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getNetAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalPetrinet.g:209:5: ( (lv_transitions_15_0= ruleTransition ) )
                    	    // InternalPetrinet.g:210:6: (lv_transitions_15_0= ruleTransition )
                    	    {
                    	    // InternalPetrinet.g:210:6: (lv_transitions_15_0= ruleTransition )
                    	    // InternalPetrinet.g:211:7: lv_transitions_15_0= ruleTransition
                    	    {

                    	    							newCompositeNode(grammarAccess.getNetAccess().getTransitionsTransitionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_transitions_15_0=ruleTransition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"transitions",
                    	    								lv_transitions_15_0,
                    	    								"org.naomod.tblf.petrinet.Petrinet.Transition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getNetAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_17, grammarAccess.getNetAccess().getFirstKeyword_6());
            		
            // InternalPetrinet.g:238:3: ( (otherlv_18= RULE_ID ) )
            // InternalPetrinet.g:239:4: (otherlv_18= RULE_ID )
            {
            // InternalPetrinet.g:239:4: (otherlv_18= RULE_ID )
            // InternalPetrinet.g:240:5: otherlv_18= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNetRule());
            					}
            				
            otherlv_18=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_18, grammarAccess.getNetAccess().getFirstPlaceCrossReference_7_0());
            				

            }


            }

            otherlv_19=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getNetAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleNet"


    // $ANTLR start "entryRulePlace"
    // InternalPetrinet.g:259:1: entryRulePlace returns [EObject current=null] : iv_rulePlace= rulePlace EOF ;
    public final EObject entryRulePlace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlace = null;


        try {
            // InternalPetrinet.g:259:46: (iv_rulePlace= rulePlace EOF )
            // InternalPetrinet.g:260:2: iv_rulePlace= rulePlace EOF
            {
             newCompositeNode(grammarAccess.getPlaceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlace=rulePlace();

            state._fsp--;

             current =iv_rulePlace; 
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
    // $ANTLR end "entryRulePlace"


    // $ANTLR start "rulePlace"
    // InternalPetrinet.g:266:1: rulePlace returns [EObject current=null] : ( () otherlv_1= 'Place' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) )? (otherlv_5= 'tokens' ( (lv_tokens_6_0= ruleEInt ) ) )? (otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) ;
    public final EObject rulePlace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_tokens_6_0 = null;



        	enterRule();

        try {
            // InternalPetrinet.g:272:2: ( ( () otherlv_1= 'Place' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) )? (otherlv_5= 'tokens' ( (lv_tokens_6_0= ruleEInt ) ) )? (otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) )
            // InternalPetrinet.g:273:2: ( () otherlv_1= 'Place' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) )? (otherlv_5= 'tokens' ( (lv_tokens_6_0= ruleEInt ) ) )? (otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            {
            // InternalPetrinet.g:273:2: ( () otherlv_1= 'Place' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) )? (otherlv_5= 'tokens' ( (lv_tokens_6_0= ruleEInt ) ) )? (otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            // InternalPetrinet.g:274:3: () otherlv_1= 'Place' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) )? (otherlv_5= 'tokens' ( (lv_tokens_6_0= ruleEInt ) ) )? (otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}'
            {
            // InternalPetrinet.g:274:3: ()
            // InternalPetrinet.g:275:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPlaceAccess().getPlaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPlaceAccess().getPlaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPetrinet.g:289:3: (otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPetrinet.g:290:4: otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getPlaceAccess().getNameKeyword_3_0());
                    			
                    // InternalPetrinet.g:294:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalPetrinet.g:295:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalPetrinet.g:295:5: (lv_name_4_0= RULE_ID )
                    // InternalPetrinet.g:296:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getPlaceAccess().getNameIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlaceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPetrinet.g:313:3: (otherlv_5= 'tokens' ( (lv_tokens_6_0= ruleEInt ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPetrinet.g:314:4: otherlv_5= 'tokens' ( (lv_tokens_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getPlaceAccess().getTokensKeyword_4_0());
                    			
                    // InternalPetrinet.g:318:4: ( (lv_tokens_6_0= ruleEInt ) )
                    // InternalPetrinet.g:319:5: (lv_tokens_6_0= ruleEInt )
                    {
                    // InternalPetrinet.g:319:5: (lv_tokens_6_0= ruleEInt )
                    // InternalPetrinet.g:320:6: lv_tokens_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPlaceAccess().getTokensEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_tokens_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlaceRule());
                    						}
                    						set(
                    							current,
                    							"tokens",
                    							lv_tokens_6_0,
                    							"org.naomod.tblf.petrinet.Petrinet.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPetrinet.g:338:3: (otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPetrinet.g:339:4: otherlv_7= 'to' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getPlaceAccess().getToKeyword_5_0());
                    			
                    // InternalPetrinet.g:343:4: ( (otherlv_8= RULE_ID ) )
                    // InternalPetrinet.g:344:5: (otherlv_8= RULE_ID )
                    {
                    // InternalPetrinet.g:344:5: (otherlv_8= RULE_ID )
                    // InternalPetrinet.g:345:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlaceRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_8, grammarAccess.getPlaceAccess().getToTransitionCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "rulePlace"


    // $ANTLR start "entryRuleTransition"
    // InternalPetrinet.g:365:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalPetrinet.g:365:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalPetrinet.g:366:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalPetrinet.g:372:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'Transition' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) )? (otherlv_5= 'output' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? (otherlv_11= 'input' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= ')' )? otherlv_17= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;


        	enterRule();

        try {
            // InternalPetrinet.g:378:2: ( ( () otherlv_1= 'Transition' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) )? (otherlv_5= 'output' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? (otherlv_11= 'input' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= ')' )? otherlv_17= '}' ) )
            // InternalPetrinet.g:379:2: ( () otherlv_1= 'Transition' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) )? (otherlv_5= 'output' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? (otherlv_11= 'input' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= ')' )? otherlv_17= '}' )
            {
            // InternalPetrinet.g:379:2: ( () otherlv_1= 'Transition' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) )? (otherlv_5= 'output' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? (otherlv_11= 'input' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= ')' )? otherlv_17= '}' )
            // InternalPetrinet.g:380:3: () otherlv_1= 'Transition' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) )? (otherlv_5= 'output' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? (otherlv_11= 'input' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= ')' )? otherlv_17= '}'
            {
            // InternalPetrinet.g:380:3: ()
            // InternalPetrinet.g:381:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTransitionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPetrinet.g:395:3: (otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPetrinet.g:396:4: otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getNameKeyword_3_0());
                    			
                    // InternalPetrinet.g:400:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalPetrinet.g:401:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalPetrinet.g:401:5: (lv_name_4_0= RULE_ID )
                    // InternalPetrinet.g:402:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPetrinet.g:419:3: (otherlv_5= 'output' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPetrinet.g:420:4: otherlv_5= 'output' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getOutputKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalPetrinet.g:428:4: ( (otherlv_7= RULE_ID ) )
                    // InternalPetrinet.g:429:5: (otherlv_7= RULE_ID )
                    {
                    // InternalPetrinet.g:429:5: (otherlv_7= RULE_ID )
                    // InternalPetrinet.g:430:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getOutputPlaceCrossReference_4_2_0());
                    					

                    }


                    }

                    // InternalPetrinet.g:441:4: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalPetrinet.g:442:5: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalPetrinet.g:446:5: ( (otherlv_9= RULE_ID ) )
                    	    // InternalPetrinet.g:447:6: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalPetrinet.g:447:6: (otherlv_9= RULE_ID )
                    	    // InternalPetrinet.g:448:7: otherlv_9= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTransitionRule());
                    	    							}
                    	    						
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_20); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getOutputPlaceCrossReference_4_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalPetrinet.g:465:3: (otherlv_11= 'input' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPetrinet.g:466:4: otherlv_11= 'input' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getInputKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalPetrinet.g:474:4: ( (otherlv_13= RULE_ID ) )
                    // InternalPetrinet.g:475:5: (otherlv_13= RULE_ID )
                    {
                    // InternalPetrinet.g:475:5: (otherlv_13= RULE_ID )
                    // InternalPetrinet.g:476:6: otherlv_13= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(otherlv_13, grammarAccess.getTransitionAccess().getInputPlaceCrossReference_5_2_0());
                    					

                    }


                    }

                    // InternalPetrinet.g:487:4: (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalPetrinet.g:488:5: otherlv_14= ',' ( (otherlv_15= RULE_ID ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getTransitionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalPetrinet.g:492:5: ( (otherlv_15= RULE_ID ) )
                    	    // InternalPetrinet.g:493:6: (otherlv_15= RULE_ID )
                    	    {
                    	    // InternalPetrinet.g:493:6: (otherlv_15= RULE_ID )
                    	    // InternalPetrinet.g:494:7: otherlv_15= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTransitionRule());
                    	    							}
                    	    						
                    	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_20); 

                    	    							newLeafNode(otherlv_15, grammarAccess.getTransitionAccess().getInputPlaceCrossReference_5_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_16, grammarAccess.getTransitionAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEInt"
    // InternalPetrinet.g:519:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalPetrinet.g:519:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalPetrinet.g:520:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalPetrinet.g:526:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalPetrinet.g:532:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalPetrinet.g:533:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalPetrinet.g:533:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalPetrinet.g:534:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalPetrinet.g:534:3: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPetrinet.g:535:4: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000066000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000064000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000312000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000310000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004812000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004810000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});

}