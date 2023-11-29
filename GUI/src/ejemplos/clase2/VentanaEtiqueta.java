package ejemplos.clase2;

import javax.swing.*;
import java.awt.*;

public class VentanaEtiqueta extends JFrame {
	//ATRIBUTOS
	JLabel etiqueta;

	//CONSTRUCTOR
	public VentanaEtiqueta(String tit) {
		super(tit);
		setSize(400, 300);
		etiqueta = new JLabel();
		etiqueta.setText("Sam");
		etiqueta.setIcon(new ImageIcon(getClass().getResource("imagenes/perro.jpg")));
		getContentPane().setBackground(Color.GREEN);
		getContentPane().add(etiqueta);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}