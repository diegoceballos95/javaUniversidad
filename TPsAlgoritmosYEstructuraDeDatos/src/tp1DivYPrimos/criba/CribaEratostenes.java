package tp1DivYPrimos.criba;

import java.util.Arrays;

public class CribaEratostenes {
    public static boolean[] criba(int limite) {
        boolean[] primos = new boolean[limite + 1];
        Arrays.fill(primos, true);
        primos[0] = false;
        primos[1] = false;

        for (int i = 2; i * i <= limite; i++) {
            if (primos[i]) {
                for (int j = i * i; j <= limite; j += i) {
                    primos[j] = false;
                }
            }
        }
        return primos;
    }

    public static void main(String[] args) {
        int limite = 31;
        boolean[] primos = criba(limite);
        System.out.printf("Numeros primos hasta el %d:%n", limite);
        for (int i = 2; i < limite; i++) {
            if (primos[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
