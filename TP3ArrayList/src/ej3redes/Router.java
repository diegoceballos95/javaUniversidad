package ej3redes;
import java.util.ArrayList;

public class Router {
	//ATRIBUTOS
	private Direccion direccion;
	private ArrayList<Red> listaRedes;
	private ArrayList<Router> listaRouters;
	private int numPuertos;
	private int puertosOcupados;
	
	//CONSTRUCTOR
	public Router(Direccion direccion, int numPuertos) {
		this.direccion = direccion;
		this.numPuertos = numPuertos;
		this.puertosOcupados = 0;
		this.listaRedes = new ArrayList<Red>();
		this.listaRouters = new ArrayList<Router>();
	}
	
	public Direccion getDireccion() {
		return this.direccion;
	}
	
	//METODOS
	public void conectar(Red red) {
		if (this.puertosOcupados < this.numPuertos)
			this.listaRedes.add(red);
		else
			System.out.println("ERROR. Ningun puerto disponible");
		this.puertosOcupados++;
	}
	public void conectar(Router router) {
		if (this.puertosOcupados < this.numPuertos)
			this.listaRouters.add(router);
		else
			System.out.println("ERROR. Ningun puerto disponible");
		this.puertosOcupados++;
	}
	public String toString() {
		String cadena = "DATOS DEL ROUTER:\n";
		cadena += this.direccion.toString();
		cadena += "NUMERO DE PUERTOS: " + this.numPuertos + "\n";
		cadena += "PUERTOS OCUPADOS: " + this.puertosOcupados + "\n";
		for(int i=0; i<this.listaRedes.size(); i++) {
			cadena += "Conexion de Red" + (i+1) + ": " + this.listaRedes.get(i).getDireccion();
		}
		for(int j=0; j<this.listaRouters.size(); j++) {
			cadena += "Conexion de Router" + (j+1) + ": " + this.listaRouters.get(j).getDireccion();
		}
		return cadena;
	}
}