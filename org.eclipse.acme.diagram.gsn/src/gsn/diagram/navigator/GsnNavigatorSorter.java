package gsn.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import gsn.diagram.part.GsnVisualIDRegistry;

/**
 * @generated
 */
public class GsnNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4404;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof GsnNavigatorItem) {
			GsnNavigatorItem item = (GsnNavigatorItem) element;
			return GsnVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
