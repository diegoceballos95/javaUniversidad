package ej5ParamountPictures;

public class Autor {
	//ATRIBUTOS
	private String nombre;
	private String nacionalidad;
	private Fecha fchNac;
	private Fecha fchFall;
	
	//CONSTRUCTOR
	public Autor(String nombre, String nacionalidad, Fecha fchNac, Fecha fchFall) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.fchNac = fchNac;
		this.fchFall = fchFall;
	}

	//GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public Fecha getFchNac() {
		return fchNac;
	}
	public void setFchNac(Fecha fchNac) {
		this.fchNac = fchNac;
	}
	public Fecha getFchFall() {
		return fchFall;
	}
	public void setFchFall(Fecha fchFall) {
		this.fchFall = fchFall;
	}
	
	//METODOS
	public String toString() {
		String cadena = "*** Datos del autor ***\n";
		cadena += "Nombre: " + this.nombre + "\n";
		cadena += "Nacionalidad: " + this.nombre + "\n";
		cadena += "Nacimiento: " + this.fchNac + "\n";
		cadena += "Fallecimiento: " + this.fchFall + "\n";
		return cadena;
	}
}
