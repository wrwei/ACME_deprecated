package argumentation.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import argumentation.ArgumentAsset;
import argumentation.ArgumentPackage;
import argumentation.ArgumentReasoning;
import argumentation.ArgumentationElement;
import argumentation.Argumentation_Package;
import argumentation.ArtifactReference;
import argumentation.AssertedArtifactContext;
import argumentation.AssertedArtifactSupport;
import argumentation.AssertedContext;
import argumentation.AssertedEvidence;
import argumentation.AssertedInference;
import argumentation.AssertedRelationship;
import argumentation.Assertion;
import argumentation.Claim;
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
import argumentation.diagram.providers.ArgumentationElementTypes;

/**
 * @generated
 */
public class ArgumentationDiagramUpdater {

	/**
	* @generated
	*/
	public static List<ArgumentationNodeDescriptor> getSemanticChildren(View view) {
		switch (ArgumentationVisualIDRegistry.getVisualID(view)) {
		case ArgumentPackageCanvasEditPart.VISUAL_ID:
			return getArgumentPackage_1001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ArgumentationNodeDescriptor> getArgumentPackage_1001SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ArgumentPackage modelElement = (ArgumentPackage) view.getElement();
		LinkedList<ArgumentationNodeDescriptor> result = new LinkedList<ArgumentationNodeDescriptor>();
		for (Iterator<?> it = modelElement.getArgumentationElement().iterator(); it.hasNext();) {
			ArgumentationElement childElement = (ArgumentationElement) it.next();
			int visualID = ArgumentationVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ArgumentPackageEditPart.VISUAL_ID) {
				result.add(new ArgumentationNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ArgumentPackageInterfaceEditPart.VISUAL_ID) {
				result.add(new ArgumentationNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ArgumentPackageBindingEditPart.VISUAL_ID) {
				result.add(new ArgumentationNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ArgumentGroupEditPart.VISUAL_ID) {
				result.add(new ArgumentationNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClaimEditPart.VISUAL_ID) {
				result.add(new ArgumentationNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ArtifactReferenceEditPart.VISUAL_ID) {
				result.add(new ArgumentationNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ArgumentReasoningEditPart.VISUAL_ID) {
				result.add(new ArgumentationNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AssertedInferenceEditPart.VISUAL_ID) {
				result.add(new ArgumentationNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AssertedContextEditPart.VISUAL_ID) {
				result.add(new ArgumentationNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AssertedEvidenceEditPart.VISUAL_ID) {
				result.add(new ArgumentationNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AssertedArtifactContextEditPart.VISUAL_ID) {
				result.add(new ArgumentationNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AssertedArtifactSupportEditPart.VISUAL_ID) {
				result.add(new ArgumentationNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ArgumentationLinkDescriptor> getContainedLinks(View view) {
		switch (ArgumentationVisualIDRegistry.getVisualID(view)) {
		case ArgumentPackageCanvasEditPart.VISUAL_ID:
			return getArgumentPackage_1001ContainedLinks(view);
		case ArgumentPackageEditPart.VISUAL_ID:
			return getArgumentPackage_2201ContainedLinks(view);
		case ArgumentPackageInterfaceEditPart.VISUAL_ID:
			return getArgumentPackageInterface_2202ContainedLinks(view);
		case ArgumentPackageBindingEditPart.VISUAL_ID:
			return getArgumentPackageBinding_2203ContainedLinks(view);
		case ArgumentGroupEditPart.VISUAL_ID:
			return getArgumentGroup_2204ContainedLinks(view);
		case ClaimEditPart.VISUAL_ID:
			return getClaim_2205ContainedLinks(view);
		case ArtifactReferenceEditPart.VISUAL_ID:
			return getArtifactReference_2206ContainedLinks(view);
		case ArgumentReasoningEditPart.VISUAL_ID:
			return getArgumentReasoning_2207ContainedLinks(view);
		case AssertedInferenceEditPart.VISUAL_ID:
			return getAssertedInference_2208ContainedLinks(view);
		case AssertedContextEditPart.VISUAL_ID:
			return getAssertedContext_2209ContainedLinks(view);
		case AssertedEvidenceEditPart.VISUAL_ID:
			return getAssertedEvidence_2210ContainedLinks(view);
		case AssertedArtifactContextEditPart.VISUAL_ID:
			return getAssertedArtifactContext_2211ContainedLinks(view);
		case AssertedArtifactSupportEditPart.VISUAL_ID:
			return getAssertedArtifactSupport_2212ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ArgumentationLinkDescriptor> getIncomingLinks(View view) {
		switch (ArgumentationVisualIDRegistry.getVisualID(view)) {
		case ArgumentPackageEditPart.VISUAL_ID:
			return getArgumentPackage_2201IncomingLinks(view);
		case ArgumentPackageInterfaceEditPart.VISUAL_ID:
			return getArgumentPackageInterface_2202IncomingLinks(view);
		case ArgumentPackageBindingEditPart.VISUAL_ID:
			return getArgumentPackageBinding_2203IncomingLinks(view);
		case ArgumentGroupEditPart.VISUAL_ID:
			return getArgumentGroup_2204IncomingLinks(view);
		case ClaimEditPart.VISUAL_ID:
			return getClaim_2205IncomingLinks(view);
		case ArtifactReferenceEditPart.VISUAL_ID:
			return getArtifactReference_2206IncomingLinks(view);
		case ArgumentReasoningEditPart.VISUAL_ID:
			return getArgumentReasoning_2207IncomingLinks(view);
		case AssertedInferenceEditPart.VISUAL_ID:
			return getAssertedInference_2208IncomingLinks(view);
		case AssertedContextEditPart.VISUAL_ID:
			return getAssertedContext_2209IncomingLinks(view);
		case AssertedEvidenceEditPart.VISUAL_ID:
			return getAssertedEvidence_2210IncomingLinks(view);
		case AssertedArtifactContextEditPart.VISUAL_ID:
			return getAssertedArtifactContext_2211IncomingLinks(view);
		case AssertedArtifactSupportEditPart.VISUAL_ID:
			return getAssertedArtifactSupport_2212IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ArgumentationLinkDescriptor> getOutgoingLinks(View view) {
		switch (ArgumentationVisualIDRegistry.getVisualID(view)) {
		case ArgumentPackageEditPart.VISUAL_ID:
			return getArgumentPackage_2201OutgoingLinks(view);
		case ArgumentPackageInterfaceEditPart.VISUAL_ID:
			return getArgumentPackageInterface_2202OutgoingLinks(view);
		case ArgumentPackageBindingEditPart.VISUAL_ID:
			return getArgumentPackageBinding_2203OutgoingLinks(view);
		case ArgumentGroupEditPart.VISUAL_ID:
			return getArgumentGroup_2204OutgoingLinks(view);
		case ClaimEditPart.VISUAL_ID:
			return getClaim_2205OutgoingLinks(view);
		case ArtifactReferenceEditPart.VISUAL_ID:
			return getArtifactReference_2206OutgoingLinks(view);
		case ArgumentReasoningEditPart.VISUAL_ID:
			return getArgumentReasoning_2207OutgoingLinks(view);
		case AssertedInferenceEditPart.VISUAL_ID:
			return getAssertedInference_2208OutgoingLinks(view);
		case AssertedContextEditPart.VISUAL_ID:
			return getAssertedContext_2209OutgoingLinks(view);
		case AssertedEvidenceEditPart.VISUAL_ID:
			return getAssertedEvidence_2210OutgoingLinks(view);
		case AssertedArtifactContextEditPart.VISUAL_ID:
			return getAssertedArtifactContext_2211OutgoingLinks(view);
		case AssertedArtifactSupportEditPart.VISUAL_ID:
			return getAssertedArtifactSupport_2212OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getArgumentPackage_1001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getArgumentPackage_2201ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getArgumentPackageInterface_2202ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getArgumentPackageBinding_2203ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getArgumentGroup_2204ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getClaim_2205ContainedLinks(View view) {
		Claim modelElement = (Claim) view.getElement();
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Assertion_MetaClaim_4201(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getArtifactReference_2206ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getArgumentReasoning_2207ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getAssertedInference_2208ContainedLinks(View view) {
		AssertedInference modelElement = (AssertedInference) view.getElement();
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Assertion_MetaClaim_4201(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Source_4202(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Target_4203(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Reasoning_4204(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getAssertedContext_2209ContainedLinks(View view) {
		AssertedContext modelElement = (AssertedContext) view.getElement();
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Assertion_MetaClaim_4201(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Source_4202(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Target_4203(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Reasoning_4204(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getAssertedEvidence_2210ContainedLinks(View view) {
		AssertedEvidence modelElement = (AssertedEvidence) view.getElement();
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Assertion_MetaClaim_4201(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Source_4202(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Target_4203(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Reasoning_4204(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getAssertedArtifactContext_2211ContainedLinks(View view) {
		AssertedArtifactContext modelElement = (AssertedArtifactContext) view.getElement();
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Assertion_MetaClaim_4201(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Source_4202(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Target_4203(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Reasoning_4204(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getAssertedArtifactSupport_2212ContainedLinks(View view) {
		AssertedArtifactSupport modelElement = (AssertedArtifactSupport) view.getElement();
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Assertion_MetaClaim_4201(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Source_4202(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Target_4203(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Reasoning_4204(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getArgumentPackage_2201IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getArgumentPackageInterface_2202IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getArgumentPackageBinding_2203IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getArgumentGroup_2204IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getClaim_2205IncomingLinks(View view) {
		Claim modelElement = (Claim) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Assertion_MetaClaim_4201(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_AssertedRelationship_Source_4202(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_AssertedRelationship_Target_4203(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getArtifactReference_2206IncomingLinks(View view) {
		ArtifactReference modelElement = (ArtifactReference) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_AssertedRelationship_Source_4202(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_AssertedRelationship_Target_4203(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getArgumentReasoning_2207IncomingLinks(View view) {
		ArgumentReasoning modelElement = (ArgumentReasoning) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_AssertedRelationship_Source_4202(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_AssertedRelationship_Target_4203(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_AssertedRelationship_Reasoning_4204(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getAssertedInference_2208IncomingLinks(View view) {
		AssertedInference modelElement = (AssertedInference) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_AssertedRelationship_Source_4202(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_AssertedRelationship_Target_4203(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getAssertedContext_2209IncomingLinks(View view) {
		AssertedContext modelElement = (AssertedContext) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_AssertedRelationship_Source_4202(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_AssertedRelationship_Target_4203(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getAssertedEvidence_2210IncomingLinks(View view) {
		AssertedEvidence modelElement = (AssertedEvidence) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_AssertedRelationship_Source_4202(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_AssertedRelationship_Target_4203(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getAssertedArtifactContext_2211IncomingLinks(View view) {
		AssertedArtifactContext modelElement = (AssertedArtifactContext) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_AssertedRelationship_Source_4202(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_AssertedRelationship_Target_4203(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getAssertedArtifactSupport_2212IncomingLinks(View view) {
		AssertedArtifactSupport modelElement = (AssertedArtifactSupport) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_AssertedRelationship_Source_4202(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_AssertedRelationship_Target_4203(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getArgumentPackage_2201OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getArgumentPackageInterface_2202OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getArgumentPackageBinding_2203OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getArgumentGroup_2204OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getClaim_2205OutgoingLinks(View view) {
		Claim modelElement = (Claim) view.getElement();
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Assertion_MetaClaim_4201(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getArtifactReference_2206OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getArgumentReasoning_2207OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getAssertedInference_2208OutgoingLinks(View view) {
		AssertedInference modelElement = (AssertedInference) view.getElement();
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Assertion_MetaClaim_4201(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Source_4202(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Target_4203(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Reasoning_4204(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getAssertedContext_2209OutgoingLinks(View view) {
		AssertedContext modelElement = (AssertedContext) view.getElement();
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Assertion_MetaClaim_4201(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Source_4202(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Target_4203(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Reasoning_4204(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getAssertedEvidence_2210OutgoingLinks(View view) {
		AssertedEvidence modelElement = (AssertedEvidence) view.getElement();
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Assertion_MetaClaim_4201(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Source_4202(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Target_4203(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Reasoning_4204(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getAssertedArtifactContext_2211OutgoingLinks(View view) {
		AssertedArtifactContext modelElement = (AssertedArtifactContext) view.getElement();
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Assertion_MetaClaim_4201(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Source_4202(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Target_4203(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Reasoning_4204(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentationLinkDescriptor> getAssertedArtifactSupport_2212OutgoingLinks(View view) {
		AssertedArtifactSupport modelElement = (AssertedArtifactSupport) view.getElement();
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Assertion_MetaClaim_4201(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Source_4202(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Target_4203(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AssertedRelationship_Reasoning_4204(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ArgumentationLinkDescriptor> getIncomingFeatureModelFacetLinks_Assertion_MetaClaim_4201(
			Claim target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Argumentation_Package.eINSTANCE.getAssertion_MetaClaim()) {
				result.add(new ArgumentationLinkDescriptor(setting.getEObject(), target,
						ArgumentationElementTypes.AssertionMetaClaim_4201, AssertionMetaClaimEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ArgumentationLinkDescriptor> getIncomingFeatureModelFacetLinks_AssertedRelationship_Source_4202(
			ArgumentAsset target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Argumentation_Package.eINSTANCE.getAssertedRelationship_Source()) {
				result.add(new ArgumentationLinkDescriptor(setting.getEObject(), target,
						ArgumentationElementTypes.AssertedRelationshipSource_4202,
						AssertedRelationshipSourceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ArgumentationLinkDescriptor> getIncomingFeatureModelFacetLinks_AssertedRelationship_Target_4203(
			ArgumentAsset target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Argumentation_Package.eINSTANCE.getAssertedRelationship_Target()) {
				result.add(new ArgumentationLinkDescriptor(setting.getEObject(), target,
						ArgumentationElementTypes.AssertedRelationshipTarget_4203,
						AssertedRelationshipTargetEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ArgumentationLinkDescriptor> getIncomingFeatureModelFacetLinks_AssertedRelationship_Reasoning_4204(
			ArgumentReasoning target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Argumentation_Package.eINSTANCE
					.getAssertedRelationship_Reasoning()) {
				result.add(new ArgumentationLinkDescriptor(setting.getEObject(), target,
						ArgumentationElementTypes.AssertedRelationshipReasoning_4204,
						AssertedRelationshipReasoningEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ArgumentationLinkDescriptor> getOutgoingFeatureModelFacetLinks_Assertion_MetaClaim_4201(
			Assertion source) {
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		for (Iterator<?> destinations = source.getMetaClaim().iterator(); destinations.hasNext();) {
			Claim destination = (Claim) destinations.next();
			result.add(new ArgumentationLinkDescriptor(source, destination,
					ArgumentationElementTypes.AssertionMetaClaim_4201, AssertionMetaClaimEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ArgumentationLinkDescriptor> getOutgoingFeatureModelFacetLinks_AssertedRelationship_Source_4202(
			AssertedRelationship source) {
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		for (Iterator<?> destinations = source.getSource().iterator(); destinations.hasNext();) {
			ArgumentAsset destination = (ArgumentAsset) destinations.next();
			result.add(new ArgumentationLinkDescriptor(source, destination,
					ArgumentationElementTypes.AssertedRelationshipSource_4202,
					AssertedRelationshipSourceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ArgumentationLinkDescriptor> getOutgoingFeatureModelFacetLinks_AssertedRelationship_Target_4203(
			AssertedRelationship source) {
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		for (Iterator<?> destinations = source.getTarget().iterator(); destinations.hasNext();) {
			ArgumentAsset destination = (ArgumentAsset) destinations.next();
			result.add(new ArgumentationLinkDescriptor(source, destination,
					ArgumentationElementTypes.AssertedRelationshipTarget_4203,
					AssertedRelationshipTargetEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ArgumentationLinkDescriptor> getOutgoingFeatureModelFacetLinks_AssertedRelationship_Reasoning_4204(
			AssertedRelationship source) {
		LinkedList<ArgumentationLinkDescriptor> result = new LinkedList<ArgumentationLinkDescriptor>();
		ArgumentReasoning destination = source.getReasoning();
		if (destination == null) {
			return result;
		}
		result.add(new ArgumentationLinkDescriptor(source, destination,
				ArgumentationElementTypes.AssertedRelationshipReasoning_4204,
				AssertedRelationshipReasoningEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<ArgumentationNodeDescriptor> getSemanticChildren(View view) {
			return ArgumentationDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ArgumentationLinkDescriptor> getContainedLinks(View view) {
			return ArgumentationDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ArgumentationLinkDescriptor> getIncomingLinks(View view) {
			return ArgumentationDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ArgumentationLinkDescriptor> getOutgoingLinks(View view) {
			return ArgumentationDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
