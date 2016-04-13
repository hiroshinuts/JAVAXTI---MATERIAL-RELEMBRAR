package nuts.hiro.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JCheckBoxItemListener extends JFrame{
	
	JTextField texto;
	JCheckBox bold, italic;
	
	public JCheckBoxItemListener() {

	super("Controle Check");
	
	texto = new JTextField("Veja a fonte mudar"); // texto a ser mudado
	texto.setFont(new Font("serif", Font.PLAIN, 26)); // mudando a fonte
	
	bold = new JCheckBox("Bold"); // cria checkbox bold
	bold.addItemListener(new CheckBoxListener()); // adiciona acao ao botao
	
	italic = new JCheckBox("Italic"); // cria checkbox italic
	italic.addItemListener(new CheckBoxListener()); // adiciona acao ao botao
	
	
	Container c = getContentPane();
	
	c.setLayout(new FlowLayout());
	c.add(texto);
	c.add(bold); //JCHECKBOX
	c.add(italic); //JCHECKBOX
	
	
	setSize(300,300); //padrao
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // padrao
	setVisible(true);// padrao
	
	}
	
	class CheckBoxListener implements ItemListener{ // implementação do botao bold, italic

		@Override
		public void itemStateChanged(ItemEvent e) {

			if(bold.isSelected() && italic.isSelected()){
				texto.setFont(new Font("serif", Font.BOLD | Font.ITALIC, 26));
			}else if(bold.isSelected()){
				texto.setFont(new Font("serif", Font.BOLD, 26));
			}else if(italic.isSelected()){
				texto.setFont(new Font("serif",Font.ITALIC, 26));
			}else{
				texto.setFont(new Font("serif", Font.PLAIN, 26));
			}
		
		}
		
	}
	
	public static void main(String[] args) {
		new JCheckBoxItemListener();
	}

}
