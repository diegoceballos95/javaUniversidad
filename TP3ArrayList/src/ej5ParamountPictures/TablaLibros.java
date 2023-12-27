package ej5ParamountPictures;
import java.util.ArrayList;

public class TablaLibros {
	//ATRIBUTOS
	private ArrayList<Libro> libros;
	private int cantidad;
	
	//CONSTRUCTOR
	public TablaLibros() {
		this.libros = new ArrayList<Libro>();
		this.cantidad = 0;
	}

	//GETTERS AND SETTERS
	public Libro getLibro(int pos) {
		return this.libros.get(pos);
	}

	//METODOS
	public void insertarLibro(Libro libro) {
		this.libros.add(libro);
	}
	public void eliminarLibro(Libro libro) {
		this.libros.remove(libro);
	}
	public int cantidadLibros() {
		return this.libros.size();
	}
	public boolean existeLibro(Libro libro) {
		boolean ban = false;
		int i = 0;
		while(i<this.cantidad && !ban) {
			if(libro.equals(getLibro(i))) {
				ban = true;
			}
			i++;
		}
		return ban;
	}
	public boolean hayLibros() {
		if (this.cantidad > 0) {return true;}
		else {return false;}
	}
	public Libro recuperarLibro(String codigo) {
		boolean ban = false;
		int i = 0;
		Libro libro = null;
		while(i<this.cantidad && !ban) {
			if(this.libros.get(i).getCodigo() == codigo) {
				ban = true;
				libro = getLibro(i);
			}
			i++;
		}
		return libro;
	}
	public TablaLibros librosAutor(String nombre) {
		TablaLibros nuevaTabla = new TablaLibros();
		for(int i=0; i<cantidadLibros(); i++) {
			if(getLibro(i).getAutor().getNombre() == nombre) {
				nuevaTabla.insertarLibro(getLibro(i));
			}
		}
		return nuevaTabla;
	}
	
//	public boolean estaLlena() {
//	
//	}
	
}
