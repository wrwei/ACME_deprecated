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
package acme.artifact.diagram.dialog;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import acme.diagram.util.EditingDomainUtil;
import acme.diagram.util.ModelElementFeatureUtil;
import artifact.Artifact;
import artifact.Artifact_Package;
import base.ModelElement;

public class ArtefactPropertyDialog extends ACMEAbstractArtefactDialog {

	protected Label versionLabel;
	protected Text versionText;

	
	protected Label timeLabel;
	protected Text timeText;
	protected Button timeButton;
	protected String timeString;
	
	public ArtefactPropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for Artefact: " + getName();
	}

	@Override
	protected void createCustomGroups(Composite control) {
		createTimeGroup(control);
	}
	
	protected void createTimeGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Times", 3);

		timeLabel = new Label(groupContent, SWT.NONE);
		GridData time_label_data = new GridData(SWT.FILL);
		time_label_data.widthHint = LABEL_WIDTH;
		timeLabel.setLayoutData(time_label_data);
		timeLabel.setText("Date: ");

		timeText = new Text(groupContent, SWT.BORDER);
		timeText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		timeText.setBackground(ColorConstants.white);
		timeText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
			}
		});

		Artifact artifact = (Artifact) modelElement;
		if (artifact.getDate() != null) {
			Date date = artifact.getDate();
			SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
			timeText.setText(format.format(date));
		}

		timeButton = new Button(groupContent, SWT.NONE);
		timeButton.setText("Select...");
		timeButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				Shell shell = new Shell(getShell(), SWT.DIALOG_TRIM);
				shell.setLayout(new GridLayout(1, false));
				DateTime calendar = new DateTime(shell, SWT.CALENDAR);
				DateTime time = new DateTime(shell, SWT.TIME);
				new Label(shell, SWT.NONE);
				new Label(shell, SWT.NONE);
				Button ok = new Button(shell, SWT.PUSH);
				ok.setText("OK");
				ok.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
				ok.addSelectionListener(new SelectionListener() {

					@Override
					public void widgetSelected(SelectionEvent e) {
						@SuppressWarnings("deprecation")
						Date date = new Date(calendar.getYear()-1900, calendar.getMonth(), calendar.getDay(), time.getHours(), time.getMinutes(), time.getSeconds());
//						artifact.setDate(date);
						ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
								artifact, 
								Artifact_Package.eINSTANCE.getArtifact_Date(), 
								date);
						SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
						timeText.setText(format.format(date));
						shell.close();
					}

					@Override
					public void widgetDefaultSelected(SelectionEvent e) {
					}
				});
				shell.pack();
				shell.open();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
		groupContent.layout();
		groupContent.pack();
	}

}
