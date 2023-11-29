package ej6elecciones;

public class Docente extends MiembroExactas{
	//ATRIBUTOS
	private boolean cargoRegular;

	//CONSTRUCTOR
	public Docente(String nombre, boolean cargoRegular) {
		super(nombre);
		super.valorVoto = 3;
		this.cargoRegular = cargoRegular;
		if (this.cargoRegular) {
			super.puedeVotar = true;
		}
	}

	//GETTERS AND SETTERS
	public boolean getCargoRegular() {
		return cargoRegular;
	}
	public void setCargoRegular(boolean cargoRegular) {
		this.cargoRegular = cargoRegular;
	}
	
	//METODOS
	public String toString() {
		String cadena = super.toString();
		cadena += "Cargo Regular: " + getCargoRegular() + "\n";
		return cadena;
	}
}
