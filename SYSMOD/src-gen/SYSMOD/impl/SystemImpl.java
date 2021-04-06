/**
 */
package SYSMOD.impl;

import SYSMOD.SYSMODPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SYSMOD.impl.SystemImpl#getSystemIdea <em>System Idea</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends BlockImpl implements SYSMOD.System {
	/**
	 * The default value of the '{@link #getSystemIdea() <em>System Idea</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemIdea()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_IDEA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemIdea() <em>System Idea</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemIdea()
	 * @generated
	 * @ordered
	 */
	protected String systemIdea = SYSTEM_IDEA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SYSMODPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemIdea() {
		return systemIdea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemIdea(String newSystemIdea) {
		String oldSystemIdea = systemIdea;
		systemIdea = newSystemIdea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SYSMODPackage.SYSTEM__SYSTEM_IDEA, oldSystemIdea, systemIdea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SYSMODPackage.SYSTEM__SYSTEM_IDEA:
				return getSystemIdea();
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
			case SYSMODPackage.SYSTEM__SYSTEM_IDEA:
				setSystemIdea((String)newValue);
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
			case SYSMODPackage.SYSTEM__SYSTEM_IDEA:
				setSystemIdea(SYSTEM_IDEA_EDEFAULT);
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
			case SYSMODPackage.SYSTEM__SYSTEM_IDEA:
				return SYSTEM_IDEA_EDEFAULT == null ? systemIdea != null : !SYSTEM_IDEA_EDEFAULT.equals(systemIdea);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (SystemIdea: ");
		result.append(systemIdea);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
