package excepciones;

import java.util.Random;

class Clase {
	  public void ejecutaAlgo() throws MiExcepcion {

	    Random aleatorio = new Random();
	    int numero = aleatorio.nextInt(5);
	    System.out.println("el numero generado es " + numero);

	    if (numero == 0)
	      throw new MiExcepcion("se ha generado un cero");
	      
	    if (numero == 4)
	      throw new MiExcepcion("se ha generado un cuatro");
	  }
}