/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SensorDataWebGui.tests;

import SensorDataWebGui.ProcessingElement;
import SensorDataWebGui.SensorDataWebGuiFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Processing Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessingElementTest extends AbstractPETest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessingElementTest.class);
	}

	/**
	 * Constructs a new Processing Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Processing Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProcessingElement getFixture() {
		return (ProcessingElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SensorDataWebGuiFactory.eINSTANCE.createProcessingElement());
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

} //ProcessingElementTest
