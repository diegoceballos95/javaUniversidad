package ej4matriz;
import java.util.Random;

public class Matriz {

	private double[][] matriz;
	
	Matriz(int filas, int columnas){
		this.matriz = new double[filas][columnas];
	}
	public void cargar() {
		Random random = new Random();
		for(int i=0; i<getCantFil(); i++) {
			for(int j=0; j<getCantCol(); j++) {
				setElem(i, j, random.nextDouble(5-0+1)+0);
			}
		}
	}
	public int getCantFil() {
		return this.matriz.length;
	}
	public int getCantCol() {
		return this.matriz[0].length;
	}
	public double getElem(int f, int c) {
		return this.matriz[f][c];
	}
	public void setElem(int f, int c, double elemento) {
		this.matriz[f][c] = elemento;
	}
	
	public void copy(Matriz m) {
		for(int i=0; i<getCantFil(); i++) {
			for(int j=0; j<getCantCol(); j++) {
				this.matriz[i][j] = m.getElem(i, j);
			}
		}
	}
	public Matriz clone() {
		Matriz clonado = new Matriz(getCantFil(), getCantCol());
		for(int i=0; i<getCantFil(); i++) {
			for(int j=0; j<getCantCol(); j++) {
				clonado.setElem(i, j, getElem(i, j));
			}
		}
		return clonado;
	}
	public boolean existePos(int f, int c) {
		if (f >= 0 && c >= 0 && f < getCantFil() && c < getCantCol()){
			return true;
		}
		else {
			return false;
		}
	}
	public boolean equals(Matriz m) {
		for(int i=0; i<getCantFil(); i++) {
			for(int j=0; j<getCantCol(); j++) {
				if(this.matriz[i][j] != m.getElem(i, j)) {
					return false;
				}
			}
		}
		return true;
	}
	public boolean esCuadrada() {
		if(getCantFil() == getCantCol()) {return true;}
		else {return false;}
	}
	public boolean esIdentidad() {
		if(esCuadrada()) {
			for(int i=0; i<getCantFil(); i++) {
				if(this.matriz[i][i] != 1) {
					return false;
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
	public boolean esTriangSup() {
		if(esCuadrada()) {
			for(int i=1; i<getCantFil(); i++) {
				for(int j=0; j<i; j++) {
					if(this.matriz[i][j] != 0) {
						return false;
					}
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
	public boolean esTriangInf() {
		if(esCuadrada()) {
			for(int i=0; i<getCantFil()-1; i++) {
				for(int j=i+1; j<getCantCol(); j++) {
					if(this.matriz[i][j] != 0) {
						return false;
					}
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
	public boolean esSimetrica() {
		if(esCuadrada()) {
			for(int i=0; i<getCantFil()-1; i++) {
				for(int j=i+1; j<getCantCol(); j++) {
					if(this.matriz[i][j] != this.matriz[j][i]) {
						return false;
					}
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
	public boolean esRala() {
		int contCeros = 0;
		int contDistCero = 0;
		for(double[] elementos: this.matriz) {
			for(double elemento: elementos) {
				if(elemento == 0) {contCeros++;}
				else {contDistCero++;}
			} 
		}
		if(contCeros > contDistCero) {return true;}
		else {return false;}
	}
	public int cantElem() {
		return (getCantFil() * getCantCol());
	}
	public boolean estaElem(double elem) {
		for(double[] elementos: this.matriz) {
			for(double elemento: elementos) {
				if(elemento == elem) {return true;}
			} 
		}
		return false;
	}
	public double[] vectorMayores() {
		double[] vector = new double[getCantFil()];
		double mayor;
		for(int i=0; i<getCantFil(); i++) {
			mayor = this.matriz[i][0];
			for(int j=1; j<getCantCol(); j++) {
				if(this.matriz[i][j] > mayor) {
					mayor = this.matriz[i][j];
				}
			}
			vector[i] = mayor;
		}
		return vector;
	}
	public Matriz suma(Matriz m) {
		Matriz suma = new Matriz(getCantFil(), getCantCol());
		for(int i=0; i<getCantFil(); i++) {
			for(int j=0; j<getCantCol(); j++) {
				suma.setElem(i, j, this.matriz[i][j] + m.getElem(i, j));
			}
		}
		return suma;
	}
	public Matriz producto(Matriz m) {
		Matriz producto = new Matriz(getCantFil(), m.getCantCol());
		double sumaFactor;
		for(int i=0; i<getCantFil(); i++) {
			for(int j=0; j<m.getCantCol(); j++) {
				sumaFactor = 0;
				for(int k=0; k<getCantCol(); k++) {
					sumaFactor += this.matriz[i][k] * m.getElem(k, j);
				}
				producto.setElem(i, j, sumaFactor);
			}
		}
		return producto;
	}
	public Matriz productoX1Escalar(double k) {
		Matriz productoEscalar = new Matriz(getCantFil(), getCantCol());
		for(int i=0; i<getCantFil(); i++) {
			for(int j=0; j<getCantCol(); j++) {
				productoEscalar.setElem(i, j, this.matriz[i][j] * k);
			}
		}
		return productoEscalar;
	}
	public String toString() {
		String cadena = "******** Matriz ********\n";
		for(double [] elementos: this.matriz) {
			for(double elemento: elementos) {
				cadena += elemento + "\t";
			}
		cadena += "\n";
		}
		return cadena;
	}
}
