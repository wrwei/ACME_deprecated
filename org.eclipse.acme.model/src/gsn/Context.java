/**
 */
package gsn;

import argumentation.ArgumentAsset;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gsn.Context#isIsPublic <em>Is Public</em>}</li>
 *   <li>{@link gsn.Context#isRefersToExternalMaterial <em>Refers To External Material</em>}</li>
 * </ul>
 *
 * @see gsn.Gsn_Package#getContext()
 * @model
 * @generated
 */
public interface Context extends ArgumentAsset {
	/**
	 * Returns the value of the '<em><b>Is Public</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Public</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Public</em>' attribute.
	 * @see #setIsPublic(boolean)
	 * @see gsn.Gsn_Package#getContext_IsPublic()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsPublic();

	/**
	 * Sets the value of the '{@link gsn.Context#isIsPublic <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Public</em>' attribute.
	 * @see #isIsPublic()
	 * @generated
	 */
	void setIsPublic(boolean value);

	/**
	 * Returns the value of the '<em><b>Refers To External Material</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To External Material</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To External Material</em>' attribute.
	 * @see #setRefersToExternalMaterial(boolean)
	 * @see gsn.Gsn_Package#getContext_RefersToExternalMaterial()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRefersToExternalMaterial();

	/**
	 * Sets the value of the '{@link gsn.Context#isRefersToExternalMaterial <em>Refers To External Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To External Material</em>' attribute.
	 * @see #isRefersToExternalMaterial()
	 * @generated
	 */
	void setRefersToExternalMaterial(boolean value);

} // Context
