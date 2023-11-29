package modelo1Parcial;
import java.time.LocalDate;

public class Fecha {
	//ATRIBUTOS
	private LocalDate fecha;
	
	//CONSTRUCTOR
	Fecha(int anio, int mes, int dia){
		this.fecha = LocalDate.of(anio, mes, dia);
	}
	
	public String toString() {
		String cadena = this.fecha.getYear()+"-"+this.fecha.getMonth()+"-"+this.fecha.getDayOfMonth();
		return cadena;
	}
}
