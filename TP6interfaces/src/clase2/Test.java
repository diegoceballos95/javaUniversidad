package clase2;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pedido listaCeramicos = new Pedido();
		
		listaCeramicos.agregarPieza(new Azulejo(0023, 500, 10));
		listaCeramicos.agregarPieza(new Baldosa(0101, 900, 200));
		
		System.out.println("Su pedido consta de un azulejo y una baldoza");
		System.out.println("Con que medio desea pagar?");
		System.out.println("[1]PagoFacil - [2]MercadoPago - [3]Tarjeta de credito");
		int op = sc.nextInt();
		switch(op) {
		case 1: 
			System.out.println("Selecciono PagoFacil");
			listaCeramicos.setFormaDePago(new PagoFacil());
			break;
		case 2: 
			System.out.println("Selecciono MercadoPago");
			listaCeramicos.setFormaDePago(new MercadoPago());
			break;
		case 3: 
			System.out.println("Selecciono Tarjeta de credito");
			listaCeramicos.setFormaDePago(new TarjetaDeCredito());
			break;
		default: break;
		}
		listaCeramicos.pagar();
		
		sc.close();
	}
}
