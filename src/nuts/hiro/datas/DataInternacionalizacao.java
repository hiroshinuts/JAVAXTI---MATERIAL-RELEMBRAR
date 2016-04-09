package nuts.hiro.datas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * 
 *  Para saber codigo de Lingua, procurar por ISO 639
 *  
 *  Para saber o Codigo do Pais , procurar por ISO 3166
 * 
 * @author hiro
 *
 */

public class DataInternacionalizacao {
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.set(2016, Calendar.FEBRUARY, 21);
		Date date = c.getTime();
		
		Locale padrao = Locale.getDefault(); // de acordo com a informação padrao do SO
		Locale brasil = new Locale("pt", "BR"); // Local brasil, lingua portugueza
		Locale india = new Locale("hi", "IN"); // INDIA
		Locale usa = Locale.US; // USA
		Locale japao = Locale.JAPAN; // Japao
		Locale italia = Locale.ITALY; // Italia
		
		
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(date)); // padrao pegando informacoes do SO
		
		f = DateFormat.getDateInstance(DateFormat.FULL , brasil);
		System.out.println(f.format(date)); // padrao pegando informacoes do SO
		
		f = DateFormat.getDateInstance(DateFormat.FULL , india);
		System.out.println(f.format(date)); // India
		
		f = DateFormat.getDateInstance(DateFormat.FULL , usa);
		System.out.println(f.format(date)); // USA
		
		f = DateFormat.getDateInstance(DateFormat.FULL , japao);
		System.out.println(f.format(date)); // Japao
		
		f = DateFormat.getDateInstance(DateFormat.FULL , italia);
		System.out.println(f.format(date)); // Italia
	}

}
