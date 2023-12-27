package ej3fotoEstrellas;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int f,c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese numero de filas:");
		f = sc.nextInt();
		System.out.println("Ingrese numero de columnas:");
		c = sc.nextInt();
		System.out.println("\n");
		
		TablaFotografia tabValores = new TablaFotografia(f,c);
		System.out.println(tabValores);
		
		TablaEstrellas tabEstrella = new TablaEstrellas(f,c);
		tabEstrella.buscarEstrellas(tabValores);
		System.out.println(tabEstrella);
		
		System.out.println("");

	}

}
