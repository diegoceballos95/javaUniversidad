package ej5ParamountPictures;

public class LibroFisico extends Libro{
	//ATRIBUTOS
	private int paginas;
	private int peso;
	
	//CONSTRUCTOR
	public int getPaginas() {
		return paginas;
	}
	public LibroFisico(String codigo, String titulo, Autor autor, Fecha fhcPublicacion, Fecha fchIngreso, int paginas, int peso) {
		super(codigo, titulo, autor, fhcPublicacion, fchIngreso);
		this.paginas = paginas;
		this.peso = peso;
	}
	
	//GETTERS AND SETTERS
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	//METODOS
	public String toString() {
		String cadena = super.toString();
		cadena += "Paginas: " + this.paginas + "\n";
		cadena += "Peso " + this.peso + " gramos\n";
		return cadena;
	}
}
