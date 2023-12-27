package ejemploSumaMatriz;
import java.util.Random;

public class Matriz {
	// ATRIBUTOS
	private double[][] matriz;
	private int filas, columnas;
	private double sumaMatParciales;
	
	// CONNSTRUCTOR
	public Matriz(int f, int c) {
		this.filas = f;
		this.columnas = c;
		this.matriz = new double[f][c];
		this.sumaMatParciales = 0;
	}
	
	//GETTERS Y SETTERS
	public int getFilas() {
		return this.filas;
	}
	public int getColumnas() {
		return this.columnas;
	}	
	public double getSumaM() {
		return this.sumaMatParciales;
	}	
	public void setSumaM(double sumaParcial) {
		this.sumaMatParciales += sumaParcial;
	}
	
	// METODOS
	public double obtenerElem(int i, int j) {
		return this.matriz[i][j];
	}
	public void cargarMatriz() {
		Random r = new Random();
		for(int i = 0; i < this.filas; i++) {
			for(int j = 0; j < this.columnas; j++) {
				this.matriz[i][j] = r.nextDouble();
			}
		}
	}
	public double sumar() {
		double resultado = 0;
		for(int i = 0; i < this.filas; i++) {
			for(int j = 0; j < this.columnas; j++) {
				resultado += this.matriz[i][j];
			}
		}
		return resultado;
	}
}
