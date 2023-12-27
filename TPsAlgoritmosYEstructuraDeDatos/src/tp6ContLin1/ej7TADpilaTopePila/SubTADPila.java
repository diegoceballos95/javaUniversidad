package tp6ContLin1.ej7TADpilaTopePila;
import tp6ContLin1.ej2TADPilaArray.*;

/* EL MODIFICADOR DE CABEZA Y PILA (DE LA CLASE PADRE) QUE ERA 
 "PRIVATE"  LO CAMBIE A "PROTECTED" PARA PODER USARLO AQUI EN 
 LA SUBCLASE */

public class SubTADPila extends PilaArray{
	
	//CONSTRUCTOR
	public SubTADPila(int tamPila) {
		super(tamPila);
	}

	//METODOS
	public Object topePila() {
		Object elementoTopePila = null;
		if(!super.estaVacia()) {
			elementoTopePila = super.pila[super.cabeza];
		}
		else {
			System.err.println("ERROR. LISTA VACIA...");
		}
		return elementoTopePila;
	}
}
