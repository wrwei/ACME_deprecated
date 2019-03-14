package assuranceCase.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import argumentation.ArgumentPackage;
import artifact.ArtifactPackage;
import terminology.TerminologyPackage;

/**
 * @generated
 */
public class AssurancecaseDiagramUpdater {

	/**
	* @generated
	*/
	public static List<assuranceCase.diagram.part.AssurancecaseNodeDescriptor> getSemanticChildren(View view) {
		switch (assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getVisualID(view)) {
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart.VISUAL_ID:
			return getAssuranceCasePackage_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<assuranceCase.diagram.part.AssurancecaseNodeDescriptor> getAssuranceCasePackage_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		assuranceCase.AssuranceCasePackage modelElement = (assuranceCase.AssuranceCasePackage) view.getElement();
		LinkedList<assuranceCase.diagram.part.AssurancecaseNodeDescriptor> result = new LinkedList<assuranceCase.diagram.part.AssurancecaseNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAssuranceCasePackage().iterator(); it.hasNext();) {
			assuranceCase.AssuranceCasePackage childElement = (assuranceCase.AssuranceCasePackage) it.next();
			int visualID = assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == assuranceCase.diagram.edit.parts.AssuranceCasePackage2EditPart.VISUAL_ID) {
				result.add(new assuranceCase.diagram.part.AssurancecaseNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == assuranceCase.diagram.edit.parts.AssuranceCasePackageBindingEditPart.VISUAL_ID) {
				result.add(new assuranceCase.diagram.part.AssurancecaseNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == assuranceCase.diagram.edit.parts.AssuranceCasePackageInterfaceEditPart.VISUAL_ID) {
				result.add(new assuranceCase.diagram.part.AssurancecaseNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getArgumentPackage().iterator(); it.hasNext();) {
			ArgumentPackage childElement = (ArgumentPackage) it.next();
			int visualID = assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == assuranceCase.diagram.edit.parts.ArgumentPackageEditPart.VISUAL_ID) {
				result.add(new assuranceCase.diagram.part.AssurancecaseNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == assuranceCase.diagram.edit.parts.ArgumentPackageBindingEditPart.VISUAL_ID) {
				result.add(new assuranceCase.diagram.part.AssurancecaseNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == assuranceCase.diagram.edit.parts.ArgumentPackageInterfaceEditPart.VISUAL_ID) {
				result.add(new assuranceCase.diagram.part.AssurancecaseNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == assuranceCase.diagram.edit.parts.ModuleEditPart.VISUAL_ID) {
				result.add(new assuranceCase.diagram.part.AssurancecaseNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == assuranceCase.diagram.edit.parts.ContractModuleEditPart.VISUAL_ID) {
				result.add(new assuranceCase.diagram.part.AssurancecaseNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == assuranceCase.diagram.edit.parts.CAEModuleEditPart.VISUAL_ID) {
				result.add(new assuranceCase.diagram.part.AssurancecaseNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == assuranceCase.diagram.edit.parts.CAEModuleInterfaceEditPart.VISUAL_ID) {
				result.add(new assuranceCase.diagram.part.AssurancecaseNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == assuranceCase.diagram.edit.parts.CAEModuleBindingEditPart.VISUAL_ID) {
				result.add(new assuranceCase.diagram.part.AssurancecaseNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getArtifactPackage().iterator(); it.hasNext();) {
			ArtifactPackage childElement = (ArtifactPackage) it.next();
			int visualID = assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == assuranceCase.diagram.edit.parts.ArtifactPackageEditPart.VISUAL_ID) {
				result.add(new assuranceCase.diagram.part.AssurancecaseNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == assuranceCase.diagram.edit.parts.ArtifactPackageBindingEditPart.VISUAL_ID) {
				result.add(new assuranceCase.diagram.part.AssurancecaseNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == assuranceCase.diagram.edit.parts.ArtifactPackageInterfaceEditPart.VISUAL_ID) {
				result.add(new assuranceCase.diagram.part.AssurancecaseNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTerminologyPackage().iterator(); it.hasNext();) {
			TerminologyPackage childElement = (TerminologyPackage) it.next();
			int visualID = assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == assuranceCase.diagram.edit.parts.TerminologyPackageEditPart.VISUAL_ID) {
				result.add(new assuranceCase.diagram.part.AssurancecaseNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == assuranceCase.diagram.edit.parts.TerminologyPackageInterfaceEditPart.VISUAL_ID) {
				result.add(new assuranceCase.diagram.part.AssurancecaseNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == assuranceCase.diagram.edit.parts.TerminologyPackageBindingEditPart.VISUAL_ID) {
				result.add(new assuranceCase.diagram.part.AssurancecaseNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getContainedLinks(View view) {
		switch (assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getVisualID(view)) {
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart.VISUAL_ID:
			return getAssuranceCasePackage_1000ContainedLinks(view);
		case assuranceCase.diagram.edit.parts.AssuranceCasePackage2EditPart.VISUAL_ID:
			return getAssuranceCasePackage_2001ContainedLinks(view);
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageBindingEditPart.VISUAL_ID:
			return getAssuranceCasePackageBinding_2018ContainedLinks(view);
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageInterfaceEditPart.VISUAL_ID:
			return getAssuranceCasePackageInterface_2019ContainedLinks(view);
		case assuranceCase.diagram.edit.parts.ArgumentPackageEditPart.VISUAL_ID:
			return getArgumentPackage_2004ContainedLinks(view);
		case assuranceCase.diagram.edit.parts.ArgumentPackageBindingEditPart.VISUAL_ID:
			return getArgumentPackageBinding_2002ContainedLinks(view);
		case assuranceCase.diagram.edit.parts.ArgumentPackageInterfaceEditPart.VISUAL_ID:
			return getArgumentPackageInterface_2003ContainedLinks(view);
		case assuranceCase.diagram.edit.parts.ArtifactPackageEditPart.VISUAL_ID:
			return getArtifactPackage_2007ContainedLinks(view);
		case assuranceCase.diagram.edit.parts.ArtifactPackageBindingEditPart.VISUAL_ID:
			return getArtifactPackageBinding_2008ContainedLinks(view);
		case assuranceCase.diagram.edit.parts.ArtifactPackageInterfaceEditPart.VISUAL_ID:
			return getArtifactPackageInterface_2009ContainedLinks(view);
		case assuranceCase.diagram.edit.parts.TerminologyPackageEditPart.VISUAL_ID:
			return getTerminologyPackage_2010ContainedLinks(view);
		case assuranceCase.diagram.edit.parts.TerminologyPackageInterfaceEditPart.VISUAL_ID:
			return getTerminologyPackageInterface_2011ContainedLinks(view);
		case assuranceCase.diagram.edit.parts.TerminologyPackageBindingEditPart.VISUAL_ID:
			return getTerminologyPackageBinding_2012ContainedLinks(view);
		case assuranceCase.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
			return getModule_2013ContainedLinks(view);
		case assuranceCase.diagram.edit.parts.ContractModuleEditPart.VISUAL_ID:
			return getContractModule_2014ContainedLinks(view);
		case assuranceCase.diagram.edit.parts.CAEModuleEditPart.VISUAL_ID:
			return getCAEModule_2015ContainedLinks(view);
		case assuranceCase.diagram.edit.parts.CAEModuleInterfaceEditPart.VISUAL_ID:
			return getCAEModuleInterface_2016ContainedLinks(view);
		case assuranceCase.diagram.edit.parts.CAEModuleBindingEditPart.VISUAL_ID:
			return getCAEModuleBinding_2017ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getIncomingLinks(View view) {
		switch (assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getVisualID(view)) {
		case assuranceCase.diagram.edit.parts.AssuranceCasePackage2EditPart.VISUAL_ID:
			return getAssuranceCasePackage_2001IncomingLinks(view);
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageBindingEditPart.VISUAL_ID:
			return getAssuranceCasePackageBinding_2018IncomingLinks(view);
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageInterfaceEditPart.VISUAL_ID:
			return getAssuranceCasePackageInterface_2019IncomingLinks(view);
		case assuranceCase.diagram.edit.parts.ArgumentPackageEditPart.VISUAL_ID:
			return getArgumentPackage_2004IncomingLinks(view);
		case assuranceCase.diagram.edit.parts.ArgumentPackageBindingEditPart.VISUAL_ID:
			return getArgumentPackageBinding_2002IncomingLinks(view);
		case assuranceCase.diagram.edit.parts.ArgumentPackageInterfaceEditPart.VISUAL_ID:
			return getArgumentPackageInterface_2003IncomingLinks(view);
		case assuranceCase.diagram.edit.parts.ArtifactPackageEditPart.VISUAL_ID:
			return getArtifactPackage_2007IncomingLinks(view);
		case assuranceCase.diagram.edit.parts.ArtifactPackageBindingEditPart.VISUAL_ID:
			return getArtifactPackageBinding_2008IncomingLinks(view);
		case assuranceCase.diagram.edit.parts.ArtifactPackageInterfaceEditPart.VISUAL_ID:
			return getArtifactPackageInterface_2009IncomingLinks(view);
		case assuranceCase.diagram.edit.parts.TerminologyPackageEditPart.VISUAL_ID:
			return getTerminologyPackage_2010IncomingLinks(view);
		case assuranceCase.diagram.edit.parts.TerminologyPackageInterfaceEditPart.VISUAL_ID:
			return getTerminologyPackageInterface_2011IncomingLinks(view);
		case assuranceCase.diagram.edit.parts.TerminologyPackageBindingEditPart.VISUAL_ID:
			return getTerminologyPackageBinding_2012IncomingLinks(view);
		case assuranceCase.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
			return getModule_2013IncomingLinks(view);
		case assuranceCase.diagram.edit.parts.ContractModuleEditPart.VISUAL_ID:
			return getContractModule_2014IncomingLinks(view);
		case assuranceCase.diagram.edit.parts.CAEModuleEditPart.VISUAL_ID:
			return getCAEModule_2015IncomingLinks(view);
		case assuranceCase.diagram.edit.parts.CAEModuleInterfaceEditPart.VISUAL_ID:
			return getCAEModuleInterface_2016IncomingLinks(view);
		case assuranceCase.diagram.edit.parts.CAEModuleBindingEditPart.VISUAL_ID:
			return getCAEModuleBinding_2017IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getOutgoingLinks(View view) {
		switch (assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getVisualID(view)) {
		case assuranceCase.diagram.edit.parts.AssuranceCasePackage2EditPart.VISUAL_ID:
			return getAssuranceCasePackage_2001OutgoingLinks(view);
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageBindingEditPart.VISUAL_ID:
			return getAssuranceCasePackageBinding_2018OutgoingLinks(view);
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageInterfaceEditPart.VISUAL_ID:
			return getAssuranceCasePackageInterface_2019OutgoingLinks(view);
		case assuranceCase.diagram.edit.parts.ArgumentPackageEditPart.VISUAL_ID:
			return getArgumentPackage_2004OutgoingLinks(view);
		case assuranceCase.diagram.edit.parts.ArgumentPackageBindingEditPart.VISUAL_ID:
			return getArgumentPackageBinding_2002OutgoingLinks(view);
		case assuranceCase.diagram.edit.parts.ArgumentPackageInterfaceEditPart.VISUAL_ID:
			return getArgumentPackageInterface_2003OutgoingLinks(view);
		case assuranceCase.diagram.edit.parts.ArtifactPackageEditPart.VISUAL_ID:
			return getArtifactPackage_2007OutgoingLinks(view);
		case assuranceCase.diagram.edit.parts.ArtifactPackageBindingEditPart.VISUAL_ID:
			return getArtifactPackageBinding_2008OutgoingLinks(view);
		case assuranceCase.diagram.edit.parts.ArtifactPackageInterfaceEditPart.VISUAL_ID:
			return getArtifactPackageInterface_2009OutgoingLinks(view);
		case assuranceCase.diagram.edit.parts.TerminologyPackageEditPart.VISUAL_ID:
			return getTerminologyPackage_2010OutgoingLinks(view);
		case assuranceCase.diagram.edit.parts.TerminologyPackageInterfaceEditPart.VISUAL_ID:
			return getTerminologyPackageInterface_2011OutgoingLinks(view);
		case assuranceCase.diagram.edit.parts.TerminologyPackageBindingEditPart.VISUAL_ID:
			return getTerminologyPackageBinding_2012OutgoingLinks(view);
		case assuranceCase.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
			return getModule_2013OutgoingLinks(view);
		case assuranceCase.diagram.edit.parts.ContractModuleEditPart.VISUAL_ID:
			return getContractModule_2014OutgoingLinks(view);
		case assuranceCase.diagram.edit.parts.CAEModuleEditPart.VISUAL_ID:
			return getCAEModule_2015OutgoingLinks(view);
		case assuranceCase.diagram.edit.parts.CAEModuleInterfaceEditPart.VISUAL_ID:
			return getCAEModuleInterface_2016OutgoingLinks(view);
		case assuranceCase.diagram.edit.parts.CAEModuleBindingEditPart.VISUAL_ID:
			return getCAEModuleBinding_2017OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getAssuranceCasePackage_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getAssuranceCasePackage_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getAssuranceCasePackageBinding_2018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getAssuranceCasePackageInterface_2019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getArgumentPackage_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getArgumentPackageBinding_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getArgumentPackageInterface_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getArtifactPackage_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getArtifactPackageBinding_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getArtifactPackageInterface_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getTerminologyPackage_2010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getTerminologyPackageInterface_2011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getTerminologyPackageBinding_2012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getModule_2013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getContractModule_2014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getCAEModule_2015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getCAEModuleInterface_2016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getCAEModuleBinding_2017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getAssuranceCasePackage_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getAssuranceCasePackageBinding_2018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getAssuranceCasePackageInterface_2019IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getArgumentPackage_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getArgumentPackageBinding_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getArgumentPackageInterface_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getArtifactPackage_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getArtifactPackageBinding_2008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getArtifactPackageInterface_2009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getTerminologyPackage_2010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getTerminologyPackageInterface_2011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getTerminologyPackageBinding_2012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getModule_2013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getContractModule_2014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getCAEModule_2015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getCAEModuleInterface_2016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getCAEModuleBinding_2017IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getAssuranceCasePackage_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getAssuranceCasePackageBinding_2018OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getAssuranceCasePackageInterface_2019OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getArgumentPackage_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getArgumentPackageBinding_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getArgumentPackageInterface_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getArtifactPackage_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getArtifactPackageBinding_2008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getArtifactPackageInterface_2009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getTerminologyPackage_2010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getTerminologyPackageInterface_2011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getTerminologyPackageBinding_2012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getModule_2013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getContractModule_2014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getCAEModule_2015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getCAEModuleInterface_2016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getCAEModuleBinding_2017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<assuranceCase.diagram.part.AssurancecaseNodeDescriptor> getSemanticChildren(View view) {
			return AssurancecaseDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getContainedLinks(View view) {
			return AssurancecaseDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getIncomingLinks(View view) {
			return AssurancecaseDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<assuranceCase.diagram.part.AssurancecaseLinkDescriptor> getOutgoingLinks(View view) {
			return AssurancecaseDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
