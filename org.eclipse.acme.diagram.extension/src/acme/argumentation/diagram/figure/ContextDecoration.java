package acme.argumentation.diagram.figure;

import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.PointList;

public class ContextDecoration extends PolygonDecoration{

	public static final PointList RECTANGLE = new PointList();

	static {
		RECTANGLE.addPoint(0, -1);
		RECTANGLE.addPoint(1, 0);
		RECTANGLE.addPoint(0, 1);
		RECTANGLE.addPoint(-1, 0);
	}
}
