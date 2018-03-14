package ar.com.jnm.project7;

import java.util.Scanner;


/**
 * @author Jorge Nicolás Mikitiuk
 * <br/>Proyecto7 - 2018-03-13
 */
public class Application {

	/**
	 * This application asks two numbers and prints the sum of them
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberA = readNumber(scanner);
		int numeroB = readNumber(scanner);
		System.out.println("La suma es: "+(numberA + numeroB));
		scanner.close();
	}

	private static int readNumber(Scanner scanner) {
		System.out.println("Ingrese un número: ");
		String line = scanner.nextLine();
		return Integer.parseInt(line);
	}

}
