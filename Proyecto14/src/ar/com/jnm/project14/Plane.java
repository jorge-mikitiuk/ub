package ar.com.jnm.project14;

import ar.com.jnm.project14.exceptions.FuelNotFoundException;

public class Plane {
	private float fuel;
	private String id;

	public Plane(String id,float fuel) {
		setId(id);
		setFuel(fuel);
	}
	
	public float getFuel() throws FuelNotFoundException {
		if(fuel == 0) {
			throw new FuelNotFoundException(getId());
		}
		return fuel;
	}

	public String getId() {
		return id;
	}

	private void setFuel(float fuel) {
		if(fuel < 0) {
			throw new IllegalArgumentException("'fuel' must be a positive-0 value");
		}
		
		this.fuel = fuel;
	}

	private void setId(String id) {
		if(id == null) {
			throw new IllegalArgumentException("'id' can't be null");
		}
		id= id.trim();
		if(id.isEmpty()) {
			throw new IllegalArgumentException("'id' can't be empty");
		}
		this.id = id;
	}
}
