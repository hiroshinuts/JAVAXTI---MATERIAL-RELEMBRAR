package nuts.hiro.datas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateCalendar {
	
	public static void main(String[] args) {
		
		/* 01 de JAN 1970 */
		
		System.out.println(System.currentTimeMillis()); // Quantidade de milisegundos desde 1970
		
		Date agora = new Date(); // data atual - formato string ** este formato Wed Apr 06 21:18:32 ART 2016
		System.out.println(agora);

		
		Date data = new Date(1_000_000_000_000L); // data Sat Sep 08 22:46:40 ART 2001
		System.out.println(data);
		
		
		/* METODOS */ 
		
		data.getTime(); //retorna em milisegundos
		data.setTime(1_000_000_000_000L); //define uma data
		data.compareTo(agora); // compara com a data (-1) menor , (0) igual , (1) maior
		
		
		/* CLASSE CALENDAR */
		
		// Não deve ser instanciada (new)
		
		Calendar c = Calendar.getInstance(); //retorna uma instancia de um calendario (gregoriano)
		
		new GregorianCalendar(); // Instanciar calendario grecoriano tambem, igual a cima
		
		c.set(1980, Calendar.FEBRUARY, 12); // setar uma data
		System.out.println(c.getTime()); // retorna a data
		
		/*GET*/
		
		System.out.println(c.get(Calendar.YEAR)); // retorna o ano
		System.out.println(c.get(Calendar.MONTH)); // retorna o mes ( ano é contado a partir do 0 ...entao dezembro é 11)
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); // retorna o dia do mes
		
		/*SET*/
		
		c.set(Calendar.YEAR, 1972); // altera ano
		c.set(Calendar.MONTH, Calendar.MARCH); // altera mes
		c.set(Calendar.DAY_OF_MONTH, 25); // altera dia do mes
		System.out.println(c.getTime());
		
		/* CLEAR */
		
		c.clear(Calendar.MINUTE);// ZERA os minutos
		c.clear(Calendar.SECOND);// ZERA os segundos
		System.out.println(c.getTime());
		
		/* ADD */
		
		c.add(Calendar.DAY_OF_MONTH, 1); // adiciona um dia 
		c.add(Calendar.YEAR, 1); // adiciona um ano
		System.out.println(c.getTime());
		
		/* ROLL */
		
		//Aumenta ou diminui o caso especifico (setado) , mas nao altera o que esta a acima (exemplo, alterando o dia, continua no memso mes)
		
		c.roll(Calendar.DAY_OF_MONTH, 20);
		System.out.println(c.getTime());
		
		
		/* SAUDACAO COM BOM DIA, BOA TARDE OU BOA NOITE */
		
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		
		System.out.println(hora);
		
		if (hora <= 12){
			
			System.out.println("Bom dia");
			
		}else if(hora >12 && hora <18){
			
			System.out.println("Boa Tarde");
			
		}else {
			
			System.out.println("Boa Noite");
		}
		
	}

}
