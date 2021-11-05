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
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JInternalFrame;
import java.awt.Canvas;


public class WindowTest {

	private JFrame frame;
	Usuario user;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {		
			
	
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					WindowTest window = new WindowTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}

	public WindowTest() 
	{
		initialize();
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
		
		JPanel TelaGeral = new JPanel();
		TelaGeral.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(TelaGeral);
		TelaGeral.setLayout(null);
		
		JPanel Menu = new JPanel();
		Menu.setBackground(new Color(51, 102, 153));
		Menu.setBounds(10, 10, 150, 545);
		TelaGeral.add(Menu);
		Menu.setLayout(null);
		
		JButton Listar_Livros_Bnt = new JButton("Listar Livros");
		Listar_Livros_Bnt.setFont(new Font("Arial", Font.BOLD, 13));
		Listar_Livros_Bnt.setBounds(10, 25, 130, 40);
		Menu.add(Listar_Livros_Bnt);
		
		JButton Cadastrar_Livro_Bnt = new JButton("Cadastrar Livro");
		Cadastrar_Livro_Bnt.setFont(new Font("Arial", Font.BOLD, 13));
		Cadastrar_Livro_Bnt.setBounds(10, 75, 130, 40);
		Menu.add(Cadastrar_Livro_Bnt);
		
		JButton Retirar_Livro_Bnt = new JButton("Retirar Livro");
		Retirar_Livro_Bnt.setFont(new Font("Arial", Font.BOLD, 13));
		Retirar_Livro_Bnt.setBounds(10, 125, 130, 40);
		Menu.add(Retirar_Livro_Bnt);
		
		JButton Devolver_Livro_Bnt = new JButton("Devolver Livro");
		Devolver_Livro_Bnt.setFont(new Font("Arial", Font.BOLD, 13));
		Devolver_Livro_Bnt.setBounds(10, 175, 130, 40);
		Menu.add(Devolver_Livro_Bnt);
		
		JButton Log_out_Bnt = new JButton("Log out");
		Log_out_Bnt.setFont(new Font("Arial", Font.BOLD, 13));
		Log_out_Bnt.setBounds(10, 225, 130, 40);
		Menu.add(Log_out_Bnt);
		
		JLabel lbl_Icon_Usuario = new JLabel("");
		lbl_Icon_Usuario.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Icon_Usuario.setIcon(new ImageIcon("src\\Images\\Paciente.png"));
		lbl_Icon_Usuario.setBounds(28, 384, 85, 70);
		Menu.add(lbl_Icon_Usuario);
		
		JLabel lblUsuario = new JLabel("Usuario: Admin");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Arial", Font.BOLD, 12));
		lblUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsuario.setBounds(28, 464, 112, 19);
		Menu.add(lblUsuario);
		
		JPanel TelaConteudo = new JPanel();
		TelaConteudo.setLayout(null);
		TelaConteudo.setBounds(168, 10, 610, 545);
		TelaGeral.add(TelaConteudo);
		//-------Fima--da--Janela------------------
		
		
	}
}
