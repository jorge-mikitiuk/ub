package ar.com.jnm;

public class Configuracion {

	// Singleton
	private static Configuracion instance= null;

	// M�todo est�tico para obtener la instancia
	public static Configuracion getInstance() {
		// Lazy initialization
		if(instance == null)
			instance= new Configuracion();

		return instance;
	}


	// Un atributo de instancia
	private int secuencia=0;

	// Constructor privado para evitar que se creen instancias por fuera de la clase
	private Configuracion() {
	}

	// Un secuenciador at�mico
	public int getNextValue() {
		secuencia++;
		return secuencia;
	}
}
