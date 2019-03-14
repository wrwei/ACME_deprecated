package argumentation.diagram.providers;

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

import argumentation.diagram.edit.parts.WrappingLabel10EditPart;
import argumentation.diagram.edit.parts.WrappingLabel11EditPart;
import argumentation.diagram.edit.parts.WrappingLabel12EditPart;
import argumentation.diagram.edit.parts.WrappingLabel13EditPart;
import argumentation.diagram.edit.parts.WrappingLabel14EditPart;
import argumentation.diagram.edit.parts.WrappingLabel2EditPart;
import argumentation.diagram.edit.parts.WrappingLabel3EditPart;
import argumentation.diagram.edit.parts.WrappingLabel4EditPart;
import argumentation.diagram.edit.parts.WrappingLabel5EditPart;
import argumentation.diagram.edit.parts.WrappingLabel6EditPart;
import argumentation.diagram.edit.parts.WrappingLabel7EditPart;
import argumentation.diagram.edit.parts.WrappingLabel8EditPart;
import argumentation.diagram.edit.parts.WrappingLabel9EditPart;
import argumentation.diagram.edit.parts.WrappingLabelEditPart;
import argumentation.diagram.parsers.ArgumentGroupDescriptionLabelParser;
import argumentation.diagram.parsers.ArgumentGroupNameLabelParser;
import argumentation.diagram.parsers.ArgumentPackageBindingDescriptionLabelParser;
import argumentation.diagram.parsers.ArgumentPackageBindingNameLabelParser;
import argumentation.diagram.parsers.ArgumentPackageDescriptionLabelParser;
import argumentation.diagram.parsers.ArgumentPackageInterfaceDescriptionLabelParser;
import argumentation.diagram.parsers.ArgumentPackageInterfaceNameLabelParser;
import argumentation.diagram.parsers.ArgumentPackageNameLabelParser;
import argumentation.diagram.parsers.ArgumentReasoningDescriptionLabelParser;
import argumentation.diagram.parsers.ArgumentReasoningNameLabelParser;
import argumentation.diagram.parsers.ArtifactReferenceDescriptionLabelParser;
import argumentation.diagram.parsers.ArtifactReferenceNameLabelParser;
import argumentation.diagram.parsers.ClaimDescriptionLabelParser;
import argumentation.diagram.parsers.ClaimNameLabelParser;
import argumentation.diagram.part.ArgumentationVisualIDRegistry;

/**
 * @generated
 */
