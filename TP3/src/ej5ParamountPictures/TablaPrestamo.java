package ej5ParamountPictures;
import java.util.ArrayList;

public class TablaPrestamo {
	//ATRIBUTOS
	private ArrayList<Prestamo> prestamos;
	private int cantidad;
	
	//CONSTRUCTOR
	public TablaPrestamo() {
		this.prestamos = new ArrayList<Prestamo>();
		this.cantidad = 0;
	}

	//GETTERS AND SETTERS
	public Prestamo getPrestamo(int pos) {
		return this.prestamos.get(pos);
	}
	public int getCantidad() {
		return this.prestamos.size();
	}
	
	//METODOS
	public void nuevoPrestamo(Prestamo p) {
		this.prestamos.add(p);
		this.cantidad++;
	}
	public boolean hayPrestamo() {
		if (this.cantidad > 0) {return true;}
		else {return false;}
	}
	public boolean estaPrestado(Libro libro) {
		boolean ban = false;
		int i = 0;
		while(i<this.cantidad && !ban) {
			if(libro.equals(getPrestamo(i).getLibro())) {
				ban = true;
			}
			i++;
		}
		return ban;
	}
}
