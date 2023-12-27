package ej1TP2;

class TCredito{ 
	//ATRIBUTOS
	private String numero;
	private String nombre;
	private String banco;
	private double balance;
	private double limite;
	
	//CONSTRUCTOR
	public TCredito(String numero, String nombre, String banco, double balance, double limite) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.banco = banco;
		this.balance = balance;
		this.limite = limite;
	}
	
	//GETTERS AND SETTERS
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}

	//METODOS
	public boolean puedoComprar(double vprecio){ 
		if (vprecio + this.balance > this.limite) {
				return false;
				} 
		else { 
			this.balance += vprecio; 
			return true;
			}
	} 
	
	public void pagarTarjeta (double vmonto){ 
		this. balance -= vmonto; 
	} 
	
	public void muestraDatos (){
		System.out.println("numero = " + getNumero());
		System.out.println("nombre = " + getNombre());
	}
}