import java.util.*;
public class Exemplo7 
{
	public final static void main(String ARGV[ ])
	{
		//Calendar cal = new GregorianCalendar(2014,1,28,13,24,56);
		Calendar cal = new GregorianCalendar();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // Jan = 0, dec = 11
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH); 
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth = cal.get(Calendar.WEEK_OF_MONTH);
		int hour = cal.get(Calendar.HOUR); // 12 hour clock
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY); // 24 hour clock
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);System.out.println("Ano \t\t: " + year);
		System.out.println("Mes \t\t: " + month);
		System.out.println("Dia do mes \t: " + dayOfMonth);
		System.out.println("Dia da semana \t: " + dayOfWeek);
		System.out.println("Semana do ano \t: " + weekOfYear);
		System.out.println("Semana do mes \t: " + weekOfMonth);
		System.out.println("Hora \t\t: " + hour);
		System.out.println("Hora do dia \t: " + hourOfDay);
		System.out.println("Minuto \t\t: " + minute);
		System.out.println("Segundo \t: " + second);
		System.out.println("Milisegundo \t: " + millisecond);
	}
}