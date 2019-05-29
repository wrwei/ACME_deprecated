package argumentation.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
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
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import acme.argumentation.diagram.figure.ArgumentReasoningShape;
import acme.argumentation.diagram.figure.ClaimShape;
import acme.assurancecase.diagram.policy.ConstrainedResizeShapeEditPolicy;
import acme.common.diagram.dialog.DialogHelper;
import acme.diagram.util.DimensionUtil;
import acme.diagram.util.FontManager;
import acme.diagram.util.ModelElementFeatureUtil;
import argumentation.ArgumentReasoning;
import argumentation.Argumentation_Package;
import argumentation.diagram.edit.policies.ArgumentReasoningItemSemanticEditPolicy;
import argumentation.diagram.part.ArgumentationVisualIDRegistry;
import base.ModelElement;

/**
 * @generated
 */
public class ArgumentReasoningEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2207;

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
	public ArgumentReasoningEditPart(View view) {
		super(view);
	}

	/**
	* @generated NOT
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ArgumentReasoningItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
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
		return primaryShape = new ArgumentReasoningFigure();
	}

	/**
	* @generated
	*/
	public ArgumentReasoningFigure getPrimaryShape() {
		return (ArgumentReasoningFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel13EditPart) {
			((WrappingLabel13EditPart) childEditPart).setLabel(getPrimaryShape().getFigureArName());
			return true;
		}
		if (childEditPart instanceof WrappingLabel14EditPart) {
			((WrappingLabel14EditPart) childEditPart).setLabel(getPrimaryShape().getFigureArDesc());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel13EditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel14EditPart) {
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
		return getChildBySemanticHint(ArgumentationVisualIDRegistry.getType(WrappingLabel13EditPart.VISUAL_ID));
	}

	/**
	 * @generated NOT
	 */
	public class ArgumentReasoningFigure extends ArgumentReasoningShape {

		/**
		 * @generated NOT
		 */
		private WrappingLabel fFigureArName;
		/**
		 * @generated NOT
		 */
		private WrappingLabel fFigureArDesc;

		/**
		 * @generated NOT
		 */
		public ArgumentReasoningFigure() {
			this.setArgumentReasoning((ArgumentReasoning) resolveSemanticElement());
			this.setLayoutManager(new XYLayout());
			this.setMinimumSize(DimensionUtil.getMinimumDimension((ModelElement) resolveSemanticElement(),
					DimensionUtil.ARGUMENTREASONING_DIMENSION));
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureArName = new WrappingLabel();

			ArgumentReasoning reasoning = (ArgumentReasoning) resolveSemanticElement();

			fFigureArName.setText(ModelElementFeatureUtil.getName(reasoning));

			fFigureArName.setFont(FontManager.BOLD_FONT);

			Dimension nameDimension = DimensionUtil.getTextSize(fFigureArName.getText(), fFigureArName.getFont());

			this.add(fFigureArName, new Rectangle(5, 5, nameDimension.width, nameDimension.height));

			fFigureArDesc = new WrappingLabel();

			fFigureArDesc.setText(ModelElementFeatureUtil.getDescription(reasoning));

			fFigureArDesc.setTextWrap(true);

			Dimension descriptionDimension = DimensionUtil.getTextSize(fFigureArDesc.getText(),
					fFigureArDesc.getFont(), DimensionUtil.CLAIM_DIMENSION.width - 10);

			this.add(fFigureArDesc,
					new Rectangle(5, 35, descriptionDimension.width, descriptionDimension.height));

		}

		/**
		 * @generated NOT
		 */
		public WrappingLabel getFigureArName() {
			return fFigureArName;
		}

		/**
		 * @generated NOT
		 */
		public WrappingLabel getFigureArDesc() {
			return fFigureArDesc;
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
				ArgumentReasoningFigure reasoningFigure = (ArgumentReasoningFigure) primaryShape;
				Dimension nameDimension = DimensionUtil.getTextSize(reasoningFigure.getFigureArName().getText(), reasoningFigure.getFigureArName().getFont());
				reasoningFigure.setConstraint(reasoningFigure.getFigureArName(), new Rectangle(5, 5, nameDimension.width, nameDimension.height));
				Dimension descriptionDimension = DimensionUtil.getTextSize(reasoningFigure.getFigureArDesc().getText(),
						reasoningFigure.getFigureArDesc().getFont(), DimensionUtil.CLAIM_DIMENSION.width - 10);
				reasoningFigure.setConstraint(reasoningFigure.getFigureArDesc(),  new Rectangle(5, 35, descriptionDimension.width, descriptionDimension.height));

			}
			else if (changeSize == 1) {
				primaryShape.setMinimumSize(DimensionUtil.CITATION_CLAIM_DIMENSION);
				ArgumentReasoningFigure reasoningFigure = (ArgumentReasoningFigure) primaryShape;
				Dimension nameDimension = DimensionUtil.getTextSize(reasoningFigure.getFigureArName().getText(), reasoningFigure.getFigureArName().getFont());
				reasoningFigure.setConstraint(reasoningFigure.getFigureArName(), new Rectangle(ClaimShape.CITED_BOARDER_WIDTH+ClaimShape.CITED_OFFSET+5, 5, nameDimension.width, nameDimension.height));
				Dimension descriptionDimension = DimensionUtil.getTextSize(reasoningFigure.getFigureArDesc().getText(),
						reasoningFigure.getFigureArDesc().getFont(), DimensionUtil.CLAIM_DIMENSION.width - 10);
				reasoningFigure.setConstraint(reasoningFigure.getFigureArDesc(),  new Rectangle(ClaimShape.CITED_BOARDER_WIDTH+ClaimShape.CITED_OFFSET+5, 35, descriptionDimension.width, descriptionDimension.height));

			}
			Rectangle rectangle = DimensionUtil.getConstraints((ModelElement) resolveSemanticElement(),
					getFigure().getBounds());
			getFigure().getParent().setConstraint(getFigure(), rectangle);
			getFigure().invalidate();
			getFigure().repaint();
		}
		super.handleNotificationEvent(notification);
	}


}
