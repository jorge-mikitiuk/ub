package ar.com.jnm.p41;

public class Producto {

  private String name;

  private float price;

  public Producto(String name, float price) {
    setName(name);
    setPrice(price);
  }

  public String getName() {
    return name;
  }

  private void setName(String name) {
    this.name = name;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }
}
