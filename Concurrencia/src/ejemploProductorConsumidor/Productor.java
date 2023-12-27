package ejemploProductorConsumidor;

public class Productor extends Thread {
	
	private Deposito deposito;
	
	public Productor(Deposito d){ 
		this.deposito = d; 
	}
	
	public void run() {
		for(int i= 0; i< 20; i++) {
			this.deposito.poner();
		}
	}
}