package ar.com.jnm.p01.a;

import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    double sun = 28.07;
    double mercury = 0.38;
    double venus = 0.91;
    double earth = 1;
    double mars = 0.38;
    double jupiter = 2.53;
    double saturn = 1.07;
    double uranus = 0.91;
    double neptune = 1.13;
    double moon = 0.17;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese su peso en la tierra [Kg]: ");
    double weight = scanner.nextDouble();

    System.out.printf("En la superficie de la Tierra usted pesa: %1$.2fKg\n", (earth * weight));
    System.out.printf("En la superficie de Mercurio usted pesaría: %1$.2fKg\n", (mercury * weight));
    System.out.printf("En la superficie de Venus usted pesaría: %1$.2fKg\n", (venus * weight));
    System.out.printf("En la superficie de Marte usted pesaría: %1$.2fKg\n", (mars * weight));
    System.out.printf("En la superficie de Jupiter usted pesaría: %1$.2fKg\n", (jupiter * weight));
    System.out.printf("En la superficie de Saturno usted pesaría: %1$.2fKg\n", (saturn * weight));
    System.out.printf("En la superficie de Urano usted pesaría: %1$.2fKg\n", (uranus * weight));
    System.out.printf("En la superficie de Neptuno usted pesaría: %1$.2fKg\n", (neptune * weight));
    System.out.printf("En la superficie de la Luna usted pesaría: %1$.2fKg\n", (moon * weight));
    System.out.printf("En la superficie del Sol usted pesaría: %1$.2fKg\n", (sun * weight));

    scanner.close();
  }

}
