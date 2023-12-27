package equipoArrayList;

public class Jugador {
	
	//ATRIBUTOS
	private double dni;
	private String nombre;
	private Fecha fchNac;
	
	//CONSTRUCTOR
	public Jugador(double dni, String nombre, Fecha fchNac) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fchNac = fchNac;
	}
	public Jugador(double dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}
	
	//GET && SET
	public double getDni() {
		return dni;
	}
	public void setDni(double dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Fecha getFchNac() {
		return fchNac;
	}
	public void setFchNac(Fecha fchNac) {
		this.fchNac = fchNac;
	}
	
	//METODOS
	public String toString() {
		String cadena = "INFORMACION DEL JUGADOR:\n";
		return cadena;
	}

	
	
}
