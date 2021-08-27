package br.ies.aula.jogo.cacaniquel.visao;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaGerenciamentoBotoes extends JFrame {

	public void iniciar() {
		
		TelaGerenciamentoBotoes frame = new TelaGerenciamentoBotoes();
		frame.setTitle("Titulo");
		frame.pack();
		frame.setVisible(true);
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		JLabel label = new JLabel("CAÇA-NÍQUEL");
		JLabel label2 = new JLabel("CAÇA-NÍQUEL");
		JButton botao2 = new JButton("girar alavanca");
		
	
		frame.getContentPane().add(label, BorderLayout.PAGE_START);
		frame.getContentPane().add(botao2, BorderLayout.LINE_END);
		frame.getContentPane().add(label2, BorderLayout.PAGE_END);


		
		
		
		
		
	}
	
	
	
}
