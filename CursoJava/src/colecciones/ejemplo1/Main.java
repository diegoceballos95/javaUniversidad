package colecciones.ejemplo1;

public class Main {

	public static void main(String[] args) {
		 Bolsa<Soda> bolsaDeSodas = new Bolsa<Soda>(); 
		 Bolsa<Chocolate> bolsaDeChocolates = new Bolsa<Chocolate>(); 
		 
		 bolsaDeSodas.add(new Soda("Soda_1", "Limon")); 
		 bolsaDeSodas.add(new Soda("Soda_2", "Fresa")); 
		 
		 bolsaDeChocolates.add(new Chocolate("Chocolate_1", "Negro")); 
		 bolsaDeChocolates.add(new Chocolate("Chocolate_2", "Blanco")); 

	}
}
