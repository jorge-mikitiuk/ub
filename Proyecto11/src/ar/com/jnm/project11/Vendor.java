package ar.com.jnm.project11;

public class Vendor extends Employee {
	private Client[] clients;

	public Client[] getClients() {
		return clients;
	}

	public void setClients(Client[] clients) {
		this.clients = clients;
	}
}
