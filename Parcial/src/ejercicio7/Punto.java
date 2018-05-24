package ejercicio7;

import static java.lang.Math.hypot;

public class Punto {

  private double x;

  private double y;

  public Punto(double x, double y) {
    setX(x);
    setY(y);
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double distance(Punto other) {
    return hypot(getX() - other.getX(), getY() - other.getY());
  }
}
