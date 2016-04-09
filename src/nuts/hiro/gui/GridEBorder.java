package nuts.hiro.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridEBorder extends JFrame {
	
	public GridEBorder() {

		super ("Composicao");
		
		Container c = getContentPane(); // primeiro container principal
		c.setLayout(new BorderLayout()); // cria o layout principal
		
		Container c2 = new JPanel(); // segundo container
		c2.setLayout(new GridLayout(4,1 )); // 4 linhas e 1 coluna
		c2.add(new JButton("OK"));
		c2.add(new JButton("Cancel"));
		c2.add(new JButton("Setup"));
		c2.add(new JButton("Help"));
		
		c.add(BorderLayout.CENTER, new JButton("Centro")); // cria o botao centro
		c.add(BorderLayout.EAST, c2); // utiliza os botoes criados em c2
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fecha Janela
		setSize(300, 300); // seta tamanho
		setVisible(true); // torna visivel
	
	}
	
	
	
	public static void main(String[] args) {
		new GridEBorder();
	}

}
