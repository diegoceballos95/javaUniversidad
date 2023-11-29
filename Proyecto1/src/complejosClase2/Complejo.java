package complejosClase2;

public class Complejo {
	
	//ATRIBUTOS
	private double real;
	private double imaginario;
	
	//CONSTRUCTORES - SOBRECARGA
	Complejo(){
		this.real = 1;
		this.imaginario = 1;
	}
	Complejo(double r,double i){
		this.real = r;
		this.imaginario = i;
	}
	
	//GETTERS Y SETTERS
	public void setReal(double real) {
		this.real = real;
	}
	public double getReal() {
		return this.real;
	}
	public void setImaginario(double imaginario) {
		this.imaginario = imaginario;
	}
	public double getImaginario(){
		return this.imaginario;
	}
	
	//METODOS
	public void mostrar(){
		System.out.println("El Numero es :" + real + " + " + imaginario + " i");
	}
	
	public void sumar(Complejo otro){
		this.real += otro.real;
		this.imaginario += otro.imaginario;
	}
	
	public void restar(Complejo otro) {
		this.real -= otro.real;
		this.imaginario -= otro.imaginario;
	}
}