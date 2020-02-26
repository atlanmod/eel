/**
 */
package eel.tests;

import eel.EelFactory;
import eel.MeasureCast;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Measure Cast</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasureCastTest extends TypedMeasureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MeasureCastTest.class);
	}

	/**
	 * Constructs a new Measure Cast test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureCastTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Measure Cast test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MeasureCast getFixture() {
		return (MeasureCast)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EelFactory.eINSTANCE.createMeasureCast());
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

} //MeasureCastTest
