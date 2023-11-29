package ej3ConversorLongitudes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConversorLongitudes extends JFrame{
	//ATRIBUTOS
	private JTextField inicio, resultado;
	private JLabel etiquetaInicio, etiquetaResultado;
	private JComboBox<String> unidadInicial, unidadFinal;
	private JButton convertir;
	private JPanel panelInicial, panelResultado, panelBoton;
	private String[] medidas = {"mm", "cm", "dm", "m", "dam", "hm", "km"};
	//CONSTRUCTOR
	public ConversorLongitudes() {
		//VENTANA
		setTitle("Conversor Longitudes");
		setLayout(new FlowLayout());
		setSize(400,140);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//PANELES
		armarPanelInicial();
		armarPanelResultado();
		armarPanelBoton();
		//AGREGAR PANELES A VENTANA
		getContentPane().add(panelInicial);
		getContentPane().add(panelResultado);
		getContentPane().add(panelBoton);
	}
	private void armarPanelInicial() {
		panelInicial = new JPanel(new GridLayout(1,3));
		etiquetaInicio = new JLabel("Convertir");
//		etiquetaInicio.setHorizontalAlignment(SwingConstants.CENTER);
		inicio = new JTextField(10);
		//DESPLEGABLE		
		unidadInicial = new JComboBox<String>(medidas);
		//AGRAGAR A PANEL
		panelInicial.add(etiquetaInicio);
		panelInicial.add(inicio);
		panelInicial.add(unidadInicial);
	}
	private void armarPanelResultado() {
		panelResultado = new JPanel(new GridLayout(1,3));
		etiquetaResultado = new JLabel("a");
//		etiquetaResultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado = new JTextField(10);
		resultado.setEditable(false);
		//DESPLEGABLE
		unidadFinal = new JComboBox<String>(medidas);
		//AGRAGAR A PANEL
		panelResultado.add(etiquetaResultado);
		panelResultado.add(resultado);
		panelResultado.add(unidadFinal);
	}
	private void armarPanelBoton() {
		panelBoton = new JPanel();
		convertir = new JButton("Convertir");
		OyenteBoton oyente = new OyenteBoton();
		convertir.addActionListener(oyente);
		panelBoton.add(convertir);
	}
	
	//CONVERTIR UNIDADES
	private void convertir() {
		String medidaElegida1 = unidadInicial.getSelectedItem().toString();
		String medidaElegida2 = unidadFinal.getSelectedItem().toString();
		
		//DE MM A DEMAS UNIDADES
		if(medidaElegida1.equals("mm")) {
			if(medidaElegida2.equals("cm")) {
				Double valor = Double.parseDouble(inicio.getText()) / 10;
				resultado.setText(valor.toString());
			}else{
				if(medidaElegida2.equals("dm")) {
					Double valor = Double.parseDouble(inicio.getText()) / 100;
					resultado.setText(valor.toString());
				}else {
					if(medidaElegida2.equals("m")) {
						Double valor = Double.parseDouble(inicio.getText()) / 1000;
						resultado.setText(valor.toString());
					}else {
						if(medidaElegida2.equals("dam")) {
							Double valor = Double.parseDouble(inicio.getText()) / 10000;
							resultado.setText(valor.toString());
						}else {
							if(medidaElegida2.equals("hm")) {
								Double valor = Double.parseDouble(inicio.getText()) / 100000;
								resultado.setText(valor.toString());
							}else {
								if(medidaElegida2.equals("km")) {
									Double valor = Double.parseDouble(inicio.getText()) / 1000000;
									resultado.setText(valor.toString());
								}else {
									resultado.setText(inicio.getText());
								}
							}
						}
					}
				}
			}
		}
		//DE CM A DEMAS UNIDADES
		if(medidaElegida1.equals("cm")) {
			if(medidaElegida2.equals("dm")) {
				Double valor = Double.parseDouble(inicio.getText()) / 10;
				resultado.setText(valor.toString());
			}else{
				if(medidaElegida2.equals("m")) {
					Double valor = Double.parseDouble(inicio.getText()) / 100;
					resultado.setText(valor.toString());
				}else {
					if(medidaElegida2.equals("dam")) {
						Double valor = Double.parseDouble(inicio.getText()) / 1000;
						resultado.setText(valor.toString());
					}else {
						if(medidaElegida2.equals("hm")) {
							Double valor = Double.parseDouble(inicio.getText()) / 10000;
							resultado.setText(valor.toString());
						}else {
							if(medidaElegida2.equals("km")) {
								Double valor = Double.parseDouble(inicio.getText()) / 100000;
								resultado.setText(valor.toString());
							}else {
								if(medidaElegida2.equals("mm")) {
									Double valor = Double.parseDouble(inicio.getText()) * 10;
									resultado.setText(valor.toString());
								}else {
									resultado.setText(inicio.getText());
								}
							}
						}
					}
				}
			}
		}
		//DE DM A DEMAS UNIDADES
		if(medidaElegida1.equals("dm")) {
			if(medidaElegida2.equals("m")) {
				Double valor = Double.parseDouble(inicio.getText()) / 10;
				resultado.setText(valor.toString());
			}else{
				if(medidaElegida2.equals("dam")) {
					Double valor = Double.parseDouble(inicio.getText()) / 100;
					resultado.setText(valor.toString());
				}else {
					if(medidaElegida2.equals("hm")) {
						Double valor = Double.parseDouble(inicio.getText()) / 1000;
						resultado.setText(valor.toString());
					}else {
						if(medidaElegida2.equals("km")) {
							Double valor = Double.parseDouble(inicio.getText()) / 10000;
							resultado.setText(valor.toString());
						}else {
							if(medidaElegida2.equals("cm")) {
								Double valor = Double.parseDouble(inicio.getText()) * 10;
								resultado.setText(valor.toString());
							}else {
								if(medidaElegida2.equals("mm")) {
									Double valor = Double.parseDouble(inicio.getText()) * 100;
									resultado.setText(valor.toString());
								}else {
									resultado.setText(inicio.getText());
								}
							}
						}
					}
				}
			}
		}		
		//DE M A DEMAS UNIDADES
		if(medidaElegida1.equals("m")) {
			if(medidaElegida2.equals("dam")) {
				Double valor = Double.parseDouble(inicio.getText()) / 10;
				resultado.setText(valor.toString());
			}else{
				if(medidaElegida2.equals("hm")) {
					Double valor = Double.parseDouble(inicio.getText()) / 100;
					resultado.setText(valor.toString());
				}else {
					if(medidaElegida2.equals("km")) {
						Double valor = Double.parseDouble(inicio.getText()) / 1000;
						resultado.setText(valor.toString());
					}else {
						if(medidaElegida2.equals("dm")) {
							Double valor = Double.parseDouble(inicio.getText()) * 10;
							resultado.setText(valor.toString());
						}else {
							if(medidaElegida2.equals("cm")) {
								Double valor = Double.parseDouble(inicio.getText()) * 100;
								resultado.setText(valor.toString());
							}else {
								if(medidaElegida2.equals("mm")) {
									Double valor = Double.parseDouble(inicio.getText()) * 1000;
									resultado.setText(valor.toString());
								}else {
									resultado.setText(inicio.getText());
								}
							}
						}
					}
				}
			}
		}				
		//DE DAM A DEMAS UNIDADES
		if(medidaElegida1.equals("dam")) {
			if(medidaElegida2.equals("hm")) {
				Double valor = Double.parseDouble(inicio.getText()) / 10;
				resultado.setText(valor.toString());
			}else{
				if(medidaElegida2.equals("km")) {
					Double valor = Double.parseDouble(inicio.getText()) / 100;
					resultado.setText(valor.toString());
				}else {
					if(medidaElegida2.equals("m")) {
						Double valor = Double.parseDouble(inicio.getText()) * 10;
						resultado.setText(valor.toString());
					}else {
						if(medidaElegida2.equals("dm")) {
							Double valor = Double.parseDouble(inicio.getText()) * 100;
							resultado.setText(valor.toString());
						}else {
							if(medidaElegida2.equals("cm")) {
								Double valor = Double.parseDouble(inicio.getText()) * 1000;
								resultado.setText(valor.toString());
							}else {
								if(medidaElegida2.equals("mm")) {
									Double valor = Double.parseDouble(inicio.getText()) * 10000;
									resultado.setText(valor.toString());
								}else {
									resultado.setText(inicio.getText());
								}
							}
						}
					}
				}
			}
		}						
		
		//DE HM A DEMAS UNIDADES
		if(medidaElegida1.equals("hm")) {
			if(medidaElegida2.equals("km")) {
				Double valor = Double.parseDouble(inicio.getText()) / 10;
				resultado.setText(valor.toString());
			}else{
				if(medidaElegida2.equals("dam")) {
					Double valor = Double.parseDouble(inicio.getText()) * 10;
					resultado.setText(valor.toString());
				}else {
					if(medidaElegida2.equals("m")) {
						Double valor = Double.parseDouble(inicio.getText()) * 100;
						resultado.setText(valor.toString());
					}else {
						if(medidaElegida2.equals("dm")) {
							Double valor = Double.parseDouble(inicio.getText()) * 1000;
							resultado.setText(valor.toString());
						}else {
							if(medidaElegida2.equals("cm")) {
								Double valor = Double.parseDouble(inicio.getText()) * 10000;
								resultado.setText(valor.toString());
							}else {
								if(medidaElegida2.equals("mm")) {
									Double valor = Double.parseDouble(inicio.getText()) * 100000;
									resultado.setText(valor.toString());
								}else {
									resultado.setText(inicio.getText());
								}
							}
						}
					}
				}
			}
		}							
		//DE KM A DEMAS UNIDADES
		if(medidaElegida1.equals("km")) {
			if(medidaElegida2.equals("hm")) {
				Double valor = Double.parseDouble(inicio.getText()) * 10;
				resultado.setText(valor.toString());
			}else{
				if(medidaElegida2.equals("dam")) {
					Double valor = Double.parseDouble(inicio.getText()) * 100;
					resultado.setText(valor.toString());
				}else {
					if(medidaElegida2.equals("m")) {
						Double valor = Double.parseDouble(inicio.getText()) * 1000;
						resultado.setText(valor.toString());
					}else {
						if(medidaElegida2.equals("dm")) {
							Double valor = Double.parseDouble(inicio.getText()) * 10000;
							resultado.setText(valor.toString());
						}else {
							if(medidaElegida2.equals("cm")) {
								Double valor = Double.parseDouble(inicio.getText()) * 100000;
								resultado.setText(valor.toString());
							}else {
								if(medidaElegida2.equals("mm")) {
									Double valor = Double.parseDouble(inicio.getText()) * 1000000;
									resultado.setText(valor.toString());
								}else {
									resultado.setText(inicio.getText());
								}
							}
						}
					}
				}
			}
		}			
	//FIN	
	}
	
	private class OyenteBoton implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			convertir();
		}
		
	}
}
