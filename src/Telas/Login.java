package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;

import library.Usuario;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField Login_field;
	private JPasswordField passwordField;
	




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//-----------------------------------------------
		
		
		
		//CreateAdmin();
		
		//------------------------------------------------
		
		frame = new JFrame();
		frame.setBounds(100, 100, 703, 571);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList< Usuario> userlist = new ArrayList<>();				
				userlist.add(new Usuario("Admin","123"));
				
				if(userlist.get(0).checkUser(Login_field.getText(), new String(passwordField.getPassword())))
				{
					JOptionPane.showMessageDialog(null,"ok validado");
				}else {
					JOptionPane.showMessageDialog(null,"ops algo deu errado");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(514, 334, 100, 40);
		frame.getContentPane().add(btnNewButton);
		
		Login_field = new JTextField();
		Login_field.setBounds(494, 242, 150, 30);
		frame.getContentPane().add(Login_field);
		Login_field.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(494, 282, 150, 30);
		frame.getContentPane().add(passwordField);
	}
}
