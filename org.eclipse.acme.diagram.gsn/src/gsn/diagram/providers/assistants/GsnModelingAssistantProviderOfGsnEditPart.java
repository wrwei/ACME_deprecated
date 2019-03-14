package gsn.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import gsn.diagram.providers.GsnElementTypes;
import gsn.diagram.providers.GsnModelingAssistantProvider;

/**
 * @generated
 */
public class GsnModelingAssistantProviderOfGsnEditPart extends GsnModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(14);
		types.add(GsnElementTypes.Module_2301);
		types.add(GsnElementTypes.ContractModule_2302);
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
		return types;
	}

}
