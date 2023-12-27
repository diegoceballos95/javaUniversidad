package ej5ParamountPictures;

public class LibroDigital extends Libro {
	//ATRIBUTOS
	private String formato;;
	private double peso;
	
	//CONSTRUCTOR
	public LibroDigital(String codigo, String titulo, Autor autor, Fecha fhcPublicacion, Fecha fchIngreso, String formato, double peso) {
		super(codigo, titulo, autor, fhcPublicacion, fchIngreso);
		this.formato = formato;
		this.peso = peso;
	}
	
	//GETTERS AND SETTERS
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//METODOS
	public String toString() {
		String cadena = super.toString();
		cadena += "Formato: " + this.formato + "\n";
		cadena += "Peso " + this.peso + " MegaBytes\n";
		return cadena;
	}
}
