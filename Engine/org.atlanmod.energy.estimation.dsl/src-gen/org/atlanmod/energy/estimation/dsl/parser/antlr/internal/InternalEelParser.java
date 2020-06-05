package org.atlanmod.energy.estimation.dsl.parser.antlr.internal;

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
import org.atlanmod.energy.estimation.dsl.services.EelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Platform'", "'{'", "'variables'", "','", "'}'", "'measures'", "'Variable'", "'value'", "'vibility'", "'.'", "'post'", "'#'", "'='", "'ocl:'", "'attribute:'", "'as'", "'.absoluteTime'", "'+'", "'-'", "'*'", "'/'", "'exp'", "'logistic'", "'integral'", "'['", "';'", "']'", "'NormalDistribution'", "'Interval'", "'lowerEndpoint'", "'upperEndpoint'", "'Sampling'", "'measurementProcedure'", "'samples'", "'Integral'", "'function'", "'interval'", "'Sample'", "'quantity'", "'abstract'", "'interface'", "'EClass'", "'instanceClassName'", "'instanceTypeName'", "'eSuperTypes'", "'('", "')'", "'eAnnotations'", "'eTypeParameters'", "'eOperations'", "'eStructuralFeatures'", "'eGenericSuperTypes'", "'EOperation'", "'ordered'", "'unique'", "'lowerBound'", "'upperBound'", "'eType'", "'eExceptions'", "'eGenericType'", "'eParameters'", "'eGenericExceptions'", "'EAnnotation'", "'source'", "'references'", "'details'", "'contents'", "'ETypeParameter'", "'eBounds'", "'true'", "'false'", "'EGenericType'", "'eTypeParameter'", "'eClassifier'", "'eUpperBound'", "'eTypeArguments'", "'eLowerBound'", "'EStringToStringMapEntry'", "'key'", "'EObject'", "'volatile'", "'transient'", "'unsettable'", "'derived'", "'iD'", "'EAttribute'", "'changeable'", "'defaultValueLiteral'", "'containment'", "'EReference'", "'resolveProxies'", "'eOpposite'", "'eKeys'", "'EDataType'", "'serializable'", "'EEnum'", "'eLiterals'", "'EEnumLiteral'", "'literal'", "'EParameter'", "'current'", "'duration'", "'energy'", "'frequency'", "'power'", "'voltage'", "'scalar'", "'LOCAL'", "'GLOBAL'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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
    // InternalEel.g:72:1: rulePlatform returns [EObject current=null] : ( () otherlv_1= 'Platform' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variables' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}' )? (otherlv_10= 'measures' otherlv_11= '{' ( (lv_measures_12_0= ruleMeasure ) ) (otherlv_13= ',' ( (lv_measures_14_0= ruleMeasure ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_variables_6_0 = null;

        EObject lv_variables_8_0 = null;

        EObject lv_measures_12_0 = null;

        EObject lv_measures_14_0 = null;



        	enterRule();

        try {
            // InternalEel.g:78:2: ( ( () otherlv_1= 'Platform' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variables' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}' )? (otherlv_10= 'measures' otherlv_11= '{' ( (lv_measures_12_0= ruleMeasure ) ) (otherlv_13= ',' ( (lv_measures_14_0= ruleMeasure ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalEel.g:79:2: ( () otherlv_1= 'Platform' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variables' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}' )? (otherlv_10= 'measures' otherlv_11= '{' ( (lv_measures_12_0= ruleMeasure ) ) (otherlv_13= ',' ( (lv_measures_14_0= ruleMeasure ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalEel.g:79:2: ( () otherlv_1= 'Platform' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variables' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}' )? (otherlv_10= 'measures' otherlv_11= '{' ( (lv_measures_12_0= ruleMeasure ) ) (otherlv_13= ',' ( (lv_measures_14_0= ruleMeasure ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalEel.g:80:3: () otherlv_1= 'Platform' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variables' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}' )? (otherlv_10= 'measures' otherlv_11= '{' ( (lv_measures_12_0= ruleMeasure ) ) (otherlv_13= ',' ( (lv_measures_14_0= ruleMeasure ) ) )* otherlv_15= '}' )? otherlv_16= '}'
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
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:114:3: (otherlv_4= 'variables' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEel.g:115:4: otherlv_4= 'variables' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getPlatformAccess().getVariablesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalEel.g:123:4: ( (lv_variables_6_0= ruleVariable ) )
                    // InternalEel.g:124:5: (lv_variables_6_0= ruleVariable )
                    {
                    // InternalEel.g:124:5: (lv_variables_6_0= ruleVariable )
                    // InternalEel.g:125:6: lv_variables_6_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getPlatformAccess().getVariablesVariableParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_variables_6_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlatformRule());
                    						}
                    						add(
                    							current,
                    							"variables",
                    							lv_variables_6_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:142:4: (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalEel.g:143:5: otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPlatformAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalEel.g:147:5: ( (lv_variables_8_0= ruleVariable ) )
                    	    // InternalEel.g:148:6: (lv_variables_8_0= ruleVariable )
                    	    {
                    	    // InternalEel.g:148:6: (lv_variables_8_0= ruleVariable )
                    	    // InternalEel.g:149:7: lv_variables_8_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getPlatformAccess().getVariablesVariableParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_variables_8_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPlatformRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variables",
                    	    								lv_variables_8_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.Variable");
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

            // InternalEel.g:172:3: (otherlv_10= 'measures' otherlv_11= '{' ( (lv_measures_12_0= ruleMeasure ) ) (otherlv_13= ',' ( (lv_measures_14_0= ruleMeasure ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEel.g:173:4: otherlv_10= 'measures' otherlv_11= '{' ( (lv_measures_12_0= ruleMeasure ) ) (otherlv_13= ',' ( (lv_measures_14_0= ruleMeasure ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getPlatformAccess().getMeasuresKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalEel.g:181:4: ( (lv_measures_12_0= ruleMeasure ) )
                    // InternalEel.g:182:5: (lv_measures_12_0= ruleMeasure )
                    {
                    // InternalEel.g:182:5: (lv_measures_12_0= ruleMeasure )
                    // InternalEel.g:183:6: lv_measures_12_0= ruleMeasure
                    {

                    						newCompositeNode(grammarAccess.getPlatformAccess().getMeasuresMeasureParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_measures_12_0=ruleMeasure();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlatformRule());
                    						}
                    						add(
                    							current,
                    							"measures",
                    							lv_measures_12_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.Measure");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:200:4: (otherlv_13= ',' ( (lv_measures_14_0= ruleMeasure ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalEel.g:201:5: otherlv_13= ',' ( (lv_measures_14_0= ruleMeasure ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getPlatformAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalEel.g:205:5: ( (lv_measures_14_0= ruleMeasure ) )
                    	    // InternalEel.g:206:6: (lv_measures_14_0= ruleMeasure )
                    	    {
                    	    // InternalEel.g:206:6: (lv_measures_14_0= ruleMeasure )
                    	    // InternalEel.g:207:7: lv_measures_14_0= ruleMeasure
                    	    {

                    	    							newCompositeNode(grammarAccess.getPlatformAccess().getMeasuresMeasureParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_measures_14_0=ruleMeasure();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPlatformRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"measures",
                    	    								lv_measures_14_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.Measure");
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

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleMeasure"
    // InternalEel.g:238:1: entryRuleMeasure returns [EObject current=null] : iv_ruleMeasure= ruleMeasure EOF ;
    public final EObject entryRuleMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasure = null;


        try {
            // InternalEel.g:238:48: (iv_ruleMeasure= ruleMeasure EOF )
            // InternalEel.g:239:2: iv_ruleMeasure= ruleMeasure EOF
            {
             newCompositeNode(grammarAccess.getMeasureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasure=ruleMeasure();

            state._fsp--;

             current =iv_ruleMeasure; 
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
    // $ANTLR end "entryRuleMeasure"


    // $ANTLR start "ruleMeasure"
    // InternalEel.g:245:1: ruleMeasure returns [EObject current=null] : (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureUnboundProductOperation_4= ruleMeasureUnboundProductOperation | this_MeasureUnboundSumOperation_5= ruleMeasureUnboundSumOperation | this_MeasureUnboundDivisionOperation_6= ruleMeasureUnboundDivisionOperation | this_MeasureUnboundSubstractOperation_7= ruleMeasureUnboundSubstractOperation | this_RealTimeDuration_8= ruleRealTimeDuration | this_CompositeMeasure_9= ruleCompositeMeasure ) ;
    public final EObject ruleMeasure() throws RecognitionException {
        EObject current = null;

        EObject this_MeasureValue_Impl_0 = null;

        EObject this_MeasureOCL_1 = null;

        EObject this_MeasureAttribute_2 = null;

        EObject this_MeasureCast_3 = null;

        EObject this_MeasureUnboundProductOperation_4 = null;

        EObject this_MeasureUnboundSumOperation_5 = null;

        EObject this_MeasureUnboundDivisionOperation_6 = null;

        EObject this_MeasureUnboundSubstractOperation_7 = null;

        EObject this_RealTimeDuration_8 = null;

        EObject this_CompositeMeasure_9 = null;



        	enterRule();

        try {
            // InternalEel.g:251:2: ( (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureUnboundProductOperation_4= ruleMeasureUnboundProductOperation | this_MeasureUnboundSumOperation_5= ruleMeasureUnboundSumOperation | this_MeasureUnboundDivisionOperation_6= ruleMeasureUnboundDivisionOperation | this_MeasureUnboundSubstractOperation_7= ruleMeasureUnboundSubstractOperation | this_RealTimeDuration_8= ruleRealTimeDuration | this_CompositeMeasure_9= ruleCompositeMeasure ) )
            // InternalEel.g:252:2: (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureUnboundProductOperation_4= ruleMeasureUnboundProductOperation | this_MeasureUnboundSumOperation_5= ruleMeasureUnboundSumOperation | this_MeasureUnboundDivisionOperation_6= ruleMeasureUnboundDivisionOperation | this_MeasureUnboundSubstractOperation_7= ruleMeasureUnboundSubstractOperation | this_RealTimeDuration_8= ruleRealTimeDuration | this_CompositeMeasure_9= ruleCompositeMeasure )
            {
            // InternalEel.g:252:2: (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureUnboundProductOperation_4= ruleMeasureUnboundProductOperation | this_MeasureUnboundSumOperation_5= ruleMeasureUnboundSumOperation | this_MeasureUnboundDivisionOperation_6= ruleMeasureUnboundDivisionOperation | this_MeasureUnboundSubstractOperation_7= ruleMeasureUnboundSubstractOperation | this_RealTimeDuration_8= ruleRealTimeDuration | this_CompositeMeasure_9= ruleCompositeMeasure )
            int alt5=10;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalEel.g:253:3: this_MeasureValue_Impl_0= ruleMeasureValue_Impl
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureValue_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureValue_Impl_0=ruleMeasureValue_Impl();

                    state._fsp--;


                    			current = this_MeasureValue_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEel.g:262:3: this_MeasureOCL_1= ruleMeasureOCL
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureOCLParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureOCL_1=ruleMeasureOCL();

                    state._fsp--;


                    			current = this_MeasureOCL_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEel.g:271:3: this_MeasureAttribute_2= ruleMeasureAttribute
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureAttributeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureAttribute_2=ruleMeasureAttribute();

                    state._fsp--;


                    			current = this_MeasureAttribute_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalEel.g:280:3: this_MeasureCast_3= ruleMeasureCast
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureCastParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureCast_3=ruleMeasureCast();

                    state._fsp--;


                    			current = this_MeasureCast_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalEel.g:289:3: this_MeasureUnboundProductOperation_4= ruleMeasureUnboundProductOperation
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureUnboundProductOperationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureUnboundProductOperation_4=ruleMeasureUnboundProductOperation();

                    state._fsp--;


                    			current = this_MeasureUnboundProductOperation_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalEel.g:298:3: this_MeasureUnboundSumOperation_5= ruleMeasureUnboundSumOperation
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureUnboundSumOperationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureUnboundSumOperation_5=ruleMeasureUnboundSumOperation();

                    state._fsp--;


                    			current = this_MeasureUnboundSumOperation_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalEel.g:307:3: this_MeasureUnboundDivisionOperation_6= ruleMeasureUnboundDivisionOperation
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureUnboundDivisionOperationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureUnboundDivisionOperation_6=ruleMeasureUnboundDivisionOperation();

                    state._fsp--;


                    			current = this_MeasureUnboundDivisionOperation_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalEel.g:316:3: this_MeasureUnboundSubstractOperation_7= ruleMeasureUnboundSubstractOperation
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureUnboundSubstractOperationParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureUnboundSubstractOperation_7=ruleMeasureUnboundSubstractOperation();

                    state._fsp--;


                    			current = this_MeasureUnboundSubstractOperation_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalEel.g:325:3: this_RealTimeDuration_8= ruleRealTimeDuration
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getRealTimeDurationParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealTimeDuration_8=ruleRealTimeDuration();

                    state._fsp--;


                    			current = this_RealTimeDuration_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalEel.g:334:3: this_CompositeMeasure_9= ruleCompositeMeasure
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getCompositeMeasureParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeMeasure_9=ruleCompositeMeasure();

                    state._fsp--;


                    			current = this_CompositeMeasure_9;
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
    // $ANTLR end "ruleMeasure"


    // $ANTLR start "entryRuleCompositeMeasure"
    // InternalEel.g:346:1: entryRuleCompositeMeasure returns [EObject current=null] : iv_ruleCompositeMeasure= ruleCompositeMeasure EOF ;
    public final EObject entryRuleCompositeMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeMeasure = null;


        try {
            // InternalEel.g:346:57: (iv_ruleCompositeMeasure= ruleCompositeMeasure EOF )
            // InternalEel.g:347:2: iv_ruleCompositeMeasure= ruleCompositeMeasure EOF
            {
             newCompositeNode(grammarAccess.getCompositeMeasureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeMeasure=ruleCompositeMeasure();

            state._fsp--;

             current =iv_ruleCompositeMeasure; 
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
    // $ANTLR end "entryRuleCompositeMeasure"


    // $ANTLR start "ruleCompositeMeasure"
    // InternalEel.g:353:1: ruleCompositeMeasure returns [EObject current=null] : (this_ExponentialMeasure_0= ruleExponentialMeasure | this_LogisticMeasure_1= ruleLogisticMeasure | this_IntegrationMeasure_2= ruleIntegrationMeasure ) ;
    public final EObject ruleCompositeMeasure() throws RecognitionException {
        EObject current = null;

        EObject this_ExponentialMeasure_0 = null;

        EObject this_LogisticMeasure_1 = null;

        EObject this_IntegrationMeasure_2 = null;



        	enterRule();

        try {
            // InternalEel.g:359:2: ( (this_ExponentialMeasure_0= ruleExponentialMeasure | this_LogisticMeasure_1= ruleLogisticMeasure | this_IntegrationMeasure_2= ruleIntegrationMeasure ) )
            // InternalEel.g:360:2: (this_ExponentialMeasure_0= ruleExponentialMeasure | this_LogisticMeasure_1= ruleLogisticMeasure | this_IntegrationMeasure_2= ruleIntegrationMeasure )
            {
            // InternalEel.g:360:2: (this_ExponentialMeasure_0= ruleExponentialMeasure | this_LogisticMeasure_1= ruleLogisticMeasure | this_IntegrationMeasure_2= ruleIntegrationMeasure )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalEel.g:361:3: this_ExponentialMeasure_0= ruleExponentialMeasure
                    {

                    			newCompositeNode(grammarAccess.getCompositeMeasureAccess().getExponentialMeasureParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExponentialMeasure_0=ruleExponentialMeasure();

                    state._fsp--;


                    			current = this_ExponentialMeasure_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEel.g:370:3: this_LogisticMeasure_1= ruleLogisticMeasure
                    {

                    			newCompositeNode(grammarAccess.getCompositeMeasureAccess().getLogisticMeasureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogisticMeasure_1=ruleLogisticMeasure();

                    state._fsp--;


                    			current = this_LogisticMeasure_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEel.g:379:3: this_IntegrationMeasure_2= ruleIntegrationMeasure
                    {

                    			newCompositeNode(grammarAccess.getCompositeMeasureAccess().getIntegrationMeasureParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegrationMeasure_2=ruleIntegrationMeasure();

                    state._fsp--;


                    			current = this_IntegrationMeasure_2;
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
    // $ANTLR end "ruleCompositeMeasure"


    // $ANTLR start "entryRuleMeasurementUncertaintyInformation"
    // InternalEel.g:391:1: entryRuleMeasurementUncertaintyInformation returns [EObject current=null] : iv_ruleMeasurementUncertaintyInformation= ruleMeasurementUncertaintyInformation EOF ;
    public final EObject entryRuleMeasurementUncertaintyInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementUncertaintyInformation = null;


        try {
            // InternalEel.g:391:74: (iv_ruleMeasurementUncertaintyInformation= ruleMeasurementUncertaintyInformation EOF )
            // InternalEel.g:392:2: iv_ruleMeasurementUncertaintyInformation= ruleMeasurementUncertaintyInformation EOF
            {
             newCompositeNode(grammarAccess.getMeasurementUncertaintyInformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasurementUncertaintyInformation=ruleMeasurementUncertaintyInformation();

            state._fsp--;

             current =iv_ruleMeasurementUncertaintyInformation; 
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
    // $ANTLR end "entryRuleMeasurementUncertaintyInformation"


    // $ANTLR start "ruleMeasurementUncertaintyInformation"
    // InternalEel.g:398:1: ruleMeasurementUncertaintyInformation returns [EObject current=null] : (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral ) ;
    public final EObject ruleMeasurementUncertaintyInformation() throws RecognitionException {
        EObject current = null;

        EObject this_NormalDistribution_0 = null;

        EObject this_Interval_1 = null;

        EObject this_Sampling_2 = null;

        EObject this_Integral_3 = null;



        	enterRule();

        try {
            // InternalEel.g:404:2: ( (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral ) )
            // InternalEel.g:405:2: (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral )
            {
            // InternalEel.g:405:2: (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt7=1;
                }
                break;
            case 39:
                {
                alt7=2;
                }
                break;
            case 42:
                {
                alt7=3;
                }
                break;
            case 45:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalEel.g:406:3: this_NormalDistribution_0= ruleNormalDistribution
                    {

                    			newCompositeNode(grammarAccess.getMeasurementUncertaintyInformationAccess().getNormalDistributionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NormalDistribution_0=ruleNormalDistribution();

                    state._fsp--;


                    			current = this_NormalDistribution_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEel.g:415:3: this_Interval_1= ruleInterval
                    {

                    			newCompositeNode(grammarAccess.getMeasurementUncertaintyInformationAccess().getIntervalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interval_1=ruleInterval();

                    state._fsp--;


                    			current = this_Interval_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEel.g:424:3: this_Sampling_2= ruleSampling
                    {

                    			newCompositeNode(grammarAccess.getMeasurementUncertaintyInformationAccess().getSamplingParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sampling_2=ruleSampling();

                    state._fsp--;


                    			current = this_Sampling_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalEel.g:433:3: this_Integral_3= ruleIntegral
                    {

                    			newCompositeNode(grammarAccess.getMeasurementUncertaintyInformationAccess().getIntegralParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Integral_3=ruleIntegral();

                    state._fsp--;


                    			current = this_Integral_3;
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
    // $ANTLR end "ruleMeasurementUncertaintyInformation"


    // $ANTLR start "entryRuleEString"
    // InternalEel.g:445:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalEel.g:445:47: (iv_ruleEString= ruleEString EOF )
            // InternalEel.g:446:2: iv_ruleEString= ruleEString EOF
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
    // InternalEel.g:452:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalEel.g:458:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalEel.g:459:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalEel.g:459:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEel.g:460:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEel.g:468:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleVariable"
    // InternalEel.g:479:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalEel.g:479:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalEel.g:480:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalEel.g:486:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )? otherlv_5= 'vibility' ( (lv_vibility_6_0= ruleVisibility ) ) otherlv_7= '}' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;

        Enumerator lv_vibility_6_0 = null;



        	enterRule();

        try {
            // InternalEel.g:492:2: ( (otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )? otherlv_5= 'vibility' ( (lv_vibility_6_0= ruleVisibility ) ) otherlv_7= '}' ) )
            // InternalEel.g:493:2: (otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )? otherlv_5= 'vibility' ( (lv_vibility_6_0= ruleVisibility ) ) otherlv_7= '}' )
            {
            // InternalEel.g:493:2: (otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )? otherlv_5= 'vibility' ( (lv_vibility_6_0= ruleVisibility ) ) otherlv_7= '}' )
            // InternalEel.g:494:3: otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )? otherlv_5= 'vibility' ( (lv_vibility_6_0= ruleVisibility ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariableKeyword_0());
            		
            // InternalEel.g:498:3: ( (lv_name_1_0= ruleEString ) )
            // InternalEel.g:499:4: (lv_name_1_0= ruleEString )
            {
            // InternalEel.g:499:4: (lv_name_1_0= ruleEString )
            // InternalEel.g:500:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:521:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEel.g:522:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getValueKeyword_3_0());
                    			
                    // InternalEel.g:526:4: ( (lv_value_4_0= ruleEBigDecimal ) )
                    // InternalEel.g:527:5: (lv_value_4_0= ruleEBigDecimal )
                    {
                    // InternalEel.g:527:5: (lv_value_4_0= ruleEBigDecimal )
                    // InternalEel.g:528:6: lv_value_4_0= ruleEBigDecimal
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getValueEBigDecimalParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_value_4_0=ruleEBigDecimal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EBigDecimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getVibilityKeyword_4());
            		
            // InternalEel.g:550:3: ( (lv_vibility_6_0= ruleVisibility ) )
            // InternalEel.g:551:4: (lv_vibility_6_0= ruleVisibility )
            {
            // InternalEel.g:551:4: (lv_vibility_6_0= ruleVisibility )
            // InternalEel.g:552:5: lv_vibility_6_0= ruleVisibility
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getVibilityVisibilityEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_vibility_6_0=ruleVisibility();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"vibility",
            						lv_vibility_6_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.Visibility");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleEBigDecimal"
    // InternalEel.g:577:1: entryRuleEBigDecimal returns [String current=null] : iv_ruleEBigDecimal= ruleEBigDecimal EOF ;
    public final String entryRuleEBigDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBigDecimal = null;


        try {
            // InternalEel.g:577:51: (iv_ruleEBigDecimal= ruleEBigDecimal EOF )
            // InternalEel.g:578:2: iv_ruleEBigDecimal= ruleEBigDecimal EOF
            {
             newCompositeNode(grammarAccess.getEBigDecimalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBigDecimal=ruleEBigDecimal();

            state._fsp--;

             current =iv_ruleEBigDecimal.getText(); 
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
    // $ANTLR end "entryRuleEBigDecimal"


    // $ANTLR start "ruleEBigDecimal"
    // InternalEel.g:584:1: ruleEBigDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEBigDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalEel.g:590:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalEel.g:591:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalEel.g:591:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalEel.g:592:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalEel.g:592:3: (this_INT_0= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEel.g:593:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_15); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,20,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEBigDecimalAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleEBigDecimal"


    // $ANTLR start "entryRuleMeasureValue_Impl"
    // InternalEel.g:617:1: entryRuleMeasureValue_Impl returns [EObject current=null] : iv_ruleMeasureValue_Impl= ruleMeasureValue_Impl EOF ;
    public final EObject entryRuleMeasureValue_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureValue_Impl = null;


        try {
            // InternalEel.g:617:58: (iv_ruleMeasureValue_Impl= ruleMeasureValue_Impl EOF )
            // InternalEel.g:618:2: iv_ruleMeasureValue_Impl= ruleMeasureValue_Impl EOF
            {
             newCompositeNode(grammarAccess.getMeasureValue_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureValue_Impl=ruleMeasureValue_Impl();

            state._fsp--;

             current =iv_ruleMeasureValue_Impl; 
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
    // $ANTLR end "entryRuleMeasureValue_Impl"


    // $ANTLR start "ruleMeasureValue_Impl"
    // InternalEel.g:624:1: ruleMeasureValue_Impl returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (lv_value_9_0= ruleEBigDecimal ) )? ) ;
    public final EObject ruleMeasureValue_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        Enumerator lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_subname_7_0 = null;

        AntlrDatatypeRuleToken lv_value_9_0 = null;



        	enterRule();

        try {
            // InternalEel.g:630:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (lv_value_9_0= ruleEBigDecimal ) )? ) )
            // InternalEel.g:631:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (lv_value_9_0= ruleEBigDecimal ) )? )
            {
            // InternalEel.g:631:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (lv_value_9_0= ruleEBigDecimal ) )? )
            // InternalEel.g:632:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (lv_value_9_0= ruleEBigDecimal ) )?
            {
            // InternalEel.g:632:3: ()
            // InternalEel.g:633:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureValue_ImplAccess().getMeasureValueAction_0(),
            					current);
            			

            }

            // InternalEel.g:639:3: ( (lv_post_1_0= 'post' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEel.g:640:4: (lv_post_1_0= 'post' )
                    {
                    // InternalEel.g:640:4: (lv_post_1_0= 'post' )
                    // InternalEel.g:641:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,21,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getMeasureValue_ImplAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeasureValue_ImplRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:653:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalEel.g:654:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalEel.g:654:4: (lv_targetClass_2_0= ruleEString )
            // InternalEel.g:655:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureValue_ImplRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:672:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEel.g:673:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureValue_ImplAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalEel.g:677:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalEel.g:678:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalEel.g:678:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalEel.g:679:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureValue_ImplRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureValue_ImplAccess().getFullStopKeyword_4());
            		
            // InternalEel.g:701:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=111 && LA13_0<=117)) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalEel.g:702:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalEel.g:702:4: ( (lv_type_6_0= ruleType ) )
                    // InternalEel.g:703:5: (lv_type_6_0= ruleType )
                    {
                    // InternalEel.g:703:5: (lv_type_6_0= ruleType )
                    // InternalEel.g:704:6: lv_type_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getTypeTypeEnumRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_type_6_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureValue_ImplRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:722:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalEel.g:722:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalEel.g:723:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalEel.g:723:5: (lv_subname_7_0= ruleEString )
                    // InternalEel.g:724:6: lv_subname_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getSubnameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_subname_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureValue_ImplRule());
                    						}
                    						set(
                    							current,
                    							"subname",
                    							lv_subname_7_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureValue_ImplAccess().getEqualsSignKeyword_6());
            		
            // InternalEel.g:746:3: ( (lv_value_9_0= ruleEBigDecimal ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT||LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEel.g:747:4: (lv_value_9_0= ruleEBigDecimal )
                    {
                    // InternalEel.g:747:4: (lv_value_9_0= ruleEBigDecimal )
                    // InternalEel.g:748:5: lv_value_9_0= ruleEBigDecimal
                    {

                    					newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getValueEBigDecimalParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_9_0=ruleEBigDecimal();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMeasureValue_ImplRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_9_0,
                    						"org.atlanmod.energy.estimation.dsl.Eel.EBigDecimal");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleMeasureValue_Impl"


    // $ANTLR start "entryRuleMeasureOCL"
    // InternalEel.g:769:1: entryRuleMeasureOCL returns [EObject current=null] : iv_ruleMeasureOCL= ruleMeasureOCL EOF ;
    public final EObject entryRuleMeasureOCL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureOCL = null;


        try {
            // InternalEel.g:769:51: (iv_ruleMeasureOCL= ruleMeasureOCL EOF )
            // InternalEel.g:770:2: iv_ruleMeasureOCL= ruleMeasureOCL EOF
            {
             newCompositeNode(grammarAccess.getMeasureOCLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureOCL=ruleMeasureOCL();

            state._fsp--;

             current =iv_ruleMeasureOCL; 
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
    // $ANTLR end "entryRuleMeasureOCL"


    // $ANTLR start "ruleMeasureOCL"
    // InternalEel.g:776:1: ruleMeasureOCL returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'ocl:' ( (lv_oclQuery_10_0= ruleEString ) ) ) ;
    public final EObject ruleMeasureOCL() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        Enumerator lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_subname_7_0 = null;

        AntlrDatatypeRuleToken lv_oclQuery_10_0 = null;



        	enterRule();

        try {
            // InternalEel.g:782:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'ocl:' ( (lv_oclQuery_10_0= ruleEString ) ) ) )
            // InternalEel.g:783:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'ocl:' ( (lv_oclQuery_10_0= ruleEString ) ) )
            {
            // InternalEel.g:783:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'ocl:' ( (lv_oclQuery_10_0= ruleEString ) ) )
            // InternalEel.g:784:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'ocl:' ( (lv_oclQuery_10_0= ruleEString ) )
            {
            // InternalEel.g:784:3: ()
            // InternalEel.g:785:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureOCLAccess().getMeasureOCLAction_0(),
            					current);
            			

            }

            // InternalEel.g:791:3: ( (lv_post_1_0= 'post' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEel.g:792:4: (lv_post_1_0= 'post' )
                    {
                    // InternalEel.g:792:4: (lv_post_1_0= 'post' )
                    // InternalEel.g:793:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,21,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getMeasureOCLAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeasureOCLRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:805:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalEel.g:806:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalEel.g:806:4: (lv_targetClass_2_0= ruleEString )
            // InternalEel.g:807:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureOCLAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureOCLRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:824:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEel.g:825:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureOCLAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalEel.g:829:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalEel.g:830:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalEel.g:830:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalEel.g:831:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureOCLAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureOCLRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureOCLAccess().getFullStopKeyword_4());
            		
            // InternalEel.g:853:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=111 && LA17_0<=117)) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalEel.g:854:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalEel.g:854:4: ( (lv_type_6_0= ruleType ) )
                    // InternalEel.g:855:5: (lv_type_6_0= ruleType )
                    {
                    // InternalEel.g:855:5: (lv_type_6_0= ruleType )
                    // InternalEel.g:856:6: lv_type_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureOCLAccess().getTypeTypeEnumRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_type_6_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureOCLRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:874:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalEel.g:874:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalEel.g:875:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalEel.g:875:5: (lv_subname_7_0= ruleEString )
                    // InternalEel.g:876:6: lv_subname_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureOCLAccess().getSubnameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_subname_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureOCLRule());
                    						}
                    						set(
                    							current,
                    							"subname",
                    							lv_subname_7_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureOCLAccess().getEqualsSignKeyword_6());
            		
            otherlv_9=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getMeasureOCLAccess().getOclKeyword_7());
            		
            // InternalEel.g:902:3: ( (lv_oclQuery_10_0= ruleEString ) )
            // InternalEel.g:903:4: (lv_oclQuery_10_0= ruleEString )
            {
            // InternalEel.g:903:4: (lv_oclQuery_10_0= ruleEString )
            // InternalEel.g:904:5: lv_oclQuery_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureOCLAccess().getOclQueryEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_oclQuery_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureOCLRule());
            					}
            					set(
            						current,
            						"oclQuery",
            						lv_oclQuery_10_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
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
    // $ANTLR end "ruleMeasureOCL"


    // $ANTLR start "entryRuleMeasureAttribute"
    // InternalEel.g:925:1: entryRuleMeasureAttribute returns [EObject current=null] : iv_ruleMeasureAttribute= ruleMeasureAttribute EOF ;
    public final EObject entryRuleMeasureAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureAttribute = null;


        try {
            // InternalEel.g:925:57: (iv_ruleMeasureAttribute= ruleMeasureAttribute EOF )
            // InternalEel.g:926:2: iv_ruleMeasureAttribute= ruleMeasureAttribute EOF
            {
             newCompositeNode(grammarAccess.getMeasureAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureAttribute=ruleMeasureAttribute();

            state._fsp--;

             current =iv_ruleMeasureAttribute; 
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
    // $ANTLR end "entryRuleMeasureAttribute"


    // $ANTLR start "ruleMeasureAttribute"
    // InternalEel.g:932:1: ruleMeasureAttribute returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'attribute:' ( (lv_att_10_0= ruleEString ) ) ) ;
    public final EObject ruleMeasureAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        Enumerator lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_subname_7_0 = null;

        AntlrDatatypeRuleToken lv_att_10_0 = null;



        	enterRule();

        try {
            // InternalEel.g:938:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'attribute:' ( (lv_att_10_0= ruleEString ) ) ) )
            // InternalEel.g:939:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'attribute:' ( (lv_att_10_0= ruleEString ) ) )
            {
            // InternalEel.g:939:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'attribute:' ( (lv_att_10_0= ruleEString ) ) )
            // InternalEel.g:940:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'attribute:' ( (lv_att_10_0= ruleEString ) )
            {
            // InternalEel.g:940:3: ()
            // InternalEel.g:941:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureAttributeAccess().getMeasureAttributeAction_0(),
            					current);
            			

            }

            // InternalEel.g:947:3: ( (lv_post_1_0= 'post' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEel.g:948:4: (lv_post_1_0= 'post' )
                    {
                    // InternalEel.g:948:4: (lv_post_1_0= 'post' )
                    // InternalEel.g:949:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,21,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getMeasureAttributeAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeasureAttributeRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:961:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalEel.g:962:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalEel.g:962:4: (lv_targetClass_2_0= ruleEString )
            // InternalEel.g:963:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureAttributeAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureAttributeRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:980:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEel.g:981:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureAttributeAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalEel.g:985:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalEel.g:986:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalEel.g:986:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalEel.g:987:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureAttributeAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureAttributeRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureAttributeAccess().getFullStopKeyword_4());
            		
            // InternalEel.g:1009:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=111 && LA20_0<=117)) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalEel.g:1010:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalEel.g:1010:4: ( (lv_type_6_0= ruleType ) )
                    // InternalEel.g:1011:5: (lv_type_6_0= ruleType )
                    {
                    // InternalEel.g:1011:5: (lv_type_6_0= ruleType )
                    // InternalEel.g:1012:6: lv_type_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureAttributeAccess().getTypeTypeEnumRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_type_6_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureAttributeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:1030:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalEel.g:1030:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalEel.g:1031:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalEel.g:1031:5: (lv_subname_7_0= ruleEString )
                    // InternalEel.g:1032:6: lv_subname_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureAttributeAccess().getSubnameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_subname_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureAttributeRule());
                    						}
                    						set(
                    							current,
                    							"subname",
                    							lv_subname_7_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureAttributeAccess().getEqualsSignKeyword_6());
            		
            otherlv_9=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getMeasureAttributeAccess().getAttributeKeyword_7());
            		
            // InternalEel.g:1058:3: ( (lv_att_10_0= ruleEString ) )
            // InternalEel.g:1059:4: (lv_att_10_0= ruleEString )
            {
            // InternalEel.g:1059:4: (lv_att_10_0= ruleEString )
            // InternalEel.g:1060:5: lv_att_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureAttributeAccess().getAttEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_att_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureAttributeRule());
            					}
            					set(
            						current,
            						"att",
            						lv_att_10_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
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
    // $ANTLR end "ruleMeasureAttribute"


    // $ANTLR start "entryRuleMeasureCast"
    // InternalEel.g:1081:1: entryRuleMeasureCast returns [EObject current=null] : iv_ruleMeasureCast= ruleMeasureCast EOF ;
    public final EObject entryRuleMeasureCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureCast = null;


        try {
            // InternalEel.g:1081:52: (iv_ruleMeasureCast= ruleMeasureCast EOF )
            // InternalEel.g:1082:2: iv_ruleMeasureCast= ruleMeasureCast EOF
            {
             newCompositeNode(grammarAccess.getMeasureCastRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureCast=ruleMeasureCast();

            state._fsp--;

             current =iv_ruleMeasureCast; 
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
    // $ANTLR end "entryRuleMeasureCast"


    // $ANTLR start "ruleMeasureCast"
    // InternalEel.g:1088:1: ruleMeasureCast returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= 'as' ( (lv_type_10_0= ruleType ) ) ) ;
    public final EObject ruleMeasureCast() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        AntlrDatatypeRuleToken lv_subname_6_0 = null;

        Enumerator lv_type_10_0 = null;



        	enterRule();

        try {
            // InternalEel.g:1094:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= 'as' ( (lv_type_10_0= ruleType ) ) ) )
            // InternalEel.g:1095:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= 'as' ( (lv_type_10_0= ruleType ) ) )
            {
            // InternalEel.g:1095:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= 'as' ( (lv_type_10_0= ruleType ) ) )
            // InternalEel.g:1096:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= 'as' ( (lv_type_10_0= ruleType ) )
            {
            // InternalEel.g:1096:3: ()
            // InternalEel.g:1097:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureCastAccess().getMeasureCastAction_0(),
            					current);
            			

            }

            // InternalEel.g:1103:3: ( (lv_post_1_0= 'post' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEel.g:1104:4: (lv_post_1_0= 'post' )
                    {
                    // InternalEel.g:1104:4: (lv_post_1_0= 'post' )
                    // InternalEel.g:1105:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,21,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getMeasureCastAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeasureCastRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:1117:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalEel.g:1118:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalEel.g:1118:4: (lv_targetClass_2_0= ruleEString )
            // InternalEel.g:1119:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureCastAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureCastRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1136:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEel.g:1137:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureCastAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalEel.g:1141:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalEel.g:1142:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalEel.g:1142:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalEel.g:1143:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureCastAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureCastRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureCastAccess().getFullStopKeyword_4());
            		
            // InternalEel.g:1165:3: ( (lv_subname_6_0= ruleEString ) )
            // InternalEel.g:1166:4: (lv_subname_6_0= ruleEString )
            {
            // InternalEel.g:1166:4: (lv_subname_6_0= ruleEString )
            // InternalEel.g:1167:5: lv_subname_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureCastAccess().getSubnameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
            lv_subname_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureCastRule());
            					}
            					set(
            						current,
            						"subname",
            						lv_subname_6_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasureCastAccess().getEqualsSignKeyword_6());
            		
            // InternalEel.g:1188:3: ( ( ruleEString ) )
            // InternalEel.g:1189:4: ( ruleEString )
            {
            // InternalEel.g:1189:4: ( ruleEString )
            // InternalEel.g:1190:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureCastRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureCastAccess().getMeasureMeasureCrossReference_7_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getMeasureCastAccess().getAsKeyword_8());
            		
            // InternalEel.g:1208:3: ( (lv_type_10_0= ruleType ) )
            // InternalEel.g:1209:4: (lv_type_10_0= ruleType )
            {
            // InternalEel.g:1209:4: (lv_type_10_0= ruleType )
            // InternalEel.g:1210:5: lv_type_10_0= ruleType
            {

            					newCompositeNode(grammarAccess.getMeasureCastAccess().getTypeTypeEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_10_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureCastRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_10_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.Type");
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
    // $ANTLR end "ruleMeasureCast"


    // $ANTLR start "entryRuleRealTimeDuration"
    // InternalEel.g:1231:1: entryRuleRealTimeDuration returns [EObject current=null] : iv_ruleRealTimeDuration= ruleRealTimeDuration EOF ;
    public final EObject entryRuleRealTimeDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTimeDuration = null;


        try {
            // InternalEel.g:1231:57: (iv_ruleRealTimeDuration= ruleRealTimeDuration EOF )
            // InternalEel.g:1232:2: iv_ruleRealTimeDuration= ruleRealTimeDuration EOF
            {
             newCompositeNode(grammarAccess.getRealTimeDurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealTimeDuration=ruleRealTimeDuration();

            state._fsp--;

             current =iv_ruleRealTimeDuration; 
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
    // $ANTLR end "entryRuleRealTimeDuration"


    // $ANTLR start "ruleRealTimeDuration"
    // InternalEel.g:1238:1: ruleRealTimeDuration returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.absoluteTime' ) ;
    public final EObject ruleRealTimeDuration() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;



        	enterRule();

        try {
            // InternalEel.g:1244:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.absoluteTime' ) )
            // InternalEel.g:1245:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.absoluteTime' )
            {
            // InternalEel.g:1245:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.absoluteTime' )
            // InternalEel.g:1246:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.absoluteTime'
            {
            // InternalEel.g:1246:3: ()
            // InternalEel.g:1247:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealTimeDurationAccess().getRealTimeDurationAction_0(),
            					current);
            			

            }

            // InternalEel.g:1253:3: ( (lv_post_1_0= 'post' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalEel.g:1254:4: (lv_post_1_0= 'post' )
                    {
                    // InternalEel.g:1254:4: (lv_post_1_0= 'post' )
                    // InternalEel.g:1255:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,21,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getRealTimeDurationAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRealTimeDurationRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:1267:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalEel.g:1268:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalEel.g:1268:4: (lv_targetClass_2_0= ruleEString )
            // InternalEel.g:1269:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRealTimeDurationAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRealTimeDurationRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1286:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEel.g:1287:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRealTimeDurationAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalEel.g:1291:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalEel.g:1292:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalEel.g:1292:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalEel.g:1293:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRealTimeDurationAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRealTimeDurationRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRealTimeDurationAccess().getAbsoluteTimeKeyword_4());
            		

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
    // $ANTLR end "ruleRealTimeDuration"


    // $ANTLR start "entryRuleMeasureUnboundSumOperation"
    // InternalEel.g:1319:1: entryRuleMeasureUnboundSumOperation returns [EObject current=null] : iv_ruleMeasureUnboundSumOperation= ruleMeasureUnboundSumOperation EOF ;
    public final EObject entryRuleMeasureUnboundSumOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureUnboundSumOperation = null;


        try {
            // InternalEel.g:1319:67: (iv_ruleMeasureUnboundSumOperation= ruleMeasureUnboundSumOperation EOF )
            // InternalEel.g:1320:2: iv_ruleMeasureUnboundSumOperation= ruleMeasureUnboundSumOperation EOF
            {
             newCompositeNode(grammarAccess.getMeasureUnboundSumOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureUnboundSumOperation=ruleMeasureUnboundSumOperation();

            state._fsp--;

             current =iv_ruleMeasureUnboundSumOperation; 
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
    // $ANTLR end "entryRuleMeasureUnboundSumOperation"


    // $ANTLR start "ruleMeasureUnboundSumOperation"
    // InternalEel.g:1326:1: ruleMeasureUnboundSumOperation returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '+' ( ( ruleEString ) ) )+ ) ;
    public final EObject ruleMeasureUnboundSumOperation() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        Enumerator lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_subname_7_0 = null;



        	enterRule();

        try {
            // InternalEel.g:1332:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '+' ( ( ruleEString ) ) )+ ) )
            // InternalEel.g:1333:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '+' ( ( ruleEString ) ) )+ )
            {
            // InternalEel.g:1333:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '+' ( ( ruleEString ) ) )+ )
            // InternalEel.g:1334:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '+' ( ( ruleEString ) ) )+
            {
            // InternalEel.g:1334:3: ()
            // InternalEel.g:1335:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureUnboundSumOperationAccess().getMeasureUnboundSumOperationAction_0(),
            					current);
            			

            }

            // InternalEel.g:1341:3: ( (lv_post_1_0= 'post' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalEel.g:1342:4: (lv_post_1_0= 'post' )
                    {
                    // InternalEel.g:1342:4: (lv_post_1_0= 'post' )
                    // InternalEel.g:1343:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,21,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getMeasureUnboundSumOperationAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeasureUnboundSumOperationRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:1355:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalEel.g:1356:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalEel.g:1356:4: (lv_targetClass_2_0= ruleEString )
            // InternalEel.g:1357:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureUnboundSumOperationAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureUnboundSumOperationRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1374:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalEel.g:1375:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureUnboundSumOperationAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalEel.g:1379:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalEel.g:1380:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalEel.g:1380:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalEel.g:1381:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundSumOperationAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundSumOperationRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureUnboundSumOperationAccess().getFullStopKeyword_4());
            		
            // InternalEel.g:1403:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=111 && LA27_0<=117)) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalEel.g:1404:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalEel.g:1404:4: ( (lv_type_6_0= ruleType ) )
                    // InternalEel.g:1405:5: (lv_type_6_0= ruleType )
                    {
                    // InternalEel.g:1405:5: (lv_type_6_0= ruleType )
                    // InternalEel.g:1406:6: lv_type_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundSumOperationAccess().getTypeTypeEnumRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_type_6_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundSumOperationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:1424:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalEel.g:1424:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalEel.g:1425:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalEel.g:1425:5: (lv_subname_7_0= ruleEString )
                    // InternalEel.g:1426:6: lv_subname_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundSumOperationAccess().getSubnameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_subname_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundSumOperationRule());
                    						}
                    						set(
                    							current,
                    							"subname",
                    							lv_subname_7_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureUnboundSumOperationAccess().getEqualsSignKeyword_6());
            		
            // InternalEel.g:1448:3: ( ( ruleEString ) )
            // InternalEel.g:1449:4: ( ruleEString )
            {
            // InternalEel.g:1449:4: ( ruleEString )
            // InternalEel.g:1450:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureUnboundSumOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureUnboundSumOperationAccess().getMeasuresMeasureCrossReference_7_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1464:3: (otherlv_10= '+' ( ( ruleEString ) ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==28) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalEel.g:1465:4: otherlv_10= '+' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,28,FOLLOW_3); 

            	    				newLeafNode(otherlv_10, grammarAccess.getMeasureUnboundSumOperationAccess().getPlusSignKeyword_8_0());
            	    			
            	    // InternalEel.g:1469:4: ( ( ruleEString ) )
            	    // InternalEel.g:1470:5: ( ruleEString )
            	    {
            	    // InternalEel.g:1470:5: ( ruleEString )
            	    // InternalEel.g:1471:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMeasureUnboundSumOperationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getMeasureUnboundSumOperationAccess().getMeasuresMeasureCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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
    // $ANTLR end "ruleMeasureUnboundSumOperation"


    // $ANTLR start "entryRuleMeasureUnboundSubstractOperation"
    // InternalEel.g:1490:1: entryRuleMeasureUnboundSubstractOperation returns [EObject current=null] : iv_ruleMeasureUnboundSubstractOperation= ruleMeasureUnboundSubstractOperation EOF ;
    public final EObject entryRuleMeasureUnboundSubstractOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureUnboundSubstractOperation = null;


        try {
            // InternalEel.g:1490:73: (iv_ruleMeasureUnboundSubstractOperation= ruleMeasureUnboundSubstractOperation EOF )
            // InternalEel.g:1491:2: iv_ruleMeasureUnboundSubstractOperation= ruleMeasureUnboundSubstractOperation EOF
            {
             newCompositeNode(grammarAccess.getMeasureUnboundSubstractOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureUnboundSubstractOperation=ruleMeasureUnboundSubstractOperation();

            state._fsp--;

             current =iv_ruleMeasureUnboundSubstractOperation; 
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
    // $ANTLR end "entryRuleMeasureUnboundSubstractOperation"


    // $ANTLR start "ruleMeasureUnboundSubstractOperation"
    // InternalEel.g:1497:1: ruleMeasureUnboundSubstractOperation returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '-' ( ( ruleEString ) ) )+ ) ;
    public final EObject ruleMeasureUnboundSubstractOperation() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        Enumerator lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_subname_7_0 = null;



        	enterRule();

        try {
            // InternalEel.g:1503:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '-' ( ( ruleEString ) ) )+ ) )
            // InternalEel.g:1504:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '-' ( ( ruleEString ) ) )+ )
            {
            // InternalEel.g:1504:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '-' ( ( ruleEString ) ) )+ )
            // InternalEel.g:1505:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '-' ( ( ruleEString ) ) )+
            {
            // InternalEel.g:1505:3: ()
            // InternalEel.g:1506:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureUnboundSubstractOperationAccess().getMeasureUnboundSubstractOperationAction_0(),
            					current);
            			

            }

            // InternalEel.g:1512:3: ( (lv_post_1_0= 'post' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==21) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalEel.g:1513:4: (lv_post_1_0= 'post' )
                    {
                    // InternalEel.g:1513:4: (lv_post_1_0= 'post' )
                    // InternalEel.g:1514:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,21,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getMeasureUnboundSubstractOperationAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeasureUnboundSubstractOperationRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:1526:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalEel.g:1527:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalEel.g:1527:4: (lv_targetClass_2_0= ruleEString )
            // InternalEel.g:1528:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureUnboundSubstractOperationAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureUnboundSubstractOperationRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1545:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==22) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalEel.g:1546:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureUnboundSubstractOperationAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalEel.g:1550:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalEel.g:1551:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalEel.g:1551:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalEel.g:1552:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundSubstractOperationAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundSubstractOperationRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureUnboundSubstractOperationAccess().getFullStopKeyword_4());
            		
            // InternalEel.g:1574:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=111 && LA31_0<=117)) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_ID)) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalEel.g:1575:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalEel.g:1575:4: ( (lv_type_6_0= ruleType ) )
                    // InternalEel.g:1576:5: (lv_type_6_0= ruleType )
                    {
                    // InternalEel.g:1576:5: (lv_type_6_0= ruleType )
                    // InternalEel.g:1577:6: lv_type_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundSubstractOperationAccess().getTypeTypeEnumRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_type_6_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundSubstractOperationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:1595:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalEel.g:1595:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalEel.g:1596:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalEel.g:1596:5: (lv_subname_7_0= ruleEString )
                    // InternalEel.g:1597:6: lv_subname_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundSubstractOperationAccess().getSubnameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_subname_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundSubstractOperationRule());
                    						}
                    						set(
                    							current,
                    							"subname",
                    							lv_subname_7_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureUnboundSubstractOperationAccess().getEqualsSignKeyword_6());
            		
            // InternalEel.g:1619:3: ( ( ruleEString ) )
            // InternalEel.g:1620:4: ( ruleEString )
            {
            // InternalEel.g:1620:4: ( ruleEString )
            // InternalEel.g:1621:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureUnboundSubstractOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureUnboundSubstractOperationAccess().getMeasuresMeasureCrossReference_7_0());
            				
            pushFollow(FOLLOW_29);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1635:3: (otherlv_10= '-' ( ( ruleEString ) ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==29) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalEel.g:1636:4: otherlv_10= '-' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,29,FOLLOW_3); 

            	    				newLeafNode(otherlv_10, grammarAccess.getMeasureUnboundSubstractOperationAccess().getHyphenMinusKeyword_8_0());
            	    			
            	    // InternalEel.g:1640:4: ( ( ruleEString ) )
            	    // InternalEel.g:1641:5: ( ruleEString )
            	    {
            	    // InternalEel.g:1641:5: ( ruleEString )
            	    // InternalEel.g:1642:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMeasureUnboundSubstractOperationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getMeasureUnboundSubstractOperationAccess().getMeasuresMeasureCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
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
    // $ANTLR end "ruleMeasureUnboundSubstractOperation"


    // $ANTLR start "entryRuleMeasureUnboundProductOperation"
    // InternalEel.g:1661:1: entryRuleMeasureUnboundProductOperation returns [EObject current=null] : iv_ruleMeasureUnboundProductOperation= ruleMeasureUnboundProductOperation EOF ;
    public final EObject entryRuleMeasureUnboundProductOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureUnboundProductOperation = null;


        try {
            // InternalEel.g:1661:71: (iv_ruleMeasureUnboundProductOperation= ruleMeasureUnboundProductOperation EOF )
            // InternalEel.g:1662:2: iv_ruleMeasureUnboundProductOperation= ruleMeasureUnboundProductOperation EOF
            {
             newCompositeNode(grammarAccess.getMeasureUnboundProductOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureUnboundProductOperation=ruleMeasureUnboundProductOperation();

            state._fsp--;

             current =iv_ruleMeasureUnboundProductOperation; 
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
    // $ANTLR end "entryRuleMeasureUnboundProductOperation"


    // $ANTLR start "ruleMeasureUnboundProductOperation"
    // InternalEel.g:1668:1: ruleMeasureUnboundProductOperation returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '*' ( ( ruleEString ) ) )+ ) ;
    public final EObject ruleMeasureUnboundProductOperation() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        Enumerator lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_subname_7_0 = null;



        	enterRule();

        try {
            // InternalEel.g:1674:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '*' ( ( ruleEString ) ) )+ ) )
            // InternalEel.g:1675:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '*' ( ( ruleEString ) ) )+ )
            {
            // InternalEel.g:1675:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '*' ( ( ruleEString ) ) )+ )
            // InternalEel.g:1676:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '*' ( ( ruleEString ) ) )+
            {
            // InternalEel.g:1676:3: ()
            // InternalEel.g:1677:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureUnboundProductOperationAccess().getMeasureUnboundProductOperationAction_0(),
            					current);
            			

            }

            // InternalEel.g:1683:3: ( (lv_post_1_0= 'post' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==21) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalEel.g:1684:4: (lv_post_1_0= 'post' )
                    {
                    // InternalEel.g:1684:4: (lv_post_1_0= 'post' )
                    // InternalEel.g:1685:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,21,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getMeasureUnboundProductOperationAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeasureUnboundProductOperationRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:1697:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalEel.g:1698:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalEel.g:1698:4: (lv_targetClass_2_0= ruleEString )
            // InternalEel.g:1699:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureUnboundProductOperationAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureUnboundProductOperationRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1716:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==22) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalEel.g:1717:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureUnboundProductOperationAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalEel.g:1721:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalEel.g:1722:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalEel.g:1722:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalEel.g:1723:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundProductOperationAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundProductOperationRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureUnboundProductOperationAccess().getFullStopKeyword_4());
            		
            // InternalEel.g:1745:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=111 && LA35_0<=117)) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_ID)) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalEel.g:1746:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalEel.g:1746:4: ( (lv_type_6_0= ruleType ) )
                    // InternalEel.g:1747:5: (lv_type_6_0= ruleType )
                    {
                    // InternalEel.g:1747:5: (lv_type_6_0= ruleType )
                    // InternalEel.g:1748:6: lv_type_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundProductOperationAccess().getTypeTypeEnumRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_type_6_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundProductOperationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:1766:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalEel.g:1766:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalEel.g:1767:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalEel.g:1767:5: (lv_subname_7_0= ruleEString )
                    // InternalEel.g:1768:6: lv_subname_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundProductOperationAccess().getSubnameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_subname_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundProductOperationRule());
                    						}
                    						set(
                    							current,
                    							"subname",
                    							lv_subname_7_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureUnboundProductOperationAccess().getEqualsSignKeyword_6());
            		
            // InternalEel.g:1790:3: ( ( ruleEString ) )
            // InternalEel.g:1791:4: ( ruleEString )
            {
            // InternalEel.g:1791:4: ( ruleEString )
            // InternalEel.g:1792:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureUnboundProductOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureUnboundProductOperationAccess().getMeasuresMeasureCrossReference_7_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1806:3: (otherlv_10= '*' ( ( ruleEString ) ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==30) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalEel.g:1807:4: otherlv_10= '*' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,30,FOLLOW_3); 

            	    				newLeafNode(otherlv_10, grammarAccess.getMeasureUnboundProductOperationAccess().getAsteriskKeyword_8_0());
            	    			
            	    // InternalEel.g:1811:4: ( ( ruleEString ) )
            	    // InternalEel.g:1812:5: ( ruleEString )
            	    {
            	    // InternalEel.g:1812:5: ( ruleEString )
            	    // InternalEel.g:1813:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMeasureUnboundProductOperationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getMeasureUnboundProductOperationAccess().getMeasuresMeasureCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
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
    // $ANTLR end "ruleMeasureUnboundProductOperation"


    // $ANTLR start "entryRuleMeasureUnboundDivisionOperation"
    // InternalEel.g:1832:1: entryRuleMeasureUnboundDivisionOperation returns [EObject current=null] : iv_ruleMeasureUnboundDivisionOperation= ruleMeasureUnboundDivisionOperation EOF ;
    public final EObject entryRuleMeasureUnboundDivisionOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureUnboundDivisionOperation = null;


        try {
            // InternalEel.g:1832:72: (iv_ruleMeasureUnboundDivisionOperation= ruleMeasureUnboundDivisionOperation EOF )
            // InternalEel.g:1833:2: iv_ruleMeasureUnboundDivisionOperation= ruleMeasureUnboundDivisionOperation EOF
            {
             newCompositeNode(grammarAccess.getMeasureUnboundDivisionOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureUnboundDivisionOperation=ruleMeasureUnboundDivisionOperation();

            state._fsp--;

             current =iv_ruleMeasureUnboundDivisionOperation; 
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
    // $ANTLR end "entryRuleMeasureUnboundDivisionOperation"


    // $ANTLR start "ruleMeasureUnboundDivisionOperation"
    // InternalEel.g:1839:1: ruleMeasureUnboundDivisionOperation returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '/' ( ( ruleEString ) ) )+ ) ;
    public final EObject ruleMeasureUnboundDivisionOperation() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        Enumerator lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_subname_7_0 = null;



        	enterRule();

        try {
            // InternalEel.g:1845:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '/' ( ( ruleEString ) ) )+ ) )
            // InternalEel.g:1846:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '/' ( ( ruleEString ) ) )+ )
            {
            // InternalEel.g:1846:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '/' ( ( ruleEString ) ) )+ )
            // InternalEel.g:1847:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '/' ( ( ruleEString ) ) )+
            {
            // InternalEel.g:1847:3: ()
            // InternalEel.g:1848:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureUnboundDivisionOperationAccess().getMeasureUnboundDivisionOperationAction_0(),
            					current);
            			

            }

            // InternalEel.g:1854:3: ( (lv_post_1_0= 'post' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==21) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalEel.g:1855:4: (lv_post_1_0= 'post' )
                    {
                    // InternalEel.g:1855:4: (lv_post_1_0= 'post' )
                    // InternalEel.g:1856:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,21,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getMeasureUnboundDivisionOperationAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeasureUnboundDivisionOperationRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:1868:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalEel.g:1869:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalEel.g:1869:4: (lv_targetClass_2_0= ruleEString )
            // InternalEel.g:1870:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureUnboundDivisionOperationAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureUnboundDivisionOperationRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1887:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==22) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalEel.g:1888:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureUnboundDivisionOperationAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalEel.g:1892:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalEel.g:1893:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalEel.g:1893:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalEel.g:1894:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundDivisionOperationAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundDivisionOperationRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureUnboundDivisionOperationAccess().getFullStopKeyword_4());
            		
            // InternalEel.g:1916:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=111 && LA39_0<=117)) ) {
                alt39=1;
            }
            else if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_ID)) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalEel.g:1917:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalEel.g:1917:4: ( (lv_type_6_0= ruleType ) )
                    // InternalEel.g:1918:5: (lv_type_6_0= ruleType )
                    {
                    // InternalEel.g:1918:5: (lv_type_6_0= ruleType )
                    // InternalEel.g:1919:6: lv_type_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundDivisionOperationAccess().getTypeTypeEnumRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_type_6_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundDivisionOperationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:1937:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalEel.g:1937:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalEel.g:1938:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalEel.g:1938:5: (lv_subname_7_0= ruleEString )
                    // InternalEel.g:1939:6: lv_subname_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundDivisionOperationAccess().getSubnameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_subname_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundDivisionOperationRule());
                    						}
                    						set(
                    							current,
                    							"subname",
                    							lv_subname_7_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureUnboundDivisionOperationAccess().getEqualsSignKeyword_6());
            		
            // InternalEel.g:1961:3: ( ( ruleEString ) )
            // InternalEel.g:1962:4: ( ruleEString )
            {
            // InternalEel.g:1962:4: ( ruleEString )
            // InternalEel.g:1963:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureUnboundDivisionOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureUnboundDivisionOperationAccess().getMeasuresMeasureCrossReference_7_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1977:3: (otherlv_10= '/' ( ( ruleEString ) ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==31) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalEel.g:1978:4: otherlv_10= '/' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,31,FOLLOW_3); 

            	    				newLeafNode(otherlv_10, grammarAccess.getMeasureUnboundDivisionOperationAccess().getSolidusKeyword_8_0());
            	    			
            	    // InternalEel.g:1982:4: ( ( ruleEString ) )
            	    // InternalEel.g:1983:5: ( ruleEString )
            	    {
            	    // InternalEel.g:1983:5: ( ruleEString )
            	    // InternalEel.g:1984:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMeasureUnboundDivisionOperationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getMeasureUnboundDivisionOperationAccess().getMeasuresMeasureCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    ruleEString();

            	    state._fsp--;


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
    // $ANTLR end "ruleMeasureUnboundDivisionOperation"


    // $ANTLR start "entryRuleExponentialMeasure"
    // InternalEel.g:2003:1: entryRuleExponentialMeasure returns [EObject current=null] : iv_ruleExponentialMeasure= ruleExponentialMeasure EOF ;
    public final EObject entryRuleExponentialMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialMeasure = null;


        try {
            // InternalEel.g:2003:59: (iv_ruleExponentialMeasure= ruleExponentialMeasure EOF )
            // InternalEel.g:2004:2: iv_ruleExponentialMeasure= ruleExponentialMeasure EOF
            {
             newCompositeNode(grammarAccess.getExponentialMeasureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExponentialMeasure=ruleExponentialMeasure();

            state._fsp--;

             current =iv_ruleExponentialMeasure; 
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
    // $ANTLR end "entryRuleExponentialMeasure"


    // $ANTLR start "ruleExponentialMeasure"
    // InternalEel.g:2010:1: ruleExponentialMeasure returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'exp' ( ( ruleEString ) ) ) ;
    public final EObject ruleExponentialMeasure() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        Enumerator lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_subname_7_0 = null;



        	enterRule();

        try {
            // InternalEel.g:2016:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'exp' ( ( ruleEString ) ) ) )
            // InternalEel.g:2017:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'exp' ( ( ruleEString ) ) )
            {
            // InternalEel.g:2017:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'exp' ( ( ruleEString ) ) )
            // InternalEel.g:2018:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'exp' ( ( ruleEString ) )
            {
            // InternalEel.g:2018:3: ()
            // InternalEel.g:2019:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExponentialMeasureAccess().getExponentialMeasureAction_0(),
            					current);
            			

            }

            // InternalEel.g:2025:3: ( (lv_post_1_0= 'post' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==21) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalEel.g:2026:4: (lv_post_1_0= 'post' )
                    {
                    // InternalEel.g:2026:4: (lv_post_1_0= 'post' )
                    // InternalEel.g:2027:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,21,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getExponentialMeasureAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExponentialMeasureRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:2039:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalEel.g:2040:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalEel.g:2040:4: (lv_targetClass_2_0= ruleEString )
            // InternalEel.g:2041:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExponentialMeasureAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExponentialMeasureRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:2058:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==22) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalEel.g:2059:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getExponentialMeasureAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalEel.g:2063:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalEel.g:2064:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalEel.g:2064:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalEel.g:2065:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExponentialMeasureAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExponentialMeasureRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getExponentialMeasureAccess().getFullStopKeyword_4());
            		
            // InternalEel.g:2087:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=111 && LA43_0<=117)) ) {
                alt43=1;
            }
            else if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_ID)) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalEel.g:2088:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalEel.g:2088:4: ( (lv_type_6_0= ruleType ) )
                    // InternalEel.g:2089:5: (lv_type_6_0= ruleType )
                    {
                    // InternalEel.g:2089:5: (lv_type_6_0= ruleType )
                    // InternalEel.g:2090:6: lv_type_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getExponentialMeasureAccess().getTypeTypeEnumRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_type_6_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExponentialMeasureRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:2108:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalEel.g:2108:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalEel.g:2109:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalEel.g:2109:5: (lv_subname_7_0= ruleEString )
                    // InternalEel.g:2110:6: lv_subname_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExponentialMeasureAccess().getSubnameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_subname_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExponentialMeasureRule());
                    						}
                    						set(
                    							current,
                    							"subname",
                    							lv_subname_7_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_35); 

            			newLeafNode(otherlv_8, grammarAccess.getExponentialMeasureAccess().getEqualsSignKeyword_6());
            		
            otherlv_9=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getExponentialMeasureAccess().getExpKeyword_7());
            		
            // InternalEel.g:2136:3: ( ( ruleEString ) )
            // InternalEel.g:2137:4: ( ruleEString )
            {
            // InternalEel.g:2137:4: ( ruleEString )
            // InternalEel.g:2138:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExponentialMeasureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExponentialMeasureAccess().getXMeasureCrossReference_8_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleExponentialMeasure"


    // $ANTLR start "entryRuleLogisticMeasure"
    // InternalEel.g:2156:1: entryRuleLogisticMeasure returns [EObject current=null] : iv_ruleLogisticMeasure= ruleLogisticMeasure EOF ;
    public final EObject entryRuleLogisticMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogisticMeasure = null;


        try {
            // InternalEel.g:2156:56: (iv_ruleLogisticMeasure= ruleLogisticMeasure EOF )
            // InternalEel.g:2157:2: iv_ruleLogisticMeasure= ruleLogisticMeasure EOF
            {
             newCompositeNode(grammarAccess.getLogisticMeasureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogisticMeasure=ruleLogisticMeasure();

            state._fsp--;

             current =iv_ruleLogisticMeasure; 
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
    // $ANTLR end "entryRuleLogisticMeasure"


    // $ANTLR start "ruleLogisticMeasure"
    // InternalEel.g:2163:1: ruleLogisticMeasure returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'logistic' ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ) ;
    public final EObject ruleLogisticMeasure() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        Enumerator lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_subname_7_0 = null;



        	enterRule();

        try {
            // InternalEel.g:2169:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'logistic' ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ) )
            // InternalEel.g:2170:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'logistic' ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) )
            {
            // InternalEel.g:2170:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'logistic' ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) )
            // InternalEel.g:2171:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'logistic' ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) )
            {
            // InternalEel.g:2171:3: ()
            // InternalEel.g:2172:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLogisticMeasureAccess().getLogisticMeasureAction_0(),
            					current);
            			

            }

            // InternalEel.g:2178:3: ( (lv_post_1_0= 'post' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==21) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalEel.g:2179:4: (lv_post_1_0= 'post' )
                    {
                    // InternalEel.g:2179:4: (lv_post_1_0= 'post' )
                    // InternalEel.g:2180:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,21,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getLogisticMeasureAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogisticMeasureRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:2192:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalEel.g:2193:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalEel.g:2193:4: (lv_targetClass_2_0= ruleEString )
            // InternalEel.g:2194:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLogisticMeasureAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogisticMeasureRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:2211:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==22) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalEel.g:2212:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogisticMeasureAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalEel.g:2216:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalEel.g:2217:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalEel.g:2217:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalEel.g:2218:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLogisticMeasureAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogisticMeasureRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getLogisticMeasureAccess().getFullStopKeyword_4());
            		
            // InternalEel.g:2240:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=111 && LA46_0<=117)) ) {
                alt46=1;
            }
            else if ( ((LA46_0>=RULE_STRING && LA46_0<=RULE_ID)) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalEel.g:2241:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalEel.g:2241:4: ( (lv_type_6_0= ruleType ) )
                    // InternalEel.g:2242:5: (lv_type_6_0= ruleType )
                    {
                    // InternalEel.g:2242:5: (lv_type_6_0= ruleType )
                    // InternalEel.g:2243:6: lv_type_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getLogisticMeasureAccess().getTypeTypeEnumRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_type_6_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogisticMeasureRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:2261:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalEel.g:2261:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalEel.g:2262:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalEel.g:2262:5: (lv_subname_7_0= ruleEString )
                    // InternalEel.g:2263:6: lv_subname_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLogisticMeasureAccess().getSubnameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_subname_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogisticMeasureRule());
                    						}
                    						set(
                    							current,
                    							"subname",
                    							lv_subname_7_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_36); 

            			newLeafNode(otherlv_8, grammarAccess.getLogisticMeasureAccess().getEqualsSignKeyword_6());
            		
            otherlv_9=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getLogisticMeasureAccess().getLogisticKeyword_7());
            		
            // InternalEel.g:2289:3: ( ( ruleEString ) )
            // InternalEel.g:2290:4: ( ruleEString )
            {
            // InternalEel.g:2290:4: ( ruleEString )
            // InternalEel.g:2291:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogisticMeasureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogisticMeasureAccess().getLMeasureCrossReference_8_0());
            				
            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:2305:3: ( ( ruleEString ) )
            // InternalEel.g:2306:4: ( ruleEString )
            {
            // InternalEel.g:2306:4: ( ruleEString )
            // InternalEel.g:2307:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogisticMeasureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogisticMeasureAccess().getKMeasureCrossReference_9_0());
            				
            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:2321:3: ( ( ruleEString ) )
            // InternalEel.g:2322:4: ( ruleEString )
            {
            // InternalEel.g:2322:4: ( ruleEString )
            // InternalEel.g:2323:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogisticMeasureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogisticMeasureAccess().getX0MeasureCrossReference_10_0());
            				
            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:2337:3: ( ( ruleEString ) )
            // InternalEel.g:2338:4: ( ruleEString )
            {
            // InternalEel.g:2338:4: ( ruleEString )
            // InternalEel.g:2339:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogisticMeasureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogisticMeasureAccess().getXMeasureCrossReference_11_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleLogisticMeasure"


    // $ANTLR start "entryRuleIntegrationMeasure"
    // InternalEel.g:2357:1: entryRuleIntegrationMeasure returns [EObject current=null] : iv_ruleIntegrationMeasure= ruleIntegrationMeasure EOF ;
    public final EObject entryRuleIntegrationMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegrationMeasure = null;


        try {
            // InternalEel.g:2357:59: (iv_ruleIntegrationMeasure= ruleIntegrationMeasure EOF )
            // InternalEel.g:2358:2: iv_ruleIntegrationMeasure= ruleIntegrationMeasure EOF
            {
             newCompositeNode(grammarAccess.getIntegrationMeasureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegrationMeasure=ruleIntegrationMeasure();

            state._fsp--;

             current =iv_ruleIntegrationMeasure; 
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
    // $ANTLR end "entryRuleIntegrationMeasure"


    // $ANTLR start "ruleIntegrationMeasure"
    // InternalEel.g:2364:1: ruleIntegrationMeasure returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'integral' ( ( ruleEString ) ) otherlv_11= '[' ( ( ruleEString ) ) otherlv_13= ';' ( ( ruleEString ) ) otherlv_15= ']' ) ;
    public final EObject ruleIntegrationMeasure() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        Enumerator lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_subname_7_0 = null;



        	enterRule();

        try {
            // InternalEel.g:2370:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'integral' ( ( ruleEString ) ) otherlv_11= '[' ( ( ruleEString ) ) otherlv_13= ';' ( ( ruleEString ) ) otherlv_15= ']' ) )
            // InternalEel.g:2371:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'integral' ( ( ruleEString ) ) otherlv_11= '[' ( ( ruleEString ) ) otherlv_13= ';' ( ( ruleEString ) ) otherlv_15= ']' )
            {
            // InternalEel.g:2371:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'integral' ( ( ruleEString ) ) otherlv_11= '[' ( ( ruleEString ) ) otherlv_13= ';' ( ( ruleEString ) ) otherlv_15= ']' )
            // InternalEel.g:2372:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'integral' ( ( ruleEString ) ) otherlv_11= '[' ( ( ruleEString ) ) otherlv_13= ';' ( ( ruleEString ) ) otherlv_15= ']'
            {
            // InternalEel.g:2372:3: ()
            // InternalEel.g:2373:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegrationMeasureAccess().getIntegrationMeasureAction_0(),
            					current);
            			

            }

            // InternalEel.g:2379:3: ( (lv_post_1_0= 'post' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==21) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalEel.g:2380:4: (lv_post_1_0= 'post' )
                    {
                    // InternalEel.g:2380:4: (lv_post_1_0= 'post' )
                    // InternalEel.g:2381:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,21,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getIntegrationMeasureAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIntegrationMeasureRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:2393:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalEel.g:2394:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalEel.g:2394:4: (lv_targetClass_2_0= ruleEString )
            // InternalEel.g:2395:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntegrationMeasureAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegrationMeasureRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:2412:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==22) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalEel.g:2413:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntegrationMeasureAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalEel.g:2417:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalEel.g:2418:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalEel.g:2418:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalEel.g:2419:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIntegrationMeasureAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegrationMeasureRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getIntegrationMeasureAccess().getFullStopKeyword_4());
            		
            // InternalEel.g:2441:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=111 && LA49_0<=117)) ) {
                alt49=1;
            }
            else if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_ID)) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalEel.g:2442:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalEel.g:2442:4: ( (lv_type_6_0= ruleType ) )
                    // InternalEel.g:2443:5: (lv_type_6_0= ruleType )
                    {
                    // InternalEel.g:2443:5: (lv_type_6_0= ruleType )
                    // InternalEel.g:2444:6: lv_type_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getIntegrationMeasureAccess().getTypeTypeEnumRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_type_6_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegrationMeasureRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:2462:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalEel.g:2462:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalEel.g:2463:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalEel.g:2463:5: (lv_subname_7_0= ruleEString )
                    // InternalEel.g:2464:6: lv_subname_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIntegrationMeasureAccess().getSubnameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_subname_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegrationMeasureRule());
                    						}
                    						set(
                    							current,
                    							"subname",
                    							lv_subname_7_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_37); 

            			newLeafNode(otherlv_8, grammarAccess.getIntegrationMeasureAccess().getEqualsSignKeyword_6());
            		
            otherlv_9=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getIntegrationMeasureAccess().getIntegralKeyword_7());
            		
            // InternalEel.g:2490:3: ( ( ruleEString ) )
            // InternalEel.g:2491:4: ( ruleEString )
            {
            // InternalEel.g:2491:4: ( ruleEString )
            // InternalEel.g:2492:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegrationMeasureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIntegrationMeasureAccess().getFunctionCompositeMeasureCrossReference_8_0());
            				
            pushFollow(FOLLOW_38);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getIntegrationMeasureAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalEel.g:2510:3: ( ( ruleEString ) )
            // InternalEel.g:2511:4: ( ruleEString )
            {
            // InternalEel.g:2511:4: ( ruleEString )
            // InternalEel.g:2512:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegrationMeasureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIntegrationMeasureAccess().getLeftBoundMeasureCrossReference_10_0());
            				
            pushFollow(FOLLOW_39);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getIntegrationMeasureAccess().getSemicolonKeyword_11());
            		
            // InternalEel.g:2530:3: ( ( ruleEString ) )
            // InternalEel.g:2531:4: ( ruleEString )
            {
            // InternalEel.g:2531:4: ( ruleEString )
            // InternalEel.g:2532:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegrationMeasureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIntegrationMeasureAccess().getRightBoundMeasureCrossReference_12_0());
            				
            pushFollow(FOLLOW_40);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getIntegrationMeasureAccess().getRightSquareBracketKeyword_13());
            		

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
    // $ANTLR end "ruleIntegrationMeasure"


    // $ANTLR start "entryRuleNormalDistribution"
    // InternalEel.g:2554:1: entryRuleNormalDistribution returns [EObject current=null] : iv_ruleNormalDistribution= ruleNormalDistribution EOF ;
    public final EObject entryRuleNormalDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalDistribution = null;


        try {
            // InternalEel.g:2554:59: (iv_ruleNormalDistribution= ruleNormalDistribution EOF )
            // InternalEel.g:2555:2: iv_ruleNormalDistribution= ruleNormalDistribution EOF
            {
             newCompositeNode(grammarAccess.getNormalDistributionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNormalDistribution=ruleNormalDistribution();

            state._fsp--;

             current =iv_ruleNormalDistribution; 
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
    // $ANTLR end "entryRuleNormalDistribution"


    // $ANTLR start "ruleNormalDistribution"
    // InternalEel.g:2561:1: ruleNormalDistribution returns [EObject current=null] : ( () otherlv_1= 'NormalDistribution' ) ;
    public final EObject ruleNormalDistribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEel.g:2567:2: ( ( () otherlv_1= 'NormalDistribution' ) )
            // InternalEel.g:2568:2: ( () otherlv_1= 'NormalDistribution' )
            {
            // InternalEel.g:2568:2: ( () otherlv_1= 'NormalDistribution' )
            // InternalEel.g:2569:3: () otherlv_1= 'NormalDistribution'
            {
            // InternalEel.g:2569:3: ()
            // InternalEel.g:2570:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNormalDistributionAccess().getNormalDistributionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNormalDistributionAccess().getNormalDistributionKeyword_1());
            		

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
    // $ANTLR end "ruleNormalDistribution"


    // $ANTLR start "entryRuleInterval"
    // InternalEel.g:2584:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalEel.g:2584:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalEel.g:2585:2: iv_ruleInterval= ruleInterval EOF
            {
             newCompositeNode(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterval=ruleInterval();

            state._fsp--;

             current =iv_ruleInterval; 
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
    // $ANTLR end "entryRuleInterval"


    // $ANTLR start "ruleInterval"
    // InternalEel.g:2591:1: ruleInterval returns [EObject current=null] : (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_lowerEndpoint_3_0 = null;

        EObject lv_upperEndpoint_5_0 = null;



        	enterRule();

        try {
            // InternalEel.g:2597:2: ( (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' ) )
            // InternalEel.g:2598:2: (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' )
            {
            // InternalEel.g:2598:2: (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' )
            // InternalEel.g:2599:3: otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIntervalAccess().getIntervalKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getIntervalAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getIntervalAccess().getLowerEndpointKeyword_2());
            		
            // InternalEel.g:2611:3: ( (lv_lowerEndpoint_3_0= ruleMeasure ) )
            // InternalEel.g:2612:4: (lv_lowerEndpoint_3_0= ruleMeasure )
            {
            // InternalEel.g:2612:4: (lv_lowerEndpoint_3_0= ruleMeasure )
            // InternalEel.g:2613:5: lv_lowerEndpoint_3_0= ruleMeasure
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getLowerEndpointMeasureParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_42);
            lv_lowerEndpoint_3_0=ruleMeasure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntervalRule());
            					}
            					set(
            						current,
            						"lowerEndpoint",
            						lv_lowerEndpoint_3_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.Measure");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getIntervalAccess().getUpperEndpointKeyword_4());
            		
            // InternalEel.g:2634:3: ( (lv_upperEndpoint_5_0= ruleMeasure ) )
            // InternalEel.g:2635:4: (lv_upperEndpoint_5_0= ruleMeasure )
            {
            // InternalEel.g:2635:4: (lv_upperEndpoint_5_0= ruleMeasure )
            // InternalEel.g:2636:5: lv_upperEndpoint_5_0= ruleMeasure
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getUpperEndpointMeasureParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_upperEndpoint_5_0=ruleMeasure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntervalRule());
            					}
            					set(
            						current,
            						"upperEndpoint",
            						lv_upperEndpoint_5_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.Measure");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getIntervalAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleInterval"


    // $ANTLR start "entryRuleSampling"
    // InternalEel.g:2661:1: entryRuleSampling returns [EObject current=null] : iv_ruleSampling= ruleSampling EOF ;
    public final EObject entryRuleSampling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSampling = null;


        try {
            // InternalEel.g:2661:49: (iv_ruleSampling= ruleSampling EOF )
            // InternalEel.g:2662:2: iv_ruleSampling= ruleSampling EOF
            {
             newCompositeNode(grammarAccess.getSamplingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSampling=ruleSampling();

            state._fsp--;

             current =iv_ruleSampling; 
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
    // $ANTLR end "entryRuleSampling"


    // $ANTLR start "ruleSampling"
    // InternalEel.g:2668:1: ruleSampling returns [EObject current=null] : ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleSampling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_measurementProcedure_4_0 = null;

        EObject lv_samples_7_0 = null;

        EObject lv_samples_9_0 = null;



        	enterRule();

        try {
            // InternalEel.g:2674:2: ( ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalEel.g:2675:2: ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalEel.g:2675:2: ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalEel.g:2676:3: () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalEel.g:2676:3: ()
            // InternalEel.g:2677:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSamplingAccess().getSamplingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSamplingAccess().getSamplingKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getSamplingAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:2691:3: (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==43) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalEel.g:2692:4: otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSamplingAccess().getMeasurementProcedureKeyword_3_0());
                    			
                    // InternalEel.g:2696:4: ( (lv_measurementProcedure_4_0= ruleEString ) )
                    // InternalEel.g:2697:5: (lv_measurementProcedure_4_0= ruleEString )
                    {
                    // InternalEel.g:2697:5: (lv_measurementProcedure_4_0= ruleEString )
                    // InternalEel.g:2698:6: lv_measurementProcedure_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSamplingAccess().getMeasurementProcedureEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_measurementProcedure_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSamplingRule());
                    						}
                    						set(
                    							current,
                    							"measurementProcedure",
                    							lv_measurementProcedure_4_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2716:3: (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==44) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalEel.g:2717:4: otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getSamplingAccess().getSamplesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_45); 

                    				newLeafNode(otherlv_6, grammarAccess.getSamplingAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalEel.g:2725:4: ( (lv_samples_7_0= ruleSample ) )
                    // InternalEel.g:2726:5: (lv_samples_7_0= ruleSample )
                    {
                    // InternalEel.g:2726:5: (lv_samples_7_0= ruleSample )
                    // InternalEel.g:2727:6: lv_samples_7_0= ruleSample
                    {

                    						newCompositeNode(grammarAccess.getSamplingAccess().getSamplesSampleParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_samples_7_0=ruleSample();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSamplingRule());
                    						}
                    						add(
                    							current,
                    							"samples",
                    							lv_samples_7_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.Sample");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:2744:4: (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==14) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalEel.g:2745:5: otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_45); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSamplingAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalEel.g:2749:5: ( (lv_samples_9_0= ruleSample ) )
                    	    // InternalEel.g:2750:6: (lv_samples_9_0= ruleSample )
                    	    {
                    	    // InternalEel.g:2750:6: (lv_samples_9_0= ruleSample )
                    	    // InternalEel.g:2751:7: lv_samples_9_0= ruleSample
                    	    {

                    	    							newCompositeNode(grammarAccess.getSamplingAccess().getSamplesSampleParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_samples_9_0=ruleSample();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSamplingRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"samples",
                    	    								lv_samples_9_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.Sample");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getSamplingAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSamplingAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSampling"


    // $ANTLR start "entryRuleIntegral"
    // InternalEel.g:2782:1: entryRuleIntegral returns [EObject current=null] : iv_ruleIntegral= ruleIntegral EOF ;
    public final EObject entryRuleIntegral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegral = null;


        try {
            // InternalEel.g:2782:49: (iv_ruleIntegral= ruleIntegral EOF )
            // InternalEel.g:2783:2: iv_ruleIntegral= ruleIntegral EOF
            {
             newCompositeNode(grammarAccess.getIntegralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegral=ruleIntegral();

            state._fsp--;

             current =iv_ruleIntegral; 
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
    // $ANTLR end "entryRuleIntegral"


    // $ANTLR start "ruleIntegral"
    // InternalEel.g:2789:1: ruleIntegral returns [EObject current=null] : (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleIntegral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_function_3_0 = null;



        	enterRule();

        try {
            // InternalEel.g:2795:2: ( (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalEel.g:2796:2: (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalEel.g:2796:2: (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalEel.g:2797:3: otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIntegralAccess().getIntegralKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegralAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalEel.g:2805:3: (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==46) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalEel.g:2806:4: otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getIntegralAccess().getFunctionKeyword_2_0());
                    			
                    // InternalEel.g:2810:4: ( (lv_function_3_0= ruleEString ) )
                    // InternalEel.g:2811:5: (lv_function_3_0= ruleEString )
                    {
                    // InternalEel.g:2811:5: (lv_function_3_0= ruleEString )
                    // InternalEel.g:2812:6: lv_function_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIntegralAccess().getFunctionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_function_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegralRule());
                    						}
                    						set(
                    							current,
                    							"function",
                    							lv_function_3_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getIntegralAccess().getIntervalKeyword_3());
            		
            // InternalEel.g:2834:3: ( ( ruleEString ) )
            // InternalEel.g:2835:4: ( ruleEString )
            {
            // InternalEel.g:2835:4: ( ruleEString )
            // InternalEel.g:2836:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegralRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIntegralAccess().getIntervalIntervalCrossReference_4_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getIntegralAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleIntegral"


    // $ANTLR start "entryRuleSample"
    // InternalEel.g:2858:1: entryRuleSample returns [EObject current=null] : iv_ruleSample= ruleSample EOF ;
    public final EObject entryRuleSample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSample = null;


        try {
            // InternalEel.g:2858:47: (iv_ruleSample= ruleSample EOF )
            // InternalEel.g:2859:2: iv_ruleSample= ruleSample EOF
            {
             newCompositeNode(grammarAccess.getSampleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSample=ruleSample();

            state._fsp--;

             current =iv_ruleSample; 
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
    // $ANTLR end "entryRuleSample"


    // $ANTLR start "ruleSample"
    // InternalEel.g:2865:1: ruleSample returns [EObject current=null] : ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleSample() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_quantity_5_0 = null;

        EObject lv_quantity_7_0 = null;



        	enterRule();

        try {
            // InternalEel.g:2871:2: ( ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalEel.g:2872:2: ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalEel.g:2872:2: ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalEel.g:2873:3: () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalEel.g:2873:3: ()
            // InternalEel.g:2874:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSampleAccess().getSampleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSampleAccess().getSampleKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getSampleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:2888:3: (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==49) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalEel.g:2889:4: otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSampleAccess().getQuantityKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getSampleAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalEel.g:2897:4: ( (lv_quantity_5_0= ruleMeasure ) )
                    // InternalEel.g:2898:5: (lv_quantity_5_0= ruleMeasure )
                    {
                    // InternalEel.g:2898:5: (lv_quantity_5_0= ruleMeasure )
                    // InternalEel.g:2899:6: lv_quantity_5_0= ruleMeasure
                    {

                    						newCompositeNode(grammarAccess.getSampleAccess().getQuantityMeasureParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_quantity_5_0=ruleMeasure();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSampleRule());
                    						}
                    						add(
                    							current,
                    							"quantity",
                    							lv_quantity_5_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.Measure");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:2916:4: (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==14) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalEel.g:2917:5: otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSampleAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalEel.g:2921:5: ( (lv_quantity_7_0= ruleMeasure ) )
                    	    // InternalEel.g:2922:6: (lv_quantity_7_0= ruleMeasure )
                    	    {
                    	    // InternalEel.g:2922:6: (lv_quantity_7_0= ruleMeasure )
                    	    // InternalEel.g:2923:7: lv_quantity_7_0= ruleMeasure
                    	    {

                    	    							newCompositeNode(grammarAccess.getSampleAccess().getQuantityMeasureParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_quantity_7_0=ruleMeasure();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSampleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"quantity",
                    	    								lv_quantity_7_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.Measure");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getSampleAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSampleAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSample"


    // $ANTLR start "entryRuleEStructuralFeature"
    // InternalEel.g:2954:1: entryRuleEStructuralFeature returns [EObject current=null] : iv_ruleEStructuralFeature= ruleEStructuralFeature EOF ;
    public final EObject entryRuleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStructuralFeature = null;


        try {
            // InternalEel.g:2954:59: (iv_ruleEStructuralFeature= ruleEStructuralFeature EOF )
            // InternalEel.g:2955:2: iv_ruleEStructuralFeature= ruleEStructuralFeature EOF
            {
             newCompositeNode(grammarAccess.getEStructuralFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEStructuralFeature=ruleEStructuralFeature();

            state._fsp--;

             current =iv_ruleEStructuralFeature; 
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
    // $ANTLR end "entryRuleEStructuralFeature"


    // $ANTLR start "ruleEStructuralFeature"
    // InternalEel.g:2961:1: ruleEStructuralFeature returns [EObject current=null] : (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) ;
    public final EObject ruleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject this_EAttribute_0 = null;

        EObject this_EReference_1 = null;



        	enterRule();

        try {
            // InternalEel.g:2967:2: ( (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) )
            // InternalEel.g:2968:2: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            {
            // InternalEel.g:2968:2: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            int alt56=2;
            switch ( input.LA(1) ) {
            case 91:
                {
                switch ( input.LA(2) ) {
                case 92:
                    {
                    switch ( input.LA(3) ) {
                    case 93:
                        {
                        switch ( input.LA(4) ) {
                        case 94:
                            {
                            int LA56_4 = input.LA(5);

                            if ( ((LA56_4>=99 && LA56_4<=100)) ) {
                                alt56=2;
                            }
                            else if ( ((LA56_4>=95 && LA56_4<=96)) ) {
                                alt56=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 56, 4, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 95:
                        case 96:
                            {
                            alt56=1;
                            }
                            break;
                        case 99:
                        case 100:
                            {
                            alt56=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 56, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 94:
                        {
                        int LA56_4 = input.LA(4);

                        if ( ((LA56_4>=99 && LA56_4<=100)) ) {
                            alt56=2;
                        }
                        else if ( ((LA56_4>=95 && LA56_4<=96)) ) {
                            alt56=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 56, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 95:
                    case 96:
                        {
                        alt56=1;
                        }
                        break;
                    case 99:
                    case 100:
                        {
                        alt56=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case 93:
                    {
                    switch ( input.LA(3) ) {
                    case 94:
                        {
                        int LA56_4 = input.LA(4);

                        if ( ((LA56_4>=99 && LA56_4<=100)) ) {
                            alt56=2;
                        }
                        else if ( ((LA56_4>=95 && LA56_4<=96)) ) {
                            alt56=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 56, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 95:
                    case 96:
                        {
                        alt56=1;
                        }
                        break;
                    case 99:
                    case 100:
                        {
                        alt56=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 94:
                    {
                    int LA56_4 = input.LA(3);

                    if ( ((LA56_4>=99 && LA56_4<=100)) ) {
                        alt56=2;
                    }
                    else if ( ((LA56_4>=95 && LA56_4<=96)) ) {
                        alt56=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 99:
                case 100:
                    {
                    alt56=2;
                    }
                    break;
                case 95:
                case 96:
                    {
                    alt56=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }

                }
                break;
            case 92:
                {
                switch ( input.LA(2) ) {
                case 93:
                    {
                    switch ( input.LA(3) ) {
                    case 94:
                        {
                        int LA56_4 = input.LA(4);

                        if ( ((LA56_4>=99 && LA56_4<=100)) ) {
                            alt56=2;
                        }
                        else if ( ((LA56_4>=95 && LA56_4<=96)) ) {
                            alt56=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 56, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 95:
                    case 96:
                        {
                        alt56=1;
                        }
                        break;
                    case 99:
                    case 100:
                        {
                        alt56=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 94:
                    {
                    int LA56_4 = input.LA(3);

                    if ( ((LA56_4>=99 && LA56_4<=100)) ) {
                        alt56=2;
                    }
                    else if ( ((LA56_4>=95 && LA56_4<=96)) ) {
                        alt56=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 95:
                case 96:
                    {
                    alt56=1;
                    }
                    break;
                case 99:
                case 100:
                    {
                    alt56=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 2, input);

                    throw nvae;
                }

                }
                break;
            case 93:
                {
                switch ( input.LA(2) ) {
                case 94:
                    {
                    int LA56_4 = input.LA(3);

                    if ( ((LA56_4>=99 && LA56_4<=100)) ) {
                        alt56=2;
                    }
                    else if ( ((LA56_4>=95 && LA56_4<=96)) ) {
                        alt56=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 95:
                case 96:
                    {
                    alt56=1;
                    }
                    break;
                case 99:
                case 100:
                    {
                    alt56=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 3, input);

                    throw nvae;
                }

                }
                break;
            case 94:
                {
                int LA56_4 = input.LA(2);

                if ( ((LA56_4>=99 && LA56_4<=100)) ) {
                    alt56=2;
                }
                else if ( ((LA56_4>=95 && LA56_4<=96)) ) {
                    alt56=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 4, input);

                    throw nvae;
                }
                }
                break;
            case 95:
            case 96:
                {
                alt56=1;
                }
                break;
            case 99:
            case 100:
                {
                alt56=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalEel.g:2969:3: this_EAttribute_0= ruleEAttribute
                    {

                    			newCompositeNode(grammarAccess.getEStructuralFeatureAccess().getEAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EAttribute_0=ruleEAttribute();

                    state._fsp--;


                    			current = this_EAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEel.g:2978:3: this_EReference_1= ruleEReference
                    {

                    			newCompositeNode(grammarAccess.getEStructuralFeatureAccess().getEReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EReference_1=ruleEReference();

                    state._fsp--;


                    			current = this_EReference_1;
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
    // $ANTLR end "ruleEStructuralFeature"


    // $ANTLR start "entryRuleEClass"
    // InternalEel.g:2990:1: entryRuleEClass returns [EObject current=null] : iv_ruleEClass= ruleEClass EOF ;
    public final EObject entryRuleEClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClass = null;


        try {
            // InternalEel.g:2990:47: (iv_ruleEClass= ruleEClass EOF )
            // InternalEel.g:2991:2: iv_ruleEClass= ruleEClass EOF
            {
             newCompositeNode(grammarAccess.getEClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEClass=ruleEClass();

            state._fsp--;

             current =iv_ruleEClass; 
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
    // $ANTLR end "entryRuleEClass"


    // $ANTLR start "ruleEClass"
    // InternalEel.g:2997:1: ruleEClass returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
    public final EObject ruleEClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token lv_interface_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_7_0 = null;

        AntlrDatatypeRuleToken lv_instanceTypeName_9_0 = null;

        EObject lv_eAnnotations_18_0 = null;

        EObject lv_eAnnotations_20_0 = null;

        EObject lv_eTypeParameters_24_0 = null;

        EObject lv_eTypeParameters_26_0 = null;

        EObject lv_eOperations_30_0 = null;

        EObject lv_eOperations_32_0 = null;

        EObject lv_eStructuralFeatures_36_0 = null;

        EObject lv_eStructuralFeatures_38_0 = null;

        EObject lv_eGenericSuperTypes_42_0 = null;

        EObject lv_eGenericSuperTypes_44_0 = null;



        	enterRule();

        try {
            // InternalEel.g:3003:2: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // InternalEel.g:3004:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // InternalEel.g:3004:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // InternalEel.g:3005:3: () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // InternalEel.g:3005:3: ()
            // InternalEel.g:3006:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEClassAccess().getEClassAction_0(),
            					current);
            			

            }

            // InternalEel.g:3012:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==50) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalEel.g:3013:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalEel.g:3013:4: (lv_abstract_1_0= 'abstract' )
                    // InternalEel.g:3014:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,50,FOLLOW_49); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getEClassAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:3026:3: ( (lv_interface_2_0= 'interface' ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==51) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalEel.g:3027:4: (lv_interface_2_0= 'interface' )
                    {
                    // InternalEel.g:3027:4: (lv_interface_2_0= 'interface' )
                    // InternalEel.g:3028:5: lv_interface_2_0= 'interface'
                    {
                    lv_interface_2_0=(Token)match(input,51,FOLLOW_50); 

                    					newLeafNode(lv_interface_2_0, grammarAccess.getEClassAccess().getInterfaceInterfaceKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEClassRule());
                    					}
                    					setWithLastConsumed(current, "interface", true, "interface");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getEClassAccess().getEClassKeyword_3());
            		
            // InternalEel.g:3044:3: ( (lv_name_4_0= ruleEString ) )
            // InternalEel.g:3045:4: (lv_name_4_0= ruleEString )
            {
            // InternalEel.g:3045:4: (lv_name_4_0= ruleEString )
            // InternalEel.g:3046:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEClassAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_5, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalEel.g:3067:3: (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==53) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalEel.g:3068:4: otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEClassAccess().getInstanceClassNameKeyword_6_0());
                    			
                    // InternalEel.g:3072:4: ( (lv_instanceClassName_7_0= ruleEString ) )
                    // InternalEel.g:3073:5: (lv_instanceClassName_7_0= ruleEString )
                    {
                    // InternalEel.g:3073:5: (lv_instanceClassName_7_0= ruleEString )
                    // InternalEel.g:3074:6: lv_instanceClassName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getInstanceClassNameEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_instanceClassName_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						set(
                    							current,
                    							"instanceClassName",
                    							lv_instanceClassName_7_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3092:3: (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==54) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalEel.g:3093:4: otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getEClassAccess().getInstanceTypeNameKeyword_7_0());
                    			
                    // InternalEel.g:3097:4: ( (lv_instanceTypeName_9_0= ruleEString ) )
                    // InternalEel.g:3098:5: (lv_instanceTypeName_9_0= ruleEString )
                    {
                    // InternalEel.g:3098:5: (lv_instanceTypeName_9_0= ruleEString )
                    // InternalEel.g:3099:6: lv_instanceTypeName_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getInstanceTypeNameEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_instanceTypeName_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						set(
                    							current,
                    							"instanceTypeName",
                    							lv_instanceTypeName_9_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3117:3: (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==55) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalEel.g:3118:4: otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,55,FOLLOW_54); 

                    				newLeafNode(otherlv_10, grammarAccess.getEClassAccess().getESuperTypesKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,56,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getEClassAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalEel.g:3126:4: ( ( ruleEString ) )
                    // InternalEel.g:3127:5: ( ruleEString )
                    {
                    // InternalEel.g:3127:5: ( ruleEString )
                    // InternalEel.g:3128:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_55);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3142:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==14) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalEel.g:3143:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEClassAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalEel.g:3147:5: ( ( ruleEString ) )
                    	    // InternalEel.g:3148:6: ( ruleEString )
                    	    {
                    	    // InternalEel.g:3148:6: ( ruleEString )
                    	    // InternalEel.g:3149:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_55);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,57,FOLLOW_56); 

                    				newLeafNode(otherlv_15, grammarAccess.getEClassAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3169:3: (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==58) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalEel.g:3170:4: otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,58,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEClassAccess().getEAnnotationsKeyword_9_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_17, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalEel.g:3178:4: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    // InternalEel.g:3179:5: (lv_eAnnotations_18_0= ruleEAnnotation )
                    {
                    // InternalEel.g:3179:5: (lv_eAnnotations_18_0= ruleEAnnotation )
                    // InternalEel.g:3180:6: lv_eAnnotations_18_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getEAnnotationsEAnnotationParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eAnnotations_18_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_18_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3197:4: (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==14) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalEel.g:3198:5: otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_57); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEClassAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalEel.g:3202:5: ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    // InternalEel.g:3203:6: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:3203:6: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    // InternalEel.g:3204:7: lv_eAnnotations_20_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getEAnnotationsEAnnotationParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_eAnnotations_20_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_20_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_58); 

                    				newLeafNode(otherlv_21, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3227:3: (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==59) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalEel.g:3228:4: otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,59,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getEClassAccess().getETypeParametersKeyword_10_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_59); 

                    				newLeafNode(otherlv_23, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalEel.g:3236:4: ( (lv_eTypeParameters_24_0= ruleETypeParameter ) )
                    // InternalEel.g:3237:5: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    {
                    // InternalEel.g:3237:5: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    // InternalEel.g:3238:6: lv_eTypeParameters_24_0= ruleETypeParameter
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getETypeParametersETypeParameterParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eTypeParameters_24_0=ruleETypeParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						add(
                    							current,
                    							"eTypeParameters",
                    							lv_eTypeParameters_24_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.ETypeParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3255:4: (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==14) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalEel.g:3256:5: otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_59); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getEClassAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalEel.g:3260:5: ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    // InternalEel.g:3261:6: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    {
                    	    // InternalEel.g:3261:6: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    // InternalEel.g:3262:7: lv_eTypeParameters_26_0= ruleETypeParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getETypeParametersETypeParameterParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_eTypeParameters_26_0=ruleETypeParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eTypeParameters",
                    	    								lv_eTypeParameters_26_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.ETypeParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_60); 

                    				newLeafNode(otherlv_27, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3285:3: (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==60) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalEel.g:3286:4: otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,60,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getEClassAccess().getEOperationsKeyword_11_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_61); 

                    				newLeafNode(otherlv_29, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalEel.g:3294:4: ( (lv_eOperations_30_0= ruleEOperation ) )
                    // InternalEel.g:3295:5: (lv_eOperations_30_0= ruleEOperation )
                    {
                    // InternalEel.g:3295:5: (lv_eOperations_30_0= ruleEOperation )
                    // InternalEel.g:3296:6: lv_eOperations_30_0= ruleEOperation
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getEOperationsEOperationParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eOperations_30_0=ruleEOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						add(
                    							current,
                    							"eOperations",
                    							lv_eOperations_30_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EOperation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3313:4: (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==14) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalEel.g:3314:5: otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    {
                    	    otherlv_31=(Token)match(input,14,FOLLOW_61); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getEClassAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalEel.g:3318:5: ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    // InternalEel.g:3319:6: (lv_eOperations_32_0= ruleEOperation )
                    	    {
                    	    // InternalEel.g:3319:6: (lv_eOperations_32_0= ruleEOperation )
                    	    // InternalEel.g:3320:7: lv_eOperations_32_0= ruleEOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getEOperationsEOperationParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_eOperations_32_0=ruleEOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eOperations",
                    	    								lv_eOperations_32_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.EOperation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,15,FOLLOW_62); 

                    				newLeafNode(otherlv_33, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3343:3: (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==61) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalEel.g:3344:4: otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,61,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getEClassAccess().getEStructuralFeaturesKeyword_12_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_63); 

                    				newLeafNode(otherlv_35, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalEel.g:3352:4: ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) )
                    // InternalEel.g:3353:5: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    {
                    // InternalEel.g:3353:5: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    // InternalEel.g:3354:6: lv_eStructuralFeatures_36_0= ruleEStructuralFeature
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getEStructuralFeaturesEStructuralFeatureParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eStructuralFeatures_36_0=ruleEStructuralFeature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						add(
                    							current,
                    							"eStructuralFeatures",
                    							lv_eStructuralFeatures_36_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EStructuralFeature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3371:4: (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==14) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalEel.g:3372:5: otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    {
                    	    otherlv_37=(Token)match(input,14,FOLLOW_63); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getEClassAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalEel.g:3376:5: ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    // InternalEel.g:3377:6: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    {
                    	    // InternalEel.g:3377:6: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    // InternalEel.g:3378:7: lv_eStructuralFeatures_38_0= ruleEStructuralFeature
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getEStructuralFeaturesEStructuralFeatureParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_eStructuralFeatures_38_0=ruleEStructuralFeature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eStructuralFeatures",
                    	    								lv_eStructuralFeatures_38_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.EStructuralFeature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,15,FOLLOW_64); 

                    				newLeafNode(otherlv_39, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3401:3: (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==62) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalEel.g:3402:4: otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,62,FOLLOW_4); 

                    				newLeafNode(otherlv_40, grammarAccess.getEClassAccess().getEGenericSuperTypesKeyword_13_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_65); 

                    				newLeafNode(otherlv_41, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalEel.g:3410:4: ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) )
                    // InternalEel.g:3411:5: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    {
                    // InternalEel.g:3411:5: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    // InternalEel.g:3412:6: lv_eGenericSuperTypes_42_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getEGenericSuperTypesEGenericTypeParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eGenericSuperTypes_42_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						add(
                    							current,
                    							"eGenericSuperTypes",
                    							lv_eGenericSuperTypes_42_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3429:4: (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==14) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalEel.g:3430:5: otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,14,FOLLOW_65); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getEClassAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalEel.g:3434:5: ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    // InternalEel.g:3435:6: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    {
                    	    // InternalEel.g:3435:6: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    // InternalEel.g:3436:7: lv_eGenericSuperTypes_44_0= ruleEGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getEGenericSuperTypesEGenericTypeParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_eGenericSuperTypes_44_0=ruleEGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eGenericSuperTypes",
                    	    								lv_eGenericSuperTypes_44_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.EGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_45, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            otherlv_46=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_46, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleEClass"


    // $ANTLR start "entryRuleEOperation"
    // InternalEel.g:3467:1: entryRuleEOperation returns [EObject current=null] : iv_ruleEOperation= ruleEOperation EOF ;
    public final EObject entryRuleEOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperation = null;


        try {
            // InternalEel.g:3467:51: (iv_ruleEOperation= ruleEOperation EOF )
            // InternalEel.g:3468:2: iv_ruleEOperation= ruleEOperation EOF
            {
             newCompositeNode(grammarAccess.getEOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOperation=ruleEOperation();

            state._fsp--;

             current =iv_ruleEOperation; 
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
    // $ANTLR end "entryRuleEOperation"


    // $ANTLR start "ruleEOperation"
    // InternalEel.g:3474:1: ruleEOperation returns [EObject current=null] : ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
    public final EObject ruleEOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ordered_5_0 = null;

        AntlrDatatypeRuleToken lv_unique_7_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_9_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_11_0 = null;

        EObject lv_eAnnotations_22_0 = null;

        EObject lv_eAnnotations_24_0 = null;

        EObject lv_eGenericType_27_0 = null;

        EObject lv_eTypeParameters_30_0 = null;

        EObject lv_eTypeParameters_32_0 = null;

        EObject lv_eParameters_36_0 = null;

        EObject lv_eParameters_38_0 = null;

        EObject lv_eGenericExceptions_42_0 = null;

        EObject lv_eGenericExceptions_44_0 = null;



        	enterRule();

        try {
            // InternalEel.g:3480:2: ( ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // InternalEel.g:3481:2: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // InternalEel.g:3481:2: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // InternalEel.g:3482:3: () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // InternalEel.g:3482:3: ()
            // InternalEel.g:3483:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOperationAccess().getEOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEOperationAccess().getEOperationKeyword_1());
            		
            // InternalEel.g:3493:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:3494:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:3494:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:3495:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEOperationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEOperationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_66); 

            			newLeafNode(otherlv_3, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:3516:3: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==64) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalEel.g:3517:4: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,64,FOLLOW_67); 

                    				newLeafNode(otherlv_4, grammarAccess.getEOperationAccess().getOrderedKeyword_4_0());
                    			
                    // InternalEel.g:3521:4: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // InternalEel.g:3522:5: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // InternalEel.g:3522:5: (lv_ordered_5_0= ruleEBoolean )
                    // InternalEel.g:3523:6: lv_ordered_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getOrderedEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    lv_ordered_5_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"ordered",
                    							lv_ordered_5_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3541:3: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==65) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalEel.g:3542:4: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,65,FOLLOW_67); 

                    				newLeafNode(otherlv_6, grammarAccess.getEOperationAccess().getUniqueKeyword_5_0());
                    			
                    // InternalEel.g:3546:4: ( (lv_unique_7_0= ruleEBoolean ) )
                    // InternalEel.g:3547:5: (lv_unique_7_0= ruleEBoolean )
                    {
                    // InternalEel.g:3547:5: (lv_unique_7_0= ruleEBoolean )
                    // InternalEel.g:3548:6: lv_unique_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getUniqueEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    lv_unique_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"unique",
                    							lv_unique_7_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3566:3: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==66) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalEel.g:3567:4: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,66,FOLLOW_70); 

                    				newLeafNode(otherlv_8, grammarAccess.getEOperationAccess().getLowerBoundKeyword_6_0());
                    			
                    // InternalEel.g:3571:4: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // InternalEel.g:3572:5: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // InternalEel.g:3572:5: (lv_lowerBound_9_0= ruleEInt )
                    // InternalEel.g:3573:6: lv_lowerBound_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getLowerBoundEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_71);
                    lv_lowerBound_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_9_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3591:3: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==67) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalEel.g:3592:4: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,67,FOLLOW_70); 

                    				newLeafNode(otherlv_10, grammarAccess.getEOperationAccess().getUpperBoundKeyword_7_0());
                    			
                    // InternalEel.g:3596:4: ( (lv_upperBound_11_0= ruleEInt ) )
                    // InternalEel.g:3597:5: (lv_upperBound_11_0= ruleEInt )
                    {
                    // InternalEel.g:3597:5: (lv_upperBound_11_0= ruleEInt )
                    // InternalEel.g:3598:6: lv_upperBound_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getUpperBoundEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_72);
                    lv_upperBound_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_11_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3616:3: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==68) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalEel.g:3617:4: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,68,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getEOperationAccess().getETypeKeyword_8_0());
                    			
                    // InternalEel.g:3621:4: ( ( ruleEString ) )
                    // InternalEel.g:3622:5: ( ruleEString )
                    {
                    // InternalEel.g:3622:5: ( ruleEString )
                    // InternalEel.g:3623:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEOperationAccess().getETypeEClassifierCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3638:3: (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==69) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalEel.g:3639:4: otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')'
                    {
                    otherlv_14=(Token)match(input,69,FOLLOW_54); 

                    				newLeafNode(otherlv_14, grammarAccess.getEOperationAccess().getEExceptionsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,56,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getEOperationAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalEel.g:3647:4: ( ( ruleEString ) )
                    // InternalEel.g:3648:5: ( ruleEString )
                    {
                    // InternalEel.g:3648:5: ( ruleEString )
                    // InternalEel.g:3649:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_55);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3663:4: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==14) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalEel.g:3664:5: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEOperationAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalEel.g:3668:5: ( ( ruleEString ) )
                    	    // InternalEel.g:3669:6: ( ruleEString )
                    	    {
                    	    // InternalEel.g:3669:6: ( ruleEString )
                    	    // InternalEel.g:3670:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEOperationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_55);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,57,FOLLOW_74); 

                    				newLeafNode(otherlv_19, grammarAccess.getEOperationAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3690:3: (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==58) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalEel.g:3691:4: otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,58,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getEOperationAccess().getEAnnotationsKeyword_10_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_21, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalEel.g:3699:4: ( (lv_eAnnotations_22_0= ruleEAnnotation ) )
                    // InternalEel.g:3700:5: (lv_eAnnotations_22_0= ruleEAnnotation )
                    {
                    // InternalEel.g:3700:5: (lv_eAnnotations_22_0= ruleEAnnotation )
                    // InternalEel.g:3701:6: lv_eAnnotations_22_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEAnnotationsEAnnotationParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eAnnotations_22_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_22_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3718:4: (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==14) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalEel.g:3719:5: otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_23=(Token)match(input,14,FOLLOW_57); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getEOperationAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalEel.g:3723:5: ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    // InternalEel.g:3724:6: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:3724:6: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    // InternalEel.g:3725:7: lv_eAnnotations_24_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEAnnotationsEAnnotationParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_eAnnotations_24_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_24_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,15,FOLLOW_75); 

                    				newLeafNode(otherlv_25, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3748:3: (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==70) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalEel.g:3749:4: otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    {
                    otherlv_26=(Token)match(input,70,FOLLOW_65); 

                    				newLeafNode(otherlv_26, grammarAccess.getEOperationAccess().getEGenericTypeKeyword_11_0());
                    			
                    // InternalEel.g:3753:4: ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    // InternalEel.g:3754:5: (lv_eGenericType_27_0= ruleEGenericType )
                    {
                    // InternalEel.g:3754:5: (lv_eGenericType_27_0= ruleEGenericType )
                    // InternalEel.g:3755:6: lv_eGenericType_27_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEGenericTypeEGenericTypeParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_76);
                    lv_eGenericType_27_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"eGenericType",
                    							lv_eGenericType_27_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3773:3: (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==59) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalEel.g:3774:4: otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,59,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getEOperationAccess().getETypeParametersKeyword_12_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_59); 

                    				newLeafNode(otherlv_29, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalEel.g:3782:4: ( (lv_eTypeParameters_30_0= ruleETypeParameter ) )
                    // InternalEel.g:3783:5: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    {
                    // InternalEel.g:3783:5: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    // InternalEel.g:3784:6: lv_eTypeParameters_30_0= ruleETypeParameter
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getETypeParametersETypeParameterParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eTypeParameters_30_0=ruleETypeParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						add(
                    							current,
                    							"eTypeParameters",
                    							lv_eTypeParameters_30_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.ETypeParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3801:4: (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==14) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalEel.g:3802:5: otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_31=(Token)match(input,14,FOLLOW_59); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getEOperationAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalEel.g:3806:5: ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    // InternalEel.g:3807:6: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    {
                    	    // InternalEel.g:3807:6: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    // InternalEel.g:3808:7: lv_eTypeParameters_32_0= ruleETypeParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getETypeParametersETypeParameterParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_eTypeParameters_32_0=ruleETypeParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eTypeParameters",
                    	    								lv_eTypeParameters_32_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.ETypeParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,15,FOLLOW_77); 

                    				newLeafNode(otherlv_33, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3831:3: (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==71) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalEel.g:3832:4: otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,71,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getEOperationAccess().getEParametersKeyword_13_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_78); 

                    				newLeafNode(otherlv_35, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalEel.g:3840:4: ( (lv_eParameters_36_0= ruleEParameter ) )
                    // InternalEel.g:3841:5: (lv_eParameters_36_0= ruleEParameter )
                    {
                    // InternalEel.g:3841:5: (lv_eParameters_36_0= ruleEParameter )
                    // InternalEel.g:3842:6: lv_eParameters_36_0= ruleEParameter
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEParametersEParameterParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eParameters_36_0=ruleEParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						add(
                    							current,
                    							"eParameters",
                    							lv_eParameters_36_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3859:4: (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==14) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // InternalEel.g:3860:5: otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    {
                    	    otherlv_37=(Token)match(input,14,FOLLOW_78); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getEOperationAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalEel.g:3864:5: ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    // InternalEel.g:3865:6: (lv_eParameters_38_0= ruleEParameter )
                    	    {
                    	    // InternalEel.g:3865:6: (lv_eParameters_38_0= ruleEParameter )
                    	    // InternalEel.g:3866:7: lv_eParameters_38_0= ruleEParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEParametersEParameterParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_eParameters_38_0=ruleEParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eParameters",
                    	    								lv_eParameters_38_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.EParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,15,FOLLOW_79); 

                    				newLeafNode(otherlv_39, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3889:3: (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==72) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalEel.g:3890:4: otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,72,FOLLOW_4); 

                    				newLeafNode(otherlv_40, grammarAccess.getEOperationAccess().getEGenericExceptionsKeyword_14_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_65); 

                    				newLeafNode(otherlv_41, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalEel.g:3898:4: ( (lv_eGenericExceptions_42_0= ruleEGenericType ) )
                    // InternalEel.g:3899:5: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    {
                    // InternalEel.g:3899:5: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    // InternalEel.g:3900:6: lv_eGenericExceptions_42_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEGenericExceptionsEGenericTypeParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eGenericExceptions_42_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						add(
                    							current,
                    							"eGenericExceptions",
                    							lv_eGenericExceptions_42_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3917:4: (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==14) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalEel.g:3918:5: otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,14,FOLLOW_65); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getEOperationAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalEel.g:3922:5: ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    // InternalEel.g:3923:6: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    {
                    	    // InternalEel.g:3923:6: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    // InternalEel.g:3924:7: lv_eGenericExceptions_44_0= ruleEGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEGenericExceptionsEGenericTypeParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_eGenericExceptions_44_0=ruleEGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eGenericExceptions",
                    	    								lv_eGenericExceptions_44_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.EGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_45, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            otherlv_46=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_46, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleEOperation"


    // $ANTLR start "entryRuleEAnnotation"
    // InternalEel.g:3955:1: entryRuleEAnnotation returns [EObject current=null] : iv_ruleEAnnotation= ruleEAnnotation EOF ;
    public final EObject entryRuleEAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAnnotation = null;


        try {
            // InternalEel.g:3955:52: (iv_ruleEAnnotation= ruleEAnnotation EOF )
            // InternalEel.g:3956:2: iv_ruleEAnnotation= ruleEAnnotation EOF
            {
             newCompositeNode(grammarAccess.getEAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAnnotation=ruleEAnnotation();

            state._fsp--;

             current =iv_ruleEAnnotation; 
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
    // $ANTLR end "entryRuleEAnnotation"


    // $ANTLR start "ruleEAnnotation"
    // InternalEel.g:3962:1: ruleEAnnotation returns [EObject current=null] : ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
    public final EObject ruleEAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
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
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_source_4_0 = null;

        EObject lv_eAnnotations_13_0 = null;

        EObject lv_eAnnotations_15_0 = null;

        EObject lv_details_19_0 = null;

        EObject lv_details_21_0 = null;

        EObject lv_contents_25_0 = null;

        EObject lv_contents_27_0 = null;



        	enterRule();

        try {
            // InternalEel.g:3968:2: ( ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // InternalEel.g:3969:2: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // InternalEel.g:3969:2: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // InternalEel.g:3970:3: () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // InternalEel.g:3970:3: ()
            // InternalEel.g:3971:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAnnotationAccess().getEAnnotationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,73,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEAnnotationAccess().getEAnnotationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_80); 

            			newLeafNode(otherlv_2, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:3985:3: (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==74) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalEel.g:3986:4: otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,74,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEAnnotationAccess().getSourceKeyword_3_0());
                    			
                    // InternalEel.g:3990:4: ( (lv_source_4_0= ruleEString ) )
                    // InternalEel.g:3991:5: (lv_source_4_0= ruleEString )
                    {
                    // InternalEel.g:3991:5: (lv_source_4_0= ruleEString )
                    // InternalEel.g:3992:6: lv_source_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getSourceEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_81);
                    lv_source_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    						}
                    						set(
                    							current,
                    							"source",
                    							lv_source_4_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4010:3: (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==75) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalEel.g:4011:4: otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,75,FOLLOW_54); 

                    				newLeafNode(otherlv_5, grammarAccess.getEAnnotationAccess().getReferencesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,56,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEAnnotationAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalEel.g:4019:4: ( ( ruleEString ) )
                    // InternalEel.g:4020:5: ( ruleEString )
                    {
                    // InternalEel.g:4020:5: ( ruleEString )
                    // InternalEel.g:4021:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAnnotationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_55);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:4035:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==14) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // InternalEel.g:4036:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEAnnotationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalEel.g:4040:5: ( ( ruleEString ) )
                    	    // InternalEel.g:4041:6: ( ruleEString )
                    	    {
                    	    // InternalEel.g:4041:6: ( ruleEString )
                    	    // InternalEel.g:4042:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAnnotationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_55);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,57,FOLLOW_82); 

                    				newLeafNode(otherlv_10, grammarAccess.getEAnnotationAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:4062:3: (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==58) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalEel.g:4063:4: otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,58,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getEAnnotationAccess().getEAnnotationsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_12, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalEel.g:4071:4: ( (lv_eAnnotations_13_0= ruleEAnnotation ) )
                    // InternalEel.g:4072:5: (lv_eAnnotations_13_0= ruleEAnnotation )
                    {
                    // InternalEel.g:4072:5: (lv_eAnnotations_13_0= ruleEAnnotation )
                    // InternalEel.g:4073:6: lv_eAnnotations_13_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getEAnnotationsEAnnotationParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eAnnotations_13_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_13_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:4090:4: (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==14) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // InternalEel.g:4091:5: otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_57); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getEAnnotationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalEel.g:4095:5: ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    // InternalEel.g:4096:6: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:4096:6: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    // InternalEel.g:4097:7: lv_eAnnotations_15_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getEAnnotationsEAnnotationParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_eAnnotations_15_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_15_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop92;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,15,FOLLOW_83); 

                    				newLeafNode(otherlv_16, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:4120:3: (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==76) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalEel.g:4121:4: otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,76,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getEAnnotationAccess().getDetailsKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_84); 

                    				newLeafNode(otherlv_18, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalEel.g:4129:4: ( (lv_details_19_0= ruleEStringToStringMapEntry ) )
                    // InternalEel.g:4130:5: (lv_details_19_0= ruleEStringToStringMapEntry )
                    {
                    // InternalEel.g:4130:5: (lv_details_19_0= ruleEStringToStringMapEntry )
                    // InternalEel.g:4131:6: lv_details_19_0= ruleEStringToStringMapEntry
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getDetailsEStringToStringMapEntryParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_details_19_0=ruleEStringToStringMapEntry();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    						}
                    						add(
                    							current,
                    							"details",
                    							lv_details_19_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EStringToStringMapEntry");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:4148:4: (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==14) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // InternalEel.g:4149:5: otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FOLLOW_84); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getEAnnotationAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalEel.g:4153:5: ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    // InternalEel.g:4154:6: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    {
                    	    // InternalEel.g:4154:6: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    // InternalEel.g:4155:7: lv_details_21_0= ruleEStringToStringMapEntry
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getDetailsEStringToStringMapEntryParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_details_21_0=ruleEStringToStringMapEntry();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"details",
                    	    								lv_details_21_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.EStringToStringMapEntry");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop94;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,15,FOLLOW_85); 

                    				newLeafNode(otherlv_22, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:4178:3: (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==77) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalEel.g:4179:4: otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,77,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getEAnnotationAccess().getContentsKeyword_7_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_86); 

                    				newLeafNode(otherlv_24, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalEel.g:4187:4: ( (lv_contents_25_0= ruleEObject ) )
                    // InternalEel.g:4188:5: (lv_contents_25_0= ruleEObject )
                    {
                    // InternalEel.g:4188:5: (lv_contents_25_0= ruleEObject )
                    // InternalEel.g:4189:6: lv_contents_25_0= ruleEObject
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getContentsEObjectParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_contents_25_0=ruleEObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    						}
                    						add(
                    							current,
                    							"contents",
                    							lv_contents_25_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:4206:4: (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )*
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==14) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // InternalEel.g:4207:5: otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_86); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getEAnnotationAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalEel.g:4211:5: ( (lv_contents_27_0= ruleEObject ) )
                    	    // InternalEel.g:4212:6: (lv_contents_27_0= ruleEObject )
                    	    {
                    	    // InternalEel.g:4212:6: (lv_contents_27_0= ruleEObject )
                    	    // InternalEel.g:4213:7: lv_contents_27_0= ruleEObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getContentsEObjectParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_contents_27_0=ruleEObject();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"contents",
                    	    								lv_contents_27_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.EObject");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop96;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_28, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_29=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleEAnnotation"


    // $ANTLR start "entryRuleETypeParameter"
    // InternalEel.g:4244:1: entryRuleETypeParameter returns [EObject current=null] : iv_ruleETypeParameter= ruleETypeParameter EOF ;
    public final EObject entryRuleETypeParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETypeParameter = null;


        try {
            // InternalEel.g:4244:55: (iv_ruleETypeParameter= ruleETypeParameter EOF )
            // InternalEel.g:4245:2: iv_ruleETypeParameter= ruleETypeParameter EOF
            {
             newCompositeNode(grammarAccess.getETypeParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETypeParameter=ruleETypeParameter();

            state._fsp--;

             current =iv_ruleETypeParameter; 
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
    // $ANTLR end "entryRuleETypeParameter"


    // $ANTLR start "ruleETypeParameter"
    // InternalEel.g:4251:1: ruleETypeParameter returns [EObject current=null] : ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleETypeParameter() throws RecognitionException {
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
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_eAnnotations_6_0 = null;

        EObject lv_eAnnotations_8_0 = null;

        EObject lv_eBounds_12_0 = null;

        EObject lv_eBounds_14_0 = null;



        	enterRule();

        try {
            // InternalEel.g:4257:2: ( ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalEel.g:4258:2: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalEel.g:4258:2: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalEel.g:4259:3: () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalEel.g:4259:3: ()
            // InternalEel.g:4260:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getETypeParameterAccess().getETypeParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getETypeParameterAccess().getETypeParameterKeyword_1());
            		
            // InternalEel.g:4270:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:4271:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:4271:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:4272:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getETypeParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getETypeParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_87); 

            			newLeafNode(otherlv_3, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:4293:3: (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==58) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalEel.g:4294:4: otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,58,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getETypeParameterAccess().getEAnnotationsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_5, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalEel.g:4302:4: ( (lv_eAnnotations_6_0= ruleEAnnotation ) )
                    // InternalEel.g:4303:5: (lv_eAnnotations_6_0= ruleEAnnotation )
                    {
                    // InternalEel.g:4303:5: (lv_eAnnotations_6_0= ruleEAnnotation )
                    // InternalEel.g:4304:6: lv_eAnnotations_6_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getETypeParameterAccess().getEAnnotationsEAnnotationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eAnnotations_6_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETypeParameterRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_6_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:4321:4: (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==14) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // InternalEel.g:4322:5: otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_57); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getETypeParameterAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalEel.g:4326:5: ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    // InternalEel.g:4327:6: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:4327:6: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    // InternalEel.g:4328:7: lv_eAnnotations_8_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getETypeParameterAccess().getEAnnotationsEAnnotationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_eAnnotations_8_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getETypeParameterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_8_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop98;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_88); 

                    				newLeafNode(otherlv_9, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:4351:3: (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==79) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalEel.g:4352:4: otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,79,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getETypeParameterAccess().getEBoundsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_65); 

                    				newLeafNode(otherlv_11, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalEel.g:4360:4: ( (lv_eBounds_12_0= ruleEGenericType ) )
                    // InternalEel.g:4361:5: (lv_eBounds_12_0= ruleEGenericType )
                    {
                    // InternalEel.g:4361:5: (lv_eBounds_12_0= ruleEGenericType )
                    // InternalEel.g:4362:6: lv_eBounds_12_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getETypeParameterAccess().getEBoundsEGenericTypeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eBounds_12_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETypeParameterRule());
                    						}
                    						add(
                    							current,
                    							"eBounds",
                    							lv_eBounds_12_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:4379:4: (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )*
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==14) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // InternalEel.g:4380:5: otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_65); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getETypeParameterAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalEel.g:4384:5: ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    // InternalEel.g:4385:6: (lv_eBounds_14_0= ruleEGenericType )
                    	    {
                    	    // InternalEel.g:4385:6: (lv_eBounds_14_0= ruleEGenericType )
                    	    // InternalEel.g:4386:7: lv_eBounds_14_0= ruleEGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getETypeParameterAccess().getEBoundsEGenericTypeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_eBounds_14_0=ruleEGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getETypeParameterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eBounds",
                    	    								lv_eBounds_14_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.EGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop100;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleETypeParameter"


    // $ANTLR start "entryRuleEBoolean"
    // InternalEel.g:4417:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalEel.g:4417:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalEel.g:4418:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalEel.g:4424:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEel.g:4430:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalEel.g:4431:2: (kw= 'true' | kw= 'false' )
            {
            // InternalEel.g:4431:2: (kw= 'true' | kw= 'false' )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==80) ) {
                alt102=1;
            }
            else if ( (LA102_0==81) ) {
                alt102=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // InternalEel.g:4432:3: kw= 'true'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEel.g:4438:3: kw= 'false'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEGenericType"
    // InternalEel.g:4447:1: entryRuleEGenericType returns [EObject current=null] : iv_ruleEGenericType= ruleEGenericType EOF ;
    public final EObject entryRuleEGenericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGenericType = null;


        try {
            // InternalEel.g:4447:53: (iv_ruleEGenericType= ruleEGenericType EOF )
            // InternalEel.g:4448:2: iv_ruleEGenericType= ruleEGenericType EOF
            {
             newCompositeNode(grammarAccess.getEGenericTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEGenericType=ruleEGenericType();

            state._fsp--;

             current =iv_ruleEGenericType; 
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
    // $ANTLR end "entryRuleEGenericType"


    // $ANTLR start "ruleEGenericType"
    // InternalEel.g:4454:1: ruleEGenericType returns [EObject current=null] : ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleEGenericType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_eUpperBound_8_0 = null;

        EObject lv_eTypeArguments_11_0 = null;

        EObject lv_eTypeArguments_13_0 = null;

        EObject lv_eLowerBound_16_0 = null;



        	enterRule();

        try {
            // InternalEel.g:4460:2: ( ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) )
            // InternalEel.g:4461:2: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            {
            // InternalEel.g:4461:2: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            // InternalEel.g:4462:3: () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}'
            {
            // InternalEel.g:4462:3: ()
            // InternalEel.g:4463:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEGenericTypeAccess().getEGenericTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,82,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEGenericTypeAccess().getEGenericTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_89); 

            			newLeafNode(otherlv_2, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:4477:3: (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==83) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalEel.g:4478:4: otherlv_3= 'eTypeParameter' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,83,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEGenericTypeAccess().getETypeParameterKeyword_3_0());
                    			
                    // InternalEel.g:4482:4: ( ( ruleEString ) )
                    // InternalEel.g:4483:5: ( ruleEString )
                    {
                    // InternalEel.g:4483:5: ( ruleEString )
                    // InternalEel.g:4484:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEGenericTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeParameterETypeParameterCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_90);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4499:3: (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==84) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalEel.g:4500:4: otherlv_5= 'eClassifier' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,84,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEGenericTypeAccess().getEClassifierKeyword_4_0());
                    			
                    // InternalEel.g:4504:4: ( ( ruleEString ) )
                    // InternalEel.g:4505:5: ( ruleEString )
                    {
                    // InternalEel.g:4505:5: ( ruleEString )
                    // InternalEel.g:4506:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEGenericTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getEClassifierEClassifierCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_91);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4521:3: (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==85) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalEel.g:4522:4: otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    {
                    otherlv_7=(Token)match(input,85,FOLLOW_65); 

                    				newLeafNode(otherlv_7, grammarAccess.getEGenericTypeAccess().getEUpperBoundKeyword_5_0());
                    			
                    // InternalEel.g:4526:4: ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    // InternalEel.g:4527:5: (lv_eUpperBound_8_0= ruleEGenericType )
                    {
                    // InternalEel.g:4527:5: (lv_eUpperBound_8_0= ruleEGenericType )
                    // InternalEel.g:4528:6: lv_eUpperBound_8_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getEUpperBoundEGenericTypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_92);
                    lv_eUpperBound_8_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEGenericTypeRule());
                    						}
                    						set(
                    							current,
                    							"eUpperBound",
                    							lv_eUpperBound_8_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4546:3: (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==86) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalEel.g:4547:4: otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,86,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getEGenericTypeAccess().getETypeArgumentsKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_65); 

                    				newLeafNode(otherlv_10, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalEel.g:4555:4: ( (lv_eTypeArguments_11_0= ruleEGenericType ) )
                    // InternalEel.g:4556:5: (lv_eTypeArguments_11_0= ruleEGenericType )
                    {
                    // InternalEel.g:4556:5: (lv_eTypeArguments_11_0= ruleEGenericType )
                    // InternalEel.g:4557:6: lv_eTypeArguments_11_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeArgumentsEGenericTypeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eTypeArguments_11_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEGenericTypeRule());
                    						}
                    						add(
                    							current,
                    							"eTypeArguments",
                    							lv_eTypeArguments_11_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:4574:4: (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==14) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // InternalEel.g:4575:5: otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_65); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getEGenericTypeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalEel.g:4579:5: ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    // InternalEel.g:4580:6: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    {
                    	    // InternalEel.g:4580:6: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    // InternalEel.g:4581:7: lv_eTypeArguments_13_0= ruleEGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeArgumentsEGenericTypeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_eTypeArguments_13_0=ruleEGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEGenericTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eTypeArguments",
                    	    								lv_eTypeArguments_13_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.EGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop106;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_93); 

                    				newLeafNode(otherlv_14, grammarAccess.getEGenericTypeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:4604:3: (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==87) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalEel.g:4605:4: otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    {
                    otherlv_15=(Token)match(input,87,FOLLOW_65); 

                    				newLeafNode(otherlv_15, grammarAccess.getEGenericTypeAccess().getELowerBoundKeyword_7_0());
                    			
                    // InternalEel.g:4609:4: ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    // InternalEel.g:4610:5: (lv_eLowerBound_16_0= ruleEGenericType )
                    {
                    // InternalEel.g:4610:5: (lv_eLowerBound_16_0= ruleEGenericType )
                    // InternalEel.g:4611:6: lv_eLowerBound_16_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getELowerBoundEGenericTypeParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_eLowerBound_16_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEGenericTypeRule());
                    						}
                    						set(
                    							current,
                    							"eLowerBound",
                    							lv_eLowerBound_16_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getEGenericTypeAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleEGenericType"


    // $ANTLR start "entryRuleEStringToStringMapEntry"
    // InternalEel.g:4637:1: entryRuleEStringToStringMapEntry returns [EObject current=null] : iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF ;
    public final EObject entryRuleEStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStringToStringMapEntry = null;


        try {
            // InternalEel.g:4637:64: (iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF )
            // InternalEel.g:4638:2: iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF
            {
             newCompositeNode(grammarAccess.getEStringToStringMapEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEStringToStringMapEntry=ruleEStringToStringMapEntry();

            state._fsp--;

             current =iv_ruleEStringToStringMapEntry; 
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
    // $ANTLR end "entryRuleEStringToStringMapEntry"


    // $ANTLR start "ruleEStringToStringMapEntry"
    // InternalEel.g:4644:1: ruleEStringToStringMapEntry returns [EObject current=null] : ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleEStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_key_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalEel.g:4650:2: ( ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalEel.g:4651:2: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalEel.g:4651:2: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalEel.g:4652:3: () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalEel.g:4652:3: ()
            // InternalEel.g:4653:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,88,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_94); 

            			newLeafNode(otherlv_2, grammarAccess.getEStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:4667:3: (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==89) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalEel.g:4668:4: otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,89,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEStringToStringMapEntryAccess().getKeyKeyword_3_0());
                    			
                    // InternalEel.g:4672:4: ( (lv_key_4_0= ruleEString ) )
                    // InternalEel.g:4673:5: (lv_key_4_0= ruleEString )
                    {
                    // InternalEel.g:4673:5: (lv_key_4_0= ruleEString )
                    // InternalEel.g:4674:6: lv_key_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_95);
                    lv_key_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEStringToStringMapEntryRule());
                    						}
                    						set(
                    							current,
                    							"key",
                    							lv_key_4_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4692:3: (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==18) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalEel.g:4693:4: otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEStringToStringMapEntryAccess().getValueKeyword_4_0());
                    			
                    // InternalEel.g:4697:4: ( (lv_value_6_0= ruleEString ) )
                    // InternalEel.g:4698:5: (lv_value_6_0= ruleEString )
                    {
                    // InternalEel.g:4698:5: (lv_value_6_0= ruleEString )
                    // InternalEel.g:4699:6: lv_value_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getValueEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_value_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEStringToStringMapEntryRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEStringToStringMapEntryAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleEStringToStringMapEntry"


    // $ANTLR start "entryRuleEObject"
    // InternalEel.g:4725:1: entryRuleEObject returns [EObject current=null] : iv_ruleEObject= ruleEObject EOF ;
    public final EObject entryRuleEObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObject = null;


        try {
            // InternalEel.g:4725:48: (iv_ruleEObject= ruleEObject EOF )
            // InternalEel.g:4726:2: iv_ruleEObject= ruleEObject EOF
            {
             newCompositeNode(grammarAccess.getEObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEObject=ruleEObject();

            state._fsp--;

             current =iv_ruleEObject; 
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
    // $ANTLR end "entryRuleEObject"


    // $ANTLR start "ruleEObject"
    // InternalEel.g:4732:1: ruleEObject returns [EObject current=null] : ( () otherlv_1= 'EObject' ) ;
    public final EObject ruleEObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEel.g:4738:2: ( ( () otherlv_1= 'EObject' ) )
            // InternalEel.g:4739:2: ( () otherlv_1= 'EObject' )
            {
            // InternalEel.g:4739:2: ( () otherlv_1= 'EObject' )
            // InternalEel.g:4740:3: () otherlv_1= 'EObject'
            {
            // InternalEel.g:4740:3: ()
            // InternalEel.g:4741:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEObjectAccess().getEObjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,90,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEObjectAccess().getEObjectKeyword_1());
            		

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
    // $ANTLR end "ruleEObject"


    // $ANTLR start "entryRuleEInt"
    // InternalEel.g:4755:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalEel.g:4755:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalEel.g:4756:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalEel.g:4762:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalEel.g:4768:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalEel.g:4769:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalEel.g:4769:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalEel.g:4770:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalEel.g:4770:3: (kw= '-' )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==29) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalEel.g:4771:4: kw= '-'
                    {
                    kw=(Token)match(input,29,FOLLOW_16); 

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


    // $ANTLR start "entryRuleEAttribute"
    // InternalEel.g:4788:1: entryRuleEAttribute returns [EObject current=null] : iv_ruleEAttribute= ruleEAttribute EOF ;
    public final EObject entryRuleEAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttribute = null;


        try {
            // InternalEel.g:4788:51: (iv_ruleEAttribute= ruleEAttribute EOF )
            // InternalEel.g:4789:2: iv_ruleEAttribute= ruleEAttribute EOF
            {
             newCompositeNode(grammarAccess.getEAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAttribute=ruleEAttribute();

            state._fsp--;

             current =iv_ruleEAttribute; 
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
    // $ANTLR end "entryRuleEAttribute"


    // $ANTLR start "ruleEAttribute"
    // InternalEel.g:4795:1: ruleEAttribute returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) ;
    public final EObject ruleEAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_volatile_1_0=null;
        Token lv_transient_2_0=null;
        Token lv_unsettable_3_0=null;
        Token lv_derived_4_0=null;
        Token lv_iD_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_name_7_0 = null;

        AntlrDatatypeRuleToken lv_ordered_10_0 = null;

        AntlrDatatypeRuleToken lv_unique_12_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_14_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_16_0 = null;

        AntlrDatatypeRuleToken lv_changeable_18_0 = null;

        AntlrDatatypeRuleToken lv_defaultValueLiteral_20_0 = null;

        EObject lv_eAnnotations_25_0 = null;

        EObject lv_eAnnotations_27_0 = null;

        EObject lv_eGenericType_30_0 = null;



        	enterRule();

        try {
            // InternalEel.g:4801:2: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) )
            // InternalEel.g:4802:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            {
            // InternalEel.g:4802:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            // InternalEel.g:4803:3: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}'
            {
            // InternalEel.g:4803:3: ()
            // InternalEel.g:4804:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAttributeAccess().getEAttributeAction_0(),
            					current);
            			

            }

            // InternalEel.g:4810:3: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==91) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalEel.g:4811:4: (lv_volatile_1_0= 'volatile' )
                    {
                    // InternalEel.g:4811:4: (lv_volatile_1_0= 'volatile' )
                    // InternalEel.g:4812:5: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,91,FOLLOW_96); 

                    					newLeafNode(lv_volatile_1_0, grammarAccess.getEAttributeAccess().getVolatileVolatileKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "volatile", true, "volatile");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4824:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==92) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalEel.g:4825:4: (lv_transient_2_0= 'transient' )
                    {
                    // InternalEel.g:4825:4: (lv_transient_2_0= 'transient' )
                    // InternalEel.g:4826:5: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,92,FOLLOW_97); 

                    					newLeafNode(lv_transient_2_0, grammarAccess.getEAttributeAccess().getTransientTransientKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "transient", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4838:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==93) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalEel.g:4839:4: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // InternalEel.g:4839:4: (lv_unsettable_3_0= 'unsettable' )
                    // InternalEel.g:4840:5: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,93,FOLLOW_98); 

                    					newLeafNode(lv_unsettable_3_0, grammarAccess.getEAttributeAccess().getUnsettableUnsettableKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "unsettable", true, "unsettable");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4852:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==94) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalEel.g:4853:4: (lv_derived_4_0= 'derived' )
                    {
                    // InternalEel.g:4853:4: (lv_derived_4_0= 'derived' )
                    // InternalEel.g:4854:5: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,94,FOLLOW_99); 

                    					newLeafNode(lv_derived_4_0, grammarAccess.getEAttributeAccess().getDerivedDerivedKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "derived", true, "derived");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4866:3: ( (lv_iD_5_0= 'iD' ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==95) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalEel.g:4867:4: (lv_iD_5_0= 'iD' )
                    {
                    // InternalEel.g:4867:4: (lv_iD_5_0= 'iD' )
                    // InternalEel.g:4868:5: lv_iD_5_0= 'iD'
                    {
                    lv_iD_5_0=(Token)match(input,95,FOLLOW_100); 

                    					newLeafNode(lv_iD_5_0, grammarAccess.getEAttributeAccess().getIDIDKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "iD", true, "iD");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,96,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getEAttributeAccess().getEAttributeKeyword_6());
            		
            // InternalEel.g:4884:3: ( (lv_name_7_0= ruleEString ) )
            // InternalEel.g:4885:4: (lv_name_7_0= ruleEString )
            {
            // InternalEel.g:4885:4: (lv_name_7_0= ruleEString )
            // InternalEel.g:4886:5: lv_name_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEAttributeAccess().getNameEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,12,FOLLOW_101); 

            			newLeafNode(otherlv_8, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalEel.g:4907:3: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==64) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalEel.g:4908:4: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,64,FOLLOW_67); 

                    				newLeafNode(otherlv_9, grammarAccess.getEAttributeAccess().getOrderedKeyword_9_0());
                    			
                    // InternalEel.g:4912:4: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // InternalEel.g:4913:5: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // InternalEel.g:4913:5: (lv_ordered_10_0= ruleEBoolean )
                    // InternalEel.g:4914:6: lv_ordered_10_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getOrderedEBooleanParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_102);
                    lv_ordered_10_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"ordered",
                    							lv_ordered_10_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4932:3: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==65) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalEel.g:4933:4: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,65,FOLLOW_67); 

                    				newLeafNode(otherlv_11, grammarAccess.getEAttributeAccess().getUniqueKeyword_10_0());
                    			
                    // InternalEel.g:4937:4: ( (lv_unique_12_0= ruleEBoolean ) )
                    // InternalEel.g:4938:5: (lv_unique_12_0= ruleEBoolean )
                    {
                    // InternalEel.g:4938:5: (lv_unique_12_0= ruleEBoolean )
                    // InternalEel.g:4939:6: lv_unique_12_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getUniqueEBooleanParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_103);
                    lv_unique_12_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"unique",
                    							lv_unique_12_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4957:3: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==66) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalEel.g:4958:4: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,66,FOLLOW_70); 

                    				newLeafNode(otherlv_13, grammarAccess.getEAttributeAccess().getLowerBoundKeyword_11_0());
                    			
                    // InternalEel.g:4962:4: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // InternalEel.g:4963:5: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // InternalEel.g:4963:5: (lv_lowerBound_14_0= ruleEInt )
                    // InternalEel.g:4964:6: lv_lowerBound_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getLowerBoundEIntParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_104);
                    lv_lowerBound_14_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_14_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4982:3: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==67) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalEel.g:4983:4: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,67,FOLLOW_70); 

                    				newLeafNode(otherlv_15, grammarAccess.getEAttributeAccess().getUpperBoundKeyword_12_0());
                    			
                    // InternalEel.g:4987:4: ( (lv_upperBound_16_0= ruleEInt ) )
                    // InternalEel.g:4988:5: (lv_upperBound_16_0= ruleEInt )
                    {
                    // InternalEel.g:4988:5: (lv_upperBound_16_0= ruleEInt )
                    // InternalEel.g:4989:6: lv_upperBound_16_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getUpperBoundEIntParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_105);
                    lv_upperBound_16_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_16_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5007:3: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==97) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalEel.g:5008:4: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,97,FOLLOW_67); 

                    				newLeafNode(otherlv_17, grammarAccess.getEAttributeAccess().getChangeableKeyword_13_0());
                    			
                    // InternalEel.g:5012:4: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // InternalEel.g:5013:5: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // InternalEel.g:5013:5: (lv_changeable_18_0= ruleEBoolean )
                    // InternalEel.g:5014:6: lv_changeable_18_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getChangeableEBooleanParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_106);
                    lv_changeable_18_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"changeable",
                    							lv_changeable_18_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5032:3: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==98) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalEel.g:5033:4: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,98,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getEAttributeAccess().getDefaultValueLiteralKeyword_14_0());
                    			
                    // InternalEel.g:5037:4: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // InternalEel.g:5038:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // InternalEel.g:5038:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    // InternalEel.g:5039:6: lv_defaultValueLiteral_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_107);
                    lv_defaultValueLiteral_20_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"defaultValueLiteral",
                    							lv_defaultValueLiteral_20_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5057:3: (otherlv_21= 'eType' ( ( ruleEString ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==68) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalEel.g:5058:4: otherlv_21= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_21=(Token)match(input,68,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getEAttributeAccess().getETypeKeyword_15_0());
                    			
                    // InternalEel.g:5062:4: ( ( ruleEString ) )
                    // InternalEel.g:5063:5: ( ruleEString )
                    {
                    // InternalEel.g:5063:5: ( ruleEString )
                    // InternalEel.g:5064:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getETypeEClassifierCrossReference_15_1_0());
                    					
                    pushFollow(FOLLOW_108);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5079:3: (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==58) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalEel.g:5080:4: otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,58,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getEAttributeAccess().getEAnnotationsKeyword_16_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_24, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalEel.g:5088:4: ( (lv_eAnnotations_25_0= ruleEAnnotation ) )
                    // InternalEel.g:5089:5: (lv_eAnnotations_25_0= ruleEAnnotation )
                    {
                    // InternalEel.g:5089:5: (lv_eAnnotations_25_0= ruleEAnnotation )
                    // InternalEel.g:5090:6: lv_eAnnotations_25_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getEAnnotationsEAnnotationParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eAnnotations_25_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_25_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:5107:4: (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )*
                    loop124:
                    do {
                        int alt124=2;
                        int LA124_0 = input.LA(1);

                        if ( (LA124_0==14) ) {
                            alt124=1;
                        }


                        switch (alt124) {
                    	case 1 :
                    	    // InternalEel.g:5108:5: otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_57); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getEAttributeAccess().getCommaKeyword_16_3_0());
                    	    				
                    	    // InternalEel.g:5112:5: ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    // InternalEel.g:5113:6: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:5113:6: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    // InternalEel.g:5114:7: lv_eAnnotations_27_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAttributeAccess().getEAnnotationsEAnnotationParserRuleCall_16_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_eAnnotations_27_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_27_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop124;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,15,FOLLOW_109); 

                    				newLeafNode(otherlv_28, grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_16_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:5137:3: (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==70) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalEel.g:5138:4: otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    {
                    otherlv_29=(Token)match(input,70,FOLLOW_65); 

                    				newLeafNode(otherlv_29, grammarAccess.getEAttributeAccess().getEGenericTypeKeyword_17_0());
                    			
                    // InternalEel.g:5142:4: ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    // InternalEel.g:5143:5: (lv_eGenericType_30_0= ruleEGenericType )
                    {
                    // InternalEel.g:5143:5: (lv_eGenericType_30_0= ruleEGenericType )
                    // InternalEel.g:5144:6: lv_eGenericType_30_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getEGenericTypeEGenericTypeParserRuleCall_17_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_eGenericType_30_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"eGenericType",
                    							lv_eGenericType_30_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_31=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_18());
            		

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
    // $ANTLR end "ruleEAttribute"


    // $ANTLR start "entryRuleEReference"
    // InternalEel.g:5170:1: entryRuleEReference returns [EObject current=null] : iv_ruleEReference= ruleEReference EOF ;
    public final EObject entryRuleEReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEReference = null;


        try {
            // InternalEel.g:5170:51: (iv_ruleEReference= ruleEReference EOF )
            // InternalEel.g:5171:2: iv_ruleEReference= ruleEReference EOF
            {
             newCompositeNode(grammarAccess.getEReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEReference=ruleEReference();

            state._fsp--;

             current =iv_ruleEReference; 
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
    // $ANTLR end "entryRuleEReference"


    // $ANTLR start "ruleEReference"
    // InternalEel.g:5177:1: ruleEReference returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) ;
    public final EObject ruleEReference() throws RecognitionException {
        EObject current = null;

        Token lv_volatile_1_0=null;
        Token lv_transient_2_0=null;
        Token lv_unsettable_3_0=null;
        Token lv_derived_4_0=null;
        Token lv_containment_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        AntlrDatatypeRuleToken lv_name_7_0 = null;

        AntlrDatatypeRuleToken lv_ordered_10_0 = null;

        AntlrDatatypeRuleToken lv_unique_12_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_14_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_16_0 = null;

        AntlrDatatypeRuleToken lv_changeable_18_0 = null;

        AntlrDatatypeRuleToken lv_defaultValueLiteral_20_0 = null;

        AntlrDatatypeRuleToken lv_resolveProxies_22_0 = null;

        EObject lv_eAnnotations_35_0 = null;

        EObject lv_eAnnotations_37_0 = null;

        EObject lv_eGenericType_40_0 = null;



        	enterRule();

        try {
            // InternalEel.g:5183:2: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) )
            // InternalEel.g:5184:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            {
            // InternalEel.g:5184:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            // InternalEel.g:5185:3: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}'
            {
            // InternalEel.g:5185:3: ()
            // InternalEel.g:5186:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEReferenceAccess().getEReferenceAction_0(),
            					current);
            			

            }

            // InternalEel.g:5192:3: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==91) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalEel.g:5193:4: (lv_volatile_1_0= 'volatile' )
                    {
                    // InternalEel.g:5193:4: (lv_volatile_1_0= 'volatile' )
                    // InternalEel.g:5194:5: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,91,FOLLOW_110); 

                    					newLeafNode(lv_volatile_1_0, grammarAccess.getEReferenceAccess().getVolatileVolatileKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "volatile", true, "volatile");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:5206:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==92) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalEel.g:5207:4: (lv_transient_2_0= 'transient' )
                    {
                    // InternalEel.g:5207:4: (lv_transient_2_0= 'transient' )
                    // InternalEel.g:5208:5: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,92,FOLLOW_111); 

                    					newLeafNode(lv_transient_2_0, grammarAccess.getEReferenceAccess().getTransientTransientKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "transient", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:5220:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==93) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalEel.g:5221:4: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // InternalEel.g:5221:4: (lv_unsettable_3_0= 'unsettable' )
                    // InternalEel.g:5222:5: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,93,FOLLOW_112); 

                    					newLeafNode(lv_unsettable_3_0, grammarAccess.getEReferenceAccess().getUnsettableUnsettableKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "unsettable", true, "unsettable");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:5234:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==94) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalEel.g:5235:4: (lv_derived_4_0= 'derived' )
                    {
                    // InternalEel.g:5235:4: (lv_derived_4_0= 'derived' )
                    // InternalEel.g:5236:5: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,94,FOLLOW_113); 

                    					newLeafNode(lv_derived_4_0, grammarAccess.getEReferenceAccess().getDerivedDerivedKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "derived", true, "derived");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:5248:3: ( (lv_containment_5_0= 'containment' ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==99) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalEel.g:5249:4: (lv_containment_5_0= 'containment' )
                    {
                    // InternalEel.g:5249:4: (lv_containment_5_0= 'containment' )
                    // InternalEel.g:5250:5: lv_containment_5_0= 'containment'
                    {
                    lv_containment_5_0=(Token)match(input,99,FOLLOW_114); 

                    					newLeafNode(lv_containment_5_0, grammarAccess.getEReferenceAccess().getContainmentContainmentKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "containment", true, "containment");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,100,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getEReferenceAccess().getEReferenceKeyword_6());
            		
            // InternalEel.g:5266:3: ( (lv_name_7_0= ruleEString ) )
            // InternalEel.g:5267:4: (lv_name_7_0= ruleEString )
            {
            // InternalEel.g:5267:4: (lv_name_7_0= ruleEString )
            // InternalEel.g:5268:5: lv_name_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEReferenceAccess().getNameEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEReferenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,12,FOLLOW_115); 

            			newLeafNode(otherlv_8, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalEel.g:5289:3: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==64) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalEel.g:5290:4: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,64,FOLLOW_67); 

                    				newLeafNode(otherlv_9, grammarAccess.getEReferenceAccess().getOrderedKeyword_9_0());
                    			
                    // InternalEel.g:5294:4: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // InternalEel.g:5295:5: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // InternalEel.g:5295:5: (lv_ordered_10_0= ruleEBoolean )
                    // InternalEel.g:5296:6: lv_ordered_10_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getOrderedEBooleanParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_116);
                    lv_ordered_10_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"ordered",
                    							lv_ordered_10_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5314:3: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==65) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalEel.g:5315:4: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,65,FOLLOW_67); 

                    				newLeafNode(otherlv_11, grammarAccess.getEReferenceAccess().getUniqueKeyword_10_0());
                    			
                    // InternalEel.g:5319:4: ( (lv_unique_12_0= ruleEBoolean ) )
                    // InternalEel.g:5320:5: (lv_unique_12_0= ruleEBoolean )
                    {
                    // InternalEel.g:5320:5: (lv_unique_12_0= ruleEBoolean )
                    // InternalEel.g:5321:6: lv_unique_12_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getUniqueEBooleanParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_117);
                    lv_unique_12_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"unique",
                    							lv_unique_12_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5339:3: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==66) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalEel.g:5340:4: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,66,FOLLOW_70); 

                    				newLeafNode(otherlv_13, grammarAccess.getEReferenceAccess().getLowerBoundKeyword_11_0());
                    			
                    // InternalEel.g:5344:4: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // InternalEel.g:5345:5: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // InternalEel.g:5345:5: (lv_lowerBound_14_0= ruleEInt )
                    // InternalEel.g:5346:6: lv_lowerBound_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getLowerBoundEIntParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_118);
                    lv_lowerBound_14_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_14_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5364:3: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==67) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalEel.g:5365:4: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,67,FOLLOW_70); 

                    				newLeafNode(otherlv_15, grammarAccess.getEReferenceAccess().getUpperBoundKeyword_12_0());
                    			
                    // InternalEel.g:5369:4: ( (lv_upperBound_16_0= ruleEInt ) )
                    // InternalEel.g:5370:5: (lv_upperBound_16_0= ruleEInt )
                    {
                    // InternalEel.g:5370:5: (lv_upperBound_16_0= ruleEInt )
                    // InternalEel.g:5371:6: lv_upperBound_16_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getUpperBoundEIntParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_119);
                    lv_upperBound_16_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_16_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5389:3: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==97) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalEel.g:5390:4: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,97,FOLLOW_67); 

                    				newLeafNode(otherlv_17, grammarAccess.getEReferenceAccess().getChangeableKeyword_13_0());
                    			
                    // InternalEel.g:5394:4: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // InternalEel.g:5395:5: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // InternalEel.g:5395:5: (lv_changeable_18_0= ruleEBoolean )
                    // InternalEel.g:5396:6: lv_changeable_18_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getChangeableEBooleanParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_120);
                    lv_changeable_18_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"changeable",
                    							lv_changeable_18_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5414:3: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==98) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalEel.g:5415:4: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,98,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getEReferenceAccess().getDefaultValueLiteralKeyword_14_0());
                    			
                    // InternalEel.g:5419:4: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // InternalEel.g:5420:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // InternalEel.g:5420:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    // InternalEel.g:5421:6: lv_defaultValueLiteral_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_121);
                    lv_defaultValueLiteral_20_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"defaultValueLiteral",
                    							lv_defaultValueLiteral_20_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5439:3: (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==101) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalEel.g:5440:4: otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    {
                    otherlv_21=(Token)match(input,101,FOLLOW_67); 

                    				newLeafNode(otherlv_21, grammarAccess.getEReferenceAccess().getResolveProxiesKeyword_15_0());
                    			
                    // InternalEel.g:5444:4: ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    // InternalEel.g:5445:5: (lv_resolveProxies_22_0= ruleEBoolean )
                    {
                    // InternalEel.g:5445:5: (lv_resolveProxies_22_0= ruleEBoolean )
                    // InternalEel.g:5446:6: lv_resolveProxies_22_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getResolveProxiesEBooleanParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_122);
                    lv_resolveProxies_22_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"resolveProxies",
                    							lv_resolveProxies_22_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5464:3: (otherlv_23= 'eType' ( ( ruleEString ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==68) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalEel.g:5465:4: otherlv_23= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_23=(Token)match(input,68,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getEReferenceAccess().getETypeKeyword_16_0());
                    			
                    // InternalEel.g:5469:4: ( ( ruleEString ) )
                    // InternalEel.g:5470:5: ( ruleEString )
                    {
                    // InternalEel.g:5470:5: ( ruleEString )
                    // InternalEel.g:5471:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getETypeEClassifierCrossReference_16_1_0());
                    					
                    pushFollow(FOLLOW_123);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5486:3: (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==102) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalEel.g:5487:4: otherlv_25= 'eOpposite' ( ( ruleEString ) )
                    {
                    otherlv_25=(Token)match(input,102,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getEReferenceAccess().getEOppositeKeyword_17_0());
                    			
                    // InternalEel.g:5491:4: ( ( ruleEString ) )
                    // InternalEel.g:5492:5: ( ruleEString )
                    {
                    // InternalEel.g:5492:5: ( ruleEString )
                    // InternalEel.g:5493:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEOppositeEReferenceCrossReference_17_1_0());
                    					
                    pushFollow(FOLLOW_124);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5508:3: (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==103) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalEel.g:5509:4: otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')'
                    {
                    otherlv_27=(Token)match(input,103,FOLLOW_54); 

                    				newLeafNode(otherlv_27, grammarAccess.getEReferenceAccess().getEKeysKeyword_18_0());
                    			
                    otherlv_28=(Token)match(input,56,FOLLOW_3); 

                    				newLeafNode(otherlv_28, grammarAccess.getEReferenceAccess().getLeftParenthesisKeyword_18_1());
                    			
                    // InternalEel.g:5517:4: ( ( ruleEString ) )
                    // InternalEel.g:5518:5: ( ruleEString )
                    {
                    // InternalEel.g:5518:5: ( ruleEString )
                    // InternalEel.g:5519:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_2_0());
                    					
                    pushFollow(FOLLOW_55);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:5533:4: (otherlv_30= ',' ( ( ruleEString ) ) )*
                    loop141:
                    do {
                        int alt141=2;
                        int LA141_0 = input.LA(1);

                        if ( (LA141_0==14) ) {
                            alt141=1;
                        }


                        switch (alt141) {
                    	case 1 :
                    	    // InternalEel.g:5534:5: otherlv_30= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_30=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_30, grammarAccess.getEReferenceAccess().getCommaKeyword_18_3_0());
                    	    				
                    	    // InternalEel.g:5538:5: ( ( ruleEString ) )
                    	    // InternalEel.g:5539:6: ( ruleEString )
                    	    {
                    	    // InternalEel.g:5539:6: ( ruleEString )
                    	    // InternalEel.g:5540:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEReferenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_55);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop141;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,57,FOLLOW_108); 

                    				newLeafNode(otherlv_32, grammarAccess.getEReferenceAccess().getRightParenthesisKeyword_18_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:5560:3: (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==58) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalEel.g:5561:4: otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,58,FOLLOW_4); 

                    				newLeafNode(otherlv_33, grammarAccess.getEReferenceAccess().getEAnnotationsKeyword_19_0());
                    			
                    otherlv_34=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_34, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_19_1());
                    			
                    // InternalEel.g:5569:4: ( (lv_eAnnotations_35_0= ruleEAnnotation ) )
                    // InternalEel.g:5570:5: (lv_eAnnotations_35_0= ruleEAnnotation )
                    {
                    // InternalEel.g:5570:5: (lv_eAnnotations_35_0= ruleEAnnotation )
                    // InternalEel.g:5571:6: lv_eAnnotations_35_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEAnnotationsEAnnotationParserRuleCall_19_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eAnnotations_35_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_35_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:5588:4: (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )*
                    loop143:
                    do {
                        int alt143=2;
                        int LA143_0 = input.LA(1);

                        if ( (LA143_0==14) ) {
                            alt143=1;
                        }


                        switch (alt143) {
                    	case 1 :
                    	    // InternalEel.g:5589:5: otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_36=(Token)match(input,14,FOLLOW_57); 

                    	    					newLeafNode(otherlv_36, grammarAccess.getEReferenceAccess().getCommaKeyword_19_3_0());
                    	    				
                    	    // InternalEel.g:5593:5: ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    // InternalEel.g:5594:6: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:5594:6: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    // InternalEel.g:5595:7: lv_eAnnotations_37_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEReferenceAccess().getEAnnotationsEAnnotationParserRuleCall_19_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_eAnnotations_37_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_37_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop143;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,15,FOLLOW_109); 

                    				newLeafNode(otherlv_38, grammarAccess.getEReferenceAccess().getRightCurlyBracketKeyword_19_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:5618:3: (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==70) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalEel.g:5619:4: otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    {
                    otherlv_39=(Token)match(input,70,FOLLOW_65); 

                    				newLeafNode(otherlv_39, grammarAccess.getEReferenceAccess().getEGenericTypeKeyword_20_0());
                    			
                    // InternalEel.g:5623:4: ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    // InternalEel.g:5624:5: (lv_eGenericType_40_0= ruleEGenericType )
                    {
                    // InternalEel.g:5624:5: (lv_eGenericType_40_0= ruleEGenericType )
                    // InternalEel.g:5625:6: lv_eGenericType_40_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEGenericTypeEGenericTypeParserRuleCall_20_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_eGenericType_40_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"eGenericType",
                    							lv_eGenericType_40_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_41=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_41, grammarAccess.getEReferenceAccess().getRightCurlyBracketKeyword_21());
            		

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
    // $ANTLR end "ruleEReference"


    // $ANTLR start "entryRuleEDataType_Impl"
    // InternalEel.g:5651:1: entryRuleEDataType_Impl returns [EObject current=null] : iv_ruleEDataType_Impl= ruleEDataType_Impl EOF ;
    public final EObject entryRuleEDataType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataType_Impl = null;


        try {
            // InternalEel.g:5651:55: (iv_ruleEDataType_Impl= ruleEDataType_Impl EOF )
            // InternalEel.g:5652:2: iv_ruleEDataType_Impl= ruleEDataType_Impl EOF
            {
             newCompositeNode(grammarAccess.getEDataType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDataType_Impl=ruleEDataType_Impl();

            state._fsp--;

             current =iv_ruleEDataType_Impl; 
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
    // $ANTLR end "entryRuleEDataType_Impl"


    // $ANTLR start "ruleEDataType_Impl"
    // InternalEel.g:5658:1: ruleEDataType_Impl returns [EObject current=null] : ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleEDataType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_5_0 = null;

        AntlrDatatypeRuleToken lv_instanceTypeName_7_0 = null;

        AntlrDatatypeRuleToken lv_serializable_9_0 = null;

        EObject lv_eAnnotations_12_0 = null;

        EObject lv_eAnnotations_14_0 = null;

        EObject lv_eTypeParameters_18_0 = null;

        EObject lv_eTypeParameters_20_0 = null;



        	enterRule();

        try {
            // InternalEel.g:5664:2: ( ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalEel.g:5665:2: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalEel.g:5665:2: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalEel.g:5666:3: () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalEel.g:5666:3: ()
            // InternalEel.g:5667:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEDataType_ImplAccess().getEDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,104,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEDataType_ImplAccess().getEDataTypeKeyword_1());
            		
            // InternalEel.g:5677:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:5678:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:5678:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:5679:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEDataType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_125); 

            			newLeafNode(otherlv_3, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:5700:3: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==53) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalEel.g:5701:4: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEDataType_ImplAccess().getInstanceClassNameKeyword_4_0());
                    			
                    // InternalEel.g:5705:4: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // InternalEel.g:5706:5: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // InternalEel.g:5706:5: (lv_instanceClassName_5_0= ruleEString )
                    // InternalEel.g:5707:6: lv_instanceClassName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceClassNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_126);
                    lv_instanceClassName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						set(
                    							current,
                    							"instanceClassName",
                    							lv_instanceClassName_5_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5725:3: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==54) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalEel.g:5726:4: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameKeyword_5_0());
                    			
                    // InternalEel.g:5730:4: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // InternalEel.g:5731:5: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // InternalEel.g:5731:5: (lv_instanceTypeName_7_0= ruleEString )
                    // InternalEel.g:5732:6: lv_instanceTypeName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_127);
                    lv_instanceTypeName_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						set(
                    							current,
                    							"instanceTypeName",
                    							lv_instanceTypeName_7_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5750:3: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==105) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalEel.g:5751:4: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,105,FOLLOW_67); 

                    				newLeafNode(otherlv_8, grammarAccess.getEDataType_ImplAccess().getSerializableKeyword_6_0());
                    			
                    // InternalEel.g:5755:4: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // InternalEel.g:5756:5: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // InternalEel.g:5756:5: (lv_serializable_9_0= ruleEBoolean )
                    // InternalEel.g:5757:6: lv_serializable_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getSerializableEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_128);
                    lv_serializable_9_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						set(
                    							current,
                    							"serializable",
                    							lv_serializable_9_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5775:3: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==58) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalEel.g:5776:4: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,58,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEDataType_ImplAccess().getEAnnotationsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_11, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalEel.g:5784:4: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // InternalEel.g:5785:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // InternalEel.g:5785:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // InternalEel.g:5786:6: lv_eAnnotations_12_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getEAnnotationsEAnnotationParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eAnnotations_12_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_12_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:5803:4: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop149:
                    do {
                        int alt149=2;
                        int LA149_0 = input.LA(1);

                        if ( (LA149_0==14) ) {
                            alt149=1;
                        }


                        switch (alt149) {
                    	case 1 :
                    	    // InternalEel.g:5804:5: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_57); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalEel.g:5808:5: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // InternalEel.g:5809:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:5809:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // InternalEel.g:5810:7: lv_eAnnotations_14_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEDataType_ImplAccess().getEAnnotationsEAnnotationParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_eAnnotations_14_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_14_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop149;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_129); 

                    				newLeafNode(otherlv_15, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:5833:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==59) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalEel.g:5834:4: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,59,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEDataType_ImplAccess().getETypeParametersKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_59); 

                    				newLeafNode(otherlv_17, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalEel.g:5842:4: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // InternalEel.g:5843:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // InternalEel.g:5843:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // InternalEel.g:5844:6: lv_eTypeParameters_18_0= ruleETypeParameter
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getETypeParametersETypeParameterParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eTypeParameters_18_0=ruleETypeParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						add(
                    							current,
                    							"eTypeParameters",
                    							lv_eTypeParameters_18_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.ETypeParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:5861:4: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop151:
                    do {
                        int alt151=2;
                        int LA151_0 = input.LA(1);

                        if ( (LA151_0==14) ) {
                            alt151=1;
                        }


                        switch (alt151) {
                    	case 1 :
                    	    // InternalEel.g:5862:5: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_59); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalEel.g:5866:5: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // InternalEel.g:5867:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // InternalEel.g:5867:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // InternalEel.g:5868:7: lv_eTypeParameters_20_0= ruleETypeParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEDataType_ImplAccess().getETypeParametersETypeParameterParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_eTypeParameters_20_0=ruleETypeParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eTypeParameters",
                    	    								lv_eTypeParameters_20_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.ETypeParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop151;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_21, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleEDataType_Impl"


    // $ANTLR start "entryRuleEEnum"
    // InternalEel.g:5899:1: entryRuleEEnum returns [EObject current=null] : iv_ruleEEnum= ruleEEnum EOF ;
    public final EObject entryRuleEEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnum = null;


        try {
            // InternalEel.g:5899:46: (iv_ruleEEnum= ruleEEnum EOF )
            // InternalEel.g:5900:2: iv_ruleEEnum= ruleEEnum EOF
            {
             newCompositeNode(grammarAccess.getEEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEEnum=ruleEEnum();

            state._fsp--;

             current =iv_ruleEEnum; 
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
    // $ANTLR end "entryRuleEEnum"


    // $ANTLR start "ruleEEnum"
    // InternalEel.g:5906:1: ruleEEnum returns [EObject current=null] : ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
    public final EObject ruleEEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_5_0 = null;

        AntlrDatatypeRuleToken lv_instanceTypeName_7_0 = null;

        AntlrDatatypeRuleToken lv_serializable_9_0 = null;

        EObject lv_eAnnotations_12_0 = null;

        EObject lv_eAnnotations_14_0 = null;

        EObject lv_eTypeParameters_18_0 = null;

        EObject lv_eTypeParameters_20_0 = null;

        EObject lv_eLiterals_24_0 = null;

        EObject lv_eLiterals_26_0 = null;



        	enterRule();

        try {
            // InternalEel.g:5912:2: ( ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // InternalEel.g:5913:2: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // InternalEel.g:5913:2: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // InternalEel.g:5914:3: () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // InternalEel.g:5914:3: ()
            // InternalEel.g:5915:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEEnumAccess().getEEnumAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,106,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEEnumAccess().getEEnumKeyword_1());
            		
            // InternalEel.g:5925:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:5926:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:5926:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:5927:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEEnumAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEEnumRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_130); 

            			newLeafNode(otherlv_3, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:5948:3: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==53) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // InternalEel.g:5949:4: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEEnumAccess().getInstanceClassNameKeyword_4_0());
                    			
                    // InternalEel.g:5953:4: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // InternalEel.g:5954:5: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // InternalEel.g:5954:5: (lv_instanceClassName_5_0= ruleEString )
                    // InternalEel.g:5955:6: lv_instanceClassName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getInstanceClassNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_131);
                    lv_instanceClassName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						set(
                    							current,
                    							"instanceClassName",
                    							lv_instanceClassName_5_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5973:3: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==54) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // InternalEel.g:5974:4: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEEnumAccess().getInstanceTypeNameKeyword_5_0());
                    			
                    // InternalEel.g:5978:4: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // InternalEel.g:5979:5: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // InternalEel.g:5979:5: (lv_instanceTypeName_7_0= ruleEString )
                    // InternalEel.g:5980:6: lv_instanceTypeName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_132);
                    lv_instanceTypeName_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						set(
                    							current,
                    							"instanceTypeName",
                    							lv_instanceTypeName_7_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5998:3: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==105) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // InternalEel.g:5999:4: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,105,FOLLOW_67); 

                    				newLeafNode(otherlv_8, grammarAccess.getEEnumAccess().getSerializableKeyword_6_0());
                    			
                    // InternalEel.g:6003:4: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // InternalEel.g:6004:5: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // InternalEel.g:6004:5: (lv_serializable_9_0= ruleEBoolean )
                    // InternalEel.g:6005:6: lv_serializable_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getSerializableEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_133);
                    lv_serializable_9_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						set(
                    							current,
                    							"serializable",
                    							lv_serializable_9_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:6023:3: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==58) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // InternalEel.g:6024:4: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,58,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEEnumAccess().getEAnnotationsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_11, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalEel.g:6032:4: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // InternalEel.g:6033:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // InternalEel.g:6033:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // InternalEel.g:6034:6: lv_eAnnotations_12_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getEAnnotationsEAnnotationParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eAnnotations_12_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_12_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:6051:4: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop156:
                    do {
                        int alt156=2;
                        int LA156_0 = input.LA(1);

                        if ( (LA156_0==14) ) {
                            alt156=1;
                        }


                        switch (alt156) {
                    	case 1 :
                    	    // InternalEel.g:6052:5: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_57); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEEnumAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalEel.g:6056:5: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // InternalEel.g:6057:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:6057:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // InternalEel.g:6058:7: lv_eAnnotations_14_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEEnumAccess().getEAnnotationsEAnnotationParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_eAnnotations_14_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_14_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop156;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_134); 

                    				newLeafNode(otherlv_15, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:6081:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==59) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // InternalEel.g:6082:4: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,59,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEEnumAccess().getETypeParametersKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_59); 

                    				newLeafNode(otherlv_17, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalEel.g:6090:4: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // InternalEel.g:6091:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // InternalEel.g:6091:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // InternalEel.g:6092:6: lv_eTypeParameters_18_0= ruleETypeParameter
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getETypeParametersETypeParameterParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eTypeParameters_18_0=ruleETypeParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						add(
                    							current,
                    							"eTypeParameters",
                    							lv_eTypeParameters_18_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.ETypeParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:6109:4: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop158:
                    do {
                        int alt158=2;
                        int LA158_0 = input.LA(1);

                        if ( (LA158_0==14) ) {
                            alt158=1;
                        }


                        switch (alt158) {
                    	case 1 :
                    	    // InternalEel.g:6110:5: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_59); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEEnumAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalEel.g:6114:5: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // InternalEel.g:6115:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // InternalEel.g:6115:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // InternalEel.g:6116:7: lv_eTypeParameters_20_0= ruleETypeParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEEnumAccess().getETypeParametersETypeParameterParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_eTypeParameters_20_0=ruleETypeParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eTypeParameters",
                    	    								lv_eTypeParameters_20_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.ETypeParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop158;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_135); 

                    				newLeafNode(otherlv_21, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:6139:3: (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==107) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // InternalEel.g:6140:4: otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,107,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getEEnumAccess().getELiteralsKeyword_9_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_136); 

                    				newLeafNode(otherlv_23, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalEel.g:6148:4: ( (lv_eLiterals_24_0= ruleEEnumLiteral ) )
                    // InternalEel.g:6149:5: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    {
                    // InternalEel.g:6149:5: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    // InternalEel.g:6150:6: lv_eLiterals_24_0= ruleEEnumLiteral
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getELiteralsEEnumLiteralParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eLiterals_24_0=ruleEEnumLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						add(
                    							current,
                    							"eLiterals",
                    							lv_eLiterals_24_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EEnumLiteral");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:6167:4: (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )*
                    loop160:
                    do {
                        int alt160=2;
                        int LA160_0 = input.LA(1);

                        if ( (LA160_0==14) ) {
                            alt160=1;
                        }


                        switch (alt160) {
                    	case 1 :
                    	    // InternalEel.g:6168:5: otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_136); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getEEnumAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalEel.g:6172:5: ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    // InternalEel.g:6173:6: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    {
                    	    // InternalEel.g:6173:6: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    // InternalEel.g:6174:7: lv_eLiterals_26_0= ruleEEnumLiteral
                    	    {

                    	    							newCompositeNode(grammarAccess.getEEnumAccess().getELiteralsEEnumLiteralParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_eLiterals_26_0=ruleEEnumLiteral();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eLiterals",
                    	    								lv_eLiterals_26_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.EEnumLiteral");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop160;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_27, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_28=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleEEnum"


    // $ANTLR start "entryRuleEEnumLiteral"
    // InternalEel.g:6205:1: entryRuleEEnumLiteral returns [EObject current=null] : iv_ruleEEnumLiteral= ruleEEnumLiteral EOF ;
    public final EObject entryRuleEEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnumLiteral = null;


        try {
            // InternalEel.g:6205:53: (iv_ruleEEnumLiteral= ruleEEnumLiteral EOF )
            // InternalEel.g:6206:2: iv_ruleEEnumLiteral= ruleEEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getEEnumLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEEnumLiteral=ruleEEnumLiteral();

            state._fsp--;

             current =iv_ruleEEnumLiteral; 
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
    // $ANTLR end "entryRuleEEnumLiteral"


    // $ANTLR start "ruleEEnumLiteral"
    // InternalEel.g:6212:1: ruleEEnumLiteral returns [EObject current=null] : ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleEEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_literal_7_0 = null;

        EObject lv_eAnnotations_10_0 = null;

        EObject lv_eAnnotations_12_0 = null;



        	enterRule();

        try {
            // InternalEel.g:6218:2: ( ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalEel.g:6219:2: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalEel.g:6219:2: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalEel.g:6220:3: () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalEel.g:6220:3: ()
            // InternalEel.g:6221:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEEnumLiteralAccess().getEEnumLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,108,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEEnumLiteralAccess().getEEnumLiteralKeyword_1());
            		
            // InternalEel.g:6231:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:6232:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:6232:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:6233:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEEnumLiteralAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_137); 

            			newLeafNode(otherlv_3, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:6254:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==18) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // InternalEel.g:6255:4: otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_70); 

                    				newLeafNode(otherlv_4, grammarAccess.getEEnumLiteralAccess().getValueKeyword_4_0());
                    			
                    // InternalEel.g:6259:4: ( (lv_value_5_0= ruleEInt ) )
                    // InternalEel.g:6260:5: (lv_value_5_0= ruleEInt )
                    {
                    // InternalEel.g:6260:5: (lv_value_5_0= ruleEInt )
                    // InternalEel.g:6261:6: lv_value_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getValueEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_138);
                    lv_value_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:6279:3: (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==109) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // InternalEel.g:6280:4: otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,109,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEEnumLiteralAccess().getLiteralKeyword_5_0());
                    			
                    // InternalEel.g:6284:4: ( (lv_literal_7_0= ruleEString ) )
                    // InternalEel.g:6285:5: (lv_literal_7_0= ruleEString )
                    {
                    // InternalEel.g:6285:5: (lv_literal_7_0= ruleEString )
                    // InternalEel.g:6286:6: lv_literal_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getLiteralEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_139);
                    lv_literal_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    						}
                    						set(
                    							current,
                    							"literal",
                    							lv_literal_7_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:6304:3: (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==58) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // InternalEel.g:6305:4: otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,58,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEEnumLiteralAccess().getEAnnotationsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_9, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalEel.g:6313:4: ( (lv_eAnnotations_10_0= ruleEAnnotation ) )
                    // InternalEel.g:6314:5: (lv_eAnnotations_10_0= ruleEAnnotation )
                    {
                    // InternalEel.g:6314:5: (lv_eAnnotations_10_0= ruleEAnnotation )
                    // InternalEel.g:6315:6: lv_eAnnotations_10_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getEAnnotationsEAnnotationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eAnnotations_10_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_10_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:6332:4: (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )*
                    loop164:
                    do {
                        int alt164=2;
                        int LA164_0 = input.LA(1);

                        if ( (LA164_0==14) ) {
                            alt164=1;
                        }


                        switch (alt164) {
                    	case 1 :
                    	    // InternalEel.g:6333:5: otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_57); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getEEnumLiteralAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalEel.g:6337:5: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    // InternalEel.g:6338:6: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:6338:6: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    // InternalEel.g:6339:7: lv_eAnnotations_12_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEEnumLiteralAccess().getEAnnotationsEAnnotationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_eAnnotations_12_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_12_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop164;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getEEnumLiteralAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getEEnumLiteralAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleEEnumLiteral"


    // $ANTLR start "entryRuleEParameter"
    // InternalEel.g:6370:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // InternalEel.g:6370:51: (iv_ruleEParameter= ruleEParameter EOF )
            // InternalEel.g:6371:2: iv_ruleEParameter= ruleEParameter EOF
            {
             newCompositeNode(grammarAccess.getEParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEParameter=ruleEParameter();

            state._fsp--;

             current =iv_ruleEParameter; 
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
    // $ANTLR end "entryRuleEParameter"


    // $ANTLR start "ruleEParameter"
    // InternalEel.g:6377:1: ruleEParameter returns [EObject current=null] : ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) ;
    public final EObject ruleEParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ordered_5_0 = null;

        AntlrDatatypeRuleToken lv_unique_7_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_9_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_11_0 = null;

        EObject lv_eAnnotations_16_0 = null;

        EObject lv_eAnnotations_18_0 = null;

        EObject lv_eGenericType_21_0 = null;



        	enterRule();

        try {
            // InternalEel.g:6383:2: ( ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) )
            // InternalEel.g:6384:2: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            {
            // InternalEel.g:6384:2: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            // InternalEel.g:6385:3: () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}'
            {
            // InternalEel.g:6385:3: ()
            // InternalEel.g:6386:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEParameterAccess().getEParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,110,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEParameterAccess().getEParameterKeyword_1());
            		
            // InternalEel.g:6396:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:6397:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:6397:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:6398:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.atlanmod.energy.estimation.dsl.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_140); 

            			newLeafNode(otherlv_3, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:6419:3: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==64) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // InternalEel.g:6420:4: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,64,FOLLOW_67); 

                    				newLeafNode(otherlv_4, grammarAccess.getEParameterAccess().getOrderedKeyword_4_0());
                    			
                    // InternalEel.g:6424:4: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // InternalEel.g:6425:5: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // InternalEel.g:6425:5: (lv_ordered_5_0= ruleEBoolean )
                    // InternalEel.g:6426:6: lv_ordered_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getOrderedEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_141);
                    lv_ordered_5_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"ordered",
                    							lv_ordered_5_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:6444:3: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==65) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // InternalEel.g:6445:4: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,65,FOLLOW_67); 

                    				newLeafNode(otherlv_6, grammarAccess.getEParameterAccess().getUniqueKeyword_5_0());
                    			
                    // InternalEel.g:6449:4: ( (lv_unique_7_0= ruleEBoolean ) )
                    // InternalEel.g:6450:5: (lv_unique_7_0= ruleEBoolean )
                    {
                    // InternalEel.g:6450:5: (lv_unique_7_0= ruleEBoolean )
                    // InternalEel.g:6451:6: lv_unique_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getUniqueEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_142);
                    lv_unique_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"unique",
                    							lv_unique_7_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:6469:3: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==66) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // InternalEel.g:6470:4: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,66,FOLLOW_70); 

                    				newLeafNode(otherlv_8, grammarAccess.getEParameterAccess().getLowerBoundKeyword_6_0());
                    			
                    // InternalEel.g:6474:4: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // InternalEel.g:6475:5: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // InternalEel.g:6475:5: (lv_lowerBound_9_0= ruleEInt )
                    // InternalEel.g:6476:6: lv_lowerBound_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getLowerBoundEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_143);
                    lv_lowerBound_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_9_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:6494:3: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==67) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // InternalEel.g:6495:4: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,67,FOLLOW_70); 

                    				newLeafNode(otherlv_10, grammarAccess.getEParameterAccess().getUpperBoundKeyword_7_0());
                    			
                    // InternalEel.g:6499:4: ( (lv_upperBound_11_0= ruleEInt ) )
                    // InternalEel.g:6500:5: (lv_upperBound_11_0= ruleEInt )
                    {
                    // InternalEel.g:6500:5: (lv_upperBound_11_0= ruleEInt )
                    // InternalEel.g:6501:6: lv_upperBound_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getUpperBoundEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_107);
                    lv_upperBound_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_11_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:6519:3: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==68) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // InternalEel.g:6520:4: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,68,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getEParameterAccess().getETypeKeyword_8_0());
                    			
                    // InternalEel.g:6524:4: ( ( ruleEString ) )
                    // InternalEel.g:6525:5: ( ruleEString )
                    {
                    // InternalEel.g:6525:5: ( ruleEString )
                    // InternalEel.g:6526:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEParameterRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEParameterAccess().getETypeEClassifierCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_108);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:6541:3: (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==58) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // InternalEel.g:6542:4: otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,58,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getEParameterAccess().getEAnnotationsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_15, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalEel.g:6550:4: ( (lv_eAnnotations_16_0= ruleEAnnotation ) )
                    // InternalEel.g:6551:5: (lv_eAnnotations_16_0= ruleEAnnotation )
                    {
                    // InternalEel.g:6551:5: (lv_eAnnotations_16_0= ruleEAnnotation )
                    // InternalEel.g:6552:6: lv_eAnnotations_16_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getEAnnotationsEAnnotationParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eAnnotations_16_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_16_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:6569:4: (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )*
                    loop171:
                    do {
                        int alt171=2;
                        int LA171_0 = input.LA(1);

                        if ( (LA171_0==14) ) {
                            alt171=1;
                        }


                        switch (alt171) {
                    	case 1 :
                    	    // InternalEel.g:6570:5: otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_57); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEParameterAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalEel.g:6574:5: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    // InternalEel.g:6575:6: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:6575:6: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    // InternalEel.g:6576:7: lv_eAnnotations_18_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEParameterAccess().getEAnnotationsEAnnotationParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_eAnnotations_18_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEParameterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_18_0,
                    	    								"org.atlanmod.energy.estimation.dsl.Eel.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop171;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,15,FOLLOW_109); 

                    				newLeafNode(otherlv_19, grammarAccess.getEParameterAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:6599:3: (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==70) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // InternalEel.g:6600:4: otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    {
                    otherlv_20=(Token)match(input,70,FOLLOW_65); 

                    				newLeafNode(otherlv_20, grammarAccess.getEParameterAccess().getEGenericTypeKeyword_10_0());
                    			
                    // InternalEel.g:6604:4: ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    // InternalEel.g:6605:5: (lv_eGenericType_21_0= ruleEGenericType )
                    {
                    // InternalEel.g:6605:5: (lv_eGenericType_21_0= ruleEGenericType )
                    // InternalEel.g:6606:6: lv_eGenericType_21_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getEGenericTypeEGenericTypeParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_eGenericType_21_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"eGenericType",
                    							lv_eGenericType_21_0,
                    							"org.atlanmod.energy.estimation.dsl.Eel.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getEParameterAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleEParameter"


    // $ANTLR start "ruleType"
    // InternalEel.g:6632:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'current' ) | (enumLiteral_1= 'duration' ) | (enumLiteral_2= 'energy' ) | (enumLiteral_3= 'frequency' ) | (enumLiteral_4= 'power' ) | (enumLiteral_5= 'voltage' ) | (enumLiteral_6= 'scalar' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalEel.g:6638:2: ( ( (enumLiteral_0= 'current' ) | (enumLiteral_1= 'duration' ) | (enumLiteral_2= 'energy' ) | (enumLiteral_3= 'frequency' ) | (enumLiteral_4= 'power' ) | (enumLiteral_5= 'voltage' ) | (enumLiteral_6= 'scalar' ) ) )
            // InternalEel.g:6639:2: ( (enumLiteral_0= 'current' ) | (enumLiteral_1= 'duration' ) | (enumLiteral_2= 'energy' ) | (enumLiteral_3= 'frequency' ) | (enumLiteral_4= 'power' ) | (enumLiteral_5= 'voltage' ) | (enumLiteral_6= 'scalar' ) )
            {
            // InternalEel.g:6639:2: ( (enumLiteral_0= 'current' ) | (enumLiteral_1= 'duration' ) | (enumLiteral_2= 'energy' ) | (enumLiteral_3= 'frequency' ) | (enumLiteral_4= 'power' ) | (enumLiteral_5= 'voltage' ) | (enumLiteral_6= 'scalar' ) )
            int alt174=7;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt174=1;
                }
                break;
            case 112:
                {
                alt174=2;
                }
                break;
            case 113:
                {
                alt174=3;
                }
                break;
            case 114:
                {
                alt174=4;
                }
                break;
            case 115:
                {
                alt174=5;
                }
                break;
            case 116:
                {
                alt174=6;
                }
                break;
            case 117:
                {
                alt174=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 174, 0, input);

                throw nvae;
            }

            switch (alt174) {
                case 1 :
                    // InternalEel.g:6640:3: (enumLiteral_0= 'current' )
                    {
                    // InternalEel.g:6640:3: (enumLiteral_0= 'current' )
                    // InternalEel.g:6641:4: enumLiteral_0= 'current'
                    {
                    enumLiteral_0=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getCurrentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getCurrentEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:6648:3: (enumLiteral_1= 'duration' )
                    {
                    // InternalEel.g:6648:3: (enumLiteral_1= 'duration' )
                    // InternalEel.g:6649:4: enumLiteral_1= 'duration'
                    {
                    enumLiteral_1=(Token)match(input,112,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDurationEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getDurationEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEel.g:6656:3: (enumLiteral_2= 'energy' )
                    {
                    // InternalEel.g:6656:3: (enumLiteral_2= 'energy' )
                    // InternalEel.g:6657:4: enumLiteral_2= 'energy'
                    {
                    enumLiteral_2=(Token)match(input,113,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getEnergyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getEnergyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEel.g:6664:3: (enumLiteral_3= 'frequency' )
                    {
                    // InternalEel.g:6664:3: (enumLiteral_3= 'frequency' )
                    // InternalEel.g:6665:4: enumLiteral_3= 'frequency'
                    {
                    enumLiteral_3=(Token)match(input,114,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFrequencyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getFrequencyEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEel.g:6672:3: (enumLiteral_4= 'power' )
                    {
                    // InternalEel.g:6672:3: (enumLiteral_4= 'power' )
                    // InternalEel.g:6673:4: enumLiteral_4= 'power'
                    {
                    enumLiteral_4=(Token)match(input,115,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getPowerEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getPowerEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalEel.g:6680:3: (enumLiteral_5= 'voltage' )
                    {
                    // InternalEel.g:6680:3: (enumLiteral_5= 'voltage' )
                    // InternalEel.g:6681:4: enumLiteral_5= 'voltage'
                    {
                    enumLiteral_5=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getVoltageEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getVoltageEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalEel.g:6688:3: (enumLiteral_6= 'scalar' )
                    {
                    // InternalEel.g:6688:3: (enumLiteral_6= 'scalar' )
                    // InternalEel.g:6689:4: enumLiteral_6= 'scalar'
                    {
                    enumLiteral_6=(Token)match(input,117,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getScalarEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTypeAccess().getScalarEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleType"


    // $ANTLR start "ruleVisibility"
    // InternalEel.g:6699:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEel.g:6705:2: ( ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) ) )
            // InternalEel.g:6706:2: ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) )
            {
            // InternalEel.g:6706:2: ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) )
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==118) ) {
                alt175=1;
            }
            else if ( (LA175_0==119) ) {
                alt175=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 175, 0, input);

                throw nvae;
            }
            switch (alt175) {
                case 1 :
                    // InternalEel.g:6707:3: (enumLiteral_0= 'LOCAL' )
                    {
                    // InternalEel.g:6707:3: (enumLiteral_0= 'LOCAL' )
                    // InternalEel.g:6708:4: enumLiteral_0= 'LOCAL'
                    {
                    enumLiteral_0=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getLOCALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:6715:3: (enumLiteral_1= 'GLOBAL' )
                    {
                    // InternalEel.g:6715:3: (enumLiteral_1= 'GLOBAL' )
                    // InternalEel.g:6716:4: enumLiteral_1= 'GLOBAL'
                    {
                    enumLiteral_1=(Token)match(input,119,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getGLOBALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getGLOBALEnumLiteralDeclaration_1());
                    			

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


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\41\uffff";
    static final String dfa_2s = "\22\uffff\2\26\15\uffff";
    static final String dfa_3s = "\2\4\2\24\2\4\1\uffff\2\24\11\27\2\4\2\34\4\uffff\2\32\5\uffff";
    static final String dfa_4s = "\1\25\1\5\2\33\1\5\1\165\1\uffff\2\33\11\27\2\51\2\37\4\uffff\2\37\5\uffff";
    static final String dfa_5s = "\6\uffff\1\11\17\uffff\1\1\1\2\1\3\1\12\2\uffff\1\10\1\7\1\6\1\5\1\4";
    static final String dfa_6s = "\41\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\17\uffff\1\1",
            "\1\2\1\3",
            "\1\5\1\uffff\1\4\4\uffff\1\6",
            "\1\5\1\uffff\1\4\4\uffff\1\6",
            "\1\7\1\10",
            "\1\20\1\21\151\uffff\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "",
            "\1\5\6\uffff\1\6",
            "\1\5\6\uffff\1\6",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\23",
            "\1\23",
            "\1\24\1\25\1\26\7\uffff\2\26\4\uffff\1\26\3\uffff\1\27\1\30\6\uffff\3\31\6\uffff\1\26",
            "\1\32\1\33\1\26\7\uffff\2\26\4\uffff\1\26\3\uffff\1\27\1\30\6\uffff\3\31\6\uffff\1\26",
            "\1\36\1\34\1\37\1\35",
            "\1\36\1\34\1\37\1\35",
            "",
            "",
            "",
            "",
            "\1\40\1\uffff\1\36\1\34\1\37\1\35",
            "\1\40\1\uffff\1\36\1\34\1\37\1\35",
            "",
            "",
            "",
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

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "252:2: (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureUnboundProductOperation_4= ruleMeasureUnboundProductOperation | this_MeasureUnboundSumOperation_5= ruleMeasureUnboundSumOperation | this_MeasureUnboundDivisionOperation_6= ruleMeasureUnboundDivisionOperation | this_MeasureUnboundSubstractOperation_7= ruleMeasureUnboundSubstractOperation | this_RealTimeDuration_8= ruleRealTimeDuration | this_CompositeMeasure_9= ruleCompositeMeasure )";
        }
    }
    static final String dfa_8s = "\25\uffff";
    static final String dfa_9s = "\2\4\2\24\2\4\2\24\11\27\1\40\3\uffff";
    static final String dfa_10s = "\1\25\1\5\2\26\1\5\1\165\2\24\11\27\1\42\3\uffff";
    static final String dfa_11s = "\22\uffff\1\3\1\1\1\2";
    static final String dfa_12s = "\25\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\1\3\17\uffff\1\1",
            "\1\2\1\3",
            "\1\5\1\uffff\1\4",
            "\1\5\1\uffff\1\4",
            "\1\6\1\7",
            "\1\17\1\20\151\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\5",
            "\1\5",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\23\1\24\1\22",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "360:2: (this_ExponentialMeasure_0= ruleExponentialMeasure | this_LogisticMeasure_1= ruleLogisticMeasure | this_IntegrationMeasure_2= ruleIntegrationMeasure )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000030L,0x003F800000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x003F800000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000180000008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0002000000008000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x7CE0000000008000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x7CC0000000008000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x7C80000000008000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0200000000004000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x7C00000000008000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x7800000000008000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x7000000000008000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x6000000000008000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x00000019F8000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x4000000000008000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0C00000000008000L,0x00000000000001FFL});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0C00000000008000L,0x00000000000001FEL});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0C00000000008000L,0x00000000000001FCL});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0C00000000008000L,0x00000000000001F8L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0C00000000008000L,0x00000000000001F0L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0C00000000008000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0C00000000008000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0800000000008000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0800000000008000L,0x0000000000000180L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000180L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000100L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0400000000008000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0400000000008000L,0x0000000000003800L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0400000000008000L,0x0000000000003000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000008000L,0x0000000000003000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000008000L,0x0000000000002000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0400000000008000L,0x0000000000008000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000008000L,0x0000000000F80000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000008000L,0x0000000000F00000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000008000L,0x0000000000E00000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000008000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000008000L,0x0000000000800000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000048000L,0x0000000002000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x00000001E0000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x00000001C0000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0400000000008000L,0x000000060000005FL});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0400000000008000L,0x000000060000005EL});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0400000000008000L,0x000000060000005CL});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0400000000008000L,0x0000000600000058L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0400000000008000L,0x0000000600000050L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0400000000008000L,0x0000000400000050L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0400000000008000L,0x0000000000000050L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0400000000008000L,0x0000000000000040L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000040L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0000001870000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000000L,0x0000001860000000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0000001840000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0400000000008000L,0x000000E60000005FL});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0400000000008000L,0x000000E60000005EL});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0400000000008000L,0x000000E60000005CL});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0400000000008000L,0x000000E600000058L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0400000000008000L,0x000000E600000050L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0400000000008000L,0x000000E400000050L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0400000000008000L,0x000000E000000050L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0400000000008000L,0x000000C000000050L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0400000000008000L,0x000000C000000040L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0400000000008000L,0x0000008000000040L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0C60000000008000L,0x0000020000000000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0C40000000008000L,0x0000020000000000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0C00000000008000L,0x0000020000000000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0C00000000008000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0800000000008000L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0C60000000008000L,0x00000A0000000000L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0C40000000008000L,0x00000A0000000000L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0C00000000008000L,0x00000A0000000000L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0C00000000008000L,0x0000080000000000L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0800000000008000L,0x0000080000000000L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x0000000000008000L,0x0000080000000000L});
    public static final BitSet FOLLOW_136 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_137 = new BitSet(new long[]{0x0400000000048000L,0x0000200000000000L});
    public static final BitSet FOLLOW_138 = new BitSet(new long[]{0x0400000000008000L,0x0000200000000000L});
    public static final BitSet FOLLOW_139 = new BitSet(new long[]{0x0400000000008000L});
    public static final BitSet FOLLOW_140 = new BitSet(new long[]{0x0400000000008000L,0x000000000000005FL});
    public static final BitSet FOLLOW_141 = new BitSet(new long[]{0x0400000000008000L,0x000000000000005EL});
    public static final BitSet FOLLOW_142 = new BitSet(new long[]{0x0400000000008000L,0x000000000000005CL});
    public static final BitSet FOLLOW_143 = new BitSet(new long[]{0x0400000000008000L,0x0000000000000058L});

}