package acme.diagram.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

public abstract class BrowseModelElementListener implements Listener{

	@Override
	public void handleEvent(Event event) {
		ElementListSelectionDialog dialog = new ElementListSelectionDialog( 
				Display.getDefault().getActiveShell(), 
				new LabelProvider() {

					@Override
					public String getText(Object element) {
						return (String) element;
					}
					
					Image image = null;
					
					@Override
					public Image getImage(Object element) {
						return image;
					}
					
				});
		
		dialog.setMessage(getMessage());
		dialog.setTitle(getTitle());
		
		List<String> modelElements = new ArrayList<String>();
		modelElements.addAll(getModelElements());
		
		dialog.setElements(modelElements.toArray());
		
		if (dialog.open() == Window.OK) {
			if (dialog.getResult().length > 0) {
				selectionChanged((String) dialog.getResult()[0]);
			}
		}
	}

	public abstract void selectionChanged(String selection);
	public abstract String getMessage();
	public abstract String getTitle();
	public abstract ArrayList<String> getModelElements();

}
