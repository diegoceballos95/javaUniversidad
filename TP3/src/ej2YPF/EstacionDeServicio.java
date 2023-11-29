package ej2YPF;
import java.util.ArrayList;

public class EstacionDeServicio {
	
	//ATRIBUTOS
	private ArrayList<Surtidor> cadenaYPF;
	
	//Constructor
	EstacionDeServicio(int cantidadDeSucursales){
		this.cadenaYPF = new ArrayList<Surtidor>();
		for (int i=0; i<cantidadDeSucursales; i++) {
			cadenaYPF.add(new Surtidor());
		}
	}
	
	public Surtidor getSurtidor(int i) {
		return this.cadenaYPF.get(i);
	}
	
	//TO STRING
	public String toString() {
		String cadena = "*** Lista de " + this.cadenaYPF.size() + " sucursales***";
		for(int i=0; i<this.cadenaYPF.size(); i++) {
			cadena += "\nSucursal " + (i+1) + ":\n" + this.cadenaYPF.get(i);
		}
		return cadena;
	}
}
