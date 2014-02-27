import java.lang.StringBuilder;
import java.util.Scanner;


public class Reverso {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("digite seu nome:");
		String nome = input.nextLine();
		
		String reverso = new StringBuilder(nome).reverse().toString();
		System.out.println("Poder Reverso!  " + reverso);
	}

}
