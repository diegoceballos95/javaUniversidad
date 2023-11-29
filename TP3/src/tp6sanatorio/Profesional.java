package tp6sanatorio;

public class Profesional extends Persona {
	//ATRIBUTOS
	private int matricula;
	
	//CONSTRUCTOR
	public Profesional(int dni, String nombre, char sexo, Fecha fchNac, int matricula) {
		super(dni, nombre, sexo, fchNac);
		this.matricula = matricula;
	}
	
	//GETTERS AND SETTERS
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
}
