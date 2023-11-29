package ej3redes;

public class Host {
	//ATRIBUTOS
	private Direccion direccion;
	private Red redConectada;

	//CONSTRUCTOR
	public Host(Direccion direccion) {
		this.direccion = direccion;
		this.redConectada = null;
	}
	
	public Direccion getDireccion() {
		return this.direccion;
	}
	
	//METODOS
	public void conectar(Red red) {
		this.redConectada = red;
	}
	public String toString() {
		String cadena = "DATOS DEL HOST:\n";
		cadena += this.direccion.toString();
		cadena += "RED CONECTADA: " + this.redConectada.getDireccion() + "\n";
		return cadena;
	}
}
