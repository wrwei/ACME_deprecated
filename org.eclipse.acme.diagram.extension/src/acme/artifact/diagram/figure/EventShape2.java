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

public class EventShape2 extends Shape {

	protected PointList shape = new PointList(4);
	
	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		shape.translate(dx, dy);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillPolygon(shape);
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		graphics.drawPolygon(shape);
	}
	
	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);
		
		Point diamondTop = new Point(r.x + r.width/2, r.y);
		Point diamondLeft = new Point(r.x, r.y + r.height/2);
		Point diamondRight = new Point(r.x + r.width, r.y + r.height/2);
		Point diamondBot = new Point(r.x+r.width/2, r.y + r.height);
		
		shape.removeAllPoints();
		shape.addPoint(diamondTop);
		shape.addPoint(diamondLeft);
		shape.addPoint(diamondBot);
		shape.addPoint(diamondRight);
	}

}
