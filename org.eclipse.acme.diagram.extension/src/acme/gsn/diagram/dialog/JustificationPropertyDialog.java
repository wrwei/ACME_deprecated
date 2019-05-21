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

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import acme.common.diagram.dialog.ModelElementPropertyDialog;
import base.ModelElement;
import gsn.Justification;

public class JustificationPropertyDialog extends ModelElementPropertyDialog {

	public JustificationPropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for Justification: " + getName();
	}
	
	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		createFeaturesGroup(control);
	}

	protected void createFeaturesGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Features", 2);

		Justification justification = (Justification) modelElement;
		uninstantiated = justification.isUninstantiated();
		createUninstantiatedCheckButton(groupContent);
	}

	public boolean getIsUninstantiated() {
		return uninstantiated;
	}
}
