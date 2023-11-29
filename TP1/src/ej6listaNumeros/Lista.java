package ej6listaNumeros;
import java.util.Arrays;
import java.util.Scanner;

public class Lista {
	
	//ATRIBUTOS
	
	private int[] listaNum;
	public int tam;
	
	//CONSTRUCTOR
	
	Lista(int tam){
		this.listaNum = new int[tam];
		this.tam = tam;
	}

	//METODOS
	
	public void cargarLista() {
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<this.tam; i++){
			System.out.println("Ingrese el elemento Numero " + (i+1));
			this.listaNum[i] = sc.nextInt();
		}
	}
	
	public String toString() {
		String cadena = "LISTA:\n";
		for(int i=0; i<this.tam; i++) {
			cadena += this.listaNum[i] + " - ";
		}
		return cadena;
	}
	
	public void agregarNum(int num, int pos) {
		this.listaNum[pos] = num;
	}
	
	public void eliminarNum(int num) {
		int pos = buscarNum(num);
		if (pos>=0) {
			this.listaNum[pos] = 0;
			System.out.println("Numero eliminado");
		}
		else 
			System.out.println("El numero no existe en la lista");;

	}
	
	public void ordenarLista() {
		Arrays.sort(this.listaNum);
	}
	
	public int buscarNum(int numBusq) {
		int pos = Arrays.binarySearch(this.listaNum, numBusq);
		if (pos>=0) {
			System.out.println("Numero hallado en la posicion " + pos);
			return pos;
		}
		else {
			System.out.println("El numero no existe en la lista");
			return -1;
		}
	}
}
