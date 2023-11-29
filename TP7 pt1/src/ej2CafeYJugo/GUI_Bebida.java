package ej2CafeYJugo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Bebida extends JFrame{
	 //ATRIBUTOS
    private JLabel etiqueta;
 
    //CONSTRUCTOR
    public GUI_Bebida() {
        setTitle("GUI Bebida");
        setSize(400, 250);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //BOTONES
        JButton botonCafe = new JButton("Café");
        JButton botonJugo = new JButton("Jugo");
        //ASIGNAR ACCION A BOTONES
        OyenteCafeB oyente1 = new OyenteCafeB();
        OyenteJugoB oyente2 = new OyenteJugoB();
        botonCafe.addActionListener(oyente1);
        botonJugo.addActionListener(oyente2);
        
        //ETIQUETA
        etiqueta = new JLabel();
        
        //AGREGO PANEL A VENTANA
        getContentPane().add(botonCafe);
        getContentPane().add(botonJugo);
        getContentPane().add(etiqueta);
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
