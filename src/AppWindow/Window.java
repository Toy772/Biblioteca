package AppWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

import java.awt.FlowLayout;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import javax.swing.JLabel;

import javax.swing.ImageIcon;
import javax.swing.JTextField;

import library.Usuario;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JDesktopPane;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;


public class Window {

	private JFrame frame;
	private JPanel TelaLogin;
	Usuario user;
	private JTextField Login ;
	private JPasswordField senha;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {		
			
	
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}

	public Window() 
	{
		initialize();
	}
	
	void TelaDeLogin()
	{
		//Criacao--da--Tela--de--Login---------------------
				
				user = new Usuario("admin","admin");
				

				
				TelaLogin = new JPanel();
				TelaLogin.setBackground(new Color(51, 102, 153));
				TelaLogin.setToolTipText("Login");
				TelaLogin.setBounds(0, 0, 800, 600);
				frame.getContentPane().add(TelaLogin);
				TelaLogin.setLayout(null);
				
				Login = new JTextField();
				Login.setToolTipText("Login");
				Login.setBounds(550, 299, 150, 30);
				TelaLogin.add(Login);
				
				senha = new JPasswordField();
				senha.setToolTipText("Senha");
				senha.setBounds(550, 359, 150, 30);
				TelaLogin.add(senha);
								
				JLabel LabelSenha = new JLabel("Senha:");
				LabelSenha.setForeground(Color.WHITE);
				LabelSenha.setBounds(550, 335, 81, 22);
				TelaLogin.add(LabelSenha);
				
				JLabel lblLogin = new JLabel("Login:");
				lblLogin.setForeground(Color.WHITE);
				lblLogin.setBounds(550, 267, 81, 22);
				TelaLogin.add(lblLogin);
				
				JLabel ImgLogin = new JLabel();
				ImgLogin.setIcon(new ImageIcon("src\\Images\\Paciente.png"));
				ImgLogin.setBounds(586, 140, 69, 83);
				TelaLogin.add(ImgLogin);
				
				JPanel panelLeft = new JPanel();
				panelLeft.setBounds(0, 0, 465, 600);
				TelaLogin.add(panelLeft);
				panelLeft.setLayout(null);
				
				JLabel imgLivros = new JLabel();
				imgLivros.setIcon(new ImageIcon("src\\Images\\Libary.png"));
				imgLivros.setBounds(80, 173, 257, 301);
				panelLeft.add(imgLivros);
				
				JLabel LetreiroTitulo = new JLabel("BIBLIOTECA DO BARRO");
				LetreiroTitulo.setForeground(Color.GRAY);
				LetreiroTitulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
				LetreiroTitulo.setBounds(98, 40, 257, 85);
				panelLeft.add(LetreiroTitulo);
				
				JButton Entrar = new JButton("ENTRAR");
				Entrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						System.out.println(new String(senha.getPassword()));
						if(user.checkUser(Login.getText(),new String(senha.getPassword())))
						{
							TelaLogin.setVisible(false);
						}
						else {
							
							JOptionPane.showMessageDialog(null, "Dados Incorretos");
						}
						
					}
				});
				Entrar.setBounds(559, 423, 133, 30);
				TelaLogin.add(Entrar);				
				
				
				
				//----------------fim--da--tela--Login----------------------
	}


	private void initialize() 
	{
		//criacao--da--janela----------------------
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setResizable(false);
		
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) tela.getWidth();
        int alt = (int) tela.getHeight();
        int sizeX = 800;
        int sizeY = 600;		
		
		frame.setBounds((lar/2) - (sizeX/2), (alt/2) - (sizeY/2) , sizeX, sizeY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//-------Fima--da--Janela------------------
		
		TelaDeLogin();
		
	}
}
