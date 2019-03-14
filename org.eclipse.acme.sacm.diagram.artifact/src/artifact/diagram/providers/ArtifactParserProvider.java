package artifact.diagram.providers;

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

import artifact.diagram.edit.parts.WrappingLabel10EditPart;
import artifact.diagram.edit.parts.WrappingLabel11EditPart;
import artifact.diagram.edit.parts.WrappingLabel12EditPart;
import artifact.diagram.edit.parts.WrappingLabel13EditPart;
import artifact.diagram.edit.parts.WrappingLabel14EditPart;
import artifact.diagram.edit.parts.WrappingLabel15EditPart;
import artifact.diagram.edit.parts.WrappingLabel16EditPart;
import artifact.diagram.edit.parts.WrappingLabel17EditPart;
import artifact.diagram.edit.parts.WrappingLabel18EditPart;
import artifact.diagram.edit.parts.WrappingLabel19EditPart;
import artifact.diagram.edit.parts.WrappingLabel20EditPart;
import artifact.diagram.edit.parts.WrappingLabel21EditPart;
import artifact.diagram.edit.parts.WrappingLabel22EditPart;
import artifact.diagram.edit.parts.WrappingLabel23EditPart;
import artifact.diagram.edit.parts.WrappingLabel2EditPart;
import artifact.diagram.edit.parts.WrappingLabel3EditPart;
import artifact.diagram.edit.parts.WrappingLabel4EditPart;
import artifact.diagram.edit.parts.WrappingLabel5EditPart;
import artifact.diagram.edit.parts.WrappingLabel6EditPart;
import artifact.diagram.edit.parts.WrappingLabel7EditPart;
import artifact.diagram.edit.parts.WrappingLabel8EditPart;
import artifact.diagram.edit.parts.WrappingLabel9EditPart;
import artifact.diagram.edit.parts.WrappingLabelEditPart;
import artifact.diagram.parsers.ActivityDescriptionLabelParser;
import artifact.diagram.parsers.ActivityNameLabelParser;
import artifact.diagram.parsers.ArtifactAssetRelationshipLabelParser;
import artifact.diagram.parsers.ArtifactDescriptionLabelParser;
import artifact.diagram.parsers.ArtifactGroupDescriptionLabelParser;
import artifact.diagram.parsers.ArtifactGroupNameLabelParser;
import artifact.diagram.parsers.ArtifactNameLabelParser;
import artifact.diagram.parsers.ArtifactPackageBindingDescriptionLabelParser;
import artifact.diagram.parsers.ArtifactPackageBindingNameLabelParser;
import artifact.diagram.parsers.ArtifactPackageDescriptionLabelParser;
import artifact.diagram.parsers.ArtifactPackageInterfaceDescriptionLabelParser;
import artifact.diagram.parsers.ArtifactPackageInterfaceNameLabelParser;
import artifact.diagram.parsers.ArtifactPackageNameLabelParser;
import artifact.diagram.parsers.EventDescriptionLabelParser;
import artifact.diagram.parsers.EventNameLabelParser;
import artifact.diagram.parsers.ParticipantDescriptionLabelParser;
import artifact.diagram.parsers.ParticipantNameLabelParser;
import artifact.diagram.parsers.PropertyDescriptionLabelParser;
import artifact.diagram.parsers.PropertyNameLabelParser;
import artifact.diagram.parsers.ResourceDescriptionLabelParser;
import artifact.diagram.parsers.ResourceNameLabelParser;
import artifact.diagram.parsers.TechniqueDescriptionLabelParser;
import artifact.diagram.parsers.TechniqueNameLabelParser;
import artifact.diagram.part.ArtifactVisualIDRegistry;

/**
 * @generated
 */
