package claseThread;

public class Main {

	public static void main(String[] args) {

		Hola h = new Hola();
		Chau c = new Chau();
		
		h.start();
		c.start();
		
		/*AL NO HABER SINCRONIZACION, EL COMPORTAMIENTO EN CADA EJECUCION 
		SERA IMPREDECIBLE, EL ORDER DE PRINTEO SERA ALEATORIO*/
	}

}
