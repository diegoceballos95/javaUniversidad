package ej1empresa1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
	//ATRIBUTOS
	private LocalDate fecha;
	
	//CONSTRUCTOR
	Fecha(int dia, int mes, int anio){
		this.fecha = LocalDate.of(anio, mes, dia);
	}
	
	//GETTER AND SETTER
	public LocalDate getFecha() {
		return this.fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	//METODOS
	public String toString() {
		String cadena = "";
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		cadena += this.fecha.format(formato) + "\n";
		return cadena;
	}
}
