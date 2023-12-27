package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleRemove {

  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Juan");
    names.add("Pedro");
    names.add("María");

    // OBTENEMOS UN OBJETO ITERATOR PARA LA COLECCIÓN
    Iterator<String> iterator = names.iterator();

    // RECORREMOS LA COLECCIÓN
    while (iterator.hasNext()) {
      // OBTENEMOS EL SIGUIENTE ELEMENTO DE LA COLECCIÓN
      String name = iterator.next();

      // SI EL NOMBRE ES "JUAN", LO ELIMINAMOS
      if (name.equals("Juan")) {
        iterator.remove();
      }
    }

    // IMPRIMIMOS LA COLECCIÓN
    for (String name : names) {
      System.out.println(name);
    }
  }
}