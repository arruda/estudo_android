/* Faça um programa em Java que mostra o dia da semana em 
 * que o aniversário de uma pessoa já caiu e que vai cair nos 
 * próximos 10 anos
 */

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Aniversario {

	public static void proximosNAniversarios(Calendar cal, int n){
		Calendar tempCal = cal;
		for (int i = 1; i <= n; i++) {
			int ano = cal.get(Calendar.YEAR) + 1;
			tempCal.set(Calendar.YEAR, ano);
			
			int diaSemana = tempCal.get(Calendar.DAY_OF_WEEK);
			System.out.println("Ano: " + ano + "; Dia da semana: " + diaSemana);
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Diga sua data de nascimento.");
		System.out.println("Primeiro diga em que dia nasceu");
		int dia = input.nextInt();

		System.out.println("Diga em que mes nasceu");
		int mes = input.nextInt();
		
		System.out.println("Diga em que ano nasceu");
		int ano = input.nextInt();
		
		proximosNAniversarios(new GregorianCalendar(ano,mes,dia), 10);
		
	}

}
