package ejemplos.componentes1;

import javax.swing.*;
import java.awt.FlowLayout;

public class SwingExample {
    public static void main(String[] args) {
        //CREAR VENTANA
        JFrame ventana = new JFrame("Ejemplo Swing");
        
        //CREAR JLABEL
        JLabel etiqueta = new JLabel("¡Hola, mundo!");
        
        //CREAR JTextField
        JTextField textField = new JTextField(10);
        
        //CREAR JButton
        JButton boton = new JButton("Haz clic");
        
        //AGREGAR
        ventana.add(etiqueta);
        ventana.add(textField);
        ventana.add(boton);
        
        //DISEÑO
        ventana.setLayout(new FlowLayout());
        
        //ACCION DE BOTON
        boton.addActionListener(e -> {
            String texto = textField.getText();
            etiqueta.setText("¡Hola, " + texto + "!");
        });
        
        //CIERRE DE VENTANA
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //MOSTRAR VENTANA
        ventana.setSize(400, 200);
        ventana.setVisible(true);
    }
}