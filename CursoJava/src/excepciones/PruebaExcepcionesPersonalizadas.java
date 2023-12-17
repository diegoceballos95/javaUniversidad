package excepciones;

import java.util.Random;

public class PruebaExcepcionesPersonalizadas {
  public static void main(String[] args) {

    Clase p = new Clase();
    
    try {
      for (int i = 1; i <= 5; i++)
        p.ejecutaAlgo();
    }
    catch (MiExcepcion miex) {
      System.out.println(miex);
      System.out.println(miex.getMessage());
    }
  }
}

