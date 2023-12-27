package entradaYSalida;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StreamCharacters {
    public static void main(String args[]) throws IOException {

        FileReader entrada = null;
        FileWriter salida = null;

        try {
            entrada = new FileReader("C:/ficheros/input.txt");
            salida = new FileWriter("C:/ficheros/output.txt");
            
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
