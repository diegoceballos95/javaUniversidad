package ej1contadorVariable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contador extends JFrame{
	//ATRIBUTOS
	private JTextField contador;
	private JButton decremento, aumento;
	private JPanel panelContador, panelBotones;
	//CONSTRUCTOR
	public Contador() {
		//VENTANA
		setTitle("Contador");
		setLayout(new BorderLayout());
		setSize(250,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//PANELES
		armarPanelContador();
		armarPanelBotones();
		//AGREGAR PANELES
		getContentPane().add(panelContador, BorderLayout.CENTER);
		getContentPane().add(panelBotones,  BorderLayout.SOUTH);
	}
	private void armarPanelContador() {
		panelContador = new JPanel();
		contador = new JTextField(5);
		contador.setText("10");
		contador.setEditable(false);
		panelContador.add(contador);
	}
	private void armarPanelBotones() {
		panelBotones = new JPanel();
		decremento = new JButton("-");
		aumento= new JButton("+");
		Oyente oyente = new Oyente();
		decremento.addActionListener(oyente);
		aumento.addActionListener(oyente);
		panelBotones.add(decremento);
		panelBotones.add(aumento);
	}
	private class Oyente implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			JButton botonElegido = (JButton)evento.getSource();
			int valor = Integer.parseInt(contador.getText());
			if(botonElegido.equals(decremento)) {
				valor--;
			}else {
				valor++;
			}
			String nuevoValor = Integer.toString(valor);
			contador.setText(nuevoValor);
		}
	}
}
