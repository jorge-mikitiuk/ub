package ar.com.jnm.project12.onedim;

/**
 * @author Jorge Nicolás Mikitiuk
 * <br/>Proyecto12 - 2018-03-24
 */
public final class Delta {

	private double from;
	private double to;

	public Delta(double from, double to) {
		setFrom(from);
		setTo(to);
	}

	public double getFrom() {
		return from;
	}

	private void setFrom(double from) {
		this.from = from;
	}

	public double getTo() {
		return to;
	}

	private void setTo(double to) {
		this.to = to;
	}

	public boolean contains(double point) {
		return (getFrom() <= point) && (point <= getTo());
	}
}
