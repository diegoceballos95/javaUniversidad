package ejercicios.clase1ConversorKM;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiFrame extends JFrame{
	//ATRIBUTOS
	private JButton convertir;
	private JLabel metros, kilometros;
	private JTextField linea1, linea2;
	private JPanel panelMetros, panelKm, panelConvertir;
	
	//CONSTRUCTOR
	public MiFrame() {
		//MODIFICO VENTANA
		setLayout(new GridLayout(3,1));
		setSize(400,140);
		setTitle("Conversor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//CREAR ETIQUETAS
		this.metros = new JLabel("Metros");
		this.kilometros = new JLabel("Kilometros");
		
		//CREAR LINEA INSERCION TEXTO
		this.linea1 = new JTextField(20);
		this.linea2 = new JTextField(20);
		this.linea2.setEditable(false);
		
		//CREAR PANELES
		this.panelMetros = new JPanel(new FlowLayout());
		this.panelKm = new JPanel(new FlowLayout());
		this.panelConvertir = new JPanel(new FlowLayout());
		
		//CREAR BOTONES Y ASOCIAR AL OYENTE
		this.convertir = new JButton("Convertir");
		OyenteBotonConvertir oyenteC = new OyenteBotonConvertir();
		this.convertir.addActionListener(oyenteC);
		
		//AGREGO PANELES A VENTANA PRINCIPAL
		getContentPane().add(this.panelMetros);
		getContentPane().add(this.panelKm);
		getContentPane().add(this.panelConvertir);
		
		//AGREGO COMPONENTES AL PANEL
		this.panelMetros.add(this.metros);
		this.panelMetros.add(this.linea1);
		this.panelKm.add(this.kilometros);
		this.panelKm.add(this.linea2);
		this.panelConvertir.add(this.convertir);		
	}
	
	//DEFINIR CLASES INTERNAS
	private class OyenteBotonConvertir implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent evento) {
			double metros = Double.parseDouble(linea1.getText());
			double kilometros = metros / 1000;
			String km = Double.toString(kilometros);
			linea2.setText(km);
		}
	}
}
