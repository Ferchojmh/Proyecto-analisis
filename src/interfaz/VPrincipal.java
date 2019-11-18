package interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import java.awt.Dimension;
import javax.swing.SwingConstants;

public class VPrincipal extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3440876069331168614L;
	private JPanel contentPane;
	int key = 0;
	private JTextField txtNombre;
	private JTextField txtIdentificacion;
	private JTextField txtTelefono;
	private JTextField txtNombreevento;
	private JTextField txtHoraevento;

	JButton[][] matrizEventos;

	int filas = 3;
	int columnas = 5;

	/**
	 * Create the frame.
	 */
	public VPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(VPrincipal.class.getResource("/multimedia/starred_ticket_120px.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		matrizEventos = new JButton[filas][columnas];

		JLabel imagen = new JLabel("");
		imagen.setIcon(new ImageIcon(VPrincipal.class.getResource("/multimedia/starred_ticket_120px.png")));
		imagen.setBounds(10, 11, 120, 120);
		contentPane.add(imagen);

		JLabel lblBoletasapp = new JLabel("TuBoleta.app");
		lblBoletasapp.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblBoletasapp.setBounds(123, 50, 182, 50);
		contentPane.add(lblBoletasapp);

		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VRegistro miVR = new VRegistro(obtenerme());
				miVR.setVisible(true);
			}
		});
		btnRegistrarse.setFocusable(false);
		btnRegistrarse.setBackground(Color.WHITE);
		btnRegistrarse.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		btnRegistrarse.setBounds(854, 61, 120, 40);
		contentPane.add(btnRegistrarse);

		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VIngresar miIngresar = new VIngresar(obtenerme());
				miIngresar.setVisible(true);
			}
		});
		btnIngresar.setFocusable(false);
		btnIngresar.setBackground(Color.WHITE);
		btnIngresar.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		btnIngresar.setBounds(724, 60, 120, 40);
		contentPane.add(btnIngresar);

		ImageIcon publicidad = null;

		JLabel lblPublicidad = new JLabel("publicidad");
		lblPublicidad.setIcon(publicidad);
		lblPublicidad.setBackground(new Color(248, 248, 255));
		lblPublicidad.setBounds(854, 140, 120, 400);
		contentPane.add(lblPublicidad);

		TimerTask publicidadC = new TimerTask() {

			@Override
			public void run() {
				ImageIcon publicidad = null;
				switch (key) {
				case 0:
					publicidad = new ImageIcon(VPrincipal.class.getResource("/multimedia/16977001050139395159.jpg"));
					lblPublicidad.setIcon(publicidad);
					key = 1;
					break;
				case 1:
					publicidad = new ImageIcon(VPrincipal.class.getResource("/multimedia/10660832292084662386.jpg"));
					lblPublicidad.setIcon(publicidad);
					key = 0;
					break;
				}
			}
		};

		Timer timer = new Timer();
		timer.scheduleAtFixedRate(publicidadC, 2000, 5000);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setBounds(40, 140, 800, 400);
		contentPane.add(tabbedPane);

		JPanel eventos = new JPanel();
		tabbedPane.addTab("Eventos", new ImageIcon(VPrincipal.class.getResource("/multimedia/event_accepted_24px.png")),
				eventos, null);
		eventos.setLayout(new GridLayout(0, 1, 0, 0));

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBackground(Color.WHITE);
		eventos.add(scrollPane_1);

		JPanel Organizadores = new JPanel();
		Organizadores.setBackground(Color.WHITE);
		tabbedPane.addTab("Organizadores", new ImageIcon(VPrincipal.class.getResource("/multimedia/manager_24px.png")),
				Organizadores, null);
		Organizadores.setLayout(null);

		JLabel lblCreeSuEvento = new JLabel("Cree su evento");
		lblCreeSuEvento.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblCreeSuEvento.setBounds(6, 6, 255, 45);
		Organizadores.add(lblCreeSuEvento);

		JSeparator separator = new JSeparator();
		separator.setBounds(6, 87, 321, 2);
		Organizadores.add(separator);

		JLabel lblDatosDelResponsable = new JLabel("Datos del responsable:");
		lblDatosDelResponsable.setBounds(6, 73, 240, 16);
		Organizadores.add(lblDatosDelResponsable);

		txtNombre = new JTextField();
		txtNombre.setBounds(150, 101, 177, 28);
		Organizadores.add(txtNombre);
		txtNombre.setColumns(10);

		txtIdentificacion = new JTextField();
		txtIdentificacion.setBounds(150, 141, 177, 28);
		Organizadores.add(txtIdentificacion);
		txtIdentificacion.setColumns(10);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(16, 107, 130, 16);
		Organizadores.add(lblNombre);

		JLabel lblIdentificacion = new JLabel("Identificacion:");
		lblIdentificacion.setBounds(16, 147, 130, 16);
		Organizadores.add(lblIdentificacion);

		txtTelefono = new JTextField();
		txtTelefono.setBounds(150, 181, 177, 28);
		Organizadores.add(txtTelefono);
		txtTelefono.setColumns(10);

		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(16, 187, 130, 16);
		Organizadores.add(lblTelefono);

		JLabel lblDatosDelEvento = new JLabel("Datos del evento:");
		lblDatosDelEvento.setBounds(401, 73, 255, 16);
		Organizadores.add(lblDatosDelEvento);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(401, 87, 350, 2);
		Organizadores.add(separator_1);

		txtNombreevento = new JTextField();
		txtNombreevento.setBounds(574, 101, 177, 28);
		Organizadores.add(txtNombreevento);
		txtNombreevento.setColumns(10);

		JDateChooser fechaEvento = new JDateChooser();
		fechaEvento.setBackground(Color.WHITE);
		fechaEvento.setBounds(574, 141, 177, 28);
		Organizadores.add(fechaEvento);

		txtHoraevento = new JTextField();
		txtHoraevento.setText("hh/mm/ss");
		txtHoraevento.setToolTipText("");
		txtHoraevento.setBounds(574, 181, 177, 28);
		Organizadores.add(txtHoraevento);
		txtHoraevento.setColumns(10);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(574, 221, 177, 28);
		Organizadores.add(comboBox);

		JButton btnBoleteria = new JButton("Boleteria");
		btnBoleteria.setFocusable(false);
		btnBoleteria.setBackground(Color.WHITE);
		btnBoleteria.setBounds(574, 261, 177, 28);
		Organizadores.add(btnBoleteria);

		JLabel lblNombreDelEvento = new JLabel("Nombre del evento:");
		lblNombreDelEvento.setBounds(411, 107, 151, 16);
		Organizadores.add(lblNombreDelEvento);

		JLabel lblFechaDelEvento = new JLabel("Fecha del evento:");
		lblFechaDelEvento.setBounds(411, 147, 151, 16);
		Organizadores.add(lblFechaDelEvento);

		JLabel lblHoraDelEvento = new JLabel("Hora del evento:");
		lblHoraDelEvento.setBounds(411, 187, 151, 16);
		Organizadores.add(lblHoraDelEvento);

		JLabel lblLugarDelEvento = new JLabel("Lugar del evento:");
		lblLugarDelEvento.setBounds(411, 227, 151, 16);
		Organizadores.add(lblLugarDelEvento);

		JLabel lblPrecioDelEvento = new JLabel("Precio del evento:");
		lblPrecioDelEvento.setBounds(411, 267, 151, 16);
		Organizadores.add(lblPrecioDelEvento);

		JLabel lblInformacionAdicional = new JLabel("Informacion adicional:");
		lblInformacionAdicional.setBounds(411, 307, 151, 16);
		Organizadores.add(lblInformacionAdicional);

		JButton btncrearElEvento = new JButton("¡Crear el evento!");
		btncrearElEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i = 1;
				if (i == 0) {
					JOptionPane.showMessageDialog(null,
							"El Evento se ha creado correctamente, para mas informacion ingrese a su cuenta",
							"Creacion del evento", JOptionPane.DEFAULT_OPTION);
				} else {
					JOptionPane.showMessageDialog(null,
							"No hay ninguna cuenta con los datos diligenciados, corrobore su informacion o cree una cuenta",
							"Creacion del evento", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btncrearElEvento.setFocusable(false);
		btncrearElEvento.setBackground(Color.WHITE);
		btncrearElEvento.setBounds(50, 237, 250, 40);
		Organizadores.add(btncrearElEvento);

		JButton btnDescartar = new JButton("descartar");
		btnDescartar.setFocusable(false);
		btnDescartar.setBackground(Color.WHITE);
		btnDescartar.setBounds(50, 289, 250, 28);
		Organizadores.add(btnDescartar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(574, 301, 177, 55);
		Organizadores.add(scrollPane);

		JTextArea txtrInfoevento = new JTextArea();
		txtrInfoevento.setText("infoEvento");
		scrollPane.setViewportView(txtrInfoevento);
		tabbedPane.setDisabledIconAt(1,
				new ImageIcon(VPrincipal.class.getResource("/multimedia/client_company_24px.png")));

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		scrollPane_1.setViewportView(panel);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < columnas; j++) {
				JButton boton = new JButton();
				boton.setBackground(Color.WHITE);
				boton.setBounds((i * 240) + 50, (j * 220) + 60, 200, 200);
				boton.setText("Nombre evento");
				boton.setHorizontalTextPosition(SwingConstants.CENTER);
				boton.setVerticalTextPosition(SwingConstants.BOTTOM);
				boton.setIcon(new ImageIcon(VPrincipal.class.getResource("/multimedia/around_the_globe_100px.png")));
				panel.add(boton);
				panel.setPreferredSize(new Dimension(750, j * 300));
				boton.addActionListener(this);
				matrizEventos[i][j] = boton;
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (e.getSource() == matrizEventos[i][j]) {
					SeleccionZona miZona = new SeleccionZona(obtenerme());
					miZona.setVisible(true);
					ocultarse();
				}
			}
		}
	}

	public VPrincipal obtenerme() {
		return this;
	}

	public void ocultarse() {
		this.setVisible(false);
	}

	public void publicidad() {

	}
}
