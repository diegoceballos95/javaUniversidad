package ejClase14dificil;

public class TestCPersonas {

	public static void main(String[] args) {
		Fecha f1 = new Fecha(2023, 5, 7);
		Fecha f2 = new Fecha(2021, 1, 3);
		Fecha f3 = new Fecha(2019, 9, 12);
		Fecha f4 = new Fecha(2045, 3, 1);
		Fecha f5 = new Fecha(2012, 7, 29);
		Persona p1 = new Persona(3939, "Diego", f1);
		Persona p2 = new Persona(4123, "Mario", f2);
		Persona p3 = new Persona(4311, "Andres", f3);
		Persona p4 = new Persona(3758, "Lucila", f4);
		Persona p5 = new Persona(9162, "Teresa", f5);
		Persona p6 = new Persona(3238, "Dario", f1);
		Persona p7 = new Persona(8762, "Margot", f3);
		ConjuntoDePersonas conjP1 = new ConjuntoDePersonas();
		ConjuntoDePersonas conjP2 = new ConjuntoDePersonas();
		
		conjP1.agregar(p1);
		conjP1.agregar(p2);
		conjP1.agregar(p3);
		conjP1.agregar(p4);
		conjP1.agregar(p5);
		conjP2.agregar(p1);
		conjP2.agregar(p6);
		conjP2.agregar(p7);
		conjP2.agregar(p2);

		System.out.println(conjP1);
		System.out.println("Tamanio conjE1: " + conjP1.cardinalidad());
		System.out.println("Teresa pertenece a CONJP1?: " + conjP1.pertenece(p5));
		conjP1.eliminar(p3); System.out.println("Se elimino a Andres:");
		System.out.println(conjP1);
		
		System.out.println("\n");
		System.out.println(conjP2);
		
		System.out.println("\n");
		
		System.out.println("INTERSECCION: ");
		ConjuntoDePersonas conjP3 = (ConjuntoDePersonas) conjP1.interseccion(conjP2);
		System.out.println(conjP3);
		
		System.out.println("\n");

		System.out.println("UNION: ");
		ConjuntoDePersonas conjP4 = (ConjuntoDePersonas) conjP1.union(conjP2);
		System.out.println(conjP4);
		
		System.out.println("\n");
		
		System.out.println("DIFERENCIA: ");
		ConjuntoDePersonas conjP5 = (ConjuntoDePersonas) conjP1.diferencia(conjP2);
		System.out.println(conjP5);
		
		System.out.println("\n");
		
		System.out.println("CLON DEL CONJE1: ");
		ConjuntoDePersonas conjP6 = (ConjuntoDePersonas) conjP1.clone();
		System.out.println(conjP6);
		
		System.out.println("\n");
		
		System.out.println("IGUALDAD: ");
		System.out.println("p1 = p1?: " + conjP6.esIgual(p1, p1));
		System.out.println("p6 = p2?: " + conjP6.esIgual(p6, p2));
	}
}
