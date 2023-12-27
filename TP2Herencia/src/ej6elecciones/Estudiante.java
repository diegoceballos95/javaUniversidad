package ej6elecciones;

public class Estudiante extends MiembroExactas{
	//ATRIBUTOS
	private int materiasAp;
	private boolean estadoRegular;

	//CONSTRUCTOR
	public Estudiante(String nombre, int materiasAp, boolean estadoRegular) {
		super(nombre);
		super.valorVoto = 1;
		this.materiasAp = materiasAp;
		this.estadoRegular = estadoRegular;
		if (this.materiasAp>=2 && this.estadoRegular) {
			super.puedeVotar = true;
		}
	}

	//GETTERS AND SETTERS
	public int getMateriasAp() {
		return materiasAp;
	}
	public void setMateriasAp(int materiasAp) {
		this.materiasAp = materiasAp;
	}
	public boolean getEstadoRegular() {
		return estadoRegular;
	}
	public void setEstadoRegular(boolean estadoRegular) {
		this.estadoRegular = estadoRegular;
	}
	
	//METODOS
	public String toString() {
		String cadena = super.toString();
		cadena += "Estado Regular: " + getEstadoRegular() + "\n";
		cadena += "Materias aprobadas: " + getMateriasAp() + "\n";
		return cadena;
	}
}
