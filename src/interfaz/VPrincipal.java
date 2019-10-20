package interfaz;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;

public class VPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3440876069331168614L;
	private JPanel contentPane;
	int key = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VPrincipal frame = new VPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
				// TODO Auto-generated method stub
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
		
				JScrollPane Eventos = new JScrollPane();
				Eventos.setToolTipText("");
				tabbedPane.addTab("Eventos", new ImageIcon(VPrincipal.class.getResource("/multimedia/event_accepted_24px.png")),
						Eventos, null);
				tabbedPane.setDisabledIconAt(0,
						new ImageIcon(VPrincipal.class.getResource("/multimedia/event_accepted_tentatively_24px.png")));

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		tabbedPane.addTab("Organizadores", new ImageIcon(VPrincipal.class.getResource("/multimedia/manager_24px.png")),
				panel, null);
		tabbedPane.setDisabledIconAt(1,
				new ImageIcon(VPrincipal.class.getResource("/multimedia/client_company_24px.png")));
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
