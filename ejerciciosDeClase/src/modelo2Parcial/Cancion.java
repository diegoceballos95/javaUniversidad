package modelo2Parcial;

public class Cancion {
	//ATRIBUTOS 
	private String nombre;
	private String genero;
	private boolean fueReproducida;

	//CONSTRUCTOR
	public Cancion(String nombre, String genero) {
		this.nombre = nombre;
		this.genero = genero;
		this.fueReproducida = false;
	}

	public String getNombre() {
		return this.nombre;
	}
	public String getGenero() {
		return this.genero;
	}
	public boolean getFueReproducida() {
		return this.fueReproducida;
	}
	public void setFueReproducida(boolean valor) {
		this.fueReproducida = valor;
	}
	public void play() {
		System.out.println("Reproduciendo: " + getNombre() + "(" + getGenero() + ")");
	}
	
}
