package entradaYSalida;

import java.util.Random;
import java.io.*;

public class EscribirBinario {
    public static void main(String args[])throws IOException {

        Random aleatorio = new Random();
        boolean b = aleatorio.nextBoolean();
        int n = aleatorio.nextInt();
        long l = aleatorio.nextInt()*10L;
        float f = aleatorio.nextFloat();

        //escribir datos binarios
        DataOutputStream escribir=null;

        try {
            escribir = new DataOutputStream(new FileOutputStream(
            "C:/ficheros/outputDatos.txt"));
            
            escribir.writeBoolean(b);
            escribir.writeInt(n);
            escribir.writeLong(l);
            escribir.writeFloat(f);
        }
        catch (IOException ioex) {
            System.out.println(ioex.getMessage());
        }
        finally {
            if (escribir != null) {
                escribir.close();
            }
        }
    }
}
