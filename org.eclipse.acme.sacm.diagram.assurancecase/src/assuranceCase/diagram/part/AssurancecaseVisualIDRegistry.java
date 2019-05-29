package assuranceCase.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import argumentation.ArgumentPackage;
import argumentation.ArgumentPackageBinding;
import argumentation.ArgumentPackageInterface;
import argumentation.Argumentation_Package;
import artifact.ArtifactPackage;
import artifact.ArtifactPackageBinding;
import artifact.ArtifactPackageInterface;
import artifact.Artifact_Package;
import assuranceCase.AssuranceCasePackage;
import assuranceCase.AssuranceCasePackageBinding;
import assuranceCase.AssuranceCasePackageInterface;
import cae.CAEModule;
import cae.CAEModuleBinding;
import cae.CAEModuleInterface;
import cae.Cae_Package;
import gsn.ContractModule;
import gsn.Gsn_Package;
import gsn.Module;
import terminology.TerminologyPackage;
import terminology.TerminologyPackageBinding;
import terminology.TerminologyPackageInterface;
import terminology.Terminology_Package;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class AssurancecaseVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "org.eclipse.acme.sacm.diagram.assurancecase/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart.MODEL_ID.equals(view.getType())) {
				return assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getVisualID(view.getType());
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
				assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
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
		if (assuranceCase.AssuranceCase_Package.eINSTANCE.getAssuranceCasePackage().isSuperTypeOf(
				domainElement.eClass()) && isDiagram((assuranceCase.AssuranceCasePackage) domainElement)) {
			return assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart.VISUAL_ID;
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
		String containerModelID = assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getModelID(containerView);
		if (!assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart.VISUAL_ID:
			if (assuranceCase.AssuranceCase_Package.eINSTANCE.getAssuranceCasePackage()
					.isSuperTypeOf(domainElement.eClass())
					&& isAssuranceCasePackage_2001((assuranceCase.AssuranceCasePackage) domainElement)) {
				return assuranceCase.diagram.edit.parts.AssuranceCasePackage2EditPart.VISUAL_ID;
			}
			if (assuranceCase.AssuranceCase_Package.eINSTANCE.getAssuranceCasePackageBinding()
					.isSuperTypeOf(domainElement.eClass())) {
				return assuranceCase.diagram.edit.parts.AssuranceCasePackageBindingEditPart.VISUAL_ID;
			}
			if (assuranceCase.AssuranceCase_Package.eINSTANCE.getAssuranceCasePackageInterface()
					.isSuperTypeOf(domainElement.eClass())) {
				return assuranceCase.diagram.edit.parts.AssuranceCasePackageInterfaceEditPart.VISUAL_ID;
			}
			if (Argumentation_Package.eINSTANCE.getArgumentPackage().isSuperTypeOf(domainElement.eClass())
					&& isArgumentPackage_2004((ArgumentPackage) domainElement)) {
				return assuranceCase.diagram.edit.parts.ArgumentPackageEditPart.VISUAL_ID;
			}
			if (Argumentation_Package.eINSTANCE.getArgumentPackageBinding().isSuperTypeOf(domainElement.eClass())
					&& isArgumentPackageBinding_2002((ArgumentPackageBinding) domainElement)) {
				return assuranceCase.diagram.edit.parts.ArgumentPackageBindingEditPart.VISUAL_ID;
			}
			if (Argumentation_Package.eINSTANCE.getArgumentPackageInterface().isSuperTypeOf(domainElement.eClass())
					&& isArgumentPackageInterface_2003((ArgumentPackageInterface) domainElement)) {
				return assuranceCase.diagram.edit.parts.ArgumentPackageInterfaceEditPart.VISUAL_ID;
			}
			if (Artifact_Package.eINSTANCE.getArtifactPackage().isSuperTypeOf(domainElement.eClass())
					&& isArtifactPackage_2007((ArtifactPackage) domainElement)) {
				return assuranceCase.diagram.edit.parts.ArtifactPackageEditPart.VISUAL_ID;
			}
			if (Artifact_Package.eINSTANCE.getArtifactPackageBinding().isSuperTypeOf(domainElement.eClass())) {
				return assuranceCase.diagram.edit.parts.ArtifactPackageBindingEditPart.VISUAL_ID;
			}
			if (Artifact_Package.eINSTANCE.getArtifactPackageInterface().isSuperTypeOf(domainElement.eClass())) {
				return assuranceCase.diagram.edit.parts.ArtifactPackageInterfaceEditPart.VISUAL_ID;
			}
			if (Terminology_Package.eINSTANCE.getTerminologyPackage().isSuperTypeOf(domainElement.eClass())
					&& isTerminologyPackage_2010((TerminologyPackage) domainElement)) {
				return assuranceCase.diagram.edit.parts.TerminologyPackageEditPart.VISUAL_ID;
			}
			if (Terminology_Package.eINSTANCE.getTerminologyPackageInterface().isSuperTypeOf(domainElement.eClass())) {
				return assuranceCase.diagram.edit.parts.TerminologyPackageInterfaceEditPart.VISUAL_ID;
			}
			if (Terminology_Package.eINSTANCE.getTerminologyPackageBinding().isSuperTypeOf(domainElement.eClass())) {
				return assuranceCase.diagram.edit.parts.TerminologyPackageBindingEditPart.VISUAL_ID;
			}
			if (Gsn_Package.eINSTANCE.getModule().isSuperTypeOf(domainElement.eClass())) {
				return assuranceCase.diagram.edit.parts.ModuleEditPart.VISUAL_ID;
			}
			if (Gsn_Package.eINSTANCE.getContractModule().isSuperTypeOf(domainElement.eClass())) {
				return assuranceCase.diagram.edit.parts.ContractModuleEditPart.VISUAL_ID;
			}
			if (Cae_Package.eINSTANCE.getCAEModule().isSuperTypeOf(domainElement.eClass())) {
				return assuranceCase.diagram.edit.parts.CAEModuleEditPart.VISUAL_ID;
			}
			if (Cae_Package.eINSTANCE.getCAEModuleInterface().isSuperTypeOf(domainElement.eClass())) {
				return assuranceCase.diagram.edit.parts.CAEModuleInterfaceEditPart.VISUAL_ID;
			}
			if (Cae_Package.eINSTANCE.getCAEModuleBinding().isSuperTypeOf(domainElement.eClass())) {
				return assuranceCase.diagram.edit.parts.CAEModuleBindingEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getModelID(containerView);
		if (!assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart.VISUAL_ID:
			if (assuranceCase.diagram.edit.parts.AssuranceCasePackage2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.AssuranceCasePackageBindingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.AssuranceCasePackageInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.ArgumentPackageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.ArgumentPackageBindingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.ArgumentPackageInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.ArtifactPackageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.ArtifactPackageBindingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.ArtifactPackageInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.TerminologyPackageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.TerminologyPackageInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.TerminologyPackageBindingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.ModuleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.ContractModuleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.CAEModuleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.CAEModuleInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.CAEModuleBindingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case assuranceCase.diagram.edit.parts.AssuranceCasePackage2EditPart.VISUAL_ID:
			if (assuranceCase.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageBindingEditPart.VISUAL_ID:
			if (assuranceCase.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageInterfaceEditPart.VISUAL_ID:
			if (assuranceCase.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case assuranceCase.diagram.edit.parts.ArgumentPackageEditPart.VISUAL_ID:
			if (assuranceCase.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case assuranceCase.diagram.edit.parts.ArgumentPackageBindingEditPart.VISUAL_ID:
			if (assuranceCase.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case assuranceCase.diagram.edit.parts.ArgumentPackageInterfaceEditPart.VISUAL_ID:
			if (assuranceCase.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case assuranceCase.diagram.edit.parts.ArtifactPackageEditPart.VISUAL_ID:
			if (assuranceCase.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.WrappingLabel14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case assuranceCase.diagram.edit.parts.ArtifactPackageBindingEditPart.VISUAL_ID:
			if (assuranceCase.diagram.edit.parts.WrappingLabel15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.WrappingLabel16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case assuranceCase.diagram.edit.parts.ArtifactPackageInterfaceEditPart.VISUAL_ID:
			if (assuranceCase.diagram.edit.parts.WrappingLabel17EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.WrappingLabel18EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case assuranceCase.diagram.edit.parts.TerminologyPackageEditPart.VISUAL_ID:
			if (assuranceCase.diagram.edit.parts.WrappingLabel19EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.WrappingLabel20EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case assuranceCase.diagram.edit.parts.TerminologyPackageInterfaceEditPart.VISUAL_ID:
			if (assuranceCase.diagram.edit.parts.WrappingLabel21EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.WrappingLabel22EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case assuranceCase.diagram.edit.parts.TerminologyPackageBindingEditPart.VISUAL_ID:
			if (assuranceCase.diagram.edit.parts.WrappingLabel23EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.WrappingLabel24EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case assuranceCase.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
			if (assuranceCase.diagram.edit.parts.WrappingLabel25EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.WrappingLabel26EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case assuranceCase.diagram.edit.parts.ContractModuleEditPart.VISUAL_ID:
			if (assuranceCase.diagram.edit.parts.WrappingLabel27EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.WrappingLabel28EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case assuranceCase.diagram.edit.parts.CAEModuleEditPart.VISUAL_ID:
			if (assuranceCase.diagram.edit.parts.WrappingLabel29EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.WrappingLabel30EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case assuranceCase.diagram.edit.parts.CAEModuleInterfaceEditPart.VISUAL_ID:
			if (assuranceCase.diagram.edit.parts.WrappingLabel31EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.WrappingLabel32EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case assuranceCase.diagram.edit.parts.CAEModuleBindingEditPart.VISUAL_ID:
			if (assuranceCase.diagram.edit.parts.WrappingLabel33EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (assuranceCase.diagram.edit.parts.WrappingLabel34EditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(assuranceCase.AssuranceCasePackage element) {
		return true;
	}

	/**
	* @generated
	*/
	private static boolean isAssuranceCasePackage_2001(assuranceCase.AssuranceCasePackage domainElement) {
//		Object result = assuranceCase.diagram.expressions.AssurancecaseOCLFactory
//				.getExpression(0, assuranceCase.AssuranceCase_Package.eINSTANCE.getAssuranceCasePackage(), null)
//				.evaluate(domainElement);
//		return result instanceof Boolean && ((Boolean) result).booleanValue();
		return domainElement instanceof AssuranceCasePackage && !(domainElement instanceof AssuranceCasePackageInterface) && !(domainElement instanceof AssuranceCasePackageBinding);
	}

	/**
	* @generated
	*/
	private static boolean isArgumentPackage_2004(ArgumentPackage domainElement) {
//		Object result = assuranceCase.diagram.expressions.AssurancecaseOCLFactory
//				.getExpression(1, Argumentation_Package.eINSTANCE.getArgumentPackage(), null).evaluate(domainElement);
//		return result instanceof Boolean && ((Boolean) result).booleanValue();
		return domainElement instanceof ArgumentPackage && 
				!(domainElement instanceof ArgumentPackageInterface) && 
				!(domainElement instanceof ArgumentPackageBinding) &&
				!(domainElement instanceof Module) &&
				!(domainElement instanceof ContractModule) &&
				!(domainElement instanceof CAEModule) &&
				!(domainElement instanceof CAEModuleInterface) &&
				!(domainElement instanceof CAEModuleBinding);
	}

	/**
	* @generated
	*/
	private static boolean isArgumentPackageBinding_2002(ArgumentPackageBinding domainElement) {
//		Object result = assuranceCase.diagram.expressions.AssurancecaseOCLFactory
//				.getExpression(2, Argumentation_Package.eINSTANCE.getArgumentPackageBinding(), null)
//				.evaluate(domainElement);
//		return result instanceof Boolean && ((Boolean) result).booleanValue();
		return domainElement instanceof ArgumentPackageBinding;
	}

	/**
	* @generated
	*/
	private static boolean isArgumentPackageInterface_2003(ArgumentPackageInterface domainElement) {
//		Object result = assuranceCase.diagram.expressions.AssurancecaseOCLFactory
//				.getExpression(3, Argumentation_Package.eINSTANCE.getArgumentPackageInterface(), null)
//				.evaluate(domainElement);
//		return result instanceof Boolean && ((Boolean) result).booleanValue();
		return domainElement instanceof ArgumentPackageInterface;
	}

	/**
	* @generated
	*/
	private static boolean isArtifactPackage_2007(ArtifactPackage domainElement) {
//		Object result = assuranceCase.diagram.expressions.AssurancecaseOCLFactory
//				.getExpression(4, Artifact_Package.eINSTANCE.getArtifactPackage(), null).evaluate(domainElement);
//		return result instanceof Boolean && ((Boolean) result).booleanValue();
		return domainElement instanceof ArtifactPackage && 
				!(domainElement instanceof ArtifactPackageInterface) &&
				!(domainElement instanceof ArtifactPackageBinding);
	}

	/**
	* @generated
	*/
	private static boolean isTerminologyPackage_2010(TerminologyPackage domainElement) {
//		Object result = assuranceCase.diagram.expressions.AssurancecaseOCLFactory
//				.getExpression(5, Terminology_Package.eINSTANCE.getTerminologyPackage(), null).evaluate(domainElement);
//		return result instanceof Boolean && ((Boolean) result).booleanValue();
		return domainElement instanceof TerminologyPackage && 
				!(domainElement instanceof TerminologyPackageInterface) &&
				!(domainElement instanceof TerminologyPackageBinding);
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
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart.VISUAL_ID:
			return false;
		case assuranceCase.diagram.edit.parts.AssuranceCasePackage2EditPart.VISUAL_ID:
		case assuranceCase.diagram.edit.parts.ArgumentPackageBindingEditPart.VISUAL_ID:
		case assuranceCase.diagram.edit.parts.ArgumentPackageInterfaceEditPart.VISUAL_ID:
		case assuranceCase.diagram.edit.parts.ArgumentPackageEditPart.VISUAL_ID:
		case assuranceCase.diagram.edit.parts.ArtifactPackageEditPart.VISUAL_ID:
		case assuranceCase.diagram.edit.parts.ArtifactPackageBindingEditPart.VISUAL_ID:
		case assuranceCase.diagram.edit.parts.ArtifactPackageInterfaceEditPart.VISUAL_ID:
		case assuranceCase.diagram.edit.parts.TerminologyPackageEditPart.VISUAL_ID:
		case assuranceCase.diagram.edit.parts.TerminologyPackageInterfaceEditPart.VISUAL_ID:
		case assuranceCase.diagram.edit.parts.TerminologyPackageBindingEditPart.VISUAL_ID:
		case assuranceCase.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
		case assuranceCase.diagram.edit.parts.ContractModuleEditPart.VISUAL_ID:
		case assuranceCase.diagram.edit.parts.CAEModuleEditPart.VISUAL_ID:
		case assuranceCase.diagram.edit.parts.CAEModuleInterfaceEditPart.VISUAL_ID:
		case assuranceCase.diagram.edit.parts.CAEModuleBindingEditPart.VISUAL_ID:
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageBindingEditPart.VISUAL_ID:
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageInterfaceEditPart.VISUAL_ID:
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
			return assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
