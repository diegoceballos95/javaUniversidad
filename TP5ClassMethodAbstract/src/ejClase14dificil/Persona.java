package ejClase14dificil;

public class Persona {
	//ATRIBUTOS
	private int dni;
	private String nombre;
	private Fecha nacimiento;
	
	//CONSTRUCTOR
	public Persona(int dni, String nombre, Fecha nacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.nacimiento = nacimiento;
	}

	//GETTERS AND SETTERS
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Fecha getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(Fecha nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String toString() {
		String cadena = getNombre();
		return cadena;
	}
}