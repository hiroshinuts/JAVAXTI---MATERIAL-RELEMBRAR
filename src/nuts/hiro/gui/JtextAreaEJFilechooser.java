package nuts.hiro.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JtextAreaEJFilechooser extends JFrame implements ActionListener{
	
	JTextArea texto;
	
	public JtextAreaEJFilechooser() {

		super("Editor de Textos");
		
		texto = new JTextArea(); // Jtext Area -- text area sempre é criado com jscrollpane
		JScrollPane scroll = new JScrollPane(texto); // cria barra de rolagem
		texto.setFont(new Font("serif", Font.PLAIN, 26));
		
		
		JButton botao = new JButton("Abrir arquivo"); // botao para abrir o arquivo
		botao.setFont(new Font("serif", Font.PLAIN, 26)); //fonte
		botao.addActionListener(this); // acao para abrir o arquivo
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setVisible(true);
		
		
		Container c = getContentPane();
		c.add(BorderLayout.CENTER, scroll); // layout com scroll do texto
		c.add(BorderLayout.SOUTH, botao);
		
		
	}
	
	

	public static void main(String[] args) {
		new JtextAreaEJFilechooser();
	}



	@Override
	public void actionPerformed(ActionEvent e) {

		JFileChooser c = new JFileChooser(); // Escolhedor de arquivos
		c.showOpenDialog(this); // abrir uma janela para selecionar o arquivo
		File file = c.getSelectedFile(); // recupera o arquivo selecionado
		
		try{
			Path path = Paths.get(file.getAbsolutePath()); // acessa o endereço absoluto do arquivo
			String retorno = new String(Files.readAllBytes(path)); // converte e lê os dados do arquivo
			texto.setText(retorno);
			
		}catch(Exception erro){
			JOptionPane.showMessageDialog(this, "Não conseguimos carregar o seu arquivo");
		}
		
	}

}
