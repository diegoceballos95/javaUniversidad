package ej5ParamountPictures;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
	//ATRIBUTOS
	private LocalDate fecha;
	
	//CONSTRUCTOR
	Fecha(int anio, int mes, int dia){
		this.fecha = LocalDate.of(anio, mes, dia);
	}
	//CONSTRUCTOR QUE CREA UNA FECHA DE DEVOLUCION A 30 DIAS DESDE HOY
	Fecha(){	
		this.fecha = LocalDate.now().plusDays(30);
	}
	
	//METODOS
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String cadena = this.fecha.format(formato);
		return cadena;
	}
}
