package ej6elecciones;
import java.util.ArrayList;

public class Lista {
	//ATRIBUTOS
	private ArrayList<MiembroExactas> lista;

	//CONSTRUCTOR
	public Lista() {
		this.lista = new ArrayList<MiembroExactas>();
	}
	
	//GETTER
	public MiembroExactas getLista (int i) {
		return lista.get(i);
	}
	
	//METODOS
	public String toString() {
		String cadena = "---- LISTA DE MIEMBROS DE LA FAC. DE EXACTAS -----\n";
		for (int i=0; i<lista.size(); i++) {
			cadena += "- " + lista.get(i) + "\n";
		}
		return cadena;
	}
	
	public void cargarMiembro(MiembroExactas miembro) {
		lista.add(miembro);
	}
	
	public int cantidadMiembros() {
		return lista.size();
	}
	
	public int buscarMiembro(String nombre) {
		int i = 0;
		int pos = -1;
		boolean ban = true;
		while (i < cantidadMiembros() && ban) {
			if (getLista(i).getNombreCompleto().equals(nombre)) {
				ban = false;
				pos = i;
				}
			else {i++;}
		}
		return pos;
	}
}
