package tp4recursividad.factorial;
import java.util.Scanner;

public class EjemploFactorial {
	public static void main(String[] args){
	
        int n, resultado;
        Scanner sc = new Scanner(System.in);
		
		//INGRESO DE UN NUMERO
		System.out.print("Ingrese un número entero: ");
        n = sc.nextInt();
        sc.close();
        
        resultado = factorial(n);
        
        System.out.println("El factorial de " + n + " es " + resultado);
	}
	
	public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
