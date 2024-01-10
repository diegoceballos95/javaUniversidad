package ejercicioPokemon;

public abstract class Pokemon {
	//ATRIUTOS
	protected int num_pokedex;
	protected String nombrePokemon;
	protected double pesoPokemon;
	protected String sexo;
	protected int temporada;
	
	//METODOS ABSTRACTOS
	protected abstract void atacarPlacaje();
	protected abstract void atacarAraniazo();
	protected abstract void atacarMordisco();
}