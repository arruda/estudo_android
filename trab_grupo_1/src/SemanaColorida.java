/*
 * Faça um programa em Java em que a cor da janela depende do 
 * dia da semana
 */

import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

public class SemanaColorida extends WindowAdapter{
    Frame frm1 = new Frame("Semana Colorida");
    
    Panel pnl1 = new Panel(new GridLayout(8,4));
    

    public SemanaColorida(){

        frm1.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent a)
            {
                System.exit(0);
            }
        });
        

        frm1.setSize(200,240);          // define tamanho do Frame
        frm1.setLocation(250,300);      // posiciona frame na tela
        frm1.setBackground(
			        		mudaCorPordia(
			        					diaDaSemana()
			        					)
        					); // define a cor de fundo

        // Adicionar Panel ao Frame
        frm1.add(pnl1);

        // Mostrar o frame 
        frm1.setVisible(true);
    }
    
    public static int diaDaSemana(){
    	Calendar cal = Calendar.getInstance();
    	return cal.get(Calendar.DAY_OF_WEEK);
    }
    
    public static Color mudaCorPordia(int diaDaSemana){
    	Color novaCor = new Color(diaDaSemana*30 ,diaDaSemana*30,diaDaSemana*30);
    	return novaCor;
    }
    
	public static void main(String[] args) {

        new SemanaColorida();
	}
	
	

}
