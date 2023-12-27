package ej1clinica;
import java.time.LocalDate;

public class Paciente{
	
	//ATRIBUTOS
	private String nombre;
	private int dni;
	private String domicilio;
	private String telefno;
	private Fecha fecha;
	
	//CONSTRUCTORES
	Paciente(String nombre, int dni, String domicilio, String tel, int anio, int mes, int dia){
		this.nombre = nombre;
		this.dni = dni;
		this.domicilio = domicilio;
		this.telefno = tel;
		this.fecha = new Fecha(anio, mes, dia);
	}
	
	//GET AND SET
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return this.dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getDomicilio() {
		return this.domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getTelefono() {
		return this.telefno;
	}
	public void setTelefono(String telefono) {
		this.telefno = telefono;
	}
	public LocalDate getFecha() {
		return this.fecha.getFecha();
	}
	public void setFecha(int anio, int mes, int dia) {
		this.fecha.setFecha(anio, mes, dia);
	}

	//METODOS
	public String toString() {
		String cadena = "";
		cadena += "Nombre: " + getNombre() + "\n";
		cadena += "Dni: " + getDni() + "\n";
		cadena += "Domicilio: " + getDomicilio() + "\n";
		cadena += "Telefono: " + getTelefono() + "\n";
		cadena += "Fecha de ingreso: " + getFecha() + "\n";
		return cadena;
	}	
}
