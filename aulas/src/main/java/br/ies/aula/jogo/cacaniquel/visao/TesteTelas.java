package br.ies.aula.jogo.cacaniquel.visao;


import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ComponentListener;

import javax.swing.JFrame;

import br.ies.aula.jogo.cacaniquel.modelo.Jogador;


public class TesteTelas extends JFrame{
	private static final long serialVersionUID = 1L;
	private static TelaPrincipal telaPrincipal = new TelaPrincipal();
	private static TelaInicial telaInicial = new TelaInicial();
	private static Panel telaIniciall = new Panel();
	
	public TesteTelas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.black);
		setSize(700, 700);
		setVisible(true);
	}
		
	
	public static void main(String[] args) throws Exception {
		
		TesteTelas frame = new TesteTelas();

		frame.getContentPane().add(telaPrincipal);
		
	
	}
	

	
	
}