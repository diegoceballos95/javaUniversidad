package modelo1Parcial;

public class Aplicacion {
	
	public static void main(String[] args) {
		ListaEmpresas listaE = new ListaEmpresas();
		Empresa emp0 = new Empresa();
		Empresa emp1 = new Empresa();
		Empresa emp2 = new Empresa();
		Empresa emp3 = new Empresa();
		Empresa emp4 = new Empresa();
		listaE.agregarEmpresa(emp0);
		listaE.agregarEmpresa(emp1);
		listaE.agregarEmpresa(emp2);
		listaE.agregarEmpresa(emp3);
		listaE.agregarEmpresa(emp4);
		
		listaE.getEmpresa(2).enviarMailAEmpleados("Mañana no se trabaja");
	}
}
