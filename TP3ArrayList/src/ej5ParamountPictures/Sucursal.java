package ej5ParamountPictures;
import java.time.LocalDate;

public class Sucursal {
	private String nombre;
	private TablaLibros librosEnSuc;
	private TablaPrestamo librosPrestados;
	private TablaAutores totalidadAutores;
	
	Sucursal(String nombre){
		this.nombre = nombre;
		this.librosEnSuc = new TablaLibros();
		this.librosPrestados = new TablaPrestamo();
		this.totalidadAutores = new TablaAutores();
	}
	
	public void prestarLibro(Libro l, Sucursal s) {
		Fecha devolucion = new Fecha();
		Prestamo p = new Prestamo(l, s, devolucion);
		this.librosPrestados.nuevoPrestamo(p);
	}
	public TablaLibros librosNacionalidad(String nac) {
		TablaLibros nuevaTabla = new TablaLibros();
		for(int i=0; i<this.librosEnSuc.cantidadLibros(); i++) {
			if(this.librosEnSuc.getLibro(i).getAutor().getNacionalidad().equals(nac)) {
				nuevaTabla.insertarLibro(this.librosEnSuc.getLibro(i));
			}
		}
		return nuevaTabla;
	}
//	public double montoAseguradoPorAutor(String nombre) {
//		
//	}
//	public TablaLibros mayorMontoAsegurado(int n) {
//		
//	}
//	public TablaAutores autoresPopulares(int n) {
//		TablaAutores masPopulares = null; int
//		for(int i=0; i<this.librosEnSuc.cantidadLibros(); i++) {
//			if(this.librosEnSuc.getLibro(i)) {
//				
//			}
//		}
//	}
	public Autor autorLibroMayorPeso() {
		int libroMayorPeso = 0;
		Autor autorLibMayPeso = null;
		for(int i=0; i<this.librosEnSuc.cantidadLibros(); i++) {
			if(this.librosEnSuc.getLibro(i).getPesoLibroFisico() > libroMayorPeso) {
				libroMayorPeso = this.librosEnSuc.getLibro(i).getPesoLibroFisico();
				autorLibMayPeso = this.librosEnSuc.getLibro(i).getAutor();
			}
		}
		return autorLibMayPeso;
	}
}
