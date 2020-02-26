/**
 */
package fr.tblf.energy.estimation.eel.impl;

import fr.tblf.energy.estimation.eel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EelFactoryImpl extends EFactoryImpl implements EelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EelFactory init() {
		try {
			EelFactory theEelFactory = (EelFactory)EPackage.Registry.INSTANCE.getEFactory(EelPackage.eNS_URI);
			if (theEelFactory != null) {
				return theEelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EelPackage.PLATFORM: return createPlatform();
			case EelPackage.VARIABLE: return createVariable();
			case EelPackage.MEASURE_VALUE: return createMeasureValue();
			case EelPackage.MEASURE_OCL: return createMeasureOCL();
			case EelPackage.MEASURE_ATTRIBUTE: return createMeasureAttribute();
			case EelPackage.MEASURE_CAST: return createMeasureCast();
			case EelPackage.MEASURE_PRODUCT_OPERATION: return createMeasureProductOperation();
			case EelPackage.MEASURE_SUM_OPERATION: return createMeasureSumOperation();
			case EelPackage.ENERGY_COMPUTATION: return createEnergyComputation();
			case EelPackage.POWER_COMPUTATION: return createPowerComputation();
			case EelPackage.MEASUREMENT_UNCERTAINTY: return createMeasurementUncertainty();
			case EelPackage.NORMAL_DISTRIBUTION: return createNormalDistribution();
			case EelPackage.INTERVAL: return createInterval();
			case EelPackage.SAMPLING: return createSampling();
			case EelPackage.INTEGRAL: return createIntegral();
			case EelPackage.SAMPLE: return createSample();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EelPackage.VISIBILITY:
				return createVisibilityFromString(eDataType, initialValue);
			case EelPackage.TYPE:
				return createTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EelPackage.VISIBILITY:
				return convertVisibilityToString(eDataType, instanceValue);
			case EelPackage.TYPE:
				return convertTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform createPlatform() {
		PlatformImpl platform = new PlatformImpl();
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureValue createMeasureValue() {
		MeasureValueImpl measureValue = new MeasureValueImpl();
		return measureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureOCL createMeasureOCL() {
		MeasureOCLImpl measureOCL = new MeasureOCLImpl();
		return measureOCL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureAttribute createMeasureAttribute() {
		MeasureAttributeImpl measureAttribute = new MeasureAttributeImpl();
		return measureAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureCast createMeasureCast() {
		MeasureCastImpl measureCast = new MeasureCastImpl();
		return measureCast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureProductOperation createMeasureProductOperation() {
		MeasureProductOperationImpl measureProductOperation = new MeasureProductOperationImpl();
		return measureProductOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureSumOperation createMeasureSumOperation() {
		MeasureSumOperationImpl measureSumOperation = new MeasureSumOperationImpl();
		return measureSumOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyComputation createEnergyComputation() {
		EnergyComputationImpl energyComputation = new EnergyComputationImpl();
		return energyComputation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerComputation createPowerComputation() {
		PowerComputationImpl powerComputation = new PowerComputationImpl();
		return powerComputation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementUncertainty createMeasurementUncertainty() {
		MeasurementUncertaintyImpl measurementUncertainty = new MeasurementUncertaintyImpl();
		return measurementUncertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalDistribution createNormalDistribution() {
		NormalDistributionImpl normalDistribution = new NormalDistributionImpl();
		return normalDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval createInterval() {
		IntervalImpl interval = new IntervalImpl();
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sampling createSampling() {
		SamplingImpl sampling = new SamplingImpl();
		return sampling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integral createIntegral() {
		IntegralImpl integral = new IntegralImpl();
		return integral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sample createSample() {
		SampleImpl sample = new SampleImpl();
		return sample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
		Visibility result = Visibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EelPackage getEelPackage() {
		return (EelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EelPackage getPackage() {
		return EelPackage.eINSTANCE;
	}

} //EelFactoryImpl
