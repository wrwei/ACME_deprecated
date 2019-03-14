package gsn.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import gsn.diagram.edit.parts.WrappingLabel10EditPart;
import gsn.diagram.edit.parts.WrappingLabel11EditPart;
import gsn.diagram.edit.parts.WrappingLabel12EditPart;
import gsn.diagram.edit.parts.WrappingLabel13EditPart;
import gsn.diagram.edit.parts.WrappingLabel14EditPart;
import gsn.diagram.edit.parts.WrappingLabel15EditPart;
import gsn.diagram.edit.parts.WrappingLabel16EditPart;
import gsn.diagram.edit.parts.WrappingLabel17EditPart;
import gsn.diagram.edit.parts.WrappingLabel18EditPart;
import gsn.diagram.edit.parts.WrappingLabel19EditPart;
import gsn.diagram.edit.parts.WrappingLabel20EditPart;
import gsn.diagram.edit.parts.WrappingLabel21EditPart;
import gsn.diagram.edit.parts.WrappingLabel22EditPart;
import gsn.diagram.edit.parts.WrappingLabel23EditPart;
import gsn.diagram.edit.parts.WrappingLabel24EditPart;
import gsn.diagram.edit.parts.WrappingLabel25EditPart;
import gsn.diagram.edit.parts.WrappingLabel26EditPart;
import gsn.diagram.edit.parts.WrappingLabel27EditPart;
import gsn.diagram.edit.parts.WrappingLabel28EditPart;
import gsn.diagram.edit.parts.WrappingLabel29EditPart;
import gsn.diagram.edit.parts.WrappingLabel2EditPart;
import gsn.diagram.edit.parts.WrappingLabel30EditPart;
import gsn.diagram.edit.parts.WrappingLabel31EditPart;
import gsn.diagram.edit.parts.WrappingLabel32EditPart;
import gsn.diagram.edit.parts.WrappingLabel3EditPart;
import gsn.diagram.edit.parts.WrappingLabel4EditPart;
import gsn.diagram.edit.parts.WrappingLabel5EditPart;
import gsn.diagram.edit.parts.WrappingLabel6EditPart;
import gsn.diagram.edit.parts.WrappingLabel7EditPart;
import gsn.diagram.edit.parts.WrappingLabel8EditPart;
import gsn.diagram.edit.parts.WrappingLabel9EditPart;
import gsn.diagram.edit.parts.WrappingLabelEditPart;
import gsn.diagram.parsers.AssumptionDescriptionLabelParser;
import gsn.diagram.parsers.AssumptionNameLabelParser;
import gsn.diagram.parsers.AwayContextDescriptionLabelParser;
import gsn.diagram.parsers.AwayContextModuleLabelParser;
import gsn.diagram.parsers.AwayContextNameLabelParser;
import gsn.diagram.parsers.AwayGoalDescriptionLabelParser;
import gsn.diagram.parsers.AwayGoalModuleLabelParser;
import gsn.diagram.parsers.AwayGoalNameLabelParser;
import gsn.diagram.parsers.AwaySolutionDescriptionLabelParser;
import gsn.diagram.parsers.AwaySolutionModuleLabelParser;
import gsn.diagram.parsers.AwaySolutionNameLabelParser;
import gsn.diagram.parsers.ChoiceNodeLabelParser;
import gsn.diagram.parsers.ContextDescriptionLabelParser;
import gsn.diagram.parsers.ContextNameLabelParser;
import gsn.diagram.parsers.ContractModuleDescriptionLabelParser;
import gsn.diagram.parsers.ContractModuleNameLabelParser;
import gsn.diagram.parsers.ContractModuleReferenceDescriptionLabelParser;
import gsn.diagram.parsers.ContractModuleReferenceNameLabelParser;
import gsn.diagram.parsers.GoalDescriptionLabelParser;
import gsn.diagram.parsers.GoalNameLabelParser;
import gsn.diagram.parsers.InContextOfLabelParser;
import gsn.diagram.parsers.JustificationDescriptionLabelParser;
import gsn.diagram.parsers.JustificationNameLabelParser;
import gsn.diagram.parsers.ModuleDescriptionLabelParser;
import gsn.diagram.parsers.ModuleNameLabelParser;
import gsn.diagram.parsers.ModuleReferenceDescriptionLabelParser;
import gsn.diagram.parsers.ModuleReferenceNameLabelParser;
import gsn.diagram.parsers.SolutionDescriptionLabelParser;
import gsn.diagram.parsers.SolutionNameLabelParser;
import gsn.diagram.parsers.StrategyDescriptionLabelParser;
import gsn.diagram.parsers.StrategyNameLabelParser;
import gsn.diagram.parsers.SupportedByLabelParser;
import gsn.diagram.part.GsnVisualIDRegistry;

