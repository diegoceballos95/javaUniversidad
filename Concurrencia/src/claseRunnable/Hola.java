package claseRunnable;

public class Hola implements Runnable {
	
	public void run() {
		
		for(int i= 0; i< 100; i++)
			
		System.out.println("Hola" + i); 
		
	}
}