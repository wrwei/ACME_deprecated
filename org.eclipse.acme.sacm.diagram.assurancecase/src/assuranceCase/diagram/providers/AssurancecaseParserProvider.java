package assuranceCase.diagram.providers;

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

/**
 * @generated
 */
public class AssurancecaseParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.AssuranceCasePackageNameLabelParser assuranceCasePackageLabel_5001Parser;

	/**
	* @generated
	*/
	private IParser getAssuranceCasePackageLabel_5001Parser() {
		if (assuranceCasePackageLabel_5001Parser == null) {
			assuranceCasePackageLabel_5001Parser = new assuranceCase.diagram.parsers.AssuranceCasePackageNameLabelParser();
		}
		return assuranceCasePackageLabel_5001Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.AssuranceCasePackageDescriptionLabelParser assuranceCasePackageLabel_5002Parser;

	/**
	* @generated
	*/
	private IParser getAssuranceCasePackageLabel_5002Parser() {
		if (assuranceCasePackageLabel_5002Parser == null) {
			assuranceCasePackageLabel_5002Parser = new assuranceCase.diagram.parsers.AssuranceCasePackageDescriptionLabelParser();
		}
		return assuranceCasePackageLabel_5002Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.AssuranceCasePackageBindingNameLabelParser assuranceCasePackageBindingLabel_5035Parser;

	/**
	* @generated
	*/
	private IParser getAssuranceCasePackageBindingLabel_5035Parser() {
		if (assuranceCasePackageBindingLabel_5035Parser == null) {
			assuranceCasePackageBindingLabel_5035Parser = new assuranceCase.diagram.parsers.AssuranceCasePackageBindingNameLabelParser();
		}
		return assuranceCasePackageBindingLabel_5035Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.AssuranceCasePackageBindingDescriptionLabelParser assuranceCasePackageBindingLabel_5036Parser;

	/**
	* @generated
	*/
	private IParser getAssuranceCasePackageBindingLabel_5036Parser() {
		if (assuranceCasePackageBindingLabel_5036Parser == null) {
			assuranceCasePackageBindingLabel_5036Parser = new assuranceCase.diagram.parsers.AssuranceCasePackageBindingDescriptionLabelParser();
		}
		return assuranceCasePackageBindingLabel_5036Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.AssuranceCasePackageInterfaceNameLabelParser assuranceCasePackageInterfaceLabel_5037Parser;

	/**
	* @generated
	*/
	private IParser getAssuranceCasePackageInterfaceLabel_5037Parser() {
		if (assuranceCasePackageInterfaceLabel_5037Parser == null) {
			assuranceCasePackageInterfaceLabel_5037Parser = new assuranceCase.diagram.parsers.AssuranceCasePackageInterfaceNameLabelParser();
		}
		return assuranceCasePackageInterfaceLabel_5037Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.AssuranceCasePackageInterfaceDescriptionLabelParser assuranceCasePackageInterfaceLabel_5038Parser;

	/**
	* @generated
	*/
	private IParser getAssuranceCasePackageInterfaceLabel_5038Parser() {
		if (assuranceCasePackageInterfaceLabel_5038Parser == null) {
			assuranceCasePackageInterfaceLabel_5038Parser = new assuranceCase.diagram.parsers.AssuranceCasePackageInterfaceDescriptionLabelParser();
		}
		return assuranceCasePackageInterfaceLabel_5038Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.ArgumentPackageNameLabelParser argumentPackageLabel_5007Parser;

	/**
	* @generated
	*/
	private IParser getArgumentPackageLabel_5007Parser() {
		if (argumentPackageLabel_5007Parser == null) {
			argumentPackageLabel_5007Parser = new assuranceCase.diagram.parsers.ArgumentPackageNameLabelParser();
		}
		return argumentPackageLabel_5007Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.ArgumentPackageDescriptionLabelParser argumentPackageLabel_5008Parser;

	/**
	* @generated
	*/
	private IParser getArgumentPackageLabel_5008Parser() {
		if (argumentPackageLabel_5008Parser == null) {
			argumentPackageLabel_5008Parser = new assuranceCase.diagram.parsers.ArgumentPackageDescriptionLabelParser();
		}
		return argumentPackageLabel_5008Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.ArgumentPackageBindingNameLabelParser argumentPackageBindingLabel_5003Parser;

	/**
	* @generated
	*/
	private IParser getArgumentPackageBindingLabel_5003Parser() {
		if (argumentPackageBindingLabel_5003Parser == null) {
			argumentPackageBindingLabel_5003Parser = new assuranceCase.diagram.parsers.ArgumentPackageBindingNameLabelParser();
		}
		return argumentPackageBindingLabel_5003Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.ArgumentPackageBindingDescriptionLabelParser argumentPackageBindingLabel_5004Parser;

	/**
	* @generated
	*/
	private IParser getArgumentPackageBindingLabel_5004Parser() {
		if (argumentPackageBindingLabel_5004Parser == null) {
			argumentPackageBindingLabel_5004Parser = new assuranceCase.diagram.parsers.ArgumentPackageBindingDescriptionLabelParser();
		}
		return argumentPackageBindingLabel_5004Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.ArgumentPackageInterfaceNameLabelParser argumentPackageInterfaceLabel_5005Parser;

	/**
	* @generated
	*/
	private IParser getArgumentPackageInterfaceLabel_5005Parser() {
		if (argumentPackageInterfaceLabel_5005Parser == null) {
			argumentPackageInterfaceLabel_5005Parser = new assuranceCase.diagram.parsers.ArgumentPackageInterfaceNameLabelParser();
		}
		return argumentPackageInterfaceLabel_5005Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.ArgumentPackageInterfaceDescriptionLabelParser argumentPackageInterfaceLabel_5006Parser;

	/**
	* @generated
	*/
	private IParser getArgumentPackageInterfaceLabel_5006Parser() {
		if (argumentPackageInterfaceLabel_5006Parser == null) {
			argumentPackageInterfaceLabel_5006Parser = new assuranceCase.diagram.parsers.ArgumentPackageInterfaceDescriptionLabelParser();
		}
		return argumentPackageInterfaceLabel_5006Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.ArtifactPackageNameLabelParser artifactPackageLabel_5013Parser;

	/**
	* @generated
	*/
	private IParser getArtifactPackageLabel_5013Parser() {
		if (artifactPackageLabel_5013Parser == null) {
			artifactPackageLabel_5013Parser = new assuranceCase.diagram.parsers.ArtifactPackageNameLabelParser();
		}
		return artifactPackageLabel_5013Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.ArtifactPackageDescriptionLabelParser artifactPackageLabel_5014Parser;

	/**
	* @generated
	*/
	private IParser getArtifactPackageLabel_5014Parser() {
		if (artifactPackageLabel_5014Parser == null) {
			artifactPackageLabel_5014Parser = new assuranceCase.diagram.parsers.ArtifactPackageDescriptionLabelParser();
		}
		return artifactPackageLabel_5014Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.ArtifactPackageBindingNameLabelParser artifactPackageBindingLabel_5015Parser;

	/**
	* @generated
	*/
	private IParser getArtifactPackageBindingLabel_5015Parser() {
		if (artifactPackageBindingLabel_5015Parser == null) {
			artifactPackageBindingLabel_5015Parser = new assuranceCase.diagram.parsers.ArtifactPackageBindingNameLabelParser();
		}
		return artifactPackageBindingLabel_5015Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.ArtifactPackageBindingDescriptionLabelParser artifactPackageBindingLabel_5016Parser;

	/**
	* @generated
	*/
	private IParser getArtifactPackageBindingLabel_5016Parser() {
		if (artifactPackageBindingLabel_5016Parser == null) {
			artifactPackageBindingLabel_5016Parser = new assuranceCase.diagram.parsers.ArtifactPackageBindingDescriptionLabelParser();
		}
		return artifactPackageBindingLabel_5016Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.ArtifactPackageInterfaceNameLabelParser artifactPackageInterfaceLabel_5017Parser;

	/**
	* @generated
	*/
	private IParser getArtifactPackageInterfaceLabel_5017Parser() {
		if (artifactPackageInterfaceLabel_5017Parser == null) {
			artifactPackageInterfaceLabel_5017Parser = new assuranceCase.diagram.parsers.ArtifactPackageInterfaceNameLabelParser();
		}
		return artifactPackageInterfaceLabel_5017Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.ArtifactPackageInterfaceDescriptionLabelParser artifactPackageInterfaceLabel_5018Parser;

	/**
	* @generated
	*/
	private IParser getArtifactPackageInterfaceLabel_5018Parser() {
		if (artifactPackageInterfaceLabel_5018Parser == null) {
			artifactPackageInterfaceLabel_5018Parser = new assuranceCase.diagram.parsers.ArtifactPackageInterfaceDescriptionLabelParser();
		}
		return artifactPackageInterfaceLabel_5018Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.TerminologyPackageNameLabelParser terminologyPackageLabel_5019Parser;

	/**
	* @generated
	*/
	private IParser getTerminologyPackageLabel_5019Parser() {
		if (terminologyPackageLabel_5019Parser == null) {
			terminologyPackageLabel_5019Parser = new assuranceCase.diagram.parsers.TerminologyPackageNameLabelParser();
		}
		return terminologyPackageLabel_5019Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.TerminologyPackageDescriptionLabelParser terminologyPackageLabel_5020Parser;

	/**
	* @generated
	*/
	private IParser getTerminologyPackageLabel_5020Parser() {
		if (terminologyPackageLabel_5020Parser == null) {
			terminologyPackageLabel_5020Parser = new assuranceCase.diagram.parsers.TerminologyPackageDescriptionLabelParser();
		}
		return terminologyPackageLabel_5020Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.TerminologyPackageInterfaceNameLabelParser terminologyPackageInterfaceLabel_5021Parser;

	/**
	* @generated
	*/
	private IParser getTerminologyPackageInterfaceLabel_5021Parser() {
		if (terminologyPackageInterfaceLabel_5021Parser == null) {
			terminologyPackageInterfaceLabel_5021Parser = new assuranceCase.diagram.parsers.TerminologyPackageInterfaceNameLabelParser();
		}
		return terminologyPackageInterfaceLabel_5021Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.TerminologyPackageInterfaceDescriptionLabelParser terminologyPackageInterfaceLabel_5022Parser;

	/**
	* @generated
	*/
	private IParser getTerminologyPackageInterfaceLabel_5022Parser() {
		if (terminologyPackageInterfaceLabel_5022Parser == null) {
			terminologyPackageInterfaceLabel_5022Parser = new assuranceCase.diagram.parsers.TerminologyPackageInterfaceDescriptionLabelParser();
		}
		return terminologyPackageInterfaceLabel_5022Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.TerminologyPackageBindingNameLabelParser terminologyPackageBindingLabel_5023Parser;

	/**
	* @generated
	*/
	private IParser getTerminologyPackageBindingLabel_5023Parser() {
		if (terminologyPackageBindingLabel_5023Parser == null) {
			terminologyPackageBindingLabel_5023Parser = new assuranceCase.diagram.parsers.TerminologyPackageBindingNameLabelParser();
		}
		return terminologyPackageBindingLabel_5023Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.TerminologyPackageBindingDescriptionLabelParser terminologyPackageBindingLabel_5024Parser;

	/**
	* @generated
	*/
	private IParser getTerminologyPackageBindingLabel_5024Parser() {
		if (terminologyPackageBindingLabel_5024Parser == null) {
			terminologyPackageBindingLabel_5024Parser = new assuranceCase.diagram.parsers.TerminologyPackageBindingDescriptionLabelParser();
		}
		return terminologyPackageBindingLabel_5024Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.ModuleNameLabelParser moduleLabel_5025Parser;

	/**
	* @generated
	*/
	private IParser getModuleLabel_5025Parser() {
		if (moduleLabel_5025Parser == null) {
			moduleLabel_5025Parser = new assuranceCase.diagram.parsers.ModuleNameLabelParser();
		}
		return moduleLabel_5025Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.ModuleDescriptionLabelParser moduleLabel_5026Parser;

	/**
	* @generated
	*/
	private IParser getModuleLabel_5026Parser() {
		if (moduleLabel_5026Parser == null) {
			moduleLabel_5026Parser = new assuranceCase.diagram.parsers.ModuleDescriptionLabelParser();
		}
		return moduleLabel_5026Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.ContractModuleNameLabelParser contractModuleLabel_5027Parser;

	/**
	* @generated
	*/
	private IParser getContractModuleLabel_5027Parser() {
		if (contractModuleLabel_5027Parser == null) {
			contractModuleLabel_5027Parser = new assuranceCase.diagram.parsers.ContractModuleNameLabelParser();
		}
		return contractModuleLabel_5027Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.ContractModuleDescriptionLabelParser contractModuleLabel_5028Parser;

	/**
	* @generated
	*/
	private IParser getContractModuleLabel_5028Parser() {
		if (contractModuleLabel_5028Parser == null) {
			contractModuleLabel_5028Parser = new assuranceCase.diagram.parsers.ContractModuleDescriptionLabelParser();
		}
		return contractModuleLabel_5028Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.CAEModuleNameLabelParser cAEModuleLabel_5029Parser;

	/**
	* @generated
	*/
	private IParser getCAEModuleLabel_5029Parser() {
		if (cAEModuleLabel_5029Parser == null) {
			cAEModuleLabel_5029Parser = new assuranceCase.diagram.parsers.CAEModuleNameLabelParser();
		}
		return cAEModuleLabel_5029Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.CAEModuleDescriptionLabelParser cAEModuleLabel_5030Parser;

	/**
	* @generated
	*/
	private IParser getCAEModuleLabel_5030Parser() {
		if (cAEModuleLabel_5030Parser == null) {
			cAEModuleLabel_5030Parser = new assuranceCase.diagram.parsers.CAEModuleDescriptionLabelParser();
		}
		return cAEModuleLabel_5030Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.CAEModuleInterfaceNameLabelParser cAEModuleInterfaceLabel_5031Parser;

	/**
	* @generated
	*/
	private IParser getCAEModuleInterfaceLabel_5031Parser() {
		if (cAEModuleInterfaceLabel_5031Parser == null) {
			cAEModuleInterfaceLabel_5031Parser = new assuranceCase.diagram.parsers.CAEModuleInterfaceNameLabelParser();
		}
		return cAEModuleInterfaceLabel_5031Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.CAEModuleInterfaceDescriptionLabelParser cAEModuleInterfaceLabel_5032Parser;

	/**
	* @generated
	*/
	private IParser getCAEModuleInterfaceLabel_5032Parser() {
		if (cAEModuleInterfaceLabel_5032Parser == null) {
			cAEModuleInterfaceLabel_5032Parser = new assuranceCase.diagram.parsers.CAEModuleInterfaceDescriptionLabelParser();
		}
		return cAEModuleInterfaceLabel_5032Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.CAEModuleBindingNameLabelParser cAEModuleBindingLabel_5033Parser;

	/**
	* @generated
	*/
	private IParser getCAEModuleBindingLabel_5033Parser() {
		if (cAEModuleBindingLabel_5033Parser == null) {
			cAEModuleBindingLabel_5033Parser = new assuranceCase.diagram.parsers.CAEModuleBindingNameLabelParser();
		}
		return cAEModuleBindingLabel_5033Parser;
	}

	/**
	* @generated
	*/
	private assuranceCase.diagram.parsers.CAEModuleBindingDescriptionLabelParser cAEModuleBindingLabel_5034Parser;

	/**
	* @generated
	*/
	private IParser getCAEModuleBindingLabel_5034Parser() {
		if (cAEModuleBindingLabel_5034Parser == null) {
			cAEModuleBindingLabel_5034Parser = new assuranceCase.diagram.parsers.CAEModuleBindingDescriptionLabelParser();
		}
		return cAEModuleBindingLabel_5034Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case assuranceCase.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getAssuranceCasePackageLabel_5001Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getAssuranceCasePackageLabel_5002Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
			return getAssuranceCasePackageBindingLabel_5035Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
			return getAssuranceCasePackageBindingLabel_5036Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID:
			return getAssuranceCasePackageInterfaceLabel_5037Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID:
			return getAssuranceCasePackageInterfaceLabel_5038Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
			return getArgumentPackageLabel_5007Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
			return getArgumentPackageLabel_5008Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getArgumentPackageBindingLabel_5003Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return getArgumentPackageBindingLabel_5004Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getArgumentPackageInterfaceLabel_5005Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return getArgumentPackageInterfaceLabel_5006Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID:
			return getArtifactPackageLabel_5013Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel14EditPart.VISUAL_ID:
			return getArtifactPackageLabel_5014Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel15EditPart.VISUAL_ID:
			return getArtifactPackageBindingLabel_5015Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel16EditPart.VISUAL_ID:
			return getArtifactPackageBindingLabel_5016Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel17EditPart.VISUAL_ID:
			return getArtifactPackageInterfaceLabel_5017Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel18EditPart.VISUAL_ID:
			return getArtifactPackageInterfaceLabel_5018Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel19EditPart.VISUAL_ID:
			return getTerminologyPackageLabel_5019Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel20EditPart.VISUAL_ID:
			return getTerminologyPackageLabel_5020Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel21EditPart.VISUAL_ID:
			return getTerminologyPackageInterfaceLabel_5021Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel22EditPart.VISUAL_ID:
			return getTerminologyPackageInterfaceLabel_5022Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel23EditPart.VISUAL_ID:
			return getTerminologyPackageBindingLabel_5023Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel24EditPart.VISUAL_ID:
			return getTerminologyPackageBindingLabel_5024Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel25EditPart.VISUAL_ID:
			return getModuleLabel_5025Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel26EditPart.VISUAL_ID:
			return getModuleLabel_5026Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel27EditPart.VISUAL_ID:
			return getContractModuleLabel_5027Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel28EditPart.VISUAL_ID:
			return getContractModuleLabel_5028Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel29EditPart.VISUAL_ID:
			return getCAEModuleLabel_5029Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel30EditPart.VISUAL_ID:
			return getCAEModuleLabel_5030Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel31EditPart.VISUAL_ID:
			return getCAEModuleInterfaceLabel_5031Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel32EditPart.VISUAL_ID:
			return getCAEModuleInterfaceLabel_5032Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel33EditPart.VISUAL_ID:
			return getCAEModuleBindingLabel_5033Parser();
		case assuranceCase.diagram.edit.parts.WrappingLabel34EditPart.VISUAL_ID:
			return getCAEModuleBindingLabel_5034Parser();
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
			return getParser(assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (assuranceCase.diagram.providers.AssurancecaseElementTypes.getElement(hint) == null) {
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
