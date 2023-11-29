package tp6ContLin1.ej3Nodo;

public class Nodo {
	//ATRIBUTOS
	private Object nodoInfo;
	private Nodo nextNodo;
	
	//CONSTRUCTORES
	public Nodo(Object nodoInfo) {
		this(nodoInfo,null);
	} 
	public Nodo(Object nodoInfo, Nodo nextNodo) {
		this.nodoInfo = nodoInfo;
		this.nextNodo = nextNodo; 
	}
	
	//GETTERS & SETTERS
	public Object getNodoInfo() {
		return this.nodoInfo; 
	}
	public void setNodoInfo(Object nodoInfo) {
		this.nodoInfo = nodoInfo; 
	}
	public Nodo getNextNodo() {
		return this.nextNodo; 
	}
	public void setNextNodo(Nodo nextNodo) {
		this.nextNodo = nextNodo; 
	}
}
