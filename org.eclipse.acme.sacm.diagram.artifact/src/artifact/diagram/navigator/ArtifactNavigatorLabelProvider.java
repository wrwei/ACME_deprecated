package artifact.diagram.navigator;

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

import artifact.ArtifactPackage;
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
import artifact.diagram.edit.parts.WrappingLabel11EditPart;
import artifact.diagram.edit.parts.WrappingLabel13EditPart;
import artifact.diagram.edit.parts.WrappingLabel15EditPart;
import artifact.diagram.edit.parts.WrappingLabel17EditPart;
import artifact.diagram.edit.parts.WrappingLabel19EditPart;
import artifact.diagram.edit.parts.WrappingLabel21EditPart;
import artifact.diagram.edit.parts.WrappingLabel23EditPart;
import artifact.diagram.edit.parts.WrappingLabel3EditPart;
import artifact.diagram.edit.parts.WrappingLabel5EditPart;
import artifact.diagram.edit.parts.WrappingLabel7EditPart;
import artifact.diagram.edit.parts.WrappingLabel9EditPart;
import artifact.diagram.edit.parts.WrappingLabelEditPart;
import artifact.diagram.part.ArtifactDiagramEditorPlugin;
import artifact.diagram.part.ArtifactVisualIDRegistry;
import artifact.diagram.providers.ArtifactElementTypes;
import artifact.diagram.providers.ArtifactParserProvider;

/**
 * @generated
 */
