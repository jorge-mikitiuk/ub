package ar.com.jnm.p01.b;

public class Planet {

  private String name;

  private double gForce;

  public Planet(String name, double gForce) {
    setName(name);
    setgForce(gForce);
  }

  public String getName() {
    return name;
  }

  private void setName(String name) {
    this.name = name;
  }

  public double getgForce() {
    return gForce;
  }

  private void setgForce(double gForce) {
    this.gForce = gForce;
  }

  public double getWeightInSurface(double weightInEarthSurface) {
    return getgForce() * weightInEarthSurface;
  }

}
