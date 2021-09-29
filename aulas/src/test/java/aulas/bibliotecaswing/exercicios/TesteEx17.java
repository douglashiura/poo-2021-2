package aulas.bibliotecaswing.exercicios;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class TesteEx17 extends JFrame{
	private static final long serialVersionUID = 1L;
	Ex17 abas = new Ex17();
	
	
	public TesteEx17() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		add(BorderLayout.CENTER, abas);
	}
	
	public static void main(String[] args) {
		new TesteEx17();
		
		
	}

}
