/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SensorDataWebGui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SensorDataWebGui.Arc#getWindowPredicate <em>Window Predicate</em>}</li>
 *   <li>{@link SensorDataWebGui.Arc#getName <em>Name</em>}</li>
 *   <li>{@link SensorDataWebGui.Arc#getArcFromPE <em>Arc From PE</em>}</li>
 *   <li>{@link SensorDataWebGui.Arc#getArcToPE <em>Arc To PE</em>}</li>
 *   <li>{@link SensorDataWebGui.Arc#getDescription <em>Description</em>}</li>
 *   <li>{@link SensorDataWebGui.Arc#getValidTime <em>Valid Time</em>}</li>
 *   <li>{@link SensorDataWebGui.Arc#getTransactionTime <em>Transaction Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see SensorDataWebGui.SensorDataWebGuiPackage#getArc()
 * @model abstract="true"
 * @generated
 */
public interface Arc extends EObject {
	/**
	 * Returns the value of the '<em><b>Window Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window Predicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window Predicate</em>' attribute.
	 * @see #setWindowPredicate(String)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getArc_WindowPredicate()
	 * @model
	 * @generated
	 */
	String getWindowPredicate();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.Arc#getWindowPredicate <em>Window Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window Predicate</em>' attribute.
	 * @see #getWindowPredicate()
	 * @generated
	 */
	void setWindowPredicate(String value);

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
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getArc_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.Arc#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Arc From PE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arc From PE</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc From PE</em>' reference.
	 * @see #setArcFromPE(AbstractPE)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getArc_ArcFromPE()
	 * @model required="true"
	 * @generated
	 */
	AbstractPE getArcFromPE();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.Arc#getArcFromPE <em>Arc From PE</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arc From PE</em>' reference.
	 * @see #getArcFromPE()
	 * @generated
	 */
	void setArcFromPE(AbstractPE value);

	/**
	 * Returns the value of the '<em><b>Arc To PE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arc To PE</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc To PE</em>' reference.
	 * @see #setArcToPE(ProcessingElement)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getArc_ArcToPE()
	 * @model required="true"
	 * @generated
	 */
	AbstractPE getArcToPE();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.Arc#getArcToPE <em>Arc To PE</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param toPE the new value of the '<em>Arc To PE</em>' reference.
	 * @see #getArcToPE()
	 * @generated
	 */
	void setArcToPE(AbstractPE toPE);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getArc_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.Arc#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Valid Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Time</em>' attribute.
	 * @see #setValidTime(long)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getArc_ValidTime()
	 * @model
	 * @generated
	 */
	long getValidTime();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.Arc#getValidTime <em>Valid Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Time</em>' attribute.
	 * @see #getValidTime()
	 * @generated
	 */
	void setValidTime(long value);

	/**
	 * Returns the value of the '<em><b>Transaction Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Time</em>' attribute.
	 * @see #setTransactionTime(long)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getArc_TransactionTime()
	 * @model
	 * @generated
	 */
	long getTransactionTime();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.Arc#getTransactionTime <em>Transaction Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Time</em>' attribute.
	 * @see #getTransactionTime()
	 * @generated
	 */
	void setTransactionTime(long value);

} // Arc
