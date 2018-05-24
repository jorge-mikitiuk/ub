package ar.com.jnm.project14;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		AirTrafficControl control = new AirTrafficControl();
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Define the fuel level:");
			Plane plane = new Plane("GA1756", scan.nextFloat());
			System.out.println("Current level: " + control.checkFuelCondition(plane));
		} finally {
			scan.close();
		}
	}

}
