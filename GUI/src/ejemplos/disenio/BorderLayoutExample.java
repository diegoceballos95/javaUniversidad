package ejemplos.disenio;

import java.awt.BorderLayout;
import javax.swing.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        // Crear un JFrame
        JFrame ventana = new JFrame("Ejemplo BorderLayout");
        
        // Crear un JPanel con BorderLayout
        JPanel panel = new JPanel(new BorderLayout());
        
        // Agregar componentes al panel en diferentes áreas
        panel.add(new JButton("Norte"), BorderLayout.NORTH);
        panel.add(new JButton("Sur"), BorderLayout.SOUTH);
        panel.add(new JButton("Este"), BorderLayout.EAST);
        panel.add(new JButton("Oeste"), BorderLayout.WEST);
        panel.add(new JButton("Centro"), BorderLayout.CENTER);
        
        // Agregar el panel a la ventana
        ventana.add(panel);
        
        // Configurar el cierre de la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Mostrar la ventana
        ventana.setSize(300, 200);
        ventana.setVisible(true);
    }
}