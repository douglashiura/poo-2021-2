package Aulas;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaDeModalExtended extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JButton botao;
	
	public TelaDeModalExtended() {
		super("HelloWorld");		
		JLabel label = new JLabel("Hello World");
		botao = new JButton("Clique aqui");
		botao.addActionListener(this);
		getContentPane() .add(label);
		getContentPane() .add(botao);
		pack();
		setVisible(true);
	}
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Apertou");
				botao.setBackground(Color.blue); }
			
			public static void main(String[] args) {
			new TelaDeModal();
}}

				
 

		
