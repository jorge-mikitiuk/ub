package ar.com.jnm;

import java.util.Comparator;

public class ComparadorPorNombreInverso implements Comparator<Persona>{

	@Override
	public int compare(Persona personaUno, Persona personaDos) {
		return personaDos.getNombre().compareTo(personaUno.getNombre());
	}

}
