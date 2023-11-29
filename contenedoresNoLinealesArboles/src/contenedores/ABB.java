//IMPLEMENTA LAS OPERACIONES INSERCION Y ELIMINACION DE NODOS SOBRE UN ABB. 
//SIGUE SIENDO ABSTRACTO
package contenedores;
import recursos.*;

public abstract class ABB extends ArbolBinario{
	//ATRIBUTOS
	public abstract boolean iguales(Object nodoA, Object nodoB);
	public abstract boolean menor(Object nodoA, Object nodoB);
	public abstract boolean mayor(Object nodoA, Object nodoB);
	
	//INSERCION
	public void meter(Object nodoInfo){
		NodoArbolBinario temp, anterior;
		NodoArbolBinario nodo = new NodoArbolBinario(nodoInfo);	
		if (estaVacio()){
			this.root=nodo;
		}else{
			temp=this.root;
			anterior=null;
			while (temp!=null){
				anterior=temp;
				if (mayor(temp.getNodoInfo(),nodoInfo)){
					temp=temp.getLeftChild();
				}else{
					temp=temp.getRightChild();
				}
			}		
			if (menor(anterior.getNodoInfo(),nodoInfo) ||
					iguales(anterior.getNodoInfo(),nodoInfo)){
				anterior.setRightChild(nodo);
			}else{
				anterior.setLeftChild(nodo);
			}			
		}		
	}
	
	//ELIMINAR
	public void sacar(Object nodoInfo){
		NodoArbolBinario temp,anterior, auxiliar;
		boolean response=false;
		
		if (!estaVacio()){
			if (esta(nodoInfo)){
				anterior=null;
				temp=this.root;
				
				while (temp!=null && !response){					
					if (iguales(temp.getNodoInfo(),nodoInfo)){
						response=true;
					}else {
						anterior=temp;
						if (mayor(temp.getNodoInfo(),nodoInfo)){
							temp=temp.getLeftChild();
						}else {
							temp=temp.getRightChild();
						}
					}					
				}
				
				if (temp.getLeftChild()==null && temp.getRightChild()==null){
					//EL NODO A ELIMINAR ES HOJA
					if (anterior==null){
						limpiar();
					}else{
						if (anterior.getLeftChild()==temp){
							anterior.setLeftChild(null);
						}else{
							anterior.setRightChild(null);
						}
					}
				}else{
					if (temp.getLeftChild()!=null && temp.getRightChild()!=null){
						//EL NODO A ELIMINAR TIENE DOS HIJOS
						anterior=temp;
						auxiliar=temp.getLeftChild(); //TOMO HIJO IZQ DEL NODO A ELIMINAR
						//Y BUSCO EL MAYOR DE LOS MENORES
						while (auxiliar.getRightChild()!=null){
							anterior=auxiliar;
							auxiliar=auxiliar.getRightChild();
						}
						temp.setNodoInfo(auxiliar.getNodoInfo());
						//EL NODO A ELIMINAR AHORA TOMA EL VALOR DEL MAYOR DE LOS MENORES
						if (anterior==temp){
							anterior.setLeftChild(auxiliar.getLeftChild());
							//EL NUEVO HIJO IZQ DEL NODO ELIMINADO ES SU NIETO IZQ
						}else{
							//EL NUEVO HIJO DERECHO DEL PADRE DEL NODO "ELIMINADO" ES SU NIETO IZQ.
							anterior.setRightChild(auxiliar.getLeftChild());
						}				
						
					}else{
						//EL NODO A ELIMINAR TIENE HIJO DERECHO
						if (temp.getRightChild()!=null){
							if (anterior==null){
								//NODO RAIZ CON HIJO DERECHO
								this.root=temp.getRightChild();
							}else{
								if (anterior.getRightChild()==temp){
									anterior.setRightChild(temp.getRightChild());
								}else{
									anterior.setLeftChild(temp.getRightChild());
								}
							}
						}else{
							if (anterior==null){
								//NODO RAIZ CON HIJO IZQUIERDO
								this.root=temp.getLeftChild();
							}else{
								if (anterior.getRightChild()==temp){
									anterior.setRightChild(temp.getLeftChild());
								}else{
									anterior.setLeftChild(temp.getLeftChild());
								}
							}
						}
					}
				}				
			}else{
				System.out.println("Error sacar. No esta elemento..");
			}
		}else{
			System.out.println("Error sacar. arbol vacio...");
		}
	}
	
	//DEVOLVER
	private NodoArbolBinario devuelveNodo(Object nodoInfo){
		NodoArbolBinario nodo=null;
		boolean response=false;
		
		nodo=this.root;
		while (nodo!=null && !response){
			if (iguales(nodo.getNodoInfo(),nodoInfo)){
				response=true;
			}else {
				if (mayor(nodo.getNodoInfo(),nodoInfo)){
					nodo=nodo.getLeftChild();
				}else {
					nodo=nodo.getRightChild();
				}
			}
		}	
		return nodo;
	}
	public NodoArbolBinario devuelve(Object nodoInfo){
		NodoArbolBinario nodo=null;
		
		if (!estaVacio()){
			nodo=devuelveNodo(nodoInfo);			
			if (nodo==null){
				System.out.println("Error devuelve. No esta...");
			}			
		}else{
			System.out.println("Error devuelve. arbol vacio...");
		}		
		return nodo;
	}	
	
	//ESTA O NO ESTA
	public boolean esta(Object nodoInfo){
		NodoArbolBinario nodo;
		boolean response=false;
		if (!estaVacio()){
			nodo=devuelveNodo(nodoInfo);
			if (nodo!=null){
				response=true;
			}			
		}else{
			System.out.println("Error esta. arbol vacio...");
		}		
		return response;
	}
}
