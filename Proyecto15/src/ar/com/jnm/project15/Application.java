package ar.com.jnm.project15;

public class Application {

	public static void main(String[] args) {
		Plane af2133 = new Plane("AF2133");
		AirTrafficControl control = new AirTrafficControl();
		control.checkStatus(af2133);
	}

}
