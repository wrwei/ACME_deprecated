/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 *
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.artifact.diagram.figure;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

public class ResourceShape_old extends Shape {

	protected PointList shape = new PointList();
	protected PointList topLeftRectangle = new PointList();
	public static final int TOP_RECT_HEIGHT = 20;


	public PointList getParallelgram() {
		return shape;
	}

	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		shape.translate(dx, dy);
		topLeftRectangle.translate(dx, dy);
	}

	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillPolygon(shape);
		graphics.fillPolygon(topLeftRectangle);
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.drawPolygon(shape);
		graphics.drawPolygon(topLeftRectangle);
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);
		graphics.drawText("Resource", new Point(r.x+2, r.y+2));
	}

	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);

		Point rectTL, rectTR, rectBR, rectBL;
		rectTL = new Point(r.x, r.y);
		rectTR = new Point(r.x + r.width, r.y);
		rectBR = new Point(r.x + r.width, r.y + TOP_RECT_HEIGHT);
		rectBL = new Point(r.x, r.y + TOP_RECT_HEIGHT);

		topLeftRectangle.removeAllPoints();
		topLeftRectangle.addPoint(rectTL);
		topLeftRectangle.addPoint(rectTR);
		topLeftRectangle.addPoint(rectBR);
		topLeftRectangle.addPoint(rectBL);


		Point tl, tr, br, bl;
		tl = new Point(r.x, r.y + TOP_RECT_HEIGHT);
		tr = new Point(r.x + r.width, r.y + TOP_RECT_HEIGHT);
		br = new Point(r.x + r.width, r.y + r.height);
		bl = new Point(r.x, r.y + r.height);

		shape.removeAllPoints();
		shape.addPoint(tl);
		shape.addPoint(tr);
		shape.addPoint(br);
		shape.addPoint(bl);

	}

}
