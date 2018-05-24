package ar.com.jnm.project9;

import java.util.Scanner;

/**
 * @author Jorge Nicolás Mikitiuk
 * <br/>Proyecto9 - 2018-03-13
 */
public class Application {

	/**
	 * This application counts how many words has a line
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);

		String line =  scanner.nextLine();
		line = removeSpaces(line);
		int quantity = countWords(line);
		System.out.println(quantity);
		
		scanner.close();
	}

	/**
	 * This method counts how many words has the line
	 * @param line
	 * @return
	 */
	private static int countWords(String line) {
		String[] strings = line.split(" ");
		int quantity = strings.length;
		return quantity;
	}

	/**
	 * This method removes additional spaces
	 * @param line
	 * @return
	 */
	private static String removeSpaces(String line) {
		String doubleSpace= "  ";
		String singleSpace= " ";
		
		while (line.contains(doubleSpace))
			line = line.replace(doubleSpace, singleSpace);
		
		return line.trim();
	}

}
