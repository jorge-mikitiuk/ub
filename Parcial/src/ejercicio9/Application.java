package ejercicio9;

public class Application {

  public static void main(String[] args) {
    // System.out.println(getMidle((Object[]) null));
    // System.out.println(getMidle(new String[] {}));
    System.out.println(getMidle(new String[] {
        "Hola"
    }));
    System.out.println(getMidle(new String[] {
        "Hola", "Mundo"
    }));
    System.out.println(getMidle(new String[] {
        "Hola", "Mundo", "Cruel"
    }));
  }

  public static <E> E getMidle(E[] elements) {
    if (elements == null)
      throw new IllegalArgumentException("El arreglo no puede ser nulo");

    if (elements.length == 0)
      throw new IllegalArgumentException("El arreglo no puede ser vacio");

    return elements[elements.length / 2];
  }
}
