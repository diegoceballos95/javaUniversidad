package clase2;

public class Azulejo extends PiezaCeramica{
	//ATRIBUTOS
	private int medida;

	//CONSTRUCTOR
	public Azulejo(int codigo, double precioBase, int medida) {
		super(codigo, precioBase);
		this.medida = medida;
	}

	@Override
	public double getPrecioFinal() {
		return getPrecioBase() + ((double)this.medida * 3.05);
	}
}
