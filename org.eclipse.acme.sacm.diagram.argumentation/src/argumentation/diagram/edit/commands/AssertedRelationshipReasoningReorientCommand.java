package argumentation.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import argumentation.ArgumentReasoning;
import argumentation.AssertedRelationship;
import argumentation.diagram.edit.policies.ArgumentationBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class AssertedRelationshipReasoningReorientCommand extends EditElementCommand {

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
	public AssertedRelationshipReasoningReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (!(oldEnd instanceof ArgumentReasoning && newEnd instanceof AssertedRelationship)) {
			return false;
		}
		return ArgumentationBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAssertedRelationshipReasoning_4204(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ArgumentReasoning && newEnd instanceof ArgumentReasoning)) {
			return false;
		}
		return ArgumentationBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAssertedRelationshipReasoning_4204(getOldSource(), getNewTarget());
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
		getOldSource().setReasoning(null);
		getNewSource().setReasoning(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setReasoning(getNewTarget());
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
	protected ArgumentReasoning getOldTarget() {
		return (ArgumentReasoning) oldEnd;
	}

	/**
	* @generated
	*/
	protected ArgumentReasoning getNewTarget() {
		return (ArgumentReasoning) newEnd;
	}
}
