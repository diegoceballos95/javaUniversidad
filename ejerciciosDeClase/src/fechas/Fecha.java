package fechas;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fecha {
	
	private LocalDateTime fechaYHora;
	
	//CONSTRUCTORES
	public 	Fecha() {
		this.fechaYHora = LocalDateTime.now();
	}
	public 	Fecha(int dia, int mes, int anio, int hora, int min) {
		this.fechaYHora = LocalDateTime.of (anio, mes, dia, hora, min);
	}
	
	//GETTERS Y SETTERS
	public int getAnio() {
		return this.fechaYHora.getYear();
	}
	public void setAnio(int anio) {
		this.fechaYHora = this.fechaYHora.withYear(anio);
	}
	
	//METODOS
	public String toString(){
		String cadena;
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		cadena = this.fechaYHora.format(formato);
		return cadena;
	}
}
