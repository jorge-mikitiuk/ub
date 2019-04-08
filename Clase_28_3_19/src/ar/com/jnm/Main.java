package ar.com.jnm;

public class Main {

	public static void main(String[] args) {
		Persona.crearPersonaPorNombre("Juan I");
		Persona.crearPersonaPorNombre("Juan II");
		Persona.crearPersonaPorNombre("Juan III");
		Persona.crearPersonaPorNombre("Juan IV");
		Persona juanV = Persona.crearPersonaPorNombre("Juan V");

		System.out.println(juanV.getId());
	}

}
