package ejClase14dificil;

public class ConjuntoDePersonas extends Conjunto{
	
	//Constructor
	ConjuntoDePersonas(){
		super();
	}

	@Override
	public boolean esIgual(Object a, Object b) {
		if(!(a instanceof Persona) || !(b instanceof Persona)) {
			return false; //NO SON ENTEROS, NO PUEDEN SER IGUALES
		}
		Persona p1 = (Persona)a;
		Persona p2 = (Persona)b;
		return p1.equals(p2); //RETORNA V O F
	}

	@Override
	public Conjunto clone() {
		ConjuntoDePersonas conjClonado = new ConjuntoDePersonas();
		for(int i=0; i<this.cantElem; i++) {
			conjClonado.agregar(super.getElemento(i));
		}
		return conjClonado;
	}

	@Override
	public Conjunto instanciar() {
		ConjuntoDePersonas conj = new ConjuntoDePersonas();
		return conj;
	}

}
