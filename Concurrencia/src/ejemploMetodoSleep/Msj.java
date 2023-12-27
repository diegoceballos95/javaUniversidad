package ejemploMetodoSleep;

import java.util.Random;

public class Msj extends Thread{
	
	private String msj;
	private int iteraciones;
	
	public Msj(String msj, int iteraciones) {
		this.msj = msj;
		this.iteraciones = iteraciones;
	}
	
	public void run() {
		
		Random r = new Random();
		
		for(int i=0; i < this.iteraciones; i++) {
			int num = r.nextInt(3000 + 1000 - 1) + 1000;
			System.out.println(this.msj);
			
			try {
				sleep(num);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}		
		}
	}

}
