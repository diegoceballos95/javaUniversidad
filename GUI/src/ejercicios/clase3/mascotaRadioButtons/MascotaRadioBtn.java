package ejercicios.clase3.mascotaRadioButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.EventListener;

public class MascotaRadioBtn extends JFrame{
	private JLabel etiqueta;
	private ButtonGroup grupo;
	private JRadioButton[] botones;
	private JPanel panelControl, panelImagen;
	
	public MascotaRadioBtn() {
		//VENTANA
		setLayout(new BorderLayout());
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//PANELES
		armarPanelImagen();
		armarPanelBotones();
		//AGREGAR PANELES A VENTANA
		getContentPane().add(panelImagen, BorderLayout.WEST);
		getContentPane().add(panelControl, BorderLayout.EAST);
	}
	
	private void armarPanelBotones() {
		String[] mascotas = {"perro","gato","conejo","pato","cerdo"};
		Oyente oyente = new Oyente();
		grupo = new ButtonGroup();
		botones = new JRadioButton[5];
		panelControl = new JPanel();
		panelControl.setLayout(new GridLayout(5,1));
		for(int k=0; k<5; k++) {
			botones[k] = new JRadioButton(mascotas[k]);
			botones[k].setPreferredSize(new Dimension(100,30));
			botones[k].addItemListener(oyente);
			grupo.add(botones[k]);
			panelControl.add(botones[k]);
		}
		botones[0].setSelected(true);
	}
	
	private void armarPanelImagen() {
		panelImagen = new JPanel();
		etiqueta = new JLabel();
		etiqueta.setIcon(new ImageIcon(getClass().getResource("/perro.gif")));
		panelImagen.add(etiqueta);
	}
	
	private class Oyente implements ItemListener {
		public void itemStateChanged(ItemEvent evento) {
			JRadioButton radio = (JRadioButton) evento.getSource();
			String valor = radio.getText();
//			System.out.println(valor);
			etiqueta.setIcon(new ImageIcon(getClass().getResource("/"+valor+".gif")));
		}
	}
}
