package tp6ContLin1.ej9PilaDeCaracteres;

public class Test {

	public static void main(String[] args) {
		PilaDeCaracteres pilaChar = new PilaDeCaracteres();
		PilaDeCaracteres pilaChar2 = new PilaDeCaracteres();
		PilaDeCaracteres pilaChar3 = new PilaDeCaracteres();
		
		System.out.println("----- PRIMER PRUEBA -----");
		pilaChar.meter('d');
		pilaChar.meter('(');
		pilaChar.meter('u');
		pilaChar.meter(')');
		pilaChar.meter('(');
		pilaChar.meter('(');
		pilaChar.meter('7');
		pilaChar.meter(')');
		pilaChar.meter('h');
		pilaChar.meter(')');
		pilaChar.muestraComoCadena();
		System.out.println("\nEsta balanceada?: " + pilaChar.estaBalanceada());

		System.out.println("\n----- SEGUNDA PRUEBA -----");
		pilaChar2.meter('d');
		pilaChar2.meter('(');
		pilaChar2.meter('u');
		pilaChar2.meter(')');
		pilaChar2.meter('(');
		pilaChar2.meter('(');
		pilaChar2.meter('7');
		pilaChar2.meter(')');
		pilaChar2.meter('h');
		pilaChar2.meter('9');
		pilaChar2.muestraComoCadena();
		System.out.println("\nEsta balanceada?: " + pilaChar2.estaBalanceada());
		
		System.out.println("\n----- TERCERA PRUEBA -----");
		pilaChar3.meter('d');
		pilaChar3.meter(')');
		pilaChar3.meter('u');
		pilaChar3.meter('(');
		pilaChar3.meter('(');
		pilaChar3.meter('(');
		pilaChar3.meter('7');
		pilaChar3.meter(')');
		pilaChar3.meter('h');
		pilaChar3.meter(')');
		pilaChar3.meter(')');
		pilaChar3.muestraComoCadena();
		System.out.println("\nEsta balanceada?: " + pilaChar3.estaBalanceada());
	}
}
