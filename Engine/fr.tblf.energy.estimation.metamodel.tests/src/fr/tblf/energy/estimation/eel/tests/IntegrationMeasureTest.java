/**
 */
package fr.tblf.energy.estimation.eel.tests;

import fr.tblf.energy.estimation.eel.EelFactory;
import fr.tblf.energy.estimation.eel.IntegrationMeasure;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Integration Measure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegrationMeasureTest extends CompositeMeasureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntegrationMeasureTest.class);
	}

	/**
	 * Constructs a new Integration Measure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationMeasureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Integration Measure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntegrationMeasure getFixture() {
		return (IntegrationMeasure)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EelFactory.eINSTANCE.createIntegrationMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //IntegrationMeasureTest
