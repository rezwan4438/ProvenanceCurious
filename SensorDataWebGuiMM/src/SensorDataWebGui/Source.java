/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SensorDataWebGui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SensorDataWebGui.Source#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link SensorDataWebGui.Source#getLocation <em>Location</em>}</li>
 *   <li>{@link SensorDataWebGui.Source#getSampleTime <em>Sample Time</em>}</li>
 *   <li>{@link SensorDataWebGui.Source#getSampleTimeDistribution <em>Sample Time Distribution</em>}</li>
 *   <li>{@link SensorDataWebGui.Source#getHasGraphReference <em>Has Graph Reference</em>}</li>
 *   <li>{@link SensorDataWebGui.Source#getSourceType <em>Source Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see SensorDataWebGui.SensorDataWebGuiPackage#getSource()
 * @model
 * @generated
 */
public interface Source extends AbstractPE {
	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(int)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getSource_Timeout()
	 * @model
	 * @generated
	 */
	int getTimeout();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.Source#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getSource_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.Source#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Sample Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Time</em>' attribute.
	 * @see #setSampleTime(int)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getSource_SampleTime()
	 * @model
	 * @generated
	 */
	int getSampleTime();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.Source#getSampleTime <em>Sample Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Time</em>' attribute.
	 * @see #getSampleTime()
	 * @generated
	 */
	void setSampleTime(int value);

	/**
	 * Returns the value of the '<em><b>Sample Time Distribution</b></em>' attribute.
	 * The literals are from the enumeration {@link SensorDataWebGui.DistributionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Time Distribution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Time Distribution</em>' attribute.
	 * @see SensorDataWebGui.DistributionType
	 * @see #setSampleTimeDistribution(DistributionType)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getSource_SampleTimeDistribution()
	 * @model
	 * @generated
	 */
	DistributionType getSampleTimeDistribution();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.Source#getSampleTimeDistribution <em>Sample Time Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Time Distribution</em>' attribute.
	 * @see SensorDataWebGui.DistributionType
	 * @see #getSampleTimeDistribution()
	 * @generated
	 */
	void setSampleTimeDistribution(DistributionType value);

	/**
	 * Returns the value of the '<em><b>Has Graph Reference</b></em>' containment reference list.
	 * The list contents are of type {@link SensorDataWebGui.GraphReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Graph Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Graph Reference</em>' containment reference list.
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getSource_HasGraphReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphReference> getHasGraphReference();

	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link SensorDataWebGui.SourceTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' attribute.
	 * @see SensorDataWebGui.SourceTypes
	 * @see #setSourceType(SourceTypes)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getSource_SourceType()
	 * @model default="0"
	 * @generated
	 */
	SourceTypes getSourceType();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.Source#getSourceType <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' attribute.
	 * @see SensorDataWebGui.SourceTypes
	 * @see #getSourceType()
	 * @generated
	 */
	void setSourceType(SourceTypes value);

} // Source
