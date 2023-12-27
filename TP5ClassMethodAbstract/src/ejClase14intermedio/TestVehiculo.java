package ejClase14intermedio;

public class TestVehiculo {

	public static void main(String[] args) {
		
		Jepp v1 = new Jepp(2000, 30, "jepp", 0.2);
		Jepp v2 = new Jepp(5000, 20, "Krons", 0.3);
		Jepp v3 = new Jepp(3500, 40, "Krons", 0.6);
		
		System.out.println("ID v1: " + v1.getID());
		System.out.println("ID v2: " + v2.getID());
		System.out.println("ID v3: " + v3.getID());
		
		System.out.println("Max energia v1: " + v1.getMaxEnergia());
		System.out.println("Max energia v2: " + v2.getMaxEnergia());
		System.out.println("Max energia v3: " + v3.getMaxEnergia());
		
		System.out.println("Ind. Seguridad de v1: " + v1.getIndiceSeguridad());
		System.out.println("Ind. Seguridad de v2: " + v2.getIndiceSeguridad());
		System.out.println("Ind. Seguridad de v3: " + v3.getIndiceSeguridad());

	}

}
