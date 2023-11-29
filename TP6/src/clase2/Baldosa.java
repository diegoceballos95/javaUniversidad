package clase2;

public class Baldosa extends PiezaCeramica{
	//ATRIBUTOS
	private int peso;
	
	//CONSTRUCTOR
	public Baldosa(int codigo, double precioBase, int peso) {
		super(codigo, precioBase);
		this.peso = peso;
	}

	@Override
	public double getPrecioFinal() {
		return getPrecioBase() + ((double)this.peso * 0.034);
	}

}
