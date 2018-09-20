package ar.com.jnm.p02.b;

import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    Planet planets[] = new Planet[] {
        new Planet("Mercurio", 88), new Planet("Venus", 224.7), new Planet("Tierra", 365.25),
        new Planet("Marte", 686.9), new Planet("J�piter", 11.86 * 365.25),
        new Planet("Saturno", 29.46 * 365.25), new Planet("Urano", 84.01 * 365.25),
        new Planet("Neptuno", 164.8 * 365.25),
    };

    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese su edad [a�os]: ");
    double years = scanner.nextDouble();
    for (Planet planet : planets)
      System.out.printf("En el planeta %1$s usted tendr�a: %2$.2f a�os\n", planet.getName(),
          planet.yearsOld(years));

    scanner.close();
  }

}
