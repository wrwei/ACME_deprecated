package argumentation.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import argumentation.diagram.part.ArgumentationVisualIDRegistry;

/**
 * @generated
 */
public class ArgumentationNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4206;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ArgumentationNavigatorItem) {
			ArgumentationNavigatorItem item = (ArgumentationNavigatorItem) element;
			return ArgumentationVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
