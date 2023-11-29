package tp6ContLin1.ej6TADColaLEnlazada;
import tp6ContLin1.ej1interfazContenedorMetodos.*;
import tp6ContLin1.ej3Nodo.*;

public class ColaLEnlazada implements Contenedor{
	//ATRIBUTOS
	private Nodo frenteC, finalC;
	
	//CONSTRUCTOR
	public ColaLEnlazada() {
		limpiar();
	}
	
	//GETTERS & SETTERS
	public Nodo getFrenteC() {
		return frenteC;
	}
	public Nodo getFinalC() {
		return finalC;
	}
	public void setFrenteC(Nodo frenteC) {
		this.frenteC = frenteC;
	}
	public void setFinalC(Nodo finalC) {
		this.finalC = finalC;
	}

	//METODOS INTERFAZ
	@Override
	public void limpiar() {
		this.frenteC = this.finalC = null;
	}
	@Override
	public void meter(Object elemento) {
		if (!estaVacia()) {
			this.finalC.setNextNodo(new Nodo(elemento));
			this.finalC = this.finalC.getNextNodo();
		}else{
			this.frenteC = this.finalC = new Nodo(elemento);
		}
	}
	@Override
	public Object sacar() {
		Object elemento = null;
		if (!estaVacia()) {
			elemento = this.frenteC.getNodoInfo();
			this.frenteC = this.frenteC.getNextNodo();
			if (estaVacia()) {
				this.finalC = null; 
			}
		}else{
			System.out.println("Error sacar. Cola vacia");
		}
		return elemento;
	}
	@Override
	public boolean estaVacia() {
		return (this.frenteC == null);
	}
	
	//METODOS
	public void muestra(){
		Nodo temp;
		if (!estaVacia()){
			temp = this.frenteC;
			while (temp != null){
				System.out.println("Elemento " + temp.getNodoInfo().toString());
				temp = temp.getNextNodo();
			}
		}else{
			System.out.println("Error muestra. Cola vacia");
		}
	}


}
