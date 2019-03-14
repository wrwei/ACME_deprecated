package argumentation.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import argumentation.ArgumentAsset;
import argumentation.AssertedRelationship;
import argumentation.diagram.edit.policies.ArgumentationBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class AssertedRelationshipTargetReorientCommand extends EditElementCommand {

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
	public AssertedRelationshipTargetReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof AssertedRelationship) {
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
		if (!(oldEnd instanceof ArgumentAsset && newEnd instanceof AssertedRelationship)) {
			return false;
		}
		return ArgumentationBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAssertedRelationshipTarget_4203(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ArgumentAsset && newEnd instanceof ArgumentAsset)) {
			return false;
		}
		return ArgumentationBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAssertedRelationshipTarget_4203(getOldSource(), getNewTarget());
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
		getOldSource().getTarget().remove(getOldTarget());
		getNewSource().getTarget().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getTarget().remove(getOldTarget());
		getOldSource().getTarget().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected AssertedRelationship getOldSource() {
		return (AssertedRelationship) referenceOwner;
	}

	/**
	* @generated
	*/
	protected AssertedRelationship getNewSource() {
		return (AssertedRelationship) newEnd;
	}

	/**
	* @generated
	*/
	protected ArgumentAsset getOldTarget() {
		return (ArgumentAsset) oldEnd;
	}

	/**
	* @generated
	*/
	protected ArgumentAsset getNewTarget() {
		return (ArgumentAsset) newEnd;
	}
}
