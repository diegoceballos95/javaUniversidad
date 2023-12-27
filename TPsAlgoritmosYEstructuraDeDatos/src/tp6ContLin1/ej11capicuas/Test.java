package tp6ContLin1.ej11capicuas;
import tp6ContLin1.ej6TADColaLEnlazada.ColaLEnlazada;

public class Test {

	public static void main(String[] args) {
		PilaEnteros pilaDeEnteros = new PilaEnteros();
		ColaLEnlazada colaDeCapicuas = new ColaLEnlazada();
		pilaDeEnteros.meter(3);
		pilaDeEnteros.meter(345);
		pilaDeEnteros.meter(303);
		pilaDeEnteros.meter(4821);
		pilaDeEnteros.meter(873);
		pilaDeEnteros.meter(555);
		pilaDeEnteros.meter(11);
		pilaDeEnteros.meter(983);
		pilaDeEnteros.meter(56);		
		pilaDeEnteros.meter(59595);
		pilaDeEnteros.meter(4443);
		
		System.out.println("----- PILA INICIAL -----");
		pilaDeEnteros.muestra();
		
		colaDeCapicuas = pilaDeEnteros.generarCola();
		
		System.out.println("----- PILA NO CAPICUA -----");
		pilaDeEnteros.muestra();
		
		System.out.println("----- COLA CAPICUA -----");
		colaDeCapicuas.muestra();
		
	}
}
