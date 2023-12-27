package ejemplos.clase2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPanelRojoBlanco extends JFrame{
	//DECLARAR BOTONES Y PANELES
	private JButton botonRojo, botonVerde;
	private JPanel panelColor, panelBotones;
	
	//CONSTRUCTOR
	public VentanaPanelRojoBlanco(){
		setLayout(new GridLayout(2,1));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,120);	
		
		//CREAR BOTONES Y PANELES
		botonRojo = new JButton("Rojo");
		botonVerde = new JButton("Verde");
		panelColor = new JPanel();
		panelBotones = new JPanel();
		panelBotones.setLayout(new FlowLayout());
		panelColor.setLayout(new FlowLayout());
		
		//CREAR OYENTES Y REGISTRARLOS EN LOS BOTONES
		OyenteBotonR oyenteR = new OyenteBotonR();
		OyenteBotonV oyenteB =  new OyenteBotonV();
		botonRojo.addActionListener(oyenteR);
		botonVerde.addActionListener(oyenteB);
			
		//INSERT BOTONES EN PANEL.BOTONES Y PANELES EN PANEL DE CONTENIDO
		//EL ORDEN DE INSERCION INFLUYE EN LA APARIENCIA DEL GUI
		panelBotones.add(botonRojo);
		panelBotones.add(botonVerde);
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
			panelColor.setBackground(Color.GREEN);
		}
	}	
}
