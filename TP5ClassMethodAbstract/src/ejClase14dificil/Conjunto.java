package ejClase14dificil;
import java.util.ArrayList;

public abstract class Conjunto {
	//ATRIBUTOS
	protected ArrayList<Object> conjunto;
	protected int cantElem;
	
	//CONSTRUCTOR
	Conjunto(){
		this.conjunto = new ArrayList<Object>();
		this.cantElem = 0;
	}
	
	//GETTER
	public Object getElemento(int i) {
		return this.conjunto.get(i);
	}
	
	//METODOS ABSTRACTOS
	public abstract boolean esIgual(Object a, Object b);
	public abstract Conjunto clone();
	public abstract Conjunto instanciar();
	
	//METODOS
	public void agregar(Object e) {
		this.conjunto.add(e);
		this.cantElem++;
	}
	public int buscar(Object e) {
		for(int i=0; i<this.cantElem; i++) {
			if(getElemento(i).equals(e)) {
				return i;
			}
		}
		return -1;
	}
	public int cardinalidad() {
		return this.cantElem;
	}
	public void eliminar(Object e) {
		this.conjunto.remove(e);
		this.cantElem--;
	}
	public boolean pertenece(Object e) {
		for(Object elemento: this.conjunto) {
			if(elemento.equals(e)) {
				return true;
			}
		}
		return false;
	}
	public boolean vacio() {
		if(this.cantElem == 0) {return true;}
		else {return false;}
	}
	public Conjunto union(Conjunto c) {
		Conjunto conj = instanciar();
		for(int i=0; i<this.cantElem; i++) {
			conj.agregar(getElemento(i));
		}
		for(int i=0; i<c.cardinalidad(); i++) {
			conj.agregar(c.getElemento(i));
		}
		return conj;
	}
	public Conjunto interseccion(Conjunto c) {
		Conjunto conj = instanciar();
		for(int i=0; i<c.cardinalidad(); i++) {
			if(pertenece(c.getElemento(i))) {
				conj.agregar(c.getElemento(i));
			}
		}
		return conj;
	}
	public Conjunto diferencia(Conjunto c) {
		Conjunto conj = instanciar();
		for(int i=0; i<c.cardinalidad(); i++) {
			if(!pertenece(c.getElemento(i))) {
				conj.agregar(c.getElemento(i));
			}
		}
		for(int i=0; i<cardinalidad(); i++) {
			if(!c.pertenece(getElemento(i))) {
				conj.agregar(getElemento(i));
			}
		}
		return conj;
	}
	public String toString() {
		String cadena = "***** Lista *****\n";
		for(Object elemento: this.conjunto) {
			cadena += elemento + ", ";
		}
		return cadena;
	}
}
