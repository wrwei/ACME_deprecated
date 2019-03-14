package argumentation.diagram.providers;

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

import argumentation.Argumentation_Package;
import argumentation.diagram.edit.parts.ArgumentGroupEditPart;
import argumentation.diagram.edit.parts.ArgumentPackageBindingEditPart;
import argumentation.diagram.edit.parts.ArgumentPackageCanvasEditPart;
import argumentation.diagram.edit.parts.ArgumentPackageEditPart;
import argumentation.diagram.edit.parts.ArgumentPackageInterfaceEditPart;
import argumentation.diagram.edit.parts.ArgumentReasoningEditPart;
import argumentation.diagram.edit.parts.ArtifactReferenceEditPart;
import argumentation.diagram.edit.parts.AssertedArtifactContextEditPart;
import argumentation.diagram.edit.parts.AssertedArtifactSupportEditPart;
import argumentation.diagram.edit.parts.AssertedContextEditPart;
import argumentation.diagram.edit.parts.AssertedEvidenceEditPart;
import argumentation.diagram.edit.parts.AssertedInferenceEditPart;
import argumentation.diagram.edit.parts.AssertedRelationshipReasoningEditPart;
import argumentation.diagram.edit.parts.AssertedRelationshipSourceEditPart;
import argumentation.diagram.edit.parts.AssertedRelationshipTargetEditPart;
import argumentation.diagram.edit.parts.AssertionMetaClaimEditPart;
import argumentation.diagram.edit.parts.ClaimEditPart;
import argumentation.diagram.part.ArgumentationDiagramEditorPlugin;

/**
 * @generated
 */
public class ArgumentationElementTypes {

