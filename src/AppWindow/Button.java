package AppWindow;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JOptionPane;

//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Button extends JFrame{ //implements ActionListener {

	private
	int x;
	int y;
	int width;
	int height;
	JButton jb;
	String titulo;
	
	//public void actionPerformed(ActionEvent e) {
		//JOptionPane.showMessageDialog(null, this.titulo);
		
		//System.exit(0);
	//}
	
	
	
	public Button(String titulo, int x, int y,int width,int height) {
				
		jb = new JButton(titulo);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.titulo = titulo;
		
		//jb.addActionListener(this);
	}
	public Button(String titulo,int x,int y) {
		
		
		jb = new JButton(titulo);
		this.x = x;
		this.y = y;
		this.width = 100;
		this.height = 40;
		this.titulo = titulo;
		
		//jb.addActionListener(this);
	}

	public int X() {
		return x;
	}
	public int Y() {
		return y;
	}
	public int Width() {
		return width;
	}
	public int Height() {
		return height;
	}
	
	public JButton Jbutton()
	{
		return jb;
	}
	

	

}
