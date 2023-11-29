package conceptosBasico;

public class Matriz2 {
	public static void main(String[] args) {

	    int[][] matriz={  {32, 87, 3, 589},
	                    {12, -30, 190, 0},
	                    {622, 127, 981, -3, -5}};
	    int numero=12;
	    int i=0, j=0;

	    buscado:
	        for(i=0; i<matriz.length; i++){
	            for(j=0; j<matriz[i].length; j++){
	                if(matriz[i][j]==numero){
	                    break buscado;
	                }
	            }
	        }
	    System.out.println("buscado: matriz("+ i+", "+j+")="+matriz[i][j]);
	}
}
