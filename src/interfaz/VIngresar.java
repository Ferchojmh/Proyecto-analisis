package interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VIngresar extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the frame.
	 */
	public VIngresar(VPrincipal miPrincipal) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setLocationRelativeTo(null);

		JLabel lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon(VIngresar.class.getResource("/multimedia/administrator_male_120px.png")));
		lblImagen.setBounds(86, 27, 120, 120);
		contentPane.add(lblImagen);

		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(17, 159, 100, 16);
		contentPane.add(lblUsuario);

		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setBounds(17, 194, 100, 16);
		contentPane.add(lblContrasea);

		textField = new JTextField();
		textField.setBounds(86, 153, 200, 28);
		contentPane.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(86, 188, 200, 28);
		contentPane.add(passwordField);

		JButton btniniciar = new JButton("¡Iniciar!");
		btniniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.getText().equals("usuario")) {
					String pass = new String(passwordField.getPassword());
					if (pass.equals("123")) {
						JOptionPane.showMessageDialog(null, "¡Bienvenido!");
						ocultarse();
					} else {
						JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
					}
				}
			}
		});
		btniniciar.setBackground(Color.WHITE);
		btniniciar.setFocusable(false);
		btniniciar.setBounds(50, 227, 90, 28);
		contentPane.add(btniniciar);

		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ocultarse();
			}
		});
		btnAtras.setBackground(Color.WHITE);
		btnAtras.setFocusable(false);
		btnAtras.setBounds(160, 227, 90, 28);
		contentPane.add(btnAtras);
	}

	public void ocultarse() {
		this.setVisible(false);
	}
}
