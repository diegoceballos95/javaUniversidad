package pruebas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonExample {
    public static void main(String[] args) {
        // Crear un nuevo JFrame
        JFrame frame = new JFrame("Ejemplo de JRadioButton");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Crear los JRadioButtons
        JRadioButton radioButton1 = new JRadioButton("Opción 1");
        JRadioButton radioButton2 = new JRadioButton("Opción 2");
        JRadioButton radioButton3 = new JRadioButton("Opción 3");

        // Crear un ButtonGroup y agregar los JRadioButtons
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        // Agregar un ActionListener a los JRadioButtons
        ActionListener radioListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener la opción seleccionada
                String selectedOption = ((JRadioButton) e.getSource()).getText();
                System.out.println("Opción seleccionada: " + selectedOption);
            }
        };
        radioButton1.addActionListener(radioListener);
        radioButton2.addActionListener(radioListener);
        radioButton3.addActionListener(radioListener);

        // Crear un JPanel y agregar los JRadioButtons
        JPanel panel = new JPanel();
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);

        // Agregar el JPanel al JFrame
        frame.getContentPane().add(panel);

        // Mostrar el JFrame
        frame.setVisible(true);
    }
}