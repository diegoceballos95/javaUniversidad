package clase1;

public abstract class Colectivo {
	private int ID;
	private int capacidad;
	private double costo;
	private static int sgteID = 1;
	
	public Colectivo(int capacidad, double costo) {
		ID = sgteID++;
		this.capacidad = capacidad;
		this.costo = costo;
	}

	abstract public double getAcel();

	public int getID() {return ID;}
	public int getCapacidad() {return capacidad;}
	public double getCosto() {return costo;}
}
