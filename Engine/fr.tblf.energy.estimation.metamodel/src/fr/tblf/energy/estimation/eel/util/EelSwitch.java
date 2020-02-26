/**
 */
package fr.tblf.energy.estimation.eel.util;

import fr.tblf.energy.estimation.eel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.tblf.energy.estimation.eel.EelPackage
 * @generated
 */
public class EelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EelSwitch() {
		if (modelPackage == null) {
			modelPackage = EelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EelPackage.PLATFORM: {
				Platform platform = (Platform)theEObject;
				T result = casePlatform(platform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EelPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EelPackage.MEASURE: {
				Measure measure = (Measure)theEObject;
				T result = caseMeasure(measure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EelPackage.TYPED_MEASURE: {
				TypedMeasure typedMeasure = (TypedMeasure)theEObject;
				T result = caseTypedMeasure(typedMeasure);
				if (result == null) result = caseMeasure(typedMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EelPackage.MEASURE_VALUE: {
				MeasureValue measureValue = (MeasureValue)theEObject;
				T result = caseMeasureValue(measureValue);
				if (result == null) result = caseTypedMeasure(measureValue);
				if (result == null) result = caseMeasure(measureValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EelPackage.MEASURE_OCL: {
				MeasureOCL measureOCL = (MeasureOCL)theEObject;
				T result = caseMeasureOCL(measureOCL);
				if (result == null) result = caseMeasureValue(measureOCL);
				if (result == null) result = caseTypedMeasure(measureOCL);
				if (result == null) result = caseMeasure(measureOCL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EelPackage.MEASURE_ATTRIBUTE: {
				MeasureAttribute measureAttribute = (MeasureAttribute)theEObject;
				T result = caseMeasureAttribute(measureAttribute);
				if (result == null) result = caseMeasureValue(measureAttribute);
				if (result == null) result = caseTypedMeasure(measureAttribute);
				if (result == null) result = caseMeasure(measureAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EelPackage.MEASURE_CAST: {
				MeasureCast measureCast = (MeasureCast)theEObject;
				T result = caseMeasureCast(measureCast);
				if (result == null) result = caseTypedMeasure(measureCast);
				if (result == null) result = caseMeasure(measureCast);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EelPackage.MEASURE_OPERATION: {
				MeasureOperation measureOperation = (MeasureOperation)theEObject;
				T result = caseMeasureOperation(measureOperation);
				if (result == null) result = caseMeasure(measureOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EelPackage.MEASURE_PRODUCT_OPERATION: {
				MeasureProductOperation measureProductOperation = (MeasureProductOperation)theEObject;
				T result = caseMeasureProductOperation(measureProductOperation);
				if (result == null) result = caseMeasureOperation(measureProductOperation);
				if (result == null) result = caseMeasure(measureProductOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EelPackage.MEASURE_SUM_OPERATION: {
				MeasureSumOperation measureSumOperation = (MeasureSumOperation)theEObject;
				T result = caseMeasureSumOperation(measureSumOperation);
				if (result == null) result = caseMeasureOperation(measureSumOperation);
				if (result == null) result = caseMeasure(measureSumOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EelPackage.ENERGY_COMPUTATION: {
				EnergyComputation energyComputation = (EnergyComputation)theEObject;
				T result = caseEnergyComputation(energyComputation);
				if (result == null) result = caseMeasureProductOperation(energyComputation);
				if (result == null) result = caseMeasureOperation(energyComputation);
				if (result == null) result = caseMeasure(energyComputation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EelPackage.POWER_COMPUTATION: {
				PowerComputation powerComputation = (PowerComputation)theEObject;
				T result = casePowerComputation(powerComputation);
				if (result == null) result = caseMeasureProductOperation(powerComputation);
				if (result == null) result = caseMeasureOperation(powerComputation);
				if (result == null) result = caseMeasure(powerComputation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EelPackage.MEASUREMENT_UNCERTAINTY: {
				MeasurementUncertainty measurementUncertainty = (MeasurementUncertainty)theEObject;
				T result = caseMeasurementUncertainty(measurementUncertainty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EelPackage.NORMAL_DISTRIBUTION: {
				NormalDistribution normalDistribution = (NormalDistribution)theEObject;
				T result = caseNormalDistribution(normalDistribution);
				if (result == null) result = caseMeasurementUncertaintyInformation(normalDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EelPackage.INTERVAL: {
				Interval interval = (Interval)theEObject;
				T result = caseInterval(interval);
				if (result == null) result = caseMeasurementUncertaintyInformation(interval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EelPackage.MEASUREMENT_UNCERTAINTY_INFORMATION: {
				MeasurementUncertaintyInformation measurementUncertaintyInformation = (MeasurementUncertaintyInformation)theEObject;
				T result = caseMeasurementUncertaintyInformation(measurementUncertaintyInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EelPackage.SAMPLING: {
				Sampling sampling = (Sampling)theEObject;
				T result = caseSampling(sampling);
				if (result == null) result = caseMeasurementUncertaintyInformation(sampling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EelPackage.INTEGRAL: {
				Integral integral = (Integral)theEObject;
				T result = caseIntegral(integral);
				if (result == null) result = caseMeasurementUncertaintyInformation(integral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EelPackage.SAMPLE: {
				Sample sample = (Sample)theEObject;
				T result = caseSample(sample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatform(Platform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasure(Measure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedMeasure(TypedMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureValue(MeasureValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure OCL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure OCL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureOCL(MeasureOCL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureAttribute(MeasureAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Cast</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Cast</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureCast(MeasureCast object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureOperation(MeasureOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Product Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Product Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureProductOperation(MeasureProductOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Sum Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Sum Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureSumOperation(MeasureSumOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energy Computation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy Computation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergyComputation(EnergyComputation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Computation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Computation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerComputation(PowerComputation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Uncertainty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Uncertainty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementUncertainty(MeasurementUncertainty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalDistribution(NormalDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterval(Interval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Uncertainty Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Uncertainty Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementUncertaintyInformation(MeasurementUncertaintyInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sampling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sampling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSampling(Sampling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integral</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegral(Integral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSample(Sample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EelSwitch
