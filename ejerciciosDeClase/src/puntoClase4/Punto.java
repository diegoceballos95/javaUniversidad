package puntoClase4;
 
public class Punto {
	
	//ATRIBUTOS
	private double x;
	private double y;
	
	//CONSTRUCTOR
	Punto(){
		this.x = 0;
		this.y = 0;
	}
	
	//SET AND GET
	public void setPtoX(double valor) {
		this.x = valor;
	}
	public void setPtoY(double valor) {
		this.y = valor;
	}
	public double getPtoX() {
		return this.x;
	}
	public double getPtoY() {
		return this.y;
	}
	
	//METODOS
	public double distanciaEuclidea(Punto punto2){
		double d;
		d = Math.sqrt(Math.pow(this.x - punto2.x, 2) + Math.pow(this.y - punto2.y, 2));
		return d;
	}
	
	public boolean comparaRadDis(Punto punto2, double r) {
		double d;
		d = distanciaEuclidea(punto2);
		if (d<=r){
			return true;
		}
		else{
			return false;
		}
	}

	public String toString() {
		String cadena = "Informacion del punto:\n";
		cadena += "La cordenada x es: " + this.x + "\n";
		cadena += "La cordenada y es: " + this.y;
		return cadena;
	}
}