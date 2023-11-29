package ej1.tarifaProgramador;

public class Test {

	public static void main(String[] args) {
		
		EscalaDeSueldos tabla = new EscalaDeSueldos();

		System.out.println(tabla);
		
		System.out.println("Promedio grado 0: $" + tabla.pagaPromedioGrado(0));
		System.out.println("Promedio grado 1: $" + tabla.pagaPromedioGrado(1));
		System.out.println("Promedio grado 2: $" + tabla.pagaPromedioGrado(2));
		System.out.println("Promedio grado 3: $" + tabla.pagaPromedioGrado(3));
		
		System.out.println("----------------------------------");
		
		System.out.println("Diferencia mayor y menor sueldo Grado 0: $" + tabla.diferenciaMayorMenorPaga(0));
		System.out.println("Diferencia mayor y menor sueldo Grado 1: $" + tabla.diferenciaMayorMenorPaga(1));
		System.out.println("Diferencia mayor y menor sueldo Grado 2: $" + tabla.diferenciaMayorMenorPaga(2));
		System.out.println("Diferencia mayor y menor sueldo Grado 3: $" + tabla.diferenciaMayorMenorPaga(3));
		
		System.out.println("----------------------------------");
		
		tabla.aumentarSueldo(100, 0);
		tabla.aumentarSueldo(100, 2);
		tabla.aumentarSueldo(100, 4);
		System.out.println("Aumento del 100% en sueldos Nivel 0, 2 y 4:\n");
		
		System.out.println(tabla);
		
	}
}
