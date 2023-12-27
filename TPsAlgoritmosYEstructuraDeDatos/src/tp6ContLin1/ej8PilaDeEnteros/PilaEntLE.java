package tp6ContLin1.ej8PilaDeEnteros;
import tp6ContLin1.ej5TADPilaLEnlazada.PilaLEnlazada;

public class PilaEntLE extends PilaLEnlazada{
	//CONSTRUCTOR
	public PilaEntLE(){
		super();
	}
	
	//METODOS
	public void reemplazar(Integer actual, Integer nuevo) {
		PilaEntLE pilaAux = new PilaEntLE();
		Integer elemento = null;
		while(!estaVacia()) {
			elemento = (Integer) super.sacar();
			if(elemento.equals(actual)) {
				pilaAux.meter(nuevo);
			}
			else {
				pilaAux.meter(elemento);
			}
		}
		while(!pilaAux.estaVacia()) {
			elemento = (Integer) pilaAux.sacar();
			super.meter(elemento);
			}
	}
}
