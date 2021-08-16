package From;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Registrar extends JFrame {

	private JPanel contentPane;
	private JTextField txtApellido;
	private JTextField txtNombreDeUsuario;
	private JTextField textField;
	private JTextField txtNumeroDeTelefono;
	private JTextField txtCorreoElectrnico;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrar frame = new Registrar();
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
	public Registrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 258, 427);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtApellido = new JTextField();
		txtApellido.setText("Apellido");
		txtApellido.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtApellido.setColumns(10);
		txtApellido.setBounds(27, 134, 190, 28);
		contentPane.add(txtApellido);
		
		txtNombreDeUsuario = new JTextField();
		txtNombreDeUsuario.setText("Usuario");
		txtNombreDeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNombreDeUsuario.setColumns(10);
		txtNombreDeUsuario.setBounds(27, 45, 190, 28);
		contentPane.add(txtNombreDeUsuario);
		
		textField = new JTextField();
		textField.setText("Nombre");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBounds(27, 86, 190, 28);
		contentPane.add(textField);
		
		txtNumeroDeTelefono = new JTextField();
		txtNumeroDeTelefono.setText("N\u00FAmero de Telefono");
		txtNumeroDeTelefono.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNumeroDeTelefono.setColumns(10);
		txtNumeroDeTelefono.setBounds(27, 182, 190, 28);
		contentPane.add(txtNumeroDeTelefono);
		
		txtCorreoElectrnico = new JTextField();
		txtCorreoElectrnico.setText("Correo electr\u00F3nico");
		txtCorreoElectrnico.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCorreoElectrnico.setColumns(10);
		txtCorreoElectrnico.setBounds(27, 225, 190, 28);
		contentPane.add(txtCorreoElectrnico);
		
		JLabel lblRegistrar = new JLabel("Registro");
		lblRegistrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrar.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblRegistrar.setBounds(51, 11, 133, 23);
		contentPane.add(lblRegistrar);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.setBounds(70, 353, 114, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Contrase\u00F1a");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(32, 280, 96, 14);
		contentPane.add(lblNewLabel);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(27, 273, 190, 28);
		contentPane.add(passwordField);
		
		JLabel lblConfirmarContrasea = new JLabel(" Confirmar Contrase\u00F1a");
		lblConfirmarContrasea.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblConfirmarContrasea.setBounds(27, 320, 133, 14);
		contentPane.add(lblConfirmarContrasea);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setToolTipText("");
		passwordField_1.setBounds(27, 314, 190, 28);
		contentPane.add(passwordField_1);
	}
}
