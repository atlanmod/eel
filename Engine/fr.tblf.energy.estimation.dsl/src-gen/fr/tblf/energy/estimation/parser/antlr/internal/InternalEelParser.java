package fr.tblf.energy.estimation.parser.antlr.internal;

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
import fr.tblf.energy.estimation.services.EelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Platform'", "'{'", "'variables'", "','", "'}'", "'measures'", "'Variable'", "'value'", "'vibility'", "'.'", "'post'", "'#'", "'='", "'ocl:'", "'attribute:'", "'as'", "'.absoluteTime'", "'+'", "'*'", "'NormalDistribution'", "'Interval'", "'lowerEndpoint'", "'upperEndpoint'", "'Sampling'", "'measurementProcedure'", "'samples'", "'Integral'", "'function'", "'interval'", "'Sample'", "'quantity'", "'abstract'", "'interface'", "'EClass'", "'instanceClassName'", "'instanceTypeName'", "'eSuperTypes'", "'('", "')'", "'eAnnotations'", "'eTypeParameters'", "'eOperations'", "'eStructuralFeatures'", "'eGenericSuperTypes'", "'EOperation'", "'ordered'", "'unique'", "'lowerBound'", "'upperBound'", "'eType'", "'eExceptions'", "'eGenericType'", "'eParameters'", "'eGenericExceptions'", "'EAnnotation'", "'source'", "'references'", "'details'", "'contents'", "'ETypeParameter'", "'eBounds'", "'true'", "'false'", "'EGenericType'", "'eTypeParameter'", "'eClassifier'", "'eUpperBound'", "'eTypeArguments'", "'eLowerBound'", "'EStringToStringMapEntry'", "'key'", "'EObject'", "'-'", "'volatile'", "'transient'", "'unsettable'", "'derived'", "'iD'", "'EAttribute'", "'changeable'", "'defaultValueLiteral'", "'containment'", "'EReference'", "'resolveProxies'", "'eOpposite'", "'eKeys'", "'EDataType'", "'serializable'", "'EEnum'", "'eLiterals'", "'EEnumLiteral'", "'literal'", "'EParameter'", "'current'", "'duration'", "'energy'", "'frequency'", "'power'", "'voltage'", "'scalar'", "'LOCAL'", "'GLOBAL'"
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
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
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
            						"fr.tblf.energy.estimation.Eel.EString");
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
                    							"fr.tblf.energy.estimation.Eel.Variable");
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
                    	    								"fr.tblf.energy.estimation.Eel.Variable");
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
                    							"fr.tblf.energy.estimation.Eel.Measure");
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
                    	    								"fr.tblf.energy.estimation.Eel.Measure");
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
    // InternalEel.g:245:1: ruleMeasure returns [EObject current=null] : (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureUnboundProductOperation_4= ruleMeasureUnboundProductOperation | this_MeasureUnboundSumOperation_5= ruleMeasureUnboundSumOperation | this_RealTimeDuration_6= ruleRealTimeDuration | this_CompositeMeasure_7= ruleCompositeMeasure ) ;
    public final EObject ruleMeasure() throws RecognitionException {
        EObject current = null;

        EObject this_MeasureValue_Impl_0 = null;

        EObject this_MeasureOCL_1 = null;

        EObject this_MeasureAttribute_2 = null;

        EObject this_MeasureCast_3 = null;

        EObject this_MeasureUnboundProductOperation_4 = null;

        EObject this_MeasureUnboundSumOperation_5 = null;

        EObject this_RealTimeDuration_6 = null;

        EObject this_CompositeMeasure_7 = null;



        	enterRule();

        try {
            // InternalEel.g:251:2: ( (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureUnboundProductOperation_4= ruleMeasureUnboundProductOperation | this_MeasureUnboundSumOperation_5= ruleMeasureUnboundSumOperation | this_RealTimeDuration_6= ruleRealTimeDuration | this_CompositeMeasure_7= ruleCompositeMeasure ) )
            // InternalEel.g:252:2: (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureUnboundProductOperation_4= ruleMeasureUnboundProductOperation | this_MeasureUnboundSumOperation_5= ruleMeasureUnboundSumOperation | this_RealTimeDuration_6= ruleRealTimeDuration | this_CompositeMeasure_7= ruleCompositeMeasure )
            {
            // InternalEel.g:252:2: (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureUnboundProductOperation_4= ruleMeasureUnboundProductOperation | this_MeasureUnboundSumOperation_5= ruleMeasureUnboundSumOperation | this_RealTimeDuration_6= ruleRealTimeDuration | this_CompositeMeasure_7= ruleCompositeMeasure )
            int alt5=8;
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
                    // InternalEel.g:307:3: this_RealTimeDuration_6= ruleRealTimeDuration
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getRealTimeDurationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealTimeDuration_6=ruleRealTimeDuration();

                    state._fsp--;


                    			current = this_RealTimeDuration_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalEel.g:316:3: this_CompositeMeasure_7= ruleCompositeMeasure
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getCompositeMeasureParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeMeasure_7=ruleCompositeMeasure();

                    state._fsp--;


                    			current = this_CompositeMeasure_7;
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
    // InternalEel.g:328:1: entryRuleCompositeMeasure returns [EObject current=null] : iv_ruleCompositeMeasure= ruleCompositeMeasure EOF ;
    public final EObject entryRuleCompositeMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeMeasure = null;


        try {
            // InternalEel.g:328:57: (iv_ruleCompositeMeasure= ruleCompositeMeasure EOF )
            // InternalEel.g:329:2: iv_ruleCompositeMeasure= ruleCompositeMeasure EOF
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
    // InternalEel.g:335:1: ruleCompositeMeasure returns [EObject current=null] : (this_ExponentialMeasure_0= ruleExponentialMeasure | this_LogisticMeasure_1= ruleLogisticMeasure ) ;
    public final EObject ruleCompositeMeasure() throws RecognitionException {
        EObject current = null;

        EObject this_ExponentialMeasure_0 = null;

        EObject this_LogisticMeasure_1 = null;



        	enterRule();

        try {
            // InternalEel.g:341:2: ( (this_ExponentialMeasure_0= ruleExponentialMeasure | this_LogisticMeasure_1= ruleLogisticMeasure ) )
            // InternalEel.g:342:2: (this_ExponentialMeasure_0= ruleExponentialMeasure | this_LogisticMeasure_1= ruleLogisticMeasure )
            {
            // InternalEel.g:342:2: (this_ExponentialMeasure_0= ruleExponentialMeasure | this_LogisticMeasure_1= ruleLogisticMeasure )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalEel.g:343:3: this_ExponentialMeasure_0= ruleExponentialMeasure
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
                    // InternalEel.g:352:3: this_LogisticMeasure_1= ruleLogisticMeasure
                    {

                    			newCompositeNode(grammarAccess.getCompositeMeasureAccess().getLogisticMeasureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogisticMeasure_1=ruleLogisticMeasure();

                    state._fsp--;


                    			current = this_LogisticMeasure_1;
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
    // InternalEel.g:364:1: entryRuleMeasurementUncertaintyInformation returns [EObject current=null] : iv_ruleMeasurementUncertaintyInformation= ruleMeasurementUncertaintyInformation EOF ;
    public final EObject entryRuleMeasurementUncertaintyInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementUncertaintyInformation = null;


        try {
            // InternalEel.g:364:74: (iv_ruleMeasurementUncertaintyInformation= ruleMeasurementUncertaintyInformation EOF )
            // InternalEel.g:365:2: iv_ruleMeasurementUncertaintyInformation= ruleMeasurementUncertaintyInformation EOF
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
    // InternalEel.g:371:1: ruleMeasurementUncertaintyInformation returns [EObject current=null] : (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral ) ;
    public final EObject ruleMeasurementUncertaintyInformation() throws RecognitionException {
        EObject current = null;

        EObject this_NormalDistribution_0 = null;

        EObject this_Interval_1 = null;

        EObject this_Sampling_2 = null;

        EObject this_Integral_3 = null;



        	enterRule();

        try {
            // InternalEel.g:377:2: ( (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral ) )
            // InternalEel.g:378:2: (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral )
            {
            // InternalEel.g:378:2: (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt7=1;
                }
                break;
            case 31:
                {
                alt7=2;
                }
                break;
            case 34:
                {
                alt7=3;
                }
                break;
            case 37:
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
                    // InternalEel.g:379:3: this_NormalDistribution_0= ruleNormalDistribution
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
                    // InternalEel.g:388:3: this_Interval_1= ruleInterval
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
                    // InternalEel.g:397:3: this_Sampling_2= ruleSampling
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
                    // InternalEel.g:406:3: this_Integral_3= ruleIntegral
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
    // InternalEel.g:418:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalEel.g:418:47: (iv_ruleEString= ruleEString EOF )
            // InternalEel.g:419:2: iv_ruleEString= ruleEString EOF
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
    // InternalEel.g:425:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalEel.g:431:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalEel.g:432:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalEel.g:432:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalEel.g:433:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEel.g:441:3: this_ID_1= RULE_ID
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
    // InternalEel.g:452:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalEel.g:452:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalEel.g:453:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalEel.g:459:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )? otherlv_5= 'vibility' ( (lv_vibility_6_0= ruleVisibility ) ) otherlv_7= '}' ) ;
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
            // InternalEel.g:465:2: ( (otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )? otherlv_5= 'vibility' ( (lv_vibility_6_0= ruleVisibility ) ) otherlv_7= '}' ) )
            // InternalEel.g:466:2: (otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )? otherlv_5= 'vibility' ( (lv_vibility_6_0= ruleVisibility ) ) otherlv_7= '}' )
            {
            // InternalEel.g:466:2: (otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )? otherlv_5= 'vibility' ( (lv_vibility_6_0= ruleVisibility ) ) otherlv_7= '}' )
            // InternalEel.g:467:3: otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )? otherlv_5= 'vibility' ( (lv_vibility_6_0= ruleVisibility ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariableKeyword_0());
            		
            // InternalEel.g:471:3: ( (lv_name_1_0= ruleEString ) )
            // InternalEel.g:472:4: (lv_name_1_0= ruleEString )
            {
            // InternalEel.g:472:4: (lv_name_1_0= ruleEString )
            // InternalEel.g:473:5: lv_name_1_0= ruleEString
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
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:494:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEel.g:495:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getValueKeyword_3_0());
                    			
                    // InternalEel.g:499:4: ( (lv_value_4_0= ruleEBigDecimal ) )
                    // InternalEel.g:500:5: (lv_value_4_0= ruleEBigDecimal )
                    {
                    // InternalEel.g:500:5: (lv_value_4_0= ruleEBigDecimal )
                    // InternalEel.g:501:6: lv_value_4_0= ruleEBigDecimal
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
                    							"fr.tblf.energy.estimation.Eel.EBigDecimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getVibilityKeyword_4());
            		
            // InternalEel.g:523:3: ( (lv_vibility_6_0= ruleVisibility ) )
            // InternalEel.g:524:4: (lv_vibility_6_0= ruleVisibility )
            {
            // InternalEel.g:524:4: (lv_vibility_6_0= ruleVisibility )
            // InternalEel.g:525:5: lv_vibility_6_0= ruleVisibility
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
            						"fr.tblf.energy.estimation.Eel.Visibility");
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
    // InternalEel.g:550:1: entryRuleEBigDecimal returns [String current=null] : iv_ruleEBigDecimal= ruleEBigDecimal EOF ;
    public final String entryRuleEBigDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBigDecimal = null;


        try {
            // InternalEel.g:550:51: (iv_ruleEBigDecimal= ruleEBigDecimal EOF )
            // InternalEel.g:551:2: iv_ruleEBigDecimal= ruleEBigDecimal EOF
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
    // InternalEel.g:557:1: ruleEBigDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEBigDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalEel.g:563:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalEel.g:564:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalEel.g:564:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalEel.g:565:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalEel.g:565:3: (this_INT_0= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEel.g:566:4: this_INT_0= RULE_INT
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
    // InternalEel.g:590:1: entryRuleMeasureValue_Impl returns [EObject current=null] : iv_ruleMeasureValue_Impl= ruleMeasureValue_Impl EOF ;
    public final EObject entryRuleMeasureValue_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureValue_Impl = null;


        try {
            // InternalEel.g:590:58: (iv_ruleMeasureValue_Impl= ruleMeasureValue_Impl EOF )
            // InternalEel.g:591:2: iv_ruleMeasureValue_Impl= ruleMeasureValue_Impl EOF
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
    // InternalEel.g:597:1: ruleMeasureValue_Impl returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (lv_value_9_0= ruleEBigDecimal ) )? ) ;
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
            // InternalEel.g:603:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (lv_value_9_0= ruleEBigDecimal ) )? ) )
            // InternalEel.g:604:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (lv_value_9_0= ruleEBigDecimal ) )? )
            {
            // InternalEel.g:604:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (lv_value_9_0= ruleEBigDecimal ) )? )
            // InternalEel.g:605:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (lv_value_9_0= ruleEBigDecimal ) )?
            {
            // InternalEel.g:605:3: ()
            // InternalEel.g:606:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureValue_ImplAccess().getMeasureValueAction_0(),
            					current);
            			

            }

            // InternalEel.g:612:3: ( (lv_post_1_0= 'post' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEel.g:613:4: (lv_post_1_0= 'post' )
                    {
                    // InternalEel.g:613:4: (lv_post_1_0= 'post' )
                    // InternalEel.g:614:5: lv_post_1_0= 'post'
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

            // InternalEel.g:626:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalEel.g:627:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalEel.g:627:4: (lv_targetClass_2_0= ruleEString )
            // InternalEel.g:628:5: lv_targetClass_2_0= ruleEString
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
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:645:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEel.g:646:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureValue_ImplAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalEel.g:650:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalEel.g:651:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalEel.g:651:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalEel.g:652:6: lv_targetOperation_4_0= ruleEString
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
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureValue_ImplAccess().getFullStopKeyword_4());
            		
            // InternalEel.g:674:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=104 && LA13_0<=110)) ) {
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
                    // InternalEel.g:675:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalEel.g:675:4: ( (lv_type_6_0= ruleType ) )
                    // InternalEel.g:676:5: (lv_type_6_0= ruleType )
                    {
                    // InternalEel.g:676:5: (lv_type_6_0= ruleType )
                    // InternalEel.g:677:6: lv_type_6_0= ruleType
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
                    							"fr.tblf.energy.estimation.Eel.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:695:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalEel.g:695:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalEel.g:696:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalEel.g:696:5: (lv_subname_7_0= ruleEString )
                    // InternalEel.g:697:6: lv_subname_7_0= ruleEString
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
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureValue_ImplAccess().getEqualsSignKeyword_6());
            		
            // InternalEel.g:719:3: ( (lv_value_9_0= ruleEBigDecimal ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT||LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEel.g:720:4: (lv_value_9_0= ruleEBigDecimal )
                    {
                    // InternalEel.g:720:4: (lv_value_9_0= ruleEBigDecimal )
                    // InternalEel.g:721:5: lv_value_9_0= ruleEBigDecimal
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
                    						"fr.tblf.energy.estimation.Eel.EBigDecimal");
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
    // InternalEel.g:742:1: entryRuleMeasureOCL returns [EObject current=null] : iv_ruleMeasureOCL= ruleMeasureOCL EOF ;
    public final EObject entryRuleMeasureOCL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureOCL = null;


        try {
            // InternalEel.g:742:51: (iv_ruleMeasureOCL= ruleMeasureOCL EOF )
            // InternalEel.g:743:2: iv_ruleMeasureOCL= ruleMeasureOCL EOF
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
    // InternalEel.g:749:1: ruleMeasureOCL returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'ocl:' ( (lv_oclQuery_10_0= ruleEString ) ) ) ;
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
            // InternalEel.g:755:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'ocl:' ( (lv_oclQuery_10_0= ruleEString ) ) ) )
            // InternalEel.g:756:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'ocl:' ( (lv_oclQuery_10_0= ruleEString ) ) )
            {
            // InternalEel.g:756:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'ocl:' ( (lv_oclQuery_10_0= ruleEString ) ) )
            // InternalEel.g:757:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'ocl:' ( (lv_oclQuery_10_0= ruleEString ) )
            {
            // InternalEel.g:757:3: ()
            // InternalEel.g:758:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureOCLAccess().getMeasureOCLAction_0(),
            					current);
            			

            }

            // InternalEel.g:764:3: ( (lv_post_1_0= 'post' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEel.g:765:4: (lv_post_1_0= 'post' )
                    {
                    // InternalEel.g:765:4: (lv_post_1_0= 'post' )
                    // InternalEel.g:766:5: lv_post_1_0= 'post'
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

            // InternalEel.g:778:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalEel.g:779:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalEel.g:779:4: (lv_targetClass_2_0= ruleEString )
            // InternalEel.g:780:5: lv_targetClass_2_0= ruleEString
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
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:797:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEel.g:798:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureOCLAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalEel.g:802:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalEel.g:803:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalEel.g:803:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalEel.g:804:6: lv_targetOperation_4_0= ruleEString
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
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureOCLAccess().getFullStopKeyword_4());
            		
            // InternalEel.g:826:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=104 && LA17_0<=110)) ) {
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
                    // InternalEel.g:827:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalEel.g:827:4: ( (lv_type_6_0= ruleType ) )
                    // InternalEel.g:828:5: (lv_type_6_0= ruleType )
                    {
                    // InternalEel.g:828:5: (lv_type_6_0= ruleType )
                    // InternalEel.g:829:6: lv_type_6_0= ruleType
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
                    							"fr.tblf.energy.estimation.Eel.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:847:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalEel.g:847:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalEel.g:848:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalEel.g:848:5: (lv_subname_7_0= ruleEString )
                    // InternalEel.g:849:6: lv_subname_7_0= ruleEString
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
                    							"fr.tblf.energy.estimation.Eel.EString");
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
            		
            // InternalEel.g:875:3: ( (lv_oclQuery_10_0= ruleEString ) )
            // InternalEel.g:876:4: (lv_oclQuery_10_0= ruleEString )
            {
            // InternalEel.g:876:4: (lv_oclQuery_10_0= ruleEString )
            // InternalEel.g:877:5: lv_oclQuery_10_0= ruleEString
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
            						"fr.tblf.energy.estimation.Eel.EString");
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
    // InternalEel.g:898:1: entryRuleMeasureAttribute returns [EObject current=null] : iv_ruleMeasureAttribute= ruleMeasureAttribute EOF ;
    public final EObject entryRuleMeasureAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureAttribute = null;


        try {
            // InternalEel.g:898:57: (iv_ruleMeasureAttribute= ruleMeasureAttribute EOF )
            // InternalEel.g:899:2: iv_ruleMeasureAttribute= ruleMeasureAttribute EOF
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
    // InternalEel.g:905:1: ruleMeasureAttribute returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'attribute:' ( (lv_att_10_0= ruleEString ) ) ) ;
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
            // InternalEel.g:911:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'attribute:' ( (lv_att_10_0= ruleEString ) ) ) )
            // InternalEel.g:912:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'attribute:' ( (lv_att_10_0= ruleEString ) ) )
            {
            // InternalEel.g:912:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'attribute:' ( (lv_att_10_0= ruleEString ) ) )
            // InternalEel.g:913:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'attribute:' ( (lv_att_10_0= ruleEString ) )
            {
            // InternalEel.g:913:3: ()
            // InternalEel.g:914:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureAttributeAccess().getMeasureAttributeAction_0(),
            					current);
            			

            }

            // InternalEel.g:920:3: ( (lv_post_1_0= 'post' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEel.g:921:4: (lv_post_1_0= 'post' )
                    {
                    // InternalEel.g:921:4: (lv_post_1_0= 'post' )
                    // InternalEel.g:922:5: lv_post_1_0= 'post'
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

            // InternalEel.g:934:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalEel.g:935:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalEel.g:935:4: (lv_targetClass_2_0= ruleEString )
            // InternalEel.g:936:5: lv_targetClass_2_0= ruleEString
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
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:953:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEel.g:954:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureAttributeAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalEel.g:958:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalEel.g:959:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalEel.g:959:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalEel.g:960:6: lv_targetOperation_4_0= ruleEString
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
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureAttributeAccess().getFullStopKeyword_4());
            		
            // InternalEel.g:982:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=104 && LA20_0<=110)) ) {
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
                    // InternalEel.g:983:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalEel.g:983:4: ( (lv_type_6_0= ruleType ) )
                    // InternalEel.g:984:5: (lv_type_6_0= ruleType )
                    {
                    // InternalEel.g:984:5: (lv_type_6_0= ruleType )
                    // InternalEel.g:985:6: lv_type_6_0= ruleType
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
                    							"fr.tblf.energy.estimation.Eel.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:1003:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalEel.g:1003:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalEel.g:1004:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalEel.g:1004:5: (lv_subname_7_0= ruleEString )
                    // InternalEel.g:1005:6: lv_subname_7_0= ruleEString
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
                    							"fr.tblf.energy.estimation.Eel.EString");
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
            		
            // InternalEel.g:1031:3: ( (lv_att_10_0= ruleEString ) )
            // InternalEel.g:1032:4: (lv_att_10_0= ruleEString )
            {
            // InternalEel.g:1032:4: (lv_att_10_0= ruleEString )
            // InternalEel.g:1033:5: lv_att_10_0= ruleEString
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
            						"fr.tblf.energy.estimation.Eel.EString");
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
    // InternalEel.g:1054:1: entryRuleMeasureCast returns [EObject current=null] : iv_ruleMeasureCast= ruleMeasureCast EOF ;
    public final EObject entryRuleMeasureCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureCast = null;


        try {
            // InternalEel.g:1054:52: (iv_ruleMeasureCast= ruleMeasureCast EOF )
            // InternalEel.g:1055:2: iv_ruleMeasureCast= ruleMeasureCast EOF
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
    // InternalEel.g:1061:1: ruleMeasureCast returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= 'as' ( (lv_type_10_0= ruleType ) ) ) ;
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
            // InternalEel.g:1067:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= 'as' ( (lv_type_10_0= ruleType ) ) ) )
            // InternalEel.g:1068:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= 'as' ( (lv_type_10_0= ruleType ) ) )
            {
            // InternalEel.g:1068:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= 'as' ( (lv_type_10_0= ruleType ) ) )
            // InternalEel.g:1069:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= 'as' ( (lv_type_10_0= ruleType ) )
            {
            // InternalEel.g:1069:3: ()
            // InternalEel.g:1070:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureCastAccess().getMeasureCastAction_0(),
            					current);
            			

            }

            // InternalEel.g:1076:3: ( (lv_post_1_0= 'post' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEel.g:1077:4: (lv_post_1_0= 'post' )
                    {
                    // InternalEel.g:1077:4: (lv_post_1_0= 'post' )
                    // InternalEel.g:1078:5: lv_post_1_0= 'post'
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

            // InternalEel.g:1090:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalEel.g:1091:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalEel.g:1091:4: (lv_targetClass_2_0= ruleEString )
            // InternalEel.g:1092:5: lv_targetClass_2_0= ruleEString
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
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1109:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEel.g:1110:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureCastAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalEel.g:1114:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalEel.g:1115:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalEel.g:1115:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalEel.g:1116:6: lv_targetOperation_4_0= ruleEString
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
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureCastAccess().getFullStopKeyword_4());
            		
            // InternalEel.g:1138:3: ( (lv_subname_6_0= ruleEString ) )
            // InternalEel.g:1139:4: (lv_subname_6_0= ruleEString )
            {
            // InternalEel.g:1139:4: (lv_subname_6_0= ruleEString )
            // InternalEel.g:1140:5: lv_subname_6_0= ruleEString
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
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasureCastAccess().getEqualsSignKeyword_6());
            		
            // InternalEel.g:1161:3: ( ( ruleEString ) )
            // InternalEel.g:1162:4: ( ruleEString )
            {
            // InternalEel.g:1162:4: ( ruleEString )
            // InternalEel.g:1163:5: ruleEString
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
            		
            // InternalEel.g:1181:3: ( (lv_type_10_0= ruleType ) )
            // InternalEel.g:1182:4: (lv_type_10_0= ruleType )
            {
            // InternalEel.g:1182:4: (lv_type_10_0= ruleType )
            // InternalEel.g:1183:5: lv_type_10_0= ruleType
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
            						"fr.tblf.energy.estimation.Eel.Type");
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
    // InternalEel.g:1204:1: entryRuleRealTimeDuration returns [EObject current=null] : iv_ruleRealTimeDuration= ruleRealTimeDuration EOF ;
    public final EObject entryRuleRealTimeDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTimeDuration = null;


        try {
            // InternalEel.g:1204:57: (iv_ruleRealTimeDuration= ruleRealTimeDuration EOF )
            // InternalEel.g:1205:2: iv_ruleRealTimeDuration= ruleRealTimeDuration EOF
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
    // InternalEel.g:1211:1: ruleRealTimeDuration returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.absoluteTime' ) ;
    public final EObject ruleRealTimeDuration() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;



        	enterRule();

        try {
            // InternalEel.g:1217:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.absoluteTime' ) )
            // InternalEel.g:1218:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.absoluteTime' )
            {
            // InternalEel.g:1218:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.absoluteTime' )
            // InternalEel.g:1219:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.absoluteTime'
            {
            // InternalEel.g:1219:3: ()
            // InternalEel.g:1220:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealTimeDurationAccess().getRealTimeDurationAction_0(),
            					current);
            			

            }

            // InternalEel.g:1226:3: ( (lv_post_1_0= 'post' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalEel.g:1227:4: (lv_post_1_0= 'post' )
                    {
                    // InternalEel.g:1227:4: (lv_post_1_0= 'post' )
                    // InternalEel.g:1228:5: lv_post_1_0= 'post'
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

            // InternalEel.g:1240:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalEel.g:1241:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalEel.g:1241:4: (lv_targetClass_2_0= ruleEString )
            // InternalEel.g:1242:5: lv_targetClass_2_0= ruleEString
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
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1259:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEel.g:1260:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRealTimeDurationAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalEel.g:1264:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalEel.g:1265:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalEel.g:1265:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalEel.g:1266:6: lv_targetOperation_4_0= ruleEString
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
                    							"fr.tblf.energy.estimation.Eel.EString");
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
    // InternalEel.g:1292:1: entryRuleMeasureUnboundSumOperation returns [EObject current=null] : iv_ruleMeasureUnboundSumOperation= ruleMeasureUnboundSumOperation EOF ;
    public final EObject entryRuleMeasureUnboundSumOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureUnboundSumOperation = null;


        try {
            // InternalEel.g:1292:67: (iv_ruleMeasureUnboundSumOperation= ruleMeasureUnboundSumOperation EOF )
            // InternalEel.g:1293:2: iv_ruleMeasureUnboundSumOperation= ruleMeasureUnboundSumOperation EOF
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
    // InternalEel.g:1299:1: ruleMeasureUnboundSumOperation returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '+' ( ( ruleEString ) ) )+ ) ;
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
            // InternalEel.g:1305:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '+' ( ( ruleEString ) ) )+ ) )
            // InternalEel.g:1306:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '+' ( ( ruleEString ) ) )+ )
            {
            // InternalEel.g:1306:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '+' ( ( ruleEString ) ) )+ )
            // InternalEel.g:1307:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '+' ( ( ruleEString ) ) )+
            {
            // InternalEel.g:1307:3: ()
            // InternalEel.g:1308:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureUnboundSumOperationAccess().getMeasureUnboundSumOperationAction_0(),
            					current);
            			

            }

            // InternalEel.g:1314:3: ( (lv_post_1_0= 'post' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalEel.g:1315:4: (lv_post_1_0= 'post' )
                    {
                    // InternalEel.g:1315:4: (lv_post_1_0= 'post' )
                    // InternalEel.g:1316:5: lv_post_1_0= 'post'
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

            // InternalEel.g:1328:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalEel.g:1329:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalEel.g:1329:4: (lv_targetClass_2_0= ruleEString )
            // InternalEel.g:1330:5: lv_targetClass_2_0= ruleEString
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
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1347:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalEel.g:1348:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureUnboundSumOperationAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalEel.g:1352:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalEel.g:1353:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalEel.g:1353:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalEel.g:1354:6: lv_targetOperation_4_0= ruleEString
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
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureUnboundSumOperationAccess().getFullStopKeyword_4());
            		
            // InternalEel.g:1376:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=104 && LA27_0<=110)) ) {
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
                    // InternalEel.g:1377:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalEel.g:1377:4: ( (lv_type_6_0= ruleType ) )
                    // InternalEel.g:1378:5: (lv_type_6_0= ruleType )
                    {
                    // InternalEel.g:1378:5: (lv_type_6_0= ruleType )
                    // InternalEel.g:1379:6: lv_type_6_0= ruleType
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
                    							"fr.tblf.energy.estimation.Eel.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:1397:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalEel.g:1397:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalEel.g:1398:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalEel.g:1398:5: (lv_subname_7_0= ruleEString )
                    // InternalEel.g:1399:6: lv_subname_7_0= ruleEString
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
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureUnboundSumOperationAccess().getEqualsSignKeyword_6());
            		
            // InternalEel.g:1421:3: ( ( ruleEString ) )
            // InternalEel.g:1422:4: ( ruleEString )
            {
            // InternalEel.g:1422:4: ( ruleEString )
            // InternalEel.g:1423:5: ruleEString
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

            // InternalEel.g:1437:3: (otherlv_10= '+' ( ( ruleEString ) ) )+
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
            	    // InternalEel.g:1438:4: otherlv_10= '+' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,28,FOLLOW_3); 

            	    				newLeafNode(otherlv_10, grammarAccess.getMeasureUnboundSumOperationAccess().getPlusSignKeyword_8_0());
            	    			
            	    // InternalEel.g:1442:4: ( ( ruleEString ) )
            	    // InternalEel.g:1443:5: ( ruleEString )
            	    {
            	    // InternalEel.g:1443:5: ( ruleEString )
            	    // InternalEel.g:1444:6: ruleEString
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


    // $ANTLR start "entryRuleMeasureUnboundProductOperation"
    // InternalEel.g:1463:1: entryRuleMeasureUnboundProductOperation returns [EObject current=null] : iv_ruleMeasureUnboundProductOperation= ruleMeasureUnboundProductOperation EOF ;
    public final EObject entryRuleMeasureUnboundProductOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureUnboundProductOperation = null;


        try {
            // InternalEel.g:1463:71: (iv_ruleMeasureUnboundProductOperation= ruleMeasureUnboundProductOperation EOF )
            // InternalEel.g:1464:2: iv_ruleMeasureUnboundProductOperation= ruleMeasureUnboundProductOperation EOF
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
    // InternalEel.g:1470:1: ruleMeasureUnboundProductOperation returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '*' ( ( ruleEString ) ) )+ ) ;
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
            // InternalEel.g:1476:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '*' ( ( ruleEString ) ) )+ ) )
            // InternalEel.g:1477:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '*' ( ( ruleEString ) ) )+ )
            {
            // InternalEel.g:1477:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '*' ( ( ruleEString ) ) )+ )
            // InternalEel.g:1478:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( ( ruleEString ) ) (otherlv_10= '*' ( ( ruleEString ) ) )+
            {
            // InternalEel.g:1478:3: ()
            // InternalEel.g:1479:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureUnboundProductOperationAccess().getMeasureUnboundProductOperationAction_0(),
            					current);
            			

            }

            // InternalEel.g:1485:3: ( (lv_post_1_0= 'post' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==21) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalEel.g:1486:4: (lv_post_1_0= 'post' )
                    {
                    // InternalEel.g:1486:4: (lv_post_1_0= 'post' )
                    // InternalEel.g:1487:5: lv_post_1_0= 'post'
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

            // InternalEel.g:1499:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalEel.g:1500:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalEel.g:1500:4: (lv_targetClass_2_0= ruleEString )
            // InternalEel.g:1501:5: lv_targetClass_2_0= ruleEString
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
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1518:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==22) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalEel.g:1519:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureUnboundProductOperationAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalEel.g:1523:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalEel.g:1524:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalEel.g:1524:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalEel.g:1525:6: lv_targetOperation_4_0= ruleEString
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
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureUnboundProductOperationAccess().getFullStopKeyword_4());
            		
            // InternalEel.g:1547:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=104 && LA31_0<=110)) ) {
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
                    // InternalEel.g:1548:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalEel.g:1548:4: ( (lv_type_6_0= ruleType ) )
                    // InternalEel.g:1549:5: (lv_type_6_0= ruleType )
                    {
                    // InternalEel.g:1549:5: (lv_type_6_0= ruleType )
                    // InternalEel.g:1550:6: lv_type_6_0= ruleType
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
                    							"fr.tblf.energy.estimation.Eel.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:1568:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalEel.g:1568:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalEel.g:1569:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalEel.g:1569:5: (lv_subname_7_0= ruleEString )
                    // InternalEel.g:1570:6: lv_subname_7_0= ruleEString
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
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureUnboundProductOperationAccess().getEqualsSignKeyword_6());
            		
            // InternalEel.g:1592:3: ( ( ruleEString ) )
            // InternalEel.g:1593:4: ( ruleEString )
            {
            // InternalEel.g:1593:4: ( ruleEString )
            // InternalEel.g:1594:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureUnboundProductOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureUnboundProductOperationAccess().getMeasuresMeasureCrossReference_7_0());
            				
            pushFollow(FOLLOW_29);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1608:3: (otherlv_10= '*' ( ( ruleEString ) ) )+
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
            	    // InternalEel.g:1609:4: otherlv_10= '*' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,29,FOLLOW_3); 

            	    				newLeafNode(otherlv_10, grammarAccess.getMeasureUnboundProductOperationAccess().getAsteriskKeyword_8_0());
            	    			
            	    // InternalEel.g:1613:4: ( ( ruleEString ) )
            	    // InternalEel.g:1614:5: ( ruleEString )
            	    {
            	    // InternalEel.g:1614:5: ( ruleEString )
            	    // InternalEel.g:1615:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMeasureUnboundProductOperationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getMeasureUnboundProductOperationAccess().getMeasuresMeasureCrossReference_8_1_0());
            	    					
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
    // $ANTLR end "ruleMeasureUnboundProductOperation"


    // $ANTLR start "entryRuleExponentialMeasure"
    // InternalEel.g:1634:1: entryRuleExponentialMeasure returns [EObject current=null] : iv_ruleExponentialMeasure= ruleExponentialMeasure EOF ;
    public final EObject entryRuleExponentialMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialMeasure = null;


        try {
            // InternalEel.g:1634:59: (iv_ruleExponentialMeasure= ruleExponentialMeasure EOF )
            // InternalEel.g:1635:2: iv_ruleExponentialMeasure= ruleExponentialMeasure EOF
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
    // InternalEel.g:1641:1: ruleExponentialMeasure returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (otherlv_9= RULE_ID ) ) ) ;
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
            // InternalEel.g:1647:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (otherlv_9= RULE_ID ) ) ) )
            // InternalEel.g:1648:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (otherlv_9= RULE_ID ) ) )
            {
            // InternalEel.g:1648:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (otherlv_9= RULE_ID ) ) )
            // InternalEel.g:1649:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (otherlv_9= RULE_ID ) )
            {
            // InternalEel.g:1649:3: ()
            // InternalEel.g:1650:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExponentialMeasureAccess().getExponentialMeasureAction_0(),
            					current);
            			

            }

            // InternalEel.g:1656:3: ( (lv_post_1_0= 'post' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==21) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalEel.g:1657:4: (lv_post_1_0= 'post' )
                    {
                    // InternalEel.g:1657:4: (lv_post_1_0= 'post' )
                    // InternalEel.g:1658:5: lv_post_1_0= 'post'
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

            // InternalEel.g:1670:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalEel.g:1671:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalEel.g:1671:4: (lv_targetClass_2_0= ruleEString )
            // InternalEel.g:1672:5: lv_targetClass_2_0= ruleEString
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
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1689:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==22) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalEel.g:1690:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getExponentialMeasureAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalEel.g:1694:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalEel.g:1695:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalEel.g:1695:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalEel.g:1696:6: lv_targetOperation_4_0= ruleEString
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
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getExponentialMeasureAccess().getFullStopKeyword_4());
            		
            // InternalEel.g:1718:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=104 && LA35_0<=110)) ) {
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
                    // InternalEel.g:1719:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalEel.g:1719:4: ( (lv_type_6_0= ruleType ) )
                    // InternalEel.g:1720:5: (lv_type_6_0= ruleType )
                    {
                    // InternalEel.g:1720:5: (lv_type_6_0= ruleType )
                    // InternalEel.g:1721:6: lv_type_6_0= ruleType
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
                    							"fr.tblf.energy.estimation.Eel.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:1739:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalEel.g:1739:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalEel.g:1740:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalEel.g:1740:5: (lv_subname_7_0= ruleEString )
                    // InternalEel.g:1741:6: lv_subname_7_0= ruleEString
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
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_31); 

            			newLeafNode(otherlv_8, grammarAccess.getExponentialMeasureAccess().getEqualsSignKeyword_6());
            		
            // InternalEel.g:1763:3: ( (otherlv_9= RULE_ID ) )
            // InternalEel.g:1764:4: (otherlv_9= RULE_ID )
            {
            // InternalEel.g:1764:4: (otherlv_9= RULE_ID )
            // InternalEel.g:1765:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExponentialMeasureRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_9, grammarAccess.getExponentialMeasureAccess().getXMeasureCrossReference_7_0());
            				

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
    // InternalEel.g:1780:1: entryRuleLogisticMeasure returns [EObject current=null] : iv_ruleLogisticMeasure= ruleLogisticMeasure EOF ;
    public final EObject entryRuleLogisticMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogisticMeasure = null;


        try {
            // InternalEel.g:1780:56: (iv_ruleLogisticMeasure= ruleLogisticMeasure EOF )
            // InternalEel.g:1781:2: iv_ruleLogisticMeasure= ruleLogisticMeasure EOF
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
    // InternalEel.g:1787:1: ruleLogisticMeasure returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (otherlv_9= RULE_ID ) ) ( (otherlv_10= RULE_ID ) ) ( (otherlv_11= RULE_ID ) ) ( (otherlv_12= RULE_ID ) ) ) ;
    public final EObject ruleLogisticMeasure() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        Enumerator lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_subname_7_0 = null;



        	enterRule();

        try {
            // InternalEel.g:1793:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (otherlv_9= RULE_ID ) ) ( (otherlv_10= RULE_ID ) ) ( (otherlv_11= RULE_ID ) ) ( (otherlv_12= RULE_ID ) ) ) )
            // InternalEel.g:1794:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (otherlv_9= RULE_ID ) ) ( (otherlv_10= RULE_ID ) ) ( (otherlv_11= RULE_ID ) ) ( (otherlv_12= RULE_ID ) ) )
            {
            // InternalEel.g:1794:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (otherlv_9= RULE_ID ) ) ( (otherlv_10= RULE_ID ) ) ( (otherlv_11= RULE_ID ) ) ( (otherlv_12= RULE_ID ) ) )
            // InternalEel.g:1795:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (otherlv_9= RULE_ID ) ) ( (otherlv_10= RULE_ID ) ) ( (otherlv_11= RULE_ID ) ) ( (otherlv_12= RULE_ID ) )
            {
            // InternalEel.g:1795:3: ()
            // InternalEel.g:1796:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLogisticMeasureAccess().getLogisticMeasureAction_0(),
            					current);
            			

            }

            // InternalEel.g:1802:3: ( (lv_post_1_0= 'post' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==21) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalEel.g:1803:4: (lv_post_1_0= 'post' )
                    {
                    // InternalEel.g:1803:4: (lv_post_1_0= 'post' )
                    // InternalEel.g:1804:5: lv_post_1_0= 'post'
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

            // InternalEel.g:1816:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalEel.g:1817:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalEel.g:1817:4: (lv_targetClass_2_0= ruleEString )
            // InternalEel.g:1818:5: lv_targetClass_2_0= ruleEString
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
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1835:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==22) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalEel.g:1836:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogisticMeasureAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalEel.g:1840:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalEel.g:1841:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalEel.g:1841:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalEel.g:1842:6: lv_targetOperation_4_0= ruleEString
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
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getLogisticMeasureAccess().getFullStopKeyword_4());
            		
            // InternalEel.g:1864:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=104 && LA38_0<=110)) ) {
                alt38=1;
            }
            else if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_ID)) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalEel.g:1865:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalEel.g:1865:4: ( (lv_type_6_0= ruleType ) )
                    // InternalEel.g:1866:5: (lv_type_6_0= ruleType )
                    {
                    // InternalEel.g:1866:5: (lv_type_6_0= ruleType )
                    // InternalEel.g:1867:6: lv_type_6_0= ruleType
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
                    							"fr.tblf.energy.estimation.Eel.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:1885:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalEel.g:1885:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalEel.g:1886:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalEel.g:1886:5: (lv_subname_7_0= ruleEString )
                    // InternalEel.g:1887:6: lv_subname_7_0= ruleEString
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
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_31); 

            			newLeafNode(otherlv_8, grammarAccess.getLogisticMeasureAccess().getEqualsSignKeyword_6());
            		
            // InternalEel.g:1909:3: ( (otherlv_9= RULE_ID ) )
            // InternalEel.g:1910:4: (otherlv_9= RULE_ID )
            {
            // InternalEel.g:1910:4: (otherlv_9= RULE_ID )
            // InternalEel.g:1911:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogisticMeasureRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_9, grammarAccess.getLogisticMeasureAccess().getLMeasureCrossReference_7_0());
            				

            }


            }

            // InternalEel.g:1922:3: ( (otherlv_10= RULE_ID ) )
            // InternalEel.g:1923:4: (otherlv_10= RULE_ID )
            {
            // InternalEel.g:1923:4: (otherlv_10= RULE_ID )
            // InternalEel.g:1924:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogisticMeasureRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_10, grammarAccess.getLogisticMeasureAccess().getKMeasureCrossReference_8_0());
            				

            }


            }

            // InternalEel.g:1935:3: ( (otherlv_11= RULE_ID ) )
            // InternalEel.g:1936:4: (otherlv_11= RULE_ID )
            {
            // InternalEel.g:1936:4: (otherlv_11= RULE_ID )
            // InternalEel.g:1937:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogisticMeasureRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_11, grammarAccess.getLogisticMeasureAccess().getXMeasureCrossReference_9_0());
            				

            }


            }

            // InternalEel.g:1948:3: ( (otherlv_12= RULE_ID ) )
            // InternalEel.g:1949:4: (otherlv_12= RULE_ID )
            {
            // InternalEel.g:1949:4: (otherlv_12= RULE_ID )
            // InternalEel.g:1950:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogisticMeasureRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_12, grammarAccess.getLogisticMeasureAccess().getX0MeasureCrossReference_10_0());
            				

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


    // $ANTLR start "entryRuleNormalDistribution"
    // InternalEel.g:1965:1: entryRuleNormalDistribution returns [EObject current=null] : iv_ruleNormalDistribution= ruleNormalDistribution EOF ;
    public final EObject entryRuleNormalDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalDistribution = null;


        try {
            // InternalEel.g:1965:59: (iv_ruleNormalDistribution= ruleNormalDistribution EOF )
            // InternalEel.g:1966:2: iv_ruleNormalDistribution= ruleNormalDistribution EOF
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
    // InternalEel.g:1972:1: ruleNormalDistribution returns [EObject current=null] : ( () otherlv_1= 'NormalDistribution' ) ;
    public final EObject ruleNormalDistribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEel.g:1978:2: ( ( () otherlv_1= 'NormalDistribution' ) )
            // InternalEel.g:1979:2: ( () otherlv_1= 'NormalDistribution' )
            {
            // InternalEel.g:1979:2: ( () otherlv_1= 'NormalDistribution' )
            // InternalEel.g:1980:3: () otherlv_1= 'NormalDistribution'
            {
            // InternalEel.g:1980:3: ()
            // InternalEel.g:1981:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNormalDistributionAccess().getNormalDistributionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

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
    // InternalEel.g:1995:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalEel.g:1995:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalEel.g:1996:2: iv_ruleInterval= ruleInterval EOF
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
    // InternalEel.g:2002:1: ruleInterval returns [EObject current=null] : (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' ) ;
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
            // InternalEel.g:2008:2: ( (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' ) )
            // InternalEel.g:2009:2: (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' )
            {
            // InternalEel.g:2009:2: (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' )
            // InternalEel.g:2010:3: otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIntervalAccess().getIntervalKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getIntervalAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getIntervalAccess().getLowerEndpointKeyword_2());
            		
            // InternalEel.g:2022:3: ( (lv_lowerEndpoint_3_0= ruleMeasure ) )
            // InternalEel.g:2023:4: (lv_lowerEndpoint_3_0= ruleMeasure )
            {
            // InternalEel.g:2023:4: (lv_lowerEndpoint_3_0= ruleMeasure )
            // InternalEel.g:2024:5: lv_lowerEndpoint_3_0= ruleMeasure
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getLowerEndpointMeasureParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_33);
            lv_lowerEndpoint_3_0=ruleMeasure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntervalRule());
            					}
            					set(
            						current,
            						"lowerEndpoint",
            						lv_lowerEndpoint_3_0,
            						"fr.tblf.energy.estimation.Eel.Measure");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getIntervalAccess().getUpperEndpointKeyword_4());
            		
            // InternalEel.g:2045:3: ( (lv_upperEndpoint_5_0= ruleMeasure ) )
            // InternalEel.g:2046:4: (lv_upperEndpoint_5_0= ruleMeasure )
            {
            // InternalEel.g:2046:4: (lv_upperEndpoint_5_0= ruleMeasure )
            // InternalEel.g:2047:5: lv_upperEndpoint_5_0= ruleMeasure
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
            						"fr.tblf.energy.estimation.Eel.Measure");
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
    // InternalEel.g:2072:1: entryRuleSampling returns [EObject current=null] : iv_ruleSampling= ruleSampling EOF ;
    public final EObject entryRuleSampling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSampling = null;


        try {
            // InternalEel.g:2072:49: (iv_ruleSampling= ruleSampling EOF )
            // InternalEel.g:2073:2: iv_ruleSampling= ruleSampling EOF
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
    // InternalEel.g:2079:1: ruleSampling returns [EObject current=null] : ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalEel.g:2085:2: ( ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalEel.g:2086:2: ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalEel.g:2086:2: ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalEel.g:2087:3: () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalEel.g:2087:3: ()
            // InternalEel.g:2088:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSamplingAccess().getSamplingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSamplingAccess().getSamplingKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getSamplingAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:2102:3: (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalEel.g:2103:4: otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSamplingAccess().getMeasurementProcedureKeyword_3_0());
                    			
                    // InternalEel.g:2107:4: ( (lv_measurementProcedure_4_0= ruleEString ) )
                    // InternalEel.g:2108:5: (lv_measurementProcedure_4_0= ruleEString )
                    {
                    // InternalEel.g:2108:5: (lv_measurementProcedure_4_0= ruleEString )
                    // InternalEel.g:2109:6: lv_measurementProcedure_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSamplingAccess().getMeasurementProcedureEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_measurementProcedure_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSamplingRule());
                    						}
                    						set(
                    							current,
                    							"measurementProcedure",
                    							lv_measurementProcedure_4_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2127:3: (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==36) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalEel.g:2128:4: otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getSamplingAccess().getSamplesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_6, grammarAccess.getSamplingAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalEel.g:2136:4: ( (lv_samples_7_0= ruleSample ) )
                    // InternalEel.g:2137:5: (lv_samples_7_0= ruleSample )
                    {
                    // InternalEel.g:2137:5: (lv_samples_7_0= ruleSample )
                    // InternalEel.g:2138:6: lv_samples_7_0= ruleSample
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
                    							"fr.tblf.energy.estimation.Eel.Sample");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:2155:4: (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==14) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalEel.g:2156:5: otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_36); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSamplingAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalEel.g:2160:5: ( (lv_samples_9_0= ruleSample ) )
                    	    // InternalEel.g:2161:6: (lv_samples_9_0= ruleSample )
                    	    {
                    	    // InternalEel.g:2161:6: (lv_samples_9_0= ruleSample )
                    	    // InternalEel.g:2162:7: lv_samples_9_0= ruleSample
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
                    	    								"fr.tblf.energy.estimation.Eel.Sample");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
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
    // InternalEel.g:2193:1: entryRuleIntegral returns [EObject current=null] : iv_ruleIntegral= ruleIntegral EOF ;
    public final EObject entryRuleIntegral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegral = null;


        try {
            // InternalEel.g:2193:49: (iv_ruleIntegral= ruleIntegral EOF )
            // InternalEel.g:2194:2: iv_ruleIntegral= ruleIntegral EOF
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
    // InternalEel.g:2200:1: ruleIntegral returns [EObject current=null] : (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' ) ;
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
            // InternalEel.g:2206:2: ( (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalEel.g:2207:2: (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalEel.g:2207:2: (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalEel.g:2208:3: otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIntegralAccess().getIntegralKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegralAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalEel.g:2216:3: (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==38) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalEel.g:2217:4: otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getIntegralAccess().getFunctionKeyword_2_0());
                    			
                    // InternalEel.g:2221:4: ( (lv_function_3_0= ruleEString ) )
                    // InternalEel.g:2222:5: (lv_function_3_0= ruleEString )
                    {
                    // InternalEel.g:2222:5: (lv_function_3_0= ruleEString )
                    // InternalEel.g:2223:6: lv_function_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIntegralAccess().getFunctionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_function_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegralRule());
                    						}
                    						set(
                    							current,
                    							"function",
                    							lv_function_3_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getIntegralAccess().getIntervalKeyword_3());
            		
            // InternalEel.g:2245:3: ( ( ruleEString ) )
            // InternalEel.g:2246:4: ( ruleEString )
            {
            // InternalEel.g:2246:4: ( ruleEString )
            // InternalEel.g:2247:5: ruleEString
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
    // InternalEel.g:2269:1: entryRuleSample returns [EObject current=null] : iv_ruleSample= ruleSample EOF ;
    public final EObject entryRuleSample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSample = null;


        try {
            // InternalEel.g:2269:47: (iv_ruleSample= ruleSample EOF )
            // InternalEel.g:2270:2: iv_ruleSample= ruleSample EOF
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
    // InternalEel.g:2276:1: ruleSample returns [EObject current=null] : ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalEel.g:2282:2: ( ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalEel.g:2283:2: ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalEel.g:2283:2: ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalEel.g:2284:3: () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalEel.g:2284:3: ()
            // InternalEel.g:2285:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSampleAccess().getSampleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSampleAccess().getSampleKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getSampleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:2299:3: (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==41) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalEel.g:2300:4: otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSampleAccess().getQuantityKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getSampleAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalEel.g:2308:4: ( (lv_quantity_5_0= ruleMeasure ) )
                    // InternalEel.g:2309:5: (lv_quantity_5_0= ruleMeasure )
                    {
                    // InternalEel.g:2309:5: (lv_quantity_5_0= ruleMeasure )
                    // InternalEel.g:2310:6: lv_quantity_5_0= ruleMeasure
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
                    							"fr.tblf.energy.estimation.Eel.Measure");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:2327:4: (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==14) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalEel.g:2328:5: otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSampleAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalEel.g:2332:5: ( (lv_quantity_7_0= ruleMeasure ) )
                    	    // InternalEel.g:2333:6: (lv_quantity_7_0= ruleMeasure )
                    	    {
                    	    // InternalEel.g:2333:6: (lv_quantity_7_0= ruleMeasure )
                    	    // InternalEel.g:2334:7: lv_quantity_7_0= ruleMeasure
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
                    	    								"fr.tblf.energy.estimation.Eel.Measure");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
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
    // InternalEel.g:2365:1: entryRuleEStructuralFeature returns [EObject current=null] : iv_ruleEStructuralFeature= ruleEStructuralFeature EOF ;
    public final EObject entryRuleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStructuralFeature = null;


        try {
            // InternalEel.g:2365:59: (iv_ruleEStructuralFeature= ruleEStructuralFeature EOF )
            // InternalEel.g:2366:2: iv_ruleEStructuralFeature= ruleEStructuralFeature EOF
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
    // InternalEel.g:2372:1: ruleEStructuralFeature returns [EObject current=null] : (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) ;
    public final EObject ruleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject this_EAttribute_0 = null;

        EObject this_EReference_1 = null;



        	enterRule();

        try {
            // InternalEel.g:2378:2: ( (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) )
            // InternalEel.g:2379:2: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            {
            // InternalEel.g:2379:2: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            int alt45=2;
            switch ( input.LA(1) ) {
            case 84:
                {
                switch ( input.LA(2) ) {
                case 85:
                    {
                    switch ( input.LA(3) ) {
                    case 86:
                        {
                        switch ( input.LA(4) ) {
                        case 87:
                            {
                            int LA45_4 = input.LA(5);

                            if ( ((LA45_4>=92 && LA45_4<=93)) ) {
                                alt45=2;
                            }
                            else if ( ((LA45_4>=88 && LA45_4<=89)) ) {
                                alt45=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 45, 4, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 88:
                        case 89:
                            {
                            alt45=1;
                            }
                            break;
                        case 92:
                        case 93:
                            {
                            alt45=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 45, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 87:
                        {
                        int LA45_4 = input.LA(4);

                        if ( ((LA45_4>=92 && LA45_4<=93)) ) {
                            alt45=2;
                        }
                        else if ( ((LA45_4>=88 && LA45_4<=89)) ) {
                            alt45=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 45, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 88:
                    case 89:
                        {
                        alt45=1;
                        }
                        break;
                    case 92:
                    case 93:
                        {
                        alt45=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case 86:
                    {
                    switch ( input.LA(3) ) {
                    case 87:
                        {
                        int LA45_4 = input.LA(4);

                        if ( ((LA45_4>=92 && LA45_4<=93)) ) {
                            alt45=2;
                        }
                        else if ( ((LA45_4>=88 && LA45_4<=89)) ) {
                            alt45=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 45, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 88:
                    case 89:
                        {
                        alt45=1;
                        }
                        break;
                    case 92:
                    case 93:
                        {
                        alt45=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 87:
                    {
                    int LA45_4 = input.LA(3);

                    if ( ((LA45_4>=92 && LA45_4<=93)) ) {
                        alt45=2;
                    }
                    else if ( ((LA45_4>=88 && LA45_4<=89)) ) {
                        alt45=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 92:
                case 93:
                    {
                    alt45=2;
                    }
                    break;
                case 88:
                case 89:
                    {
                    alt45=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }

                }
                break;
            case 85:
                {
                switch ( input.LA(2) ) {
                case 86:
                    {
                    switch ( input.LA(3) ) {
                    case 87:
                        {
                        int LA45_4 = input.LA(4);

                        if ( ((LA45_4>=92 && LA45_4<=93)) ) {
                            alt45=2;
                        }
                        else if ( ((LA45_4>=88 && LA45_4<=89)) ) {
                            alt45=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 45, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 88:
                    case 89:
                        {
                        alt45=1;
                        }
                        break;
                    case 92:
                    case 93:
                        {
                        alt45=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 87:
                    {
                    int LA45_4 = input.LA(3);

                    if ( ((LA45_4>=92 && LA45_4<=93)) ) {
                        alt45=2;
                    }
                    else if ( ((LA45_4>=88 && LA45_4<=89)) ) {
                        alt45=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 88:
                case 89:
                    {
                    alt45=1;
                    }
                    break;
                case 92:
                case 93:
                    {
                    alt45=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;
                }

                }
                break;
            case 86:
                {
                switch ( input.LA(2) ) {
                case 87:
                    {
                    int LA45_4 = input.LA(3);

                    if ( ((LA45_4>=92 && LA45_4<=93)) ) {
                        alt45=2;
                    }
                    else if ( ((LA45_4>=88 && LA45_4<=89)) ) {
                        alt45=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 88:
                case 89:
                    {
                    alt45=1;
                    }
                    break;
                case 92:
                case 93:
                    {
                    alt45=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 3, input);

                    throw nvae;
                }

                }
                break;
            case 87:
                {
                int LA45_4 = input.LA(2);

                if ( ((LA45_4>=92 && LA45_4<=93)) ) {
                    alt45=2;
                }
                else if ( ((LA45_4>=88 && LA45_4<=89)) ) {
                    alt45=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 4, input);

                    throw nvae;
                }
                }
                break;
            case 88:
            case 89:
                {
                alt45=1;
                }
                break;
            case 92:
            case 93:
                {
                alt45=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalEel.g:2380:3: this_EAttribute_0= ruleEAttribute
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
                    // InternalEel.g:2389:3: this_EReference_1= ruleEReference
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
    // InternalEel.g:2401:1: entryRuleEClass returns [EObject current=null] : iv_ruleEClass= ruleEClass EOF ;
    public final EObject entryRuleEClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClass = null;


        try {
            // InternalEel.g:2401:47: (iv_ruleEClass= ruleEClass EOF )
            // InternalEel.g:2402:2: iv_ruleEClass= ruleEClass EOF
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
    // InternalEel.g:2408:1: ruleEClass returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
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
            // InternalEel.g:2414:2: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // InternalEel.g:2415:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // InternalEel.g:2415:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // InternalEel.g:2416:3: () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // InternalEel.g:2416:3: ()
            // InternalEel.g:2417:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEClassAccess().getEClassAction_0(),
            					current);
            			

            }

            // InternalEel.g:2423:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==42) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalEel.g:2424:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalEel.g:2424:4: (lv_abstract_1_0= 'abstract' )
                    // InternalEel.g:2425:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,42,FOLLOW_40); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getEClassAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:2437:3: ( (lv_interface_2_0= 'interface' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==43) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalEel.g:2438:4: (lv_interface_2_0= 'interface' )
                    {
                    // InternalEel.g:2438:4: (lv_interface_2_0= 'interface' )
                    // InternalEel.g:2439:5: lv_interface_2_0= 'interface'
                    {
                    lv_interface_2_0=(Token)match(input,43,FOLLOW_41); 

                    					newLeafNode(lv_interface_2_0, grammarAccess.getEClassAccess().getInterfaceInterfaceKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEClassRule());
                    					}
                    					setWithLastConsumed(current, "interface", true, "interface");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getEClassAccess().getEClassKeyword_3());
            		
            // InternalEel.g:2455:3: ( (lv_name_4_0= ruleEString ) )
            // InternalEel.g:2456:4: (lv_name_4_0= ruleEString )
            {
            // InternalEel.g:2456:4: (lv_name_4_0= ruleEString )
            // InternalEel.g:2457:5: lv_name_4_0= ruleEString
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
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_5, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalEel.g:2478:3: (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==45) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalEel.g:2479:4: otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEClassAccess().getInstanceClassNameKeyword_6_0());
                    			
                    // InternalEel.g:2483:4: ( (lv_instanceClassName_7_0= ruleEString ) )
                    // InternalEel.g:2484:5: (lv_instanceClassName_7_0= ruleEString )
                    {
                    // InternalEel.g:2484:5: (lv_instanceClassName_7_0= ruleEString )
                    // InternalEel.g:2485:6: lv_instanceClassName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getInstanceClassNameEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_instanceClassName_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						set(
                    							current,
                    							"instanceClassName",
                    							lv_instanceClassName_7_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2503:3: (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==46) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalEel.g:2504:4: otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getEClassAccess().getInstanceTypeNameKeyword_7_0());
                    			
                    // InternalEel.g:2508:4: ( (lv_instanceTypeName_9_0= ruleEString ) )
                    // InternalEel.g:2509:5: (lv_instanceTypeName_9_0= ruleEString )
                    {
                    // InternalEel.g:2509:5: (lv_instanceTypeName_9_0= ruleEString )
                    // InternalEel.g:2510:6: lv_instanceTypeName_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getInstanceTypeNameEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_instanceTypeName_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						set(
                    							current,
                    							"instanceTypeName",
                    							lv_instanceTypeName_9_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2528:3: (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==47) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalEel.g:2529:4: otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,47,FOLLOW_45); 

                    				newLeafNode(otherlv_10, grammarAccess.getEClassAccess().getESuperTypesKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getEClassAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalEel.g:2537:4: ( ( ruleEString ) )
                    // InternalEel.g:2538:5: ( ruleEString )
                    {
                    // InternalEel.g:2538:5: ( ruleEString )
                    // InternalEel.g:2539:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_46);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:2553:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==14) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalEel.g:2554:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEClassAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalEel.g:2558:5: ( ( ruleEString ) )
                    	    // InternalEel.g:2559:6: ( ruleEString )
                    	    {
                    	    // InternalEel.g:2559:6: ( ruleEString )
                    	    // InternalEel.g:2560:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_46);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,49,FOLLOW_47); 

                    				newLeafNode(otherlv_15, grammarAccess.getEClassAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:2580:3: (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==50) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalEel.g:2581:4: otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEClassAccess().getEAnnotationsKeyword_9_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_17, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalEel.g:2589:4: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    // InternalEel.g:2590:5: (lv_eAnnotations_18_0= ruleEAnnotation )
                    {
                    // InternalEel.g:2590:5: (lv_eAnnotations_18_0= ruleEAnnotation )
                    // InternalEel.g:2591:6: lv_eAnnotations_18_0= ruleEAnnotation
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
                    							"fr.tblf.energy.estimation.Eel.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:2608:4: (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==14) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalEel.g:2609:5: otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEClassAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalEel.g:2613:5: ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    // InternalEel.g:2614:6: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:2614:6: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    // InternalEel.g:2615:7: lv_eAnnotations_20_0= ruleEAnnotation
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
                    	    								"fr.tblf.energy.estimation.Eel.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_49); 

                    				newLeafNode(otherlv_21, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:2638:3: (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==51) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalEel.g:2639:4: otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,51,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getEClassAccess().getETypeParametersKeyword_10_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_23, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalEel.g:2647:4: ( (lv_eTypeParameters_24_0= ruleETypeParameter ) )
                    // InternalEel.g:2648:5: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    {
                    // InternalEel.g:2648:5: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    // InternalEel.g:2649:6: lv_eTypeParameters_24_0= ruleETypeParameter
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
                    							"fr.tblf.energy.estimation.Eel.ETypeParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:2666:4: (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==14) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalEel.g:2667:5: otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_50); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getEClassAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalEel.g:2671:5: ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    // InternalEel.g:2672:6: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    {
                    	    // InternalEel.g:2672:6: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    // InternalEel.g:2673:7: lv_eTypeParameters_26_0= ruleETypeParameter
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
                    	    								"fr.tblf.energy.estimation.Eel.ETypeParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_51); 

                    				newLeafNode(otherlv_27, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:2696:3: (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==52) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalEel.g:2697:4: otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getEClassAccess().getEOperationsKeyword_11_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_52); 

                    				newLeafNode(otherlv_29, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalEel.g:2705:4: ( (lv_eOperations_30_0= ruleEOperation ) )
                    // InternalEel.g:2706:5: (lv_eOperations_30_0= ruleEOperation )
                    {
                    // InternalEel.g:2706:5: (lv_eOperations_30_0= ruleEOperation )
                    // InternalEel.g:2707:6: lv_eOperations_30_0= ruleEOperation
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
                    							"fr.tblf.energy.estimation.Eel.EOperation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:2724:4: (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==14) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalEel.g:2725:5: otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    {
                    	    otherlv_31=(Token)match(input,14,FOLLOW_52); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getEClassAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalEel.g:2729:5: ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    // InternalEel.g:2730:6: (lv_eOperations_32_0= ruleEOperation )
                    	    {
                    	    // InternalEel.g:2730:6: (lv_eOperations_32_0= ruleEOperation )
                    	    // InternalEel.g:2731:7: lv_eOperations_32_0= ruleEOperation
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
                    	    								"fr.tblf.energy.estimation.Eel.EOperation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,15,FOLLOW_53); 

                    				newLeafNode(otherlv_33, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:2754:3: (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==53) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalEel.g:2755:4: otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getEClassAccess().getEStructuralFeaturesKeyword_12_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_54); 

                    				newLeafNode(otherlv_35, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalEel.g:2763:4: ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) )
                    // InternalEel.g:2764:5: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    {
                    // InternalEel.g:2764:5: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    // InternalEel.g:2765:6: lv_eStructuralFeatures_36_0= ruleEStructuralFeature
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
                    							"fr.tblf.energy.estimation.Eel.EStructuralFeature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:2782:4: (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==14) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalEel.g:2783:5: otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    {
                    	    otherlv_37=(Token)match(input,14,FOLLOW_54); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getEClassAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalEel.g:2787:5: ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    // InternalEel.g:2788:6: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    {
                    	    // InternalEel.g:2788:6: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    // InternalEel.g:2789:7: lv_eStructuralFeatures_38_0= ruleEStructuralFeature
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
                    	    								"fr.tblf.energy.estimation.Eel.EStructuralFeature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,15,FOLLOW_55); 

                    				newLeafNode(otherlv_39, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:2812:3: (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==54) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalEel.g:2813:4: otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,54,FOLLOW_4); 

                    				newLeafNode(otherlv_40, grammarAccess.getEClassAccess().getEGenericSuperTypesKeyword_13_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_56); 

                    				newLeafNode(otherlv_41, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalEel.g:2821:4: ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) )
                    // InternalEel.g:2822:5: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    {
                    // InternalEel.g:2822:5: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    // InternalEel.g:2823:6: lv_eGenericSuperTypes_42_0= ruleEGenericType
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
                    							"fr.tblf.energy.estimation.Eel.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:2840:4: (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==14) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalEel.g:2841:5: otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getEClassAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalEel.g:2845:5: ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    // InternalEel.g:2846:6: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    {
                    	    // InternalEel.g:2846:6: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    // InternalEel.g:2847:7: lv_eGenericSuperTypes_44_0= ruleEGenericType
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
                    	    								"fr.tblf.energy.estimation.Eel.EGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
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
    // InternalEel.g:2878:1: entryRuleEOperation returns [EObject current=null] : iv_ruleEOperation= ruleEOperation EOF ;
    public final EObject entryRuleEOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperation = null;


        try {
            // InternalEel.g:2878:51: (iv_ruleEOperation= ruleEOperation EOF )
            // InternalEel.g:2879:2: iv_ruleEOperation= ruleEOperation EOF
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
    // InternalEel.g:2885:1: ruleEOperation returns [EObject current=null] : ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
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
            // InternalEel.g:2891:2: ( ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // InternalEel.g:2892:2: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // InternalEel.g:2892:2: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // InternalEel.g:2893:3: () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // InternalEel.g:2893:3: ()
            // InternalEel.g:2894:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOperationAccess().getEOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEOperationAccess().getEOperationKeyword_1());
            		
            // InternalEel.g:2904:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:2905:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:2905:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:2906:5: lv_name_2_0= ruleEString
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
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_57); 

            			newLeafNode(otherlv_3, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:2927:3: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==56) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalEel.g:2928:4: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_58); 

                    				newLeafNode(otherlv_4, grammarAccess.getEOperationAccess().getOrderedKeyword_4_0());
                    			
                    // InternalEel.g:2932:4: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // InternalEel.g:2933:5: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // InternalEel.g:2933:5: (lv_ordered_5_0= ruleEBoolean )
                    // InternalEel.g:2934:6: lv_ordered_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getOrderedEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_ordered_5_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"ordered",
                    							lv_ordered_5_0,
                    							"fr.tblf.energy.estimation.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2952:3: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==57) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalEel.g:2953:4: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_58); 

                    				newLeafNode(otherlv_6, grammarAccess.getEOperationAccess().getUniqueKeyword_5_0());
                    			
                    // InternalEel.g:2957:4: ( (lv_unique_7_0= ruleEBoolean ) )
                    // InternalEel.g:2958:5: (lv_unique_7_0= ruleEBoolean )
                    {
                    // InternalEel.g:2958:5: (lv_unique_7_0= ruleEBoolean )
                    // InternalEel.g:2959:6: lv_unique_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getUniqueEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    lv_unique_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"unique",
                    							lv_unique_7_0,
                    							"fr.tblf.energy.estimation.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2977:3: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==58) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalEel.g:2978:4: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,58,FOLLOW_61); 

                    				newLeafNode(otherlv_8, grammarAccess.getEOperationAccess().getLowerBoundKeyword_6_0());
                    			
                    // InternalEel.g:2982:4: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // InternalEel.g:2983:5: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // InternalEel.g:2983:5: (lv_lowerBound_9_0= ruleEInt )
                    // InternalEel.g:2984:6: lv_lowerBound_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getLowerBoundEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_62);
                    lv_lowerBound_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_9_0,
                    							"fr.tblf.energy.estimation.Eel.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3002:3: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==59) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalEel.g:3003:4: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,59,FOLLOW_61); 

                    				newLeafNode(otherlv_10, grammarAccess.getEOperationAccess().getUpperBoundKeyword_7_0());
                    			
                    // InternalEel.g:3007:4: ( (lv_upperBound_11_0= ruleEInt ) )
                    // InternalEel.g:3008:5: (lv_upperBound_11_0= ruleEInt )
                    {
                    // InternalEel.g:3008:5: (lv_upperBound_11_0= ruleEInt )
                    // InternalEel.g:3009:6: lv_upperBound_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getUpperBoundEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_63);
                    lv_upperBound_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_11_0,
                    							"fr.tblf.energy.estimation.Eel.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3027:3: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==60) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalEel.g:3028:4: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,60,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getEOperationAccess().getETypeKeyword_8_0());
                    			
                    // InternalEel.g:3032:4: ( ( ruleEString ) )
                    // InternalEel.g:3033:5: ( ruleEString )
                    {
                    // InternalEel.g:3033:5: ( ruleEString )
                    // InternalEel.g:3034:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEOperationAccess().getETypeEClassifierCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3049:3: (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==61) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalEel.g:3050:4: otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')'
                    {
                    otherlv_14=(Token)match(input,61,FOLLOW_45); 

                    				newLeafNode(otherlv_14, grammarAccess.getEOperationAccess().getEExceptionsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getEOperationAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalEel.g:3058:4: ( ( ruleEString ) )
                    // InternalEel.g:3059:5: ( ruleEString )
                    {
                    // InternalEel.g:3059:5: ( ruleEString )
                    // InternalEel.g:3060:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_46);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3074:4: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==14) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalEel.g:3075:5: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEOperationAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalEel.g:3079:5: ( ( ruleEString ) )
                    	    // InternalEel.g:3080:6: ( ruleEString )
                    	    {
                    	    // InternalEel.g:3080:6: ( ruleEString )
                    	    // InternalEel.g:3081:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEOperationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_46);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,49,FOLLOW_65); 

                    				newLeafNode(otherlv_19, grammarAccess.getEOperationAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3101:3: (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==50) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalEel.g:3102:4: otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getEOperationAccess().getEAnnotationsKeyword_10_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_21, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalEel.g:3110:4: ( (lv_eAnnotations_22_0= ruleEAnnotation ) )
                    // InternalEel.g:3111:5: (lv_eAnnotations_22_0= ruleEAnnotation )
                    {
                    // InternalEel.g:3111:5: (lv_eAnnotations_22_0= ruleEAnnotation )
                    // InternalEel.g:3112:6: lv_eAnnotations_22_0= ruleEAnnotation
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
                    							"fr.tblf.energy.estimation.Eel.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3129:4: (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==14) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalEel.g:3130:5: otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_23=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getEOperationAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalEel.g:3134:5: ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    // InternalEel.g:3135:6: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:3135:6: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    // InternalEel.g:3136:7: lv_eAnnotations_24_0= ruleEAnnotation
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
                    	    								"fr.tblf.energy.estimation.Eel.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,15,FOLLOW_66); 

                    				newLeafNode(otherlv_25, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3159:3: (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==62) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalEel.g:3160:4: otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    {
                    otherlv_26=(Token)match(input,62,FOLLOW_56); 

                    				newLeafNode(otherlv_26, grammarAccess.getEOperationAccess().getEGenericTypeKeyword_11_0());
                    			
                    // InternalEel.g:3164:4: ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    // InternalEel.g:3165:5: (lv_eGenericType_27_0= ruleEGenericType )
                    {
                    // InternalEel.g:3165:5: (lv_eGenericType_27_0= ruleEGenericType )
                    // InternalEel.g:3166:6: lv_eGenericType_27_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEGenericTypeEGenericTypeParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    lv_eGenericType_27_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"eGenericType",
                    							lv_eGenericType_27_0,
                    							"fr.tblf.energy.estimation.Eel.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3184:3: (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==51) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalEel.g:3185:4: otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,51,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getEOperationAccess().getETypeParametersKeyword_12_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_29, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalEel.g:3193:4: ( (lv_eTypeParameters_30_0= ruleETypeParameter ) )
                    // InternalEel.g:3194:5: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    {
                    // InternalEel.g:3194:5: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    // InternalEel.g:3195:6: lv_eTypeParameters_30_0= ruleETypeParameter
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
                    							"fr.tblf.energy.estimation.Eel.ETypeParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3212:4: (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==14) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalEel.g:3213:5: otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_31=(Token)match(input,14,FOLLOW_50); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getEOperationAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalEel.g:3217:5: ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    // InternalEel.g:3218:6: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    {
                    	    // InternalEel.g:3218:6: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    // InternalEel.g:3219:7: lv_eTypeParameters_32_0= ruleETypeParameter
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
                    	    								"fr.tblf.energy.estimation.Eel.ETypeParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,15,FOLLOW_68); 

                    				newLeafNode(otherlv_33, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3242:3: (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==63) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalEel.g:3243:4: otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,63,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getEOperationAccess().getEParametersKeyword_13_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_69); 

                    				newLeafNode(otherlv_35, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalEel.g:3251:4: ( (lv_eParameters_36_0= ruleEParameter ) )
                    // InternalEel.g:3252:5: (lv_eParameters_36_0= ruleEParameter )
                    {
                    // InternalEel.g:3252:5: (lv_eParameters_36_0= ruleEParameter )
                    // InternalEel.g:3253:6: lv_eParameters_36_0= ruleEParameter
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
                    							"fr.tblf.energy.estimation.Eel.EParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3270:4: (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==14) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalEel.g:3271:5: otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    {
                    	    otherlv_37=(Token)match(input,14,FOLLOW_69); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getEOperationAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalEel.g:3275:5: ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    // InternalEel.g:3276:6: (lv_eParameters_38_0= ruleEParameter )
                    	    {
                    	    // InternalEel.g:3276:6: (lv_eParameters_38_0= ruleEParameter )
                    	    // InternalEel.g:3277:7: lv_eParameters_38_0= ruleEParameter
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
                    	    								"fr.tblf.energy.estimation.Eel.EParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,15,FOLLOW_70); 

                    				newLeafNode(otherlv_39, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3300:3: (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==64) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalEel.g:3301:4: otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,64,FOLLOW_4); 

                    				newLeafNode(otherlv_40, grammarAccess.getEOperationAccess().getEGenericExceptionsKeyword_14_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_56); 

                    				newLeafNode(otherlv_41, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalEel.g:3309:4: ( (lv_eGenericExceptions_42_0= ruleEGenericType ) )
                    // InternalEel.g:3310:5: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    {
                    // InternalEel.g:3310:5: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    // InternalEel.g:3311:6: lv_eGenericExceptions_42_0= ruleEGenericType
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
                    							"fr.tblf.energy.estimation.Eel.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3328:4: (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==14) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalEel.g:3329:5: otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getEOperationAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalEel.g:3333:5: ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    // InternalEel.g:3334:6: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    {
                    	    // InternalEel.g:3334:6: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    // InternalEel.g:3335:7: lv_eGenericExceptions_44_0= ruleEGenericType
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
                    	    								"fr.tblf.energy.estimation.Eel.EGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
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
    // InternalEel.g:3366:1: entryRuleEAnnotation returns [EObject current=null] : iv_ruleEAnnotation= ruleEAnnotation EOF ;
    public final EObject entryRuleEAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAnnotation = null;


        try {
            // InternalEel.g:3366:52: (iv_ruleEAnnotation= ruleEAnnotation EOF )
            // InternalEel.g:3367:2: iv_ruleEAnnotation= ruleEAnnotation EOF
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
    // InternalEel.g:3373:1: ruleEAnnotation returns [EObject current=null] : ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
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
            // InternalEel.g:3379:2: ( ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // InternalEel.g:3380:2: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // InternalEel.g:3380:2: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // InternalEel.g:3381:3: () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // InternalEel.g:3381:3: ()
            // InternalEel.g:3382:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAnnotationAccess().getEAnnotationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEAnnotationAccess().getEAnnotationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_71); 

            			newLeafNode(otherlv_2, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:3396:3: (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==66) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalEel.g:3397:4: otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEAnnotationAccess().getSourceKeyword_3_0());
                    			
                    // InternalEel.g:3401:4: ( (lv_source_4_0= ruleEString ) )
                    // InternalEel.g:3402:5: (lv_source_4_0= ruleEString )
                    {
                    // InternalEel.g:3402:5: (lv_source_4_0= ruleEString )
                    // InternalEel.g:3403:6: lv_source_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getSourceEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_72);
                    lv_source_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    						}
                    						set(
                    							current,
                    							"source",
                    							lv_source_4_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3421:3: (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==67) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalEel.g:3422:4: otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,67,FOLLOW_45); 

                    				newLeafNode(otherlv_5, grammarAccess.getEAnnotationAccess().getReferencesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEAnnotationAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalEel.g:3430:4: ( ( ruleEString ) )
                    // InternalEel.g:3431:5: ( ruleEString )
                    {
                    // InternalEel.g:3431:5: ( ruleEString )
                    // InternalEel.g:3432:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAnnotationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_46);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3446:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==14) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalEel.g:3447:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEAnnotationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalEel.g:3451:5: ( ( ruleEString ) )
                    	    // InternalEel.g:3452:6: ( ruleEString )
                    	    {
                    	    // InternalEel.g:3452:6: ( ruleEString )
                    	    // InternalEel.g:3453:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAnnotationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_46);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,49,FOLLOW_73); 

                    				newLeafNode(otherlv_10, grammarAccess.getEAnnotationAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3473:3: (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==50) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalEel.g:3474:4: otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getEAnnotationAccess().getEAnnotationsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_12, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalEel.g:3482:4: ( (lv_eAnnotations_13_0= ruleEAnnotation ) )
                    // InternalEel.g:3483:5: (lv_eAnnotations_13_0= ruleEAnnotation )
                    {
                    // InternalEel.g:3483:5: (lv_eAnnotations_13_0= ruleEAnnotation )
                    // InternalEel.g:3484:6: lv_eAnnotations_13_0= ruleEAnnotation
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
                    							"fr.tblf.energy.estimation.Eel.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3501:4: (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==14) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalEel.g:3502:5: otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getEAnnotationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalEel.g:3506:5: ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    // InternalEel.g:3507:6: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:3507:6: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    // InternalEel.g:3508:7: lv_eAnnotations_15_0= ruleEAnnotation
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
                    	    								"fr.tblf.energy.estimation.Eel.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,15,FOLLOW_74); 

                    				newLeafNode(otherlv_16, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3531:3: (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==68) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalEel.g:3532:4: otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,68,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getEAnnotationAccess().getDetailsKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_75); 

                    				newLeafNode(otherlv_18, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalEel.g:3540:4: ( (lv_details_19_0= ruleEStringToStringMapEntry ) )
                    // InternalEel.g:3541:5: (lv_details_19_0= ruleEStringToStringMapEntry )
                    {
                    // InternalEel.g:3541:5: (lv_details_19_0= ruleEStringToStringMapEntry )
                    // InternalEel.g:3542:6: lv_details_19_0= ruleEStringToStringMapEntry
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
                    							"fr.tblf.energy.estimation.Eel.EStringToStringMapEntry");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3559:4: (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==14) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalEel.g:3560:5: otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FOLLOW_75); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getEAnnotationAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalEel.g:3564:5: ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    // InternalEel.g:3565:6: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    {
                    	    // InternalEel.g:3565:6: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    // InternalEel.g:3566:7: lv_details_21_0= ruleEStringToStringMapEntry
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
                    	    								"fr.tblf.energy.estimation.Eel.EStringToStringMapEntry");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,15,FOLLOW_76); 

                    				newLeafNode(otherlv_22, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3589:3: (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==69) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalEel.g:3590:4: otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,69,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getEAnnotationAccess().getContentsKeyword_7_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_77); 

                    				newLeafNode(otherlv_24, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalEel.g:3598:4: ( (lv_contents_25_0= ruleEObject ) )
                    // InternalEel.g:3599:5: (lv_contents_25_0= ruleEObject )
                    {
                    // InternalEel.g:3599:5: (lv_contents_25_0= ruleEObject )
                    // InternalEel.g:3600:6: lv_contents_25_0= ruleEObject
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
                    							"fr.tblf.energy.estimation.Eel.EObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3617:4: (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==14) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // InternalEel.g:3618:5: otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_77); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getEAnnotationAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalEel.g:3622:5: ( (lv_contents_27_0= ruleEObject ) )
                    	    // InternalEel.g:3623:6: (lv_contents_27_0= ruleEObject )
                    	    {
                    	    // InternalEel.g:3623:6: (lv_contents_27_0= ruleEObject )
                    	    // InternalEel.g:3624:7: lv_contents_27_0= ruleEObject
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
                    	    								"fr.tblf.energy.estimation.Eel.EObject");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
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
    // InternalEel.g:3655:1: entryRuleETypeParameter returns [EObject current=null] : iv_ruleETypeParameter= ruleETypeParameter EOF ;
    public final EObject entryRuleETypeParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETypeParameter = null;


        try {
            // InternalEel.g:3655:55: (iv_ruleETypeParameter= ruleETypeParameter EOF )
            // InternalEel.g:3656:2: iv_ruleETypeParameter= ruleETypeParameter EOF
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
    // InternalEel.g:3662:1: ruleETypeParameter returns [EObject current=null] : ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalEel.g:3668:2: ( ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalEel.g:3669:2: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalEel.g:3669:2: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalEel.g:3670:3: () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalEel.g:3670:3: ()
            // InternalEel.g:3671:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getETypeParameterAccess().getETypeParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getETypeParameterAccess().getETypeParameterKeyword_1());
            		
            // InternalEel.g:3681:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:3682:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:3682:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:3683:5: lv_name_2_0= ruleEString
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
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_78); 

            			newLeafNode(otherlv_3, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:3704:3: (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==50) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalEel.g:3705:4: otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getETypeParameterAccess().getEAnnotationsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_5, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalEel.g:3713:4: ( (lv_eAnnotations_6_0= ruleEAnnotation ) )
                    // InternalEel.g:3714:5: (lv_eAnnotations_6_0= ruleEAnnotation )
                    {
                    // InternalEel.g:3714:5: (lv_eAnnotations_6_0= ruleEAnnotation )
                    // InternalEel.g:3715:6: lv_eAnnotations_6_0= ruleEAnnotation
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
                    							"fr.tblf.energy.estimation.Eel.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3732:4: (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==14) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalEel.g:3733:5: otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getETypeParameterAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalEel.g:3737:5: ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    // InternalEel.g:3738:6: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:3738:6: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    // InternalEel.g:3739:7: lv_eAnnotations_8_0= ruleEAnnotation
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
                    	    								"fr.tblf.energy.estimation.Eel.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_79); 

                    				newLeafNode(otherlv_9, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3762:3: (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==71) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalEel.g:3763:4: otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,71,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getETypeParameterAccess().getEBoundsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_56); 

                    				newLeafNode(otherlv_11, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalEel.g:3771:4: ( (lv_eBounds_12_0= ruleEGenericType ) )
                    // InternalEel.g:3772:5: (lv_eBounds_12_0= ruleEGenericType )
                    {
                    // InternalEel.g:3772:5: (lv_eBounds_12_0= ruleEGenericType )
                    // InternalEel.g:3773:6: lv_eBounds_12_0= ruleEGenericType
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
                    							"fr.tblf.energy.estimation.Eel.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3790:4: (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==14) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalEel.g:3791:5: otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getETypeParameterAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalEel.g:3795:5: ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    // InternalEel.g:3796:6: (lv_eBounds_14_0= ruleEGenericType )
                    	    {
                    	    // InternalEel.g:3796:6: (lv_eBounds_14_0= ruleEGenericType )
                    	    // InternalEel.g:3797:7: lv_eBounds_14_0= ruleEGenericType
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
                    	    								"fr.tblf.energy.estimation.Eel.EGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
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
    // InternalEel.g:3828:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalEel.g:3828:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalEel.g:3829:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalEel.g:3835:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEel.g:3841:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalEel.g:3842:2: (kw= 'true' | kw= 'false' )
            {
            // InternalEel.g:3842:2: (kw= 'true' | kw= 'false' )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==72) ) {
                alt91=1;
            }
            else if ( (LA91_0==73) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // InternalEel.g:3843:3: kw= 'true'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEel.g:3849:3: kw= 'false'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

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
    // InternalEel.g:3858:1: entryRuleEGenericType returns [EObject current=null] : iv_ruleEGenericType= ruleEGenericType EOF ;
    public final EObject entryRuleEGenericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGenericType = null;


        try {
            // InternalEel.g:3858:53: (iv_ruleEGenericType= ruleEGenericType EOF )
            // InternalEel.g:3859:2: iv_ruleEGenericType= ruleEGenericType EOF
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
    // InternalEel.g:3865:1: ruleEGenericType returns [EObject current=null] : ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) ;
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
            // InternalEel.g:3871:2: ( ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) )
            // InternalEel.g:3872:2: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            {
            // InternalEel.g:3872:2: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            // InternalEel.g:3873:3: () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}'
            {
            // InternalEel.g:3873:3: ()
            // InternalEel.g:3874:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEGenericTypeAccess().getEGenericTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEGenericTypeAccess().getEGenericTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_80); 

            			newLeafNode(otherlv_2, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:3888:3: (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==75) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalEel.g:3889:4: otherlv_3= 'eTypeParameter' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,75,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEGenericTypeAccess().getETypeParameterKeyword_3_0());
                    			
                    // InternalEel.g:3893:4: ( ( ruleEString ) )
                    // InternalEel.g:3894:5: ( ruleEString )
                    {
                    // InternalEel.g:3894:5: ( ruleEString )
                    // InternalEel.g:3895:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEGenericTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeParameterETypeParameterCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_81);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3910:3: (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==76) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalEel.g:3911:4: otherlv_5= 'eClassifier' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,76,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEGenericTypeAccess().getEClassifierKeyword_4_0());
                    			
                    // InternalEel.g:3915:4: ( ( ruleEString ) )
                    // InternalEel.g:3916:5: ( ruleEString )
                    {
                    // InternalEel.g:3916:5: ( ruleEString )
                    // InternalEel.g:3917:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEGenericTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getEClassifierEClassifierCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_82);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3932:3: (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==77) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalEel.g:3933:4: otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    {
                    otherlv_7=(Token)match(input,77,FOLLOW_56); 

                    				newLeafNode(otherlv_7, grammarAccess.getEGenericTypeAccess().getEUpperBoundKeyword_5_0());
                    			
                    // InternalEel.g:3937:4: ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    // InternalEel.g:3938:5: (lv_eUpperBound_8_0= ruleEGenericType )
                    {
                    // InternalEel.g:3938:5: (lv_eUpperBound_8_0= ruleEGenericType )
                    // InternalEel.g:3939:6: lv_eUpperBound_8_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getEUpperBoundEGenericTypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_83);
                    lv_eUpperBound_8_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEGenericTypeRule());
                    						}
                    						set(
                    							current,
                    							"eUpperBound",
                    							lv_eUpperBound_8_0,
                    							"fr.tblf.energy.estimation.Eel.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3957:3: (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==78) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalEel.g:3958:4: otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,78,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getEGenericTypeAccess().getETypeArgumentsKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_56); 

                    				newLeafNode(otherlv_10, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalEel.g:3966:4: ( (lv_eTypeArguments_11_0= ruleEGenericType ) )
                    // InternalEel.g:3967:5: (lv_eTypeArguments_11_0= ruleEGenericType )
                    {
                    // InternalEel.g:3967:5: (lv_eTypeArguments_11_0= ruleEGenericType )
                    // InternalEel.g:3968:6: lv_eTypeArguments_11_0= ruleEGenericType
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
                    							"fr.tblf.energy.estimation.Eel.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3985:4: (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==14) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalEel.g:3986:5: otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getEGenericTypeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalEel.g:3990:5: ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    // InternalEel.g:3991:6: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    {
                    	    // InternalEel.g:3991:6: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    // InternalEel.g:3992:7: lv_eTypeArguments_13_0= ruleEGenericType
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
                    	    								"fr.tblf.energy.estimation.Eel.EGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_84); 

                    				newLeafNode(otherlv_14, grammarAccess.getEGenericTypeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:4015:3: (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==79) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalEel.g:4016:4: otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    {
                    otherlv_15=(Token)match(input,79,FOLLOW_56); 

                    				newLeafNode(otherlv_15, grammarAccess.getEGenericTypeAccess().getELowerBoundKeyword_7_0());
                    			
                    // InternalEel.g:4020:4: ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    // InternalEel.g:4021:5: (lv_eLowerBound_16_0= ruleEGenericType )
                    {
                    // InternalEel.g:4021:5: (lv_eLowerBound_16_0= ruleEGenericType )
                    // InternalEel.g:4022:6: lv_eLowerBound_16_0= ruleEGenericType
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
                    							"fr.tblf.energy.estimation.Eel.EGenericType");
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
    // InternalEel.g:4048:1: entryRuleEStringToStringMapEntry returns [EObject current=null] : iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF ;
    public final EObject entryRuleEStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStringToStringMapEntry = null;


        try {
            // InternalEel.g:4048:64: (iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF )
            // InternalEel.g:4049:2: iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF
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
    // InternalEel.g:4055:1: ruleEStringToStringMapEntry returns [EObject current=null] : ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
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
            // InternalEel.g:4061:2: ( ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalEel.g:4062:2: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalEel.g:4062:2: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalEel.g:4063:3: () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalEel.g:4063:3: ()
            // InternalEel.g:4064:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,80,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_85); 

            			newLeafNode(otherlv_2, grammarAccess.getEStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:4078:3: (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==81) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalEel.g:4079:4: otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,81,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEStringToStringMapEntryAccess().getKeyKeyword_3_0());
                    			
                    // InternalEel.g:4083:4: ( (lv_key_4_0= ruleEString ) )
                    // InternalEel.g:4084:5: (lv_key_4_0= ruleEString )
                    {
                    // InternalEel.g:4084:5: (lv_key_4_0= ruleEString )
                    // InternalEel.g:4085:6: lv_key_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_86);
                    lv_key_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEStringToStringMapEntryRule());
                    						}
                    						set(
                    							current,
                    							"key",
                    							lv_key_4_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4103:3: (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==18) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalEel.g:4104:4: otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEStringToStringMapEntryAccess().getValueKeyword_4_0());
                    			
                    // InternalEel.g:4108:4: ( (lv_value_6_0= ruleEString ) )
                    // InternalEel.g:4109:5: (lv_value_6_0= ruleEString )
                    {
                    // InternalEel.g:4109:5: (lv_value_6_0= ruleEString )
                    // InternalEel.g:4110:6: lv_value_6_0= ruleEString
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
                    							"fr.tblf.energy.estimation.Eel.EString");
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
    // InternalEel.g:4136:1: entryRuleEObject returns [EObject current=null] : iv_ruleEObject= ruleEObject EOF ;
    public final EObject entryRuleEObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObject = null;


        try {
            // InternalEel.g:4136:48: (iv_ruleEObject= ruleEObject EOF )
            // InternalEel.g:4137:2: iv_ruleEObject= ruleEObject EOF
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
    // InternalEel.g:4143:1: ruleEObject returns [EObject current=null] : ( () otherlv_1= 'EObject' ) ;
    public final EObject ruleEObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEel.g:4149:2: ( ( () otherlv_1= 'EObject' ) )
            // InternalEel.g:4150:2: ( () otherlv_1= 'EObject' )
            {
            // InternalEel.g:4150:2: ( () otherlv_1= 'EObject' )
            // InternalEel.g:4151:3: () otherlv_1= 'EObject'
            {
            // InternalEel.g:4151:3: ()
            // InternalEel.g:4152:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEObjectAccess().getEObjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,82,FOLLOW_2); 

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
    // InternalEel.g:4166:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalEel.g:4166:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalEel.g:4167:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalEel.g:4173:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalEel.g:4179:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalEel.g:4180:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalEel.g:4180:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalEel.g:4181:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalEel.g:4181:3: (kw= '-' )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==83) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalEel.g:4182:4: kw= '-'
                    {
                    kw=(Token)match(input,83,FOLLOW_16); 

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
    // InternalEel.g:4199:1: entryRuleEAttribute returns [EObject current=null] : iv_ruleEAttribute= ruleEAttribute EOF ;
    public final EObject entryRuleEAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttribute = null;


        try {
            // InternalEel.g:4199:51: (iv_ruleEAttribute= ruleEAttribute EOF )
            // InternalEel.g:4200:2: iv_ruleEAttribute= ruleEAttribute EOF
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
    // InternalEel.g:4206:1: ruleEAttribute returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) ;
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
            // InternalEel.g:4212:2: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) )
            // InternalEel.g:4213:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            {
            // InternalEel.g:4213:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            // InternalEel.g:4214:3: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}'
            {
            // InternalEel.g:4214:3: ()
            // InternalEel.g:4215:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAttributeAccess().getEAttributeAction_0(),
            					current);
            			

            }

            // InternalEel.g:4221:3: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==84) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalEel.g:4222:4: (lv_volatile_1_0= 'volatile' )
                    {
                    // InternalEel.g:4222:4: (lv_volatile_1_0= 'volatile' )
                    // InternalEel.g:4223:5: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,84,FOLLOW_87); 

                    					newLeafNode(lv_volatile_1_0, grammarAccess.getEAttributeAccess().getVolatileVolatileKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "volatile", true, "volatile");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4235:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==85) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalEel.g:4236:4: (lv_transient_2_0= 'transient' )
                    {
                    // InternalEel.g:4236:4: (lv_transient_2_0= 'transient' )
                    // InternalEel.g:4237:5: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,85,FOLLOW_88); 

                    					newLeafNode(lv_transient_2_0, grammarAccess.getEAttributeAccess().getTransientTransientKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "transient", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4249:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==86) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalEel.g:4250:4: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // InternalEel.g:4250:4: (lv_unsettable_3_0= 'unsettable' )
                    // InternalEel.g:4251:5: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,86,FOLLOW_89); 

                    					newLeafNode(lv_unsettable_3_0, grammarAccess.getEAttributeAccess().getUnsettableUnsettableKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "unsettable", true, "unsettable");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4263:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==87) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalEel.g:4264:4: (lv_derived_4_0= 'derived' )
                    {
                    // InternalEel.g:4264:4: (lv_derived_4_0= 'derived' )
                    // InternalEel.g:4265:5: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,87,FOLLOW_90); 

                    					newLeafNode(lv_derived_4_0, grammarAccess.getEAttributeAccess().getDerivedDerivedKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "derived", true, "derived");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4277:3: ( (lv_iD_5_0= 'iD' ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==88) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalEel.g:4278:4: (lv_iD_5_0= 'iD' )
                    {
                    // InternalEel.g:4278:4: (lv_iD_5_0= 'iD' )
                    // InternalEel.g:4279:5: lv_iD_5_0= 'iD'
                    {
                    lv_iD_5_0=(Token)match(input,88,FOLLOW_91); 

                    					newLeafNode(lv_iD_5_0, grammarAccess.getEAttributeAccess().getIDIDKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "iD", true, "iD");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,89,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getEAttributeAccess().getEAttributeKeyword_6());
            		
            // InternalEel.g:4295:3: ( (lv_name_7_0= ruleEString ) )
            // InternalEel.g:4296:4: (lv_name_7_0= ruleEString )
            {
            // InternalEel.g:4296:4: (lv_name_7_0= ruleEString )
            // InternalEel.g:4297:5: lv_name_7_0= ruleEString
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
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,12,FOLLOW_92); 

            			newLeafNode(otherlv_8, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalEel.g:4318:3: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==56) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalEel.g:4319:4: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,56,FOLLOW_58); 

                    				newLeafNode(otherlv_9, grammarAccess.getEAttributeAccess().getOrderedKeyword_9_0());
                    			
                    // InternalEel.g:4323:4: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // InternalEel.g:4324:5: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // InternalEel.g:4324:5: (lv_ordered_10_0= ruleEBoolean )
                    // InternalEel.g:4325:6: lv_ordered_10_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getOrderedEBooleanParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_93);
                    lv_ordered_10_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"ordered",
                    							lv_ordered_10_0,
                    							"fr.tblf.energy.estimation.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4343:3: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==57) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalEel.g:4344:4: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,57,FOLLOW_58); 

                    				newLeafNode(otherlv_11, grammarAccess.getEAttributeAccess().getUniqueKeyword_10_0());
                    			
                    // InternalEel.g:4348:4: ( (lv_unique_12_0= ruleEBoolean ) )
                    // InternalEel.g:4349:5: (lv_unique_12_0= ruleEBoolean )
                    {
                    // InternalEel.g:4349:5: (lv_unique_12_0= ruleEBoolean )
                    // InternalEel.g:4350:6: lv_unique_12_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getUniqueEBooleanParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_94);
                    lv_unique_12_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"unique",
                    							lv_unique_12_0,
                    							"fr.tblf.energy.estimation.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4368:3: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==58) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalEel.g:4369:4: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,58,FOLLOW_61); 

                    				newLeafNode(otherlv_13, grammarAccess.getEAttributeAccess().getLowerBoundKeyword_11_0());
                    			
                    // InternalEel.g:4373:4: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // InternalEel.g:4374:5: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // InternalEel.g:4374:5: (lv_lowerBound_14_0= ruleEInt )
                    // InternalEel.g:4375:6: lv_lowerBound_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getLowerBoundEIntParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_95);
                    lv_lowerBound_14_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_14_0,
                    							"fr.tblf.energy.estimation.Eel.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4393:3: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==59) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalEel.g:4394:4: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,59,FOLLOW_61); 

                    				newLeafNode(otherlv_15, grammarAccess.getEAttributeAccess().getUpperBoundKeyword_12_0());
                    			
                    // InternalEel.g:4398:4: ( (lv_upperBound_16_0= ruleEInt ) )
                    // InternalEel.g:4399:5: (lv_upperBound_16_0= ruleEInt )
                    {
                    // InternalEel.g:4399:5: (lv_upperBound_16_0= ruleEInt )
                    // InternalEel.g:4400:6: lv_upperBound_16_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getUpperBoundEIntParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_96);
                    lv_upperBound_16_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_16_0,
                    							"fr.tblf.energy.estimation.Eel.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4418:3: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==90) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalEel.g:4419:4: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,90,FOLLOW_58); 

                    				newLeafNode(otherlv_17, grammarAccess.getEAttributeAccess().getChangeableKeyword_13_0());
                    			
                    // InternalEel.g:4423:4: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // InternalEel.g:4424:5: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // InternalEel.g:4424:5: (lv_changeable_18_0= ruleEBoolean )
                    // InternalEel.g:4425:6: lv_changeable_18_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getChangeableEBooleanParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_97);
                    lv_changeable_18_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"changeable",
                    							lv_changeable_18_0,
                    							"fr.tblf.energy.estimation.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4443:3: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==91) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalEel.g:4444:4: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,91,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getEAttributeAccess().getDefaultValueLiteralKeyword_14_0());
                    			
                    // InternalEel.g:4448:4: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // InternalEel.g:4449:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // InternalEel.g:4449:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    // InternalEel.g:4450:6: lv_defaultValueLiteral_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_98);
                    lv_defaultValueLiteral_20_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"defaultValueLiteral",
                    							lv_defaultValueLiteral_20_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4468:3: (otherlv_21= 'eType' ( ( ruleEString ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==60) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalEel.g:4469:4: otherlv_21= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_21=(Token)match(input,60,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getEAttributeAccess().getETypeKeyword_15_0());
                    			
                    // InternalEel.g:4473:4: ( ( ruleEString ) )
                    // InternalEel.g:4474:5: ( ruleEString )
                    {
                    // InternalEel.g:4474:5: ( ruleEString )
                    // InternalEel.g:4475:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getETypeEClassifierCrossReference_15_1_0());
                    					
                    pushFollow(FOLLOW_99);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4490:3: (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==50) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalEel.g:4491:4: otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getEAttributeAccess().getEAnnotationsKeyword_16_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_24, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalEel.g:4499:4: ( (lv_eAnnotations_25_0= ruleEAnnotation ) )
                    // InternalEel.g:4500:5: (lv_eAnnotations_25_0= ruleEAnnotation )
                    {
                    // InternalEel.g:4500:5: (lv_eAnnotations_25_0= ruleEAnnotation )
                    // InternalEel.g:4501:6: lv_eAnnotations_25_0= ruleEAnnotation
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
                    							"fr.tblf.energy.estimation.Eel.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:4518:4: (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==14) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // InternalEel.g:4519:5: otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getEAttributeAccess().getCommaKeyword_16_3_0());
                    	    				
                    	    // InternalEel.g:4523:5: ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    // InternalEel.g:4524:6: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:4524:6: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    // InternalEel.g:4525:7: lv_eAnnotations_27_0= ruleEAnnotation
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
                    	    								"fr.tblf.energy.estimation.Eel.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop113;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,15,FOLLOW_100); 

                    				newLeafNode(otherlv_28, grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_16_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:4548:3: (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==62) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalEel.g:4549:4: otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    {
                    otherlv_29=(Token)match(input,62,FOLLOW_56); 

                    				newLeafNode(otherlv_29, grammarAccess.getEAttributeAccess().getEGenericTypeKeyword_17_0());
                    			
                    // InternalEel.g:4553:4: ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    // InternalEel.g:4554:5: (lv_eGenericType_30_0= ruleEGenericType )
                    {
                    // InternalEel.g:4554:5: (lv_eGenericType_30_0= ruleEGenericType )
                    // InternalEel.g:4555:6: lv_eGenericType_30_0= ruleEGenericType
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
                    							"fr.tblf.energy.estimation.Eel.EGenericType");
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
    // InternalEel.g:4581:1: entryRuleEReference returns [EObject current=null] : iv_ruleEReference= ruleEReference EOF ;
    public final EObject entryRuleEReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEReference = null;


        try {
            // InternalEel.g:4581:51: (iv_ruleEReference= ruleEReference EOF )
            // InternalEel.g:4582:2: iv_ruleEReference= ruleEReference EOF
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
    // InternalEel.g:4588:1: ruleEReference returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) ;
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
            // InternalEel.g:4594:2: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) )
            // InternalEel.g:4595:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            {
            // InternalEel.g:4595:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            // InternalEel.g:4596:3: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}'
            {
            // InternalEel.g:4596:3: ()
            // InternalEel.g:4597:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEReferenceAccess().getEReferenceAction_0(),
            					current);
            			

            }

            // InternalEel.g:4603:3: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==84) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalEel.g:4604:4: (lv_volatile_1_0= 'volatile' )
                    {
                    // InternalEel.g:4604:4: (lv_volatile_1_0= 'volatile' )
                    // InternalEel.g:4605:5: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,84,FOLLOW_101); 

                    					newLeafNode(lv_volatile_1_0, grammarAccess.getEReferenceAccess().getVolatileVolatileKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "volatile", true, "volatile");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4617:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==85) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalEel.g:4618:4: (lv_transient_2_0= 'transient' )
                    {
                    // InternalEel.g:4618:4: (lv_transient_2_0= 'transient' )
                    // InternalEel.g:4619:5: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,85,FOLLOW_102); 

                    					newLeafNode(lv_transient_2_0, grammarAccess.getEReferenceAccess().getTransientTransientKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "transient", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4631:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==86) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalEel.g:4632:4: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // InternalEel.g:4632:4: (lv_unsettable_3_0= 'unsettable' )
                    // InternalEel.g:4633:5: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,86,FOLLOW_103); 

                    					newLeafNode(lv_unsettable_3_0, grammarAccess.getEReferenceAccess().getUnsettableUnsettableKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "unsettable", true, "unsettable");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4645:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==87) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalEel.g:4646:4: (lv_derived_4_0= 'derived' )
                    {
                    // InternalEel.g:4646:4: (lv_derived_4_0= 'derived' )
                    // InternalEel.g:4647:5: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,87,FOLLOW_104); 

                    					newLeafNode(lv_derived_4_0, grammarAccess.getEReferenceAccess().getDerivedDerivedKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "derived", true, "derived");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4659:3: ( (lv_containment_5_0= 'containment' ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==92) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalEel.g:4660:4: (lv_containment_5_0= 'containment' )
                    {
                    // InternalEel.g:4660:4: (lv_containment_5_0= 'containment' )
                    // InternalEel.g:4661:5: lv_containment_5_0= 'containment'
                    {
                    lv_containment_5_0=(Token)match(input,92,FOLLOW_105); 

                    					newLeafNode(lv_containment_5_0, grammarAccess.getEReferenceAccess().getContainmentContainmentKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "containment", true, "containment");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,93,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getEReferenceAccess().getEReferenceKeyword_6());
            		
            // InternalEel.g:4677:3: ( (lv_name_7_0= ruleEString ) )
            // InternalEel.g:4678:4: (lv_name_7_0= ruleEString )
            {
            // InternalEel.g:4678:4: (lv_name_7_0= ruleEString )
            // InternalEel.g:4679:5: lv_name_7_0= ruleEString
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
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,12,FOLLOW_106); 

            			newLeafNode(otherlv_8, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalEel.g:4700:3: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==56) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalEel.g:4701:4: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,56,FOLLOW_58); 

                    				newLeafNode(otherlv_9, grammarAccess.getEReferenceAccess().getOrderedKeyword_9_0());
                    			
                    // InternalEel.g:4705:4: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // InternalEel.g:4706:5: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // InternalEel.g:4706:5: (lv_ordered_10_0= ruleEBoolean )
                    // InternalEel.g:4707:6: lv_ordered_10_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getOrderedEBooleanParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_107);
                    lv_ordered_10_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"ordered",
                    							lv_ordered_10_0,
                    							"fr.tblf.energy.estimation.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4725:3: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==57) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalEel.g:4726:4: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,57,FOLLOW_58); 

                    				newLeafNode(otherlv_11, grammarAccess.getEReferenceAccess().getUniqueKeyword_10_0());
                    			
                    // InternalEel.g:4730:4: ( (lv_unique_12_0= ruleEBoolean ) )
                    // InternalEel.g:4731:5: (lv_unique_12_0= ruleEBoolean )
                    {
                    // InternalEel.g:4731:5: (lv_unique_12_0= ruleEBoolean )
                    // InternalEel.g:4732:6: lv_unique_12_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getUniqueEBooleanParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_108);
                    lv_unique_12_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"unique",
                    							lv_unique_12_0,
                    							"fr.tblf.energy.estimation.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4750:3: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==58) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalEel.g:4751:4: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,58,FOLLOW_61); 

                    				newLeafNode(otherlv_13, grammarAccess.getEReferenceAccess().getLowerBoundKeyword_11_0());
                    			
                    // InternalEel.g:4755:4: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // InternalEel.g:4756:5: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // InternalEel.g:4756:5: (lv_lowerBound_14_0= ruleEInt )
                    // InternalEel.g:4757:6: lv_lowerBound_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getLowerBoundEIntParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_109);
                    lv_lowerBound_14_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_14_0,
                    							"fr.tblf.energy.estimation.Eel.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4775:3: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==59) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalEel.g:4776:4: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,59,FOLLOW_61); 

                    				newLeafNode(otherlv_15, grammarAccess.getEReferenceAccess().getUpperBoundKeyword_12_0());
                    			
                    // InternalEel.g:4780:4: ( (lv_upperBound_16_0= ruleEInt ) )
                    // InternalEel.g:4781:5: (lv_upperBound_16_0= ruleEInt )
                    {
                    // InternalEel.g:4781:5: (lv_upperBound_16_0= ruleEInt )
                    // InternalEel.g:4782:6: lv_upperBound_16_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getUpperBoundEIntParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_110);
                    lv_upperBound_16_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_16_0,
                    							"fr.tblf.energy.estimation.Eel.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4800:3: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==90) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalEel.g:4801:4: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,90,FOLLOW_58); 

                    				newLeafNode(otherlv_17, grammarAccess.getEReferenceAccess().getChangeableKeyword_13_0());
                    			
                    // InternalEel.g:4805:4: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // InternalEel.g:4806:5: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // InternalEel.g:4806:5: (lv_changeable_18_0= ruleEBoolean )
                    // InternalEel.g:4807:6: lv_changeable_18_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getChangeableEBooleanParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_111);
                    lv_changeable_18_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"changeable",
                    							lv_changeable_18_0,
                    							"fr.tblf.energy.estimation.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4825:3: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==91) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalEel.g:4826:4: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,91,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getEReferenceAccess().getDefaultValueLiteralKeyword_14_0());
                    			
                    // InternalEel.g:4830:4: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // InternalEel.g:4831:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // InternalEel.g:4831:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    // InternalEel.g:4832:6: lv_defaultValueLiteral_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_112);
                    lv_defaultValueLiteral_20_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"defaultValueLiteral",
                    							lv_defaultValueLiteral_20_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4850:3: (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==94) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalEel.g:4851:4: otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    {
                    otherlv_21=(Token)match(input,94,FOLLOW_58); 

                    				newLeafNode(otherlv_21, grammarAccess.getEReferenceAccess().getResolveProxiesKeyword_15_0());
                    			
                    // InternalEel.g:4855:4: ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    // InternalEel.g:4856:5: (lv_resolveProxies_22_0= ruleEBoolean )
                    {
                    // InternalEel.g:4856:5: (lv_resolveProxies_22_0= ruleEBoolean )
                    // InternalEel.g:4857:6: lv_resolveProxies_22_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getResolveProxiesEBooleanParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_113);
                    lv_resolveProxies_22_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"resolveProxies",
                    							lv_resolveProxies_22_0,
                    							"fr.tblf.energy.estimation.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4875:3: (otherlv_23= 'eType' ( ( ruleEString ) ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==60) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalEel.g:4876:4: otherlv_23= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_23=(Token)match(input,60,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getEReferenceAccess().getETypeKeyword_16_0());
                    			
                    // InternalEel.g:4880:4: ( ( ruleEString ) )
                    // InternalEel.g:4881:5: ( ruleEString )
                    {
                    // InternalEel.g:4881:5: ( ruleEString )
                    // InternalEel.g:4882:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getETypeEClassifierCrossReference_16_1_0());
                    					
                    pushFollow(FOLLOW_114);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4897:3: (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==95) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalEel.g:4898:4: otherlv_25= 'eOpposite' ( ( ruleEString ) )
                    {
                    otherlv_25=(Token)match(input,95,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getEReferenceAccess().getEOppositeKeyword_17_0());
                    			
                    // InternalEel.g:4902:4: ( ( ruleEString ) )
                    // InternalEel.g:4903:5: ( ruleEString )
                    {
                    // InternalEel.g:4903:5: ( ruleEString )
                    // InternalEel.g:4904:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEOppositeEReferenceCrossReference_17_1_0());
                    					
                    pushFollow(FOLLOW_115);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4919:3: (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==96) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalEel.g:4920:4: otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')'
                    {
                    otherlv_27=(Token)match(input,96,FOLLOW_45); 

                    				newLeafNode(otherlv_27, grammarAccess.getEReferenceAccess().getEKeysKeyword_18_0());
                    			
                    otherlv_28=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_28, grammarAccess.getEReferenceAccess().getLeftParenthesisKeyword_18_1());
                    			
                    // InternalEel.g:4928:4: ( ( ruleEString ) )
                    // InternalEel.g:4929:5: ( ruleEString )
                    {
                    // InternalEel.g:4929:5: ( ruleEString )
                    // InternalEel.g:4930:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_2_0());
                    					
                    pushFollow(FOLLOW_46);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:4944:4: (otherlv_30= ',' ( ( ruleEString ) ) )*
                    loop130:
                    do {
                        int alt130=2;
                        int LA130_0 = input.LA(1);

                        if ( (LA130_0==14) ) {
                            alt130=1;
                        }


                        switch (alt130) {
                    	case 1 :
                    	    // InternalEel.g:4945:5: otherlv_30= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_30=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_30, grammarAccess.getEReferenceAccess().getCommaKeyword_18_3_0());
                    	    				
                    	    // InternalEel.g:4949:5: ( ( ruleEString ) )
                    	    // InternalEel.g:4950:6: ( ruleEString )
                    	    {
                    	    // InternalEel.g:4950:6: ( ruleEString )
                    	    // InternalEel.g:4951:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEReferenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_46);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop130;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,49,FOLLOW_99); 

                    				newLeafNode(otherlv_32, grammarAccess.getEReferenceAccess().getRightParenthesisKeyword_18_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:4971:3: (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==50) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalEel.g:4972:4: otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_33, grammarAccess.getEReferenceAccess().getEAnnotationsKeyword_19_0());
                    			
                    otherlv_34=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_34, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_19_1());
                    			
                    // InternalEel.g:4980:4: ( (lv_eAnnotations_35_0= ruleEAnnotation ) )
                    // InternalEel.g:4981:5: (lv_eAnnotations_35_0= ruleEAnnotation )
                    {
                    // InternalEel.g:4981:5: (lv_eAnnotations_35_0= ruleEAnnotation )
                    // InternalEel.g:4982:6: lv_eAnnotations_35_0= ruleEAnnotation
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
                    							"fr.tblf.energy.estimation.Eel.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:4999:4: (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )*
                    loop132:
                    do {
                        int alt132=2;
                        int LA132_0 = input.LA(1);

                        if ( (LA132_0==14) ) {
                            alt132=1;
                        }


                        switch (alt132) {
                    	case 1 :
                    	    // InternalEel.g:5000:5: otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_36=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_36, grammarAccess.getEReferenceAccess().getCommaKeyword_19_3_0());
                    	    				
                    	    // InternalEel.g:5004:5: ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    // InternalEel.g:5005:6: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:5005:6: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    // InternalEel.g:5006:7: lv_eAnnotations_37_0= ruleEAnnotation
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
                    	    								"fr.tblf.energy.estimation.Eel.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop132;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,15,FOLLOW_100); 

                    				newLeafNode(otherlv_38, grammarAccess.getEReferenceAccess().getRightCurlyBracketKeyword_19_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:5029:3: (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==62) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalEel.g:5030:4: otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    {
                    otherlv_39=(Token)match(input,62,FOLLOW_56); 

                    				newLeafNode(otherlv_39, grammarAccess.getEReferenceAccess().getEGenericTypeKeyword_20_0());
                    			
                    // InternalEel.g:5034:4: ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    // InternalEel.g:5035:5: (lv_eGenericType_40_0= ruleEGenericType )
                    {
                    // InternalEel.g:5035:5: (lv_eGenericType_40_0= ruleEGenericType )
                    // InternalEel.g:5036:6: lv_eGenericType_40_0= ruleEGenericType
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
                    							"fr.tblf.energy.estimation.Eel.EGenericType");
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
    // InternalEel.g:5062:1: entryRuleEDataType_Impl returns [EObject current=null] : iv_ruleEDataType_Impl= ruleEDataType_Impl EOF ;
    public final EObject entryRuleEDataType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataType_Impl = null;


        try {
            // InternalEel.g:5062:55: (iv_ruleEDataType_Impl= ruleEDataType_Impl EOF )
            // InternalEel.g:5063:2: iv_ruleEDataType_Impl= ruleEDataType_Impl EOF
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
    // InternalEel.g:5069:1: ruleEDataType_Impl returns [EObject current=null] : ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
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
            // InternalEel.g:5075:2: ( ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalEel.g:5076:2: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalEel.g:5076:2: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalEel.g:5077:3: () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalEel.g:5077:3: ()
            // InternalEel.g:5078:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEDataType_ImplAccess().getEDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,97,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEDataType_ImplAccess().getEDataTypeKeyword_1());
            		
            // InternalEel.g:5088:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:5089:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:5089:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:5090:5: lv_name_2_0= ruleEString
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
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_116); 

            			newLeafNode(otherlv_3, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:5111:3: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==45) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalEel.g:5112:4: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEDataType_ImplAccess().getInstanceClassNameKeyword_4_0());
                    			
                    // InternalEel.g:5116:4: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // InternalEel.g:5117:5: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // InternalEel.g:5117:5: (lv_instanceClassName_5_0= ruleEString )
                    // InternalEel.g:5118:6: lv_instanceClassName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceClassNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_117);
                    lv_instanceClassName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						set(
                    							current,
                    							"instanceClassName",
                    							lv_instanceClassName_5_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5136:3: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==46) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalEel.g:5137:4: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameKeyword_5_0());
                    			
                    // InternalEel.g:5141:4: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // InternalEel.g:5142:5: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // InternalEel.g:5142:5: (lv_instanceTypeName_7_0= ruleEString )
                    // InternalEel.g:5143:6: lv_instanceTypeName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_118);
                    lv_instanceTypeName_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						set(
                    							current,
                    							"instanceTypeName",
                    							lv_instanceTypeName_7_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5161:3: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==98) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalEel.g:5162:4: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,98,FOLLOW_58); 

                    				newLeafNode(otherlv_8, grammarAccess.getEDataType_ImplAccess().getSerializableKeyword_6_0());
                    			
                    // InternalEel.g:5166:4: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // InternalEel.g:5167:5: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // InternalEel.g:5167:5: (lv_serializable_9_0= ruleEBoolean )
                    // InternalEel.g:5168:6: lv_serializable_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getSerializableEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_119);
                    lv_serializable_9_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						set(
                    							current,
                    							"serializable",
                    							lv_serializable_9_0,
                    							"fr.tblf.energy.estimation.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5186:3: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==50) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalEel.g:5187:4: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEDataType_ImplAccess().getEAnnotationsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_11, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalEel.g:5195:4: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // InternalEel.g:5196:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // InternalEel.g:5196:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // InternalEel.g:5197:6: lv_eAnnotations_12_0= ruleEAnnotation
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
                    							"fr.tblf.energy.estimation.Eel.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:5214:4: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==14) ) {
                            alt138=1;
                        }


                        switch (alt138) {
                    	case 1 :
                    	    // InternalEel.g:5215:5: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalEel.g:5219:5: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // InternalEel.g:5220:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:5220:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // InternalEel.g:5221:7: lv_eAnnotations_14_0= ruleEAnnotation
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
                    	    								"fr.tblf.energy.estimation.Eel.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop138;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_120); 

                    				newLeafNode(otherlv_15, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:5244:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==51) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalEel.g:5245:4: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,51,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEDataType_ImplAccess().getETypeParametersKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_17, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalEel.g:5253:4: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // InternalEel.g:5254:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // InternalEel.g:5254:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // InternalEel.g:5255:6: lv_eTypeParameters_18_0= ruleETypeParameter
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
                    							"fr.tblf.energy.estimation.Eel.ETypeParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:5272:4: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop140:
                    do {
                        int alt140=2;
                        int LA140_0 = input.LA(1);

                        if ( (LA140_0==14) ) {
                            alt140=1;
                        }


                        switch (alt140) {
                    	case 1 :
                    	    // InternalEel.g:5273:5: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_50); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalEel.g:5277:5: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // InternalEel.g:5278:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // InternalEel.g:5278:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // InternalEel.g:5279:7: lv_eTypeParameters_20_0= ruleETypeParameter
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
                    	    								"fr.tblf.energy.estimation.Eel.ETypeParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop140;
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
    // InternalEel.g:5310:1: entryRuleEEnum returns [EObject current=null] : iv_ruleEEnum= ruleEEnum EOF ;
    public final EObject entryRuleEEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnum = null;


        try {
            // InternalEel.g:5310:46: (iv_ruleEEnum= ruleEEnum EOF )
            // InternalEel.g:5311:2: iv_ruleEEnum= ruleEEnum EOF
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
    // InternalEel.g:5317:1: ruleEEnum returns [EObject current=null] : ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
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
            // InternalEel.g:5323:2: ( ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // InternalEel.g:5324:2: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // InternalEel.g:5324:2: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // InternalEel.g:5325:3: () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // InternalEel.g:5325:3: ()
            // InternalEel.g:5326:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEEnumAccess().getEEnumAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,99,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEEnumAccess().getEEnumKeyword_1());
            		
            // InternalEel.g:5336:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:5337:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:5337:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:5338:5: lv_name_2_0= ruleEString
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
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_121); 

            			newLeafNode(otherlv_3, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:5359:3: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==45) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalEel.g:5360:4: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEEnumAccess().getInstanceClassNameKeyword_4_0());
                    			
                    // InternalEel.g:5364:4: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // InternalEel.g:5365:5: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // InternalEel.g:5365:5: (lv_instanceClassName_5_0= ruleEString )
                    // InternalEel.g:5366:6: lv_instanceClassName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getInstanceClassNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_122);
                    lv_instanceClassName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						set(
                    							current,
                    							"instanceClassName",
                    							lv_instanceClassName_5_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5384:3: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==46) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalEel.g:5385:4: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEEnumAccess().getInstanceTypeNameKeyword_5_0());
                    			
                    // InternalEel.g:5389:4: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // InternalEel.g:5390:5: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // InternalEel.g:5390:5: (lv_instanceTypeName_7_0= ruleEString )
                    // InternalEel.g:5391:6: lv_instanceTypeName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_123);
                    lv_instanceTypeName_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						set(
                    							current,
                    							"instanceTypeName",
                    							lv_instanceTypeName_7_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5409:3: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==98) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalEel.g:5410:4: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,98,FOLLOW_58); 

                    				newLeafNode(otherlv_8, grammarAccess.getEEnumAccess().getSerializableKeyword_6_0());
                    			
                    // InternalEel.g:5414:4: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // InternalEel.g:5415:5: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // InternalEel.g:5415:5: (lv_serializable_9_0= ruleEBoolean )
                    // InternalEel.g:5416:6: lv_serializable_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getSerializableEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_124);
                    lv_serializable_9_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						set(
                    							current,
                    							"serializable",
                    							lv_serializable_9_0,
                    							"fr.tblf.energy.estimation.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5434:3: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==50) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalEel.g:5435:4: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEEnumAccess().getEAnnotationsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_11, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalEel.g:5443:4: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // InternalEel.g:5444:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // InternalEel.g:5444:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // InternalEel.g:5445:6: lv_eAnnotations_12_0= ruleEAnnotation
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
                    							"fr.tblf.energy.estimation.Eel.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:5462:4: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop145:
                    do {
                        int alt145=2;
                        int LA145_0 = input.LA(1);

                        if ( (LA145_0==14) ) {
                            alt145=1;
                        }


                        switch (alt145) {
                    	case 1 :
                    	    // InternalEel.g:5463:5: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEEnumAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalEel.g:5467:5: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // InternalEel.g:5468:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:5468:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // InternalEel.g:5469:7: lv_eAnnotations_14_0= ruleEAnnotation
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
                    	    								"fr.tblf.energy.estimation.Eel.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop145;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_125); 

                    				newLeafNode(otherlv_15, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:5492:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==51) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalEel.g:5493:4: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,51,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEEnumAccess().getETypeParametersKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_17, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalEel.g:5501:4: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // InternalEel.g:5502:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // InternalEel.g:5502:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // InternalEel.g:5503:6: lv_eTypeParameters_18_0= ruleETypeParameter
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
                    							"fr.tblf.energy.estimation.Eel.ETypeParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:5520:4: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop147:
                    do {
                        int alt147=2;
                        int LA147_0 = input.LA(1);

                        if ( (LA147_0==14) ) {
                            alt147=1;
                        }


                        switch (alt147) {
                    	case 1 :
                    	    // InternalEel.g:5521:5: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_50); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEEnumAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalEel.g:5525:5: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // InternalEel.g:5526:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // InternalEel.g:5526:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // InternalEel.g:5527:7: lv_eTypeParameters_20_0= ruleETypeParameter
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
                    	    								"fr.tblf.energy.estimation.Eel.ETypeParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop147;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_126); 

                    				newLeafNode(otherlv_21, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:5550:3: (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==100) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalEel.g:5551:4: otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,100,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getEEnumAccess().getELiteralsKeyword_9_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_127); 

                    				newLeafNode(otherlv_23, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalEel.g:5559:4: ( (lv_eLiterals_24_0= ruleEEnumLiteral ) )
                    // InternalEel.g:5560:5: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    {
                    // InternalEel.g:5560:5: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    // InternalEel.g:5561:6: lv_eLiterals_24_0= ruleEEnumLiteral
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
                    							"fr.tblf.energy.estimation.Eel.EEnumLiteral");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:5578:4: (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )*
                    loop149:
                    do {
                        int alt149=2;
                        int LA149_0 = input.LA(1);

                        if ( (LA149_0==14) ) {
                            alt149=1;
                        }


                        switch (alt149) {
                    	case 1 :
                    	    // InternalEel.g:5579:5: otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_127); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getEEnumAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalEel.g:5583:5: ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    // InternalEel.g:5584:6: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    {
                    	    // InternalEel.g:5584:6: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    // InternalEel.g:5585:7: lv_eLiterals_26_0= ruleEEnumLiteral
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
                    	    								"fr.tblf.energy.estimation.Eel.EEnumLiteral");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop149;
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
    // InternalEel.g:5616:1: entryRuleEEnumLiteral returns [EObject current=null] : iv_ruleEEnumLiteral= ruleEEnumLiteral EOF ;
    public final EObject entryRuleEEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnumLiteral = null;


        try {
            // InternalEel.g:5616:53: (iv_ruleEEnumLiteral= ruleEEnumLiteral EOF )
            // InternalEel.g:5617:2: iv_ruleEEnumLiteral= ruleEEnumLiteral EOF
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
    // InternalEel.g:5623:1: ruleEEnumLiteral returns [EObject current=null] : ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
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
            // InternalEel.g:5629:2: ( ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalEel.g:5630:2: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalEel.g:5630:2: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalEel.g:5631:3: () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalEel.g:5631:3: ()
            // InternalEel.g:5632:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEEnumLiteralAccess().getEEnumLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,101,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEEnumLiteralAccess().getEEnumLiteralKeyword_1());
            		
            // InternalEel.g:5642:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:5643:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:5643:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:5644:5: lv_name_2_0= ruleEString
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
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_128); 

            			newLeafNode(otherlv_3, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:5665:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==18) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalEel.g:5666:4: otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_61); 

                    				newLeafNode(otherlv_4, grammarAccess.getEEnumLiteralAccess().getValueKeyword_4_0());
                    			
                    // InternalEel.g:5670:4: ( (lv_value_5_0= ruleEInt ) )
                    // InternalEel.g:5671:5: (lv_value_5_0= ruleEInt )
                    {
                    // InternalEel.g:5671:5: (lv_value_5_0= ruleEInt )
                    // InternalEel.g:5672:6: lv_value_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getValueEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_129);
                    lv_value_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"fr.tblf.energy.estimation.Eel.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5690:3: (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==102) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalEel.g:5691:4: otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,102,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEEnumLiteralAccess().getLiteralKeyword_5_0());
                    			
                    // InternalEel.g:5695:4: ( (lv_literal_7_0= ruleEString ) )
                    // InternalEel.g:5696:5: (lv_literal_7_0= ruleEString )
                    {
                    // InternalEel.g:5696:5: (lv_literal_7_0= ruleEString )
                    // InternalEel.g:5697:6: lv_literal_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getLiteralEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_130);
                    lv_literal_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    						}
                    						set(
                    							current,
                    							"literal",
                    							lv_literal_7_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5715:3: (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==50) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // InternalEel.g:5716:4: otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEEnumLiteralAccess().getEAnnotationsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_9, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalEel.g:5724:4: ( (lv_eAnnotations_10_0= ruleEAnnotation ) )
                    // InternalEel.g:5725:5: (lv_eAnnotations_10_0= ruleEAnnotation )
                    {
                    // InternalEel.g:5725:5: (lv_eAnnotations_10_0= ruleEAnnotation )
                    // InternalEel.g:5726:6: lv_eAnnotations_10_0= ruleEAnnotation
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
                    							"fr.tblf.energy.estimation.Eel.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:5743:4: (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )*
                    loop153:
                    do {
                        int alt153=2;
                        int LA153_0 = input.LA(1);

                        if ( (LA153_0==14) ) {
                            alt153=1;
                        }


                        switch (alt153) {
                    	case 1 :
                    	    // InternalEel.g:5744:5: otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getEEnumLiteralAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalEel.g:5748:5: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    // InternalEel.g:5749:6: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:5749:6: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    // InternalEel.g:5750:7: lv_eAnnotations_12_0= ruleEAnnotation
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
                    	    								"fr.tblf.energy.estimation.Eel.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop153;
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
    // InternalEel.g:5781:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // InternalEel.g:5781:51: (iv_ruleEParameter= ruleEParameter EOF )
            // InternalEel.g:5782:2: iv_ruleEParameter= ruleEParameter EOF
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
    // InternalEel.g:5788:1: ruleEParameter returns [EObject current=null] : ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) ;
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
            // InternalEel.g:5794:2: ( ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) )
            // InternalEel.g:5795:2: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            {
            // InternalEel.g:5795:2: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            // InternalEel.g:5796:3: () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}'
            {
            // InternalEel.g:5796:3: ()
            // InternalEel.g:5797:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEParameterAccess().getEParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,103,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEParameterAccess().getEParameterKeyword_1());
            		
            // InternalEel.g:5807:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:5808:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:5808:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:5809:5: lv_name_2_0= ruleEString
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
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_131); 

            			newLeafNode(otherlv_3, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:5830:3: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==56) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // InternalEel.g:5831:4: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_58); 

                    				newLeafNode(otherlv_4, grammarAccess.getEParameterAccess().getOrderedKeyword_4_0());
                    			
                    // InternalEel.g:5835:4: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // InternalEel.g:5836:5: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // InternalEel.g:5836:5: (lv_ordered_5_0= ruleEBoolean )
                    // InternalEel.g:5837:6: lv_ordered_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getOrderedEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_132);
                    lv_ordered_5_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"ordered",
                    							lv_ordered_5_0,
                    							"fr.tblf.energy.estimation.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5855:3: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==57) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // InternalEel.g:5856:4: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_58); 

                    				newLeafNode(otherlv_6, grammarAccess.getEParameterAccess().getUniqueKeyword_5_0());
                    			
                    // InternalEel.g:5860:4: ( (lv_unique_7_0= ruleEBoolean ) )
                    // InternalEel.g:5861:5: (lv_unique_7_0= ruleEBoolean )
                    {
                    // InternalEel.g:5861:5: (lv_unique_7_0= ruleEBoolean )
                    // InternalEel.g:5862:6: lv_unique_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getUniqueEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_133);
                    lv_unique_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"unique",
                    							lv_unique_7_0,
                    							"fr.tblf.energy.estimation.Eel.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5880:3: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==58) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // InternalEel.g:5881:4: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,58,FOLLOW_61); 

                    				newLeafNode(otherlv_8, grammarAccess.getEParameterAccess().getLowerBoundKeyword_6_0());
                    			
                    // InternalEel.g:5885:4: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // InternalEel.g:5886:5: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // InternalEel.g:5886:5: (lv_lowerBound_9_0= ruleEInt )
                    // InternalEel.g:5887:6: lv_lowerBound_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getLowerBoundEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_134);
                    lv_lowerBound_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_9_0,
                    							"fr.tblf.energy.estimation.Eel.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5905:3: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==59) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // InternalEel.g:5906:4: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,59,FOLLOW_61); 

                    				newLeafNode(otherlv_10, grammarAccess.getEParameterAccess().getUpperBoundKeyword_7_0());
                    			
                    // InternalEel.g:5910:4: ( (lv_upperBound_11_0= ruleEInt ) )
                    // InternalEel.g:5911:5: (lv_upperBound_11_0= ruleEInt )
                    {
                    // InternalEel.g:5911:5: (lv_upperBound_11_0= ruleEInt )
                    // InternalEel.g:5912:6: lv_upperBound_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getUpperBoundEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_98);
                    lv_upperBound_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_11_0,
                    							"fr.tblf.energy.estimation.Eel.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5930:3: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==60) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // InternalEel.g:5931:4: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,60,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getEParameterAccess().getETypeKeyword_8_0());
                    			
                    // InternalEel.g:5935:4: ( ( ruleEString ) )
                    // InternalEel.g:5936:5: ( ruleEString )
                    {
                    // InternalEel.g:5936:5: ( ruleEString )
                    // InternalEel.g:5937:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEParameterRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEParameterAccess().getETypeEClassifierCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_99);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5952:3: (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==50) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // InternalEel.g:5953:4: otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getEParameterAccess().getEAnnotationsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_15, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalEel.g:5961:4: ( (lv_eAnnotations_16_0= ruleEAnnotation ) )
                    // InternalEel.g:5962:5: (lv_eAnnotations_16_0= ruleEAnnotation )
                    {
                    // InternalEel.g:5962:5: (lv_eAnnotations_16_0= ruleEAnnotation )
                    // InternalEel.g:5963:6: lv_eAnnotations_16_0= ruleEAnnotation
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
                    							"fr.tblf.energy.estimation.Eel.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:5980:4: (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )*
                    loop160:
                    do {
                        int alt160=2;
                        int LA160_0 = input.LA(1);

                        if ( (LA160_0==14) ) {
                            alt160=1;
                        }


                        switch (alt160) {
                    	case 1 :
                    	    // InternalEel.g:5981:5: otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEParameterAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalEel.g:5985:5: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    // InternalEel.g:5986:6: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:5986:6: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    // InternalEel.g:5987:7: lv_eAnnotations_18_0= ruleEAnnotation
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
                    	    								"fr.tblf.energy.estimation.Eel.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop160;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,15,FOLLOW_100); 

                    				newLeafNode(otherlv_19, grammarAccess.getEParameterAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:6010:3: (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==62) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // InternalEel.g:6011:4: otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    {
                    otherlv_20=(Token)match(input,62,FOLLOW_56); 

                    				newLeafNode(otherlv_20, grammarAccess.getEParameterAccess().getEGenericTypeKeyword_10_0());
                    			
                    // InternalEel.g:6015:4: ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    // InternalEel.g:6016:5: (lv_eGenericType_21_0= ruleEGenericType )
                    {
                    // InternalEel.g:6016:5: (lv_eGenericType_21_0= ruleEGenericType )
                    // InternalEel.g:6017:6: lv_eGenericType_21_0= ruleEGenericType
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
                    							"fr.tblf.energy.estimation.Eel.EGenericType");
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
    // InternalEel.g:6043:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'current' ) | (enumLiteral_1= 'duration' ) | (enumLiteral_2= 'energy' ) | (enumLiteral_3= 'frequency' ) | (enumLiteral_4= 'power' ) | (enumLiteral_5= 'voltage' ) | (enumLiteral_6= 'scalar' ) ) ;
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
            // InternalEel.g:6049:2: ( ( (enumLiteral_0= 'current' ) | (enumLiteral_1= 'duration' ) | (enumLiteral_2= 'energy' ) | (enumLiteral_3= 'frequency' ) | (enumLiteral_4= 'power' ) | (enumLiteral_5= 'voltage' ) | (enumLiteral_6= 'scalar' ) ) )
            // InternalEel.g:6050:2: ( (enumLiteral_0= 'current' ) | (enumLiteral_1= 'duration' ) | (enumLiteral_2= 'energy' ) | (enumLiteral_3= 'frequency' ) | (enumLiteral_4= 'power' ) | (enumLiteral_5= 'voltage' ) | (enumLiteral_6= 'scalar' ) )
            {
            // InternalEel.g:6050:2: ( (enumLiteral_0= 'current' ) | (enumLiteral_1= 'duration' ) | (enumLiteral_2= 'energy' ) | (enumLiteral_3= 'frequency' ) | (enumLiteral_4= 'power' ) | (enumLiteral_5= 'voltage' ) | (enumLiteral_6= 'scalar' ) )
            int alt163=7;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt163=1;
                }
                break;
            case 105:
                {
                alt163=2;
                }
                break;
            case 106:
                {
                alt163=3;
                }
                break;
            case 107:
                {
                alt163=4;
                }
                break;
            case 108:
                {
                alt163=5;
                }
                break;
            case 109:
                {
                alt163=6;
                }
                break;
            case 110:
                {
                alt163=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 163, 0, input);

                throw nvae;
            }

            switch (alt163) {
                case 1 :
                    // InternalEel.g:6051:3: (enumLiteral_0= 'current' )
                    {
                    // InternalEel.g:6051:3: (enumLiteral_0= 'current' )
                    // InternalEel.g:6052:4: enumLiteral_0= 'current'
                    {
                    enumLiteral_0=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getCurrentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getCurrentEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:6059:3: (enumLiteral_1= 'duration' )
                    {
                    // InternalEel.g:6059:3: (enumLiteral_1= 'duration' )
                    // InternalEel.g:6060:4: enumLiteral_1= 'duration'
                    {
                    enumLiteral_1=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDurationEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getDurationEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEel.g:6067:3: (enumLiteral_2= 'energy' )
                    {
                    // InternalEel.g:6067:3: (enumLiteral_2= 'energy' )
                    // InternalEel.g:6068:4: enumLiteral_2= 'energy'
                    {
                    enumLiteral_2=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getEnergyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getEnergyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEel.g:6075:3: (enumLiteral_3= 'frequency' )
                    {
                    // InternalEel.g:6075:3: (enumLiteral_3= 'frequency' )
                    // InternalEel.g:6076:4: enumLiteral_3= 'frequency'
                    {
                    enumLiteral_3=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFrequencyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getFrequencyEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEel.g:6083:3: (enumLiteral_4= 'power' )
                    {
                    // InternalEel.g:6083:3: (enumLiteral_4= 'power' )
                    // InternalEel.g:6084:4: enumLiteral_4= 'power'
                    {
                    enumLiteral_4=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getPowerEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getPowerEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalEel.g:6091:3: (enumLiteral_5= 'voltage' )
                    {
                    // InternalEel.g:6091:3: (enumLiteral_5= 'voltage' )
                    // InternalEel.g:6092:4: enumLiteral_5= 'voltage'
                    {
                    enumLiteral_5=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getVoltageEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getVoltageEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalEel.g:6099:3: (enumLiteral_6= 'scalar' )
                    {
                    // InternalEel.g:6099:3: (enumLiteral_6= 'scalar' )
                    // InternalEel.g:6100:4: enumLiteral_6= 'scalar'
                    {
                    enumLiteral_6=(Token)match(input,110,FOLLOW_2); 

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
    // InternalEel.g:6110:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEel.g:6116:2: ( ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) ) )
            // InternalEel.g:6117:2: ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) )
            {
            // InternalEel.g:6117:2: ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) )
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==111) ) {
                alt164=1;
            }
            else if ( (LA164_0==112) ) {
                alt164=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 164, 0, input);

                throw nvae;
            }
            switch (alt164) {
                case 1 :
                    // InternalEel.g:6118:3: (enumLiteral_0= 'LOCAL' )
                    {
                    // InternalEel.g:6118:3: (enumLiteral_0= 'LOCAL' )
                    // InternalEel.g:6119:4: enumLiteral_0= 'LOCAL'
                    {
                    enumLiteral_0=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getLOCALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:6126:3: (enumLiteral_1= 'GLOBAL' )
                    {
                    // InternalEel.g:6126:3: (enumLiteral_1= 'GLOBAL' )
                    // InternalEel.g:6127:4: enumLiteral_1= 'GLOBAL'
                    {
                    enumLiteral_1=(Token)match(input,112,FOLLOW_2); 

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
    static final String dfa_1s = "\37\uffff";
    static final String dfa_2s = "\22\uffff\2\24\2\uffff\1\34\2\uffff\1\34\5\uffff";
    static final String dfa_3s = "\2\4\2\24\2\4\1\uffff\2\24\11\27\2\4\2\uffff\1\5\1\uffff\1\34\1\5\1\32\4\uffff";
    static final String dfa_4s = "\1\25\1\5\2\33\1\5\1\156\1\uffff\2\33\11\27\2\41\2\uffff\1\41\1\uffff\1\35\1\41\1\35\4\uffff";
    static final String dfa_5s = "\6\uffff\1\7\15\uffff\1\1\1\2\1\uffff\1\3\3\uffff\1\5\1\10\1\6\1\4";
    static final String dfa_6s = "\37\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\17\uffff\1\1",
            "\1\2\1\3",
            "\1\5\1\uffff\1\4\4\uffff\1\6",
            "\1\5\1\uffff\1\4\4\uffff\1\6",
            "\1\7\1\10",
            "\1\20\1\21\142\uffff\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
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
            "\1\30\1\26\1\24\7\uffff\2\24\4\uffff\1\24\3\uffff\1\25\1\27\7\uffff\1\24",
            "\1\32\1\31\1\24\7\uffff\2\24\4\uffff\1\24\3\uffff\1\25\1\27\7\uffff\1\24",
            "",
            "",
            "\1\34\10\uffff\2\34\14\uffff\1\35\1\33\3\uffff\1\34",
            "",
            "\1\35\1\33",
            "\1\34\10\uffff\2\34\12\uffff\1\36\1\uffff\1\35\1\33\3\uffff\1\34",
            "\1\36\1\uffff\1\35\1\33",
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
            return "252:2: (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureUnboundProductOperation_4= ruleMeasureUnboundProductOperation | this_MeasureUnboundSumOperation_5= ruleMeasureUnboundSumOperation | this_RealTimeDuration_6= ruleRealTimeDuration | this_CompositeMeasure_7= ruleCompositeMeasure )";
        }
    }
    static final String dfa_8s = "\25\uffff";
    static final String dfa_9s = "\22\uffff\1\24\2\uffff";
    static final String dfa_10s = "\2\4\2\24\2\4\2\24\11\27\2\5\2\uffff";
    static final String dfa_11s = "\1\25\1\5\2\26\1\5\1\156\2\24\11\27\1\5\1\41\2\uffff";
    static final String dfa_12s = "\23\uffff\1\2\1\1";
    static final String dfa_13s = "\25\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\1\3\17\uffff\1\1",
            "\1\2\1\3",
            "\1\5\1\uffff\1\4",
            "\1\5\1\uffff\1\4",
            "\1\6\1\7",
            "\1\17\1\20\142\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
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
            "\1\22",
            "\1\23\10\uffff\2\24\21\uffff\1\24",
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

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "342:2: (this_ExponentialMeasure_0= ruleExponentialMeasure | this_LogisticMeasure_1= ruleLogisticMeasure )";
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
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000030L,0x00007F0000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x00007F0000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001800008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000008000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000008000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x007CE00000008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x007CC00000008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x007C800000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002000000004000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x007C000000008000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0078000000008000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0070000000008000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0060000000008000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000033F00000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0040000000008000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0xFF0C000000008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0xFE0C000000008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0xFC0C000000008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000040L,0x0000000000080000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0xF80C000000008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0xF00C000000008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0xE00C000000008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0xC00C000000008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0xC008000000008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x8008000000008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x8000000000008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0004000000008000L,0x000000000000003CL});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0004000000008000L,0x0000000000000038L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0004000000008000L,0x0000000000000030L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000030L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000020L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0004000000008000L,0x0000000000000080L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000080L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000008000L,0x000000000000F800L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000008000L,0x000000000000F000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000008000L,0x000000000000E000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000008000L,0x000000000000C000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000048000L,0x0000000000020000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000003C00000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000003800000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x5F04000000008000L,0x000000000C000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x5E04000000008000L,0x000000000C000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x5C04000000008000L,0x000000000C000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x5804000000008000L,0x000000000C000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x5004000000008000L,0x000000000C000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x5004000000008000L,0x0000000008000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x5004000000008000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x4004000000008000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x4000000000008000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000030E00000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000000030C00000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000030800000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x5F04000000008000L,0x00000001CC000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x5E04000000008000L,0x00000001CC000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x5C04000000008000L,0x00000001CC000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x5804000000008000L,0x00000001CC000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x5004000000008000L,0x00000001CC000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x5004000000008000L,0x00000001C8000000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x5004000000008000L,0x00000001C0000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x5004000000008000L,0x0000000180000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x4004000000008000L,0x0000000180000000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x4004000000008000L,0x0000000100000000L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x000C600000008000L,0x0000000400000000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x000C400000008000L,0x0000000400000000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x000C000000008000L,0x0000000400000000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x000C000000008000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0008000000008000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x000C600000008000L,0x0000001400000000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x000C400000008000L,0x0000001400000000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x000C000000008000L,0x0000001400000000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x000C000000008000L,0x0000001000000000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0008000000008000L,0x0000001000000000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000008000L,0x0000001000000000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0004000000048000L,0x0000004000000000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0004000000008000L,0x0000004000000000L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0004000000008000L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x5F04000000008000L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x5E04000000008000L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x5C04000000008000L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x5804000000008000L});

}