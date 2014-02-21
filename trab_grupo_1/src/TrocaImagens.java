import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;
import javax.swing.*;

public class TrocaImagens  extends WindowAdapter{

	Color red = new Color(255, 0, 0);
	JFrame frame = new JFrame("Imagens");
	Container cp = frame.getContentPane();
	Container imgCp = new Container();
	JButton variavel_sem_nome = new JButton("PONEY!");

	ImageIcon poneyFeliz = new ImageIcon("C:\\Users\\LABCCET\\Desktop\\hellponey2.png");
	ImageIcon poneyBolado = new ImageIcon("C:\\Users\\LABCCET\\Desktop\\hell2poney2.png");

	JLabel imgLabel = new JLabel(poneyFeliz);
	int troca = 0;
	
	public TrocaImagens(){

		cp.setBackground(red);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setResizable(true);
		frame.setVisible(true);
		
		



		frame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent a)
            {

                System.exit(0);
            }
        });
		
		variavel_sem_nome.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(troca % 2 == 0){
					imgLabel.setIcon(poneyBolado);
				}
				else{
					imgLabel.setIcon(poneyFeliz);
				}
				troca++;
			}
		});

		
		   frame.getContentPane().add(variavel_sem_nome, BorderLayout.LINE_START);

		   frame.add(imgLabel);
	}
	
	public static void main(String[] args) {
		new TrocaImagens();
	}
}