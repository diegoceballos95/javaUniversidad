package Test1;
import reader.*;
import java.util.Scanner;
import esquinaNoroeste.EsquinaNoroeste;
import java.util.ArrayList;
import grafoDirigido.GrafoDirigido;

public class Test1 {

	public static void main(String[] args) {
		GrafoDirigido g1;
		EsquinaNoroeste esq1;
		ArrayList<String[]>data = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la ruta del archivo:");
		String ruta = scanner.nextLine();
		Reader r1 = new Reader(ruta);
		try {
			r1.leerArchivo(data);
			int orden = Integer.parseInt(data.get(0)[0]);
			data.remove(0);
			g1 = new GrafoDirigido(orden);
			g1.cargarGrafo(data);
			g1.aplicarFloyd();
			esq1 = new EsquinaNoroeste(g1);
			esq1.cargarOrigenDestino();
			esq1.cargarOfertaDemanda();
			esq1.armarMatrizEsqNoroeste();
			esq1.trabajarMatrizResultado();
			esq1.mostrarInformacion();
		}catch(Exception e) {
			System.out.println(e.fillInStackTrace());
		}
		scanner.close();
	}
}