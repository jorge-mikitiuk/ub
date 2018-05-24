package ejercicio3;

import java.util.Collection;

public class Persona {

  private int edad;

  private Collection<Persona> hijos;

  public Persona(int edad, Collection<Persona> hijos) {
    setEdad(edad);
    setHijos(hijos);
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public Collection<Persona> getHijos() {
    return hijos;
  }

  public void setHijos(Collection<Persona> hijos) {
    this.hijos = hijos;
  }

}
