package tp6ContLin1.ej2TADPilaArray;
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
			PilaArray objPila = new PilaArray(n);
			
			for (int i=0; i<n; i++) {
				System.out.println("Ingrese elemento");
				sc2 = new Scanner(System.in);
				elemento = sc2.nextInt();
				
				objPila.meter(new Integer(elemento));				
			}
			
			while (!objPila.estaVacia()) {
				objAux = objPila.sacar();
				if (objAux!=null){
					System.out.println("Elemento Pila " + objAux);
				}		
			}
			
			objAux = objPila.sacar();
		}
		sc1.close();
	}
}
