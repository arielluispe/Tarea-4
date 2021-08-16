package From;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import esperimento.Conexion;


public class Menu extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 267);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conexion conexion= new Conexion();
				conexion.conectar();
				
				
				
			}
		});
		btnNewButton.setBounds(25, 34, 107, 23);
		contentPane.add(btnNewButton);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(25, 82, 107, 23);
		contentPane.add(btnActualizar);
		
		JButton btnElimimar = new JButton("Elimimar");
		btnElimimar.setBounds(25, 132, 107, 28);
		contentPane.add(btnElimimar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				JOptionPane.showMessageDialog(null,"Salio del sistema","Saliendo...",JOptionPane.INFORMATION_MESSAGE);
				form_Login j= new form_Login();
				j.setVisible(true);
				
				
				
			}
		});
		btnSalir.setBounds(601, 14, 107, 23);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("Clientes Registrados");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(349, 11, 211, 23);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(142, 38, 500, 179);
		contentPane.add(table);
	}
}
