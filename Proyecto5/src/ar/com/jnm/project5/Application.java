package ar.com.jnm.project5;

/**
 * @author Jorge Nicolás Mikitiuk
 * <br/>Proyecto5 - 2018-03-13
 */
public class Application {

	/**
	 * This application shows a simple class hierarchy 
	 * @param args
	 */
	public static void main(String[] args) {
		Cat cat= new Cat();
		Cow cow= new Cow();
		System.out.println("The cat eats "+cat.eat()+", and the cow eats "+cow.eat());
	}

}
