package tp6ContLin1.ej4TADColaArray;
import tp6ContLin1.ej1interfazContenedorMetodos.*;

public class ColaArray implements Contenedor{
	//ATRIBUTOS
	private Object[] cola;
	private int finalC, frenteC;
	private int tamCola;
	
	//CONSTRUCTOR
	public ColaArray(int tamCola) {
		this.tamCola = tamCola;
		this.cola = new Object[this.tamCola];
		limpiar(); 
	}

	//METODOS INTERFAZ
	@Override
	public void limpiar() {
		this.finalC = this.frenteC = tamCola - 1;
	}
	@Override
	public void meter(Object elemento) {
		if (!estaLlena()) {
			if (this.finalC == this.tamCola - 1){
				this.finalC = 0;
			}else{
				incrementaFinal(); 
			}
			this.cola[this.finalC] = elemento;
		} else {
				System.out.println("Error. Cola llena...");
			}
	}
	@Override
	public Object sacar() {
		Object elemento = null;
		if (!estaVacia()){
			if (this.frenteC == this.tamCola - 1){
				this.frenteC = 0;
			}else{
				incrementaFrente();
			}
			elemento = this.cola[this.frenteC];
		} else {
			System.out.println("Error. Cola vacia...");
		}
		return elemento;
	}
	@Override
	public boolean estaVacia() {
		return this.finalC == this.frenteC;
	}

	//METODOS
	public boolean estaLlena() {
		int p;
		if (this.finalC == this.tamCola - 1){
			p = 0;
		}else{
			p = this.finalC + 1;
		}
		return (p == this.frenteC);
	}
	private void incrementaFinal() { 
		this.finalC++; 
		}
	private void incrementaFrente() { 
		this.frenteC++; 
		}	
}
 