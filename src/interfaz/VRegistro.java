package interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VRegistro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6005296602672057271L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtIdentificacion;
	private JTextField txtCelular;
	private JTextField txtDireccion;
	private JTextField txtCorreo;
	private JPasswordField pwdContra;

	/**
	 * Create the frame.
	 */
	public VRegistro(VPrincipal miPrincipal) {
		setTitle("Registro");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(VRegistro.class.getResource("/multimedia/add_user_male_120px.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 510);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VRegistro.class.getResource("/multimedia/add_user_male_120px.png")));
		lblNewLabel.setBounds(6, 50, 120, 120);
		contentPane.add(lblNewLabel);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(VRegistro.class.getResource("/multimedia/business_contact_120px.png")));
		label.setBounds(308, 214, 120, 120);
		contentPane.add(label);

		JLabel lblDatosPersonales = new JLabel("Datos personales:");
		lblDatosPersonales.setBounds(133, 6, 295, 16);
		contentPane.add(lblDatosPersonales);

		JSeparator separator = new JSeparator();
		separator.setBounds(133, 20, 295, 2);
		contentPane.add(separator);

		txtNombre = new JTextField();
		txtNombre.setBounds(288, 34, 140, 28);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtIdentificacion = new JTextField();
		txtIdentificacion.setBounds(288, 74, 140, 28);
		contentPane.add(txtIdentificacion);
		txtIdentificacion.setColumns(10);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(138, 40, 156, 16);
		contentPane.add(lblNombre);

		JLabel lblIdentificacion = new JLabel("Numero de identificacion:");
		lblIdentificacion.setBounds(138, 80, 156, 16);
		contentPane.add(lblIdentificacion);

		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(138, 120, 156, 16);
		contentPane.add(lblGenero);

		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento.setBounds(138, 160, 156, 16);
		contentPane.add(lblFechaDeNacimiento);

		JLabel lblDatosDeContacto = new JLabel("Datos de contacto:");
		lblDatosDeContacto.setBounds(6, 200, 422, 16);
		contentPane.add(lblDatosDeContacto);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(6, 214, 422, 2);
		contentPane.add(separator_1);

		txtCelular = new JTextField();
		txtCelular.setText(" ");
		txtCelular.setBounds(136, 246, 160, 28);
		contentPane.add(txtCelular);
		txtCelular.setColumns(10);

		txtDireccion = new JTextField();
		txtDireccion.setText(" ");
		txtDireccion.setBounds(136, 286, 160, 28);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);

		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(19, 252, 107, 16);
		contentPane.add(lblCelular);

		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(19, 292, 107, 16);
		contentPane.add(lblDireccion);

		JLabel lblCuenta = new JLabel("Cuenta:");
		lblCuenta.setBounds(6, 320, 422, 16);
		contentPane.add(lblCuenta);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(6, 334, 422, 2);
		contentPane.add(separator_2);

		txtCorreo = new JTextField();
		txtCorreo.setBounds(200, 346, 160, 28);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);

		pwdContra = new JPasswordField();
		pwdContra.setEchoChar('●');
		pwdContra.setBounds(200, 386, 160, 28);
		contentPane.add(pwdContra);

		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(103, 352, 96, 16);
		contentPane.add(lblCorreo);

		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setBounds(103, 392, 96, 16);
		contentPane.add(lblContrasea);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Guardado...");
				ocultarse();
			}
		});
		btnGuardar.setBackground(Color.WHITE);
		btnGuardar.setBounds(115, 429, 90, 28);
		contentPane.add(btnGuardar);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ocultarse();
			}
		});
		btnSalir.setBackground(Color.WHITE);
		btnSalir.setBounds(222, 429, 90, 28);
		contentPane.add(btnSalir);

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(288, 154, 140, 28);
		contentPane.add(dateChooser);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(
				new String[] { "Seleccionar", "Masculino", "Femenino", "No binario" }));
		comboBox.setBounds(288, 114, 140, 28);
		contentPane.add(comboBox);
	}

	public void ocultarse() {
		this.setVisible(false);
	}

}
