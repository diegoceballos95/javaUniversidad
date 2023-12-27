package ejemploSumaMatriz;

public class MatrizParcial extends Thread{
	
	// ATRIBUTOS
	private Matriz matriz;
	private int columnaIni, columnaFin;
	private double sumaParcial;
	
	// CONSTRUCTOR
	public MatrizParcial(Matriz matriz, int columnaIni, int columnaFin) {
		this.matriz = matriz;
		this.columnaIni = columnaIni;
		this.columnaFin = columnaFin;
		this.sumaParcial = 0;
	}
	
	// GETTERS
	public double getSumaParcial() {
		return this.sumaParcial;
	}
	
	// METODOS
	public void run() {
		for(int j = columnaIni; j < this.columnaFin; j++) {
			for(int i = 0; i < this.matriz.getFilas(); i++) {
				this.sumaParcial += this.matriz.obtenerElem(i, j);
			}
		}
		matriz.setSumaM(this.sumaParcial);
		System.out.println("HILO FINALIZADO con suma parcial de " + this.sumaParcial);
	}

}
