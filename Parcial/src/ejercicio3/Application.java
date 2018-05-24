package ejercicio3;

import java.util.ArrayList;
import java.util.Collection;

public class Application {

  public static void main(String[] args) {

    Persona persona1 = new Persona(1, new ArrayList<>());
    Persona persona2 = new Persona(2, new ArrayList<>());
    Persona persona3 = new Persona(3, new ArrayList<>());
    Persona persona4 = new Persona(13, new ArrayList<>());
    Persona persona5 = new Persona(13, new ArrayList<>());

    Collection<Persona> hijos = new ArrayList<>();
    hijos.add(persona1);
    hijos.add(persona2);

    Persona persona6 = new Persona(23, hijos);

    hijos = new ArrayList<>();
    hijos.add(persona3);
    Persona persona7 = new Persona(33, hijos);

    hijos = new ArrayList<>();
    hijos.add(persona4);
    hijos.add(persona5);

    Persona persona8 = new Persona(41, hijos);

    hijos = new ArrayList<>();
    hijos.add(persona6);
    hijos.add(persona7);
    hijos.add(persona8);

    Persona persona9 = new Persona(63, hijos);

    Collection<Persona> poblacion = new ArrayList<>();
    poblacion.add(persona1);
    poblacion.add(persona2);
    poblacion.add(persona3);
    poblacion.add(persona4);
    poblacion.add(persona5);
    poblacion.add(persona6);
    poblacion.add(persona7);
    poblacion.add(persona8);
    poblacion.add(persona9);

    System.out.println(new Application().getPromedioDeHijos(poblacion, 20, 45));

  }

  public float getPromedioDeHijos(Collection<Persona> personas, int edadDesde, int edadHasta) {
    int contadorPersonas = 0;
    int contadorHijos = 0;
    for (Persona persona : personas)
      if (persona.getEdad() >= edadDesde && persona.getEdad() <= edadHasta) {
        contadorPersonas++;
        contadorHijos += persona.getHijos().size();
      }

    return (float) contadorHijos / contadorPersonas;
  }
}
