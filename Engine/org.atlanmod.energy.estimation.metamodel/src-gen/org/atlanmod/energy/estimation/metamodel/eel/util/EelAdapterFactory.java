/**
 */
package org.atlanmod.energy.estimation.metamodel.eel.util;

import org.atlanmod.energy.estimation.metamodel.eel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage
 * @generated
 */
public class EelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EelSwitch<Adapter> modelSwitch = new EelSwitch<Adapter>() {
		@Override
		public Adapter casePlatform(Platform object) {
			return createPlatformAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseMeasure(Measure object) {
			return createMeasureAdapter();
		}

		@Override
		public Adapter caseTypedMeasure(TypedMeasure object) {
			return createTypedMeasureAdapter();
		}

		@Override
		public Adapter caseMeasureValue(MeasureValue object) {
			return createMeasureValueAdapter();
		}

		@Override
		public Adapter caseMeasureOCL(MeasureOCL object) {
			return createMeasureOCLAdapter();
		}

		@Override
		public Adapter caseMeasureAttribute(MeasureAttribute object) {
			return createMeasureAttributeAdapter();
		}

		@Override
		public Adapter caseMeasureCast(MeasureCast object) {
			return createMeasureCastAdapter();
		}

		@Override
		public Adapter caseMeasureBinaryOperation(MeasureBinaryOperation object) {
			return createMeasureBinaryOperationAdapter();
		}

		@Override
		public Adapter caseMeasureBinaryProductOperation(MeasureBinaryProductOperation object) {
			return createMeasureBinaryProductOperationAdapter();
		}

		@Override
		public Adapter caseMeasureBinarySumOperation(MeasureBinarySumOperation object) {
			return createMeasureBinarySumOperationAdapter();
		}

		@Override
		public Adapter caseEnergyComputation(EnergyComputation object) {
			return createEnergyComputationAdapter();
		}

		@Override
		public Adapter casePowerComputation(PowerComputation object) {
			return createPowerComputationAdapter();
		}

		@Override
		public Adapter caseRealTimeDuration(RealTimeDuration object) {
			return createRealTimeDurationAdapter();
		}

		@Override
		public Adapter caseMeasureUnboundOperation(MeasureUnboundOperation object) {
			return createMeasureUnboundOperationAdapter();
		}

		@Override
		public Adapter caseMeasureUnboundSumOperation(MeasureUnboundSumOperation object) {
			return createMeasureUnboundSumOperationAdapter();
		}

		@Override
		public Adapter caseMeasureUnboundSubstractOperation(MeasureUnboundSubstractOperation object) {
			return createMeasureUnboundSubstractOperationAdapter();
		}

		@Override
		public Adapter caseMeasureUnboundProductOperation(MeasureUnboundProductOperation object) {
			return createMeasureUnboundProductOperationAdapter();
		}

		@Override
		public Adapter caseMeasureUnboundDivisionOperation(MeasureUnboundDivisionOperation object) {
			return createMeasureUnboundDivisionOperationAdapter();
		}

		@Override
		public Adapter caseMeasurementUncertainty(MeasurementUncertainty object) {
			return createMeasurementUncertaintyAdapter();
		}

		@Override
		public Adapter caseNormalDistribution(NormalDistribution object) {
			return createNormalDistributionAdapter();
		}

		@Override
		public Adapter caseInterval(Interval object) {
			return createIntervalAdapter();
		}

		@Override
		public Adapter caseMeasurementUncertaintyInformation(MeasurementUncertaintyInformation object) {
			return createMeasurementUncertaintyInformationAdapter();
		}

		@Override
		public Adapter caseSampling(Sampling object) {
			return createSamplingAdapter();
		}

		@Override
		public Adapter caseIntegral(Integral object) {
			return createIntegralAdapter();
		}

		@Override
		public Adapter caseSample(Sample object) {
			return createSampleAdapter();
		}

		@Override
		public Adapter caseCompositeMeasure(CompositeMeasure object) {
			return createCompositeMeasureAdapter();
		}

		@Override
		public Adapter caseLogisticMeasure(LogisticMeasure object) {
			return createLogisticMeasureAdapter();
		}

		@Override
		public Adapter caseExponentialMeasure(ExponentialMeasure object) {
			return createExponentialMeasureAdapter();
		}

		@Override
		public Adapter caseTailMeasure(TailMeasure object) {
			return createTailMeasureAdapter();
		}

		@Override
		public Adapter caseIntegrationMeasure(IntegrationMeasure object) {
			return createIntegrationMeasureAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Platform
	 * @generated
	 */
	public Adapter createPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Measure
	 * @generated
	 */
	public Adapter createMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.TypedMeasure <em>Typed Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.TypedMeasure
	 * @generated
	 */
	public Adapter createTypedMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureValue <em>Measure Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureValue
	 * @generated
	 */
	public Adapter createMeasureValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureOCL <em>Measure OCL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureOCL
	 * @generated
	 */
	public Adapter createMeasureOCLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureAttribute <em>Measure Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureAttribute
	 * @generated
	 */
	public Adapter createMeasureAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureCast <em>Measure Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureCast
	 * @generated
	 */
	public Adapter createMeasureCastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureBinaryOperation <em>Measure Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureBinaryOperation
	 * @generated
	 */
	public Adapter createMeasureBinaryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureBinaryProductOperation <em>Measure Binary Product Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureBinaryProductOperation
	 * @generated
	 */
	public Adapter createMeasureBinaryProductOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureBinarySumOperation <em>Measure Binary Sum Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureBinarySumOperation
	 * @generated
	 */
	public Adapter createMeasureBinarySumOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.EnergyComputation <em>Energy Computation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.EnergyComputation
	 * @generated
	 */
	public Adapter createEnergyComputationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.PowerComputation <em>Power Computation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.PowerComputation
	 * @generated
	 */
	public Adapter createPowerComputationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.RealTimeDuration <em>Real Time Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.RealTimeDuration
	 * @generated
	 */
	public Adapter createRealTimeDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundOperation <em>Measure Unbound Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundOperation
	 * @generated
	 */
	public Adapter createMeasureUnboundOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundSumOperation <em>Measure Unbound Sum Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundSumOperation
	 * @generated
	 */
	public Adapter createMeasureUnboundSumOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundSubstractOperation <em>Measure Unbound Substract Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundSubstractOperation
	 * @generated
	 */
	public Adapter createMeasureUnboundSubstractOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundProductOperation <em>Measure Unbound Product Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundProductOperation
	 * @generated
	 */
	public Adapter createMeasureUnboundProductOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundDivisionOperation <em>Measure Unbound Division Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundDivisionOperation
	 * @generated
	 */
	public Adapter createMeasureUnboundDivisionOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasurementUncertainty <em>Measurement Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasurementUncertainty
	 * @generated
	 */
	public Adapter createMeasurementUncertaintyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.NormalDistribution <em>Normal Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.NormalDistribution
	 * @generated
	 */
	public Adapter createNormalDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Interval
	 * @generated
	 */
	public Adapter createIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasurementUncertaintyInformation <em>Measurement Uncertainty Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasurementUncertaintyInformation
	 * @generated
	 */
	public Adapter createMeasurementUncertaintyInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.Sampling <em>Sampling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Sampling
	 * @generated
	 */
	public Adapter createSamplingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.Integral <em>Integral</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Integral
	 * @generated
	 */
	public Adapter createIntegralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.Sample <em>Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Sample
	 * @generated
	 */
	public Adapter createSampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.CompositeMeasure <em>Composite Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.CompositeMeasure
	 * @generated
	 */
	public Adapter createCompositeMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.LogisticMeasure <em>Logistic Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.LogisticMeasure
	 * @generated
	 */
	public Adapter createLogisticMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.ExponentialMeasure <em>Exponential Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.ExponentialMeasure
	 * @generated
	 */
	public Adapter createExponentialMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.TailMeasure <em>Tail Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.TailMeasure
	 * @generated
	 */
	public Adapter createTailMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.energy.estimation.metamodel.eel.IntegrationMeasure <em>Integration Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.IntegrationMeasure
	 * @generated
	 */
	public Adapter createIntegrationMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EelAdapterFactory
