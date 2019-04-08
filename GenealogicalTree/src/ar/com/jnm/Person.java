package ar.com.jnm;

import java.util.Set;
import java.util.TreeSet;

public abstract class Person implements Comparable<Person> {
	public final static String UNKNOWN = "unknown";

	public static void breakAway(Person p1, Person p2) {
		p1.removeCouple();
		p2.removeCouple();
	}

	public static Person buildFemale(String name, String surname) {
		return new Female(name, surname);
	}

	public static Person buildMale(String name, String surname) {
		return new Male(name, surname);
	}

	public static void marry(Person p1, Person p2) {
		p1.setCouple(p2);
		p2.setCouple(p1);
	}

	private Person couple;
	private Set<Person> daughters;

	private Set<Person> exs;
	private Person father;

	private Person mother;

	private String name;
	private Set<Person> sons;

	private String surname;

	protected Person() {
		setName(UNKNOWN);
		setSurname(UNKNOWN);
		setSons(new TreeSet<Person>());
		setDaughters(new TreeSet<Person>());
		setExs(new TreeSet<Person>());
	}

	protected Person(String name, String surname) {
		setName(name);
		setSurname(surname);
		setSons(new TreeSet<Person>());
		setDaughters(new TreeSet<Person>());
		setExs(new TreeSet<Person>());
		setFather(new UnknownPerson());
		setMother(new UnknownPerson());
		couple = new UnknownPerson();
	}

	protected void addDaughter(Person daughter) {
		daughters.add(daughter);
	}

	protected void addEx(Person ex) {
		ex.addToSet(exs);
	}

	private void addFather(Set<Person> set) {
		getFather().addToSet(set);
	}

	private void addMother(Set<Person> set) {
		getMother().addToSet(set);
	}

	protected void addSon(Person son) {
		sons.add(son);
	}

	protected void addToSet(Set<Person> set) {
		set.add(this);
	}

	@Override
	public int compareTo(Person other) {
		int i;
		return (i = getSurname().compareToIgnoreCase(other.getSurname())) != 0 ? i
				: getName().compareToIgnoreCase(other.getName());
	}

	@Override
	public boolean equals(Object obj) {
		return isAPerson(obj) && equals((Person) obj);
	}

	public boolean equals(Person other) {
		return hasTheSameSurname(other) && hasTheSameName(other);
	}

	public Set<Person> getAncestors() {
		Set<Person> ancestors = new TreeSet<>();
		ancestors.addAll(getParents());
		for (Person parent : getParents())
			ancestors.addAll(parent.getAncestors());

		return ancestors;
	}

	public Set<Person> getAunts() {
		Set<Person> aunts = new TreeSet<>();
		for (Person parent : getParents())
			aunts.addAll(parent.getSisters());
		return aunts;
	}

	public Set<Person> getBrothers() {
		Set<Person> brothers = getFather().getSons();
		brothers.retainAll(getMother().getSons());
		return brothers;
	}

	public Set<Person> getBrothersInLaw() {
		Set<Person> brothersInLaw = new TreeSet<>();
		for (Person sister : getSisters())
			sister.getCouple().addToSet(brothersInLaw);

		brothersInLaw.addAll(getCouple().getBrothers());
		return brothersInLaw;
	}

	public Set<Person> getChildren() {
		Set<Person> children = new TreeSet<>();
		children.addAll(getSons());
		children.addAll(getDaughters());
		return children;
	}

	public Set<Person> getConcuted() {
		Set<Person> concuted = new TreeSet<>();
		concuted.addAll(getCouple().getBrothersInLaw());
		concuted.removeAll(getBrothers());
		return concuted;
	}

	public Set<Person> getConquered() {
		Set<Person> conquered = new TreeSet<>();
		conquered.addAll(getCouple().getSistersInLaw());
		conquered.removeAll(getSisters());
		return conquered;
	}

	public Person getCouple() {
		return couple;
	}

