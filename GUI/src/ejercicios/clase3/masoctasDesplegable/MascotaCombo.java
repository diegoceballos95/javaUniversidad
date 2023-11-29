package ejercicios.clase3.masoctasDesplegable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MascotaCombo extends JFrame{
	private JLabel etiqueta;
	private JComboBox<String> listaMascotas;
	private JPanel panelCombo, panelImagen;
	
	public MascotaCombo() {
		//VENTANA
		setLayout(new FlowLayout());
		setSize(400,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//PANELES
		armarPanelImagen();
		armarPanelCombo();
		//AGREGAR PANELES A VENTANA
		getContentPane().add(panelImagen);
		getContentPane().add(panelCombo);
	}
	
	private void armarPanelCombo() {
		String[] mascotas = {"perro","gato","conejo","pato","cerdo"};
		listaMascotas = new JComboBox<String>(mascotas);
		listaMascotas.setSelectedIndex(0);
		Oyente oyente = new Oyente();
		listaMascotas.addItemListener(oyente);
		panelCombo = new JPanel();
		panelCombo.add(listaMascotas);
	}
	
	private void armarPanelImagen() {
		panelImagen = new JPanel();
		etiqueta = new JLabel();
		etiqueta.setIcon(new ImageIcon(getClass().getResource("/perro.gif")));
		panelImagen.add(etiqueta);
	}
	
	private class Oyente implements ItemListener {
		public void itemStateChanged(ItemEvent evento) {
			JComboBox<String> item = (JComboBox) evento.getSource();
			String valor = item.getSelectedItem().toString();
			etiqueta.setIcon(new ImageIcon(getClass().getResource("/"+valor+".gif")));
		}
	}
}