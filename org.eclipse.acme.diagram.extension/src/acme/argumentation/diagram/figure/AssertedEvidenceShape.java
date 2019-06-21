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
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

import argumentation.AssertedEvidence;

public class AssertedEvidenceShape extends Shape{

	private AssertedEvidence assertedEvidence;
	protected Rectangle rectangle = new Rectangle();
	
	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		rectangle.translate(dx, dy);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		graphics.setBackgroundColor(ColorConstants.black);
		graphics.fillOval(rectangle);
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		graphics.drawOval(rectangle);
	}
	
	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);

		rectangle.setBounds(r.x, r.y, r.width, r.height);
	}

	public AssertedEvidence getAssertedEvidence() {
		return assertedEvidence;
	}
	
	public void setAssertedEvidence(AssertedEvidence assertedEvidence) {
		this.assertedEvidence = assertedEvidence;
	}
}
