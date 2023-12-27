package ej6LoginUser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class LoginUser extends JFrame{
	//ATRIBUTOS
	private JLabel usuario, password;
	private JTextField textoUser, textoPass;
	private JButton login, cancel;
	private JPanel panelUser, panelPass, panelBotones;
	private String lineaLeida;
	private String[] palabras;
	private static int CONTADOR = 0;

	//CONSTRUCTOR
	public LoginUser() {
		setTitle("Login");
		setSize(260,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,1));
        //ARCHIVO
        lineaLeida = new String();
        palabras = new String[2];
        //PANELES
        armarPanelUser();
        armarPanelPass();
        armarPanelBotones();
        //AGREGO PANELES A LA VENTANA
        getContentPane().add(panelUser);
        getContentPane().add(panelPass);
        getContentPane().add(panelBotones);
	}
		
	private void armarPanelUser() {
		panelUser = new JPanel();
		usuario = new JLabel("Usuario");
		textoUser = new JTextField(15);
		
		panelUser.add(usuario);
		panelUser.add(textoUser);

	}
	private void armarPanelPass() {
		panelPass = new JPanel();
		password = new JLabel("Password");
		textoPass = new JTextField(15);
		
		panelPass.add(password);
		panelPass.add(textoPass);
	}
	private void armarPanelBotones() {
		panelBotones = new JPanel();
		login = new JButton("Login");
		cancel = new JButton("Cancel");
		OyenteLogin oyenteL = new OyenteLogin();
		OyenteCancel oyenteC = new OyenteCancel();
		login.addActionListener(oyenteL);
		cancel.addActionListener(oyenteC);
		panelBotones.add(login);
		panelBotones.add(cancel);
	}
	
	//VERIFICACION DEL LOGIN
	private void comprobarLogin(String usuario, String password) {
		File archivo = null;
		FileReader fileR = null;
		BufferedReader bufferedR = null;
		try {
			//ABRIR FICHERO Y CREAR BUFFERED.READER QUE PERMITE LA LECTURA
			archivo = new File ("D:\\Documentos\\TUP 2022\\JAVA\\TP7pt2\\src\\ej6LoginUser\\loginData.txt");
			fileR = new FileReader (archivo);
			bufferedR = new BufferedReader(fileR);

			//LECTURA DE ARCHIVO
			boolean band = true;
			while((lineaLeida = bufferedR.readLine())!=null && band) {
				palabras = lineaLeida.split(" ");
				if(usuario.equals(palabras[0]) && password.equals(palabras[1])) {
					JOptionPane.showMessageDialog(null, "Login Exitoso");
					band = false;
					CONTADOR = 0;
				}
			}
			if(band) {
				JOptionPane.showMessageDialog(null, "Login Fallido");
				CONTADOR++;
			}
		}catch(Exception e){
			e.printStackTrace();
		}

		//EN EL FINALLY CERRAMOS EL FICHERO, PARA ASEGURARNOS QUE SE CIERRA TANTO SI TODO VA BIEN COMO SI SALTA  UNA EXCEPCION.
		finally{
			try{                    
				if( null != fileR ){   
					fileR.close();     
				}                  
			}catch (Exception e2){ 
				e2.printStackTrace();
			}
		}
	}
	
	//CLASES INTERNAS
	private class OyenteLogin implements ActionListener {
		public void actionPerformed(ActionEvent e) {	
			if(CONTADOR < 3) {
				comprobarLogin(textoUser.getText(), textoPass.getText());
			}
			else {
				JOptionPane.showMessageDialog(null, "No se permiten mas intentos");
			}
		}		
	}	
	private class OyenteCancel implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			textoUser.setText("");
			textoPass.setText("");
		}		
	}
}
