/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 *
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.artifact.diagram.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

import artifact.Event;

public class EventShape extends Shape {

//	protected PointList shape = new PointList(4);
	protected Rectangle outerRing = new Rectangle();
	protected Rectangle innerRing = new Rectangle();
	public static final int offset = 20;

	protected Event event = null;

	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		outerRing.translate(dx, dy);
		innerRing.translate(dx, dy);
	}

	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillOval(outerRing);
		graphics.fillOval(innerRing);

	}


	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		if (event != null) {
			if (event.isIsAbstract()) {
				graphics.setLineStyle(SWT.LINE_DASH);
				graphics.setForegroundColor(ColorConstants.gray);
			}
		}

		graphics.drawOval(outerRing);
		graphics.drawOval(innerRing);
	}

	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);

		outerRing.setBounds(r.x, r.y, r.width, r.height);
		innerRing.setBounds(r.x+offset/2, r.y+offset/2, r.width-offset, r.height-offset);
	}

	public void setEvent(Event event) {
		this.event = event;
	}

}
