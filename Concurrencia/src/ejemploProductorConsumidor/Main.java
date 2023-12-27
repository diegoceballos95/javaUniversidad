package ejemploProductorConsumidor;

public class Main {

	public static void main(String[] args) {
		
		Deposito deposito = new Deposito(5);
		Productor p1 = new Productor(deposito);
		Productor p2 = new Productor(deposito);
		Consumidor c1 = new Consumidor(deposito);
		Consumidor c2 = new Consumidor(deposito);
		Consumidor c3 = new Consumidor(deposito);
		
		p1.start();
		p2.start();
		c1.start();
		c2.start();
		c3.start();
		
		try {
			p1.join();
			p2.join();
			c1.join();
			c2.join();
			c3.join();
		}
		catch(InterruptedException e) {}
		
		System.out.println("\nFIN");
	}
}