package ej1empresa1;

public class Empleado {

	//ATRIBUTOS
	private String nombre;
	private int dni;
	private String direccion;
	private int antiguedadAños;
	private int telContacto;
	private double salario;
	
	//CONSTRUCTOR
	public Empleado(String nombre, int dni, String direccion, int antiguedad, int telContacto, double salario) {
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.antiguedadAños = antiguedad;
		this.telContacto = telContacto;
		this.salario = salario;
	}
	
	//GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getAntiguedad() {
		return antiguedadAños;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedadAños = antiguedad;
	}
	public int getTelContacto() {
		return telContacto;
	}
	public void setTelContacto(int telContacto) {
		this.telContacto = telContacto;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	//METODOS
	public String toString() {
		String cadena = "---- DATOS DE EMPLEADO -----\n";
		cadena += "Nombre: " + this.nombre + "\n";
		cadena += "DNI: " + this.dni + "\n";
		cadena += "Direccion: " + this.direccion + "\n";
		cadena += "Antiguedad: " + this.antiguedadAños + "\n";
		cadena += "Tel. de Contacto: " + this.telContacto + "\n";
		cadena += "Salario: " + this.salario + "\n";
		return cadena;
	}
	
	public void asignarSalario(double salario) {
		setSalario(salario);
	}
	
	public void incrementarSalario(double incremento) {
		this.salario += incremento;
	}

}
