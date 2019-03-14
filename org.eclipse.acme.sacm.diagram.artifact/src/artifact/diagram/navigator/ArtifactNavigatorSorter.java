package artifact.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import artifact.diagram.part.ArtifactVisualIDRegistry;

/**
 * @generated
 */
public class ArtifactNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4104;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ArtifactNavigatorItem) {
			ArtifactNavigatorItem item = (ArtifactNavigatorItem) element;
			return ArtifactVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
