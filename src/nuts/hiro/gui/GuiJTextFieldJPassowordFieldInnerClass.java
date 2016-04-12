package nuts.hiro.gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GuiJTextFieldJPassowordFieldInnerClass extends JFrame{
	
	JButton ok, cancel; // cria atributo de classe para os botoes
	JTextField login;
	JPasswordField senha;
	
	public GuiJTextFieldJPassowordFieldInnerClass() {

		super("Textos e Senhas"); // padrao
		
		login = new JTextField();
		senha = new JPasswordField();
		
		ok = new JButton("Ok"); // cria o botao ok
		ok.addActionListener(new BotaoOkListiner()); // adiciona a funcao listener
		
		cancel = new JButton("Cancel"); // cria o botao cancel
		cancel.addActionListener(new BotaoCancelListener()); // adiciona a funcao listener
		
		Container c = getContentPane(); // cria container
		c.setLayout(new GridLayout(3, 2)); // cria layout
		c.add(new JLabel("Login: ")); // cria uma Label com texto login
		c.add(login); // cria um espaço para digitar
		c.add(new JLabel("Senha: ")); // cria uma label com texto senha
		c.add(senha); // cria um espaço para digitar a senha
		c.add(ok);  // adiciona o botao ok
		c.add(cancel); // adiciona o botao cancel
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // padrao
		setSize(300,200); // padrao
		setVisible(true); // padrao
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		new GuiJTextFieldJPassowordFieldInnerClass();
	}



	class BotaoOkListiner implements ActionListener{ // cria uma classe só para tratar o botao OK

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String s = "login:" + login.getText()  // recuperar senha e login e aparecer na tela
			+ "\nsenha:" + new String(senha.getPassword());// recuperar senha e login e aparecer na tela
			
			JOptionPane.showMessageDialog(null, s); // cria JOP para aparecer o login e senha
			
		}
		
	}
	
	class BotaoCancelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			login.setText("");
			senha.setText("");
			
		}
		
	}

	
		

		
	}


