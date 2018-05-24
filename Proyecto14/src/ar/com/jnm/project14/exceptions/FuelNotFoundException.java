package ar.com.jnm.project14.exceptions;

public class FuelNotFoundException extends PlaneOperationException {

	private static final long serialVersionUID = 1L;

	public FuelNotFoundException(String planeId) {
		super("The plane '"+planeId+"' is run out of fuel!");
	}


}
