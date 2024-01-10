package ejercicioVideojuego;

public class VideoJuego {

	//ATRIBUTOS
	
	private String titulo;
	private int codigo;
	private String consola;
	private int cantidadJugadores;
	private String categoria;
	
	//CONSTRUCTOR
	
	public VideoJuego(String titulo, int codigo, String consola, int cantidadJugadores, String categoria) {
		super();
		this.titulo = titulo;
		this.codigo = codigo;
		this.consola = consola;
		this.cantidadJugadores = cantidadJugadores;
		this.categoria = categoria;
	}

	//GETTERS AND SETTERS
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getConsola() {
		return consola;
	}

	public void setConsola(String consola) {
		this.consola = consola;
	}

	public int getCantidadJugadores() {
		return cantidadJugadores;
	}

	public void setCantidadJugadores(int cantidadJugadores) {
		this.cantidadJugadores = cantidadJugadores;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	//METODO TO STRING
	
	@Override
	public String toString() {
		return "VideoJuego [titulo=" + this.titulo + 
				", codigo=" + this.codigo + 
				", consola=" + this.consola + 
				", cantidadJugadores=" + this.cantidadJugadores + 
				", categoria=" + this.categoria + "]";
	}
}
