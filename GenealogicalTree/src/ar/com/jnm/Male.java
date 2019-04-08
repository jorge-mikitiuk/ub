package ar.com.jnm;

import java.util.Set;

class Male extends Person {

	Male(String name, String surname) {
		super(name, surname);
	}

	@Override
	public Set<Person> getBrothers() {
		Set<Person> brothers = super.getBrothers();
		brothers.remove(this);
		return brothers;
	}

	@Override
	public Set<Person> getStepBrothers(){
		Set<Person> stepBrothers = super.getStepBrothers();
		stepBrothers.remove(this);
		return stepBrothers;
	}

	@Override
	public void setFather(Person father) {
		super.setFather(father);
		father.addSon(this);
	}

	@Override
	public void setMother(Person mother) {
		super.setMother(mother);
		mother.addSon(this);
	}
}
