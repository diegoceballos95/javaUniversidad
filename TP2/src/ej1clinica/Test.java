package ej1clinica;

public class Test {

	public static void main(String[] args) {
		
		Ambulatorio a1 = new Ambulatorio("Andres Ceballos", 45312345, "Solidaridad - Salta", "3875134270", 2023,5,1, "Sobredosis de Pizzas");
		System.out.println(a1);
		
		System.out.println("--------------------------");
		
		System.out.println("Ingreso ambulatorio: " + a1.getFecha());
		a1.setFecha(2026,4,3);
		System.out.println("Ingreso ambulatorio modificado: " + a1.getFecha());
		
		System.out.println("--------------------------");

		Internado i1 = new Internado("Diego Ceballos", 39397722, "Solidaridad - Salta", "3875134270", 2023,4,27, 2023,6,13);
		System.out.println(i1);
		
		System.out.println("--------------------------");
		
		System.out.println("Fecha de alta actual: " + i1.getFechaAlta());
		i1.setFechaAlta(2024,1,1);
		System.out.println("Nueva fecha de alta: " + i1.getFechaAlta());

	}

}