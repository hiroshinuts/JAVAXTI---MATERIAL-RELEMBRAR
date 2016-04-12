package nuts.hiro.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InterfaceGraficaCalculadora extends JFrame {
	
	public InterfaceGraficaCalculadora() {

		super("Calculadora");
		
		Container numero = new JPanel();
		numero.setLayout(new GridLayout(4,4,5,5)); // 4 linhas, 4 colunas, espaçamento 5,5
		numero.add(new JButton("7"));
		numero.add(new JButton("8"));
		numero.add(new JButton("9"));
		numero.add(new JButton("/"));
		numero.add(new JButton("4"));
		numero.add(new JButton("5"));
		numero.add(new JButton("6"));
		numero.add(new JButton("*"));
		numero.add(new JButton("1"));
		numero.add(new JButton("2"));
		numero.add(new JButton("3"));
		numero.add(new JButton("-"));
		numero.add(new JButton("0"));
		numero.add(new JButton("."));
		numero.add(new JButton("="));
		numero.add(new JButton("+"));
		
		JTextField display = new JTextField();
		display.setFont(new Font("serif", Font.PLAIN, 30)); // setando a fonte do Display
		
		
		Container c = getContentPane();
		c.add(BorderLayout.NORTH, display); // Jtextfield no topo
		c.add(BorderLayout.CENTER, numero); // Adiciona o Layout para os botoes numericos
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300, 300);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		new InterfaceGraficaCalculadora();
	}

}
