package ejercicio1;

public class PersonaNoEncontradaException extends Exception {

  private static final long serialVersionUID = 1L;

  public PersonaNoEncontradaException(String msg) {
    super(msg);
  }
}
