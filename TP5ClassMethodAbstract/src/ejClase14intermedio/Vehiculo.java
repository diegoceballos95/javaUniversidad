package ejClase14intermedio;

public abstract class Vehiculo {
	//ATRIBUTOS
	private int ID;
	protected double peso;
	protected double maxVel;
	protected String nombre;
	private static int proxID = 1;
	
	//CONSTRUCTOR
	Vehiculo(double peso, double maxVel, String nombre){
		this.ID = proxID++;
		this.peso = peso;
		this.maxVel = maxVel;
		this.nombre = nombre;
	}
	
	//METODOS ABSTRACTOS
	public abstract double getIndiceSeguridad();
	//METODOS
	public double getMaxEnergia() {
		return 0.5 * this.peso * (this.maxVel*this.maxVel);
	}
	//"final" IMPIDE QUE LA SUBCLASE LO SOBREESCRIBA
	public final int getID() {
		return this.ID;
	}
}
