package ejemplosDeClases;

import java.util.Random;

public class EjemploRandom {
    public static void main(String[] args) {
        Random random = new Random();
        
        // GENERAR UN NUMERO ALEATORIO ENTRE 0 Y 9
        int numAleatorio = random.nextInt(10);
        System.out.println("El número aleatorio generado es: " + numAleatorio);
        
        // GENERAR UN NUMERO ALEATORIO ENTRE 1 Y 100
        int numAleatorio2 = random.nextInt(100) + 1;
        System.out.println("El segundo número aleatorio generado es: " + numAleatorio2);
    }
}
