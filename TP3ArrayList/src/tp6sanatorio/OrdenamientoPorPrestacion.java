package tp6sanatorio;
import java.util.Comparator;

public class OrdenamientoPorPrestacion implements Comparator<Cirugia>{
	
	public int compare(Cirugia c1, Cirugia c2){
		return c1.getdPrestacion() - c2.getdPrestacion();
	}
}
