package ej2YPF;
import java.util.Scanner;
import java.util.Random;

public class TestEstDeServivio {

	public static void main(String[] args) {
		
		EstacionDeServicio ypf = new EstacionDeServicio(4);
		System.out.println(ypf);
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Ingrese cantidad de operaciones a realizar:");
		int cantInteracciones = sc.nextInt();
		int op, carga;

		for(int i=1; i <= cantInteracciones; i++) {

			System.out.println("********** NUEVA OPERACION **********");
			op = random.nextInt(24)+1;
			switch(op) {
			case 1: case 2: case 3: case 4: case 5:
				System.out.println("Cunatos litros de UltraDiesel cargara?:");
				carga = sc.nextInt();
				ypf.getSurtidor(0).cargarUDiesel(carga);;
				break;
			case 6: case 7: case 8: case 9: case 10:
				carga = random.nextInt(60)+10;
				System.out.println("Se realizo una regarga EURODIESEL de " + carga + " litros");
				ypf.getSurtidor(1).cargarEDiesel(carga);
			break;
			case 11: case 12: case 13: case 14: case 15:
				carga = random.nextInt(60)+10;
				System.out.println("Se realizo una regarga N.SUPER de " + carga + " litros");
				ypf.getSurtidor(2).cargarNSuper(carga);
			break;
			case 16: case 17: case 18: case 19: case 20:
				System.out.println("Cunatos litros de Infinia cargara?:");
				carga = sc.nextInt();
				ypf.getSurtidor(3).cargarInfinia(carga);
			break;
			case 21: ypf.getSurtidor(0).llenarDepositoUDiesel(); System.out.println("DEPOSITO U.DIESEL LLENADO"); break;
			case 22: ypf.getSurtidor(1).llenarDepositoEDiesel(); System.out.println("DEPOSITO E.DIESEL LLENADO");break;
			case 23: ypf.getSurtidor(2).llenarDepositoNSuper(); System.out.println("DEPOSITO N.SUPER LLENADO");break;
			case 24: ypf.getSurtidor(3).llenarDepositoInfinia(); System.out.println("DEPOSITO INFINIA LLENADO");break;
			default: break;
			}
			System.out.println(ypf);
		}
		sc.close();
	}
}
