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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Platform'", "'{'", "'variables'", "','", "'}'", "'measures'", "'Variable'", "'value'", "'vibility'", "'.'", "'abstract'", "'interface'", "'EClass'", "'instanceClassName'", "'instanceTypeName'", "'eSuperTypes'", "'('", "')'", "'eAnnotations'", "'eTypeParameters'", "'eOperations'", "'eStructuralFeatures'", "'eGenericSuperTypes'", "'EOperation'", "'ordered'", "'unique'", "'lowerBound'", "'upperBound'", "'eType'", "'eExceptions'", "'eGenericType'", "'eParameters'", "'eGenericExceptions'", "'MeasurementUncertainty'", "'standardUncertainty'", "'information'", "'target'", "':'", "'uncertainty'", "'MeasureOCL'", "'oclQuery'", "'targetClass'", "'targetOperation'", "'MeasureAttribute'", "'att'", "'MeasureCast'", "'measure'", "'*'", "'+'", "'EnergyComputation'", "'left'", "'right'", "'PowerComputation'", "'EAnnotation'", "'source'", "'references'", "'details'", "'contents'", "'ETypeParameter'", "'eBounds'", "'true'", "'false'", "'EGenericType'", "'eTypeParameter'", "'eClassifier'", "'eUpperBound'", "'eTypeArguments'", "'eLowerBound'", "'EStringToStringMapEntry'", "'key'", "'EObject'", "'-'", "'volatile'", "'transient'", "'unsettable'", "'derived'", "'iD'", "'EAttribute'", "'changeable'", "'defaultValueLiteral'", "'containment'", "'EReference'", "'resolveProxies'", "'eOpposite'", "'eKeys'", "'EDataType'", "'serializable'", "'EEnum'", "'eLiterals'", "'EEnumLiteral'", "'literal'", "'EParameter'", "'NormalDistribution'", "'Interval'", "'lowerEndpoint'", "'upperEndpoint'", "'Sampling'", "'measurementProcedure'", "'samples'", "'Integral'", "'function'", "'interval'", "'Sample'", "'quantity'", "'A'", "'s'", "'J'", "'Hz'", "'W'", "'V'", "'LOCAL'", "'GLOBAL'"
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
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__120=120;
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
    // InternalEel.g:245:1: ruleMeasure returns [EObject current=null] : (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureProductOperation_Impl_4= ruleMeasureProductOperation_Impl | this_MeasureSumOperation_5= ruleMeasureSumOperation | this_EnergyComputation_6= ruleEnergyComputation | this_PowerComputation_7= rulePowerComputation ) ;
    public final EObject ruleMeasure() throws RecognitionException {
        EObject current = null;

        EObject this_MeasureValue_Impl_0 = null;

        EObject this_MeasureOCL_1 = null;

        EObject this_MeasureAttribute_2 = null;

        EObject this_MeasureCast_3 = null;

        EObject this_MeasureProductOperation_Impl_4 = null;

        EObject this_MeasureSumOperation_5 = null;

        EObject this_EnergyComputation_6 = null;

        EObject this_PowerComputation_7 = null;



        	enterRule();

        try {
            // InternalEel.g:251:2: ( (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureProductOperation_Impl_4= ruleMeasureProductOperation_Impl | this_MeasureSumOperation_5= ruleMeasureSumOperation | this_EnergyComputation_6= ruleEnergyComputation | this_PowerComputation_7= rulePowerComputation ) )
            // InternalEel.g:252:2: (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureProductOperation_Impl_4= ruleMeasureProductOperation_Impl | this_MeasureSumOperation_5= ruleMeasureSumOperation | this_EnergyComputation_6= ruleEnergyComputation | this_PowerComputation_7= rulePowerComputation )
            {
            // InternalEel.g:252:2: (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureProductOperation_Impl_4= ruleMeasureProductOperation_Impl | this_MeasureSumOperation_5= ruleMeasureSumOperation | this_EnergyComputation_6= ruleEnergyComputation | this_PowerComputation_7= rulePowerComputation )
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
                case 7 :
                    // InternalEel.g:307:3: this_EnergyComputation_6= ruleEnergyComputation
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getEnergyComputationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnergyComputation_6=ruleEnergyComputation();

                    state._fsp--;


                    			current = this_EnergyComputation_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalEel.g:316:3: this_PowerComputation_7= rulePowerComputation
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getPowerComputationParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_PowerComputation_7=rulePowerComputation();

                    state._fsp--;


                    			current = this_PowerComputation_7;
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
    // InternalEel.g:328:1: entryRuleEStructuralFeature returns [EObject current=null] : iv_ruleEStructuralFeature= ruleEStructuralFeature EOF ;
    public final EObject entryRuleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStructuralFeature = null;


        try {
            // InternalEel.g:328:59: (iv_ruleEStructuralFeature= ruleEStructuralFeature EOF )
            // InternalEel.g:329:2: iv_ruleEStructuralFeature= ruleEStructuralFeature EOF
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
    // InternalEel.g:335:1: ruleEStructuralFeature returns [EObject current=null] : (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) ;
    public final EObject ruleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject this_EAttribute_0 = null;

        EObject this_EReference_1 = null;



        	enterRule();

        try {
            // InternalEel.g:341:2: ( (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) )
            // InternalEel.g:342:2: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            {
            // InternalEel.g:342:2: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            int alt6=2;
            switch ( input.LA(1) ) {
            case 83:
                {
                switch ( input.LA(2) ) {
                case 84:
                    {
                    switch ( input.LA(3) ) {
                    case 85:
                        {
                        switch ( input.LA(4) ) {
                        case 86:
                            {
                            int LA6_4 = input.LA(5);

                            if ( ((LA6_4>=87 && LA6_4<=88)) ) {
                                alt6=1;
                            }
                            else if ( ((LA6_4>=91 && LA6_4<=92)) ) {
                                alt6=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 4, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 87:
                        case 88:
                            {
                            alt6=1;
                            }
                            break;
                        case 91:
                        case 92:
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
                    case 86:
                        {
                        int LA6_4 = input.LA(4);

                        if ( ((LA6_4>=87 && LA6_4<=88)) ) {
                            alt6=1;
                        }
                        else if ( ((LA6_4>=91 && LA6_4<=92)) ) {
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
                        alt6=2;
                        }
                        break;
                    case 87:
                    case 88:
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
                case 85:
                    {
                    switch ( input.LA(3) ) {
                    case 86:
                        {
                        int LA6_4 = input.LA(4);

                        if ( ((LA6_4>=87 && LA6_4<=88)) ) {
                            alt6=1;
                        }
                        else if ( ((LA6_4>=91 && LA6_4<=92)) ) {
                            alt6=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 87:
                    case 88:
                        {
                        alt6=1;
                        }
                        break;
                    case 91:
                    case 92:
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
                case 86:
                    {
                    int LA6_4 = input.LA(3);

                    if ( ((LA6_4>=87 && LA6_4<=88)) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_4>=91 && LA6_4<=92)) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 87:
                case 88:
                    {
                    alt6=1;
                    }
                    break;
                case 91:
                case 92:
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
            case 84:
                {
                switch ( input.LA(2) ) {
                case 85:
                    {
                    switch ( input.LA(3) ) {
                    case 86:
                        {
                        int LA6_4 = input.LA(4);

                        if ( ((LA6_4>=87 && LA6_4<=88)) ) {
                            alt6=1;
                        }
                        else if ( ((LA6_4>=91 && LA6_4<=92)) ) {
                            alt6=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 87:
                    case 88:
                        {
                        alt6=1;
                        }
                        break;
                    case 91:
                    case 92:
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
                case 86:
                    {
                    int LA6_4 = input.LA(3);

                    if ( ((LA6_4>=87 && LA6_4<=88)) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_4>=91 && LA6_4<=92)) ) {
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
                    alt6=2;
                    }
                    break;
                case 87:
                case 88:
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
            case 85:
                {
                switch ( input.LA(2) ) {
                case 86:
                    {
                    int LA6_4 = input.LA(3);

                    if ( ((LA6_4>=87 && LA6_4<=88)) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_4>=91 && LA6_4<=92)) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 87:
                case 88:
                    {
                    alt6=1;
                    }
                    break;
                case 91:
                case 92:
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
            case 86:
                {
                int LA6_4 = input.LA(2);

                if ( ((LA6_4>=87 && LA6_4<=88)) ) {
                    alt6=1;
                }
                else if ( ((LA6_4>=91 && LA6_4<=92)) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            case 87:
            case 88:
                {
                alt6=1;
                }
                break;
            case 91:
            case 92:
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
                    // InternalEel.g:343:3: this_EAttribute_0= ruleEAttribute
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
                    // InternalEel.g:352:3: this_EReference_1= ruleEReference
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
            case 103:
                {
                alt7=1;
                }
                break;
            case 104:
                {
                alt7=2;
                }
                break;
            case 107:
                {
                alt7=3;
                }
                break;
            case 110:
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


    // $ANTLR start "entryRuleEClass"
    // InternalEel.g:590:1: entryRuleEClass returns [EObject current=null] : iv_ruleEClass= ruleEClass EOF ;
    public final EObject entryRuleEClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClass = null;


        try {
            // InternalEel.g:590:47: (iv_ruleEClass= ruleEClass EOF )
            // InternalEel.g:591:2: iv_ruleEClass= ruleEClass EOF
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
    // InternalEel.g:597:1: ruleEClass returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
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
            // InternalEel.g:603:2: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // InternalEel.g:604:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // InternalEel.g:604:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // InternalEel.g:605:3: () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // InternalEel.g:605:3: ()
            // InternalEel.g:606:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEClassAccess().getEClassAction_0(),
            					current);
            			

            }

            // InternalEel.g:612:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEel.g:613:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalEel.g:613:4: (lv_abstract_1_0= 'abstract' )
                    // InternalEel.g:614:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,21,FOLLOW_17); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getEClassAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:626:3: ( (lv_interface_2_0= 'interface' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEel.g:627:4: (lv_interface_2_0= 'interface' )
                    {
                    // InternalEel.g:627:4: (lv_interface_2_0= 'interface' )
                    // InternalEel.g:628:5: lv_interface_2_0= 'interface'
                    {
                    lv_interface_2_0=(Token)match(input,22,FOLLOW_18); 

                    					newLeafNode(lv_interface_2_0, grammarAccess.getEClassAccess().getInterfaceInterfaceKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEClassRule());
                    					}
                    					setWithLastConsumed(current, "interface", true, "interface");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getEClassAccess().getEClassKeyword_3());
            		
            // InternalEel.g:644:3: ( (lv_name_4_0= ruleEString ) )
            // InternalEel.g:645:4: (lv_name_4_0= ruleEString )
            {
            // InternalEel.g:645:4: (lv_name_4_0= ruleEString )
            // InternalEel.g:646:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalEel.g:667:3: (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEel.g:668:4: otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEClassAccess().getInstanceClassNameKeyword_6_0());
                    			
                    // InternalEel.g:672:4: ( (lv_instanceClassName_7_0= ruleEString ) )
                    // InternalEel.g:673:5: (lv_instanceClassName_7_0= ruleEString )
                    {
                    // InternalEel.g:673:5: (lv_instanceClassName_7_0= ruleEString )
                    // InternalEel.g:674:6: lv_instanceClassName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getInstanceClassNameEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_20);
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

            // InternalEel.g:692:3: (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEel.g:693:4: otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getEClassAccess().getInstanceTypeNameKeyword_7_0());
                    			
                    // InternalEel.g:697:4: ( (lv_instanceTypeName_9_0= ruleEString ) )
                    // InternalEel.g:698:5: (lv_instanceTypeName_9_0= ruleEString )
                    {
                    // InternalEel.g:698:5: (lv_instanceTypeName_9_0= ruleEString )
                    // InternalEel.g:699:6: lv_instanceTypeName_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getInstanceTypeNameEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_21);
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

            // InternalEel.g:717:3: (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEel.g:718:4: otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getEClassAccess().getESuperTypesKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getEClassAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalEel.g:726:4: ( ( ruleEString ) )
                    // InternalEel.g:727:5: ( ruleEString )
                    {
                    // InternalEel.g:727:5: ( ruleEString )
                    // InternalEel.g:728:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:742:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalEel.g:743:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEClassAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalEel.g:747:5: ( ( ruleEString ) )
                    	    // InternalEel.g:748:6: ( ruleEString )
                    	    {
                    	    // InternalEel.g:748:6: ( ruleEString )
                    	    // InternalEel.g:749:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,28,FOLLOW_24); 

                    				newLeafNode(otherlv_15, grammarAccess.getEClassAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:769:3: (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEel.g:770:4: otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEClassAccess().getEAnnotationsKeyword_9_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_17, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalEel.g:778:4: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    // InternalEel.g:779:5: (lv_eAnnotations_18_0= ruleEAnnotation )
                    {
                    // InternalEel.g:779:5: (lv_eAnnotations_18_0= ruleEAnnotation )
                    // InternalEel.g:780:6: lv_eAnnotations_18_0= ruleEAnnotation
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

                    // InternalEel.g:797:4: (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalEel.g:798:5: otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_25); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEClassAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalEel.g:802:5: ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    // InternalEel.g:803:6: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:803:6: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    // InternalEel.g:804:7: lv_eAnnotations_20_0= ruleEAnnotation
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
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_26); 

                    				newLeafNode(otherlv_21, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:827:3: (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalEel.g:828:4: otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getEClassAccess().getETypeParametersKeyword_10_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_27); 

                    				newLeafNode(otherlv_23, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalEel.g:836:4: ( (lv_eTypeParameters_24_0= ruleETypeParameter ) )
                    // InternalEel.g:837:5: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    {
                    // InternalEel.g:837:5: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    // InternalEel.g:838:6: lv_eTypeParameters_24_0= ruleETypeParameter
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

                    // InternalEel.g:855:4: (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalEel.g:856:5: otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_27); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getEClassAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalEel.g:860:5: ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    // InternalEel.g:861:6: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    {
                    	    // InternalEel.g:861:6: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    // InternalEel.g:862:7: lv_eTypeParameters_26_0= ruleETypeParameter
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
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_28); 

                    				newLeafNode(otherlv_27, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:885:3: (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEel.g:886:4: otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getEClassAccess().getEOperationsKeyword_11_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_29, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalEel.g:894:4: ( (lv_eOperations_30_0= ruleEOperation ) )
                    // InternalEel.g:895:5: (lv_eOperations_30_0= ruleEOperation )
                    {
                    // InternalEel.g:895:5: (lv_eOperations_30_0= ruleEOperation )
                    // InternalEel.g:896:6: lv_eOperations_30_0= ruleEOperation
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

                    // InternalEel.g:913:4: (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==14) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalEel.g:914:5: otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    {
                    	    otherlv_31=(Token)match(input,14,FOLLOW_29); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getEClassAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalEel.g:918:5: ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    // InternalEel.g:919:6: (lv_eOperations_32_0= ruleEOperation )
                    	    {
                    	    // InternalEel.g:919:6: (lv_eOperations_32_0= ruleEOperation )
                    	    // InternalEel.g:920:7: lv_eOperations_32_0= ruleEOperation
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
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,15,FOLLOW_30); 

                    				newLeafNode(otherlv_33, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:943:3: (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEel.g:944:4: otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getEClassAccess().getEStructuralFeaturesKeyword_12_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_35, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalEel.g:952:4: ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) )
                    // InternalEel.g:953:5: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    {
                    // InternalEel.g:953:5: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    // InternalEel.g:954:6: lv_eStructuralFeatures_36_0= ruleEStructuralFeature
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

                    // InternalEel.g:971:4: (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalEel.g:972:5: otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    {
                    	    otherlv_37=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getEClassAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalEel.g:976:5: ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    // InternalEel.g:977:6: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    {
                    	    // InternalEel.g:977:6: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    // InternalEel.g:978:7: lv_eStructuralFeatures_38_0= ruleEStructuralFeature
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
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,15,FOLLOW_32); 

                    				newLeafNode(otherlv_39, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:1001:3: (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalEel.g:1002:4: otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_40, grammarAccess.getEClassAccess().getEGenericSuperTypesKeyword_13_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_41, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalEel.g:1010:4: ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) )
                    // InternalEel.g:1011:5: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    {
                    // InternalEel.g:1011:5: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    // InternalEel.g:1012:6: lv_eGenericSuperTypes_42_0= ruleEGenericType
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

                    // InternalEel.g:1029:4: (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalEel.g:1030:5: otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,14,FOLLOW_33); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getEClassAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalEel.g:1034:5: ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    // InternalEel.g:1035:6: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    {
                    	    // InternalEel.g:1035:6: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    // InternalEel.g:1036:7: lv_eGenericSuperTypes_44_0= ruleEGenericType
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
                    	    break loop25;
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
    // InternalEel.g:1067:1: entryRuleEOperation returns [EObject current=null] : iv_ruleEOperation= ruleEOperation EOF ;
    public final EObject entryRuleEOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperation = null;


        try {
            // InternalEel.g:1067:51: (iv_ruleEOperation= ruleEOperation EOF )
            // InternalEel.g:1068:2: iv_ruleEOperation= ruleEOperation EOF
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
    // InternalEel.g:1074:1: ruleEOperation returns [EObject current=null] : ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
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
            // InternalEel.g:1080:2: ( ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // InternalEel.g:1081:2: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // InternalEel.g:1081:2: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // InternalEel.g:1082:3: () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // InternalEel.g:1082:3: ()
            // InternalEel.g:1083:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOperationAccess().getEOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEOperationAccess().getEOperationKeyword_1());
            		
            // InternalEel.g:1093:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:1094:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:1094:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:1095:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:1116:3: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalEel.g:1117:4: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35); 

                    				newLeafNode(otherlv_4, grammarAccess.getEOperationAccess().getOrderedKeyword_4_0());
                    			
                    // InternalEel.g:1121:4: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // InternalEel.g:1122:5: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // InternalEel.g:1122:5: (lv_ordered_5_0= ruleEBoolean )
                    // InternalEel.g:1123:6: lv_ordered_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getOrderedEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
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

            // InternalEel.g:1141:3: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalEel.g:1142:4: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_35); 

                    				newLeafNode(otherlv_6, grammarAccess.getEOperationAccess().getUniqueKeyword_5_0());
                    			
                    // InternalEel.g:1146:4: ( (lv_unique_7_0= ruleEBoolean ) )
                    // InternalEel.g:1147:5: (lv_unique_7_0= ruleEBoolean )
                    {
                    // InternalEel.g:1147:5: (lv_unique_7_0= ruleEBoolean )
                    // InternalEel.g:1148:6: lv_unique_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getUniqueEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_37);
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

            // InternalEel.g:1166:3: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalEel.g:1167:4: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,37,FOLLOW_38); 

                    				newLeafNode(otherlv_8, grammarAccess.getEOperationAccess().getLowerBoundKeyword_6_0());
                    			
                    // InternalEel.g:1171:4: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // InternalEel.g:1172:5: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // InternalEel.g:1172:5: (lv_lowerBound_9_0= ruleEInt )
                    // InternalEel.g:1173:6: lv_lowerBound_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getLowerBoundEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_39);
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

            // InternalEel.g:1191:3: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalEel.g:1192:4: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,38,FOLLOW_38); 

                    				newLeafNode(otherlv_10, grammarAccess.getEOperationAccess().getUpperBoundKeyword_7_0());
                    			
                    // InternalEel.g:1196:4: ( (lv_upperBound_11_0= ruleEInt ) )
                    // InternalEel.g:1197:5: (lv_upperBound_11_0= ruleEInt )
                    {
                    // InternalEel.g:1197:5: (lv_upperBound_11_0= ruleEInt )
                    // InternalEel.g:1198:6: lv_upperBound_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getUpperBoundEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_40);
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

            // InternalEel.g:1216:3: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalEel.g:1217:4: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getEOperationAccess().getETypeKeyword_8_0());
                    			
                    // InternalEel.g:1221:4: ( ( ruleEString ) )
                    // InternalEel.g:1222:5: ( ruleEString )
                    {
                    // InternalEel.g:1222:5: ( ruleEString )
                    // InternalEel.g:1223:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEOperationAccess().getETypeEClassifierCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:1238:3: (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalEel.g:1239:4: otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')'
                    {
                    otherlv_14=(Token)match(input,40,FOLLOW_22); 

                    				newLeafNode(otherlv_14, grammarAccess.getEOperationAccess().getEExceptionsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getEOperationAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalEel.g:1247:4: ( ( ruleEString ) )
                    // InternalEel.g:1248:5: ( ruleEString )
                    {
                    // InternalEel.g:1248:5: ( ruleEString )
                    // InternalEel.g:1249:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:1263:4: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==14) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalEel.g:1264:5: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEOperationAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalEel.g:1268:5: ( ( ruleEString ) )
                    	    // InternalEel.g:1269:6: ( ruleEString )
                    	    {
                    	    // InternalEel.g:1269:6: ( ruleEString )
                    	    // InternalEel.g:1270:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEOperationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,28,FOLLOW_42); 

                    				newLeafNode(otherlv_19, grammarAccess.getEOperationAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:1290:3: (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalEel.g:1291:4: otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getEOperationAccess().getEAnnotationsKeyword_10_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_21, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalEel.g:1299:4: ( (lv_eAnnotations_22_0= ruleEAnnotation ) )
                    // InternalEel.g:1300:5: (lv_eAnnotations_22_0= ruleEAnnotation )
                    {
                    // InternalEel.g:1300:5: (lv_eAnnotations_22_0= ruleEAnnotation )
                    // InternalEel.g:1301:6: lv_eAnnotations_22_0= ruleEAnnotation
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

                    // InternalEel.g:1318:4: (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==14) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalEel.g:1319:5: otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_23=(Token)match(input,14,FOLLOW_25); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getEOperationAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalEel.g:1323:5: ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    // InternalEel.g:1324:6: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:1324:6: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    // InternalEel.g:1325:7: lv_eAnnotations_24_0= ruleEAnnotation
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
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,15,FOLLOW_43); 

                    				newLeafNode(otherlv_25, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:1348:3: (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==41) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalEel.g:1349:4: otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    {
                    otherlv_26=(Token)match(input,41,FOLLOW_33); 

                    				newLeafNode(otherlv_26, grammarAccess.getEOperationAccess().getEGenericTypeKeyword_11_0());
                    			
                    // InternalEel.g:1353:4: ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    // InternalEel.g:1354:5: (lv_eGenericType_27_0= ruleEGenericType )
                    {
                    // InternalEel.g:1354:5: (lv_eGenericType_27_0= ruleEGenericType )
                    // InternalEel.g:1355:6: lv_eGenericType_27_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEGenericTypeEGenericTypeParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_44);
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

            // InternalEel.g:1373:3: (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==30) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalEel.g:1374:4: otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getEOperationAccess().getETypeParametersKeyword_12_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_27); 

                    				newLeafNode(otherlv_29, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalEel.g:1382:4: ( (lv_eTypeParameters_30_0= ruleETypeParameter ) )
                    // InternalEel.g:1383:5: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    {
                    // InternalEel.g:1383:5: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    // InternalEel.g:1384:6: lv_eTypeParameters_30_0= ruleETypeParameter
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

                    // InternalEel.g:1401:4: (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalEel.g:1402:5: otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_31=(Token)match(input,14,FOLLOW_27); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getEOperationAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalEel.g:1406:5: ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    // InternalEel.g:1407:6: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    {
                    	    // InternalEel.g:1407:6: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    // InternalEel.g:1408:7: lv_eTypeParameters_32_0= ruleETypeParameter
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
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,15,FOLLOW_45); 

                    				newLeafNode(otherlv_33, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:1431:3: (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==42) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalEel.g:1432:4: otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,42,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getEOperationAccess().getEParametersKeyword_13_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_46); 

                    				newLeafNode(otherlv_35, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalEel.g:1440:4: ( (lv_eParameters_36_0= ruleEParameter ) )
                    // InternalEel.g:1441:5: (lv_eParameters_36_0= ruleEParameter )
                    {
                    // InternalEel.g:1441:5: (lv_eParameters_36_0= ruleEParameter )
                    // InternalEel.g:1442:6: lv_eParameters_36_0= ruleEParameter
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

                    // InternalEel.g:1459:4: (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==14) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalEel.g:1460:5: otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    {
                    	    otherlv_37=(Token)match(input,14,FOLLOW_46); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getEOperationAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalEel.g:1464:5: ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    // InternalEel.g:1465:6: (lv_eParameters_38_0= ruleEParameter )
                    	    {
                    	    // InternalEel.g:1465:6: (lv_eParameters_38_0= ruleEParameter )
                    	    // InternalEel.g:1466:7: lv_eParameters_38_0= ruleEParameter
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
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,15,FOLLOW_47); 

                    				newLeafNode(otherlv_39, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:1489:3: (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==43) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalEel.g:1490:4: otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,43,FOLLOW_4); 

                    				newLeafNode(otherlv_40, grammarAccess.getEOperationAccess().getEGenericExceptionsKeyword_14_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_41, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalEel.g:1498:4: ( (lv_eGenericExceptions_42_0= ruleEGenericType ) )
                    // InternalEel.g:1499:5: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    {
                    // InternalEel.g:1499:5: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    // InternalEel.g:1500:6: lv_eGenericExceptions_42_0= ruleEGenericType
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

                    // InternalEel.g:1517:4: (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==14) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalEel.g:1518:5: otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,14,FOLLOW_33); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getEOperationAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalEel.g:1522:5: ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    // InternalEel.g:1523:6: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    {
                    	    // InternalEel.g:1523:6: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    // InternalEel.g:1524:7: lv_eGenericExceptions_44_0= ruleEGenericType
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
                    	    break loop41;
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


    // $ANTLR start "entryRuleMeasurementUncertainty"
    // InternalEel.g:1555:1: entryRuleMeasurementUncertainty returns [EObject current=null] : iv_ruleMeasurementUncertainty= ruleMeasurementUncertainty EOF ;
    public final EObject entryRuleMeasurementUncertainty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementUncertainty = null;


        try {
            // InternalEel.g:1555:63: (iv_ruleMeasurementUncertainty= ruleMeasurementUncertainty EOF )
            // InternalEel.g:1556:2: iv_ruleMeasurementUncertainty= ruleMeasurementUncertainty EOF
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
    // InternalEel.g:1562:1: ruleMeasurementUncertainty returns [EObject current=null] : ( () otherlv_1= 'MeasurementUncertainty' otherlv_2= '{' (otherlv_3= 'standardUncertainty' ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'information' ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) ) )? otherlv_7= '}' ) ;
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
            // InternalEel.g:1568:2: ( ( () otherlv_1= 'MeasurementUncertainty' otherlv_2= '{' (otherlv_3= 'standardUncertainty' ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'information' ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) ) )? otherlv_7= '}' ) )
            // InternalEel.g:1569:2: ( () otherlv_1= 'MeasurementUncertainty' otherlv_2= '{' (otherlv_3= 'standardUncertainty' ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'information' ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) ) )? otherlv_7= '}' )
            {
            // InternalEel.g:1569:2: ( () otherlv_1= 'MeasurementUncertainty' otherlv_2= '{' (otherlv_3= 'standardUncertainty' ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'information' ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) ) )? otherlv_7= '}' )
            // InternalEel.g:1570:3: () otherlv_1= 'MeasurementUncertainty' otherlv_2= '{' (otherlv_3= 'standardUncertainty' ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'information' ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) ) )? otherlv_7= '}'
            {
            // InternalEel.g:1570:3: ()
            // InternalEel.g:1571:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasurementUncertaintyAccess().getMeasurementUncertaintyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMeasurementUncertaintyAccess().getMeasurementUncertaintyKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getMeasurementUncertaintyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:1585:3: (otherlv_3= 'standardUncertainty' ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==45) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalEel.g:1586:4: otherlv_3= 'standardUncertainty' ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasurementUncertaintyAccess().getStandardUncertaintyKeyword_3_0());
                    			
                    // InternalEel.g:1590:4: ( (lv_standardUncertainty_4_0= ruleEBigDecimal ) )
                    // InternalEel.g:1591:5: (lv_standardUncertainty_4_0= ruleEBigDecimal )
                    {
                    // InternalEel.g:1591:5: (lv_standardUncertainty_4_0= ruleEBigDecimal )
                    // InternalEel.g:1592:6: lv_standardUncertainty_4_0= ruleEBigDecimal
                    {

                    						newCompositeNode(grammarAccess.getMeasurementUncertaintyAccess().getStandardUncertaintyEBigDecimalParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_49);
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

            // InternalEel.g:1610:3: (otherlv_5= 'information' ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==46) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalEel.g:1611:4: otherlv_5= 'information' ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) )
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_50); 

                    				newLeafNode(otherlv_5, grammarAccess.getMeasurementUncertaintyAccess().getInformationKeyword_4_0());
                    			
                    // InternalEel.g:1615:4: ( (lv_information_6_0= ruleMeasurementUncertaintyInformation ) )
                    // InternalEel.g:1616:5: (lv_information_6_0= ruleMeasurementUncertaintyInformation )
                    {
                    // InternalEel.g:1616:5: (lv_information_6_0= ruleMeasurementUncertaintyInformation )
                    // InternalEel.g:1617:6: lv_information_6_0= ruleMeasurementUncertaintyInformation
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


    // $ANTLR start "entryRuleMeasureValue_Impl"
    // InternalEel.g:1643:1: entryRuleMeasureValue_Impl returns [EObject current=null] : iv_ruleMeasureValue_Impl= ruleMeasureValue_Impl EOF ;
    public final EObject entryRuleMeasureValue_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureValue_Impl = null;


        try {
            // InternalEel.g:1643:58: (iv_ruleMeasureValue_Impl= ruleMeasureValue_Impl EOF )
            // InternalEel.g:1644:2: iv_ruleMeasureValue_Impl= ruleMeasureValue_Impl EOF
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
    // InternalEel.g:1650:1: ruleMeasureValue_Impl returns [EObject current=null] : ( () (otherlv_1= 'target' ( ( ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_value_5_0= ruleEBigDecimal ) )? ( (lv_type_6_0= ruleType ) )? (otherlv_7= 'uncertainty' ( (lv_uncertainty_8_0= ruleMeasurementUncertainty ) ) )? ) ;
    public final EObject ruleMeasureValue_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        Enumerator lv_type_6_0 = null;

        EObject lv_uncertainty_8_0 = null;



        	enterRule();

        try {
            // InternalEel.g:1656:2: ( ( () (otherlv_1= 'target' ( ( ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_value_5_0= ruleEBigDecimal ) )? ( (lv_type_6_0= ruleType ) )? (otherlv_7= 'uncertainty' ( (lv_uncertainty_8_0= ruleMeasurementUncertainty ) ) )? ) )
            // InternalEel.g:1657:2: ( () (otherlv_1= 'target' ( ( ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_value_5_0= ruleEBigDecimal ) )? ( (lv_type_6_0= ruleType ) )? (otherlv_7= 'uncertainty' ( (lv_uncertainty_8_0= ruleMeasurementUncertainty ) ) )? )
            {
            // InternalEel.g:1657:2: ( () (otherlv_1= 'target' ( ( ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_value_5_0= ruleEBigDecimal ) )? ( (lv_type_6_0= ruleType ) )? (otherlv_7= 'uncertainty' ( (lv_uncertainty_8_0= ruleMeasurementUncertainty ) ) )? )
            // InternalEel.g:1658:3: () (otherlv_1= 'target' ( ( ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_value_5_0= ruleEBigDecimal ) )? ( (lv_type_6_0= ruleType ) )? (otherlv_7= 'uncertainty' ( (lv_uncertainty_8_0= ruleMeasurementUncertainty ) ) )?
            {
            // InternalEel.g:1658:3: ()
            // InternalEel.g:1659:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureValue_ImplAccess().getMeasureValueAction_0(),
            					current);
            			

            }

            // InternalEel.g:1665:3: (otherlv_1= 'target' ( ( ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==47) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalEel.g:1666:4: otherlv_1= 'target' ( ( ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getMeasureValue_ImplAccess().getTargetKeyword_1_0());
                    			
                    // InternalEel.g:1670:4: ( ( ruleEString ) )
                    // InternalEel.g:1671:5: ( ruleEString )
                    {
                    // InternalEel.g:1671:5: ( ruleEString )
                    // InternalEel.g:1672:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeasureValue_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getTargetClassEClassCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:1687:3: ( (lv_name_3_0= ruleEString ) )
            // InternalEel.g:1688:4: (lv_name_3_0= ruleEString )
            {
            // InternalEel.g:1688:4: (lv_name_3_0= ruleEString )
            // InternalEel.g:1689:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_51);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureValue_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,48,FOLLOW_52); 

            			newLeafNode(otherlv_4, grammarAccess.getMeasureValue_ImplAccess().getColonKeyword_3());
            		
            // InternalEel.g:1710:3: ( (lv_value_5_0= ruleEBigDecimal ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_INT||LA46_0==20) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalEel.g:1711:4: (lv_value_5_0= ruleEBigDecimal )
                    {
                    // InternalEel.g:1711:4: (lv_value_5_0= ruleEBigDecimal )
                    // InternalEel.g:1712:5: lv_value_5_0= ruleEBigDecimal
                    {

                    					newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getValueEBigDecimalParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_53);
                    lv_value_5_0=ruleEBigDecimal();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMeasureValue_ImplRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_5_0,
                    						"fr.tblf.energy.estimation.Eel.EBigDecimal");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:1729:3: ( (lv_type_6_0= ruleType ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=115 && LA47_0<=120)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalEel.g:1730:4: (lv_type_6_0= ruleType )
                    {
                    // InternalEel.g:1730:4: (lv_type_6_0= ruleType )
                    // InternalEel.g:1731:5: lv_type_6_0= ruleType
                    {

                    					newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getTypeTypeEnumRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_54);
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
                    break;

            }

            // InternalEel.g:1748:3: (otherlv_7= 'uncertainty' ( (lv_uncertainty_8_0= ruleMeasurementUncertainty ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==49) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalEel.g:1749:4: otherlv_7= 'uncertainty' ( (lv_uncertainty_8_0= ruleMeasurementUncertainty ) )
                    {
                    otherlv_7=(Token)match(input,49,FOLLOW_55); 

                    				newLeafNode(otherlv_7, grammarAccess.getMeasureValue_ImplAccess().getUncertaintyKeyword_6_0());
                    			
                    // InternalEel.g:1753:4: ( (lv_uncertainty_8_0= ruleMeasurementUncertainty ) )
                    // InternalEel.g:1754:5: (lv_uncertainty_8_0= ruleMeasurementUncertainty )
                    {
                    // InternalEel.g:1754:5: (lv_uncertainty_8_0= ruleMeasurementUncertainty )
                    // InternalEel.g:1755:6: lv_uncertainty_8_0= ruleMeasurementUncertainty
                    {

                    						newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getUncertaintyMeasurementUncertaintyParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_uncertainty_8_0=ruleMeasurementUncertainty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureValue_ImplRule());
                    						}
                    						set(
                    							current,
                    							"uncertainty",
                    							lv_uncertainty_8_0,
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
    // InternalEel.g:1777:1: entryRuleMeasureOCL returns [EObject current=null] : iv_ruleMeasureOCL= ruleMeasureOCL EOF ;
    public final EObject entryRuleMeasureOCL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureOCL = null;


        try {
            // InternalEel.g:1777:51: (iv_ruleMeasureOCL= ruleMeasureOCL EOF )
            // InternalEel.g:1778:2: iv_ruleMeasureOCL= ruleMeasureOCL EOF
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
    // InternalEel.g:1784:1: ruleMeasureOCL returns [EObject current=null] : ( () otherlv_1= 'MeasureOCL' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEBigDecimal ) ) )? (otherlv_6= 'oclQuery' ( (lv_oclQuery_7_0= ruleEString ) ) )? (otherlv_8= 'targetClass' ( ( ruleEString ) ) )? (otherlv_10= 'targetOperation' ( ( ruleEString ) ) )? (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleMeasureOCL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_oclQuery_7_0 = null;

        EObject lv_uncertainty_13_0 = null;



        	enterRule();

        try {
            // InternalEel.g:1790:2: ( ( () otherlv_1= 'MeasureOCL' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEBigDecimal ) ) )? (otherlv_6= 'oclQuery' ( (lv_oclQuery_7_0= ruleEString ) ) )? (otherlv_8= 'targetClass' ( ( ruleEString ) ) )? (otherlv_10= 'targetOperation' ( ( ruleEString ) ) )? (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )? otherlv_14= '}' ) )
            // InternalEel.g:1791:2: ( () otherlv_1= 'MeasureOCL' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEBigDecimal ) ) )? (otherlv_6= 'oclQuery' ( (lv_oclQuery_7_0= ruleEString ) ) )? (otherlv_8= 'targetClass' ( ( ruleEString ) ) )? (otherlv_10= 'targetOperation' ( ( ruleEString ) ) )? (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )? otherlv_14= '}' )
            {
            // InternalEel.g:1791:2: ( () otherlv_1= 'MeasureOCL' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEBigDecimal ) ) )? (otherlv_6= 'oclQuery' ( (lv_oclQuery_7_0= ruleEString ) ) )? (otherlv_8= 'targetClass' ( ( ruleEString ) ) )? (otherlv_10= 'targetOperation' ( ( ruleEString ) ) )? (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )? otherlv_14= '}' )
            // InternalEel.g:1792:3: () otherlv_1= 'MeasureOCL' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEBigDecimal ) ) )? (otherlv_6= 'oclQuery' ( (lv_oclQuery_7_0= ruleEString ) ) )? (otherlv_8= 'targetClass' ( ( ruleEString ) ) )? (otherlv_10= 'targetOperation' ( ( ruleEString ) ) )? (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )? otherlv_14= '}'
            {
            // InternalEel.g:1792:3: ()
            // InternalEel.g:1793:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureOCLAccess().getMeasureOCLAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMeasureOCLAccess().getMeasureOCLKeyword_1());
            		
            // InternalEel.g:1803:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:1804:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:1804:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:1805:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureOCLAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureOCLRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_3, grammarAccess.getMeasureOCLAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:1826:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleEBigDecimal ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==18) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalEel.g:1827:4: otherlv_4= 'value' ( (lv_value_5_0= ruleEBigDecimal ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeasureOCLAccess().getValueKeyword_4_0());
                    			
                    // InternalEel.g:1831:4: ( (lv_value_5_0= ruleEBigDecimal ) )
                    // InternalEel.g:1832:5: (lv_value_5_0= ruleEBigDecimal )
                    {
                    // InternalEel.g:1832:5: (lv_value_5_0= ruleEBigDecimal )
                    // InternalEel.g:1833:6: lv_value_5_0= ruleEBigDecimal
                    {

                    						newCompositeNode(grammarAccess.getMeasureOCLAccess().getValueEBigDecimalParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_value_5_0=ruleEBigDecimal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureOCLRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"fr.tblf.energy.estimation.Eel.EBigDecimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:1851:3: (otherlv_6= 'oclQuery' ( (lv_oclQuery_7_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==51) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalEel.g:1852:4: otherlv_6= 'oclQuery' ( (lv_oclQuery_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getMeasureOCLAccess().getOclQueryKeyword_5_0());
                    			
                    // InternalEel.g:1856:4: ( (lv_oclQuery_7_0= ruleEString ) )
                    // InternalEel.g:1857:5: (lv_oclQuery_7_0= ruleEString )
                    {
                    // InternalEel.g:1857:5: (lv_oclQuery_7_0= ruleEString )
                    // InternalEel.g:1858:6: lv_oclQuery_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureOCLAccess().getOclQueryEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_58);
                    lv_oclQuery_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureOCLRule());
                    						}
                    						set(
                    							current,
                    							"oclQuery",
                    							lv_oclQuery_7_0,
                    							"fr.tblf.energy.estimation.Eel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:1876:3: (otherlv_8= 'targetClass' ( ( ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==52) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalEel.g:1877:4: otherlv_8= 'targetClass' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,52,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getMeasureOCLAccess().getTargetClassKeyword_6_0());
                    			
                    // InternalEel.g:1881:4: ( ( ruleEString ) )
                    // InternalEel.g:1882:5: ( ruleEString )
                    {
                    // InternalEel.g:1882:5: ( ruleEString )
                    // InternalEel.g:1883:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeasureOCLRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMeasureOCLAccess().getTargetClassEClassCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_59);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:1898:3: (otherlv_10= 'targetOperation' ( ( ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==53) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalEel.g:1899:4: otherlv_10= 'targetOperation' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getMeasureOCLAccess().getTargetOperationKeyword_7_0());
                    			
                    // InternalEel.g:1903:4: ( ( ruleEString ) )
                    // InternalEel.g:1904:5: ( ruleEString )
                    {
                    // InternalEel.g:1904:5: ( ruleEString )
                    // InternalEel.g:1905:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeasureOCLRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMeasureOCLAccess().getTargetOperationEOperationCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:1920:3: (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==49) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalEel.g:1921:4: otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) )
                    {
                    otherlv_12=(Token)match(input,49,FOLLOW_55); 

                    				newLeafNode(otherlv_12, grammarAccess.getMeasureOCLAccess().getUncertaintyKeyword_8_0());
                    			
                    // InternalEel.g:1925:4: ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) )
                    // InternalEel.g:1926:5: (lv_uncertainty_13_0= ruleMeasurementUncertainty )
                    {
                    // InternalEel.g:1926:5: (lv_uncertainty_13_0= ruleMeasurementUncertainty )
                    // InternalEel.g:1927:6: lv_uncertainty_13_0= ruleMeasurementUncertainty
                    {

                    						newCompositeNode(grammarAccess.getMeasureOCLAccess().getUncertaintyMeasurementUncertaintyParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_uncertainty_13_0=ruleMeasurementUncertainty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureOCLRule());
                    						}
                    						set(
                    							current,
                    							"uncertainty",
                    							lv_uncertainty_13_0,
                    							"fr.tblf.energy.estimation.Eel.MeasurementUncertainty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getMeasureOCLAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalEel.g:1953:1: entryRuleMeasureAttribute returns [EObject current=null] : iv_ruleMeasureAttribute= ruleMeasureAttribute EOF ;
    public final EObject entryRuleMeasureAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureAttribute = null;


        try {
            // InternalEel.g:1953:57: (iv_ruleMeasureAttribute= ruleMeasureAttribute EOF )
            // InternalEel.g:1954:2: iv_ruleMeasureAttribute= ruleMeasureAttribute EOF
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
    // InternalEel.g:1960:1: ruleMeasureAttribute returns [EObject current=null] : ( () otherlv_1= 'MeasureAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEBigDecimal ) ) )? (otherlv_6= 'targetClass' ( ( ruleEString ) ) )? (otherlv_8= 'targetOperation' ( ( ruleEString ) ) )? (otherlv_10= 'att' ( ( ruleEString ) ) )? (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleMeasureAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        EObject lv_uncertainty_13_0 = null;



        	enterRule();

        try {
            // InternalEel.g:1966:2: ( ( () otherlv_1= 'MeasureAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEBigDecimal ) ) )? (otherlv_6= 'targetClass' ( ( ruleEString ) ) )? (otherlv_8= 'targetOperation' ( ( ruleEString ) ) )? (otherlv_10= 'att' ( ( ruleEString ) ) )? (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )? otherlv_14= '}' ) )
            // InternalEel.g:1967:2: ( () otherlv_1= 'MeasureAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEBigDecimal ) ) )? (otherlv_6= 'targetClass' ( ( ruleEString ) ) )? (otherlv_8= 'targetOperation' ( ( ruleEString ) ) )? (otherlv_10= 'att' ( ( ruleEString ) ) )? (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )? otherlv_14= '}' )
            {
            // InternalEel.g:1967:2: ( () otherlv_1= 'MeasureAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEBigDecimal ) ) )? (otherlv_6= 'targetClass' ( ( ruleEString ) ) )? (otherlv_8= 'targetOperation' ( ( ruleEString ) ) )? (otherlv_10= 'att' ( ( ruleEString ) ) )? (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )? otherlv_14= '}' )
            // InternalEel.g:1968:3: () otherlv_1= 'MeasureAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEBigDecimal ) ) )? (otherlv_6= 'targetClass' ( ( ruleEString ) ) )? (otherlv_8= 'targetOperation' ( ( ruleEString ) ) )? (otherlv_10= 'att' ( ( ruleEString ) ) )? (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )? otherlv_14= '}'
            {
            // InternalEel.g:1968:3: ()
            // InternalEel.g:1969:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureAttributeAccess().getMeasureAttributeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMeasureAttributeAccess().getMeasureAttributeKeyword_1());
            		
            // InternalEel.g:1979:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:1980:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:1980:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:1981:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureAttributeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_61); 

            			newLeafNode(otherlv_3, grammarAccess.getMeasureAttributeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:2002:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleEBigDecimal ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==18) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalEel.g:2003:4: otherlv_4= 'value' ( (lv_value_5_0= ruleEBigDecimal ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeasureAttributeAccess().getValueKeyword_4_0());
                    			
                    // InternalEel.g:2007:4: ( (lv_value_5_0= ruleEBigDecimal ) )
                    // InternalEel.g:2008:5: (lv_value_5_0= ruleEBigDecimal )
                    {
                    // InternalEel.g:2008:5: (lv_value_5_0= ruleEBigDecimal )
                    // InternalEel.g:2009:6: lv_value_5_0= ruleEBigDecimal
                    {

                    						newCompositeNode(grammarAccess.getMeasureAttributeAccess().getValueEBigDecimalParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_62);
                    lv_value_5_0=ruleEBigDecimal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureAttributeRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"fr.tblf.energy.estimation.Eel.EBigDecimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2027:3: (otherlv_6= 'targetClass' ( ( ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==52) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalEel.g:2028:4: otherlv_6= 'targetClass' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,52,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getMeasureAttributeAccess().getTargetClassKeyword_5_0());
                    			
                    // InternalEel.g:2032:4: ( ( ruleEString ) )
                    // InternalEel.g:2033:5: ( ruleEString )
                    {
                    // InternalEel.g:2033:5: ( ruleEString )
                    // InternalEel.g:2034:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeasureAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMeasureAttributeAccess().getTargetClassEClassCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_63);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2049:3: (otherlv_8= 'targetOperation' ( ( ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==53) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalEel.g:2050:4: otherlv_8= 'targetOperation' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getMeasureAttributeAccess().getTargetOperationKeyword_6_0());
                    			
                    // InternalEel.g:2054:4: ( ( ruleEString ) )
                    // InternalEel.g:2055:5: ( ruleEString )
                    {
                    // InternalEel.g:2055:5: ( ruleEString )
                    // InternalEel.g:2056:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeasureAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMeasureAttributeAccess().getTargetOperationEOperationCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2071:3: (otherlv_10= 'att' ( ( ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==55) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalEel.g:2072:4: otherlv_10= 'att' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,55,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getMeasureAttributeAccess().getAttKeyword_7_0());
                    			
                    // InternalEel.g:2076:4: ( ( ruleEString ) )
                    // InternalEel.g:2077:5: ( ruleEString )
                    {
                    // InternalEel.g:2077:5: ( ruleEString )
                    // InternalEel.g:2078:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeasureAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMeasureAttributeAccess().getAttEAttributeCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2093:3: (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==49) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalEel.g:2094:4: otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) )
                    {
                    otherlv_12=(Token)match(input,49,FOLLOW_55); 

                    				newLeafNode(otherlv_12, grammarAccess.getMeasureAttributeAccess().getUncertaintyKeyword_8_0());
                    			
                    // InternalEel.g:2098:4: ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) )
                    // InternalEel.g:2099:5: (lv_uncertainty_13_0= ruleMeasurementUncertainty )
                    {
                    // InternalEel.g:2099:5: (lv_uncertainty_13_0= ruleMeasurementUncertainty )
                    // InternalEel.g:2100:6: lv_uncertainty_13_0= ruleMeasurementUncertainty
                    {

                    						newCompositeNode(grammarAccess.getMeasureAttributeAccess().getUncertaintyMeasurementUncertaintyParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_uncertainty_13_0=ruleMeasurementUncertainty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureAttributeRule());
                    						}
                    						set(
                    							current,
                    							"uncertainty",
                    							lv_uncertainty_13_0,
                    							"fr.tblf.energy.estimation.Eel.MeasurementUncertainty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getMeasureAttributeAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalEel.g:2126:1: entryRuleMeasureCast returns [EObject current=null] : iv_ruleMeasureCast= ruleMeasureCast EOF ;
    public final EObject entryRuleMeasureCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureCast = null;


        try {
            // InternalEel.g:2126:52: (iv_ruleMeasureCast= ruleMeasureCast EOF )
            // InternalEel.g:2127:2: iv_ruleMeasureCast= ruleMeasureCast EOF
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
    // InternalEel.g:2133:1: ruleMeasureCast returns [EObject current=null] : (otherlv_0= 'MeasureCast' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'targetClass' ( ( ruleEString ) ) )? (otherlv_5= 'targetOperation' ( ( ruleEString ) ) )? otherlv_7= 'measure' ( ( ruleEString ) ) (otherlv_9= 'uncertainty' ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleMeasureCast() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_uncertainty_10_0 = null;



        	enterRule();

        try {
            // InternalEel.g:2139:2: ( (otherlv_0= 'MeasureCast' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'targetClass' ( ( ruleEString ) ) )? (otherlv_5= 'targetOperation' ( ( ruleEString ) ) )? otherlv_7= 'measure' ( ( ruleEString ) ) (otherlv_9= 'uncertainty' ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) ) )? otherlv_11= '}' ) )
            // InternalEel.g:2140:2: (otherlv_0= 'MeasureCast' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'targetClass' ( ( ruleEString ) ) )? (otherlv_5= 'targetOperation' ( ( ruleEString ) ) )? otherlv_7= 'measure' ( ( ruleEString ) ) (otherlv_9= 'uncertainty' ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) ) )? otherlv_11= '}' )
            {
            // InternalEel.g:2140:2: (otherlv_0= 'MeasureCast' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'targetClass' ( ( ruleEString ) ) )? (otherlv_5= 'targetOperation' ( ( ruleEString ) ) )? otherlv_7= 'measure' ( ( ruleEString ) ) (otherlv_9= 'uncertainty' ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) ) )? otherlv_11= '}' )
            // InternalEel.g:2141:3: otherlv_0= 'MeasureCast' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'targetClass' ( ( ruleEString ) ) )? (otherlv_5= 'targetOperation' ( ( ruleEString ) ) )? otherlv_7= 'measure' ( ( ruleEString ) ) (otherlv_9= 'uncertainty' ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMeasureCastAccess().getMeasureCastKeyword_0());
            		
            // InternalEel.g:2145:3: ( (lv_name_1_0= ruleEString ) )
            // InternalEel.g:2146:4: (lv_name_1_0= ruleEString )
            {
            // InternalEel.g:2146:4: (lv_name_1_0= ruleEString )
            // InternalEel.g:2147:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureCastAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureCastRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_65); 

            			newLeafNode(otherlv_2, grammarAccess.getMeasureCastAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:2168:3: (otherlv_3= 'targetClass' ( ( ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==52) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalEel.g:2169:4: otherlv_3= 'targetClass' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureCastAccess().getTargetClassKeyword_3_0());
                    			
                    // InternalEel.g:2173:4: ( ( ruleEString ) )
                    // InternalEel.g:2174:5: ( ruleEString )
                    {
                    // InternalEel.g:2174:5: ( ruleEString )
                    // InternalEel.g:2175:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeasureCastRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMeasureCastAccess().getTargetClassEClassCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_66);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2190:3: (otherlv_5= 'targetOperation' ( ( ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==53) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalEel.g:2191:4: otherlv_5= 'targetOperation' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getMeasureCastAccess().getTargetOperationKeyword_4_0());
                    			
                    // InternalEel.g:2195:4: ( ( ruleEString ) )
                    // InternalEel.g:2196:5: ( ruleEString )
                    {
                    // InternalEel.g:2196:5: ( ruleEString )
                    // InternalEel.g:2197:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeasureCastRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMeasureCastAccess().getTargetOperationEOperationCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasureCastAccess().getMeasureKeyword_5());
            		
            // InternalEel.g:2216:3: ( ( ruleEString ) )
            // InternalEel.g:2217:4: ( ruleEString )
            {
            // InternalEel.g:2217:4: ( ruleEString )
            // InternalEel.g:2218:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureCastRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureCastAccess().getMeasureMeasureCrossReference_6_0());
            				
            pushFollow(FOLLOW_60);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:2232:3: (otherlv_9= 'uncertainty' ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==49) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalEel.g:2233:4: otherlv_9= 'uncertainty' ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) )
                    {
                    otherlv_9=(Token)match(input,49,FOLLOW_55); 

                    				newLeafNode(otherlv_9, grammarAccess.getMeasureCastAccess().getUncertaintyKeyword_7_0());
                    			
                    // InternalEel.g:2237:4: ( (lv_uncertainty_10_0= ruleMeasurementUncertainty ) )
                    // InternalEel.g:2238:5: (lv_uncertainty_10_0= ruleMeasurementUncertainty )
                    {
                    // InternalEel.g:2238:5: (lv_uncertainty_10_0= ruleMeasurementUncertainty )
                    // InternalEel.g:2239:6: lv_uncertainty_10_0= ruleMeasurementUncertainty
                    {

                    						newCompositeNode(grammarAccess.getMeasureCastAccess().getUncertaintyMeasurementUncertaintyParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_uncertainty_10_0=ruleMeasurementUncertainty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureCastRule());
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

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getMeasureCastAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalEel.g:2265:1: entryRuleMeasureProductOperation_Impl returns [EObject current=null] : iv_ruleMeasureProductOperation_Impl= ruleMeasureProductOperation_Impl EOF ;
    public final EObject entryRuleMeasureProductOperation_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureProductOperation_Impl = null;


        try {
            // InternalEel.g:2265:69: (iv_ruleMeasureProductOperation_Impl= ruleMeasureProductOperation_Impl EOF )
            // InternalEel.g:2266:2: iv_ruleMeasureProductOperation_Impl= ruleMeasureProductOperation_Impl EOF
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
    // InternalEel.g:2272:1: ruleMeasureProductOperation_Impl returns [EObject current=null] : ( () (otherlv_1= 'targetClass' ( ( ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '*' ( ( ruleEString ) ) ) ;
    public final EObject ruleMeasureProductOperation_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalEel.g:2278:2: ( ( () (otherlv_1= 'targetClass' ( ( ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '*' ( ( ruleEString ) ) ) )
            // InternalEel.g:2279:2: ( () (otherlv_1= 'targetClass' ( ( ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '*' ( ( ruleEString ) ) )
            {
            // InternalEel.g:2279:2: ( () (otherlv_1= 'targetClass' ( ( ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '*' ( ( ruleEString ) ) )
            // InternalEel.g:2280:3: () (otherlv_1= 'targetClass' ( ( ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '*' ( ( ruleEString ) )
            {
            // InternalEel.g:2280:3: ()
            // InternalEel.g:2281:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureProductOperation_ImplAccess().getMeasureProductOperationAction_0(),
            					current);
            			

            }

            // InternalEel.g:2287:3: (otherlv_1= 'targetClass' ( ( ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==52) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalEel.g:2288:4: otherlv_1= 'targetClass' ( ( ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getMeasureProductOperation_ImplAccess().getTargetClassKeyword_1_0());
                    			
                    // InternalEel.g:2292:4: ( ( ruleEString ) )
                    // InternalEel.g:2293:5: ( ruleEString )
                    {
                    // InternalEel.g:2293:5: ( ruleEString )
                    // InternalEel.g:2294:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeasureProductOperation_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMeasureProductOperation_ImplAccess().getTargetClassEClassCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2309:3: ( (lv_name_3_0= ruleEString ) )
            // InternalEel.g:2310:4: (lv_name_3_0= ruleEString )
            {
            // InternalEel.g:2310:4: (lv_name_3_0= ruleEString )
            // InternalEel.g:2311:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureProductOperation_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_51);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureProductOperation_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getMeasureProductOperation_ImplAccess().getColonKeyword_3());
            		
            // InternalEel.g:2332:3: ( ( ruleEString ) )
            // InternalEel.g:2333:4: ( ruleEString )
            {
            // InternalEel.g:2333:4: ( ruleEString )
            // InternalEel.g:2334:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureProductOperation_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureProductOperation_ImplAccess().getLeftMeasureCrossReference_4_0());
            				
            pushFollow(FOLLOW_68);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getMeasureProductOperation_ImplAccess().getAsteriskKeyword_5());
            		
            // InternalEel.g:2352:3: ( ( ruleEString ) )
            // InternalEel.g:2353:4: ( ruleEString )
            {
            // InternalEel.g:2353:4: ( ruleEString )
            // InternalEel.g:2354:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureProductOperation_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureProductOperation_ImplAccess().getRightMeasureCrossReference_6_0());
            				
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
    // $ANTLR end "ruleMeasureProductOperation_Impl"


    // $ANTLR start "entryRuleMeasureSumOperation"
    // InternalEel.g:2372:1: entryRuleMeasureSumOperation returns [EObject current=null] : iv_ruleMeasureSumOperation= ruleMeasureSumOperation EOF ;
    public final EObject entryRuleMeasureSumOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureSumOperation = null;


        try {
            // InternalEel.g:2372:60: (iv_ruleMeasureSumOperation= ruleMeasureSumOperation EOF )
            // InternalEel.g:2373:2: iv_ruleMeasureSumOperation= ruleMeasureSumOperation EOF
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
    // InternalEel.g:2379:1: ruleMeasureSumOperation returns [EObject current=null] : ( () (otherlv_1= 'targetClass' ( ( ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '+' ( ( ruleEString ) ) ( (lv_name_8_0= ruleEString ) ) ) ;
    public final EObject ruleMeasureSumOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_name_8_0 = null;



        	enterRule();

        try {
            // InternalEel.g:2385:2: ( ( () (otherlv_1= 'targetClass' ( ( ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '+' ( ( ruleEString ) ) ( (lv_name_8_0= ruleEString ) ) ) )
            // InternalEel.g:2386:2: ( () (otherlv_1= 'targetClass' ( ( ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '+' ( ( ruleEString ) ) ( (lv_name_8_0= ruleEString ) ) )
            {
            // InternalEel.g:2386:2: ( () (otherlv_1= 'targetClass' ( ( ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '+' ( ( ruleEString ) ) ( (lv_name_8_0= ruleEString ) ) )
            // InternalEel.g:2387:3: () (otherlv_1= 'targetClass' ( ( ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) otherlv_6= '+' ( ( ruleEString ) ) ( (lv_name_8_0= ruleEString ) )
            {
            // InternalEel.g:2387:3: ()
            // InternalEel.g:2388:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureSumOperationAccess().getMeasureSumOperationAction_0(),
            					current);
            			

            }

            // InternalEel.g:2394:3: (otherlv_1= 'targetClass' ( ( ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==52) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalEel.g:2395:4: otherlv_1= 'targetClass' ( ( ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getMeasureSumOperationAccess().getTargetClassKeyword_1_0());
                    			
                    // InternalEel.g:2399:4: ( ( ruleEString ) )
                    // InternalEel.g:2400:5: ( ruleEString )
                    {
                    // InternalEel.g:2400:5: ( ruleEString )
                    // InternalEel.g:2401:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeasureSumOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMeasureSumOperationAccess().getTargetClassEClassCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2416:3: ( (lv_name_3_0= ruleEString ) )
            // InternalEel.g:2417:4: (lv_name_3_0= ruleEString )
            {
            // InternalEel.g:2417:4: (lv_name_3_0= ruleEString )
            // InternalEel.g:2418:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureSumOperationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_51);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureSumOperationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getMeasureSumOperationAccess().getColonKeyword_3());
            		
            // InternalEel.g:2439:3: ( ( ruleEString ) )
            // InternalEel.g:2440:4: ( ruleEString )
            {
            // InternalEel.g:2440:4: ( ruleEString )
            // InternalEel.g:2441:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureSumOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureSumOperationAccess().getLeftMeasureCrossReference_4_0());
            				
            pushFollow(FOLLOW_69);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,59,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getMeasureSumOperationAccess().getPlusSignKeyword_5());
            		
            // InternalEel.g:2459:3: ( ( ruleEString ) )
            // InternalEel.g:2460:4: ( ruleEString )
            {
            // InternalEel.g:2460:4: ( ruleEString )
            // InternalEel.g:2461:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureSumOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureSumOperationAccess().getRightMeasureCrossReference_6_0());
            				
            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEel.g:2475:3: ( (lv_name_8_0= ruleEString ) )
            // InternalEel.g:2476:4: (lv_name_8_0= ruleEString )
            {
            // InternalEel.g:2476:4: (lv_name_8_0= ruleEString )
            // InternalEel.g:2477:5: lv_name_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureSumOperationAccess().getNameEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureSumOperationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_8_0,
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
    // $ANTLR end "ruleMeasureSumOperation"


    // $ANTLR start "entryRuleEnergyComputation"
    // InternalEel.g:2498:1: entryRuleEnergyComputation returns [EObject current=null] : iv_ruleEnergyComputation= ruleEnergyComputation EOF ;
    public final EObject entryRuleEnergyComputation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnergyComputation = null;


        try {
            // InternalEel.g:2498:58: (iv_ruleEnergyComputation= ruleEnergyComputation EOF )
            // InternalEel.g:2499:2: iv_ruleEnergyComputation= ruleEnergyComputation EOF
            {
             newCompositeNode(grammarAccess.getEnergyComputationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnergyComputation=ruleEnergyComputation();

            state._fsp--;

             current =iv_ruleEnergyComputation; 
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
    // $ANTLR end "entryRuleEnergyComputation"


    // $ANTLR start "ruleEnergyComputation"
    // InternalEel.g:2505:1: ruleEnergyComputation returns [EObject current=null] : ( () otherlv_1= 'EnergyComputation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetClass' ( ( ruleEString ) ) )? (otherlv_6= 'targetOperation' ( ( ruleEString ) ) )? (otherlv_8= 'left' ( ( ruleEString ) ) )? (otherlv_10= 'right' ( ( ruleEString ) ) )? (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleEnergyComputation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_uncertainty_13_0 = null;



        	enterRule();

        try {
            // InternalEel.g:2511:2: ( ( () otherlv_1= 'EnergyComputation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetClass' ( ( ruleEString ) ) )? (otherlv_6= 'targetOperation' ( ( ruleEString ) ) )? (otherlv_8= 'left' ( ( ruleEString ) ) )? (otherlv_10= 'right' ( ( ruleEString ) ) )? (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )? otherlv_14= '}' ) )
            // InternalEel.g:2512:2: ( () otherlv_1= 'EnergyComputation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetClass' ( ( ruleEString ) ) )? (otherlv_6= 'targetOperation' ( ( ruleEString ) ) )? (otherlv_8= 'left' ( ( ruleEString ) ) )? (otherlv_10= 'right' ( ( ruleEString ) ) )? (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )? otherlv_14= '}' )
            {
            // InternalEel.g:2512:2: ( () otherlv_1= 'EnergyComputation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetClass' ( ( ruleEString ) ) )? (otherlv_6= 'targetOperation' ( ( ruleEString ) ) )? (otherlv_8= 'left' ( ( ruleEString ) ) )? (otherlv_10= 'right' ( ( ruleEString ) ) )? (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )? otherlv_14= '}' )
            // InternalEel.g:2513:3: () otherlv_1= 'EnergyComputation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetClass' ( ( ruleEString ) ) )? (otherlv_6= 'targetOperation' ( ( ruleEString ) ) )? (otherlv_8= 'left' ( ( ruleEString ) ) )? (otherlv_10= 'right' ( ( ruleEString ) ) )? (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )? otherlv_14= '}'
            {
            // InternalEel.g:2513:3: ()
            // InternalEel.g:2514:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnergyComputationAccess().getEnergyComputationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnergyComputationAccess().getEnergyComputationKeyword_1());
            		
            // InternalEel.g:2524:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:2525:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:2525:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:2526:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnergyComputationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnergyComputationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_3, grammarAccess.getEnergyComputationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:2547:3: (otherlv_4= 'targetClass' ( ( ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==52) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalEel.g:2548:4: otherlv_4= 'targetClass' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnergyComputationAccess().getTargetClassKeyword_4_0());
                    			
                    // InternalEel.g:2552:4: ( ( ruleEString ) )
                    // InternalEel.g:2553:5: ( ruleEString )
                    {
                    // InternalEel.g:2553:5: ( ruleEString )
                    // InternalEel.g:2554:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnergyComputationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEnergyComputationAccess().getTargetClassEClassCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_71);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2569:3: (otherlv_6= 'targetOperation' ( ( ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==53) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalEel.g:2570:4: otherlv_6= 'targetOperation' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEnergyComputationAccess().getTargetOperationKeyword_5_0());
                    			
                    // InternalEel.g:2574:4: ( ( ruleEString ) )
                    // InternalEel.g:2575:5: ( ruleEString )
                    {
                    // InternalEel.g:2575:5: ( ruleEString )
                    // InternalEel.g:2576:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnergyComputationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEnergyComputationAccess().getTargetOperationEOperationCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_72);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2591:3: (otherlv_8= 'left' ( ( ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==61) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalEel.g:2592:4: otherlv_8= 'left' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,61,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getEnergyComputationAccess().getLeftKeyword_6_0());
                    			
                    // InternalEel.g:2596:4: ( ( ruleEString ) )
                    // InternalEel.g:2597:5: ( ruleEString )
                    {
                    // InternalEel.g:2597:5: ( ruleEString )
                    // InternalEel.g:2598:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnergyComputationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEnergyComputationAccess().getLeftMeasureCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2613:3: (otherlv_10= 'right' ( ( ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==62) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalEel.g:2614:4: otherlv_10= 'right' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getEnergyComputationAccess().getRightKeyword_7_0());
                    			
                    // InternalEel.g:2618:4: ( ( ruleEString ) )
                    // InternalEel.g:2619:5: ( ruleEString )
                    {
                    // InternalEel.g:2619:5: ( ruleEString )
                    // InternalEel.g:2620:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnergyComputationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEnergyComputationAccess().getRightMeasureCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2635:3: (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==49) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalEel.g:2636:4: otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) )
                    {
                    otherlv_12=(Token)match(input,49,FOLLOW_55); 

                    				newLeafNode(otherlv_12, grammarAccess.getEnergyComputationAccess().getUncertaintyKeyword_8_0());
                    			
                    // InternalEel.g:2640:4: ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) )
                    // InternalEel.g:2641:5: (lv_uncertainty_13_0= ruleMeasurementUncertainty )
                    {
                    // InternalEel.g:2641:5: (lv_uncertainty_13_0= ruleMeasurementUncertainty )
                    // InternalEel.g:2642:6: lv_uncertainty_13_0= ruleMeasurementUncertainty
                    {

                    						newCompositeNode(grammarAccess.getEnergyComputationAccess().getUncertaintyMeasurementUncertaintyParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_uncertainty_13_0=ruleMeasurementUncertainty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnergyComputationRule());
                    						}
                    						set(
                    							current,
                    							"uncertainty",
                    							lv_uncertainty_13_0,
                    							"fr.tblf.energy.estimation.Eel.MeasurementUncertainty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getEnergyComputationAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleEnergyComputation"


    // $ANTLR start "entryRulePowerComputation"
    // InternalEel.g:2668:1: entryRulePowerComputation returns [EObject current=null] : iv_rulePowerComputation= rulePowerComputation EOF ;
    public final EObject entryRulePowerComputation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerComputation = null;


        try {
            // InternalEel.g:2668:57: (iv_rulePowerComputation= rulePowerComputation EOF )
            // InternalEel.g:2669:2: iv_rulePowerComputation= rulePowerComputation EOF
            {
             newCompositeNode(grammarAccess.getPowerComputationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePowerComputation=rulePowerComputation();

            state._fsp--;

             current =iv_rulePowerComputation; 
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
    // $ANTLR end "entryRulePowerComputation"


    // $ANTLR start "rulePowerComputation"
    // InternalEel.g:2675:1: rulePowerComputation returns [EObject current=null] : ( () otherlv_1= 'PowerComputation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetClass' ( ( ruleEString ) ) )? (otherlv_6= 'targetOperation' ( ( ruleEString ) ) )? (otherlv_8= 'left' ( ( ruleEString ) ) )? (otherlv_10= 'right' ( ( ruleEString ) ) )? (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )? otherlv_14= '}' ) ;
    public final EObject rulePowerComputation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_uncertainty_13_0 = null;



        	enterRule();

        try {
            // InternalEel.g:2681:2: ( ( () otherlv_1= 'PowerComputation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetClass' ( ( ruleEString ) ) )? (otherlv_6= 'targetOperation' ( ( ruleEString ) ) )? (otherlv_8= 'left' ( ( ruleEString ) ) )? (otherlv_10= 'right' ( ( ruleEString ) ) )? (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )? otherlv_14= '}' ) )
            // InternalEel.g:2682:2: ( () otherlv_1= 'PowerComputation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetClass' ( ( ruleEString ) ) )? (otherlv_6= 'targetOperation' ( ( ruleEString ) ) )? (otherlv_8= 'left' ( ( ruleEString ) ) )? (otherlv_10= 'right' ( ( ruleEString ) ) )? (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )? otherlv_14= '}' )
            {
            // InternalEel.g:2682:2: ( () otherlv_1= 'PowerComputation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetClass' ( ( ruleEString ) ) )? (otherlv_6= 'targetOperation' ( ( ruleEString ) ) )? (otherlv_8= 'left' ( ( ruleEString ) ) )? (otherlv_10= 'right' ( ( ruleEString ) ) )? (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )? otherlv_14= '}' )
            // InternalEel.g:2683:3: () otherlv_1= 'PowerComputation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetClass' ( ( ruleEString ) ) )? (otherlv_6= 'targetOperation' ( ( ruleEString ) ) )? (otherlv_8= 'left' ( ( ruleEString ) ) )? (otherlv_10= 'right' ( ( ruleEString ) ) )? (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )? otherlv_14= '}'
            {
            // InternalEel.g:2683:3: ()
            // InternalEel.g:2684:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPowerComputationAccess().getPowerComputationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPowerComputationAccess().getPowerComputationKeyword_1());
            		
            // InternalEel.g:2694:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:2695:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:2695:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:2696:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPowerComputationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPowerComputationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.tblf.energy.estimation.Eel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_3, grammarAccess.getPowerComputationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:2717:3: (otherlv_4= 'targetClass' ( ( ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==52) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalEel.g:2718:4: otherlv_4= 'targetClass' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getPowerComputationAccess().getTargetClassKeyword_4_0());
                    			
                    // InternalEel.g:2722:4: ( ( ruleEString ) )
                    // InternalEel.g:2723:5: ( ruleEString )
                    {
                    // InternalEel.g:2723:5: ( ruleEString )
                    // InternalEel.g:2724:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPowerComputationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPowerComputationAccess().getTargetClassEClassCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_71);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2739:3: (otherlv_6= 'targetOperation' ( ( ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==53) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalEel.g:2740:4: otherlv_6= 'targetOperation' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getPowerComputationAccess().getTargetOperationKeyword_5_0());
                    			
                    // InternalEel.g:2744:4: ( ( ruleEString ) )
                    // InternalEel.g:2745:5: ( ruleEString )
                    {
                    // InternalEel.g:2745:5: ( ruleEString )
                    // InternalEel.g:2746:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPowerComputationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPowerComputationAccess().getTargetOperationEOperationCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_72);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2761:3: (otherlv_8= 'left' ( ( ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==61) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalEel.g:2762:4: otherlv_8= 'left' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,61,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getPowerComputationAccess().getLeftKeyword_6_0());
                    			
                    // InternalEel.g:2766:4: ( ( ruleEString ) )
                    // InternalEel.g:2767:5: ( ruleEString )
                    {
                    // InternalEel.g:2767:5: ( ruleEString )
                    // InternalEel.g:2768:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPowerComputationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPowerComputationAccess().getLeftMeasureCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2783:3: (otherlv_10= 'right' ( ( ruleEString ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==62) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalEel.g:2784:4: otherlv_10= 'right' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getPowerComputationAccess().getRightKeyword_7_0());
                    			
                    // InternalEel.g:2788:4: ( ( ruleEString ) )
                    // InternalEel.g:2789:5: ( ruleEString )
                    {
                    // InternalEel.g:2789:5: ( ruleEString )
                    // InternalEel.g:2790:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPowerComputationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPowerComputationAccess().getRightMeasureCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:2805:3: (otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==49) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalEel.g:2806:4: otherlv_12= 'uncertainty' ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) )
                    {
                    otherlv_12=(Token)match(input,49,FOLLOW_55); 

                    				newLeafNode(otherlv_12, grammarAccess.getPowerComputationAccess().getUncertaintyKeyword_8_0());
                    			
                    // InternalEel.g:2810:4: ( (lv_uncertainty_13_0= ruleMeasurementUncertainty ) )
                    // InternalEel.g:2811:5: (lv_uncertainty_13_0= ruleMeasurementUncertainty )
                    {
                    // InternalEel.g:2811:5: (lv_uncertainty_13_0= ruleMeasurementUncertainty )
                    // InternalEel.g:2812:6: lv_uncertainty_13_0= ruleMeasurementUncertainty
                    {

                    						newCompositeNode(grammarAccess.getPowerComputationAccess().getUncertaintyMeasurementUncertaintyParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_uncertainty_13_0=ruleMeasurementUncertainty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPowerComputationRule());
                    						}
                    						set(
                    							current,
                    							"uncertainty",
                    							lv_uncertainty_13_0,
                    							"fr.tblf.energy.estimation.Eel.MeasurementUncertainty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getPowerComputationAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "rulePowerComputation"


    // $ANTLR start "entryRuleEAnnotation"
    // InternalEel.g:2838:1: entryRuleEAnnotation returns [EObject current=null] : iv_ruleEAnnotation= ruleEAnnotation EOF ;
    public final EObject entryRuleEAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAnnotation = null;


        try {
            // InternalEel.g:2838:52: (iv_ruleEAnnotation= ruleEAnnotation EOF )
            // InternalEel.g:2839:2: iv_ruleEAnnotation= ruleEAnnotation EOF
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
    // InternalEel.g:2845:1: ruleEAnnotation returns [EObject current=null] : ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
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
            // InternalEel.g:2851:2: ( ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // InternalEel.g:2852:2: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // InternalEel.g:2852:2: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // InternalEel.g:2853:3: () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // InternalEel.g:2853:3: ()
            // InternalEel.g:2854:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAnnotationAccess().getEAnnotationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEAnnotationAccess().getEAnnotationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_74); 

            			newLeafNode(otherlv_2, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:2868:3: (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==65) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalEel.g:2869:4: otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,65,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEAnnotationAccess().getSourceKeyword_3_0());
                    			
                    // InternalEel.g:2873:4: ( (lv_source_4_0= ruleEString ) )
                    // InternalEel.g:2874:5: (lv_source_4_0= ruleEString )
                    {
                    // InternalEel.g:2874:5: (lv_source_4_0= ruleEString )
                    // InternalEel.g:2875:6: lv_source_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getSourceEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_75);
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

            // InternalEel.g:2893:3: (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==66) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalEel.g:2894:4: otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,66,FOLLOW_22); 

                    				newLeafNode(otherlv_5, grammarAccess.getEAnnotationAccess().getReferencesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEAnnotationAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalEel.g:2902:4: ( ( ruleEString ) )
                    // InternalEel.g:2903:5: ( ruleEString )
                    {
                    // InternalEel.g:2903:5: ( ruleEString )
                    // InternalEel.g:2904:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAnnotationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:2918:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==14) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // InternalEel.g:2919:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEAnnotationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalEel.g:2923:5: ( ( ruleEString ) )
                    	    // InternalEel.g:2924:6: ( ruleEString )
                    	    {
                    	    // InternalEel.g:2924:6: ( ruleEString )
                    	    // InternalEel.g:2925:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAnnotationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_76); 

                    				newLeafNode(otherlv_10, grammarAccess.getEAnnotationAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:2945:3: (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==29) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalEel.g:2946:4: otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getEAnnotationAccess().getEAnnotationsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_12, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalEel.g:2954:4: ( (lv_eAnnotations_13_0= ruleEAnnotation ) )
                    // InternalEel.g:2955:5: (lv_eAnnotations_13_0= ruleEAnnotation )
                    {
                    // InternalEel.g:2955:5: (lv_eAnnotations_13_0= ruleEAnnotation )
                    // InternalEel.g:2956:6: lv_eAnnotations_13_0= ruleEAnnotation
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

                    // InternalEel.g:2973:4: (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==14) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalEel.g:2974:5: otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_25); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getEAnnotationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalEel.g:2978:5: ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    // InternalEel.g:2979:6: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:2979:6: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    // InternalEel.g:2980:7: lv_eAnnotations_15_0= ruleEAnnotation
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
                    	    break loop77;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,15,FOLLOW_77); 

                    				newLeafNode(otherlv_16, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3003:3: (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==67) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalEel.g:3004:4: otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,67,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getEAnnotationAccess().getDetailsKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_78); 

                    				newLeafNode(otherlv_18, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalEel.g:3012:4: ( (lv_details_19_0= ruleEStringToStringMapEntry ) )
                    // InternalEel.g:3013:5: (lv_details_19_0= ruleEStringToStringMapEntry )
                    {
                    // InternalEel.g:3013:5: (lv_details_19_0= ruleEStringToStringMapEntry )
                    // InternalEel.g:3014:6: lv_details_19_0= ruleEStringToStringMapEntry
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

                    // InternalEel.g:3031:4: (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==14) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalEel.g:3032:5: otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FOLLOW_78); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getEAnnotationAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalEel.g:3036:5: ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    // InternalEel.g:3037:6: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    {
                    	    // InternalEel.g:3037:6: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    // InternalEel.g:3038:7: lv_details_21_0= ruleEStringToStringMapEntry
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
                    	    break loop79;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,15,FOLLOW_79); 

                    				newLeafNode(otherlv_22, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3061:3: (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==68) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalEel.g:3062:4: otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,68,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getEAnnotationAccess().getContentsKeyword_7_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_80); 

                    				newLeafNode(otherlv_24, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalEel.g:3070:4: ( (lv_contents_25_0= ruleEObject ) )
                    // InternalEel.g:3071:5: (lv_contents_25_0= ruleEObject )
                    {
                    // InternalEel.g:3071:5: (lv_contents_25_0= ruleEObject )
                    // InternalEel.g:3072:6: lv_contents_25_0= ruleEObject
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

                    // InternalEel.g:3089:4: (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==14) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalEel.g:3090:5: otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_80); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getEAnnotationAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalEel.g:3094:5: ( (lv_contents_27_0= ruleEObject ) )
                    	    // InternalEel.g:3095:6: (lv_contents_27_0= ruleEObject )
                    	    {
                    	    // InternalEel.g:3095:6: (lv_contents_27_0= ruleEObject )
                    	    // InternalEel.g:3096:7: lv_contents_27_0= ruleEObject
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
                    	    break loop81;
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
    // InternalEel.g:3127:1: entryRuleETypeParameter returns [EObject current=null] : iv_ruleETypeParameter= ruleETypeParameter EOF ;
    public final EObject entryRuleETypeParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETypeParameter = null;


        try {
            // InternalEel.g:3127:55: (iv_ruleETypeParameter= ruleETypeParameter EOF )
            // InternalEel.g:3128:2: iv_ruleETypeParameter= ruleETypeParameter EOF
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
    // InternalEel.g:3134:1: ruleETypeParameter returns [EObject current=null] : ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalEel.g:3140:2: ( ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalEel.g:3141:2: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalEel.g:3141:2: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalEel.g:3142:3: () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalEel.g:3142:3: ()
            // InternalEel.g:3143:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getETypeParameterAccess().getETypeParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getETypeParameterAccess().getETypeParameterKeyword_1());
            		
            // InternalEel.g:3153:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:3154:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:3154:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:3155:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_81); 

            			newLeafNode(otherlv_3, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:3176:3: (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==29) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalEel.g:3177:4: otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getETypeParameterAccess().getEAnnotationsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_5, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalEel.g:3185:4: ( (lv_eAnnotations_6_0= ruleEAnnotation ) )
                    // InternalEel.g:3186:5: (lv_eAnnotations_6_0= ruleEAnnotation )
                    {
                    // InternalEel.g:3186:5: (lv_eAnnotations_6_0= ruleEAnnotation )
                    // InternalEel.g:3187:6: lv_eAnnotations_6_0= ruleEAnnotation
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

                    // InternalEel.g:3204:4: (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==14) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalEel.g:3205:5: otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_25); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getETypeParameterAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalEel.g:3209:5: ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    // InternalEel.g:3210:6: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:3210:6: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    // InternalEel.g:3211:7: lv_eAnnotations_8_0= ruleEAnnotation
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
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_82); 

                    				newLeafNode(otherlv_9, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3234:3: (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==70) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalEel.g:3235:4: otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,70,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getETypeParameterAccess().getEBoundsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_11, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalEel.g:3243:4: ( (lv_eBounds_12_0= ruleEGenericType ) )
                    // InternalEel.g:3244:5: (lv_eBounds_12_0= ruleEGenericType )
                    {
                    // InternalEel.g:3244:5: (lv_eBounds_12_0= ruleEGenericType )
                    // InternalEel.g:3245:6: lv_eBounds_12_0= ruleEGenericType
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

                    // InternalEel.g:3262:4: (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==14) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // InternalEel.g:3263:5: otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_33); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getETypeParameterAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalEel.g:3267:5: ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    // InternalEel.g:3268:6: (lv_eBounds_14_0= ruleEGenericType )
                    	    {
                    	    // InternalEel.g:3268:6: (lv_eBounds_14_0= ruleEGenericType )
                    	    // InternalEel.g:3269:7: lv_eBounds_14_0= ruleEGenericType
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
                    	    break loop85;
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
    // InternalEel.g:3300:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalEel.g:3300:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalEel.g:3301:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalEel.g:3307:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEel.g:3313:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalEel.g:3314:2: (kw= 'true' | kw= 'false' )
            {
            // InternalEel.g:3314:2: (kw= 'true' | kw= 'false' )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==71) ) {
                alt87=1;
            }
            else if ( (LA87_0==72) ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // InternalEel.g:3315:3: kw= 'true'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEel.g:3321:3: kw= 'false'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

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
    // InternalEel.g:3330:1: entryRuleEGenericType returns [EObject current=null] : iv_ruleEGenericType= ruleEGenericType EOF ;
    public final EObject entryRuleEGenericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGenericType = null;


        try {
            // InternalEel.g:3330:53: (iv_ruleEGenericType= ruleEGenericType EOF )
            // InternalEel.g:3331:2: iv_ruleEGenericType= ruleEGenericType EOF
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
    // InternalEel.g:3337:1: ruleEGenericType returns [EObject current=null] : ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) ;
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
            // InternalEel.g:3343:2: ( ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) )
            // InternalEel.g:3344:2: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            {
            // InternalEel.g:3344:2: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            // InternalEel.g:3345:3: () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}'
            {
            // InternalEel.g:3345:3: ()
            // InternalEel.g:3346:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEGenericTypeAccess().getEGenericTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,73,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEGenericTypeAccess().getEGenericTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_83); 

            			newLeafNode(otherlv_2, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:3360:3: (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==74) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalEel.g:3361:4: otherlv_3= 'eTypeParameter' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,74,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEGenericTypeAccess().getETypeParameterKeyword_3_0());
                    			
                    // InternalEel.g:3365:4: ( ( ruleEString ) )
                    // InternalEel.g:3366:5: ( ruleEString )
                    {
                    // InternalEel.g:3366:5: ( ruleEString )
                    // InternalEel.g:3367:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEGenericTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeParameterETypeParameterCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_84);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3382:3: (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==75) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalEel.g:3383:4: otherlv_5= 'eClassifier' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,75,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEGenericTypeAccess().getEClassifierKeyword_4_0());
                    			
                    // InternalEel.g:3387:4: ( ( ruleEString ) )
                    // InternalEel.g:3388:5: ( ruleEString )
                    {
                    // InternalEel.g:3388:5: ( ruleEString )
                    // InternalEel.g:3389:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEGenericTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getEClassifierEClassifierCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_85);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3404:3: (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==76) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalEel.g:3405:4: otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    {
                    otherlv_7=(Token)match(input,76,FOLLOW_33); 

                    				newLeafNode(otherlv_7, grammarAccess.getEGenericTypeAccess().getEUpperBoundKeyword_5_0());
                    			
                    // InternalEel.g:3409:4: ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    // InternalEel.g:3410:5: (lv_eUpperBound_8_0= ruleEGenericType )
                    {
                    // InternalEel.g:3410:5: (lv_eUpperBound_8_0= ruleEGenericType )
                    // InternalEel.g:3411:6: lv_eUpperBound_8_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getEUpperBoundEGenericTypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_86);
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

            // InternalEel.g:3429:3: (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==77) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalEel.g:3430:4: otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,77,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getEGenericTypeAccess().getETypeArgumentsKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_10, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalEel.g:3438:4: ( (lv_eTypeArguments_11_0= ruleEGenericType ) )
                    // InternalEel.g:3439:5: (lv_eTypeArguments_11_0= ruleEGenericType )
                    {
                    // InternalEel.g:3439:5: (lv_eTypeArguments_11_0= ruleEGenericType )
                    // InternalEel.g:3440:6: lv_eTypeArguments_11_0= ruleEGenericType
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

                    // InternalEel.g:3457:4: (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==14) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalEel.g:3458:5: otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_33); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getEGenericTypeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalEel.g:3462:5: ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    // InternalEel.g:3463:6: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    {
                    	    // InternalEel.g:3463:6: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    // InternalEel.g:3464:7: lv_eTypeArguments_13_0= ruleEGenericType
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
                    	    break loop91;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_87); 

                    				newLeafNode(otherlv_14, grammarAccess.getEGenericTypeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:3487:3: (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==78) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalEel.g:3488:4: otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    {
                    otherlv_15=(Token)match(input,78,FOLLOW_33); 

                    				newLeafNode(otherlv_15, grammarAccess.getEGenericTypeAccess().getELowerBoundKeyword_7_0());
                    			
                    // InternalEel.g:3492:4: ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    // InternalEel.g:3493:5: (lv_eLowerBound_16_0= ruleEGenericType )
                    {
                    // InternalEel.g:3493:5: (lv_eLowerBound_16_0= ruleEGenericType )
                    // InternalEel.g:3494:6: lv_eLowerBound_16_0= ruleEGenericType
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
    // InternalEel.g:3520:1: entryRuleEStringToStringMapEntry returns [EObject current=null] : iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF ;
    public final EObject entryRuleEStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStringToStringMapEntry = null;


        try {
            // InternalEel.g:3520:64: (iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF )
            // InternalEel.g:3521:2: iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF
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
    // InternalEel.g:3527:1: ruleEStringToStringMapEntry returns [EObject current=null] : ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
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
            // InternalEel.g:3533:2: ( ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalEel.g:3534:2: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalEel.g:3534:2: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalEel.g:3535:3: () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalEel.g:3535:3: ()
            // InternalEel.g:3536:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,79,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_88); 

            			newLeafNode(otherlv_2, grammarAccess.getEStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:3550:3: (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==80) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalEel.g:3551:4: otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,80,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEStringToStringMapEntryAccess().getKeyKeyword_3_0());
                    			
                    // InternalEel.g:3555:4: ( (lv_key_4_0= ruleEString ) )
                    // InternalEel.g:3556:5: (lv_key_4_0= ruleEString )
                    {
                    // InternalEel.g:3556:5: (lv_key_4_0= ruleEString )
                    // InternalEel.g:3557:6: lv_key_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_89);
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

            // InternalEel.g:3575:3: (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==18) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalEel.g:3576:4: otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEStringToStringMapEntryAccess().getValueKeyword_4_0());
                    			
                    // InternalEel.g:3580:4: ( (lv_value_6_0= ruleEString ) )
                    // InternalEel.g:3581:5: (lv_value_6_0= ruleEString )
                    {
                    // InternalEel.g:3581:5: (lv_value_6_0= ruleEString )
                    // InternalEel.g:3582:6: lv_value_6_0= ruleEString
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
    // InternalEel.g:3608:1: entryRuleEObject returns [EObject current=null] : iv_ruleEObject= ruleEObject EOF ;
    public final EObject entryRuleEObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObject = null;


        try {
            // InternalEel.g:3608:48: (iv_ruleEObject= ruleEObject EOF )
            // InternalEel.g:3609:2: iv_ruleEObject= ruleEObject EOF
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
    // InternalEel.g:3615:1: ruleEObject returns [EObject current=null] : ( () otherlv_1= 'EObject' ) ;
    public final EObject ruleEObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEel.g:3621:2: ( ( () otherlv_1= 'EObject' ) )
            // InternalEel.g:3622:2: ( () otherlv_1= 'EObject' )
            {
            // InternalEel.g:3622:2: ( () otherlv_1= 'EObject' )
            // InternalEel.g:3623:3: () otherlv_1= 'EObject'
            {
            // InternalEel.g:3623:3: ()
            // InternalEel.g:3624:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEObjectAccess().getEObjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,81,FOLLOW_2); 

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
    // InternalEel.g:3638:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalEel.g:3638:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalEel.g:3639:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalEel.g:3645:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalEel.g:3651:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalEel.g:3652:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalEel.g:3652:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalEel.g:3653:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalEel.g:3653:3: (kw= '-' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==82) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalEel.g:3654:4: kw= '-'
                    {
                    kw=(Token)match(input,82,FOLLOW_16); 

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
    // InternalEel.g:3671:1: entryRuleEAttribute returns [EObject current=null] : iv_ruleEAttribute= ruleEAttribute EOF ;
    public final EObject entryRuleEAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttribute = null;


        try {
            // InternalEel.g:3671:51: (iv_ruleEAttribute= ruleEAttribute EOF )
            // InternalEel.g:3672:2: iv_ruleEAttribute= ruleEAttribute EOF
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
    // InternalEel.g:3678:1: ruleEAttribute returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) ;
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
            // InternalEel.g:3684:2: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) )
            // InternalEel.g:3685:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            {
            // InternalEel.g:3685:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            // InternalEel.g:3686:3: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}'
            {
            // InternalEel.g:3686:3: ()
            // InternalEel.g:3687:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAttributeAccess().getEAttributeAction_0(),
            					current);
            			

            }

            // InternalEel.g:3693:3: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==83) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalEel.g:3694:4: (lv_volatile_1_0= 'volatile' )
                    {
                    // InternalEel.g:3694:4: (lv_volatile_1_0= 'volatile' )
                    // InternalEel.g:3695:5: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,83,FOLLOW_90); 

                    					newLeafNode(lv_volatile_1_0, grammarAccess.getEAttributeAccess().getVolatileVolatileKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "volatile", true, "volatile");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:3707:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==84) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalEel.g:3708:4: (lv_transient_2_0= 'transient' )
                    {
                    // InternalEel.g:3708:4: (lv_transient_2_0= 'transient' )
                    // InternalEel.g:3709:5: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,84,FOLLOW_91); 

                    					newLeafNode(lv_transient_2_0, grammarAccess.getEAttributeAccess().getTransientTransientKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "transient", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:3721:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==85) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalEel.g:3722:4: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // InternalEel.g:3722:4: (lv_unsettable_3_0= 'unsettable' )
                    // InternalEel.g:3723:5: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,85,FOLLOW_92); 

                    					newLeafNode(lv_unsettable_3_0, grammarAccess.getEAttributeAccess().getUnsettableUnsettableKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "unsettable", true, "unsettable");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:3735:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==86) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalEel.g:3736:4: (lv_derived_4_0= 'derived' )
                    {
                    // InternalEel.g:3736:4: (lv_derived_4_0= 'derived' )
                    // InternalEel.g:3737:5: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,86,FOLLOW_93); 

                    					newLeafNode(lv_derived_4_0, grammarAccess.getEAttributeAccess().getDerivedDerivedKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "derived", true, "derived");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:3749:3: ( (lv_iD_5_0= 'iD' ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==87) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalEel.g:3750:4: (lv_iD_5_0= 'iD' )
                    {
                    // InternalEel.g:3750:4: (lv_iD_5_0= 'iD' )
                    // InternalEel.g:3751:5: lv_iD_5_0= 'iD'
                    {
                    lv_iD_5_0=(Token)match(input,87,FOLLOW_94); 

                    					newLeafNode(lv_iD_5_0, grammarAccess.getEAttributeAccess().getIDIDKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "iD", true, "iD");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,88,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getEAttributeAccess().getEAttributeKeyword_6());
            		
            // InternalEel.g:3767:3: ( (lv_name_7_0= ruleEString ) )
            // InternalEel.g:3768:4: (lv_name_7_0= ruleEString )
            {
            // InternalEel.g:3768:4: (lv_name_7_0= ruleEString )
            // InternalEel.g:3769:5: lv_name_7_0= ruleEString
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

            otherlv_8=(Token)match(input,12,FOLLOW_95); 

            			newLeafNode(otherlv_8, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalEel.g:3790:3: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==35) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalEel.g:3791:4: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_35); 

                    				newLeafNode(otherlv_9, grammarAccess.getEAttributeAccess().getOrderedKeyword_9_0());
                    			
                    // InternalEel.g:3795:4: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // InternalEel.g:3796:5: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // InternalEel.g:3796:5: (lv_ordered_10_0= ruleEBoolean )
                    // InternalEel.g:3797:6: lv_ordered_10_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getOrderedEBooleanParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_96);
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

            // InternalEel.g:3815:3: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==36) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalEel.g:3816:4: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,36,FOLLOW_35); 

                    				newLeafNode(otherlv_11, grammarAccess.getEAttributeAccess().getUniqueKeyword_10_0());
                    			
                    // InternalEel.g:3820:4: ( (lv_unique_12_0= ruleEBoolean ) )
                    // InternalEel.g:3821:5: (lv_unique_12_0= ruleEBoolean )
                    {
                    // InternalEel.g:3821:5: (lv_unique_12_0= ruleEBoolean )
                    // InternalEel.g:3822:6: lv_unique_12_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getUniqueEBooleanParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_97);
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

            // InternalEel.g:3840:3: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==37) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalEel.g:3841:4: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,37,FOLLOW_38); 

                    				newLeafNode(otherlv_13, grammarAccess.getEAttributeAccess().getLowerBoundKeyword_11_0());
                    			
                    // InternalEel.g:3845:4: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // InternalEel.g:3846:5: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // InternalEel.g:3846:5: (lv_lowerBound_14_0= ruleEInt )
                    // InternalEel.g:3847:6: lv_lowerBound_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getLowerBoundEIntParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_98);
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

            // InternalEel.g:3865:3: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==38) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalEel.g:3866:4: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,38,FOLLOW_38); 

                    				newLeafNode(otherlv_15, grammarAccess.getEAttributeAccess().getUpperBoundKeyword_12_0());
                    			
                    // InternalEel.g:3870:4: ( (lv_upperBound_16_0= ruleEInt ) )
                    // InternalEel.g:3871:5: (lv_upperBound_16_0= ruleEInt )
                    {
                    // InternalEel.g:3871:5: (lv_upperBound_16_0= ruleEInt )
                    // InternalEel.g:3872:6: lv_upperBound_16_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getUpperBoundEIntParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_99);
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

            // InternalEel.g:3890:3: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==89) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalEel.g:3891:4: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,89,FOLLOW_35); 

                    				newLeafNode(otherlv_17, grammarAccess.getEAttributeAccess().getChangeableKeyword_13_0());
                    			
                    // InternalEel.g:3895:4: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // InternalEel.g:3896:5: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // InternalEel.g:3896:5: (lv_changeable_18_0= ruleEBoolean )
                    // InternalEel.g:3897:6: lv_changeable_18_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getChangeableEBooleanParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_100);
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

            // InternalEel.g:3915:3: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==90) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalEel.g:3916:4: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,90,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getEAttributeAccess().getDefaultValueLiteralKeyword_14_0());
                    			
                    // InternalEel.g:3920:4: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // InternalEel.g:3921:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // InternalEel.g:3921:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    // InternalEel.g:3922:6: lv_defaultValueLiteral_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_101);
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

            // InternalEel.g:3940:3: (otherlv_21= 'eType' ( ( ruleEString ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==39) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalEel.g:3941:4: otherlv_21= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_21=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getEAttributeAccess().getETypeKeyword_15_0());
                    			
                    // InternalEel.g:3945:4: ( ( ruleEString ) )
                    // InternalEel.g:3946:5: ( ruleEString )
                    {
                    // InternalEel.g:3946:5: ( ruleEString )
                    // InternalEel.g:3947:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getETypeEClassifierCrossReference_15_1_0());
                    					
                    pushFollow(FOLLOW_102);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:3962:3: (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==29) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalEel.g:3963:4: otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getEAttributeAccess().getEAnnotationsKeyword_16_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_24, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalEel.g:3971:4: ( (lv_eAnnotations_25_0= ruleEAnnotation ) )
                    // InternalEel.g:3972:5: (lv_eAnnotations_25_0= ruleEAnnotation )
                    {
                    // InternalEel.g:3972:5: (lv_eAnnotations_25_0= ruleEAnnotation )
                    // InternalEel.g:3973:6: lv_eAnnotations_25_0= ruleEAnnotation
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

                    // InternalEel.g:3990:4: (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==14) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // InternalEel.g:3991:5: otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_25); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getEAttributeAccess().getCommaKeyword_16_3_0());
                    	    				
                    	    // InternalEel.g:3995:5: ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    // InternalEel.g:3996:6: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:3996:6: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    // InternalEel.g:3997:7: lv_eAnnotations_27_0= ruleEAnnotation
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
                    	    break loop109;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,15,FOLLOW_103); 

                    				newLeafNode(otherlv_28, grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_16_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:4020:3: (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==41) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalEel.g:4021:4: otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    {
                    otherlv_29=(Token)match(input,41,FOLLOW_33); 

                    				newLeafNode(otherlv_29, grammarAccess.getEAttributeAccess().getEGenericTypeKeyword_17_0());
                    			
                    // InternalEel.g:4025:4: ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    // InternalEel.g:4026:5: (lv_eGenericType_30_0= ruleEGenericType )
                    {
                    // InternalEel.g:4026:5: (lv_eGenericType_30_0= ruleEGenericType )
                    // InternalEel.g:4027:6: lv_eGenericType_30_0= ruleEGenericType
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
    // InternalEel.g:4053:1: entryRuleEReference returns [EObject current=null] : iv_ruleEReference= ruleEReference EOF ;
    public final EObject entryRuleEReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEReference = null;


        try {
            // InternalEel.g:4053:51: (iv_ruleEReference= ruleEReference EOF )
            // InternalEel.g:4054:2: iv_ruleEReference= ruleEReference EOF
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
    // InternalEel.g:4060:1: ruleEReference returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) ;
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
            // InternalEel.g:4066:2: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) )
            // InternalEel.g:4067:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            {
            // InternalEel.g:4067:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            // InternalEel.g:4068:3: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}'
            {
            // InternalEel.g:4068:3: ()
            // InternalEel.g:4069:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEReferenceAccess().getEReferenceAction_0(),
            					current);
            			

            }

            // InternalEel.g:4075:3: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==83) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalEel.g:4076:4: (lv_volatile_1_0= 'volatile' )
                    {
                    // InternalEel.g:4076:4: (lv_volatile_1_0= 'volatile' )
                    // InternalEel.g:4077:5: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,83,FOLLOW_104); 

                    					newLeafNode(lv_volatile_1_0, grammarAccess.getEReferenceAccess().getVolatileVolatileKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "volatile", true, "volatile");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4089:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==84) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalEel.g:4090:4: (lv_transient_2_0= 'transient' )
                    {
                    // InternalEel.g:4090:4: (lv_transient_2_0= 'transient' )
                    // InternalEel.g:4091:5: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,84,FOLLOW_105); 

                    					newLeafNode(lv_transient_2_0, grammarAccess.getEReferenceAccess().getTransientTransientKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "transient", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4103:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==85) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalEel.g:4104:4: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // InternalEel.g:4104:4: (lv_unsettable_3_0= 'unsettable' )
                    // InternalEel.g:4105:5: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,85,FOLLOW_106); 

                    					newLeafNode(lv_unsettable_3_0, grammarAccess.getEReferenceAccess().getUnsettableUnsettableKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "unsettable", true, "unsettable");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4117:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==86) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalEel.g:4118:4: (lv_derived_4_0= 'derived' )
                    {
                    // InternalEel.g:4118:4: (lv_derived_4_0= 'derived' )
                    // InternalEel.g:4119:5: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,86,FOLLOW_107); 

                    					newLeafNode(lv_derived_4_0, grammarAccess.getEReferenceAccess().getDerivedDerivedKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "derived", true, "derived");
                    				

                    }


                    }
                    break;

            }

            // InternalEel.g:4131:3: ( (lv_containment_5_0= 'containment' ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==91) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalEel.g:4132:4: (lv_containment_5_0= 'containment' )
                    {
                    // InternalEel.g:4132:4: (lv_containment_5_0= 'containment' )
                    // InternalEel.g:4133:5: lv_containment_5_0= 'containment'
                    {
                    lv_containment_5_0=(Token)match(input,91,FOLLOW_108); 

                    					newLeafNode(lv_containment_5_0, grammarAccess.getEReferenceAccess().getContainmentContainmentKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "containment", true, "containment");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,92,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getEReferenceAccess().getEReferenceKeyword_6());
            		
            // InternalEel.g:4149:3: ( (lv_name_7_0= ruleEString ) )
            // InternalEel.g:4150:4: (lv_name_7_0= ruleEString )
            {
            // InternalEel.g:4150:4: (lv_name_7_0= ruleEString )
            // InternalEel.g:4151:5: lv_name_7_0= ruleEString
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

            otherlv_8=(Token)match(input,12,FOLLOW_109); 

            			newLeafNode(otherlv_8, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalEel.g:4172:3: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==35) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalEel.g:4173:4: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_35); 

                    				newLeafNode(otherlv_9, grammarAccess.getEReferenceAccess().getOrderedKeyword_9_0());
                    			
                    // InternalEel.g:4177:4: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // InternalEel.g:4178:5: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // InternalEel.g:4178:5: (lv_ordered_10_0= ruleEBoolean )
                    // InternalEel.g:4179:6: lv_ordered_10_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getOrderedEBooleanParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_110);
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

            // InternalEel.g:4197:3: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==36) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalEel.g:4198:4: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,36,FOLLOW_35); 

                    				newLeafNode(otherlv_11, grammarAccess.getEReferenceAccess().getUniqueKeyword_10_0());
                    			
                    // InternalEel.g:4202:4: ( (lv_unique_12_0= ruleEBoolean ) )
                    // InternalEel.g:4203:5: (lv_unique_12_0= ruleEBoolean )
                    {
                    // InternalEel.g:4203:5: (lv_unique_12_0= ruleEBoolean )
                    // InternalEel.g:4204:6: lv_unique_12_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getUniqueEBooleanParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_111);
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

            // InternalEel.g:4222:3: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==37) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalEel.g:4223:4: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,37,FOLLOW_38); 

                    				newLeafNode(otherlv_13, grammarAccess.getEReferenceAccess().getLowerBoundKeyword_11_0());
                    			
                    // InternalEel.g:4227:4: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // InternalEel.g:4228:5: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // InternalEel.g:4228:5: (lv_lowerBound_14_0= ruleEInt )
                    // InternalEel.g:4229:6: lv_lowerBound_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getLowerBoundEIntParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_112);
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

            // InternalEel.g:4247:3: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==38) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalEel.g:4248:4: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,38,FOLLOW_38); 

                    				newLeafNode(otherlv_15, grammarAccess.getEReferenceAccess().getUpperBoundKeyword_12_0());
                    			
                    // InternalEel.g:4252:4: ( (lv_upperBound_16_0= ruleEInt ) )
                    // InternalEel.g:4253:5: (lv_upperBound_16_0= ruleEInt )
                    {
                    // InternalEel.g:4253:5: (lv_upperBound_16_0= ruleEInt )
                    // InternalEel.g:4254:6: lv_upperBound_16_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getUpperBoundEIntParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_113);
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

            // InternalEel.g:4272:3: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==89) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalEel.g:4273:4: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,89,FOLLOW_35); 

                    				newLeafNode(otherlv_17, grammarAccess.getEReferenceAccess().getChangeableKeyword_13_0());
                    			
                    // InternalEel.g:4277:4: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // InternalEel.g:4278:5: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // InternalEel.g:4278:5: (lv_changeable_18_0= ruleEBoolean )
                    // InternalEel.g:4279:6: lv_changeable_18_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getChangeableEBooleanParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_114);
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

            // InternalEel.g:4297:3: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==90) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalEel.g:4298:4: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,90,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getEReferenceAccess().getDefaultValueLiteralKeyword_14_0());
                    			
                    // InternalEel.g:4302:4: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // InternalEel.g:4303:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // InternalEel.g:4303:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    // InternalEel.g:4304:6: lv_defaultValueLiteral_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_115);
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

            // InternalEel.g:4322:3: (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==93) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalEel.g:4323:4: otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    {
                    otherlv_21=(Token)match(input,93,FOLLOW_35); 

                    				newLeafNode(otherlv_21, grammarAccess.getEReferenceAccess().getResolveProxiesKeyword_15_0());
                    			
                    // InternalEel.g:4327:4: ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    // InternalEel.g:4328:5: (lv_resolveProxies_22_0= ruleEBoolean )
                    {
                    // InternalEel.g:4328:5: (lv_resolveProxies_22_0= ruleEBoolean )
                    // InternalEel.g:4329:6: lv_resolveProxies_22_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getResolveProxiesEBooleanParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_116);
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

            // InternalEel.g:4347:3: (otherlv_23= 'eType' ( ( ruleEString ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==39) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalEel.g:4348:4: otherlv_23= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_23=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getEReferenceAccess().getETypeKeyword_16_0());
                    			
                    // InternalEel.g:4352:4: ( ( ruleEString ) )
                    // InternalEel.g:4353:5: ( ruleEString )
                    {
                    // InternalEel.g:4353:5: ( ruleEString )
                    // InternalEel.g:4354:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getETypeEClassifierCrossReference_16_1_0());
                    					
                    pushFollow(FOLLOW_117);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4369:3: (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==94) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalEel.g:4370:4: otherlv_25= 'eOpposite' ( ( ruleEString ) )
                    {
                    otherlv_25=(Token)match(input,94,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getEReferenceAccess().getEOppositeKeyword_17_0());
                    			
                    // InternalEel.g:4374:4: ( ( ruleEString ) )
                    // InternalEel.g:4375:5: ( ruleEString )
                    {
                    // InternalEel.g:4375:5: ( ruleEString )
                    // InternalEel.g:4376:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEOppositeEReferenceCrossReference_17_1_0());
                    					
                    pushFollow(FOLLOW_118);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:4391:3: (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==95) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalEel.g:4392:4: otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')'
                    {
                    otherlv_27=(Token)match(input,95,FOLLOW_22); 

                    				newLeafNode(otherlv_27, grammarAccess.getEReferenceAccess().getEKeysKeyword_18_0());
                    			
                    otherlv_28=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_28, grammarAccess.getEReferenceAccess().getLeftParenthesisKeyword_18_1());
                    			
                    // InternalEel.g:4400:4: ( ( ruleEString ) )
                    // InternalEel.g:4401:5: ( ruleEString )
                    {
                    // InternalEel.g:4401:5: ( ruleEString )
                    // InternalEel.g:4402:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEel.g:4416:4: (otherlv_30= ',' ( ( ruleEString ) ) )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==14) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // InternalEel.g:4417:5: otherlv_30= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_30=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_30, grammarAccess.getEReferenceAccess().getCommaKeyword_18_3_0());
                    	    				
                    	    // InternalEel.g:4421:5: ( ( ruleEString ) )
                    	    // InternalEel.g:4422:6: ( ruleEString )
                    	    {
                    	    // InternalEel.g:4422:6: ( ruleEString )
                    	    // InternalEel.g:4423:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEReferenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop126;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,28,FOLLOW_102); 

                    				newLeafNode(otherlv_32, grammarAccess.getEReferenceAccess().getRightParenthesisKeyword_18_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:4443:3: (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==29) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalEel.g:4444:4: otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_33, grammarAccess.getEReferenceAccess().getEAnnotationsKeyword_19_0());
                    			
                    otherlv_34=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_34, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_19_1());
                    			
                    // InternalEel.g:4452:4: ( (lv_eAnnotations_35_0= ruleEAnnotation ) )
                    // InternalEel.g:4453:5: (lv_eAnnotations_35_0= ruleEAnnotation )
                    {
                    // InternalEel.g:4453:5: (lv_eAnnotations_35_0= ruleEAnnotation )
                    // InternalEel.g:4454:6: lv_eAnnotations_35_0= ruleEAnnotation
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

                    // InternalEel.g:4471:4: (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==14) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // InternalEel.g:4472:5: otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_36=(Token)match(input,14,FOLLOW_25); 

                    	    					newLeafNode(otherlv_36, grammarAccess.getEReferenceAccess().getCommaKeyword_19_3_0());
                    	    				
                    	    // InternalEel.g:4476:5: ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    // InternalEel.g:4477:6: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:4477:6: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    // InternalEel.g:4478:7: lv_eAnnotations_37_0= ruleEAnnotation
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
                    	    break loop128;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,15,FOLLOW_103); 

                    				newLeafNode(otherlv_38, grammarAccess.getEReferenceAccess().getRightCurlyBracketKeyword_19_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:4501:3: (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==41) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalEel.g:4502:4: otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    {
                    otherlv_39=(Token)match(input,41,FOLLOW_33); 

                    				newLeafNode(otherlv_39, grammarAccess.getEReferenceAccess().getEGenericTypeKeyword_20_0());
                    			
                    // InternalEel.g:4506:4: ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    // InternalEel.g:4507:5: (lv_eGenericType_40_0= ruleEGenericType )
                    {
                    // InternalEel.g:4507:5: (lv_eGenericType_40_0= ruleEGenericType )
                    // InternalEel.g:4508:6: lv_eGenericType_40_0= ruleEGenericType
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
    // InternalEel.g:4534:1: entryRuleEDataType_Impl returns [EObject current=null] : iv_ruleEDataType_Impl= ruleEDataType_Impl EOF ;
    public final EObject entryRuleEDataType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataType_Impl = null;


        try {
            // InternalEel.g:4534:55: (iv_ruleEDataType_Impl= ruleEDataType_Impl EOF )
            // InternalEel.g:4535:2: iv_ruleEDataType_Impl= ruleEDataType_Impl EOF
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
    // InternalEel.g:4541:1: ruleEDataType_Impl returns [EObject current=null] : ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
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
            // InternalEel.g:4547:2: ( ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalEel.g:4548:2: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalEel.g:4548:2: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalEel.g:4549:3: () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalEel.g:4549:3: ()
            // InternalEel.g:4550:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEDataType_ImplAccess().getEDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,96,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEDataType_ImplAccess().getEDataTypeKeyword_1());
            		
            // InternalEel.g:4560:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:4561:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:4561:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:4562:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_119); 

            			newLeafNode(otherlv_3, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:4583:3: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==24) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalEel.g:4584:4: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEDataType_ImplAccess().getInstanceClassNameKeyword_4_0());
                    			
                    // InternalEel.g:4588:4: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // InternalEel.g:4589:5: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // InternalEel.g:4589:5: (lv_instanceClassName_5_0= ruleEString )
                    // InternalEel.g:4590:6: lv_instanceClassName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceClassNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_120);
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

            // InternalEel.g:4608:3: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==25) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalEel.g:4609:4: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameKeyword_5_0());
                    			
                    // InternalEel.g:4613:4: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // InternalEel.g:4614:5: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // InternalEel.g:4614:5: (lv_instanceTypeName_7_0= ruleEString )
                    // InternalEel.g:4615:6: lv_instanceTypeName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_121);
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

            // InternalEel.g:4633:3: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==97) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalEel.g:4634:4: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,97,FOLLOW_35); 

                    				newLeafNode(otherlv_8, grammarAccess.getEDataType_ImplAccess().getSerializableKeyword_6_0());
                    			
                    // InternalEel.g:4638:4: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // InternalEel.g:4639:5: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // InternalEel.g:4639:5: (lv_serializable_9_0= ruleEBoolean )
                    // InternalEel.g:4640:6: lv_serializable_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getSerializableEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_122);
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

            // InternalEel.g:4658:3: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==29) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalEel.g:4659:4: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEDataType_ImplAccess().getEAnnotationsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_11, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalEel.g:4667:4: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // InternalEel.g:4668:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // InternalEel.g:4668:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // InternalEel.g:4669:6: lv_eAnnotations_12_0= ruleEAnnotation
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

                    // InternalEel.g:4686:4: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==14) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // InternalEel.g:4687:5: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_25); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalEel.g:4691:5: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // InternalEel.g:4692:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:4692:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // InternalEel.g:4693:7: lv_eAnnotations_14_0= ruleEAnnotation
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
                    	    break loop134;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_123); 

                    				newLeafNode(otherlv_15, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:4716:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==30) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalEel.g:4717:4: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEDataType_ImplAccess().getETypeParametersKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_27); 

                    				newLeafNode(otherlv_17, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalEel.g:4725:4: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // InternalEel.g:4726:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // InternalEel.g:4726:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // InternalEel.g:4727:6: lv_eTypeParameters_18_0= ruleETypeParameter
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

                    // InternalEel.g:4744:4: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==14) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // InternalEel.g:4745:5: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_27); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalEel.g:4749:5: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // InternalEel.g:4750:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // InternalEel.g:4750:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // InternalEel.g:4751:7: lv_eTypeParameters_20_0= ruleETypeParameter
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
                    	    break loop136;
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
    // InternalEel.g:4782:1: entryRuleEEnum returns [EObject current=null] : iv_ruleEEnum= ruleEEnum EOF ;
    public final EObject entryRuleEEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnum = null;


        try {
            // InternalEel.g:4782:46: (iv_ruleEEnum= ruleEEnum EOF )
            // InternalEel.g:4783:2: iv_ruleEEnum= ruleEEnum EOF
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
    // InternalEel.g:4789:1: ruleEEnum returns [EObject current=null] : ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
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
            // InternalEel.g:4795:2: ( ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // InternalEel.g:4796:2: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // InternalEel.g:4796:2: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // InternalEel.g:4797:3: () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // InternalEel.g:4797:3: ()
            // InternalEel.g:4798:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEEnumAccess().getEEnumAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,98,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEEnumAccess().getEEnumKeyword_1());
            		
            // InternalEel.g:4808:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:4809:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:4809:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:4810:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_124); 

            			newLeafNode(otherlv_3, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:4831:3: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==24) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalEel.g:4832:4: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEEnumAccess().getInstanceClassNameKeyword_4_0());
                    			
                    // InternalEel.g:4836:4: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // InternalEel.g:4837:5: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // InternalEel.g:4837:5: (lv_instanceClassName_5_0= ruleEString )
                    // InternalEel.g:4838:6: lv_instanceClassName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getInstanceClassNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_125);
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

            // InternalEel.g:4856:3: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==25) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalEel.g:4857:4: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEEnumAccess().getInstanceTypeNameKeyword_5_0());
                    			
                    // InternalEel.g:4861:4: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // InternalEel.g:4862:5: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // InternalEel.g:4862:5: (lv_instanceTypeName_7_0= ruleEString )
                    // InternalEel.g:4863:6: lv_instanceTypeName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_126);
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

            // InternalEel.g:4881:3: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==97) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalEel.g:4882:4: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,97,FOLLOW_35); 

                    				newLeafNode(otherlv_8, grammarAccess.getEEnumAccess().getSerializableKeyword_6_0());
                    			
                    // InternalEel.g:4886:4: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // InternalEel.g:4887:5: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // InternalEel.g:4887:5: (lv_serializable_9_0= ruleEBoolean )
                    // InternalEel.g:4888:6: lv_serializable_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getSerializableEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_127);
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

            // InternalEel.g:4906:3: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==29) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalEel.g:4907:4: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEEnumAccess().getEAnnotationsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_11, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalEel.g:4915:4: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // InternalEel.g:4916:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // InternalEel.g:4916:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // InternalEel.g:4917:6: lv_eAnnotations_12_0= ruleEAnnotation
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

                    // InternalEel.g:4934:4: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop141:
                    do {
                        int alt141=2;
                        int LA141_0 = input.LA(1);

                        if ( (LA141_0==14) ) {
                            alt141=1;
                        }


                        switch (alt141) {
                    	case 1 :
                    	    // InternalEel.g:4935:5: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_25); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEEnumAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalEel.g:4939:5: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // InternalEel.g:4940:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:4940:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // InternalEel.g:4941:7: lv_eAnnotations_14_0= ruleEAnnotation
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
                    	    break loop141;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_128); 

                    				newLeafNode(otherlv_15, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:4964:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==30) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalEel.g:4965:4: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEEnumAccess().getETypeParametersKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_27); 

                    				newLeafNode(otherlv_17, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalEel.g:4973:4: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // InternalEel.g:4974:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // InternalEel.g:4974:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // InternalEel.g:4975:6: lv_eTypeParameters_18_0= ruleETypeParameter
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

                    // InternalEel.g:4992:4: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop143:
                    do {
                        int alt143=2;
                        int LA143_0 = input.LA(1);

                        if ( (LA143_0==14) ) {
                            alt143=1;
                        }


                        switch (alt143) {
                    	case 1 :
                    	    // InternalEel.g:4993:5: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_27); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEEnumAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalEel.g:4997:5: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // InternalEel.g:4998:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // InternalEel.g:4998:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // InternalEel.g:4999:7: lv_eTypeParameters_20_0= ruleETypeParameter
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
                    	    break loop143;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_129); 

                    				newLeafNode(otherlv_21, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:5022:3: (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==99) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalEel.g:5023:4: otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,99,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getEEnumAccess().getELiteralsKeyword_9_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_130); 

                    				newLeafNode(otherlv_23, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalEel.g:5031:4: ( (lv_eLiterals_24_0= ruleEEnumLiteral ) )
                    // InternalEel.g:5032:5: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    {
                    // InternalEel.g:5032:5: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    // InternalEel.g:5033:6: lv_eLiterals_24_0= ruleEEnumLiteral
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

                    // InternalEel.g:5050:4: (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )*
                    loop145:
                    do {
                        int alt145=2;
                        int LA145_0 = input.LA(1);

                        if ( (LA145_0==14) ) {
                            alt145=1;
                        }


                        switch (alt145) {
                    	case 1 :
                    	    // InternalEel.g:5051:5: otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_130); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getEEnumAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalEel.g:5055:5: ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    // InternalEel.g:5056:6: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    {
                    	    // InternalEel.g:5056:6: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    // InternalEel.g:5057:7: lv_eLiterals_26_0= ruleEEnumLiteral
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
                    	    break loop145;
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
    // InternalEel.g:5088:1: entryRuleEEnumLiteral returns [EObject current=null] : iv_ruleEEnumLiteral= ruleEEnumLiteral EOF ;
    public final EObject entryRuleEEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnumLiteral = null;


        try {
            // InternalEel.g:5088:53: (iv_ruleEEnumLiteral= ruleEEnumLiteral EOF )
            // InternalEel.g:5089:2: iv_ruleEEnumLiteral= ruleEEnumLiteral EOF
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
    // InternalEel.g:5095:1: ruleEEnumLiteral returns [EObject current=null] : ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
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
            // InternalEel.g:5101:2: ( ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalEel.g:5102:2: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalEel.g:5102:2: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalEel.g:5103:3: () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalEel.g:5103:3: ()
            // InternalEel.g:5104:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEEnumLiteralAccess().getEEnumLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,100,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEEnumLiteralAccess().getEEnumLiteralKeyword_1());
            		
            // InternalEel.g:5114:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:5115:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:5115:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:5116:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_131); 

            			newLeafNode(otherlv_3, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:5137:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==18) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalEel.g:5138:4: otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_38); 

                    				newLeafNode(otherlv_4, grammarAccess.getEEnumLiteralAccess().getValueKeyword_4_0());
                    			
                    // InternalEel.g:5142:4: ( (lv_value_5_0= ruleEInt ) )
                    // InternalEel.g:5143:5: (lv_value_5_0= ruleEInt )
                    {
                    // InternalEel.g:5143:5: (lv_value_5_0= ruleEInt )
                    // InternalEel.g:5144:6: lv_value_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getValueEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_132);
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

            // InternalEel.g:5162:3: (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==101) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalEel.g:5163:4: otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,101,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEEnumLiteralAccess().getLiteralKeyword_5_0());
                    			
                    // InternalEel.g:5167:4: ( (lv_literal_7_0= ruleEString ) )
                    // InternalEel.g:5168:5: (lv_literal_7_0= ruleEString )
                    {
                    // InternalEel.g:5168:5: (lv_literal_7_0= ruleEString )
                    // InternalEel.g:5169:6: lv_literal_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getLiteralEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_133);
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

            // InternalEel.g:5187:3: (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==29) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalEel.g:5188:4: otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEEnumLiteralAccess().getEAnnotationsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalEel.g:5196:4: ( (lv_eAnnotations_10_0= ruleEAnnotation ) )
                    // InternalEel.g:5197:5: (lv_eAnnotations_10_0= ruleEAnnotation )
                    {
                    // InternalEel.g:5197:5: (lv_eAnnotations_10_0= ruleEAnnotation )
                    // InternalEel.g:5198:6: lv_eAnnotations_10_0= ruleEAnnotation
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

                    // InternalEel.g:5215:4: (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )*
                    loop149:
                    do {
                        int alt149=2;
                        int LA149_0 = input.LA(1);

                        if ( (LA149_0==14) ) {
                            alt149=1;
                        }


                        switch (alt149) {
                    	case 1 :
                    	    // InternalEel.g:5216:5: otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_25); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getEEnumLiteralAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalEel.g:5220:5: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    // InternalEel.g:5221:6: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:5221:6: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    // InternalEel.g:5222:7: lv_eAnnotations_12_0= ruleEAnnotation
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
                    	    break loop149;
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
    // InternalEel.g:5253:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // InternalEel.g:5253:51: (iv_ruleEParameter= ruleEParameter EOF )
            // InternalEel.g:5254:2: iv_ruleEParameter= ruleEParameter EOF
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
    // InternalEel.g:5260:1: ruleEParameter returns [EObject current=null] : ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) ;
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
            // InternalEel.g:5266:2: ( ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) )
            // InternalEel.g:5267:2: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            {
            // InternalEel.g:5267:2: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            // InternalEel.g:5268:3: () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}'
            {
            // InternalEel.g:5268:3: ()
            // InternalEel.g:5269:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEParameterAccess().getEParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,102,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEParameterAccess().getEParameterKeyword_1());
            		
            // InternalEel.g:5279:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEel.g:5280:4: (lv_name_2_0= ruleEString )
            {
            // InternalEel.g:5280:4: (lv_name_2_0= ruleEString )
            // InternalEel.g:5281:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_134); 

            			newLeafNode(otherlv_3, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEel.g:5302:3: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==35) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalEel.g:5303:4: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35); 

                    				newLeafNode(otherlv_4, grammarAccess.getEParameterAccess().getOrderedKeyword_4_0());
                    			
                    // InternalEel.g:5307:4: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // InternalEel.g:5308:5: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // InternalEel.g:5308:5: (lv_ordered_5_0= ruleEBoolean )
                    // InternalEel.g:5309:6: lv_ordered_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getOrderedEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_135);
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

            // InternalEel.g:5327:3: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==36) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalEel.g:5328:4: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_35); 

                    				newLeafNode(otherlv_6, grammarAccess.getEParameterAccess().getUniqueKeyword_5_0());
                    			
                    // InternalEel.g:5332:4: ( (lv_unique_7_0= ruleEBoolean ) )
                    // InternalEel.g:5333:5: (lv_unique_7_0= ruleEBoolean )
                    {
                    // InternalEel.g:5333:5: (lv_unique_7_0= ruleEBoolean )
                    // InternalEel.g:5334:6: lv_unique_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getUniqueEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_136);
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

            // InternalEel.g:5352:3: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==37) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // InternalEel.g:5353:4: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,37,FOLLOW_38); 

                    				newLeafNode(otherlv_8, grammarAccess.getEParameterAccess().getLowerBoundKeyword_6_0());
                    			
                    // InternalEel.g:5357:4: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // InternalEel.g:5358:5: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // InternalEel.g:5358:5: (lv_lowerBound_9_0= ruleEInt )
                    // InternalEel.g:5359:6: lv_lowerBound_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getLowerBoundEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_137);
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

            // InternalEel.g:5377:3: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==38) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // InternalEel.g:5378:4: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,38,FOLLOW_38); 

                    				newLeafNode(otherlv_10, grammarAccess.getEParameterAccess().getUpperBoundKeyword_7_0());
                    			
                    // InternalEel.g:5382:4: ( (lv_upperBound_11_0= ruleEInt ) )
                    // InternalEel.g:5383:5: (lv_upperBound_11_0= ruleEInt )
                    {
                    // InternalEel.g:5383:5: (lv_upperBound_11_0= ruleEInt )
                    // InternalEel.g:5384:6: lv_upperBound_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getUpperBoundEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_101);
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

            // InternalEel.g:5402:3: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==39) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // InternalEel.g:5403:4: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getEParameterAccess().getETypeKeyword_8_0());
                    			
                    // InternalEel.g:5407:4: ( ( ruleEString ) )
                    // InternalEel.g:5408:5: ( ruleEString )
                    {
                    // InternalEel.g:5408:5: ( ruleEString )
                    // InternalEel.g:5409:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEParameterRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEParameterAccess().getETypeEClassifierCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_102);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEel.g:5424:3: (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==29) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // InternalEel.g:5425:4: otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getEParameterAccess().getEAnnotationsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_15, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalEel.g:5433:4: ( (lv_eAnnotations_16_0= ruleEAnnotation ) )
                    // InternalEel.g:5434:5: (lv_eAnnotations_16_0= ruleEAnnotation )
                    {
                    // InternalEel.g:5434:5: (lv_eAnnotations_16_0= ruleEAnnotation )
                    // InternalEel.g:5435:6: lv_eAnnotations_16_0= ruleEAnnotation
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

                    // InternalEel.g:5452:4: (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )*
                    loop156:
                    do {
                        int alt156=2;
                        int LA156_0 = input.LA(1);

                        if ( (LA156_0==14) ) {
                            alt156=1;
                        }


                        switch (alt156) {
                    	case 1 :
                    	    // InternalEel.g:5453:5: otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_25); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEParameterAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalEel.g:5457:5: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    // InternalEel.g:5458:6: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    {
                    	    // InternalEel.g:5458:6: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    // InternalEel.g:5459:7: lv_eAnnotations_18_0= ruleEAnnotation
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
                    	    break loop156;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,15,FOLLOW_103); 

                    				newLeafNode(otherlv_19, grammarAccess.getEParameterAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalEel.g:5482:3: (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==41) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // InternalEel.g:5483:4: otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    {
                    otherlv_20=(Token)match(input,41,FOLLOW_33); 

                    				newLeafNode(otherlv_20, grammarAccess.getEParameterAccess().getEGenericTypeKeyword_10_0());
                    			
                    // InternalEel.g:5487:4: ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    // InternalEel.g:5488:5: (lv_eGenericType_21_0= ruleEGenericType )
                    {
                    // InternalEel.g:5488:5: (lv_eGenericType_21_0= ruleEGenericType )
                    // InternalEel.g:5489:6: lv_eGenericType_21_0= ruleEGenericType
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


    // $ANTLR start "entryRuleNormalDistribution"
    // InternalEel.g:5515:1: entryRuleNormalDistribution returns [EObject current=null] : iv_ruleNormalDistribution= ruleNormalDistribution EOF ;
    public final EObject entryRuleNormalDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalDistribution = null;


        try {
            // InternalEel.g:5515:59: (iv_ruleNormalDistribution= ruleNormalDistribution EOF )
            // InternalEel.g:5516:2: iv_ruleNormalDistribution= ruleNormalDistribution EOF
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
    // InternalEel.g:5522:1: ruleNormalDistribution returns [EObject current=null] : ( () otherlv_1= 'NormalDistribution' ) ;
    public final EObject ruleNormalDistribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEel.g:5528:2: ( ( () otherlv_1= 'NormalDistribution' ) )
            // InternalEel.g:5529:2: ( () otherlv_1= 'NormalDistribution' )
            {
            // InternalEel.g:5529:2: ( () otherlv_1= 'NormalDistribution' )
            // InternalEel.g:5530:3: () otherlv_1= 'NormalDistribution'
            {
            // InternalEel.g:5530:3: ()
            // InternalEel.g:5531:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNormalDistributionAccess().getNormalDistributionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,103,FOLLOW_2); 

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
    // InternalEel.g:5545:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalEel.g:5545:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalEel.g:5546:2: iv_ruleInterval= ruleInterval EOF
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
    // InternalEel.g:5552:1: ruleInterval returns [EObject current=null] : (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' ) ;
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
            // InternalEel.g:5558:2: ( (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' ) )
            // InternalEel.g:5559:2: (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' )
            {
            // InternalEel.g:5559:2: (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' )
            // InternalEel.g:5560:3: otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,104,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIntervalAccess().getIntervalKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_138); 

            			newLeafNode(otherlv_1, grammarAccess.getIntervalAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,105,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getIntervalAccess().getLowerEndpointKeyword_2());
            		
            // InternalEel.g:5572:3: ( (lv_lowerEndpoint_3_0= ruleMeasure ) )
            // InternalEel.g:5573:4: (lv_lowerEndpoint_3_0= ruleMeasure )
            {
            // InternalEel.g:5573:4: (lv_lowerEndpoint_3_0= ruleMeasure )
            // InternalEel.g:5574:5: lv_lowerEndpoint_3_0= ruleMeasure
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getLowerEndpointMeasureParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_139);
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

            otherlv_4=(Token)match(input,106,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getIntervalAccess().getUpperEndpointKeyword_4());
            		
            // InternalEel.g:5595:3: ( (lv_upperEndpoint_5_0= ruleMeasure ) )
            // InternalEel.g:5596:4: (lv_upperEndpoint_5_0= ruleMeasure )
            {
            // InternalEel.g:5596:4: (lv_upperEndpoint_5_0= ruleMeasure )
            // InternalEel.g:5597:5: lv_upperEndpoint_5_0= ruleMeasure
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
    // InternalEel.g:5622:1: entryRuleSampling returns [EObject current=null] : iv_ruleSampling= ruleSampling EOF ;
    public final EObject entryRuleSampling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSampling = null;


        try {
            // InternalEel.g:5622:49: (iv_ruleSampling= ruleSampling EOF )
            // InternalEel.g:5623:2: iv_ruleSampling= ruleSampling EOF
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
    // InternalEel.g:5629:1: ruleSampling returns [EObject current=null] : ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalEel.g:5635:2: ( ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalEel.g:5636:2: ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalEel.g:5636:2: ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalEel.g:5637:3: () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalEel.g:5637:3: ()
            // InternalEel.g:5638:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSamplingAccess().getSamplingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,107,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSamplingAccess().getSamplingKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_140); 

            			newLeafNode(otherlv_2, grammarAccess.getSamplingAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:5652:3: (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==108) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // InternalEel.g:5653:4: otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,108,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSamplingAccess().getMeasurementProcedureKeyword_3_0());
                    			
                    // InternalEel.g:5657:4: ( (lv_measurementProcedure_4_0= ruleEString ) )
                    // InternalEel.g:5658:5: (lv_measurementProcedure_4_0= ruleEString )
                    {
                    // InternalEel.g:5658:5: (lv_measurementProcedure_4_0= ruleEString )
                    // InternalEel.g:5659:6: lv_measurementProcedure_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSamplingAccess().getMeasurementProcedureEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_141);
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

            // InternalEel.g:5677:3: (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==109) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // InternalEel.g:5678:4: otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,109,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getSamplingAccess().getSamplesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_142); 

                    				newLeafNode(otherlv_6, grammarAccess.getSamplingAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalEel.g:5686:4: ( (lv_samples_7_0= ruleSample ) )
                    // InternalEel.g:5687:5: (lv_samples_7_0= ruleSample )
                    {
                    // InternalEel.g:5687:5: (lv_samples_7_0= ruleSample )
                    // InternalEel.g:5688:6: lv_samples_7_0= ruleSample
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

                    // InternalEel.g:5705:4: (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )*
                    loop160:
                    do {
                        int alt160=2;
                        int LA160_0 = input.LA(1);

                        if ( (LA160_0==14) ) {
                            alt160=1;
                        }


                        switch (alt160) {
                    	case 1 :
                    	    // InternalEel.g:5706:5: otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_142); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSamplingAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalEel.g:5710:5: ( (lv_samples_9_0= ruleSample ) )
                    	    // InternalEel.g:5711:6: (lv_samples_9_0= ruleSample )
                    	    {
                    	    // InternalEel.g:5711:6: (lv_samples_9_0= ruleSample )
                    	    // InternalEel.g:5712:7: lv_samples_9_0= ruleSample
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
                    	    break loop160;
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
    // InternalEel.g:5743:1: entryRuleIntegral returns [EObject current=null] : iv_ruleIntegral= ruleIntegral EOF ;
    public final EObject entryRuleIntegral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegral = null;


        try {
            // InternalEel.g:5743:49: (iv_ruleIntegral= ruleIntegral EOF )
            // InternalEel.g:5744:2: iv_ruleIntegral= ruleIntegral EOF
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
    // InternalEel.g:5750:1: ruleIntegral returns [EObject current=null] : (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' ) ;
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
            // InternalEel.g:5756:2: ( (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalEel.g:5757:2: (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalEel.g:5757:2: (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalEel.g:5758:3: otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,110,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIntegralAccess().getIntegralKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_143); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegralAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalEel.g:5766:3: (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==111) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // InternalEel.g:5767:4: otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,111,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getIntegralAccess().getFunctionKeyword_2_0());
                    			
                    // InternalEel.g:5771:4: ( (lv_function_3_0= ruleEString ) )
                    // InternalEel.g:5772:5: (lv_function_3_0= ruleEString )
                    {
                    // InternalEel.g:5772:5: (lv_function_3_0= ruleEString )
                    // InternalEel.g:5773:6: lv_function_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIntegralAccess().getFunctionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_144);
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

            otherlv_4=(Token)match(input,112,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getIntegralAccess().getIntervalKeyword_3());
            		
            // InternalEel.g:5795:3: ( ( ruleEString ) )
            // InternalEel.g:5796:4: ( ruleEString )
            {
            // InternalEel.g:5796:4: ( ruleEString )
            // InternalEel.g:5797:5: ruleEString
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
    // InternalEel.g:5819:1: entryRuleSample returns [EObject current=null] : iv_ruleSample= ruleSample EOF ;
    public final EObject entryRuleSample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSample = null;


        try {
            // InternalEel.g:5819:47: (iv_ruleSample= ruleSample EOF )
            // InternalEel.g:5820:2: iv_ruleSample= ruleSample EOF
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
    // InternalEel.g:5826:1: ruleSample returns [EObject current=null] : ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalEel.g:5832:2: ( ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalEel.g:5833:2: ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalEel.g:5833:2: ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalEel.g:5834:3: () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalEel.g:5834:3: ()
            // InternalEel.g:5835:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSampleAccess().getSampleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,113,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSampleAccess().getSampleKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_145); 

            			newLeafNode(otherlv_2, grammarAccess.getSampleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEel.g:5849:3: (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==114) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // InternalEel.g:5850:4: otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,114,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSampleAccess().getQuantityKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getSampleAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalEel.g:5858:4: ( (lv_quantity_5_0= ruleMeasure ) )
                    // InternalEel.g:5859:5: (lv_quantity_5_0= ruleMeasure )
                    {
                    // InternalEel.g:5859:5: (lv_quantity_5_0= ruleMeasure )
                    // InternalEel.g:5860:6: lv_quantity_5_0= ruleMeasure
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

                    // InternalEel.g:5877:4: (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )*
                    loop163:
                    do {
                        int alt163=2;
                        int LA163_0 = input.LA(1);

                        if ( (LA163_0==14) ) {
                            alt163=1;
                        }


                        switch (alt163) {
                    	case 1 :
                    	    // InternalEel.g:5878:5: otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSampleAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalEel.g:5882:5: ( (lv_quantity_7_0= ruleMeasure ) )
                    	    // InternalEel.g:5883:6: (lv_quantity_7_0= ruleMeasure )
                    	    {
                    	    // InternalEel.g:5883:6: (lv_quantity_7_0= ruleMeasure )
                    	    // InternalEel.g:5884:7: lv_quantity_7_0= ruleMeasure
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
                    	    break loop163;
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


    // $ANTLR start "ruleType"
    // InternalEel.g:5915:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'J' ) | (enumLiteral_3= 'Hz' ) | (enumLiteral_4= 'W' ) | (enumLiteral_5= 'V' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalEel.g:5921:2: ( ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'J' ) | (enumLiteral_3= 'Hz' ) | (enumLiteral_4= 'W' ) | (enumLiteral_5= 'V' ) ) )
            // InternalEel.g:5922:2: ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'J' ) | (enumLiteral_3= 'Hz' ) | (enumLiteral_4= 'W' ) | (enumLiteral_5= 'V' ) )
            {
            // InternalEel.g:5922:2: ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'J' ) | (enumLiteral_3= 'Hz' ) | (enumLiteral_4= 'W' ) | (enumLiteral_5= 'V' ) )
            int alt165=6;
            switch ( input.LA(1) ) {
            case 115:
                {
                alt165=1;
                }
                break;
            case 116:
                {
                alt165=2;
                }
                break;
            case 117:
                {
                alt165=3;
                }
                break;
            case 118:
                {
                alt165=4;
                }
                break;
            case 119:
                {
                alt165=5;
                }
                break;
            case 120:
                {
                alt165=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 165, 0, input);

                throw nvae;
            }

            switch (alt165) {
                case 1 :
                    // InternalEel.g:5923:3: (enumLiteral_0= 'A' )
                    {
                    // InternalEel.g:5923:3: (enumLiteral_0= 'A' )
                    // InternalEel.g:5924:4: enumLiteral_0= 'A'
                    {
                    enumLiteral_0=(Token)match(input,115,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getCurrentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getCurrentEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:5931:3: (enumLiteral_1= 's' )
                    {
                    // InternalEel.g:5931:3: (enumLiteral_1= 's' )
                    // InternalEel.g:5932:4: enumLiteral_1= 's'
                    {
                    enumLiteral_1=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDurationEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getDurationEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEel.g:5939:3: (enumLiteral_2= 'J' )
                    {
                    // InternalEel.g:5939:3: (enumLiteral_2= 'J' )
                    // InternalEel.g:5940:4: enumLiteral_2= 'J'
                    {
                    enumLiteral_2=(Token)match(input,117,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getEnergyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getEnergyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEel.g:5947:3: (enumLiteral_3= 'Hz' )
                    {
                    // InternalEel.g:5947:3: (enumLiteral_3= 'Hz' )
                    // InternalEel.g:5948:4: enumLiteral_3= 'Hz'
                    {
                    enumLiteral_3=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFrequencyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getFrequencyEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEel.g:5955:3: (enumLiteral_4= 'W' )
                    {
                    // InternalEel.g:5955:3: (enumLiteral_4= 'W' )
                    // InternalEel.g:5956:4: enumLiteral_4= 'W'
                    {
                    enumLiteral_4=(Token)match(input,119,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getPowerEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getPowerEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalEel.g:5963:3: (enumLiteral_5= 'V' )
                    {
                    // InternalEel.g:5963:3: (enumLiteral_5= 'V' )
                    // InternalEel.g:5964:4: enumLiteral_5= 'V'
                    {
                    enumLiteral_5=(Token)match(input,120,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getVoltageEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getVoltageEnumLiteralDeclaration_5());
                    			

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
    // InternalEel.g:5974:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEel.g:5980:2: ( ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) ) )
            // InternalEel.g:5981:2: ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) )
            {
            // InternalEel.g:5981:2: ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) )
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==121) ) {
                alt166=1;
            }
            else if ( (LA166_0==122) ) {
                alt166=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 166, 0, input);

                throw nvae;
            }
            switch (alt166) {
                case 1 :
                    // InternalEel.g:5982:3: (enumLiteral_0= 'LOCAL' )
                    {
                    // InternalEel.g:5982:3: (enumLiteral_0= 'LOCAL' )
                    // InternalEel.g:5983:4: enumLiteral_0= 'LOCAL'
                    {
                    enumLiteral_0=(Token)match(input,121,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getLOCALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEel.g:5990:3: (enumLiteral_1= 'GLOBAL' )
                    {
                    // InternalEel.g:5990:3: (enumLiteral_1= 'GLOBAL' )
                    // InternalEel.g:5991:4: enumLiteral_1= 'GLOBAL'
                    {
                    enumLiteral_1=(Token)match(input,122,FOLLOW_2); 

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
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\12\uffff\1\1\11\uffff";
    static final String dfa_3s = "\1\4\1\uffff\2\60\3\uffff\1\4\2\uffff\3\4\2\72\2\60\2\uffff\1\4";
    static final String dfa_4s = "\1\77\1\uffff\2\60\3\uffff\1\5\2\uffff\1\170\2\5\2\73\2\60\2\uffff\1\5";
    static final String dfa_5s = "\1\uffff\1\1\2\uffff\1\2\1\3\1\4\1\uffff\1\7\1\10\7\uffff\1\6\1\5\1\uffff";
    static final String dfa_6s = "\24\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\51\uffff\1\1\2\uffff\1\4\1\uffff\1\7\1\uffff\1\5\1\uffff\1\6\3\uffff\1\10\2\uffff\1\11",
            "",
            "\1\12",
            "\1\12",
            "",
            "",
            "",
            "\1\13\1\14",
            "",
            "",
            "\1\15\1\16\1\1\7\uffff\2\1\4\uffff\1\1\34\uffff\1\1\70\uffff\1\1\10\uffff\6\1",
            "\1\17\1\20",
            "\1\17\1\20",
            "\1\22\1\21",
            "\1\22\1\21",
            "\1\23",
            "\1\23",
            "",
            "",
            "\1\15\1\16"
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
            return "252:2: (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureProductOperation_Impl_4= ruleMeasureProductOperation_Impl | this_MeasureSumOperation_5= ruleMeasureSumOperation | this_EnergyComputation_6= ruleEnergyComputation | this_PowerComputation_7= rulePowerComputation )";
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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x9154800000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000003E7008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000003E6008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000003E4008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000003E0008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000003C0008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000380008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000300008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000019F80000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000FF860008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000FF060008000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000FE060008000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L,0x0000000000040000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000FC060008000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000F8060008000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000F0060008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000E0060008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000E0040008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000C0040008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000C0000008000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000600000008000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000400000008000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000498000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0002000000100042L,0x01F8000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0002000000000002L,0x01F8000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x003A000000048000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x003A000000008000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0032000000008000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0022000000008000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0002000000008000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x00B2000000048000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x00B2000000008000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x00A2000000008000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0082000000008000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0230000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0220000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x6032000000008000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x6022000000008000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x6002000000008000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x4002000000008000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000020008000L,0x000000000000001EL});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000020008000L,0x000000000000001CL});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000020008000L,0x0000000000000018L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000018L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000010L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000020008000L,0x0000000000000040L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000040L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000008000L,0x0000000000007C00L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000008000L,0x0000000000007800L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000008000L,0x0000000000007000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000008000L,0x0000000000006000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000008000L,0x0000000000004000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000048000L,0x0000000000010000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000001E00000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000001C00000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x000002F820008000L,0x0000000006000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x000002F020008000L,0x0000000006000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x000002E020008000L,0x0000000006000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x000002C020008000L,0x0000000006000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000028020008000L,0x0000000006000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000028020008000L,0x0000000004000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000028020008000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000020020008000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000020000008000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000000018700000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0000000018600000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0000000018400000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x000002F820008000L,0x00000000E6000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x000002F020008000L,0x00000000E6000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x000002E020008000L,0x00000000E6000000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x000002C020008000L,0x00000000E6000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000028020008000L,0x00000000E6000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000028020008000L,0x00000000E4000000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000028020008000L,0x00000000E0000000L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000028020008000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000020020008000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000020020008000L,0x0000000080000000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000063008000L,0x0000000200000000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000062008000L,0x0000000200000000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000060008000L,0x0000000200000000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000060008000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000063008000L,0x0000000A00000000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000062008000L,0x0000000A00000000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000060008000L,0x0000000A00000000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000060008000L,0x0000000800000000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000040008000L,0x0000000800000000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000008000L,0x0000000800000000L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000020048000L,0x0000002000000000L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000020008000L,0x0000002000000000L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x000002F820008000L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x000002F020008000L});
    public static final BitSet FOLLOW_136 = new BitSet(new long[]{0x000002E020008000L});
    public static final BitSet FOLLOW_137 = new BitSet(new long[]{0x000002C020008000L});
    public static final BitSet FOLLOW_138 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_139 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_140 = new BitSet(new long[]{0x0000000000008000L,0x0000300000000000L});
    public static final BitSet FOLLOW_141 = new BitSet(new long[]{0x0000000000008000L,0x0000200000000000L});
    public static final BitSet FOLLOW_142 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_143 = new BitSet(new long[]{0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_144 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_145 = new BitSet(new long[]{0x0000000000008000L,0x0004000000000000L});

}