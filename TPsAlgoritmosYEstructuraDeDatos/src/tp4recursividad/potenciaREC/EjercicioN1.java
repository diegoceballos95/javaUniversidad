package tp4recursividad.potenciaREC;
//POTENCIA RECURSIVA
import java.util.Scanner;

public class EjercicioN1 {

	public static void main(String[] args) {
		//INGRESO DE DATOS
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la base: ");
		int a = sc.nextInt();
		System.out.println("Ingrese el exponente: ");
		int b= sc.nextInt();
		sc.close();

		int potencia = PotenciaRec(a,b);

		System.out.println(a + " elevado a la potencia " + b + " es = " + potencia);
	}
	public static int PotenciaRec(int a,int b) {
		if (b == 0) {
			return 1;}
		else {
			return a*PotenciaRec(a, b-1);
		}
	}
}
