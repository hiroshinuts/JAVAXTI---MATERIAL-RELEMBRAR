package nuts.hiro.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControlesJlabelEImagecon extends JFrame{
	
	public ControlesJlabelEImagecon() {
			
		super("Label"); // padrao
		
		JLabel simples = new JLabel("JLabel simples"); // cria uma jlabel escrito "jlabel simples"
		simples.setToolTipText("Meu Tooltip"); // texto q aparece quando passa o mouse em cima
		
		Font fonte = new Font("serif" , Font.BOLD | Font.ITALIC, 28); // Para mudar fonte
		JLabel label = new JLabel("JLabel simples"); // cria uma jlabel escrito "jlabel simples"
		label.setFont(fonte); // definindo a fonte para o Label
		label.setForeground(Color.BLUE); // definindo cores
		
		ImageIcon icon = new ImageIcon(getClass().getResource("fotos/Lampada.png")); // Objeto imagem recebe uma URL
		JLabel imagem = new JLabel(icon); // Para adicionar na Label

		
		Container c = getContentPane(); // cria container
		c.setLayout(new FlowLayout()); // cria o layout flowlayout simples
		c.add(simples); // adiciona no container
		c.add(label); // adiciona no container
		c.add(imagem);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//padrao
		setSize(300,300);// padrao
		setVisible(true); // padrao
		
		
		
	}
	
	public static void main(String[] args) {
		new ControlesJlabelEImagecon();
	}

}
