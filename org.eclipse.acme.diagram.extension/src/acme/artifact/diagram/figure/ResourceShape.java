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

import artifact.Resource;

public class ResourceShape extends Shape {

	protected PointList shape = new PointList();
	protected Rectangle topOval = new Rectangle();
	protected Rectangle bottomOval = new Rectangle();
	
	protected Resource resource = null;
	
	
	public PointList getParallelgram() {
		return shape; 
	}

	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		shape.translate(dx, dy);
		topOval.translate(dx, dy);
		bottomOval.translate(dx, dy);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillOval(topOval);
		graphics.fillOval(bottomOval);
		graphics.fillPolygon(shape);
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		if (resource != null) {
			if (resource.isIsAbstract()) {
				graphics.setLineStyle(SWT.LINE_DASH);
				graphics.setForegroundColor(ColorConstants.gray);
			}
		}

		graphics.drawOval(topOval);
		graphics.drawArc(bottomOval, 180, 180);
		graphics.drawLine(shape.getPoint(0), shape.getPoint(3));
		graphics.drawLine(shape.getPoint(1), shape.getPoint(2));
		
	}
	
	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);
		
		int offset = r.height/6;
		
		topOval.setBounds(r.x, r.y, r.width, offset);
		
		/*
		 * p1   p2
		 * 
		 * p4   p3
		 */
		
		Point tl, tr, br, bl;
		tl = new Point(r.x, r.y + offset/2);
		tr = new Point(r.x + r.width, r.y + offset/2);
		br = new Point(r.x + r.width, r.y + r.height-offset/2);
		bl = new Point(r.x, r.y + r.height-offset/2);
		
		shape.removeAllPoints();
		shape.addPoint(tl);
		shape.addPoint(tr);
		shape.addPoint(br);
		shape.addPoint(bl);
		
		bottomOval.setBounds(r.x, r.y+r.height-offset, r.width, offset);
		
	}
	
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	
	public Resource getResource() {
		return resource;
	}

}
