package tp6ContLin1.ej10operacionesColaLE;

public class Test {
	public static void main(String[] args) {
		SubColaLE cola1 = new SubColaLE();
		SubColaLE cola2 = new SubColaLE();
		
		//COLA 1
		cola1.meter(7);
		cola1.meter(512);
		cola1.meter(34);
		cola1.meter(12);
		cola1.meter(365);
		System.out.println("*** COLA 1 ***");
		cola1.muestra();
		System.out.println("La cola tiene " + cola1.cardinal() + " elementos");
		System.out.println("--------------------");
		
		System.out.println("*** COLA INVERTIDA ***");
		cola1.invertirCola();
		cola1.muestra();
		System.out.println("--------------------");
		
		//COLA 2
		cola2.meter(55);
		cola2.meter(12);
		cola2.meter(4);
		cola2.meter(124);
		cola2.meter(32);
		cola2.meter(482);
		cola2.meter(42);
		System.out.println("*** COLA 2 ***");
		cola2.muestra();
		System.out.println("--------------------");
		
		//CONCATENACION
		cola1.concatenarColas(cola2);
		System.out.println("*** COLA 1 CONCATENADA CON LA COLA 2 ***");
		cola1.muestra();
	}
}
