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
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

import artifact.Artifact;

public class ArtifactShape2 extends Shape {

	protected PointList shape = new PointList();
	protected PointList lines = new PointList();

	protected Artifact artifact = null;

	public static final int CORNER_OFFSET = 30;


	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		shape.translate(dx, dy);
		lines.translate(dx, dy);
	}

	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillPolygon(shape);
		graphics.setBackgroundColor(ColorConstants.black);

		if (artifact != null) {
			if (artifact.isIsAbstract()) {
				graphics.setLineStyle(SWT.LINE_DASH);
				graphics.setBackgroundColor(ColorConstants.gray);
			}
		}
		PointList fold = new PointList();
		fold.addPoint(shape.getPoint(1));
		fold.addPoint(shape.getPoint(2));
		fold.addPoint(shape.getPoint(3));
		graphics.fillPolygon(fold);
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);

		if (artifact != null) {
			if (artifact.isIsAbstract()) {
				graphics.setLineStyle(SWT.LINE_DASH);
				graphics.setForegroundColor(ColorConstants.gray);
			}
		}

		graphics.drawPolygon(shape);
		graphics.drawLine(shape.getPoint(1), shape.getPoint(3));

//		graphics.drawLine(lines.getPoint(0), lines.getPoint(1));
//		graphics.drawLine(lines.getPoint(2), lines.getPoint(3));
//		graphics.drawLine(lines.getPoint(4), lines.getPoint(5));
//		graphics.drawLine(lines.getPoint(6), lines.getPoint(7));
//		graphics.drawLine(lines.getPoint(8), lines.getPoint(9));

	}

	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);

		/*
		 * 1   2
		 *     3  4
		 * 6      5
		 */

		Point rect1 = new Point(r.x, r.y);
		Point rect2 = new Point(r.x + r.width-CORNER_OFFSET, r.y);
		Point rect3 = new Point(r.x + r.width-CORNER_OFFSET, r.y+CORNER_OFFSET);
		Point rect4 = new Point(r.x + r.width, r.y+CORNER_OFFSET);
		Point rect5 = new Point(r.x+r.width, r.y+r.height);
		Point rect6 = new Point(r.x, r.y+r.height);

		shape.removeAllPoints();
		shape.addPoint(rect1);
		shape.addPoint(rect2);
		shape.addPoint(rect3);
		shape.addPoint(rect4);
		shape.addPoint(rect5);
		shape.addPoint(rect6);

//		int interval = (r.height - CORNER_OFFSET)/6;
//		int offset = r.width/6;
//		Point l1s = new Point(r.x+offset, r.y + CORNER_OFFSET + interval);
//		Point l1e = new Point(r.x+r.width - offset, r.y + CORNER_OFFSET + interval);
//
//		Point l2s = new Point(r.x+offset, r.y + CORNER_OFFSET + interval*2);
//		Point l2e = new Point(r.x+r.width - offset, r.y + CORNER_OFFSET + interval*2);
//
//		Point l3s = new Point(r.x+offset, r.y + CORNER_OFFSET + interval*3);
//		Point l3e = new Point(r.x+r.width - offset, r.y + CORNER_OFFSET + interval*3);
//
//		Point l4s = new Point(r.x+offset, r.y + CORNER_OFFSET + interval*4);
//		Point l4e = new Point(r.x+r.width - offset, r.y + CORNER_OFFSET + interval*4);
//
//		Point l5s = new Point(r.x+offset, r.y + CORNER_OFFSET + interval*5);
//		Point l5e = new Point(r.x+r.width - offset, r.y + CORNER_OFFSET + interval*5);
//
//		lines.removeAllPoints();
//		lines.addPoint(l1s);
//		lines.addPoint(l1e);
//
//		lines.addPoint(l2s);
//		lines.addPoint(l2e);
//
//		lines.addPoint(l3s);
//		lines.addPoint(l3e);
//
//		lines.addPoint(l4s);
//		lines.addPoint(l4e);
//
//		lines.addPoint(l5s);
//		lines.addPoint(l5e);


	}

	public Artifact getArtifact() {
		return artifact;
	}

	public void setArtifact(Artifact artifact) {
		this.artifact = artifact;
	}

}
