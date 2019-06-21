/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
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
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import acme.common.diagram.dialog.DialogHelper;
import acme.diagram.util.DimensionUtil;
import acme.gsn.diagram.figure.SupportedByFixedPolygonDecoration;
import acme.gsn.diagram.figure.SupportedByStraightConnection;
import base.ModelElement;
import gsn.ChoiceNode;
import gsn.Gsn_Package;
import gsn.SupportedBy;
import gsn.diagram.edit.policies.SupportedByItemSemanticEditPolicy;

/**
 * @generated
 */
public class SupportedByEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4401;

	/**
	* @generated
	*/
	public SupportedByEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new SupportedByItemSemanticEditPolicy());
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel31EditPart) {
			((WrappingLabel31EditPart) childEditPart).setLabel(getPrimaryShape().getFigureSupportedByLabel());
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
		if (childEditPart instanceof WrappingLabel31EditPart) {
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
		return new SupportedByFigure();
	}

	/**
	* @generated NOT
	*/
	public SupportedByFigure getPrimaryShape() {
		//return (SupportedByFigure) getFigure();
		SupportedByFigure connection = (SupportedByFigure) getFigure();
		SupportedBy supportedBy = (SupportedBy) resolveSemanticElement();
		connection.setSupportedBy(supportedBy);
		//connection.setSupportedBy((SupportedBy) resolveSemanticElement());	
		if (supportedBy.getTarget().get(0) instanceof ChoiceNode) {
			return connection;
		}
		PolygonDecoration decoration = new SupportedByFixedPolygonDecoration();
		decoration.setForegroundColor(ColorConstants.black);
		decoration.setTemplate(PolygonDecoration.TRIANGLE_TIP);
		decoration.setScale(15, 6);
		decoration.setReferencePoint(connection.getEnd());
		connection.setTargetDecoration(decoration);
		return connection;
	}

	/**
	 * @generated NOT
	 */
	public class SupportedByFigure extends SupportedByStraightConnection {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSupportedByLabel;

		/**
		 * @generated
		 */
		public SupportedByFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureSupportedByLabel = new WrappingLabel();

			fFigureSupportedByLabel.setText("");

			this.add(fFigureSupportedByLabel);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSupportedByLabel() {
			return fFigureSupportedByLabel;
		}

	}

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
		if (notification.getFeature().equals(Gsn_Package.eINSTANCE.getSupportedBy_IsMany())) {
			refresh = true;
		} else if (notification.getFeature().equals(Gsn_Package.eINSTANCE.getSupportedBy_IsOptional())) {
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
