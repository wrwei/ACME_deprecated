package gsn.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import acme.common.diagram.dialog.DialogHelper;
import acme.diagram.util.DimensionUtil;
import acme.gsn.diagram.figure.InContextOfFixedPolygonDecoration;
import acme.gsn.diagram.figure.InContextOfStraightConnection;
import base.ModelElement;
import gsn.Gsn_Package;
import gsn.InContextOf;
import gsn.diagram.edit.policies.InContextOfItemSemanticEditPolicy;

/**
 * @generated
 */
public class InContextOfEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4402;

	/**
	* @generated
	*/
	public InContextOfEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new InContextOfItemSemanticEditPolicy());
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel32EditPart) {
			((WrappingLabel32EditPart) childEditPart).setLabel(getPrimaryShape().getFigureInContextOfLabel());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, index);
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel32EditPart) {
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated NOT
	*/

	protected Connection createConnectionFigure() {
		return new InContextOfFigure();
	}

	/**
	* @generated NOT
	*/
	public InContextOfFigure getPrimaryShape() {
		//return (InContextOfFigure) getFigure();
		InContextOfFigure connection = (InContextOfFigure) getFigure();
		connection.setInContextOf((InContextOf) resolveSemanticElement());
		InContextOfFixedPolygonDecoration decoration = new InContextOfFixedPolygonDecoration();
		decoration.setTemplate(PolygonDecoration.TRIANGLE_TIP);
		decoration.setForegroundColor(ColorConstants.black);
		decoration.setBackgroundColor(ColorConstants.white);
		decoration.setForegroundColor(ColorConstants.black);
		decoration.setScale(15, 6);
		decoration.setReferencePoint(connection.getEnd());
		connection.setTargetDecoration(decoration);
		return connection;
	}

	/**
	 * @generated NOT
	 */
	public class InContextOfFigure extends InContextOfStraightConnection {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureInContextOfLabel;

		/**
		 * @generated
		 */
		public InContextOfFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureInContextOfLabel = new WrappingLabel();

			fFigureInContextOfLabel.setText("");

			this.add(fFigureInContextOfLabel);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInContextOfLabel() {
			return fFigureInContextOfLabel;
		}

	}

	@Override
	protected void installRouter() {
		super.installRouter();
	}

	//	@Override
	//	protected void refreshSmoothness() {
	//		PolylineConnectionEx poly = (PolylineConnectionEx) getConnectionFigure();
	//		poly.setSmoothness(PolylineConnectionEx.SMOOTH_LESS);
	//	}

	@Override
	public void performRequest(Request request) {
		if (request.getType() == RequestConstants.REQ_OPEN) {
			DialogHelper.handleElement(getEditingDomain(), (ModelElement) resolveSemanticElement());
		}
		super.performRequest(request);
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		boolean refresh = false;
		if (notification.getFeature().equals(Gsn_Package.eINSTANCE.getInContextOf_IsMany())) {
			refresh = true;
		} else if (notification.getFeature().equals(Gsn_Package.eINSTANCE.getInContextOf_IsOptional())) {
			refresh = true;
		}
		if (refresh) {
			Rectangle rectangle = DimensionUtil.getConstraints((ModelElement) resolveSemanticElement(),
					getFigure().getBounds());
			getFigure().getParent().setConstraint(getFigure(), rectangle);
			getFigure().invalidate();
			getFigure().repaint();
		}

		super.handleNotificationEvent(notification);
	}

}
