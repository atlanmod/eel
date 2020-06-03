/**
 */
package fr.tblf.energy.estimation.eel.tests;

import fr.tblf.energy.estimation.eel.EelFactory;
import fr.tblf.energy.estimation.eel.LogisticMeasure;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Logistic Measure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogisticMeasureTest extends CompositeMeasureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LogisticMeasureTest.class);
	}

	/**
	 * Constructs a new Logistic Measure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogisticMeasureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Logistic Measure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LogisticMeasure getFixture() {
		return (LogisticMeasure)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EelFactory.eINSTANCE.createLogisticMeasure());
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

} //LogisticMeasureTest
