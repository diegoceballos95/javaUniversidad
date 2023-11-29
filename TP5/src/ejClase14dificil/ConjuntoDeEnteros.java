package ejClase14dificil;

public class ConjuntoDeEnteros extends Conjunto{
	
	//Constructor
	ConjuntoDeEnteros(){
		super();
	}

	@Override
	public Conjunto instanciar() {
		ConjuntoDeEnteros c1 = new ConjuntoDeEnteros();
		return c1;
	}
	
	@Override
	public boolean esIgual(Object a, Object b) {
		if(!(a instanceof Integer) || !(b instanceof Integer)) {
			return false; //NO SON ENTEROS, NO PUEDEN SER IGUALES
		}
		Integer c1 = (Integer)a;
		Integer c2 = (Integer)b;
		return c1.equals(c2); //RETORNA V O F
	}

	@Override
	public Conjunto clone() {
		ConjuntoDeEnteros conjClonado = new ConjuntoDeEnteros();
		for(int i=0; i<this.cantElem; i++) {
			conjClonado.agregar(super.getElemento(i));
		}
		return conjClonado;
	}


	
	
}
