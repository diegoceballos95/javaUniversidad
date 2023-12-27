package ejemploMetodoJoin;

public class Contador implements Runnable {

    //ATRIBUTOS
    private int contador;
    private String nombre;
    private int limite;

    //Constructor
    public Contador(String nombre, int limite) {
        this.contador = 0;
        this.nombre = nombre;
        this.limite = limite;
    }

    @Override
    public void run() {

        // RECORREMOS LOS NUMEROS
        while (contador <= limite) {
            System.out.println("Hilo " + nombre + ": " + contador);
            contador++;
        }

        // FIN DEL HILO
        System.out.println("Hilo " + nombre + " ya ha acaado");
    }
}