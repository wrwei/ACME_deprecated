/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package gsn.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import argumentation.ArgumentPackage;
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
import gsn.diagram.edit.parts.WrappingLabel11EditPart;
import gsn.diagram.edit.parts.WrappingLabel13EditPart;
import gsn.diagram.edit.parts.WrappingLabel15EditPart;
import gsn.diagram.edit.parts.WrappingLabel17EditPart;
import gsn.diagram.edit.parts.WrappingLabel19EditPart;
import gsn.diagram.edit.parts.WrappingLabel20EditPart;
import gsn.diagram.edit.parts.WrappingLabel22EditPart;
import gsn.diagram.edit.parts.WrappingLabel25EditPart;
import gsn.diagram.edit.parts.WrappingLabel28EditPart;
import gsn.diagram.edit.parts.WrappingLabel31EditPart;
import gsn.diagram.edit.parts.WrappingLabel32EditPart;
import gsn.diagram.edit.parts.WrappingLabel3EditPart;
import gsn.diagram.edit.parts.WrappingLabel5EditPart;
import gsn.diagram.edit.parts.WrappingLabel7EditPart;
import gsn.diagram.edit.parts.WrappingLabel9EditPart;
import gsn.diagram.edit.parts.WrappingLabelEditPart;
import gsn.diagram.part.GsnDiagramEditorPlugin;
import gsn.diagram.part.GsnVisualIDRegistry;
import gsn.diagram.providers.GsnElementTypes;
import gsn.diagram.providers.GsnParserProvider;

/**
 * @generated
 */
