import java.awt.*;

import javax.swing.*;

public class exemplo4{
	public static void main(String[] args){
		Color red = new Color(255,0,0);
		
		JFrame frame = new JFrame("Teste de frame");
		Container cp =  frame.getContentPane();
		cp.setBackground(red);
//		cp.setSize(150, 150);
		TextComponent txtCp = new TextArea("UNIRIO");
		
		txtCp.setSize(100, 100);
		txtCp.setSize(new Dimension(150, 150));
		cp.add(txtCp);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setResizable(true);
		frame.setVisible(true);
		
		
	}
}