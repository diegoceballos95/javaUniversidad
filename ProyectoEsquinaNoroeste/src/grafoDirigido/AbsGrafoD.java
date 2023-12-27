package grafoDirigido;

import java.util.ArrayList;
import contenedores.*;


public abstract class AbsGrafoD extends AbsGrafo{
	
	protected MatrizGrafo matrizCostoF;
	/*protected Double[][] matrizNoroeste, matrizResultado, matrizNoroesteAux;
	protected int[] vectorOrigen, vectorDestino;
	protected ArrayList<Double> vectorOfertas, vectorDemandas;
	protected int cantOrigenes, cantDestinos,cantDemandas,cantOfertas;*/

	public AbsGrafoD(int ordenGrafo){
		super(ordenGrafo);
	}
		


	public abstract void cargarGrafo(ArrayList<String[]> data);
	
	public void muestraGrafo(){
		double currCost;
		for (int i=0; i<getOrden();i++){
			for (int j=0; j<getOrden();j++){
				if (i!=j){
					currCost=(double)this.matrizCosto.devolver(i, j);
					if (currCost!=infinito){
						System.out.println("costo " + i + " a " + j + "->" + currCost);
					}				
				}
			}			
		}		
	}
	
	public void armarMatrizCostosMinimos() {
		// Se arma la matriz de costo Floyd
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
		Object costo;
		for(int k=0;k<ordenGrafo;k++){
			for(int i=0;i<ordenGrafo;i++){
				for(int j=0;j<ordenGrafo;j++){
					if(((Double)matrizCostoF.devolver(i, k)).doubleValue()+((Double)matrizCostoF.devolver(k, j)).doubleValue()<((Double)matrizCostoF.devolver(i, j)).doubleValue()){
						costo=new Double(((Double)matrizCostoF.devolver(i, k)).doubleValue()+((Double)matrizCostoF.devolver(k, j)).doubleValue());
						matrizCostoF.actualizar(costo, i, j);
					}
				}
			}
		}
	}
	
	public MatrizGrafo getMatrizCostosMinimos() {
		armarMatrizCostosMinimos();
		return this.matrizCostoF;
	}
	
}

