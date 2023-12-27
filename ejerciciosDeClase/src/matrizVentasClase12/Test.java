package matrizVentasClase12;

public class Test {

	public static void main(String[] args) {
		
		Ventas matrizVentas = new Ventas(6,5);
		
		matrizVentas.mostrarVentas();
		System.out.println("-------------------------------");
		System.out.println("Vendedor Num5: $" + matrizVentas.ventatTotalVendedor(5));
		System.out.println("-------------------------------");
		System.out.println("Ventas Mar-Abr: $" + matrizVentas.ventatTotalDosMeses(1));
		System.out.println("-------------------------------");
		System.out.println("Venta total del anio: $" + matrizVentas.ventaTotalAnio());
	}

}
