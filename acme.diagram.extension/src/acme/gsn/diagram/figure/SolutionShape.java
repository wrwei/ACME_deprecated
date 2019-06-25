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
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

import acme.diagram.util.DimensionUtil;
import gsn.Solution;

public class SolutionShape extends Shape {

	private Solution solution;
	protected Rectangle rect = new Rectangle();
	protected PointList triangle = new PointList(3);
	public static final int TRIANGLE_DECORATION_HEIGHT = 10;

	protected PointList publicIndicator = new PointList();
	public static final int PUBLIC_INDICATOR_OFFSET = 5;
	public static final int PUBLIC_INDICATOR_WIDTH = 28;
	public static final int PUBLIC_INDICATOR_HEIGHT = 20;

	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		rect.translate(dx, dy);
	}

	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillOval(rect);
		if (solution != null) {
			if (solution.isUninstantiated()) {
				graphics.fillPolygon(triangle);
			}
			if (solution.isIsPublic()) {
				graphics.fillPolygon(publicIndicator);
			}
		}
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		graphics.drawOval(rect);
		if (solution != null) {
			if (solution.isUninstantiated()) {
				graphics.drawPolygon(triangle);
			}
			if (solution.isIsPublic()) {
				graphics.drawPolygon(publicIndicator);
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
		if (solution != null) {
			if (solution.isUninstantiated()) {
				Point diamondTop = new Point(r.x + r.width/2, r.y+ r.height-TRIANGLE_DECORATION_HEIGHT);
				Point diamondLeft = new Point(diamondTop.x - TRIANGLE_DECORATION_HEIGHT, diamondTop.y + TRIANGLE_DECORATION_HEIGHT);
				Point diamondRight = new Point(diamondTop.x + TRIANGLE_DECORATION_HEIGHT, diamondTop.y + TRIANGLE_DECORATION_HEIGHT);

				triangle.removeAllPoints();
				triangle.addPoint(diamondTop);
				triangle.addPoint(diamondLeft);
				triangle.addPoint(diamondRight);
				offset = TRIANGLE_DECORATION_HEIGHT;
			}

			if (solution.isIsPublic()) {
				double largestSide = DimensionUtil.getBiggestSwquareSideLength(r);
				double diff = r.preciseWidth() - largestSide;

				// Module decorating icon
				Point p1 = null, p2 = null, p3 = null, p4 = null, p5 = null, p6 = null, p7 = null;
				p1 = new PrecisionPoint(r.x + diff/2 + largestSide - PUBLIC_INDICATOR_OFFSET - PUBLIC_INDICATOR_WIDTH, r.y + diff/2 + PUBLIC_INDICATOR_OFFSET);
				p2 = new Point(p1.x + PUBLIC_INDICATOR_WIDTH/3, p1.y);
				p3 = new Point(p2.x, p2.y + PUBLIC_INDICATOR_HEIGHT/4);
				p4 = new Point(p1.x, p3.y);
				p5 = new Point(p1.x, p1.y + PUBLIC_INDICATOR_HEIGHT);
				p6 = new Point(p5.x + PUBLIC_INDICATOR_WIDTH, p5.y);
				p7 = new Point(p6.x, p3.y);
				publicIndicator.removeAllPoints();
				publicIndicator.addPoint(p1);
				publicIndicator.addPoint(p2);
				publicIndicator.addPoint(p3);
				publicIndicator.addPoint(p4);
				publicIndicator.addPoint(p5);
				publicIndicator.addPoint(p6);
				publicIndicator.addPoint(p7);
				publicIndicator.addPoint(p4);
			}
		}
		rect.setBounds(r.x, r.y, r.width, r.height-offset);
	}

	public void setSolution(Solution solution) {
		this.solution = solution;
	}
}
