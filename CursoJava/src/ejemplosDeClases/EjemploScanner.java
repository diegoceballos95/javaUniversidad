package ejemplosDeClases;

import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // INGRESAR ENTERO
        System.out.print("Ingrese un numero entero: ");
        int numEntero = scanner.nextInt();
        scanner.nextLine(); // LIMPIA EL BUFFER DE ENTRADA
        System.out.println("El numero entero ingresado es: " + numEntero);
        
        // INGRESAR DECIMAL
        System.out.print("Ingrese un numero decimal: ");
        double numDecimal = scanner.nextDouble();
        scanner.nextLine(); // LIMPIA EL BUFFER DE ENTRADA PUES SINO LA CADENA TOMA EL SALTO DE LINEA
        System.out.println("El numero decimal ingresado es: " + numDecimal);
        
        // INGRESAR STRING
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();
        System.out.println("La cadena de texto ingresada es: " + cadena);
        
        // INGRESAR BOOLEANO
        System.out.print("Ingrese un valor booleano (true o false): ");
        boolean valorBooleano = scanner.nextBoolean();
        System.out.println("El valor booleano ingresado es: " + valorBooleano);
        
        // INGRESAR CARACTER
        System.out.print("Ingrese un caracter: ");
        String caracter = scanner.next();
        char primerCaracter = caracter.charAt(0);
        System.out.println("El caracter ingresado es: " + primerCaracter);
     
        scanner.close();
    }
}
