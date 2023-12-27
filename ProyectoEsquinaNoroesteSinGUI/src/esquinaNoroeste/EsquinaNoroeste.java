package esquinaNoroeste;

import java.util.ArrayList;
import java.util.Scanner;

import grafoDirigido.GrafoDirigido;

public class EsquinaNoroeste {
	protected GrafoDirigido grafo;
	protected Double[][] matrizNoroeste, matrizResultado, matrizNoroesteAux;
	protected int[] vectorOrigen, vectorDestino;
	protected ArrayList<Double> vectorOfertas, vectorDemandas, ofertaCopia, demandaCopia;
	protected int cantOrigenes, cantDestinos;
	
	public EsquinaNoroeste(GrafoDirigido grafo) {
		this.grafo = grafo;
	}
	
/******************************** ESQUINA NOROESTE ****************************************/	
	
	public void cargarOrigenDestino() {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese cantidad de Origenes:");
		this.cantOrigenes = in.nextInt();
		System.out.println("Ingrese cantidad de Destinos:");
		this.cantDestinos = in.nextInt();
		
		this.vectorDestino = new int[this.cantDestinos];
		this.vectorOrigen = new int[this.cantOrigenes];
		
		for(int i=0;i<this.cantOrigenes;i++) {
			System.out.println("Ingrese origen "+i+": ");
			this.vectorOrigen[i] = in.nextInt();
		}
		for(int i=0;i<this.cantDestinos;i++) {
			System.out.println("Ingrese destino "+i+": ");
			this.vectorDestino[i] = in.nextInt(); 
		}
	}
	
	public void cargarOfertaDemanda() {
		Scanner in = new Scanner(System.in);
		
		this.vectorDemandas = new ArrayList<Double>();
		this.vectorOfertas = new ArrayList<Double>();
		this.ofertaCopia = new ArrayList<Double>();
		this.demandaCopia = new ArrayList<Double>();
		
		for(int i=0;i<this.cantOrigenes;i++) {
			System.out.println("Ingrese oferta "+i+": ");
			this.vectorOfertas.add(in.nextDouble());
		}
		for(int i=0;i<this.cantDestinos;i++) {
			System.out.println("Ingrese demanda "+i+": ");
			this.vectorDemandas.add(in.nextDouble());
		}
		this.ofertaCopia.addAll(this.vectorOfertas);
		this.demandaCopia.addAll(this.vectorDemandas);
	}
	
	public void armarMatrizEsqNoroeste() {
		this.matrizNoroeste = new Double[this.cantOrigenes][this.cantDestinos];
		double costoFloyd;
		int k=0, m, i=0, j=0;
		
		while(k<this.cantOrigenes) {
			i = this.vectorOrigen[k];
			System.out.println(this.vectorOrigen[k]);
			m=0;
			while(m<this.cantDestinos) {
				j = this.vectorDestino[m];
				costoFloyd=(double)grafo.getMatrizCostoF().devolver(i,j);
				this.matrizNoroeste[k][m] = costoFloyd;
				m++;
			}
			k++;
		}
	}
	
	private void construirMatrizResultado() {
		double ofertaTotal = 0;
		double demanadaTotal = 0;
		for(double oferta: this.vectorOfertas) {
			ofertaTotal += oferta;
		}
		for(double demanda: this.vectorDemandas) {
			demanadaTotal += demanda;
		}
		
	    int filas = this.cantOrigenes;
	    int columnas = this.cantDestinos;
	    if(ofertaTotal > demanadaTotal) {
			this.vectorDemandas.add(ofertaTotal - demanadaTotal);
			this.matrizResultado = new Double[filas][columnas+1];
			this.matrizNoroesteAux = new Double[filas][columnas+1];
	    }
	    else if(ofertaTotal < demanadaTotal) {
	    	this.vectorOfertas.add(demanadaTotal - ofertaTotal);
	    	this.matrizResultado = new Double[filas+1][columnas];
			this.matrizNoroesteAux = new Double[filas+1][columnas];
	    }else {
	    	this.matrizResultado = new Double[filas][columnas];
			this.matrizNoroesteAux = new Double[filas][columnas];
	    }
		for(int i=0; i<this.matrizNoroesteAux.length; i++) {
			for(int j=0; j<this.matrizNoroesteAux[0].length; j++) {
				this.matrizNoroesteAux[i][j]=0.0;
			}
		}
		for(int i=0; i<filas; i++) {
			for(int j=0; j<columnas; j++) {
				this.matrizNoroesteAux[i][j] = this.matrizNoroeste[i][j];
			}
		}
	}

