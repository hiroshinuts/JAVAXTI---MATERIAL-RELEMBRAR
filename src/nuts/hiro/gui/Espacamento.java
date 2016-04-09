package nuts.hiro.gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Espacamento extends JFrame{
	
	public Espacamento(){
		
		super("Layouts"); // iniciar a janela
		
		Container c = getContentPane(); // recuperar o container para trabalhar a janela
		
		c.setLayout(new BorderLayout(15,15)); // ( 15,15 espaçamento 5 vertical, 5 horizontal)
		c.add(BorderLayout.NORTH, new JButton("N")); // botao no norte
		c.add(BorderLayout.SOUTH,  new JButton("S")); // botao no sul
		c.add(BorderLayout.CENTER,  new JButton("C")); // botao no centro
		c.add(BorderLayout.EAST,  new JButton("L")); // botao no Leste
		c.add(BorderLayout.WEST,  new JButton("O")); // botao no Oeste
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fechar a janela
		setSize(300,300); // tamanho da janela
		setVisible(true); // visivel
		
	}
	
	public static void main(String[] args) {
		new Espacamento(); // executar a janela
	}

}
