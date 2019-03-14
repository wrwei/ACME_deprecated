package artifact.diagram.part;

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

import artifact.Activity;
import artifact.Artifact;
import artifact.ArtifactAsset;
import artifact.ArtifactAssetRelationship;
import artifact.ArtifactPackage;
import artifact.ArtifactPackageBinding;
import artifact.ArtifactPackageInterface;
import artifact.Artifact_Package;
import artifact.Event;
import artifact.Participant;
import artifact.Property;
import artifact.Resource;
import artifact.Technique;
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
import artifact.diagram.providers.ArtifactElementTypes;
import base.ArtifactElement;

/**
 * @generated
 */
public class ArtifactDiagramUpdater {

	/**
	* @generated
	*/
	public static List<ArtifactNodeDescriptor> getSemanticChildren(View view) {
		switch (ArtifactVisualIDRegistry.getVisualID(view)) {
		case ArtifactPackageCanvasEditPart.VISUAL_ID:
			return getArtifactPackage_1002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ArtifactNodeDescriptor> getArtifactPackage_1002SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ArtifactPackage modelElement = (ArtifactPackage) view.getElement();
		LinkedList<ArtifactNodeDescriptor> result = new LinkedList<ArtifactNodeDescriptor>();
		for (Iterator<?> it = modelElement.getArtifactElement().iterator(); it.hasNext();) {
			ArtifactElement childElement = (ArtifactElement) it.next();
			int visualID = ArtifactVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ArtifactPackageEditPart.VISUAL_ID) {
				result.add(new ArtifactNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ArtifactPackageInterfaceEditPart.VISUAL_ID) {
				result.add(new ArtifactNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ArtifactPackageBindingEditPart.VISUAL_ID) {
				result.add(new ArtifactNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ArtifactGroupEditPart.VISUAL_ID) {
				result.add(new ArtifactNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TechniqueEditPart.VISUAL_ID) {
				result.add(new ArtifactNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityEditPart.VISUAL_ID) {
				result.add(new ArtifactNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ParticipantEditPart.VISUAL_ID) {
				result.add(new ArtifactNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ArtifactEditPart.VISUAL_ID) {
				result.add(new ArtifactNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ResourceEditPart.VISUAL_ID) {
				result.add(new ArtifactNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PropertyEditPart.VISUAL_ID) {
				result.add(new ArtifactNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventEditPart.VISUAL_ID) {
				result.add(new ArtifactNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ArtifactLinkDescriptor> getContainedLinks(View view) {
		switch (ArtifactVisualIDRegistry.getVisualID(view)) {
		case ArtifactPackageCanvasEditPart.VISUAL_ID:
			return getArtifactPackage_1002ContainedLinks(view);
		case ArtifactPackageEditPart.VISUAL_ID:
			return getArtifactPackage_2101ContainedLinks(view);
		case ArtifactPackageInterfaceEditPart.VISUAL_ID:
			return getArtifactPackageInterface_2102ContainedLinks(view);
		case ArtifactPackageBindingEditPart.VISUAL_ID:
			return getArtifactPackageBinding_2103ContainedLinks(view);
		case ArtifactGroupEditPart.VISUAL_ID:
			return getArtifactGroup_2111ContainedLinks(view);
		case TechniqueEditPart.VISUAL_ID:
			return getTechnique_2104ContainedLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2105ContainedLinks(view);
		case ParticipantEditPart.VISUAL_ID:
			return getParticipant_2106ContainedLinks(view);
		case ArtifactEditPart.VISUAL_ID:
			return getArtifact_2107ContainedLinks(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_2108ContainedLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_2109ContainedLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2110ContainedLinks(view);
		case ArtifactAssetRelationshipEditPart.VISUAL_ID:
			return getArtifactAssetRelationship_4101ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ArtifactLinkDescriptor> getIncomingLinks(View view) {
		switch (ArtifactVisualIDRegistry.getVisualID(view)) {
		case ArtifactPackageEditPart.VISUAL_ID:
			return getArtifactPackage_2101IncomingLinks(view);
		case ArtifactPackageInterfaceEditPart.VISUAL_ID:
			return getArtifactPackageInterface_2102IncomingLinks(view);
		case ArtifactPackageBindingEditPart.VISUAL_ID:
			return getArtifactPackageBinding_2103IncomingLinks(view);
		case ArtifactGroupEditPart.VISUAL_ID:
			return getArtifactGroup_2111IncomingLinks(view);
		case TechniqueEditPart.VISUAL_ID:
			return getTechnique_2104IncomingLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2105IncomingLinks(view);
		case ParticipantEditPart.VISUAL_ID:
			return getParticipant_2106IncomingLinks(view);
		case ArtifactEditPart.VISUAL_ID:
			return getArtifact_2107IncomingLinks(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_2108IncomingLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_2109IncomingLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2110IncomingLinks(view);
		case ArtifactAssetRelationshipEditPart.VISUAL_ID:
			return getArtifactAssetRelationship_4101IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ArtifactLinkDescriptor> getOutgoingLinks(View view) {
		switch (ArtifactVisualIDRegistry.getVisualID(view)) {
		case ArtifactPackageEditPart.VISUAL_ID:
			return getArtifactPackage_2101OutgoingLinks(view);
		case ArtifactPackageInterfaceEditPart.VISUAL_ID:
			return getArtifactPackageInterface_2102OutgoingLinks(view);
		case ArtifactPackageBindingEditPart.VISUAL_ID:
			return getArtifactPackageBinding_2103OutgoingLinks(view);
		case ArtifactGroupEditPart.VISUAL_ID:
			return getArtifactGroup_2111OutgoingLinks(view);
		case TechniqueEditPart.VISUAL_ID:
			return getTechnique_2104OutgoingLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2105OutgoingLinks(view);
		case ParticipantEditPart.VISUAL_ID:
			return getParticipant_2106OutgoingLinks(view);
		case ArtifactEditPart.VISUAL_ID:
			return getArtifact_2107OutgoingLinks(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_2108OutgoingLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_2109OutgoingLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2110OutgoingLinks(view);
		case ArtifactAssetRelationshipEditPart.VISUAL_ID:
			return getArtifactAssetRelationship_4101OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifactPackage_1002ContainedLinks(View view) {
		ArtifactPackage modelElement = (ArtifactPackage) view.getElement();
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ArtifactAssetRelationship_4101(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifactPackage_2101ContainedLinks(View view) {
		ArtifactPackage modelElement = (ArtifactPackage) view.getElement();
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ArtifactAssetRelationship_4101(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifactPackageInterface_2102ContainedLinks(View view) {
		ArtifactPackageInterface modelElement = (ArtifactPackageInterface) view.getElement();
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ArtifactAssetRelationship_4101(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifactPackageBinding_2103ContainedLinks(View view) {
		ArtifactPackageBinding modelElement = (ArtifactPackageBinding) view.getElement();
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ArtifactAssetRelationship_4101(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifactGroup_2111ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getTechnique_2104ContainedLinks(View view) {
		Technique modelElement = (Technique) view.getElement();
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ArtifactAsset_ArtifactProperty_4102(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getActivity_2105ContainedLinks(View view) {
		Activity modelElement = (Activity) view.getElement();
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ArtifactAsset_ArtifactProperty_4102(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getParticipant_2106ContainedLinks(View view) {
		Participant modelElement = (Participant) view.getElement();
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ArtifactAsset_ArtifactProperty_4102(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifact_2107ContainedLinks(View view) {
		Artifact modelElement = (Artifact) view.getElement();
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ArtifactAsset_ArtifactProperty_4102(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getResource_2108ContainedLinks(View view) {
		Resource modelElement = (Resource) view.getElement();
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ArtifactAsset_ArtifactProperty_4102(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getProperty_2109ContainedLinks(View view) {
		Property modelElement = (Property) view.getElement();
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ArtifactAsset_ArtifactProperty_4102(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getEvent_2110ContainedLinks(View view) {
		Event modelElement = (Event) view.getElement();
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ArtifactAsset_ArtifactProperty_4102(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifactAssetRelationship_4101ContainedLinks(View view) {
		ArtifactAssetRelationship modelElement = (ArtifactAssetRelationship) view.getElement();
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ArtifactAsset_ArtifactProperty_4102(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifactPackage_2101IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifactPackageInterface_2102IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifactPackageBinding_2103IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifactGroup_2111IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getTechnique_2104IncomingLinks(View view) {
		Technique modelElement = (Technique) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ArtifactAssetRelationship_4101(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getActivity_2105IncomingLinks(View view) {
		Activity modelElement = (Activity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ArtifactAssetRelationship_4101(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getParticipant_2106IncomingLinks(View view) {
		Participant modelElement = (Participant) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ArtifactAssetRelationship_4101(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifact_2107IncomingLinks(View view) {
		Artifact modelElement = (Artifact) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ArtifactAssetRelationship_4101(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getResource_2108IncomingLinks(View view) {
		Resource modelElement = (Resource) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ArtifactAssetRelationship_4101(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getProperty_2109IncomingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ArtifactAssetRelationship_4101(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_ArtifactAsset_ArtifactProperty_4102(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getEvent_2110IncomingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ArtifactAssetRelationship_4101(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifactAssetRelationship_4101IncomingLinks(View view) {
		ArtifactAssetRelationship modelElement = (ArtifactAssetRelationship) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ArtifactAssetRelationship_4101(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifactPackage_2101OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifactPackageInterface_2102OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifactPackageBinding_2103OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifactGroup_2111OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getTechnique_2104OutgoingLinks(View view) {
		Technique modelElement = (Technique) view.getElement();
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ArtifactAssetRelationship_4101(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ArtifactAsset_ArtifactProperty_4102(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getActivity_2105OutgoingLinks(View view) {
		Activity modelElement = (Activity) view.getElement();
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ArtifactAssetRelationship_4101(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ArtifactAsset_ArtifactProperty_4102(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getParticipant_2106OutgoingLinks(View view) {
		Participant modelElement = (Participant) view.getElement();
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ArtifactAssetRelationship_4101(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ArtifactAsset_ArtifactProperty_4102(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifact_2107OutgoingLinks(View view) {
		Artifact modelElement = (Artifact) view.getElement();
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ArtifactAssetRelationship_4101(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ArtifactAsset_ArtifactProperty_4102(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getResource_2108OutgoingLinks(View view) {
		Resource modelElement = (Resource) view.getElement();
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ArtifactAssetRelationship_4101(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ArtifactAsset_ArtifactProperty_4102(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getProperty_2109OutgoingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ArtifactAssetRelationship_4101(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ArtifactAsset_ArtifactProperty_4102(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getEvent_2110OutgoingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ArtifactAssetRelationship_4101(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ArtifactAsset_ArtifactProperty_4102(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifactAssetRelationship_4101OutgoingLinks(View view) {
		ArtifactAssetRelationship modelElement = (ArtifactAssetRelationship) view.getElement();
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ArtifactAssetRelationship_4101(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ArtifactAsset_ArtifactProperty_4102(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ArtifactLinkDescriptor> getContainedTypeModelFacetLinks_ArtifactAssetRelationship_4101(
			ArtifactPackage container) {
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		for (Iterator<?> links = container.getArtifactElement().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ArtifactAssetRelationship) {
				continue;
			}
			ArtifactAssetRelationship link = (ArtifactAssetRelationship) linkObject;
			if (ArtifactAssetRelationshipEditPart.VISUAL_ID != ArtifactVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTarget();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ArtifactAsset) {
				continue;
			}
			ArtifactAsset dst = (ArtifactAsset) theTarget;
			List sources = link.getSource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ArtifactAsset) {
				continue;
			}
			ArtifactAsset src = (ArtifactAsset) theSource;
			result.add(new ArtifactLinkDescriptor(src, dst, link, ArtifactElementTypes.ArtifactAssetRelationship_4101,
					ArtifactAssetRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ArtifactLinkDescriptor> getIncomingTypeModelFacetLinks_ArtifactAssetRelationship_4101(
			ArtifactAsset target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Artifact_Package.eINSTANCE.getArtifactAssetRelationship_Target()
					|| false == setting.getEObject() instanceof ArtifactAssetRelationship) {
				continue;
			}
			ArtifactAssetRelationship link = (ArtifactAssetRelationship) setting.getEObject();
			if (ArtifactAssetRelationshipEditPart.VISUAL_ID != ArtifactVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getSource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ArtifactAsset) {
				continue;
			}
			ArtifactAsset src = (ArtifactAsset) theSource;
			result.add(new ArtifactLinkDescriptor(src, target, link,
					ArtifactElementTypes.ArtifactAssetRelationship_4101, ArtifactAssetRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ArtifactLinkDescriptor> getIncomingFeatureModelFacetLinks_ArtifactAsset_ArtifactProperty_4102(
			Property target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Artifact_Package.eINSTANCE.getArtifactAsset_ArtifactProperty()) {
				result.add(new ArtifactLinkDescriptor(setting.getEObject(), target,
						ArtifactElementTypes.ArtifactAssetArtifactProperty_4102,
						ArtifactAssetArtifactPropertyEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ArtifactLinkDescriptor> getOutgoingTypeModelFacetLinks_ArtifactAssetRelationship_4101(
			ArtifactAsset source) {
		ArtifactPackage container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ArtifactPackage) {
				container = (ArtifactPackage) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		for (Iterator<?> links = container.getArtifactElement().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ArtifactAssetRelationship) {
				continue;
			}
			ArtifactAssetRelationship link = (ArtifactAssetRelationship) linkObject;
			if (ArtifactAssetRelationshipEditPart.VISUAL_ID != ArtifactVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTarget();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ArtifactAsset) {
				continue;
			}
			ArtifactAsset dst = (ArtifactAsset) theTarget;
			List sources = link.getSource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ArtifactAsset) {
				continue;
			}
			ArtifactAsset src = (ArtifactAsset) theSource;
			if (src != source) {
				continue;
			}
			result.add(new ArtifactLinkDescriptor(src, dst, link, ArtifactElementTypes.ArtifactAssetRelationship_4101,
					ArtifactAssetRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ArtifactLinkDescriptor> getOutgoingFeatureModelFacetLinks_ArtifactAsset_ArtifactProperty_4102(
			ArtifactAsset source) {
		LinkedList<ArtifactLinkDescriptor> result = new LinkedList<ArtifactLinkDescriptor>();
		for (Iterator<?> destinations = source.getArtifactProperty().iterator(); destinations.hasNext();) {
			Property destination = (Property) destinations.next();
			result.add(new ArtifactLinkDescriptor(source, destination,
					ArtifactElementTypes.ArtifactAssetArtifactProperty_4102,
					ArtifactAssetArtifactPropertyEditPart.VISUAL_ID));
		}
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

		public List<ArtifactNodeDescriptor> getSemanticChildren(View view) {
			return ArtifactDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ArtifactLinkDescriptor> getContainedLinks(View view) {
			return ArtifactDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ArtifactLinkDescriptor> getIncomingLinks(View view) {
			return ArtifactDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ArtifactLinkDescriptor> getOutgoingLinks(View view) {
			return ArtifactDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