	public void trabajarMatrizResultado() {
		construirMatrizResultado();
		for(int i=0; i<this.matrizResultado.length; i++) {
			for(int j=0; j<this.matrizResultado[0].length; j++) {
				this.matrizResultado[i][j]=0.0;
			}
		}

        int i=0;
        int j=0;
        while(i<this.matrizResultado.length && j<this.matrizResultado[0].length) {
            if(this.vectorOfertas.get(i)>this.vectorDemandas.get(j)) {
                this.matrizResultado[i][j]=this.vectorDemandas.get(j);
                this.vectorOfertas.set(i, this.vectorOfertas.get(i)-this.vectorDemandas.get(j));
                j++;

            }else if(this.vectorOfertas.get(i)<this.vectorDemandas.get(j)){
            	this.matrizResultado[i][j]=this.vectorOfertas.get(i);
            	this.vectorDemandas.set(j, this.vectorDemandas.get(j) - this.vectorOfertas.get(i));
            	i++;
            }else {
            	this.matrizResultado[i][j]=this.vectorDemandas.get(j);
                this.vectorOfertas.set(i, 0.0);
               	this.vectorDemandas.set(j, 0.0);
               	i++;
               	j++;
            }
        }
    }
	
	private double calcularCostoMinimo() {
        double costoTotal=0;
        for(int i=0; i<this.matrizResultado.length; i++) {
            for(int j=0; j<this.matrizResultado[0].length; j++) {
                costoTotal += (double)this.matrizResultado[i][j] * (double)this.matrizNoroesteAux[i][j];
            }
        }
        return costoTotal;
    }
	
	private void mostrarMatrizEsquinaNoroesteAux() {
		System.out.println("\n***** MATRIZ ESQ. NOROESTE (COSTOS DE TRANSPORTE) *****");
		for(int destino: this.vectorDestino) {
			System.out.print("\tDes:" + destino);
		}
		for(int i=0; i<this.matrizNoroesteAux.length; i++) {
			System.out.println("");
			if(i<this.vectorOrigen.length) {System.out.print("Orig:" + this.vectorOrigen[i] + "\t");}
			else {System.out.print("\t");}
			
			for(int j=0; j<this.matrizNoroesteAux[0].length; j++) {
				System.out.print(this.matrizNoroesteAux[i][j] + "\t");
			}		
		}
		System.out.println("");
	}
	
	private void mostrarMatrizResultado() {
		System.out.println("\n***** MATRIZ ESQ. NOROESTE (CANT. TRANSPORTADA) *****");
		for(int destino: this.vectorDestino) {
			System.out.print("\tDes:" + destino);
		}
		for(int i=0; i<this.matrizResultado.length; i++) {
			System.out.println("");
			if(i<this.vectorOrigen.length) {System.out.print("Orig:" + this.vectorOrigen[i] + "\t");}
			else {System.out.print("\t");}
			
			for(int j=0; j<this.matrizResultado[0].length; j++) {
				System.out.print(this.matrizResultado[i][j] + "\t");
			}		
		}
		System.out.println("");
	}
	public void mostrarInformacion() {
		System.out.println("\n***** DATOS DEL GRAFO *****\n");
		grafo.muestraGrafo();
		System.out.println("\n***** DATOS DE LA MATRIZ DE COSTOS DE FLOYD *****\n");
		double costoF;
		for(int i=0;i<grafo.getOrden();i++){
			for(int j=0;j<grafo.getOrden();j++){
				if(i!=j){
					costoF=(double)grafo.getMatrizCostoF().devolver(i,j);
					if(costoF!=grafo.getInfinito()){System.out.println("Costo minimo de "+i+" hasta "+j+": "+costoF);}
				}						
			}
		}
		System.out.println("\n***** ORIGENES *****\n");
		for(int origen: this.vectorOrigen) {
			System.out.println(origen + "");
		}
		System.out.println("\n***** DESTINOS *****\n");
		for(int destino: this.vectorDestino) {
			System.out.println(destino + "");
		}
		System.out.println("\n***** OFERTAS *****\n");
		for(double oferta: this.ofertaCopia) {
			System.out.println(oferta + "");
		}
		System.out.println("\n***** DEMANDAS *****\n");
		for(double demanda: this.demandaCopia) {
			System.out.println(demanda + "");
		}
		mostrarMatrizEsquinaNoroesteAux();
		mostrarMatrizResultado();
		System.out.println("\n***** COSTO MINIMO *****\n");
		System.out.println("El costo minimo asociado es: " + calcularCostoMinimo());		
	}	
}