	/**
	* @generated
	*/
	private ArgumentationElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ArgumentationDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType ArgumentPackage_1001 = getElementType(
			"org.eclipse.acme.sacm.diagram.argumentation.ArgumentPackage_1001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ArgumentPackage_2201 = getElementType(
			"org.eclipse.acme.sacm.diagram.argumentation.ArgumentPackage_2201"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ArgumentPackageInterface_2202 = getElementType(
			"org.eclipse.acme.sacm.diagram.argumentation.ArgumentPackageInterface_2202"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ArgumentPackageBinding_2203 = getElementType(
			"org.eclipse.acme.sacm.diagram.argumentation.ArgumentPackageBinding_2203"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ArgumentGroup_2204 = getElementType(
			"org.eclipse.acme.sacm.diagram.argumentation.ArgumentGroup_2204"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Claim_2205 = getElementType(
			"org.eclipse.acme.sacm.diagram.argumentation.Claim_2205"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ArtifactReference_2206 = getElementType(
			"org.eclipse.acme.sacm.diagram.argumentation.ArtifactReference_2206"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ArgumentReasoning_2207 = getElementType(
			"org.eclipse.acme.sacm.diagram.argumentation.ArgumentReasoning_2207"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AssertedInference_2208 = getElementType(
			"org.eclipse.acme.sacm.diagram.argumentation.AssertedInference_2208"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AssertedContext_2209 = getElementType(
			"org.eclipse.acme.sacm.diagram.argumentation.AssertedContext_2209"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AssertedEvidence_2210 = getElementType(
			"org.eclipse.acme.sacm.diagram.argumentation.AssertedEvidence_2210"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AssertedArtifactContext_2211 = getElementType(
			"org.eclipse.acme.sacm.diagram.argumentation.AssertedArtifactContext_2211"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AssertedArtifactSupport_2212 = getElementType(
			"org.eclipse.acme.sacm.diagram.argumentation.AssertedArtifactSupport_2212"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AssertionMetaClaim_4201 = getElementType(
			"org.eclipse.acme.sacm.diagram.argumentation.AssertionMetaClaim_4201"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AssertedRelationshipSource_4202 = getElementType(
			"org.eclipse.acme.sacm.diagram.argumentation.AssertedRelationshipSource_4202"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AssertedRelationshipTarget_4203 = getElementType(
			"org.eclipse.acme.sacm.diagram.argumentation.AssertedRelationshipTarget_4203"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AssertedRelationshipReasoning_4204 = getElementType(
			"org.eclipse.acme.sacm.diagram.argumentation.AssertedRelationshipReasoning_4204"); //$NON-NLS-1$

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

			elements.put(ArgumentPackage_1001, Argumentation_Package.eINSTANCE.getArgumentPackage());

			elements.put(ArgumentPackage_2201, Argumentation_Package.eINSTANCE.getArgumentPackage());

			elements.put(ArgumentPackageInterface_2202, Argumentation_Package.eINSTANCE.getArgumentPackageInterface());

			elements.put(ArgumentPackageBinding_2203, Argumentation_Package.eINSTANCE.getArgumentPackageBinding());

			elements.put(ArgumentGroup_2204, Argumentation_Package.eINSTANCE.getArgumentGroup());

			elements.put(Claim_2205, Argumentation_Package.eINSTANCE.getClaim());

			elements.put(ArtifactReference_2206, Argumentation_Package.eINSTANCE.getArtifactReference());

			elements.put(ArgumentReasoning_2207, Argumentation_Package.eINSTANCE.getArgumentReasoning());

			elements.put(AssertedInference_2208, Argumentation_Package.eINSTANCE.getAssertedInference());

			elements.put(AssertedContext_2209, Argumentation_Package.eINSTANCE.getAssertedContext());

			elements.put(AssertedEvidence_2210, Argumentation_Package.eINSTANCE.getAssertedEvidence());

			elements.put(AssertedArtifactContext_2211, Argumentation_Package.eINSTANCE.getAssertedArtifactContext());

			elements.put(AssertedArtifactSupport_2212, Argumentation_Package.eINSTANCE.getAssertedArtifactSupport());

			elements.put(AssertionMetaClaim_4201, Argumentation_Package.eINSTANCE.getAssertion_MetaClaim());

			elements.put(AssertedRelationshipSource_4202,
					Argumentation_Package.eINSTANCE.getAssertedRelationship_Source());

			elements.put(AssertedRelationshipTarget_4203,
					Argumentation_Package.eINSTANCE.getAssertedRelationship_Target());

			elements.put(AssertedRelationshipReasoning_4204,
					Argumentation_Package.eINSTANCE.getAssertedRelationship_Reasoning());
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
			KNOWN_ELEMENT_TYPES.add(ArgumentPackage_1001);
			KNOWN_ELEMENT_TYPES.add(ArgumentPackage_2201);
			KNOWN_ELEMENT_TYPES.add(ArgumentPackageInterface_2202);
			KNOWN_ELEMENT_TYPES.add(ArgumentPackageBinding_2203);
			KNOWN_ELEMENT_TYPES.add(ArgumentGroup_2204);
			KNOWN_ELEMENT_TYPES.add(Claim_2205);
			KNOWN_ELEMENT_TYPES.add(ArtifactReference_2206);
			KNOWN_ELEMENT_TYPES.add(ArgumentReasoning_2207);
			KNOWN_ELEMENT_TYPES.add(AssertedInference_2208);
			KNOWN_ELEMENT_TYPES.add(AssertedContext_2209);
			KNOWN_ELEMENT_TYPES.add(AssertedEvidence_2210);
			KNOWN_ELEMENT_TYPES.add(AssertedArtifactContext_2211);
			KNOWN_ELEMENT_TYPES.add(AssertedArtifactSupport_2212);
			KNOWN_ELEMENT_TYPES.add(AssertionMetaClaim_4201);
			KNOWN_ELEMENT_TYPES.add(AssertedRelationshipSource_4202);
			KNOWN_ELEMENT_TYPES.add(AssertedRelationshipTarget_4203);
			KNOWN_ELEMENT_TYPES.add(AssertedRelationshipReasoning_4204);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ArgumentPackageCanvasEditPart.VISUAL_ID:
			return ArgumentPackage_1001;
		case ArgumentPackageEditPart.VISUAL_ID:
			return ArgumentPackage_2201;
		case ArgumentPackageInterfaceEditPart.VISUAL_ID:
			return ArgumentPackageInterface_2202;
		case ArgumentPackageBindingEditPart.VISUAL_ID:
			return ArgumentPackageBinding_2203;
		case ArgumentGroupEditPart.VISUAL_ID:
			return ArgumentGroup_2204;
		case ClaimEditPart.VISUAL_ID:
			return Claim_2205;
		case ArtifactReferenceEditPart.VISUAL_ID:
			return ArtifactReference_2206;
		case ArgumentReasoningEditPart.VISUAL_ID:
			return ArgumentReasoning_2207;
		case AssertedInferenceEditPart.VISUAL_ID:
			return AssertedInference_2208;
		case AssertedContextEditPart.VISUAL_ID:
			return AssertedContext_2209;
		case AssertedEvidenceEditPart.VISUAL_ID:
			return AssertedEvidence_2210;
		case AssertedArtifactContextEditPart.VISUAL_ID:
			return AssertedArtifactContext_2211;
		case AssertedArtifactSupportEditPart.VISUAL_ID:
			return AssertedArtifactSupport_2212;
		case AssertionMetaClaimEditPart.VISUAL_ID:
			return AssertionMetaClaim_4201;
		case AssertedRelationshipSourceEditPart.VISUAL_ID:
			return AssertedRelationshipSource_4202;
		case AssertedRelationshipTargetEditPart.VISUAL_ID:
			return AssertedRelationshipTarget_4203;
		case AssertedRelationshipReasoningEditPart.VISUAL_ID:
			return AssertedRelationshipReasoning_4204;
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
			return argumentation.diagram.providers.ArgumentationElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return argumentation.diagram.providers.ArgumentationElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return argumentation.diagram.providers.ArgumentationElementTypes.getElement(elementTypeAdapter);
		}
	};

}
