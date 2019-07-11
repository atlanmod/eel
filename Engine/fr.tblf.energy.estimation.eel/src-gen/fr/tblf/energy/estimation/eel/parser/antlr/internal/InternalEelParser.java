package fr.tblf.energy.estimation.eel.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.tblf.energy.estimation.eel.services.EelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Platform'", "'{'", "'targets'", "','", "'}'", "'estimations'", "'target'", "'variables'", "'('", "')'", "'formula'", "'='", "'-'", "'.'", "'E'", "'e'", "'class'", "'op'", "'GLOBAL'", "'LOCAL'"
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

        public InternalEelParser(TokenStream input, EelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Platform";
       	}

       	@Override
       	protected EelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePlatform"
    // InternalEel.g:65:1: entryRulePlatform returns [EObject current=null] : iv_rulePlatform= rulePlatform EOF ;
    public final EObject entryRulePlatform() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatform = null;


        try {
            // InternalEel.g:65:49: (iv_rulePlatform= rulePlatform EOF )
            // InternalEel.g:66:2: iv_rulePlatform= rulePlatform EOF
            {
             newCompositeNode(grammarAccess.getPlatformRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatform=rulePlatform();

            state._fsp--;

             current =iv_rulePlatform; 
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
    // $ANTLR end "entryRulePlatform"


    // $ANTLR start "rulePlatform"
    // InternalEel.g:72:1: rulePlatform returns [EObject current=null] : ( () otherlv_1= 'Platform' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targets' otherlv_5= '{' ( (lv_targets_6_0= ruleMetaClass ) ) (otherlv_7= ',' ( (lv_targets_8_0= ruleMetaClass ) ) )* otherlv_9= '}' )? (otherlv_10= 'estimations' otherlv_11= '{' ( (lv_estimations_12_0= ruleEstimation ) ) (otherlv_13= ',' ( (lv_estimations_14_0= ruleEstimation ) ) )* otherlv_15= '}' )? ( ( (lv_variables_16_0= ruleVariable ) ) (otherlv_17= ',' ( (lv_variables_18_0= ruleVariable ) ) )* )? otherlv_19= '}' ) ;
    public final EObject rulePlatform() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_targets_6_0 = null;

        EObject lv_targets_8_0 = null;

        EObject lv_estimations_12_0 = null;

        EObject lv_estimations_14_0 = null;

        EObject lv_variables_16_0 = null;

        EObject lv_variables_18_0 = null;



        	enterRule();

        try {
            // InternalEel.g:78:2: ( ( () otherlv_1= 'Platform' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targets' otherlv_5= '{' ( (lv_targets_6_0= ruleMetaClass ) ) (otherlv_7= ',' ( (lv_targets_8_0= ruleMetaClass ) ) )* otherlv_9= '}' )? (otherlv_10= 'estimations' otherlv_11= '{' ( (lv_estimations_12_0= ruleEstimation ) ) (otherlv_13= ',' ( (lv_estimations_14_0= ruleEstimation ) ) )* otherlv_15= '}' )? ( ( (lv_variables_16_0= ruleVariable ) ) (otherlv_17= ',' ( (lv_variables_18_0= ruleVariable ) ) )* )? otherlv_19= '}' ) )
            // InternalEel.g:79:2: ( () otherlv_1= 'Platform' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targets' otherlv_5= '{' ( (lv_targets_6_0= ruleMetaClass ) ) (otherlv_7= ',' ( (lv_targets_8_0= ruleMetaClass ) ) )* otherlv_9= '}' )? (otherlv_10= 'estimations' otherlv_11= '{' ( (lv_estimations_12_0= ruleEstimation ) ) (otherlv_13= ',' ( (lv_estimations_14_0= ruleEstimation ) ) )* otherlv_15= '}' )? ( ( (lv_variables_16_0= ruleVariable ) ) (otherlv_17= ',' ( (lv_variables_18_0= ruleVariable ) ) )* )? otherlv_19= '}' )
            {
            // InternalEel.g:79:2: ( () otherlv_1= 'Platform' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targets' otherlv_5= '{' ( (lv_targets_6_0= ruleMetaClass ) ) (otherlv_7= ',' ( (lv_targets_8_0= ruleMetaClass ) ) )* otherlv_9= '}' )? (otherlv_10= 'estimations' otherlv_11= '{' ( (lv_estimations_12_0= ruleEstimation ) ) (otherlv_13= ',' ( (lv_estimations_14_0= ruleEstimation ) ) )* otherlv_15= '}' )? ( ( (lv_variables_16_0= ruleVariable ) ) (otherlv_17= ',' ( (lv_variables_18_0= ruleVariable ) ) )* )? otherlv_19= '}' )
            // InternalEel.g:80:3: () otherlv_1= 'Platform' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targets' otherlv_5= '{' ( (lv_targets_6_0= ruleMetaClass ) ) (otherlv_7= ',' ( (lv_targets_8_0= ruleMetaClass ) ) )* otherlv_9= '}' )? (otherlv_10= 'estimations' otherlv_11= '{' ( (lv_estimations_12_0= ruleEstimation ) ) (otherlv_13= ',' ( (lv_estimations_14_0= ruleEstimation ) ) )* otherlv_15= '}' )? ( ( (lv_variables_16_0= ruleVariable ) ) (otherlv_17= ',' ( (lv_variables_18_0= ruleVariable ) ) )* )? otherlv_19= '}'
            {
            // InternalEel.g:80:3: ()
            // InternalEel.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPlatformAccess().getPlatformAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPlatformAccess().getPlatformKeyword_1());
            		
            // InternalEel.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:92:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPlatformAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlatformRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.tblf.energy.estimation.eel.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:114:3: (otherlv_4= 'targets' otherlv_5= '{' ( (lv_targets_6_0= ruleMetaClass ) ) (otherlv_7= ',' ( (lv_targets_8_0= ruleMetaClass ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEel.g:115:4: otherlv_4= 'targets' otherlv_5= '{' ( (lv_targets_6_0= ruleMetaClass ) ) (otherlv_7= ',' ( (lv_targets_8_0= ruleMetaClass ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getPlatformAccess().getTargetsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalEel.g:123:4: ( (lv_targets_6_0= ruleMetaClass ) )
                    // InternalEel.g:124:5: (lv_targets_6_0= ruleMetaClass )
                    {
                    // InternalEel.g:124:5: (lv_targets_6_0= ruleMetaClass )
                    // InternalEel.g:125:6: lv_targets_6_0= ruleMetaClass
                    {

                    						newCompositeNode(grammarAccess.getPlatformAccess().getTargetsMetaClassParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_targets_6_0=ruleMetaClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlatformRule());
                    						}
                    						add(
                    							current,
                    							"targets",
                    							lv_targets_6_0,
                    							"fr.tblf.energy.estimation.eel.Eel.MetaClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:142:4: (otherlv_7= ',' ( (lv_targets_8_0= ruleMetaClass ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalEel.g:143:5: otherlv_7= ',' ( (lv_targets_8_0= ruleMetaClass ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPlatformAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalEel.g:147:5: ( (lv_targets_8_0= ruleMetaClass ) )
                    	    // InternalEel.g:148:6: (lv_targets_8_0= ruleMetaClass )
                    	    {
                    	    // InternalEel.g:148:6: (lv_targets_8_0= ruleMetaClass )
                    	    // InternalEel.g:149:7: lv_targets_8_0= ruleMetaClass
                    	    {

                    	    							newCompositeNode(grammarAccess.getPlatformAccess().getTargetsMetaClassParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_targets_8_0=ruleMetaClass();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPlatformRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"targets",
                    	    								lv_targets_8_0,
                    	    								"fr.tblf.energy.estimation.eel.Eel.MetaClass");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:172:3: (otherlv_10= 'estimations' otherlv_11= '{' ( (lv_estimations_12_0= ruleEstimation ) ) (otherlv_13= ',' ( (lv_estimations_14_0= ruleEstimation ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEel.g:173:4: otherlv_10= 'estimations' otherlv_11= '{' ( (lv_estimations_12_0= ruleEstimation ) ) (otherlv_13= ',' ( (lv_estimations_14_0= ruleEstimation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getPlatformAccess().getEstimationsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalEel.g:181:4: ( (lv_estimations_12_0= ruleEstimation ) )
                    // InternalEel.g:182:5: (lv_estimations_12_0= ruleEstimation )
                    {
                    // InternalEel.g:182:5: (lv_estimations_12_0= ruleEstimation )
                    // InternalEel.g:183:6: lv_estimations_12_0= ruleEstimation
                    {

                    						newCompositeNode(grammarAccess.getPlatformAccess().getEstimationsEstimationParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_estimations_12_0=ruleEstimation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlatformRule());
                    						}
                    						add(
                    							current,
                    							"estimations",
                    							lv_estimations_12_0,
                    							"fr.tblf.energy.estimation.eel.Eel.Estimation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:200:4: (otherlv_13= ',' ( (lv_estimations_14_0= ruleEstimation ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalEel.g:201:5: otherlv_13= ',' ( (lv_estimations_14_0= ruleEstimation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getPlatformAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalEel.g:205:5: ( (lv_estimations_14_0= ruleEstimation ) )
                    	    // InternalEel.g:206:6: (lv_estimations_14_0= ruleEstimation )
                    	    {
                    	    // InternalEel.g:206:6: (lv_estimations_14_0= ruleEstimation )
                    	    // InternalEel.g:207:7: lv_estimations_14_0= ruleEstimation
                    	    {

                    	    							newCompositeNode(grammarAccess.getPlatformAccess().getEstimationsEstimationParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_estimations_14_0=ruleEstimation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPlatformRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"estimations",
                    	    								lv_estimations_14_0,
                    	    								"fr.tblf.energy.estimation.eel.Eel.Estimation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:230:3: ( ( (lv_variables_16_0= ruleVariable ) ) (otherlv_17= ',' ( (lv_variables_18_0= ruleVariable ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=29 && LA6_0<=30)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEel.g:231:4: ( (lv_variables_16_0= ruleVariable ) ) (otherlv_17= ',' ( (lv_variables_18_0= ruleVariable ) ) )*
                    {
                    // InternalEel.g:231:4: ( (lv_variables_16_0= ruleVariable ) )
                    // InternalEel.g:232:5: (lv_variables_16_0= ruleVariable )
                    {
                    // InternalEel.g:232:5: (lv_variables_16_0= ruleVariable )
                    // InternalEel.g:233:6: lv_variables_16_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getPlatformAccess().getVariablesVariableParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_variables_16_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlatformRule());
                    						}
                    						add(
                    							current,
                    							"variables",
                    							lv_variables_16_0,
                    							"fr.tblf.energy.estimation.eel.Eel.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:250:4: (otherlv_17= ',' ( (lv_variables_18_0= ruleVariable ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalEel.g:251:5: otherlv_17= ',' ( (lv_variables_18_0= ruleVariable ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getPlatformAccess().getCommaKeyword_6_1_0());
                    	    				
                    	    // InternalEel.g:255:5: ( (lv_variables_18_0= ruleVariable ) )
                    	    // InternalEel.g:256:6: (lv_variables_18_0= ruleVariable )
                    	    {
                    	    // InternalEel.g:256:6: (lv_variables_18_0= ruleVariable )
                    	    // InternalEel.g:257:7: lv_variables_18_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getPlatformAccess().getVariablesVariableParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_variables_18_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPlatformRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variables",
                    	    								lv_variables_18_0,
                    	    								"fr.tblf.energy.estimation.eel.Eel.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_19=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "rulePlatform"


    // $ANTLR start "entryRuleEString"
    // InternalEel.g:284:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalEel.g:284:47: (iv_ruleEString= ruleEString EOF )
            // InternalEel.g:285:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalEel.g:291:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalEel.g:297:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalEel.g:298:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalEel.g:298:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalEel.g:299:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEel.g:307:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEstimation"
    // InternalEel.g:318:1: entryRuleEstimation returns [EObject current=null] : iv_ruleEstimation= ruleEstimation EOF ;
    public final EObject entryRuleEstimation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEstimation = null;


        try {
            // InternalEel.g:318:51: (iv_ruleEstimation= ruleEstimation EOF )
            // InternalEel.g:319:2: iv_ruleEstimation= ruleEstimation EOF
            {
             newCompositeNode(grammarAccess.getEstimationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEstimation=ruleEstimation();

            state._fsp--;

             current =iv_ruleEstimation; 
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
    // $ANTLR end "entryRuleEstimation"


    // $ANTLR start "ruleEstimation"
    // InternalEel.g:325:1: ruleEstimation returns [EObject current=null] : (otherlv_0= 'target' ( ( ruleEString ) ) (otherlv_2= 'variables' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'formula' ( (lv_formula_9_0= ruleEString ) ) ) ;
    public final EObject ruleEstimation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_formula_9_0 = null;



        	enterRule();

        try {
            // InternalEel.g:331:2: ( (otherlv_0= 'target' ( ( ruleEString ) ) (otherlv_2= 'variables' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'formula' ( (lv_formula_9_0= ruleEString ) ) ) )
            // InternalEel.g:332:2: (otherlv_0= 'target' ( ( ruleEString ) ) (otherlv_2= 'variables' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'formula' ( (lv_formula_9_0= ruleEString ) ) )
            {
            // InternalEel.g:332:2: (otherlv_0= 'target' ( ( ruleEString ) ) (otherlv_2= 'variables' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'formula' ( (lv_formula_9_0= ruleEString ) ) )
            // InternalEel.g:333:3: otherlv_0= 'target' ( ( ruleEString ) ) (otherlv_2= 'variables' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'formula' ( (lv_formula_9_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEstimationAccess().getTargetKeyword_0());
            		
            // InternalEel.g:337:3: ( ( ruleEString ) )
            // InternalEel.g:338:4: ( ruleEString )
            {
            // InternalEel.g:338:4: ( ruleEString )
            // InternalEel.g:339:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEstimationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEstimationAccess().getTargetTargetCrossReference_1_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:353:3: (otherlv_2= 'variables' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEel.g:354:4: otherlv_2= 'variables' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getEstimationAccess().getVariablesKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEstimationAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalEel.g:362:4: ( ( ruleEString ) )
                    // InternalEel.g:363:5: ( ruleEString )
                    {
                    // InternalEel.g:363:5: ( ruleEString )
                    // InternalEel.g:364:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEstimationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEstimationAccess().getVariablesVariableCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:378:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalEel.g:379:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEstimationAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalEel.g:383:5: ( ( ruleEString ) )
                    	    // InternalEel.g:384:6: ( ruleEString )
                    	    {
                    	    // InternalEel.g:384:6: ( ruleEString )
                    	    // InternalEel.g:385:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEstimationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEstimationAccess().getVariablesVariableCrossReference_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getEstimationAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getEstimationAccess().getFormulaKeyword_3());
            		
            // InternalEel.g:409:3: ( (lv_formula_9_0= ruleEString ) )
            // InternalEel.g:410:4: (lv_formula_9_0= ruleEString )
            {
            // InternalEel.g:410:4: (lv_formula_9_0= ruleEString )
            // InternalEel.g:411:5: lv_formula_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEstimationAccess().getFormulaEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_formula_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEstimationRule());
            					}
            					set(
            						current,
            						"formula",
            						lv_formula_9_0,
            						"fr.tblf.energy.estimation.eel.Eel.EString");
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
    // $ANTLR end "ruleEstimation"


    // $ANTLR start "entryRuleVariable"
    // InternalEel.g:432:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalEel.g:432:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalEel.g:433:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalEel.g:439:1: ruleVariable returns [EObject current=null] : ( ( (lv_vibility_0_0= ruleVisibility ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEDouble ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_vibility_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalEel.g:445:2: ( ( ( (lv_vibility_0_0= ruleVisibility ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEDouble ) ) ) )
            // InternalEel.g:446:2: ( ( (lv_vibility_0_0= ruleVisibility ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEDouble ) ) )
            {
            // InternalEel.g:446:2: ( ( (lv_vibility_0_0= ruleVisibility ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEDouble ) ) )
            // InternalEel.g:447:3: ( (lv_vibility_0_0= ruleVisibility ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEDouble ) )
            {
            // InternalEel.g:447:3: ( (lv_vibility_0_0= ruleVisibility ) )
            // InternalEel.g:448:4: (lv_vibility_0_0= ruleVisibility )
            {
            // InternalEel.g:448:4: (lv_vibility_0_0= ruleVisibility )
            // InternalEel.g:449:5: lv_vibility_0_0= ruleVisibility
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getVibilityVisibilityEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_vibility_0_0=ruleVisibility();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"vibility",
            						lv_vibility_0_0,
            						"fr.tblf.energy.estimation.eel.Eel.Visibility");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:466:3: ( (lv_name_1_0= ruleEString ) )
            // InternalEel.g:467:4: (lv_name_1_0= ruleEString )
            {
            // InternalEel.g:467:4: (lv_name_1_0= ruleEString )
            // InternalEel.g:468:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.tblf.energy.estimation.eel.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getEqualsSignKeyword_2());
            		
            // InternalEel.g:489:3: ( (lv_value_3_0= ruleEDouble ) )
            // InternalEel.g:490:4: (lv_value_3_0= ruleEDouble )
            {
            // InternalEel.g:490:4: (lv_value_3_0= ruleEDouble )
            // InternalEel.g:491:5: lv_value_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getValueEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"fr.tblf.energy.estimation.eel.Eel.EDouble");
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleEDouble"
    // InternalEel.g:512:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalEel.g:512:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalEel.g:513:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalEel.g:519:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalEel.g:525:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalEel.g:526:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalEel.g:526:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalEel.g:527:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalEel.g:527:3: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEel.g:528:4: kw= '-'
                    {
                    kw=(Token)match(input,23,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalEel.g:534:3: (this_INT_1= RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEel.g:535:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_19); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,24,FOLLOW_20); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_21); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalEel.g:555:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=25 && LA14_0<=26)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEel.g:556:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalEel.g:556:4: (kw= 'E' | kw= 'e' )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==25) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==26) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalEel.g:557:5: kw= 'E'
                            {
                            kw=(Token)match(input,25,FOLLOW_22); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalEel.g:563:5: kw= 'e'
                            {
                            kw=(Token)match(input,26,FOLLOW_22); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalEel.g:569:4: (kw= '-' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==23) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalEel.g:570:5: kw= '-'
                            {
                            kw=(Token)match(input,23,FOLLOW_20); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleMetaClass"
    // InternalEel.g:588:1: entryRuleMetaClass returns [EObject current=null] : iv_ruleMetaClass= ruleMetaClass EOF ;
    public final EObject entryRuleMetaClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaClass = null;


        try {
            // InternalEel.g:588:50: (iv_ruleMetaClass= ruleMetaClass EOF )
            // InternalEel.g:589:2: iv_ruleMetaClass= ruleMetaClass EOF
            {
             newCompositeNode(grammarAccess.getMetaClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetaClass=ruleMetaClass();

            state._fsp--;

             current =iv_ruleMetaClass; 
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
    // $ANTLR end "entryRuleMetaClass"


    // $ANTLR start "ruleMetaClass"
    // InternalEel.g:595:1: ruleMetaClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( ( (lv_operations_3_0= ruleOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleOperation ) ) )? )? otherlv_6= ')' )? ) ;
    public final EObject ruleMetaClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_operations_3_0 = null;

        EObject lv_operations_5_0 = null;



        	enterRule();

        try {
            // InternalEel.g:601:2: ( (otherlv_0= 'class' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( ( (lv_operations_3_0= ruleOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleOperation ) ) )? )? otherlv_6= ')' )? ) )
            // InternalEel.g:602:2: (otherlv_0= 'class' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( ( (lv_operations_3_0= ruleOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleOperation ) ) )? )? otherlv_6= ')' )? )
            {
            // InternalEel.g:602:2: (otherlv_0= 'class' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( ( (lv_operations_3_0= ruleOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleOperation ) ) )? )? otherlv_6= ')' )? )
            // InternalEel.g:603:3: otherlv_0= 'class' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( ( (lv_operations_3_0= ruleOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleOperation ) ) )? )? otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMetaClassAccess().getClassKeyword_0());
            		
            // InternalEel.g:607:3: ( (lv_name_1_0= ruleEString ) )
            // InternalEel.g:608:4: (lv_name_1_0= ruleEString )
            {
            // InternalEel.g:608:4: (lv_name_1_0= ruleEString )
            // InternalEel.g:609:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMetaClassAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetaClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.tblf.energy.estimation.eel.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:626:3: (otherlv_2= '(' ( ( (lv_operations_3_0= ruleOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleOperation ) ) )? )? otherlv_6= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEel.g:627:4: otherlv_2= '(' ( ( (lv_operations_3_0= ruleOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleOperation ) ) )? )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getMetaClassAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalEel.g:631:4: ( ( (lv_operations_3_0= ruleOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleOperation ) ) )? )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||LA16_0==28) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalEel.g:632:5: ( (lv_operations_3_0= ruleOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleOperation ) ) )?
                            {
                            // InternalEel.g:632:5: ( (lv_operations_3_0= ruleOperation ) )
                            // InternalEel.g:633:6: (lv_operations_3_0= ruleOperation )
                            {
                            // InternalEel.g:633:6: (lv_operations_3_0= ruleOperation )
                            // InternalEel.g:634:7: lv_operations_3_0= ruleOperation
                            {

                            							newCompositeNode(grammarAccess.getMetaClassAccess().getOperationsOperationParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_14);
                            lv_operations_3_0=ruleOperation();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMetaClassRule());
                            							}
                            							add(
                            								current,
                            								"operations",
                            								lv_operations_3_0,
                            								"fr.tblf.energy.estimation.eel.Eel.Operation");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalEel.g:651:5: (otherlv_4= ',' ( (lv_operations_5_0= ruleOperation ) ) )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0==14) ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // InternalEel.g:652:6: otherlv_4= ',' ( (lv_operations_5_0= ruleOperation ) )
                                    {
                                    otherlv_4=(Token)match(input,14,FOLLOW_25); 

                                    						newLeafNode(otherlv_4, grammarAccess.getMetaClassAccess().getCommaKeyword_2_1_1_0());
                                    					
                                    // InternalEel.g:656:6: ( (lv_operations_5_0= ruleOperation ) )
                                    // InternalEel.g:657:7: (lv_operations_5_0= ruleOperation )
                                    {
                                    // InternalEel.g:657:7: (lv_operations_5_0= ruleOperation )
                                    // InternalEel.g:658:8: lv_operations_5_0= ruleOperation
                                    {

                                    								newCompositeNode(grammarAccess.getMetaClassAccess().getOperationsOperationParserRuleCall_2_1_1_1_0());
                                    							
                                    pushFollow(FOLLOW_26);
                                    lv_operations_5_0=ruleOperation();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getMetaClassRule());
                                    								}
                                    								add(
                                    									current,
                                    									"operations",
                                    									lv_operations_5_0,
                                    									"fr.tblf.energy.estimation.eel.Eel.Operation");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getMetaClassAccess().getRightParenthesisKeyword_2_2());
                    			

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
    // $ANTLR end "ruleMetaClass"


    // $ANTLR start "entryRuleOperation"
    // InternalEel.g:686:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalEel.g:686:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalEel.g:687:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalEel.g:693:1: ruleOperation returns [EObject current=null] : ( (otherlv_0= 'op' )? ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalEel.g:699:2: ( ( (otherlv_0= 'op' )? ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalEel.g:700:2: ( (otherlv_0= 'op' )? ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalEel.g:700:2: ( (otherlv_0= 'op' )? ( (lv_name_1_0= ruleEString ) ) )
            // InternalEel.g:701:3: (otherlv_0= 'op' )? ( (lv_name_1_0= ruleEString ) )
            {
            // InternalEel.g:701:3: (otherlv_0= 'op' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEel.g:702:4: otherlv_0= 'op'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getOpKeyword_0());
                    			

                    }
                    break;

            }

            // InternalEel.g:707:3: ( (lv_name_1_0= ruleEString ) )
            // InternalEel.g:708:4: (lv_name_1_0= ruleEString )
            {
            // InternalEel.g:708:4: (lv_name_1_0= ruleEString )
            // InternalEel.g:709:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.tblf.energy.estimation.eel.Eel.EString");
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "ruleVisibility"
    // InternalEel.g:730:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'GLOBAL' ) | (enumLiteral_1= 'LOCAL' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEel.g:736:2: ( ( (enumLiteral_0= 'GLOBAL' ) | (enumLiteral_1= 'LOCAL' ) ) )
            // InternalEel.g:737:2: ( (enumLiteral_0= 'GLOBAL' ) | (enumLiteral_1= 'LOCAL' ) )
            {
            // InternalEel.g:737:2: ( (enumLiteral_0= 'GLOBAL' ) | (enumLiteral_1= 'LOCAL' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            else if ( (LA19_0==30) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalEel.g:738:3: (enumLiteral_0= 'GLOBAL' )
                    {
                    // InternalEel.g:738:3: (enumLiteral_0= 'GLOBAL' )
                    // InternalEel.g:739:4: enumLiteral_0= 'GLOBAL'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getGLOBALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getGLOBALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:746:3: (enumLiteral_1= 'LOCAL' )
                    {
                    // InternalEel.g:746:3: (enumLiteral_1= 'LOCAL' )
                    // InternalEel.g:747:4: enumLiteral_1= 'LOCAL'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getLOCALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getLOCALEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleVisibility"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000006001A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000060018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000060008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001800040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010100030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100000L});

}