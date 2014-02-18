/*
 * Faça um programa em Java que diz o signo de uma pessoa a 
 * partir da data de nascimento.
 */

import java.util.Scanner;



public class Signo {
	
	public static void printSigno(int dia, int mes){

		if ((mes == 12 && dia >= 22 && dia <= 31)
				|| (mes == 1 && dia >= 1 && dia <= 19))
			System.out.println("Capricornio");
		else if ((mes == 1 && dia >= 20 && dia <= 31)
				|| (mes == 2 && dia >= 1 && dia <= 17))
			System.out.println("Aguario");
		else if ((mes == 2 && dia >= 18 && dia <= 29)
				|| (mes == 3 && dia >= 1 && dia <= 19))
			System.out.println("Peixes");
		else if ((mes == 3 && dia >= 20 && dia <= 31)
				|| (mes == 4 && dia >= 1 && dia <= 19))
			System.out.println("Aries");
		else if ((mes == 4 && dia >= 20 && dia <= 30)
				|| (mes == 5 && dia >= 1 && dia <= 20))
			System.out.println("Touro");
		else if ((mes == 5 && dia >= 21 && dia <= 31)
				|| (mes == 6 && dia >= 1 && dia <= 20))
			System.out.println("Gemios");
		else if ((mes == 6 && dia >= 21 && dia <= 30)
				|| (mes == 7 && dia >= 1 && dia <= 22))
			System.out.println("Cancer");
		else if ((mes == 7 && dia >= 23 && dia <= 31)
				|| (mes == 8 && dia >= 1 && dia <= 22))
			System.out.println("Leao");
		else if ((mes == 8 && dia >= 23 && dia <= 31)
				|| (mes == 9 && dia >= 1 && dia <= 22))
			System.out.println("Virgem");
		else if ((mes == 9 && dia >= 23 && dia <= 30)
				|| (mes == 10 && dia >= 1 && dia <= 22))
			System.out.println("Libra");
		else if ((mes == 10 && dia >= 23 && dia <= 31)
				|| (mes == 11 && dia >= 1 && dia <= 21))
			System.out.println("Escorpiao");
		else if ((mes == 11 && dia >= 22 && dia <= 30)
				|| (mes == 12 && dia >= 1 && dia <= 21))
			System.out.println("Sagitario");
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Diga sua data de nascimento.");
		System.out.println("Primeiro diga em que dia nasceu");
		int dia = input.nextInt();

		System.out.println("Diga em que mes nasceu");
		int mes = input.nextInt();
		
		printSigno(dia,mes);

	}

}
