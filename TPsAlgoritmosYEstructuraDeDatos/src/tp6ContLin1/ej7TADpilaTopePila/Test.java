package tp6ContLin1.ej7TADpilaTopePila;

public class Test {

	public static void main(String[] args) {
		SubTADPila pila = new SubTADPila(5);
		pila.meter(5);
		pila.meter(12);
		pila.meter(8);
		pila.sacar();
		pila.meter(45);
		pila.meter(87);
		pila.meter(33);
		
		Integer topePila = (Integer) pila.topePila();
		System.out.println(topePila);
		
		pila.sacar();
		pila.sacar();
		topePila = (Integer) pila.topePila();
		System.out.println(topePila);
		
		pila.meter(100);
		topePila = (Integer) pila.topePila();
		System.out.println(topePila);
		
		pila.meter(154);
		pila.meter(68);
	}
		
}
