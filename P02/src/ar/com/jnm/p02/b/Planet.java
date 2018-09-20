package ar.com.jnm.p02.b;

public class Planet {

  private String name;

  private double translation;

  public Planet(String name, double translation) {
    setName(name);
    setTranslation(translation);
  }

  public String getName() {
    return name;
  }

  private void setName(String name) {
    this.name = name;
  }

  public double yearsOld(double yearsInEarth) {
    return yearsInEarth * 365.25 / getTranslation();
  }

  public double getTranslation() {
    return translation;
  }

  private void setTranslation(double translation) {
    this.translation = translation;
  }

}
