package ej5guiSurtidorDelTP3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI_Surtidor extends JFrame{
	//ATRIBUTOS
	private JLabel etiquetaUltraD, etiquetaEuroD, etiquetaSuper, etiquetaInfinia;
	private JTextField textoUltraD,textoEuroD,textoSuper,textoInfinia,textoValorIngresado;
	private double cantDisponibleUD,cantDisponibleED,cantDisponibleSuper,cantDisponibleInfinia;
	private JButton botonComprar, botonRecargar;
	private ButtonGroup grupoBotones;
	private JRadioButton[] botonesRadioB;
	private JPanel panelTipo, panelEstadoActual;
	
	//CONSTRUCTOR
	public GUI_Surtidor() {
		setTitle("Surtidor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,250);
		setLayout(new GridLayout(1,2));
		
		armarPanelTipo();
		armarPanelEstadoActual();
		
		getContentPane().add(panelTipo);
		getContentPane().add(panelEstadoActual);
	}
	
	//PANEL DE TIPO
	private void armarPanelTipo() {
		//PANEL
		panelTipo = new JPanel();
		panelTipo.setLayout(new GridLayout(7,1));
		//RADIOBUTTONS Y BUTTON GROUP
		String[] combustible = {"UltraDiesel","EuroDiesel","Super","Infinia"};
		grupoBotones = new ButtonGroup();
		botonesRadioB = new JRadioButton[4];
		for(int i=0;i<4;i++) {
			botonesRadioB[i] = new JRadioButton(combustible[i]);
			botonesRadioB[i].setPreferredSize(new Dimension(100,50));
			panelTipo.add(botonesRadioB[i]);
			grupoBotones.add(botonesRadioB[i]);
		}
		botonesRadioB[0].setSelected(true);
		
		//VALOR
		textoValorIngresado = new JTextField();
		textoValorIngresado.setText("");
		panelTipo.add(textoValorIngresado);
		
		//BOTONES
		botonComprar = new JButton("Comprar");
		OyenteComprar oyenteCompra = new OyenteComprar();
		botonComprar.addActionListener(oyenteCompra);
		panelTipo.add(botonComprar);
		
		botonRecargar = new JButton("Recargar");
		OyenteRecargar oyenteRecarga = new OyenteRecargar();
		botonRecargar.addActionListener(oyenteRecarga);
		panelTipo.add(botonRecargar);
	}

	//PANEL DE ESTADO
	private void armarPanelEstadoActual() {
		panelEstadoActual = new JPanel();
		panelEstadoActual.setLayout(new GridLayout(4,1));
		
		cantDisponibleUD= 20000;
		panelEstadoActual.add(crearPanelUD(cantDisponibleUD));
		
		cantDisponibleED = 20000;
		panelEstadoActual.add(crearPanelED(cantDisponibleED));
		
		cantDisponibleSuper = 20000;
		panelEstadoActual.add(crearPanelS(cantDisponibleSuper));
		
		cantDisponibleInfinia = 20000;
		panelEstadoActual.add(crearPanelI(cantDisponibleInfinia));
	}
	
	//PANELES MUESTRA NIVEL COMBUSTIBLE
	private JPanel crearPanelUD(double contUD) {
		JPanel p= new JPanel();
		p.setLayout(new FlowLayout());
		etiquetaUltraD = new JLabel("UltraDiesel");
		textoUltraD = new JTextField(""+contUD,10);
		p.add(etiquetaUltraD);
		p.add(textoUltraD);
		return p;
	}
	private JPanel crearPanelED(double contED) {
		JPanel p= new JPanel();
		p.setLayout(new FlowLayout());
		etiquetaEuroD = new JLabel("EuroDiesel");
		textoEuroD = new JTextField(""+contED,10);
		p.add(etiquetaEuroD);
		p.add(textoEuroD);
		return p;
	}	
	private JPanel crearPanelS(double contS) {
		JPanel p= new JPanel();
		p.setLayout(new FlowLayout());
		etiquetaSuper = new JLabel("Super");
		textoSuper = new JTextField(""+contS,10);
		p.add(etiquetaSuper);
		p.add(textoSuper);
		return p;
	}	
	private JPanel crearPanelI(double contI) {
		JPanel p= new JPanel();
		p.setLayout(new FlowLayout());
		etiquetaInfinia = new JLabel("Infinia");
		textoInfinia = new JTextField(""+contI,10);
		p.add(etiquetaInfinia);
		p.add(textoInfinia);
		return p;
	}
	
	//OYENTE COMPRAR
	private class OyenteComprar implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			if(botonesRadioB[0].isSelected()) {
				System.out.println(botonesRadioB[0].getText() + " COMPRADO");
				double combActual = Double.parseDouble(textoUltraD.getText());
				double compra = Double.parseDouble(textoValorIngresado.getText());
				double nuevoValor = combActual - compra;
				textoUltraD.setText(Double.toString(nuevoValor));
			}
			if(botonesRadioB[1].isSelected()) {
				System.out.println(botonesRadioB[1].getText() + " COMPRADO");
				double combActual = Double.parseDouble(textoEuroD.getText());
				double compra = Double.parseDouble(textoValorIngresado.getText());
				double nuevoValor = combActual - compra;
				textoEuroD.setText(Double.toString(nuevoValor));
			}
			if(botonesRadioB[2].isSelected()) {
				System.out.println(botonesRadioB[2].getText() + " COMPRADO");
				double combActual = Double.parseDouble(textoSuper.getText());
				double compra = Double.parseDouble(textoValorIngresado.getText());
				double nuevoValor = combActual - compra;
				textoSuper.setText(Double.toString(nuevoValor));
			}
			if(botonesRadioB[3].isSelected()) {
				System.out.println(botonesRadioB[3].getText() + " COMPRADO");
				double combActual = Double.parseDouble(textoInfinia.getText());
				double compra = Double.parseDouble(textoValorIngresado.getText());
				double nuevoValor = combActual - compra;
				textoInfinia.setText(Double.toString(nuevoValor));
			}
		}
	}
	
	//OYENTE RECARGAR
	private class OyenteRecargar implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			if(botonesRadioB[0].isSelected()) {
				System.out.println(botonesRadioB[0].getText() + " RECARGADO");
				textoUltraD.setText("20000");
			}
			if(botonesRadioB[1].isSelected()) {
				System.out.println(botonesRadioB[1].getText() + " RECARGADO");
				textoEuroD.setText("20000");
			}
			if(botonesRadioB[2].isSelected()) {
				System.out.println(botonesRadioB[2].getText() + " RECARGADO");
				textoSuper.setText("20000");
			}
			if(botonesRadioB[3].isSelected()) {
				System.out.println(botonesRadioB[3].getText() + " RECARGADO");
				textoInfinia.setText("20000");
			}
		}
	}
}