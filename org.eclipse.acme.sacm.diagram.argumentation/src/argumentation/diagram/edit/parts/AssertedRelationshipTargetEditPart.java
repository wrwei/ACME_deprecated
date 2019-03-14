package argumentation.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

import acme.argumentation.diagram.figure.AssertedRelationshipTargetShape;
import acme.argumentation.diagram.figure.ContextDecoration;
import acme.common.diagram.dialog.DialogHelper;
import argumentation.AssertedArtifactContext;
import argumentation.AssertedArtifactSupport;
import argumentation.AssertedContext;
import argumentation.AssertedEvidence;
import argumentation.AssertedInference;
import argumentation.AssertedRelationship;
import argumentation.diagram.edit.policies.AssertedRelationshipTargetItemSemanticEditPolicy;
import base.ModelElement;

/**
 * @generated
 */
public class AssertedRelationshipTargetEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4203;

	/**
	* @generated
	*/
	public AssertedRelationshipTargetEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new AssertedRelationshipTargetItemSemanticEditPolicy());
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
		return new AssertedRelationshipTargetFigure();
	}

	/**
	* @generated
	*/
	public AssertedRelationshipTargetFigure getPrimaryShape() {
		return (AssertedRelationshipTargetFigure) getFigure();
	}
	
	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		super.refresh();
		if (getSource() != null) {
			configureShape();
		}
	}
	
	private void configureShape() {

		ShapeNodeEditPart editPart = (ShapeNodeEditPart) getSource();
		AssertedRelationship ar = (AssertedRelationship) editPart.resolveSemanticElement();
		getPrimaryShape().setAssertedRelationship(ar);
		if (ar instanceof AssertedInference ||
				ar instanceof AssertedEvidence ||
				ar instanceof AssertedArtifactSupport) {
			PolygonDecoration df = new PolygonDecoration();
			if (ar.isIsCounter()) {
				df.setBackgroundColor(ColorConstants.white);

			}
			else {
				df.setBackgroundColor(ColorConstants.black);	
			}
			df.setTemplate(PolygonDecoration.TRIANGLE_TIP);
			df.setScale(15, 6);
			df.setReferencePoint(getPrimaryShape().getEnd());
			getPrimaryShape().setTargetDecoration(df);
		}
		else if (ar instanceof AssertedContext || 
				ar instanceof AssertedArtifactContext) {
			PolygonDecoration df = new PolygonDecoration();
			if (ar.isIsCounter()) {
				df.setBackgroundColor(ColorConstants.white);
			}
			else {
				df.setBackgroundColor(ColorConstants.black);	
			}
			df.setTemplate(ContextDecoration.RECTANGLE);
			df.setScale(9, 9);
			df.setReferencePoint(getPrimaryShape().getEnd());
			getPrimaryShape().setTargetDecoration(df);
		}
	
	}

	/**
	 * @generated
	 */
	public class AssertedRelationshipTargetFigure extends AssertedRelationshipTargetShape {

		/**
		 * @generated
		 */
		public AssertedRelationshipTargetFigure() {
			if (getSource() != null) {

				ShapeNodeEditPart editPart = (ShapeNodeEditPart) getSource();
				AssertedRelationship ar = (AssertedRelationship) editPart.resolveSemanticElement();
				setAssertedRelationship(ar);
				if (ar instanceof AssertedInference ||
						ar instanceof AssertedEvidence ||
						ar instanceof AssertedArtifactSupport) {
					PolygonDecoration df = new PolygonDecoration();
					if (ar.isIsCounter()) {
						df.setBackgroundColor(ColorConstants.white);

					}
					else {
						df.setBackgroundColor(ColorConstants.black);	
					}
					df.setTemplate(PolygonDecoration.TRIANGLE_TIP);
					df.setScale(15, 6);
//					df.setReferencePoint(getEnd());
					df.setReferencePoint(getPoints().getMidpoint());
					
					setTargetDecoration(df);
				}
				else if (ar instanceof AssertedContext || 
						ar instanceof AssertedArtifactContext) {
					PolygonDecoration df = new PolygonDecoration();
					if (ar.isIsCounter()) {
						df.setBackgroundColor(ColorConstants.white);
					}
					else {
						df.setBackgroundColor(ColorConstants.black);	
					}
					df.setTemplate(ContextDecoration.RECTANGLE);
					df.setScale(9, 9);
					df.setReferencePoint(getEnd());
					setTargetDecoration(df);
				}
			
			}
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

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
