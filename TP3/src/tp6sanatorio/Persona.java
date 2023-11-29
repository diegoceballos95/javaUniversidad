package tp6sanatorio;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class Persona {
	//ATRIBUTOS
	protected int dni;
	protected String nombre;
	protected char sexo;
	protected Fecha fchNac;
	
	//CONSTRUCTOR
	public Persona(int dni, String nombre, char sexo, Fecha fchNac) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.sexo = sexo;
		this.fchNac = fchNac;
	}
	
	//GETTERS AND SETTERS
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public Fecha getFchNac() {
		return fchNac;
	}
	public void setFchNac(Fecha fchNac) {
		this.fchNac = fchNac;
	}
	
	//METODOS
	public int edadPersona() {
		Fecha hoy = new Fecha();
		LocalDate nacimiento = this.fchNac.getFecha();
		int edad = (int) ChronoUnit.YEARS.between(nacimiento, hoy.getFecha());
		return edad;
	}
}
