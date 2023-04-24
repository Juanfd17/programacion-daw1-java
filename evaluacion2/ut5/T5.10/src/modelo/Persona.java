package modelo;

public class Persona {
	private String nombre;
	// Dos apellidos, separados por un espacio
	private String apellidos;
	private int edad;

	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(apellidos).append(", ").append(nombre).append("\n");
		return sb.toString();
	}
}
