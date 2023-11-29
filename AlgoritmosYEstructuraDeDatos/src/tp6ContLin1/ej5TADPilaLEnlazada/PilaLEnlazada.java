package tp6ContLin1.ej5TADPilaLEnlazada;
import tp6ContLin1.ej1interfazContenedorMetodos.*;
import tp6ContLin1.ej3Nodo.Nodo;

public class PilaLEnlazada implements Contenedor {
	//ATRIBUTOS
	protected Nodo pila;
	
	//Constructor
	public PilaLEnlazada() {
		limpiar(); 
	}

	//METODOS INTERFAZ
	@Override
	public void limpiar() {
		this.pila = null;
	}
	@Override
	public void meter(Object elemento) {
		//EL ELEMENTO INGRESADO SERA LA CABEZA DE LA LISTA
		this.pila = new Nodo(elemento, this.pila);
	}
	@Override
	public Object sacar() {
		Object elemento = null;
		if (!estaVacia()){
			elemento = this.pila.getNodoInfo();
			this.pila = this.pila.getNextNodo();
		}else{
			System.out.println("Error sacar. Pila vacia");}
		return elemento; 
	}
	@Override
	public boolean estaVacia() {
		return (this.pila == null);
	}
	
	public void muestra(){
		Nodo temp;
		if (!estaVacia()){
			temp = this.pila;
			while (temp != null){
				System.out.println("Elemento " + temp.getNodoInfo().toString());
				temp = temp.getNextNodo();
			}
		}else{
			System.out.println("Error muestra. Pila vacia");
		}
	}
}
