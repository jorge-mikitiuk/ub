package ar.com.jnm.project4;

/**
 * @author Jorge Nicolás Mikitiuk
 * <br/>Proyecto4 - 2018-03-13
 */
public class Application {
	
	/**
	 * This applications checks the number of parameters and print them if there are three of them, in other case prints a help
	 * @param args
	 */
	public static void main(String[] args) {
		Application application = new Application();
		if(application.areValid(args)) {
			application.print(args);
		}else {
			application.printHelp();
		}
	}

	public boolean areValid(String[] args) {
		return args.length == 3;
	}

	public void print(String[] args) {
		for(int i=0; i < 3; i++) {
			System.out.println(args[i]);
		}
	}

	public void printHelp() {
		System.out.println("Debe indicar tres parámetros");
	}
}
