package puntoClase4;

public class Test {

	public static void main(String[] args) {
		
		Punto p1 = new Punto();
		Punto p2 = new Punto();
		double r = 7;
		double d;
		boolean valor;
		
		p1.setPtoX(1);
		p1.setPtoY(1);
		p2.setPtoX(5);
		p2.setPtoY(4);
		
		d = p1.distanciaEuclidea(p2);
		System.out.println("La distancia entre los dos puntos es: " + d);
		
		valor = p1.comparaRadDis(p2, r);

		if (valor) {
			System.out.println("Esta dentro");
		}
		else {
			System.out.println("Esta fuera");
		}
		
		// TO STRING: AMBAS FORMAS SON LO MISMO:
		//LA 1ª FORMA ES LA MAS ADECUADA, MANDAR DIRECTAMENTE EL OBJETO
		//PORQUE EL TOSTRING ESTA IMPLICITO
		System.out.println(p1);
		System.out.println(p2.toString());
	}
}