public class ArgumentationParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private ArgumentPackageNameLabelParser argumentPackageLabel_5001Parser;

	/**
	* @generated
	*/
	private IParser getArgumentPackageLabel_5001Parser() {
		if (argumentPackageLabel_5001Parser == null) {
			argumentPackageLabel_5001Parser = new ArgumentPackageNameLabelParser();
		}
		return argumentPackageLabel_5001Parser;
	}

	/**
	* @generated
	*/
	private ArgumentPackageDescriptionLabelParser argumentPackageLabel_5002Parser;

	/**
	* @generated
	*/
	private IParser getArgumentPackageLabel_5002Parser() {
		if (argumentPackageLabel_5002Parser == null) {
			argumentPackageLabel_5002Parser = new ArgumentPackageDescriptionLabelParser();
		}
		return argumentPackageLabel_5002Parser;
	}

	/**
	* @generated
	*/
	private ArgumentPackageInterfaceNameLabelParser argumentPackageInterfaceLabel_5003Parser;

	/**
	* @generated
	*/
	private IParser getArgumentPackageInterfaceLabel_5003Parser() {
		if (argumentPackageInterfaceLabel_5003Parser == null) {
			argumentPackageInterfaceLabel_5003Parser = new ArgumentPackageInterfaceNameLabelParser();
		}
		return argumentPackageInterfaceLabel_5003Parser;
	}

	/**
	* @generated
	*/
	private ArgumentPackageInterfaceDescriptionLabelParser argumentPackageInterfaceLabel_5004Parser;

	/**
	* @generated
	*/
	private IParser getArgumentPackageInterfaceLabel_5004Parser() {
		if (argumentPackageInterfaceLabel_5004Parser == null) {
			argumentPackageInterfaceLabel_5004Parser = new ArgumentPackageInterfaceDescriptionLabelParser();
		}
		return argumentPackageInterfaceLabel_5004Parser;
	}

	/**
	* @generated
	*/
	private ArgumentPackageBindingNameLabelParser argumentPackageBindingLabel_5005Parser;

	/**
	* @generated
	*/
	private IParser getArgumentPackageBindingLabel_5005Parser() {
		if (argumentPackageBindingLabel_5005Parser == null) {
			argumentPackageBindingLabel_5005Parser = new ArgumentPackageBindingNameLabelParser();
		}
		return argumentPackageBindingLabel_5005Parser;
	}

	/**
	* @generated
	*/
	private ArgumentPackageBindingDescriptionLabelParser argumentPackageBindingLabel_5006Parser;

	/**
	* @generated
	*/
	private IParser getArgumentPackageBindingLabel_5006Parser() {
		if (argumentPackageBindingLabel_5006Parser == null) {
			argumentPackageBindingLabel_5006Parser = new ArgumentPackageBindingDescriptionLabelParser();
		}
		return argumentPackageBindingLabel_5006Parser;
	}

	/**
	* @generated
	*/
	private ArgumentGroupNameLabelParser argumentGroupLabel_5007Parser;

	/**
	* @generated
	*/
	private IParser getArgumentGroupLabel_5007Parser() {
		if (argumentGroupLabel_5007Parser == null) {
			argumentGroupLabel_5007Parser = new ArgumentGroupNameLabelParser();
		}
		return argumentGroupLabel_5007Parser;
	}

	/**
	* @generated
	*/
	private ArgumentGroupDescriptionLabelParser argumentGroupLabel_5008Parser;

	/**
	* @generated
	*/
	private IParser getArgumentGroupLabel_5008Parser() {
		if (argumentGroupLabel_5008Parser == null) {
			argumentGroupLabel_5008Parser = new ArgumentGroupDescriptionLabelParser();
		}
		return argumentGroupLabel_5008Parser;
	}

	/**
	* @generated
	*/
	private ClaimNameLabelParser claimLabel_5009Parser;

	/**
	* @generated
	*/
	private IParser getClaimLabel_5009Parser() {
		if (claimLabel_5009Parser == null) {
			claimLabel_5009Parser = new ClaimNameLabelParser();
		}
		return claimLabel_5009Parser;
	}

	/**
	* @generated
	*/
	private ClaimDescriptionLabelParser claimLabel_5010Parser;

	/**
	* @generated
	*/
	private IParser getClaimLabel_5010Parser() {
		if (claimLabel_5010Parser == null) {
			claimLabel_5010Parser = new ClaimDescriptionLabelParser();
		}
		return claimLabel_5010Parser;
	}

	/**
	* @generated
	*/
	private ArtifactReferenceNameLabelParser artifactReferenceLabel_5011Parser;

	/**
	* @generated
	*/
	private IParser getArtifactReferenceLabel_5011Parser() {
		if (artifactReferenceLabel_5011Parser == null) {
			artifactReferenceLabel_5011Parser = new ArtifactReferenceNameLabelParser();
		}
		return artifactReferenceLabel_5011Parser;
	}

	/**
	* @generated
	*/
	private ArtifactReferenceDescriptionLabelParser artifactReferenceLabel_5012Parser;

	/**
	* @generated
	*/
	private IParser getArtifactReferenceLabel_5012Parser() {
		if (artifactReferenceLabel_5012Parser == null) {
			artifactReferenceLabel_5012Parser = new ArtifactReferenceDescriptionLabelParser();
		}
		return artifactReferenceLabel_5012Parser;
	}

	/**
	* @generated
	*/
	private ArgumentReasoningNameLabelParser argumentReasoningLabel_5013Parser;

	/**
	* @generated
	*/
	private IParser getArgumentReasoningLabel_5013Parser() {
		if (argumentReasoningLabel_5013Parser == null) {
			argumentReasoningLabel_5013Parser = new ArgumentReasoningNameLabelParser();
		}
		return argumentReasoningLabel_5013Parser;
	}

	/**
	* @generated
	*/
	private ArgumentReasoningDescriptionLabelParser argumentReasoningLabel_5014Parser;

	/**
	* @generated
	*/
	private IParser getArgumentReasoningLabel_5014Parser() {
		if (argumentReasoningLabel_5014Parser == null) {
			argumentReasoningLabel_5014Parser = new ArgumentReasoningDescriptionLabelParser();
		}
		return argumentReasoningLabel_5014Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case WrappingLabelEditPart.VISUAL_ID:
			return getArgumentPackageLabel_5001Parser();
		case WrappingLabel2EditPart.VISUAL_ID:
			return getArgumentPackageLabel_5002Parser();
		case WrappingLabel3EditPart.VISUAL_ID:
			return getArgumentPackageInterfaceLabel_5003Parser();
		case WrappingLabel4EditPart.VISUAL_ID:
			return getArgumentPackageInterfaceLabel_5004Parser();
		case WrappingLabel5EditPart.VISUAL_ID:
			return getArgumentPackageBindingLabel_5005Parser();
		case WrappingLabel6EditPart.VISUAL_ID:
			return getArgumentPackageBindingLabel_5006Parser();
		case WrappingLabel7EditPart.VISUAL_ID:
			return getArgumentGroupLabel_5007Parser();
		case WrappingLabel8EditPart.VISUAL_ID:
			return getArgumentGroupLabel_5008Parser();
		case WrappingLabel9EditPart.VISUAL_ID:
			return getClaimLabel_5009Parser();
		case WrappingLabel10EditPart.VISUAL_ID:
			return getClaimLabel_5010Parser();
		case WrappingLabel11EditPart.VISUAL_ID:
			return getArtifactReferenceLabel_5011Parser();
		case WrappingLabel12EditPart.VISUAL_ID:
			return getArtifactReferenceLabel_5012Parser();
		case WrappingLabel13EditPart.VISUAL_ID:
			return getArgumentReasoningLabel_5013Parser();
		case WrappingLabel14EditPart.VISUAL_ID:
			return getArgumentReasoningLabel_5014Parser();
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
			return getParser(ArgumentationVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ArgumentationVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ArgumentationElementTypes.getElement(hint) == null) {
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
