package ejemploSumaMatriz;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// TIEMPO INICIAL --------------------------------------------------------------
		
		//double tiempoIni = System.nanoTime();
		double tiempoIni = System.currentTimeMillis();
	
		
		// MATRIZ GENERAL --------------------------------------------------------------
		Matriz m = new Matriz(15, 15);
		m.cargarMatriz();
		System.out.println("la suma GENERAL es: " + m.sumar());
		
		
		//MATRICES PARCIALES -----------------------------------------------------------
		
		// CANTIDAD DE MATRICES PARA LAS SUMAS PARCIALES:
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de particiones de la matriz: ");
		int cantM = sc.nextInt();

		// INTERVALOS DE COLUMANS PARA DIVIDIR LA MATRIZ:
		int c = m.getColumnas() / cantM;
		
		// CREO UN ARRAY PARA GUARDAR LOS HILOS
		ArrayList<MatrizParcial> listaHilos = new ArrayList<MatrizParcial>();
		
		// CREACION DE HILOS CON SUS RESPECTIVAS COLUMNAS DE INI Y FIN:
		for(int i = 0; i < cantM; i++) {
			listaHilos.add(new MatrizParcial(m, i * c, (i + 1) * c)) ;
			System.out.println("Hilo:"+i+"creado -> colIni: " + (i*c) + " -> colFin: " + ((i+1)*c-1));
		}
		
		// EN CASO DE QUE EL FOR ANTERIOR NO CUBRA TODA LA MATRIZ, SE TOMA LAS COL SOBRANTES:
		if(m.getColumnas() % cantM != 0) {
			int resto = m.getColumnas() % cantM;
			int colIni = m.getColumnas() - resto;
			int colFin = m.getColumnas();
			listaHilos.add(new MatrizParcial(m, colIni, colFin));
			System.out.println("Hilo EXTRA creado -> colIni: " + colIni + " -> colFin: " + (colFin-1));
			cantM++;
		}
		
		// INICIAR LOS HILOS:
		for(int i = 0; i < cantM; i++) {
			listaHilos.get(i).start();;
		}
		
		// JOIN() PARA QUE LOS HILOS FINALICEN ANTES DE PASAR AL TIMEPO DE EJECUCION:
		try {
			for(int i = 0; i < cantM; i++) {
				listaHilos.get(i).join();;
			}
		}
		catch(InterruptedException e) {
			System.out.println("ERROR: HILOS INTERRUMPIDOS");
		}
		
		System.out.println("La suma CONCURRENTE es: " + m.getSumaM());
		
		// TIEMPO DE EJECUCION ---------------------------------------------------------
		
		//double tiempoFin = System.nanoTime();
		//double tiempoEjecuicion = (tiempoFin - tiempoIni) / 1000000;
		
		double tiempoFin = System.currentTimeMillis();
		double tiempoEjecuicion = (tiempoFin - tiempoIni);
		
		System.out.println("Tiempo de ejecucion: " + tiempoEjecuicion + " milisegundos");
		
		sc.close();
	}
}