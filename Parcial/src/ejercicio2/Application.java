package ejercicio2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class Application {

  public static void main(String[] args) {
    Collection<Persona> personasDesordenadas = new ArrayList<Persona>();
    personasDesordenadas.add(new Persona("Juan", "Perez"));
    personasDesordenadas.add(new Persona("Julio", "Cesar"));
    personasDesordenadas.add(new Persona("Cesar", "Vargas"));
    personasDesordenadas.add(new Persona("Mario", "Llosa"));
    personasDesordenadas.add(new Persona("Mario", "Pergolini"));
    personasDesordenadas.add(new Persona("Pedro", "Baravalle"));
    personasDesordenadas.add(new Persona("Esteban", "Landrú"));
    personasDesordenadas.add(new Persona("Esteban", "Perez"));

    Collection<Persona> ordenados = new Application().ordenar(personasDesordenadas);

    for (Persona persona : ordenados) {
      System.out.println(persona);
    }
  }

  public Collection<Persona> ordenar(Collection<Persona> desordenado) {
    Set<Persona> out = new TreeSet<Persona>(new ApellidoNombreComparator());
    out.addAll(desordenado);
    return out;
  }

}
