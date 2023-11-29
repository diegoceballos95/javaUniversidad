package tp5TAD.ej1y2OperacionesMatematticas;

public class NumeroReal implements Operaciones{
	
	//ATRIBUTOS
	private double num;
	
	//CONSTRUCTOR
	NumeroReal(double valor){
		this.num = valor;	
	}
	
	//GET AND SET
	public double getNum() {
		return num;
	}
	public void setNum(double num) {
		this.num = num;
	}

	//METODOS
	@Override
	public void sumar(Object a, Object b) {
		NumeroReal r1 = (NumeroReal)a;
		NumeroReal r2 = (NumeroReal)b;
		this.num = r1.getNum() + r2.getNum();
	}
	@Override
	public void restar(Object a, Object b) {
		NumeroReal r1 = (NumeroReal)a;
		NumeroReal r2 = (NumeroReal)b;
		this.num = r1.getNum() - r2.getNum();
	}
	@Override
	public void multiplicar(Object a, Object b) {
		NumeroReal r1 = (NumeroReal)a;
		NumeroReal r2 = (NumeroReal)b;
		this.num = r1.getNum() * r2.getNum();
	}
	@Override
	public void potencia(Object a, Object exponente) {
		NumeroReal r1 = (NumeroReal)a;
		NumeroReal exp = (NumeroReal)exponente;
		this.num = Math.pow(r1.getNum(), exp.getNum());
	}
	@Override
	public boolean esIgual(Object a) {
		NumeroReal r1 = (NumeroReal)a;
		if(this.num == r1.getNum()) {
			return true;
		}
		return false;
	}
}

