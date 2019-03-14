package argumentation.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
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

import acme.assurancecase.diagram.figure.ArgumentPackageBindingShape;
import acme.assurancecase.diagram.figure.ModuleShape;
import acme.assurancecase.diagram.policy.ConstrainedResizeShapeEditPolicy;
import acme.common.diagram.dialog.DialogHelper;
import acme.diagram.util.DimensionUtil;
import acme.diagram.util.FontManager;
import acme.diagram.util.ModelElementFeatureUtil;
import argumentation.ArgumentPackageBinding;
import argumentation.diagram.edit.policies.ArgumentPackageBindingItemSemanticEditPolicy;
import argumentation.diagram.part.ArgumentationVisualIDRegistry;
import base.ModelElement;

/**
 * @generated
 */
public class ArgumentPackageBindingEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2203;

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
	public ArgumentPackageBindingEditPart(View view) {
		super(view);
	}

	/**
	* @generated NOT
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ArgumentPackageBindingItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
//		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated NOT
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			@Override
			public Command getCommand(Request request) {
				if (request instanceof ChangeBoundsRequest) {
					ChangeBoundsRequest req = (ChangeBoundsRequest) request;
					//get bounds of the current shape
					Rectangle bounds = getPrimaryShape().getBounds().getCopy();
					//get size
					Dimension d = bounds.getSize();
					//expand to the changed size
					d.expand(req.getSizeDelta());
					Dimension minimum = DimensionUtil.ARGUMENT_PACKAGE_BINDING_DIMENSION;
					if (d.width > minimum.width && d.height > minimum.height) {
						ArgumentPackageBindingFigure nodeFigure = (ArgumentPackageBindingFigure) getPrimaryShape();
						Dimension descriptionDimension = DimensionUtil.getTextSize(
								nodeFigure.getFigureApbDesc().getText(),
								nodeFigure.getFigureApbDesc().getFont(), d.width - 10);
						nodeFigure.setConstraint(nodeFigure.getFigureApbDesc(),
								new Rectangle(5, ModuleShape.TOP_RECT_HEIGHT + 35, descriptionDimension.width,
										descriptionDimension.height));
					}
				}
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
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new ArgumentPackageBindingFigure();
	}

	/**
	* @generated
	*/
	public ArgumentPackageBindingFigure getPrimaryShape() {
		return (ArgumentPackageBindingFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel5EditPart) {
			((WrappingLabel5EditPart) childEditPart).setLabel(getPrimaryShape().getFigureApbName());
			return true;
		}
		if (childEditPart instanceof WrappingLabel6EditPart) {
			((WrappingLabel6EditPart) childEditPart).setLabel(getPrimaryShape().getFigureApbDesc());
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
		return getChildBySemanticHint(ArgumentationVisualIDRegistry.getType(WrappingLabel5EditPart.VISUAL_ID));
	}

	/**
	 * @generated NOT
	 */
	public class ArgumentPackageBindingFigure extends ArgumentPackageBindingShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureApbName;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureApbDesc;

		/**
		 * @generated NOT
		 */
		public ArgumentPackageBindingFigure() {
			this.setLayoutManager(new XYLayout());
			this.setMinimumSize(DimensionUtil.ARGUMENT_PACKAGE_BINDING_DIMENSION);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(2), getMapMode().DPtoLP(2), getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(2)));
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			Dimension d = DimensionUtil.ARGUMENT_PACKAGE_BINDING_DIMENSION;

			ArgumentPackageBinding argumentPackageBinding = (ArgumentPackageBinding) resolveSemanticElement();

			fFigureApbName = new WrappingLabel();

			fFigureApbName.setText(ModelElementFeatureUtil.getName(argumentPackageBinding));

			fFigureApbName.setFont(FontManager.BOLD_FONT);

			Dimension nameDimension = DimensionUtil.getTextSize(fFigureApbName.getText(), fFigureApbName.getFont());

			this.add(fFigureApbName, new Rectangle(5+ArgumentPackageBindingShape.TOP_RECT_WIDTH_OFFSET, ArgumentPackageBindingShape.TOP_RECT_HEIGHT + 5,
					nameDimension.width, nameDimension.height));

			fFigureApbDesc = new WrappingLabel();

			fFigureApbDesc.setText(ModelElementFeatureUtil.getDescription(argumentPackageBinding));

			fFigureApbDesc.setTextWrap(true);

			Dimension descriptionDimension = DimensionUtil.getTextSize(fFigureApbDesc.getText(),
					fFigureApbDesc.getFont(), d.width - 10);

			this.add(fFigureApbDesc, new Rectangle(5+ArgumentPackageBindingShape.TOP_RECT_WIDTH_OFFSET, ArgumentPackageBindingShape.TOP_RECT_HEIGHT + 35,
					descriptionDimension.width, descriptionDimension.height));

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureApbName() {
			return fFigureApbName;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureApbDesc() {
			return fFigureApbDesc;
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

}
