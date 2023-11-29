package ej1TP2;

public class Tarjeta {
	public static void main(String[] args) {
		TCredito JPTarjeta = new TCredito("666","JPerez","BcoPatagonia",2000,10000);
		TCredito DMTarjeta = new TCredito("777","DMaradona","BcoGalicia",5000,100000);
		JPTarjeta.muestraDatos();
		DMTarjeta.muestraDatos();
	}
}
