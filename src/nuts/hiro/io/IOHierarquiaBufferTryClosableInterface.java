package nuts.hiro.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOHierarquiaBufferTryClosableInterface {

	public static void main(String[] args) throws IOException { // IOException {
																// // Foi
																// lançado
																// excessao , pq
																// pode dar
																// problema em
																// algum
																// passo
																// realizado,
																// desde
																// Files.newBuffered
																// write ,
																// flush, close

		Path path = Paths.get("/home/hiro/workspace/JavaIMPORTANTEXTI/files/texto.txt"); // caminho
																							// do
																							// arquivo
																							// para
																							// manipular

		Charset utf8 = StandardCharsets.UTF_8; // importando as classes
		//
		// BufferedWriter w = Files.newBufferedWriter(path, utf8); // importando
		// as classes // Como se fizesse uma ligacao

		/* ESCRITA DO ARQUIVO */
		try (BufferedWriter w = Files.newBufferedWriter(path, utf8)) {

			// Buffer = Vai armazenando na memoria o q foi Writer
			w.write("Texto\n");
			w.write("Texto\n");
			w.write("Texto\n"); // pode escrever coisas quiser
			w.write("Texto\n");
			w.flush(); // comando para gravar o texto digitado no disco do
						// computador , ( o q foi guardado na memoria)

		} catch (IOException e) {
			e.printStackTrace(); // Imprime o erro
		}

		/* LEITURA DO ARQUIVO */

		try (BufferedReader reader = Files.newBufferedReader(path, utf8)) {

			String line = null;
			while ((line = reader.readLine()) != null) { // Le linha por linha
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
