package conceptosBasico;

public class Cadenas {

	public static void main(String[] args) {
		
		// STRING - METODOS
		String palabra = "Diego E. Ceballos";
				
		// RETORNAR EL TOTAL DE CARACTERES QUE TIENE LA CADENA:
		int var = palabra.length(); 
				
		// EVALURA SI LA CADENA INICIA CON UN CARACTER O SECUENCIA DE ELLOS:
		boolean var2 = palabra.startsWith("D"); 
				
		// EVALUAR SI LA CADENA TERMINA CON UN CARACTER O SECUENCIA DE ELLOS:
		boolean var3 = palabra.endsWith("CEBALLOS");
				
		// RETORNAR LA CONCATENACION DE AMBAS CADENAS:
		String var4 = palabra.concat(", es un estudiante"); 
				
		//EVALUAR SI LA CADENA CONTINE UN SUB-STRING:
		boolean var5 = palabra.contains("E."); 
				
		// RETORNA UNA CADENA CON TODOS SUS CARACTERES EN MAYUSCULA:
		String var6 = palabra.toUpperCase(); 
				
		// RETORNA UNA CADENA CON TODOS SUS CARACTERES EN MINUSCULA:
		String var7 = palabra.toLowerCase(); 
				
		// REMUEVE LOS ESPACIOS EN BLANCO AL INICIO Y AL FINAL (SI LOS HAY):
		String var8 = palabra.trim();

				
		System.out.println(var);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
	}
}
