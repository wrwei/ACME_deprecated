package artifact.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import artifact.Artifact_Package;
import artifact.diagram.edit.parts.ActivityEditPart;
import artifact.diagram.edit.parts.ArtifactAssetArtifactPropertyEditPart;
import artifact.diagram.edit.parts.ArtifactAssetRelationshipEditPart;
import artifact.diagram.edit.parts.ArtifactEditPart;
import artifact.diagram.edit.parts.ArtifactGroupEditPart;
import artifact.diagram.edit.parts.ArtifactPackageBindingEditPart;
import artifact.diagram.edit.parts.ArtifactPackageCanvasEditPart;
import artifact.diagram.edit.parts.ArtifactPackageEditPart;
import artifact.diagram.edit.parts.ArtifactPackageInterfaceEditPart;
import artifact.diagram.edit.parts.EventEditPart;
import artifact.diagram.edit.parts.ParticipantEditPart;
import artifact.diagram.edit.parts.PropertyEditPart;
import artifact.diagram.edit.parts.ResourceEditPart;
import artifact.diagram.edit.parts.TechniqueEditPart;
import artifact.diagram.part.ArtifactDiagramEditorPlugin;

/**
 * @generated
 */
public class ArtifactElementTypes {

	/**
	* @generated
	*/
	private ArtifactElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ArtifactDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType ArtifactPackage_1002 = getElementType(
			"org.eclipse.acme.sacm.diagram.artifact.ArtifactPackage_1002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ArtifactPackage_2101 = getElementType(
			"org.eclipse.acme.sacm.diagram.artifact.ArtifactPackage_2101"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ArtifactPackageInterface_2102 = getElementType(
			"org.eclipse.acme.sacm.diagram.artifact.ArtifactPackageInterface_2102"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ArtifactPackageBinding_2103 = getElementType(
			"org.eclipse.acme.sacm.diagram.artifact.ArtifactPackageBinding_2103"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ArtifactGroup_2111 = getElementType(
			"org.eclipse.acme.sacm.diagram.artifact.ArtifactGroup_2111"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Technique_2104 = getElementType(
			"org.eclipse.acme.sacm.diagram.artifact.Technique_2104"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Activity_2105 = getElementType(
			"org.eclipse.acme.sacm.diagram.artifact.Activity_2105"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Participant_2106 = getElementType(
			"org.eclipse.acme.sacm.diagram.artifact.Participant_2106"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Artifact_2107 = getElementType(
			"org.eclipse.acme.sacm.diagram.artifact.Artifact_2107"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Resource_2108 = getElementType(
			"org.eclipse.acme.sacm.diagram.artifact.Resource_2108"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Property_2109 = getElementType(
			"org.eclipse.acme.sacm.diagram.artifact.Property_2109"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Event_2110 = getElementType("org.eclipse.acme.sacm.diagram.artifact.Event_2110"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ArtifactAssetRelationship_4101 = getElementType(
			"org.eclipse.acme.sacm.diagram.artifact.ArtifactAssetRelationship_4101"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ArtifactAssetArtifactProperty_4102 = getElementType(
			"org.eclipse.acme.sacm.diagram.artifact.ArtifactAssetArtifactProperty_4102"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ArtifactPackage_1002, Artifact_Package.eINSTANCE.getArtifactPackage());

			elements.put(ArtifactPackage_2101, Artifact_Package.eINSTANCE.getArtifactPackage());

			elements.put(ArtifactPackageInterface_2102, Artifact_Package.eINSTANCE.getArtifactPackageInterface());

			elements.put(ArtifactPackageBinding_2103, Artifact_Package.eINSTANCE.getArtifactPackageBinding());

			elements.put(ArtifactGroup_2111, Artifact_Package.eINSTANCE.getArtifactGroup());

			elements.put(Technique_2104, Artifact_Package.eINSTANCE.getTechnique());

			elements.put(Activity_2105, Artifact_Package.eINSTANCE.getActivity());

			elements.put(Participant_2106, Artifact_Package.eINSTANCE.getParticipant());

			elements.put(Artifact_2107, Artifact_Package.eINSTANCE.getArtifact());

			elements.put(Resource_2108, Artifact_Package.eINSTANCE.getResource());

			elements.put(Property_2109, Artifact_Package.eINSTANCE.getProperty());

			elements.put(Event_2110, Artifact_Package.eINSTANCE.getEvent());

			elements.put(ArtifactAssetRelationship_4101, Artifact_Package.eINSTANCE.getArtifactAssetRelationship());

			elements.put(ArtifactAssetArtifactProperty_4102,
					Artifact_Package.eINSTANCE.getArtifactAsset_ArtifactProperty());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ArtifactPackage_1002);
			KNOWN_ELEMENT_TYPES.add(ArtifactPackage_2101);
			KNOWN_ELEMENT_TYPES.add(ArtifactPackageInterface_2102);
			KNOWN_ELEMENT_TYPES.add(ArtifactPackageBinding_2103);
			KNOWN_ELEMENT_TYPES.add(ArtifactGroup_2111);
			KNOWN_ELEMENT_TYPES.add(Technique_2104);
			KNOWN_ELEMENT_TYPES.add(Activity_2105);
			KNOWN_ELEMENT_TYPES.add(Participant_2106);
			KNOWN_ELEMENT_TYPES.add(Artifact_2107);
			KNOWN_ELEMENT_TYPES.add(Resource_2108);
			KNOWN_ELEMENT_TYPES.add(Property_2109);
			KNOWN_ELEMENT_TYPES.add(Event_2110);
			KNOWN_ELEMENT_TYPES.add(ArtifactAssetRelationship_4101);
			KNOWN_ELEMENT_TYPES.add(ArtifactAssetArtifactProperty_4102);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ArtifactPackageCanvasEditPart.VISUAL_ID:
			return ArtifactPackage_1002;
		case ArtifactPackageEditPart.VISUAL_ID:
			return ArtifactPackage_2101;
		case ArtifactPackageInterfaceEditPart.VISUAL_ID:
			return ArtifactPackageInterface_2102;
		case ArtifactPackageBindingEditPart.VISUAL_ID:
			return ArtifactPackageBinding_2103;
		case ArtifactGroupEditPart.VISUAL_ID:
			return ArtifactGroup_2111;
		case TechniqueEditPart.VISUAL_ID:
			return Technique_2104;
		case ActivityEditPart.VISUAL_ID:
			return Activity_2105;
		case ParticipantEditPart.VISUAL_ID:
			return Participant_2106;
		case ArtifactEditPart.VISUAL_ID:
			return Artifact_2107;
		case ResourceEditPart.VISUAL_ID:
			return Resource_2108;
		case PropertyEditPart.VISUAL_ID:
			return Property_2109;
		case EventEditPart.VISUAL_ID:
			return Event_2110;
		case ArtifactAssetRelationshipEditPart.VISUAL_ID:
			return ArtifactAssetRelationship_4101;
		case ArtifactAssetArtifactPropertyEditPart.VISUAL_ID:
			return ArtifactAssetArtifactProperty_4102;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return artifact.diagram.providers.ArtifactElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return artifact.diagram.providers.ArtifactElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return artifact.diagram.providers.ArtifactElementTypes.getElement(elementTypeAdapter);
		}
	};

}
