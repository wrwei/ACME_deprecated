/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/

package acme.argumentation.diagram.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.swt.SWT;

public class ArgumentReasoningLineShape extends PolylineConnectionEx {

	@Override
	protected void outlineShape(Graphics g) {
		g.setAntialias(SWT.ON);
		g.setForegroundColor(ColorConstants.black);
		g.drawLine(getStart(), getEnd());
	}
	
	@Override
	public void validate() {
		super.validate();
	}
}
