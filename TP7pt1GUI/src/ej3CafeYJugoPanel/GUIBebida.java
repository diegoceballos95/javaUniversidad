package ej3CafeYJugoPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIBebida extends JFrame{
	 //ATRIBUTOS
    private JLabel etiqueta;
    private JPanel panel;
    
    //CONSTRUCTOR
    public GUIBebida() {
        setTitle("GUI Bebida");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //BOTONES
        JButton botonCafe = new JButton("Café");
        JButton botonJugo = new JButton("Jugo");
        botonCafe.setBackground(Color.BLACK);
        botonCafe.setForeground(Color.WHITE);
        botonJugo.setBackground(Color.ORANGE);
        
        //ASIGNAR ACCION A BOTONES
        OyenteCafeB oyente1 = new OyenteCafeB();
        OyenteJugoB oyente2 = new OyenteJugoB();
        botonCafe.addActionListener(oyente1);
        botonJugo.addActionListener(oyente2);
        
        //ETIQUETA
        etiqueta = new JLabel();
        
        //PANEL
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(botonCafe);
        panel.add(botonJugo);
        panel.add(etiqueta);
        
        //AGREGO PANEL A VENTANA
        getContentPane().add(panel);
    }
    
    private class OyenteCafeB implements ActionListener{
    	public void actionPerformed(ActionEvent e) {
            etiqueta.setIcon(new ImageIcon(getClass().getResource("/cafe.gif")));
        }
    }
    
    private class OyenteJugoB implements ActionListener{
    	 public void actionPerformed(ActionEvent e) {
             etiqueta.setIcon(new ImageIcon(getClass().getResource("/jugo.gif")));
        }
    }  
}