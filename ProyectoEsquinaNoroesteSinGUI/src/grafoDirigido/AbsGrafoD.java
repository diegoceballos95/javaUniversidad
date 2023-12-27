package grafoDirigido;
//import java.util.Scanner;
import java.util.ArrayList;
import contenedores.*;
import recursos.*;

public abstract class AbsGrafoD extends AbsGrafo implements OperacionesGD{
	
	protected MatrizGrafo matrizCostoF,matrizCaminoF;
	protected ListaDoubleLinkedL listaDistancia, listaCamino, listaSolucion;

	public AbsGrafoD(int ordenGrafo){
		super(ordenGrafo);
	}
	
	public MatrizGrafo getMatrizCostoF() {
		return this.matrizCostoF;
	}
		
	public abstract void cargarGrafo(ArrayList<String[]> data);
	
	public void muestraGrafo(){
		double currCost;
		for (int i=0; i<getOrden();i++){
			for (int j=0; j<getOrden();j++){
				if (i!=j){
					currCost=(double)this.matrizCosto.devolver(i, j);
					if (currCost!=infinito){
						System.out.println("Costo " + i + " a " + j + " -> " + currCost);
					}				
				}
			}			
		}		
	}
	
	/******************************** FLOYD ****************************************/
	
	@SuppressWarnings("removal")
	public void aplicarFloyd(){
		//INICIALIZO MATRICES Y CREO COPIA DE MATRIZ ADYACENCIA EN COSTOFLOYD
		this.matrizCaminoF=new MatrizGrafo(this.ordenGrafo);
		this.matrizCostoF=new MatrizGrafo(this.ordenGrafo);
		double costoF;
		for(int i=0;i<ordenGrafo;i++){
			matrizCostoF.actualizar((double)0, i, i);}	
		for(int i=0;i<ordenGrafo;i++){
			for(int j=0;j<ordenGrafo;j++){
				if(i!=j){
					costoF=(double)matrizCosto.devolver(i, j);
					matrizCostoF.actualizar(costoF, i, j);
				}
			}
		}		
		//RECORRO FIL Y COL CON NODO INTERMEDIO "K":
		Object costo;
		for(int k=0;k<ordenGrafo;k++){
			for(int i=0;i<ordenGrafo;i++){
				for(int j=0;j<ordenGrafo;j++){				
					//SI HALLO MEJORES COSTOS, ACTUALIZO LISTAS:
					if(((Double)matrizCostoF.devolver(i, k)).doubleValue() + 
						((Double)matrizCostoF.devolver(k, j)).doubleValue() 
						< ((Double)matrizCostoF.devolver(i, j)).doubleValue()){
						
						costo=new Double(((Double)matrizCostoF.devolver(i, k)).doubleValue()
								+ ((Double)matrizCostoF.devolver(k, j)).doubleValue());
						matrizCostoF.actualizar(costo, i, j);
						matrizCaminoF.actualizar(new Integer(k), i, j);//P/OBTENER CAMINO DE FLOYD
					}
				}
			}
		}
	}
	
}

