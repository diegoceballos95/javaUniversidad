package ej1clinica;
import java.time.LocalDate;

public class Internado extends Paciente{
	//ATRIBUTOS
	private Fecha fechaAlta;
	
	//CONSTRUCTOR
	Internado(String nombre, int dni, String domicilio, String tel, int anio, int mes, int dia, int anioA, int mesA, int diaA){
		super(nombre, dni, domicilio, tel, anio, mes, dia);
		this.fechaAlta = new Fecha(anioA, mesA, diaA);
	}
	
	//GET AND SET
	public LocalDate getFechaAlta() {
		return this.fechaAlta.getFecha();
	}
	public void setFechaAlta(int anio, int mes, int dia) {
		this.fechaAlta.setFecha(anio, mes, dia);
	}
	
	//METODOS
	public String toString() {
		String cadena = "---- DATOS DEL INTERNADO ----\n";
		cadena += super.toString();
		cadena += "Fecha de alta: " + getFechaAlta() + "\n";
		return cadena;
	}

}
