package ar.com.jnm.project12.twodim;

import ar.com.jnm.project12.onedim.Delta;

/**
 * @author Jorge Nicolás Mikitiuk
 * <br/>Proyecto12 - 2018-03-24
 */
public final class Rectangle extends Figure{
	private Point lowerLeftCorner;
	private Point upperRightCorner;

	public Rectangle(Point lowerLeftCorner, Point upperRightCorner) {
		setLowerLeftCorner(lowerLeftCorner);
		setUpperRightCorner(upperRightCorner);
	}

	@Override
	public boolean contains(Point point) {
		Delta deltaX = new Delta(getLowerLeftCorner().getX(), getUpperRightCorner().getX());
		Delta deltaY = new Delta(getLowerLeftCorner().getY(), getUpperRightCorner().getY());
		return deltaX.contains(point.getX()) && deltaY.contains(point.getY());
	}
	
	public Point getLowerLeftCorner() {
		return lowerLeftCorner;
	}

	private void setLowerLeftCorner(Point lowerLeftCorner) {
		this.lowerLeftCorner = lowerLeftCorner;
	}

	public Point getUpperRightCorner() {
		return upperRightCorner;
	}

	private void setUpperRightCorner(Point upperRightCorner) {
		this.upperRightCorner = upperRightCorner;
	}

}
