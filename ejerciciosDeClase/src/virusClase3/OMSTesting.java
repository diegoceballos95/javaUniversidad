package virusClase3;
import java.util.Scanner;

public class OMSTesting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Virus cepa1 = new Virus("Ebola");
		int adnNeutralizante;
		int intentos = 0;
		
		System.out.println("Posee 3 intentos para neutralizar el virus");
		while(cepa1.esNocivo() && intentos<3) {		
			System.out.println("Ingrese el adn neutralizante: ");
			adnNeutralizante = sc.nextInt();
			
			cepa1.neutralizar(adnNeutralizante);
			intentos++;
			System.out.println("------------------------");
		}
		sc.close();
		
		System.out.println(cepa1);
	}
}