	public Set<Person> getCousins() {
		Set<Person> cousins = new TreeSet<>();

		for (Person aunt : getAunts())
			cousins.addAll(aunt.getSons());

		for (Person uncle : getUncles())
			cousins.addAll(uncle.getSons());

		return cousins;
	}

	public Set<Person> getDaughters() {
		return new TreeSet<>(daughters);
	}

	public Set<Person> getDaughtersInLaw() {
		Set<Person> daughtersInLaw = new TreeSet<>();
		for (Person son : getSons())
			son.getCouple().addToSet(daughtersInLaw);

		return daughtersInLaw;
	}

	public Set<Person> getDecendents() {
		Set<Person> descendents = new TreeSet<>();
		descendents.addAll(getChildren());
		for (Person child : getChildren())
			descendents.addAll(child.getDecendents());

		return descendents;
	}

	public Set<Person> getExs() {
		return new TreeSet<>(exs);
	}

	public Person getFather() {
		return father;
	}

	public Person getFatherInLaw() {
		return getCouple().getFather();
	}

	public Set<Person> getGrandchildren() {
		Set<Person> grandchildren = new TreeSet<>();
		grandchildren.addAll(getGrandsons());
		grandchildren.addAll(getDaughters());
		return grandchildren;
	}

	public Set<Person> getGranddaughters() {
		Set<Person> granddaughters = new TreeSet<>();
		for (Person person : getChildren())
			granddaughters.addAll(person.getDaughters());

		return granddaughters;
	}

	public Set<Person> getGrandfathers() {
		Set<Person> grandfathers = new TreeSet<>();

		for (Person parent : getParents())
			parent.addFather(grandfathers);

		return grandfathers;
	}

	public Set<Person> getGrandmothers() {
		Set<Person> grandmothers = new TreeSet<>();

		for (Person parent : getParents())
			parent.addMother(grandmothers);

		return grandmothers;
	}

	public Set<Person> getGrandsons() {
		Set<Person> grandsons = new TreeSet<>();
		for (Person person : getChildren())
			grandsons.addAll(person.getSons());

		return grandsons;
	}

	public Set<Person> getGreatGranddaughters() {
		Set<Person> ggdaughters = new TreeSet<>();
		for (Person grandchildren : getGrandchildren())
			ggdaughters.addAll(grandchildren.getDaughters());
		return ggdaughters;
	}

	public Set<Person> getGreatGrandfathers() {
		Set<Person> ggfathers = new TreeSet<>();
		for (Person parent : getParents())
			ggfathers.addAll(parent.getGrandfathers());
		return ggfathers;
	}

	public Set<Person> getGreatGrandmothers() {
		Set<Person> ggmothers = new TreeSet<>();
		for (Person parent : getParents())
			ggmothers.addAll(parent.getGrandmothers());
		return ggmothers;
	}

	public Set<Person> getGreatGrandsons() {
		Set<Person> ggsons = new TreeSet<>();
		for (Person grandchildren : getGrandchildren())
			ggsons.addAll(grandchildren.getSons());
		return ggsons;
	}

	public Set<Person> getInLaw() {
		Set<Person> inLaw = new TreeSet<>();

		for (Person child : getChildren())
			inLaw.addAll(child.getCouple().getParents());

		return inLaw;
	}

	public Person getMother() {
		return mother;
	}

	public Person getMotherInLaw() {
		return getCouple().getMother();

	}

	public String getName() {
		return name;
	}

	public Set<Person> getNephews() {
		Set<Person> nephews = new TreeSet<>();
		for (Person sibling : getSiblings())
			nephews.addAll(sibling.getSons());

		return nephews;
	}

	public Set<Person> getNieces() {
		Set<Person> nieces = new TreeSet<>();
		for (Person sibling : getSiblings())
			nieces.addAll(sibling.getDaughters());

		return nieces;
	}

	public Set<Person> getParents() {
		Set<Person> parents = new TreeSet<>();
		getFather().addToSet(parents);
		getMother().addToSet(parents);
		return parents;
	}

