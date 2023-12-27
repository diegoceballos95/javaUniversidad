package modelo1Parcial;

public class Directivo extends Empleado {
	//ATRIBUTOS
	private String categoria;
	private ListaEmpleados listaSub;
	
	//CONSTRUCTOR
	public Directivo(String nombre, int dni, String correo, String domicilio, Fecha fIngreso, double sueldoBruto, String categoria) {
		super(nombre, dni, correo, domicilio, fIngreso, sueldoBruto);
		this.categoria = categoria;
		this.listaSub = new ListaEmpleados();
	}

	//GETTERS
	public String getCategoria() {
		return this.categoria;
	}
	public ListaEmpleados getListaSubordinados() {
		return this.listaSub;
	}

}
