package ar.com.jnm;

import java.util.Set;

class UnknownPerson extends Person {

	UnknownPerson() {
	}

	@Override
	protected void addToSet(Set<Person> set) {
	}

	@Override
	public int compareTo(Person other) {
		System.err.println("Pasando por el compareto");
		return -1;
	}
}
