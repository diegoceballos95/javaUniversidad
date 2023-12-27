package modelo2Parcial;
import java.util.ArrayList;
import java.util.Random;

public class ListaCanciones {
	//ATRIBUTOS
	private ArrayList<Cancion> listaCanciones;
	
	ListaCanciones(){
		this.listaCanciones = new ArrayList <Cancion>();
	}
	
	public Cancion getCancion(int i) {
		return this.listaCanciones.get(i);
	}
	public int getCantCanciones() {
		return this.listaCanciones.size();
	}
	public void agregarCancion(Cancion c) {
		this.listaCanciones.add(c);
	}
	public void removerCancion(Cancion cancion) {
		this.listaCanciones.remove(cancion);
	}
	public int pertenece(Cancion cancion) {
		return this.listaCanciones.indexOf(cancion);
	}
	
	public void reproduccionSecuencial() {
		for(Cancion cancion: this.listaCanciones) {
			cancion.play();
		}
	}
	public void reproduccionAleatoria() {
		Random random = new Random();
		int i = 0;
		while(i < getCantCanciones()) {
			int pistaNum = random.nextInt((getCantCanciones()-1)-0+1)+0;
			if(!getCancion(pistaNum).getFueReproducida()) {
				getCancion(pistaNum).play();
				getCancion(pistaNum).setFueReproducida(true);
				i++;
			}
		}
	}
	public void reproduccionPorGenrero(String genero) {
		for(Cancion cancion: this.listaCanciones) {
			if(cancion.getGenero().equals(genero)) {
				cancion.play();
			}
		}
	}
}
