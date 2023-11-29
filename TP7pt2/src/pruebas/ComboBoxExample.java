package pruebas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxExample {
    public static void main(String[] args) {
        // Crear un nuevo JFrame
        JFrame frame = new JFrame("Ejemplo de JComboBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Crear un JComboBox y agregar elementos
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Opción 1");
        comboBox.addItem("Opción 2");
        comboBox.addItem("Opción 3");

        // Agregar un ActionListener al JComboBox
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener la opción seleccionada
                String selectedOption = (String) comboBox.getSelectedItem();
                System.out.println("Opción seleccionada: " + selectedOption);
            }
        });

        // Agregar el JComboBox al JFrame
        frame.getContentPane().add(comboBox);

        // Mostrar el JFrame
        frame.setVisible(true);
    }
}