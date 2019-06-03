package artifact.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import artifact.ArtifactPackage;
import artifact.ArtifactPackageBinding;
import artifact.ArtifactPackageInterface;
import artifact.Artifact_Package;
import artifact.diagram.edit.parts.ActivityEditPart;
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

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ArtifactVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "org.eclipse.acme.sacm.diagram.artifact/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ArtifactPackageCanvasEditPart.MODEL_ID.equals(view.getType())) {
				return ArtifactPackageCanvasEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return artifact.diagram.part.ArtifactVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ArtifactDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (Artifact_Package.eINSTANCE.getArtifactPackage().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ArtifactPackage) domainElement)) {
			return ArtifactPackageCanvasEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = artifact.diagram.part.ArtifactVisualIDRegistry.getModelID(containerView);
		if (!ArtifactPackageCanvasEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ArtifactPackageCanvasEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = artifact.diagram.part.ArtifactVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ArtifactPackageCanvasEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ArtifactPackageCanvasEditPart.VISUAL_ID:
			if (Artifact_Package.eINSTANCE.getArtifactPackage().isSuperTypeOf(domainElement.eClass())
					&& isArtifactPackage_2101((ArtifactPackage) domainElement)) {
				return ArtifactPackageEditPart.VISUAL_ID;
			}
			if (Artifact_Package.eINSTANCE.getArtifactPackageInterface().isSuperTypeOf(domainElement.eClass())) {
				return ArtifactPackageInterfaceEditPart.VISUAL_ID;
			}
			if (Artifact_Package.eINSTANCE.getArtifactPackageBinding().isSuperTypeOf(domainElement.eClass())) {
				return ArtifactPackageBindingEditPart.VISUAL_ID;
			}
			if (Artifact_Package.eINSTANCE.getArtifactGroup().isSuperTypeOf(domainElement.eClass())) {
				return ArtifactGroupEditPart.VISUAL_ID;
			}
			if (Artifact_Package.eINSTANCE.getTechnique().isSuperTypeOf(domainElement.eClass())) {
				return TechniqueEditPart.VISUAL_ID;
			}
			if (Artifact_Package.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
				return ActivityEditPart.VISUAL_ID;
			}
			if (Artifact_Package.eINSTANCE.getParticipant().isSuperTypeOf(domainElement.eClass())) {
				return ParticipantEditPart.VISUAL_ID;
			}
			if (Artifact_Package.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
				return ArtifactEditPart.VISUAL_ID;
			}
			if (Artifact_Package.eINSTANCE.getResource().isSuperTypeOf(domainElement.eClass())) {
				return ResourceEditPart.VISUAL_ID;
			}
			if (Artifact_Package.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass())) {
				return PropertyEditPart.VISUAL_ID;
			}
			if (Artifact_Package.eINSTANCE.getEvent().isSuperTypeOf(domainElement.eClass())) {
				return EventEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = artifact.diagram.part.ArtifactVisualIDRegistry.getModelID(containerView);
		if (!ArtifactPackageCanvasEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ArtifactPackageCanvasEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = artifact.diagram.part.ArtifactVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ArtifactPackageCanvasEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ArtifactPackageCanvasEditPart.VISUAL_ID:
			if (ArtifactPackageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArtifactPackageInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArtifactPackageBindingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArtifactGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TechniqueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParticipantEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArtifactEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArtifactPackageEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArtifactPackageInterfaceEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArtifactPackageBindingEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArtifactGroupEditPart.VISUAL_ID:
			if (WrappingLabel21EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel22EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TechniqueEditPart.VISUAL_ID:
			if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityEditPart.VISUAL_ID:
			if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParticipantEditPart.VISUAL_ID:
			if (WrappingLabel11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArtifactEditPart.VISUAL_ID:
			if (WrappingLabel13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ResourceEditPart.VISUAL_ID:
			if (WrappingLabel15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PropertyEditPart.VISUAL_ID:
			if (WrappingLabel17EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel18EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventEditPart.VISUAL_ID:
			if (WrappingLabel19EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel20EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArtifactAssetRelationshipEditPart.VISUAL_ID:
			if (WrappingLabel23EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (Artifact_Package.eINSTANCE.getArtifactAssetRelationship().isSuperTypeOf(domainElement.eClass())) {
			return ArtifactAssetRelationshipEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ArtifactPackage element) {
		return true;
	}

	/**
	* @generated NOT
	*/
	private static boolean isArtifactPackage_2101(ArtifactPackage domainElement) {
//		Object result = ArtifactOCLFactory.getExpression(0, Artifact_Package.eINSTANCE.getArtifactPackage(), null)
//				.evaluate(domainElement);
//		return result instanceof Boolean && ((Boolean) result).booleanValue();
		return domainElement instanceof ArtifactPackage &&
				!(domainElement instanceof ArtifactPackageInterface) &&
				!(domainElement instanceof ArtifactPackageBinding);
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ArtifactPackageCanvasEditPart.VISUAL_ID:
			return false;
		case ArtifactPackageEditPart.VISUAL_ID:
		case ArtifactPackageInterfaceEditPart.VISUAL_ID:
		case ArtifactPackageBindingEditPart.VISUAL_ID:
		case TechniqueEditPart.VISUAL_ID:
		case ActivityEditPart.VISUAL_ID:
		case ParticipantEditPart.VISUAL_ID:
		case ArtifactEditPart.VISUAL_ID:
		case ResourceEditPart.VISUAL_ID:
		case PropertyEditPart.VISUAL_ID:
		case EventEditPart.VISUAL_ID:
		case ArtifactGroupEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return artifact.diagram.part.ArtifactVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return artifact.diagram.part.ArtifactVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return artifact.diagram.part.ArtifactVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return artifact.diagram.part.ArtifactVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return artifact.diagram.part.ArtifactVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return artifact.diagram.part.ArtifactVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
