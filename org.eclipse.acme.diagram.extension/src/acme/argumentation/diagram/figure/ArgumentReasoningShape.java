package acme.argumentation.diagram.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

import argumentation.ArgumentReasoning;

public class ArgumentReasoningShape extends Shape{

	private ArgumentReasoning argumentReasoning;
	protected PointList shape = new PointList(4);
	protected PointList fillShape = new PointList(4);
	


	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		shape.translate(dx, dy);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		if (argumentReasoning != null) {
			graphics.fillPolygon(fillShape);
		}
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		if (argumentReasoning != null) {
			if (argumentReasoning.isIsAbstract()) {
				graphics.setLineStyle(SWT.LINE_DASH);
				graphics.setForegroundColor(ColorConstants.gray);
			}
			
			/*
			 * 1 0   
			 * 
			 * 2 3 
			 */
			graphics.drawLine(shape.getPoint(0), shape.getPoint(1));
			graphics.drawLine(shape.getPoint(1), shape.getPoint(2));
			graphics.drawLine(shape.getPoint(2), shape.getPoint(3));
		}
	}
	
	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);
		int offset = r.width/4;

		if (argumentReasoning != null) {
				/*
				 * 1 0 
				 * 
				 * 2 3
				 */
				
			Point p1 = new Point(r.x+offset, r.y);
			Point p2 = new Point(r.x, r.y);
			Point p3 = new Point(r.x, r.y+r.height);
			Point p4 = new Point(r.x+offset, r.y+r.height);
				
			shape.removeAllPoints();
			shape.addPoint(p1);
			shape.addPoint(p2);
			shape.addPoint(p3);
			shape.addPoint(p4);
			
			Point p5 = new Point(r.x+r.width, r.y);
			Point p6 = new Point(r.x, r.y);
			Point p7 = new Point(r.x, r.y+r.height);
			Point p8 = new Point(r.x+r.width, r.y+r.height);
				
			fillShape.removeAllPoints();
			fillShape.addPoint(p5);
			fillShape.addPoint(p6);
			fillShape.addPoint(p7);
			fillShape.addPoint(p8);
		}
	}
	
	public ArgumentReasoning getArgumentReasoning() {
		return argumentReasoning;
	}
	
	public void setArgumentReasoning(ArgumentReasoning argumentReasoning) {
		this.argumentReasoning = argumentReasoning;
	}
	
}