	public Set<Person> getSheCousins() {
		Set<Person> sheCousins = new TreeSet<>();

		for (Person aunt : getAunts())
			sheCousins.addAll(aunt.getDaughters());

		for (Person uncle : getUncles())
			sheCousins.addAll(uncle.getDaughters());

		return sheCousins;
	}

	public Set<Person> getSiblings() {
		Set<Person> siblings = new TreeSet<>();
		siblings.addAll(getBrothers());
		siblings.addAll(getSisters());
		siblings.remove(this);
		return siblings;
	}

	public Set<Person> getSisters() {
		Set<Person> sisters = getFather().getDaughters();
		sisters.retainAll(getMother().getDaughters());
		return sisters;
	}

	public Set<Person> getSistersInLaw() {
		Set<Person> sistersInLaw = new TreeSet<>();
		for (Person brother : getBrothers())
			brother.getCouple().addToSet(sistersInLaw);

		sistersInLaw.addAll(getCouple().getSisters());
		return sistersInLaw;
	}

	public Set<Person> getSons() {
		return new TreeSet<>(sons);
	}

	public Set<Person> getSonsInLaw() {
		Set<Person> sonsInLaw = new TreeSet<>();
		for (Person daughter : getDaughters())
			daughter.getCouple().addToSet(sonsInLaw);
		return sonsInLaw;
	}

	public Set<Person> getStepBrothers() {
		Set<Person> stepBrothers = getFather().getSons();
		stepBrothers.addAll(getMother().getSons());
		stepBrothers.removeAll(getBrothers());
		return stepBrothers;
	}

	public Set<Person> getStepChildrens() {
		Set<Person> stepChildrens = getStepSons();
		stepChildrens.addAll(getStepDaughters());
		return stepChildrens;
	}

	public Set<Person> getStepDaughters() {
		Set<Person> stepDaughters = getCouple().getDaughters();
		stepDaughters.removeAll(getDaughters());
		return stepDaughters;
	}

	public Person getStepFather() {
		if (getFather().equals(getMother().getCouple()))
			throw new IllegalStateException();
		return getMother().getCouple();
	}

	public Person getStepMother() {
		if (getMother().equals(getFather().getCouple()))
			throw new IllegalStateException();
		return getFather().getCouple();
	}

	public Set<Person> getStepSiblings() {
		Set<Person> stepSiblings = getStepBrothers();
		stepSiblings.addAll(getStepSisters());
		stepSiblings.remove(this);
		return stepSiblings;
	}

	public Set<Person> getStepSisters() {
		Set<Person> stepSisters = getFather().getDaughters();
		stepSisters.addAll(getMother().getDaughters());
		stepSisters.removeAll(getSisters());
		return stepSisters;
	}

	public Set<Person> getStepSons() {
		Set<Person> stepSons = getCouple().getSons();
		stepSons.removeAll(getSons());
		return stepSons;
	}

	public String getSurname() {
		return surname;
	}

	public Set<Person> getUncles() {
		Set<Person> uncles = new TreeSet<>();
		for (Person parent : getParents())
			uncles.addAll(parent.getBrothers());
		return uncles;
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	public boolean hasTheSameName(Person other) {
		return getName().equalsIgnoreCase(other.getName());
	}

	public boolean hasTheSameSurname(Person other) {
		return getSurname().equalsIgnoreCase(other.getSurname());
	}

	public boolean isAPerson(Object obj) {
		return obj instanceof Person;
	}

	private void removeCouple() {
		addEx(getCouple());
		couple = new UnknownPerson();
	}

	private void setCouple(Person couple) {
		removeCouple();
		this.couple = couple;
	}

	private void setDaughters(Set<Person> daughters) {
		this.daughters = daughters;
	}

	private void setExs(Set<Person> exs) {
		this.exs = exs;
	}


	public void setFather(Person father) {
		this.father = father;
	}

	public void setMother(Person mother) {
		this.mother = mother;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setSons(Set<Person> sons) {
		this.sons = sons;
	}

	private void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return getSurname() + ", " + getName();
	}
}
