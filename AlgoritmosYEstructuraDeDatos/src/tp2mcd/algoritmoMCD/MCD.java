package tp2mcd.algoritmoMCD;
import java.util.Scanner;

public class MCD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese a: ");
		int a = sc.nextInt();
		System.out.println("Ingrese b: ");
		int b = sc.nextInt();
		a = Math.abs(a);
		b = Math.abs(b);
		sc.close();
		System.out.println("Sean a = "+a+ " y b = "+b);
		int aux;
		
		if(a == 0 && b == 0) {
			System.out.println("ERROR");
		}
		else{
			while(b != 0) {
				aux = b;
				b = a % b;
				a = aux;
			}
			System.out.println("El mcd es "+a);
			
		}
		
		

	}

}
