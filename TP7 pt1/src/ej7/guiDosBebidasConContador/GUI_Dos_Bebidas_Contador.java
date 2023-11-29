package ej7.guiDosBebidasConContador;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Dos_Bebidas_Contador extends JFrame{
	//ATRIBUTOS
    private JLabel etiquetaCafe, etiquetaJugo, contCafe, contJugo;
    private JPanel panelSupImag, panelInf, panelInfContador, panelInfBotones;
    private JButton[] botones;
    
    //CONSTRUCTOR
    public GUI_Dos_Bebidas_Contador() {
    	//VENTANA
        setTitle("GUI Dos Bebidas");
        setLayout(new BorderLayout());
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        //ETIQUETAS
        etiquetaCafe = new JLabel();
        etiquetaJugo = new JLabel();
        contCafe = new JLabel("0");
        contJugo = new JLabel("0");
        //PANELES Y BOTONES
        armarPanelSup();
        armarPanelInf();
        //AGREGAR PANELES A VENTANA
        getContentPane().add(panelSupImag, BorderLayout.CENTER);
        getContentPane().add(panelInf, BorderLayout.SOUTH);       
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
    	//CREAR PANEL INFERIOR
    	panelInf = new JPanel(new GridLayout(2,1));
    	//CREAR PANEL CONTADOR
    	panelInfContador = new JPanel();
    	panelInfContador.setBackground(Color.GRAY);
    	panelInfContador.setBorder(new LineBorder(Color.BLACK,5));
    	panelInfContador.add(contCafe);
    	panelInfContador.add(contJugo);
    	panelInf.add(panelInfContador);
    	//CREAR PANEL BOTONES
    	panelInfBotones = new JPanel();
    	panelInfBotones.setBackground(Color.GRAY);
    	panelInfBotones.setBorder(new LineBorder(Color.BLACK,5));
    	panelInf.add(panelInfBotones);
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
    			String num = contCafe.getText();
    			int cont = Integer.parseInt(num);
    			cont++;
    			contCafe.setText(Integer.toString(cont));
    		}
    		else {
    			etiquetaCafe.setIcon(new ImageIcon(getClass().getResource("/Circulo.gif")));
    			etiquetaJugo.setIcon(new ImageIcon(getClass().getResource("/Jugo.gif")));
    			String num = contJugo.getText();
    			int cont = Integer.parseInt(num);
    			cont++;
    			contJugo.setText(Integer.toString(cont));
    		}
    	}
    }
}
