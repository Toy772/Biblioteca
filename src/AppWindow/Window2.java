package AppWindow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class Window2 extends JFrame {
	
	
	public Window2(String titulo, int sizeX,int sizeY) {
		
		
		setTitle(titulo);
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) tela.getWidth();
        int alt = (int) tela.getHeight();
        
		setBounds((lar/2) - (sizeX/2), (alt/2) - (sizeY/2) , sizeX, sizeY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void AddButton(JButton j,int x, int y,int width,int height) {
		
		add(j);
		setLayout(null);
		j.setBounds(x,y,width,height);
	}
	
	public void AddTextFiled(String desc,JTextField j,int x, int y,int width,int height) {
		
		add(j);
		setLayout(null);
		j.setBounds(x,y,width,height);
		j.setToolTipText(desc);
		j.setBounds(x, y, width, height);
	}
	
	public void AddButton(Button jb) {
		
		jb.Jbutton().setBounds(jb.X(),jb.Y(),jb.Width(),jb.Height());
		setLayout(null);
		add(jb.Jbutton());

	
	}
	public void AddButton(JButton jb, int x, int y) {
		
		jb.setBounds(x,y,100,40);
		setLayout(null);
		add(jb);	
	}		
	

}
