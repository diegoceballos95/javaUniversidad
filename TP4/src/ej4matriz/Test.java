package ej4matriz;

public class Test {

	public static void main(String[] args) {
		Matriz m1 = new Matriz(3,3);
		Matriz m2= new Matriz(3,3);
		m1.cargar();
		m2.cargar();
		
		System.out.println(m1);
		System.out.println(m2);
	}
}
