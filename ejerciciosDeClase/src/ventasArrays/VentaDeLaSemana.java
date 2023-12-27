package ventasArrays;

public class VentaDeLaSemana {
	
	private double ventas [];
	
	//SOBRECARGA DE CONSTRUCTORES
	VentaDeLaSemana(){
		ventas = new double [7];
	}
	VentaDeLaSemana(int tam){
		if (tam <= 7) {
			ventas = new double [tam];
		}
		else {
			System.out.println("ERROR: el array debe ser de tamaño menor o igual a 7");
			System.out.println("Se asignara un tamaño de 7 automaticamente");
			ventas = new double [7];
			System.out.println("Ingrese los datos");
			this.cargarVentas();
		}
	}
	VentaDeLaSemana(double [] ventas){
		this.ventas = ventas;
	}
	public void cargarVentas(){
		for(int i=0; i<ventas.length; i++){
			ventas[i] = i*1000;
		}
	}
	public double totalVentaSemanal() {
		double total = 0;
		for(int i=0; i<ventas.length; i++){
			total += ventas[i];
		}
		return total;
	}
	public double promedioVentaSemanal() {
		double promedio;
		promedio = this.totalVentaSemanal()/ventas.length;
		return promedio;
		
		}
	public String diaConMasVentas() {
		String dia = "";
		double mayor = 0;
		int pos = 0;
		for(int i=0; i<ventas.length; i++){
			if (ventas[i] > mayor) {
				mayor = ventas[i];
				pos = i;
			}
		}
		switch(pos) {
		case 0: dia = "domingo"; break;
		case 1: dia = "lunes";break;
		case 2: dia = "martes";break;
		case 3: dia = "miercoles";break;
		case 4: dia = "jueves";break;
		case 5: dia = "viernes";break;
		case 6: dia = "sabado";break;
		default: break;
		}
		return dia;
	}
}
