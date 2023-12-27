package ej1ventanaEtiquetaCAFE;

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
        etiqueta.setText("CAFE");
        etiqueta.setIcon(new ImageIcon(getClass().getResource("/cafe.gif")));
        getContentPane().setBackground(Color.GREEN);
        getContentPane().add(etiqueta);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}