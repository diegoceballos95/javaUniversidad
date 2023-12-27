package ej1listaNumReales;
import java.util.ArrayList;
import java.util.Collections;

public class ListaDeReales {
	//ATRIBUTOS
	private ArrayList<Double> listaReales;
	
	//CONSTRUCTOR
	ListaDeReales(){
		this.listaReales = new ArrayList<Double>();
	}
	
	//GETTER
	public Double getNumero(int i) {
		return this.listaReales.get(i);
	}
	
	//METODOS
	public void agregarNumero(double valor) {
		this.listaReales.add(valor);
	}
	
	public void ordenarLista() {
		Collections.sort(this.listaReales);
	}
	
	public int tamanioLista() {
		return this.listaReales.size();
	}
	
	public String toString() {
		String cadena = "Lista de numeros:\n";
		for (int i=0; i < this.listaReales.size(); i++) {
			cadena += getNumero(i) + " - ";
		}
		return cadena;
	}
	
	public boolean existeEnLista(double valor) {
		int i = 0;
		boolean ban = false;
		while (i < this.listaReales.size() && !ban) {
			if(valor == this.listaReales.get(i).doubleValue()) {
				ban = true;
			}
			i++;
		}
		return ban;
	}
	
	public double sumaTotalLista() {
		double suma = 0;
		for (int i=0; i < this.listaReales.size(); i++) {
			suma += getNumero(i).doubleValue();
		}
		return suma;
	}
	
	public double promedioLista() {
		double promedio = sumaTotalLista()/this.listaReales.size();
		return promedio;
	}
	
	public double menorDeLista() {
		double menor = getNumero(0).doubleValue();
		int i = 1;
		for (i=1; i < this.listaReales.size(); i++) {
			if (getNumero(i).doubleValue() < menor) {
				menor = getNumero(i).doubleValue();
			}
		}
		return menor;
	}
	
	public double mayorDeLista() {
		double mayor = getNumero(0).doubleValue();
		int i = 1;
		for (i=1; i < this.listaReales.size(); i++) {
			if (getNumero(i).doubleValue() > mayor) {
				mayor = getNumero(i).doubleValue();
			}
		}
		return mayor;
	}
	
	public Double numMasFrecuente() {
		 Double numeroMasRepetido = null;
		 int cantidadMaxima = 0;    
		 for (int i = 0; i < this.listaReales.size(); i++) {
			 Double numeroActual = getNumero(i);
		     int cantidad = 0;     
		     for (int j = 0; j < this.listaReales.size(); j++) {
		         if (getNumero(j).equals(numeroActual)) {
		             cantidad++;
		         }
		     }
		     if (cantidad > cantidadMaxima) {
		         numeroMasRepetido = numeroActual;
	          cantidadMaxima = cantidad;
	         }
		 }
		 return numeroMasRepetido;
	}
	
	public ListaDeReales sumarListas(ListaDeReales lista1){
		ListaDeReales listaNueva = new ListaDeReales();
		for (int i=0;  i < tamanioLista(); i++) {
			double suma = getNumero(i).doubleValue() + lista1.getNumero(i).doubleValue();
			listaNueva.agregarNumero(suma);
		}
		return listaNueva;
	}
	
	public double sumarEntrePos(int x, int y){
		double suma = 0;
		for (int i=x;  i <= y; i++) {
			suma += getNumero(i).doubleValue();
		}
		return suma;
	}
	
	public ListaDeReales multiplicarListas(ListaDeReales lista1){
		ListaDeReales listaNueva = new ListaDeReales();
		for (int i=0;  i < tamanioLista(); i++) {
			double producto = getNumero(i).doubleValue() * lista1.getNumero(i).doubleValue();
			listaNueva.agregarNumero(producto);
		}
		return listaNueva;
	}
	
	public ListaDeReales multiplicarPorConstante(double k){
		ListaDeReales listaNueva = new ListaDeReales();
		for (int i=0;  i < tamanioLista(); i++) {
			double producto = getNumero(i).doubleValue() * k;
			listaNueva.agregarNumero(producto);
		}
		return listaNueva;
	}
	
	
	
	
	
	
	
}
