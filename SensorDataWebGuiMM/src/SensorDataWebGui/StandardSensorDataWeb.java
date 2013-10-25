/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SensorDataWebGui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Sensor Data Web</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SensorDataWebGui.StandardSensorDataWeb#getName <em>Name</em>}</li>
 *   <li>{@link SensorDataWebGui.StandardSensorDataWeb#getContainsPEs <em>Contains PEs</em>}</li>
 *   <li>{@link SensorDataWebGui.StandardSensorDataWeb#getContainsArcs <em>Contains Arcs</em>}</li>
 *   <li>{@link SensorDataWebGui.StandardSensorDataWeb#getDiagramType <em>Diagram Type</em>}</li>
 *   <li>{@link SensorDataWebGui.StandardSensorDataWeb#getContainsGraph <em>Contains Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @see SensorDataWebGui.SensorDataWebGuiPackage#getStandardSensorDataWeb()
 * @model
 * @generated
 */
public interface StandardSensorDataWeb extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getStandardSensorDataWeb_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.StandardSensorDataWeb#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contains PEs</b></em>' containment reference list.
	 * The list contents are of type {@link SensorDataWebGui.AbstractPE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains PEs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains PEs</em>' containment reference list.
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getStandardSensorDataWeb_ContainsPEs()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractPE> getContainsPEs();

	/**
	 * Returns the value of the '<em><b>Contains Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link SensorDataWebGui.Arc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Arcs</em>' containment reference list.
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getStandardSensorDataWeb_ContainsArcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getContainsArcs();

	/**
	 * Returns the value of the '<em><b>Diagram Type</b></em>' attribute.
	 * The literals are from the enumeration {@link SensorDataWebGui.DiagramTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Type</em>' attribute.
	 * @see SensorDataWebGui.DiagramTypes
	 * @see #setDiagramType(DiagramTypes)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getStandardSensorDataWeb_DiagramType()
	 * @model
	 * @generated
	 */
	DiagramTypes getDiagramType();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.StandardSensorDataWeb#getDiagramType <em>Diagram Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Type</em>' attribute.
	 * @see SensorDataWebGui.DiagramTypes
	 * @see #getDiagramType()
	 * @generated
	 */
	void setDiagramType(DiagramTypes value);

	/**
	 * Returns the value of the '<em><b>Contains Graph</b></em>' containment reference list.
	 * The list contents are of type {@link SensorDataWebGui.Graph}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Graph</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Graph</em>' containment reference list.
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getStandardSensorDataWeb_ContainsGraph()
	 * @model containment="true"
	 * @generated
	 */
	EList<Graph> getContainsGraph();

} // StandardSensorDataWeb
