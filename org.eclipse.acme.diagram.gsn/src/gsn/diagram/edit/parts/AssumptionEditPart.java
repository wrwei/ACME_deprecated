package gsn.diagram.edit.parts;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
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
import org.eclipse.swt.graphics.Color;

import acme.assurancecase.diagram.policy.ConstrainedResizeShapeEditPolicy;
import acme.common.diagram.dialog.DialogHelper;
import acme.diagram.util.DimensionUtil;
import acme.diagram.util.FontManager;
import acme.diagram.util.ModelElementFeatureUtil;
import acme.gsn.diagram.figure.AssumptionShape;
import base.ModelElement;
import gsn.Assumption;
import gsn.Gsn_Package;
import gsn.diagram.edit.policies.AssumptionItemSemanticEditPolicy;
import gsn.diagram.part.GsnVisualIDRegistry;

/**
 * @generated
 */
public class AssumptionEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2308;

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
	public AssumptionEditPart(View view) {
		super(view);
	}

	/**
	* @generated NOT
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new AssumptionItemSemanticEditPolicy());
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
	* @generated NOT
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new AssumptionFigure();
	}

	/**
	* @generated
	*/
	public AssumptionFigure getPrimaryShape() {
		return (AssumptionFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel15EditPart) {
			((WrappingLabel15EditPart) childEditPart).setLabel(getPrimaryShape().getFigureAssumptionName());
			return true;
		}
		if (childEditPart instanceof WrappingLabel16EditPart) {
			((WrappingLabel16EditPart) childEditPart).setLabel(getPrimaryShape().getFigureAssumptionDescription());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel15EditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel16EditPart) {
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
		return getChildBySemanticHint(GsnVisualIDRegistry.getType(WrappingLabel15EditPart.VISUAL_ID));
	}

	/**
	 * @generated NOT
	 */
	public class AssumptionFigure extends AssumptionShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAssumptionName;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAssumptionDescription;

		/**
		 * @generated NOT
		 */
		public AssumptionFigure() {
			this.setAssumption((Assumption) resolveSemanticElement());
			this.setLayoutManager(new XYLayout());
			this.setMinimumSize(DimensionUtil.ASSUMPTION_DIMENSION);
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			Dimension r = DimensionUtil.ASSUMPTION_DIMENSION;

			fFigureAssumptionName = new WrappingLabel();

			Assumption assumption = (Assumption) resolveSemanticElement();

			fFigureAssumptionName.setText(ModelElementFeatureUtil.getName(assumption));

			fFigureAssumptionName.setFont(FontManager.BOLD_FONT);

			Dimension nameDimension = DimensionUtil.getTextSize(fFigureAssumptionName.getText(),
					fFigureAssumptionName.getFont());

			this.add(fFigureAssumptionName,
					new Rectangle(r.width / 3 + 5, 5, nameDimension.width, nameDimension.height));

			fFigureAssumptionDescription = new WrappingLabel();

			fFigureAssumptionDescription.setText(ModelElementFeatureUtil.getDescription(assumption));

			fFigureAssumptionDescription.setTextWrap(true);

			Dimension descriptionDimension = DimensionUtil.getTextSize(fFigureAssumptionDescription.getText(),
					fFigureAssumptionDescription.getFont(), DimensionUtil.ASSUMPTION_DIMENSION.width / 7 * 5 - 10);

			this.add(fFigureAssumptionDescription,
					new Rectangle(r.width / 7 + 5, 35, descriptionDimension.width, descriptionDimension.height));

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAssumptionName() {
			return fFigureAssumptionName;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAssumptionDescription() {
			return fFigureAssumptionDescription;
		}

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
	public void performRequest(Request request) {
		if (request.getType() == RequestConstants.REQ_OPEN) {
			DialogHelper.handleElement(getEditingDomain(), (ModelElement) resolveSemanticElement());
		}
		super.performRequest(request);
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		boolean refresh = false;
		if (notification.getFeature()
				.equals(Gsn_Package.eINSTANCE.getAssumption().getEStructuralFeature("uninstantiated"))) {
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
