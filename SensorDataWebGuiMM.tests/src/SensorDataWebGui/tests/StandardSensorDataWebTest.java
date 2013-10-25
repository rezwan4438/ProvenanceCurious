/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SensorDataWebGui.tests;

import SensorDataWebGui.SensorDataWebGuiFactory;
import SensorDataWebGui.StandardSensorDataWeb;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Standard Sensor Data Web</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StandardSensorDataWebTest extends TestCase {

	/**
	 * The fixture for this Standard Sensor Data Web test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardSensorDataWeb fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StandardSensorDataWebTest.class);
	}

	/**
	 * Constructs a new Standard Sensor Data Web test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardSensorDataWebTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Standard Sensor Data Web test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StandardSensorDataWeb fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Standard Sensor Data Web test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardSensorDataWeb getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SensorDataWebGuiFactory.eINSTANCE.createStandardSensorDataWeb());
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

} //StandardSensorDataWebTest
