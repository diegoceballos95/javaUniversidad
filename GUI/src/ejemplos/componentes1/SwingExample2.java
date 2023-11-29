package ejemplos.componentes1;

import java.awt.GridLayout;

import javax.swing.*;

public class SwingExample2 {
    public static void main(String[] args) {
        //CREAR VENTANA
        JFrame ventana = new JFrame("Ejemplo Swing");
        
        //CREAR JLabel
        JLabel etiqueta = new JLabel("Seleccione una opción:");
        
        //JComboBox
        String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};
        JComboBox<String> comboBox = new JComboBox<>(opciones);
        
        //JCheckBox
        JCheckBox checkBox = new JCheckBox("Acepto los términos y condiciones");
        
        //CREAR JTextArea DENTRO DE UN JScrollPane
        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        //CREAR JButton
        JButton boton = new JButton("Enviar");
        
        //AGREGAR COMPONENTES A VENTANA
        ventana.add(etiqueta);
        ventana.add(comboBox);
        ventana.add(checkBox);
        ventana.add(scrollPane);
        ventana.add(boton);
        
        //DISEÑO
        ventana.setLayout(new GridLayout(6, 1));
        
        //ACCION DEL BOTON
        boton.addActionListener(e -> {
            String opcionSeleccionada = (String) comboBox.getSelectedItem();
            String mensaje = "Opción seleccionada: " + opcionSeleccionada + "\n";
            mensaje += "Términos y condiciones aceptados: " + checkBox.isSelected();
            textArea.setText(mensaje);
        });
        
        //CIERRE DE VENTANA
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //MOSTRAR VENTANA
        ventana.setSize(300, 300);
        ventana.setVisible(true);
    }
}