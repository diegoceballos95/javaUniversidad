package ejercicioVideojuego;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		//SE CREA UN ARRALIST PARA GUARDAR JUEGOS:
		List<VideoJuego> listaVJ = new ArrayList<VideoJuego>();
		
		//SE CREAN 5 VIDEOJUEGOS:
		VideoJuego juego1 = new VideoJuego("Mario Bros", 100, "N64", 2, "Plataformas");
		VideoJuego juego2 = new VideoJuego("CS GO", 200, "PC", 32, "Disparos");
		VideoJuego juego3 = new VideoJuego("Zelda", 300, "NES", 1, "Aventura");
		VideoJuego juego4 = new VideoJuego("Nier", 400, "N64", 1, "RPG");
		VideoJuego juego5 = new VideoJuego("God of War", 500, "PS4", 1, "Accion");

		//SE GUARDAN LOS JUEGOS EN LA LISTA:
		listaVJ.add(juego1);
		listaVJ.add(juego2);
		listaVJ.add(juego3);
		listaVJ.add(juego4);
		listaVJ.add(juego5);
		
		//MUESTRA DE ALGUNOS DATOS:
		System.out.println("----- LISTA DE JUEGOS -----");
		for(VideoJuego juego: listaVJ) {
			System.out.println("[Nombre: " + juego.getTitulo() + 
					" - Consola: " + juego.getConsola() + 
					" - Cant. de jugadores: " + juego.getConsola() + "]");
		}
		
		//MODIFICACION DE DATOS:
		listaVJ.get(0).setTitulo("Mario Bros Wonder");
		listaVJ.get(0).setCantidadJugadores(4);
		listaVJ.get(4).setTitulo("God of War Ragnarok");
		listaVJ.get(4).setCantidadJugadores(2);
		
		//MUESTRO JUEGOS SOLAMENTE DE N64:
		System.out.println("\n----- LISTA DE JUEGOS DE N64-----");
		for(VideoJuego juego: listaVJ) {
			if(juego.getConsola().equals("N64")) {
				System.out.println(juego.toString());
			}
		}	
		
	}
}
