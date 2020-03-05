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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Platform'", "'{'", "'variables'", "','", "'}'", "'measures'", "'Variable'", "'value'", "'vibility'", "'.'", "'#'", "'='", "'uncertainty'", "'ocl:'", "'attribute:'", "'as'", "'*'", "'+'", "'.duration'", "'MeasurementUncertainty'", "'standardUncertainty'", "'information'", "'NormalDistribution'", "'Interval'", "'lowerEndpoint'", "'upperEndpoint'", "'Sampling'", "'measurementProcedure'", "'samples'", "'Integral'", "'function'", "'interval'", "'Sample'", "'quantity'", "'abstract'", "'interface'", "'EClass'", "'instanceClassName'", "'instanceTypeName'", "'eSuperTypes'", "'('", "')'", "'eAnnotations'", "'eTypeParameters'", "'eOperations'", "'eStructuralFeatures'", "'eGenericSuperTypes'", "'EOperation'", "'ordered'", "'unique'", "'lowerBound'", "'upperBound'", "'eType'", "'eExceptions'", "'eGenericType'", "'eParameters'", "'eGenericExceptions'", "'EAnnotation'", "'source'", "'references'", "'details'", "'contents'", "'ETypeParameter'", "'eBounds'", "'true'", "'false'", "'EGenericType'", "'eTypeParameter'", "'eClassifier'", "'eUpperBound'", "'eTypeArguments'", "'eLowerBound'", "'EStringToStringMapEntry'", "'key'", "'EObject'", "'-'", "'volatile'", "'transient'", "'unsettable'", "'derived'", "'iD'", "'EAttribute'", "'changeable'", "'defaultValueLiteral'", "'containment'", "'EReference'", "'resolveProxies'", "'eOpposite'", "'eKeys'", "'EDataType'", "'serializable'", "'EEnum'", "'eLiterals'", "'EEnumLiteral'", "'literal'", "'EParameter'", "'current'", "'duration'", "'energy'", "'frequency'", "'power'", "'voltage'", "'scalar'", "'LOCAL'", "'GLOBAL'"
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
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__76=76;
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
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_3); 

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
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

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

                    otherlv_15=(Token)match(input,15,FOLLOW_9); 

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
    // InternalEel.g:245:1: ruleMeasure returns [EObject current=null] : (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureBinaryProductOperation_4= ruleMeasureBinaryProductOperation | this_MeasureBinarySumOperation_5= ruleMeasureBinarySumOperation | this_RealTimeDuration_6= ruleRealTimeDuration ) ;
    public final EObject ruleMeasure() throws RecognitionException {
        EObject current = null;

        EObject this_MeasureValue_Impl_0 = null;

        EObject this_MeasureOCL_1 = null;

        EObject this_MeasureAttribute_2 = null;

        EObject this_MeasureCast_3 = null;

        EObject this_MeasureBinaryProductOperation_4 = null;

        EObject this_MeasureBinarySumOperation_5 = null;

        EObject this_RealTimeDuration_6 = null;



        	enterRule();

        try {
            // InternalEel.g:251:2: ( (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureBinaryProductOperation_4= ruleMeasureBinaryProductOperation | this_MeasureBinarySumOperation_5= ruleMeasureBinarySumOperation | this_RealTimeDuration_6= ruleRealTimeDuration ) )
            // InternalEel.g:252:2: (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureBinaryProductOperation_4= ruleMeasureBinaryProductOperation | this_MeasureBinarySumOperation_5= ruleMeasureBinarySumOperation | this_RealTimeDuration_6= ruleRealTimeDuration )
            {
            // InternalEel.g:252:2: (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureBinaryProductOperation_4= ruleMeasureBinaryProductOperation | this_MeasureBinarySumOperation_5= ruleMeasureBinarySumOperation | this_RealTimeDuration_6= ruleRealTimeDuration )
            int alt5=7;
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
                    // InternalEel.g:289:3: this_MeasureBinaryProductOperation_4= ruleMeasureBinaryProductOperation
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureBinaryProductOperationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureBinaryProductOperation_4=ruleMeasureBinaryProductOperation();

                    state._fsp--;


                    			current = this_MeasureBinaryProductOperation_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalEel.g:298:3: this_MeasureBinarySumOperation_5= ruleMeasureBinarySumOperation
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureBinarySumOperationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureBinarySumOperation_5=ruleMeasureBinarySumOperation();

                    state._fsp--;


                    			current = this_MeasureBinarySumOperation_5;
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


    // $ANTLR start "entryRuleEStructuralFeature"
    // InternalEel.g:319:1: entryRuleEStructuralFeature returns [EObject current=null] : iv_ruleEStructuralFeature= ruleEStructuralFeature EOF ;
    public final EObject entryRuleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStructuralFeature = null;


        try {
            // InternalEel.g:319:59: (iv_ruleEStructuralFeature= ruleEStructuralFeature EOF )
            // InternalEel.g:320:2: iv_ruleEStructuralFeature= ruleEStructuralFeature EOF
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
    // InternalEel.g:326:1: ruleEStructuralFeature returns [EObject current=null] : (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) ;
    public final EObject ruleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject this_EAttribute_0 = null;

        EObject this_EReference_1 = null;



        	enterRule();

        try {
            // InternalEel.g:332:2: ( (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) )
            // InternalEel.g:333:2: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            {
            // InternalEel.g:333:2: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            int alt6=2;
            switch ( input.LA(1) ) {
            case 87:
                {
                switch ( input.LA(2) ) {
                case 88:
                    {
                    switch ( input.LA(3) ) {
                    case 89:
                        {
                        switch ( input.LA(4) ) {
                        case 90:
                            {
                            int LA6_4 = input.LA(5);

                            if ( ((LA6_4>=91 && LA6_4<=92)) ) {
                                alt6=1;
                            }
                            else if ( ((LA6_4>=95 && LA6_4<=96)) ) {
                                alt6=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 4, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 95:
                        case 96:
                            {
                            alt6=2;
                            }
                            break;
                        case 91:
                        case 92:
                            {
                            alt6=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 90:
                        {
                        int LA6_4 = input.LA(4);

                        if ( ((LA6_4>=91 && LA6_4<=92)) ) {
                            alt6=1;
                        }
                        else if ( ((LA6_4>=95 && LA6_4<=96)) ) {
                            alt6=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 95:
                    case 96:
                        {
                        alt6=2;
                        }
                        break;
                    case 91:
                    case 92:
                        {
                        alt6=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case 89:
                    {
                    switch ( input.LA(3) ) {
                    case 90:
                        {
                        int LA6_4 = input.LA(4);

                        if ( ((LA6_4>=91 && LA6_4<=92)) ) {
                            alt6=1;
                        }
                        else if ( ((LA6_4>=95 && LA6_4<=96)) ) {
                            alt6=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 95:
                    case 96:
                        {
                        alt6=2;
                        }
                        break;
                    case 91:
                    case 92:
                        {
                        alt6=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 90:
                    {
                    int LA6_4 = input.LA(3);

                    if ( ((LA6_4>=91 && LA6_4<=92)) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_4>=95 && LA6_4<=96)) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 91:
                case 92:
                    {
                    alt6=1;
                    }
                    break;
                case 95:
                case 96:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

                }
                break;
            case 88:
                {
                switch ( input.LA(2) ) {
                case 89:
                    {
                    switch ( input.LA(3) ) {
                    case 90:
                        {
                        int LA6_4 = input.LA(4);

                        if ( ((LA6_4>=91 && LA6_4<=92)) ) {
                            alt6=1;
                        }
                        else if ( ((LA6_4>=95 && LA6_4<=96)) ) {
                            alt6=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 95:
                    case 96:
                        {
                        alt6=2;
                        }
                        break;
                    case 91:
                    case 92:
                        {
                        alt6=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 90:
                    {
                    int LA6_4 = input.LA(3);

                    if ( ((LA6_4>=91 && LA6_4<=92)) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_4>=95 && LA6_4<=96)) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 95:
                case 96:
                    {
                    alt6=2;
                    }
                    break;
                case 91:
                case 92:
                    {
                    alt6=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }

                }
                break;
            case 89:
                {
                switch ( input.LA(2) ) {
                case 90:
                    {
                    int LA6_4 = input.LA(3);

                    if ( ((LA6_4>=91 && LA6_4<=92)) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_4>=95 && LA6_4<=96)) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 95:
                case 96:
                    {
                    alt6=2;
                    }
                    break;
                case 91:
                case 92:
                    {
                    alt6=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }

                }
                break;
            case 90:
                {
                int LA6_4 = input.LA(2);

                if ( ((LA6_4>=91 && LA6_4<=92)) ) {
                    alt6=1;
                }
                else if ( ((LA6_4>=95 && LA6_4<=96)) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            case 91:
            case 92:
                {
                alt6=1;
                }
                break;
            case 95:
            case 96:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalEel.g:334:3: this_EAttribute_0= ruleEAttribute
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
                    // InternalEel.g:343:3: this_EReference_1= ruleEReference
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


    // $ANTLR start "entryRuleMeasurementUncertaintyInformation"
    // InternalEel.g:355:1: entryRuleMeasurementUncertaintyInformation returns [EObject current=null] : iv_ruleMeasurementUncertaintyInformation= ruleMeasurementUncertaintyInformation EOF ;
    public final EObject entryRuleMeasurementUncertaintyInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementUncertaintyInformation = null;


        try {
            // InternalEel.g:355:74: (iv_ruleMeasurementUncertaintyInformation= ruleMeasurementUncertaintyInformation EOF )
            // InternalEel.g:356:2: iv_ruleMeasurementUncertaintyInformation= ruleMeasurementUncertaintyInformation EOF
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
    // InternalEel.g:362:1: ruleMeasurementUncertaintyInformation returns [EObject current=null] : (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral ) ;
    public final EObject ruleMeasurementUncertaintyInformation() throws RecognitionException {
        EObject current = null;

        EObject this_NormalDistribution_0 = null;

        EObject this_Interval_1 = null;

        EObject this_Sampling_2 = null;

        EObject this_Integral_3 = null;



        	enterRule();

        try {
            // InternalEel.g:368:2: ( (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral ) )
            // InternalEel.g:369:2: (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral )
            {
            // InternalEel.g:369:2: (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt7=1;
                }
                break;
            case 34:
                {
                alt7=2;
                }
                break;
            case 37:
                {
                alt7=3;
                }
                break;
            case 40:
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
                    // InternalEel.g:370:3: this_NormalDistribution_0= ruleNormalDistribution
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
                    // InternalEel.g:379:3: this_Interval_1= ruleInterval
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
                    // InternalEel.g:388:3: this_Sampling_2= ruleSampling
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
                    // InternalEel.g:397:3: this_Integral_3= ruleIntegral
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
    // InternalEel.g:409:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalEel.g:409:47: (iv_ruleEString= ruleEString EOF )
            // InternalEel.g:410:2: iv_ruleEString= ruleEString EOF
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
    // InternalEel.g:416:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalEel.g:422:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalEel.g:423:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalEel.g:423:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalEel.g:424:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEel.g:432:3: this_ID_1= RULE_ID
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
    // InternalEel.g:443:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalEel.g:443:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalEel.g:444:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalEel.g:450:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )? otherlv_5= 'vibility' ( (lv_vibility_6_0= ruleVisibility ) ) otherlv_7= '}' ) ;
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
            // InternalEel.g:456:2: ( (otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )? otherlv_5= 'vibility' ( (lv_vibility_6_0= ruleVisibility ) ) otherlv_7= '}' ) )
            // InternalEel.g:457:2: (otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )? otherlv_5= 'vibility' ( (lv_vibility_6_0= ruleVisibility ) ) otherlv_7= '}' )
            {
            // InternalEel.g:457:2: (otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )? otherlv_5= 'vibility' ( (lv_vibility_6_0= ruleVisibility ) ) otherlv_7= '}' )
            // InternalEel.g:458:3: otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )? otherlv_5= 'vibility' ( (lv_vibility_6_0= ruleVisibility ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariableKeyword_0());
            		
            // InternalEel.g:462:3: ( (lv_name_1_0= ruleEString ) )
            // InternalEel.g:463:4: (lv_name_1_0= ruleEString )
            {
            // InternalEel.g:463:4: (lv_name_1_0= ruleEString )
            // InternalEel.g:464:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:485:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEel.g:486:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getValueKeyword_3_0());
                    			
                    // InternalEel.g:490:4: ( (lv_value_4_0= ruleEBigDecimal ) )
                    // InternalEel.g:491:5: (lv_value_4_0= ruleEBigDecimal )
                    {
                    // InternalEel.g:491:5: (lv_value_4_0= ruleEBigDecimal )
                    // InternalEel.g:492:6: lv_value_4_0= ruleEBigDecimal
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getValueEBigDecimalParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
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

            otherlv_5=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getVibilityKeyword_4());
            		
            // InternalEel.g:514:3: ( (lv_vibility_6_0= ruleVisibility ) )
            // InternalEel.g:515:4: (lv_vibility_6_0= ruleVisibility )
            {
            // InternalEel.g:515:4: (lv_vibility_6_0= ruleVisibility )
            // InternalEel.g:516:5: lv_vibility_6_0= ruleVisibility
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getVibilityVisibilityEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalEel.g:541:1: entryRuleEBigDecimal returns [String current=null] : iv_ruleEBigDecimal= ruleEBigDecimal EOF ;
    public final String entryRuleEBigDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBigDecimal = null;


        try {
            // InternalEel.g:541:51: (iv_ruleEBigDecimal= ruleEBigDecimal EOF )
            // InternalEel.g:542:2: iv_ruleEBigDecimal= ruleEBigDecimal EOF
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
    // InternalEel.g:548:1: ruleEBigDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEBigDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalEel.g:554:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalEel.g:555:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalEel.g:555:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalEel.g:556:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalEel.g:556:3: (this_INT_0= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEel.g:557:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_14); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,20,FOLLOW_15); 

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
    // InternalEel.g:581:1: entryRuleMeasureValue_Impl returns [EObject current=null] : iv_ruleMeasureValue_Impl= ruleMeasureValue_Impl EOF ;
    public final EObject entryRuleMeasureValue_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureValue_Impl = null;


        try {
            // InternalEel.g:581:58: (iv_ruleMeasureValue_Impl= ruleMeasureValue_Impl EOF )
            // InternalEel.g:582:2: iv_ruleMeasureValue_Impl= ruleMeasureValue_Impl EOF
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
    // InternalEel.g:588:1: ruleMeasureValue_Impl returns [EObject current=null] : ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( (lv_value_8_0= ruleEBigDecimal ) )? (otherlv_9= 'uncertainty' ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) ) )? ) ;
    public final EObject ruleMeasureValue_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_targetOperation_3_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;

        EObject lv_uncertainty_10_0 = null;



        	enterRule();

        try {
            // InternalEel.g:594:2: ( ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( (lv_value_8_0= ruleEBigDecimal ) )? (otherlv_9= 'uncertainty' ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) ) )? ) )
            // InternalEel.g:595:2: ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( (lv_value_8_0= ruleEBigDecimal ) )? (otherlv_9= 'uncertainty' ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) ) )? )
            {
            // InternalEel.g:595:2: ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( (lv_value_8_0= ruleEBigDecimal ) )? (otherlv_9= 'uncertainty' ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) ) )? )
            // InternalEel.g:596:3: () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( (lv_value_8_0= ruleEBigDecimal ) )? (otherlv_9= 'uncertainty' ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) ) )?
            {
            // InternalEel.g:596:3: ()
            // InternalEel.g:597:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureValue_ImplAccess().getMeasureValueAction_0(),
            					current);
            			

            }

            // InternalEel.g:603:3: ( ( ruleEString ) )
            // InternalEel.g:604:4: ( ruleEString )
            {
            // InternalEel.g:604:4: ( ruleEString )
            // InternalEel.g:605:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureValue_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getTargetClassEClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:619:3: (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEel.g:620:4: otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMeasureValue_ImplAccess().getNumberSignKeyword_2_0());
                    			
                    // InternalEel.g:624:4: ( (lv_targetOperation_3_0= ruleEString ) )
                    // InternalEel.g:625:5: (lv_targetOperation_3_0= ruleEString )
                    {
                    // InternalEel.g:625:5: (lv_targetOperation_3_0= ruleEString )
                    // InternalEel.g:626:6: lv_targetOperation_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getTargetOperationEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_targetOperation_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureValue_ImplRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_3_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getMeasureValue_ImplAccess().getFullStopKeyword_3());
            		
            // InternalEel.g:648:3: ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=107 && LA12_0<=113)) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalEel.g:649:4: ( (lv_type_5_0= ruleType ) )
                    {
                    // InternalEel.g:649:4: ( (lv_type_5_0= ruleType ) )
                    // InternalEel.g:650:5: (lv_type_5_0= ruleType )
                    {
                    // InternalEel.g:650:5: (lv_type_5_0= ruleType )
                    // InternalEel.g:651:6: lv_type_5_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getTypeTypeEnumRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_type_5_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureValue_ImplRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"fr.tblf.energy.estimation.Eel.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:669:4: ( (lv_name_6_0= ruleEString ) )
                    {
                    // InternalEel.g:669:4: ( (lv_name_6_0= ruleEString ) )
                    // InternalEel.g:670:5: (lv_name_6_0= ruleEString )
                    {
                    // InternalEel.g:670:5: (lv_name_6_0= ruleEString )
                    // InternalEel.g:671:6: lv_name_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_name_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureValue_ImplRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_6_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasureValue_ImplAccess().getEqualsSignKeyword_5());
            		
            // InternalEel.g:693:3: ( (lv_value_8_0= ruleEBigDecimal ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT||LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEel.g:694:4: (lv_value_8_0= ruleEBigDecimal )
                    {
                    // InternalEel.g:694:4: (lv_value_8_0= ruleEBigDecimal )
                    // InternalEel.g:695:5: lv_value_8_0= ruleEBigDecimal
                    {

                    					newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getValueEBigDecimalParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_value_8_0=ruleEBigDecimal();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMeasureValue_ImplRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_8_0,
                    						"fr.tblf.energy.estimation.Eel.EBigDecimal");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:712:3: (otherlv_9= 'uncertainty' ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEel.g:713:4: otherlv_9= 'uncertainty' ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getMeasureValue_ImplAccess().getUncertaintyKeyword_7_0());
                    			
                    // InternalEel.g:717:4: ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) )
                    // InternalEel.g:718:5: (lv_uncertainty_10_0= ruleMeasurementUncertainty )
                    {
                    // InternalEel.g:718:5: (lv_uncertainty_10_0= ruleMeasurementUncertainty )
                    // InternalEel.g:719:6: lv_uncertainty_10_0= ruleMeasurementUncertainty
                    {

                    						newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getUncertaintyMeasurementUncertaintyParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_uncertainty_10_0=ruleMeasurementUncertainty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureValue_ImplRule());
                    						}
                    						set(
                    							current,
                    							"uncertainty",
                    							lv_uncertainty_10_0,
                    							"fr.tblf.energy.estimation.Eel.MeasurementUncertainty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // InternalEel.g:741:1: entryRuleMeasureOCL returns [EObject current=null] : iv_ruleMeasureOCL= ruleMeasureOCL EOF ;
    public final EObject entryRuleMeasureOCL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureOCL = null;


        try {
            // InternalEel.g:741:51: (iv_ruleMeasureOCL= ruleMeasureOCL EOF )
            // InternalEel.g:742:2: iv_ruleMeasureOCL= ruleMeasureOCL EOF
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
    // InternalEel.g:748:1: ruleMeasureOCL returns [EObject current=null] : ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' otherlv_8= 'ocl:' ( (lv_oclQuery_9_0= ruleEString ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? ) ;
    public final EObject ruleMeasureOCL() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_targetOperation_3_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_oclQuery_9_0 = null;

        EObject lv_uncertainty_11_0 = null;



        	enterRule();

        try {
            // InternalEel.g:754:2: ( ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' otherlv_8= 'ocl:' ( (lv_oclQuery_9_0= ruleEString ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? ) )
            // InternalEel.g:755:2: ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' otherlv_8= 'ocl:' ( (lv_oclQuery_9_0= ruleEString ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? )
            {
            // InternalEel.g:755:2: ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' otherlv_8= 'ocl:' ( (lv_oclQuery_9_0= ruleEString ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? )
            // InternalEel.g:756:3: () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' otherlv_8= 'ocl:' ( (lv_oclQuery_9_0= ruleEString ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )?
            {
            // InternalEel.g:756:3: ()
            // InternalEel.g:757:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureOCLAccess().getMeasureOCLAction_0(),
            					current);
            			

            }

            // InternalEel.g:763:3: ( ( ruleEString ) )
            // InternalEel.g:764:4: ( ruleEString )
            {
            // InternalEel.g:764:4: ( ruleEString )
            // InternalEel.g:765:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureOCLRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureOCLAccess().getTargetClassEClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:779:3: (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEel.g:780:4: otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMeasureOCLAccess().getNumberSignKeyword_2_0());
                    			
                    // InternalEel.g:784:4: ( (lv_targetOperation_3_0= ruleEString ) )
                    // InternalEel.g:785:5: (lv_targetOperation_3_0= ruleEString )
                    {
                    // InternalEel.g:785:5: (lv_targetOperation_3_0= ruleEString )
                    // InternalEel.g:786:6: lv_targetOperation_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureOCLAccess().getTargetOperationEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_targetOperation_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureOCLRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_3_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getMeasureOCLAccess().getFullStopKeyword_3());
            		
            // InternalEel.g:808:3: ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=107 && LA16_0<=113)) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalEel.g:809:4: ( (lv_type_5_0= ruleType ) )
                    {
                    // InternalEel.g:809:4: ( (lv_type_5_0= ruleType ) )
                    // InternalEel.g:810:5: (lv_type_5_0= ruleType )
                    {
                    // InternalEel.g:810:5: (lv_type_5_0= ruleType )
                    // InternalEel.g:811:6: lv_type_5_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureOCLAccess().getTypeTypeEnumRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_type_5_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureOCLRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"fr.tblf.energy.estimation.Eel.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:829:4: ( (lv_name_6_0= ruleEString ) )
                    {
                    // InternalEel.g:829:4: ( (lv_name_6_0= ruleEString ) )
                    // InternalEel.g:830:5: (lv_name_6_0= ruleEString )
                    {
                    // InternalEel.g:830:5: (lv_name_6_0= ruleEString )
                    // InternalEel.g:831:6: lv_name_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureOCLAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_name_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureOCLRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_6_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasureOCLAccess().getEqualsSignKeyword_5());
            		
            otherlv_8=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureOCLAccess().getOclKeyword_6());
            		
            // InternalEel.g:857:3: ( (lv_oclQuery_9_0= ruleEString ) )
            // InternalEel.g:858:4: (lv_oclQuery_9_0= ruleEString )
            {
            // InternalEel.g:858:4: (lv_oclQuery_9_0= ruleEString )
            // InternalEel.g:859:5: lv_oclQuery_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureOCLAccess().getOclQueryEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_20);
            lv_oclQuery_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureOCLRule());
            					}
            					set(
            						current,
            						"oclQuery",
            						lv_oclQuery_9_0,
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:876:3: (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEel.g:877:4: otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) )
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getMeasureOCLAccess().getUncertaintyKeyword_8_0());
                    			
                    // InternalEel.g:881:4: ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) )
                    // InternalEel.g:882:5: (lv_uncertainty_11_0= ruleMeasurementUncertainty )
                    {
                    // InternalEel.g:882:5: (lv_uncertainty_11_0= ruleMeasurementUncertainty )
                    // InternalEel.g:883:6: lv_uncertainty_11_0= ruleMeasurementUncertainty
                    {

                    						newCompositeNode(grammarAccess.getMeasureOCLAccess().getUncertaintyMeasurementUncertaintyParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_uncertainty_11_0=ruleMeasurementUncertainty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureOCLRule());
                    						}
                    						set(
                    							current,
                    							"uncertainty",
                    							lv_uncertainty_11_0,
                    							"fr.tblf.energy.estimation.Eel.MeasurementUncertainty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleMeasureOCL"


    // $ANTLR start "entryRuleMeasureAttribute"
    // InternalEel.g:905:1: entryRuleMeasureAttribute returns [EObject current=null] : iv_ruleMeasureAttribute= ruleMeasureAttribute EOF ;
    public final EObject entryRuleMeasureAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureAttribute = null;


        try {
            // InternalEel.g:905:57: (iv_ruleMeasureAttribute= ruleMeasureAttribute EOF )
            // InternalEel.g:906:2: iv_ruleMeasureAttribute= ruleMeasureAttribute EOF
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
    // InternalEel.g:912:1: ruleMeasureAttribute returns [EObject current=null] : ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' otherlv_8= 'attribute:' ( ( ruleEString ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? ) ;
    public final EObject ruleMeasureAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_targetOperation_3_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_uncertainty_11_0 = null;



        	enterRule();

        try {
            // InternalEel.g:918:2: ( ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' otherlv_8= 'attribute:' ( ( ruleEString ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? ) )
            // InternalEel.g:919:2: ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' otherlv_8= 'attribute:' ( ( ruleEString ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? )
            {
            // InternalEel.g:919:2: ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' otherlv_8= 'attribute:' ( ( ruleEString ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? )
            // InternalEel.g:920:3: () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' otherlv_8= 'attribute:' ( ( ruleEString ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )?
            {
            // InternalEel.g:920:3: ()
            // InternalEel.g:921:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureAttributeAccess().getMeasureAttributeAction_0(),
            					current);
            			

            }

            // InternalEel.g:927:3: ( ( ruleEString ) )
            // InternalEel.g:928:4: ( ruleEString )
            {
            // InternalEel.g:928:4: ( ruleEString )
            // InternalEel.g:929:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureAttributeAccess().getTargetClassEClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:943:3: (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEel.g:944:4: otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMeasureAttributeAccess().getNumberSignKeyword_2_0());
                    			
                    // InternalEel.g:948:4: ( (lv_targetOperation_3_0= ruleEString ) )
                    // InternalEel.g:949:5: (lv_targetOperation_3_0= ruleEString )
                    {
                    // InternalEel.g:949:5: (lv_targetOperation_3_0= ruleEString )
                    // InternalEel.g:950:6: lv_targetOperation_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureAttributeAccess().getTargetOperationEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_targetOperation_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureAttributeRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_3_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getMeasureAttributeAccess().getFullStopKeyword_3());
            		
            // InternalEel.g:972:3: ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=107 && LA19_0<=113)) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalEel.g:973:4: ( (lv_type_5_0= ruleType ) )
                    {
                    // InternalEel.g:973:4: ( (lv_type_5_0= ruleType ) )
                    // InternalEel.g:974:5: (lv_type_5_0= ruleType )
                    {
                    // InternalEel.g:974:5: (lv_type_5_0= ruleType )
                    // InternalEel.g:975:6: lv_type_5_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureAttributeAccess().getTypeTypeEnumRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_type_5_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureAttributeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"fr.tblf.energy.estimation.Eel.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:993:4: ( (lv_name_6_0= ruleEString ) )
                    {
                    // InternalEel.g:993:4: ( (lv_name_6_0= ruleEString ) )
                    // InternalEel.g:994:5: (lv_name_6_0= ruleEString )
                    {
                    // InternalEel.g:994:5: (lv_name_6_0= ruleEString )
                    // InternalEel.g:995:6: lv_name_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureAttributeAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_name_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureAttributeRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_6_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasureAttributeAccess().getEqualsSignKeyword_5());
            		
            otherlv_8=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureAttributeAccess().getAttributeKeyword_6());
            		
            // InternalEel.g:1021:3: ( ( ruleEString ) )
            // InternalEel.g:1022:4: ( ruleEString )
            {
            // InternalEel.g:1022:4: ( ruleEString )
            // InternalEel.g:1023:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureAttributeAccess().getAttEAttributeCrossReference_7_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1037:3: (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalEel.g:1038:4: otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) )
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getMeasureAttributeAccess().getUncertaintyKeyword_8_0());
                    			
                    // InternalEel.g:1042:4: ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) )
                    // InternalEel.g:1043:5: (lv_uncertainty_11_0= ruleMeasurementUncertainty )
                    {
                    // InternalEel.g:1043:5: (lv_uncertainty_11_0= ruleMeasurementUncertainty )
                    // InternalEel.g:1044:6: lv_uncertainty_11_0= ruleMeasurementUncertainty
                    {

                    						newCompositeNode(grammarAccess.getMeasureAttributeAccess().getUncertaintyMeasurementUncertaintyParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_uncertainty_11_0=ruleMeasurementUncertainty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureAttributeRule());
                    						}
                    						set(
                    							current,
                    							"uncertainty",
                    							lv_uncertainty_11_0,
                    							"fr.tblf.energy.estimation.Eel.MeasurementUncertainty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleMeasureAttribute"


    // $ANTLR start "entryRuleMeasureCast"
    // InternalEel.g:1066:1: entryRuleMeasureCast returns [EObject current=null] : iv_ruleMeasureCast= ruleMeasureCast EOF ;
    public final EObject entryRuleMeasureCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureCast = null;


        try {
            // InternalEel.g:1066:52: (iv_ruleMeasureCast= ruleMeasureCast EOF )
            // InternalEel.g:1067:2: iv_ruleMeasureCast= ruleMeasureCast EOF
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
    // InternalEel.g:1073:1: ruleMeasureCast returns [EObject current=null] : ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' ( ( ruleEString ) ) otherlv_8= 'as' ( (lv_type_9_0= ruleType ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? ) ;
    public final EObject ruleMeasureCast() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_targetOperation_3_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        Enumerator lv_type_9_0 = null;

        EObject lv_uncertainty_11_0 = null;



        	enterRule();

        try {
            // InternalEel.g:1079:2: ( ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' ( ( ruleEString ) ) otherlv_8= 'as' ( (lv_type_9_0= ruleType ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? ) )
            // InternalEel.g:1080:2: ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' ( ( ruleEString ) ) otherlv_8= 'as' ( (lv_type_9_0= ruleType ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? )
            {
            // InternalEel.g:1080:2: ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' ( ( ruleEString ) ) otherlv_8= 'as' ( (lv_type_9_0= ruleType ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? )
            // InternalEel.g:1081:3: () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' ( ( ruleEString ) ) otherlv_8= 'as' ( (lv_type_9_0= ruleType ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )?
            {
            // InternalEel.g:1081:3: ()
            // InternalEel.g:1082:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureCastAccess().getMeasureCastAction_0(),
            					current);
            			

            }

            // InternalEel.g:1088:3: ( ( ruleEString ) )
            // InternalEel.g:1089:4: ( ruleEString )
            {
            // InternalEel.g:1089:4: ( ruleEString )
            // InternalEel.g:1090:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureCastRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureCastAccess().getTargetClassEClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1104:3: (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEel.g:1105:4: otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMeasureCastAccess().getNumberSignKeyword_2_0());
                    			
                    // InternalEel.g:1109:4: ( (lv_targetOperation_3_0= ruleEString ) )
                    // InternalEel.g:1110:5: (lv_targetOperation_3_0= ruleEString )
                    {
                    // InternalEel.g:1110:5: (lv_targetOperation_3_0= ruleEString )
                    // InternalEel.g:1111:6: lv_targetOperation_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureCastAccess().getTargetOperationEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_targetOperation_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureCastRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_3_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getMeasureCastAccess().getFullStopKeyword_3());
            		
            // InternalEel.g:1133:3: ( (lv_name_5_0= ruleEString ) )
            // InternalEel.g:1134:4: (lv_name_5_0= ruleEString )
            {
            // InternalEel.g:1134:4: (lv_name_5_0= ruleEString )
            // InternalEel.g:1135:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureCastAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureCastRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getMeasureCastAccess().getEqualsSignKeyword_5());
            		
            // InternalEel.g:1156:3: ( ( ruleEString ) )
            // InternalEel.g:1157:4: ( ruleEString )
            {
            // InternalEel.g:1157:4: ( ruleEString )
            // InternalEel.g:1158:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureCastRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureCastAccess().getMeasureMeasureCrossReference_6_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,26,FOLLOW_25); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureCastAccess().getAsKeyword_7());
            		
            // InternalEel.g:1176:3: ( (lv_type_9_0= ruleType ) )
            // InternalEel.g:1177:4: (lv_type_9_0= ruleType )
            {
            // InternalEel.g:1177:4: (lv_type_9_0= ruleType )
            // InternalEel.g:1178:5: lv_type_9_0= ruleType
            {

            					newCompositeNode(grammarAccess.getMeasureCastAccess().getTypeTypeEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_20);
            lv_type_9_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureCastRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_9_0,
            						"fr.tblf.energy.estimation.Eel.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1195:3: (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEel.g:1196:4: otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) )
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getMeasureCastAccess().getUncertaintyKeyword_9_0());
                    			
                    // InternalEel.g:1200:4: ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) )
                    // InternalEel.g:1201:5: (lv_uncertainty_11_0= ruleMeasurementUncertainty )
                    {
                    // InternalEel.g:1201:5: (lv_uncertainty_11_0= ruleMeasurementUncertainty )
                    // InternalEel.g:1202:6: lv_uncertainty_11_0= ruleMeasurementUncertainty
                    {

                    						newCompositeNode(grammarAccess.getMeasureCastAccess().getUncertaintyMeasurementUncertaintyParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_uncertainty_11_0=ruleMeasurementUncertainty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureCastRule());
                    						}
                    						set(
                    							current,
                    							"uncertainty",
                    							lv_uncertainty_11_0,
                    							"fr.tblf.energy.estimation.Eel.MeasurementUncertainty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleMeasureCast"


    // $ANTLR start "entryRuleMeasureBinaryProductOperation"
    // InternalEel.g:1224:1: entryRuleMeasureBinaryProductOperation returns [EObject current=null] : iv_ruleMeasureBinaryProductOperation= ruleMeasureBinaryProductOperation EOF ;
    public final EObject entryRuleMeasureBinaryProductOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureBinaryProductOperation = null;


        try {
            // InternalEel.g:1224:70: (iv_ruleMeasureBinaryProductOperation= ruleMeasureBinaryProductOperation EOF )
            // InternalEel.g:1225:2: iv_ruleMeasureBinaryProductOperation= ruleMeasureBinaryProductOperation EOF
            {
             newCompositeNode(grammarAccess.getMeasureBinaryProductOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureBinaryProductOperation=ruleMeasureBinaryProductOperation();

            state._fsp--;

             current =iv_ruleMeasureBinaryProductOperation; 
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
    // $ANTLR end "entryRuleMeasureBinaryProductOperation"


    // $ANTLR start "ruleMeasureBinaryProductOperation"
    // InternalEel.g:1231:1: ruleMeasureBinaryProductOperation returns [EObject current=null] : ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= '*' ( ( ruleEString ) ) (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )? ) ;
    public final EObject ruleMeasureBinaryProductOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_targetOperation_3_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_uncertainty_12_0 = null;



        	enterRule();

        try {
            // InternalEel.g:1237:2: ( ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= '*' ( ( ruleEString ) ) (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )? ) )
            // InternalEel.g:1238:2: ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= '*' ( ( ruleEString ) ) (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )? )
            {
            // InternalEel.g:1238:2: ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= '*' ( ( ruleEString ) ) (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )? )
            // InternalEel.g:1239:3: () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= '*' ( ( ruleEString ) ) (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )?
            {
            // InternalEel.g:1239:3: ()
            // InternalEel.g:1240:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureBinaryProductOperationAccess().getMeasureBinaryProductOperationAction_0(),
            					current);
            			

            }

            // InternalEel.g:1246:3: ( ( ruleEString ) )
            // InternalEel.g:1247:4: ( ruleEString )
            {
            // InternalEel.g:1247:4: ( ruleEString )
            // InternalEel.g:1248:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureBinaryProductOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureBinaryProductOperationAccess().getTargetClassEClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1262:3: (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalEel.g:1263:4: otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMeasureBinaryProductOperationAccess().getNumberSignKeyword_2_0());
                    			
                    // InternalEel.g:1267:4: ( (lv_targetOperation_3_0= ruleEString ) )
                    // InternalEel.g:1268:5: (lv_targetOperation_3_0= ruleEString )
                    {
                    // InternalEel.g:1268:5: (lv_targetOperation_3_0= ruleEString )
                    // InternalEel.g:1269:6: lv_targetOperation_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureBinaryProductOperationAccess().getTargetOperationEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_targetOperation_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureBinaryProductOperationRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_3_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getMeasureBinaryProductOperationAccess().getFullStopKeyword_3());
            		
            // InternalEel.g:1291:3: ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=107 && LA24_0<=113)) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalEel.g:1292:4: ( (lv_type_5_0= ruleType ) )
                    {
                    // InternalEel.g:1292:4: ( (lv_type_5_0= ruleType ) )
                    // InternalEel.g:1293:5: (lv_type_5_0= ruleType )
                    {
                    // InternalEel.g:1293:5: (lv_type_5_0= ruleType )
                    // InternalEel.g:1294:6: lv_type_5_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureBinaryProductOperationAccess().getTypeTypeEnumRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_type_5_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureBinaryProductOperationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"fr.tblf.energy.estimation.Eel.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:1312:4: ( (lv_name_6_0= ruleEString ) )
                    {
                    // InternalEel.g:1312:4: ( (lv_name_6_0= ruleEString ) )
                    // InternalEel.g:1313:5: (lv_name_6_0= ruleEString )
                    {
                    // InternalEel.g:1313:5: (lv_name_6_0= ruleEString )
                    // InternalEel.g:1314:6: lv_name_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureBinaryProductOperationAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_name_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureBinaryProductOperationRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_6_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasureBinaryProductOperationAccess().getEqualsSignKeyword_5());
            		
            // InternalEel.g:1336:3: ( ( ruleEString ) )
            // InternalEel.g:1337:4: ( ruleEString )
            {
            // InternalEel.g:1337:4: ( ruleEString )
            // InternalEel.g:1338:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureBinaryProductOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureBinaryProductOperationAccess().getLeftMeasureCrossReference_6_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getMeasureBinaryProductOperationAccess().getAsteriskKeyword_7());
            		
            // InternalEel.g:1356:3: ( ( ruleEString ) )
            // InternalEel.g:1357:4: ( ruleEString )
            {
            // InternalEel.g:1357:4: ( ruleEString )
            // InternalEel.g:1358:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureBinaryProductOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureBinaryProductOperationAccess().getRightMeasureCrossReference_8_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1372:3: (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalEel.g:1373:4: otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) )
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getMeasureBinaryProductOperationAccess().getUncertaintyKeyword_9_0());
                    			
                    // InternalEel.g:1377:4: ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) )
                    // InternalEel.g:1378:5: (lv_uncertainty_12_0= ruleMeasurementUncertainty )
                    {
                    // InternalEel.g:1378:5: (lv_uncertainty_12_0= ruleMeasurementUncertainty )
                    // InternalEel.g:1379:6: lv_uncertainty_12_0= ruleMeasurementUncertainty
                    {

                    						newCompositeNode(grammarAccess.getMeasureBinaryProductOperationAccess().getUncertaintyMeasurementUncertaintyParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_uncertainty_12_0=ruleMeasurementUncertainty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureBinaryProductOperationRule());
                    						}
                    						set(
                    							current,
                    							"uncertainty",
                    							lv_uncertainty_12_0,
                    							"fr.tblf.energy.estimation.Eel.MeasurementUncertainty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleMeasureBinaryProductOperation"


    // $ANTLR start "entryRuleMeasureBinarySumOperation"
    // InternalEel.g:1401:1: entryRuleMeasureBinarySumOperation returns [EObject current=null] : iv_ruleMeasureBinarySumOperation= ruleMeasureBinarySumOperation EOF ;
    public final EObject entryRuleMeasureBinarySumOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureBinarySumOperation = null;


        try {
            // InternalEel.g:1401:66: (iv_ruleMeasureBinarySumOperation= ruleMeasureBinarySumOperation EOF )
            // InternalEel.g:1402:2: iv_ruleMeasureBinarySumOperation= ruleMeasureBinarySumOperation EOF
            {
             newCompositeNode(grammarAccess.getMeasureBinarySumOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureBinarySumOperation=ruleMeasureBinarySumOperation();

            state._fsp--;

             current =iv_ruleMeasureBinarySumOperation; 
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
    // $ANTLR end "entryRuleMeasureBinarySumOperation"


    // $ANTLR start "ruleMeasureBinarySumOperation"
    // InternalEel.g:1408:1: ruleMeasureBinarySumOperation returns [EObject current=null] : ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= '+' ( ( ruleEString ) ) (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )? ) ;
    public final EObject ruleMeasureBinarySumOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_targetOperation_3_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_uncertainty_12_0 = null;



        	enterRule();

        try {
            // InternalEel.g:1414:2: ( ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= '+' ( ( ruleEString ) ) (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )? ) )
            // InternalEel.g:1415:2: ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= '+' ( ( ruleEString ) ) (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )? )
            {
            // InternalEel.g:1415:2: ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= '+' ( ( ruleEString ) ) (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )? )
            // InternalEel.g:1416:3: () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.' ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= '+' ( ( ruleEString ) ) (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )?
            {
            // InternalEel.g:1416:3: ()
            // InternalEel.g:1417:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureBinarySumOperationAccess().getMeasureBinarySumOperationAction_0(),
            					current);
            			

            }

            // InternalEel.g:1423:3: ( ( ruleEString ) )
            // InternalEel.g:1424:4: ( ruleEString )
            {
            // InternalEel.g:1424:4: ( ruleEString )
            // InternalEel.g:1425:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureBinarySumOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureBinarySumOperationAccess().getTargetClassEClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1439:3: (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==21) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalEel.g:1440:4: otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMeasureBinarySumOperationAccess().getNumberSignKeyword_2_0());
                    			
                    // InternalEel.g:1444:4: ( (lv_targetOperation_3_0= ruleEString ) )
                    // InternalEel.g:1445:5: (lv_targetOperation_3_0= ruleEString )
                    {
                    // InternalEel.g:1445:5: (lv_targetOperation_3_0= ruleEString )
                    // InternalEel.g:1446:6: lv_targetOperation_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureBinarySumOperationAccess().getTargetOperationEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_targetOperation_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureBinarySumOperationRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_3_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getMeasureBinarySumOperationAccess().getFullStopKeyword_3());
            		
            // InternalEel.g:1468:3: ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=107 && LA27_0<=113)) ) {
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
                    // InternalEel.g:1469:4: ( (lv_type_5_0= ruleType ) )
                    {
                    // InternalEel.g:1469:4: ( (lv_type_5_0= ruleType ) )
                    // InternalEel.g:1470:5: (lv_type_5_0= ruleType )
                    {
                    // InternalEel.g:1470:5: (lv_type_5_0= ruleType )
                    // InternalEel.g:1471:6: lv_type_5_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureBinarySumOperationAccess().getTypeTypeEnumRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_type_5_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureBinarySumOperationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"fr.tblf.energy.estimation.Eel.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:1489:4: ( (lv_name_6_0= ruleEString ) )
                    {
                    // InternalEel.g:1489:4: ( (lv_name_6_0= ruleEString ) )
                    // InternalEel.g:1490:5: (lv_name_6_0= ruleEString )
                    {
                    // InternalEel.g:1490:5: (lv_name_6_0= ruleEString )
                    // InternalEel.g:1491:6: lv_name_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureBinarySumOperationAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_name_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureBinarySumOperationRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_6_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasureBinarySumOperationAccess().getEqualsSignKeyword_5());
            		
            // InternalEel.g:1513:3: ( ( ruleEString ) )
            // InternalEel.g:1514:4: ( ruleEString )
            {
            // InternalEel.g:1514:4: ( ruleEString )
            // InternalEel.g:1515:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureBinarySumOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureBinarySumOperationAccess().getLeftMeasureCrossReference_6_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getMeasureBinarySumOperationAccess().getPlusSignKeyword_7());
            		
            // InternalEel.g:1533:3: ( ( ruleEString ) )
            // InternalEel.g:1534:4: ( ruleEString )
            {
            // InternalEel.g:1534:4: ( ruleEString )
            // InternalEel.g:1535:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureBinarySumOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureBinarySumOperationAccess().getRightMeasureCrossReference_8_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1549:3: (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalEel.g:1550:4: otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) )
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getMeasureBinarySumOperationAccess().getUncertaintyKeyword_9_0());
                    			
                    // InternalEel.g:1554:4: ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) )
                    // InternalEel.g:1555:5: (lv_uncertainty_12_0= ruleMeasurementUncertainty )
                    {
                    // InternalEel.g:1555:5: (lv_uncertainty_12_0= ruleMeasurementUncertainty )
                    // InternalEel.g:1556:6: lv_uncertainty_12_0= ruleMeasurementUncertainty
                    {

                    						newCompositeNode(grammarAccess.getMeasureBinarySumOperationAccess().getUncertaintyMeasurementUncertaintyParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_uncertainty_12_0=ruleMeasurementUncertainty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureBinarySumOperationRule());
                    						}
                    						set(
                    							current,
                    							"uncertainty",
                    							lv_uncertainty_12_0,
                    							"fr.tblf.energy.estimation.Eel.MeasurementUncertainty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleMeasureBinarySumOperation"


    // $ANTLR start "entryRuleRealTimeDuration"
    // InternalEel.g:1578:1: entryRuleRealTimeDuration returns [EObject current=null] : iv_ruleRealTimeDuration= ruleRealTimeDuration EOF ;
    public final EObject entryRuleRealTimeDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTimeDuration = null;


        try {
            // InternalEel.g:1578:57: (iv_ruleRealTimeDuration= ruleRealTimeDuration EOF )
            // InternalEel.g:1579:2: iv_ruleRealTimeDuration= ruleRealTimeDuration EOF
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
    // InternalEel.g:1585:1: ruleRealTimeDuration returns [EObject current=null] : ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.duration' (otherlv_5= 'uncertainty' ( (lv_uncertainty_6_0= ruleMeasurementUncertainty ) ) )? ) ;
    public final EObject ruleRealTimeDuration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_targetOperation_3_0 = null;

        EObject lv_uncertainty_6_0 = null;



        	enterRule();

        try {
            // InternalEel.g:1591:2: ( ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.duration' (otherlv_5= 'uncertainty' ( (lv_uncertainty_6_0= ruleMeasurementUncertainty ) ) )? ) )
            // InternalEel.g:1592:2: ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.duration' (otherlv_5= 'uncertainty' ( (lv_uncertainty_6_0= ruleMeasurementUncertainty ) ) )? )
            {
            // InternalEel.g:1592:2: ( () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.duration' (otherlv_5= 'uncertainty' ( (lv_uncertainty_6_0= ruleMeasurementUncertainty ) ) )? )
            // InternalEel.g:1593:3: () ( ( ruleEString ) ) (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )? otherlv_4= '.duration' (otherlv_5= 'uncertainty' ( (lv_uncertainty_6_0= ruleMeasurementUncertainty ) ) )?
            {
            // InternalEel.g:1593:3: ()
            // InternalEel.g:1594:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealTimeDurationAccess().getRealTimeDurationAction_0(),
            					current);
            			

            }

            // InternalEel.g:1600:3: ( ( ruleEString ) )
            // InternalEel.g:1601:4: ( ruleEString )
            {
            // InternalEel.g:1601:4: ( ruleEString )
            // InternalEel.g:1602:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRealTimeDurationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRealTimeDurationAccess().getTargetClassEClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1616:3: (otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==21) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalEel.g:1617:4: otherlv_2= '#' ( (lv_targetOperation_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getRealTimeDurationAccess().getNumberSignKeyword_2_0());
                    			
                    // InternalEel.g:1621:4: ( (lv_targetOperation_3_0= ruleEString ) )
                    // InternalEel.g:1622:5: (lv_targetOperation_3_0= ruleEString )
                    {
                    // InternalEel.g:1622:5: (lv_targetOperation_3_0= ruleEString )
                    // InternalEel.g:1623:6: lv_targetOperation_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRealTimeDurationAccess().getTargetOperationEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_targetOperation_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRealTimeDurationRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_3_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getRealTimeDurationAccess().getDurationKeyword_3());
            		
            // InternalEel.g:1645:3: (otherlv_5= 'uncertainty' ( (lv_uncertainty_6_0= ruleMeasurementUncertainty ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalEel.g:1646:4: otherlv_5= 'uncertainty' ( (lv_uncertainty_6_0= ruleMeasurementUncertainty ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getRealTimeDurationAccess().getUncertaintyKeyword_4_0());
                    			
                    // InternalEel.g:1650:4: ( (lv_uncertainty_6_0= ruleMeasurementUncertainty ) )
                    // InternalEel.g:1651:5: (lv_uncertainty_6_0= ruleMeasurementUncertainty )
                    {
                    // InternalEel.g:1651:5: (lv_uncertainty_6_0= ruleMeasurementUncertainty )
                    // InternalEel.g:1652:6: lv_uncertainty_6_0= ruleMeasurementUncertainty
                    {

                    						newCompositeNode(grammarAccess.getRealTimeDurationAccess().getUncertaintyMeasurementUncertaintyParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_uncertainty_6_0=ruleMeasurementUncertainty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRealTimeDurationRule());
                    						}
                    						set(
                    							current,
                    							"uncertainty",
                    							lv_uncertainty_6_0,
                    							"fr.tblf.energy.estimation.Eel.MeasurementUncertainty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleRealTimeDuration"


    // $ANTLR start "entryRuleMeasurementUncertainty"
    // InternalEel.g:1674:1: entryRuleMeasurementUncertainty returns [EObject current=null] : iv_ruleMeasurementUncertainty= ruleMeasurementUncertainty EOF ;
    public final EObject entryRuleMeasurementUncertainty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementUncertainty = null;


        try {
            // InternalEel.g:1674:63: (iv_ruleMeasurementUncertainty= ruleMeasurementUncertainty EOF )
            // InternalEel.g:1675:2: iv_ruleMeasurementUncertainty= ruleMeasurementUncertainty EOF
            {
             newCompositeNode(grammarAccess.getMeasurementUncertaintyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasurementUncertainty=ruleMeasurementUncertainty();

            state._fsp--;

             current =iv_ruleMeasurementUncertainty; 
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
    // $ANTLR end "entryRuleMeasurementUncertainty"


    // $ANTLR start "ruleMeasurementUncertainty"
    // InternalEel.g:1681:1: ruleMeasurementUncertainty returns [EObject current=null] : ( () otherlv_1= 'MeasurementUncertainty' otherlv_2= '{' (otherlv_3= 'standardUncertainty' ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'information' ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleMeasurementUncertainty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_standardUncertainty_4_0 = null;

        EObject lv_information_6_0 = null;



        	enterRule();

        try {
            // InternalEel.g:1687:2: ( ( () otherlv_1= 'MeasurementUncertainty' otherlv_2= '{' (otherlv_3= 'standardUncertainty' ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'information' ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) ) )? otherlv_7= '}' ) )
            // InternalEel.g:1688:2: ( () otherlv_1= 'MeasurementUncertainty' otherlv_2= '{' (otherlv_3= 'standardUncertainty' ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'information' ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) ) )? otherlv_7= '}' )
            {
            // InternalEel.g:1688:2: ( () otherlv_1= 'MeasurementUncertainty' otherlv_2= '{' (otherlv_3= 'standardUncertainty' ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'information' ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) ) )? otherlv_7= '}' )
            // InternalEel.g:1689:3: () otherlv_1= 'MeasurementUncertainty' otherlv_2= '{' (otherlv_3= 'standardUncertainty' ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'information' ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) ) )? otherlv_7= '}'
            {
            // InternalEel.g:1689:3: ()
            // InternalEel.g:1690:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasurementUncertaintyAccess().getMeasurementUncertaintyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMeasurementUncertaintyAccess().getMeasurementUncertaintyKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getMeasurementUncertaintyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:1704:3: (otherlv_3= 'standardUncertainty' ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalEel.g:1705:4: otherlv_3= 'standardUncertainty' ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasurementUncertaintyAccess().getStandardUncertaintyKeyword_3_0());
                    			
                    // InternalEel.g:1709:4: ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) )
                    // InternalEel.g:1710:5: (lv_standardUncertainty_4_0= ruleEBigDecimal )
                    {
                    // InternalEel.g:1710:5: (lv_standardUncertainty_4_0= ruleEBigDecimal )
                    // InternalEel.g:1711:6: lv_standardUncertainty_4_0= ruleEBigDecimal
                    {

                    						newCompositeNode(grammarAccess.getMeasurementUncertaintyAccess().getStandardUncertaintyEBigDecimalParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_standardUncertainty_4_0=ruleEBigDecimal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasurementUncertaintyRule());
                    						}
                    						set(
                    							current,
                    							"standardUncertainty",
                    							lv_standardUncertainty_4_0,
                    							"fr.tblf.energy.estimation.Eel.EBigDecimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:1729:3: (otherlv_5= 'information' ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==32) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalEel.g:1730:4: otherlv_5= 'information' ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_32); 

                    				newLeafNode(otherlv_5, grammarAccess.getMeasurementUncertaintyAccess().getInformationKeyword_4_0());
                    			
                    // InternalEel.g:1734:4: ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) )
                    // InternalEel.g:1735:5: (lv_information_6_0= ruleMeasurementUncertaintyInformation )
                    {
                    // InternalEel.g:1735:5: (lv_information_6_0= ruleMeasurementUncertaintyInformation )
                    // InternalEel.g:1736:6: lv_information_6_0= ruleMeasurementUncertaintyInformation
                    {

                    						newCompositeNode(grammarAccess.getMeasurementUncertaintyAccess().getInformationMeasurementUncertaintyInformationParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_information_6_0=ruleMeasurementUncertaintyInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasurementUncertaintyRule());
                    						}
                    						set(
                    							current,
                    							"information",
                    							lv_information_6_0,
                    							"fr.tblf.energy.estimation.Eel.MeasurementUncertaintyInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasurementUncertaintyAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMeasurementUncertainty"


    // $ANTLR start "entryRuleNormalDistribution"
    // InternalEel.g:1762:1: entryRuleNormalDistribution returns [EObject current=null] : iv_ruleNormalDistribution= ruleNormalDistribution EOF ;
    public final EObject entryRuleNormalDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalDistribution = null;


        try {
            // InternalEel.g:1762:59: (iv_ruleNormalDistribution= ruleNormalDistribution EOF )
            // InternalEel.g:1763:2: iv_ruleNormalDistribution= ruleNormalDistribution EOF
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
    // InternalEel.g:1769:1: ruleNormalDistribution returns [EObject current=null] : ( () otherlv_1= 'NormalDistribution' ) ;
    public final EObject ruleNormalDistribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEel.g:1775:2: ( ( () otherlv_1= 'NormalDistribution' ) )
            // InternalEel.g:1776:2: ( () otherlv_1= 'NormalDistribution' )
            {
            // InternalEel.g:1776:2: ( () otherlv_1= 'NormalDistribution' )
            // InternalEel.g:1777:3: () otherlv_1= 'NormalDistribution'
            {
            // InternalEel.g:1777:3: ()
            // InternalEel.g:1778:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNormalDistributionAccess().getNormalDistributionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_2); 

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
    // InternalEel.g:1792:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalEel.g:1792:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalEel.g:1793:2: iv_ruleInterval= ruleInterval EOF
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
    // InternalEel.g:1799:1: ruleInterval returns [EObject current=null] : (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' ) ;
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
            // InternalEel.g:1805:2: ( (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' ) )
            // InternalEel.g:1806:2: (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' )
            {
            // InternalEel.g:1806:2: (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' )
            // InternalEel.g:1807:3: otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIntervalAccess().getIntervalKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getIntervalAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getIntervalAccess().getLowerEndpointKeyword_2());
            		
            // InternalEel.g:1819:3: ( (lv_lowerEndpoint_3_0= ruleMeasure ) )
            // InternalEel.g:1820:4: (lv_lowerEndpoint_3_0= ruleMeasure )
            {
            // InternalEel.g:1820:4: (lv_lowerEndpoint_3_0= ruleMeasure )
            // InternalEel.g:1821:5: lv_lowerEndpoint_3_0= ruleMeasure
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getLowerEndpointMeasureParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
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

            otherlv_4=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getIntervalAccess().getUpperEndpointKeyword_4());
            		
            // InternalEel.g:1842:3: ( (lv_upperEndpoint_5_0= ruleMeasure ) )
            // InternalEel.g:1843:4: (lv_upperEndpoint_5_0= ruleMeasure )
            {
            // InternalEel.g:1843:4: (lv_upperEndpoint_5_0= ruleMeasure )
            // InternalEel.g:1844:5: lv_upperEndpoint_5_0= ruleMeasure
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getUpperEndpointMeasureParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalEel.g:1869:1: entryRuleSampling returns [EObject current=null] : iv_ruleSampling= ruleSampling EOF ;
    public final EObject entryRuleSampling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSampling = null;


        try {
            // InternalEel.g:1869:49: (iv_ruleSampling= ruleSampling EOF )
            // InternalEel.g:1870:2: iv_ruleSampling= ruleSampling EOF
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
    // InternalEel.g:1876:1: ruleSampling returns [EObject current=null] : ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalEel.g:1882:2: ( ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalEel.g:1883:2: ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalEel.g:1883:2: ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalEel.g:1884:3: () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalEel.g:1884:3: ()
            // InternalEel.g:1885:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSamplingAccess().getSamplingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSamplingAccess().getSamplingKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getSamplingAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:1899:3: (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==38) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalEel.g:1900:4: otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSamplingAccess().getMeasurementProcedureKeyword_3_0());
                    			
                    // InternalEel.g:1904:4: ( (lv_measurementProcedure_4_0= ruleEString ) )
                    // InternalEel.g:1905:5: (lv_measurementProcedure_4_0= ruleEString )
                    {
                    // InternalEel.g:1905:5: (lv_measurementProcedure_4_0= ruleEString )
                    // InternalEel.g:1906:6: lv_measurementProcedure_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSamplingAccess().getMeasurementProcedureEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_36);
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

            // InternalEel.g:1924:3: (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==39) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalEel.g:1925:4: otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getSamplingAccess().getSamplesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_37); 

                    				newLeafNode(otherlv_6, grammarAccess.getSamplingAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalEel.g:1933:4: ( (lv_samples_7_0= ruleSample ) )
                    // InternalEel.g:1934:5: (lv_samples_7_0= ruleSample )
                    {
                    // InternalEel.g:1934:5: (lv_samples_7_0= ruleSample )
                    // InternalEel.g:1935:6: lv_samples_7_0= ruleSample
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

                    // InternalEel.g:1952:4: (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==14) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalEel.g:1953:5: otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_37); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSamplingAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalEel.g:1957:5: ( (lv_samples_9_0= ruleSample ) )
                    	    // InternalEel.g:1958:6: (lv_samples_9_0= ruleSample )
                    	    {
                    	    // InternalEel.g:1958:6: (lv_samples_9_0= ruleSample )
                    	    // InternalEel.g:1959:7: lv_samples_9_0= ruleSample
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
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_9); 

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
    // InternalEel.g:1990:1: entryRuleIntegral returns [EObject current=null] : iv_ruleIntegral= ruleIntegral EOF ;
    public final EObject entryRuleIntegral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegral = null;


        try {
            // InternalEel.g:1990:49: (iv_ruleIntegral= ruleIntegral EOF )
            // InternalEel.g:1991:2: iv_ruleIntegral= ruleIntegral EOF
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
    // InternalEel.g:1997:1: ruleIntegral returns [EObject current=null] : (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' ) ;
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
            // InternalEel.g:2003:2: ( (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalEel.g:2004:2: (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalEel.g:2004:2: (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalEel.g:2005:3: otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIntegralAccess().getIntegralKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegralAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalEel.g:2013:3: (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==41) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalEel.g:2014:4: otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getIntegralAccess().getFunctionKeyword_2_0());
                    			
                    // InternalEel.g:2018:4: ( (lv_function_3_0= ruleEString ) )
                    // InternalEel.g:2019:5: (lv_function_3_0= ruleEString )
                    {
                    // InternalEel.g:2019:5: (lv_function_3_0= ruleEString )
                    // InternalEel.g:2020:6: lv_function_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIntegralAccess().getFunctionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_39);
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

            otherlv_4=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getIntegralAccess().getIntervalKeyword_3());
            		
            // InternalEel.g:2042:3: ( ( ruleEString ) )
            // InternalEel.g:2043:4: ( ruleEString )
            {
            // InternalEel.g:2043:4: ( ruleEString )
            // InternalEel.g:2044:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegralRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIntegralAccess().getIntervalIntervalCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalEel.g:2066:1: entryRuleSample returns [EObject current=null] : iv_ruleSample= ruleSample EOF ;
    public final EObject entryRuleSample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSample = null;


        try {
            // InternalEel.g:2066:47: (iv_ruleSample= ruleSample EOF )
            // InternalEel.g:2067:2: iv_ruleSample= ruleSample EOF
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
    // InternalEel.g:2073:1: ruleSample returns [EObject current=null] : ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalEel.g:2079:2: ( ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalEel.g:2080:2: ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalEel.g:2080:2: ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalEel.g:2081:3: () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalEel.g:2081:3: ()
            // InternalEel.g:2082:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSampleAccess().getSampleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSampleAccess().getSampleKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getSampleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:2096:3: (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalEel.g:2097:4: otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSampleAccess().getQuantityKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSampleAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalEel.g:2105:4: ( (lv_quantity_5_0= ruleMeasure ) )
                    // InternalEel.g:2106:5: (lv_quantity_5_0= ruleMeasure )
                    {
                    // InternalEel.g:2106:5: (lv_quantity_5_0= ruleMeasure )
                    // InternalEel.g:2107:6: lv_quantity_5_0= ruleMeasure
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

                    // InternalEel.g:2124:4: (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalEel.g:2125:5: otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSampleAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalEel.g:2129:5: ( (lv_quantity_7_0= ruleMeasure ) )
                    	    // InternalEel.g:2130:6: (lv_quantity_7_0= ruleMeasure )
                    	    {
                    	    // InternalEel.g:2130:6: (lv_quantity_7_0= ruleMeasure )
                    	    // InternalEel.g:2131:7: lv_quantity_7_0= ruleMeasure
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
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_9); 

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


    // $ANTLR start "entryRuleEClass"
    // InternalEel.g:2162:1: entryRuleEClass returns [EObject current=null] : iv_ruleEClass= ruleEClass EOF ;
    public final EObject entryRuleEClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClass = null;


        try {
            // InternalEel.g:2162:47: (iv_ruleEClass= ruleEClass EOF )
            // InternalEel.g:2163:2: iv_ruleEClass= ruleEClass EOF
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
    // InternalEel.g:2169:1: ruleEClass returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
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
            // InternalEel.g:2175:2: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // InternalEel.g:2176:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // InternalEel.g:2176:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // InternalEel.g:2177:3: () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // InternalEel.g:2177:3: ()
            // InternalEel.g:2178:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEClassAccess().getEClassAction_0(),
            					current);
            			

            }

            // InternalEel.g:2184:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==45) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalEel.g:2185:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalEel.g:2185:4: (lv_abstract_1_0= 'abstract' )
                    // InternalEel.g:2186:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,45,FOLLOW_41); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getEClassAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:2198:3: ( (lv_interface_2_0= 'interface' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalEel.g:2199:4: (lv_interface_2_0= 'interface' )
                    {
                    // InternalEel.g:2199:4: (lv_interface_2_0= 'interface' )
                    // InternalEel.g:2200:5: lv_interface_2_0= 'interface'
                    {
                    lv_interface_2_0=(Token)match(input,46,FOLLOW_42); 

                    					newLeafNode(lv_interface_2_0, grammarAccess.getEClassAccess().getInterfaceInterfaceKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEClassRule());
                    					}
                    					setWithLastConsumed(current, "interface", true, "interface");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getEClassAccess().getEClassKeyword_3());
            		
            // InternalEel.g:2216:3: ( (lv_name_4_0= ruleEString ) )
            // InternalEel.g:2217:4: (lv_name_4_0= ruleEString )
            {
            // InternalEel.g:2217:4: (lv_name_4_0= ruleEString )
            // InternalEel.g:2218:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_5, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalEel.g:2239:3: (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==48) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalEel.g:2240:4: otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEClassAccess().getInstanceClassNameKeyword_6_0());
                    			
                    // InternalEel.g:2244:4: ( (lv_instanceClassName_7_0= ruleEString ) )
                    // InternalEel.g:2245:5: (lv_instanceClassName_7_0= ruleEString )
                    {
                    // InternalEel.g:2245:5: (lv_instanceClassName_7_0= ruleEString )
                    // InternalEel.g:2246:6: lv_instanceClassName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getInstanceClassNameEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_44);
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

            // InternalEel.g:2264:3: (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==49) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalEel.g:2265:4: otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getEClassAccess().getInstanceTypeNameKeyword_7_0());
                    			
                    // InternalEel.g:2269:4: ( (lv_instanceTypeName_9_0= ruleEString ) )
                    // InternalEel.g:2270:5: (lv_instanceTypeName_9_0= ruleEString )
                    {
                    // InternalEel.g:2270:5: (lv_instanceTypeName_9_0= ruleEString )
                    // InternalEel.g:2271:6: lv_instanceTypeName_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getInstanceTypeNameEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_45);
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

            // InternalEel.g:2289:3: (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==50) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalEel.g:2290:4: otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,50,FOLLOW_46); 

                    				newLeafNode(otherlv_10, grammarAccess.getEClassAccess().getESuperTypesKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getEClassAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalEel.g:2298:4: ( ( ruleEString ) )
                    // InternalEel.g:2299:5: ( ruleEString )
                    {
                    // InternalEel.g:2299:5: ( ruleEString )
                    // InternalEel.g:2300:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_47);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:2314:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==14) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalEel.g:2315:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEClassAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalEel.g:2319:5: ( ( ruleEString ) )
                    	    // InternalEel.g:2320:6: ( ruleEString )
                    	    {
                    	    // InternalEel.g:2320:6: ( ruleEString )
                    	    // InternalEel.g:2321:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,52,FOLLOW_48); 

                    				newLeafNode(otherlv_15, grammarAccess.getEClassAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:2341:3: (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==53) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalEel.g:2342:4: otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEClassAccess().getEAnnotationsKeyword_9_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_49); 

                    				newLeafNode(otherlv_17, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalEel.g:2350:4: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    // InternalEel.g:2351:5: (lv_eAnnotations_18_0= ruleEAnnotation )
                    {
                    // InternalEel.g:2351:5: (lv_eAnnotations_18_0= ruleEAnnotation )
                    // InternalEel.g:2352:6: lv_eAnnotations_18_0= ruleEAnnotation
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

                    // InternalEel.g:2369:4: (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==14) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalEel.g:2370:5: otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_49); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEClassAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalEel.g:2374:5: ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    // InternalEel.g:2375:6: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:2375:6: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    // InternalEel.g:2376:7: lv_eAnnotations_20_0= ruleEAnnotation
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
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_50); 

                    				newLeafNode(otherlv_21, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:2399:3: (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==54) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalEel.g:2400:4: otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,54,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getEClassAccess().getETypeParametersKeyword_10_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_51); 

                    				newLeafNode(otherlv_23, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalEel.g:2408:4: ( (lv_eTypeParameters_24_0= ruleETypeParameter ) )
                    // InternalEel.g:2409:5: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    {
                    // InternalEel.g:2409:5: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    // InternalEel.g:2410:6: lv_eTypeParameters_24_0= ruleETypeParameter
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

                    // InternalEel.g:2427:4: (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==14) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalEel.g:2428:5: otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_51); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getEClassAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalEel.g:2432:5: ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    // InternalEel.g:2433:6: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    {
                    	    // InternalEel.g:2433:6: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    // InternalEel.g:2434:7: lv_eTypeParameters_26_0= ruleETypeParameter
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
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_52); 

                    				newLeafNode(otherlv_27, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:2457:3: (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==55) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalEel.g:2458:4: otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,55,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getEClassAccess().getEOperationsKeyword_11_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_53); 

                    				newLeafNode(otherlv_29, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalEel.g:2466:4: ( (lv_eOperations_30_0= ruleEOperation ) )
                    // InternalEel.g:2467:5: (lv_eOperations_30_0= ruleEOperation )
                    {
                    // InternalEel.g:2467:5: (lv_eOperations_30_0= ruleEOperation )
                    // InternalEel.g:2468:6: lv_eOperations_30_0= ruleEOperation
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

                    // InternalEel.g:2485:4: (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==14) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalEel.g:2486:5: otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    {
                    	    otherlv_31=(Token)match(input,14,FOLLOW_53); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getEClassAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalEel.g:2490:5: ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    // InternalEel.g:2491:6: (lv_eOperations_32_0= ruleEOperation )
                    	    {
                    	    // InternalEel.g:2491:6: (lv_eOperations_32_0= ruleEOperation )
                    	    // InternalEel.g:2492:7: lv_eOperations_32_0= ruleEOperation
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
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,15,FOLLOW_54); 

                    				newLeafNode(otherlv_33, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:2515:3: (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==56) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalEel.g:2516:4: otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,56,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getEClassAccess().getEStructuralFeaturesKeyword_12_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_55); 

                    				newLeafNode(otherlv_35, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalEel.g:2524:4: ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) )
                    // InternalEel.g:2525:5: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    {
                    // InternalEel.g:2525:5: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    // InternalEel.g:2526:6: lv_eStructuralFeatures_36_0= ruleEStructuralFeature
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

                    // InternalEel.g:2543:4: (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==14) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalEel.g:2544:5: otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    {
                    	    otherlv_37=(Token)match(input,14,FOLLOW_55); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getEClassAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalEel.g:2548:5: ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    // InternalEel.g:2549:6: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    {
                    	    // InternalEel.g:2549:6: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    // InternalEel.g:2550:7: lv_eStructuralFeatures_38_0= ruleEStructuralFeature
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
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,15,FOLLOW_56); 

                    				newLeafNode(otherlv_39, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:2573:3: (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==57) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalEel.g:2574:4: otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,57,FOLLOW_4); 

                    				newLeafNode(otherlv_40, grammarAccess.getEClassAccess().getEGenericSuperTypesKeyword_13_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_41, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalEel.g:2582:4: ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) )
                    // InternalEel.g:2583:5: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    {
                    // InternalEel.g:2583:5: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    // InternalEel.g:2584:6: lv_eGenericSuperTypes_42_0= ruleEGenericType
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

                    // InternalEel.g:2601:4: (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==14) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalEel.g:2602:5: otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,14,FOLLOW_57); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getEClassAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalEel.g:2606:5: ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    // InternalEel.g:2607:6: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    {
                    	    // InternalEel.g:2607:6: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    // InternalEel.g:2608:7: lv_eGenericSuperTypes_44_0= ruleEGenericType
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
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,15,FOLLOW_9); 

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
    // InternalEel.g:2639:1: entryRuleEOperation returns [EObject current=null] : iv_ruleEOperation= ruleEOperation EOF ;
    public final EObject entryRuleEOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperation = null;


        try {
            // InternalEel.g:2639:51: (iv_ruleEOperation= ruleEOperation EOF )
            // InternalEel.g:2640:2: iv_ruleEOperation= ruleEOperation EOF
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
    // InternalEel.g:2646:1: ruleEOperation returns [EObject current=null] : ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
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
            // InternalEel.g:2652:2: ( ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // InternalEel.g:2653:2: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // InternalEel.g:2653:2: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // InternalEel.g:2654:3: () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // InternalEel.g:2654:3: ()
            // InternalEel.g:2655:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOperationAccess().getEOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEOperationAccess().getEOperationKeyword_1());
            		
            // InternalEel.g:2665:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:2666:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:2666:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:2667:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_3, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:2688:3: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==59) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalEel.g:2689:4: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,59,FOLLOW_59); 

                    				newLeafNode(otherlv_4, grammarAccess.getEOperationAccess().getOrderedKeyword_4_0());
                    			
                    // InternalEel.g:2693:4: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // InternalEel.g:2694:5: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // InternalEel.g:2694:5: (lv_ordered_5_0= ruleEBoolean )
                    // InternalEel.g:2695:6: lv_ordered_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getOrderedEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_60);
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

            // InternalEel.g:2713:3: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==60) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalEel.g:2714:4: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,60,FOLLOW_59); 

                    				newLeafNode(otherlv_6, grammarAccess.getEOperationAccess().getUniqueKeyword_5_0());
                    			
                    // InternalEel.g:2718:4: ( (lv_unique_7_0= ruleEBoolean ) )
                    // InternalEel.g:2719:5: (lv_unique_7_0= ruleEBoolean )
                    {
                    // InternalEel.g:2719:5: (lv_unique_7_0= ruleEBoolean )
                    // InternalEel.g:2720:6: lv_unique_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getUniqueEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_61);
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

            // InternalEel.g:2738:3: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==61) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalEel.g:2739:4: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,61,FOLLOW_62); 

                    				newLeafNode(otherlv_8, grammarAccess.getEOperationAccess().getLowerBoundKeyword_6_0());
                    			
                    // InternalEel.g:2743:4: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // InternalEel.g:2744:5: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // InternalEel.g:2744:5: (lv_lowerBound_9_0= ruleEInt )
                    // InternalEel.g:2745:6: lv_lowerBound_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getLowerBoundEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_63);
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

            // InternalEel.g:2763:3: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==62) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalEel.g:2764:4: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,62,FOLLOW_62); 

                    				newLeafNode(otherlv_10, grammarAccess.getEOperationAccess().getUpperBoundKeyword_7_0());
                    			
                    // InternalEel.g:2768:4: ( (lv_upperBound_11_0= ruleEInt ) )
                    // InternalEel.g:2769:5: (lv_upperBound_11_0= ruleEInt )
                    {
                    // InternalEel.g:2769:5: (lv_upperBound_11_0= ruleEInt )
                    // InternalEel.g:2770:6: lv_upperBound_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getUpperBoundEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_64);
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

            // InternalEel.g:2788:3: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==63) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalEel.g:2789:4: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,63,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getEOperationAccess().getETypeKeyword_8_0());
                    			
                    // InternalEel.g:2793:4: ( ( ruleEString ) )
                    // InternalEel.g:2794:5: ( ruleEString )
                    {
                    // InternalEel.g:2794:5: ( ruleEString )
                    // InternalEel.g:2795:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEOperationAccess().getETypeEClassifierCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2810:3: (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==64) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalEel.g:2811:4: otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')'
                    {
                    otherlv_14=(Token)match(input,64,FOLLOW_46); 

                    				newLeafNode(otherlv_14, grammarAccess.getEOperationAccess().getEExceptionsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getEOperationAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalEel.g:2819:4: ( ( ruleEString ) )
                    // InternalEel.g:2820:5: ( ruleEString )
                    {
                    // InternalEel.g:2820:5: ( ruleEString )
                    // InternalEel.g:2821:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_47);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:2835:4: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==14) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalEel.g:2836:5: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEOperationAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalEel.g:2840:5: ( ( ruleEString ) )
                    	    // InternalEel.g:2841:6: ( ruleEString )
                    	    {
                    	    // InternalEel.g:2841:6: ( ruleEString )
                    	    // InternalEel.g:2842:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEOperationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,52,FOLLOW_66); 

                    				newLeafNode(otherlv_19, grammarAccess.getEOperationAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:2862:3: (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==53) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalEel.g:2863:4: otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getEOperationAccess().getEAnnotationsKeyword_10_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_49); 

                    				newLeafNode(otherlv_21, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalEel.g:2871:4: ( (lv_eAnnotations_22_0= ruleEAnnotation ) )
                    // InternalEel.g:2872:5: (lv_eAnnotations_22_0= ruleEAnnotation )
                    {
                    // InternalEel.g:2872:5: (lv_eAnnotations_22_0= ruleEAnnotation )
                    // InternalEel.g:2873:6: lv_eAnnotations_22_0= ruleEAnnotation
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

                    // InternalEel.g:2890:4: (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==14) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalEel.g:2891:5: otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_23=(Token)match(input,14,FOLLOW_49); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getEOperationAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalEel.g:2895:5: ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    // InternalEel.g:2896:6: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:2896:6: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    // InternalEel.g:2897:7: lv_eAnnotations_24_0= ruleEAnnotation
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
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,15,FOLLOW_67); 

                    				newLeafNode(otherlv_25, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:2920:3: (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==65) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalEel.g:2921:4: otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    {
                    otherlv_26=(Token)match(input,65,FOLLOW_57); 

                    				newLeafNode(otherlv_26, grammarAccess.getEOperationAccess().getEGenericTypeKeyword_11_0());
                    			
                    // InternalEel.g:2925:4: ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    // InternalEel.g:2926:5: (lv_eGenericType_27_0= ruleEGenericType )
                    {
                    // InternalEel.g:2926:5: (lv_eGenericType_27_0= ruleEGenericType )
                    // InternalEel.g:2927:6: lv_eGenericType_27_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEGenericTypeEGenericTypeParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_68);
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

            // InternalEel.g:2945:3: (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==54) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalEel.g:2946:4: otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,54,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getEOperationAccess().getETypeParametersKeyword_12_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_51); 

                    				newLeafNode(otherlv_29, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalEel.g:2954:4: ( (lv_eTypeParameters_30_0= ruleETypeParameter ) )
                    // InternalEel.g:2955:5: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    {
                    // InternalEel.g:2955:5: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    // InternalEel.g:2956:6: lv_eTypeParameters_30_0= ruleETypeParameter
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

                    // InternalEel.g:2973:4: (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==14) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalEel.g:2974:5: otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_31=(Token)match(input,14,FOLLOW_51); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getEOperationAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalEel.g:2978:5: ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    // InternalEel.g:2979:6: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    {
                    	    // InternalEel.g:2979:6: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    // InternalEel.g:2980:7: lv_eTypeParameters_32_0= ruleETypeParameter
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
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,15,FOLLOW_69); 

                    				newLeafNode(otherlv_33, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3003:3: (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==66) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalEel.g:3004:4: otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,66,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getEOperationAccess().getEParametersKeyword_13_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_70); 

                    				newLeafNode(otherlv_35, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalEel.g:3012:4: ( (lv_eParameters_36_0= ruleEParameter ) )
                    // InternalEel.g:3013:5: (lv_eParameters_36_0= ruleEParameter )
                    {
                    // InternalEel.g:3013:5: (lv_eParameters_36_0= ruleEParameter )
                    // InternalEel.g:3014:6: lv_eParameters_36_0= ruleEParameter
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

                    // InternalEel.g:3031:4: (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==14) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalEel.g:3032:5: otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    {
                    	    otherlv_37=(Token)match(input,14,FOLLOW_70); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getEOperationAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalEel.g:3036:5: ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    // InternalEel.g:3037:6: (lv_eParameters_38_0= ruleEParameter )
                    	    {
                    	    // InternalEel.g:3037:6: (lv_eParameters_38_0= ruleEParameter )
                    	    // InternalEel.g:3038:7: lv_eParameters_38_0= ruleEParameter
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
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,15,FOLLOW_71); 

                    				newLeafNode(otherlv_39, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3061:3: (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==67) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalEel.g:3062:4: otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,67,FOLLOW_4); 

                    				newLeafNode(otherlv_40, grammarAccess.getEOperationAccess().getEGenericExceptionsKeyword_14_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_41, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalEel.g:3070:4: ( (lv_eGenericExceptions_42_0= ruleEGenericType ) )
                    // InternalEel.g:3071:5: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    {
                    // InternalEel.g:3071:5: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    // InternalEel.g:3072:6: lv_eGenericExceptions_42_0= ruleEGenericType
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

                    // InternalEel.g:3089:4: (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==14) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalEel.g:3090:5: otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,14,FOLLOW_57); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getEOperationAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalEel.g:3094:5: ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    // InternalEel.g:3095:6: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    {
                    	    // InternalEel.g:3095:6: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    // InternalEel.g:3096:7: lv_eGenericExceptions_44_0= ruleEGenericType
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
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,15,FOLLOW_9); 

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
    // InternalEel.g:3127:1: entryRuleEAnnotation returns [EObject current=null] : iv_ruleEAnnotation= ruleEAnnotation EOF ;
    public final EObject entryRuleEAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAnnotation = null;


        try {
            // InternalEel.g:3127:52: (iv_ruleEAnnotation= ruleEAnnotation EOF )
            // InternalEel.g:3128:2: iv_ruleEAnnotation= ruleEAnnotation EOF
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
    // InternalEel.g:3134:1: ruleEAnnotation returns [EObject current=null] : ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
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
            // InternalEel.g:3140:2: ( ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // InternalEel.g:3141:2: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // InternalEel.g:3141:2: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // InternalEel.g:3142:3: () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // InternalEel.g:3142:3: ()
            // InternalEel.g:3143:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAnnotationAccess().getEAnnotationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,68,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEAnnotationAccess().getEAnnotationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_72); 

            			newLeafNode(otherlv_2, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:3157:3: (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==69) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalEel.g:3158:4: otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,69,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEAnnotationAccess().getSourceKeyword_3_0());
                    			
                    // InternalEel.g:3162:4: ( (lv_source_4_0= ruleEString ) )
                    // InternalEel.g:3163:5: (lv_source_4_0= ruleEString )
                    {
                    // InternalEel.g:3163:5: (lv_source_4_0= ruleEString )
                    // InternalEel.g:3164:6: lv_source_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getSourceEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_73);
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

            // InternalEel.g:3182:3: (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==70) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalEel.g:3183:4: otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,70,FOLLOW_46); 

                    				newLeafNode(otherlv_5, grammarAccess.getEAnnotationAccess().getReferencesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEAnnotationAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalEel.g:3191:4: ( ( ruleEString ) )
                    // InternalEel.g:3192:5: ( ruleEString )
                    {
                    // InternalEel.g:3192:5: ( ruleEString )
                    // InternalEel.g:3193:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAnnotationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_47);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3207:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==14) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalEel.g:3208:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEAnnotationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalEel.g:3212:5: ( ( ruleEString ) )
                    	    // InternalEel.g:3213:6: ( ruleEString )
                    	    {
                    	    // InternalEel.g:3213:6: ( ruleEString )
                    	    // InternalEel.g:3214:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAnnotationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,52,FOLLOW_74); 

                    				newLeafNode(otherlv_10, grammarAccess.getEAnnotationAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3234:3: (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==53) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalEel.g:3235:4: otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getEAnnotationAccess().getEAnnotationsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_49); 

                    				newLeafNode(otherlv_12, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalEel.g:3243:4: ( (lv_eAnnotations_13_0= ruleEAnnotation ) )
                    // InternalEel.g:3244:5: (lv_eAnnotations_13_0= ruleEAnnotation )
                    {
                    // InternalEel.g:3244:5: (lv_eAnnotations_13_0= ruleEAnnotation )
                    // InternalEel.g:3245:6: lv_eAnnotations_13_0= ruleEAnnotation
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

                    // InternalEel.g:3262:4: (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==14) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalEel.g:3263:5: otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_49); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getEAnnotationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalEel.g:3267:5: ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    // InternalEel.g:3268:6: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:3268:6: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    // InternalEel.g:3269:7: lv_eAnnotations_15_0= ruleEAnnotation
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
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,15,FOLLOW_75); 

                    				newLeafNode(otherlv_16, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3292:3: (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==71) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalEel.g:3293:4: otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,71,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getEAnnotationAccess().getDetailsKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_76); 

                    				newLeafNode(otherlv_18, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalEel.g:3301:4: ( (lv_details_19_0= ruleEStringToStringMapEntry ) )
                    // InternalEel.g:3302:5: (lv_details_19_0= ruleEStringToStringMapEntry )
                    {
                    // InternalEel.g:3302:5: (lv_details_19_0= ruleEStringToStringMapEntry )
                    // InternalEel.g:3303:6: lv_details_19_0= ruleEStringToStringMapEntry
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

                    // InternalEel.g:3320:4: (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==14) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalEel.g:3321:5: otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FOLLOW_76); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getEAnnotationAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalEel.g:3325:5: ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    // InternalEel.g:3326:6: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    {
                    	    // InternalEel.g:3326:6: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    // InternalEel.g:3327:7: lv_details_21_0= ruleEStringToStringMapEntry
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
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,15,FOLLOW_77); 

                    				newLeafNode(otherlv_22, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3350:3: (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==72) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalEel.g:3351:4: otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,72,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getEAnnotationAccess().getContentsKeyword_7_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_78); 

                    				newLeafNode(otherlv_24, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalEel.g:3359:4: ( (lv_contents_25_0= ruleEObject ) )
                    // InternalEel.g:3360:5: (lv_contents_25_0= ruleEObject )
                    {
                    // InternalEel.g:3360:5: (lv_contents_25_0= ruleEObject )
                    // InternalEel.g:3361:6: lv_contents_25_0= ruleEObject
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

                    // InternalEel.g:3378:4: (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==14) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalEel.g:3379:5: otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_78); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getEAnnotationAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalEel.g:3383:5: ( (lv_contents_27_0= ruleEObject ) )
                    	    // InternalEel.g:3384:6: (lv_contents_27_0= ruleEObject )
                    	    {
                    	    // InternalEel.g:3384:6: (lv_contents_27_0= ruleEObject )
                    	    // InternalEel.g:3385:7: lv_contents_27_0= ruleEObject
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
                    	    break loop78;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,15,FOLLOW_9); 

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
    // InternalEel.g:3416:1: entryRuleETypeParameter returns [EObject current=null] : iv_ruleETypeParameter= ruleETypeParameter EOF ;
    public final EObject entryRuleETypeParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETypeParameter = null;


        try {
            // InternalEel.g:3416:55: (iv_ruleETypeParameter= ruleETypeParameter EOF )
            // InternalEel.g:3417:2: iv_ruleETypeParameter= ruleETypeParameter EOF
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
    // InternalEel.g:3423:1: ruleETypeParameter returns [EObject current=null] : ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalEel.g:3429:2: ( ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalEel.g:3430:2: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalEel.g:3430:2: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalEel.g:3431:3: () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalEel.g:3431:3: ()
            // InternalEel.g:3432:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getETypeParameterAccess().getETypeParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,73,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getETypeParameterAccess().getETypeParameterKeyword_1());
            		
            // InternalEel.g:3442:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:3443:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:3443:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:3444:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_79); 

            			newLeafNode(otherlv_3, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:3465:3: (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==53) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalEel.g:3466:4: otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getETypeParameterAccess().getEAnnotationsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_49); 

                    				newLeafNode(otherlv_5, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalEel.g:3474:4: ( (lv_eAnnotations_6_0= ruleEAnnotation ) )
                    // InternalEel.g:3475:5: (lv_eAnnotations_6_0= ruleEAnnotation )
                    {
                    // InternalEel.g:3475:5: (lv_eAnnotations_6_0= ruleEAnnotation )
                    // InternalEel.g:3476:6: lv_eAnnotations_6_0= ruleEAnnotation
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

                    // InternalEel.g:3493:4: (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==14) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalEel.g:3494:5: otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_49); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getETypeParameterAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalEel.g:3498:5: ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    // InternalEel.g:3499:6: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:3499:6: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    // InternalEel.g:3500:7: lv_eAnnotations_8_0= ruleEAnnotation
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
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_80); 

                    				newLeafNode(otherlv_9, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3523:3: (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==74) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalEel.g:3524:4: otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,74,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getETypeParameterAccess().getEBoundsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_11, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalEel.g:3532:4: ( (lv_eBounds_12_0= ruleEGenericType ) )
                    // InternalEel.g:3533:5: (lv_eBounds_12_0= ruleEGenericType )
                    {
                    // InternalEel.g:3533:5: (lv_eBounds_12_0= ruleEGenericType )
                    // InternalEel.g:3534:6: lv_eBounds_12_0= ruleEGenericType
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

                    // InternalEel.g:3551:4: (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==14) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // InternalEel.g:3552:5: otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_57); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getETypeParameterAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalEel.g:3556:5: ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    // InternalEel.g:3557:6: (lv_eBounds_14_0= ruleEGenericType )
                    	    {
                    	    // InternalEel.g:3557:6: (lv_eBounds_14_0= ruleEGenericType )
                    	    // InternalEel.g:3558:7: lv_eBounds_14_0= ruleEGenericType
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
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_9); 

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
    // InternalEel.g:3589:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalEel.g:3589:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalEel.g:3590:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalEel.g:3596:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEel.g:3602:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalEel.g:3603:2: (kw= 'true' | kw= 'false' )
            {
            // InternalEel.g:3603:2: (kw= 'true' | kw= 'false' )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==75) ) {
                alt84=1;
            }
            else if ( (LA84_0==76) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalEel.g:3604:3: kw= 'true'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEel.g:3610:3: kw= 'false'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

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
    // InternalEel.g:3619:1: entryRuleEGenericType returns [EObject current=null] : iv_ruleEGenericType= ruleEGenericType EOF ;
    public final EObject entryRuleEGenericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGenericType = null;


        try {
            // InternalEel.g:3619:53: (iv_ruleEGenericType= ruleEGenericType EOF )
            // InternalEel.g:3620:2: iv_ruleEGenericType= ruleEGenericType EOF
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
    // InternalEel.g:3626:1: ruleEGenericType returns [EObject current=null] : ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) ;
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
            // InternalEel.g:3632:2: ( ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) )
            // InternalEel.g:3633:2: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            {
            // InternalEel.g:3633:2: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            // InternalEel.g:3634:3: () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}'
            {
            // InternalEel.g:3634:3: ()
            // InternalEel.g:3635:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEGenericTypeAccess().getEGenericTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,77,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEGenericTypeAccess().getEGenericTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_81); 

            			newLeafNode(otherlv_2, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:3649:3: (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==78) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalEel.g:3650:4: otherlv_3= 'eTypeParameter' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,78,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEGenericTypeAccess().getETypeParameterKeyword_3_0());
                    			
                    // InternalEel.g:3654:4: ( ( ruleEString ) )
                    // InternalEel.g:3655:5: ( ruleEString )
                    {
                    // InternalEel.g:3655:5: ( ruleEString )
                    // InternalEel.g:3656:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEGenericTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeParameterETypeParameterCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_82);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3671:3: (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==79) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalEel.g:3672:4: otherlv_5= 'eClassifier' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEGenericTypeAccess().getEClassifierKeyword_4_0());
                    			
                    // InternalEel.g:3676:4: ( ( ruleEString ) )
                    // InternalEel.g:3677:5: ( ruleEString )
                    {
                    // InternalEel.g:3677:5: ( ruleEString )
                    // InternalEel.g:3678:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEGenericTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getEClassifierEClassifierCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_83);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3693:3: (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==80) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalEel.g:3694:4: otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    {
                    otherlv_7=(Token)match(input,80,FOLLOW_57); 

                    				newLeafNode(otherlv_7, grammarAccess.getEGenericTypeAccess().getEUpperBoundKeyword_5_0());
                    			
                    // InternalEel.g:3698:4: ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    // InternalEel.g:3699:5: (lv_eUpperBound_8_0= ruleEGenericType )
                    {
                    // InternalEel.g:3699:5: (lv_eUpperBound_8_0= ruleEGenericType )
                    // InternalEel.g:3700:6: lv_eUpperBound_8_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getEUpperBoundEGenericTypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_84);
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

            // InternalEel.g:3718:3: (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==81) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalEel.g:3719:4: otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,81,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getEGenericTypeAccess().getETypeArgumentsKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_10, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalEel.g:3727:4: ( (lv_eTypeArguments_11_0= ruleEGenericType ) )
                    // InternalEel.g:3728:5: (lv_eTypeArguments_11_0= ruleEGenericType )
                    {
                    // InternalEel.g:3728:5: (lv_eTypeArguments_11_0= ruleEGenericType )
                    // InternalEel.g:3729:6: lv_eTypeArguments_11_0= ruleEGenericType
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

                    // InternalEel.g:3746:4: (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==14) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalEel.g:3747:5: otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_57); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getEGenericTypeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalEel.g:3751:5: ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    // InternalEel.g:3752:6: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    {
                    	    // InternalEel.g:3752:6: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    // InternalEel.g:3753:7: lv_eTypeArguments_13_0= ruleEGenericType
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
                    	    break loop88;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_85); 

                    				newLeafNode(otherlv_14, grammarAccess.getEGenericTypeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3776:3: (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==82) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalEel.g:3777:4: otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    {
                    otherlv_15=(Token)match(input,82,FOLLOW_57); 

                    				newLeafNode(otherlv_15, grammarAccess.getEGenericTypeAccess().getELowerBoundKeyword_7_0());
                    			
                    // InternalEel.g:3781:4: ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    // InternalEel.g:3782:5: (lv_eLowerBound_16_0= ruleEGenericType )
                    {
                    // InternalEel.g:3782:5: (lv_eLowerBound_16_0= ruleEGenericType )
                    // InternalEel.g:3783:6: lv_eLowerBound_16_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getELowerBoundEGenericTypeParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_9);
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
    // InternalEel.g:3809:1: entryRuleEStringToStringMapEntry returns [EObject current=null] : iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF ;
    public final EObject entryRuleEStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStringToStringMapEntry = null;


        try {
            // InternalEel.g:3809:64: (iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF )
            // InternalEel.g:3810:2: iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF
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
    // InternalEel.g:3816:1: ruleEStringToStringMapEntry returns [EObject current=null] : ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
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
            // InternalEel.g:3822:2: ( ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalEel.g:3823:2: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalEel.g:3823:2: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalEel.g:3824:3: () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalEel.g:3824:3: ()
            // InternalEel.g:3825:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,83,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_86); 

            			newLeafNode(otherlv_2, grammarAccess.getEStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:3839:3: (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==84) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalEel.g:3840:4: otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,84,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEStringToStringMapEntryAccess().getKeyKeyword_3_0());
                    			
                    // InternalEel.g:3844:4: ( (lv_key_4_0= ruleEString ) )
                    // InternalEel.g:3845:5: (lv_key_4_0= ruleEString )
                    {
                    // InternalEel.g:3845:5: (lv_key_4_0= ruleEString )
                    // InternalEel.g:3846:6: lv_key_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_87);
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

            // InternalEel.g:3864:3: (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==18) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalEel.g:3865:4: otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEStringToStringMapEntryAccess().getValueKeyword_4_0());
                    			
                    // InternalEel.g:3869:4: ( (lv_value_6_0= ruleEString ) )
                    // InternalEel.g:3870:5: (lv_value_6_0= ruleEString )
                    {
                    // InternalEel.g:3870:5: (lv_value_6_0= ruleEString )
                    // InternalEel.g:3871:6: lv_value_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getValueEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
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
    // InternalEel.g:3897:1: entryRuleEObject returns [EObject current=null] : iv_ruleEObject= ruleEObject EOF ;
    public final EObject entryRuleEObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObject = null;


        try {
            // InternalEel.g:3897:48: (iv_ruleEObject= ruleEObject EOF )
            // InternalEel.g:3898:2: iv_ruleEObject= ruleEObject EOF
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
    // InternalEel.g:3904:1: ruleEObject returns [EObject current=null] : ( () otherlv_1= 'EObject' ) ;
    public final EObject ruleEObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEel.g:3910:2: ( ( () otherlv_1= 'EObject' ) )
            // InternalEel.g:3911:2: ( () otherlv_1= 'EObject' )
            {
            // InternalEel.g:3911:2: ( () otherlv_1= 'EObject' )
            // InternalEel.g:3912:3: () otherlv_1= 'EObject'
            {
            // InternalEel.g:3912:3: ()
            // InternalEel.g:3913:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEObjectAccess().getEObjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,85,FOLLOW_2); 

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
    // InternalEel.g:3927:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalEel.g:3927:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalEel.g:3928:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalEel.g:3934:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalEel.g:3940:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalEel.g:3941:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalEel.g:3941:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalEel.g:3942:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalEel.g:3942:3: (kw= '-' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==86) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalEel.g:3943:4: kw= '-'
                    {
                    kw=(Token)match(input,86,FOLLOW_15); 

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
    // InternalEel.g:3960:1: entryRuleEAttribute returns [EObject current=null] : iv_ruleEAttribute= ruleEAttribute EOF ;
    public final EObject entryRuleEAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttribute = null;


        try {
            // InternalEel.g:3960:51: (iv_ruleEAttribute= ruleEAttribute EOF )
            // InternalEel.g:3961:2: iv_ruleEAttribute= ruleEAttribute EOF
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
    // InternalEel.g:3967:1: ruleEAttribute returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) ;
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
            // InternalEel.g:3973:2: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) )
            // InternalEel.g:3974:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            {
            // InternalEel.g:3974:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            // InternalEel.g:3975:3: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}'
            {
            // InternalEel.g:3975:3: ()
            // InternalEel.g:3976:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAttributeAccess().getEAttributeAction_0(),
            					current);
            			

            }

            // InternalEel.g:3982:3: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==87) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalEel.g:3983:4: (lv_volatile_1_0= 'volatile' )
                    {
                    // InternalEel.g:3983:4: (lv_volatile_1_0= 'volatile' )
                    // InternalEel.g:3984:5: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,87,FOLLOW_88); 

                    					newLeafNode(lv_volatile_1_0, grammarAccess.getEAttributeAccess().getVolatileVolatileKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "volatile", true, "volatile");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:3996:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==88) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalEel.g:3997:4: (lv_transient_2_0= 'transient' )
                    {
                    // InternalEel.g:3997:4: (lv_transient_2_0= 'transient' )
                    // InternalEel.g:3998:5: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,88,FOLLOW_89); 

                    					newLeafNode(lv_transient_2_0, grammarAccess.getEAttributeAccess().getTransientTransientKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "transient", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4010:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==89) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalEel.g:4011:4: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // InternalEel.g:4011:4: (lv_unsettable_3_0= 'unsettable' )
                    // InternalEel.g:4012:5: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,89,FOLLOW_90); 

                    					newLeafNode(lv_unsettable_3_0, grammarAccess.getEAttributeAccess().getUnsettableUnsettableKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "unsettable", true, "unsettable");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4024:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==90) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalEel.g:4025:4: (lv_derived_4_0= 'derived' )
                    {
                    // InternalEel.g:4025:4: (lv_derived_4_0= 'derived' )
                    // InternalEel.g:4026:5: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,90,FOLLOW_91); 

                    					newLeafNode(lv_derived_4_0, grammarAccess.getEAttributeAccess().getDerivedDerivedKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "derived", true, "derived");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4038:3: ( (lv_iD_5_0= 'iD' ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==91) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalEel.g:4039:4: (lv_iD_5_0= 'iD' )
                    {
                    // InternalEel.g:4039:4: (lv_iD_5_0= 'iD' )
                    // InternalEel.g:4040:5: lv_iD_5_0= 'iD'
                    {
                    lv_iD_5_0=(Token)match(input,91,FOLLOW_92); 

                    					newLeafNode(lv_iD_5_0, grammarAccess.getEAttributeAccess().getIDIDKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "iD", true, "iD");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,92,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getEAttributeAccess().getEAttributeKeyword_6());
            		
            // InternalEel.g:4056:3: ( (lv_name_7_0= ruleEString ) )
            // InternalEel.g:4057:4: (lv_name_7_0= ruleEString )
            {
            // InternalEel.g:4057:4: (lv_name_7_0= ruleEString )
            // InternalEel.g:4058:5: lv_name_7_0= ruleEString
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

            otherlv_8=(Token)match(input,12,FOLLOW_93); 

            			newLeafNode(otherlv_8, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalEel.g:4079:3: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==59) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalEel.g:4080:4: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,59,FOLLOW_59); 

                    				newLeafNode(otherlv_9, grammarAccess.getEAttributeAccess().getOrderedKeyword_9_0());
                    			
                    // InternalEel.g:4084:4: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // InternalEel.g:4085:5: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // InternalEel.g:4085:5: (lv_ordered_10_0= ruleEBoolean )
                    // InternalEel.g:4086:6: lv_ordered_10_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getOrderedEBooleanParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_94);
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

            // InternalEel.g:4104:3: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==60) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalEel.g:4105:4: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,60,FOLLOW_59); 

                    				newLeafNode(otherlv_11, grammarAccess.getEAttributeAccess().getUniqueKeyword_10_0());
                    			
                    // InternalEel.g:4109:4: ( (lv_unique_12_0= ruleEBoolean ) )
                    // InternalEel.g:4110:5: (lv_unique_12_0= ruleEBoolean )
                    {
                    // InternalEel.g:4110:5: (lv_unique_12_0= ruleEBoolean )
                    // InternalEel.g:4111:6: lv_unique_12_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getUniqueEBooleanParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_95);
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

            // InternalEel.g:4129:3: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==61) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalEel.g:4130:4: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,61,FOLLOW_62); 

                    				newLeafNode(otherlv_13, grammarAccess.getEAttributeAccess().getLowerBoundKeyword_11_0());
                    			
                    // InternalEel.g:4134:4: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // InternalEel.g:4135:5: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // InternalEel.g:4135:5: (lv_lowerBound_14_0= ruleEInt )
                    // InternalEel.g:4136:6: lv_lowerBound_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getLowerBoundEIntParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_96);
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

            // InternalEel.g:4154:3: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==62) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalEel.g:4155:4: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,62,FOLLOW_62); 

                    				newLeafNode(otherlv_15, grammarAccess.getEAttributeAccess().getUpperBoundKeyword_12_0());
                    			
                    // InternalEel.g:4159:4: ( (lv_upperBound_16_0= ruleEInt ) )
                    // InternalEel.g:4160:5: (lv_upperBound_16_0= ruleEInt )
                    {
                    // InternalEel.g:4160:5: (lv_upperBound_16_0= ruleEInt )
                    // InternalEel.g:4161:6: lv_upperBound_16_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getUpperBoundEIntParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_97);
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

            // InternalEel.g:4179:3: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==93) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalEel.g:4180:4: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,93,FOLLOW_59); 

                    				newLeafNode(otherlv_17, grammarAccess.getEAttributeAccess().getChangeableKeyword_13_0());
                    			
                    // InternalEel.g:4184:4: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // InternalEel.g:4185:5: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // InternalEel.g:4185:5: (lv_changeable_18_0= ruleEBoolean )
                    // InternalEel.g:4186:6: lv_changeable_18_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getChangeableEBooleanParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_98);
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

            // InternalEel.g:4204:3: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==94) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalEel.g:4205:4: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,94,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getEAttributeAccess().getDefaultValueLiteralKeyword_14_0());
                    			
                    // InternalEel.g:4209:4: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // InternalEel.g:4210:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // InternalEel.g:4210:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    // InternalEel.g:4211:6: lv_defaultValueLiteral_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_99);
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

            // InternalEel.g:4229:3: (otherlv_21= 'eType' ( ( ruleEString ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==63) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalEel.g:4230:4: otherlv_21= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_21=(Token)match(input,63,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getEAttributeAccess().getETypeKeyword_15_0());
                    			
                    // InternalEel.g:4234:4: ( ( ruleEString ) )
                    // InternalEel.g:4235:5: ( ruleEString )
                    {
                    // InternalEel.g:4235:5: ( ruleEString )
                    // InternalEel.g:4236:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getETypeEClassifierCrossReference_15_1_0());
                    					
                    pushFollow(FOLLOW_100);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4251:3: (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==53) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalEel.g:4252:4: otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getEAttributeAccess().getEAnnotationsKeyword_16_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_49); 

                    				newLeafNode(otherlv_24, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalEel.g:4260:4: ( (lv_eAnnotations_25_0= ruleEAnnotation ) )
                    // InternalEel.g:4261:5: (lv_eAnnotations_25_0= ruleEAnnotation )
                    {
                    // InternalEel.g:4261:5: (lv_eAnnotations_25_0= ruleEAnnotation )
                    // InternalEel.g:4262:6: lv_eAnnotations_25_0= ruleEAnnotation
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

                    // InternalEel.g:4279:4: (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==14) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // InternalEel.g:4280:5: otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_49); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getEAttributeAccess().getCommaKeyword_16_3_0());
                    	    				
                    	    // InternalEel.g:4284:5: ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    // InternalEel.g:4285:6: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:4285:6: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    // InternalEel.g:4286:7: lv_eAnnotations_27_0= ruleEAnnotation
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
                    	    break loop106;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,15,FOLLOW_101); 

                    				newLeafNode(otherlv_28, grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_16_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:4309:3: (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==65) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalEel.g:4310:4: otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    {
                    otherlv_29=(Token)match(input,65,FOLLOW_57); 

                    				newLeafNode(otherlv_29, grammarAccess.getEAttributeAccess().getEGenericTypeKeyword_17_0());
                    			
                    // InternalEel.g:4314:4: ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    // InternalEel.g:4315:5: (lv_eGenericType_30_0= ruleEGenericType )
                    {
                    // InternalEel.g:4315:5: (lv_eGenericType_30_0= ruleEGenericType )
                    // InternalEel.g:4316:6: lv_eGenericType_30_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getEGenericTypeEGenericTypeParserRuleCall_17_1_0());
                    					
                    pushFollow(FOLLOW_9);
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
    // InternalEel.g:4342:1: entryRuleEReference returns [EObject current=null] : iv_ruleEReference= ruleEReference EOF ;
    public final EObject entryRuleEReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEReference = null;


        try {
            // InternalEel.g:4342:51: (iv_ruleEReference= ruleEReference EOF )
            // InternalEel.g:4343:2: iv_ruleEReference= ruleEReference EOF
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
    // InternalEel.g:4349:1: ruleEReference returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) ;
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
            // InternalEel.g:4355:2: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) )
            // InternalEel.g:4356:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            {
            // InternalEel.g:4356:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            // InternalEel.g:4357:3: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}'
            {
            // InternalEel.g:4357:3: ()
            // InternalEel.g:4358:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEReferenceAccess().getEReferenceAction_0(),
            					current);
            			

            }

            // InternalEel.g:4364:3: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==87) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalEel.g:4365:4: (lv_volatile_1_0= 'volatile' )
                    {
                    // InternalEel.g:4365:4: (lv_volatile_1_0= 'volatile' )
                    // InternalEel.g:4366:5: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,87,FOLLOW_102); 

                    					newLeafNode(lv_volatile_1_0, grammarAccess.getEReferenceAccess().getVolatileVolatileKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "volatile", true, "volatile");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4378:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==88) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalEel.g:4379:4: (lv_transient_2_0= 'transient' )
                    {
                    // InternalEel.g:4379:4: (lv_transient_2_0= 'transient' )
                    // InternalEel.g:4380:5: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,88,FOLLOW_103); 

                    					newLeafNode(lv_transient_2_0, grammarAccess.getEReferenceAccess().getTransientTransientKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "transient", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4392:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==89) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalEel.g:4393:4: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // InternalEel.g:4393:4: (lv_unsettable_3_0= 'unsettable' )
                    // InternalEel.g:4394:5: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,89,FOLLOW_104); 

                    					newLeafNode(lv_unsettable_3_0, grammarAccess.getEReferenceAccess().getUnsettableUnsettableKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "unsettable", true, "unsettable");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4406:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==90) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalEel.g:4407:4: (lv_derived_4_0= 'derived' )
                    {
                    // InternalEel.g:4407:4: (lv_derived_4_0= 'derived' )
                    // InternalEel.g:4408:5: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,90,FOLLOW_105); 

                    					newLeafNode(lv_derived_4_0, grammarAccess.getEReferenceAccess().getDerivedDerivedKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "derived", true, "derived");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4420:3: ( (lv_containment_5_0= 'containment' ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==95) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalEel.g:4421:4: (lv_containment_5_0= 'containment' )
                    {
                    // InternalEel.g:4421:4: (lv_containment_5_0= 'containment' )
                    // InternalEel.g:4422:5: lv_containment_5_0= 'containment'
                    {
                    lv_containment_5_0=(Token)match(input,95,FOLLOW_106); 

                    					newLeafNode(lv_containment_5_0, grammarAccess.getEReferenceAccess().getContainmentContainmentKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "containment", true, "containment");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,96,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getEReferenceAccess().getEReferenceKeyword_6());
            		
            // InternalEel.g:4438:3: ( (lv_name_7_0= ruleEString ) )
            // InternalEel.g:4439:4: (lv_name_7_0= ruleEString )
            {
            // InternalEel.g:4439:4: (lv_name_7_0= ruleEString )
            // InternalEel.g:4440:5: lv_name_7_0= ruleEString
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

            otherlv_8=(Token)match(input,12,FOLLOW_107); 

            			newLeafNode(otherlv_8, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalEel.g:4461:3: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==59) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalEel.g:4462:4: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,59,FOLLOW_59); 

                    				newLeafNode(otherlv_9, grammarAccess.getEReferenceAccess().getOrderedKeyword_9_0());
                    			
                    // InternalEel.g:4466:4: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // InternalEel.g:4467:5: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // InternalEel.g:4467:5: (lv_ordered_10_0= ruleEBoolean )
                    // InternalEel.g:4468:6: lv_ordered_10_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getOrderedEBooleanParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_108);
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

            // InternalEel.g:4486:3: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==60) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalEel.g:4487:4: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,60,FOLLOW_59); 

                    				newLeafNode(otherlv_11, grammarAccess.getEReferenceAccess().getUniqueKeyword_10_0());
                    			
                    // InternalEel.g:4491:4: ( (lv_unique_12_0= ruleEBoolean ) )
                    // InternalEel.g:4492:5: (lv_unique_12_0= ruleEBoolean )
                    {
                    // InternalEel.g:4492:5: (lv_unique_12_0= ruleEBoolean )
                    // InternalEel.g:4493:6: lv_unique_12_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getUniqueEBooleanParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_109);
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

            // InternalEel.g:4511:3: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==61) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalEel.g:4512:4: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,61,FOLLOW_62); 

                    				newLeafNode(otherlv_13, grammarAccess.getEReferenceAccess().getLowerBoundKeyword_11_0());
                    			
                    // InternalEel.g:4516:4: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // InternalEel.g:4517:5: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // InternalEel.g:4517:5: (lv_lowerBound_14_0= ruleEInt )
                    // InternalEel.g:4518:6: lv_lowerBound_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getLowerBoundEIntParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_110);
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

            // InternalEel.g:4536:3: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==62) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalEel.g:4537:4: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,62,FOLLOW_62); 

                    				newLeafNode(otherlv_15, grammarAccess.getEReferenceAccess().getUpperBoundKeyword_12_0());
                    			
                    // InternalEel.g:4541:4: ( (lv_upperBound_16_0= ruleEInt ) )
                    // InternalEel.g:4542:5: (lv_upperBound_16_0= ruleEInt )
                    {
                    // InternalEel.g:4542:5: (lv_upperBound_16_0= ruleEInt )
                    // InternalEel.g:4543:6: lv_upperBound_16_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getUpperBoundEIntParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_111);
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

            // InternalEel.g:4561:3: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==93) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalEel.g:4562:4: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,93,FOLLOW_59); 

                    				newLeafNode(otherlv_17, grammarAccess.getEReferenceAccess().getChangeableKeyword_13_0());
                    			
                    // InternalEel.g:4566:4: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // InternalEel.g:4567:5: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // InternalEel.g:4567:5: (lv_changeable_18_0= ruleEBoolean )
                    // InternalEel.g:4568:6: lv_changeable_18_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getChangeableEBooleanParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_112);
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

            // InternalEel.g:4586:3: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==94) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalEel.g:4587:4: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,94,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getEReferenceAccess().getDefaultValueLiteralKeyword_14_0());
                    			
                    // InternalEel.g:4591:4: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // InternalEel.g:4592:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // InternalEel.g:4592:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    // InternalEel.g:4593:6: lv_defaultValueLiteral_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_113);
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

            // InternalEel.g:4611:3: (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==97) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalEel.g:4612:4: otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    {
                    otherlv_21=(Token)match(input,97,FOLLOW_59); 

                    				newLeafNode(otherlv_21, grammarAccess.getEReferenceAccess().getResolveProxiesKeyword_15_0());
                    			
                    // InternalEel.g:4616:4: ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    // InternalEel.g:4617:5: (lv_resolveProxies_22_0= ruleEBoolean )
                    {
                    // InternalEel.g:4617:5: (lv_resolveProxies_22_0= ruleEBoolean )
                    // InternalEel.g:4618:6: lv_resolveProxies_22_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getResolveProxiesEBooleanParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_114);
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

            // InternalEel.g:4636:3: (otherlv_23= 'eType' ( ( ruleEString ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==63) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalEel.g:4637:4: otherlv_23= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_23=(Token)match(input,63,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getEReferenceAccess().getETypeKeyword_16_0());
                    			
                    // InternalEel.g:4641:4: ( ( ruleEString ) )
                    // InternalEel.g:4642:5: ( ruleEString )
                    {
                    // InternalEel.g:4642:5: ( ruleEString )
                    // InternalEel.g:4643:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getETypeEClassifierCrossReference_16_1_0());
                    					
                    pushFollow(FOLLOW_115);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4658:3: (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==98) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalEel.g:4659:4: otherlv_25= 'eOpposite' ( ( ruleEString ) )
                    {
                    otherlv_25=(Token)match(input,98,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getEReferenceAccess().getEOppositeKeyword_17_0());
                    			
                    // InternalEel.g:4663:4: ( ( ruleEString ) )
                    // InternalEel.g:4664:5: ( ruleEString )
                    {
                    // InternalEel.g:4664:5: ( ruleEString )
                    // InternalEel.g:4665:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEOppositeEReferenceCrossReference_17_1_0());
                    					
                    pushFollow(FOLLOW_116);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4680:3: (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==99) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalEel.g:4681:4: otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')'
                    {
                    otherlv_27=(Token)match(input,99,FOLLOW_46); 

                    				newLeafNode(otherlv_27, grammarAccess.getEReferenceAccess().getEKeysKeyword_18_0());
                    			
                    otherlv_28=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_28, grammarAccess.getEReferenceAccess().getLeftParenthesisKeyword_18_1());
                    			
                    // InternalEel.g:4689:4: ( ( ruleEString ) )
                    // InternalEel.g:4690:5: ( ruleEString )
                    {
                    // InternalEel.g:4690:5: ( ruleEString )
                    // InternalEel.g:4691:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_2_0());
                    					
                    pushFollow(FOLLOW_47);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:4705:4: (otherlv_30= ',' ( ( ruleEString ) ) )*
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==14) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // InternalEel.g:4706:5: otherlv_30= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_30=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_30, grammarAccess.getEReferenceAccess().getCommaKeyword_18_3_0());
                    	    				
                    	    // InternalEel.g:4710:5: ( ( ruleEString ) )
                    	    // InternalEel.g:4711:6: ( ruleEString )
                    	    {
                    	    // InternalEel.g:4711:6: ( ruleEString )
                    	    // InternalEel.g:4712:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEReferenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop123;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,52,FOLLOW_100); 

                    				newLeafNode(otherlv_32, grammarAccess.getEReferenceAccess().getRightParenthesisKeyword_18_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:4732:3: (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==53) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalEel.g:4733:4: otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_33, grammarAccess.getEReferenceAccess().getEAnnotationsKeyword_19_0());
                    			
                    otherlv_34=(Token)match(input,12,FOLLOW_49); 

                    				newLeafNode(otherlv_34, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_19_1());
                    			
                    // InternalEel.g:4741:4: ( (lv_eAnnotations_35_0= ruleEAnnotation ) )
                    // InternalEel.g:4742:5: (lv_eAnnotations_35_0= ruleEAnnotation )
                    {
                    // InternalEel.g:4742:5: (lv_eAnnotations_35_0= ruleEAnnotation )
                    // InternalEel.g:4743:6: lv_eAnnotations_35_0= ruleEAnnotation
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

                    // InternalEel.g:4760:4: (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )*
                    loop125:
                    do {
                        int alt125=2;
                        int LA125_0 = input.LA(1);

                        if ( (LA125_0==14) ) {
                            alt125=1;
                        }


                        switch (alt125) {
                    	case 1 :
                    	    // InternalEel.g:4761:5: otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_36=(Token)match(input,14,FOLLOW_49); 

                    	    					newLeafNode(otherlv_36, grammarAccess.getEReferenceAccess().getCommaKeyword_19_3_0());
                    	    				
                    	    // InternalEel.g:4765:5: ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    // InternalEel.g:4766:6: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:4766:6: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    // InternalEel.g:4767:7: lv_eAnnotations_37_0= ruleEAnnotation
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
                    	    break loop125;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,15,FOLLOW_101); 

                    				newLeafNode(otherlv_38, grammarAccess.getEReferenceAccess().getRightCurlyBracketKeyword_19_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:4790:3: (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==65) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalEel.g:4791:4: otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    {
                    otherlv_39=(Token)match(input,65,FOLLOW_57); 

                    				newLeafNode(otherlv_39, grammarAccess.getEReferenceAccess().getEGenericTypeKeyword_20_0());
                    			
                    // InternalEel.g:4795:4: ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    // InternalEel.g:4796:5: (lv_eGenericType_40_0= ruleEGenericType )
                    {
                    // InternalEel.g:4796:5: (lv_eGenericType_40_0= ruleEGenericType )
                    // InternalEel.g:4797:6: lv_eGenericType_40_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEGenericTypeEGenericTypeParserRuleCall_20_1_0());
                    					
                    pushFollow(FOLLOW_9);
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
    // InternalEel.g:4823:1: entryRuleEDataType_Impl returns [EObject current=null] : iv_ruleEDataType_Impl= ruleEDataType_Impl EOF ;
    public final EObject entryRuleEDataType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataType_Impl = null;


        try {
            // InternalEel.g:4823:55: (iv_ruleEDataType_Impl= ruleEDataType_Impl EOF )
            // InternalEel.g:4824:2: iv_ruleEDataType_Impl= ruleEDataType_Impl EOF
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
    // InternalEel.g:4830:1: ruleEDataType_Impl returns [EObject current=null] : ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
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
            // InternalEel.g:4836:2: ( ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalEel.g:4837:2: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalEel.g:4837:2: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalEel.g:4838:3: () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalEel.g:4838:3: ()
            // InternalEel.g:4839:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEDataType_ImplAccess().getEDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,100,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEDataType_ImplAccess().getEDataTypeKeyword_1());
            		
            // InternalEel.g:4849:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:4850:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:4850:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:4851:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_117); 

            			newLeafNode(otherlv_3, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:4872:3: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==48) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalEel.g:4873:4: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEDataType_ImplAccess().getInstanceClassNameKeyword_4_0());
                    			
                    // InternalEel.g:4877:4: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // InternalEel.g:4878:5: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // InternalEel.g:4878:5: (lv_instanceClassName_5_0= ruleEString )
                    // InternalEel.g:4879:6: lv_instanceClassName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceClassNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_118);
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

            // InternalEel.g:4897:3: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==49) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalEel.g:4898:4: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameKeyword_5_0());
                    			
                    // InternalEel.g:4902:4: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // InternalEel.g:4903:5: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // InternalEel.g:4903:5: (lv_instanceTypeName_7_0= ruleEString )
                    // InternalEel.g:4904:6: lv_instanceTypeName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_119);
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

            // InternalEel.g:4922:3: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==101) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalEel.g:4923:4: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,101,FOLLOW_59); 

                    				newLeafNode(otherlv_8, grammarAccess.getEDataType_ImplAccess().getSerializableKeyword_6_0());
                    			
                    // InternalEel.g:4927:4: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // InternalEel.g:4928:5: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // InternalEel.g:4928:5: (lv_serializable_9_0= ruleEBoolean )
                    // InternalEel.g:4929:6: lv_serializable_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getSerializableEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_120);
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

            // InternalEel.g:4947:3: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==53) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalEel.g:4948:4: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEDataType_ImplAccess().getEAnnotationsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_49); 

                    				newLeafNode(otherlv_11, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalEel.g:4956:4: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // InternalEel.g:4957:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // InternalEel.g:4957:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // InternalEel.g:4958:6: lv_eAnnotations_12_0= ruleEAnnotation
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

                    // InternalEel.g:4975:4: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==14) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // InternalEel.g:4976:5: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_49); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalEel.g:4980:5: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // InternalEel.g:4981:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:4981:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // InternalEel.g:4982:7: lv_eAnnotations_14_0= ruleEAnnotation
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
                    	    break loop131;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_121); 

                    				newLeafNode(otherlv_15, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:5005:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==54) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalEel.g:5006:4: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,54,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEDataType_ImplAccess().getETypeParametersKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_51); 

                    				newLeafNode(otherlv_17, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalEel.g:5014:4: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // InternalEel.g:5015:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // InternalEel.g:5015:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // InternalEel.g:5016:6: lv_eTypeParameters_18_0= ruleETypeParameter
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

                    // InternalEel.g:5033:4: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==14) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // InternalEel.g:5034:5: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_51); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalEel.g:5038:5: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // InternalEel.g:5039:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // InternalEel.g:5039:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // InternalEel.g:5040:7: lv_eTypeParameters_20_0= ruleETypeParameter
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
                    	    break loop133;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_9); 

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
    // InternalEel.g:5071:1: entryRuleEEnum returns [EObject current=null] : iv_ruleEEnum= ruleEEnum EOF ;
    public final EObject entryRuleEEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnum = null;


        try {
            // InternalEel.g:5071:46: (iv_ruleEEnum= ruleEEnum EOF )
            // InternalEel.g:5072:2: iv_ruleEEnum= ruleEEnum EOF
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
    // InternalEel.g:5078:1: ruleEEnum returns [EObject current=null] : ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
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
            // InternalEel.g:5084:2: ( ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // InternalEel.g:5085:2: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // InternalEel.g:5085:2: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // InternalEel.g:5086:3: () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // InternalEel.g:5086:3: ()
            // InternalEel.g:5087:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEEnumAccess().getEEnumAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,102,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEEnumAccess().getEEnumKeyword_1());
            		
            // InternalEel.g:5097:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:5098:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:5098:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:5099:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_122); 

            			newLeafNode(otherlv_3, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:5120:3: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==48) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalEel.g:5121:4: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEEnumAccess().getInstanceClassNameKeyword_4_0());
                    			
                    // InternalEel.g:5125:4: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // InternalEel.g:5126:5: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // InternalEel.g:5126:5: (lv_instanceClassName_5_0= ruleEString )
                    // InternalEel.g:5127:6: lv_instanceClassName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getInstanceClassNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_123);
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

            // InternalEel.g:5145:3: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==49) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalEel.g:5146:4: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEEnumAccess().getInstanceTypeNameKeyword_5_0());
                    			
                    // InternalEel.g:5150:4: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // InternalEel.g:5151:5: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // InternalEel.g:5151:5: (lv_instanceTypeName_7_0= ruleEString )
                    // InternalEel.g:5152:6: lv_instanceTypeName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_124);
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

            // InternalEel.g:5170:3: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==101) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalEel.g:5171:4: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,101,FOLLOW_59); 

                    				newLeafNode(otherlv_8, grammarAccess.getEEnumAccess().getSerializableKeyword_6_0());
                    			
                    // InternalEel.g:5175:4: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // InternalEel.g:5176:5: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // InternalEel.g:5176:5: (lv_serializable_9_0= ruleEBoolean )
                    // InternalEel.g:5177:6: lv_serializable_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getSerializableEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_125);
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

            // InternalEel.g:5195:3: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==53) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalEel.g:5196:4: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEEnumAccess().getEAnnotationsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_49); 

                    				newLeafNode(otherlv_11, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalEel.g:5204:4: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // InternalEel.g:5205:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // InternalEel.g:5205:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // InternalEel.g:5206:6: lv_eAnnotations_12_0= ruleEAnnotation
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

                    // InternalEel.g:5223:4: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==14) ) {
                            alt138=1;
                        }


                        switch (alt138) {
                    	case 1 :
                    	    // InternalEel.g:5224:5: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_49); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEEnumAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalEel.g:5228:5: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // InternalEel.g:5229:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:5229:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // InternalEel.g:5230:7: lv_eAnnotations_14_0= ruleEAnnotation
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
                    	    break loop138;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_126); 

                    				newLeafNode(otherlv_15, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:5253:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==54) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalEel.g:5254:4: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,54,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEEnumAccess().getETypeParametersKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_51); 

                    				newLeafNode(otherlv_17, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalEel.g:5262:4: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // InternalEel.g:5263:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // InternalEel.g:5263:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // InternalEel.g:5264:6: lv_eTypeParameters_18_0= ruleETypeParameter
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

                    // InternalEel.g:5281:4: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop140:
                    do {
                        int alt140=2;
                        int LA140_0 = input.LA(1);

                        if ( (LA140_0==14) ) {
                            alt140=1;
                        }


                        switch (alt140) {
                    	case 1 :
                    	    // InternalEel.g:5282:5: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_51); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEEnumAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalEel.g:5286:5: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // InternalEel.g:5287:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // InternalEel.g:5287:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // InternalEel.g:5288:7: lv_eTypeParameters_20_0= ruleETypeParameter
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
                    	    break loop140;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_127); 

                    				newLeafNode(otherlv_21, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:5311:3: (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==103) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalEel.g:5312:4: otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,103,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getEEnumAccess().getELiteralsKeyword_9_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_128); 

                    				newLeafNode(otherlv_23, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalEel.g:5320:4: ( (lv_eLiterals_24_0= ruleEEnumLiteral ) )
                    // InternalEel.g:5321:5: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    {
                    // InternalEel.g:5321:5: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    // InternalEel.g:5322:6: lv_eLiterals_24_0= ruleEEnumLiteral
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

                    // InternalEel.g:5339:4: (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )*
                    loop142:
                    do {
                        int alt142=2;
                        int LA142_0 = input.LA(1);

                        if ( (LA142_0==14) ) {
                            alt142=1;
                        }


                        switch (alt142) {
                    	case 1 :
                    	    // InternalEel.g:5340:5: otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_128); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getEEnumAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalEel.g:5344:5: ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    // InternalEel.g:5345:6: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    {
                    	    // InternalEel.g:5345:6: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    // InternalEel.g:5346:7: lv_eLiterals_26_0= ruleEEnumLiteral
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
                    	    break loop142;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_9); 

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
    // InternalEel.g:5377:1: entryRuleEEnumLiteral returns [EObject current=null] : iv_ruleEEnumLiteral= ruleEEnumLiteral EOF ;
    public final EObject entryRuleEEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnumLiteral = null;


        try {
            // InternalEel.g:5377:53: (iv_ruleEEnumLiteral= ruleEEnumLiteral EOF )
            // InternalEel.g:5378:2: iv_ruleEEnumLiteral= ruleEEnumLiteral EOF
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
    // InternalEel.g:5384:1: ruleEEnumLiteral returns [EObject current=null] : ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
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
            // InternalEel.g:5390:2: ( ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalEel.g:5391:2: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalEel.g:5391:2: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalEel.g:5392:3: () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalEel.g:5392:3: ()
            // InternalEel.g:5393:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEEnumLiteralAccess().getEEnumLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,104,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEEnumLiteralAccess().getEEnumLiteralKeyword_1());
            		
            // InternalEel.g:5403:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:5404:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:5404:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:5405:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_129); 

            			newLeafNode(otherlv_3, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:5426:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==18) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalEel.g:5427:4: otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_62); 

                    				newLeafNode(otherlv_4, grammarAccess.getEEnumLiteralAccess().getValueKeyword_4_0());
                    			
                    // InternalEel.g:5431:4: ( (lv_value_5_0= ruleEInt ) )
                    // InternalEel.g:5432:5: (lv_value_5_0= ruleEInt )
                    {
                    // InternalEel.g:5432:5: (lv_value_5_0= ruleEInt )
                    // InternalEel.g:5433:6: lv_value_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getValueEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_130);
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

            // InternalEel.g:5451:3: (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==105) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalEel.g:5452:4: otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,105,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEEnumLiteralAccess().getLiteralKeyword_5_0());
                    			
                    // InternalEel.g:5456:4: ( (lv_literal_7_0= ruleEString ) )
                    // InternalEel.g:5457:5: (lv_literal_7_0= ruleEString )
                    {
                    // InternalEel.g:5457:5: (lv_literal_7_0= ruleEString )
                    // InternalEel.g:5458:6: lv_literal_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getLiteralEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_131);
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

            // InternalEel.g:5476:3: (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==53) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalEel.g:5477:4: otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEEnumLiteralAccess().getEAnnotationsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_49); 

                    				newLeafNode(otherlv_9, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalEel.g:5485:4: ( (lv_eAnnotations_10_0= ruleEAnnotation ) )
                    // InternalEel.g:5486:5: (lv_eAnnotations_10_0= ruleEAnnotation )
                    {
                    // InternalEel.g:5486:5: (lv_eAnnotations_10_0= ruleEAnnotation )
                    // InternalEel.g:5487:6: lv_eAnnotations_10_0= ruleEAnnotation
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

                    // InternalEel.g:5504:4: (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )*
                    loop146:
                    do {
                        int alt146=2;
                        int LA146_0 = input.LA(1);

                        if ( (LA146_0==14) ) {
                            alt146=1;
                        }


                        switch (alt146) {
                    	case 1 :
                    	    // InternalEel.g:5505:5: otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_49); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getEEnumLiteralAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalEel.g:5509:5: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    // InternalEel.g:5510:6: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:5510:6: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    // InternalEel.g:5511:7: lv_eAnnotations_12_0= ruleEAnnotation
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
                    	    break loop146;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_9); 

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
    // InternalEel.g:5542:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // InternalEel.g:5542:51: (iv_ruleEParameter= ruleEParameter EOF )
            // InternalEel.g:5543:2: iv_ruleEParameter= ruleEParameter EOF
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
    // InternalEel.g:5549:1: ruleEParameter returns [EObject current=null] : ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) ;
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
            // InternalEel.g:5555:2: ( ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) )
            // InternalEel.g:5556:2: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            {
            // InternalEel.g:5556:2: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            // InternalEel.g:5557:3: () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}'
            {
            // InternalEel.g:5557:3: ()
            // InternalEel.g:5558:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEParameterAccess().getEParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,106,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEParameterAccess().getEParameterKeyword_1());
            		
            // InternalEel.g:5568:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:5569:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:5569:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:5570:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_132); 

            			newLeafNode(otherlv_3, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:5591:3: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==59) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalEel.g:5592:4: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,59,FOLLOW_59); 

                    				newLeafNode(otherlv_4, grammarAccess.getEParameterAccess().getOrderedKeyword_4_0());
                    			
                    // InternalEel.g:5596:4: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // InternalEel.g:5597:5: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // InternalEel.g:5597:5: (lv_ordered_5_0= ruleEBoolean )
                    // InternalEel.g:5598:6: lv_ordered_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getOrderedEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_133);
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

            // InternalEel.g:5616:3: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==60) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalEel.g:5617:4: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,60,FOLLOW_59); 

                    				newLeafNode(otherlv_6, grammarAccess.getEParameterAccess().getUniqueKeyword_5_0());
                    			
                    // InternalEel.g:5621:4: ( (lv_unique_7_0= ruleEBoolean ) )
                    // InternalEel.g:5622:5: (lv_unique_7_0= ruleEBoolean )
                    {
                    // InternalEel.g:5622:5: (lv_unique_7_0= ruleEBoolean )
                    // InternalEel.g:5623:6: lv_unique_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getUniqueEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_134);
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

            // InternalEel.g:5641:3: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==61) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalEel.g:5642:4: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,61,FOLLOW_62); 

                    				newLeafNode(otherlv_8, grammarAccess.getEParameterAccess().getLowerBoundKeyword_6_0());
                    			
                    // InternalEel.g:5646:4: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // InternalEel.g:5647:5: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // InternalEel.g:5647:5: (lv_lowerBound_9_0= ruleEInt )
                    // InternalEel.g:5648:6: lv_lowerBound_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getLowerBoundEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_135);
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

            // InternalEel.g:5666:3: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==62) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalEel.g:5667:4: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,62,FOLLOW_62); 

                    				newLeafNode(otherlv_10, grammarAccess.getEParameterAccess().getUpperBoundKeyword_7_0());
                    			
                    // InternalEel.g:5671:4: ( (lv_upperBound_11_0= ruleEInt ) )
                    // InternalEel.g:5672:5: (lv_upperBound_11_0= ruleEInt )
                    {
                    // InternalEel.g:5672:5: (lv_upperBound_11_0= ruleEInt )
                    // InternalEel.g:5673:6: lv_upperBound_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getUpperBoundEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_99);
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

            // InternalEel.g:5691:3: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==63) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalEel.g:5692:4: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,63,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getEParameterAccess().getETypeKeyword_8_0());
                    			
                    // InternalEel.g:5696:4: ( ( ruleEString ) )
                    // InternalEel.g:5697:5: ( ruleEString )
                    {
                    // InternalEel.g:5697:5: ( ruleEString )
                    // InternalEel.g:5698:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEParameterRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEParameterAccess().getETypeEClassifierCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_100);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5713:3: (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==53) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // InternalEel.g:5714:4: otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getEParameterAccess().getEAnnotationsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_49); 

                    				newLeafNode(otherlv_15, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalEel.g:5722:4: ( (lv_eAnnotations_16_0= ruleEAnnotation ) )
                    // InternalEel.g:5723:5: (lv_eAnnotations_16_0= ruleEAnnotation )
                    {
                    // InternalEel.g:5723:5: (lv_eAnnotations_16_0= ruleEAnnotation )
                    // InternalEel.g:5724:6: lv_eAnnotations_16_0= ruleEAnnotation
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

                    // InternalEel.g:5741:4: (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )*
                    loop153:
                    do {
                        int alt153=2;
                        int LA153_0 = input.LA(1);

                        if ( (LA153_0==14) ) {
                            alt153=1;
                        }


                        switch (alt153) {
                    	case 1 :
                    	    // InternalEel.g:5742:5: otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_49); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEParameterAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalEel.g:5746:5: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    // InternalEel.g:5747:6: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:5747:6: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    // InternalEel.g:5748:7: lv_eAnnotations_18_0= ruleEAnnotation
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
                    	    break loop153;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,15,FOLLOW_101); 

                    				newLeafNode(otherlv_19, grammarAccess.getEParameterAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:5771:3: (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==65) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // InternalEel.g:5772:4: otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    {
                    otherlv_20=(Token)match(input,65,FOLLOW_57); 

                    				newLeafNode(otherlv_20, grammarAccess.getEParameterAccess().getEGenericTypeKeyword_10_0());
                    			
                    // InternalEel.g:5776:4: ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    // InternalEel.g:5777:5: (lv_eGenericType_21_0= ruleEGenericType )
                    {
                    // InternalEel.g:5777:5: (lv_eGenericType_21_0= ruleEGenericType )
                    // InternalEel.g:5778:6: lv_eGenericType_21_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getEGenericTypeEGenericTypeParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_9);
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
    // InternalEel.g:5804:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'current' ) | (enumLiteral_1= 'duration' ) | (enumLiteral_2= 'energy' ) | (enumLiteral_3= 'frequency' ) | (enumLiteral_4= 'power' ) | (enumLiteral_5= 'voltage' ) | (enumLiteral_6= 'scalar' ) ) ;
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
            // InternalEel.g:5810:2: ( ( (enumLiteral_0= 'current' ) | (enumLiteral_1= 'duration' ) | (enumLiteral_2= 'energy' ) | (enumLiteral_3= 'frequency' ) | (enumLiteral_4= 'power' ) | (enumLiteral_5= 'voltage' ) | (enumLiteral_6= 'scalar' ) ) )
            // InternalEel.g:5811:2: ( (enumLiteral_0= 'current' ) | (enumLiteral_1= 'duration' ) | (enumLiteral_2= 'energy' ) | (enumLiteral_3= 'frequency' ) | (enumLiteral_4= 'power' ) | (enumLiteral_5= 'voltage' ) | (enumLiteral_6= 'scalar' ) )
            {
            // InternalEel.g:5811:2: ( (enumLiteral_0= 'current' ) | (enumLiteral_1= 'duration' ) | (enumLiteral_2= 'energy' ) | (enumLiteral_3= 'frequency' ) | (enumLiteral_4= 'power' ) | (enumLiteral_5= 'voltage' ) | (enumLiteral_6= 'scalar' ) )
            int alt156=7;
            switch ( input.LA(1) ) {
            case 107:
                {
                alt156=1;
                }
                break;
            case 108:
                {
                alt156=2;
                }
                break;
            case 109:
                {
                alt156=3;
                }
                break;
            case 110:
                {
                alt156=4;
                }
                break;
            case 111:
                {
                alt156=5;
                }
                break;
            case 112:
                {
                alt156=6;
                }
                break;
            case 113:
                {
                alt156=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 156, 0, input);

                throw nvae;
            }

            switch (alt156) {
                case 1 :
                    // InternalEel.g:5812:3: (enumLiteral_0= 'current' )
                    {
                    // InternalEel.g:5812:3: (enumLiteral_0= 'current' )
                    // InternalEel.g:5813:4: enumLiteral_0= 'current'
                    {
                    enumLiteral_0=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getCurrentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getCurrentEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:5820:3: (enumLiteral_1= 'duration' )
                    {
                    // InternalEel.g:5820:3: (enumLiteral_1= 'duration' )
                    // InternalEel.g:5821:4: enumLiteral_1= 'duration'
                    {
                    enumLiteral_1=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDurationEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getDurationEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEel.g:5828:3: (enumLiteral_2= 'energy' )
                    {
                    // InternalEel.g:5828:3: (enumLiteral_2= 'energy' )
                    // InternalEel.g:5829:4: enumLiteral_2= 'energy'
                    {
                    enumLiteral_2=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getEnergyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getEnergyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEel.g:5836:3: (enumLiteral_3= 'frequency' )
                    {
                    // InternalEel.g:5836:3: (enumLiteral_3= 'frequency' )
                    // InternalEel.g:5837:4: enumLiteral_3= 'frequency'
                    {
                    enumLiteral_3=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFrequencyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getFrequencyEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEel.g:5844:3: (enumLiteral_4= 'power' )
                    {
                    // InternalEel.g:5844:3: (enumLiteral_4= 'power' )
                    // InternalEel.g:5845:4: enumLiteral_4= 'power'
                    {
                    enumLiteral_4=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getPowerEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getPowerEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalEel.g:5852:3: (enumLiteral_5= 'voltage' )
                    {
                    // InternalEel.g:5852:3: (enumLiteral_5= 'voltage' )
                    // InternalEel.g:5853:4: enumLiteral_5= 'voltage'
                    {
                    enumLiteral_5=(Token)match(input,112,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getVoltageEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getVoltageEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalEel.g:5860:3: (enumLiteral_6= 'scalar' )
                    {
                    // InternalEel.g:5860:3: (enumLiteral_6= 'scalar' )
                    // InternalEel.g:5861:4: enumLiteral_6= 'scalar'
                    {
                    enumLiteral_6=(Token)match(input,113,FOLLOW_2); 

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
    // InternalEel.g:5871:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEel.g:5877:2: ( ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) ) )
            // InternalEel.g:5878:2: ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) )
            {
            // InternalEel.g:5878:2: ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) )
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==114) ) {
                alt157=1;
            }
            else if ( (LA157_0==115) ) {
                alt157=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 157, 0, input);

                throw nvae;
            }
            switch (alt157) {
                case 1 :
                    // InternalEel.g:5879:3: (enumLiteral_0= 'LOCAL' )
                    {
                    // InternalEel.g:5879:3: (enumLiteral_0= 'LOCAL' )
                    // InternalEel.g:5880:4: enumLiteral_0= 'LOCAL'
                    {
                    enumLiteral_0=(Token)match(input,114,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getLOCALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:5887:3: (enumLiteral_1= 'GLOBAL' )
                    {
                    // InternalEel.g:5887:3: (enumLiteral_1= 'GLOBAL' )
                    // InternalEel.g:5888:4: enumLiteral_1= 'GLOBAL'
                    {
                    enumLiteral_1=(Token)match(input,115,FOLLOW_2); 

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
    static final String dfa_1s = "\35\uffff";
    static final String dfa_2s = "\21\uffff\2\23\12\uffff";
    static final String dfa_3s = "\1\4\2\24\2\4\1\uffff\2\24\11\26\2\4\1\uffff\2\33\2\uffff\2\32\3\uffff";
    static final String dfa_4s = "\1\5\2\35\1\5\1\161\1\uffff\2\35\11\26\2\44\1\uffff\2\34\2\uffff\2\34\3\uffff";
    static final String dfa_5s = "\5\uffff\1\7\15\uffff\1\1\2\uffff\1\3\1\2\2\uffff\1\6\1\5\1\4";
    static final String dfa_6s = "\35\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2",
            "\1\4\1\3\7\uffff\1\5",
            "\1\4\1\3\7\uffff\1\5",
            "\1\6\1\7",
            "\1\17\1\20\145\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "",
            "\1\4\10\uffff\1\5",
            "\1\4\10\uffff\1\5",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\22",
            "\1\22",
            "\1\24\1\25\1\23\7\uffff\2\23\4\uffff\1\23\2\uffff\1\23\1\27\1\26\12\uffff\1\23",
            "\1\30\1\31\1\23\7\uffff\2\23\4\uffff\1\23\2\uffff\1\23\1\27\1\26\12\uffff\1\23",
            "",
            "\1\33\1\32",
            "\1\33\1\32",
            "",
            "",
            "\1\34\1\33\1\32",
            "\1\34\1\33\1\32",
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
            return "252:2: (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureBinaryProductOperation_4= ruleMeasureBinaryProductOperation | this_MeasureBinarySumOperation_5= ruleMeasureBinarySumOperation | this_RealTimeDuration_6= ruleRealTimeDuration )";
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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x000C000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L,0x0003F80000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000900042L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0003F80000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000180008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000012600000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000C000008000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000008000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000008000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x03E7000000008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x03E6000000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x03E4000000008000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000004000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x03E0000000008000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x03C0000000008000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0380000000008000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0300000000008000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x000000019F800000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0200000000008000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0xF860000000008000L,0x000000000000000FL});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0xF060000000008000L,0x000000000000000FL});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0xE060000000008000L,0x000000000000000FL});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000040L,0x0000000000400000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0xC060000000008000L,0x000000000000000FL});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x8060000000008000L,0x000000000000000FL});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0060000000008000L,0x000000000000000FL});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0060000000008000L,0x000000000000000EL});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0040000000008000L,0x000000000000000EL});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0040000000008000L,0x000000000000000CL});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000008000L,0x000000000000000CL});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000008L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0020000000008000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0020000000008000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0020000000008000L,0x0000000000000180L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000180L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000100L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0020000000008000L,0x0000000000000400L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000008000L,0x000000000007C000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000008000L,0x0000000000078000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000008000L,0x0000000000070000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000008000L,0x0000000000060000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000048000L,0x0000000000100000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x000000001E000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x000000001C000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0xF820000000008000L,0x0000000060000002L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0xF020000000008000L,0x0000000060000002L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0xE020000000008000L,0x0000000060000002L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0xC020000000008000L,0x0000000060000002L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x8020000000008000L,0x0000000060000002L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x8020000000008000L,0x0000000040000002L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x8020000000008000L,0x0000000000000002L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0020000000008000L,0x0000000000000002L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000002L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000000187000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000186000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000000184000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0xF820000000008000L,0x0000000E60000002L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0xF020000000008000L,0x0000000E60000002L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0xE020000000008000L,0x0000000E60000002L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0xC020000000008000L,0x0000000E60000002L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x8020000000008000L,0x0000000E60000002L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x8020000000008000L,0x0000000E40000002L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x8020000000008000L,0x0000000E00000002L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x8020000000008000L,0x0000000C00000002L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0020000000008000L,0x0000000C00000002L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0020000000008000L,0x0000000800000002L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0063000000008000L,0x0000002000000000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0062000000008000L,0x0000002000000000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0060000000008000L,0x0000002000000000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0060000000008000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0040000000008000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0063000000008000L,0x000000A000000000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0062000000008000L,0x000000A000000000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0060000000008000L,0x000000A000000000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0060000000008000L,0x0000008000000000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0040000000008000L,0x0000008000000000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000008000L,0x0000008000000000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0020000000048000L,0x0000020000000000L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0020000000008000L,0x0000020000000000L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0020000000008000L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0xF820000000008000L,0x0000000000000002L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0xF020000000008000L,0x0000000000000002L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0xE020000000008000L,0x0000000000000002L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0xC020000000008000L,0x0000000000000002L});

}