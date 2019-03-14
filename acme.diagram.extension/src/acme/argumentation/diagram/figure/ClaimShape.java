package acme.argumentation.diagram.figure;

import java.util.ArrayList;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

import argumentation.AssertionDeclaration;
import argumentation.Claim;

public class ClaimShape extends Shape{

	private Claim claim;
	protected PointList shape = new PointList(4);
	protected PointList assumed = new PointList(6);
	protected PointList axiomateShape = new PointList();
	protected PointList defeatedShape = new PointList();
	protected PointList needsSupportShape = new PointList();
	protected ArrayList<Rectangle> ovals = new ArrayList<>();
	protected PointList asCitedShape = new PointList();
	
	public static final int OVAL_OFFSET = 8;
	public static final int CITED_OFFSET = 10;
	public static final int CITED_BOARDER_WIDTH = 40;
	public static final int AXIOMATIC_OFFSET = 10;


	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		shape.translate(dx, dy);
		assumed.translate(dx, dy);
		defeatedShape.translate(dx, dy);
		needsSupportShape.translate(dx, dy);
		asCitedShape.translate(dx, dy);
		axiomateShape.translate(dx, dy);
		for(Rectangle r: ovals) {
			r.translate(dx, dy);
		}
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
//		graphics.setForegroundColor(ColorConstants.black);
		if (claim != null) {
			if (claim.isIsCitation()) {
				PointList temp = new PointList();
				temp.addPoint(asCitedShape.getPoint(4));
				temp.addPoint(asCitedShape.getPoint(5));
				temp.addPoint(asCitedShape.getPoint(7));
				temp.addPoint(asCitedShape.getPoint(6));
				graphics.fillPolygon(temp);
			}
			else {
				if (claim.getAssertionDeclaration() == AssertionDeclaration.ASSERTED) {
					graphics.fillPolygon(shape);
				}
				else if (claim.getAssertionDeclaration() == AssertionDeclaration.ASSUMED) {
					graphics.fillPolygon(assumed);
				}
				else if (claim.getAssertionDeclaration() == AssertionDeclaration.DEFEATED) {
					graphics.fillPolygon(defeatedShape);
				}
				else if (claim.getAssertionDeclaration() == AssertionDeclaration.NEEDS_SUPPORT) {
					graphics.fillPolygon(needsSupportShape);
					for(Rectangle r: ovals) {
						graphics.setBackgroundColor(ColorConstants.gray);
						graphics.fillOval(r);
					}
				}
				else if (claim.getAssertionDeclaration() == AssertionDeclaration.AXIOMATIC) {
					graphics.fillPolygon(axiomateShape);
				}
			}
		}
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		if (claim != null) {
			if (claim.isIsAbstract()) {
				graphics.setLineStyle(SWT.LINE_DASH);
				graphics.setForegroundColor(ColorConstants.gray);
			}
			if (claim.isIsCitation()) {
				/*
				 * 0 1  4     5  8 9 
				 * 
				 * 2 3  6     7  b a
				 */
				graphics.drawLine(asCitedShape.getPoint(0), asCitedShape.getPoint(1));
				graphics.drawLine(asCitedShape.getPoint(0), asCitedShape.getPoint(2));
				graphics.drawLine(asCitedShape.getPoint(2), asCitedShape.getPoint(3));
				
				graphics.drawLine(asCitedShape.getPoint(4), asCitedShape.getPoint(5));
				graphics.drawLine(asCitedShape.getPoint(5), asCitedShape.getPoint(7));
				graphics.drawLine(asCitedShape.getPoint(7), asCitedShape.getPoint(6));
				graphics.drawLine(asCitedShape.getPoint(6), asCitedShape.getPoint(4));
				
				graphics.drawLine(asCitedShape.getPoint(8), asCitedShape.getPoint(9));
				graphics.drawLine(asCitedShape.getPoint(9), asCitedShape.getPoint(10));
				graphics.drawLine(asCitedShape.getPoint(10), asCitedShape.getPoint(11));
			}
			else {
				if (claim.getAssertionDeclaration() == AssertionDeclaration.ASSERTED) {
					graphics.drawPolygon(shape);
				}
				else if (claim.getAssertionDeclaration() == AssertionDeclaration.ASSUMED) {
					graphics.drawLine(assumed.getPoint(0), assumed.getPoint(1));
					graphics.drawLine(assumed.getPoint(1), assumed.getPoint(2));
					graphics.drawLine(assumed.getPoint(2), assumed.getPoint(3));
					graphics.drawLine(assumed.getPoint(3), assumed.getPoint(4));
					graphics.drawLine(assumed.getPoint(4), assumed.getPoint(5));
				}
				else if (claim.getAssertionDeclaration() == AssertionDeclaration.DEFEATED) {
					graphics.drawPolygon(defeatedShape);
					graphics.drawLine(defeatedShape.getPoint(0), defeatedShape.getPoint(2));
					graphics.drawLine(defeatedShape.getPoint(1), defeatedShape.getPoint(3));
				}
				else if (claim.getAssertionDeclaration() == AssertionDeclaration.NEEDS_SUPPORT) {
					graphics.drawLine(needsSupportShape.getPoint(0), needsSupportShape.getPoint(1));
					graphics.drawLine(needsSupportShape.getPoint(1), needsSupportShape.getPoint(2));
					graphics.drawLine(needsSupportShape.getPoint(2), needsSupportShape.getPoint(3));
					graphics.drawLine(needsSupportShape.getPoint(3), needsSupportShape.getPoint(4));
					graphics.drawLine(needsSupportShape.getPoint(4), needsSupportShape.getPoint(5));
					for(Rectangle r: ovals) {
						graphics.drawOval(r);
					}
				}
				else if (claim.getAssertionDeclaration() == AssertionDeclaration.AXIOMATIC) {
					//0   1
					//2   3
					//4   5
					graphics.drawLine(axiomateShape.getPoint(0), axiomateShape.getPoint(1));
					graphics.drawLine(axiomateShape.getPoint(1), axiomateShape.getPoint(3));
					graphics.drawLine(axiomateShape.getPoint(3), axiomateShape.getPoint(2));
					graphics.drawLine(axiomateShape.getPoint(2), axiomateShape.getPoint(0));
					graphics.drawLine(axiomateShape.getPoint(4), axiomateShape.getPoint(5));
				}
				else if (claim.getAssertionDeclaration() == AssertionDeclaration.AS_CITED) {
					graphics.drawLine(asCitedShape.getPoint(0), asCitedShape.getPoint(1));
					graphics.drawLine(asCitedShape.getPoint(0), asCitedShape.getPoint(2));
					graphics.drawLine(asCitedShape.getPoint(2), asCitedShape.getPoint(3));
					
					graphics.drawLine(asCitedShape.getPoint(4), asCitedShape.getPoint(5));
					graphics.drawLine(asCitedShape.getPoint(5), asCitedShape.getPoint(7));
					graphics.drawLine(asCitedShape.getPoint(7), asCitedShape.getPoint(6));
					graphics.drawLine(asCitedShape.getPoint(6), asCitedShape.getPoint(4));
					
					graphics.drawLine(asCitedShape.getPoint(8), asCitedShape.getPoint(9));
					graphics.drawLine(asCitedShape.getPoint(9), asCitedShape.getPoint(10));
					graphics.drawLine(asCitedShape.getPoint(10), asCitedShape.getPoint(11));
				}
			}
		}
	}
	
	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);
		int offset = 0;

		if (claim != null) {
			if (claim.isIsCitation()) {

				//do as cited shape
				/*
				 * 1 2  5     6  9 a 
				 * 
				 * 3 4  7     8  c b
				 */
				
				int width = r.width - CITED_BOARDER_WIDTH*2 - CITED_OFFSET*2; 
				Point p1 = new Point(r.x, r.y);
				Point p2 = new Point(r.x+CITED_BOARDER_WIDTH, r.y);
				Point p3 = new Point(r.x, r.y+r.height);
				Point p4 = new Point(r.x+CITED_BOARDER_WIDTH, r.y+r.height);
				
				Point p5 = new Point(r.x+CITED_BOARDER_WIDTH+CITED_OFFSET, r.y);
				Point p6 = new Point(r.x+CITED_BOARDER_WIDTH+CITED_OFFSET + width, r.y);
				Point p7 = new Point(r.x+CITED_BOARDER_WIDTH+CITED_OFFSET, r.y+r.height);
				Point p8 = new Point(r.x+CITED_BOARDER_WIDTH+CITED_OFFSET + width, r.y+r.height);
				
				Point p9 = new Point(r.x+r.width - CITED_BOARDER_WIDTH, r.y);
				Point p10 = new Point(r.x+r.width, r.y);
				Point p11 = new Point(r.x+r.width, r.y+r.height);
				Point p12 = new Point(r.x+r.width - CITED_BOARDER_WIDTH, r.y + r.height);
				
				asCitedShape.removeAllPoints();
				asCitedShape.addPoint(p1);
				asCitedShape.addPoint(p2);
				asCitedShape.addPoint(p3);
				asCitedShape.addPoint(p4);
				asCitedShape.addPoint(p5);
				asCitedShape.addPoint(p6);
				asCitedShape.addPoint(p7);
				asCitedShape.addPoint(p8);
				asCitedShape.addPoint(p9);
				asCitedShape.addPoint(p10);
				asCitedShape.addPoint(p11);
				asCitedShape.addPoint(p12);
				
			}
			else {
				if (claim.getAssertionDeclaration() == AssertionDeclaration.ASSERTED) {
					// do shape first (asserted)
					Point rect1 = new Point(r.x, r.y);
					Point rect2 = new Point(r.x + r.width, r.y);
					Point rect3 = new Point(r.x, r.y+r.height);
					Point rect4 = new Point(r.x+r.width, r.y+r.height);
					
					shape.removeAllPoints();
					shape.addPoint(rect1);
					shape.addPoint(rect2);
					shape.addPoint(rect4);
					shape.addPoint(rect3);
				}
				else if (claim.getAssertionDeclaration() == AssertionDeclaration.ASSUMED) {
					//do assumed shape
					offset = r.width/5;
					/*
					 * 1        2
					 * 3 5    6 4
					 */
					Point ap1 = new Point(r.x, r.y);
					Point ap2 = new Point(r.x + r.width, r.y);
					Point ap3 = new Point(r.x, r.y+r.height);
					Point ap4 = new Point(r.x+r.width, r.y+r.height);
					Point ap5 = new Point(r.x + offset, r.y + r.height);
					Point ap6 = new Point(r.x + r.width - offset, r.y + r.height);
					
					assumed.removeAllPoints();
					assumed.addPoint(ap5);
					assumed.addPoint(ap3);
					assumed.addPoint(ap1);
					assumed.addPoint(ap2);
					assumed.addPoint(ap4);
					assumed.addPoint(ap6);
				}
				else if (claim.getAssertionDeclaration() == AssertionDeclaration.DEFEATED) {
					//do defeated shape
					//1   2
					//3   4
					Point dp1 = new Point(r.x, r.y);
					Point dp2 = new Point(r.x + r.width, r.y);
					Point dp3 = new Point(r.x, r.y+r.height);
					Point dp4 = new Point(r.x+r.width, r.y+r.height);
					
					defeatedShape.removeAllPoints();
					defeatedShape.addPoint(dp1);
					defeatedShape.addPoint(dp2);
					defeatedShape.addPoint(dp4);
					defeatedShape.addPoint(dp3);
				}
				else if (claim.getAssertionDeclaration() == AssertionDeclaration.NEEDS_SUPPORT) {
					//do needs support shape
					/*
					 * 1        2
					 * 3 5    6 4
					 */
					offset = r.width/5;
					Point ns1 = new Point(r.x, r.y);
					Point ns2 = new Point(r.x + r.width, r.y);
					Point ns3 = new Point(r.x, r.y+r.height);
					Point ns4 = new Point(r.x+r.width, r.y+r.height);
					Point ns5 = new Point(r.x + offset, r.y + r.height);
					Point ns6 = new Point(r.x + r.width - offset, r.y + r.height);
					
					needsSupportShape.removeAllPoints();
					needsSupportShape.addPoint(ns5);
					needsSupportShape.addPoint(ns3);
					needsSupportShape.addPoint(ns1);
					needsSupportShape.addPoint(ns2);
					needsSupportShape.addPoint(ns4);
					needsSupportShape.addPoint(ns6);
					Rectangle central = new Rectangle(r.x+r.width/2 - OVAL_OFFSET/2, r.y+r.height - OVAL_OFFSET, OVAL_OFFSET, OVAL_OFFSET);
					Rectangle left = new Rectangle(r.x+r.width/2 - 30 - OVAL_OFFSET/2, r.y+r.height - OVAL_OFFSET, OVAL_OFFSET, OVAL_OFFSET);
					Rectangle right = new Rectangle(r.x+r.width/2 + 30 - OVAL_OFFSET/2, r.y+r.height - OVAL_OFFSET, OVAL_OFFSET, OVAL_OFFSET);
					ovals.clear();
					ovals.add(central);
					ovals.add(left);
					ovals.add(right);
				}
				else if (claim.getAssertionDeclaration() == AssertionDeclaration.AXIOMATIC) {
					//1   2
					//3   4
					//5   6
					Point rect1 = new Point(r.x, r.y);
					Point rect2 = new Point(r.x + r.width, r.y);
					Point rect3 = new Point(r.x, r.y+r.height-AXIOMATIC_OFFSET);
					Point rect4 = new Point(r.x+r.width, r.y+r.height-AXIOMATIC_OFFSET);
					Point line1 = new Point(r.x, r.y+r.height);
					Point line2 = new Point(r.x + r.width, r.y+r.height);
					
					axiomateShape.removeAllPoints();
					axiomateShape.addPoint(rect1);
					axiomateShape.addPoint(rect2);
					axiomateShape.addPoint(rect3);
					axiomateShape.addPoint(rect4);
					axiomateShape.addPoint(line1);
					axiomateShape.addPoint(line2);
				}
				else if (claim.getAssertionDeclaration() == AssertionDeclaration.AS_CITED) {
					int width = r.width - CITED_BOARDER_WIDTH*2 - CITED_OFFSET*2; 
					Point p1 = new Point(r.x, r.y);
					Point p2 = new Point(r.x+CITED_BOARDER_WIDTH, r.y);
					Point p3 = new Point(r.x, r.y+r.height);
					Point p4 = new Point(r.x+CITED_BOARDER_WIDTH, r.y+r.height);
					
					Point p5 = new Point(r.x+CITED_BOARDER_WIDTH+CITED_OFFSET, r.y);
					Point p6 = new Point(r.x+CITED_BOARDER_WIDTH+CITED_OFFSET + width, r.y);
					Point p7 = new Point(r.x+CITED_BOARDER_WIDTH+CITED_OFFSET, r.y+r.height);
					Point p8 = new Point(r.x+CITED_BOARDER_WIDTH+CITED_OFFSET + width, r.y+r.height);
					
					Point p9 = new Point(r.x+r.width - CITED_BOARDER_WIDTH, r.y);
					Point p10 = new Point(r.x+r.width, r.y);
					Point p11 = new Point(r.x+r.width, r.y+r.height);
					Point p12 = new Point(r.x+r.width - CITED_BOARDER_WIDTH, r.y + r.height);
					
					asCitedShape.removeAllPoints();
					asCitedShape.addPoint(p1);
					asCitedShape.addPoint(p2);
					asCitedShape.addPoint(p3);
					asCitedShape.addPoint(p4);
					asCitedShape.addPoint(p5);
					asCitedShape.addPoint(p6);
					asCitedShape.addPoint(p7);
					asCitedShape.addPoint(p8);
					asCitedShape.addPoint(p9);
					asCitedShape.addPoint(p10);
					asCitedShape.addPoint(p11);
					asCitedShape.addPoint(p12);
				}
			}
		}
	}
	
	public Claim getClaim() {
		return claim;
	}
	
	public void setClaim(Claim claim) {
		this.claim = claim;
	}
}
