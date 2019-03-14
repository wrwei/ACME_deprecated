/**
 */
package gsn.impl;

import argumentation.impl.ArgumentAssetImpl;

import gsn.Context;
import gsn.Gsn_Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gsn.impl.ContextImpl#isIsPublic <em>Is Public</em>}</li>
 *   <li>{@link gsn.impl.ContextImpl#isRefersToExternalMaterial <em>Refers To External Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextImpl extends ArgumentAssetImpl implements Context {
	/**
	 * The default value of the '{@link #isIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPublic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PUBLIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPublic()
	 * @generated
	 * @ordered
	 */
	protected boolean isPublic = IS_PUBLIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isRefersToExternalMaterial() <em>Refers To External Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRefersToExternalMaterial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REFERS_TO_EXTERNAL_MATERIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRefersToExternalMaterial() <em>Refers To External Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRefersToExternalMaterial()
	 * @generated
	 * @ordered
	 */
	protected boolean refersToExternalMaterial = REFERS_TO_EXTERNAL_MATERIAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsn_Package.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPublic() {
		return isPublic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPublic(boolean newIsPublic) {
		boolean oldIsPublic = isPublic;
		isPublic = newIsPublic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsn_Package.CONTEXT__IS_PUBLIC, oldIsPublic, isPublic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRefersToExternalMaterial() {
		return refersToExternalMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersToExternalMaterial(boolean newRefersToExternalMaterial) {
		boolean oldRefersToExternalMaterial = refersToExternalMaterial;
		refersToExternalMaterial = newRefersToExternalMaterial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsn_Package.CONTEXT__REFERS_TO_EXTERNAL_MATERIAL, oldRefersToExternalMaterial, refersToExternalMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Gsn_Package.CONTEXT__IS_PUBLIC:
				return isIsPublic();
			case Gsn_Package.CONTEXT__REFERS_TO_EXTERNAL_MATERIAL:
				return isRefersToExternalMaterial();
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
			case Gsn_Package.CONTEXT__IS_PUBLIC:
				setIsPublic((Boolean)newValue);
				return;
			case Gsn_Package.CONTEXT__REFERS_TO_EXTERNAL_MATERIAL:
				setRefersToExternalMaterial((Boolean)newValue);
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
			case Gsn_Package.CONTEXT__IS_PUBLIC:
				setIsPublic(IS_PUBLIC_EDEFAULT);
				return;
			case Gsn_Package.CONTEXT__REFERS_TO_EXTERNAL_MATERIAL:
				setRefersToExternalMaterial(REFERS_TO_EXTERNAL_MATERIAL_EDEFAULT);
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
			case Gsn_Package.CONTEXT__IS_PUBLIC:
				return isPublic != IS_PUBLIC_EDEFAULT;
			case Gsn_Package.CONTEXT__REFERS_TO_EXTERNAL_MATERIAL:
				return refersToExternalMaterial != REFERS_TO_EXTERNAL_MATERIAL_EDEFAULT;
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
		result.append(" (isPublic: ");
		result.append(isPublic);
		result.append(", refersToExternalMaterial: ");
		result.append(refersToExternalMaterial);
		result.append(')');
		return result.toString();
	}

} //ContextImpl
