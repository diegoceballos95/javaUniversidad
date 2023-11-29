package tp6sanatorio;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
	//ATRIBUTOS
	private LocalDate fecha;
		
	//CONSTRUCTOR
	Fecha(){
		this.fecha = LocalDate.now();
	}
	Fecha(int anio, int mes, int dia){
		this.fecha = LocalDate.of(anio, mes, dia);
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}

	//METODOS
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String cadena = this.fecha.format(formato);
		return cadena;
	}
	
}
