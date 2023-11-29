package ejClase14intermedio;

public class Jepp extends Vehiculo{

	//ATRIBUTOS
	private double maxGrado; //VALOR ENTRE [0 , 1]
	//Constructor
	Jepp(double peso, double maxVel, String nombre, double maxGrado){
		super(peso, maxVel, nombre);
		this.maxGrado = maxGrado;
	}
	
	//METODOS
	@Override
	public double getIndiceSeguridad() {
		return Math.max((100-100*this.maxGrado-0.5*super.maxVel), 0);
	}
	public double getMaxEnergia() {
		return super.getMaxEnergia() + 9.8*super.peso*this.maxGrado*100;
	}
}
