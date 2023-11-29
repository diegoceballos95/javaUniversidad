package ej1empresa1;

public class Vehiculo {
	//ATRIBUTOS
	private String matricula;
	private String marca;
	private String modelo;

	//CONSTRUCTOR
	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	//GETTERS AND SETTERS
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//METODOS
	public String toString() {
		String cadena = "";
		cadena += "Vehiculo -> MARCA: " + getMarca() + " - MODELO: " + getModelo() + " - MATRICULA: " + getMatricula() + "\n";
		return cadena;
	}
}

