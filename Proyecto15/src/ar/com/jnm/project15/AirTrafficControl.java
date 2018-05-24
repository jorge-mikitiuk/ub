package ar.com.jnm.project15;

public class AirTrafficControl {
	public void checkStatus(Plane plane) {
		try (RadioConnection connection = new RadioConnection(plane)) {
			System.out.println("Verifying plane status...");
			System.out.println(connection.getPlaneStatus());
		} catch (Exception e) {
			System.err.println("We can't start a communication with plane "+plane.getId());
			e.printStackTrace();
		}
	}
}
