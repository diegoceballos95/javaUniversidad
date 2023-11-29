package contenedores;

import recursos.NodoAVL;
import recursos.NodoArbolBinario;

public abstract class ArbolAVL {
	protected NodoAVL root;

	//METODOS ABSTRACTOS
	public abstract boolean mayor(Object nodoA, Object nodoB);
	public abstract boolean menor(Object nodoA, Object nodoB);
	public abstract boolean iguales(Object nodoA, Object nodoB);
	public abstract void imprimir(Object nodoInfo);

	/*******************++++++++ METODOS ***************************/

	public boolean estaVacio() {
		return this.root == null;
	}

	//MUESTRAS
	
	public void muestraInOrder() {
		if (estaVacio()) {
			System.out.println("Arbol AVL vacio");
		} else {
			inOrder(this.root);
		}
	}
	public void muestraPreOrder() {
		if (estaVacio()) {
			System.out.println("Arbol AVL vacio");
		} else {
			preOrder(this.root);
		}
	}
	private void inOrder(NodoAVL nodo) {
		if (nodo != null) {
			inOrder(nodo.getLeftChild());
			imprimir(nodo.getNodoInfo());
			inOrder(nodo.getRightChild());
		}
	}
	private void preOrder(NodoAVL nodo) {
		if (nodo != null) {
			imprimir(nodo.getNodoInfo());
			preOrder(nodo.getLeftChild());
			preOrder(nodo.getRightChild());
		}
	}

	//INSERCION
	
	public void meterAVL(Object nodoInfo) {
		System.out.println("intentando meter " + nodoInfo.toString());
		this.root = meterR(this.root, nodoInfo);
	}
	
	private NodoAVL meterR(NodoAVL nodo, Object nodoInfo) {
		int b, izq, der;
		if (nodo == null) {
			nodo = new NodoAVL(nodoInfo);
		} else {
			if (mayor(nodo.getNodoInfo(), nodoInfo)) {
				nodo.setLeftChild(meterR(nodo.getLeftChild(), nodoInfo));

				nodo = balancear(nodo);
			} else {
				//ES MENOR
				nodo.setRightChild(meterR(nodo.getRightChild(), nodoInfo));
				nodo = balancear(nodo);
			}
		}
		izq = height(nodo.getLeftChild());
		der = height(nodo.getRightChild());
		b = max(izq, der) + 1;
		nodo.setHeight(b);
		return nodo;
	}

	//BALANCEO
	
	public NodoAVL balancear(NodoAVL nodo) {
		if (height(nodo.getLeftChild()) - height(nodo.getRightChild()) == 2) {
			System.out.println("hay desequilibrio a izquierda >");
			// DESEQUILIBRIO A IZQUIERDA, PUEDE SER SIMPLE O DOBLE

			if (height(nodo.getLeftChild().getLeftChild()) >= height(nodo.getLeftChild().getRightChild())) {
				System.out.println("-> Rot. Simple a Derecha");
				return rotacionSimple(nodo, false);
			} else {
				System.out.println("-> Rot. Doble a Derecha");
				return rotacionDoble(nodo, false);
			}
		} else {
			if (height(nodo.getRightChild()) - height(nodo.getLeftChild()) == 2) {
				System.out.println("hay desequilibrio a derecha >");
				// DESEQUILIBRIO A DERECHA
				if (height(nodo.getRightChild().getRightChild()) >= height(nodo.getRightChild().getLeftChild())) {
					System.out.println("> Rot. Simple a izquierda");
					return rotacionSimple(nodo, true);

				} else {
					System.out.println("> Rot. Doble a izquierda");
					return rotacionDoble(nodo, true);
				}
			} else {
				return nodo;
			}
		}
	}

	public NodoAVL rotacionSimple(NodoAVL nodo, boolean esAIzquierda) {
		NodoAVL temp;
		if (esAIzquierda) {
			temp = nodo.getRightChild();
			nodo.setRightChild(temp.getLeftChild());
			temp.setLeftChild(nodo);
			
			nodo.setHeight(max(height(nodo.getLeftChild()),
					height(nodo.getRightChild())) + 1);
			temp.setHeight(max(height(temp.getRightChild()), nodo.getHeight()) + 1);
		} else {
			temp = nodo.getLeftChild();
			nodo.setLeftChild(temp.getRightChild());
			temp.setRightChild(nodo);

			nodo.setHeight(max(height(nodo.getLeftChild()),
					height(nodo.getRightChild())) + 1);
			temp.setHeight(max(height(temp.getLeftChild()), nodo.getHeight()) + 1);
		}
		return temp;
	}

	public NodoAVL rotacionDoble(NodoAVL nodo, boolean esAIzquierda) {
		if (esAIzquierda) {
			// ROTACION SIMPLE A DERECHA SOBRE EL HIJO DERECHO DEL NODO
			// DESEQUILIBRADO
			// ROTACION SIMPLE A IZQUIERDA SOBRE EL NODO DESEQUILIBRADO
			nodo.setRightChild(rotacionSimple(nodo.getRightChild(), false));
			return rotacionSimple(nodo, true);

		} else {
			// ROTACION SIMPLE A IZQUIERDA SOBRE EL HIJO IZQUIERDO DEL NODO
			// DESEQUILIBRADO
			// AHORA ROTACION SIMPLE A DERECHA SOBRE EL NODO DESEQUILIBRADO
			nodo.setLeftChild(rotacionSimple(nodo.getLeftChild(), true));
			return rotacionSimple(nodo, false);

		}
	}

	private static int height(NodoAVL nodo) {
		if (nodo == null) {
			return -1;
		} else {
			return nodo.getHeight();
		}
	}
	private static int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
}
