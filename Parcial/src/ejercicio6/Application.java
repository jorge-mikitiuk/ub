package ejercicio6;

public class Application {

  public static void main(String[] args) {
    Auto auto1 = new Auto("Ford", "Fiesta");
    Auto auto2 = new Auto("Chevrolet", "Corsa");
    Auto auto3 = new Auto("Chevrolet", "Corsa");

    System.out.println(auto1.equals(auto1));
    System.out.println(auto1.equals(auto2));
    System.out.println(auto2.equals(auto2));
    System.out.println(auto2.equals(auto1));
    System.out.println(auto2.equals(auto3));
    System.out.println(auto2.equals(null));
    System.out.println(auto2.equals("Chevrolet, Corsa"));
  }

}
