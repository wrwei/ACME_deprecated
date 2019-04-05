package acme.argumentation.diagram.figure;


import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.geometry.Transform;
import org.eclipse.swt.SWT;

public class AxiomaticDecoration extends Shape {

	private Transform transform = new Transform();

	private static final int width = 10;
	private Point location = new Point();
	private PointList shape = new PointList();
	
	public AxiomaticDecoration() {
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
		
		PrecisionPoint p1 = new PrecisionPoint(-width, 0);
		PrecisionPoint p2 = new PrecisionPoint(width, 0);
		
		shape.removeAllPoints();
		/*
		 *  1  2
		 */
		shape.addPoint(transform.getTransformed(p1));
		shape.addPoint(transform.getTransformed(p2));
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
