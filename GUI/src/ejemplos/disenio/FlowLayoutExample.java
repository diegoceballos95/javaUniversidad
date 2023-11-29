package ejemplos.disenio;

import java.awt.FlowLayout;
import javax.swing.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        // Crear un JFrame
        JFrame ventana = new JFrame("Ejemplo FlowLayout");
        
        // Crear un JPanel con FlowLayout
        JPanel panel1 = new JPanel(new FlowLayout());
        
        // Agregar componentes al panel
        panel1.add(new JButton("Botón 1"));
        panel1.add(new JButton("Botón 2"));
        panel1.add(new JButton("Botón 3"));
        panel1.add(new JButton("Botón 4"));
        panel1.add(new JButton("Botón 5"));
        
        // Agregar el panel a la ventana
        ventana.add(panel1);
        
        // Configurar el cierre de la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Mostrar la ventana
        ventana.setSize(300, 300);
        ventana.setVisible(true);
    }
}