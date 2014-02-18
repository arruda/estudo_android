import java.util.Scanner;

public class Exemplo5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ditite seu nome:");
		String nome = input.nextLine();
		System.out.println("Oi "+ nome + "!");
		
		System.out.println("Entre com um numero");
		int valor = input.nextInt();
		System.out.println("O valor digitado foi:" + valor+"!");
		
		
		
	}

}
