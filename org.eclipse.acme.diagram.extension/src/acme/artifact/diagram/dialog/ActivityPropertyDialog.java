/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
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
import artifact.Activity;
import artifact.Artifact_Package;
import base.ModelElement;

public class ActivityPropertyDialog extends ACMEAbstractArtefactDialog {

	protected Label startTimeLabel;
	protected Text statTimeText;
	protected Button startTimeButton;
	protected String startTimeString;
	
	protected Label endTimeLabel;
	protected Text endTimeText;
	protected Button endTimeButton;
	protected String endTimeString;

	public ActivityPropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for Activity: " + getName();
	}

	@Override
	protected void createCustomGroups(Composite control) {
		createTimeGroup(control);
	}
	
	protected void createTimeGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Times", 3);

		startTimeLabel = new Label(groupContent, SWT.NONE);
		GridData start_time_label_data = new GridData(SWT.FILL);
		start_time_label_data.widthHint = LABEL_WIDTH;
		startTimeLabel.setLayoutData(start_time_label_data);
		startTimeLabel.setText("Start Time: ");

		statTimeText = new Text(groupContent, SWT.BORDER);
		statTimeText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		statTimeText.setBackground(ColorConstants.white);
		statTimeText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
			}
		});

		Activity activity = (Activity) modelElement;
		if (activity.getStartTime() != null) {
			Date date = activity.getStartTime();
			SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
			statTimeText.setText(format.format(date));
		}

		startTimeButton = new Button(groupContent, SWT.NONE);
		startTimeButton.setText("Select...");
		startTimeButton.addSelectionListener(new SelectionListener() {

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
//						activity.setStartTime(date);
						ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
								activity, 
								Artifact_Package.eINSTANCE.getActivity_StartTime(), 
								date);
						SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
						statTimeText.setText(format.format(date));
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
		
		

		endTimeLabel = new Label(groupContent, SWT.NONE);
		GridData end_time_label_data = new GridData(SWT.FILL);
		end_time_label_data.widthHint = LABEL_WIDTH;
		endTimeLabel.setLayoutData(end_time_label_data);
		endTimeLabel.setText("End Time: ");

		endTimeText = new Text(groupContent, SWT.BORDER);
		endTimeText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		endTimeText.setBackground(ColorConstants.white);
		endTimeText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
			}
		});

		if (activity.getEndTime() != null) {
			Date date = activity.getEndTime();
			SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
			endTimeText.setText(format.format(date));
		}

		endTimeButton = new Button(groupContent, SWT.NONE);
		endTimeButton.setText("Select...");
		endTimeButton.addSelectionListener(new SelectionListener() {

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
//						activity.setEndTime(date);
						ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
								activity, 
								Artifact_Package.eINSTANCE.getActivity_EndTime(), 
								date);
						SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
						endTimeText.setText(format.format(date));
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

