package modelo1Parcial;
import java.util.ArrayList;

public class ListaEmpresas {
	//ATRIBUTOS
	private ArrayList<Empresa> listaEmpresas;
	//CONSTRUCOR
	ListaEmpresas(){
		this.listaEmpresas = new ArrayList<Empresa>();
	}	
	//GETTERS
		public Empresa getEmpresa(int i) {
		return this.listaEmpresas.get(i);
	}
	//METODOS
	public void agregarEmpresa(Empresa e) {
		this.listaEmpresas.add(e);
	}
	public void removerEmpresa(Empresa e) {
		this.listaEmpresas.remove(e);
	}
	public int cantEmpresa() {
		return this.listaEmpresas.size();
	}
	public void vaciarLista() {
		this.listaEmpresas.clear();
	}
	public String toString() {
		String cadena = "LISTA DE SUBORDINADOS\n";
		for(Empresa empresa : this.listaEmpresas) {
			cadena += empresa + " - ";
		}
		return cadena;	
	}
}
