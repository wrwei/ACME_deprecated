package gsn.diagram.edit.parts;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
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
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import acme.assurancecase.diagram.policy.ConstrainedResizeShapeEditPolicy;
import acme.common.diagram.dialog.DialogHelper;
import acme.diagram.util.DimensionUtil;
import acme.diagram.util.FontManager;
import acme.diagram.util.ModelElementFeatureUtil;
import acme.diagram.util.ModelElementUtil;
import acme.gsn.diagram.figure.AwaySolutionShape;
import argumentation.ArgumentPackage;
import base.ModelElement;
import gsn.AwaySolution;
import gsn.Gsn_Package;
import gsn.Solution;
import gsn.diagram.edit.policies.AwaySolutionItemSemanticEditPolicy;
import gsn.diagram.part.GsnVisualIDRegistry;

/**
 * @generated
 */
public class AwaySolutionEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2314;

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
	public AwaySolutionEditPart(View view) {
		super(view);
	}

	/**
	* @generated NOT
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new AwaySolutionItemSemanticEditPolicy());
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
		return primaryShape = new AwaySolutionFigure();
	}

	/**
	* @generated
	*/
	public AwaySolutionFigure getPrimaryShape() {
		return (AwaySolutionFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel28EditPart) {
			((WrappingLabel28EditPart) childEditPart).setLabel(getPrimaryShape().getFigureAwaySolutionName());
			return true;
		}
		if (childEditPart instanceof WrappingLabel29EditPart) {
			((WrappingLabel29EditPart) childEditPart).setLabel(getPrimaryShape().getFigureAwaySolutionDescription());
			return true;
		}
		if (childEditPart instanceof WrappingLabel30EditPart) {
			((WrappingLabel30EditPart) childEditPart).setLabel(getPrimaryShape().getFigureAwaySolutionModule());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel28EditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel29EditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel30EditPart) {
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
		return getChildBySemanticHint(GsnVisualIDRegistry.getType(WrappingLabel28EditPart.VISUAL_ID));
	}

	/**
	 * @generated NOT
	 */
	public class AwaySolutionFigure extends AwaySolutionShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAwaySolutionName;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAwaySolutionDescription;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAwaySolutionModule;

		/**
		 * @generated NOT
		 */
		public AwaySolutionFigure() {
			this.setAwaySolution((AwaySolution) resolveSemanticElement());
			this.setLayoutManager(new XYLayout());
			this.setMinimumSize(DimensionUtil.AWAY_SOLUTION_DIMENSION);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(2), getMapMode().DPtoLP(2), getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(2)));

			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {
            /* get the node's current size */
            Bounds nodeSize = (Bounds) ((Node) getModel()).getLayoutConstraint();
            
			fFigureAwaySolutionName = new WrappingLabel();

			AwaySolution awaySolution = (AwaySolution) resolveSemanticElement();

			fFigureAwaySolutionName.setText(ModelElementFeatureUtil.getName(awaySolution));

			fFigureAwaySolutionName.setFont(FontManager.BOLD_FONT);

			Dimension awaySolutionDimension = DimensionUtil.AWAY_SOLUTION_DIMENSION;

			int r = awaySolutionDimension.width / 2;

			int offset = (int) Math.round(r - r / Math.sqrt(2.0));

			Dimension nameDimension = DimensionUtil.getTextSize(fFigureAwaySolutionName.getText(),
					fFigureAwaySolutionName.getFont());

			this.add(fFigureAwaySolutionName,
					new Rectangle(offset + 5, offset, nameDimension.width, nameDimension.height));

			fFigureAwaySolutionDescription = new WrappingLabel();

			fFigureAwaySolutionDescription.setText(ModelElementFeatureUtil.getDescription(awaySolution));

			fFigureAwaySolutionDescription.setTextWrap(true);

			Dimension descriptionDimension = DimensionUtil.getTextSize(fFigureAwaySolutionDescription.getText(),
					fFigureAwaySolutionDescription.getFont(), awaySolutionDimension.width - offset * 2 - 10);

			this.add(fFigureAwaySolutionDescription,
					new Rectangle(offset + 5, offset + 35, descriptionDimension.width, descriptionDimension.height));

			fFigureAwaySolutionModule = new WrappingLabel();

			Solution solution = (Solution) awaySolution.getCitedElement();

			if (solution != null) {
				ArgumentPackage containingModule = ModelElementUtil.getContainingModule(solution);
				fFigureAwaySolutionModule.setText(ModelElementFeatureUtil.getName(containingModule));
			} else {
				fFigureAwaySolutionModule.setText("<...>");
			}

			fFigureAwaySolutionModule.setFont(FontManager.BOLD_FONT);

			int y_offset = nodeSize.getHeight() - AwaySolutionShape.MODULE_ICON_OFFSET
					- AwaySolutionShape.MODULE_ICON_HEIGHT;
			int x_offset = AwaySolutionShape.MODULE_ICON_OFFSET + AwaySolutionShape.MODULE_ICON_WIDTH + 5;

			Dimension moduleDimension = DimensionUtil.getTextSize(fFigureAwaySolutionModule.getText(),
					fFigureAwaySolutionModule.getFont());

			this.add(fFigureAwaySolutionModule,
					new Rectangle(x_offset, y_offset, moduleDimension.width, moduleDimension.height));

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAwaySolutionName() {
			return fFigureAwaySolutionName;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAwaySolutionDescription() {
			return fFigureAwaySolutionDescription;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAwaySolutionModule() {
			return fFigureAwaySolutionModule;
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
				.equals(Gsn_Package.eINSTANCE.getAwaySolution().getEStructuralFeature("uninstantiated"))) {
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
