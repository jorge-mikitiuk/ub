package ar.com.jnm;

public class Persona {

	// Static build method
	public static Persona crearPersonaPorApellido(String apellido) {
		return new Persona(null, apellido, 0);
	}

	// Static build method
	public static Persona crearPersonaPorNombre(String nombre) {
		return new Persona(nombre, null, 0);
	}


	private String nombre;

	private int edad;

	private String apellido;

	private int id;

	public Persona(String nombre, String apellido, int edad) {
		setApellido(apellido);
		setNombre(nombre);
		setEdad(edad);
		setId(Configuracion.getInstance().getNextValue());
	}

	public String getApellido() {
		return apellido;
	}


	public int getEdad() {
		return edad;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setId(int id) {
		this.id = id;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}


}
