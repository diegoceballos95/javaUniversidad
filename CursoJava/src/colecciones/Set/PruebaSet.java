package colecciones.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PruebaSet {

    public static void main(String[] args) {
        Set<Integer> conjunto1 = new HashSet<Integer>();
        conjunto1.add(20);
        conjunto1.add(10);
        conjunto1.add(1);
        conjunto1.add(5);
        // EL VALOR 20 NO SE INSERTA EN EL CONJUNTO YA QUE SE ENCUENTRA REPETIDO:
        conjunto1.add(20);
        // LA IMPRESIÓN NO ASEGURA UN ORDEN ESPECÍFICO
        for (int elemento : conjunto1)
            System.out.print(elemento + " - ");
        System.out.println();

        Set<Integer> conjunto2 = new TreeSet<Integer>();
        conjunto2.add(20);
        conjunto2.add(10);
        conjunto2.add(1);
        conjunto2.add(5);
        // EL VALOR 20 NO SE INSERTA EN EL CONJUNTO YA QUE SE ENCUENTRA REPETIDO:
        conjunto2.add(20);
        // LOS ELEMENTOS SE MUESTRAN DE MENOR A MAYOR
        for (int elemento : conjunto2)
            System.out.print(elemento + " - ");
        System.out.println();

        Set<Integer> conjunto3 = new LinkedHashSet<Integer>();
        conjunto3.add(20);
        conjunto3.add(10);
        conjunto3.add(1);
        conjunto3.add(5);
        // EL VALOR 20 NO SE INSERTA EN EL CONJUNTO YA QUE SE ENCUENTRA REPETIDO:
        conjunto3.add(20);
        // LOS ELEMENTOS SE MUESTRAN EN EL ORDEN QUE SE INSERTARON
        for (int elemento : conjunto3)
            System.out.print(elemento + " - ");
        System.out.println();

    }
}