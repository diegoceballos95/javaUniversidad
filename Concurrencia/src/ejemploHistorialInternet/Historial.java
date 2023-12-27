package ejemploHistorialInternet;

public class Historial {
	
	private String[] historial = new String[10000];
	private int index = 0;
	
	public int getIndex() {
		return this.index;
	}
	
	public String getElemento(int i){
		return this.historial[i];
	}
	
	public void agregar(String url){
		this.historial[index]= url;
		this.index++;
	}
}