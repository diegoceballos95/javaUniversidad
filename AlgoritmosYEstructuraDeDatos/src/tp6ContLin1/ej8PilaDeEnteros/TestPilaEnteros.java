package tp6ContLin1.ej8PilaDeEnteros;

public class TestPilaEnteros {

	public static void main(String[] args) {
		Object aux1 = null;
		PilaEntArray pila1 = new PilaEntArray(5);
		PilaEntLE pila2 = new PilaEntLE();
		
		//PILA 1:
		System.out.println("PILA CON ARRAY");
		
		pila1.meter(12);
		pila1.meter(43);
		pila1.meter(12);
		pila1.meter(76);
		pila1.meter(9);
		pila1.reemplazar(12, 100);
		
		//CON ARRAYS, PARA MOSTRAR DEBO VACIAR PILA
		while(!pila1.estaVacia()) {
			aux1 = pila1.sacar();
			if(aux1 != null) {
				System.out.println(aux1.toString());
			}
		}
		System.out.println("------------------------");

		//PILA 2:
		System.out.println("PILA CON LISTA ENLAZADA");
		
		pila2.meter(1);
		pila2.meter(34);
		pila2.meter(55);
		pila2.meter(34);
		pila2.meter(340);
		pila2.reemplazar(34, 100);
		
		//CON LE, PARA MOSTRAR NO HACE FALTA VACIAR PILA
		pila2.muestra();
	}
}
