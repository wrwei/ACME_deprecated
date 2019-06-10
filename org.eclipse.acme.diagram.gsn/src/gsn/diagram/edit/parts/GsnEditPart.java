package gsn.diagram.edit.parts;

import java.util.Iterator;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import gsn.diagram.edit.policies.GsnCanonicalEditPolicy;
import gsn.diagram.edit.policies.GsnItemSemanticEditPolicy;
import gsn.diagram.part.GsnVisualIDRegistry;

/**
 * @generated
 */
public class GsnEditPart extends DiagramEditPart {

	/**
	* @generated
	*/
	public final static String MODEL_ID = "Gsn"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 1003;

	/**
	* @generated
	*/
	public GsnEditPart(View view) {
		super(view);
	}

	/**
	* @generated NOT
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new GsnItemSemanticEditPolicy());
//		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new GsnCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(GsnVisualIDRegistry.TYPED_INSTANCE));
//		removeEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
		
	}
	
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy() {

			@Override
			protected Command getCreateCommand(CreateRequest request) {
				CreateViewRequest req = (CreateViewRequest) request;
		        
		        TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
		            .getEditingDomain();

				CompositeTransactionalCommand cc = new CompositeTransactionalCommand(
		            editingDomain, DiagramUIMessages.AddCommand_Label);
		        Iterator iter = req.getViewDescriptors().iterator();

				final Rectangle BOUNDS = (Rectangle) getConstraintFor(request);
				BOUNDS.height = -1;
				BOUNDS.width = -1;


				while (iter.hasNext()) {
					CreateViewRequest.ViewDescriptor viewDescriptor = (CreateViewRequest.ViewDescriptor)iter.next(); 
					Rectangle rect = getBoundsOffest(req, BOUNDS,viewDescriptor);
					cc.compose(new SetBoundsCommand(editingDomain, 
						DiagramUIMessages.SetLocationCommand_Label_Resize,
						viewDescriptor,
						rect));
				}
				
				if( cc.reduce() == null )
					return null;

				return chainGuideAttachmentCommands( request,
					new ICommandProxy(cc.reduce()));
			}
			
		};
		return lep;
	}
	
}
