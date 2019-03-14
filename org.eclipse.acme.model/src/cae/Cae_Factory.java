/**
 */
package cae;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cae.Cae_Package
 * @generated
 */
public interface Cae_Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Cae_Factory eINSTANCE = cae.impl.Cae_FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CAE Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAE Module</em>'.
	 * @generated
	 */
	CAEModule createCAEModule();

	/**
	 * Returns a new object of class '<em>CAE Module Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAE Module Interface</em>'.
	 * @generated
	 */
	CAEModuleInterface createCAEModuleInterface();

	/**
	 * Returns a new object of class '<em>CAE Module Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAE Module Binding</em>'.
	 * @generated
	 */
	CAEModuleBinding createCAEModuleBinding();

	/**
	 * Returns a new object of class '<em>CAE Claim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAE Claim</em>'.
	 * @generated
	 */
	CAEClaim createCAEClaim();

	/**
	 * Returns a new object of class '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument</em>'.
	 * @generated
	 */
	Argument createArgument();

	/**
	 * Returns a new object of class '<em>Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evidence</em>'.
	 * @generated
	 */
	Evidence createEvidence();

	/**
	 * Returns a new object of class '<em>Is Sub Claim Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Sub Claim Of</em>'.
	 * @generated
	 */
	IsSubClaimOf createIsSubClaimOf();

	/**
	 * Returns a new object of class '<em>Supports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supports</em>'.
	 * @generated
	 */
	Supports createSupports();

	/**
	 * Returns a new object of class '<em>Is Evidence For</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Evidence For</em>'.
	 * @generated
	 */
	IsEvidenceFor createIsEvidenceFor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Cae_Package getCae_Package();

} //Cae_Factory
