package ejercicios.clase3.Botonera;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botonera extends JFrame{
	private JPanel panelBotones;
	private JButton[] botones;
	
	public Botonera() {
		setTitle("BOTONERA");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panelBotones = new JPanel();
		botones = new JButton[5];
		armarBotonera();
		getContentPane().add(panelBotones);
	}
	
	private void armarBotonera() {
		Oyente oyenteB = new Oyente();
		for(int i=0; i<botones.length; i++) {
			botones[i] = new JButton();
			botones[i].setText(""+i);
			botones[i].setBackground(Color.WHITE);
			botones[i].addActionListener(oyenteB);
			panelBotones.add(botones[i]);
		}	
	}
	
	private class Oyente implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			JButton b = (JButton) evento.getSource();
			if(b.getBackground().equals(Color.WHITE)) {
				b.setBackground(Color.RED);
				b.setText("OK");
			}
			else {
				for(int i=0; i<botones.length; i++) {
					botones[i].setText(""+i);
					botones[i].setBackground(Color.WHITE);
				}	
			}
		}
	}
}
