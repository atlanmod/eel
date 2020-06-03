/**
 */
package fr.tblf.energy.estimation.eel.tests;

import fr.tblf.energy.estimation.eel.EelFactory;
import fr.tblf.energy.estimation.eel.ExponentialMeasure;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exponential Measure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExponentialMeasureTest extends CompositeMeasureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExponentialMeasureTest.class);
	}

	/**
	 * Constructs a new Exponential Measure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExponentialMeasureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Exponential Measure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExponentialMeasure getFixture() {
		return (ExponentialMeasure)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EelFactory.eINSTANCE.createExponentialMeasure());
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

} //ExponentialMeasureTest
