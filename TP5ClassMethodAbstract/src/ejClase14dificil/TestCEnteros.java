package ejClase14dificil;

public class TestCEnteros {

	public static void main(String[] args) {
		ConjuntoDeEnteros conjE1 = new ConjuntoDeEnteros();
		for(int i=0; i<10; i++) {
			conjE1.agregar(i * 2);
		}
		ConjuntoDeEnteros conjE2 = new ConjuntoDeEnteros();
		for(int i=0; i<8; i++) {
			conjE2.agregar(i * 3);
		}
		System.out.println(conjE1);
		System.out.println("Tamanio conjE1: " + conjE1.cardinalidad());
		System.out.println("El 8 pertenece a CONJE1?: " + conjE1.pertenece(8));
		conjE1.eliminar(4); System.out.println("Se elimino el 4:");
		System.out.println(conjE1);
		
		System.out.println("\n");
		
		System.out.println(conjE2);
		System.out.println("Tamanio conjE2: " + conjE2.cardinalidad());
		System.out.println("El 2 pertenece a CONJE2?: " + conjE2.pertenece(2));
		
		System.out.println("\n");
		
		System.out.println("INTERSECCION: ");
		ConjuntoDeEnteros conjE3 = (ConjuntoDeEnteros) conjE1.interseccion(conjE2);
		System.out.println(conjE3);
		
		System.out.println("\n");

		System.out.println("UNION: ");
		ConjuntoDeEnteros conjE4 = (ConjuntoDeEnteros) conjE1.union(conjE2);
		System.out.println(conjE4);
		
		System.out.println("\n");
		
		System.out.println("DIFERENCIA: ");
		ConjuntoDeEnteros conjE5 = (ConjuntoDeEnteros) conjE1.diferencia(conjE2);
		System.out.println(conjE5);
		
		System.out.println("\n");
		
		System.out.println("CLON DEL CONJE1: ");
		ConjuntoDeEnteros conjE6 = (ConjuntoDeEnteros) conjE1.clone();
		System.out.println(conjE6);
		
		System.out.println("\n");
		
		System.out.println("IGUALDAD: ");
		System.out.println("2 = 2?: " + conjE6.esIgual(2, 2));
		System.out.println("8 = 2?: " + conjE6.esIgual(8, 2));
	}

}
