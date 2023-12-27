package clase2;

public abstract class PiezaCeramica {
	//ATRIBUTOS
	private int codigo;
	private double precioBase;
	
	//CONSTRUCTOR
	public PiezaCeramica(int codigo, double precioBase) {
		this.codigo = codigo;
		this.precioBase = precioBase;
	}

	//METODOS ABSTRACTOS
	public abstract double getPrecioFinal() ;
	
	//METODOS
	public double getPrecioBase() {
		return precioBase;
	}
}
