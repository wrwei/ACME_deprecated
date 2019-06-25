/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 *
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/

package acme.gsn.diagram.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

import gsn.Assumption;


public class AssumptionShape extends Shape {

	private Assumption assumption;
	protected Rectangle rect = new Rectangle();

	protected PointList triangle = new PointList(3);
	public static final int TRIANGLE_DECORATION_HEIGHT = 10;


	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		rect.translate(dx, dy);
	}

	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillOval(rect);
		if (assumption != null) {
			if (assumption.isUninstantiated()) {
				graphics.fillPolygon(triangle);
			}
		}
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		graphics.drawOval(rect);
		graphics.drawText("A", rect.x + rect.width-10, rect.y + rect.height-15);
		if (assumption != null) {
			if (assumption.isUninstantiated()) {
				graphics.drawPolygon(triangle);
			}
		}
	}

	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);
		int offset = 0;
		if (assumption != null) {
			if (assumption.isUninstantiated()) {
				Point diamondTop = new Point(r.x + r.width/2, r.y+ r.height-TRIANGLE_DECORATION_HEIGHT);
				Point diamondLeft = new Point(diamondTop.x - TRIANGLE_DECORATION_HEIGHT, diamondTop.y + TRIANGLE_DECORATION_HEIGHT);
				Point diamondRight = new Point(diamondTop.x + TRIANGLE_DECORATION_HEIGHT, diamondTop.y + TRIANGLE_DECORATION_HEIGHT);

				triangle.removeAllPoints();
				triangle.addPoint(diamondTop);
				triangle.addPoint(diamondLeft);
				triangle.addPoint(diamondRight);
				offset = TRIANGLE_DECORATION_HEIGHT;
			}
		}
		rect.setBounds(r.x, r.y, r.width, r.height-offset);
	}

	public void setAssumption(Assumption assumption) {
		this.assumption = assumption;
	}
}
