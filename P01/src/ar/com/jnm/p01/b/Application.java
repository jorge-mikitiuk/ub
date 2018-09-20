package ar.com.jnm.p01.b;

import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    Planet planets[] = new Planet[] {
        new Planet("Mercurio", 0.38), new Planet("Venus", 0.91), new Planet("Tierra", 1),
        new Planet("Marte", 0.38), new Planet("Júpiter", 2.53), new Planet("Saturno", 1.07),
        new Planet("Urano", 0.91), new Planet("Neptuno", 1.13),
    };

    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese su peso en la tierra [Kg]: ");
    double weight = scanner.nextDouble();
    for (Planet planet : planets)
      System.out.printf("En la superficie del planeta %1$s usted pesaría: %2$.2fKg\n", planet.getName(),
          planet.getWeightInSurface(weight));

    scanner.close();
  }

}
