package ventasArrays;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentaDeLaSemana ventaSemana;
		ventaSemana = new VentaDeLaSemana();
		
		double promedioVenta;
		String diaMasVenta;
		
		ventaSemana.cargarVentas();
		ventaSemana.totalVentaSemanal();
		promedioVenta = ventaSemana.promedioVentaSemanal();
		diaMasVenta = ventaSemana.diaConMasVentas();
		
		System.out.println("Promedio: " + promedioVenta);
		System.out.println("Dia de mayor venta: " + diaMasVenta);

	}

}
