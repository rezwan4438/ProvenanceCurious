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
 * A representation of the model object '<em><b>Abstract PE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SensorDataWebGui.AbstractPE#getName <em>Name</em>}</li>
 *   <li>{@link SensorDataWebGui.AbstractPE#getView <em>View</em>}</li>
 *   <li>{@link SensorDataWebGui.AbstractPE#getNbrAllowedInputs <em>Nbr Allowed Inputs</em>}</li>
 *   <li>{@link SensorDataWebGui.AbstractPE#isPersistentView <em>Persistent View</em>}</li>
 *   <li>{@link SensorDataWebGui.AbstractPE#getDescription <em>Description</em>}</li>
 *   <li>{@link SensorDataWebGui.AbstractPE#getValidTime <em>Valid Time</em>}</li>
 *   <li>{@link SensorDataWebGui.AbstractPE#getTransactionTime <em>Transaction Time</em>}</li>
 *   <li>{@link SensorDataWebGui.AbstractPE#getViewUsername <em>View Username</em>}</li>
 *   <li>{@link SensorDataWebGui.AbstractPE#getViewPassword <em>View Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see SensorDataWebGui.SensorDataWebGuiPackage#getAbstractPE()
 * @model abstract="true"
 * @generated
 */
public interface AbstractPE extends EObject {
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
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getAbstractPE_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.AbstractPE#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' attribute.
	 * @see #setView(String)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getAbstractPE_View()
	 * @model
	 * @generated
	 */
	String getView();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.AbstractPE#getView <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' attribute.
	 * @see #getView()
	 * @generated
	 */
	void setView(String value);

	/**
	 * Returns the value of the '<em><b>Nbr Allowed Inputs</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nbr Allowed Inputs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nbr Allowed Inputs</em>' attribute.
	 * @see #setNbrAllowedInputs(int)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getAbstractPE_NbrAllowedInputs()
	 * @model default="0" derived="true"
	 * @generated
	 */
	int getNbrAllowedInputs();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.AbstractPE#getNbrAllowedInputs <em>Nbr Allowed Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbr Allowed Inputs</em>' attribute.
	 * @see #getNbrAllowedInputs()
	 * @generated
	 */
	void setNbrAllowedInputs(int value);

	/**
	 * Returns the value of the '<em><b>Persistent View</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistent View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent View</em>' attribute.
	 * @see #setPersistentView(boolean)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getAbstractPE_PersistentView()
	 * @model default="true"
	 * @generated
	 */
	boolean isPersistentView();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.AbstractPE#isPersistentView <em>Persistent View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent View</em>' attribute.
	 * @see #isPersistentView()
	 * @generated
	 */
	void setPersistentView(boolean value);

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
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getAbstractPE_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.AbstractPE#getDescription <em>Description</em>}' attribute.
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
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getAbstractPE_ValidTime()
	 * @model
	 * @generated
	 */
	long getValidTime();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.AbstractPE#getValidTime <em>Valid Time</em>}' attribute.
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
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getAbstractPE_TransactionTime()
	 * @model
	 * @generated
	 */
	long getTransactionTime();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.AbstractPE#getTransactionTime <em>Transaction Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Time</em>' attribute.
	 * @see #getTransactionTime()
	 * @generated
	 */
	void setTransactionTime(long value);

	/**
	 * Returns the value of the '<em><b>View Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Username</em>' attribute.
	 * @see #setViewUsername(String)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getAbstractPE_ViewUsername()
	 * @model
	 * @generated
	 */
	String getViewUsername();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.AbstractPE#getViewUsername <em>View Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Username</em>' attribute.
	 * @see #getViewUsername()
	 * @generated
	 */
	void setViewUsername(String value);

	/**
	 * Returns the value of the '<em><b>View Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Password</em>' attribute.
	 * @see #setViewPassword(String)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getAbstractPE_ViewPassword()
	 * @model
	 * @generated
	 */
	String getViewPassword();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.AbstractPE#getViewPassword <em>View Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Password</em>' attribute.
	 * @see #getViewPassword()
	 * @generated
	 */
	void setViewPassword(String value);

} // AbstractPE
