package cadenaClase2;

public class Test {

	public static void main(String[] args) {
		
		Cadena linea1 = new Cadena("hola chicos de POO 2020");
		Cadena linea2 = new Cadena("en casa, pero trabajando");
		
		System.out.println("Numero de caracteres de linea1 es: " + linea1.cantidadCaracteres());
		System.out.println("Numero de caracteres de linea2 es: " + linea2.cantidadCaracteres());

		System.out.println("Cant de palabras de linea1 es: " + linea1.cantidadPalabras());
		System.out.println("Cant de palabras de linea2 es: " + linea2.cantidadPalabras());
		
		System.out.println("Cant de vocales de linea1 es: " + linea1.contarVocales());
		System.out.println("Cant de vocales de linea2 es: " + linea2.contarVocales());
		
		System.out.println("Cant de consonantes de linea1 es: " + linea1.contarConsonantes());
		System.out.println("Cant de consonantes de linea2 es: " + linea2.contarConsonantes());
	}

}
