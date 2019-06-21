/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
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
import gsn.Strategy;

public class StrategyPropertyDialog extends ModelElementPropertyDialog {

	protected boolean undeveloped = false;
	
	protected Button isPublicButton;
	protected Button undevelopedCheckBox;


	public StrategyPropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for Strategy: " + getName();
	}
	
	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		createFeaturesGroup(control);
	}

	protected void createFeaturesGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Features", 2);

		Strategy strategy = (Strategy) modelElement;
		undeveloped = strategy.isUndeveloped();
		uninstantiated = strategy.isUninstantiated();
		
		createUndevelopedCheckButton(groupContent);
		createUninstantiatedCheckButton(groupContent);
	}
	
	private void createUndevelopedCheckButton(Composite container) {
		undevelopedCheckBox = new Button(container, SWT.CHECK);
		undevelopedCheckBox.setSelection(undeveloped);
		undevelopedCheckBox.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				if (btn.getSelection()) {
					undeveloped = true;
				}
				else {
					undeveloped = false;
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				btn.setSelection(undeveloped);
			}
		});
		createLabel(container, "Undeveloped");

	}
	
	public boolean getUndeveloped() {
		return undeveloped;
	}
}
