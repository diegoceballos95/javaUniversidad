package equipoArrayList;
import java.util.ArrayList;

public class Equipo {
	//ATRIIBUTOS
	private ArrayList<Jugador> equipo;
	
	//CONSTRUCTORES
	public Equipo() {
		this.equipo = new ArrayList<Jugador>();
	}
	
	//METODOS
	public void agregarJugador(Jugador player) {
		if (equipo.size() <= 10)
			equipo.add(player);
		else
			System.out.println("EQUIPO LLENO - NO SE PUEDE AGREGAR AL JUGADOR");
	}
	
	public void eliminarJugador(Jugador player) {
		if (equipo.size() > 0)
			equipo.remove(player);
		else
			System.out.println("EQUIPO VACIO - NO SE PUEDEN QUITAR JUGADORES");
	}
	
	public String toString() {
		String cadena = "LISTA DE JUGADORES DEL EQUIPO";
		for(int i = 0; i < equipo.size(); i++) {
			cadena += equipo.get(i);
		}
		return cadena;
	}
}
