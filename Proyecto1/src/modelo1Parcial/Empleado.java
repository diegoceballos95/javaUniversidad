package modelo1Parcial;

public class Empleado extends Persona{
	//ÁTRIBUTOS
	private String domicilio;
	private Fecha fIngreso;
	private double sueldoBruto;
	//CONSTRUCTOR
	public Empleado(String nombre, int dni, String correo, String domicilio, Fecha fIngreso, double sueldoBruto) {
		super(nombre, dni, correo);
		this.domicilio = domicilio;
		this.fIngreso = fIngreso;
		this.sueldoBruto = sueldoBruto;
	}
	//METODOS
	public String getDomicilio() {
		return domicilio;
	}
	public Fecha getfIngreso() {
		return fIngreso;
	}
	public double getSueldoBruto() {
		return this.sueldoBruto;
	}
	public void recibirMail(String mensaje) {
		System.out.println("Correo Recibido: " + mensaje);
	}
}
