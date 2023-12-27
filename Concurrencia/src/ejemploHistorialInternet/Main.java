package ejemploHistorialInternet;

public class Main {

	public static void main(String[] args) {
		
		Historial historial = new Historial();
		
		Navegador n1 = new Navegador("www.google.com", historial);
		Navegador n2 = new Navegador("www.facebook.com", historial);
		
		n1.start();
		n2.start();
		
		try{
			n1.join();
			n2.join();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < historial.getIndex(); i++) {
			System.out.println(historial.getElemento(i));
		}
	}
}