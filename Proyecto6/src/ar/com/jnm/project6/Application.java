package ar.com.jnm.project6;

/**
 * @author Jorge Nicolás Mikitiuk <br/>
 * 		Proyecto6 - 2018-03-13
 */
public class Application {

	/**
	 * This applications prints numbers from 0 up to 100, but when the number is
	 * divisible by 3 prints "fizz" and when the number is divisible by 5 prints
	 * "buzz".
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0)
				System.out.print("fizz");
			if (i % 5 == 0)
				System.out.print("buzz");
			if (i % 3 != 0 && i % 5 != 0)
				System.out.print(i);
			System.out.println();
		}
	}

}
