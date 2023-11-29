package ej4comercioCajasReg;
import java.util.Scanner;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CajaRegistradora caja1 = new CajaRegistradora();
		CajaRegistradora caja2 = new CajaRegistradora();
		CajaRegistradora caja3 = new CajaRegistradora();
		int opcionCaja;
		double venta;
		//REGISTRAR VENTAS
		do {
			System.out.println("***** Ingrese la caja registradora a usar *****");
			System.out.println("[0]SALIR	[1]CAJA 1	[2]CAJA 2	[3]CAJA3");
			opcionCaja = sc.nextInt();
			switch(opcionCaja){
			case 0: System.out.println("FIN DEL PROGRAMA"); break;
			case 1:
				System.out.println("Ingrese valor de la venta realizada:");
				venta = sc.nextDouble();
				caja1.nuevaVenta(venta);
				break;
			case 2:
				System.out.println("Ingrese valor de la venta realizada:");
				venta = sc.nextDouble();
				caja2.nuevaVenta(venta);
				break;
			case 3:
				System.out.println("Ingrese valor de la venta realizada:");
				venta = sc.nextDouble();
				caja3.nuevaVenta(venta);
				break;
			default: break;
			}
		}while(opcionCaja != 0);
		
		System.out.println("\n***** Informacion diaria de venatas *****");
		//TOTAL DE RECAUDACION
		double recaudacionTotal = caja1.recaudacion() + caja2.recaudacion() + caja3.recaudacion();
		System.out.println("Recaudacion total del dia: $" + recaudacionTotal);
		//TOTAL DE CADA CAJA
		System.out.println("Venta total de caja 1: $" + caja1.recaudacion());
		System.out.println("Venta total de caja 2: $" + caja2.recaudacion());
		System.out.println("Venta total de caja 3: $" + caja3.recaudacion());
		//CAJA CON MENOR VENTA
		System.out.println("Caja o cajas con menor venta:");
		double [] hallarMenorVenta = {caja1.recaudacion(), caja2.recaudacion(), caja3.recaudacion()};
		Arrays.sort(hallarMenorVenta);
		double menorVenta = hallarMenorVenta[0];
		if (menorVenta == caja1.recaudacion()) System.out.println("* Caja1");
		if (menorVenta == caja2.recaudacion()) System.out.println("* Caja2");
		if (menorVenta == caja3.recaudacion()) System.out.println("* Caja3");
		
		sc.close();
	}
}
