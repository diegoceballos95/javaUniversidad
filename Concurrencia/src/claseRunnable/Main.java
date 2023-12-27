package claseRunnable;

public class Main {

	public static void main(String arg[]) {
		
		Thread h = new Thread(new Hola());
		Thread c = new Thread(new Chau());
		
		h.start();
		c.start();
		
		/*AL NO HABER SINCRONIZACION, EL COMPORTAMIENTO EN CADA EJECUCION 
		SERA IMPREDECIBLE, EL ORDER DE PRINTEO SERA ALEATORIO*/
	}
}
