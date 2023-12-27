package ej1empresa1;

public class Vendedor extends Empleado{

	//ATRIBUTOS
	private Vehiculo vehiculo;
	private int telMovil;
	
	//CONSTRUCTOR
	Vendedor(String nombre, int dni, String direccion, int antiguedad, int telContacto, double salario, Vehiculo vehiculo, int movil){
		super(nombre, dni, direccion, antiguedad, telContacto, salario);
		this.vehiculo = vehiculo;
		this.telMovil = movil;
	}

	//GET AND SET
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public int getTelMovil() {
		return telMovil;
	}
	public void setTelMovil(int telMovil) {
		this.telMovil = telMovil;
	}
	
	//METODOS
	public String toString() {
		String cadena = super.toString();
		cadena += "Tel. Movi: " + getTelMovil() + "\n";
		cadena += this.vehiculo.toString();
		return cadena;
	}
	
	public void incrementarSalario(double incremento) {
		setSalario(getSalario() + incremento);
	}
	public double aumentoVendedor() {
		double aumento = 0.2 * getSalario() + 1200 * getAntiguedad();
		return aumento;
	}
}
