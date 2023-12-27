package juegoMonedaClase4;

public class Sombrero {
	//ATRIBUTOS
	boolean contieneMoneda;
	
	//CONSTRUCOR
	Sombrero(boolean valor){
		this.contieneMoneda = valor;
	}
	
	//SET AND GET
	public boolean getContieneMoneda() {
		return this.contieneMoneda;
	}
	public void setContieneMoneda(boolean valor) {
		this.contieneMoneda = valor;
	}
	
	//METODOS
	public String toString() {
		String cadena = "";
		cadena += "Contiene la moneda?: " + this.contieneMoneda + "\n";
		return cadena;
	}
}
