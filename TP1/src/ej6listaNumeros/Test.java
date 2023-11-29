package ej6listaNumeros;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int tam, numElim, numAgre, posAgre, numBusq, numHallado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de numeros de la lista:");
		tam = sc.nextInt();
		
		Lista lista = new Lista(tam);
		lista.cargarLista();
		
		lista.ordenarLista();
		System.out.println("LA LISTA SE HA ORDENADO");
		System.out.println(lista);
		
		System.out.println("Ingrese el numero a eliminar");
		numElim = sc.nextInt();
		lista.eliminarNum(numElim);
		System.out.println(lista);
		
		System.out.println("Ingrese primero el numero a agregar y segundo la posicion en la lista");
		numAgre = sc.nextInt();
		posAgre = sc.nextInt();
		lista.agregarNum(numAgre, posAgre);
		System.out.println(lista);
		
		System.out.println("Ingrese el numero que desea buscar");
		numBusq = sc.nextInt();
		numHallado = lista.buscarNum(numBusq);
		
		sc.close();
	}

}
