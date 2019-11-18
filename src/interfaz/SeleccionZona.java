package interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SeleccionZona extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public SeleccionZona(VPrincipal miPrincipal) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 360);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JButton btnPlatea = new JButton("");
		btnPlatea.setOpaque(false);
		btnPlatea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "siii");
				// 60 puestos
				SeleccionPuestos miPuestos = new SeleccionPuestos(12, 5, "Platea", obtenerme());
				miPuestos.setVisible(true);
				ocultarse();
			}
		});
		btnPlatea.setFocusable(false);
		btnPlatea.setBackground(Color.WHITE);
		btnPlatea.setBounds(149, 58, 133, 87);
		contentPane.add(btnPlatea);

		JButton btnPalco = new JButton("");
		btnPalco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 40 puestos
				SeleccionPuestos miPuestos = new SeleccionPuestos(8, 5, "Palco 1", obtenerme());
				miPuestos.setVisible(true);
				ocultarse();
			}
		});
		btnPalco.setOpaque(false);
		btnPalco.setFocusable(false);
		btnPalco.setBackground(Color.WHITE);
		btnPalco.setBounds(107, 136, 20, 20);
		contentPane.add(btnPalco);

		JButton btnPalco_1 = new JButton("");
		btnPalco_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 40 puestos
				SeleccionPuestos miPuestos = new SeleccionPuestos(8, 5, "Palco 2", obtenerme());
				miPuestos.setVisible(true);
				ocultarse();
			}
		});
		btnPalco_1.setOpaque(false);
		btnPalco_1.setFocusable(false);
		btnPalco_1.setBackground(Color.WHITE);
		btnPalco_1.setBounds(309, 135, 20, 20);
		contentPane.add(btnPalco_1);

		JButton btnPalco_2 = new JButton("");
		btnPalco_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 40 puestos
				SeleccionPuestos miPuestos = new SeleccionPuestos(8, 5, "Palco 3", obtenerme());
				miPuestos.setVisible(true);
				ocultarse();
			}
		});
		btnPalco_2.setOpaque(false);
		btnPalco_2.setFocusable(false);
		btnPalco_2.setBackground(Color.WHITE);
		btnPalco_2.setBounds(78, 168, 20, 20);
		contentPane.add(btnPalco_2);

		JButton btnPalco_3 = new JButton("");
		btnPalco_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 40 puestos
				SeleccionPuestos miPuestos = new SeleccionPuestos(8, 5, "Palco 4", obtenerme());
				miPuestos.setVisible(true);
				ocultarse();
			}
		});
		btnPalco_3.setOpaque(false);
		btnPalco_3.setFocusable(false);
		btnPalco_3.setBackground(Color.WHITE);
		btnPalco_3.setBounds(339, 164, 20, 20);
		contentPane.add(btnPalco_3);

		JButton btnParaiso = new JButton("");
		btnParaiso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 80 puestos
				SeleccionPuestos miPuestos = new SeleccionPuestos(16, 5, "Paraiso", obtenerme());
				miPuestos.setVisible(true);
				ocultarse();
			}
		});
		btnParaiso.setOpaque(false);
		btnParaiso.setFocusable(false);
		btnParaiso.setBackground(Color.WHITE);
		btnParaiso.setBounds(134, 262, 170, 20);
		contentPane.add(btnParaiso);

		JLabel imagen = new JLabel("");
		imagen.setIcon(new ImageIcon(SeleccionZona.class.getResource("/multimedia/Teatro Cali.png")));
		imagen.setBounds(0, 0, 464, 300);
		contentPane.add(imagen);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				miPrincipal.setVisible(true);
				ocultarse();
			}
		});
		btnAtras.setBackground(Color.WHITE);
		btnAtras.setBounds(170, 293, 90, 28);
		contentPane.add(btnAtras);
	}

	public SeleccionZona obtenerme() {
		return this;
	}

	public void ocultarse() {
		this.setVisible(false);
	}
}
