package From;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import esperimento.Conexion;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public static void main(String[] args) {
	
	
	

public class form_Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField jpassClave;
	private JButton btnIngresar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form_Login frame = new form_Login();
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
	public form_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 178);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(97, 11, 133, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 70, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 110, 78, 14);
		contentPane.add(lblNewLabel_2);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(97, 68, 157, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		jpassClave = new JPasswordField();
		jpassClave.setBounds(98, 108, 159, 20);
		contentPane.add(jpassClave);
		
		btnIngresar = new JButton("Acceder");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char[] clave= jpassClave.getPassword();
				String ClaveFinal= new String(clave);
				
				if(txtUsuario.getText().equals("Next Time")&& ClaveFinal.equals("1234")){
					dispose();
					JOptionPane.showMessageDialog(null,"Bienvenido al Sistema","Ingresaste",JOptionPane.INFORMATION_MESSAGE);
					Menu p= new Menu();
					p.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null,"debe ingresar su usuario y contraseña","si no está registrado debe registrarse",JOptionPane.ERROR_MESSAGE);
					Menu p= new Menu();
					
					txtUsuario.setText("");
					jpassClave.setText("");
					txtUsuario.requestFocus();
					
				}
				
			}
		});
		btnIngresar.setBounds(288, 67, 89, 23);
		contentPane.add(btnIngresar);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registrar p= new Registrar();
				p.setVisible(true);
				form_Login s= new form_Login();
				s.setEnabled(true);
			}
			
		});
		btnNewButton.setForeground(Color.CYAN);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(288, 107, 89, 23);
		contentPane.add(btnNewButton);
	}
}
}
