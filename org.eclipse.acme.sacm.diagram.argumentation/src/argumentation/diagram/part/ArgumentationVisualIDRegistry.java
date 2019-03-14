package argumentation.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import argumentation.ArgumentPackage;
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
import argumentation.diagram.edit.parts.ClaimEditPart;
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
import argumentation.diagram.expressions.ArgumentationOCLFactory;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ArgumentationVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "org.eclipse.acme.sacm.diagram.argumentation/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ArgumentPackageCanvasEditPart.MODEL_ID.equals(view.getType())) {
				return ArgumentPackageCanvasEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return argumentation.diagram.part.ArgumentationVisualIDRegistry.getVisualID(view.getType());
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
				ArgumentationDiagramEditorPlugin.getInstance()
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
		if (Argumentation_Package.eINSTANCE.getArgumentPackage().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ArgumentPackage) domainElement)) {
			return ArgumentPackageCanvasEditPart.VISUAL_ID;
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
		String containerModelID = argumentation.diagram.part.ArgumentationVisualIDRegistry.getModelID(containerView);
		if (!ArgumentPackageCanvasEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ArgumentPackageCanvasEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = argumentation.diagram.part.ArgumentationVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ArgumentPackageCanvasEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ArgumentPackageCanvasEditPart.VISUAL_ID:
			if (Argumentation_Package.eINSTANCE.getArgumentPackage().isSuperTypeOf(domainElement.eClass())
					&& isArgumentPackage_2201((ArgumentPackage) domainElement)) {
				return ArgumentPackageEditPart.VISUAL_ID;
			}
			if (Argumentation_Package.eINSTANCE.getArgumentPackageInterface().isSuperTypeOf(domainElement.eClass())) {
				return ArgumentPackageInterfaceEditPart.VISUAL_ID;
			}
			if (Argumentation_Package.eINSTANCE.getArgumentPackageBinding().isSuperTypeOf(domainElement.eClass())) {
				return ArgumentPackageBindingEditPart.VISUAL_ID;
			}
			if (Argumentation_Package.eINSTANCE.getArgumentGroup().isSuperTypeOf(domainElement.eClass())) {
				return ArgumentGroupEditPart.VISUAL_ID;
			}
			if (Argumentation_Package.eINSTANCE.getClaim().isSuperTypeOf(domainElement.eClass())) {
				return ClaimEditPart.VISUAL_ID;
			}
			if (Argumentation_Package.eINSTANCE.getArtifactReference().isSuperTypeOf(domainElement.eClass())) {
				return ArtifactReferenceEditPart.VISUAL_ID;
			}
			if (Argumentation_Package.eINSTANCE.getArgumentReasoning().isSuperTypeOf(domainElement.eClass())) {
				return ArgumentReasoningEditPart.VISUAL_ID;
			}
			if (Argumentation_Package.eINSTANCE.getAssertedInference().isSuperTypeOf(domainElement.eClass())) {
				return AssertedInferenceEditPart.VISUAL_ID;
			}
			if (Argumentation_Package.eINSTANCE.getAssertedContext().isSuperTypeOf(domainElement.eClass())) {
				return AssertedContextEditPart.VISUAL_ID;
			}
			if (Argumentation_Package.eINSTANCE.getAssertedEvidence().isSuperTypeOf(domainElement.eClass())) {
				return AssertedEvidenceEditPart.VISUAL_ID;
			}
			if (Argumentation_Package.eINSTANCE.getAssertedArtifactContext().isSuperTypeOf(domainElement.eClass())) {
				return AssertedArtifactContextEditPart.VISUAL_ID;
			}
			if (Argumentation_Package.eINSTANCE.getAssertedArtifactSupport().isSuperTypeOf(domainElement.eClass())) {
				return AssertedArtifactSupportEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = argumentation.diagram.part.ArgumentationVisualIDRegistry.getModelID(containerView);
		if (!ArgumentPackageCanvasEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ArgumentPackageCanvasEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = argumentation.diagram.part.ArgumentationVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ArgumentPackageCanvasEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ArgumentPackageCanvasEditPart.VISUAL_ID:
			if (ArgumentPackageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArgumentPackageInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArgumentPackageBindingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArgumentGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClaimEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArtifactReferenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArgumentReasoningEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssertedInferenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssertedContextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssertedEvidenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssertedArtifactContextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssertedArtifactSupportEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentPackageEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentPackageInterfaceEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentPackageBindingEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentGroupEditPart.VISUAL_ID:
			if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClaimEditPart.VISUAL_ID:
			if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArtifactReferenceEditPart.VISUAL_ID:
			if (WrappingLabel11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentReasoningEditPart.VISUAL_ID:
			if (WrappingLabel13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel14EditPart.VISUAL_ID == nodeVisualID) {
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
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ArgumentPackage element) {
		return true;
	}

	/**
	* @generated
	*/
	private static boolean isArgumentPackage_2201(ArgumentPackage domainElement) {
		Object result = ArgumentationOCLFactory
				.getExpression(0, Argumentation_Package.eINSTANCE.getArgumentPackage(), null).evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
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
		case ArgumentPackageCanvasEditPart.VISUAL_ID:
			return false;
		case ArgumentPackageEditPart.VISUAL_ID:
		case ArgumentPackageInterfaceEditPart.VISUAL_ID:
		case ArgumentPackageBindingEditPart.VISUAL_ID:
		case ArgumentGroupEditPart.VISUAL_ID:
		case ClaimEditPart.VISUAL_ID:
		case ArtifactReferenceEditPart.VISUAL_ID:
		case ArgumentReasoningEditPart.VISUAL_ID:
		case AssertedInferenceEditPart.VISUAL_ID:
		case AssertedContextEditPart.VISUAL_ID:
		case AssertedEvidenceEditPart.VISUAL_ID:
		case AssertedArtifactContextEditPart.VISUAL_ID:
		case AssertedArtifactSupportEditPart.VISUAL_ID:
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
			return argumentation.diagram.part.ArgumentationVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return argumentation.diagram.part.ArgumentationVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return argumentation.diagram.part.ArgumentationVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return argumentation.diagram.part.ArgumentationVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return argumentation.diagram.part.ArgumentationVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return argumentation.diagram.part.ArgumentationVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
