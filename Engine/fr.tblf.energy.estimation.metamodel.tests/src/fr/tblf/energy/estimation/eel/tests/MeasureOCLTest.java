/**
 */
package fr.tblf.energy.estimation.eel.tests;

import fr.tblf.energy.estimation.eel.EelFactory;
import fr.tblf.energy.estimation.eel.MeasureOCL;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Measure OCL</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasureOCLTest extends MeasureValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MeasureOCLTest.class);
	}

	/**
	 * Constructs a new Measure OCL test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureOCLTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Measure OCL test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MeasureOCL getFixture() {
		return (MeasureOCL)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EelFactory.eINSTANCE.createMeasureOCL());
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

} //MeasureOCLTest
