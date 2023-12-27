package modelo2Parcial;

public class ReproductorMusica {

	public static void main(String[] args) {
		
		ListaCanciones lista1 = new ListaCanciones();
		Cancion c1 = new Cancion("amame","cumbia");
		Cancion c2 = new Cancion("mas alla","romantico");
		Cancion c3 = new Cancion("love me","pop");
		Cancion c4 = new Cancion("titanic","romantico");
		Cancion c5 = new Cancion("november rain","rock");
		Cancion c6 = new Cancion("cazame","trap");
		Cancion c7 = new Cancion("waltz 23","clasica");
		Cancion c8 = new Cancion("el humo de este fasito","cumbia");
		Cancion c9 = new Cancion("i found you","romantico");
		Cancion c10 = new Cancion("alla torca","clasica");
		lista1.agregarCancion(c1);
		lista1.agregarCancion(c2);
		lista1.agregarCancion(c3);
		lista1.agregarCancion(c4);
		lista1.agregarCancion(c5);
		lista1.agregarCancion(c6);
		lista1.agregarCancion(c7);
		lista1.agregarCancion(c8);
		lista1.agregarCancion(c9);
		lista1.agregarCancion(c10);
		
		System.out.println("----- REPRODUCCION SECUENCIAL -----");
		lista1.reproduccionSecuencial();
		System.out.println("\n----- REPRODUCCION ALEATORIA -----");
		lista1.reproduccionAleatoria();
		System.out.println("\n----- REPRODUCCION POR GENERO -----");
		lista1.reproduccionPorGenrero("cumbia");
	}

}
