package gsn.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import argumentation.ArgumentAsset;
import argumentation.ArgumentPackage;
import gsn.InContextOf;
import gsn.diagram.edit.policies.GsnBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class InContextOfReorientCommand extends EditElementCommand {

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
	public InContextOfReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof InContextOf) {
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
		if (!(oldEnd instanceof ArgumentAsset && newEnd instanceof ArgumentAsset)) {
			return false;
		}
		if (getLink().getTarget().size() != 1) {
			return false;
		}
		ArgumentAsset target = (ArgumentAsset) getLink().getTarget().get(0);
		if (!(getLink().eContainer() instanceof ArgumentPackage)) {
			return false;
		}
		ArgumentPackage container = (ArgumentPackage) getLink().eContainer();
		return GsnBaseItemSemanticEditPolicy.getLinkConstraints().canExistInContextOf_4402(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ArgumentAsset && newEnd instanceof ArgumentAsset)) {
			return false;
		}
		if (getLink().getSource().size() != 1) {
			return false;
		}
		ArgumentAsset source = (ArgumentAsset) getLink().getSource().get(0);
		if (!(getLink().eContainer() instanceof ArgumentPackage)) {
			return false;
		}
		ArgumentPackage container = (ArgumentPackage) getLink().eContainer();
		return GsnBaseItemSemanticEditPolicy.getLinkConstraints().canExistInContextOf_4402(container, getLink(), source,
				getNewTarget());
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
	protected InContextOf getLink() {
		return (InContextOf) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected ArgumentAsset getOldSource() {
		return (ArgumentAsset) oldEnd;
	}

	/**
	* @generated
	*/
	protected ArgumentAsset getNewSource() {
		return (ArgumentAsset) newEnd;
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
