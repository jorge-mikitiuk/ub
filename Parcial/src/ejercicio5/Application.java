package ejercicio5;

public class Application {

  public static void main(String[] args) {
    Application application = new Application();

    int[][] valores = new int[][] {
        new int[] {
            0, 1, 2, 3, 4, 5
        }, new int[] {
            0, 1, 5, 3, 4, 5
        }, new int[] {
            5, 1, 2, 3, 4, 5
        }, new int[] {
            0, 1, 5, 3, 4, 5
        }, new int[] {
            0, 5, 2, 3, 4, 5
        },
    };

    for (int i = 0; i <= 5; i++)
      System.out.println(i + " aparece " + application.contar(valores, i) + " veces");

  }

  public int contar(int[][] valores, int valorAContar) {
    int contador = 0;
    for (int[] line : valores)
      for (int value : line)
        if (valorAContar == value)
          contador++;

    return contador;
  }
}
