package ejemploMetodoJoin;

public class Main {

    public static void main(String[] args) {
       // CREA 2 HILOS:
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hilo 1: " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hilo 2: " + i);
            }
        });
        
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hilo 3: " + i);
            }
        });

        // INICIA LOS HILOS:
        thread1.start();

        // ESPERA QUE EL HILO 1 TERMINE:
        try {
            thread1.join();
        } catch (InterruptedException e) {
            // SE EJECUTA UN INTERRUPTED EXCEPTION
            System.out.println("El hilo 1 se interrumpió.");
        }

        // IMPRIME UN MSJ CUANDO HILO 1 TERMINE
        System.out.println("El hilo 1 ha terminado.");
        
        thread2.start();
        thread3.start();
    }
}