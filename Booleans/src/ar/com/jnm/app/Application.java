package ar.com.jnm.app;

import ar.com.jnm.Boolean;

public class Application {

  public static void main(String[] args) throws Exception {
    Boolean b = Boolean.FALSE;
    System.out.println(b);
    b = b.not();
    System.out.println(b);

    b.runWhenTrue(() -> {
      System.out.println("Ejecutando por verdadero");
      return null;
    });
    b.runWhenFalse(() -> {
      System.out.println("Ejecutando por falso");
      return null;
    });
  }

}
