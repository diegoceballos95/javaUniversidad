package ej1listaNumReales;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		ListaDeReales lista = new ListaDeReales();
		lista.agregarNumero(23);
		lista.agregarNumero(78.3);
		lista.agregarNumero(2.67);
		lista.agregarNumero(78.3);
		lista.agregarNumero(12.2);
		lista.agregarNumero(101.24);

		System.out.println(lista);
		
		//ORDENAR LISTA
		lista.ordenarLista();
		System.out.println(lista);
		
		//EXISTENCIA DE UN ELEMENTO
		System.out.println("El 46.4 existe en la lista?: " + lista.existeEnLista(46.4));
		System.out.println("El 12.2 existe en la lista?: " + lista.existeEnLista(12.2));
		
		//SUMA TOTAL DE LISTA
		System.out.println("La suma de la lista es: " + lista.sumaTotalLista());
		
		//MAYOR Y MENOR DE LA LISTA
		System.out.println("El menor de la lista es: " + lista.menorDeLista());
		System.out.println("El mayor de la lista es: " + lista.mayorDeLista());
		
		//PROMEDIO
		System.out.println("Promedio de la liosta: " + lista.promedioLista());
		
		//MAS FRECUENTE
		System.out.println("El numero mas frecuente es: " + lista.numMasFrecuente());
		
		System.out.println("------------------------------------");
		
		ListaDeReales lista2 = new ListaDeReales();
		lista2.agregarNumero(23);
		lista2.agregarNumero(78.3);
		lista2.agregarNumero(2.67);
		ListaDeReales lista3 = new ListaDeReales();
		lista3.agregarNumero(2.7);
		lista3.agregarNumero(14.3);
		lista3.agregarNumero(54.67);
		
		//SUMA DE LISTAS
		if (lista2.tamanioLista() == lista3.tamanioLista()) {
			ListaDeReales lista4 = new ListaDeReales();
			lista4 = lista2.sumarListas(lista3);
			System.out.println(lista4);
		}
		else {
			System.out.println("Las listas deben tener igual tamanio");
		}
		
		//SUMA ENTRE POSICIONES
		int x = 1;
		int y = 3;
		System.out.println("Suma entre posiciones 1 y 3 es: " + lista.sumarEntrePos(x, y));
		
		//PRODUCTO DE LISTAS
		if (lista2.tamanioLista() == lista3.tamanioLista()) {
			ListaDeReales lista5 = new ListaDeReales();
			lista5 = lista2.multiplicarListas(lista3);
			System.out.println(lista5);
		}
		else {
			System.out.println("Las listas deben tener igual tamanio");
		}
		
		//PRODUCTO POR UN NUMERO INGRESADO
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		double k = sc.nextDouble(); 
		if (lista2.tamanioLista() == lista3.tamanioLista()) {
			ListaDeReales lista6 = new ListaDeReales();
			lista6 = lista2.multiplicarPorConstante(k);
			System.out.println(lista6);
		}
		else {
			System.out.println("Las listas deben tener igual tamanio");
		}
		sc.close();
	}
}
