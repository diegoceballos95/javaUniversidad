package clase2;
import java.util.ArrayList;

public class Pedido {
	//ATRIBUTOS
	private ArrayList<PiezaCeramica> piezas;
	private FormaDePago formaDePago;
	
	//CONSTRUCTOR
	Pedido(){
		this.piezas = new ArrayList<PiezaCeramica>();
	}
	
	//METODOS
	public void agregarPieza(PiezaCeramica pieza) {
		this.piezas.add(pieza);
	}
	public void setFormaDePago(FormaDePago formaDePago) {
		this.formaDePago = formaDePago;
	}
	public double calcularTotal() {
		double total = 0;
		for(PiezaCeramica pieza: this.piezas) {
			if(pieza instanceof Azulejo) {
				total += ((Azulejo)pieza).getPrecioFinal();
			}
			else{
				total += ((Baldosa)pieza).getPrecioFinal();
			}
		}
		return total;
	}
	public void pagar() {
		double montoFinal = this.formaDePago.pagar(calcularTotal());
		System.out.println("El monto de su compra es: $: " + calcularTotal());
		if(this.formaDePago instanceof PagoFacil) {
			System.out.println("Por pagar con Pago Facil, su monto final es: $" + montoFinal);
		}
		else{
			if(this.formaDePago instanceof MercadoPago) {
				System.out.println("Por pagar con MercadoPago, su monto final es: $" + montoFinal);
			}
			else {
				System.out.println("Por pagar con Tarjeta de Credito, su monto final es: $" + montoFinal);
			}
		}
	}
}
