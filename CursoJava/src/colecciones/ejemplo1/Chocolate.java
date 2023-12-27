package colecciones.ejemplo1;

public class Chocolate {
	
	private String variante;
	private String sabor;

	public Chocolate (String variante, String sabor) {
		this.variante = variante;
		this.sabor = sabor;
	}

	public String getVariante() {
		return variante;
	}
	public void setVariante(String variante) {
		this.variante = variante;
	}

	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	@Override
	public String toString() {
		return "Chocolate [variante=" + variante + ", sabor=" + sabor + "]";
	}
}
