package ejemploProductorConsumidor;

public class Deposito {
	private int elementos;
	private int capacidad;
	
	
	public Deposito(int capacidad) {
		this.elementos = 0;
		this.capacidad = capacidad;
	}
	
	public synchronized void poner(){
		try {
			while(elementos == capacidad)
				this.wait();
		}
		catch(InterruptedException e) { }
		
		this.elementos++;
		System.out.println("poner exitoso -> nroElems: " + elementos);
		this.notify();
	}
	
	public synchronized void sacar(){
		try {
			while(elementos == 0)
				this.wait();
		}
		catch(InterruptedException e) { }
		
		this.elementos--;
		System.out.println("sacar exitoso -> nroElems: " + elementos);
		this.notify();
	}
}