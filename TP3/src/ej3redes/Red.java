package ej3redes;
import java.util.ArrayList;

public class Red {
	//ATRIBUTOS
	private Direccion direccion;
	private Router routerConectado;
	private ArrayList<Host> listaHost;
	
	//CONSTRUCTOR
	Red(Direccion direccion) {
		this.direccion = direccion;
		this.routerConectado = null;
		this.listaHost = new ArrayList<Host>();
	}
	
	//GETTERS AND SETTERS
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public Router getRouterConctado() {
		return routerConectado;
	}
	public void setRouterConctado(Router routerConctado) {
		this.routerConectado = routerConctado;
	}
	public ArrayList<Host> getListaHost() {
		return listaHost;
	}
	public void setListaHost(ArrayList<Host> listaHost) {
		this.listaHost = listaHost;
	}

	//METODOS
	public void conctar(Host host) {
		listaHost.add(host);
	}
	public void conctar(Router router) {
		this.routerConectado  = router;
	}
	public String toString() {
		String cadena = "DATOS DE LA RED:\n";
		cadena += this.direccion.toString();
		cadena += "ROUTER CONECTADO: " + this.routerConectado.getDireccion();
		for(int i=0; i<this.listaHost.size(); i++) {
			cadena += "Conexion de Host" + (i+1) + ": " + this.listaHost.get(i).getDireccion();
		}
		return cadena;
	}
}
