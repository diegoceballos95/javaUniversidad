package modelo1Parcial;

public class Empresa {
	//ATRIBUTOS
	private ListaEmpleados listaEmpleados;
	private ListaClientes listaClientes;
	
	//CONSTRUCTOR
	public Empresa() {
		this.listaEmpleados = new ListaEmpleados();
		this.listaClientes = new ListaClientes();
	}
	
	//METODOS
	public void enviarMailAEmpleados(String mensaje) {
		for(int i=0; i<this.listaEmpleados.cantEmpleados(); i++) {
			this.listaEmpleados.getEmpleado(i).recibirMail(mensaje);
			System.out.println("Msj enviado a " + this.listaEmpleados.getEmpleado(i).getNombre());
		}
	}
	public ListaEmpleados getListaSubordinados() {
		return this.listaEmpleados;
	}
	public ListaClientes getListaClientes() {
		return this.listaClientes;
	}

}
