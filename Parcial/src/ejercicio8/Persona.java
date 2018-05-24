package ejercicio8;

public class Persona {

  private String name;

  private String surname;

  private int age;

  public Persona(String name, String surname) {
    this(name, surname, 0);
  }

  public Persona(String name, String surname, int age) {
    setName(name);
    setSurname(surname);
    setAge(age);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
