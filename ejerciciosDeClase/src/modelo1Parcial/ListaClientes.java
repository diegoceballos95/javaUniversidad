package modelo1Parcial;

import java.util.ArrayList;

public class ListaClientes {
		//ATRIBUTOS
		private ArrayList<Cliente> listaClientes;
		//CONSTRUCOR
		ListaClientes(){
			this.listaClientes = new ArrayList<Cliente>();
		}
		//GETTERS
		public Cliente getCliente(int i) {
			return this.listaClientes.get(i);
		}
}
