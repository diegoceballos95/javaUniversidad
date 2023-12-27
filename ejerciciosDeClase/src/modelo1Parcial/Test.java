package modelo1Parcial;

public class Test {

	public static void main(String[] args) {
		Fecha f1 = new Fecha(2023, 5, 12);
		Fecha f2 = new Fecha(2023, 5, 11);
		Fecha f3 = new Fecha(2023, 5, 9);
		Fecha f4 = new Fecha(2023, 5, 15);
		Fecha f5 = new Fecha(2023, 5, 19);
		Fecha f6 = new Fecha(2023, 5, 3);
		Fecha f7 = new Fecha(2023, 5, 22);
		Fecha f8 = new Fecha(2023, 5, 11);
		Empleado e1 = new Empleado("Diego", 39397722, "diego@gmail.com", "Solidaridad", f1, 50000 );
		Empleado e2 = new Empleado("Mario", 36342344, "mario@gmail.com", "Mitre", f2, 60000 );
		Empleado e3 = new Empleado("Dario", 2964564, "dario@gmail.com", "8 de octubre", f3, 30000 );
		Empleado e4 = new Directivo("Malena", 73461231, "malena@gmail.com", "Lerma", f4, 200000, "supervisor" );
		Empleado e5 = new Empleado("Teresa", 4586123, "teresa@gmail.com", "Catamarca", f5, 25000 );
		Empleado e6 = new Empleado("Agustin", 33547612, "agustin@gmail.com", "San Benito", f6, 100000 );
		Empleado e7 = new Empleado("Lucila", 12908412, "lucila@gmail.com", "Solidaridad", f7, 150000 );
		Empleado e8 = new Directivo("Andres", 58671231, "andres@gmail.com", "Mitre", f8, 170000, "encargado" );
		
		ListaEmpleados lista = new ListaEmpleados();
		lista.agregarEmpleado(e1);
		lista.agregarEmpleado(e2);
		lista.agregarEmpleado(e3);
		lista.agregarEmpleado(e4);
		lista.agregarEmpleado(e5);
		lista.agregarEmpleado(e6);
		lista.agregarEmpleado(e7);
		lista.agregarEmpleado(e8);

	}

}
