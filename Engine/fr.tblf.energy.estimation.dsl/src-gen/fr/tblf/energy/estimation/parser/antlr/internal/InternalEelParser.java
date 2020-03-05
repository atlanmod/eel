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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Platform'", "'{'", "'variables'", "','", "'}'", "'measures'", "'Variable'", "'value'", "'vibility'", "'.'", "'#'", "'='", "'uncertainty'", "'ocl:'", "'attribute:'", "'as'", "'*'", "'+'", "'MeasurementUncertainty'", "'standardUncertainty'", "'information'", "'NormalDistribution'", "'Interval'", "'lowerEndpoint'", "'upperEndpoint'", "'Sampling'", "'measurementProcedure'", "'samples'", "'Integral'", "'function'", "'interval'", "'Sample'", "'quantity'", "'abstract'", "'interface'", "'EClass'", "'instanceClassName'", "'instanceTypeName'", "'eSuperTypes'", "'('", "')'", "'eAnnotations'", "'eTypeParameters'", "'eOperations'", "'eStructuralFeatures'", "'eGenericSuperTypes'", "'EOperation'", "'ordered'", "'unique'", "'lowerBound'", "'upperBound'", "'eType'", "'eExceptions'", "'eGenericType'", "'eParameters'", "'eGenericExceptions'", "'EAnnotation'", "'source'", "'references'", "'details'", "'contents'", "'ETypeParameter'", "'eBounds'", "'true'", "'false'", "'EGenericType'", "'eTypeParameter'", "'eClassifier'", "'eUpperBound'", "'eTypeArguments'", "'eLowerBound'", "'EStringToStringMapEntry'", "'key'", "'EObject'", "'-'", "'volatile'", "'transient'", "'unsettable'", "'derived'", "'iD'", "'EAttribute'", "'changeable'", "'defaultValueLiteral'", "'containment'", "'EReference'", "'resolveProxies'", "'eOpposite'", "'eKeys'", "'EDataType'", "'serializable'", "'EEnum'", "'eLiterals'", "'EEnumLiteral'", "'literal'", "'EParameter'", "'current'", "'duration'", "'energy'", "'frequency'", "'power'", "'voltage'", "'scalar'", "'LOCAL'", "'GLOBAL'"
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
    // InternalEel.g:245:1: ruleMeasure returns [EObject current=null] : (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureProductOperation_Impl_4= ruleMeasureProductOperation_Impl | this_MeasureSumOperation_5= ruleMeasureSumOperation ) ;
    public final EObject ruleMeasure() throws RecognitionException {
        EObject current = null;

        EObject this_MeasureValue_Impl_0 = null;

        EObject this_MeasureOCL_1 = null;

        EObject this_MeasureAttribute_2 = null;

        EObject this_MeasureCast_3 = null;

        EObject this_MeasureProductOperation_Impl_4 = null;

        EObject this_MeasureSumOperation_5 = null;



        	enterRule();

        try {
            // InternalEel.g:251:2: ( (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureProductOperation_Impl_4= ruleMeasureProductOperation_Impl | this_MeasureSumOperation_5= ruleMeasureSumOperation ) )
            // InternalEel.g:252:2: (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureProductOperation_Impl_4= ruleMeasureProductOperation_Impl | this_MeasureSumOperation_5= ruleMeasureSumOperation )
            {
            // InternalEel.g:252:2: (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureProductOperation_Impl_4= ruleMeasureProductOperation_Impl | this_MeasureSumOperation_5= ruleMeasureSumOperation )
            int alt5=6;
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
                    // InternalEel.g:289:3: this_MeasureProductOperation_Impl_4= ruleMeasureProductOperation_Impl
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureProductOperation_ImplParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureProductOperation_Impl_4=ruleMeasureProductOperation_Impl();

                    state._fsp--;


                    			current = this_MeasureProductOperation_Impl_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalEel.g:298:3: this_MeasureSumOperation_5= ruleMeasureSumOperation
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureSumOperationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureSumOperation_5=ruleMeasureSumOperation();

                    state._fsp--;


                    			current = this_MeasureSumOperation_5;
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
    // InternalEel.g:310:1: entryRuleEStructuralFeature returns [EObject current=null] : iv_ruleEStructuralFeature= ruleEStructuralFeature EOF ;
    public final EObject entryRuleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStructuralFeature = null;


        try {
            // InternalEel.g:310:59: (iv_ruleEStructuralFeature= ruleEStructuralFeature EOF )
            // InternalEel.g:311:2: iv_ruleEStructuralFeature= ruleEStructuralFeature EOF
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
    // InternalEel.g:317:1: ruleEStructuralFeature returns [EObject current=null] : (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) ;
    public final EObject ruleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject this_EAttribute_0 = null;

        EObject this_EReference_1 = null;



        	enterRule();

        try {
            // InternalEel.g:323:2: ( (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) )
            // InternalEel.g:324:2: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            {
            // InternalEel.g:324:2: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            int alt6=2;
            switch ( input.LA(1) ) {
            case 86:
                {
                switch ( input.LA(2) ) {
                case 87:
                    {
                    switch ( input.LA(3) ) {
                    case 88:
                        {
                        switch ( input.LA(4) ) {
                        case 89:
                            {
                            int LA6_4 = input.LA(5);

                            if ( ((LA6_4>=94 && LA6_4<=95)) ) {
                                alt6=2;
                            }
                            else if ( ((LA6_4>=90 && LA6_4<=91)) ) {
                                alt6=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 4, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 90:
                        case 91:
                            {
                            alt6=1;
                            }
                            break;
                        case 94:
                        case 95:
                            {
                            alt6=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 89:
                        {
                        int LA6_4 = input.LA(4);

                        if ( ((LA6_4>=94 && LA6_4<=95)) ) {
                            alt6=2;
                        }
                        else if ( ((LA6_4>=90 && LA6_4<=91)) ) {
                            alt6=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 94:
                    case 95:
                        {
                        alt6=2;
                        }
                        break;
                    case 90:
                    case 91:
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
                case 88:
                    {
                    switch ( input.LA(3) ) {
                    case 89:
                        {
                        int LA6_4 = input.LA(4);

                        if ( ((LA6_4>=94 && LA6_4<=95)) ) {
                            alt6=2;
                        }
                        else if ( ((LA6_4>=90 && LA6_4<=91)) ) {
                            alt6=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 90:
                    case 91:
                        {
                        alt6=1;
                        }
                        break;
                    case 94:
                    case 95:
                        {
                        alt6=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 89:
                    {
                    int LA6_4 = input.LA(3);

                    if ( ((LA6_4>=94 && LA6_4<=95)) ) {
                        alt6=2;
                    }
                    else if ( ((LA6_4>=90 && LA6_4<=91)) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 90:
                case 91:
                    {
                    alt6=1;
                    }
                    break;
                case 94:
                case 95:
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
            case 87:
                {
                switch ( input.LA(2) ) {
                case 88:
                    {
                    switch ( input.LA(3) ) {
                    case 89:
                        {
                        int LA6_4 = input.LA(4);

                        if ( ((LA6_4>=94 && LA6_4<=95)) ) {
                            alt6=2;
                        }
                        else if ( ((LA6_4>=90 && LA6_4<=91)) ) {
                            alt6=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 90:
                    case 91:
                        {
                        alt6=1;
                        }
                        break;
                    case 94:
                    case 95:
                        {
                        alt6=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 89:
                    {
                    int LA6_4 = input.LA(3);

                    if ( ((LA6_4>=94 && LA6_4<=95)) ) {
                        alt6=2;
                    }
                    else if ( ((LA6_4>=90 && LA6_4<=91)) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 94:
                case 95:
                    {
                    alt6=2;
                    }
                    break;
                case 90:
                case 91:
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
            case 88:
                {
                switch ( input.LA(2) ) {
                case 89:
                    {
                    int LA6_4 = input.LA(3);

                    if ( ((LA6_4>=94 && LA6_4<=95)) ) {
                        alt6=2;
                    }
                    else if ( ((LA6_4>=90 && LA6_4<=91)) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 90:
                case 91:
                    {
                    alt6=1;
                    }
                    break;
                case 94:
                case 95:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }

                }
                break;
            case 89:
                {
                int LA6_4 = input.LA(2);

                if ( ((LA6_4>=94 && LA6_4<=95)) ) {
                    alt6=2;
                }
                else if ( ((LA6_4>=90 && LA6_4<=91)) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            case 90:
            case 91:
                {
                alt6=1;
                }
                break;
            case 94:
            case 95:
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
                    // InternalEel.g:325:3: this_EAttribute_0= ruleEAttribute
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
                    // InternalEel.g:334:3: this_EReference_1= ruleEReference
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
    // InternalEel.g:346:1: entryRuleMeasurementUncertaintyInformation returns [EObject current=null] : iv_ruleMeasurementUncertaintyInformation= ruleMeasurementUncertaintyInformation EOF ;
    public final EObject entryRuleMeasurementUncertaintyInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementUncertaintyInformation = null;


        try {
            // InternalEel.g:346:74: (iv_ruleMeasurementUncertaintyInformation= ruleMeasurementUncertaintyInformation EOF )
            // InternalEel.g:347:2: iv_ruleMeasurementUncertaintyInformation= ruleMeasurementUncertaintyInformation EOF
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
    // InternalEel.g:353:1: ruleMeasurementUncertaintyInformation returns [EObject current=null] : (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral ) ;
    public final EObject ruleMeasurementUncertaintyInformation() throws RecognitionException {
        EObject current = null;

        EObject this_NormalDistribution_0 = null;

        EObject this_Interval_1 = null;

        EObject this_Sampling_2 = null;

        EObject this_Integral_3 = null;



        	enterRule();

        try {
            // InternalEel.g:359:2: ( (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral ) )
            // InternalEel.g:360:2: (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral )
            {
            // InternalEel.g:360:2: (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt7=1;
                }
                break;
            case 33:
                {
                alt7=2;
                }
                break;
            case 36:
                {
                alt7=3;
                }
                break;
            case 39:
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
                    // InternalEel.g:361:3: this_NormalDistribution_0= ruleNormalDistribution
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
                    // InternalEel.g:370:3: this_Interval_1= ruleInterval
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
                    // InternalEel.g:379:3: this_Sampling_2= ruleSampling
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
                    // InternalEel.g:388:3: this_Integral_3= ruleIntegral
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
    // InternalEel.g:400:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalEel.g:400:47: (iv_ruleEString= ruleEString EOF )
            // InternalEel.g:401:2: iv_ruleEString= ruleEString EOF
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
    // InternalEel.g:407:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalEel.g:413:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalEel.g:414:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalEel.g:414:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalEel.g:415:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEel.g:423:3: this_ID_1= RULE_ID
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
    // InternalEel.g:434:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalEel.g:434:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalEel.g:435:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalEel.g:441:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )? otherlv_5= 'vibility' ( (lv_vibility_6_0= ruleVisibility ) ) otherlv_7= '}' ) ;
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
            // InternalEel.g:447:2: ( (otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )? otherlv_5= 'vibility' ( (lv_vibility_6_0= ruleVisibility ) ) otherlv_7= '}' ) )
            // InternalEel.g:448:2: (otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )? otherlv_5= 'vibility' ( (lv_vibility_6_0= ruleVisibility ) ) otherlv_7= '}' )
            {
            // InternalEel.g:448:2: (otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )? otherlv_5= 'vibility' ( (lv_vibility_6_0= ruleVisibility ) ) otherlv_7= '}' )
            // InternalEel.g:449:3: otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )? otherlv_5= 'vibility' ( (lv_vibility_6_0= ruleVisibility ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariableKeyword_0());
            		
            // InternalEel.g:453:3: ( (lv_name_1_0= ruleEString ) )
            // InternalEel.g:454:4: (lv_name_1_0= ruleEString )
            {
            // InternalEel.g:454:4: (lv_name_1_0= ruleEString )
            // InternalEel.g:455:5: lv_name_1_0= ruleEString
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
            		
            // InternalEel.g:476:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEel.g:477:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEBigDecimal ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getValueKeyword_3_0());
                    			
                    // InternalEel.g:481:4: ( (lv_value_4_0= ruleEBigDecimal ) )
                    // InternalEel.g:482:5: (lv_value_4_0= ruleEBigDecimal )
                    {
                    // InternalEel.g:482:5: (lv_value_4_0= ruleEBigDecimal )
                    // InternalEel.g:483:6: lv_value_4_0= ruleEBigDecimal
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
            		
            // InternalEel.g:505:3: ( (lv_vibility_6_0= ruleVisibility ) )
            // InternalEel.g:506:4: (lv_vibility_6_0= ruleVisibility )
            {
            // InternalEel.g:506:4: (lv_vibility_6_0= ruleVisibility )
            // InternalEel.g:507:5: lv_vibility_6_0= ruleVisibility
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
    // InternalEel.g:532:1: entryRuleEBigDecimal returns [String current=null] : iv_ruleEBigDecimal= ruleEBigDecimal EOF ;
    public final String entryRuleEBigDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBigDecimal = null;


        try {
            // InternalEel.g:532:51: (iv_ruleEBigDecimal= ruleEBigDecimal EOF )
            // InternalEel.g:533:2: iv_ruleEBigDecimal= ruleEBigDecimal EOF
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
    // InternalEel.g:539:1: ruleEBigDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEBigDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalEel.g:545:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalEel.g:546:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalEel.g:546:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalEel.g:547:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalEel.g:547:3: (this_INT_0= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEel.g:548:4: this_INT_0= RULE_INT
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
    // InternalEel.g:572:1: entryRuleMeasureValue_Impl returns [EObject current=null] : iv_ruleMeasureValue_Impl= ruleMeasureValue_Impl EOF ;
    public final EObject entryRuleMeasureValue_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureValue_Impl = null;


        try {
            // InternalEel.g:572:58: (iv_ruleMeasureValue_Impl= ruleMeasureValue_Impl EOF )
            // InternalEel.g:573:2: iv_ruleMeasureValue_Impl= ruleMeasureValue_Impl EOF
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
    // InternalEel.g:579:1: ruleMeasureValue_Impl returns [EObject current=null] : ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( (lv_value_8_0= ruleEBigDecimal ) )? (otherlv_9= 'uncertainty' ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) ) )? ) ;
    public final EObject ruleMeasureValue_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;

        EObject lv_uncertainty_10_0 = null;



        	enterRule();

        try {
            // InternalEel.g:585:2: ( ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( (lv_value_8_0= ruleEBigDecimal ) )? (otherlv_9= 'uncertainty' ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) ) )? ) )
            // InternalEel.g:586:2: ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( (lv_value_8_0= ruleEBigDecimal ) )? (otherlv_9= 'uncertainty' ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) ) )? )
            {
            // InternalEel.g:586:2: ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( (lv_value_8_0= ruleEBigDecimal ) )? (otherlv_9= 'uncertainty' ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) ) )? )
            // InternalEel.g:587:3: () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( (lv_value_8_0= ruleEBigDecimal ) )? (otherlv_9= 'uncertainty' ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) ) )?
            {
            // InternalEel.g:587:3: ()
            // InternalEel.g:588:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureValue_ImplAccess().getMeasureValueAction_0(),
            					current);
            			

            }

            // InternalEel.g:594:3: ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1>=RULE_STRING && LA12_1<=RULE_ID)||(LA12_1>=20 && LA12_1<=21)||(LA12_1>=106 && LA12_1<=112)) ) {
                    alt12=1;
                }
            }
            else if ( (LA12_0==RULE_ID) ) {
                int LA12_2 = input.LA(2);

                if ( ((LA12_2>=RULE_STRING && LA12_2<=RULE_ID)||(LA12_2>=20 && LA12_2<=21)||(LA12_2>=106 && LA12_2<=112)) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalEel.g:595:4: ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )?
                    {
                    // InternalEel.g:595:4: ( ( ruleEString ) )
                    // InternalEel.g:596:5: ( ruleEString )
                    {
                    // InternalEel.g:596:5: ( ruleEString )
                    // InternalEel.g:597:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeasureValue_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getTargetClassEClassCrossReference_1_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:611:4: (otherlv_2= '#' ( ( ruleEString ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==21) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalEel.g:612:5: otherlv_2= '#' ( ( ruleEString ) )
                            {
                            otherlv_2=(Token)match(input,21,FOLLOW_3); 

                            					newLeafNode(otherlv_2, grammarAccess.getMeasureValue_ImplAccess().getNumberSignKeyword_1_1_0());
                            				
                            // InternalEel.g:616:5: ( ( ruleEString ) )
                            // InternalEel.g:617:6: ( ruleEString )
                            {
                            // InternalEel.g:617:6: ( ruleEString )
                            // InternalEel.g:618:7: ruleEString
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMeasureValue_ImplRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getTargetOperationEOperationCrossReference_1_1_1_0());
                            						
                            pushFollow(FOLLOW_9);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEel.g:634:3: (otherlv_4= '.' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEel.g:635:4: otherlv_4= '.'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeasureValue_ImplAccess().getFullStopKeyword_2());
                    			

                    }
                    break;

            }

            // InternalEel.g:640:3: ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=106 && LA14_0<=112)) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalEel.g:641:4: ( (lv_type_5_0= ruleType ) )
                    {
                    // InternalEel.g:641:4: ( (lv_type_5_0= ruleType ) )
                    // InternalEel.g:642:5: (lv_type_5_0= ruleType )
                    {
                    // InternalEel.g:642:5: (lv_type_5_0= ruleType )
                    // InternalEel.g:643:6: lv_type_5_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getTypeTypeEnumRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_19);
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
                    // InternalEel.g:661:4: ( (lv_name_6_0= ruleEString ) )
                    {
                    // InternalEel.g:661:4: ( (lv_name_6_0= ruleEString ) )
                    // InternalEel.g:662:5: (lv_name_6_0= ruleEString )
                    {
                    // InternalEel.g:662:5: (lv_name_6_0= ruleEString )
                    // InternalEel.g:663:6: lv_name_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
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

            otherlv_7=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasureValue_ImplAccess().getEqualsSignKeyword_4());
            		
            // InternalEel.g:685:3: ( (lv_value_8_0= ruleEBigDecimal ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT||LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEel.g:686:4: (lv_value_8_0= ruleEBigDecimal )
                    {
                    // InternalEel.g:686:4: (lv_value_8_0= ruleEBigDecimal )
                    // InternalEel.g:687:5: lv_value_8_0= ruleEBigDecimal
                    {

                    					newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getValueEBigDecimalParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_21);
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

            // InternalEel.g:704:3: (otherlv_9= 'uncertainty' ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEel.g:705:4: otherlv_9= 'uncertainty' ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_9, grammarAccess.getMeasureValue_ImplAccess().getUncertaintyKeyword_6_0());
                    			
                    // InternalEel.g:709:4: ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) )
                    // InternalEel.g:710:5: (lv_uncertainty_10_0= ruleMeasurementUncertainty )
                    {
                    // InternalEel.g:710:5: (lv_uncertainty_10_0= ruleMeasurementUncertainty )
                    // InternalEel.g:711:6: lv_uncertainty_10_0= ruleMeasurementUncertainty
                    {

                    						newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getUncertaintyMeasurementUncertaintyParserRuleCall_6_1_0());
                    					
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
    // InternalEel.g:733:1: entryRuleMeasureOCL returns [EObject current=null] : iv_ruleMeasureOCL= ruleMeasureOCL EOF ;
    public final EObject entryRuleMeasureOCL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureOCL = null;


        try {
            // InternalEel.g:733:51: (iv_ruleMeasureOCL= ruleMeasureOCL EOF )
            // InternalEel.g:734:2: iv_ruleMeasureOCL= ruleMeasureOCL EOF
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
    // InternalEel.g:740:1: ruleMeasureOCL returns [EObject current=null] : ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' otherlv_8= 'ocl:' ( (lv_oclQuery_9_0= ruleEString ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? ) ;
    public final EObject ruleMeasureOCL() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_oclQuery_9_0 = null;

        EObject lv_uncertainty_11_0 = null;



        	enterRule();

        try {
            // InternalEel.g:746:2: ( ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' otherlv_8= 'ocl:' ( (lv_oclQuery_9_0= ruleEString ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? ) )
            // InternalEel.g:747:2: ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' otherlv_8= 'ocl:' ( (lv_oclQuery_9_0= ruleEString ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? )
            {
            // InternalEel.g:747:2: ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' otherlv_8= 'ocl:' ( (lv_oclQuery_9_0= ruleEString ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? )
            // InternalEel.g:748:3: () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' otherlv_8= 'ocl:' ( (lv_oclQuery_9_0= ruleEString ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )?
            {
            // InternalEel.g:748:3: ()
            // InternalEel.g:749:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureOCLAccess().getMeasureOCLAction_0(),
            					current);
            			

            }

            // InternalEel.g:755:3: ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                int LA18_1 = input.LA(2);

                if ( ((LA18_1>=RULE_STRING && LA18_1<=RULE_ID)||(LA18_1>=20 && LA18_1<=21)||(LA18_1>=106 && LA18_1<=112)) ) {
                    alt18=1;
                }
            }
            else if ( (LA18_0==RULE_ID) ) {
                int LA18_2 = input.LA(2);

                if ( ((LA18_2>=RULE_STRING && LA18_2<=RULE_ID)||(LA18_2>=20 && LA18_2<=21)||(LA18_2>=106 && LA18_2<=112)) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalEel.g:756:4: ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )?
                    {
                    // InternalEel.g:756:4: ( ( ruleEString ) )
                    // InternalEel.g:757:5: ( ruleEString )
                    {
                    // InternalEel.g:757:5: ( ruleEString )
                    // InternalEel.g:758:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeasureOCLRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMeasureOCLAccess().getTargetClassEClassCrossReference_1_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:772:4: (otherlv_2= '#' ( ( ruleEString ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==21) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalEel.g:773:5: otherlv_2= '#' ( ( ruleEString ) )
                            {
                            otherlv_2=(Token)match(input,21,FOLLOW_3); 

                            					newLeafNode(otherlv_2, grammarAccess.getMeasureOCLAccess().getNumberSignKeyword_1_1_0());
                            				
                            // InternalEel.g:777:5: ( ( ruleEString ) )
                            // InternalEel.g:778:6: ( ruleEString )
                            {
                            // InternalEel.g:778:6: ( ruleEString )
                            // InternalEel.g:779:7: ruleEString
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMeasureOCLRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getMeasureOCLAccess().getTargetOperationEOperationCrossReference_1_1_1_0());
                            						
                            pushFollow(FOLLOW_9);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEel.g:795:3: (otherlv_4= '.' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEel.g:796:4: otherlv_4= '.'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeasureOCLAccess().getFullStopKeyword_2());
                    			

                    }
                    break;

            }

            // InternalEel.g:801:3: ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=106 && LA20_0<=112)) ) {
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
                    // InternalEel.g:802:4: ( (lv_type_5_0= ruleType ) )
                    {
                    // InternalEel.g:802:4: ( (lv_type_5_0= ruleType ) )
                    // InternalEel.g:803:5: (lv_type_5_0= ruleType )
                    {
                    // InternalEel.g:803:5: (lv_type_5_0= ruleType )
                    // InternalEel.g:804:6: lv_type_5_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureOCLAccess().getTypeTypeEnumRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_19);
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
                    // InternalEel.g:822:4: ( (lv_name_6_0= ruleEString ) )
                    {
                    // InternalEel.g:822:4: ( (lv_name_6_0= ruleEString ) )
                    // InternalEel.g:823:5: (lv_name_6_0= ruleEString )
                    {
                    // InternalEel.g:823:5: (lv_name_6_0= ruleEString )
                    // InternalEel.g:824:6: lv_name_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureOCLAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
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

            otherlv_7=(Token)match(input,22,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasureOCLAccess().getEqualsSignKeyword_4());
            		
            otherlv_8=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureOCLAccess().getOclKeyword_5());
            		
            // InternalEel.g:850:3: ( (lv_oclQuery_9_0= ruleEString ) )
            // InternalEel.g:851:4: (lv_oclQuery_9_0= ruleEString )
            {
            // InternalEel.g:851:4: (lv_oclQuery_9_0= ruleEString )
            // InternalEel.g:852:5: lv_oclQuery_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureOCLAccess().getOclQueryEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalEel.g:869:3: (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEel.g:870:4: otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) )
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getMeasureOCLAccess().getUncertaintyKeyword_7_0());
                    			
                    // InternalEel.g:874:4: ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) )
                    // InternalEel.g:875:5: (lv_uncertainty_11_0= ruleMeasurementUncertainty )
                    {
                    // InternalEel.g:875:5: (lv_uncertainty_11_0= ruleMeasurementUncertainty )
                    // InternalEel.g:876:6: lv_uncertainty_11_0= ruleMeasurementUncertainty
                    {

                    						newCompositeNode(grammarAccess.getMeasureOCLAccess().getUncertaintyMeasurementUncertaintyParserRuleCall_7_1_0());
                    					
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
    // InternalEel.g:905:1: ruleMeasureAttribute returns [EObject current=null] : ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' otherlv_8= 'attribute:' ( ( ruleEString ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? ) ;
    public final EObject ruleMeasureAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_uncertainty_11_0 = null;



        	enterRule();

        try {
            // InternalEel.g:911:2: ( ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' otherlv_8= 'attribute:' ( ( ruleEString ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? ) )
            // InternalEel.g:912:2: ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' otherlv_8= 'attribute:' ( ( ruleEString ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? )
            {
            // InternalEel.g:912:2: ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' otherlv_8= 'attribute:' ( ( ruleEString ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? )
            // InternalEel.g:913:3: () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' otherlv_8= 'attribute:' ( ( ruleEString ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )?
            {
            // InternalEel.g:913:3: ()
            // InternalEel.g:914:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureAttributeAccess().getMeasureAttributeAction_0(),
            					current);
            			

            }

            // InternalEel.g:920:3: ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                int LA23_1 = input.LA(2);

                if ( ((LA23_1>=RULE_STRING && LA23_1<=RULE_ID)||(LA23_1>=20 && LA23_1<=21)||(LA23_1>=106 && LA23_1<=112)) ) {
                    alt23=1;
                }
            }
            else if ( (LA23_0==RULE_ID) ) {
                int LA23_2 = input.LA(2);

                if ( ((LA23_2>=RULE_STRING && LA23_2<=RULE_ID)||(LA23_2>=20 && LA23_2<=21)||(LA23_2>=106 && LA23_2<=112)) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalEel.g:921:4: ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )?
                    {
                    // InternalEel.g:921:4: ( ( ruleEString ) )
                    // InternalEel.g:922:5: ( ruleEString )
                    {
                    // InternalEel.g:922:5: ( ruleEString )
                    // InternalEel.g:923:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeasureAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMeasureAttributeAccess().getTargetClassEClassCrossReference_1_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:937:4: (otherlv_2= '#' ( ( ruleEString ) ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==21) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalEel.g:938:5: otherlv_2= '#' ( ( ruleEString ) )
                            {
                            otherlv_2=(Token)match(input,21,FOLLOW_3); 

                            					newLeafNode(otherlv_2, grammarAccess.getMeasureAttributeAccess().getNumberSignKeyword_1_1_0());
                            				
                            // InternalEel.g:942:5: ( ( ruleEString ) )
                            // InternalEel.g:943:6: ( ruleEString )
                            {
                            // InternalEel.g:943:6: ( ruleEString )
                            // InternalEel.g:944:7: ruleEString
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMeasureAttributeRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getMeasureAttributeAccess().getTargetOperationEOperationCrossReference_1_1_1_0());
                            						
                            pushFollow(FOLLOW_9);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEel.g:960:3: (otherlv_4= '.' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEel.g:961:4: otherlv_4= '.'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeasureAttributeAccess().getFullStopKeyword_2());
                    			

                    }
                    break;

            }

            // InternalEel.g:966:3: ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=106 && LA25_0<=112)) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalEel.g:967:4: ( (lv_type_5_0= ruleType ) )
                    {
                    // InternalEel.g:967:4: ( (lv_type_5_0= ruleType ) )
                    // InternalEel.g:968:5: (lv_type_5_0= ruleType )
                    {
                    // InternalEel.g:968:5: (lv_type_5_0= ruleType )
                    // InternalEel.g:969:6: lv_type_5_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureAttributeAccess().getTypeTypeEnumRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_19);
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
                    // InternalEel.g:987:4: ( (lv_name_6_0= ruleEString ) )
                    {
                    // InternalEel.g:987:4: ( (lv_name_6_0= ruleEString ) )
                    // InternalEel.g:988:5: (lv_name_6_0= ruleEString )
                    {
                    // InternalEel.g:988:5: (lv_name_6_0= ruleEString )
                    // InternalEel.g:989:6: lv_name_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureAttributeAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
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

            otherlv_7=(Token)match(input,22,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasureAttributeAccess().getEqualsSignKeyword_4());
            		
            otherlv_8=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureAttributeAccess().getAttributeKeyword_5());
            		
            // InternalEel.g:1015:3: ( ( ruleEString ) )
            // InternalEel.g:1016:4: ( ruleEString )
            {
            // InternalEel.g:1016:4: ( ruleEString )
            // InternalEel.g:1017:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureAttributeAccess().getAttEAttributeCrossReference_6_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1031:3: (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalEel.g:1032:4: otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) )
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getMeasureAttributeAccess().getUncertaintyKeyword_7_0());
                    			
                    // InternalEel.g:1036:4: ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) )
                    // InternalEel.g:1037:5: (lv_uncertainty_11_0= ruleMeasurementUncertainty )
                    {
                    // InternalEel.g:1037:5: (lv_uncertainty_11_0= ruleMeasurementUncertainty )
                    // InternalEel.g:1038:6: lv_uncertainty_11_0= ruleMeasurementUncertainty
                    {

                    						newCompositeNode(grammarAccess.getMeasureAttributeAccess().getUncertaintyMeasurementUncertaintyParserRuleCall_7_1_0());
                    					
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
    // InternalEel.g:1060:1: entryRuleMeasureCast returns [EObject current=null] : iv_ruleMeasureCast= ruleMeasureCast EOF ;
    public final EObject entryRuleMeasureCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureCast = null;


        try {
            // InternalEel.g:1060:52: (iv_ruleMeasureCast= ruleMeasureCast EOF )
            // InternalEel.g:1061:2: iv_ruleMeasureCast= ruleMeasureCast EOF
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
    // InternalEel.g:1067:1: ruleMeasureCast returns [EObject current=null] : ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' ( ( ruleEString ) ) otherlv_8= 'as' ( (lv_type_9_0= ruleType ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? ) ;
    public final EObject ruleMeasureCast() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        Enumerator lv_type_9_0 = null;

        EObject lv_uncertainty_11_0 = null;



        	enterRule();

        try {
            // InternalEel.g:1073:2: ( ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' ( ( ruleEString ) ) otherlv_8= 'as' ( (lv_type_9_0= ruleType ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? ) )
            // InternalEel.g:1074:2: ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' ( ( ruleEString ) ) otherlv_8= 'as' ( (lv_type_9_0= ruleType ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? )
            {
            // InternalEel.g:1074:2: ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' ( ( ruleEString ) ) otherlv_8= 'as' ( (lv_type_9_0= ruleType ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )? )
            // InternalEel.g:1075:3: () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' ( ( ruleEString ) ) otherlv_8= 'as' ( (lv_type_9_0= ruleType ) ) (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )?
            {
            // InternalEel.g:1075:3: ()
            // InternalEel.g:1076:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureCastAccess().getMeasureCastAction_0(),
            					current);
            			

            }

            // InternalEel.g:1082:3: ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                int LA28_1 = input.LA(2);

                if ( ((LA28_1>=RULE_STRING && LA28_1<=RULE_ID)||(LA28_1>=20 && LA28_1<=21)) ) {
                    alt28=1;
                }
            }
            else if ( (LA28_0==RULE_ID) ) {
                int LA28_2 = input.LA(2);

                if ( ((LA28_2>=RULE_STRING && LA28_2<=RULE_ID)||(LA28_2>=20 && LA28_2<=21)) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalEel.g:1083:4: ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )?
                    {
                    // InternalEel.g:1083:4: ( ( ruleEString ) )
                    // InternalEel.g:1084:5: ( ruleEString )
                    {
                    // InternalEel.g:1084:5: ( ruleEString )
                    // InternalEel.g:1085:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeasureCastRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMeasureCastAccess().getTargetClassEClassCrossReference_1_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:1099:4: (otherlv_2= '#' ( ( ruleEString ) ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==21) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalEel.g:1100:5: otherlv_2= '#' ( ( ruleEString ) )
                            {
                            otherlv_2=(Token)match(input,21,FOLLOW_3); 

                            					newLeafNode(otherlv_2, grammarAccess.getMeasureCastAccess().getNumberSignKeyword_1_1_0());
                            				
                            // InternalEel.g:1104:5: ( ( ruleEString ) )
                            // InternalEel.g:1105:6: ( ruleEString )
                            {
                            // InternalEel.g:1105:6: ( ruleEString )
                            // InternalEel.g:1106:7: ruleEString
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMeasureCastRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getMeasureCastAccess().getTargetOperationEOperationCrossReference_1_1_1_0());
                            						
                            pushFollow(FOLLOW_26);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEel.g:1122:3: (otherlv_4= '.' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==20) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalEel.g:1123:4: otherlv_4= '.'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeasureCastAccess().getFullStopKeyword_2());
                    			

                    }
                    break;

            }

            // InternalEel.g:1128:3: ( (lv_name_5_0= ruleEString ) )
            // InternalEel.g:1129:4: (lv_name_5_0= ruleEString )
            {
            // InternalEel.g:1129:4: (lv_name_5_0= ruleEString )
            // InternalEel.g:1130:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureCastAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
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

            			newLeafNode(otherlv_6, grammarAccess.getMeasureCastAccess().getEqualsSignKeyword_4());
            		
            // InternalEel.g:1151:3: ( ( ruleEString ) )
            // InternalEel.g:1152:4: ( ruleEString )
            {
            // InternalEel.g:1152:4: ( ruleEString )
            // InternalEel.g:1153:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureCastRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureCastAccess().getMeasureMeasureCrossReference_5_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,26,FOLLOW_28); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureCastAccess().getAsKeyword_6());
            		
            // InternalEel.g:1171:3: ( (lv_type_9_0= ruleType ) )
            // InternalEel.g:1172:4: (lv_type_9_0= ruleType )
            {
            // InternalEel.g:1172:4: (lv_type_9_0= ruleType )
            // InternalEel.g:1173:5: lv_type_9_0= ruleType
            {

            					newCompositeNode(grammarAccess.getMeasureCastAccess().getTypeTypeEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalEel.g:1190:3: (otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalEel.g:1191:4: otherlv_10= 'uncertainty' ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) )
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getMeasureCastAccess().getUncertaintyKeyword_8_0());
                    			
                    // InternalEel.g:1195:4: ( (lv_uncertainty_11_0= ruleMeasurementUncertainty ) )
                    // InternalEel.g:1196:5: (lv_uncertainty_11_0= ruleMeasurementUncertainty )
                    {
                    // InternalEel.g:1196:5: (lv_uncertainty_11_0= ruleMeasurementUncertainty )
                    // InternalEel.g:1197:6: lv_uncertainty_11_0= ruleMeasurementUncertainty
                    {

                    						newCompositeNode(grammarAccess.getMeasureCastAccess().getUncertaintyMeasurementUncertaintyParserRuleCall_8_1_0());
                    					
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


    // $ANTLR start "entryRuleMeasureProductOperation_Impl"
    // InternalEel.g:1219:1: entryRuleMeasureProductOperation_Impl returns [EObject current=null] : iv_ruleMeasureProductOperation_Impl= ruleMeasureProductOperation_Impl EOF ;
    public final EObject entryRuleMeasureProductOperation_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureProductOperation_Impl = null;


        try {
            // InternalEel.g:1219:69: (iv_ruleMeasureProductOperation_Impl= ruleMeasureProductOperation_Impl EOF )
            // InternalEel.g:1220:2: iv_ruleMeasureProductOperation_Impl= ruleMeasureProductOperation_Impl EOF
            {
             newCompositeNode(grammarAccess.getMeasureProductOperation_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureProductOperation_Impl=ruleMeasureProductOperation_Impl();

            state._fsp--;

             current =iv_ruleMeasureProductOperation_Impl; 
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
    // $ANTLR end "entryRuleMeasureProductOperation_Impl"


    // $ANTLR start "ruleMeasureProductOperation_Impl"
    // InternalEel.g:1226:1: ruleMeasureProductOperation_Impl returns [EObject current=null] : ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= '*' ( ( ruleEString ) ) (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )? ) ;
    public final EObject ruleMeasureProductOperation_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_uncertainty_12_0 = null;



        	enterRule();

        try {
            // InternalEel.g:1232:2: ( ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= '*' ( ( ruleEString ) ) (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )? ) )
            // InternalEel.g:1233:2: ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= '*' ( ( ruleEString ) ) (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )? )
            {
            // InternalEel.g:1233:2: ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= '*' ( ( ruleEString ) ) (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )? )
            // InternalEel.g:1234:3: () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= '*' ( ( ruleEString ) ) (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )?
            {
            // InternalEel.g:1234:3: ()
            // InternalEel.g:1235:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureProductOperation_ImplAccess().getMeasureBinaryProductOperationAction_0(),
            					current);
            			

            }

            // InternalEel.g:1241:3: ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                int LA32_1 = input.LA(2);

                if ( ((LA32_1>=RULE_STRING && LA32_1<=RULE_ID)||(LA32_1>=20 && LA32_1<=21)||(LA32_1>=106 && LA32_1<=112)) ) {
                    alt32=1;
                }
            }
            else if ( (LA32_0==RULE_ID) ) {
                int LA32_2 = input.LA(2);

                if ( ((LA32_2>=RULE_STRING && LA32_2<=RULE_ID)||(LA32_2>=20 && LA32_2<=21)||(LA32_2>=106 && LA32_2<=112)) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // InternalEel.g:1242:4: ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )?
                    {
                    // InternalEel.g:1242:4: ( ( ruleEString ) )
                    // InternalEel.g:1243:5: ( ruleEString )
                    {
                    // InternalEel.g:1243:5: ( ruleEString )
                    // InternalEel.g:1244:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeasureProductOperation_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMeasureProductOperation_ImplAccess().getTargetClassEClassCrossReference_1_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:1258:4: (otherlv_2= '#' ( ( ruleEString ) ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==21) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalEel.g:1259:5: otherlv_2= '#' ( ( ruleEString ) )
                            {
                            otherlv_2=(Token)match(input,21,FOLLOW_3); 

                            					newLeafNode(otherlv_2, grammarAccess.getMeasureProductOperation_ImplAccess().getNumberSignKeyword_1_1_0());
                            				
                            // InternalEel.g:1263:5: ( ( ruleEString ) )
                            // InternalEel.g:1264:6: ( ruleEString )
                            {
                            // InternalEel.g:1264:6: ( ruleEString )
                            // InternalEel.g:1265:7: ruleEString
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMeasureProductOperation_ImplRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getMeasureProductOperation_ImplAccess().getTargetOperationEOperationCrossReference_1_1_1_0());
                            						
                            pushFollow(FOLLOW_9);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEel.g:1281:3: (otherlv_4= '.' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==20) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalEel.g:1282:4: otherlv_4= '.'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeasureProductOperation_ImplAccess().getFullStopKeyword_2());
                    			

                    }
                    break;

            }

            // InternalEel.g:1287:3: ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=106 && LA34_0<=112)) ) {
                alt34=1;
            }
            else if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_ID)) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalEel.g:1288:4: ( (lv_type_5_0= ruleType ) )
                    {
                    // InternalEel.g:1288:4: ( (lv_type_5_0= ruleType ) )
                    // InternalEel.g:1289:5: (lv_type_5_0= ruleType )
                    {
                    // InternalEel.g:1289:5: (lv_type_5_0= ruleType )
                    // InternalEel.g:1290:6: lv_type_5_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureProductOperation_ImplAccess().getTypeTypeEnumRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_type_5_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureProductOperation_ImplRule());
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
                    // InternalEel.g:1308:4: ( (lv_name_6_0= ruleEString ) )
                    {
                    // InternalEel.g:1308:4: ( (lv_name_6_0= ruleEString ) )
                    // InternalEel.g:1309:5: (lv_name_6_0= ruleEString )
                    {
                    // InternalEel.g:1309:5: (lv_name_6_0= ruleEString )
                    // InternalEel.g:1310:6: lv_name_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureProductOperation_ImplAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_name_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureProductOperation_ImplRule());
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

            			newLeafNode(otherlv_7, grammarAccess.getMeasureProductOperation_ImplAccess().getEqualsSignKeyword_4());
            		
            // InternalEel.g:1332:3: ( ( ruleEString ) )
            // InternalEel.g:1333:4: ( ruleEString )
            {
            // InternalEel.g:1333:4: ( ruleEString )
            // InternalEel.g:1334:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureProductOperation_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureProductOperation_ImplAccess().getLeftMeasureCrossReference_5_0());
            				
            pushFollow(FOLLOW_29);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getMeasureProductOperation_ImplAccess().getAsteriskKeyword_6());
            		
            // InternalEel.g:1352:3: ( ( ruleEString ) )
            // InternalEel.g:1353:4: ( ruleEString )
            {
            // InternalEel.g:1353:4: ( ruleEString )
            // InternalEel.g:1354:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureProductOperation_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureProductOperation_ImplAccess().getRightMeasureCrossReference_7_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1368:3: (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==23) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalEel.g:1369:4: otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) )
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getMeasureProductOperation_ImplAccess().getUncertaintyKeyword_8_0());
                    			
                    // InternalEel.g:1373:4: ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) )
                    // InternalEel.g:1374:5: (lv_uncertainty_12_0= ruleMeasurementUncertainty )
                    {
                    // InternalEel.g:1374:5: (lv_uncertainty_12_0= ruleMeasurementUncertainty )
                    // InternalEel.g:1375:6: lv_uncertainty_12_0= ruleMeasurementUncertainty
                    {

                    						newCompositeNode(grammarAccess.getMeasureProductOperation_ImplAccess().getUncertaintyMeasurementUncertaintyParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_uncertainty_12_0=ruleMeasurementUncertainty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureProductOperation_ImplRule());
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
    // $ANTLR end "ruleMeasureProductOperation_Impl"


    // $ANTLR start "entryRuleMeasureSumOperation"
    // InternalEel.g:1397:1: entryRuleMeasureSumOperation returns [EObject current=null] : iv_ruleMeasureSumOperation= ruleMeasureSumOperation EOF ;
    public final EObject entryRuleMeasureSumOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureSumOperation = null;


        try {
            // InternalEel.g:1397:60: (iv_ruleMeasureSumOperation= ruleMeasureSumOperation EOF )
            // InternalEel.g:1398:2: iv_ruleMeasureSumOperation= ruleMeasureSumOperation EOF
            {
             newCompositeNode(grammarAccess.getMeasureSumOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureSumOperation=ruleMeasureSumOperation();

            state._fsp--;

             current =iv_ruleMeasureSumOperation; 
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
    // $ANTLR end "entryRuleMeasureSumOperation"


    // $ANTLR start "ruleMeasureSumOperation"
    // InternalEel.g:1404:1: ruleMeasureSumOperation returns [EObject current=null] : ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= '+' ( ( ruleEString ) ) (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )? ) ;
    public final EObject ruleMeasureSumOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_uncertainty_12_0 = null;



        	enterRule();

        try {
            // InternalEel.g:1410:2: ( ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= '+' ( ( ruleEString ) ) (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )? ) )
            // InternalEel.g:1411:2: ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= '+' ( ( ruleEString ) ) (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )? )
            {
            // InternalEel.g:1411:2: ( () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= '+' ( ( ruleEString ) ) (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )? )
            // InternalEel.g:1412:3: () ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )? (otherlv_4= '.' )? ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= '+' ( ( ruleEString ) ) (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )?
            {
            // InternalEel.g:1412:3: ()
            // InternalEel.g:1413:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureSumOperationAccess().getMeasureBinarySumOperationAction_0(),
            					current);
            			

            }

            // InternalEel.g:1419:3: ( ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )? )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                int LA37_1 = input.LA(2);

                if ( ((LA37_1>=RULE_STRING && LA37_1<=RULE_ID)||(LA37_1>=20 && LA37_1<=21)||(LA37_1>=106 && LA37_1<=112)) ) {
                    alt37=1;
                }
            }
            else if ( (LA37_0==RULE_ID) ) {
                int LA37_2 = input.LA(2);

                if ( ((LA37_2>=RULE_STRING && LA37_2<=RULE_ID)||(LA37_2>=20 && LA37_2<=21)||(LA37_2>=106 && LA37_2<=112)) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalEel.g:1420:4: ( ( ruleEString ) ) (otherlv_2= '#' ( ( ruleEString ) ) )?
                    {
                    // InternalEel.g:1420:4: ( ( ruleEString ) )
                    // InternalEel.g:1421:5: ( ruleEString )
                    {
                    // InternalEel.g:1421:5: ( ruleEString )
                    // InternalEel.g:1422:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeasureSumOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMeasureSumOperationAccess().getTargetClassEClassCrossReference_1_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:1436:4: (otherlv_2= '#' ( ( ruleEString ) ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==21) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalEel.g:1437:5: otherlv_2= '#' ( ( ruleEString ) )
                            {
                            otherlv_2=(Token)match(input,21,FOLLOW_3); 

                            					newLeafNode(otherlv_2, grammarAccess.getMeasureSumOperationAccess().getNumberSignKeyword_1_1_0());
                            				
                            // InternalEel.g:1441:5: ( ( ruleEString ) )
                            // InternalEel.g:1442:6: ( ruleEString )
                            {
                            // InternalEel.g:1442:6: ( ruleEString )
                            // InternalEel.g:1443:7: ruleEString
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMeasureSumOperationRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getMeasureSumOperationAccess().getTargetOperationEOperationCrossReference_1_1_1_0());
                            						
                            pushFollow(FOLLOW_9);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEel.g:1459:3: (otherlv_4= '.' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==20) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalEel.g:1460:4: otherlv_4= '.'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeasureSumOperationAccess().getFullStopKeyword_2());
                    			

                    }
                    break;

            }

            // InternalEel.g:1465:3: ( ( (lv_type_5_0= ruleType ) ) | ( (lv_name_6_0= ruleEString ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=106 && LA39_0<=112)) ) {
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
                    // InternalEel.g:1466:4: ( (lv_type_5_0= ruleType ) )
                    {
                    // InternalEel.g:1466:4: ( (lv_type_5_0= ruleType ) )
                    // InternalEel.g:1467:5: (lv_type_5_0= ruleType )
                    {
                    // InternalEel.g:1467:5: (lv_type_5_0= ruleType )
                    // InternalEel.g:1468:6: lv_type_5_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureSumOperationAccess().getTypeTypeEnumRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_type_5_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureSumOperationRule());
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
                    // InternalEel.g:1486:4: ( (lv_name_6_0= ruleEString ) )
                    {
                    // InternalEel.g:1486:4: ( (lv_name_6_0= ruleEString ) )
                    // InternalEel.g:1487:5: (lv_name_6_0= ruleEString )
                    {
                    // InternalEel.g:1487:5: (lv_name_6_0= ruleEString )
                    // InternalEel.g:1488:6: lv_name_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureSumOperationAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_name_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureSumOperationRule());
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

            			newLeafNode(otherlv_7, grammarAccess.getMeasureSumOperationAccess().getEqualsSignKeyword_4());
            		
            // InternalEel.g:1510:3: ( ( ruleEString ) )
            // InternalEel.g:1511:4: ( ruleEString )
            {
            // InternalEel.g:1511:4: ( ruleEString )
            // InternalEel.g:1512:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureSumOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureSumOperationAccess().getLeftMeasureCrossReference_5_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getMeasureSumOperationAccess().getPlusSignKeyword_6());
            		
            // InternalEel.g:1530:3: ( ( ruleEString ) )
            // InternalEel.g:1531:4: ( ruleEString )
            {
            // InternalEel.g:1531:4: ( ruleEString )
            // InternalEel.g:1532:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureSumOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureSumOperationAccess().getRightMeasureCrossReference_7_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:1546:3: (otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==23) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalEel.g:1547:4: otherlv_11= 'uncertainty' ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) )
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getMeasureSumOperationAccess().getUncertaintyKeyword_8_0());
                    			
                    // InternalEel.g:1551:4: ( (lv_uncertainty_12_0= ruleMeasurementUncertainty ) )
                    // InternalEel.g:1552:5: (lv_uncertainty_12_0= ruleMeasurementUncertainty )
                    {
                    // InternalEel.g:1552:5: (lv_uncertainty_12_0= ruleMeasurementUncertainty )
                    // InternalEel.g:1553:6: lv_uncertainty_12_0= ruleMeasurementUncertainty
                    {

                    						newCompositeNode(grammarAccess.getMeasureSumOperationAccess().getUncertaintyMeasurementUncertaintyParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_uncertainty_12_0=ruleMeasurementUncertainty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureSumOperationRule());
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
    // $ANTLR end "ruleMeasureSumOperation"


    // $ANTLR start "entryRuleMeasurementUncertainty"
    // InternalEel.g:1575:1: entryRuleMeasurementUncertainty returns [EObject current=null] : iv_ruleMeasurementUncertainty= ruleMeasurementUncertainty EOF ;
    public final EObject entryRuleMeasurementUncertainty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementUncertainty = null;


        try {
            // InternalEel.g:1575:63: (iv_ruleMeasurementUncertainty= ruleMeasurementUncertainty EOF )
            // InternalEel.g:1576:2: iv_ruleMeasurementUncertainty= ruleMeasurementUncertainty EOF
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
    // InternalEel.g:1582:1: ruleMeasurementUncertainty returns [EObject current=null] : ( () otherlv_1= 'MeasurementUncertainty' otherlv_2= '{' (otherlv_3= 'standardUncertainty' ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'information' ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) ) )? otherlv_7= '}' ) ;
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
            // InternalEel.g:1588:2: ( ( () otherlv_1= 'MeasurementUncertainty' otherlv_2= '{' (otherlv_3= 'standardUncertainty' ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'information' ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) ) )? otherlv_7= '}' ) )
            // InternalEel.g:1589:2: ( () otherlv_1= 'MeasurementUncertainty' otherlv_2= '{' (otherlv_3= 'standardUncertainty' ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'information' ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) ) )? otherlv_7= '}' )
            {
            // InternalEel.g:1589:2: ( () otherlv_1= 'MeasurementUncertainty' otherlv_2= '{' (otherlv_3= 'standardUncertainty' ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'information' ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) ) )? otherlv_7= '}' )
            // InternalEel.g:1590:3: () otherlv_1= 'MeasurementUncertainty' otherlv_2= '{' (otherlv_3= 'standardUncertainty' ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'information' ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) ) )? otherlv_7= '}'
            {
            // InternalEel.g:1590:3: ()
            // InternalEel.g:1591:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasurementUncertaintyAccess().getMeasurementUncertaintyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMeasurementUncertaintyAccess().getMeasurementUncertaintyKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getMeasurementUncertaintyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:1605:3: (otherlv_3= 'standardUncertainty' ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==30) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalEel.g:1606:4: otherlv_3= 'standardUncertainty' ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasurementUncertaintyAccess().getStandardUncertaintyKeyword_3_0());
                    			
                    // InternalEel.g:1610:4: ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) )
                    // InternalEel.g:1611:5: (lv_standardUncertainty_4_0= ruleEBigDecimal )
                    {
                    // InternalEel.g:1611:5: (lv_standardUncertainty_4_0= ruleEBigDecimal )
                    // InternalEel.g:1612:6: lv_standardUncertainty_4_0= ruleEBigDecimal
                    {

                    						newCompositeNode(grammarAccess.getMeasurementUncertaintyAccess().getStandardUncertaintyEBigDecimalParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_32);
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

            // InternalEel.g:1630:3: (otherlv_5= 'information' ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==31) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalEel.g:1631:4: otherlv_5= 'information' ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_33); 

                    				newLeafNode(otherlv_5, grammarAccess.getMeasurementUncertaintyAccess().getInformationKeyword_4_0());
                    			
                    // InternalEel.g:1635:4: ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) )
                    // InternalEel.g:1636:5: (lv_information_6_0= ruleMeasurementUncertaintyInformation )
                    {
                    // InternalEel.g:1636:5: (lv_information_6_0= ruleMeasurementUncertaintyInformation )
                    // InternalEel.g:1637:6: lv_information_6_0= ruleMeasurementUncertaintyInformation
                    {

                    						newCompositeNode(grammarAccess.getMeasurementUncertaintyAccess().getInformationMeasurementUncertaintyInformationParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
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
    // InternalEel.g:1663:1: entryRuleNormalDistribution returns [EObject current=null] : iv_ruleNormalDistribution= ruleNormalDistribution EOF ;
    public final EObject entryRuleNormalDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalDistribution = null;


        try {
            // InternalEel.g:1663:59: (iv_ruleNormalDistribution= ruleNormalDistribution EOF )
            // InternalEel.g:1664:2: iv_ruleNormalDistribution= ruleNormalDistribution EOF
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
    // InternalEel.g:1670:1: ruleNormalDistribution returns [EObject current=null] : ( () otherlv_1= 'NormalDistribution' ) ;
    public final EObject ruleNormalDistribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEel.g:1676:2: ( ( () otherlv_1= 'NormalDistribution' ) )
            // InternalEel.g:1677:2: ( () otherlv_1= 'NormalDistribution' )
            {
            // InternalEel.g:1677:2: ( () otherlv_1= 'NormalDistribution' )
            // InternalEel.g:1678:3: () otherlv_1= 'NormalDistribution'
            {
            // InternalEel.g:1678:3: ()
            // InternalEel.g:1679:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNormalDistributionAccess().getNormalDistributionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

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
    // InternalEel.g:1693:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalEel.g:1693:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalEel.g:1694:2: iv_ruleInterval= ruleInterval EOF
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
    // InternalEel.g:1700:1: ruleInterval returns [EObject current=null] : (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' ) ;
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
            // InternalEel.g:1706:2: ( (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' ) )
            // InternalEel.g:1707:2: (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' )
            {
            // InternalEel.g:1707:2: (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' )
            // InternalEel.g:1708:3: otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIntervalAccess().getIntervalKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getIntervalAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getIntervalAccess().getLowerEndpointKeyword_2());
            		
            // InternalEel.g:1720:3: ( (lv_lowerEndpoint_3_0= ruleMeasure ) )
            // InternalEel.g:1721:4: (lv_lowerEndpoint_3_0= ruleMeasure )
            {
            // InternalEel.g:1721:4: (lv_lowerEndpoint_3_0= ruleMeasure )
            // InternalEel.g:1722:5: lv_lowerEndpoint_3_0= ruleMeasure
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getLowerEndpointMeasureParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
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

            otherlv_4=(Token)match(input,35,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getIntervalAccess().getUpperEndpointKeyword_4());
            		
            // InternalEel.g:1743:3: ( (lv_upperEndpoint_5_0= ruleMeasure ) )
            // InternalEel.g:1744:4: (lv_upperEndpoint_5_0= ruleMeasure )
            {
            // InternalEel.g:1744:4: (lv_upperEndpoint_5_0= ruleMeasure )
            // InternalEel.g:1745:5: lv_upperEndpoint_5_0= ruleMeasure
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
    // InternalEel.g:1770:1: entryRuleSampling returns [EObject current=null] : iv_ruleSampling= ruleSampling EOF ;
    public final EObject entryRuleSampling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSampling = null;


        try {
            // InternalEel.g:1770:49: (iv_ruleSampling= ruleSampling EOF )
            // InternalEel.g:1771:2: iv_ruleSampling= ruleSampling EOF
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
    // InternalEel.g:1777:1: ruleSampling returns [EObject current=null] : ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalEel.g:1783:2: ( ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalEel.g:1784:2: ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalEel.g:1784:2: ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalEel.g:1785:3: () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalEel.g:1785:3: ()
            // InternalEel.g:1786:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSamplingAccess().getSamplingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSamplingAccess().getSamplingKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getSamplingAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:1800:3: (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==37) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalEel.g:1801:4: otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSamplingAccess().getMeasurementProcedureKeyword_3_0());
                    			
                    // InternalEel.g:1805:4: ( (lv_measurementProcedure_4_0= ruleEString ) )
                    // InternalEel.g:1806:5: (lv_measurementProcedure_4_0= ruleEString )
                    {
                    // InternalEel.g:1806:5: (lv_measurementProcedure_4_0= ruleEString )
                    // InternalEel.g:1807:6: lv_measurementProcedure_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSamplingAccess().getMeasurementProcedureEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_37);
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

            // InternalEel.g:1825:3: (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==38) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalEel.g:1826:4: otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getSamplingAccess().getSamplesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getSamplingAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalEel.g:1834:4: ( (lv_samples_7_0= ruleSample ) )
                    // InternalEel.g:1835:5: (lv_samples_7_0= ruleSample )
                    {
                    // InternalEel.g:1835:5: (lv_samples_7_0= ruleSample )
                    // InternalEel.g:1836:6: lv_samples_7_0= ruleSample
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

                    // InternalEel.g:1853:4: (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==14) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalEel.g:1854:5: otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_38); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSamplingAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalEel.g:1858:5: ( (lv_samples_9_0= ruleSample ) )
                    	    // InternalEel.g:1859:6: (lv_samples_9_0= ruleSample )
                    	    {
                    	    // InternalEel.g:1859:6: (lv_samples_9_0= ruleSample )
                    	    // InternalEel.g:1860:7: lv_samples_9_0= ruleSample
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
                    	    break loop44;
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
    // InternalEel.g:1891:1: entryRuleIntegral returns [EObject current=null] : iv_ruleIntegral= ruleIntegral EOF ;
    public final EObject entryRuleIntegral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegral = null;


        try {
            // InternalEel.g:1891:49: (iv_ruleIntegral= ruleIntegral EOF )
            // InternalEel.g:1892:2: iv_ruleIntegral= ruleIntegral EOF
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
    // InternalEel.g:1898:1: ruleIntegral returns [EObject current=null] : (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' ) ;
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
            // InternalEel.g:1904:2: ( (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalEel.g:1905:2: (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalEel.g:1905:2: (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalEel.g:1906:3: otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIntegralAccess().getIntegralKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegralAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalEel.g:1914:3: (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==40) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalEel.g:1915:4: otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getIntegralAccess().getFunctionKeyword_2_0());
                    			
                    // InternalEel.g:1919:4: ( (lv_function_3_0= ruleEString ) )
                    // InternalEel.g:1920:5: (lv_function_3_0= ruleEString )
                    {
                    // InternalEel.g:1920:5: (lv_function_3_0= ruleEString )
                    // InternalEel.g:1921:6: lv_function_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIntegralAccess().getFunctionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_40);
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

            otherlv_4=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getIntegralAccess().getIntervalKeyword_3());
            		
            // InternalEel.g:1943:3: ( ( ruleEString ) )
            // InternalEel.g:1944:4: ( ruleEString )
            {
            // InternalEel.g:1944:4: ( ruleEString )
            // InternalEel.g:1945:5: ruleEString
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
    // InternalEel.g:1967:1: entryRuleSample returns [EObject current=null] : iv_ruleSample= ruleSample EOF ;
    public final EObject entryRuleSample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSample = null;


        try {
            // InternalEel.g:1967:47: (iv_ruleSample= ruleSample EOF )
            // InternalEel.g:1968:2: iv_ruleSample= ruleSample EOF
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
    // InternalEel.g:1974:1: ruleSample returns [EObject current=null] : ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalEel.g:1980:2: ( ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalEel.g:1981:2: ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalEel.g:1981:2: ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalEel.g:1982:3: () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalEel.g:1982:3: ()
            // InternalEel.g:1983:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSampleAccess().getSampleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSampleAccess().getSampleKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getSampleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:1997:3: (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==43) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalEel.g:1998:4: otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSampleAccess().getQuantityKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getSampleAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalEel.g:2006:4: ( (lv_quantity_5_0= ruleMeasure ) )
                    // InternalEel.g:2007:5: (lv_quantity_5_0= ruleMeasure )
                    {
                    // InternalEel.g:2007:5: (lv_quantity_5_0= ruleMeasure )
                    // InternalEel.g:2008:6: lv_quantity_5_0= ruleMeasure
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

                    // InternalEel.g:2025:4: (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==14) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalEel.g:2026:5: otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSampleAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalEel.g:2030:5: ( (lv_quantity_7_0= ruleMeasure ) )
                    	    // InternalEel.g:2031:6: (lv_quantity_7_0= ruleMeasure )
                    	    {
                    	    // InternalEel.g:2031:6: (lv_quantity_7_0= ruleMeasure )
                    	    // InternalEel.g:2032:7: lv_quantity_7_0= ruleMeasure
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
                    	    break loop47;
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


    // $ANTLR start "entryRuleEClass"
    // InternalEel.g:2063:1: entryRuleEClass returns [EObject current=null] : iv_ruleEClass= ruleEClass EOF ;
    public final EObject entryRuleEClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClass = null;


        try {
            // InternalEel.g:2063:47: (iv_ruleEClass= ruleEClass EOF )
            // InternalEel.g:2064:2: iv_ruleEClass= ruleEClass EOF
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
    // InternalEel.g:2070:1: ruleEClass returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
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
            // InternalEel.g:2076:2: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // InternalEel.g:2077:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // InternalEel.g:2077:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // InternalEel.g:2078:3: () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // InternalEel.g:2078:3: ()
            // InternalEel.g:2079:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEClassAccess().getEClassAction_0(),
            					current);
            			

            }

            // InternalEel.g:2085:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==44) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalEel.g:2086:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalEel.g:2086:4: (lv_abstract_1_0= 'abstract' )
                    // InternalEel.g:2087:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,44,FOLLOW_42); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getEClassAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:2099:3: ( (lv_interface_2_0= 'interface' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==45) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalEel.g:2100:4: (lv_interface_2_0= 'interface' )
                    {
                    // InternalEel.g:2100:4: (lv_interface_2_0= 'interface' )
                    // InternalEel.g:2101:5: lv_interface_2_0= 'interface'
                    {
                    lv_interface_2_0=(Token)match(input,45,FOLLOW_43); 

                    					newLeafNode(lv_interface_2_0, grammarAccess.getEClassAccess().getInterfaceInterfaceKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEClassRule());
                    					}
                    					setWithLastConsumed(current, "interface", true, "interface");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getEClassAccess().getEClassKeyword_3());
            		
            // InternalEel.g:2117:3: ( (lv_name_4_0= ruleEString ) )
            // InternalEel.g:2118:4: (lv_name_4_0= ruleEString )
            {
            // InternalEel.g:2118:4: (lv_name_4_0= ruleEString )
            // InternalEel.g:2119:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_5, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalEel.g:2140:3: (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==47) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalEel.g:2141:4: otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEClassAccess().getInstanceClassNameKeyword_6_0());
                    			
                    // InternalEel.g:2145:4: ( (lv_instanceClassName_7_0= ruleEString ) )
                    // InternalEel.g:2146:5: (lv_instanceClassName_7_0= ruleEString )
                    {
                    // InternalEel.g:2146:5: (lv_instanceClassName_7_0= ruleEString )
                    // InternalEel.g:2147:6: lv_instanceClassName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getInstanceClassNameEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_45);
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

            // InternalEel.g:2165:3: (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==48) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalEel.g:2166:4: otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getEClassAccess().getInstanceTypeNameKeyword_7_0());
                    			
                    // InternalEel.g:2170:4: ( (lv_instanceTypeName_9_0= ruleEString ) )
                    // InternalEel.g:2171:5: (lv_instanceTypeName_9_0= ruleEString )
                    {
                    // InternalEel.g:2171:5: (lv_instanceTypeName_9_0= ruleEString )
                    // InternalEel.g:2172:6: lv_instanceTypeName_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getInstanceTypeNameEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_46);
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

            // InternalEel.g:2190:3: (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==49) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalEel.g:2191:4: otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,49,FOLLOW_47); 

                    				newLeafNode(otherlv_10, grammarAccess.getEClassAccess().getESuperTypesKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,50,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getEClassAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalEel.g:2199:4: ( ( ruleEString ) )
                    // InternalEel.g:2200:5: ( ruleEString )
                    {
                    // InternalEel.g:2200:5: ( ruleEString )
                    // InternalEel.g:2201:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_48);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:2215:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==14) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalEel.g:2216:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEClassAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalEel.g:2220:5: ( ( ruleEString ) )
                    	    // InternalEel.g:2221:6: ( ruleEString )
                    	    {
                    	    // InternalEel.g:2221:6: ( ruleEString )
                    	    // InternalEel.g:2222:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_48);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,51,FOLLOW_49); 

                    				newLeafNode(otherlv_15, grammarAccess.getEClassAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:2242:3: (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==52) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalEel.g:2243:4: otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEClassAccess().getEAnnotationsKeyword_9_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_17, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalEel.g:2251:4: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    // InternalEel.g:2252:5: (lv_eAnnotations_18_0= ruleEAnnotation )
                    {
                    // InternalEel.g:2252:5: (lv_eAnnotations_18_0= ruleEAnnotation )
                    // InternalEel.g:2253:6: lv_eAnnotations_18_0= ruleEAnnotation
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

                    // InternalEel.g:2270:4: (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==14) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalEel.g:2271:5: otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_50); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEClassAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalEel.g:2275:5: ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    // InternalEel.g:2276:6: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:2276:6: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    // InternalEel.g:2277:7: lv_eAnnotations_20_0= ruleEAnnotation
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
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_51); 

                    				newLeafNode(otherlv_21, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:2300:3: (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==53) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalEel.g:2301:4: otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getEClassAccess().getETypeParametersKeyword_10_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_52); 

                    				newLeafNode(otherlv_23, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalEel.g:2309:4: ( (lv_eTypeParameters_24_0= ruleETypeParameter ) )
                    // InternalEel.g:2310:5: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    {
                    // InternalEel.g:2310:5: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    // InternalEel.g:2311:6: lv_eTypeParameters_24_0= ruleETypeParameter
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

                    // InternalEel.g:2328:4: (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==14) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalEel.g:2329:5: otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_52); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getEClassAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalEel.g:2333:5: ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    // InternalEel.g:2334:6: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    {
                    	    // InternalEel.g:2334:6: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    // InternalEel.g:2335:7: lv_eTypeParameters_26_0= ruleETypeParameter
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
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_53); 

                    				newLeafNode(otherlv_27, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:2358:3: (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==54) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalEel.g:2359:4: otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,54,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getEClassAccess().getEOperationsKeyword_11_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_54); 

                    				newLeafNode(otherlv_29, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalEel.g:2367:4: ( (lv_eOperations_30_0= ruleEOperation ) )
                    // InternalEel.g:2368:5: (lv_eOperations_30_0= ruleEOperation )
                    {
                    // InternalEel.g:2368:5: (lv_eOperations_30_0= ruleEOperation )
                    // InternalEel.g:2369:6: lv_eOperations_30_0= ruleEOperation
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

                    // InternalEel.g:2386:4: (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==14) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalEel.g:2387:5: otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    {
                    	    otherlv_31=(Token)match(input,14,FOLLOW_54); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getEClassAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalEel.g:2391:5: ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    // InternalEel.g:2392:6: (lv_eOperations_32_0= ruleEOperation )
                    	    {
                    	    // InternalEel.g:2392:6: (lv_eOperations_32_0= ruleEOperation )
                    	    // InternalEel.g:2393:7: lv_eOperations_32_0= ruleEOperation
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
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,15,FOLLOW_55); 

                    				newLeafNode(otherlv_33, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:2416:3: (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==55) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalEel.g:2417:4: otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,55,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getEClassAccess().getEStructuralFeaturesKeyword_12_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_56); 

                    				newLeafNode(otherlv_35, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalEel.g:2425:4: ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) )
                    // InternalEel.g:2426:5: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    {
                    // InternalEel.g:2426:5: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    // InternalEel.g:2427:6: lv_eStructuralFeatures_36_0= ruleEStructuralFeature
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

                    // InternalEel.g:2444:4: (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==14) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalEel.g:2445:5: otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    {
                    	    otherlv_37=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getEClassAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalEel.g:2449:5: ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    // InternalEel.g:2450:6: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    {
                    	    // InternalEel.g:2450:6: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    // InternalEel.g:2451:7: lv_eStructuralFeatures_38_0= ruleEStructuralFeature
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
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,15,FOLLOW_57); 

                    				newLeafNode(otherlv_39, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:2474:3: (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==56) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalEel.g:2475:4: otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,56,FOLLOW_4); 

                    				newLeafNode(otherlv_40, grammarAccess.getEClassAccess().getEGenericSuperTypesKeyword_13_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_58); 

                    				newLeafNode(otherlv_41, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalEel.g:2483:4: ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) )
                    // InternalEel.g:2484:5: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    {
                    // InternalEel.g:2484:5: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    // InternalEel.g:2485:6: lv_eGenericSuperTypes_42_0= ruleEGenericType
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

                    // InternalEel.g:2502:4: (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==14) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalEel.g:2503:5: otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,14,FOLLOW_58); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getEClassAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalEel.g:2507:5: ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    // InternalEel.g:2508:6: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    {
                    	    // InternalEel.g:2508:6: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    // InternalEel.g:2509:7: lv_eGenericSuperTypes_44_0= ruleEGenericType
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
                    	    break loop63;
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
    // InternalEel.g:2540:1: entryRuleEOperation returns [EObject current=null] : iv_ruleEOperation= ruleEOperation EOF ;
    public final EObject entryRuleEOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperation = null;


        try {
            // InternalEel.g:2540:51: (iv_ruleEOperation= ruleEOperation EOF )
            // InternalEel.g:2541:2: iv_ruleEOperation= ruleEOperation EOF
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
    // InternalEel.g:2547:1: ruleEOperation returns [EObject current=null] : ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
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
            // InternalEel.g:2553:2: ( ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // InternalEel.g:2554:2: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // InternalEel.g:2554:2: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // InternalEel.g:2555:3: () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // InternalEel.g:2555:3: ()
            // InternalEel.g:2556:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOperationAccess().getEOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEOperationAccess().getEOperationKeyword_1());
            		
            // InternalEel.g:2566:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:2567:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:2567:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:2568:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_3, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:2589:3: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==58) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalEel.g:2590:4: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,58,FOLLOW_60); 

                    				newLeafNode(otherlv_4, grammarAccess.getEOperationAccess().getOrderedKeyword_4_0());
                    			
                    // InternalEel.g:2594:4: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // InternalEel.g:2595:5: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // InternalEel.g:2595:5: (lv_ordered_5_0= ruleEBoolean )
                    // InternalEel.g:2596:6: lv_ordered_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getOrderedEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_61);
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

            // InternalEel.g:2614:3: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==59) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalEel.g:2615:4: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,59,FOLLOW_60); 

                    				newLeafNode(otherlv_6, grammarAccess.getEOperationAccess().getUniqueKeyword_5_0());
                    			
                    // InternalEel.g:2619:4: ( (lv_unique_7_0= ruleEBoolean ) )
                    // InternalEel.g:2620:5: (lv_unique_7_0= ruleEBoolean )
                    {
                    // InternalEel.g:2620:5: (lv_unique_7_0= ruleEBoolean )
                    // InternalEel.g:2621:6: lv_unique_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getUniqueEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_62);
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

            // InternalEel.g:2639:3: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==60) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalEel.g:2640:4: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,60,FOLLOW_63); 

                    				newLeafNode(otherlv_8, grammarAccess.getEOperationAccess().getLowerBoundKeyword_6_0());
                    			
                    // InternalEel.g:2644:4: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // InternalEel.g:2645:5: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // InternalEel.g:2645:5: (lv_lowerBound_9_0= ruleEInt )
                    // InternalEel.g:2646:6: lv_lowerBound_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getLowerBoundEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_64);
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

            // InternalEel.g:2664:3: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==61) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalEel.g:2665:4: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,61,FOLLOW_63); 

                    				newLeafNode(otherlv_10, grammarAccess.getEOperationAccess().getUpperBoundKeyword_7_0());
                    			
                    // InternalEel.g:2669:4: ( (lv_upperBound_11_0= ruleEInt ) )
                    // InternalEel.g:2670:5: (lv_upperBound_11_0= ruleEInt )
                    {
                    // InternalEel.g:2670:5: (lv_upperBound_11_0= ruleEInt )
                    // InternalEel.g:2671:6: lv_upperBound_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getUpperBoundEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_65);
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

            // InternalEel.g:2689:3: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==62) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalEel.g:2690:4: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getEOperationAccess().getETypeKeyword_8_0());
                    			
                    // InternalEel.g:2694:4: ( ( ruleEString ) )
                    // InternalEel.g:2695:5: ( ruleEString )
                    {
                    // InternalEel.g:2695:5: ( ruleEString )
                    // InternalEel.g:2696:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEOperationAccess().getETypeEClassifierCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_66);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2711:3: (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==63) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalEel.g:2712:4: otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')'
                    {
                    otherlv_14=(Token)match(input,63,FOLLOW_47); 

                    				newLeafNode(otherlv_14, grammarAccess.getEOperationAccess().getEExceptionsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,50,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getEOperationAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalEel.g:2720:4: ( ( ruleEString ) )
                    // InternalEel.g:2721:5: ( ruleEString )
                    {
                    // InternalEel.g:2721:5: ( ruleEString )
                    // InternalEel.g:2722:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_48);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:2736:4: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==14) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalEel.g:2737:5: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEOperationAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalEel.g:2741:5: ( ( ruleEString ) )
                    	    // InternalEel.g:2742:6: ( ruleEString )
                    	    {
                    	    // InternalEel.g:2742:6: ( ruleEString )
                    	    // InternalEel.g:2743:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEOperationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_48);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,51,FOLLOW_67); 

                    				newLeafNode(otherlv_19, grammarAccess.getEOperationAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:2763:3: (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==52) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalEel.g:2764:4: otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getEOperationAccess().getEAnnotationsKeyword_10_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_21, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalEel.g:2772:4: ( (lv_eAnnotations_22_0= ruleEAnnotation ) )
                    // InternalEel.g:2773:5: (lv_eAnnotations_22_0= ruleEAnnotation )
                    {
                    // InternalEel.g:2773:5: (lv_eAnnotations_22_0= ruleEAnnotation )
                    // InternalEel.g:2774:6: lv_eAnnotations_22_0= ruleEAnnotation
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

                    // InternalEel.g:2791:4: (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==14) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalEel.g:2792:5: otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_23=(Token)match(input,14,FOLLOW_50); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getEOperationAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalEel.g:2796:5: ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    // InternalEel.g:2797:6: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:2797:6: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    // InternalEel.g:2798:7: lv_eAnnotations_24_0= ruleEAnnotation
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
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,15,FOLLOW_68); 

                    				newLeafNode(otherlv_25, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:2821:3: (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==64) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalEel.g:2822:4: otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    {
                    otherlv_26=(Token)match(input,64,FOLLOW_58); 

                    				newLeafNode(otherlv_26, grammarAccess.getEOperationAccess().getEGenericTypeKeyword_11_0());
                    			
                    // InternalEel.g:2826:4: ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    // InternalEel.g:2827:5: (lv_eGenericType_27_0= ruleEGenericType )
                    {
                    // InternalEel.g:2827:5: (lv_eGenericType_27_0= ruleEGenericType )
                    // InternalEel.g:2828:6: lv_eGenericType_27_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEGenericTypeEGenericTypeParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_69);
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

            // InternalEel.g:2846:3: (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==53) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalEel.g:2847:4: otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getEOperationAccess().getETypeParametersKeyword_12_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_52); 

                    				newLeafNode(otherlv_29, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalEel.g:2855:4: ( (lv_eTypeParameters_30_0= ruleETypeParameter ) )
                    // InternalEel.g:2856:5: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    {
                    // InternalEel.g:2856:5: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    // InternalEel.g:2857:6: lv_eTypeParameters_30_0= ruleETypeParameter
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

                    // InternalEel.g:2874:4: (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==14) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // InternalEel.g:2875:5: otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_31=(Token)match(input,14,FOLLOW_52); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getEOperationAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalEel.g:2879:5: ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    // InternalEel.g:2880:6: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    {
                    	    // InternalEel.g:2880:6: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    // InternalEel.g:2881:7: lv_eTypeParameters_32_0= ruleETypeParameter
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
                    	    break loop75;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,15,FOLLOW_70); 

                    				newLeafNode(otherlv_33, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:2904:3: (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==65) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalEel.g:2905:4: otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,65,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getEOperationAccess().getEParametersKeyword_13_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_71); 

                    				newLeafNode(otherlv_35, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalEel.g:2913:4: ( (lv_eParameters_36_0= ruleEParameter ) )
                    // InternalEel.g:2914:5: (lv_eParameters_36_0= ruleEParameter )
                    {
                    // InternalEel.g:2914:5: (lv_eParameters_36_0= ruleEParameter )
                    // InternalEel.g:2915:6: lv_eParameters_36_0= ruleEParameter
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

                    // InternalEel.g:2932:4: (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==14) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalEel.g:2933:5: otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    {
                    	    otherlv_37=(Token)match(input,14,FOLLOW_71); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getEOperationAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalEel.g:2937:5: ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    // InternalEel.g:2938:6: (lv_eParameters_38_0= ruleEParameter )
                    	    {
                    	    // InternalEel.g:2938:6: (lv_eParameters_38_0= ruleEParameter )
                    	    // InternalEel.g:2939:7: lv_eParameters_38_0= ruleEParameter
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
                    	    break loop77;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,15,FOLLOW_72); 

                    				newLeafNode(otherlv_39, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:2962:3: (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==66) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalEel.g:2963:4: otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,66,FOLLOW_4); 

                    				newLeafNode(otherlv_40, grammarAccess.getEOperationAccess().getEGenericExceptionsKeyword_14_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_58); 

                    				newLeafNode(otherlv_41, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalEel.g:2971:4: ( (lv_eGenericExceptions_42_0= ruleEGenericType ) )
                    // InternalEel.g:2972:5: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    {
                    // InternalEel.g:2972:5: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    // InternalEel.g:2973:6: lv_eGenericExceptions_42_0= ruleEGenericType
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

                    // InternalEel.g:2990:4: (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==14) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalEel.g:2991:5: otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,14,FOLLOW_58); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getEOperationAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalEel.g:2995:5: ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    // InternalEel.g:2996:6: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    {
                    	    // InternalEel.g:2996:6: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    // InternalEel.g:2997:7: lv_eGenericExceptions_44_0= ruleEGenericType
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
                    	    break loop79;
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
    // InternalEel.g:3028:1: entryRuleEAnnotation returns [EObject current=null] : iv_ruleEAnnotation= ruleEAnnotation EOF ;
    public final EObject entryRuleEAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAnnotation = null;


        try {
            // InternalEel.g:3028:52: (iv_ruleEAnnotation= ruleEAnnotation EOF )
            // InternalEel.g:3029:2: iv_ruleEAnnotation= ruleEAnnotation EOF
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
    // InternalEel.g:3035:1: ruleEAnnotation returns [EObject current=null] : ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
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
            // InternalEel.g:3041:2: ( ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // InternalEel.g:3042:2: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // InternalEel.g:3042:2: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // InternalEel.g:3043:3: () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // InternalEel.g:3043:3: ()
            // InternalEel.g:3044:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAnnotationAccess().getEAnnotationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEAnnotationAccess().getEAnnotationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_73); 

            			newLeafNode(otherlv_2, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:3058:3: (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==68) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalEel.g:3059:4: otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,68,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEAnnotationAccess().getSourceKeyword_3_0());
                    			
                    // InternalEel.g:3063:4: ( (lv_source_4_0= ruleEString ) )
                    // InternalEel.g:3064:5: (lv_source_4_0= ruleEString )
                    {
                    // InternalEel.g:3064:5: (lv_source_4_0= ruleEString )
                    // InternalEel.g:3065:6: lv_source_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getSourceEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_74);
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

            // InternalEel.g:3083:3: (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==69) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalEel.g:3084:4: otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,69,FOLLOW_47); 

                    				newLeafNode(otherlv_5, grammarAccess.getEAnnotationAccess().getReferencesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,50,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEAnnotationAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalEel.g:3092:4: ( ( ruleEString ) )
                    // InternalEel.g:3093:5: ( ruleEString )
                    {
                    // InternalEel.g:3093:5: ( ruleEString )
                    // InternalEel.g:3094:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAnnotationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_48);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:3108:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==14) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // InternalEel.g:3109:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEAnnotationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalEel.g:3113:5: ( ( ruleEString ) )
                    	    // InternalEel.g:3114:6: ( ruleEString )
                    	    {
                    	    // InternalEel.g:3114:6: ( ruleEString )
                    	    // InternalEel.g:3115:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAnnotationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_48);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,51,FOLLOW_75); 

                    				newLeafNode(otherlv_10, grammarAccess.getEAnnotationAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3135:3: (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==52) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalEel.g:3136:4: otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getEAnnotationAccess().getEAnnotationsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_12, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalEel.g:3144:4: ( (lv_eAnnotations_13_0= ruleEAnnotation ) )
                    // InternalEel.g:3145:5: (lv_eAnnotations_13_0= ruleEAnnotation )
                    {
                    // InternalEel.g:3145:5: (lv_eAnnotations_13_0= ruleEAnnotation )
                    // InternalEel.g:3146:6: lv_eAnnotations_13_0= ruleEAnnotation
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

                    // InternalEel.g:3163:4: (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==14) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalEel.g:3164:5: otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_50); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getEAnnotationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalEel.g:3168:5: ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    // InternalEel.g:3169:6: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:3169:6: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    // InternalEel.g:3170:7: lv_eAnnotations_15_0= ruleEAnnotation
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
                    	    break loop84;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,15,FOLLOW_76); 

                    				newLeafNode(otherlv_16, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3193:3: (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==70) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalEel.g:3194:4: otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,70,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getEAnnotationAccess().getDetailsKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_77); 

                    				newLeafNode(otherlv_18, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalEel.g:3202:4: ( (lv_details_19_0= ruleEStringToStringMapEntry ) )
                    // InternalEel.g:3203:5: (lv_details_19_0= ruleEStringToStringMapEntry )
                    {
                    // InternalEel.g:3203:5: (lv_details_19_0= ruleEStringToStringMapEntry )
                    // InternalEel.g:3204:6: lv_details_19_0= ruleEStringToStringMapEntry
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

                    // InternalEel.g:3221:4: (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==14) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // InternalEel.g:3222:5: otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FOLLOW_77); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getEAnnotationAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalEel.g:3226:5: ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    // InternalEel.g:3227:6: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    {
                    	    // InternalEel.g:3227:6: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    // InternalEel.g:3228:7: lv_details_21_0= ruleEStringToStringMapEntry
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
                    	    break loop86;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,15,FOLLOW_78); 

                    				newLeafNode(otherlv_22, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3251:3: (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==71) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalEel.g:3252:4: otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,71,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getEAnnotationAccess().getContentsKeyword_7_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_79); 

                    				newLeafNode(otherlv_24, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalEel.g:3260:4: ( (lv_contents_25_0= ruleEObject ) )
                    // InternalEel.g:3261:5: (lv_contents_25_0= ruleEObject )
                    {
                    // InternalEel.g:3261:5: (lv_contents_25_0= ruleEObject )
                    // InternalEel.g:3262:6: lv_contents_25_0= ruleEObject
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

                    // InternalEel.g:3279:4: (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==14) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalEel.g:3280:5: otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_79); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getEAnnotationAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalEel.g:3284:5: ( (lv_contents_27_0= ruleEObject ) )
                    	    // InternalEel.g:3285:6: (lv_contents_27_0= ruleEObject )
                    	    {
                    	    // InternalEel.g:3285:6: (lv_contents_27_0= ruleEObject )
                    	    // InternalEel.g:3286:7: lv_contents_27_0= ruleEObject
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
                    	    break loop88;
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
    // InternalEel.g:3317:1: entryRuleETypeParameter returns [EObject current=null] : iv_ruleETypeParameter= ruleETypeParameter EOF ;
    public final EObject entryRuleETypeParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETypeParameter = null;


        try {
            // InternalEel.g:3317:55: (iv_ruleETypeParameter= ruleETypeParameter EOF )
            // InternalEel.g:3318:2: iv_ruleETypeParameter= ruleETypeParameter EOF
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
    // InternalEel.g:3324:1: ruleETypeParameter returns [EObject current=null] : ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalEel.g:3330:2: ( ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalEel.g:3331:2: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalEel.g:3331:2: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalEel.g:3332:3: () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalEel.g:3332:3: ()
            // InternalEel.g:3333:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getETypeParameterAccess().getETypeParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getETypeParameterAccess().getETypeParameterKeyword_1());
            		
            // InternalEel.g:3343:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:3344:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:3344:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:3345:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_80); 

            			newLeafNode(otherlv_3, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:3366:3: (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==52) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalEel.g:3367:4: otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getETypeParameterAccess().getEAnnotationsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_5, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalEel.g:3375:4: ( (lv_eAnnotations_6_0= ruleEAnnotation ) )
                    // InternalEel.g:3376:5: (lv_eAnnotations_6_0= ruleEAnnotation )
                    {
                    // InternalEel.g:3376:5: (lv_eAnnotations_6_0= ruleEAnnotation )
                    // InternalEel.g:3377:6: lv_eAnnotations_6_0= ruleEAnnotation
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

                    // InternalEel.g:3394:4: (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==14) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // InternalEel.g:3395:5: otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_50); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getETypeParameterAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalEel.g:3399:5: ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    // InternalEel.g:3400:6: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:3400:6: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    // InternalEel.g:3401:7: lv_eAnnotations_8_0= ruleEAnnotation
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
                    	    break loop90;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_81); 

                    				newLeafNode(otherlv_9, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3424:3: (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==73) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalEel.g:3425:4: otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,73,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getETypeParameterAccess().getEBoundsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_58); 

                    				newLeafNode(otherlv_11, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalEel.g:3433:4: ( (lv_eBounds_12_0= ruleEGenericType ) )
                    // InternalEel.g:3434:5: (lv_eBounds_12_0= ruleEGenericType )
                    {
                    // InternalEel.g:3434:5: (lv_eBounds_12_0= ruleEGenericType )
                    // InternalEel.g:3435:6: lv_eBounds_12_0= ruleEGenericType
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

                    // InternalEel.g:3452:4: (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==14) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // InternalEel.g:3453:5: otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_58); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getETypeParameterAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalEel.g:3457:5: ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    // InternalEel.g:3458:6: (lv_eBounds_14_0= ruleEGenericType )
                    	    {
                    	    // InternalEel.g:3458:6: (lv_eBounds_14_0= ruleEGenericType )
                    	    // InternalEel.g:3459:7: lv_eBounds_14_0= ruleEGenericType
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
                    	    break loop92;
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
    // InternalEel.g:3490:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalEel.g:3490:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalEel.g:3491:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalEel.g:3497:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEel.g:3503:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalEel.g:3504:2: (kw= 'true' | kw= 'false' )
            {
            // InternalEel.g:3504:2: (kw= 'true' | kw= 'false' )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==74) ) {
                alt94=1;
            }
            else if ( (LA94_0==75) ) {
                alt94=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // InternalEel.g:3505:3: kw= 'true'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEel.g:3511:3: kw= 'false'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

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
    // InternalEel.g:3520:1: entryRuleEGenericType returns [EObject current=null] : iv_ruleEGenericType= ruleEGenericType EOF ;
    public final EObject entryRuleEGenericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGenericType = null;


        try {
            // InternalEel.g:3520:53: (iv_ruleEGenericType= ruleEGenericType EOF )
            // InternalEel.g:3521:2: iv_ruleEGenericType= ruleEGenericType EOF
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
    // InternalEel.g:3527:1: ruleEGenericType returns [EObject current=null] : ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) ;
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
            // InternalEel.g:3533:2: ( ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) )
            // InternalEel.g:3534:2: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            {
            // InternalEel.g:3534:2: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            // InternalEel.g:3535:3: () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}'
            {
            // InternalEel.g:3535:3: ()
            // InternalEel.g:3536:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEGenericTypeAccess().getEGenericTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,76,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEGenericTypeAccess().getEGenericTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_82); 

            			newLeafNode(otherlv_2, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:3550:3: (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==77) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalEel.g:3551:4: otherlv_3= 'eTypeParameter' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,77,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEGenericTypeAccess().getETypeParameterKeyword_3_0());
                    			
                    // InternalEel.g:3555:4: ( ( ruleEString ) )
                    // InternalEel.g:3556:5: ( ruleEString )
                    {
                    // InternalEel.g:3556:5: ( ruleEString )
                    // InternalEel.g:3557:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEGenericTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeParameterETypeParameterCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_83);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3572:3: (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==78) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalEel.g:3573:4: otherlv_5= 'eClassifier' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,78,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEGenericTypeAccess().getEClassifierKeyword_4_0());
                    			
                    // InternalEel.g:3577:4: ( ( ruleEString ) )
                    // InternalEel.g:3578:5: ( ruleEString )
                    {
                    // InternalEel.g:3578:5: ( ruleEString )
                    // InternalEel.g:3579:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEGenericTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getEClassifierEClassifierCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_84);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3594:3: (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==79) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalEel.g:3595:4: otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    {
                    otherlv_7=(Token)match(input,79,FOLLOW_58); 

                    				newLeafNode(otherlv_7, grammarAccess.getEGenericTypeAccess().getEUpperBoundKeyword_5_0());
                    			
                    // InternalEel.g:3599:4: ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    // InternalEel.g:3600:5: (lv_eUpperBound_8_0= ruleEGenericType )
                    {
                    // InternalEel.g:3600:5: (lv_eUpperBound_8_0= ruleEGenericType )
                    // InternalEel.g:3601:6: lv_eUpperBound_8_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getEUpperBoundEGenericTypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_85);
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

            // InternalEel.g:3619:3: (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==80) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalEel.g:3620:4: otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,80,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getEGenericTypeAccess().getETypeArgumentsKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_58); 

                    				newLeafNode(otherlv_10, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalEel.g:3628:4: ( (lv_eTypeArguments_11_0= ruleEGenericType ) )
                    // InternalEel.g:3629:5: (lv_eTypeArguments_11_0= ruleEGenericType )
                    {
                    // InternalEel.g:3629:5: (lv_eTypeArguments_11_0= ruleEGenericType )
                    // InternalEel.g:3630:6: lv_eTypeArguments_11_0= ruleEGenericType
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

                    // InternalEel.g:3647:4: (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==14) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // InternalEel.g:3648:5: otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_58); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getEGenericTypeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalEel.g:3652:5: ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    // InternalEel.g:3653:6: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    {
                    	    // InternalEel.g:3653:6: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    // InternalEel.g:3654:7: lv_eTypeArguments_13_0= ruleEGenericType
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
                    	    break loop98;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_86); 

                    				newLeafNode(otherlv_14, grammarAccess.getEGenericTypeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3677:3: (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==81) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalEel.g:3678:4: otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    {
                    otherlv_15=(Token)match(input,81,FOLLOW_58); 

                    				newLeafNode(otherlv_15, grammarAccess.getEGenericTypeAccess().getELowerBoundKeyword_7_0());
                    			
                    // InternalEel.g:3682:4: ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    // InternalEel.g:3683:5: (lv_eLowerBound_16_0= ruleEGenericType )
                    {
                    // InternalEel.g:3683:5: (lv_eLowerBound_16_0= ruleEGenericType )
                    // InternalEel.g:3684:6: lv_eLowerBound_16_0= ruleEGenericType
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
    // InternalEel.g:3710:1: entryRuleEStringToStringMapEntry returns [EObject current=null] : iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF ;
    public final EObject entryRuleEStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStringToStringMapEntry = null;


        try {
            // InternalEel.g:3710:64: (iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF )
            // InternalEel.g:3711:2: iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF
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
    // InternalEel.g:3717:1: ruleEStringToStringMapEntry returns [EObject current=null] : ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
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
            // InternalEel.g:3723:2: ( ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalEel.g:3724:2: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalEel.g:3724:2: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalEel.g:3725:3: () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalEel.g:3725:3: ()
            // InternalEel.g:3726:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,82,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_87); 

            			newLeafNode(otherlv_2, grammarAccess.getEStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:3740:3: (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==83) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalEel.g:3741:4: otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,83,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEStringToStringMapEntryAccess().getKeyKeyword_3_0());
                    			
                    // InternalEel.g:3745:4: ( (lv_key_4_0= ruleEString ) )
                    // InternalEel.g:3746:5: (lv_key_4_0= ruleEString )
                    {
                    // InternalEel.g:3746:5: (lv_key_4_0= ruleEString )
                    // InternalEel.g:3747:6: lv_key_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_88);
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

            // InternalEel.g:3765:3: (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==18) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalEel.g:3766:4: otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEStringToStringMapEntryAccess().getValueKeyword_4_0());
                    			
                    // InternalEel.g:3770:4: ( (lv_value_6_0= ruleEString ) )
                    // InternalEel.g:3771:5: (lv_value_6_0= ruleEString )
                    {
                    // InternalEel.g:3771:5: (lv_value_6_0= ruleEString )
                    // InternalEel.g:3772:6: lv_value_6_0= ruleEString
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
    // InternalEel.g:3798:1: entryRuleEObject returns [EObject current=null] : iv_ruleEObject= ruleEObject EOF ;
    public final EObject entryRuleEObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObject = null;


        try {
            // InternalEel.g:3798:48: (iv_ruleEObject= ruleEObject EOF )
            // InternalEel.g:3799:2: iv_ruleEObject= ruleEObject EOF
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
    // InternalEel.g:3805:1: ruleEObject returns [EObject current=null] : ( () otherlv_1= 'EObject' ) ;
    public final EObject ruleEObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEel.g:3811:2: ( ( () otherlv_1= 'EObject' ) )
            // InternalEel.g:3812:2: ( () otherlv_1= 'EObject' )
            {
            // InternalEel.g:3812:2: ( () otherlv_1= 'EObject' )
            // InternalEel.g:3813:3: () otherlv_1= 'EObject'
            {
            // InternalEel.g:3813:3: ()
            // InternalEel.g:3814:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEObjectAccess().getEObjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,84,FOLLOW_2); 

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
    // InternalEel.g:3828:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalEel.g:3828:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalEel.g:3829:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalEel.g:3835:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalEel.g:3841:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalEel.g:3842:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalEel.g:3842:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalEel.g:3843:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalEel.g:3843:3: (kw= '-' )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==85) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalEel.g:3844:4: kw= '-'
                    {
                    kw=(Token)match(input,85,FOLLOW_16); 

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
    // InternalEel.g:3861:1: entryRuleEAttribute returns [EObject current=null] : iv_ruleEAttribute= ruleEAttribute EOF ;
    public final EObject entryRuleEAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttribute = null;


        try {
            // InternalEel.g:3861:51: (iv_ruleEAttribute= ruleEAttribute EOF )
            // InternalEel.g:3862:2: iv_ruleEAttribute= ruleEAttribute EOF
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
    // InternalEel.g:3868:1: ruleEAttribute returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) ;
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
            // InternalEel.g:3874:2: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) )
            // InternalEel.g:3875:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            {
            // InternalEel.g:3875:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            // InternalEel.g:3876:3: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}'
            {
            // InternalEel.g:3876:3: ()
            // InternalEel.g:3877:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAttributeAccess().getEAttributeAction_0(),
            					current);
            			

            }

            // InternalEel.g:3883:3: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==86) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalEel.g:3884:4: (lv_volatile_1_0= 'volatile' )
                    {
                    // InternalEel.g:3884:4: (lv_volatile_1_0= 'volatile' )
                    // InternalEel.g:3885:5: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,86,FOLLOW_89); 

                    					newLeafNode(lv_volatile_1_0, grammarAccess.getEAttributeAccess().getVolatileVolatileKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "volatile", true, "volatile");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:3897:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==87) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalEel.g:3898:4: (lv_transient_2_0= 'transient' )
                    {
                    // InternalEel.g:3898:4: (lv_transient_2_0= 'transient' )
                    // InternalEel.g:3899:5: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,87,FOLLOW_90); 

                    					newLeafNode(lv_transient_2_0, grammarAccess.getEAttributeAccess().getTransientTransientKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "transient", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:3911:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==88) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalEel.g:3912:4: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // InternalEel.g:3912:4: (lv_unsettable_3_0= 'unsettable' )
                    // InternalEel.g:3913:5: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,88,FOLLOW_91); 

                    					newLeafNode(lv_unsettable_3_0, grammarAccess.getEAttributeAccess().getUnsettableUnsettableKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "unsettable", true, "unsettable");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:3925:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==89) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalEel.g:3926:4: (lv_derived_4_0= 'derived' )
                    {
                    // InternalEel.g:3926:4: (lv_derived_4_0= 'derived' )
                    // InternalEel.g:3927:5: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,89,FOLLOW_92); 

                    					newLeafNode(lv_derived_4_0, grammarAccess.getEAttributeAccess().getDerivedDerivedKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "derived", true, "derived");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:3939:3: ( (lv_iD_5_0= 'iD' ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==90) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalEel.g:3940:4: (lv_iD_5_0= 'iD' )
                    {
                    // InternalEel.g:3940:4: (lv_iD_5_0= 'iD' )
                    // InternalEel.g:3941:5: lv_iD_5_0= 'iD'
                    {
                    lv_iD_5_0=(Token)match(input,90,FOLLOW_93); 

                    					newLeafNode(lv_iD_5_0, grammarAccess.getEAttributeAccess().getIDIDKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "iD", true, "iD");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,91,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getEAttributeAccess().getEAttributeKeyword_6());
            		
            // InternalEel.g:3957:3: ( (lv_name_7_0= ruleEString ) )
            // InternalEel.g:3958:4: (lv_name_7_0= ruleEString )
            {
            // InternalEel.g:3958:4: (lv_name_7_0= ruleEString )
            // InternalEel.g:3959:5: lv_name_7_0= ruleEString
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

            otherlv_8=(Token)match(input,12,FOLLOW_94); 

            			newLeafNode(otherlv_8, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalEel.g:3980:3: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==58) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalEel.g:3981:4: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,58,FOLLOW_60); 

                    				newLeafNode(otherlv_9, grammarAccess.getEAttributeAccess().getOrderedKeyword_9_0());
                    			
                    // InternalEel.g:3985:4: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // InternalEel.g:3986:5: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // InternalEel.g:3986:5: (lv_ordered_10_0= ruleEBoolean )
                    // InternalEel.g:3987:6: lv_ordered_10_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getOrderedEBooleanParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_95);
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

            // InternalEel.g:4005:3: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==59) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalEel.g:4006:4: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,59,FOLLOW_60); 

                    				newLeafNode(otherlv_11, grammarAccess.getEAttributeAccess().getUniqueKeyword_10_0());
                    			
                    // InternalEel.g:4010:4: ( (lv_unique_12_0= ruleEBoolean ) )
                    // InternalEel.g:4011:5: (lv_unique_12_0= ruleEBoolean )
                    {
                    // InternalEel.g:4011:5: (lv_unique_12_0= ruleEBoolean )
                    // InternalEel.g:4012:6: lv_unique_12_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getUniqueEBooleanParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_96);
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

            // InternalEel.g:4030:3: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==60) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalEel.g:4031:4: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,60,FOLLOW_63); 

                    				newLeafNode(otherlv_13, grammarAccess.getEAttributeAccess().getLowerBoundKeyword_11_0());
                    			
                    // InternalEel.g:4035:4: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // InternalEel.g:4036:5: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // InternalEel.g:4036:5: (lv_lowerBound_14_0= ruleEInt )
                    // InternalEel.g:4037:6: lv_lowerBound_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getLowerBoundEIntParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_97);
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

            // InternalEel.g:4055:3: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==61) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalEel.g:4056:4: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,61,FOLLOW_63); 

                    				newLeafNode(otherlv_15, grammarAccess.getEAttributeAccess().getUpperBoundKeyword_12_0());
                    			
                    // InternalEel.g:4060:4: ( (lv_upperBound_16_0= ruleEInt ) )
                    // InternalEel.g:4061:5: (lv_upperBound_16_0= ruleEInt )
                    {
                    // InternalEel.g:4061:5: (lv_upperBound_16_0= ruleEInt )
                    // InternalEel.g:4062:6: lv_upperBound_16_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getUpperBoundEIntParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_98);
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

            // InternalEel.g:4080:3: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==92) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalEel.g:4081:4: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,92,FOLLOW_60); 

                    				newLeafNode(otherlv_17, grammarAccess.getEAttributeAccess().getChangeableKeyword_13_0());
                    			
                    // InternalEel.g:4085:4: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // InternalEel.g:4086:5: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // InternalEel.g:4086:5: (lv_changeable_18_0= ruleEBoolean )
                    // InternalEel.g:4087:6: lv_changeable_18_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getChangeableEBooleanParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_99);
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

            // InternalEel.g:4105:3: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==93) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalEel.g:4106:4: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,93,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getEAttributeAccess().getDefaultValueLiteralKeyword_14_0());
                    			
                    // InternalEel.g:4110:4: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // InternalEel.g:4111:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // InternalEel.g:4111:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    // InternalEel.g:4112:6: lv_defaultValueLiteral_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_100);
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

            // InternalEel.g:4130:3: (otherlv_21= 'eType' ( ( ruleEString ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==62) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalEel.g:4131:4: otherlv_21= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_21=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getEAttributeAccess().getETypeKeyword_15_0());
                    			
                    // InternalEel.g:4135:4: ( ( ruleEString ) )
                    // InternalEel.g:4136:5: ( ruleEString )
                    {
                    // InternalEel.g:4136:5: ( ruleEString )
                    // InternalEel.g:4137:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getETypeEClassifierCrossReference_15_1_0());
                    					
                    pushFollow(FOLLOW_101);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4152:3: (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==52) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalEel.g:4153:4: otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getEAttributeAccess().getEAnnotationsKeyword_16_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_24, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalEel.g:4161:4: ( (lv_eAnnotations_25_0= ruleEAnnotation ) )
                    // InternalEel.g:4162:5: (lv_eAnnotations_25_0= ruleEAnnotation )
                    {
                    // InternalEel.g:4162:5: (lv_eAnnotations_25_0= ruleEAnnotation )
                    // InternalEel.g:4163:6: lv_eAnnotations_25_0= ruleEAnnotation
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

                    // InternalEel.g:4180:4: (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==14) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // InternalEel.g:4181:5: otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_50); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getEAttributeAccess().getCommaKeyword_16_3_0());
                    	    				
                    	    // InternalEel.g:4185:5: ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    // InternalEel.g:4186:6: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:4186:6: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    // InternalEel.g:4187:7: lv_eAnnotations_27_0= ruleEAnnotation
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
                    	    break loop116;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,15,FOLLOW_102); 

                    				newLeafNode(otherlv_28, grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_16_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:4210:3: (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==64) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalEel.g:4211:4: otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    {
                    otherlv_29=(Token)match(input,64,FOLLOW_58); 

                    				newLeafNode(otherlv_29, grammarAccess.getEAttributeAccess().getEGenericTypeKeyword_17_0());
                    			
                    // InternalEel.g:4215:4: ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    // InternalEel.g:4216:5: (lv_eGenericType_30_0= ruleEGenericType )
                    {
                    // InternalEel.g:4216:5: (lv_eGenericType_30_0= ruleEGenericType )
                    // InternalEel.g:4217:6: lv_eGenericType_30_0= ruleEGenericType
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
    // InternalEel.g:4243:1: entryRuleEReference returns [EObject current=null] : iv_ruleEReference= ruleEReference EOF ;
    public final EObject entryRuleEReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEReference = null;


        try {
            // InternalEel.g:4243:51: (iv_ruleEReference= ruleEReference EOF )
            // InternalEel.g:4244:2: iv_ruleEReference= ruleEReference EOF
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
    // InternalEel.g:4250:1: ruleEReference returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) ;
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
            // InternalEel.g:4256:2: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) )
            // InternalEel.g:4257:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            {
            // InternalEel.g:4257:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            // InternalEel.g:4258:3: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}'
            {
            // InternalEel.g:4258:3: ()
            // InternalEel.g:4259:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEReferenceAccess().getEReferenceAction_0(),
            					current);
            			

            }

            // InternalEel.g:4265:3: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==86) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalEel.g:4266:4: (lv_volatile_1_0= 'volatile' )
                    {
                    // InternalEel.g:4266:4: (lv_volatile_1_0= 'volatile' )
                    // InternalEel.g:4267:5: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,86,FOLLOW_103); 

                    					newLeafNode(lv_volatile_1_0, grammarAccess.getEReferenceAccess().getVolatileVolatileKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "volatile", true, "volatile");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4279:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==87) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalEel.g:4280:4: (lv_transient_2_0= 'transient' )
                    {
                    // InternalEel.g:4280:4: (lv_transient_2_0= 'transient' )
                    // InternalEel.g:4281:5: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,87,FOLLOW_104); 

                    					newLeafNode(lv_transient_2_0, grammarAccess.getEReferenceAccess().getTransientTransientKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "transient", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4293:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==88) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalEel.g:4294:4: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // InternalEel.g:4294:4: (lv_unsettable_3_0= 'unsettable' )
                    // InternalEel.g:4295:5: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,88,FOLLOW_105); 

                    					newLeafNode(lv_unsettable_3_0, grammarAccess.getEReferenceAccess().getUnsettableUnsettableKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "unsettable", true, "unsettable");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4307:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==89) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalEel.g:4308:4: (lv_derived_4_0= 'derived' )
                    {
                    // InternalEel.g:4308:4: (lv_derived_4_0= 'derived' )
                    // InternalEel.g:4309:5: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,89,FOLLOW_106); 

                    					newLeafNode(lv_derived_4_0, grammarAccess.getEReferenceAccess().getDerivedDerivedKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "derived", true, "derived");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4321:3: ( (lv_containment_5_0= 'containment' ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==94) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalEel.g:4322:4: (lv_containment_5_0= 'containment' )
                    {
                    // InternalEel.g:4322:4: (lv_containment_5_0= 'containment' )
                    // InternalEel.g:4323:5: lv_containment_5_0= 'containment'
                    {
                    lv_containment_5_0=(Token)match(input,94,FOLLOW_107); 

                    					newLeafNode(lv_containment_5_0, grammarAccess.getEReferenceAccess().getContainmentContainmentKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "containment", true, "containment");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,95,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getEReferenceAccess().getEReferenceKeyword_6());
            		
            // InternalEel.g:4339:3: ( (lv_name_7_0= ruleEString ) )
            // InternalEel.g:4340:4: (lv_name_7_0= ruleEString )
            {
            // InternalEel.g:4340:4: (lv_name_7_0= ruleEString )
            // InternalEel.g:4341:5: lv_name_7_0= ruleEString
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

            otherlv_8=(Token)match(input,12,FOLLOW_108); 

            			newLeafNode(otherlv_8, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalEel.g:4362:3: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==58) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalEel.g:4363:4: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,58,FOLLOW_60); 

                    				newLeafNode(otherlv_9, grammarAccess.getEReferenceAccess().getOrderedKeyword_9_0());
                    			
                    // InternalEel.g:4367:4: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // InternalEel.g:4368:5: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // InternalEel.g:4368:5: (lv_ordered_10_0= ruleEBoolean )
                    // InternalEel.g:4369:6: lv_ordered_10_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getOrderedEBooleanParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_109);
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

            // InternalEel.g:4387:3: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==59) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalEel.g:4388:4: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,59,FOLLOW_60); 

                    				newLeafNode(otherlv_11, grammarAccess.getEReferenceAccess().getUniqueKeyword_10_0());
                    			
                    // InternalEel.g:4392:4: ( (lv_unique_12_0= ruleEBoolean ) )
                    // InternalEel.g:4393:5: (lv_unique_12_0= ruleEBoolean )
                    {
                    // InternalEel.g:4393:5: (lv_unique_12_0= ruleEBoolean )
                    // InternalEel.g:4394:6: lv_unique_12_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getUniqueEBooleanParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_110);
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

            // InternalEel.g:4412:3: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==60) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalEel.g:4413:4: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,60,FOLLOW_63); 

                    				newLeafNode(otherlv_13, grammarAccess.getEReferenceAccess().getLowerBoundKeyword_11_0());
                    			
                    // InternalEel.g:4417:4: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // InternalEel.g:4418:5: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // InternalEel.g:4418:5: (lv_lowerBound_14_0= ruleEInt )
                    // InternalEel.g:4419:6: lv_lowerBound_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getLowerBoundEIntParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_111);
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

            // InternalEel.g:4437:3: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==61) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalEel.g:4438:4: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,61,FOLLOW_63); 

                    				newLeafNode(otherlv_15, grammarAccess.getEReferenceAccess().getUpperBoundKeyword_12_0());
                    			
                    // InternalEel.g:4442:4: ( (lv_upperBound_16_0= ruleEInt ) )
                    // InternalEel.g:4443:5: (lv_upperBound_16_0= ruleEInt )
                    {
                    // InternalEel.g:4443:5: (lv_upperBound_16_0= ruleEInt )
                    // InternalEel.g:4444:6: lv_upperBound_16_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getUpperBoundEIntParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_112);
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

            // InternalEel.g:4462:3: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==92) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalEel.g:4463:4: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,92,FOLLOW_60); 

                    				newLeafNode(otherlv_17, grammarAccess.getEReferenceAccess().getChangeableKeyword_13_0());
                    			
                    // InternalEel.g:4467:4: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // InternalEel.g:4468:5: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // InternalEel.g:4468:5: (lv_changeable_18_0= ruleEBoolean )
                    // InternalEel.g:4469:6: lv_changeable_18_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getChangeableEBooleanParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_113);
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

            // InternalEel.g:4487:3: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==93) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalEel.g:4488:4: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,93,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getEReferenceAccess().getDefaultValueLiteralKeyword_14_0());
                    			
                    // InternalEel.g:4492:4: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // InternalEel.g:4493:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // InternalEel.g:4493:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    // InternalEel.g:4494:6: lv_defaultValueLiteral_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_114);
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

            // InternalEel.g:4512:3: (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==96) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalEel.g:4513:4: otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    {
                    otherlv_21=(Token)match(input,96,FOLLOW_60); 

                    				newLeafNode(otherlv_21, grammarAccess.getEReferenceAccess().getResolveProxiesKeyword_15_0());
                    			
                    // InternalEel.g:4517:4: ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    // InternalEel.g:4518:5: (lv_resolveProxies_22_0= ruleEBoolean )
                    {
                    // InternalEel.g:4518:5: (lv_resolveProxies_22_0= ruleEBoolean )
                    // InternalEel.g:4519:6: lv_resolveProxies_22_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getResolveProxiesEBooleanParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_115);
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

            // InternalEel.g:4537:3: (otherlv_23= 'eType' ( ( ruleEString ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==62) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalEel.g:4538:4: otherlv_23= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_23=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getEReferenceAccess().getETypeKeyword_16_0());
                    			
                    // InternalEel.g:4542:4: ( ( ruleEString ) )
                    // InternalEel.g:4543:5: ( ruleEString )
                    {
                    // InternalEel.g:4543:5: ( ruleEString )
                    // InternalEel.g:4544:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getETypeEClassifierCrossReference_16_1_0());
                    					
                    pushFollow(FOLLOW_116);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4559:3: (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==97) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalEel.g:4560:4: otherlv_25= 'eOpposite' ( ( ruleEString ) )
                    {
                    otherlv_25=(Token)match(input,97,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getEReferenceAccess().getEOppositeKeyword_17_0());
                    			
                    // InternalEel.g:4564:4: ( ( ruleEString ) )
                    // InternalEel.g:4565:5: ( ruleEString )
                    {
                    // InternalEel.g:4565:5: ( ruleEString )
                    // InternalEel.g:4566:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEOppositeEReferenceCrossReference_17_1_0());
                    					
                    pushFollow(FOLLOW_117);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4581:3: (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==98) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalEel.g:4582:4: otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')'
                    {
                    otherlv_27=(Token)match(input,98,FOLLOW_47); 

                    				newLeafNode(otherlv_27, grammarAccess.getEReferenceAccess().getEKeysKeyword_18_0());
                    			
                    otherlv_28=(Token)match(input,50,FOLLOW_3); 

                    				newLeafNode(otherlv_28, grammarAccess.getEReferenceAccess().getLeftParenthesisKeyword_18_1());
                    			
                    // InternalEel.g:4590:4: ( ( ruleEString ) )
                    // InternalEel.g:4591:5: ( ruleEString )
                    {
                    // InternalEel.g:4591:5: ( ruleEString )
                    // InternalEel.g:4592:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_2_0());
                    					
                    pushFollow(FOLLOW_48);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:4606:4: (otherlv_30= ',' ( ( ruleEString ) ) )*
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==14) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // InternalEel.g:4607:5: otherlv_30= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_30=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_30, grammarAccess.getEReferenceAccess().getCommaKeyword_18_3_0());
                    	    				
                    	    // InternalEel.g:4611:5: ( ( ruleEString ) )
                    	    // InternalEel.g:4612:6: ( ruleEString )
                    	    {
                    	    // InternalEel.g:4612:6: ( ruleEString )
                    	    // InternalEel.g:4613:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEReferenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_48);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop133;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,51,FOLLOW_101); 

                    				newLeafNode(otherlv_32, grammarAccess.getEReferenceAccess().getRightParenthesisKeyword_18_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:4633:3: (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==52) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalEel.g:4634:4: otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_33, grammarAccess.getEReferenceAccess().getEAnnotationsKeyword_19_0());
                    			
                    otherlv_34=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_34, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_19_1());
                    			
                    // InternalEel.g:4642:4: ( (lv_eAnnotations_35_0= ruleEAnnotation ) )
                    // InternalEel.g:4643:5: (lv_eAnnotations_35_0= ruleEAnnotation )
                    {
                    // InternalEel.g:4643:5: (lv_eAnnotations_35_0= ruleEAnnotation )
                    // InternalEel.g:4644:6: lv_eAnnotations_35_0= ruleEAnnotation
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

                    // InternalEel.g:4661:4: (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==14) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // InternalEel.g:4662:5: otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_36=(Token)match(input,14,FOLLOW_50); 

                    	    					newLeafNode(otherlv_36, grammarAccess.getEReferenceAccess().getCommaKeyword_19_3_0());
                    	    				
                    	    // InternalEel.g:4666:5: ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    // InternalEel.g:4667:6: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:4667:6: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    // InternalEel.g:4668:7: lv_eAnnotations_37_0= ruleEAnnotation
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
                    	    break loop135;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,15,FOLLOW_102); 

                    				newLeafNode(otherlv_38, grammarAccess.getEReferenceAccess().getRightCurlyBracketKeyword_19_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:4691:3: (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==64) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalEel.g:4692:4: otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    {
                    otherlv_39=(Token)match(input,64,FOLLOW_58); 

                    				newLeafNode(otherlv_39, grammarAccess.getEReferenceAccess().getEGenericTypeKeyword_20_0());
                    			
                    // InternalEel.g:4696:4: ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    // InternalEel.g:4697:5: (lv_eGenericType_40_0= ruleEGenericType )
                    {
                    // InternalEel.g:4697:5: (lv_eGenericType_40_0= ruleEGenericType )
                    // InternalEel.g:4698:6: lv_eGenericType_40_0= ruleEGenericType
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
    // InternalEel.g:4724:1: entryRuleEDataType_Impl returns [EObject current=null] : iv_ruleEDataType_Impl= ruleEDataType_Impl EOF ;
    public final EObject entryRuleEDataType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataType_Impl = null;


        try {
            // InternalEel.g:4724:55: (iv_ruleEDataType_Impl= ruleEDataType_Impl EOF )
            // InternalEel.g:4725:2: iv_ruleEDataType_Impl= ruleEDataType_Impl EOF
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
    // InternalEel.g:4731:1: ruleEDataType_Impl returns [EObject current=null] : ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
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
            // InternalEel.g:4737:2: ( ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalEel.g:4738:2: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalEel.g:4738:2: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalEel.g:4739:3: () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalEel.g:4739:3: ()
            // InternalEel.g:4740:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEDataType_ImplAccess().getEDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,99,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEDataType_ImplAccess().getEDataTypeKeyword_1());
            		
            // InternalEel.g:4750:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:4751:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:4751:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:4752:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_118); 

            			newLeafNode(otherlv_3, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:4773:3: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==47) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalEel.g:4774:4: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEDataType_ImplAccess().getInstanceClassNameKeyword_4_0());
                    			
                    // InternalEel.g:4778:4: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // InternalEel.g:4779:5: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // InternalEel.g:4779:5: (lv_instanceClassName_5_0= ruleEString )
                    // InternalEel.g:4780:6: lv_instanceClassName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceClassNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_119);
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

            // InternalEel.g:4798:3: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==48) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalEel.g:4799:4: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameKeyword_5_0());
                    			
                    // InternalEel.g:4803:4: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // InternalEel.g:4804:5: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // InternalEel.g:4804:5: (lv_instanceTypeName_7_0= ruleEString )
                    // InternalEel.g:4805:6: lv_instanceTypeName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_120);
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

            // InternalEel.g:4823:3: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==100) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalEel.g:4824:4: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,100,FOLLOW_60); 

                    				newLeafNode(otherlv_8, grammarAccess.getEDataType_ImplAccess().getSerializableKeyword_6_0());
                    			
                    // InternalEel.g:4828:4: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // InternalEel.g:4829:5: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // InternalEel.g:4829:5: (lv_serializable_9_0= ruleEBoolean )
                    // InternalEel.g:4830:6: lv_serializable_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getSerializableEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_121);
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

            // InternalEel.g:4848:3: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==52) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalEel.g:4849:4: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEDataType_ImplAccess().getEAnnotationsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_11, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalEel.g:4857:4: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // InternalEel.g:4858:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // InternalEel.g:4858:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // InternalEel.g:4859:6: lv_eAnnotations_12_0= ruleEAnnotation
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

                    // InternalEel.g:4876:4: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop141:
                    do {
                        int alt141=2;
                        int LA141_0 = input.LA(1);

                        if ( (LA141_0==14) ) {
                            alt141=1;
                        }


                        switch (alt141) {
                    	case 1 :
                    	    // InternalEel.g:4877:5: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_50); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalEel.g:4881:5: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // InternalEel.g:4882:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:4882:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // InternalEel.g:4883:7: lv_eAnnotations_14_0= ruleEAnnotation
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
                    	    break loop141;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_122); 

                    				newLeafNode(otherlv_15, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:4906:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==53) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalEel.g:4907:4: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEDataType_ImplAccess().getETypeParametersKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_52); 

                    				newLeafNode(otherlv_17, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalEel.g:4915:4: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // InternalEel.g:4916:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // InternalEel.g:4916:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // InternalEel.g:4917:6: lv_eTypeParameters_18_0= ruleETypeParameter
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

                    // InternalEel.g:4934:4: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop143:
                    do {
                        int alt143=2;
                        int LA143_0 = input.LA(1);

                        if ( (LA143_0==14) ) {
                            alt143=1;
                        }


                        switch (alt143) {
                    	case 1 :
                    	    // InternalEel.g:4935:5: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_52); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalEel.g:4939:5: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // InternalEel.g:4940:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // InternalEel.g:4940:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // InternalEel.g:4941:7: lv_eTypeParameters_20_0= ruleETypeParameter
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
                    	    break loop143;
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
    // InternalEel.g:4972:1: entryRuleEEnum returns [EObject current=null] : iv_ruleEEnum= ruleEEnum EOF ;
    public final EObject entryRuleEEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnum = null;


        try {
            // InternalEel.g:4972:46: (iv_ruleEEnum= ruleEEnum EOF )
            // InternalEel.g:4973:2: iv_ruleEEnum= ruleEEnum EOF
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
    // InternalEel.g:4979:1: ruleEEnum returns [EObject current=null] : ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
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
            // InternalEel.g:4985:2: ( ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // InternalEel.g:4986:2: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // InternalEel.g:4986:2: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // InternalEel.g:4987:3: () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // InternalEel.g:4987:3: ()
            // InternalEel.g:4988:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEEnumAccess().getEEnumAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,101,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEEnumAccess().getEEnumKeyword_1());
            		
            // InternalEel.g:4998:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:4999:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:4999:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:5000:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_123); 

            			newLeafNode(otherlv_3, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:5021:3: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==47) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalEel.g:5022:4: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEEnumAccess().getInstanceClassNameKeyword_4_0());
                    			
                    // InternalEel.g:5026:4: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // InternalEel.g:5027:5: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // InternalEel.g:5027:5: (lv_instanceClassName_5_0= ruleEString )
                    // InternalEel.g:5028:6: lv_instanceClassName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getInstanceClassNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_124);
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

            // InternalEel.g:5046:3: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==48) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalEel.g:5047:4: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEEnumAccess().getInstanceTypeNameKeyword_5_0());
                    			
                    // InternalEel.g:5051:4: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // InternalEel.g:5052:5: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // InternalEel.g:5052:5: (lv_instanceTypeName_7_0= ruleEString )
                    // InternalEel.g:5053:6: lv_instanceTypeName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_125);
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

            // InternalEel.g:5071:3: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==100) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalEel.g:5072:4: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,100,FOLLOW_60); 

                    				newLeafNode(otherlv_8, grammarAccess.getEEnumAccess().getSerializableKeyword_6_0());
                    			
                    // InternalEel.g:5076:4: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // InternalEel.g:5077:5: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // InternalEel.g:5077:5: (lv_serializable_9_0= ruleEBoolean )
                    // InternalEel.g:5078:6: lv_serializable_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getSerializableEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_126);
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

            // InternalEel.g:5096:3: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==52) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalEel.g:5097:4: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEEnumAccess().getEAnnotationsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_11, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalEel.g:5105:4: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // InternalEel.g:5106:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // InternalEel.g:5106:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // InternalEel.g:5107:6: lv_eAnnotations_12_0= ruleEAnnotation
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

                    // InternalEel.g:5124:4: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop148:
                    do {
                        int alt148=2;
                        int LA148_0 = input.LA(1);

                        if ( (LA148_0==14) ) {
                            alt148=1;
                        }


                        switch (alt148) {
                    	case 1 :
                    	    // InternalEel.g:5125:5: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_50); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEEnumAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalEel.g:5129:5: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // InternalEel.g:5130:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:5130:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // InternalEel.g:5131:7: lv_eAnnotations_14_0= ruleEAnnotation
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
                    	    break loop148;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_127); 

                    				newLeafNode(otherlv_15, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:5154:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==53) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalEel.g:5155:4: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEEnumAccess().getETypeParametersKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_52); 

                    				newLeafNode(otherlv_17, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalEel.g:5163:4: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // InternalEel.g:5164:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // InternalEel.g:5164:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // InternalEel.g:5165:6: lv_eTypeParameters_18_0= ruleETypeParameter
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

                    // InternalEel.g:5182:4: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop150:
                    do {
                        int alt150=2;
                        int LA150_0 = input.LA(1);

                        if ( (LA150_0==14) ) {
                            alt150=1;
                        }


                        switch (alt150) {
                    	case 1 :
                    	    // InternalEel.g:5183:5: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_52); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEEnumAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalEel.g:5187:5: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // InternalEel.g:5188:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // InternalEel.g:5188:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // InternalEel.g:5189:7: lv_eTypeParameters_20_0= ruleETypeParameter
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
                    	    break loop150;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_128); 

                    				newLeafNode(otherlv_21, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:5212:3: (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==102) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // InternalEel.g:5213:4: otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,102,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getEEnumAccess().getELiteralsKeyword_9_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_129); 

                    				newLeafNode(otherlv_23, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalEel.g:5221:4: ( (lv_eLiterals_24_0= ruleEEnumLiteral ) )
                    // InternalEel.g:5222:5: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    {
                    // InternalEel.g:5222:5: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    // InternalEel.g:5223:6: lv_eLiterals_24_0= ruleEEnumLiteral
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

                    // InternalEel.g:5240:4: (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )*
                    loop152:
                    do {
                        int alt152=2;
                        int LA152_0 = input.LA(1);

                        if ( (LA152_0==14) ) {
                            alt152=1;
                        }


                        switch (alt152) {
                    	case 1 :
                    	    // InternalEel.g:5241:5: otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_129); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getEEnumAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalEel.g:5245:5: ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    // InternalEel.g:5246:6: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    {
                    	    // InternalEel.g:5246:6: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    // InternalEel.g:5247:7: lv_eLiterals_26_0= ruleEEnumLiteral
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
                    	    break loop152;
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
    // InternalEel.g:5278:1: entryRuleEEnumLiteral returns [EObject current=null] : iv_ruleEEnumLiteral= ruleEEnumLiteral EOF ;
    public final EObject entryRuleEEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnumLiteral = null;


        try {
            // InternalEel.g:5278:53: (iv_ruleEEnumLiteral= ruleEEnumLiteral EOF )
            // InternalEel.g:5279:2: iv_ruleEEnumLiteral= ruleEEnumLiteral EOF
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
    // InternalEel.g:5285:1: ruleEEnumLiteral returns [EObject current=null] : ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
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
            // InternalEel.g:5291:2: ( ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalEel.g:5292:2: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalEel.g:5292:2: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalEel.g:5293:3: () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalEel.g:5293:3: ()
            // InternalEel.g:5294:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEEnumLiteralAccess().getEEnumLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,103,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEEnumLiteralAccess().getEEnumLiteralKeyword_1());
            		
            // InternalEel.g:5304:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:5305:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:5305:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:5306:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_130); 

            			newLeafNode(otherlv_3, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:5327:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==18) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // InternalEel.g:5328:4: otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_63); 

                    				newLeafNode(otherlv_4, grammarAccess.getEEnumLiteralAccess().getValueKeyword_4_0());
                    			
                    // InternalEel.g:5332:4: ( (lv_value_5_0= ruleEInt ) )
                    // InternalEel.g:5333:5: (lv_value_5_0= ruleEInt )
                    {
                    // InternalEel.g:5333:5: (lv_value_5_0= ruleEInt )
                    // InternalEel.g:5334:6: lv_value_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getValueEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_131);
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

            // InternalEel.g:5352:3: (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==104) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // InternalEel.g:5353:4: otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,104,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEEnumLiteralAccess().getLiteralKeyword_5_0());
                    			
                    // InternalEel.g:5357:4: ( (lv_literal_7_0= ruleEString ) )
                    // InternalEel.g:5358:5: (lv_literal_7_0= ruleEString )
                    {
                    // InternalEel.g:5358:5: (lv_literal_7_0= ruleEString )
                    // InternalEel.g:5359:6: lv_literal_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getLiteralEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_132);
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

            // InternalEel.g:5377:3: (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==52) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // InternalEel.g:5378:4: otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEEnumLiteralAccess().getEAnnotationsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_9, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalEel.g:5386:4: ( (lv_eAnnotations_10_0= ruleEAnnotation ) )
                    // InternalEel.g:5387:5: (lv_eAnnotations_10_0= ruleEAnnotation )
                    {
                    // InternalEel.g:5387:5: (lv_eAnnotations_10_0= ruleEAnnotation )
                    // InternalEel.g:5388:6: lv_eAnnotations_10_0= ruleEAnnotation
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

                    // InternalEel.g:5405:4: (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )*
                    loop156:
                    do {
                        int alt156=2;
                        int LA156_0 = input.LA(1);

                        if ( (LA156_0==14) ) {
                            alt156=1;
                        }


                        switch (alt156) {
                    	case 1 :
                    	    // InternalEel.g:5406:5: otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_50); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getEEnumLiteralAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalEel.g:5410:5: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    // InternalEel.g:5411:6: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:5411:6: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    // InternalEel.g:5412:7: lv_eAnnotations_12_0= ruleEAnnotation
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
                    	    break loop156;
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
    // InternalEel.g:5443:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // InternalEel.g:5443:51: (iv_ruleEParameter= ruleEParameter EOF )
            // InternalEel.g:5444:2: iv_ruleEParameter= ruleEParameter EOF
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
    // InternalEel.g:5450:1: ruleEParameter returns [EObject current=null] : ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) ;
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
            // InternalEel.g:5456:2: ( ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) )
            // InternalEel.g:5457:2: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            {
            // InternalEel.g:5457:2: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            // InternalEel.g:5458:3: () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}'
            {
            // InternalEel.g:5458:3: ()
            // InternalEel.g:5459:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEParameterAccess().getEParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,105,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEParameterAccess().getEParameterKeyword_1());
            		
            // InternalEel.g:5469:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:5470:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:5470:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:5471:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_133); 

            			newLeafNode(otherlv_3, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:5492:3: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==58) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // InternalEel.g:5493:4: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,58,FOLLOW_60); 

                    				newLeafNode(otherlv_4, grammarAccess.getEParameterAccess().getOrderedKeyword_4_0());
                    			
                    // InternalEel.g:5497:4: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // InternalEel.g:5498:5: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // InternalEel.g:5498:5: (lv_ordered_5_0= ruleEBoolean )
                    // InternalEel.g:5499:6: lv_ordered_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getOrderedEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_134);
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

            // InternalEel.g:5517:3: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==59) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // InternalEel.g:5518:4: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,59,FOLLOW_60); 

                    				newLeafNode(otherlv_6, grammarAccess.getEParameterAccess().getUniqueKeyword_5_0());
                    			
                    // InternalEel.g:5522:4: ( (lv_unique_7_0= ruleEBoolean ) )
                    // InternalEel.g:5523:5: (lv_unique_7_0= ruleEBoolean )
                    {
                    // InternalEel.g:5523:5: (lv_unique_7_0= ruleEBoolean )
                    // InternalEel.g:5524:6: lv_unique_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getUniqueEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_135);
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

            // InternalEel.g:5542:3: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==60) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // InternalEel.g:5543:4: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,60,FOLLOW_63); 

                    				newLeafNode(otherlv_8, grammarAccess.getEParameterAccess().getLowerBoundKeyword_6_0());
                    			
                    // InternalEel.g:5547:4: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // InternalEel.g:5548:5: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // InternalEel.g:5548:5: (lv_lowerBound_9_0= ruleEInt )
                    // InternalEel.g:5549:6: lv_lowerBound_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getLowerBoundEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_136);
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

            // InternalEel.g:5567:3: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==61) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // InternalEel.g:5568:4: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,61,FOLLOW_63); 

                    				newLeafNode(otherlv_10, grammarAccess.getEParameterAccess().getUpperBoundKeyword_7_0());
                    			
                    // InternalEel.g:5572:4: ( (lv_upperBound_11_0= ruleEInt ) )
                    // InternalEel.g:5573:5: (lv_upperBound_11_0= ruleEInt )
                    {
                    // InternalEel.g:5573:5: (lv_upperBound_11_0= ruleEInt )
                    // InternalEel.g:5574:6: lv_upperBound_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getUpperBoundEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_100);
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

            // InternalEel.g:5592:3: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==62) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // InternalEel.g:5593:4: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getEParameterAccess().getETypeKeyword_8_0());
                    			
                    // InternalEel.g:5597:4: ( ( ruleEString ) )
                    // InternalEel.g:5598:5: ( ruleEString )
                    {
                    // InternalEel.g:5598:5: ( ruleEString )
                    // InternalEel.g:5599:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEParameterRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEParameterAccess().getETypeEClassifierCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_101);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5614:3: (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==52) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // InternalEel.g:5615:4: otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getEParameterAccess().getEAnnotationsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_15, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalEel.g:5623:4: ( (lv_eAnnotations_16_0= ruleEAnnotation ) )
                    // InternalEel.g:5624:5: (lv_eAnnotations_16_0= ruleEAnnotation )
                    {
                    // InternalEel.g:5624:5: (lv_eAnnotations_16_0= ruleEAnnotation )
                    // InternalEel.g:5625:6: lv_eAnnotations_16_0= ruleEAnnotation
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

                    // InternalEel.g:5642:4: (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )*
                    loop163:
                    do {
                        int alt163=2;
                        int LA163_0 = input.LA(1);

                        if ( (LA163_0==14) ) {
                            alt163=1;
                        }


                        switch (alt163) {
                    	case 1 :
                    	    // InternalEel.g:5643:5: otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_50); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEParameterAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalEel.g:5647:5: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    // InternalEel.g:5648:6: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:5648:6: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    // InternalEel.g:5649:7: lv_eAnnotations_18_0= ruleEAnnotation
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
                    	    break loop163;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,15,FOLLOW_102); 

                    				newLeafNode(otherlv_19, grammarAccess.getEParameterAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:5672:3: (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==64) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // InternalEel.g:5673:4: otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    {
                    otherlv_20=(Token)match(input,64,FOLLOW_58); 

                    				newLeafNode(otherlv_20, grammarAccess.getEParameterAccess().getEGenericTypeKeyword_10_0());
                    			
                    // InternalEel.g:5677:4: ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    // InternalEel.g:5678:5: (lv_eGenericType_21_0= ruleEGenericType )
                    {
                    // InternalEel.g:5678:5: (lv_eGenericType_21_0= ruleEGenericType )
                    // InternalEel.g:5679:6: lv_eGenericType_21_0= ruleEGenericType
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
    // InternalEel.g:5705:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'current' ) | (enumLiteral_1= 'duration' ) | (enumLiteral_2= 'energy' ) | (enumLiteral_3= 'frequency' ) | (enumLiteral_4= 'power' ) | (enumLiteral_5= 'voltage' ) | (enumLiteral_6= 'scalar' ) ) ;
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
            // InternalEel.g:5711:2: ( ( (enumLiteral_0= 'current' ) | (enumLiteral_1= 'duration' ) | (enumLiteral_2= 'energy' ) | (enumLiteral_3= 'frequency' ) | (enumLiteral_4= 'power' ) | (enumLiteral_5= 'voltage' ) | (enumLiteral_6= 'scalar' ) ) )
            // InternalEel.g:5712:2: ( (enumLiteral_0= 'current' ) | (enumLiteral_1= 'duration' ) | (enumLiteral_2= 'energy' ) | (enumLiteral_3= 'frequency' ) | (enumLiteral_4= 'power' ) | (enumLiteral_5= 'voltage' ) | (enumLiteral_6= 'scalar' ) )
            {
            // InternalEel.g:5712:2: ( (enumLiteral_0= 'current' ) | (enumLiteral_1= 'duration' ) | (enumLiteral_2= 'energy' ) | (enumLiteral_3= 'frequency' ) | (enumLiteral_4= 'power' ) | (enumLiteral_5= 'voltage' ) | (enumLiteral_6= 'scalar' ) )
            int alt166=7;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt166=1;
                }
                break;
            case 107:
                {
                alt166=2;
                }
                break;
            case 108:
                {
                alt166=3;
                }
                break;
            case 109:
                {
                alt166=4;
                }
                break;
            case 110:
                {
                alt166=5;
                }
                break;
            case 111:
                {
                alt166=6;
                }
                break;
            case 112:
                {
                alt166=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 166, 0, input);

                throw nvae;
            }

            switch (alt166) {
                case 1 :
                    // InternalEel.g:5713:3: (enumLiteral_0= 'current' )
                    {
                    // InternalEel.g:5713:3: (enumLiteral_0= 'current' )
                    // InternalEel.g:5714:4: enumLiteral_0= 'current'
                    {
                    enumLiteral_0=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getCurrentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getCurrentEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:5721:3: (enumLiteral_1= 'duration' )
                    {
                    // InternalEel.g:5721:3: (enumLiteral_1= 'duration' )
                    // InternalEel.g:5722:4: enumLiteral_1= 'duration'
                    {
                    enumLiteral_1=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDurationEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getDurationEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEel.g:5729:3: (enumLiteral_2= 'energy' )
                    {
                    // InternalEel.g:5729:3: (enumLiteral_2= 'energy' )
                    // InternalEel.g:5730:4: enumLiteral_2= 'energy'
                    {
                    enumLiteral_2=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getEnergyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getEnergyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEel.g:5737:3: (enumLiteral_3= 'frequency' )
                    {
                    // InternalEel.g:5737:3: (enumLiteral_3= 'frequency' )
                    // InternalEel.g:5738:4: enumLiteral_3= 'frequency'
                    {
                    enumLiteral_3=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFrequencyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getFrequencyEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEel.g:5745:3: (enumLiteral_4= 'power' )
                    {
                    // InternalEel.g:5745:3: (enumLiteral_4= 'power' )
                    // InternalEel.g:5746:4: enumLiteral_4= 'power'
                    {
                    enumLiteral_4=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getPowerEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getPowerEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalEel.g:5753:3: (enumLiteral_5= 'voltage' )
                    {
                    // InternalEel.g:5753:3: (enumLiteral_5= 'voltage' )
                    // InternalEel.g:5754:4: enumLiteral_5= 'voltage'
                    {
                    enumLiteral_5=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getVoltageEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getVoltageEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalEel.g:5761:3: (enumLiteral_6= 'scalar' )
                    {
                    // InternalEel.g:5761:3: (enumLiteral_6= 'scalar' )
                    // InternalEel.g:5762:4: enumLiteral_6= 'scalar'
                    {
                    enumLiteral_6=(Token)match(input,112,FOLLOW_2); 

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
    // InternalEel.g:5772:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEel.g:5778:2: ( ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) ) )
            // InternalEel.g:5779:2: ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) )
            {
            // InternalEel.g:5779:2: ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) )
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==113) ) {
                alt167=1;
            }
            else if ( (LA167_0==114) ) {
                alt167=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 167, 0, input);

                throw nvae;
            }
            switch (alt167) {
                case 1 :
                    // InternalEel.g:5780:3: (enumLiteral_0= 'LOCAL' )
                    {
                    // InternalEel.g:5780:3: (enumLiteral_0= 'LOCAL' )
                    // InternalEel.g:5781:4: enumLiteral_0= 'LOCAL'
                    {
                    enumLiteral_0=(Token)match(input,113,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getLOCALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:5788:3: (enumLiteral_1= 'GLOBAL' )
                    {
                    // InternalEel.g:5788:3: (enumLiteral_1= 'GLOBAL' )
                    // InternalEel.g:5789:4: enumLiteral_1= 'GLOBAL'
                    {
                    enumLiteral_1=(Token)match(input,114,FOLLOW_2); 

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
    static final String dfa_1s = "\34\uffff";
    static final String dfa_2s = "\16\uffff\2\24\14\uffff";
    static final String dfa_3s = "\4\4\7\26\1\4\2\26\4\4\2\32\3\uffff\2\33\3\uffff";
    static final String dfa_4s = "\4\160\7\26\1\5\2\26\2\43\2\160\2\34\3\uffff\2\34\3\uffff";
    static final String dfa_5s = "\24\uffff\1\1\1\2\1\3\2\uffff\1\5\1\6\1\4";
    static final String dfa_6s = "\34\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\16\uffff\1\3\125\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\14\1\15\16\uffff\1\3\1\13\1\16\123\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\14\1\15\16\uffff\1\3\1\13\1\16\123\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\14\1\15\144\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\20\1\21",
            "\1\16",
            "\1\16",
            "\1\22\1\23\1\24\7\uffff\2\24\4\uffff\1\24\2\uffff\1\24\1\25\1\26\11\uffff\1\24",
            "\1\27\1\30\1\24\7\uffff\2\24\4\uffff\1\24\2\uffff\1\24\1\25\1\26\11\uffff\1\24",
            "\1\14\1\15\16\uffff\1\3\125\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\14\1\15\16\uffff\1\3\125\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\33\1\31\1\32",
            "\1\33\1\31\1\32",
            "",
            "",
            "",
            "\1\31\1\32",
            "\1\31\1\32",
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
            return "252:2: (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureProductOperation_Impl_4= ruleMeasureProductOperation_Impl | this_MeasureSumOperation_5= ruleMeasureSumOperation )";
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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100030L,0x0001FC0000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0006000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000300030L,0x0001FC0000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000030L,0x0001FC0000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000900042L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000300030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0001FC0000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000C0008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000009300000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000006000008000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x01F3800000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x01F3000000008000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x01F2000000008000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000004000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x01F0000000008000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x01E0000000008000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x01C0000000008000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0180000000008000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x00000000CFC00000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0100000000008000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0xFC30000000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0xF830000000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0xF030000000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000040L,0x0000000000200000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0xE030000000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0xC030000000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x8030000000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0030000000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0020000000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0020000000008000L,0x0000000000000006L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000006L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000004L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0010000000008000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0010000000008000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0010000000008000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000008000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000080L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0010000000008000L,0x0000000000000200L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000008000L,0x000000000003E000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000008000L,0x000000000003C000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000008000L,0x0000000000038000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000008000L,0x0000000000030000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000048000L,0x0000000000080000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x000000000F800000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x000000000F000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x000000000E000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x7C10000000008000L,0x0000000030000001L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x7810000000008000L,0x0000000030000001L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x7010000000008000L,0x0000000030000001L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x6010000000008000L,0x0000000030000001L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x4010000000008000L,0x0000000030000001L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x4010000000008000L,0x0000000020000001L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x4010000000008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0010000000008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x00000000C3800000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x00000000C3000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x00000000C2000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x7C10000000008000L,0x0000000730000001L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x7810000000008000L,0x0000000730000001L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x7010000000008000L,0x0000000730000001L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x6010000000008000L,0x0000000730000001L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x4010000000008000L,0x0000000730000001L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x4010000000008000L,0x0000000720000001L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x4010000000008000L,0x0000000700000001L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x4010000000008000L,0x0000000600000001L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0010000000008000L,0x0000000600000001L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0010000000008000L,0x0000000400000001L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0031800000008000L,0x0000001000000000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0031000000008000L,0x0000001000000000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0030000000008000L,0x0000001000000000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0030000000008000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0020000000008000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0031800000008000L,0x0000005000000000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0031000000008000L,0x0000005000000000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0030000000008000L,0x0000005000000000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0030000000008000L,0x0000004000000000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0020000000008000L,0x0000004000000000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000008000L,0x0000004000000000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0010000000048000L,0x0000010000000000L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0010000000008000L,0x0000010000000000L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0010000000008000L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x7C10000000008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x7810000000008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x7010000000008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_136 = new BitSet(new long[]{0x6010000000008000L,0x0000000000000001L});

}