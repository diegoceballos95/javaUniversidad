package tp6ContLin1.ej10operacionesColaLE;
import  tp6ContLin1.ej3Nodo.Nodo;
import  tp6ContLin1.ej6TADColaLEnlazada.ColaLEnlazada;

public class SubColaLE extends ColaLEnlazada{

	public SubColaLE() {
		super();
	}
	
	//METODOS
	public int cardinal() {
		int cant = 0;
		Nodo aux = getFrenteC();
		while(aux != null){
			cant++;
			aux = aux.getNextNodo();
		}
		return cant;
	}
	public void invertirCola() {
		Object[] colaAux = new Object[cardinal()];
		Object elemento = null;
		int i = 0;
		while (getFrenteC() != null) {
			elemento = super.sacar();
			colaAux[i] = elemento;
			i++;
		}
		for(int j=colaAux.length-1; j>=0; j--) {
			super.meter(colaAux[j]);
		}
	}
	public void concatenarColas(ColaLEnlazada cola2) {
		super.getFinalC().setNextNodo(cola2.getFrenteC());
	}
}
