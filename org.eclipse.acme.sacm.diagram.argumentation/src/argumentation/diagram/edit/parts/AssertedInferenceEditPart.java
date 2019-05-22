package argumentation.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.internal.runtime.Activator;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import acme.argumentation.diagram.figure.AssertedInferenceShape;
import acme.diagram.util.DimensionUtil;
import argumentation.Argumentation_Package;
import argumentation.AssertedInference;
import argumentation.Assertion;
import argumentation.Claim;
import argumentation.diagram.edit.policies.AssertedInferenceItemSemanticEditPolicy;

/**
 * @generated
 */
public class AssertedInferenceEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2208;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public AssertedInferenceEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new AssertedInferenceItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new AssertedInferenceFigure();
	}

	/**
	* @generated
	*/
	public RectangleFigure getPrimaryShape() {
		return (RectangleFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(5, 5);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	protected class AssertedInferenceFigure extends AssertedInferenceShape {
		
		public AssertedInferenceFigure() {
			this.setAssertedInference((AssertedInference) resolveSemanticElement());
			this.setLayoutManager(new XYLayout());
			this.setMinimumSize(DimensionUtil.ASSERTED_INFERENCE_DIMENSION);
			this.setSize(DimensionUtil.ASSERTED_INFERENCE_DIMENSION);
//			Rectangle rect = claim.getFigure().getBounds();
//			this.setBounds(new Rectangle(rect.x + rect.width/2, rect.y + rect.height+30, 3, 3));
		}
	}
	
	@Override
	protected void handleNotificationEvent(Notification notification) {
		boolean refresh = false;
		if (notification.getFeature().equals(Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration())) {
			refresh = true;
		} else if (notification.getFeature()
				.equals(Argumentation_Package.eINSTANCE.getAssertedRelationship_IsCounter())) {
			refresh = true;
		}
		if (refresh) {
			for (Object editPart: getSourceConnections()) {
				if (editPart instanceof GraphicalEditPart) {
					GraphicalEditPart temp = (GraphicalEditPart) editPart;
					temp.refresh();
				}
			}
			for (Object editPart: getTargetConnections()) {
				if (editPart instanceof GraphicalEditPart) {
					GraphicalEditPart temp = (GraphicalEditPart) editPart;
					temp.getFigure().invalidate();
					temp.getFigure().repaint();
				}
			}
		}

		super.handleNotificationEvent(notification);
	}
	
	@Override
	public void activate() {
		super.activate();
		AbstractEMFOperation emfOp = new AbstractEMFOperation(getEditingDomain(), "Location setting") {
			
			@Override
			protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				ArrayList<AssertedInferenceEditPart> list = (ArrayList<AssertedInferenceEditPart>) getAllAssertedInferences();
				Bounds claimLoc = (Bounds) ((Node) getModel()).getLayoutConstraint();
				for(int i = 0; i < list.size(); i++) {
					Location lc = (Location) ((Node)list.get(i).getModel()).getLayoutConstraint();
					lc.setX(claimLoc.getX()+claimLoc.getWidth()/list.size()*i);
					lc.setY(claimLoc.getY()+claimLoc.getHeight() + 100);
				}
				return Status.OK_STATUS;
			}
			
//			@Override
//			protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
//				for(Object part : getParent().getChildren()) {
//					ShapeNodeEditPart temp = (ShapeNodeEditPart) part;
//					if (temp.resolveSemanticElement().equals(getTarget())) {
//						Location lc = (Location) ((Node) getModel()).getLayoutConstraint();
//						Location claimLoc = (Location) ((Node) temp.getModel()).getLayoutConstraint();
//						Dimension r = DimensionUtil.CLAIM_DIMENSION;
//						lc.setX(claimLoc.getX()+r.width/2);
//						lc.setY(claimLoc.getY()+r.height + 100);
//					}
//				}
//				return Status.OK_STATUS;
//			}
		};
		IStatus status;
		try {
			status = OperationHistoryFactory.getOperationHistory().execute(emfOp, null, null);
		} catch (ExecutionException e) {
			status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Setting location failed", e);
		}
	}
	
	public List<AssertedInferenceEditPart> getAllAssertedInferences() {
		Claim claim = (Claim) resolveSemanticElement();
		ArrayList<AssertedInferenceEditPart> ret = new ArrayList<AssertedInferenceEditPart>();
		for(Object part : getParent().getChildren()) {
			if(part instanceof AssertedInferenceEditPart)
			{
				AssertedInferenceEditPart temp = (AssertedInferenceEditPart) part;
				AssertedInference obj = (AssertedInference) temp.resolveSemanticElement();
				if(obj.getTarget().contains(claim)) {
					ret.add(temp);
				}
			}
		}
		return ret;
	}
	
	public Assertion getTarget() {
		AssertedInference inference = (AssertedInference) resolveSemanticElement();
		return (Assertion) inference.getTarget().get(0);
	}
}
