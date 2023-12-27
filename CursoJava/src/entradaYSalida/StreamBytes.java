package entradaYSalida;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamBytes {
    public static void main(String args[]) throws IOException {

        FileInputStream entrada = null;
        FileOutputStream salida = null;

        try {
            entrada = new FileInputStream("C:/ficheros/input.txt");
            salida = new FileOutputStream("C:/ficheros/output.txt");
            
            int i;

            while ((i = entrada.read()) != -1) {

                System.out.print((char)i);
                salida.write(i);     
            }
        }catch (IOException ioex){
            System.out.println(ioex.getMessage());
        }
        
        finally {
            if (entrada != null) entrada.
            close();
            if (salida != null) salida.
            close();
        }
    }
}
