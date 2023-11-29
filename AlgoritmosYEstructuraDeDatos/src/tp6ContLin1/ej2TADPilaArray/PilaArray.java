package tp6ContLin1.ej2TADPilaArray;
import tp6ContLin1.ej1interfazContenedorMetodos.*;

public class PilaArray implements Contenedor{
	//ATRIBUTOS
	protected Object[] pila;
	protected int cabeza;
	protected int tamPila;
	
	//CONSTRUCTOR
	public PilaArray(int tamPila) {
		this.tamPila = tamPila;
		this.pila = new Object[this.tamPila];
		limpiar(); 
	}
	
	//METODOS INTERFAZ
	@Override
	public void limpiar() {
		this.cabeza = -1;
	}
	@Override
	public void meter(Object elemento) {
		if (!estaLlena()){
			  incrementaCabeza();
			  this.pila[this.cabeza] = elemento;
			} else {
				System.out.println("Error. Pila llena...");
			}
	}
	@Override
	public Object sacar() {
		Object elemento = null;
		if (!estaVacia()){
			elemento = this.pila[this.cabeza];
			decrementaCabeza();
		} else {
			System.out.println("Error. Pila vacia...");
		}
		return elemento; 
	}
	@Override
	public boolean estaVacia() {
		return (this.cabeza == -1);
	}
	
	//METODOS
	public boolean estaLlena() {
		return (this.cabeza == this.tamPila - 1);
	}
	private void incrementaCabeza() {
		this.cabeza++; 
	}
	private void decrementaCabeza(){
		this.cabeza--;
	}
}
