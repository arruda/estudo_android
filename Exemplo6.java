import java.util.*;


public class Exemplo6 {

	public static void main(String[] args) {

		Date hoje = new Date();
		System.out.println("data de hoje:" + hoje);

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2015);
		cal.set(Calendar.MONTH, 0);// Janeiro =0
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.HOUR, 00);
		cal.set(Calendar.MINUTE, 00);
		cal.set(Calendar.SECOND, 00);
		Date ano_novo = cal.getTime();
		System.out.println("Ano Novo: " + ano_novo); 
		long qtde_mili = 24L * 60L * 60L * 1000L; // qtde de milisegundos em 1 dia
		long dias = ((ano_novo.getTime() - hoje.getTime() ) / qtde_mili);
		System.out.println("Faltam " + dias + " dias para 2015."); 
	}
}