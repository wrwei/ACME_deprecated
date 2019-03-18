package argumentation.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import acme.argumentation.diagram.figure.ArgumentReasoningLineShape;
import argumentation.diagram.edit.policies.AssertedRelationshipReasoningItemSemanticEditPolicy;

/**
 * @generated
 */
public class AssertedRelationshipReasoningEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4204;

	/**
	* @generated
	*/
	public AssertedRelationshipReasoningEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new AssertedRelationshipReasoningItemSemanticEditPolicy());
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new AssertedRelationshipReasoningFigure();
	}

	/**
	* @generated
	*/
	public AssertedRelationshipReasoningFigure getPrimaryShape() {
		return (AssertedRelationshipReasoningFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class AssertedRelationshipReasoningFigure extends ArgumentReasoningLineShape {

		/**
		 * @generated
		 */
		public AssertedRelationshipReasoningFigure() {
			//setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unused")
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

	}

}
