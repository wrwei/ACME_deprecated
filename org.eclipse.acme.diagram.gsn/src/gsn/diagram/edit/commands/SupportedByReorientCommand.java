/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
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
import gsn.SupportedBy;
import gsn.diagram.edit.policies.GsnBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class SupportedByReorientCommand extends EditElementCommand {

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
	public SupportedByReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof SupportedBy) {
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
		return GsnBaseItemSemanticEditPolicy.getLinkConstraints().canExistSupportedBy_4401(container, getLink(),
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
		return GsnBaseItemSemanticEditPolicy.getLinkConstraints().canExistSupportedBy_4401(container, getLink(), source,
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
	protected SupportedBy getLink() {
		return (SupportedBy) getElementToEdit();
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
