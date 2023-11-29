package testing;
import reader.*;
import java.util.Scanner;
import java.util.ArrayList;
import grafoDirigido.GrafoD;

public class Test1 {

	public static void main(String[] args) {
		GrafoD g1;
		ArrayList<String[]>data = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la ruta del archivo:");
		String ruta = scanner.nextLine();
		Reader r1 = new Reader(ruta);
		try {
			r1.leerArchivo(data);
			int orden = Integer.parseInt(data.get(0)[0]);
			data.remove(0);
			g1 = new GrafoD(orden);
			g1.cargarGrafo(data);
		}catch(Exception e) {
			System.out.println(e.fillInStackTrace());
		}
		scanner.close();
	}
}