package ejercicio4;

public class Persona {

  private String nombre;

  private String apellido;

  private int edad;

  private Genero genero;

  public Persona(String nombre, String apellido, int edad, Genero genero) {
    setNombre(nombre);
    setApellido(apellido);
    setEdad(edad);
    setGenero(genero);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public Genero getGenero() {
    return genero;
  }

  public void setGenero(Genero genero) {
    this.genero = genero;
  }
}
