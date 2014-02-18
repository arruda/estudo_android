/*
 * Faça um programa em Java que gera a série de Fibonacci 
* com n números, onde n é fornecida pelo usuário.
*/
import java.util.Scanner;


public class Fibonacci {
	public static int fibonacci(int n){
		if (n < 2) {
			return n;
		} else {
			return fibonacci(n - 1)+ fibonacci(n - 2);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com um numero N");
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println(fibonacci(i));
		}

	}

}
