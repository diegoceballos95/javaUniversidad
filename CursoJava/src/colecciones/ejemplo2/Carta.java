package colecciones.ejemplo2;

public class Carta {
    private int numero;
    private String palo;

    Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
    public void imprimir() {
        System.out.println(numero + " " + palo);
    }
}