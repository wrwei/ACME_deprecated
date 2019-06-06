package gsn.diagram.edit.parts;

import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.NonResizableEditPolicyEx;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import acme.common.diagram.dialog.DialogHelper;
import acme.diagram.util.DimensionUtil;
import acme.gsn.diagram.figure.ChoiceShape;
import base.ModelElement;
import gsn.ChoiceNode;
import gsn.diagram.edit.policies.ChoiceNodeItemSemanticEditPolicy;
import gsn.diagram.part.GsnVisualIDRegistry;

/**
 * @generated
 */
public class ChoiceNodeEditPart extends AbstractBorderedShapeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2310;

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
	public ChoiceNodeEditPart(View view) {
		super(view);
	}

	/**
	* @generated NOT
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ChoiceNodeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {
			
//			@Override
//			public Command getCommand(Request request) {
//				if (request instanceof ChangeBoundsRequest) {
//					ChangeBoundsRequest r = (ChangeBoundsRequest) request;
//					if (r.getSizeDelta().getArea() != 0) {
//						r.setSizeDelta(new Dimension());
//					}
//				}
//				else if (request instanceof CreateViewAndElementRequest) {
//					System.out.println(request);
//				}
//				return super.getCommand(request);
//			}

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (GsnVisualIDRegistry.getVisualID(childView)) {
				case WrappingLabel19EditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy() {

						protected List createSelectionHandles() {
							MoveHandle mh = new MoveHandle((GraphicalEditPart) getHost());
							mh.setBorder(null);
							return Collections.singletonList(mh);
						}
					};
				}
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
//					result = new NonResizableEditPolicy();
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
		return primaryShape = new ChoiceNodeFigure();
	}

	/**
	* @generated
	*/
	public ChoiceNodeFigure getPrimaryShape() {
		return (ChoiceNodeFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected void addBorderItem(IFigure borderItemContainer, IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof WrappingLabel19EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.SOUTH);
			locator.setBorderItemOffset(new Dimension(-20, -20));
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
		} else {
			super.addBorderItem(borderItemContainer, borderItemEditPart);
		}
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
	protected NodeFigure createMainFigure() {
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

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(GsnVisualIDRegistry.getType(WrappingLabel19EditPart.VISUAL_ID));
	}
	
	@Override
	public EditPolicy getPrimaryDragEditPolicy() {
		return new NonResizableEditPolicyEx();
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

	public class ChoiceNodeFigure extends ChoiceShape {

		/**
		 * @generated NOT
		 */
		public ChoiceNodeFigure() {
			this.setChoiceNode((ChoiceNode) resolveSemanticElement());
			this.setLayoutManager(new XYLayout());
			this.setMinimumSize(DimensionUtil.getMinimumDimension((ModelElement) resolveSemanticElement(),
					DimensionUtil.CHOICE_DIMENSION));
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {
		}
	}
}
