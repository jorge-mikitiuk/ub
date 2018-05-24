package ejercicio6;

public class Auto {

  private String marca;

  private String modelo;

  public Auto(String marca, String modelo) {
    setMarca(marca);
    setModelo(modelo);
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Auto))
      return false;
    Auto other = (Auto) obj;

    return getMarca().equals(other.getMarca()) && getModelo().equals(other.getModelo());

  }
}
