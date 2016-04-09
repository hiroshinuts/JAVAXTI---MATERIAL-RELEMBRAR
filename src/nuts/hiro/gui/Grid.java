package nuts.hiro.gui;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid extends JFrame {
	



	public Grid() {

		super("GridLayout");
		
		Container c = getContentPane(); // recuperar o container para trabalhar a janela
		
		c.setLayout(new GridLayout(2,3)); // grid layout com 2 linhas e 3 colunas
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fechar a janela
		setSize(300,300); // tamanho da janela
		setVisible(true); // visivel
	
	}

	
	
	public static void main(String[] args) {
		new Grid();
	}
	
}
