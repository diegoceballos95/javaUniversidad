package recursos;

public class NodoAVL {
	private Object nodoInfo;
	private NodoAVL leftChild, rightChild;
	public int altura;

	//CONSTRUCTORES
	public NodoAVL() {
		setNodoInfo(null);
		setLeftChild(null);
		setRightChild(null);
		setHeight(0);
	}
	public NodoAVL(Object nodoInfo) {
		this(nodoInfo, null, null);
	}
	public NodoAVL(Object nodoInfo, NodoAVL leftChild, NodoAVL rightChild) {
		setNodoInfo(nodoInfo);
		setLeftChild(leftChild);
		setRightChild(rightChild);
	}

	//GETTERS Y SETTERS
	public Object getNodoInfo() {
		return this.nodoInfo;
	}
	public void setNodoInfo(Object nodoInfo) {
		this.nodoInfo = nodoInfo;
	}
	public NodoAVL getLeftChild() {
		return this.leftChild;
	}
	public void setLeftChild(NodoAVL leftChild) {
		this.leftChild = leftChild;
	}
	public NodoAVL getRightChild() {
		return this.rightChild;
	}
	public void setRightChild(NodoAVL rightChild) {
		this.rightChild = rightChild;
	}
	public int getHeight() {
		return altura;
	}
	public void setHeight(int altura) {
		this.altura = altura;
	}
}
