/**
 */
package gsn;

import argumentation.ArgumentAsset;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gsn.ChoiceNode#getChoice <em>Choice</em>}</li>
 * </ul>
 *
 * @see gsn.Gsn_Package#getChoiceNode()
 * @model
 * @generated
 */
public interface ChoiceNode extends ArgumentAsset {
	/**
	 * Returns the value of the '<em><b>Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice</em>' attribute.
	 * @see #setChoice(String)
	 * @see gsn.Gsn_Package#getChoiceNode_Choice()
	 * @model
	 * @generated
	 */
	String getChoice();

	/**
	 * Sets the value of the '{@link gsn.ChoiceNode#getChoice <em>Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choice</em>' attribute.
	 * @see #getChoice()
	 * @generated
	 */
	void setChoice(String value);

} // ChoiceNode
