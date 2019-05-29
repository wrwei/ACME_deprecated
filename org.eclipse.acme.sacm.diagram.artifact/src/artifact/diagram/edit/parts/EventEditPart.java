package artifact.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
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

import acme.artifact.diagram.figure.EventShape;
import acme.assurancecase.diagram.policy.ConstrainedResizeShapeEditPolicy;
import acme.common.diagram.dialog.DialogHelper;
import acme.diagram.util.DimensionUtil;
import acme.diagram.util.FontManager;
import acme.diagram.util.ModelElementFeatureUtil;
import artifact.Event;
import artifact.diagram.edit.policies.EventItemSemanticEditPolicy;
import artifact.diagram.part.ArtifactVisualIDRegistry;
import base.ModelElement;

/**
 * @generated
 */
public class EventEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2110;

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
	public EventEditPart(View view) {
		super(view);
	}

	/**
	* @generated NOT
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new EventItemSemanticEditPolicy());
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
		return primaryShape = new EventFigure();
	}

	/**
	* @generated
	*/
	public EventFigure getPrimaryShape() {
		return (EventFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel19EditPart) {
			((WrappingLabel19EditPart) childEditPart).setLabel(getPrimaryShape().getFigureEventName());
			return true;
		}
		if (childEditPart instanceof WrappingLabel20EditPart) {
			((WrappingLabel20EditPart) childEditPart).setLabel(getPrimaryShape().getFigureEventDescription());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel19EditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel20EditPart) {
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
		return getChildBySemanticHint(ArtifactVisualIDRegistry.getType(WrappingLabel19EditPart.VISUAL_ID));
	}

	/**
	 * @generated NOT
	 */
	public class EventFigure extends EventShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureEventName;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEventDescription;

		/**
		 * @generated
		 */
		public EventFigure() {
			setEvent((Event) resolveSemanticElement());
			this.setLayoutManager(new XYLayout());
			this.setMinimumSize(DimensionUtil.EVENT_DIMENSION);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {
			/* get the position offset based on node's current position */
			Bounds nodeSize = (Bounds) ((Node) getModel()).getLayoutConstraint();
			
			int nodeLabelOffsetX = (int)(0.25 * nodeSize.getWidth());
			int nodeLabelOffsetY = (int)(0.25 * nodeSize.getHeight());
			//System.out.println("" + nodeSize.getWidth() + nodeSize.getHeight());
			
			fFigureEventName = new WrappingLabel();

			ModelElement modelElement = (ModelElement) resolveSemanticElement();

			fFigureEventName.setText(ModelElementFeatureUtil.getName(modelElement));
			
			fFigureEventName.setFont(FontManager.BOLD_FONT);
			
			Dimension nameDimension = DimensionUtil.getTextSize(fFigureEventName.getText(), 
					fFigureEventName.getFont());

			this.add(fFigureEventName, new Rectangle(5 + nodeLabelOffsetX, 5 + nodeLabelOffsetY, 
					nameDimension.width, nameDimension.height));

			fFigureEventDescription = new WrappingLabel();

			fFigureEventDescription.setText(ModelElementFeatureUtil.getDescription(modelElement));
			
			fFigureEventDescription.setTextWrap(true);
			
			Dimension descriptionDimension = DimensionUtil.getTextSize(fFigureEventDescription.getText(),
					fFigureEventDescription.getFont(), DimensionUtil.EVENT_DIMENSION.width-10);

			this.add(fFigureEventDescription, new Rectangle(5 + nodeLabelOffsetX, 35 + nodeLabelOffsetY, 
					descriptionDimension.width, descriptionDimension.height));
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEventName() {
			return fFigureEventName;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEventDescription() {
			return fFigureEventDescription;
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
