package artifact.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import artifact.ArtifactAsset;
import artifact.Property;
import artifact.diagram.edit.policies.ArtifactBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ArtifactAssetArtifactPropertyReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public ArtifactAssetArtifactPropertyReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof ArtifactAsset) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Property && newEnd instanceof ArtifactAsset)) {
			return false;
		}
		return ArtifactBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistArtifactAssetArtifactProperty_4102(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Property && newEnd instanceof Property)) {
			return false;
		}
		return ArtifactBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistArtifactAssetArtifactProperty_4102(getOldSource(), getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getArtifactProperty().remove(getOldTarget());
		getNewSource().getArtifactProperty().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getArtifactProperty().remove(getOldTarget());
		getOldSource().getArtifactProperty().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected ArtifactAsset getOldSource() {
		return (ArtifactAsset) referenceOwner;
	}

	/**
	* @generated
	*/
	protected ArtifactAsset getNewSource() {
		return (ArtifactAsset) newEnd;
	}

	/**
	* @generated
	*/
	protected Property getOldTarget() {
		return (Property) oldEnd;
	}

	/**
	* @generated
	*/
	protected Property getNewTarget() {
		return (Property) newEnd;
	}
}
