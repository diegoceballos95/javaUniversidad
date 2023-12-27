package complejosClase2;

public class Test {

	public static void main(String[] args) {

		Complejo c1 = new Complejo();
		Complejo c2 = new Complejo(1,11);
		Complejo c3 = new Complejo(4, 25);
		
		c1.mostrar();
		c2.mostrar();
		c3.mostrar();
		
		c1.sumar(c2);
		c1.mostrar();
		
		c3.restar(c2);
		c3.mostrar();
	}
}
