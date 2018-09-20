package ar.com.jnm.p02.a;

import java.util.Scanner;

public class Application {

  public static void main(String[] args) {

    int mercury = 88;
    int venus = 225;
    int earth = 365;
    int mars = 687;
    int jupiter = 4329;
    int saturn = 10753;
    int uranus = 30664;
    int neptune = 60152;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese su edad [años]: ");
    int years = scanner.nextInt();

    System.out.printf("En el planeta Tierra usted tendría: %1$d años\n", (years * earth / earth));
    System.out.printf("En el planeta Mercurio usted tendría: %1$d años\n", (years * earth / mercury));
    System.out.printf("En el planeta Venus usted tendría: %1$d años\n", (years * earth / venus));
    System.out.printf("En el planeta Marte usted tendría: %1$d años\n", (years * earth / mars));
    System.out.printf("En el planeta Jupiter usted tendría: %1$d años\n", (years * earth / jupiter));
    System.out.printf("En el planeta Saturno usted tendría: %1$d años\n", (years * earth / saturn));
    System.out.printf("En el planeta Urano usted tendría: %1$d años\n", (years * earth / uranus));
    System.out.printf("En el planeta Neptuno usted tendría: %1$d años\n", (years * earth / neptune));

    scanner.close();
  }

}
