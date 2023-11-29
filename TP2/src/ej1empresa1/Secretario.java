package ej1empresa1;

public class Secretario extends Empleado {

	//ATRIBUTOS
	private int numDespacho;
	private int numFax;
	
	//CONSTRUCTOR
	Secretario(String nombre, int dni, String direccion, int antiguedad, int telContacto, double salario, int despacho, int fax){
		super(nombre, dni, direccion, antiguedad, telContacto, salario);
		this.numDespacho = despacho;
		this.numFax = fax;
	}

	//GET AND SET
	public int getNumDespacho() {
		return numDespacho;
	}
	public void setNumDespacho(int numDespacho) {
		this.numDespacho = numDespacho;
	}
	public int getNumFax() {
		return numFax;
	}
	public void setNumFax(int numFax) {
		this.numFax = numFax;
	}
	
	//METODOS
	public String toString() {
		String cadena = super.toString();
		cadena += "Despacho: " + this.numDespacho + "\n";
		cadena += "Nuumero de FAX: " + this.numFax + "\n";
		return cadena;
	}
	
	public void incrementarSalario(double incremento) {
		setSalario(getSalario() + incremento);
	}
	public double aumentoSecretario() {
		double aumento = 0.1 * getSalario() + 1000 * getAntiguedad();
		return aumento;
	}
	
}