public class ArtifactNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ArtifactDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		ArtifactDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ArtifactNavigatorItem && !isOwnView(((ArtifactNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ArtifactNavigatorGroup) {
			ArtifactNavigatorGroup group = (ArtifactNavigatorGroup) element;
			return ArtifactDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ArtifactNavigatorItem) {
			ArtifactNavigatorItem navigatorItem = (ArtifactNavigatorItem) element;
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
		switch (ArtifactVisualIDRegistry.getVisualID(view)) {
		case ArtifactPackageCanvasEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://omg.sacm/2.0/artifact?ArtifactPackage", //$NON-NLS-1$
					ArtifactElementTypes.ArtifactPackage_1002);
		case ArtifactPackageEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/artifact?ArtifactPackage", //$NON-NLS-1$
					ArtifactElementTypes.ArtifactPackage_2101);
		case ArtifactPackageInterfaceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/artifact?ArtifactPackageInterface", //$NON-NLS-1$
					ArtifactElementTypes.ArtifactPackageInterface_2102);
		case ArtifactPackageBindingEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/artifact?ArtifactPackageBinding", //$NON-NLS-1$
					ArtifactElementTypes.ArtifactPackageBinding_2103);
		case TechniqueEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/artifact?Technique", //$NON-NLS-1$
					ArtifactElementTypes.Technique_2104);
		case ActivityEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/artifact?Activity", //$NON-NLS-1$
					ArtifactElementTypes.Activity_2105);
		case ParticipantEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/artifact?Participant", //$NON-NLS-1$
					ArtifactElementTypes.Participant_2106);
		case ArtifactEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/artifact?Artifact", //$NON-NLS-1$
					ArtifactElementTypes.Artifact_2107);
		case ResourceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/artifact?Resource", //$NON-NLS-1$
					ArtifactElementTypes.Resource_2108);
		case PropertyEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/artifact?Property", //$NON-NLS-1$
					ArtifactElementTypes.Property_2109);
		case EventEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/artifact?Event", //$NON-NLS-1$
					ArtifactElementTypes.Event_2110);
		case ArtifactGroupEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/artifact?ArtifactGroup", //$NON-NLS-1$
					ArtifactElementTypes.ArtifactGroup_2111);
		case ArtifactAssetRelationshipEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://omg.sacm/2.0/artifact?ArtifactAssetRelationship", //$NON-NLS-1$
					ArtifactElementTypes.ArtifactAssetRelationship_4101);
		case ArtifactAssetArtifactPropertyEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://omg.sacm/2.0/artifact?ArtifactAsset?artifactProperty", //$NON-NLS-1$
					ArtifactElementTypes.ArtifactAssetArtifactProperty_4102);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ArtifactDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ArtifactElementTypes.isKnownElementType(elementType)) {
			image = ArtifactElementTypes.getImage(elementType);
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
		if (element instanceof ArtifactNavigatorGroup) {
			ArtifactNavigatorGroup group = (ArtifactNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ArtifactNavigatorItem) {
			ArtifactNavigatorItem navigatorItem = (ArtifactNavigatorItem) element;
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
		switch (ArtifactVisualIDRegistry.getVisualID(view)) {
		case ArtifactPackageCanvasEditPart.VISUAL_ID:
			return getArtifactPackage_1002Text(view);
		case ArtifactPackageEditPart.VISUAL_ID:
			return getArtifactPackage_2101Text(view);
		case ArtifactPackageInterfaceEditPart.VISUAL_ID:
			return getArtifactPackageInterface_2102Text(view);
		case ArtifactPackageBindingEditPart.VISUAL_ID:
			return getArtifactPackageBinding_2103Text(view);
		case TechniqueEditPart.VISUAL_ID:
			return getTechnique_2104Text(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2105Text(view);
		case ParticipantEditPart.VISUAL_ID:
			return getParticipant_2106Text(view);
		case ArtifactEditPart.VISUAL_ID:
			return getArtifact_2107Text(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_2108Text(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_2109Text(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2110Text(view);
		case ArtifactGroupEditPart.VISUAL_ID:
			return getArtifactGroup_2111Text(view);
		case ArtifactAssetRelationshipEditPart.VISUAL_ID:
			return getArtifactAssetRelationship_4101Text(view);
		case ArtifactAssetArtifactPropertyEditPart.VISUAL_ID:
			return getArtifactAssetArtifactProperty_4102Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getArtifactPackage_1002Text(View view) {
		ArtifactPackage domainModelElement = (ArtifactPackage) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getGid();
		} else {
			ArtifactDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArtifactPackage_2101Text(View view) {
		IParser parser = ArtifactParserProvider.getParser(ArtifactElementTypes.ArtifactPackage_2101,
				view.getElement() != null ? view.getElement() : view,
				ArtifactVisualIDRegistry.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArtifactDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArtifactPackageInterface_2102Text(View view) {
		IParser parser = ArtifactParserProvider.getParser(ArtifactElementTypes.ArtifactPackageInterface_2102,
				view.getElement() != null ? view.getElement() : view,
				ArtifactVisualIDRegistry.getType(WrappingLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArtifactDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArtifactPackageBinding_2103Text(View view) {
		IParser parser = ArtifactParserProvider.getParser(ArtifactElementTypes.ArtifactPackageBinding_2103,
				view.getElement() != null ? view.getElement() : view,
				ArtifactVisualIDRegistry.getType(WrappingLabel5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArtifactDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTechnique_2104Text(View view) {
		IParser parser = ArtifactParserProvider.getParser(ArtifactElementTypes.Technique_2104,
				view.getElement() != null ? view.getElement() : view,
				ArtifactVisualIDRegistry.getType(WrappingLabel7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArtifactDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActivity_2105Text(View view) {
		IParser parser = ArtifactParserProvider.getParser(ArtifactElementTypes.Activity_2105,
				view.getElement() != null ? view.getElement() : view,
				ArtifactVisualIDRegistry.getType(WrappingLabel9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArtifactDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getParticipant_2106Text(View view) {
		IParser parser = ArtifactParserProvider.getParser(ArtifactElementTypes.Participant_2106,
				view.getElement() != null ? view.getElement() : view,
				ArtifactVisualIDRegistry.getType(WrappingLabel11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArtifactDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArtifact_2107Text(View view) {
		IParser parser = ArtifactParserProvider.getParser(ArtifactElementTypes.Artifact_2107,
				view.getElement() != null ? view.getElement() : view,
				ArtifactVisualIDRegistry.getType(WrappingLabel13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArtifactDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getResource_2108Text(View view) {
		IParser parser = ArtifactParserProvider.getParser(ArtifactElementTypes.Resource_2108,
				view.getElement() != null ? view.getElement() : view,
				ArtifactVisualIDRegistry.getType(WrappingLabel15EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArtifactDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProperty_2109Text(View view) {
		IParser parser = ArtifactParserProvider.getParser(ArtifactElementTypes.Property_2109,
				view.getElement() != null ? view.getElement() : view,
				ArtifactVisualIDRegistry.getType(WrappingLabel17EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArtifactDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEvent_2110Text(View view) {
		IParser parser = ArtifactParserProvider.getParser(ArtifactElementTypes.Event_2110,
				view.getElement() != null ? view.getElement() : view,
				ArtifactVisualIDRegistry.getType(WrappingLabel19EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArtifactDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArtifactGroup_2111Text(View view) {
		IParser parser = ArtifactParserProvider.getParser(ArtifactElementTypes.ArtifactGroup_2111,
				view.getElement() != null ? view.getElement() : view,
				ArtifactVisualIDRegistry.getType(WrappingLabel21EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArtifactDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArtifactAssetRelationship_4101Text(View view) {
		IParser parser = ArtifactParserProvider.getParser(ArtifactElementTypes.ArtifactAssetRelationship_4101,
				view.getElement() != null ? view.getElement() : view,
				ArtifactVisualIDRegistry.getType(WrappingLabel23EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArtifactDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArtifactAssetArtifactProperty_4102Text(View view) {
		return ""; //$NON-NLS-1$
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
		return ArtifactPackageCanvasEditPart.MODEL_ID.equals(ArtifactVisualIDRegistry.getModelID(view));
	}

}
