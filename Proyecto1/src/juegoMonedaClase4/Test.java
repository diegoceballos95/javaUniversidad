package juegoMonedaClase4;
import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int select;
		int apuesta;
		Scanner sc = new Scanner(System.in);
		int posMoneda;
		Random pos = new Random();
		int jugar = 1;
		
		do {
			System.out.println("El duenio ha colocado una moneda debajo del primer sombrero...");
			Sombrero sombrero1 = new Sombrero(true);
			Sombrero sombrero2 = new Sombrero(false);
			Sombrero sombrero3 = new Sombrero(false);
			
			System.out.println("Y empezo a mover los 3 sombreros para despistarte.");
			posMoneda = pos.nextInt(3)+1;
			switch(posMoneda) {
			case 1: break;
			case 2: {
				sombrero1.setContieneMoneda(false);
				sombrero2.setContieneMoneda(true);
				break;
				}
			case 3: {
				sombrero1.setContieneMoneda(false);
				sombrero3.setContieneMoneda(true);
				break;
				}
			default: break;
			}
			
			System.out.println("Ingresa la cantidad de dinero que apuestas:");
			apuesta = sc.nextInt();
			System.out.println("Has apostado $" + apuesta);
			
			System.out.println("Ahora debes elegir entre el sombrero 1, 2 o 3");
			select = sc.nextInt();
			System.out.println("Has escogido el sombrero numero " + select);
			
			System.out.println("El sombrero 1 " + sombrero1);
			System.out.println("El sombrero 2 " + sombrero2);
			System.out.println("El sombrero 3 " + sombrero3);
			
			if(select == posMoneda) {
				System.out.println("HAS ACERTADO. GANASTE $" + apuesta*2);
			}
			else {
				System.out.println("HAS FALLADO. PERDISTE TU DINERO");
			}
			
			System.out.println("Quieres jugar de nuevo?");
			System.out.println("INGRESA 1 PARA JUGAR | INGRESA 2 PARA DEJAR DE JUGAR");
			jugar = sc.nextInt();
			if(jugar == 2) {System.out.println("GRACIAS POR JUGAR. ADIOS");};
			System.out.println("-----------------------------------------------------");
			
		}while(jugar == 1);
		
		sc.close();
	}
}
