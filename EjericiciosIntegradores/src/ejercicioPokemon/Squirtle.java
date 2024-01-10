package ejercicioPokemon;

public class Squirtle extends Pokemon implements IAgua{
	
	public Squirtle() {
		super();
	}
	
	@Override
	protected void atacarPlacaje() {
		System.out.println("Soy Squirtle y estoy atacando  con  placaje");	
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Soy Squirtle y estoy atacando  con  arañazo");	
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Soy Squirtle y estoy atacando  con  mordisco");	
	}

	@Override
	public void atacarHidrobomba() {
		System.out.println("Soy Squirtle y estoy atacando  con  hidrobomba");	
	}

	@Override
	public void atacarPistolaAgua() {
		System.out.println("Soy Squirtle y estoy atacando  con  pistola de agua");	
	}

	@Override
	public void atacarBurbuja() {
		System.out.println("Soy Squirtle y estoy atacando  con  burbuja");	
	}

	@Override
	public void atacarHidropulso() {
		System.out.println("Soy Squirtle y estoy atacando  con  hidropulso");	
	}
}
