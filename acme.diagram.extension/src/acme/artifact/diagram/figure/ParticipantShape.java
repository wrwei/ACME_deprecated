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

import artifact.Participant;

public class ParticipantShape extends Shape {

	//stick man
	protected Rectangle head = new Rectangle();
	protected PointList body = new PointList();

	protected PointList shape = new PointList();
	protected static final double proportion = 0.2;

	protected Participant participant = null;


	public PointList getParallelgram() {
		return shape;
	}

	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		shape.translate(dx, dy);
		head.translate(dx, dy);
		body.translate(dx, dy);
	}

	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillPolygon(shape);
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		if (participant != null) {
			if (participant.isIsAbstract()) {
				graphics.setLineStyle(SWT.LINE_DASH);
				graphics.setForegroundColor(ColorConstants.gray);
			}
		}

		graphics.drawOval(head);
		graphics.drawLine(body.getPoint(0), body.getPoint(3));
		graphics.drawLine(body.getPoint(1), body.getPoint(2));
		graphics.drawLine(body.getPoint(3), body.getPoint(4));
		graphics.drawLine(body.getPoint(3), body.getPoint(5));
		graphics.drawPolygon(shape);
	}

	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);

		int offset = (int) (r.width*proportion);


		head.setBounds(r.x, r.y, offset, offset);
		Point p1 = new Point(r.x + offset/2, r.y+offset);
		Point p2 = new Point(r.x, r.y+offset + (r.height-offset)/3);
		Point p3 = new Point(r.x+offset, r.y+offset + (r.height-offset)/3);
		Point p4 = new Point(r.x + offset/2, r.y+r.height- (r.height-offset)/3);
		Point p5 = new Point(r.x, r.y+r.height);
		Point p6 = new Point(r.x+offset, r.y+r.height);
		body.removeAllPoints();
		body.addPoint(p1);
		body.addPoint(p2);
		body.addPoint(p3);
		body.addPoint(p4);
		body.addPoint(p5);
		body.addPoint(p6);

		/*    1
		 * 2     3
		 *    4
		 * 5     6
		 */


		Point tl, tr, br, bl;
		tl = new Point(r.x+offset, r.y);
		tr = new Point(r.x + r.width, r.y);
		br = new Point(r.x + r.width, r.y + r.height);
		bl = new Point(r.x+offset, r.y + r.height);

		shape.removeAllPoints();
		shape.addPoint(tl);
		shape.addPoint(tr);
		shape.addPoint(br);
		shape.addPoint(bl);

	}

	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

}
