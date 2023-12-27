package ej3redes;

public class Direccion {
	//ATRIBUTOS
	private int direccionX;
	private int direccionY;
	//CONSTRUCTOR
	public Direccion(int direccionX, int direccionY) {
		this.direccionX = direccionX;
		this.direccionY = direccionY;
	}
	//GETTERS Y SETTERS
	public int getDireccionX() {
		return direccionX;
	}
	public void setDireccionX(int direccionX) {
		this.direccionX = direccionX;
	}
	public int getDireccionY() {
		return direccionY;
	}
	public void setDireccionY(int direccionY) {
		this.direccionY = direccionY;
	}
	//METODOS
	public String toString() {
		String cadena = "DIRECCION: " + this.direccionX + "." + this.direccionY + "\n";
		return cadena;
	}
	
	
	
}
