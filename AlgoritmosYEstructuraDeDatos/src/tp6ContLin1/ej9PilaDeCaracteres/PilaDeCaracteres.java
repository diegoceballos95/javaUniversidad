package tp6ContLin1.ej9PilaDeCaracteres;
import tp6ContLin1.ej5TADPilaLEnlazada.PilaLEnlazada;
import tp6ContLin1.ej3Nodo.Nodo;

public class PilaDeCaracteres extends PilaLEnlazada{
	//CONSTRUCTOR
	PilaDeCaracteres(){
		super();
	}
	
	//METODOS
	public boolean estaBalanceada() {
		invertir();
		int contParentAbiertos = 0;
		int contParentCerrados = 0;
		Nodo aux = this.pila;
		while(aux != null) {
			if(aux.getNodoInfo().equals('(')) {
				contParentAbiertos++;
			}
			else {
				if(aux.getNodoInfo().equals(')')) {
					contParentCerrados++;
					if(!ordenCorrecto(contParentAbiertos, contParentCerrados)) {
						System.out.println(" Error de orden");
						invertir();
						return false;
					}
				}
			}
			aux = aux.getNextNodo();
		}
		if(contParentAbiertos == contParentCerrados) {
			invertir();
			return true;
		}
		else {
			System.out.println(" Error de cantidad");
			invertir();
			return false;
		}
	}
	private boolean ordenCorrecto(int pAbiertos, int pCerrados) {
		return (pAbiertos >= pCerrados);
	}
	
	public void muestraComoCadena(){
		invertir();
		Nodo temp;
		if (!estaVacia()){
			temp = this.pila;
			while (temp != null){
				System.out.print(temp.getNodoInfo().toString());
				temp = temp.getNextNodo();
			}
		}
		else{ System.out.println("Error muestra. Pila vacia");}
		invertir();
	}
	
	public void invertir() {
		PilaDeCaracteres pilaInvertida= new PilaDeCaracteres();
		Object caracter = null;
		while(!super.estaVacia()) {
			caracter = super.sacar();
			pilaInvertida.meter(caracter);
		}
		this.pila = pilaInvertida.pila;
	}
}
