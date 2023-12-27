package grafoDirigido;

import java.util.ArrayList;

public class GrafoD extends AbsGrafoD {
	public GrafoD(int ordenGrafo) {
		super(ordenGrafo);
	}

	@Override
	public void cargarGrafo(ArrayList<String[]> data){
		double currCost;		
		
		for (int i=0; i<getOrden();i++){
			String[]info = data.get(i);
			int k=0;
			for (int j=0;j<getOrden();j++){
				if (i!=j){
					currCost=Integer.parseInt(info[k]);
					if (currCost!=-1){
						this.matrizCosto.actualizar(currCost, i, j);	
					}else{
						this.matrizCosto.actualizar(infinito, i, j);
					}
					k++;
				}else{
					this.matrizCosto.actualizar(infinito, i, j);
					k++;
				}
			}
		}
	}
}

