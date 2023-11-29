package ej3fotoEstrellas;

public class TablaEstrellas {

	//ATRIBUTOS
	private char [][] tablaEstrellas;
	
	//CONSTRUCTOR
	TablaEstrellas(int i, int j){
		this.tablaEstrellas = new char[i][j];
		cargarTabla();
	}
	
	//METODOS
	
	public void cargarTabla() {
		for(int i=0; i<this.tablaEstrellas.length; i++) {
			for(int j=0; j<this.tablaEstrellas[i].length; j++) {
				this.tablaEstrellas[i][j] = ' ';
			}
		}
	}
	
	public void buscarEstrellas(TablaFotografia valores) {
		for(int i=1; i<valores.cantFilas()-1; i++) {
			for(int j=1; j<valores.cantColumnas()-1; j++) {
				if(valores.verificarPunto(i, j)) {
					this.tablaEstrellas [i][j] = '*';
				}
			}
			
		}
	}
	
	public String toString() {
		String cadena = "******** Matriz de Estrllas Halladas ********\n";
		for(char [] puntos: this.tablaEstrellas) {
			for(char punto: puntos) {
				cadena += "|" + punto + "\t";
			}
		cadena += "\n----------------------------------------------------------------\n";
		}
		return cadena;
	}
		
		
}

