package ar.com.jnm.project12;

import ar.com.jnm.project12.twodim.Circle;
import ar.com.jnm.project12.twodim.ComposedFigure;
import ar.com.jnm.project12.twodim.Figure;
import ar.com.jnm.project12.twodim.Point;
import ar.com.jnm.project12.twodim.RectangleFactory;

/**
 * @author Jorge Nicolás Mikitiuk
 * <br/>Proyecto12 - 2018-03-24
 */
public class Application {

	public static void main(String[] args) {
		Figure[] figures= new Figure[] {
			new Circle(new Point(10,10), 10),
			RectangleFactory.build(new Point(10,10), new Point(0,0))
		};
		
		Figure figure = new ComposedFigure(figures);
		
		System.out.println(figure.contains(new Point(0, 0)));
		System.out.println(figure.contains(new Point(10, 10)));
		System.out.println(figure.contains(new Point(0, 10)));
		System.out.println(figure.contains(new Point(10, 0)));
		System.out.println(figure.contains(new Point(10, 20)));
		System.out.println(figure.contains(new Point(20, 10)));
		
		System.out.println(figure.contains(new Point(-1, 0)));
		System.out.println(figure.contains(new Point(0, -1)));
		System.out.println(figure.contains(new Point(0, 11)));
		System.out.println(figure.contains(new Point(11, 0)));
		System.out.println(figure.contains(new Point(10, 21)));
		System.out.println(figure.contains(new Point(21, 10)));
		System.out.println(figure.contains(new Point(9, 20)));
		System.out.println(figure.contains(new Point(20, 9)));
		System.out.println(figure.contains(new Point(11, 20)));
		System.out.println(figure.contains(new Point(20, 11)));
	}

}
