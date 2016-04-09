package nuts.hiro.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout extends JFrame {
	
	public Layout(){
		
		super("Layout"); // NECESSARIO : iniciar , é só colocar o nome da janela
		
		Container c = getContentPane(); //recuperar o layout padrao (border layout)
		
		
		/*FLOWLAYOUT  adiciona os botao na ordem de chegada */
		
		c.setLayout(new FlowLayout()); // este Layout, adiciona os botoes na ordem de chegada
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		
		
		/*BORDERLAYOUT -  PADRAO , precisa setar a localizacao do botao*/
		
		//BorderLayout border = new BorderLayout(); // Layout Border (padrao)
		//c.setLayout(border); // Layout Border (padrao)
		
		//c.add(BorderLayout.NORTH, new JButton("1")); // adiciona botao no Norte
		//c.add(BorderLayout.SOUTH, new JButton("2")); // adiciona botao no Sul
		//c.add(BorderLayout.CENTER, new JButton("3")); //adiciona botao no Centro
		//c.add(BorderLayout.EAST, new JButton("4")); //adiciona botao no Leste
		//c.add(BorderLayout.WEST, new JButton("5")); // adiciona o botao no Oeste
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // NECESSARIO : operacao quando clica no X
		setSize(300, 300);// NECESSARIO : Tamanho da janela
		setVisible(true); // NECESSARIO : deixar a janela visivel
		
		
	}
	
	public static void main(String[] args) {
		
		new Layout();
		
	}

}
