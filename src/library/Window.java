package library;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window{
	
	private JFrame frame;
	private JPanel TelaLogin;
	JPanel TelaMenu;
	Usuario user;
	private JTextField Login ;
	private JPasswordField senha;
	
	
	@SuppressWarnings("static-access")
	public Window() {
		
		frame = new JFrame();
		frame.setTitle("Biblioteca do Bairro");
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) tela.getWidth();
        int alt = (int) tela.getHeight();
        int sizeX = 800;
        int sizeY = 600;	
        
		frame.setBounds((lar/2) - (sizeX/2), (alt/2) - (sizeY/2) , sizeX, sizeY);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		TelaLogin();
		TelaMenu();
		
		TelaLogin.setVisible(true);
		TelaMenu.setVisible(false);		
		
		

				
	}
	public static void main(String[] args) {		
		Window w = new Window();
		w.frame.setVisible(true);
	}
	
	void TelaLogin() {
		
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
		
		JLabel LB_Login = new JLabel("Login:");
		LB_Login.setForeground(Color.WHITE);
		LB_Login.setBounds(550, 267, 81, 22);
		TelaLogin.add(LB_Login);
		
		JLabel ImgLogin = new JLabel();
		ImgLogin.setIcon(new ImageIcon("src\\Images\\User.png"));
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
				if(user.checkUser(Login.getText(),new String(senha.getPassword())))
				{
					TelaLogin.setVisible(false);
					TelaMenu.setVisible(true);
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
	
	void TelaMenu() {
		
		
		JPanel TelaGeral = new JPanel();
		TelaGeral.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(TelaGeral);
		TelaGeral.setLayout(null);
		
		TelaMenu = new JPanel();
		TelaMenu.setBackground(new Color(51, 102, 153));
		TelaMenu.setBounds(10, 10, 150, 545);
		TelaGeral.add(TelaMenu);
		TelaMenu.setLayout(null);
		
		JButton Listar_Livros_Bnt = new JButton("Listar Livros");
		Listar_Livros_Bnt.setFont(new Font("Arial", Font.BOLD, 13));
		Listar_Livros_Bnt.setBounds(10, 25, 130, 40);
		TelaMenu.add(Listar_Livros_Bnt);
		
		JButton Cadastrar_Livro_Bnt = new JButton("Cadastrar Livro");
		Cadastrar_Livro_Bnt.setFont(new Font("Arial", Font.BOLD, 13));
		Cadastrar_Livro_Bnt.setBounds(10, 75, 130, 40);
		TelaMenu.add(Cadastrar_Livro_Bnt);
		
		JButton Retirar_Livro_Bnt = new JButton("Retirar Livro");
		Retirar_Livro_Bnt.setFont(new Font("Arial", Font.BOLD, 13));
		Retirar_Livro_Bnt.setBounds(10, 125, 130, 40);
		TelaMenu.add(Retirar_Livro_Bnt);
		
		JButton Devolver_Livro_Bnt = new JButton("Devolver Livro");
		Devolver_Livro_Bnt.setFont(new Font("Arial", Font.BOLD, 13));
		Devolver_Livro_Bnt.setBounds(10, 175, 130, 40);
		TelaMenu.add(Devolver_Livro_Bnt);
		
		JButton Log_out_Bnt = new JButton("Log out");
		Log_out_Bnt.setFont(new Font("Arial", Font.BOLD, 13));
		Log_out_Bnt.setBounds(10, 225, 130, 40);
		TelaMenu.add(Log_out_Bnt);
		
		JLabel lbl_Icon_Usuario = new JLabel("");
		lbl_Icon_Usuario.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Icon_Usuario.setIcon(new ImageIcon("src\\Images\\User.png"));
		lbl_Icon_Usuario.setBounds(28, 384, 85, 70);
		TelaMenu.add(lbl_Icon_Usuario);
		
		JLabel lblUsuario = new JLabel("Usuario: Admin");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Arial", Font.BOLD, 12));
		lblUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsuario.setBounds(28, 464, 112, 19);
		TelaMenu.add(lblUsuario);
	}
	
}
