package tp6ContLin1.ej11capicuas;
import tp6ContLin1.ej5TADPilaLEnlazada.PilaLEnlazada;
import tp6ContLin1.ej6TADColaLEnlazada.ColaLEnlazada;

public class PilaEnteros extends PilaLEnlazada{
	//CONSTRUCTOR
	public PilaEnteros(){
		super();
	}
	
	//METODOS
	public ColaLEnlazada generarCola() {
		PilaEnteros pilaNoCapicua = new PilaEnteros();
		ColaLEnlazada colaCapicua = new ColaLEnlazada();
		Integer elemento = null;
		while(!estaVacia()) {
			elemento = (Integer) super.sacar();
			if(esCapicua(elemento)) {
				colaCapicua.meter(elemento);
			}
			else {
				pilaNoCapicua.meter(elemento);
			}
		}
		while(!pilaNoCapicua.estaVacia()) {
			elemento = (Integer) pilaNoCapicua.sacar();
			super.meter(elemento);
		}
		return colaCapicua;
	}
	private boolean esCapicua(Integer elemento) {
		Integer aux = elemento;
		int resto; 
		int invertido = 0;
		while( elemento > 0 ) {
	         resto = elemento % 10;
	         invertido = invertido * 10 + resto;
	         elemento /= 10;
	      }
		if(aux.equals(invertido)) {return true;}
		else {return false;}
	}
}
