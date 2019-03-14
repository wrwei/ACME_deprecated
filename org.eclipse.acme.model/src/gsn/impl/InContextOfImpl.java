/**
 */
package gsn.impl;

import argumentation.impl.AssertedContextImpl;

import gsn.Gsn_Package;
import gsn.InContextOf;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Context Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gsn.impl.InContextOfImpl#isIsMany <em>Is Many</em>}</li>
 *   <li>{@link gsn.impl.InContextOfImpl#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link gsn.impl.InContextOfImpl#isIsChoice <em>Is Choice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InContextOfImpl extends AssertedContextImpl implements InContextOf {
	/**
	 * The default value of the '{@link #isIsMany() <em>Is Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMany()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MANY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMany() <em>Is Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMany()
	 * @generated
	 * @ordered
	 */
	protected boolean isMany = IS_MANY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean isOptional = IS_OPTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsChoice() <em>Is Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsChoice()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CHOICE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsChoice() <em>Is Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsChoice()
	 * @generated
	 * @ordered
	 */
	protected boolean isChoice = IS_CHOICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InContextOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsn_Package.Literals.IN_CONTEXT_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMany() {
		return isMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMany(boolean newIsMany) {
		boolean oldIsMany = isMany;
		isMany = newIsMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsn_Package.IN_CONTEXT_OF__IS_MANY, oldIsMany, isMany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOptional() {
		return isOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOptional(boolean newIsOptional) {
		boolean oldIsOptional = isOptional;
		isOptional = newIsOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsn_Package.IN_CONTEXT_OF__IS_OPTIONAL, oldIsOptional, isOptional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsChoice() {
		return isChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsChoice(boolean newIsChoice) {
		boolean oldIsChoice = isChoice;
		isChoice = newIsChoice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsn_Package.IN_CONTEXT_OF__IS_CHOICE, oldIsChoice, isChoice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Gsn_Package.IN_CONTEXT_OF__IS_MANY:
				return isIsMany();
			case Gsn_Package.IN_CONTEXT_OF__IS_OPTIONAL:
				return isIsOptional();
			case Gsn_Package.IN_CONTEXT_OF__IS_CHOICE:
				return isIsChoice();
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
			case Gsn_Package.IN_CONTEXT_OF__IS_MANY:
				setIsMany((Boolean)newValue);
				return;
			case Gsn_Package.IN_CONTEXT_OF__IS_OPTIONAL:
				setIsOptional((Boolean)newValue);
				return;
			case Gsn_Package.IN_CONTEXT_OF__IS_CHOICE:
				setIsChoice((Boolean)newValue);
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
			case Gsn_Package.IN_CONTEXT_OF__IS_MANY:
				setIsMany(IS_MANY_EDEFAULT);
				return;
			case Gsn_Package.IN_CONTEXT_OF__IS_OPTIONAL:
				setIsOptional(IS_OPTIONAL_EDEFAULT);
				return;
			case Gsn_Package.IN_CONTEXT_OF__IS_CHOICE:
				setIsChoice(IS_CHOICE_EDEFAULT);
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
			case Gsn_Package.IN_CONTEXT_OF__IS_MANY:
				return isMany != IS_MANY_EDEFAULT;
			case Gsn_Package.IN_CONTEXT_OF__IS_OPTIONAL:
				return isOptional != IS_OPTIONAL_EDEFAULT;
			case Gsn_Package.IN_CONTEXT_OF__IS_CHOICE:
				return isChoice != IS_CHOICE_EDEFAULT;
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
		result.append(" (isMany: ");
		result.append(isMany);
		result.append(", isOptional: ");
		result.append(isOptional);
		result.append(", isChoice: ");
		result.append(isChoice);
		result.append(')');
		return result.toString();
	}

} //InContextOfImpl
