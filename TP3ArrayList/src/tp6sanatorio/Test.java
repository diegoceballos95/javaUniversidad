package tp6sanatorio;

public class Test {

	public static void main(String[] args) {
		Fecha fN1 = new Fecha(1992, 05, 01);
		Fecha fN2 = new Fecha(1934, 05, 31);
		Fecha fN3 = new Fecha(1999, 01, 26);
		Fecha fN4 = new Fecha(1988, 12, 01);
		Fecha fN5 = new Fecha(1978, 12, 11);
		Fecha fR1 = new Fecha(2026, 05, 15);
		Fecha fR2 = new Fecha(2023, 05, 31);
		Fecha fR3 = new Fecha(2024, 01, 26);
		Fecha fR4 = new Fecha(2023, 12, 11);
		Fecha fR5 = new Fecha(2025, 10, 11);
		ObraSocial os1 = new ObraSocial(123421,"Camioneros", "catamarca1320");
		ObraSocial os2 = new ObraSocial(421562, "Osutgra", "solidaridad 452" );
		ObraSocial os3 = new ObraSocial(100000, "Pieve", "sola 872");
		ObraSocial os4 = new ObraSocial(399922, "Camioneros", "villa mitre");
		ObraSocial os5 = new ObraSocial(394952, "Pieve", "villa chartas");
		Paciente p1 = new Paciente(1, "Diego", 'm', fN1, os1);
		Paciente p2 = new Paciente(2, "Mario", 'm', fN2, os2);
		Paciente p3 = new Paciente(3, "Juana", 'f', fN3, os3);
		Paciente p4 = new Paciente(4, "Teresa", 'f', fN4, os4);
		Paciente p5 = new Paciente(5, "Teamara", 'f', fN5, os5);
		Profesional pf1 = new Profesional(6, "Marcos", 'm', fN1, 142);
		Profesional pf2= new Profesional(7, "Diana", 'f', fN2, 156);
		Profesional pf3 = new Profesional(8, "Pablo", 'm', fN3, 546);
		Profesional pf4 = new Profesional(8, "Lidia", 'f', fN4, 763);
		Profesional pf5 = new Profesional(10, "Lara", 'f', fN5, 234);
		Cirugia c1 = new Cirugia(5000, "Gastritis", p1, pf1, fR1, 600);
		Cirugia c2 = new Cirugia(8000, "Covid", p2, pf2, fR2, 300);
		Cirugia c3 = new Cirugia(3000, "Sarampion", p3, pf3, fR3, 520);
		Cirugia c4 = new Cirugia(15000, "Ebola", p4, pf4, fR4, 450);
		Cirugia c5 = new Cirugia(15000, "Asma", p5, pf5, fR5, 536);
		
		Cirugias lista = new Cirugias();
		//ORDENADO POR INSERCION SEGUN FECHA REALIZACION
		lista.insertarCirugia(c1);
		lista.insertarCirugia(c2);
		lista.insertarCirugia(c3);
		lista.insertarCirugia(c4);
		lista.insertarCirugia(c5);
		System.out.println(lista);
		//ORDENAR POR NOMBRE DE CIRUGIA
		lista.ordenarCirugPorNom();
		System.out.println(lista);
		//ORDENAR POR PRECIO DE PRESTACION
		lista.ordenarPorPrecioPrestacion();
		System.out.println(lista);
		
		//PROMEDIO DURACION
		System.out.println("Duracion total de cirugias: " + lista.promedioDuracion() +" min");
		//PROMEDIO DURACION ENTRE FECHAS
		Fecha desde = new Fecha(2023,7,1);
		Fecha hasta = new Fecha(2026,5,15);
		System.out.println("Duracion de cirugias entre fechas: " + lista.promedioDuracion(desde, hasta) + " min");
		//PROMEDIO DURACION MAYOR A CIERTA EDAD
		System.out.println("edad p3: " + p3.edadPersona());
		System.out.println("edad p1: " + p1.edadPersona());
		System.out.println("edad p2: " + p2.edadPersona());
		System.out.println("edad p5: " + p5.edadPersona());
		System.out.println("edad p4: " + p4.edadPersona());
		
		System.out.println("Cirugias mayores de 30: " + lista.promedioDuracion(30) + " min");
		System.out.println("Cirugias mayores de 40: " + lista.promedioDuracion(40) + " min");
		
		//ELIMINAR CIRUGIA POR OBRA SOCIAL
		lista.eliminarCirugia("Camioneros");
		System.out.println(lista);
	}
}