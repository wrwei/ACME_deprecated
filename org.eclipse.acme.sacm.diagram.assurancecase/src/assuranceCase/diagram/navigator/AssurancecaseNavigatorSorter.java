package assuranceCase.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class AssurancecaseNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 2021;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof assuranceCase.diagram.navigator.AssurancecaseNavigatorItem) {
			assuranceCase.diagram.navigator.AssurancecaseNavigatorItem item = (assuranceCase.diagram.navigator.AssurancecaseNavigatorItem) element;
			return assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
