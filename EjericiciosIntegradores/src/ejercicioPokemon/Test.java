package ejercicioPokemon;

public class Test {

	public static void main(String[] args) {
		
	       Squirtle squirtle = new Squirtle ();
	       Charmander charmander = new Charmander ();
	       Bulbasaur bulbasur = new Bulbasaur ();
	       Pikachu pika = new Pikachu();
	       
	       squirtle.atacarAraniazo();
	       squirtle.atacarHidrobomba();
	       charmander.atacarAraniazo();
	       charmander.atacarLanzallamas();
	       bulbasur.atacarAraniazo();
	       bulbasur.atacarDrenaje();
	       pika.atacarAraniazo();
	       pika.atacarImpactrueno();
	       System.out.println("Ataques EXITOSOS!!!");
	}
}
