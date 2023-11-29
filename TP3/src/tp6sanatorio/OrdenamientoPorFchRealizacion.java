package tp6sanatorio;
import java.util.Comparator;

public class OrdenamientoPorFchRealizacion implements Comparator<Cirugia>{

	public int compare(Cirugia c1, Cirugia c2) {
		return c1.getFchRealizacion().toString().compareTo(c2.getFchRealizacion().toString());
	}
}
