/**
 */
package gsn;

import argumentation.ArtifactReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Module Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gsn.ContractModuleReference#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see gsn.Gsn_Package#getContractModuleReference()
 * @model
 * @generated
 */
public interface ContractModuleReference extends ArtifactReference {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(ContractModule)
	 * @see gsn.Gsn_Package#getContractModuleReference_Module()
	 * @model
	 * @generated
	 */
	ContractModule getModule();

	/**
	 * Sets the value of the '{@link gsn.ContractModuleReference#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(ContractModule value);

} // ContractModuleReference
