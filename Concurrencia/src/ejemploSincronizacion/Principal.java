package ejemploSincronizacion;

/*REALIZAR UNA CLASE COUNTER CON UN METODO QUE MUESTRE DE 0 A N Y 
  OTRO IGUAL PERO SINCRONIZADO. REALIZA DOS HILOS QUE EJECUTEN ESTOS 
  METODOS.

  LA CLASE COUNTER TENDRÁ UN ATRIBUTO "SINCRONIZADO" DE TIPO BOOLEAN
  PARA INDICAR A CUAL DEBE LLAMAR.
*/

public class Principal {

    public static void main(String[] args) {
    	
        boolean sincronizado = true;
    	Counter c = new Counter(sincronizado);

        HiloContador h1 = new HiloContador(1, 5, c);
        HiloContador h2 = new HiloContador(2, 10, c);

        h1.start();
        h2.start();
        
        try {
            h1.join();
            h2.join();
            System.out.println("Fin Programa");
        } 
        catch (InterruptedException e) {
           System.out.println("INTERRUPCION");
        }
    }

}