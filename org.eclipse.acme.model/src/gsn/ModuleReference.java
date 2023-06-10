/**
 */
package gsn;

import argumentation.ArtifactReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gsn.ModuleReference#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see gsn.Gsn_Package#getModuleReference()
 * @model
 * @generated
 */
public interface ModuleReference extends ArtifactReference {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(gsn.Module)
	 * @see gsn.Gsn_Package#getModuleReference_Module()
	 * @model
	 * @generated
	 */
	gsn.Module getModule();

	/**
	 * Sets the value of the '{@link gsn.ModuleReference#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(gsn.Module value);

} // ModuleReference
