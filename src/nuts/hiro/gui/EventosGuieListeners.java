package nuts.hiro.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventosGuieListeners extends JFrame implements ActionListener {
	
	JButton botao; // botao fora para poder invocar o botao
	
	public EventosGuieListeners() {
		super("Eventos"); // padrao Jframe
		
		botao = new JButton("Clique aqui!"); // invocando o botao
		botao.addActionListener(this); // fala que a acao é nesta classe (action listener e)
		getContentPane().add(botao); // cria container no botao
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// padrao Jframe
		setSize(300,300);// padrao Jframe
		setVisible(true);// padrao Jframe
		
	}
	
		

	@Override
	public void actionPerformed(ActionEvent e) { // evento listener (aguarda enquanto acontece algo
		botao.setText("Foi Clicado"); // renomeia o botao
	
	}
	
	
	
	public static void main(String[] args) {
		new EventosGuieListeners(); // para abrir a janela
	}

}
