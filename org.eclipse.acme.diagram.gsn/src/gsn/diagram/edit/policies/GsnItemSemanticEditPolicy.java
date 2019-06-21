/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package gsn.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import gsn.diagram.edit.commands.AssumptionCreateCommand;
import gsn.diagram.edit.commands.AwayContextCreateCommand;
import gsn.diagram.edit.commands.AwayGoalCreateCommand;
import gsn.diagram.edit.commands.AwaySolutionCreateCommand;
import gsn.diagram.edit.commands.ChoiceNodeCreateCommand;
import gsn.diagram.edit.commands.ContextCreateCommand;
import gsn.diagram.edit.commands.ContractModuleCreateCommand;
import gsn.diagram.edit.commands.ContractModuleReferenceCreateCommand;
import gsn.diagram.edit.commands.GoalCreateCommand;
import gsn.diagram.edit.commands.JustificationCreateCommand;
import gsn.diagram.edit.commands.ModuleCreateCommand;
import gsn.diagram.edit.commands.ModuleReferenceCreateCommand;
import gsn.diagram.edit.commands.SolutionCreateCommand;
import gsn.diagram.edit.commands.StrategyCreateCommand;
import gsn.diagram.providers.GsnElementTypes;

/**
 * @generated
 */
public class GsnItemSemanticEditPolicy extends GsnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GsnItemSemanticEditPolicy() {
		super(GsnElementTypes.ArgumentPackage_1003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GsnElementTypes.Module_2301 == req.getElementType()) {
			return getGEFWrapper(new ModuleCreateCommand(req));
		}
		if (GsnElementTypes.ContractModule_2302 == req.getElementType()) {
			return getGEFWrapper(new ContractModuleCreateCommand(req));
		}
		if (GsnElementTypes.Goal_2303 == req.getElementType()) {
			return getGEFWrapper(new GoalCreateCommand(req));
		}
		if (GsnElementTypes.Strategy_2304 == req.getElementType()) {
			return getGEFWrapper(new StrategyCreateCommand(req));
		}
		if (GsnElementTypes.Solution_2305 == req.getElementType()) {
			return getGEFWrapper(new SolutionCreateCommand(req));
		}
		if (GsnElementTypes.Context_2306 == req.getElementType()) {
			return getGEFWrapper(new ContextCreateCommand(req));
		}
		if (GsnElementTypes.Justification_2307 == req.getElementType()) {
			return getGEFWrapper(new JustificationCreateCommand(req));
		}
		if (GsnElementTypes.Assumption_2308 == req.getElementType()) {
			return getGEFWrapper(new AssumptionCreateCommand(req));
		}
		if (GsnElementTypes.ModuleReference_2309 == req.getElementType()) {
			return getGEFWrapper(new ModuleReferenceCreateCommand(req));
		}
		if (GsnElementTypes.ChoiceNode_2310 == req.getElementType()) {
			return getGEFWrapper(new ChoiceNodeCreateCommand(req));
		}
		if (GsnElementTypes.ContractModuleReference_2311 == req.getElementType()) {
			return getGEFWrapper(new ContractModuleReferenceCreateCommand(req));
		}
		if (GsnElementTypes.AwayGoal_2312 == req.getElementType()) {
			return getGEFWrapper(new AwayGoalCreateCommand(req));
		}
		if (GsnElementTypes.AwayContext_2313 == req.getElementType()) {
			return getGEFWrapper(new AwayContextCreateCommand(req));
		}
		if (GsnElementTypes.AwaySolution_2314 == req.getElementType()) {
			return getGEFWrapper(new AwaySolutionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}
	

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