/**
 * @generated
 */
public class GsnParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private ModuleNameLabelParser moduleLabel_5001Parser;

	/**
	* @generated
	*/
	private IParser getModuleLabel_5001Parser() {
		if (moduleLabel_5001Parser == null) {
			moduleLabel_5001Parser = new ModuleNameLabelParser();
		}
		return moduleLabel_5001Parser;
	}

	/**
	* @generated
	*/
	private ModuleDescriptionLabelParser moduleLabel_5002Parser;

	/**
	* @generated
	*/
	private IParser getModuleLabel_5002Parser() {
		if (moduleLabel_5002Parser == null) {
			moduleLabel_5002Parser = new ModuleDescriptionLabelParser();
		}
		return moduleLabel_5002Parser;
	}

	/**
	* @generated
	*/
	private ContractModuleNameLabelParser contractModuleLabel_5003Parser;

	/**
	* @generated
	*/
	private IParser getContractModuleLabel_5003Parser() {
		if (contractModuleLabel_5003Parser == null) {
			contractModuleLabel_5003Parser = new ContractModuleNameLabelParser();
		}
		return contractModuleLabel_5003Parser;
	}

	/**
	* @generated
	*/
	private ContractModuleDescriptionLabelParser contractModuleLabel_5004Parser;

	/**
	* @generated
	*/
	private IParser getContractModuleLabel_5004Parser() {
		if (contractModuleLabel_5004Parser == null) {
			contractModuleLabel_5004Parser = new ContractModuleDescriptionLabelParser();
		}
		return contractModuleLabel_5004Parser;
	}

	/**
	* @generated
	*/
	private GoalNameLabelParser goalLabel_5005Parser;

	/**
	* @generated
	*/
	private IParser getGoalLabel_5005Parser() {
		if (goalLabel_5005Parser == null) {
			goalLabel_5005Parser = new GoalNameLabelParser();
		}
		return goalLabel_5005Parser;
	}

	/**
	* @generated
	*/
	private GoalDescriptionLabelParser goalLabel_5006Parser;

	/**
	* @generated
	*/
	private IParser getGoalLabel_5006Parser() {
		if (goalLabel_5006Parser == null) {
			goalLabel_5006Parser = new GoalDescriptionLabelParser();
		}
		return goalLabel_5006Parser;
	}

	/**
	* @generated
	*/
	private StrategyNameLabelParser strategyLabel_5007Parser;

	/**
	* @generated
	*/
	private IParser getStrategyLabel_5007Parser() {
		if (strategyLabel_5007Parser == null) {
			strategyLabel_5007Parser = new StrategyNameLabelParser();
		}
		return strategyLabel_5007Parser;
	}

	/**
	* @generated
	*/
	private StrategyDescriptionLabelParser strategyLabel_5008Parser;

	/**
	* @generated
	*/
	private IParser getStrategyLabel_5008Parser() {
		if (strategyLabel_5008Parser == null) {
			strategyLabel_5008Parser = new StrategyDescriptionLabelParser();
		}
		return strategyLabel_5008Parser;
	}

	/**
	* @generated
	*/
	private SolutionNameLabelParser solutionLabel_5009Parser;

	/**
	* @generated
	*/
	private IParser getSolutionLabel_5009Parser() {
		if (solutionLabel_5009Parser == null) {
			solutionLabel_5009Parser = new SolutionNameLabelParser();
		}
		return solutionLabel_5009Parser;
	}

	/**
	* @generated
	*/
	private SolutionDescriptionLabelParser solutionLabel_5010Parser;

	/**
	* @generated
	*/
	private IParser getSolutionLabel_5010Parser() {
		if (solutionLabel_5010Parser == null) {
			solutionLabel_5010Parser = new SolutionDescriptionLabelParser();
		}
		return solutionLabel_5010Parser;
	}

	/**
	* @generated
	*/
	private ContextNameLabelParser contextLabel_5011Parser;

	/**
	* @generated
	*/
	private IParser getContextLabel_5011Parser() {
		if (contextLabel_5011Parser == null) {
			contextLabel_5011Parser = new ContextNameLabelParser();
		}
		return contextLabel_5011Parser;
	}

	/**
	* @generated
	*/
	private ContextDescriptionLabelParser contextLabel_5012Parser;

	/**
	* @generated
	*/
	private IParser getContextLabel_5012Parser() {
		if (contextLabel_5012Parser == null) {
			contextLabel_5012Parser = new ContextDescriptionLabelParser();
		}
		return contextLabel_5012Parser;
	}

	/**
	* @generated
	*/
	private JustificationNameLabelParser justificationLabel_5013Parser;

	/**
	* @generated
	*/
	private IParser getJustificationLabel_5013Parser() {
		if (justificationLabel_5013Parser == null) {
			justificationLabel_5013Parser = new JustificationNameLabelParser();
		}
		return justificationLabel_5013Parser;
	}

	/**
	* @generated
	*/
	private JustificationDescriptionLabelParser justificationLabel_5014Parser;

	/**
	* @generated
	*/
	private IParser getJustificationLabel_5014Parser() {
		if (justificationLabel_5014Parser == null) {
			justificationLabel_5014Parser = new JustificationDescriptionLabelParser();
		}
		return justificationLabel_5014Parser;
	}

	/**
	* @generated
	*/
	private AssumptionNameLabelParser assumptionLabel_5015Parser;

	/**
	* @generated
	*/
	private IParser getAssumptionLabel_5015Parser() {
		if (assumptionLabel_5015Parser == null) {
			assumptionLabel_5015Parser = new AssumptionNameLabelParser();
		}
		return assumptionLabel_5015Parser;
	}

	/**
	* @generated
	*/
	private AssumptionDescriptionLabelParser assumptionLabel_5016Parser;

	/**
	* @generated
	*/
	private IParser getAssumptionLabel_5016Parser() {
		if (assumptionLabel_5016Parser == null) {
			assumptionLabel_5016Parser = new AssumptionDescriptionLabelParser();
		}
		return assumptionLabel_5016Parser;
	}

	/**
	* @generated
	*/
	private ModuleReferenceNameLabelParser moduleReferenceLabel_5017Parser;

	/**
	* @generated
	*/
	private IParser getModuleReferenceLabel_5017Parser() {
		if (moduleReferenceLabel_5017Parser == null) {
			moduleReferenceLabel_5017Parser = new ModuleReferenceNameLabelParser();
		}
		return moduleReferenceLabel_5017Parser;
	}

	/**
	* @generated
	*/
	private ModuleReferenceDescriptionLabelParser moduleReferenceLabel_5018Parser;

	/**
	* @generated
	*/
	private IParser getModuleReferenceLabel_5018Parser() {
		if (moduleReferenceLabel_5018Parser == null) {
			moduleReferenceLabel_5018Parser = new ModuleReferenceDescriptionLabelParser();
		}
		return moduleReferenceLabel_5018Parser;
	}

	/**
	* @generated
	*/
	private ChoiceNodeLabelParser choiceNodeLabel_5019Parser;

	/**
	* @generated
	*/
	private IParser getChoiceNodeLabel_5019Parser() {
		if (choiceNodeLabel_5019Parser == null) {
			choiceNodeLabel_5019Parser = new ChoiceNodeLabelParser();
		}
		return choiceNodeLabel_5019Parser;
	}

	/**
	* @generated
	*/
	private ContractModuleReferenceNameLabelParser contractModuleReferenceLabel_5020Parser;

	/**
	* @generated
	*/
	private IParser getContractModuleReferenceLabel_5020Parser() {
		if (contractModuleReferenceLabel_5020Parser == null) {
			contractModuleReferenceLabel_5020Parser = new ContractModuleReferenceNameLabelParser();
		}
		return contractModuleReferenceLabel_5020Parser;
	}

	/**
	* @generated
	*/
	private ContractModuleReferenceDescriptionLabelParser contractModuleReferenceLabel_5021Parser;

	/**
	* @generated
	*/
	private IParser getContractModuleReferenceLabel_5021Parser() {
		if (contractModuleReferenceLabel_5021Parser == null) {
			contractModuleReferenceLabel_5021Parser = new ContractModuleReferenceDescriptionLabelParser();
		}
		return contractModuleReferenceLabel_5021Parser;
	}

	/**
	* @generated
	*/
	private AwayGoalNameLabelParser awayGoalLabel_5022Parser;

	/**
	* @generated
	*/
	private IParser getAwayGoalLabel_5022Parser() {
		if (awayGoalLabel_5022Parser == null) {
			awayGoalLabel_5022Parser = new AwayGoalNameLabelParser();
		}
		return awayGoalLabel_5022Parser;
	}

	/**
	* @generated
	*/
	private AwayGoalDescriptionLabelParser awayGoalLabel_5023Parser;

	/**
	* @generated
	*/
	private IParser getAwayGoalLabel_5023Parser() {
		if (awayGoalLabel_5023Parser == null) {
			awayGoalLabel_5023Parser = new AwayGoalDescriptionLabelParser();
		}
		return awayGoalLabel_5023Parser;
	}

	/**
	* @generated
	*/
	private AwayGoalModuleLabelParser awayGoalLabel_5024Parser;

	/**
	* @generated
	*/
	private IParser getAwayGoalLabel_5024Parser() {
		if (awayGoalLabel_5024Parser == null) {
			awayGoalLabel_5024Parser = new AwayGoalModuleLabelParser();
		}
		return awayGoalLabel_5024Parser;
	}

	/**
	* @generated
	*/
	private AwayContextNameLabelParser awayContextLabel_5025Parser;

	/**
	* @generated
	*/
	private IParser getAwayContextLabel_5025Parser() {
		if (awayContextLabel_5025Parser == null) {
			awayContextLabel_5025Parser = new AwayContextNameLabelParser();
		}
		return awayContextLabel_5025Parser;
	}

	/**
	* @generated
	*/
	private AwayContextDescriptionLabelParser awayContextLabel_5026Parser;

	/**
	* @generated
	*/
	private IParser getAwayContextLabel_5026Parser() {
		if (awayContextLabel_5026Parser == null) {
			awayContextLabel_5026Parser = new AwayContextDescriptionLabelParser();
		}
		return awayContextLabel_5026Parser;
	}

	/**
	* @generated
	*/
	private AwayContextModuleLabelParser awayContextLabel_5027Parser;

	/**
	* @generated
	*/
	private IParser getAwayContextLabel_5027Parser() {
		if (awayContextLabel_5027Parser == null) {
			awayContextLabel_5027Parser = new AwayContextModuleLabelParser();
		}
		return awayContextLabel_5027Parser;
	}

	/**
	* @generated
	*/
	private AwaySolutionNameLabelParser awaySolutionLabel_5028Parser;

	/**
	* @generated
	*/
	private IParser getAwaySolutionLabel_5028Parser() {
		if (awaySolutionLabel_5028Parser == null) {
			awaySolutionLabel_5028Parser = new AwaySolutionNameLabelParser();
		}
		return awaySolutionLabel_5028Parser;
	}

	/**
	* @generated
	*/
	private AwaySolutionDescriptionLabelParser awaySolutionLabel_5029Parser;

	/**
	* @generated
	*/
	private IParser getAwaySolutionLabel_5029Parser() {
		if (awaySolutionLabel_5029Parser == null) {
			awaySolutionLabel_5029Parser = new AwaySolutionDescriptionLabelParser();
		}
		return awaySolutionLabel_5029Parser;
	}

	/**
	* @generated
	*/
	private AwaySolutionModuleLabelParser awaySolutionLabel_5030Parser;

	/**
	* @generated
	*/
	private IParser getAwaySolutionLabel_5030Parser() {
		if (awaySolutionLabel_5030Parser == null) {
			awaySolutionLabel_5030Parser = new AwaySolutionModuleLabelParser();
		}
		return awaySolutionLabel_5030Parser;
	}

	/**
	* @generated
	*/
	private SupportedByLabelParser supportedByLabel_6001Parser;

	/**
	* @generated
	*/
	private IParser getSupportedByLabel_6001Parser() {
		if (supportedByLabel_6001Parser == null) {
			supportedByLabel_6001Parser = new SupportedByLabelParser();
		}
		return supportedByLabel_6001Parser;
	}

	/**
	* @generated
	*/
	private InContextOfLabelParser inContextOfLabel_6002Parser;

	/**
	* @generated
	*/
	private IParser getInContextOfLabel_6002Parser() {
		if (inContextOfLabel_6002Parser == null) {
			inContextOfLabel_6002Parser = new InContextOfLabelParser();
		}
		return inContextOfLabel_6002Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case WrappingLabelEditPart.VISUAL_ID:
			return getModuleLabel_5001Parser();
		case WrappingLabel2EditPart.VISUAL_ID:
			return getModuleLabel_5002Parser();
		case WrappingLabel3EditPart.VISUAL_ID:
			return getContractModuleLabel_5003Parser();
		case WrappingLabel4EditPart.VISUAL_ID:
			return getContractModuleLabel_5004Parser();
		case WrappingLabel5EditPart.VISUAL_ID:
			return getGoalLabel_5005Parser();
		case WrappingLabel6EditPart.VISUAL_ID:
			return getGoalLabel_5006Parser();
		case WrappingLabel7EditPart.VISUAL_ID:
			return getStrategyLabel_5007Parser();
		case WrappingLabel8EditPart.VISUAL_ID:
			return getStrategyLabel_5008Parser();
		case WrappingLabel9EditPart.VISUAL_ID:
			return getSolutionLabel_5009Parser();
		case WrappingLabel10EditPart.VISUAL_ID:
			return getSolutionLabel_5010Parser();
		case WrappingLabel11EditPart.VISUAL_ID:
			return getContextLabel_5011Parser();
		case WrappingLabel12EditPart.VISUAL_ID:
			return getContextLabel_5012Parser();
		case WrappingLabel13EditPart.VISUAL_ID:
			return getJustificationLabel_5013Parser();
		case WrappingLabel14EditPart.VISUAL_ID:
			return getJustificationLabel_5014Parser();
		case WrappingLabel15EditPart.VISUAL_ID:
			return getAssumptionLabel_5015Parser();
		case WrappingLabel16EditPart.VISUAL_ID:
			return getAssumptionLabel_5016Parser();
		case WrappingLabel17EditPart.VISUAL_ID:
			return getModuleReferenceLabel_5017Parser();
		case WrappingLabel18EditPart.VISUAL_ID:
			return getModuleReferenceLabel_5018Parser();
		case WrappingLabel19EditPart.VISUAL_ID:
			return getChoiceNodeLabel_5019Parser();
		case WrappingLabel20EditPart.VISUAL_ID:
			return getContractModuleReferenceLabel_5020Parser();
		case WrappingLabel21EditPart.VISUAL_ID:
			return getContractModuleReferenceLabel_5021Parser();
		case WrappingLabel22EditPart.VISUAL_ID:
			return getAwayGoalLabel_5022Parser();
		case WrappingLabel23EditPart.VISUAL_ID:
			return getAwayGoalLabel_5023Parser();
		case WrappingLabel24EditPart.VISUAL_ID:
			return getAwayGoalLabel_5024Parser();
		case WrappingLabel25EditPart.VISUAL_ID:
			return getAwayContextLabel_5025Parser();
		case WrappingLabel26EditPart.VISUAL_ID:
			return getAwayContextLabel_5026Parser();
		case WrappingLabel27EditPart.VISUAL_ID:
			return getAwayContextLabel_5027Parser();
		case WrappingLabel28EditPart.VISUAL_ID:
			return getAwaySolutionLabel_5028Parser();
		case WrappingLabel29EditPart.VISUAL_ID:
			return getAwaySolutionLabel_5029Parser();
		case WrappingLabel30EditPart.VISUAL_ID:
			return getAwaySolutionLabel_5030Parser();
		case WrappingLabel31EditPart.VISUAL_ID:
			return getSupportedByLabel_6001Parser();
		case WrappingLabel32EditPart.VISUAL_ID:
			return getInContextOfLabel_6002Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(GsnVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(GsnVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (GsnElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
