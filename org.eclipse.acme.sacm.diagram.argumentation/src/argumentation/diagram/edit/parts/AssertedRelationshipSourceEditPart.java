package argumentation.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

import acme.argumentation.diagram.figure.AssertedRelationshipSourceShape;
import acme.common.diagram.dialog.DialogHelper;
import argumentation.diagram.edit.policies.AssertedRelationshipSourceItemSemanticEditPolicy;
import base.ModelElement;

/**
 * @generated
 */
public class AssertedRelationshipSourceEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4202;

	/**
	* @generated
	*/
	public AssertedRelationshipSourceEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new AssertedRelationshipSourceItemSemanticEditPolicy());
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
		return new AssertedRelationshipSourceFigure();
	}

	/**
	* @generated
	*/
	public AssertedRelationshipSourceFigure getPrimaryShape() {
		return (AssertedRelationshipSourceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class AssertedRelationshipSourceFigure extends AssertedRelationshipSourceShape {


	}
	
	@Override
	public void performRequest(Request request) {
		if (request.getType() == RequestConstants.REQ_OPEN) {
			ShapeNodeEditPart editPart = (ShapeNodeEditPart) getSource();
			DialogHelper.handleElement(getEditingDomain(), (ModelElement) editPart.resolveSemanticElement());
		}
		super.performRequest(request);
	}
	
	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
	}


}
