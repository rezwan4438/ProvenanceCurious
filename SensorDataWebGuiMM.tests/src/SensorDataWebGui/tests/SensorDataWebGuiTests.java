/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SensorDataWebGui.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>SensorDataWebGui</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensorDataWebGuiTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new SensorDataWebGuiTests("SensorDataWebGui Tests");
		suite.addTestSuite(ProcessingElementTest.class);
		suite.addTestSuite(SourceTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorDataWebGuiTests(String name) {
		super(name);
	}

} //SensorDataWebGuiTests
