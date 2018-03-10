package ar.com.jnm.project3;

/**
 * @author Jorge Nicolás Mikitiuk
 * <br/>Proyecto3 - 2018-03-09
 */
public class Application {

	/**
	 * This application shows the execution arguments on console.
	 * @param args
	 */
	public static void main(String[] args) {
		for(int index=0; index < args.length; index++)
			System.out.println(args[index]);
	}

}
