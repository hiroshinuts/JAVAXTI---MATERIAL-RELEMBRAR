package nuts.hiro.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JframeGui extends JFrame {
	
	/*
	 * GUI - Graphical User Interface
	 * 
	 * pacote javax.swing
	 * 
	 * Janela (Jframe)
	 * 
	 * Container
	 * 
	 * Componentes (controles)
	 */
	
	/**
	 * A classe é a janela, então podemos extends de JFrame , assim nao precisamos instanciar com new
	 * 
	 * 
	 *  Cria o construtor da classe e realiza a config do Jframe
	 *  
	 *  
	 */

	public JframeGui() {
		
		super("Minha Janela");
		
		
		JButton botao = new JButton("Click"); // cria o botao
		getContentPane().add(botao);;  // adiciona container // add = adiciona componente
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {

		new JframeGui();
		
	}
}
