/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package gsn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import gsn.diagram.edit.commands.InContextOfCreateCommand;
import gsn.diagram.edit.commands.InContextOfReorientCommand;
import gsn.diagram.edit.commands.SupportedByCreateCommand;
import gsn.diagram.edit.commands.SupportedByReorientCommand;
import gsn.diagram.edit.parts.InContextOfEditPart;
import gsn.diagram.edit.parts.SupportedByEditPart;
import gsn.diagram.providers.GsnElementTypes;

/**
 * @generated
 */
public class SupportedByItemSemanticEditPolicy extends GsnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SupportedByItemSemanticEditPolicy() {
		super(GsnElementTypes.SupportedBy_4401);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (GsnElementTypes.SupportedBy_4401 == req.getElementType()) {
			return getGEFWrapper(new SupportedByCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (GsnElementTypes.InContextOf_4402 == req.getElementType()) {
			return getGEFWrapper(new InContextOfCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (GsnElementTypes.SupportedBy_4401 == req.getElementType()) {
			return getGEFWrapper(new SupportedByCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (GsnElementTypes.InContextOf_4402 == req.getElementType()) {
			return getGEFWrapper(new InContextOfCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case SupportedByEditPart.VISUAL_ID:
			return getGEFWrapper(new SupportedByReorientCommand(req));
		case InContextOfEditPart.VISUAL_ID:
			return getGEFWrapper(new InContextOfReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
