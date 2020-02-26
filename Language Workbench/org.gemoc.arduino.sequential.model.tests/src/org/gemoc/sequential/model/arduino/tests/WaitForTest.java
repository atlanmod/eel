/**
 */
package org.gemoc.sequential.model.arduino.tests;

import junit.textui.TestRunner;

import org.gemoc.sequential.model.arduino.ArduinoFactory;
import org.gemoc.sequential.model.arduino.WaitFor;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Wait For</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WaitForTest extends UtilitiesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WaitForTest.class);
	}

	/**
	 * Constructs a new Wait For test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitForTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Wait For test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WaitFor getFixture() {
		return (WaitFor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArduinoFactory.eINSTANCE.createWaitFor());
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

} //WaitForTest
