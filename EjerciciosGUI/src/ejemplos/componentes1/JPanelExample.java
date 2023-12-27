package ejemplos.componentes1;

import java.awt.FlowLayout;

import javax.swing.*;

public class JPanelExample {
    public static void main(String[] args) {
        //CREAR VENTANA
        JFrame ventana = new JFrame("Ejemplo JPanel");
        
        //CREAR PANEL
        JPanel panel = new JPanel();
        
        // DISEÑO
        panel.setLayout(new FlowLayout());
        
        //AGREGAR COMPONENTES AL PANEL
        JLabel etiqueta = new JLabel("¡Hola, mundo!");
        JButton boton = new JButton("Haz clic");
        panel.add(etiqueta);
        panel.add(boton);
        
        //AGREGAR PANEL A VENTANA
        ventana.add(panel);
        
        //CIERRE DE VENTANA
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //MOSTRAR VENTANA
        ventana.setSize(300, 200);
        ventana.setVisible(true);
    }
}