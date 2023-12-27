package ej5cajaDeAhorro;

public class Caja {

	//ATRIBUTOS
	private double saldo;
	private int cantExtracciones;
	
	//CONSTRUCTOR
	Caja(double saldo){
		this.saldo = saldo;
		this.cantExtracciones = 0;
	}

	//GET AND SET
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getCantExtracciones() {
		return this.cantExtracciones;
	}
	public void setCantExtracciones(int cantExtracciones) {
		this.cantExtracciones = cantExtracciones;
	}
	
	//METODOS
	public double consultarSaldo() {
		return getSaldo();
	}
	
	public void depositar(double dinero) {
		this.saldo += dinero;
	}
	
	public void extraer(double dinero) {
		this.saldo -= dinero;
	}
	public void nuevaExtraccion() {
		this.cantExtracciones += 1;
	}
}
