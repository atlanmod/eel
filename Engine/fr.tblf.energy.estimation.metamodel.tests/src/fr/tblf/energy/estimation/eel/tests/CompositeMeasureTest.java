/**
 */
package fr.tblf.energy.estimation.eel.tests;

import fr.tblf.energy.estimation.eel.CompositeMeasure;
import fr.tblf.energy.estimation.eel.EelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Composite Measure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeMeasureTest extends MeasureValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompositeMeasureTest.class);
	}

	/**
	 * Constructs a new Composite Measure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMeasureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Composite Measure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompositeMeasure getFixture() {
		return (CompositeMeasure)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EelFactory.eINSTANCE.createCompositeMeasure());
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

} //CompositeMeasureTest
