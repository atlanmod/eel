/**
 */
package eel.tests;

import eel.EelFactory;
import eel.MeasureAttribute;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Measure Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasureAttributeTest extends MeasureValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MeasureAttributeTest.class);
	}

	/**
	 * Constructs a new Measure Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Measure Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MeasureAttribute getFixture() {
		return (MeasureAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EelFactory.eINSTANCE.createMeasureAttribute());
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

} //MeasureAttributeTest
