package interfaceG;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

import esquinaNoroeste.EsquinaNoroeste;
import grafoDirigido.GrafoD;
import reader.Reader;

public class InterfaceG extends JFrame{
	private JPanel panelSuperior,panelInferior;
	private JTextField txtcantOr,txtcantDes,txtOri,txtOfer,txtDes,txtDema,txtCmin,txtCargaG;
	private JTextArea matrizCostos,matrizResultados;
	private JLabel mensajeErrorGrafo,mensajeErrorVectores,error1,error2,error3,error4;
	private JButton resolver,cargarGrafo;
	private GrafoD grafo;
	private EsquinaNoroeste esquina;
	
	/***************************************** INTERFACE********************************************/
	
	public InterfaceG(){
		setTitle("Problema de Transporte");
		setSize(1200,515);
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		
		armarPanelSuperior();
		armarPanelInferior();
		
		getContentPane().add(panelSuperior);
		getContentPane().add(panelInferior);	
	}
	
	private void armarPanelSuperior() {
		panelSuperior = new JPanel(new BorderLayout());
		
		//ARMO PANEL NORTE
		JPanel panelNorte = new JPanel(new FlowLayout());
		JLabel titulo = new JLabel("METODO ESQUINA NOROESTE");
		panelNorte.add(titulo);
		
		//ARMO PANEL CENTRAL
		JPanel panelCentral = new JPanel(new GridLayout(1,2));
		
		//ARMO PANEL IZQ. DEL CENTRO
		JPanel panelIzquierdo,panelOrigenes,panelDestino;
		panelIzquierdo= new JPanel();
		panelIzquierdo.setLayout(new GridLayout(4,1));
		panelOrigenes= new JPanel();
		panelDestino = new JPanel();
		
		txtCargaG = new JTextField("Ingrese ruta del grafo...",20);
		txtcantOr = new JTextField("0",5);
		txtcantDes = new JTextField("0",5);
		cargarGrafo = new JButton();
		cargarGrafo.setText("Cargar Grafo");
		OyenteCarga oyenteC = new OyenteCarga();
		cargarGrafo.addActionListener(oyenteC);
		JLabel cantOr = new JLabel("Cantidad Origenes: ");
		JLabel cantDes = new JLabel("Cantidad Destinos: ");
		mensajeErrorGrafo = new JLabel("");
		
		JPanel panelCarga = new JPanel(new FlowLayout());
		panelCarga.add(cargarGrafo);
		panelCarga.add(mensajeErrorGrafo);
		
		panelOrigenes.add(cantOr);
		panelOrigenes.add(txtcantOr);
		panelDestino .add(cantDes);
		panelDestino .add(txtcantDes);
		
		panelIzquierdo.add(txtCargaG);
		panelIzquierdo.add(panelCarga);
		panelIzquierdo.add(panelOrigenes);
		panelIzquierdo.add(panelDestino);
		
		//ARMO PANEL DER. DEL CENTRO
		JPanel panelDerecho;
		panelDerecho= new JPanel();
		panelDerecho.setLayout(new GridLayout(4,3));
		
		JLabel origenes = new JLabel("Ingrese Origenes: ");
		JLabel ofertas = new JLabel("Ofertas por origen: ");
		JLabel destinos = new JLabel("Ingrese Destinos: ");
		JLabel demandas = new JLabel("Demandas por destino: ");
		
		error1 =new JLabel("");
		error2 =new JLabel("");
		error3 =new JLabel("");
		error4 =new JLabel("");
		
		txtOri = new JTextField("separados por coma",15);
		txtOfer = new JTextField("separados por coma",15);
		txtDes = new JTextField("separados por coma",15);
		txtDema = new JTextField("separados por coma",15);
		
		panelDerecho.add(error1);
		panelDerecho.add(origenes);
		panelDerecho.add(txtOri);
		panelDerecho.add(error2);
		panelDerecho.add(ofertas);
		panelDerecho.add(txtOfer);
		panelDerecho.add(error3);
		panelDerecho.add(destinos);
		panelDerecho.add(txtDes);
		panelDerecho.add(error4);
		panelDerecho.add(demandas);
		panelDerecho.add(txtDema);
		
		panelCentral.add(panelIzquierdo);
		panelCentral.add(panelDerecho);
		
		//ARMO PANEL INFERIOR (BOTON RESOLVER)
		JPanel panelSur = new JPanel();
		panelSur.setLayout(new FlowLayout());
		this.mensajeErrorVectores = new JLabel();
		mensajeErrorVectores.setText("");
		resolver= new JButton();
		resolver.setText("RESOLVER");
		OyenteResolver oyenteR = new OyenteResolver();
		resolver.addActionListener(oyenteR);
		panelSur.add(resolver);
		panelSur.add(mensajeErrorVectores);
		
		panelSuperior.add(panelNorte,BorderLayout.NORTH);
		panelSuperior.add(panelCentral,BorderLayout.CENTER);
		panelSuperior.add(panelSur,BorderLayout.SOUTH);
	}
	
