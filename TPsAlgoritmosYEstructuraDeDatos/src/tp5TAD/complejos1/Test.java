package tp5TAD.complejos1;

public class Test {

	public static void main(String[] args) {
		
		Complejo c1 = new Complejo(5,2);
		System.out.println(c1);
		System.out.println(c1.getReal());
		Complejo c2 = new Complejo(2,-3);
		Complejo c3 = new Complejo();
		Complejo c4 = new Complejo();
		Complejo c5 = new Complejo();
		
		c3.sumar(c1,c2);
		System.out.println(c3);
		
		c4.restar(c2, c1);
		System.out.println(c4);
		
		c5.multiplicar(c1, c2);
		System.out.println(c5);

	}

}
