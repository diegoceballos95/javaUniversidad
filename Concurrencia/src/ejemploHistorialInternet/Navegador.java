package ejemploHistorialInternet;

public class Navegador extends Thread{
	String url;
	Historial historial;
	
	public Navegador(String u, Historial h){
		this.url = u;
		this.historial = h;
	}
	
	public void run(){
		for(int i= 0; i<100; i++){
			this.historial.agregar(this.url);
		}
	}
}