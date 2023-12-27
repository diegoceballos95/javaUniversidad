package cadenaClase2;

public class Cadena {
	
	//ATRIBUTOS
	
	private String linea;
	
	//CONSTRUCTOR
	
	Cadena(String frase){
		this.linea = frase;
	}
	
	//GETTERS
	
	public String getLinea() {
		return this.linea;
	}
	//SETTERES
	
	public void setLinea(String frase) {
		this.linea = frase;
	}
	
	//METODOS
	
	public int cantidadCaracteres() {
		return linea.length();
	}
	
	public int cantidadPalabras() {
		char caracter;
		int c = 0;
		for(int i=0; i<this.linea.length(); i++) {
			caracter = this.linea.charAt(i);
			if (caracter == ' ') {
				c++;
			}
		}
		return c+1;
	}
	
	public int contarVocales() {
		int c = 0;
		char caracter;
		for (int i = 0; i < this.linea.length(); i++) {
			caracter = this.linea.charAt(i);
			switch(caracter) {
			case 'a': case 'A': c++; break; 
			case 'e': case 'E': c++; break; 
			case 'i': case 'I': c++; break; 
			case 'o': case 'O': c++; break; 
			case 'u': case 'U': c++; break; 
			default: break;
			}
		}
		return c;
	}
	
	public int contarConsonantes(){
		int c = 0;
		char caracter;
		for (int i = 0; i < this.linea.length(); i++) {
			caracter = this.linea.charAt(i);
			if (Character.isLetter(caracter)) {
			//CHARACTER.ISLETTER() DEVUELVE VERDADERO SI EL CARÁCTER ES UNA LETRA.
				switch(caracter) {
				case 'a': case 'A': break; 
				case 'e': case 'E': break; 
				case 'i': case 'I': break; 
				case 'o': case 'O': break; 
				case 'u': case 'U': break; 
				default: c++; break;
				}
			}
		}
		return c;
	}
}