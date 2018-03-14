package ar.com.jnm.project8;

import java.util.Scanner;

/**
 * @author Jorge Nicolás Mikitiuk
 * <br/>Proyecto8 - 2018-03-13
 */
public class Application {

	/**
	 * This application asks a char and a string, and then prints the quantity of instances of the char in the string
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char characterToFind = readChar(scanner);
		String line = readString(scanner);
		int quantity = countInstances(characterToFind, line);
		printResult(quantity);
		scanner.close();
	}

	/**
	 * This method prints the quantity 
	 * @param quantity
	 */
	private static void printResult(int quantity) {
		System.out.println("La letra indicada se ha detectado " + quantity + " veces");
	}

	/**
	 * This method counts the instances of the char in the line
	 * @param characterToFind
	 * @param line
	 * @return
	 */
	private static int countInstances(char characterToFind, String line) {
		int quantity = 0;
		int position = line.indexOf(characterToFind);
		while (position != -1) {
			quantity++;
			position = line.indexOf(characterToFind, position + 1);
		}
		return quantity;
	}

	/**
	 * This method reads a String from the Scanner
	 * @param scanner
	 * @return
	 */
	private static String readString(Scanner scanner) {
		System.out.println("Ingrese la cadena donde se contabilizará la letra:");
		String line = scanner.nextLine();
		return line;
	}

	/**
	 * This method reads a char from the scanner
	 * @param scanner
	 * @return
	 */
	private static char readChar(Scanner scanner) {
		System.out.println("Ingrese la letra a contar:");
		char characterToFind = scanner.nextLine().charAt(0);
		return characterToFind;
	}
}
