package ej1.tarifaProgramador;
import java.util.ArrayList;

public class EscalaDeSueldos {
	//ATRIBUTOS
	private double[][] tabla; 
	//CONSTRUCTOR
	EscalaDeSueldos(){
		this.tabla = new double[][] {
			{28.16, 32.18, 38.89, 44.92, 48.27},
			{54.98, 59.67, 64.37, 70.40, 75.09},
			{91.19, 97.89, 101.91, 108.21, 115.32},
			{134.10, 160.91, 187.73, 214.77, 268.16}
			};
	}
	//METODOS
	public double pagaPromedioGrado(int grado) {
		double prom = 0;
		for(int i=grado, j=0; j<this.tabla[i].length; j++) {
			prom += this.tabla[i][j];
			}
		prom /= this.tabla[grado].length; 
		return prom;
	}
	public double diferenciaMayorMenorPaga(int grado) {
		return (this.tabla[grado][this.tabla[grado].length - 1] - this.tabla[grado][0]);
	}
	public void aumentarSueldo (double aumentoPorcentaje, int etapa) {
		for(int i=0, j=etapa; i<this.tabla.length; i++) {
			this.tabla[i][j] *=  (1+(aumentoPorcentaje/100));
		}
	}
	public String toString() {
		String cadena = "*** Matriz ***\n";
		cadena += "Filas representan GRADOS\nColumnas representan NIVEL\n\n";
		for(double [] sueldos: this.tabla) {
			for(double sueldo: sueldos) {
				cadena += sueldo + "\t";
			}
		cadena += "\n";
		}
		return cadena;
	}
	
}
