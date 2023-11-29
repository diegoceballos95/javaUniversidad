package ej4comercioCajasReg;
import java.util.ArrayList;

public class CajaRegistradora {
	//ATRIBUTOS
	private ArrayList<Double> ventas;
		
	//CONSTRUCTOR
	CajaRegistradora (){
		this.ventas = new ArrayList<Double>();
	}
		
	//METODOS
	public void nuevaVenta(double venta) {
		this.ventas.add(venta);
	}
	public double recaudacion() {
		double suma = 0;
		for(int i=0; i<this.ventas.size(); i++) {
			suma += this.ventas.get(i).doubleValue();
		}
		return suma;
	}
	
}
