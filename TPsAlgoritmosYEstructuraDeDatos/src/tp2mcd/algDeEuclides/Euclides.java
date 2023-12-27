package tp2mcd.algDeEuclides;

//ALGORITMO DE EUCLIDES

public class Euclides {

	public static void main(String[] args) {
		
		int a, b, c, d, r;
		a = 132; 
		b = 25600;
		a = Math.abs(a);
		b = Math.abs(b);
		
		if (b != 0) {
			
			if (a > b) {
				c = a;
				d = b;
			}else {
				c = b;
				d = a;
			}
			r = c % d;
			System.out.println("b="+d+" - "+"r="+r);
			
			while (r > 0) {
				c = d;
				d = r;
				r = c % d;
				System.out.println("b="+d+" - "+"r="+r);
			}
			
			System.out.println("El mcd("+a+", "+b+") = "+d);
			
		}else {
			System.out.println("ERROR: b no puede ser 0");
		}
	}
}
