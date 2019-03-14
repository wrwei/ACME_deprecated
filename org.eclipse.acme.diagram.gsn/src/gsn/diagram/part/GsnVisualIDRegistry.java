package gsn.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import argumentation.ArgumentPackage;
import argumentation.Argumentation_Package;
import gsn.Gsn_Package;
import gsn.Module;
import gsn.diagram.edit.parts.AssumptionEditPart;
import gsn.diagram.edit.parts.AwayContextEditPart;
import gsn.diagram.edit.parts.AwayGoalEditPart;
import gsn.diagram.edit.parts.AwaySolutionEditPart;
import gsn.diagram.edit.parts.ChoiceNodeEditPart;
import gsn.diagram.edit.parts.ContextEditPart;
import gsn.diagram.edit.parts.ContractModuleEditPart;
import gsn.diagram.edit.parts.ContractModuleReferenceEditPart;
import gsn.diagram.edit.parts.GoalEditPart;
import gsn.diagram.edit.parts.GsnEditPart;
import gsn.diagram.edit.parts.InContextOfEditPart;
import gsn.diagram.edit.parts.JustificationEditPart;
import gsn.diagram.edit.parts.ModuleEditPart;
import gsn.diagram.edit.parts.ModuleReferenceEditPart;
import gsn.diagram.edit.parts.SolutionEditPart;
import gsn.diagram.edit.parts.StrategyEditPart;
import gsn.diagram.edit.parts.SupportedByEditPart;
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

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class GsnVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "org.eclipse.acme.diagram.gsn/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (GsnEditPart.MODEL_ID.equals(view.getType())) {
				return GsnEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return gsn.diagram.part.GsnVisualIDRegistry.getVisualID(view.getType());
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
				GsnDiagramEditorPlugin.getInstance()
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
			return GsnEditPart.VISUAL_ID;
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
		String containerModelID = gsn.diagram.part.GsnVisualIDRegistry.getModelID(containerView);
		if (!GsnEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (GsnEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = gsn.diagram.part.GsnVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GsnEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case GsnEditPart.VISUAL_ID:
			if (Gsn_Package.eINSTANCE.getModule().isSuperTypeOf(domainElement.eClass())) {
				return ModuleEditPart.VISUAL_ID;
			}
			if (Gsn_Package.eINSTANCE.getContractModule().isSuperTypeOf(domainElement.eClass())) {
				return ContractModuleEditPart.VISUAL_ID;
			}
			if (Gsn_Package.eINSTANCE.getGoal().isSuperTypeOf(domainElement.eClass())) {
				return GoalEditPart.VISUAL_ID;
			}
			if (Gsn_Package.eINSTANCE.getStrategy().isSuperTypeOf(domainElement.eClass())) {
				return StrategyEditPart.VISUAL_ID;
			}
			if (Gsn_Package.eINSTANCE.getSolution().isSuperTypeOf(domainElement.eClass())) {
				return SolutionEditPart.VISUAL_ID;
			}
			if (Gsn_Package.eINSTANCE.getContext().isSuperTypeOf(domainElement.eClass())) {
				return ContextEditPart.VISUAL_ID;
			}
			if (Gsn_Package.eINSTANCE.getJustification().isSuperTypeOf(domainElement.eClass())) {
				return JustificationEditPart.VISUAL_ID;
			}
			if (Gsn_Package.eINSTANCE.getAssumption().isSuperTypeOf(domainElement.eClass())) {
				return AssumptionEditPart.VISUAL_ID;
			}
			if (Gsn_Package.eINSTANCE.getModuleReference().isSuperTypeOf(domainElement.eClass())) {
				return ModuleReferenceEditPart.VISUAL_ID;
			}
			if (Gsn_Package.eINSTANCE.getChoiceNode().isSuperTypeOf(domainElement.eClass())) {
				return ChoiceNodeEditPart.VISUAL_ID;
			}
			if (Gsn_Package.eINSTANCE.getContractModuleReference().isSuperTypeOf(domainElement.eClass())) {
				return ContractModuleReferenceEditPart.VISUAL_ID;
			}
			if (Gsn_Package.eINSTANCE.getAwayGoal().isSuperTypeOf(domainElement.eClass())) {
				return AwayGoalEditPart.VISUAL_ID;
			}
			if (Gsn_Package.eINSTANCE.getAwayContext().isSuperTypeOf(domainElement.eClass())) {
				return AwayContextEditPart.VISUAL_ID;
			}
			if (Gsn_Package.eINSTANCE.getAwaySolution().isSuperTypeOf(domainElement.eClass())) {
				return AwaySolutionEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = gsn.diagram.part.GsnVisualIDRegistry.getModelID(containerView);
		if (!GsnEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (GsnEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = gsn.diagram.part.GsnVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GsnEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case GsnEditPart.VISUAL_ID:
			if (ModuleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContractModuleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GoalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StrategyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SolutionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JustificationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssumptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ModuleReferenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ChoiceNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContractModuleReferenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AwayGoalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AwayContextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AwaySolutionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModuleEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContractModuleEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GoalEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StrategyEditPart.VISUAL_ID:
			if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SolutionEditPart.VISUAL_ID:
			if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContextEditPart.VISUAL_ID:
			if (WrappingLabel11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case JustificationEditPart.VISUAL_ID:
			if (WrappingLabel13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssumptionEditPart.VISUAL_ID:
			if (WrappingLabel15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModuleReferenceEditPart.VISUAL_ID:
			if (WrappingLabel17EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel18EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ChoiceNodeEditPart.VISUAL_ID:
			if (WrappingLabel19EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContractModuleReferenceEditPart.VISUAL_ID:
			if (WrappingLabel20EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel21EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AwayGoalEditPart.VISUAL_ID:
			if (WrappingLabel22EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel23EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel24EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AwayContextEditPart.VISUAL_ID:
			if (WrappingLabel25EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel26EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel27EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AwaySolutionEditPart.VISUAL_ID:
			if (WrappingLabel28EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel29EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel30EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SupportedByEditPart.VISUAL_ID:
			if (WrappingLabel31EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InContextOfEditPart.VISUAL_ID:
			if (WrappingLabel32EditPart.VISUAL_ID == nodeVisualID) {
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
		if (Gsn_Package.eINSTANCE.getSupportedBy().isSuperTypeOf(domainElement.eClass())) {
			return SupportedByEditPart.VISUAL_ID;
		}
		if (Gsn_Package.eINSTANCE.getInContextOf().isSuperTypeOf(domainElement.eClass())) {
			return InContextOfEditPart.VISUAL_ID;
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
		case GsnEditPart.VISUAL_ID:
			return false;
		case ModuleEditPart.VISUAL_ID:
		case ContractModuleEditPart.VISUAL_ID:
		case GoalEditPart.VISUAL_ID:
		case StrategyEditPart.VISUAL_ID:
		case SolutionEditPart.VISUAL_ID:
		case ContextEditPart.VISUAL_ID:
		case JustificationEditPart.VISUAL_ID:
		case AssumptionEditPart.VISUAL_ID:
		case ModuleReferenceEditPart.VISUAL_ID:
		case ChoiceNodeEditPart.VISUAL_ID:
		case ContractModuleReferenceEditPart.VISUAL_ID:
		case AwayGoalEditPart.VISUAL_ID:
		case AwayContextEditPart.VISUAL_ID:
		case AwaySolutionEditPart.VISUAL_ID:
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
			return gsn.diagram.part.GsnVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return gsn.diagram.part.GsnVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return gsn.diagram.part.GsnVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return gsn.diagram.part.GsnVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return gsn.diagram.part.GsnVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return gsn.diagram.part.GsnVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
