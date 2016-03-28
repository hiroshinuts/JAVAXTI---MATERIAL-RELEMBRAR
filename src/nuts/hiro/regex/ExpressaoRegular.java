package nuts.hiro.regex;

public class ExpressaoRegular {

	public static void main(String[] args) {

		String padrao = "Java";
		String texto = "Java";
		boolean b = texto.matches(padrao);
		System.out.println(b);
		
		/**
		 * MODIFICADORES
		 * (?i) , ignora maiuscula e minuscula
		 * (?x) , Comentario
		 * (?m) , Multilinhas
		 * (?s) , DOttal
		 * 
		 */
		
		b = "Java".matches("(?i)java");
		System.out.println(b);
		
		b = "Java".matches("(?im)java");
		System.out.println(b);
		
		/*
		 * METACARACTERES *** procura os seguintes caracteres
		 * .                    qualquer caracter
		 * \d digitos           [0-9]
		 * \D nao é digito      [^0-9]
		 * \s espaços           [ \t\n\x0B\f\r]
		 * \S nao é espaco      [^\s]
		 * \w letra             [a-z_A-Z_0-9]
		 * \W não é letra nem numero
		 * 
		 */
		
		
		b = "@".matches(".");
		System.out.println(b);
		
		b = "2".matches("\\d");
		System.out.println(b);
		
		b = "a".matches("\\w");
		System.out.println(b);
		
		b = " ".matches("\\s");
		System.out.println(b);
		
		b = "Pi".matches(".."); // procura 2 caracteres
		System.out.println(b);
		
		b = "Pie".matches("..."); // procura 3 caracteres
		System.out.println(b);
		
		b = "21".matches("\\d\\d"); // procura 2 digitos
		System.out.println(b);
		
		
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		b = "05616-030".matches(cep);
		System.out.println(b);
		
		/*
		 * QUANTIFICADORES
		 * X{n}    X, exatamente n vezes
		 * X{n,}   X , pelo menos n vezes
		 * X{n,m}  X, pelo menos n mas nao mais do que m vezes
		 * X?      X, 0 ou 1 vez
		 * X*      X, 0 ou + vezes
		 * X+      X, 1 ou + vezes
		 * 
		 */
		
		
		b = "21".matches("\\d{2}");
		System.out.println(b);
		
		b = "214".matches("\\d{2,}"); //pelo menos 2 digitos
		System.out.println(b);
		
		b = "12345".matches("\\d{2,5}"); //pelo menos 2 digitos mas nao mais que 5
		System.out.println(b);
		
		b = "".matches(".?");  // zero ou 1 vez de qualquer caractere (.) entre 0 ou 1
		System.out.println(b);
		
		b = "".matches(".*");  // zero ou ++ vez de qualquer caractere (.) entre 0 ou ++
		System.out.println(b);
		
		b = "1".matches(".+");  // 1 ou ++ vezes 
		System.out.println(b);
		
		
		b = "05616-030".matches("\\d{5}-\\d{3}");  // validando cep
		System.out.println(b);
		
		b = "02/01/1987".matches("\\d{2}/\\d{2}/\\d{4}");  // validando uma data
		System.out.println(b);
		
		/*
		 * METACARACTER DE FRONTEIRA
		 * ^ inicia
		 * $ finaliza
		 * | ou
		 * 
		 */
		
		b = "Pier21".matches("^Pier.*"); // inicia com Pier e termina com qualquer coisa
		System.out.println(b);
		
		b = "Pier21".matches(".*21$");  // inicia com qualquer coisa, mas finaliza com numero 21
		System.out.println(b);
		
		b = "tem java aqui".matches(".*java.*");  // procura ocorrencia de java dentro da String
		System.out.println(b);
		
		b = "tem java aqui".matches("^tem .* aqui$");  // inicia com "tem" e termina com "aqui" , pode qualquer coisa no meio
		System.out.println(b);
		
		b = "sim".matches("sim|nao");  // deve conter sim OU nao
		System.out.println(b);
		
		
		
	}
}
