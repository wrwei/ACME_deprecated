/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package gsn.diagram.part;

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
import argumentation.ArgumentationElement;
import argumentation.Argumentation_Package;
import gsn.Assumption;
import gsn.AwayContext;
import gsn.AwayGoal;
import gsn.AwaySolution;
import gsn.ChoiceNode;
import gsn.Context;
import gsn.ContractModule;
import gsn.ContractModuleReference;
import gsn.Goal;
import gsn.InContextOf;
import gsn.Justification;
import gsn.Module;
import gsn.ModuleReference;
import gsn.Solution;
import gsn.Strategy;
import gsn.SupportedBy;
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
import gsn.diagram.providers.GsnElementTypes;

/**
 * @generated
 */
public class GsnDiagramUpdater {

	/**
	* @generated
	*/
	public static List<GsnNodeDescriptor> getSemanticChildren(View view) {
		switch (GsnVisualIDRegistry.getVisualID(view)) {
		case GsnEditPart.VISUAL_ID:
			return getArgumentPackage_1003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GsnNodeDescriptor> getArgumentPackage_1003SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ArgumentPackage modelElement = (ArgumentPackage) view.getElement();
		LinkedList<GsnNodeDescriptor> result = new LinkedList<GsnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getArgumentationElement().iterator(); it.hasNext();) {
			ArgumentationElement childElement = (ArgumentationElement) it.next();
			int visualID = GsnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ModuleEditPart.VISUAL_ID) {
				result.add(new GsnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContractModuleEditPart.VISUAL_ID) {
				result.add(new GsnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GoalEditPart.VISUAL_ID) {
				result.add(new GsnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StrategyEditPart.VISUAL_ID) {
				result.add(new GsnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SolutionEditPart.VISUAL_ID) {
				result.add(new GsnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContextEditPart.VISUAL_ID) {
				result.add(new GsnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JustificationEditPart.VISUAL_ID) {
				result.add(new GsnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AssumptionEditPart.VISUAL_ID) {
				result.add(new GsnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ModuleReferenceEditPart.VISUAL_ID) {
				result.add(new GsnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ChoiceNodeEditPart.VISUAL_ID) {
				result.add(new GsnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContractModuleReferenceEditPart.VISUAL_ID) {
				result.add(new GsnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AwayGoalEditPart.VISUAL_ID) {
				result.add(new GsnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AwayContextEditPart.VISUAL_ID) {
				result.add(new GsnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AwaySolutionEditPart.VISUAL_ID) {
				result.add(new GsnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<GsnLinkDescriptor> getContainedLinks(View view) {
		switch (GsnVisualIDRegistry.getVisualID(view)) {
		case GsnEditPart.VISUAL_ID:
			return getArgumentPackage_1003ContainedLinks(view);
		case ModuleEditPart.VISUAL_ID:
			return getModule_2301ContainedLinks(view);
		case ContractModuleEditPart.VISUAL_ID:
			return getContractModule_2302ContainedLinks(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_2303ContainedLinks(view);
		case StrategyEditPart.VISUAL_ID:
			return getStrategy_2304ContainedLinks(view);
		case SolutionEditPart.VISUAL_ID:
			return getSolution_2305ContainedLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2306ContainedLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2307ContainedLinks(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2308ContainedLinks(view);
		case ModuleReferenceEditPart.VISUAL_ID:
			return getModuleReference_2309ContainedLinks(view);
		case ChoiceNodeEditPart.VISUAL_ID:
			return getChoiceNode_2310ContainedLinks(view);
		case ContractModuleReferenceEditPart.VISUAL_ID:
			return getContractModuleReference_2311ContainedLinks(view);
		case AwayGoalEditPart.VISUAL_ID:
			return getAwayGoal_2312ContainedLinks(view);
		case AwayContextEditPart.VISUAL_ID:
			return getAwayContext_2313ContainedLinks(view);
		case AwaySolutionEditPart.VISUAL_ID:
			return getAwaySolution_2314ContainedLinks(view);
		case SupportedByEditPart.VISUAL_ID:
			return getSupportedBy_4401ContainedLinks(view);
		case InContextOfEditPart.VISUAL_ID:
			return getInContextOf_4402ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GsnLinkDescriptor> getIncomingLinks(View view) {
		switch (GsnVisualIDRegistry.getVisualID(view)) {
		case ModuleEditPart.VISUAL_ID:
			return getModule_2301IncomingLinks(view);
		case ContractModuleEditPart.VISUAL_ID:
			return getContractModule_2302IncomingLinks(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_2303IncomingLinks(view);
		case StrategyEditPart.VISUAL_ID:
			return getStrategy_2304IncomingLinks(view);
		case SolutionEditPart.VISUAL_ID:
			return getSolution_2305IncomingLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2306IncomingLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2307IncomingLinks(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2308IncomingLinks(view);
		case ModuleReferenceEditPart.VISUAL_ID:
			return getModuleReference_2309IncomingLinks(view);
		case ChoiceNodeEditPart.VISUAL_ID:
			return getChoiceNode_2310IncomingLinks(view);
		case ContractModuleReferenceEditPart.VISUAL_ID:
			return getContractModuleReference_2311IncomingLinks(view);
		case AwayGoalEditPart.VISUAL_ID:
			return getAwayGoal_2312IncomingLinks(view);
		case AwayContextEditPart.VISUAL_ID:
			return getAwayContext_2313IncomingLinks(view);
		case AwaySolutionEditPart.VISUAL_ID:
			return getAwaySolution_2314IncomingLinks(view);
		case SupportedByEditPart.VISUAL_ID:
			return getSupportedBy_4401IncomingLinks(view);
		case InContextOfEditPart.VISUAL_ID:
			return getInContextOf_4402IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GsnLinkDescriptor> getOutgoingLinks(View view) {
		switch (GsnVisualIDRegistry.getVisualID(view)) {
		case ModuleEditPart.VISUAL_ID:
			return getModule_2301OutgoingLinks(view);
		case ContractModuleEditPart.VISUAL_ID:
			return getContractModule_2302OutgoingLinks(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_2303OutgoingLinks(view);
		case StrategyEditPart.VISUAL_ID:
			return getStrategy_2304OutgoingLinks(view);
		case SolutionEditPart.VISUAL_ID:
			return getSolution_2305OutgoingLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2306OutgoingLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2307OutgoingLinks(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2308OutgoingLinks(view);
		case ModuleReferenceEditPart.VISUAL_ID:
			return getModuleReference_2309OutgoingLinks(view);
		case ChoiceNodeEditPart.VISUAL_ID:
			return getChoiceNode_2310OutgoingLinks(view);
		case ContractModuleReferenceEditPart.VISUAL_ID:
			return getContractModuleReference_2311OutgoingLinks(view);
		case AwayGoalEditPart.VISUAL_ID:
			return getAwayGoal_2312OutgoingLinks(view);
		case AwayContextEditPart.VISUAL_ID:
			return getAwayContext_2313OutgoingLinks(view);
		case AwaySolutionEditPart.VISUAL_ID:
			return getAwaySolution_2314OutgoingLinks(view);
		case SupportedByEditPart.VISUAL_ID:
			return getSupportedBy_4401OutgoingLinks(view);
		case InContextOfEditPart.VISUAL_ID:
			return getInContextOf_4402OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GsnLinkDescriptor> getArgumentPackage_1003ContainedLinks(View view) {
		ArgumentPackage modelElement = (ArgumentPackage) view.getElement();
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SupportedBy_4401(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InContextOf_4402(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getModule_2301ContainedLinks(View view) {
		Module modelElement = (Module) view.getElement();
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SupportedBy_4401(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InContextOf_4402(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getContractModule_2302ContainedLinks(View view) {
		ContractModule modelElement = (ContractModule) view.getElement();
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SupportedBy_4401(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InContextOf_4402(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getGoal_2303ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getStrategy_2304ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getSolution_2305ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getContext_2306ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getJustification_2307ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getAssumption_2308ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getModuleReference_2309ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getChoiceNode_2310ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getContractModuleReference_2311ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getAwayGoal_2312ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getAwayContext_2313ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getAwaySolution_2314ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getSupportedBy_4401ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getInContextOf_4402ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getModule_2301IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getContractModule_2302IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getGoal_2303IncomingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4401(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4402(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getStrategy_2304IncomingLinks(View view) {
		Strategy modelElement = (Strategy) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4401(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4402(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getSolution_2305IncomingLinks(View view) {
		Solution modelElement = (Solution) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4401(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4402(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getContext_2306IncomingLinks(View view) {
		Context modelElement = (Context) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4401(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4402(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getJustification_2307IncomingLinks(View view) {
		Justification modelElement = (Justification) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4401(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4402(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getAssumption_2308IncomingLinks(View view) {
		Assumption modelElement = (Assumption) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4401(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4402(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getModuleReference_2309IncomingLinks(View view) {
		ModuleReference modelElement = (ModuleReference) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4401(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4402(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getChoiceNode_2310IncomingLinks(View view) {
		ChoiceNode modelElement = (ChoiceNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4401(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4402(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getContractModuleReference_2311IncomingLinks(View view) {
		ContractModuleReference modelElement = (ContractModuleReference) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4401(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4402(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getAwayGoal_2312IncomingLinks(View view) {
		AwayGoal modelElement = (AwayGoal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4401(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4402(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getAwayContext_2313IncomingLinks(View view) {
		AwayContext modelElement = (AwayContext) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4401(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4402(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getAwaySolution_2314IncomingLinks(View view) {
		AwaySolution modelElement = (AwaySolution) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4401(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4402(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getSupportedBy_4401IncomingLinks(View view) {
		SupportedBy modelElement = (SupportedBy) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4401(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4402(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getInContextOf_4402IncomingLinks(View view) {
		InContextOf modelElement = (InContextOf) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SupportedBy_4401(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InContextOf_4402(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getModule_2301OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getContractModule_2302OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getGoal_2303OutgoingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4401(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4402(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getStrategy_2304OutgoingLinks(View view) {
		Strategy modelElement = (Strategy) view.getElement();
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4401(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4402(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getSolution_2305OutgoingLinks(View view) {
		Solution modelElement = (Solution) view.getElement();
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4401(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4402(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getContext_2306OutgoingLinks(View view) {
		Context modelElement = (Context) view.getElement();
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4401(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4402(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getJustification_2307OutgoingLinks(View view) {
		Justification modelElement = (Justification) view.getElement();
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4401(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4402(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getAssumption_2308OutgoingLinks(View view) {
		Assumption modelElement = (Assumption) view.getElement();
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4401(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4402(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getModuleReference_2309OutgoingLinks(View view) {
		ModuleReference modelElement = (ModuleReference) view.getElement();
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4401(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4402(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getChoiceNode_2310OutgoingLinks(View view) {
		ChoiceNode modelElement = (ChoiceNode) view.getElement();
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4401(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4402(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getContractModuleReference_2311OutgoingLinks(View view) {
		ContractModuleReference modelElement = (ContractModuleReference) view.getElement();
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4401(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4402(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getAwayGoal_2312OutgoingLinks(View view) {
		AwayGoal modelElement = (AwayGoal) view.getElement();
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4401(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4402(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getAwayContext_2313OutgoingLinks(View view) {
		AwayContext modelElement = (AwayContext) view.getElement();
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4401(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4402(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getAwaySolution_2314OutgoingLinks(View view) {
		AwaySolution modelElement = (AwaySolution) view.getElement();
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4401(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4402(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getSupportedBy_4401OutgoingLinks(View view) {
		SupportedBy modelElement = (SupportedBy) view.getElement();
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4401(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4402(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getInContextOf_4402OutgoingLinks(View view) {
		InContextOf modelElement = (InContextOf) view.getElement();
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SupportedBy_4401(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InContextOf_4402(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GsnLinkDescriptor> getContainedTypeModelFacetLinks_SupportedBy_4401(
			ArgumentPackage container) {
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		for (Iterator<?> links = container.getArgumentationElement().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SupportedBy) {
				continue;
			}
			SupportedBy link = (SupportedBy) linkObject;
			if (SupportedByEditPart.VISUAL_ID != GsnVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTarget();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ArgumentAsset) {
				continue;
			}
			ArgumentAsset dst = (ArgumentAsset) theTarget;
			List sources = link.getSource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ArgumentAsset) {
				continue;
			}
			ArgumentAsset src = (ArgumentAsset) theSource;
			result.add(new GsnLinkDescriptor(src, dst, link, GsnElementTypes.SupportedBy_4401,
					SupportedByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GsnLinkDescriptor> getContainedTypeModelFacetLinks_InContextOf_4402(
			ArgumentPackage container) {
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		for (Iterator<?> links = container.getArgumentationElement().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InContextOf) {
				continue;
			}
			InContextOf link = (InContextOf) linkObject;
			if (InContextOfEditPart.VISUAL_ID != GsnVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTarget();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ArgumentAsset) {
				continue;
			}
			ArgumentAsset dst = (ArgumentAsset) theTarget;
			List sources = link.getSource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ArgumentAsset) {
				continue;
			}
			ArgumentAsset src = (ArgumentAsset) theSource;
			result.add(new GsnLinkDescriptor(src, dst, link, GsnElementTypes.InContextOf_4402,
					InContextOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GsnLinkDescriptor> getIncomingTypeModelFacetLinks_SupportedBy_4401(ArgumentAsset target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Argumentation_Package.eINSTANCE.getAssertedRelationship_Target()
					|| false == setting.getEObject() instanceof SupportedBy) {
				continue;
			}
			SupportedBy link = (SupportedBy) setting.getEObject();
			if (SupportedByEditPart.VISUAL_ID != GsnVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getSource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ArgumentAsset) {
				continue;
			}
			ArgumentAsset src = (ArgumentAsset) theSource;
			result.add(new GsnLinkDescriptor(src, target, link, GsnElementTypes.SupportedBy_4401,
					SupportedByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GsnLinkDescriptor> getIncomingTypeModelFacetLinks_InContextOf_4402(ArgumentAsset target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Argumentation_Package.eINSTANCE.getAssertedRelationship_Target()
					|| false == setting.getEObject() instanceof InContextOf) {
				continue;
			}
			InContextOf link = (InContextOf) setting.getEObject();
			if (InContextOfEditPart.VISUAL_ID != GsnVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getSource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ArgumentAsset) {
				continue;
			}
			ArgumentAsset src = (ArgumentAsset) theSource;
			result.add(new GsnLinkDescriptor(src, target, link, GsnElementTypes.InContextOf_4402,
					InContextOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GsnLinkDescriptor> getOutgoingTypeModelFacetLinks_SupportedBy_4401(ArgumentAsset source) {
		ArgumentPackage container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ArgumentPackage) {
				container = (ArgumentPackage) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		for (Iterator<?> links = container.getArgumentationElement().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SupportedBy) {
				continue;
			}
			SupportedBy link = (SupportedBy) linkObject;
			if (SupportedByEditPart.VISUAL_ID != GsnVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTarget();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ArgumentAsset) {
				continue;
			}
			ArgumentAsset dst = (ArgumentAsset) theTarget;
			List sources = link.getSource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ArgumentAsset) {
				continue;
			}
			ArgumentAsset src = (ArgumentAsset) theSource;
			if (src != source) {
				continue;
			}
			result.add(new GsnLinkDescriptor(src, dst, link, GsnElementTypes.SupportedBy_4401,
					SupportedByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GsnLinkDescriptor> getOutgoingTypeModelFacetLinks_InContextOf_4402(ArgumentAsset source) {
		ArgumentPackage container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ArgumentPackage) {
				container = (ArgumentPackage) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		for (Iterator<?> links = container.getArgumentationElement().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InContextOf) {
				continue;
			}
			InContextOf link = (InContextOf) linkObject;
			if (InContextOfEditPart.VISUAL_ID != GsnVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTarget();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ArgumentAsset) {
				continue;
			}
			ArgumentAsset dst = (ArgumentAsset) theTarget;
			List sources = link.getSource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ArgumentAsset) {
				continue;
			}
			ArgumentAsset src = (ArgumentAsset) theSource;
			if (src != source) {
				continue;
			}
			result.add(new GsnLinkDescriptor(src, dst, link, GsnElementTypes.InContextOf_4402,
					InContextOfEditPart.VISUAL_ID));
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

		public List<GsnNodeDescriptor> getSemanticChildren(View view) {
			return GsnDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<GsnLinkDescriptor> getContainedLinks(View view) {
			return GsnDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<GsnLinkDescriptor> getIncomingLinks(View view) {
			return GsnDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<GsnLinkDescriptor> getOutgoingLinks(View view) {
			return GsnDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
