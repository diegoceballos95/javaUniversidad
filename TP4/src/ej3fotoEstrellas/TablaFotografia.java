package ej3fotoEstrellas;
import java.util.Random;

public class TablaFotografia {

	//ATRIBUTOS
	private int[][] tablaValores; 
	
	//CONSTRUCTORES
	TablaFotografia(){
		this.tablaValores = new int[][] {
			{0,57,76,0,0,0,114,152},
			{95,247,114,0,0,0,38,57},
			{38,114,38,133,57,0,190,0},
			{0,0,76,255,76,19,152,0},
			{0,0,133,228,114,171,190,76},
			{95,0,114,190,114,76,152,0}
			};
	}
	TablaFotografia(int f, int c){
		this.tablaValores = new int[f][c];
		nuevaFotografia();
	}
	
	//METODOS
	
	public int cantFilas() {
		return this.tablaValores.length;
	}
	public int cantColumnas() {
		return this.tablaValores[0].length;
	}
	
	public void nuevaFotografia() {
		Random random = new Random();
		for(int i=0; i<this.tablaValores.length; i++) {
			for(int j=0; j<this.tablaValores[i].length; j++) {
				this.tablaValores[i][j] = random.nextInt(255 - 0 + 1) + 0;
			}
		}
	}
	
	public boolean verificarPunto(int i, int j) {
		if(this.tablaValores[i][j] + this.tablaValores[i-1][j] + this.tablaValores[i+1][j]
			+ this.tablaValores[i][j-1] + this.tablaValores[i][j+1]> 600) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		String cadena = "******** Matriz de Fotografia ********\n";
		for(int [] puntos: this.tablaValores) {
			for(int punto: puntos) {
				cadena += "|" + punto + "\t";
			}
		cadena += "\n----------------------------------------------------------------\n";
		}
		return cadena;
	}

}
