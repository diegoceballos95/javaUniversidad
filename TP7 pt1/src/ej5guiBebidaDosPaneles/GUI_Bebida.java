package ej5guiBebidaDosPaneles;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Bebida extends JFrame{
	 //ATRIBUTOS
    private JLabel etiqueta;
    private JPanel panelSup, panelInf;
    
    //CONSTRUCTOR
    public GUI_Bebida() {
        setTitle("GUI Bebida");
        setLayout(new BorderLayout());
        setSize(500, 260);
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
        panelSup = new JPanel();
        panelInf = new JPanel();
        panelSup.setBorder(new LineBorder(Color.BLACK, 2));
        panelInf.setBorder(new LineBorder(Color.BLACK, 2));
        panelSup.add(etiqueta);
        panelInf.add(botonCafe);
        panelInf.add(botonJugo);
        
        //AGREGO PANEL A VENTANA
        getContentPane().add(panelSup, BorderLayout.CENTER);
        getContentPane().add(panelInf, BorderLayout.SOUTH);
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