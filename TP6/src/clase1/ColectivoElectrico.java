package clase1;

public class ColectivoElectrico extends Colectivo implements Electrico{
	
	private double voltaje;

	public ColectivoElectrico(int capacidad, double costo, double voltaje) {
		super(capacidad, costo);
		this.voltaje = voltaje;
	}

	@Override
	public double getVoltaje() {
		return this.voltaje;
	}

	@Override
	public double getAcel() {
		return 5.0;
	}
}
