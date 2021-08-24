package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class PrincipalFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		PrincipalFrame frame = new PrincipalFrame();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public PrincipalFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHolaMundo = new JButton("Hola Mundo");
		btnHolaMundo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// acci�n del bot�n
			}
		});
		btnHolaMundo.setBounds(170, 11, 89, 23);
		contentPane.add(btnHolaMundo);
		
		JLabel lblSaludo = new JLabel("");
		lblSaludo.setBounds(77, 96, 281, 64);
		contentPane.add(lblSaludo);
	}
}
