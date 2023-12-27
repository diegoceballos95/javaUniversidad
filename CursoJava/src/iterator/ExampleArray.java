package iterator;

import java.util.Arrays;
import java.util.Iterator;

public class ExampleArray {

  public static void main(String[] args) {
    // CREAMOS UN ARREGLO DE ENTEROS
    int[] numbers = {1, 2, 3, 4, 5};

    // OBTENEMOS UN OBJETO ITERATOR PARA EL ARREGLO
    Iterator<Integer> iterator = Arrays.stream(numbers).iterator();

    // RECORREMOS EL ARREGLO
    while (iterator.hasNext()) {
      // OOTENEMOS EL SIGUIENTE ELEMNTO DEL ARRAY
      int number = iterator.next();

      // IMPRIMIR
      System.out.println(number);
    }
  }
}