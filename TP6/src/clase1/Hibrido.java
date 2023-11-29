package clase1;

public class Hibrido extends Colectivo implements Diesel, Electrico{

	private double distancia;
	private double nivelContaminacion;
	private double voltaje;

	public Hibrido(int capacidad, double costo, double distancia, 
			double nivelContaminacion, double voltaje) {
		super(capacidad, costo);
		this.distancia = distancia;
		this.nivelContaminacion = nivelContaminacion;
		this.voltaje = voltaje;
	}

	@Override
	public double getVoltaje() {
		return this.voltaje;
	}
	@Override
	public double getDistancia() {
		return this.distancia;
	}
	@Override
	public double getNivelContaminacion() {
		return this.nivelContaminacion;
	}
	@Override
	public double getAcel() {
		return 4.0;
	}
}
