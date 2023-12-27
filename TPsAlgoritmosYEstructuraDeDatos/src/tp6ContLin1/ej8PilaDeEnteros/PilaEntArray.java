package tp6ContLin1.ej8PilaDeEnteros;
import tp6ContLin1.ej2TADPilaArray.PilaArray;

public class PilaEntArray extends PilaArray{
	//CONSTRUCTOR
	public PilaEntArray(int tamPila){
		super(tamPila);
	}
	
	//METODOS
	public void reemplazar(Integer actual, Integer nuevo) {
		PilaEntArray pilaAux = new PilaEntArray(super.tamPila);
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
		while(!estaLlena()) {
			elemento = (Integer) pilaAux.sacar();
			super.meter(elemento);
			}
	}
}
