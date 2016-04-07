package nuts.hiro.datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatacaoDatas {
	
	public static void main(String[] args) throws ParseException {
		
		Calendar c = Calendar.getInstance(); // instanciando Calendar
		c.set(1980, Calendar.APRIL, 24); // setando uma data
		Date date = c.getTime(); // Recuperando um objetido do tipo date , que sera utilizado para formatacao
		System.out.println(date); // Thu Apr 24 21:50:28 ART 1980
		
		/* FORMATACAO DE DATAS */
		
		DateFormat f = DateFormat.getDateInstance(); // instanciando DateFormat-- formataçao de Data , DIA/MES/ANO // 24/04/1980
		System.out.println(f.format(date)); // 24/04/1980
		
		/* Formatacao de Hora */
		
		f = DateFormat.getTimeInstance(); // formata a hora
		System.out.println(f.format(date)); //21:52:28
		
		/* Formatacao de Data e Hora */
		
		f = DateFormat.getDateTimeInstance(); // formata a data e a hora
		System.out.println(f.format(date)); // 24/04/1980 21:53:57
		
		/* Estilos de Formatação de Data/hora */
		
		f = DateFormat.getDateInstance(DateFormat.FULL); // formata a data 
		System.out.println(f.format(date)); //Quinta-feira, 24 de Abril de 1980
		
		f = DateFormat.getDateInstance(DateFormat.LONG); // formata a data 
		System.out.println(f.format(date)); //24 de Abril de 1980
		
		f = DateFormat.getDateInstance(DateFormat.MEDIUM); // formata a data 
		System.out.println(f.format(date)); //24/04/1980
		
		f = DateFormat.getDateInstance(DateFormat.SHORT); // formata a data 
		System.out.println(f.format(date)); //24/04/80
		
		
		Date data2 = f.parse("12/02/1980"); // parse converte uma string em data , lança exception
		System.out.println(data2);
		
		/* SIMPLEDATEFORMAT */
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // setar o parametro "dd/MM/yyyy"
		System.out.println(sdf.format(date)); // imprime a data "date" 24/04/1980
		System.out.println(sdf.parse("10/10/2010")); // converte uma string em Date //Sun Oct 10 00:00:00 ART 2010
		
		
	}	

}
