/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SensorDataWebGui.tests;

import SensorDataWebGui.FixedWindow;
import SensorDataWebGui.SensorDataWebGuiFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fixed Window</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FixedWindowTest extends ArcTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FixedWindowTest.class);
	}

	/**
	 * Constructs a new Fixed Window test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedWindowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fixed Window test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FixedWindow getFixture() {
		return (FixedWindow)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SensorDataWebGuiFactory.eINSTANCE.createFixedWindow());
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

} //FixedWindowTest
