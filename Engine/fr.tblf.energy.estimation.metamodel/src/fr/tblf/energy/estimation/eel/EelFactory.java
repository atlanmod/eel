/**
 */
package fr.tblf.energy.estimation.eel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.tblf.energy.estimation.eel.EelPackage
 * @generated
 */
public interface EelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EelFactory eINSTANCE = fr.tblf.energy.estimation.eel.impl.EelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform</em>'.
	 * @generated
	 */
	Platform createPlatform();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Measure Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Value</em>'.
	 * @generated
	 */
	MeasureValue createMeasureValue();

	/**
	 * Returns a new object of class '<em>Measure OCL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure OCL</em>'.
	 * @generated
	 */
	MeasureOCL createMeasureOCL();

	/**
	 * Returns a new object of class '<em>Measure Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Attribute</em>'.
	 * @generated
	 */
	MeasureAttribute createMeasureAttribute();

	/**
	 * Returns a new object of class '<em>Measure Cast</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Cast</em>'.
	 * @generated
	 */
	MeasureCast createMeasureCast();

	/**
	 * Returns a new object of class '<em>Measure Binary Product Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Binary Product Operation</em>'.
	 * @generated
	 */
	MeasureBinaryProductOperation createMeasureBinaryProductOperation();

	/**
	 * Returns a new object of class '<em>Measure Binary Sum Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Binary Sum Operation</em>'.
	 * @generated
	 */
	MeasureBinarySumOperation createMeasureBinarySumOperation();

	/**
	 * Returns a new object of class '<em>Energy Computation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Energy Computation</em>'.
	 * @generated
	 */
	EnergyComputation createEnergyComputation();

	/**
	 * Returns a new object of class '<em>Power Computation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Computation</em>'.
	 * @generated
	 */
	PowerComputation createPowerComputation();

	/**
	 * Returns a new object of class '<em>Measure Unbound Sum Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Unbound Sum Operation</em>'.
	 * @generated
	 */
	MeasureUnboundSumOperation createMeasureUnboundSumOperation();

	/**
	 * Returns a new object of class '<em>Measure Unbound Product Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Unbound Product Operation</em>'.
	 * @generated
	 */
	MeasureUnboundProductOperation createMeasureUnboundProductOperation();

	/**
	 * Returns a new object of class '<em>Measurement Uncertainty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement Uncertainty</em>'.
	 * @generated
	 */
	MeasurementUncertainty createMeasurementUncertainty();

	/**
	 * Returns a new object of class '<em>Normal Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Distribution</em>'.
	 * @generated
	 */
	NormalDistribution createNormalDistribution();

	/**
	 * Returns a new object of class '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interval</em>'.
	 * @generated
	 */
	Interval createInterval();

	/**
	 * Returns a new object of class '<em>Sampling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sampling</em>'.
	 * @generated
	 */
	Sampling createSampling();

	/**
	 * Returns a new object of class '<em>Integral</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integral</em>'.
	 * @generated
	 */
	Integral createIntegral();

	/**
	 * Returns a new object of class '<em>Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sample</em>'.
	 * @generated
	 */
	Sample createSample();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EelPackage getEelPackage();

} //EelFactory
