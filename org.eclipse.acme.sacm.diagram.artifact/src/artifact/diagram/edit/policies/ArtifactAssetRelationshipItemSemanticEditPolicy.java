package artifact.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import artifact.diagram.edit.commands.ArtifactAssetArtifactPropertyCreateCommand;
import artifact.diagram.edit.commands.ArtifactAssetArtifactPropertyReorientCommand;
import artifact.diagram.edit.commands.ArtifactAssetRelationshipCreateCommand;
import artifact.diagram.edit.commands.ArtifactAssetRelationshipReorientCommand;
import artifact.diagram.edit.parts.ArtifactAssetArtifactPropertyEditPart;
import artifact.diagram.edit.parts.ArtifactAssetRelationshipEditPart;
import artifact.diagram.providers.ArtifactElementTypes;

/**
 * @generated
 */
public class ArtifactAssetRelationshipItemSemanticEditPolicy extends ArtifactBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ArtifactAssetRelationshipItemSemanticEditPolicy() {
		super(ArtifactElementTypes.ArtifactAssetRelationship_4101);
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
		if (ArtifactElementTypes.ArtifactAssetRelationship_4101 == req.getElementType()) {
			return getGEFWrapper(new ArtifactAssetRelationshipCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ArtifactElementTypes.ArtifactAssetArtifactProperty_4102 == req.getElementType()) {
			return getGEFWrapper(new ArtifactAssetArtifactPropertyCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ArtifactElementTypes.ArtifactAssetRelationship_4101 == req.getElementType()) {
			return getGEFWrapper(new ArtifactAssetRelationshipCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ArtifactElementTypes.ArtifactAssetArtifactProperty_4102 == req.getElementType()) {
			return null;
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
		case ArtifactAssetRelationshipEditPart.VISUAL_ID:
			return getGEFWrapper(new ArtifactAssetRelationshipReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ArtifactAssetArtifactPropertyEditPart.VISUAL_ID:
			return getGEFWrapper(new ArtifactAssetArtifactPropertyReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
