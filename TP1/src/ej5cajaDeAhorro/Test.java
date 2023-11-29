package ej5cajaDeAhorro;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Caja c1 = new Caja(10000);
		int op;
		double deposito, extraccion;
		
		System.out.println("SU SALDO ES: " + c1.consultarSaldo() + "\n");
		
		do {
			System.out.println("Desea realizar una operacion?\n[0]NO - [1]DEPOSITAR - [2]EXTRAER - [3]CONSULTRAR SALDO");
			op = sc.nextInt();
			switch(op) {
					case 0: break;
					case 1:
						System.out.println("Cuanto desea depositar?");
						deposito = sc.nextDouble();
						c1.depositar(deposito);
						System.out.println("LISOT. Su nuevo saldo es: "+ c1.consultarSaldo());
						break;
					case 2:
						if (c1.getCantExtracciones() < 3) {
							System.out.println("Cuanto desea extraer?");
							extraccion = sc.nextDouble();
							if(extraccion < c1.getSaldo()) {
								c1.extraer(extraccion);
								c1.nuevaExtraccion();
								System.out.println("LISTO. Su nuevo saldo es: "+ c1.consultarSaldo());
							}
							else {
								System.out.println("Saldo insuficiente");
							}
						}
						else {
							System.out.println("Supero las 3 extracciones del mes");
						}
						break;
					case 3: 
						System.out.println("Saldo actual: " + c1.consultarSaldo());
						break;
					default: break;
			}
		} while (op != 0);
	
		sc.close();
	}
}
