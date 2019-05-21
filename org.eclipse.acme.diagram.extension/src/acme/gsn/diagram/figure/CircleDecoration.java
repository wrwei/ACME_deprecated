package acme.gsn.diagram.figure;


import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public class CircleDecoration extends Ellipse {

	private static final int RADIUS = 10;
	private Point location = new Point();
	
	public CircleDecoration() {
		super();
	}
	
	@Override
	public void setLocation(Point p) {
		location = p;
		translateToAbsolute(location);
		Rectangle bounds = new Rectangle(location.x - RADIUS, location.y-RADIUS, RADIUS*2, RADIUS*2);
		setBounds(bounds);
	}
	
}
