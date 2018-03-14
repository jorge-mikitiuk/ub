package ar.com.jnm.fizzbuzz;

/**
 * @author Jorge Nicolás Mikitiuk
 * <br/>NodesBasedFizzBuzz - 2018-03-13
 * 
 * <br/>This class prints text messages and ignores the number received as parameter
 */

public class StringPrinter extends Printer {

	private String message;

	public StringPrinter(String message) {
		setMessage(message);
	}

	@Override
	public void print(int number) {
		System.out.println(getMessage());
	}

	private String getMessage() {
		return message;
	}

	private void setMessage(String message) {
		this.message = message;
	}

}
