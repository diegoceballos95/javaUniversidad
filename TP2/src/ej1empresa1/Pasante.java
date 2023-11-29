package ej1empresa1;

public class Pasante extends Empleado {

	//ATRIBUTOS
	private int diasContrato;
	private Fecha fechaIngreso;
	
	//CONSTRUCTOR
	Pasante(String nombre, int dni, String direccion, int antiguedad, int telContacto, double salario, int diasContrato, Fecha fechaIngreso){
		super(nombre,dni,direccion,antiguedad,telContacto,salario);
		this.diasContrato = diasContrato;
		this.fechaIngreso = fechaIngreso;
	}

	//GET AND SET
	public int getDiasContrato() {
		return diasContrato;
	}
	public void setDiasContrato(int diasContrato) {
		this.diasContrato = diasContrato;
	}
	public Fecha getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Fecha fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	//METODOS
	public String toString() {
		String cadena = super.toString();
		cadena += "Fecha de ingreso: " + getFechaIngreso() + "\n";
		cadena += "Dias de contrato restantes: " + getDiasContrato() + "\n";
		return cadena;
	}
	
	public void incrementarSalario(double incremento) {
		setSalario(getSalario() + incremento);
	}
	public double aumentoPasante() {
		double aumento = 0.05 * getSalario();
		return aumento;
	}
	
}
