package ar.com.jnm.model;

import java.io.Serializable;

public class Person implements Comparable<Person>, Serializable {

  private static final long serialVersionUID = -2790699555505177785L;

  private String name;

  private int age;

  public Person(String name, int age) {
    setName(name);
    setAge(age);
  }

  public String getName() {
    return name;
  }

  private void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  private void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return getName() + " (" + getAge() + ")";
  }

  @Override
  public boolean equals(Object obj) {
    return isAPerson(obj) && equals((Person) obj);
  }

  public boolean equals(Person person) {
    return hasTheSameName(person) && hasTheSameAge(person);
  }

  public boolean hasTheSameAge(Person other) {
    return getAge() == other.getAge();
  }

  public boolean hasTheSameName(Person other) {
    return getName().equals(other.getName());
  }

  public boolean isAPerson(Object obj) {
    return obj instanceof Person;
  }

  @Override
  public int hashCode() {
    return getName().hashCode();
  }

  @Override
  public int compareTo(Person other) {
    int i;
    return (i = getName().compareTo(other.getName())) != 0 ? i : getAge() - other.getAge();
  }

}
