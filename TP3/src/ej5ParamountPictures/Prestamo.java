package ej5ParamountPictures;

public class Prestamo {
	//ATRIBUTOS
	private Libro libro;
	private Sucursal destino;
	private Fecha fchDevolucion;
	
	//CONSTRUCTOR
	public Prestamo(Libro libro, Sucursal destino, Fecha fchDevolucion) {
		this.libro = libro;
		this.destino = destino;
		this.fchDevolucion = fchDevolucion;
	}

	//GETTERS AND SETTERS
	public Libro getLibro() {
		return this.libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public Sucursal getDestino() {
		return this.destino;
	}
	public void setDestino(Sucursal destino) {
		this.destino = destino;
	}
	public Fecha getFchDevolucion() {
		return this.fchDevolucion;
	}
	public void setFchDevolucion(Fecha fchDevolucion) {
		this.fchDevolucion = fchDevolucion;
	}
	
	
	
}


