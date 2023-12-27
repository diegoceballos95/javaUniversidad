package entradaYSalida;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class TryWithResources {
    
    public static void main(String []args){

        File origen = new File("C:/ficheros/origen.txt");
        File destino = new File("C:/ficheros/destino.txt");
        copiarFicheros(origen, destino);
    }

    private static void copiarFicheros(File origen, File destino) {

        try (InputStream forigen = new FileInputStream(origen);

            OutputStream fdestino = new FileOutputStream(destino)
        ){

            byte[] buf = new byte[9000];
            int i;
            
            while ((i = forigen.read(buf)) != -1) {
                fdestino.write(buf, 0, i);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
