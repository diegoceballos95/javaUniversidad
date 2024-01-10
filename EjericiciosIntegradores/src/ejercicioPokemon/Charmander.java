package ejercicioPokemon;

public class Charmander extends Pokemon implements IFuego{
	
	public Charmander() {
		super();
	}
	
	@Override
	protected void atacarPlacaje() {
		System.out.println("Soy Charmander y estoy atacando  con  placaje");	
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Soy Charmander y estoy atacando  con  arañazo");	
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Soy Charmander y estoy atacando  con  mordisco");	
	}

	@Override
	public void tacarPunioFuego() {
		System.out.println("Soy Charmander y estoy atacando  con  punio fuego");	
	}

	@Override
	public void atacarAscuas() {
		System.out.println("Soy Charmander y estoy atacando  con  ascuas");	
	}

	@Override
	public void atacarLanzallamas() {
		System.out.println("Soy Charmander y estoy atacando  con  lanzallamas");	
	}
}
