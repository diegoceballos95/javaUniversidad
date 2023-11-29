package matrizTATEIclase12;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        TaTeTi juego = new TaTeTi();
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Bienvenido al Ta-Te-Ti ***\n");
        System.out.println("- Jugador: X");
        System.out.println("- Computadora: O\n");

        while (!juego.juegoTerminado()) {
            juego.imprimirTablero();

            System.out.println("\nIngrese fila (0-2): ");
            int fila = scanner.nextInt();

            System.out.println("Ingrese columna (0-2):");
            int columna = scanner.nextInt();

            boolean movimientoValido = juego.jugar(fila, columna, 'X');

            if (!movimientoValido) {
                System.out.println("Movimiento no válido. Intente nuevamente.");
            } else {
                if (juego.hayGanador('X')) {
                    System.out.println("\n*** Felicidades - Has ganado ***");
                    break;
                }

                if (juego.juegoTerminado()) {
                    System.out.println("\n*** Empate ***");
                    break;
                }

                juego.jugarComputadora();

                if (juego.hayGanador('O')) {
                    System.out.println("\n*** La computadora ha ganado - Intentalo de nuevo ***");
                    break;
                }
            }
        }
        juego.imprimirTablero();
        scanner.close();
    }
}