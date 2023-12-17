package excepciones;

class MiExcepcion extends Exception {
	  private String mensaje;

	  public MiExcepcion(String mensaje) {
	    this.mensaje = mensaje;
	  }

	  public String getMessage() {

	    return "Se ha producido MiExcepcion: " + mensaje;
	  }

	  public String toString() {

	    return "Se ha producido MiExcepcion: " + mensaje;
	  }
}