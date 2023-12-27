package tecnicoArrayList;
import java.util.ArrayList;

public class Tecnico {
	//ATRIBUTOS
	private ArrayList<String> competencias;
	
	//CONSTRUCTOR
	public Tecnico() {
		this.competencias = new ArrayList<String>();
	}
	
	//METODOS
	public void cargarCompetencia(String competencia) {
		competencias.add(competencia);
	}
	public void eliminarCompetencia() {
		if(competencias.size() != 0){
			competencias.remove(competencias.size()-1);
		}
		else {
			System.out.println("LISTA VACIA");
		}
	}
	public void eliminarCompetencia(String competencia) {
		if(competencias.size() != 0){
			competencias.remove(competencia);
		}
		else {
			System.out.println("LISTA VACIA");
		}
	}
	public int cantidadCompentencias() {
		return competencias.size();
	}
	public String toString() {
		String cadena = "LISTA DE COMPETENCIAS:\n";
		for (int i=0; i<competencias.size(); i++) {
			cadena += competencias.get(i) + "\n";
		}
		return cadena;
	}
}
