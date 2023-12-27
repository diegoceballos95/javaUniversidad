package ej6elecciones;
import java.util.Scanner; 

public class Test {

	public static void main(String[] args) {
		
		int op; 
		int pos;
		String nombre;
		Scanner sc = new Scanner(System.in);
		Lista lista = new Lista();
		
		//CREACION DE MIEMBROS
		MiembroExactas d1 = new Docente("Mario Castro", true);
		Docente d2 = new Docente("Cesar Peralta", false);
		Docente d3 = new Docente("Aroon Torres", true);
		MiembroExactas e1 = new Estudiante("Diego Ceballos", 2, true);
		Estudiante e2 = new Estudiante("Maxi Quiroga", 1, true);
		Estudiante e3 = new Estudiante("Rocio Queroz", 4, false);
		Estudiante e4 = new Estudiante("Karina la Princesita", 3, true);
		MiembroExactas p1 = new PersonalDeApoyo("Meri Shelly");
		PersonalDeApoyo p2 = new PersonalDeApoyo("Edgar Allan Poe");
		
		//CARGA DE LISTA
		lista.cargarMiembro(e1);
		lista.cargarMiembro(d1);
		lista.cargarMiembro(p1);
		lista.cargarMiembro(d2);
		lista.cargarMiembro(e2);
		lista.cargarMiembro(p2);
		lista.cargarMiembro(e3);
		lista.cargarMiembro(d3);
		lista.cargarMiembro(e4);
		
		//MOSTRAR LISTA COMPLETA
		System.out.println(lista);
		
		do {
			System.out.println("---------- MENU ----------");
			System.out.println("[0] SALIR\n");
			System.out.println("[1] Mostar lista de alumnos que votan");
			System.out.println("[2] Verificar estado de votacion");
			System.out.println("[3] Mostrar porcentaje de alumnos que pueden votar");
			System.out.println("[4] Mostrar porcentaje de docentes que pueden votar");
			System.out.println("---------------------------");
			System.out.println("Ingrese una opcion:");
			op = sc.nextInt();
			
			switch(op) {
			//SALIR:
			case 0: System.out.println("FIN DEL PROGRAMA"); break;
			
			//MOSTAR ALUMNOS QUE VOTAN:
			case 1:
				for(int i=0; i<lista.cantidadMiembros(); i++) {
					if (lista.getLista(i) instanceof Estudiante) {
						if(lista.getLista(i).getPuedeVotar())
							System.out.println(lista.getLista(i).getNombreCompleto());
					}
				}
				break;
				
			//BUSCAR PERSONA Y MOSTRAR SI VOTA O NO:
			case 2: 
				System.out.println("Ingrese el nombre de la persona:");
				sc.nextLine();
				nombre = sc.nextLine();
				
				System.out.println("Ha ingresado el nombre: " + nombre);
				pos = lista.buscarMiembro(nombre);
				System.out.println("Posicion en lista:" + pos);
				
				if(pos >= 0) {
					if(lista.getLista(pos).getPuedeVotar()) {
						System.out.println("La persona puede votar");
					}
					else {
						if (lista.getLista(pos) instanceof Docente) {
							System.out.println("El docente NO PUEDE VOTAR, no tiene cargo regular");
						}
						
//						if(lista.getLista(pos) instanceof Estudiante){
//							if (!lista.getLista(pos).getEstadoRegular()) {
//								System.out.println("El estudiante NO PUEDE VOTAR, no esta regular");
//							}
//							if (!lista.getLista(pos).getMateriasAp() < 2) {
//								System.out.println("El estudiante NO PUEDE VOTAR, tiene menos de 2 materias aprobadas");
//							}
//						}
						
					}
				}
				else {System.out.println("La persona no se encuentra en la lista");}
				break;
				
			//PORCENTAJE DE ALUMNOS QUE VOTAN
			case 3:
				double contAlu = 0;
				double contAluQueVotan = 0;
				double porcentajeAlu;
				for(int i=0; i<lista.cantidadMiembros(); i++) {
					if (lista.getLista(i) instanceof Estudiante) {
						contAlu++;
						if(lista.getLista(i).getPuedeVotar())
							contAluQueVotan++;
					}
				}
				porcentajeAlu = (contAluQueVotan * 100) / contAlu;
				System.out.println("El " + porcentajeAlu + "% de los alumnos votara" );
				break;
				
			//PORCENTAJE DE DOCENTES QUE VOTAN
			case 4:
				double contDoc = 0;
				double contDocQueVotan = 0;
				double porcentajeDoc;
				for(int i=0; i<lista.cantidadMiembros(); i++) {
					if (lista.getLista(i) instanceof Docente) {
						contDoc++;
						if(lista.getLista(i).getPuedeVotar())
							contDocQueVotan++;
					}
				}
				porcentajeDoc = (contDocQueVotan * 100) / contDoc;
				System.out.println("El " + porcentajeDoc + "% de los docentes votara" );
				break;
				
			default: System.out.println("Ingrese una opcion valida"); break;
			}

		}while(op != 0);
		
		sc.close();
	}
}
