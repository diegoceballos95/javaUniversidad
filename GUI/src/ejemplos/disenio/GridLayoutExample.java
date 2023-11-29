package ejemplos.disenio;

import java.awt.GridLayout;
import javax.swing.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        // Crear un JFrame
        JFrame ventana = new JFrame("Ejemplo GridLayout");
        
        // Crear un JPanel con GridLayout
        JPanel panel = new JPanel(new GridLayout(2, 2));
        
        // Agregar componentes al panel
        panel.add(new JButton("Botón 1"));
        panel.add(new JButton("Botón 2"));
        panel.add(new JButton("Botón 3"));
        panel.add(new JButton("Botón 4"));
        panel.add(new JButton("Botón 5"));
        
        // Agregar el panel a la ventana
        ventana.add(panel);
        
        // Configurar el cierre de la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Mostrar la ventana
        ventana.setSize(300, 200);
        ventana.setVisible(true);
    }
}