package nuts.hiro.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JcomboBoxEAlbumdeFotos extends JFrame implements ItemListener{
	
	JComboBox<String>  combo;
	JLabel label;
	ImageIcon[] imagens = { //array de imagens
			new ImageIcon(getClass().getResource("fotos/01.jpg")), //adicionando imagem
			new ImageIcon(getClass().getResource("fotos/02.jpg")), // getclass = proximo ao diretorio do projeto
			new ImageIcon(getClass().getResource("fotos/03.jpg")), // get resource = pasta no projeto
			new ImageIcon(getClass().getResource("fotos/04.jpg")),
	};
	
	public JcomboBoxEAlbumdeFotos() {

		super("Album de Fotos"); // nome
		
		Container c = getContentPane();
		
		combo = new JComboBox<String>(); // inicia combo box
		combo.setFont(new Font("serif", Font.PLAIN, 26)); // edita letras
		combo.addItem("Corgi popo");
		combo.addItem("Corgi Hue");
		combo.addItem("Husky :|");
		combo.addItem("Husky Grrr");
		combo.addItemListener(this); // implements ItemListener , que cria o public void itemStateChanged(ItemEvent e)
		//this é pq foi implementado na classe direto, nao foi criado outra sub-classe
		
		label = new JLabel(imagens[0]); // legenda das fotos
		
		
		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER, label);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //padrao
		setSize(300, 530); // padrao
		setVisible(true); // padrao
	}
	
	
	

	@Override
	public void itemStateChanged(ItemEvent e) {

		if(e.getStateChange() == ItemEvent.SELECTED){ // e.getStateChange = devolve o status , Item event = Selected
			label.setIcon(imagens[combo.getSelectedIndex()]); // seleciona o index da array
		}
		
	}
	
	public static void main(String[] args) {
		new JcomboBoxEAlbumdeFotos();
	}
	
}
