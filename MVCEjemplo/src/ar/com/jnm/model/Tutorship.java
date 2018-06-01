package ar.com.jnm.model;

import java.io.Serializable;

public class Tutorship implements Comparable<Tutorship>, Serializable {

  private static final long serialVersionUID = -8676780127615158844L;

  private Person tutor;

  private Person student;

  public Tutorship(Person tutor, Person student) {
    setTutor(tutor);
    setStudent(student);
  }

  public Person getTutor() {
    return tutor;
  }

  private void setTutor(Person tutor) {
    this.tutor = tutor;
  }

  public Person getStudent() {
    return student;
  }

  private void setStudent(Person student) {
    this.student = student;
  }

  @Override
  public boolean equals(Object obj) {
    return isATutorship(obj) && equals((Tutorship) obj);
  }

  public boolean equals(Tutorship other) {
    return hasTheSameTutor(other) && hasTheSameStudent(other);
  }

  public boolean hasTheSameStudent(Tutorship other) {
    return getStudent().equals(other.getStudent());
  }

  public boolean hasTheSameTutor(Tutorship other) {
    return getTutor().equals(other.getTutor());
  }

  public boolean isATutorship(Object obj) {
    return obj instanceof Tutorship;
  }

  @Override
  public int compareTo(Tutorship other) {
    int i;
    return (i = getTutor().compareTo(other.getTutor())) != 0 ? i : getStudent().compareTo(other.getStudent());
  }

  @Override
  public String toString() {
    return "Tutor: " + getTutor() + ", estudiante: " + getStudent();
  }
}
