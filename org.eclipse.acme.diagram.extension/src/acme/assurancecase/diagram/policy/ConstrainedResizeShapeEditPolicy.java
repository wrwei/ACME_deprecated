/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.assurancecase.diagram.policy;

import java.util.List;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.handles.ResizeHandle;
import org.eclipse.gef.tools.ResizeTracker;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;

public class ConstrainedResizeShapeEditPolicy extends ResizableShapeEditPolicy {

	private final GraphicalEditPart editPart;
	
	public ConstrainedResizeShapeEditPolicy(GraphicalEditPart editPart) {
		this.editPart = editPart;
	}
	
	@Override
	protected List<Object> createSelectionHandles() {
		@SuppressWarnings("unchecked")
		List<Object> list = super.createSelectionHandles();
		list.clear();
		list.add(createHandle(PositionConstants.NORTH_WEST));
		list.add(createHandle(PositionConstants.NORTH_EAST));
		list.add(createHandle(PositionConstants.SOUTH_WEST));
		list.add(createHandle(PositionConstants.SOUTH_EAST));
		return list;
	}
	
	private ResizeHandle createHandle(final int direction) {
		return new ResizeHandle(this.editPart, direction) {
			@Override
			protected DragTracker createDragTracker() {
				return new ResizeTracker(getOwner(), direction) {
					@Override
					public void mouseDrag(MouseEvent me, EditPartViewer viewer) {
						me.stateMask |= SWT.SHIFT;
						super.mouseDrag(me, viewer);
					}
				};
			}
		};
	}
}
