package nuts.hiro.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOPathLeituraEscrita {

	public static void main(String[] args) throws IOException {

		
		///////////////////////
		////////JAVA 7/////////
		//////////////////////
		
	//Localizacao do diretorio que quer manipular
	Path path = Paths.get("/home/hiro/workspace/JavaIMPORTANTEXTI/files/texto.txt"); 
	
	//retorna o caminho absoluto deste arquivo
	System.out.println(path.toAbsolutePath());
	
	//retorna o caminho do Pai
	System.out.println(path.getParent());
	
	//retorna a raiz do sistema
	System.out.println(path.getRoot());
	
	//retorna o nome do arquivo
	System.out.println(path.getFileName());

	
	/*CRIACAO DE DIRETORIO PARA CRIAR O ARQUIVO*/
	Files.createDirectories(path.getParent());
	
	/*ESCREVER E LER ARQUIVOS*/ //Manipulando arquivos pequenos
	
	byte[] bytes = "Meu Texto".getBytes(); // transforma o texto para bytes
	Files.write(path, bytes); // cria, limpa e escreve dentro do arquivo
	
	byte[] retorno = Files.readAllBytes(path); // capitura os bytes escrito
	System.out.println(new String(retorno)); // escreve os bytes em String
	
	}

}
