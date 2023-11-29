package clase1;

public class ColectivoDiesel extends Colectivo implements Diesel{

	private double distancia;
	private double nivelContaminacion;
	
	public ColectivoDiesel(int capacidad, double costo, double distancia, double nivelContaminacion) {
		super(capacidad, costo);
		this.distancia = distancia;
		this.nivelContaminacion = nivelContaminacion;
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
		return 3.0;
	}

}
