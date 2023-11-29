package ej1clinica;
import java.time.LocalDate;

public class Fecha {
	//ATRIBUTOS
	LocalDate fecha;

	//CONSTRUCTOR
	public Fecha(int anio, int mes, int dia){
		this.fecha = LocalDate.of(anio, mes, dia);
	}
	
	//GET AND SET
	public LocalDate getFecha() {
		return this.fecha;
	}
	public void setFecha(int anio, int mes, int dia) {
		this.fecha = LocalDate.of(anio, mes, dia);
	}
}
