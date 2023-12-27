package ejemploProductorConsumidor;

public class Consumidor extends Thread {
	
	private Deposito deposito;
	
	public Consumidor(Deposito d){ 
		this.deposito = d;
	}
	
	public void run() {
		for(int i= 0; i< 20; i++) {
			this.deposito.sacar();
		}
	}
}