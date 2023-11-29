package virus;
import java.util.Random;

public class Virus {
	//ATRIBUTOS
	private String nombre;
	private int adn;
	private boolean nocivo;
	
	//CONSTRUCTOR
	Virus(){
		Random codGenetico = new Random();
		this.adn = codGenetico.nextInt(10)+1;;
		this.nocivo = true;
	}
	Virus(String nombre){
		this();
		this.nombre = nombre;
	}

	//METODOS
	public boolean esNocivo() {
		return this.nocivo;
	}
	
	public void neutralizar(int adnNeutralizante){
		if (adnNeutralizante == this.adn) {
			this.nocivo = false;
			System.out.println("Virus neutralizado");
		}
		else
			System.out.println("Virus no neutralizado");
	}
	
	public String toString() {
		String cadena="Informacion del virus:\n";
		cadena += "Nombre: " + this.nombre + "\n";
		cadena += "ADN: " + this.adn + "\n";
		cadena += "Nocivo:" + this.nocivo;
		return cadena;
	}
}
