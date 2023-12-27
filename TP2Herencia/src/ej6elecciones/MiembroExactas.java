package ej6elecciones;

public class MiembroExactas {
	//ATRIBUTOS
	private String nombreCompleto;
	protected int valorVoto;
	protected boolean puedeVotar;
	
	//CONSTRUCTOR
	MiembroExactas(String nombre){
		this.nombreCompleto = nombre;
		this.valorVoto = 0;
		this.puedeVotar = false;
	}

	//GETTERS AND SETTERS
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public int getValorVoto() {
		return valorVoto;
	}
	public void setValorVoto(int valorVoto) {
		this.valorVoto = valorVoto;
	}
	public boolean getPuedeVotar() {
		return puedeVotar;
	}
	public void setPuedeVotar(boolean puedeVotar) {
		this.puedeVotar = puedeVotar;
	}
	
	//METODOS
	public String toString() {
		String cadena = "---- DATOS ----\n";
		cadena += "Nombre y Apellido: " + getNombreCompleto() + "\n";
		cadena += "Valor del voto: " + getValorVoto() + "\n";
		cadena += "Puede votar: " + getPuedeVotar() + "\n";
		return cadena;
	}
	
}
