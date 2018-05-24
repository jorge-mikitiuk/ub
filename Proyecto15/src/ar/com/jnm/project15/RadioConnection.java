package ar.com.jnm.project15;

public class RadioConnection implements AutoCloseable{

	private Plane plane;
	
	public RadioConnection(Plane plane) {
		setPlane(plane);
		System.out.println("Opening conection with "+plane.getId());
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Closing connection with "+plane.getId());
	}

	private Plane getPlane() {
		return plane;
	}

	public String getPlaneStatus() {
		return "The status of the plane "+getPlane().getId()+" is "+ getPlane().getStatus();
	}

	private void setPlane(Plane plane) {
		if(plane == null) {
			throw new IllegalArgumentException("'plane' can't be null");
		}
		
		this.plane = plane;
	}

}
