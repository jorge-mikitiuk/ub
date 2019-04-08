package ar.com.jnm.main;

import java.util.Collection;

import ar.com.jnm.Person;

public class Application {

  public static void main(String[] args) {
    Person andrea = Person.buildFemale("Andrea", "Ramírez");
    Person jorge = Person.buildMale("Jorge", "Mikitiuk");
    Person.marry(andrea, jorge);

    Person ramiro = Person.buildMale("Ramiro", "Mikitiuk");
    ramiro.setFather(jorge);
    ramiro.setMother(andrea);

    print("Padres de: " + ramiro, ramiro.getParents());
  }

  public static void print(Collection<?> collection) {
    for (Object o : collection)
      print(o);
  }

  public static void print(Object o) {
    System.out.println(o);
  }

  public static void print(Object obj, Collection<?> collection) {
    System.out.println("---- " + obj);
    for (Object o : collection)
      print(o);
    System.out.println();
  }
}
