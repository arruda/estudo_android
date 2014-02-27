/*
 * Use a classe JFrame no exemplo 4.
 *
 */
import java.awt.Container;
import java.awt.Dimension;
import java.awt.TextArea;
import java.awt.TextComponent;

import javax.swing.JFrame;

public class Exemplo4 {

	public Exemplo4(){

		JFrame frame = new JFrame("Exemplo4");
		Container cp =  frame.getContentPane();
//		cp.setSize(150, 150);
		TextComponent txtCp = new TextArea(this.arraysLegais());
		
		txtCp.setSize(100, 100);
		txtCp.setSize(new Dimension(150, 150));
		cp.add(txtCp);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setResizable(true);
		frame.setVisible(true);
	}
	
	public String arraysLegais(){
		 String[] names = new String[3];
		 names[0] = "Maria";
		 names[1] = "Joao";
		 names[2] = "Teresa";
		 
		 return printArray(names);
	}
	
	private String printArray(String[] data) {
		String maiuscula = "";
		for (int i = 0; i < data.length; i++) {
			maiuscula = maiuscula.concat(data[i].toUpperCase() + "\n");
		}
		return maiuscula;
	}
	
	public static void main(String[] args) {
		new Exemplo4();
	}

}