	private void armarPanelInferior() {
		panelInferior = new JPanel(new BorderLayout());
		
		//ARMO PANEL CENTRAL
		JPanel panelCentral = new JPanel();
		JLabel costos= new JLabel("Matriz Costos Minimos: ");
		matrizCostos = new JTextArea(12,40);
		matrizCostos.setEnabled(false);
		
		JLabel resultado= new JLabel("Matriz Resultado: ");
		matrizResultados = new JTextArea(12,40);
		matrizResultados.setEnabled(false);
		
		panelCentral.add(costos);
		panelCentral.add(matrizCostos);
		panelCentral.add(resultado);
		panelCentral.add(matrizResultados);
		
		//ARMO PANEL SUR
		JPanel panelSur= new JPanel();
		JLabel cMin= new JLabel("Costo Minimo: ");
		txtCmin = new JTextField(5);
		txtCmin.setEnabled(false);
		panelSur.add(cMin);
		panelSur.add(txtCmin);
		
		panelInferior.add(panelCentral,BorderLayout.CENTER);
		panelInferior.add(panelSur,BorderLayout.SOUTH);
	}
	
	//AGREGO OYENTES A LOS BOTONES
	
	private class OyenteResolver implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			cargaOriYDes();
			cargaOfeYDem();
			mostrarEsquinaNoroeste();
			mostrarMatrizResultado();
			mostrarCostoMinimo();	
		}
		
	}
	private class OyenteCarga implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			cargaG();
			grafo.muestraGrafo();
		}
		
	}
	
	/*********************** METODOS ************************************/
	
	//CARGA GRAFO DESDE LA INTERFACE
	private void cargaG() {
		ArrayList<String[]>data = new ArrayList<>();
		String ruta = txtCargaG.getText();
		Reader r1 = new Reader(ruta);
		try {
			r1.leerArchivo(data);
			int orden = Integer.parseInt(data.get(0)[0]);
			data.remove(0);
			grafo = new GrafoD(orden);
			grafo.cargarGrafo(data);
			esquina = new EsquinaNoroeste(grafo);
			mensajeErrorGrafo.setText("Listo");
		}catch(Exception e) {
			System.out.println(e.fillInStackTrace());
			mensajeErrorGrafo.setText("Error");
		}
	}
	
	//CARGA LOS ARRAY DE ORIGEN Y DESTINO
	private void cargaOriYDes() {
		int cantOrigenes = Double.valueOf(txtcantOr.getText()).intValue();
		int cantDestinos = Double.valueOf(txtcantDes.getText()).intValue();
		String origenes = txtOri.getText();
		String destinos = txtDes.getText();
		String aux;
		int i,j;
		boolean bandVector,bandString;
		
		esquina.setTamVecOrigenYDestino(cantOrigenes, cantDestinos);
		esquina.setCantOrigenes(cantOrigenes);
		esquina.setCantDestinos(cantDestinos);
		
		//CARGO VECTOR ORIGEN
		aux = "";
		i=0;j=0;
		bandVector = bandString = true;
		while(i<origenes.length() && bandVector && bandString) {
			if(origenes.charAt(i) == ',') {
				esquina.setVecOrigenes(Integer.valueOf(aux), j);
				aux="";
				j++;
			}else {
				aux+=origenes.charAt(i);
				if(i == origenes.length()-1) {
					esquina.setVecOrigenes(Integer.valueOf(aux), j);
					j++;
				}
			}
			i++;
			if(j == cantOrigenes)
				bandVector = false;
			if(i == origenes.length())
				bandString = false;
		}	
		if(!bandString && !bandVector) 
			error1.setText("Listo");
		else
			error1.setText("Error");
		
		//CARGO VECTOR DESTINO
		aux = "";
		i=0;j=0;
		bandVector = bandString = true;
		while(i<destinos.length() && bandVector && bandString) {
			if(destinos.charAt(i) == ',') {
				esquina.setVecDestinos(Integer.valueOf(aux), j);
				aux="";
				j++;
			}else {
				aux+=destinos.charAt(i);
				if(i == destinos.length()-1) {
					esquina.setVecDestinos(Integer.valueOf(aux), j);
					j++;
				}
			}
			i++;
			if(j == cantDestinos)
				bandVector = false;
			if(i == destinos.length())
				bandString = false;
		}		
		if(!bandString && !bandVector) 
			error3.setText("Listo");
		else
			error3.setText("Error");
	}
	
	//CARGA LOS ARRAYLIST DE OFERTA Y DEMANDA
	private void cargaOfeYDem() {
		int cantOfertas = esquina.getCantOrigenes();
		int cantDemandas = esquina.getCantDestinos();
		String ofertas = txtOfer.getText();
		String demandas = txtDema.getText();
		String aux;
		int i,j;
		boolean bandVector,bandString;
		
		esquina.inicializaOfertaDemanda();
		esquina.setCantOfertas(cantOfertas);
		esquina.setCantDemandas(cantDemandas);
		
		//CARGO ARRAYLIST DE OFERTAS
		aux = "";
		i=0;j=0;
		bandVector = bandString = true;
		while(i<ofertas.length() && bandVector && bandString) {
			if(ofertas.charAt(i) == ',') {
				esquina.agregarVecOfertas(Double.valueOf(aux));
				aux="";
				j++;
			}else {
				aux+=ofertas.charAt(i);
				if(i == ofertas.length()-1) {
					esquina.agregarVecOfertas(Double.valueOf(aux));
					j++;
				}
			}
			i++;
			if(j == cantOfertas)
				bandVector = false;
			if(i == ofertas.length())
				bandString = false;
		}
		
		if(!bandString && !bandVector) 
			error2.setText("Listo");
		else
			error2.setText("Error");
		
		//CARGO ARRAYLIST DE DEMANDAS
		aux = "";
		i=0;j=0;
		bandVector = bandString = true;
		while(i<demandas.length() && bandVector && bandString) {
			if(demandas.charAt(i) == ',') {
				esquina.agregarVecDemandas(Double.valueOf(aux));
				aux="";
				j++;
			}else {
				aux+=demandas.charAt(i);
				if(i == demandas.length()-1) {
					esquina.agregarVecDemandas(Double.valueOf(aux));
					j++;
				}
			}
			i++;
			if(j == cantDemandas)
				bandVector = false;
			if(i == demandas.length())
				bandString = false;
		}
		
		if(!bandString && !bandVector) 
			error4.setText("Listo");
		else
			error4.setText("Error");		
	}
	
	//MUESTRA DE RESULTADOS
	
	public void mostrarEsquinaNoroeste() {
		String matriz = esquina.matrizEsquinaNoroesteAux();
		this.matrizCostos.setText(matriz);
	}
	
	public void mostrarMatrizResultado() {
		String matriz = esquina.matrizResultado();
		this.matrizResultados.setText(matriz);
	}
	
	public void mostrarCostoMinimo() {
		double costo = esquina.calcularCostoMinimo();
		this.txtCmin.setText(""+costo);
	}
}
