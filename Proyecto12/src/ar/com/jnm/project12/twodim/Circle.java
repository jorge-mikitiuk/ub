package ar.com.jnm.project12.twodim;

/**
 * @author Jorge Nicolás Mikitiuk
 * <br/>Proyecto12 - 2018-03-24
 */
public final class Circle extends Figure {
	private Point center;
	private double radius;

	public Circle(Point center, double radius) {
		setCenter(center);
		setRadius(radius);
	}

	@Override
	public boolean contains(Point point) {
		return getCenter().distance(point) <= getRadius();
	}

	public Point getCenter() {
		return center;
	}

	private void setCenter(Point center) {
		this.center = center;
	}

	public double getRadius() {
		return radius;
	}

	private void setRadius(double radius) {
		this.radius = radius;
	}

}
