package ar.com.jnm.project15;

public class Plane {
	private String id;
	private String status;
	
	public Plane(String id) {
		setId(id);
		setStatus("Landed");
	}

	public String getId() {
		return id;
	}

	public String getStatus() {
		return status;
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

	public void setStatus(String status) {
		if(status == null) {
			throw new IllegalArgumentException("'status' can't be null");
		}
		status= status.trim();
		if(status.isEmpty()) {
			throw new IllegalArgumentException("'status' can't be empty");
		}
		this.status = status;
	}
}
