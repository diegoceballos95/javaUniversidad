package modelo1Parcial;
import java.util.ArrayList;

public class ListaEmpleados {
	//ATRIBUTOS
	private ArrayList<Empleado> listaEmpleados;
	//CONSTRUCOR
	ListaEmpleados(){
		this.listaEmpleados = new ArrayList<Empleado>();
	}
	//GETTERS
	public Empleado getEmpleado(int i) {
		return this.listaEmpleados.get(i);
	}
	//METODOS
	public void agregarEmpleado(Empleado e) {
		this.listaEmpleados.add(e);
	}
	public void removerEmpleado(Empleado e) {
		this.listaEmpleados.remove(e);
	}
	public int cantEmpleados() {
		return this.listaEmpleados.size();
	}
	public void vaciarLista() {
		this.listaEmpleados.clear();
	}
	public String toString() {
		String cadena = "LISTA DE SUBORDINADOS\n";
		for(Empleado empleado : this.listaEmpleados) {
			cadena += empleado + " - ";
		}
		return cadena;
	}
}
