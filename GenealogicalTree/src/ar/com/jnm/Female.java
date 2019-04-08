package ar.com.jnm;

import java.util.Set;

class Female extends Person {

	Female(String name, String surname) {
		super(name, surname);
	}

	@Override
	public Set<Person> getSisters() {
		Set<Person> sisters = super.getSisters();
		sisters.remove(this);
		return sisters;
	}

	@Override
	public Set<Person> getStepSisters() {
		Set<Person> stepSisters = super.getStepSisters();
		stepSisters.remove(this);
		return stepSisters;
	}

	@Override
	public void setFather(Person father) {
		super.setFather(father);
		father.addDaughter(this);
	}

	@Override
	public void setMother(Person mother) {
		super.setMother(mother);
		mother.addDaughter(this);
	}
}
