/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SensorDataWebGui.impl;

import SensorDataWebGui.DistributionType;
import SensorDataWebGui.GraphReference;
import SensorDataWebGui.SensorDataWebGuiPackage;
import SensorDataWebGui.Source;

import SensorDataWebGui.SourceTypes;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SensorDataWebGui.impl.SourceImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.SourceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.SourceImpl#getSampleTime <em>Sample Time</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.SourceImpl#getSampleTimeDistribution <em>Sample Time Distribution</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.SourceImpl#getHasGraphReference <em>Has Graph Reference</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.SourceImpl#getSourceType <em>Source Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceImpl extends AbstractPEImpl implements Source {
	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMEOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected int timeout = TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSampleTime() <em>Sample Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleTime()
	 * @generated
	 * @ordered
	 */
	protected static final int SAMPLE_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSampleTime() <em>Sample Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleTime()
	 * @generated
	 * @ordered
	 */
	protected int sampleTime = SAMPLE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSampleTimeDistribution() <em>Sample Time Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleTimeDistribution()
	 * @generated
	 * @ordered
	 */
	protected static final DistributionType SAMPLE_TIME_DISTRIBUTION_EDEFAULT = DistributionType.POISSON;

	/**
	 * The cached value of the '{@link #getSampleTimeDistribution() <em>Sample Time Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleTimeDistribution()
	 * @generated
	 * @ordered
	 */
	protected DistributionType sampleTimeDistribution = SAMPLE_TIME_DISTRIBUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasGraphReference() <em>Has Graph Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasGraphReference()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphReference> hasGraphReference;

	/**
	 * The default value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected static final SourceTypes SOURCE_TYPE_EDEFAULT = SourceTypes.MEMORY;

	/**
	 * The cached value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected SourceTypes sourceType = SOURCE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensorDataWebGuiPackage.Literals.SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(int newTimeout) {
		int oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.SOURCE__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.SOURCE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSampleTime() {
		return sampleTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleTime(int newSampleTime) {
		int oldSampleTime = sampleTime;
		sampleTime = newSampleTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.SOURCE__SAMPLE_TIME, oldSampleTime, sampleTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionType getSampleTimeDistribution() {
		return sampleTimeDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleTimeDistribution(DistributionType newSampleTimeDistribution) {
		DistributionType oldSampleTimeDistribution = sampleTimeDistribution;
		sampleTimeDistribution = newSampleTimeDistribution == null ? SAMPLE_TIME_DISTRIBUTION_EDEFAULT : newSampleTimeDistribution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.SOURCE__SAMPLE_TIME_DISTRIBUTION, oldSampleTimeDistribution, sampleTimeDistribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphReference> getHasGraphReference() {
		if (hasGraphReference == null) {
			hasGraphReference = new EObjectContainmentEList<GraphReference>(GraphReference.class, this, SensorDataWebGuiPackage.SOURCE__HAS_GRAPH_REFERENCE);
		}
		return hasGraphReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceTypes getSourceType() {
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceType(SourceTypes newSourceType) {
		SourceTypes oldSourceType = sourceType;
		sourceType = newSourceType == null ? SOURCE_TYPE_EDEFAULT : newSourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.SOURCE__SOURCE_TYPE, oldSourceType, sourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SensorDataWebGuiPackage.SOURCE__HAS_GRAPH_REFERENCE:
				return ((InternalEList<?>)getHasGraphReference()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SensorDataWebGuiPackage.SOURCE__TIMEOUT:
				return getTimeout();
			case SensorDataWebGuiPackage.SOURCE__LOCATION:
				return getLocation();
			case SensorDataWebGuiPackage.SOURCE__SAMPLE_TIME:
				return getSampleTime();
			case SensorDataWebGuiPackage.SOURCE__SAMPLE_TIME_DISTRIBUTION:
				return getSampleTimeDistribution();
			case SensorDataWebGuiPackage.SOURCE__HAS_GRAPH_REFERENCE:
				return getHasGraphReference();
			case SensorDataWebGuiPackage.SOURCE__SOURCE_TYPE:
				return getSourceType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SensorDataWebGuiPackage.SOURCE__TIMEOUT:
				setTimeout((Integer)newValue);
				return;
			case SensorDataWebGuiPackage.SOURCE__LOCATION:
				setLocation((String)newValue);
				return;
			case SensorDataWebGuiPackage.SOURCE__SAMPLE_TIME:
				setSampleTime((Integer)newValue);
				return;
			case SensorDataWebGuiPackage.SOURCE__SAMPLE_TIME_DISTRIBUTION:
				setSampleTimeDistribution((DistributionType)newValue);
				return;
			case SensorDataWebGuiPackage.SOURCE__HAS_GRAPH_REFERENCE:
				getHasGraphReference().clear();
				getHasGraphReference().addAll((Collection<? extends GraphReference>)newValue);
				return;
			case SensorDataWebGuiPackage.SOURCE__SOURCE_TYPE:
				setSourceType((SourceTypes)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SensorDataWebGuiPackage.SOURCE__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.SOURCE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.SOURCE__SAMPLE_TIME:
				setSampleTime(SAMPLE_TIME_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.SOURCE__SAMPLE_TIME_DISTRIBUTION:
				setSampleTimeDistribution(SAMPLE_TIME_DISTRIBUTION_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.SOURCE__HAS_GRAPH_REFERENCE:
				getHasGraphReference().clear();
				return;
			case SensorDataWebGuiPackage.SOURCE__SOURCE_TYPE:
				setSourceType(SOURCE_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SensorDataWebGuiPackage.SOURCE__TIMEOUT:
				return timeout != TIMEOUT_EDEFAULT;
			case SensorDataWebGuiPackage.SOURCE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case SensorDataWebGuiPackage.SOURCE__SAMPLE_TIME:
				return sampleTime != SAMPLE_TIME_EDEFAULT;
			case SensorDataWebGuiPackage.SOURCE__SAMPLE_TIME_DISTRIBUTION:
				return sampleTimeDistribution != SAMPLE_TIME_DISTRIBUTION_EDEFAULT;
			case SensorDataWebGuiPackage.SOURCE__HAS_GRAPH_REFERENCE:
				return hasGraphReference != null && !hasGraphReference.isEmpty();
			case SensorDataWebGuiPackage.SOURCE__SOURCE_TYPE:
				return sourceType != SOURCE_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (timeout: ");
		result.append(timeout);
		result.append(", location: ");
		result.append(location);
		result.append(", sampleTime: ");
		result.append(sampleTime);
		result.append(", sampleTimeDistribution: ");
		result.append(sampleTimeDistribution);
		result.append(", sourceType: ");
		result.append(sourceType);
		result.append(')');
		return result.toString();
	}

} //SourceImpl
