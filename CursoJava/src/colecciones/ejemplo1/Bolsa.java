package colecciones.ejemplo1;

import java.util.ArrayList; 

public class Bolsa < T > { 
	
	 private ArrayList < T > lista = new ArrayList < T >(); 
	 
	 public void add(T objeto){ 
	    lista.add(objeto); 
	 } 
	 
	 public ArrayList<T> getProducts(){ 
	    return lista; 
	 } 
}