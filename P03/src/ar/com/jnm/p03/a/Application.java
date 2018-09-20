package ar.com.jnm.p03.a;

import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    double k = 6.67E-8;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Indique la masa del primer cuerpo [g]:");
    double massOne = scanner.nextDouble();
    System.out.print("Indique la masa del segundo cuerpo [g]:");
    double massTwo = scanner.nextDouble();
    System.out.print("Indique la distancia entre los cuerpos [cm]:");
    double distance = scanner.nextDouble();
    System.out.printf("Fuerza G:%12.5e dinas", (k * massOne * massTwo / Math.pow(distance, 2)));

    // 5.983E27
    // 7.347E25
    // 3.844E10

    scanner.close();
  }

}
