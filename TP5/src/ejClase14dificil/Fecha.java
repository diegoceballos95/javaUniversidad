package ejClase14dificil;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
	//ATRIBUTOS
	private LocalDate fecha;
	
	//CONSTRUCTOR
	Fecha(int anio, int mes, int dia){
		this.fecha = LocalDate.of(anio, mes, dia);
	}
	
	//METODOS
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String cadena = this.fecha.format(formato);
		return cadena;
	}
}
