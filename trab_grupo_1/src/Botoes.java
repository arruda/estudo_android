/*
 * Faça um programa em Java onde aparecem 3 botões: vermelho, 
 * azul e verde. A cor da janela muda de acordo com o botão 
 * clicado.
 */

import java.awt.*;
import java.awt.event.*;

public class Botoes extends WindowAdapter{
    Frame frm1 = new Frame("Botões");
    
    Panel pnl1 = new Panel(new GridLayout(8,4));
    

    private Button btnVermelho           = new Button("Vermelho");
    private Button btnAzul           = new Button("Azul");
    private Button btnVerde           = new Button("Verde");

    public Botoes(){

        frm1.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent a)
            {
                System.exit(0);
            }
        });
        

        btnVermelho.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	pnl1.setBackground(Color.red);
            }
        });

        btnAzul.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	pnl1.setBackground(Color.blue);
            }
        });

        btnVerde.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                pnl1.setBackground(Color.green);
                
            }
        });
        

        frm1.setSize(200,240);          // define tamanho do Frame
        frm1.setLocation(250,300);      // posiciona frame na tela
        frm1.setBackground(Color.white); // define a cor de fundo

        pnl1.add(btnVermelho);
        pnl1.add(btnAzul);
        pnl1.add(btnVerde);
        // Adicionar Panel ao Frame
        frm1.add(pnl1);

        // Mostrar o frame 
        frm1.setVisible(true);
    }
	public static void main(String[] args) {

        new Botoes();
	}

}
