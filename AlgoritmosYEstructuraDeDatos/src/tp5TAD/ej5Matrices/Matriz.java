package tp5TAD.ej5Matrices;
import java.util.Random;

public class Matriz implements Operaciones {

	private int[][] matriz;
	
	Matriz(int f, int c){
		crearMatriz(f, c);;
	}
	
	public int getElem(int i, int j) {
		return this.matriz[i][j];
	}
	public void setElem(int i, int j, int elem) {
		this.matriz[i][j] = elem;
	}
	public int cantFilas() {
		return this.matriz.length;
	}
	public int cantCol() {
		return this.matriz[0].length;
	}
	
	//METODOS DE INTERFAZ
	@Override
	public void crearMatriz(Object m, Object n) {
		Integer f = (Integer)m;
		Integer c = (Integer)n;
		this.matriz = new int[f][c];
		Random random = new Random();
		for(int i=0; i<this.matriz.length; i++) {
			for(int j=0; j<this.matriz[i].length; j++) {
				this.matriz[i][j] =  random.nextInt(10-1+1)+1;
			}
		}
	}
	@Override
	public Matriz productoX1Escalar(Object escalar) {
		Integer esc = (Integer)escalar;
		Matriz m1 = new Matriz(cantFilas(), cantCol());
		for(int i=0; i<cantFilas(); i++) {
			for(int j=0; j<cantCol(); j++) {
				m1.setElem(i, j, this.matriz[i][j] * esc);
			}
		}
		return m1;
	}
	
	//METODOS
	public Matriz transpuesta() {
		Matriz m1 = new Matriz(cantFilas(), cantCol());
		for(int i=0; i<cantFilas(); i++) {
			for(int j=0; j<cantCol(); j++) {
				m1.setElem(i, j, this.matriz[j][i]);
			}
		}
		return m1;
	}
	@Override
	public String toString() {
		String cadena = "**** Matriz *****\n";
		for(int[] elementos: this.matriz) {
			for(int elemento: elementos) {
				cadena += elemento + "\t";
			}
			cadena += "\n";
		}
		return cadena;
	}
}
