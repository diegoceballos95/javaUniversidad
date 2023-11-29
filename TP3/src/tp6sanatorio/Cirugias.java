package tp6sanatorio;
import java.util.ArrayList;
import java.util.Collections;

public class Cirugias {
	//ATRIBUTOS
	private ArrayList<Cirugia> cirugias;
	private int cantidad;
	
	//CONSTRUCTOR
	public Cirugias() {
		this.cirugias = new ArrayList<Cirugia>();
		this.cantidad = 0;
	}

	//GETTERS
	public Cirugia getCirugia(int i) {
		return this.cirugias.get(i);
	}
	public int getCantidad() {
		return cantidad;
	}

	//METODOS
	public String toString() {
		String cadena = "*****Datos de cirugias *****\n";
		for(int i=0; i<getCantidad(); i++) {
			cadena += "\nCIRUGIA NUMERO " + (i+1) + "\n";
			cadena += "* Cirugia: " + this.cirugias.get(i).getNombre() + "\n";
			cadena += "* Prestacion: " + this.cirugias.get(i).getdPrestacion() + "\n";
			cadena += "* Fecha realizacion: " + this.cirugias.get(i).getFchRealizacion() + "\n";
			cadena += "* Duracion: " + this.cirugias.get(i).getMinutosDuracion()+ " minutos\n";
			cadena += "* Cirugia: " + this.cirugias.get(i).getPaciente().getObraSocial().getDenominacion() + "\n";
		}
		return cadena;
	}
	
	// ****************************** ORDENAMIENTOS ****************************
	public void insertarCirugia(Cirugia cirugia) {
		this.cirugias.add(cirugia);
		Collections.sort(this.cirugias, new OrdenamientoPorFchRealizacion());
		this.cantidad++;
	}
	public void ordenarCirugPorNom() {
		Collections.sort(this.cirugias , new OrdenamientoPorNombre());
	}
	
	public void ordenarPorPrecioPrestacion() {
		Collections.sort(this.cirugias, new OrdenamientoPorPrestacion());
	}
	// *************************************************************************
	
	public void eliminarCirugia(String osocial) {
		int i = 0;
		while(i<getCantidad()) {
			if(osocial.equals(getCirugia(i).getPaciente().getObraSocial().getDenominacion())) {
				this.cirugias.remove(i);
				this.cantidad--;
			}
			else{
				i++;
			}
		}
	}
	public double promedioDuracion() {
		double suma = 0;
		for (Cirugia cirugia: this.cirugias) {
			suma += cirugia.getMinutosDuracion();
		}
		return (suma/this.cantidad);
	}
	public double promedioDuracion(Fecha desde, Fecha hasta) {
		double suma = 0;
		double contador = 0;
		for (Cirugia cirugia: this.cirugias) {
			if (desde.toString().compareTo(cirugia.getFchRealizacion().toString()) < 0) {
				if(hasta.toString().compareTo(cirugia.getFchRealizacion().toString()) > 0) {
					suma += cirugia.getMinutosDuracion();
					contador++;
				}
			}
		}
		return (suma/contador);
	}
	public double promedioDuracion(int edad) {
		double suma = 0;
		double contador = 0;
		for (Cirugia cirugia: this.cirugias) {
			if(cirugia.getPaciente().edadPersona() > edad) {
				suma += cirugia.getMinutosDuracion();
				contador++;
			}
		}
		return (suma/contador);
	}
	public Cirugias cirugiasPrestador(String nombre) {
		Cirugias cirugRealizPrestador = new Cirugias();
		for (Cirugia cirugia: this.cirugias) {
			if(nombre == cirugia.getPrestador().getNombre()) {
				cirugRealizPrestador.insertarCirugia(cirugia);
			}
		}
		return cirugRealizPrestador;
	}
	public Cirugias cirugiasOS(String obraSocial) {
		Cirugias cirugPorOS = new Cirugias();
		for (Cirugia cirugia: this.cirugias) {
			if(obraSocial == cirugia.getPaciente().getObraSocial().getDenominacion()) {
				cirugPorOS.insertarCirugia(cirugia);
			}
		}
		return cirugPorOS;
	}
	public Cirugias cantCirugPaciente(Paciente p) {
		Cirugias cirugAlPac = new Cirugias();
		for (Cirugia cirugia: this.cirugias) {
			if(p.equals(cirugia.getPaciente())) {
				cirugAlPac.insertarCirugia(cirugia);
			}
		}
		return cirugAlPac;
	}
	
}
