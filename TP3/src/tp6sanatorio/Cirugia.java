package tp6sanatorio;

public class Cirugia extends Prestacion{
	//ATRIBUTOS
	private int minutosDuracion;

	//CONSTRUCTOR
	public Cirugia(int dPrestacion, String nombre, Paciente paciente, Profesional prestador, Fecha fchRealizacion, int minutosDuracion) {
		super(dPrestacion, nombre, paciente, prestador, fchRealizacion);
		this.minutosDuracion = minutosDuracion;
	}

	//GETTERS AND SETTERS
	public int getMinutosDuracion() {
		return minutosDuracion;
	}
	public void setMinutosDuracion(int minutosDuracion) {
		this.minutosDuracion = minutosDuracion;
	}
	
	//METODOS

}
