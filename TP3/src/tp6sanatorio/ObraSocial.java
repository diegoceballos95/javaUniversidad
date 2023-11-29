package tp6sanatorio;

public class ObraSocial {
	//ATRIBUTOS
	private int cuit;
	private String denominacion;
	private String domicilio;
	
	//CONSTRUCTOR
	public ObraSocial(int cuit, String denominacion, String domicilio) {
		this.cuit = cuit;
		this.denominacion = denominacion;
		this.domicilio = domicilio;
	}

	//GETTERS AND SETTERS
	public int getCuit() {
		return cuit;
	}
	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	public String getDenominacion() {
		return denominacion;
	}
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	
}
