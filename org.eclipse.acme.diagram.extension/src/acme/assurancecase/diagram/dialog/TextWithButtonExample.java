/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.assurancecase.diagram.dialog;


import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class TextWithButtonExample {

	public class TextWithButton {
		public TextWithButton(final Composite parent)
		{
			final Composite baseComposite = new Composite(parent, SWT.BORDER);
			baseComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
			final GridLayout basecompositeGridLayout = new GridLayout(2, false);
			basecompositeGridLayout.marginHeight = 0;
			basecompositeGridLayout.marginWidth = 0;
			baseComposite.setLayout(basecompositeGridLayout);
			
			baseComposite.setBackground(new Color(parent.getDisplay(), new RGB(255, 255, 255)));
			baseComposite.setBackgroundMode(SWT.INHERIT_FORCE);
			
			final Text text = new Text(baseComposite, SWT.SINGLE);
			text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			text.setText("Hello World");
			
			final Label button = new Label(baseComposite, SWT.NONE);
			button.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true));
			//button.setImage(buttonImage);
			button.setText("Hazard");
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseDown(MouseEvent e) {
					text.setText("Hello!");	
				}
				@Override
				public void mouseUp(MouseEvent e) {
					text.setText("Hello!");	
				}
			});
			
			final Label button2 = new Label(baseComposite, SWT.NONE);
			button2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true));
			//button.setImage(buttonImage);
			button2.setText("Hazard2");
			button2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseDown(MouseEvent e) {
					text.setText("Hello!");	
				}
				@Override
				public void mouseUp(MouseEvent e) {
					text.setText("Hello!");	
					
				}
			});
			
			final Text text2 = new Text(baseComposite, SWT.SINGLE);
			text2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			text2.setText("Hello World2");
		}
	}
	
	final Display display;
	final Shell shell;
	
	public TextWithButtonExample() {
		display = new Display();
		shell = new Shell(display);
		shell.setLayout(new GridLayout());
		shell.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		new TextWithButton(shell);
	}
	
	public void run() {
		shell.setSize(200, 100);
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}
	
	public static void main(String[] args) {
		new TextWithButtonExample().run();
	}
}
