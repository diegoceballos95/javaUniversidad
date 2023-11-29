package ej1empresa1;

public class Test {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("Diego Ceballos",39397722,"Solidaridad",2,4232208,3500);
		System.out.println(e1);
		
		Secretario s1 = new Secretario("Diego Ceballos",39397722,"Solidaridad",2,4232208,3500,45,38751342);
		System.out.println(s1);
		
		Vehiculo auto1 = new Vehiculo("A34T6O7","FIAT","KRONOS");
		Vendedor v1 = new Vendedor("Diego Ceballos",39397722,"Solidaridad",2,4232208,3500, auto1, 4230976);
		System.out.println(v1);
		
		System.out.println(v1.getNombre());
		System.out.println(v1.getVehiculo());
		
		System.out.println("---------------------------");
		
		Fecha fecha1 = new Fecha(1,4,2023);
		Pasante p1 = new Pasante("Diego Ceballos",39397722,"Solidaridad",2,4232208,3500,90,fecha1);
		System.out.println(p1);
		Fecha fecha2 = new Fecha(24,4,2023);
		p1.setFechaIngreso(fecha2);
		System.out.println("Nueva fecha de ingreso: " + p1.getFechaIngreso());
		
		System.out.println("---------------------------");
		
		System.out.println("Sueldo e1 actual: " + e1.getSalario());
		e1.incrementarSalario(2000);
		System.out.println("Sueldo e1 actual con aumento: " + e1.getSalario());
		
		System.out.println("---------------------------");
		
		System.out.println("Sueldo s1 actual: " + s1.getSalario());
		s1.incrementarSalario(s1.aumentoSecretario());
		System.out.println("Sueldo s1 actual con aumento: " + s1.getSalario());
		
		System.out.println("---------------------------");
		
		System.out.println("Sueldo v1 actual: " + v1.getSalario());
		v1.incrementarSalario(v1.aumentoVendedor());
		System.out.println("Sueldo v1 actual con aumento: " + v1.getSalario());
		
		System.out.println("---------------------------");
		
		System.out.println("Sueldo p1 actual: " + p1.getSalario());
		p1.incrementarSalario(p1.aumentoPasante());
		System.out.println("Sueldo p1 actual con aumento: " + p1.getSalario());
	}
}
