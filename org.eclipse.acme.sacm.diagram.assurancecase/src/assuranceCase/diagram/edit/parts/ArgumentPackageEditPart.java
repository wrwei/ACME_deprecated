package assuranceCase.diagram.edit.parts;

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

import acme.assurancecase.diagram.figure.ArgumentPackageShape;
import acme.assurancecase.diagram.figure.ModuleShape;
import acme.assurancecase.diagram.policy.ConstrainedResizeShapeEditPolicy;
import acme.common.diagram.dialog.DialogHelper;
import acme.diagram.util.DimensionUtil;
import acme.diagram.util.FontManager;
import acme.diagram.util.ModelElementFeatureUtil;
import argumentation.ArgumentPackage;
import base.ModelElement;

/**
 * @generated
 */
public class ArgumentPackageEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2004;

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
	public ArgumentPackageEditPart(View view) {
		super(view);
	}

	/**
	* @generated NOT
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new assuranceCase.diagram.edit.policies.ArgumentPackageItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
//		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new assuranceCase.diagram.edit.policies.OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
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
					Dimension minimum = DimensionUtil.ARGUMENT_PACKAGE_DIMENSION;
					if (d.width > minimum.width && d.height > minimum.height) {
						ArgumentPackageFigure nodeFigure = (ArgumentPackageFigure) getPrimaryShape();
						Dimension descriptionDimension = DimensionUtil.getTextSize(
								nodeFigure.getFigureArgpDescription().getText(),
								nodeFigure.getFigureArgpDescription().getFont(), d.width - 10);
						nodeFigure.setConstraint(nodeFigure.getFigureArgpDescription(),
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
		return primaryShape = new ArgumentPackageFigure();
	}

	/**
	* @generated
	*/
	public ArgumentPackageFigure getPrimaryShape() {
		return (ArgumentPackageFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof assuranceCase.diagram.edit.parts.WrappingLabel7EditPart) {
			((assuranceCase.diagram.edit.parts.WrappingLabel7EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureArgpName());
			return true;
		}
		if (childEditPart instanceof assuranceCase.diagram.edit.parts.WrappingLabel8EditPart) {
			((assuranceCase.diagram.edit.parts.WrappingLabel8EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureArgpDescription());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof assuranceCase.diagram.edit.parts.WrappingLabel7EditPart) {
			return true;
		}
		if (childEditPart instanceof assuranceCase.diagram.edit.parts.WrappingLabel8EditPart) {
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
		return getChildBySemanticHint(assuranceCase.diagram.part.AssurancecaseVisualIDRegistry
				.getType(assuranceCase.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID));
	}

	/**
	 * @generated NOT
	 */
	public class ArgumentPackageFigure extends ArgumentPackageShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureArgpName;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureArgpDescription;

		/**
		 * @generated NOT
		 */
		public ArgumentPackageFigure() {
			this.setLayoutManager(new XYLayout());
			this.setMinimumSize(DimensionUtil.ARGUMENT_PACKAGE_DIMENSION);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(2), getMapMode().DPtoLP(2), getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(2)));
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			Dimension d = DimensionUtil.ARGUMENT_PACKAGE_DIMENSION;

			ArgumentPackage argumentPackageBinding = (ArgumentPackage) resolveSemanticElement();

			fFigureArgpName = new WrappingLabel();

			fFigureArgpName.setText(ModelElementFeatureUtil.getName(argumentPackageBinding));

			fFigureArgpName.setFont(FontManager.BOLD_FONT);

			Dimension nameDimension = DimensionUtil.getTextSize(fFigureArgpName.getText(), fFigureArgpName.getFont());

			this.add(fFigureArgpName, new Rectangle(5 +  ArgumentPackageShape.TOP_RECT_WIDTH_OFFSET, ArgumentPackageShape.TOP_RECT_HEIGHT + 5, nameDimension.width,
					nameDimension.height));

			fFigureArgpDescription = new WrappingLabel();

			fFigureArgpDescription.setText(ModelElementFeatureUtil.getDescription(argumentPackageBinding));

			fFigureArgpDescription.setTextWrap(true);

			Dimension descriptionDimension = DimensionUtil.getTextSize(fFigureArgpDescription.getText(),
					fFigureArgpDescription.getFont(), d.width - 10);

			this.add(fFigureArgpDescription, new Rectangle(5+ArgumentPackageShape.TOP_RECT_WIDTH_OFFSET, ArgumentPackageShape.TOP_RECT_HEIGHT + 35,
					descriptionDimension.width, descriptionDimension.height));

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureArgpName() {
			return fFigureArgpName;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureArgpDescription() {
			return fFigureArgpDescription;
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