public class GsnNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		GsnDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		GsnDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof GsnNavigatorItem && !isOwnView(((GsnNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof GsnNavigatorGroup) {
			GsnNavigatorGroup group = (GsnNavigatorGroup) element;
			return GsnDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof GsnNavigatorItem) {
			GsnNavigatorItem navigatorItem = (GsnNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (GsnVisualIDRegistry.getVisualID(view)) {
		case GsnEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://omg.sacm/2.0/argumentation?ArgumentPackage", //$NON-NLS-1$
					GsnElementTypes.ArgumentPackage_1003);
		case ModuleEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.eclipse.acme/1.0/gsn?Module", //$NON-NLS-1$
					GsnElementTypes.Module_2301);
		case ContractModuleEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.eclipse.acme/1.0/gsn?ContractModule", //$NON-NLS-1$
					GsnElementTypes.ContractModule_2302);
		case GoalEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.eclipse.acme/1.0/gsn?Goal", GsnElementTypes.Goal_2303); //$NON-NLS-1$
		case StrategyEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.eclipse.acme/1.0/gsn?Strategy", //$NON-NLS-1$
					GsnElementTypes.Strategy_2304);
		case SolutionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.eclipse.acme/1.0/gsn?Solution", //$NON-NLS-1$
					GsnElementTypes.Solution_2305);
		case ContextEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.eclipse.acme/1.0/gsn?Context", //$NON-NLS-1$
					GsnElementTypes.Context_2306);
		case JustificationEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.eclipse.acme/1.0/gsn?Justification", //$NON-NLS-1$
					GsnElementTypes.Justification_2307);
		case AssumptionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.eclipse.acme/1.0/gsn?Assumption", //$NON-NLS-1$
					GsnElementTypes.Assumption_2308);
		case ModuleReferenceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.eclipse.acme/1.0/gsn?ModuleReference", //$NON-NLS-1$
					GsnElementTypes.ModuleReference_2309);
		case ChoiceNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.eclipse.acme/1.0/gsn?ChoiceNode", //$NON-NLS-1$
					GsnElementTypes.ChoiceNode_2310);
		case ContractModuleReferenceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.eclipse.acme/1.0/gsn?ContractModuleReference", //$NON-NLS-1$
					GsnElementTypes.ContractModuleReference_2311);
		case AwayGoalEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.eclipse.acme/1.0/gsn?AwayGoal", //$NON-NLS-1$
					GsnElementTypes.AwayGoal_2312);
		case AwayContextEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.eclipse.acme/1.0/gsn?AwayContext", //$NON-NLS-1$
					GsnElementTypes.AwayContext_2313);
		case AwaySolutionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.eclipse.acme/1.0/gsn?AwaySolution", //$NON-NLS-1$
					GsnElementTypes.AwaySolution_2314);
		case SupportedByEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://org.eclipse.acme/1.0/gsn?SupportedBy", //$NON-NLS-1$
					GsnElementTypes.SupportedBy_4401);
		case InContextOfEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://org.eclipse.acme/1.0/gsn?InContextOf", //$NON-NLS-1$
					GsnElementTypes.InContextOf_4402);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = GsnDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && GsnElementTypes.isKnownElementType(elementType)) {
			image = GsnElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof GsnNavigatorGroup) {
			GsnNavigatorGroup group = (GsnNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof GsnNavigatorItem) {
			GsnNavigatorItem navigatorItem = (GsnNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (GsnVisualIDRegistry.getVisualID(view)) {
		case GsnEditPart.VISUAL_ID:
			return getArgumentPackage_1003Text(view);
		case ModuleEditPart.VISUAL_ID:
			return getModule_2301Text(view);
		case ContractModuleEditPart.VISUAL_ID:
			return getContractModule_2302Text(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_2303Text(view);
		case StrategyEditPart.VISUAL_ID:
			return getStrategy_2304Text(view);
		case SolutionEditPart.VISUAL_ID:
			return getSolution_2305Text(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2306Text(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2307Text(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2308Text(view);
		case ModuleReferenceEditPart.VISUAL_ID:
			return getModuleReference_2309Text(view);
		case ChoiceNodeEditPart.VISUAL_ID:
			return getChoiceNode_2310Text(view);
		case ContractModuleReferenceEditPart.VISUAL_ID:
			return getContractModuleReference_2311Text(view);
		case AwayGoalEditPart.VISUAL_ID:
			return getAwayGoal_2312Text(view);
		case AwayContextEditPart.VISUAL_ID:
			return getAwayContext_2313Text(view);
		case AwaySolutionEditPart.VISUAL_ID:
			return getAwaySolution_2314Text(view);
		case SupportedByEditPart.VISUAL_ID:
			return getSupportedBy_4401Text(view);
		case InContextOfEditPart.VISUAL_ID:
			return getInContextOf_4402Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getArgumentPackage_1003Text(View view) {
		ArgumentPackage domainModelElement = (ArgumentPackage) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getGid();
		} else {
			GsnDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getModule_2301Text(View view) {
		IParser parser = GsnParserProvider.getParser(GsnElementTypes.Module_2301,
				view.getElement() != null ? view.getElement() : view,
				GsnVisualIDRegistry.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GsnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContractModule_2302Text(View view) {
		IParser parser = GsnParserProvider.getParser(GsnElementTypes.ContractModule_2302,
				view.getElement() != null ? view.getElement() : view,
				GsnVisualIDRegistry.getType(WrappingLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GsnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGoal_2303Text(View view) {
		IParser parser = GsnParserProvider.getParser(GsnElementTypes.Goal_2303,
				view.getElement() != null ? view.getElement() : view,
				GsnVisualIDRegistry.getType(WrappingLabel5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GsnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getStrategy_2304Text(View view) {
		IParser parser = GsnParserProvider.getParser(GsnElementTypes.Strategy_2304,
				view.getElement() != null ? view.getElement() : view,
				GsnVisualIDRegistry.getType(WrappingLabel7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GsnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSolution_2305Text(View view) {
		IParser parser = GsnParserProvider.getParser(GsnElementTypes.Solution_2305,
				view.getElement() != null ? view.getElement() : view,
				GsnVisualIDRegistry.getType(WrappingLabel9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GsnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContext_2306Text(View view) {
		IParser parser = GsnParserProvider.getParser(GsnElementTypes.Context_2306,
				view.getElement() != null ? view.getElement() : view,
				GsnVisualIDRegistry.getType(WrappingLabel11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GsnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getJustification_2307Text(View view) {
		IParser parser = GsnParserProvider.getParser(GsnElementTypes.Justification_2307,
				view.getElement() != null ? view.getElement() : view,
				GsnVisualIDRegistry.getType(WrappingLabel13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GsnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssumption_2308Text(View view) {
		IParser parser = GsnParserProvider.getParser(GsnElementTypes.Assumption_2308,
				view.getElement() != null ? view.getElement() : view,
				GsnVisualIDRegistry.getType(WrappingLabel15EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GsnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getModuleReference_2309Text(View view) {
		IParser parser = GsnParserProvider.getParser(GsnElementTypes.ModuleReference_2309,
				view.getElement() != null ? view.getElement() : view,
				GsnVisualIDRegistry.getType(WrappingLabel17EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GsnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getChoiceNode_2310Text(View view) {
		IParser parser = GsnParserProvider.getParser(GsnElementTypes.ChoiceNode_2310,
				view.getElement() != null ? view.getElement() : view,
				GsnVisualIDRegistry.getType(WrappingLabel19EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GsnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContractModuleReference_2311Text(View view) {
		IParser parser = GsnParserProvider.getParser(GsnElementTypes.ContractModuleReference_2311,
				view.getElement() != null ? view.getElement() : view,
				GsnVisualIDRegistry.getType(WrappingLabel20EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GsnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAwayGoal_2312Text(View view) {
		IParser parser = GsnParserProvider.getParser(GsnElementTypes.AwayGoal_2312,
				view.getElement() != null ? view.getElement() : view,
				GsnVisualIDRegistry.getType(WrappingLabel22EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GsnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAwayContext_2313Text(View view) {
		IParser parser = GsnParserProvider.getParser(GsnElementTypes.AwayContext_2313,
				view.getElement() != null ? view.getElement() : view,
				GsnVisualIDRegistry.getType(WrappingLabel25EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GsnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAwaySolution_2314Text(View view) {
		IParser parser = GsnParserProvider.getParser(GsnElementTypes.AwaySolution_2314,
				view.getElement() != null ? view.getElement() : view,
				GsnVisualIDRegistry.getType(WrappingLabel28EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GsnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSupportedBy_4401Text(View view) {
		IParser parser = GsnParserProvider.getParser(GsnElementTypes.SupportedBy_4401,
				view.getElement() != null ? view.getElement() : view,
				GsnVisualIDRegistry.getType(WrappingLabel31EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GsnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInContextOf_4402Text(View view) {
		IParser parser = GsnParserProvider.getParser(GsnElementTypes.InContextOf_4402,
				view.getElement() != null ? view.getElement() : view,
				GsnVisualIDRegistry.getType(WrappingLabel32EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GsnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return GsnEditPart.MODEL_ID.equals(GsnVisualIDRegistry.getModelID(view));
	}

}
