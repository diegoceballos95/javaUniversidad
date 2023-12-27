package colecciones.ejemplo2;

public class Pila<E> {
	
	//CLASE INTERNA
    class Nodo {
        public E info;
        public Nodo sig;
    }
    
    //ATRIBUTOS
    private Nodo raiz;
    
    //METODOS
    public void insertar(E x) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = x;
        if (raiz == null) {
            nuevo.sig = null;
            raiz = nuevo;
        } else {
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }

    public E extraer() {
        if (raiz != null) {
            E informacion = raiz.info;
            raiz = raiz.sig;
            return informacion;
        } else {
            return null;
        }
    }

    public int cantidad() {
        int cant = 0;
        Nodo reco = raiz;
        while (reco != null) {
            reco = reco.sig;
            cant++;
        }
        return cant;
    }
}