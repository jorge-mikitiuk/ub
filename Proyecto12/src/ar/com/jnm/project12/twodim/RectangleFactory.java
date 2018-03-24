package ar.com.jnm.project12.twodim;

/**
 * @author Jorge Nicolás Mikitiuk
 * <br/>Proyecto12 - 2018-03-24
 */
public final class RectangleFactory {
	
	private RectangleFactory(){
		
	}

	public static Rectangle build(Point from, Point to) {
		Point lowerLeftCorner = new Point(Double.min(from.getX(), to.getX()),Double.min(from.getY(), to.getY()));
		Point upperRightCorner = new Point(Double.max(from.getX(), to.getX()),Double.max(from.getY(),to.getY()));
		return new Rectangle(lowerLeftCorner,upperRightCorner);
	}
}
