package ar.com.jnm.project12.twodim;

/**
 * @author Jorge Nicolás Mikitiuk
 * <br/>Proyecto12 - 2018-03-24
 */
public final class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		setX(x);
		setY(y);
	}

	public double getX() {
		return x;
	}

	private void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	private void setY(double y) {
		this.y = y;
	}
	
	public double distance(Point other) {
		return Math.hypot(getX() - other.getX(), getY()-other.getY());
	}
}
