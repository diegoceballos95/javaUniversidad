package clase2;

public class PagoFacil implements FormaDePago{

	@Override
	public double pagar(double monto) {
		return monto * 1.1;
	}

}
