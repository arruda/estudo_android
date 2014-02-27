import java.awt.*;
import java.awt.event.*;

public class Calculadora2 extends WindowAdapter
{
    // criando o Frame
    Frame frm1 = new Frame("Calculadora2");
    
    // criando o Panel
    Panel pnl1 = new Panel(new GridLayout(4,5));
    
    // criando os Botoes
    private Button btn1           = new Button("1");
    private Button btn2           = new Button("2");
    private Button btn3           = new Button("3");
    private Button btn4           = new Button("4");
    private Button btn5           = new Button("5");
    private Button btn6           = new Button("6");
    private Button btn7           = new Button("7");
    private Button btn8           = new Button("8");
    private Button btn9           = new Button("9");
    private Button btn0           = new Button("0");
    private Button btnLimpar      = new Button("Clr");
    private Button btnSomar       = new Button("+");
    private Button btnDiminuir    = new Button("-");
    private Button btnDividir     = new Button("/");
    private Button btnMultiplicar = new Button("x");

    private Button btnRaiz = new Button("√");
    private Button btnPotencia = new Button("^");
    private Button btnResultado   = new Button("=");
    
    // Criando o Visor
    private TextField txtF1 = new TextField("");
    
    // variaveis de valor
    private float valor1 = 0, valor2 = 0; 
    private int operacao = 0; // somar = 1; Subtrair = 2; Dividir = 3; Multiplicar = 4
    
