package tp6ContLin1.ej1interfazContenedorMetodos;
//EJERCICIO 1
//ESCRIBE UNA INTERFAZ CON LOS METODOS DE PILA Y COLA:
public interface Contenedor {
	public void meter(Object elemento);
	public Object sacar();
	public boolean estaVacia();
	public void limpiar();
}
