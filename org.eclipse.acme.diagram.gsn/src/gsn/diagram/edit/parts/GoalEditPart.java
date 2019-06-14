package gsn.diagram.edit.parts;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
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
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.BoundsImpl;
import org.eclipse.swt.graphics.Color;

import acme.assurancecase.diagram.policy.ConstrainedResizeShapeEditPolicy;
import acme.common.diagram.dialog.DialogHelper;
import acme.diagram.util.DimensionUtil;
import acme.diagram.util.FontManager;
import acme.diagram.util.ModelElementFeatureUtil;
import acme.gsn.diagram.figure.GoalShape;
import base.ModelElement;
import gsn.Goal;
import gsn.Gsn_Package;
import gsn.diagram.edit.policies.GoalItemSemanticEditPolicy;
import gsn.diagram.part.GsnVisualIDRegistry;

/**
 * @generated
 */
public class GoalEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2303;

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
	public GoalEditPart(View view) {
		super(view);
	}

	/**
	* @generated NOT
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new GoalItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated NOT
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			@Override
			public Command getCommand(Request request) {
//				if (request instanceof ChangeBoundsRequest) {
//					ChangeBoundsRequest req = (ChangeBoundsRequest) request;
//					//get bounds of the current shape
//					Rectangle bounds = getPrimaryShape().getBounds().getCopy();
//					//get size
//					Dimension d = bounds.getSize();
//					//expand to the changed size
//					d.expand(req.getSizeDelta());
//					Dimension minimum = DimensionUtil.GOAL_DIMENSION;
//					if (d.width > minimum.width && d.height > minimum.height) {
//						GoalFigure nodeFigure = (GoalFigure) getPrimaryShape();
//						Dimension descriptionDimension = DimensionUtil.getTextSize(
//								nodeFigure.getFigureGoalDescription().getText(),
//								nodeFigure.getFigureGoalDescription().getFont(), d.width - 15);
//						nodeFigure.setConstraint(nodeFigure.getFigureGoalDescription(),
//								new Rectangle(5, 35, descriptionDimension.width, descriptionDimension.height));
//					}
//				}
				return super.getCommand(request);
			}

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
	* @generated NOT
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new GoalFigure();
	}

	/**
	* @generated
	*/
	public GoalFigure getPrimaryShape() {
		return (GoalFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel5EditPart) {
			((WrappingLabel5EditPart) childEditPart).setLabel(getPrimaryShape().getFigureGoalName());
			return true;
		}
		if (childEditPart instanceof WrappingLabel6EditPart) {
			((WrappingLabel6EditPart) childEditPart).setLabel(getPrimaryShape().getFigureGoalDescription());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel5EditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel6EditPart) {
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
		return getChildBySemanticHint(GsnVisualIDRegistry.getType(WrappingLabel5EditPart.VISUAL_ID));
	}

	/**
	 * @generated NOT
	 */
	public class GoalFigure extends GoalShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureGoalName;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureGoalDescription;

		/**
		 * @generated NOT
		 */
		public GoalFigure() {
			this.setGoal((Goal) resolveSemanticElement());
			this.setLayoutManager(new XYLayout());
			this.setMinimumSize(DimensionUtil.getMinimumDimension((ModelElement) resolveSemanticElement(),
					DimensionUtil.GOAL_DIMENSION));
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureGoalName = new WrappingLabel();

			Goal goal = (Goal) resolveSemanticElement();

			fFigureGoalName.setText(ModelElementFeatureUtil.getName(goal));

			fFigureGoalName.setFont(FontManager.BOLD_FONT);

			Dimension nameDimension = DimensionUtil.getTextSize(fFigureGoalName.getText(), fFigureGoalName.getFont());

			this.add(fFigureGoalName, new Rectangle(5, 5, nameDimension.width, nameDimension.height));

			fFigureGoalDescription = new WrappingLabel();

			fFigureGoalDescription.setText(ModelElementFeatureUtil.getDescription(goal));

			fFigureGoalDescription.setTextWrap(true);

			Dimension descriptionDimension = DimensionUtil.getTextSize(fFigureGoalDescription.getText(),
					fFigureGoalDescription.getFont(), DimensionUtil.GOAL_DIMENSION.width - 10);

			this.add(fFigureGoalDescription,
					new Rectangle(5, 35, descriptionDimension.width, descriptionDimension.height));
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureGoalName() {
			return fFigureGoalName;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureGoalDescription() {
			return fFigureGoalDescription;
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
			if (((CustomAnchor) connectionAnchor).getType().equals("Context")
					&& connEditPart instanceof InContextOfEditPart) {
			} else if (((CustomAnchor) connectionAnchor).getType().equals("Supported")
					&& connEditPart instanceof SupportedByEditPart) {
			} else {
				connectionAnchor = new CustomAnchor(getPrimaryShape(), connEditPart);
			}
		}
		return connectionAnchor;
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connEditPart) {
		if (connectionAnchor == null) {
			connectionAnchor = new CustomAnchor(getPrimaryShape(), connEditPart);
		} else {
			if (((CustomAnchor) connectionAnchor).getType().equals("Context")
					&& connEditPart instanceof InContextOfEditPart) {
			} else if (((CustomAnchor) connectionAnchor).getType().equals("Supported")
					&& connEditPart instanceof SupportedByEditPart) {
			} else {
				connectionAnchor = new CustomAnchor(getPrimaryShape(), connEditPart);
			}
		}
		return connectionAnchor;
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		if (notification.getNotifier() instanceof BoundsImpl) {
			//
			if (notification.getFeature() instanceof EAttribute) {
				EAttribute attribute = (EAttribute) notification.getFeature();
				if (attribute.getName().equals("width")) {
					int width = (int) notification.getNewValue();
					System.out.println(width);
					Rectangle bounds = getFigure().getBounds().getCopy();
					System.out.println(bounds);
					Dimension minimum = DimensionUtil.GOAL_DIMENSION;
					GoalFigure nodeFigure = (GoalFigure) getPrimaryShape();
					Dimension descriptionDimension = null;
					if (width >= minimum.width) {
						descriptionDimension = DimensionUtil.getTextSize(
								nodeFigure.getFigureGoalDescription().getText(),
								nodeFigure.getFigureGoalDescription().getFont(), width - 10);
					}
					else {
						descriptionDimension = DimensionUtil.getTextSize(
								nodeFigure.getFigureGoalDescription().getText(),
								nodeFigure.getFigureGoalDescription().getFont(), minimum.width - 10);
					}
					nodeFigure.setConstraint(nodeFigure.getFigureGoalDescription(),
							new Rectangle(5, 35, descriptionDimension.width, descriptionDimension.height));
				}
			}
		}

		boolean refresh = false;
		if (notification.getFeature().equals(Gsn_Package.eINSTANCE.getGoal_IsPublic())) {
			refresh = true;
		} else if (notification.getFeature()
				.equals(Gsn_Package.eINSTANCE.getGoal().getEStructuralFeature("uninstantiated"))) {
			refresh = true;
		} else if (notification.getFeature()
				.equals(Gsn_Package.eINSTANCE.getGoal().getEStructuralFeature("undeveloped"))) {
			refresh = true;
		} else if (notification.getFeature()
				.equals(Gsn_Package.eINSTANCE.getGoal().getEStructuralFeature("toBeSupportedByContract"))) {
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
