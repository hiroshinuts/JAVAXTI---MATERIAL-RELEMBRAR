package nuts.hiro.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ConversorFparaC extends JFrame {

	private JPanel contentPane;
	private JTextField valor;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorFparaC frame = new ConversorFparaC();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConversorFparaC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Converter");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 26));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try{
				double fahrenheit = Double.parseDouble(valor.getText());
				double celcius = (fahrenheit - 32) / 1.8;
				resultado.setText(celcius +  " C");
				}catch(Exception erro) {}
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 5, 5));
		
		JLabel lblFahrenheit = new JLabel("Fahrenheit:");
		lblFahrenheit.setFont(new Font("Dialog", Font.BOLD, 26));
		lblFahrenheit.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblFahrenheit);
		
		valor = new JTextField();
		valor.setHorizontalAlignment(SwingConstants.CENTER);
		valor.setFont(new Font("Dialog", Font.BOLD, 26));
		panel.add(valor);
		valor.setColumns(10);
		
		JLabel lblCelcius = new JLabel("Celcius");
		lblCelcius.setFont(new Font("Dialog", Font.BOLD, 26));
		lblCelcius.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblCelcius);
		
		resultado = new JTextField();
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setFont(new Font("Dialog", Font.BOLD, 26));
		panel.add(resultado);
		resultado.setColumns(10);
	}

}
