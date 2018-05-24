package ejercicio1;

public class Persona {

  private String name;

  private Persona padre;

  // Persona madre;
  private Persona pareja;

  public Persona(String name, Persona padre) {
    setName(name);
    setPadre(padre);
  }

  public Persona getPadre() throws PersonaNoEncontradaException {
    if (padre == null)
      throw new PersonaNoEncontradaException(getName() + " no tiene padre");
    return padre;
  }

  public void setPadre(Persona padre) {
    this.padre = padre;
  }

  public Persona getSuegro() throws PersonaNoEncontradaException {
    return getPareja().getPadre();
  }

  public Persona getPareja() throws PersonaNoEncontradaException {
    if (pareja == null)
      throw new PersonaNoEncontradaException(getName() + " no tiene pareja");
    return pareja;
  }

  public void setPareja(Persona pareja) {
    this.pareja = pareja;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
