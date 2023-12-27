package tp5TAD.complejos1;

public class Complejo implements Operaciones{
	//ATRIBUTOS
	private double real;
	private double imaginario;
	
	//CONSTRUCTORES
	public Complejo(double real, double imaginario) {
		super();
		this.real = real;
		this.imaginario = imaginario;
	}
	public Complejo() {
		this(0,0);
	}
	
	//GET && SET
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImaginario() {
		return imaginario;
	}
	public void setImaginario(double imaginario) {
		this.imaginario = imaginario;
	}

	//METODOS
	public String toString() {
		return getReal() + " + " + getImaginario() + "i\n";
	}
	
	public void sumar (Object a, Object b) {
		Complejo c1 = (Complejo)a;
		Complejo c2 = (Complejo)b;
		this.real = c1.getReal() + c2.getReal();
		this.imaginario = c1.getImaginario() + c2.getImaginario();
	}
	
	public void restar(Object a, Object b) {
		Complejo c1 = (Complejo)a;
		Complejo c2 = (Complejo)b;
		this.real = c1.getReal() - c2.getReal();
		this.imaginario = c1.getImaginario() - c2.getImaginario();
	}
	public void multiplicar(Object a, Object b) {
		Complejo c1 = (Complejo)a;
		Complejo c2 = (Complejo)b;
		this.real = (c1.getReal()*c2.getReal()) - (c1.getImaginario() * c2.getImaginario());
		this.imaginario = (c1.getReal() * c2.getImaginario()) + (c1.getImaginario() * c2.getReal());
	}
	public void potencia(Object base, Object exponente) {
		Complejo c1 = (Complejo)base;
		Double exp = (Double)exponente;
		double z1,z2;
		double argumento1, argumento2;
		z1 = Math.abs(Math.sqrt(Math.pow(c1.getReal(),2) + (Math.pow(c1.getImaginario(),2))));
		argumento1 = Math.atan(c1.getImaginario()/c1.getReal());
		z2 = Math.pow(z1, exp);
		argumento2 = (argumento1*exp) % 360;
		System.out.println(z2 + " y " + argumento2);
	}
	public boolean esIgual(Object otro) {
		Complejo aux = (Complejo)otro;
		return (this.real == aux.getReal() && this.imaginario == aux.getImaginario());
	}
}
