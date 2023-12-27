package modelo1Parcial;

public class Persona {
	//ÁTRIBUTOS
	private String nombre;
	private int dni;
	private String correo;
	//CONSTRUTOR
	public Persona(String nombre, int dni, String correo) {
		this.nombre = nombre;
		this.dni = dni;
		this.correo = correo;
	}
	//METODOS
	public String getNombre() {
		return nombre;
	}
	public int getDni() {
		return dni;
	}
	public String getCorreo() {
		return correo;
	}
}
