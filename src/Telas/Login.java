package Telas;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import AppWindow.Button;
import AppWindow.Window2;

public class Login {
	
	public Login() {

	}
	
	public static void main( String[] args) 
	{
		Window2 jw = new Window2("Janela", 800, 600);
		
		//JButton b1 = new JButton("B1");		
		//JButton b2 = new JButton("B2");
		//JButton b3 = new JButton("B3");
		
		Button b4 = new Button("B4",350,350,350,40);
		
		Button b3 = new Button("B3",350,100);
		
		
		
		jw.AddButton(b4);
		
		jw.AddButton(b3);
		
		
		b4.Jbutton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		//jw.AddButton(b2,350,100);
		//jw.AddButton(b3,350,350,350,40);
		
		
		//b1.addActionListener(new ActionListener() {
			//public void actionPerformed(ActionEvent e) {
			
			//JOptionPane.showMessageDialog(null, "Ok im Working");
			//}
		//});
		
		
	}

}
