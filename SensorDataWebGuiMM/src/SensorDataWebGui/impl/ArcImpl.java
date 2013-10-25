/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SensorDataWebGui.impl;

import SensorDataWebGui.AbstractPE;
import SensorDataWebGui.Arc;
import SensorDataWebGui.ProcessingElement;
import SensorDataWebGui.SensorDataWebGuiPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SensorDataWebGui.impl.ArcImpl#getWindowPredicate <em>Window Predicate</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.ArcImpl#getName <em>Name</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.ArcImpl#getArcFromPE <em>Arc From PE</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.ArcImpl#getArcToPE <em>Arc To PE</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.ArcImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.ArcImpl#getValidTime <em>Valid Time</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.ArcImpl#getTransactionTime <em>Transaction Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ArcImpl extends EObjectImpl implements Arc {
	/**
	 * The default value of the '{@link #getWindowPredicate() <em>Window Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindowPredicate()
	 * @generated
	 * @ordered
	 */
	protected static final String WINDOW_PREDICATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWindowPredicate() <em>Window Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindowPredicate()
	 * @generated
	 * @ordered
	 */
	protected String windowPredicate = WINDOW_PREDICATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArcFromPE() <em>Arc From PE</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcFromPE()
	 * @generated
	 * @ordered
	 */
	protected AbstractPE arcFromPE;

	/**
	 * The cached value of the '{@link #getArcToPE() <em>Arc To PE</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcToPE()
	 * @generated
	 * @ordered
	 */
	protected AbstractPE arcToPE;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidTime() <em>Valid Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTime()
	 * @generated
	 * @ordered
	 */
	protected static final long VALID_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getValidTime() <em>Valid Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTime()
	 * @generated
	 * @ordered
	 */
	protected long validTime = VALID_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionTime() <em>Transaction Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionTime()
	 * @generated
	 * @ordered
	 */
	protected static final long TRANSACTION_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTransactionTime() <em>Transaction Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionTime()
	 * @generated
	 * @ordered
	 */
	protected long transactionTime = TRANSACTION_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensorDataWebGuiPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWindowPredicate() {
		return windowPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindowPredicate(String newWindowPredicate) {
		String oldWindowPredicate = windowPredicate;
		windowPredicate = newWindowPredicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.ARC__WINDOW_PREDICATE, oldWindowPredicate, windowPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.ARC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPE getArcFromPE() {
		if (arcFromPE != null && arcFromPE.eIsProxy()) {
			InternalEObject oldArcFromPE = (InternalEObject)arcFromPE;
			arcFromPE = (AbstractPE)eResolveProxy(oldArcFromPE);
			if (arcFromPE != oldArcFromPE) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SensorDataWebGuiPackage.ARC__ARC_FROM_PE, oldArcFromPE, arcFromPE));
			}
		}
		return arcFromPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPE basicGetArcFromPE() {
		return arcFromPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArcFromPE(AbstractPE newArcFromPE) {
		AbstractPE oldArcFromPE = arcFromPE;
		arcFromPE = newArcFromPE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.ARC__ARC_FROM_PE, oldArcFromPE, arcFromPE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPE getArcToPE() {
		if (arcToPE != null && arcToPE.eIsProxy()) {
			InternalEObject oldArcToPE = (InternalEObject)arcToPE;
			arcToPE = (ProcessingElement)eResolveProxy(oldArcToPE);
			if (arcToPE != oldArcToPE) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SensorDataWebGuiPackage.ARC__ARC_TO_PE, oldArcToPE, arcToPE));
			}
		}
		return arcToPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPE basicGetArcToPE() {
		return arcToPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArcToPE(AbstractPE newArcToPE) {
		AbstractPE oldArcToPE = arcToPE;
		arcToPE = newArcToPE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.ARC__ARC_TO_PE, oldArcToPE, arcToPE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.ARC__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getValidTime() {
		return validTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidTime(long newValidTime) {
		long oldValidTime = validTime;
		validTime = newValidTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.ARC__VALID_TIME, oldValidTime, validTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTransactionTime() {
		return transactionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionTime(long newTransactionTime) {
		long oldTransactionTime = transactionTime;
		transactionTime = newTransactionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.ARC__TRANSACTION_TIME, oldTransactionTime, transactionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SensorDataWebGuiPackage.ARC__WINDOW_PREDICATE:
				return getWindowPredicate();
			case SensorDataWebGuiPackage.ARC__NAME:
				return getName();
			case SensorDataWebGuiPackage.ARC__ARC_FROM_PE:
				if (resolve) return getArcFromPE();
				return basicGetArcFromPE();
			case SensorDataWebGuiPackage.ARC__ARC_TO_PE:
				if (resolve) return getArcToPE();
				return basicGetArcToPE();
			case SensorDataWebGuiPackage.ARC__DESCRIPTION:
				return getDescription();
			case SensorDataWebGuiPackage.ARC__VALID_TIME:
				return getValidTime();
			case SensorDataWebGuiPackage.ARC__TRANSACTION_TIME:
				return getTransactionTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SensorDataWebGuiPackage.ARC__WINDOW_PREDICATE:
				setWindowPredicate((String)newValue);
				return;
			case SensorDataWebGuiPackage.ARC__NAME:
				setName((String)newValue);
				return;
			case SensorDataWebGuiPackage.ARC__ARC_FROM_PE:
				setArcFromPE((AbstractPE)newValue);
				return;
			case SensorDataWebGuiPackage.ARC__ARC_TO_PE:
				setArcToPE((ProcessingElement)newValue);
				return;
			case SensorDataWebGuiPackage.ARC__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SensorDataWebGuiPackage.ARC__VALID_TIME:
				setValidTime((Long)newValue);
				return;
			case SensorDataWebGuiPackage.ARC__TRANSACTION_TIME:
				setTransactionTime((Long)newValue);
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
			case SensorDataWebGuiPackage.ARC__WINDOW_PREDICATE:
				setWindowPredicate(WINDOW_PREDICATE_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.ARC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.ARC__ARC_FROM_PE:
				setArcFromPE((AbstractPE)null);
				return;
			case SensorDataWebGuiPackage.ARC__ARC_TO_PE:
				setArcToPE((ProcessingElement)null);
				return;
			case SensorDataWebGuiPackage.ARC__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.ARC__VALID_TIME:
				setValidTime(VALID_TIME_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.ARC__TRANSACTION_TIME:
				setTransactionTime(TRANSACTION_TIME_EDEFAULT);
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
			case SensorDataWebGuiPackage.ARC__WINDOW_PREDICATE:
				return WINDOW_PREDICATE_EDEFAULT == null ? windowPredicate != null : !WINDOW_PREDICATE_EDEFAULT.equals(windowPredicate);
			case SensorDataWebGuiPackage.ARC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SensorDataWebGuiPackage.ARC__ARC_FROM_PE:
				return arcFromPE != null;
			case SensorDataWebGuiPackage.ARC__ARC_TO_PE:
				return arcToPE != null;
			case SensorDataWebGuiPackage.ARC__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SensorDataWebGuiPackage.ARC__VALID_TIME:
				return validTime != VALID_TIME_EDEFAULT;
			case SensorDataWebGuiPackage.ARC__TRANSACTION_TIME:
				return transactionTime != TRANSACTION_TIME_EDEFAULT;
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
		result.append(" (windowPredicate: ");
		result.append(windowPredicate);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", validTime: ");
		result.append(validTime);
		result.append(", transactionTime: ");
		result.append(transactionTime);
		result.append(')');
		return result.toString();
	}

} //ArcImpl
