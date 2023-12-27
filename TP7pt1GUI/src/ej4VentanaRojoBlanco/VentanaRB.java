package ej4VentanaRojoBlanco;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaRB extends JFrame{
	//DECLARAR BOTONES Y PANELES
	private JButton botonRojo, botonAzul;
	private JPanel panelColor, panelBotones;
	
	//CONSTRUCTOR
	public VentanaRB(){
		setLayout(new GridLayout(1,2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,120);	
		
		//CREAR BOTONES Y PANELES
		botonRojo = new JButton("Rojo");
		botonAzul = new JButton("Azul");
		panelColor = new JPanel();
		panelBotones = new JPanel();
		panelBotones.setLayout(new FlowLayout());
		panelColor.setLayout(new FlowLayout());
		
		//CREAR OYENTES Y REGISTRARLOS EN LOS BOTONES
		OyenteBotonR oyenteR = new OyenteBotonR();
		OyenteBotonV oyenteB =  new OyenteBotonV();
		botonRojo.addActionListener(oyenteR);
		botonAzul.addActionListener(oyenteB);
			
		//INSERT BOTONES EN PANEL.BOTONES Y PANELES EN PANEL DE CONTENIDO
		//EL ORDEN DE INSERCION INFLUYE EN LA APARIENCIA DEL GUI
		panelBotones.add(botonRojo);
		panelBotones.add(botonAzul);
		getContentPane().add(panelBotones);		
		getContentPane().add(panelColor);
					
	}
	
	//DEFINIR CLASES INTERNAS PARA ESTABLECER COMPORTAMIENTO DE LOS BOTONES
	private class OyenteBotonR implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent evento) {
			panelColor.setBackground(Color.RED);
		}
	}
	private class OyenteBotonV implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent evento) {
			panelColor.setBackground(Color.BLUE);
		}
	}	
}