package acme.argumentation.diagram.figure;


import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.geometry.Transform;
import org.eclipse.swt.SWT;

public class DefeatedDecoration extends Shape {

	private Transform transform = new Transform();

	private static final int width = 20;
	private Point location = new Point();
	private PointList shape = new PointList();
	
	public DefeatedDecoration() {
		super();
	}
	
	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		shape.translate(dx, dy);
	}
	
	@Override
	public void setLocation(Point p) {
		location.setLocation(p);
		transform.setTranslation(p.x, p.y);
	}

	@Override
	protected void fillShape(Graphics graphics) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
	}
	
	@Override
	public void validate() {
		
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);
		
//		Point p1 = new Point(r.x + 5, r.y);
//		Point p2 = new Point(r.x, r.y);
//		Point p3 = new Point(r.x, r.y + width);
//		Point p4 = new Point(r.x + 5, r.y + width);
//		Point p5 = new Point(r.x+width-5, r.y);
//		Point p6 = new Point(r.x+width, r.y);
//		Point p7 = new Point(r.x+width, r.y+width);
//		Point p8 = new Point(r.x+width-5, r.y+width);
		
		Point p1 = new Point(5-width/2, 0);
		Point p2 = new Point(0-width/2, 0);
		Point p3 = new Point(0-width/2, width);
		Point p4 = new Point(5-width/2, width);
		Point p5 = new Point(width-5-width/2, 0);
		Point p6 = new Point(width-width/2, 0);
		Point p7 = new Point(width-width/2, width);
		Point p8 = new Point(width-5-width/2, width);
		
		shape.removeAllPoints();
		/*
		 * 2 1 
		 * 
		 * 3 4 
		 */
		shape.addPoint(transform.getTransformed(p6));
		shape.addPoint(transform.getTransformed(p2));
		shape.addPoint(transform.getTransformed(p3));
		shape.addPoint(transform.getTransformed(p7));
	}
	
	public void setReferencePoint(Point ref) {
		Point pt = Point.SINGLETON;
		pt.setLocation(ref);
		pt.negate().translate(location);
		setRotation(Math.atan2(pt.y, pt.x));
	}
	
	public void setRotation(double angle) {
		transform.setRotation(angle+Math.toRadians(90));
	}


	
	public PointList getShape() {
		return shape;
	}
	
}
