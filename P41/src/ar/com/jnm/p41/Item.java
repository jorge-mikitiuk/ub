package ar.com.jnm.p41;

public class Item {

  private Producto product;

  private int quantity;

  public Item(Producto product, int quantity) {
    setProduct(product);
    setQuantity(quantity);
  }

  public Producto getProduct() {
    return product;
  }

  public void setProduct(Producto product) {
    this.product = product;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
