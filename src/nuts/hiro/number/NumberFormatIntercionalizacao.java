package nuts.hiro.number;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatIntercionalizacao {

	public static void main(String[] args) throws ParseException {

		double saldo = 123_456.789;
		NumberFormat f = NumberFormat.getInstance();
		System.out.println(f.format(saldo)); // formatacao padrao BR

		f = NumberFormat.getIntegerInstance();
		System.out.println(f.format(saldo)); // formatacao para numeros Inteiros

		f = NumberFormat.getPercentInstance();
		System.out.println(f.format(saldo)); // formatacao para numeros percentuais
		
		f = NumberFormat.getCurrencyInstance();
		System.out.println(f.format(saldo)); // formatacao para numeros moedas
		
		f.setMaximumFractionDigits(1);
		System.out.println(f.format(saldo)); // formatacao para casas decimais do dinheiro
		
		/*Intercionalizacao dos Numeros*/
		
		f = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(f.format(saldo)); // formatacao para numeros moedas US
		
		f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(f.format(saldo)); // formatacao para numeros moedas França (EURO)
		
		/*Conversao de Valores*/
		
		f = NumberFormat.getCurrencyInstance();
		System.out.println(f.parse("R$ 1.100,25")); 
		
		
		
	}
}
