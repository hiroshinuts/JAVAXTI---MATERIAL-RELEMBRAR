package nuts.hiro.proJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 *  Classes e Interfaces Aninhadas, podem ser declaradas dentro de outras classes aninhadas , podem acessar informacoes 
 *  das classes envolventes. Muito utilizado em classes orientadas a eventos
 *  
 *  Classe anonima , é criar uma classe dentro do metodo uma classe anonima , sem nome
 *
 */

public class ClasseAninhada extends JFrame{
	
	JButton botao;
	
	public ClasseAninhada(){
		
		super("Aninhamento)");

		botao = new JButton("OK");
		botao.addActionListener(new ListenerAninhado());
		botao.addActionListener(new ActionListener() { // Classe anonomia , sem nome, do tipo ActionListener
													 	// cria Overrite ActionPerformerd
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Classe anonima executa " + botao.getText());
				
			}
		});
		
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
		
	}
		
	class ListenerAninhado implements ActionListener{ //classe aninhada

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Classe aninhada executa " + botao.getText());
		}
		
	}

	
	
	
	public static void main(String[] args) {
		
		ClasseAninhada janela = new ClasseAninhada();
		
		/**
		 *  Criando uma classe aninhada , diretamente
		 *  
		 * 
		 */
		
		ClasseAninhada.ListenerAninhado  listener = janela.new ListenerAninhado();
				
				/*
				 * 
				 *  Cria a instancia da classe envolvente
				 *  
				 */
	}
}
