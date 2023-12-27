package clase1;
import java.util.ArrayList;

public class TestColectivos {

	public static void main(String[] args) {
		
		Hibrido colH = new Hibrido(45, 1200000, 150, 2, Hibrido.ALTO_VOLTAJE);
		ColectivoDiesel colD = new ColectivoDiesel(50, 1000000, 200, 2);
		
		//USANDO LA CLASE ABSTRACTA COLECTIVO PARA EL ARRAYLIST()
		ArrayList<Colectivo> arr = new ArrayList<Colectivo>();
		arr.add(colH);
		arr.add(colD);
		
		for(Colectivo colectivo: arr) {
			if (colectivo instanceof Hibrido) {
				System.out.println("*** Colectivo Hibrido ***");
				System.out.println("N.Contaminacion: " + ((Hibrido) colectivo).getNivelContaminacion());
				System.out.println("ID: " + ((Hibrido) colectivo).getID());
				System.out.println("Voltaje: " + ((Hibrido) colectivo).getVoltaje());
			}
			else {
				System.out.println("*** Colectivo Diesel ***");
				System.out.println("N.Contaminacion: " + ((ColectivoDiesel) colectivo).getNivelContaminacion());
				System.out.println("ID: " + ((ColectivoDiesel) colectivo).getID());
			}
		}
		
		System.out.println("-----------------------------");
		
		//USANDO LA CLASE DIESEL (INTERFAZ) PARA EL ARRAYLIST, XQ TAMBIEN SE HEREDA DE ELLA...
		ArrayList<Diesel> arr2 = new ArrayList<Diesel>();
		arr2.add(colH);
		arr2.add(colD);
		
		for(Diesel colectivo: arr2) {
			if(colectivo instanceof Hibrido) {
				System.out.println("*** Colectivo Hibrido ***");
				System.out.println("N.Contaminacion: " + ((Hibrido) colectivo).getNivelContaminacion());
				System.out.println("ID: " + ((Hibrido) colectivo).getID());
			}
			else {
				System.out.println("*** Colectivo Diesel ***");
				System.out.println("N.Contaminacion: " + ((ColectivoDiesel) colectivo).getNivelContaminacion());
				System.out.println("ID: " + ((ColectivoDiesel) colectivo).getID());
			}
		}
		
		System.out.println("-----------------------------");
	
		//CONTINUANDO CON EL ARRAYLIST <COLECTIVO>
		ColectivoElectrico colE = new ColectivoElectrico(55, 900000, ColectivoElectrico.BAJO_VOLTAJE);
		arr.add(colE);
		
		for(Colectivo colectivo: arr) {
			if (colectivo instanceof Hibrido) {
				System.out.println("*** Colectivo Hibrido ***");
				System.out.println("N.Contaminacion: " + ((Hibrido) colectivo).getNivelContaminacion());
				System.out.println("ID: " + ((Hibrido) colectivo).getID());
				System.out.println("Voltaje: " + ((Hibrido) colectivo).getVoltaje());
			}
			else {
				if(colectivo instanceof ColectivoDiesel) {
					System.out.println("*** Colectivo Diesel ***");
					System.out.println("N.Contaminacion: " + ((ColectivoDiesel) colectivo).getNivelContaminacion());
					System.out.println("ID: " + ((ColectivoDiesel) colectivo).getID());
				}
				else{
					System.out.println("*** Colectivo Electrivo ***");
					System.out.println("Voltaje: " + ((ColectivoElectrico) colectivo).getVoltaje());
					System.out.println("ID: " + ((ColectivoElectrico) colectivo).getID());
				}

			}
		}
	}
}
