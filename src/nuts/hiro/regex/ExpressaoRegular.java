package nuts.hiro.regex;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		
		
		b = "@".matches("."); // qualquer caractere
		System.out.println(b);
		
		b = "2".matches("\\d"); // qualquer digito
		System.out.println(b);
		
		b = "a".matches("\\w"); // qualquer letra ou numero
		System.out.println(b);
		
		b = " ".matches("\\s"); // espaço
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
		
		
		b = "21".matches("\\d{2}"); // dois digitos
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
		
		/*
		 * AGRUPADORES
		 * 
		 * [...]                 Agrupamento
		 * [a-z]                 Alcance
		 * [a-e][i-u]            Uniao
		 * [a-z&&[aeiou]  ]      Intersecao
		 * [^abc]                Excecao
		 * [a-z&&[^m-p]]         Subtracao
		 * \x                    Fuga literal
		 * 
		 */
		
		b = "x".matches("[a-z]");  // Qualquer letra de a-z
		System.out.println(b);
		
		b = "3".matches("[0-9]");  // Qualquer numero de 0-9
		System.out.println(b);
		
		b = "true".matches("[Tt]rue");  // pode ser True ou true
		System.out.println(b);
		
		b = "True".matches("[Tt]rue");  // pode ser True ou true
		System.out.println(b);
		
		b = "Yes".matches("[Tt]rue|[yY]es");  // pode ser True ou true ou yes ou Yes
		System.out.println(b);
		
		b = "yes".matches("[Tt]rue|[yY]es");  // pode ser True ou true ou yes ou Yes
		System.out.println(b);
		
		b = "Hiroshi".matches("[A-Z][a-zA-Z]*");  //Primeiro nome começa com letra maiuscula ou pode ser tudo maiusculo
		System.out.println(b);
		
		b = "olho".matches("[^abc]lho");  //qualquer palavra q termine com lho , mas nao pode começar nem com a, b, c
		System.out.println(b);
		
		b = "crau".matches("cr[ae]u");  //avaliando no meio -- escreveu crau ou creu
		System.out.println(b);
		
		b = "hiro@hironuts.com.br".matches("\\w+@\\w+\\.\\w{2,3}.*");  //validacao de e-mail
		System.out.println(b);
		
		String doce = "Qual é o Doce mais doCe que o doce?"; 
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce); // encontrar todas as ocorrencias da palavra doce, escrito de qualquer modo
		while(matcher.find()) { // enquantro encontrar ocorrencia
			System.out.println(matcher.group()); // imprime as ocorrencias encontradas
		}
		
		
		/* SUBSTITUICOES */
		
		String r = doce.replaceAll("(?i)doce", "DOCINHO"); // substitui todas as palavras doce por DOCINHO
		System.out.println(r);
		
		String rato = "O rato roeu a roupa do rei de roma";
		r = rato.replaceAll("r[aeiou]", "XX"); // substitui todos ra-re-ri-ro-ru por XX
		System.out.println(r);
		
		r = "Tabular este texto".replaceAll("\\s", "\t"); // subistitui os espaços por tabulação
		System.out.println(r);
		
		////////////////////////////////////////////////////////////////////////////////////////
		
		String url = "www.hiro.com.br/clientes-2011.html";
		//Mudar para o padrao - http://www.hiro.com.br/2011/clientes.jsp 
		String re = "www.hiro.com.br/\\w{2,}-\\d{4}.html"; //avaliando a url antiga
		b = url.matches(re);
		System.out.println(b);
		
		re = "(www.hiro.com.br)/(\\w{2,})-(\\d{4}).html"; // Colocar o ( ) , transformou o texto em uma variavel
		
		r = url.replaceAll(re, "http://$1/$3/$2.jsp"); // ordenar as variaveis q estao no ()
		
		System.out.println(url); // texto antes de substituir
		System.out.println(r); // imprime o texto substitutido
		
	}
}
