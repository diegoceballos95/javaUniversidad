package esquinaNoroeste;

import java.util.ArrayList;
import contenedores.MatrizGrafo;
import grafoDirigido.GrafoD;

public class EsquinaNoroeste {
	protected GrafoD grafo;
	protected MatrizGrafo matrizCostoF;
	protected Double[][] matrizNoroeste, matrizResultado, matrizNoroesteAux;
	protected int[] vectorOrigen, vectorDestino;
	protected ArrayList<Double> vectorOfertas, vectorDemandas;
	protected int cantOrigenes, cantDestinos,cantDemandas,cantOfertas;
	
	//CONSTRUCTOR
	public EsquinaNoroeste(GrafoD grafo) {
		this.grafo = grafo;
	}
	
	//GRAFO
	public void setGrafo(GrafoD grafo) {
		this.grafo = grafo;
	}
	
	//ORIGEN Y DESTINO
		public void setTamVecOrigenYDestino(int origenes,int destinos) {
			this.cantOrigenes = origenes;
			this.cantDestinos = destinos;
			this.vectorOrigen = new int[cantOrigenes];
			this.vectorDestino = new int[cantDestinos];
		}
		public void setVecOrigenes(int valor,int pos) {
			this.vectorOrigen[pos] = valor;
		}
		public void setVecDestinos(int valor,int pos) {
			this.vectorDestino[pos] = valor;
		}
		public void mostrarVecOrigenes() {
			System.out.println("VECTOR ORIGENES:");
			for(int i=0; i<vectorOrigen.length;i++) {
				System.out.print(vectorOrigen[i]+" , ");
			}
		}
		public void mostrarVecDestinos() {
			System.out.println("VECTOR DESTINOS:");
			for(int i=0; i<vectorDestino.length;i++) {
				System.out.print(vectorDestino[i]+" , ");
			}
		}
		public int getCantOrigenes() {
			return cantOrigenes;
		}
		public void setCantOrigenes(int cantOrigenes) {
			this.cantOrigenes = cantOrigenes;
		}
		public int getCantDestinos() {
			return cantDestinos;
		}
		public void setCantDestinos(int cantDestinos) {
			this.cantDestinos = cantDestinos;
		}
		
	//OFERTA Y DEMANDA
	public void inicializaOfertaDemanda() {
		this.vectorDemandas = new ArrayList<Double>();
		this.vectorOfertas = new ArrayList<Double>();
		this.cantOfertas = 0;
		this.cantDemandas = 0;
	}
	public void agregarVecOfertas(Double valor) {
		this.vectorOfertas.add(valor);
		this.cantOfertas++;
	}
	public void agregarVecDemandas(Double valor) {
		this.vectorDemandas.add(valor);
		this.cantDemandas++;
	}
	public void mostrarVecOfertas() {
		System.out.println("VECTOR OFERTAS:");
		for(int i=0; i<vectorOfertas.size();i++) {
			System.out.print(vectorOfertas.get(i)+" , ");
		}
	}
	public void mostrarVecDemandas() {
		System.out.println("VECTOR DEMANDAS:");
		for(int i=0; i<vectorDemandas.size();i++) {
			System.out.print(vectorDemandas.get(i)+" , ");
		}
	}
	public int getTamanioVecOfertas() {
		return this.vectorOfertas.size();
	}
	public int getTamanioVecDemandas() {
		return this.vectorDemandas.size();
	}
	public int getCantOfertas() {
		return cantOfertas;
	}
	public void setCantOfertas(int cantOfertas) {
		this.cantOfertas = cantOfertas;
	}
	public int getCantDemandas() {
		return cantDemandas;
	}
	public void setCantDemandas(int cantDemandas) {
		this.cantDemandas = cantDemandas;
	}

	//ARMO MATRIZ ESQ. NOROESTE (COSTO DE TRANSPORTE) A PARTIR DE FLOYD:
	public void armarMatrizEsqNoroeste() {	
		this.matrizCostoF = this.grafo.getMatrizCostosMinimos();
		this.matrizNoroeste = new Double[this.cantOrigenes][this.cantDestinos];
		double costoFloyd;
		int k=0, m, i=0, j=0;
		
		while(k<this.cantOrigenes) {
			i = this.vectorOrigen[k];
			m=0;
			while(m<this.cantDestinos) {
				j = this.vectorDestino[m];
				costoFloyd=(double)matrizCostoF.devolver(i,j);
				this.matrizNoroeste[k][m] = costoFloyd;
				m++;
			}
			k++;
		}
	}
	
	//CONSTRUIR MATRIZ RESULTADO (SEGUN BALANCE DE OFERTA Y DEMANDA)
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
	
	//ASIGNACION DE CANTIDADES TRASPORTADAS
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
	
	//COSTO MINIMO TOTAL
	public double calcularCostoMinimo() {
        double costoTotal=0;
        for(int i=0; i<this.matrizResultado.length; i++) {
            for(int j=0; j<this.matrizResultado[0].length; j++) {
                costoTotal += (double)this.matrizResultado[i][j] * (double)this.matrizNoroesteAux[i][j];
            }
        }
        return costoTotal;
    }
	
	//MUESTRA DE MATRIZ ESQ. NOROESTE (COSTOS DE TRANSPORTE)
	public String matrizEsquinaNoroesteAux() {
		armarMatrizEsqNoroeste();
		trabajarMatrizResultado();
		String matriz="";
		for(int destino: this.vectorDestino) {
			matriz+= "\tDes:" + destino;
		}
		matriz += "\n";
		for(int i=0; i<this.matrizNoroesteAux.length; i++) {
			if(i<this.vectorOrigen.length) {
				matriz += "Orig:" + this.vectorOrigen[i] + "\t";
			}
			else {matriz += "\t";}
			for(int j=0; j<this.matrizNoroesteAux[0].length; j++) {
				matriz+=this.matrizNoroesteAux[i][j] + "\t";
			}
			matriz += "\n";
		}
		matriz+="\n";
		return matriz;
	}
	
	//MUESTRA DE MATRIZ RESULTADO (CANTIDADES TRASPORTADAS DE UN PUNTO A OTRO)
	public String matrizResultado() {
		String matriz = "";
		for(int destino: this.vectorDestino) {
			matriz+= "\tDes:" + destino;
		}
		matriz += "\n";
		for(int i=0; i<this.matrizResultado.length; i++) {
			matriz+="\n";
			if(i<this.vectorOrigen.length) {
				matriz += "Orig:" + this.vectorOrigen[i] + "\t";
			}
			else {matriz += "\t";}
			for(int j=0; j<this.matrizResultado[0].length; j++) {
				matriz+=this.matrizResultado[i][j] + "\t";
			}		
		}
		matriz+="\n";
		return matriz;
	}
}

