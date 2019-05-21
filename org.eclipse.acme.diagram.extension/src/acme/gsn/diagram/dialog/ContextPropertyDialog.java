/*******************************************************************************
 * Copyright (c) 2011-2017 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.gsn.diagram.dialog;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import acme.common.diagram.dialog.ModelElementPropertyDialog;
import base.ModelElement;
import gsn.Context;

public class ContextPropertyDialog extends ModelElementPropertyDialog {

	protected boolean isPublic = false;
	protected Button isPublicButton;

	
	public ContextPropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected String getTitleString() {
 		return "Edit the properties for Context: " + getName();
	}
	
	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		createFeaturesGroup(control);
	}

	protected void createFeaturesGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Features", 2);

		Context context = (Context) modelElement;
		isPublic = context.isIsPublic();
		uninstantiated = context.isUninstantiated();
		
		createIsPublicCheckButton(groupContent);
		createUninstantiatedCheckButton(groupContent);
	}
	
	private void createIsPublicCheckButton(Composite container) {
		isPublicButton = new Button(container, SWT.CHECK);
		isPublicButton.setSelection(isPublic);
		isPublicButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				if (btn.getSelection()) {
					isPublic = true;
				}
				else {
					isPublic = false;
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				btn.setSelection(isPublic);
			}
		});
		createLabel(container, "Public");
	}
	
	public boolean getIsPublic() {
		return isPublic;
	}
	
}
