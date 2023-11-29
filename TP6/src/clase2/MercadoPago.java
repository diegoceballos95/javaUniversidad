package clase2;

public class MercadoPago implements FormaDePago{

	@Override
	public double pagar(double monto) {
		return monto * 1.07;
	}

}
