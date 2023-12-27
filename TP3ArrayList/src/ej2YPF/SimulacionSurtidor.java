package ej2YPF;
import java.util.Scanner;
import java.util.Random;

public class SimulacionSurtidor {

	public static void main(String[] args) {
		Surtidor ypf1 = new Surtidor();
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Ingrese cantidad de operaciones a realizar:");
		int cantInteracciones = sc.nextInt();
		int op, carga;

		System.out.println(ypf1);

		for(int i=1; i <= cantInteracciones; i++) {

			System.out.println("********** NUEVA OPERACION **********");
			op = random.nextInt(24)+1;
			switch(op) {
			case 1: case 2: case 3: case 4: case 5:
				System.out.println("Cunatos litros de UltraDiesel cargara?:");
				carga = sc.nextInt();
				ypf1.cargarUDiesel(carga);
				break;
			case 6: case 7: case 8: case 9: case 10:
				carga = random.nextInt(60)+10;
				System.out.println("Se realizo una regarga EURODIESEL de " + carga + " litros");
				ypf1.cargarEDiesel(carga);
			break;
			case 11: case 12: case 13: case 14: case 15:
				carga = random.nextInt(60)+10;
				System.out.println("Se realizo una regarga N.SUPER de " + carga + " litros");
				ypf1.cargarNSuper(carga);
			break;
			case 16: case 17: case 18: case 19: case 20:
				System.out.println("Cunatos litros de Infinia cargara?:");
				carga = sc.nextInt();
				ypf1.cargarInfinia(carga);
			break;
			case 21: ypf1.llenarDepositoUDiesel(); System.out.println("DEPOSITO U.DIESEL LLENADO"); break;
			case 22: ypf1.llenarDepositoEDiesel(); System.out.println("DEPOSITO E.DIESEL LLENADO");break;
			case 23: ypf1.llenarDepositoNSuper(); System.out.println("DEPOSITO N.SUPER LLENADO");break;
			case 24: ypf1.llenarDepositoInfinia(); System.out.println("DEPOSITO INFINIA LLENADO");break;
			default: break;
			}
			System.out.println(ypf1);
		}
		sc.close();
	}
}
