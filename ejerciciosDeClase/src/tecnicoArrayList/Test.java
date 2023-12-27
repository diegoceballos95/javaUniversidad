package tecnicoArrayList;

public class Test {

	public static void main(String[] args) {
		Tecnico competencias = new Tecnico();
		
		competencias.eliminarCompetencia();
		
		competencias.cargarCompetencia("Piola");
		competencias.cargarCompetencia("Lider");
		competencias.cargarCompetencia("Experimentado");
		competencias.cargarCompetencia("Malo");
		competencias.cargarCompetencia("Exigente");
		
		System.out.println("Posee " + competencias.cantidadCompentencias() + "competencias" );
		System.out.println(competencias);
		
		competencias.eliminarCompetencia("Lider");
		System.out.println(competencias);
		
	}

}