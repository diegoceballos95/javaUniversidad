package tp6ContLin1.ej4TADColaArray;

public class Test {

	public static void main(String[] args) {
		
		Object objAux;
		ColaArray objCola = new ColaArray(5);
		
		Integer objInt1, objInt2, objInt3, objInt4, objInt5;
		
		objInt1 = new Integer(10);
		objInt2 = new Integer(20);
		objInt3 = new Integer(30);
		objInt4 = new Integer(40);
		objInt5 = new Integer(50);
						
		objCola.meter(objInt1);
		objCola.meter(objInt2);
		objCola.meter(objInt3);
		objCola.meter(objInt4);
		objCola.meter(objInt5);
		objCola.meter(objInt1);

		System.out.println("-----------------");
		
		while (!objCola.estaVacia()) {
			objAux = objCola.sacar();		
			if (objAux != null) {
				System.out.println("Elemento Cola " + objAux);
			}	
		}	

	}

}
