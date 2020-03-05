/**
 */
package fr.tblf.energy.estimation.eel.util;

import fr.tblf.energy.estimation.eel.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see fr.tblf.energy.estimation.eel.EelPackage
 * @generated
 */
public class EelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EelValidator INSTANCE = new EelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "fr.tblf.energy.estimation.eel";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return EelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case EelPackage.PLATFORM:
				return validatePlatform((Platform)value, diagnostics, context);
			case EelPackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case EelPackage.MEASURE:
				return validateMeasure((Measure)value, diagnostics, context);
			case EelPackage.TYPED_MEASURE:
				return validateTypedMeasure((TypedMeasure)value, diagnostics, context);
			case EelPackage.MEASURE_VALUE:
				return validateMeasureValue((MeasureValue)value, diagnostics, context);
			case EelPackage.MEASURE_OCL:
				return validateMeasureOCL((MeasureOCL)value, diagnostics, context);
			case EelPackage.MEASURE_ATTRIBUTE:
				return validateMeasureAttribute((MeasureAttribute)value, diagnostics, context);
			case EelPackage.MEASURE_CAST:
				return validateMeasureCast((MeasureCast)value, diagnostics, context);
			case EelPackage.MEASURE_BINARY_OPERATION:
				return validateMeasureBinaryOperation((MeasureBinaryOperation)value, diagnostics, context);
			case EelPackage.MEASURE_BINARY_PRODUCT_OPERATION:
				return validateMeasureBinaryProductOperation((MeasureBinaryProductOperation)value, diagnostics, context);
			case EelPackage.MEASURE_BINARY_SUM_OPERATION:
				return validateMeasureBinarySumOperation((MeasureBinarySumOperation)value, diagnostics, context);
			case EelPackage.ENERGY_COMPUTATION:
				return validateEnergyComputation((EnergyComputation)value, diagnostics, context);
			case EelPackage.POWER_COMPUTATION:
				return validatePowerComputation((PowerComputation)value, diagnostics, context);
			case EelPackage.MEASURE_UNBOUND_OPERATION:
				return validateMeasureUnboundOperation((MeasureUnboundOperation)value, diagnostics, context);
			case EelPackage.MEASURE_UNBOUND_SUM_OPERATION:
				return validateMeasureUnboundSumOperation((MeasureUnboundSumOperation)value, diagnostics, context);
			case EelPackage.MEASURE_UNBOUND_PRODUCT_OPERATION:
				return validateMeasureUnboundProductOperation((MeasureUnboundProductOperation)value, diagnostics, context);
			case EelPackage.MEASUREMENT_UNCERTAINTY:
				return validateMeasurementUncertainty((MeasurementUncertainty)value, diagnostics, context);
			case EelPackage.NORMAL_DISTRIBUTION:
				return validateNormalDistribution((NormalDistribution)value, diagnostics, context);
			case EelPackage.INTERVAL:
				return validateInterval((Interval)value, diagnostics, context);
			case EelPackage.MEASUREMENT_UNCERTAINTY_INFORMATION:
				return validateMeasurementUncertaintyInformation((MeasurementUncertaintyInformation)value, diagnostics, context);
			case EelPackage.SAMPLING:
				return validateSampling((Sampling)value, diagnostics, context);
			case EelPackage.INTEGRAL:
				return validateIntegral((Integral)value, diagnostics, context);
			case EelPackage.SAMPLE:
				return validateSample((Sample)value, diagnostics, context);
			case EelPackage.VISIBILITY:
				return validateVisibility((Visibility)value, diagnostics, context);
			case EelPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlatform(Platform platform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(platform, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasure(Measure measure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedMeasure(TypedMeasure typedMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typedMeasure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureValue(MeasureValue measureValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureOCL(MeasureOCL measureOCL, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureOCL, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureAttribute(MeasureAttribute measureAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(measureAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(measureAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(measureAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(measureAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(measureAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(measureAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(measureAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(measureAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(measureAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasureAttribute_isAttribute(measureAttribute, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the isAttribute constraint of '<em>Measure Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEASURE_ATTRIBUTE__IS_ATTRIBUTE__EEXPRESSION = "self.att.oclIsKindOf(ecore::EAttribute)";

	/**
	 * Validates the isAttribute constraint of '<em>Measure Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureAttribute_isAttribute(MeasureAttribute measureAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EelPackage.Literals.MEASURE_ATTRIBUTE,
				 measureAttribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isAttribute",
				 MEASURE_ATTRIBUTE__IS_ATTRIBUTE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureCast(MeasureCast measureCast, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureCast, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureBinaryOperation(MeasureBinaryOperation measureBinaryOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureBinaryOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureBinaryProductOperation(MeasureBinaryProductOperation measureBinaryProductOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureBinaryProductOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureBinarySumOperation(MeasureBinarySumOperation measureBinarySumOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureBinarySumOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnergyComputation(EnergyComputation energyComputation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(energyComputation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerComputation(PowerComputation powerComputation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(powerComputation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureUnboundOperation(MeasureUnboundOperation measureUnboundOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureUnboundOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureUnboundSumOperation(MeasureUnboundSumOperation measureUnboundSumOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureUnboundSumOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureUnboundProductOperation(MeasureUnboundProductOperation measureUnboundProductOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureUnboundProductOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurementUncertainty(MeasurementUncertainty measurementUncertainty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measurementUncertainty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNormalDistribution(NormalDistribution normalDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(normalDistribution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterval(Interval interval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interval, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurementUncertaintyInformation(MeasurementUncertaintyInformation measurementUncertaintyInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measurementUncertaintyInformation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampling(Sampling sampling, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sampling, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegral(Integral integral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSample(Sample sample, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sample, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibility(Visibility visibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EelValidator
