/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SensorDataWebGui.tests;

import SensorDataWebGui.SensorDataWebGuiFactory;
import SensorDataWebGui.TupleWindow;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tuple Window</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TupleWindowTest extends ArcTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TupleWindowTest.class);
	}

	/**
	 * Constructs a new Tuple Window test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleWindowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tuple Window test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TupleWindow getFixture() {
		return (TupleWindow)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SensorDataWebGuiFactory.eINSTANCE.createTupleWindow());
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

} //TupleWindowTest
