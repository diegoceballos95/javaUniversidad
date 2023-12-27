package ej1clinica;

public class Ambulatorio extends Paciente {
	//ATRIBUTOS 
	private String observaciones;
	
	//CONSTRUCTOR
	Ambulatorio(String nombre, int dni, String domicilio, String tel, int anio, int mes, int dia, String observaciones){
		super(nombre, dni, domicilio, tel, anio, mes, dia);
		this.observaciones = observaciones;
	}
	
	//GET AND SET
	public String getObservaciones() {
		return this.observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	//METODOS
	public String toString() {
		String cadena = "---- DATOS DEL AMBULATORIO ----\n";
		cadena += super.toString();
		cadena += "Observaciones: " + getObservaciones() + "\n";
		return cadena; 
	}
}
