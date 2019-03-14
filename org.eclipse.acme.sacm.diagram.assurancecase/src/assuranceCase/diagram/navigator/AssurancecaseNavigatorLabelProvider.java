package assuranceCase.diagram.navigator;

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

/**
 * @generated
 */
public class AssurancecaseNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof assuranceCase.diagram.navigator.AssurancecaseNavigatorItem
				&& !isOwnView(((assuranceCase.diagram.navigator.AssurancecaseNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof assuranceCase.diagram.navigator.AssurancecaseNavigatorGroup) {
			assuranceCase.diagram.navigator.AssurancecaseNavigatorGroup group = (assuranceCase.diagram.navigator.AssurancecaseNavigatorGroup) element;
			return assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof assuranceCase.diagram.navigator.AssurancecaseNavigatorItem) {
			assuranceCase.diagram.navigator.AssurancecaseNavigatorItem navigatorItem = (assuranceCase.diagram.navigator.AssurancecaseNavigatorItem) element;
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
		switch (assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getVisualID(view)) {
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://omg.sacm/2.0/assurancecase?AssuranceCasePackage", //$NON-NLS-1$
					assuranceCase.diagram.providers.AssurancecaseElementTypes.AssuranceCasePackage_1000);
		case assuranceCase.diagram.edit.parts.AssuranceCasePackage2EditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/assurancecase?AssuranceCasePackage", //$NON-NLS-1$
					assuranceCase.diagram.providers.AssurancecaseElementTypes.AssuranceCasePackage_2001);
		case assuranceCase.diagram.edit.parts.ArgumentPackageBindingEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/argumentation?ArgumentPackageBinding", //$NON-NLS-1$
					assuranceCase.diagram.providers.AssurancecaseElementTypes.ArgumentPackageBinding_2002);
		case assuranceCase.diagram.edit.parts.ArgumentPackageInterfaceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/argumentation?ArgumentPackageInterface", //$NON-NLS-1$
					assuranceCase.diagram.providers.AssurancecaseElementTypes.ArgumentPackageInterface_2003);
		case assuranceCase.diagram.edit.parts.ArgumentPackageEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/argumentation?ArgumentPackage", //$NON-NLS-1$
					assuranceCase.diagram.providers.AssurancecaseElementTypes.ArgumentPackage_2004);
		case assuranceCase.diagram.edit.parts.ArtifactPackageEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/artifact?ArtifactPackage", //$NON-NLS-1$
					assuranceCase.diagram.providers.AssurancecaseElementTypes.ArtifactPackage_2007);
		case assuranceCase.diagram.edit.parts.ArtifactPackageBindingEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/artifact?ArtifactPackageBinding", //$NON-NLS-1$
					assuranceCase.diagram.providers.AssurancecaseElementTypes.ArtifactPackageBinding_2008);
		case assuranceCase.diagram.edit.parts.ArtifactPackageInterfaceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/artifact?ArtifactPackageInterface", //$NON-NLS-1$
					assuranceCase.diagram.providers.AssurancecaseElementTypes.ArtifactPackageInterface_2009);
		case assuranceCase.diagram.edit.parts.TerminologyPackageEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/terminology?TerminologyPackage", //$NON-NLS-1$
					assuranceCase.diagram.providers.AssurancecaseElementTypes.TerminologyPackage_2010);
		case assuranceCase.diagram.edit.parts.TerminologyPackageInterfaceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/terminology?TerminologyPackageInterface", //$NON-NLS-1$
					assuranceCase.diagram.providers.AssurancecaseElementTypes.TerminologyPackageInterface_2011);
		case assuranceCase.diagram.edit.parts.TerminologyPackageBindingEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/terminology?TerminologyPackageBinding", //$NON-NLS-1$
					assuranceCase.diagram.providers.AssurancecaseElementTypes.TerminologyPackageBinding_2012);
		case assuranceCase.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.eclipse.acme/1.0/gsn?Module", //$NON-NLS-1$
					assuranceCase.diagram.providers.AssurancecaseElementTypes.Module_2013);
		case assuranceCase.diagram.edit.parts.ContractModuleEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.eclipse.acme/1.0/gsn?ContractModule", //$NON-NLS-1$
					assuranceCase.diagram.providers.AssurancecaseElementTypes.ContractModule_2014);
		case assuranceCase.diagram.edit.parts.CAEModuleEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.eclipse.acme/1.0/cae?CAEModule", //$NON-NLS-1$
					assuranceCase.diagram.providers.AssurancecaseElementTypes.CAEModule_2015);
		case assuranceCase.diagram.edit.parts.CAEModuleInterfaceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.eclipse.acme/1.0/cae?CAEModuleInterface", //$NON-NLS-1$
					assuranceCase.diagram.providers.AssurancecaseElementTypes.CAEModuleInterface_2016);
		case assuranceCase.diagram.edit.parts.CAEModuleBindingEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://org.eclipse.acme/1.0/cae?CAEModuleBinding", //$NON-NLS-1$
					assuranceCase.diagram.providers.AssurancecaseElementTypes.CAEModuleBinding_2017);
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageBindingEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/assurancecase?AssuranceCasePackageBinding", //$NON-NLS-1$
					assuranceCase.diagram.providers.AssurancecaseElementTypes.AssuranceCasePackageBinding_2018);
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageInterfaceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/assurancecase?AssuranceCasePackageInterface", //$NON-NLS-1$
					assuranceCase.diagram.providers.AssurancecaseElementTypes.AssuranceCasePackageInterface_2019);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& assuranceCase.diagram.providers.AssurancecaseElementTypes.isKnownElementType(elementType)) {
			image = assuranceCase.diagram.providers.AssurancecaseElementTypes.getImage(elementType);
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
		if (element instanceof assuranceCase.diagram.navigator.AssurancecaseNavigatorGroup) {
			assuranceCase.diagram.navigator.AssurancecaseNavigatorGroup group = (assuranceCase.diagram.navigator.AssurancecaseNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof assuranceCase.diagram.navigator.AssurancecaseNavigatorItem) {
			assuranceCase.diagram.navigator.AssurancecaseNavigatorItem navigatorItem = (assuranceCase.diagram.navigator.AssurancecaseNavigatorItem) element;
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
		switch (assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getVisualID(view)) {
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart.VISUAL_ID:
			return getAssuranceCasePackage_1000Text(view);
		case assuranceCase.diagram.edit.parts.AssuranceCasePackage2EditPart.VISUAL_ID:
			return getAssuranceCasePackage_2001Text(view);
		case assuranceCase.diagram.edit.parts.ArgumentPackageBindingEditPart.VISUAL_ID:
			return getArgumentPackageBinding_2002Text(view);
		case assuranceCase.diagram.edit.parts.ArgumentPackageInterfaceEditPart.VISUAL_ID:
			return getArgumentPackageInterface_2003Text(view);
		case assuranceCase.diagram.edit.parts.ArgumentPackageEditPart.VISUAL_ID:
			return getArgumentPackage_2004Text(view);
		case assuranceCase.diagram.edit.parts.ArtifactPackageEditPart.VISUAL_ID:
			return getArtifactPackage_2007Text(view);
		case assuranceCase.diagram.edit.parts.ArtifactPackageBindingEditPart.VISUAL_ID:
			return getArtifactPackageBinding_2008Text(view);
		case assuranceCase.diagram.edit.parts.ArtifactPackageInterfaceEditPart.VISUAL_ID:
			return getArtifactPackageInterface_2009Text(view);
		case assuranceCase.diagram.edit.parts.TerminologyPackageEditPart.VISUAL_ID:
			return getTerminologyPackage_2010Text(view);
		case assuranceCase.diagram.edit.parts.TerminologyPackageInterfaceEditPart.VISUAL_ID:
			return getTerminologyPackageInterface_2011Text(view);
		case assuranceCase.diagram.edit.parts.TerminologyPackageBindingEditPart.VISUAL_ID:
			return getTerminologyPackageBinding_2012Text(view);
		case assuranceCase.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
			return getModule_2013Text(view);
		case assuranceCase.diagram.edit.parts.ContractModuleEditPart.VISUAL_ID:
			return getContractModule_2014Text(view);
		case assuranceCase.diagram.edit.parts.CAEModuleEditPart.VISUAL_ID:
			return getCAEModule_2015Text(view);
		case assuranceCase.diagram.edit.parts.CAEModuleInterfaceEditPart.VISUAL_ID:
			return getCAEModuleInterface_2016Text(view);
		case assuranceCase.diagram.edit.parts.CAEModuleBindingEditPart.VISUAL_ID:
			return getCAEModuleBinding_2017Text(view);
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageBindingEditPart.VISUAL_ID:
			return getAssuranceCasePackageBinding_2018Text(view);
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageInterfaceEditPart.VISUAL_ID:
			return getAssuranceCasePackageInterface_2019Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getAssuranceCasePackage_1000Text(View view) {
		assuranceCase.AssuranceCasePackage domainModelElement = (assuranceCase.AssuranceCasePackage) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getGid();
		} else {
			assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssuranceCasePackage_2001Text(View view) {
		IParser parser = assuranceCase.diagram.providers.AssurancecaseParserProvider.getParser(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.AssuranceCasePackage_2001,
				view.getElement() != null ? view.getElement() : view,
				assuranceCase.diagram.part.AssurancecaseVisualIDRegistry
						.getType(assuranceCase.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArgumentPackageBinding_2002Text(View view) {
		IParser parser = assuranceCase.diagram.providers.AssurancecaseParserProvider.getParser(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.ArgumentPackageBinding_2002,
				view.getElement() != null ? view.getElement() : view,
				assuranceCase.diagram.part.AssurancecaseVisualIDRegistry
						.getType(assuranceCase.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArgumentPackageInterface_2003Text(View view) {
		IParser parser = assuranceCase.diagram.providers.AssurancecaseParserProvider.getParser(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.ArgumentPackageInterface_2003,
				view.getElement() != null ? view.getElement() : view,
				assuranceCase.diagram.part.AssurancecaseVisualIDRegistry
						.getType(assuranceCase.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArgumentPackage_2004Text(View view) {
		IParser parser = assuranceCase.diagram.providers.AssurancecaseParserProvider.getParser(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.ArgumentPackage_2004,
				view.getElement() != null ? view.getElement() : view,
				assuranceCase.diagram.part.AssurancecaseVisualIDRegistry
						.getType(assuranceCase.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArtifactPackage_2007Text(View view) {
		IParser parser = assuranceCase.diagram.providers.AssurancecaseParserProvider.getParser(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.ArtifactPackage_2007,
				view.getElement() != null ? view.getElement() : view,
				assuranceCase.diagram.part.AssurancecaseVisualIDRegistry
						.getType(assuranceCase.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArtifactPackageBinding_2008Text(View view) {
		IParser parser = assuranceCase.diagram.providers.AssurancecaseParserProvider.getParser(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.ArtifactPackageBinding_2008,
				view.getElement() != null ? view.getElement() : view,
				assuranceCase.diagram.part.AssurancecaseVisualIDRegistry
						.getType(assuranceCase.diagram.edit.parts.WrappingLabel15EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArtifactPackageInterface_2009Text(View view) {
		IParser parser = assuranceCase.diagram.providers.AssurancecaseParserProvider.getParser(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.ArtifactPackageInterface_2009,
				view.getElement() != null ? view.getElement() : view,
				assuranceCase.diagram.part.AssurancecaseVisualIDRegistry
						.getType(assuranceCase.diagram.edit.parts.WrappingLabel17EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTerminologyPackage_2010Text(View view) {
		IParser parser = assuranceCase.diagram.providers.AssurancecaseParserProvider.getParser(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.TerminologyPackage_2010,
				view.getElement() != null ? view.getElement() : view,
				assuranceCase.diagram.part.AssurancecaseVisualIDRegistry
						.getType(assuranceCase.diagram.edit.parts.WrappingLabel19EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTerminologyPackageInterface_2011Text(View view) {
		IParser parser = assuranceCase.diagram.providers.AssurancecaseParserProvider.getParser(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.TerminologyPackageInterface_2011,
				view.getElement() != null ? view.getElement() : view,
				assuranceCase.diagram.part.AssurancecaseVisualIDRegistry
						.getType(assuranceCase.diagram.edit.parts.WrappingLabel21EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTerminologyPackageBinding_2012Text(View view) {
		IParser parser = assuranceCase.diagram.providers.AssurancecaseParserProvider.getParser(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.TerminologyPackageBinding_2012,
				view.getElement() != null ? view.getElement() : view,
				assuranceCase.diagram.part.AssurancecaseVisualIDRegistry
						.getType(assuranceCase.diagram.edit.parts.WrappingLabel23EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getModule_2013Text(View view) {
		IParser parser = assuranceCase.diagram.providers.AssurancecaseParserProvider.getParser(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.Module_2013,
				view.getElement() != null ? view.getElement() : view,
				assuranceCase.diagram.part.AssurancecaseVisualIDRegistry
						.getType(assuranceCase.diagram.edit.parts.WrappingLabel25EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContractModule_2014Text(View view) {
		IParser parser = assuranceCase.diagram.providers.AssurancecaseParserProvider.getParser(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.ContractModule_2014,
				view.getElement() != null ? view.getElement() : view,
				assuranceCase.diagram.part.AssurancecaseVisualIDRegistry
						.getType(assuranceCase.diagram.edit.parts.WrappingLabel27EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCAEModule_2015Text(View view) {
		IParser parser = assuranceCase.diagram.providers.AssurancecaseParserProvider.getParser(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.CAEModule_2015,
				view.getElement() != null ? view.getElement() : view,
				assuranceCase.diagram.part.AssurancecaseVisualIDRegistry
						.getType(assuranceCase.diagram.edit.parts.WrappingLabel29EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCAEModuleInterface_2016Text(View view) {
		IParser parser = assuranceCase.diagram.providers.AssurancecaseParserProvider.getParser(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.CAEModuleInterface_2016,
				view.getElement() != null ? view.getElement() : view,
				assuranceCase.diagram.part.AssurancecaseVisualIDRegistry
						.getType(assuranceCase.diagram.edit.parts.WrappingLabel31EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCAEModuleBinding_2017Text(View view) {
		IParser parser = assuranceCase.diagram.providers.AssurancecaseParserProvider.getParser(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.CAEModuleBinding_2017,
				view.getElement() != null ? view.getElement() : view,
				assuranceCase.diagram.part.AssurancecaseVisualIDRegistry
						.getType(assuranceCase.diagram.edit.parts.WrappingLabel33EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssuranceCasePackageBinding_2018Text(View view) {
		IParser parser = assuranceCase.diagram.providers.AssurancecaseParserProvider.getParser(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.AssuranceCasePackageBinding_2018,
				view.getElement() != null ? view.getElement() : view,
				assuranceCase.diagram.part.AssurancecaseVisualIDRegistry
						.getType(assuranceCase.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssuranceCasePackageInterface_2019Text(View view) {
		IParser parser = assuranceCase.diagram.providers.AssurancecaseParserProvider.getParser(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.AssuranceCasePackageInterface_2019,
				view.getElement() != null ? view.getElement() : view,
				assuranceCase.diagram.part.AssurancecaseVisualIDRegistry
						.getType(assuranceCase.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5037); //$NON-NLS-1$
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
		return assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart.MODEL_ID
				.equals(assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getModelID(view));
	}

}
