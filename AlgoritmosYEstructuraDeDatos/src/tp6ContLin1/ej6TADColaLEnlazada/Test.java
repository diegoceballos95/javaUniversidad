package tp6ContLin1.ej6TADColaLEnlazada;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Object objAux;
		Scanner sc1, sc2;
		int n, elemento; 
		
		System.out.println("Ingrese cantidad");
		sc1 = new Scanner(System.in);
		n = sc1.nextInt();
		
		if (n > 0) {
			ColaLEnlazada objCola = new ColaLEnlazada();
			
			for (int i=0; i<n; i++){
				System.out.println("Ingrese elemento");
				sc2 = new Scanner(System.in);
				elemento = sc2.nextInt();
				
				objCola.meter(new Integer(elemento));				
			}
			
			System.out.println("*** Se muestra la cola con metodo ***");
			objCola.muestra();
			
			System.out.println("*** Se muestra la cola vaciandola ***");
			while (!objCola.estaVacia()) {
				objAux = objCola.sacar();
				if (objAux != null){
					System.out.println("Elemento Cola " + objAux.toString());
				}		
			}
			
			objAux = objCola.sacar();
		}
		sc1.close();
	}
}
