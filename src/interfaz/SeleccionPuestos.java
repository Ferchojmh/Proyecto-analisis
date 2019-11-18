package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SeleccionPuestos extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int filas;
	int columnas;
	String zona;
	SeleccionZona miSZ;

	JButton[][] matrizBotones;
	int cont = 0;

	/**
	 * Create the frame.
	 */
	public SeleccionPuestos(int filas, int columnas, String zona, SeleccionZona miSZ) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, filas * 60, columnas * 60);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setLocationRelativeTo(null);

		matrizBotones = new JButton[filas][columnas];
		this.filas = filas;
		this.columnas = columnas;
		this.zona = zona;
		this.miSZ = miSZ;

		JLabel zonaT = new JLabel(zona + "");
		zonaT.setBounds(filas * 16, 10, 100, 30);
		zonaT.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		contentPane.add(zonaT);

		JButton btnComprar = new JButton("Comprar");
		btnComprar.setBackground(Color.WHITE);
		btnComprar.setBounds(filas * 12, columnas * 45, 120, 30);
		contentPane.add(btnComprar);
		btnComprar.setFocusable(false);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				miSZ.setVisible(true);
				ocultarse();
			}
		});
		btnAtras.setFocusable(false);
		btnAtras.setBackground(Color.WHITE);
		btnAtras.setBounds(filas * 20, columnas * 45, 120, 30);
		contentPane.add(btnAtras);

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				JButton boton = new JButton();
				boton.setBackground(Color.WHITE);
				boton.setBounds((i * 30) + 50, (j * 30) + 60, 30, 30);
				contentPane.add(boton);
				boton.addActionListener(this);
				matrizBotones[i][j] = boton;
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (e.getSource() == matrizBotones[i][j]) {
					if (cont < 8) {
						if (matrizBotones[i][j].getBackground() != Color.red) {
							matrizBotones[i][j].setBackground(Color.red);
							cont++;
						} else {
							matrizBotones[i][j].setBackground(Color.white);
							cont--;
						}
					} else {
						if (matrizBotones[i][j].getBackground() == Color.red) {
							matrizBotones[i][j].setBackground(Color.white);
							cont--;
						} else {
							JOptionPane.showMessageDialog(null, "Solo es permitido comprar 8 boletos por persona");
						}
					}
				}
			}
		}
	}
	
	public void ocultarse() {
		this.setVisible(false);
	}
}
