package ejercicio10;

import java.io.Serializable;

public class Avion implements Serializable, Comparable<Avion> {

  private static final long serialVersionUID = 1L;

  private String identificador;

  private int cantidadMaximaDePasajeros;

  private int distanciaMaximaDeVuelo;

  public Avion(String identificador, int cantidadMaximaDePasajeros, int distanciaMaximaDeVuelo) {
    setIdentificador(identificador);
    setCantidadMaximaDePasajeros(cantidadMaximaDePasajeros);
    setDistanciaMaximaDeVuelo(distanciaMaximaDeVuelo);
  }

  public String getIdentificador() {
    return identificador;
  }

  public void setIdentificador(String identificador) {
    this.identificador = identificador;
  }

  public int getCantidadMaximaDePasajeros() {
    return cantidadMaximaDePasajeros;
  }

  public void setCantidadMaximaDePasajeros(int cantidadMaximaDePasajeros) {
    this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
  }

  public int getDistanciaMaximaDeVuelo() {
    return distanciaMaximaDeVuelo;
  }

  public void setDistanciaMaximaDeVuelo(int distanciaMaximaDeVuelo) {
    this.distanciaMaximaDeVuelo = distanciaMaximaDeVuelo;
  }

  @Override
  public int compareTo(Avion o) {
    return getIdentificador().compareTo(o.getIdentificador());
  }
}
