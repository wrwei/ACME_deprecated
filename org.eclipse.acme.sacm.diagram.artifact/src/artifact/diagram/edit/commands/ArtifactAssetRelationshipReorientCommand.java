package artifact.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import artifact.ArtifactAsset;
import artifact.ArtifactAssetRelationship;
import artifact.ArtifactPackage;
import artifact.diagram.edit.policies.ArtifactBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ArtifactAssetRelationshipReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

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
	public ArtifactAssetRelationshipReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ArtifactAssetRelationship) {
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
		if (!(oldEnd instanceof ArtifactAsset && newEnd instanceof ArtifactAsset)) {
			return false;
		}
		if (getLink().getTarget().size() != 1) {
			return false;
		}
		ArtifactAsset target = (ArtifactAsset) getLink().getTarget().get(0);
		if (!(getLink().eContainer() instanceof ArtifactPackage)) {
			return false;
		}
		ArtifactPackage container = (ArtifactPackage) getLink().eContainer();
		return ArtifactBaseItemSemanticEditPolicy.getLinkConstraints().canExistArtifactAssetRelationship_4101(container,
				getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ArtifactAsset && newEnd instanceof ArtifactAsset)) {
			return false;
		}
		if (getLink().getSource().size() != 1) {
			return false;
		}
		ArtifactAsset source = (ArtifactAsset) getLink().getSource().get(0);
		if (!(getLink().eContainer() instanceof ArtifactPackage)) {
			return false;
		}
		ArtifactPackage container = (ArtifactPackage) getLink().eContainer();
		return ArtifactBaseItemSemanticEditPolicy.getLinkConstraints().canExistArtifactAssetRelationship_4101(container,
				getLink(), source, getNewTarget());
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
		getLink().getSource().remove(getOldSource());
		getLink().getSource().add(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getTarget().remove(getOldTarget());
		getLink().getTarget().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected ArtifactAssetRelationship getLink() {
		return (ArtifactAssetRelationship) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected ArtifactAsset getOldSource() {
		return (ArtifactAsset) oldEnd;
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
	protected ArtifactAsset getOldTarget() {
		return (ArtifactAsset) oldEnd;
	}

	/**
	* @generated
	*/
	protected ArtifactAsset getNewTarget() {
		return (ArtifactAsset) newEnd;
	}
}
