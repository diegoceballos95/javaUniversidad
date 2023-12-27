package tp5TAD.ej5Matrices;

public class Test {
	public static void main(String[] args) {
		
		Matriz m1 = new Matriz(3,3);
		System.out.println(m1);
		
		System.out.println("Matriz por escalar 2:");
		System.out.println(m1.productoX1Escalar(2));
		
		System.out.println("Transpuesta de la matriz:");
		System.out.println(m1.transpuesta());
	}
}
