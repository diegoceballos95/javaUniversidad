package ej6guiDosBebidas;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Dos_Bebidas extends JFrame{
	//ATRIBUTOS
    private JLabel etiquetaCafe, etiquetaJugo;
    private JPanel panelSupImag, panelInfBotones;
    private JButton[] botones;
    
    //CONSTRUCTOR
    public GUI_Dos_Bebidas() {
    	//VENTANA
        setTitle("GUI Dos Bebidas");
        setLayout(new BorderLayout());
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        //ETIQUETAS
        etiquetaCafe = new JLabel();
        etiquetaJugo = new JLabel();
        //PANELES Y BOTONES
        armarPanelSup();
        armarPanelInf();
        //AGREGAR PANELES A VENTANA
        getContentPane().add(panelSupImag, BorderLayout.CENTER);
        getContentPane().add(panelInfBotones, BorderLayout.SOUTH);       
    }
    
    //METODOS
    private void armarPanelSup() {
    	panelSupImag = new JPanel(new GridLayout(1,2));
    	panelSupImag.setBackground(Color.GRAY);
    	panelSupImag.setBorder(new LineBorder(Color.BLACK,5));
    	panelSupImag.add(etiquetaCafe);
    	panelSupImag.add(etiquetaJugo);  	
    }
    private void armarPanelInf() {
    	//CREAR PANEL
    	panelInfBotones = new JPanel();
    	panelInfBotones.setBackground(Color.GRAY);
    	panelInfBotones.setBorder(new LineBorder(Color.BLACK,5));
    	//CREAR OYENTE
    	Oyente oyenteB = new Oyente();
    	//CREAR BOTONERA
    	String[] bebidas = {"Cafe","Jugo"};
    	botones = new JButton[2];
    	for(int i=0; i<botones.length; i++) {
    		botones[i] = new JButton();
    		botones[i].setText(bebidas[i]);
    		botones[i].addActionListener(oyenteB);
    		panelInfBotones.add(botones[i]);
    	}
    }
    
    //CLASES INTERNAS
    private class Oyente implements ActionListener{
    	public void actionPerformed(ActionEvent evento) {
    		JButton b = (JButton) evento.getSource();
    		if (b.getText().equals("Cafe")) {
    			etiquetaCafe.setIcon(new ImageIcon(getClass().getResource("/cafe.gif")));
    			etiquetaJugo.setIcon(new ImageIcon(getClass().getResource("/Circulo.gif")));
    		}
    		else {
    			etiquetaCafe.setIcon(new ImageIcon(getClass().getResource("/Circulo.gif")));
    			etiquetaJugo.setIcon(new ImageIcon(getClass().getResource("/Jugo.gif")));
    		}
    	}
    }
}
