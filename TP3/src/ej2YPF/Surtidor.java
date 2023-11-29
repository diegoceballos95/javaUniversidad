package ej2YPF;

public class Surtidor {
	//ATRIBUTOS
	private int cargaMax;
	private int ultraDiesel;
	private int euroDiesel;
	private int naftaSuper;
	private int naftaInfinia;
	
	//CONSTRUCTOR
	public Surtidor() {
		this.cargaMax = 20000;
		this.ultraDiesel = this.cargaMax;
		this.euroDiesel = this.cargaMax;
		this.naftaSuper = this.cargaMax;
		this.naftaInfinia = this.cargaMax;
	}

	//GETTERS
	public int getUltraDiesel() {
		return ultraDiesel;
	}
	public int getEuroDiesel() {
		return euroDiesel;
	}
	public int getNaftaSuper() {
		return naftaSuper;
	}
	public int getNaftaInfinia() {
		return naftaInfinia;
	}
	
	//METODOS
	public void llenarDepositoUDiesel() {
		this.ultraDiesel = this.cargaMax;
	}
	public void llenarDepositoEDiesel() {
		this.euroDiesel = this.cargaMax;
	}
	public void llenarDepositoNSuper() {
		this.naftaSuper = this.cargaMax;
	}
	public void llenarDepositoInfinia() {
		this.naftaInfinia = this.cargaMax;
	}
	
	public void cargarUDiesel(int litros) {
		if (this.ultraDiesel - litros >= 0) {
			this.ultraDiesel -= litros;
			System.out.println("Carga completa");
		}
		else {
			System.out.println("Solo se cargaron " + (this.ultraDiesel) + " litros");
			this.ultraDiesel = 0;
			System.out.println("DEPOSITO VACIO");
		}
	}
	public void cargarEDiesel(int litros) {
		if (this.euroDiesel - litros >= 0) {
			this.euroDiesel -= litros;
			System.out.println("Carga completa");
		}
		else {
			System.out.println("Solo se cargaron " + (this.euroDiesel) + " litros");
			this.euroDiesel = 0;
			System.out.println("DEPOSITO VACIO");
		}
	}
	public void cargarNSuper(int litros) {
		if (this.naftaSuper - litros >= 0) {
			this.naftaSuper -= litros;
			System.out.println("Carga completa");
		}
		else {
			System.out.println("Solo se cargaron " + (this.naftaSuper) + " litros");
			this.naftaSuper = 0;
			System.out.println("DEPOSITO VACIO");
		}
	}
	public void cargarInfinia(int litros) {
		if (this.naftaInfinia - litros >= 0) {
			this.naftaInfinia -= litros;
			System.out.println("Carga completa");
		}
		else {
			System.out.println("Solo se cargaron " + (this.naftaInfinia) + " litros");
			this.naftaInfinia = 0;
			System.out.println("DEPOSITO VACIO");
		}
	}
	
	public String toString () {
		String cadena = "\n---- NIVEL DE COMBUSTIBLE ----\n";
		cadena += "ULTRA DIESEL: " + getUltraDiesel() + " litros\n";
		cadena += "EURO DIESEL: " + getEuroDiesel() + " litros\n";
		cadena += "NAFTA SUPER: " + getNaftaSuper() + " litros\n";
		cadena += "NAFTA INFINIA: " + getNaftaInfinia() + " litros\n";
		return cadena;
	}
}