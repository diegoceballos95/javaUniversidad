package ej5ParamountPictures;

public class Libro {
	//ATRIBUTOS
	private String codigo;
	private String titulo;
	private Autor autor;
	private Fecha fchPublicacion;
	private Fecha fchIngreso;
	
	//CONSTRUCTOR
	public Libro(String codigo, String titulo, Autor autor, Fecha fchPublicacion, Fecha fchIngreso) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.fchPublicacion = fchPublicacion;
		this.fchIngreso = fchIngreso;
	}

	//GETTERS AND SETTERS
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public Fecha getFchPublicacion() {
		return fchPublicacion;
	}
	public void setFchPublicacion(Fecha fhcPublicacion) {
		this.fchPublicacion = fhcPublicacion;
	}
	public Fecha getFchIngreso() {
		return fchIngreso;
	}
	public void setFchIngreso(Fecha fchIngreso) {
		this.fchIngreso = fchIngreso;
	}

	//********************************* IMPORTANTE *********************************
	
	public int getPesoLibroFisico() {
		//SI LA INSTACIA ES DE LA SUBCLASE LIBROFISICO, DEVUELVE SU PESO
        if (this instanceof LibroFisico) {
            return ((LibroFisico) this).getPeso();
        } else {
        	//SI NO, DEVUELVE 0 O LANZA U EXCEPCION DEPENDIENDO DE TU CASO
            return 0;
        }
    }
	// ******************************************************************************
	
	//METODOS
	public String toString() {
		String cadena = "----- DATOS DEL LIBRO ----\n";
		cadena += "Nombre: " + this.titulo + "\n";
		cadena += "Codigo: " + this.codigo + "\n";
		cadena += "Autor: " + this.autor + "\n";
		cadena += "Fecha publicacion: " + this.fchPublicacion + "\n";
		cadena += "Fecha ingreso: " + this.fchIngreso + "\n";
		return cadena;
	} 
	
}
