package ar.com.jnm.project14;

import ar.com.jnm.project14.exceptions.FuelNotFoundException;

public class AirTrafficControl {

	public float checkFuelCondition(Plane plane){
		System.out.println("Starting fuel check");
		try {
			return plane.getFuel();
		} catch (FuelNotFoundException e) {
			e.printStackTrace();
			return 0;
		} finally {
			System.out.println("Finishing fuel check");
		}
	}
}
