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

public class ArtifactShape extends Shape {

	private Artifact artifact;
	protected PointList shape = new PointList();
	protected PointList outer = new PointList();
	protected PointList deco = new PointList();

	public static final int MARGIN_OFFSET = 8;

//	public static final int ARROW_TIP_OFFSET = 5;
//	public static final int ARROW_WING_OFFSET = 15;
//	public static final int ARROW_START_OFFSET = 25;


	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		shape.translate(dx, dy);
		outer.translate(dx, dy);
		deco.translate(dx, dy);
	}

	@Override
	protected void fillShape(Graphics graphics) {
		graphics.setForegroundColor(ColorConstants.black);
		graphics.fillPolygon(shape);
		graphics.fillPolygon(outer);

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

		graphics.drawLine(outer.getPoint(0), outer.getPoint(1));
		graphics.drawLine(outer.getPoint(1), outer.getPoint(2));
		graphics.drawLine(outer.getPoint(2), outer.getPoint(3));
		graphics.drawLine(outer.getPoint(3), outer.getPoint(4));

//		graphics.drawLine(deco.getPoint(0), deco.getPoint(1));
//		graphics.drawLine(deco.getPoint(0), deco.getPoint(2));
//		graphics.drawLine(deco.getPoint(0), deco.getPoint(3));
	}

	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);

		Point p1, p2, p3, p4;

		p1 = new Point(r.x, r.y);
		p2 = new Point(r.x + r.width-MARGIN_OFFSET, r.y);
		p3 = new Point(r.x+r.width-MARGIN_OFFSET, r.y+r.height-MARGIN_OFFSET);
		p4 = new Point(r.x, r.y+r.height-MARGIN_OFFSET);

		shape.removeAllPoints();
		shape.addPoint(p1);
		shape.addPoint(p2);
		shape.addPoint(p3);
		shape.addPoint(p4);

		Point p5, p6, p7, p8, p9;
		p5 = new Point(r.x + r.width - MARGIN_OFFSET, r.y+MARGIN_OFFSET);
		p6 = new Point(r.x + r.width, r.y + MARGIN_OFFSET);
		p7 = new Point(r.x + r.width, r.y + r.height);
		p8 = new Point(r.x + MARGIN_OFFSET, r.y + r.height);
		p9 = new Point(r.x + MARGIN_OFFSET, r.y + r.height-MARGIN_OFFSET);

		outer.removeAllPoints();
		outer.addPoint(p5);
		outer.addPoint(p6);
		outer.addPoint(p7);
		outer.addPoint(p8);
		outer.addPoint(p9);

//		Point a1, a2, a3, a4;
//		a1 = new Point(r.x + r.width - MARGIN_OFFSET-ARROW_TIP_OFFSET, r.y + ARROW_TIP_OFFSET);
//		a2 = new Point(r.x + r.width - MARGIN_OFFSET - ARROW_WING_OFFSET, r.y + ARROW_TIP_OFFSET*2);
//		a3 = new Point(r.x + r.width - MARGIN_OFFSET - ARROW_TIP_OFFSET*2, r.y + ARROW_WING_OFFSET);
//		a4 = new Point(r.x + r.width - MARGIN_OFFSET - ARROW_START_OFFSET, r.y + ARROW_START_OFFSET);
//
//		deco.removeAllPoints();
//		deco.addPoint(a1);
//		deco.addPoint(a2);
//		deco.addPoint(a3);
//		deco.addPoint(a4);
	}

	public Artifact getArtifact() {
		return artifact;
	}

	public void setArtifact(Artifact artifact) {
		this.artifact = artifact;
	}
}
