package gsn.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import gsn.diagram.edit.parts.AssumptionEditPart;
import gsn.diagram.edit.parts.AwayContextEditPart;
import gsn.diagram.edit.parts.AwayGoalEditPart;
import gsn.diagram.edit.parts.AwaySolutionEditPart;
import gsn.diagram.edit.parts.ChoiceNodeEditPart;
import gsn.diagram.edit.parts.ContextEditPart;
import gsn.diagram.edit.parts.ContractModuleReferenceEditPart;
import gsn.diagram.edit.parts.GoalEditPart;
import gsn.diagram.edit.parts.JustificationEditPart;
import gsn.diagram.edit.parts.ModuleReferenceEditPart;
import gsn.diagram.edit.parts.SolutionEditPart;
import gsn.diagram.edit.parts.StrategyEditPart;
import gsn.diagram.providers.GsnElementTypes;
import gsn.diagram.providers.GsnModelingAssistantProvider;

/**
 * @generated
 */
public class GsnModelingAssistantProviderOfContextEditPart extends GsnModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ContextEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ContextEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(GsnElementTypes.SupportedBy_4401);
		types.add(GsnElementTypes.InContextOf_4402);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ContextEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ContextEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof GoalEditPart) {
			types.add(GsnElementTypes.SupportedBy_4401);
		}
		if (targetEditPart instanceof StrategyEditPart) {
			types.add(GsnElementTypes.SupportedBy_4401);
		}
		if (targetEditPart instanceof SolutionEditPart) {
			types.add(GsnElementTypes.SupportedBy_4401);
		}
		if (targetEditPart instanceof ContextEditPart) {
			types.add(GsnElementTypes.SupportedBy_4401);
		}
		if (targetEditPart instanceof JustificationEditPart) {
			types.add(GsnElementTypes.SupportedBy_4401);
		}
		if (targetEditPart instanceof AssumptionEditPart) {
			types.add(GsnElementTypes.SupportedBy_4401);
		}
		if (targetEditPart instanceof ModuleReferenceEditPart) {
			types.add(GsnElementTypes.SupportedBy_4401);
		}
		if (targetEditPart instanceof ChoiceNodeEditPart) {
			types.add(GsnElementTypes.SupportedBy_4401);
		}
		if (targetEditPart instanceof ContractModuleReferenceEditPart) {
			types.add(GsnElementTypes.SupportedBy_4401);
		}
		if (targetEditPart instanceof AwayGoalEditPart) {
			types.add(GsnElementTypes.SupportedBy_4401);
		}
		if (targetEditPart instanceof AwayContextEditPart) {
			types.add(GsnElementTypes.SupportedBy_4401);
		}
		if (targetEditPart instanceof AwaySolutionEditPart) {
			types.add(GsnElementTypes.SupportedBy_4401);
		}
		if (targetEditPart instanceof GoalEditPart) {
			types.add(GsnElementTypes.InContextOf_4402);
		}
		if (targetEditPart instanceof StrategyEditPart) {
			types.add(GsnElementTypes.InContextOf_4402);
		}
		if (targetEditPart instanceof SolutionEditPart) {
			types.add(GsnElementTypes.InContextOf_4402);
		}
		if (targetEditPart instanceof ContextEditPart) {
			types.add(GsnElementTypes.InContextOf_4402);
		}
		if (targetEditPart instanceof JustificationEditPart) {
			types.add(GsnElementTypes.InContextOf_4402);
		}
		if (targetEditPart instanceof AssumptionEditPart) {
			types.add(GsnElementTypes.InContextOf_4402);
		}
		if (targetEditPart instanceof ModuleReferenceEditPart) {
			types.add(GsnElementTypes.InContextOf_4402);
		}
		if (targetEditPart instanceof ChoiceNodeEditPart) {
			types.add(GsnElementTypes.InContextOf_4402);
		}
		if (targetEditPart instanceof ContractModuleReferenceEditPart) {
			types.add(GsnElementTypes.InContextOf_4402);
		}
		if (targetEditPart instanceof AwayGoalEditPart) {
			types.add(GsnElementTypes.InContextOf_4402);
		}
		if (targetEditPart instanceof AwayContextEditPart) {
			types.add(GsnElementTypes.InContextOf_4402);
		}
		if (targetEditPart instanceof AwaySolutionEditPart) {
			types.add(GsnElementTypes.InContextOf_4402);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ContextEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ContextEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == GsnElementTypes.SupportedBy_4401) {
			types.add(GsnElementTypes.Goal_2303);
			types.add(GsnElementTypes.Strategy_2304);
			types.add(GsnElementTypes.Solution_2305);
			types.add(GsnElementTypes.Context_2306);
			types.add(GsnElementTypes.Justification_2307);
			types.add(GsnElementTypes.Assumption_2308);
			types.add(GsnElementTypes.ModuleReference_2309);
			types.add(GsnElementTypes.ChoiceNode_2310);
			types.add(GsnElementTypes.ContractModuleReference_2311);
			types.add(GsnElementTypes.AwayGoal_2312);
			types.add(GsnElementTypes.AwayContext_2313);
			types.add(GsnElementTypes.AwaySolution_2314);
		} else if (relationshipType == GsnElementTypes.InContextOf_4402) {
			types.add(GsnElementTypes.Goal_2303);
			types.add(GsnElementTypes.Strategy_2304);
			types.add(GsnElementTypes.Solution_2305);
			types.add(GsnElementTypes.Context_2306);
			types.add(GsnElementTypes.Justification_2307);
			types.add(GsnElementTypes.Assumption_2308);
			types.add(GsnElementTypes.ModuleReference_2309);
			types.add(GsnElementTypes.ChoiceNode_2310);
			types.add(GsnElementTypes.ContractModuleReference_2311);
			types.add(GsnElementTypes.AwayGoal_2312);
			types.add(GsnElementTypes.AwayContext_2313);
			types.add(GsnElementTypes.AwaySolution_2314);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ContextEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ContextEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(GsnElementTypes.SupportedBy_4401);
		types.add(GsnElementTypes.InContextOf_4402);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ContextEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ContextEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == GsnElementTypes.SupportedBy_4401) {
			types.add(GsnElementTypes.Goal_2303);
			types.add(GsnElementTypes.Strategy_2304);
			types.add(GsnElementTypes.Solution_2305);
			types.add(GsnElementTypes.Context_2306);
			types.add(GsnElementTypes.Justification_2307);
			types.add(GsnElementTypes.Assumption_2308);
			types.add(GsnElementTypes.ModuleReference_2309);
			types.add(GsnElementTypes.ChoiceNode_2310);
			types.add(GsnElementTypes.ContractModuleReference_2311);
			types.add(GsnElementTypes.AwayGoal_2312);
			types.add(GsnElementTypes.AwayContext_2313);
			types.add(GsnElementTypes.AwaySolution_2314);
		} else if (relationshipType == GsnElementTypes.InContextOf_4402) {
			types.add(GsnElementTypes.Goal_2303);
			types.add(GsnElementTypes.Strategy_2304);
			types.add(GsnElementTypes.Solution_2305);
			types.add(GsnElementTypes.Context_2306);
			types.add(GsnElementTypes.Justification_2307);
			types.add(GsnElementTypes.Assumption_2308);
			types.add(GsnElementTypes.ModuleReference_2309);
			types.add(GsnElementTypes.ChoiceNode_2310);
			types.add(GsnElementTypes.ContractModuleReference_2311);
			types.add(GsnElementTypes.AwayGoal_2312);
			types.add(GsnElementTypes.AwayContext_2313);
			types.add(GsnElementTypes.AwaySolution_2314);
		}
		return types;
	}

}
