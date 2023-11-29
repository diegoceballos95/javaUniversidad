package matrizTATEIclase12;
import java.util.Random;

public class TaTeTi {
    private char[][] tablero;

    public TaTeTi() {
        this.tablero = new char[3][3];
        inicializarTablero();
    }

    public void inicializarTablero() {
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[i].length; j++) {
                this.tablero[i][j] = '-';
            }
        }
    }

    public void imprimirTablero() {
        System.out.println("    0   1   2");
        for (int i = 0; i < this.tablero.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < this.tablero[i].length; j++) {
                System.out.print("| " + this.tablero[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public boolean jugar(int fila, int columna, char letra) {
        if (this.tablero[fila][columna] == '-') {
            this.tablero[fila][columna] = letra;
            return true;
        }
        return false;
    }

    public boolean juegoTerminado() {
        return hayGanador('X') || hayGanador('O') || tableroLleno();
    }

    private boolean tableroLleno() {
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[i].length; j++) {
                if (this.tablero[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean hayGanador(char letra) {
        for (int i = 0; i < this.tablero.length; i++) {
            if (this.tablero[i][0] == letra && this.tablero[i][1] == letra && this.tablero[i][2] == letra) {
                return true;
            }
        }
        for (int i = 0; i < this.tablero.length; i++) {
            if (this.tablero[0][i] == letra && this.tablero[1][i] == letra && this.tablero[2][i] == letra) {
                return true;
            }
        }
        if (this.tablero[0][0] == letra && this.tablero[1][1] == letra && this.tablero[2][2] == letra) {
            return true;
        }
        if (this.tablero[0][2] == letra && this.tablero[1][1] == letra && this.tablero[2][0] == letra) {
            return true;
        }
        return false;
    }

    public void jugarComputadora() {
        Random random = new Random();
        int fila, columna;
        do {
            fila = random.nextInt(3);
            columna = random.nextInt(3);
        } while (!jugar(fila, columna, 'O'));
    }
}