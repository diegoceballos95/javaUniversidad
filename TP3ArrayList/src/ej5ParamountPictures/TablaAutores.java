package ej5ParamountPictures;

import java.util.ArrayList;

public class TablaAutores {
	//ATRIBUTOS
	private ArrayList<Autor> autores;
	private int cantidad;
	
	//CONSTRUCTOR
	public TablaAutores() {
		this.autores = new ArrayList<Autor>();
		this.cantidad = 0;
	}

	//GETTERS AND SETTERS
	public Autor getAutor(int pos) {
		return this.autores.get(pos);
	}
	public int getCantidad() {
		return this.autores.size();
	}
	
	//METODOS
	public void insertarAutor(Autor autor) {
		this.autores.add(autor);
	}
	public int cantidadAutores() {
		return this.autores.size();
	}
	public boolean hayAutores() {
		if (this.cantidad > 0) {return true;}
		else {return false;}
	}
	public boolean estaAutor(Autor autor) {
		boolean ban = false;
		int i = 0;
		while(i<this.cantidad && !ban) {
			if(autor.equals(getAutor(i))) {
				ban = true;
			}
			i++;
		}
		return ban;
	}
	public Autor recuperarAutor(int pos) {
		return getAutor(pos);
	}
	public Autor recuperarAutor(String nombre) {
		boolean ban = false;
		int i = 0;
		Autor autor = null;
		while(i<this.cantidad && !ban) {
			if(this.autores.get(i).getNombre() == nombre) {
				ban = true;
				autor = getAutor(i);
			}
			i++;
		}
		return autor;
	}
	public TablaAutores autoresNac(String nac) {
		TablaAutores nuevaTabla = new TablaAutores();
		for(int i=0; i<cantidadAutores(); i++) {
			if(getAutor(i).getFchNac().toString() == nac) {
				nuevaTabla.insertarAutor(getAutor(i));
			}
		}
		return nuevaTabla;
	}
	public TablaAutores autoresNacionalidad(String nacionalidad) {
		TablaAutores nuevaTabla = new TablaAutores();
		for(int i=0; i<cantidadAutores(); i++) {
			if(getAutor(i).getNacionalidad() == nacionalidad) {
				nuevaTabla.insertarAutor(getAutor(i));
			}
		}
		return nuevaTabla;
	}
}
