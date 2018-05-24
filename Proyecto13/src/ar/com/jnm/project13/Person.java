package ar.com.jnm.project13;

import ar.com.jnm.project13.exceptions.AgeOutOfRangeException;
import ar.com.jnm.project13.exceptions.ValueNotSupportedException;

public class Person {
	private String name;
	private String surname;
	private int age;

	public Person(String name, String surname, int age) {
		setName(name);
		setSurname(surname);
		setAge(age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0 || age > 130) {
			throw new AgeOutOfRangeException();
		}
		this.age = age;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		if(name == null) {
			throw new ValueNotSupportedException("'name' can't be null");
		}
		name= name.trim();
		if(name.isEmpty()) {
			throw new ValueNotSupportedException("'name' can't be empty");
		}
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	private void setSurname(String surname) {
		if(surname == null) {
			throw new ValueNotSupportedException("'surname' can't be null");
		}
		surname= surname.trim();
		if(surname.isEmpty()) {
			throw new ValueNotSupportedException("'surname' can't be empty");
		}
		this.surname = surname;
	}
}
