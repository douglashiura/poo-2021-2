package aulas.bibliotecaswing.exercicios;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex12 extends JFrame{
	private static final long serialVersionUID = 1L;
	JPanel painel = new JPanel();
	JButton botaoVerde = new JButton("Verde");
	JButton botaoAmarelo = new JButton("Amarelo");
	JButton botaoBranco = new JButton("Branco");

	
	public Ex12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 600);
		setVisible(true);
		
		
		botaoVerde.setSize(400,400);
		botaoVerde.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				painel.setBackground(Color.GREEN);
			}
		});
		
		botaoAmarelo.setSize(400,400);
		botaoAmarelo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				painel.setBackground(Color.YELLOW);
			}
		});
		
		botaoBranco.setSize(400,400);
		botaoBranco.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				painel.setBackground(Color.WHITE);
			}
		});
		

		painel.setLayout(new FlowLayout());
		painel.add(botaoVerde);
		painel.add(botaoAmarelo);
		painel.add(botaoBranco);

		add(painel);
		
		
		
	}

}
