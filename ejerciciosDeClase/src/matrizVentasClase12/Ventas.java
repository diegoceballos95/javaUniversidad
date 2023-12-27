package matrizVentasClase12;
import java.util.Random;

public class Ventas {
	//ATRIBUTOS
	private int[][] ventas;
	//CONSTRUCTOR
	Ventas(int filas, int columnas){
		this.ventas = new int[filas][columnas];
		cargarVentas();
	}
	//METODOS
	public double getVenta(int i, int j) {
		return this.ventas[i][j];
	}
	public void cargarVentas() {
		Random random = new Random();
		for(int i=0; i<this.ventas.length; i++) {
			for(int j=0; j<this.ventas[i].length; j++) {
				this.ventas[i][j] = random.nextInt(10)+0;
			}
		}
	}
	public void mostrarVentas() {
		for(int[] ventaMes: this.ventas) {
			for(int venta: ventaMes) {
				System.out.print(venta + "\t");
			}
		System.out.println("");
		}
	}
	public int ventatTotalVendedor(int vendedor) {
		int vtaTotal = 0;
		for(int i=0, j=vendedor-1; i<this.ventas.length; i++) {
			vtaTotal += this.ventas[i][j];
		}
		return vtaTotal;
	}
	public int ventatTotalDosMeses(int parMes) {
		//parMes PUEDE SER 0,1,2,3,4,5
		int vtaTotal = 0;
		for(int i=parMes, j=0; j<this.ventas[parMes].length; j++) {
			vtaTotal += this.ventas[i][j];
		}
		return vtaTotal;
	}
	public int ventaTotalAnio() {
		int vtaTotal = 0;
		for(int[] ventaMes: this.ventas){
			for(int venta: ventaMes) {
				vtaTotal += venta;
			}
		}
		return vtaTotal;
	}
	public String toString() {
		String cadena = "";
		return cadena;
	}
}
