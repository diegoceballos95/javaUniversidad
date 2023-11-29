package tp6sanatorio;
import java.util.Comparator;

public class OrdenamientoPorNombre implements Comparator<Cirugia> {

	public int compare(Cirugia c1, Cirugia c2) {
		return c1.getNombre().compareTo(c2.getNombre());
	}
	
	

}
