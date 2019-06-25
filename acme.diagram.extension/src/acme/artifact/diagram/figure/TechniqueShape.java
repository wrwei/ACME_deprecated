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
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

import artifact.Technique;

public class TechniqueShape extends Shape {

	protected Rectangle outerRing = new Rectangle();
	protected Rectangle innerRing = new Rectangle();
	protected Rectangle centre = new Rectangle();
	protected static final int offset = 20;

	protected Technique technique = null;


	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		outerRing.translate(dx, dy);
		innerRing.translate(dx, dy);
		centre.translate(dx, dy);

	}

	@Override
	protected void fillShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		graphics.setBackgroundColor(ColorConstants.black);
		if (technique != null) {
			if (technique.isIsAbstract()) {
				graphics.setLineStyle(SWT.LINE_DASH);
				graphics.setForegroundColor(ColorConstants.gray);
				graphics.setBackgroundColor(ColorConstants.white);

			}
		}
		for(int i = 0; i < 10; i++) {
			graphics.fillArc(outerRing, 0 + i*36, 18);
		}
		graphics.fillOval(innerRing);
		graphics.setBackgroundColor(ColorConstants.white);
		graphics.fillOval(centre);
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		if (technique != null) {
			if (technique.isIsAbstract()) {
				graphics.setLineStyle(SWT.LINE_DASH);
				graphics.setForegroundColor(ColorConstants.gray);
			}
		}
		//graphics.drawArc(outerRing, 180, 30);
		//graphics.drawOval(outerRing);
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);

		int width = r.width/2;
		//int offset = r.width/8/2;

		for(int i = 0; i < 10; i++) {
			graphics.drawArc(outerRing, 0 + i*36, 18);
			double radian = Math.toRadians(36*i);
			double cos = Math.cos(radian);
			double sin = Math.sin(radian);

			int x = (int) Math.round(width * cos);
			int y = (int) Math.round(width*sin);

			int x1 = (int) Math.round((width-offset/2)*cos);
			int y1 = (int) Math.round((width-offset/2)*sin);

//			graphics.drawLine(centre, new Point(r.x + width + x-x1, r.y + width - y-y1));
			graphics.drawLine(new Point(r.x + width + x1, r.y + width - y1), new Point(r.x + width + x, r.y + width - y));

			radian = Math.toRadians(36*i+18);
			cos = Math.cos(radian);
			sin = Math.sin(radian);

			x = (int) Math.round(width * cos);
			y = (int) Math.round(width*sin);

			x1 = (int) Math.round((width-offset/2)*cos);
			y1 = (int) Math.round((width-offset/2)*sin);

			graphics.drawLine(new Point(r.x + width + x1, r.y + width - y1), new Point(r.x + width + x, r.y + width - y));
		}
		graphics.drawOval(innerRing);
		graphics.drawOval(centre);

	}

	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);

		//offset for inner ring
		//int offset = r.width/8;
		outerRing.setBounds(r.x, r.y, r.width, r.height);
		innerRing.setBounds(r.x + offset/2+1, r.y + offset/2+1, r.width-offset-1, r.height-offset-1);
//		offset = r.width/4;
		centre.setBounds(r.x + offset+1, r.y + offset + 1, r.width-offset*2-1, r.height-offset*2-1);
	}

	public Technique getTechnique() {
		return technique;
	}

	public void setTechnique(Technique technique) {
		this.technique = technique;
	}

}
