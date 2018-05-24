package ar.com.jnm.project12.twodim;

/**
 * @author Jorge Nicolás Mikitiuk
 * <br/>Proyecto12 - 2018-03-24
 */
public final class ComposedFigure extends Figure{

	private Figure[] figures;
	
	public ComposedFigure(Figure[] figures) {
		setFigures(figures);
	}

	@Override
	public boolean contains(Point point) {
		for(Figure figure : getFigures())
			if(figure.contains(point))
				return true;
		return false;
	}

	public Figure[] getFigures() {
		return figures;
	}

	private void setFigures(Figure[] figures) {
		this.figures = figures;
	}

}
