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
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import acme.argumentation.diagram.figure.ClaimShape;
import acme.assurancecase.diagram.policy.ConstrainedResizeShapeEditPolicy;
import acme.common.diagram.dialog.DialogHelper;
import acme.diagram.util.DimensionUtil;
import acme.diagram.util.FontManager;
import acme.diagram.util.ModelElementFeatureUtil;
import argumentation.Argumentation_Package;
import argumentation.AssertedInference;
import argumentation.Claim;
import argumentation.diagram.edit.policies.ClaimItemSemanticEditPolicy;
import argumentation.diagram.part.ArgumentationVisualIDRegistry;
import base.ModelElement;

/**
 * @generated
 */
public class ClaimEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2205;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;
	
	protected ConnectionAnchor connectionAnchor;

	/**
	* @generated
	*/
	public ClaimEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ClaimItemSemanticEditPolicy());
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
		return primaryShape = new ClaimFigure();
	}

	/**
	* @generated
	*/
	public ClaimFigure getPrimaryShape() {
		return (ClaimFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel9EditPart) {
			((WrappingLabel9EditPart) childEditPart).setLabel(getPrimaryShape().getFigureClaimName());
			return true;
		}
		if (childEditPart instanceof WrappingLabel10EditPart) {
			((WrappingLabel10EditPart) childEditPart).setLabel(getPrimaryShape().getFigureClaimDesc());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel9EditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel10EditPart) {
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
		super.addChildVisual(childEditPart, -1);
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
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
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
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
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

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ArgumentationVisualIDRegistry.getType(WrappingLabel9EditPart.VISUAL_ID));
	}

	/**
	 * @generated NOT
	 */
	public class ClaimFigure extends ClaimShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureClaimName;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClaimDesc;

		/**
		 * @generated NOT
		 */
		public ClaimFigure() {
			this.setClaim((Claim) resolveSemanticElement());
			this.setLayoutManager(new XYLayout());
			this.setMinimumSize(DimensionUtil.getMinimumDimension((ModelElement) resolveSemanticElement(),
					DimensionUtil.CLAIM_DIMENSION));
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureClaimName = new WrappingLabel();

			Claim claim = (Claim) resolveSemanticElement();

			fFigureClaimName.setText(ModelElementFeatureUtil.getName(claim));

			fFigureClaimName.setFont(FontManager.BOLD_FONT);

			Dimension nameDimension = DimensionUtil.getTextSize(fFigureClaimName.getText(), fFigureClaimName.getFont());

			this.add(fFigureClaimName, new Rectangle(5, 5, nameDimension.width, nameDimension.height));

			fFigureClaimDesc = new WrappingLabel();

			fFigureClaimDesc.setText(ModelElementFeatureUtil.getDescription(claim));

			fFigureClaimDesc.setTextWrap(true);

			Dimension descriptionDimension = DimensionUtil.getTextSize(fFigureClaimDesc.getText(),
					fFigureClaimDesc.getFont(), DimensionUtil.CLAIM_DIMENSION.width - 10);

			this.add(fFigureClaimDesc,
					new Rectangle(5, 35, descriptionDimension.width, descriptionDimension.height));
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClaimName() {
			return fFigureClaimName;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClaimDesc() {
			return fFigureClaimDesc;
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
	public EditPolicy getPrimaryDragEditPolicy() {
		return new ConstrainedResizeShapeEditPolicy(this);
	}
	
	@Override
	public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connEditPart) {
		if (connectionAnchor == null) {
			connectionAnchor = new CustomAnchor(getPrimaryShape(), connEditPart);
		} else {
		}
		return connectionAnchor;
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connEditPart) {
		if (connectionAnchor == null) {
			connectionAnchor = new CustomAnchor(getPrimaryShape(), connEditPart);
		} else {
		}
		return connectionAnchor;
	}

	
	@Override
	protected void handleNotificationEvent(Notification notification) {
		boolean refresh = false;
		int changeSize = 0;
		if (notification.getFeature().equals(Argumentation_Package.eINSTANCE.getAssertion_AssertionDeclaration())) {
			refresh = true;
		} else if (notification.getFeature()
				.equals(Argumentation_Package.eINSTANCE.getClaim().getEStructuralFeature("isAbstract"))) {
			refresh = true;
		}
		else if (notification.getFeature()
				.equals(Argumentation_Package.eINSTANCE.getClaim().getEStructuralFeature("isCitation"))) {
			refresh = true;
			if (notification.getNewBooleanValue()) {
				changeSize = 1;
			}
			else {
				changeSize = 0;
			}
		}
		if (refresh) {
			if (changeSize == 0) {
				primaryShape.setMinimumSize(DimensionUtil.CLAIM_DIMENSION);
				ClaimFigure claimFigure = (ClaimFigure) primaryShape;
				Dimension nameDimension = DimensionUtil.getTextSize(claimFigure.getFigureClaimName().getText(), claimFigure.getFigureClaimName().getFont());
				claimFigure.setConstraint(claimFigure.getFigureClaimName(), new Rectangle(5, 5, nameDimension.width, nameDimension.height));
				Dimension descriptionDimension = DimensionUtil.getTextSize(claimFigure.getFigureClaimDesc().getText(),
						claimFigure.getFigureClaimDesc().getFont(), DimensionUtil.CLAIM_DIMENSION.width - 10);
				claimFigure.setConstraint(claimFigure.getFigureClaimDesc(),  new Rectangle(5, 35, descriptionDimension.width, descriptionDimension.height));
			}
			else if (changeSize == 1) {
				primaryShape.setMinimumSize(DimensionUtil.CITATION_CLAIM_DIMENSION);
				ClaimFigure claimFigure = (ClaimFigure) primaryShape;
				Dimension nameDimension = DimensionUtil.getTextSize(claimFigure.getFigureClaimName().getText(), claimFigure.getFigureClaimName().getFont());
				claimFigure.setConstraint(claimFigure.getFigureClaimName(), new Rectangle(ClaimShape.CITED_BOARDER_WIDTH+ClaimShape.CITED_OFFSET+5, 5, nameDimension.width, nameDimension.height));
				Dimension descriptionDimension = DimensionUtil.getTextSize(claimFigure.getFigureClaimDesc().getText(),
						claimFigure.getFigureClaimDesc().getFont(), DimensionUtil.CLAIM_DIMENSION.width - 10);
				claimFigure.setConstraint(claimFigure.getFigureClaimDesc(),  new Rectangle(ClaimShape.CITED_BOARDER_WIDTH+ClaimShape.CITED_OFFSET+5, 35, descriptionDimension.width, descriptionDimension.height));
			}
			Rectangle rectangle = DimensionUtil.getConstraints((ModelElement) resolveSemanticElement(),
					getFigure().getBounds());
			getFigure().getParent().setConstraint(getFigure(), rectangle);
			getFigure().invalidate();
			getFigure().repaint();
		}

		super.handleNotificationEvent(notification);
	}
	
//	@Override
//	public void activate() {
//		super.activate();
//		AbstractEMFOperation emfOp = new AbstractEMFOperation(getEditingDomain(), "Location setting") {
//			@Override
//			protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
//				ArrayList<AssertedInferenceEditPart> list = (ArrayList<AssertedInferenceEditPart>) getAllAssertedInferences();
//				Bounds claimLoc = (Bounds) ((Node) getModel()).getLayoutConstraint();
//				for(int i = 0; i < list.size(); i++) {
//					Location lc = (Location) ((Node)list.get(i).getModel()).getLayoutConstraint();
//					lc.setX(claimLoc.getX()+claimLoc.getWidth()/list.size()*i);
//					lc.setY(claimLoc.getY()+claimLoc.getHeight() + 100);
//				}
//				return Status.OK_STATUS;
//			}
//		};
//		IStatus status;
//		try {
//			status = OperationHistoryFactory.getOperationHistory().execute(emfOp, null, null);
//		} catch (ExecutionException e) {
//			status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Setting location failed", e);
//		}
//	}
//	
//	public List<AssertedInferenceEditPart> getAllAssertedInferences() {
//		Claim claim = (Claim) resolveSemanticElement();
//		ArrayList<AssertedInferenceEditPart> ret = new ArrayList<AssertedInferenceEditPart>();
//		for(Object part : getParent().getChildren()) {
//			if(part instanceof AssertedInferenceEditPart)
//			{
//				AssertedInferenceEditPart temp = (AssertedInferenceEditPart) part;
//				AssertedInference obj = (AssertedInference) temp.resolveSemanticElement();
//				if(obj.getTarget().contains(claim)) {
//					ret.add(temp);
//				}
//			}
//		}
//		return ret;
//	}
}
