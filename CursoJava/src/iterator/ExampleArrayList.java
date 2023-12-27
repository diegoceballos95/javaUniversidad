package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleArrayList {

  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Juan");
    names.add("Pedro");
    names.add("María");

    // OBTENEMOS UN OBJETO ITERATOR PARA LA COLECCIÓN
    Iterator<String> iterator = names.iterator();

    // RECORREMOS LA COLECCION
    while (iterator.hasNext()) {
      // OBTENEMOS EL SIGUIENTE ELEMENTO DE LA COLECCIÓN
      String name = iterator.next();

      // IMPRIMIR ELEMENTO
      System.out.println(name);
    }
  }
}