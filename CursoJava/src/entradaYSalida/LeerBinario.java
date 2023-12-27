package entradaYSalida;

import java.io.*;

public class LeerBinario {
    public static void main(String args[])throws IOException {

        //leer datos binarios
        DataInputStream leer = null;

        try {
            leer = new DataInputStream(new FileInputStream((
            "C:/ficheros/outputDatos.txt")));
            
            System.out.println("Booleano: "+leer.readBoolean());
            System.out.println("Entero: "+leer.readInt());
            System.out.println("Long: "+leer.readLong());
            System.out.println("Float: "+leer.readFloat());
        }
        catch (IOException ioex) {
            System.out.println(ioex.getMessage());
        }
        finally {
            if (leer != null) {
                leer.close();
            }
        }
    }
}
