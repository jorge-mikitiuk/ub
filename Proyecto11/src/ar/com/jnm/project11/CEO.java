package ar.com.jnm.project11;

public class CEO extends Employee{
	private Secretary secretary;
	private Boss[] bosses;
	
	public Secretary getSecretary() {
		return secretary;
	}

	public void setSecretary(Secretary secretary) {
		this.secretary = secretary;
	}

	public Boss[] getBosses() {
		return bosses;
	}

	public void setBosses(Boss[] bosses) {
		this.bosses = bosses;
	}
}
