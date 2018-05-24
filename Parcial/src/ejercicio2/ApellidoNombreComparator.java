package ejercicio2;

import java.util.Comparator;

public class ApellidoNombreComparator implements Comparator<Persona> {

  @Override
  public int compare(Persona o1, Persona o2) {
    int i = o1.getSurname().compareTo(o2.getSurname());

    return i == 0 ? o1.getName().compareTo(o2.getName()) : i;
  }

}