    public Calculadora2()
    {
        frm1.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent a)
            {
                System.exit(0);
            }
            public void windowOpened(WindowEvent a)
            {
                txtF1.requestFocus();
            }
        });
        btn1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	if (operacao == -1)
            	{	
                	txtF1.setText("");
                	operacao = 0;
            	}
                String texto = txtF1.getText() + "1";
            	txtF1.setText(texto);
            }
        });
        btn2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	if (operacao == -1)
            	{	
                	txtF1.setText("");
                	operacao = 0;
            	}
                String texto = txtF1.getText() + "2";
            	txtF1.setText(texto);
            }
        });
        btn3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	if (operacao == -1)
            	{	
                	txtF1.setText("");
                	operacao = 0;
            	}
                String texto = txtF1.getText() + "3";
            	txtF1.setText(texto);
            }
        });
        btn4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	if (operacao == -1)
            	{	
                	txtF1.setText("");
                	operacao = 0;
            	}
                String texto = txtF1.getText() + "4";
            	txtF1.setText(texto);
            }
        });
        btn5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	if (operacao == -1)
            	{	
                	txtF1.setText("");
                	operacao = 0;
            	}
                String texto = txtF1.getText() + "5";
            	txtF1.setText(texto);
            }
        });
        btn6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	if (operacao == -1)
            	{	
                	txtF1.setText("");
                	operacao = 0;
            	}
                String texto = txtF1.getText() + "6";
            	txtF1.setText(texto);
         }
        });
        btn7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	if (operacao == -1)
            	{	
                	txtF1.setText("");
                	operacao = 0;
            	}
                String texto = txtF1.getText() + "7";
            	txtF1.setText(texto);
            }
        });
        btn8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	if (operacao == -1)
            	{	
                	txtF1.setText("");
                	operacao = 0;
            	}
                String texto = txtF1.getText() + "8";
            	txtF1.setText(texto);
            }
        });
        btn9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	if (operacao == -1)
            	{	
                	txtF1.setText("");
                	operacao = 0;
            	}
                String texto = txtF1.getText() + "9";
            	txtF1.setText(texto);
            }
        });
        btn0.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	if (operacao == -1)
            	{	
                	txtF1.setText("");
                	operacao = 0;
            	}
                String texto = txtF1.getText() + "0";
            	txtF1.setText(texto);
            }
        });
        btnLimpar.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                valor1 = 0;
                txtF1.setText("");
            }
        });
        btnSomar.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
             	valor1 = Float.parseFloat(txtF1.getText());
             	txtF1.setText("");
                operacao = 1;
            }
        });
        btnDiminuir.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	valor1 = Float.parseFloat(txtF1.getText());
            	txtF1.setText("");
                operacao = 2;
            }
        });
        btnDividir.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
             	valor1 = Float.parseFloat(txtF1.getText());
             	txtF1.setText("");
                operacao = 3;
            }
        });
        btnMultiplicar.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	valor1 = Float.parseFloat(txtF1.getText());
            	txtF1.setText("");
                operacao = 4;
            }
        });

        btnRaiz.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	valor1 = Float.parseFloat(txtF1.getText());
            	txtF1.setText("");
                operacao = 5;
            }
        });

        btnPotencia.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	valor1 = Float.parseFloat(txtF1.getText());
            	txtF1.setText("");
                operacao = 6;
            }
        });
        
        btnResultado.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                switch (operacao)
                {
                    // somar
                    case 1 :
                    {
                        operacao = -1;
                        valor2   = Float.parseFloat(txtF1.getText());
                        txtF1.setText(Float.toString(valor1 + valor2));
                        break;
                    }
                    // subtrair
                    case 2 :
                    {
                        operacao = -1;
                        valor2   = Float.parseFloat(txtF1.getText());
                        txtF1.setText(Float.toString(valor1 - valor2));
                        break;
                    }
                    // dividir
                    case 3 :
                    {
                        try
                        {
                          operacao = -1;
                          valor2   = Float.parseFloat(txtF1.getText());
                          txtF1.setText(Float.toString(valor1 / valor2));
                        }
                        catch(ArithmeticException ex)
                            {
                                txtF1.setText("");
                            }
                        break;
                    }
                    // multiplicar
                    case 4 :
                    {
                        operacao = 0;
                        valor2   = Float.parseFloat(txtF1.getText());
                        txtF1.setText(Float.toString(valor1 * valor2));
                        break;
                    }
                    // raiz
                    case 5 :
                    {
                        operacao = 0;
                        valor2   = Float.parseFloat(txtF1.getText());
                        Double res_d = Math.pow(valor1, 1/valor2);
                        float res = res_d.floatValue();
                        txtF1.setText(Float.toString(res));
                        break;
                    }
                    // potencia
                    case 6 :
                    {
                        operacao = 0;
                        valor2   = Float.parseFloat(txtF1.getText());
                        Double res_d = Math.pow(valor1, valor2);
                        float res = res_d.floatValue();
                        txtF1.setText(Float.toString(res));
                        break;
                    }
                    default :
                        System.out.println("Escolha uma operaÃ§Ã£o");
                        break;
                }
            }
        });
        frm1.setSize(200,240);          // define tamanho do Frame
        frm1.setLocation(250,300);      // posiciona frame na tela
        frm1.setBackground(Color.gray); // define a cor de fundo
        
        // Adiciona o Visor ao Frame
        frm1.add(txtF1,BorderLayout.NORTH);
       
        // Adicionando os Botoes no Panel
        pnl1.add(btn1);
        pnl1.add(btn2);
        pnl1.add(btn3);
        pnl1.add(btn4);
        pnl1.add(btn5);
        pnl1.add(btn6);
        pnl1.add(btn7);
        pnl1.add(btn8);
        pnl1.add(btn9);
        pnl1.add(btn0);
        pnl1.add(btnLimpar);
        pnl1.add(btnResultado);
        pnl1.add(btnSomar);
        pnl1.add(btnDiminuir);
        pnl1.add(btnMultiplicar);
        pnl1.add(btnDividir);
        pnl1.add(btnRaiz);
        pnl1.add(btnPotencia);
        
        
        // Adicionar Panel ao Frame
        frm1.add(pnl1);
        
        // Mostrar o frame 
        frm1.setVisible(true);
    }
    public static void main(String [] args)
    {
        new Calculadora2();
    }
}