public class ArtifactParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private ArtifactPackageNameLabelParser artifactPackageLabel_5001Parser;

	/**
	* @generated
	*/
	private IParser getArtifactPackageLabel_5001Parser() {
		if (artifactPackageLabel_5001Parser == null) {
			artifactPackageLabel_5001Parser = new ArtifactPackageNameLabelParser();
		}
		return artifactPackageLabel_5001Parser;
	}

	/**
	* @generated
	*/
	private ArtifactPackageDescriptionLabelParser artifactPackageLabel_5002Parser;

	/**
	* @generated
	*/
	private IParser getArtifactPackageLabel_5002Parser() {
		if (artifactPackageLabel_5002Parser == null) {
			artifactPackageLabel_5002Parser = new ArtifactPackageDescriptionLabelParser();
		}
		return artifactPackageLabel_5002Parser;
	}

	/**
	* @generated
	*/
	private ArtifactPackageInterfaceNameLabelParser artifactPackageInterfaceLabel_5003Parser;

	/**
	* @generated
	*/
	private IParser getArtifactPackageInterfaceLabel_5003Parser() {
		if (artifactPackageInterfaceLabel_5003Parser == null) {
			artifactPackageInterfaceLabel_5003Parser = new ArtifactPackageInterfaceNameLabelParser();
		}
		return artifactPackageInterfaceLabel_5003Parser;
	}

	/**
	* @generated
	*/
	private ArtifactPackageInterfaceDescriptionLabelParser artifactPackageInterfaceLabel_5004Parser;

	/**
	* @generated
	*/
	private IParser getArtifactPackageInterfaceLabel_5004Parser() {
		if (artifactPackageInterfaceLabel_5004Parser == null) {
			artifactPackageInterfaceLabel_5004Parser = new ArtifactPackageInterfaceDescriptionLabelParser();
		}
		return artifactPackageInterfaceLabel_5004Parser;
	}

	/**
	* @generated
	*/
	private ArtifactPackageBindingNameLabelParser artifactPackageBindingLabel_5005Parser;

	/**
	* @generated
	*/
	private IParser getArtifactPackageBindingLabel_5005Parser() {
		if (artifactPackageBindingLabel_5005Parser == null) {
			artifactPackageBindingLabel_5005Parser = new ArtifactPackageBindingNameLabelParser();
		}
		return artifactPackageBindingLabel_5005Parser;
	}

	/**
	* @generated
	*/
	private ArtifactPackageBindingDescriptionLabelParser artifactPackageBindingLabel_5006Parser;

	/**
	* @generated
	*/
	private IParser getArtifactPackageBindingLabel_5006Parser() {
		if (artifactPackageBindingLabel_5006Parser == null) {
			artifactPackageBindingLabel_5006Parser = new ArtifactPackageBindingDescriptionLabelParser();
		}
		return artifactPackageBindingLabel_5006Parser;
	}

	/**
	* @generated
	*/
	private ArtifactGroupNameLabelParser artifactGroupLabel_5021Parser;

	/**
	* @generated
	*/
	private IParser getArtifactGroupLabel_5021Parser() {
		if (artifactGroupLabel_5021Parser == null) {
			artifactGroupLabel_5021Parser = new ArtifactGroupNameLabelParser();
		}
		return artifactGroupLabel_5021Parser;
	}

	/**
	* @generated
	*/
	private ArtifactGroupDescriptionLabelParser artifactGroupLabel_5022Parser;

	/**
	* @generated
	*/
	private IParser getArtifactGroupLabel_5022Parser() {
		if (artifactGroupLabel_5022Parser == null) {
			artifactGroupLabel_5022Parser = new ArtifactGroupDescriptionLabelParser();
		}
		return artifactGroupLabel_5022Parser;
	}

	/**
	* @generated
	*/
	private TechniqueNameLabelParser techniqueLabel_5007Parser;

	/**
	* @generated
	*/
	private IParser getTechniqueLabel_5007Parser() {
		if (techniqueLabel_5007Parser == null) {
			techniqueLabel_5007Parser = new TechniqueNameLabelParser();
		}
		return techniqueLabel_5007Parser;
	}

	/**
	* @generated
	*/
	private TechniqueDescriptionLabelParser techniqueLabel_5023Parser;

	/**
	* @generated
	*/
	private IParser getTechniqueLabel_5023Parser() {
		if (techniqueLabel_5023Parser == null) {
			techniqueLabel_5023Parser = new TechniqueDescriptionLabelParser();
		}
		return techniqueLabel_5023Parser;
	}

	/**
	* @generated
	*/
	private ActivityNameLabelParser activityLabel_5009Parser;

	/**
	* @generated
	*/
	private IParser getActivityLabel_5009Parser() {
		if (activityLabel_5009Parser == null) {
			activityLabel_5009Parser = new ActivityNameLabelParser();
		}
		return activityLabel_5009Parser;
	}

	/**
	* @generated
	*/
	private ActivityDescriptionLabelParser activityLabel_5024Parser;

	/**
	* @generated
	*/
	private IParser getActivityLabel_5024Parser() {
		if (activityLabel_5024Parser == null) {
			activityLabel_5024Parser = new ActivityDescriptionLabelParser();
		}
		return activityLabel_5024Parser;
	}

	/**
	* @generated
	*/
	private ParticipantNameLabelParser participantLabel_5011Parser;

	/**
	* @generated
	*/
	private IParser getParticipantLabel_5011Parser() {
		if (participantLabel_5011Parser == null) {
			participantLabel_5011Parser = new ParticipantNameLabelParser();
		}
		return participantLabel_5011Parser;
	}

	/**
	* @generated
	*/
	private ParticipantDescriptionLabelParser participantLabel_5025Parser;

	/**
	* @generated
	*/
	private IParser getParticipantLabel_5025Parser() {
		if (participantLabel_5025Parser == null) {
			participantLabel_5025Parser = new ParticipantDescriptionLabelParser();
		}
		return participantLabel_5025Parser;
	}

	/**
	* @generated
	*/
	private ArtifactNameLabelParser artifactLabel_5013Parser;

	/**
	* @generated
	*/
	private IParser getArtifactLabel_5013Parser() {
		if (artifactLabel_5013Parser == null) {
			artifactLabel_5013Parser = new ArtifactNameLabelParser();
		}
		return artifactLabel_5013Parser;
	}

	/**
	* @generated
	*/
	private ArtifactDescriptionLabelParser artifactLabel_5026Parser;

	/**
	* @generated
	*/
	private IParser getArtifactLabel_5026Parser() {
		if (artifactLabel_5026Parser == null) {
			artifactLabel_5026Parser = new ArtifactDescriptionLabelParser();
		}
		return artifactLabel_5026Parser;
	}

	/**
	* @generated
	*/
	private ResourceNameLabelParser resourceLabel_5015Parser;

	/**
	* @generated
	*/
	private IParser getResourceLabel_5015Parser() {
		if (resourceLabel_5015Parser == null) {
			resourceLabel_5015Parser = new ResourceNameLabelParser();
		}
		return resourceLabel_5015Parser;
	}

	/**
	* @generated
	*/
	private ResourceDescriptionLabelParser resourceLabel_5027Parser;

	/**
	* @generated
	*/
	private IParser getResourceLabel_5027Parser() {
		if (resourceLabel_5027Parser == null) {
			resourceLabel_5027Parser = new ResourceDescriptionLabelParser();
		}
		return resourceLabel_5027Parser;
	}

	/**
	* @generated
	*/
	private PropertyNameLabelParser propertyLabel_5017Parser;

	/**
	* @generated
	*/
	private IParser getPropertyLabel_5017Parser() {
		if (propertyLabel_5017Parser == null) {
			propertyLabel_5017Parser = new PropertyNameLabelParser();
		}
		return propertyLabel_5017Parser;
	}

	/**
	* @generated
	*/
	private PropertyDescriptionLabelParser propertyLabel_5028Parser;

	/**
	* @generated
	*/
	private IParser getPropertyLabel_5028Parser() {
		if (propertyLabel_5028Parser == null) {
			propertyLabel_5028Parser = new PropertyDescriptionLabelParser();
		}
		return propertyLabel_5028Parser;
	}

	/**
	* @generated
	*/
	private EventNameLabelParser eventLabel_5019Parser;

	/**
	* @generated
	*/
	private IParser getEventLabel_5019Parser() {
		if (eventLabel_5019Parser == null) {
			eventLabel_5019Parser = new EventNameLabelParser();
		}
		return eventLabel_5019Parser;
	}

	/**
	* @generated
	*/
	private EventDescriptionLabelParser eventLabel_5029Parser;

	/**
	* @generated
	*/
	private IParser getEventLabel_5029Parser() {
		if (eventLabel_5029Parser == null) {
			eventLabel_5029Parser = new EventDescriptionLabelParser();
		}
		return eventLabel_5029Parser;
	}

	/**
	* @generated
	*/
	private ArtifactAssetRelationshipLabelParser artifactAssetRelationshipLabel_6001Parser;

	/**
	* @generated
	*/
	private IParser getArtifactAssetRelationshipLabel_6001Parser() {
		if (artifactAssetRelationshipLabel_6001Parser == null) {
			artifactAssetRelationshipLabel_6001Parser = new ArtifactAssetRelationshipLabelParser();
		}
		return artifactAssetRelationshipLabel_6001Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case WrappingLabelEditPart.VISUAL_ID:
			return getArtifactPackageLabel_5001Parser();
		case WrappingLabel2EditPart.VISUAL_ID:
			return getArtifactPackageLabel_5002Parser();
		case WrappingLabel3EditPart.VISUAL_ID:
			return getArtifactPackageInterfaceLabel_5003Parser();
		case WrappingLabel4EditPart.VISUAL_ID:
			return getArtifactPackageInterfaceLabel_5004Parser();
		case WrappingLabel5EditPart.VISUAL_ID:
			return getArtifactPackageBindingLabel_5005Parser();
		case WrappingLabel6EditPart.VISUAL_ID:
			return getArtifactPackageBindingLabel_5006Parser();
		case WrappingLabel21EditPart.VISUAL_ID:
			return getArtifactGroupLabel_5021Parser();
		case WrappingLabel22EditPart.VISUAL_ID:
			return getArtifactGroupLabel_5022Parser();
		case WrappingLabel7EditPart.VISUAL_ID:
			return getTechniqueLabel_5007Parser();
		case WrappingLabel8EditPart.VISUAL_ID:
			return getTechniqueLabel_5023Parser();
		case WrappingLabel9EditPart.VISUAL_ID:
			return getActivityLabel_5009Parser();
		case WrappingLabel10EditPart.VISUAL_ID:
			return getActivityLabel_5024Parser();
		case WrappingLabel11EditPart.VISUAL_ID:
			return getParticipantLabel_5011Parser();
		case WrappingLabel12EditPart.VISUAL_ID:
			return getParticipantLabel_5025Parser();
		case WrappingLabel13EditPart.VISUAL_ID:
			return getArtifactLabel_5013Parser();
		case WrappingLabel14EditPart.VISUAL_ID:
			return getArtifactLabel_5026Parser();
		case WrappingLabel15EditPart.VISUAL_ID:
			return getResourceLabel_5015Parser();
		case WrappingLabel16EditPart.VISUAL_ID:
			return getResourceLabel_5027Parser();
		case WrappingLabel17EditPart.VISUAL_ID:
			return getPropertyLabel_5017Parser();
		case WrappingLabel18EditPart.VISUAL_ID:
			return getPropertyLabel_5028Parser();
		case WrappingLabel19EditPart.VISUAL_ID:
			return getEventLabel_5019Parser();
		case WrappingLabel20EditPart.VISUAL_ID:
			return getEventLabel_5029Parser();
		case WrappingLabel23EditPart.VISUAL_ID:
			return getArtifactAssetRelationshipLabel_6001Parser();
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
			return getParser(ArtifactVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ArtifactVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ArtifactElementTypes.getElement(hint) == null) {
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
