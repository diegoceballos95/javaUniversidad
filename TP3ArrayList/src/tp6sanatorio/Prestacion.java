package tp6sanatorio;

public class Prestacion {
	//ATRIBUTOS
	protected int dPrestacion;
	protected String nombre;
	protected Paciente paciente;
	protected Profesional prestador;
	protected Fecha fchRealizacion;
	
	//CONSTRUCTOR
	public Prestacion(int dPrestacion, String nombre, Paciente paciente, Profesional prestador, Fecha fchRealizacion) {
		this.dPrestacion = dPrestacion;
		this.nombre = nombre;
		this.paciente = paciente;
		this.prestador = prestador;
		this.fchRealizacion = fchRealizacion;
	}

	//GETTERS AND SETTERS
	public int getdPrestacion() {
		return dPrestacion;
	}
	public void setdPrestacion(int dPrestacion) {
		this.dPrestacion = dPrestacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Profesional getPrestador() {
		return prestador;
	}
	public void setPrestador(Profesional prestador) {
		this.prestador = prestador;
	}
	public Fecha getFchRealizacion() {
		return fchRealizacion;
	}
	public void setFchRealizacion(Fecha fchRealizacion) {
		this.fchRealizacion = fchRealizacion;
	}

	
}
