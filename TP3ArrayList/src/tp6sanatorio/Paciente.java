package tp6sanatorio;

public class Paciente extends Persona {
	//ATRIBUTOS
	private ObraSocial obraSocial;
	
	//CONSTRUCTOR
	public Paciente(int dni, String nombre, char sexo, Fecha fchNac, ObraSocial obraSocial) {
		super(dni, nombre, sexo, fchNac);
		this.obraSocial = obraSocial;
	}
	
	//GETTERS AND SETTERS
	public ObraSocial getObraSocial() {
		return obraSocial;
	}
	public void setObraSocial(ObraSocial obraSocial) {
		this.obraSocial = obraSocial;
	}
}
